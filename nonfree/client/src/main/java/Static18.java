import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt442;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "[Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array3;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!he;")
	private static Class26 aClass26_262 = Static6.method100("Malformed login packet)3");

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt437 = 0;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
	public static int[] anIntArray54 = new int[50];

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_263 = aClass26_262;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "[I")
	private static int[] anIntArray55 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!he;")
	public static Class26 aClass26_264 = Static6.method100("sl_arrows");

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "Lclient!he;")
	private static Class26 aClass26_266 = Static6.method100("Service unavailable)3");

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!he;")
	public static Class26 aClass26_265 = aClass26_266;

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "Lclient!sf;")
	public static Class66 aClass66_7 = new Class66(64);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method275() {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(33) int local33;
		@Pc(62) Class3_Sub1_Sub5_Sub4 local62;
		if (Static72.anInt2056 == 39) {
			local12 = Static33.aClass3_Sub11_Sub1_2.method988();
			local18 = Static33.aClass3_Sub11_Sub1_2.method1005();
			local26 = (local18 >> 4 & 0x7) + Static38.anInt1241;
			local33 = Static105.anInt2856 + (local18 & 0x7);
			if (local26 >= 0 && local33 >= 0 && local26 < 104 && local33 < 104) {
				@Pc(55) Class65 local55 = Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local26][local33];
				if (local55 != null) {
					for (local62 = (Class3_Sub1_Sub5_Sub4) local55.method1958(); local62 != null; local62 = (Class3_Sub1_Sub5_Sub4) local55.method1962()) {
						if (local62.anInt1244 == (local12 & 0x7FFF)) {
							local62.method2201();
							break;
						}
					}
					if (local55.method1958() == null) {
						Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local26][local33] = null;
					}
					Static102.method1899(local33, local26);
				}
			}
			return;
		}
		@Pc(136) int local136;
		@Pc(140) int local140;
		if (Static72.anInt2056 == 186) {
			local12 = Static33.aClass3_Sub11_Sub1_2.method981();
			local26 = (local12 & 0x7) + Static105.anInt2856;
			local18 = (local12 >> 4 & 0x7) + Static38.anInt1241;
			local33 = Static33.aClass3_Sub11_Sub1_2.method974();
			local136 = Static33.aClass3_Sub11_Sub1_2.method981();
			local140 = Static33.aClass3_Sub11_Sub1_2.method974();
			if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
				local18 = local18 * 128 + 64;
				local26 = local26 * 128 + 64;
				@Pc(187) Class3_Sub1_Sub5_Sub3 local187 = new Class3_Sub1_Sub5_Sub3(local33, Static132.anInt3270, local18, local26, Static110.method2006(local18, local26, Static132.anInt3270) - local136, local140, Static4.anInt136);
				Static81.aClass65_56.method1955(local187);
			}
			return;
		}
		@Pc(223) int local223;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(249) int local249;
		@Pc(253) int local253;
		@Pc(257) int local257;
		if (Static72.anInt2056 == 239) {
			local12 = Static33.aClass3_Sub11_Sub1_2.method974();
			local18 = Static33.aClass3_Sub11_Sub1_2.method988();
			@Pc(209) byte local209 = Static33.aClass3_Sub11_Sub1_2.method994();
			@Pc(213) byte local213 = Static33.aClass3_Sub11_Sub1_2.method1007();
			local136 = Static33.aClass3_Sub11_Sub1_2.method1004();
			local223 = Static105.anInt2856 + (local136 & 0x7);
			local140 = (local136 >> 4 & 0x7) + Static38.anInt1241;
			@Pc(237) byte local237 = Static33.aClass3_Sub11_Sub1_2.method1026();
			local241 = Static33.aClass3_Sub11_Sub1_2.method988();
			local245 = Static33.aClass3_Sub11_Sub1_2.method1004();
			local249 = local245 >> 2;
			local253 = local245 & 0x3;
			local257 = anIntArray55[local249];
			@Pc(261) byte local261 = Static33.aClass3_Sub11_Sub1_2.method1010();
			@Pc(265) int local265 = Static33.aClass3_Sub11_Sub1_2.method978();
			@Pc(272) Class3_Sub1_Sub5_Sub1_Sub1 local272;
			if (local12 == Static4.anInt133) {
				local272 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1;
			} else {
				local272 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local12];
			}
			if (local272 != null) {
				@Pc(282) Class3_Sub1_Sub1 local282 = Static4.method68(local265);
				@Pc(290) int local290 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local140][local223];
				@Pc(300) int local300 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local140 + 1][local223];
				@Pc(312) int local312 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local140 + 1][local223 + 1];
				@Pc(322) int local322 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local140][local223 + 1];
				@Pc(332) Class3_Sub1_Sub5_Sub7 local332 = local282.method49(local300, local249, local253, local312, local322, local290);
				if (local332 != null) {
					Static47.method896(0, local140, 0, local257, -1, local18 + 1, local223, local241 + 1, Static132.anInt3270);
					local272.anInt833 = Static4.anInt136 + local241;
					@Pc(357) int local357 = local282.anInt86;
					local272.anInt838 = local18 + Static4.anInt136;
					local272.aClass3_Sub1_Sub5_Sub7_1 = local332;
					@Pc(371) byte local371;
					if (local213 > local261) {
						local371 = local213;
						local213 = local261;
						local261 = local371;
					}
					@Pc(378) int local378 = local282.anInt96;
					if (local209 < local237) {
						local371 = local237;
						local237 = local209;
						local209 = local371;
					}
					if (local253 == 1 || local253 == 3) {
						local378 = local282.anInt86;
						local357 = local282.anInt96;
					}
					local272.anInt831 = local378 * 64 + local223 * 128;
					local272.anInt834 = local357 * 64 + local140 * 128;
					local272.anInt822 = Static110.method2006(local272.anInt834, local272.anInt831, Static132.anInt3270);
					local272.anInt829 = local209 + local223;
					local272.anInt840 = local261 + local140;
					local272.anInt839 = local213 + local140;
					local272.anInt836 = local237 + local223;
				}
			}
		}
		@Pc(503) int local503;
		if (Static72.anInt2056 == 218) {
			local12 = Static33.aClass3_Sub11_Sub1_2.method981();
			local18 = (local12 >> 4 & 0x7) + Static38.anInt1241;
			local26 = (local12 & 0x7) + Static105.anInt2856;
			local33 = Static33.aClass3_Sub11_Sub1_2.method994() + local18;
			local136 = local26 + Static33.aClass3_Sub11_Sub1_2.method994();
			local140 = Static33.aClass3_Sub11_Sub1_2.method1003();
			local223 = Static33.aClass3_Sub11_Sub1_2.method974();
			local503 = Static33.aClass3_Sub11_Sub1_2.method981() * 4;
			local241 = Static33.aClass3_Sub11_Sub1_2.method981() * 4;
			local245 = Static33.aClass3_Sub11_Sub1_2.method974();
			local249 = Static33.aClass3_Sub11_Sub1_2.method974();
			local253 = Static33.aClass3_Sub11_Sub1_2.method981();
			local257 = Static33.aClass3_Sub11_Sub1_2.method981();
			if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104 && local33 >= 0 && local136 >= 0 && local33 < 104 && local136 < 104 && local223 != 65535) {
				local26 = local26 * 128 + 64;
				local33 = local33 * 128 + 64;
				local136 = local136 * 128 + 64;
				local18 = local18 * 128 + 64;
				@Pc(617) Class3_Sub1_Sub5_Sub5 local617 = new Class3_Sub1_Sub5_Sub5(local223, Static132.anInt3270, local18, local26, Static110.method2006(local18, local26, Static132.anInt3270) - local503, Static4.anInt136 + local245, Static4.anInt136 + local249, local253, local257, local140, local241);
				local617.method1181(local33, Static110.method2006(local33, local136, Static132.anInt3270) - local241, local245 - -Static4.anInt136, local136);
				Static72.aClass65_51.method1955(local617);
			}
		} else if (Static72.anInt2056 == 208) {
			local12 = Static33.aClass3_Sub11_Sub1_2.method981();
			local18 = (local12 >> 4 & 0x7) + Static38.anInt1241;
			local26 = Static105.anInt2856 + (local12 & 0x7);
			local33 = Static33.aClass3_Sub11_Sub1_2.method974();
			local136 = Static33.aClass3_Sub11_Sub1_2.method974();
			local140 = Static33.aClass3_Sub11_Sub1_2.method974();
			if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
				@Pc(704) Class65 local704 = Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local18][local26];
				if (local704 != null) {
					for (@Pc(711) Class3_Sub1_Sub5_Sub4 local711 = (Class3_Sub1_Sub5_Sub4) local704.method1958(); local711 != null; local711 = (Class3_Sub1_Sub5_Sub4) local704.method1962()) {
						if ((local33 & 0x7FFF) == local711.anInt1244 && local136 == local711.anInt1243) {
							local711.anInt1243 = local140;
							break;
						}
					}
					Static102.method1899(local26, local18);
				}
			}
		} else {
			if (Static72.anInt2056 == 61) {
				local12 = Static33.aClass3_Sub11_Sub1_2.method981();
				local18 = (local12 >> 4 & 0x7) + Static38.anInt1241;
				local26 = Static105.anInt2856 + (local12 & 0x7);
				local33 = Static33.aClass3_Sub11_Sub1_2.method974();
				local136 = Static33.aClass3_Sub11_Sub1_2.method981();
				local140 = local136 >> 4 & 0xF;
				local223 = local136 & 0x7;
				local503 = Static33.aClass3_Sub11_Sub1_2.method981();
				if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
					local241 = local140 + 1;
					if (local18 - local241 <= Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0] && Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0] <= local18 + local241 && Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0] >= local26 - local241 && Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0] <= local26 + local241 && Static115.anInt3051 != 0 && local223 > 0 && Static8.anInt195 < 50) {
						Static32.anIntArray106[Static8.anInt195] = local33;
						anIntArray54[Static8.anInt195] = local223;
						Static40.anIntArray136[Static8.anInt195] = local503;
						Static76.aClass36Array1[Static8.anInt195] = null;
						Static1.anIntArray1[Static8.anInt195] = (local26 << 8) + (local18 << 16) + local140;
						Static8.anInt195++;
					}
				}
			}
			if (Static72.anInt2056 == 26) {
				local12 = Static33.aClass3_Sub11_Sub1_2.method1005();
				local26 = (local12 & 0x7) + Static105.anInt2856;
				local18 = Static38.anInt1241 + (local12 >> 4 & 0x7);
				local33 = Static33.aClass3_Sub11_Sub1_2.method988();
				local136 = Static33.aClass3_Sub11_Sub1_2.method988();
				local140 = Static33.aClass3_Sub11_Sub1_2.method1000();
				if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104 && local140 != Static4.anInt133) {
					@Pc(960) Class3_Sub1_Sub5_Sub4 local960 = new Class3_Sub1_Sub5_Sub4();
					local960.anInt1244 = local136;
					local960.anInt1243 = local33;
					if (Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local18][local26] == null) {
						Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local18][local26] = new Class65();
					}
					Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local18][local26].method1955(local960);
					Static102.method1899(local26, local18);
				}
			} else if (Static72.anInt2056 == 16) {
				local12 = Static33.aClass3_Sub11_Sub1_2.method1004();
				local26 = local12 & 0x3;
				local18 = local12 >> 2;
				local33 = anIntArray55[local18];
				local136 = Static33.aClass3_Sub11_Sub1_2.method1004();
				local140 = (local136 >> 4 & 0x7) + Static38.anInt1241;
				local223 = Static105.anInt2856 + (local136 & 0x7);
				if (local140 >= 0 && local223 >= 0 && local140 < 104 && local223 < 104) {
					Static47.method896(local26, local140, local18, local33, -1, 0, local223, -1, Static132.anInt3270);
				}
			} else if (Static72.anInt2056 == 17) {
				local12 = Static33.aClass3_Sub11_Sub1_2.method1004();
				local18 = Static38.anInt1241 + (local12 >> 4 & 0x7);
				local26 = Static105.anInt2856 + (local12 & 0x7);
				local33 = Static33.aClass3_Sub11_Sub1_2.method978();
				local136 = Static33.aClass3_Sub11_Sub1_2.method1004();
				local223 = local136 & 0x3;
				local140 = local136 >> 2;
				local503 = anIntArray55[local140];
				if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
					Static47.method896(local223, local18, local140, local503, local33, 0, local26, -1, Static132.anInt3270);
				}
			} else if (Static72.anInt2056 == 140) {
				local12 = Static33.aClass3_Sub11_Sub1_2.method1000();
				local18 = Static33.aClass3_Sub11_Sub1_2.method981();
				local26 = Static38.anInt1241 + (local18 >> 4 & 0x7);
				local33 = Static105.anInt2856 + (local18 & 0x7);
				local136 = Static33.aClass3_Sub11_Sub1_2.method981();
				local223 = local136 & 0x3;
				local140 = local136 >> 2;
				local503 = anIntArray55[local140];
				if (local26 >= 0 && local33 >= 0 && local26 < 103 && local33 < 103) {
					local249 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local26 + 1][local33 + 1];
					local253 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local26][local33 + 1];
					local245 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local26 + 1][local33];
					local241 = Static117.anIntArrayArrayArray6[Static132.anInt3270][local26][local33];
					if (local503 == 0) {
						@Pc(1242) Class68 local1242 = Static62.aClass69_1.method2058(Static132.anInt3270, local26, local33);
						if (local1242 != null) {
							@Pc(1251) int local1251 = local1242.anInt2957 >> 14 & 0x7FFF;
							if (local140 == 2) {
								local1242.aClass3_Sub1_Sub5_6 = new Class3_Sub1_Sub5_Sub6(local1251, 2, local223 + 4, local241, local245, local249, local253, local12, false, local1242.aClass3_Sub1_Sub5_6);
								local1242.aClass3_Sub1_Sub5_7 = new Class3_Sub1_Sub5_Sub6(local1251, 2, local223 + 1 & 0x3, local241, local245, local249, local253, local12, false, local1242.aClass3_Sub1_Sub5_7);
							} else {
								local1242.aClass3_Sub1_Sub5_6 = new Class3_Sub1_Sub5_Sub6(local1251, local140, local223, local241, local245, local249, local253, local12, false, local1242.aClass3_Sub1_Sub5_6);
							}
						}
					}
					if (local503 == 1) {
						@Pc(1319) Class25 local1319 = Static62.aClass69_1.method2027(Static132.anInt3270, local26, local33);
						if (local1319 != null) {
							local1319.aClass3_Sub1_Sub5_1 = new Class3_Sub1_Sub5_Sub6(local1319.anInt1257 >> 14 & 0x7FFF, 4, 0, local241, local245, local249, local253, local12, false, local1319.aClass3_Sub1_Sub5_1);
						}
					}
					if (local503 == 2) {
						if (local140 == 11) {
							local140 = 10;
						}
						@Pc(1360) Class67 local1360 = Static62.aClass69_1.method2031(Static132.anInt3270, local26, local33);
						if (local1360 != null) {
							local1360.aClass3_Sub1_Sub5_5 = new Class3_Sub1_Sub5_Sub6(local1360.anInt2952 >> 14 & 0x7FFF, local140, local223, local241, local245, local249, local253, local12, false, local1360.aClass3_Sub1_Sub5_5);
						}
					}
					if (local503 == 3) {
						@Pc(1392) Class74 local1392 = Static62.aClass69_1.method2024(Static132.anInt3270, local26, local33);
						if (local1392 != null) {
							local1392.aClass3_Sub1_Sub5_8 = new Class3_Sub1_Sub5_Sub6(local1392.anInt3174 >> 14 & 0x7FFF, 22, local223, local241, local245, local249, local253, local12, false, local1392.aClass3_Sub1_Sub5_8);
						}
					}
				}
			} else if (Static72.anInt2056 == 112) {
				local12 = Static33.aClass3_Sub11_Sub1_2.method974();
				local18 = Static33.aClass3_Sub11_Sub1_2.method978();
				local26 = Static33.aClass3_Sub11_Sub1_2.method1005();
				local33 = (local26 >> 4 & 0x7) + Static38.anInt1241;
				local136 = Static105.anInt2856 + (local26 & 0x7);
				if (local33 >= 0 && local136 >= 0 && local33 < 104 && local136 < 104) {
					local62 = new Class3_Sub1_Sub5_Sub4();
					local62.anInt1243 = local18;
					local62.anInt1244 = local12;
					if (Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local33][local136] == null) {
						Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local33][local136] = new Class65();
					}
					Static64.aClass65ArrayArrayArray1[Static132.anInt3270][local33][local136].method1955(local62);
					Static102.method1899(local136, local33);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
	public static void method276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg2; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg3 + arg0; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static86.aByteArrayArrayArray6[0][local11][local7] = 127;
					if (local11 == arg3 && local11 > 0) {
						Static117.anIntArrayArrayArray6[0][local11][local7] = Static117.anIntArrayArrayArray6[0][local11 - 1][local7];
					}
					if (arg0 + arg3 == local11 && local11 < 103) {
						Static117.anIntArrayArrayArray6[0][local11][local7] = Static117.anIntArrayArrayArray6[0][local11 + 1][local7];
					}
					if (local7 == arg1 && local7 > 0) {
						Static117.anIntArrayArrayArray6[0][local11][local7] = Static117.anIntArrayArrayArray6[0][local11][local7 - 1];
					}
					if (local7 == arg2 + arg1 && local7 < 103) {
						Static117.anIntArrayArrayArray6[0][local11][local7] = Static117.anIntArrayArrayArray6[0][local11][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I")
	public static int method277(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method278() {
		aClass26_266 = null;
		aClass3_Sub1_Sub4_Sub1Array3 = null;
		anIntArray54 = null;
		anObject1 = null;
		aClass26_263 = null;
		aClass26_262 = null;
		aClass26_265 = null;
		aClass66_7 = null;
		aClass26_264 = null;
		aBigInteger1 = null;
		anIntArray55 = null;
	}
}
