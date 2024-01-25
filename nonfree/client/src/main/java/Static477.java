import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
	public static int anInt7971;

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "Lclient!au;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
	public static final int anInt7963 = 1403;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_120 = new Class306("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
	public static int anInt7966 = 0;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public static void method6612() {
		Static487.aClass122_8.M(((float) Static544.aClass1_Sub22_Sub1_1.anInt5447 * 0.1F + 0.7F) * 1.1523438F);
		Static487.aClass122_8.m(Static532.anInt8955, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static487.aClass122_8.E(Static467.anInt7881, -1, 0);
		Static487.aClass122_8.method7230(Static181.aClass45_3);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ge;Z)V")
	public static void method6613(@OriginalArg(0) Class1_Sub6 arg0) {
		@Pc(9) int local9 = arg0.method3936();
		Static297.aClass162Array1 = new Class162[local9];
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static297.aClass162Array1[local19] = new Class162();
			Static297.aClass162Array1[local19].anInt4853 = arg0.method3936();
			Static297.aClass162Array1[local19].aString46 = arg0.method3932();
		}
		Static372.anInt6840 = arg0.method3936();
		Static538.anInt9101 = arg0.method3936();
		Static491.anInt8153 = arg0.method3936();
		Static320.aClass185_Sub1Array2 = new Class185_Sub1[Static538.anInt9101 + 1 - Static372.anInt6840];
		for (@Pc(67) int local67 = 0; local67 < Static491.anInt8153; local67++) {
			@Pc(73) int local73 = arg0.method3936();
			@Pc(81) Class185_Sub1 local81 = Static320.aClass185_Sub1Array2[local73] = new Class185_Sub1();
			local81.anInt7758 = arg0.method3922();
			local81.anInt7761 = arg0.method3925();
			local81.anInt7769 = Static372.anInt6840 + local73;
			local81.aString71 = arg0.method3932();
			local81.aString72 = arg0.method3932();
		}
		Static253.anInt4947 = arg0.method3925();
		Static387.aBoolean508 = true;
	}
}
