import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array8;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!re;")
	public static Class9 aClass9_34;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	public static int anInt1559;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Lclient!g;")
	public static Class26 aClass26_16;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_1097 = method1077("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!u;")
	private static Class74 aClass74_1100 = method1077("Off");

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_1098 = aClass74_1100;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_1099 = method1077("Angreifen");

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_1104 = method1077("Please enter your password)3");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1101 = aClass74_1104;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!u;")
	private static Class74 aClass74_1102 = method1077("Loading wordpack )2 ");

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1103 = method1077("welle:");

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array10 = new Class74[1000];

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_1105 = aClass74_1102;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_1106 = method1077("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/String;)Lclient!u;")
	public static Class74 method1077(@OriginalArg(1) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(9) int local9 = local2.length;
		@Pc(18) Class74 local18 = new Class74();
		local18.aByteArray38 = new byte[local9];
		@Pc(24) int local24 = 0;
		while (local9 > local24) {
			@Pc(32) int local32 = local2[local24++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local9 <= local24) {
					break;
				}
				@Pc(74) int local74 = local2[local24++] & 0xFF;
				local18.aByteArray38[local18.anInt2481++] = (byte) ((local32 - 40) * 43 + local74 - 48);
			} else if (local32 != 0) {
				local18.aByteArray38[local18.anInt2481++] = (byte) local32;
			}
		}
		local18.method1728();
		return local18.method1723();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method1078() {
		aClass26_16 = null;
		aClass9_34 = null;
		aClass74_1100 = null;
		aClass74_1099 = null;
		aClass74_1097 = null;
		aClass74_1098 = null;
		aClass74_1101 = null;
		aClass74_1106 = null;
		aClass74_1102 = null;
		aClass2_Sub2_Sub1_Sub2Array8 = null;
		aClass74_1103 = null;
		aClass74Array10 = null;
		aClass74_1105 = null;
		aClass74_1104 = null;
	}
}
