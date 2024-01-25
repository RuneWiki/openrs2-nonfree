import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class161 implements Runnable {

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	private int anInt4476 = 0;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	private int anInt4480 = 0;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	private final int anInt4474;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "[B")
	private final byte[] aByteArray34;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class161(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt4474 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray34 = new byte[this.anInt4474];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!hl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(39) int local39;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4480 == 0) {
						local39 = this.anInt4474 - this.anInt4476 - 1;
					} else if (this.anInt4476 >= this.anInt4480) {
						local39 = this.anInt4474 - this.anInt4476;
					} else {
						local39 = this.anInt4480 - this.anInt4476 - 1;
					}
					if (local39 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			@Pc(87) int local87;
			try {
				local87 = this.anInputStream1.read(this.aByteArray34, this.anInt4476, local39);
				if (local87 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException1 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4476 = (this.anInt4476 + local87) % this.anInt4474;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[BI)I")
	public int method4095(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg2 + arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(59) int local59;
			if (this.anInt4480 > this.anInt4476) {
				local59 = this.anInt4474 + this.anInt4476 - this.anInt4480;
			} else {
				local59 = this.anInt4476 - this.anInt4480;
			}
			if (local59 < arg2) {
				arg2 = local59;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt4480 > this.anInt4474) {
				@Pc(105) int local105 = this.anInt4474 - this.anInt4480;
				Static695.method5648(this.aByteArray34, this.anInt4480, arg1, arg0, local105);
				Static695.method5648(this.aByteArray34, 0, arg1, arg0 + local105, arg2 + -local105);
			} else {
				Static695.method5648(this.aByteArray34, this.anInt4480, arg1, arg0, arg2);
			}
			this.anInt4480 = (arg2 + this.anInt4480) % this.anInt4474;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method4098() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Z")
	public boolean method4099(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt4474 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(39) int local39;
			if (this.anInt4476 < this.anInt4480) {
				local39 = this.anInt4474 + this.anInt4476 - this.anInt4480;
			} else {
				local39 = this.anInt4476 - this.anInt4480;
			}
			if (local39 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method4100() {
		this.anInputStream1 = new InputStream_Sub1();
	}
}
