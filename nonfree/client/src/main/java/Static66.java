import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Lclient!jf;")
	public static Class2_Sub4_Sub1 aClass2_Sub4_Sub1_2 = new Class2_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_673 = Static119.method1462(")3");

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	public static int anInt1586 = 0;

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lclient!pe;")
	private static Class65 aClass65_677 = Static119.method1462("Login server offline)3");

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "Lclient!pe;")
	public static Class65 aClass65_674 = aClass65_677;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!pe;")
	public static Class65 aClass65_675 = Static119.method1462("<img=0>");

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_676 = Static119.method1462("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)I")
	public static int method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)Z")
	public static boolean method1208(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method1209() {
		aClass65_673 = null;
		aClass65_676 = null;
		aByteArrayArrayArray2 = null;
		aClass65_674 = null;
		aClass65_675 = null;
		aClass65_677 = null;
		aClass2_Sub4_Sub1_2 = null;
	}
}
