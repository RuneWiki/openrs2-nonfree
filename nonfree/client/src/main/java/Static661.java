import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIILclient!kp;)V")
	public static void method9135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class14_Sub31 arg4) {
		if (arg4.anInt5975 == -1 && arg4.anIntArray436 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg4.anInt5958 * Static56.aClass14_Sub22_5.aClass21_Sub20_5.method7115() >> 8;
		if (arg4.anInt5971 < arg3) {
			local16 = arg3 - arg4.anInt5971;
		} else if (arg3 < arg4.anInt5968) {
			local16 = arg4.anInt5968 - arg3;
		}
		if (arg1 > arg4.anInt5969) {
			local16 += arg1 - arg4.anInt5969;
		} else if (arg1 < arg4.anInt5973) {
			local16 += arg4.anInt5973 - arg1;
		}
		if (arg4.anInt5967 == 0 || local16 - 256 > arg4.anInt5967 || Static56.aClass14_Sub22_5.aClass21_Sub20_5.method7115() == 0 || arg4.anInt5970 != arg0) {
			if (arg4.aClass14_Sub5_Sub4_2 != null) {
				Static217.aClass14_Sub5_Sub3_1.method6029(arg4.aClass14_Sub5_Sub4_2);
				arg4.aClass14_Sub5_Sub4_2 = null;
				arg4.aClass14_Sub13_1 = null;
				arg4.aClass14_Sub14_Sub1_2 = null;
			}
			if (arg4.aClass14_Sub5_Sub4_3 != null) {
				Static217.aClass14_Sub5_Sub3_1.method6029(arg4.aClass14_Sub5_Sub4_3);
				arg4.aClass14_Sub13_2 = null;
				arg4.aClass14_Sub14_Sub1_3 = null;
				arg4.aClass14_Sub5_Sub4_3 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(164) int local164 = arg4.anInt5967 - arg4.anInt5965;
		if (local164 < 0) {
			local164 = arg4.anInt5967;
		}
		@Pc(180) int local180 = local26;
		@Pc(185) int local185 = local16 - arg4.anInt5965;
		if (local185 > 0 && local164 > 0) {
			local180 = local26 * (local164 - local185) / local164;
		}
		Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422();
		@Pc(207) int local207 = 8192;
		@Pc(217) int local217 = (arg4.anInt5968 + arg4.anInt5971) / 2 - arg3;
		@Pc(228) int local228 = (arg4.anInt5973 + arg4.anInt5969) / 2 - arg1;
		@Pc(252) int local252;
		@Pc(270) int local270;
		if (local217 != 0 || local228 != 0) {
			local252 = -Static219.anInt4123 - (int) (Math.atan2((double) local217, (double) local228) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local252 > 8192) {
				local252 = 16384 - local252;
			}
			if (local16 <= 0) {
				local270 = 8192;
			} else if (local16 >= 4096) {
				local270 = 16384;
			} else {
				local270 = local16 * 8192 / 4096 + 8192;
			}
			local207 = local270 * local252 / 8192 + (16384 - local270 >> 1);
		}
		@Pc(406) Class14_Sub5_Sub4 local406;
		if (arg4.aClass14_Sub5_Sub4_2 != null) {
			arg4.aClass14_Sub5_Sub4_2.method7189(local180);
			arg4.aClass14_Sub5_Sub4_2.method7203(local207);
		} else if (arg4.anInt5975 >= 0) {
			local252 = arg4.anInt5974 == 256 && arg4.anInt5964 == 256 ? 256 : Static549.method7756(arg4.anInt5974, arg4.anInt5964);
			if (arg4.aBoolean407) {
				if (arg4.aClass14_Sub13_1 == null) {
					arg4.aClass14_Sub13_1 = Static99.method1796(Static479.aClass386_106, arg4.anInt5975);
				}
				if (arg4.aClass14_Sub13_1 != null) {
					if (arg4.aClass14_Sub14_Sub1_2 == null) {
						arg4.aClass14_Sub14_Sub1_2 = arg4.aClass14_Sub13_1.method1794(new int[] { 22050 });
					}
					if (arg4.aClass14_Sub14_Sub1_2 != null) {
						local406 = Static684.method7205(arg4.aClass14_Sub14_Sub1_2, local252, local180 << 6, local207);
						local406.method7192(-1);
						Static217.aClass14_Sub5_Sub3_1.method6027(local406);
						arg4.aClass14_Sub5_Sub4_2 = local406;
					}
				}
			} else {
				@Pc(342) Class354 local342 = Static687.method8490(Static391.aClass386_88, arg4.anInt5975, 0);
				if (local342 != null) {
					@Pc(349) Class14_Sub14_Sub1 local349 = local342.method8493().method1814(Static360.aClass147_1);
					@Pc(357) Class14_Sub5_Sub4 local357 = Static684.method7205(local349, local252, local180 << 6, local207);
					local357.method7192(-1);
					Static217.aClass14_Sub5_Sub3_1.method6027(local357);
					arg4.aClass14_Sub5_Sub4_2 = local357;
				}
			}
		}
		if (arg4.aClass14_Sub5_Sub4_3 != null) {
			arg4.aClass14_Sub5_Sub4_3.method7189(local180);
			arg4.aClass14_Sub5_Sub4_3.method7203(local207);
			if (!arg4.aClass14_Sub5_Sub4_3.method9314()) {
				arg4.aClass14_Sub14_Sub1_3 = null;
				arg4.aClass14_Sub13_2 = null;
				arg4.aClass14_Sub5_Sub4_3 = null;
			}
		} else if (arg4.anIntArray436 != null && (arg4.anInt5959 -= arg2) <= 0) {
			local252 = arg4.anInt5974 == 256 && arg4.anInt5964 == 256 ? 256 : arg4.anInt5964 + (int) ((double) (arg4.anInt5974 - arg4.anInt5964) * Math.random());
			if (arg4.aBoolean406) {
				if (arg4.aClass14_Sub13_2 == null) {
					local270 = (int) (Math.random() * (double) arg4.anIntArray436.length);
					arg4.aClass14_Sub13_2 = Static99.method1796(Static479.aClass386_106, arg4.anIntArray436[local270]);
				}
				if (arg4.aClass14_Sub13_2 != null) {
					if (arg4.aClass14_Sub14_Sub1_3 == null) {
						arg4.aClass14_Sub14_Sub1_3 = arg4.aClass14_Sub13_2.method1794(new int[] { 22050 });
					}
					if (arg4.aClass14_Sub14_Sub1_3 != null) {
						local406 = Static684.method7205(arg4.aClass14_Sub14_Sub1_3, local252, local180 << 6, local207);
						local406.method7192(0);
						Static217.aClass14_Sub5_Sub3_1.method6027(local406);
						arg4.anInt5959 = (int) ((double) (arg4.anInt5962 - arg4.anInt5966) * Math.random()) + arg4.anInt5966;
						arg4.aClass14_Sub5_Sub4_3 = local406;
						return;
					}
				}
				return;
			}
			local270 = (int) ((double) arg4.anIntArray436.length * Math.random());
			@Pc(568) Class354 local568 = Static687.method8490(Static391.aClass386_88, arg4.anIntArray436[local270], 0);
			if (local568 != null) {
				@Pc(575) Class14_Sub14_Sub1 local575 = local568.method8493().method1814(Static360.aClass147_1);
				@Pc(583) Class14_Sub5_Sub4 local583 = Static684.method7205(local575, local252, local180 << 6, local207);
				local583.method7192(0);
				Static217.aClass14_Sub5_Sub3_1.method6027(local583);
				arg4.aClass14_Sub5_Sub4_3 = local583;
				arg4.anInt5959 = arg4.anInt5966 + (int) (Math.random() * (double) (arg4.anInt5962 - arg4.anInt5966));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)Z")
	public static boolean method9136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method9140(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(17) Class14_Sub3_Sub9 local17 = Static142.method2219((long) arg0, 2);
		local17.method2817();
		local17.aString44 = arg1;
	}
}
