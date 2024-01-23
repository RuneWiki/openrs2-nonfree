import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!ek;")
	public static Class42 aClass42_78;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "Lclient!ek;")
	public static Class42 aClass42_79;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "Lclient!jj;")
	public static Class87 aClass87_6;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean332 = true;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[I")
	public static int[] anIntArray488 = new int[256];

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!lj;")
	public static Class106 aClass106_9 = new Class106(64);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method4028() {
		Static180.anInt3906 = 0;
		Static34.aBoolean52 = false;
		Static302.anInt5847 = 0;
		Static160.aByte21 = 0;
		Static9.anInt3023 = -1;
		Static269.anInt5272 = 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!qn;IIIIILclient!cb;Lclient!th;I)V")
	public static void method4029(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class15_Sub2_Sub1 arg5, @OriginalArg(7) Class15_Sub2_Sub2 arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class2_Sub31 local9 = new Class2_Sub31();
		local9.anInt5920 = arg2 * 128;
		local9.anInt5923 = arg1;
		local9.anInt5918 = arg4 * 128;
		if (arg0 != null) {
			local9.anInt5913 = arg0.anInt4742;
			local9.anInt5922 = arg0.anInt4719 * 128;
			local9.anInt5929 = arg0.anInt4754;
			@Pc(151) int local151 = arg0.anInt4749;
			local9.anInt5917 = arg0.anInt4763;
			local9.anInt5928 = arg0.anInt4748;
			local9.anIntArray576 = arg0.anIntArray466;
			@Pc(166) int local166 = arg0.anInt4721;
			if (arg7 == 1 || arg7 == 3) {
				local166 = arg0.anInt4749;
				local151 = arg0.anInt4721;
			}
			local9.anInt5927 = (local166 + arg2) * 128;
			local9.aClass146_1 = arg0;
			local9.anInt5930 = (arg4 + local151) * 128;
			if (arg0.anIntArray467 != null) {
				local9.aBoolean393 = true;
				local9.method4640();
			}
			if (local9.anIntArray576 != null) {
				local9.anInt5925 = (int) (Math.random() * (double) (local9.anInt5928 - local9.anInt5929)) + local9.anInt5929;
			}
			Static275.aClass44_23.method1358(local9);
		} else if (arg5 != null) {
			local9.aClass15_Sub2_Sub1_1 = arg5;
			@Pc(34) Class188 local34 = arg5.aClass188_1;
			if (local34.anIntArray572 != null) {
				local9.aBoolean393 = true;
				local34 = local34.method4618();
			}
			if (local34 != null) {
				local9.anInt5927 = (local34.anInt5867 + arg2) * 128;
				local9.anInt5930 = (local34.anInt5867 + arg4) * 128;
				local9.anInt5913 = Static35.method822(arg5);
				local9.anInt5917 = local34.anInt5889;
				local9.anInt5922 = local34.anInt5860 * 128;
			}
			Static195.aClass44_29.method1358(local9);
		} else if (arg6 != null) {
			local9.aClass15_Sub2_Sub2_2 = arg6;
			local9.anInt5930 = (arg4 + arg6.method4286()) * 128;
			local9.anInt5927 = (arg6.method4286() + arg2) * 128;
			local9.anInt5913 = Static17.method309(arg6);
			local9.anInt5917 = arg6.anInt5407;
			local9.anInt5922 = arg6.anInt5401 * 128;
			Static304.aClass101_26.method2860(local9, (long) arg3);
		}
	}
}
