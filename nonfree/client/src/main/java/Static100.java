import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_24;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!m;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] aClass6_Sub3_Sub3_Sub3Array6;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "I")
	public static int anInt2794;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1511 = Static80.method1463("Existing user");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1510 = aClass63_1511;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
	public static int[] anIntArray296 = new int[100];

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	public static int anInt2788 = 0;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!mb;")
	public static Class49 aClass49_26 = new Class49(260);

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1512 = Static80.method1463(" loggt sich ein)3");

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1514 = Static80.method1463("Off");

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1513 = aClass63_1514;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1838() {
		aClass6_Sub3_Sub3_Sub3Array6 = null;
		aClass63_1512 = null;
		aClass63_1510 = null;
		aClass6_Sub3_Sub3_Sub3_24 = null;
		anIntArray296 = null;
		aClass47_4 = null;
		aClass49_26 = null;
		aClass63_1514 = null;
		aClass63_1513 = null;
		aClass63_1511 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!l;I)V")
	public static void method1839(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 * arg2 + arg0 * arg0;
		if (local12 <= 4225 || local12 >= 90000) {
			Static112.method2066(arg1, arg2, arg0);
			return;
		}
		@Pc(38) int local38 = Static109.anInt3032 + Static84.anInt2420 & 0x7FF;
		@Pc(42) int local42 = Class6_Sub3_Sub3_Sub4.anIntArray343[local38];
		@Pc(50) int local50 = local42 * 256 / (Static11.anInt1914 + 256);
		@Pc(54) int local54 = Class6_Sub3_Sub3_Sub4.anIntArray342[local38];
		@Pc(62) int local62 = local54 * 256 / (Static11.anInt1914 + 256);
		@Pc(73) int local73 = arg0 * local62 - arg2 * local50 >> 16;
		@Pc(83) int local83 = local62 * arg2 + arg0 * local50 >> 16;
		@Pc(89) double local89 = Math.atan2((double) local83, (double) local73);
		@Pc(95) int local95 = (int) (Math.sin(local89) * 63.0D);
		@Pc(101) int local101 = (int) (Math.cos(local89) * 57.0D);
		Static64.aClass6_Sub3_Sub3_Sub2_2.method1259(local95 + 84 + 4, -local101 + 83 + -20, local89);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public static void method1840() {
		Static73.aClass49_20.method1389();
	}
}
