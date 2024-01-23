import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!nb;")
	public static Class15 aClass15_5;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!i;")
	public static Class41 aClass41_216 = Static184.method2923("titlebox");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	public static int anInt806 = 0;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	public static int anInt811 = -1;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!i;")
	public static Class41 aClass41_217 = Static184.method2923("underlay)3dat");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	public static void method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static60.anInt4779 <= arg5 - arg0 && Static11.anInt385 >= arg5 + arg0 && Static45.anInt1337 <= arg3 - arg0 && Static17.anInt457 >= arg0 + arg3) {
			Static8.method252(arg1, arg5, arg2, arg0, arg3, arg4);
		} else {
			Static108.method1830(arg1, arg3, arg2, arg0, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!i;ZI)V")
	public static void method606(@OriginalArg(0) Class41 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(18) int local18 = Static3.aClass2_Sub2_Sub4_1.method786(arg0, 250);
		@Pc(29) int local29 = Static3.aClass2_Sub2_Sub4_1.method793(arg0, 250) * 13;
		Static64.method1164(6, 6, local18 + 4 + 4, 4 + 4 + local29, 0);
		Static64.method1162(6, 6, local18 + 4 + 4, 4 + 4 + local29, 16777215);
		Static3.aClass2_Sub2_Sub4_1.method783(arg0, 10, 10, local18, local29, 16777215, -1, 1, 1, 0);
		Static111.method1901(local29 + 4 + 4, local18 - -4 + 4, 6, 6);
		if (!arg1) {
			Static114.method1948(10, local29, local18, 10);
			return;
		}
		@Pc(114) Canvas local114 = Static139.aCanvas1;
		try {
			@Pc(117) Graphics local117 = local114.getGraphics();
			Static178.aClass22_1.method1219(local117);
		} catch (@Pc(125) Exception local125) {
			local114.repaint();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static211.anIntArrayArrayArray21[arg0][local16][local20] == -Static128.anInt2975) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static56.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5;
			if (!Static91.method1600(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static91.method1600(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static91.method1600(local20, local156, local182)) {
				return false;
			} else if (Static91.method1600(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static212.method3258(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static91.method1600(local16 + 1, Static56.anIntArrayArrayArray7[arg0][arg1][arg3] + arg5, local20 + 1) && Static91.method1600(local16 + 128 - 1, Static56.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static91.method1600(local16 + 128 - 1, Static56.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static91.method1600(local16 + 1, Static56.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg1);
		@Pc(21) int local21 = Static141.method2224(Static45.anInt1337, Static17.anInt457, arg2);
		@Pc(27) int local27 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg3);
		@Pc(33) int local33 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4);
		for (@Pc(35) int local35 = local11; local35 <= local21; local35++) {
			Static204.method3147(local27, arg0, local33, Static3.anIntArrayArray1[local35]);
		}
	}
}
