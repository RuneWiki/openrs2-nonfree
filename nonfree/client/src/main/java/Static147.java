import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "S")
	public static short aShort45 = 205;

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_60 = new Class133(21, 8);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)Lclient!us;")
	public static Class107 method2514() {
		try {
			return (Class107) Class.forName("Class107_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!kea;B)I")
	public static int method2515(@OriginalArg(0) Class161 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4268(Static35.anInt913)) {
			local5++;
		}
		if (arg0.method4268(Static75.anInt8683)) {
			local5++;
		}
		if (arg0.method4268(Static91.anInt1963)) {
			local5++;
		}
		if (arg0.method4268(Static45.anInt1048)) {
			local5++;
		}
		if (arg0.method4268(Static182.anInt4204)) {
			local5++;
		}
		if (arg0.method4268(Static80.anInt1725)) {
			local5++;
		}
		if (arg0.method4268(Static182.anInt4202)) {
			local5++;
		}
		if (arg0.method4268(Static310.anInt6021)) {
			local5++;
		}
		if (arg0.method4268(Static267.anInt5564)) {
			local5++;
		}
		if (arg0.method4268(Static286.anInt5827)) {
			local5++;
		}
		if (arg0.method4268(Static320.anInt6156)) {
			local5++;
		}
		if (arg0.method4268(Static107.anInt2375)) {
			local5++;
		}
		if (arg0.method4268(Static303.anInt5986)) {
			local5++;
		}
		if (arg0.method4268(Static389.anInt7139)) {
			local5++;
		}
		if (arg0.method4268(Static69.anInt1545)) {
			local5++;
		}
		if (arg0.method4268(Static351.anInt6387)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(CI)Z")
	public static boolean method2518(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method2519(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static211.method3877(arg0);
	}
}
