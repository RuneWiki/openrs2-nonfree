import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!rh", name = "E", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "Lclient!cm;")
	public static Class8_Sub1_Sub5 aClass8_Sub1_Sub5_3;

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
	public static int anInt4666;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!wn;")
	public static Class182 aClass182_25 = new Class182();

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
	public static int anInt4665 = 0;

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "Lclient!gd;")
	public static Class61 aClass61_43 = new Class61(64);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public static void method3522() {
		Static4.aClass61_1.method1378();
		Static260.aClass61_49.method1378();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lclient!dn;")
	public static Class41 method3523() {
		try {
			return (Class41) Class.forName("Class41_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static void method3524(@OriginalArg(1) int arg0) {
		@Pc(12) Class82 local12 = Static89.aClass82_1;
		synchronized (Static89.aClass82_1) {
			Static118.anInt2384 = arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!pk;Lclient!pk;I)V")
	public static void method3526(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1) {
		Static22.aClass132_7 = arg1;
		Static293.aClass132_91 = arg0;
	}
}
