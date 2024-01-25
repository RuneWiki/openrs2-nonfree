import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class305 implements Runnable {

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private int anInt8354 = 0;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	private int anInt8359 = 0;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	private final int anInt8361;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class305(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt8361 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray89 = new byte[this.anInt8361];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method6957() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BIIB)V")
	public void method6959(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(57) int local57;
			if (this.anInt8359 >= this.anInt8354) {
				local57 = this.anInt8354 + this.anInt8361 - this.anInt8359 - 1;
			} else {
				local57 = this.anInt8354 - this.anInt8359 - 1;
			}
			if (arg1 > local57) {
				throw new IOException("");
			}
			if (this.anInt8359 + arg1 <= this.anInt8361) {
				Static600.method3768(arg0, 0, this.aByteArray89, this.anInt8359, arg1);
			} else {
				@Pc(108) int local108 = this.anInt8361 - this.anInt8359;
				Static600.method3768(arg0, 0, this.aByteArray89, this.anInt8359, local108);
				Static600.method3768(arg0, local108, this.aByteArray89, 0, arg1 - local108);
			}
			this.anInt8359 = (this.anInt8359 + arg1) % this.anInt8361;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	public void method6960() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!tb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8359 >= this.anInt8354) {
						local30 = this.anInt8359 - this.anInt8354;
					} else {
						local30 = this.anInt8359 + this.anInt8361 - this.anInt8354;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (local30 + this.anInt8354 > this.anInt8361) {
					@Pc(74) int local74 = this.anInt8361 - this.anInt8354;
					this.anOutputStream1.write(this.aByteArray89, this.anInt8354, local74);
					this.anOutputStream1.write(this.aByteArray89, 0, local30 - local74);
				} else {
					this.anOutputStream1.write(this.aByteArray89, this.anInt8354, local30);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException2 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8354 = (this.anInt8354 + local30) % this.anInt8361;
			}
		}
	}
}
