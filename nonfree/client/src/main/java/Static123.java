import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!c;")
	public static Class10 aClass10_31;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_1097 = Static41.method597("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_1092 = aClass60_1097;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public static final int anInt2794 = 50;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
	public static int[] anIntArray339 = new int[50];

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_1093 = Static41.method597("");

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!od;")
	private static Class60 aClass60_1094 = Static41.method597("Members only world");

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_1095 = aClass60_1094;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_1096 = Static41.method597("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method1923() {
		Static9.anInt116 = 0;
		Static21.anInt737 = 0;
		Static24.method445();
		Static109.method1802();
		Static68.method1097();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static21.anInt737; local17++) {
			local23 = Static3.anIntArray5[local17];
			if (Static118.anInt2741 != Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23].anInt1394) {
				Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23].aClass4_Sub3_Sub13_1 = null;
				Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local23] = null;
			}
		}
		if (Static96.aClass4_Sub9_Sub1_2.anInt1312 != Static7.anInt79) {
			throw new RuntimeException("gnp1 pos:" + Static96.aClass4_Sub9_Sub1_2.anInt1312 + " psize:" + Static7.anInt79);
		}
		for (local23 = 0; local23 < Static36.anInt1010; local23++) {
			if (Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[Static59.anIntArray173[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static36.anInt1010);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method1924() {
		aClass60_1092 = null;
		aClass60_1094 = null;
		aClass60_1093 = null;
		aClass10_31 = null;
		aClass60_1096 = null;
		anIntArray339 = null;
		aClass60_1095 = null;
		aClass60_1097 = null;
	}
}
