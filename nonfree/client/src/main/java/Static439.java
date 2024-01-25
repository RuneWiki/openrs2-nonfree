import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
	public static int anInt7060;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
	public static int anInt7056 = 2;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	public static int anInt7059 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IB)V")
	public static void method5777(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub2_Sub6 local16 = Static371.method5808(3, arg0);
		local16.method1775();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Z")
	public static boolean method5780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)Z")
	public static boolean method5781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	public static void method5783() {
		@Pc(13) Class134 local13 = Static384.aClass134_49;
		synchronized (Static384.aClass134_49) {
			Static384.aClass134_49.method3272();
		}
		local13 = Static321.aClass134_43;
		synchronized (Static321.aClass134_43) {
			Static321.aClass134_43.method3272();
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method5784(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
