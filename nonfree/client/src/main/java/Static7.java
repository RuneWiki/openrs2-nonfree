import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	public static int anInt138 = 2;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([FIIBIIIIFIF[FFI)V")
	public static void method142(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) float arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg8 - arg4;
		@Pc(18) int local18 = arg1 - arg3;
		@Pc(22) int local22 = arg5 - arg2;
		@Pc(43) float local43 = arg10[2] * (float) local5 + (float) local22 * arg10[0] + arg10[1] * (float) local18;
		@Pc(64) float local64 = arg10[3] * (float) local22 + (float) local18 * arg10[4] + arg10[5] * (float) local5;
		@Pc(85) float local85 = arg10[7] * (float) local18 + arg10[6] * (float) local22 + arg10[8] * (float) local5;
		@Pc(103) float local103;
		@Pc(97) float local97;
		if (arg6 == 0) {
			local97 = arg7 + 0.5F - local85;
			local103 = arg9 + local43 + 0.5F;
		} else if (arg6 == 1) {
			local103 = arg9 + local43 + 0.5F;
			local97 = arg7 + local85 + 0.5F;
		} else if (arg6 == 2) {
			local97 = arg11 + 0.5F - local64;
			local103 = arg9 + 0.5F - local43;
		} else if (arg6 == 3) {
			local103 = local43 + arg9 + 0.5F;
			local97 = arg11 + 0.5F - local64;
		} else if (arg6 == 4) {
			local97 = arg11 + 0.5F - local64;
			local103 = local85 + arg7 + 0.5F;
		} else {
			local103 = arg7 + 0.5F - local85;
			local97 = arg11 + 0.5F - local64;
		}
		@Pc(200) float local200;
		if (arg12 == 1) {
			local200 = local103;
			local103 = -local97;
			local97 = local200;
		} else if (arg12 == 2) {
			local103 = -local103;
			local97 = -local97;
		} else if (arg12 == 3) {
			local200 = local103;
			local103 = local97;
			local97 = -local200;
		}
		arg0[1] = local97;
		arg0[0] = local103;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	public static void method143() {
		if (Static433.anInt7845 == 0 || Static155.aClass50_4 == null) {
			return;
		}
		Static565.aClass100_15.K(Static473.anIntArray522);
		for (@Pc(12) int local12 = 0; local12 < Static83.anIntArray115.length; local12++) {
			Static565.aClass100_15.method8782(-256, Static473.anIntArray522[3] - Static473.anIntArray522[1], Static473.anIntArray522[1], Static83.anIntArray115[local12] + Static332.anIntArray561[local12]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static339.anInt9925; local41++) {
			@Pc(46) Class226 local46 = Static147.aClass226Array2[local41];
			Static565.aClass100_15.H(local46.anIntArray425[0], local46.anIntArray424[0], local46.anIntArray423[0], Static428.anIntArray476);
			Static565.aClass100_15.H(local46.anIntArray425[1], local46.anIntArray424[1], local46.anIntArray423[1], Static422.anIntArray470);
			Static565.aClass100_15.H(local46.anIntArray425[2], local46.anIntArray424[2], local46.anIntArray423[2], Static431.anIntArray480);
			Static565.aClass100_15.H(local46.anIntArray425[3], local46.anIntArray424[3], local46.anIntArray423[3], Static620.anIntArray648);
			if (Static428.anIntArray476[2] != -1 && Static422.anIntArray470[2] != -1 && Static431.anIntArray480[2] != -1 && Static620.anIntArray648[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte79 == 4) {
					local128 = -16776961;
				}
				Static565.aClass100_15.method8832(Static428.anIntArray476[1], Static422.anIntArray470[1], Static428.anIntArray476[0], local128, Static422.anIntArray470[0]);
				Static565.aClass100_15.method8832(Static422.anIntArray470[1], Static431.anIntArray480[1], Static422.anIntArray470[0], local128, Static431.anIntArray480[0]);
				Static565.aClass100_15.method8832(Static431.anIntArray480[1], Static620.anIntArray648[1], Static431.anIntArray480[0], local128, Static620.anIntArray648[0]);
				Static565.aClass100_15.method8832(Static620.anIntArray648[1], Static428.anIntArray476[1], Static620.anIntArray648[0], local128, Static428.anIntArray476[0]);
				Static565.aClass100_15.method8832(Static428.anIntArray476[1], Static431.anIntArray480[1], Static428.anIntArray476[0], local128, Static431.anIntArray480[0]);
			}
		}
		Static155.aClass50_4.method5736(-16777216, 10, "Dynamic: " + Static205.anInt4091 + "/" + 5000, 75, -256);
		Static155.aClass50_4.method5736(-16777216, 10, "Total Opaque Onscreen: " + Static242.anInt4833 + "/" + 10000, 90, -256);
		Static155.aClass50_4.method5736(-16777216, 10, "Total Trans Onscreen: " + Static189.anInt3797 + "/" + 5000, 105, -256);
		Static155.aClass50_4.method5736(-16777216, 10, "Occluders: " + (Static57.anInt1238 + Static496.anInt8600) + " Active: " + Static339.anInt9925, 120, -256);
		Static155.aClass50_4.method5736(-16777216, 10, "Occluded: Ground:" + Static565.anInt9568 + " Walls: " + Static404.anInt7516 + " CPs: " + Static2.anInt10 + " Pixels: " + Static113.anInt2246, 135, -256);
		Static155.aClass50_4.method5736(-16777216, 10, "Occlude Calc Took: " + Static522.aLong237 / 1000L + "us", 150, -256);
		if (Static433.anInt7845 != 2 || Static284.anIntArray483 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static284.anIntArray483.length; local355++) {
			@Pc(361) float local361 = (float) Static284.anIntArray483[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static284.anIntArray483[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class32 local410 = Static565.aClass100_15.method8847(Static441.anInt7959, Static497.anInt8615, Static284.anIntArray483, Static497.anInt8615);
		local410.method5088(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)Z")
	public static boolean method145() {
		return Static602.anInt10026 == 0 ? Static224.aClass6_Sub3_Sub4_1.method4717() : true;
	}
}
