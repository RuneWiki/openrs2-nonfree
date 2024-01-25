import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	public static int anInt5701 = 0;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString260 = "Loading defaults - ";

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	public static int anInt5708 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!mb;III)V")
	public static void method5175(@OriginalArg(0) Class132 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class74 local16 = arg0.method3534(Static289.aClass81_7);
		if (local16 == null) {
			return;
		}
		Static289.aClass81_7.method3033(arg2, arg1, arg0.anInt3507 + arg2, arg1 - -arg0.anInt3503);
		if (Static340.anInt657 >= 3) {
			Static289.aClass81_7.method3047(local16, arg2, arg1);
		} else {
			Static39.aClass40_2.method5086((float) arg2 + (float) arg0.anInt3507 / 2.0F, (float) arg1 + (float) arg0.anInt3503 / 2.0F, ((int) -Static117.aFloat58 & 0x3FFF) << 2, local16, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	public static void method5176() {
		if (Static305.anIntArray650 != null) {
			return;
		}
		Static305.anIntArray650 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(34) double local34 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(45) double local45 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(52) double local52 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(54) double local54 = local52;
			@Pc(56) double local56 = local52;
			@Pc(58) double local58 = local52;
			if (local45 != 0.0D) {
				@Pc(75) double local75;
				if (local52 < 0.5D) {
					local75 = (local45 + 1.0D) * local52;
				} else {
					local75 = local52 + local45 - local52 * local45;
				}
				@Pc(89) double local89 = local52 * 2.0D - local75;
				@Pc(93) double local93 = local34 + 0.3333333333333333D;
				if (local93 > 1.0D) {
					local93--;
				}
				@Pc(107) double local107 = local34 - 0.3333333333333333D;
				if (local93 * 6.0D < 1.0D) {
					local54 = local89 + local93 * (local75 - local89) * 6.0D;
				} else if (local93 * 2.0D < 1.0D) {
					local54 = local75;
				} else if (local93 * 3.0D < 2.0D) {
					local54 = (local75 - local89) * 6.0D * (0.6666666666666666D - local93) + local89;
				} else {
					local54 = local89;
				}
				if (local34 * 6.0D < 1.0D) {
					local56 = local89 + (local75 - local89) * 6.0D * local34;
				} else if (local34 * 2.0D < 1.0D) {
					local56 = local75;
				} else if (local34 * 3.0D < 2.0D) {
					local56 = (local75 - local89) * 6.0D * (0.6666666666666666D - local34) + local89;
				} else {
					local56 = local89;
				}
				if (local107 < 0.0D) {
					local107++;
				}
				if (local107 * 6.0D < 1.0D) {
					local58 = local89 + local107 * 6.0D * (local75 - local89);
				} else if (local107 * 2.0D < 1.0D) {
					local58 = local75;
				} else if (local107 * 3.0D < 2.0D) {
					local58 = local89 + (0.6666666666666666D - local107) * 6.0D * (local75 - local89);
				} else {
					local58 = local89;
				}
			}
			local54 = Math.pow(local54, local19);
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			@Pc(289) int local289 = (int) (local54 * 256.0D);
			@Pc(294) int local294 = (int) (local56 * 256.0D);
			@Pc(299) int local299 = (int) (local58 * 256.0D);
			@Pc(310) int local310 = (local294 << 8) + ((local289 << 16) + local299);
			Static305.anIntArray650[local21] = local310;
		}
	}
}
