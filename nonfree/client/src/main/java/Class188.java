import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class188 implements Runnable {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	private int anInt5800 = 0;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	private int anInt5801 = 0;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private final int anInt5803;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class188(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt5803 = arg1 + 1;
		this.aByteArray46 = new byte[this.anInt5803];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method4801() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!kb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5800 == 0) {
						local31 = this.anInt5803 - this.anInt5801 - 1;
					} else if (this.anInt5800 >= this.anInt5801) {
						local31 = this.anInt5800 - this.anInt5801 - 1;
					} else {
						local31 = this.anInt5803 - this.anInt5801;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(57) InterruptedException local57) {
					}
				}
			}
			@Pc(74) int local74;
			try {
				local74 = this.anInputStream1.read(this.aByteArray46, this.anInt5801, local31);
				if (local74 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(82) IOException local82) {
				@Pc(82) IOException local82x = local82;
				synchronized (this) {
					this.anIOException2 = local82x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5801 = (this.anInt5801 + local74) % this.anInt5803;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public void method4802() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
	public boolean method4803(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt5803 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(39) int local39;
			if (this.anInt5801 < this.anInt5800) {
				local39 = this.anInt5803 + this.anInt5801 - this.anInt5800;
			} else {
				local39 = this.anInt5801 - this.anInt5800;
			}
			if (local39 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB[BI)I")
	public int method4805(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg0 + arg2 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt5801 < this.anInt5800) {
				local45 = this.anInt5801 + this.anInt5803 - this.anInt5800;
			} else {
				local45 = this.anInt5801 - this.anInt5800;
			}
			if (arg2 > local45) {
				arg2 = local45;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg2 + this.anInt5800 > this.anInt5803) {
				@Pc(97) int local97 = this.anInt5803 - this.anInt5800;
				Static686.method4972(this.aByteArray46, this.anInt5800, arg1, arg0, local97);
				Static686.method4972(this.aByteArray46, 0, arg1, arg0 + local97, -local97 + arg2);
			} else {
				Static686.method4972(this.aByteArray46, this.anInt5800, arg1, arg0, arg2);
			}
			this.anInt5800 = (arg2 + this.anInt5800) % this.anInt5803;
			this.notifyAll();
			return arg2;
		}
	}
}
