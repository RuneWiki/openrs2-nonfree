import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!c;")
	public static Class10 aClass10_11;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	public static int anInt880 = 0;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_302 = Static41.method597("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_303 = Static41.method597(")4lang)4de");

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_304 = Static41.method597("Nehmen");

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!od;")
	private static Class60 aClass60_305 = Static41.method597("OFF");

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!od;")
	public static Class60 aClass60_306 = Static41.method597(" )2>");

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!od;")
	public static Class60 aClass60_307 = aClass60_305;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public static int anInt894 = -1;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public static int anInt897 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method471(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static7.aClass82_1);
		arg0.addMouseMotionListener(Static7.aClass82_1);
		arg0.addFocusListener(Static7.aClass82_1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII[B)Z")
	public static boolean method472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub9 local12 = new Class4_Sub9(arg2);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(18) int local18 = local12.method770();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(36) int local36;
				while (!local28) {
					local36 = local12.method770();
					if (local36 == 0) {
						continue label56;
					}
					local26 += local36 - 1;
					@Pc(63) int local63 = local26 & 0x3F;
					@Pc(69) int local69 = local26 >> 6 & 0x3F;
					@Pc(73) int local73 = arg0 + local69;
					@Pc(79) int local79 = local12.method773() >> 2;
					@Pc(83) int local83 = arg1 + local63;
					if (local73 > 0 && local83 > 0 && local73 < 103 && local83 < 103) {
						@Pc(101) Class4_Sub3_Sub3 local101 = Static76.method1244(local14);
						if (local79 != 22 || !Static8.aBoolean3 || local101.anInt738 != 0 || local101.anInt732 == 1 || local101.aBoolean31) {
							if (!local101.method396()) {
								Static30.anInt905++;
								local7 = false;
							}
							local28 = true;
						}
					}
				}
				local36 = local12.method770();
				if (local36 == 0) {
					break;
				}
				local12.method773();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method473(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static7.aClass82_1);
		arg0.removeMouseMotionListener(Static7.aClass82_1);
		arg0.removeFocusListener(Static7.aClass82_1);
		Static55.anInt1495 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method474() {
		aClass10_11 = null;
		aClass60_304 = null;
		aClass60_307 = null;
		anIntArray91 = null;
		aClass60_302 = null;
		aClass60_305 = null;
		aClass60_306 = null;
		aClass60_303 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method475(@OriginalArg(0) Class10 arg0) {
		Static133.aClass10_32 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[Lclient!sa;IIIIII)V")
	public static void method476(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub14[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			@Pc(19) Class4_Sub14 local19 = arg1[local13];
			if (local19 != null && (!local19.aBoolean95 || local19.anInt2389 == 0 || local19.aBoolean100 || Static38.method575(local19) != 0 || local19 == Static69.aClass4_Sub14_10) && arg5 == local19.anInt2397 && (!local19.aBoolean95 || !Static2.method9(local19))) {
				@Pc(56) int local56 = arg0 + local19.anInt2406;
				@Pc(61) int local61 = arg4 + local19.anInt2375;
				if (Static81.aClass4_Sub14_12 == local19) {
					Static62.anInt1586 = local56;
					Static124.anInt2802 = local61;
					Static14.aBoolean18 = true;
				}
				@Pc(92) int local92;
				@Pc(85) int local85;
				@Pc(117) int local117;
				@Pc(110) int local110;
				@Pc(146) int local146;
				if (local19.anInt2389 == 2) {
					local92 = arg2;
					local110 = arg3;
					local85 = arg6;
					local117 = arg7;
				} else {
					@Pc(103) int local103;
					@Pc(97) int local97;
					if (local19.anInt2389 == 9) {
						local103 = local56;
						local97 = local61;
						@Pc(128) int local128 = local19.anInt2392 + local56;
						if (local128 < local56) {
							local103 = local128;
							local128 = local56;
						}
						local146 = local61 + local19.anInt2440;
						local92 = local103 <= arg2 ? arg2 : local103;
						local128++;
						local117 = local128 < arg7 ? local128 : arg7;
						if (local146 < local61) {
							local97 = local146;
							local146 = local61;
						}
						local146++;
						local85 = local97 <= arg6 ? arg6 : local97;
						local110 = local146 >= arg3 ? arg3 : local146;
					} else {
						local85 = arg6 >= local61 ? arg6 : local61;
						local92 = local56 > arg2 ? local56 : arg2;
						local97 = local61 + local19.anInt2440;
						local103 = local56 + local19.anInt2392;
						local110 = arg3 <= local97 ? arg3 : local97;
						local117 = local103 < arg7 ? local103 : arg7;
					}
				}
				if (!local19.aBoolean95 || local117 > local92 && local85 < local110) {
					if (local19.anInt2432 == 1337) {
						Static36.method558(local19);
					} else if (local19.anInt2432 == 1338) {
						Static82.method1302(local61, local56);
					} else {
						if (local19.anInt2389 == 0) {
							if (!local19.aBoolean95 && Static2.method9(local19) && local19 != Static18.aClass4_Sub14_4) {
								continue;
							}
							method476(local56 - local19.anInt2416, arg1, local92, local110, local61 - local19.anInt2437, local19.anInt2388, local85, local117);
							if (local19.aClass4_Sub14Array3 != null) {
								method476(local56 - local19.anInt2416, local19.aClass4_Sub14Array3, local92, local110, local61 - local19.anInt2437, local19.anInt2388, local85, local117);
							}
							@Pc(299) Class4_Sub18 local299 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local19.anInt2388);
							if (local299 != null) {
								Static5.method56(local299.anInt2589, local92, local110, local117, local61, local56, local85);
							}
						}
						if (local19.aBoolean95) {
							@Pc(344) boolean local344;
							if (local92 <= Static36.anInt1006 && local85 <= Static85.anInt2015 && local117 > Static36.anInt1006 && Static85.anInt2015 < local110) {
								local344 = true;
							} else {
								local344 = false;
							}
							@Pc(350) boolean local350 = false;
							if (Static24.anInt834 == 1 && local344) {
								local350 = true;
							}
							@Pc(361) boolean local361 = false;
							if (Static97.anInt2284 == 1 && local92 <= Static122.anInt2791 && local85 <= Static63.anInt1591 && Static122.anInt2791 < local117 && Static63.anInt1591 < local110) {
								local361 = true;
							}
							if (local361) {
								Static33.method498(Static122.anInt2791 - local56, local19, Static63.anInt1591 - local61);
							}
							if (Static81.aClass4_Sub14_12 != null && local19 != Static81.aClass4_Sub14_12 && local344 && Static131.method1977(Static38.method575(local19))) {
								Static31.aClass4_Sub14_7 = local19;
							}
							if (local19 == Static69.aClass4_Sub14_10) {
								Static68.anInt1703 = local61;
								Static81.anInt1918 = local56;
								Static115.aBoolean116 = true;
							}
							if (local19.aBoolean100) {
								@Pc(431) Class4_Sub21 local431;
								if (local344 && Static105.anInt2480 != 0 && local19.anObjectArray14 != null) {
									local431 = new Class4_Sub21();
									local431.anObjectArray28 = local19.anObjectArray14;
									local431.anInt2710 = Static105.anInt2480;
									local431.aClass4_Sub14_14 = local19;
									Static25.aClass45_5.method988(local431);
								}
								if (Static81.aClass4_Sub14_12 != null || Static75.aClass4_Sub14_9 != null || Static12.aBoolean107) {
									local361 = false;
									local350 = false;
									local344 = false;
								}
								if (!local19.aBoolean94 && local361) {
									local19.aBoolean94 = true;
									if (local19.anObjectArray22 != null) {
										local431 = new Class4_Sub21();
										local431.anObjectArray28 = local19.anObjectArray22;
										local431.anInt2710 = Static63.anInt1591 - local61;
										local431.anInt2709 = Static122.anInt2791 - local56;
										local431.aClass4_Sub14_14 = local19;
										Static25.aClass45_5.method988(local431);
									}
								}
								if (local19.aBoolean94 && local350 && local19.anObjectArray17 != null) {
									local431 = new Class4_Sub21();
									local431.anObjectArray28 = local19.anObjectArray17;
									local431.anInt2709 = Static36.anInt1006 - local56;
									local431.aClass4_Sub14_14 = local19;
									local431.anInt2710 = Static85.anInt2015 - local61;
									Static25.aClass45_5.method988(local431);
								}
								if (local19.aBoolean94 && !local350) {
									local19.aBoolean94 = false;
									if (local19.anObjectArray8 != null) {
										local431 = new Class4_Sub21();
										local431.aClass4_Sub14_14 = local19;
										local431.anInt2710 = Static85.anInt2015 - local61;
										local431.anObjectArray28 = local19.anObjectArray8;
										local431.anInt2709 = Static36.anInt1006 - local56;
										Static21.aClass45_3.method988(local431);
									}
								}
								if (local350 && local19.anObjectArray10 != null) {
									local431 = new Class4_Sub21();
									local431.aClass4_Sub14_14 = local19;
									local431.anInt2709 = Static36.anInt1006 - local56;
									local431.anInt2710 = Static85.anInt2015 - local61;
									local431.anObjectArray28 = local19.anObjectArray10;
									Static25.aClass45_5.method988(local431);
								}
								if (!local19.aBoolean93 && local344) {
									local19.aBoolean93 = true;
									if (local19.anObjectArray20 != null) {
										local431 = new Class4_Sub21();
										local431.anInt2710 = Static85.anInt2015 - local61;
										local431.aClass4_Sub14_14 = local19;
										local431.anObjectArray28 = local19.anObjectArray20;
										local431.anInt2709 = Static36.anInt1006 - local56;
										Static25.aClass45_5.method988(local431);
									}
								}
								if (local19.aBoolean93 && local344 && local19.anObjectArray2 != null) {
									local431 = new Class4_Sub21();
									local431.anInt2710 = Static85.anInt2015 - local61;
									local431.anInt2709 = Static36.anInt1006 - local56;
									local431.aClass4_Sub14_14 = local19;
									local431.anObjectArray28 = local19.anObjectArray2;
									Static25.aClass45_5.method988(local431);
								}
								if (local19.aBoolean93 && !local344) {
									local19.aBoolean93 = false;
									if (local19.anObjectArray13 != null) {
										local431 = new Class4_Sub21();
										local431.anObjectArray28 = local19.anObjectArray13;
										local431.aClass4_Sub14_14 = local19;
										local431.anInt2710 = Static85.anInt2015 - local61;
										local431.anInt2709 = Static36.anInt1006 - local56;
										Static21.aClass45_3.method988(local431);
									}
								}
								if (local19.anObjectArray11 != null) {
									local431 = new Class4_Sub21();
									local431.anObjectArray28 = local19.anObjectArray11;
									local431.aClass4_Sub14_14 = local19;
									Static47.aClass45_8.method988(local431);
								}
								@Pc(786) int local786;
								@Pc(788) int local788;
								@Pc(800) Class4_Sub21 local800;
								if (local19.anObjectArray12 != null && Static91.anInt2130 > local19.anInt2374) {
									if (local19.anIntArray315 == null || Static91.anInt2130 - local19.anInt2374 > 32) {
										local431 = new Class4_Sub21();
										local431.aClass4_Sub14_14 = local19;
										local431.anObjectArray28 = local19.anObjectArray12;
										Static25.aClass45_5.method988(local431);
									} else {
										label367: for (local146 = local19.anInt2374; local146 < Static91.anInt2130; local146++) {
											local786 = Static56.anIntArray150[local146 & 0x1F];
											for (local788 = 0; local788 < local19.anIntArray315.length; local788++) {
												if (local19.anIntArray315[local788] == local786) {
													local800 = new Class4_Sub21();
													local800.aClass4_Sub14_14 = local19;
													local800.anObjectArray28 = local19.anObjectArray12;
													Static25.aClass45_5.method988(local800);
													break label367;
												}
											}
										}
									}
									local19.anInt2374 = Static91.anInt2130;
								}
								if (local19.anObjectArray23 != null && local19.anInt2411 < Static102.anInt2428) {
									if (local19.anIntArray305 == null || Static102.anInt2428 - local19.anInt2411 > 32) {
										local431 = new Class4_Sub21();
										local431.aClass4_Sub14_14 = local19;
										local431.anObjectArray28 = local19.anObjectArray23;
										Static25.aClass45_5.method988(local431);
									} else {
										label347: for (local146 = local19.anInt2411; local146 < Static102.anInt2428; local146++) {
											local786 = Static110.anIntArray332[local146 & 0x1F];
											for (local788 = 0; local788 < local19.anIntArray305.length; local788++) {
												if (local786 == local19.anIntArray305[local788]) {
													local800 = new Class4_Sub21();
													local800.anObjectArray28 = local19.anObjectArray23;
													local800.aClass4_Sub14_14 = local19;
													Static25.aClass45_5.method988(local800);
													break label347;
												}
											}
										}
									}
									local19.anInt2411 = Static102.anInt2428;
								}
								if (local19.anObjectArray9 != null && local19.anInt2379 < Static7.anInt85) {
									if (local19.anIntArray313 == null || Static7.anInt85 - local19.anInt2379 > 32) {
										local431 = new Class4_Sub21();
										local431.anObjectArray28 = local19.anObjectArray9;
										local431.aClass4_Sub14_14 = local19;
										Static25.aClass45_5.method988(local431);
									} else {
										label327: for (local146 = local19.anInt2379; local146 < Static7.anInt85; local146++) {
											local786 = Static8.anIntArray11[local146 & 0x1F];
											for (local788 = 0; local788 < local19.anIntArray313.length; local788++) {
												if (local786 == local19.anIntArray313[local788]) {
													local800 = new Class4_Sub21();
													local800.anObjectArray28 = local19.anObjectArray9;
													local800.aClass4_Sub14_14 = local19;
													Static25.aClass45_5.method988(local800);
													break label327;
												}
											}
										}
									}
									local19.anInt2379 = Static7.anInt85;
								}
								if (local19.anInt2427 < Static41.anInt1083 && local19.anObjectArray15 != null) {
									local431 = new Class4_Sub21();
									local431.anObjectArray28 = local19.anObjectArray15;
									local431.aClass4_Sub14_14 = local19;
									Static25.aClass45_5.method988(local431);
								}
								if (local19.anInt2427 < Static8.anInt94 && local19.anObjectArray21 != null) {
									local431 = new Class4_Sub21();
									local431.anObjectArray28 = local19.anObjectArray21;
									local431.aClass4_Sub14_14 = local19;
									Static25.aClass45_5.method988(local431);
								}
								if (local19.anInt2427 < Static4.anInt61 && local19.anObjectArray3 != null) {
									local431 = new Class4_Sub21();
									local431.aClass4_Sub14_14 = local19;
									local431.anObjectArray28 = local19.anObjectArray3;
									Static25.aClass45_5.method988(local431);
								}
								if (local19.anInt2427 < Static20.anInt705 && local19.anObjectArray5 != null) {
									local431 = new Class4_Sub21();
									local431.anObjectArray28 = local19.anObjectArray5;
									local431.aClass4_Sub14_14 = local19;
									Static25.aClass45_5.method988(local431);
								}
								local19.anInt2427 = Static87.anInt2052;
								if (local19.anObjectArray7 != null) {
									for (local146 = 0; local146 < Static50.anInt1437; local146++) {
										@Pc(1138) Class4_Sub21 local1138 = new Class4_Sub21();
										local1138.aClass4_Sub14_14 = local19;
										local1138.anInt2707 = Static99.anIntArray75[local146];
										local1138.anInt2714 = Static31.anIntArray94[local146];
										local1138.anObjectArray28 = local19.anObjectArray7;
										Static25.aClass45_5.method988(local1138);
									}
								}
							}
						}
						if (!local19.aBoolean95) {
							if (Static81.aClass4_Sub14_12 != null || Static75.aClass4_Sub14_9 != null || Static12.aBoolean107) {
								return;
							}
							if ((local19.anInt2382 >= 0 || local19.anInt2396 != 0) && local92 <= Static36.anInt1006 && local85 <= Static85.anInt2015 && Static36.anInt1006 < local117 && Static85.anInt2015 < local110) {
								if (local19.anInt2382 < 0) {
									Static18.aClass4_Sub14_4 = local19;
								} else {
									Static18.aClass4_Sub14_4 = arg1[local19.anInt2382];
								}
							}
							if (local19.anInt2389 == 8 && Static36.anInt1006 >= local92 && Static85.anInt2015 >= local85 && Static36.anInt1006 < local117 && Static85.anInt2015 < local110) {
								Static128.aClass4_Sub14_16 = local19;
							}
							if (local19.anInt2440 < local19.anInt2395) {
								Static50.method848(local61, local19.anInt2440, local19.anInt2395, Static85.anInt2015, Static36.anInt1006, local19, local19.anInt2392 + local56);
							}
						}
					}
				}
			}
		}
	}
}
