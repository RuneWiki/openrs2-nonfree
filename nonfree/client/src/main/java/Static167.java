import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "Lclient!mb;")
	public static Class70 aClass70_35;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1277 = Static64.method1101("mapscene");

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
	public static int anInt3761 = 0;

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1278 = Static64.method1101("(U5");

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1279 = Static64.method1101(")3)3)3");

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1280 = Static64.method1101("http:)4)4");

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "Lclient!w;")
	public static Class123 aClass123_10 = new Class123(64);

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "Lclient!wi;")
	public static Class1_Sub16_Sub1 aClass1_Sub16_Sub1_2 = new Class1_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)I")
	public static int method2863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg1 + arg0 * 57;
		@Pc(11) int local11 = local5 ^ local5 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local11 * local11 * 15731 + 789221) * local11 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	public static void method2864(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub10 local14 = Static110.method1051(2, arg0);
		local14.method1524();
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Lclient!ia;")
	public static Class51 method2865() {
		@Pc(10) Class51 local10 = Static229.aClass51_1659;
		if (Static147.anInt3191 != 0) {
			local10 = Static125.aClass51_1244;
		}
		return Static150.method2574(new Class51[] { aClass51_1280, local10, Static1.aClass51_36, Static27.method511(Static179.anInt3919), Static116.aClass51_396, Static27.method511(Static14.anInt340), Static209.aClass51_1537 });
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BB)I")
	public static int method2866(@OriginalArg(0) byte arg0) {
		if (arg0 >= 65 && arg0 <= 90) {
			return arg0 - 65;
		} else if (arg0 >= 97 && arg0 <= 122) {
			return arg0 - 71;
		} else if (arg0 >= 48 && arg0 <= 57) {
			return arg0 + 52 - 48;
		} else if (arg0 == 43) {
			return 62;
		} else if (arg0 == 42) {
			return 62;
		} else if (arg0 == 47) {
			return 63;
		} else if (arg0 == 45) {
			return 63;
		} else {
			return -1;
		}
	}
}
