import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	public static int anInt6139;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
	public static int anInt6145;

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
	public static int anInt6147;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
	public static int anInt6141 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIIIIIII)Z")
	public static boolean method4834(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0];
		@Pc(18) int local18 = Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0];
		if (local8 < 0 || local8 >= Static296.anInt5187 || local18 < 0 || local18 >= Static206.anInt3607) {
			return false;
		} else if (arg7 >= 0 && Static296.anInt5187 > arg7 && arg3 >= 0 && Static206.anInt3607 > arg3) {
			@Pc(85) int local85 = Static262.method3695(arg3, arg0, local8, arg4, Static334.anIntArray390, arg7, Static81.anIntArray113, local18, arg5, arg6, Static447.aClass25_Sub5_Sub1_Sub2_4.method3427(), arg1, Static447.aClass14Array3[Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94], arg2);
			if (local85 < 1) {
				return false;
			}
			Static11.anInt185 = Static334.anIntArray390[local85 - 1];
			Static232.anInt4096 = Static81.anIntArray113[local85 - 1];
			Static14.aBoolean32 = false;
			Static102.method1561();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIZI)V")
	public static void method4835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static14.anInt293 == 0) {
			Static301.method4121(false);
		} else {
			Static89.anInt1631 = Static14.anInt293;
			Static379.method4990(0);
		}
		Static369.aBoolean698 = arg2;
		Static173.anInt2817 = arg1;
		Static125.anInt2320 = arg3;
		Static167.method1758(arg0);
	}
}
