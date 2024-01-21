import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "Lclient!ai;")
	private static Class6 aClass6_386 = Static38.method685("red:");

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_384 = aClass6_386;

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_387 = Static38.method685("Enter your username (V password)3");

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "Lclient!ai;")
	public static Class6 aClass6_385 = aClass6_387;

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
	public static int anInt1408 = 0;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
	public static int anInt1412 = 0;

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "[Lclient!l;")
	public static Class48[] aClass48Array1 = new Class48[4];

	@OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
	public static final int anInt1415 = 50;

	@OriginalMember(owner = "client!ga", name = "ib", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!ga", name = "jb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_388 = aClass6_386;

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_389 = Static38.method685("sl_flags");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILclient!ai;ZLclient!c;Lclient!ai;)V")
	public static void method912(@OriginalArg(2) Class6 arg0, @OriginalArg(4) Class10 arg1, @OriginalArg(5) Class6 arg2) {
		@Pc(13) int local13 = arg1.method1602(arg2);
		@Pc(19) int local19 = arg1.method1600(local13, arg0);
		Static180.method2811(255, arg1, local13, local19);
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	public static void method913() {
		if (Static174.anIntArray388 != null && Static159.anIntArray376 != null) {
			return;
		}
		Static174.anIntArray388 = new int[256];
		Static159.anIntArray376 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static174.anIntArray388[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static159.anIntArray376[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[Lclient!wa;BIIIII)V")
	public static void method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class87[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(20) int local20 = 0; local20 < arg2.length; local20++) {
			@Pc(26) Class87 local26 = arg2[local20];
			if (local26 != null && (!local26.aBoolean174 || local26.anInt4116 == 0 || local26.aBoolean169 || Static179.method2802(local26) != 0 || Static10.aClass87_3 == local26) && arg5 == local26.anInt4074 && (!local26.aBoolean174 || !Static164.method2623(local26))) {
				@Pc(63) int local63 = local26.anInt4079 + arg6;
				@Pc(68) int local68 = arg4 + local26.anInt4091;
				if (Static88.aClass87_6 == local26) {
					Static105.aBoolean103 = true;
					Static30.anInt763 = local68;
					Static95.anInt2355 = local63;
				}
				@Pc(89) int local89;
				@Pc(83) int local83;
				@Pc(87) int local87;
				@Pc(85) int local85;
				@Pc(106) int local106;
				if (local26.anInt4116 == 2) {
					local83 = arg7;
					local85 = arg1;
					local87 = arg0;
					local89 = arg3;
				} else {
					@Pc(99) int local99;
					@Pc(101) int local101;
					if (local26.anInt4116 == 9) {
						local99 = local63;
						local101 = local68;
						local106 = local68 + local26.anInt4133;
						@Pc(111) int local111 = local26.anInt4092 + local63;
						if (local63 > local111) {
							local99 = local111;
							local111 = local63;
						}
						local111++;
						local87 = local111 < arg0 ? local111 : arg0;
						local89 = arg3 >= local99 ? arg3 : local99;
						if (local68 > local106) {
							local101 = local106;
							local106 = local68;
						}
						local83 = arg7 >= local101 ? arg7 : local101;
						local106++;
						local85 = local106 >= arg1 ? arg1 : local106;
					} else {
						local89 = arg3 < local63 ? local63 : arg3;
						local83 = arg7 >= local68 ? arg7 : local68;
						local99 = local26.anInt4092 + local63;
						local87 = local99 >= arg0 ? arg0 : local99;
						local101 = local68 + local26.anInt4133;
						local85 = local101 >= arg1 ? arg1 : local101;
					}
				}
				if (!local26.aBoolean174 || local87 > local89 && local85 > local83) {
					if (local26.anInt4101 == 1337) {
						Static151.method2327(local26);
					} else if (local26.anInt4101 == 1338) {
						Static128.method1972(local63, local68);
					} else {
						if (local26.anInt4116 == 0) {
							if (!local26.aBoolean174 && Static164.method2623(local26) && local26 != Static67.aClass87_5) {
								continue;
							}
							method914(local87, local85, arg2, local89, local68 - local26.anInt4124, local26.anInt4085, local63 - local26.anInt4083, local83);
							if (local26.aClass87Array2 != null) {
								method914(local87, local85, local26.aClass87Array2, local89, local68 - local26.anInt4124, local26.anInt4085, local63 - local26.anInt4083, local83);
							}
							@Pc(327) Class2_Sub16 local327 = (Class2_Sub16) Static148.aClass16_10.method479((long) local26.anInt4085);
							if (local327 != null) {
								Static177.method2770(local89, local87, local68, local63, local83, local85, local327.anInt2551);
							}
						}
						if (local26.aBoolean174) {
							@Pc(346) boolean local346 = false;
							@Pc(348) boolean local348 = false;
							@Pc(366) boolean local366;
							if (local89 <= Static69.anInt1736 && Static77.anInt1906 >= local83 && Static69.anInt1736 < local87 && local85 > Static77.anInt1906) {
								local366 = true;
							} else {
								local366 = false;
							}
							if (anInt1408 == 1 && local366) {
								local346 = true;
							}
							if (Static19.anInt509 == 1 && local89 <= Static155.anInt3959 && local83 <= Static5.anInt84 && local87 > Static155.anInt3959 && Static5.anInt84 < local85) {
								local348 = true;
							}
							if (local348) {
								Static67.method1070(Static155.anInt3959 - local63, local26, Static5.anInt84 - local68);
							}
							if (Static88.aClass87_6 != null && local26 != Static88.aClass87_6 && local366 && Static79.method1239(Static179.method2802(local26))) {
								Static182.aClass87_14 = local26;
							}
							if (local26 == Static10.aClass87_3) {
								Static42.anInt1279 = local68;
								Static172.anInt4040 = local63;
								Static11.aBoolean9 = true;
							}
							if (local26.aBoolean169) {
								@Pc(464) Class2_Sub2 local464;
								if (local366 && Static152.anInt3511 != 0 && local26.anObjectArray28 != null) {
									local464 = new Class2_Sub2();
									local464.anObjectArray1 = local26.anObjectArray28;
									local464.aClass87_1 = local26;
									local464.anInt83 = Static152.anInt3511;
									Static149.aClass84_12.method2701(local464);
								}
								if (Static88.aClass87_6 != null || Static27.aClass87_4 != null || Static160.aBoolean24) {
									local366 = false;
									local346 = false;
									local348 = false;
								}
								if (!local26.aBoolean165 && local348) {
									local26.aBoolean165 = true;
									if (local26.anObjectArray15 != null) {
										local464 = new Class2_Sub2();
										local464.anInt85 = Static155.anInt3959 - local63;
										local464.anObjectArray1 = local26.anObjectArray15;
										local464.anInt83 = Static5.anInt84 - local68;
										local464.aClass87_1 = local26;
										Static149.aClass84_12.method2701(local464);
									}
								}
								if (local26.aBoolean165 && local346 && local26.anObjectArray18 != null) {
									local464 = new Class2_Sub2();
									local464.anInt83 = Static77.anInt1906 - local68;
									local464.anObjectArray1 = local26.anObjectArray18;
									local464.aClass87_1 = local26;
									local464.anInt85 = Static69.anInt1736 - local63;
									Static149.aClass84_12.method2701(local464);
								}
								if (local26.aBoolean165 && !local346) {
									local26.aBoolean165 = false;
									if (local26.anObjectArray17 != null) {
										local464 = new Class2_Sub2();
										local464.aClass87_1 = local26;
										local464.anInt83 = Static77.anInt1906 - local68;
										local464.anInt85 = Static69.anInt1736 - local63;
										local464.anObjectArray1 = local26.anObjectArray17;
										Static107.aClass84_5.method2701(local464);
									}
								}
								if (local346 && local26.anObjectArray6 != null) {
									local464 = new Class2_Sub2();
									local464.anInt83 = Static77.anInt1906 - local68;
									local464.aClass87_1 = local26;
									local464.anObjectArray1 = local26.anObjectArray6;
									local464.anInt85 = Static69.anInt1736 - local63;
									Static149.aClass84_12.method2701(local464);
								}
								if (!local26.aBoolean168 && local366) {
									local26.aBoolean168 = true;
									if (local26.anObjectArray23 != null) {
										local464 = new Class2_Sub2();
										local464.anInt83 = Static77.anInt1906 - local68;
										local464.aClass87_1 = local26;
										local464.anInt85 = Static69.anInt1736 - local63;
										local464.anObjectArray1 = local26.anObjectArray23;
										Static149.aClass84_12.method2701(local464);
									}
								}
								if (local26.aBoolean168 && local366 && local26.anObjectArray10 != null) {
									local464 = new Class2_Sub2();
									local464.aClass87_1 = local26;
									local464.anInt85 = Static69.anInt1736 - local63;
									local464.anInt83 = Static77.anInt1906 - local68;
									local464.anObjectArray1 = local26.anObjectArray10;
									Static149.aClass84_12.method2701(local464);
								}
								if (local26.aBoolean168 && !local366) {
									local26.aBoolean168 = false;
									if (local26.anObjectArray27 != null) {
										local464 = new Class2_Sub2();
										local464.anInt85 = Static69.anInt1736 - local63;
										local464.aClass87_1 = local26;
										local464.anInt83 = Static77.anInt1906 - local68;
										local464.anObjectArray1 = local26.anObjectArray27;
										Static107.aClass84_5.method2701(local464);
									}
								}
								if (local26.anObjectArray21 != null) {
									local464 = new Class2_Sub2();
									local464.anObjectArray1 = local26.anObjectArray21;
									local464.aClass87_1 = local26;
									Static5.aClass84_1.method2701(local464);
								}
								@Pc(784) int local784;
								@Pc(786) int local786;
								@Pc(802) Class2_Sub2 local802;
								if (local26.anObjectArray19 != null && local26.anInt4134 < Static4.anInt70) {
									if (local26.anIntArray395 == null || Static4.anInt70 - local26.anInt4134 > 32) {
										local464 = new Class2_Sub2();
										local464.anObjectArray1 = local26.anObjectArray19;
										local464.aClass87_1 = local26;
										Static149.aClass84_12.method2701(local464);
									} else {
										label375: for (local106 = local26.anInt4134; local106 < Static4.anInt70; local106++) {
											local784 = Static115.anIntArray236[local106 & 0x1F];
											for (local786 = 0; local786 < local26.anIntArray395.length; local786++) {
												if (local26.anIntArray395[local786] == local784) {
													local802 = new Class2_Sub2();
													local802.anObjectArray1 = local26.anObjectArray19;
													local802.aClass87_1 = local26;
													Static149.aClass84_12.method2701(local802);
													break label375;
												}
											}
										}
									}
									local26.anInt4134 = Static4.anInt70;
								}
								if (local26.anObjectArray8 != null && local26.anInt4095 < Static17.anInt2431) {
									if (local26.anIntArray397 == null || Static17.anInt2431 - local26.anInt4095 > 32) {
										local464 = new Class2_Sub2();
										local464.anObjectArray1 = local26.anObjectArray8;
										local464.aClass87_1 = local26;
										Static149.aClass84_12.method2701(local464);
									} else {
										label355: for (local106 = local26.anInt4095; local106 < Static17.anInt2431; local106++) {
											local784 = Static15.anIntArray18[local106 & 0x1F];
											for (local786 = 0; local786 < local26.anIntArray397.length; local786++) {
												if (local26.anIntArray397[local786] == local784) {
													local802 = new Class2_Sub2();
													local802.aClass87_1 = local26;
													local802.anObjectArray1 = local26.anObjectArray8;
													Static149.aClass84_12.method2701(local802);
													break label355;
												}
											}
										}
									}
									local26.anInt4095 = Static17.anInt2431;
								}
								if (local26.anObjectArray14 != null && Static3.anInt69 > local26.anInt4058) {
									if (local26.anIntArray394 == null || Static3.anInt69 - local26.anInt4058 > 32) {
										local464 = new Class2_Sub2();
										local464.anObjectArray1 = local26.anObjectArray14;
										local464.aClass87_1 = local26;
										Static149.aClass84_12.method2701(local464);
									} else {
										label335: for (local106 = local26.anInt4058; local106 < Static3.anInt69; local106++) {
											local784 = Static103.anIntArray212[local106 & 0x1F];
											for (local786 = 0; local786 < local26.anIntArray394.length; local786++) {
												if (local26.anIntArray394[local786] == local784) {
													local802 = new Class2_Sub2();
													local802.anObjectArray1 = local26.anObjectArray14;
													local802.aClass87_1 = local26;
													Static149.aClass84_12.method2701(local802);
													break label335;
												}
											}
										}
									}
									local26.anInt4058 = Static3.anInt69;
								}
								if (Static112.anInt2718 > local26.anInt4114 && local26.anObjectArray12 != null) {
									local464 = new Class2_Sub2();
									local464.anObjectArray1 = local26.anObjectArray12;
									local464.aClass87_1 = local26;
									Static149.aClass84_12.method2701(local464);
								}
								if (Static86.anInt2209 > local26.anInt4114 && local26.anObjectArray13 != null) {
									local464 = new Class2_Sub2();
									local464.aClass87_1 = local26;
									local464.anObjectArray1 = local26.anObjectArray13;
									Static149.aClass84_12.method2701(local464);
								}
								if (Static7.anInt125 > local26.anInt4114 && local26.anObjectArray16 != null) {
									local464 = new Class2_Sub2();
									local464.aClass87_1 = local26;
									local464.anObjectArray1 = local26.anObjectArray16;
									Static149.aClass84_12.method2701(local464);
								}
								if (Static117.anInt2798 > local26.anInt4114 && local26.anObjectArray26 != null) {
									local464 = new Class2_Sub2();
									local464.aClass87_1 = local26;
									local464.anObjectArray1 = local26.anObjectArray26;
									Static149.aClass84_12.method2701(local464);
								}
								if (Static116.anInt2780 > local26.anInt4114 && local26.anObjectArray5 != null) {
									local464 = new Class2_Sub2();
									local464.anObjectArray1 = local26.anObjectArray5;
									local464.aClass87_1 = local26;
									Static149.aClass84_12.method2701(local464);
								}
								local26.anInt4114 = Static7.anInt124;
								if (local26.anObjectArray20 != null) {
									for (local106 = 0; local106 < Static13.anInt333; local106++) {
										@Pc(1173) Class2_Sub2 local1173 = new Class2_Sub2();
										local1173.aClass87_1 = local26;
										local1173.anInt86 = Static157.anIntArray359[local106];
										local1173.anInt81 = Static179.anIntArray404[local106];
										local1173.anObjectArray1 = local26.anObjectArray20;
										Static149.aClass84_12.method2701(local1173);
									}
								}
							}
						}
						if (!local26.aBoolean174) {
							if (Static88.aClass87_6 != null || Static27.aClass87_4 != null || Static160.aBoolean24) {
								return;
							}
							if ((local26.anInt4088 >= 0 || local26.anInt4062 != 0) && Static69.anInt1736 >= local89 && Static77.anInt1906 >= local83 && local87 > Static69.anInt1736 && local85 > Static77.anInt1906) {
								if (local26.anInt4088 < 0) {
									Static67.aClass87_5 = local26;
								} else {
									Static67.aClass87_5 = arg2[local26.anInt4088];
								}
							}
							if (local26.anInt4116 == 8 && Static69.anInt1736 >= local89 && Static77.anInt1906 >= local83 && local87 > Static69.anInt1736 && Static77.anInt1906 < local85) {
								Static90.aClass87_12 = local26;
							}
							if (local26.anInt4133 < local26.anInt4106) {
								Static104.method1719(local26, local68, Static69.anInt1736, local26.anInt4106, local26.anInt4133, local26.anInt4092 + local63, Static77.anInt1906);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	public static void method915() {
		aClass6_386 = null;
		aClass6_389 = null;
		aClass6_388 = null;
		aClass48Array1 = null;
		anIntArrayArray24 = null;
		aClass6_387 = null;
		aClass6_385 = null;
		aClass6_384 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method916(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static74.aClass46_1);
		arg0.removeMouseMotionListener(Static74.aClass46_1);
		arg0.removeFocusListener(Static74.aClass46_1);
		Static39.anInt1125 = 0;
	}
}
