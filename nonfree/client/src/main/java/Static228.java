import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Lclient!kb;")
	public static Class83 aClass83_153;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
	public static int anInt5022 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
	public static void method3997(@OriginalArg(0) boolean arg0) {
		Static201.method3583(Static233.anInt5148, Static295.aFloat114, Static259.aFloat185, Static33.aFloat30);
		Static201.method3579(Static259.anInt5654, Static213.anInt4722, arg0);
		Static201.method3576((float) Static174.anInt3972, (float) Static8.anInt4427, (float) Static89.anInt2057);
		Static201.method3581();
		Static178.aClass1_Sub2_Sub21_6 = Static16.aClass1_Sub2_Sub21_1;
		Static211.aFloat154 = Static35.aFloat32;
		Static211.aFloat152 = Static165.aFloat128;
		Static211.aFloat153 = Static80.aFloat60;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIZII)V")
	public static void method3998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg1; local3 <= arg0; local3++) {
			Static89.method1538(Static57.anIntArrayArray9[local3], arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lclient!ha;")
	public static Class1_Sub2_Sub9 method3999(@OriginalArg(0) int arg0) {
		return (Class1_Sub2_Sub9) Static146.aClass117_11.method3438((long) arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIIIII)V")
	public static void method4000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static158.anInt3653 = arg2;
		Static180.anInt4076 = arg1;
		Static289.anInt6096 = arg3;
		Static257.anInt5593 = arg0;
		Static254.anInt5407 = arg4;
		if (Static254.anInt5407 >= 100) {
			@Pc(28) int local28 = Static180.anInt4076 * 128 + 64;
			@Pc(34) int local34 = Static158.anInt3653 * 128 + 64;
			@Pc(43) int local43 = Static220.method3905(local28, local34, Static145.anInt3477) - Static257.anInt5593;
			@Pc(48) int local48 = local28 - Static229.anInt5072;
			@Pc(53) int local53 = local43 - Static48.anInt1350;
			@Pc(57) int local57 = local34 - Static157.anInt3612;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local48 * local48 + local57 * local57));
			Static38.anInt1151 = (int) (Math.atan2((double) local53, (double) local68) * 325.949D) & 0x7FF;
			Static97.anInt6055 = (int) (Math.atan2((double) local48, (double) local57) * -325.949D) & 0x7FF;
			if (Static38.anInt1151 < 128) {
				Static38.anInt1151 = 128;
			}
			if (Static38.anInt1151 > 383) {
				Static38.anInt1151 = 383;
			}
		}
		Static280.anInt5999 = 2;
	}
}
