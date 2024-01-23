import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!mh", name = "nb", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1005 = Static64.method1101("Oct");

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1006 = Static64.method1101("Sep");

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
	public static int anInt2893 = 1;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1007 = Static64.method1101("May");

	@OriginalMember(owner = "client!mh", name = "fb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1008 = Static64.method1101("Jan");

	@OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1009 = Static64.method1101("Nov");

	@OriginalMember(owner = "client!mh", name = "jb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1010 = Static64.method1101("Mar");

	@OriginalMember(owner = "client!mh", name = "ob", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1011 = Static64.method1101("Dec");

	@OriginalMember(owner = "client!mh", name = "qb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1012 = Static64.method1101("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!mh", name = "rb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1013 = Static64.method1101("Feb");

	@OriginalMember(owner = "client!mh", name = "Bb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1017 = Static64.method1101("shake:");

	@OriginalMember(owner = "client!mh", name = "sb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1014 = aClass51_1017;

	@OriginalMember(owner = "client!mh", name = "ub", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1015 = Static64.method1101("Aug");

	@OriginalMember(owner = "client!mh", name = "vb", descriptor = "I")
	public static int anInt2903 = 0;

	@OriginalMember(owner = "client!mh", name = "xb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1016 = Static64.method1101("Jul");

	@OriginalMember(owner = "client!mh", name = "Cb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1018 = Static64.method1101("Apr");

	@OriginalMember(owner = "client!mh", name = "Ib", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1019 = Static64.method1101("Jun");

	@OriginalMember(owner = "client!mh", name = "Eb", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array20 = new Class51[] { aClass51_1008, aClass51_1013, aClass51_1010, aClass51_1018, aClass51_1007, aClass51_1019, aClass51_1016, aClass51_1015, aClass51_1006, aClass51_1005, aClass51_1009, aClass51_1011 };

	@OriginalMember(owner = "client!mh", name = "Gb", descriptor = "[I")
	public static int[] anIntArray189 = new int[50];

	@OriginalMember(owner = "client!mh", name = "Jb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1020 = aClass51_1017;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!mb;B)V")
	public static void method2240(@OriginalArg(0) Class70 arg0) {
		Static123.anInt2716 = arg0.method3523(Static93.aClass51_671);
		Static32.anInt706 = arg0.method3523(Static56.aClass51_1231);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BIIIIIII)V")
	public static void method2243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = 2048 - arg3 & 0x7FF;
		@Pc(20) int local20 = 0;
		@Pc(26) int local26 = 2048 - arg2 & 0x7FF;
		@Pc(28) int local28 = arg5;
		@Pc(30) int local30 = 0;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (local18 != 0) {
			local39 = Class94.anIntArray278[local18];
			local43 = Class94.anIntArray277[local18];
			local20 = -arg5 * local39 >> 16;
			local28 = local43 * arg5 >> 16;
		}
		if (local26 != 0) {
			local39 = Class94.anIntArray278[local26];
			local30 = local28 * local39 >> 16;
			local43 = Class94.anIntArray277[local26];
			local28 = local28 * local43 >> 16;
		}
		Static207.anInt4426 = arg2;
		Static191.anInt4119 = arg1 - local20;
		Static228.anInt4792 = arg3;
		Static122.anInt2706 = arg0 - local30;
		Static118.anInt2544 = arg4 - local28;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)V")
	public static void method2244(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub10 local6 = (Class1_Sub10) Static23.aClass102_3.method3093((long) arg0);
		if (local6 != null) {
			local6.method3758();
		}
	}
}
