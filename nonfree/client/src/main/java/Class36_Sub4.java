import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class36_Sub4 extends Class36 {

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Lclient!nl;")
	private Class119_Sub1 aClass119_Sub1_4;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
	private int anInt4188 = 0;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
	private int anInt4193 = -1;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "Z")
	private boolean aBoolean345 = false;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "Z")
	private boolean aBoolean346 = true;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
	private int anInt4195 = -32768;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
	private int anInt4186 = 0;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Lclient!hk;")
	private Class71_Sub1 aClass71_Sub1_3 = null;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
	private int anInt4180 = 0;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
	private int anInt4191 = -1;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
	private int anInt4196;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	private int anInt4181;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
	private int anInt4205;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	private int anInt4178;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
	private int anInt4182;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
	private int anInt4198;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
	private int anInt4203;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
	private int anInt4189;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	private int anInt4185;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Lclient!bd;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
	private int anInt4199;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIIZLclient!fc;)V")
	public Class36_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class36 arg8) {
		this.anInt4196 = arg3;
		this.anInt4181 = arg5;
		this.anInt4205 = arg1;
		this.anInt4178 = arg0;
		this.anInt4182 = arg2;
		this.anInt4198 = arg4;
		if (arg8 != null) {
			this.aBoolean345 = true;
			if (arg8 instanceof Class36_Sub4) {
				@Pc(93) Class36_Sub4 local93 = (Class36_Sub4) arg8;
				if (Static60.aBoolean106) {
					local93.method3395();
				}
				this.anInt4203 = local93.anInt4203;
				this.anInt4189 = local93.anInt4189;
				this.anInt4185 = local93.anInt4185;
				this.aClass15_2 = local93.aClass15_2;
				this.anInt4199 = local93.anInt4199;
			} else if (Static60.aBoolean106) {
				@Pc(62) Class143 local62 = Static218.method3692(this.anInt4178);
				if (local62.anIntArray372 != null) {
					local62 = local62.method3641();
				}
				if (local62 != null) {
					Static100.method1914(this.anInt4198, 0, this.anInt4196, this.anInt4205, local62, 0, this.anInt4182, this.anInt4181);
				}
			}
		}
		if (this.aBoolean345) {
			this.method3402(arg6);
		}
		if (Static60.aBoolean106 && arg8 != null) {
			this.method3396(true);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static60.aBoolean106) {
			this.method3396(true);
		} else {
			this.method3400(arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
	public void method3395() {
		if (this.aClass71_Sub1_3 != null) {
			Static194.method3252(this.aClass71_Sub1_3, this.anInt4188, this.anInt4186, this.anInt4180);
			this.aClass71_Sub1_3 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Lclient!fc;")
	private Class36 method3396(@OriginalArg(0) boolean arg0) {
		@Pc(8) boolean local8 = Static141.anIntArrayArrayArray4 != Static274.anIntArrayArrayArray14;
		@Pc(17) Class143 local17 = Static218.method3692(this.anInt4178);
		if (local17.anIntArray372 != null) {
			local17 = local17.method3641();
		}
		if (local17 == null) {
			if (Static60.aBoolean106 && !local8) {
				this.method3395();
			}
			this.anInt4191 = this.anInt4189;
			this.anInt4193 = -1;
			return null;
		}
		if (!this.aBoolean345 && local17.anInt4488 != this.anInt4193) {
			this.method3402(-1);
		}
		@Pc(66) int local66 = this.anInt4182 & 0x3;
		@Pc(75) int local75;
		@Pc(78) int local78;
		if (local66 == 1 || local66 == 3) {
			local75 = local17.anInt4494;
			local78 = local17.anInt4496;
		} else {
			local75 = local17.anInt4496;
			local78 = local17.anInt4494;
		}
		@Pc(93) int local93 = (local75 >> 1) + this.anInt4198;
		@Pc(102) int local102 = (local75 + 1 >> 1) + this.anInt4198;
		@Pc(110) int local110 = this.anInt4181 + (local78 >> 1);
		@Pc(120) int local120 = this.anInt4181 + (local78 + 1 >> 1);
		this.method3400(local93 * 128, local110 * 128);
		@Pc(180) boolean local180 = !local8 && local17.aBoolean368 && (local17.anInt4488 != this.anInt4193 || (this.anInt4191 != this.anInt4189 || this.aClass15_2 != null && (this.aClass15_2.aBoolean33 || Static176.aBoolean324) && this.anInt4189 != this.anInt4185) && Static195.anInt4041 >= 2);
		if (arg0 && !local180) {
			this.anInt4191 = this.anInt4189;
			this.anInt4193 = local17.anInt4488;
			return null;
		}
		@Pc(199) int[][] local199 = Static141.anIntArrayArrayArray4[this.anInt4196];
		@Pc(208) int local208 = (local75 << 6) + (this.anInt4198 << 7);
		@Pc(217) int local217 = (this.anInt4181 << 7) + (local78 << 6);
		@Pc(220) int[][] local220 = null;
		@Pc(246) int local246 = local199[local93][local120] + local199[local102][local110] + local199[local93][local110] + local199[local102][local120] >> 2;
		if (local8) {
			local220 = Static274.anIntArrayArrayArray14[0];
		} else if (this.anInt4196 < 3) {
			local220 = Static141.anIntArrayArrayArray4[this.anInt4196 + 1];
		}
		if (Static60.aBoolean106 && local180) {
			Static194.method3252(this.aClass71_Sub1_3, this.anInt4188, this.anInt4186, this.anInt4180);
		}
		@Pc(302) boolean local302 = this.aClass71_Sub1_3 == null;
		@Pc(327) Class62 local327;
		if (this.aClass15_2 == null) {
			local327 = local17.method3651(local302 ? Static253.aClass71_Sub1_4 : this.aClass71_Sub1_3, local220, this.anInt4205, local217, false, local246, local180, this.anInt4182, local199, local208);
		} else {
			local327 = local17.method3639(this.anInt4185, this.anInt4189, this.anInt4205, this.anInt4182, local246, this.anInt4199, local302 ? Static253.aClass71_Sub1_4 : this.aClass71_Sub1_3, local180, this.aClass15_2, local217, local208, local199, local220);
		}
		if (local327 == null) {
			this.anInt4193 = local17.anInt4488;
			this.anInt4191 = this.anInt4189;
			return null;
		}
		if (Static60.aBoolean106 && local180) {
			if (local302) {
				Static253.aClass71_Sub1_4 = local327.aClass71_Sub1_1;
			}
			@Pc(381) int local381 = 0;
			if (this.anInt4196 != 0) {
				@Pc(388) int[][] local388 = Static141.anIntArrayArrayArray4[0];
				local381 = local246 - (local388[local102][local120] + local388[local93][local110] + local388[local102][local110] + local388[local93][local120] >> 2);
			}
			@Pc(420) Class71_Sub1 local420 = local327.aClass71_Sub1_1;
			if (this.aBoolean346 && Static194.method3246(local420, local208, local381, local217)) {
				this.aBoolean346 = false;
			}
			if (!this.aBoolean346) {
				Static194.method3253(local420, local208, local381, local217);
				if (local302) {
					Static253.aClass71_Sub1_4 = null;
				}
				this.anInt4180 = local217;
				this.anInt4186 = local381;
				this.aClass71_Sub1_3 = local420;
				this.anInt4188 = local208;
			}
		}
		this.anInt4193 = local17.anInt4488;
		this.anInt4191 = this.anInt4189;
		return local327.aClass36_4;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)V")
	private void method3400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label84: while (true) {
			if (this.aClass15_2 == null) {
				if (this.aBoolean345) {
					return;
				}
				this.method3402(-1);
				if (this.aClass15_2 == null) {
					return;
				}
			}
			@Pc(45) int local45 = Static148.anInt3168 - this.anInt4203;
			if (local45 > 100 && this.aClass15_2.anInt430 > 0) {
				@Pc(64) int local64 = this.aClass15_2.anIntArray26.length - this.aClass15_2.anInt430;
				while (this.anInt4189 < local64 && local45 > this.aClass15_2.anIntArray28[this.anInt4189]) {
					local45 -= this.aClass15_2.anIntArray28[this.anInt4189];
					this.anInt4189++;
				}
				if (local64 <= this.anInt4189) {
					@Pc(107) int local107 = 0;
					for (@Pc(109) int local109 = local64; local109 < this.aClass15_2.anIntArray26.length; local109++) {
						local107 += this.aClass15_2.anIntArray28[local109];
					}
					local45 %= local107;
				}
				this.anInt4185 = this.anInt4189 + 1;
				if (this.aClass15_2.anIntArray26.length <= this.anInt4185) {
					this.anInt4185 -= this.aClass15_2.anInt430;
					if (this.anInt4185 < 0 || this.aClass15_2.anIntArray26.length <= this.anInt4185) {
						this.anInt4185 = -1;
					}
				}
			}
			while (this.aClass15_2.anIntArray28[this.anInt4189] < local45) {
				Static225.method3777(this.anInt4189, false, arg1, this.aClass15_2, arg0);
				local45 -= this.aClass15_2.anIntArray28[this.anInt4189];
				this.anInt4189++;
				if (this.aClass15_2.anIntArray26.length <= this.anInt4189) {
					this.anInt4189 -= this.aClass15_2.anInt430;
					if (this.anInt4189 < 0 || this.aClass15_2.anIntArray26.length <= this.anInt4189) {
						this.aClass15_2 = null;
						continue label84;
					}
				}
				this.anInt4185 = this.anInt4189 + 1;
				if (this.anInt4185 >= this.aClass15_2.anIntArray26.length) {
					this.anInt4185 -= this.aClass15_2.anInt430;
					if (this.anInt4185 < 0 || this.aClass15_2.anIntArray26.length <= this.anInt4185) {
						this.anInt4185 = -1;
					}
				}
			}
			this.anInt4199 = local45;
			this.anInt4203 = Static148.anInt3168 - local45;
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)Lclient!fc;")
	public Class36 method3401() {
		return this.method3396(false);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()I")
	@Override
	public int method4881() {
		return this.anInt4195;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
	private void method3402(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0;
		@Pc(13) boolean local13 = false;
		if (arg0 == -1) {
			@Pc(21) Class143 local21 = Static218.method3692(this.anInt4178);
			@Pc(23) Class143 local23 = local21;
			if (local21.anIntArray372 != null) {
				local21 = local21.method3641();
			}
			if (local21 == null) {
				return;
			}
			if (local21 == local23) {
				local23 = null;
			}
			if (local21.anIntArray370 != null) {
				if (this.aClass15_2 != null && local21.method3648(this.aClass15_2.anInt420)) {
					return;
				}
				local11 = local21.method3646();
				if (this.anInt4193 != local21.anInt4488) {
					local13 = local21.aBoolean376;
				}
			} else if (local21.anInt4531 == -1) {
				if (local23 != null && local23.anIntArray370 != null) {
					if (this.aClass15_2 != null && local23.method3648(this.aClass15_2.anInt420)) {
						return;
					}
					local11 = local23.method3646();
					if (local23.anInt4488 != this.anInt4193) {
						local13 = local23.aBoolean376;
					}
				} else if (local23 != null && local23.anInt4531 != -1 && this.anInt4193 != local23.anInt4488) {
					local11 = local23.anInt4531;
					local13 = local23.aBoolean376;
				}
			} else if (local21.anInt4488 != this.anInt4193) {
				local13 = local21.aBoolean376;
				local11 = local21.anInt4531;
			}
		}
		if (local11 == -1) {
			this.aClass15_2 = null;
			return;
		}
		if (this.aClass15_2 == null || this.aClass15_2.anInt420 != local11) {
			this.aClass15_2 = Static35.method706(local11);
		} else if (this.aClass15_2.anInt428 == 0) {
			return;
		}
		if (local13) {
			this.anInt4189 = (int) ((double) this.aClass15_2.anIntArray26.length * Math.random());
		} else {
			this.anInt4189 = 0;
		}
		this.anInt4185 = this.anInt4189 + 1;
		if (this.anInt4185 < 0 || this.aClass15_2.anIntArray26.length <= this.anInt4185) {
			this.anInt4185 = -1;
		}
		this.anInt4199 = (int) (Math.random() * (double) this.aClass15_2.anIntArray28[this.anInt4189]) + 1;
		this.anInt4203 = Static148.anInt3168 - this.anInt4199;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class119_Sub1 arg10) {
		@Pc(3) Class36 local3 = this.method3401();
		if (local3 != null) {
			local3.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_4);
		}
	}

	@OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}
}
