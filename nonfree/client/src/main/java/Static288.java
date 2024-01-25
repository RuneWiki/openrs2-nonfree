import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
	public static int anInt6178;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "[Lclient!sm;")
	public static Class41[] aClass41Array5;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public static final int anInt6183 = 0;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V")
	public static void method5418() {
		Static176.aClass2_9.method3302(Static172.anInt5801, Static41.aBoolean83 ? Static276.anInt5378 + 256 : -1);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lclient!ne;")
	public static Class1_Sub25 method5421() {
		if (Static342.aClass195_17 == null || Static49.aClass76_1 == null) {
			return null;
		}
		for (@Pc(21) Class1_Sub25 local21 = (Class1_Sub25) Static49.aClass76_1.method2085(); local21 != null; local21 = (Class1_Sub25) Static49.aClass76_1.method2085()) {
			@Pc(28) Class202 local28 = Static221.method4034(local21.anInt4124);
			if (local28 != null && local28.aBoolean519 && local28.method5175()) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(CII)C")
	public static char method5428(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
	public static String method5430(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static310.anInterface3_1 != null) {
			@Pc(12) String local12 = Static310.anInterface3_1.method2922(arg2, arg0, arg1);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!eb;B)V")
	public static void method5431(@OriginalArg(0) Class1_Sub7 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static152.anInt3054; local12++) {
			@Pc(20) int local20 = arg0.method3145();
			@Pc(24) int local24 = arg0.method3115();
			if (local24 == 65535) {
				local24 = -1;
			}
			if (Static253.aClass74_Sub1Array1[local20] != null) {
				Static253.aClass74_Sub1Array1[local20].anInt2260 = local24;
			}
		}
	}
}
