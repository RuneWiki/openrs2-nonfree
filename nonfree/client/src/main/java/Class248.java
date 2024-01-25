import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class248 implements Runnable {

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	private int anInt6856 = 0;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	private int anInt6858 = 0;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	private final int anInt6861;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class248(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt6861 = arg1 + 1;
		this.aByteArray62 = new byte[this.anInt6861];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!nj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt6856 >= this.anInt6858) {
						local27 = this.anInt6856 - this.anInt6858;
					} else {
						local27 = this.anInt6856 + this.anInt6861 - this.anInt6858;
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
				if (local27 + this.anInt6858 > this.anInt6861) {
					@Pc(69) int local69 = this.anInt6861 - this.anInt6858;
					this.anOutputStream2.write(this.aByteArray62, this.anInt6858, local69);
					this.anOutputStream2.write(this.aByteArray62, 0, local27 - local69);
				} else {
					this.anOutputStream2.write(this.aByteArray62, this.anInt6858, local27);
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException1 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6858 = (local27 + this.anInt6858) % this.anInt6861;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method5729() {
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

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public void method5730() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIBI)V")
	public void method5732(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(56) int local56;
			if (this.anInt6858 > this.anInt6856) {
				local56 = this.anInt6858 - this.anInt6856 - 1;
			} else {
				local56 = this.anInt6858 + this.anInt6861 - this.anInt6856 - 1;
			}
			if (local56 < arg1) {
				throw new IOException("");
			}
			if (arg1 + this.anInt6856 > this.anInt6861) {
				@Pc(91) int local91 = this.anInt6861 - this.anInt6856;
				Static689.method8055(arg0, 0, this.aByteArray62, this.anInt6856, local91);
				Static689.method8055(arg0, local91, this.aByteArray62, 0, arg1 - local91);
			} else {
				Static689.method8055(arg0, 0, this.aByteArray62, this.anInt6856, arg1);
			}
			this.anInt6856 = (arg1 + this.anInt6856) % this.anInt6861;
			this.notifyAll();
		}
	}
}
