import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	public static int anInt243;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_97 = Static187.method3089("green:");

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_95 = aClass92_97;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
	public static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
	public static final int[] anIntArray21 = new int[1000];

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Lclient!vd;")
	public static Class92 aClass92_96 = aClass92_97;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!ab;)V")
	public static void method189(@OriginalArg(1) Class3 arg0) {
		Static106.aClass3_19 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
	public static boolean method190(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
	public static void method191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static131.anInt2743 < 100) {
			Static200.method3301();
		}
		Static46.method3170(arg1, arg0, arg2 + arg1, arg0 + arg3);
		Static174.method2841();
		Static46.method3173(arg1, arg0, arg2, arg3, 0);
		@Pc(37) int local37;
		@Pc(47) int local47;
		if (Static131.anInt2743 < 100) {
			local37 = arg1 + arg2 / 2;
			local47 = arg3 / 2 + arg0 - 20 - 18;
			Static46.method3175(local37 - 152, local47, 304, 34, 9179409);
			Static46.method3175(local37 - 151, local47 + 1, 302, 32, 0);
			Static46.method3173(local37 - 150, local47 + 2, Static131.anInt2743 * 3, 30, 9179409);
			Static46.method3173(local37 + Static131.anInt2743 * 3 - 150, local47 + 2, 300 - Static131.anInt2743 * 3, 30, 0);
			Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2451(Static14.aClass92_132, local37, local47 + 20, 16777215, -1);
			return;
		}
		Static133.anInt2751 = (int) ((double) (arg2 * 2) / Static203.aDouble11);
		Static82.anInt1824 = Static155.anInt2984 - (int) ((double) arg2 / Static203.aDouble11);
		Static40.anInt3558 = (int) ((double) (arg3 * 2) / Static203.aDouble11);
		Static193.anInt3063 = Static111.anInt2402 - (int) ((double) arg3 / Static203.aDouble11);
		@Pc(148) int local148 = Static155.anInt2984 - (int) ((double) arg2 / Static203.aDouble11);
		local37 = Static111.anInt2402 - (int) ((double) arg3 / Static203.aDouble11);
		local47 = (int) ((double) arg2 / Static203.aDouble11) + Static155.anInt2984;
		@Pc(174) int local174 = Static111.anInt2402 + (int) ((double) arg3 / Static203.aDouble11);
		Static4.method94(arg0, arg1, local37, arg0 + arg3, local148, local47, arg1 + arg2, local174);
		Static138.method2067(arg0 + arg3, arg0, arg1, arg2 + arg1, local174, local37, local47, local148);
		if (Static27.anInt616 > 0) {
			Static27.anInt616--;
		}
		if (!Static184.aBoolean225) {
			return;
		}
		@Pc(225) int local225 = arg1 + arg2 - 5;
		@Pc(231) int local231 = arg0 + arg3 - 8;
		Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2444(Static208.method787(new Class92[] { Static207.aClass92_2043, Static49.method872(Static43.anInt1136) }), local225, local231, 16776960, -1);
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(263) int local263 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(264) int local264 = local231 - 15;
		@Pc(266) int local266 = 16776960;
		if (local263 > 32768 && Static111.aBoolean141) {
			local266 = 16711680;
		}
		if (local263 > 65536 && !Static111.aBoolean141) {
			local266 = 16711680;
		}
		Static82.aClass1_Sub3_Sub1_Sub3_Sub1_2.method2444(Static208.method787(new Class92[] { Static207.aClass92_2044, Static49.method872(local263), Static183.aClass92_1861 }), local225, local264, local266, -1);
		local231 = local264 - 15;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5 method192() {
		@Pc(7) Class1_Sub3_Sub1_Sub5 local7 = new Class1_Sub3_Sub1_Sub5();
		local7.anInt4204 = Static164.anIntArray302[0];
		local7.aByteArray50 = Static143.aByteArrayArray6[0];
		local7.anInt4207 = Static197.anInt4330;
		local7.anIntArray335 = Static209.anIntArray365;
		local7.anInt4206 = Static92.anInt1967;
		local7.anInt4203 = Static193.anIntArray276[0];
		local7.anInt4208 = Static76.anIntArray133[0];
		local7.anInt4205 = Static154.anIntArray285[0];
		Static145.method2153();
		return local7;
	}
}
