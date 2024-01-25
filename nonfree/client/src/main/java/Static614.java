import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "Lclient!bt;")
	public static Class34 aClass34_122;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
	public static int anInt9423;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_16 = new Class117(14, 7);

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
	public static int anInt9420 = 0;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
	public static int anInt9422 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public static void method8040() {
		if (Static420.aString78 != null) {
			Static606.method7951(Static141.anInt2583);
		} else if (Static53.anInt1190 == -1) {
			Static584.method3974(Static141.anInt2583, Static602.aString115, Static163.aString26);
		} else {
			Static416.method5242(Static141.anInt2583);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
	public static void method8041() {
		if (!Static567.aBoolean692) {
			Static566.aFloat202 += (-12.0F - Static566.aFloat202) / 2.0F;
			Static123.aBoolean157 = true;
			Static567.aBoolean692 = true;
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
	public static void method8042() {
		if (Static6.aClass246_1 != null) {
			Static31.aClass353_3 = new Class353();
			Static31.aClass353_3.method7677(Static6.aClass246_1, Static293.aLong139, Static6.aClass246_1.anInt5774, Static6.aClass246_1.aClass179_64.method4066(Static164.anInt2984));
			Static261.aThread2 = new Thread(Static31.aClass353_3, "");
			Static261.aThread2.start();
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	public static void method8043() {
		if (Static223.anInt3553 <= 0) {
			Static330.aString58 = "";
			return;
		}
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < Static489.aStringArray40.length; local22++) {
			if (Static489.aStringArray40[local22].indexOf("--> ") != -1) {
				local20++;
				if (Static223.anInt3553 == local20) {
					Static330.aString58 = Static489.aStringArray40[local22].substring(Static489.aStringArray40[local22].indexOf(">") + 2);
					return;
				}
			}
		}
	}
}
