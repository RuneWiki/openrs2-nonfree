import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!su", name = "m", descriptor = "Lclient!cp;")
	public static Class60 aClass60_8;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V")
	public static void method8525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static353.method6087(local7.aClass15_Sub3_Sub1_1);
		Static353.method6087(local7.aClass15_Sub3_Sub1_2);
		if (local7.aClass15_Sub3_Sub1_1 != null) {
			local7.aClass15_Sub3_Sub1_1 = null;
		}
		if (local7.aClass15_Sub3_Sub1_2 != null) {
			local7.aClass15_Sub3_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(Z)V")
	public static void method8526() {
		if (Static101.anIntArray92 != null) {
			return;
		}
		Static101.anIntArray92 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(41) double local41 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = local59 * (local52 + 1.0D);
				} else {
					local79 = local52 + local59 - local52 * local59;
				}
				@Pc(96) double local96 = local59 * 2.0D - local79;
				@Pc(100) double local100 = local41 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local41 - 0.3333333333333333D;
				if (local100 * 6.0D < 1.0D) {
					local61 = (local79 - local96) * 6.0D * local100 + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local100 * 3.0D < 2.0D) {
					local61 = (local79 - local96) * (0.6666666666666666D - local100) * 6.0D + local96;
				} else {
					local61 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = (local79 - local96) * 6.0D * local41 + local96;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = (local79 - local96) * (0.6666666666666666D - local41) * 6.0D + local96;
				} else {
					local63 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local65 = local114 * (local79 - local96) * 6.0D + local96;
				} else if (local114 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local114 * 3.0D < 2.0D) {
					local65 = local96 + (0.6666666666666666D - local114) * 6.0D * (local79 - local96);
				} else {
					local65 = local96;
				}
			}
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			local65 = Math.pow(local65, local19);
			@Pc(293) int local293 = (int) (local61 * 256.0D);
			@Pc(298) int local298 = (int) (local63 * 256.0D);
			@Pc(303) int local303 = (int) (local65 * 256.0D);
			@Pc(313) int local313 = local303 + (local298 << 8) + (local293 << 16);
			Static101.anIntArray92[local21] = local313;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static457.anInt8209 <= arg0 && arg0 <= Static407.anInt7583 && arg4 >= Static457.anInt8209 && Static407.anInt7583 >= arg4 && Static457.anInt8209 <= arg6 && Static407.anInt7583 >= arg6 && arg8 >= Static457.anInt8209 && arg8 <= Static407.anInt7583 && Static427.anInt7845 <= arg2 && arg2 <= Static631.anInt10922 && Static427.anInt7845 <= arg7 && arg7 <= Static631.anInt10922 && Static427.anInt7845 <= arg5 && Static631.anInt10922 >= arg5 && arg3 >= Static427.anInt7845 && arg3 <= Static631.anInt10922) {
			Static366.method6210(arg5, arg2, arg7, arg0, arg1, arg4, arg6, arg8, arg3);
		} else {
			Static349.method6048(arg0, arg6, arg8, arg2, arg1, arg4, arg7, arg3, arg5);
		}
	}
}
