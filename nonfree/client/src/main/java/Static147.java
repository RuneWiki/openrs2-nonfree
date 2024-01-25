import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public static int anInt3045 = 0;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "[I")
	public static final int[] anIntArray296 = new int[5];

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
	public static final int[] anIntArray297 = new int[13];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V")
	public static void method2607(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static178.anInt3745 + Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728;
		@Pc(15) int local15 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 + Static86.anInt1656;
		if (Static29.anInt545 - local10 < -500 || Static29.anInt545 - local10 > 500 || Static163.anInt3374 - local15 < -500 || Static163.anInt3374 - local15 > 500) {
			Static163.anInt3374 = local15;
			Static29.anInt545 = local10;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (local10 != Static29.anInt545) {
			local62 = local10 - Static29.anInt545;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local62 > local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local62 < local70) {
				local70 = local62;
			}
			Static29.anInt545 += local70;
		}
		if (!Static317.aBoolean521) {
			Static318.aFloat77 += (float) arg0 * Static81.aFloat8 / 6.0F;
			Static143.aFloat21 += Static93.aFloat9 * (float) arg0 / 6.0F;
		}
		if (Static163.anInt3374 != local15) {
			local62 = local15 - Static163.anInt3374;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local70 < local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local70 > local62) {
				local70 = local62;
			}
			Static163.anInt3374 += local70;
		}
		Static340.method5645();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!n;Lclient!ge;Lclient!cd;)V")
	public static void method2608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10_Sub1_Sub2_Sub2 arg4, @OriginalArg(6) Class79 arg5, @OriginalArg(7) Class10_Sub1_Sub2_Sub1 arg6) {
		@Pc(11) Class1_Sub43 local11 = new Class1_Sub43();
		local11.anInt6217 = arg3 * 128;
		local11.anInt6234 = arg1 * 128;
		local11.anInt6225 = arg0;
		if (arg5 != null) {
			local11.aClass79_1 = arg5;
			@Pc(32) int local32 = arg5.anInt1884;
			@Pc(35) int local35 = arg5.anInt1897;
			if (arg2 == 1 || arg2 == 3) {
				local35 = arg5.anInt1884;
				local32 = arg5.anInt1897;
			}
			local11.anIntArray625 = arg5.anIntArray157;
			local11.anInt6228 = arg5.anInt1874 * 128;
			local11.anInt6220 = arg5.anInt1878;
			local11.anInt6218 = arg5.anInt1896;
			local11.anInt6222 = arg5.anInt1873;
			local11.anInt6229 = (local35 + arg1) * 128;
			local11.anInt6231 = arg5.anInt1855;
			local11.anInt6221 = (local32 + arg3) * 128;
			if (arg5.anIntArray161 != null) {
				local11.aBoolean514 = true;
				local11.method5364();
			}
			if (local11.anIntArray625 != null) {
				local11.anInt6227 = local11.anInt6218 + (int) ((double) (local11.anInt6231 - local11.anInt6218) * Math.random());
			}
			Static305.aClass14_33.method300(local11);
		} else if (arg6 != null) {
			local11.aClass10_Sub1_Sub2_Sub1_1 = arg6;
			@Pc(177) Class60 local177 = arg6.aClass60_1;
			if (local177.anIntArray109 != null) {
				local11.aBoolean514 = true;
				local177 = local177.method1274();
			}
			if (local177 != null) {
				local11.anInt6221 = (local177.anInt1504 + arg3) * 128;
				local11.anInt6229 = (arg1 + local177.anInt1504) * 128;
				local11.anInt6222 = Static37.method782(arg6);
				local11.anInt6220 = local177.anInt1501;
				local11.anInt6228 = local177.anInt1515 * 128;
			}
			Static337.aClass14_36.method300(local11);
		} else if (arg4 != null) {
			local11.aClass10_Sub1_Sub2_Sub2_2 = arg4;
			local11.anInt6221 = (arg3 + arg4.method3402()) * 128;
			local11.anInt6229 = (arg4.method3402() + arg1) * 128;
			local11.anInt6222 = Static94.method1470(arg4);
			local11.anInt6228 = arg4.anInt4113 * 128;
			local11.anInt6220 = arg4.anInt4109;
			Static102.aClass207_13.method5552(local11, (long) arg4.anInt4036);
			return;
		}
	}
}
