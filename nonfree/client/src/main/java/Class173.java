import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class173 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	private int anInt4273;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "J")
	private long aLong131 = -1L;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "J")
	private long aLong132 = -1L;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "I")
	private int anInt4279 = 0;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "Lclient!rv;")
	private final Class220 aClass220_4;

	@OriginalMember(owner = "client!no", name = "t", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!no", name = "r", descriptor = "[B")
	private final byte[] aByteArray47;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!rv;II)V")
	public Class173(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass220_4 = arg0;
		this.aLong134 = this.aLong136 = arg0.method4583();
		this.aLong133 = 0L;
		this.aByteArray47 = new byte[arg2];
		this.aByteArray46 = new byte[arg1];
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZ[B)V")
	public void method3438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg0 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong132 != -1L && this.aLong132 <= this.aLong133 && (long) this.anInt4279 + this.aLong132 >= (long) arg0 + this.aLong133) {
				Static459.method2110(this.aByteArray47, (int) (this.aLong133 - this.aLong132), arg2, 0, arg0);
				this.aLong133 += arg0;
				return;
			}
			@Pc(77) long local77 = this.aLong133;
			@Pc(81) int local81 = arg0;
			@Pc(110) int local110;
			if (this.aLong133 >= this.aLong131 && this.aLong133 < this.aLong131 + (long) this.anInt4273) {
				local110 = (int) (this.aLong131 + (long) this.anInt4273 - this.aLong133);
				if (arg0 < local110) {
					local110 = arg0;
				}
				Static459.method2110(this.aByteArray46, (int) (this.aLong133 - this.aLong131), arg2, 0, local110);
				this.aLong133 += local110;
				arg0 -= local110;
				arg1 = local110;
			}
			if (this.aByteArray46.length < arg0) {
				this.aClass220_4.method4587(this.aLong133);
				this.aLong135 = this.aLong133;
				while (arg0 > 0) {
					local110 = this.aClass220_4.method4585(arg1, arg0, arg2);
					if (local110 == -1) {
						break;
					}
					arg1 += local110;
					arg0 -= local110;
					this.aLong133 += local110;
					this.aLong135 += local110;
				}
			} else if (arg0 > 0) {
				this.method3447();
				local110 = arg0;
				if (this.anInt4273 < arg0) {
					local110 = this.anInt4273;
				}
				Static459.method2110(this.aByteArray46, 0, arg2, arg1, local110);
				arg1 += local110;
				arg0 -= local110;
				this.aLong133 += local110;
			}
			if (this.aLong132 != -1L) {
				if (this.aLong133 < this.aLong132 && arg0 > 0) {
					local110 = (int) (this.aLong132 - this.aLong133) + arg1;
					if (local110 > arg1 + arg0) {
						local110 = arg1 + arg0;
					}
					while (arg1 < local110) {
						arg0--;
						arg2[arg1++] = 0;
						this.aLong133++;
					}
				}
				@Pc(311) long local311 = -1L;
				if (this.aLong132 >= local77 && this.aLong132 < (long) local81 + local77) {
					local311 = this.aLong132;
				} else if (this.aLong132 <= local77 && local77 < this.aLong132 + (long) this.anInt4279) {
					local311 = local77;
				}
				@Pc(359) long local359 = -1L;
				if (local77 < (long) this.anInt4279 + this.aLong132 && (long) this.anInt4279 + this.aLong132 <= local77 - -((long) local81)) {
					local359 = this.aLong132 + (long) this.anInt4279;
				} else if ((long) local81 + local77 > this.aLong132 && this.aLong132 + (long) this.anInt4279 >= local77 - -((long) local81)) {
					local359 = (long) local81 + local77;
				}
				if (local311 > -1L && local359 > local311) {
					@Pc(442) int local442 = (int) (local359 - local311);
					Static459.method2110(this.aByteArray47, (int) (local311 - this.aLong132), arg2, (int) (local311 - local77), local442);
					if (this.aLong133 < local359) {
						arg0 = (int) ((long) arg0 + this.aLong133 - local359);
						this.aLong133 = local359;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong135 = -1L;
			throw local480;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "([BI)V")
	public void method3439(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3438(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)V")
	public void method3440(@OriginalArg(1) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3444());
		}
		this.aLong133 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)J")
	public long method3442() {
		return this.aLong134;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
	private void method3443() throws IOException {
		if (this.aLong132 == -1L) {
			return;
		}
		if (this.aLong135 != this.aLong132) {
			this.aClass220_4.method4587(this.aLong132);
			this.aLong135 = this.aLong132;
		}
		this.aClass220_4.method4582(this.anInt4279, 0, this.aByteArray47);
		this.aLong135 += this.anInt4279;
		if (this.aLong136 < this.aLong135) {
			this.aLong136 = this.aLong135;
		}
		@Pc(59) long local59 = -1L;
		@Pc(61) long local61 = -1L;
		if (this.aLong132 >= this.aLong131 && this.aLong132 < (long) this.anInt4273 + this.aLong131) {
			local59 = this.aLong132;
		} else if (this.aLong132 <= this.aLong131 && (long) this.anInt4279 + this.aLong132 > this.aLong131) {
			local59 = this.aLong131;
		}
		if (this.aLong131 < this.aLong132 + (long) this.anInt4279 && (long) this.anInt4273 + this.aLong131 >= this.aLong132 + (long) this.anInt4279) {
			local61 = (long) this.anInt4279 + this.aLong132;
		} else if ((long) this.anInt4273 + this.aLong131 > this.aLong132 && this.aLong132 + (long) this.anInt4279 >= this.aLong131 - -((long) this.anInt4273)) {
			local61 = this.aLong131 + (long) this.anInt4273;
		}
		if (local59 > -1L && local61 > local59) {
			@Pc(194) int local194 = (int) (local61 - local59);
			Static459.method2110(this.aByteArray47, (int) (local59 - this.aLong132), this.aByteArray46, (int) (local59 - this.aLong131), local194);
		}
		this.anInt4279 = 0;
		this.aLong132 = -1L;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method3444() {
		return this.aClass220_4.method4586();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II[BI)V")
	public void method3445(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong133 > this.aLong134) {
				this.aLong134 = this.aLong133 + (long) arg0;
			}
			if (this.aLong132 != -1L && (this.aLong133 < this.aLong132 || this.aLong132 + (long) this.anInt4279 < this.aLong133)) {
				this.method3443();
			}
			if (this.aLong132 != -1L && (long) arg0 + this.aLong133 > this.aLong132 + (long) this.aByteArray47.length) {
				@Pc(98) int local98 = (int) (this.aLong132 + (long) this.aByteArray47.length - this.aLong133);
				Static459.method2110(arg1, arg2, this.aByteArray47, (int) (this.aLong133 - this.aLong132), local98);
				arg2 += local98;
				this.aLong133 += local98;
				arg0 -= local98;
				this.anInt4279 = this.aByteArray47.length;
				this.method3443();
			}
			if (this.aByteArray47.length < arg0) {
				if (this.aLong133 != this.aLong135) {
					this.aClass220_4.method4587(this.aLong133);
					this.aLong135 = this.aLong133;
				}
				this.aClass220_4.method4582(arg0, arg2, arg1);
				this.aLong135 += arg0;
				if (this.aLong136 < this.aLong135) {
					this.aLong136 = this.aLong135;
				}
				@Pc(187) long local187 = -1L;
				@Pc(189) long local189 = -1L;
				if (this.aLong133 >= this.aLong131 && this.aLong131 + (long) this.anInt4273 > this.aLong133) {
					local187 = this.aLong133;
				} else if (this.aLong133 <= this.aLong131 && (long) arg0 + this.aLong133 > this.aLong131) {
					local187 = this.aLong131;
				}
				if (this.aLong131 < (long) arg0 + this.aLong133 && (long) this.anInt4273 + this.aLong131 >= this.aLong133 + (long) arg0) {
					local189 = (long) arg0 + this.aLong133;
				} else if ((long) this.anInt4273 + this.aLong131 > this.aLong133 && this.aLong131 + (long) this.anInt4273 <= (long) arg0 + this.aLong133) {
					local189 = (long) this.anInt4273 + this.aLong131;
				}
				if (local187 > -1L && local187 < local189) {
					@Pc(316) int local316 = (int) (local189 - local187);
					Static459.method2110(arg1, (int) ((long) arg2 + local187 - this.aLong133), this.aByteArray46, (int) (local187 - this.aLong131), local316);
				}
				this.aLong133 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong132 == -1L) {
					this.aLong132 = this.aLong133;
				}
				Static459.method2110(arg1, arg2, this.aByteArray47, (int) (this.aLong133 - this.aLong132), arg0);
				this.aLong133 += arg0;
				if (this.aLong133 - this.aLong132 > (long) this.anInt4279) {
					this.anInt4279 = (int) (this.aLong133 - this.aLong132);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong135 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
	private void method3447() throws IOException {
		this.anInt4273 = 0;
		if (this.aLong133 != this.aLong135) {
			this.aClass220_4.method4587(this.aLong133);
			this.aLong135 = this.aLong133;
		}
		this.aLong131 = this.aLong133;
		while (this.anInt4273 < this.aByteArray46.length) {
			@Pc(46) int local46 = this.aByteArray46.length - this.anInt4273;
			if (local46 > 200000000) {
				local46 = 200000000;
			}
			@Pc(63) int local63 = this.aClass220_4.method4585(this.anInt4273, local46, this.aByteArray46);
			if (local63 == -1) {
				break;
			}
			this.anInt4273 += local63;
			this.aLong135 += local63;
		}
	}
}
