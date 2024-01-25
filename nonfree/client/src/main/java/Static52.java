import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Lclient!km;")
	public static final Class211 aClass211_1 = new Class211(false);

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Lclient!km;")
	public static Class211 aClass211_2 = aClass211_1;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public static void method1372() {
		Static331.aClass208Array32 = null;
		if (Static649.aBoolean735 && Static545.method7549() != 1) {
			Static626.method8270(0, 0, Static675.method8725(), Static102.method2018(), Static520.anInt6836 == 3 || Static520.anInt6836 == 7);
		}
		@Pc(34) int local34 = 0;
		@Pc(40) int local40 = 0;
		if (Static649.aBoolean735) {
			local34 = Static359.method5380();
			local40 = Static265.method7952();
		}
		Static101.method1998(local34, Static483.anInt8181 + local40, local40, local40, local34 + Static654.anInt10064, local34, Static277.anInt5201, -1);
		if (Static331.aClass208Array32 != null) {
			Static61.method1524(true, -1412584499, local40, Static396.anInt6824, Static526.aClass208_10.anInt5615, Static331.aClass208Array32, local34 + Static654.anInt10064, Static325.anInt6036, local34, Static483.anInt8181 + local40);
			Static331.aClass208Array32 = null;
		}
	}
}
