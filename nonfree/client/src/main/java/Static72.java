import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	public static int anInt1642;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!id;")
	public static Class1_Sub6 aClass1_Sub6_2;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1030 = Static69.method1153("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1032 = Static69.method1153("Remove");

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1031 = aClass64_1032;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1033 = Static69.method1153("@yel@*V");

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public static int anInt1640 = 128;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public static int anInt1641 = 0;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1034 = Static69.method1153("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1191() {
		aClass64_1030 = null;
		aClass1_Sub6_2 = null;
		aClass64_1032 = null;
		aClass64_1031 = null;
		aClass64_1034 = null;
		aClass64_1033 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
	public static void method1192(@OriginalArg(0) int arg0) {
		Static84.anInt1930 += arg0;
		while (Static84.anInt1930 >= Static43.anInt980) {
			Static84.anInt1930 -= Static43.anInt980;
			Static113.anInt1816 -= Static113.anInt1816 >> 2;
		}
		Static113.anInt1816 -= arg0 * 1000;
		if (Static113.anInt1816 < 0) {
			Static113.anInt1816 = 0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
	public static int method1193() {
		return Static49.anInt1165++;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIILclient!nd;I)V")
	public static void method1194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub1_Sub11 arg6, @OriginalArg(8) int arg7) {
		if (Static77.aBoolean115) {
			Static5.anInt128 = 32;
		} else {
			Static5.anInt128 = 0;
		}
		Static77.aBoolean115 = false;
		@Pc(145) int local145;
		if (arg5 >= arg7 && arg7 + 16 > arg5 && arg2 <= arg3 && arg2 + 16 > arg3) {
			arg6.anInt1689 -= Static50.anInt1190 * 4;
			if (arg4 == 1) {
				Static19.aBoolean41 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static116.aBoolean166 = true;
			}
		} else if (arg7 <= arg5 && arg7 + 16 > arg5 && arg3 >= arg1 + arg2 - 16 && arg2 + arg1 > arg3) {
			arg6.anInt1689 += Static50.anInt1190 * 4;
			if (arg4 == 1) {
				Static19.aBoolean41 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static116.aBoolean166 = true;
			}
		} else if (arg7 - Static5.anInt128 <= arg5 && Static5.anInt128 + arg7 + 16 > arg5 && arg2 + 16 <= arg3 && arg1 + arg2 - 16 > arg3 && Static50.anInt1190 > 0) {
			Static77.aBoolean115 = true;
			local145 = arg1 * (arg1 - 32) / arg0;
			if (arg4 == 1) {
				Static19.aBoolean41 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static116.aBoolean166 = true;
			}
			if (local145 < 8) {
				local145 = 8;
			}
			@Pc(177) int local177 = arg3 - local145 / 2 - arg2 - 16;
			@Pc(184) int local184 = arg1 - local145 - 32;
			arg6.anInt1689 = (arg0 - arg1) * local177 / local184;
		}
		if (Static120.anInt2853 == 0) {
			return;
		}
		local145 = arg6.anInt1700;
		if (arg4 == -1) {
			local145 = 479;
		}
		if (arg5 < arg7 - local145 || arg2 > arg3 || arg5 >= arg7 + 16 || arg1 + arg2 < arg3) {
			return;
		}
		if (arg4 == 1) {
			Static19.aBoolean41 = true;
		}
		arg6.anInt1689 += Static120.anInt2853 * 45;
		if (arg4 == 2 || arg4 == 3) {
			Static116.aBoolean166 = true;
		}
		return;
	}
}
