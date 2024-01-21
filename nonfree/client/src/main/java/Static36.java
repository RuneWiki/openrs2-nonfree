import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!ha", name = "eb", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_10;

	@OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
	public static int anInt904;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
	public static int anInt897 = 0;

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
	public static int anInt903 = -1;

	@OriginalMember(owner = "client!ha", name = "fb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][13][13];

	@OriginalMember(owner = "client!ha", name = "hb", descriptor = "[Lclient!mc;")
	public static Class42[] aClass42Array6 = new Class42[500];

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method615() {
		anIntArrayArray11 = null;
		anIntArrayArrayArray4 = null;
		aClass1_Sub1_Sub1_Sub4_10 = null;
		Class1_Sub1_Sub7.anIntArray123 = null;
		aClass42Array6 = null;
		anIntArray124 = null;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public static void method616() {
		@Pc(14) int local14;
		if (Static54.anInt1409 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static54.anInt1409 > 768) {
					Static109.anIntArray406[local14] = Static15.method400(Static99.anIntArray378[local14], 1024 - Static54.anInt1409, Static25.anIntArray71[local14]);
				} else if (Static54.anInt1409 > 256) {
					Static109.anIntArray406[local14] = Static25.anIntArray71[local14];
				} else {
					Static109.anIntArray406[local14] = Static15.method400(Static25.anIntArray71[local14], 256 - Static54.anInt1409, Static99.anIntArray378[local14]);
				}
			}
		} else if (Static13.anInt461 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static13.anInt461 > 768) {
					Static109.anIntArray406[local14] = Static15.method400(Static99.anIntArray378[local14], 1024 - Static13.anInt461, Static16.anIntArray43[local14]);
				} else if (Static13.anInt461 <= 256) {
					Static109.anIntArray406[local14] = Static15.method400(Static16.anIntArray43[local14], 256 - Static13.anInt461, Static99.anIntArray378[local14]);
				} else {
					Static109.anIntArray406[local14] = Static16.anIntArray43[local14];
				}
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				Static109.anIntArray406[local14] = Static99.anIntArray378[local14];
			}
		}
		for (local14 = 0; local14 < 33920; local14++) {
			Static34.aClass31_17.anIntArray212[local14] = Static58.aClass1_Sub1_Sub1_Sub1_4.anIntArray12[local14];
		}
		@Pc(157) int local157 = 0;
		@Pc(161) int local161 = 1152;
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(190) int local190;
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(206) int local206;
		@Pc(215) int local215;
		for (@Pc(163) int local163 = 1; local163 < 255; local163++) {
			local176 = (256 - local163) * Static81.anIntArray325[local163] / 256;
			local180 = local176 + 22;
			if (local180 < 0) {
				local180 = 0;
			}
			local157 += local180;
			for (local190 = local180; local190 < 128; local190++) {
				local197 = Static83.anIntArray339[local157++];
				if (local197 == 0) {
					local161++;
				} else {
					local201 = local197;
					local206 = 256 - local197;
					local197 = Static109.anIntArray406[local197];
					local215 = Static34.aClass31_17.anIntArray212[local161];
					Static34.aClass31_17.anIntArray212[local161++] = (local201 * (local197 & 0xFF00) + (local215 & 0xFF00) * local206 & 0xFF0000) + (local206 * (local215 & 0xFF00FF) + local201 * (local197 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local161 += local180;
		}
		for (local176 = 0; local176 < 33920; local176++) {
			Static109.aClass31_38.anIntArray212[local176] = Static84.aClass1_Sub1_Sub1_Sub1_10.anIntArray12[local176];
		}
		local161 = 1176;
		local157 = 0;
		for (local180 = 1; local180 < 255; local180++) {
			local190 = Static81.anIntArray325[local180] * (256 - local180) / 256;
			local197 = 103 - local190;
			local161 += local190;
			for (local201 = 0; local201 < local197; local201++) {
				local206 = Static83.anIntArray339[local157++];
				if (local206 == 0) {
					local161++;
				} else {
					local215 = local206;
					@Pc(338) int local338 = 256 - local206;
					local206 = Static109.anIntArray406[local206];
					@Pc(347) int local347 = Static109.aClass31_38.anIntArray212[local161];
					Static109.aClass31_38.anIntArray212[local161++] = (local215 * (local206 & 0xFF00) + (local347 & 0xFF00) * local338 & 0xFF0000) + (local215 * (local206 & 0xFF00FF) + (local338 * (local347 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local161 += 128 - local190 - local197;
			local157 += 128 - local197;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lclient!bc;")
	public static Class1_Sub1_Sub2 method617(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub2 local10 = (Class1_Sub1_Sub2) Static15.aClass37_8.method982((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static1.aClass33_1.method1305(arg0, 10);
		local10 = new Class1_Sub1_Sub2();
		local10.anInt189 = arg0;
		if (local22 != null) {
			local10.method152(new Class1_Sub8(local22));
		}
		local10.method146();
		if (local10.anInt204 != -1) {
			local10.method158(method617(local10.anInt204), method617(local10.anInt211));
		}
		if (!Static37.aBoolean45 && local10.aBoolean9) {
			local10.aClass42Array2 = null;
			local10.aClass42Array1 = null;
			local10.anInt228 = 0;
			local10.aClass42_120 = Static7.aClass42_126;
		}
		Static15.aClass37_8.method981((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(BI)Lclient!sd;")
	public static Class1_Sub1_Sub15 method618(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub15 local6 = (Class1_Sub1_Sub15) Static47.aClass37_25.method982((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static104.aClass33_31.method1305(arg0, 14);
		local6 = new Class1_Sub1_Sub15();
		if (local20 != null) {
			local6.method1679(new Class1_Sub8(local20));
		}
		Static47.aClass37_25.method981((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!be;IILclient!p;)V")
	public static void method619(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33_Sub1 arg2) {
		@Pc(5) byte[] local5 = null;
		@Pc(7) Class22 local7 = Static72.aClass22_11;
		synchronized (Static72.aClass22_11) {
			for (@Pc(14) Class1_Sub9 local14 = (Class1_Sub9) Static72.aClass22_11.method515(); local14 != null; local14 = (Class1_Sub9) Static72.aClass22_11.method519()) {
				if ((long) arg1 == local14.aLong83 && arg0 == local14.aClass8_2 && local14.anInt1408 == 0) {
					local5 = local14.aByteArray16;
					break;
				}
			}
		}
		if (local5 == null) {
			@Pc(65) byte[] local65 = arg0.method176(arg1);
			arg2.method1332(local65, arg1, true, arg0);
		} else {
			arg2.method1332(local5, arg1, true, arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class1_Sub1_Sub1_Sub1 local17;
		if (arg1 == 0) {
			local17 = (Class1_Sub1_Sub1_Sub1) Static27.aClass37_11.method982((long) arg2);
			if (local17 != null && local17.anInt88 != arg0 && local17.anInt88 != -1) {
				local17.method1825();
				local17 = null;
			}
			if (local17 != null) {
				return local17;
			}
		}
		@Pc(45) Class1_Sub1_Sub2 local45 = method617(arg2);
		if (local45.anIntArray21 == null) {
			arg0 = -1;
		}
		if (arg0 > 1) {
			@Pc(57) int local57 = -1;
			for (@Pc(59) int local59 = 0; local59 < 10; local59++) {
				if (local45.anIntArray19[local59] <= arg0 && local45.anIntArray19[local59] != 0) {
					local57 = local45.anIntArray21[local59];
				}
			}
			if (local57 != -1) {
				local45 = method617(local57);
			}
		}
		@Pc(98) Class1_Sub1_Sub8_Sub3 local98 = local45.method151(true, 1);
		if (local98 == null) {
			return null;
		}
		@Pc(104) Class1_Sub1_Sub1_Sub1 local104 = null;
		if (local45.anInt204 != -1) {
			local104 = method620(10, -1, local45.anInt211);
			if (local104 == null) {
				return null;
			}
		}
		@Pc(122) int local122 = Static55.anInt1622;
		@Pc(124) int[] local124 = Static55.anIntArray237;
		@Pc(126) int local126 = Static55.anInt1621;
		@Pc(128) int local128 = Static55.anInt1618;
		@Pc(130) int local130 = Static55.anInt1619;
		@Pc(132) int local132 = Static55.anInt1620;
		@Pc(134) int local134 = Static55.anInt1617;
		@Pc(136) int[] local136 = Static41.method679();
		@Pc(138) int local138 = Static41.anInt982;
		@Pc(140) int local140 = Static41.anInt981;
		local17 = new Class1_Sub1_Sub1_Sub1(32, 32);
		Static55.method1141(local17.anIntArray12, 32, 32);
		Static45.anIntArray256 = Static41.method689(Static45.anIntArray256);
		Static55.method1129(0, 0, 32, 32, 0);
		Static41.aBoolean54 = false;
		@Pc(165) int local165 = local45.anInt196;
		if (arg1 == -1) {
			local165 = (int) ((double) local165 * 1.5D);
		}
		if (arg1 > 0) {
			local165 = (int) ((double) local165 * 1.04D);
		}
		@Pc(191) int local191 = Class1_Sub1_Sub1_Sub2.anIntArray143[local45.anInt209] * local165 >> 16;
		@Pc(200) int local200 = Class1_Sub1_Sub1_Sub2.anIntArray144[local45.anInt209] * local165 >> 16;
		local98.method1392();
		local98.method1379(local45.anInt222, local45.anInt213, local45.anInt209, local45.anInt229, local200 + local98.anInt2716 / 2 + local45.anInt200, local45.anInt200 + local191);
		for (@Pc(236) int local236 = 31; local236 >= 0; local236--) {
			for (local191 = 31; local191 >= 0; local191--) {
				if (local17.anIntArray12[local191 * 32 + local236] == 0) {
					if (local236 > 0 && local17.anIntArray12[local191 * 32 + local236 - 1] > 1) {
						local17.anIntArray12[local191 * 32 + local236] = 1;
					} else if (local191 > 0 && local17.anIntArray12[local236 + (local191 - 1) * 32] > 1) {
						local17.anIntArray12[local191 * 32 + local236] = 1;
					} else if (local236 < 31 && local17.anIntArray12[local236 + local191 * 32 + 1] > 1) {
						local17.anIntArray12[local236 + local191 * 32] = 1;
					} else if (local191 < 31 && local17.anIntArray12[local236 + (local191 + 1) * 32] > 1) {
						local17.anIntArray12[local236 + local191 * 32] = 1;
					}
				}
			}
		}
		@Pc(382) int local382;
		if (arg1 > 0) {
			for (local382 = 31; local382 >= 0; local382--) {
				for (local191 = 31; local191 >= 0; local191--) {
					if (local17.anIntArray12[local382 + local191 * 32] == 0) {
						if (local382 > 0 && local17.anIntArray12[local191 * 32 + local382 - 1] == 1) {
							local17.anIntArray12[local382 + local191 * 32] = arg1;
						} else if (local191 > 0 && local17.anIntArray12[local191 * 32 + local382 - 32] == 1) {
							local17.anIntArray12[local382 + local191 * 32] = arg1;
						} else if (local382 < 31 && local17.anIntArray12[local191 * 32 + local382 + 1] == 1) {
							local17.anIntArray12[local382 + local191 * 32] = arg1;
						} else if (local191 < 31 && local17.anIntArray12[local382 + (local191 + 1) * 32] == 1) {
							local17.anIntArray12[local191 * 32 + local382] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (local382 = 31; local382 >= 0; local382--) {
				for (local191 = 31; local191 >= 0; local191--) {
					if (local17.anIntArray12[local191 * 32 + local382] == 0 && local382 > 0 && local191 > 0 && local17.anIntArray12[(local191 - 1) * 32 + local382 - 1] > 0) {
						local17.anIntArray12[local382 + local191 * 32] = 3153952;
					}
				}
			}
		}
		if (local45.anInt204 != -1) {
			@Pc(579) int local579 = local104.anInt88;
			local104.anInt88 = 32;
			local382 = local104.anInt89;
			local104.anInt89 = 32;
			local104.method82(0, 0);
			local104.anInt88 = local579;
			local104.anInt89 = local382;
		}
		if (arg1 == 0) {
			Static27.aClass37_11.method981((long) arg2, local17);
		}
		Static55.method1141(local124, local122, local126);
		Static55.method1130(local134, local128, local132, local130);
		Static41.method689(local136);
		Static41.anInt982 = local138;
		Static41.anInt981 = local140;
		Static41.method684();
		Static41.aBoolean54 = true;
		if (local45.aBoolean8) {
			local17.anInt89 = 33;
		} else {
			local17.anInt89 = 32;
		}
		local17.anInt88 = arg0;
		return local17;
	}
}
