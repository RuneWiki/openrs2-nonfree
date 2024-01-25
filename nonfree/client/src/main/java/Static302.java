import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "[Lclient!ada;")
	public static final Class8_Sub1[] aClass8_Sub1Array5 = new Class8_Sub1[8];

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!tp;Z)V")
	public static void method4922(@OriginalArg(0) Class331 arg0) {
		if (arg0.anInt9490 == 5 && arg0.anInt9570 != -1) {
			Static521.method7423(Static171.aClass16_5, arg0);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBILclient!vc;I)V")
	public static void method4925(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class352 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class8_Sub4 local10 = (Class8_Sub4) Static584.aClass43_63.method1422(); local10 != null; local10 = (Class8_Sub4) Static584.aClass43_63.method1426()) {
			if (local10.anInt1047 == arg3 && arg0 << 9 == local10.anInt1056 && local10.anInt1059 == arg1 << 9 && arg2.anInt10077 == local10.aClass352_1.anInt10077) {
				if (local10.aClass8_Sub16_Sub3_2 != null) {
					Static15.aClass8_Sub16_Sub5_1.method7443(local10.aClass8_Sub16_Sub3_2);
					local10.aClass8_Sub16_Sub3_2 = null;
				}
				if (local10.aClass8_Sub16_Sub3_1 != null) {
					Static15.aClass8_Sub16_Sub5_1.method7443(local10.aClass8_Sub16_Sub3_1);
					local10.aClass8_Sub16_Sub3_1 = null;
				}
				local10.method8640();
				return;
			}
		}
	}
}
