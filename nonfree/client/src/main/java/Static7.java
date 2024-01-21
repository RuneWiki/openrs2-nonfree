import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "N", descriptor = "I")
	public static int anInt188;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_2;

	@OriginalMember(owner = "client!af", name = "S", descriptor = "I")
	public static int anInt190;

	@OriginalMember(owner = "client!af", name = "H", descriptor = "Lclient!ib;")
	public static Class3_Sub11_Sub1 aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!af", name = "J", descriptor = "Lclient!he;")
	public static Class26 aClass26_108 = Static6.method100("<col=ff3000>");

	@OriginalMember(owner = "client!af", name = "M", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "[I")
	public static int[] anIntArray16 = new int[500];

	@OriginalMember(owner = "client!af", name = "V", descriptor = "Lclient!he;")
	public static Class26 aClass26_109 = Static6.method100(" )2> ");

	@OriginalMember(owner = "client!af", name = "X", descriptor = "Lclient!he;")
	private static Class26 aClass26_111 = Static6.method100("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!af", name = "W", descriptor = "Lclient!he;")
	public static Class26 aClass26_110 = aClass26_111;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!da;)V")
	public static void method111(@OriginalArg(1) Class3_Sub3 arg0) {
		arg0.aBoolean174 = false;
		if (arg0.aClass3_Sub5_5 != null) {
			arg0.aClass3_Sub5_5.anInt2119 = 0;
		}
		for (@Pc(18) Class3_Sub3 local18 = arg0.method2145(); local18 != null; local18 = arg0.method2147()) {
			method111(local18);
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method112() {
		aClass16_Sub1_2 = null;
		aClass26_110 = null;
		aClass3_Sub11_Sub1_1 = null;
		aClass26_109 = null;
		aClass26_111 = null;
		aClass26_108 = null;
		aClass16_Sub1_1 = null;
		anIntArray16 = null;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Z")
	public static boolean method113() {
		return Static70.anInt1540 == 0 ? Static1.aClass3_Sub3_Sub1_1.method239() : true;
	}
}
