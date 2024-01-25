import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!mo;")
	public static Class143 aClass143_3;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	public static int anInt124;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt113 = 20;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!al;")
	public static final Class11 aClass11_1 = new Class11(8);

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "[I")
	public static final int[] anIntArray6 = new int[1000];

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!mp;ILclient!e;III)V")
	public static void method121(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0) {
			Static110.aClass2_12.method2642((Static294.anInt5659 - Static110.aClass2_12.method2630()) / 2, (Static46.anInt1173 - Static110.aClass2_12.method2627()) / 2);
			Static209.aClass2_17.method2642((Static294.anInt5659 - Static209.aClass2_17.method2630()) / 2, 18);
		}
		arg1.method5584(Static45.anInt1136 == 1 ? Static355.aString254 : Static173.aString126, -1, Static46.anInt1173 / 2 - 26, Static294.anInt5659 / 2, arg5);
		@Pc(61) int local61 = Static46.anInt1173 / 2 - 18;
		arg2.method5143(Static294.anInt5659 / 2 - 152, local61, 304, 34, arg4, 0);
		arg2.method5143(Static294.anInt5659 / 2 - 151, local61 + 1, 302, 32, 0, 0);
		arg2.method5110(Static294.anInt5659 / 2 - 150, local61 - -2, Static74.anInt5350 * 3, 30, arg3, 0);
		arg2.method5110(Static74.anInt5350 * 3 + Static294.anInt5659 / 2 - 150, local61 - -2, 300 - Static74.anInt5350 * 3, 30, 0, 0);
		arg1.method5584(Static339.aString93, -1, Static46.anInt1173 / 2 + 4, Static294.anInt5659 / 2, arg5);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method122() {
		Static294.aClass2_20 = null;
		Static5.aClass2Array13 = null;
		Static18.aClass2Array3 = null;
		Static257.aClass2Array12 = null;
		Static103.aClass2Array7 = null;
		Static200.aClass2Array9 = null;
		Static94.aClass2Array6 = null;
		Static334.aClass2Array16 = null;
		Static170.aClass30_6 = null;
		Static14.aClass2Array2 = null;
		Static250.aClass2Array15 = null;
		Static338.aClass2Array17 = null;
		Static134.aClass2Array8 = null;
		Static38.aClass2Array5 = null;
		Static36.aClass2Array4 = null;
		Static164.aClass30_5 = null;
		Static245.aClass30_7 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
	public static boolean method124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class59 local7 = Static232.method2200(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local7.method1961(arg1);
	}
}
