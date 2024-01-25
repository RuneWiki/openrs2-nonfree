import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "Lclient!fca;")
	public static Class97 aClass97_5;

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_68 = new Class40(105, 6);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)Lclient!af;")
	public static Class9 method2295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static208.aClass9ArrayArrayArray3[0][arg1][arg2] != null && Static208.aClass9ArrayArrayArray3[0][arg1][arg2].aClass9_1 != null;
			if (local28 && arg0 >= Static41.anInt687 - 1) {
				return null;
			}
			Static521.method7338(arg0, arg1, arg2);
		}
		return Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
	}
}
