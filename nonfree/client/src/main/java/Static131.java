import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!i", name = "M", descriptor = "Lclient!ng;")
	public static Class140 aClass140_72 = new Class140(64);

	@OriginalMember(owner = "client!i", name = "P", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!i", name = "R", descriptor = "I")
	public static int anInt2568 = 0;

	@OriginalMember(owner = "client!i", name = "S", descriptor = "[I")
	public static final int[] anIntArray308 = new int[50];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII)V")
	public static void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = Static216.method3969(Static291.anInt5657, arg3, Static49.anInt1124);
		@Pc(19) int local19 = Static216.method3969(Static291.anInt5657, arg4, Static49.anInt1124);
		@Pc(25) int local25 = Static216.method3969(Static251.anInt6512, arg5, Static106.anInt2157);
		@Pc(35) int local35 = Static216.method3969(Static251.anInt6512, arg1, Static106.anInt2157);
		@Pc(44) int local44 = Static216.method3969(Static291.anInt5657, arg3 + arg0, Static49.anInt1124);
		@Pc(54) int local54 = Static216.method3969(Static291.anInt5657, arg4 - arg0, Static49.anInt1124);
		for (@Pc(56) int local56 = local13; local56 < local44; local56++) {
			Static97.method1784(local25, Static327.anIntArrayArray63[local56], arg2, local35);
		}
		for (@Pc(72) int local72 = local19; local72 > local54; local72--) {
			Static97.method1784(local25, Static327.anIntArrayArray63[local72], arg2, local35);
		}
		@Pc(98) int local98 = Static216.method3969(Static251.anInt6512, arg5 + arg0, Static106.anInt2157);
		@Pc(109) int local109 = Static216.method3969(Static251.anInt6512, arg1 - arg0, Static106.anInt2157);
		for (@Pc(111) int local111 = local44; local111 <= local54; local111++) {
			@Pc(117) int[] local117 = Static327.anIntArrayArray63[local111];
			Static97.method1784(local25, local117, arg2, local98);
			Static97.method1784(local109, local117, arg2, local35);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZBLclient!lo;III)V")
	public static void method2490(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static46.anInt1004 >= 50 || (arg1 == null || arg1.anIntArrayArray37 == null || arg2 >= arg1.anIntArrayArray37.length || arg1.anIntArrayArray37[arg2] == null)) {
			return;
		}
		@Pc(41) int local41 = arg1.anIntArrayArray37[arg2][0];
		@Pc(45) int local45 = local41 >> 8;
		@Pc(51) int local51 = local41 >> 5 & 0x7;
		@Pc(70) int local70;
		if (arg1.anIntArrayArray37[arg2].length > 1) {
			local70 = (int) ((double) arg1.anIntArrayArray37[arg2].length * Math.random());
			if (local70 > 0) {
				local45 = arg1.anIntArrayArray37[arg2][local70];
			}
		}
		@Pc(86) int local86 = local41 & 0x1F;
		if (local86 == 0) {
			if (arg0) {
				Static12.method315(255, local45, local51, 0);
			}
		} else if (Static8.anInt201 != 0) {
			Static252.anIntArray630[Static46.anInt1004] = local45;
			Static23.anIntArray78[Static46.anInt1004] = local51;
			Static148.anIntArray636[Static46.anInt1004] = 0;
			Static103.aClass81Array1[Static46.anInt1004] = null;
			anIntArray308[Static46.anInt1004] = 255;
			local70 = (arg4 - 64) / 128;
			@Pc(132) int local132 = (arg3 - 64) / 128;
			Static134.anIntArray313[Static46.anInt1004] = (local70 << 16) + (local132 << 8) + local86;
			Static46.anInt1004++;
		}
	}
}
