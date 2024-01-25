import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "Lclient!jc;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Z")
	public static boolean aBoolean241 = true;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "Z")
	public static boolean aBoolean242 = false;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_68 = new Class211(55, -2);

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
	public static int anInt2824 = 0;

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
	public static int anInt2825 = 0;

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_94 = new Class48(14, -1);

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "Z")
	public static volatile boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIBIII)V")
	public static void method2317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class11[] local7 = Static274.aClass11Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class11 local15 = local7[local9];
			if (local15 != null && local15.anInt167 == 2) {
				Static135.method2024(local15.anInt180 + (local15.anInt179 - Static256.anInt4410 << 7), local15.anInt176, arg2 >> 1, local15.anInt168 * 2, local15.anInt178 + (local15.anInt174 - Static293.anInt5053 << 7), arg3 >> 1);
				if (Static202.anIntArray421[0] > -1 && Static366.anInt5883 % 20 < 10) {
					Static372.aClass51Array7[local15.anInt173].method4669(arg0 + Static202.anIntArray421[0] - 12, Static202.anIntArray421[1] + (arg1 - 28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
	public static void method2318() {
		Static222.anInt4507 = 0;
		Static76.anInt5658 = -1;
		Static224.anInt3825 = -1;
		Static190.anInt3337 = -1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Z")
	public static boolean method2319(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Lclient!go;")
	public static Class25_Sub3 method2323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub3_2;
	}
}
