import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public static int anInt2624;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_951 = Static177.method3050("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_952 = Static177.method3050("hitmarks");

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_953 = Static177.method3050("Players");

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_954 = Static177.method3050("Malformed login packet)3");

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!jd;")
	public static Class46 aClass46_955 = aClass46_954;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!jd;")
	public static Class46 aClass46_956 = aClass46_953;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lclient!ji;")
	public static Class4_Sub1_Sub11 method1980(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub1_Sub11 local10 = (Class4_Sub1_Sub11) Static45.aClass66_23.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static65.aClass62_15.method2878(Static124.method2215(arg0), Static142.method2444(arg0));
		local10 = new Class4_Sub1_Sub11();
		local10.anInt2248 = arg0;
		if (local29 != null) {
			local10.method1745(new Class4_Sub11(local29));
		}
		local10.method1746();
		Static45.aClass66_23.method2222(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ac;)V")
	public static void method1981(@OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt2838 = 0;
		if (arg0.anInt2815 == 0) {
			arg0.anInt2829 = 1024;
		}
		@Pc(25) int local25 = arg0.anInt2805 * 64 + arg0.anInt2802 * 128;
		if (arg0.anInt2815 == 1) {
			arg0.anInt2829 = 1536;
		}
		@Pc(45) int local45 = arg0.anInt2806 * 128 + arg0.anInt2805 * 64;
		if (arg0.anInt2815 == 2) {
			arg0.anInt2829 = 0;
		}
		@Pc(64) int local64 = arg0.anInt2835 - Static142.anInt3325;
		if (arg0.anInt2815 == 3) {
			arg0.anInt2829 = 512;
		}
		arg0.anInt2832 += (local25 - arg0.anInt2832) / local64;
		arg0.anInt2803 += (local45 - arg0.anInt2803) / local64;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!jd;IILclient!jd;)V")
	public static void method1982(@OriginalArg(0) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		Static2.method20(arg2, arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	public static void method1983(@OriginalArg(0) int arg0) {
		Static92.anInt2363 = arg0;
	}
}
