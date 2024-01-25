import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "B")
	public static byte aByte29;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
	public static final int anInt1377 = 1405;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)Lclient!qba;")
	public static Class2_Sub3_Sub13 method962() {
		@Pc(8) Class2_Sub3_Sub13 local8 = (Class2_Sub3_Sub13) Static128.aClass171_2.method3796();
		if (local8 != null) {
			local8.method7966();
			local8.method7767();
			return local8;
		}
		do {
			local8 = (Class2_Sub3_Sub13) Static266.aClass171_3.method3796();
			if (local8 == null) {
				return null;
			}
			if (local8.method6097() > Static548.method7437()) {
				return null;
			}
			local8.method7966();
			local8.method7767();
		} while ((Long.MIN_VALUE & local8.aLong260) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V")
	public static void method963() {
		if (Static201.anInt3963 == 9) {
			Static121.method1780(5);
		} else if (Static201.anInt3963 == 5 || Static201.anInt3963 == 6) {
			Static121.method1780(3);
		} else if (Static201.anInt3963 == 12) {
			Static121.method1780(3);
		}
	}
}
