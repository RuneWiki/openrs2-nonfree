import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static final int anInt1182 = 52;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "I")
	public static int anInt1187 = -1;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
	public static int method1268(@OriginalArg(1) int arg0) {
		@Pc(17) byte local17;
		if (arg0 > 12000) {
			local17 = 4;
			Static103.method2140();
		} else if (arg0 > 5000) {
			Static481.method7182();
			local17 = 3;
		} else if (arg0 > 2000) {
			local17 = 2;
			Static634.method8680();
		} else {
			Static154.method2818();
			local17 = 1;
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 2) {
			Static262.aClass3_Sub27_12.method3234(2, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
			Static441.method6865(false, 2);
		}
		Static108.method2177();
		return local17;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method1269() {
		Static99.method2127();
		Static383.aClass5_12 = null;
		Static401.aClass16ArrayArray1 = null;
		Static128.aClass205_2 = null;
		Static526.aClass205_3 = null;
		Static594.aClass205_4 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!aj;I)Ljava/lang/String;")
	public static String method1271(@OriginalArg(0) Class3_Sub4_Sub1 arg0) {
		return arg0.aString2 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method1272(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static435.anInt7845 = 1;
		Static90.anInt2169 = -1;
		Static471.method7101(arg1, false, arg0);
	}
}
