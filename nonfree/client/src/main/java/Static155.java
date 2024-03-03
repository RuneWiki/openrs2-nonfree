import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Lclient!vi;")
	public static Class239 aClass239_3;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBLclient!hb;)Lclient!bi;", line = 9)
	public static Class22 method3150(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub5 arg1) {
		@Pc(9) Class22 local9;
		if (Static267.aClass22_3 == null) {
			local9 = new Class22();
		} else {
			local9 = Static267.aClass22_3;
			Static267.aClass22_3 = Static267.aClass22_3.aClass22_1;
			Class155_Sub1.anInt3939--;
			local9.aClass22_1 = null;
		}
		local9.aClass11_Sub5_1 = arg1;
		local9.anInt645 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZZI)I", line = 38)
	public static int method3151(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class2_Sub41 local10 = Static349.method6276(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray489.length; local18++) {
			if (local10.anIntArray489[local18] >= 0 && local10.anIntArray489[local18] < Static290.aClass107_2.anInt2776) {
				@Pc(44) Class188 local44 = Static290.aClass107_2.method2761(local10.anIntArray489[local18]);
				@Pc(54) int local54 = local44.method4773(Static338.aClass18_2.method565(arg0).anInt7010, arg0);
				if (arg1) {
					local16 += local10.anIntArray488[local18] * local54;
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V", line = 127)
	public static void method3155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static307.aClass67ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg1 << 28 | arg2 << 14);
		@Pc(27) Class2_Sub32 local27 = (Class2_Sub32) Class87.aClass4_49.method90(local19);
		if (local27 == null) {
			Static156.method3191(arg1, arg0, arg2);
			return;
		}
		@Pc(41) Class2_Sub8 local41 = (Class2_Sub8) local27.aClass135_34.method3552();
		if (local41 == null) {
			Static156.method3191(arg1, arg0, arg2);
			return;
		}
		@Pc(55) Class11_Sub4_Sub1 local55 = (Class11_Sub4_Sub1) Static156.method3191(arg1, arg0, arg2);
		if (local55 == null) {
			local55 = new Class11_Sub4_Sub1();
		} else {
			local55.anInt3975 = local55.anInt3976 = -1;
		}
		local55.anInt3979 = local41.anInt1717;
		local55.anInt3980 = local41.anInt1715;
		label44: while (true) {
			@Pc(85) Class2_Sub8 local85 = (Class2_Sub8) local27.aClass135_34.method3553();
			if (local85 == null) {
				break;
			}
			if (local55.anInt3980 != local85.anInt1715) {
				local55.anInt3973 = local85.anInt1717;
				local55.anInt3975 = local85.anInt1715;
				while (true) {
					@Pc(110) Class2_Sub8 local110 = (Class2_Sub8) local27.aClass135_34.method3553();
					if (local110 == null) {
						break label44;
					}
					if (local110.anInt1715 != local55.anInt3980 && local55.anInt3975 != local110.anInt1715) {
						local55.anInt3977 = local110.anInt1717;
						local55.anInt3976 = local110.anInt1715;
					}
				}
			}
		}
		@Pc(155) int local155 = Static360.method6033((arg0 << 7) + 64, (arg2 << 7) + 64, arg1);
		Static25.method866(arg1, arg0, arg2, local155, local55);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!wm;)V", line = 241)
	public static void method3157(@OriginalArg(1) Class19 arg0) {
		if (Class2_Sub3_Sub24.anInt4949 < 2 && !Class2_Sub2_Sub10_Sub2.aBoolean419 || Class243.aClass161_14 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Class2_Sub2_Sub10_Sub2.aBoolean419 && Class2_Sub3_Sub24.anInt4949 < 2) {
			local41 = Class67.aString18 + Class2_Sub20.aClass79_67.method2269(Class197.anInt5569) + Class173_Sub4.aString68 + " ->";
		} else if (Class105.aBoolean192 && Static163.aClass123_2.method3344(81) && Class2_Sub3_Sub24.anInt4949 > 2) {
			local41 = Static295.method5422((Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244.aClass2_244);
		} else {
			@Pc(68) Class2_Sub5 local68 = (Class2_Sub5) Class92.aClass135_19.aClass2_130.aClass2_244;
			local41 = Static295.method5422(local68);
			@Pc(74) int[] local74 = null;
			if (Static275.method2427(local68.anInt1004)) {
				local74 = Static290.aClass107_2.method2761((int) local68.aLong30).anIntArray364;
			} else if (local68.anInt1007 != -1) {
				local74 = Static290.aClass107_2.method2761(local68.anInt1007).anIntArray364;
			} else if (Static274.method5112(local68.anInt1004)) {
				@Pc(140) Class11_Sub5_Sub2_Sub2 local140 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[(int) local68.aLong30];
				if (local140 != null) {
					@Pc(145) Class71 local145 = local140.aClass71_1;
					if (local145.anIntArray129 != null) {
						local145 = local145.method2095(Static199.aClass226_1);
					}
					if (local145 != null) {
						local74 = local145.anIntArray131;
					}
				}
			} else if (Static224.method4191(local68.anInt1004)) {
				@Pc(108) Class41 local108;
				if (local68.anInt1004 == 1010) {
					local108 = Static334.aClass202_4.method5164((int) local68.aLong30);
				} else {
					local108 = Static334.aClass202_4.method5164((int) (local68.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local108.anIntArray94 != null) {
					local108 = local108.method1535(Static199.aClass226_1);
				}
				if (local108 != null) {
					local74 = local108.anIntArray96;
				}
			}
			if (local74 != null) {
				local41 = local41 + Static149.method2940(local74);
			}
		}
		if (Class2_Sub3_Sub24.anInt4949 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Class2_Sub3_Sub24.anInt4949 - 2) + Class2_Sub2_Sub16.aClass79_127.method2269(Class197.anInt5569);
		}
		if (Class2_Sub3_Sub17.aClass161_5 != null) {
			@Pc(218) Class130 local218 = Class2_Sub3_Sub17.aClass161_5.method4102(arg0);
			if (local218 == null) {
				local218 = Static49.aClass130_1;
			}
			local218.method5904(Class92.anInt2457, local41, Class2_Sub2_Sub14.anInt5452, Class2_Sub3_Sub7.aRandom1, Class2_Sub3_Sub17.aClass161_5.anInt4286, Class148.anIntArray229, Class2_Sub3_Sub17.aClass161_5.anInt4246, Class2_Sub3_Sub17.aClass161_5.anInt4242, Class2_Sub3_Sub17.aClass161_5.anInt4283, Static260.anInt5340, Static125.aClass13Array12, Class2_Sub3_Sub17.aClass161_5.anInt4255, Class2_Sub3_Sub17.aClass161_5.anInt4291, Static68.anIntArray114);
			Static344.method6222(Class148.anIntArray229[2], Class148.anIntArray229[0], Class148.anIntArray229[3], Class148.anIntArray229[1]);
		} else if (Class2_Sub22.aClass161_6 != null && Class2_Sub26.aClass50_3 == Class226.aClass50_4) {
			@Pc(287) int local287 = Static49.aClass130_1.method5900(Class194.anInt5486 + 4, Static260.anInt5340, Static125.aClass13Array12, Class2_Sub3_Sub7.aRandom1, Class50.anInt1547 + 16, Static68.anIntArray114, local41);
			Static344.method6222(Static106.aClass239_2.method6127(local41) + local287, Class194.anInt5486 + 4, 16, Class50.anInt1547);
		}
	}
}
