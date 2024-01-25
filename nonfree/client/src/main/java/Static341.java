import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_90 = new Class2(26, 3);

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_123 = new Class253(73, -2);

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!go;")
	public static Class95 aClass95_13 = null;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
	public static void method4428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static130.aClass153_Sub1_1.anInt5237 != 0 && arg0 != 0 && Static225.anInt4941 < 50 && arg2 != -1) {
			Static205.aClass252Array1[Static225.anInt4941++] = new Class252((byte) 2, arg2, arg0, arg3, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI[B)I")
	public static int method4429(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static143.method2215(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4430(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static20.aClass178_34.anInt4835 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(36) short[] local36 = new short[16];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = 0; local40 < Static259.aClass206_2.anInt5386; local40++) {
			@Pc(47) Class45 local47 = Static259.aClass206_2.method4320(local40);
			if ((!arg0 || local47.aBoolean62) && local47.anInt953 == -1 && local47.anInt975 == -1 && local47.anInt969 == 0 && local47.aString6.toLowerCase().indexOf(local11) != -1) {
				if (local38 >= 250) {
					Static89.aShortArray29 = null;
					Static238.anInt4078 = -1;
					return;
				}
				if (local38 >= local36.length) {
					@Pc(93) short[] local93 = new short[local36.length * 2];
					for (@Pc(95) int local95 = 0; local95 < local38; local95++) {
						local93[local95] = local36[local95];
					}
					local36 = local93;
				}
				local36[local38++] = (short) local40;
			}
		}
		Static117.anInt2381 = 0;
		Static238.anInt4078 = local38;
		Static89.aShortArray29 = local36;
		@Pc(133) String[] local133 = new String[Static238.anInt4078];
		for (@Pc(135) int local135 = 0; local135 < Static238.anInt4078; local135++) {
			local133[local135] = Static259.aClass206_2.method4320(local36[local135]).aString6;
		}
		Static116.method3920(Static89.aShortArray29, local133);
		Static20.aClass178_34.method3814();
		Static20.aClass178_34.anInt4835 = 2;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ya;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4432(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static268.aClass51_8 = arg0;
		Static189.anInt5375 = arg1;
		Static16.aClass33_10 = arg3;
		Static60.aBoolean67 = Static268.aClass51_8.method5290() > 0;
		Static408.anInt6461 = arg4 >> Static168.anInt3026;
		Static72.anInt1379 = arg6 >> Static168.anInt3026;
		Static279.anInt7421 = arg4;
		Static432.anInt7276 = arg6;
		Static28.anInt407 = arg5;
		Static16.anInt6421 = Static408.anInt6461 - Static133.anInt2523;
		if (Static16.anInt6421 < 0) {
			Static228.anInt3964 = -Static16.anInt6421;
			Static16.anInt6421 = 0;
		} else {
			Static228.anInt3964 = 0;
		}
		Static98.anInt1989 = Static72.anInt1379 - Static133.anInt2523;
		if (Static98.anInt1989 < 0) {
			Static39.anInt678 = -Static98.anInt1989;
			Static98.anInt1989 = 0;
		} else {
			Static39.anInt678 = 0;
		}
		Static269.anInt4577 = Static408.anInt6461 + Static133.anInt2523;
		if (Static269.anInt4577 > Static264.anInt4480) {
			Static269.anInt4577 = Static264.anInt4480;
		}
		Static226.anInt3936 = Static72.anInt1379 + Static133.anInt2523;
		if (Static226.anInt3936 > Static295.anInt4910) {
			Static226.anInt3936 = Static295.anInt4910;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static133.anInt2523 + Static133.anInt2523 + 2; local74++) {
			for (local77 = 0; local77 < Static133.anInt2523 + Static133.anInt2523 + 2; local77++) {
				local84 = Static408.anInt6461 + local74 - Static133.anInt2523;
				local90 = Static72.anInt1379 + local77 - Static133.anInt2523;
				if (local84 >= 0 && local90 >= 0 && local84 < Static264.anInt4480 && local90 < Static295.anInt4910) {
					@Pc(104) int local104 = local84 << Static168.anInt3026;
					@Pc(108) int local108 = local90 << Static168.anInt3026;
					@Pc(124) int local124 = Static149.aClass165Array7[Static149.aClass165Array7.length - 1].l(local84, local90) - (0x3E8 << Static168.anInt3026 - 7);
					@Pc(144) int local144 = Static28.aClass165Array1 == null ? Static149.aClass165Array7[0].l(local84, local90) + Static363.anInt5820 : Static28.aClass165Array1[0].l(local84, local90) + Static363.anInt5820;
					Static454.aBooleanArrayArray22[local74][local77] = Static268.aClass51_8.JA(local104, local124, local108, local104, local144, local108);
				} else {
					Static454.aBooleanArrayArray22[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static133.anInt2523 + Static133.anInt2523 + 1; local77++) {
			for (local84 = 0; local84 < Static133.anInt2523 + Static133.anInt2523 + 1; local84++) {
				Static262.aBooleanArrayArray20[local77][local84] = Static454.aBooleanArrayArray22[local77][local84] || Static454.aBooleanArrayArray22[local77 + 1][local84] || Static454.aBooleanArrayArray22[local77][local84 + 1] || Static454.aBooleanArrayArray22[local77 + 1][local84 + 1];
			}
		}
		Static234.anIntArray355 = arg8;
		Static173.anIntArray270 = arg9;
		Static221.anIntArray340 = arg10;
		Static134.anIntArray211 = arg11;
		Static189.anIntArray487 = arg12;
		Static174.method2513();
		Static22.method3907();
		for (@Pc(260) Class28_Sub4 local260 = (Class28_Sub4) Static256.aClass169_6.method3598(); local260 != null; local260 = (Class28_Sub4) Static256.aClass169_6.method3597()) {
			local260.method5642();
			Static435.method5604(local260);
		}
		if (Static60.aBoolean67) {
			for (local90 = 0; local90 < Static270.anInt4582; local90++) {
				Static302.aClass74Array1[local90].method1750(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static268.aClass51_8.method5306(0);
			if (Static223.aClass92_1 == null || Static223.aClass92_1 instanceof Class92_Sub2) {
				Static223.aClass92_1 = new Class92_Sub1();
			}
		} else if (Static223.aClass92_1 == null || Static223.aClass92_1 instanceof Class92_Sub1) {
			Static223.aClass92_1 = new Class92_Sub2();
		}
		Static223.aClass92_1.method3223(arg2);
		Static223.aClass92_1.method3216();
		if (Static142.aClass223ArrayArrayArray2 != null) {
			Static22.method3909(true);
			Static223.aClass92_1.method3222(22);
			Static275.method3670(arg2, null, 0, (byte) 0, arg15, arg16);
			Static223.aClass92_1.method3216();
			Static223.aClass92_1.method3222(23);
			Static22.method3909(false);
		}
		Static275.method3670(arg2, arg7, arg13, arg14, arg15, arg16);
		Static223.aClass92_1.method3216();
		Static223.aClass92_1.method3218();
		Static223.aClass92_1.method3216();
		if (arg2 > 1) {
			Static268.aClass51_8.method5341(0);
		}
		Static268.aClass51_8.method5318(0, null);
	}
}
