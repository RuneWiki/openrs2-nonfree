import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!lea;IIII)V")
	public static void method6463(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub35 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt5742 == -1 && arg1.anIntArray335 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg1.anInt5738 * Static96.aClass6_Sub22_7.aClass29_Sub5_1.method1502() >> 8;
		if (arg1.anInt5752 < arg2) {
			local16 = arg2 - arg1.anInt5752;
		} else if (arg2 < arg1.anInt5741) {
			local16 = arg1.anInt5741 - arg2;
		}
		if (arg1.anInt5751 < arg0) {
			local16 += arg0 - arg1.anInt5751;
		} else if (arg0 < arg1.anInt5740) {
			local16 += arg1.anInt5740 - arg0;
		}
		if (arg1.anInt5746 == 0 || arg1.anInt5746 < local16 - 256 || Static96.aClass6_Sub22_7.aClass29_Sub5_1.method1502() == 0 || arg1.anInt5736 != arg3) {
			if (arg1.aClass6_Sub8_Sub5_2 != null) {
				Static106.aClass6_Sub8_Sub3_2.method4258(arg1.aClass6_Sub8_Sub5_2);
				arg1.aClass6_Sub21_Sub1_3 = null;
				arg1.aClass6_Sub46_1 = null;
				arg1.aClass6_Sub8_Sub5_2 = null;
			}
			if (arg1.aClass6_Sub8_Sub5_3 != null) {
				Static106.aClass6_Sub8_Sub3_2.method4258(arg1.aClass6_Sub8_Sub5_3);
				arg1.aClass6_Sub21_Sub1_2 = null;
				arg1.aClass6_Sub8_Sub5_3 = null;
				arg1.aClass6_Sub46_2 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(150) int local150 = arg1.anInt5746 - arg1.anInt5749;
		if (local150 < 0) {
			local150 = arg1.anInt5746;
		}
		@Pc(160) int local160 = local26;
		@Pc(166) int local166 = local16 - arg1.anInt5749;
		if (local166 > 0 && local150 > 0) {
			local160 = (local150 - local166) * local26 / local150;
		}
		Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326();
		@Pc(191) int local191 = 8192;
		@Pc(203) int local203 = (arg1.anInt5752 + arg1.anInt5741) / 2 - arg2;
		@Pc(214) int local214 = (arg1.anInt5740 + arg1.anInt5751) / 2 - arg0;
		@Pc(238) int local238;
		@Pc(264) int local264;
		if (local203 != 0 || local214 != 0) {
			local238 = -Static672.anInt10375 - (int) (Math.atan2((double) local203, (double) local214) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local238 > 8192) {
				local238 = 16384 - local238;
			}
			if (local16 <= 0) {
				local264 = 8192;
			} else if (local16 < 4096) {
				local264 = local16 * 8192 / 4096 + 8192;
			} else {
				local264 = 16384;
			}
			local191 = local264 * local238 / 8192 + (16384 - local264 >> 1);
		}
		@Pc(391) Class6_Sub8_Sub5 local391;
		if (arg1.aClass6_Sub8_Sub5_2 != null) {
			arg1.aClass6_Sub8_Sub5_2.method9136(local160);
			arg1.aClass6_Sub8_Sub5_2.method9153(local191);
		} else if (arg1.anInt5742 >= 0) {
			local238 = arg1.anInt5739 == 256 && arg1.anInt5743 == 256 ? 256 : Static547.method7772(arg1.anInt5743, arg1.anInt5739);
			if (arg1.aBoolean375) {
				if (arg1.aClass6_Sub46_1 == null) {
					arg1.aClass6_Sub46_1 = Static495.method7152(Static465.aClass8_112, arg1.anInt5742);
				}
				if (arg1.aClass6_Sub46_1 != null) {
					if (arg1.aClass6_Sub21_Sub1_3 == null) {
						arg1.aClass6_Sub21_Sub1_3 = arg1.aClass6_Sub46_1.method7154(new int[] { 22050 });
					}
					if (arg1.aClass6_Sub21_Sub1_3 != null) {
						local391 = Static687.method9151(arg1.aClass6_Sub21_Sub1_3, local238, local160 << 6, local191);
						local391.method9131(-1);
						Static106.aClass6_Sub8_Sub3_2.method4256(local391);
						arg1.aClass6_Sub8_Sub5_2 = local391;
					}
				}
			} else {
				@Pc(327) Class133 local327 = Static682.method3029(Static98.aClass8_123, arg1.anInt5742, 0);
				if (local327 != null) {
					@Pc(334) Class6_Sub21_Sub1 local334 = local327.method3026().method2289(Static20.aClass101_1);
					@Pc(342) Class6_Sub8_Sub5 local342 = Static687.method9151(local334, local238, local160 << 6, local191);
					local342.method9131(-1);
					Static106.aClass6_Sub8_Sub3_2.method4256(local342);
					arg1.aClass6_Sub8_Sub5_2 = local342;
				}
			}
		}
		if (arg1.aClass6_Sub8_Sub5_3 != null) {
			arg1.aClass6_Sub8_Sub5_3.method9136(local160);
			arg1.aClass6_Sub8_Sub5_3.method9153(local191);
			if (arg1.aClass6_Sub8_Sub5_3.method9176()) {
				return;
			}
			arg1.aClass6_Sub8_Sub5_3 = null;
			arg1.aClass6_Sub46_2 = null;
			arg1.aClass6_Sub21_Sub1_2 = null;
		} else if (arg1.anIntArray335 != null && (arg1.anInt5744 -= arg4) <= 0) {
			local238 = arg1.anInt5739 == 256 && arg1.anInt5743 == 256 ? 256 : (int) ((double) (arg1.anInt5739 - arg1.anInt5743) * Math.random()) + arg1.anInt5743;
			if (arg1.aBoolean376) {
				if (arg1.aClass6_Sub46_2 == null) {
					local264 = (int) (Math.random() * (double) arg1.anIntArray335.length);
					arg1.aClass6_Sub46_2 = Static495.method7152(Static465.aClass8_112, arg1.anIntArray335[local264]);
				}
				if (arg1.aClass6_Sub46_2 != null) {
					if (arg1.aClass6_Sub21_Sub1_2 == null) {
						arg1.aClass6_Sub21_Sub1_2 = arg1.aClass6_Sub46_2.method7154(new int[] { 22050 });
					}
					if (arg1.aClass6_Sub21_Sub1_2 != null) {
						local391 = Static687.method9151(arg1.aClass6_Sub21_Sub1_2, local238, local160 << 6, local191);
						local391.method9131(0);
						Static106.aClass6_Sub8_Sub3_2.method4256(local391);
						arg1.aClass6_Sub8_Sub5_3 = local391;
						arg1.anInt5744 = arg1.anInt5750 + (int) ((double) (arg1.anInt5747 - arg1.anInt5750) * Math.random());
						return;
					}
				}
				return;
			}
			local264 = (int) ((double) arg1.anIntArray335.length * Math.random());
			@Pc(543) Class133 local543 = Static682.method3029(Static98.aClass8_123, arg1.anIntArray335[local264], 0);
			if (local543 != null) {
				@Pc(550) Class6_Sub21_Sub1 local550 = local543.method3026().method2289(Static20.aClass101_1);
				@Pc(558) Class6_Sub8_Sub5 local558 = Static687.method9151(local550, local238, local160 << 6, local191);
				local558.method9131(0);
				Static106.aClass6_Sub8_Sub3_2.method4256(local558);
				arg1.aClass6_Sub8_Sub5_3 = local558;
				arg1.anInt5744 = (int) ((double) (arg1.anInt5747 - arg1.anInt5750) * Math.random()) + arg1.anInt5750;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJZLclient!ae;III)V")
	public static void method6464(@OriginalArg(1) long arg0, @OriginalArg(3) Class8 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static398.method5739(arg1, arg3, arg2, arg0);
	}
}
