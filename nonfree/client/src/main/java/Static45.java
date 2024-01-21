import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "Lclient!tf;")
	public static Class73 aClass73_16;

	@OriginalMember(owner = "client!ha", name = "ab", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_26;

	@OriginalMember(owner = "client!ha", name = "jb", descriptor = "Lclient!jf;")
	public static Class1_Sub13 aClass1_Sub13_10;

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "Lclient!id;")
	public static Class34 aClass34_1398 = Static9.method266("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "Lclient!jd;")
	public static Class38 aClass38_22 = new Class38();

	@OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
	public static int anInt2762 = 0;

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
	public static int anInt2764 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "Lclient!id;")
	private static Class34 aClass34_1399 = Static9.method266(" from your ignore list first");

	@OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
	public static int anInt2766 = 0;

	@OriginalMember(owner = "client!ha", name = "ib", descriptor = "Lclient!id;")
	private static Class34 aClass34_1402 = Static9.method266("Your account is already logged in)3");

	@OriginalMember(owner = "client!ha", name = "gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1400 = aClass34_1402;

	@OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1401 = aClass34_1399;

	@OriginalMember(owner = "client!ha", name = "kb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1403 = Static9.method266("au");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public static void method1844() {
		aClass1_Sub1_Sub2_Sub2_14 = null;
		aClass34_1403 = null;
		aClass34_1402 = null;
		aClass1_Sub13_10 = null;
		aClass34_1399 = null;
		aClass38_22 = null;
		aClass34_1400 = null;
		aClass73_16 = null;
		aClass34_1398 = null;
		aClass34_1401 = null;
		aClass35_Sub1_26 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIB)I")
	public static int method1845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(40) int local40 = arg1 & 0x7F;
		@Pc(44) int local44 = arg2 & 0x7F;
		@Pc(46) int local46 = arg0;
		if (arg0 < 3 && (Static105.aByteArrayArrayArray9[1][local7][local11] & 0x2) == 2) {
			local46 = arg0 + 1;
		}
		@Pc(97) int local97 = Static98.anIntArrayArrayArray4[local46][local7][local11 + 1] * (128 - local44) + local44 * Static98.anIntArrayArrayArray4[local46][local7 + 1][local11 + 1] >> 7;
		@Pc(124) int local124 = Static98.anIntArrayArrayArray4[local46][local7][local11] * (128 - local44) + local44 * Static98.anIntArrayArrayArray4[local46][local7 + 1][local11] >> 7;
		return local97 * local40 + (128 - local40) * local124 >> 7;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method1846() {
		Static57.aClass63_10.method1665();
		Static5.aClass63_2.method1665();
	}
}
