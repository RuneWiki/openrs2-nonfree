import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
	public static int anInt3612;

	@OriginalMember(owner = "client!ln", name = "cb", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString106 = "wave2:";

	@OriginalMember(owner = "client!ln", name = "W", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!ln", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[5][5000];

	@OriginalMember(owner = "client!ln", name = "bb", descriptor = "Lclient!nf;")
	public static Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!ln", name = "db", descriptor = "Lclient!ok;")
	public static Class116 aClass116_9 = null;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
	public static void method2912() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (Static80.anInt1911 == 40) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2655();
			local22 = Static268.anInt5796 + (local14 >> 4 & 0x7);
			local28 = (local14 & 0x7) + Static261.anInt5718;
			local32 = Static222.aClass1_Sub16_Sub1_3.method2652();
			local36 = Static222.aClass1_Sub16_Sub1_3.method2652();
			local40 = Static222.aClass1_Sub16_Sub1_3.method2652();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				@Pc(62) Class131 local62 = Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local22][local28];
				if (local62 != null) {
					for (@Pc(71) Class1_Sub2_Sub7 local71 = (Class1_Sub2_Sub7) local62.method3791(); local71 != null; local71 = (Class1_Sub2_Sub7) local62.method3792()) {
						@Pc(77) Class25_Sub5 local77 = local71.aClass25_Sub5_1;
						if (local77.anInt5784 == (local32 & 0x7FFF) && local36 == local77.anInt5781) {
							local77.anInt5781 = local40;
							break;
						}
					}
					Static117.method1923(local28, local22);
				}
			}
			return;
		}
		@Pc(145) int local145;
		@Pc(159) int local159;
		@Pc(151) int local151;
		@Pc(169) int local169;
		@Pc(173) int local173;
		@Pc(177) int local177;
		if (Static80.anInt1911 == 104) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2650();
			local22 = Static222.aClass1_Sub16_Sub1_3.method2655();
			local28 = local22 >> 2;
			local32 = local22 & 0x3;
			@Pc(137) byte local137 = Static222.aClass1_Sub16_Sub1_3.method2654();
			@Pc(141) byte local141 = Static222.aClass1_Sub16_Sub1_3.method2633();
			local145 = Static222.aClass1_Sub16_Sub1_3.method2663();
			local151 = Static261.anInt5718 + (local145 & 0x7);
			local159 = (local145 >> 4 & 0x7) + Static268.anInt5796;
			@Pc(163) byte local163 = Static222.aClass1_Sub16_Sub1_3.method2641();
			local169 = Static222.aClass1_Sub16_Sub1_3.method2645();
			local173 = Static222.aClass1_Sub16_Sub1_3.method2650();
			local177 = Static222.aClass1_Sub16_Sub1_3.method2640();
			@Pc(181) byte local181 = Static222.aClass1_Sub16_Sub1_3.method2641();
			if (!Static296.aBoolean335) {
				Static133.method2291(local32, local169, local159, local163, local14, local177, local141, local173, local28, local151, local181, local137);
			}
		}
		if (Static80.anInt1911 == 60) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2613();
			local22 = Static222.aClass1_Sub16_Sub1_3.method2653();
			local28 = (local22 >> 4 & 0x7) + Static268.anInt5796;
			local32 = (local22 & 0x7) + Static261.anInt5718;
			local36 = Static222.aClass1_Sub16_Sub1_3.method2650();
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
				@Pc(250) Class25_Sub5 local250 = new Class25_Sub5();
				local250.anInt5781 = local14;
				local250.anInt5784 = local36;
				if (Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local28][local32] == null) {
					Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local28][local32] = new Class131();
				}
				Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local28][local32].method3799(new Class1_Sub2_Sub7(local250));
				Static117.method1923(local32, local28);
			}
		} else if (Static80.anInt1911 == 201) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2652();
			local22 = Static222.aClass1_Sub16_Sub1_3.method2655();
			Static268.method4511(local14).method676(local22);
		} else if (Static80.anInt1911 == 75) {
			local14 = Static222.aClass1_Sub16_Sub1_3.method2652();
			local22 = Static222.aClass1_Sub16_Sub1_3.method2652();
			local28 = Static222.aClass1_Sub16_Sub1_3.method2650();
			local32 = Static222.aClass1_Sub16_Sub1_3.method2663();
			local36 = Static268.anInt5796 + (local32 >> 4 & 0x7);
			local40 = (local32 & 0x7) + Static261.anInt5718;
			if (local36 >= 0 && local40 >= 0 && local36 < 104 && local40 < 104 && local14 != Static76.anInt5427) {
				@Pc(378) Class25_Sub5 local378 = new Class25_Sub5();
				local378.anInt5781 = local28;
				local378.anInt5784 = local22;
				if (Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local36][local40] == null) {
					Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local36][local40] = new Class131();
				}
				Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local36][local40].method3799(new Class1_Sub2_Sub7(local378));
				Static117.method1923(local40, local36);
			}
		} else {
			@Pc(490) int local490;
			@Pc(589) Class25_Sub7 local589;
			if (Static80.anInt1911 == 239) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local22 = Static268.anInt5796 + (local14 >> 4 & 0x7);
				local28 = Static261.anInt5718 + (local14 & 0x7);
				local32 = local22 + Static222.aClass1_Sub16_Sub1_3.method2633();
				local36 = Static222.aClass1_Sub16_Sub1_3.method2633() + local28;
				local40 = Static222.aClass1_Sub16_Sub1_3.method2645();
				local145 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local159 = Static222.aClass1_Sub16_Sub1_3.method2655() * 4;
				local151 = Static222.aClass1_Sub16_Sub1_3.method2655() * 4;
				local490 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local169 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local173 = Static222.aClass1_Sub16_Sub1_3.method2655();
				if (local173 == 255) {
					local173 = -1;
				}
				local177 = Static222.aClass1_Sub16_Sub1_3.method2655();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local145 != 65535) {
					local36 = local36 * 128 + 64;
					local28 = local28 * 128 + 64;
					local22 = local22 * 128 + 64;
					local589 = new Class25_Sub7(local145, Static145.anInt3477, local22, local28, Static220.method3905(local22, local28, Static145.anInt3477) - local159, Static32.anInt809 + local490, local169 + Static32.anInt809, local173, local177, local40, local151);
					local32 = local32 * 128 + 64;
					local589.method4778(Static220.method3905(local32, local36, Static145.anInt3477) - local151, local490 + Static32.anInt809, local36, local32);
					Static293.aClass131_28.method3799(new Class1_Sub2_Sub17(local589));
				}
			} else if (Static80.anInt1911 == 168) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2640();
				if (local14 == 65535) {
					local14 = -1;
				}
				local22 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local28 = Static268.anInt5796 + (local22 >> 4 & 0x7);
				local32 = Static261.anInt5718 + (local22 & 0x7);
				local36 = Static222.aClass1_Sub16_Sub1_3.method2649();
				local40 = local36 >> 2;
				local159 = Static208.anIntArray471[local40];
				local145 = local36 & 0x3;
				Static102.method1682(local32, local145, local14, Static145.anInt3477, local159, local40, local28);
			} else if (Static80.anInt1911 == 53) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local22 = (local14 >> 4 & 0xF) + Static268.anInt5796 * 2;
				local28 = (local14 & 0xF) + Static261.anInt5718 * 2;
				local32 = Static222.aClass1_Sub16_Sub1_3.method2633() + local22;
				local36 = Static222.aClass1_Sub16_Sub1_3.method2633() + local28;
				local40 = Static222.aClass1_Sub16_Sub1_3.method2645();
				local145 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local159 = Static222.aClass1_Sub16_Sub1_3.method2655() * 4;
				local151 = Static222.aClass1_Sub16_Sub1_3.method2655() * 4;
				local490 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local169 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local173 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local177 = Static222.aClass1_Sub16_Sub1_3.method2655();
				if (local173 == 255) {
					local173 = -1;
				}
				if (local22 >= 0 && local28 >= 0 && local22 < 208 && local28 < 208 && local32 >= 0 && local36 >= 0 && local32 < 208 && local36 < 208 && local145 != 65535) {
					local36 = local36 * 64;
					local28 = local28 * 64;
					local22 *= 64;
					local589 = new Class25_Sub7(local145, Static145.anInt3477, local22, local28, Static220.method3905(local22, local28, Static145.anInt3477) - local159, local490 - -Static32.anInt809, Static32.anInt809 + local169, local173, local177, local40, local151);
					local32 *= 64;
					local589.method4778(Static220.method3905(local32, local36, Static145.anInt3477) - local151, Static32.anInt809 + local490, local36, local32);
					Static293.aClass131_28.method3799(new Class1_Sub2_Sub17(local589));
				}
			} else if (Static80.anInt1911 == 99) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2653();
				local28 = local14 & 0x3;
				local22 = local14 >> 2;
				local32 = Static208.anIntArray471[local22];
				local36 = Static222.aClass1_Sub16_Sub1_3.method2663();
				local40 = (local36 >> 4 & 0x7) + Static268.anInt5796;
				local145 = Static261.anInt5718 + (local36 & 0x7);
				if (local40 >= 0 && local145 >= 0 && local40 < 104 && local145 < 104) {
					Static227.method3949(0, local40, local145, local22, Static145.anInt3477, -1, -1, local28, local32);
				}
			} else if (Static80.anInt1911 == 229) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local22 = Static222.aClass1_Sub16_Sub1_3.method2653();
				local32 = (local22 & 0x7) + Static261.anInt5718;
				local28 = Static268.anInt5796 + (local22 >> 4 & 0x7);
				if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
					@Pc(1005) Class131 local1005 = Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local28][local32];
					if (local1005 != null) {
						for (@Pc(1014) Class1_Sub2_Sub7 local1014 = (Class1_Sub2_Sub7) local1005.method3791(); local1014 != null; local1014 = (Class1_Sub2_Sub7) local1005.method3792()) {
							if ((local14 & 0x7FFF) == local1014.aClass25_Sub5_1.anInt5784) {
								local1014.method4742();
								break;
							}
						}
						if (local1005.method3791() == null) {
							Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local28][local32] = null;
						}
						Static117.method1923(local32, local28);
					}
				}
			} else if (Static80.anInt1911 == 165) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local22 = (local14 >> 4 & 0x7) + Static268.anInt5796;
				local28 = Static261.anInt5718 + (local14 & 0x7);
				local32 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local36 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local40 = Static222.aClass1_Sub16_Sub1_3.method2652();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					local28 = local28 * 128 + 64;
					local22 = local22 * 128 + 64;
					@Pc(1138) Class25_Sub6 local1138 = new Class25_Sub6(local32, Static145.anInt3477, local22, local28, Static220.method3905(local22, local28, Static145.anInt3477) - local36, local40, Static32.anInt809);
					Static244.aClass131_24.method3799(new Class1_Sub2_Sub22(local1138));
				}
			} else if (Static80.anInt1911 == 220) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local28 = (local14 & 0x7) + Static261.anInt5718;
				local22 = (local14 >> 4 & 0x7) + Static268.anInt5796;
				local32 = Static222.aClass1_Sub16_Sub1_3.method2652();
				if (local32 == 65535) {
					local32 = -1;
				}
				local36 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local40 = local36 >> 4 & 0xF;
				local159 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local145 = local36 & 0x7;
				local151 = Static222.aClass1_Sub16_Sub1_3.method2655();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					local490 = local40 + 1;
					if (local22 - local490 <= Static239.aClass25_Sub1_Sub1_2.anIntArray172[0] && Static239.aClass25_Sub1_Sub1_2.anIntArray172[0] <= local490 + local22 && Static239.aClass25_Sub1_Sub1_2.anIntArray173[0] >= local28 - local490 && Static239.aClass25_Sub1_Sub1_2.anIntArray173[0] <= local490 + local28 && Static210.anInt4682 != 0 && local145 > 0 && Static111.anInt2392 < 50 && local32 != -1) {
						Static128.anIntArray263[Static111.anInt2392] = local32;
						Static13.anIntArray22[Static111.anInt2392] = local145;
						Static116.anIntArray248[Static111.anInt2392] = local159;
						Static49.aClass118Array1[Static111.anInt2392] = null;
						Static222.anIntArray513[Static111.anInt2392] = local40 + (local28 << 8) + (local22 << 16);
						Static40.anIntArray202[Static111.anInt2392] = local151;
						Static111.anInt2392++;
					}
				}
			} else if (Static80.anInt1911 == 134) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local22 = (local14 >> 4 & 0xF) + Static268.anInt5796 * 2;
				local28 = Static261.anInt5718 * 2 + (local14 & 0xF);
				local32 = Static222.aClass1_Sub16_Sub1_3.method2633() + local22;
				local36 = Static222.aClass1_Sub16_Sub1_3.method2633() + local28;
				local40 = Static222.aClass1_Sub16_Sub1_3.method2645();
				local145 = Static222.aClass1_Sub16_Sub1_3.method2645();
				local159 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local151 = Static222.aClass1_Sub16_Sub1_3.method2633();
				local490 = Static222.aClass1_Sub16_Sub1_3.method2655() * 4;
				local169 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local173 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local177 = Static222.aClass1_Sub16_Sub1_3.method2655();
				@Pc(1403) int local1403 = Static222.aClass1_Sub16_Sub1_3.method2655();
				if (local177 == 255) {
					local177 = -1;
				}
				if (local22 >= 0 && local28 >= 0 && local22 < 208 && local28 < 208 && local32 >= 0 && local36 >= 0 && local32 < 208 && local36 < 208 && local159 != 65535) {
					local22 *= 64;
					local32 = local32 * 64;
					local28 = local28 * 64;
					if (local40 != 0) {
						@Pc(1487) int local1487;
						@Pc(1481) Class25_Sub1 local1481;
						@Pc(1473) int local1473;
						@Pc(1477) int local1477;
						if (local40 >= 0) {
							local1473 = local40 - 1;
							local1477 = local1473 & 0x7FF;
							local1481 = Static27.aClass25_Sub1_Sub2Array1[local1477];
							local1487 = local1473 >> 11 & 0xF;
						} else {
							local1473 = -local40 - 1;
							local1477 = local1473 & 0x7FF;
							local1487 = local1473 >> 11 & 0xF;
							if (Static76.anInt5427 == local1477) {
								local1481 = Static239.aClass25_Sub1_Sub1_2;
							} else {
								local1481 = Static271.aClass25_Sub1_Sub1Array1[local1477];
							}
						}
						if (local1481 != null) {
							@Pc(1522) Class124 local1522 = local1481.method1232();
							if (local1522.anIntArrayArray36 != null && local1522.anIntArrayArray36[local1487] != null) {
								local151 -= local1522.anIntArrayArray36[local1487][1];
								local1477 = local1522.anIntArrayArray36[local1487][0];
								@Pc(1556) int local1556 = local1522.anIntArrayArray36[local1487][2];
								@Pc(1561) int local1561 = Class91.anIntArray320[local1481.anInt1681];
								@Pc(1566) int local1566 = Class91.anIntArray319[local1481.anInt1681];
								@Pc(1576) int local1576 = local1477 * local1561 + local1566 * local1556 >> 16;
								@Pc(1587) int local1587 = local1561 * local1556 - local1566 * local1477 >> 16;
								local28 += local1587;
								local22 += local1576;
							}
						}
					}
					local36 = local36 * 64;
					@Pc(1630) Class25_Sub7 local1630 = new Class25_Sub7(local159, Static145.anInt3477, local22, local28, Static220.method3905(local22, local28, Static145.anInt3477) - local151, local169 - -Static32.anInt809, local173 + Static32.anInt809, local177, local1403, local145, local490);
					local1630.method4778(Static220.method3905(local32, local36, Static145.anInt3477) - local490, Static32.anInt809 + local169, local36, local32);
					Static293.aClass131_28.method3799(new Class1_Sub2_Sub17(local1630));
				}
			} else if (Static80.anInt1911 == 153) {
				local14 = Static222.aClass1_Sub16_Sub1_3.method2655();
				local28 = Static261.anInt5718 + (local14 & 0x7);
				local22 = (local14 >> 4 & 0x7) + Static268.anInt5796;
				local32 = Static222.aClass1_Sub16_Sub1_3.method2649();
				local40 = local32 & 0x3;
				local36 = local32 >> 2;
				local145 = Static208.anIntArray471[local36];
				local159 = Static222.aClass1_Sub16_Sub1_3.method2652();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					Static227.method3949(0, local22, local28, local36, Static145.anInt3477, -1, local159, local40, local145);
				}
			}
		}
	}
}
