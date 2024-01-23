import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
	public static int anInt1520;

	@OriginalMember(owner = "client!gg", name = "hb", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIBII)V")
	public static void method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static129.anInt2903 < 100) {
			Static213.method3548();
		}
		Static96.method1612(arg1, arg2, arg1 + arg3, arg0 + arg2);
		@Pc(29) int local29;
		@Pc(41) int local41;
		if (Static129.anInt2903 < 100) {
			local29 = arg1 + arg3 / 2;
			local41 = arg0 / 2 + arg2 - 18 - 20;
			Static96.method1623(arg1, arg2, arg3, arg0, 0);
			Static96.method1633(local29 - 152, local41, 304, 34, 9179409);
			Static96.method1633(local29 - 151, local41 + 1, 302, 32, 0);
			Static96.method1623(local29 - 150, local41 + 2, Static129.anInt2903 * 3, 30, 9179409);
			Static96.method1623(Static129.anInt2903 * 3 + local29 - 150, local41 + 2, 300 - Static129.anInt2903 * 3, 30, 0);
			Static80.aClass1_Sub2_Sub11_2.method2042(Static142.aClass51_1106, local29, local41 + 20, 16777215, -1);
			return;
		}
		Static93.anInt2067 = Static87.anInt2015 - (int) ((double) arg3 / Static10.aDouble1);
		Static195.anInt2640 = Static150.anInt3286 - (int) ((double) arg0 / Static10.aDouble1);
		Static93.anInt2064 = (int) ((double) (arg0 * 2) / Static10.aDouble1);
		Static23.anInt599 = (int) ((double) (arg3 * 2) / Static10.aDouble1);
		@Pc(148) int local148 = Static87.anInt2015 - (int) ((double) arg3 / Static10.aDouble1);
		local29 = Static150.anInt3286 - (int) ((double) arg0 / Static10.aDouble1);
		local41 = (int) ((double) arg3 / Static10.aDouble1) + Static87.anInt2015;
		@Pc(173) int local173 = Static150.anInt3286 + (int) ((double) arg0 / Static10.aDouble1);
		method1164(local41, arg2, local29, arg0 + arg2, arg1 - -arg3, local148, arg1, local173);
		Static25.method502(local29, arg2, local148, arg1 + arg3, arg2 + arg0, local41, local173, arg1);
		if (Static198.anInt4218 > 0) {
			Static198.anInt4218--;
		}
		if (!Static48.aBoolean56) {
			return;
		}
		@Pc(222) int local222 = arg3 + arg1 - 5;
		@Pc(228) int local228 = arg2 + arg0 - 8;
		Static52.aClass1_Sub2_Sub11_1.method2021(Static150.method2574(new Class51[] { Static62.aClass51_438, Static27.method511(Static132.anInt2984) }), local222, local228, 16776960, -1);
		@Pc(249) int local249 = local228 - 15;
		@Pc(251) int local251 = 16776960;
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(263) int local263 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		if (local263 > 65536) {
			local251 = 16711680;
		}
		Static52.aClass1_Sub2_Sub11_1.method2021(Static150.method2574(new Class51[] { Static53.aClass51_380, Static27.method511(local263), Static86.aClass51_638 }), local222, local249, local251, -1);
		local228 = local249 - 15;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!mb;II)[Lclient!te;")
	public static Class1_Sub2_Sub1[] method1162(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1) {
		return Static36.method640(arg1, arg0) ? Static136.method2048() : null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
	public static int method1163(@OriginalArg(1) KeyEvent arg0) {
		@Pc(14) int local14 = arg0.getKeyChar();
		if (local14 == 8364) {
			return 128;
		} else {
			if (local14 <= 0 || local14 >= 256) {
				local14 = -1;
			}
			return local14;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method1164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) int local6 = arg0 - arg5;
		@Pc(20) int local20 = arg7 - arg2;
		@Pc(29) int local29 = (arg3 - arg1 << 16) / local20;
		if (Static87.anInt2017 > arg7) {
			local20++;
		}
		@Pc(42) int local42 = (arg4 - arg6 << 16) / local6;
		if (Static3.anInt75 > arg0) {
			local6++;
		}
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(69) int local69;
		@Pc(80) int local80;
		@Pc(114) int local114;
		@Pc(130) int local130;
		for (@Pc(48) int local48 = 0; local48 < local6; local48++) {
			local56 = local48 * local42 >> 16;
			local64 = (local48 + 1) * local42 >> 16;
			local69 = local64 - local56;
			if (local69 > 0) {
				local80 = arg5 + local48 >> 6;
				local56 += arg6;
				@Pc(88) byte[][] local88 = Static7.aByteArrayArrayArray1[local80];
				local64 += arg6;
				@Pc(96) int[][] local96 = Static198.anIntArrayArrayArray10[local80];
				@Pc(100) byte[][] local100 = Static72.aByteArrayArrayArray7[local80];
				@Pc(104) byte[][] local104 = Static203.aByteArrayArrayArray11[local80];
				@Pc(108) byte[][] local108 = Static71.aByteArrayArrayArray6[local80];
				@Pc(112) byte[][] local112 = Static50.aByteArrayArrayArray5[local80];
				for (local114 = 0; local114 < local20; local114++) {
					@Pc(124) int local124 = (local114 + 1) * local29 >> 16;
					local130 = local114 * local29 >> 16;
					@Pc(135) int local135 = local124 - local130;
					if (local135 > 0) {
						local130 += arg1;
						local124 += arg1;
						@Pc(152) int local152 = local114 + arg2 >> 6;
						@Pc(158) int local158 = local114 + arg2 & 0x3F;
						@Pc(165) int local165 = local48 + arg5 & 0x3F;
						@Pc(171) int local171 = local165 + (local158 << 6);
						@Pc(207) int local207;
						@Pc(181) int local181;
						@Pc(187) int local187;
						if (local96[local152] == null) {
							local181 = arg5 + local48 & 0x4;
							local187 = arg2 + local114 & 0x4;
							if (local181 < 2 && local187 > 2 || local181 > 2 && local187 < 2) {
								local207 = 4936552;
							} else {
								local207 = Static82.anIntArray115[Static193.anInt4186 + 1];
							}
						} else {
							local207 = local96[local152][local171];
						}
						if (local207 == 0) {
							local207 = 1;
						}
						local181 = local88[local152] == null ? 0 : Static82.anIntArray115[local88[local152][local171] & 0xFF];
						local187 = local104[local152] == null ? 0 : Static82.anIntArray115[local104[local152][local171] & 0xFF];
						@Pc(303) int local303;
						if (local181 == 0 && local187 == 0) {
							Static96.method1623(local56, local130, local69, local135, local207);
						} else {
							@Pc(299) byte local299;
							if (local181 != 0) {
								if (local181 == -1) {
									local181 = 1;
								}
								local299 = local100[local152] == null ? 0 : local100[local152][local171];
								local303 = local299 & 0xFC;
								if (local303 == 0 || local69 <= 1 || local135 <= 1) {
									Static96.method1623(local56, local130, local69, local135, local181);
								} else {
									Static201.method3305(local299 & 0x3, true, local56, local130, local207, local303 >> 2, local135, local181, Static96.anIntArray137, local69);
								}
							}
							if (local187 != 0) {
								local299 = local108[local152][local171];
								if (local187 == -1) {
									local187 = local207;
								}
								local303 = local299 & 0xFC;
								if (local303 == 0 || local69 <= 1 || local135 <= 1) {
									Static96.method1623(local56, local130, local69, local135, local187);
								}
								Static201.method3305(local299 & 0x3, local181 == 0, local56, local130, 0, local303 >> 2, local135, local187, Static96.anIntArray137, local69);
							}
						}
						if (local112[local152] != null) {
							@Pc(414) int local414 = local112[local152][local171] & 0xFF;
							if (local414 != 0) {
								if (local69 == 1) {
									local303 = local56;
								} else {
									local303 = local64 - 1;
								}
								@Pc(439) int local439;
								if (local135 == 1) {
									local439 = local130;
								} else {
									local439 = local124 - 1;
								}
								@Pc(447) int local447 = 13421772;
								if (local414 >= 5 && local414 <= 8 || local414 >= 13 && local414 <= 16 || local414 >= 21 && local414 <= 24 || local414 == 27 || local414 == 28) {
									local414 -= 4;
									local447 = 13369344;
								}
								if (local414 == 1) {
									Static96.method1627(local56, local130, local135, local447);
								} else if (local414 == 2) {
									Static96.method1622(local56, local130, local69, local447);
								} else if (local414 == 3) {
									Static96.method1627(local303, local130, local135, local447);
								} else if (local414 == 4) {
									Static96.method1622(local56, local439, local69, local447);
								} else if (local414 == 9) {
									Static96.method1627(local56, local130, local135, 16777215);
									Static96.method1622(local56, local130, local69, local447);
								} else if (local414 == 10) {
									Static96.method1627(local303, local130, local135, 16777215);
									Static96.method1622(local56, local130, local69, local447);
								} else if (local414 == 11) {
									Static96.method1627(local303, local130, local135, 16777215);
									Static96.method1622(local56, local439, local69, local447);
								} else if (local414 == 12) {
									Static96.method1627(local56, local130, local135, 16777215);
									Static96.method1622(local56, local439, local69, local447);
								} else if (local414 == 17) {
									Static96.method1622(local56, local130, 1, local447);
								} else if (local414 == 18) {
									Static96.method1622(local303, local130, 1, local447);
								} else if (local414 == 19) {
									Static96.method1622(local303, local439, 1, local447);
								} else if (local414 == 20) {
									Static96.method1622(local56, local439, 1, local447);
								} else {
									@Pc(587) int local587;
									if (local414 == 25) {
										for (local587 = 0; local587 < local135; local587++) {
											Static96.method1622(local56 + local587, local439 - local587, 1, local447);
										}
									} else if (local414 == 26) {
										for (local587 = 0; local587 < local135; local587++) {
											Static96.method1622(local56 + local587, local587 + local130, 1, local447);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local56 = 0; local56 < local6; local56++) {
			local64 = local56 * local42 >> 16;
			local69 = local42 * (local56 + 1) >> 16;
			local80 = local69 - local64;
			if (local80 > 0) {
				local64 += arg6;
				@Pc(727) byte[][] local727 = Static201.aByteArrayArrayArray12[arg5 + local56 >> 6];
				for (@Pc(729) int local729 = 0; local729 < local20; local729++) {
					@Pc(739) int local739 = local29 * (local729 + 1) >> 16;
					@Pc(745) int local745 = local729 * local29 >> 16;
					@Pc(749) int local749 = local739 - local745;
					if (local749 > 0) {
						@Pc(761) int local761 = local729 + arg2 >> 6;
						local114 = ((arg2 + local729 & 0x3F) << 6) + (local56 + arg5 & 0x3F);
						local745 += arg1;
						if (local727[local761] != null) {
							local130 = local727[local761][local114] & 0xFF;
							if (local130 != 0) {
								if (local130 == 47 || local130 == 53) {
									Static187.aClass41_Sub1Array2[local130 - 1].method974(local64, local745, local80 * 2 + 1, local749 * 2 + 1);
								} else {
									Static187.aClass41_Sub1Array2[local130 - 1].method974(local64 - local80 / 2, local745 - local749 / 2, local80 * 2, local749 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBILclient!mb;)Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1 method1165(@OriginalArg(2) int arg0, @OriginalArg(3) Class70 arg1) {
		return Static36.method640(arg0, arg1) ? Static164.method2801() : null;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Z")
	public static boolean method1166(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
	public static void method1167() {
		if (Static167.anIntArray244 != null && Static49.anIntArray67 != null) {
			return;
		}
		Static49.anIntArray67 = new int[256];
		Static167.anIntArray244 = new int[256];
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(35) double local35 = (double) local26 / 255.0D * 6.283185307179586D;
			Static167.anIntArray244[local26] = (int) (Math.sin(local35) * 4096.0D);
			Static49.anIntArray67[local26] = (int) (Math.cos(local35) * 4096.0D);
		}
	}
}
