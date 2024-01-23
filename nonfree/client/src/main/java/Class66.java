import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class66 {

	@OriginalMember(owner = "client!me", name = "o", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "I")
	private int anInt2702;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	private int anInt2701 = 0;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "J")
	private long aLong87 = -1L;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "J")
	private long aLong89 = -1L;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!kg;")
	private Class59 aClass59_4;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!kg;II)V")
	public Class66(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass59_4 = arg0;
		this.aLong90 = this.aLong86 = arg0.method1791();
		this.aByteArray37 = new byte[arg2];
		this.aLong91 = 0L;
		this.aByteArray36 = new byte[arg1];
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)V")
	public void method2028(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2035(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JB)V")
	public void method2030(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2041());
		}
		this.aLong91 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public void method2034() throws IOException {
		this.method2039();
		this.aClass59_4.method1787();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI[B)V")
	public void method2035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong89 != -1L && this.aLong89 <= this.aLong91 && (long) this.anInt2701 + this.aLong89 >= this.aLong91 - -((long) arg0)) {
				Static221.method35(this.aByteArray37, (int) (this.aLong91 - this.aLong89), arg2, 0, arg0);
				this.aLong91 += arg0;
				return;
			}
			@Pc(84) int local84 = arg0;
			@Pc(87) long local87 = this.aLong91;
			@Pc(124) int local124;
			if (this.aLong87 <= this.aLong91 && this.aLong87 + (long) this.anInt2702 > this.aLong91) {
				local124 = (int) (this.aLong87 + (long) this.anInt2702 - this.aLong91);
				if (local124 > arg0) {
					local124 = arg0;
				}
				arg0 -= local124;
				Static221.method35(this.aByteArray36, (int) (this.aLong91 - this.aLong87), arg2, 0, local124);
				this.aLong91 += local124;
				arg1 = local124;
			}
			if (arg0 > this.aByteArray36.length) {
				this.aClass59_4.method1786(this.aLong91);
				this.aLong88 = this.aLong91;
				while (arg0 > 0) {
					local124 = this.aClass59_4.method1788(arg2, arg0, arg1);
					if (local124 == -1) {
						break;
					}
					arg0 -= local124;
					this.aLong91 += local124;
					arg1 += local124;
					this.aLong88 += local124;
				}
			} else if (arg0 > 0) {
				this.method2040();
				local124 = arg0;
				if (arg0 > this.anInt2702) {
					local124 = this.anInt2702;
				}
				Static221.method35(this.aByteArray36, 0, arg2, arg1, local124);
				arg0 -= local124;
				arg1 += local124;
				this.aLong91 += local124;
			}
			if (this.aLong89 != -1L) {
				if (this.aLong89 > this.aLong91 && arg0 > 0) {
					local124 = arg1 + (int) (this.aLong89 - this.aLong91);
					if (arg1 + arg0 < local124) {
						local124 = arg0 + arg1;
					}
					while (local124 > arg1) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong91++;
					}
				}
				@Pc(311) long local311 = -1L;
				if (local87 <= this.aLong89 && this.aLong89 < local87 + (long) local84) {
					local311 = this.aLong89;
				} else if (local87 >= this.aLong89 && this.aLong89 + (long) this.anInt2701 > local87) {
					local311 = local87;
				}
				@Pc(353) long local353 = -1L;
				if (local87 < this.aLong89 + (long) this.anInt2701 && this.aLong89 + (long) this.anInt2701 <= local87 - -((long) local84)) {
					local353 = (long) this.anInt2701 + this.aLong89;
				} else if (local87 + (long) local84 > this.aLong89 && local87 + (long) local84 <= this.aLong89 + (long) this.anInt2701) {
					local353 = (long) local84 + local87;
				}
				if (local311 > -1L && local353 > local311) {
					@Pc(444) int local444 = (int) (local353 - local311);
					Static221.method35(this.aByteArray37, (int) (local311 - this.aLong89), arg2, (int) (local311 - local87), local444);
					if (local353 > this.aLong91) {
						arg0 = (int) ((long) arg0 + this.aLong91 - local353);
						this.aLong91 = local353;
					}
				}
			}
		} catch (@Pc(486) IOException local486) {
			this.aLong88 = -1L;
			throw local486;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BIII)V")
	public void method2037(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong90 < this.aLong91 + (long) arg1) {
				this.aLong90 = (long) arg1 + this.aLong91;
			}
			if (this.aLong89 != -1L && (this.aLong89 > this.aLong91 || (long) this.anInt2701 + this.aLong89 < this.aLong91)) {
				this.method2039();
			}
			if (this.aLong89 != -1L && this.aLong91 + (long) arg1 > (long) this.aByteArray37.length + this.aLong89) {
				@Pc(93) int local93 = (int) ((long) this.aByteArray37.length + this.aLong89 - this.aLong91);
				arg1 -= local93;
				Static221.method35(arg0, arg2, this.aByteArray37, (int) (this.aLong91 - this.aLong89), local93);
				arg2 += local93;
				this.aLong91 += local93;
				this.anInt2701 = this.aByteArray37.length;
				this.method2039();
			}
			if (this.aByteArray37.length < arg1) {
				if (this.aLong88 != this.aLong91) {
					this.aClass59_4.method1786(this.aLong91);
					this.aLong88 = this.aLong91;
				}
				this.aClass59_4.method1789(arg2, arg1, arg0);
				this.aLong88 += arg1;
				@Pc(174) long local174 = -1L;
				if (this.aLong91 >= this.aLong87 && this.aLong91 < this.aLong87 + (long) this.anInt2702) {
					local174 = this.aLong91;
				} else if (this.aLong91 <= this.aLong87 && this.aLong87 < (long) arg1 + this.aLong91) {
					local174 = this.aLong87;
				}
				if (this.aLong88 > this.aLong86) {
					this.aLong86 = this.aLong88;
				}
				@Pc(242) long local242 = -1L;
				if (this.aLong91 + (long) arg1 > this.aLong87 && this.aLong91 + (long) arg1 <= this.aLong87 + (long) this.anInt2702) {
					local242 = (long) arg1 + this.aLong91;
				} else if (this.aLong91 < this.aLong87 + (long) this.anInt2702 && this.aLong91 + (long) arg1 >= this.aLong87 - -((long) this.anInt2702)) {
					local242 = (long) this.anInt2702 + this.aLong87;
				}
				if (local174 > -1L && local242 > local174) {
					@Pc(323) int local323 = (int) (local242 - local174);
					Static221.method35(arg0, (int) ((long) arg2 + local174 - this.aLong91), this.aByteArray36, (int) (local174 - this.aLong87), local323);
				}
				this.aLong91 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong89 == -1L) {
					this.aLong89 = this.aLong91;
				}
				Static221.method35(arg0, arg2, this.aByteArray37, (int) (this.aLong91 - this.aLong89), arg1);
				this.aLong91 += arg1;
				if ((long) this.anInt2701 < this.aLong91 - this.aLong89) {
					this.anInt2701 = (int) (this.aLong91 - this.aLong89);
				}
			}
		} catch (@Pc(415) IOException local415) {
			this.aLong88 = -1L;
			throw local415;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)J")
	public long method2038() {
		return this.aLong90;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	private void method2039() throws IOException {
		if (this.aLong89 == -1L) {
			return;
		}
		if (this.aLong88 != this.aLong89) {
			this.aClass59_4.method1786(this.aLong89);
			this.aLong88 = this.aLong89;
		}
		this.aClass59_4.method1789(0, this.anInt2701, this.aByteArray37);
		@Pc(44) long local44 = -1L;
		@Pc(46) long local46 = -1L;
		if (this.aLong87 < this.aLong89 + (long) this.anInt2701 && (long) this.anInt2701 + this.aLong89 <= (long) this.anInt2702 + this.aLong87) {
			local46 = (long) this.anInt2701 + this.aLong89;
		} else if (this.aLong87 + (long) this.anInt2702 > this.aLong89 && this.aLong87 + (long) this.anInt2702 <= (long) this.anInt2701 + this.aLong89) {
			local46 = this.aLong87 + (long) this.anInt2702;
		}
		if (this.aLong87 <= this.aLong89 && this.aLong87 + (long) this.anInt2702 > this.aLong89) {
			local44 = this.aLong89;
		} else if (this.aLong89 <= this.aLong87 && (long) this.anInt2701 + this.aLong89 > this.aLong87) {
			local44 = this.aLong87;
		}
		this.aLong88 += this.anInt2701;
		if (this.aLong86 < this.aLong88) {
			this.aLong86 = this.aLong88;
		}
		if (local44 > -1L && local46 > local44) {
			@Pc(215) int local215 = (int) (local46 - local44);
			Static221.method35(this.aByteArray37, (int) (local44 - this.aLong89), this.aByteArray36, (int) (local44 - this.aLong87), local215);
		}
		this.aLong89 = -1L;
		this.anInt2701 = 0;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	private void method2040() throws IOException {
		this.anInt2702 = 0;
		if (this.aLong88 != this.aLong91) {
			this.aClass59_4.method1786(this.aLong91);
			this.aLong88 = this.aLong91;
		}
		this.aLong87 = this.aLong91;
		while (this.anInt2702 < this.aByteArray36.length) {
			@Pc(45) int local45 = this.aByteArray36.length - this.anInt2702;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(60) int local60 = this.aClass59_4.method1788(this.aByteArray36, local45, this.anInt2702);
			if (local60 == -1) {
				break;
			}
			this.anInt2702 += local60;
			this.aLong88 += local60;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method2041() {
		return this.aClass59_4.method1790();
	}
}
