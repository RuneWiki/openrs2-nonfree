import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "Lclient!v;")
	public static Class362 aClass362_52 = new Class362();

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "[I")
	public static final int[] anIntArray527 = new int[5];

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
	public static int anInt8029 = 0;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
	public static int anInt8031 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	public static void method6863() {
		@Pc(7) client local7 = Static563.aClient1;
		synchronized (Static563.aClient1) {
			if (Static289.aFrame1 == null) {
				@Pc(18) Container local18;
				if (Static293.aFrame3 != null) {
					local18 = Static293.aFrame3;
				} else if (Static180.anApplet6 == null) {
					local18 = Static131.anApplet_Sub1_1;
				} else {
					local18 = Static180.anApplet6;
				}
				Static338.anInt5825 = local18.getSize().width;
				Static13.anInt10825 = local18.getSize().height;
				@Pc(42) Insets local42;
				if (Static293.aFrame3 == local18) {
					local42 = Static293.aFrame3.getInsets();
					Static13.anInt10825 -= local42.top + local42.bottom;
					Static338.anInt5825 -= local42.right + local42.left;
				}
				if (Static455.method6591() == 1) {
					Static348.anInt5935 = Static335.anInt5755;
					Static314.anInt5339 = (Static338.anInt5825 - Static365.anInt6242) / 2;
					Static114.anInt2051 = 0;
					Static449.anInt7506 = Static365.anInt6242;
				} else {
					Static649.method8842();
				}
				if (Static74.aClass104_2 != Static648.aClass104_9) {
					@Pc(93) boolean local93;
					if (Static449.anInt7506 < 1024 && Static348.anInt5935 < 768) {
						local93 = true;
					} else {
						local93 = false;
					}
				}
				Static140.aCanvas1.setSize(Static449.anInt7506, Static348.anInt5935);
				if (Static546.aClass132_13 != null) {
					if (Static594.aBoolean693) {
						Static556.method7865(Static140.aCanvas1);
					} else {
						Static546.aClass132_13.method7510(Static140.aCanvas1, Static449.anInt7506, Static348.anInt5935);
					}
				}
				if (Static293.aFrame3 == local18) {
					local42 = Static293.aFrame3.getInsets();
					Static140.aCanvas1.setLocation(local42.left + Static314.anInt5339, Static114.anInt2051 + local42.top);
				} else {
					Static140.aCanvas1.setLocation(Static314.anInt5339, Static114.anInt2051);
				}
				if (Static561.anInt9357 != -1) {
					Static420.method6263(true);
				}
				Static240.method3600();
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
	public static void method6866() {
		if (Static51.aClass46Array1 == null) {
			Static51.aClass46Array1 = Static62.method1121();
			Static483.aClass46_23 = Static51.aClass46Array1[0];
			Static481.aLong245 = Static566.method7936();
		}
		if (Static42.aClass252_1 == null) {
			Static223.method3245();
		}
		@Pc(23) Class46 local23 = Static483.aClass46_23;
		@Pc(26) int local26 = Static339.method4971();
		if (Static483.aClass46_23 == local23) {
			Static167.aString31 = Static483.aClass46_23.aClass41_64.method1007(Static616.anInt10077);
			if (Static483.aClass46_23.aBoolean60) {
				Static73.anInt1381 = local26 * (Static483.aClass46_23.anInt1174 - Static483.aClass46_23.anInt1170) / 100 + Static483.aClass46_23.anInt1170;
			}
			if (Static483.aClass46_23.aBoolean61) {
				Static167.aString31 = Static167.aString31 + Static73.anInt1381 + "%";
			}
		} else if (Static62.aClass46_21 == Static483.aClass46_23) {
			Static42.aClass252_1 = null;
			Static143.method2106(3);
		} else {
			Static167.aString31 = local23.aClass41_63.method1007(Static616.anInt10077);
			if (Static483.aClass46_23.aBoolean61) {
				Static167.aString31 = Static167.aString31 + local23.anInt1174 + "%";
			}
			Static73.anInt1381 = local23.anInt1174;
			if (Static483.aClass46_23.aBoolean60 || local23.aBoolean60) {
				Static481.aLong245 = Static566.method7936();
			}
		}
		if (Static42.aClass252_1 == null) {
			return;
		}
		Static42.aClass252_1.method6248(Static73.anInt1381, Static483.aClass46_23, Static481.aLong245, Static167.aString31);
		if (Static642.anInterface5Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static238.anInt4281 + 1; local130 < Static642.anInterface5Array1.length; local130++) {
			if (Static642.anInterface5Array1[local130].method7071() >= 100 && Static238.anInt4281 == local130 - 1 && Static556.anInt9319 >= 1 && Static42.aClass252_1.method6250()) {
				try {
					Static642.anInterface5Array1[local130].method7070();
				} catch (@Pc(162) Exception local162) {
					Static642.anInterface5Array1 = null;
					return;
				}
				Static42.aClass252_1.method6253(Static642.anInterface5Array1[local130]);
				Static238.anInt4281++;
				if (Static642.anInterface5Array1.length - 1 <= Static238.anInt4281 && Static642.anInterface5Array1.length > 1) {
					Static238.anInt4281 = Static194.aClass344_1.method8082() ? 0 : -1;
				}
			}
		}
		return;
	}
}
