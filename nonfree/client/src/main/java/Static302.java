import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!dda;")
	public static Class53 aClass53_87;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
	public static int anInt5530;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_113 = new Class239(101, 0);

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString124 = null;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method4742(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILclient!rk;Lclient!qa;)V")
	public static void method4743(@OriginalArg(3) Class249 arg0, @OriginalArg(4) Class39 arg1) {
		Static411.aClass249_59.method6530();
		if (Static329.aBoolean305) {
			return;
		}
		for (@Pc(16) Class2_Sub35 local16 = (Class2_Sub35) arg0.method6527(); local16 != null; local16 = (Class2_Sub35) arg0.method6525()) {
			@Pc(24) Class182 local24 = Static201.aClass56_2.method1680(local16.anInt6264);
			if (Static169.method2844(local24)) {
				@Pc(36) boolean local36 = Static256.method4012(local16, local24, arg1);
				if (local36) {
					Static449.method6865(arg1, local16, local24);
				}
			}
		}
	}
}
