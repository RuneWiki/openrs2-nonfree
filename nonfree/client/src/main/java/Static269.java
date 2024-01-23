import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!th;")
	public static Class168 aClass168_181;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	public static int anInt5361;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "[I")
	public static int[] anIntArray482 = new int[100];

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	public static int anInt5352 = 0;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "[I")
	public static int[] anIntArray483 = new int[25];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Lclient!bc;")
	public static Class1_Sub3_Sub2 method4039(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub2 local10 = (Class1_Sub3_Sub2) Static169.aClass162_7.method4003((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static61.aClass168_47.method4058(arg0, 26);
		local10 = new Class1_Sub3_Sub2();
		if (local28 != null) {
			local10.method359(new Class1_Sub14(local28));
		}
		Static169.aClass162_7.method4005(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Lclient!jn;")
	public static Class1_Sub3_Sub11 method4046() {
		if (Static268.aClass108_11 == null) {
			return null;
		}
		for (@Pc(20) Class1_Sub3_Sub11 local20 = (Class1_Sub3_Sub11) Static121.aClass72_1.method1778(); local20 != null; local20 = (Class1_Sub3_Sub11) Static121.aClass72_1.method1778()) {
			@Pc(28) Class107 local28 = Static173.method2819(local20.anInt3104);
			if (local28 != null && local28.aBoolean242 && local28.method2745()) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public static void method4050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (arg0 != Static62.anInt1350) {
			Static3.anIntArray3 = new int[arg0];
			for (local14 = 0; local14 < arg0; local14++) {
				Static3.anIntArray3[local14] = (local14 << 12) / arg0;
			}
			Static62.anInt1350 = arg0;
			Static302.anInt6003 = arg0 - 1;
			Static220.anInt4684 = arg0 * 32;
		}
		if (arg1 == Static265.anInt5306) {
			return;
		}
		if (arg1 == Static62.anInt1350) {
			Static256.anIntArray474 = Static3.anIntArray3;
		} else {
			Static256.anIntArray474 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static256.anIntArray474[local14] = (local14 << 12) / arg1;
			}
		}
		Static279.anInt5616 = arg1 - 1;
		Static265.anInt5306 = arg1;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
	public static void method4059() {
		if (!Static230.aBoolean185) {
			return;
		}
		@Pc(14) Class191 local14 = Static205.method3267(Static8.anInt225, Static217.anInt4676);
		if (local14 != null && local14.anObjectArray11 != null) {
			@Pc(24) Class1_Sub27 local24 = new Class1_Sub27();
			local24.aClass191_14 = local14;
			local24.anObjectArray1 = local14.anObjectArray11;
			Static140.method2329(local24);
		}
		Static230.aBoolean185 = false;
		Static263.anInt5294 = -1;
		Static40.method817(local14);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[BZ)I")
	public static int method4063(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static62.method1109(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4067(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static159.anInt3526; local17++) {
			if (arg0.equalsIgnoreCase(Static18.aStringArray2[local17])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static100.aStringArray21[local17])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method4071() {
		@Pc(30) String local30;
		if (Static24.anInt662 == 1 && Static181.anInt3973 < 2) {
			local30 = Static163.aString216 + Static264.aString378 + Static311.aString444 + " ->";
		} else if (Static230.aBoolean185 && Static181.anInt3973 < 2) {
			local30 = Static244.aString290 + Static264.aString378 + Static303.aString426 + " ->";
		} else if (Static77.aBoolean122 && Static23.aBooleanArray3[81] && Static181.anInt3973 > 2) {
			local30 = Static56.method1051(Static181.anInt3973 - 2);
		} else {
			local30 = Static56.method1051(Static181.anInt3973 - 1);
		}
		if (Static181.anInt3973 > 2) {
			local30 = local30 + "<col=ffffff> / " + (Static181.anInt3973 - 2) + Static197.aString285;
		}
		return local30;
	}
}
