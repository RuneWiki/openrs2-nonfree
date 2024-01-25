import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class318 {

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
	private int anInt9060;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	private int anInt9053 = 0;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "J")
	private long aLong221 = -1L;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "J")
	private long aLong222 = -1L;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Lclient!ip;")
	private final Class155 aClass155_4;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "J")
	private long aLong223;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "J")
	private long aLong219;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "[B")
	private final byte[] aByteArray120;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "[B")
	private final byte[] aByteArray119;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!ip;II)V")
	public Class318(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass155_4 = arg0;
		this.aLong219 = this.aLong223 = arg0.method4076();
		this.aByteArray120 = new byte[arg1];
		this.aLong220 = 0L;
		this.aByteArray119 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([BIBI)V")
	public void method7600(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong222 != -1L && this.aLong222 <= this.aLong220 && this.aLong220 + (long) arg1 <= (long) this.anInt9053 + this.aLong222) {
				Static589.method5382(this.aByteArray119, (int) (this.aLong220 - this.aLong222), arg0, 0, arg1);
				this.aLong220 += arg1;
				return;
			}
			@Pc(76) long local76 = this.aLong220;
			@Pc(80) int local80 = arg1;
			@Pc(112) int local112;
			if (this.aLong221 <= this.aLong220 && (long) this.anInt9060 + this.aLong221 > this.aLong220) {
				local112 = (int) (this.aLong221 + (long) this.anInt9060 - this.aLong220);
				if (local112 > arg1) {
					local112 = arg1;
				}
				Static589.method5382(this.aByteArray120, (int) (this.aLong220 - this.aLong221), arg0, 0, local112);
				arg2 = local112;
				arg1 -= local112;
				this.aLong220 += local112;
			}
			if (arg1 > this.aByteArray120.length) {
				this.aClass155_4.method4078(this.aLong220);
				this.aLong224 = this.aLong220;
				while (arg1 > 0) {
					local112 = this.aClass155_4.method4074(arg0, arg1, arg2);
					if (local112 == -1) {
						break;
					}
					this.aLong224 += local112;
					arg1 -= local112;
					this.aLong220 += local112;
					arg2 += local112;
				}
			} else if (arg1 > 0) {
				this.method7602();
				local112 = arg1;
				if (arg1 > this.anInt9060) {
					local112 = this.anInt9060;
				}
				Static589.method5382(this.aByteArray120, 0, arg0, arg2, local112);
				this.aLong220 += local112;
				arg2 += local112;
				arg1 -= local112;
			}
			if (this.aLong222 != -1L) {
				if (this.aLong220 < this.aLong222 && arg1 > 0) {
					local112 = (int) (this.aLong222 - this.aLong220) + arg2;
					if (arg2 + arg1 < local112) {
						local112 = arg2 + arg1;
					}
					while (local112 > arg2) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong220++;
					}
				}
				@Pc(310) long local310 = -1L;
				@Pc(312) long local312 = -1L;
				if (this.aLong222 >= local76 && this.aLong222 < (long) local80 + local76) {
					local310 = this.aLong222;
				} else if (local76 >= this.aLong222 && local76 < (long) this.anInt9053 + this.aLong222) {
					local310 = local76;
				}
				if ((long) this.anInt9053 + this.aLong222 > local76 && local76 + (long) local80 >= this.aLong222 + (long) this.anInt9053) {
					local312 = this.aLong222 + (long) this.anInt9053;
				} else if (this.aLong222 < local76 + (long) local80 && (long) this.anInt9053 + this.aLong222 >= local76 + (long) local80) {
					local312 = local76 + (long) local80;
				}
				if (local310 > -1L && local310 < local312) {
					@Pc(433) int local433 = (int) (local312 - local310);
					Static589.method5382(this.aByteArray119, (int) (local310 - this.aLong222), arg0, (int) (local310 - local76), local433);
					if (this.aLong220 < local312) {
						arg1 = (int) ((long) arg1 + this.aLong220 - local312);
						this.aLong220 = local312;
					}
				}
			}
		} catch (@Pc(469) IOException local469) {
			this.aLong224 = -1L;
			throw local469;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method7601() throws IOException {
		this.method7603();
		this.aClass155_4.method4077();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	private void method7602() throws IOException {
		this.anInt9060 = 0;
		if (this.aLong224 != this.aLong220) {
			this.aClass155_4.method4078(this.aLong220);
			this.aLong224 = this.aLong220;
		}
		this.aLong221 = this.aLong220;
		while (this.anInt9060 < this.aByteArray120.length) {
			@Pc(41) int local41 = this.aByteArray120.length - this.anInt9060;
			if (local41 > 200000000) {
				local41 = 200000000;
			}
			@Pc(58) int local58 = this.aClass155_4.method4074(this.aByteArray120, local41, this.anInt9060);
			if (local58 == -1) {
				break;
			}
			this.aLong224 += local58;
			this.anInt9060 += local58;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	private void method7603() throws IOException {
		if (this.aLong222 == -1L) {
			return;
		}
		if (this.aLong224 != this.aLong222) {
			this.aClass155_4.method4078(this.aLong222);
			this.aLong224 = this.aLong222;
		}
		this.aClass155_4.method4079(this.anInt9053, this.aByteArray119, 0);
		this.aLong224 += this.anInt9053;
		if (this.aLong223 < this.aLong224) {
			this.aLong223 = this.aLong224;
		}
		@Pc(57) long local57 = -1L;
		@Pc(59) long local59 = -1L;
		if (this.aLong222 >= this.aLong221 && (long) this.anInt9060 + this.aLong221 > this.aLong222) {
			local57 = this.aLong222;
		} else if (this.aLong222 <= this.aLong221 && this.aLong221 < (long) this.anInt9053 + this.aLong222) {
			local57 = this.aLong221;
		}
		if (this.aLong221 < this.aLong222 + (long) this.anInt9053 && (long) this.anInt9060 + this.aLong221 >= (long) this.anInt9053 + this.aLong222) {
			local59 = this.aLong222 + (long) this.anInt9053;
		} else if (this.aLong221 + (long) this.anInt9060 > this.aLong222 && (long) this.anInt9060 + this.aLong221 <= this.aLong222 - -((long) this.anInt9053)) {
			local59 = (long) this.anInt9060 + this.aLong221;
		}
		if (local57 > -1L && local57 < local59) {
			@Pc(205) int local205 = (int) (local59 - local57);
			Static589.method5382(this.aByteArray119, (int) (local57 - this.aLong222), this.aByteArray120, (int) (local57 - this.aLong221), local205);
		}
		this.anInt9053 = 0;
		this.aLong222 = -1L;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([BI)V")
	public void method7604(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method7600(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)J")
	public long method7605() {
		return this.aLong219;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(JI)V")
	public void method7606(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method7607());
		}
		this.aLong220 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method7607() {
		return this.aClass155_4.method4080();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[BII)V")
	public void method7608(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong220 + (long) arg0 > this.aLong219) {
				this.aLong219 = (long) arg0 + this.aLong220;
			}
			if (this.aLong222 != -1L && (this.aLong222 > this.aLong220 || this.aLong222 + (long) this.anInt9053 < this.aLong220)) {
				this.method7603();
			}
			if (this.aLong222 != -1L && this.aLong222 + (long) this.aByteArray119.length < (long) arg0 + this.aLong220) {
				@Pc(89) int local89 = (int) ((long) this.aByteArray119.length + this.aLong222 - this.aLong220);
				Static589.method5382(arg1, arg2, this.aByteArray119, (int) (this.aLong220 - this.aLong222), local89);
				this.aLong220 += local89;
				arg0 -= local89;
				arg2 += local89;
				this.anInt9053 = this.aByteArray119.length;
				this.method7603();
			}
			if (arg0 > this.aByteArray119.length) {
				if (this.aLong224 != this.aLong220) {
					this.aClass155_4.method4078(this.aLong220);
					this.aLong224 = this.aLong220;
				}
				this.aClass155_4.method4079(arg0, arg1, arg2);
				this.aLong224 += arg0;
				if (this.aLong224 > this.aLong223) {
					this.aLong223 = this.aLong224;
				}
				@Pc(177) long local177 = -1L;
				@Pc(179) long local179 = -1L;
				if (this.aLong220 >= this.aLong221 && (long) this.anInt9060 + this.aLong221 > this.aLong220) {
					local177 = this.aLong220;
				} else if (this.aLong221 >= this.aLong220 && this.aLong221 < (long) arg0 + this.aLong220) {
					local177 = this.aLong221;
				}
				if (this.aLong221 < (long) arg0 + this.aLong220 && (long) arg0 + this.aLong220 <= this.aLong221 - -((long) this.anInt9060)) {
					local179 = this.aLong220 + (long) arg0;
				} else if (this.aLong220 < (long) this.anInt9060 + this.aLong221 && (long) arg0 + this.aLong220 >= this.aLong221 + (long) this.anInt9060) {
					local179 = this.aLong221 + (long) this.anInt9060;
				}
				if (local177 > -1L && local177 < local179) {
					@Pc(309) int local309 = (int) (local179 - local177);
					Static589.method5382(arg1, (int) ((long) arg2 + local177 - this.aLong220), this.aByteArray120, (int) (local177 - this.aLong221), local309);
				}
				this.aLong220 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong222 == -1L) {
					this.aLong222 = this.aLong220;
				}
				Static589.method5382(arg1, arg2, this.aByteArray119, (int) (this.aLong220 - this.aLong222), arg0);
				this.aLong220 += arg0;
				if ((long) this.anInt9053 < this.aLong220 - this.aLong222) {
					this.anInt9053 = (int) (this.aLong220 - this.aLong222);
				}
			}
		} catch (@Pc(398) IOException local398) {
			this.aLong224 = -1L;
			throw local398;
		}
	}
}
