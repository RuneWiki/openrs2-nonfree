import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
	public static int anInt2044;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_10;

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "[I")
	public static int[] anIntArray343 = new int[25];

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "Lclient!sg;")
	public static Class77 aClass77_816 = Static146.method2172("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "[I")
	public static int[] anIntArray344 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Z")
	public static final boolean aBoolean91 = false;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "Lclient!sg;")
	private static Class77 aClass77_817 = Static146.method2172("This computers address has been blocked");

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "Lclient!sg;")
	public static Class77 aClass77_818 = aClass77_817;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
	public static boolean method1458(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public static void method1459() {
		aClass77_817 = null;
		anIntArray343 = null;
		aClass43_Sub1_10 = null;
		aClass77_816 = null;
		aClass77_818 = null;
		anIntArray344 = null;
		anIntArray345 = null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	public static void method1460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static84.anInt3146 != 0 && Static84.anInt3146 != 3 || Static50.anInt1384 != 1) {
			return;
		}
		@Pc(19) int local19 = Static38.anInt1113 - arg0 - 5;
		@Pc(25) int local25 = Static156.anInt3884 - arg1 - 25;
		if (local25 < 0 || local19 < 0 || local25 >= 146 || local19 >= 151) {
			return;
		}
		local25 -= 73;
		local19 -= 75;
		@Pc(52) int local52 = Static28.anInt832 + Static160.anInt4572 & 0x7FF;
		@Pc(56) int local56 = Class2_Sub2_Sub3_Sub1.anIntArray52[local52];
		@Pc(64) int local64 = (Static130.anInt3166 + 256) * local56 >> 8;
		@Pc(68) int local68 = Class2_Sub2_Sub3_Sub1.anIntArray50[local52];
		@Pc(76) int local76 = local68 * (Static130.anInt3166 + 256) >> 8;
		@Pc(87) int local87 = local19 * local64 - local76 * local25 >> 11;
		@Pc(95) int local95 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 - local87 >> 7;
		@Pc(105) int local105 = local25 * local64 + local19 * local76 >> 11;
		@Pc(113) int local113 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 + local105 >> 7;
		@Pc(133) boolean local133 = Static142.method2411(true, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local113, 1, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local95, 0);
		if (!local133) {
			return;
		}
		Static124.aClass2_Sub18_Sub1_3.method2389(local25);
		Static124.aClass2_Sub18_Sub1_3.method2389(local19);
		Static124.aClass2_Sub18_Sub1_3.method2369(Static28.anInt832);
		Static124.aClass2_Sub18_Sub1_3.method2389(57);
		Static124.aClass2_Sub18_Sub1_3.method2389(Static160.anInt4572);
		Static124.aClass2_Sub18_Sub1_3.method2389(Static130.anInt3166);
		Static124.aClass2_Sub18_Sub1_3.method2389(89);
		Static124.aClass2_Sub18_Sub1_3.method2369(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400);
		Static124.aClass2_Sub18_Sub1_3.method2369(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385);
		Static124.aClass2_Sub18_Sub1_3.method2389(Static110.anInt3442);
		Static124.aClass2_Sub18_Sub1_3.method2389(63);
	}
}
