import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class227 {

	@OriginalMember(owner = "client!so", name = "m", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "I")
	private int anInt6437;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	private int anInt6433 = 0;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "J")
	private long aLong223 = -1L;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "J")
	private long aLong225 = -1L;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!hl;")
	private final Class108 aClass108_4;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "J")
	private long aLong224;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "[B")
	private final byte[] aByteArray83;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "[B")
	private final byte[] aByteArray82;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!hl;II)V")
	public Class227(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass108_4 = arg0;
		this.aLong221 = this.aLong224 = arg0.method2645();
		this.aLong220 = 0L;
		this.aByteArray83 = new byte[arg2];
		this.aByteArray82 = new byte[arg1];
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II[BB)V")
	public void method4991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong223 != -1L && this.aLong223 <= this.aLong220 && this.aLong223 + (long) this.anInt6433 >= (long) arg1 + this.aLong220) {
				Static468.method4350(this.aByteArray83, (int) (this.aLong220 - this.aLong223), arg2, 0, arg1);
				this.aLong220 += arg1;
				return;
			}
			@Pc(82) long local82 = this.aLong220;
			@Pc(86) int local86 = arg1;
			@Pc(122) int local122;
			if (this.aLong220 >= this.aLong225 && this.aLong220 < (long) this.anInt6437 + this.aLong225) {
				local122 = (int) ((long) this.anInt6437 + this.aLong225 - this.aLong220);
				if (local122 > arg1) {
					local122 = arg1;
				}
				Static468.method4350(this.aByteArray82, (int) (this.aLong220 - this.aLong225), arg2, 0, local122);
				arg0 = local122;
				this.aLong220 += local122;
				arg1 -= local122;
			}
			if (arg1 > this.aByteArray82.length) {
				this.aClass108_4.method2644(this.aLong220);
				this.aLong222 = this.aLong220;
				while (arg1 > 0) {
					local122 = this.aClass108_4.method2646(arg0, arg2, arg1);
					if (local122 == -1) {
						break;
					}
					arg1 -= local122;
					arg0 += local122;
					this.aLong220 += local122;
					this.aLong222 += local122;
				}
			} else if (arg1 > 0) {
				this.method5000();
				local122 = arg1;
				if (arg1 > this.anInt6437) {
					local122 = this.anInt6437;
				}
				Static468.method4350(this.aByteArray82, 0, arg2, arg0, local122);
				arg1 -= local122;
				this.aLong220 += local122;
				arg0 += local122;
			}
			if (this.aLong223 != -1L) {
				if (this.aLong223 > this.aLong220 && arg1 > 0) {
					local122 = arg0 + (int) (this.aLong223 - this.aLong220);
					if (arg1 + arg0 < local122) {
						local122 = arg1 + arg0;
					}
					while (local122 > arg0) {
						arg2[arg0++] = 0;
						arg1--;
						this.aLong220++;
					}
				}
				@Pc(310) long local310 = -1L;
				@Pc(312) long local312 = -1L;
				if (this.aLong223 >= local82 && this.aLong223 < local82 + (long) local86) {
					local310 = this.aLong223;
				} else if (local82 >= this.aLong223 && (long) this.anInt6433 + this.aLong223 > local82) {
					local310 = local82;
				}
				if ((long) this.anInt6433 + this.aLong223 > local82 && this.aLong223 + (long) this.anInt6433 <= local82 + (long) local86) {
					local312 = this.aLong223 + (long) this.anInt6433;
				} else if ((long) local86 + local82 > this.aLong223 && (long) local86 + local82 <= (long) this.anInt6433 + this.aLong223) {
					local312 = (long) local86 + local82;
				}
				if (local310 > -1L && local312 > local310) {
					@Pc(426) int local426 = (int) (local312 - local310);
					Static468.method4350(this.aByteArray83, (int) (local310 - this.aLong223), arg2, (int) (local310 - local82), local426);
					if (this.aLong220 < local312) {
						arg1 = (int) ((long) arg1 + this.aLong220 - local312);
						this.aLong220 = local312;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong222 = -1L;
			throw local467;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([BIII)V")
	public void method4992(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong221 < (long) arg1 + this.aLong220) {
				this.aLong221 = this.aLong220 + (long) arg1;
			}
			if (this.aLong223 != -1L && (this.aLong220 < this.aLong223 || this.aLong220 > this.aLong223 + (long) this.anInt6433)) {
				this.method4998();
			}
			if (this.aLong223 != -1L && (long) this.aByteArray83.length + this.aLong223 < this.aLong220 - -((long) arg1)) {
				@Pc(97) int local97 = (int) ((long) this.aByteArray83.length + this.aLong223 - this.aLong220);
				Static468.method4350(arg0, arg2, this.aByteArray83, (int) (this.aLong220 - this.aLong223), local97);
				this.aLong220 += local97;
				arg1 -= local97;
				arg2 += local97;
				this.anInt6433 = this.aByteArray83.length;
				this.method4998();
			}
			if (this.aByteArray83.length < arg1) {
				if (this.aLong220 != this.aLong222) {
					this.aClass108_4.method2644(this.aLong220);
					this.aLong222 = this.aLong220;
				}
				this.aClass108_4.method2648(arg0, arg2, arg1);
				this.aLong222 += arg1;
				if (this.aLong222 > this.aLong224) {
					this.aLong224 = this.aLong222;
				}
				@Pc(185) long local185 = -1L;
				if (this.aLong220 >= this.aLong225 && this.aLong220 < this.aLong225 + (long) this.anInt6437) {
					local185 = this.aLong220;
				} else if (this.aLong220 <= this.aLong225 && this.aLong225 < (long) arg1 + this.aLong220) {
					local185 = this.aLong225;
				}
				@Pc(231) long local231 = -1L;
				if (this.aLong225 < (long) arg1 + this.aLong220 && (long) arg1 + this.aLong220 <= this.aLong225 - -((long) this.anInt6437)) {
					local231 = (long) arg1 + this.aLong220;
				} else if (this.aLong225 + (long) this.anInt6437 > this.aLong220 && this.aLong225 + (long) this.anInt6437 <= this.aLong220 + (long) arg1) {
					local231 = (long) this.anInt6437 + this.aLong225;
				}
				if (local185 > -1L && local231 > local185) {
					@Pc(312) int local312 = (int) (local231 - local185);
					Static468.method4350(arg0, (int) (local185 + (long) arg2 - this.aLong220), this.aByteArray82, (int) (local185 - this.aLong225), local312);
				}
				this.aLong220 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong223 == -1L) {
					this.aLong223 = this.aLong220;
				}
				Static468.method4350(arg0, arg2, this.aByteArray83, (int) (this.aLong220 - this.aLong223), arg1);
				this.aLong220 += arg1;
				if (this.aLong220 - this.aLong223 > (long) this.anInt6433) {
					this.anInt6433 = (int) (this.aLong220 - this.aLong223);
				}
			}
		} catch (@Pc(400) IOException local400) {
			this.aLong222 = -1L;
			throw local400;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method4994() {
		return this.aClass108_4.method2647();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)J")
	public long method4995() {
		return this.aLong221;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IJ)V")
	public void method4997(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4994());
		}
		this.aLong220 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V")
	private void method4998() throws IOException {
		if (this.aLong223 == -1L) {
			return;
		}
		if (this.aLong222 != this.aLong223) {
			this.aClass108_4.method2644(this.aLong223);
			this.aLong222 = this.aLong223;
		}
		this.aClass108_4.method2648(this.aByteArray83, 0, this.anInt6433);
		this.aLong222 += this.anInt6433;
		if (this.aLong222 > this.aLong224) {
			this.aLong224 = this.aLong222;
		}
		@Pc(68) long local68 = -1L;
		if (this.aLong225 <= this.aLong223 && (long) this.anInt6437 + this.aLong225 > this.aLong223) {
			local68 = this.aLong223;
		} else if (this.aLong223 <= this.aLong225 && (long) this.anInt6433 + this.aLong223 > this.aLong225) {
			local68 = this.aLong225;
		}
		@Pc(114) long local114 = -1L;
		if (this.aLong223 + (long) this.anInt6433 > this.aLong225 && (long) this.anInt6437 + this.aLong225 >= (long) this.anInt6433 + this.aLong223) {
			local114 = this.aLong223 + (long) this.anInt6433;
		} else if (this.aLong225 + (long) this.anInt6437 > this.aLong223 && (long) this.anInt6433 + this.aLong223 >= (long) this.anInt6437 + this.aLong225) {
			local114 = (long) this.anInt6437 + this.aLong225;
		}
		if (local68 > -1L && local114 > local68) {
			@Pc(206) int local206 = (int) (local114 - local68);
			Static468.method4350(this.aByteArray83, (int) (local68 - this.aLong223), this.aByteArray82, (int) (local68 - this.aLong225), local206);
		}
		this.aLong223 = -1L;
		this.anInt6433 = 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B[B)V")
	public void method4999(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4991(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
	private void method5000() throws IOException {
		this.anInt6437 = 0;
		if (this.aLong220 != this.aLong222) {
			this.aClass108_4.method2644(this.aLong220);
			this.aLong222 = this.aLong220;
		}
		this.aLong225 = this.aLong220;
		while (this.aByteArray82.length > this.anInt6437) {
			@Pc(46) int local46 = this.aByteArray82.length - this.anInt6437;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(61) int local61 = this.aClass108_4.method2646(this.anInt6437, this.aByteArray82, local46);
			if (local61 == -1) {
				break;
			}
			this.anInt6437 += local61;
			this.aLong222 += local61;
		}
	}
}
