import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "Lclient!dk;")
	public static Class54 aClass54_106;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "Lclient!br;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_6;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public static int anInt6465;

	@OriginalMember(owner = "client!bp", name = "x", descriptor = "Lclient!dk;")
	public static Class54 aClass54_107;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_88 = new Class134("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "Lclient!eo;")
	public static final Class2_Sub15 aClass2_Sub15_5 = new Class2_Sub15(0, -1);

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_54 = new Class156();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V")
	public static void method5022(@OriginalArg(0) int arg0) {
		if (Static290.anInt4777 == arg0) {
			return;
		}
		if (Static290.anInt4777 == 0) {
			Static88.method1386();
		}
		if (arg0 == 12) {
			Static454.method5698(Static258.aString121, Static220.anInt3626, Static427.aString196);
		}
		if (arg0 != 12 && Static283.aClass160_2 != null) {
			Static283.aClass160_2.method3202();
			Static283.aClass160_2 = null;
		}
		if (arg0 == 2) {
			Static46.method669(Static286.anInt4704 != Static142.anInt2523);
		}
		if (arg0 == 6) {
			Static162.method2268(Static354.anInt6054 != Static142.anInt2523);
		}
		if (arg0 == 4) {
			Static172.method2449(Static258.aString121, Static427.aString196);
		} else if (arg0 == 5) {
			Static454.method5698(Static258.aString121, Static220.anInt3626, Static427.aString196);
		} else if (arg0 == 8) {
			Static454.method5698(Static258.aString121, Static220.anInt3626, Static427.aString196);
		} else if (arg0 == 11) {
			Static172.method2449(Static258.aString121, Static427.aString196);
		}
		if (Static202.method2703(Static290.anInt4777)) {
			Static24.aClass54_5.anInt1425 = 2;
			Static363.aClass54_100.anInt1425 = 2;
			Static307.aClass54_83.anInt1425 = 2;
			aClass54_107.anInt1425 = 2;
			Static208.aClass54_60.anInt1425 = 2;
			Static172.aClass54_50.anInt1425 = 2;
			Static33.aClass54_11.anInt1425 = 2;
		}
		if (Static202.method2703(arg0)) {
			Static113.anInt2085 = 0;
			Static214.anInt3526 = 1;
			Static153.anInt2664 = 0;
			Static202.anInt3394 = 1;
			Static395.anInt6501 = 0;
			Static21.method133(true);
			Static24.aClass54_5.anInt1425 = 1;
			Static363.aClass54_100.anInt1425 = 1;
			Static307.aClass54_83.anInt1425 = 1;
			aClass54_107.anInt1425 = 1;
			Static208.aClass54_60.anInt1425 = 1;
			Static172.aClass54_50.anInt1425 = 1;
			Static33.aClass54_11.anInt1425 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static340.method5395();
		}
		if (arg0 == 1) {
			Static4.method77(Static82.aClass163_1, Static103.aClass54_28);
		} else {
			Static362.method4760();
		}
		@Pc(199) boolean local199 = arg0 == 1 || Static458.method5729(arg0) || Static4.method76(arg0);
		@Pc(214) boolean local214 = Static290.anInt4777 == 1 || Static458.method5729(Static290.anInt4777) || Static4.method76(Static290.anInt4777);
		if (local214 != local199) {
			if (local199) {
				Static246.anInt3968 = anInt6465;
				if (Static2.aClass148_Sub1_1.anInt3792 == 0) {
					Static83.method1206();
				} else {
					Static38.method558(Static2.aClass148_Sub1_1.anInt3792, Static120.aClass54_36, anInt6465);
				}
				Static24.aClass84_1.method1914(false);
			} else {
				Static83.method1206();
				Static24.aClass84_1.method1914(true);
			}
		}
		if (Static202.method2703(arg0) || arg0 == 12) {
			Static82.aClass163_1.method5511();
		}
		Static290.anInt4777 = arg0;
	}
}
