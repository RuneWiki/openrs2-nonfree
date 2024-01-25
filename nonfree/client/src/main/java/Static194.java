import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
	public static int anInt3685 = 0;

	@OriginalMember(owner = "client!jq", name = "T", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_164 = new Class22(67, 10);

	@OriginalMember(owner = "client!jq", name = "Y", descriptor = "I")
	public static int anInt3688 = 0;

	@OriginalMember(owner = "client!jq", name = "gb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public static void method3044() {
		@Pc(16) int local16 = Static34.aByteArrayArray1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (Static34.aByteArrayArray1[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static73.anInt1520; local28++) {
					if (Static308.anIntArray372[local18] == Static191.anIntArray181[local28]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static191.anIntArray181[Static73.anInt1520] = Static308.anIntArray372[local18];
					local26 = Static73.anInt1520++;
				}
				@Pc(67) Class4_Sub12 local67 = new Class4_Sub12(Static34.aByteArrayArray1[local18]);
				@Pc(69) int local69 = 0;
				while (local67.anInt2997 < Static34.aByteArrayArray1[local18].length && local69 < 511 && Static12.anInt163 < 1023) {
					@Pc(90) int local90 = local26 | local69++ << 6;
					@Pc(94) int local94 = local67.method2536();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(121) int local121 = (Static308.anIntArray372[local18] >> 8) * 64 + local104 - Static180.anInt3453;
					@Pc(135) int local135 = (Static308.anIntArray372[local18] & 0xFF) * 64 + local108 - Static86.anInt1771;
					@Pc(142) Class264 local142 = Static329.aClass240_1.method5229(local67.method2536());
					if (Static143.aClass16_Sub1_Sub5_Sub2Array1[local90] == null && (local142.aByte99 & 0x1) > 0 && local98 == Static317.anInt5523 && local121 >= 0 && local121 + local142.anInt7201 < Static326.anInt5666 && local135 >= 0 && Static283.anInt5187 > local142.anInt7201 + local135) {
						Static143.aClass16_Sub1_Sub5_Sub2Array1[local90] = new Class16_Sub1_Sub5_Sub2();
						Static143.aClass16_Sub1_Sub5_Sub2Array1[local90].anInt6037 = local90;
						@Pc(188) Class16_Sub1_Sub5_Sub2 local188 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local90];
						Static342.anIntArray412[Static12.anInt163++] = local90;
						local188.anInt6015 = Static24.anInt5323;
						local188.method4766(local142);
						local188.method4754(local188.aClass264_1.anInt7201);
						local188.anInt6080 = local188.aClass264_1.anInt7221 << 3;
						if (local188.anInt6080 == 0) {
							local188.method4745(0);
						} else {
							local188.method4745((local188.aClass264_1.aByte101 + 4 & 0x5E600007) << 11);
						}
						local188.method4760(local98, local121, local188.method4751(), true, local135);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class7 local13 = local7.aClass7_3; local13 != null; local13 = local13.aClass7_1) {
			@Pc(17) Class16_Sub1 local17 = local13.aClass16_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort94 == arg1 && local17.aShort96 == arg2) {
				Static190.method2978(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
	public static int method3048() {
		if ((double) Static148.aFloat179 == 3.0D) {
			return 37;
		} else if ((double) Static148.aFloat179 == 4.0D) {
			return 50;
		} else if ((double) Static148.aFloat179 == 6.0D) {
			return 75;
		} else if ((double) Static148.aFloat179 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(JB)V")
	public static void method3052(@OriginalArg(0) long arg0) {
		@Pc(12) int local12 = Static428.anInt7059;
		@Pc(14) int local14 = Static452.anInt7360;
		@Pc(26) int local26;
		@Pc(34) int local34;
		if (Static394.anInt6578 != local12) {
			local26 = local12 - Static394.anInt6578;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 > 0) {
				if (local34 == 0) {
					local34 = 1;
				} else if (local26 < local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = -1;
			} else if (local26 > local34) {
				local34 = local26;
			}
			Static394.anInt6578 += local34;
		}
		if (Static325.anInt5636 != local14) {
			local26 = local14 - Static325.anInt5636;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local26 > local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local26 < local34) {
				local34 = local26;
			}
			Static325.anInt5636 += local34;
		}
		if (!Static323.aClass50_Sub1_1.aBoolean303) {
			Static368.aFloat192 += Static380.aFloat195 * (float) arg0 / 40.0F * 8.0F;
			Static164.aFloat142 += (float) arg0 * Static50.aFloat28 / 40.0F * 8.0F;
		}
		Static269.method3855();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BII)I")
	public static int method3056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static104.method1972(4, arg1 + 91923, arg0 + 45365) + (Static104.method1972(2, arg1 + 37821, arg0 + 10294) + -128 >> 1) + (Static104.method1972(1, arg1, arg0) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}
}
