import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class108 implements Runnable {

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
	private int anInt3456 = 0;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
	private int anInt3455 = 0;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
	private final int anInt3457;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class108(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt3457 = arg1 + 1;
		this.aByteArray25 = new byte[this.anInt3457];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!fq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(33) int local33;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt3456 > this.anInt3455) {
						local33 = this.anInt3455 + this.anInt3457 - this.anInt3456;
					} else {
						local33 = this.anInt3455 - this.anInt3456;
					}
					if (local33 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(52) IOException local52) {
						this.anIOException1 = local52;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(62) InterruptedException local62) {
					}
				}
			}
			try {
				if (this.anInt3457 < local33 + this.anInt3456) {
					@Pc(88) int local88 = this.anInt3457 - this.anInt3456;
					this.anOutputStream1.write(this.aByteArray25, this.anInt3456, local88);
					this.anOutputStream1.write(this.aByteArray25, 0, local33 - local88);
				} else {
					this.anOutputStream1.write(this.aByteArray25, this.anInt3456, local33);
				}
			} catch (@Pc(117) IOException local117x) {
				@Pc(117) IOException local117 = local117x;
				synchronized (this) {
					this.anIOException1 = local117;
					return;
				}
			}
			synchronized (this) {
				this.anInt3456 = (this.anInt3456 + local33) % this.anInt3457;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V")
	public void method3153() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[BII)V")
	public void method3154(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(55) int local55;
			if (this.anInt3456 > this.anInt3455) {
				local55 = this.anInt3456 - this.anInt3455 - 1;
			} else {
				local55 = this.anInt3456 + this.anInt3457 - this.anInt3455 - 1;
			}
			if (arg1 > local55) {
				throw new IOException("");
			}
			if (this.anInt3455 + arg1 > this.anInt3457) {
				@Pc(95) int local95 = this.anInt3457 - this.anInt3455;
				Static684.method5324(arg0, 0, this.aByteArray25, this.anInt3455, local95);
				Static684.method5324(arg0, local95, this.aByteArray25, 0, arg1 - local95);
			} else {
				Static684.method5324(arg0, 0, this.aByteArray25, this.anInt3455, arg1);
			}
			this.anInt3455 = (arg1 + this.anInt3455) % this.anInt3457;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public void method3155() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
