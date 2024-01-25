import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class169 implements Runnable {

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
	private int anInt4967 = 0;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
	private int anInt4971 = 0;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
	private final int anInt4970;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class169(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt4970 = arg1 + 1;
		this.aByteArray76 = new byte[this.anInt4970];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public void method4300() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method4301() {
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

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III[B)V")
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(67) int local67;
			if (this.anInt4971 <= this.anInt4967) {
				local67 = this.anInt4970 + this.anInt4971 - this.anInt4967 - 1;
			} else {
				local67 = this.anInt4971 - this.anInt4967 - 1;
			}
			if (local67 < arg0) {
				throw new IOException("");
			}
			if (this.anInt4970 < this.anInt4967 + arg0) {
				@Pc(104) int local104 = this.anInt4970 - this.anInt4967;
				Static551.method3488(arg1, 0, this.aByteArray76, this.anInt4967, local104);
				Static551.method3488(arg1, local104, this.aByteArray76, 0, arg0 - local104);
			} else {
				Static551.method3488(arg1, 0, this.aByteArray76, this.anInt4967, arg0);
			}
			this.anInt4967 = (this.anInt4967 + arg0) % this.anInt4970;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ko", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4967 >= this.anInt4971) {
						local27 = this.anInt4967 - this.anInt4971;
					} else {
						local27 = this.anInt4970 + this.anInt4967 - this.anInt4971;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(45) InterruptedException local45) {
					}
				}
			}
			try {
				if (this.anInt4970 >= this.anInt4971 + local27) {
					this.anOutputStream1.write(this.aByteArray76, this.anInt4971, local27);
				} else {
					@Pc(77) int local77 = this.anInt4970 - this.anInt4971;
					this.anOutputStream1.write(this.aByteArray76, this.anInt4971, local77);
					this.anOutputStream1.write(this.aByteArray76, 0, local27 - local77);
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException1 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4971 = (this.anInt4971 + local27) % this.anInt4970;
			}
		}
	}
}
