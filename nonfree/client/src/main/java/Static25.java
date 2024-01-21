import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!e", name = "y", descriptor = "Lclient!qc;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "[B")
	public static byte[] aByteArray6 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_169 = Static60.method1113("leuchten1:");

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!ec;")
	private static Class22 aClass22_170 = Static60.method1113("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!e", name = "A", descriptor = "I")
	public static int anInt574 = 0;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "Lclient!ec;")
	private static Class22 aClass22_175 = Static60.method1113("Loaded fonts");

	@OriginalMember(owner = "client!e", name = "B", descriptor = "Lclient!ec;")
	public static Class22 aClass22_171 = aClass22_175;

	@OriginalMember(owner = "client!e", name = "D", descriptor = "Lclient!ec;")
	public static Class22 aClass22_172 = Static60.method1113("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Lclient!ec;")
	public static Class22 aClass22_173 = aClass22_170;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "Lclient!ec;")
	public static Class22 aClass22_174 = Static60.method1113("compass");

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static void method404() {
		aClass22_171 = null;
		aClass22_169 = null;
		aClass22_174 = null;
		aClass22_170 = null;
		aClass22_172 = null;
		aClass22_175 = null;
		aByteArray6 = null;
		aClass15_1 = null;
		aClass22_173 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)I")
	public static int method405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub19 local12 = (Class4_Sub19) Static30.aClass81_4.method2010((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray272.length; local31++) {
				if (local12.anIntArray273[local31] == arg1) {
					local24 += local12.anIntArray272[local31];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)Z")
	public static boolean method406() {
		return Static80.anInt2197 == 0 ? Static69.aClass4_Sub4_Sub1_2.method206() : true;
	}
}
