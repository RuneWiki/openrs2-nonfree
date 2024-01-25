import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[200];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)Lclient!uaa;")
	public static Class3_Sub49 method6842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub49 local7 = new Class3_Sub49();
		local7.anInt9245 = arg1;
		local7.anInt9244 = arg0;
		Static204.aClass297_16.method6537((long) arg3, local7);
		Static336.method4909(arg0);
		@Pc(26) Class251 local26 = Static105.method2180(arg3);
		if (local26 != null) {
			Static588.method8016(local26);
		}
		if (Static463.aClass251_12 != null) {
			Static588.method8016(Static463.aClass251_12);
			Static463.aClass251_12 = null;
		}
		Static57.method1396();
		if (local26 != null) {
			Static479.method6546(local26, !arg2);
		}
		if (!arg2) {
			Static583.method7926(arg0);
		}
		if (!arg2 && Static79.anInt2118 != -1) {
			Static51.method4569(1, Static79.anInt2118);
		}
		return local7;
	}
}
