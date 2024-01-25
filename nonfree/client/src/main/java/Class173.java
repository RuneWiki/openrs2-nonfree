import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class173 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	private int anInt5353;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!md;")
	private Class131 aClass131_3;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
	private int anInt5354;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!c;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_5;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "[Z")
	private boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	private int anInt5364;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
	private int anInt5367;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "Lclient!qb;")
	private Class124 aClass124_5;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "Lclient!nd;")
	public Class8_Sub5 aClass8_Sub5_7;

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
	private int anInt5361 = -1;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	private int anInt5366 = -1;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "Z")
	private boolean aBoolean334 = false;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	private int anInt5358 = -32768;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
	public final int anInt5373;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
	private int anInt5371;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
	private int anInt5375;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public final int anInt5356;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	public final int anInt5376;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Z")
	private final boolean aBoolean332;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIIIZI)V")
	public Class173(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt5373 = arg3;
		this.anInt5371 = arg7;
		this.aByte60 = (byte) arg4;
		this.aBoolean333 = arg8;
		this.anInt5375 = arg6;
		this.anInt5356 = arg1.anInt5232;
		this.aByte59 = (byte) arg5;
		this.anInt5376 = arg2;
		this.aBoolean332 = arg0.method4804() && arg1.aBoolean312 && !this.aBoolean333;
		if (arg9 != -1) {
			this.aBoolean334 = true;
		}
		this.method4532(arg9);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLclient!tj;IZIII)Lclient!qb;")
	public Class124 method4528(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class170 local10 = Static268.method4553(this.anInt5356);
		if (local10.anIntArray424 != null) {
			local10 = local10.method4398();
		}
		if (local10 == null) {
			this.method4536(arg1);
			this.anInt5361 = this.anInt5367;
			this.anInt5366 = -1;
			return null;
		}
		if (!this.aBoolean334 && local10.anInt5232 != this.anInt5366) {
			this.aClass124_5 = null;
			this.method4532(-1);
		}
		this.method4531(arg2, arg4);
		@Pc(70) boolean local70 = arg3 & this.aBoolean332 & Static77.anInt1520 != 0;
		@Pc(113) boolean local113 = local70 & (local10.anInt5232 != this.anInt5366 || (this.anInt5367 != this.anInt5361 || this.aClass131_3 != null && (this.aClass131_3.aBoolean226 || Static151.aBoolean164) && this.anInt5354 != this.anInt5367) && Static77.anInt1520 >= 2);
		if (arg0 && !local113) {
			this.anInt5361 = this.anInt5367;
			this.anInt5366 = local10.anInt5232;
			return null;
		}
		if (local113) {
			Static103.method1738(this.aClass3_Sub7_Sub3_5, this.aByte59, this.anInt5375, this.anInt5371, this.aBooleanArray26);
		}
		@Pc(145) Class22 local145 = Static69.aClass22Array1[this.aByte59];
		@Pc(161) Class22 local161;
		if (this.aBoolean333) {
			local161 = Static355.aClass22Array3[0];
		} else {
			local161 = this.aByte59 >= 3 ? null : Static69.aClass22Array1[this.aByte59 + 1];
		}
		@Pc(169) Class124 local169 = null;
		if (this.aClass131_3 != null) {
			if (local113) {
				arg5 |= 0x20000;
			}
			local169 = local10.method4410(this.anInt5371, arg1, this.anInt5367, local145, this.anInt5376 == 11 ? this.anInt5373 + 4 : this.anInt5373, this.aClass131_3, local161, this.anInt5354, this.anInt5376 == 11 ? 10 : this.anInt5376, arg5, this.anInt5375, local145.method4678(this.anInt5375, this.anInt5371), this.anInt5364);
			if (local169 == null) {
				this.aBooleanArray26 = null;
				this.anInt5358 = 0;
				this.aClass3_Sub7_Sub3_5 = null;
			} else {
				if (local113) {
					if (this.aBooleanArray26 == null) {
						this.aBooleanArray26 = new boolean[4];
					}
					this.aClass3_Sub7_Sub3_5 = local169.method4081(this.aClass3_Sub7_Sub3_5);
					Static351.method5704(this.aClass3_Sub7_Sub3_5, this.aByte59, arg2, arg4, this.aBooleanArray26);
				}
				this.anInt5358 = local169.method4106();
			}
			this.aClass124_5 = null;
		} else if (this.aClass124_5 != null && arg5 == (arg5 & this.aClass124_5.method4108()) && this.anInt5366 == local10.anInt5232) {
			local169 = this.aClass124_5;
		} else {
			if (this.aClass124_5 != null) {
				arg5 |= this.aClass124_5.method4108();
			}
			@Pc(244) Class111 local244 = local10.method4417(this.anInt5371, local113, this.anInt5376 == 11 ? this.anInt5373 + 4 : this.anInt5373, arg5, this.anInt5376 == 11 ? 10 : this.anInt5376, local145.method4678(this.anInt5375, this.anInt5371), local161, arg1, local145, this.anInt5375);
			if (local244 == null) {
				this.aBooleanArray26 = null;
				this.aClass3_Sub7_Sub3_5 = null;
				this.anInt5358 = 0;
				this.aClass124_5 = null;
			} else {
				local169 = local244.aClass124_3;
				this.aClass124_5 = local244.aClass124_3;
				if (local113) {
					this.aClass3_Sub7_Sub3_5 = local244.aClass3_Sub7_Sub3_3;
					this.aBooleanArray26 = null;
					Static351.method5704(this.aClass3_Sub7_Sub3_5, this.aByte59, arg2, arg4, null);
				}
				this.anInt5358 = local169.method4106();
			}
		}
		this.anInt5366 = local10.anInt5232;
		this.anInt5371 = arg4;
		this.anInt5361 = this.anInt5367;
		this.anInt5375 = arg2;
		return local169;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!tj;)V")
	public void method4529(@OriginalArg(1) Class122 arg0) {
		this.method4528(true, arg0, this.anInt5375, true, this.anInt5371, 131072);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
	public int method4530() {
		return this.anInt5358;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI)V")
	private void method4531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass131_3 == null) {
				if (this.aBoolean334) {
					return;
				}
				this.method4532(-1);
				if (this.aClass131_3 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static51.anInt1101 - this.anInt5353;
			if (local33 > 100 && this.aClass131_3.anInt3989 > 0) {
				@Pc(55) int local55 = this.aClass131_3.anIntArray335.length - this.aClass131_3.anInt3989;
				while (this.anInt5367 < local55 && this.aClass131_3.anIntArray337[this.anInt5367] < local33) {
					local33 -= this.aClass131_3.anIntArray337[this.anInt5367];
					this.anInt5367++;
				}
				if (local55 <= this.anInt5367) {
					@Pc(90) int local90 = 0;
					for (@Pc(92) int local92 = local55; local92 < this.aClass131_3.anIntArray335.length; local92++) {
						local90 += this.aClass131_3.anIntArray337[local92];
					}
					local33 %= local90;
				}
				this.anInt5354 = this.anInt5367 + 1;
				if (this.anInt5354 >= this.aClass131_3.anIntArray335.length) {
					this.anInt5354 -= this.aClass131_3.anInt3989;
					if (this.anInt5354 < 0 || this.anInt5354 >= this.aClass131_3.anIntArray335.length) {
						this.anInt5354 = -1;
					}
				}
			}
			while (this.aClass131_3.anIntArray337[this.anInt5367] < local33) {
				Static161.method2570(this.anInt5367, false, arg1, this.aClass131_3, arg0);
				local33 -= this.aClass131_3.anIntArray337[this.anInt5367];
				this.anInt5367++;
				if (this.aClass131_3.anIntArray335.length <= this.anInt5367) {
					this.anInt5367 -= this.aClass131_3.anInt3989;
					if (this.anInt5367 < 0 || this.aClass131_3.anIntArray335.length <= this.anInt5367) {
						this.aClass131_3 = null;
						continue label80;
					}
				}
				this.anInt5354 = this.anInt5367 + 1;
				if (this.anInt5354 >= this.aClass131_3.anIntArray335.length) {
					this.anInt5354 -= this.aClass131_3.anInt3989;
					if (this.anInt5354 < 0 || this.aClass131_3.anIntArray335.length <= this.anInt5354) {
						this.anInt5354 = -1;
					}
				}
			}
			this.anInt5353 = Static51.anInt1101 - local33;
			this.anInt5364 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	private void method4532(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(17) Class170 local17 = Static268.method4553(this.anInt5356);
			@Pc(19) Class170 local19 = local17;
			if (local17.anIntArray424 != null) {
				local17 = local17.method4398();
			}
			if (local17 == null) {
				return;
			}
			if (local19 == local17) {
				local19 = null;
			}
			if (local17.anIntArray420 != null) {
				if (this.aClass131_3 != null && local17.method4415(this.aClass131_3.anInt3997)) {
					return;
				}
				local7 = local17.method4416();
				if (local17.anInt5232 != this.anInt5366) {
					local9 = local17.aBoolean306;
				}
			} else if (local17.anInt5219 == -1) {
				if (local19 != null && local19.anIntArray420 != null) {
					if (this.aClass131_3 != null && local19.method4415(this.aClass131_3.anInt3997)) {
						return;
					}
					local7 = local19.method4416();
					if (local19.anInt5232 != this.anInt5366) {
						local9 = local19.aBoolean306;
					}
				} else if (local19 != null && local19.anInt5219 != -1 && local19.anInt5232 != this.anInt5366) {
					local9 = local19.aBoolean306;
					local7 = local19.anInt5219;
				}
			} else if (this.anInt5366 != local17.anInt5232) {
				local9 = local17.aBoolean306;
				local7 = local17.anInt5219;
			}
		}
		if (local7 == -1) {
			this.aClass131_3 = null;
			return;
		}
		this.aClass124_5 = null;
		if (this.aClass131_3 == null || local7 != this.aClass131_3.anInt3997) {
			this.aClass131_3 = Static343.method5604(local7);
		} else if (this.aClass131_3.anInt3986 == 0) {
			return;
		}
		if (this.aClass131_3.anIntArray335 == null) {
			this.aClass131_3 = null;
			return;
		}
		if (local9) {
			this.anInt5367 = (int) (Math.random() * (double) this.aClass131_3.anIntArray335.length);
			this.anInt5364 = (int) ((double) this.aClass131_3.anIntArray337[this.anInt5367] * Math.random()) + 1;
		} else {
			this.anInt5364 = 1;
			this.anInt5367 = 0;
		}
		this.anInt5354 = this.anInt5367 + 1;
		if (this.anInt5354 < 0 || this.anInt5354 >= this.aClass131_3.anIntArray335.length) {
			this.anInt5354 = -1;
		}
		this.anInt5353 = Static51.anInt1101 - this.anInt5364;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)Z")
	public boolean method4533() {
		return this.aBoolean332;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
	public void method4534(@OriginalArg(1) int arg0) {
		this.aBoolean334 = true;
		this.method4532(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZLclient!tj;Lclient!qb;IIII)V")
	public void method4535(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class112[] local6 = arg3.method4074();
		@Pc(22) Class191[] local22 = arg3.method4112();
		if ((this.aClass8_Sub5_7 == null || this.aClass8_Sub5_7.aBoolean239) && (local6 != null || local22 != null)) {
			@Pc(38) Class170 local38 = Static268.method4553(this.anInt5356);
			if (local38.anIntArray424 != null) {
				local38 = local38.method4398();
			}
			if (local38 != null) {
				this.aClass8_Sub5_7 = new Class8_Sub5(Static51.anInt1101);
			}
		}
		if (this.aClass8_Sub5_7 == null) {
			return;
		}
		if (arg1) {
			this.aClass8_Sub5_7.method3574(arg2, (long) Static51.anInt1101, local6, local22);
		} else {
			this.aClass8_Sub5_7.method3580((long) Static51.anInt1101);
		}
		this.aClass8_Sub5_7.method3571(this.aByte60, arg0, arg6, arg5, arg4);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!tj;I)V")
	public void method4536(@OriginalArg(0) Class122 arg0) {
		if (this.aClass3_Sub7_Sub3_5 != null) {
			Static103.method1738(this.aClass3_Sub7_Sub3_5, this.aByte59, this.anInt5375, this.anInt5371, this.aBooleanArray26);
			this.aBooleanArray26 = null;
			this.aClass3_Sub7_Sub3_5 = null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_7 != null) {
			this.aClass8_Sub5_7.method3569();
		}
	}
}
