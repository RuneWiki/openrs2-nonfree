import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
	public static int anInt8262;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Lclient!caa;")
	public static Class46 aClass46_23;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!o;")
	public static final Class246 aClass246_28 = new Class246(6, 0, 4, 2);

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "[Lclient!mg;")
	public static final Class222_Sub1[] aClass222_Sub1Array1 = new Class222_Sub1[37];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public static void method7040() {
		@Pc(17) Class6_Sub26 local17 = Static268.method3981(Static377.aClass15_2, Static469.aClass289_117);
		local17.aClass6_Sub23_Sub1_2.method8366(Static455.method6591());
		local17.aClass6_Sub23_Sub1_2.method8347(Static449.anInt7506);
		local17.aClass6_Sub23_Sub1_2.method8347(Static348.anInt5935);
		local17.aClass6_Sub23_Sub1_2.method8366(Static96.aClass6_Sub22_7.aClass29_Sub6_1.method1664());
		Static670.method9077(local17);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIIILclient!sn;)Z")
	public static boolean method7042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class324 arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg7 - 64;
		Static394.anIntArrayArray35[64][64] = 99;
		@Pc(35) int local35 = arg5 - 64;
		Static358.anIntArrayArray33[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static233.anIntArray251[0] = arg7;
		@Pc(52) int local52 = local43 + 1;
		Static436.anIntArray495[0] = arg5;
		@Pc(57) int[][] local57 = arg9.anIntArrayArray51;
		while (local45 != local52) {
			local7 = Static233.anIntArray251[local45];
			local9 = Static436.anIntArray495[local45];
			@Pc(72) int local72 = local9 - local35;
			local45 = local45 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - local18;
			@Pc(89) int local89 = local7 - arg9.anInt9209;
			@Pc(94) int local94 = local9 - arg9.anInt9227;
			if (arg0 == -4) {
				if (local7 == arg4 && arg1 == local9) {
					Static520.anInt9403 = local7;
					Static51.anInt1061 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static219.method3187(2, local9, arg1, arg6, 2, arg4, arg3, local7)) {
					Static520.anInt9403 = local7;
					Static51.anInt1061 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg9.method7779(arg1, arg3, 2, local7, arg8, 2, arg4, arg6, local9)) {
					Static51.anInt1061 = local9;
					Static520.anInt9403 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg9.method7783(local9, local7, arg6, 2, arg1, arg3, arg8, arg4)) {
					Static520.anInt9403 = local7;
					Static51.anInt1061 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg9.method7776(arg1, local9, arg2, 2, arg0, local7, arg4)) {
					Static520.anInt9403 = local7;
					Static51.anInt1061 = local9;
					return true;
				}
			} else if (arg9.method7773(2, local7, arg0, arg4, local9, arg2, arg1)) {
				Static51.anInt1061 = local9;
				Static520.anInt9403 = local7;
				return true;
			}
			@Pc(243) int local243 = Static358.anIntArrayArray33[local83][local72] + 1;
			if (local83 > 0 && Static394.anIntArrayArray35[local83 - 1][local72] == 0 && (local57[local89 - 1][local94] & 0x43A40000) == 0 && (local57[local89 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static233.anIntArray251[local52] = local7 - 1;
				Static436.anIntArray495[local52] = local9;
				Static394.anIntArrayArray35[local83 - 1][local72] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local83 - 1][local72] = local243;
			}
			if (local83 < 126 && Static394.anIntArrayArray35[local83 + 1][local72] == 0 && (local57[local89 + 2][local94] & 0x60E40000) == 0 && (local57[local89 + 2][local94 + 1] & 0x78240000) == 0) {
				Static233.anIntArray251[local52] = local7 + 1;
				Static436.anIntArray495[local52] = local9;
				Static394.anIntArrayArray35[local83 + 1][local72] = 8;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local83 + 1][local72] = local243;
			}
			if (local72 > 0 && Static394.anIntArrayArray35[local83][local72 - 1] == 0 && (local57[local89][local94 - 1] & 0x43A40000) == 0 && (local57[local89 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static233.anIntArray251[local52] = local7;
				Static436.anIntArray495[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local83][local72 - 1] = 1;
				Static358.anIntArrayArray33[local83][local72 - 1] = local243;
			}
			if (local72 < 126 && Static394.anIntArrayArray35[local83][local72 + 1] == 0 && (local57[local89][local94 + 2] & 0x4E240000) == 0 && (local57[local89 + 1][local94 + 2] & 0x78240000) == 0) {
				Static233.anIntArray251[local52] = local7;
				Static436.anIntArray495[local52] = local9 + 1;
				Static394.anIntArrayArray35[local83][local72 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local83][local72 + 1] = local243;
			}
			if (local83 > 0 && local72 > 0 && Static394.anIntArrayArray35[local83 - 1][local72 - 1] == 0 && (local57[local89 - 1][local94] & 0x4FA40000) == 0 && (local57[local89 - 1][local94 - 1] & 0x43A40000) == 0 && (local57[local89][local94 - 1] & 0x63E40000) == 0) {
				Static233.anIntArray251[local52] = local7 - 1;
				Static436.anIntArray495[local52] = local9 - 1;
				Static394.anIntArrayArray35[local83 - 1][local72 - 1] = 3;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local83 - 1][local72 - 1] = local243;
			}
			if (local83 < 126 && local72 > 0 && Static394.anIntArrayArray35[local83 + 1][local72 - 1] == 0 && (local57[local89 + 1][local94 - 1] & 0x63E40000) == 0 && (local57[local89 + 2][local94 - 1] & 0x60E40000) == 0 && (local57[local89 + 2][local94] & 0x78E40000) == 0) {
				Static233.anIntArray251[local52] = local7 + 1;
				Static436.anIntArray495[local52] = local9 - 1;
				Static394.anIntArrayArray35[local83 + 1][local72 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local83 + 1][local72 - 1] = local243;
			}
			if (local83 > 0 && local72 < 126 && Static394.anIntArrayArray35[local83 - 1][local72 + 1] == 0 && (local57[local89 - 1][local94 + 1] & 0x4FA40000) == 0 && (local57[local89 - 1][local94 + 2] & 0x4E240000) == 0 && (local57[local89][local94 + 2] & 0x7E240000) == 0) {
				Static233.anIntArray251[local52] = local7 - 1;
				Static436.anIntArray495[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local83 - 1][local72 + 1] = 6;
				Static358.anIntArrayArray33[local83 - 1][local72 + 1] = local243;
			}
			if (local83 < 126 && local72 < 126 && Static394.anIntArrayArray35[local83 + 1][local72 + 1] == 0 && (local57[local89 + 1][local94 + 2] & 0x7E240000) == 0 && (local57[local89 + 2][local94 + 2] & 0x78240000) == 0 && (local57[local89 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static233.anIntArray251[local52] = local7 + 1;
				Static436.anIntArray495[local52] = local9 + 1;
				Static394.anIntArrayArray35[local83 + 1][local72 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local83 + 1][local72 + 1] = local243;
			}
		}
		Static51.anInt1061 = local9;
		Static520.anInt9403 = local7;
		return false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
	public static void method7043(@OriginalArg(1) boolean arg0) {
		if (Static163.aClass170_1 != null) {
			Static163.aClass170_1.method8770();
			Static163.aClass170_1 = null;
		}
		Static190.anInt3237 = 0;
		Static274.method4045();
		Static609.method8408();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static83.aClass324Array1[local19].method7775();
		}
		Static617.method8513(false);
		System.gc();
		Static597.method8267();
		Static278.anInt9800 = -1;
		Static416.aBoolean483 = false;
		Static189.method2689();
		Static667.method9048(true);
		Static534.anInt8753 = 0;
		Static234.anInt4239 = 0;
		Static566.anInt9416 = 0;
		Static337.anInt2689 = 0;
		Static310.anInt5242 = 0;
		Static15.anInt438 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static539.aClass167Array1.length; local60++) {
			Static539.aClass167Array1[local60] = null;
		}
		Static471.method6937();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local75] = null;
		}
		Static133.anInt2316 = 0;
		Static349.aClass209_32.method5041();
		Static490.anInt8336 = 0;
		Static33.aClass209_3.method5041();
		Static652.method5481();
		Static102.anInt1886 = 0;
		Static659.aClass363_3.method8561();
		Static9.method370();
		Static466.method6902();
		Static150.aClass145_1 = null;
		Static34.aClass6_Sub2_1 = null;
		Static303.aClass6_Sub2_3 = null;
		Static128.aLong76 = 0L;
		Static150.aClass145_2 = null;
		Static538.aClass6_Sub32_3 = null;
		if (arg0) {
			Static143.method2106(12);
			return;
		}
		Static143.method2106(3);
		try {
			Static683.method5174(Static180.anApplet6, "loggedout");
		} catch (@Pc(144) Throwable local144) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public static void method7044() {
		Static293.method4206(Static489.aClass321_39);
		Static272.anInt4703++;
		if (Static200.aBoolean206 && Static418.aBoolean484) {
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			if (Static594.aBoolean693) {
				local24 = Static234.method3562();
				local26 = Static314.method4504();
			}
			@Pc(40) int local40 = local24 + Static193.aClass128_1.method5191();
			@Pc(46) int local46 = Static193.aClass128_1.method5188() + local26;
			local40 -= Static663.anInt9823;
			local46 -= Static464.anInt8031;
			if (Static171.anInt2876 > local40) {
				local40 = Static171.anInt2876;
			}
			if (Static398.aClass321_30.anInt9103 + Static171.anInt2876 < local40 + Static489.aClass321_39.anInt9103) {
				local40 = Static398.aClass321_30.anInt9103 + Static171.anInt2876 - Static489.aClass321_39.anInt9103;
			}
			if (Static292.anInt4923 > local46) {
				local46 = Static292.anInt4923;
			}
			if (Static398.aClass321_30.anInt9077 + Static292.anInt4923 < Static489.aClass321_39.anInt9077 + local46) {
				local46 = Static398.aClass321_30.anInt9077 + Static292.anInt4923 - Static489.aClass321_39.anInt9077;
			}
			@Pc(119) int local119 = Static398.aClass321_30.anInt9102 + local40 - Static171.anInt2876;
			@Pc(126) int local126 = Static398.aClass321_30.anInt9067 + local46 - Static292.anInt4923;
			@Pc(178) Class6_Sub49 local178;
			if (Static193.aClass128_1.method5193()) {
				if (Static489.aClass321_39.anInt9106 < Static272.anInt4703) {
					@Pc(220) int local220 = local40 - Static217.anInt3688;
					@Pc(225) int local225 = local46 - Static310.anInt5237;
					if (local220 > Static489.aClass321_39.anInt9092 || local220 < -Static489.aClass321_39.anInt9092 || local225 > Static489.aClass321_39.anInt9092 || -Static489.aClass321_39.anInt9092 > local225) {
						Static266.aBoolean291 = true;
					}
				}
				if (Static489.aClass321_39.anObjectArray28 != null && Static266.aBoolean291) {
					local178 = new Class6_Sub49();
					local178.anInt9235 = local126;
					local178.anInt9242 = local119;
					local178.anObjectArray35 = Static489.aClass321_39.anObjectArray28;
					local178.aClass321_44 = Static489.aClass321_39;
					Static295.method4226(local178);
				}
			} else {
				if (Static266.aBoolean291) {
					Static221.method3209();
					if (Static489.aClass321_39.anObjectArray27 != null) {
						local178 = new Class6_Sub49();
						local178.anObjectArray35 = Static489.aClass321_39.anObjectArray27;
						local178.aClass321_43 = Static435.aClass321_34;
						local178.aClass321_44 = Static489.aClass321_39;
						local178.anInt9242 = local119;
						local178.anInt9235 = local126;
						Static295.method4226(local178);
					}
					if (Static435.aClass321_34 != null && Static83.method1458(Static489.aClass321_39) != null) {
						Static560.method1267(Static435.aClass321_34, Static489.aClass321_39);
					}
				} else if ((Static261.anInt4524 == 1 || Static100.method1647()) && Static183.anInt3155 > 2) {
					Static624.method8608(Static310.anInt5237 + Static464.anInt8031, Static663.anInt9823 - -Static217.anInt3688);
				} else if (Static390.method5563()) {
					Static624.method8608(Static310.anInt5237 + Static464.anInt8031, Static663.anInt9823 + Static217.anInt3688);
				}
				Static489.aClass321_39 = null;
			}
		} else if (Static272.anInt4703 > 1) {
			Static489.aClass321_39 = null;
		}
	}
}
