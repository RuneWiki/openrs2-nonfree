import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!op", name = "Y", descriptor = "I")
	public static int anInt3446;

	@OriginalMember(owner = "client!op", name = "K", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_108 = new Class92(58, 11);

	@OriginalMember(owner = "client!op", name = "W", descriptor = "I")
	public static int anInt3444 = -1;

	@OriginalMember(owner = "client!op", name = "X", descriptor = "I")
	public static int anInt3445 = -1;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!tn;I)Z")
	public static boolean method2803(@OriginalArg(0) Class223 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean470) {
			return false;
		} else if (!arg0.method5283(Static210.anInterface8_2)) {
			return false;
		} else if (Static371.aClass127_30.method3246((long) arg0.anInt6728) == null) {
			return Static179.aClass127_19.method3246((long) arg0.anInt6730) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V")
	public static void method2805(@OriginalArg(0) int arg0) {
		if (arg0 == Static142.anInt3209) {
			return;
		}
		if (Static142.anInt3209 == 0) {
			Static291.method4275();
		}
		if (arg0 == 40) {
			Static82.method1419();
		}
		if (arg0 != 40 && Static388.aClass27_4 != null) {
			Static388.aClass27_4.method893();
			Static388.aClass27_4 = null;
		}
		if (Static142.anInt3209 == 25 || Static142.anInt3209 == 28) {
			Static104.aClass56_27.anInt1678 = 2;
			Static116.aClass56_76.anInt1678 = 2;
			Static270.aClass56_74.anInt1678 = 2;
			Static241.aClass56_62.anInt1678 = 2;
			Static212.aClass56_53.anInt1678 = 2;
			Static445.aClass56_99.anInt1678 = 2;
			Static5.aClass56_3.anInt1678 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static104.anInt2300 = 1;
			Static202.anInt4031 = 0;
			Static439.anInt7489 = 0;
			Static383.anInt6683 = 0;
			Static189.anInt3804 = 1;
			Static164.method2884(true);
			Static104.aClass56_27.anInt1678 = 1;
			Static116.aClass56_76.anInt1678 = 1;
			Static270.aClass56_74.anInt1678 = 1;
			Static241.aClass56_62.anInt1678 = 1;
			Static212.aClass56_53.anInt1678 = 1;
			Static445.aClass56_99.anInt1678 = 1;
			Static5.aClass56_3.anInt1678 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static193.method5123();
		}
		if (arg0 == 5) {
			Static328.method4780(Static266.aClass75_7, Static20.aClass56_10);
		} else {
			Static234.method3682();
		}
		@Pc(143) boolean local143 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(158) boolean local158 = Static142.anInt3209 == 5 || Static142.anInt3209 == 10 || Static142.anInt3209 == 28;
		if (local158 != local143) {
			if (local143) {
				Static257.anInt4778 = Static251.anInt4729;
				if (Static123.aClass21_Sub1_1.anInt871 == 0) {
					Static82.method1421();
				} else {
					Static92.method1580(Static251.anInt4729, Static160.aClass56_39, Static123.aClass21_Sub1_1.anInt871);
				}
				Static215.aClass183_2.method4496(false);
			} else {
				Static82.method1421();
				Static215.aClass183_2.method4496(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static266.aClass75_7.method2579();
		}
		Static142.anInt3209 = arg0;
	}
}
