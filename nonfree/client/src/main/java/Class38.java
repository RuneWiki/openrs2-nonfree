import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class38 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	private int anInt1350;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	private int anInt1349 = 0;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "J")
	private long aLong60 = -1L;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "J")
	private long aLong58 = -1L;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "Lclient!kd;")
	private final Class45 aClass45_3;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "[B")
	private final byte[] aByteArray9;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class38(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass45_3 = arg0;
		this.aLong61 = this.aLong57 = arg0.method1132();
		this.aLong59 = 0L;
		this.aByteArray9 = new byte[arg2];
		this.aByteArray8 = new byte[arg1];
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	private void method884() throws IOException {
		this.anInt1350 = 0;
		if (this.aLong59 != this.aLong62) {
			this.aClass45_3.method1133(this.aLong59);
			this.aLong62 = this.aLong59;
		}
		this.aLong60 = this.aLong59;
		while (this.aByteArray8.length > this.anInt1350) {
			@Pc(54) int local54 = this.aClass45_3.method1137(this.aByteArray8, this.anInt1350, this.aByteArray8.length - this.anInt1350);
			if (local54 == -1) {
				break;
			}
			this.anInt1350 += local54;
			this.aLong62 += local54;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)V")
	public void method885(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong59 = arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([BBII)V")
	public void method887(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong61 < (long) arg2 + this.aLong59) {
				this.aLong61 = (long) arg2 + this.aLong59;
			}
			if (this.aLong58 != -1L && (this.aLong58 > this.aLong59 || this.aLong59 > this.aLong58 + (long) this.anInt1349)) {
				this.method890();
			}
			if (this.aLong58 != -1L && (long) arg2 + this.aLong59 > this.aLong58 + (long) this.aByteArray9.length) {
				@Pc(91) int local91 = (int) (this.aLong58 + (long) this.aByteArray9.length - this.aLong59);
				Static134.method1168(arg0, arg1, this.aByteArray9, (int) (this.aLong59 - this.aLong58), local91);
				arg2 -= local91;
				arg1 += local91;
				this.aLong59 += local91;
				this.anInt1349 = this.aByteArray9.length;
				this.method890();
			}
			if (this.aByteArray9.length < arg2) {
				@Pc(138) long local138 = -1L;
				@Pc(140) long local140 = -1L;
				if (this.aLong62 != this.aLong59) {
					this.aClass45_3.method1133(this.aLong59);
					this.aLong62 = this.aLong59;
				}
				this.aClass45_3.method1134(arg2, arg0, arg1);
				if (this.aLong60 <= this.aLong59 && this.aLong59 < this.aLong60 + (long) this.anInt1350) {
					local138 = this.aLong59;
				} else if (this.aLong59 <= this.aLong60 && this.aLong60 < this.aLong59 + (long) arg2) {
					local138 = this.aLong60;
				}
				if (this.aLong59 + (long) arg2 > this.aLong60 && (long) this.anInt1350 + this.aLong60 >= (long) arg2 + this.aLong59) {
					local140 = (long) arg2 + this.aLong59;
				} else if ((long) this.anInt1350 + this.aLong60 > this.aLong59 && this.aLong60 + (long) this.anInt1350 <= (long) arg2 + this.aLong59) {
					local140 = (long) this.anInt1350 + this.aLong60;
				}
				this.aLong62 += arg2;
				if (this.aLong57 < this.aLong62) {
					this.aLong57 = this.aLong62;
				}
				if (local138 > -1L && local138 < local140) {
					@Pc(304) int local304 = (int) (local140 - local138);
					Static134.method1168(arg0, (int) ((long) arg1 + local138 - this.aLong59), this.aByteArray8, (int) (local138 - this.aLong60), local304);
				}
				this.aLong59 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong58 == -1L) {
					this.aLong58 = this.aLong59;
				}
				Static134.method1168(arg0, arg1, this.aByteArray9, (int) (this.aLong59 - this.aLong58), arg2);
				this.aLong59 += arg2;
				if (this.aLong59 - this.aLong58 > (long) this.anInt1349) {
					this.anInt1349 = (int) (this.aLong59 - this.aLong58);
				}
			}
		} catch (@Pc(395) IOException local395) {
			this.aLong62 = -1L;
			throw local395;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	public void method889() throws IOException {
		this.method890();
		this.aClass45_3.method1135();
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	private void method890() throws IOException {
		if (this.aLong58 == -1L) {
			return;
		}
		if (this.aLong58 != this.aLong62) {
			this.aClass45_3.method1133(this.aLong58);
			this.aLong62 = this.aLong58;
		}
		this.aClass45_3.method1134(this.anInt1349, this.aByteArray9, 0);
		@Pc(39) long local39 = -1L;
		this.aLong62 += this.anInt1349;
		@Pc(49) long local49 = -1L;
		if (this.aLong60 <= this.aLong58 && this.aLong58 < this.aLong60 + (long) this.anInt1350) {
			local39 = this.aLong58;
		} else if (this.aLong60 >= this.aLong58 && this.aLong58 + (long) this.anInt1349 > this.aLong60) {
			local39 = this.aLong60;
		}
		if (this.aLong60 < this.aLong58 + (long) this.anInt1349 && (long) this.anInt1350 + this.aLong60 >= this.aLong58 - -((long) this.anInt1349)) {
			local49 = (long) this.anInt1349 + this.aLong58;
		} else if (this.aLong58 < this.aLong60 + (long) this.anInt1350 && this.aLong60 + (long) this.anInt1350 <= (long) this.anInt1349 + this.aLong58) {
			local49 = (long) this.anInt1350 + this.aLong60;
		}
		if (this.aLong62 > this.aLong57) {
			this.aLong57 = this.aLong62;
		}
		if (local39 > -1L && local39 < local49) {
			@Pc(205) int local205 = (int) (local49 - local39);
			Static134.method1168(this.aByteArray9, (int) (local39 - this.aLong58), this.aByteArray8, (int) (local39 - this.aLong60), local205);
		}
		this.aLong58 = -1L;
		this.anInt1349 = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBI[B)V")
	public void method891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong58 != -1L && this.aLong58 <= this.aLong59 && (long) arg1 + this.aLong59 <= (long) this.anInt1349 + this.aLong58) {
				Static134.method1168(this.aByteArray9, (int) (this.aLong59 - this.aLong58), arg2, 0, arg1);
				this.aLong59 += arg1;
				return;
			}
			@Pc(73) long local73 = this.aLong59;
			@Pc(75) int local75 = arg1;
			@Pc(114) int local114;
			if (this.aLong59 >= this.aLong60 && this.aLong59 < this.aLong60 + (long) this.anInt1350) {
				local114 = (int) ((long) this.anInt1350 + this.aLong60 - this.aLong59);
				if (arg1 < local114) {
					local114 = arg1;
				}
				arg1 -= local114;
				Static134.method1168(this.aByteArray8, (int) (this.aLong59 - this.aLong60), arg2, 0, local114);
				this.aLong59 += local114;
				arg0 = local114;
			}
			if (arg1 > this.aByteArray8.length) {
				this.aClass45_3.method1133(this.aLong59);
				this.aLong62 = this.aLong59;
				while (arg1 > 0) {
					local114 = this.aClass45_3.method1137(arg2, arg0, arg1);
					if (local114 == -1) {
						break;
					}
					this.aLong62 += local114;
					arg1 -= local114;
					this.aLong59 += local114;
					arg0 += local114;
				}
			} else if (arg1 > 0) {
				this.method884();
				local114 = arg1;
				if (arg1 > this.anInt1350) {
					local114 = this.anInt1350;
				}
				Static134.method1168(this.aByteArray8, 0, arg2, arg0, local114);
				arg0 += local114;
				this.aLong59 += local114;
				arg1 -= local114;
			}
			if (this.aLong58 != -1L) {
				if (this.aLong59 < this.aLong58 && arg1 > 0) {
					local114 = arg0 + (int) (this.aLong58 - this.aLong59);
					if (arg0 + arg1 < local114) {
						local114 = arg0 + arg1;
					}
					while (local114 > arg0) {
						arg1--;
						arg2[arg0++] = 0;
						this.aLong59++;
					}
				}
				@Pc(305) long local305 = -1L;
				@Pc(307) long local307 = -1L;
				if (local73 <= this.aLong58 && local73 + (long) local75 > this.aLong58) {
					local305 = this.aLong58;
				} else if (this.aLong58 <= local73 && this.aLong58 + (long) this.anInt1349 > local73) {
					local305 = local73;
				}
				if (local73 < (long) this.anInt1349 + this.aLong58 && (long) this.anInt1349 + this.aLong58 <= local73 + (long) local75) {
					local307 = (long) this.anInt1349 + this.aLong58;
				} else if (this.aLong58 < (long) local75 + local73 && (long) local75 + local73 <= this.aLong58 - -((long) this.anInt1349)) {
					local307 = local73 + (long) local75;
				}
				if (local305 > -1L && local307 > local305) {
					@Pc(436) int local436 = (int) (local307 - local305);
					Static134.method1168(this.aByteArray9, (int) (local305 - this.aLong58), arg2, (int) (local305 - local73), local436);
					if (this.aLong59 < local307) {
						arg1 = (int) ((long) arg1 + this.aLong59 - local307);
						this.aLong59 = local307;
					}
				}
			}
		} catch (@Pc(474) IOException local474) {
			this.aLong62 = -1L;
			throw local474;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)J")
	public long method892() {
		return this.aLong61;
	}
}
