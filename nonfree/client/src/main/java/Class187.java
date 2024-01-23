import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class187 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
	private int anInt5674 = 0;

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "J")
	private long aLong215 = -1L;

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "J")
	private long aLong218 = -1L;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "Lclient!oe;")
	private Class126 aClass126_4;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "J")
	private long aLong216;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!oe;II)V")
	public Class187(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass126_4 = arg0;
		this.aLong217 = this.aLong213 = arg0.method3179();
		this.aByteArray71 = new byte[arg2];
		this.aByteArray72 = new byte[arg1];
		this.aLong216 = 0L;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[B)V")
	public void method4486(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4489(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(JI)V")
	public void method4487(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4490());
		}
		this.aLong216 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	private void method4488() throws IOException {
		this.anInt5673 = 0;
		if (this.aLong216 != this.aLong214) {
			this.aClass126_4.method3183(this.aLong216);
			this.aLong214 = this.aLong216;
		}
		this.aLong215 = this.aLong216;
		while (this.aByteArray72.length > this.anInt5673) {
			@Pc(53) int local53 = this.aByteArray72.length - this.anInt5673;
			if (local53 > 200000000) {
				local53 = 200000000;
			}
			@Pc(72) int local72 = this.aClass126_4.method3184(this.aByteArray72, this.anInt5673, local53);
			if (local72 == -1) {
				break;
			}
			this.aLong214 += local72;
			this.anInt5673 += local72;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B[BII)V")
	public void method4489(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong218 != -1L && this.aLong218 <= this.aLong216 && (long) arg1 + this.aLong216 <= this.aLong218 - -((long) this.anInt5674)) {
				Static319.method508(this.aByteArray71, (int) (this.aLong216 - this.aLong218), arg0, 0, arg1);
				this.aLong216 += arg1;
				return;
			}
			@Pc(80) long local80 = this.aLong216;
			@Pc(87) int local87 = arg1;
			@Pc(121) int local121;
			if (this.aLong216 >= this.aLong215 && this.aLong215 + (long) this.anInt5673 > this.aLong216) {
				local121 = (int) (this.aLong215 + (long) this.anInt5673 - this.aLong216);
				if (local121 > arg1) {
					local121 = arg1;
				}
				arg1 -= local121;
				Static319.method508(this.aByteArray72, (int) (this.aLong216 - this.aLong215), arg0, 0, local121);
				this.aLong216 += local121;
				arg2 = local121;
			}
			if (this.aByteArray72.length < arg1) {
				this.aClass126_4.method3183(this.aLong216);
				this.aLong214 = this.aLong216;
				while (arg1 > 0) {
					local121 = this.aClass126_4.method3184(arg0, arg2, arg1);
					if (local121 == -1) {
						break;
					}
					this.aLong214 += local121;
					this.aLong216 += local121;
					arg1 -= local121;
					arg2 += local121;
				}
			} else if (arg1 > 0) {
				this.method4488();
				local121 = arg1;
				if (arg1 > this.anInt5673) {
					local121 = this.anInt5673;
				}
				arg1 -= local121;
				Static319.method508(this.aByteArray72, 0, arg0, arg2, local121);
				this.aLong216 += local121;
				arg2 += local121;
			}
			if (this.aLong218 != -1L) {
				if (this.aLong218 > this.aLong216 && arg1 > 0) {
					local121 = (int) (this.aLong218 - this.aLong216) + arg2;
					if (local121 > arg1 + arg2) {
						local121 = arg2 + arg1;
					}
					while (arg2 < local121) {
						arg0[arg2++] = 0;
						this.aLong216++;
						arg1--;
					}
				}
				@Pc(317) long local317 = -1L;
				if (this.aLong218 >= local80 && this.aLong218 < local80 + (long) local87) {
					local317 = this.aLong218;
				} else if (this.aLong218 <= local80 && this.aLong218 + (long) this.anInt5674 > local80) {
					local317 = local80;
				}
				@Pc(362) long local362 = -1L;
				if (this.aLong218 + (long) this.anInt5674 > local80 && (long) local87 + local80 >= (long) this.anInt5674 + this.aLong218) {
					local362 = this.aLong218 + (long) this.anInt5674;
				} else if (this.aLong218 < local80 + (long) local87 && (long) local87 + local80 <= (long) this.anInt5674 + this.aLong218) {
					local362 = local80 + (long) local87;
				}
				if (local317 > -1L && local362 > local317) {
					@Pc(437) int local437 = (int) (local362 - local317);
					Static319.method508(this.aByteArray71, (int) (local317 - this.aLong218), arg0, (int) (local317 - local80), local437);
					if (this.aLong216 < local362) {
						arg1 = (int) ((long) arg1 + this.aLong216 - local362);
						this.aLong216 = local362;
					}
				}
			}
		} catch (@Pc(476) IOException local476) {
			this.aLong214 = -1L;
			throw local476;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method4490() {
		return this.aClass126_4.method3180();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III[B)V")
	public void method4491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong217 < this.aLong216 + (long) arg1) {
				this.aLong217 = this.aLong216 + (long) arg1;
			}
			if (this.aLong218 != -1L && (this.aLong216 < this.aLong218 || this.aLong216 > (long) this.anInt5674 + this.aLong218)) {
				this.method4495();
			}
			if ((long) -1 != this.aLong218 && (long) arg1 + this.aLong216 > this.aLong218 + (long) this.aByteArray71.length) {
				@Pc(89) int local89 = (int) ((long) this.aByteArray71.length + this.aLong218 - this.aLong216);
				arg1 -= local89;
				Static319.method508(arg2, arg0, this.aByteArray71, (int) (this.aLong216 - this.aLong218), local89);
				this.aLong216 += local89;
				arg0 += local89;
				this.anInt5674 = this.aByteArray71.length;
				this.method4495();
			}
			if (arg1 > this.aByteArray71.length) {
				if (this.aLong216 != this.aLong214) {
					this.aClass126_4.method3183(this.aLong216);
					this.aLong214 = this.aLong216;
				}
				this.aClass126_4.method3182(arg2, arg1, arg0);
				@Pc(162) long local162 = -1L;
				if (this.aLong215 <= this.aLong216 && this.aLong215 + (long) this.anInt5673 > this.aLong216) {
					local162 = this.aLong216;
				} else if (this.aLong216 <= this.aLong215 && this.aLong215 < this.aLong216 + (long) arg1) {
					local162 = this.aLong215;
				}
				this.aLong214 += arg1;
				if (this.aLong214 > this.aLong213) {
					this.aLong213 = this.aLong214;
				}
				@Pc(230) long local230 = -1L;
				if (this.aLong216 + (long) arg1 > this.aLong215 && (long) this.anInt5673 + this.aLong215 >= this.aLong216 - -((long) arg1)) {
					local230 = (long) arg1 + this.aLong216;
				} else if ((long) this.anInt5673 + this.aLong215 > this.aLong216 && this.aLong216 + (long) arg1 >= this.aLong215 - -((long) this.anInt5673)) {
					local230 = this.aLong215 + (long) this.anInt5673;
				}
				if (local162 > -1L && local230 > local162) {
					@Pc(321) int local321 = (int) (local230 - local162);
					Static319.method508(arg2, (int) ((long) arg0 + local162 - this.aLong216), this.aByteArray72, (int) (local162 - this.aLong215), local321);
				}
				this.aLong216 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong218 == -1L) {
					this.aLong218 = this.aLong216;
				}
				Static319.method508(arg2, arg0, this.aByteArray71, (int) (this.aLong216 - this.aLong218), arg1);
				this.aLong216 += arg1;
				if (this.aLong216 - this.aLong218 > (long) this.anInt5674) {
					this.anInt5674 = (int) (this.aLong216 - this.aLong218);
				}
			}
		} catch (@Pc(411) IOException local411) {
			this.aLong214 = -1L;
			throw local411;
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	private void method4495() throws IOException {
		if (this.aLong218 == -1L) {
			return;
		}
		if (this.aLong214 != this.aLong218) {
			this.aClass126_4.method3183(this.aLong218);
			this.aLong214 = this.aLong218;
		}
		@Pc(38) long local38 = -1L;
		this.aClass126_4.method3182(this.aByteArray71, this.anInt5674, 0);
		if (this.aLong218 >= this.aLong215 && (long) this.anInt5673 + this.aLong215 > this.aLong218) {
			local38 = this.aLong218;
		} else if (this.aLong215 >= this.aLong218 && (long) this.anInt5674 + this.aLong218 > this.aLong215) {
			local38 = this.aLong215;
		}
		@Pc(102) long local102 = -1L;
		this.aLong214 += this.anInt5674;
		if (this.aLong215 < (long) this.anInt5674 + this.aLong218 && this.aLong218 + (long) this.anInt5674 <= (long) this.anInt5673 + this.aLong215) {
			local102 = (long) this.anInt5674 + this.aLong218;
		} else if ((long) this.anInt5673 + this.aLong215 > this.aLong218 && this.aLong218 + (long) this.anInt5674 >= this.aLong215 + (long) this.anInt5673) {
			local102 = (long) this.anInt5673 + this.aLong215;
		}
		if (this.aLong214 > this.aLong213) {
			this.aLong213 = this.aLong214;
		}
		if (local38 > -1L && local102 > local38) {
			@Pc(211) int local211 = (int) (local102 - local38);
			Static319.method508(this.aByteArray71, (int) (local38 - this.aLong218), this.aByteArray72, (int) (local38 - this.aLong215), local211);
		}
		this.aLong218 = -1L;
		this.anInt5674 = 0;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)J")
	public long method4496() {
		return this.aLong217;
	}
}
