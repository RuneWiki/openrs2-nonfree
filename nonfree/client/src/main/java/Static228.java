import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!oq", name = "N", descriptor = "Lclient!ke;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!oq", name = "M", descriptor = "Z")
	public static boolean aBoolean265 = true;

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BJ)V")
	public static void method3971(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!tj;)V")
	public static void method3972(@OriginalArg(1) Class122 arg0) {
		if (Static74.aBoolean73) {
			Static140.method2287(arg0);
		} else {
			Static74.method1130(arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIIIZ)V")
	public static void method3973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static149.method2419(arg0)) {
			Static314.method5229(-1, arg1, arg2, arg3, Static311.aClass181ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method3975(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZILclient!ir;I)V")
	public static void method3979(@OriginalArg(0) int arg0, @OriginalArg(4) Class100 arg1, @OriginalArg(5) int arg2) {
		Static37.aBoolean434 = false;
		Static10.anInt248 = 0;
		Static123.aClass100_57 = arg1;
		Static58.anInt1258 = arg2;
		Static270.anInt5435 = 10000;
		Static196.anInt4046 = arg0;
		Static221.anInt4557 = 1;
	}
}
