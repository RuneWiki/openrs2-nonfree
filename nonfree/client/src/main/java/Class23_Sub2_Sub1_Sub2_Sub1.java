import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class23_Sub2_Sub1_Sub2_Sub1 extends Class23_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!fl", name = "Oc", descriptor = "I")
	public int anInt3257;

	@OriginalMember(owner = "client!fl", name = "Pc", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!fl", name = "Uc", descriptor = "Lclient!qha;")
	public Class293 aClass293_1;

	@OriginalMember(owner = "client!fl", name = "fd", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!fl", name = "od", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!fl", name = "ud", descriptor = "I")
	public int anInt3281;

	@OriginalMember(owner = "client!fl", name = "Ic", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!fl", name = "Mc", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!fl", name = "Rc", descriptor = "B")
	private byte aByte52 = 0;

	@OriginalMember(owner = "client!fl", name = "id", descriptor = "I")
	public int anInt3270 = -1;

	@OriginalMember(owner = "client!fl", name = "Lc", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!fl", name = "pd", descriptor = "I")
	public int anInt3276 = 255;

	@OriginalMember(owner = "client!fl", name = "ld", descriptor = "I")
	public int anInt3272 = 0;

	@OriginalMember(owner = "client!fl", name = "qd", descriptor = "I")
	public int anInt3277 = -1;

	@OriginalMember(owner = "client!fl", name = "yd", descriptor = "I")
	public int anInt3284 = -1;

	@OriginalMember(owner = "client!fl", name = "sd", descriptor = "I")
	public int anInt3279 = -1;

	@OriginalMember(owner = "client!fl", name = "Zc", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!fl", name = "cd", descriptor = "I")
	public int anInt3266 = 0;

	@OriginalMember(owner = "client!fl", name = "Kc", descriptor = "B")
	private byte aByte51 = 0;

	@OriginalMember(owner = "client!fl", name = "wd", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!fl", name = "zd", descriptor = "I")
	public int anInt3285 = 0;

	@OriginalMember(owner = "client!fl", name = "Xc", descriptor = "I")
	public int anInt3262 = -1;

	@OriginalMember(owner = "client!fl", name = "Dd", descriptor = "I")
	public int anInt3288 = -1;

	@OriginalMember(owner = "client!fl", name = "Cd", descriptor = "B")
	private byte aByte53 = 0;

	@OriginalMember(owner = "client!fl", name = "td", descriptor = "I")
	public int anInt3280 = -1;

	@OriginalMember(owner = "client!fl", name = "dd", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!fl", name = "gd", descriptor = "I")
	public int anInt3268 = 0;

	@OriginalMember(owner = "client!fl", name = "Fd", descriptor = "I")
	public int anInt3290 = 0;

	@OriginalMember(owner = "client!fl", name = "Gd", descriptor = "I")
	public int anInt3291 = -1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method2902() {
		return this.aString34;
	}

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return false;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(ZZ)Ljava/lang/String;")
	public String method2903() {
		@Pc(16) String local16 = "";
		if (Static124.aStringArray22 != null) {
			local16 = local16 + Static124.aStringArray22[this.aByte52];
		}
		@Pc(38) int[] local38;
		if (this.aByte53 == 1 && Static173.anIntArray224 != null) {
			local38 = Static173.anIntArray224;
		} else {
			local38 = Static12.anIntArray6;
		}
		if (local38 != null && local38[this.aByte52] != -1) {
			@Pc(58) Class300 local58 = Static466.aClass49_1.method1528(local38[this.aByte52]);
			if (local58.aChar4 == 's') {
				local16 = local16 + local58.method7155(this.aByte51 & 0xFF);
			} else {
				Static81.method1711("gdn1", new Throwable());
				local38[this.aByte52] = -1;
			}
		}
		local16 = local16 + this.aString33;
		if (Static516.aStringArray56 != null) {
			local16 = local16 + Static516.aStringArray56[this.aByte52];
		}
		return local16;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass293_1 == null || !this.method2904(131072, arg0)) {
			return false;
		}
		@Pc(19) Class25 local19 = arg0.method8156();
		@Pc(24) int local24 = super.aClass314_7.method7395();
		local19.method4289(local24);
		local19.method4301(super.anInt10108, super.anInt10114, super.anInt10109);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass28Array3.length; local39++) {
			if (super.aClass28Array3[local39] != null && (Static148.aBoolean221 ? super.aClass28Array3[local39].method6904(arg1, arg2, local19, true, 0, Static209.anInt10104) : super.aClass28Array3[local39].method6887(arg1, arg2, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass28Array3[0] = super.aClass28Array3[1] = super.aClass28Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		if (this.aClass293_1 == null || !this.method2904(2048, arg0)) {
			return null;
		}
		@Pc(19) Class25 local19 = arg0.method8156();
		@Pc(24) int local24 = super.aClass314_7.method7395();
		local19.method4289(local24);
		@Pc(42) Class247 local42 = Static332.aClass247ArrayArrayArray1[super.aByte142][super.anInt10108 >> Static436.anInt7634][super.anInt10109 >> Static436.anInt7634];
		if (local42 == null || local42.aClass23_Sub2_Sub3_1 == null) {
			super.anInt10145 = (int) ((float) super.anInt10145 - (float) super.anInt10145 / 10.0F);
		} else {
			@Pc(54) int local54 = super.anInt10145 - local42.aClass23_Sub2_Sub3_1.aShort116;
			super.anInt10145 = (int) ((float) super.anInt10145 - (float) local54 / 10.0F);
		}
		local19.method4301(super.anInt10108, super.anInt10114 - super.anInt10145 - 20, super.anInt10109);
		super.aBoolean749 = false;
		@Pc(98) Class23_Sub6 local98 = null;
		if (Static227.aClass3_Sub15_11.aClass17_Sub29_1.method8741() == 1) {
			@Pc(110) Class351 local110 = this.method8630();
			if (local110.aBoolean704 && (this.aClass293_1.anInt8252 == -1 || Static481.aClass241_2.method5582(this.aClass293_1.anInt8252).aBoolean8)) {
				@Pc(145) Class48 local145 = super.anInt10135 != -1 && super.anInt10186 == 0 ? Static483.aClass373_2.method8323(super.anInt10135) : null;
				@Pc(166) Class48 local166 = super.anInt10148 == -1 || this.aBoolean263 || super.aBoolean748 && local145 != null ? null : Static483.aClass373_2.method8323(super.anInt10148);
				@Pc(198) Class28 local198 = Static82.method1762(super.anInt10168, super.anInt10141, arg0, local166 == null ? local145 : local166, super.aClass28Array3[0], 160, 0, local166 == null ? super.anInt10163 : super.anInt10183, local24, 1, 240, super.anInt10166, 0);
				if (local198 != null) {
					local98 = Static564.method8406(super.aClass28Array3.length + 1, true);
					super.aBoolean749 = true;
					arg0.C(false);
					if (Static148.aBoolean221) {
						local198.method6894(local19, local98.aClass23_Sub4Array1[super.aClass28Array3.length], Static209.anInt10104, 0);
					} else {
						local198.method6908(local19, local98.aClass23_Sub4Array1[super.aClass28Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(251) int local251;
		if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == this) {
			for (local251 = Static110.aClass70Array1.length - 1; local251 >= 0; local251--) {
				@Pc(257) Class70 local257 = Static110.aClass70Array1[local251];
				if (local257 != null && local257.anInt2015 != -1) {
					@Pc(290) int local290;
					if (local257.anInt2023 == 1) {
						@Pc(278) Class3_Sub11 local278 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local257.anInt2021);
						if (local278 != null) {
							@Pc(283) Class23_Sub2_Sub1_Sub2_Sub2 local283 = local278.aClass23_Sub2_Sub1_Sub2_Sub2_1;
							local290 = local283.anInt10108 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108;
							@Pc(297) int local297 = local283.anInt10109 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109;
							if (Static148.aBoolean221) {
								this.method2911(local290, Static209.anInt10104, local297, arg0, super.aClass28Array3[0], 92160000, local257.anInt2015, local19);
							} else {
								this.method2906(local297, local257.anInt2015, 92160000, arg0, local290, local19, super.aClass28Array3[0]);
							}
						}
					}
					@Pc(348) int local348;
					if (local257.anInt2023 == 2) {
						@Pc(341) int local341 = local257.anInt2018 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108;
						local348 = local257.anInt2017 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109;
						local290 = local257.anInt2019 << 9;
						local290 *= local290;
						if (Static148.aBoolean221) {
							this.method2911(local341, Static209.anInt10104, local348, arg0, super.aClass28Array3[0], local290, local257.anInt2015, local19);
						} else {
							this.method2906(local348, local257.anInt2015, local290, arg0, local341, local19, super.aClass28Array3[0]);
						}
					}
					if (local257.anInt2023 == 10 && local257.anInt2021 >= 0 && local257.anInt2021 < Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1.length) {
						@Pc(413) Class23_Sub2_Sub1_Sub2_Sub1 local413 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local257.anInt2021];
						if (local413 != null) {
							local348 = local413.anInt10108 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108;
							local290 = local413.anInt10109 - Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109;
							if (Static148.aBoolean221) {
								this.method2911(local348, Static209.anInt10104, local290, arg0, super.aClass28Array3[0], 92160000, local257.anInt2015, local19);
							} else {
								this.method2906(local290, local257.anInt2015, 92160000, arg0, local348, local19, super.aClass28Array3[0]);
							}
						}
					}
				}
			}
			local19.method4289(local24);
			local19.method4301(super.anInt10108, super.anInt10114, super.anInt10109);
		}
		local19.method4289(local24);
		local19.method4301(super.anInt10108, super.anInt10114 - super.anInt10145 - 5, super.anInt10109);
		if (local98 == null) {
			local98 = Static564.method8406(super.aClass28Array3.length, true);
		}
		this.method8626(super.aClass28Array3, local19, false, arg0);
		if (Static148.aBoolean221) {
			for (local251 = 0; super.aClass28Array3.length > local251; local251++) {
				if (super.aClass28Array3[local251] != null) {
					super.aClass28Array3[local251].method6894(local19, local98.aClass23_Sub4Array1[local251], Static209.anInt10104, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local251 = 0; local251 < super.aClass28Array3.length; local251++) {
				if (super.aClass28Array3[local251] != null) {
					super.aClass28Array3[local251].method6908(local19, local98.aClass23_Sub4Array1[local251], Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass23_Sub5_8 != null) {
			@Pc(591) Class237 local591 = super.aClass23_Sub5_8.method2587();
			if (Static148.aBoolean221) {
				arg0.method8115(local591, Static209.anInt10104);
			} else {
				arg0.method8119(local591);
			}
		}
		for (local251 = 0; local251 < super.aClass28Array3.length; local251++) {
			if (super.aClass28Array3[local251] != null) {
				super.aBoolean749 |= super.aClass28Array3[local251].F();
			}
			super.aClass28Array3[local251] = null;
		}
		super.anInt10126 = Static156.anInt5851;
		return local98;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)I")
	@Override
	public int method8614() {
		return -1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
		if (this.aClass293_1 == null || !super.aBoolean750 && !this.method2904(0, arg0)) {
			return;
		}
		@Pc(22) Class25 local22 = arg0.method8156();
		local22.method4289(super.aClass314_7.method7395());
		local22.method4301(super.anInt10108, super.anInt10114 - 5, super.anInt10109);
		this.method8626(super.aClass28Array3, local22, super.aBoolean750, arg0);
		for (@Pc(55) int local55 = 0; local55 < super.aClass28Array3.length; local55++) {
			super.aClass28Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(B)I")
	@Override
	public int method8625() {
		return this.aClass293_1 == null || this.aClass293_1.anInt8252 == -1 ? super.method8625() : Static481.aClass241_2.method5582(this.aClass293_1.anInt8252).anInt66;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILclient!ha;)Z")
	private boolean method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class351 local11 = this.method8630();
		@Pc(26) Class48 local26 = super.anInt10135 != -1 && super.anInt10186 == 0 ? Static483.aClass373_2.method8323(super.anInt10135) : null;
		@Pc(46) Class48 local46 = super.anInt10148 == -1 || this.aBoolean263 || super.aBoolean748 && local26 != null ? null : Static483.aClass373_2.method8323(super.anInt10148);
		@Pc(49) int local49 = local11.anInt9401;
		@Pc(52) int local52 = local11.anInt9376;
		if (local49 != 0 || local52 != 0 || local11.anInt9416 != 0 || local11.anInt9382 != 0) {
			arg0 |= 0x7;
		}
		@Pc(77) int local77 = super.aClass314_7.method7395();
		@Pc(100) boolean local100 = super.aByte146 != 0 && super.anInt10176 <= Static621.anInt9665 && Static621.anInt9665 < super.anInt10152;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(152) Class28 local152 = super.aClass28Array3[0] = this.aClass293_1.method6981(super.anInt10138, Static483.aClass373_2, super.anInt10143, super.anInt10177, super.anIntArray656, super.anInt10140, arg0, local26, local77, local46, Static592.aClass47_2, Static481.aClass241_2, Static237.aClass371_2, super.anInt10183, super.aClass140Array3, Static605.aClass43_1, arg1, Static658.aClass88_2, super.anInt10163);
		@Pc(155) int local155 = Static417.method5966();
		if (Static595.anInt9375 < 96 && local155 > 50) {
			Static469.method6704();
		}
		if (Static229.aClass309_8 != Static216.aClass309_6 && local155 < 50) {
			@Pc(188) int local188 = 50 - local155;
			while (Static123.anInt2397 < local188) {
				Static237.aByteArrayArray8[Static123.anInt2397] = new byte[102400];
				Static123.anInt2397++;
			}
			while (Static123.anInt2397 > local188) {
				Static123.anInt2397--;
				Static237.aByteArrayArray8[Static123.anInt2397] = null;
			}
		} else if (Static216.aClass309_6 != Static229.aClass309_8) {
			Static123.anInt2397 = 0;
			Static237.aByteArrayArray8 = new byte[50][];
		}
		if (local152 == null) {
			return false;
		}
		super.anInt10184 = local152.fa();
		super.anInt10165 = local152.ma();
		this.method8628(local152);
		if (local49 == 0 && local52 == 0) {
			this.method8631(this.method8625() << 9, 0, this.method8625() << 9, local77, 0);
		} else {
			this.method8631(local52, local11.anInt9384, local49, local77, local11.anInt9389);
			if (super.anInt10166 != 0) {
				local152.FA(super.anInt10166);
			}
			if (super.anInt10168 != 0) {
				local152.VA(super.anInt10168);
			}
			if (super.anInt10141 != 0) {
				local152.H(0, super.anInt10141, 0);
			}
		}
		if (local100) {
			local152.method6895(super.aByte148, super.aByte145, super.aByte147, super.aByte146 & 0xFF);
		}
		if (!this.aBoolean263) {
			this.method8622(local49, arg1, local11, local52, local7, local77);
		}
		return true;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)V")
	public void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray659[0] = arg1;
		super.anInt10190 = 0;
		super.anInt10191 = 0;
		super.anInt10189 = 0;
		super.anIntArray660[0] = arg0;
		@Pc(26) int local26 = this.method8625();
		super.anInt10108 = super.anIntArray659[0] * 512 + local26 * 256;
		super.anInt10109 = local26 * 256 + super.anIntArray660[0] * 512;
		if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == this) {
			Static225.method3512();
		}
		if (super.aClass23_Sub5_8 != null) {
			super.aClass23_Sub5_8.method2588();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!ha;BILclient!sk;Lclient!ka;)V")
	private void method2906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25 arg5, @OriginalArg(7) Class28 arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg4 * arg4;
		if (local11 < 262144 || arg2 < local11) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg4, (double) arg0) * 2607.5945876176133D - (double) super.aClass314_7.method7395()) & 0x3FFF;
		@Pc(53) Class28 local53 = Static190.method3049(local41, super.anInt10141, arg1, arg3, super.anInt10166, super.anInt10168);
		if (local53 != null) {
			arg3.C(false);
			local53.method6908(arg5, (Class23_Sub4) null, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "(I)Z")
	public boolean method2907() {
		return this.aClass293_1 != null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIBI)V")
	public void method2908(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt10135 != -1 && Static483.aClass373_2.method8323(super.anInt10135).anInt1541 == 1) {
			super.anInt10135 = -1;
			super.anIntArray651 = null;
		}
		for (@Pc(35) int local35 = 0; local35 < super.aClass375Array3.length; local35++) {
			if (super.aClass375Array3[local35].anInt9871 != -1) {
				@Pc(54) Class34 local54 = Static196.aClass315_2.method7420(super.aClass375Array3[local35].anInt9871);
				if (local54.aBoolean105 && local54.anInt1217 != -1 && Static483.aClass373_2.method8323(local54.anInt1217).anInt1541 == 1) {
					super.aClass375Array3[local35].anInt9871 = -1;
				}
			}
		}
		this.anInt3262 = -1;
		if (arg0 < 0 || Static251.anInt4680 <= arg0 || arg2 < 0 || Static406.anInt6924 <= arg2) {
			this.method2905(arg2, arg0);
		} else if (super.anIntArray659[0] >= 0 && Static251.anInt4680 > super.anIntArray659[0] && super.anIntArray660[0] >= 0 && super.anIntArray660[0] < Static406.anInt6924) {
			if (arg1 == 2) {
				Static269.method4282(this, arg2, arg0);
			}
			this.method2912(arg1, arg2, arg0);
		} else {
			this.method2905(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!ha;Lclient!ka;BIILclient!sk;)V")
	private void method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) Class28 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class25 arg7) {
		@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
		if (local11 < 262144 || arg5 < local11) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg0, (double) arg2) * 2607.5945876176133D - (double) super.aClass314_7.method7395()) & 0x3FFF;
		@Pc(51) Class28 local51 = Static190.method3049(local35, super.anInt10141, arg6, arg3, super.anInt10166, super.anInt10168);
		if (local51 != null) {
			arg3.C(false);
			local51.method6894(arg7, (Class23_Sub4) null, arg1, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "(I)I")
	@Override
	protected int method8629() {
		return this.anInt3275;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BBII)V")
	public void method2912(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt10190 < 9) {
			super.anInt10190++;
		}
		for (@Pc(18) int local18 = super.anInt10190; local18 > 0; local18--) {
			super.anIntArray659[local18] = super.anIntArray659[local18 - 1];
			super.anIntArray660[local18] = super.anIntArray660[local18 - 1];
			super.aByteArray109[local18] = super.aByteArray109[local18 - 1];
		}
		super.anIntArray659[0] = arg2;
		super.aByteArray109[0] = arg0;
		super.anIntArray660[0] = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!fca;)V")
	public void method2913(@OriginalArg(1) Class3_Sub17 arg0) {
		arg0.lb = 0;
		@Pc(12) int local12 = arg0.method4888();
		this.aByte53 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean258;
		this.aBoolean258 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method8625();
		this.method8621((local12 >> 3 & 0x7) + 1);
		this.aByte52 = (byte) (local12 >> 6 & 0x3);
		super.anInt10108 += this.method8625() - local45 << 8;
		super.anInt10109 += this.method8625() - local45 << 8;
		this.aByte51 = arg0.method4861();
		this.anInt3279 = arg0.method4861();
		this.anInt3277 = arg0.method4861();
		this.aBoolean259 = arg0.method4861() == 1;
		if (Static229.aClass309_8 == Static216.aClass309_6 && Static13.anInt164 >= 2) {
			this.aBoolean259 = false;
		}
		this.anInt3290 = 0;
		@Pc(141) int local141 = -1;
		@Pc(146) int[] local146 = new int[Static252.aClass217_2.anIntArray386.length];
		@Pc(151) Class356[] local151 = new Class356[Static252.aClass217_2.anIntArray386.length];
		@Pc(156) Class146[] local156 = new Class146[Static252.aClass217_2.anIntArray386.length];
		@Pc(170) int local170;
		@Pc(182) int local182;
		@Pc(188) int local188;
		@Pc(236) int local236;
		for (@Pc(158) int local158 = 0; local158 < Static252.aClass217_2.anIntArray386.length; local158++) {
			if (Static252.aClass217_2.anIntArray386[local158] != 1) {
				local170 = arg0.method4888();
				if (local170 == 0) {
					local146[local158] = 0;
				} else {
					local182 = arg0.method4888();
					local188 = local182 + (local170 << 8);
					if (local158 == 0 && local188 == 65535) {
						local141 = arg0.method4858();
						this.anInt3290 = arg0.method4888();
						break;
					}
					if (local188 >= 32768) {
						local188 = Static623.anIntArray557[local188 - 32768];
						local146[local158] = local188 | 0x40000000;
						local156[local158] = Static237.aClass371_2.method8305(local188);
						local236 = local156[local158].anInt3715;
						if (local236 != 0) {
							this.anInt3290 = local236;
						}
					} else {
						local146[local158] = Integer.MIN_VALUE | local188 - 256;
					}
				}
			}
		}
		if (local141 == -1) {
			local170 = arg0.method4858();
			local182 = 0;
			for (local188 = 0; local188 < Static252.aClass217_2.anIntArray386.length; local188++) {
				if (Static252.aClass217_2.anIntArray386[local188] == 0) {
					if ((local170 & 0x1 << local182) != 0) {
						local151[local188] = Static227.method3652(local156[local188], arg0);
					}
					local182++;
				}
			}
		}
		@Pc(309) int[] local309 = new int[5];
		for (local182 = 0; local182 < 5; local182++) {
			local188 = arg0.method4888();
			if (Static580.aShortArrayArrayArray3.length < 1 || local188 < 0 || Static580.aShortArrayArrayArray3[0][local182].length <= local188) {
				local188 = 0;
			}
			local309[local182] = local188;
		}
		this.anInt3275 = arg0.method4858();
		this.aString33 = arg0.method4847();
		this.aString34 = this.aString33;
		if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == this) {
			Static409.aString93 = this.aString33;
		}
		this.anInt3272 = arg0.method4888();
		if (local41) {
			this.anInt3266 = arg0.method4858();
			this.anInt3285 = this.anInt3272;
			this.anInt3270 = -1;
			if (this.anInt3266 == 65535) {
				this.anInt3266 = -1;
			}
		} else {
			this.anInt3266 = 0;
			this.anInt3285 = arg0.method4888();
			this.anInt3270 = arg0.method4888();
			if (this.anInt3270 == 255) {
				this.anInt3270 = -1;
			}
		}
		local188 = this.anInt3268;
		this.anInt3268 = arg0.method4888();
		@Pc(449) int local449;
		if (this.anInt3268 == 0) {
			Static532.method7413(this);
		} else {
			local236 = this.anInt3280;
			@Pc(446) int local446 = this.anInt3284;
			local449 = this.anInt3291;
			@Pc(452) int local452 = this.anInt3288;
			@Pc(455) int local455 = this.anInt3276;
			this.anInt3280 = arg0.method4858();
			this.anInt3284 = arg0.method4858();
			this.anInt3291 = arg0.method4858();
			this.anInt3288 = arg0.method4858();
			this.anInt3276 = arg0.method4888();
			if (local21 != this.aBoolean258 || this.anInt3268 != local188 || this.anInt3280 != local236 || local446 != this.anInt3284 || this.anInt3291 != local449 || local452 != this.anInt3288 || local455 != this.anInt3276) {
				Static277.method4413(this);
			}
		}
		if (this.aClass293_1 == null) {
			this.aClass293_1 = new Class293();
		}
		local236 = this.aClass293_1.anInt8252;
		@Pc(551) int[] local551 = this.aClass293_1.anIntArray533;
		this.aClass293_1.method6979(this.aByte53 == 1, local151, this.method8629(), local309, local141, local146);
		if (local141 != local236) {
			super.anInt10108 = (super.anIntArray659[0] << 9) + (this.method8625() << 8);
			super.anInt10109 = (super.anIntArray660[0] << 9) + (this.method8625() << 8);
		}
		if (super.anInt10180 == Static251.anInt4687 && local551 != null) {
			for (local449 = 0; local449 < local309.length; local449++) {
				if (local309[local449] != local551[local449]) {
					Static237.aClass371_2.method8310();
					break;
				}
			}
		}
		if (super.aClass23_Sub5_8 != null) {
			super.aClass23_Sub5_8.method2588();
		}
		if (super.anInt10148 == -1 || !super.aBoolean748) {
			return;
		}
		@Pc(651) Class351 local651 = this.method8630();
		if (!local651.method7962(super.anInt10148)) {
			super.anInt10148 = -1;
			super.aBoolean748 = false;
			return;
		}
	}
}
