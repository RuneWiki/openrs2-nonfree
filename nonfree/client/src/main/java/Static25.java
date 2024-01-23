import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array12;

	@OriginalMember(owner = "client!bj", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "Lclient!nm;")
	public static Class119 aClass119_80;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "Lclient!il;")
	public static Class86 aClass86_33 = new Class86(16);

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "[I")
	public static int[] anIntArray545 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bj", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Allocated memory";

	@OriginalMember(owner = "client!bj", name = "K", descriptor = "[Lclient!af;")
	public static Class4_Sub1[] aClass4_Sub1Array3 = new Class4_Sub1[0];

	@OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
	public static int anInt4802 = 0;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
	public static void method4018() {
		@Pc(6) Class1_Sub28 local6;
		for (local6 = (Class1_Sub28) Static236.aClass96_22.method2340(); local6 != null; local6 = (Class1_Sub28) Static236.aClass96_22.method2342()) {
			if (local6.aBoolean401) {
				local6.method3798();
			}
		}
		for (local6 = (Class1_Sub28) Static28.aClass96_2.method2340(); local6 != null; local6 = (Class1_Sub28) Static28.aClass96_2.method2342()) {
			if (local6.aBoolean401) {
				local6.method3798();
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)V")
	public static void method4021() {
		Static263.aClass1_Sub5_Sub6_9 = null;
		Static287.anInt5199 = -1;
	}
}
