import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Z")
	public static boolean method2639(@OriginalArg(1) int arg0) {
		if (arg0 == 4 || arg0 == 47 || arg0 == 57 || arg0 == 18 || arg0 == 19) {
			return true;
		} else {
			return arg0 == 2 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
	public static boolean method2641() {
		try {
			if (Static429.anInt7900 == 2) {
				if (Static229.aClass3_Sub39_2 == null) {
					Static229.aClass3_Sub39_2 = Static560.method6028(Static492.aClass161_108, Static319.anInt6143, Static339.anInt5660);
					if (Static229.aClass3_Sub39_2 == null) {
						return false;
					}
				}
				if (Static85.aClass286_1 == null) {
					Static85.aClass286_1 = new Class286(Static407.aClass161_92, Static345.aClass161_73);
				}
				if (Static345.aClass3_Sub9_Sub1_2.method1211(Static229.aClass3_Sub39_2, Static530.aClass161_116, Static85.aClass286_1)) {
					Static345.aClass3_Sub9_Sub1_2.method1180();
					Static345.aClass3_Sub9_Sub1_2.method1209(Static282.anInt5792);
					Static345.aClass3_Sub9_Sub1_2.method1214(Static346.aBoolean415, Static229.aClass3_Sub39_2);
					Static229.aClass3_Sub39_2 = null;
					Static429.anInt7900 = 0;
					Static85.aClass286_1 = null;
					Static492.aClass161_108 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static345.aClass3_Sub9_Sub1_2.method1202();
			Static229.aClass3_Sub39_2 = null;
			Static85.aClass286_1 = null;
			Static429.anInt7900 = 0;
			Static492.aClass161_108 = null;
		}
		return false;
	}
}
