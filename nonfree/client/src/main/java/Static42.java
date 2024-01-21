import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!he", name = "Cb", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!he", name = "Kb", descriptor = "Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!he", name = "Mb", descriptor = "Lclient!bd;")
	public static Class8 aClass8_15;

	@OriginalMember(owner = "client!he", name = "Sb", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!he", name = "Ab", descriptor = "Lclient!a;")
	public static Class1 aClass1_1431 = Static94.method1596(":tradereq:");

	@OriginalMember(owner = "client!he", name = "Db", descriptor = "Lclient!a;")
	public static Class1 aClass1_1432 = Static94.method1596("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!he", name = "Ib", descriptor = "I")
	public static int anInt1435 = 0;

	@OriginalMember(owner = "client!he", name = "Jb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1433 = Static94.method1596("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!he", name = "Pb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1434 = Static94.method1596("sch-Utteln:");

	@OriginalMember(owner = "client!he", name = "Qb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1435 = Static94.method1596("titlebox");

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V")
	public static void method976() {
		aClass1_1435 = null;
		aClass8_15 = null;
		aClass1_1432 = null;
		aClass2_Sub1_Sub2_Sub4_3 = null;
		aClass1_1431 = null;
		aClass2_Sub1_Sub2_Sub4Array6 = null;
		aClass1_1433 = null;
		aClass1_1434 = null;
		anIntArrayArray9 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([Lclient!ad;I[BIIII)V")
	public static void method979(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg3 + local11 > 0 && local11 + arg3 < 103 && arg4 + local15 > 0 && local15 + arg4 < 103) {
						arg0[local7].anIntArrayArray3[local11 + arg3][local15 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(88) Class2_Sub3 local88 = new Class2_Sub3(arg2);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					Static81.method1489(local98 + arg3, 0, local88, local102 + arg4, arg5, arg1, local15);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBI)Z")
	public static boolean method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 >> 14 & 0x7FFF;
		@Pc(27) int local27 = Static109.aClass3_1.method173(Static2.anInt287, arg0, arg2, arg1);
		if (local27 == -1) {
			return false;
		}
		@Pc(38) int local38 = local27 >> 6 & 0x3;
		@Pc(42) int local42 = local27 & 0x1F;
		if (local42 == 10 || local42 == 11 || local42 == 22) {
			@Pc(79) Class2_Sub1_Sub10 local79 = Static28.method739(local11);
			@Pc(82) int local82 = local79.anInt1488;
			if (local38 != 0) {
				local82 = (local82 >> 4 - local38) + (local82 << local38 & 0xF);
			}
			@Pc(110) int local110;
			@Pc(107) int local107;
			if (local38 == 0 || local38 == 2) {
				local107 = local79.anInt1491;
				local110 = local79.anInt1481;
			} else {
				local110 = local79.anInt1491;
				local107 = local79.anInt1481;
			}
			Static52.method1188(local110, local82, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], arg0, 0, true, 0, local107, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], arg2, 2);
		} else {
			Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], arg0, local42 + 1, true, local38, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], arg2, 2);
		}
		Static100.anInt2546 = Static93.anInt2360;
		Static76.anInt2064 = 2;
		Static14.anInt680 = Static1.anInt13;
		Static29.anInt1086 = 0;
		return true;
	}
}
