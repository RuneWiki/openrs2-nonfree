import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Z")
	public static boolean aBoolean145;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_54 = new Class237(35, 4);

	@OriginalMember(owner = "client!os", name = "q", descriptor = "I")
	public static int anInt2704 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I")
	public static int method2396(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(18) int local18 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IFIIIIIZ)[I")
	public static int[] method2397(@OriginalArg(1) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class1_Sub3_Sub15 local15 = new Class1_Sub3_Sub15();
		local15.anInt2454 = 4;
		local15.anInt2450 = 8;
		local15.anInt2449 = (int) (arg0 * 4096.0F);
		local15.anInt2451 = 8;
		local15.aBoolean132 = true;
		local15.anInt2447 = 35;
		local15.method6074();
		Static214.method3259(1, 2048);
		local15.method2163(0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public static void method2398() {
		Static55.method989(Static177.aClass131_142);
		Static232.aClass1_Sub1_Sub1_2.method4115(Static131.method5612());
		Static232.aClass1_Sub1_Sub1_2.method4101(Static207.anInt3842);
		Static232.aClass1_Sub1_Sub1_2.method4101(Static255.anInt4574);
		Static232.aClass1_Sub1_Sub1_2.method4115(Static389.aClass128_Sub1_1.anInt3576);
	}
}
