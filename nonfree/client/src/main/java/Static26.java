import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_148 = Static181.method2795("(U1");

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_149 = Static181.method2795("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_150 = Static181.method2795("Created gameworld");

	@OriginalMember(owner = "client!cg", name = "cb", descriptor = "[I")
	public static final int[] anIntArray46 = new int[1000];

	@OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
	public static int anInt662 = 0;

	@OriginalMember(owner = "client!cg", name = "fb", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_1 = new Class91(5);

	@OriginalMember(owner = "client!cg", name = "hb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_151 = aClass83_150;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!eh;II)Lclient!gg;")
	public static Class29_Sub1 method500(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1) {
		return Static66.method1261(0, arg1, arg0) ? Static212.method3224() : null;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
	public static void method502() {
		Static89.anInt4289 = 0;
		Static177.anInt3619 = 0;
		Static166.method2579();
		Static64.method1212();
		Static30.method647();
		Static205.method3107();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static89.anInt4289; local19++) {
			local25 = anIntArray46[local19];
			if (Static13.anInt386 != Static22.aClass24_Sub4_Sub1Array1[local25].anInt3309) {
				Static22.aClass24_Sub4_Sub1Array1[local25] = null;
			}
		}
		if (Static33.aClass2_Sub3_Sub1_1.anInt340 != Static131.anInt2843) {
			throw new RuntimeException("gpp1 pos:" + Static33.aClass2_Sub3_Sub1_1.anInt340 + " psize:" + Static131.anInt2843);
		}
		for (local25 = 0; local25 < Static21.anInt572; local25++) {
			if (Static22.aClass24_Sub4_Sub1Array1[Static10.anIntArray18[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static21.anInt572);
			}
		}
	}
}
