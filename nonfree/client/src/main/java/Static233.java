import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public static int anInt8026;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
	public static void method6719(@OriginalArg(1) int arg0) {
		Static414.method7235();
		Static179.method2981();
		Static76.method1563(true, arg0);
		Static277.method4361(Static103.aClass39_3, Static460.aClass53_147, Static36.aClass53_10);
		Static494.method7273(Static103.aClass39_3, Static460.aClass53_147);
		Static119.method2312();
		Static117.method2254(Static42.aClass35Array3);
		Static190.method3102();
		Static436.method6681();
		if (Static271.anInt8654 == 2) {
			Static301.method4738(3);
		} else if (Static271.anInt8654 == 6) {
			Static301.method4738(7);
		} else if (Static271.anInt8654 == 9) {
			Static301.method4738(10);
		} else if (Static271.anInt8654 == 1) {
			Static83.method1624(Static460.aClass53_147, Static103.aClass39_3);
			return;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = local7 * (Static536.aShort164 - Static296.aShort113) / 100 + Static296.aShort113;
		@Pc(39) int local39 = arg5 * local33 >> 8;
		@Pc(45) int local45 = 16384 - arg2 & 0x3FFF;
		@Pc(52) int local52 = 16384 - arg6 & 0x3FFF;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = local39;
		if (local45 != 0) {
			local56 = -local39 * Class125.anIntArray381[local45] >> 15;
			local58 = local39 * Class125.anIntArray382[local45] >> 15;
		}
		if (local52 != 0) {
			local54 = local58 * Class125.anIntArray381[local52] >> 15;
			local58 = local58 * Class125.anIntArray382[local52] >> 15;
		}
		Static187.anInt3432 = arg3 - local54;
		Static344.anInt6362 = 0;
		Static353.anInt5258 = arg0 - local58;
		Static329.anInt3848 = arg4 - local56;
		Static429.anInt7997 = arg6;
		Static209.anInt3769 = arg2;
	}
}
