import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bga", name = "B", descriptor = "Z")
	public static boolean aBoolean28;

	@OriginalMember(owner = "client!bga", name = "G", descriptor = "I")
	public static int anInt602 = -1;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(IB)V")
	public static void method560(@OriginalArg(0) int arg0) {
		if (Static539.anInt8853 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static328.aString57 == null) {
				Static15.method252(Static159.aString25, Static154.aString24, Static69.anInt1053);
			} else {
				Static490.method7171(Static69.anInt1053);
			}
		}
		if (arg0 != 13 && Static616.aClass240_32 != null) {
			Static616.aClass240_32.method5658();
			Static616.aClass240_32 = null;
		}
		if (arg0 == 3) {
			Static508.method7313(Static131.anInt2222 != Static646.anInt10216);
		}
		if (arg0 == 7) {
			Static181.method2652(Static267.anInt4238 != Static131.anInt2222);
		}
		if (arg0 == 5) {
			if (Static328.aString57 == null) {
				Static413.method6082(Static159.aString25, Static154.aString24);
			} else {
				Static214.method3085();
			}
		} else if (arg0 == 6) {
			if (Static328.aString57 == null) {
				Static15.method252(Static159.aString25, Static154.aString24, Static69.anInt1053);
			} else {
				Static490.method7171(Static69.anInt1053);
			}
		} else if (arg0 == 9) {
			if (Static328.aString57 == null) {
				Static15.method252(Static159.aString25, Static154.aString24, Static69.anInt1053);
			} else {
				Static490.method7171(Static69.anInt1053);
			}
		} else if (arg0 == 12) {
			if (Static328.aString57 == null) {
				Static413.method6082(Static159.aString25, Static154.aString24);
			} else {
				Static214.method3085();
			}
		}
		if (Static553.method7612(Static539.anInt8853)) {
			Static238.aClass50_62.anInt990 = 2;
			Static85.aClass50_23.anInt990 = 2;
			Static207.aClass50_54.anInt990 = 2;
			Static356.aClass50_101.anInt990 = 2;
			Static655.aClass50_185.anInt990 = 2;
			Static125.aClass50_35.anInt990 = 2;
			Static7.aClass50_5.anInt990 = 2;
		}
		if (Static553.method7612(arg0)) {
			Static643.anInt10180 = 1;
			Static499.anInt8510 = 1;
			Static392.anInt6775 = 0;
			Static3.anInt23 = 0;
			Static260.anInt4118 = 0;
			Static355.method5246(true);
			Static238.aClass50_62.anInt990 = 1;
			Static85.aClass50_23.anInt990 = 1;
			Static207.aClass50_54.anInt990 = 1;
			Static356.aClass50_101.anInt990 = 1;
			Static655.aClass50_185.anInt990 = 1;
			Static125.aClass50_35.anInt990 = 1;
			Static7.aClass50_5.anInt990 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static347.method5212();
		}
		@Pc(222) boolean local222 = arg0 == 2 || Static576.method7860(arg0) || Static385.method5648(arg0);
		@Pc(239) boolean local239 = Static539.anInt8853 == 2 || Static576.method7860(Static539.anInt8853) || Static385.method5648(Static539.anInt8853);
		if (local222 != local239) {
			if (local222) {
				Static367.anInt6416 = Static377.anInt6578;
				if (Static655.aClass5_Sub36_29.aClass2_Sub6_4.method3364() == 0) {
					Static666.method8680();
				} else {
					Static63.method937(Static655.aClass5_Sub36_29.aClass2_Sub6_4.method3364(), Static449.aClass50_129, Static377.anInt6578);
					Static516.method3871();
				}
				Static589.aClass288_3.method7041(false);
			} else {
				Static666.method8680();
				Static589.aClass288_3.method7041(true);
			}
		}
		if (Static553.method7612(arg0) || arg0 == 13) {
			Static563.aClass143_13.method6221();
		}
		Static539.anInt8853 = arg0;
	}
}
