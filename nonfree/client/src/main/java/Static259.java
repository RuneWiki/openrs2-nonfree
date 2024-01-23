import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!kb;")
	public static Class83 aClass83_179;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
	public static int[] anIntArray565;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public static int anInt5654;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	public static int anInt5649 = 0;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[I")
	public static int[] anIntArray564 = new int[14];

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public static int anInt5653 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V")
	public static void method4397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg1 + 1;
		Static89.method1538(Static57.anIntArrayArray9[arg1], arg4, arg2, arg3);
		@Pc(28) int local28 = arg0 - 1;
		Static89.method1538(Static57.anIntArrayArray9[arg0], arg4, arg2, arg3);
		for (@Pc(35) int local35 = local15; local35 <= local28; local35++) {
			@Pc(42) int[] local42 = Static57.anIntArrayArray9[local35];
			local42[arg2] = local42[arg4] = arg3;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	public static void method4398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static81.aClass1_Sub16_Sub1_1.method2676(99);
		Static81.aClass1_Sub16_Sub1_1.method2657(arg1);
		Static81.aClass1_Sub16_Sub1_1.method2651(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	public static void method4399() {
		if (anInt5653 == 2) {
			if (Static139.anInt6139 == Static190.anInt4241 && Static281.anInt6019 == Static3.anInt108) {
				anInt5653 = 0;
				if (Static66.aBoolean191 && Static35.aBooleanArray2[81] && Static111.anInt2398 > 2) {
					Static236.method4087(Static111.anInt2398 - 2);
				} else {
					Static236.method4087(Static111.anInt2398 - 1);
				}
			}
		} else if (Static190.anInt4241 == Static182.anInt4419 && Static279.anInt5967 == Static281.anInt6019) {
			anInt5653 = 0;
			if (Static66.aBoolean191 && Static35.aBooleanArray2[81] && Static111.anInt2398 > 2) {
				Static236.method4087(Static111.anInt2398 - 2);
			} else {
				Static236.method4087(Static111.anInt2398 - 1);
			}
		} else {
			anInt5653 = 2;
			Static3.anInt108 = Static279.anInt5967;
			Static139.anInt6139 = Static182.anInt4419;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4401(@OriginalArg(1) String arg0) {
		return Static34.method722(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	public static void method4402() {
		for (@Pc(11) int local11 = -1; local11 < Static266.anInt5789; local11++) {
			@Pc(21) int local21;
			if (local11 == -1) {
				local21 = 2047;
			} else {
				local21 = Static39.anIntArray108[local11];
			}
			@Pc(29) Class25_Sub1_Sub1 local29 = Static271.aClass25_Sub1_Sub1Array1[local21];
			if (local29 != null) {
				Static161.method3008(local29.method1243(), local29);
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZ)V")
	public static void method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static174.anInt3972 = Static112.aClass59ArrayArray1[arg1][arg0].anInt1945;
		Static8.anInt4427 = Static112.aClass59ArrayArray1[arg1][arg0].anInt1944;
		Static89.anInt2057 = Static112.aClass59ArrayArray1[arg1][arg0].anInt1942;
		Static201.method3576((float) Static174.anInt3972, (float) Static8.anInt4427, (float) Static89.anInt2057);
	}
}
