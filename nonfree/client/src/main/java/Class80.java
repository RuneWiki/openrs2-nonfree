import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class80 {

	@OriginalMember(owner = "client!v", name = "t", descriptor = "I")
	private int anInt3615;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "J")
	private long aLong173 = -1L;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	private int anInt3623 = 0;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "J")
	private long aLong174 = -1L;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "Lclient!dg;")
	private final Class20 aClass20_4;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "[B")
	private final byte[] aByteArray45;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!dg;II)V")
	public Class80(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass20_4 = arg0;
		this.aLong171 = this.aLong170 = arg0.method603();
		this.aLong172 = 0L;
		this.aByteArray45 = new byte[arg1];
		this.aByteArray46 = new byte[arg2];
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BJ)V")
	public void method2608(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2619());
		}
		this.aLong172 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BB)V")
	public void method2611(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2614(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public void method2612() throws IOException {
		this.method2615();
		this.aClass20_4.method608();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	private void method2613() throws IOException {
		this.anInt3615 = 0;
		if (this.aLong175 != this.aLong172) {
			this.aClass20_4.method604(this.aLong172);
			this.aLong175 = this.aLong172;
		}
		this.aLong174 = this.aLong172;
		while (this.anInt3615 < this.aByteArray45.length) {
			@Pc(46) int local46 = this.aClass20_4.method605(this.aByteArray45.length - this.anInt3615, this.anInt3615, this.aByteArray45);
			if (local46 == -1) {
				break;
			}
			this.aLong175 += local46;
			this.anInt3615 += local46;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BIB)V")
	public void method2614(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong173 != -1L && this.aLong173 <= this.aLong172 && (long) this.anInt3623 + this.aLong173 >= this.aLong172 + (long) arg0) {
				Static184.method1123(this.aByteArray46, (int) (this.aLong172 - this.aLong173), arg1, 0, arg0);
				this.aLong172 += arg0;
				return;
			}
			@Pc(82) long local82 = this.aLong172;
			@Pc(86) int local86 = arg0;
			@Pc(119) int local119;
			if (this.aLong174 <= this.aLong172 && this.aLong174 + (long) this.anInt3615 > this.aLong172) {
				local119 = (int) (this.aLong174 + (long) this.anInt3615 - this.aLong172);
				if (arg0 < local119) {
					local119 = arg0;
				}
				Static184.method1123(this.aByteArray45, (int) (this.aLong172 - this.aLong174), arg1, 0, local119);
				arg0 -= local119;
				this.aLong172 += local119;
				arg2 = local119;
			}
			if (this.aByteArray45.length < arg0) {
				this.aClass20_4.method604(this.aLong172);
				this.aLong175 = this.aLong172;
				while (arg0 > 0) {
					local119 = this.aClass20_4.method605(arg0, arg2, arg1);
					if (local119 == -1) {
						break;
					}
					arg0 -= local119;
					this.aLong175 += local119;
					arg2 += local119;
					this.aLong172 += local119;
				}
			} else if (arg0 > 0) {
				this.method2613();
				local119 = arg0;
				if (arg0 > this.anInt3615) {
					local119 = this.anInt3615;
				}
				Static184.method1123(this.aByteArray45, 0, arg1, arg2, local119);
				this.aLong172 += local119;
				arg2 += local119;
				arg0 -= local119;
			}
			if (this.aLong173 != -1L) {
				if (this.aLong172 < this.aLong173 && arg0 > 0) {
					local119 = (int) (this.aLong173 - this.aLong172) + arg2;
					if (arg0 + arg2 < local119) {
						local119 = arg2 + arg0;
					}
					while (local119 > arg2) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong172++;
					}
				}
				@Pc(312) long local312 = -1L;
				if (this.aLong173 >= local82 && (long) local86 + local82 > this.aLong173) {
					local312 = this.aLong173;
				} else if (local82 >= this.aLong173 && local82 < this.aLong173 + (long) this.anInt3623) {
					local312 = local82;
				}
				@Pc(352) long local352 = -1L;
				if (this.aLong173 + (long) this.anInt3623 > local82 && this.aLong173 + (long) this.anInt3623 <= local82 - -((long) local86)) {
					local352 = this.aLong173 + (long) this.anInt3623;
				} else if ((long) local86 + local82 > this.aLong173 && local82 + (long) local86 <= this.aLong173 - -((long) this.anInt3623)) {
					local352 = local82 + (long) local86;
				}
				if (local312 > -1L && local352 > local312) {
					@Pc(438) int local438 = (int) (local352 - local312);
					Static184.method1123(this.aByteArray46, (int) (local312 - this.aLong173), arg1, (int) (local312 - local82), local438);
					if (this.aLong172 < local352) {
						arg0 = (int) ((long) arg0 + this.aLong172 - local352);
						this.aLong172 = local352;
					}
				}
			}
		} catch (@Pc(474) IOException local474) {
			this.aLong175 = -1L;
			throw local474;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	private void method2615() throws IOException {
		if (this.aLong173 == -1L) {
			return;
		}
		if (this.aLong173 != this.aLong175) {
			this.aClass20_4.method604(this.aLong173);
			this.aLong175 = this.aLong173;
		}
		@Pc(38) long local38 = -1L;
		this.aClass20_4.method606(0, this.anInt3623, this.aByteArray46);
		if (this.aLong173 >= this.aLong174 && this.aLong173 < this.aLong174 + (long) this.anInt3615) {
			local38 = this.aLong173;
		} else if (this.aLong174 >= this.aLong173 && this.aLong174 < (long) this.anInt3623 + this.aLong173) {
			local38 = this.aLong174;
		}
		this.aLong175 += this.anInt3623;
		if (this.aLong170 < this.aLong175) {
			this.aLong170 = this.aLong175;
		}
		@Pc(124) long local124 = -1L;
		if (this.aLong173 + (long) this.anInt3623 > this.aLong174 && this.aLong174 + (long) this.anInt3615 >= (long) this.anInt3623 + this.aLong173) {
			local124 = (long) this.anInt3623 + this.aLong173;
		} else if (this.aLong173 < (long) this.anInt3615 + this.aLong174 && (long) this.anInt3615 + this.aLong174 <= this.aLong173 + (long) this.anInt3623) {
			local124 = (long) this.anInt3615 + this.aLong174;
		}
		if (local38 > -1L && local124 > local38) {
			@Pc(207) int local207 = (int) (local124 - local38);
			Static184.method1123(this.aByteArray46, (int) (local38 - this.aLong173), this.aByteArray45, (int) (local38 - this.aLong174), local207);
		}
		this.anInt3623 = 0;
		this.aLong173 = -1L;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI[B)V")
	public void method2616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong172 > this.aLong171) {
				this.aLong171 = (long) arg0 + this.aLong172;
			}
			if (this.aLong173 != -1L && (this.aLong172 < this.aLong173 || this.aLong173 + (long) this.anInt3623 < this.aLong172)) {
				this.method2615();
			}
			if (this.aLong173 != -1L && this.aLong173 + (long) this.aByteArray46.length < (long) arg0 + this.aLong172) {
				@Pc(100) int local100 = (int) (this.aLong173 + (long) this.aByteArray46.length - this.aLong172);
				arg0 -= local100;
				Static184.method1123(arg2, arg1, this.aByteArray46, (int) (this.aLong172 - this.aLong173), local100);
				this.aLong172 += local100;
				arg1 += local100;
				this.anInt3623 = this.aByteArray46.length;
				this.method2615();
			}
			if (arg0 > this.aByteArray46.length) {
				@Pc(143) long local143 = -1L;
				if (this.aLong172 != this.aLong175) {
					this.aClass20_4.method604(this.aLong172);
					this.aLong175 = this.aLong172;
				}
				this.aClass20_4.method606(arg1, arg0, arg2);
				this.aLong175 += arg0;
				if (this.aLong170 < this.aLong175) {
					this.aLong170 = this.aLong175;
				}
				@Pc(189) long local189 = -1L;
				if (this.aLong172 >= this.aLong174 && this.aLong172 < this.aLong174 + (long) this.anInt3615) {
					local143 = this.aLong172;
				} else if (this.aLong172 <= this.aLong174 && this.aLong174 < (long) arg0 + this.aLong172) {
					local143 = this.aLong174;
				}
				if ((long) arg0 + this.aLong172 > this.aLong174 && (long) arg0 + this.aLong172 <= this.aLong174 + (long) this.anInt3615) {
					local189 = (long) arg0 + this.aLong172;
				} else if ((long) this.anInt3615 + this.aLong174 > this.aLong172 && this.aLong174 + (long) this.anInt3615 <= this.aLong172 + (long) arg0) {
					local189 = (long) this.anInt3615 + this.aLong174;
				}
				if (local143 > -1L && local189 > local143) {
					@Pc(326) int local326 = (int) (local189 - local143);
					Static184.method1123(arg2, (int) ((long) arg1 + local143 - this.aLong172), this.aByteArray45, (int) (local143 - this.aLong174), local326);
				}
				this.aLong172 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong173 == -1L) {
					this.aLong173 = this.aLong172;
				}
				Static184.method1123(arg2, arg1, this.aByteArray46, (int) (this.aLong172 - this.aLong173), arg0);
				this.aLong172 += arg0;
				if (this.aLong172 - this.aLong173 > (long) this.anInt3623) {
					this.anInt3623 = (int) (this.aLong172 - this.aLong173);
				}
			}
		} catch (@Pc(415) IOException local415) {
			this.aLong175 = -1L;
			throw local415;
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)J")
	public long method2617() {
		return this.aLong171;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method2619() {
		return this.aClass20_4.method607();
	}
}
