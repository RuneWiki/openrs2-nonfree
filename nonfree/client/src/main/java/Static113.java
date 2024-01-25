import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eea", name = "r", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!eea", name = "j", descriptor = "[I")
	public static final int[] anIntArray187 = new int[3];

	@OriginalMember(owner = "client!eea", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString36 = "";

	@OriginalMember(owner = "client!eea", name = "B", descriptor = "[I")
	public static final int[] anIntArray190 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!eea", name = "J", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_49 = new Class298(74, 8);

	@OriginalMember(owner = "client!eea", name = "K", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_72 = new Class272(80, 4);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!cj;Z)V")
	public static void method2368(@OriginalArg(0) Class49 arg0) {
		Static203.aClass49_1 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(II)V")
	public static void method2374(@OriginalArg(0) int arg0) {
		if (arg0 == Static246.anInt4542) {
			return;
		}
		if (arg0 == 13) {
			if (Static148.aString42 == null) {
				Static567.method7552(Static412.aString100, Static490.anInt7979, Static594.aString129);
			} else {
				Static211.method3735(Static490.anInt7979);
			}
		}
		if (arg0 != 13 && Static339.aClass152_3 != null) {
			Static339.aClass152_3.method3908();
			Static339.aClass152_3 = null;
		}
		if (arg0 == 3) {
			Static197.method3569(Static576.anInt9188 != Static307.anInt5578);
		}
		if (arg0 == 7) {
			Static545.method7254(Static307.anInt5578 != Static437.anInt7265);
		}
		if (arg0 == 5) {
			if (Static148.aString42 == null) {
				Static157.method2836(Static412.aString100, Static594.aString129);
			} else {
				Static386.method5702();
			}
		} else if (arg0 == 6) {
			if (Static148.aString42 == null) {
				Static567.method7552(Static412.aString100, Static490.anInt7979, Static594.aString129);
			} else {
				Static211.method3735(Static490.anInt7979);
			}
		} else if (arg0 == 9) {
			if (Static148.aString42 == null) {
				Static567.method7552(Static412.aString100, Static490.anInt7979, Static594.aString129);
			} else {
				Static211.method3735(Static490.anInt7979);
			}
		} else if (arg0 == 12) {
			if (Static148.aString42 == null) {
				Static157.method2836(Static412.aString100, Static594.aString129);
			} else {
				Static386.method5702();
			}
		}
		if (Static25.method460(Static246.anInt4542)) {
			Static531.aClass246_249.anInt6627 = 2;
			Static463.aClass246_219.anInt6627 = 2;
			Static114.aClass246_67.anInt6627 = 2;
			Static79.aClass246_44.anInt6627 = 2;
			Static329.aClass246_162.anInt6627 = 2;
			Static462.aClass246_218.anInt6627 = 2;
			Static530.aClass246_248.anInt6627 = 2;
		}
		if (Static25.method460(arg0)) {
			Static43.anInt5562 = 0;
			Static157.anInt3171 = 1;
			Static141.anInt3012 = 1;
			Static49.anInt1056 = 0;
			Static506.anInt8040 = 0;
			Static81.method1765(true);
			Static531.aClass246_249.anInt6627 = 1;
			Static463.aClass246_219.anInt6627 = 1;
			Static114.aClass246_67.anInt6627 = 1;
			Static79.aClass246_44.anInt6627 = 1;
			Static329.aClass246_162.anInt6627 = 1;
			Static462.aClass246_218.anInt6627 = 1;
			Static530.aClass246_248.anInt6627 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static477.method6552();
		}
		@Pc(232) boolean local232 = arg0 == 2 || Static382.method5640(arg0) || Static419.method7098(arg0);
		@Pc(249) boolean local249 = Static246.anInt4542 == 2 || Static382.method5640(Static246.anInt4542) || Static419.method7098(Static246.anInt4542);
		if (local249 != local232) {
			if (local232) {
				Static380.anInt6546 = Static132.anInt2841;
				if (Static278.aClass3_Sub13_Sub1_1.anInt5131 == 0) {
					Static146.method2755();
				} else {
					Static531.method7011(Static132.anInt2841, Static278.aClass3_Sub13_Sub1_1.anInt5131, Static576.aClass246_267);
				}
				Static153.aClass331_1.method7013(false);
			} else {
				Static146.method2755();
				Static153.aClass331_1.method7013(true);
			}
		}
		if (Static25.method460(arg0) || arg0 == 13) {
			Static4.aClass43_1.method7177();
		}
		Static246.anInt4542 = arg0;
	}
}
