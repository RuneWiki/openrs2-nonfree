import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
	public static int anInt1152;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
	public static int anInt1153;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "[I")
	public static final int[] anIntArray123 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
	public static void method1014() {
		@Pc(5) int local5 = 0;
		if (Static404.aClass2_Sub13_2.aClass33_Sub28_1.method8390() == 1) {
			local5 = 55;
		}
		if (Static404.aClass2_Sub13_2.aClass33_Sub4_1.method1808() == 0) {
			local5 |= 0x40;
		}
		Static340.method5230(local5);
		Static619.aClass281_4.method6730(local5);
		Static570.aClass267_2.method6605(local5);
		Static341.aClass76_1.method1675(local5);
		Static414.aClass356_2.method8210(local5);
		Static36.method808(local5);
		Static16.method327(local5);
		Static18.method432(local5);
		Static303.method4690(local5);
		Static251.method4098();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method1015(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static530.anInt8847 = 0;
		Static539.anInt8993 = 0;
		Static411.anInt7540++;
		@Pc(19) int local19;
		if ((arg5 & 0x2) == 0) {
			for (local19 = 0; local19 < Static336.anIntArray411[local5]; local19++) {
				if (!Static153.method2910(Static317.aClass11_Sub1ArrayArray2[local5][local19], arg0, arg1, arg2, arg3)) {
					Static37.method812(Static317.aClass11_Sub1ArrayArray2[local5][local19]);
					if (Static317.aClass11_Sub1ArrayArray2[local5][local19].anInt9928 != -1) {
						Static244.aClass11_Sub1Array2[Static530.anInt8847++] = Static317.aClass11_Sub1ArrayArray2[local5][local19];
					}
				}
			}
		}
		@Pc(115) int local115;
		@Pc(198) int local198;
		if ((arg5 & 0x1) == 0) {
			for (local19 = 0; local19 < Static442.anIntArray535[local5]; local19++) {
				if (!Static153.method2910(Static146.aClass11_Sub1ArrayArray1[local5][local19], arg0, arg1, arg2, arg3)) {
					Static37.method812(Static146.aClass11_Sub1ArrayArray1[local5][local19]);
					if (Static146.aClass11_Sub1ArrayArray1[local5][local19].anInt9928 != -1) {
						Static174.aClass11_Sub1Array1[Static539.anInt8993++] = Static146.aClass11_Sub1ArrayArray1[local5][local19];
					}
				}
			}
			for (local115 = 0; local115 < Static429.anIntArray527[local5]; local115++) {
				if (!Static153.method2910(Static483.aClass11_Sub1ArrayArray3[local5][local115], arg0, arg1, arg2, arg3)) {
					if (Static483.aClass11_Sub1ArrayArray3[local5][local115].method8310()) {
						Static37.method812(Static483.aClass11_Sub1ArrayArray3[local5][local115]);
						if (Static483.aClass11_Sub1ArrayArray3[local5][local115].anInt9928 != -1) {
							Static174.aClass11_Sub1Array1[Static539.anInt8993++] = Static483.aClass11_Sub1ArrayArray3[local5][local115];
						}
					} else {
						Static37.method812(Static483.aClass11_Sub1ArrayArray3[local5][local115]);
						if (Static483.aClass11_Sub1ArrayArray3[local5][local115].anInt9928 != -1) {
							Static244.aClass11_Sub1Array2[Static530.anInt8847++] = Static483.aClass11_Sub1ArrayArray3[local5][local115];
						}
					}
				}
			}
			if (!arg0) {
				for (local198 = 0; local198 < Static226.anInt4632; local198++) {
					if (!Static153.method2910(Static310.aClass11_Sub1_Sub1Array1[local198], arg0, arg1, arg2, arg3)) {
						Static37.method812(Static310.aClass11_Sub1_Sub1Array1[local198]);
						if (Static310.aClass11_Sub1_Sub1Array1[local198].anInt9928 != -1) {
							if (Static310.aClass11_Sub1_Sub1Array1[local198].method8310()) {
								Static174.aClass11_Sub1Array1[Static539.anInt8993++] = Static310.aClass11_Sub1_Sub1Array1[local198];
							} else {
								Static244.aClass11_Sub1Array2[Static530.anInt8847++] = Static310.aClass11_Sub1_Sub1Array1[local198];
							}
						}
					}
				}
			}
		}
		if (Static530.anInt8847 > 0) {
			Static286.method6703(Static244.aClass11_Sub1Array2, 0, Static530.anInt8847 - 1);
			for (local19 = 0; local19 < Static530.anInt8847; local19++) {
				Static123.method2505(Static244.aClass11_Sub1Array2[local19], arg6);
			}
		}
		if (Static148.aBoolean298) {
			Static328.aClass87_6.method7926(0, null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local19 = Static324.anInt5879; local19 < Static330.anInt4381; local19++) {
				@Pc(332) boolean[][] local332;
				@Pc(342) int local342;
				@Pc(349) int local349;
				@Pc(351) int local351;
				if (local19 < arg2 || arg1 == null) {
					local115 = Static36.aBooleanArrayArray2.length;
					if (Static299.anInt5579 + Static36.aBooleanArrayArray2.length > Static347.anInt6411) {
						local115 -= Static299.anInt5579 + Static36.aBooleanArrayArray2.length - Static347.anInt6411;
					}
					local198 = Static36.aBooleanArrayArray2[0].length;
					if (Static171.anInt3808 + Static36.aBooleanArrayArray2[0].length > Static191.anInt6006) {
						local198 -= Static171.anInt3808 + Static36.aBooleanArrayArray2[0].length - Static191.anInt6006;
					}
					local332 = Static38.aBooleanArrayArray3;
					if (Static481.aBoolean615) {
						if (Static501.aBoolean631) {
							local332 = Static295.aBooleanArrayArrayArray6[local19];
						}
						for (local342 = Static447.anInt7906; local342 < local115; local342++) {
							local349 = local342 + Static299.anInt5579 - Static447.anInt7906;
							for (local351 = Static223.anInt4590; local351 < local198; local351++) {
								if (Static36.aBooleanArrayArray2[local342][local351] && !Static182.method3302(local19, local351 + Static171.anInt3808 - Static223.anInt4590, local349)) {
									local332[local342][local351] = true;
								} else {
									local332[local342][local351] = false;
								}
							}
						}
					}
					if (Static501.aBoolean631) {
						if (arg4 >= 0) {
							Static331.aClass112Array3[local19].method7823(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static331.aClass112Array3[local19].method7817(0, 0, 0, null, false, arg5);
						}
						for (local342 = 0; local342 < Static621.anInt10092; local342++) {
							Static328.aClass103Array1[local342].method2670(new Class11_Sub9(local19 + 1));
						}
					} else if (arg4 >= 0) {
						Static331.aClass112Array3[local19].method7823(Static623.anInt9563, Static507.anInt8547, Static319.anInt5795, Static38.aBooleanArrayArray3, true, arg4, arg5);
					} else {
						Static331.aClass112Array3[local19].method7817(Static623.anInt9563, Static507.anInt8547, Static319.anInt5795, Static38.aBooleanArrayArray3, true, arg5);
					}
				} else {
					local115 = Static36.aBooleanArrayArray2.length;
					if (Static299.anInt5579 + Static36.aBooleanArrayArray2.length > Static347.anInt6411) {
						local115 -= Static299.anInt5579 + Static36.aBooleanArrayArray2.length - Static347.anInt6411;
					}
					local198 = Static36.aBooleanArrayArray2[0].length;
					if (Static171.anInt3808 + Static36.aBooleanArrayArray2[0].length > Static191.anInt6006) {
						local198 -= Static171.anInt3808 + Static36.aBooleanArrayArray2[0].length - Static191.anInt6006;
					}
					local332 = Static38.aBooleanArrayArray3;
					if (Static481.aBoolean615) {
						if (Static501.aBoolean631) {
							local332 = Static295.aBooleanArrayArrayArray6[local19];
						}
						for (local342 = Static447.anInt7906; local342 < local115; local342++) {
							local349 = local342 + Static299.anInt5579 - Static447.anInt7906;
							for (local351 = Static223.anInt4590; local351 < local198; local351++) {
								local332[local342][local351] = false;
								if (Static36.aBooleanArrayArray2[local342][local351]) {
									@Pc(370) int local370 = local351 + Static171.anInt3808 - Static223.anInt4590;
									for (@Pc(372) int local372 = local19; local372 >= 0; local372--) {
										if (Static440.aClass217ArrayArrayArray3[local372][local349][local370] != null && Static440.aClass217ArrayArrayArray3[local372][local349][local370].aByte91 == local19) {
											if ((local372 < arg2 || arg1[local372][local349][local370] != arg3) && !Static182.method3302(local19, local370, local349)) {
												local332[local342][local351] = true;
												break;
											}
											local332[local342][local351] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static501.aBoolean631) {
						if (arg4 >= 0) {
							Static331.aClass112Array3[local19].method7823(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static331.aClass112Array3[local19].method7817(0, 0, 0, null, false, arg5);
						}
						for (local342 = 0; local342 < Static621.anInt10092; local342++) {
							Static328.aClass103Array1[local342].method2670(new Class11_Sub9(local19 + 1));
						}
					} else if (arg4 >= 0) {
						Static331.aClass112Array3[local19].method7823(Static623.anInt9563, Static507.anInt8547, Static319.anInt5795, Static38.aBooleanArrayArray3, false, arg4, arg5);
					} else {
						Static331.aClass112Array3[local19].method7817(Static623.anInt9563, Static507.anInt8547, Static319.anInt5795, Static38.aBooleanArrayArray3, false, arg5);
					}
				}
			}
		}
		if (Static539.anInt8993 > 0) {
			Static331.method4923(Static174.aClass11_Sub1Array1, 0, Static539.anInt8993 - 1);
			for (local19 = 0; local19 < Static539.anInt8993; local19++) {
				Static123.method2505(Static174.aClass11_Sub1Array1[local19], arg6);
			}
		}
	}
}
