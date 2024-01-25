import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "Lclient!rc;")
	public static Class298 aClass298_13;

	@OriginalMember(owner = "client!sq", name = "G", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_170 = new Class136(85, 1);

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "Lclient!cga;")
	public static final Class52 aClass52_5 = new Class52();

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 512 || arg4 < 512 || arg3 > Static111.anInt1752 * 512 - 1024 || Static279.anInt4567 * 512 - 1024 < arg4) {
			Static515.anIntArray676[0] = Static515.anIntArray676[1] = -1;
			return;
		}
		@Pc(60) int local60 = Static600.method8378(arg4, arg3, arg2) - arg0;
		if (Static144.aBoolean196) {
			Static125.method1885(true);
		} else {
			Static468.aClass117_6.method7247(arg6, 0, 0);
			Static485.aClass126_17.method7040(Static468.aClass117_6);
		}
		if (Static605.aBoolean812) {
			Static485.aClass126_17.HA(arg3, local60, arg4, Static461.anInt7840, Static515.anIntArray676);
		} else {
			Static485.aClass126_17.da(arg3, local60, arg4, Static515.anIntArray676);
		}
		if (Static144.aBoolean196) {
			Static348.method5296();
		} else {
			Static468.aClass117_6.method7247(-arg6, 0, 0);
			Static485.aClass126_17.method7040(Static468.aClass117_6);
		}
	}
}
