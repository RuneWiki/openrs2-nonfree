import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class182 implements Runnable {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	private int anInt4936 = 0;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	private int anInt4935 = 0;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	private final int anInt4940;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "[B")
	private final byte[] aByteArray73;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class182(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt4940 = arg1 + 1;
		this.aByteArray73 = new byte[this.anInt4940];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!oe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4936 >= this.anInt4935) {
						local30 = this.anInt4936 - this.anInt4935;
					} else {
						local30 = this.anInt4940 + this.anInt4936 - this.anInt4935;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(49) InterruptedException local49) {
					}
				}
			}
			try {
				if (this.anInt4935 + local30 > this.anInt4940) {
					@Pc(74) int local74 = this.anInt4940 - this.anInt4935;
					this.anOutputStream1.write(this.aByteArray73, this.anInt4935, local74);
					this.anOutputStream1.write(this.aByteArray73, 0, local30 - local74);
				} else {
					this.anOutputStream1.write(this.aByteArray73, this.anInt4935, local30);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException1 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4935 = (this.anInt4935 + local30) % this.anInt4940;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public void method3936() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[BIB)V")
	public void method3937(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(52) int local52;
			if (this.anInt4935 > this.anInt4936) {
				local52 = this.anInt4935 - this.anInt4936 - 1;
			} else {
				local52 = this.anInt4935 + this.anInt4940 - this.anInt4936 - 1;
			}
			if (local52 < arg1) {
				throw new IOException("");
			}
			if (arg1 + this.anInt4936 <= this.anInt4940) {
				Static471.method3062(arg0, 0, this.aByteArray73, this.anInt4936, arg1);
			} else {
				@Pc(111) int local111 = this.anInt4940 - this.anInt4936;
				Static471.method3062(arg0, 0, this.aByteArray73, this.anInt4936, local111);
				Static471.method3062(arg0, local111, this.aByteArray73, 0, arg1 - local111);
			}
			this.anInt4936 = (this.anInt4936 + arg1) % this.anInt4940;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public void method3938() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}
}
