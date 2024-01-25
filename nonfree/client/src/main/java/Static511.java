import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILclient!at;IIII)V")
	public static void method7367(@OriginalArg(1) Class8_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt1055 == -1 && arg0.anIntArray31 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg0.anInt1048 * Static155.aClass8_Sub25_6.aClass36_Sub6_5.method3331() >> 8;
		if (arg3 > arg0.anInt1054) {
			local19 = arg3 - arg0.anInt1054;
		} else if (arg3 < arg0.anInt1056) {
			local19 = arg0.anInt1056 - arg3;
		}
		if (arg1 > arg0.anInt1049) {
			local19 += arg1 - arg0.anInt1049;
		} else if (arg0.anInt1059 > arg1) {
			local19 += arg0.anInt1059 - arg1;
		}
		if (arg0.anInt1045 == 0 || local19 - 256 > arg0.anInt1045 || Static155.aClass8_Sub25_6.aClass36_Sub6_5.method3331() == 0 || arg4 != arg0.anInt1047) {
			if (arg0.aClass8_Sub16_Sub3_2 != null) {
				Static15.aClass8_Sub16_Sub5_1.method7443(arg0.aClass8_Sub16_Sub3_2);
				arg0.aClass8_Sub16_Sub3_2 = null;
				arg0.aClass8_Sub13_1 = null;
				arg0.aClass8_Sub9_Sub1_1 = null;
			}
			if (arg0.aClass8_Sub16_Sub3_1 != null) {
				Static15.aClass8_Sub16_Sub5_1.method7443(arg0.aClass8_Sub16_Sub3_1);
				arg0.aClass8_Sub16_Sub3_1 = null;
				arg0.aClass8_Sub9_Sub1_2 = null;
				arg0.aClass8_Sub13_2 = null;
			}
			return;
		}
		local19 -= 256;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(165) int local165 = local29 * (arg0.anInt1045 - local19) / arg0.anInt1045;
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692();
		@Pc(171) int local171 = 8192;
		@Pc(183) int local183 = (arg0.anInt1054 + arg0.anInt1056) / 2 - arg3;
		@Pc(193) int local193 = (arg0.anInt1059 + arg0.anInt1049) / 2 - arg1;
		@Pc(217) int local217;
		@Pc(240) int local240;
		if (local183 != 0 || local193 != 0) {
			local217 = -Static25.anInt1035 - (int) (Math.atan2((double) local183, (double) local193) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local217 > 8192) {
				local217 = 16384 - local217;
			}
			if (local19 <= 0) {
				local240 = 8192;
			} else if (local19 < 4096) {
				local240 = local19 * 8192 / 4096 + 8192;
			} else {
				local240 = 16384;
			}
			local171 = (16384 - local240 >> 1) + local217 * local240 / 8192;
		}
		@Pc(372) Class8_Sub16_Sub3 local372;
		if (arg0.aClass8_Sub16_Sub3_2 != null) {
			arg0.aClass8_Sub16_Sub3_2.method6781(local165);
			arg0.aClass8_Sub16_Sub3_2.method6768(local171);
		} else if (arg0.anInt1055 >= 0) {
			local217 = arg0.anInt1051 == 256 && arg0.anInt1053 == 256 ? 256 : Static403.method6409(arg0.anInt1051, arg0.anInt1053);
			if (arg0.aBoolean101) {
				if (arg0.aClass8_Sub13_1 == null) {
					arg0.aClass8_Sub13_1 = Static79.method2064(Static398.aClass237_105, arg0.anInt1055);
				}
				if (arg0.aClass8_Sub13_1 != null) {
					if (arg0.aClass8_Sub9_Sub1_1 == null) {
						arg0.aClass8_Sub9_Sub1_1 = arg0.aClass8_Sub13_1.method2074(new int[] { 22050 });
					}
					if (arg0.aClass8_Sub9_Sub1_1 != null) {
						local372 = Static651.method6782(arg0.aClass8_Sub9_Sub1_1, local217, local165 << 6, local171);
						local372.method6773(-1);
						Static15.aClass8_Sub16_Sub5_1.method7442(local372);
						arg0.aClass8_Sub16_Sub3_2 = local372;
					}
				}
			} else {
				@Pc(308) Class354 local308 = Static653.method8222(Static131.aClass237_38, arg0.anInt1055, 0);
				if (local308 != null) {
					@Pc(315) Class8_Sub9_Sub1 local315 = local308.method8221().method1674(Static405.aClass116_2);
					@Pc(323) Class8_Sub16_Sub3 local323 = Static651.method6782(local315, local217, local165 << 6, local171);
					local323.method6773(-1);
					Static15.aClass8_Sub16_Sub5_1.method7442(local323);
					arg0.aClass8_Sub16_Sub3_2 = local323;
				}
			}
		}
		if (arg0.aClass8_Sub16_Sub3_1 != null) {
			arg0.aClass8_Sub16_Sub3_1.method6781(local165);
			arg0.aClass8_Sub16_Sub3_1.method6768(local171);
			if (arg0.aClass8_Sub16_Sub3_1.method8639()) {
				return;
			}
			arg0.aClass8_Sub13_2 = null;
			arg0.aClass8_Sub9_Sub1_2 = null;
			arg0.aClass8_Sub16_Sub3_1 = null;
		} else if (arg0.anIntArray31 != null && (arg0.anInt1046 -= arg2) <= 0) {
			local217 = arg0.anInt1051 == 256 && arg0.anInt1053 == 256 ? 256 : arg0.anInt1053 + (int) (Math.random() * (double) (arg0.anInt1051 - arg0.anInt1053));
			if (!arg0.aBoolean99) {
				local240 = (int) (Math.random() * (double) arg0.anIntArray31.length);
				@Pc(442) Class354 local442 = Static653.method8222(Static131.aClass237_38, arg0.anIntArray31[local240], 0);
				if (local442 != null) {
					@Pc(449) Class8_Sub9_Sub1 local449 = local442.method8221().method1674(Static405.aClass116_2);
					@Pc(457) Class8_Sub16_Sub3 local457 = Static651.method6782(local449, local217, local165 << 6, local171);
					local457.method6773(0);
					Static15.aClass8_Sub16_Sub5_1.method7442(local457);
					arg0.anInt1046 = arg0.anInt1058 + (int) (Math.random() * (double) (arg0.anInt1050 - arg0.anInt1058));
					arg0.aClass8_Sub16_Sub3_1 = local457;
					return;
				}
				return;
			}
			if (arg0.aClass8_Sub13_2 == null) {
				local240 = (int) ((double) arg0.anIntArray31.length * Math.random());
				arg0.aClass8_Sub13_2 = Static79.method2064(Static398.aClass237_105, arg0.anIntArray31[local240]);
			}
			if (arg0.aClass8_Sub13_2 != null) {
				if (arg0.aClass8_Sub9_Sub1_2 == null) {
					arg0.aClass8_Sub9_Sub1_2 = arg0.aClass8_Sub13_2.method2074(new int[] { 22050 });
				}
				if (arg0.aClass8_Sub9_Sub1_2 != null) {
					local372 = Static651.method6782(arg0.aClass8_Sub9_Sub1_2, local217, local165 << 6, local171);
					local372.method6773(0);
					Static15.aClass8_Sub16_Sub5_1.method7442(local372);
					arg0.aClass8_Sub16_Sub3_1 = local372;
					arg0.anInt1046 = (int) (Math.random() * (double) (arg0.anInt1050 - arg0.anInt1058)) + arg0.anInt1058;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILclient!ha;IIIIIII[[[BII)V")
	public static void method7368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg10 == 0 || arg7 == 0) {
			return;
		}
		if (arg10 == 9) {
			arg10 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg10 == 10) {
			arg8 = arg8 + 3 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 11) {
			arg10 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		arg2.Q(arg5, arg6, arg1, arg0, arg3, arg11, arg9[arg10 - 1][arg8], arg7, arg4);
	}
}
