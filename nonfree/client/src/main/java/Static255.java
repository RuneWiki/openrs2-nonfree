import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
	public static int anInt4111;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
	public static int anInt4112;

	@OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
	public static int anInt4105 = 1;

	@OriginalMember(owner = "client!mo", name = "I", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIII)V")
	public static void method3253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class185[] local3 = Static186.aClass185Array5;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class185 local11 = local3[local5];
			if (local11 != null && local11.anInt4814 == 2) {
				Static34.method521(local11.anInt4815, arg0 >> 1, local11.anInt4816, local11.anInt4813, arg3 >> 1, local11.anInt4819 * 2);
				if (Static31.anIntArray53[0] > -1 && Static266.anInt4392 % 20 < 10) {
					Static84.aClass13Array4[local11.anInt4818].method5668(Static31.anIntArray53[0] + arg2 - 12, arg1 + Static31.anIntArray53[1] - 28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V")
	public static void method3254() {
		if (Static228.aClass91_4 == null) {
			return;
		}
		if (Static228.aClass91_4.anInt2446 == 1) {
			Static228.aClass91_4 = null;
			return;
		}
		if (Static228.aClass91_4.anInt2446 == 2) {
			Static290.method3869(Static360.aClass183_4, 2, Static170.aString90);
			Static228.aClass91_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)Z")
	public static boolean method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static320.method4350(arg1, arg0) | Static404.method5118(arg0, arg1) | Static169.method2370(arg1, arg0)) & Static221.method2935(arg0, arg1);
	}
}
