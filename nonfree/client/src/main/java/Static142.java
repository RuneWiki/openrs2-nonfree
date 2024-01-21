import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_28 = new Class8(128);

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1117 = Static161.method2452("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1118 = Static161.method2452("Angreifen");

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "[I")
	public static final int[] anIntArray315 = new int[200];

	@OriginalMember(owner = "client!oj", name = "J", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1119 = Static161.method2452("<col=40ff00>");

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
	public static int anInt2969 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static85.aBoolean86 = true;
		Static198.anInt3861 = arg0;
		Static66.anInt1447 = arg1;
		Static63.anInt1386 = arg2;
		Static97.anInt2043 = -1;
		Static98.anInt2089 = -1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	public static boolean method2213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 104; local15++) {
			for (local19 = 0; local19 < 104; local19++) {
				Static155.anIntArrayArray34[local15][local19] = 0;
				Static167.anIntArrayArray36[local15][local19] = 99999999;
			}
		}
		Static155.anIntArrayArray34[arg3][arg2] = 99;
		Static167.anIntArrayArray36[arg3][arg2] = 0;
		@Pc(57) int local57 = arg2;
		local19 = arg3;
		@Pc(61) byte local61 = 0;
		Static85.anIntArray183[0] = arg3;
		@Pc(68) int local68 = local61 + 1;
		Static128.anIntArray292[0] = arg2;
		@Pc(72) int local72 = 0;
		@Pc(77) int[][] local77 = Static9.aClass76Array1[Static111.anInt2327].anIntArrayArray30;
		@Pc(79) boolean local79 = false;
		@Pc(193) int local193;
		while (local72 != local68) {
			local19 = Static85.anIntArray183[local72];
			local57 = Static128.anIntArray292[local72];
			local72 = local72 + 1 & 0xFFF;
			if (local19 == arg7 && local57 == arg1) {
				local79 = true;
				break;
			}
			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && Static9.aClass76Array1[Static111.anInt2327].method2230(arg10 - 1, arg4, arg7, local57, 2, local19, arg1)) {
					local79 = true;
					break;
				}
				if (arg10 < 10 && Static9.aClass76Array1[Static111.anInt2327].method2228(arg7, local57, local19, arg1, arg4, arg10 - 1, 2)) {
					local79 = true;
					break;
				}
			}
			if (arg8 != 0 && arg6 != 0 && Static9.aClass76Array1[Static111.anInt2327].method2215(arg1, arg7, local19, arg8, 2, local57, arg0, arg6)) {
				local79 = true;
				break;
			}
			local193 = Static167.anIntArrayArray36[local19][local57] + 1;
			if (local19 > 0 && Static155.anIntArrayArray34[local19 - 1][local57] == 0 && (local77[local19 - 1][local57] & 0x12C010E) == 0 && (local77[local19 - 1][local57 + 1] & 0x12C0138) == 0) {
				Static85.anIntArray183[local68] = local19 - 1;
				Static128.anIntArray292[local68] = local57;
				Static155.anIntArrayArray34[local19 - 1][local57] = 2;
				local68 = local68 + 1 & 0xFFF;
				Static167.anIntArrayArray36[local19 - 1][local57] = local193;
			}
			if (local19 < 102 && Static155.anIntArrayArray34[local19 + 1][local57] == 0 && (local77[local19 + 2][local57] & 0x12C0183) == 0 && (local77[local19 + 2][local57 + 1] & 0x12C01E0) == 0) {
				Static85.anIntArray183[local68] = local19 + 1;
				Static128.anIntArray292[local68] = local57;
				local68 = local68 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local19 + 1][local57] = 8;
				Static167.anIntArrayArray36[local19 + 1][local57] = local193;
			}
			if (local57 > 0 && Static155.anIntArrayArray34[local19][local57 - 1] == 0 && (local77[local19][local57 - 1] & 0x12C010E) == 0 && (local77[local19 + 1][local57 - 1] & 0x12C0183) == 0) {
				Static85.anIntArray183[local68] = local19;
				Static128.anIntArray292[local68] = local57 - 1;
				Static155.anIntArrayArray34[local19][local57 - 1] = 1;
				Static167.anIntArrayArray36[local19][local57 - 1] = local193;
				local68 = local68 + 1 & 0xFFF;
			}
			if (local57 < 102 && Static155.anIntArrayArray34[local19][local57 + 1] == 0 && (local77[local19][local57 + 2] & 0x12C0138) == 0 && (local77[local19 + 1][local57 + 2] & 0x12C01E0) == 0) {
				Static85.anIntArray183[local68] = local19;
				Static128.anIntArray292[local68] = local57 + 1;
				Static155.anIntArrayArray34[local19][local57 + 1] = 4;
				local68 = local68 + 1 & 0xFFF;
				Static167.anIntArrayArray36[local19][local57 + 1] = local193;
			}
			if (local19 > 0 && local57 > 0 && Static155.anIntArrayArray34[local19 - 1][local57 - 1] == 0 && (local77[local19 - 1][local57] & 0x12C0138) == 0 && (local77[local19 - 1][local57 - 1] & 0x12C010E) == 0 && (local77[local19][local57 - 1] & 0x12C0183) == 0) {
				Static85.anIntArray183[local68] = local19 - 1;
				Static128.anIntArray292[local68] = local57 - 1;
				local68 = local68 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local19 - 1][local57 - 1] = 3;
				Static167.anIntArrayArray36[local19 - 1][local57 - 1] = local193;
			}
			if (local19 < 102 && local57 > 0 && Static155.anIntArrayArray34[local19 + 1][local57 - 1] == 0 && (local77[local19 + 1][local57 - 1] & 0x12C010E) == 0 && (local77[local19 + 2][local57 - 1] & 0x12C0183) == 0 && (local77[local19 + 2][local57] & 0x12C01E0) == 0) {
				Static85.anIntArray183[local68] = local19 + 1;
				Static128.anIntArray292[local68] = local57 - 1;
				local68 = local68 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local19 + 1][local57 - 1] = 9;
				Static167.anIntArrayArray36[local19 + 1][local57 - 1] = local193;
			}
			if (local19 > 0 && local57 < 102 && Static155.anIntArrayArray34[local19 - 1][local57 + 1] == 0 && (local77[local19 - 1][local57 + 1] & 0x12C010E) == 0 && (local77[local19 - 1][local57 + 2] & 0x12C0138) == 0 && (local77[local19][local57 + 2] & 0x12C01E0) == 0) {
				Static85.anIntArray183[local68] = local19 - 1;
				Static128.anIntArray292[local68] = local57 + 1;
				local68 = local68 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local19 - 1][local57 + 1] = 6;
				Static167.anIntArrayArray36[local19 - 1][local57 + 1] = local193;
			}
			if (local19 < 102 && local57 < 102 && Static155.anIntArrayArray34[local19 + 1][local57 + 1] == 0 && (local77[local19 + 1][local57 + 2] & 0x12C0138) == 0 && (local77[local19 + 2][local57 + 2] & 0x12C01E0) == 0 && (local77[local19 + 2][local57 + 1] & 0x12C0183) == 0) {
				Static85.anIntArray183[local68] = local19 + 1;
				Static128.anIntArray292[local68] = local57 + 1;
				local68 = local68 + 1 & 0xFFF;
				Static155.anIntArrayArray34[local19 + 1][local57 + 1] = 12;
				Static167.anIntArrayArray36[local19 + 1][local57 + 1] = local193;
			}
		}
		Static152.anInt3068 = 0;
		@Pc(877) int local877;
		if (!local79) {
			if (!arg5) {
				return false;
			}
			local193 = 1000;
			local877 = 100;
			for (@Pc(883) int local883 = arg7 - 10; local883 <= arg7 + 10; local883++) {
				for (@Pc(889) int local889 = arg1 - 10; local889 <= arg1 + 10; local889++) {
					if (local883 >= 0 && local889 >= 0 && local883 < 104 && local889 < 104 && Static167.anIntArrayArray36[local883][local889] < 100) {
						@Pc(913) int local913 = 0;
						@Pc(915) int local915 = 0;
						if (arg1 > local889) {
							local915 = arg1 - local889;
						} else if (arg6 + arg1 - 1 < local889) {
							local915 = local889 + 1 - arg6 - arg1;
						}
						if (arg7 > local883) {
							local913 = arg7 - local883;
						} else if (arg7 + arg8 - 1 < local883) {
							local913 = local883 + 1 - arg7 - arg8;
						}
						@Pc(983) int local983 = local913 * local913 + local915 * local915;
						if (local193 > local983 || local193 == local983 && Static167.anIntArrayArray36[local883][local889] < local877) {
							local877 = Static167.anIntArrayArray36[local883][local889];
							local19 = local883;
							local57 = local889;
							local193 = local983;
						}
					}
				}
			}
			if (local193 == 1000) {
				return false;
			}
			if (arg3 == local19 && arg2 == local57) {
				return false;
			}
			Static152.anInt3068 = 1;
		}
		@Pc(1053) byte local1053 = 0;
		Static85.anIntArray183[0] = local19;
		local72 = local1053 + 1;
		Static128.anIntArray292[0] = local57;
		local193 = local877 = Static155.anIntArrayArray34[local19][local57];
		while (local19 != arg3 || arg2 != local57) {
			if (local193 != local877) {
				Static85.anIntArray183[local72] = local19;
				Static128.anIntArray292[local72++] = local57;
				local877 = local193;
			}
			if ((local193 & 0x1) != 0) {
				local57++;
			} else if ((local193 & 0x4) != 0) {
				local57--;
			}
			if ((local193 & 0x2) != 0) {
				local19++;
			} else if ((local193 & 0x8) != 0) {
				local19--;
			}
			local193 = Static155.anIntArrayArray34[local19][local57];
		}
		if (local72 > 0) {
			Static28.method420(local72, Static128.anIntArray292, Static85.anIntArray183, arg9);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
