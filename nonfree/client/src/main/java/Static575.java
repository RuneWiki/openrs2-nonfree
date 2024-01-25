import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!vu", name = "P", descriptor = "[I")
	public static int[] anIntArray575;

	@OriginalMember(owner = "client!vu", name = "bb", descriptor = "Lclient!au;")
	public static Class24 aClass24_2;

	@OriginalMember(owner = "client!vu", name = "K", descriptor = "[I")
	public static final int[] anIntArray574 = new int[3];

	@OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
	public static int anInt9957 = 0;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public static void method7822() {
		Static273.aClass244_42.method5581();
		Static58.aClass244_16.method5581();
		@Pc(26) int local26;
		for (@Pc(21) Class3_Sub13 local21 = (Class3_Sub13) Static260.aClass244_40.method5572(); local21 != null; local21 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			local26 = local21.anInt2364;
			if (local26 < 1000) {
				local21.method8128();
				if (local26 == 15 || local26 == 50 || local26 == 45 || local26 == 23 || local26 == 51 || local26 == 49 || local26 == 5) {
					Static58.aClass244_16.method5570(local21);
				} else {
					Static273.aClass244_42.method5570(local21);
				}
			}
		}
		Static273.aClass244_42.method5579(Static260.aClass244_40);
		Static58.aClass244_16.method5579(Static260.aClass244_40);
		if (Static161.anInt3613 <= 1) {
			Static330.aClass3_Sub13_2 = null;
		} else if (Static171.aBoolean264 && Static446.aClass237_1.method5292(81) && Static161.anInt3613 > 2) {
			Static330.aClass3_Sub13_2 = (Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286.aClass3_286;
		} else {
			Static330.aClass3_Sub13_2 = (Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286;
		}
		local26 = -1;
		@Pc(121) Class3_Sub27 local121 = (Class3_Sub27) Static114.aClass244_23.method5572();
		if (local121 != null) {
			local26 = local121.method5341();
		}
		if (!Static289.aBoolean370) {
			if (local26 == 0 && (Static103.anInt2586 == 1 && Static161.anInt3613 > 2 || Static132.method2603())) {
				local26 = 2;
			}
			if (local26 == 2 && Static161.anInt3613 > 0 && local121 != null) {
				if (Static2.aClass251_1 == null && Static202.anInt4324 == 0) {
					Static483.method6564(local121.method5337(), local121.method5338());
				} else {
					Static85.anInt2285 = 2;
				}
			}
			if (local26 == 0 && Static161.anInt3613 > 0) {
				Static139.method4616();
			}
			if (Static2.aClass251_1 != null || Static202.anInt4324 != 0) {
				return;
			}
			Static85.anInt2285 = 0;
			Static474.aClass3_Sub13_3 = null;
			return;
		}
		@Pc(136) int local136;
		@Pc(140) int local140;
		if (local26 == -1) {
			local136 = Static234.aClass54_4.method7306();
			local140 = Static234.aClass54_4.method7315();
			if (local136 < Static89.anInt2311 - 10 || local136 > Static89.anInt2311 + Static240.anInt4751 + 10 || Static111.anInt2680 - 10 > local140 || Static111.anInt2680 + Static126.anInt2888 + 10 < local140) {
				Static314.method4678();
			}
		}
		if (local26 != 0) {
			return;
		}
		local136 = Static89.anInt2311;
		local140 = Static111.anInt2680;
		@Pc(187) int local187 = Static240.anInt4751;
		@Pc(193) int local193 = local121.method5338();
		@Pc(197) int local197 = local121.method5337();
		@Pc(199) int local199 = -1;
		@Pc(218) int local218;
		for (@Pc(201) int local201 = 0; local201 < Static161.anInt3613; local201++) {
			if (Static582.aBoolean697) {
				local218 = (Static161.anInt3613 - local201 - 1) * 16 + local140 + 33;
				if (local136 < local193 && local193 < local187 + local136 && local197 > local218 - 13 && local197 < local218 + 4) {
					local199 = local201;
				}
			} else {
				local218 = (Static161.anInt3613 - local201 - 1) * 16 + local140 + 31;
				if (local136 < local193 && local187 + local136 > local193 && local218 - 13 < local197 && local197 < local218 + 3) {
					local199 = local201;
				}
			}
		}
		if (local199 != -1) {
			local218 = 0;
			@Pc(300) Class85 local300 = new Class85(Static260.aClass244_40);
			for (@Pc(305) Class3_Sub13 local305 = (Class3_Sub13) local300.method2289(); local305 != null; local305 = (Class3_Sub13) local300.method2286()) {
				if (local199 == local218) {
					Static574.method7742(local305, local193, local197);
				}
				local218++;
			}
		}
		Static314.method4678();
		return;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLclient!ie;)Lclient!nfa;")
	public static Class224 method7823(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(14) int local14 = arg0.method6816();
		return new Class224(local14);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B[B)Z")
	public static boolean method7825(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub26 local8 = new Class3_Sub26(arg0);
		@Pc(12) int local12 = local8.method6814();
		if (local12 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method6814() == 1;
		if (local31) {
			Static270.method4105(local8);
		}
		Static83.method1913(local8);
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method7829(@OriginalArg(0) Class31 arg0) {
		if (Static161.anInt3613 < 2 && !Static253.aBoolean325 || Static2.aClass251_1 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static253.aBoolean325 && Static161.anInt3613 < 2) {
			local38 = Static421.aString201 + Static573.aClass350_36.method7730(Static201.anInt4321) + Static238.aString114 + " ->";
		} else if (Static171.aBoolean264 && Static446.aClass237_1.method5292(81) && Static161.anInt3613 > 2) {
			local38 = Static585.method7963((Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286.aClass3_286);
		} else {
			@Pc(59) Class3_Sub13 local59 = (Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286;
			local38 = Static585.method7963(local59);
			@Pc(65) int[] local65 = null;
			if (Static549.method7512(local59.anInt2364)) {
				local65 = Static272.aClass121_2.method3327((int) local59.aLong42).anIntArray199;
			} else if (local59.anInt2365 != -1) {
				local65 = Static272.aClass121_2.method3327(local59.anInt2365).anIntArray199;
			} else if (Static55.method6551(local59.anInt2364)) {
				@Pc(97) Class3_Sub39 local97 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local59.aLong42);
				if (local97 != null) {
					@Pc(102) Class25_Sub2_Sub2_Sub5_Sub2 local102 = local97.aClass25_Sub2_Sub2_Sub5_Sub2_2;
					@Pc(105) Class213 local105 = local102.aClass213_1;
					if (local105.anIntArray345 != null) {
						local105 = local105.method4998(Static206.aClass143_3);
					}
					if (local105 != null) {
						local65 = local105.anIntArray347;
					}
				}
			} else if (Static343.method5003(local59.anInt2364)) {
				@Pc(139) Class194 local139;
				if (local59.anInt2364 == 1002) {
					local139 = Static536.aClass146_4.method3721((int) local59.aLong42);
				} else {
					local139 = Static536.aClass146_4.method3721((int) (local59.aLong42 >>> 32 & 0x7FFFFFFFL));
				}
				if (local139.anIntArray286 != null) {
					local139 = local139.method4696(Static206.aClass143_3);
				}
				if (local139 != null) {
					local65 = local139.anIntArray284;
				}
			}
			if (local65 != null) {
				local38 = local38 + Static291.method4365(local65);
			}
		}
		if (Static161.anInt3613 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static161.anInt3613 - 2) + Static573.aClass350_29.method7730(Static201.anInt4321);
		}
		if (Static187.aClass251_5 != null) {
			@Pc(269) Class63 local269 = Static187.aClass251_5.method5705(arg0);
			if (local269 == null) {
				local269 = Static465.aClass63_10;
			}
			local269.method6892(Static24.anInt233, Static93.anIntArray79, Static187.aClass251_5.anInt7227, Static187.aClass251_5.anInt7215, Static165.anIntArray150, Static187.aClass251_5.anInt7278, Static187.aClass251_5.anInt7285, Static187.aClass251_5.anInt7257, Static269.aRandom1, Static72.anInt1985, Static187.aClass251_5.anInt7225, Static160.anInt3599, local38, Static147.aClass73Array5);
			Static587.method1502(Static165.anIntArray150[0], Static165.anIntArray150[2], Static165.anIntArray150[3], Static165.anIntArray150[1]);
		} else if (Static543.aClass251_14 != null && Static31.aClass89_1 == Static70.aClass89_3) {
			@Pc(250) int local250 = Static465.aClass63_10.method6884(Static93.anIntArray79, local38, Static72.anInt1985, Static429.anInt7992 + 4, Static147.aClass73Array5, Static234.anInt10332 + 16, Static269.aRandom1);
			Static587.method1502(Static429.anInt7992 + 4, local250 + Static35.aClass328_1.method7371(local38), 16, Static234.anInt10332);
			return;
		}
	}
}
