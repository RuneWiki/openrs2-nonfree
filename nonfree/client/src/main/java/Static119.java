import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public static int anInt2886;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1067 = Static177.method3050("blaugr-Un:");

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1068 = Static177.method3050("title_mute");

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1069 = Static177.method3050("level)2");

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array21 = new Class46[100];

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1070 = aClass46_1069;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	public static int method2144(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lclient!rc;")
	public static Class4_Sub1_Sub17 method2145(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub1_Sub17 local14 = (Class4_Sub1_Sub17) Static187.aClass66_51.method2225((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static40.aClass62_12.method2878(Static88.method1752(arg0), Static4.method2112(arg0));
		local14 = new Class4_Sub1_Sub17();
		if (local28 != null) {
			local14.method2488(new Class4_Sub11(local28));
		}
		Static187.aClass66_51.method2222(local14, (long) arg0);
		return local14;
	}
}
