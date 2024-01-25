import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static int anInt4930;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_14 = new Class171(4);

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_10 = new Class171(1);

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_7 = new Class171(1);

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_8 = new Class171(2);

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_9 = new Class171(4);

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_11 = new Class171(2);

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_12 = new Class171(4);

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!lc;")
	public static final Class171 aClass171_13 = new Class171(2);

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
	public static final int[] anIntArray443 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZIIIIFI)[I")
	public static int[] method4295(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub7_Sub38 local10 = new Class2_Sub7_Sub38();
		local10.anInt9046 = 8;
		local10.anInt9052 = 35;
		local10.anInt9059 = 8;
		local10.anInt9047 = (int) (arg0 * 4096.0F);
		local10.anInt9053 = 4;
		local10.aBoolean648 = true;
		local10.method7583();
		Static433.method5293(1, 2048);
		local10.method7570(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method4297() {
		Static336.method5335(Static281.aClass2_Sub19_Sub1_1.aBoolean195);
		Static217.aClass2_Sub12_Sub1_1 = new Class2_Sub12_Sub1();
		Static217.aClass2_Sub12_Sub1_1.method1023();
		Static281.aClass104_1 = Static501.method7373(Static531.aClass283_6, 0, Static517.aCanvas14, 22050);
		Static281.aClass104_1.method7813(Static217.aClass2_Sub12_Sub1_1);
		Static422.method6559(Static391.aClass53_113, Static442.aClass53_122, Static217.aClass2_Sub12_Sub1_1, Static383.aClass53_109);
		Static465.aClass104_2 = Static501.method7373(Static531.aClass283_6, 1, Static517.aCanvas14, 2048);
		Static288.aClass2_Sub12_Sub2_5 = new Class2_Sub12_Sub2();
		Static465.aClass104_2.method7813(Static288.aClass2_Sub12_Sub2_5);
		Static460.aClass250_41 = new Class250(22050, Static302.anInt5530);
		Static292.anInt5375 = Static463.aClass53_134.method1608("scape main");
	}
}
