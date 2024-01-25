import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class247 implements Runnable {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	private int anInt6528 = 0;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	private int anInt6535 = 0;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	private final int anInt6532;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[B")
	private final byte[] aByteArray88;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class247(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt6532 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray88 = new byte[this.anInt6532];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public void method5237() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt6528 == 0) {
						local29 = this.anInt6532 - this.anInt6535 - 1;
					} else if (this.anInt6535 <= this.anInt6528) {
						local29 = this.anInt6528 - this.anInt6535 - 1;
					} else {
						local29 = this.anInt6532 - this.anInt6535;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(60) InterruptedException local60) {
					}
				}
			}
			@Pc(77) int local77;
			try {
				local77 = this.anInputStream2.read(this.aByteArray88, this.anInt6535, local29);
				if (local77 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException2 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6535 = (this.anInt6535 + local77) % this.anInt6532;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z")
	public boolean method5238(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt6532) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(43) int local43;
			if (this.anInt6528 <= this.anInt6535) {
				local43 = this.anInt6535 - this.anInt6528;
			} else {
				local43 = this.anInt6532 + this.anInt6535 - this.anInt6528;
			}
			if (arg0 <= local43) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public void method5240() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[BZI)I")
	public int method5242(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg1.length < arg0 + arg2) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(54) int local54;
			if (this.anInt6535 < this.anInt6528) {
				local54 = this.anInt6532 + this.anInt6535 - this.anInt6528;
			} else {
				local54 = this.anInt6535 - this.anInt6528;
			}
			if (local54 < arg0) {
				arg0 = local54;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt6532 < arg0 + this.anInt6528) {
				@Pc(98) int local98 = this.anInt6532 - this.anInt6528;
				Static471.method3062(this.aByteArray88, this.anInt6528, arg1, arg2, local98);
				Static471.method3062(this.aByteArray88, 0, arg1, local98 + arg2, -local98 + arg0);
			} else {
				Static471.method3062(this.aByteArray88, this.anInt6528, arg1, arg2, arg0);
			}
			this.anInt6528 = (arg0 + this.anInt6528) % this.anInt6532;
			this.notifyAll();
			return arg0;
		}
	}
}
