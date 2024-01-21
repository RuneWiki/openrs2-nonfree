import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public static int anInt889;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array3;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!rc;")
	public static Class74 aClass74_29 = new Class74(5);

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_461 = Static32.method683("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Lclient!lf;")
	private static Class49 aClass49_462 = Static32.method683("Bad session id)3");

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_463 = aClass49_462;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_464 = Static32.method683("<col=ff7000>");

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_465 = Static32.method683("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method728() {
		anIntArray80 = null;
		aClass74_29 = null;
		aClass49_463 = null;
		aClass49_465 = null;
		aClass49_462 = null;
		aClass2_Sub2_Sub2_Sub2Array3 = null;
		aClass49_461 = null;
		aClass49_464 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!bg;III)[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] method729(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static179.method2970(arg0, arg2, arg1) ? Static156.method2648() : null;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Lclient!kb;")
	public static Class44 method730() {
		try {
			return (Class44) Class.forName("Class44_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
