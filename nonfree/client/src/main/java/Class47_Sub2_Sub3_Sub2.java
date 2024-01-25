import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class47_Sub2_Sub3_Sub2 extends Class47_Sub2_Sub3 {

	@OriginalMember(owner = "client!ks", name = "Nc", descriptor = "Lclient!rs;")
	public Class258 aClass258_1;

	@OriginalMember(owner = "client!ks", name = "Qc", descriptor = "I")
	private int anInt5090;

	@OriginalMember(owner = "client!ks", name = "Yc", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!ks", name = "bd", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!ks", name = "nd", descriptor = "I")
	public int anInt5108;

	@OriginalMember(owner = "client!ks", name = "sd", descriptor = "I")
	public int anInt5113;

	@OriginalMember(owner = "client!ks", name = "Gc", descriptor = "I")
	public int anInt5084 = -1;

	@OriginalMember(owner = "client!ks", name = "Kc", descriptor = "Z")
	public boolean aBoolean346 = false;

	@OriginalMember(owner = "client!ks", name = "Mc", descriptor = "B")
	private byte aByte50 = 0;

	@OriginalMember(owner = "client!ks", name = "Ic", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!ks", name = "gd", descriptor = "I")
	public int anInt5102 = -1;

	@OriginalMember(owner = "client!ks", name = "Oc", descriptor = "I")
	public int anInt5088 = 0;

	@OriginalMember(owner = "client!ks", name = "ld", descriptor = "I")
	public int anInt5106 = -1;

	@OriginalMember(owner = "client!ks", name = "Vc", descriptor = "I")
	public int anInt5094 = 0;

	@OriginalMember(owner = "client!ks", name = "Xc", descriptor = "Z")
	public boolean aBoolean347 = false;

	@OriginalMember(owner = "client!ks", name = "Uc", descriptor = "B")
	private byte aByte51 = 0;

	@OriginalMember(owner = "client!ks", name = "id", descriptor = "B")
	private byte aByte52 = 0;

	@OriginalMember(owner = "client!ks", name = "qd", descriptor = "I")
	public int anInt5111 = -1;

	@OriginalMember(owner = "client!ks", name = "Zc", descriptor = "I")
	public int anInt5096 = 255;

	@OriginalMember(owner = "client!ks", name = "pd", descriptor = "I")
	public int anInt5110 = 0;

	@OriginalMember(owner = "client!ks", name = "ud", descriptor = "I")
	public int anInt5115 = -1;

	@OriginalMember(owner = "client!ks", name = "td", descriptor = "I")
	public int anInt5114 = -1;

	@OriginalMember(owner = "client!ks", name = "yd", descriptor = "I")
	public int anInt5119 = 0;

	@OriginalMember(owner = "client!ks", name = "Ad", descriptor = "I")
	public int anInt5121 = -1;

	@OriginalMember(owner = "client!ks", name = "zd", descriptor = "I")
	public int anInt5120 = 0;

	@OriginalMember(owner = "client!ks", name = "jd", descriptor = "I")
	public int anInt5104 = -1;

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "(I)Z")
	public boolean method4370() {
		return this.aClass258_1 != null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4371() {
		return this.aString36;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I")
	@Override
	public int method4354() {
		return -1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIBB)V")
	public void method4373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5082 < 9) {
			super.anInt5082++;
		}
		for (@Pc(26) int local26 = super.anInt5082; local26 > 0; local26--) {
			super.anIntArray362[local26] = super.anIntArray362[local26 - 1];
			super.anIntArray361[local26] = super.anIntArray361[local26 - 1];
			super.aByteArray68[local26] = super.aByteArray68[local26 - 1];
		}
		super.anIntArray362[0] = arg1;
		super.anIntArray361[0] = arg0;
		super.aByteArray68[0] = arg2;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBLclient!m;IIILclient!qa;Lclient!r;)V")
	private void method4374(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class9 arg5, @OriginalArg(7) Class19 arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg2 * arg2;
		if (local11 < 16384 || arg0 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg2, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class19 local45 = Static272.method4566(local33, super.anInt5077, super.anInt5078, arg4, arg5, super.anInt5040);
		if (local45 != null) {
			arg5.method7589(false);
			local45.method7258(arg1, null, 0);
			arg5.method7589(true);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4375() {
		@Pc(5) String local5 = "";
		if (Static295.aStringArray23 != null) {
			local5 = local5 + Static295.aStringArray23[this.aByte51];
		}
		@Pc(27) int[] local27;
		if (this.aByte50 == 1 && Static332.anIntArray466 != null) {
			local27 = Static332.anIntArray466;
		} else {
			local27 = Static360.anIntArray785;
		}
		if (local27 != null && local27[this.aByte51] != -1) {
			@Pc(46) Class193 local46 = Static459.aClass240_1.method5913(local27[this.aByte51]);
			if (local46.aChar4 == 's') {
				local5 = local5 + local46.method5031(this.aByte52 & 0xFF);
			} else {
				Static41.method1359(new Throwable(), "gdn1");
				local27[this.aByte51] = -1;
			}
		}
		local5 = local5 + this.aString37;
		if (Static408.aStringArray42 != null) {
			local5 = local5 + Static408.aStringArray42[this.aByte51];
		}
		return local5;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!gw;)V")
	public void method4376(@OriginalArg(1) Class1_Sub13 arg0) {
		arg0.anInt3400 = 0;
		@Pc(14) int local14 = arg0.method3043();
		this.aByte50 = (byte) (local14 & 0x1);
		@Pc(31) boolean local31 = (local14 & 0x2) != 0;
		@Pc(39) boolean local39 = (local14 & 0x4) != 0;
		@Pc(43) int local43 = super.method4350();
		this.method4367((local14 >> 3 & 0x7) + 1);
		this.aByte51 = (byte) (local14 >> 6 & 0x3);
		super.anInt8189 += this.method4350() - local43 << 6;
		super.anInt8191 += this.method4350() - local43 << 6;
		this.aByte52 = arg0.method3073();
		this.anInt5114 = arg0.method3073();
		this.anInt5104 = arg0.method3073();
		@Pc(107) int local107 = -1;
		this.anInt5088 = 0;
		@Pc(113) int[] local113 = new int[12];
		@Pc(131) int local131;
		@Pc(137) int local137;
		@Pc(178) int local178;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(120) int local120 = arg0.method3043();
			if (local120 == 0) {
				local113[local115] = 0;
			} else {
				local131 = arg0.method3043();
				local137 = local131 + (local120 << 8);
				if (local115 == 0 && local137 == 65535) {
					local107 = arg0.method3056();
					this.anInt5088 = arg0.method3043();
					break;
				}
				if (local137 >= 32768) {
					local137 = Static487.anIntArray647[local137 - 32768];
					local113[local115] = local137 | 0x40000000;
					local178 = Static454.aClass153_2.method4007(local137).anInt5770;
					if (local178 != 0) {
						this.anInt5088 = local178;
					}
				} else {
					local113[local115] = local137 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(202) int[] local202 = new int[5];
		for (local131 = 0; local131 < 5; local131++) {
			local137 = arg0.method3043();
			if (local137 < 0 || local137 >= Static432.aShortArrayArray12[local131].length) {
				local137 = 0;
			}
			local202[local131] = local137;
		}
		this.anInt5090 = arg0.method3056();
		this.aString37 = arg0.method3034();
		if (local31) {
			this.aString36 = arg0.method3034();
		} else {
			this.aString36 = this.aString37;
		}
		this.anInt5120 = arg0.method3043();
		if (local39) {
			this.anInt5110 = arg0.method3056();
			this.anInt5119 = this.anInt5120;
			this.anInt5102 = -1;
		} else {
			this.anInt5110 = 0;
			this.anInt5119 = arg0.method3043();
			this.anInt5102 = arg0.method3043();
			if (this.anInt5102 == 255) {
				this.anInt5102 = -1;
			}
		}
		local137 = this.anInt5094;
		this.anInt5094 = arg0.method3043();
		@Pc(309) int local309;
		if (this.anInt5094 == 0) {
			Static205.method3773(this);
		} else {
			local178 = this.anInt5106;
			@Pc(306) int local306 = this.anInt5121;
			local309 = this.anInt5115;
			@Pc(312) int local312 = this.anInt5111;
			@Pc(315) int local315 = this.anInt5096;
			this.anInt5106 = arg0.method3056();
			this.anInt5121 = arg0.method3056();
			this.anInt5115 = arg0.method3056();
			this.anInt5111 = arg0.method3056();
			this.anInt5096 = arg0.method3043();
			if (local137 != this.anInt5094 || local178 != this.anInt5106 || local306 != this.anInt5121 || local309 != this.anInt5115 || local312 != this.anInt5111 || this.anInt5096 != local315) {
				Static221.method3922(this);
			}
		}
		if (this.aClass258_1 == null) {
			this.aClass258_1 = new Class258();
		}
		local178 = this.aClass258_1.anInt7362;
		@Pc(399) int[] local399 = this.aClass258_1.anIntArray582;
		this.aClass258_1.method6284(local202, local113, local107, this.aByte50 == 1, this.method4366());
		if (local107 != local178) {
			super.anInt8189 = (super.anIntArray362[0] << 7) + (this.method4350() << 6);
			super.anInt8191 = (super.anIntArray361[0] << 7) + (this.method4350() << 6);
		}
		if (Static150.anInt3353 == super.anInt5045 && local399 != null) {
			for (local309 = 0; local309 < local202.length; local309++) {
				if (local399[local309] != local202[local309]) {
					Static454.aClass153_2.method3999();
					break;
				}
			}
		}
		if (super.aClass2_Sub3_6 != null) {
			super.aClass2_Sub3_6.method2080();
		}
		if (super.anInt5039 == -1 || !super.aBoolean343) {
			return;
		}
		@Pc(499) Class255 local499 = this.method4356();
		if (!local499.method6213(super.anInt5039)) {
			super.aBoolean343 = false;
			super.anInt5039 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIB)V")
	public void method4377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5018 != -1 && Static6.aClass126_1.method3574(super.anInt5018).anInt8112 == 1) {
			super.anInt5018 = -1;
		}
		@Pc(35) Class112 local35;
		if (super.anInt5052 != -1) {
			local35 = Static529.aClass90_2.method2963(super.anInt5052);
			if (local35.aBoolean233 && local35.anInt3703 != -1 && Static6.aClass126_1.method3574(local35.anInt3703).anInt8112 == 1) {
				super.anInt5052 = -1;
			}
		}
		if (super.anInt5070 != -1) {
			local35 = Static529.aClass90_2.method2963(super.anInt5070);
			if (local35.aBoolean233 && local35.anInt3703 != -1 && Static6.aClass126_1.method3574(local35.anInt3703).anInt8112 == 1) {
				super.anInt5070 = -1;
			}
		}
		this.anInt5084 = -1;
		if (arg1 < 0 || Static542.anInt9387 <= arg1 || arg0 < 0 || arg0 >= Static36.anInt1324) {
			this.method4378(arg0, arg1);
		} else if (super.anIntArray362[0] >= 0 && Static542.anInt9387 > super.anIntArray362[0] && super.anIntArray361[0] >= 0 && super.anIntArray361[0] < Static36.anInt1324) {
			if (arg2 == 2) {
				Static397.method5988(arg1, arg0, this);
			}
			this.method4373(arg0, arg1, arg2);
		} else {
			this.method4378(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)I")
	@Override
	public int method4350() {
		return this.aClass258_1 == null || this.aClass258_1.anInt7362 == -1 ? super.method4350() : Static345.aClass222_1.method5587(this.aClass258_1.anInt7362).anInt6754;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass258_1 == null || !this.method4379(131072, arg1)) {
			return false;
		}
		@Pc(24) Class22 local24 = arg1.method7642();
		@Pc(29) int local29 = super.aClass146_7.method3943();
		local24.ma(local29);
		local24.TA(super.anInt8189, super.anInt8192, super.anInt8191);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass19Array3.length > local44; local44++) {
			if (super.aClass19Array3[local44] != null && super.aClass19Array3[local44].method7257(arg2, arg0, local24, true)) {
				local42 = true;
				break;
			}
		}
		super.aClass19Array3[0] = super.aClass19Array3[1] = super.aClass19Array3[2] = super.aClass19Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIB)V")
	public void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt5082 = 0;
		super.anInt5081 = 0;
		super.anIntArray362[0] = arg1;
		super.anInt5080 = 0;
		super.anIntArray361[0] = arg0;
		@Pc(33) int local33 = this.method4350();
		super.anInt8191 = super.anIntArray361[0] * 128 + local33 * 64;
		super.anInt8189 = super.anIntArray362[0] * 128 + local33 * 64;
		if (Static16.aClass47_Sub2_Sub3_Sub2_1 == this) {
			Static157.method3127();
		}
		if (super.aClass2_Sub3_6 != null) {
			super.aClass2_Sub3_6.method2080();
		}
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(B)I")
	@Override
	public int method6953() {
		return super.anInt5024;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!qa;Z)Z")
	private boolean method4379(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(13) Class255 local13 = this.method4356();
		@Pc(28) Class280 local28 = super.anInt5018 != -1 && super.anInt5026 == 0 ? Static6.aClass126_1.method3574(super.anInt5018) : null;
		@Pc(48) Class280 local48 = super.anInt5039 == -1 || this.aBoolean347 || super.aBoolean343 && local28 != null ? null : Static6.aClass126_1.method3574(super.anInt5039);
		@Pc(51) int local51 = local13.anInt7295;
		@Pc(54) int local54 = local13.anInt7266;
		if (local51 != 0 || local54 != 0 || local13.anInt7292 != 0 || local13.anInt7294 != 0) {
			arg0 |= 0x7;
		}
		@Pc(93) boolean local93 = super.aByte46 != 0 && Static416.anInt7252 >= super.anInt5079 && super.anInt5034 > Static416.anInt7252;
		if (local93) {
			arg0 |= 0x80000;
		}
		@Pc(134) Class19 local134 = super.aClass19Array3[0] = this.aClass258_1.method6282(Static345.aClass222_1, Static343.aClass286_1, local28, super.anInt5007, super.aClass8Array3, super.anInt5041, super.anInt5054, super.anInt5021, arg0, super.anInt5063, arg1, local48, Static109.aClass18_1, Static454.aClass153_2, Static489.aClass34_2, Static6.aClass126_1, super.anInt5074);
		@Pc(137) int local137 = Static376.method5717();
		if (Static318.anInt6040 < 96 && local137 > 50) {
			Static13.method709();
		}
		@Pc(157) int local157;
		if (Static363.aClass199_14 != Static359.aClass199_13 && local137 < 50) {
			local157 = 50 - local137;
			while (Static3.anInt56 < local157) {
				Static241.aByteArrayArray11[Static3.anInt56] = new byte[102400];
				Static3.anInt56++;
			}
			while (Static3.anInt56 > local157) {
				Static3.anInt56--;
				Static241.aByteArrayArray11[Static3.anInt56] = null;
			}
		} else if (Static359.aClass199_13 != Static363.aClass199_14) {
			Static241.aByteArrayArray11 = new byte[50][];
			Static3.anInt56 = 0;
		}
		if (local134 == null) {
			return false;
		}
		super.anInt5024 = local134.TA();
		this.method4360(local134);
		local157 = super.aClass146_7.method3943();
		if (local51 == 0 && local54 == 0) {
			this.method4353(0, local157, this.method4350() << 7, 0, this.method4350() << 7);
		} else {
			this.method4353(local13.anInt7271, local157, local51, local13.anInt7275, local54);
			if (super.anInt5040 != 0) {
				local134.D(super.anInt5040);
			}
			if (super.anInt5077 != 0) {
				local134.b(super.anInt5077);
			}
			if (super.anInt5078 != 0) {
				local134.ca(0, super.anInt5078, 0);
			}
		}
		if (local93) {
			local134.method7252(super.aByte49, super.aByte48, super.aByte47, super.aByte46 & 0xFF);
		}
		@Pc(303) Class112 local303;
		@Pc(318) boolean local318;
		@Pc(320) int local320;
		@Pc(362) Class19 local362;
		if (this.aBoolean347 || super.anInt5052 == -1 || super.anInt5012 == -1) {
			super.aClass19Array3[1] = null;
		} else {
			local303 = Static529.aClass90_2.method2963(super.anInt5052);
			local318 = local303.aByte29 == 3 && (local51 != 0 || local54 != 0);
			local320 = local5;
			if (local318) {
				local320 = local5 | 0x7;
			} else {
				if (super.anInt5028 != 0) {
					local320 = local5 | 0x5;
				}
				if (super.anInt5076 != 0) {
					local320 |= 0x2;
				}
			}
			local362 = super.aClass19Array3[1] = local303.method3309(super.anInt5010, Static6.aClass126_1, super.anInt5012, super.anInt5004, local320, arg1);
			if (local362 != null) {
				if (super.anInt5076 != 0) {
					local362.ca(0, -super.anInt5076 << 0, 0);
				}
				if (super.anInt5028 != 0) {
					local362.OA(super.anInt5028 * 2048);
				}
				if (local318) {
					if (super.anInt5040 != 0) {
						local362.D(super.anInt5040);
					}
					if (super.anInt5077 != 0) {
						local362.b(super.anInt5077);
					}
					if (super.anInt5078 != 0) {
						local362.ca(0, super.anInt5078, 0);
					}
				}
			}
		}
		if (this.aBoolean347 || super.anInt5070 == -1 || super.anInt5022 == -1) {
			super.aClass19Array3[3] = null;
		} else {
			local303 = Static529.aClass90_2.method2963(super.anInt5070);
			local318 = local303.aByte29 == 3 && (local51 != 0 || local54 != 0);
			local320 = local5;
			if (local318) {
				local320 = local5 | 0x7;
			} else {
				if (super.anInt5071 != 0) {
					local320 = local5 | 0x5;
				}
				if (super.anInt5019 != 0) {
					local320 |= 0x2;
				}
			}
			local362 = super.aClass19Array3[3] = local303.method3314(Static6.aClass126_1, arg1, super.anInt5022, super.anInt5044, super.anInt5009, local320);
			if (local362 != null) {
				if (super.anInt5019 != 0) {
					local362.ca(0, -super.anInt5019 << 0, 0);
				}
				if (super.anInt5071 != 0) {
					local362.OA(super.anInt5071 * 2048);
				}
				if (local318) {
					if (super.anInt5040 != 0) {
						local362.D(super.anInt5040);
					}
					if (super.anInt5077 != 0) {
						local362.b(super.anInt5077);
					}
					if (super.anInt5078 != 0) {
						local362.ca(0, super.anInt5078, 0);
					}
				}
			}
		}
		super.aClass19Array3[2] = null;
		if (!this.aBoolean347 && super.aClass1_Sub47_3 != null) {
			if (Static416.anInt7252 >= super.aClass1_Sub47_3.anInt8051) {
				super.aClass1_Sub47_3 = null;
			} else if (Static416.anInt7252 >= super.aClass1_Sub47_3.anInt8052) {
				@Pc(603) Class19 local603 = super.aClass1_Sub47_3.method6836(arg1, local5 | 0x7);
				if (local603 != null) {
					local603.ca(-super.anInt8189 + super.aClass1_Sub47_3.anInt8046, -super.anInt8192 + super.aClass1_Sub47_3.anInt8048, -super.anInt8191 + super.aClass1_Sub47_3.anInt8042);
					if (local157 != 0) {
						local603.OA(-local157 & 0x3FFF);
					}
					super.aClass19Array3[2] = local603;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		if (this.aClass258_1 == null || !this.method4379(2048, arg0)) {
			return null;
		}
		@Pc(17) Class22 local17 = arg0.method7642();
		@Pc(22) int local22 = super.aClass146_7.method3943();
		local17.ma(local22);
		local17.TA(super.anInt8189, super.anInt8192, super.anInt8191);
		@Pc(36) float local36 = arg0.P();
		@Pc(39) float local39 = arg0.ra();
		@Pc(102) int local102;
		if (Static89.aClass1_Sub28_Sub1_1.aBoolean331) {
			@Pc(46) Class255 local46 = this.method4356();
			if (local46.aBoolean480 && (this.aClass258_1.anInt7362 == -1 || Static345.aClass222_1.method5587(this.aClass258_1.anInt7362).aBoolean449)) {
				@Pc(80) Class280 local80 = super.anInt5018 != -1 && super.anInt5026 == 0 ? Static6.aClass126_1.method3574(super.anInt5018) : null;
				@Pc(100) Class280 local100 = super.anInt5039 == -1 || this.aBoolean347 || super.aBoolean343 && local80 != null ? null : Static6.aClass126_1.method3574(super.anInt5039);
				local102 = 0;
				if (super.anInt5005 != 0) {
					local102 = this.method4355();
				}
				@Pc(142) Class19 local142 = Static398.method5998(local100 == null ? super.anInt5007 : super.anInt5021, super.aClass19Array3[0], local102, local100 == null ? local80 : local100, 240, 160, super.anInt5077, local22, 0, super.anInt5078, 1, arg0, 0, super.anInt5040);
				if (local142 != null) {
					arg0.la(local36, local39 - 128.0F);
					arg0.method7589(false);
					local142.method7258(local17, null, 0);
					arg0.method7589(true);
				}
			}
		}
		if (Static16.aClass47_Sub2_Sub3_Sub2_1 == this) {
			arg0.la(local36, local39 - 144.0F);
			local17.oa(super.anInt8189, super.anInt8192, super.anInt8191);
			for (@Pc(183) int local183 = Static484.aClass28Array1.length - 1; local183 >= 0; local183--) {
				@Pc(188) Class28 local188 = Static484.aClass28Array1[local183];
				if (local188 != null && local188.anInt1266 != -1) {
					@Pc(220) int local220;
					if (local188.anInt1262 == 1) {
						@Pc(208) Class1_Sub10 local208 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local188.anInt1265);
						if (local208 != null) {
							@Pc(213) Class47_Sub2_Sub3_Sub1 local213 = local208.aClass47_Sub2_Sub3_Sub1_2;
							local220 = local213.anInt8189 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189;
							@Pc(227) int local227 = local213.anInt8191 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191;
							this.method4374(5760000, local17, local220, local227, local188.anInt1266, arg0, super.aClass19Array3[0]);
						}
					}
					if (local188.anInt1262 == 2) {
						@Pc(254) int local254 = local188.anInt1260 + 64 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189;
						local102 = local188.anInt1263 + 64 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191;
						local220 = local188.anInt1259 << 7;
						local220 *= local220;
						this.method4374(local220, local17, local254, local102, local188.anInt1266, arg0, super.aClass19Array3[0]);
					}
					if (local188.anInt1262 == 10 && local188.anInt1265 >= 0 && Static473.aClass47_Sub2_Sub3_Sub2Array1.length > local188.anInt1265) {
						@Pc(309) Class47_Sub2_Sub3_Sub2 local309 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local188.anInt1265];
						if (local309 != null) {
							local102 = local309.anInt8189 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189;
							local220 = local309.anInt8191 - Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191;
							this.method4374(5760000, local17, local102, local220, local188.anInt1266, arg0, super.aClass19Array3[0]);
						}
					}
				}
			}
			local17.ma(local22);
			local17.TA(super.anInt8189, super.anInt8192, super.anInt8191);
		}
		arg0.la(local36, local39);
		@Pc(370) Class2_Sub6 local370 = Static275.method4678(super.aClass19Array3.length);
		if (super.aClass2_Sub3_6 == null) {
			arg0.method7578(super.aClass19Array3, local17, local370.aClass2_Sub7Array1, Static16.aClass47_Sub2_Sub3_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(377) Class249 local377 = super.aClass2_Sub3_6.method2067();
			arg0.method7593(super.aClass19Array3, local377, local17, local370.aClass2_Sub7Array1, Static16.aClass47_Sub2_Sub3_Sub2_1 == this ? 1 : 0);
		}
		this.method4368(false, super.aClass19Array3, arg0);
		super.aClass19Array3[0] = super.aClass19Array3[1] = super.aClass19Array3[2] = super.aClass19Array3[3] = null;
		super.anInt5011 = Static15.anInt833;
		return local370;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		if (this.aClass258_1 != null && (super.aBoolean344 || this.method4379(0, arg0))) {
			this.method4368(super.aBoolean344, super.aClass19Array3, arg0);
			super.aClass19Array3[0] = super.aClass19Array3[1] = super.aClass19Array3[2] = super.aClass19Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "(I)I")
	@Override
	protected int method4366() {
		return this.anInt5090;
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		throw new IllegalStateException();
	}
}
