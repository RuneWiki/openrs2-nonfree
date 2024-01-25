import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lia", name = "F", descriptor = "Lclient!sha;")
	public static Class307 aClass307_1;

	@OriginalMember(owner = "client!lia", name = "L", descriptor = "Lclient!fd;")
	public static Class103 aClass103_33;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5360(@OriginalArg(1) Class82 arg0) {
		if (Static253.aBoolean362) {
			Static102.method1714(arg0);
		} else {
			Static128.method1424(arg0);
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IB)Lclient!uv;")
	public static Class344 method5363(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static319.aClass344ArrayArray2[local7] == null || Static319.aClass344ArrayArray2[local7][local16] == null) {
			@Pc(32) boolean local32 = Static64.method1061(local7);
			if (!local32) {
				return null;
			}
		}
		return Static319.aClass344ArrayArray2[local7][local16];
	}
}
