import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString69 = null;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "Lclient!em;")
	public static final Class83 aClass83_117 = new Class83(79, 11);

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	public static int anInt5819 = 765;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_31 = new Class207(4);

	@OriginalMember(owner = "client!me", name = "P", descriptor = "Z")
	public static boolean aBoolean454 = false;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public static void method4726(@OriginalArg(0) int arg0) {
		if (Static55.anInt1068 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static213.aString42 == null) {
				Static372.method5444(Static251.aString51, Static130.aString22, Static307.anInt7603);
			} else {
				Static303.method4596(Static307.anInt7603);
			}
		}
		if (arg0 != 13 && Static501.aClass43_2 != null) {
			Static501.aClass43_2.method1044();
			Static501.aClass43_2 = null;
		}
		if (arg0 == 3) {
			Static499.method7031(Static165.anInt3165 != Static80.anInt1541);
		}
		if (arg0 == 7) {
			Static362.method5323(Static165.anInt3165 != Static142.anInt2751);
		}
		if (arg0 == 5) {
			if (Static213.aString42 == null) {
				Static55.method955(Static130.aString22, Static251.aString51);
			} else {
				Static41.method6640();
			}
		} else if (arg0 == 6) {
			if (Static213.aString42 == null) {
				Static372.method5444(Static251.aString51, Static130.aString22, Static307.anInt7603);
			} else {
				Static303.method4596(Static307.anInt7603);
			}
		} else if (arg0 == 9) {
			if (Static213.aString42 == null) {
				Static372.method5444(Static251.aString51, Static130.aString22, Static307.anInt7603);
			} else {
				Static303.method4596(Static307.anInt7603);
			}
		} else if (arg0 == 12) {
			if (Static213.aString42 == null) {
				Static55.method955(Static130.aString22, Static251.aString51);
			} else {
				Static41.method6640();
			}
		}
		if (Static203.method3102(Static55.anInt1068)) {
			Static298.aClass308_106.anInt8167 = 2;
			Static379.aClass308_135.anInt8167 = 2;
			Static411.aClass308_147.anInt8167 = 2;
			Static575.aClass308_192.anInt8167 = 2;
			Static161.aClass308_66.anInt8167 = 2;
			Static506.aClass308_171.anInt8167 = 2;
			Static231.aClass308_94.anInt8167 = 2;
		}
		if (Static203.method3102(arg0)) {
			Static382.anInt9706 = 1;
			Static421.anInt7406 = 0;
			Static177.anInt8812 = 1;
			Static128.anInt2572 = 0;
			Static104.anInt1782 = 0;
			Static59.method996(true);
			Static298.aClass308_106.anInt8167 = 1;
			Static379.aClass308_135.anInt8167 = 1;
			Static411.aClass308_147.anInt8167 = 1;
			Static575.aClass308_192.anInt8167 = 1;
			Static161.aClass308_66.anInt8167 = 1;
			Static506.aClass308_171.anInt8167 = 1;
			Static231.aClass308_94.anInt8167 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static557.method7545();
		}
		@Pc(234) boolean local234 = arg0 == 2 || Static548.method7475(arg0) || Static45.method761(arg0);
		@Pc(251) boolean local251 = Static55.anInt1068 == 2 || Static548.method7475(Static55.anInt1068) || Static45.method761(Static55.anInt1068);
		if (local234 != local251) {
			if (local234) {
				Static106.anInt1789 = Static463.anInt8042;
				if (Static86.aClass1_Sub30_Sub1_1.anInt6192 == 0) {
					Static505.method7086();
				} else {
					Static399.method5768(Static51.aClass308_24, Static86.aClass1_Sub30_Sub1_1.anInt6192, Static463.anInt8042);
					Static115.method1625();
				}
				Static571.aClass205_3.method4364(false);
			} else {
				Static505.method7086();
				Static571.aClass205_3.method4364(true);
			}
		}
		if (Static203.method3102(arg0) || arg0 == 13) {
			Static31.aClass78_18.method6809();
		}
		Static55.anInt1068 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BFIFFLclient!gj;IIBIFFI)V")
	public static void method4727(@OriginalArg(0) byte[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) Class119 arg4, @OriginalArg(7) int arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7) {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			Static584.method7818(arg4, arg5, arg7, local15, arg0, arg2, arg6, arg3, arg1);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)[Lclient!em;")
	public static Class83[] method4728() {
		return new Class83[] { Static28.aClass83_13, Static169.aClass83_73, Static379.aClass83_143, Static214.aClass83_87, Static304.aClass83_111, Static160.aClass83_71, Static99.aClass83_49, Static116.aClass83_55, Static54.aClass83_35, Static50.aClass83_32, Static311.aClass83_112, Static101.aClass83_51, Static539.aClass83_194, Static525.aClass83_192, Static413.aClass83_148, Static426.aClass83_157, Static296.aClass83_106, Static429.aClass83_161, Static162.aClass83_72, Static58.aClass83_37, Static581.aClass83_208, Static430.aClass83_163, Static316.aClass83_116, Static97.aClass83_48, Static498.aClass83_22, Static519.aClass83_191, Static85.aClass83_46, Static254.aClass83_61, Static591.aClass83_210, Static102.aClass83_52, Static183.aClass83_78, Static244.aClass83_130, Static85.aClass83_45, Static501.aClass83_185, Static487.aClass83_176, Static2.aClass83_2, Static542.aClass83_197, Static289.aClass83_104, Static170.aClass83_75, Static183.aClass83_79, Static44.aClass83_25, Static223.aClass83_89, Static538.aClass83_160, Static391.aClass83_145, Static446.aClass83_169, Static4.aClass83_203, Static575.aClass83_207, Static115.aClass83_54, Static196.aClass83_82, Static219.aClass83_88, Static73.aClass83_40, Static76.aClass83_133, Static397.aClass83_146, Static226.aClass83_91, Static213.aClass83_86, Static515.aClass83_189, Static107.aClass83_53, Static429.aClass83_162, Static414.aClass83_166, Static446.aClass83_168, Static555.aClass83_200, Static223.aClass83_90, Static2.aClass83_1, Static592.aClass83_211, Static131.aClass83_56, Static100.aClass83_50, Static290.aClass83_105, Static340.aClass83_131, Static349.aClass83_135, Static299.aClass83_108, Static40.aClass83_23, Static260.aClass83_99, Static332.aClass83_128, Static473.aClass83_175, Static490.aClass83_177, Static441.aClass83_167, Static50.aClass83_33, Static281.aClass83_102, Static470.aClass83_65, aClass83_117, Static390.aClass83_204, Static250.aClass83_96, Static583.aClass83_209, Static263.aClass83_100, Static193.aClass83_80, Static264.aClass83_101, Static135.aClass83_58, Static499.aClass83_182, Static336.aClass83_129, Static84.aClass83_44, Static390.aClass83_205, Static312.aClass83_114, Static139.aClass83_62, Static497.aClass83_110, Static311.aClass83_113, Static373.aClass83_142, Static8.aClass83_123, Static133.aClass83_57, Static144.aClass83_63, Static4.aClass83_202, Static87.aClass83_47, Static353.aClass83_137, Static15.aClass83_6, Static46.aClass83_26, Static51.aClass83_34, Static297.aClass83_107, Static154.aClass83_66, Static459.aClass83_174, Static352.aClass83_136, Static197.aClass83_83, Static250.aClass83_95, Static32.aClass83_14, Static195.aClass83_138, Static324.aClass83_120, Static517.aClass83_190, Static558.aClass83_201, Static345.aClass83_206, Static508.aClass83_188 };
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method4729(@OriginalArg(0) String arg0) {
		return Static323.method4807(16, arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLclient!mw;)V")
	public static void method4731(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method4994(1) == 1;
		if (local15) {
			Static511.anIntArray539[Static149.anInt2838++] = arg0;
		}
		@Pc(35) int local35 = arg1.method4994(2);
		@Pc(39) Class11_Sub1_Sub1_Sub3_Sub1 local39 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[arg0];
		if (local35 != 0) {
			@Pc(154) int local154;
			@Pc(159) int local159;
			@Pc(164) int local164;
			if (local35 == 1) {
				local154 = arg1.method4994(3);
				local159 = local39.anIntArray455[0];
				local164 = local39.anIntArray454[0];
				if (local154 == 0) {
					local164--;
					local159--;
				} else if (local154 == 1) {
					local164--;
				} else if (local154 == 2) {
					local164--;
					local159++;
				} else if (local154 == 3) {
					local159--;
				} else if (local154 == 4) {
					local159++;
				} else if (local154 == 5) {
					local164++;
					local159--;
				} else if (local154 == 6) {
					local164++;
				} else if (local154 == 7) {
					local164++;
					local159++;
				}
				if (local15) {
					local39.anInt3604 = local159;
					local39.aBoolean261 = true;
					local39.anInt3605 = local164;
				} else {
					local39.method2948(Static226.aByteArray34[arg0], local164, local159);
				}
			} else if (local35 == 2) {
				local154 = arg1.method4994(4);
				local159 = local39.anIntArray455[0];
				local164 = local39.anIntArray454[0];
				if (local154 == 0) {
					local164 -= 2;
					local159 -= 2;
				} else if (local154 == 1) {
					local159--;
					local164 -= 2;
				} else if (local154 == 2) {
					local164 -= 2;
				} else if (local154 == 3) {
					local164 -= 2;
					local159++;
				} else if (local154 == 4) {
					local159 += 2;
					local164 -= 2;
				} else if (local154 == 5) {
					local164--;
					local159 -= 2;
				} else if (local154 == 6) {
					local164--;
					local159 += 2;
				} else if (local154 == 7) {
					local159 -= 2;
				} else if (local154 == 8) {
					local159 += 2;
				} else if (local154 == 9) {
					local159 -= 2;
					local164++;
				} else if (local154 == 10) {
					local164++;
					local159 += 2;
				} else if (local154 == 11) {
					local164 += 2;
					local159 -= 2;
				} else if (local154 == 12) {
					local159--;
					local164 += 2;
				} else if (local154 == 13) {
					local164 += 2;
				} else if (local154 == 14) {
					local164 += 2;
					local159++;
				} else if (local154 == 15) {
					local159 += 2;
					local164 += 2;
				}
				if (local15) {
					local39.anInt3605 = local164;
					local39.anInt3604 = local159;
					local39.aBoolean261 = true;
				} else {
					local39.method2948(Static226.aByteArray34[arg0], local164, local159);
				}
			} else {
				local154 = arg1.method4994(1);
				@Pc(432) int local432;
				@Pc(440) int local440;
				@Pc(454) int local454;
				@Pc(462) int local462;
				if (local154 == 0) {
					local159 = arg1.method4994(12);
					local164 = local159 >> 10;
					local432 = local159 >> 5 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local440 = local159 & 0x1F;
					if (local440 > 15) {
						local440 -= 32;
					}
					local454 = local39.anIntArray455[0] + local432;
					local462 = local39.anIntArray454[0] + local440;
					if (local15) {
						local39.anInt3605 = local462;
						local39.anInt3604 = local454;
						local39.aBoolean261 = true;
					} else {
						local39.method2948(Static226.aByteArray34[arg0], local462, local454);
					}
					local39.aByte113 = local39.aByte112 = (byte) (local164 + local39.aByte113 & 0x3);
					if (Static34.method641(local454, local462)) {
						local39.aByte112++;
					}
					if (arg0 == Static310.anInt5693) {
						Static240.anInt4414 = local39.aByte113;
					}
				} else {
					local159 = arg1.method4994(30);
					local164 = local159 >> 28;
					local432 = local159 >> 14 & 0x3FFF;
					local440 = local159 & 0x3FFF;
					local454 = (local432 + local39.anIntArray455[0] + Static539.anInt9045 & 0x3FFF) - Static539.anInt9045;
					local462 = (Static311.anInt5708 + local39.anIntArray454[0] + local440 & 0x3FFF) - Static311.anInt5708;
					if (local15) {
						local39.anInt3605 = local462;
						local39.anInt3604 = local454;
						local39.aBoolean261 = true;
					} else {
						local39.method2948(Static226.aByteArray34[arg0], local462, local454);
					}
					local39.aByte113 = local39.aByte112 = (byte) (local164 + local39.aByte113 & 0x3);
					if (Static34.method641(local454, local462)) {
						local39.aByte112++;
					}
					if (arg0 == Static310.anInt5693) {
						Static240.anInt4414 = local39.aByte113;
					}
				}
			}
		} else if (local15) {
			local39.aBoolean261 = false;
		} else if (Static310.anInt5693 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(70) Class66 local70 = Static459.aClass66Array1[arg0] = new Class66();
			local70.anInt1756 = (local39.anIntArray454[0] + Static311.anInt5708 >> 6) + ((local39.aByte113 << 28) + (Static539.anInt9045 + local39.anIntArray455[0] >> 6 << 14));
			if (local39.anInt3594 == -1) {
				local70.anInt1755 = local39.aClass106_7.method2484();
			} else {
				local70.anInt1755 = local39.anInt3594;
			}
			local70.aBoolean115 = local39.aBoolean259;
			local70.anInt1754 = local39.anInt7528;
			if (local39.anInt3593 > 0) {
				Static408.method5843(local39);
			}
			Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[arg0] = null;
			if (arg1.method4994(1) != 0) {
				Static587.method7878(arg0, arg1);
			}
		}
	}
}
