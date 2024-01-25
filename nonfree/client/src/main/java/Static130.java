import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
	public static int anInt2750;

	@OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
	public static int anInt2758;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)Z")
	public static boolean method2305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static630.method8524(arg1, arg0) & Static513.method7469(arg0, arg1);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public static void method2306() {
		if (Static152.aClass53Array1 == null) {
			Static152.aClass53Array1 = Static72.method1254();
			Static300.aClass53_34 = Static152.aClass53Array1[0];
			Static389.aLong184 = Static191.method3071();
		}
		if (Static369.aClass302_1 == null) {
			Static222.method3856();
		}
		@Pc(27) Class53 local27 = Static300.aClass53_34;
		@Pc(30) int local30 = Static521.method7580();
		if (Static300.aClass53_34 == local27) {
			Static575.aString88 = Static300.aClass53_34.aClass235_1.method5893(Static455.anInt7738);
			if (Static300.aClass53_34.aBoolean96) {
				Static147.anInt3006 = local30 * (Static300.aClass53_34.anInt1432 - Static300.aClass53_34.anInt1431) / 100 + Static300.aClass53_34.anInt1431;
			}
			if (Static300.aClass53_34.aBoolean95) {
				Static575.aString88 = Static575.aString88 + Static147.anInt3006 + "%";
			}
		} else if (Static72.aClass53_24 == Static300.aClass53_34) {
			Static369.aClass302_1 = null;
			Static206.method3226(3);
		} else {
			Static575.aString88 = local27.aClass235_2.method5893(Static455.anInt7738);
			if (Static300.aClass53_34.aBoolean95) {
				Static575.aString88 = Static575.aString88 + local27.anInt1432 + "%";
			}
			Static147.anInt3006 = local27.anInt1432;
			if (Static300.aClass53_34.aBoolean96 || local27.aBoolean96) {
				Static389.aLong184 = Static191.method3071();
			}
		}
		if (Static369.aClass302_1 == null) {
			return;
		}
		Static369.aClass302_1.method7399(Static389.aLong184, Static575.aString88, Static147.anInt3006, Static300.aClass53_34);
		if (Static23.anInterface21Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static30.anInt448 + 1; local130 < Static23.anInterface21Array1.length; local130++) {
			if (Static23.anInterface21Array1[local130].method8192() >= 100 && Static30.anInt448 == local130 - 1 && Static82.anInt1653 >= 1 && Static369.aClass302_1.method7400()) {
				try {
					Static23.anInterface21Array1[local130].method8190();
				} catch (@Pc(164) Exception local164) {
					Static23.anInterface21Array1 = null;
					return;
				}
				Static369.aClass302_1.method7389(Static23.anInterface21Array1[local130]);
				Static30.anInt448++;
				if (Static23.anInterface21Array1.length - 1 <= Static30.anInt448 && Static23.anInterface21Array1.length > 1) {
					Static30.anInt448 = Static201.aClass112_1.method2785() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZI)V")
	public static void method2307(@OriginalArg(1) int arg0) {
		Static108.anInt2182 = -1;
		Static122.anInt2649 = arg0;
		Static433.anInt7555 = -1;
		Static510.method7387();
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!ida;Z)V")
	public static void method2309(@OriginalArg(0) Class3_Sub7_Sub13 arg0) {
		arg0.method7907();
		@Pc(10) boolean local10 = false;
		for (@Pc(15) Class3_Sub7_Sub13 local15 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8414(); local15 != null; local15 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8415()) {
			if (Static23.method324(local15.method3990(), arg0.method3990())) {
				Static433.method6593(arg0, local15);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static561.aClass363_53.method8413(arg0);
		}
	}
}
