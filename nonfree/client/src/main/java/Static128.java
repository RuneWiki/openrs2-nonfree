import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!t;")
	public static Class2_Sub14_Sub4 aClass2_Sub14_Sub4_2;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!uf;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static int anInt2775;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!be;")
	public static Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1251 = Static32.method683(": ");

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1252 = Static32.method683("nav");

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static int anInt2774 = 0;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1253 = Static32.method683(" has logged out)3");

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public static int anInt2776 = 0;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1254 = aClass49_1253;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!uc;I)V")
	public static void method2161(@OriginalArg(1) Class2_Sub2_Sub3_Sub7 arg0, @OriginalArg(2) int arg1) {
		Static40.method791(arg0.anInt3529, arg0.anInt3578, arg1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	public static void method2162() {
		aClass10_1 = null;
		aClass49_1253 = null;
		aClass2_Sub14_Sub4_2 = null;
		aClass49_1254 = null;
		aClass49_1252 = null;
		aClass54_1 = null;
		aClass49_1251 = null;
	}
}
