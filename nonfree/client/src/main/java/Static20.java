import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_3;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!ef;")
	public static Class16 aClass16_27;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	public static int anInt587 = 0;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!he;")
	public static Class26 aClass26_315 = Static6.method100("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!sf;")
	public static Class66 aClass66_8 = new Class66(20);

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!he;")
	private static Class26 aClass26_316 = Static6.method100("Your account is already logged in)3");

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!he;")
	public static Class26 aClass26_317 = Static6.method100("Lade Texturen )2 ");

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!he;")
	private static Class26 aClass26_318 = Static6.method100("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!he;")
	public static Class26 aClass26_319 = aClass26_318;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_320 = aClass26_316;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ef;)V")
	public static void method383(@OriginalArg(1) Class16 arg0) {
		Static106.aClass16_131 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	public static void method387() {
		aClass26_318 = null;
		aClass26_317 = null;
		aClass26_316 = null;
		aClass26_320 = null;
		aClass26_319 = null;
		aClass16_27 = null;
		aClass16_Sub1_3 = null;
		aClass26_315 = null;
		aClass66_8 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!fb;)V")
	public static void method388(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub1 arg1) {
		if (Static4.anInt136 < arg1.anInt2696) {
			Static62.method1231(arg1);
		} else if (Static4.anInt136 > arg1.anInt2742) {
			Static90.method1661(arg1);
		} else {
			Static11.method172(arg1);
		}
		if (arg1.anInt2733 < 128 || arg1.anInt2731 < 128 || arg1.anInt2733 >= 13184 || arg1.anInt2731 >= 13184) {
			arg1.anInt2698 = -1;
			arg1.anInt2696 = 0;
			arg1.anInt2742 = 0;
			arg1.anInt2733 = arg1.anIntArray326[0] * 128 + arg1.anInt2712 * 64;
			arg1.anInt2731 = arg1.anInt2712 * 64 + arg1.anIntArray325[0] * 128;
			arg1.anInt2738 = -1;
			arg1.method1878();
		}
		if (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1 == arg1 && (arg1.anInt2733 < 1536 || arg1.anInt2731 < 1536 || arg1.anInt2733 >= 11776 || arg1.anInt2731 >= 11776)) {
			arg1.anInt2731 = arg1.anInt2712 * 64 + arg1.anIntArray325[0] * 128;
			arg1.anInt2696 = 0;
			arg1.anInt2698 = -1;
			arg1.anInt2742 = 0;
			arg1.anInt2733 = arg1.anIntArray326[0] * 128 + arg1.anInt2712 * 64;
			arg1.anInt2738 = -1;
			arg1.method1878();
		}
		Static28.method603(arg1);
		Static44.method837(arg1);
	}
}
