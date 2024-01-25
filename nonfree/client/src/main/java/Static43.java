import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bia", name = "Q", descriptor = "I")
	public static int anInt1024;

	@OriginalMember(owner = "client!bia", name = "W", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(IB)Z")
	public static boolean method1102(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!ha;ZIB)Lclient!vga;")
	public static Class368 method1103(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static532.anIntArray747 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static532.anIntArray747.length; local15++) {
				if (Static532.anIntArray747[local15] == arg2) {
					return Static7.aClass368Array1[local15];
				}
			}
		}
		@Pc(44) Class368 local44 = (Class368) Static441.aClass165_50.method4389((long) arg2);
		if (local44 != null) {
			if (arg1 && local44.aClass88_21 == null) {
				@Pc(58) Class88 local58 = Static629.method8788(Static330.aClass15_88, arg2);
				if (local58 == null) {
					return null;
				}
				local44.aClass88_21 = local58;
			}
			return local44;
		}
		@Pc(71) Class97[] local71 = Static682.method2747(Static81.aClass15_24, arg2);
		if (local71 == null) {
			return null;
		}
		@Pc(85) Class88 local85 = Static629.method8788(Static330.aClass15_88, arg2);
		if (local85 == null) {
			return null;
		}
		if (arg1) {
			local44 = new Class368(arg0.method8515(local85, local71), local85);
		} else {
			local44 = new Class368(arg0.method8515(local85, local71));
		}
		Static441.aClass165_50.method4392(local44, (long) arg2);
		return local44;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IBI)B")
	public static byte method1104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IILclient!ha;III)V")
	public static void method1105(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg2, arg0, arg2 + arg3, arg4 + arg0);
		arg1.method8452(arg3, arg0, arg4, arg2, -16777216);
		if (Static677.anInt10890 < 100) {
			return;
		}
		@Pc(39) float local39 = (float) Static317.anInt5405 / (float) Static317.anInt5410;
		@Pc(41) int local41 = arg3;
		@Pc(43) int local43 = arg4;
		if (local39 < 1.0F) {
			local43 = (int) ((float) arg3 * local39);
		} else {
			local41 = (int) ((float) arg4 / local39);
		}
		@Pc(69) int local69 = arg0 + (arg4 - local43) / 2;
		@Pc(78) int local78 = arg2 + (arg3 - local41) / 2;
		if (Static27.aClass33_1 == null || arg3 != Static27.aClass33_1.method7659() || arg4 != Static27.aClass33_1.method7662()) {
			Static317.method4958(Static317.anInt5409, Static317.anInt5405 + Static317.anInt5403, Static317.anInt5409 - -Static317.anInt5410, Static317.anInt5403, local78, local69, local41 + local78, local43 + local69);
			Static317.method4940(arg1);
			Static27.aClass33_1 = arg1.method8526(local78, local69, local41, local43, false);
		}
		Static27.aClass33_1.method7654(local78, local69);
		@Pc(134) int local134 = Static64.anInt1275 * local41 / Static317.anInt5410;
		@Pc(140) int local140 = Static412.anInt6583 * local43 / Static317.anInt5405;
		@Pc(148) int local148 = local78 + Static329.anInt5476 * local41 / Static317.anInt5410;
		@Pc(161) int local161 = local43 + local69 - Static186.anInt3784 * local43 / Static317.anInt5405 - local140;
		@Pc(163) int local163 = -1996554240;
		if (Static68.aClass118_3 == Static55.aClass118_2) {
			local163 = -1996488705;
		}
		arg1.aa(local148, local161, local134, local140, local163, 1);
		arg1.method8511(local148, local161, local134, local140, local163, 0);
		if (Static122.anInt2525 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (anInt1024 > 50) {
			local198 = (100 - anInt1024) * 5;
		} else {
			local198 = anInt1024 * 5;
		}
		for (@Pc(209) Class3_Sub18 local209 = (Class3_Sub18) Static317.aClass338_136.method8177(); local209 != null; local209 = (Class3_Sub18) Static317.aClass338_136.method8168()) {
			@Pc(217) Class308 local217 = Static317.aClass27_3.method693(local209.anInt2277);
			if (Static512.method7227(local217)) {
				@Pc(234) int local234;
				@Pc(246) int local246;
				if (Static246.anInt4481 == local209.anInt2277) {
					local234 = local41 * local209.anInt2283 / Static317.anInt5410 + local78;
					local246 = local69 + (Static317.anInt5405 - local209.anInt2278) * local43 / Static317.anInt5405;
					arg1.method8452(4, local246 - 2, 4, local234 - 2, local198 << 24 | 0xFFFF00);
				} else if (Static30.anInt575 != -1 && local217.anInt8782 == Static30.anInt575) {
					local234 = local41 * local209.anInt2283 / Static317.anInt5410 + local78;
					local246 = local69 + (Static317.anInt5405 - local209.anInt2278) * local43 / Static317.anInt5405;
					arg1.method8452(4, local246 - 2, 4, local234 - 2, local198 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILclient!saa;Z)V")
	public static void method1106(@OriginalArg(0) int arg0, @OriginalArg(1) Class312 arg1) {
		if (Static269.aBoolean354) {
			arg0 = 0;
			Static269.aBoolean354 = false;
		}
		if (Static665.aClass312_2 != null && Static665.aClass312_2.method7738(arg1)) {
			return;
		}
		Static665.aClass312_2 = arg1;
		Static604.aLong290 = Static524.method7320();
		Static178.anInt3512 = arg0;
		Static17.anInt432 = arg0;
		if (Static17.anInt432 != 0) {
			Static107.aFloat67 = Static113.aFloat70;
			Static109.anInt2257 = Static297.anInt4985;
			Static550.anInt9003 = Static438.anInt6925;
			Static237.aFloat98 = Static674.aFloat227;
			Static80.aFloat201 = Static37.aFloat34;
			Static227.aFloat94 = Static273.aFloat103;
			Static580.aFloat200 = Static640.aFloat210;
			Static342.aClass35_2 = Static631.aClass35_4;
			Static634.aFloat209 = Static544.aFloat195;
			Static460.anInt7597 = Static486.anInt8044;
			return;
		}
		Static431.method6192();
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I[B)V")
	public static void method1107(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(arg0);
		@Pc(20) boolean local20 = false;
		while (true) {
			while (true) {
				@Pc(24) int local24 = local10.method8632();
				if (local24 == 0) {
					if (local20) {
						return;
					}
					if (Static192.anIntArray340 == null) {
						Static467.anInt7681 = 4;
						Static382.anIntArray530 = new int[4];
						Static192.anIntArray340 = new int[4];
					}
					for (local24 = 0; local24 < Static192.anIntArray340.length; local24++) {
						Static192.anIntArray340[local24] = 0;
						Static382.anIntArray530[local24] = local24 * 20;
					}
					return;
				}
				if (local24 == 1) {
					if (Static192.anIntArray340 == null) {
						Static467.anInt7681 = 4;
						Static192.anIntArray340 = new int[4];
						Static382.anIntArray530 = new int[4];
					}
					local20 = true;
					for (@Pc(45) int local45 = 0; local45 < Static192.anIntArray340.length; local45++) {
						Static192.anIntArray340[local45] = local10.method8589();
						Static382.anIntArray530[local45] = local10.method8589();
					}
				} else if (local24 == 2) {
					Static366.anInt5930 = local10.method8593();
				} else if (local24 == 3) {
					Static467.anInt7681 = local10.method8632();
					Static192.anIntArray340 = new int[Static467.anInt7681];
					Static382.anIntArray530 = new int[Static467.anInt7681];
				}
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BIZIII)V")
	public static void method1108(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static15.aClass164ArrayArrayArray5 == null) {
			Static674.aClass13_22.method8452(arg3, arg2, arg4, arg0, -16777216);
		} else if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >= 0 && Static158.anInt927 * 512 > Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >= 0 && Static515.anInt8292 * 512 > Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731) {
			Static58.anInt1217++;
			if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 != null && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 - (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() - 1) * 256 >> 9 == Static661.anInt10551 && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 - (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() - 1) * 256 >> 9 == Static514.anInt8261) {
				Static661.anInt10551 = -1;
				Static514.anInt8261 = -1;
				Static518.method7283();
			}
			Static581.method7251();
			if (!arg1) {
				Static218.method3776();
			}
			Static15.method7457();
			Static210.method7896(arg3, arg4, arg0, arg2, true);
			@Pc(112) int local112 = Static235.anInt4338;
			@Pc(114) int local114 = Static509.anInt8221;
			@Pc(116) int local116 = Static669.anInt10705;
			@Pc(118) int local118 = Static180.anInt3540;
			Static675.anInt10880 = Static675.anInt10879;
			@Pc(126) int local126;
			@Pc(163) int local163;
			if (Static428.anInt6834 == 1) {
				local126 = (int) Static667.aFloat212;
				if (local126 < Static106.anInt2202 >> 8) {
					local126 = Static106.anInt2202 >> 8;
				}
				if (Class300.lb[4] && local126 < Static460.anIntArray646[4] + 128) {
					local126 = Static460.anIntArray646[4] + 128;
				}
				local163 = (int) Static618.aFloat207 + Static173.anInt3446 & 0x3FFF;
				Static143.method2623(Static350.anInt5703, local163, Static168.method3058(Static309.anInt5138, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731) - 200, local126, local114, Static474.anInt7824, (local126 >> 3) * 3 + 600 << 2);
			} else if (Static428.anInt6834 == 4) {
				local126 = (int) Static667.aFloat212;
				if (Static106.anInt2202 >> 8 > local126) {
					local126 = Static106.anInt2202 >> 8;
				}
				if (Class300.lb[4] && Static460.anIntArray646[4] + 128 > local126) {
					local126 = Static460.anIntArray646[4] + 128;
				}
				local163 = (int) Static618.aFloat207 & 0x3FFF;
				Static143.method2623(Static350.anInt5703, local163, Static168.method3058(Static309.anInt5138, Static294.anInt6316, Static96.anInt1798) - 200, local126, local114, Static474.anInt7824, (local126 >> 3) * 3 + 600 << 2);
			} else if (Static428.anInt6834 == 5) {
				Static621.method8754(local114);
			}
			local126 = Static509.anInt8222;
			local163 = Static146.anInt2945;
			@Pc(268) int local268 = Static652.anInt10382;
			@Pc(270) int local270 = Static520.anInt8367;
			@Pc(272) int local272 = Static57.anInt1188;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Class300.lb[local274]) {
					@Pc(316) int local316 = (int) ((double) -Static564.anIntArray783[local274] + (double) (Static564.anIntArray783[local274] * 2 + 1) * Math.random() + Math.sin((double) Static567.anIntArray520[local274] / 100.0D * (double) Static142.anIntArray232[local274]) * (double) Static460.anIntArray646[local274]);
					if (local274 == 1) {
						Static146.anInt2945 += local316 << 2;
					}
					if (local274 == 3) {
						Static57.anInt1188 = Static57.anInt1188 + local316 & 0x3FFF;
					}
					if (local274 == 2) {
						Static652.anInt10382 += local316 << 2;
					}
					if (local274 == 0) {
						Static509.anInt8222 += local316 << 2;
					}
					if (local274 == 4) {
						Static520.anInt8367 += local316;
						if (Static520.anInt8367 < 1024) {
							Static520.anInt8367 = 1024;
						} else if (Static520.anInt8367 > 3072) {
							Static520.anInt8367 = 3072;
						}
					}
				}
			}
			if (Static509.anInt8222 < 0) {
				Static509.anInt8222 = 0;
			}
			if (Static652.anInt10382 < 0) {
				Static652.anInt10382 = 0;
			}
			if (Static509.anInt8222 > (Static146.anInt2951 << 9) - 1) {
				Static509.anInt8222 = (Static146.anInt2951 << 9) - 1;
			}
			if (Static652.anInt10382 > (Static602.anInt9668 << 9) - 1) {
				Static652.anInt10382 = (Static602.anInt9668 << 9) - 1;
			}
			Static504.method7167();
			Static523.method7310();
			Static674.aClass13_22.KA(local116, local118, local112 + local116, local114 + local118);
			Static511.method7219(true);
			if (Static82.aBoolean134) {
				Static599.method8396(Static438.anInt6925);
				if (Static539.anInt8890 != Static675.anInt10880) {
					Static27.aBoolean42 = true;
				}
				Static539.anInt8890 = Static675.anInt10880;
			} else {
				Static674.aClass13_22.ya();
				@Pc(451) int local451 = Static438.anInt6925;
				if (Static536.aClass206_5 == null) {
					Static674.aClass13_22.GA(local451);
				} else {
					Static536.aClass206_5.method5248(Static520.anInt8367, Static674.aClass13_22, Static390.anInt10741 << 3, local116, Static57.anInt1188, local112, local118, local114, local451);
				}
			}
			Static72.method1380();
			Static63.aClass239_1.method9237(Static509.anInt8222, Static146.anInt2945, Static652.anInt10382, -Static520.anInt8367 & 0x3FFF, -Static57.anInt1188 & 0x3FFF, -Static631.anInt10060 & 0x3FFF);
			Static674.aClass13_22.method8501(Static63.aClass239_1);
			Static674.aClass13_22.DA(local112 / 2 + local116, local118 + local114 / 2, Static152.anInt3031 << 1, Static152.anInt3031 << 1);
			Static390.method9302(local116 + local112 / 2, local118 - -(local114 / 2), Static152.anInt3031 << 1, Static152.anInt3031 << 1);
			Static541.method7783(-Static520.anInt8367 & 0x3FFF, -Static57.anInt1188 & 0x3FFF, -Static631.anInt10060 & 0x3FFF, Static509.anInt8222, Static652.anInt10382, Static146.anInt2945);
			@Pc(576) byte local576 = Static24.aClass3_Sub22_4.aClass6_Sub25_2.method8119() == 2 ? (byte) Static58.anInt1217 : 1;
			if (Static82.aBoolean134) {
				Static439.method6265(-Static520.anInt8367 & 0x3FFF, -Static631.anInt10060 & 0x3FFF, -Static57.anInt1188 & 0x3FFF);
				Static282.method4520(local576, Static94.anIntArray148, Static146.anInt2945, Static302.aByteArrayArrayArray18, Static652.anInt10382, Static401.anIntArray557, Static675.anInt10880, Static158.anIntArray77, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 + 1, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >> 9, Static580.anIntArray805, Static588.anInt9467, Static24.aClass3_Sub22_4.aClass6_Sub13_1.method4368() == 0, Static287.anIntArray442, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >> 9, Static509.anInt8222);
			} else {
				Static169.method3082(Static588.anInt9467, Static509.anInt8222, Static146.anInt2945, Static652.anInt10382, Static302.aByteArrayArrayArray18, Static401.anIntArray557, Static287.anIntArray442, Static580.anIntArray805, Static94.anIntArray148, Static158.anIntArray77, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 + 1, local576, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >> 9, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >> 9, Static24.aClass3_Sub22_4.aClass6_Sub13_1.method4368() == 0, Static443.aBoolean515 ? Static675.anInt10880 : -1, 0, false);
			}
			Static72.method1380();
			if (Static406.anInt6454 == 10) {
				Static204.method3643(local114, local116, local112, local118);
				Static521.method6956(local118, local116, local114, local112);
				Static356.method5251(local116, local114, local112, local118);
				Static115.method2172(local112, local114, local118, local116);
			}
			Static183.method3398();
			Static146.anInt2945 = local163;
			Static57.anInt1188 = local272;
			Static652.anInt10382 = local268;
			Static509.anInt8222 = local126;
			Static520.anInt8367 = local270;
			if (Static499.aBoolean621 && Static581.aClass341_4.method8304() == 0) {
				Static499.aBoolean621 = false;
			}
			if (Static499.aBoolean621) {
				Static674.aClass13_22.method8452(local112, local118, local114, local116, -16777216);
				Static21.method603(Static504.aClass69_11, Static674.aClass13_22, Static253.aClass88_19, false, Static601.aClass346_14.method8440(Static609.anInt9834));
			}
			Static511.method7219(false);
		} else {
			Static674.aClass13_22.method8452(arg3, arg2, arg4, arg0, -16777216);
		}
	}
}
