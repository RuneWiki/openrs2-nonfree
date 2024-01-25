import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Lclient!dba;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	public static int anInt1234;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_39 = new Class362(81, 3);

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	public static int anInt1237 = -1;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public static void method1198() {
		if (Static203.anInt3855 == 3) {
			Static285.method5604(4);
		} else if (Static203.anInt3855 == 7) {
			Static285.method5604(8);
		} else if (Static203.anInt3855 == 10) {
			Static285.method5604(11);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lclient!rc;")
	public static Class285 method1199(@OriginalArg(0) int arg0) {
		@Pc(10) Class285 local10 = (Class285) Static325.aClass223_68.method5388((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static501.aClass176_88.method3994(arg0, 0);
		local10 = new Class285();
		if (local20 != null) {
			local10.method6848(arg0, new Class4_Sub11(local20));
		}
		Static325.aClass223_68.method5394(local10, (long) arg0);
		return local10;
	}
}
