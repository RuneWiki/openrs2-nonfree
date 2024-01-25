import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "Lclient!oa;")
	public static Class5 aClass5_4;

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
	public static int anInt1380;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "Lclient!dba;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!ju", name = "N", descriptor = "Z")
	private static boolean aBoolean109;

	@OriginalMember(owner = "client!ju", name = "O", descriptor = "Z")
	private static boolean aBoolean110;

	@OriginalMember(owner = "client!ju", name = "P", descriptor = "Z")
	private static boolean aBoolean111;

	@OriginalMember(owner = "client!ju", name = "Q", descriptor = "Z")
	private static boolean aBoolean112;

	@OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
	private static int anInt1387;

	@OriginalMember(owner = "client!ju", name = "S", descriptor = "Z")
	private static boolean aBoolean113;

	@OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
	private static int anInt1388;

	@OriginalMember(owner = "client!ju", name = "U", descriptor = "I")
	private static int anInt1389;

	@OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
	private static int anInt1390;

	@OriginalMember(owner = "client!ju", name = "W", descriptor = "I")
	private static int anInt1391;

	@OriginalMember(owner = "client!ju", name = "X", descriptor = "Z")
	private static boolean aBoolean114;

	@OriginalMember(owner = "client!ju", name = "Y", descriptor = "I")
	private static int anInt1392;

	@OriginalMember(owner = "client!ju", name = "Z", descriptor = "I")
	private static int anInt1393;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!kr;Z)V")
	public static void method1276(@OriginalArg(0) Class3_Sub27_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static336.anInt6336; local12++) {
			@Pc(18) int local18 = Static345.anIntArray563[local12];
			@Pc(22) Class6_Sub1_Sub2_Sub1 local22 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local18];
			@Pc(26) int local26 = arg0.method7548();
			if ((local26 & 0x20) != 0) {
				local26 += arg0.method7548() << 8;
			}
			if ((local26 & 0x800) != 0) {
				local26 += arg0.method7548() << 16;
			}
			Static233.method4153(local22, arg0, local18, local26);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ad;[BIIIIIZ)Lclient!ah;")
	public static Class11_Sub1_Sub1 method1277(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (arg0.aBoolean31 || Static260.method4582(arg2) && Static260.method4582(arg3)) {
			return new Class11_Sub1_Sub1(arg0, 3553, 6406, arg2, arg3, false, arg1, 6406);
		} else if (arg0.aBoolean40) {
			return new Class11_Sub1_Sub1(arg0, 34037, 6406, arg2, arg3, false, arg1, 6406);
		} else {
			return new Class11_Sub1_Sub1(arg0, 6406, arg2, arg3, Static483.method7134(arg2), Static483.method7134(arg3), arg1, 6406);
		}
	}
}
