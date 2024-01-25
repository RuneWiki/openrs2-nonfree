import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class73 {

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
	private int anInt1814;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	private int anInt1810 = 0;

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "J")
	private long aLong56 = -1L;

	@OriginalMember(owner = "client!ep", name = "y", descriptor = "J")
	private long aLong57 = -1L;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "Lclient!jo;")
	private final Class133 aClass133_1;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "[B")
	private final byte[] aByteArray30;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!jo;II)V")
	public Class73(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass133_1 = arg0;
		this.aLong53 = this.aLong54 = arg0.method3022();
		this.aByteArray30 = new byte[arg1];
		this.aLong52 = 0L;
		this.aByteArray29 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[BI)V")
	public void method1514(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong56 != -1L && this.aLong52 >= this.aLong56 && this.aLong56 + (long) this.anInt1810 >= this.aLong52 - -((long) arg2)) {
				Static460.method4220(this.aByteArray29, (int) (this.aLong52 - this.aLong56), arg1, 0, arg2);
				this.aLong52 += arg2;
				return;
			}
			@Pc(79) long local79 = this.aLong52;
			@Pc(83) int local83 = arg2;
			@Pc(115) int local115;
			if (this.aLong57 <= this.aLong52 && (long) this.anInt1814 + this.aLong57 > this.aLong52) {
				local115 = (int) ((long) this.anInt1814 + this.aLong57 - this.aLong52);
				if (local115 > arg2) {
					local115 = arg2;
				}
				Static460.method4220(this.aByteArray30, (int) (this.aLong52 - this.aLong57), arg1, 0, local115);
				arg2 -= local115;
				this.aLong52 += local115;
				arg0 = local115;
			}
			if (arg2 > this.aByteArray30.length) {
				this.aClass133_1.method3020(this.aLong52);
				this.aLong55 = this.aLong52;
				while (arg2 > 0) {
					local115 = this.aClass133_1.method3024(arg1, arg2, arg0);
					if (local115 == -1) {
						break;
					}
					this.aLong55 += local115;
					arg0 += local115;
					arg2 -= local115;
					this.aLong52 += local115;
				}
			} else if (arg2 > 0) {
				this.method1523();
				local115 = arg2;
				if (arg2 > this.anInt1814) {
					local115 = this.anInt1814;
				}
				Static460.method4220(this.aByteArray30, 0, arg1, arg0, local115);
				this.aLong52 += local115;
				arg0 += local115;
				arg2 -= local115;
			}
			if (this.aLong56 != -1L) {
				if (this.aLong56 > this.aLong52 && arg2 > 0) {
					local115 = (int) (this.aLong56 - this.aLong52) + arg0;
					if (local115 > arg0 + arg2) {
						local115 = arg0 + arg2;
					}
					while (local115 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong52++;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if (local79 <= this.aLong56 && (long) local83 + local79 > this.aLong56) {
					local306 = this.aLong56;
				} else if (this.aLong56 <= local79 && (long) this.anInt1810 + this.aLong56 > local79) {
					local306 = local79;
				}
				if ((long) this.anInt1810 + this.aLong56 > local79 && (long) local83 + local79 >= (long) this.anInt1810 + this.aLong56) {
					local308 = (long) this.anInt1810 + this.aLong56;
				} else if (this.aLong56 < (long) local83 + local79 && (long) this.anInt1810 + this.aLong56 >= local79 - -((long) local83)) {
					local308 = (long) local83 + local79;
				}
				if (local306 > -1L && local306 < local308) {
					@Pc(424) int local424 = (int) (local308 - local306);
					Static460.method4220(this.aByteArray29, (int) (local306 - this.aLong56), arg1, (int) (local306 - local79), local424);
					if (local308 > this.aLong52) {
						arg2 = (int) ((long) arg2 + this.aLong52 - local308);
						this.aLong52 = local308;
					}
				}
			}
		} catch (@Pc(465) IOException local465) {
			this.aLong55 = -1L;
			throw local465;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)J")
	public long method1516() {
		return this.aLong53;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	private void method1517() throws IOException {
		if (this.aLong56 == -1L) {
			return;
		}
		if (this.aLong56 != this.aLong55) {
			this.aClass133_1.method3020(this.aLong56);
			this.aLong55 = this.aLong56;
		}
		this.aClass133_1.method3021(0, this.anInt1810, this.aByteArray29);
		this.aLong55 += this.anInt1810;
		if (this.aLong55 > this.aLong54) {
			this.aLong54 = this.aLong55;
		}
		@Pc(61) long local61 = -1L;
		if (this.aLong56 >= this.aLong57 && this.aLong56 < (long) this.anInt1814 + this.aLong57) {
			local61 = this.aLong56;
		} else if (this.aLong56 <= this.aLong57 && this.aLong57 < this.aLong56 + (long) this.anInt1810) {
			local61 = this.aLong57;
		}
		@Pc(120) long local120 = -1L;
		if (this.aLong56 + (long) this.anInt1810 > this.aLong57 && (long) this.anInt1814 + this.aLong57 >= this.aLong56 - -((long) this.anInt1810)) {
			local120 = (long) this.anInt1810 + this.aLong56;
		} else if ((long) this.anInt1814 + this.aLong57 > this.aLong56 && this.aLong57 + (long) this.anInt1814 <= (long) this.anInt1810 + this.aLong56) {
			local120 = (long) this.anInt1814 + this.aLong57;
		}
		if (local61 > -1L && local61 < local120) {
			@Pc(209) int local209 = (int) (local120 - local61);
			Static460.method4220(this.aByteArray29, (int) (local61 - this.aLong56), this.aByteArray30, (int) (local61 - this.aLong57), local209);
		}
		this.aLong56 = -1L;
		this.anInt1810 = 0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B[B)V")
	public void method1518(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1514(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BZI)V")
	public void method1519(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong52 > this.aLong53) {
				this.aLong53 = (long) arg0 + this.aLong52;
			}
			if (this.aLong56 != -1L && (this.aLong52 < this.aLong56 || this.aLong56 + (long) this.anInt1810 < this.aLong52)) {
				this.method1517();
			}
			if (this.aLong56 != -1L && (long) this.aByteArray29.length + this.aLong56 < this.aLong52 - -((long) arg0)) {
				@Pc(87) int local87 = (int) (this.aLong56 + (long) this.aByteArray29.length - this.aLong52);
				Static460.method4220(arg1, arg2, this.aByteArray29, (int) (this.aLong52 - this.aLong56), local87);
				this.aLong52 += local87;
				arg0 -= local87;
				arg2 += local87;
				this.anInt1810 = this.aByteArray29.length;
				this.method1517();
			}
			if (arg0 > this.aByteArray29.length) {
				if (this.aLong55 != this.aLong52) {
					this.aClass133_1.method3020(this.aLong52);
					this.aLong55 = this.aLong52;
				}
				this.aClass133_1.method3021(arg2, arg0, arg1);
				this.aLong55 += arg0;
				if (this.aLong54 < this.aLong55) {
					this.aLong54 = this.aLong55;
				}
				@Pc(174) long local174 = -1L;
				if (this.aLong57 <= this.aLong52 && this.aLong52 < this.aLong57 + (long) this.anInt1814) {
					local174 = this.aLong52;
				} else if (this.aLong57 >= this.aLong52 && this.aLong57 < (long) arg0 + this.aLong52) {
					local174 = this.aLong57;
				}
				@Pc(224) long local224 = -1L;
				if (this.aLong57 < (long) arg0 + this.aLong52 && this.aLong52 + (long) arg0 <= (long) this.anInt1814 + this.aLong57) {
					local224 = this.aLong52 + (long) arg0;
				} else if (this.aLong52 < (long) this.anInt1814 + this.aLong57 && this.aLong52 + (long) arg0 >= this.aLong57 + (long) this.anInt1814) {
					local224 = (long) this.anInt1814 + this.aLong57;
				}
				if (local174 > -1L && local174 < local224) {
					@Pc(307) int local307 = (int) (local224 - local174);
					Static460.method4220(arg1, (int) (local174 + (long) arg2 - this.aLong52), this.aByteArray30, (int) (local174 - this.aLong57), local307);
				}
				this.aLong52 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong56 == -1L) {
					this.aLong56 = this.aLong52;
				}
				Static460.method4220(arg1, arg2, this.aByteArray29, (int) (this.aLong52 - this.aLong56), arg0);
				this.aLong52 += arg0;
				if (this.aLong52 - this.aLong56 > (long) this.anInt1810) {
					this.anInt1810 = (int) (this.aLong52 - this.aLong56);
				}
			}
		} catch (@Pc(391) IOException local391) {
			this.aLong55 = -1L;
			throw local391;
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method1520() {
		return this.aClass133_1.method3019();
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
	private void method1523() throws IOException {
		this.anInt1814 = 0;
		if (this.aLong55 != this.aLong52) {
			this.aClass133_1.method3020(this.aLong52);
			this.aLong55 = this.aLong52;
		}
		this.aLong57 = this.aLong52;
		while (this.aByteArray30.length > this.anInt1814) {
			@Pc(42) int local42 = this.aByteArray30.length - this.anInt1814;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass133_1.method3024(this.aByteArray30, local42, this.anInt1814);
			if (local57 == -1) {
				break;
			}
			this.aLong55 += local57;
			this.anInt1814 += local57;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BJ)V")
	public void method1524(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1520());
		}
		this.aLong52 = arg0;
	}
}
