import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class122 implements Runnable {

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
	private int anInt3529 = 0;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
	private int anInt3532 = 0;

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
	private final int anInt3527;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class122(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt3527 = arg1 + 1;
		this.aByteArray35 = new byte[this.anInt3527];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II[BI)V")
	public void method2911(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(61) int local61;
			if (this.anInt3532 >= this.anInt3529) {
				local61 = this.anInt3527 + this.anInt3529 - this.anInt3532 - 1;
			} else {
				local61 = this.anInt3529 - this.anInt3532 - 1;
			}
			if (arg1 > local61) {
				throw new IOException("");
			}
			if (arg1 + this.anInt3532 <= this.anInt3527) {
				Static598.method1137(arg0, 0, this.aByteArray35, this.anInt3532, arg1);
			} else {
				@Pc(108) int local108 = this.anInt3527 - this.anInt3532;
				Static598.method1137(arg0, 0, this.aByteArray35, this.anInt3532, local108);
				Static598.method1137(arg0, local108, this.aByteArray35, 0, arg1 - local108);
			}
			this.anInt3532 = (this.anInt3532 + arg1) % this.anInt3527;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!gea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt3532 < this.anInt3529) {
						local34 = this.anInt3532 + this.anInt3527 - this.anInt3529;
					} else {
						local34 = this.anInt3532 - this.anInt3529;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (this.anInt3529 + local34 > this.anInt3527) {
					@Pc(75) int local75 = this.anInt3527 - this.anInt3529;
					this.anOutputStream1.write(this.aByteArray35, this.anInt3529, local75);
					this.anOutputStream1.write(this.aByteArray35, 0, local34 - local75);
				} else {
					this.anOutputStream1.write(this.aByteArray35, this.anInt3529, local34);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException2 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt3529 = (this.anInt3529 + local34) % this.anInt3527;
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public void method2913() {
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

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V")
	public void method2914() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
