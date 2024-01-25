import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!sj;I)I")
	public static int method454(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt6217;
		@Pc(19) Class133 local19 = arg0.method4910();
		if (arg0.aBoolean410) {
			local13 = arg0.anInt6231;
		} else if (arg0.lb == local19.anInt3510 || arg0.lb == local19.anInt3515 || local19.anInt3526 == arg0.lb || local19.anInt3544 == arg0.lb) {
			local13 = arg0.anInt6208;
		} else if (local19.anInt3507 == arg0.lb || arg0.lb == local19.anInt3542 || local19.anInt3513 == arg0.lb || local19.anInt3532 == arg0.lb) {
			local13 = arg0.anInt6216;
		}
		return local13;
	}
}
