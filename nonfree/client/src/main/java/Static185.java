import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!tc;")
	public static Class195 aClass195_5;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
	public static int anInt1061;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "Lclient!qj;")
	public static Class165 aClass165_18;

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "Lclient!qj;")
	public static Class165 aClass165_19;

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "Z")
	private static boolean aBoolean103;

	@OriginalMember(owner = "client!lr", name = "U", descriptor = "Z")
	private static boolean aBoolean104;

	@OriginalMember(owner = "client!lr", name = "V", descriptor = "Z")
	private static boolean aBoolean105;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString32 = "Loaded title screen";

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString33 = " from your ignore list first.";

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
	public static int anInt1069 = 0;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString34 = "Please wait...";

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	public static void method1057() {
		Static190.aClass140_99.method3813();
		Static175.aClass140_94.method3813();
	}

	@OriginalMember(owner = "client!lr", name = "providesignlink", descriptor = "(Lclient!kq;)V")
	private static void method1059(@OriginalArg(0) Class110 arg0) {
		Static180.aClass110_6 = arg0;
		Static40.aClass110_8 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
	public static Object method1071(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static21.aBoolean56) {
			try {
				@Pc(26) Class127 local26 = (Class127) Class.forName("Class127_Sub1").getDeclaredConstructor().newInstance();
				local26.method3666(arg0);
				return local26;
			} catch (@Pc(33) Throwable local33) {
				Static21.aBoolean56 = true;
			}
		}
		return arg0;
	}
}
