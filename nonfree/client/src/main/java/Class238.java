import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class238 implements Runnable {

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
	private int anInt6085 = 0;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	private int anInt6083 = 0;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	private final int anInt6089;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class238(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt6089 = arg1 + 1;
		this.aByteArray64 = new byte[this.anInt6089];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public void method5166() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt6083 >= this.anInt6085) {
						local31 = this.anInt6083 - this.anInt6085;
					} else {
						local31 = this.anInt6089 + this.anInt6083 - this.anInt6085;
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
				if (local31 + this.anInt6085 <= this.anInt6089) {
					this.anOutputStream2.write(this.aByteArray64, this.anInt6085, local31);
				} else {
					@Pc(81) int local81 = this.anInt6089 - this.anInt6085;
					this.anOutputStream2.write(this.aByteArray64, this.anInt6085, local81);
					this.anOutputStream2.write(this.aByteArray64, 0, local31 - local81);
				}
			} catch (@Pc(101) IOException local101) {
				@Pc(101) IOException local101x = local101;
				synchronized (this) {
					this.anIOException1 = local101x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6085 = (local31 + this.anInt6085) % this.anInt6089;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public void method5168() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[BZI)V")
	public void method5171(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(64) int local64;
			if (this.anInt6083 < this.anInt6085) {
				local64 = this.anInt6085 - this.anInt6083 - 1;
			} else {
				local64 = this.anInt6089 + this.anInt6085 - this.anInt6083 - 1;
			}
			if (local64 < arg0) {
				throw new IOException("");
			}
			if (arg0 + this.anInt6083 > this.anInt6089) {
				@Pc(107) int local107 = this.anInt6089 - this.anInt6083;
				Static602.method1586(arg1, 0, this.aByteArray64, this.anInt6083, local107);
				Static602.method1586(arg1, local107, this.aByteArray64, 0, arg0 - local107);
			} else {
				Static602.method1586(arg1, 0, this.aByteArray64, this.anInt6083, arg0);
			}
			this.anInt6083 = (this.anInt6083 + arg0) % this.anInt6089;
			this.notifyAll();
		}
	}
}
