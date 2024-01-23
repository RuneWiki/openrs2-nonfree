import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public static int anInt3465;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_8;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public static int anInt3464 = 0;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public static int anInt3466 = 0;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
	public static int[] anIntArray351 = new int[4];

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString116 = "purple:";

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public static volatile int anInt3470 = 0;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public static int anInt3472 = 0;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "[I")
	public static int[] anIntArray352 = new int[100];

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
	public static int anInt3474 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I")
	public static int method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		} else {
			@Pc(13) int local13 = 128 - arg1;
			@Pc(31) int local31 = arg1 * ((arg2 & -16711936) >>> 7) + local13 * ((-16711936 & arg0) >>> 7) & 0xFF00FF00;
			@Pc(54) int local54 = (arg2 & 0xFF00FF) * arg1 + (arg0 & 0xFF00FF) * local13 & 0xFF00FF00;
			return (local54 >> 7) + local31;
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public static void method2847() {
		if (Static48.anInt1204 > 1) {
			Static44.anInt1147 = Static291.anInt5632;
			Static48.anInt1204--;
		}
		if (Static142.anInt3132 > 0) {
			Static142.anInt3132--;
		}
		if (Static19.aBoolean29) {
			Static19.aBoolean29 = false;
			Static154.method2844();
			return;
		}
		@Pc(35) int local35;
		for (local35 = 0; local35 < 100 && Static96.method1672(); local35++) {
		}
		if (Static64.anInt1561 != 30) {
			return;
		}
		Static281.method4395(Static211.aClass2_Sub16_Sub1_2);
		@Pc(61) Object local61 = Static137.aClass88_1.anObject3;
		@Pc(96) int local96;
		@Pc(98) int local98;
		@Pc(117) int local117;
		@Pc(136) int local136;
		@Pc(203) int local203;
		@Pc(198) int local198;
		synchronized (Static137.aClass88_1.anObject3) {
			if (!Static71.aBoolean114) {
				Static137.aClass88_1.anInt3091 = 0;
			} else if (Static98.anInt2337 != 0 || Static137.aClass88_1.anInt3091 >= 40) {
				Static211.aClass2_Sub16_Sub1_2.method2198(160);
				Static211.aClass2_Sub16_Sub1_2.method2168(0);
				@Pc(94) int local94 = Static211.aClass2_Sub16_Sub1_2.anInt2789;
				local96 = 0;
				for (local98 = 0; Static137.aClass88_1.anInt3091 > local98 && Static211.aClass2_Sub16_Sub1_2.anInt2789 - local94 < 240; local98++) {
					local96++;
					local117 = Static137.aClass88_1.anIntArray312[local98];
					if (local117 < 0) {
						local117 = 0;
					} else if (local117 > 65534) {
						local117 = 65534;
					}
					local136 = Static137.aClass88_1.anIntArray311[local98];
					if (local136 < 0) {
						local136 = 0;
					} else if (local136 > 65534) {
						local136 = 65534;
					}
					@Pc(152) boolean local152 = false;
					if (Static137.aClass88_1.anIntArray312[local98] == -1 && Static137.aClass88_1.anIntArray311[local98] == -1) {
						local117 = -1;
						local152 = true;
						local136 = -1;
					}
					if (local136 != Static230.anInt4649 || local117 != Static26.anInt4558) {
						local198 = local117 - Static26.anInt4558;
						local203 = local136 - Static230.anInt4649;
						Static26.anInt4558 = local117;
						Static230.anInt4649 = local136;
						if (Static123.anInt2855 < 8 && local203 >= -32 && local203 <= 31 && local198 >= -32 && local198 <= 31) {
							local203 += 32;
							local198 += 32;
							Static211.aClass2_Sub16_Sub1_2.method2143((Static123.anInt2855 << 12) + (local203 << 6) + local198);
							Static123.anInt2855 = 0;
						} else if (Static123.anInt2855 < 32 && local203 >= -128 && local203 <= 127 && local198 >= -128 && local198 <= 127) {
							local203 += 128;
							local198 += 128;
							Static211.aClass2_Sub16_Sub1_2.method2168(Static123.anInt2855 + 128);
							Static211.aClass2_Sub16_Sub1_2.method2143((local203 << 8) + local198);
							Static123.anInt2855 = 0;
						} else if (Static123.anInt2855 >= 32) {
							Static211.aClass2_Sub16_Sub1_2.method2143(Static123.anInt2855 + 57344);
							if (local152) {
								Static211.aClass2_Sub16_Sub1_2.method2186(Integer.MIN_VALUE);
							} else {
								Static211.aClass2_Sub16_Sub1_2.method2186(local117 << 16 | local136);
							}
							Static123.anInt2855 = 0;
						} else {
							Static211.aClass2_Sub16_Sub1_2.method2168(Static123.anInt2855 + 192);
							if (local152) {
								Static211.aClass2_Sub16_Sub1_2.method2186(Integer.MIN_VALUE);
							} else {
								Static211.aClass2_Sub16_Sub1_2.method2186(local136 | local117 << 16);
							}
							Static123.anInt2855 = 0;
						}
					} else if (Static123.anInt2855 < 2047) {
						Static123.anInt2855++;
					}
				}
				Static211.aClass2_Sub16_Sub1_2.method2131(Static211.aClass2_Sub16_Sub1_2.anInt2789 - local94);
				if (Static137.aClass88_1.anInt3091 > local96) {
					Static137.aClass88_1.anInt3091 -= local96;
					for (local98 = 0; local98 < Static137.aClass88_1.anInt3091; local98++) {
						Static137.aClass88_1.anIntArray311[local98] = Static137.aClass88_1.anIntArray311[local98 + local96];
						Static137.aClass88_1.anIntArray312[local98] = Static137.aClass88_1.anIntArray312[local98 + local96];
					}
				} else {
					Static137.aClass88_1.anInt3091 = 0;
				}
			}
		}
		if (Static98.anInt2337 != 0) {
			@Pc(428) long local428 = (Static82.aLong70 - Static106.aLong79) / 50L;
			local96 = Static252.anInt4933;
			if (local428 > 32767L) {
				local428 = 32767L;
			}
			Static106.aLong79 = Static82.aLong70;
			local98 = Static86.anInt2010;
			if (local98 < 0) {
				local98 = 0;
			} else if (local98 > 65535) {
				local98 = 65535;
			}
			local136 = (int) local428;
			if (local96 < 0) {
				local96 = 0;
			} else if (local96 > 65535) {
				local96 = 65535;
			}
			@Pc(473) byte local473 = 0;
			if (Static98.anInt2337 == 2) {
				local473 = 1;
			}
			Static211.aClass2_Sub16_Sub1_2.method2198(182);
			Static211.aClass2_Sub16_Sub1_2.method2167(local98 | local96 << 16);
			Static211.aClass2_Sub16_Sub1_2.method2164(local473 << 15 | local136);
		}
		if (Static275.anInt5454 > 0) {
			Static275.anInt5454--;
		}
		if (Static63.aBoolean100 && Static275.anInt5454 <= 0) {
			Static275.anInt5454 = 20;
			Static63.aBoolean100 = false;
			Static211.aClass2_Sub16_Sub1_2.method2198(199);
			Static211.aClass2_Sub16_Sub1_2.method2183((int) Static148.aFloat33);
			Static211.aClass2_Sub16_Sub1_2.method2164((int) Static239.aFloat51);
		}
		if (Static72.aBoolean116 && !Static92.aBoolean145) {
			Static92.aBoolean145 = true;
			Static211.aClass2_Sub16_Sub1_2.method2198(64);
			Static211.aClass2_Sub16_Sub1_2.method2168(1);
		}
		if (!Static72.aBoolean116 && Static92.aBoolean145) {
			Static92.aBoolean145 = false;
			Static211.aClass2_Sub16_Sub1_2.method2198(64);
			Static211.aClass2_Sub16_Sub1_2.method2168(0);
		}
		if (!Static38.aBoolean61) {
			Static211.aClass2_Sub16_Sub1_2.method2198(72);
			Static211.aClass2_Sub16_Sub1_2.method2173(Static108.method1849());
			Static38.aBoolean61 = true;
		}
		if (Static115.aBoolean398) {
			Static115.aBoolean398 = false;
		} else {
			Static231.aFloat46 /= 2.0F;
		}
		if (Static274.aBoolean362) {
			Static274.aBoolean362 = false;
		} else {
			Static102.aFloat11 /= 2.0F;
		}
		Static249.method3910();
		if (Static64.anInt1561 != 30) {
			return;
		}
		Static74.method1399();
		Static209.method3502();
		Static2.method73();
		Static21.anInt454++;
		if (Static21.anInt454 > 750) {
			Static154.method2844();
			return;
		}
		Static106.method1814();
		Static233.method4745();
		Static229.method3742();
		for (local35 = Static174.method3156(true); local35 != -1; local35 = Static174.method3156(false)) {
			Static143.method2545(local35);
			Static74.anIntArray156[Static274.anInt5434++ & 0x1F] = local35;
		}
		@Pc(724) int local724;
		for (@Pc(687) Class2_Sub8_Sub10 local687 = Static305.method4626(); local687 != null; local687 = Static305.method4626()) {
			local96 = local687.method2044();
			local98 = local687.method2046();
			if (local96 == 1) {
				Static14.anIntArray43[local98] = local687.anInt2698;
				Static132.anIntArray302[Static165.anInt3652++ & 0x1F] = local98;
			} else if (local96 == 2) {
				Static173.aStringArray27[local98] = local687.aString95;
				Static222.anIntArray450[Static74.anInt1842++ & 0x1F] = local98;
			} else {
				@Pc(718) Class56 local718;
				if (local96 == 3) {
					local718 = Static38.method715(local98);
					if (!local687.aString95.equals(local718.aString71)) {
						local718.aString71 = local687.aString95;
						Static287.method4466(local718);
					}
				} else if (local96 == 4) {
					local718 = Static38.method715(local98);
					local203 = local687.anInt2700;
					local724 = local687.anInt2702;
					local136 = local687.anInt2698;
					if (local136 != local718.anInt2103 || local718.anInt2043 != local724 || local718.anInt2040 != local203) {
						local718.anInt2103 = local136;
						local718.anInt2040 = local203;
						local718.anInt2043 = local724;
						Static287.method4466(local718);
					}
				} else if (local96 == 5) {
					local718 = Static38.method715(local98);
					if (local687.anInt2698 != local718.anInt2089 || local687.anInt2698 == -1) {
						local718.anInt2089 = local687.anInt2698;
						local718.anInt2095 = 0;
						local718.anInt2093 = 0;
						local718.anInt2047 = 1;
						Static287.method4466(local718);
					}
				} else if (local96 == 6) {
					local117 = local687.anInt2698;
					local203 = local117 & 0x1F;
					local136 = local117 >> 10 & 0x1F;
					@Pc(1125) Class56 local1125 = Static38.method715(local98);
					local724 = local117 >> 5 & 0x1F;
					local198 = (local203 << 3) + (local136 << 19) + (local724 << 11);
					if (local198 != local1125.anInt2078) {
						local1125.anInt2078 = local198;
						Static287.method4466(local1125);
					}
				} else if (local96 == 7) {
					local718 = Static38.method715(local98);
					@Pc(1091) boolean local1091 = local687.anInt2698 == 1;
					if (local718.aBoolean139 != local1091) {
						local718.aBoolean139 = local1091;
						Static287.method4466(local718);
					}
				} else if (local96 == 8) {
					local718 = Static38.method715(local98);
					if (local687.anInt2698 != local718.anInt2042 || local687.anInt2702 != local718.anInt2109 || local718.anInt2101 != local687.anInt2700) {
						local718.anInt2109 = local687.anInt2702;
						local718.anInt2042 = local687.anInt2698;
						local718.anInt2101 = local687.anInt2700;
						if (local718.anInt2085 != -1) {
							if (local718.anInt2100 > 0) {
								local718.anInt2101 = local718.anInt2101 * 32 / local718.anInt2100;
							} else if (local718.anInt2034 > 0) {
								local718.anInt2101 = local718.anInt2101 * 32 / local718.anInt2034;
							}
						}
						Static287.method4466(local718);
					}
				} else if (local96 == 9) {
					local718 = Static38.method715(local98);
					if (local687.anInt2698 != local718.anInt2085 || local718.anInt2088 != local687.anInt2702) {
						local718.anInt2088 = local687.anInt2702;
						local718.anInt2085 = local687.anInt2698;
						Static287.method4466(local718);
					}
				} else if (local96 == 10) {
					local718 = Static38.method715(local98);
					if (local687.anInt2698 != local718.anInt2049 || local687.anInt2702 != local718.anInt2116 || local718.anInt2071 != local687.anInt2700) {
						local718.anInt2049 = local687.anInt2698;
						local718.anInt2071 = local687.anInt2700;
						local718.anInt2116 = local687.anInt2702;
						Static287.method4466(local718);
					}
				} else if (local96 == 11) {
					local718 = Static38.method715(local98);
					local718.anInt2048 = local718.anInt2036 = local687.anInt2702;
					local718.aByte4 = 0;
					local718.anInt2105 = local718.anInt2113 = local687.anInt2698;
					local718.aByte5 = 0;
					Static287.method4466(local718);
				} else if (local96 == 12) {
					local718 = Static38.method715(local98);
					local136 = local687.anInt2698;
					if (local718 != null && local718.anInt2092 == 0) {
						if (local718.anInt2087 - local718.anInt2031 < local136) {
							local136 = local718.anInt2087 - local718.anInt2031;
						}
						if (local136 < 0) {
							local136 = 0;
						}
						if (local136 != local718.anInt2039) {
							local718.anInt2039 = local136;
							Static287.method4466(local718);
						}
					}
				} else if (local96 == 13) {
					local718 = Static38.method715(local98);
					local718.anInt2060 = local687.anInt2698;
				} else if (local96 == 14) {
					local718 = Static38.method715(local98);
					local718.anInt2112 = local687.anInt2698;
				}
			}
		}
		Static247.anInt1733++;
		if (Static101.anInt2394 != 0) {
			Static199.anInt4353 += 20;
			if (Static199.anInt4353 >= 400) {
				Static101.anInt2394 = 0;
			}
		}
		if (Static137.aClass56_13 != null) {
			Static26.anInt4565++;
			if (Static26.anInt4565 >= 15) {
				Static287.method4466(Static137.aClass56_13);
				Static137.aClass56_13 = null;
			}
		}
		@Pc(1327) Class56 local1327;
		if (Static79.aClass56_8 != null) {
			Static287.method4466(Static79.aClass56_8);
			if (Static85.anInt1997 + 5 < Static131.anInt3016 || Static131.anInt3016 < Static85.anInt1997 - 5 || Static281.anInt5551 > Static253.anInt4975 + 5 || Static253.anInt4975 - 5 > Static281.anInt5551) {
				Static132.aBoolean211 = true;
			}
			Static303.anInt5850++;
			if (Static307.anInt5933 == 0) {
				if (Static132.aBoolean211 && Static303.anInt5850 >= 5) {
					if (Static34.aClass56_5 == Static79.aClass56_8 && Static85.anInt2005 != Static179.anInt3897) {
						local1327 = Static79.aClass56_8;
						@Pc(1329) byte local1329 = 0;
						if (Static236.anInt4769 == 1 && local1327.anInt2074 == 206) {
							local1329 = 1;
						}
						if (local1327.anIntArray178[Static179.anInt3897] <= 0) {
							local1329 = 0;
						}
						if (Static42.method804(local1327).method338()) {
							local136 = Static179.anInt3897;
							local117 = Static85.anInt2005;
							local1327.anIntArray178[local136] = local1327.anIntArray178[local117];
							local1327.anIntArray180[local136] = local1327.anIntArray180[local117];
							local1327.anIntArray178[local117] = -1;
							local1327.anIntArray180[local117] = 0;
						} else if (local1329 == 1) {
							local117 = Static85.anInt2005;
							local136 = Static179.anInt3897;
							while (local117 != local136) {
								if (local117 > local136) {
									local1327.method1571(local117 - 1, local117);
									local117--;
								} else if (local136 > local117) {
									local1327.method1571(local117 + 1, local117);
									local117++;
								}
							}
						} else {
							local1327.method1571(Static179.anInt3897, Static85.anInt2005);
						}
						Static211.aClass2_Sub16_Sub1_2.method2198(215);
						Static211.aClass2_Sub16_Sub1_2.method2189(local1329);
						Static211.aClass2_Sub16_Sub1_2.method2167(Static79.aClass56_8.anInt2096);
						Static211.aClass2_Sub16_Sub1_2.method2180(Static85.anInt2005);
						Static211.aClass2_Sub16_Sub1_2.method2143(Static179.anInt3897);
					}
				} else if ((Static238.anInt5978 == 1 || Static183.method3239(Static68.anInt1741 - 1)) && Static68.anInt1741 > 2) {
					Static13.method239();
				} else if (Static68.anInt1741 > 0) {
					Static121.method2022();
				}
				Static26.anInt4565 = 10;
				Static79.aClass56_8 = null;
				Static98.anInt2337 = 0;
			}
		}
		Static189.aBoolean274 = false;
		Static49.anInt1230 = 0;
		Static71.aBoolean115 = false;
		local1327 = Static141.aClass56_14;
		Static141.aClass56_14 = null;
		@Pc(1474) Class56 local1474 = Static128.aClass56_12;
		Static128.aClass56_12 = null;
		Static10.aClass56_1 = null;
		while (Static264.method4162() && Static49.anInt1230 < 128) {
			Static190.anIntArray398[Static49.anInt1230] = Static21.anInt465;
			Static126.anIntArray392[Static49.anInt1230] = Static305.aChar3;
			Static49.anInt1230++;
		}
		Static78.aClass56_3 = null;
		if (Static303.anInt5868 != -1) {
			Static180.method3216(0, Static120.anInt2649, Static303.anInt5868, Static60.anInt1510, 0, 0, 0);
		}
		Static291.anInt5632++;
		if (Static78.aClass56_3 != null) {
			Static169.method3079();
		}
		while (true) {
			@Pc(1549) Class56 local1549;
			@Pc(1538) Class56 local1538;
			@Pc(1531) Class2_Sub12 local1531;
			do {
				local1531 = (Class2_Sub12) Static100.aClass44_11.method1353();
				if (local1531 == null) {
					while (true) {
						do {
							local1531 = (Class2_Sub12) Static149.aClass44_19.method1353();
							if (local1531 == null) {
								while (true) {
									do {
										local1531 = (Class2_Sub12) Static145.aClass44_18.method1353();
										if (local1531 == null) {
											if (Static78.aClass56_3 == null) {
												Static28.anInt626 = 0;
											}
											if (Static199.aClass56_19 != null) {
												Static291.method4446();
											}
											if (Static175.anInt3864 > 0 && Static145.aBooleanArray13[82] && Static145.aBooleanArray13[81] && Static55.anInt1397 != 0) {
												local117 = Static32.anInt876 - Static55.anInt1397;
												if (local117 < 0) {
													local117 = 0;
												} else if (local117 > 3) {
													local117 = 3;
												}
												Static100.method1726(local117, Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] + Static160.anInt5159, Static234.anInt4705 - -Static22.aClass15_Sub2_Sub2_1.anIntArray518[0]);
											}
											if (Static175.anInt3864 > 0 && Static145.aBooleanArray13[82] && Static145.aBooleanArray13[81]) {
												if (Static263.anInt5180 != -1) {
													Static100.method1726(Static32.anInt876, Static160.anInt5159 + Static263.anInt5180, Static268.anInt5229 + Static234.anInt4705);
												}
												Static197.anInt4175 = 0;
												Static223.anInt4546 = 0;
											} else if (Static223.anInt4546 == 2) {
												if (Static263.anInt5180 != -1) {
													Static211.aClass2_Sub16_Sub1_2.method2198(195);
													Static211.aClass2_Sub16_Sub1_2.method2183(Static239.anInt4787);
													Static211.aClass2_Sub16_Sub1_2.method2180(Static234.anInt4705 + Static268.anInt5229);
													Static211.aClass2_Sub16_Sub1_2.method2173(Static220.anInt4519);
													Static211.aClass2_Sub16_Sub1_2.method2143(Static160.anInt5159 + Static263.anInt5180);
													Static226.anInt6057 = Static252.anInt4933;
													Static101.anInt2394 = 1;
													Static60.anInt1512 = Static86.anInt2010;
													Static199.anInt4353 = 0;
												}
												Static223.anInt4546 = 0;
											} else if (Static197.anInt4175 == 2) {
												if (Static263.anInt5180 != -1) {
													Static211.aClass2_Sub16_Sub1_2.method2198(105);
													Static211.aClass2_Sub16_Sub1_2.method2183(Static263.anInt5180 + Static160.anInt5159);
													Static211.aClass2_Sub16_Sub1_2.method2143(Static234.anInt4705 + Static268.anInt5229);
													Static101.anInt2394 = 1;
													Static199.anInt4353 = 0;
													Static60.anInt1512 = Static86.anInt2010;
													Static226.anInt6057 = Static252.anInt4933;
												}
												Static197.anInt4175 = 0;
											} else if (Static263.anInt5180 != -1 && Static223.anInt4546 == 0 && Static197.anInt4175 == 0) {
												local117 = (Static263.anInt5180 << 1) - (Static22.aClass15_Sub2_Sub2_1.method4286() - 1) >> 1;
												local136 = (Static268.anInt5229 << 1) - (Static22.aClass15_Sub2_Sub2_1.method4286() - 1) >> 1;
												Static272.method4307(local117, 0, local136);
												Static199.anInt4353 = 0;
												Static226.anInt6057 = Static252.anInt4933;
												Static101.anInt2394 = 1;
												Static60.anInt1512 = Static86.anInt2010;
												Static3.method82(0, local136, 0, 0, 0, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0], Static22.aClass15_Sub2_Sub2_1.anIntArray516[0], local117, 0);
											}
											Static263.anInt5180 = -1;
											Static74.method1400();
											if (Static141.aClass56_14 != local1327) {
												if (local1327 != null) {
													Static287.method4466(local1327);
												}
												if (Static141.aClass56_14 != null) {
													Static287.method4466(Static141.aClass56_14);
												}
											}
											if (local1474 != Static128.aClass56_12 && Static121.anInt2672 == Static74.anInt1837) {
												if (local1474 != null) {
													Static287.method4466(local1474);
												}
												if (Static128.aClass56_12 != null) {
													Static287.method4466(Static128.aClass56_12);
												}
											}
											if (Static128.aClass56_12 == null) {
												if (Static74.anInt1837 > 0) {
													Static74.anInt1837--;
												}
											} else if (Static74.anInt1837 < Static121.anInt2672) {
												Static74.anInt1837++;
												if (Static74.anInt1837 == Static121.anInt2672) {
													Static287.method4466(Static128.aClass56_12);
												}
											}
											for (local117 = 0; local117 < 5; local117++) {
												@Pc(1990) int local1990 = Static66.anIntArray135[local117]++;
											}
											local117 = Static22.method438();
											local136 = Static308.method4664();
											if (local117 > 15000 && local136 > 15000) {
												Static142.anInt3132 = 250;
												Static201.method3410(14500);
												Static211.aClass2_Sub16_Sub1_2.method2198(30);
											}
											if (Static117.aClass111_2 != null && Static117.aClass111_2.anInt3788 == 1) {
												if (Static117.aClass111_2.anObject4 != null) {
													Static205.method3473(Static230.aString160, Static291.aBoolean371);
												}
												Static291.aBoolean371 = false;
												Static230.aString160 = null;
												Static117.aClass111_2 = null;
											}
											Static136.anInt3065++;
											Static306.anInt5919++;
											Static68.anInt1737++;
											if (Static68.anInt1737 > 500) {
												local724 = (int) (Math.random() * 8.0D);
												if ((local724 & 0x2) == 2) {
													Static63.anInt1541 += Static243.anInt4840;
												}
												if ((local724 & 0x4) == 4) {
													Static2.anInt62 += Static94.anInt2280;
												}
												if ((local724 & 0x1) == 1) {
													Static253.anInt4974 += Static254.anInt4996;
												}
												Static68.anInt1737 = 0;
											}
											if (Static136.anInt3065 > 500) {
												Static136.anInt3065 = 0;
												local724 = (int) (Math.random() * 8.0D);
												if ((local724 & 0x1) == 1) {
													Static301.anInt5810 += Static280.anInt5536;
												}
												if ((local724 & 0x2) == 2) {
													Static141.anInt3097 += Static154.anInt3463;
												}
											}
											if (Static63.anInt1541 < -55) {
												Static243.anInt4840 = 2;
											}
											if (Static301.anInt5810 < -60) {
												Static280.anInt5536 = 2;
											}
											if (Static141.anInt3097 < -20) {
												Static154.anInt3463 = 1;
											}
											if (Static253.anInt4974 < -50) {
												Static254.anInt4996 = 2;
											}
											if (Static301.anInt5810 > 60) {
												Static280.anInt5536 = -2;
											}
											if (Static141.anInt3097 > 10) {
												Static154.anInt3463 = -1;
											}
											if (Static253.anInt4974 > 50) {
												Static254.anInt4996 = -2;
											}
											if (Static63.anInt1541 > 55) {
												Static243.anInt4840 = -2;
											}
											if (Static2.anInt62 < -40) {
												Static94.anInt2280 = 1;
											}
											if (Static2.anInt62 > 40) {
												Static94.anInt2280 = -1;
											}
											if (Static306.anInt5919 > 50) {
												Static211.aClass2_Sub16_Sub1_2.method2198(164);
											}
											if (Static258.aBoolean335) {
												Static255.method4025();
												Static258.aBoolean335 = false;
											}
											try {
												if (Static253.aClass34_3 != null && Static211.aClass2_Sub16_Sub1_2.anInt2789 > 0) {
													Static253.aClass34_3.method1076(Static211.aClass2_Sub16_Sub1_2.aByteArray17, Static211.aClass2_Sub16_Sub1_2.anInt2789);
													Static306.anInt5919 = 0;
													Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
												}
											} catch (@Pc(2239) IOException local2239) {
												Static154.method2844();
											}
											return;
										}
										local1538 = local1531.aClass56_6;
										if (local1538.anInt2056 < 0) {
											break;
										}
										local1549 = Static38.method715(local1538.anInt2030);
									} while (local1549 == null || local1549.aClass56Array1 == null || local1538.anInt2056 >= local1549.aClass56Array1.length || local1538 != local1549.aClass56Array1[local1538.anInt2056]);
									Static204.method3467(local1531);
								}
							}
							local1538 = local1531.aClass56_6;
							if (local1538.anInt2056 < 0) {
								break;
							}
							local1549 = Static38.method715(local1538.anInt2030);
						} while (local1549 == null || local1549.aClass56Array1 == null || local1549.aClass56Array1.length <= local1538.anInt2056 || local1549.aClass56Array1[local1538.anInt2056] != local1538);
						Static204.method3467(local1531);
					}
				}
				local1538 = local1531.aClass56_6;
				if (local1538.anInt2056 < 0) {
					break;
				}
				local1549 = Static38.method715(local1538.anInt2030);
			} while (local1549 == null || local1549.aClass56Array1 == null || local1538.anInt2056 >= local1549.aClass56Array1.length || local1538 != local1549.aClass56Array1[local1538.anInt2056]);
			Static204.method3467(local1531);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
	public static void method2848(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		Static120.method2007(null, arg0, arg1, -1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!r;Lclient!r;I)V")
	public static void method2849(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		if (arg0.aClass2_Sub8_75 != null) {
			arg0.method4686();
		}
		arg0.aClass2_Sub8_75 = arg1;
		arg0.aClass2_Sub8_74 = arg1.aClass2_Sub8_74;
		arg0.aClass2_Sub8_75.aClass2_Sub8_74 = arg0;
		arg0.aClass2_Sub8_74.aClass2_Sub8_75 = arg0;
	}
}
