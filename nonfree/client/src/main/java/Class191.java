import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class191 implements Runnable {

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "I")
	private int anInt5475 = 0;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	private int anInt5478 = 0;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	private final int anInt5477;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class191(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt5477 = arg1 + 1;
		this.aByteArray64 = new byte[this.anInt5477];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public void method4687() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5478 >= this.anInt5475) {
						local27 = this.anInt5478 - this.anInt5475;
					} else {
						local27 = this.anInt5477 + this.anInt5478 - this.anInt5475;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (local27 + this.anInt5475 <= this.anInt5477) {
					this.anOutputStream1.write(this.aByteArray64, this.anInt5475, local27);
				} else {
					@Pc(81) int local81 = this.anInt5477 - this.anInt5475;
					this.anOutputStream1.write(this.aByteArray64, this.anInt5475, local81);
					this.anOutputStream1.write(this.aByteArray64, 0, local27 - local81);
				}
			} catch (@Pc(101) IOException local101) {
				@Pc(101) IOException local101x = local101;
				synchronized (this) {
					this.anIOException2 = local101x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5475 = (local27 + this.anInt5475) % this.anInt5477;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public void method4689() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([BIIB)V")
	public void method4690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(58) int local58;
			if (this.anInt5475 <= this.anInt5478) {
				local58 = this.anInt5477 + this.anInt5475 - this.anInt5478 - 1;
			} else {
				local58 = this.anInt5475 - this.anInt5478 - 1;
			}
			if (arg1 > local58) {
				throw new IOException("");
			}
			if (this.anInt5477 < this.anInt5478 + arg1) {
				@Pc(100) int local100 = this.anInt5477 - this.anInt5478;
				Static589.method5382(arg0, 0, this.aByteArray64, this.anInt5478, local100);
				Static589.method5382(arg0, local100, this.aByteArray64, 0, arg1 - local100);
			} else {
				Static589.method5382(arg0, 0, this.aByteArray64, this.anInt5478, arg1);
			}
			this.anInt5478 = (arg1 + this.anInt5478) % this.anInt5477;
			this.notifyAll();
		}
	}
}
