import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class139 {

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "J")
	private long aLong144;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
	private int anInt4428;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "J")
	private long aLong143 = -1L;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	private int anInt4426 = 0;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "J")
	private long aLong146 = -1L;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "Lclient!rp;")
	private final Class207 aClass207_4;

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "[B")
	private final byte[] aByteArray54;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "[B")
	private final byte[] aByteArray55;

	static {
		new Class83("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!rp;II)V")
	public Class139(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass207_4 = arg0;
		this.aLong147 = this.aLong145 = arg0.method4717();
		this.aLong142 = 0L;
		this.aByteArray54 = new byte[arg2];
		this.aByteArray55 = new byte[arg1];
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([BI)V")
	public void method3462(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3471(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)J")
	public long method3463() {
		return this.aLong147;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB[BI)V")
	public void method3464(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong147 < (long) arg2 + this.aLong142) {
				this.aLong147 = (long) arg2 + this.aLong142;
			}
			if (this.aLong143 != -1L && (this.aLong143 > this.aLong142 || this.aLong142 > this.aLong143 + (long) this.anInt4426)) {
				this.method3472();
			}
			if (this.aLong143 != -1L && this.aLong142 + (long) arg2 > this.aLong143 + (long) this.aByteArray54.length) {
				@Pc(100) int local100 = (int) (this.aLong143 + (long) this.aByteArray54.length - this.aLong142);
				Static459.method3330(arg1, arg0, this.aByteArray54, (int) (this.aLong142 - this.aLong143), local100);
				arg0 += local100;
				this.aLong142 += local100;
				arg2 -= local100;
				this.anInt4426 = this.aByteArray54.length;
				this.method3472();
			}
			if (arg2 > this.aByteArray54.length) {
				if (this.aLong144 != this.aLong142) {
					this.aClass207_4.method4718(this.aLong142);
					this.aLong144 = this.aLong142;
				}
				this.aClass207_4.method4714(arg0, arg2, arg1);
				this.aLong144 += arg2;
				if (this.aLong144 > this.aLong145) {
					this.aLong145 = this.aLong144;
				}
				@Pc(195) long local195 = -1L;
				@Pc(197) long local197 = -1L;
				if (this.aLong142 >= this.aLong146 && this.aLong146 + (long) this.anInt4428 > this.aLong142) {
					local195 = this.aLong142;
				} else if (this.aLong146 >= this.aLong142 && this.aLong146 < (long) arg2 + this.aLong142) {
					local195 = this.aLong146;
				}
				if (this.aLong146 < (long) arg2 + this.aLong142 && (long) arg2 + this.aLong142 <= (long) this.anInt4428 + this.aLong146) {
					local197 = (long) arg2 + this.aLong142;
				} else if (this.aLong146 + (long) this.anInt4428 > this.aLong142 && this.aLong142 + (long) arg2 >= this.aLong146 + (long) this.anInt4428) {
					local197 = (long) this.anInt4428 + this.aLong146;
				}
				if (local195 > -1L && local195 < local197) {
					@Pc(335) int local335 = (int) (local197 - local195);
					Static459.method3330(arg1, (int) (local195 + (long) arg0 - this.aLong142), this.aByteArray55, (int) (local195 - this.aLong146), local335);
				}
				this.aLong142 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong143 == -1L) {
					this.aLong143 = this.aLong142;
				}
				Static459.method3330(arg1, arg0, this.aByteArray54, (int) (this.aLong142 - this.aLong143), arg2);
				this.aLong142 += arg2;
				if (this.aLong142 - this.aLong143 > (long) this.anInt4426) {
					this.anInt4426 = (int) (this.aLong142 - this.aLong143);
				}
			}
		} catch (@Pc(417) IOException local417) {
			this.aLong144 = -1L;
			throw local417;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IJ)V")
	public void method3466(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3473());
		}
		this.aLong142 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	private void method3467() throws IOException {
		this.anInt4428 = 0;
		if (this.aLong142 != this.aLong144) {
			this.aClass207_4.method4718(this.aLong142);
			this.aLong144 = this.aLong142;
		}
		this.aLong146 = this.aLong142;
		while (this.anInt4428 < this.aByteArray55.length) {
			@Pc(40) int local40 = this.aByteArray55.length - this.anInt4428;
			if (local40 > 200000000) {
				local40 = 200000000;
			}
			@Pc(55) int local55 = this.aClass207_4.method4715(this.anInt4428, local40, this.aByteArray55);
			if (local55 == -1) {
				break;
			}
			this.aLong144 += local55;
			this.anInt4428 += local55;
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(IB[BI)V")
	public void method3471(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong143 != -1L && this.aLong143 <= this.aLong142 && (long) this.anInt4426 + this.aLong143 >= this.aLong142 + (long) arg0) {
				Static459.method3330(this.aByteArray54, (int) (this.aLong142 - this.aLong143), arg1, 0, arg0);
				this.aLong142 += arg0;
				return;
			}
			@Pc(82) long local82 = this.aLong142;
			@Pc(86) int local86 = arg0;
			@Pc(124) int local124;
			if (this.aLong146 <= this.aLong142 && this.aLong142 < this.aLong146 + (long) this.anInt4428) {
				local124 = (int) (this.aLong146 + (long) this.anInt4428 - this.aLong142);
				if (arg0 < local124) {
					local124 = arg0;
				}
				Static459.method3330(this.aByteArray55, (int) (this.aLong142 - this.aLong146), arg1, 0, local124);
				arg2 = local124;
				arg0 -= local124;
				this.aLong142 += local124;
			}
			if (this.aByteArray55.length < arg0) {
				this.aClass207_4.method4718(this.aLong142);
				this.aLong144 = this.aLong142;
				while (arg0 > 0) {
					local124 = this.aClass207_4.method4715(arg2, arg0, arg1);
					if (local124 == -1) {
						break;
					}
					this.aLong144 += local124;
					this.aLong142 += local124;
					arg2 += local124;
					arg0 -= local124;
				}
			} else if (arg0 > 0) {
				this.method3467();
				local124 = arg0;
				if (this.anInt4428 < arg0) {
					local124 = this.anInt4428;
				}
				Static459.method3330(this.aByteArray55, 0, arg1, arg2, local124);
				this.aLong142 += local124;
				arg2 += local124;
				arg0 -= local124;
			}
			if (this.aLong143 != -1L) {
				if (this.aLong142 < this.aLong143 && arg0 > 0) {
					local124 = (int) (this.aLong143 - this.aLong142) + arg2;
					if (local124 > arg0 + arg2) {
						local124 = arg0 + arg2;
					}
					while (local124 > arg2) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong142++;
					}
				}
				@Pc(312) long local312 = -1L;
				if (this.aLong143 >= local82 && (long) local86 + local82 > this.aLong143) {
					local312 = this.aLong143;
				} else if (this.aLong143 <= local82 && this.aLong143 + (long) this.anInt4426 > local82) {
					local312 = local82;
				}
				@Pc(361) long local361 = -1L;
				if ((long) this.anInt4426 + this.aLong143 > local82 && this.aLong143 + (long) this.anInt4426 <= local82 - -((long) local86)) {
					local361 = (long) this.anInt4426 + this.aLong143;
				} else if (this.aLong143 < local82 + (long) local86 && local82 + (long) local86 <= (long) this.anInt4426 + this.aLong143) {
					local361 = (long) local86 + local82;
				}
				if (local312 > -1L && local361 > local312) {
					@Pc(440) int local440 = (int) (local361 - local312);
					Static459.method3330(this.aByteArray54, (int) (local312 - this.aLong143), arg1, (int) (local312 - local82), local440);
					if (local361 > this.aLong142) {
						arg0 = (int) ((long) arg0 + this.aLong142 - local361);
						this.aLong142 = local361;
					}
				}
			}
		} catch (@Pc(481) IOException local481) {
			this.aLong144 = -1L;
			throw local481;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
	private void method3472() throws IOException {
		if (this.aLong143 == -1L) {
			return;
		}
		if (this.aLong143 != this.aLong144) {
			this.aClass207_4.method4718(this.aLong143);
			this.aLong144 = this.aLong143;
		}
		this.aClass207_4.method4714(0, this.anInt4426, this.aByteArray54);
		this.aLong144 += this.anInt4426;
		if (this.aLong145 < this.aLong144) {
			this.aLong145 = this.aLong144;
		}
		@Pc(63) long local63 = -1L;
		@Pc(65) long local65 = -1L;
		if (this.aLong143 >= this.aLong146 && this.aLong146 + (long) this.anInt4428 > this.aLong143) {
			local63 = this.aLong143;
		} else if (this.aLong143 <= this.aLong146 && (long) this.anInt4426 + this.aLong143 > this.aLong146) {
			local63 = this.aLong146;
		}
		if (this.aLong143 + (long) this.anInt4426 > this.aLong146 && this.aLong143 + (long) this.anInt4426 <= (long) this.anInt4428 + this.aLong146) {
			local65 = (long) this.anInt4426 + this.aLong143;
		} else if (this.aLong143 < (long) this.anInt4428 + this.aLong146 && (long) this.anInt4426 + this.aLong143 >= (long) this.anInt4428 + this.aLong146) {
			local65 = this.aLong146 + (long) this.anInt4428;
		}
		if (local63 > -1L && local65 > local63) {
			@Pc(203) int local203 = (int) (local65 - local63);
			Static459.method3330(this.aByteArray54, (int) (local63 - this.aLong143), this.aByteArray55, (int) (local63 - this.aLong146), local203);
		}
		this.aLong143 = -1L;
		this.anInt4426 = 0;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method3473() {
		return this.aClass207_4.method4716();
	}
}
