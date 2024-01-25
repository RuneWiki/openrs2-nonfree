import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class70 implements Runnable {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
	private int anInt1836 = 0;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
	private int anInt1832 = 0;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
	private final int anInt1840;

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class70(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1840 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray17 = new byte[this.anInt1840];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ev", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1832 >= this.anInt1836) {
						local31 = this.anInt1832 - this.anInt1836;
					} else {
						local31 = this.anInt1840 + this.anInt1832 - this.anInt1836;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (this.anInt1836 + local31 <= this.anInt1840) {
					this.anOutputStream1.write(this.aByteArray17, this.anInt1836, local31);
				} else {
					@Pc(85) int local85 = this.anInt1840 - this.anInt1836;
					this.anOutputStream1.write(this.aByteArray17, this.anInt1836, local85);
					this.anOutputStream1.write(this.aByteArray17, 0, local31 - local85);
				}
			} catch (@Pc(105) IOException local105) {
				@Pc(105) IOException local105x = local105;
				synchronized (this) {
					this.anIOException1 = local105x;
					return;
				}
			}
			synchronized (this) {
				this.anInt1836 = (local31 + this.anInt1836) % this.anInt1840;
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
	public void method1498() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II[BI)V")
	public void method1499(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(59) int local59;
			if (this.anInt1832 < this.anInt1836) {
				local59 = this.anInt1836 - this.anInt1832 - 1;
			} else {
				local59 = this.anInt1840 + this.anInt1836 - this.anInt1832 - 1;
			}
			if (arg0 > local59) {
				throw new IOException("");
			}
			if (this.anInt1832 + arg0 > this.anInt1840) {
				@Pc(101) int local101 = this.anInt1840 - this.anInt1832;
				Static468.method3858(arg1, 0, this.aByteArray17, this.anInt1832, local101);
				Static468.method3858(arg1, local101, this.aByteArray17, 0, arg0 - local101);
			} else {
				Static468.method3858(arg1, 0, this.aByteArray17, this.anInt1832, arg0);
			}
			this.anInt1832 = (arg0 + this.anInt1832) % this.anInt1840;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
	public void method1501() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}
}
