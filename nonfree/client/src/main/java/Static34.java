import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Lclient!ed;")
	private static Class23 aClass23_375 = Static169.method2903("shake:");

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_372 = aClass23_375;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_373 = aClass23_375;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!ed;")
	public static Class23 aClass23_374 = Static169.method2903("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "Lclient!ed;")
	public static Class23 aClass23_376 = Static169.method2903("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	public static int method580(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public static void method581() {
		aClass23_373 = null;
		aClass23_372 = null;
		aClass23_374 = null;
		aClass23_375 = null;
		aClass23_376 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
	public static void method582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static144.anInt3643 == 0 && !Static156.aBoolean195) {
			Static134.method2312(Static101.aClass23_1001, Static113.aClass23_1114, arg1 - arg0, 40, 0, arg3 - arg2);
		}
		@Pc(33) int local33 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static175.anInt1621; local35++) {
			@Pc(41) int local41 = Static175.anIntArray196[local35];
			@Pc(47) int local47 = local41 >> 7 & 0x7F;
			@Pc(51) int local51 = local41 & 0x7F;
			@Pc(57) int local57 = local41 >> 29 & 0x3;
			@Pc(63) int local63 = local41 >> 14 & 0x7FFF;
			if (local33 != local41) {
				local33 = local41;
				@Pc(151) int local151;
				if (local57 == 2 && Static123.aClass80_1.method2676(Static85.anInt2267, local51, local47, local41) >= 0) {
					@Pc(88) Class1_Sub1_Sub3 local88 = Static84.method3155(local63);
					if (local88.anIntArray88 != null) {
						local88 = local88.method371();
					}
					if (local88 == null) {
						continue;
					}
					if (Static144.anInt3643 == 1) {
						Static134.method2312(Static149.method2571(new Class23[] { Static170.aClass23_284, Static29.aClass23_302, local88.aClass23_238 }), Static176.aClass23_1596, local51, 20, local41, local47);
					} else if (!Static156.aBoolean195) {
						@Pc(141) Class23[] local141 = local88.aClass23Array1;
						if (Static49.aBoolean59) {
							local141 = Static111.method1966(local141);
						}
						if (local141 != null) {
							for (local151 = 4; local151 >= 0; local151--) {
								if (local141[local151] != null) {
									@Pc(163) short local163 = 0;
									if (local151 == 0) {
										local163 = 26;
									}
									if (local151 == 1) {
										local163 = 49;
									}
									if (local151 == 2) {
										local163 = 32;
									}
									if (local151 == 3) {
										local163 = 3;
									}
									if (local151 == 4) {
										local163 = 1007;
									}
									Static134.method2312(Static149.method2571(new Class23[] { Static122.aClass23_1507, local88.aClass23_238 }), local141[local151], local51, local163, local41, local47);
								}
							}
						}
						Static134.method2312(Static149.method2571(new Class23[] { Static122.aClass23_1507, local88.aClass23_238 }), Static111.aClass23_1080, local51, 1001, local88.anInt665 << 14, local47);
					} else if ((Static23.anInt701 & 0x4) == 4) {
						Static134.method2312(Static149.method2571(new Class23[] { Static25.aClass23_277, Static29.aClass23_302, local88.aClass23_238 }), Static123.aClass23_1195, local51, 1, local41, local47);
					}
				}
				@Pc(314) int local314;
				@Pc(322) Class1_Sub1_Sub1_Sub1_Sub2 local322;
				@Pc(373) Class1_Sub1_Sub1_Sub1_Sub1 local373;
				if (local57 == 1) {
					@Pc(289) Class1_Sub1_Sub1_Sub1_Sub2 local289 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local63];
					if (local289.aClass1_Sub1_Sub9_1.anInt1540 == 1 && (local289.anInt1838 & 0x7F) == 64 && (local289.anInt1825 & 0x7F) == 64) {
						for (local314 = 0; local314 < Static86.anInt2307; local314++) {
							local322 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static141.anIntArray476[local314]];
							if (local322 != null && local322 != local289 && local322.aClass1_Sub1_Sub9_1.anInt1540 == 1 && local322.anInt1838 == local289.anInt1838 && local322.anInt1825 == local289.anInt1825) {
								Static146.method2526(Static141.anIntArray476[local314], local47, local51, local322.aClass1_Sub1_Sub9_1);
							}
						}
						for (local151 = 0; local151 < Static152.anInt3549; local151++) {
							local373 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static112.anIntArray382[local151]];
							if (local373 != null && local373.anInt1838 == local289.anInt1838 && local373.anInt1825 == local289.anInt1825) {
								Static12.method239(local51, local47, local373, Static112.anIntArray382[local151]);
							}
						}
					}
					Static146.method2526(local63, local47, local51, local289.aClass1_Sub1_Sub9_1);
				}
				if (local57 == 0) {
					@Pc(425) Class1_Sub1_Sub1_Sub1_Sub1 local425 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local63];
					if ((local425.anInt1838 & 0x7F) == 64 && (local425.anInt1825 & 0x7F) == 64) {
						for (local314 = 0; local314 < Static86.anInt2307; local314++) {
							local322 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static141.anIntArray476[local314]];
							if (local322 != null && local322.aClass1_Sub1_Sub9_1.anInt1540 == 1 && local425.anInt1838 == local322.anInt1838 && local425.anInt1825 == local322.anInt1825) {
								Static146.method2526(Static141.anIntArray476[local314], local47, local51, local322.aClass1_Sub1_Sub9_1);
							}
						}
						for (local151 = 0; local151 < Static152.anInt3549; local151++) {
							local373 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static112.anIntArray382[local151]];
							if (local373 != null && local425 != local373 && local425.anInt1838 == local373.anInt1838 && local373.anInt1825 == local425.anInt1825) {
								Static12.method239(local51, local47, local373, Static112.anIntArray382[local151]);
							}
						}
					}
					Static12.method239(local51, local47, local425, local63);
				}
				if (local57 == 3) {
					@Pc(549) Class56 local549 = Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local51][local47];
					if (local549 != null) {
						for (@Pc(556) Class1_Sub1_Sub1_Sub7 local556 = (Class1_Sub1_Sub1_Sub7) local549.method1849(); local556 != null; local556 = (Class1_Sub1_Sub1_Sub7) local549.method1847()) {
							@Pc(563) Class1_Sub1_Sub7 local563 = Static2.method118(local556.anInt4373);
							if (Static144.anInt3643 == 1) {
								Static134.method2312(Static149.method2571(new Class23[] { Static170.aClass23_284, Static61.aClass23_609, local563.aClass23_431 }), Static176.aClass23_1596, local51, 24, local556.anInt4373, local47);
							} else if (!Static156.aBoolean195) {
								@Pc(606) Class23[] local606 = local563.aClass23Array4;
								if (Static49.aBoolean59) {
									local606 = Static111.method1966(local606);
								}
								for (@Pc(614) int local614 = 4; local614 >= 0; local614--) {
									if (local606 != null && local606[local614] != null) {
										@Pc(660) byte local660 = 0;
										if (local614 == 0) {
											local660 = 12;
										}
										if (local614 == 1) {
											local660 = 50;
										}
										if (local614 == 2) {
											local660 = 43;
										}
										if (local614 == 3) {
											local660 = 18;
										}
										if (local614 == 4) {
											local660 = 4;
										}
										Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local563.aClass23_431 }), local606[local614], local51, local660, local556.anInt4373, local47);
									} else if (local614 == 2) {
										Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local563.aClass23_431 }), Static60.aClass23_1663, local51, 43, local556.anInt4373, local47);
									}
								}
								Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local563.aClass23_431 }), Static111.aClass23_1080, local51, 1005, local556.anInt4373, local47);
							} else if ((Static23.anInt701 & 0x1) == 1) {
								Static134.method2312(Static149.method2571(new Class23[] { Static25.aClass23_277, Static61.aClass23_609, local563.aClass23_431 }), Static123.aClass23_1195, local51, 34, local556.anInt4373, local47);
							}
						}
					}
				}
			}
		}
	}
}
