import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!id;")
	private static Class34 aClass34_439 = Static9.method266("Loaded update list");

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_436 = aClass34_439;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public static int anInt890 = 0;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_437 = Static9.method266("compass");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII[Lclient!fd;IIII)V")
	public static void method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub9[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) Class1_Sub9 local13 = arg3[local7];
			if (local13 != null && (!local13.aBoolean57 || local13.anInt1013 == 0 || local13.aBoolean56 || Static84.method1448(local13) != 0 || local13 == Static69.aClass1_Sub9_10) && arg4 == local13.anInt1062 && (!local13.aBoolean57 || !Static41.method698(local13))) {
				@Pc(54) int local54 = arg1 + local13.anInt1066;
				@Pc(59) int local59 = arg2 + local13.anInt1085;
				if (local13 == Static129.aClass1_Sub9_15) {
					Static126.anInt2995 = local59;
					Static67.anInt1773 = local54;
					Static114.aBoolean155 = true;
				}
				@Pc(82) int local82;
				@Pc(76) int local76;
				@Pc(80) int local80;
				@Pc(78) int local78;
				@Pc(97) int local97;
				if (local13.anInt1013 == 2) {
					local76 = arg5;
					local78 = arg7;
					local80 = arg0;
					local82 = arg6;
				} else {
					@Pc(90) int local90;
					@Pc(92) int local92;
					if (local13.anInt1013 == 9) {
						local90 = local54;
						local92 = local59;
						local97 = local13.anInt1053 + local59;
						@Pc(102) int local102 = local54 + local13.anInt1067;
						if (local54 > local102) {
							local90 = local102;
							local102 = local54;
						}
						if (local97 < local59) {
							local92 = local97;
							local97 = local59;
						}
						local76 = arg5 >= local92 ? arg5 : local92;
						local82 = arg6 < local90 ? local90 : arg6;
						local97++;
						local102++;
						local80 = arg0 > local102 ? local102 : arg0;
						local78 = arg7 <= local97 ? arg7 : local97;
					} else {
						local76 = arg5 >= local59 ? arg5 : local59;
						local82 = arg6 < local54 ? local54 : arg6;
						local90 = local54 + local13.anInt1067;
						local80 = arg0 <= local90 ? arg0 : local90;
						local92 = local59 + local13.anInt1053;
						local78 = local92 >= arg7 ? arg7 : local92;
					}
				}
				if (!local13.aBoolean57 || local82 < local80 && local76 < local78) {
					if (local13.anInt1030 == 1337) {
						Static10.method277(local13);
					} else if (local13.anInt1030 == 1338) {
						Static34.method630(local54, local59);
					} else {
						if (local13.anInt1013 == 0) {
							if (!local13.aBoolean57 && Static41.method698(local13) && local13 != Static61.aClass1_Sub9_9) {
								continue;
							}
							method544(local80, local54 - local13.anInt1046, local59 + -local13.anInt1064, arg3, local13.anInt1050, local76, local82, local78);
							if (local13.aClass1_Sub9Array2 != null) {
								method544(local80, local54 - local13.anInt1046, local59 - local13.anInt1064, local13.aClass1_Sub9Array2, local13.anInt1050, local76, local82, local78);
							}
							@Pc(302) Class1_Sub16 local302 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local13.anInt1050);
							if (local302 != null) {
								Static94.method1609(local80, local76, local78, local59, local82, local302.anInt1893, local54);
							}
						}
						if (local13.aBoolean57) {
							@Pc(335) boolean local335;
							if (Static39.anInt1143 >= local82 && Static19.anInt658 >= local76 && local80 > Static39.anInt1143 && local78 > Static19.anInt658) {
								local335 = true;
							} else {
								local335 = false;
							}
							@Pc(341) boolean local341 = false;
							if (Static26.anInt842 == 1 && local335) {
								local341 = true;
							}
							@Pc(352) boolean local352 = false;
							if (Static55.anInt1547 == 1 && Static119.anInt2832 >= local82 && Static118.anInt2830 >= local76 && Static119.anInt2832 < local80 && local78 > Static118.anInt2830) {
								local352 = true;
							}
							if (local352) {
								Static29.method554(local13, Static119.anInt2832 - local54, Static118.anInt2830 + -local59);
							}
							if (Static129.aClass1_Sub9_15 != null && Static129.aClass1_Sub9_15 != local13 && local335 && Static121.method1920(Static84.method1448(local13))) {
								Static8.aClass1_Sub9_1 = local13;
							}
							if (local13 == Static69.aClass1_Sub9_10) {
								Static76.anInt2064 = local59;
								Static112.aBoolean152 = true;
								Static7.anInt425 = local54;
							}
							if (local13.aBoolean56) {
								@Pc(427) Class1_Sub5 local427;
								if (local335 && Static126.anInt2997 != 0 && local13.anObjectArray23 != null) {
									local427 = new Class1_Sub5();
									local427.aClass1_Sub9_3 = local13;
									local427.anInt570 = Static126.anInt2997;
									local427.anObjectArray1 = local13.anObjectArray23;
									Static118.aClass38_24.method1046(local427);
								}
								if (Static129.aClass1_Sub9_15 != null || Static23.aClass1_Sub9_6 != null || Static115.aBoolean158) {
									local352 = false;
									local335 = false;
									local341 = false;
								}
								if (!local13.aBoolean53 && local352) {
									local13.aBoolean53 = true;
									if (local13.anObjectArray26 != null) {
										local427 = new Class1_Sub5();
										local427.anInt570 = Static118.anInt2830 - local59;
										local427.anInt571 = Static119.anInt2832 - local54;
										local427.anObjectArray1 = local13.anObjectArray26;
										local427.aClass1_Sub9_3 = local13;
										Static118.aClass38_24.method1046(local427);
									}
								}
								if (local13.aBoolean53 && local341 && local13.anObjectArray17 != null) {
									local427 = new Class1_Sub5();
									local427.aClass1_Sub9_3 = local13;
									local427.anInt571 = Static39.anInt1143 - local54;
									local427.anObjectArray1 = local13.anObjectArray17;
									local427.anInt570 = Static19.anInt658 - local59;
									Static118.aClass38_24.method1046(local427);
								}
								if (local13.aBoolean53 && !local341) {
									local13.aBoolean53 = false;
									if (local13.anObjectArray22 != null) {
										local427 = new Class1_Sub5();
										local427.anInt570 = Static19.anInt658 - local59;
										local427.anInt571 = Static39.anInt1143 - local54;
										local427.aClass1_Sub9_3 = local13;
										local427.anObjectArray1 = local13.anObjectArray22;
										Static73.aClass38_15.method1046(local427);
									}
								}
								if (local341 && local13.anObjectArray15 != null) {
									local427 = new Class1_Sub5();
									local427.anInt571 = Static39.anInt1143 - local54;
									local427.anObjectArray1 = local13.anObjectArray15;
									local427.anInt570 = Static19.anInt658 - local59;
									local427.aClass1_Sub9_3 = local13;
									Static118.aClass38_24.method1046(local427);
								}
								if (!local13.aBoolean52 && local335) {
									local13.aBoolean52 = true;
									if (local13.anObjectArray4 != null) {
										local427 = new Class1_Sub5();
										local427.anInt571 = Static39.anInt1143 - local54;
										local427.aClass1_Sub9_3 = local13;
										local427.anObjectArray1 = local13.anObjectArray4;
										local427.anInt570 = Static19.anInt658 - local59;
										Static118.aClass38_24.method1046(local427);
									}
								}
								if (local13.aBoolean52 && local335 && local13.anObjectArray14 != null) {
									local427 = new Class1_Sub5();
									local427.anObjectArray1 = local13.anObjectArray14;
									local427.aClass1_Sub9_3 = local13;
									local427.anInt570 = Static19.anInt658 - local59;
									local427.anInt571 = Static39.anInt1143 - local54;
									Static118.aClass38_24.method1046(local427);
								}
								if (local13.aBoolean52 && !local335) {
									local13.aBoolean52 = false;
									if (local13.anObjectArray7 != null) {
										local427 = new Class1_Sub5();
										local427.anInt570 = Static19.anInt658 - local59;
										local427.anInt571 = Static39.anInt1143 - local54;
										local427.anObjectArray1 = local13.anObjectArray7;
										local427.aClass1_Sub9_3 = local13;
										Static73.aClass38_15.method1046(local427);
									}
								}
								if (local13.anObjectArray3 != null) {
									local427 = new Class1_Sub5();
									local427.aClass1_Sub9_3 = local13;
									local427.anObjectArray1 = local13.anObjectArray3;
									Static45.aClass38_22.method1046(local427);
								}
								@Pc(773) int local773;
								@Pc(775) int local775;
								@Pc(791) Class1_Sub5 local791;
								if (local13.anObjectArray5 != null && Static5.anInt363 > local13.anInt1081) {
									if (local13.anIntArray103 == null || Static5.anInt363 - local13.anInt1081 > 32) {
										local427 = new Class1_Sub5();
										local427.anObjectArray1 = local13.anObjectArray5;
										local427.aClass1_Sub9_3 = local13;
										Static118.aClass38_24.method1046(local427);
									} else {
										label369: for (local97 = local13.anInt1081; local97 < Static5.anInt363; local97++) {
											local773 = Static15.anIntArray57[local97 & 0x1F];
											for (local775 = 0; local775 < local13.anIntArray103.length; local775++) {
												if (local13.anIntArray103[local775] == local773) {
													local791 = new Class1_Sub5();
													local791.anObjectArray1 = local13.anObjectArray5;
													local791.aClass1_Sub9_3 = local13;
													Static118.aClass38_24.method1046(local791);
													break label369;
												}
											}
										}
									}
									local13.anInt1081 = Static5.anInt363;
								}
								if (local13.anObjectArray11 != null && Static129.anInt3038 > local13.anInt1015) {
									if (local13.anIntArray106 == null || Static129.anInt3038 - local13.anInt1015 > 32) {
										local427 = new Class1_Sub5();
										local427.aClass1_Sub9_3 = local13;
										local427.anObjectArray1 = local13.anObjectArray11;
										Static118.aClass38_24.method1046(local427);
									} else {
										label349: for (local97 = local13.anInt1015; local97 < Static129.anInt3038; local97++) {
											local773 = Static132.anIntArray380[local97 & 0x1F];
											for (local775 = 0; local775 < local13.anIntArray106.length; local775++) {
												if (local13.anIntArray106[local775] == local773) {
													local791 = new Class1_Sub5();
													local791.aClass1_Sub9_3 = local13;
													local791.anObjectArray1 = local13.anObjectArray11;
													Static118.aClass38_24.method1046(local791);
													break label349;
												}
											}
										}
									}
									local13.anInt1015 = Static129.anInt3038;
								}
								if (local13.anObjectArray9 != null && Static93.anInt2430 > local13.anInt1036) {
									if (local13.anIntArray109 == null || Static93.anInt2430 - local13.anInt1036 > 32) {
										local427 = new Class1_Sub5();
										local427.anObjectArray1 = local13.anObjectArray9;
										local427.aClass1_Sub9_3 = local13;
										Static118.aClass38_24.method1046(local427);
									} else {
										label329: for (local97 = local13.anInt1036; local97 < Static93.anInt2430; local97++) {
											local773 = Static21.anIntArray76[local97 & 0x1F];
											for (local775 = 0; local775 < local13.anIntArray109.length; local775++) {
												if (local13.anIntArray109[local775] == local773) {
													local791 = new Class1_Sub5();
													local791.aClass1_Sub9_3 = local13;
													local791.anObjectArray1 = local13.anObjectArray9;
													Static118.aClass38_24.method1046(local791);
													break label329;
												}
											}
										}
									}
									local13.anInt1036 = Static93.anInt2430;
								}
								if (local13.anInt1026 < Static99.anInt2511 && local13.anObjectArray13 != null) {
									local427 = new Class1_Sub5();
									local427.anObjectArray1 = local13.anObjectArray13;
									local427.aClass1_Sub9_3 = local13;
									Static118.aClass38_24.method1046(local427);
								}
								if (Static38.anInt1125 > local13.anInt1026 && local13.anObjectArray2 != null) {
									local427 = new Class1_Sub5();
									local427.anObjectArray1 = local13.anObjectArray2;
									local427.aClass1_Sub9_3 = local13;
									Static118.aClass38_24.method1046(local427);
								}
								if (local13.anInt1026 < Static117.anInt696 && local13.anObjectArray12 != null) {
									local427 = new Class1_Sub5();
									local427.anObjectArray1 = local13.anObjectArray12;
									local427.aClass1_Sub9_3 = local13;
									Static118.aClass38_24.method1046(local427);
								}
								if (local13.anInt1026 < Static70.anInt1849 && local13.anObjectArray20 != null) {
									local427 = new Class1_Sub5();
									local427.anObjectArray1 = local13.anObjectArray20;
									local427.aClass1_Sub9_3 = local13;
									Static118.aClass38_24.method1046(local427);
								}
								local13.anInt1026 = Static70.anInt1848;
								if (local13.anObjectArray6 != null) {
									for (local97 = 0; local97 < Static69.anInt1823; local97++) {
										@Pc(1127) Class1_Sub5 local1127 = new Class1_Sub5();
										local1127.aClass1_Sub9_3 = local13;
										local1127.anInt575 = Static121.anIntArray355[local97];
										local1127.anInt568 = Static59.anIntArray175[local97];
										local1127.anObjectArray1 = local13.anObjectArray6;
										Static118.aClass38_24.method1046(local1127);
									}
								}
							}
						}
						if (!local13.aBoolean57) {
							if (Static129.aClass1_Sub9_15 != null || Static23.aClass1_Sub9_6 != null || Static115.aBoolean158) {
								return;
							}
							if ((local13.anInt1057 >= 0 || local13.anInt1033 != 0) && Static39.anInt1143 >= local82 && local76 <= Static19.anInt658 && local80 > Static39.anInt1143 && Static19.anInt658 < local78) {
								if (local13.anInt1057 >= 0) {
									Static61.aClass1_Sub9_9 = arg3[local13.anInt1057];
								} else {
									Static61.aClass1_Sub9_9 = local13;
								}
							}
							if (local13.anInt1013 == 8 && Static39.anInt1143 >= local82 && local76 <= Static19.anInt658 && Static39.anInt1143 < local80 && local78 > Static19.anInt658) {
								Static77.aClass1_Sub9_12 = local13;
							}
							if (local13.anInt1084 > local13.anInt1053) {
								Static117.method422(Static39.anInt1143, local13, local13.anInt1053, local13.anInt1067 + local54, local59, local13.anInt1084, Static19.anInt658);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lclient!id;")
	public static Class34 method545(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static91.method1554(new Class34[] { Static3.aClass34_115, Static85.method1456(arg0), Static110.aClass34_1268 });
		} else if (arg0 < 10000000) {
			return Static91.method1554(new Class34[] { Static122.aClass34_1485, Static85.method1456(arg0 / 1000), Static66.aClass34_815, Static110.aClass34_1268 });
		} else {
			return Static91.method1554(new Class34[] { Static98.aClass34_1244, Static85.method1456(arg0 / 1000000), Static41.aClass34_556, Static110.aClass34_1268 });
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([BB)[B")
	public static byte[] method546(@OriginalArg(0) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static140.method1970(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLclient!ie;Lclient!ie;BLclient!h;)V")
	public static void method547(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(4) Class1_Sub1_Sub2_Sub3_Sub1 arg3) {
		Static7.aBoolean23 = arg0;
		Static97.aClass35_24 = arg2;
		Static20.aClass35_5 = arg1;
		Static97.aClass35_24.method1579(10);
		Static120.aClass1_Sub1_Sub2_Sub3_Sub1_6 = arg3;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!id;ZLclient!id;Lclient!ie;)[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] method548(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class35 arg2) {
		@Pc(17) int local17 = arg2.method1582(arg0);
		@Pc(23) int local23 = arg2.method1564(arg1, local17);
		return Static123.method1941(arg2, local23, local17);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method549() {
		aClass34_437 = null;
		aClass1_Sub1_Sub2_Sub1_2 = null;
		aClass34_436 = null;
		aClass34_439 = null;
	}
}
