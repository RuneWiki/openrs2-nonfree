import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "Lclient!wf;")
	public static Class87 aClass87_6 = new Class87(4096);

	@OriginalMember(owner = "client!fh", name = "xb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_415 = Static170.method3101(")2");

	@OriginalMember(owner = "client!fh", name = "zb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_416 = Static170.method3101("Your account is already logged in)3");

	@OriginalMember(owner = "client!fh", name = "Gb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_420 = Static170.method3101("Create a free account");

	@OriginalMember(owner = "client!fh", name = "Bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_417 = aClass28_420;

	@OriginalMember(owner = "client!fh", name = "Eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_418 = Static170.method3101("M");

	@OriginalMember(owner = "client!fh", name = "Fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_419 = aClass28_416;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method1112() {
		aClass28_416 = null;
		aClass28_420 = null;
		aClass28_417 = null;
		aClass28_418 = null;
		aClass28_419 = null;
		aClass28_415 = null;
		aClass87_6 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!eh;I)V")
	public static void method1113(@OriginalArg(0) Class28 arg0) {
		if (Static32.anInt991 >= 2) {
			if (arg0.method936(Static43.aClass28_383)) {
				System.gc();
			}
			if (arg0.method936(Static124.aClass28_1041)) {
				method1115();
			}
			if (arg0.method936(Static85.aClass28_787)) {
				Static108.aBoolean137 = true;
			}
			if (arg0.method936(Static136.aClass28_1142)) {
				Static108.aBoolean137 = false;
			}
			if (arg0.method936(Static132.aClass28_1101)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(45) int local45 = 1; local45 < 103; local45++) {
						for (@Pc(48) int local48 = 1; local48 < 103; local48++) {
							Static45.aClass21Array1[local42].anIntArrayArray12[local45][local48] = 0;
						}
					}
				}
			}
			if (arg0.method918(Static120.aClass28_1004) && Static81.anInt2377 != 0) {
				Static145.method2783(arg0.method905(6).method929());
			}
			if (arg0.method936(Static44.aClass28_1368) && Static81.anInt2377 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method918(Static66.aClass28_605)) {
				Static116.anInt2985 = arg0.method905(12).method915().method929();
				Static51.method1192(null, 0, Static4.method96(new Class28[] { Static93.aClass28_817, Static146.method2793(Static116.anInt2985) }));
			}
			if (arg0.method936(Static50.aClass28_438)) {
				Static168.aBoolean190 = true;
			}
		}
		Static51.aClass3_Sub8_Sub1_2.method1559(70);
		Static51.aClass3_Sub8_Sub1_2.method1550(arg0.method901() - 1);
		Static51.aClass3_Sub8_Sub1_2.method1538(arg0.method905(2));
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	public static void method1115() {
		if (Static35.anInt1047 > 0) {
			Static31.method791();
		} else {
			Static173.method3141(40);
			Static172.aClass38_4 = Static52.aClass38_1;
			Static52.aClass38_1 = null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V")
	public static void method1120() {
		Static23.aClass63_4.method2344();
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
	public static void method1122() {
		Static122.aClass63_21.method2344();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method1123(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static45.aBoolean66) {
			try {
				@Pc(18) Class12 local18 = (Class12) Class.forName("Class12_Sub1").getDeclaredConstructor().newInstance();
				local18.method949(arg0);
				return local18;
			} catch (@Pc(27) Throwable local27) {
				Static45.aBoolean66 = true;
			}
		}
		return arg0;
	}
}
