import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class297 implements Runnable {

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "I")
	private int anInt9030 = 0;

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "I")
	private int anInt9034 = 0;

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
	private final int anInt9036;

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "[B")
	private final byte[] aByteArray118;

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class297(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt9036 = arg1 + 1;
		this.aByteArray118 = new byte[this.anInt9036];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!rha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9034 < this.anInt9030) {
						local35 = this.anInt9036 + this.anInt9034 - this.anInt9030;
					} else {
						local35 = this.anInt9034 - this.anInt9030;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(52) InterruptedException local52) {
					}
				}
			}
			try {
				if (this.anInt9036 >= this.anInt9030 + local35) {
					this.anOutputStream2.write(this.aByteArray118, this.anInt9030, local35);
				} else {
					@Pc(85) int local85 = this.anInt9036 - this.anInt9030;
					this.anOutputStream2.write(this.aByteArray118, this.anInt9030, local85);
					this.anOutputStream2.write(this.aByteArray118, 0, local35 - local85);
				}
			} catch (@Pc(105) IOException local105) {
				@Pc(105) IOException local105x = local105;
				synchronized (this) {
					this.anIOException2 = local105x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9030 = (this.anInt9030 + local35) % this.anInt9036;
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)V")
	public void method7588() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
	public void method7589() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BII[B)V")
	public void method7590(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(53) int local53;
			if (this.anInt9030 <= this.anInt9034) {
				local53 = this.anInt9030 + this.anInt9036 - this.anInt9034 - 1;
			} else {
				local53 = this.anInt9030 - this.anInt9034 - 1;
			}
			if (local53 < arg0) {
				throw new IOException("");
			}
			if (arg0 + this.anInt9034 > this.anInt9036) {
				@Pc(91) int local91 = this.anInt9036 - this.anInt9034;
				Static653.method7723(arg1, 0, this.aByteArray118, this.anInt9034, local91);
				Static653.method7723(arg1, local91, this.aByteArray118, 0, arg0 - local91);
			} else {
				Static653.method7723(arg1, 0, this.aByteArray118, this.anInt9034, arg0);
			}
			this.anInt9034 = (arg0 + this.anInt9034) % this.anInt9036;
			this.notifyAll();
		}
	}
}
