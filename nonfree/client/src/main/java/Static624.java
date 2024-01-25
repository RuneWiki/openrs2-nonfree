import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "Lclient!ufa;")
	public static Class4 aClass4_33;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
	public static int anInt10500;

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
	public static int anInt10503;

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_111 = new Class185(69, 2);

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_186 = new Class73(9, -1);

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "[Lclient!gaa;")
	public static final Class113[] aClass113Array2 = new Class113[14];

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
	public static int anInt10504 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)I")
	public static int method8536(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local37 + (local37 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IBIII)V")
	public static void method8537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static309.anInt6227 <= arg0 && arg0 <= Static7.anInt464) {
			@Pc(23) int local23 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg1);
			@Pc(29) int local29 = Static465.method6957(Static389.anInt7300, Static633.anInt10644, arg2);
			Static126.method2626(arg0, arg3, local23, local29);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public static void method8538() {
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub3_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub3_2);
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub15_1);
		Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub15_2);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub11_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub25_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub24_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub13_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub26_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub20_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub7_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub10_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub28_1);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub14_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub23_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub23_2);
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub6_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub17_1);
		Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub5_1);
		Static19.method602();
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub16_1);
		Static87.aClass6_Sub33_6.method4996(3, Static87.aClass6_Sub33_6.aClass14_Sub12_1);
		Static174.method3297();
		Static638.method8737();
		Static68.aBoolean183 = true;
	}
}
