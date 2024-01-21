import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
	public static int anInt392;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "Lclient!dd;")
	private static Class13 aClass13_167 = Static161.method2971("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_168 = Static161.method2971("Hierhin gehen");

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
	public static int anInt387 = 0;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
	public static int anInt388 = 1;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!ld;")
	public static Class47 aClass47_1 = new Class47(200);

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
	public static int[] anIntArray48 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lclient!dd;")
	public static Class13 aClass13_169 = null;

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_170 = aClass13_167;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	public static void method441() {
		for (@Pc(16) Class1_Sub2_Sub2_Sub4 local16 = (Class1_Sub2_Sub2_Sub4) Static21.aClass82_3.method2849(); local16 != null; local16 = (Class1_Sub2_Sub2_Sub4) Static21.aClass82_3.method2855()) {
			if (local16.anInt1185 != Static156.anInt3696 || local16.aBoolean77) {
				local16.method3056();
			} else if (local16.anInt1184 <= Static78.anInt2168) {
				local16.method977(Static117.anInt3116);
				if (local16.aBoolean77) {
					local16.method3056();
				} else {
					Static42.method1117(local16.anInt1185, local16.anInt1189, local16.anInt1196, local16.anInt1191, 60, local16, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Z")
	public static boolean method442() {
		return Static48.anInt1535 == 0 ? Static74.aClass1_Sub12_Sub4_1.method2669() : true;
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	public static void method443() {
		anIntArray47 = null;
		aClass13_168 = null;
		anIntArray48 = null;
		aClass13_170 = null;
		aClass47_1 = null;
		aClass13_167 = null;
		aClass13_169 = null;
	}
}
