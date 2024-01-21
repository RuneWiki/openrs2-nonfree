import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt765;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public static int anInt762 = 0;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_247 = Static177.method3050(")3runescape)3com");

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public static final int anInt764 = 4;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
	public static final int[] anIntArray65 = new int[anInt764];

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public static int anInt766 = 2;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt767 = 0;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_248 = Static177.method3050("p12_full");

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_249 = Static177.method3050("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!jd;")
	public static Class46 aClass46_250 = null;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public static int anInt771 = 0;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "[[Lclient!bb;")
	public static final Class8[][] aClass8ArrayArray1 = new Class8[anInt764][500];

	@OriginalMember(owner = "client!db", name = "v", descriptor = "Z")
	public static final boolean aBoolean40 = false;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_251 = Static177.method3050(" weitere Optionen");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III[Lclient!a;IIIII)V")
	public static void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) Class1 local13 = arg3[local7];
			if (local13 != null && (!local13.aBoolean8 || local13.anInt7 == 0 || local13.aBoolean1 || Static102.method1954(local13) != 0 || local13 == Static27.aClass1_10 || local13.anInt62 == 1338) && local13.anInt24 == arg0 && (!local13.aBoolean8 || !Static94.method1843(local13))) {
				@Pc(62) int local62 = local13.anInt43 + arg6;
				@Pc(67) int local67 = arg5 + local13.anInt8;
				@Pc(149) int local149;
				@Pc(138) int local138;
				@Pc(110) int local110;
				@Pc(131) int local131;
				@Pc(89) int local89;
				if (local13.anInt7 == 2) {
					local138 = arg4;
					local131 = arg2;
					local149 = arg1;
					local110 = arg7;
				} else {
					@Pc(84) int local84;
					@Pc(77) int local77;
					if (local13.anInt7 == 9) {
						local77 = local67;
						@Pc(82) int local82 = local13.anInt50 + local62;
						local84 = local62;
						local89 = local13.anInt20 + local67;
						if (local82 < local62) {
							local84 = local82;
							local82 = local62;
						}
						local82++;
						local110 = local82 < arg7 ? local82 : arg7;
						if (local67 > local89) {
							local77 = local89;
							local89 = local67;
						}
						local89++;
						local131 = local89 < arg2 ? local89 : arg2;
						local138 = arg4 >= local77 ? arg4 : local77;
						local149 = arg1 < local84 ? local84 : arg1;
					} else {
						local149 = local62 <= arg1 ? arg1 : local62;
						local84 = local13.anInt50 + local62;
						local138 = local67 <= arg4 ? arg4 : local67;
						local110 = local84 < arg7 ? local84 : arg7;
						local77 = local13.anInt20 + local67;
						local131 = local77 >= arg2 ? arg2 : local77;
					}
				}
				if (Static6.aClass1_2 == local13) {
					Static28.anInt750 = local67;
					Static166.aBoolean143 = true;
					Static4.anInt2848 = local62;
				}
				if (!local13.aBoolean8 || local110 > local149 && local138 < local131) {
					if (local13.anInt62 == 1337) {
						Static3.method21(local13);
					} else {
						if (local13.anInt7 == 0) {
							if (!local13.aBoolean8 && Static94.method1843(local13) && local13 != Static102.aClass1_31) {
								continue;
							}
							method501(local13.anInt53, local149, local131, arg3, local138, local67 - local13.anInt32, -local13.anInt18 + local62, local110);
							if (local13.aClass1Array1 != null) {
								method501(local13.anInt53, local149, local131, local13.aClass1Array1, local138, local67 - local13.anInt32, -local13.anInt18 + local62, local110);
							}
							@Pc(297) Class4_Sub14 local297 = (Class4_Sub14) Static106.aClass20_5.method505((long) local13.anInt53);
							if (local297 != null) {
								Static186.method3137(local110, local138, local67, local149, local62, local297.anInt2450, local131);
							}
						}
						if (local13.aBoolean8) {
							@Pc(334) boolean local334;
							if (local149 <= Static25.anInt620 && local138 <= Static169.anInt3778 && Static25.anInt620 < local110 && Static169.anInt3778 < local131) {
								local334 = true;
							} else {
								local334 = false;
							}
							@Pc(340) boolean local340 = false;
							if (Static177.anInt3974 == 1 && local334) {
								local340 = true;
							}
							@Pc(349) boolean local349 = false;
							if (Static66.anInt1811 == 1 && local149 <= Static28.anInt747 && local138 <= Static73.anInt1877 && Static28.anInt747 < local110 && Static73.anInt1877 < local131) {
								local349 = true;
							}
							if (local13.anInt62 == 1338) {
								if (local349) {
									Static7.method104(local13, Static73.anInt1877 - local67, Static28.anInt747 - local62);
								}
								continue;
							}
							if (local349) {
								Static58.method1101(local13, Static73.anInt1877 - local67, Static28.anInt747 - local62);
							}
							if (Static6.aClass1_2 != null && local13 != Static6.aClass1_2 && local334 && Static130.method2311(Static102.method1954(local13))) {
								Static179.aClass1_51 = local13;
							}
							if (local13 == Static27.aClass1_10) {
								Static143.anInt3335 = local62;
								Static88.anInt2260 = local67;
								Static13.aBoolean24 = true;
							}
							if (local13.aBoolean1) {
								@Pc(446) Class4_Sub21 local446;
								if (local334 && Static71.anInt1856 != 0 && local13.anObjectArray15 != null) {
									local446 = new Class4_Sub21();
									local446.anInt3265 = Static71.anInt1856;
									local446.aClass1_40 = local13;
									local446.anObjectArray28 = local13.anObjectArray15;
									Static3.aClass11_1.method272(local446);
								}
								if (Static6.aClass1_2 != null || Static103.aClass1_32 != null || Static64.aBoolean76) {
									local349 = false;
									local340 = false;
									local334 = false;
								}
								if (!local13.aBoolean2 && local349) {
									local13.aBoolean2 = true;
									if (local13.anObjectArray6 != null) {
										local446 = new Class4_Sub21();
										local446.anInt3265 = Static73.anInt1877 - local67;
										local446.anObjectArray28 = local13.anObjectArray6;
										local446.aClass1_40 = local13;
										local446.anInt3268 = Static28.anInt747 - local62;
										Static3.aClass11_1.method272(local446);
									}
								}
								if (local13.aBoolean2 && local340 && local13.anObjectArray18 != null) {
									local446 = new Class4_Sub21();
									local446.anObjectArray28 = local13.anObjectArray18;
									local446.aClass1_40 = local13;
									local446.anInt3265 = Static169.anInt3778 - local67;
									local446.anInt3268 = Static25.anInt620 - local62;
									Static3.aClass11_1.method272(local446);
								}
								if (local13.aBoolean2 && !local340) {
									local13.aBoolean2 = false;
									if (local13.anObjectArray23 != null) {
										local446 = new Class4_Sub21();
										local446.aClass1_40 = local13;
										local446.anInt3265 = Static169.anInt3778 - local67;
										local446.anInt3268 = Static25.anInt620 - local62;
										local446.anObjectArray28 = local13.anObjectArray23;
										Static59.aClass11_6.method272(local446);
									}
								}
								if (local340 && local13.anObjectArray21 != null) {
									local446 = new Class4_Sub21();
									local446.aClass1_40 = local13;
									local446.anInt3265 = Static169.anInt3778 - local67;
									local446.anInt3268 = Static25.anInt620 - local62;
									local446.anObjectArray28 = local13.anObjectArray21;
									Static3.aClass11_1.method272(local446);
								}
								if (!local13.aBoolean4 && local334) {
									local13.aBoolean4 = true;
									if (local13.anObjectArray13 != null) {
										local446 = new Class4_Sub21();
										local446.anInt3265 = Static169.anInt3778 - local67;
										local446.anObjectArray28 = local13.anObjectArray13;
										local446.anInt3268 = Static25.anInt620 - local62;
										local446.aClass1_40 = local13;
										Static3.aClass11_1.method272(local446);
									}
								}
								if (local13.aBoolean4 && local334 && local13.anObjectArray10 != null) {
									local446 = new Class4_Sub21();
									local446.aClass1_40 = local13;
									local446.anInt3265 = Static169.anInt3778 - local67;
									local446.anObjectArray28 = local13.anObjectArray10;
									local446.anInt3268 = Static25.anInt620 - local62;
									Static3.aClass11_1.method272(local446);
								}
								if (local13.aBoolean4 && !local334) {
									local13.aBoolean4 = false;
									if (local13.anObjectArray20 != null) {
										local446 = new Class4_Sub21();
										local446.anInt3265 = Static169.anInt3778 - local67;
										local446.anObjectArray28 = local13.anObjectArray20;
										local446.aClass1_40 = local13;
										local446.anInt3268 = Static25.anInt620 - local62;
										Static59.aClass11_6.method272(local446);
									}
								}
								if (local13.anObjectArray4 != null) {
									local446 = new Class4_Sub21();
									local446.aClass1_40 = local13;
									local446.anObjectArray28 = local13.anObjectArray4;
									Static122.aClass11_13.method272(local446);
								}
								@Pc(769) int local769;
								@Pc(771) int local771;
								@Pc(783) Class4_Sub21 local783;
								if (local13.anObjectArray3 != null && local13.anInt29 < Static144.anInt3349) {
									if (local13.anIntArray9 == null || Static144.anInt3349 - local13.anInt29 > 32) {
										local446 = new Class4_Sub21();
										local446.aClass1_40 = local13;
										local446.anObjectArray28 = local13.anObjectArray3;
										Static3.aClass11_1.method272(local446);
									} else {
										label388: for (local89 = local13.anInt29; local89 < Static144.anInt3349; local89++) {
											local769 = Static140.anIntArray315[local89 & 0x1F];
											for (local771 = 0; local771 < local13.anIntArray9.length; local771++) {
												if (local13.anIntArray9[local771] == local769) {
													local783 = new Class4_Sub21();
													local783.anObjectArray28 = local13.anObjectArray3;
													local783.aClass1_40 = local13;
													Static3.aClass11_1.method272(local783);
													break label388;
												}
											}
										}
									}
									local13.anInt29 = Static144.anInt3349;
								}
								if (local13.anObjectArray17 != null && Static148.anInt3383 > local13.anInt41) {
									if (local13.anIntArray12 == null || Static148.anInt3383 - local13.anInt41 > 32) {
										local446 = new Class4_Sub21();
										local446.anObjectArray28 = local13.anObjectArray17;
										local446.aClass1_40 = local13;
										Static3.aClass11_1.method272(local446);
									} else {
										label364: for (local89 = local13.anInt41; local89 < Static148.anInt3383; local89++) {
											local769 = Static162.anIntArray350[local89 & 0x1F];
											for (local771 = 0; local771 < local13.anIntArray12.length; local771++) {
												if (local13.anIntArray12[local771] == local769) {
													local783 = new Class4_Sub21();
													local783.anObjectArray28 = local13.anObjectArray17;
													local783.aClass1_40 = local13;
													Static3.aClass11_1.method272(local783);
													break label364;
												}
											}
										}
									}
									local13.anInt41 = Static148.anInt3383;
								}
								if (local13.anObjectArray9 != null && local13.anInt1 < Static110.anInt2694) {
									if (local13.anIntArray6 == null || Static110.anInt2694 - local13.anInt1 > 32) {
										local446 = new Class4_Sub21();
										local446.aClass1_40 = local13;
										local446.anObjectArray28 = local13.anObjectArray9;
										Static3.aClass11_1.method272(local446);
									} else {
										label340: for (local89 = local13.anInt1; local89 < Static110.anInt2694; local89++) {
											local769 = Static89.anIntArray216[local89 & 0x1F];
											for (local771 = 0; local771 < local13.anIntArray6.length; local771++) {
												if (local13.anIntArray6[local771] == local769) {
													local783 = new Class4_Sub21();
													local783.aClass1_40 = local13;
													local783.anObjectArray28 = local13.anObjectArray9;
													Static3.aClass11_1.method272(local783);
													break label340;
												}
											}
										}
									}
									local13.anInt1 = Static110.anInt2694;
								}
								if (local13.anInt65 < Static38.anInt1003 && local13.anObjectArray12 != null) {
									local446 = new Class4_Sub21();
									local446.anObjectArray28 = local13.anObjectArray12;
									local446.aClass1_40 = local13;
									Static3.aClass11_1.method272(local446);
								}
								if (Static122.anInt2963 > local13.anInt65 && local13.anObjectArray22 != null) {
									local446 = new Class4_Sub21();
									local446.aClass1_40 = local13;
									local446.anObjectArray28 = local13.anObjectArray22;
									Static3.aClass11_1.method272(local446);
								}
								if (Static102.anInt2594 > local13.anInt65 && local13.anObjectArray14 != null) {
									local446 = new Class4_Sub21();
									local446.aClass1_40 = local13;
									local446.anObjectArray28 = local13.anObjectArray14;
									Static3.aClass11_1.method272(local446);
								}
								if (local13.anInt65 < Static35.anInt924 && local13.anObjectArray5 != null) {
									local446 = new Class4_Sub21();
									local446.aClass1_40 = local13;
									local446.anObjectArray28 = local13.anObjectArray5;
									Static3.aClass11_1.method272(local446);
								}
								if (Static83.anInt2130 > local13.anInt65 && local13.anObjectArray1 != null) {
									local446 = new Class4_Sub21();
									local446.aClass1_40 = local13;
									local446.anObjectArray28 = local13.anObjectArray1;
									Static3.aClass11_1.method272(local446);
								}
								local13.anInt65 = Static163.anInt3721;
								if (local13.anObjectArray24 != null) {
									for (local89 = 0; local89 < Static98.anInt2508; local89++) {
										@Pc(1151) Class4_Sub21 local1151 = new Class4_Sub21();
										local1151.aClass1_40 = local13;
										local1151.anInt3264 = Static136.anIntArray309[local89];
										local1151.anInt3270 = Static17.anIntArray47[local89];
										local1151.anObjectArray28 = local13.anObjectArray24;
										Static3.aClass11_1.method272(local1151);
									}
								}
							}
						}
						if (!local13.aBoolean8) {
							if (Static6.aClass1_2 != null || Static103.aClass1_32 != null || Static64.aBoolean76) {
								return;
							}
							if ((local13.anInt11 >= 0 || local13.anInt45 != 0) && Static25.anInt620 >= local149 && Static169.anInt3778 >= local138 && Static25.anInt620 < local110 && local131 > Static169.anInt3778) {
								if (local13.anInt11 >= 0) {
									Static102.aClass1_31 = arg3[local13.anInt11];
								} else {
									Static102.aClass1_31 = local13;
								}
							}
							if (local13.anInt7 == 8 && Static25.anInt620 >= local149 && Static169.anInt3778 >= local138 && Static25.anInt620 < local110 && local131 > Static169.anInt3778) {
								Static162.aClass1_47 = local13;
							}
							if (local13.anInt20 < local13.anInt42) {
								Static131.method2313(local13.anInt50 + local62, local13, local13.anInt20, Static25.anInt620, local67, local13.anInt42, Static169.anInt3778);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	public static void method502() {
		Static103.aBoolean113 = true;
		Static186.aBoolean169 = true;
	}
}
