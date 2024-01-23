import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	public static int anInt3008;

	@OriginalMember(owner = "client!eg", name = "eb", descriptor = "Lclient!uc;")
	public static Class1_Sub2_Sub15_Sub1 aClass1_Sub2_Sub15_Sub1_3;

	@OriginalMember(owner = "client!eg", name = "Eb", descriptor = "Lclient!ma;")
	public static Class77 aClass77_3;

	@OriginalMember(owner = "client!eg", name = "Mb", descriptor = "I")
	public static int anInt3049;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "Lclient!sc;")
	private static Class107 aClass107_823 = Static231.method3737(" has logged in)3");

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "Lclient!sc;")
	public static Class107 aClass107_824 = Static231.method3737(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "Lclient!sc;")
	public static Class107 aClass107_825 = aClass107_823;

	@OriginalMember(owner = "client!eg", name = "mb", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!eg", name = "Gb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_827 = Static231.method3737(":assist:");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Z")
	public static boolean method2304(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)V")
	public static void method2307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class46 local13 = local7.aClass46_1;
		if (local13 != null) {
			local13.anInt1692 = local13.anInt1692 * arg3 / 16;
			local13.anInt1697 = local13.anInt1697 * arg3 / 16;
		}
	}
}
