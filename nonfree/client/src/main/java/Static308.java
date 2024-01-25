import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "J")
	public static long aLong166;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
	public static int anInt5657 = 0;

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "[I")
	public static final int[] anIntArray383 = new int[5];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
	public static void method4724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class2_Sub31 local15 = (Class2_Sub31) Static228.aClass238_26.method5833(); local15 != null; local15 = (Class2_Sub31) Static228.aClass238_26.method5838()) {
			method4725(arg0, arg2, arg1, local15, arg3);
		}
		@Pc(181) boolean local181;
		for (@Pc(36) Class2_Sub31 local36 = (Class2_Sub31) Static124.aClass238_22.method5833(); local36 != null; local36 = (Class2_Sub31) Static124.aClass238_22.method5838()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class165 local45 = local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.method2761();
			if (local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == -1 || local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.aBoolean275) {
				local40 = 0;
			} else if (local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == local45.anInt4881 || local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == local45.anInt4914 || local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == local45.anInt4905 || local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == local45.anInt4875) {
				local40 = 2;
			} else if (local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == local45.anInt4899 || local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == local45.anInt4916 || local45.anInt4902 == local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 || local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt3253 == local45.anInt4910) {
				local40 = 3;
			}
			if (local36.anInt5783 != local40) {
				@Pc(143) int local143 = Static324.method4895(local36.aClass11_Sub1_Sub1_Sub2_Sub2_1);
				@Pc(147) Class236 local147 = local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.aClass236_1;
				if (local147.anIntArray462 != null) {
					local147 = local147.method5779(Static438.aClass198_1);
				}
				if (local147 == null || local143 == -1) {
					local36.aBoolean437 = false;
					local36.anInt5792 = -1;
					local36.anInt5783 = local40;
				} else if (local36.anInt5792 == local143 && local36.aBoolean437 == local147.aBoolean519) {
					local36.anInt5793 = local147.anInt6918;
					local36.anInt5783 = local40;
				} else {
					local181 = false;
					if (local36.aClass2_Sub2_Sub5_3 == null) {
						local181 = true;
					} else {
						local36.anInt5793 -= 512;
						if (local36.anInt5793 <= 0) {
							Static1.aClass2_Sub2_Sub2_6.method1042(local36.aClass2_Sub2_Sub5_3);
							local36.aClass2_Sub2_Sub5_3 = null;
							local181 = true;
						}
					}
					if (local181) {
						local36.aClass2_Sub12_Sub1_3 = null;
						local36.anInt5792 = local143;
						local36.anInt5793 = local147.anInt6918;
						local36.aBoolean437 = local147.aBoolean519;
						local36.anInt5783 = local40;
						local36.aClass2_Sub14_2 = null;
					}
				}
			}
			local36.anInt5789 = local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt9925;
			local36.anInt5781 = local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt9925 + (local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.method2778() << 8);
			local36.anInt5791 = local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt9929;
			local36.anInt5788 = local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.anInt9929 + (local36.aClass11_Sub1_Sub1_Sub2_Sub2_1.method2778() << 8);
			method4725(arg0, arg2, arg1, local36, arg3);
		}
		for (@Pc(295) Class2_Sub31 local295 = (Class2_Sub31) Static634.aClass222_44.method5474(); local295 != null; local295 = (Class2_Sub31) Static634.aClass222_44.method5472()) {
			@Pc(299) byte local299 = 1;
			@Pc(304) Class165 local304 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.method2761();
			if (local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 == -1 || local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.aBoolean275) {
				local299 = 0;
			} else if (local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 == local304.anInt4881 || local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 == local304.anInt4914 || local304.anInt4905 == local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 || local304.anInt4875 == local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253) {
				local299 = 2;
			} else if (local304.anInt4899 == local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 || local304.anInt4916 == local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 || local304.anInt4902 == local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 || local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt3253 == local304.anInt4910) {
				local299 = 3;
			}
			if (local299 != local295.anInt5783) {
				@Pc(400) int local400 = Static617.method8394(local295.aClass11_Sub1_Sub1_Sub2_Sub1_1);
				if (local295.anInt5792 == local400 && local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.aBoolean45 == local295.aBoolean437) {
					local295.anInt5793 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt567;
					local295.anInt5783 = local299;
				} else {
					local181 = false;
					if (local295.aClass2_Sub2_Sub5_3 == null) {
						local181 = true;
					} else {
						local295.anInt5793 -= 512;
						if (local295.anInt5793 <= 0) {
							Static1.aClass2_Sub2_Sub2_6.method1042(local295.aClass2_Sub2_Sub5_3);
							local181 = true;
							local295.aClass2_Sub2_Sub5_3 = null;
						}
					}
					if (local181) {
						local295.aClass2_Sub14_2 = null;
						local295.anInt5792 = local400;
						local295.anInt5783 = local299;
						local295.aBoolean437 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.aBoolean45;
						local295.aClass2_Sub12_Sub1_3 = null;
						local295.anInt5793 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt567;
					}
				}
			}
			local295.anInt5789 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt9925;
			local295.anInt5781 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt9925 + (local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.method2778() << 8);
			local295.anInt5791 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt9929;
			local295.anInt5788 = local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt9929 + (local295.aClass11_Sub1_Sub1_Sub2_Sub1_1.method2778() << 8);
			method4725(arg0, arg2, arg1, local295, arg3);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIILclient!lf;I)V")
	private static void method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub31 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt5792 == -1 && arg3.anIntArray397 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(28) int local28 = arg3.anInt5793 * Static404.aClass2_Sub13_2.aClass33_Sub1_4.method810() >> 8;
		if (arg0 > arg3.anInt5781) {
			local16 = arg0 - arg3.anInt5781;
		} else if (arg0 < arg3.anInt5789) {
			local16 = arg3.anInt5789 - arg0;
		}
		if (arg1 > arg3.anInt5788) {
			local16 += arg1 - arg3.anInt5788;
		} else if (arg1 < arg3.anInt5791) {
			local16 += arg3.anInt5791 - arg1;
		}
		if (arg3.anInt5780 == 0 || local16 - 256 > arg3.anInt5780 || Static404.aClass2_Sub13_2.aClass33_Sub1_4.method810() == 0 || arg3.anInt5790 != arg2) {
			if (arg3.aClass2_Sub2_Sub5_3 != null) {
				Static1.aClass2_Sub2_Sub2_6.method1042(arg3.aClass2_Sub2_Sub5_3);
				arg3.aClass2_Sub2_Sub5_3 = null;
				arg3.aClass2_Sub12_Sub1_3 = null;
				arg3.aClass2_Sub14_2 = null;
			}
			if (arg3.aClass2_Sub2_Sub5_2 != null) {
				Static1.aClass2_Sub2_Sub2_6.method1042(arg3.aClass2_Sub2_Sub5_2);
				arg3.aClass2_Sub2_Sub5_2 = null;
				arg3.aClass2_Sub12_Sub1_2 = null;
				arg3.aClass2_Sub14_1 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(176) int local176 = local28 * (arg3.anInt5780 - local16) / arg3.anInt5780;
		Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778();
		@Pc(182) int local182 = 8192;
		@Pc(193) int local193 = (arg3.anInt5789 + arg3.anInt5781) / 2 - arg0;
		@Pc(203) int local203 = (arg3.anInt5788 + arg3.anInt5791) / 2 - arg1;
		@Pc(230) int local230;
		@Pc(245) int local245;
		if (local193 != 0 || local203 != 0) {
			local230 = -Static105.anInt2114 - (int) (Math.atan2((double) local193, (double) local203) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local230 > 8192) {
				local230 = 16384 - local230;
			}
			if (local16 <= 0) {
				local245 = 8192;
			} else if (local16 >= 4096) {
				local245 = 16384;
			} else {
				local245 = local16 * 8192 / 4096 + 8192;
			}
			local182 = (16384 - local245 >> 1) + local230 * local245 / 8192;
		}
		@Pc(377) Class2_Sub2_Sub5 local377;
		if (arg3.aClass2_Sub2_Sub5_3 != null) {
			arg3.aClass2_Sub2_Sub5_3.method7568(local176);
			arg3.aClass2_Sub2_Sub5_3.method7562(local182);
		} else if (arg3.anInt5792 >= 0) {
			local230 = arg3.anInt5786 == 256 && arg3.anInt5782 == 256 ? 256 : Static252.method4161(arg3.anInt5786, arg3.anInt5782);
			if (arg3.aBoolean437) {
				if (arg3.aClass2_Sub14_2 == null) {
					arg3.aClass2_Sub14_2 = Static83.method1542(Static333.aClass97_87, arg3.anInt5792);
				}
				if (arg3.aClass2_Sub14_2 != null) {
					if (arg3.aClass2_Sub12_Sub1_3 == null) {
						arg3.aClass2_Sub12_Sub1_3 = arg3.aClass2_Sub14_2.method1537(new int[] { 22050 });
					}
					if (arg3.aClass2_Sub12_Sub1_3 != null) {
						local377 = Static652.method7560(arg3.aClass2_Sub12_Sub1_3, local230, local176 << 6, local182);
						local377.method7552(-1);
						Static1.aClass2_Sub2_Sub2_6.method1044(local377);
						arg3.aClass2_Sub2_Sub5_3 = local377;
					}
				}
			} else {
				@Pc(313) Class243 local313 = Static650.method6254(Static560.aClass97_137, arg3.anInt5792, 0);
				if (local313 != null) {
					@Pc(320) Class2_Sub12_Sub1 local320 = local313.method6256().method1266(Static460.aClass101_2);
					@Pc(328) Class2_Sub2_Sub5 local328 = Static652.method7560(local320, local230, local176 << 6, local182);
					local328.method7552(-1);
					Static1.aClass2_Sub2_Sub2_6.method1044(local328);
					arg3.aClass2_Sub2_Sub5_3 = local328;
				}
			}
		}
		if (arg3.aClass2_Sub2_Sub5_2 != null) {
			arg3.aClass2_Sub2_Sub5_2.method7568(local176);
			arg3.aClass2_Sub2_Sub5_2.method7562(local182);
			if (!arg3.aClass2_Sub2_Sub5_2.method8600()) {
				arg3.aClass2_Sub12_Sub1_2 = null;
				arg3.aClass2_Sub2_Sub5_2 = null;
				arg3.aClass2_Sub14_1 = null;
			}
		} else if (arg3.anIntArray397 != null && (arg3.anInt5785 -= arg4) <= 0) {
			local230 = arg3.anInt5786 == 256 && arg3.anInt5782 == 256 ? 256 : (int) ((double) (arg3.anInt5786 - arg3.anInt5782) * Math.random()) + arg3.anInt5782;
			if (!arg3.aBoolean438) {
				local245 = (int) ((double) arg3.anIntArray397.length * Math.random());
				@Pc(482) Class243 local482 = Static650.method6254(Static560.aClass97_137, arg3.anIntArray397[local245], 0);
				if (local482 != null) {
					@Pc(489) Class2_Sub12_Sub1 local489 = local482.method6256().method1266(Static460.aClass101_2);
					@Pc(497) Class2_Sub2_Sub5 local497 = Static652.method7560(local489, local230, local176 << 6, local182);
					local497.method7552(0);
					Static1.aClass2_Sub2_Sub2_6.method1044(local497);
					arg3.aClass2_Sub2_Sub5_2 = local497;
					arg3.anInt5785 = arg3.anInt5784 + (int) (Math.random() * (double) (arg3.anInt5787 - arg3.anInt5784));
					return;
				}
				return;
			}
			if (arg3.aClass2_Sub14_1 == null) {
				local245 = (int) ((double) arg3.anIntArray397.length * Math.random());
				arg3.aClass2_Sub14_1 = Static83.method1542(Static333.aClass97_87, arg3.anIntArray397[local245]);
			}
			if (arg3.aClass2_Sub14_1 != null) {
				if (arg3.aClass2_Sub12_Sub1_2 == null) {
					arg3.aClass2_Sub12_Sub1_2 = arg3.aClass2_Sub14_1.method1537(new int[] { 22050 });
				}
				if (arg3.aClass2_Sub12_Sub1_2 != null) {
					local377 = Static652.method7560(arg3.aClass2_Sub12_Sub1_2, local230, local176 << 6, local182);
					local377.method7552(0);
					Static1.aClass2_Sub2_Sub2_6.method1044(local377);
					arg3.anInt5785 = arg3.anInt5784 + (int) ((double) (arg3.anInt5787 - arg3.anInt5784) * Math.random());
					arg3.aClass2_Sub2_Sub5_2 = local377;
					return;
				}
			}
		}
	}
}
