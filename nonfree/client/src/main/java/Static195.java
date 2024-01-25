import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public static int anInt3319 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BF)F")
	public static float method2635(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public static void method2636() {
		@Pc(5) Class132 local5 = Static459.aClass132_35;
		synchronized (Static459.aClass132_35) {
			Static459.aClass132_35.method2708();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Lclient!mc;")
	public static Class2_Sub5_Sub11 method2637() {
		@Pc(13) Class2_Sub5_Sub11 local13 = (Class2_Sub5_Sub11) Static334.aClass261_10.method5489();
		if (local13 != null) {
			local13.method5703();
			local13.method5621();
			return local13;
		}
		do {
			local13 = (Class2_Sub5_Sub11) Static242.aClass261_9.method5489();
			if (local13 == null) {
				return null;
			}
			if (local13.method3097() > Static110.method1702()) {
				return null;
			}
			local13.method5703();
			local13.method5621();
		} while ((local13.aLong220 & Long.MIN_VALUE) == 0L);
		return local13;
	}
}
