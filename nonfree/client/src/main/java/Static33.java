import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	public static int anInt924;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	public static int anInt925;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!kb;")
	private static Class46 aClass46_245 = Static65.method1172("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_246 = aClass46_245;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_247 = Static65.method1172("Art");

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_248 = Static65.method1172("<col=ff3000>");

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_249 = Static65.method1172("p11_full");

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	public static int anInt920 = -1;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_250 = Static65.method1172("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!df", name = "y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_251 = Static65.method1172("m");

	@OriginalMember(owner = "client!df", name = "A", descriptor = "[I")
	public static int[] anIntArray68 = new int[100];

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Lclient!kb;")
	public static Class46 aClass46_252 = Static65.method1172("Benutzen");

	@OriginalMember(owner = "client!df", name = "F", descriptor = "Lclient!kb;")
	public static Class46 aClass46_253 = Static65.method1172("Benutzername: ");

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method583() {
		aClass46_251 = null;
		aClass46_245 = null;
		aClass46_249 = null;
		aClass46_247 = null;
		aClass46_246 = null;
		aClass46_252 = null;
		aClass46_250 = null;
		aClass46_248 = null;
		aClass46_253 = null;
		anIntArray68 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLclient!h;I)V")
	public static void method584(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		if (Static63.aClass33_5 != null || Static105.aBoolean103 || (arg1 == null || Static2.method11(arg1) == null)) {
			return;
		}
		Static63.aClass33_5 = arg1;
		Static30.aClass33_2 = Static2.method11(arg1);
		Static163.anInt3627 = arg0;
		Static1.anInt15 = arg2;
		Static28.aBoolean25 = false;
		Static71.anInt1841 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
	public static int method585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)I")
	public static int method586() {
		@Pc(9) int local9 = Static168.method2689(Static70.anInt1833, Static134.anInt3130, Static99.anInt2422);
		return local9 - Static94.anInt2298 >= 800 || (Static119.aByteArrayArrayArray5[Static99.anInt2422][Static134.anInt3130 >> 7][Static70.anInt1833 >> 7] & 0x4) == 0 ? 3 : Static99.anInt2422;
	}
}
