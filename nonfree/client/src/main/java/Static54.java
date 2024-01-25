import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!co", name = "l", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!so;")
	public static final Class224 aClass224_8 = new Class224(14, 18);

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_52 = new Class137(49, 6);

	@OriginalMember(owner = "client!co", name = "m", descriptor = "Z")
	public static boolean aBoolean78 = false;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "[I")
	public static int[] anIntArray47 = new int[1];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)[Lclient!go;")
	public static Class97[] method831() {
		return new Class97[] { Static337.aClass97_2, Static318.aClass97_11, Static122.aClass97_3, Static139.aClass97_4, Static264.aClass97_8, Static194.aClass97_6, Static194.aClass97_5, Static391.aClass97_14, Static325.aClass97_12, Static349.aClass97_13, Static444.aClass97_16, Static434.aClass97_10, Static398.aClass97_15, Static246.aClass97_7 };
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZIIII)V")
	public static void method833(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(24) Class1_Sub20 local24 = (Class1_Sub20) Static200.aClass257_15.method5503(local14);
		if (local24 == null) {
			local24 = new Class1_Sub20();
			Static200.aClass257_15.method5504(local24, local14);
		}
		if (local24.anIntArray149.length <= arg2) {
			@Pc(45) int[] local45 = new int[arg2 + 1];
			@Pc(50) int[] local50 = new int[arg2 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray149.length; local52++) {
				local45[local52] = local24.anIntArray149[local52];
				local50[local52] = local24.anIntArray150[local52];
			}
			for (@Pc(82) int local82 = local24.anIntArray149.length; local82 < arg2; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local24.anIntArray149 = local45;
			local24.anIntArray150 = local50;
		}
		local24.anIntArray149[arg2] = arg3;
		local24.anIntArray150[arg2] = arg1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIZII)Lclient!ls;")
	public static Class1_Sub26 method834(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub26 local7 = new Class1_Sub26();
		local7.anInt3847 = arg0;
		local7.anInt3846 = arg3;
		Static304.aClass257_21.method5504(local7, (long) arg2);
		Static278.method3521(arg0);
		@Pc(28) Class250 local28 = Static96.method1379(arg2);
		if (local28 != null) {
			Static94.method1357(local28);
		}
		if (Static394.aClass250_13 != null) {
			Static94.method1357(Static394.aClass250_13);
			Static394.aClass250_13 = null;
		}
		Static212.method2822();
		if (local28 != null) {
			Static325.method4180(local28, !arg1);
		}
		if (!arg1) {
			Static267.method3403(arg0);
		}
		if (!arg1 && Static169.anInt2522 != -1) {
			Static15.method241(1, Static169.anInt2522);
		}
		return local7;
	}
}
