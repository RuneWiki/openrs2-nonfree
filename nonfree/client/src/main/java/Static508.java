import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!h;")
	public static final Class114 aClass114_162 = new Class114(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)[Lclient!lt;")
	public static Class185[] method7305() {
		return new Class185[] { Static30.aClass185_2, Static97.aClass185_6, Static21.aClass185_1 };
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	private static void method7306() {
		if (Static478.aClass9_10 == null) {
			return;
		}
		Static314.aClass145_5.method3920();
		Static42.method1368();
		Static540.method7892();
		Static145.method2988();
		Static33.method1296();
		Static7.method226();
		if (Static446.aClass89_1 != null) {
			Static446.aClass89_1.method2910();
		}
		Static57.method1557();
		Static33.method1299();
		Static423.method7535();
		Static165.method3262(false);
		Static169.method3302();
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(42) Class47_Sub2_Sub3_Sub2 local42 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local37];
			if (local42 != null) {
				local42.aClass1_Sub47_3 = null;
				for (@Pc(49) int local49 = 0; local49 < local42.aClass19Array3.length; local49++) {
					local42.aClass19Array3[local49] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static198.anInt4112; local71++) {
			@Pc(77) Class47_Sub2_Sub3_Sub1 local77 = Static395.aClass1_Sub10Array1[local71].aClass47_Sub2_Sub3_Sub1_2;
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass19Array3.length; local81++) {
					local77.aClass19Array3[local81] = null;
				}
			}
		}
		Static163.aClass22_6 = null;
		Static56.aClass22_5 = null;
		Static478.aClass9_10.method7585();
		Static478.aClass9_10 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	public static void method7307(@OriginalArg(0) int arg0) {
		method7306();
		Static524.method7447();
		Static21.method867(true, arg0);
		Static304.method5079(Static478.aClass9_10, Static309.aClass160_69, Static390.aClass160_80);
		Static215.method3858(Static390.aClass160_80, Static478.aClass9_10);
		Static145.method2988();
		Static135.method2902(Static107.aClass12Array9);
		Static278.method4744();
		Static418.method6218();
		if (Static51.anInt7926 == 2) {
			Static265.method4401(3);
		} else if (Static51.anInt7926 == 6) {
			Static265.method4401(7);
		} else if (Static51.anInt7926 == 9) {
			Static265.method4401(10);
		} else if (Static51.anInt7926 == 1) {
			Static501.method7180(Static390.aClass160_80, Static478.aClass9_10);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!faa;IIIIII)V")
	public static void method7308(@OriginalArg(0) Class47_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static19.method827(arg3, arg1, arg0.anInt8189, arg0.anInt8191, 0, arg0.aByte94, arg2);
	}
}
