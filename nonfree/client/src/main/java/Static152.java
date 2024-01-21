import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!ld;")
	public static Class3_Sub4_Sub2 aClass3_Sub4_Sub2_2;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
	public static int[] anIntArray432;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1329 = Static120.method1824("leuchten3:");

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt3407 = 0;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1330 = Static120.method1824(" from your friend list first)3");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public static int anInt3409 = -1;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1331 = Static120.method1824(")2");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1333 = Static120.method1824("Loaded textures");

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1332 = aClass80_1333;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1334 = aClass80_1330;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lclient!ta;")
	public static Class24 method2422() {
		try {
			return (Class24) Class.forName("Class24_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public static void method2423(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class3_Sub11 local11 = (Class3_Sub11) Static51.aClass54_5.method1503(); local11 != null; local11 = (Class3_Sub11) Static51.aClass54_5.method1497()) {
			if ((local11.aLong154 >> 48 & 0xFFFFL) == (long) arg0) {
				local11.method3159();
			}
		}
	}
}
