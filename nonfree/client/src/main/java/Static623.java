import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!de;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!gh;)I")
	public static int method9262(@OriginalArg(1) Class15_Sub3_Sub3_Sub1_Sub2 arg0) {
		@Pc(8) Class312 local8 = arg0.aClass312_1;
		if (local8.anIntArray458 != null) {
			local8 = local8.method7953(Static113.aClass282_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt9093;
		@Pc(27) Class248 local27 = arg0.method3673();
		if (arg0.anInt3968 == -1 || arg0.aBoolean314) {
			local23 = local8.anInt9083;
		} else if (arg0.anInt3968 == local27.anInt7475 || local27.anInt7443 == arg0.anInt3968 || local27.anInt7472 == arg0.anInt3968 || local27.anInt7447 == arg0.anInt3968) {
			local23 = local8.anInt9078;
		} else if (local27.anInt7440 == arg0.anInt3968 || arg0.anInt3968 == local27.anInt7458 || local27.anInt7451 == arg0.anInt3968 || arg0.anInt3968 == local27.anInt7437) {
			local23 = local8.anInt9091;
		}
		return local23;
	}
}
