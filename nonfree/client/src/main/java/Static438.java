import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!nga", name = "ib", descriptor = "I")
	public static int anInt6734;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BI)I")
	public static int method5836(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method5837(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static493.anInt7806 = 0;
		Static607.anInt9203 = 0;
		Static414.anInt6386++;
		@Pc(22) Class9_Sub1 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static356.aClass9_Sub1Array4[local6]; local22 != null; local22 = local22.aClass9_Sub1_24) {
				if (!Static59.method1385(local22, arg0, arg1, arg2, arg3)) {
					Static383.method5136(local22);
					if (local22.anInt10693 != -1) {
						Static245.aClass9_Sub1Array3[Static493.anInt7806++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static120.aClass9_Sub1Array2[local6]; local22 != null; local22 = local22.aClass9_Sub1_24) {
				if (!Static59.method1385(local22, arg0, arg1, arg2, arg3)) {
					Static383.method5136(local22);
					if (local22.anInt10693 != -1) {
						Static688.aClass9_Sub1Array5[Static607.anInt9203++] = local22;
					}
				}
			}
			for (@Pc(98) Class9_Sub1 local98 = Static52.aClass9_Sub1Array1[local6]; local98 != null; local98 = local98.aClass9_Sub1_24) {
				if (!Static59.method1385(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method9084()) {
						Static383.method5136(local98);
						if (local98.anInt10693 != -1) {
							Static688.aClass9_Sub1Array5[Static607.anInt9203++] = local98;
						}
					} else {
						Static383.method5136(local98);
						if (local98.anInt10693 != -1) {
							Static245.aClass9_Sub1Array3[Static493.anInt7806++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static101.anInt2152; local157++) {
					if (!Static59.method1385(Static656.aClass9_Sub1_Sub1Array1[local157], arg0, arg1, arg2, arg3)) {
						Static383.method5136(Static656.aClass9_Sub1_Sub1Array1[local157]);
						if (Static656.aClass9_Sub1_Sub1Array1[local157].anInt10693 != -1) {
							if (Static656.aClass9_Sub1_Sub1Array1[local157].method9084()) {
								Static688.aClass9_Sub1Array5[Static607.anInt9203++] = Static656.aClass9_Sub1_Sub1Array1[local157];
							} else {
								Static245.aClass9_Sub1Array3[Static493.anInt7806++] = Static656.aClass9_Sub1_Sub1Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static493.anInt7806 > 0) {
			Static531.method7068(Static245.aClass9_Sub1Array3, 0, Static493.anInt7806 - 1);
			for (local225 = 0; local225 < Static493.anInt7806; local225++) {
				Static180.method2872(Static245.aClass9_Sub1Array3[local225], arg6);
			}
		}
		if (Static626.aBoolean647) {
			Static404.aClass22_6.method9350(0, (Class3_Sub5[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static66.anInt1583; local225 < Static169.anInt2992; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static181.aBooleanArrayArray2.length;
					if (Static282.anInt2240 + Static181.aBooleanArrayArray2.length > Static128.anInt2531) {
						local263 -= Static282.anInt2240 + Static181.aBooleanArrayArray2.length - Static128.anInt2531;
					}
					local157 = Static181.aBooleanArrayArray2[0].length;
					if (Static74.anInt1707 + Static181.aBooleanArrayArray2[0].length > Static448.anInt6835) {
						local157 -= Static74.anInt1707 + Static181.aBooleanArrayArray2[0].length - Static448.anInt6835;
					}
					local304 = Static696.aBooleanArrayArray7;
					if (Static314.aBoolean334) {
						if (Static539.aBoolean563) {
							local304 = Static194.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static315.anInt5070; local316 < local263; local316++) {
							local323 = local316 + Static282.anInt2240 - Static315.anInt5070;
							for (local325 = Static394.anInt6135; local325 < local157; local325++) {
								if (Static181.aBooleanArrayArray2[local316][local325] && !Static323.method4705(local225, local325 + Static74.anInt1707 - Static394.anInt6135, local323)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static539.aBoolean563) {
						if (arg4 >= 0) {
							Static477.aClass259Array3[local225].method9300(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static477.aClass259Array3[local225].method9301(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static347.anInt5553; local316++) {
							Static306.aClass353Array1[local316].method7814(new Class9_Sub8(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static477.aClass259Array3[local225].method9300(Static507.anInt8070, Static527.anInt8230, Static720.anInt11190, Static696.aBooleanArrayArray7, true, arg4, arg5);
					} else {
						Static477.aClass259Array3[local225].method9301(Static507.anInt8070, Static527.anInt8230, Static720.anInt11190, Static696.aBooleanArrayArray7, true, arg5);
					}
				} else {
					local263 = Static181.aBooleanArrayArray2.length;
					if (Static282.anInt2240 + Static181.aBooleanArrayArray2.length > Static128.anInt2531) {
						local263 -= Static282.anInt2240 + Static181.aBooleanArrayArray2.length - Static128.anInt2531;
					}
					local157 = Static181.aBooleanArrayArray2[0].length;
					if (Static74.anInt1707 + Static181.aBooleanArrayArray2[0].length > Static448.anInt6835) {
						local157 -= Static74.anInt1707 + Static181.aBooleanArrayArray2[0].length - Static448.anInt6835;
					}
					local304 = Static696.aBooleanArrayArray7;
					if (Static314.aBoolean334) {
						if (Static539.aBoolean563) {
							local304 = Static194.aBooleanArrayArrayArray1[local225];
						}
						for (local316 = Static315.anInt5070; local316 < local263; local316++) {
							local323 = local316 + Static282.anInt2240 - Static315.anInt5070;
							for (local325 = Static394.anInt6135; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static181.aBooleanArrayArray2[local316][local325]) {
									@Pc(344) int local344 = local325 + Static74.anInt1707 - Static394.anInt6135;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static448.aClass364ArrayArrayArray2[local346][local323][local344] != null && Static448.aClass364ArrayArrayArray2[local346][local323][local344].aByte135 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static323.method4705(local225, local344, local323)) {
												local304[local316][local325] = true;
												break;
											}
											local304[local316][local325] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static539.aBoolean563) {
						if (arg4 >= 0) {
							Static477.aClass259Array3[local225].method9300(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static477.aClass259Array3[local225].method9301(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static347.anInt5553; local316++) {
							Static306.aClass353Array1[local316].method7814(new Class9_Sub8(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static477.aClass259Array3[local225].method9300(Static507.anInt8070, Static527.anInt8230, Static720.anInt11190, Static696.aBooleanArrayArray7, false, arg4, arg5);
					} else {
						Static477.aClass259Array3[local225].method9301(Static507.anInt8070, Static527.anInt8230, Static720.anInt11190, Static696.aBooleanArrayArray7, false, arg5);
					}
				}
			}
		}
		if (Static607.anInt9203 > 0) {
			Static492.method6654(Static688.aClass9_Sub1Array5, 0, Static607.anInt9203 - 1);
			for (local225 = 0; local225 < Static607.anInt9203; local225++) {
				Static180.method2872(Static688.aClass9_Sub1Array5[local225], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IC)Z")
	public static boolean method5838(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static78.method1726(arg0)) {
			return true;
		} else {
			@Pc(20) char[] local20 = Static652.aCharArray7;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				@Pc(30) char local30 = local20[local22];
				if (local30 == arg0) {
					return true;
				}
			}
			if (-24 < -95) {
				anInt6734 = -117;
			}
			@Pc(58) char[] local58 = Static293.aCharArray10;
			for (@Pc(60) int local60 = 0; local60 < local58.length; local60++) {
				@Pc(68) char local68 = local58[local60];
				if (arg0 == local68) {
					return true;
				}
			}
			return false;
		}
	}
}
