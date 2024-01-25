import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public static int anInt550 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!hn;I)I")
	public static int method680(@OriginalArg(0) Class15_Sub2_Sub1 arg0) {
		if (arg0.anInt4741 == 0) {
			return 0;
		}
		@Pc(67) int local67;
		@Pc(61) int local61;
		if (arg0.anInt4720 != -1) {
			@Pc(20) Class15_Sub2_Sub1 local20 = null;
			if (arg0.anInt4720 < 32768) {
				@Pc(48) Class5_Sub51 local48 = (Class5_Sub51) Static521.aClass42_42.method1109((long) arg0.anInt4720);
				if (local48 != null) {
					local20 = local48.aClass15_Sub2_Sub1_Sub2_2;
				}
			} else if (arg0.anInt4720 >= 32768) {
				local20 = Static10.aClass15_Sub2_Sub1_Sub1Array1[arg0.anInt4720 - 32768];
			}
			if (local20 != null) {
				local61 = arg0.anInt8492 - local20.anInt8492;
				local67 = arg0.anInt8493 - local20.anInt8493;
				if (local61 != 0 || local67 != 0) {
					arg0.method4036((int) (Math.atan2((double) local61, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class15_Sub2_Sub1_Sub1) {
			@Pc(95) Class15_Sub2_Sub1_Sub1 local95 = (Class15_Sub2_Sub1_Sub1) arg0;
			if (local95.anInt861 != -1 && (local95.anInt4753 == 0 || local95.anInt4755 > 0)) {
				local95.method4036(local95.anInt861);
				local95.anInt861 = -1;
			}
		} else if (arg0 instanceof Class15_Sub2_Sub1_Sub2) {
			@Pc(126) Class15_Sub2_Sub1_Sub2 local126 = (Class15_Sub2_Sub1_Sub2) arg0;
			if (local126.anInt4775 != -1 && (local126.anInt4753 == 0 || local126.anInt4755 > 0)) {
				local61 = local126.anInt8492 - (local126.anInt4775 - Static515.anInt3214 - Static515.anInt3214) * 64;
				local67 = local126.anInt8493 - (local126.anInt4760 - Static338.anInt6353 - Static338.anInt6353) * 64;
				if (local61 != 0 || local67 != 0) {
					local126.method4036((int) (Math.atan2((double) local61, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
				local126.anInt4775 = -1;
			}
		}
		return arg0.method4039();
	}
}
