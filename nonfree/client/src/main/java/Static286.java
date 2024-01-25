import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "[I")
	public static final int[] anIntArray310 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public static int anInt5571 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)Z")
	public static boolean method4618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static493.aBoolean702) {
			return false;
		}
		@Pc(11) int local11 = arg1 >> 16;
		@Pc(15) int local15 = arg1 & 0xFFFF;
		if (Static648.aClass345ArrayArray2[local11] == null || Static648.aClass345ArrayArray2[local11][local15] == null) {
			return false;
		}
		@Pc(38) Class345 local38 = Static648.aClass345ArrayArray2[local11][local15];
		@Pc(52) Class5_Sub3_Sub20 local52;
		if (arg0 == -1 && local38.anInt9591 == 0) {
			for (local52 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local52 != null; local52 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
				if (local52.anInt10178 == 9 || local52.anInt10178 == 1012 || local52.anInt10178 == 45 || local52.anInt10178 == 52 || local52.anInt10178 == 18) {
					for (@Pc(82) Class345 local82 = Static264.method4120(local52.anInt10176); local82 != null; local82 = Static17.method233(local82)) {
						if (local38.anInt9664 == local82.anInt9664) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local52 != null; local52 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
				if (local52.anInt10179 == arg0 && local52.anInt10176 == local38.anInt9664 && (local52.anInt10178 == 9 || local52.anInt10178 == 1012 || local52.anInt10178 == 45 || local52.anInt10178 == 52 || local52.anInt10178 == 18)) {
					return true;
				}
			}
		}
		return false;
	}
}
