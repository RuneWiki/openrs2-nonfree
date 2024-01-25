import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!vca", name = "Q", descriptor = "I")
	public static int anInt9742;

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_194 = new Class126(115, -2);

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "[I")
	public static final int[] anIntArray631 = new int[2];

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIZIIIIII)Z")
	public static boolean method8288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(16) int local16 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0];
		@Pc(21) int local21 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0];
		if (local16 < 0 || local16 >= Static251.anInt4680 || local21 < 0 || Static406.anInt6924 <= local21) {
			return false;
		} else if (arg3 >= 0 && arg3 < Static251.anInt4680 && arg5 >= 0 && arg5 < Static406.anInt6924) {
			@Pc(87) int local87 = Static398.method5728(arg0, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625(), arg6, arg5, local21, Static27.aClass198Array1[Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142], arg2, arg3, Static437.anIntArray458, arg7, Static207.anIntArray259, arg1, local16, arg4);
			if (local87 < 1) {
				return false;
			}
			Static75.anInt1704 = Static207.anIntArray259[local87 - 1];
			Static217.anInt4007 = Static437.anIntArray458[local87 - 1];
			Static301.aBoolean425 = false;
			Static349.method5246();
			return true;
		} else {
			return false;
		}
	}
}
