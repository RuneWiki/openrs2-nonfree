import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!fc", name = "X", descriptor = "Lclient!kb;")
	public static Class42 aClass42_3;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!k;")
	public static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!ad;")
	private static Class4 aClass4_445 = Static75.method1216("Connection lost");

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!ad;")
	public static Class4 aClass4_446 = aClass4_445;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!ad;")
	public static Class4 aClass4_447 = Static75.method1216("blaugr-Un:");

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	public static int anInt941 = 0;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Lclient!ad;")
	public static Class4 aClass4_448 = Static75.method1216("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
	public static int anInt942 = 0;

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Lclient!ad;")
	public static Class4 aClass4_449 = Static75.method1216("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!ad;")
	public static Class4 aClass4_450 = Static75.method1216("Offline");

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Lclient!ad;")
	public static Class4 aClass4_451 = Static75.method1216("Texturen geladen)3");

	@OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
	public static int anInt943 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method619() {
		aClass42_3 = null;
		aClass4_448 = null;
		aClass4_449 = null;
		aClass4_445 = null;
		aClass4_447 = null;
		aClass4_446 = null;
		aClass4_450 = null;
		aClass4_451 = null;
		aClass41_1 = null;
		anIntArray88 = null;
		aBooleanArray6 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method620(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!pb;")
	public static Class3_Sub1_Sub11 method621(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub1_Sub11 local18 = (Class3_Sub1_Sub11) Static94.aClass8_28.method195((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static36.aClass64_30.method1625(1, arg0);
		local18 = new Class3_Sub1_Sub11();
		if (local28 != null) {
			local18.method1260(arg0, new Class3_Sub4(local28));
		}
		local18.method1264();
		Static94.aClass8_28.method199((long) arg0, local18);
		return local18;
	}
}
