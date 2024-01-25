import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
	public static int anInt7420;

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZLclient!iga;Lclient!iga;)V")
	public static void method6294(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_286 != null) {
			arg0.method7812();
		}
		arg0.aClass3_285 = arg1;
		arg0.aClass3_286 = arg1.aClass3_286;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aClass3_285.aClass3_286 = arg0;
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
	public static void method6295() {
		Static131.aClass43_5.method7144(Static589.aFloat224, Static143.aFloat182, Static503.aFloat176);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)V")
	public static void method6296(@OriginalArg(1) int arg0) {
		Static112.anInt2609 = -1;
		Static412.anInt6932 = arg0;
		Static474.anInt7705 = 100;
		Static440.anInt4098 = 3;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIB)I")
	public static int method6298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static277.anInt5091 < 100) {
			return -2;
		}
		@Pc(24) int local24 = -2;
		@Pc(26) int local26 = Integer.MAX_VALUE;
		@Pc(31) int local31 = arg2 - Static284.anInt7863;
		@Pc(36) int local36 = arg1 - Static284.anInt7865;
		for (@Pc(41) Class3_Sub41 local41 = (Class3_Sub41) Static284.aClass130_49.method3543(); local41 != null; local41 = (Class3_Sub41) Static284.aClass130_49.method3551()) {
			if (local41.anInt7163 == arg0) {
				@Pc(54) int local54 = local41.anInt7165;
				@Pc(57) int local57 = local41.anInt7161;
				@Pc(68) int local68 = local57 + Static284.anInt7865 | Static284.anInt7863 + local54 << 14;
				@Pc(87) int local87 = (local31 - local54) * (local31 + -local54) + (local36 - local57) * (local36 + -local57);
				if (local24 < 0 || local87 < local26) {
					local26 = local87;
					local24 = local68;
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII)V")
	public static void method6299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static110.anInt2597 && Static459.anInt7524 >= arg0 && Static385.anInt6630 <= arg1 && Static69.anInt1918 >= arg4) {
			Static280.method4446(arg2, arg1, arg4, arg0, arg3);
		} else {
			Static145.method2749(arg2, arg3, arg1, arg4, arg0);
		}
	}
}
