import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!mu;")
	public static Class165 aClass165_3;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	public static int anInt2869;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!pv;Z)V")
	public static void method2328(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0) {
		for (@Pc(10) Class5_Sub31 local10 = (Class5_Sub31) Static45.aClass177_2.method3618(); local10 != null; local10 = (Class5_Sub31) Static45.aClass177_2.method3619()) {
			if (local10.aClass2_Sub1_Sub3_Sub1_2 == arg0) {
				if (local10.aClass5_Sub22_Sub2_4 != null) {
					Static119.aClass5_Sub22_Sub3_3.method3636(local10.aClass5_Sub22_Sub2_4);
					local10.aClass5_Sub22_Sub2_4 = null;
				}
				local10.method6003();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!pv;)I")
	public static int method2331(@OriginalArg(1) Class2_Sub1_Sub3_Sub1 arg0) {
		@Pc(8) Class131 local8 = arg0.aClass131_1;
		if (local8.anIntArray209 != null) {
			local8 = local8.method2781(Static408.aClass39_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(25) int local25 = local8.anInt3487;
		@Pc(34) Class133 local34 = arg0.method4910();
		if (arg0.aBoolean410) {
			local25 = local8.anInt3480;
		} else if (local34.anInt3510 == arg0.lb || arg0.lb == local34.anInt3515 || local34.anInt3526 == arg0.lb || local34.anInt3544 == arg0.lb) {
			local25 = local8.anInt3476;
		} else if (local34.anInt3507 == arg0.lb || local34.anInt3542 == arg0.lb || local34.anInt3513 == arg0.lb || arg0.lb == local34.anInt3532) {
			local25 = local8.anInt3482;
		}
		return local25;
	}
}
