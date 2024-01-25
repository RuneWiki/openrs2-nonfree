import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_178 = new Class157(27, 2);

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public static int anInt5668 = 0;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)I")
	public static int method4787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method4788(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public static void method4790(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub9_Sub4 local12 = Static98.method1971(4, arg0);
		local12.method1799();
	}
}
