import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
	public static int anInt5271;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Z")
	public static final boolean aBoolean456 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!fh;)Z")
	public static boolean method4267(@OriginalArg(1) Class83 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean197) {
			return false;
		} else if (!arg0.method1708(Static169.anInterface11_2)) {
			return false;
		} else if (Static109.aClass240_8.method5439((long) arg0.anInt2321) == null) {
			return Static215.aClass240_20.method5439((long) arg0.anInt2313) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBLclient!it;)V")
	public static void method4269(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub2_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt6463 > Static164.anInt3206) {
			Static323.method4620(arg1);
		} else if (Static164.anInt3206 <= arg1.anInt6457) {
			Static269.method4015(arg1);
		} else {
			Static323.method4619(arg1, false);
			local9 = Static150.anInt2861;
			local7 = Static279.anInt5105;
		}
		if (arg1.anInt7117 < 128 || arg1.anInt7111 < 128 || arg1.anInt7117 >= (Static81.anInt1950 - 1) * 128 || Static171.anInt3288 * 128 - 128 <= arg1.anInt7111) {
			arg1.anInt6509 = -1;
			local9 = 0;
			local7 = -1;
			arg1.anInt6463 = 0;
			arg1.anInt6469 = -1;
			arg1.anInt6449 = -1;
			arg1.anInt6457 = 0;
			arg1.anInt7117 = arg1.anIntArray436[0] * 128 + arg1.method5118() * 64;
			arg1.anInt7111 = arg1.anIntArray437[0] * 128 + arg1.method5118() * 64;
			arg1.method5126();
		}
		if (Static231.aClass4_Sub2_Sub2_Sub1_2 == arg1 && (arg1.anInt7117 < 1536 || arg1.anInt7111 < 1536 || Static81.anInt1950 * 128 - 1536 <= arg1.anInt7117 || (Static171.anInt3288 - 12) * 128 <= arg1.anInt7111)) {
			local9 = 0;
			arg1.anInt6509 = -1;
			arg1.anInt6463 = 0;
			arg1.anInt6449 = -1;
			arg1.anInt6457 = 0;
			local7 = -1;
			arg1.anInt6469 = -1;
			arg1.anInt7117 = arg1.anIntArray436[0] * 128 + arg1.method5118() * 64;
			arg1.anInt7111 = arg1.anIntArray437[0] * 128 + arg1.method5118() * 64;
			arg1.method5126();
		}
		@Pc(213) int local213 = Static177.method2779(arg1);
		Static205.method3170(local7, local213, local9, arg1);
		Static95.method1597(arg1);
	}
}
