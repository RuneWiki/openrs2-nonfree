import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class190 {

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	private int anInt5752;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "J")
	private long aLong171 = -1L;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	private int anInt5757 = 0;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "J")
	private long aLong167 = -1L;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Lclient!ib;")
	private final Class90 aClass90_4;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "[B")
	private final byte[] aByteArray86;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ib;II)V")
	public Class190(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass90_4 = arg0;
		this.aLong169 = this.aLong168 = arg0.method2567();
		this.aLong172 = 0L;
		this.aByteArray87 = new byte[arg1];
		this.aByteArray86 = new byte[arg2];
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	private void method4923() throws IOException {
		if (this.aLong171 == -1L) {
			return;
		}
		if (this.aLong170 != this.aLong171) {
			this.aClass90_4.method2562(this.aLong171);
			this.aLong170 = this.aLong171;
		}
		this.aClass90_4.method2564(this.anInt5757, 0, this.aByteArray86);
		this.aLong170 += this.anInt5757;
		if (this.aLong170 > this.aLong168) {
			this.aLong168 = this.aLong170;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong171 >= this.aLong167 && this.aLong167 + (long) this.anInt5752 > this.aLong171) {
			local65 = this.aLong171;
		} else if (this.aLong171 <= this.aLong167 && this.aLong171 + (long) this.anInt5757 > this.aLong167) {
			local65 = this.aLong167;
		}
		if (this.aLong167 < this.aLong171 + (long) this.anInt5757 && (long) this.anInt5752 + this.aLong167 >= (long) this.anInt5757 + this.aLong171) {
			local67 = this.aLong171 + (long) this.anInt5757;
		} else if ((long) this.anInt5752 + this.aLong167 > this.aLong171 && (long) this.anInt5757 + this.aLong171 >= (long) this.anInt5752 + this.aLong167) {
			local67 = this.aLong167 + (long) this.anInt5752;
		}
		if (local65 > -1L && local65 < local67) {
			@Pc(211) int local211 = (int) (local67 - local65);
			Static361.method1335(this.aByteArray86, (int) (local65 - this.aLong171), this.aByteArray87, (int) (local65 - this.aLong167), local211);
		}
		this.anInt5757 = 0;
		this.aLong171 = -1L;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BBII)V")
	public void method4925(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong171 != -1L && this.aLong171 <= this.aLong172 && this.aLong171 + (long) this.anInt5757 >= (long) arg2 + this.aLong172) {
				Static361.method1335(this.aByteArray86, (int) (this.aLong172 - this.aLong171), arg0, 0, arg2);
				this.aLong172 += arg2;
				return;
			}
			@Pc(88) long local88 = this.aLong172;
			@Pc(92) int local92 = arg2;
			@Pc(128) int local128;
			if (this.aLong167 <= this.aLong172 && (long) this.anInt5752 + this.aLong167 > this.aLong172) {
				local128 = (int) ((long) this.anInt5752 + this.aLong167 - this.aLong172);
				if (arg2 < local128) {
					local128 = arg2;
				}
				Static361.method1335(this.aByteArray87, (int) (this.aLong172 - this.aLong167), arg0, 0, local128);
				this.aLong172 += local128;
				arg1 = local128;
				arg2 -= local128;
			}
			if (arg2 > this.aByteArray87.length) {
				this.aClass90_4.method2562(this.aLong172);
				this.aLong170 = this.aLong172;
				while (arg2 > 0) {
					local128 = this.aClass90_4.method2566(arg1, arg2, arg0);
					if (local128 == -1) {
						break;
					}
					arg1 += local128;
					arg2 -= local128;
					this.aLong170 += local128;
					this.aLong172 += local128;
				}
			} else if (arg2 > 0) {
				this.method4927();
				local128 = arg2;
				if (arg2 > this.anInt5752) {
					local128 = this.anInt5752;
				}
				Static361.method1335(this.aByteArray87, 0, arg0, arg1, local128);
				arg2 -= local128;
				this.aLong172 += local128;
				arg1 += local128;
			}
			if (this.aLong171 != -1L) {
				if (this.aLong172 < this.aLong171 && arg2 > 0) {
					local128 = (int) (this.aLong171 - this.aLong172) + arg1;
					if (arg1 + arg2 < local128) {
						local128 = arg2 + arg1;
					}
					while (local128 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong172++;
					}
				}
				@Pc(309) long local309 = -1L;
				@Pc(311) long local311 = -1L;
				if (this.aLong171 >= local88 && this.aLong171 < local88 + (long) local92) {
					local309 = this.aLong171;
				} else if (this.aLong171 <= local88 && local88 < (long) this.anInt5757 + this.aLong171) {
					local309 = local88;
				}
				if (this.aLong171 + (long) this.anInt5757 > local88 && (long) this.anInt5757 + this.aLong171 <= local88 + (long) local92) {
					local311 = (long) this.anInt5757 + this.aLong171;
				} else if (this.aLong171 < (long) local92 + local88 && (long) local92 + local88 <= (long) this.anInt5757 + this.aLong171) {
					local311 = (long) local92 + local88;
				}
				if (local309 > -1L && local309 < local311) {
					@Pc(436) int local436 = (int) (local311 - local309);
					Static361.method1335(this.aByteArray86, (int) (local309 - this.aLong171), arg0, (int) (local309 - local88), local436);
					if (this.aLong172 < local311) {
						arg2 = (int) ((long) arg2 + this.aLong172 - local311);
						this.aLong172 = local311;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong170 = -1L;
			throw local473;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Ljava/io/File;")
	private File method4926() {
		return this.aClass90_4.method2563();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	private void method4927() throws IOException {
		this.anInt5752 = 0;
		if (this.aLong170 != this.aLong172) {
			this.aClass90_4.method2562(this.aLong172);
			this.aLong170 = this.aLong172;
		}
		this.aLong167 = this.aLong172;
		while (this.anInt5752 < this.aByteArray87.length) {
			@Pc(48) int local48 = this.aByteArray87.length - this.anInt5752;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass90_4.method2566(this.anInt5752, local48, this.aByteArray87);
			if (local65 == -1) {
				break;
			}
			this.anInt5752 += local65;
			this.aLong170 += local65;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[BZI)V")
	public void method4928(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong169 < this.aLong172 + (long) arg2) {
				this.aLong169 = this.aLong172 + (long) arg2;
			}
			if (this.aLong171 != -1L && (this.aLong171 > this.aLong172 || this.aLong172 > this.aLong171 + (long) this.anInt5757)) {
				this.method4923();
			}
			if (this.aLong171 != -1L && (long) this.aByteArray86.length + this.aLong171 < this.aLong172 - -((long) arg2)) {
				@Pc(86) int local86 = (int) (this.aLong171 + (long) this.aByteArray86.length - this.aLong172);
				Static361.method1335(arg1, arg0, this.aByteArray86, (int) (this.aLong172 - this.aLong171), local86);
				this.aLong172 += local86;
				arg2 -= local86;
				arg0 += local86;
				this.anInt5757 = this.aByteArray86.length;
				this.method4923();
			}
			if (this.aByteArray86.length < arg2) {
				if (this.aLong172 != this.aLong170) {
					this.aClass90_4.method2562(this.aLong172);
					this.aLong170 = this.aLong172;
				}
				this.aClass90_4.method2564(arg2, arg0, arg1);
				this.aLong170 += arg2;
				if (this.aLong168 < this.aLong170) {
					this.aLong168 = this.aLong170;
				}
				@Pc(176) long local176 = -1L;
				if (this.aLong172 >= this.aLong167 && (long) this.anInt5752 + this.aLong167 > this.aLong172) {
					local176 = this.aLong172;
				} else if (this.aLong167 >= this.aLong172 && (long) arg2 + this.aLong172 > this.aLong167) {
					local176 = this.aLong167;
				}
				@Pc(225) long local225 = -1L;
				if (this.aLong172 + (long) arg2 > this.aLong167 && this.aLong172 + (long) arg2 <= this.aLong167 - -((long) this.anInt5752)) {
					local225 = (long) arg2 + this.aLong172;
				} else if (this.aLong172 < (long) this.anInt5752 + this.aLong167 && this.aLong172 + (long) arg2 >= (long) this.anInt5752 + this.aLong167) {
					local225 = (long) this.anInt5752 + this.aLong167;
				}
				if (local176 > -1L && local176 < local225) {
					@Pc(314) int local314 = (int) (local225 - local176);
					Static361.method1335(arg1, (int) ((long) arg0 + local176 - this.aLong172), this.aByteArray87, (int) (local176 - this.aLong167), local314);
				}
				this.aLong172 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong171 == -1L) {
					this.aLong171 = this.aLong172;
				}
				Static361.method1335(arg1, arg0, this.aByteArray86, (int) (this.aLong172 - this.aLong171), arg2);
				this.aLong172 += arg2;
				if (this.aLong172 - this.aLong171 > (long) this.anInt5757) {
					this.anInt5757 = (int) (this.aLong172 - this.aLong171);
				}
			}
		} catch (@Pc(403) IOException local403) {
			this.aLong170 = -1L;
			throw local403;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IJ)V")
	public void method4929(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4926());
		}
		this.aLong172 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BB)V")
	public void method4930(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method4925(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)J")
	public long method4932() {
		return this.aLong169;
	}
}
