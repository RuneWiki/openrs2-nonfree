import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!f", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "I")
	public static int anInt1056;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "Lclient!bc;")
	public static Class1 aClass1_11;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "I")
	public static int anInt1057 = -1;

	@OriginalMember(owner = "client!f", name = "V", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_396 = Static120.method1824("Hier wechseln");

	@OriginalMember(owner = "client!f", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_397 = Static120.method1824("mod_icons");

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
	public static int anInt1063 = 1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB[II)V")
	public static void method726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(4) int local4 = arg3 - 1;
		@Pc(7) int local7 = local4 - 7;
		while (arg0 < local7) {
			@Pc(15) int local15 = arg0 + 1;
			arg2[local15] = arg1;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg1;
			arg0 = local45 + 1;
			arg2[arg0] = arg1;
		}
		while (local4 > arg0) {
			arg0++;
			arg2[arg0] = arg1;
		}
	}
}
