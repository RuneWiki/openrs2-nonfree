import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString22 = "Please remove ";

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method524() {
		if (Static141.anInt2799 == 5) {
			Static141.anInt2799 = 6;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BC)B")
	public static byte method525(@OriginalArg(1) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!cg;Z)V")
	public static void method527(@OriginalArg(0) Class22 arg0) {
		Static266.anInt5236 = arg0.method661("runes");
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIII)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg0);
		@Pc(17) int local17 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg2);
		@Pc(23) int local23 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg4);
		@Pc(29) int local29 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1);
		@Pc(41) int local41 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg0 + arg5);
		@Pc(50) int local50 = Static101.method1680(Static100.anInt1982, Static293.anInt5688, arg2 - arg5);
		@Pc(52) int local52;
		for (local52 = local11; local52 < local41; local52++) {
			Static190.method3151(local29, Static253.anIntArrayArray34[local52], arg3, local23);
		}
		for (local52 = local17; local52 > local50; local52--) {
			Static190.method3151(local29, Static253.anIntArrayArray34[local52], arg3, local23);
		}
		@Pc(95) int local95 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg4 + arg5);
		@Pc(104) int local104 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 - arg5);
		for (local52 = local41; local52 <= local50; local52++) {
			@Pc(117) int[] local117 = Static253.anIntArrayArray34[local52];
			Static190.method3151(local95, local117, arg3, local23);
			Static190.method3151(local29, local117, arg3, local104);
		}
	}
}
