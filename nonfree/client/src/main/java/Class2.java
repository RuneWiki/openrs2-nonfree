import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	private int anInt16;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "J")
	private long aLong1 = -1L;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "J")
	private long aLong3 = -1L;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	private int anInt25 = 0;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!ub;")
	private final Class72 aClass72_1;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "J")
	private long aLong4;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "J")
	private long aLong2;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!ub;II)V")
	public Class2(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass72_1 = arg0;
		this.aLong6 = this.aLong4 = arg0.method1968();
		this.aByteArray2 = new byte[arg2];
		this.aByteArray1 = new byte[arg1];
		this.aLong2 = 0L;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	private void method9() throws IOException {
		if (this.aLong3 == -1L) {
			return;
		}
		@Pc(10) long local10 = -1L;
		if (this.aLong5 != this.aLong3) {
			this.aClass72_1.method1969(this.aLong3);
			this.aLong5 = this.aLong3;
		}
		this.aClass72_1.method1971(this.aByteArray2, 0, this.anInt25);
		@Pc(37) long local37 = -1L;
		this.aLong5 += this.anInt25;
		if (this.aLong3 >= this.aLong1 && this.aLong3 < (long) this.anInt16 + this.aLong1) {
			local10 = this.aLong3;
		} else if (this.aLong1 >= this.aLong3 && this.aLong1 < this.aLong3 + (long) this.anInt25) {
			local10 = this.aLong1;
		}
		if (this.aLong4 < this.aLong5) {
			this.aLong4 = this.aLong5;
		}
		if (this.aLong1 < (long) this.anInt25 + this.aLong3 && (long) this.anInt16 + this.aLong1 >= (long) this.anInt25 + this.aLong3) {
			local37 = this.aLong3 + (long) this.anInt25;
		} else if (this.aLong1 + (long) this.anInt16 > this.aLong3 && (long) this.anInt25 + this.aLong3 >= this.aLong1 - -((long) this.anInt16)) {
			local37 = this.aLong1 + (long) this.anInt16;
		}
		if (local10 > -1L && local10 < local37) {
			@Pc(186) int local186 = (int) (local37 - local10);
			Static127.method878(this.aByteArray2, (int) (local10 - this.aLong3), this.aByteArray1, (int) (local10 - this.aLong1), local186);
		}
		this.anInt25 = 0;
		this.aLong3 = -1L;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III[B)V")
	public void method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong2 > this.aLong6) {
				this.aLong6 = (long) arg1 + this.aLong2;
			}
			if (this.aLong3 != -1L && (this.aLong2 < this.aLong3 || this.aLong2 > this.aLong3 + (long) this.anInt25)) {
				this.method9();
			}
			if (this.aLong3 != -1L && (long) arg1 + this.aLong2 > (long) this.aByteArray2.length + this.aLong3) {
				@Pc(82) int local82 = (int) (this.aLong3 + (long) this.aByteArray2.length - this.aLong2);
				arg1 -= local82;
				Static127.method878(arg2, arg0, this.aByteArray2, (int) (this.aLong2 - this.aLong3), local82);
				this.aLong2 += local82;
				arg0 += local82;
				this.anInt25 = this.aByteArray2.length;
				this.method9();
			}
			if (arg1 > this.aByteArray2.length) {
				if (this.aLong2 != this.aLong5) {
					this.aClass72_1.method1969(this.aLong2);
					this.aLong5 = this.aLong2;
				}
				@Pc(145) long local145 = -1L;
				this.aClass72_1.method1971(arg2, arg0, arg1);
				@Pc(154) long local154 = -1L;
				this.aLong5 += arg1;
				if (this.aLong2 >= this.aLong1 && this.aLong1 + (long) this.anInt16 > this.aLong2) {
					local154 = this.aLong2;
				} else if (this.aLong2 <= this.aLong1 && (long) arg1 + this.aLong2 > this.aLong1) {
					local154 = this.aLong1;
				}
				if (this.aLong5 > this.aLong4) {
					this.aLong4 = this.aLong5;
				}
				if ((long) arg1 + this.aLong2 > this.aLong1 && this.aLong2 + (long) arg1 <= this.aLong1 - -((long) this.anInt16)) {
					local145 = this.aLong2 + (long) arg1;
				} else if (this.aLong2 < (long) this.anInt16 + this.aLong1 && this.aLong2 + (long) arg1 >= (long) this.anInt16 + this.aLong1) {
					local145 = this.aLong1 + (long) this.anInt16;
				}
				if (local154 > -1L && local154 < local145) {
					@Pc(316) int local316 = (int) (local145 - local154);
					Static127.method878(arg2, (int) (local154 + (long) arg0 - this.aLong2), this.aByteArray1, (int) (local154 - this.aLong1), local316);
				}
				this.aLong2 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong3 == -1L) {
					this.aLong3 = this.aLong2;
				}
				Static127.method878(arg2, arg0, this.aByteArray2, (int) (this.aLong2 - this.aLong3), arg1);
				this.aLong2 += arg1;
				if ((long) this.anInt25 < this.aLong2 - this.aLong3) {
					this.anInt25 = (int) (this.aLong2 - this.aLong3);
				}
			}
		} catch (@Pc(410) IOException local410) {
			this.aLong5 = -1L;
			throw local410;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)J")
	public long method12() {
		return this.aLong6;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
	public void method13() throws IOException {
		this.method9();
		this.aClass72_1.method1972();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	private void method14() throws IOException {
		this.anInt16 = 0;
		if (this.aLong2 != this.aLong5) {
			this.aClass72_1.method1969(this.aLong2);
			this.aLong5 = this.aLong2;
		}
		this.aLong1 = this.aLong2;
		while (this.anInt16 < this.aByteArray1.length) {
			@Pc(55) int local55 = this.aClass72_1.method1970(this.anInt16, this.aByteArray1.length - this.anInt16, this.aByteArray1);
			if (local55 == -1) {
				break;
			}
			this.aLong5 += local55;
			this.anInt16 += local55;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[BI)V")
	public void method17(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong3 != -1L && this.aLong3 <= this.aLong2 && this.aLong3 + (long) this.anInt25 >= (long) arg2 + this.aLong2) {
				Static127.method878(this.aByteArray2, (int) (this.aLong2 - this.aLong3), arg1, 0, arg2);
				this.aLong2 += arg2;
				return;
			}
			@Pc(77) int local77 = arg2;
			@Pc(80) long local80 = this.aLong2;
			@Pc(114) int local114;
			if (this.aLong2 >= this.aLong1 && this.aLong1 + (long) this.anInt16 > this.aLong2) {
				local114 = (int) (this.aLong1 + (long) this.anInt16 - this.aLong2);
				if (local114 > arg2) {
					local114 = arg2;
				}
				arg2 -= local114;
				Static127.method878(this.aByteArray1, (int) (this.aLong2 - this.aLong1), arg1, 0, local114);
				arg0 = local114;
				this.aLong2 += local114;
			}
			if (arg2 > this.aByteArray1.length) {
				this.aClass72_1.method1969(this.aLong2);
				this.aLong5 = this.aLong2;
				while (arg2 > 0) {
					local114 = this.aClass72_1.method1970(arg0, arg2, arg1);
					if (local114 == -1) {
						break;
					}
					arg2 -= local114;
					arg0 += local114;
					this.aLong5 += local114;
					this.aLong2 += local114;
				}
			} else if (arg2 > 0) {
				this.method14();
				local114 = arg2;
				if (this.anInt16 < arg2) {
					local114 = this.anInt16;
				}
				Static127.method878(this.aByteArray1, 0, arg1, arg0, local114);
				arg2 -= local114;
				arg0 += local114;
				this.aLong2 += local114;
			}
			if (this.aLong3 != -1L) {
				if (this.aLong2 < this.aLong3 && arg2 > 0) {
					local114 = arg0 + (int) (this.aLong3 - this.aLong2);
					if (arg0 + arg2 < local114) {
						local114 = arg0 + arg2;
					}
					while (arg0 < local114) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong2++;
					}
				}
				@Pc(298) long local298 = -1L;
				if (this.aLong3 >= local80 && this.aLong3 < (long) local77 + local80) {
					local298 = this.aLong3;
				} else if (this.aLong3 <= local80 && local80 < (long) this.anInt25 + this.aLong3) {
					local298 = local80;
				}
				@Pc(334) long local334 = -1L;
				if ((long) this.anInt25 + this.aLong3 > local80 && this.aLong3 + (long) this.anInt25 <= local80 + (long) local77) {
					local334 = this.aLong3 + (long) this.anInt25;
				} else if (this.aLong3 < local80 + (long) local77 && (long) this.anInt25 + this.aLong3 >= local80 - -((long) local77)) {
					local334 = (long) local77 + local80;
				}
				if (local298 > -1L && local298 < local334) {
					@Pc(420) int local420 = (int) (local334 - local298);
					Static127.method878(this.aByteArray2, (int) (local298 - this.aLong3), arg1, (int) (local298 - local80), local420);
					if (this.aLong2 < local334) {
						arg2 = (int) ((long) arg2 + this.aLong2 - local334);
						this.aLong2 = local334;
					}
				}
			}
		} catch (@Pc(457) IOException local457) {
			this.aLong5 = -1L;
			throw local457;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJ)V")
	public void method20(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong2 = arg0;
		}
	}
}
