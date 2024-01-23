import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!th;")
	public static Class168 aClass168_209;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString443 = "scroll:";

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public static int anInt6206 = 100;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!qm;)Lclient!v;")
	public static Class31_Sub4 method4690(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class31_Sub4(arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2248(), arg0.method2215(), arg0.method2199());
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)V")
	public static void method4692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static170.anInt3814 <= arg0 - arg2 && arg0 + arg2 <= anInt6206 && arg3 - arg2 >= Static206.anInt4449 && arg2 + arg3 <= Static90.anInt2088) {
			Static112.method1810(arg2, arg3, arg1, arg0);
		} else {
			Static38.method798(arg1, arg2, arg0, arg3);
		}
	}
}
