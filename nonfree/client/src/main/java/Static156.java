import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!t", name = "cb", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_15;

	@OriginalMember(owner = "client!t", name = "V", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1378 = Static49.method1293("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1379 = Static49.method1293("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1380 = Static49.method1293("blinken1:");

	@OriginalMember(owner = "client!t", name = "fb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1381 = Static49.method1293(": ");

	@OriginalMember(owner = "client!t", name = "hb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1382 = Static49.method1293("New User");

	@OriginalMember(owner = "client!t", name = "jb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1383 = Static49.method1293("leuchten2:");

	@OriginalMember(owner = "client!t", name = "kb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1384 = aClass70_1382;

	@OriginalMember(owner = "client!t", name = "nb", descriptor = "Lclient!og;")
	public static Class62 aClass62_1 = new Class62();

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)V")
	public static void method3140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static174.anInt4470 == 0 || arg2 == 0 || Static88.anInt2601 >= 50 || arg0 == -1) {
			return;
		}
		Static15.anIntArray30[Static88.anInt2601] = arg0;
		Static30.anIntArray98[Static88.anInt2601] = arg2;
		Static166.anIntArray411[Static88.anInt2601] = arg1;
		Static12.aClass47Array1[Static88.anInt2601] = null;
		Static179.anIntArray426[Static88.anInt2601] = 0;
		Static88.anInt2601++;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIILclient!g;)V")
	public static void method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub7 arg4) {
		@Pc(7) Class1_Sub10 local7 = new Class1_Sub10();
		local7.anInt1862 = arg4.anInt1808;
		local7.anIntArray189 = arg4.anIntArray185;
		local7.anInt1872 = arg1;
		local7.anInt1856 = arg3 * 128;
		local7.anInt1864 = arg4.anInt1845;
		local7.anInt1860 = arg2 * 128;
		local7.anInt1863 = arg4.anInt1841;
		@Pc(39) int local39 = arg4.anInt1813;
		local7.anInt1867 = arg4.anInt1838 * 128;
		@Pc(48) int local48 = arg4.anInt1818;
		if (arg0 == 1 || arg0 == 3) {
			local48 = arg4.anInt1813;
			local39 = arg4.anInt1818;
		}
		local7.anInt1858 = (arg2 + local48) * 128;
		local7.anInt1871 = (local39 + arg3) * 128;
		if (arg4.anIntArray186 != null) {
			local7.aClass1_Sub1_Sub7_1 = arg4;
			local7.method1421();
		}
		Static130.aClass4_13.method179(local7);
		if (local7.anIntArray189 != null) {
			local7.anInt1868 = local7.anInt1863 + (int) ((double) (local7.anInt1862 - local7.anInt1863) * Math.random());
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(IIII)I")
	public static int method3142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = arg0 & 0x7F;
		@Pc(41) int local41 = arg2 & 0x7F;
		if (arg1 < 3 && (Static20.aByteArrayArrayArray1[1][local11][local7] & 0x2) == 2) {
			local33 = arg1 + 1;
		}
		@Pc(85) int local85 = (128 - local37) * Static142.anIntArrayArrayArray8[local33][local11][local7] + Static142.anIntArrayArrayArray8[local33][local11 + 1][local7] * local37 >> 7;
		@Pc(116) int local116 = Static142.anIntArrayArrayArray8[local33][local11][local7 + 1] * (128 - local37) + Static142.anIntArrayArrayArray8[local33][local11 + 1][local7 + 1] * local37 >> 7;
		return local116 * local41 + local85 * (128 - local41) >> 7;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(Z)V")
	public static void method3143() {
		aClass70_1380 = null;
		aClass70_1381 = null;
		aClass62_1 = null;
		aClass70_1384 = null;
		aClass76_Sub1_15 = null;
		aClass70_1383 = null;
		aClass70_1379 = null;
		aClass70_1382 = null;
		aClass70_1378 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public static void method3144() {
		for (@Pc(1) int local1 = 0; local1 < Static139.anInt3674; local1++) {
			@Pc(6) Class53 local6 = Static20.aClass53Array1[local1];
			Static150.method3044(local6);
			Static20.aClass53Array1[local1] = null;
		}
		Static139.anInt3674 = 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Z")
	public static boolean method3145(@OriginalArg(0) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
