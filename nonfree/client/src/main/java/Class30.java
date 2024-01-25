import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class30 implements Runnable {

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
	private int anInt884 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	private int anInt879 = 0;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	private final int anInt883;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "[B")
	private final byte[] aByteArray7;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class30(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt883 = arg1 + 1;
		this.aByteArray7 = new byte[this.anInt883];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[BI)V")
	public void method762(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(50) int local50;
			if (this.anInt884 > this.anInt879) {
				local50 = this.anInt884 - this.anInt879 - 1;
			} else {
				local50 = this.anInt884 + this.anInt883 - this.anInt879 - 1;
			}
			if (local50 < arg0) {
				throw new IOException("");
			}
			if (this.anInt883 >= arg0 + this.anInt879) {
				Static598.method774(arg1, 0, this.aByteArray7, this.anInt879, arg0);
			} else {
				@Pc(99) int local99 = this.anInt883 - this.anInt879;
				Static598.method774(arg1, 0, this.aByteArray7, this.anInt879, local99);
				Static598.method774(arg1, local99, this.aByteArray7, 0, arg0 - local99);
			}
			this.anInt879 = (arg0 + this.anInt879) % this.anInt883;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt884 > this.anInt879) {
						local29 = this.anInt879 + this.anInt883 - this.anInt884;
					} else {
						local29 = this.anInt879 - this.anInt884;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(47) InterruptedException local47) {
					}
				}
			}
			try {
				if (this.anInt884 + local29 > this.anInt883) {
					@Pc(69) int local69 = this.anInt883 - this.anInt884;
					this.anOutputStream1.write(this.aByteArray7, this.anInt884, local69);
					this.anOutputStream1.write(this.aByteArray7, 0, local29 - local69);
				} else {
					this.anOutputStream1.write(this.aByteArray7, this.anInt884, local29);
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException1 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt884 = (local29 + this.anInt884) % this.anInt883;
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V")
	public void method766() {
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

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public void method768() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
