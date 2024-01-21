import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!pb;")
	public static Class31 aClass31_11;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!b;")
	public static Class5 aClass5_1 = new Class5();

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt449 = -1;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_243 = Static23.method501("Fertigkeit)2");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_244 = Static23.method501("@gr1@");

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_245 = Static23.method501("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	public static int anInt459 = 0;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt460 = 0;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_246 = Static23.method501(",Zffentlicher Chat");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	public static int anInt461 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)I")
	public static int method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static89.method1649(arg1 + 45365, 4, arg0 + 91923) + (Static89.method1649(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static89.method1649(arg1, 1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	public static void method321() {
		aClass42_246 = null;
		aClass42_245 = null;
		aClass42_243 = null;
		aClass5_1 = null;
		aClass42_244 = null;
		aClass31_11 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lclient!mc;")
	public static Class42 method322(@OriginalArg(0) int arg0) {
		@Pc(9) Class42 local9 = Static38.method642(arg0);
		for (@Pc(15) int local15 = local9.method1027() - 3; local15 > 0; local15 -= 3) {
			local9 = Static57.method1822(new Class42[] { local9.method1053(0, local15), Static88.aClass42_1246, local9.method1051(local15) });
		}
		if (local9.method1027() > 8) {
			local9 = Static57.method1822(new Class42[] { Static45.aClass42_961, local9.method1053(0, local9.method1027() - 8), Static83.aClass42_1181, Static27.aClass42_415, local9, Static82.aClass42_1163 });
		} else if (local9.method1027() > 4) {
			local9 = Static57.method1822(new Class42[] { Static33.aClass42_461, local9.method1053(0, local9.method1027() - 4), Static15.aClass42_301, Static27.aClass42_415, local9, Static82.aClass42_1163 });
		}
		return Static57.method1822(new Class42[] { Static59.aClass42_1048, local9 });
	}
}
