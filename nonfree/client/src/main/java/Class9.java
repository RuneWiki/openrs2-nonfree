import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class9 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt322 = 0;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "J")
	private long aLong19 = -1L;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "J")
	private long aLong21 = -1L;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!ri;")
	private final Class88 aClass88_1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "[B")
	private final byte[] aByteArray3;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ri;II)V")
	public Class9(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass88_1 = arg0;
		this.aLong17 = this.aLong18 = arg0.method2531();
		this.aByteArray3 = new byte[arg2];
		this.aLong22 = 0L;
		this.aByteArray2 = new byte[arg1];
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	private void method219() throws IOException {
		if (this.aLong19 == -1L) {
			return;
		}
		@Pc(10) long local10 = -1L;
		if (this.aLong20 != this.aLong19) {
			this.aClass88_1.method2533(this.aLong19);
			this.aLong20 = this.aLong19;
		}
		@Pc(28) long local28 = -1L;
		this.aClass88_1.method2532(this.anInt322, 0, this.aByteArray3);
		if (this.aLong19 >= this.aLong21 && this.aLong21 + (long) this.anInt317 > this.aLong19) {
			local28 = this.aLong19;
		} else if (this.aLong21 >= this.aLong19 && this.aLong19 + (long) this.anInt322 > this.aLong21) {
			local28 = this.aLong21;
		}
		if (this.aLong19 + (long) this.anInt322 > this.aLong21 && (long) this.anInt322 + this.aLong19 <= (long) this.anInt317 + this.aLong21) {
			local10 = this.aLong19 + (long) this.anInt322;
		} else if ((long) this.anInt317 + this.aLong21 > this.aLong19 && this.aLong19 + (long) this.anInt322 >= (long) this.anInt317 + this.aLong21) {
			local10 = this.aLong21 + (long) this.anInt317;
		}
		this.aLong20 += this.anInt322;
		if (this.aLong20 > this.aLong18) {
			this.aLong18 = this.aLong20;
		}
		if (local28 > -1L && local28 < local10) {
			@Pc(193) int local193 = (int) (local10 - local28);
			Static220.method1006(this.aByteArray3, (int) (local28 - this.aLong19), this.aByteArray2, (int) (local28 - this.aLong21), local193);
		}
		this.anInt322 = 0;
		this.aLong19 = -1L;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public void method220() throws IOException {
		this.method219();
		this.aClass88_1.method2529();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)V")
	public void method221(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method230());
		}
		this.aLong22 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[BI)V")
	public void method222(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong19 != -1L && this.aLong22 >= this.aLong19 && (long) this.anInt322 + this.aLong19 >= this.aLong22 - -((long) arg2)) {
				Static220.method1006(this.aByteArray3, (int) (this.aLong22 - this.aLong19), arg1, 0, arg2);
				this.aLong22 += arg2;
				return;
			}
			@Pc(81) long local81 = this.aLong22;
			@Pc(85) int local85 = arg2;
			@Pc(114) int local114;
			if (this.aLong21 <= this.aLong22 && (long) this.anInt317 + this.aLong21 > this.aLong22) {
				local114 = (int) ((long) this.anInt317 + this.aLong21 - this.aLong22);
				if (local114 > arg2) {
					local114 = arg2;
				}
				arg2 -= local114;
				Static220.method1006(this.aByteArray2, (int) (this.aLong22 - this.aLong21), arg1, 0, local114);
				this.aLong22 += local114;
				arg0 = local114;
			}
			if (this.aByteArray2.length < arg2) {
				this.aClass88_1.method2533(this.aLong22);
				this.aLong20 = this.aLong22;
				while (arg2 > 0) {
					local114 = this.aClass88_1.method2528(arg1, arg2, arg0);
					if (local114 == -1) {
						break;
					}
					arg2 -= local114;
					this.aLong20 += local114;
					arg0 += local114;
					this.aLong22 += local114;
				}
			} else if (arg2 > 0) {
				local114 = arg2;
				this.method227();
				if (this.anInt317 < arg2) {
					local114 = this.anInt317;
				}
				arg2 -= local114;
				Static220.method1006(this.aByteArray2, 0, arg1, arg0, local114);
				arg0 += local114;
				this.aLong22 += local114;
			}
			if (this.aLong19 != -1L) {
				if (this.aLong22 < this.aLong19 && arg2 > 0) {
					local114 = arg0 + (int) (this.aLong19 - this.aLong22);
					if (local114 > arg0 + arg2) {
						local114 = arg2 + arg0;
					}
					while (arg0 < local114) {
						arg1[arg0++] = 0;
						this.aLong22++;
						arg2--;
					}
				}
				@Pc(320) long local320 = -1L;
				@Pc(322) long local322 = -1L;
				if (local81 < (long) this.anInt322 + this.aLong19 && this.aLong19 + (long) this.anInt322 <= local81 + (long) local85) {
					local322 = (long) this.anInt322 + this.aLong19;
				} else if (this.aLong19 < local81 + (long) local85 && this.aLong19 + (long) this.anInt322 >= (long) local85 + local81) {
					local322 = local81 + (long) local85;
				}
				if (local81 <= this.aLong19 && local81 + (long) local85 > this.aLong19) {
					local320 = this.aLong19;
				} else if (this.aLong19 <= local81 && local81 < this.aLong19 + (long) this.anInt322) {
					local320 = local81;
				}
				if (local320 > -1L && local320 < local322) {
					@Pc(442) int local442 = (int) (local322 - local320);
					Static220.method1006(this.aByteArray3, (int) (local320 - this.aLong19), arg1, (int) (local320 - local81), local442);
					if (this.aLong22 < local322) {
						arg2 = (int) ((long) arg2 + this.aLong22 - local322);
						this.aLong22 = local322;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong20 = -1L;
			throw local479;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B[B)V")
	public void method223(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method222(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)J")
	public long method226() {
		return this.aLong17;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	private void method227() throws IOException {
		this.anInt317 = 0;
		if (this.aLong20 != this.aLong22) {
			this.aClass88_1.method2533(this.aLong22);
			this.aLong20 = this.aLong22;
		}
		this.aLong21 = this.aLong22;
		while (this.aByteArray2.length > this.anInt317) {
			@Pc(42) int local42 = this.aByteArray2.length - this.anInt317;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass88_1.method2528(this.aByteArray2, local42, this.anInt317);
			if (local57 == -1) {
				break;
			}
			this.aLong20 += local57;
			this.anInt317 += local57;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[B)V")
	public void method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong22 + (long) arg0 > this.aLong17) {
				this.aLong17 = (long) arg0 + this.aLong22;
			}
			if (this.aLong19 != -1L && (this.aLong19 > this.aLong22 || this.aLong22 > this.aLong19 + (long) this.anInt322)) {
				this.method219();
			}
			if (this.aLong19 != -1L && (long) this.aByteArray3.length + this.aLong19 < this.aLong22 + (long) arg0) {
				@Pc(99) int local99 = (int) (this.aLong19 + (long) this.aByteArray3.length - this.aLong22);
				arg0 -= local99;
				Static220.method1006(arg2, arg1, this.aByteArray3, (int) (this.aLong22 - this.aLong19), local99);
				this.aLong22 += local99;
				this.anInt322 = this.aByteArray3.length;
				arg1 += local99;
				this.method219();
			}
			if (arg0 > this.aByteArray3.length) {
				if (this.aLong22 != this.aLong20) {
					this.aClass88_1.method2533(this.aLong22);
					this.aLong20 = this.aLong22;
				}
				this.aClass88_1.method2532(arg0, arg1, arg2);
				@Pc(171) long local171 = -1L;
				this.aLong20 += arg0;
				if (this.aLong18 < this.aLong20) {
					this.aLong18 = this.aLong20;
				}
				if (this.aLong21 <= this.aLong22 && (long) this.anInt317 + this.aLong21 > this.aLong22) {
					local171 = this.aLong22;
				} else if (this.aLong22 <= this.aLong21 && (long) arg0 + this.aLong22 > this.aLong21) {
					local171 = this.aLong21;
				}
				@Pc(237) long local237 = -1L;
				if (this.aLong21 < this.aLong22 + (long) arg0 && (long) arg0 + this.aLong22 <= this.aLong21 + (long) this.anInt317) {
					local237 = this.aLong22 + (long) arg0;
				} else if (this.aLong22 < this.aLong21 + (long) this.anInt317 && (long) arg0 + this.aLong22 >= this.aLong21 - -((long) this.anInt317)) {
					local237 = (long) this.anInt317 + this.aLong21;
				}
				if (local171 > -1L && local237 > local171) {
					@Pc(330) int local330 = (int) (local237 - local171);
					Static220.method1006(arg2, (int) ((long) arg1 + local171 - this.aLong22), this.aByteArray2, (int) (local171 - this.aLong21), local330);
				}
				this.aLong22 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong19 == -1L) {
					this.aLong19 = this.aLong22;
				}
				Static220.method1006(arg2, arg1, this.aByteArray3, (int) (this.aLong22 - this.aLong19), arg0);
				this.aLong22 += arg0;
				if ((long) this.anInt322 < this.aLong22 - this.aLong19) {
					this.anInt322 = (int) (this.aLong22 - this.aLong19);
				}
			}
		} catch (@Pc(410) IOException local410) {
			this.aLong20 = -1L;
			throw local410;
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Ljava/io/File;")
	private File method230() {
		return this.aClass88_1.method2530();
	}
}
