import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array3;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_8;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!dd;")
	public static Class4_Sub8 aClass4_Sub8_7;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "J")
	public static volatile long aLong22 = 0L;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public static int anInt536 = 0;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt537 = 2;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_203 = Static134.method2017("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_204 = Static134.method2017(" ");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIB)V")
	public static void method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			for (local16 = 0; local16 < 8; local16++) {
				Static66.anIntArrayArrayArray3[arg1][arg0 + local12][arg2 + local16] = 0;
			}
		}
		if (arg0 > 0) {
			for (local16 = 1; local16 < 8; local16++) {
				Static66.anIntArrayArrayArray3[arg1][arg0][arg2 + local16] = Static66.anIntArrayArrayArray3[arg1][arg0 - 1][arg2 + local16];
			}
		}
		if (arg2 > 0) {
			for (local16 = 1; local16 < 8; local16++) {
				Static66.anIntArrayArrayArray3[arg1][arg0 + local16][arg2] = Static66.anIntArrayArrayArray3[arg1][local16 + arg0][arg2 - 1];
			}
		}
		if (arg0 > 0 && Static66.anIntArrayArrayArray3[arg1][arg0 - 1][arg2] != 0) {
			Static66.anIntArrayArrayArray3[arg1][arg0][arg2] = Static66.anIntArrayArrayArray3[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && Static66.anIntArrayArrayArray3[arg1][arg0][arg2 - 1] != 0) {
			Static66.anIntArrayArrayArray3[arg1][arg0][arg2] = Static66.anIntArrayArrayArray3[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && Static66.anIntArrayArrayArray3[arg1][arg0 - 1][arg2 - 1] != 0) {
			Static66.anIntArrayArrayArray3[arg1][arg0][arg2] = Static66.anIntArrayArrayArray3[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!wc;[B[Lclient!na;III)V")
	public static void method348(@OriginalArg(0) Class81 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class50[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class4_Sub10 local15 = new Class4_Sub10(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method568();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method568();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(49) int local49 = local29 >> 12;
				@Pc(55) int local55 = local29 >> 6 & 0x3F;
				@Pc(59) int local59 = local15.method599();
				@Pc(63) int local63 = local59 & 0x3;
				@Pc(67) int local67 = arg3 + local55;
				@Pc(71) int local71 = local59 >> 2;
				@Pc(76) int local76 = local45 + arg4;
				if (local67 > 0 && local76 > 0 && local67 < 103 && local76 < 103) {
					@Pc(93) Class50 local93 = null;
					@Pc(95) int local95 = local49;
					if ((Static62.aByteArrayArrayArray4[1][local67][local76] & 0x2) == 2) {
						local95 = local49 - 1;
					}
					if (local95 >= 0) {
						local93 = arg2[local95];
					}
					Static88.method1468(local67, arg0, local93, local76, local17, local63, local49, local71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
	public static void method349(@OriginalArg(0) boolean arg0) {
		Static88.aBoolean128 = arg0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(164) int local164;
		@Pc(168) int local168;
		@Pc(172) int local172;
		if (!Static88.aBoolean128) {
			local25 = Static24.aClass4_Sub10_Sub1_1.method604();
			local29 = Static24.aClass4_Sub10_Sub1_1.method593();
			local33 = (Static30.anInt1437 - Static24.aClass4_Sub10_Sub1_1.anInt931) / 16;
			Static47.anIntArrayArray12 = new int[local33][4];
			for (local38 = 0; local38 < local33; local38++) {
				for (local42 = 0; local42 < 4; local42++) {
					Static47.anIntArrayArray12[local38][local42] = Static24.aClass4_Sub10_Sub1_1.method557();
				}
			}
			local42 = Static24.aClass4_Sub10_Sub1_1.method593();
			local46 = Static24.aClass4_Sub10_Sub1_1.method596();
			@Pc(395) boolean local395 = false;
			local53 = Static24.aClass4_Sub10_Sub1_1.method593();
			Static94.anIntArray308 = new int[local33];
			Static106.anIntArray328 = new int[local33];
			Static96.anIntArray314 = new int[local33];
			if ((local42 / 8 == 48 || local42 / 8 == 49) && (local25 / 8) == 48) {
				local395 = true;
			}
			Static34.aByteArrayArray2 = new byte[local33][];
			if (local42 / 8 == 48 && local25 / 8 == 148) {
				local395 = true;
			}
			Static41.aByteArrayArray4 = new byte[local33][];
			local33 = 0;
			for (local164 = (local42 - 6) / 8; local164 <= (local42 + 6) / 8; local164++) {
				for (local168 = (local25 - 6) / 8; local168 <= (local25 + 6) / 8; local168++) {
					local172 = (local164 << 8) + local168;
					if (!local395 || local168 != 49 && local168 != 149 && local168 != 147 && local164 != 50 && (local164 != 49 || local168 != 47)) {
						Static96.anIntArray314[local33] = local172;
						Static94.anIntArray308[local33] = Static7.aClass17_Sub1_3.method299(Static59.method1017(new Class76[] { Static125.aClass76_1281, Static63.method1092(local164), Static132.aClass76_1320, Static63.method1092(local168) }));
						Static106.anIntArray328[local33] = Static7.aClass17_Sub1_3.method299(Static59.method1017(new Class76[] { Static120.aClass76_1222, Static63.method1092(local164), Static132.aClass76_1320, Static63.method1092(local168) }));
						local33++;
					}
				}
			}
			Static52.method944(local42, local53, local46, local29, local25);
			return;
		}
		local25 = Static24.aClass4_Sub10_Sub1_1.method563();
		local29 = Static24.aClass4_Sub10_Sub1_1.method563();
		local33 = Static24.aClass4_Sub10_Sub1_1.method593();
		Static24.aClass4_Sub10_Sub1_1.method613();
		for (local38 = 0; local38 < 4; local38++) {
			for (local42 = 0; local42 < 13; local42++) {
				for (local46 = 0; local46 < 13; local46++) {
					local53 = Static24.aClass4_Sub10_Sub1_1.method608(1);
					if (local53 == 1) {
						Static48.anIntArrayArrayArray2[local38][local42][local46] = Static24.aClass4_Sub10_Sub1_1.method608(26);
					} else {
						Static48.anIntArrayArrayArray2[local38][local42][local46] = -1;
					}
				}
			}
		}
		Static24.aClass4_Sub10_Sub1_1.method606();
		local42 = (Static30.anInt1437 - Static24.aClass4_Sub10_Sub1_1.anInt931) / 16;
		Static47.anIntArrayArray12 = new int[local42][4];
		for (local46 = 0; local46 < local42; local46++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static47.anIntArrayArray12[local46][local53] = Static24.aClass4_Sub10_Sub1_1.method557();
			}
		}
		local53 = Static24.aClass4_Sub10_Sub1_1.method598();
		@Pc(145) int local145 = Static24.aClass4_Sub10_Sub1_1.method563();
		Static41.aByteArrayArray4 = new byte[local42][];
		Static106.anIntArray328 = new int[local42];
		Static96.anIntArray314 = new int[local42];
		Static94.anIntArray308 = new int[local42];
		Static34.aByteArrayArray2 = new byte[local42][];
		local42 = 0;
		for (local164 = 0; local164 < 4; local164++) {
			for (local168 = 0; local168 < 13; local168++) {
				for (local172 = 0; local172 < 13; local172++) {
					@Pc(182) int local182 = Static48.anIntArrayArrayArray2[local164][local168][local172];
					if (local182 != -1) {
						@Pc(192) int local192 = local182 >> 14 & 0x3FF;
						@Pc(198) int local198 = local182 >> 3 & 0x7FF;
						@Pc(208) int local208 = (local192 / 8 << 8) + local198 / 8;
						for (@Pc(210) int local210 = 0; local210 < local42; local210++) {
							if (local208 == Static96.anIntArray314[local210]) {
								local208 = -1;
								break;
							}
						}
						if (local208 != -1) {
							@Pc(238) int local238 = local208 >> 8 & 0xFF;
							Static96.anIntArray314[local42] = local208;
							@Pc(246) int local246 = local208 & 0xFF;
							Static94.anIntArray308[local42] = Static7.aClass17_Sub1_3.method299(Static59.method1017(new Class76[] { Static125.aClass76_1281, Static63.method1092(local238), Static132.aClass76_1320, Static63.method1092(local246) }));
							Static106.anIntArray328[local42] = Static7.aClass17_Sub1_3.method299(Static59.method1017(new Class76[] { Static120.aClass76_1222, Static63.method1092(local238), Static132.aClass76_1320, Static63.method1092(local246) }));
							local42++;
						}
					}
				}
			}
		}
		Static52.method944(local29, local145, local53, local25, local33);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
	public static void method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static45.method816(arg3)) {
			Static5.method71(-1, arg0, arg4, arg2, Static29.aClass4_Sub8ArrayArray1[arg3], arg6, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method351() {
		aClass4_Sub4_Sub5_Sub2Array3 = null;
		aClass76_204 = null;
		aClass4_Sub8_7 = null;
		aClass76_203 = null;
		aClass17_Sub1_8 = null;
	}
}
