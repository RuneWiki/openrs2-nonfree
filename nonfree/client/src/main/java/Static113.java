import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_6;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_18;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "I")
	public static int anInt2292;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!l", name = "F", descriptor = "I")
	public static int anInt2285 = 0;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	public static int anInt2287 = -1;

	@OriginalMember(owner = "client!l", name = "N", descriptor = "I")
	public static volatile int anInt2291 = 0;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Z")
	public static boolean method1637() throws IOException {
		if (Static148.aClass33_2 == null) {
			return false;
		}
		@Pc(15) int local15 = Static148.aClass33_2.method922();
		if (local15 == 0) {
			return false;
		}
		if (Static155.anInt3189 == -1) {
			Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, 1, 0);
			Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
			local15--;
			Static155.anInt3189 = Static48.aClass3_Sub4_Sub1_43.method1306();
			Static192.anInt3908 = Static184.anIntArray321[Static155.anInt3189];
		}
		if (Static192.anInt3908 == -1) {
			if (local15 <= 0) {
				return false;
			}
			local15--;
			Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, 1, 0);
			Static192.anInt3908 = Static48.aClass3_Sub4_Sub1_43.aByteArray12[0] & 0xFF;
		}
		if (Static192.anInt3908 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, 2, 0);
			local15 -= 2;
			Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
			Static192.anInt3908 = Static48.aClass3_Sub4_Sub1_43.method1270();
		}
		if (Static192.anInt3908 > local15) {
			return false;
		}
		Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
		Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, Static192.anInt3908, 0);
		Static82.anInt1626 = 0;
		Static121.anInt2459 = Static141.anInt2853;
		Static141.anInt2853 = Static190.anInt3871;
		Static190.anInt3871 = Static155.anInt3189;
		@Pc(127) int local127;
		if (Static155.anInt3189 == 239) {
			Static61.anInt1297 = Static192.anInt3908 / 8;
			for (local127 = 0; local127 < Static61.anInt1297; local127++) {
				Static183.aLongArray6[local127] = Static48.aClass3_Sub4_Sub1_43.method1272();
				Static160.aClass70Array58[local127] = method1641(Static183.aLongArray6[local127]);
			}
			Static155.anInt3189 = -1;
			Static33.anInt719 = Static86.anInt1703;
			return true;
		} else if (Static155.anInt3189 == 68) {
			Static192.aBoolean174 = false;
			for (local127 = 0; local127 < 5; local127++) {
				Static147.aBooleanArray13[local127] = false;
			}
			Static155.anInt3189 = -1;
			return true;
		} else {
			@Pc(195) int local195;
			@Pc(201) int local201;
			@Pc(215) int local215;
			if (Static155.anInt3189 == 75) {
				Static151.method2218();
				local127 = Static48.aClass3_Sub4_Sub1_43.method1286();
				local195 = Static48.aClass3_Sub4_Sub1_43.method1243();
				local201 = Static48.aClass3_Sub4_Sub1_43.method1245();
				Static11.anIntArray24[local127] = local201;
				Static111.anIntArray138[local127] = local195;
				Static149.anIntArray220[local127] = 1;
				for (local215 = 0; local215 < 98; local215++) {
					if (Class30_Sub1.anIntArray64[local215] <= local201) {
						Static149.anIntArray220[local127] = local215 + 2;
					}
				}
				Static52.anIntArray59[Static186.anInt3806++ & 0x1F] = local127;
				Static155.anInt3189 = -1;
				return true;
			} else if (Static155.anInt3189 == 5) {
				@Pc(257) byte local257 = Static48.aClass3_Sub4_Sub1_43.method1260();
				local195 = Static48.aClass3_Sub4_Sub1_43.method1280();
				Static124.anIntArray331[local195] = local257;
				if (Static16.anIntArray27[local195] != local257) {
					Static16.anIntArray27[local195] = local257;
					Static187.method2947(local195);
				}
				Static184.anIntArray324[Static49.anInt1001++ & 0x1F] = local195;
				Static155.anInt3189 = -1;
				return true;
			} else {
				@Pc(331) int local331;
				@Pc(451) boolean local451;
				@Pc(454) int local454;
				@Pc(495) int local495;
				@Pc(302) long local302;
				@Pc(329) Class70 local329;
				@Pc(447) int local447;
				@Pc(513) Class70 local513;
				@Pc(531) Class70 local531;
				if (Static155.anInt3189 == 81) {
					local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
					local201 = Static48.aClass3_Sub4_Sub1_43.method1270();
					local215 = Static48.aClass3_Sub4_Sub1_43.method1278();
					@Pc(312) Class70 local312 = Static61.aClass70_596;
					if (local201 > 0) {
						local312 = Static48.aClass3_Sub4_Sub1_43.method1246();
					}
					local329 = method1641(local302).method2033();
					for (local331 = 0; local331 < Static13.anInt318; local331++) {
						if (Static70.aLongArray1[local331] == local302) {
							if (local201 != Static179.anIntArray74[local331]) {
								Static179.anIntArray74[local331] = local201;
								if (local201 > 0) {
									Static135.method1934(Static207.method3296(new Class70[] { local329, Static86.aClass70_900 }), 5, Static61.aClass70_596);
								}
								if (local201 == 0) {
									Static135.method1934(Static207.method3296(new Class70[] { local329, Static109.aClass70_1085 }), 5, Static61.aClass70_596);
								}
							}
							Static81.aClass70Array32[local331] = local312;
							Static42.anIntArray46[local331] = local215;
							local329 = null;
							break;
						}
					}
					if (local329 != null && Static13.anInt318 < 200) {
						Static70.aLongArray1[Static13.anInt318] = local302;
						Static52.aClass70Array24[Static13.anInt318] = local329;
						Static179.anIntArray74[Static13.anInt318] = local201;
						Static81.aClass70Array32[Static13.anInt318] = local312;
						Static42.anIntArray46[Static13.anInt318] = local215;
						Static13.anInt318++;
					}
					Static33.anInt719 = Static86.anInt1703;
					local447 = Static13.anInt318;
					while (local447 > 0) {
						local451 = true;
						local447--;
						for (local454 = 0; local454 < local447; local454++) {
							if (Static143.anInt2933 != Static179.anIntArray74[local454] && Static179.anIntArray74[local454 + 1] == Static143.anInt2933 || Static179.anIntArray74[local454] == 0 && Static179.anIntArray74[local454 + 1] != 0) {
								local451 = false;
								local495 = Static179.anIntArray74[local454];
								Static179.anIntArray74[local454] = Static179.anIntArray74[local454 + 1];
								Static179.anIntArray74[local454 + 1] = local495;
								local513 = Static81.aClass70Array32[local454];
								Static81.aClass70Array32[local454] = Static81.aClass70Array32[local454 + 1];
								Static81.aClass70Array32[local454 + 1] = local513;
								local531 = Static52.aClass70Array24[local454];
								Static52.aClass70Array24[local454] = Static52.aClass70Array24[local454 + 1];
								Static52.aClass70Array24[local454 + 1] = local531;
								@Pc(549) long local549 = Static70.aLongArray1[local454];
								Static70.aLongArray1[local454] = Static70.aLongArray1[local454 + 1];
								Static70.aLongArray1[local454 + 1] = local549;
								@Pc(567) int local567 = Static42.anIntArray46[local454];
								Static42.anIntArray46[local454] = Static42.anIntArray46[local454 + 1];
								Static42.anIntArray46[local454 + 1] = local567;
							}
						}
						if (local451) {
							break;
						}
					}
					Static155.anInt3189 = -1;
					return true;
				} else if (Static155.anInt3189 == 86) {
					if (Static63.anInt1331 != -1) {
						Static138.method1978(0, Static63.anInt1331);
					}
					Static155.anInt3189 = -1;
					return true;
				} else {
					@Pc(642) Class6 local642;
					if (Static155.anInt3189 == 69) {
						local127 = Static48.aClass3_Sub4_Sub1_43.method1295();
						local195 = Static48.aClass3_Sub4_Sub1_43.method1257();
						local201 = Static48.aClass3_Sub4_Sub1_43.method1245();
						local215 = Static48.aClass3_Sub4_Sub1_43.method1257();
						local642 = Static146.method2127(local201);
						if (local642.anInt263 != local215 || local195 != local642.anInt200 || local127 != local642.anInt245) {
							local642.anInt245 = local127;
							local642.anInt263 = local215;
							local642.anInt200 = local195;
							Static9.method237(local642);
						}
						Static155.anInt3189 = -1;
						return true;
					}
					@Pc(722) int local722;
					@Pc(714) int local714;
					@Pc(697) Class6 local697;
					if (Static155.anInt3189 == 208) {
						local127 = Static48.aClass3_Sub4_Sub1_43.method1245();
						local195 = Static48.aClass3_Sub4_Sub1_43.method1270();
						if (local127 >= 0) {
							local697 = Static146.method2127(local127);
						} else {
							local697 = null;
						}
						if (local127 < -70000) {
							local195 += 32768;
						}
						while (Static48.aClass3_Sub4_Sub1_43.anInt1758 < Static192.anInt3908) {
							local714 = 0;
							local215 = Static48.aClass3_Sub4_Sub1_43.method1266();
							local722 = Static48.aClass3_Sub4_Sub1_43.method1270();
							if (local722 != 0) {
								local714 = Static48.aClass3_Sub4_Sub1_43.method1278();
								if (local714 == 255) {
									local714 = Static48.aClass3_Sub4_Sub1_43.method1245();
								}
							}
							if (local697 != null && local215 >= 0 && local215 < local697.anIntArray15.length) {
								local697.anIntArray15[local215] = local722;
								local697.anIntArray9[local215] = local714;
							}
							Static51.method787(local215, local714, local195, local722 - 1);
						}
						if (local697 != null) {
							Static9.method237(local697);
						}
						Static151.method2218();
						Static157.anIntArray237[Static101.anInt2070++ & 0x1F] = local195 & 0x7FFF;
						Static155.anInt3189 = -1;
						return true;
					}
					@Pc(823) Class70 local823;
					@Pc(829) long local829;
					@Pc(831) boolean local831;
					@Pc(804) Class70 local804;
					if (Static155.anInt3189 == 139) {
						local804 = Static48.aClass3_Sub4_Sub1_43.method1246();
						if (local804.method2027(Static36.aClass70_396)) {
							local823 = local804.method2023(local804.method2036(Static74.aClass70_686), 0);
							local829 = local823.method2018();
							local831 = false;
							for (local714 = 0; local714 < Static61.anInt1297; local714++) {
								if (local829 == Static183.aLongArray6[local714]) {
									local831 = true;
									break;
								}
							}
							if (!local831 && Static203.anInt4145 == 0) {
								Static135.method1934(Static31.aClass70_311, 4, local823);
							}
						} else if (local804.method2027(Static155.aClass70_1531)) {
							local823 = local804.method2023(local804.method2036(Static74.aClass70_686), 0);
							local829 = local823.method2018();
							local831 = false;
							for (local714 = 0; local714 < Static61.anInt1297; local714++) {
								if (local829 == Static183.aLongArray6[local714]) {
									local831 = true;
									break;
								}
							}
							if (!local831 && Static203.anInt4145 == 0) {
								@Pc(881) Class70 local881 = local804.method2023(local804.method2045() - 9, local804.method2036(Static74.aClass70_686) + 1);
								Static135.method1934(local881, 8, local823);
							}
						} else if (local804.method2027(Static4.aClass70_62)) {
							local823 = local804.method2023(local804.method2036(Static74.aClass70_686), 0);
							local831 = false;
							local829 = local823.method2018();
							for (local714 = 0; local714 < Static61.anInt1297; local714++) {
								if (Static183.aLongArray6[local714] == local829) {
									local831 = true;
									break;
								}
							}
							if (!local831 && Static203.anInt4145 == 0) {
								Static135.method1934(Static61.aClass70_596, 10, local823);
							}
						} else if (local804.method2027(Static75.aClass70_708)) {
							local823 = local804.method2023(local804.method2036(Static75.aClass70_708), 0);
							Static135.method1934(local823, 11, Static61.aClass70_596);
						} else if (local804.method2027(Static85.aClass70_895)) {
							local823 = local804.method2023(local804.method2036(Static85.aClass70_895), 0);
							if (Static203.anInt4145 == 0) {
								Static135.method1934(local823, 12, Static61.aClass70_596);
							}
						} else if (local804.method2027(Static84.aClass70_865)) {
							local823 = local804.method2023(local804.method2036(Static84.aClass70_865), 0);
							if (Static203.anInt4145 == 0) {
								Static135.method1934(local823, 13, Static61.aClass70_596);
							}
						} else if (local804.method2027(Static35.aClass70_371)) {
							local823 = local804.method2023(local804.method2036(Static74.aClass70_686), 0);
							local831 = false;
							local829 = local823.method2018();
							for (local714 = 0; local714 < Static61.anInt1297; local714++) {
								if (local829 == Static183.aLongArray6[local714]) {
									local831 = true;
									break;
								}
							}
							if (!local831 && Static203.anInt4145 == 0) {
								Static135.method1934(Static61.aClass70_596, 14, local823);
							}
						} else if (local804.method2027(Static13.aClass70_134)) {
							local823 = local804.method2023(local804.method2036(Static74.aClass70_686), 0);
							local829 = local823.method2018();
							local831 = false;
							for (local714 = 0; local714 < Static61.anInt1297; local714++) {
								if (Static183.aLongArray6[local714] == local829) {
									local831 = true;
									break;
								}
							}
							if (!local831 && Static203.anInt4145 == 0) {
								Static135.method1934(Static61.aClass70_596, 15, local823);
							}
						} else if (local804.method2027(Static148.aClass70_1431)) {
							local823 = local804.method2023(local804.method2036(Static74.aClass70_686), 0);
							local829 = local823.method2018();
							local831 = false;
							for (local714 = 0; local714 < Static61.anInt1297; local714++) {
								if (Static183.aLongArray6[local714] == local829) {
									local831 = true;
									break;
								}
							}
							if (!local831 && Static203.anInt4145 == 0) {
								Static135.method1934(Static61.aClass70_596, 16, local823);
							}
						} else {
							Static135.method1934(local804, 0, Static61.aClass70_596);
						}
						Static155.anInt3189 = -1;
						return true;
					}
					@Pc(1244) Class6 local1244;
					if (Static155.anInt3189 == 51) {
						local127 = Static48.aClass3_Sub4_Sub1_43.method1245();
						local1244 = Static146.method2127(local127);
						for (local201 = 0; local201 < local1244.anIntArray15.length; local201++) {
							local1244.anIntArray15[local201] = -1;
							local1244.anIntArray15[local201] = 0;
						}
						Static9.method237(local1244);
						Static155.anInt3189 = -1;
						return true;
					} else if (Static155.anInt3189 == 126) {
						local127 = Static48.aClass3_Sub4_Sub1_43.method1278();
						if (Static48.aClass3_Sub4_Sub1_43.method1278() == 0) {
							Static29.aClass27Array1[local127] = new Class27();
						} else {
							Static48.aClass3_Sub4_Sub1_43.anInt1758--;
							Static29.aClass27Array1[local127] = new Class27(Static48.aClass3_Sub4_Sub1_43);
						}
						Static155.anInt3189 = -1;
						Static176.anInt3588 = Static86.anInt1703;
						return true;
					} else {
						@Pc(1346) int local1346;
						@Pc(1328) long local1328;
						@Pc(1344) int local1344;
						@Pc(1367) int local1367;
						if (Static155.anInt3189 == 131) {
							local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
							local829 = Static48.aClass3_Sub4_Sub1_43.method1270();
							local1328 = Static48.aClass3_Sub4_Sub1_43.method1271();
							@Pc(1334) long local1334 = (local829 << 32) + local1328;
							local331 = Static48.aClass3_Sub4_Sub1_43.method1278();
							@Pc(1340) boolean local1340 = false;
							local1344 = Static48.aClass3_Sub4_Sub1_43.method1270();
							for (local1346 = 0; local1346 < 100; local1346++) {
								if (Static203.aLongArray9[local1346] == local1334) {
									local1340 = true;
									break;
								}
							}
							if (local331 <= 1) {
								for (local1367 = 0; local1367 < Static61.anInt1297; local1367++) {
									if (local302 == Static183.aLongArray6[local1367]) {
										local1340 = true;
										break;
									}
								}
							}
							if (!local1340 && Static203.anInt4145 == 0) {
								Static203.aLongArray9[Static25.anInt535] = local1334;
								Static25.anInt535 = (Static25.anInt535 + 1) % 100;
								local531 = Static118.method1710(local1344).method1190(Static48.aClass3_Sub4_Sub1_43);
								if (local331 == 2) {
									Static199.method3159(local531, 18, local1344, Static207.method3296(new Class70[] { Static99.aClass70_996, method1641(local302).method2033() }), null);
								} else if (local331 == 1) {
									Static199.method3159(local531, 18, local1344, Static207.method3296(new Class70[] { Static16.aClass70_165, method1641(local302).method2033() }), null);
								} else {
									Static199.method3159(local531, 18, local1344, method1641(local302).method2033(), null);
								}
							}
							Static155.anInt3189 = -1;
							return true;
						} else if (Static155.anInt3189 == 44) {
							local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
							local831 = false;
							if ((Long.MIN_VALUE & local302) != 0L) {
								local831 = true;
							}
							local201 = Static48.aClass3_Sub4_Sub1_43.method1270();
							@Pc(1510) byte local1510 = Static48.aClass3_Sub4_Sub1_43.method1248();
							if (local831) {
								if (Static144.anInt2952 == 0) {
									Static155.anInt3189 = -1;
									return true;
								}
								local302 &= Long.MAX_VALUE;
								for (local714 = 0; local714 < Static144.anInt2952 && (Static86.aClass3_Sub13Array1[local714].aLong147 != local302 || Static86.aClass3_Sub13Array1[local714].anInt1978 != local201); local714++) {
								}
								if (local714 < Static144.anInt2952) {
									while (Static144.anInt2952 - 1 > local714) {
										Static86.aClass3_Sub13Array1[local714] = Static86.aClass3_Sub13Array1[local714 + 1];
										local714++;
									}
									Static144.anInt2952--;
									Static86.aClass3_Sub13Array1[Static144.anInt2952] = null;
								}
							} else {
								local329 = Static48.aClass3_Sub4_Sub1_43.method1246();
								@Pc(1520) Class3_Sub13 local1520 = new Class3_Sub13();
								local1520.aLong147 = local302;
								local1520.aClass70_970 = method1641(local1520.aLong147);
								local1520.anInt1978 = local201;
								local1520.aByte10 = local1510;
								local1520.aClass70_969 = local329;
								for (local1344 = Static144.anInt2952 - 1; local1344 >= 0; local1344--) {
									local447 = Static86.aClass3_Sub13Array1[local1344].aClass70_970.method2050(local1520.aClass70_970);
									if (local447 == 0) {
										Static86.aClass3_Sub13Array1[local1344].anInt1978 = local201;
										Static86.aClass3_Sub13Array1[local1344].aByte10 = local1510;
										Static86.aClass3_Sub13Array1[local1344].aClass70_969 = local329;
										Static155.anInt3189 = -1;
										if (local302 == Static74.aLong44) {
											Static92.aByte9 = local1510;
										}
										Static36.anInt791 = Static86.anInt1703;
										return true;
									}
									if (local447 < 0) {
										break;
									}
								}
								if (Static144.anInt2952 >= Static86.aClass3_Sub13Array1.length) {
									Static155.anInt3189 = -1;
									return true;
								}
								for (local447 = Static144.anInt2952 - 1; local447 > local1344; local447--) {
									Static86.aClass3_Sub13Array1[local447 + 1] = Static86.aClass3_Sub13Array1[local447];
								}
								if (Static144.anInt2952 == 0) {
									Static86.aClass3_Sub13Array1 = new Class3_Sub13[100];
								}
								Static86.aClass3_Sub13Array1[local1344 + 1] = local1520;
								Static144.anInt2952++;
								if (Static74.aLong44 == local302) {
									Static92.aByte9 = local1510;
								}
							}
							Static36.anInt791 = Static86.anInt1703;
							Static155.anInt3189 = -1;
							return true;
						} else if (Static155.anInt3189 == 255) {
							local127 = Static48.aClass3_Sub4_Sub1_43.method1262();
							local195 = Static48.aClass3_Sub4_Sub1_43.method1295();
							Static124.anIntArray331[local195] = local127;
							if (local127 != Static16.anIntArray27[local195]) {
								Static16.anIntArray27[local195] = local127;
								Static187.method2947(local195);
							}
							Static184.anIntArray324[Static49.anInt1001++ & 0x1F] = local195;
							Static155.anInt3189 = -1;
							return true;
						} else if (Static155.anInt3189 == 154) {
							Static146.method2130(false);
							Static155.anInt3189 = -1;
							return true;
						} else {
							@Pc(1823) Class70 local1823;
							if (Static155.anInt3189 == 196) {
								local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
								local1823 = Static173.method3101(Static78.method1147(Static48.aClass3_Sub4_Sub1_43).method2046());
								Static135.method1934(local1823, 6, method1641(local302).method2033());
								Static155.anInt3189 = -1;
								return true;
							} else if (Static155.anInt3189 == 174) {
								Static83.anInt1648 = Static48.aClass3_Sub4_Sub1_43.method1278();
								Static155.anInt3189 = -1;
								Static33.anInt719 = Static86.anInt1703;
								return true;
							} else if (Static155.anInt3189 == 156) {
								local127 = Static48.aClass3_Sub4_Sub1_43.method1257();
								if (local127 == 65535) {
									local127 = -1;
								}
								local195 = Static48.aClass3_Sub4_Sub1_43.method1279();
								local697 = Static146.method2127(local195);
								if (local697.anInt224 != 2 || local127 != local697.anInt201) {
									local697.anInt224 = 2;
									local697.anInt201 = local127;
									Static9.method237(local697);
								}
								Static155.anInt3189 = -1;
								return true;
							} else {
								@Pc(2011) Class3_Sub10 local2011;
								@Pc(2071) long local2071;
								if (Static155.anInt3189 == 94) {
									local127 = Static192.anInt3908 + Static48.aClass3_Sub4_Sub1_43.anInt1758;
									local195 = Static48.aClass3_Sub4_Sub1_43.method1270();
									local201 = Static48.aClass3_Sub4_Sub1_43.method1270();
									if (local195 != Static63.anInt1331) {
										Static63.anInt1331 = local195;
										Static101.method1450(Static63.anInt1331);
										Static109.method1547();
										Static166.method2464(Static63.anInt1331);
										for (local215 = 0; local215 < 100; local215++) {
											Static165.aBooleanArray14[local215] = true;
										}
									}
									while (local201-- > 0) {
										local215 = Static48.aClass3_Sub4_Sub1_43.method1245();
										local722 = Static48.aClass3_Sub4_Sub1_43.method1270();
										local714 = Static48.aClass3_Sub4_Sub1_43.method1278();
										@Pc(1976) Class3_Sub10 local1976 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local215);
										if (local1976 != null && local1976.anInt1427 != local722) {
											Static151.method2214(local1976, true);
											local1976 = null;
										}
										if (local1976 == null) {
											local1976 = Static132.method1846(local215, local714, local722);
										}
										local1976.aBoolean85 = true;
									}
									for (local2011 = (Class3_Sub10) Static144.aClass40_9.method1026(); local2011 != null; local2011 = (Class3_Sub10) Static144.aClass40_9.method1024()) {
										if (local2011.aBoolean85) {
											local2011.aBoolean85 = false;
										} else {
											Static151.method2214(local2011, true);
										}
									}
									Static38.aClass40_2 = new Class40(512);
									while (local127 > Static48.aClass3_Sub4_Sub1_43.anInt1758) {
										local722 = Static48.aClass3_Sub4_Sub1_43.method1245();
										local714 = Static48.aClass3_Sub4_Sub1_43.method1270();
										local331 = Static48.aClass3_Sub4_Sub1_43.method1270();
										local1344 = Static48.aClass3_Sub4_Sub1_43.method1245();
										for (local447 = local714; local447 <= local331; local447++) {
											local2071 = ((long) local722 << 32) + (long) local447;
											Static38.aClass40_2.method1027(new Class3_Sub16(local1344), local2071);
										}
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 122) {
									Static40.aClass70_424 = Static48.aClass3_Sub4_Sub1_43.method1246();
									Static35.method612(Static40.aClass70_424);
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 118) {
									Static192.aBoolean174 = true;
									Static58.anInt1276 = Static48.aClass3_Sub4_Sub1_43.method1278();
									Static167.anInt3406 = Static48.aClass3_Sub4_Sub1_43.method1278();
									Static69.anInt1395 = Static48.aClass3_Sub4_Sub1_43.method1270();
									Static6.anInt122 = Static48.aClass3_Sub4_Sub1_43.method1278();
									Static167.anInt3404 = Static48.aClass3_Sub4_Sub1_43.method1278();
									if (Static167.anInt3404 >= 100) {
										Static130.anInt2546 = Static58.anInt1276 * 128 + 64;
										Static54.anInt1158 = Static167.anInt3406 * 128 + 64;
										Static118.anInt2400 = Static107.method2399(Static54.anInt1158, Static130.anInt2546, Static137.anInt2795) - Static69.anInt1395;
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 111) {
									local127 = Static48.aClass3_Sub4_Sub1_43.method1270();
									local195 = Static48.aClass3_Sub4_Sub1_43.method1242();
									local697 = Static146.method2127(local195);
									if (local697 != null && local697.anInt250 == 0) {
										if (local697.anInt220 - local697.anInt217 < local127) {
											local127 = local697.anInt220 - local697.anInt217;
										}
										if (local127 < 0) {
											local127 = 0;
										}
										if (local697.anInt270 != local127) {
											local697.anInt270 = local127;
											Static9.method237(local697);
										}
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 113) {
									Static5.method88();
									Static155.anInt3189 = -1;
									return false;
								} else if (Static155.anInt3189 == 82) {
									local127 = Static48.aClass3_Sub4_Sub1_43.method1262();
									local195 = Static48.aClass3_Sub4_Sub1_43.method1270();
									if (local195 == 65535) {
										local195 = -1;
									}
									local201 = Static48.aClass3_Sub4_Sub1_43.method1245();
									local215 = Static48.aClass3_Sub4_Sub1_43.method1295();
									if (local215 == 65535) {
										local215 = -1;
									}
									for (local722 = local195; local722 <= local215; local722++) {
										@Pc(2284) long local2284 = ((long) local201 << 32) + (long) local722;
										@Pc(2289) Class3 local2289 = Static38.aClass40_2.method1029(local2284);
										if (local2289 != null) {
											local2289.method3320();
										}
										Static38.aClass40_2.method1027(new Class3_Sub16(local127), local2284);
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 19) {
									local127 = Static48.aClass3_Sub4_Sub1_43.method1270();
									local195 = Static48.aClass3_Sub4_Sub1_43.method1278();
									local201 = Static48.aClass3_Sub4_Sub1_43.method1270();
									if (local127 == 65535) {
										local127 = -1;
									}
									Static117.method1694(local127, local195, local201);
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 117) {
									@Pc(2349) byte[] local2349 = new byte[Static192.anInt3908];
									Static48.aClass3_Sub4_Sub1_43.method1307(Static192.anInt3908, local2349);
									Static30.method558(Static12.method263(Static192.anInt3908, 0, local2349));
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 55) {
									local127 = Static48.aClass3_Sub4_Sub1_43.method1279();
									local195 = Static48.aClass3_Sub4_Sub1_43.method1257();
									if (local195 == 65535) {
										local195 = -1;
									}
									local697 = Static146.method2127(local127);
									if (local697.anInt224 != 1 || local697.anInt201 != local195) {
										local697.anInt201 = local195;
										local697.anInt224 = 1;
										Static9.method237(local697);
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 173) {
									Static151.method2218();
									Static141.anInt2856 = Static48.aClass3_Sub4_Sub1_43.method1278();
									Static155.anInt3189 = -1;
									Static52.anInt1119 = Static86.anInt1703;
									return true;
								} else if (Static155.anInt3189 == 24) {
									local804 = Static48.aClass3_Sub4_Sub1_43.method1246();
									@Pc(2453) Object[] local2453 = new Object[local804.method2045() + 1];
									for (local201 = local804.method2045() - 1; local201 >= 0; local201--) {
										if (local804.method2055(local201) == 115) {
											local2453[local201 + 1] = Static48.aClass3_Sub4_Sub1_43.method1246();
										} else {
											local2453[local201 + 1] = Integer.valueOf(Static48.aClass3_Sub4_Sub1_43.method1245());
										}
									}
									local2453[0] = Integer.valueOf(Static48.aClass3_Sub4_Sub1_43.method1245());
									@Pc(2506) Class3_Sub26 local2506 = new Class3_Sub26();
									local2506.anObjectArray29 = local2453;
									Static185.method2901(local2506);
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 204) {
									Static14.anInt321 = Static48.aClass3_Sub4_Sub1_43.method1281();
									Static116.anInt3358 = Static48.aClass3_Sub4_Sub1_43.method1278();
									for (local127 = Static14.anInt321; local127 < Static14.anInt321 + 8; local127++) {
										for (local195 = Static116.anInt3358; local195 < Static116.anInt3358 + 8; local195++) {
											if (Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local127][local195] != null) {
												Static29.aClass10ArrayArrayArray1[Static137.anInt2795][local127][local195] = null;
												Static126.method1759(local127, local195);
											}
										}
									}
									for (@Pc(2584) Class3_Sub22 local2584 = (Class3_Sub22) Static95.aClass10_53.method267(); local2584 != null; local2584 = (Class3_Sub22) Static95.aClass10_53.method268()) {
										if (local2584.anInt3540 >= Static14.anInt321 && local2584.anInt3540 < Static14.anInt321 + 8 && local2584.anInt3542 >= Static116.anInt3358 && local2584.anInt3542 < Static116.anInt3358 + 8 && Static137.anInt2795 == local2584.anInt3549) {
											local2584.anInt3550 = 0;
										}
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 95) {
									Static14.anInt321 = Static48.aClass3_Sub4_Sub1_43.method1243();
									Static116.anInt3358 = Static48.aClass3_Sub4_Sub1_43.method1278();
									while (Static192.anInt3908 > Static48.aClass3_Sub4_Sub1_43.anInt1758) {
										Static155.anInt3189 = Static48.aClass3_Sub4_Sub1_43.method1278();
										Static41.method682();
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 149) {
									local127 = Static48.aClass3_Sub4_Sub1_43.method1278();
									local195 = Static48.aClass3_Sub4_Sub1_43.method1281();
									local1823 = Static48.aClass3_Sub4_Sub1_43.method1246();
									if (local127 >= 1 && local127 <= 8) {
										if (local1823.method2059(Static121.aClass70_1173)) {
											local1823 = null;
										}
										Static124.aClass70Array71[local127 - 1] = local1823;
										Static36.aBooleanArray1[local127 - 1] = local195 == 0;
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 141) {
									local127 = Static48.aClass3_Sub4_Sub1_43.method1295();
									if (local127 == 65535) {
										local127 = -1;
									}
									Static12.method264(local127);
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 77) {
									local127 = Static48.aClass3_Sub4_Sub1_43.method1258();
									local195 = Static48.aClass3_Sub4_Sub1_43.method1280();
									if (local195 == 65535) {
										local195 = -1;
									}
									Static76.method1101(local195, local127);
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 176) {
									if (Static192.anInt3908 == 0) {
										Static45.aClass70_472 = Static207.aClass70_2084;
									} else {
										Static45.aClass70_472 = Static48.aClass3_Sub4_Sub1_43.method1246();
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 250) {
									Static102.method1458(Static192.anInt3908, Static48.aClass3_Sub4_Sub1_43, Static47.aClass47_1);
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 249) {
									for (local127 = 0; local127 < Static146.aClass26_Sub2_Sub1Array1.length; local127++) {
										if (Static146.aClass26_Sub2_Sub1Array1[local127] != null) {
											Static146.aClass26_Sub2_Sub1Array1[local127].anInt2599 = -1;
										}
									}
									for (local195 = 0; local195 < Static8.aClass26_Sub2_Sub2Array1.length; local195++) {
										if (Static8.aClass26_Sub2_Sub2Array1[local195] != null) {
											Static8.aClass26_Sub2_Sub2Array1[local195].anInt2599 = -1;
										}
									}
									Static155.anInt3189 = -1;
									return true;
								} else if (Static155.anInt3189 == 17) {
									Static154.method2283(Static48.aClass3_Sub4_Sub1_43);
									Static155.anInt3189 = -1;
									return true;
								} else {
									@Pc(2946) int local2946;
									@Pc(2901) long local2901;
									if (Static155.anInt3189 == 142) {
										local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
										Static48.aClass3_Sub4_Sub1_43.method1248();
										local829 = Static48.aClass3_Sub4_Sub1_43.method1272();
										local1328 = Static48.aClass3_Sub4_Sub1_43.method1270();
										local2901 = Static48.aClass3_Sub4_Sub1_43.method1271();
										local2071 = local2901 + (local1328 << 32);
										local447 = Static48.aClass3_Sub4_Sub1_43.method1278();
										@Pc(2915) boolean local2915 = false;
										for (local1367 = 0; local1367 < 100; local1367++) {
											if (local2071 == Static203.aLongArray9[local1367]) {
												local2915 = true;
												break;
											}
										}
										if (local447 <= 1) {
											for (local2946 = 0; local2946 < Static61.anInt1297; local2946++) {
												if (Static183.aLongArray6[local2946] == local302) {
													local2915 = true;
													break;
												}
											}
										}
										if (!local2915 && Static203.anInt4145 == 0) {
											Static203.aLongArray9[Static25.anInt535] = local2071;
											Static25.anInt535 = (Static25.anInt535 + 1) % 100;
											@Pc(2990) Class70 local2990 = Static173.method3101(Static78.method1147(Static48.aClass3_Sub4_Sub1_43).method2046());
											if (local447 == 2 || local447 == 3) {
												Static203.method3225(Static207.method3296(new Class70[] { Static99.aClass70_996, method1641(local302).method2033() }), method1641(local829).method2033(), local2990);
											} else if (local447 == 1) {
												Static203.method3225(Static207.method3296(new Class70[] { Static16.aClass70_165, method1641(local302).method2033() }), method1641(local829).method2033(), local2990);
											} else {
												Static203.method3225(method1641(local302).method2033(), method1641(local829).method2033(), local2990);
											}
										}
										Static155.anInt3189 = -1;
										return true;
									} else if (Static155.anInt3189 == 43) {
										Static14.anInt321 = Static48.aClass3_Sub4_Sub1_43.method1243();
										Static116.anInt3358 = Static48.aClass3_Sub4_Sub1_43.method1286();
										Static155.anInt3189 = -1;
										return true;
									} else if (Static155.anInt3189 == 214) {
										@Pc(3110) boolean local3110 = Static48.aClass3_Sub4_Sub1_43.method1278() == 1;
										local195 = Static48.aClass3_Sub4_Sub1_43.method1242();
										local697 = Static146.method2127(local195);
										if (local697.aBoolean19 != local3110) {
											local697.aBoolean19 = local3110;
											Static9.method237(local697);
										}
										Static155.anInt3189 = -1;
										return true;
									} else if (Static155.anInt3189 == 205) {
										local127 = Static48.aClass3_Sub4_Sub1_43.method1280();
										Static121.method1747(local127);
										Static157.anIntArray237[Static101.anInt2070++ & 0x1F] = local127 & 0x7FFF;
										Static155.anInt3189 = -1;
										return true;
									} else if (Static155.anInt3189 == 54) {
										Static151.method2218();
										Static116.anInt3345 = Static48.aClass3_Sub4_Sub1_43.method1267();
										Static52.anInt1119 = Static86.anInt1703;
										Static155.anInt3189 = -1;
										return true;
									} else if (Static155.anInt3189 == 221) {
										local127 = Static48.aClass3_Sub4_Sub1_43.method1270();
										local195 = Static48.aClass3_Sub4_Sub1_43.method1295();
										Static179.anInt1329 = local127;
										Static97.anInt2019 = local195;
										method1638();
										Static155.anInt3189 = -1;
										return true;
									} else {
										@Pc(3225) Class6 local3225;
										if (Static155.anInt3189 == 212) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1270();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1245();
											local201 = Static48.aClass3_Sub4_Sub1_43.method1257();
											local3225 = Static146.method2127(local195);
											Static155.anInt3189 = -1;
											local3225.anInt208 = (local201 << 16) + local127;
											return true;
										} else if (Static155.anInt3189 == 185) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1245();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1270();
											if (local127 < -70000) {
												local195 += 32768;
											}
											if (local127 >= 0) {
												local697 = Static146.method2127(local127);
											} else {
												local697 = null;
											}
											if (local697 != null) {
												for (local215 = 0; local215 < local697.anIntArray15.length; local215++) {
													local697.anIntArray15[local215] = 0;
													local697.anIntArray9[local215] = 0;
												}
											}
											Static69.method1014(local195);
											local215 = Static48.aClass3_Sub4_Sub1_43.method1270();
											for (local722 = 0; local722 < local215; local722++) {
												local714 = Static48.aClass3_Sub4_Sub1_43.method1278();
												if (local714 == 255) {
													local714 = Static48.aClass3_Sub4_Sub1_43.method1242();
												}
												local331 = Static48.aClass3_Sub4_Sub1_43.method1280();
												if (local697 != null && local722 < local697.anIntArray15.length) {
													local697.anIntArray15[local722] = local331;
													local697.anIntArray9[local722] = local714;
												}
												Static51.method787(local722, local714, local195, local331 - 1);
											}
											if (local697 != null) {
												Static9.method237(local697);
											}
											Static151.method2218();
											Static157.anIntArray237[Static101.anInt2070++ & 0x1F] = local195 & 0x7FFF;
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 11) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1278();
											@Pc(3392) Class42 local3392 = new Class42();
											local195 = local127 >> 6;
											local3392.anInt1605 = local127 & 0x3F;
											local3392.anInt1600 = Static48.aClass3_Sub4_Sub1_43.method1278();
											if (local3392.anInt1600 >= 0 && local3392.anInt1600 < Static208.aClass3_Sub3_Sub2_Sub1Array10.length) {
												if (local3392.anInt1605 == 1 || local3392.anInt1605 == 10) {
													local3392.anInt1602 = Static48.aClass3_Sub4_Sub1_43.method1270();
													Static48.aClass3_Sub4_Sub1_43.anInt1758 += 3;
												} else if (local3392.anInt1605 >= 2 && local3392.anInt1605 <= 6) {
													if (local3392.anInt1605 == 2) {
														local3392.anInt1603 = 64;
														local3392.anInt1599 = 64;
													}
													if (local3392.anInt1605 == 3) {
														local3392.anInt1599 = 64;
														local3392.anInt1603 = 0;
													}
													if (local3392.anInt1605 == 4) {
														local3392.anInt1603 = 128;
														local3392.anInt1599 = 64;
													}
													if (local3392.anInt1605 == 5) {
														local3392.anInt1603 = 64;
														local3392.anInt1599 = 0;
													}
													if (local3392.anInt1605 == 6) {
														local3392.anInt1599 = 128;
														local3392.anInt1603 = 64;
													}
													local3392.anInt1605 = 2;
													local3392.anInt1601 = Static48.aClass3_Sub4_Sub1_43.method1270();
													local3392.anInt1606 = Static48.aClass3_Sub4_Sub1_43.method1270();
													local3392.anInt1598 = Static48.aClass3_Sub4_Sub1_43.method1278();
												}
												local3392.anInt1604 = Static48.aClass3_Sub4_Sub1_43.method1270();
												if (local3392.anInt1604 == 65535) {
													local3392.anInt1604 = -1;
												}
												Static192.aClass42Array1[local195] = local3392;
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 216) {
											local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
											local201 = Static48.aClass3_Sub4_Sub1_43.method1270();
											@Pc(3574) Class70 local3574 = Static118.method1710(local201).method1190(Static48.aClass3_Sub4_Sub1_43);
											Static199.method3159(local3574, 19, local201, method1641(local302).method2033(), null);
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 242) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1242();
											local1244 = Static146.method2127(local127);
											local1244.anInt224 = 3;
											local1244.anInt201 = Static144.aClass26_Sub2_Sub1_1.aClass101_1.method3319();
											Static9.method237(local1244);
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 59) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1281();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1242();
											local201 = Static48.aClass3_Sub4_Sub1_43.method1295();
											local2011 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local195);
											if (local2011 != null) {
												Static151.method2214(local2011, local2011.anInt1427 != local201);
											}
											Static132.method1846(local195, local127, local201);
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 230) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1245();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1245();
											@Pc(3694) Class3_Sub10 local3694 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local127);
											local2011 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local195);
											if (local2011 != null) {
												Static151.method2214(local2011, local2011.anInt1427 != local3694.anInt1427);
											}
											if (local3694 != null) {
												local3694.method3320();
												Static144.aClass40_9.method1027(local3694, (long) local195);
											}
											local642 = Static146.method2127(local127);
											if (local642 != null) {
												Static9.method237(local642);
											}
											local642 = Static146.method2127(local195);
											if (local642 != null) {
												Static9.method237(local642);
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 10) {
											for (local127 = 0; local127 < Static16.anIntArray27.length; local127++) {
												if (Static124.anIntArray331[local127] != Static16.anIntArray27[local127]) {
													Static16.anIntArray27[local127] = Static124.anIntArray331[local127];
													Static187.method2947(local127);
													Static184.anIntArray324[Static49.anInt1001++ & 0x1F] = local127;
												}
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 224) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1278();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1278();
											local201 = Static48.aClass3_Sub4_Sub1_43.method1278();
											local215 = Static48.aClass3_Sub4_Sub1_43.method1278();
											local722 = Static48.aClass3_Sub4_Sub1_43.method1270();
											Static147.aBooleanArray13[local127] = true;
											Static175.anIntArray294[local127] = local195;
											Static209.anIntArray379[local127] = local201;
											Static76.anIntArray80[local127] = local215;
											Static122.anIntArray147[local127] = local722;
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 83) {
											local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
											local829 = Static48.aClass3_Sub4_Sub1_43.method1270();
											local1328 = Static48.aClass3_Sub4_Sub1_43.method1271();
											local331 = Static48.aClass3_Sub4_Sub1_43.method1278();
											@Pc(3875) long local3875 = (local829 << 32) + local1328;
											@Pc(3877) boolean local3877 = false;
											for (local495 = 0; local495 < 100; local495++) {
												if (Static203.aLongArray9[local495] == local3875) {
													local3877 = true;
													break;
												}
											}
											if (local331 <= 1) {
												for (local1346 = 0; local1346 < Static61.anInt1297; local1346++) {
													if (Static183.aLongArray6[local1346] == local302) {
														local3877 = true;
														break;
													}
												}
											}
											if (!local3877 && Static203.anInt4145 == 0) {
												Static203.aLongArray9[Static25.anInt535] = local3875;
												Static25.anInt535 = (Static25.anInt535 + 1) % 100;
												local513 = Static173.method3101(Static78.method1147(Static48.aClass3_Sub4_Sub1_43).method2046());
												if (local331 == 2 || local331 == 3) {
													Static135.method1934(local513, 7, Static207.method3296(new Class70[] { Static99.aClass70_996, method1641(local302).method2033() }));
												} else if (local331 == 1) {
													Static135.method1934(local513, 7, Static207.method3296(new Class70[] { Static16.aClass70_165, method1641(local302).method2033() }));
												} else {
													Static135.method1934(local513, 3, method1641(local302).method2033());
												}
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 203) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1267();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1242();
											local201 = Static48.aClass3_Sub4_Sub1_43.method1282();
											local3225 = Static146.method2127(local195);
											local3225.aByte5 = 0;
											local3225.anInt236 = local3225.anInt223 = local201;
											local3225.aByte4 = 0;
											local3225.anInt219 = local3225.anInt202 = local127;
											Static9.method237(local3225);
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 136) {
											Static211.anInt4256 = Static48.aClass3_Sub4_Sub1_43.method1278();
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 100) {
											Static167.method2488();
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 27) {
											Static139.anInt4131 = Static48.aClass3_Sub4_Sub1_43.method1280() * 30;
											Static52.anInt1119 = Static86.anInt1703;
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 1) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1278();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1281();
											local201 = Static48.aClass3_Sub4_Sub1_43.method1281();
											Static137.anInt2795 = local195 >> 1;
											Static144.aClass26_Sub2_Sub1_1.method1858(local201, (local195 & 0x1) == 1, local127);
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 166) {
											local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
											Static48.aClass3_Sub4_Sub1_43.method1248();
											local829 = Static48.aClass3_Sub4_Sub1_43.method1272();
											local1328 = Static48.aClass3_Sub4_Sub1_43.method1270();
											local2901 = Static48.aClass3_Sub4_Sub1_43.method1271();
											@Pc(4178) long local4178 = local2901 + (local1328 << 32);
											@Pc(4180) boolean local4180 = false;
											local447 = Static48.aClass3_Sub4_Sub1_43.method1278();
											local454 = Static48.aClass3_Sub4_Sub1_43.method1270();
											for (local2946 = 0; local2946 < 100; local2946++) {
												if (local4178 == Static203.aLongArray9[local2946]) {
													local4180 = true;
													break;
												}
											}
											if (local447 <= 1) {
												for (@Pc(4219) int local4219 = 0; local4219 < Static61.anInt1297; local4219++) {
													if (Static183.aLongArray6[local4219] == local302) {
														local4180 = true;
														break;
													}
												}
											}
											if (!local4180 && Static203.anInt4145 == 0) {
												Static203.aLongArray9[Static25.anInt535] = local4178;
												Static25.anInt535 = (Static25.anInt535 + 1) % 100;
												@Pc(4263) Class70 local4263 = Static118.method1710(local454).method1190(Static48.aClass3_Sub4_Sub1_43);
												if (local447 == 2 || local447 == 3) {
													Static199.method3159(local4263, 20, local454, Static207.method3296(new Class70[] { Static99.aClass70_996, method1641(local302).method2033() }), method1641(local829).method2033());
												} else if (local447 == 1) {
													Static199.method3159(local4263, 20, local454, Static207.method3296(new Class70[] { Static16.aClass70_165, method1641(local302).method2033() }), method1641(local829).method2033());
												} else {
													Static199.method3159(local4263, 20, local454, method1641(local302).method2033(), method1641(local829).method2033());
												}
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 167) {
											for (local127 = 0; local127 < Static33.anInt722; local127++) {
												@Pc(4368) Class3_Sub3_Sub6 local4368 = Static85.method1229(local127);
												if (local4368 != null && local4368.anInt769 == 0) {
													Static124.anIntArray331[local127] = 0;
													Static16.anIntArray27[local127] = 0;
												}
											}
											Static151.method2218();
											Static49.anInt1001 += 32;
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 50) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1294();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1262();
											local697 = Static146.method2127(local195);
											if (local697.anInt248 != local127 || local127 == -1) {
												local697.anInt265 = 0;
												local697.anInt210 = 0;
												local697.anInt248 = local127;
												Static9.method237(local697);
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 246) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1257();
											local201 = local127 >> 10 & 0x1F;
											local195 = Static48.aClass3_Sub4_Sub1_43.method1245();
											local722 = local127 & 0x1F;
											@Pc(4473) Class6 local4473 = Static146.method2127(local195);
											local215 = local127 >> 5 & 0x1F;
											local714 = (local215 << 11) + ((local201 << 19) + (local722 << 3));
											if (local714 != local4473.anInt243) {
												local4473.anInt243 = local714;
												Static9.method237(local4473);
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 188) {
											Static146.method2130(true);
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 58) {
											Static84.anInt1663 = Static48.aClass3_Sub4_Sub1_43.method1278();
											Static53.anInt1129 = Static48.aClass3_Sub4_Sub1_43.method1278();
											Static207.anInt4220 = Static48.aClass3_Sub4_Sub1_43.method1278();
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 90 || Static155.anInt3189 == 211 || Static155.anInt3189 == 207 || Static155.anInt3189 == 223 || Static155.anInt3189 == 198 || Static155.anInt3189 == 189 || Static155.anInt3189 == 64 || Static155.anInt3189 == 110 || Static155.anInt3189 == 238 || Static155.anInt3189 == 18 || Static155.anInt3189 == 229) {
											Static41.method682();
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 187) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1295();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1262();
											if (local127 == 65535) {
												local127 = -1;
											}
											local201 = Static48.aClass3_Sub4_Sub1_43.method1279();
											local3225 = Static146.method2127(local201);
											@Pc(4621) Class3_Sub3_Sub11 local4621;
											if (local3225.aBoolean21) {
												local3225.anInt238 = local195;
												local3225.anInt254 = local127;
												local4621 = Static14.method275(local127);
												local3225.anInt200 = local4621.anInt1218;
												local3225.anInt263 = local4621.anInt1233;
												local3225.anInt245 = local4621.anInt1251;
												if (local3225.anInt268 > 0) {
													local3225.anInt245 = local3225.anInt245 * 32 / local3225.anInt268;
												} else if (local3225.anInt247 > 0) {
													local3225.anInt245 = local3225.anInt245 * 32 / local3225.anInt247;
												}
												local3225.anInt273 = local4621.anInt1266;
												local3225.anInt204 = local4621.anInt1255;
												local3225.anInt276 = local4621.anInt1254;
												Static9.method237(local3225);
											} else if (local127 == -1) {
												local3225.anInt224 = 0;
												Static155.anInt3189 = -1;
												return true;
											} else {
												local4621 = Static14.method275(local127);
												local3225.anInt224 = 4;
												local3225.anInt200 = local4621.anInt1218;
												local3225.anInt245 = local4621.anInt1251 * 100 / local195;
												local3225.anInt201 = local127;
												local3225.anInt263 = local4621.anInt1233;
												Static9.method237(local3225);
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 146) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1245();
											@Pc(4739) Class3_Sub10 local4739 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local127);
											if (local4739 != null) {
												Static151.method2214(local4739, true);
											}
											if (Static72.aClass6_40 != null) {
												Static9.method237(Static72.aClass6_40);
												Static72.aClass6_40 = null;
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 170) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1279();
											local823 = Static48.aClass3_Sub4_Sub1_43.method1246();
											local697 = Static146.method2127(local127);
											if (!local823.method2032(local697.aClass70_122)) {
												local697.aClass70_122 = local823;
												Static9.method237(local697);
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 47) {
											Static36.anInt791 = Static86.anInt1703;
											local302 = Static48.aClass3_Sub4_Sub1_43.method1272();
											if (local302 == 0L) {
												Static155.anInt3189 = -1;
												Static34.aClass70_346 = null;
												Static144.anInt2952 = 0;
												Static86.aClass3_Sub13Array1 = null;
												Static150.aClass70_1451 = null;
												return true;
											}
											local829 = Static48.aClass3_Sub4_Sub1_43.method1272();
											Static34.aClass70_346 = method1641(local829);
											Static150.aClass70_1451 = method1641(local302);
											Static12.aByte6 = Static48.aClass3_Sub4_Sub1_43.method1248();
											local722 = Static48.aClass3_Sub4_Sub1_43.method1278();
											if (local722 == 255) {
												Static155.anInt3189 = -1;
												return true;
											}
											Static144.anInt2952 = local722;
											@Pc(4852) Class3_Sub13[] local4852 = new Class3_Sub13[100];
											for (local331 = 0; local331 < Static144.anInt2952; local331++) {
												local4852[local331] = new Class3_Sub13();
												local4852[local331].aLong147 = Static48.aClass3_Sub4_Sub1_43.method1272();
												local4852[local331].aClass70_970 = method1641(local4852[local331].aLong147);
												local4852[local331].anInt1978 = Static48.aClass3_Sub4_Sub1_43.method1270();
												local4852[local331].aByte10 = Static48.aClass3_Sub4_Sub1_43.method1248();
												local4852[local331].aClass70_969 = Static48.aClass3_Sub4_Sub1_43.method1246();
												if (local4852[local331].aLong147 == Static74.aLong44) {
													Static92.aByte9 = local4852[local331].aByte10;
												}
											}
											local454 = Static144.anInt2952;
											while (local454 > 0) {
												local454--;
												local451 = true;
												for (local495 = 0; local495 < local454; local495++) {
													if (local4852[local495].aClass70_970.method2050(local4852[local495 + 1].aClass70_970) > 0) {
														@Pc(4953) Class3_Sub13 local4953 = local4852[local495];
														local451 = false;
														local4852[local495] = local4852[local495 + 1];
														local4852[local495 + 1] = local4953;
													}
												}
												if (local451) {
													break;
												}
											}
											Static86.aClass3_Sub13Array1 = local4852;
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 49) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1295();
											local195 = Static48.aClass3_Sub4_Sub1_43.method1243();
											if (local195 == 1) {
												Static61.method944();
												for (local201 = 0; local201 < 4; local201++) {
													Static28.aClass77Array1[local201].method2164();
												}
												System.gc();
											} else if (local195 == 2) {
												Static182.method2847();
												System.gc();
												Static29.method515(25);
											}
											Static63.anInt1331 = local127;
											Static101.method1450(local127);
											Static109.method1547();
											Static166.method2464(Static63.anInt1331);
											for (local201 = 0; local201 < 100; local201++) {
												Static165.aBooleanArray14[local201] = true;
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 61) {
											local127 = Static48.aClass3_Sub4_Sub1_43.method1245();
											Static112.aClass29_7 = Static47.aClass47_1.method1365(local127);
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 162) {
											Static155.anInt3189 = -1;
											Static65.anInt1365 = 0;
											return true;
										} else if (Static155.anInt3189 == 132) {
											Static192.aBoolean174 = true;
											Static136.anInt2773 = Static48.aClass3_Sub4_Sub1_43.method1278();
											Static57.anInt1238 = Static48.aClass3_Sub4_Sub1_43.method1278();
											Static47.anInt970 = Static48.aClass3_Sub4_Sub1_43.method1270();
											Static45.anInt957 = Static48.aClass3_Sub4_Sub1_43.method1278();
											Static50.anInt1042 = Static48.aClass3_Sub4_Sub1_43.method1278();
											if (Static50.anInt1042 >= 100) {
												local127 = Static136.anInt2773 * 128 + 64;
												local195 = Static57.anInt1238 * 128 + 64;
												local201 = Static107.method2399(local195, local127, Static137.anInt2795) - Static47.anInt970;
												local215 = local127 - Static130.anInt2546;
												local714 = local195 - Static54.anInt1158;
												local722 = local201 - Static118.anInt2400;
												local331 = (int) Math.sqrt((double) (local714 * local714 + local215 * local215));
												Static122.anInt2464 = (int) (Math.atan2((double) local722, (double) local331) * 325.949D) & 0x7FF;
												Static183.anInt2962 = (int) (-325.949D * Math.atan2((double) local215, (double) local714)) & 0x7FF;
												if (Static122.anInt2464 < 128) {
													Static122.anInt2464 = 128;
												}
												if (Static122.anInt2464 > 383) {
													Static122.anInt2464 = 383;
												}
											}
											Static155.anInt3189 = -1;
											return true;
										} else if (Static155.anInt3189 == 252) {
											Static110.method1588();
											Static155.anInt3189 = -1;
											return true;
										} else {
											Static208.method1860("T1 - " + Static155.anInt3189 + "," + Static141.anInt2853 + "," + Static121.anInt2459 + " - " + Static192.anInt3908, null);
											Static5.method88();
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	public static void method1638() {
		if (Static97.anInt2019 < 128) {
			Static97.anInt2019 = 128;
		}
		if (Static97.anInt2019 > 383) {
			Static97.anInt2019 = 383;
		}
		Static179.anInt1329 &= 0x7FF;
		@Pc(23) int local23 = Static119.anInt2412 >> 7;
		@Pc(27) int local27 = Static47.anInt972 >> 7;
		@Pc(33) int local33 = Static107.method2399(Static47.anInt972, Static119.anInt2412, Static137.anInt2795);
		@Pc(39) int local39 = 0;
		@Pc(55) int local55;
		if (local23 > 3 && local27 > 3 && local23 < 100 && local27 < 100) {
			for (local55 = local23 - 4; local55 <= local23 + 4; local55++) {
				for (@Pc(61) int local61 = local27 - 4; local61 <= local27 + 4; local61++) {
					@Pc(65) int local65 = Static137.anInt2795;
					if (local65 < 3 && (Static17.aByteArrayArrayArray2[1][local55][local61] & 0x2) == 2) {
						local65++;
					}
					@Pc(90) int local90 = local33 - Static23.anIntArrayArrayArray4[local65][local55][local61];
					if (local90 > local39) {
						local39 = local90;
					}
				}
			}
		}
		local55 = local39 * 192;
		if (local55 > 98048) {
			local55 = 98048;
		}
		if (local55 < 32768) {
			local55 = 32768;
		}
		if (local55 > Static36.anInt790) {
			Static36.anInt790 += (local55 - Static36.anInt790) / 24;
		} else if (local55 < Static36.anInt790) {
			Static36.anInt790 += (local55 - Static36.anInt790) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III[B[Lclient!pd;)V")
	public static void method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class77[] arg3) {
		@Pc(10) Class3_Sub4 local10 = new Class3_Sub4(arg2);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method1253();
			if (local24 == 0) {
				return;
			}
			@Pc(31) int local31 = 0;
			local20 += local24;
			while (true) {
				@Pc(39) int local39 = local10.method1266();
				if (local39 == 0) {
					break;
				}
				local31 += local39 - 1;
				@Pc(54) int local54 = local31 & 0x3F;
				@Pc(60) int local60 = local31 >> 6 & 0x3F;
				@Pc(64) int local64 = local31 >> 12;
				@Pc(68) int local68 = local10.method1278();
				@Pc(72) int local72 = local68 & 0x3;
				@Pc(76) int local76 = local68 >> 2;
				@Pc(80) int local80 = arg0 + local60;
				@Pc(84) int local84 = local54 + arg1;
				if (local80 > 0 && local84 > 0 && local80 < 103 && local84 < 103) {
					@Pc(106) int local106 = local64;
					if ((Static17.aByteArrayArrayArray2[1][local80][local84] & 0x2) == 2) {
						local106 = local64 - 1;
					}
					@Pc(120) Class77 local120 = null;
					if (local106 >= 0) {
						local120 = arg3[local106];
					}
					Static138.method1976(local64, local84, local120, local20, true, local80, local72, local64, local76, Static50.aBoolean66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)Lclient!oc;")
	public static Class70 method1641(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(42) byte[] local42 = new byte[local25];
			while (arg0 != 0L) {
				@Pc(45) long local45 = arg0;
				arg0 /= 37L;
				local25--;
				local42[local25] = Static22.aByteArray1[(int) (local45 - arg0 * 37L)];
			}
			@Pc(75) Class70 local75 = new Class70();
			local75.aByteArray30 = local42;
			local75.anInt2899 = local42.length;
			return local75;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static126.method1762(arg2)) {
			Static156.aClass6Array2 = null;
			Static55.method874(arg6, arg0, arg3, arg1, Static49.aClass6ArrayArray1[arg2], -1, arg4, arg7, arg5);
			if (Static156.aClass6Array2 != null) {
				Static55.method874(arg6, arg0, arg3, Static122.anInt2467, Static156.aClass6Array2, -1412584499, arg4, arg7, Static34.anInt749);
				Static156.aClass6Array2 = null;
			}
		} else if (arg4 == -1) {
			for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
				Static165.aBooleanArray14[local21] = true;
			}
		} else {
			Static165.aBooleanArray14[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZII)I")
	public static int method1644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + (arg0 >> 2 << 10) + (arg2 >> 1);
	}
}
