import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!tj;")
	public static Class193 aClass193_47;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public static int anInt3100;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
	public static void method2837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass8_Sub2_1 != null) {
			local7.aClass8_Sub2_1 = null;
		}
		if (local7.aClass8_Sub2_2 != null) {
			local7.aClass8_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Z")
	public static boolean method2839(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
