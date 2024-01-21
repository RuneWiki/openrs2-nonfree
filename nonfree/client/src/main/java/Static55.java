import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "Lclient!gg;")
	private static Class28 aClass28_830 = Static107.method1838("Loading fonts )2 ");

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "Lclient!gg;")
	public static Class28 aClass28_829 = aClass28_830;

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "Lclient!gg;")
	private static Class28 aClass28_832 = Static107.method1838("Your account has been disabled)3");

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "Lclient!gg;")
	public static Class28 aClass28_831 = aClass28_832;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "[Lclient!ae;")
	public static Class2_Sub4_Sub1_Sub1_Sub1[] aClass2_Sub4_Sub1_Sub1_Sub1Array1 = new Class2_Sub4_Sub1_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III[Lclient!ff;IIIIB)V")
	public static void method999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) Class24 local18 = arg3[local12];
			if (local18 != null && (!local18.aBoolean63 || local18.anInt1425 == 0 || local18.aBoolean66 || Static10.method323(local18) != 0 || local18 == Static157.aClass24_11 || local18.anInt1388 == 1338) && local18.anInt1382 == arg0 && (!local18.aBoolean63 || !Static165.method2570(local18))) {
				@Pc(59) int local59 = arg1 + local18.anInt1373;
				@Pc(65) int local65 = local18.anInt1358 + arg6;
				if (Static177.aClass24_13 == local18) {
					Static146.aBoolean147 = true;
					Static87.anInt2206 = local65;
					Static120.anInt2871 = local59;
				}
				@Pc(120) int local120;
				@Pc(151) int local151;
				@Pc(140) int local140;
				@Pc(159) int local159;
				@Pc(99) int local99;
				if (local18.anInt1425 == 2) {
					local151 = arg2;
					local120 = arg5;
					local159 = arg4;
					local140 = arg7;
				} else {
					@Pc(86) int local86;
					@Pc(88) int local88;
					if (local18.anInt1425 == 9) {
						local86 = local59;
						local88 = local65;
						@Pc(94) int local94 = local59 + local18.anInt1357;
						local99 = local18.anInt1427 + local65;
						if (local94 < local59) {
							local86 = local94;
							local94 = local59;
						}
						local94++;
						local120 = arg5 < local86 ? local86 : arg5;
						if (local99 < local65) {
							local88 = local99;
							local99 = local65;
						}
						local140 = arg7 > local94 ? local94 : arg7;
						local151 = local88 > arg2 ? local88 : arg2;
						local99++;
						local159 = local99 < arg4 ? local99 : arg4;
					} else {
						local120 = local59 > arg5 ? local59 : arg5;
						local151 = arg2 >= local65 ? arg2 : local65;
						local86 = local59 + local18.anInt1357;
						local88 = local65 + local18.anInt1427;
						local159 = local88 < arg4 ? local88 : arg4;
						local140 = local86 >= arg7 ? arg7 : local86;
					}
				}
				if (!local18.aBoolean63 || local140 > local120 && local159 > local151) {
					if (local18.anInt1388 == 1337) {
						Static104.method1828(local18);
					} else {
						if (local18.anInt1425 == 0) {
							if (!local18.aBoolean63 && Static165.method2570(local18) && Static11.aClass24_1 != local18) {
								continue;
							}
							method999(local18.anInt1367, local59 - local18.anInt1398, local151, arg3, local159, local120, local65 - local18.anInt1406, local140);
							if (local18.aClass24Array1 != null) {
								method999(local18.anInt1367, local59 - local18.anInt1398, local151, local18.aClass24Array1, local159, local120, local65 - local18.anInt1406, local140);
							}
							@Pc(303) Class2_Sub22 local303 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local18.anInt1367);
							if (local303 != null) {
								Static176.method2746(local151, local59, local120, local140, local303.anInt2866, local159, local65);
							}
						}
						if (local18.aBoolean63) {
							@Pc(340) boolean local340;
							if (Static93.anInt2353 >= local120 && local151 <= Static169.anInt3798 && Static93.anInt2353 < local140 && Static169.anInt3798 < local159) {
								local340 = true;
							} else {
								local340 = false;
							}
							@Pc(346) boolean local346 = false;
							@Pc(348) boolean local348 = false;
							if (Static152.anInt3425 == 1 && local340) {
								local348 = true;
							}
							if (Static142.anInt3248 == 1 && local120 <= Static101.anInt449 && local151 <= Static130.anInt3042 && Static101.anInt449 < local140 && local159 > Static130.anInt3042) {
								local346 = true;
							}
							if (local18.anInt1388 == 1338) {
								if (local346) {
									Static93.method1631(Static101.anInt449 - local59, Static130.anInt3042 + -local65, local18);
								}
								continue;
							}
							if (local346) {
								Static170.method2897(Static101.anInt449 - local59, -local65 + Static130.anInt3042, local18);
							}
							if (Static177.aClass24_13 != null && Static177.aClass24_13 != local18 && local340 && Static136.method2140(Static10.method323(local18))) {
								Static98.aClass24_5 = local18;
							}
							if (Static157.aClass24_11 == local18) {
								Static95.anInt2365 = local59;
								Static129.aBoolean136 = true;
								Static28.anInt855 = local65;
							}
							if (local18.aBoolean66) {
								@Pc(458) Class2_Sub21 local458;
								if (local340 && Static148.anInt3354 != 0 && local18.anObjectArray19 != null) {
									local458 = new Class2_Sub21();
									local458.aClass24_9 = local18;
									local458.anInt2856 = Static148.anInt3354;
									local458.anObjectArray29 = local18.anObjectArray19;
									Static141.aClass65_13.method2116(local458);
								}
								if (Static177.aClass24_13 != null || Static83.aClass24_4 != null || Static169.aBoolean165) {
									local348 = false;
									local340 = false;
									local346 = false;
								}
								if (!local18.aBoolean69 && local346) {
									local18.aBoolean69 = true;
									if (local18.anObjectArray17 != null) {
										local458 = new Class2_Sub21();
										local458.anInt2854 = Static101.anInt449 - local59;
										local458.aClass24_9 = local18;
										local458.anObjectArray29 = local18.anObjectArray17;
										local458.anInt2856 = Static130.anInt3042 - local65;
										Static141.aClass65_13.method2116(local458);
									}
								}
								if (local18.aBoolean69 && local348 && local18.anObjectArray14 != null) {
									local458 = new Class2_Sub21();
									local458.anInt2854 = Static93.anInt2353 - local59;
									local458.aClass24_9 = local18;
									local458.anObjectArray29 = local18.anObjectArray14;
									local458.anInt2856 = Static169.anInt3798 - local65;
									Static141.aClass65_13.method2116(local458);
								}
								if (local18.aBoolean69 && !local348) {
									local18.aBoolean69 = false;
									if (local18.anObjectArray2 != null) {
										local458 = new Class2_Sub21();
										local458.aClass24_9 = local18;
										local458.anInt2854 = Static93.anInt2353 - local59;
										local458.anInt2856 = Static169.anInt3798 - local65;
										local458.anObjectArray29 = local18.anObjectArray2;
										Static147.aClass65_15.method2116(local458);
									}
								}
								if (local348 && local18.anObjectArray10 != null) {
									local458 = new Class2_Sub21();
									local458.anObjectArray29 = local18.anObjectArray10;
									local458.aClass24_9 = local18;
									local458.anInt2856 = Static169.anInt3798 - local65;
									local458.anInt2854 = Static93.anInt2353 - local59;
									Static141.aClass65_13.method2116(local458);
								}
								if (!local18.aBoolean71 && local340) {
									local18.aBoolean71 = true;
									if (local18.anObjectArray21 != null) {
										local458 = new Class2_Sub21();
										local458.anInt2854 = Static93.anInt2353 - local59;
										local458.anInt2856 = Static169.anInt3798 - local65;
										local458.anObjectArray29 = local18.anObjectArray21;
										local458.aClass24_9 = local18;
										Static141.aClass65_13.method2116(local458);
									}
								}
								if (local18.aBoolean71 && local340 && local18.anObjectArray18 != null) {
									local458 = new Class2_Sub21();
									local458.anObjectArray29 = local18.anObjectArray18;
									local458.anInt2856 = Static169.anInt3798 - local65;
									local458.aClass24_9 = local18;
									local458.anInt2854 = Static93.anInt2353 - local59;
									Static141.aClass65_13.method2116(local458);
								}
								if (local18.aBoolean71 && !local340) {
									local18.aBoolean71 = false;
									if (local18.anObjectArray16 != null) {
										local458 = new Class2_Sub21();
										local458.anInt2856 = Static169.anInt3798 - local65;
										local458.anObjectArray29 = local18.anObjectArray16;
										local458.anInt2854 = Static93.anInt2353 - local59;
										local458.aClass24_9 = local18;
										Static147.aClass65_15.method2116(local458);
									}
								}
								if (local18.anObjectArray3 != null) {
									local458 = new Class2_Sub21();
									local458.anObjectArray29 = local18.anObjectArray3;
									local458.aClass24_9 = local18;
									Static147.aClass65_14.method2116(local458);
								}
								@Pc(786) int local786;
								@Pc(788) int local788;
								@Pc(800) Class2_Sub21 local800;
								if (local18.anObjectArray26 != null && local18.anInt1378 < Static10.anInt494) {
									if (local18.anIntArray122 == null || Static10.anInt494 - local18.anInt1378 > 32) {
										local458 = new Class2_Sub21();
										local458.aClass24_9 = local18;
										local458.anObjectArray29 = local18.anObjectArray26;
										Static141.aClass65_13.method2116(local458);
									} else {
										label385: for (local99 = local18.anInt1378; local99 < Static10.anInt494; local99++) {
											local786 = Static50.anIntArray108[local99 & 0x1F];
											for (local788 = 0; local788 < local18.anIntArray122.length; local788++) {
												if (local18.anIntArray122[local788] == local786) {
													local800 = new Class2_Sub21();
													local800.aClass24_9 = local18;
													local800.anObjectArray29 = local18.anObjectArray26;
													Static141.aClass65_13.method2116(local800);
													break label385;
												}
											}
										}
									}
									local18.anInt1378 = Static10.anInt494;
								}
								if (local18.anObjectArray23 != null && local18.anInt1386 < Static158.anInt3505) {
									if (local18.anIntArray126 == null || Static158.anInt3505 - local18.anInt1386 > 32) {
										local458 = new Class2_Sub21();
										local458.aClass24_9 = local18;
										local458.anObjectArray29 = local18.anObjectArray23;
										Static141.aClass65_13.method2116(local458);
									} else {
										label361: for (local99 = local18.anInt1386; local99 < Static158.anInt3505; local99++) {
											local786 = Static125.anIntArray270[local99 & 0x1F];
											for (local788 = 0; local788 < local18.anIntArray126.length; local788++) {
												if (local786 == local18.anIntArray126[local788]) {
													local800 = new Class2_Sub21();
													local800.anObjectArray29 = local18.anObjectArray23;
													local800.aClass24_9 = local18;
													Static141.aClass65_13.method2116(local800);
													break label361;
												}
											}
										}
									}
									local18.anInt1386 = Static158.anInt3505;
								}
								if (local18.anObjectArray22 != null && local18.anInt1410 < Static181.anInt4073) {
									if (local18.anIntArray129 == null || Static181.anInt4073 - local18.anInt1410 > 32) {
										local458 = new Class2_Sub21();
										local458.aClass24_9 = local18;
										local458.anObjectArray29 = local18.anObjectArray22;
										Static141.aClass65_13.method2116(local458);
									} else {
										label337: for (local99 = local18.anInt1410; local99 < Static181.anInt4073; local99++) {
											local786 = Static180.anIntArray369[local99 & 0x1F];
											for (local788 = 0; local788 < local18.anIntArray129.length; local788++) {
												if (local18.anIntArray129[local788] == local786) {
													local800 = new Class2_Sub21();
													local800.aClass24_9 = local18;
													local800.anObjectArray29 = local18.anObjectArray22;
													Static141.aClass65_13.method2116(local800);
													break label337;
												}
											}
										}
									}
									local18.anInt1410 = Static181.anInt4073;
								}
								if (local18.anInt1399 < Static110.anInt2668 && local18.anObjectArray6 != null) {
									local458 = new Class2_Sub21();
									local458.aClass24_9 = local18;
									local458.anObjectArray29 = local18.anObjectArray6;
									Static141.aClass65_13.method2116(local458);
								}
								if (local18.anInt1399 < Static30.anInt928 && local18.anObjectArray15 != null) {
									local458 = new Class2_Sub21();
									local458.aClass24_9 = local18;
									local458.anObjectArray29 = local18.anObjectArray15;
									Static141.aClass65_13.method2116(local458);
								}
								if (Static16.anInt647 > local18.anInt1399 && local18.anObjectArray8 != null) {
									local458 = new Class2_Sub21();
									local458.aClass24_9 = local18;
									local458.anObjectArray29 = local18.anObjectArray8;
									Static141.aClass65_13.method2116(local458);
								}
								if (Static109.anInt2644 > local18.anInt1399 && local18.anObjectArray7 != null) {
									local458 = new Class2_Sub21();
									local458.aClass24_9 = local18;
									local458.anObjectArray29 = local18.anObjectArray7;
									Static141.aClass65_13.method2116(local458);
								}
								if (local18.anInt1399 < Static48.anInt1254 && local18.anObjectArray9 != null) {
									local458 = new Class2_Sub21();
									local458.aClass24_9 = local18;
									local458.anObjectArray29 = local18.anObjectArray9;
									Static141.aClass65_13.method2116(local458);
								}
								local18.anInt1399 = Static70.anInt1853;
								if (local18.anObjectArray20 != null) {
									for (local99 = 0; local99 < Static127.anInt3011; local99++) {
										@Pc(1172) Class2_Sub21 local1172 = new Class2_Sub21();
										local1172.aClass24_9 = local18;
										local1172.anInt2859 = Static133.anIntArray280[local99];
										local1172.anInt2852 = Static172.anIntArray360[local99];
										local1172.anObjectArray29 = local18.anObjectArray20;
										Static141.aClass65_13.method2116(local1172);
									}
								}
							}
						}
						if (!local18.aBoolean63) {
							if (Static177.aClass24_13 != null || Static83.aClass24_4 != null || Static169.aBoolean165) {
								return;
							}
							if ((local18.anInt1360 >= 0 || local18.anInt1387 != 0) && Static93.anInt2353 >= local120 && local151 <= Static169.anInt3798 && local140 > Static93.anInt2353 && Static169.anInt3798 < local159) {
								if (local18.anInt1360 >= 0) {
									Static11.aClass24_1 = arg3[local18.anInt1360];
								} else {
									Static11.aClass24_1 = local18;
								}
							}
							if (local18.anInt1425 == 8 && local120 <= Static93.anInt2353 && local151 <= Static169.anInt3798 && local140 > Static93.anInt2353 && local159 > Static169.anInt3798) {
								Static105.aClass24_6 = local18;
							}
							if (local18.anInt1389 > local18.anInt1427) {
								Static181.method2905(local18, Static169.anInt3798, Static93.anInt2353, local18.anInt1389, local18.anInt1427, local65, local59 + local18.anInt1357);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(Z)V")
	public static void method1002() {
		aClass28_832 = null;
		aClass28_830 = null;
		aClass2_Sub4_Sub1_Sub1_Sub1Array1 = null;
		aClass28_831 = null;
		aClass28_829 = null;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
	public static int method1003() {
		@Pc(7) int local7 = 3;
		if (Static112.anInt2716 < 310) {
			@Pc(14) int local14 = Static36.anInt977 >> 7;
			@Pc(18) int local18 = Static21.anInt726 >> 7;
			@Pc(23) int local23 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 >> 7;
			@Pc(28) int local28 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 >> 7;
			if ((Static49.aByteArrayArrayArray4[Static103.anInt2568][local14][local18] & 0x4) != 0) {
				local7 = Static103.anInt2568;
			}
			@Pc(54) int local54;
			if (local18 < local23) {
				local54 = local23 - local18;
			} else {
				local54 = local18 - local23;
			}
			@Pc(72) int local72;
			if (local14 >= local28) {
				local72 = local14 - local28;
			} else {
				local72 = local28 - local14;
			}
			@Pc(88) int local88;
			@Pc(90) int local90;
			if (local54 < local72) {
				local88 = local54 * 65536 / local72;
				local90 = 32768;
				while (local28 != local14) {
					local90 += local88;
					if (local14 < local28) {
						local14++;
					} else if (local28 < local14) {
						local14--;
					}
					if ((Static49.aByteArrayArrayArray4[Static103.anInt2568][local14][local18] & 0x4) != 0) {
						local7 = Static103.anInt2568;
					}
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local23 > local18) {
							local18++;
						} else if (local18 > local23) {
							local18--;
						}
						if ((Static49.aByteArrayArrayArray4[Static103.anInt2568][local14][local18] & 0x4) != 0) {
							local7 = Static103.anInt2568;
						}
					}
				}
			} else {
				local88 = local72 * 65536 / local54;
				local90 = 32768;
				while (local18 != local23) {
					local90 += local88;
					if (local23 > local18) {
						local18++;
					} else if (local18 > local23) {
						local18--;
					}
					if ((Static49.aByteArrayArrayArray4[Static103.anInt2568][local14][local18] & 0x4) != 0) {
						local7 = Static103.anInt2568;
					}
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local14 < local28) {
							local14++;
						} else if (local28 < local14) {
							local14--;
						}
						if ((Static49.aByteArrayArrayArray4[Static103.anInt2568][local14][local18] & 0x4) != 0) {
							local7 = Static103.anInt2568;
						}
					}
				}
			}
		}
		if ((Static49.aByteArrayArrayArray4[Static103.anInt2568][Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 >> 7][Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 >> 7] & 0x4) != 0) {
			local7 = Static103.anInt2568;
		}
		return local7;
	}
}
