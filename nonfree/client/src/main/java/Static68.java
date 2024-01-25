import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
	public static boolean aBoolean298;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString179 = " from your ignore list first.";

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
	public static int anInt4185 = 0;

	@OriginalMember(owner = "client!ec", name = "pb", descriptor = "[S")
	public static final short[] aShortArray75 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!rr;Lclient!ja;Lclient!qa;)V")
	public static void method3981(@OriginalArg(1) Class6_Sub35 arg0, @OriginalArg(2) Class81 arg1, @OriginalArg(3) Class165 arg2) {
		@Pc(10) Class40 local10 = arg2.method4321(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5071();
		if (local10.method5075() > local16) {
			local16 = local10.method5075();
		}
		@Pc(33) int local33 = arg0.anInt5322;
		@Pc(36) int local36 = arg0.anInt5323;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(58) int local58;
		@Pc(85) int local85;
		if (arg2.aString196 != null) {
			local38 = Static139.aClass26_5.method500(Static73.aStringArray7, null, null, arg2.aString196);
			for (local58 = 0; local58 < local38; local58++) {
				@Pc(64) String local64 = Static73.aStringArray7[local58];
				if (local38 - 1 > local58) {
					local64 = local64.substring(0, local64.length() - 4);
				}
				local85 = Static151.aClass49_4.method972(local64);
				if (local40 < local85) {
					local40 = local85;
				}
			}
			local42 = Static151.aClass49_4.method973() * local38 + Static151.aClass49_4.method977() / 2;
		}
		local58 = local16 / 2 + arg0.anInt5322;
		if (local16 + Static307.anInt1196 > local33) {
			local58 = local16 / 2 + Static307.anInt1196 + local40 / 2 + 15;
			local33 = Static307.anInt1196;
		} else if (Static307.anInt1199 - local16 < local33) {
			local33 = Static307.anInt1199 - local16;
			local58 = Static307.anInt1199 - local40 / 2 - local16 / 2 - 5 - 10;
		}
		@Pc(178) int local178 = arg0.anInt5323;
		if (local36 < Static307.anInt1194 + local16) {
			local178 = Static307.anInt1194 + local16 / 2 + 10;
			local36 = Static307.anInt1194;
		} else if (Static307.anInt1203 - local16 < local36) {
			local36 = Static307.anInt1203 - local16;
			local178 = Static307.anInt1203 - local42 - local16 / 2 - 10;
		}
		local85 = (int) (Math.atan2((double) (local33 - arg0.anInt5322), (double) (local36 - arg0.anInt5323)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5070((float) local16 / 2.0F + (float) local33, (float) local16 / 2.0F + (float) local36, 4096, local85);
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		local16 >>= 0x1;
		if (arg2.aString196 != null) {
			local259 = local58 - local40 / 2 - 5;
			local261 = local178;
			local263 = local40 + local259 + 10;
			local265 = Static151.aClass49_4.method973() * local38 + local178 + 3;
			if (arg2.anInt4670 != 0) {
				arg1.method3017(local265 - local178, arg2.anInt4670, local263 - local259, local259, local178);
			}
			if (arg2.anInt4669 != 0) {
				arg1.method3002(local178, arg2.anInt4669, local259, local263 - local259, local265 + -local178);
			}
			for (@Pc(339) int local339 = 0; local339 < local38; local339++) {
				@Pc(345) String local345 = Static73.aStringArray7[local339];
				if (local339 < local38 - 1) {
					local345 = local345.substring(0, local345.length() - 4);
				}
				Static151.aClass49_4.method971(arg1, local345, local58, local178, arg2.anInt4698);
				local178 += Static151.aClass49_4.method973();
			}
		}
		if ((Static7.anInt149 <= local33 - local16 || Static7.anInt149 >= local16 + local33 || local36 - local16 >= Static79.anInt1449 || local16 + local36 <= Static79.anInt1449) && (local259 >= Static7.anInt149 || Static7.anInt149 >= local263 || local261 >= Static79.anInt1449 || local265 <= Static79.anInt1449)) {
			return;
		}
		if (arg2.aStringArray31[4] != null) {
			Static52.method870(0, arg2.aStringArray31[4], 1006, 0, -1, arg2.aString197, (long) arg0.anInt5312);
		}
		if (arg2.aStringArray31[3] != null) {
			Static52.method870(0, arg2.aStringArray31[3], 1007, 0, -1, arg2.aString197, (long) arg0.anInt5312);
		}
		if (arg2.aStringArray31[2] != null) {
			Static52.method870(0, arg2.aStringArray31[2], 1011, 0, -1, arg2.aString197, (long) arg0.anInt5312);
		}
		if (arg2.aStringArray31[1] != null) {
			Static52.method870(0, arg2.aStringArray31[1], 1009, 0, -1, arg2.aString197, (long) arg0.anInt5312);
		}
		if (arg2.aStringArray31[0] != null) {
			Static52.method870(0, arg2.aStringArray31[0], 1012, 0, -1, arg2.aString197, (long) arg0.anInt5312);
			return;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	public static void method4000() {
		Static235.anInt4393 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static192.anInt3644; local3++) {
			@Pc(8) Class151 local8 = Static52.aClass151Array1[local3];
			@Pc(12) int local12;
			if (Static12.anIntArray21 != null) {
				for (local12 = 0; local12 < Static12.anIntArray21.length; local12++) {
					if (Static12.anIntArray21[local12] != -1000000 && (local8.anInt4113 <= Static12.anIntArray21[local12] || local8.anInt4118 <= Static12.anIntArray21[local12]) && (local8.anInt4117 <= Static110.anIntArray276[local12] || local8.anInt4112 <= Static110.anIntArray276[local12]) && (local8.anInt4117 >= Static183.anIntArray399[local12] || local8.anInt4112 >= Static183.anIntArray399[local12]) && (local8.anInt4103 <= Static71.anIntArray146[local12] || local8.anInt4116 <= Static71.anIntArray146[local12]) && (local8.anInt4103 >= Static230.anIntArray486[local12] || local8.anInt4116 >= Static230.anIntArray486[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt4122 == 1) {
				local12 = local8.anInt4102 + Static30.anInt573 - Static339.anInt6187;
				if (local12 >= 0 && local12 <= Static30.anInt573 + Static30.anInt573) {
					local110 = local8.anInt4120 + Static30.anInt573 - Static8.anInt3154;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4109 + Static30.anInt573 - Static8.anInt3154;
					if (local121 > Static30.anInt573 + Static30.anInt573) {
						local121 = Static30.anInt573 + Static30.anInt573;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static258.aBooleanArrayArray5[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static209.anInt3813 - local8.anInt4117;
						if (local153 > 32) {
							local8.anInt4105 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4105 = 2;
							local153 = -local153;
						}
						local8.anInt4110 = (local8.anInt4103 - Static256.anInt4741 << 8) / local153;
						local8.anInt4124 = (local8.anInt4116 - Static256.anInt4741 << 8) / local153;
						local8.anInt4123 = (local8.anInt4113 - Static81.anInt1473 << 8) / local153;
						local8.anInt4111 = (local8.anInt4118 - Static81.anInt1473 << 8) / local153;
						Static351.aClass151Array2[Static235.anInt4393++] = local8;
					}
				}
			} else if (local8.anInt4122 == 2) {
				local12 = local8.anInt4120 + Static30.anInt573 - Static8.anInt3154;
				if (local12 >= 0 && local12 <= Static30.anInt573 + Static30.anInt573) {
					local110 = local8.anInt4102 + Static30.anInt573 - Static339.anInt6187;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4121 + Static30.anInt573 - Static339.anInt6187;
					if (local121 > Static30.anInt573 + Static30.anInt573) {
						local121 = Static30.anInt573 + Static30.anInt573;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static258.aBooleanArrayArray5[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static256.anInt4741 - local8.anInt4103;
						if (local153 > 32) {
							local8.anInt4105 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4105 = 4;
							local153 = -local153;
						}
						local8.anInt4106 = (local8.anInt4117 - Static209.anInt3813 << 8) / local153;
						local8.anInt4119 = (local8.anInt4112 - Static209.anInt3813 << 8) / local153;
						local8.anInt4123 = (local8.anInt4113 - Static81.anInt1473 << 8) / local153;
						local8.anInt4111 = (local8.anInt4118 - Static81.anInt1473 << 8) / local153;
						Static351.aClass151Array2[Static235.anInt4393++] = local8;
					}
				}
			} else if (local8.anInt4122 == 4) {
				local12 = local8.anInt4113 - Static81.anInt1473;
				if (local12 > 128) {
					local110 = local8.anInt4120 + Static30.anInt573 - Static8.anInt3154;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4109 + Static30.anInt573 - Static8.anInt3154;
					if (local121 > Static30.anInt573 + Static30.anInt573) {
						local121 = Static30.anInt573 + Static30.anInt573;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt4102 + Static30.anInt573 - Static339.anInt6187;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt4121 + Static30.anInt573 - Static339.anInt6187;
						if (local153 > Static30.anInt573 + Static30.anInt573) {
							local153 = Static30.anInt573 + Static30.anInt573;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static258.aBooleanArrayArray5[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt4105 = 5;
							local8.anInt4106 = (local8.anInt4117 - Static209.anInt3813 << 8) / local12;
							local8.anInt4119 = (local8.anInt4112 - Static209.anInt3813 << 8) / local12;
							local8.anInt4110 = (local8.anInt4103 - Static256.anInt4741 << 8) / local12;
							local8.anInt4124 = (local8.anInt4116 - Static256.anInt4741 << 8) / local12;
							Static351.aClass151Array2[Static235.anInt4393++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Lclient!ip;")
	public static Class44_Sub3 method4012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass44_Sub3_1 == null ? null : local7.aClass44_Sub3_1;
	}

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "(II)V")
	public static void method4018() {
		@Pc(4) Class70 local4 = Static69.aClass70_17;
		synchronized (Static69.aClass70_17) {
			Static69.aClass70_17.method1397(5);
		}
	}
}
