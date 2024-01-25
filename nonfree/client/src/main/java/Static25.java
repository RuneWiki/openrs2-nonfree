import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public static int anInt460;

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "Lclient!saa;")
	public static Class4_Sub43 aClass4_Sub43_1;

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	public static int anInt461 = 500;

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
	public static int anInt465 = 0;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "[I")
	public static final int[] anIntArray108 = new int[1000];

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!vj;)V")
	public static void method447(@OriginalArg(1) Class10_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class10_Sub1_Sub2_Sub1) {
			@Pc(13) Class10_Sub1_Sub2_Sub1 local13 = (Class10_Sub1_Sub2_Sub1) arg0;
			if (local13.aClass54_1 != null) {
				Static274.method4403(local13, Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local13.aByte101);
				return;
			}
		} else if (arg0 instanceof Class10_Sub1_Sub2_Sub2) {
			@Pc(38) Class10_Sub1_Sub2_Sub2 local38 = (Class10_Sub1_Sub2_Sub2) arg0;
			Static116.method2400(Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 != local38.aByte101, local38);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
	public static void method449() {
		if (Static598.anInt9831 == 7) {
			Static362.method5445(false);
		} else {
			Static559.aClass45_2 = Static235.aClass45_1;
			Static235.aClass45_1 = null;
			Static33.method600(13);
		}
	}
}
