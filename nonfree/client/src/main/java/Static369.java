import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
	public static final int[] anIntArray491 = new int[4096];

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "[I")
	public static final int[] anIntArray492 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!qa;Lclient!co;III)V")
	public static void method5692(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class206 local12;
		if (arg3 < Static488.anInt8353) {
			local12 = Static313.aClass206ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass47_Sub3_1 != null && local12.aClass47_Sub3_1.method7156()) {
				arg1.method7166(arg0, 0, true, Static40.anInt1354, 0, local12.aClass47_Sub3_1);
			}
		}
		if (arg4 < Static488.anInt8353) {
			local12 = Static313.aClass206ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass47_Sub3_1 != null && local12.aClass47_Sub3_1.method7156()) {
				arg1.method7166(arg0, 0, true, 0, Static40.anInt1354, local12.aClass47_Sub3_1);
			}
		}
		if (arg3 < Static488.anInt8353 && arg4 < Static60.anInt1677) {
			local12 = Static313.aClass206ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass47_Sub3_1 != null && local12.aClass47_Sub3_1.method7156()) {
				arg1.method7166(arg0, 0, true, Static40.anInt1354, Static40.anInt1354, local12.aClass47_Sub3_1);
			}
		}
		if (arg3 < Static488.anInt8353 && arg4 > 0) {
			local12 = Static313.aClass206ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass47_Sub3_1 != null && local12.aClass47_Sub3_1.method7156()) {
				arg1.method7166(arg0, 0, true, Static40.anInt1354, -Static40.anInt1354, local12.aClass47_Sub3_1);
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZII)Z")
	public static boolean method5693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
