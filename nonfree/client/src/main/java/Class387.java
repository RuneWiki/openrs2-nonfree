import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class387 implements Runnable {

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
	private int anInt10418 = 0;

	@OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
	private int anInt10419 = 0;

	@OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
	private final int anInt10420;

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!wha", name = "g", descriptor = "[B")
	private final byte[] aByteArray105;

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class387(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt10420 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray105 = new byte[this.anInt10420];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!wha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10419 > this.anInt10418) {
						local34 = this.anInt10418 + this.anInt10420 - this.anInt10419;
					} else {
						local34 = this.anInt10418 - this.anInt10419;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(50) IOException local50) {
						this.anIOException2 = local50;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(60) InterruptedException local60) {
					}
				}
			}
			try {
				if (local34 + this.anInt10419 > this.anInt10420) {
					@Pc(82) int local82 = this.anInt10420 - this.anInt10419;
					this.anOutputStream1.write(this.aByteArray105, this.anInt10419, local82);
					this.anOutputStream1.write(this.aByteArray105, 0, local34 - local82);
				} else {
					this.anOutputStream1.write(this.aByteArray105, this.anInt10419, local34);
				}
			} catch (@Pc(111) IOException local111x) {
				@Pc(111) IOException local111 = local111x;
				synchronized (this) {
					this.anIOException2 = local111;
					return;
				}
			}
			synchronized (this) {
				this.anInt10419 = (this.anInt10419 + local34) % this.anInt10420;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "([BIII)V")
	public void method8792(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(63) int local63;
			if (this.anInt10419 > this.anInt10418) {
				local63 = this.anInt10419 - this.anInt10418 - 1;
			} else {
				local63 = this.anInt10420 + this.anInt10419 - this.anInt10418 - 1;
			}
			if (local63 < arg1) {
				throw new IOException("");
			}
			if (this.anInt10420 < arg1 + this.anInt10418) {
				@Pc(100) int local100 = this.anInt10420 - this.anInt10418;
				Static685.method6464(arg0, 0, this.aByteArray105, this.anInt10418, local100);
				Static685.method6464(arg0, local100, this.aByteArray105, 0, arg1 - local100);
			} else {
				Static685.method6464(arg0, 0, this.aByteArray105, this.anInt10418, arg1);
			}
			this.anInt10418 = (this.anInt10418 + arg1) % this.anInt10420;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
	public void method8793() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V")
	public void method8794() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
