import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class128 implements Runnable {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
	private int anInt3255 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
	private int anInt3249 = 0;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	private final int anInt3253;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class128(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt3253 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray28 = new byte[this.anInt3253];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public void method2799() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!gl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt3249 <= this.anInt3255) {
						local27 = this.anInt3255 - this.anInt3249;
					} else {
						local27 = this.anInt3255 + this.anInt3253 - this.anInt3249;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (local27 + this.anInt3249 > this.anInt3253) {
					@Pc(74) int local74 = this.anInt3253 - this.anInt3249;
					this.anOutputStream1.write(this.aByteArray28, this.anInt3249, local74);
					this.anOutputStream1.write(this.aByteArray28, 0, local27 - local74);
				} else {
					this.anOutputStream1.write(this.aByteArray28, this.anInt3249, local27);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException1 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt3249 = (local27 + this.anInt3249) % this.anInt3253;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI[BI)V")
	public void method2800(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(60) int local60;
			if (this.anInt3249 > this.anInt3255) {
				local60 = this.anInt3249 - this.anInt3255 - 1;
			} else {
				local60 = this.anInt3253 + this.anInt3249 - this.anInt3255 - 1;
			}
			if (local60 < arg0) {
				throw new IOException("");
			}
			if (this.anInt3255 + arg0 > this.anInt3253) {
				@Pc(102) int local102 = this.anInt3253 - this.anInt3255;
				Static652.method4548(arg1, 0, this.aByteArray28, this.anInt3255, local102);
				Static652.method4548(arg1, local102, this.aByteArray28, 0, arg0 - local102);
			} else {
				Static652.method4548(arg1, 0, this.aByteArray28, this.anInt3255, arg0);
			}
			this.anInt3255 = (this.anInt3255 + arg0) % this.anInt3253;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method2801() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}
}
