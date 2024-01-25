import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class151 implements Runnable {

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
	private int anInt4538 = 0;

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
	private int anInt4540 = 0;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
	private final int anInt4536;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "[B")
	private final byte[] aByteArray41;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class151(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt4536 = arg1 + 1;
		this.aByteArray41 = new byte[this.anInt4536];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!hp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt4540 > this.anInt4538) {
						local34 = this.anInt4538 + this.anInt4536 - this.anInt4540;
					} else {
						local34 = this.anInt4538 - this.anInt4540;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(52) InterruptedException local52) {
					}
				}
			}
			try {
				if (this.anInt4540 + local34 > this.anInt4536) {
					@Pc(74) int local74 = this.anInt4536 - this.anInt4540;
					this.anOutputStream1.write(this.aByteArray41, this.anInt4540, local74);
					this.anOutputStream1.write(this.aByteArray41, 0, local34 - local74);
				} else {
					this.anOutputStream1.write(this.aByteArray41, this.anInt4540, local34);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException2 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4540 = (local34 + this.anInt4540) % this.anInt4536;
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public void method3749() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI[BI)V")
	public void method3751(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(58) int local58;
			if (this.anInt4538 >= this.anInt4540) {
				local58 = this.anInt4540 + this.anInt4536 - this.anInt4538 - 1;
			} else {
				local58 = this.anInt4540 - this.anInt4538 - 1;
			}
			if (local58 < arg0) {
				throw new IOException("");
			}
			if (this.anInt4536 < this.anInt4538 + arg0) {
				@Pc(105) int local105 = this.anInt4536 - this.anInt4538;
				Static649.method4863(arg1, 0, this.aByteArray41, this.anInt4538, local105);
				Static649.method4863(arg1, local105, this.aByteArray41, 0, arg0 - local105);
			} else {
				Static649.method4863(arg1, 0, this.aByteArray41, this.anInt4538, arg0);
			}
			this.anInt4538 = (this.anInt4538 + arg0) % this.anInt4536;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
	public void method3753() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
