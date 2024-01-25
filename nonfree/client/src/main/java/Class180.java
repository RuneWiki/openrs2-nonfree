import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class180 implements Runnable {

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	private int anInt5316 = 0;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	private int anInt5322 = 0;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	private final int anInt5320;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "[B")
	private final byte[] aByteArray62;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class180(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt5320 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray62 = new byte[this.anInt5320];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!kf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5322 == 0) {
						local30 = this.anInt5320 - this.anInt5316 - 1;
					} else if (this.anInt5322 < this.anInt5316) {
						local30 = this.anInt5320 - this.anInt5316;
					} else {
						local30 = this.anInt5322 - this.anInt5316 - 1;
					}
					if (local30 > 0) {
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
				local81 = this.anInputStream1.read(this.aByteArray62, this.anInt5316, local30);
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
				this.anInt5316 = (local81 + this.anInt5316) % this.anInt5320;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)Z")
	public boolean method4566(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt5320) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt5322 <= this.anInt5316) {
				local40 = this.anInt5316 - this.anInt5322;
			} else {
				local40 = this.anInt5320 + this.anInt5316 - this.anInt5322;
			}
			if (local40 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method4567() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
	public void method4570() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BIBI)I")
	public int method4571(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg2 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(52) int local52;
			if (this.anInt5316 >= this.anInt5322) {
				local52 = this.anInt5316 - this.anInt5322;
			} else {
				local52 = this.anInt5316 + this.anInt5320 - this.anInt5322;
			}
			if (local52 < arg1) {
				arg1 = local52;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt5320 < arg1 + this.anInt5322) {
				@Pc(102) int local102 = this.anInt5320 - this.anInt5322;
				Static589.method5382(this.aByteArray62, this.anInt5322, arg0, arg2, local102);
				Static589.method5382(this.aByteArray62, 0, arg0, arg2 + local102, arg1 - local102);
			} else {
				Static589.method5382(this.aByteArray62, this.anInt5322, arg0, arg2, arg1);
			}
			this.anInt5322 = (arg1 + this.anInt5322) % this.anInt5320;
			this.notifyAll();
			return arg1;
		}
	}
}
