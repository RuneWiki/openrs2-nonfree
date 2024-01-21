import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!kf", name = "wb", descriptor = "Lclient!vc;")
	public static Class76 aClass76_3;

	@OriginalMember(owner = "client!kf", name = "zb", descriptor = "I")
	public static int anInt1933;

	@OriginalMember(owner = "client!kf", name = "nb", descriptor = "Lclient!ec;")
	public static Class17 aClass17_13 = new Class17(4096);

	@OriginalMember(owner = "client!kf", name = "qb", descriptor = "Lclient!he;")
	private static Class26 aClass26_953 = Static6.method100("Password: ");

	@OriginalMember(owner = "client!kf", name = "rb", descriptor = "Lclient!he;")
	public static Class26 aClass26_954 = aClass26_953;

	@OriginalMember(owner = "client!kf", name = "sb", descriptor = "Lclient!he;")
	public static Class26 aClass26_955 = Static6.method100("sch-Utteln:");

	@OriginalMember(owner = "client!kf", name = "ub", descriptor = "Lclient!he;")
	private static Class26 aClass26_956 = Static6.method100(" from your friend list first");

	@OriginalMember(owner = "client!kf", name = "vb", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array16 = new Class26[100];

	@OriginalMember(owner = "client!kf", name = "xb", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!kf", name = "yb", descriptor = "Lclient!he;")
	public static Class26 aClass26_957 = aClass26_956;

	@OriginalMember(owner = "client!kf", name = "Ab", descriptor = "I")
	public static int anInt1934 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLclient!qb;II)V")
	public static void method1247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub4_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static52.anInt1614 + Static78.anInt2107 & 0x7FF;
		@Pc(20) int local20 = arg1 * arg1 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(28) int local28 = Class3_Sub1_Sub4_Sub4.anIntArray391[local12];
		@Pc(36) int local36 = local28 * 256 / (Static33.anInt1081 + 256);
		@Pc(40) int local40 = Class3_Sub1_Sub4_Sub4.anIntArray392[local12];
		@Pc(58) int local58 = local40 * 256 / (Static33.anInt1081 + 256);
		@Pc(69) int local69 = local58 * arg1 - arg0 * local36 >> 16;
		@Pc(79) int local79 = local36 * arg1 + arg0 * local58 >> 16;
		if (local20 > 2500) {
			arg2.method1751(Static4.aClass3_Sub1_Sub4_Sub1_1, arg4 + local79 + 94 + 4 - arg2.anInt2584 / 2, -(arg2.anInt2582 / 2) + (arg3 + 83 + -local69 - 4));
		} else {
			arg2.method1758(arg4 + local79 + 94 + 4 - arg2.anInt2584 / 2, -local69 + 83 + (arg3 - arg2.anInt2582 / 2) + -4);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!he;ILclient!he;Lclient!he;)V")
	public static void method1249(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class26 arg2) {
		Static55.aClass26_833 = arg2;
		Static55.aClass26_830 = arg0;
		Static55.aClass26_834 = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public static void method1250() {
		aClass76_3 = null;
		Class3_Sub1_Sub10.anIntArray177 = null;
		aClass26_954 = null;
		aClass26Array16 = null;
		aClass26_957 = null;
		aClass26_953 = null;
		aClass26_955 = null;
		aClass26_956 = null;
		aClass17_13 = null;
	}
}
