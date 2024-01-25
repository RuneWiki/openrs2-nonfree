import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class236 implements Runnable {

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	private int anInt6431 = 0;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	private int anInt6427 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
	private final int anInt6426;

	@OriginalMember(owner = "client!nba", name = "q", descriptor = "[B")
	private final byte[] aByteArray65;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class236(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt6426 = arg1 + 1;
		this.aByteArray65 = new byte[this.anInt6426];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	public void method5544() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!nba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt6431 == 0) {
						local29 = this.anInt6426 - this.anInt6427 - 1;
					} else if (this.anInt6427 <= this.anInt6431) {
						local29 = this.anInt6431 - this.anInt6427 - 1;
					} else {
						local29 = this.anInt6426 - this.anInt6427;
					}
					if (local29 > 0) {
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
				local80 = this.anInputStream1.read(this.aByteArray65, this.anInt6427, local29);
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
				this.anInt6427 = (this.anInt6427 + local80) % this.anInt6426;
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V")
	public void method5545() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([BIII)I")
	public int method5546(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg2 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt6427 >= this.anInt6431) {
				local44 = this.anInt6427 - this.anInt6431;
			} else {
				local44 = this.anInt6426 + this.anInt6427 - this.anInt6431;
			}
			if (arg1 > local44) {
				arg1 = local44;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt6426 >= arg1 + this.anInt6431) {
				Static650.method2274(this.aByteArray65, this.anInt6431, arg0, arg2, arg1);
			} else {
				@Pc(100) int local100 = this.anInt6426 - this.anInt6431;
				Static650.method2274(this.aByteArray65, this.anInt6431, arg0, arg2, local100);
				Static650.method2274(this.aByteArray65, 0, arg0, local100 + arg2, arg1 - local100);
			}
			this.anInt6431 = (arg1 + this.anInt6431) % this.anInt6426;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Z")
	public boolean method5547(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt6426) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt6431 <= this.anInt6427) {
				local48 = this.anInt6427 - this.anInt6431;
			} else {
				local48 = this.anInt6427 + this.anInt6426 - this.anInt6431;
			}
			if (arg0 <= local48) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}
}
