import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!we;")
	public static Class5_Sub1_Sub10_Sub4 aClass5_Sub1_Sub10_Sub4_5;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int anInt2361;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	public static int anInt2365;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1165 = Static38.method736("Enter your username (V password)3");

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1167 = Static38.method736("Take");

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1166 = aClass71_1167;

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1174 = Static38.method736("yellow:");

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1168 = aClass71_1174;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1169 = Static38.method736("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	public static int anInt2363 = -1;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1170 = aClass71_1165;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1171 = Static38.method736("Your account has been disabled)3");

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1172 = Static38.method736("titlebutton");

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1175 = aClass71_1171;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1176 = Static38.method736("backvmid3");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIBI)I")
	public static int method1632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg4;
			arg4 = local6;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return 1 + 7 - arg1 - arg3;
		} else if (local18 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method1633() {
		aClass71_1170 = null;
		aClass71_1169 = null;
		aClass71_1172 = null;
		aClass71_1171 = null;
		aClass71_1174 = null;
		aClass71_1167 = null;
		aClass71_1166 = null;
		aClass71_1168 = null;
		aClass71_1175 = null;
		aClass71_1176 = null;
		aClass71_1165 = null;
		aClass5_Sub1_Sub10_Sub4_5 = null;
	}
}
