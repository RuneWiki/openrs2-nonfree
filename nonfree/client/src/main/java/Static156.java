import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public static int anInt5522;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "S")
	public static short aShort43 = 32767;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public static int anInt5521 = 0;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_31 = new Class1();

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
	public static int[] anIntArray488 = new int[50];

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString259 = "Face here";

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!jd;II)[Lclient!hk;")
	public static Class71_Sub1[] method4439(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		return Static61.method2444(arg0, arg1) ? Static214.method3629() : null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!fc;IIIII)V")
	public static void method4440(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static63.anInt1426) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static26.anInt552) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static232.anInt4787 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class2_Sub31 local71 = Static180.aClass2_Sub31ArrayArrayArray2[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static141.anIntArrayArrayArray4[local17][local28][local39] + Static141.anIntArrayArrayArray4[local17][local28 + 1][local39] + Static141.anIntArrayArrayArray4[local17][local28][local39 + 1] + Static141.anIntArrayArrayArray4[local17][local28 + 1][local39 + 1]) / 4 - (Static141.anIntArrayArrayArray4[arg1][arg2][arg3] + Static141.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + Static141.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + Static141.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class168 local161 = local71.aClass168_1;
									if (local161 != null) {
										if (local161.aClass36_10.method4891()) {
											arg0.method4877(local161.aClass36_10, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass36_9 != null && local161.aClass36_9.method4891()) {
											arg0.method4877(local161.aClass36_9, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt5708; local232++) {
										@Pc(241) Class34 local241 = local71.aClass34Array2[local232];
										if (local241 != null && local241.aClass36_1.method4891() && (local28 == local241.anInt894 || local28 == local3) && (local39 == local241.anInt897 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt896 + 1 - local241.anInt894;
											@Pc(278) int local278 = local241.anInt902 + 1 - local241.anInt897;
											arg0.method4877(local241.aClass36_1, (local241.anInt894 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt897 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
