import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class204 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	private int anInt5460;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "J")
	private long aLong134 = -1L;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "J")
	private long aLong137 = -1L;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	private int anInt5466 = 0;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Lclient!dq;")
	private final Class82 aClass82_1;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "[B")
	private final byte[] aByteArray43;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!dq;II)V")
	public Class204(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass82_1 = arg0;
		this.aLong138 = this.aLong136 = arg0.method2009();
		this.aByteArray44 = new byte[arg1];
		this.aLong133 = 0L;
		this.aByteArray43 = new byte[arg2];
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	private void method4770() throws IOException {
		if (this.aLong137 == -1L) {
			return;
		}
		if (this.aLong135 != this.aLong137) {
			this.aClass82_1.method2010(this.aLong137);
			this.aLong135 = this.aLong137;
		}
		this.aClass82_1.method2007(0, this.anInt5466, this.aByteArray43);
		this.aLong135 += (long) this.anInt5466;
		if (this.aLong135 > this.aLong136) {
			this.aLong136 = this.aLong135;
		}
		@Pc(63) long local63 = -1L;
		if (this.aLong137 >= this.aLong134 && (long) this.anInt5460 + this.aLong134 > this.aLong137) {
			local63 = this.aLong137;
		} else if (this.aLong137 <= this.aLong134 && this.aLong134 < (long) this.anInt5466 + this.aLong137) {
			local63 = this.aLong134;
		}
		@Pc(117) long local117 = -1L;
		if (this.aLong134 < this.aLong137 + (long) this.anInt5466 && (long) this.anInt5466 + this.aLong137 <= this.aLong134 + (long) this.anInt5460) {
			local117 = (long) this.anInt5466 + this.aLong137;
		} else if (this.aLong134 + (long) this.anInt5460 > this.aLong137 && this.aLong134 + (long) this.anInt5460 <= (long) this.anInt5466 + this.aLong137) {
			local117 = this.aLong134 + (long) this.anInt5460;
		}
		if (local63 > -1L && local63 < local117) {
			@Pc(213) int local213 = (int) (local117 - local63);
			Static650.method2274(this.aByteArray43, (int) (local63 - this.aLong137), this.aByteArray44, (int) (local63 - this.aLong134), local213);
		}
		this.aLong137 = -1L;
		this.anInt5466 = 0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[BII)V")
	public void method4771(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong138 < this.aLong133 + (long) arg2) {
				this.aLong138 = this.aLong133 + (long) arg2;
			}
			if (this.aLong137 != -1L && (this.aLong137 > this.aLong133 || this.aLong133 > this.aLong137 + (long) this.anInt5466)) {
				this.method4770();
			}
			if (this.aLong137 != -1L && (long) this.aByteArray43.length + this.aLong137 < (long) arg2 + this.aLong133) {
				@Pc(87) int local87 = (int) ((long) this.aByteArray43.length + this.aLong137 - this.aLong133);
				Static650.method2274(arg1, arg0, this.aByteArray43, (int) (this.aLong133 - this.aLong137), local87);
				arg0 += local87;
				arg2 -= local87;
				this.aLong133 += (long) local87;
				this.anInt5466 = this.aByteArray43.length;
				this.method4770();
			}
			if (arg2 > this.aByteArray43.length) {
				if (this.aLong135 != this.aLong133) {
					this.aClass82_1.method2010(this.aLong133);
					this.aLong135 = this.aLong133;
				}
				this.aClass82_1.method2007(arg0, arg2, arg1);
				this.aLong135 += (long) arg2;
				if (this.aLong136 < this.aLong135) {
					this.aLong136 = this.aLong135;
				}
				@Pc(174) long local174 = -1L;
				if (this.aLong133 >= this.aLong134 && this.aLong133 < (long) this.anInt5460 + this.aLong134) {
					local174 = this.aLong133;
				} else if (this.aLong134 >= this.aLong133 && this.aLong134 < (long) arg2 + this.aLong133) {
					local174 = this.aLong134;
				}
				@Pc(215) long local215 = -1L;
				if (this.aLong134 < this.aLong133 + (long) arg2 && this.aLong133 + (long) arg2 <= (long) this.anInt5460 + this.aLong134) {
					local215 = this.aLong133 + (long) arg2;
				} else if (this.aLong133 < this.aLong134 + (long) this.anInt5460 && (long) this.anInt5460 + this.aLong134 <= (long) arg2 + this.aLong133) {
					local215 = (long) this.anInt5460 + this.aLong134;
				}
				if (local174 > -1L && local215 > local174) {
					@Pc(304) int local304 = (int) (local215 - local174);
					Static650.method2274(arg1, (int) ((long) arg0 + local174 - this.aLong133), this.aByteArray44, (int) (local174 - this.aLong134), local304);
				}
				this.aLong133 += (long) arg2;
			} else if (arg2 > 0) {
				if (this.aLong137 == -1L) {
					this.aLong137 = this.aLong133;
				}
				Static650.method2274(arg1, arg0, this.aByteArray43, (int) (this.aLong133 - this.aLong137), arg2);
				this.aLong133 += (long) arg2;
				if ((long) this.anInt5466 < this.aLong133 - this.aLong137) {
					this.anInt5466 = (int) (this.aLong133 - this.aLong137);
				}
			}
		} catch (@Pc(385) IOException local385) {
			this.aLong135 = -1L;
			throw local385;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(JI)V")
	public void method4773(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4776());
		}
		this.aLong133 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V")
	private void method4774() throws IOException {
		this.anInt5460 = 0;
		if (this.aLong135 != this.aLong133) {
			this.aClass82_1.method2010(this.aLong133);
			this.aLong135 = this.aLong133;
		}
		this.aLong134 = this.aLong133;
		while (this.anInt5460 < this.aByteArray44.length) {
			@Pc(38) int local38 = this.aByteArray44.length - this.anInt5460;
			if (local38 > 200000000) {
				local38 = 200000000;
			}
			@Pc(53) int local53 = this.aClass82_1.method2008(this.aByteArray44, this.anInt5460, local38);
			if (local53 == -1) {
				break;
			}
			this.aLong135 += (long) local53;
			this.anInt5460 += local53;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)J")
	public long method4775() {
		return this.aLong138;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method4776() {
		return this.aClass82_1.method2005();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[B)V")
	public void method4777(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4779(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)V")
	public void method4778() throws IOException {
		this.method4770();
		this.aClass82_1.method2011();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[BI)V")
	public void method4779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong137 != -1L && this.aLong133 >= this.aLong137 && (long) arg1 + this.aLong133 <= this.aLong137 - -((long) this.anInt5466)) {
				Static650.method2274(this.aByteArray43, (int) (this.aLong133 - this.aLong137), arg2, 0, arg1);
				this.aLong133 += (long) arg1;
				return;
			}
			@Pc(75) long local75 = this.aLong133;
			@Pc(79) int local79 = arg1;
			@Pc(110) int local110;
			if (this.aLong133 >= this.aLong134 && this.aLong133 < (long) this.anInt5460 + this.aLong134) {
				local110 = (int) (this.aLong134 + (long) this.anInt5460 - this.aLong133);
				if (arg1 < local110) {
					local110 = arg1;
				}
				Static650.method2274(this.aByteArray44, (int) (this.aLong133 - this.aLong134), arg2, 0, local110);
				this.aLong133 += (long) local110;
				arg0 = local110;
				arg1 -= local110;
			}
			if (this.aByteArray44.length < arg1) {
				this.aClass82_1.method2010(this.aLong133);
				this.aLong135 = this.aLong133;
				while (arg1 > 0) {
					local110 = this.aClass82_1.method2008(arg2, arg0, arg1);
					if (local110 == -1) {
						break;
					}
					arg1 -= local110;
					this.aLong135 += (long) local110;
					this.aLong133 += (long) local110;
					arg0 += local110;
				}
			} else if (arg1 > 0) {
				this.method4774();
				local110 = arg1;
				if (this.anInt5460 < arg1) {
					local110 = this.anInt5460;
				}
				Static650.method2274(this.aByteArray44, 0, arg2, arg0, local110);
				this.aLong133 += (long) local110;
				arg0 += local110;
				arg1 -= local110;
			}
			if (this.aLong137 != -1L) {
				if (this.aLong133 < this.aLong137 && arg1 > 0) {
					local110 = arg0 + (int) (this.aLong137 - this.aLong133);
					if (arg0 + arg1 < local110) {
						local110 = arg0 + arg1;
					}
					while (arg0 < local110) {
						arg2[arg0++] = 0;
						arg1--;
						this.aLong133++;
					}
				}
				@Pc(304) long local304 = -1L;
				if (local75 <= this.aLong137 && this.aLong137 < (long) local79 + local75) {
					local304 = this.aLong137;
				} else if (this.aLong137 <= local75 && local75 < (long) this.anInt5466 + this.aLong137) {
					local304 = local75;
				}
				@Pc(343) long local343 = -1L;
				if (local75 < this.aLong137 + (long) this.anInt5466 && this.aLong137 + (long) this.anInt5466 <= (long) local79 + local75) {
					local343 = this.aLong137 + (long) this.anInt5466;
				} else if ((long) local79 + local75 > this.aLong137 && (long) this.anInt5466 + this.aLong137 >= (long) local79 + local75) {
					local343 = (long) local79 + local75;
				}
				if (local304 > -1L && local304 < local343) {
					@Pc(430) int local430 = (int) (local343 - local304);
					Static650.method2274(this.aByteArray43, (int) (local304 - this.aLong137), arg2, (int) (local304 - local75), local430);
					if (local343 > this.aLong133) {
						arg1 = (int) ((long) arg1 + this.aLong133 - local343);
						this.aLong133 = local343;
					}
				}
			}
		} catch (@Pc(468) IOException local468) {
			this.aLong135 = -1L;
			throw local468;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}
}
