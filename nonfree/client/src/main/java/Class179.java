import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class179 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "J")
	private long aLong140;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	private int anInt5269;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
	private int anInt5266 = 0;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "J")
	private long aLong143 = -1L;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "J")
	private long aLong145 = -1L;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "Lclient!in;")
	private final Class133 aClass133_1;

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "J")
	private long aLong144;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "[B")
	private final byte[] aByteArray88;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!in;II)V")
	public Class179(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass133_1 = arg0;
		this.aLong142 = this.aLong144 = arg0.method3311();
		this.aByteArray88 = new byte[arg2];
		this.aLong141 = 0L;
		this.aByteArray89 = new byte[arg1];
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II[BI)V")
	public void method4520(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong141 > this.aLong142) {
				this.aLong142 = this.aLong141 + (long) arg0;
			}
			if (this.aLong143 != -1L && (this.aLong143 > this.aLong141 || this.aLong141 > (long) this.anInt5266 + this.aLong143)) {
				this.method4522();
			}
			if (this.aLong143 != -1L && (long) arg0 + this.aLong141 > (long) this.aByteArray88.length + this.aLong143) {
				@Pc(84) int local84 = (int) ((long) this.aByteArray88.length + this.aLong143 - this.aLong141);
				Static553.method3373(arg1, arg2, this.aByteArray88, (int) (this.aLong141 - this.aLong143), local84);
				arg0 -= local84;
				this.aLong141 += local84;
				arg2 += local84;
				this.anInt5266 = this.aByteArray88.length;
				this.method4522();
			}
			if (arg0 > this.aByteArray88.length) {
				if (this.aLong140 != this.aLong141) {
					this.aClass133_1.method3308(this.aLong141);
					this.aLong140 = this.aLong141;
				}
				this.aClass133_1.method3307(arg2, arg0, arg1);
				this.aLong140 += arg0;
				if (this.aLong144 < this.aLong140) {
					this.aLong144 = this.aLong140;
				}
				@Pc(178) long local178 = -1L;
				@Pc(180) long local180 = -1L;
				if (this.aLong145 <= this.aLong141 && this.aLong141 < this.aLong145 + (long) this.anInt5269) {
					local178 = this.aLong141;
				} else if (this.aLong145 >= this.aLong141 && this.aLong145 < (long) arg0 + this.aLong141) {
					local178 = this.aLong145;
				}
				if (this.aLong141 + (long) arg0 > this.aLong145 && (long) arg0 + this.aLong141 <= (long) this.anInt5269 + this.aLong145) {
					local180 = this.aLong141 + (long) arg0;
				} else if ((long) this.anInt5269 + this.aLong145 > this.aLong141 && (long) this.anInt5269 + this.aLong145 <= (long) arg0 + this.aLong141) {
					local180 = this.aLong145 + (long) this.anInt5269;
				}
				if (local178 > -1L && local180 > local178) {
					@Pc(317) int local317 = (int) (local180 - local178);
					Static553.method3373(arg1, (int) ((long) arg2 + local178 - this.aLong141), this.aByteArray89, (int) (local178 - this.aLong145), local317);
				}
				this.aLong141 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong143 == -1L) {
					this.aLong143 = this.aLong141;
				}
				Static553.method3373(arg1, arg2, this.aByteArray88, (int) (this.aLong141 - this.aLong143), arg0);
				this.aLong141 += arg0;
				if (this.aLong141 - this.aLong143 > (long) this.anInt5266) {
					this.anInt5266 = (int) (this.aLong141 - this.aLong143);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong140 = -1L;
			throw local404;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	private void method4522() throws IOException {
		if (this.aLong143 == -1L) {
			return;
		}
		if (this.aLong140 != this.aLong143) {
			this.aClass133_1.method3308(this.aLong143);
			this.aLong140 = this.aLong143;
		}
		this.aClass133_1.method3307(0, this.anInt5266, this.aByteArray88);
		this.aLong140 += this.anInt5266;
		if (this.aLong140 > this.aLong144) {
			this.aLong144 = this.aLong140;
		}
		@Pc(67) long local67 = -1L;
		@Pc(69) long local69 = -1L;
		if (this.aLong145 <= this.aLong143 && this.aLong143 < (long) this.anInt5269 + this.aLong145) {
			local67 = this.aLong143;
		} else if (this.aLong145 >= this.aLong143 && this.aLong143 + (long) this.anInt5266 > this.aLong145) {
			local67 = this.aLong145;
		}
		if (this.aLong145 < this.aLong143 + (long) this.anInt5266 && (long) this.anInt5266 + this.aLong143 <= (long) this.anInt5269 + this.aLong145) {
			local69 = (long) this.anInt5266 + this.aLong143;
		} else if ((long) this.anInt5269 + this.aLong145 > this.aLong143 && this.aLong143 + (long) this.anInt5266 >= this.aLong145 + (long) this.anInt5269) {
			local69 = (long) this.anInt5269 + this.aLong145;
		}
		if (local67 > -1L && local69 > local67) {
			@Pc(207) int local207 = (int) (local69 - local67);
			Static553.method3373(this.aByteArray88, (int) (local67 - this.aLong143), this.aByteArray89, (int) (local67 - this.aLong145), local207);
		}
		this.aLong143 = -1L;
		this.anInt5266 = 0;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	private void method4523() throws IOException {
		this.anInt5269 = 0;
		if (this.aLong141 != this.aLong140) {
			this.aClass133_1.method3308(this.aLong141);
			this.aLong140 = this.aLong141;
		}
		this.aLong145 = this.aLong141;
		while (this.anInt5269 < this.aByteArray89.length) {
			@Pc(46) int local46 = this.aByteArray89.length - this.anInt5269;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(61) int local61 = this.aClass133_1.method3309(local46, this.aByteArray89, this.anInt5269);
			if (local61 == -1) {
				break;
			}
			this.anInt5269 += local61;
			this.aLong140 += local61;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)Ljava/io/File;")
	private File method4524() {
		return this.aClass133_1.method3310();
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)J")
	public long method4525() {
		return this.aLong142;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([BIII)V")
	public void method4526(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong143 != -1L && this.aLong141 >= this.aLong143 && (long) this.anInt5266 + this.aLong143 >= (long) arg1 + this.aLong141) {
				Static553.method3373(this.aByteArray88, (int) (this.aLong141 - this.aLong143), arg0, 0, arg1);
				this.aLong141 += arg1;
				return;
			}
			@Pc(79) long local79 = this.aLong141;
			@Pc(83) int local83 = arg1;
			@Pc(115) int local115;
			if (this.aLong145 <= this.aLong141 && this.aLong141 < this.aLong145 + (long) this.anInt5269) {
				local115 = (int) ((long) this.anInt5269 + this.aLong145 - this.aLong141);
				if (arg1 < local115) {
					local115 = arg1;
				}
				Static553.method3373(this.aByteArray89, (int) (this.aLong141 - this.aLong145), arg0, 0, local115);
				arg1 -= local115;
				this.aLong141 += local115;
				arg2 = local115;
			}
			if (this.aByteArray89.length < arg1) {
				this.aClass133_1.method3308(this.aLong141);
				this.aLong140 = this.aLong141;
				while (arg1 > 0) {
					local115 = this.aClass133_1.method3309(arg1, arg0, arg2);
					if (local115 == -1) {
						break;
					}
					this.aLong141 += local115;
					this.aLong140 += local115;
					arg1 -= local115;
					arg2 += local115;
				}
			} else if (arg1 > 0) {
				this.method4523();
				local115 = arg1;
				if (this.anInt5269 < arg1) {
					local115 = this.anInt5269;
				}
				Static553.method3373(this.aByteArray89, 0, arg0, arg2, local115);
				arg2 += local115;
				arg1 -= local115;
				this.aLong141 += local115;
			}
			if (this.aLong143 != -1L) {
				if (this.aLong141 < this.aLong143 && arg1 > 0) {
					local115 = arg2 + (int) (this.aLong143 - this.aLong141);
					if (arg2 + arg1 < local115) {
						local115 = arg2 + arg1;
					}
					while (arg2 < local115) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong141++;
					}
				}
				@Pc(308) long local308 = -1L;
				if (this.aLong143 >= local79 && this.aLong143 < (long) local83 + local79) {
					local308 = this.aLong143;
				} else if (local79 >= this.aLong143 && local79 < (long) this.anInt5266 + this.aLong143) {
					local308 = local79;
				}
				@Pc(348) long local348 = -1L;
				if (local79 < this.aLong143 + (long) this.anInt5266 && (long) this.anInt5266 + this.aLong143 <= local79 - -((long) local83)) {
					local348 = (long) this.anInt5266 + this.aLong143;
				} else if (this.aLong143 < (long) local83 + local79 && (long) this.anInt5266 + this.aLong143 >= local79 + (long) local83) {
					local348 = (long) local83 + local79;
				}
				if (local308 > -1L && local308 < local348) {
					@Pc(419) int local419 = (int) (local348 - local308);
					Static553.method3373(this.aByteArray88, (int) (local308 - this.aLong143), arg0, (int) (local308 - local79), local419);
					if (this.aLong141 < local348) {
						arg1 = (int) ((long) arg1 + this.aLong141 - local348);
						this.aLong141 = local348;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong140 = -1L;
			throw local467;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[B)V")
	public void method4527(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4526(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(JB)V")
	public void method4528(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4524());
		}
		this.aLong141 = arg0;
	}
}
