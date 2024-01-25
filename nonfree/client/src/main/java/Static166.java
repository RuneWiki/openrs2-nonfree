import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "Lclient!mn;")
	public static Class171 aClass171_41;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "[S")
	public static short[] aShortArray44;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass11_Sub3_1 != null) {
			local7.aClass11_Sub3_1 = null;
		}
	}
}
