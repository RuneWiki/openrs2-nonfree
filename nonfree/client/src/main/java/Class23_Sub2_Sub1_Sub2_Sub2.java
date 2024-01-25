import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class23_Sub2_Sub1_Sub2_Sub2 extends Class23_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!wda", name = "Jc", descriptor = "Ljava/lang/String;")
	public String aString132;

	@OriginalMember(owner = "client!wda", name = "Tc", descriptor = "Lclient!le;")
	public Class220 aClass220_1;

	@OriginalMember(owner = "client!wda", name = "Vc", descriptor = "I")
	public int anInt10202;

	@OriginalMember(owner = "client!wda", name = "Yc", descriptor = "Lclient!ac;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!wda", name = "Xc", descriptor = "I")
	public int anInt10204 = 1;

	@OriginalMember(owner = "client!wda", name = "ad", descriptor = "I")
	public int anInt10206 = 1;

	@OriginalMember(owner = "client!wda", name = "dd", descriptor = "I")
	public int anInt10208 = -1;

	@OriginalMember(owner = "client!wda", name = "Ic", descriptor = "I")
	public int anInt10192 = -1;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "(I)Z")
	public boolean method8632() {
		return this.aClass5_1 != null;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(III)V")
	public void method8633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray659[0];
		@Pc(15) int local15 = super.anIntArray660[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt10135 != -1 && Static483.aClass373_2.method8323(super.anInt10135).anInt1541 == 1) {
			super.anInt10135 = -1;
			super.anIntArray651 = null;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		for (@Pc(89) int local89 = 0; local89 < super.aClass375Array3.length; local89++) {
			if (super.aClass375Array3[local89].anInt9871 != -1) {
				@Pc(108) Class34 local108 = Static196.aClass315_2.method7420(super.aClass375Array3[local89].anInt9871);
				if (local108.aBoolean105 && local108.anInt1217 != -1 && Static483.aClass373_2.method8323(local108.anInt1217).anInt1541 == 1) {
					super.aClass375Array3[local89].anInt9871 = -1;
				}
			}
		}
		if (super.anInt10190 < 9) {
			super.anInt10190++;
		}
		for (@Pc(151) int local151 = super.anInt10190; local151 > 0; local151--) {
			super.anIntArray659[local151] = super.anIntArray659[local151 - 1];
			super.anIntArray660[local151] = super.anIntArray660[local151 - 1];
			super.aByteArray109[local151] = super.aByteArray109[local151 - 1];
		}
		super.anIntArray659[0] = local10;
		super.anIntArray660[0] = local15;
		super.aByteArray109[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "(B)Z")
	private boolean method8635() {
		return this.aClass5_1.aBoolean9;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!ac;)V")
	public void method8636(@OriginalArg(1) Class5 arg0) {
		this.aClass5_1 = arg0;
		if (this.aClass5_1 != null) {
			this.anInt10202 = this.aClass5_1.anInt68;
			this.aString132 = this.aClass5_1.aString1;
		}
		if (super.aClass23_Sub5_8 != null) {
			super.aClass23_Sub5_8.method2588();
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		if (this.aClass5_1 == null || !this.method8639(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class25 local19 = arg0.method8156();
		@Pc(24) int local24 = super.aClass314_7.method7395();
		local19.method4289(local24);
		@Pc(42) Class247 local42 = Static332.aClass247ArrayArrayArray1[super.aByte142][super.anInt10108 >> Static436.anInt7634][super.anInt10109 >> Static436.anInt7634];
		if (local42 == null || local42.aClass23_Sub2_Sub3_1 == null) {
			super.anInt10145 = (int) ((float) super.anInt10145 - (float) super.anInt10145 / 10.0F);
		} else {
			@Pc(68) int local68 = super.anInt10145 - local42.aClass23_Sub2_Sub3_1.aShort116;
			super.anInt10145 = (int) ((float) super.anInt10145 - (float) local68 / 10.0F);
		}
		local19.method4301(super.anInt10108, super.anInt10114 - super.anInt10145 - 20, super.anInt10109);
		@Pc(97) Class351 local97 = this.method8630();
		@Pc(110) Class5 local110 = this.aClass5_1.anIntArray1 == null ? this.aClass5_1 : this.aClass5_1.method56(Static592.aClass47_2);
		super.aBoolean749 = false;
		@Pc(115) Class23_Sub6 local115 = null;
		if (Static227.aClass3_Sub15_11.aClass17_Sub29_1.method8741() == 1 && local110.aBoolean8 && local97.aBoolean704) {
			@Pc(142) Class48 local142 = super.anInt10135 != -1 && super.anInt10186 == 0 ? Static483.aClass373_2.method8323(super.anInt10135) : null;
			@Pc(160) Class48 local160 = super.anInt10148 == -1 || super.aBoolean748 && local142 != null ? null : Static483.aClass373_2.method8323(super.anInt10148);
			@Pc(210) Class28 local210 = Static82.method1762(super.anInt10168, super.anInt10141, arg0, local160 == null ? local142 : local160, super.aClass28Array3[0], this.aClass5_1.aByte5 & 0xFF, this.aClass5_1.aShort2 & 0xFFFF, local160 == null ? super.anInt10163 : super.anInt10183, local24, this.aClass5_1.anInt66, this.aClass5_1.aByte1 & 0xFF, super.anInt10166, this.aClass5_1.aShort1 & 0xFFFF);
			if (local210 != null) {
				local115 = Static564.method8406(super.aClass28Array3.length + 1, this.method8635());
				super.aBoolean749 = true;
				arg0.C(false);
				if (Static148.aBoolean221) {
					local210.method6894(local19, local115.aClass23_Sub4Array1[super.aClass28Array3.length], Static209.anInt10104, 0);
				} else {
					local210.method6908(local19, local115.aClass23_Sub4Array1[super.aClass28Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method4289(local24);
		local19.method4301(super.anInt10108, super.anInt10114 - super.anInt10145 - 5, super.anInt10109);
		if (local115 == null) {
			local115 = Static564.method8406(super.aClass28Array3.length, this.method8635());
		}
		this.method8626(super.aClass28Array3, local19, false, arg0);
		@Pc(303) int local303;
		if (Static148.aBoolean221) {
			for (local303 = 0; local303 < super.aClass28Array3.length; local303++) {
				if (super.aClass28Array3[local303] != null) {
					super.aClass28Array3[local303].method6894(local19, local115.aClass23_Sub4Array1[local303], Static209.anInt10104, 0);
				}
			}
		} else {
			for (local303 = 0; local303 < super.aClass28Array3.length; local303++) {
				if (super.aClass28Array3[local303] != null) {
					super.aClass28Array3[local303].method6908(local19, local115.aClass23_Sub4Array1[local303], 0);
				}
			}
		}
		if (super.aClass23_Sub5_8 != null) {
			@Pc(371) Class237 local371 = super.aClass23_Sub5_8.method2587();
			if (Static148.aBoolean221) {
				arg0.method8115(local371, Static209.anInt10104);
			} else {
				arg0.method8119(local371);
			}
		}
		for (local303 = 0; super.aClass28Array3.length > local303; local303++) {
			if (super.aClass28Array3[local303] != null) {
				super.aBoolean749 |= super.aClass28Array3[local303].F();
			}
		}
		super.aClass28Array3[0] = super.aClass28Array3[1] = super.aClass28Array3[2] = null;
		super.anInt10126 = Static156.anInt5851;
		return local115;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)I")
	@Override
	public int method8614() {
		if (this.aClass5_1.anIntArray1 != null) {
			@Pc(21) Class5 local21 = this.aClass5_1.method56(Static592.aClass47_2);
			if (local21 != null && local21.anInt46 != -1) {
				return local21.anInt46;
			}
		}
		return this.aClass5_1.anInt46;
	}

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(IIIIIZ)V")
	public void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte142 = super.aByte143 = (byte) arg1;
		if (Static190.method3051(arg0, arg3)) {
			super.aByte143++;
		}
		if (super.anInt10135 != -1 && Static483.aClass373_2.method8323(super.anInt10135).anInt1541 == 1) {
			super.anIntArray651 = null;
			super.anInt10135 = -1;
		}
		for (@Pc(50) int local50 = 0; super.aClass375Array3.length > local50; local50++) {
			if (super.aClass375Array3[local50].anInt9871 != -1) {
				@Pc(68) Class34 local68 = Static196.aClass315_2.method7420(super.aClass375Array3[local50].anInt9871);
				if (local68.aBoolean105 && local68.anInt1217 != -1 && Static483.aClass373_2.method8323(local68.anInt1217).anInt1541 == 1) {
					super.aClass375Array3[local50].anInt9871 = -1;
				}
			}
		}
		if (!arg4) {
			@Pc(112) int local112 = arg3 - super.anIntArray659[0];
			@Pc(120) int local120 = arg0 - super.anIntArray660[0];
			if (local112 >= -8 && local112 <= 8 && local120 >= -8 && local120 <= 8) {
				if (super.anInt10190 < 9) {
					super.anInt10190++;
				}
				for (@Pc(149) int local149 = super.anInt10190; local149 > 0; local149--) {
					super.anIntArray659[local149] = super.anIntArray659[local149 - 1];
					super.anIntArray660[local149] = super.anIntArray660[local149 - 1];
					super.aByteArray109[local149] = super.aByteArray109[local149 - 1];
				}
				super.anIntArray659[0] = arg3;
				super.aByteArray109[0] = 1;
				super.anIntArray660[0] = arg0;
				return;
			}
		}
		super.anInt10191 = 0;
		super.anInt10190 = 0;
		super.anInt10189 = 0;
		super.anIntArray659[0] = arg3;
		super.anIntArray660[0] = arg0;
		super.anInt10109 = (super.anIntArray660[0] << 9) + (arg2 << 8);
		super.anInt10108 = (arg2 << 8) + (super.anIntArray659[0] << 9);
		if (super.aClass23_Sub5_8 != null) {
			super.aClass23_Sub5_8.method2588();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)I")
	@Override
	public int method8613() {
		if (this.aClass5_1.anIntArray1 != null) {
			@Pc(13) Class5 local13 = this.aClass5_1.method56(Static592.aClass47_2);
			if (local13 != null && local13.anInt56 != -1) {
				return local13.anInt56;
			}
		}
		return this.aClass5_1.anInt56 == -1 ? super.method8613() : this.aClass5_1.anInt56;
	}

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "(I)I")
	@Override
	protected int method8629() {
		if (this.aClass5_1.anIntArray1 != null) {
			@Pc(13) Class5 local13 = this.aClass5_1.method56(Static592.aClass47_2);
			if (local13 != null && local13.anInt43 != -1) {
				return local13.anInt43;
			}
		}
		return this.aClass5_1.anInt43;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass5_1 == null || !this.method8639(arg0, 131072)) {
			return false;
		}
		@Pc(24) Class25 local24 = arg0.method8156();
		@Pc(29) int local29 = super.aClass314_7.method7395();
		local24.method4289(local29);
		local24.method4301(super.anInt10108, super.anInt10114, super.anInt10109);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass28Array3.length > local44; local44++) {
			if (super.aClass28Array3[local44] != null) {
				@Pc(72) boolean var10000;
				label41: {
					if (this.aClass5_1.anInt58 <= 0) {
						label39: {
							if (this.aClass5_1.anInt63 == -1) {
								if (this.aClass5_1.anInt66 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass5_1.anInt63 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(85) boolean local85 = var10000;
				@Pc(100) boolean local100;
				if (Static148.aBoolean221) {
					local100 = super.aClass28Array3[local44].method6904(arg1, arg2, local24, local85, this.aClass5_1.anInt58, Static209.anInt10104);
				} else {
					local100 = super.aClass28Array3[local44].method6887(arg1, arg2, local24, local85, this.aClass5_1.anInt58);
				}
				if (local100) {
					local42 = true;
					break;
				}
			}
		}
		super.aClass28Array3[0] = super.aClass28Array3[1] = super.aClass28Array3[2] = null;
		return local42;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLclient!ha;I)Z")
	private boolean method8639(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class351 local9 = this.method8630();
		@Pc(27) Class48 local27 = super.anInt10135 != -1 && super.anInt10186 == 0 ? Static483.aClass373_2.method8323(super.anInt10135) : null;
		@Pc(44) Class48 local44 = super.anInt10148 == -1 || super.aBoolean748 && local27 != null ? null : Static483.aClass373_2.method8323(super.anInt10148);
		@Pc(47) int local47 = local9.anInt9401;
		@Pc(58) int local58 = local9.anInt9376;
		if (local47 != 0 || local58 != 0 || local9.anInt9416 != 0 || local9.anInt9382 != 0) {
			arg1 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte146 != 0 && super.anInt10176 <= Static621.anInt9665 && super.anInt10152 > Static621.anInt9665;
		if (local100) {
			arg1 |= 0x80000;
		}
		@Pc(111) int local111 = super.aClass314_7.method7395();
		@Pc(149) Class28 local149 = super.aClass28Array3[0] = this.aClass5_1.method63(local44, super.anInt10163, this.aClass220_1, local27, super.aClass140Array3, super.anInt10143, arg0, local111, arg1, super.anInt10138, super.anIntArray656, Static592.aClass47_2, Static658.aClass88_2, super.anInt10140, super.anInt10177, super.anInt10183, Static483.aClass373_2);
		if (local149 == null) {
			return false;
		}
		super.anInt10184 = local149.fa();
		super.anInt10165 = local149.ma();
		this.method8628(local149);
		if (local47 == 0 && local58 == 0) {
			this.method8631(this.method8625() << 9, 0, this.method8625() << 9, local111, 0);
		} else {
			this.method8631(local58, local9.anInt9384, local47, local111, local9.anInt9389);
			if (super.anInt10166 != 0) {
				super.aClass28Array3[0].FA(super.anInt10166);
			}
			if (super.anInt10168 != 0) {
				super.aClass28Array3[0].VA(super.anInt10168);
			}
			if (super.anInt10141 != 0) {
				super.aClass28Array3[0].H(0, super.anInt10141, 0);
			}
		}
		if (local100) {
			local149.method6895(super.aByte148, super.aByte145, super.aByte147, super.aByte146 & 0xFF);
		}
		this.method8622(local47, arg0, local9, local58, local5, local111);
		return true;
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(B)I")
	@Override
	public int method8605() {
		return this.aClass5_1 == null ? 0 : this.aClass5_1.anInt58;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
		if (this.aClass5_1 == null || !super.aBoolean750 && !this.method8639(arg0, 0)) {
			return;
		}
		@Pc(24) Class25 local24 = arg0.method8156();
		local24.method4289(super.aClass314_7.method7395());
		local24.method4301(super.anInt10108, super.anInt10114 - 20, super.anInt10109);
		this.method8626(super.aClass28Array3, local24, super.aBoolean750, arg0);
		super.aClass28Array3[0] = super.aClass28Array3[1] = super.aClass28Array3[2] = null;
	}
}
