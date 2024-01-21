import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ee", name = "Db", descriptor = "[Lclient!dd;")
	private static Class13[] aClass13Array10;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "Lclient!dd;")
	public static Class13 aClass13_461 = Static161.method2971("<img=0>");

	@OriginalMember(owner = "client!ee", name = "db", descriptor = "Lclient!dd;")
	private static Class13 aClass13_464 = Static161.method2971("Error connecting to server)3");

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "Lclient!dd;")
	public static Class13 aClass13_462 = aClass13_464;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)Z")
	public static boolean method1064() {
		@Pc(8) long local8 = Static169.method2888();
		@Pc(14) int local14 = (int) (local8 - Static136.aLong116);
		if (local14 > 200) {
			local14 = 200;
		}
		Static46.anInt1505 += local14;
		Static136.aLong116 = local8;
		if (Static110.anInt3013 == 0 && Static133.anInt3347 == 0 && Static94.anInt2744 == 0 && Static118.anInt3129 == 0) {
			return true;
		} else if (Static25.aClass62_2 == null) {
			return false;
		} else {
			try {
				if (Static46.anInt1505 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class1_Sub2_Sub12 local61;
				@Pc(66) Class1_Sub8 local66;
				while (Static133.anInt3347 < 20 && Static118.anInt3129 > 0) {
					local61 = (Class1_Sub2_Sub12) Static29.aClass45_5.method1982();
					local66 = new Class1_Sub8(4);
					local66.method1643(1);
					local66.method1620((int) local61.aLong158);
					Static25.aClass62_2.method2281(4, local66.aByteArray27);
					Static4.aClass45_1.method1981(local61, local61.aLong158);
					Static133.anInt3347++;
					Static118.anInt3129--;
				}
				while (Static110.anInt3013 < 20 && Static94.anInt2744 > 0) {
					local61 = (Class1_Sub2_Sub12) Static70.aClass79_1.method2673();
					local66 = new Class1_Sub8(4);
					local66.method1643(0);
					local66.method1620((int) local61.aLong158);
					Static25.aClass62_2.method2281(4, local66.aByteArray27);
					local61.method2789();
					Static8.aClass45_2.method1981(local61, local61.aLong158);
					Static110.anInt3013++;
					Static94.anInt2744--;
				}
				for (@Pc(169) int local169 = 0; local169 < 100; local169++) {
					@Pc(175) int local175 = Static25.aClass62_2.method2280();
					if (local175 < 0) {
						throw new IOException();
					}
					if (local175 == 0) {
						break;
					}
					@Pc(188) byte local188 = 0;
					Static46.anInt1505 = 0;
					if (Static129.aClass1_Sub2_Sub12_1 == null) {
						local188 = 8;
					} else if (Static59.anInt1837 == 0) {
						local188 = 1;
					}
					@Pc(213) int local213;
					@Pc(218) int local218;
					@Pc(254) int local254;
					@Pc(394) int local394;
					if (local188 <= 0) {
						local213 = Static24.aClass1_Sub8_2.aByteArray27.length - Static129.aClass1_Sub2_Sub12_1.aByte6;
						local218 = 512 - Static59.anInt1837;
						if (local218 > local213 - Static24.aClass1_Sub8_2.anInt2195) {
							local218 = local213 - Static24.aClass1_Sub8_2.anInt2195;
						}
						if (local175 < local218) {
							local218 = local175;
						}
						Static25.aClass62_2.method2279(local218, Static24.aClass1_Sub8_2.aByteArray27, Static24.aClass1_Sub8_2.anInt2195);
						if (Static39.aByte3 != 0) {
							for (local254 = 0; local254 < local218; local254++) {
								Static24.aClass1_Sub8_2.aByteArray27[Static24.aClass1_Sub8_2.anInt2195 + local254] ^= Static39.aByte3;
							}
						}
						Static24.aClass1_Sub8_2.anInt2195 += local218;
						Static59.anInt1837 += local218;
						if (local213 == Static24.aClass1_Sub8_2.anInt2195) {
							if (Static129.aClass1_Sub2_Sub12_1.aLong158 == 16711935L) {
								Static95.aClass1_Sub8_3 = Static24.aClass1_Sub8_2;
								for (local254 = 0; local254 < 256; local254++) {
									@Pc(381) Class4_Sub1 local381 = Static144.aClass4_Sub1Array1[local254];
									if (local381 != null) {
										Static95.aClass1_Sub8_3.anInt2195 = local254 * 8 + 5;
										local394 = Static95.aClass1_Sub8_3.method1626();
										@Pc(398) int local398 = Static95.aClass1_Sub8_3.method1626();
										local381.method2274(local394, local398);
									}
								}
							} else {
								Static121.aCRC32_1.reset();
								Static121.aCRC32_1.update(Static24.aClass1_Sub8_2.aByteArray27, 0, local213);
								local254 = (int) Static121.aCRC32_1.getValue();
								if (Static129.aClass1_Sub2_Sub12_1.anInt2971 != local254) {
									try {
										Static25.aClass62_2.method2277();
									} catch (@Pc(327) Exception local327) {
									}
									Static39.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									Static48.anInt1542++;
									Static25.aClass62_2 = null;
									return false;
								}
								Static30.anInt1095 = 0;
								Static48.anInt1542 = 0;
								Static129.aClass1_Sub2_Sub12_1.aClass4_Sub1_39.method2270(Static90.aBoolean193, (int) (Static129.aClass1_Sub2_Sub12_1.aLong158 & 0xFFFFL), (Static129.aClass1_Sub2_Sub12_1.aLong158 & 0xFF0000L) == 16711680L, Static24.aClass1_Sub8_2.aByteArray27);
							}
							Static129.aClass1_Sub2_Sub12_1.method3056();
							Static129.aClass1_Sub2_Sub12_1 = null;
							Static24.aClass1_Sub8_2 = null;
							if (Static90.aBoolean193) {
								Static133.anInt3347--;
							} else {
								Static110.anInt3013--;
							}
							Static59.anInt1837 = 0;
						} else {
							if (Static59.anInt1837 != 512) {
								break;
							}
							Static59.anInt1837 = 0;
						}
					} else {
						local213 = local188 - Static173.aClass1_Sub8_5.anInt2195;
						if (local213 > local175) {
							local213 = local175;
						}
						Static25.aClass62_2.method2279(local213, Static173.aClass1_Sub8_5.aByteArray27, Static173.aClass1_Sub8_5.anInt2195);
						if (Static39.aByte3 != 0) {
							for (local218 = 0; local218 < local213; local218++) {
								Static173.aClass1_Sub8_5.aByteArray27[Static173.aClass1_Sub8_5.anInt2195 + local218] ^= Static39.aByte3;
							}
						}
						Static173.aClass1_Sub8_5.anInt2195 += local213;
						if (local188 > Static173.aClass1_Sub8_5.anInt2195) {
							break;
						}
						if (Static129.aClass1_Sub2_Sub12_1 == null) {
							Static173.aClass1_Sub8_5.anInt2195 = 0;
							local218 = Static173.aClass1_Sub8_5.method1607();
							local254 = Static173.aClass1_Sub8_5.method1642();
							@Pc(521) int local521 = Static173.aClass1_Sub8_5.method1607();
							local394 = Static173.aClass1_Sub8_5.method1626();
							@Pc(532) long local532 = (long) (local254 + (local218 << 16));
							@Pc(538) Class1_Sub2_Sub12 local538 = (Class1_Sub2_Sub12) Static4.aClass45_1.method1988(local532);
							Static90.aBoolean193 = true;
							if (local538 == null) {
								local538 = (Class1_Sub2_Sub12) Static8.aClass45_2.method1988(local532);
								Static90.aBoolean193 = false;
							}
							if (local538 == null) {
								throw new IOException();
							}
							@Pc(562) int local562 = local521 == 0 ? 5 : 9;
							Static129.aClass1_Sub2_Sub12_1 = local538;
							Static24.aClass1_Sub8_2 = new Class1_Sub8(Static129.aClass1_Sub2_Sub12_1.aByte6 + local562 + local394);
							Static24.aClass1_Sub8_2.method1643(local521);
							Static24.aClass1_Sub8_2.method1635(local394);
							Static173.aClass1_Sub8_5.anInt2195 = 0;
							Static59.anInt1837 = 8;
						} else if (Static59.anInt1837 == 0) {
							if (Static173.aClass1_Sub8_5.aByteArray27[0] == -1) {
								Static59.anInt1837 = 1;
								Static173.aClass1_Sub8_5.anInt2195 = 0;
							} else {
								Static129.aClass1_Sub2_Sub12_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(615) IOException local615) {
				try {
					Static25.aClass62_2.method2277();
				} catch (@Pc(620) Exception local620) {
				}
				Static25.aClass62_2 = null;
				Static30.anInt1095++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLclient!vc;)V")
	public static void method1066(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub23 arg1) {
		@Pc(4) Object[] local4 = arg1.anObjectArray29;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(18) Class1_Sub2_Sub11 local18 = Static65.method1445(local14);
		if (local18 == null) {
			return;
		}
		Static117.anInt3115 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(38) byte local38 = -1;
		@Pc(41) int[] local41 = local18.anIntArray291;
		@Pc(44) int[] local44 = local18.anIntArray289;
		@Pc(58) int local58;
		@Pc(96) int local96;
		try {
			Static48.anIntArray161 = new int[local18.anInt2949];
			aClass13Array10 = new Class13[local18.anInt2953];
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			for (local58 = 1; local58 < local4.length; local58++) {
				if (local4[local58] instanceof Integer) {
					local96 = (Integer) local4[local58];
					if (local96 == -2147483647) {
						local96 = arg1.anInt4015;
					}
					if (local96 == -2147483646) {
						local96 = arg1.anInt4010;
					}
					if (local96 == -2147483645) {
						local96 = arg1.aClass20_13 == null ? -1 : arg1.aClass20_13.anInt1630;
					}
					if (local96 == -2147483644) {
						local96 = arg1.anInt4017;
					}
					if (local96 == -2147483643) {
						local96 = arg1.aClass20_13 == null ? -1 : arg1.aClass20_13.anInt1608;
					}
					if (local96 == -2147483642) {
						local96 = arg1.aClass20_14 == null ? -1 : arg1.aClass20_14.anInt1630;
					}
					if (local96 == -2147483641) {
						local96 = arg1.aClass20_14 == null ? -1 : arg1.aClass20_14.anInt1608;
					}
					if (local96 == -2147483640) {
						local96 = arg1.anInt4011;
					}
					if (local96 == -2147483639) {
						local96 = arg1.anInt4013;
					}
					Static48.anIntArray161[local54++] = local96;
				} else if (local4[local58] instanceof Class13) {
					@Pc(75) Class13 local75 = (Class13) local4[local58];
					if (local75.method889(Static160.aClass13_1302)) {
						local75 = arg1.aClass13_1386;
					}
					aClass13Array10[local56++] = local75;
				}
			}
			local96 = 0;
			label2234: while (true) {
				local96++;
				if (arg0 < local96) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(208) int local208 = local41[local29];
				@Pc(781) int local781;
				@Pc(776) int local776;
				@Pc(578) Class13 local578;
				@Pc(618) int local618;
				@Pc(643) int local643;
				if (local208 < 100) {
					if (local208 == 0) {
						Static2.anIntArray5[local25++] = local44[local29];
						continue;
					}
					@Pc(234) int local234;
					if (local208 == 1) {
						local234 = local44[local29];
						Static2.anIntArray5[local25++] = Static103.anIntArray266[local234];
						continue;
					}
					if (local208 == 2) {
						local234 = local44[local29];
						local25--;
						Static103.anIntArray266[local234] = Static2.anIntArray5[local25];
						continue;
					}
					if (local208 == 3) {
						Static112.aClass13Array22[local27++] = local18.aClass13Array20[local29];
						continue;
					}
					if (local208 == 6) {
						local29 += local44[local29];
						continue;
					}
					if (local208 == 7) {
						local25 -= 2;
						if (Static2.anIntArray5[local25] != Static2.anIntArray5[local25 + 1]) {
							local29 += local44[local29];
						}
						continue;
					}
					if (local208 == 8) {
						local25 -= 2;
						if (Static2.anIntArray5[local25] == Static2.anIntArray5[local25 + 1]) {
							local29 += local44[local29];
						}
						continue;
					}
					if (local208 == 9) {
						local25 -= 2;
						if (Static2.anIntArray5[local25 + 1] > Static2.anIntArray5[local25]) {
							local29 += local44[local29];
						}
						continue;
					}
					if (local208 == 10) {
						local25 -= 2;
						if (Static2.anIntArray5[local25] > Static2.anIntArray5[local25 + 1]) {
							local29 += local44[local29];
						}
						continue;
					}
					if (local208 == 21) {
						if (Static117.anInt3115 == 0) {
							return;
						}
						@Pc(397) Class54 local397 = Static44.aClass54Array1[--Static117.anInt3115];
						Static48.anIntArray161 = local397.anIntArray295;
						local29 = local397.anInt3018;
						aClass13Array10 = local397.aClass13Array21;
						local18 = local397.aClass1_Sub2_Sub11_1;
						local41 = local18.anIntArray291;
						local44 = local18.anIntArray289;
						continue;
					}
					if (local208 == 25) {
						local234 = local44[local29];
						Static2.anIntArray5[local25++] = Static108.method2112(local234);
						continue;
					}
					if (local208 == 27) {
						local234 = local44[local29];
						local25--;
						Static58.method1369(Static2.anIntArray5[local25], local234);
						continue;
					}
					if (local208 == 31) {
						local25 -= 2;
						if (Static2.anIntArray5[local25 + 1] >= Static2.anIntArray5[local25]) {
							local29 += local44[local29];
						}
						continue;
					}
					if (local208 == 32) {
						local25 -= 2;
						if (Static2.anIntArray5[local25] >= Static2.anIntArray5[local25 + 1]) {
							local29 += local44[local29];
						}
						continue;
					}
					if (local208 == 33) {
						Static2.anIntArray5[local25++] = Static48.anIntArray161[local44[local29]];
						continue;
					}
					@Pc(524) int local524;
					if (local208 == 34) {
						local524 = local44[local29];
						local25--;
						Static48.anIntArray161[local524] = Static2.anIntArray5[local25];
						continue;
					}
					if (local208 == 35) {
						Static112.aClass13Array22[local27++] = aClass13Array10[local44[local29]];
						continue;
					}
					if (local208 == 36) {
						local524 = local44[local29];
						local27--;
						aClass13Array10[local524] = Static112.aClass13Array22[local27];
						continue;
					}
					if (local208 == 37) {
						local234 = local44[local29];
						local27 -= local234;
						local578 = Static70.method1464(Static112.aClass13Array22, local234, local27);
						Static112.aClass13Array22[local27++] = local578;
						continue;
					}
					if (local208 == 38) {
						local25--;
						continue;
					}
					if (local208 == 39) {
						local27--;
						continue;
					}
					if (local208 == 40) {
						local234 = local44[local29];
						@Pc(608) Class1_Sub2_Sub11 local608 = Static65.method1445(local234);
						@Pc(612) int[] local612 = new int[local608.anInt2949];
						@Pc(616) Class13[] local616 = new Class13[local608.anInt2953];
						for (local618 = 0; local618 < local608.anInt2950; local618++) {
							local612[local618] = Static2.anIntArray5[local25 + local618 - local608.anInt2950];
						}
						for (local643 = 0; local643 < local608.anInt2948; local643++) {
							local616[local643] = Static112.aClass13Array22[local27 + local643 - local608.anInt2948];
						}
						local25 -= local608.anInt2950;
						local27 -= local608.anInt2948;
						@Pc(681) Class54 local681 = new Class54();
						local681.anIntArray295 = Static48.anIntArray161;
						local681.aClass13Array21 = aClass13Array10;
						local681.aClass1_Sub2_Sub11_1 = local18;
						local681.anInt3018 = local29;
						if (Static117.anInt3115 >= Static44.aClass54Array1.length) {
							throw new RuntimeException();
						}
						local18 = local608;
						Static44.aClass54Array1[Static117.anInt3115++] = local681;
						aClass13Array10 = local616;
						local41 = local608.anIntArray291;
						local44 = local608.anIntArray289;
						local29 = -1;
						Static48.anIntArray161 = local612;
						continue;
					}
					if (local208 == 42) {
						Static2.anIntArray5[local25++] = Static93.anIntArray258[local44[local29]];
						continue;
					}
					if (local208 == 43) {
						local524 = local44[local29];
						local25--;
						Static93.anIntArray258[local524] = Static2.anIntArray5[local25];
						continue;
					}
					if (local208 == 44) {
						local234 = local44[local29] >> 16;
						local776 = local44[local29] & 0xFFFF;
						local25--;
						local781 = Static2.anIntArray5[local25];
						if (local781 >= 0 && local781 <= 5000) {
							Static110.anIntArray294[local234] = local781;
							@Pc(798) byte local798 = -1;
							if (local776 == 105) {
								local798 = 0;
							}
							local618 = 0;
							while (true) {
								if (local618 >= local781) {
									continue label2234;
								}
								Static6.anIntArrayArray1[local234][local618] = local798;
								local618++;
							}
						}
						throw new RuntimeException();
					}
					if (local208 == 45) {
						local234 = local44[local29];
						local25--;
						local776 = Static2.anIntArray5[local25];
						if (local776 >= 0 && local776 < Static110.anIntArray294[local234]) {
							Static2.anIntArray5[local25++] = Static6.anIntArrayArray1[local234][local776];
							continue;
						}
						throw new RuntimeException();
					}
					if (local208 == 46) {
						local234 = local44[local29];
						local25 -= 2;
						local776 = Static2.anIntArray5[local25];
						if (local776 >= 0 && Static110.anIntArray294[local234] > local776) {
							Static6.anIntArrayArray1[local234][local776] = Static2.anIntArray5[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local208 == 47) {
						@Pc(918) Class13 local918 = Static96.aClass13Array19[local44[local29]];
						if (local918 == null) {
							local918 = Static122.aClass13_1064;
						}
						Static112.aClass13Array22[local27++] = local918;
						continue;
					}
					if (local208 == 48) {
						local524 = local44[local29];
						local27--;
						Static96.aClass13Array19[local524] = Static112.aClass13Array22[local27];
						continue;
					}
				}
				@Pc(954) boolean local954;
				if (local44[local29] == 1) {
					local954 = true;
				} else {
					local954 = false;
				}
				@Pc(1112) Class20 local1112;
				@Pc(983) int local983;
				@Pc(1018) int local1018;
				@Pc(993) Class20 local993;
				@Pc(1186) Class20 local1186;
				if (local208 < 300) {
					if (local208 == 100) {
						local25 -= 3;
						local781 = Static2.anIntArray5[local25 + 1];
						local776 = Static2.anIntArray5[local25];
						local983 = Static2.anIntArray5[local25 + 2];
						if (local781 == 0) {
							throw new RuntimeException();
						}
						local993 = Static119.method2230(local776);
						if (local993.aClass20Array1 == null) {
							local993.aClass20Array1 = new Class20[local983 + 1];
						}
						if (local983 >= local993.aClass20Array1.length) {
							@Pc(1016) Class20[] local1016 = new Class20[local983 + 1];
							for (local1018 = 0; local1018 < local993.aClass20Array1.length; local1018++) {
								local1016[local1018] = local993.aClass20Array1[local1018];
							}
							local993.aClass20Array1 = local1016;
						}
						if (local983 > 0 && local993.aClass20Array1[local983 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local983 - 1));
						}
						@Pc(1069) Class20 local1069 = new Class20();
						local1069.anInt1623 = local1069.anInt1630 = local993.anInt1630;
						local1069.anInt1619 = local781;
						local1069.aBoolean118 = true;
						local1069.anInt1608 = local983;
						local993.aClass20Array1[local983] = local1069;
						if (local954) {
							Static178.aClass20_12 = local1069;
						} else {
							Static63.aClass20_5 = local1069;
						}
						Static125.method2300(local993);
						continue;
					}
					@Pc(1134) Class20 local1134;
					if (local208 == 101) {
						local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
						if (local1112.anInt1608 == -1) {
							if (local954) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1134 = Static119.method2230(local1112.anInt1630);
						local1134.aClass20Array1[local1112.anInt1608] = null;
						Static125.method2300(local1134);
						continue;
					}
					if (local208 == 102) {
						local25--;
						local1112 = Static119.method2230(Static2.anIntArray5[local25]);
						local1112.aClass20Array1 = null;
						Static125.method2300(local1112);
						continue;
					}
					if (local208 == 200) {
						local25 -= 2;
						local776 = Static2.anIntArray5[local25];
						local781 = Static2.anIntArray5[local25 + 1];
						local1186 = Static15.method628(local776, local781);
						if (local1186 != null && local781 != -1) {
							Static2.anIntArray5[local25++] = 1;
							if (local954) {
								Static178.aClass20_12 = local1186;
							} else {
								Static63.aClass20_5 = local1186;
							}
							continue;
						}
						Static2.anIntArray5[local25++] = 0;
						continue;
					}
					if (local208 == 201) {
						local25--;
						local776 = Static2.anIntArray5[local25];
						local1134 = Static119.method2230(local776);
						if (local1134 == null) {
							Static2.anIntArray5[local25++] = 0;
						} else {
							Static2.anIntArray5[local25++] = 1;
							if (local954) {
								Static178.aClass20_12 = local1134;
							} else {
								Static63.aClass20_5 = local1134;
							}
						}
						continue;
					}
				} else if (local208 < 500) {
					if (local208 == 403) {
						local25 -= 2;
						local776 = Static2.anIntArray5[local25];
						if (local776 >= 7) {
							local776 -= 7;
						}
						local781 = Static2.anIntArray5[local25 + 1];
						Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2.method640(local776, local781);
						continue;
					}
					if (local208 == 404) {
						local25 -= 2;
						local776 = Static2.anIntArray5[local25];
						local781 = Static2.anIntArray5[local25 + 1];
						Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2.method632(local776, local781);
						continue;
					}
					if (local208 == 410) {
						local25--;
						@Pc(1321) boolean local1321 = Static2.anIntArray5[local25] != 0;
						Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2.method637(local1321);
						continue;
					}
				} else if (local208 >= 1000 && local208 < 1100 || local208 >= 2000 && local208 < 2100) {
					if (local208 < 2000) {
						local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
					} else {
						local208 -= 1000;
						local25--;
						local1112 = Static119.method2230(Static2.anIntArray5[local25]);
					}
					if (local208 == 1000) {
						local25 -= 2;
						local1112.anInt1613 = Static2.anIntArray5[local25];
						local1112.anInt1594 = Static2.anIntArray5[local25 + 1];
						Static125.method2300(local1112);
						continue;
					}
					if (local208 == 1001) {
						local25 -= 2;
						local1112.anInt1559 = Static2.anIntArray5[local25];
						local1112.anInt1603 = Static2.anIntArray5[local25 + 1];
						Static125.method2300(local1112);
						continue;
					}
					if (local208 == 1003) {
						local25--;
						@Pc(1424) boolean local1424 = Static2.anIntArray5[local25] == 1;
						if (local1424 != local1112.aBoolean124) {
							local1112.aBoolean124 = local1424;
							Static125.method2300(local1112);
						}
						continue;
					}
				} else {
					@Pc(2542) Class13 local2542;
					if (local208 >= 1100 && local208 < 1200 || local208 >= 2100 && local208 < 2200) {
						if (local208 >= 2000) {
							local208 -= 1000;
							local25--;
							local1112 = Static119.method2230(Static2.anIntArray5[local25]);
						} else {
							local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
						}
						if (local208 == 1100) {
							local25 -= 2;
							local1112.anInt1604 = Static2.anIntArray5[local25];
							if (local1112.anInt1604 > local1112.anInt1576 - local1112.anInt1559) {
								local1112.anInt1604 = local1112.anInt1576 - local1112.anInt1559;
							}
							if (local1112.anInt1604 < 0) {
								local1112.anInt1604 = 0;
							}
							local1112.anInt1592 = Static2.anIntArray5[local25 + 1];
							if (local1112.anInt1592 > local1112.anInt1563 - local1112.anInt1603) {
								local1112.anInt1592 = local1112.anInt1563 - local1112.anInt1603;
							}
							if (local1112.anInt1592 < 0) {
								local1112.anInt1592 = 0;
							}
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1101) {
							local25--;
							local1112.anInt1579 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1102) {
							local25--;
							local1112.aBoolean126 = Static2.anIntArray5[local25] == 1;
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1103) {
							local25--;
							local1112.anInt1552 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1104) {
							local25--;
							local1112.anInt1597 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1105) {
							local25--;
							local1112.anInt1571 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1106) {
							local25--;
							local1112.anInt1577 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1107) {
							local25--;
							local1112.aBoolean122 = Static2.anIntArray5[local25] == 1;
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1108) {
							local1112.anInt1595 = 1;
							local25--;
							local1112.anInt1556 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1109) {
							local25 -= 6;
							local1112.anInt1583 = Static2.anIntArray5[local25];
							local1112.anInt1590 = Static2.anIntArray5[local25 + 1];
							local1112.anInt1589 = Static2.anIntArray5[local25 + 2];
							local1112.anInt1600 = Static2.anIntArray5[local25 + 3];
							local1112.anInt1606 = Static2.anIntArray5[local25 + 4];
							local1112.anInt1560 = Static2.anIntArray5[local25 + 5];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1110) {
							local25--;
							local781 = Static2.anIntArray5[local25];
							if (local781 != local1112.anInt1588) {
								local1112.anInt1553 = 0;
								local1112.anInt1588 = local781;
								local1112.anInt1580 = 0;
								Static125.method2300(local1112);
							}
							continue;
						}
						if (local208 == 1111) {
							local25--;
							local1112.aBoolean117 = Static2.anIntArray5[local25] == 1;
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1112) {
							local27--;
							local2542 = Static112.aClass13Array22[local27];
							if (!local2542.method889(local1112.aClass13_544)) {
								local1112.aClass13_544 = local2542;
								Static125.method2300(local1112);
							}
							continue;
						}
						if (local208 == 1113) {
							local25--;
							local1112.anInt1567 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1114) {
							local25 -= 3;
							local1112.anInt1612 = Static2.anIntArray5[local25];
							local1112.anInt1581 = Static2.anIntArray5[local25 + 1];
							local1112.anInt1628 = Static2.anIntArray5[local25 + 2];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1115) {
							local25--;
							local1112.aBoolean121 = Static2.anIntArray5[local25] == 1;
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1116) {
							local25--;
							local1112.anInt1566 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1117) {
							local25--;
							local1112.anInt1555 = Static2.anIntArray5[local25];
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1118) {
							local25--;
							local1112.aBoolean123 = Static2.anIntArray5[local25] == 1;
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1119) {
							local25--;
							local1112.aBoolean115 = Static2.anIntArray5[local25] == 1;
							Static125.method2300(local1112);
							continue;
						}
						if (local208 == 1120) {
							local25 -= 2;
							local1112.anInt1576 = Static2.anIntArray5[local25];
							local1112.anInt1563 = Static2.anIntArray5[local25 + 1];
							Static125.method2300(local1112);
							continue;
						}
					} else if (local208 >= 1200 && local208 < 1300 || !(local208 < 2200 || local208 >= 2300)) {
						if (local208 >= 2000) {
							local208 -= 1000;
							local25--;
							local1112 = Static119.method2230(Static2.anIntArray5[local25]);
						} else {
							local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
						}
						Static125.method2300(local1112);
						if (local208 == 1200) {
							local25 -= 2;
							local781 = Static2.anIntArray5[local25];
							local983 = Static2.anIntArray5[local25 + 1];
							if (local781 == -1) {
								local1112.anInt1595 = 1;
								local1112.anInt1564 = -1;
								local1112.anInt1556 = -1;
							} else {
								local1112.anInt1564 = local781;
								local1112.anInt1562 = local983;
								@Pc(1534) Class1_Sub2_Sub6 local1534 = Static184.method2994(local781);
								local1112.anInt1560 = local1534.anInt1322;
								local1112.anInt1590 = local1534.anInt1305;
								if (local1112.anInt1559 > 0) {
									local1112.anInt1560 = local1112.anInt1560 * 32 / local1112.anInt1559;
								}
								local1112.anInt1606 = local1534.anInt1288;
								local1112.anInt1583 = local1534.anInt1291;
								local1112.anInt1589 = local1534.anInt1326;
								local1112.anInt1600 = local1534.anInt1299;
							}
							continue;
						}
						if (local208 == 1201) {
							local1112.anInt1595 = 2;
							local25--;
							local1112.anInt1556 = Static2.anIntArray5[local25];
							continue;
						}
						if (local208 == 1202) {
							local1112.anInt1595 = 3;
							local1112.anInt1556 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2.method639();
							continue;
						}
						if (local208 == 1203) {
							local1112.anInt1595 = 6;
							local25--;
							local1112.anInt1556 = Static2.anIntArray5[local25];
							continue;
						}
						if (local208 == 1204) {
							local1112.anInt1595 = 5;
							local25--;
							local1112.anInt1556 = Static2.anIntArray5[local25];
							continue;
						}
					} else if (local208 >= 1300 && local208 < 1400 || local208 >= 2300 && local208 < 2400) {
						if (local208 < 2000) {
							local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
						} else {
							local25--;
							local1112 = Static119.method2230(Static2.anIntArray5[local25]);
							local208 -= 1000;
						}
						if (local208 == 1300) {
							local25--;
							local781 = Static2.anIntArray5[local25] - 1;
							if (local781 >= 0 && local781 <= 9) {
								local27--;
								local1112.method1230(local781, Static112.aClass13Array22[local27]);
								continue;
							}
							local27--;
							continue;
						}
						if (local208 == 1301) {
							local25 -= 2;
							local781 = Static2.anIntArray5[local25];
							local983 = Static2.anIntArray5[local25 + 1];
							local1112.aClass20_4 = Static15.method628(local781, local983);
							continue;
						}
						if (local208 == 1302) {
							local25--;
							local1112.aBoolean116 = Static2.anIntArray5[local25] == 1;
							continue;
						}
						if (local208 == 1303) {
							local25--;
							local1112.anInt1574 = Static2.anIntArray5[local25];
							continue;
						}
						if (local208 == 1304) {
							local25--;
							local1112.anInt1596 = Static2.anIntArray5[local25];
							continue;
						}
						if (local208 == 1305) {
							local27--;
							local1112.aClass13_540 = Static112.aClass13Array22[local27];
							continue;
						}
						if (local208 == 1306) {
							local27--;
							local1112.aClass13_548 = Static112.aClass13Array22[local27];
							continue;
						}
						if (local208 == 1307) {
							local1112.aClass13Array12 = null;
							continue;
						}
					} else {
						if (local208 >= 1400 && local208 < 1500 || local208 >= 2400 && local208 < 2500) {
							if (local208 < 2000) {
								local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
							} else {
								local25--;
								local1112 = Static119.method2230(Static2.anIntArray5[local25]);
								local208 -= 1000;
							}
							local27--;
							local2542 = Static112.aClass13Array22[local27];
							@Pc(7014) int[] local7014 = null;
							if (local2542.method904() > 0 && local2542.method898(local2542.method904() - 1) == 89) {
								local25--;
								local618 = Static2.anIntArray5[local25];
								if (local618 > 0) {
									local7014 = new int[local618];
									while (local618-- > 0) {
										local25--;
										local7014[local618] = Static2.anIntArray5[local25];
									}
								}
								local2542 = local2542.method883(0, local2542.method904() - 1);
							}
							@Pc(7075) Object[] local7075 = new Object[local2542.method904() + 1];
							for (local643 = local7075.length - 1; local643 >= 1; local643--) {
								if (local2542.method898(local643 - 1) == 115) {
									local27--;
									local7075[local643] = Static112.aClass13Array22[local27];
								} else {
									local25--;
									local7075[local643] = Integer.valueOf(Static2.anIntArray5[local25]);
								}
							}
							local25--;
							local1018 = Static2.anIntArray5[local25];
							if (local1018 == -1) {
								local7075 = null;
							} else {
								local7075[0] = Integer.valueOf(local1018);
							}
							if (local208 == 1417) {
								local1112.anObjectArray18 = local7075;
							}
							if (local208 == 1415) {
								local1112.anIntArray170 = local7014;
								local1112.anObjectArray5 = local7075;
							}
							if (local208 == 1425) {
								local1112.anObjectArray24 = local7075;
							}
							if (local208 == 1406) {
								local1112.anObjectArray16 = local7075;
							}
							if (local208 == 1420) {
								local1112.anObjectArray27 = local7075;
							}
							if (local208 == 1402) {
								local1112.anObjectArray6 = local7075;
							}
							if (local208 == 1403) {
								local1112.anObjectArray23 = local7075;
							}
							if (local208 == 1409) {
								local1112.anObjectArray19 = local7075;
							}
							if (local208 == 1422) {
								local1112.anObjectArray3 = local7075;
							}
							if (local208 == 1405) {
								local1112.anObjectArray7 = local7075;
							}
							if (local208 == 1424) {
								local1112.anObjectArray11 = local7075;
							}
							if (local208 == 1400) {
								local1112.anObjectArray20 = local7075;
							}
							local1112.aBoolean119 = true;
							if (local208 == 1418) {
								local1112.anObjectArray17 = local7075;
							}
							if (local208 == 1412) {
								local1112.anObjectArray26 = local7075;
							}
							if (local208 == 1421) {
								local1112.anObjectArray15 = local7075;
							}
							if (local208 == 1419) {
								local1112.anObjectArray10 = local7075;
							}
							if (local208 == 1414) {
								local1112.anIntArray171 = local7014;
								local1112.anObjectArray21 = local7075;
							}
							if (local208 == 1404) {
								local1112.anObjectArray9 = local7075;
							}
							if (local208 == 1416) {
								local1112.anObjectArray13 = local7075;
							}
							if (local208 == 1410) {
								local1112.anObjectArray12 = local7075;
							}
							if (local208 == 1411) {
								local1112.anObjectArray22 = local7075;
							}
							if (local208 == 1423) {
								local1112.anObjectArray14 = local7075;
							}
							if (local208 == 1407) {
								local1112.anIntArray165 = local7014;
								local1112.anObjectArray4 = local7075;
							}
							if (local208 == 1401) {
								local1112.anObjectArray8 = local7075;
							}
							if (local208 == 1408) {
								local1112.anObjectArray25 = local7075;
							}
							continue;
						}
						if (local208 < 1600) {
							local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
							if (local208 == 1500) {
								Static2.anIntArray5[local25++] = local1112.anInt1613;
								continue;
							}
							if (local208 == 1501) {
								Static2.anIntArray5[local25++] = local1112.anInt1594;
								continue;
							}
							if (local208 == 1502) {
								Static2.anIntArray5[local25++] = local1112.anInt1559;
								continue;
							}
							if (local208 == 1503) {
								Static2.anIntArray5[local25++] = local1112.anInt1603;
								continue;
							}
							if (local208 == 1504) {
								Static2.anIntArray5[local25++] = local1112.aBoolean124 ? 1 : 0;
								continue;
							}
							if (local208 == 1505) {
								Static2.anIntArray5[local25++] = local1112.anInt1623;
								continue;
							}
						} else if (local208 < 1700) {
							local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
							if (local208 == 1600) {
								Static2.anIntArray5[local25++] = local1112.anInt1604;
								continue;
							}
							if (local208 == 1601) {
								Static2.anIntArray5[local25++] = local1112.anInt1592;
								continue;
							}
							if (local208 == 1602) {
								Static112.aClass13Array22[local27++] = local1112.aClass13_544;
								continue;
							}
							if (local208 == 1603) {
								Static2.anIntArray5[local25++] = local1112.anInt1576;
								continue;
							}
							if (local208 == 1604) {
								Static2.anIntArray5[local25++] = local1112.anInt1563;
								continue;
							}
							if (local208 == 1605) {
								Static2.anIntArray5[local25++] = local1112.anInt1560;
								continue;
							}
							if (local208 == 1606) {
								Static2.anIntArray5[local25++] = local1112.anInt1589;
								continue;
							}
							if (local208 == 1607) {
								Static2.anIntArray5[local25++] = local1112.anInt1606;
								continue;
							}
							if (local208 == 1608) {
								Static2.anIntArray5[local25++] = local1112.anInt1600;
								continue;
							}
							if (local208 == 1609) {
								Static2.anIntArray5[local25++] = local1112.anInt1552;
								continue;
							}
						} else if (local208 < 1800) {
							local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
							if (local208 == 1700) {
								Static2.anIntArray5[local25++] = local1112.anInt1564;
								continue;
							}
							if (local208 == 1701) {
								if (local1112.anInt1564 == -1) {
									Static2.anIntArray5[local25++] = 0;
								} else {
									Static2.anIntArray5[local25++] = local1112.anInt1562;
								}
								continue;
							}
							if (local208 == 1702) {
								Static2.anIntArray5[local25++] = local1112.anInt1608;
								continue;
							}
						} else if (local208 < 1900) {
							local1112 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
							if (local208 == 1800) {
								Static2.anIntArray5[local25++] = Static54.method1315(Static53.method1292(local1112));
								continue;
							}
							if (local208 == 1801) {
								local25--;
								local781 = Static2.anIntArray5[local25];
								local781--;
								if (local1112.aClass13Array12 != null && local1112.aClass13Array12.length > local781 && local1112.aClass13Array12[local781] != null) {
									Static112.aClass13Array22[local27++] = local1112.aClass13Array12[local781];
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 1802) {
								if (local1112.aClass13_540 == null) {
									Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								} else {
									Static112.aClass13Array22[local27++] = local1112.aClass13_540;
								}
								continue;
							}
						} else if (local208 < 2600) {
							local25--;
							local1112 = Static119.method2230(Static2.anIntArray5[local25]);
							if (local208 == 2500) {
								Static2.anIntArray5[local25++] = local1112.anInt1613;
								continue;
							}
							if (local208 == 2501) {
								Static2.anIntArray5[local25++] = local1112.anInt1594;
								continue;
							}
							if (local208 == 2502) {
								Static2.anIntArray5[local25++] = local1112.anInt1559;
								continue;
							}
							if (local208 == 2503) {
								Static2.anIntArray5[local25++] = local1112.anInt1603;
								continue;
							}
							if (local208 == 2504) {
								Static2.anIntArray5[local25++] = local1112.aBoolean124 ? 1 : 0;
								continue;
							}
							if (local208 == 2505) {
								Static2.anIntArray5[local25++] = local1112.anInt1623;
								continue;
							}
						} else if (local208 < 2700) {
							local25--;
							local1112 = Static119.method2230(Static2.anIntArray5[local25]);
							if (local208 == 2600) {
								Static2.anIntArray5[local25++] = local1112.anInt1604;
								continue;
							}
							if (local208 == 2601) {
								Static2.anIntArray5[local25++] = local1112.anInt1592;
								continue;
							}
							if (local208 == 2602) {
								Static112.aClass13Array22[local27++] = local1112.aClass13_544;
								continue;
							}
							if (local208 == 2603) {
								Static2.anIntArray5[local25++] = local1112.anInt1576;
								continue;
							}
							if (local208 == 2604) {
								Static2.anIntArray5[local25++] = local1112.anInt1563;
								continue;
							}
							if (local208 == 2605) {
								Static2.anIntArray5[local25++] = local1112.anInt1560;
								continue;
							}
							if (local208 == 2606) {
								Static2.anIntArray5[local25++] = local1112.anInt1589;
								continue;
							}
							if (local208 == 2607) {
								Static2.anIntArray5[local25++] = local1112.anInt1606;
								continue;
							}
							if (local208 == 2608) {
								Static2.anIntArray5[local25++] = local1112.anInt1600;
								continue;
							}
							if (local208 == 2609) {
								Static2.anIntArray5[local25++] = local1112.anInt1552;
								continue;
							}
						} else if (local208 < 2800) {
							if (local208 == 2700) {
								local25--;
								local1112 = Static119.method2230(Static2.anIntArray5[local25]);
								Static2.anIntArray5[local25++] = local1112.anInt1564;
								continue;
							}
							if (local208 == 2701) {
								local25--;
								local1112 = Static119.method2230(Static2.anIntArray5[local25]);
								if (local1112.anInt1564 == -1) {
									Static2.anIntArray5[local25++] = 0;
								} else {
									Static2.anIntArray5[local25++] = local1112.anInt1562;
								}
								continue;
							}
							if (local208 == 2702) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								@Pc(2106) Class1_Sub22 local2106 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local776);
								if (local2106 == null) {
									Static2.anIntArray5[local25++] = 0;
								} else {
									Static2.anIntArray5[local25++] = 1;
								}
								continue;
							}
							if (local208 == 2703) {
								local25--;
								local1112 = Static119.method2230(Static2.anIntArray5[local25]);
								if (local1112.aClass20Array1 == null) {
									Static2.anIntArray5[local25++] = 0;
									continue;
								}
								local781 = local1112.aClass20Array1.length;
								for (local983 = 0; local983 < local1112.aClass20Array1.length; local983++) {
									if (local1112.aClass20Array1[local983] == null) {
										local781 = local983;
										break;
									}
								}
								Static2.anIntArray5[local25++] = local781;
								continue;
							}
							if (local208 == 2704 || local208 == 2705) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								@Pc(2200) Class1_Sub22 local2200 = (Class1_Sub22) Static18.aClass45_3.method1988((long) local776);
								if (local2200 != null && local781 == local2200.anInt3978) {
									Static2.anIntArray5[local25++] = 1;
									continue;
								}
								Static2.anIntArray5[local25++] = 0;
								continue;
							}
						} else if (local208 < 2900) {
							local25--;
							local1112 = Static119.method2230(Static2.anIntArray5[local25]);
							if (local208 == 2800) {
								Static2.anIntArray5[local25++] = Static54.method1315(Static53.method1292(local1112));
								continue;
							}
							if (local208 == 2801) {
								local25--;
								local781 = Static2.anIntArray5[local25];
								local781--;
								if (local1112.aClass13Array12 != null && local1112.aClass13Array12.length > local781 && local1112.aClass13Array12[local781] != null) {
									Static112.aClass13Array22[local27++] = local1112.aClass13Array12[local781];
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 2802) {
								if (local1112.aClass13_540 == null) {
									Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								} else {
									Static112.aClass13Array22[local27++] = local1112.aClass13_540;
								}
								continue;
							}
						} else if (local208 < 3200) {
							if (local208 == 3100) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static169.method2887(Static87.aClass13_820, local578, 0);
								continue;
							}
							if (local208 == 3101) {
								local25 -= 2;
								Static97.method3061(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1, Static2.anIntArray5[local25 + 1], Static2.anIntArray5[local25]);
								continue;
							}
							if (local208 == 3103) {
								Static109.method2126();
								continue;
							}
							if (local208 == 3104) {
								local781 = 0;
								local27--;
								local578 = Static112.aClass13Array22[local27];
								if (local578.method905()) {
									local781 = local578.method887();
								}
								Static1.aClass1_Sub8_Sub1_1.method1654(43);
								Static1.aClass1_Sub8_Sub1_1.method1635(local781);
								continue;
							}
							if (local208 == 3105) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static1.aClass1_Sub8_Sub1_1.method1654(76);
								Static1.aClass1_Sub8_Sub1_1.method1625(local578.method878());
								continue;
							}
							if (local208 == 3106) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static1.aClass1_Sub8_Sub1_1.method1654(192);
								Static1.aClass1_Sub8_Sub1_1.method1643(local578.method904() + 1);
								Static1.aClass1_Sub8_Sub1_1.method1639(local578);
								continue;
							}
							if (local208 == 3107) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local27--;
								local2542 = Static112.aClass13Array22[local27];
								Static23.method850(local776, local2542);
								continue;
							}
							if (local208 == 3108) {
								local25 -= 3;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								local983 = Static2.anIntArray5[local25 + 2];
								local993 = Static119.method2230(local983);
								Static140.method2509(local781, local776, local993);
								continue;
							}
							if (local208 == 3109) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								local1186 = local954 ? Static178.aClass20_12 : Static63.aClass20_5;
								Static140.method2509(local781, local776, local1186);
								continue;
							}
							if (local208 == 3110) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static1.aClass1_Sub8_Sub1_1.method1654(144);
								Static1.aClass1_Sub8_Sub1_1.method1650(local776);
								continue;
							}
						} else if (local208 < 3300) {
							if (local208 == 3200) {
								local25 -= 3;
								Static149.method2600(Static2.anIntArray5[local25 + 1], Static2.anIntArray5[local25], Static2.anIntArray5[local25 + 2]);
								continue;
							}
							if (local208 == 3201) {
								local25--;
								Static122.method2275(Static2.anIntArray5[local25]);
								continue;
							}
							if (local208 == 3202) {
								local25 -= 2;
								Static106.method2063(Static2.anIntArray5[local25 + 1], Static2.anIntArray5[local25]);
								continue;
							}
						} else if (local208 < 3400) {
							if (local208 == 3300) {
								Static2.anIntArray5[local25++] = Static78.anInt2168;
								continue;
							}
							if (local208 == 3301) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = Static56.method1342(local781, local776);
								continue;
							}
							if (local208 == 3302) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static47.method2336(local781, local776);
								continue;
							}
							if (local208 == 3303) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static61.method1412(local776, local781);
								continue;
							}
							if (local208 == 3304) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static42.method1120(local776).anInt3414;
								continue;
							}
							if (local208 == 3305) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static141.anIntArray337[local776];
								continue;
							}
							if (local208 == 3306) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static117.anIntArray299[local776];
								continue;
							}
							if (local208 == 3307) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static153.anIntArray365[local776];
								continue;
							}
							if (local208 == 3308) {
								local776 = Static156.anInt3696;
								local781 = (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 >> 7) + Static153.anInt3629;
								local983 = Static60.anInt1864 + (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 >> 7);
								Static2.anIntArray5[local25++] = local983 + (local776 << 28) + (local781 << 14);
								continue;
							}
							if (local208 == 3309) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = local776 >> 14 & 0x3FFF;
								continue;
							}
							if (local208 == 3310) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = local776 >> 28;
								continue;
							}
							if (local208 == 3311) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = local776 & 0x3FFF;
								continue;
							}
							if (local208 == 3312) {
								Static2.anIntArray5[local25++] = Static18.aBoolean52 ? 1 : 0;
								continue;
							}
							if (local208 == 3313) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25] + 32768;
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = Static56.method1342(local781, local776);
								continue;
							}
							if (local208 == 3314) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25] + 32768;
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = Static47.method2336(local781, local776);
								continue;
							}
							if (local208 == 3315) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25] + 32768;
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = Static61.method1412(local776, local781);
								continue;
							}
							if (local208 == 3316) {
								if (Static23.anInt1009 >= 2) {
									Static2.anIntArray5[local25++] = Static23.anInt1009;
								} else {
									Static2.anIntArray5[local25++] = 0;
								}
								continue;
							}
							if (local208 == 3317) {
								Static2.anIntArray5[local25++] = Static16.anInt689;
								continue;
							}
							if (local208 == 3318) {
								Static2.anIntArray5[local25++] = Static89.anInt2510;
								continue;
							}
							if (local208 == 3321) {
								Static2.anIntArray5[local25++] = Static103.anInt2871;
								continue;
							}
							if (local208 == 3322) {
								Static2.anIntArray5[local25++] = Static20.anInt773;
								continue;
							}
							if (local208 == 3323) {
								if (Static23.anInt1009 == 1) {
									Static2.anIntArray5[local25++] = 1;
								} else {
									Static2.anIntArray5[local25++] = 0;
								}
								continue;
							}
							if (local208 == 3324) {
								if (Static154.anInt3674 >= 5 && Static154.anInt3674 <= 9) {
									Static2.anIntArray5[local25++] = Static154.anInt3674;
									continue;
								}
								Static2.anIntArray5[local25++] = 0;
								continue;
							}
							if (local208 == 3325) {
								if (Static14.anInt485 <= 0) {
									Static2.anIntArray5[local25++] = 0;
								} else {
									Static2.anIntArray5[local25++] = 1;
								}
								continue;
							}
							if (local208 == 3326) {
								Static2.anIntArray5[local25++] = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2615;
								continue;
							}
							if (local208 == 3327) {
								Static2.anIntArray5[local25++] = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2.aBoolean50 ? 1 : 0;
								continue;
							}
						} else if (local208 < 3500) {
							if (local208 == 3400) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								@Pc(2313) Class1_Sub2_Sub10 local2313 = Static29.method872(local776);
								Static112.aClass13Array22[local27++] = local2313.method2034(local781);
								continue;
							}
							if (local208 == 3408) {
								local25 -= 4;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								local618 = Static2.anIntArray5[local25 + 3];
								local983 = Static2.anIntArray5[local25 + 2];
								@Pc(2353) Class1_Sub2_Sub10 local2353 = Static29.method872(local983);
								if (local776 == local2353.anInt2847 && local781 == local2353.anInt2845) {
									if (local781 == 115) {
										Static112.aClass13Array22[local27++] = local2353.method2034(local618);
									} else {
										Static2.anIntArray5[local25++] = local2353.method2032(local618);
									}
									continue;
								}
								if (local781 == 115) {
									Static112.aClass13Array22[local27++] = Static122.aClass13_1064;
								} else {
									Static2.anIntArray5[local25++] = 0;
								}
								continue;
							}
						} else if (local208 < 3700) {
							if (local208 == 3600) {
								if (Static84.anInt2393 == 0) {
									Static2.anIntArray5[local25++] = -2;
								} else if (Static84.anInt2393 == 1) {
									Static2.anIntArray5[local25++] = -1;
								} else {
									Static2.anIntArray5[local25++] = Static21.anInt784;
								}
								continue;
							}
							if (local208 == 3601) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static84.anInt2393 == 2 && Static21.anInt784 > local776) {
									Static112.aClass13Array22[local27++] = Static34.aClass13Array7[local776];
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 3602) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static84.anInt2393 == 2 && local776 < Static21.anInt784) {
									Static2.anIntArray5[local25++] = Static162.anIntArray427[local776];
									continue;
								}
								Static2.anIntArray5[local25++] = 0;
								continue;
							}
							if (local208 == 3603) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static84.anInt2393 == 2 && local776 < Static21.anInt784) {
									Static2.anIntArray5[local25++] = Static39.anIntArray133[local776];
									continue;
								}
								Static2.anIntArray5[local25++] = 0;
								continue;
							}
							if (local208 == 3604) {
								local25--;
								local781 = Static2.anIntArray5[local25];
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static109.method2129(local781, local578);
								continue;
							}
							if (local208 == 3605) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static148.method2596(local578.method878());
								continue;
							}
							if (local208 == 3606) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static135.method2422(local578.method878());
								continue;
							}
							if (local208 == 3607) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static60.method1402(local578.method878());
								continue;
							}
							if (local208 == 3608) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static144.method2551(local578.method878());
								continue;
							}
							if (local208 == 3609) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								if (local578.method892(Static28.aClass13_332) || local578.method892(Static38.aClass13_431)) {
									local578 = local578.method901(7);
								}
								Static2.anIntArray5[local25++] = Static3.method72(local578) ? 1 : 0;
								continue;
							}
							if (local208 == 3610) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static84.anInt2393 == 2 && Static21.anInt784 > local776) {
									Static112.aClass13Array22[local27++] = Static60.aClass13Array16[local776];
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 3611) {
								if (Static10.aClass13_169 == null) {
									Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								} else {
									Static112.aClass13Array22[local27++] = Static10.aClass13_169.method903();
								}
								continue;
							}
							if (local208 == 3612) {
								if (Static10.aClass13_169 == null) {
									Static2.anIntArray5[local25++] = 0;
								} else {
									Static2.anIntArray5[local25++] = Static11.anInt411;
								}
								continue;
							}
							if (local208 == 3613) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static10.aClass13_169 != null && local776 < Static11.anInt411) {
									Static112.aClass13Array22[local27++] = Static156.aClass1_Sub11Array1[local776].aClass13_767.method903();
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 3614) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static10.aClass13_169 != null && Static11.anInt411 > local776) {
									Static2.anIntArray5[local25++] = Static156.aClass1_Sub11Array1[local776].anInt2318;
									continue;
								}
								Static2.anIntArray5[local25++] = 0;
								continue;
							}
							if (local208 == 3615) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static10.aClass13_169 != null && local776 < Static11.anInt411) {
									Static2.anIntArray5[local25++] = Static156.aClass1_Sub11Array1[local776].aByte5;
									continue;
								}
								Static2.anIntArray5[local25++] = 0;
								continue;
							}
							if (local208 == 3616) {
								Static2.anIntArray5[local25++] = Static134.aByte8;
								continue;
							}
							if (local208 == 3617) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static112.method2182(local578);
								continue;
							}
							if (local208 == 3618) {
								Static2.anIntArray5[local25++] = Static20.aByte2;
								continue;
							}
							if (local208 == 3619) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static145.method2571(local578.method878());
								continue;
							}
							if (local208 == 3620) {
								Static116.method2219();
								continue;
							}
							if (local208 == 3621) {
								if (Static84.anInt2393 == 0) {
									Static2.anIntArray5[local25++] = -1;
								} else {
									Static2.anIntArray5[local25++] = Static124.anInt3220;
								}
								continue;
							}
							if (local208 == 3622) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static84.anInt2393 != 0 && local776 < Static124.anInt3220) {
									Static112.aClass13Array22[local27++] = Static43.method1141(Static5.aLongArray1[local776]).method903();
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 3623) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								if (local578.method892(Static28.aClass13_332) || local578.method892(Static38.aClass13_431)) {
									local578 = local578.method901(7);
								}
								Static2.anIntArray5[local25++] = Static37.method990(local578) ? 1 : 0;
								continue;
							}
							if (local208 == 3624) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static156.aClass1_Sub11Array1 != null && local776 < Static11.anInt411 && Static156.aClass1_Sub11Array1[local776].aClass13_767.method894(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847)) {
									Static2.anIntArray5[local25++] = 1;
									continue;
								}
								Static2.anIntArray5[local25++] = 0;
								continue;
							}
							if (local208 == 3625) {
								if (Static40.aClass13_453 == null) {
									Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								} else {
									Static112.aClass13Array22[local27++] = Static40.aClass13_453.method903();
								}
								continue;
							}
							if (local208 == 3626) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								if (Static10.aClass13_169 != null && local776 < Static11.anInt411) {
									Static112.aClass13Array22[local27++] = Static156.aClass1_Sub11Array1[local776].aClass13_772;
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
						} else if (local208 < 4000) {
							if (local208 == 3903) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static7.aClass58Array2[local776].method2226();
								continue;
							}
							if (local208 == 3904) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static7.aClass58Array2[local776].anInt3126;
								continue;
							}
							if (local208 == 3905) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static7.aClass58Array2[local776].anInt3124;
								continue;
							}
							if (local208 == 3906) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static7.aClass58Array2[local776].anInt3123;
								continue;
							}
							if (local208 == 3907) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static7.aClass58Array2[local776].anInt3127;
								continue;
							}
							if (local208 == 3908) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static7.aClass58Array2[local776].anInt3120;
								continue;
							}
							if (local208 == 3910) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local781 = Static7.aClass58Array2[local776].method2225();
								Static2.anIntArray5[local25++] = local781 == 0 ? 1 : 0;
								continue;
							}
							if (local208 == 3911) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local781 = Static7.aClass58Array2[local776].method2225();
								Static2.anIntArray5[local25++] = local781 == 2 ? 1 : 0;
								continue;
							}
							if (local208 == 3912) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local781 = Static7.aClass58Array2[local776].method2225();
								Static2.anIntArray5[local25++] = local781 == 5 ? 1 : 0;
								continue;
							}
							if (local208 == 3913) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local781 = Static7.aClass58Array2[local776].method2225();
								Static2.anIntArray5[local25++] = local781 == 1 ? 1 : 0;
								continue;
							}
						} else if (local208 < 4100) {
							if (local208 == 4000) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local781 + local776;
								continue;
							}
							if (local208 == 4001) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = local776 - local781;
								continue;
							}
							if (local208 == 4002) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local781 * local776;
								continue;
							}
							if (local208 == 4003) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local776 / local781;
								continue;
							}
							if (local208 == 4004) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = (int) ((double) local776 * Math.random());
								continue;
							}
							if (local208 == 4005) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = (int) ((double) (local776 + 1) * Math.random());
								continue;
							}
							if (local208 == 4006) {
								local25 -= 5;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								local983 = Static2.anIntArray5[local25 + 2];
								local643 = Static2.anIntArray5[local25 + 4];
								local618 = Static2.anIntArray5[local25 + 3];
								Static2.anIntArray5[local25++] = (local643 - local983) * (-local776 + local781) / (local618 - local983) + local776;
								continue;
							}
							if (local208 == 4007) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local776 + local776 * local781 / 100;
								continue;
							}
							if (local208 == 4008) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = 0x1 << local781 | local776;
								continue;
							}
							if (local208 == 4009) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = -(0x1 << local781) - 1 & local776;
								continue;
							}
							if (local208 == 4010) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = (0x1 << local781 & local776) == 0 ? 0 : 1;
								continue;
							}
							if (local208 == 4011) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local776 % local781;
								continue;
							}
							if (local208 == 4012) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								if (local776 == 0) {
									Static2.anIntArray5[local25++] = 0;
								} else {
									Static2.anIntArray5[local25++] = (int) Math.pow((double) local776, (double) local781);
								}
								continue;
							}
							if (local208 == 4013) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								if (local776 == 0) {
									Static2.anIntArray5[local25++] = 0;
								} else if (local781 == 0) {
									Static2.anIntArray5[local25++] = Integer.MAX_VALUE;
								} else {
									Static2.anIntArray5[local25++] = (int) Math.pow((double) local776, 1.0D / (double) local781);
								}
								continue;
							}
							if (local208 == 4014) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = local776 & local781;
								continue;
							}
							if (local208 == 4015) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local776 | local781;
								continue;
							}
							if (local208 == 4016) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local781 <= local776 ? local781 : local776;
								continue;
							}
							if (local208 == 4017) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local781 >= local776 ? local781 : local776;
								continue;
							}
							if (local208 == 4018) {
								local25 -= 3;
								@Pc(5016) long local5016 = (long) Static2.anIntArray5[local25 + 1];
								@Pc(5023) long local5023 = (long) Static2.anIntArray5[local25 + 2];
								@Pc(5028) long local5028 = (long) Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = (int) (local5023 * local5028 / local5016);
								continue;
							}
						} else if (local208 < 4200) {
							if (local208 == 4100) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local25--;
								local781 = Static2.anIntArray5[local25];
								Static112.aClass13Array22[local27++] = Static57.method1349(new Class13[] { local578, Static3.method75(local781) });
								continue;
							}
							if (local208 == 4101) {
								local27 -= 2;
								local578 = Static112.aClass13Array22[local27];
								local2542 = Static112.aClass13Array22[local27 + 1];
								Static112.aClass13Array22[local27++] = Static57.method1349(new Class13[] { local578, local2542 });
								continue;
							}
							if (local208 == 4102) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local25--;
								local781 = Static2.anIntArray5[local25];
								Static112.aClass13Array22[local27++] = Static57.method1349(new Class13[] { local578, Static140.method2506(local781) });
								continue;
							}
							if (local208 == 4103) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static112.aClass13Array22[local27++] = local578.method876();
								continue;
							}
							if (local208 == 4104) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								@Pc(3916) long local3916 = ((long) local776 + 11745L) * 86400000L;
								Static125.aCalendar1.setTime(new Date(local3916));
								local618 = Static125.aCalendar1.get(5);
								local643 = Static125.aCalendar1.get(2);
								local1018 = Static125.aCalendar1.get(1);
								Static112.aClass13Array22[local27++] = Static57.method1349(new Class13[] { Static3.method75(local618), Static51.aClass13_570, Static30.aClass13Array6[local643], Static51.aClass13_570, Static3.method75(local1018) });
								continue;
							}
							if (local208 == 4105) {
								local27 -= 2;
								local578 = Static112.aClass13Array22[local27];
								local2542 = Static112.aClass13Array22[local27 + 1];
								if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2 != null && Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass6_2.aBoolean50) {
									Static112.aClass13Array22[local27++] = local2542;
									continue;
								}
								Static112.aClass13Array22[local27++] = local578;
								continue;
							}
							if (local208 == 4106) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static112.aClass13Array22[local27++] = Static3.method75(local776);
								continue;
							}
							if (local208 == 4107) {
								local27 -= 2;
								Static2.anIntArray5[local25++] = Static112.aClass13Array22[local27].method911(Static112.aClass13Array22[local27 + 1]);
								continue;
							}
							@Pc(4074) Class1_Sub2_Sub1_Sub1_Sub1 local4074;
							@Pc(4069) byte[] local4069;
							if (local208 == 4108) {
								local25 -= 2;
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local781 = Static2.anIntArray5[local25];
								local983 = Static2.anIntArray5[local25 + 1];
								local4069 = Static125.aClass4_Sub1_41.method2243(local983, 0);
								local4074 = new Class1_Sub2_Sub1_Sub1_Sub1(local4069);
								local4074.method262(Static45.aClass1_Sub2_Sub1_Sub4Array7, null);
								Static2.anIntArray5[local25++] = local4074.method248(local578, local781);
								continue;
							}
							if (local208 == 4109) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25];
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local983 = Static2.anIntArray5[local25 + 1];
								local4069 = Static125.aClass4_Sub1_41.method2243(local983, 0);
								local4074 = new Class1_Sub2_Sub1_Sub1_Sub1(local4069);
								local4074.method262(Static45.aClass1_Sub2_Sub1_Sub4Array7, null);
								Static2.anIntArray5[local25++] = local4074.method250(local578, local781);
								continue;
							}
							if (local208 == 4110) {
								local27 -= 2;
								local578 = Static112.aClass13Array22[local27];
								local2542 = Static112.aClass13Array22[local27 + 1];
								local25--;
								if (Static2.anIntArray5[local25] == 1) {
									Static112.aClass13Array22[local27++] = local578;
								} else {
									Static112.aClass13Array22[local27++] = local2542;
								}
								continue;
							}
							if (local208 == 4111) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static112.aClass13Array22[local27++] = Static177.method241(local578);
								continue;
							}
							if (local208 == 4112) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local25--;
								local781 = Static2.anIntArray5[local25];
								Static112.aClass13Array22[local27++] = local578.method899(local781);
								continue;
							}
							if (local208 == 4113) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static50.method1244(local776) ? 1 : 0;
								continue;
							}
							if (local208 == 4114) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static58.method1371(local776) ? 1 : 0;
								continue;
							}
							if (local208 == 4115) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static54.method1316(local776) ? 1 : 0;
								continue;
							}
							if (local208 == 4116) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static136.method2434(local776) ? 1 : 0;
								continue;
							}
							if (local208 == 4117) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								if (local578 == null) {
									Static2.anIntArray5[local25++] = 0;
								} else {
									Static2.anIntArray5[local25++] = local578.method904();
								}
								continue;
							}
							if (local208 == 4118) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25];
								local983 = Static2.anIntArray5[local25 + 1];
								local27--;
								local578 = Static112.aClass13Array22[local27];
								Static112.aClass13Array22[local27++] = local578.method883(local781, local983);
								continue;
							}
							if (local208 == 4119) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local2542 = Static79.method1661(local578.method904());
								@Pc(4375) boolean local4375 = false;
								for (local618 = 0; local618 < local578.method904(); local618++) {
									local643 = local578.method898(local618);
									if (local643 == 60) {
										local4375 = true;
									} else if (local643 == 62) {
										local4375 = false;
									} else if (!local4375) {
										local2542.method891(local643);
									}
								}
								local2542.method875();
								Static112.aClass13Array22[local27++] = local2542;
								continue;
							}
							if (local208 == 4120) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25];
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local983 = Static2.anIntArray5[local25 + 1];
								Static2.anIntArray5[local25++] = local578.method908(local983, local781);
								continue;
							}
							if (local208 == 4121) {
								local27 -= 2;
								local578 = Static112.aClass13Array22[local27];
								local2542 = Static112.aClass13Array22[local27 + 1];
								local25--;
								local983 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = local578.method893(local983, local2542);
								continue;
							}
						} else if (local208 < 4300) {
							if (local208 == 4200) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static112.aClass13Array22[local27++] = Static184.method2994(local776).aClass13_463;
								continue;
							}
							@Pc(3470) Class1_Sub2_Sub6 local3470;
							if (local208 == 4201) {
								local25 -= 2;
								local781 = Static2.anIntArray5[local25 + 1];
								local776 = Static2.anIntArray5[local25];
								local3470 = Static184.method2994(local776);
								if (local781 >= 1 && local781 <= 5 && local3470.aClass13Array8[local781 - 1] != null) {
									Static112.aClass13Array22[local27++] = local3470.aClass13Array8[local781 - 1];
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 4202) {
								local25 -= 2;
								local776 = Static2.anIntArray5[local25];
								local781 = Static2.anIntArray5[local25 + 1];
								local3470 = Static184.method2994(local776);
								if (local781 >= 1 && local781 <= 5 && local3470.aClass13Array9[local781 - 1] != null) {
									Static112.aClass13Array22[local27++] = local3470.aClass13Array9[local781 - 1];
									continue;
								}
								Static112.aClass13Array22[local27++] = Static87.aClass13_820;
								continue;
							}
							if (local208 == 4203) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static184.method2994(local776).anInt1320;
								continue;
							}
							if (local208 == 4204) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static184.method2994(local776).anInt1287 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3619) Class1_Sub2_Sub6 local3619;
							if (local208 == 4205) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local3619 = Static184.method2994(local776);
								if (local3619.anInt1303 == -1 && local3619.anInt1324 >= 0) {
									Static2.anIntArray5[local25++] = local3619.anInt1324;
									continue;
								}
								Static2.anIntArray5[local25++] = local776;
								continue;
							}
							if (local208 == 4206) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local3619 = Static184.method2994(local776);
								if (local3619.anInt1303 >= 0 && local3619.anInt1324 >= 0) {
									Static2.anIntArray5[local25++] = local3619.anInt1324;
									continue;
								}
								Static2.anIntArray5[local25++] = local776;
								continue;
							}
							if (local208 == 4207) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								Static2.anIntArray5[local25++] = Static184.method2994(local776).aBoolean88 ? 1 : 0;
								continue;
							}
							if (local208 == 4210) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local25--;
								local781 = Static2.anIntArray5[local25];
								Static109.method2132(local578, local781 == 1);
								Static2.anIntArray5[local25++] = Static7.anInt3185;
								continue;
							}
							if (local208 == 4211) {
								if (Static169.aShortArray49 != null && Static137.anInt3410 < Static7.anInt3185) {
									Static2.anIntArray5[local25++] = Static169.aShortArray49[Static137.anInt3410++] & 0xFFFF;
									continue;
								}
								Static2.anIntArray5[local25++] = -1;
								continue;
							}
							if (local208 == 4212) {
								Static137.anInt3410 = 0;
								continue;
							}
						} else if (local208 < 5100) {
							if (local208 == 5000) {
								Static2.anIntArray5[local25++] = Static80.anInt2285;
								continue;
							}
							if (local208 == 5001) {
								local25 -= 3;
								Static80.anInt2285 = Static2.anIntArray5[local25];
								Static122.anInt3195 = Static2.anIntArray5[local25 + 1];
								Static135.anInt3377 = Static2.anIntArray5[local25 + 2];
								Static1.aClass1_Sub8_Sub1_1.method1654(237);
								Static1.aClass1_Sub8_Sub1_1.method1643(Static80.anInt2285);
								Static1.aClass1_Sub8_Sub1_1.method1643(Static122.anInt3195);
								Static1.aClass1_Sub8_Sub1_1.method1643(Static135.anInt3377);
								continue;
							}
							if (local208 == 5002) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								local25 -= 2;
								local983 = Static2.anIntArray5[local25 + 1];
								local781 = Static2.anIntArray5[local25];
								Static1.aClass1_Sub8_Sub1_1.method1654(150);
								Static1.aClass1_Sub8_Sub1_1.method1625(local578.method878());
								Static1.aClass1_Sub8_Sub1_1.method1643(local781 - 1);
								Static1.aClass1_Sub8_Sub1_1.method1643(local983);
								continue;
							}
							if (local208 == 5003) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local2542 = null;
								if (local776 < 100) {
									local2542 = Static54.aClass13Array14[local776];
								}
								if (local2542 == null) {
									local2542 = Static87.aClass13_820;
								}
								Static112.aClass13Array22[local27++] = local2542;
								continue;
							}
							if (local208 == 5004) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local781 = -1;
								if (local776 < 100 && Static54.aClass13Array14[local776] != null) {
									local781 = Static103.anIntArray267[local776];
								}
								Static2.anIntArray5[local25++] = local781;
								continue;
							}
							if (local208 == 5005) {
								Static2.anIntArray5[local25++] = Static122.anInt3195;
								continue;
							}
							if (local208 == 5008) {
								local27--;
								local578 = Static112.aClass13Array22[local27];
								if (local578.method892(Static170.aClass13_1316)) {
									Static68.method1455(local578);
								} else {
									local2542 = local578.method876();
									@Pc(2628) byte local2628 = 0;
									@Pc(2630) byte local2630 = 0;
									if (local2542.method892(Static102.aClass13_945)) {
										local2630 = 0;
										local578 = local578.method901(Static102.aClass13_945.method904());
									} else if (local2542.method892(Static65.aClass13_659)) {
										local2630 = 1;
										local578 = local578.method901(Static65.aClass13_659.method904());
									} else if (local2542.method892(Static142.aClass13_1209)) {
										local2630 = 2;
										local578 = local578.method901(Static142.aClass13_1209.method904());
									} else if (local2542.method892(Static51.aClass13_573)) {
										local2630 = 3;
										local578 = local578.method901(Static51.aClass13_573.method904());
									} else if (local2542.method892(Static145.aClass13_1225)) {
										local578 = local578.method901(Static145.aClass13_1225.method904());
										local2630 = 4;
									} else if (local2542.method892(Static101.aClass13_936)) {
										local2630 = 5;
										local578 = local578.method901(Static101.aClass13_936.method904());
									} else if (local2542.method892(Static27.aClass13_322)) {
										local578 = local578.method901(Static27.aClass13_322.method904());
										local2630 = 6;
									} else if (local2542.method892(Static112.aClass13_1012)) {
										local2630 = 7;
										local578 = local578.method901(Static112.aClass13_1012.method904());
									} else if (local2542.method892(Static110.aClass13_999)) {
										local2630 = 8;
										local578 = local578.method901(Static110.aClass13_999.method904());
									} else if (local2542.method892(Static84.aClass13_791)) {
										local578 = local578.method901(Static84.aClass13_791.method904());
										local2630 = 9;
									} else if (local2542.method892(Static130.aClass13_1099)) {
										local578 = local578.method901(Static130.aClass13_1099.method904());
										local2630 = 10;
									} else if (local2542.method892(Static11.aClass13_172)) {
										local578 = local578.method901(Static11.aClass13_172.method904());
										local2630 = 11;
									} else if (Static94.anInt2756 != 0) {
										if (local2542.method892(Static102.aClass13_946)) {
											local2630 = 0;
											local578 = local578.method901(Static102.aClass13_946.method904());
										} else if (local2542.method892(Static65.aClass13_663)) {
											local2630 = 1;
											local578 = local578.method901(Static65.aClass13_663.method904());
										} else if (local2542.method892(Static142.aClass13_1210)) {
											local578 = local578.method901(Static142.aClass13_1210.method904());
											local2630 = 2;
										} else if (local2542.method892(Static51.aClass13_575)) {
											local578 = local578.method901(Static51.aClass13_575.method904());
											local2630 = 3;
										} else if (local2542.method892(Static145.aClass13_1226)) {
											local578 = local578.method901(Static145.aClass13_1226.method904());
											local2630 = 4;
										} else if (local2542.method892(Static101.aClass13_934)) {
											local2630 = 5;
											local578 = local578.method901(Static101.aClass13_934.method904());
										} else if (local2542.method892(Static27.aClass13_320)) {
											local578 = local578.method901(Static27.aClass13_320.method904());
											local2630 = 6;
										} else if (local2542.method892(Static112.aClass13_1013)) {
											local578 = local578.method901(Static112.aClass13_1013.method904());
											local2630 = 7;
										} else if (local2542.method892(Static110.aClass13_1000)) {
											local2630 = 8;
											local578 = local578.method901(Static110.aClass13_1000.method904());
										} else if (local2542.method892(Static84.aClass13_789)) {
											local2630 = 9;
											local578 = local578.method901(Static84.aClass13_789.method904());
										} else if (local2542.method892(Static130.aClass13_1100)) {
											local578 = local578.method901(Static130.aClass13_1100.method904());
											local2630 = 10;
										} else if (local2542.method892(Static11.aClass13_173)) {
											local578 = local578.method901(Static11.aClass13_173.method904());
											local2630 = 11;
										}
									}
									local2542 = local578.method876();
									if (local2542.method892(Static185.aClass13_1420)) {
										local578 = local578.method901(Static185.aClass13_1420.method904());
										local2628 = 1;
									} else if (local2542.method892(Static183.aClass13_1411)) {
										local2628 = 2;
										local578 = local578.method901(Static183.aClass13_1411.method904());
									} else if (local2542.method892(Static64.aClass13_648)) {
										local578 = local578.method901(Static64.aClass13_648.method904());
										local2628 = 3;
									} else if (local2542.method892(Static174.aClass13_483)) {
										local578 = local578.method901(Static174.aClass13_483.method904());
										local2628 = 4;
									} else if (local2542.method892(Static164.aClass13_1334)) {
										local2628 = 5;
										local578 = local578.method901(Static164.aClass13_1334.method904());
									} else if (Static94.anInt2756 != 0) {
										if (local2542.method892(Static185.aClass13_1417)) {
											local578 = local578.method901(Static185.aClass13_1417.method904());
											local2628 = 1;
										} else if (local2542.method892(Static183.aClass13_1412)) {
											local2628 = 2;
											local578 = local578.method901(Static183.aClass13_1412.method904());
										} else if (local2542.method892(Static64.aClass13_649)) {
											local2628 = 3;
											local578 = local578.method901(Static64.aClass13_649.method904());
										} else if (local2542.method892(Static174.aClass13_484)) {
											local2628 = 4;
											local578 = local578.method901(Static174.aClass13_484.method904());
										} else if (local2542.method892(Static164.aClass13_1326)) {
											local578 = local578.method901(Static164.aClass13_1326.method904());
											local2628 = 5;
										}
									}
									Static1.aClass1_Sub8_Sub1_1.method1654(95);
									Static1.aClass1_Sub8_Sub1_1.method1643(0);
									local643 = Static1.aClass1_Sub8_Sub1_1.anInt2195;
									Static1.aClass1_Sub8_Sub1_1.method1643(local2630);
									Static1.aClass1_Sub8_Sub1_1.method1643(local2628);
									Static110.method2157(Static1.aClass1_Sub8_Sub1_1, local578);
									Static1.aClass1_Sub8_Sub1_1.method1612(Static1.aClass1_Sub8_Sub1_1.anInt2195 - local643);
								}
								continue;
							}
							if (local208 == 5009) {
								local27 -= 2;
								local578 = Static112.aClass13Array22[local27];
								local2542 = Static112.aClass13Array22[local27 + 1];
								Static1.aClass1_Sub8_Sub1_1.method1654(27);
								Static1.aClass1_Sub8_Sub1_1.method1643(0);
								local983 = Static1.aClass1_Sub8_Sub1_1.anInt2195;
								Static1.aClass1_Sub8_Sub1_1.method1625(local578.method878());
								Static110.method2157(Static1.aClass1_Sub8_Sub1_1, local2542);
								Static1.aClass1_Sub8_Sub1_1.method1612(Static1.aClass1_Sub8_Sub1_1.anInt2195 - local983);
								continue;
							}
							if (local208 == 5010) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local2542 = null;
								if (local776 < 100) {
									local2542 = Static81.aClass13Array18[local776];
								}
								if (local2542 == null) {
									local2542 = Static87.aClass13_820;
								}
								Static112.aClass13Array22[local27++] = local2542;
								continue;
							}
							if (local208 == 5011) {
								local25--;
								local776 = Static2.anIntArray5[local25];
								local2542 = null;
								if (local776 < 100) {
									local2542 = Static22.aClass13Array17[local776];
								}
								if (local2542 == null) {
									local2542 = Static87.aClass13_820;
								}
								Static112.aClass13Array22[local27++] = local2542;
								continue;
							}
							if (local208 == 5015) {
								if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1 == null || Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847 == null) {
									local578 = Static122.aClass13_1057;
								} else {
									local578 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847;
								}
								Static112.aClass13Array22[local27++] = local578;
								continue;
							}
							if (local208 == 5016) {
								Static2.anIntArray5[local25++] = Static135.anInt3377;
								continue;
							}
							if (local208 == 5017) {
								Static2.anIntArray5[local25++] = Static114.anInt3070;
								continue;
							}
						} else if (local208 < 5200) {
							if (local208 == 5100) {
								if (Static176.aBooleanArray53[86]) {
									Static2.anIntArray5[local25++] = 1;
								} else {
									Static2.anIntArray5[local25++] = 0;
								}
								continue;
							}
							if (local208 == 5101) {
								if (Static176.aBooleanArray53[82]) {
									Static2.anIntArray5[local25++] = 1;
								} else {
									Static2.anIntArray5[local25++] = 0;
								}
								continue;
							}
							if (local208 == 5102) {
								if (Static176.aBooleanArray53[81]) {
									Static2.anIntArray5[local25++] = 1;
								} else {
									Static2.anIntArray5[local25++] = 0;
								}
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7999) Exception local7999) {
			if (local18.aClass13_975 == null) {
				if (Static21.anInt787 != 0) {
					Static169.method2887(Static87.aClass13_820, Static160.aClass13_1303, 0);
				}
				Static154.method2661("CS2 - scr:" + local18.aLong158 + " op:" + local38, local7999);
			} else {
				@Pc(8032) Class13 local8032 = Static79.method1661(30);
				local8032.method900(Static21.aClass13_286).method900(local18.aClass13_975);
				for (local58 = Static117.anInt3115 - 1; local58 >= 0; local58--) {
					local8032.method900(Static8.aClass13_138).method900(Static44.aClass54Array1[local58].aClass1_Sub2_Sub11_1.aClass13_975);
				}
				if (local38 == 40) {
					local96 = local44[local29];
					local8032.method900(Static40.aClass13_452).method900(Static3.method75(local96));
				}
				if (Static21.anInt787 != 0) {
					Static169.method2887(Static87.aClass13_820, Static57.method1349(new Class13[] { Static75.aClass13_726, local18.aClass13_975 }), 0);
				}
				Static154.method2661("CS2 - scr:" + local18.aLong158 + " op:" + local38 + new String(local8032.method882()), local7999);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z")
	public static boolean method1067(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!ag;)V")
	public static void method1071(@OriginalArg(1) Class4 arg0) {
		Static118.aClass4_75 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V")
	public static void method1072() {
		aClass13_464 = null;
		aClass13Array10 = null;
		aClass13_461 = null;
		aClass13_462 = null;
	}
}
