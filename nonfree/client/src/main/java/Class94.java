import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class94 implements Runnable {

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	private int anInt2942 = 0;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	private int anInt2943 = 0;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	private final int anInt2945;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class94(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt2945 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray32 = new byte[this.anInt2945];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIII)V")
	public void method2624(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(61) int local61;
			if (this.anInt2943 < this.anInt2942) {
				local61 = this.anInt2942 - this.anInt2943 - 1;
			} else {
				local61 = this.anInt2945 + this.anInt2942 - this.anInt2943 - 1;
			}
			if (local61 < arg1) {
				throw new IOException("");
			}
			if (this.anInt2945 < arg1 + this.anInt2943) {
				@Pc(104) int local104 = this.anInt2945 - this.anInt2943;
				Static474.method3327(arg0, 0, this.aByteArray32, this.anInt2943, local104);
				Static474.method3327(arg0, local104, this.aByteArray32, 0, arg1 - local104);
			} else {
				Static474.method3327(arg0, 0, this.aByteArray32, this.anInt2943, arg1);
			}
			this.anInt2943 = (arg1 + this.anInt2943) % this.anInt2945;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!hd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt2943 < this.anInt2942) {
						local30 = this.anInt2945 + this.anInt2943 - this.anInt2942;
					} else {
						local30 = this.anInt2943 - this.anInt2942;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(44) InterruptedException local44) {
					}
				}
			}
			try {
				if (this.anInt2945 >= local30 + this.anInt2942) {
					this.anOutputStream2.write(this.aByteArray32, this.anInt2942, local30);
				} else {
					@Pc(80) int local80 = this.anInt2945 - this.anInt2942;
					this.anOutputStream2.write(this.aByteArray32, this.anInt2942, local80);
					this.anOutputStream2.write(this.aByteArray32, 0, local30 - local80);
				}
			} catch (@Pc(99) IOException local99) {
				@Pc(99) IOException local99x = local99;
				synchronized (this) {
					this.anIOException1 = local99x;
					return;
				}
			}
			synchronized (this) {
				this.anInt2942 = (local30 + this.anInt2942) % this.anInt2945;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public void method2625() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public void method2627() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}
}
