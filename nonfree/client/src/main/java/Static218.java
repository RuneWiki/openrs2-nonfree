import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "[Lclient!hu;")
	public static Class21[] aClass21Array12;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	public static int anInt5023 = 104;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public static int anInt5024 = 0;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "Lclient!pfa;")
	public static Class253 aClass253_14 = new Class253(8);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!pk;)V")
	public static void method4118(@OriginalArg(1) Class15_Sub1_Sub2_Sub2_Sub2 arg0) {
		for (@Pc(16) Class8_Sub4 local16 = (Class8_Sub4) Static295.aClass43_32.method1422(); local16 != null; local16 = (Class8_Sub4) Static295.aClass43_32.method1426()) {
			if (arg0 == local16.aClass15_Sub1_Sub2_Sub2_Sub2_1) {
				if (local16.aClass8_Sub16_Sub3_2 != null) {
					Static15.aClass8_Sub16_Sub5_1.method7443(local16.aClass8_Sub16_Sub3_2);
					local16.aClass8_Sub16_Sub3_2 = null;
				}
				local16.method8640();
				return;
			}
		}
	}
}
