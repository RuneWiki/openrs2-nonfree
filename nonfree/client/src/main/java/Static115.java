import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Z")
	public static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
	public static boolean aBoolean397 = true;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray46 = new String[100];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)I")
	public static int method4702(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	public static void method4706() {
		Static151.anInt3324 = 0;
		@Pc(18) int local18 = Static234.anInt4705 + (Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7);
		@Pc(25) int local25 = (Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7) + Static160.anInt5159;
		if (local25 >= 3053 && local25 <= 3156 && local18 >= 3056 && local18 <= 3136) {
			Static151.anInt3324 = 1;
		}
		if (local25 >= 3072 && local25 <= 3118 && local18 >= 9492 && local18 <= 9535) {
			Static151.anInt3324 = 1;
		}
		if (Static151.anInt3324 == 1 && local25 >= 3139 && local25 <= 3199 && local18 >= 3008 && local18 <= 3062) {
			Static151.anInt3324 = 0;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIBI)V")
	public static void method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static190.aClass93Array6[0].method3562(arg1, arg0);
		Static190.aClass93Array6[1].method3562(arg1, arg3 + arg0 - 16);
		@Pc(28) int local28 = arg3 * (arg3 - 32) / arg2;
		if (local28 < 8) {
			local28 = 8;
		}
		@Pc(45) int local45 = arg4 * (arg3 - local28 - 32) / (arg2 - arg3);
		if (!Static116.aBoolean184) {
			Static77.method1447(arg1, arg0 + 16, 16, arg3 - 32, Static246.anInt4875);
			Static77.method1447(arg1, arg0 + local45 + 16, 16, local28, Static91.anInt2191);
			Static77.method1438(arg1, arg0 + local45 + 16, local28, Static245.anInt4871);
			Static77.method1438(arg1 + 1, local45 + arg0 + 16, local28, Static245.anInt4871);
			Static77.method1450(arg1, local45 + arg0 + 16, 16, Static245.anInt4871);
			Static77.method1450(arg1, local45 + arg0 + 17, 16, Static245.anInt4871);
			Static77.method1438(arg1 + 15, arg0 + 16 + local45, local28, Static138.anInt3075);
			Static77.method1438(arg1 + 14, local45 + arg0 + 17, local28 - 1, Static138.anInt3075);
			Static77.method1450(arg1, local45 + arg0 + local28 + 15, 16, Static138.anInt3075);
			Static77.method1450(arg1 + 1, local28 + arg0 + 14 + local45, 15, Static138.anInt3075);
			return;
		}
		Static111.method1888(arg1, arg0 + 16, 16, arg3 - 32, Static246.anInt4875);
		Static111.method1888(arg1, arg0 + local45 + 16, 16, local28, Static91.anInt2191);
		Static111.method1894(arg1, arg0 + local45 + 16, local28, Static245.anInt4871);
		Static111.method1894(arg1 + 1, arg0 + 16 + local45, local28, Static245.anInt4871);
		Static111.method1881(arg1, arg0 + local45 + 16, 16, Static245.anInt4871);
		Static111.method1881(arg1, arg0 + local45 + 17, 16, Static245.anInt4871);
		Static111.method1894(arg1 + 15, arg0 - -local45 + 16, local28, Static138.anInt3075);
		Static111.method1894(arg1 + 14, local45 + arg0 + 17, local28 - 1, Static138.anInt3075);
		Static111.method1881(arg1, local28 + arg0 + local45 + 15, 16, Static138.anInt3075);
		Static111.method1881(arg1 + 1, local28 + local45 + 14 + arg0, 15, Static138.anInt3075);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class47[] local11 = Static308.aClass47Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class47 local21 = local11[local13];
			if (local21 != null && local21.anInt1830 == 2) {
				Static137.method2474(arg4 >> 1, local21.anInt1839 * 2, arg0, arg5 >> 1, arg3, (local21.anInt1832 - Static234.anInt4705 << 7) + local21.anInt1844, (local21.anInt1846 - Static160.anInt5159 << 7) + local21.anInt1843);
				if (Static213.anInt4350 > -1 && Static268.anInt5236 % 20 < 10) {
					Static46.aClass2_Sub8_Sub1Array1[local21.anInt1845].method4364(Static213.anInt4350 + arg2 - 12, Static82.anInt1927 + -28 + arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!oe;I)V")
	public static void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		if (Static47.aClass130_1 == null) {
			return;
		}
		try {
			Static47.aClass130_1.method3491(0L);
			Static47.aClass130_1.method3497(24, arg1.aByteArray17, arg0);
		} catch (@Pc(15) Exception local15) {
		}
	}
}
