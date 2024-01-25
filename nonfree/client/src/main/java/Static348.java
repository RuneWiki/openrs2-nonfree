import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_101 = new Class394("", 19);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!te;IIII)V")
	public static void method5303(@OriginalArg(1) Class5_Sub52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt9166 == -1 && arg0.anIntArray512 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg0.anInt9155 * Static172.aClass5_Sub50_14.lb.method2118() >> 8;
		if (arg0.anInt9158 < arg2) {
			local16 = arg2 - arg0.anInt9158;
		} else if (arg0.anInt9154 > arg2) {
			local16 = arg0.anInt9154 - arg2;
		}
		if (arg3 > arg0.anInt9164) {
			local16 += arg3 - arg0.anInt9164;
		} else if (arg3 < arg0.anInt9160) {
			local16 += arg0.anInt9160 - arg3;
		}
		if (arg0.anInt9163 == 0 || local16 - 256 > arg0.anInt9163 || Static172.aClass5_Sub50_14.lb.method2118() == 0 || arg4 != arg0.anInt9157) {
			if (arg0.aClass5_Sub17_Sub2_2 != null) {
				Static245.aClass5_Sub17_Sub4_2.method6184(arg0.aClass5_Sub17_Sub2_2);
				arg0.aClass5_Sub17_Sub2_2 = null;
				arg0.aClass5_Sub38_1 = null;
				arg0.aClass5_Sub42_Sub1_3 = null;
			}
			if (arg0.aClass5_Sub17_Sub2_3 != null) {
				Static245.aClass5_Sub17_Sub4_2.method6184(arg0.aClass5_Sub17_Sub2_3);
				arg0.aClass5_Sub42_Sub1_2 = null;
				arg0.aClass5_Sub38_2 = null;
				arg0.aClass5_Sub17_Sub2_3 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(157) int local157 = arg0.anInt9163 - arg0.anInt9161;
		if (local157 < 0) {
			local157 = arg0.anInt9163;
		}
		@Pc(172) int local172 = local26;
		@Pc(178) int local178 = local16 - arg0.anInt9161;
		if (local178 > 0 && local157 > 0) {
			local172 = local26 * (local157 - local178) / local157;
		}
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.method4599();
		@Pc(197) int local197 = 8192;
		@Pc(208) int local208 = (arg0.anInt9154 + arg0.anInt9158) / 2 - arg2;
		@Pc(220) int local220 = (arg0.anInt9164 + arg0.anInt9160) / 2 - arg3;
		@Pc(243) int local243;
		@Pc(263) int local263;
		if (local208 != 0 || local220 != 0) {
			local243 = -Static207.anInt3885 - (int) (Math.atan2((double) local208, (double) local220) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local243 > 8192) {
				local243 = 16384 - local243;
			}
			if (local16 <= 0) {
				local263 = 8192;
			} else if (local16 >= 4096) {
				local263 = 16384;
			} else {
				local263 = local16 * 8192 / 4096 + 8192;
			}
			local197 = local243 * local263 / 8192 + (16384 - local263 >> 1);
		}
		@Pc(393) Class5_Sub17_Sub2 local393;
		if (arg0.aClass5_Sub17_Sub2_2 != null) {
			arg0.aClass5_Sub17_Sub2_2.method3953(local172);
			arg0.aClass5_Sub17_Sub2_2.method3959(local197);
		} else if (arg0.anInt9166 >= 0) {
			local243 = arg0.anInt9165 == 256 && arg0.anInt9162 == 256 ? 256 : Static535.method7515(arg0.anInt9162, arg0.anInt9165);
			if (arg0.aBoolean782) {
				if (arg0.aClass5_Sub38_1 == null) {
					arg0.aClass5_Sub38_1 = Static338.method5167(Static180.aClass390_42, arg0.anInt9166);
				}
				if (arg0.aClass5_Sub38_1 != null) {
					if (arg0.aClass5_Sub42_Sub1_3 == null) {
						arg0.aClass5_Sub42_Sub1_3 = arg0.aClass5_Sub38_1.method5176(new int[] { 22050 });
					}
					if (arg0.aClass5_Sub42_Sub1_3 != null) {
						local393 = Static684.method3952(arg0.aClass5_Sub42_Sub1_3, local243, local172 << 6, local197);
						local393.method3969(-1);
						Static245.aClass5_Sub17_Sub4_2.method6191(local393);
						arg0.aClass5_Sub17_Sub2_2 = local393;
					}
				}
			} else {
				@Pc(329) Class272 local329 = Static688.method6403(Static162.aClass390_35, arg0.anInt9166, 0);
				if (local329 != null) {
					@Pc(336) Class5_Sub42_Sub1 local336 = local329.method6406().method5821(Static264.aClass276_2);
					@Pc(344) Class5_Sub17_Sub2 local344 = Static684.method3952(local336, local243, local172 << 6, local197);
					local344.method3969(-1);
					Static245.aClass5_Sub17_Sub4_2.method6191(local344);
					arg0.aClass5_Sub17_Sub2_2 = local344;
				}
			}
		}
		if (arg0.aClass5_Sub17_Sub2_3 != null) {
			arg0.aClass5_Sub17_Sub2_3.method3953(local172);
			arg0.aClass5_Sub17_Sub2_3.method3959(local197);
			if (!arg0.aClass5_Sub17_Sub2_3.method9048()) {
				arg0.aClass5_Sub17_Sub2_3 = null;
				arg0.aClass5_Sub42_Sub1_2 = null;
				arg0.aClass5_Sub38_2 = null;
			}
		} else if (arg0.anIntArray512 != null && (arg0.anInt9167 -= arg1) <= 0) {
			local243 = arg0.anInt9165 == 256 && arg0.anInt9162 == 256 ? 256 : arg0.anInt9162 + (int) (Math.random() * (double) (arg0.anInt9165 - arg0.anInt9162));
			if (!arg0.aBoolean783) {
				local263 = (int) (Math.random() * (double) arg0.anIntArray512.length);
				@Pc(499) Class272 local499 = Static688.method6403(Static162.aClass390_35, arg0.anIntArray512[local263], 0);
				if (local499 != null) {
					@Pc(506) Class5_Sub42_Sub1 local506 = local499.method6406().method5821(Static264.aClass276_2);
					@Pc(514) Class5_Sub17_Sub2 local514 = Static684.method3952(local506, local243, local172 << 6, local197);
					local514.method3969(0);
					Static245.aClass5_Sub17_Sub4_2.method6191(local514);
					arg0.aClass5_Sub17_Sub2_3 = local514;
					arg0.anInt9167 = arg0.anInt9153 + (int) (Math.random() * (double) (arg0.anInt9151 - arg0.anInt9153));
					return;
				}
				return;
			}
			if (arg0.aClass5_Sub38_2 == null) {
				local263 = (int) ((double) arg0.anIntArray512.length * Math.random());
				arg0.aClass5_Sub38_2 = Static338.method5167(Static180.aClass390_42, arg0.anIntArray512[local263]);
			}
			if (arg0.aClass5_Sub38_2 != null) {
				if (arg0.aClass5_Sub42_Sub1_2 == null) {
					arg0.aClass5_Sub42_Sub1_2 = arg0.aClass5_Sub38_2.method5176(new int[] { 22050 });
				}
				if (arg0.aClass5_Sub42_Sub1_2 != null) {
					local393 = Static684.method3952(arg0.aClass5_Sub42_Sub1_2, local243, local172 << 6, local197);
					local393.method3969(0);
					Static245.aClass5_Sub17_Sub4_2.method6191(local393);
					arg0.aClass5_Sub17_Sub2_3 = local393;
					arg0.anInt9167 = (int) ((double) (arg0.anInt9151 - arg0.anInt9153) * Math.random()) + arg0.anInt9153;
					return;
				}
			}
		}
	}
}
