import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "U", descriptor = "Lclient!cg;")
	public static Class2_Sub1_Sub4_Sub1_Sub1 aClass2_Sub1_Sub4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!af", name = "X", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_7;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "Lclient!cd;")
	private static Class10 aClass10_108 = Static51.method932("Loading)3)3)3");

	@OriginalMember(owner = "client!af", name = "V", descriptor = "Lclient!cd;")
	public static Class10 aClass10_109 = aClass10_108;

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "[Lclient!v;")
	public static Class2_Sub1_Sub3_Sub7[] aClass2_Sub1_Sub3_Sub7Array1 = new Class2_Sub1_Sub3_Sub7[4];

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_114 = Static51.method932("No response from server)3");

	@OriginalMember(owner = "client!af", name = "ab", descriptor = "Lclient!cd;")
	public static Class10 aClass10_110 = aClass10_114;

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "[S")
	public static short[] aShortArray5 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_112 = Static51.method932("glow2:");

	@OriginalMember(owner = "client!af", name = "cb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_111 = aClass10_112;

	@OriginalMember(owner = "client!af", name = "gb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_113 = aClass10_112;

	@OriginalMember(owner = "client!af", name = "lb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_115 = Static51.method932("Hidden)2use");

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "[Lclient!gd;")
	public static Class29_Sub1[] aClass29_Sub1Array1 = new Class29_Sub1[256];

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
	public static void method136() {
		aClass10_108 = null;
		aClass10_110 = null;
		aShortArray5 = null;
		aClass2_Sub1_Sub4_Sub1_Sub1_1 = null;
		aClass29_Sub1_7 = null;
		aClass10_112 = null;
		aClass10_113 = null;
		aClass10_111 = null;
		aClass2_Sub1_Sub3_Sub7Array1 = null;
		aClass29_Sub1Array1 = null;
		aClass10_115 = null;
		aClass10_114 = null;
		aClass10_109 = null;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public static void method138() {
		for (@Pc(6) Class2_Sub19 local6 = (Class2_Sub19) Static158.aClass12_13.method384(); local6 != null; local6 = (Class2_Sub19) Static158.aClass12_13.method381()) {
			if (local6.anInt2994 > 0) {
				local6.anInt2994--;
			}
			if (local6.anInt2994 != 0) {
				if (local6.anInt2990 > 0) {
					local6.anInt2990--;
				}
				if (local6.anInt2990 == 0 && local6.anInt2993 >= 1 && local6.anInt2998 >= 1 && local6.anInt2993 <= 102 && local6.anInt2998 <= 102 && (local6.anInt2992 < 0 || Static40.method787(local6.anInt2992, local6.anInt3003))) {
					Static75.method1258(local6.anInt3001, local6.anInt2996, local6.anInt2998, local6.anInt3000, local6.anInt3003, local6.anInt2992, local6.anInt2993);
					local6.anInt2990 = -1;
					if (local6.anInt3005 == local6.anInt2992 && local6.anInt3005 == -1) {
						local6.method2705();
					} else if (local6.anInt3005 == local6.anInt2992 && local6.anInt2997 == local6.anInt2996 && local6.anInt3002 == local6.anInt3003) {
						local6.method2705();
					}
				}
			} else if (local6.anInt3005 < 0 || Static40.method787(local6.anInt3005, local6.anInt3002)) {
				Static75.method1258(local6.anInt3001, local6.anInt2997, local6.anInt2998, local6.anInt3000, local6.anInt3002, local6.anInt3005, local6.anInt2993);
				local6.method2705();
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(III)I")
	public static int method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 - 1 & arg0 >> 31;
		return local7 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
