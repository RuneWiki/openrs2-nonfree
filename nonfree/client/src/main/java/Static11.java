import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
	public static int anInt321;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
	public static int anInt323;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!he;")
	public static Class11 aClass11_11;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!va;")
	private static Class61 aClass61_83 = Static88.method1421("No reply from loginserver)3");

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
	public static int anInt315 = 256;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "[[[Lclient!bb;")
	public static Class9[][][] aClass9ArrayArrayArray1 = new Class9[4][104][104];

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
	public static int anInt319 = 0;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "[Lclient!tc;")
	public static Class10_Sub10[] aClass10_Sub10Array1 = new Class10_Sub10[2048];

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "Lclient!va;")
	public static Class61 aClass61_84 = Static88.method1421("mapmarker");

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "Lclient!va;")
	public static Class61 aClass61_85 = aClass61_83;

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "Lclient!va;")
	public static Class61 aClass61_86 = Static88.method1421("::noclip");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
	public static void method248() {
		if (Static107.aClass17_5 == null) {
			return;
		}
		@Pc(8) long local8 = System.currentTimeMillis();
		if (local8 <= Static8.aLong11) {
			return;
		}
		Static107.aClass17_5.method1433(local8);
		@Pc(26) int local26 = (int) (local8 - Static8.aLong11);
		Static8.aLong11 = local8;
		@Pc(37) Class local37 = eb.class;
		synchronized (eb.class) {
			Static104.anInt2624 += Static29.anInt894 * local26;
			@Pc(54) int local54 = (Static104.anInt2624 - Static29.anInt894 * 2000) / 1000;
			if (local54 > 0) {
				if (Static9.aClass10_Sub5_1 != null) {
					Static9.aClass10_Sub5_1.method881(local54);
				}
				Static104.anInt2624 -= local54 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)V")
	public static void method249() {
		aClass61_86 = null;
		aClass61_83 = null;
		aClass10_Sub1_Sub1_Sub2_3 = null;
		anIntArrayArray5 = null;
		aClass11_11 = null;
		aClass61_85 = null;
		aClass61_84 = null;
		aClass10_Sub10Array1 = null;
		aClass9ArrayArrayArray1 = null;
	}
}
