import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static515 {

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "Lclient!pn;")
	public static Class1_Sub36 aClass1_Sub36_2;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	public static void method7351() {
		Static267.anInt5167 = 0;
		Static475.aClass38_69.method1417();
		Static475.aClass38_69.method1426(Static170.aClass1_Sub50_2);
		Static267.anInt5167++;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!gw;)Lclient!pca;")
	public static Class82_Sub4 method7352(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class82_Sub4(arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3039(), arg0.method3043());
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIB)Z")
	public static boolean method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
