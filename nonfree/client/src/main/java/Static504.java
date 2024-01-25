import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)V")
	public static void method6852(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub5_Sub11 local14 = Static652.method8695((long) arg0, 12);
		local14.method3956();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IC)Z")
	public static boolean method6854(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
