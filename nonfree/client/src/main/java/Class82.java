import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class82 implements Runnable {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	private int anInt2693 = 0;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	private int anInt2696 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	private final int anInt2700;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class82(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt2700 = arg1 + 1;
		this.aByteArray57 = new byte[this.anInt2700];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	public boolean method2265(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt2700) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt2696 <= this.anInt2693) {
				local41 = this.anInt2693 - this.anInt2696;
			} else {
				local41 = this.anInt2700 + this.anInt2693 - this.anInt2696;
			}
			if (arg0 <= local41) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method2267() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)I")
	public int method2268(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg2 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt2696 > this.anInt2693) {
				local48 = this.anInt2700 + this.anInt2693 - this.anInt2696;
			} else {
				local48 = this.anInt2693 - this.anInt2696;
			}
			if (local48 < arg1) {
				arg1 = local48;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt2700 >= this.anInt2696 + arg1) {
				Static604.method6225(this.aByteArray57, this.anInt2696, arg0, arg2, arg1);
			} else {
				@Pc(103) int local103 = this.anInt2700 - this.anInt2696;
				Static604.method6225(this.aByteArray57, this.anInt2696, arg0, arg2, local103);
				Static604.method6225(this.aByteArray57, 0, arg0, arg2 + local103, arg1 + -local103);
			}
			this.anInt2696 = (arg1 + this.anInt2696) % this.anInt2700;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(32) int local32;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt2696 == 0) {
						local32 = this.anInt2700 - this.anInt2693 - 1;
					} else if (this.anInt2696 < this.anInt2693) {
						local32 = this.anInt2700 - this.anInt2693;
					} else {
						local32 = this.anInt2696 - this.anInt2693 - 1;
					}
					if (local32 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(62) InterruptedException local62) {
					}
				}
			}
			@Pc(79) int local79;
			try {
				local79 = this.anInputStream2.read(this.aByteArray57, this.anInt2693, local32);
				if (local79 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(87) IOException local87) {
				@Pc(87) IOException local87x = local87;
				synchronized (this) {
					this.anIOException1 = local87x;
					return;
				}
			}
			synchronized (this) {
				this.anInt2693 = (local79 + this.anInt2693) % this.anInt2700;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public void method2269() {
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
}
