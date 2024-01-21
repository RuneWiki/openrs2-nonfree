import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	public static int anInt1552;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "I")
	public static int anInt1550 = -1;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array4 = new Class1_Sub2_Sub2_Sub3[1000];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!rh;I)V")
	public static void method1112(@OriginalArg(1) int arg0, @OriginalArg(2) Class77 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt3248 == 1) {
			Static175.method2242(arg1.aClass81_1140, Static149.aClass81_1213, arg1.anInt3231, (short) 10, 0, 0L);
		}
		if (arg1.anInt3248 == 2 && !Static184.aBoolean172) {
			@Pc(33) Class81 local33 = Static7.method123(arg1);
			if (local33 != null) {
				Static175.method2242(local33, Static127.method2169(new Class81[] { Static52.aClass81_448, arg1.aClass81_1142 }), arg1.anInt3231, (short) 7, -1, 0L);
			}
		}
		if (arg1.anInt3248 == 3) {
			Static175.method2242(Static168.aClass81_1369, Static149.aClass81_1213, arg1.anInt3231, (short) 6, 0, 0L);
		}
		if (arg1.anInt3248 == 4) {
			Static175.method2242(arg1.aClass81_1140, Static149.aClass81_1213, arg1.anInt3231, (short) 4, 0, 0L);
		}
		if (arg1.anInt3248 == 5) {
			Static175.method2242(arg1.aClass81_1140, Static149.aClass81_1213, arg1.anInt3231, (short) 33, 0, 0L);
		}
		if (arg1.anInt3248 == 6 && Static46.aClass77_7 == null) {
			Static175.method2242(arg1.aClass81_1140, Static149.aClass81_1213, arg1.anInt3231, (short) 13, -1, 0L);
		}
		@Pc(154) int local154;
		@Pc(148) int local148;
		if (arg1.anInt3226 == 2) {
			local148 = 0;
			for (@Pc(150) int local150 = 0; local150 < arg1.anInt3245; local150++) {
				for (local154 = 0; local154 < arg1.anInt3217; local154++) {
					@Pc(163) int local163 = (arg1.anInt3206 + 32) * local154;
					@Pc(170) int local170 = (arg1.anInt3256 + 32) * local150;
					if (local148 < 20) {
						local163 += arg1.anIntArray343[local148];
						local170 += arg1.anIntArray338[local148];
					}
					if (local163 <= arg2 && local170 <= arg0 && arg2 < local163 + 32 && arg0 < local170 + 32) {
						Static176.anInt4013 = local148;
						Static41.aClass77_6 = arg1;
						if (arg1.anIntArray348[local148] > 0) {
							@Pc(221) Class1_Sub2_Sub12 local221 = Static54.method969(arg1.anIntArray348[local148] - 1);
							if (Static164.anInt3767 == 1 && Static9.method133(Static165.method2894(arg1))) {
								if (arg1.anInt3231 != Static7.anInt159 || local148 != Static12.anInt4133) {
									Static175.method2242(Static7.aClass81_79, Static127.method2169(new Class81[] { Static132.aClass81_1033, Static176.aClass81_1404, local221.aClass81_843 }), arg1.anInt3231, (short) 18, local148, (long) local221.anInt2398);
								}
							} else if (!Static184.aBoolean172 || !Static9.method133(Static165.method2894(arg1))) {
								@Pc(245) Class81[] local245 = local221.aClass81Array10;
								if (Static88.aBoolean85) {
									local245 = Static98.method1639(local245);
								}
								@Pc(259) int local259;
								@Pc(276) byte local276;
								if (Static9.method133(Static165.method2894(arg1))) {
									for (local259 = 4; local259 >= 3; local259--) {
										if (local245 != null && local245[local259] != null) {
											if (local259 == 3) {
												local276 = 2;
											} else {
												local276 = 57;
											}
											Static175.method2242(local245[local259], Static127.method2169(new Class81[] { Static25.aClass81_219, local221.aClass81_843 }), arg1.anInt3231, local276, local148, (long) local221.anInt2398);
										} else if (local259 == 4) {
											Static175.method2242(Static161.aClass81_1311, Static127.method2169(new Class81[] { Static25.aClass81_219, local221.aClass81_843 }), arg1.anInt3231, (short) 57, local148, (long) local221.anInt2398);
										}
									}
								}
								if (Static83.method1390(Static165.method2894(arg1))) {
									Static175.method2242(Static7.aClass81_79, Static127.method2169(new Class81[] { Static25.aClass81_219, local221.aClass81_843 }), arg1.anInt3231, (short) 47, local148, (long) local221.anInt2398);
								}
								if (Static9.method133(Static165.method2894(arg1)) && local245 != null) {
									for (local259 = 2; local259 >= 0; local259--) {
										if (local245[local259] != null) {
											local276 = 0;
											if (local259 == 0) {
												local276 = 58;
											}
											if (local259 == 1) {
												local276 = 12;
											}
											if (local259 == 2) {
												local276 = 44;
											}
											Static175.method2242(local245[local259], Static127.method2169(new Class81[] { Static25.aClass81_219, local221.aClass81_843 }), arg1.anInt3231, local276, local148, (long) local221.anInt2398);
										}
									}
								}
								local245 = arg1.aClass81Array18;
								if (Static88.aBoolean85) {
									local245 = Static98.method1639(local245);
								}
								if (local245 != null) {
									for (local259 = 4; local259 >= 0; local259--) {
										if (local245[local259] != null) {
											local276 = 0;
											if (local259 == 0) {
												local276 = 46;
											}
											if (local259 == 1) {
												local276 = 3;
											}
											if (local259 == 2) {
												local276 = 21;
											}
											if (local259 == 3) {
												local276 = 51;
											}
											if (local259 == 4) {
												local276 = 45;
											}
											Static175.method2242(local245[local259], Static127.method2169(new Class81[] { Static25.aClass81_219, local221.aClass81_843 }), arg1.anInt3231, local276, local148, (long) local221.anInt2398);
										}
									}
								}
								Static175.method2242(Static11.aClass81_223, Static127.method2169(new Class81[] { Static25.aClass81_219, local221.aClass81_843 }), arg1.anInt3231, (short) 1006, local148, (long) local221.anInt2398);
							} else if ((Static93.anInt2064 & 0x10) == 16) {
								Static175.method2242(Static14.aClass81_127, Static127.method2169(new Class81[] { Static74.aClass81_617, Static176.aClass81_1404, local221.aClass81_843 }), arg1.anInt3231, (short) 22, local148, (long) local221.anInt2398);
							}
						}
					}
					local148++;
				}
			}
		}
		if (!arg1.aBoolean138) {
			return;
		}
		if (!Static184.aBoolean172) {
			@Pc(673) Class81 local673;
			for (local148 = 9; local148 >= 5; local148--) {
				local673 = Static16.method237(arg1, local148);
				if (local673 != null) {
					Static175.method2242(local673, arg1.aClass81_1147, arg1.anInt3231, (short) 1003, arg1.anInt3189, (long) (local148 + 1));
				}
			}
			local673 = Static7.method123(arg1);
			if (local673 != null) {
				Static175.method2242(local673, arg1.aClass81_1147, arg1.anInt3231, (short) 7, arg1.anInt3189, 0L);
			}
			for (local154 = 4; local154 >= 0; local154--) {
				@Pc(729) Class81 local729 = Static16.method237(arg1, local154);
				if (local729 != null) {
					Static175.method2242(local729, arg1.aClass81_1147, arg1.anInt3231, (short) 26, arg1.anInt3189, (long) (local154 + 1));
				}
			}
			if (Static5.method113(Static165.method2894(arg1))) {
				Static175.method2242(Static119.aClass81_962, Static149.aClass81_1213, arg1.anInt3231, (short) 13, arg1.anInt3189, 0L);
				return;
			}
			return;
		}
		if (Static142.method2394(Static165.method2894(arg1)) && (Static93.anInt2064 & 0x20) == 32) {
			Static175.method2242(Static14.aClass81_127, Static127.method2169(new Class81[] { Static74.aClass81_617, Static35.aClass81_336, arg1.aClass81_1147 }), arg1.anInt3231, (short) 24, arg1.anInt3189, 0L);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLclient!tg;I)V")
	public static void method1116(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class81 arg1) {
		@Pc(8) int local8 = Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5.method1952(arg1, 250);
		@Pc(22) int local22 = Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5.method1922(arg1, 250) * 13;
		Static4.method2572(6, 6, local8 + 4 + 4, local22 + 4 + 4, 0);
		Static4.method2563(6, 6, local8 + 4 + 4, local22 - -8, 16777215);
		Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5.method1937(arg1, 10, 10, local8, local22, 16777215, -1, 1, 1, 0);
		Static67.method1208(local22 + 8, 6, local8 + 4 + 4, 6);
		if (!arg0) {
			Static24.method527(local8, local22, 10, 10);
			return;
		}
		try {
			@Pc(120) Graphics local120 = Static114.aCanvas3.getGraphics();
			Static147.aClass34_1.method1633(local120);
		} catch (@Pc(130) Exception local130) {
			Static114.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method1120() {
		Static158.anInt3590 = 0;
		Static77.anInt1829 = 0;
		Static35.method740();
		Static148.method2526();
		Static181.method3110();
		Static110.method1955();
		@Pc(30) int local30;
		for (@Pc(19) int local19 = 0; local19 < Static158.anInt3590; local19++) {
			local30 = Static45.anIntArray94[local19];
			if (Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local30].anInt3022 != Static142.anInt3104) {
				Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local30] = null;
			}
		}
		if (Static98.anInt2162 != Static21.aClass1_Sub8_Sub1_1.anInt446) {
			throw new RuntimeException("gpp1 pos:" + Static21.aClass1_Sub8_Sub1_1.anInt446 + " psize:" + Static98.anInt2162);
		}
		for (local30 = 0; local30 < Static25.anInt645; local30++) {
			if (Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[Static176.anIntArray423[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static25.anInt645);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!vb;B)Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4 method1121(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		return Static83.method1391(arg1, 0, arg0) ? Static136.method2285() : null;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	public static void method1124() {
		aClass1_Sub2_Sub2_Sub3Array4 = null;
	}
}
