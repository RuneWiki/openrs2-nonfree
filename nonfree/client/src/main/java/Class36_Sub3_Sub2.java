import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class36_Sub3_Sub2 extends Class36_Sub3 {

	@OriginalMember(owner = "client!th", name = "Dc", descriptor = "Lclient!og;")
	public Class126 aClass126_2;

	@OriginalMember(owner = "client!th", name = "Wc", descriptor = "Ljava/lang/String;")
	public String aString249;

	@OriginalMember(owner = "client!th", name = "uc", descriptor = "I")
	public int anInt5149 = 0;

	@OriginalMember(owner = "client!th", name = "vc", descriptor = "I")
	public int anInt5150 = -1;

	@OriginalMember(owner = "client!th", name = "Cc", descriptor = "I")
	public int anInt5156 = -1;

	@OriginalMember(owner = "client!th", name = "Ec", descriptor = "B")
	private byte aByte23 = 0;

	@OriginalMember(owner = "client!th", name = "Ic", descriptor = "I")
	public int anInt5160 = 0;

	@OriginalMember(owner = "client!th", name = "Tc", descriptor = "I")
	public int anInt5170 = -1;

	@OriginalMember(owner = "client!th", name = "Rc", descriptor = "I")
	public int anInt5168 = -1;

	@OriginalMember(owner = "client!th", name = "Oc", descriptor = "I")
	public int anInt5165 = -1;

	@OriginalMember(owner = "client!th", name = "Fc", descriptor = "I")
	public int anInt5157 = -1;

	@OriginalMember(owner = "client!th", name = "xc", descriptor = "I")
	public int anInt5152 = 0;

	@OriginalMember(owner = "client!th", name = "Zc", descriptor = "I")
	public int anInt5174 = 0;

	@OriginalMember(owner = "client!th", name = "Hc", descriptor = "I")
	public int anInt5159 = 0;

	@OriginalMember(owner = "client!th", name = "ad", descriptor = "I")
	public int anInt5175 = -1;

	@OriginalMember(owner = "client!th", name = "Bc", descriptor = "Z")
	public boolean aBoolean427 = false;

	@OriginalMember(owner = "client!th", name = "dd", descriptor = "I")
	public int anInt5178 = 255;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class119_Sub1 arg10) {
		if (this.aClass126_2 == null) {
			return;
		}
		@Pc(27) Class15 local27 = this.anInt5087 != -1 && this.anInt5070 == 0 ? Static35.method706(this.anInt5087) : null;
		@Pc(56) Class15 local56 = this.anInt5138 == -1 || this.aBoolean427 || this.anInt5138 == this.method4104().anInt2124 && local27 != null ? null : Static35.method706(this.anInt5138);
		@Pc(78) Class36_Sub2 local78 = this.aClass126_2.method3189(this.anInt5078, local27, local56, this.anInt5106, this.aClass86Array3, this.anInt5082, this.anInt5081, this.anInt5119, this.anInt5071);
		@Pc(81) int local81 = Static190.method3491();
		if (Static60.aBoolean106 && Static171.anInt3655 < 96 && local81 > 50) {
			Static67.method4888();
		}
		@Pc(107) int local107;
		if (Static113.anInt2429 != 0 && local81 < 50) {
			local107 = 50 - local81;
			while (local107 > Static36.anInt876) {
				Static91.aByteArrayArray46[Static36.anInt876] = new byte[102400];
				Static36.anInt876++;
			}
			while (Static36.anInt876 > local107) {
				Static36.anInt876--;
				Static91.aByteArrayArray46[Static36.anInt876] = null;
			}
		}
		if (local78 == null) {
			return;
		}
		this.anInt5102 = local78.method4881();
		@Pc(193) Class36_Sub2 local193;
		if (Static284.aBoolean475 && (this.aClass126_2.anInt3962 == -1 || Static112.method2081(this.aClass126_2.anInt3962).aBoolean62)) {
			local193 = Static209.method1568(0, this.anInt5109, 240, local78, local56 == null ? local27 : local56, local56 == null ? this.anInt5106 : this.anInt5119, this.anInt5093, this.aBoolean421, 0, 1, arg0, this.anInt5110, 160);
			if (Static60.aBoolean106) {
				@Pc(212) float local212 = Static60.method1149();
				@Pc(214) float local214 = Static60.method1135();
				Static60.method1158();
				Static60.method1144(local212, local214 - 150.0F);
				local193.method4878(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static60.method1145();
				Static60.method1144(local212, local214);
			} else {
				local193.method4878(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static111.aClass36_Sub3_Sub2_1 == this) {
			for (local107 = Static289.aClass180Array1.length - 1; local107 >= 0; local107--) {
				@Pc(252) Class180 local252 = Static289.aClass180Array1[local107];
				if (local252 != null && local252.anInt5901 != -1) {
					@Pc(294) int local294;
					@Pc(305) int local305;
					if (local252.anInt5905 == 1 && local252.anInt5897 >= 0 && local252.anInt5897 < Static201.aClass36_Sub3_Sub1Array1.length) {
						@Pc(280) Class36_Sub3_Sub1 local280 = Static201.aClass36_Sub3_Sub1Array1[local252.anInt5897];
						if (local280 != null) {
							local294 = local280.anInt5093 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
							local305 = local280.anInt5109 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
							this.method4110(360000, local252.anInt5901, arg0, local294, arg5, null, arg9, arg3, arg4, local305, arg6, arg1, arg7, arg2, local78);
						}
					}
					if (local252.anInt5905 == 2) {
						@Pc(346) int local346 = (local252.anInt5899 - Static125.anInt5772) * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
						local294 = (local252.anInt5902 - Static203.anInt4236) * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
						local305 = local252.anInt5903 * 4;
						local305 *= local305;
						this.method4110(local305, local252.anInt5901, arg0, local346, arg5, null, arg9, arg3, arg4, local294, arg6, arg1, arg7, arg2, local78);
					}
					if (local252.anInt5905 == 10 && local252.anInt5897 >= 0 && local252.anInt5897 < Static212.aClass36_Sub3_Sub2Array1.length) {
						@Pc(412) Class36_Sub3_Sub2 local412 = Static212.aClass36_Sub3_Sub2Array1[local252.anInt5897];
						if (local412 != null) {
							local294 = local412.anInt5093 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
							local305 = local412.anInt5109 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
							this.method4110(360000, local252.anInt5901, arg0, local294, arg5, null, arg9, arg3, arg4, local305, arg6, arg1, arg7, arg2, local78);
						}
					}
				}
			}
		}
		this.method4093(local78);
		this.method4105(local78, arg0);
		local193 = null;
		if (!this.aBoolean427 && this.anInt5125 != -1 && this.anInt5129 != -1) {
			@Pc(488) Class167 local488 = Static208.method3532(this.anInt5125);
			local193 = local488.method4337(this.anInt5076, this.anInt5142, this.anInt5129);
			if (local193 != null) {
				local193.method3834(0, -this.anInt5133, 0);
				if (local488.aBoolean434) {
					if (Static197.anInt4131 != 0) {
						local193.method3827(Static197.anInt4131);
					}
					if (Static164.anInt3456 != 0) {
						local193.method3843(Static164.anInt3456);
					}
					if (Static141.anInt3028 != 0) {
						local193.method3834(0, Static141.anInt3028, 0);
					}
				}
			}
		}
		@Pc(536) Class36_Sub2 local536 = null;
		if (!this.aBoolean427 && this.anObject6 != null) {
			if (Static148.anInt3168 >= this.anInt5074) {
				this.anObject6 = null;
			}
			if (this.anInt5072 <= Static148.anInt3168 && Static148.anInt3168 < this.anInt5074) {
				if (this.anObject6 instanceof Class36_Sub4) {
					local536 = (Class36_Sub2) ((Class36_Sub4) this.anObject6).method3401();
				} else {
					local536 = (Class36_Sub2) this.anObject6;
				}
				local536.method3834(this.anInt5068 - this.anInt5093, -this.anInt5110 + this.anInt5108, this.anInt5099 - this.anInt5109);
				if (this.anInt5063 == 512) {
					local536.method3837();
				} else if (this.anInt5063 == 1024) {
					local536.method3839();
				} else if (this.anInt5063 == 1536) {
					local536.method3840();
				}
			}
		}
		if (Static60.aBoolean106) {
			local78.aBoolean399 = true;
			local78.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_6);
			if (local193 != null) {
				local193.aBoolean399 = true;
				local193.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_6);
			}
		} else {
			if (local193 != null) {
				local78 = ((Class36_Sub2_Sub2) local78).method3869(local193);
			}
			if (local536 != null) {
				local78 = ((Class36_Sub2_Sub2) local78).method3869(local536);
			}
			local78.aBoolean399 = true;
			local78.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_6);
		}
		if (local536 == null) {
			return;
		}
		if (this.anInt5063 == 512) {
			local536.method3840();
		} else if (this.anInt5063 == 1024) {
			local536.method3839();
		} else if (this.anInt5063 == 1536) {
			local536.method3837();
		}
		local536.method3834(this.anInt5093 - this.anInt5068, this.anInt5110 + -this.anInt5108, this.anInt5109 - this.anInt5099);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!wm;)V")
	public void method4109(@OriginalArg(1) Class2_Sub26 arg0) {
		arg0.anInt5328 = 0;
		@Pc(12) int local12 = arg0.method4261();
		@Pc(16) int local16 = super.method4097();
		this.method4098((local12 >> 3 & 0x7) + 1);
		this.aByte23 = (byte) (local12 >> 6 & 0x3);
		@Pc(45) boolean local45 = (local12 & 0x4) != 0;
		this.anInt5093 += (this.method4097() - local16) * 64;
		@Pc(62) int local62 = local12 & 0x1;
		this.anInt5109 += (this.method4097() - local16) * 64;
		this.anInt5175 = arg0.method4220();
		@Pc(82) int local82 = -1;
		this.anInt5150 = arg0.method4220();
		this.anInt5152 = 0;
		@Pc(93) int[] local93 = new int[12];
		@Pc(108) int local108;
		@Pc(121) int local121;
		@Pc(127) int local127;
		@Pc(171) int local171;
		for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
			local108 = arg0.method4261();
			if (local108 == 0) {
				local93[local99] = 0;
			} else {
				local121 = arg0.method4261();
				local127 = (local108 << 8) + local121;
				if (local99 == 0 && local127 == 65535) {
					local82 = arg0.method4242();
					this.anInt5152 = arg0.method4261();
					break;
				}
				if (local127 < 32768) {
					local93[local99] = local127 - 256 | Integer.MIN_VALUE;
				} else {
					local127 = Static67.anIntArray523[local127 - 32768];
					local93[local99] = local127 | 0x40000000;
					local171 = Static152.method2616(local127).anInt4861;
					if (local171 != 0) {
						this.anInt5152 = local171;
					}
				}
			}
		}
		@Pc(193) int[] local193 = new int[5];
		for (local108 = 0; local108 < 5; local108++) {
			local121 = arg0.method4261();
			if (local121 < 0 || local121 >= Static233.aShortArrayArray5[local108].length) {
				local121 = 0;
			}
			local193[local108] = local121;
		}
		this.anInt5140 = arg0.method4242();
		@Pc(230) long local230 = arg0.method4264();
		this.aString249 = Static77.method1383(local230);
		this.anInt5159 = arg0.method4261();
		if (local45) {
			this.anInt5174 = arg0.method4242();
			this.anInt5156 = -1;
			this.anInt5160 = this.anInt5159;
		} else {
			this.anInt5174 = 0;
			this.anInt5160 = arg0.method4261();
			this.anInt5156 = arg0.method4261();
			if (this.anInt5156 == 255) {
				this.anInt5156 = -1;
			}
		}
		local127 = this.anInt5149;
		this.anInt5149 = arg0.method4261();
		if (this.anInt5149 == 0) {
			Static88.method3790(this);
		} else {
			@Pc(292) int local292 = this.anInt5170;
			@Pc(295) int local295 = this.anInt5168;
			local171 = this.anInt5165;
			@Pc(301) int local301 = this.anInt5157;
			@Pc(304) int local304 = this.anInt5178;
			this.anInt5165 = arg0.method4242();
			this.anInt5157 = arg0.method4242();
			this.anInt5170 = arg0.method4242();
			this.anInt5168 = arg0.method4242();
			this.anInt5178 = arg0.method4261();
			if (local127 != this.anInt5149 || this.anInt5165 != local171 || this.anInt5157 != local301 || this.anInt5170 != local292 || this.anInt5168 != local295 || this.anInt5178 != local304) {
				Static53.method1046(this);
			}
		}
		if (this.aClass126_2 == null) {
			this.aClass126_2 = new Class126();
		}
		local171 = this.aClass126_2.anInt3962;
		this.aClass126_2.method3188(local93, local62 == 1, local82, local193, this.anInt5140);
		if (local171 != local82) {
			this.anInt5093 = this.anIntArray465[0] * 128 + this.method4097() * 64;
			this.anInt5109 = this.anIntArray468[0] * 128 + this.method4097() * 64;
		}
		if (this.aClass119_Sub1_6 != null) {
			this.aClass119_Sub1_6.method3102();
		}
	}

	@OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
	@Override
	public int method4881() {
		return this.anInt5102;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIILclient!nl;IIIBIIIIILclient!r;)V")
	private void method4110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class119_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class36_Sub2 arg14) {
		@Pc(11) int local11 = arg9 * arg9 + arg3 * arg3;
		if (local11 < 16 || arg0 < local11) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg3, (double) arg9) * 325.949D) & 0x7FF;
		@Pc(50) Class36_Sub2 local50 = Static91.method1713(arg1, this.anInt5109, local38, this.anInt5093, this.anInt5110, arg14);
		if (local50 == null) {
			return;
		}
		if (!Static60.aBoolean106) {
			local50.method4878(0, arg11, arg13, arg7, arg8, arg4, arg10, arg12, -1L, arg6, arg5);
			return;
		}
		@Pc(72) float local72 = Static60.method1149();
		@Pc(74) float local74 = Static60.method1135();
		Static60.method1158();
		Static60.method1144(local72, local74 - 150.0F);
		local50.method4878(0, arg11, arg13, arg7, arg8, arg4, arg10, arg12, -1L, arg6, arg5);
		Static60.method1145();
		Static60.method1144(local72, local74);
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(B)I")
	@Override
	protected int method4089() {
		return this.anInt5140;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIBI)V")
	public void method4112(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.method4092(arg2, this.method4097(), arg0, arg1);
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method4114() {
		@Pc(6) String local6 = this.aString249;
		if (Static291.aStringArray36 != null) {
			local6 = Static291.aStringArray36[this.aByte23] + local6;
		}
		if (Static110.aStringArray9 != null) {
			local6 = local6 + Static110.aStringArray9[this.aByte23];
		}
		return local6;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
	@Override
	public int method4097() {
		return this.aClass126_2 == null || this.aClass126_2.anInt3962 == -1 ? super.method4097() : Static112.method2081(this.aClass126_2.anInt3962).anInt888;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4099() {
		return this.aClass126_2 != null;
	}
}
