import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class262 implements Runnable {

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
	private int anInt6773 = 0;

	@OriginalMember(owner = "client!nha", name = "m", descriptor = "I")
	private int anInt6771 = 0;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "I")
	private final int anInt6769;

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nha", name = "o", descriptor = "[B")
	private final byte[] aByteArray61;

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class262(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt6769 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray61 = new byte[this.anInt6769];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II[BI)V")
	public void method5853(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || 0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(68) int local68;
			if (this.anInt6771 >= this.anInt6773) {
				local68 = this.anInt6773 + this.anInt6769 - this.anInt6771 - 1;
			} else {
				local68 = this.anInt6773 - this.anInt6771 - 1;
			}
			if (local68 < arg0) {
				throw new IOException("");
			}
			if (this.anInt6771 + arg0 <= this.anInt6769) {
				Static732.method6320(arg1, 0, this.aByteArray61, this.anInt6771, arg0);
			} else {
				@Pc(117) int local117 = this.anInt6769 - this.anInt6771;
				Static732.method6320(arg1, 0, this.aByteArray61, this.anInt6771, local117);
				Static732.method6320(arg1, local117, this.aByteArray61, 0, arg0 - local117);
			}
			this.anInt6771 = (arg0 + this.anInt6771) % this.anInt6769;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	public void method5855() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!nha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt6771 >= this.anInt6773) {
						local34 = this.anInt6771 - this.anInt6773;
					} else {
						local34 = this.anInt6769 + this.anInt6771 - this.anInt6773;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
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
				if (local34 + this.anInt6773 <= this.anInt6769) {
					this.anOutputStream1.write(this.aByteArray61, this.anInt6773, local34);
				} else {
					@Pc(97) int local97 = this.anInt6769 - this.anInt6773;
					this.anOutputStream1.write(this.aByteArray61, this.anInt6773, local97);
					this.anOutputStream1.write(this.aByteArray61, 0, local34 - local97);
				}
			} catch (@Pc(117) IOException local117x) {
				@Pc(117) IOException local117 = local117x;
				synchronized (this) {
					this.anIOException1 = local117;
					return;
				}
			}
			synchronized (this) {
				this.anInt6773 = (local34 + this.anInt6773) % this.anInt6769;
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V")
	public void method5856() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}
}
