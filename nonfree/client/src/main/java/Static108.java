import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!t", name = "sb", descriptor = "Lclient!c;")
	public static Class10 aClass10_28;

	@OriginalMember(owner = "client!t", name = "ub", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_18;

	@OriginalMember(owner = "client!t", name = "Bb", descriptor = "I")
	public static int anInt2580;

	@OriginalMember(owner = "client!t", name = "Cb", descriptor = "I")
	public static int anInt2581;

	@OriginalMember(owner = "client!t", name = "ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!t", name = "qb", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!t", name = "zb", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!t", name = "Ab", descriptor = "Lclient!od;")
	public static Class60 aClass60_1001 = Static41.method597("Fps:");

	@OriginalMember(owner = "client!t", name = "Db", descriptor = "Lclient!od;")
	public static Class60 aClass60_1002 = Static41.method597("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!t", name = "Eb", descriptor = "Lclient!od;")
	public static Class60 aClass60_1003 = Static41.method597("<col=ffff00>*V");

	@OriginalMember(owner = "client!t", name = "Fb", descriptor = "Lclient!od;")
	public static Class60 aClass60_1004 = null;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(II)V")
	public static void method1788(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static130.aBoolean126) {
			Static115.method1873();
		} else if (arg0 != -1 && arg0 != Static23.anInt808 && Static63.anInt1593 != 0 && !Static130.aBoolean126) {
			Static9.method113(Static63.anInt1593, arg0, Static10.aClass10_Sub1_3, 0);
		}
		Static23.anInt808 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(B)V")
	public static void method1790() {
		aClass10_28 = null;
		aBooleanArray17 = null;
		aClass60_1004 = null;
		aClass10_Sub1_18 = null;
		aClass40_1 = null;
		aClass60_1001 = null;
		aClass60_1003 = null;
		aClass60_1002 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBIII)V")
	public static void method1791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static44.anInt2167 == 0 && !Static86.aBoolean71) {
			Static113.method814(Static23.aClass60_253, Static20.aClass60_223, arg3 - arg1, 29, arg2 - arg0, 0);
		}
		@Pc(31) int local31 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static92.anInt2181; local33++) {
			@Pc(39) int local39 = Static92.anIntArray262[local33];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 14 & 0x7FFF;
			@Pc(61) int local61 = local39 >> 29 & 0x3;
			if (local39 != local31) {
				local31 = local39;
				@Pc(187) int local187;
				if (local61 == 2 && Static30.aClass48_1.method1013(Static77.anInt1866, local43, local49, local39) >= 0) {
					@Pc(89) Class4_Sub3_Sub3 local89 = Static76.method1244(local55);
					if (local89.anIntArray81 != null) {
						local89 = local89.method402();
					}
					if (local89 == null) {
						continue;
					}
					if (Static44.anInt2167 == 1) {
						Static113.method814(Static12.method1761(new Class60[] { aClass60_1004, Static48.aClass60_444, local89.aClass60_231 }), Static83.aClass60_819, local43, 4, local49, local39);
					} else if (!Static86.aBoolean71) {
						@Pc(173) Class60[] local173 = local89.aClass60Array3;
						if (Static98.aBoolean84) {
							local173 = Static23.method427(local173);
						}
						if (local173 != null) {
							for (local187 = 4; local187 >= 0; local187--) {
								if (local173[local187] != null) {
									@Pc(195) short local195 = 0;
									if (local187 == 0) {
										local195 = 30;
									}
									if (local187 == 1) {
										local195 = 25;
									}
									if (local187 == 2) {
										local195 = 51;
									}
									if (local187 == 3) {
										local195 = 41;
									}
									if (local187 == 4) {
										local195 = 1002;
									}
									Static113.method814(Static12.method1761(new Class60[] { Static124.aClass60_1109, local89.aClass60_231 }), local173[local187], local43, local195, local49, local39);
								}
							}
						}
						Static113.method814(Static12.method1761(new Class60[] { Static124.aClass60_1109, local89.aClass60_231 }), Static23.aClass60_258, local43, 1007, local49, local89.anInt766 << 14);
					} else if ((Static111.anInt2632 & 0x4) == 4) {
						Static113.method814(Static12.method1761(new Class60[] { Static12.aClass60_998, Static48.aClass60_444, local89.aClass60_231 }), Static124.aClass60_1108, local43, 58, local49, local39);
					}
				}
				@Pc(312) int local312;
				@Pc(320) Class4_Sub3_Sub1_Sub2_Sub2 local320;
				@Pc(367) Class4_Sub3_Sub1_Sub2_Sub1 local367;
				if (local61 == 1) {
					@Pc(287) Class4_Sub3_Sub1_Sub2_Sub2 local287 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local55];
					if (local287.aClass4_Sub3_Sub13_1.anInt2214 == 1 && (local287.anInt1440 & 0x7F) == 64 && (local287.anInt1407 & 0x7F) == 64) {
						for (local312 = 0; local312 < Static36.anInt1010; local312++) {
							local320 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[Static59.anIntArray173[local312]];
							if (local320 != null && local287 != local320 && local320.aClass4_Sub3_Sub13_1.anInt2214 == 1 && local287.anInt1440 == local320.anInt1440 && local287.anInt1407 == local320.anInt1407) {
								Static10.method163(Static59.anIntArray173[local312], local320.aClass4_Sub3_Sub13_1, local49, local43);
							}
						}
						for (local187 = 0; local187 < Static125.anInt2830; local187++) {
							local367 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static118.anIntArray336[local187]];
							if (local367 != null && local287.anInt1440 == local367.anInt1440 && local287.anInt1407 == local367.anInt1407) {
								Static118.method1890(local43, local367, local49, Static118.anIntArray336[local187]);
							}
						}
					}
					Static10.method163(local55, local287.aClass4_Sub3_Sub13_1, local49, local43);
				}
				if (local61 == 0) {
					@Pc(411) Class4_Sub3_Sub1_Sub2_Sub1 local411 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local55];
					if ((local411.anInt1440 & 0x7F) == 64 && (local411.anInt1407 & 0x7F) == 64) {
						for (local312 = 0; local312 < Static36.anInt1010; local312++) {
							local320 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[Static59.anIntArray173[local312]];
							if (local320 != null && local320.aClass4_Sub3_Sub13_1.anInt2214 == 1 && local320.anInt1440 == local411.anInt1440 && local320.anInt1407 == local411.anInt1407) {
								Static10.method163(Static59.anIntArray173[local312], local320.aClass4_Sub3_Sub13_1, local49, local43);
							}
						}
						for (local187 = 0; local187 < Static125.anInt2830; local187++) {
							local367 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static118.anIntArray336[local187]];
							if (local367 != null && local367 != local411 && local411.anInt1440 == local367.anInt1440 && local411.anInt1407 == local367.anInt1407) {
								Static118.method1890(local43, local367, local49, Static118.anIntArray336[local187]);
							}
						}
					}
					Static118.method1890(local43, local411, local49, local55);
				}
				if (local61 == 3) {
					@Pc(531) Class45 local531 = Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local43][local49];
					if (local531 != null) {
						for (@Pc(538) Class4_Sub3_Sub1_Sub1 local538 = (Class4_Sub3_Sub1_Sub1) local531.method985(); local538 != null; local538 = (Class4_Sub3_Sub1_Sub1) local531.method989()) {
							@Pc(545) Class4_Sub3_Sub16 local545 = Static112.method1854(local538.anInt221);
							if (Static44.anInt2167 == 1) {
								Static113.method814(Static12.method1761(new Class60[] { aClass60_1004, Static71.aClass60_752, local545.aClass60_1128 }), Static83.aClass60_819, local43, 14, local49, local538.anInt221);
							} else if (!Static86.aBoolean71) {
								@Pc(557) Class60[] local557 = local545.aClass60Array21;
								if (Static98.aBoolean84) {
									local557 = Static23.method427(local557);
								}
								for (@Pc(565) int local565 = 4; local565 >= 0; local565--) {
									if (local557 != null && local557[local565] != null) {
										@Pc(579) byte local579 = 0;
										if (local565 == 0) {
											local579 = 43;
										}
										if (local565 == 1) {
											local579 = 21;
										}
										if (local565 == 2) {
											local579 = 36;
										}
										if (local565 == 3) {
											local579 = 20;
										}
										if (local565 == 4) {
											local579 = 15;
										}
										Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local545.aClass60_1128 }), local557[local565], local43, local579, local49, local538.anInt221);
									} else if (local565 == 2) {
										Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local545.aClass60_1128 }), Static4.aClass60_26, local43, 36, local49, local538.anInt221);
									}
								}
								Static113.method814(Static12.method1761(new Class60[] { Static115.aClass60_1048, local545.aClass60_1128 }), Static23.aClass60_258, local43, 1006, local49, local538.anInt221);
							} else if ((Static111.anInt2632 & 0x1) == 1) {
								Static113.method814(Static12.method1761(new Class60[] { Static12.aClass60_998, Static71.aClass60_752, local545.aClass60_1128 }), Static124.aClass60_1108, local43, 8, local49, local538.anInt221);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Lclient!od;")
	public static Class60 method1796(@OriginalArg(1) int arg0) {
		@Pc(14) Class60 local14 = new Class60();
		local14.aByteArray21 = new byte[arg0];
		local14.anInt1991 = 0;
		return local14;
	}
}
