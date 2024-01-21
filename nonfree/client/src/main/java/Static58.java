import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ka", name = "yb", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ka", name = "Db", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!ka", name = "Yb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ka", name = "ec", descriptor = "Lclient!he;")
	private static Class26 aClass26_889 = Static6.method100("Please use a different world)3");

	@OriginalMember(owner = "client!ka", name = "rb", descriptor = "Lclient!he;")
	public static Class26 aClass26_886 = aClass26_889;

	@OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!ka", name = "Mb", descriptor = "Lclient!he;")
	public static Class26 aClass26_887 = Static6.method100(")1");

	@OriginalMember(owner = "client!ka", name = "Sb", descriptor = "Lclient!he;")
	public static Class26 aClass26_888 = aClass26_889;

	@OriginalMember(owner = "client!ka", name = "Xb", descriptor = "I")
	public static int anInt1798 = 2;

	@OriginalMember(owner = "client!ka", name = "bc", descriptor = "I")
	public static int anInt1799 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
	public static void method1182(@OriginalArg(1) boolean arg0) {
		if (Static63.aClass76_3 == null) {
			return;
		}
		try {
			@Pc(11) Class3_Sub11 local11 = new Class3_Sub11(4);
			local11.method992(arg0 ? 2 : 3);
			local11.method996(0);
			Static63.aClass76_3.method2185(4, local11.aByteArray13);
		} catch (@Pc(36) IOException local36) {
			try {
				Static63.aClass76_3.method2183();
			} catch (@Pc(41) Exception local41) {
			}
			Static63.aClass76_3 = null;
			Static109.anInt2925++;
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(Z)V")
	public static void method1183() {
		anIntArray173 = null;
		anIntArrayArray14 = null;
		aCanvas1 = null;
		aClass26_886 = null;
		aClass26_888 = null;
		aClass26_889 = null;
		aClass26_887 = null;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
	public static void method1184() {
		Static12.aClass66_2.method1971();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public static void method1185(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static6.aClass3_Sub1_Sub4_Sub3_1.anIntArray308;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = (52736 - local25 * 512) * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static74.aByteArrayArrayArray5[arg0][local40][local25] & 0x18) == 0) {
					Static62.aClass69_1.method2053(local4, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (Static74.aByteArrayArrayArray5[arg0 + 1][local40][local25] & 0x8) != 0) {
					Static62.aClass69_1.method2053(local4, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		local38 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		Static6.aClass3_Sub1_Sub4_Sub3_1.method1742();
		local40 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(146) int local146;
		for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
			for (local146 = 1; local146 < 103; local146++) {
				if ((Static74.aByteArrayArrayArray5[arg0][local146][local142] & 0x18) == 0) {
					Static93.method1690(arg0, local146, local40, local38, local142);
				}
				if (arg0 < 3 && (Static74.aByteArrayArrayArray5[arg0 + 1][local146][local142] & 0x8) != 0) {
					Static93.method1690(arg0 + 1, local146, local40, local38, local142);
				}
			}
		}
		Static46.anInt1411 = 0;
		for (local146 = 0; local146 < 104; local146++) {
			for (@Pc(218) int local218 = 0; local218 < 104; local218++) {
				@Pc(226) int local226 = Static62.aClass69_1.method2017(Static132.anInt3270, local146, local218);
				if (local226 != 0) {
					local226 = local226 >> 14 & 0x7FFF;
					@Pc(239) int local239 = Static4.method68(local226).anInt77;
					if (local239 >= 0) {
						@Pc(243) int local243 = local146;
						@Pc(245) int local245 = local218;
						if (local239 != 22 && local239 != 29 && local239 != 34 && local239 != 36 && local239 != 46 && local239 != 47 && local239 != 48) {
							@Pc(277) int[][] local277 = Static93.aClass4Array1[Static132.anInt3270].anIntArrayArray1;
							for (@Pc(279) int local279 = 0; local279 < 10; local279++) {
								@Pc(286) int local286 = (int) (Math.random() * 4.0D);
								if (local286 == 0 && local243 > 0 && local243 > local146 - 3 && (local277[local243 - 1][local245] & 0x12C0108) == 0) {
									local243--;
								}
								if (local286 == 1 && local243 < 103 && local243 < local146 + 3 && (local277[local243 + 1][local245] & 0x12C0180) == 0) {
									local243++;
								}
								if (local286 == 2 && local245 > 0 && local245 > local218 - 3 && (local277[local243][local245 - 1] & 0x12C0102) == 0) {
									local245--;
								}
								if (local286 == 3 && local245 < 103 && local218 + 3 > local245 && (local277[local243][local245 + 1] & 0x12C0120) == 0) {
									local245++;
								}
							}
						}
						Static13.aClass3_Sub1_Sub4_Sub3Array2[Static46.anInt1411] = Static30.aClass3_Sub1_Sub4_Sub3Array7[local239];
						Static11.anIntArray33[Static46.anInt1411] = local243;
						Static41.anIntArray138[Static46.anInt1411] = local245;
						Static46.anInt1411++;
					}
				}
			}
		}
		Static102.aClass6_1.method883();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!he;I)V")
	public static void method1186(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class26 local11 = arg0.method830().method853();
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < Static62.anInt1885; local23++) {
			@Pc(31) Class3_Sub1_Sub5_Sub1_Sub1 local31 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[Static117.anIntArray370[local23]];
			if (local31 != null && local31.aClass26_393 != null && local31.aClass26_393.method832(local11)) {
				Static100.method2209(1, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], local31.anIntArray325[0], local31.anIntArray326[0], 1, 0, false, 2, 0, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
				local21 = true;
				if (arg1 == 1) {
					Static107.aClass3_Sub11_Sub1_3.method1029(84);
					Static107.aClass3_Sub11_Sub1_3.method972(Static117.anIntArray370[local23]);
				} else if (arg1 == 4) {
					Static107.aClass3_Sub11_Sub1_3.method1029(183);
					Static107.aClass3_Sub11_Sub1_3.method1016(Static117.anIntArray370[local23]);
				} else if (arg1 == 6) {
					Static107.aClass3_Sub11_Sub1_3.method1029(114);
					Static107.aClass3_Sub11_Sub1_3.method972(Static117.anIntArray370[local23]);
				} else if (arg1 == 7) {
					Static107.aClass3_Sub11_Sub1_3.method1029(117);
					Static107.aClass3_Sub11_Sub1_3.method983(Static117.anIntArray370[local23]);
				}
				break;
			}
		}
		if (!local21) {
			Static67.method1915(Static119.method2136(new Class26[] { Static9.aClass26_137, local11 }), Static22.aClass26_415, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(Z)V")
	public static void method1188() {
		if (!Static117.aBoolean169) {
			return;
		}
		@Pc(11) Class3_Sub14 local11 = Static89.method1642(Static100.anInt3233, Static72.anInt2055);
		if (local11 != null && local11.anObjectArray7 != null) {
			@Pc(20) Class3_Sub15 local20 = new Class3_Sub15();
			local20.aClass3_Sub14_11 = local11;
			local20.anObjectArray28 = local11.anObjectArray7;
			Static28.method595(local20);
		}
		Static117.aBoolean169 = false;
		Static110.method2004(local11);
	}
}
