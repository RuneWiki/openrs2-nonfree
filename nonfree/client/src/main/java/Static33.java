import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_258 = Static161.method2452(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	public static int anInt698 = 0;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_259 = Static161.method2452("<br>");

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_260 = Static161.method2452("title)3jpg");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([BZ)Lclient!ig;")
	public static Class5_Sub2_Sub8 method539(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) Class5_Sub2_Sub8_Sub1_Sub1 local24 = new Class5_Sub2_Sub8_Sub1_Sub1(arg0, Static146.anIntArray320, Static5.anIntArray10, Static153.anIntArray337, Static210.anIntArray84, Static191.aByteArrayArray9);
			Static85.method1452();
			return local24;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([BI)V")
	public static void method540(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class5_Sub6 local10 = new Class5_Sub6(arg0);
		local10.anInt4050 = arg0.length - 2;
		Static99.anInt2138 = local10.method3077();
		Static146.anIntArray320 = new int[Static99.anInt2138];
		Static5.anIntArray10 = new int[Static99.anInt2138];
		Static210.anIntArray84 = new int[Static99.anInt2138];
		Static191.aByteArrayArray9 = new byte[Static99.anInt2138][];
		Static153.anIntArray337 = new int[Static99.anInt2138];
		local10.anInt4050 = arg0.length - Static99.anInt2138 * 8 - 7;
		Static58.anInt1319 = local10.method3077();
		Static140.anInt2921 = local10.method3077();
		@Pc(64) int local64 = (local10.method3062() & 0xFF) + 1;
		for (@Pc(66) int local66 = 0; local66 < Static99.anInt2138; local66++) {
			Static146.anIntArray320[local66] = local10.method3077();
		}
		for (@Pc(84) int local84 = 0; local84 < Static99.anInt2138; local84++) {
			Static5.anIntArray10[local84] = local10.method3077();
		}
		for (@Pc(102) int local102 = 0; local102 < Static99.anInt2138; local102++) {
			Static153.anIntArray337[local102] = local10.method3077();
		}
		for (@Pc(120) int local120 = 0; local120 < Static99.anInt2138; local120++) {
			Static210.anIntArray84[local120] = local10.method3077();
		}
		local10.anInt4050 = arg0.length - Static99.anInt2138 * 8 - (local64 - 1) * 3 - 7;
		Static3.anIntArray9 = new int[local64];
		for (@Pc(154) int local154 = 1; local154 < local64; local154++) {
			Static3.anIntArray9[local154] = local10.method3072();
			if (Static3.anIntArray9[local154] == 0) {
				Static3.anIntArray9[local154] = 1;
			}
		}
		local10.anInt4050 = 0;
		for (@Pc(181) int local181 = 0; local181 < Static99.anInt2138; local181++) {
			@Pc(187) int local187 = Static153.anIntArray337[local181];
			@Pc(191) int local191 = Static210.anIntArray84[local181];
			@Pc(195) int local195 = local191 * local187;
			@Pc(198) byte[] local198 = new byte[local195];
			Static191.aByteArrayArray9[local181] = local198;
			@Pc(206) int local206 = local10.method3062();
			@Pc(216) int local216;
			if (local206 == 0) {
				for (local216 = 0; local216 < local195; local216++) {
					local198[local216] = local10.method3053();
				}
			} else if (local206 == 1) {
				for (local216 = 0; local216 < local187; local216++) {
					for (@Pc(220) int local220 = 0; local220 < local191; local220++) {
						local198[local216 + local187 * local220] = local10.method3053();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!wa;Lclient!wa;Z)V")
	public static void method541(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1) {
		Static66.aClass23_28 = arg0;
		Static181.aClass23_66 = arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class106 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class106(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static157.aClass5_Sub3ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static157.aClass5_Sub3ArrayArrayArray2[local14][arg1][arg2] = new Class5_Sub3(local14, arg1, arg2);
				}
			}
			Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].aClass106_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class106(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static157.aClass5_Sub3ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static157.aClass5_Sub3ArrayArrayArray2[local14][arg1][arg2] = new Class5_Sub3(local14, arg1, arg2);
				}
			}
			Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].aClass106_1 = local12;
		} else {
			@Pc(134) Class57 local134 = new Class57(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static157.aClass5_Sub3ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static157.aClass5_Sub3ArrayArrayArray2[local14][arg1][arg2] = new Class5_Sub3(local14, arg1, arg2);
				}
			}
			Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].aClass57_1 = local134;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method545(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 == 8364) {
			return 128;
		} else {
			if (local2 <= 0 || local2 >= 256) {
				local2 = -1;
			}
			return local2;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
	public static int method546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
