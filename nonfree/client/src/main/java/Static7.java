import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!e;")
	public static Class21 aClass21_1 = new Class21(32);

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_118 = Static56.method972("Empf-=nger:");

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public static int anInt363 = 0;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public static int anInt367 = 0;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_119 = Static56.method972("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ed;IZ)Z")
	public static boolean method195(@OriginalArg(0) Class23 arg0, @OriginalArg(2) boolean arg1) {
		Static78.anInt1964 = 20;
		try {
			Static93.aClass25_1 = (Class25) Class.forName("Class25_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(19) Interface2 local19 = arg0.method519();
			if (local19 != null) {
				Static93.aClass25_1 = new Class25_Sub1_Sub2(arg0, local19);
				return true;
			} else if (arg1) {
				Static93.aClass25_1 = new Class25_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!te;I)V")
	public static void method196(@OriginalArg(0) Class3_Sub1_Sub17 arg0) {
		@Pc(4) int local4 = arg0.anInt2646;
		@Pc(97) int local97;
		if (local4 >= 1 && local4 <= 100 || !(local4 < 701 || local4 > 800)) {
			if (Static15.anInt524 == 0) {
				if (local4 == 1) {
					arg0.aClass5_1183 = Static17.aClass5_279;
					arg0.anInt2653 = 0;
					return;
				}
				if (local4 == 2) {
					arg0.aClass5_1183 = Static40.aClass5_515;
					arg0.anInt2653 = 0;
					return;
				}
			}
			if (Static15.anInt524 == 1) {
				if (local4 == 1) {
					arg0.aClass5_1183 = Static63.aClass5_1323;
					arg0.anInt2653 = 0;
					return;
				}
				if (local4 == 2) {
					arg0.aClass5_1183 = Static40.aClass5_511;
					arg0.anInt2653 = 0;
					return;
				}
				if (local4 == 3) {
					arg0.aClass5_1183 = Static15.aClass5_241;
					arg0.anInt2653 = 0;
					return;
				}
			}
			if (local4 > 700) {
				local4 -= 601;
			} else {
				local4--;
			}
			local97 = Static5.anInt346;
			if (Static15.anInt524 != 2) {
				local97 = 0;
			}
			if (local97 <= local4) {
				arg0.anInt2653 = 0;
				arg0.aClass5_1183 = Static110.aClass5_1307;
			} else {
				arg0.aClass5_1183 = Static34.aClass5Array8[local4];
				arg0.anInt2653 = 1;
			}
		} else if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
			if (local4 > 800) {
				local4 -= 701;
			} else {
				local4 -= 101;
			}
			local97 = Static5.anInt346;
			if (Static15.anInt524 != 2) {
				local97 = 0;
			}
			if (local4 >= local97) {
				arg0.aClass5_1183 = Static110.aClass5_1307;
				arg0.anInt2653 = 0;
			} else {
				if (Static57.anIntArray183[local4] == 0) {
					arg0.aClass5_1183 = Static75.method1261(new Class5[] { Static85.aClass5_962, Static74.aClass5_876 });
				} else if (Static57.anIntArray183[local4] >= 5000) {
					if (Static57.anIntArray183[local4] == Static22.anInt715) {
						arg0.aClass5_1183 = Static75.method1261(new Class5[] { Static62.aClass5_793, Static73.aClass5_871, Static96.method1319(Static57.anIntArray183[local4] - 5000) });
					} else {
						arg0.aClass5_1183 = Static75.method1261(new Class5[] { Static23.aClass5_314, Static73.aClass5_871, Static96.method1319(Static57.anIntArray183[local4] - 5000) });
					}
				} else if (Static57.anIntArray183[local4] == Static22.anInt715) {
					arg0.aClass5_1183 = Static75.method1261(new Class5[] { Static62.aClass5_793, Static89.aClass5_1038, Static96.method1319(Static57.anIntArray183[local4]) });
				} else {
					arg0.aClass5_1183 = Static75.method1261(new Class5[] { Static23.aClass5_314, Static89.aClass5_1038, Static96.method1319(Static57.anIntArray183[local4]) });
				}
				arg0.anInt2653 = 1;
			}
		} else if (local4 == 203) {
			local97 = Static5.anInt346;
			if (Static15.anInt524 != 2) {
				local97 = 0;
			}
			arg0.anInt2659 = local97 * 15 + 20;
			if (arg0.anInt2600 >= arg0.anInt2659) {
				arg0.anInt2659 = arg0.anInt2600 + 1;
			}
		} else if (local4 >= 401 && local4 <= 500) {
			local4 -= 401;
			if (local4 == 0 && Static15.anInt524 == 0) {
				arg0.anInt2653 = 0;
				arg0.aClass5_1183 = Static106.aClass5_1246;
			} else if (local4 == 1 && Static15.anInt524 == 0) {
				arg0.aClass5_1183 = Static40.aClass5_515;
				arg0.anInt2653 = 0;
			} else {
				local97 = Static17.anInt616;
				if (Static15.anInt524 == 0) {
					local97 = 0;
				}
				if (local97 <= local4) {
					arg0.aClass5_1183 = Static110.aClass5_1307;
					arg0.anInt2653 = 0;
				} else {
					arg0.aClass5_1183 = Static82.method1301(Static56.aLongArray4[local4]).method147();
					arg0.anInt2653 = 1;
				}
			}
		} else if (local4 == 503) {
			arg0.anInt2659 = Static17.anInt616 * 15 + 20;
			if (arg0.anInt2600 >= arg0.anInt2659) {
				arg0.anInt2659 = arg0.anInt2600 + 1;
			}
		} else if (local4 == 324) {
			if (Static108.anInt2845 == -1) {
				Static32.anInt923 = arg0.anInt2615;
				Static108.anInt2845 = arg0.anInt2657;
			}
			if (Static27.aClass48_1.aBoolean88) {
				arg0.anInt2657 = Static108.anInt2845;
			} else {
				arg0.anInt2657 = Static32.anInt923;
			}
		} else if (local4 == 325) {
			if (Static108.anInt2845 == -1) {
				Static32.anInt923 = arg0.anInt2615;
				Static108.anInt2845 = arg0.anInt2657;
			}
			if (Static27.aClass48_1.aBoolean88) {
				arg0.anInt2657 = Static32.anInt923;
			} else {
				arg0.anInt2657 = Static108.anInt2845;
			}
		} else if (local4 == 327) {
			arg0.anInt2661 = 150;
			arg0.anInt2598 = (int) (Math.sin((double) Static3.anInt289 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2594 = 5;
			arg0.anInt2608 = 0;
		} else if (local4 == 328) {
			arg0.anInt2661 = 150;
			arg0.anInt2598 = (int) (Math.sin((double) Static3.anInt289 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2594 = 5;
			arg0.anInt2608 = 1;
		} else if (local4 == 600) {
			arg0.aClass5_1183 = Static75.method1261(new Class5[] { Static110.aClass5_1306, Static5.aClass5_112 });
		} else if (local4 == 620) {
			if (anInt363 < 1) {
				arg0.aClass5_1183 = Static110.aClass5_1307;
			} else if (Static103.aBoolean140) {
				arg0.aClass5_1183 = Static61.aClass5_780;
				arg0.anInt2645 = 16711680;
			} else {
				arg0.aClass5_1183 = Static11.aClass5_181;
				arg0.anInt2645 = 16777215;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method200() {
		try {
			@Pc(2) Graphics local2 = Static62.aCanvas1.getGraphics();
			Static38.aClass2_7.method1322(local2, 17, 357);
		} catch (@Pc(10) Exception local10) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method201() {
		@Pc(12) int local12;
		if (Static24.anInt741 > 0) {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static24.anInt741 > 768) {
					Static42.anIntArray140[local12] = Static83.method1323(Static22.anIntArray90[local12], 1024 - Static24.anInt741, Static32.anIntArray117[local12]);
				} else if (Static24.anInt741 > 256) {
					Static42.anIntArray140[local12] = Static32.anIntArray117[local12];
				} else {
					Static42.anIntArray140[local12] = Static83.method1323(Static32.anIntArray117[local12], 256 - Static24.anInt741, Static22.anIntArray90[local12]);
				}
			}
		} else if (Static72.anInt1864 <= 0) {
			for (local12 = 0; local12 < 256; local12++) {
				Static42.anIntArray140[local12] = Static22.anIntArray90[local12];
			}
		} else {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static72.anInt1864 > 768) {
					Static42.anIntArray140[local12] = Static83.method1323(Static22.anIntArray90[local12], 1024 - Static72.anInt1864, Static42.anIntArray141[local12]);
				} else if (Static72.anInt1864 > 256) {
					Static42.anIntArray140[local12] = Static42.anIntArray141[local12];
				} else {
					Static42.anIntArray140[local12] = Static83.method1323(Static42.anIntArray141[local12], 256 - Static72.anInt1864, Static22.anIntArray90[local12]);
				}
			}
		}
		for (local12 = 0; local12 < 33920; local12++) {
			Static47.aClass2_9.anIntArray228[local12] = Static82.aClass3_Sub1_Sub2_Sub3_4.anIntArray237[local12];
		}
		@Pc(165) int local165 = 0;
		@Pc(167) int local167 = 1152;
		@Pc(187) int local187;
		@Pc(197) int local197;
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(218) int local218;
		@Pc(213) int local213;
		for (@Pc(169) int local169 = 1; local169 < 255; local169++) {
			@Pc(182) int local182 = (256 - local169) * Static61.anIntArray200[local169] / 256;
			local187 = local182 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			local165 += local187;
			for (local197 = local187; local197 < 128; local197++) {
				local204 = Static115.anIntArray381[local165++];
				if (local204 == 0) {
					local167++;
				} else {
					local208 = local204;
					local213 = Static47.aClass2_9.anIntArray228[local167];
					local218 = 256 - local204;
					local204 = Static42.anIntArray140[local204];
					Static47.aClass2_9.anIntArray228[local167++] = (local208 * (local204 & 0xFF00) + local218 * (local213 & 0xFF00) & 0xFF0000) + (local208 * (local204 & 0xFF00FF) + (local218 * (local213 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local167 += local187;
		}
		local165 = 0;
		for (local187 = 0; local187 < 33920; local187++) {
			Static113.aClass2_26.anIntArray228[local187] = Static100.aClass3_Sub1_Sub2_Sub3_5.anIntArray237[local187];
		}
		local167 = 1176;
		for (local197 = 1; local197 < 255; local197++) {
			local204 = (256 - local197) * Static61.anIntArray200[local197] / 256;
			local208 = 103 - local204;
			local167 += local204;
			for (local218 = 0; local218 < local208; local218++) {
				local213 = Static115.anIntArray381[local165++];
				if (local213 == 0) {
					local167++;
				} else {
					@Pc(339) int local339 = local213;
					@Pc(343) int local343 = 256 - local213;
					local213 = Static42.anIntArray140[local213];
					@Pc(352) int local352 = Static113.aClass2_26.anIntArray228[local167];
					Static113.aClass2_26.anIntArray228[local167++] = ((local213 & 0xFF00FF) * local339 + local343 * (local352 & 0xFF00FF) & 0xFF00FF00) + (local343 * (local352 & 0xFF00) + local339 * (local213 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local167 += 128 - local208 - local204;
			local165 += 128 - local208;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method202() {
		aClass5_119 = null;
		aClass21_1 = null;
		aClass5_118 = null;
	}
}
