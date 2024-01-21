import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!ie;")
	public static Class3_Sub3_Sub2 aClass3_Sub3_Sub2_63;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!ef;")
	public static Class16 aClass16_149;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Lclient!ef;")
	public static Class16 aClass16_150;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!he;")
	private static Class26 aClass26_1745 = Static6.method100("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_1744 = aClass26_1745;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_1746 = Static6.method100("sl_flags");

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!se;")
	public static Class65 aClass65_81 = new Class65();

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_1747 = Static6.method100("mapback");

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1748 = Static6.method100("Hier wechseln");

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public static int anInt3221 = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1749 = Static6.method100("mapmarker");

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!he;")
	private static Class26 aClass26_1751 = Static6.method100("Login limit exceeded)3");

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1750 = aClass26_1751;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "[I")
	public static int[] anIntArray388 = new int[2000];

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	public static int anInt3225 = 0;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	public static int anInt3226 = 0;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!he;")
	private static Class26 aClass26_1757 = Static6.method100("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Lclient!he;")
	public static Class26 aClass26_1752 = aClass26_1757;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!he;")
	private static Class26 aClass26_1754 = Static6.method100("level)2");

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!he;")
	public static Class26 aClass26_1753 = aClass26_1754;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!he;")
	private static Class26 aClass26_1758 = Static6.method100("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "Lclient!he;")
	public static Class26 aClass26_1755 = aClass26_1758;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "Lclient!he;")
	public static Class26 aClass26_1756 = Static6.method100("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method2200() {
		aClass26_1753 = null;
		aClass26_1751 = null;
		aClass26_1754 = null;
		aClass26_1750 = null;
		aClass26_1756 = null;
		aClass26_1757 = null;
		aClass16_150 = null;
		aClass16_149 = null;
		anIntArray388 = null;
		aClass26_1752 = null;
		aClass65_81 = null;
		aClass26_1749 = null;
		aClass26_1744 = null;
		aClass26_1758 = null;
		aClass26_1755 = null;
		aClass3_Sub3_Sub2_63 = null;
		aClass26_1745 = null;
		aClass26_1748 = null;
		aClass26_1746 = null;
		aClass26_1747 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!nc;)Z")
	public static boolean method2202(@OriginalArg(1) Class3_Sub14 arg0) {
		@Pc(6) int local6 = arg0.anInt2186;
		if (local6 == 205) {
			Static126.anInt3213 = 250;
			return true;
		}
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (local6 >= 300 && local6 <= 313) {
			local27 = (local6 - 300) / 2;
			local31 = local6 & 0x1;
			Static119.aClass35_2.method1140(local31 == 1, local27);
		}
		if (local6 >= 314 && local6 <= 323) {
			local27 = (local6 - 314) / 2;
			local31 = local6 & 0x1;
			Static119.aClass35_2.method1147(local31 == 1, local27);
		}
		if (local6 == 324) {
			Static119.aClass35_2.method1146(false);
		}
		if (local6 == 325) {
			Static119.aClass35_2.method1146(true);
		}
		if (local6 == 326) {
			Static107.aClass3_Sub11_Sub1_3.method1029(49);
			Static119.aClass35_2.method1149(Static107.aClass3_Sub11_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIII)I")
	public static int method2204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return arg0 / 2 + (arg1 / 32 << 7) + (arg2 / 4 << 10);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIILclient!nc;II)V")
	public static void method2205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub14 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static53.aBoolean85) {
			Static12.anInt299 = 32;
		} else {
			Static12.anInt299 = 0;
		}
		Static53.aBoolean85 = false;
		@Pc(129) int local129;
		if (Static21.anInt826 != 0) {
			if (arg1 <= arg0 && arg0 < arg1 + 16 && arg6 >= arg5 && arg5 + 16 > arg6) {
				arg4.anInt2193 -= 4;
				Static110.method2004(arg4);
			} else if (arg1 <= arg0 && arg0 < arg1 + 16 && arg5 + arg3 - 16 <= arg6 && arg6 < arg5 + arg3) {
				arg4.anInt2193 += 4;
				Static110.method2004(arg4);
			} else if (arg0 >= arg1 - Static12.anInt299 && arg1 + Static12.anInt299 + 16 > arg0 && arg5 + 16 <= arg6 && arg3 + arg5 - 16 > arg6) {
				local129 = arg3 * (arg3 - 32) / arg2;
				if (local129 < 8) {
					local129 = 8;
				}
				@Pc(148) int local148 = arg6 - arg5 - local129 / 2 - 16;
				@Pc(155) int local155 = arg3 - local129 - 32;
				arg4.anInt2193 = local148 * (arg2 - arg3) / local155;
				Static110.method2004(arg4);
				Static53.aBoolean85 = true;
			}
		}
		if (Static6.anInt162 == 0) {
			return;
		}
		local129 = arg4.anInt2146;
		if (arg1 - local129 <= arg0 && arg5 <= arg6 && arg0 < arg1 + 16 && arg5 + arg3 >= arg6) {
			arg4.anInt2193 += Static6.anInt162 * 45;
			Static110.method2004(arg4);
			return;
		}
	}
}
