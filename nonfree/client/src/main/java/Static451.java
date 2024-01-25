import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	public static int anInt7919;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
	public static int anInt7927 = 2;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method6544() {
		if (Static520.anIntArray666 != null) {
			return;
		}
		Static520.anIntArray666 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
			@Pc(38) float local38 = ((float) (local24 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local24 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(56) float local56 = (float) local49 / 128.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(66) float local66 = local38 / 60.0F;
				@Pc(69) int local69 = (int) local66;
				@Pc(73) int local73 = local69 % 6;
				@Pc(79) float local79 = (float) -local69 + local66;
				@Pc(86) float local86 = (1.0F - local47) * local56;
				@Pc(95) float local95 = (1.0F - local79 * local47) * local56;
				@Pc(107) float local107 = (1.0F - local47 * (1.0F - local79)) * local56;
				if (local73 == 0) {
					local58 = local56;
					local60 = local107;
					local62 = local86;
				} else if (local73 == 1) {
					local62 = local86;
					local60 = local56;
					local58 = local95;
				} else if (local73 == 2) {
					local58 = local86;
					local60 = local56;
					local62 = local107;
				} else if (local73 == 3) {
					local60 = local95;
					local58 = local86;
					local62 = local56;
				} else if (local73 == 4) {
					local58 = local107;
					local60 = local86;
					local62 = local56;
				} else if (local73 == 5) {
					local58 = local56;
					local62 = local95;
					local60 = local86;
				}
				local58 = (float) Math.pow((double) local58, local20);
				local60 = (float) Math.pow((double) local60, local20);
				local62 = (float) Math.pow((double) local62, local20);
				@Pc(200) int local200 = (int) (local58 * 256.0F);
				@Pc(205) int local205 = (int) (local60 * 256.0F);
				@Pc(210) int local210 = (int) (local62 * 256.0F);
				@Pc(224) int local224 = (local200 << 16) - (-(local205 << 8) - local210) - 16777216;
				Static520.anIntArray666[local22++] = local224;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IJ)V")
	public static void method6546(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 + Static40.anInt1717;
		@Pc(17) int local17 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002 + Static121.anInt2453;
		if (Static569.anInt9811 - local11 < -2000 || Static569.anInt9811 - local11 > 2000 || Static59.anInt1432 - local17 < -2000 || Static59.anInt1432 - local17 > 2000) {
			Static569.anInt9811 = local11;
			Static59.anInt1432 = local17;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		if (local11 != Static569.anInt9811) {
			local54 = local11 - Static569.anInt9811;
			local62 = (int) (arg0 * (long) local54 / 320L);
			if (local54 <= 0) {
				if (local62 == 0) {
					local62 = -1;
				} else if (local62 < local54) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = 1;
			} else if (local62 > local54) {
				local62 = local54;
			}
			Static569.anInt9811 += local62;
		}
		Static543.aFloat228 += Static117.aFloat269 * (float) arg0 / 6.0F;
		Static2.aFloat1 += (float) arg0 * Static456.aFloat185 / 6.0F;
		if (Static59.anInt1432 != local17) {
			local54 = local17 - Static59.anInt1432;
			local62 = (int) (arg0 * (long) local54 / 320L);
			if (local54 <= 0) {
				if (local62 == 0) {
					local62 = -1;
				} else if (local54 > local62) {
					local62 = local54;
				}
			} else if (local62 == 0) {
				local62 = 1;
			} else if (local62 > local54) {
				local62 = local54;
			}
			Static59.anInt1432 += local62;
		}
		Static635.method8862();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method6547() {
		if (Static610.aClass304ArrayArray1 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static610.aClass304ArrayArray1.length; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static610.aClass304ArrayArray1[local14].length; local18++) {
				Static610.aClass304ArrayArray1[local14][local18] = Static543.aClass304_2;
			}
		}
	}
}
