import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!cj", name = "Cc", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!cj", name = "Ec", descriptor = "Lclient!nd;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!cj", name = "Lc", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!cj", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!cj", name = "Sc", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!cj", name = "id", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!cj", name = "uc", descriptor = "I")
	public int anInt945 = -1;

	@OriginalMember(owner = "client!cj", name = "tc", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!cj", name = "Hc", descriptor = "I")
	public int anInt955 = 255;

	@OriginalMember(owner = "client!cj", name = "Pc", descriptor = "I")
	public int anInt961 = 0;

	@OriginalMember(owner = "client!cj", name = "Oc", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!cj", name = "Ic", descriptor = "I")
	public int anInt956 = 0;

	@OriginalMember(owner = "client!cj", name = "Vc", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!cj", name = "Zc", descriptor = "I")
	public int anInt969 = 0;

	@OriginalMember(owner = "client!cj", name = "ad", descriptor = "I")
	public int anInt970 = 0;

	@OriginalMember(owner = "client!cj", name = "dd", descriptor = "I")
	public int anInt972 = -1;

	@OriginalMember(owner = "client!cj", name = "hd", descriptor = "I")
	public int anInt975 = -1;

	@OriginalMember(owner = "client!cj", name = "Wc", descriptor = "I")
	public int anInt966 = -1;

	@OriginalMember(owner = "client!cj", name = "wc", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!cj", name = "Tc", descriptor = "I")
	public int anInt964 = 0;

	@OriginalMember(owner = "client!cj", name = "kd", descriptor = "I")
	public int anInt977 = -1;

	@OriginalMember(owner = "client!cj", name = "ld", descriptor = "I")
	public int anInt978 = -1;

	@OriginalMember(owner = "client!cj", name = "nd", descriptor = "I")
	public int anInt980 = -1;

	@OriginalMember(owner = "client!cj", name = "fd", descriptor = "I")
	public int anInt974 = -1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIB)V")
	public void method698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt5366 != -1 && Static333.aClass50_2.method1175(super.anInt5366).anInt2988 == 1) {
			super.anInt5366 = -1;
		}
		if (super.anInt5396 != -1) {
			@Pc(32) Class182 local32 = Static153.aClass116_1.method2791(super.anInt5396);
			if (local32.aBoolean374 && local32.anInt5101 != -1 && Static333.aClass50_2.method1175(local32.anInt5101).anInt2988 == 1) {
				super.anInt5396 = -1;
			}
		}
		this.anInt972 = -1;
		if (arg0 < 0 || arg0 >= Static89.anInt1891 || arg1 < 0 || arg1 >= Static85.anInt1839) {
			this.method703(arg1, arg0);
		} else if (super.anIntArray466[0] >= 0 && super.anIntArray466[0] < Static89.anInt1891 && super.anIntArray465[0] >= 0 && super.anIntArray465[0] < Static85.anInt1839) {
			if (arg2 == 2) {
				Static343.method5494(arg1, arg0, this);
			}
			this.method704(arg2, arg0, arg1);
		} else {
			this.method703(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(Z)I")
	@Override
	public int method4792() {
		return this.aClass158_1 == null || this.aClass158_1.anInt4462 == -1 ? super.method4792() : Static207.aClass32_1.method579(this.aClass158_1.anInt4462).anInt5486;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!vt;Z)V")
	public void method699(@OriginalArg(0) Class2_Sub24 arg0) {
		arg0.anInt6669 = 0;
		@Pc(12) int local12 = arg0.method5732();
		this.aByte20 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method4792();
		this.method4801((local12 >> 3 & 0x7) + 1);
		this.aByte18 = (byte) (local12 >> 6 & 0x3);
		super.anInt6800 += (this.method4792() - local44) * 64;
		super.anInt6798 += (this.method4792() - local44) * 64;
		this.aByte19 = arg0.method5759();
		this.anInt978 = arg0.method5759();
		this.anInt945 = arg0.method5759();
		@Pc(109) int local109 = -1;
		this.anInt970 = 0;
		@Pc(115) int[] local115 = new int[12];
		@Pc(138) int local138;
		@Pc(144) int local144;
		@Pc(183) int local183;
		for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
			@Pc(123) int local123 = arg0.method5732();
			if (local123 == 0) {
				local115[local117] = 0;
			} else {
				local138 = arg0.method5732();
				local144 = local138 + (local123 << 8);
				if (local117 == 0 && local144 == 65535) {
					local109 = arg0.method5753();
					this.anInt970 = arg0.method5732();
					break;
				}
				if (local144 >= 32768) {
					local144 = Static343.anIntArray540[local144 - 32768];
					local115[local117] = local144 | 0x40000000;
					local183 = Static57.aClass196_1.method4827(local144).anInt4312;
					if (local183 != 0) {
						this.anInt970 = local183;
					}
				} else {
					local115[local117] = local144 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(210) int[] local210 = new int[5];
		for (local138 = 0; local138 < 5; local138++) {
			local144 = arg0.method5732();
			if (local144 < 0 || local144 >= Static64.aShortArrayArray8[local138].length) {
				local144 = 0;
			}
			local210[local138] = local144;
		}
		this.anInt976 = arg0.method5753();
		this.aString11 = arg0.method5744();
		if (local29) {
			this.aString12 = arg0.method5744();
		} else {
			this.aString12 = this.aString11;
		}
		this.anInt956 = arg0.method5732();
		if (local40) {
			this.anInt969 = arg0.method5753();
			this.anInt961 = this.anInt956;
			this.anInt974 = -1;
		} else {
			this.anInt969 = 0;
			this.anInt961 = arg0.method5732();
			this.anInt974 = arg0.method5732();
			if (this.anInt974 == 255) {
				this.anInt974 = -1;
			}
		}
		local144 = this.anInt964;
		this.anInt964 = arg0.method5732();
		@Pc(329) int local329;
		if (this.anInt964 == 0) {
			Static67.method1230(this);
		} else {
			local183 = this.anInt975;
			@Pc(326) int local326 = this.anInt977;
			local329 = this.anInt980;
			@Pc(332) int local332 = this.anInt966;
			@Pc(335) int local335 = this.anInt955;
			this.anInt975 = arg0.method5753();
			this.anInt977 = arg0.method5753();
			this.anInt980 = arg0.method5753();
			this.anInt966 = arg0.method5753();
			this.anInt955 = arg0.method5732();
			if (local144 != this.anInt964 || local183 != this.anInt975 || local326 != this.anInt977 || this.anInt980 != local329 || local332 != this.anInt966 || this.anInt955 != local335) {
				Static189.method510(this);
			}
		}
		if (this.aClass158_1 == null) {
			this.aClass158_1 = new Class158();
		}
		local183 = this.aClass158_1.anInt4462;
		@Pc(403) int[] local403 = this.aClass158_1.anIntArray331;
		this.aClass158_1.method3945(local210, local109, local115, this.aByte20 == 1, this.method4786());
		if (local109 != local183) {
			super.anInt6800 = super.anIntArray466[0] * 128 + this.method4792() * 64;
			super.anInt6798 = super.anIntArray465[0] * 128 + this.method4792() * 64;
		}
		if (super.anInt5374 == Static93.anInt1976 && local403 != null) {
			for (local329 = 0; local329 < local210.length; local329++) {
				if (local210[local329] != local403[local329]) {
					Static57.aClass196_1.method4823();
					break;
				}
			}
		}
		if (super.aClass7_Sub3_4 != null) {
			super.aClass7_Sub3_4.method523();
		}
		if (super.anInt5421 == -1 || !super.aBoolean394) {
			return;
		}
		@Pc(504) Class227 local504 = this.method4799();
		if (!local504.method5584(super.anInt5421)) {
			super.aBoolean394 = false;
			super.anInt5421 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)Z")
	public boolean method700() {
		return this.aClass158_1 != null;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
		if (this.aClass158_1 != null && (super.aBoolean398 || this.method701(0, arg0))) {
			this.method4787(super.aBoolean398, arg0, super.aClass159Array3);
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)I")
	@Override
	public int method4789() {
		return -1;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		if (this.aClass158_1 == null || !this.method701(1024, arg0)) {
			return null;
		}
		@Pc(19) Class21 local19 = arg0.method2445();
		@Pc(24) int local24 = super.aClass217_7.method5455();
		local19.method3708(local24);
		local19.method3701(super.anInt6800, super.anInt6797, super.anInt6798);
		@Pc(38) float local38 = arg0.method2462();
		@Pc(41) float local41 = arg0.method2517();
		if (Static183.aBoolean279) {
			@Pc(47) Class227 local47 = this.method4799();
			if (local47.aBoolean464 && (this.aClass158_1.anInt4462 == -1 || Static207.aClass32_1.method579(this.aClass158_1.anInt4462).aBoolean408)) {
				@Pc(82) Class102 local82 = super.anInt5366 != -1 && super.anInt5405 == 0 ? Static333.aClass50_2.method1175(super.anInt5366) : null;
				@Pc(103) Class102 local103 = super.anInt5421 == -1 || this.aBoolean72 || super.aBoolean394 && local82 != null ? null : Static333.aClass50_2.method1175(super.anInt5421);
				@Pc(137) Class159 local137 = Static273.method4590(super.aClass159Array3[0], super.anInt5365, super.anInt5420, arg0, 160, local103 == null ? local82 : local103, 240, 0, super.anInt5373, 1, local24, super.aBoolean393, 0, local103 == null ? super.anInt5407 : super.anInt5375);
				if (local137 != null) {
					arg0.method2460(local38, local41 - 128.0F);
					arg0.method2487(false);
					local137.method4952(local19, null, 0);
					arg0.method2487(true);
				}
			}
		}
		if (Static182.aClass1_Sub2_Sub1_Sub1_1 == this) {
			arg0.method2460(local38, local41 - 144.0F);
			local19.method3711(super.anInt6800, super.anInt6797, super.anInt6798);
			for (@Pc(178) int local178 = Static16.aClass247Array1.length - 1; local178 >= 0; local178--) {
				@Pc(184) Class247 local184 = Static16.aClass247Array1[local178];
				if (local184 != null && local184.anInt6954 != -1) {
					@Pc(235) int local235;
					@Pc(224) int local224;
					if (local184.anInt6960 == 1 && local184.anInt6955 >= 0 && Static223.aClass1_Sub2_Sub1_Sub2Array1.length > local184.anInt6955) {
						@Pc(212) Class1_Sub2_Sub1_Sub2 local212 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local184.anInt6955];
						if (local212 != null) {
							local224 = local212.anInt6800 / 32 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 / 32;
							local235 = local212.anInt6798 / 32 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 / 32;
							this.method702(local19, 360000, local235, local184.anInt6954, arg0, local224, super.aClass159Array3[0]);
						}
					}
					if (local184.anInt6960 == 2) {
						@Pc(269) int local269 = (local184.anInt6958 - Static279.anInt5198) * 4 + 2 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 / 32;
						local224 = (local184.anInt6957 - Static350.anInt6470) * 4 + 2 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 / 32;
						local235 = local184.anInt6963 * 4;
						local235 *= local235;
						this.method702(local19, local235, local224, local184.anInt6954, arg0, local269, super.aClass159Array3[0]);
					}
					if (local184.anInt6960 == 10 && local184.anInt6955 >= 0 && Static42.aClass1_Sub2_Sub1_Sub1Array1.length > local184.anInt6955) {
						@Pc(334) Class1_Sub2_Sub1_Sub1 local334 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local184.anInt6955];
						if (local334 != null) {
							local224 = local334.anInt6800 / 32 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 / 32;
							local235 = local334.anInt6798 / 32 - Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 / 32;
							this.method702(local19, 360000, local235, local184.anInt6954, arg0, local224, super.aClass159Array3[0]);
						}
					}
				}
			}
			local19.method3708(local24);
			local19.method3701(super.anInt6800, super.anInt6797, super.anInt6798);
		}
		arg0.method2460(local38, local41);
		@Pc(396) Class7_Sub5 local396 = Static234.method4211(super.aClass159Array3.length);
		if (super.aClass7_Sub3_4 == null) {
			arg0.method2477(super.aClass159Array3, local19, local396.aClass7_Sub6Array1, Static182.aClass1_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(418) Class34 local418 = super.aClass7_Sub3_4.method519();
			arg0.method2541(super.aClass159Array3, local418, local19, local396.aClass7_Sub6Array1, Static182.aClass1_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
		}
		this.method4787(false, arg0, super.aClass159Array3);
		if (super.aClass159Array3[2] != null) {
			if (local24 != 0) {
				super.aClass159Array3[2].method4969(local24);
			}
			super.aClass159Array3[2].method4945(-super.aClass2_Sub25_3.anInt3747 + super.anInt6800, -super.aClass2_Sub25_3.anInt3728 + super.anInt6797, -super.aClass2_Sub25_3.anInt3740 + super.anInt6798);
		}
		return local396;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!oj;B)Z")
	private boolean method701(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class227 local11 = this.method4799();
		@Pc(28) Class102 local28 = super.anInt5366 != -1 && super.anInt5405 == 0 ? Static333.aClass50_2.method1175(super.anInt5366) : null;
		@Pc(49) Class102 local49 = super.anInt5421 == -1 || this.aBoolean72 || super.aBoolean394 && local28 != null ? null : Static333.aClass50_2.method1175(super.anInt5421);
		@Pc(62) int local62 = local11.anInt6427;
		@Pc(65) int local65 = local11.anInt6454;
		if (local62 != 0 || local65 != 0 || local11.anInt6448 != 0 || local11.anInt6458 != 0) {
			arg0 |= 0x7;
		}
		super.aClass159Array3[0] = this.aClass158_1.method3948(local49, Static59.aClass194_1, super.anInt5413, Static182.aClass170_2, arg1, arg0, super.anInt5375, super.anInt5425, super.aClass51Array3, super.anInt5377, Static57.aClass196_1, super.anInt5367, Static333.aClass50_2, local28, super.anInt5407, Static179.aClass115_1, Static207.aClass32_1);
		@Pc(121) int local121 = Static390.method6113();
		if (Static199.anInt4131 < 96 && local121 > 50) {
			Static60.method1151();
		}
		@Pc(154) int local154;
		if (Static158.aClass49_3 != Static306.aClass49_7 && local121 < 50) {
			local154 = 50 - local121;
			while (Static232.anInt4640 < local154) {
				Static132.aByteArrayArray10[Static232.anInt4640] = new byte[102400];
				Static232.anInt4640++;
			}
			while (local154 < Static232.anInt4640) {
				Static232.anInt4640--;
				Static132.aByteArrayArray10[Static232.anInt4640] = null;
			}
		} else if (Static306.aClass49_7 != Static158.aClass49_3) {
			Static132.aByteArrayArray10 = new byte[50][];
			Static232.anInt4640 = 0;
		}
		if (super.aClass159Array3[0] == null) {
			return false;
		}
		super.anInt5389 = super.aClass159Array3[0].method4941();
		this.method4798(super.aClass159Array3[0]);
		local154 = super.aClass217_7.method5455();
		super.anInt5365 = 0;
		super.anInt5373 = 0;
		super.anInt5420 = 0;
		if (local62 == 0 && local65 == 0) {
			this.method4791(this.method4792() << 7, this.method4792() << 7, local154);
		} else {
			this.method4791(local62, local65, local154);
			if (super.anInt5420 != 0) {
				super.aClass159Array3[0].method4954(super.anInt5420);
			}
			if (super.anInt5365 != 0) {
				super.aClass159Array3[0].method4968(super.anInt5365);
			}
			if (super.anInt5373 != 0) {
				super.aClass159Array3[0].method4945(0, super.anInt5373, 0);
			}
		}
		super.aClass159Array3[1] = null;
		if (!this.aBoolean72 && super.anInt5396 != -1 && super.anInt5404 != -1) {
			@Pc(313) Class182 local313 = Static153.aClass116_1.method2791(super.anInt5396);
			@Pc(333) Class159 local333 = local313.method4568(super.anInt5391, super.anInt5404, Static333.aClass50_2, super.anInt5364, (local313.aBoolean373 ? 7 : 2) | local7, arg1);
			if (local333 != null) {
				local333.method4945(0, -super.anInt5423, 0);
				if (local313.aBoolean373 && (local62 != 0 || local65 != 0)) {
					if (super.anInt5420 != 0) {
						local333.method4954(super.anInt5420);
					}
					if (super.anInt5365 != 0) {
						local333.method4968(super.anInt5365);
					}
					if (super.anInt5373 != 0) {
						local333.method4945(0, super.anInt5373, 0);
					}
				}
				super.aClass159Array3[1] = local333;
			}
		}
		super.aClass159Array3[2] = null;
		if (!this.aBoolean72 && super.aClass2_Sub25_3 != null) {
			if (Static339.anInt6265 >= super.aClass2_Sub25_3.anInt3746) {
				super.aClass2_Sub25_3 = null;
			} else if (super.aClass2_Sub25_3.anInt3734 <= Static339.anInt6265) {
				@Pc(418) Class159 local418 = super.aClass2_Sub25_3.method3280(arg1, local7 | 0x7);
				if (local418 != null) {
					local418.method4945(super.aClass2_Sub25_3.anInt3747 - super.anInt6800, super.aClass2_Sub25_3.anInt3728 - super.anInt6797, -super.anInt6798 + super.aClass2_Sub25_3.anInt3740);
					if (local154 != 0) {
						local418.method4969(-local154 & 0x3FFF);
					}
					super.aClass159Array3[2] = local418;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!bd;IIIZLclient!oj;ILclient!qh;)V")
	private void method702(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class48 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class159 arg6) {
		@Pc(12) int local12 = arg5 * arg5 + arg2 * arg2;
		if (local12 < 16 || local12 > arg1) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg5, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(53) Class159 local53 = Static234.method4208(super.anInt6798, super.anInt6800, arg4, super.anInt5365, super.anInt5373, super.anInt6797, arg6, super.anInt5420, arg3, local34);
		if (local53 != null) {
			arg4.method2487(false);
			local53.method4952(arg0, null, 0);
			arg4.method2487(true);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)V")
	public void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray466[0] = arg1;
		super.anInt5429 = 0;
		super.anInt5431 = 0;
		super.anInt5432 = 0;
		super.anIntArray465[0] = arg0;
		@Pc(30) int local30 = this.method4792();
		super.anInt6800 = super.anIntArray466[0] * 128 + local30 * 64;
		super.anInt6798 = super.anIntArray465[0] * 128 + local30 * 64;
		if (Static182.aClass1_Sub2_Sub1_Sub1_1 == this) {
			Static370.method4288();
		}
		if (super.aClass7_Sub3_4 != null) {
			super.aClass7_Sub3_4.method523();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBII)V")
	public void method704(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt5432 < 9) {
			super.anInt5432++;
		}
		for (@Pc(27) int local27 = super.anInt5432; local27 > 0; local27--) {
			super.anIntArray466[local27] = super.anIntArray466[local27 - 1];
			super.anIntArray465[local27] = super.anIntArray465[local27 - 1];
			super.aByteArray78[local27] = super.aByteArray78[local27 - 1];
		}
		super.anIntArray466[0] = arg1;
		super.aByteArray78[0] = arg0;
		super.anIntArray465[0] = arg2;
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)I")
	@Override
	public int method5894() {
		return super.anInt5389;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method705() {
		@Pc(15) String local15 = "";
		if (Static81.aStringArray11 != null) {
			local15 = local15 + Static81.aStringArray11[this.aByte18];
		}
		@Pc(37) int[] local37;
		if (this.aByte20 == 1 && Static353.anIntArray553 != null) {
			local37 = Static353.anIntArray553;
		} else {
			local37 = Static65.anIntArray110;
		}
		if (local37 != null && local37[this.aByte18] != -1) {
			@Pc(58) Class61 local58 = Static25.aClass84_3.method1984(local37[this.aByte18]);
			if (local58.aChar3 == 's') {
				local15 = local15 + local58.method1380(this.aByte19 & 0xFF);
			} else {
				Static346.method5531(new Throwable(), "gdn1");
				local37[this.aByte18] = -1;
			}
		}
		local15 = local15 + this.aString11;
		if (Static383.aStringArray44 != null) {
			local15 = local15 + Static383.aStringArray44[this.aByte18];
		}
		return local15;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)I")
	@Override
	protected int method4786() {
		return this.anInt976;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass158_1 == null || !this.method701(65536, arg1)) {
			return true;
		}
		@Pc(19) Class21 local19 = arg1.method2445();
		@Pc(24) int local24 = super.aClass217_7.method5455();
		local19.method3708(local24);
		local19.method3701(super.anInt6800, super.anInt6797, super.anInt6798);
		for (@Pc(37) int local37 = 0; local37 < super.aClass159Array3.length; local37++) {
			if (super.aClass159Array3[local37] != null && super.aClass159Array3[local37].method4931(arg0, arg2, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method706() {
		return this.aString12;
	}
}
