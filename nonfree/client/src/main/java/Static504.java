import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!u;")
	public static Class335 aClass335_6;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_31 = new Class89(13, 0, 1, 0);

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[Lclient!cq;")
	public static final Class6_Sub9[] aClass6_Sub9Array5 = new Class6_Sub9[300];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lclient!jo;")
	public static Class6_Sub3_Sub4 method8521() {
		return Static224.aClass6_Sub3_Sub4_1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!jo;I)Lclient!jo;")
	public static Class6_Sub3_Sub4 method8522(@OriginalArg(0) Class6_Sub3_Sub4 arg0) {
		@Pc(22) Class6_Sub3_Sub4 local22 = arg0 == null ? new Class6_Sub3_Sub4() : new Class6_Sub3_Sub4(arg0);
		local22.method4703();
		return local22;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z")
	public static boolean method8524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static249.method4328(arg0, arg1) | (arg1 & 0x60000) != 0 || Static216.method3668(arg1, arg0) || Static191.method3394(arg0, arg1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!sca;Lclient!ha;IIIILclient!aa;I)V")
	public static void method8533(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Class105 local16 = Static184.aClass337_2.method8119(arg0);
		if (local16 == null || !local16.aBoolean245 || !local16.method3042(Static279.aClass294_1)) {
			return;
		}
		@Pc(36) int local36;
		if (local16.anIntArray205 != null) {
			@Pc(34) int[] local34 = new int[local16.anIntArray205.length];
			@Pc(50) int local50;
			@Pc(61) int local61;
			@Pc(65) int local65;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static334.anInt6354 == 4) {
					local50 = (int) Static284.aFloat164 & 0x3FFF;
				} else {
					local50 = Static298.anInt6417 + (int) Static284.aFloat164 & 0x3FFF;
				}
				local61 = Class100_Sub1.anIntArray428[local50];
				local65 = Class100_Sub1.anIntArray429[local50];
				if (Static334.anInt6354 != 4) {
					local65 = local65 * 256 / (Static620.anInt10702 + 256);
					local61 = local61 * 256 / (Static620.anInt10702 + 256);
				}
				local34[local36 * 2] = arg4 + arg1.anInt8801 / 2 + (local65 * (arg5 + local16.anIntArray205[local36 * 2] * 4) + local61 * (arg3 + local16.anIntArray205[local36 * 2 + 1] * 4) >> 14);
				local34[local36 * 2 + 1] = arg1.anInt8814 / 2 + arg7 - (local65 * (arg3 + local16.anIntArray205[local36 * 2 + 1] * 4) - (local16.anIntArray205[local36 * 2] * 4 + arg5) * local61 >> 14);
			}
			Static468.method7102(arg2, local34, local16.anInt3382, arg1.anIntArray550, arg1.anIntArray545);
			if (local16.anInt3381 <= 0) {
				for (local50 = 0; local50 < local34.length / 2 - 1; local50++) {
					arg2.method8774(local34[local50 * 2], local34[local50 * 2 + 1], local34[local50 * 2 + 2], local34[(local50 + 1) * 2 + 1], local16.anIntArray206[local16.aByteArray46[local50] & 0xFF], arg6, arg4, arg7);
				}
				arg2.method8774(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local16.anIntArray206[local16.aByteArray46[local16.aByteArray46.length - 1] & 0xFF], arg6, arg4, arg7);
			} else {
				@Pc(323) int local323;
				@Pc(333) int local333;
				@Pc(342) int local342;
				@Pc(344) int local344;
				for (local50 = 0; local50 < local34.length / 2 - 1; local50++) {
					local61 = local34[local50 * 2];
					local65 = local34[local50 * 2 + 1];
					local323 = local34[(local50 + 1) * 2];
					local333 = local34[(local50 + 1) * 2 + 1];
					if (local61 > local323) {
						local342 = local61;
						local344 = local65;
						local61 = local323;
						local65 = local333;
						local323 = local342;
						local333 = local344;
					} else if (local323 == local61 && local65 > local333) {
						local342 = local65;
						local65 = local333;
						local333 = local342;
					}
					arg2.method8791(local61, local65, local323, local333, local16.anIntArray206[local16.aByteArray46[local50] & 0xFF], arg6, arg4, arg7, local16.anInt3381, local16.anInt3386, local16.anInt3406);
				}
				local61 = local34[local34.length - 2];
				local65 = local34[local34.length - 1];
				local323 = local34[0];
				local333 = local34[1];
				if (local323 < local61) {
					local342 = local61;
					local344 = local65;
					local61 = local323;
					local65 = local333;
					local323 = local342;
					local333 = local344;
				} else if (local61 == local323 && local65 > local333) {
					local342 = local65;
					local65 = local333;
					local333 = local342;
				}
				arg2.method8791(local61, local65, local323, local333, local16.anIntArray206[local16.aByteArray46[local16.aByteArray46.length - 1] & 0xFF], arg6, arg4, arg7, local16.anInt3381, local16.anInt3386, local16.anInt3406);
			}
		}
		@Pc(490) Class32 local490 = null;
		if (local16.anInt3413 != -1) {
			local490 = local16.method3034(arg2, false);
			if (local490 != null) {
				Static512.method7605(arg6, arg3, arg7, arg1, local490, arg4, arg5);
			}
		}
		if (local16.aString35 == null) {
			return;
		}
		local36 = 0;
		if (local490 != null) {
			local36 = local490.method5077();
		}
		@Pc(523) Class50 local523 = Static631.aClass50_12;
		@Pc(525) Class133 local525 = Static545.aClass133_42;
		if (local16.anInt3418 == 1) {
			local525 = Static176.aClass133_45;
			local523 = Static43.aClass50_2;
		}
		if (local16.anInt3418 == 2) {
			local525 = Static31.aClass133_3;
			local523 = Static173.aClass50_5;
		}
		Static135.method2191(arg1, local16.anInt3404, arg6, arg7, arg5, arg3, local16.aString35, local523, arg4, local525, local36);
		return;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(FFFFFIFI)F")
	public static float method8534(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(15) float local15 = 0.0F;
		@Pc(19) float local19 = arg2 - arg3;
		@Pc(23) float local23 = arg1 - arg6;
		@Pc(28) float local28 = arg4 - arg0;
		@Pc(30) float local30 = 0.0F;
		@Pc(32) float local32 = 0.0F;
		@Pc(34) float local34 = 0.0F;
		while (local15 < 1.1F) {
			@Pc(42) float local42 = local15 * local19 + arg3;
			@Pc(48) float local48 = arg6 + local15 * local23;
			@Pc(54) float local54 = arg0 + local28 * local15;
			@Pc(59) int local59 = (int) local42 >> 9;
			@Pc(64) int local64 = (int) local54 >> 9;
			if (local59 > 0 && local64 > 0 && local59 < Static442.anInt7975 && local64 < Static284.anInt7916) {
				@Pc(87) int local87 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131;
				if (local87 < 3 && (Static197.aByteArrayArrayArray24[1][local59][local64] & 0x2) != 0) {
					local87++;
				}
				@Pc(113) int local113 = Static228.aClass199Array2[local87].method8531((int) local54, (int) local42);
				if (local48 > (float) local113) {
					if (arg5 >= 2) {
						return method8534(local34, local48, local42, local30, local54, arg5 - 1, local32) * 0.1F + local15 - 0.1F;
					}
					return local15;
				}
			}
			local32 = local48;
			local30 = local42;
			local34 = local54;
			local15 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
