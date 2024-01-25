import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class341 implements Runnable {

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	private int anInt9838 = 0;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
	private int anInt9840 = 0;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	private final int anInt9845;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[B")
	private final byte[] aByteArray107;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class341(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt9845 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray107 = new byte[this.anInt9845];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BIB)I")
	public int method8032(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg0 + arg2 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt9840 <= this.anInt9838) {
				local41 = this.anInt9838 - this.anInt9840;
			} else {
				local41 = this.anInt9838 + this.anInt9845 - this.anInt9840;
			}
			if (local41 < arg0) {
				arg0 = local41;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt9845 >= arg0 + this.anInt9840) {
				Static597.method3730(this.aByteArray107, this.anInt9840, arg1, arg2, arg0);
			} else {
				@Pc(106) int local106 = this.anInt9845 - this.anInt9840;
				Static597.method3730(this.aByteArray107, this.anInt9840, arg1, arg2, local106);
				Static597.method3730(this.aByteArray107, 0, arg1, local106 + arg2, arg0 + -local106);
			}
			this.anInt9840 = (this.anInt9840 + arg0) % this.anInt9845;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)Z")
	public boolean method8033(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt9845) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt9838 < this.anInt9840) {
				local45 = this.anInt9838 + this.anInt9845 - this.anInt9840;
			} else {
				local45 = this.anInt9838 - this.anInt9840;
			}
			if (arg0 <= local45) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9840 == 0) {
						local27 = this.anInt9845 - this.anInt9838 - 1;
					} else if (this.anInt9840 < this.anInt9838) {
						local27 = this.anInt9845 - this.anInt9838;
					} else {
						local27 = this.anInt9840 - this.anInt9838 - 1;
					}
					if (local27 > 0) {
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
				local81 = this.anInputStream2.read(this.aByteArray107, this.anInt9838, local27);
				if (local81 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(89) IOException local89) {
				@Pc(89) IOException local89x = local89;
				synchronized (this) {
					this.anIOException2 = local89x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9838 = (local81 + this.anInt9838) % this.anInt9845;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public void method8035() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public void method8036() {
		this.anInputStream2 = new InputStream_Sub2();
	}
}
