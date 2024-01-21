import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "Lclient!bi;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "Lclient!wa;")
	public static Class23 aClass23_5;

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
	public static int anInt207;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_98 = Static161.method2452("logo");

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
	public static int anInt201 = -1;

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_99 = Static161.method2452("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_3 = new Class84(4);

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array1 = new Class20[1000];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!mf;)Lclient!mf;")
	public static Class69 method191(@OriginalArg(1) Class69 arg0) {
		@Pc(11) int local11 = Static189.method2826(Static94.method1538(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			arg0 = Static157.method2392(arg0.anInt2498);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
	public static void method192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) Class5_Sub17 local20 = (Class5_Sub17) Static38.aClass75_5.method2072((long) arg3);
		if (local20 == null) {
			local20 = new Class5_Sub17();
			Static38.aClass75_5.method2069(local20, (long) arg3);
		}
		if (arg0 >= local20.anIntArray233.length) {
			@Pc(46) int[] local46 = new int[arg0 + 1];
			@Pc(51) int[] local51 = new int[arg0 + 1];
			for (@Pc(53) int local53 = 0; local53 < local20.anIntArray233.length; local53++) {
				local46[local53] = local20.anIntArray233[local53];
				local51[local53] = local20.anIntArray231[local53];
			}
			for (@Pc(83) int local83 = local20.anIntArray233.length; local83 < arg0; local83++) {
				local46[local83] = -1;
				local51[local83] = 0;
			}
			local20.anIntArray233 = local46;
			local20.anIntArray231 = local51;
		}
		local20.anIntArray233[arg0] = arg2;
		local20.anIntArray231[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
	public static void method193() {
		@Pc(4) int[] local4 = new int[Static60.anInt1347];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static60.anInt1347; local12++) {
			@Pc(18) Class5_Sub2_Sub11 local18 = Static196.method2908(local12);
			if (local18.anInt2340 >= 0 || local18.anInt2345 >= 0) {
				local4[local10++] = local12;
			}
		}
		Static207.anIntArray423 = new int[local10];
		for (@Pc(49) int local49 = 0; local49 < local10; local49++) {
			Static207.anIntArray423[local49] = local4[local49];
		}
	}
}
