import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!fd;")
	public static Class24 aClass24_13;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!je;")
	private static Class40 aClass40_658 = Static69.method1231("Please reload this page)3");

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_657 = aClass40_658;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "J")
	public static long aLong36 = 0L;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_659 = Static69.method1231(" )2>");

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	public static int anInt1322 = 0;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "[I")
	public static int[] anIntArray138 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
	public static int method888(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method889() {
		aClass40_658 = null;
		aClass40_659 = null;
		aBooleanArray12 = null;
		aClass24_13 = null;
		aClass2_Sub1_Sub2_Sub4_2 = null;
		aClass2_Sub1_Sub2_Sub4Array8 = null;
		aClass40_657 = null;
		anIntArray138 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIII)I")
	public static int method890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg0 & 0x3;
		if (local14 == 0) {
			return arg2;
		} else if (local14 == 1) {
			return 7 - arg1;
		} else if (local14 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZILclient!id;)V")
	public static void method891(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		@Pc(13) int local13 = arg1.anInt1313;
		@Pc(17) int local17 = (int) arg1.aLong100;
		arg1.method2209();
		if (arg0) {
			Static87.method898(local13);
		}
		Static97.method1769(local13);
		@Pc(32) Class2_Sub13 local32 = Static55.method972(local17);
		if (local32 != null) {
			Static17.method316(local32);
		}
		Static57.anInt1500 = 0;
		Static8.aBoolean21 = false;
		Static94.method1736(Static2.anInt89, Static47.anInt1288, Static47.anInt1277, Static102.anInt2481);
		if (Static92.anInt2332 != -1) {
			Static74.method627(1, Static92.anInt2332);
		}
	}
}
