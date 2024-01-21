import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_1;

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_105 = Static56.method816("<img=1>");

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "Lclient!ic;")
	public static Class34 aClass34_106 = Static56.method816("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
	public static int anInt174 = 0;

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "J")
	public static long aLong8 = 0L;

	@OriginalMember(owner = "client!b", name = "ub", descriptor = "Lclient!ic;")
	public static Class34 aClass34_107 = Static56.method816(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!b", name = "zb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_109 = Static56.method816("Select a world");

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_108 = aClass34_109;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(B)V")
	public static void method92() {
		aClass14_Sub1_1 = null;
		aClass34_106 = null;
		aClass34_105 = null;
		aClass34_108 = null;
		anIntArrayArray1 = null;
		aClass34_109 = null;
		aClass34_107 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZI)V")
	public static void method93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static53.anInt1363 == 0 || arg0 == 0 || Static64.anInt2023 >= 50) {
			return;
		}
		Static68.anIntArray207[Static64.anInt2023] = arg1;
		Static58.anIntArray191[Static64.anInt2023] = arg0;
		Static36.anIntArray126[Static64.anInt2023] = arg2;
		Static4.aClass57Array1[Static64.anInt2023] = null;
		Static20.anIntArray67[Static64.anInt2023] = 0;
		Static64.anInt2023++;
	}
}
