import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_10 = new Class180(1, 3);

	@OriginalMember(owner = "client!mo", name = "R", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_10 = new Class208(7, 0, 1, 1);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!sq;)V")
	public static void method3808(@OriginalArg(1) Class4_Sub2_Sub2_Sub2 arg0) {
		for (@Pc(10) Class2_Sub23 local10 = (Class2_Sub23) Static60.aClass265_15.method6005(); local10 != null; local10 = (Class2_Sub23) Static60.aClass265_15.method6001()) {
			if (arg0 == local10.aClass4_Sub2_Sub2_Sub2_1) {
				if (local10.aClass2_Sub18_Sub1_3 != null) {
					Static360.aClass2_Sub18_Sub4_2.method4456(local10.aClass2_Sub18_Sub1_3);
					local10.aClass2_Sub18_Sub1_3 = null;
				}
				local10.method6072();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V")
	public static void method3810() {
		@Pc(5) Class129 local5 = Static88.aClass129_14;
		synchronized (Static88.aClass129_14) {
			Static88.aClass129_14.method3028(5);
		}
	}
}
