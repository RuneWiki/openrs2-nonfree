import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!v;")
	public static Class1_Sub2_Sub3_Sub4_Sub2 aClass1_Sub2_Sub3_Sub4_Sub2_1;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[Lclient!ke;")
	public static Class1_Sub11[] aClass1_Sub11Array1;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!ee;")
	public static Class1_Sub5_Sub1 aClass1_Sub5_Sub1_3 = new Class1_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_869 = Static78.method1313(" x ");

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_870 = Static78.method1313(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!fc;")
	private static Class25 aClass25_873 = Static78.method1313("Enter name of player to delete from list");

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_871 = aClass25_873;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_872 = Static78.method1313("compass");

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public static int anInt1812 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method1381() {
		if (Static15.anInt410 == 104) {
			@Pc(12) int local12;
			if (Static123.anInt2891 == -1) {
				local12 = Static87.anInt1653;
			} else {
				local12 = Static123.anInt2891;
			}
			if (Static123.anInt2891 != Static87.anInt1653) {
				local12--;
				if (local12 < 0) {
					local12 = 19;
				}
				if (Static124.aClass25Array24[local12] != null) {
					Static92.aClass25_984 = Static124.aClass25Array24[local12];
					Static123.anInt2891 = local12;
					Static110.aBoolean113 = true;
				}
			}
		}
		if (Static15.anInt410 != 105 || Static123.anInt2891 == -1) {
			return;
		}
		Static123.anInt2891++;
		if (Static123.anInt2891 >= 20) {
			Static123.anInt2891 = 0;
		}
		if (Static123.anInt2891 == Static87.anInt1653) {
			Static110.aBoolean113 = true;
			Static92.aClass25_984 = Static92.aClass25_985;
			Static123.anInt2891 = -1;
		} else if (Static124.aClass25Array24[Static123.anInt2891] != null) {
			Static92.aClass25_984 = Static124.aClass25Array24[Static123.anInt2891];
			Static110.aBoolean113 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1383() {
		aClass1_Sub5_Sub1_3 = null;
		aClass25_870 = null;
		aClass1_Sub11Array1 = null;
		aClass25_873 = null;
		aClass25_871 = null;
		aClass25_869 = null;
		aClass1_Sub2_Sub3_Sub4_Sub2_1 = null;
		aClass25_872 = null;
	}
}
