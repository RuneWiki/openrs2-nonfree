import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!qc;")
	private static Class60 aClass60_791 = Static121.method2047("Service unavailable)3");

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt1944 = 0;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[5][5000];

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_792 = Static121.method2047(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_793 = Static121.method2047(" (X");

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_794 = Static121.method2047("::rect_debug");

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	public static int anInt1951 = 0;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_795 = Static121.method2047("Welt");

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!qc;")
	private static Class60 aClass60_797 = Static121.method2047("Unable to find ");

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_796 = aClass60_797;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!qc;")
	public static Class60 aClass60_798 = Static121.method2047("Untersuchen");

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_799 = Static121.method2047("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	public static int anInt1953 = 0;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!qc;")
	public static Class60 aClass60_800 = Static121.method2047("rect_debug=");

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
	public static int anInt1955 = 0;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_801 = aClass60_791;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!q;I)Lclient!qc;")
	public static Class60 method1452(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (!Static29.method579(Static73.method1384(arg0), arg1) && arg0.anObjectArray19 == null) {
			return null;
		} else if (arg0.aClass60Array20 == null || arg1 >= arg0.aClass60Array20.length || arg0.aClass60Array20[arg1] == null || arg0.aClass60Array20[arg1].method1666().method1644() == 0) {
			return Static128.aBoolean113 ? Static125.method2072(new Class60[] { Static62.aClass60_598, Static120.method1450(arg1) }) : null;
		} else {
			return arg0.aClass60Array20[arg1];
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1453() {
		aClass60_799 = null;
		aClass60_794 = null;
		aClass60_796 = null;
		anIntArrayArray18 = null;
		aClass60_797 = null;
		aClass60_791 = null;
		aClass60_793 = null;
		aClass60_792 = null;
		aClass60_795 = null;
		aClass60_800 = null;
		aClass60_798 = null;
		aClass60_801 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII[Lclient!q;I)V")
	public static void method1455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4_Sub17[] arg6, @OriginalArg(8) int arg7) {
		for (@Pc(15) int local15 = 0; local15 < arg6.length; local15++) {
			@Pc(21) Class4_Sub17 local21 = arg6[local15];
			if (local21 != null && (!local21.aBoolean103 || local21.anInt2231 == 0 || local21.aBoolean101 || Static73.method1384(local21) != 0 || local21 == Static114.aClass4_Sub17_15) && arg2 == local21.anInt2192 && (!local21.aBoolean103 || !Static13.method277(local21))) {
				@Pc(61) int local61 = local21.anInt2234 + arg7;
				@Pc(66) int local66 = local21.anInt2204 + arg5;
				@Pc(85) int local85;
				@Pc(109) int local109;
				@Pc(98) int local98;
				@Pc(125) int local125;
				@Pc(162) int local162;
				if (local21.anInt2231 == 2) {
					local98 = arg0;
					local125 = arg3;
					local109 = arg4;
					local85 = arg1;
				} else {
					@Pc(91) int local91;
					@Pc(114) int local114;
					if (local21.anInt2231 == 9) {
						local91 = local61;
						local114 = local66;
						@Pc(136) int local136 = local21.anInt2184 + local61;
						if (local136 < local61) {
							local91 = local136;
							local136 = local61;
						}
						local85 = local91 > arg1 ? local91 : arg1;
						local136++;
						local162 = local66 + local21.anInt2186;
						local98 = local136 < arg0 ? local136 : arg0;
						if (local66 > local162) {
							local114 = local162;
							local162 = local66;
						}
						local162++;
						local109 = local114 <= arg4 ? arg4 : local114;
						local125 = local162 >= arg3 ? arg3 : local162;
					} else {
						local85 = arg1 < local61 ? local61 : arg1;
						local91 = local61 + local21.anInt2184;
						local98 = arg0 <= local91 ? arg0 : local91;
						local109 = arg4 >= local66 ? arg4 : local66;
						local114 = local21.anInt2186 + local66;
						local125 = arg3 <= local114 ? arg3 : local114;
					}
				}
				if (Static60.aClass4_Sub17_12 == local21) {
					Static73.aBoolean73 = true;
					Static34.anInt901 = local66;
					Static120.anInt1942 = local61;
				}
				if (!local21.aBoolean103 || local98 > local85 && local125 > local109) {
					if (local21.anInt2227 == 1337) {
						Static130.method2133(local21);
					} else if (local21.anInt2227 == 1338) {
						Static35.method632(local66, local61);
					} else {
						if (local21.anInt2231 == 0) {
							if (!local21.aBoolean103 && Static13.method277(local21) && Static119.aClass4_Sub17_16 != local21) {
								continue;
							}
							method1455(local98, local85, local21.anInt2203, local125, local109, local66 - local21.anInt2215, arg6, local61 - local21.anInt2224);
							if (local21.aClass4_Sub17Array3 != null) {
								method1455(local98, local85, local21.anInt2203, local125, local109, local66 - local21.anInt2215, local21.aClass4_Sub17Array3, local61 - local21.anInt2224);
							}
							@Pc(309) Class4_Sub18 local309 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local21.anInt2203);
							if (local309 != null) {
								Static25.method481(local61, local98, local109, local66, local85, local309.anInt2402, local125);
							}
						}
						if (local21.aBoolean103) {
							@Pc(348) boolean local348;
							if (Static82.anInt1962 >= local85 && local109 <= Static17.anInt452 && Static82.anInt1962 < local98 && Static17.anInt452 < local125) {
								local348 = true;
							} else {
								local348 = false;
							}
							@Pc(354) boolean local354 = false;
							if (Static3.anInt28 == 1 && Static128.anInt2648 >= local85 && Static22.anInt652 >= local109 && Static128.anInt2648 < local98 && Static22.anInt652 < local125) {
								local354 = true;
							}
							@Pc(377) boolean local377 = false;
							if (Static116.anInt2785 == 1 && local348) {
								local377 = true;
							}
							if (local354) {
								Static54.method1002(Static128.anInt2648 - local61, -local66 + Static22.anInt652, local21);
							}
							if (Static60.aClass4_Sub17_12 != null && local21 != Static60.aClass4_Sub17_12 && local348 && Static7.method2116(Static73.method1384(local21))) {
								Static23.aClass4_Sub17_2 = local21;
							}
							if (local21 == Static114.aClass4_Sub17_15) {
								Static56.anInt1425 = local66;
								Static11.aBoolean9 = true;
								Static22.anInt649 = local61;
							}
							if (local21.aBoolean101) {
								@Pc(438) Class4_Sub16 local438;
								if (local348 && Static108.anInt2548 != 0 && local21.anObjectArray25 != null) {
									local438 = new Class4_Sub16();
									local438.anObjectArray3 = local21.anObjectArray25;
									local438.anInt1901 = Static108.anInt2548;
									local438.aClass4_Sub17_9 = local21;
									Static86.aClass70_5.method1931(local438);
								}
								if (Static60.aClass4_Sub17_12 != null || Static93.aBoolean105) {
									local377 = false;
									local354 = false;
									local348 = false;
								}
								if (!local21.aBoolean100 && local354) {
									local21.aBoolean100 = true;
									if (local21.anObjectArray15 != null) {
										local438 = new Class4_Sub16();
										local438.aClass4_Sub17_9 = local21;
										local438.anObjectArray3 = local21.anObjectArray15;
										local438.anInt1901 = Static22.anInt652 - local66;
										local438.anInt1889 = Static128.anInt2648 - local61;
										Static86.aClass70_5.method1931(local438);
									}
								}
								if (local21.aBoolean100 && local377 && local21.anObjectArray18 != null) {
									local438 = new Class4_Sub16();
									local438.anInt1901 = Static17.anInt452 - local66;
									local438.anObjectArray3 = local21.anObjectArray18;
									local438.aClass4_Sub17_9 = local21;
									local438.anInt1889 = Static82.anInt1962 - local61;
									Static86.aClass70_5.method1931(local438);
								}
								if (local21.aBoolean100 && !local377) {
									local21.aBoolean100 = false;
									if (local21.anObjectArray5 != null) {
										local438 = new Class4_Sub16();
										local438.anInt1889 = Static82.anInt1962 - local61;
										local438.anObjectArray3 = local21.anObjectArray5;
										local438.anInt1901 = Static17.anInt452 - local66;
										local438.aClass4_Sub17_9 = local21;
										Static72.aClass70_15.method1931(local438);
									}
								}
								if (local377 && local21.anObjectArray14 != null) {
									local438 = new Class4_Sub16();
									local438.anInt1889 = Static82.anInt1962 - local61;
									local438.aClass4_Sub17_9 = local21;
									local438.anInt1901 = Static17.anInt452 - local66;
									local438.anObjectArray3 = local21.anObjectArray14;
									Static86.aClass70_5.method1931(local438);
								}
								if (!local21.aBoolean95 && local348) {
									local21.aBoolean95 = true;
									if (local21.anObjectArray28 != null) {
										local438 = new Class4_Sub16();
										local438.anInt1889 = Static82.anInt1962 - local61;
										local438.anObjectArray3 = local21.anObjectArray28;
										local438.anInt1901 = Static17.anInt452 - local66;
										local438.aClass4_Sub17_9 = local21;
										Static86.aClass70_5.method1931(local438);
									}
								}
								if (local21.aBoolean95 && local348 && local21.anObjectArray22 != null) {
									local438 = new Class4_Sub16();
									local438.anInt1901 = Static17.anInt452 - local66;
									local438.aClass4_Sub17_9 = local21;
									local438.anInt1889 = Static82.anInt1962 - local61;
									local438.anObjectArray3 = local21.anObjectArray22;
									Static86.aClass70_5.method1931(local438);
								}
								if (local21.aBoolean95 && !local348) {
									local21.aBoolean95 = false;
									if (local21.anObjectArray7 != null) {
										local438 = new Class4_Sub16();
										local438.aClass4_Sub17_9 = local21;
										local438.anObjectArray3 = local21.anObjectArray7;
										local438.anInt1901 = Static17.anInt452 - local66;
										local438.anInt1889 = Static82.anInt1962 - local61;
										Static72.aClass70_15.method1931(local438);
									}
								}
								if (local21.anObjectArray11 != null) {
									local438 = new Class4_Sub16();
									local438.anObjectArray3 = local21.anObjectArray11;
									local438.aClass4_Sub17_9 = local21;
									Static86.aClass70_6.method1931(local438);
								}
								@Pc(788) int local788;
								@Pc(790) int local790;
								@Pc(806) Class4_Sub16 local806;
								if (local21.anObjectArray23 != null && Static121.anInt2898 > local21.anInt2189) {
									if (local21.anIntArray220 == null || Static121.anInt2898 - local21.anInt2189 > 32) {
										local438 = new Class4_Sub16();
										local438.aClass4_Sub17_9 = local21;
										local438.anObjectArray3 = local21.anObjectArray23;
										Static86.aClass70_5.method1931(local438);
									} else {
										label383: for (local162 = local21.anInt2189; local162 < Static121.anInt2898; local162++) {
											local788 = Static51.anIntArray141[local162 & 0x1F];
											for (local790 = 0; local790 < local21.anIntArray220.length; local790++) {
												if (local21.anIntArray220[local790] == local788) {
													local806 = new Class4_Sub16();
													local806.anObjectArray3 = local21.anObjectArray23;
													local806.aClass4_Sub17_9 = local21;
													Static86.aClass70_5.method1931(local806);
													break label383;
												}
											}
										}
									}
									local21.anInt2189 = Static121.anInt2898;
								}
								if (local21.anObjectArray24 != null && local21.anInt2201 < Static120.anInt1941) {
									if (local21.anIntArray221 == null || Static120.anInt1941 - local21.anInt2201 > 32) {
										local438 = new Class4_Sub16();
										local438.aClass4_Sub17_9 = local21;
										local438.anObjectArray3 = local21.anObjectArray24;
										Static86.aClass70_5.method1931(local438);
									} else {
										label359: for (local162 = local21.anInt2201; local162 < Static120.anInt1941; local162++) {
											local788 = Static8.anIntArray10[local162 & 0x1F];
											for (local790 = 0; local790 < local21.anIntArray221.length; local790++) {
												if (local21.anIntArray221[local790] == local788) {
													local806 = new Class4_Sub16();
													local806.anObjectArray3 = local21.anObjectArray24;
													local806.aClass4_Sub17_9 = local21;
													Static86.aClass70_5.method1931(local806);
													break label359;
												}
											}
										}
									}
									local21.anInt2201 = Static120.anInt1941;
								}
								if (local21.anObjectArray26 != null && Static78.anInt1909 > local21.anInt2225) {
									if (local21.anIntArray226 == null || Static78.anInt1909 - local21.anInt2225 > 32) {
										local438 = new Class4_Sub16();
										local438.anObjectArray3 = local21.anObjectArray26;
										local438.aClass4_Sub17_9 = local21;
										Static86.aClass70_5.method1931(local438);
									} else {
										label335: for (local162 = local21.anInt2225; local162 < Static78.anInt1909; local162++) {
											local788 = Static45.anIntArray111[local162 & 0x1F];
											for (local790 = 0; local790 < local21.anIntArray226.length; local790++) {
												if (local788 == local21.anIntArray226[local790]) {
													local806 = new Class4_Sub16();
													local806.anObjectArray3 = local21.anObjectArray26;
													local806.aClass4_Sub17_9 = local21;
													Static86.aClass70_5.method1931(local806);
													break label335;
												}
											}
										}
									}
									local21.anInt2225 = Static78.anInt1909;
								}
								if (local21.anInt2206 < Static95.anInt2326 && local21.anObjectArray20 != null) {
									local438 = new Class4_Sub16();
									local438.aClass4_Sub17_9 = local21;
									local438.anObjectArray3 = local21.anObjectArray20;
									Static86.aClass70_5.method1931(local438);
								}
								if (local21.anInt2206 < Static92.anInt2194 && local21.anObjectArray6 != null) {
									local438 = new Class4_Sub16();
									local438.anObjectArray3 = local21.anObjectArray6;
									local438.aClass4_Sub17_9 = local21;
									Static86.aClass70_5.method1931(local438);
								}
								if (local21.anInt2206 < Static16.anInt440 && local21.anObjectArray21 != null) {
									local438 = new Class4_Sub16();
									local438.anObjectArray3 = local21.anObjectArray21;
									local438.aClass4_Sub17_9 = local21;
									Static86.aClass70_5.method1931(local438);
								}
								if (local21.anInt2206 < Static61.anInt1544 && local21.anObjectArray9 != null) {
									local438 = new Class4_Sub16();
									local438.anObjectArray3 = local21.anObjectArray9;
									local438.aClass4_Sub17_9 = local21;
									Static86.aClass70_5.method1931(local438);
								}
								local21.anInt2206 = Static63.anInt1698;
								if (local21.anObjectArray13 != null) {
									for (local162 = 0; local162 < Static119.anInt2863; local162++) {
										@Pc(1127) Class4_Sub16 local1127 = new Class4_Sub16();
										local1127.aClass4_Sub17_9 = local21;
										local1127.anInt1892 = Static45.anIntArray109[local162];
										local1127.anInt1902 = Static58.anIntArray150[local162];
										local1127.anObjectArray3 = local21.anObjectArray13;
										Static86.aClass70_5.method1931(local1127);
									}
								}
							}
						}
						if (!local21.aBoolean103) {
							if ((local21.anInt2252 >= 0 || local21.anInt2219 != 0) && Static82.anInt1962 >= local85 && local109 <= Static17.anInt452 && Static82.anInt1962 < local98 && local125 > Static17.anInt452) {
								if (local21.anInt2252 < 0) {
									Static119.aClass4_Sub17_16 = local21;
								} else {
									Static119.aClass4_Sub17_16 = arg6[local21.anInt2252];
								}
							}
							if (local21.anInt2231 == 8 && Static82.anInt1962 >= local85 && local109 <= Static17.anInt452 && local98 > Static82.anInt1962 && Static17.anInt452 < local125) {
								Static88.aClass4_Sub17_10 = local21;
							}
							if (local21.anInt2186 < local21.anInt2196) {
								Static7.method2111(Static17.anInt452, local61 + local21.anInt2184, Static82.anInt1962, local21.anInt2196, local66, local21.anInt2186, local21);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZJ)V")
	public static void method1456(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static46.anInt1193; local20++) {
			if (Static122.aLongArray13[local20] == arg0) {
				Static46.anInt1193--;
				for (@Pc(42) int local42 = local20; local42 < Static46.anInt1193; local42++) {
					Static61.aClass60Array12[local42] = Static61.aClass60Array12[local42 + 1];
					Static1.anIntArray1[local42] = Static1.anIntArray1[local42 + 1];
					Static122.aLongArray13[local42] = Static122.aLongArray13[local42 + 1];
					Static72.anIntArray189[local42] = Static72.anIntArray189[local42 + 1];
				}
				Static92.anInt2194 = Static63.anInt1698;
				Static56.aClass4_Sub13_Sub1_1.method1265(48);
				Static56.aClass4_Sub13_Sub1_1.method1242(arg0);
				return;
			}
		}
	}
}
