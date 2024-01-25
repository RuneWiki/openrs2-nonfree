import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jga", name = "y", descriptor = "I")
	public static int anInt5702 = 0;

	@OriginalMember(owner = "client!jga", name = "K", descriptor = "I")
	public static int anInt5712 = 0;

	@OriginalMember(owner = "client!jga", name = "eb", descriptor = "[I")
	public static int[] anIntArray244 = new int[1];

	@OriginalMember(owner = "client!jga", name = "sb", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_88 = new Class73(32, 1);

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
	public static void method4777() {
		@Pc(7) client local7 = Static545.aClient1;
		synchronized (Static545.aClient1) {
			if (Static224.aFrame5 == null) {
				@Pc(20) Container local20;
				if (Static500.aFrame9 != null) {
					local20 = Static500.aFrame9;
				} else if (Static635.anApplet2 == null) {
					local20 = Static560.anApplet_Sub1_1;
				} else {
					local20 = Static635.anApplet2;
				}
				Static351.anInt6858 = local20.getSize().width;
				Static59.anInt1894 = local20.getSize().height;
				@Pc(42) Insets local42;
				if (Static500.aFrame9 == local20) {
					local42 = Static500.aFrame9.getInsets();
					Static59.anInt1894 -= local42.bottom + local42.top;
					Static351.anInt6858 -= local42.left + local42.right;
				}
				if (Static326.method5447() == 1) {
					Static354.anInt6878 = 0;
					Static294.anInt6026 = Static182.anInt4018;
					Static277.anInt5899 = Static52.anInt1780;
					Static184.anInt4050 = (Static351.anInt6858 - Static182.anInt4018) / 2;
				} else {
					Static521.method8025();
				}
				if (Static86.aClass212_19 != Static630.aClass212_18) {
					@Pc(92) boolean local92;
					if (Static294.anInt6026 < 1024 && Static277.anInt5899 < 768) {
						local92 = true;
					} else {
						local92 = false;
					}
				}
				Static428.aCanvas12.setSize(Static294.anInt6026, Static277.anInt5899);
				if (Static467.aClass5_13 != null) {
					if (Static238.aBoolean425) {
						Static513.method7358(Static428.aCanvas12);
					} else {
						Static467.aClass5_13.method6145(Static428.aCanvas12, Static294.anInt6026, Static277.anInt5899);
					}
				}
				if (local20 == Static500.aFrame9) {
					local42 = Static500.aFrame9.getInsets();
					Static428.aCanvas12.setLocation(local42.left + Static184.anInt4050, Static354.anInt6878 + local42.top);
				} else {
					Static428.aCanvas12.setLocation(Static184.anInt4050, Static354.anInt6878);
				}
				if (Static30.anInt830 != -1) {
					Static80.method2189(true);
				}
				Static465.method6954();
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)I")
	public static int method4780(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)V")
	public static void method4808() {
		if (!Static8.aBoolean54) {
			Static338.aFloat133 += (-24.0F - Static338.aFloat133) / 2.0F;
			Static94.aBoolean215 = true;
			Static8.aBoolean54 = true;
		}
	}
}
