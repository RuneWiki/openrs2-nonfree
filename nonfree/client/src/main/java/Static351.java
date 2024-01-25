import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "Lclient!qj;")
	public static final Class4_Sub34 aClass4_Sub34_2 = new Class4_Sub34(0, -1);

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_209 = new Class186(86, 8);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
	public static void method4926(@OriginalArg(0) int arg0) {
		Static158.anInt2992 = arg0;
		Static98.anInt2095 = 100;
		Static2.anInt6973 = 3;
		Static129.anInt2584 = -1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)Lclient!jo;")
	public static Class6_Sub3 method4929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub3_1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method4932(@OriginalArg(0) Class30 arg0) {
		if (Static416.anInt7072 != Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 && (Static40.aClass53ArrayArrayArray2 != null && Static284.method3972(Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, arg0))) {
			Static416.anInt7072 = Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86;
		}
	}
}
