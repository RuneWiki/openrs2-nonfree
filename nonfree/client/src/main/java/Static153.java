import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_7 = new Class70();

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "[I")
	public static final int[] anIntArray208 = new int[1];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!wo;Z)V")
	public static void method2102(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort120; local2 <= arg0.aShort119; local2++) {
			for (@Pc(6) int local6 = arg0.aShort121; local6 <= arg0.aShort122; local6++) {
				@Pc(16) Class228 local16 = Static469.aClass228ArrayArrayArray6[arg0.aByte128][local2][local6];
				if (local16 != null) {
					@Pc(21) Class180 local21 = local16.aClass180_3;
					@Pc(23) Class180 local23 = null;
					while (local21 != null) {
						if (local21.aClass12_Sub2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass180_3 = local21.aClass180_2;
							} else {
								local23.aClass180_2 = local21.aClass180_2;
							}
							local21.method3654();
							break;
						}
						local23 = local21;
						local21 = local21.aClass180_2;
					}
				}
			}
		}
		if (!arg1) {
			Static324.method4715(arg0);
		}
	}
}
