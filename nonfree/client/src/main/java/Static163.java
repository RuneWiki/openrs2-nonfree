import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public static int anInt3523;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1234 = Static64.method1101("<col=c0ff00>");

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
	public static int anInt3533 = 0;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1235 = Static64.method1101("::errortest");

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "[I")
	public static int[] anIntArray231 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!me;III)V")
	public static void method2752(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static141.anInt3047 != 0 && Static141.anInt3047 != 3 || !arg0.method2202()) {
			return;
		}
		@Pc(22) int local22 = arg0.anIntArray186[arg2];
		if (local22 > arg1 || arg0.anIntArray182[arg2] + local22 < arg1) {
			return;
		}
		@Pc(54) int local54 = arg2 - arg0.anInt2835 / 2;
		@Pc(61) int local61 = Static16.anInt379 + Static45.anInt1100 & 0x7FF;
		@Pc(68) int local68 = arg1 - arg0.anInt2802 / 2;
		@Pc(72) int local72 = Class94.anIntArray278[local61];
		@Pc(80) int local80 = (Static151.anInt3331 + 256) * local72 >> 8;
		@Pc(84) int local84 = Class94.anIntArray277[local61];
		@Pc(92) int local92 = (Static151.anInt3331 + 256) * local84 >> 8;
		@Pc(102) int local102 = local54 * local92 - local80 * local68 >> 11;
		@Pc(112) int local112 = local68 * local92 + local54 * local80 >> 11;
		@Pc(120) int local120 = Static73.aClass5_Sub1_Sub1_1.anInt3624 + local112 >> 7;
		@Pc(128) int local128 = Static73.aClass5_Sub1_Sub1_1.anInt3598 - local102 >> 7;
		@Pc(148) boolean local148 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local120, 0, 0, 0, local128, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, true, 1, 0);
		if (!local148) {
			return;
		}
		Static167.aClass1_Sub16_Sub1_2.method3765(local68);
		Static167.aClass1_Sub16_Sub1_2.method3765(local54);
		Static167.aClass1_Sub16_Sub1_2.method3807(Static16.anInt379);
		Static167.aClass1_Sub16_Sub1_2.method3765(57);
		Static167.aClass1_Sub16_Sub1_2.method3765(Static45.anInt1100);
		Static167.aClass1_Sub16_Sub1_2.method3765(Static151.anInt3331);
		Static167.aClass1_Sub16_Sub1_2.method3765(89);
		Static167.aClass1_Sub16_Sub1_2.method3807(Static73.aClass5_Sub1_Sub1_1.anInt3624);
		Static167.aClass1_Sub16_Sub1_2.method3807(Static73.aClass5_Sub1_Sub1_1.anInt3598);
		Static167.aClass1_Sub16_Sub1_2.method3765(Static80.anInt1790);
		Static167.aClass1_Sub16_Sub1_2.method3765(63);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method2755() {
		@Pc(4) int[] local4 = new int[Static29.anInt686];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static29.anInt686; local12++) {
			@Pc(18) Class92 local18 = Static36.method637(local12);
			if (local18.anInt3659 >= 0 || local18.anInt3672 >= 0) {
				local4[local10++] = local12;
			}
		}
		Static213.anIntArray342 = new int[local10];
		for (@Pc(45) int local45 = 0; local45 < local10; local45++) {
			Static213.anIntArray342[local45] = local4[local45];
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
	public static void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = arg1; local11 <= arg4 + arg1; local11++) {
			for (local15 = arg2; local15 <= arg3 + arg2; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static18.aByteArrayArrayArray4[arg0][local15][local11] = 127;
				}
			}
		}
		@Pc(61) int local61;
		for (local15 = arg1; local15 < arg1 + arg4; local15++) {
			for (local61 = arg2; local61 < arg2 + arg3; local61++) {
				if (local61 >= 0 && local61 < 104 && local15 >= 0 && local15 < 104) {
					Static20.anIntArrayArrayArray2[arg0][local61][local15] = arg0 > 0 ? Static20.anIntArrayArrayArray2[arg0 - 1][local61][local15] : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local61 = arg1 + 1; local61 < arg1 + arg4; local61++) {
				if (local61 >= 0 && local61 < 104) {
					Static20.anIntArrayArrayArray2[arg0][arg2][local61] = Static20.anIntArrayArrayArray2[arg0][arg2 - 1][local61];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local61 = arg2 + 1; local61 < arg3 + arg2; local61++) {
				if (local61 >= 0 && local61 < 104) {
					Static20.anIntArrayArrayArray2[arg0][local61][arg1] = Static20.anIntArrayArrayArray2[arg0][local61][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || arg2 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1] != 0) {
				Static20.anIntArrayArrayArray2[arg0][arg2][arg1] = Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1];
				return;
			}
			if (arg1 > 0 && Static20.anIntArrayArrayArray2[arg0][arg2][arg1 - 1] != 0) {
				Static20.anIntArrayArrayArray2[arg0][arg2][arg1] = Static20.anIntArrayArrayArray2[arg0][arg2][arg1 - 1];
				return;
			}
			if (arg2 > 0 && arg1 > 0 && Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1 - 1] != 0) {
				Static20.anIntArrayArrayArray2[arg0][arg2][arg1] = Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1] != Static20.anIntArrayArrayArray2[arg0 - 1][arg2 - 1][arg1]) {
			Static20.anIntArrayArrayArray2[arg0][arg2][arg1] = Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1];
			return;
		}
		if (arg1 > 0 && Static20.anIntArrayArrayArray2[arg0 - 1][arg2][arg1 - 1] != Static20.anIntArrayArrayArray2[arg0][arg2][arg1 - 1]) {
			Static20.anIntArrayArrayArray2[arg0][arg2][arg1] = Static20.anIntArrayArrayArray2[arg0][arg2][arg1 - 1];
			return;
		}
		if (arg2 > 0 && arg1 > 0 && Static20.anIntArrayArrayArray2[arg0 - 1][arg2 - 1][arg1 - 1] != Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1 - 1]) {
			Static20.anIntArrayArrayArray2[arg0][arg2][arg1] = Static20.anIntArrayArrayArray2[arg0][arg2 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZILclient!mb;Lclient!mb;I)Lclient!qh;")
	public static Class1_Sub2_Sub14 method2759(@OriginalArg(1) int arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		@Pc(15) int[] local15 = arg1.method3538(arg0);
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
			@Pc(29) byte[] local29 = arg1.method3528(arg0, local15[local19]);
			if (local29 == null) {
				local17 = false;
			} else {
				@Pc(49) int local49 = local29[1] & 0xFF | (local29[0] & 0xFF) << 8;
				@Pc(65) byte[] local65 = arg2.method3528(local49, 0);
				if (local65 == null) {
					local17 = false;
				}
			}
		}
		if (!local17) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub14(arg1, arg2, arg0, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}
}
