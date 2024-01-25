import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!so", name = "e", descriptor = "[Lclient!s;")
	public static Class274[] aClass274Array3;

	@OriginalMember(owner = "client!so", name = "d", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_121 = new Class218(33, -2);

	@OriginalMember(owner = "client!so", name = "j", descriptor = "I")
	public static int anInt9082 = -1;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z")
	public static boolean method7477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static232.method4482(arg1, arg0) || Static350.method5752(arg1, arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBIILclient!hca;)V")
	public static void method7478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub25 arg4) {
		if (arg4.anInt4657 == -1 && arg4.anIntArray244 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = arg4.anInt4645 * Static552.aClass3_Sub48_30.aClass23_Sub8_3.method3378() >> 8;
		if (arg4.anInt4660 < arg3) {
			local15 = arg3 - arg4.anInt4660;
		} else if (arg4.anInt4649 > arg3) {
			local15 = arg4.anInt4649 - arg3;
		}
		if (arg1 > arg4.anInt4658) {
			local15 += arg1 - arg4.anInt4658;
		} else if (arg4.anInt4655 > arg1) {
			local15 += arg4.anInt4655 - arg1;
		}
		if (arg4.anInt4644 == 0 || local15 - 256 > arg4.anInt4644 || Static552.aClass3_Sub48_30.aClass23_Sub8_3.method3378() == 0 || arg4.anInt4661 != arg0) {
			if (arg4.aClass3_Sub7_Sub1_3 != null) {
				Static581.aClass3_Sub7_Sub3_2.method2210(arg4.aClass3_Sub7_Sub1_3);
				arg4.aClass3_Sub47_2 = null;
				arg4.aClass3_Sub7_Sub1_3 = null;
				arg4.aClass3_Sub12_Sub1_2 = null;
			}
			if (arg4.aClass3_Sub7_Sub1_2 != null) {
				Static581.aClass3_Sub7_Sub3_2.method2210(arg4.aClass3_Sub7_Sub1_2);
				arg4.aClass3_Sub12_Sub1_3 = null;
				arg4.aClass3_Sub7_Sub1_2 = null;
				arg4.aClass3_Sub47_1 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(158) int local158 = (arg4.anInt4644 - local15) * local25 / arg4.anInt4644;
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308();
		@Pc(169) int local169 = 8192;
		@Pc(180) int local180 = (arg4.anInt4649 + arg4.anInt4660) / 2 - arg3;
		@Pc(191) int local191 = (arg4.anInt4655 + arg4.anInt4658) / 2 - arg1;
		@Pc(215) int local215;
		@Pc(241) int local241;
		if (local180 != 0 || local191 != 0) {
			local215 = -Static166.anInt3989 - (int) (Math.atan2((double) local180, (double) local191) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local215 > 8192) {
				local215 = 16384 - local215;
			}
			if (local15 <= 0) {
				local241 = 8192;
			} else if (local15 < 4096) {
				local241 = local15 * 8192 / 4096 + 8192;
			} else {
				local241 = 16384;
			}
			local169 = (16384 - local241 >> 1) + local215 * local241 / 8192;
		}
		@Pc(325) Class3_Sub7_Sub1 local325;
		if (arg4.aClass3_Sub7_Sub1_3 != null) {
			arg4.aClass3_Sub7_Sub1_3.method656(local158);
			arg4.aClass3_Sub7_Sub1_3.method668(local169);
		} else if (arg4.anInt4657 >= 0) {
			local215 = arg4.anInt4643 == 256 && arg4.anInt4654 == 256 ? 256 : Static277.method4946(arg4.anInt4643, arg4.anInt4654);
			if (arg4.aBoolean401) {
				if (arg4.aClass3_Sub47_2 == null) {
					arg4.aClass3_Sub47_2 = Static538.method7653(Static349.aClass181_64, arg4.anInt4657);
				}
				if (arg4.aClass3_Sub47_2 != null) {
					if (arg4.aClass3_Sub12_Sub1_2 == null) {
						arg4.aClass3_Sub12_Sub1_2 = arg4.aClass3_Sub47_2.method7648(new int[] { 22050 });
					}
					if (arg4.aClass3_Sub12_Sub1_2 != null) {
						local325 = Static650.method680(arg4.aClass3_Sub12_Sub1_2, local215, local158 << 6, local169);
						local325.method650(-1);
						Static581.aClass3_Sub7_Sub3_2.method2209(local325);
						arg4.aClass3_Sub7_Sub1_3 = local325;
					}
				}
			} else {
				@Pc(342) Class64 local342 = Static652.method2497(Static462.aClass181_92, arg4.anInt4657, 0);
				if (local342 != null) {
					@Pc(349) Class3_Sub12_Sub1 local349 = local342.method2494().method5544(Static487.aClass381_2);
					@Pc(357) Class3_Sub7_Sub1 local357 = Static650.method680(local349, local215, local158 << 6, local169);
					local357.method650(-1);
					Static581.aClass3_Sub7_Sub3_2.method2209(local357);
					arg4.aClass3_Sub7_Sub1_3 = local357;
				}
			}
		}
		if (arg4.aClass3_Sub7_Sub1_2 != null) {
			arg4.aClass3_Sub7_Sub1_2.method656(local158);
			arg4.aClass3_Sub7_Sub1_2.method668(local169);
			if (!arg4.aClass3_Sub7_Sub1_2.method8670()) {
				arg4.aClass3_Sub12_Sub1_3 = null;
				arg4.aClass3_Sub7_Sub1_2 = null;
				arg4.aClass3_Sub47_1 = null;
			}
		} else if (arg4.anIntArray244 != null && (arg4.anInt4656 -= arg2) <= 0) {
			local215 = arg4.anInt4643 == 256 && arg4.anInt4654 == 256 ? 256 : (int) (Math.random() * (double) (arg4.anInt4643 - arg4.anInt4654)) + arg4.anInt4654;
			if (arg4.aBoolean400) {
				if (arg4.aClass3_Sub47_1 == null) {
					local241 = (int) (Math.random() * (double) arg4.anIntArray244.length);
					arg4.aClass3_Sub47_1 = Static538.method7653(Static349.aClass181_64, arg4.anIntArray244[local241]);
				}
				if (arg4.aClass3_Sub47_1 != null) {
					if (arg4.aClass3_Sub12_Sub1_3 == null) {
						arg4.aClass3_Sub12_Sub1_3 = arg4.aClass3_Sub47_1.method7648(new int[] { 22050 });
					}
					if (arg4.aClass3_Sub12_Sub1_3 != null) {
						local325 = Static650.method680(arg4.aClass3_Sub12_Sub1_3, local215, local158 << 6, local169);
						local325.method650(0);
						Static581.aClass3_Sub7_Sub3_2.method2209(local325);
						arg4.anInt4656 = arg4.anInt4648 + (int) ((double) (arg4.anInt4647 - arg4.anInt4648) * Math.random());
						arg4.aClass3_Sub7_Sub1_2 = local325;
						return;
					}
				}
				return;
			}
			local241 = (int) (Math.random() * (double) arg4.anIntArray244.length);
			@Pc(536) Class64 local536 = Static652.method2497(Static462.aClass181_92, arg4.anIntArray244[local241], 0);
			if (local536 != null) {
				@Pc(543) Class3_Sub12_Sub1 local543 = local536.method2494().method5544(Static487.aClass381_2);
				@Pc(551) Class3_Sub7_Sub1 local551 = Static650.method680(local543, local215, local158 << 6, local169);
				local551.method650(0);
				Static581.aClass3_Sub7_Sub3_2.method2209(local551);
				arg4.aClass3_Sub7_Sub1_2 = local551;
				arg4.anInt4656 = (int) ((double) (arg4.anInt4647 - arg4.anInt4648) * Math.random()) + arg4.anInt4648;
				return;
			}
		}
	}
}
