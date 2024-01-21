import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!hc", name = "yb", descriptor = "[I")
	public static int[] anIntArray133;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_508 = Static56.method972("::fpson");

	@OriginalMember(owner = "client!hc", name = "ib", descriptor = "Lclient!ae;")
	private static Class5 aClass5_509 = Static56.method972("yellow:");

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_510 = aClass5_509;

	@OriginalMember(owner = "client!hc", name = "ub", descriptor = "Lclient!ae;")
	private static Class5 aClass5_513 = Static56.method972("Please wait)3)3)3");

	@OriginalMember(owner = "client!hc", name = "ob", descriptor = "Lclient!ae;")
	public static Class5 aClass5_511 = aClass5_513;

	@OriginalMember(owner = "client!hc", name = "qb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_512 = Static56.method972("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!hc", name = "sb", descriptor = "[I")
	public static int[] anIntArray132 = new int[2000];

	@OriginalMember(owner = "client!hc", name = "vb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_514 = Static56.method972("mod_icons");

	@OriginalMember(owner = "client!hc", name = "xb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_515 = aClass5_513;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
	public static void method757() {
		anIntArray132 = null;
		aClass5_510 = null;
		aClass3_Sub1_Sub2_Sub3_3 = null;
		aClass5_508 = null;
		aClass5_514 = null;
		aClass5_515 = null;
		anIntArray133 = null;
		aClass5_511 = null;
		aClass5_513 = null;
		aClass5_509 = null;
		aClass5_512 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIIILclient!r;I)V")
	public static void method758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub15 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub10 local7 = new Class3_Sub10();
		local7.anInt2108 = arg2 * 128;
		local7.anInt2105 = arg0 * 128;
		@Pc(24) int local24 = arg3.anInt2331;
		local7.anIntArray233 = arg3.anIntArray259;
		local7.anInt2102 = arg4;
		local7.anInt2104 = arg3.anInt2334;
		local7.anInt2117 = arg3.anInt2311 * 128;
		local7.anInt2109 = arg3.anInt2329;
		local7.anInt2113 = arg3.anInt2317;
		@Pc(52) int local52 = arg3.anInt2312;
		if (arg1 == 1 || arg1 == 3) {
			local52 = arg3.anInt2331;
			local24 = arg3.anInt2312;
		}
		local7.anInt2112 = (arg2 + local52) * 128;
		local7.anInt2110 = (local24 + arg0) * 128;
		if (arg3.anIntArray263 != null) {
			local7.aClass3_Sub1_Sub15_1 = arg3;
			local7.method1366();
		}
		Static5.aClass51_1.method1303(local7);
		if (local7.anIntArray233 != null) {
			local7.anInt2115 = local7.anInt2104 + (int) ((double) (local7.anInt2113 - local7.anInt2104) * Math.random());
		}
	}
}
