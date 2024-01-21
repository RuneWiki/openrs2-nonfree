import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class40 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	private int anInt2424;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "J")
	private long aLong82 = -1L;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "J")
	private long aLong81 = -1L;

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
	private int anInt2438 = 0;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!gd;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "J")
	private long aLong84;

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "[B")
	private final byte[] aByteArray33;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "[B")
	private final byte[] aByteArray34;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!gd;II)V")
	public Class40(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass30_1 = arg0;
		this.aLong84 = this.aLong83 = arg0.method1404();
		this.aLong85 = 0L;
		this.aByteArray33 = new byte[arg1];
		this.aByteArray34 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public void method1916() throws IOException {
		this.method1920();
		this.aClass30_1.method1403();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BIII)V")
	public void method1918(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong85 + (long) arg2 > this.aLong84) {
				this.aLong84 = this.aLong85 + (long) arg2;
			}
			if (this.aLong81 != -1L && (this.aLong85 < this.aLong81 || this.aLong85 > this.aLong81 + (long) this.anInt2438)) {
				this.method1920();
			}
			if (this.aLong81 != -1L && (long) arg2 + this.aLong85 > this.aLong81 + (long) this.aByteArray34.length) {
				@Pc(92) int local92 = (int) (this.aLong81 + (long) this.aByteArray34.length - this.aLong85);
				Static203.method2767(arg0, arg1, this.aByteArray34, (int) (this.aLong85 - this.aLong81), local92);
				this.aLong85 += local92;
				arg1 += local92;
				arg2 -= local92;
				this.anInt2438 = this.aByteArray34.length;
				this.method1920();
			}
			if (arg2 > this.aByteArray34.length) {
				@Pc(135) long local135 = -1L;
				if (this.aLong85 != this.aLong80) {
					this.aClass30_1.method1402(this.aLong85);
					this.aLong80 = this.aLong85;
				}
				@Pc(153) long local153 = -1L;
				this.aClass30_1.method1405(arg2, arg1, arg0);
				this.aLong80 += arg2;
				if (this.aLong80 > this.aLong83) {
					this.aLong83 = this.aLong80;
				}
				if (this.aLong82 <= this.aLong85 && this.aLong85 < (long) this.anInt2424 + this.aLong82) {
					local153 = this.aLong85;
				} else if (this.aLong85 <= this.aLong82 && this.aLong85 + (long) arg2 > this.aLong82) {
					local153 = this.aLong82;
				}
				if (this.aLong85 + (long) arg2 > this.aLong82 && this.aLong85 + (long) arg2 <= this.aLong82 - -((long) this.anInt2424)) {
					local135 = this.aLong85 + (long) arg2;
				} else if (this.aLong82 + (long) this.anInt2424 > this.aLong85 && (long) arg2 + this.aLong85 >= this.aLong82 + (long) this.anInt2424) {
					local135 = (long) this.anInt2424 + this.aLong82;
				}
				if (local153 > -1L && local153 < local135) {
					@Pc(309) int local309 = (int) (local135 - local153);
					Static203.method2767(arg0, (int) (local153 + (long) arg1 - this.aLong85), this.aByteArray33, (int) (local153 - this.aLong82), local309);
				}
				this.aLong85 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong81 == -1L) {
					this.aLong81 = this.aLong85;
				}
				Static203.method2767(arg0, arg1, this.aByteArray34, (int) (this.aLong85 - this.aLong81), arg2);
				this.aLong85 += arg2;
				if ((long) this.anInt2438 < this.aLong85 - this.aLong81) {
					this.anInt2438 = (int) (this.aLong85 - this.aLong81);
				}
			}
		} catch (@Pc(397) IOException local397) {
			this.aLong80 = -1L;
			throw local397;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	private void method1920() throws IOException {
		if (this.aLong81 == -1L) {
			return;
		}
		if (this.aLong80 != this.aLong81) {
			this.aClass30_1.method1402(this.aLong81);
			this.aLong80 = this.aLong81;
		}
		@Pc(38) long local38 = -1L;
		this.aClass30_1.method1405(this.anInt2438, 0, this.aByteArray34);
		if (this.aLong82 <= this.aLong81 && this.aLong81 < this.aLong82 + (long) this.anInt2424) {
			local38 = this.aLong81;
		} else if (this.aLong81 <= this.aLong82 && this.aLong82 < this.aLong81 + (long) this.anInt2438) {
			local38 = this.aLong82;
		}
		@Pc(105) long local105 = -1L;
		if (this.aLong82 < this.aLong81 + (long) this.anInt2438 && (long) this.anInt2424 + this.aLong82 >= this.aLong81 - -((long) this.anInt2438)) {
			local105 = (long) this.anInt2438 + this.aLong81;
		} else if (this.aLong81 < (long) this.anInt2424 + this.aLong82 && (long) this.anInt2424 + this.aLong82 <= (long) this.anInt2438 + this.aLong81) {
			local105 = (long) this.anInt2424 + this.aLong82;
		}
		this.aLong80 += this.anInt2438;
		if (this.aLong80 > this.aLong83) {
			this.aLong83 = this.aLong80;
		}
		if (local38 > -1L && local105 > local38) {
			@Pc(209) int local209 = (int) (local105 - local38);
			Static203.method2767(this.aByteArray34, (int) (local38 - this.aLong81), this.aByteArray33, (int) (local38 - this.aLong82), local209);
		}
		this.aLong81 = -1L;
		this.anInt2438 = 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[BII)V")
	public void method1921(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong81 != -1L && this.aLong81 <= this.aLong85 && (long) arg2 + this.aLong85 <= (long) this.anInt2438 + this.aLong81) {
				Static203.method2767(this.aByteArray34, (int) (this.aLong85 - this.aLong81), arg1, 0, arg2);
				this.aLong85 += arg2;
				return;
			}
			@Pc(79) long local79 = this.aLong85;
			@Pc(88) int local88 = arg2;
			@Pc(121) int local121;
			if (this.aLong85 >= this.aLong82 && this.aLong85 < (long) this.anInt2424 + this.aLong82) {
				local121 = (int) ((long) this.anInt2424 + this.aLong82 - this.aLong85);
				if (local121 > arg2) {
					local121 = arg2;
				}
				arg2 -= local121;
				Static203.method2767(this.aByteArray33, (int) (this.aLong85 - this.aLong82), arg1, 0, local121);
				arg0 = local121;
				this.aLong85 += local121;
			}
			if (arg2 > this.aByteArray33.length) {
				this.aClass30_1.method1402(this.aLong85);
				this.aLong80 = this.aLong85;
				while (arg2 > 0) {
					local121 = this.aClass30_1.method1406(arg1, arg0, arg2);
					if (local121 == -1) {
						break;
					}
					arg2 -= local121;
					this.aLong80 += local121;
					this.aLong85 += local121;
					arg0 += local121;
				}
			} else if (arg2 > 0) {
				this.method1931();
				local121 = arg2;
				if (arg2 > this.anInt2424) {
					local121 = this.anInt2424;
				}
				Static203.method2767(this.aByteArray33, 0, arg1, arg0, local121);
				arg0 += local121;
				arg2 -= local121;
				this.aLong85 += local121;
			}
			if (this.aLong81 != -1L) {
				if (this.aLong85 < this.aLong81 && arg2 > 0) {
					local121 = arg0 + (int) (this.aLong81 - this.aLong85);
					if (arg0 + arg2 < local121) {
						local121 = arg0 + arg2;
					}
					while (arg0 < local121) {
						arg1[arg0++] = 0;
						this.aLong85++;
						arg2--;
					}
				}
				@Pc(313) long local313 = -1L;
				if (this.aLong81 >= local79 && this.aLong81 < local79 + (long) local88) {
					local313 = this.aLong81;
				} else if (this.aLong81 <= local79 && local79 < (long) this.anInt2438 + this.aLong81) {
					local313 = local79;
				}
				@Pc(366) long local366 = -1L;
				if (local79 < this.aLong81 + (long) this.anInt2438 && local79 + (long) local88 >= (long) this.anInt2438 + this.aLong81) {
					local366 = (long) this.anInt2438 + this.aLong81;
				} else if (this.aLong81 < local79 + (long) local88 && this.aLong81 + (long) this.anInt2438 >= (long) local88 + local79) {
					local366 = local79 + (long) local88;
				}
				if (local313 > -1L && local313 < local366) {
					@Pc(447) int local447 = (int) (local366 - local313);
					Static203.method2767(this.aByteArray34, (int) (local313 - this.aLong81), arg1, (int) (local313 - local79), local447);
					if (local366 > this.aLong85) {
						arg2 = (int) ((long) arg2 + this.aLong85 - local366);
						this.aLong85 = local366;
					}
				}
			}
		} catch (@Pc(490) IOException local490) {
			this.aLong80 = -1L;
			throw local490;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[B)V")
	public void method1922(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1921(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method1924() {
		return this.aClass30_1.method1401();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BJ)V")
	public void method1928(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1924());
		}
		this.aLong85 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)J")
	public long method1929() {
		return this.aLong84;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
	private void method1931() throws IOException {
		this.anInt2424 = 0;
		if (this.aLong80 != this.aLong85) {
			this.aClass30_1.method1402(this.aLong85);
			this.aLong80 = this.aLong85;
		}
		this.aLong82 = this.aLong85;
		while (this.anInt2424 < this.aByteArray33.length) {
			@Pc(50) int local50 = this.aByteArray33.length - this.anInt2424;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(65) int local65 = this.aClass30_1.method1406(this.aByteArray33, this.anInt2424, local50);
			if (local65 == -1) {
				break;
			}
			this.anInt2424 += local65;
			this.aLong80 += local65;
		}
	}
}
