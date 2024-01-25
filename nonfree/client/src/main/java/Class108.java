import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class108 implements Runnable {

	@OriginalMember(owner = "client!go", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	private int anInt3642 = 0;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	private int anInt3648 = 0;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	private final int anInt3640;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class108(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt3640 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray58 = new byte[this.anInt3640];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB[B)I")
	public int method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg2.length < arg0 + arg1) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(50) int local50;
			if (this.anInt3642 >= this.anInt3648) {
				local50 = this.anInt3642 - this.anInt3648;
			} else {
				local50 = this.anInt3640 + this.anInt3642 - this.anInt3648;
			}
			if (local50 < arg1) {
				arg1 = local50;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt3640 >= arg1 + this.anInt3648) {
				Static555.method5095(this.aByteArray58, this.anInt3648, arg2, arg0, arg1);
			} else {
				@Pc(106) int local106 = this.anInt3640 - this.anInt3648;
				Static555.method5095(this.aByteArray58, this.anInt3648, arg2, arg0, local106);
				Static555.method5095(this.aByteArray58, 0, arg2, arg0 + local106, arg1 + -local106);
			}
			this.anInt3648 = (this.anInt3648 + arg1) % this.anInt3640;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!go", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(37) int local37;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt3648 == 0) {
						local37 = this.anInt3640 - this.anInt3642 - 1;
					} else if (this.anInt3642 > this.anInt3648) {
						local37 = this.anInt3640 - this.anInt3642;
					} else {
						local37 = this.anInt3648 - this.anInt3642 - 1;
					}
					if (local37 > 0) {
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
				local81 = this.anInputStream2.read(this.aByteArray58, this.anInt3642, local37);
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
				this.anInt3642 = (local81 + this.anInt3642) % this.anInt3640;
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	public void method3264() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z")
	public boolean method3265(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt3640) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(47) int local47;
			if (this.anInt3648 > this.anInt3642) {
				local47 = this.anInt3640 + this.anInt3642 - this.anInt3648;
			} else {
				local47 = this.anInt3642 - this.anInt3648;
			}
			if (local47 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public void method3266() {
		this.anInputStream2 = new InputStream_Sub1();
	}
}
