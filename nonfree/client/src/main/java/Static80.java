import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!cg;")
	public static Class22 aClass22_31;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
	public static int[] anIntArray145 = new int[25];

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Lclient!ul;")
	public static Class172 aClass172_13 = new Class172(50);

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	public static int anInt1674 = -2;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Lclient!c;")
	public static Class17 aClass17_11 = new Class17();

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString64 = "wave:";

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIILclient!lg;II)V")
	public static void method1366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class97 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static185.aBoolean238) {
			Static213.anInt4149 = 32;
		} else {
			Static213.anInt4149 = 0;
		}
		Static185.aBoolean238 = false;
		@Pc(129) int local129;
		if (Static186.anInt3687 != 0) {
			if (arg6 >= arg3 && arg6 < arg3 + 16 && arg5 <= arg1 && arg5 + 16 > arg1) {
				arg4.anInt3199 -= 4;
				Static178.method2927(arg4);
			} else if (arg6 >= arg3 && arg3 + 16 > arg6 && arg5 + arg0 - 16 <= arg1 && arg0 + arg5 > arg1) {
				arg4.anInt3199 += 4;
				Static178.method2927(arg4);
			} else if (arg6 >= arg3 - Static213.anInt4149 && arg3 + Static213.anInt4149 + 16 > arg6 && arg1 >= arg5 + 16 && arg1 < arg0 + arg5 - 16) {
				local129 = (arg0 - 32) * arg0 / arg2;
				if (local129 < 8) {
					local129 = 8;
				}
				@Pc(146) int local146 = arg1 - local129 / 2 - arg5 - 16;
				@Pc(152) int local152 = arg0 - local129 - 32;
				arg4.anInt3199 = local146 * (arg2 - arg0) / local152;
				Static178.method2927(arg4);
				Static185.aBoolean238 = true;
			}
		}
		if (Static131.anInt1447 == 0) {
			return;
		}
		local129 = arg4.anInt3201;
		if (arg3 - local129 <= arg6 && arg5 <= arg1 && arg3 + 16 > arg6 && arg1 <= arg0 + arg5) {
			arg4.anInt3199 += Static131.anInt1447 * 45;
			Static178.method2927(arg4);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Z")
	public static boolean method1367() throws IOException {
		if (Static261.aClass91_3 == null) {
			return false;
		}
		@Pc(15) int local15 = Static261.aClass91_3.method2300();
		if (local15 == 0) {
			return false;
		}
		if (Static138.anInt2729 == -1) {
			Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, 1);
			local15--;
			Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
			Static138.anInt2729 = Static256.aClass4_Sub24_Sub1_3.method3133();
			Static31.anInt653 = Static221.anIntArray351[Static138.anInt2729];
		}
		if (Static31.anInt653 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, 1);
			local15--;
			Static31.anInt653 = Static256.aClass4_Sub24_Sub1_3.aByteArray47[0] & 0xFF;
		}
		if (Static31.anInt653 == -2) {
			if (local15 <= 1) {
				return false;
			}
			local15 -= 2;
			Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, 2);
			Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
			Static31.anInt653 = Static256.aClass4_Sub24_Sub1_3.method3085();
		}
		if (Static31.anInt653 > local15) {
			return false;
		}
		Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
		Static261.aClass91_3.method2304(Static256.aClass4_Sub24_Sub1_3.aByteArray47, 0, Static31.anInt653);
		Static137.anInt2703 = 0;
		Static185.anInt3683 = Static11.anInt280;
		Static11.anInt280 = Static181.anInt5855;
		Static181.anInt5855 = Static138.anInt2729;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(138) String local138;
		if (Static138.anInt2729 == 61) {
			local134 = Static256.aClass4_Sub24_Sub1_3.method3121();
			local138 = Static256.aClass4_Sub24_Sub1_3.method3111();
			local142 = Static256.aClass4_Sub24_Sub1_3.method3108();
			if (Static74.method1258(local142)) {
				Static198.method3236(local134, local138);
			}
			Static138.anInt2729 = -1;
			return true;
		} else if (Static138.anInt2729 == 67) {
			Static257.anInt5058 = Static256.aClass4_Sub24_Sub1_3.method3109();
			Static260.anInt5846 = Static256.aClass4_Sub24_Sub1_3.method3109();
			Static138.anInt2729 = -1;
			return true;
		} else {
			@Pc(183) int local183;
			if (Static138.anInt2729 == 93) {
				local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
				local183 = Static256.aClass4_Sub24_Sub1_3.method3084();
				if (Static74.method1258(local134)) {
					@Pc(194) Class4_Sub30 local194 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local183);
					if (local194 != null) {
						Static157.method262(true, local194);
					}
					if (Static44.aClass97_6 != null) {
						Static178.method2927(Static44.aClass97_6);
						Static44.aClass97_6 = null;
					}
				}
				Static138.anInt2729 = -1;
				return true;
			} else if (Static138.anInt2729 == 119) {
				Static126.method2051();
				Static138.anInt2729 = -1;
				return true;
			} else if (Static138.anInt2729 == 54) {
				Static106.method1797(true);
				Static138.anInt2729 = -1;
				return true;
			} else if (Static138.anInt2729 == 217) {
				Static175.anInt3548 = Static256.aClass4_Sub24_Sub1_3.method3110();
				Static138.anInt2729 = -1;
				Static279.anInt5479 = Static131.anInt1441;
				return true;
			} else if (Static138.anInt2729 == 35) {
				if (Static56.anInt1264 != -1) {
					Static85.method1423(Static56.anInt1264, 0);
				}
				Static138.anInt2729 = -1;
				return true;
			} else {
				@Pc(292) int local292;
				if (Static138.anInt2729 == 153) {
					local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
					local183 = Static256.aClass4_Sub24_Sub1_3.method3110();
					if (local134 == 65535) {
						local134 = -1;
					}
					local142 = Static256.aClass4_Sub24_Sub1_3.method3085();
					local292 = Static256.aClass4_Sub24_Sub1_3.method3110();
					Static288.method4505(local292, local134, local142, local183);
					Static138.anInt2729 = -1;
					return true;
				}
				@Pc(355) int local355;
				@Pc(349) int local349;
				@Pc(327) int local327;
				@Pc(339) int local339;
				@Pc(345) int local345;
				if (Static138.anInt2729 == 45) {
					local134 = Static256.aClass4_Sub24_Sub1_3.method3094();
					local183 = local134 >> 2;
					local142 = local134 & 0x3;
					local292 = Static230.anIntArray374[local183];
					local327 = Static256.aClass4_Sub24_Sub1_3.method3096();
					if (local327 == 65535) {
						local327 = -1;
					}
					local339 = Static256.aClass4_Sub24_Sub1_3.method3121();
					local345 = local339 >> 28 & 0x3;
					local349 = local339 & 0x3FFF;
					local355 = local339 >> 14 & 0x3FFF;
					local349 -= Static105.anInt2105;
					local355 -= Static269.anInt5357;
					Static79.method1363(local183, local349, local142, local292, local345, local355, local327);
					Static138.anInt2729 = -1;
					return true;
				} else if (Static138.anInt2729 == 207) {
					Static169.anInt3385 = Static256.aClass4_Sub24_Sub1_3.method3110();
					Static138.anInt2729 = -1;
					return true;
				} else if (Static138.anInt2729 == 39) {
					local134 = Static256.aClass4_Sub24_Sub1_3.method3058();
					local183 = Static256.aClass4_Sub24_Sub1_3.method3096();
					local142 = Static256.aClass4_Sub24_Sub1_3.method3068();
					local292 = Static256.aClass4_Sub24_Sub1_3.method3084();
					if (Static74.method1258(local183)) {
						Static115.method1918(local292, local142, local134);
					}
					Static138.anInt2729 = -1;
					return true;
				} else {
					@Pc(545) String local545;
					@Pc(434) long local434;
					@Pc(442) long local442;
					@Pc(452) long local452;
					@Pc(447) long local447;
					if (Static138.anInt2729 == 255) {
						local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
						Static256.aClass4_Sub24_Sub1_3.method3069();
						local442 = Static256.aClass4_Sub24_Sub1_3.method3113();
						local447 = Static256.aClass4_Sub24_Sub1_3.method3085();
						local452 = Static256.aClass4_Sub24_Sub1_3.method3063();
						local349 = Static256.aClass4_Sub24_Sub1_3.method3110();
						@Pc(462) long local462 = (local447 << 32) + local452;
						@Pc(464) boolean local464 = false;
						@Pc(466) int local466 = 0;
						label1312: while (true) {
							if (local466 >= 100) {
								if (local349 <= 1) {
									if (Static243.aBoolean299 && !Static29.aBoolean47 || Static106.aBoolean122) {
										local464 = true;
									} else {
										for (local466 = 0; local466 < Static15.anInt334; local466++) {
											if (local434 == Static229.aLongArray8[local466]) {
												local464 = true;
												break label1312;
											}
										}
									}
								}
								break;
							}
							if (local462 == Static167.aLongArray5[local466]) {
								local464 = true;
								break;
							}
							local466++;
						}
						if (!local464 && Static45.anInt1039 == 0) {
							Static167.aLongArray5[Static55.anInt1241] = local462;
							Static55.anInt1241 = (Static55.anInt1241 + 1) % 100;
							local545 = Static124.method4092(Static174.method2879(Static173.method2815(Static256.aClass4_Sub24_Sub1_3)));
							if (local349 == 2 || local349 == 3) {
								Static278.method4263("<img=1>" + Static94.method1558(local434), Static94.method1558(local442), local545);
							} else if (local349 == 1) {
								Static278.method4263("<img=0>" + Static94.method1558(local434), Static94.method1558(local442), local545);
							} else {
								Static278.method4263(Static94.method1558(local434), Static94.method1558(local442), local545);
							}
						}
						Static138.anInt2729 = -1;
						return true;
					} else if (Static138.anInt2729 == 241) {
						Static106.method1797(false);
						Static138.anInt2729 = -1;
						return true;
					} else if (Static138.anInt2729 == 36) {
						local134 = Static256.aClass4_Sub24_Sub1_3.method3096();
						if (local134 == 65535) {
							local134 = -1;
						}
						local183 = Static256.aClass4_Sub24_Sub1_3.method3101();
						Static161.method2603(local183, local134);
						Static138.anInt2729 = -1;
						return true;
					} else if (Static138.anInt2729 == 103) {
						local134 = Static256.aClass4_Sub24_Sub1_3.method3074();
						local183 = Static256.aClass4_Sub24_Sub1_3.method3094();
						if (local134 == 65535) {
							local134 = -1;
						}
						local142 = Static256.aClass4_Sub24_Sub1_3.method3063();
						Static44.method830(local134, local183, local142);
						Static138.anInt2729 = -1;
						return true;
					} else {
						@Pc(702) String local702;
						if (Static138.anInt2729 == 15) {
							local134 = Static256.aClass4_Sub24_Sub1_3.method3108();
							local183 = Static256.aClass4_Sub24_Sub1_3.method3074();
							local702 = Static256.aClass4_Sub24_Sub1_3.method3111();
							if (Static74.method1258(local183)) {
								Static66.method3932(local134, local702);
							}
							Static138.anInt2729 = -1;
							return true;
						} else if (Static138.anInt2729 == 10) {
							if (Static250.aFrame2 != null) {
								Static112.method1885(false, Static228.anInt4580, -1, -1);
							}
							@Pc(732) byte[] local732 = new byte[Static31.anInt653];
							Static256.aClass4_Sub24_Sub1_3.method3125(Static31.anInt653, local732);
							local138 = Static25.method561(0, local732, Static31.anInt653);
							if (Static32.aFrame1 == null && (Static300.anInt5735 == 3 || !Static300.aString195.startsWith("win") || Static13.aBoolean23)) {
								Static181.method4698(true, local138);
							} else {
								Static243.aString160 = local138;
								Static81.aBoolean99 = true;
								Static226.aClass119_7 = Static95.aClass184_3.method4613(local138);
							}
							Static138.anInt2729 = -1;
							return true;
						} else if (Static138.anInt2729 == 166) {
							local134 = Static256.aClass4_Sub24_Sub1_3.method3096();
							if (local134 == 65535) {
								local134 = -1;
							}
							local183 = Static256.aClass4_Sub24_Sub1_3.method3094();
							local702 = Static256.aClass4_Sub24_Sub1_3.method3111();
							local292 = Static256.aClass4_Sub24_Sub1_3.method3094();
							if (local183 >= 1 && local183 <= 8) {
								if (local702.equalsIgnoreCase("null")) {
									local702 = null;
								}
								Static188.aStringArray35[local183 - 1] = local702;
								Static47.anIntArray114[local183 - 1] = local134;
								Static25.aBooleanArray11[local183 - 1] = local292 == 0;
							}
							Static138.anInt2729 = -1;
							return true;
						} else {
							@Pc(877) Class4_Sub30 local877;
							if (Static138.anInt2729 == 96) {
								local134 = Static256.aClass4_Sub24_Sub1_3.method3115();
								local183 = Static256.aClass4_Sub24_Sub1_3.method3115();
								local142 = Static256.aClass4_Sub24_Sub1_3.method3074();
								if (Static74.method1258(local142)) {
									@Pc(870) Class4_Sub30 local870 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local183);
									local877 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local134);
									if (local877 != null) {
										Static157.method262(local870 == null || local870.anInt5208 != local877.anInt5208, local877);
									}
									if (local870 != null) {
										local870.method4690();
										Static167.aClass163_25.method4181((long) local134, local870);
									}
									@Pc(917) Class97 local917 = Static148.method2340(local183);
									if (local917 != null) {
										Static178.method2927(local917);
									}
									local917 = Static148.method2340(local134);
									if (local917 != null) {
										Static178.method2927(local917);
										Static64.method1168(local917, true);
									}
									if (Static56.anInt1264 != -1) {
										Static85.method1423(Static56.anInt1264, 1);
									}
								}
								Static138.anInt2729 = -1;
								return true;
							} else if (Static138.anInt2729 == 211) {
								if (Static31.anInt653 == 0) {
									Static265.aString174 = Static149.aString100;
								} else {
									Static265.aString174 = Static256.aClass4_Sub24_Sub1_3.method3111();
								}
								Static138.anInt2729 = -1;
								return true;
							} else if (Static138.anInt2729 == 72) {
								Static223.method3499();
								Static138.anInt2729 = -1;
								return true;
							} else if (Static138.anInt2729 == 123) {
								local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
								local183 = Static256.aClass4_Sub24_Sub1_3.method3109();
								local142 = Static256.aClass4_Sub24_Sub1_3.method3096();
								if (Static74.method1258(local142)) {
									if (local183 == 2) {
										Static207.method1813();
									}
									Static56.anInt1264 = local134;
									Static89.method1498(local134);
									Static143.method2292(false);
									Static140.method2240(Static56.anInt1264);
									for (local292 = 0; local292 < 100; local292++) {
										Static48.aBooleanArray14[local292] = true;
									}
								}
								Static138.anInt2729 = -1;
								return true;
							} else if (Static138.anInt2729 == 120) {
								local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
								local138 = Static256.aClass4_Sub24_Sub1_3.method3111();
								@Pc(1061) Object[] local1061 = new Object[local138.length() + 1];
								for (local292 = local138.length() - 1; local292 >= 0; local292--) {
									if (local138.charAt(local292) == 's') {
										local1061[local292 + 1] = Static256.aClass4_Sub24_Sub1_3.method3111();
									} else {
										local1061[local292 + 1] = Integer.valueOf(Static256.aClass4_Sub24_Sub1_3.method3084());
									}
								}
								local1061[0] = Integer.valueOf(Static256.aClass4_Sub24_Sub1_3.method3084());
								if (Static74.method1258(local134)) {
									@Pc(1120) Class4_Sub23 local1120 = new Class4_Sub23();
									local1120.anObjectArray32 = local1061;
									Static145.method4497(local1120);
								}
								Static138.anInt2729 = -1;
								return true;
							} else if (Static138.anInt2729 == 186) {
								Static182.method2940();
								Static57.anInt1270 = Static256.aClass4_Sub24_Sub1_3.method3072();
								Static30.anInt636 = Static131.anInt1441;
								Static138.anInt2729 = -1;
								return true;
							} else {
								@Pc(1157) boolean local1157;
								@Pc(1155) String local1155;
								@Pc(1321) int local1321;
								@Pc(1353) int local1353;
								@Pc(1371) String local1371;
								if (Static138.anInt2729 == 193) {
									local1155 = "";
									local1157 = true;
									local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
									local142 = Static256.aClass4_Sub24_Sub1_3.method3085();
									if (local434 < 0L) {
										local434 &= Long.MAX_VALUE;
										local1157 = false;
									}
									local292 = Static256.aClass4_Sub24_Sub1_3.method3110();
									if (local142 > 0) {
										local1155 = Static256.aClass4_Sub24_Sub1_3.method3111();
									}
									@Pc(1192) String local1192 = Static94.method1558(local434);
									for (local355 = 0; local355 < Static149.anInt2911; local355++) {
										if (Static262.aLongArray9[local355] == local434) {
											if (Static73.anIntArray139[local355] != local142) {
												Static73.anIntArray139[local355] = local142;
												if (local142 > 0) {
													Static173.method2811(5, local1192 + Static247.aString162, "");
												}
												if (local142 == 0) {
													Static173.method2811(5, local1192 + Static49.aString40, "");
												}
											}
											Static71.aStringArray8[local355] = local1155;
											Static133.anIntArray225[local355] = local292;
											Static39.aBooleanArray13[local355] = local1157;
											local1192 = null;
											break;
										}
									}
									if (local1192 != null && Static149.anInt2911 < 200) {
										Static262.aLongArray9[Static149.anInt2911] = local434;
										Static135.aStringArray15[Static149.anInt2911] = local1192;
										Static73.anIntArray139[Static149.anInt2911] = local142;
										Static71.aStringArray8[Static149.anInt2911] = local1155;
										Static133.anIntArray225[Static149.anInt2911] = local292;
										Static39.aBooleanArray13[Static149.anInt2911] = local1157;
										Static149.anInt2911++;
									}
									Static279.anInt5479 = Static131.anInt1441;
									local349 = Static149.anInt2911;
									while (local349 > 0) {
										local349--;
										@Pc(1319) boolean local1319 = true;
										for (local1321 = 0; local1321 < local349; local1321++) {
											if (Static250.anInt4906 != Static73.anIntArray139[local1321] && Static73.anIntArray139[local1321 + 1] == Static250.anInt4906 || Static73.anIntArray139[local1321] == 0 && Static73.anIntArray139[local1321 + 1] != 0) {
												local1319 = false;
												local1353 = Static73.anIntArray139[local1321];
												Static73.anIntArray139[local1321] = Static73.anIntArray139[local1321 + 1];
												Static73.anIntArray139[local1321 + 1] = local1353;
												local1371 = Static71.aStringArray8[local1321];
												Static71.aStringArray8[local1321] = Static71.aStringArray8[local1321 + 1];
												Static71.aStringArray8[local1321 + 1] = local1371;
												local545 = Static135.aStringArray15[local1321];
												Static135.aStringArray15[local1321] = Static135.aStringArray15[local1321 + 1];
												Static135.aStringArray15[local1321 + 1] = local545;
												@Pc(1407) long local1407 = Static262.aLongArray9[local1321];
												Static262.aLongArray9[local1321] = Static262.aLongArray9[local1321 + 1];
												Static262.aLongArray9[local1321 + 1] = local1407;
												@Pc(1425) int local1425 = Static133.anIntArray225[local1321];
												Static133.anIntArray225[local1321] = Static133.anIntArray225[local1321 + 1];
												Static133.anIntArray225[local1321 + 1] = local1425;
												@Pc(1443) boolean local1443 = Static39.aBooleanArray13[local1321];
												Static39.aBooleanArray13[local1321] = Static39.aBooleanArray13[local1321 + 1];
												Static39.aBooleanArray13[local1321 + 1] = local1443;
											}
										}
										if (local1319) {
											break;
										}
									}
									Static138.anInt2729 = -1;
									return true;
								} else if (Static138.anInt2729 == 116) {
									Static138.anInt2729 = -1;
									Static11.anInt279 = 0;
									return true;
								} else {
									@Pc(1497) Class97 local1497;
									if (Static138.anInt2729 == 137) {
										local134 = Static256.aClass4_Sub24_Sub1_3.method3084();
										local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
										if (local134 >= 0) {
											local1497 = Static148.method2340(local134);
										} else {
											local1497 = null;
										}
										if (local1497 != null) {
											for (local292 = 0; local292 < local1497.anIntArray249.length; local292++) {
												local1497.anIntArray249[local292] = 0;
												local1497.anIntArray256[local292] = 0;
											}
										}
										if (local134 < -70000) {
											local183 += 32768;
										}
										Static141.method2266(local183);
										local292 = Static256.aClass4_Sub24_Sub1_3.method3085();
										for (local327 = 0; local327 < local292; local327++) {
											local339 = Static256.aClass4_Sub24_Sub1_3.method3109();
											if (local339 == 255) {
												local339 = Static256.aClass4_Sub24_Sub1_3.method3121();
											}
											local345 = Static256.aClass4_Sub24_Sub1_3.method3085();
											if (local1497 != null && local1497.anIntArray249.length > local327) {
												local1497.anIntArray249[local327] = local345;
												local1497.anIntArray256[local327] = local339;
											}
											Static272.method4321(local345 - 1, local339, local327, local183);
										}
										if (local1497 != null) {
											Static178.method2927(local1497);
										}
										Static182.method2940();
										Static305.anIntArray472[Static146.anInt2878++ & 0x1F] = local183 & 0x7FFF;
										Static138.anInt2729 = -1;
										return true;
									} else if (Static138.anInt2729 == 230) {
										local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
										if (Static74.method1258(local134)) {
											Static120.method2498();
										}
										Static138.anInt2729 = -1;
										return true;
									} else {
										@Pc(1720) Class4_Sub22 local1720;
										@Pc(1708) Class4_Sub22 local1708;
										if (Static138.anInt2729 == 139) {
											local134 = Static256.aClass4_Sub24_Sub1_3.method3084();
											local183 = Static256.aClass4_Sub24_Sub1_3.method3084();
											local142 = Static256.aClass4_Sub24_Sub1_3.method3108();
											local292 = Static256.aClass4_Sub24_Sub1_3.method3074();
											if (local142 == 65535) {
												local142 = -1;
											}
											local327 = Static256.aClass4_Sub24_Sub1_3.method3096();
											if (local327 == 65535) {
												local327 = -1;
											}
											if (Static74.method1258(local292)) {
												for (local339 = local327; local339 <= local142; local339++) {
													local452 = (long) local339 + ((long) local134 << 32);
													local1708 = (Class4_Sub22) Static65.aClass163_37.method4188(local452);
													if (local1708 != null) {
														local1720 = new Class4_Sub22(local183, local1708.anInt3270);
														local1708.method4690();
													} else if (local339 == -1) {
														local1720 = new Class4_Sub22(local183, Static148.method2340(local134).aClass4_Sub22_4.anInt3270);
													} else {
														local1720 = new Class4_Sub22(local183, -1);
													}
													Static65.aClass163_37.method4181(local452, local1720);
												}
											}
											Static138.anInt2729 = -1;
											return true;
										} else if (Static138.anInt2729 == 172) {
											local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
											Static154.method2523(local134);
											Static305.anIntArray472[Static146.anInt2878++ & 0x1F] = local134 & 0x7FFF;
											Static138.anInt2729 = -1;
											return true;
										} else if (Static138.anInt2729 == 228 || Static138.anInt2729 == 73 || Static138.anInt2729 == 224 || Static138.anInt2729 == 149 || Static138.anInt2729 == 225 || Static138.anInt2729 == 138 || Static138.anInt2729 == 191 || Static138.anInt2729 == 81 || Static138.anInt2729 == 109 || Static138.anInt2729 == 199 || Static138.anInt2729 == 122 || Static138.anInt2729 == 30 || Static138.anInt2729 == 17 || Static138.anInt2729 == 78) {
											Static42.method795();
											Static138.anInt2729 = -1;
											return true;
										} else if (Static138.anInt2729 == 21) {
											Static257.anInt5058 = Static256.aClass4_Sub24_Sub1_3.method3109();
											Static260.anInt5846 = Static256.aClass4_Sub24_Sub1_3.method3094();
											for (local134 = Static257.anInt5058; local134 < Static257.anInt5058 + 8; local134++) {
												for (local183 = Static260.anInt5846; local183 < Static260.anInt5846 + 8; local183++) {
													if (Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local134][local183] != null) {
														Static216.aClass17ArrayArrayArray1[Static222.anInt4467][local134][local183] = null;
														Static44.method846(local183, local134);
													}
												}
											}
											for (@Pc(1905) Class4_Sub20 local1905 = (Class4_Sub20) Static46.aClass17_5.method613(); local1905 != null; local1905 = (Class4_Sub20) Static46.aClass17_5.method607()) {
												if (local1905.anInt2629 >= Static257.anInt5058 && local1905.anInt2629 < Static257.anInt5058 + 8 && local1905.anInt2619 >= Static260.anInt5846 && Static260.anInt5846 + 8 > local1905.anInt2619 && local1905.anInt2631 == Static222.anInt4467) {
													local1905.anInt2621 = 0;
												}
											}
											Static138.anInt2729 = -1;
											return true;
										} else {
											@Pc(2103) boolean local2103;
											if (Static138.anInt2729 == 144) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3115();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3108();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3096();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3108();
												if (local134 >> 30 == 0) {
													@Pc(2120) Class120 local2120;
													@Pc(2133) Class186 local2133;
													@Pc(2192) Class120 local2192;
													@Pc(2208) Class186 local2208;
													@Pc(2213) Class186 local2213;
													if (local134 >> 29 != 0) {
														local327 = local134 & 0xFFFF;
														@Pc(2323) Class13_Sub5_Sub2 local2323 = Static260.aClass13_Sub5_Sub2Array114[local327];
														if (local2323 != null) {
															if (local183 == 65535) {
																local183 = -1;
															}
															local2103 = true;
															if (local183 != -1 && local2323.anInt5291 != -1) {
																if (local183 == local2323.anInt5291) {
																	local2120 = Static32.method639(local183);
																	if (local2120.aBoolean241 && local2120.anInt3877 != -1) {
																		local2133 = Static51.method992(local2120.anInt3877);
																		local1321 = local2133.anInt5814;
																		if (local1321 == 1) {
																			local2323.anInt5331 = 0;
																			local2323.anInt5325 = local142 + Static50.anInt1118;
																			local2323.anInt5280 = 1;
																			local2103 = false;
																			local2323.anInt5281 = 0;
																			local2323.anInt5279 = 0;
																			Static229.method3598(false, local2323.anInt5294, local2133, local2323.anInt5334, local2323.anInt5279);
																		} else if (local1321 == 2) {
																			local2323.anInt5309 = 0;
																			local2103 = false;
																		}
																	}
																} else {
																	local2120 = Static32.method639(local183);
																	local2192 = Static32.method639(local2323.anInt5291);
																	if (local2120.anInt3877 != -1 && local2192.anInt3877 != -1) {
																		local2208 = Static51.method992(local2120.anInt3877);
																		local2213 = Static51.method992(local2192.anInt3877);
																		if (local2213.anInt5807 > local2208.anInt5807) {
																			local2103 = false;
																		}
																	}
																}
															}
															if (local2103) {
																local2323.anInt5279 = 0;
																local2323.anInt5280 = 1;
																local2323.anInt5281 = 0;
																local2323.anInt5291 = local183;
																local2323.anInt5325 = local142 + Static50.anInt1118;
																local2323.anInt5304 = local292;
																if (local2323.anInt5325 > Static50.anInt1118) {
																	local2323.anInt5279 = -1;
																}
																if (local2323.anInt5291 != -1 && local2323.anInt5325 == Static50.anInt1118) {
																	local355 = Static32.method639(local2323.anInt5291).anInt3877;
																	if (local355 != -1) {
																		local2133 = Static51.method992(local355);
																		if (local2133 != null && local2133.anIntArray469 != null) {
																			Static229.method3598(false, local2323.anInt5294, local2133, local2323.anInt5334, 0);
																		}
																	}
																}
															}
														}
													} else if (local134 >> 28 != 0) {
														local327 = local134 & 0xFFFF;
														@Pc(2086) Class13_Sub5_Sub1 local2086;
														if (Static169.anInt3387 == local327) {
															local2086 = Static72.aClass13_Sub5_Sub1_1;
														} else {
															local2086 = Static100.aClass13_Sub5_Sub1Array1[local327];
														}
														if (local2086 != null) {
															if (local183 == 65535) {
																local183 = -1;
															}
															local2103 = true;
															if (local183 != -1 && local2086.anInt5291 != -1) {
																if (local183 == local2086.anInt5291) {
																	local2120 = Static32.method639(local183);
																	if (local2120.aBoolean241 && local2120.anInt3877 != -1) {
																		local2133 = Static51.method992(local2120.anInt3877);
																		local1321 = local2133.anInt5814;
																		if (local1321 == 1) {
																			local2086.anInt5325 = local142 + Static50.anInt1118;
																			local2086.anInt5331 = 0;
																			local2086.anInt5279 = 0;
																			local2086.anInt5281 = 0;
																			local2103 = false;
																			local2086.anInt5280 = 1;
																			Static229.method3598(false, local2086.anInt5294, local2133, local2086.anInt5334, local2086.anInt5279);
																		} else if (local1321 == 2) {
																			local2103 = false;
																			local2086.anInt5309 = 0;
																		}
																	}
																} else {
																	local2120 = Static32.method639(local183);
																	local2192 = Static32.method639(local2086.anInt5291);
																	if (local2120.anInt3877 != -1 && local2192.anInt3877 != -1) {
																		local2208 = Static51.method992(local2120.anInt3877);
																		local2213 = Static51.method992(local2192.anInt3877);
																		if (local2208.anInt5807 < local2213.anInt5807) {
																			local2103 = false;
																		}
																	}
																}
															}
															if (local2103) {
																local2086.anInt5279 = 0;
																local2086.anInt5280 = 1;
																local2086.anInt5291 = local183;
																if (local2086.anInt5291 == 65535) {
																	local2086.anInt5291 = -1;
																}
																local2086.anInt5281 = 0;
																local2086.anInt5304 = local292;
																local2086.anInt5325 = local142 + Static50.anInt1118;
																if (Static50.anInt1118 < local2086.anInt5325) {
																	local2086.anInt5279 = -1;
																}
																if (local2086.anInt5291 != -1 && local2086.anInt5325 == Static50.anInt1118) {
																	local355 = Static32.method639(local2086.anInt5291).anInt3877;
																	if (local355 != -1) {
																		local2133 = Static51.method992(local355);
																		if (local2133 != null && local2133.anIntArray469 != null) {
																			Static229.method3598(local2086 == Static72.aClass13_Sub5_Sub1_1, local2086.anInt5294, local2133, local2086.anInt5334, 0);
																		}
																	}
																}
															}
														}
													}
												} else {
													local327 = local134 >> 28 & 0x3;
													local345 = (local134 & 0x3FFF) - Static105.anInt2105;
													local339 = (local134 >> 14 & 0x3FFF) - Static269.anInt5357;
													if (local339 >= 0 && local345 >= 0 && local339 < 104 && local345 < 104) {
														local345 = local345 * 128 + 64;
														local339 = local339 * 128 + 64;
														@Pc(2052) Class13_Sub4 local2052 = new Class13_Sub4(local183, local327, local339, local345, Static58.method2504(local345, local339, local327) - local292, local142, Static50.anInt1118);
														Static91.aClass17_12.method619(new Class4_Sub2_Sub22(local2052));
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 79) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3096();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3108();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3121();
												local327 = Static256.aClass4_Sub24_Sub1_3.method3108();
												if (Static74.method1258(local142)) {
													Static175.method2885(local292, local134, 7, local327 | local183 << 16);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 132) {
												for (local134 = 0; local134 < Static100.aClass13_Sub5_Sub1Array1.length; local134++) {
													if (Static100.aClass13_Sub5_Sub1Array1[local134] != null) {
														Static100.aClass13_Sub5_Sub1Array1[local134].anInt5305 = -1;
													}
												}
												for (local134 = 0; local134 < Static260.aClass13_Sub5_Sub2Array114.length; local134++) {
													if (Static260.aClass13_Sub5_Sub2Array114[local134] != null) {
														Static260.aClass13_Sub5_Sub2Array114[local134].anInt5305 = -1;
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 212) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3121();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
												Static68.method1447(local134, local183);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 100) {
												@Pc(2671) String local2671 = Static256.aClass4_Sub24_Sub1_3.method3111();
												if (local2671.endsWith(":tradereq:")) {
													local138 = local2671.substring(0, local2671.indexOf(":"));
													local442 = Static193.method3171(local138);
													local1157 = false;
													for (local339 = 0; local339 < Static15.anInt334; local339++) {
														if (Static229.aLongArray8[local339] == local442) {
															local1157 = true;
															break;
														}
													}
													if (!local1157 && Static45.anInt1039 == 0) {
														Static173.method2811(4, Static235.aString156, local138);
													}
												} else if (local2671.endsWith(":chalreq:")) {
													local138 = local2671.substring(0, local2671.indexOf(":"));
													local442 = Static193.method3171(local138);
													local1157 = false;
													for (local339 = 0; local339 < Static15.anInt334; local339++) {
														if (Static229.aLongArray8[local339] == local442) {
															local1157 = true;
															break;
														}
													}
													if (!local1157 && Static45.anInt1039 == 0) {
														local1155 = local2671.substring(local2671.indexOf(":") + 1, local2671.length() + -9);
														Static173.method2811(8, local1155, local138);
													}
												} else if (local2671.endsWith(":assistreq:")) {
													local138 = local2671.substring(0, local2671.indexOf(":"));
													local442 = Static193.method3171(local138);
													local1157 = false;
													for (local339 = 0; local339 < Static15.anInt334; local339++) {
														if (local442 == Static229.aLongArray8[local339]) {
															local1157 = true;
															break;
														}
													}
													if (!local1157 && Static45.anInt1039 == 0) {
														Static173.method2811(10, "", local138);
													}
												} else if (local2671.endsWith(":clan:")) {
													local138 = local2671.substring(0, local2671.indexOf(":clan:"));
													Static173.method2811(11, local138, "");
												} else if (local2671.endsWith(":trade:")) {
													local138 = local2671.substring(0, local2671.indexOf(":trade:"));
													if (Static45.anInt1039 == 0) {
														Static173.method2811(12, local138, "");
													}
												} else if (local2671.endsWith(":assist:")) {
													local138 = local2671.substring(0, local2671.indexOf(":assist:"));
													if (Static45.anInt1039 == 0) {
														Static173.method2811(13, local138, "");
													}
												} else if (local2671.endsWith(":duelstake:")) {
													local138 = local2671.substring(0, local2671.indexOf(":"));
													local442 = Static193.method3171(local138);
													local1157 = false;
													for (local339 = 0; local339 < Static15.anInt334; local339++) {
														if (local442 == Static229.aLongArray8[local339]) {
															local1157 = true;
															break;
														}
													}
													if (!local1157 && Static45.anInt1039 == 0) {
														Static173.method2811(14, "", local138);
													}
												} else if (local2671.endsWith(":duelfriend:")) {
													local138 = local2671.substring(0, local2671.indexOf(":"));
													local442 = Static193.method3171(local138);
													local1157 = false;
													for (local339 = 0; local339 < Static15.anInt334; local339++) {
														if (Static229.aLongArray8[local339] == local442) {
															local1157 = true;
															break;
														}
													}
													if (!local1157 && Static45.anInt1039 == 0) {
														Static173.method2811(15, "", local138);
													}
												} else if (local2671.endsWith(":clanreq:")) {
													local1157 = false;
													local138 = local2671.substring(0, local2671.indexOf(":"));
													local442 = Static193.method3171(local138);
													for (local339 = 0; local339 < Static15.anInt334; local339++) {
														if (Static229.aLongArray8[local339] == local442) {
															local1157 = true;
															break;
														}
													}
													if (!local1157 && Static45.anInt1039 == 0) {
														Static173.method2811(16, "", local138);
													}
												} else if (local2671.endsWith(":allyreq:")) {
													local1157 = false;
													local138 = local2671.substring(0, local2671.indexOf(":"));
													local442 = Static193.method3171(local138);
													for (local339 = 0; local339 < Static15.anInt334; local339++) {
														if (local442 == Static229.aLongArray8[local339]) {
															local1157 = true;
															break;
														}
													}
													if (!local1157 && Static45.anInt1039 == 0) {
														local1155 = local2671.substring(local2671.indexOf(":") + 1, local2671.length() - 9);
														Static173.method2811(21, local1155, local138);
													}
												} else {
													Static173.method2811(0, local2671, "");
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 206) {
												Static216.anInt4184 = Static131.anInt1441;
												local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
												if (local434 == 0L) {
													Static92.aString70 = null;
													Static138.anInt2729 = -1;
													Static168.aClass4_Sub12Array1 = null;
													Static244.anInt4812 = 0;
													Static123.aString87 = null;
													return true;
												}
												local442 = Static256.aClass4_Sub24_Sub1_3.method3113();
												Static123.aString87 = Static114.method1915(local442);
												Static92.aString70 = Static114.method1915(local434);
												Static224.aByte16 = Static256.aClass4_Sub24_Sub1_3.method3069();
												local327 = Static256.aClass4_Sub24_Sub1_3.method3110();
												if (local327 == 255) {
													Static138.anInt2729 = -1;
													return true;
												}
												Static244.anInt4812 = local327;
												@Pc(3210) Class4_Sub12[] local3210 = new Class4_Sub12[100];
												for (local345 = 0; local345 < Static244.anInt4812; local345++) {
													local3210[local345] = new Class4_Sub12();
													local3210[local345].aLong211 = Static256.aClass4_Sub24_Sub1_3.method3113();
													local3210[local345].aString56 = Static114.method1915(local3210[local345].aLong211);
													local3210[local345].anInt1455 = Static256.aClass4_Sub24_Sub1_3.method3085();
													local3210[local345].aByte2 = Static256.aClass4_Sub24_Sub1_3.method3069();
													local3210[local345].aString54 = Static256.aClass4_Sub24_Sub1_3.method3111();
													if (local3210[local345].aLong211 == Static115.aLong88) {
														Static212.aByte14 = local3210[local345].aByte2;
													}
												}
												local349 = Static244.anInt4812;
												while (local349 > 0) {
													local349--;
													local2103 = true;
													for (local1321 = 0; local1321 < local349; local1321++) {
														if (local3210[local1321].aString56.compareTo(local3210[local1321 + 1].aString56) > 0) {
															local2103 = false;
															@Pc(3316) Class4_Sub12 local3316 = local3210[local1321];
															local3210[local1321] = local3210[local1321 + 1];
															local3210[local1321 + 1] = local3316;
														}
													}
													if (local2103) {
														break;
													}
												}
												Static168.aClass4_Sub12Array1 = local3210;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 157) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3108();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3115();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3096();
												if (Static74.method1258(local134)) {
													Static136.method2192(local183, local142);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 233) {
												local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
												local702 = Static124.method4092(Static174.method2879(Static173.method2815(Static256.aClass4_Sub24_Sub1_3)));
												Static173.method2811(6, local702, Static94.method1558(local434));
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 245) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3121();
												Static207.aClass119_4 = Static95.aClass184_3.method4607(local134);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 151) {
												Static256.aClass4_Sub24_Sub1_3.anInt3822 += 28;
												if (Static256.aClass4_Sub24_Sub1_3.method3114()) {
													Static135.method2178(Static256.aClass4_Sub24_Sub1_3, Static256.aClass4_Sub24_Sub1_3.anInt3822 - 28);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 196) {
												Static30.method620(Static256.aClass4_Sub24_Sub1_3.method3111());
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 38) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3084();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local327 = Static256.aClass4_Sub24_Sub1_3.method3074();
												if (Static74.method1258(local327)) {
													Static248.method3801(local142, local183, local134, local292);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 216) {
												Static209.method3293();
												Static182.method2940();
												Static125.anInt2512 += 32;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 28) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3101();
												@Pc(3537) Class13_Sub5_Sub2 local3537 = Static260.aClass13_Sub5_Sub2Array114[local134];
												if (local3537 != null) {
													Static213.method3350(local3537, local142, local183);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 174) {
												for (local134 = 0; local134 < Static298.anIntArray414.length; local134++) {
													if (Static298.anIntArray414[local134] != Static287.anIntArray454[local134]) {
														Static298.anIntArray414[local134] = Static287.anIntArray454[local134];
														Static1.method2(local134);
														Static52.anIntArray121[Static125.anInt2512++ & 0x1F] = local134;
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 108) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3084();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (local134 < -70000) {
													local183 += 32768;
												}
												if (local134 < 0) {
													local1497 = null;
												} else {
													local1497 = Static148.method2340(local134);
												}
												while (Static256.aClass4_Sub24_Sub1_3.anInt3822 < Static31.anInt653) {
													local292 = Static256.aClass4_Sub24_Sub1_3.method3060();
													local327 = Static256.aClass4_Sub24_Sub1_3.method3085();
													local339 = 0;
													if (local327 != 0) {
														local339 = Static256.aClass4_Sub24_Sub1_3.method3110();
														if (local339 == 255) {
															local339 = Static256.aClass4_Sub24_Sub1_3.method3084();
														}
													}
													if (local1497 != null && local292 >= 0 && local292 < local1497.anIntArray249.length) {
														local1497.anIntArray249[local292] = local327;
														local1497.anIntArray256[local292] = local339;
													}
													Static272.method4321(local327 - 1, local339, local292, local183);
												}
												if (local1497 != null) {
													Static178.method2927(local1497);
												}
												Static182.method2940();
												Static305.anIntArray472[Static146.anInt2878++ & 0x1F] = local183 & 0x7FFF;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 165) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3110();
												Static68.method1447(local183, local134);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 23) {
												local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3085();
												@Pc(3759) String local3759 = Static67.method1178(local142).method973(Static256.aClass4_Sub24_Sub1_3);
												Static259.method4047(Static94.method1558(local434), local3759, null, local142, 19);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 184) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3096();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3074();
												if (Static74.method1258(local142)) {
													Static45.method926(local134, local183);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 124) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3121();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3074();
												if (local142 == 65535) {
													local142 = -1;
												}
												if (Static74.method1258(local134)) {
													Static175.method2885(local183, -1, 1, local142);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 126) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3086();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (Static74.method1258(local142)) {
													local877 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local134);
													if (local877 != null) {
														Static157.method262(local292 != local877.anInt5208, local877);
													}
													Static210.method3319(local292, local183, local134);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 197) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3109();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3096();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3086();
												if (Static74.method1258(local183)) {
													Static8.method124(local142, local134);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 146) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (Static74.method1258(local134)) {
													Static183.method2968();
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 198) {
												Static39.method721();
												Static138.anInt2729 = -1;
												return false;
											} else if (Static138.anInt2729 == 104) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local327 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local339 = Static256.aClass4_Sub24_Sub1_3.method3110();
												if (Static74.method1258(local134)) {
													method1368(local183, local292, local327, local339, local142);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 18) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local138 = Static256.aClass4_Sub24_Sub1_3.method3111();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3108();
												if (Static74.method1258(local134)) {
													Static66.method3932(local142, local138);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 55) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3108();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3115();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3108();
												if (Static74.method1258(local183)) {
													Static88.method1487(local142, (local134 << 16) + local292);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 176) {
												local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
												local442 = Static256.aClass4_Sub24_Sub1_3.method3085();
												@Pc(4095) boolean local4095 = false;
												local447 = Static256.aClass4_Sub24_Sub1_3.method3063();
												local345 = Static256.aClass4_Sub24_Sub1_3.method3110();
												@Pc(4110) long local4110 = local447 + (local442 << 32);
												local1353 = 0;
												label1567: while (true) {
													if (local1353 >= 100) {
														if (local345 <= 1) {
															if (Static243.aBoolean299 && !Static29.aBoolean47 || Static106.aBoolean122) {
																local4095 = true;
															} else {
																for (local1353 = 0; local1353 < Static15.anInt334; local1353++) {
																	if (local434 == Static229.aLongArray8[local1353]) {
																		local4095 = true;
																		break label1567;
																	}
																}
															}
														}
														break;
													}
													if (Static167.aLongArray5[local1353] == local4110) {
														local4095 = true;
														break;
													}
													local1353++;
												}
												if (!local4095 && Static45.anInt1039 == 0) {
													Static167.aLongArray5[Static55.anInt1241] = local4110;
													Static55.anInt1241 = (Static55.anInt1241 + 1) % 100;
													@Pc(4189) String local4189 = Static124.method4092(Static174.method2879(Static173.method2815(Static256.aClass4_Sub24_Sub1_3)));
													if (local345 == 2 || local345 == 3) {
														Static173.method2811(7, local4189, "<img=1>" + Static94.method1558(local434));
													} else if (local345 == 1) {
														Static173.method2811(7, local4189, "<img=0>" + Static94.method1558(local434));
													} else {
														Static173.method2811(3, local4189, Static94.method1558(local434));
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 208) {
												Static182.method2940();
												Static199.anInt2994 = Static256.aClass4_Sub24_Sub1_3.method3110();
												Static138.anInt2729 = -1;
												Static30.anInt636 = Static131.anInt1441;
												return true;
											} else if (Static138.anInt2729 == 102) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (local134 == 65535) {
													local134 = -1;
												}
												local183 = Static256.aClass4_Sub24_Sub1_3.method3086();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3074();
												if (Static74.method1258(local142)) {
													Static175.method2885(local183, -1, 2, local134);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 235) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3086();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3074();
												Static140.method2239(local183, local134);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 49) {
												Static182.method2940();
												local134 = Static256.aClass4_Sub24_Sub1_3.method3094();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3115();
												Static179.anIntArray302[local134] = local142;
												Static214.anIntArray446[local134] = local183;
												anIntArray145[local134] = 1;
												for (local292 = 0; local292 < 98; local292++) {
													if (local142 >= Class111.anIntArray297[local292]) {
														anIntArray145[local134] = local292 + 2;
													}
												}
												Static2.anIntArray2[Static183.anInt3665++ & 0x1F] = local134;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 110) {
												local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
												Static256.aClass4_Sub24_Sub1_3.method3069();
												local442 = Static256.aClass4_Sub24_Sub1_3.method3113();
												local447 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local452 = Static256.aClass4_Sub24_Sub1_3.method3063();
												local349 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local1321 = Static256.aClass4_Sub24_Sub1_3.method3085();
												@Pc(4422) boolean local4422 = false;
												@Pc(4428) long local4428 = (local447 << 32) + local452;
												@Pc(4430) int local4430 = 0;
												label1504: while (true) {
													if (local4430 < 100) {
														if (Static167.aLongArray5[local4430] != local4428) {
															local4430++;
															continue;
														}
														local4422 = true;
														break;
													}
													if (local349 <= 1) {
														for (local4430 = 0; local4430 < Static15.anInt334; local4430++) {
															if (Static229.aLongArray8[local4430] == local434) {
																local4422 = true;
																break label1504;
															}
														}
													}
													break;
												}
												if (!local4422 && Static45.anInt1039 == 0) {
													Static167.aLongArray5[Static55.anInt1241] = local4428;
													Static55.anInt1241 = (Static55.anInt1241 + 1) % 100;
													@Pc(4495) String local4495 = Static67.method1178(local1321).method973(Static256.aClass4_Sub24_Sub1_3);
													if (local349 == 2 || local349 == 3) {
														Static259.method4047("<img=1>" + Static94.method1558(local434), local4495, Static94.method1558(local442), local1321, 20);
													} else if (local349 == 1) {
														Static259.method4047("<img=0>" + Static94.method1558(local434), local4495, Static94.method1558(local442), local1321, 20);
													} else {
														Static259.method4047(Static94.method1558(local434), local4495, Static94.method1558(local442), local1321, 20);
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 97) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3074();
												if (Static74.method1258(local183)) {
													Static287.anInt5604 = local134;
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 86) {
												local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local1157 = false;
												@Pc(4599) byte local4599 = Static256.aClass4_Sub24_Sub1_3.method3069();
												if ((Long.MIN_VALUE & local434) != 0L) {
													local1157 = true;
												}
												if (local1157) {
													if (Static244.anInt4812 == 0) {
														Static138.anInt2729 = -1;
														return true;
													}
													local434 &= Long.MAX_VALUE;
													for (local339 = 0; local339 < Static244.anInt4812 && (local434 != Static168.aClass4_Sub12Array1[local339].aLong211 || Static168.aClass4_Sub12Array1[local339].anInt1455 != local142); local339++) {
													}
													if (local339 < Static244.anInt4812) {
														while (Static244.anInt4812 - 1 > local339) {
															Static168.aClass4_Sub12Array1[local339] = Static168.aClass4_Sub12Array1[local339 + 1];
															local339++;
														}
														Static244.anInt4812--;
														Static168.aClass4_Sub12Array1[Static244.anInt4812] = null;
													}
												} else {
													local1155 = Static256.aClass4_Sub24_Sub1_3.method3111();
													@Pc(4696) Class4_Sub12 local4696 = new Class4_Sub12();
													local4696.aLong211 = local434;
													local4696.aString56 = Static114.method1915(local4696.aLong211);
													local4696.aString54 = local1155;
													local4696.anInt1455 = local142;
													local4696.aByte2 = local4599;
													for (local355 = Static244.anInt4812 - 1; local355 >= 0; local355--) {
														local349 = Static168.aClass4_Sub12Array1[local355].aString56.compareTo(local4696.aString56);
														if (local349 == 0) {
															Static168.aClass4_Sub12Array1[local355].anInt1455 = local142;
															Static168.aClass4_Sub12Array1[local355].aByte2 = local4599;
															Static168.aClass4_Sub12Array1[local355].aString54 = local1155;
															Static216.anInt4184 = Static131.anInt1441;
															if (Static115.aLong88 == local434) {
																Static212.aByte14 = local4599;
															}
															Static138.anInt2729 = -1;
															return true;
														}
														if (local349 < 0) {
															break;
														}
													}
													if (Static244.anInt4812 >= Static168.aClass4_Sub12Array1.length) {
														Static138.anInt2729 = -1;
														return true;
													}
													for (local349 = Static244.anInt4812 - 1; local349 > local355; local349--) {
														Static168.aClass4_Sub12Array1[local349 + 1] = Static168.aClass4_Sub12Array1[local349];
													}
													if (Static244.anInt4812 == 0) {
														Static168.aClass4_Sub12Array1 = new Class4_Sub12[100];
													}
													Static168.aClass4_Sub12Array1[local355 + 1] = local4696;
													Static244.anInt4812++;
													if (Static115.aLong88 == local434) {
														Static212.aByte14 = local4599;
													}
												}
												Static216.anInt4184 = Static131.anInt1441;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 117) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3121();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3096();
												if (Static74.method1258(local183)) {
													local142 = 0;
													if (Static72.aClass13_Sub5_Sub1_1.aClass175_2 != null) {
														local142 = Static72.aClass13_Sub5_Sub1_1.aClass175_2.method4475();
													}
													Static175.method2885(local134, -1, 3, local142);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 181) {
												Static156.method2541(Static95.aClass184_3, Static31.anInt653, Static256.aClass4_Sub24_Sub1_3);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 248) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3110();
												if (Static256.aClass4_Sub24_Sub1_3.method3110() == 0) {
													Static179.aClass80Array1[local134] = new Class80();
												} else {
													Static256.aClass4_Sub24_Sub1_3.anInt3822--;
													Static179.aClass80Array1[local134] = new Class80(Static256.aClass4_Sub24_Sub1_3);
												}
												Static146.anInt2879 = Static131.anInt1441;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 7) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local183 = local134 >> 5;
												local142 = local134 & 0x1F;
												if (local142 == 0) {
													Static56.aClass171Array1[local183] = null;
													Static138.anInt2729 = -1;
													return true;
												}
												@Pc(4955) Class171 local4955 = new Class171();
												local4955.anInt5452 = local142;
												local4955.anInt5450 = Static256.aClass4_Sub24_Sub1_3.method3110();
												if (local4955.anInt5450 >= 0 && Static161.aClass4_Sub2_Sub4Array9.length > local4955.anInt5450) {
													if (local4955.anInt5452 == 1 || local4955.anInt5452 == 10) {
														local4955.anInt5453 = Static256.aClass4_Sub24_Sub1_3.method3085();
														Static256.aClass4_Sub24_Sub1_3.anInt3822 += 5;
													} else if (local4955.anInt5452 >= 2 && local4955.anInt5452 <= 6) {
														if (local4955.anInt5452 == 2) {
															local4955.anInt5451 = 64;
															local4955.anInt5462 = 64;
														}
														if (local4955.anInt5452 == 3) {
															local4955.anInt5451 = 0;
															local4955.anInt5462 = 64;
														}
														if (local4955.anInt5452 == 4) {
															local4955.anInt5451 = 128;
															local4955.anInt5462 = 64;
														}
														if (local4955.anInt5452 == 5) {
															local4955.anInt5462 = 0;
															local4955.anInt5451 = 64;
														}
														if (local4955.anInt5452 == 6) {
															local4955.anInt5451 = 64;
															local4955.anInt5462 = 128;
														}
														local4955.anInt5452 = 2;
														local4955.anInt5454 = Static256.aClass4_Sub24_Sub1_3.method3085();
														local4955.anInt5458 = Static256.aClass4_Sub24_Sub1_3.method3085();
														local4955.anInt5457 = Static256.aClass4_Sub24_Sub1_3.method3110();
														local4955.anInt5460 = Static256.aClass4_Sub24_Sub1_3.method3085();
													}
													local4955.anInt5459 = Static256.aClass4_Sub24_Sub1_3.method3085();
													if (local4955.anInt5459 == 65535) {
														local4955.anInt5459 = -1;
													}
													Static56.aClass171Array1[local183] = local4955;
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 88) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3084();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (Static74.method1258(local142)) {
													Static197.method3206(local183, local134);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 247) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3115();
												@Pc(5143) Class97 local5143 = Static148.method2340(local134);
												for (local142 = 0; local142 < local5143.anIntArray249.length; local142++) {
													local5143.anIntArray249[local142] = -1;
													local5143.anIntArray249[local142] = 0;
												}
												Static178.method2927(local5143);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 231) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local327 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local339 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (Static74.method1258(local134)) {
													Static278.aBooleanArray35[local183] = true;
													Static97.anIntArray372[local183] = local142;
													Static139.anIntArray229[local183] = local292;
													Static90.anIntArray394[local183] = local327;
													Static70.anIntArray136[local183] = local339;
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 74) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (local134 == 65535) {
													local134 = -1;
												}
												local183 = Static256.aClass4_Sub24_Sub1_3.method3096();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3074();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3085();
												if (local292 == 65535) {
													local292 = -1;
												}
												local327 = Static256.aClass4_Sub24_Sub1_3.method3086();
												if (Static74.method1258(local142)) {
													for (local339 = local292; local339 <= local134; local339++) {
														local452 = (long) local339 + ((long) local327 << 32);
														local1708 = (Class4_Sub22) Static65.aClass163_37.method4188(local452);
														if (local1708 != null) {
															local1720 = new Class4_Sub22(local1708.anInt3271, local183);
															local1708.method4690();
														} else if (local339 == -1) {
															local1720 = new Class4_Sub22(Static148.method2340(local327).aClass4_Sub22_4.anInt3271, local183);
														} else {
															local1720 = new Class4_Sub22(0, local183);
														}
														Static65.aClass163_37.method4181(local452, local1720);
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 62) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3121();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3068();
												if (Static74.method1258(local134)) {
													Static229.method3602(local183, local142);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 90) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local327 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local339 = Static256.aClass4_Sub24_Sub1_3.method3110();
												if (Static74.method1258(local134)) {
													Static247.method3794(local327, local183, local142, true, local339, local292);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 20) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3094();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3101();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3094();
												Static222.anInt4467 = local183 >> 1;
												Static72.aClass13_Sub5_Sub1_1.method3496(local142, (local183 & 0x1) == 1, local134);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 246) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3115();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3096();
												if (Static74.method1258(local142)) {
													Static186.method2980(local134, local183);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 6) {
												local434 = Static256.aClass4_Sub24_Sub1_3.method3113();
												local442 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local447 = Static256.aClass4_Sub24_Sub1_3.method3063();
												local345 = Static256.aClass4_Sub24_Sub1_3.method3110();
												local355 = Static256.aClass4_Sub24_Sub1_3.method3085();
												@Pc(5517) long local5517 = (local442 << 32) + local447;
												@Pc(5519) boolean local5519 = false;
												@Pc(5521) int local5521 = 0;
												label1417: while (true) {
													if (local5521 >= 100) {
														if (local345 <= 1) {
															for (local5521 = 0; local5521 < Static15.anInt334; local5521++) {
																if (Static229.aLongArray8[local5521] == local434) {
																	local5519 = true;
																	break label1417;
																}
															}
														}
														break;
													}
													if (local5517 == Static167.aLongArray5[local5521]) {
														local5519 = true;
														break;
													}
													local5521++;
												}
												if (!local5519 && Static45.anInt1039 == 0) {
													Static167.aLongArray5[Static55.anInt1241] = local5517;
													Static55.anInt1241 = (Static55.anInt1241 + 1) % 100;
													local1371 = Static67.method1178(local355).method973(Static256.aClass4_Sub24_Sub1_3);
													if (local345 == 2) {
														Static259.method4047("<img=1>" + Static94.method1558(local434), local1371, null, local355, 18);
													} else if (local345 == 1) {
														Static259.method4047("<img=0>" + Static94.method1558(local434), local1371, null, local355, 18);
													} else {
														Static259.method4047(Static94.method1558(local434), local1371, null, local355, 18);
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 5) {
												Static96.anInt1875 = Static256.aClass4_Sub24_Sub1_3.method3110();
												Static8.anInt160 = Static256.aClass4_Sub24_Sub1_3.method3110();
												Static106.anInt2119 = Static256.aClass4_Sub24_Sub1_3.method3110();
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 121) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3096();
												@Pc(5687) byte local5687 = Static256.aClass4_Sub24_Sub1_3.method3069();
												Static140.method2239(local134, local5687);
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 243) {
												Static15.anInt334 = Static31.anInt653 / 8;
												for (local134 = 0; local134 < Static15.anInt334; local134++) {
													Static229.aLongArray8[local134] = Static256.aClass4_Sub24_Sub1_3.method3113();
													Static224.aStringArray29[local134] = Static155.method2537(Static229.aLongArray8[local134]);
													Static151.aBooleanArray23[local134] = false;
												}
												Static279.anInt5479 = Static131.anInt1441;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 31) {
												@Pc(5745) byte local5745 = Static256.aClass4_Sub24_Sub1_3.method3119();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3085();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3096();
												if (Static74.method1258(local183)) {
													Static197.method3206(local142, local5745);
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 214) {
												Static218.anInt4197 = Static256.aClass4_Sub24_Sub1_3.method3108() * 30;
												Static30.anInt636 = Static131.anInt1441;
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 2) {
												local134 = Static256.aClass4_Sub24_Sub1_3.method3121();
												local183 = Static256.aClass4_Sub24_Sub1_3.method3108();
												local142 = Static256.aClass4_Sub24_Sub1_3.method3115();
												local292 = Static256.aClass4_Sub24_Sub1_3.method3096();
												if (local292 == 65535) {
													local292 = -1;
												}
												if (Static74.method1258(local183)) {
													@Pc(5817) Class97 local5817 = Static148.method2340(local134);
													@Pc(5829) Class29 local5829;
													if (local5817.aBoolean192) {
														Static246.method3789(local134, local142, local292);
														local5829 = Static187.method3128(local292);
														Static248.method3801(local134, local5829.anInt1024, local5829.anInt997, local5829.anInt991);
														Static240.method2131(local5829.anInt1008, local5829.anInt1020, local134, local5829.anInt1002);
													} else if (local292 == -1) {
														Static138.anInt2729 = -1;
														local5817.anInt3125 = 0;
														return true;
													} else {
														local5829 = Static187.method3128(local292);
														local5817.anInt3184 = local5829.anInt997 * 100 / local142;
														local5817.anInt3143 = local5829.anInt1024;
														local5817.anInt3125 = 4;
														local5817.anInt3114 = local5829.anInt991;
														local5817.anInt3121 = local292;
														Static178.method2927(local5817);
													}
												}
												Static138.anInt2729 = -1;
												return true;
											} else if (Static138.anInt2729 == 44) {
												Static260.anInt5846 = Static256.aClass4_Sub24_Sub1_3.method3101();
												Static257.anInt5058 = Static256.aClass4_Sub24_Sub1_3.method3110();
												while (Static256.aClass4_Sub24_Sub1_3.anInt3822 < Static31.anInt653) {
													Static138.anInt2729 = Static256.aClass4_Sub24_Sub1_3.method3110();
													Static42.method795();
												}
												Static138.anInt2729 = -1;
												return true;
											} else {
												Static204.method3269(null, "T1 - " + Static138.anInt2729 + "," + Static11.anInt280 + "," + Static185.anInt3683 + " - " + Static31.anInt653);
												Static39.method721();
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
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V")
	public static void method1368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static288.anInt5628 = arg3;
		Static183.anInt3660 = arg4;
		Static237.anInt4705 = arg2;
		Static308.anInt5870 = arg0;
		Static12.anInt283 = arg1;
		if (Static288.anInt5628 >= 100) {
			@Pc(22) int local22 = Static308.anInt5870 * 128 + 64;
			@Pc(28) int local28 = Static183.anInt3660 * 128 + 64;
			@Pc(37) int local37 = Static58.method2504(local28, local22, Static222.anInt4467) - Static12.anInt283;
			@Pc(42) int local42 = local37 - Static153.anInt3111;
			@Pc(47) int local47 = local28 - Static248.anInt4865;
			@Pc(52) int local52 = local22 - Static71.anInt1457;
			@Pc(63) int local63 = (int) Math.sqrt((double) (local52 * local52 + local47 * local47));
			Static254.anInt4974 = (int) (Math.atan2((double) local42, (double) local63) * 325.949D) & 0x7FF;
			Static56.anInt1258 = (int) (Math.atan2((double) local52, (double) local47) * -325.949D) & 0x7FF;
			if (Static254.anInt4974 < 128) {
				Static254.anInt4974 = 128;
			}
			if (Static254.anInt4974 > 383) {
				Static254.anInt4974 = 383;
			}
		}
		Static99.anInt1946 = 2;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	public static void method1370() {
		if (Static41.aClass54ArrayArray1 == null) {
			return;
		}
		@Pc(11) Class54 local11 = new Class54();
		for (@Pc(13) int local13 = 0; local13 < 13; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 13; local18++) {
				Static41.aClass54ArrayArray1[local13][local18] = local11;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!cg;Lclient!cg;)V")
	public static void method1371(@OriginalArg(1) Class22 arg0, @OriginalArg(2) Class22 arg1) {
		Static242.aClass22_80 = arg0;
		Static104.aClass22_34 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([BB)Lclient!jc;")
	public static Class4_Sub2_Sub9 method1372(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(25) Class4_Sub2_Sub9 local25;
		if (Static251.aBoolean330) {
			local25 = new Class4_Sub2_Sub9_Sub1(arg0, Static149.anIntArray238, Static278.anIntArray422, Static107.anIntArray188, Static246.anIntArray386, Static99.aByteArrayArray8);
		} else {
			local25 = new Class4_Sub2_Sub9_Sub2(arg0, Static149.anIntArray238, Static278.anIntArray422, Static107.anIntArray188, Static246.anIntArray386, Static99.aByteArrayArray8);
		}
		Static184.method2969();
		return local25;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIIILclient!ve;II)Lclient!wb;")
	public static Class4_Sub2_Sub4 method1373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class175 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(31) int local31 = (arg4 << 19) + ((arg0 ? 65536 : 0) + arg2 + (arg1 << 17));
		@Pc(41) long local41 = (long) local31 * 3849834839L + (long) arg5 * 3147483667L;
		@Pc(47) Class4_Sub2_Sub4 local47 = (Class4_Sub2_Sub4) Static92.aClass172_16.method4347(local41);
		if (local47 != null) {
			return local47;
		}
		Static283.aBoolean375 = false;
		local47 = Static100.method1658(arg2, arg4, arg1, false, arg3, arg0, false, arg5);
		if (local47 != null && !Static283.aBoolean375) {
			Static92.aClass172_16.method4345(local47, local41);
		}
		return local47;
	}
}
