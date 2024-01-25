import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class275 implements Runnable {

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	private int anInt8414 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	private int anInt8412 = 0;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	private final int anInt8418;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "[B")
	private final byte[] aByteArray77;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class275(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt8418 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray77 = new byte[this.anInt8418];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!qk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8412 == 0) {
						local30 = this.anInt8418 - this.anInt8414 - 1;
					} else if (this.anInt8414 > this.anInt8412) {
						local30 = this.anInt8418 - this.anInt8414;
					} else {
						local30 = this.anInt8412 - this.anInt8414 - 1;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(63) InterruptedException local63) {
					}
				}
			}
			@Pc(80) int local80;
			try {
				local80 = this.anInputStream1.read(this.aByteArray77, this.anInt8414, local30);
				if (local80 == -1) {
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
				this.anInt8414 = (local80 + this.anInt8414) % this.anInt8418;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[BZ)I")
	public int method6946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg0 + arg1 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(49) int local49;
			if (this.anInt8414 < this.anInt8412) {
				local49 = this.anInt8418 + this.anInt8414 - this.anInt8412;
			} else {
				local49 = this.anInt8414 - this.anInt8412;
			}
			if (arg0 > local49) {
				arg0 = local49;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt8412 + arg0 > this.anInt8418) {
				@Pc(99) int local99 = this.anInt8418 - this.anInt8412;
				Static649.method5532(this.aByteArray77, this.anInt8412, arg2, arg1, local99);
				Static649.method5532(this.aByteArray77, 0, arg2, arg1 + local99, -local99 + arg0);
			} else {
				Static649.method5532(this.aByteArray77, this.anInt8412, arg2, arg1, arg0);
			}
			this.anInt8412 = (arg0 + this.anInt8412) % this.anInt8418;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public void method6947() {
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

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)Z")
	public boolean method6948(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt8418) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt8414 >= this.anInt8412) {
				local41 = this.anInt8414 - this.anInt8412;
			} else {
				local41 = this.anInt8414 + this.anInt8418 - this.anInt8412;
			}
			if (arg0 <= local41) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public void method6949() {
		this.anInputStream1 = new InputStream_Sub2();
	}
}
