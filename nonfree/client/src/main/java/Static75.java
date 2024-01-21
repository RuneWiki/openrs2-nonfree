import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	public static int anInt1778;

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "Lclient!sa;")
	public static Class72 aClass72_16 = new Class72(64);

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "Lclient!cd;")
	public static Class10 aClass10_772 = Static51.method932("hel");

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "Lclient!kg;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_1 = new Class2_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "Lclient!cd;")
	public static Class10 aClass10_773 = Static51.method932("<col=ff0000>");

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array12 = new Class10[500];

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "Lclient!cd;")
	public static Class10 aClass10_774 = Static51.method932("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
	public static int anInt1785 = 0;

	@OriginalMember(owner = "client!ja", name = "O", descriptor = "Lclient!cd;")
	public static Class10 aClass10_775 = Static51.method932("Mem:");

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method1257() {
		aClass10_774 = null;
		aClass10_773 = null;
		aClass72_16 = null;
		aClass2_Sub11_Sub1_1 = null;
		aClass10Array12 = null;
		aClass10_772 = null;
		aClass10_775 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
			return;
		}
		if (Static170.aBoolean163 && Static56.anInt1432 != arg3) {
			return;
		}
		@Pc(38) int local38 = 0;
		if (arg0 == 0) {
			local38 = Static180.aClass60_1.method1785(arg3, arg6, arg2);
		}
		if (arg0 == 1) {
			local38 = Static180.aClass60_1.method1782(arg3, arg6, arg2);
		}
		if (arg0 == 2) {
			local38 = Static180.aClass60_1.method1819(arg3, arg6, arg2);
		}
		if (arg0 == 3) {
			local38 = Static180.aClass60_1.method1784(arg3, arg6, arg2);
		}
		@Pc(97) int local97;
		if (local38 != 0) {
			@Pc(90) int local90 = local38 >> 14 & 0x7FFF;
			local97 = Static180.aClass60_1.method1803(arg3, arg6, arg2, local38);
			@Pc(103) int local103 = local97 >> 6 & 0x3;
			@Pc(107) int local107 = local97 & 0x1F;
			@Pc(121) Class2_Sub1_Sub10 local121;
			if (arg0 == 0) {
				Static180.aClass60_1.method1811(arg3, arg6, arg2);
				local121 = Static62.method1106(local90);
				if (local121.anInt2220 != 0) {
					Static59.aClass27Array1[arg3].method933(arg2, arg6, local121.aBoolean94, local103, local107);
				}
			}
			if (arg0 == 1) {
				Static180.aClass60_1.method1779(arg3, arg6, arg2);
			}
			if (arg0 == 2) {
				Static180.aClass60_1.method1815(arg3, arg6, arg2);
				local121 = Static62.method1106(local90);
				if (arg6 + local121.anInt2225 > 103 || local121.anInt2225 + arg2 > 103 || arg6 + local121.anInt2210 > 103 || local121.anInt2210 + arg2 > 103) {
					return;
				}
				if (local121.anInt2220 != 0) {
					Static59.aClass27Array1[arg3].method939(arg6, arg2, local103, local121.anInt2225, local121.aBoolean94, local121.anInt2210);
				}
			}
			if (arg0 == 3) {
				Static180.aClass60_1.method1813(arg3, arg6, arg2);
				local121 = Static62.method1106(local90);
				if (local121.anInt2220 == 1) {
					Static59.aClass27Array1[arg3].method942(arg6, arg2);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local97 = arg3;
		if (arg3 < 3 && (Static50.aByteArrayArrayArray3[1][arg6][arg2] & 0x2) == 2) {
			local97 = arg3 + 1;
		}
		Static174.method2693(Static59.aClass27Array1[arg3], arg3, arg6, Static180.aClass60_1, local97, arg2, arg1, arg5, arg4);
		return;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Z")
	public static boolean method1259() {
		@Pc(5) Class84 local5 = Static156.aClass84_1;
		synchronized (Static156.aClass84_1) {
			if (Static66.anInt1601 == Static60.anInt1492) {
				return false;
			} else {
				Static64.anInt1577 = Static167.anIntArray222[Static60.anInt1492];
				Static149.anInt3227 = Static97.anIntArray239[Static60.anInt1492];
				Static60.anInt1492 = Static60.anInt1492 + 1 & 0x7F;
				return true;
			}
		}
	}
}
