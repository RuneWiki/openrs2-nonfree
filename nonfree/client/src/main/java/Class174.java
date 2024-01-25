import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class174 {

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	private int anInt5641;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	private int anInt5644 = 0;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "J")
	private long aLong168 = -1L;

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "J")
	private long aLong172 = -1L;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "Lclient!mi;")
	private final Class130 aClass130_4;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "[B")
	private final byte[] aByteArray64;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "[B")
	private final byte[] aByteArray65;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!mi;II)V")
	public Class174(@OriginalArg(0) Class130 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass130_4 = arg0;
		this.aLong170 = this.aLong167 = arg0.method3573();
		this.aLong169 = 0L;
		this.aByteArray64 = new byte[arg1];
		this.aByteArray65 = new byte[arg2];
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)J")
	public long method5030() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	private void method5031() throws IOException {
		if (this.aLong168 == -1L) {
			return;
		}
		if (this.aLong171 != this.aLong168) {
			this.aClass130_4.method3569(this.aLong168);
			this.aLong171 = this.aLong168;
		}
		this.aClass130_4.method3570(this.aByteArray65, this.anInt5644, 0);
		this.aLong171 += this.anInt5644;
		if (this.aLong167 < this.aLong171) {
			this.aLong167 = this.aLong171;
		}
		@Pc(66) long local66 = -1L;
		@Pc(68) long local68 = -1L;
		if (this.aLong168 >= this.aLong172 && this.aLong168 < this.aLong172 + (long) this.anInt5641) {
			local66 = this.aLong168;
		} else if (this.aLong172 >= this.aLong168 && this.aLong168 + (long) this.anInt5644 > this.aLong172) {
			local66 = this.aLong172;
		}
		if (this.aLong168 + (long) this.anInt5644 > this.aLong172 && this.aLong168 + (long) this.anInt5644 <= this.aLong172 + (long) this.anInt5641) {
			local68 = (long) this.anInt5644 + this.aLong168;
		} else if (this.aLong172 + (long) this.anInt5641 > this.aLong168 && (long) this.anInt5644 + this.aLong168 >= this.aLong172 + (long) this.anInt5641) {
			local68 = this.aLong172 + (long) this.anInt5641;
		}
		if (local66 > -1L && local66 < local68) {
			@Pc(209) int local209 = (int) (local68 - local66);
			Static359.method687(this.aByteArray65, (int) (local66 - this.aLong168), this.aByteArray64, (int) (local66 - this.aLong172), local209);
		}
		this.anInt5644 = 0;
		this.aLong168 = -1L;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z[BII)V")
	public void method5033(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong170 < (long) arg1 + this.aLong169) {
				this.aLong170 = this.aLong169 + (long) arg1;
			}
			if (this.aLong168 != -1L && (this.aLong168 > this.aLong169 || (long) this.anInt5644 + this.aLong168 < this.aLong169)) {
				this.method5031();
			}
			if (this.aLong168 != -1L && this.aLong168 + (long) this.aByteArray65.length < this.aLong169 + (long) arg1) {
				@Pc(94) int local94 = (int) ((long) this.aByteArray65.length + this.aLong168 - this.aLong169);
				Static359.method687(arg0, arg2, this.aByteArray65, (int) (this.aLong169 - this.aLong168), local94);
				arg2 += local94;
				this.aLong169 += local94;
				arg1 -= local94;
				this.anInt5644 = this.aByteArray65.length;
				this.method5031();
			}
			if (arg1 > this.aByteArray65.length) {
				if (this.aLong171 != this.aLong169) {
					this.aClass130_4.method3569(this.aLong169);
					this.aLong171 = this.aLong169;
				}
				this.aClass130_4.method3570(arg0, arg1, arg2);
				this.aLong171 += arg1;
				if (this.aLong167 < this.aLong171) {
					this.aLong167 = this.aLong171;
				}
				@Pc(185) long local185 = -1L;
				if (this.aLong172 <= this.aLong169 && this.aLong172 + (long) this.anInt5641 > this.aLong169) {
					local185 = this.aLong169;
				} else if (this.aLong169 <= this.aLong172 && (long) arg1 + this.aLong169 > this.aLong172) {
					local185 = this.aLong172;
				}
				@Pc(226) long local226 = -1L;
				if (this.aLong172 < this.aLong169 + (long) arg1 && (long) this.anInt5641 + this.aLong172 >= this.aLong169 + (long) arg1) {
					local226 = (long) arg1 + this.aLong169;
				} else if (this.aLong169 < this.aLong172 + (long) this.anInt5641 && this.aLong169 + (long) arg1 >= this.aLong172 - -((long) this.anInt5641)) {
					local226 = (long) this.anInt5641 + this.aLong172;
				}
				if (local185 > -1L && local185 < local226) {
					@Pc(312) int local312 = (int) (local226 - local185);
					Static359.method687(arg0, (int) ((long) arg2 + local185 - this.aLong169), this.aByteArray64, (int) (local185 - this.aLong172), local312);
				}
				this.aLong169 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong168 == -1L) {
					this.aLong168 = this.aLong169;
				}
				Static359.method687(arg0, arg2, this.aByteArray65, (int) (this.aLong169 - this.aLong168), arg1);
				this.aLong169 += arg1;
				if ((long) this.anInt5644 < this.aLong169 - this.aLong168) {
					this.anInt5644 = (int) (this.aLong169 - this.aLong168);
				}
			}
		} catch (@Pc(397) IOException local397) {
			this.aLong171 = -1L;
			throw local397;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI[BI)V")
	public void method5034(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong168 != -1L && this.aLong169 >= this.aLong168 && (long) arg0 + this.aLong169 <= this.aLong168 + (long) this.anInt5644) {
				Static359.method687(this.aByteArray65, (int) (this.aLong169 - this.aLong168), arg1, 0, arg0);
				this.aLong169 += arg0;
				return;
			}
			@Pc(77) long local77 = this.aLong169;
			@Pc(81) int local81 = arg0;
			@Pc(119) int local119;
			if (this.aLong169 >= this.aLong172 && this.aLong172 + (long) this.anInt5641 > this.aLong169) {
				local119 = (int) (this.aLong172 + (long) this.anInt5641 - this.aLong169);
				if (arg0 < local119) {
					local119 = arg0;
				}
				Static359.method687(this.aByteArray64, (int) (this.aLong169 - this.aLong172), arg1, 0, local119);
				this.aLong169 += local119;
				arg2 = local119;
				arg0 -= local119;
			}
			if (arg0 > this.aByteArray64.length) {
				this.aClass130_4.method3569(this.aLong169);
				this.aLong171 = this.aLong169;
				while (arg0 > 0) {
					local119 = this.aClass130_4.method3572(arg0, arg1, arg2);
					if (local119 == -1) {
						break;
					}
					arg2 += local119;
					this.aLong169 += local119;
					arg0 -= local119;
					this.aLong171 += local119;
				}
			} else if (arg0 > 0) {
				this.method5038();
				local119 = arg0;
				if (this.anInt5641 < arg0) {
					local119 = this.anInt5641;
				}
				Static359.method687(this.aByteArray64, 0, arg1, arg2, local119);
				arg0 -= local119;
				arg2 += local119;
				this.aLong169 += local119;
			}
			if (this.aLong168 != -1L) {
				if (this.aLong169 < this.aLong168 && arg0 > 0) {
					local119 = (int) (this.aLong168 - this.aLong169) + arg2;
					if (arg0 + arg2 < local119) {
						local119 = arg0 + arg2;
					}
					while (local119 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong169++;
					}
				}
				@Pc(311) long local311 = -1L;
				@Pc(313) long local313 = -1L;
				if (local77 <= this.aLong168 && local77 + (long) local81 > this.aLong168) {
					local311 = this.aLong168;
				} else if (this.aLong168 <= local77 && this.aLong168 + (long) this.anInt5644 > local77) {
					local311 = local77;
				}
				if (local77 < (long) this.anInt5644 + this.aLong168 && local77 + (long) local81 >= (long) this.anInt5644 + this.aLong168) {
					local313 = (long) this.anInt5644 + this.aLong168;
				} else if (this.aLong168 < local77 + (long) local81 && this.aLong168 + (long) this.anInt5644 >= (long) local81 + local77) {
					local313 = local77 + (long) local81;
				}
				if (local311 > -1L && local311 < local313) {
					@Pc(444) int local444 = (int) (local313 - local311);
					Static359.method687(this.aByteArray65, (int) (local311 - this.aLong168), arg1, (int) (local311 - local77), local444);
					if (local313 > this.aLong169) {
						arg0 = (int) ((long) arg0 + this.aLong169 - local313);
						this.aLong169 = local313;
					}
				}
			}
		} catch (@Pc(484) IOException local484) {
			this.aLong171 = -1L;
			throw local484;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(JB)V")
	public void method5036(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method5037());
		}
		this.aLong169 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)Ljava/io/File;")
	private File method5037() {
		return this.aClass130_4.method3571();
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	private void method5038() throws IOException {
		this.anInt5641 = 0;
		if (this.aLong169 != this.aLong171) {
			this.aClass130_4.method3569(this.aLong169);
			this.aLong171 = this.aLong169;
		}
		this.aLong172 = this.aLong169;
		while (this.anInt5641 < this.aByteArray64.length) {
			@Pc(47) int local47 = this.aByteArray64.length - this.anInt5641;
			if (local47 > 200000000) {
				local47 = 200000000;
			}
			@Pc(62) int local62 = this.aClass130_4.method3572(local47, this.aByteArray64, this.anInt5641);
			if (local62 == -1) {
				break;
			}
			this.anInt5641 += local62;
			this.aLong171 += local62;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([BB)V")
	public void method5039(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method5034(arg0.length, arg0, 0);
	}
}
