import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public static int anInt1997;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_48;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_49;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!wd;")
	private static Class80 aClass80_772 = Static2.method59("Loaded input handler");

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_773 = aClass80_772;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!wd;")
	public static Class80 aClass80_774 = Static2.method59("(U5");

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Lclient!wd;")
	public static Class80 aClass80_775 = Static2.method59("Welt");

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Lclient!wd;")
	private static Class80 aClass80_776 = Static2.method59("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "Lclient!wd;")
	public static Class80 aClass80_777 = Static2.method59("Texturen geladen)3");

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!wd;")
	public static Class80 aClass80_778 = aClass80_776;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Lclient!wd;")
	public static Class80 aClass80_779 = Static2.method59("VOLL");

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "Lclient!wd;")
	public static Class80 aClass80_780 = Static2.method59("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "Lclient!wd;")
	public static Class80 aClass80_781 = Static2.method59("System)2Update in: ");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!ff;I)[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] method1208(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) int arg2) {
		return Static123.method1974(arg1, arg2, arg0) ? Static2.method57() : null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIII)V")
	public static void method1209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static59.anInt1769 = -1;
			Static105.anInt2322 = -1;
			return;
		}
		@Pc(35) int local35 = Static24.method513(arg0, Static16.anInt444, arg2) - arg1;
		@Pc(39) int local39 = arg0 - Static53.anInt1647;
		@Pc(43) int local43 = arg2 - Static42.anInt1257;
		@Pc(47) int local47 = Class2_Sub1_Sub9_Sub2.anIntArray202[Static82.anInt3082];
		@Pc(51) int local51 = Class2_Sub1_Sub9_Sub2.anIntArray198[Static80.anInt2025];
		@Pc(60) int local60 = local35 - Static107.anInt2863;
		@Pc(64) int local64 = Class2_Sub1_Sub9_Sub2.anIntArray202[Static80.anInt2025];
		@Pc(74) int local74 = local51 * local39 + local43 * local64 >> 16;
		@Pc(78) int local78 = Class2_Sub1_Sub9_Sub2.anIntArray198[Static82.anInt3082];
		@Pc(89) int local89 = local51 * local43 - local64 * local39 >> 16;
		@Pc(91) int local91 = local74;
		@Pc(102) int local102 = local60 * local78 - local89 * local47 >> 16;
		@Pc(113) int local113 = local47 * local60 + local89 * local78 >> 16;
		if (local113 < 50) {
			Static105.anInt2322 = -1;
			Static59.anInt1769 = -1;
		} else {
			Static105.anInt2322 = (local91 << 9) / local113 + 256;
			Static59.anInt1769 = (local102 << 9) / local113 + 167;
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public static void method1212() {
		aClass80_779 = null;
		aClass80_776 = null;
		aClass2_Sub1_Sub9_Sub3_49 = null;
		aClass2_Sub1_Sub9_Sub3_48 = null;
		aClass80_777 = null;
		aClass80_772 = null;
		aClass80_774 = null;
		aClass80_778 = null;
		aClass80_775 = null;
		aClass80_773 = null;
		aClass80_780 = null;
		aClass80_781 = null;
	}
}
