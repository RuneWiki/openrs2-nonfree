import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class62 implements Runnable {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	private int anInt1834 = 0;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	private int anInt1837 = 0;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private final int anInt1838;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class62(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt1838 = arg1 + 1;
		this.aByteArray23 = new byte[this.anInt1838];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1834 >= this.anInt1837) {
						local31 = this.anInt1834 - this.anInt1837;
					} else {
						local31 = this.anInt1838 + this.anInt1834 - this.anInt1837;
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
				if (this.anInt1838 >= this.anInt1837 + local31) {
					this.anOutputStream1.write(this.aByteArray23, this.anInt1837, local31);
				} else {
					@Pc(81) int local81 = this.anInt1838 - this.anInt1837;
					this.anOutputStream1.write(this.aByteArray23, this.anInt1837, local81);
					this.anOutputStream1.write(this.aByteArray23, 0, local31 - local81);
				}
			} catch (@Pc(100) IOException local100) {
				@Pc(100) IOException local100x = local100;
				synchronized (this) {
					this.anIOException1 = local100x;
					return;
				}
			}
			synchronized (this) {
				this.anInt1837 = (local31 + this.anInt1837) % this.anInt1838;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II[BI)V")
	public void method1673(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(61) int local61;
			if (this.anInt1837 <= this.anInt1834) {
				local61 = this.anInt1838 + this.anInt1837 - this.anInt1834 - 1;
			} else {
				local61 = this.anInt1837 - this.anInt1834 - 1;
			}
			if (arg1 > local61) {
				throw new IOException("");
			}
			if (this.anInt1834 + arg1 > this.anInt1838) {
				@Pc(95) int local95 = this.anInt1838 - this.anInt1834;
				Static601.method2816(arg0, 0, this.aByteArray23, this.anInt1834, local95);
				Static601.method2816(arg0, local95, this.aByteArray23, 0, arg1 - local95);
			} else {
				Static601.method2816(arg0, 0, this.aByteArray23, this.anInt1834, arg1);
			}
			this.anInt1834 = (arg1 + this.anInt1834) % this.anInt1838;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public void method1675() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public void method1676() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
