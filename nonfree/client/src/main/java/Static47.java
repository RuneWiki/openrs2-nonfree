import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public static void method710(@OriginalArg(1) int arg0) {
		Static329.method4207();
		@Pc(18) int local18 = Static183.aClass269_3.method5607(arg0).anInt6813;
		if (local18 == 0) {
			return;
		}
		@Pc(26) int local26 = Static364.aClass259_1.anIntArray487[arg0];
		if (local18 == 6) {
			Static382.anInt6348 = local26;
		}
		if (local18 == 5) {
			Static354.anInt5869 = local26;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method711() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static35.aBooleanArray6[local7] = false;
		}
		Static71.anInt1332 = 0;
		Static333.anInt5460 = Static409.anInt6636;
		Static388.anInt903 = 0;
		Static202.anInt3320 = Static368.anInt6250;
		Static34.anInt678 = Static401.anInt3623;
		Static214.anInt7430 = -1;
		Static427.anInt6992 = Static278.anInt4391;
		Static367.anInt6214 = -1;
		Static100.anInt1781 = 5;
		Static211.anInt3377 = Static8.anInt7337;
		Static201.anInt3268 = Static5.anInt113;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)Z")
	public static boolean method712(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static213.aClass128_22.method3536();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static213.aClass128_22.method3548();
		} else if (!Static213.aClass128_22.method3597()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static336.aClass106_Sub1_1.aBoolean459 = arg0;
			Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
			return true;
		}
	}
}
