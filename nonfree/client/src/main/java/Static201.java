import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public static int anInt3867;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public static int anInt3861 = -1;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	public static int anInt3864 = -2;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	public static int anInt3866 = -1;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public static void method3229() {
		Static194.aClass187_103.method4534(5);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method3230() {
		Static127.aClass1_Sub14_Sub1_3.method1408(13);
		Static127.aClass1_Sub14_Sub1_3.method1390(Static228.method3541());
		Static127.aClass1_Sub14_Sub1_3.method1338(Static292.anInt5236);
		Static127.aClass1_Sub14_Sub1_3.method1338(Static120.anInt2505);
		Static127.aClass1_Sub14_Sub1_3.method1390(Static111.anInt2296);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3231(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
}
