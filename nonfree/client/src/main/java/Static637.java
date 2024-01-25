import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
	public static final int[] anIntArray682 = new int[64];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILclient!wg;BII)Z")
	public static boolean method8023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class379 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static79.aBoolean178 || !Static294.aBoolean394) {
			return false;
		} else if (Static111.anInt2390 < 100) {
			return false;
		} else if (arg4 != arg1 || arg2 != arg5) {
			for (@Pc(60) int local60 = arg1; local60 <= arg4; local60++) {
				for (@Pc(64) int local64 = arg5; local64 <= arg2; local64++) {
					if (Static167.anIntArrayArrayArray8[arg0][local60][local64] == -Static111.anInt2388) {
						return false;
					}
				}
			}
			if (Static59.method7565(arg3)) {
				Static89.anInt6960++;
				return true;
			} else {
				return false;
			}
		} else if (!Static213.method3543(arg0, arg1, arg5)) {
			return false;
		} else if (Static59.method7565(arg3)) {
			Static89.anInt6960++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	public static void method8027() {
		@Pc(13) Class2_Sub1 local13 = (Class2_Sub1) Static574.aClass114_53.method2772();
		@Pc(24) boolean local24 = Static351.aClass303_13 != null || Static272.anInt5078 > 0;
		@Pc(28) int local28 = local13.method7155();
		@Pc(32) int local32 = local13.method7157();
		if (local24) {
			Static294.anInt5309 = 1;
		}
		if (local24) {
			Static376.aClass2_Sub7_Sub21_4 = Static10.aClass2_Sub7_Sub21_1;
		} else {
			Static151.method2661(Static10.aClass2_Sub7_Sub21_1, local32, local28);
		}
	}
}
