import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
	private int anInt1100 = 0;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	private int anInt1107 = 0;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	private final int anInt1108;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "[B")
	private final byte[] aByteArray24;

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class34(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1108 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray24 = new byte[this.anInt1108];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([BIII)I")
	public int method1098(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg2 + arg1) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(38) int local38;
			if (this.anInt1107 <= this.anInt1100) {
				local38 = this.anInt1100 - this.anInt1107;
			} else {
				local38 = this.anInt1100 + this.anInt1108 - this.anInt1107;
			}
			if (local38 < arg1) {
				arg1 = local38;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg1 + this.anInt1107 > this.anInt1108) {
				@Pc(97) int local97 = this.anInt1108 - this.anInt1107;
				Static466.method205(this.aByteArray24, this.anInt1107, arg0, arg2, local97);
				Static466.method205(this.aByteArray24, 0, arg0, arg2 + local97, arg1 + -local97);
			} else {
				Static466.method205(this.aByteArray24, this.anInt1107, arg0, arg2, arg1);
			}
			this.anInt1107 = (arg1 + this.anInt1107) % this.anInt1108;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Z")
	public boolean method1099(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt1108 <= arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt1107 <= this.anInt1100) {
				local45 = this.anInt1100 - this.anInt1107;
			} else {
				local45 = this.anInt1100 + this.anInt1108 - this.anInt1107;
			}
			if (local45 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public void method1101() {
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

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	public void method1102() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!cn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1107 == 0) {
						local34 = this.anInt1108 - this.anInt1100 - 1;
					} else if (this.anInt1107 < this.anInt1100) {
						local34 = this.anInt1108 - this.anInt1100;
					} else {
						local34 = this.anInt1107 - this.anInt1100 - 1;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(64) InterruptedException local64) {
					}
				}
			}
			@Pc(81) int local81;
			try {
				local81 = this.anInputStream1.read(this.aByteArray24, this.anInt1100, local34);
				if (local81 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(89) IOException local89) {
				@Pc(89) IOException local89x = local89;
				synchronized (this) {
					this.anIOException1 = local89x;
					return;
				}
			}
			synchronized (this) {
				this.anInt1100 = (local81 + this.anInt1100) % this.anInt1108;
			}
		}
	}
}
