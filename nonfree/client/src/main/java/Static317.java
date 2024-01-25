import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "Lclient!oha;")
	public static Class256 aClass256_1;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
	public static int anInt5596 = -1;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
	public static int anInt5602 = 0;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!cc;I)I")
	public static int method4870(@OriginalArg(0) Class16_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(6) Class113 local6 = arg0.aClass113_1;
		if (local6.anIntArray213 != null) {
			local6 = local6.method2752(Static382.aClass282_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local6.anInt3239;
		@Pc(25) Class291 local25 = arg0.method7007();
		if (arg0.anInt8095 == -1 || arg0.aBoolean588) {
			local21 = local6.anInt3214;
		} else if (local25.anInt7640 == arg0.anInt8095 || arg0.anInt8095 == local25.anInt7641 || arg0.anInt8095 == local25.anInt7626 || local25.anInt7625 == arg0.anInt8095) {
			local21 = local6.anInt3240;
		} else if (local25.anInt7633 == arg0.anInt8095 || local25.anInt7617 == arg0.anInt8095 || arg0.anInt8095 == local25.anInt7610 || arg0.anInt8095 == local25.anInt7635) {
			local21 = local6.anInt3237;
		}
		return local21;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method4873(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static106.method1965(arg0, arg1) : Integer.toString(arg0);
	}
}
