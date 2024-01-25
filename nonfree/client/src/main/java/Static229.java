import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_102 = new Class163(74, 8);

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "Lclient!la;")
	public static final Class136 aClass136_107 = new Class136(64, 5);

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	public static int anInt3847 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBIII)V")
	public static void method3306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 <= arg0) {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static296.anIntArrayArray42[local10][arg2] = arg3;
			}
		} else {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static296.anIntArrayArray42[local10][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z")
	public static boolean method3308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
