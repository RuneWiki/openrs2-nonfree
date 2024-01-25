import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class251 implements Runnable {

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
	private int anInt6628 = 0;

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
	private int anInt6629 = 0;

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
	private final int anInt6634;

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class251(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt6634 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray75 = new byte[this.anInt6634];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B[BII)V")
	public void method5789(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (arg1 < 0 || 0 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(55) int local55;
			if (this.anInt6628 < this.anInt6629) {
				local55 = this.anInt6629 - this.anInt6628 - 1;
			} else {
				local55 = this.anInt6629 + this.anInt6634 - this.anInt6628 - 1;
			}
			if (arg1 > local55) {
				throw new IOException("");
			}
			if (arg1 + this.anInt6628 <= this.anInt6634) {
				Static693.method8320(arg0, 0, this.aByteArray75, this.anInt6628, arg1);
			} else {
				@Pc(110) int local110 = this.anInt6634 - this.anInt6628;
				Static693.method8320(arg0, 0, this.aByteArray75, this.anInt6628, local110);
				Static693.method8320(arg0, local110, this.aByteArray75, 0, arg1 - local110);
			}
			this.anInt6628 = (arg1 + this.anInt6628) % this.anInt6634;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(38) int local38;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt6628 < this.anInt6629) {
						local38 = this.anInt6634 + this.anInt6628 - this.anInt6629;
					} else {
						local38 = this.anInt6628 - this.anInt6629;
					}
					if (local38 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(54) IOException local54) {
						this.anIOException1 = local54;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(64) InterruptedException local64) {
					}
				}
			}
			try {
				if (local38 + this.anInt6629 <= this.anInt6634) {
					this.anOutputStream2.write(this.aByteArray75, this.anInt6629, local38);
				} else {
					@Pc(97) int local97 = this.anInt6634 - this.anInt6629;
					this.anOutputStream2.write(this.aByteArray75, this.anInt6629, local97);
					this.anOutputStream2.write(this.aByteArray75, 0, local38 - local97);
				}
			} catch (@Pc(116) IOException local116x) {
				@Pc(116) IOException local116 = local116x;
				synchronized (this) {
					this.anIOException1 = local116;
					return;
				}
			}
			synchronized (this) {
				this.anInt6629 = (this.anInt6629 + local38) % this.anInt6634;
			}
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V")
	public void method5792() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)V")
	public void method5793() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}
}
