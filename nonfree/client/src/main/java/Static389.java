import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static389 {

	@OriginalMember(owner = "client!qda", name = "w", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!qda", name = "U", descriptor = "Lclient!n;")
	public static Interface8 anInterface8_10;

	@OriginalMember(owner = "client!qda", name = "hb", descriptor = "Lclient!hn;")
	public static final Class123 aClass123_4 = new Class123();

	@OriginalMember(owner = "client!qda", name = "zb", descriptor = "I")
	public static int anInt6795 = -1;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method5862(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static64.method1809(arg0);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!gw;)Lclient!fh;")
	public static Class82_Sub2 method5865(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class82_Sub2(arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3058(), arg0.method3039(), arg0.method3043());
	}

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)Lclient!cu;")
	public static Class50_Sub1 method5871() {
		return Static538.aClass50_Sub1Array2.length > Static382.anInt6690 ? Static538.aClass50_Sub1Array2[Static382.anInt6690++] : null;
	}
}
