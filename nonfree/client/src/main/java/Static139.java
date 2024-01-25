import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!faa", name = "Qb", descriptor = "Lclient!so;")
	public static Class6_Sub15_Sub3 aClass6_Sub15_Sub3_1;

	@OriginalMember(owner = "client!faa", name = "Jc", descriptor = "Lclient!lv;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIII)V")
	public static void method2293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > arg3) {
			Static264.method4006(arg0, arg1, arg3, Static155.anIntArrayArray32[arg2]);
		} else {
			Static264.method4006(arg3, arg1, arg0, Static155.anIntArrayArray32[arg2]);
		}
	}
}
