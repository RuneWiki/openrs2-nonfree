import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class20 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "I")
	private int anInt713;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "J")
	private long aLong20 = -1L;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "J")
	private long aLong23 = -1L;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "I")
	private int anInt720 = 0;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Lclient!be;")
	private final Class10 aClass10_1;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "[B")
	private final byte[] aByteArray6;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!be;II)V")
	public Class20(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass10_1 = arg0;
		this.aLong22 = this.aLong21 = arg0.method290();
		this.aLong19 = 0L;
		this.aByteArray5 = new byte[arg1];
		this.aByteArray6 = new byte[arg2];
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
	public void method438(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong19 = arg0;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public void method440() throws IOException {
		this.method445();
		this.aClass10_1.method286();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BIII)V")
	public void method441(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong20 != -1L && this.aLong19 >= this.aLong20 && this.aLong19 + (long) arg1 <= (long) this.anInt720 + this.aLong20) {
				Static118.method807(this.aByteArray6, (int) (this.aLong19 - this.aLong20), arg0, 0, arg1);
				this.aLong19 += arg1;
				return;
			}
			@Pc(84) long local84 = this.aLong19;
			@Pc(88) int local88 = arg1;
			@Pc(120) int local120;
			if (this.aLong19 >= this.aLong23 && this.aLong19 < (long) this.anInt713 + this.aLong23) {
				local120 = (int) (this.aLong23 + (long) this.anInt713 - this.aLong19);
				if (arg1 < local120) {
					local120 = arg1;
				}
				arg1 -= local120;
				Static118.method807(this.aByteArray5, (int) (this.aLong19 - this.aLong23), arg0, 0, local120);
				this.aLong19 += local120;
				arg2 = local120;
			}
			if (this.aByteArray5.length < arg1) {
				this.aClass10_1.method288(this.aLong19);
				this.aLong18 = this.aLong19;
				while (arg1 > 0) {
					local120 = this.aClass10_1.method289(arg0, arg1, arg2);
					if (local120 == -1) {
						break;
					}
					arg1 -= local120;
					arg2 += local120;
					this.aLong18 += local120;
					this.aLong19 += local120;
				}
			} else if (arg1 > 0) {
				this.method443();
				local120 = arg1;
				if (this.anInt713 < arg1) {
					local120 = this.anInt713;
				}
				arg1 -= local120;
				Static118.method807(this.aByteArray5, 0, arg0, arg2, local120);
				arg2 += local120;
				this.aLong19 += local120;
			}
			if (this.aLong20 != -1L) {
				if (this.aLong20 > this.aLong19 && arg1 > 0) {
					local120 = arg2 + (int) (this.aLong20 - this.aLong19);
					if (arg1 + arg2 < local120) {
						local120 = arg1 + arg2;
					}
					while (arg2 < local120) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong19++;
					}
				}
				@Pc(315) long local315 = -1L;
				if (local84 < this.aLong20 + (long) this.anInt720 && this.aLong20 + (long) this.anInt720 <= local84 + (long) local88) {
					local315 = (long) this.anInt720 + this.aLong20;
				} else if (this.aLong20 < (long) local88 + local84 && (long) local88 + local84 <= (long) this.anInt720 + this.aLong20) {
					local315 = local84 + (long) local88;
				}
				@Pc(378) long local378 = -1L;
				if (this.aLong20 >= local84 && this.aLong20 < (long) local88 + local84) {
					local378 = this.aLong20;
				} else if (local84 >= this.aLong20 && this.aLong20 + (long) this.anInt720 > local84) {
					local378 = local84;
				}
				if (local378 > -1L && local378 < local315) {
					@Pc(441) int local441 = (int) (local315 - local378);
					Static118.method807(this.aByteArray6, (int) (local378 - this.aLong20), arg0, (int) (local378 - local84), local441);
					if (this.aLong19 < local315) {
						arg1 = (int) ((long) arg1 + this.aLong19 - local315);
						this.aLong19 = local315;
					}
				}
			}
		} catch (@Pc(479) IOException local479) {
			this.aLong18 = -1L;
			throw local479;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)J")
	public long method442() {
		return this.aLong22;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	private void method443() throws IOException {
		this.anInt713 = 0;
		if (this.aLong19 != this.aLong18) {
			this.aClass10_1.method288(this.aLong19);
			this.aLong18 = this.aLong19;
		}
		this.aLong23 = this.aLong19;
		while (this.anInt713 < this.aByteArray5.length) {
			@Pc(55) int local55 = this.aClass10_1.method289(this.aByteArray5, this.aByteArray5.length - this.anInt713, this.anInt713);
			if (local55 == -1) {
				break;
			}
			this.aLong18 += local55;
			this.anInt713 += local55;
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	private void method445() throws IOException {
		if (this.aLong20 == -1L) {
			return;
		}
		if (this.aLong20 != this.aLong18) {
			this.aClass10_1.method288(this.aLong20);
			this.aLong18 = this.aLong20;
		}
		@Pc(38) long local38 = -1L;
		this.aClass10_1.method291(this.anInt720, 0, this.aByteArray6);
		if (this.aLong23 <= this.aLong20 && this.aLong20 < (long) this.anInt713 + this.aLong23) {
			local38 = this.aLong20;
		} else if (this.aLong23 >= this.aLong20 && this.aLong23 < this.aLong20 + (long) this.anInt720) {
			local38 = this.aLong23;
		}
		this.aLong18 += this.anInt720;
		@Pc(106) long local106 = -1L;
		if (this.aLong18 > this.aLong21) {
			this.aLong21 = this.aLong18;
		}
		if (this.aLong23 < this.aLong20 + (long) this.anInt720 && this.aLong23 + (long) this.anInt713 >= (long) this.anInt720 + this.aLong20) {
			local106 = this.aLong20 + (long) this.anInt720;
		} else if (this.aLong23 + (long) this.anInt713 > this.aLong20 && (long) this.anInt713 + this.aLong23 <= (long) this.anInt720 + this.aLong20) {
			local106 = (long) this.anInt713 + this.aLong23;
		}
		if (local38 > -1L && local38 < local106) {
			@Pc(201) int local201 = (int) (local106 - local38);
			Static118.method807(this.aByteArray6, (int) (local38 - this.aLong20), this.aByteArray5, (int) (local38 - this.aLong23), local201);
		}
		this.anInt720 = 0;
		this.aLong20 = -1L;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if ((long) arg0 + this.aLong19 > this.aLong22) {
				this.aLong22 = (long) arg0 + this.aLong19;
			}
			if (this.aLong20 != -1L && (this.aLong20 > this.aLong19 || this.aLong20 + (long) this.anInt720 < this.aLong19)) {
				this.method445();
			}
			if (this.aLong20 != -1L && (long) this.aByteArray6.length + this.aLong20 < this.aLong19 - -((long) arg0)) {
				@Pc(94) int local94 = (int) ((long) this.aByteArray6.length + this.aLong20 - this.aLong19);
				arg0 -= local94;
				Static118.method807(arg2, arg1, this.aByteArray6, (int) (this.aLong19 - this.aLong20), local94);
				this.aLong19 += local94;
				this.anInt720 = this.aByteArray6.length;
				this.method445();
				arg1 += local94;
			}
			if (arg0 > this.aByteArray6.length) {
				if (this.aLong18 != this.aLong19) {
					this.aClass10_1.method288(this.aLong19);
					this.aLong18 = this.aLong19;
				}
				this.aClass10_1.method291(arg0, arg1, arg2);
				@Pc(168) long local168 = -1L;
				if (this.aLong23 < this.aLong19 + (long) arg0 && (long) this.anInt713 + this.aLong23 >= this.aLong19 + (long) arg0) {
					local168 = (long) arg0 + this.aLong19;
				} else if (this.aLong19 < this.aLong23 + (long) this.anInt713 && this.aLong23 + (long) this.anInt713 <= (long) arg0 + this.aLong19) {
					local168 = (long) this.anInt713 + this.aLong23;
				}
				this.aLong18 += arg0;
				if (this.aLong21 < this.aLong18) {
					this.aLong21 = this.aLong18;
				}
				@Pc(257) long local257 = -1L;
				if (this.aLong19 >= this.aLong23 && this.aLong19 < this.aLong23 + (long) this.anInt713) {
					local257 = this.aLong19;
				} else if (this.aLong23 >= this.aLong19 && this.aLong23 < (long) arg0 + this.aLong19) {
					local257 = this.aLong23;
				}
				if (local257 > -1L && local257 < local168) {
					@Pc(325) int local325 = (int) (local168 - local257);
					Static118.method807(arg2, (int) ((long) arg1 + local257 - this.aLong19), this.aByteArray5, (int) (local257 - this.aLong23), local325);
				}
				this.aLong19 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong20 == -1L) {
					this.aLong20 = this.aLong19;
				}
				Static118.method807(arg2, arg1, this.aByteArray6, (int) (this.aLong19 - this.aLong20), arg0);
				this.aLong19 += arg0;
				if ((long) this.anInt720 < this.aLong19 - this.aLong20) {
					this.anInt720 = (int) (this.aLong19 - this.aLong20);
				}
			}
		} catch (@Pc(404) IOException local404) {
			this.aLong18 = -1L;
			throw local404;
		}
	}
}
