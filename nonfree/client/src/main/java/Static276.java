import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!lc;")
	public static Class98 aClass98_162;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "J")
	public static long aLong184;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "Lclient!cc;")
	public static Class22 aClass22_20;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
	public static int[] anIntArray455 = new int[100];

	@OriginalMember(owner = "client!v", name = "f", descriptor = "I")
	public static int anInt5152 = 0;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!ii;")
	public static Class69 aClass69_13 = new Class69(64);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	public static int method4104(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method4105() {
		for (@Pc(3) int local3 = 0; local3 < Static68.anInt1262; local3++) {
			@Pc(22) int local22 = Static10.anIntArray20[local3];
			@Pc(26) Class12_Sub3_Sub1 local26 = Static100.aClass12_Sub3_Sub1Array1[local22];
			if (local26 != null) {
				Static197.method3084(local26.aClass175_1.anInt5217, local26);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method4106() {
		aClass69_13 = null;
		anIntArray455 = null;
		aClass22_20 = null;
		aClass98_162 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZBZ)V")
	public static void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(3) int local3;
		@Pc(16) Class12_Sub3_Sub1 local16;
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(151) int local151;
		@Pc(171) int local171;
		@Pc(176) int local176;
		@Pc(185) int local185;
		for (local3 = 0; local3 < Static68.anInt1262; local3++) {
			local16 = Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local3]];
			if (local16 != null && local16.method3374() && local16.aClass175_1.method4128()) {
				@Pc(32) int local32 = local16.method3375();
				if (arg2) {
					if (!local16.aClass175_1.aBoolean344) {
						continue;
					}
				} else if (arg1 != local16.aClass175_1.aBoolean342 || arg0 != 0 && arg0 != local32) {
					continue;
				}
				@Pc(130) int local130;
				if (local32 == 1) {
					if ((local16.anInt4141 & 0x7F) == 64 && (local16.anInt4113 & 0x7F) == 64) {
						local121 = local16.anInt4113 >> 7;
						local130 = local16.anInt4141 >> 7;
						if (local130 >= 0 && local130 < 104 && local121 >= 0 && local121 < 104) {
							local185 = Static267.anIntArrayArray28[local130][local121]++;
						}
					}
				} else if (((local32 & 0x1) != 0 || (local16.anInt4141 & 0x7F) == 0 && (local16.anInt4113 & 0x7F) == 0) && ((local32 & 0x1) != 1 || (local16.anInt4141 & 0x7F) == 64 && (local16.anInt4113 & 0x7F) == 64)) {
					local121 = local16.anInt4113 - local32 * 64 >> 7;
					local130 = local16.anInt4141 - local32 * 64 >> 7;
					local136 = local16.method3375() + local130;
					if (local136 > 104) {
						local136 = 104;
					}
					local151 = local121 + local16.method3375();
					if (local121 < 0) {
						local121 = 0;
					}
					if (local151 > 104) {
						local151 = 104;
					}
					if (local130 < 0) {
						local130 = 0;
					}
					for (local171 = local130; local171 < local136; local171++) {
						for (local176 = local121; local176 < local151; local176++) {
							local185 = Static267.anIntArrayArray28[local171][local176]++;
						}
					}
				}
			}
		}
		label211: for (local3 = 0; local3 < Static68.anInt1262; local3++) {
			@Pc(266) long local266 = (long) Static10.anIntArray20[local3] << 32 | 0x20000000L;
			local16 = Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local3]];
			if (local16 != null && local16.method3374() && local16.aClass175_1.method4128()) {
				local121 = local16.method3375();
				if (arg2) {
					if (!local16.aClass175_1.aBoolean344) {
						continue;
					}
				} else if (arg1 != local16.aClass175_1.aBoolean342 || arg0 != 0 && arg0 != local121) {
					continue;
				}
				local16.aBoolean275 = true;
				if (local121 == 1) {
					if ((local16.anInt4141 & 0x7F) == 64 && (local16.anInt4113 & 0x7F) == 64) {
						local136 = local16.anInt4141 >> 7;
						local151 = local16.anInt4113 >> 7;
						if (local136 < 0 || local136 >= 104 || local151 < 0 || local151 >= 104) {
							continue;
						}
						if (Static267.anIntArrayArray28[local136][local151] > 1) {
							local185 = Static267.anIntArrayArray28[local136][local151]--;
							continue;
						}
					}
				} else if ((local121 & 0x1) == 0 && (local16.anInt4141 & 0x7F) == 0 && (local16.anInt4113 & 0x7F) == 0 || (local121 & 0x1) == 1 && (local16.anInt4141 & 0x7F) == 64 && (local16.anInt4113 & 0x7F) == 64) {
					local151 = local16.anInt4113 - local121 * 64 >> 7;
					local136 = local16.anInt4141 - local121 * 64 >> 7;
					local171 = local136 + local121;
					if (local171 > 104) {
						local171 = 104;
					}
					local176 = local151 + local121;
					@Pc(457) boolean local457 = true;
					if (local151 < 0) {
						local151 = 0;
					}
					if (local136 < 0) {
						local136 = 0;
					}
					if (local176 > 104) {
						local176 = 104;
					}
					@Pc(479) int local479;
					@Pc(488) int local488;
					for (local479 = local136; local479 < local171; local479++) {
						for (local488 = local151; local488 < local176; local488++) {
							if (Static267.anIntArrayArray28[local479][local488] <= 1) {
								local457 = false;
								break;
							}
						}
					}
					if (local457) {
						local479 = local136;
						while (true) {
							if (local479 >= local171) {
								continue label211;
							}
							for (local488 = local151; local488 < local176; local488++) {
								local185 = Static267.anIntArrayArray28[local479][local488]--;
							}
							local479++;
						}
					}
				}
				local16.aBoolean275 = false;
				if (!local16.aClass175_1.aBoolean345) {
					local266 |= Long.MIN_VALUE;
				}
				local16.anInt4135 = Static96.method1559(Static210.anInt4103, local16.anInt4113, local16.anInt4141);
				Static258.method3892(Static210.anInt4103, local16.anInt4141, local16.anInt4113, local16.anInt4135, (local121 - 1) * 64 + 60, local16, local16.anInt4121, local266, local16.aBoolean277);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lclient!ej;")
	public static Class43 method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class43 local14 = local7.aClass43_1;
			local7.aClass43_1 = null;
			return local14;
		}
	}
}
