import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lia", name = "C", descriptor = "S")
	public static short aShort85 = 320;

	@OriginalMember(owner = "client!lia", name = "G", descriptor = "I")
	public static int anInt5879 = 0;

	@OriginalMember(owner = "client!lia", name = "K", descriptor = "I")
	public static int anInt5883 = 0;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IFFF)I")
	public static int method4894(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(39) float local39 = arg2 < 0.0F ? -arg2 : arg2;
		if (local30 > local21 && local30 > local39) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local21 < local39 && local30 < local39) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!fca;I)I")
	public static int method4895(@OriginalArg(0) Class11_Sub1_Sub1_Sub2_Sub2 arg0) {
		@Pc(6) Class236 local6 = arg0.aClass236_1;
		if (local6.anIntArray462 != null) {
			local6 = local6.method5779(Static438.aClass198_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(21) int local21 = local6.anInt6920;
		@Pc(25) Class165 local25 = arg0.method2761();
		if (arg0.anInt3253 == -1 || arg0.aBoolean275) {
			local21 = local6.anInt6888;
		} else if (arg0.anInt3253 == local25.anInt4881 || arg0.anInt3253 == local25.anInt4914 || local25.anInt4905 == arg0.anInt3253 || local25.anInt4875 == arg0.anInt3253) {
			local21 = local6.anInt6884;
		} else if (arg0.anInt3253 == local25.anInt4899 || arg0.anInt3253 == local25.anInt4916 || local25.anInt4902 == arg0.anInt3253 || arg0.anInt3253 == local25.anInt4910) {
			local21 = local6.anInt6915;
		}
		return local21;
	}
}
