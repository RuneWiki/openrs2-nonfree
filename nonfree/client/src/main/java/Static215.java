import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!oi", name = "J", descriptor = "Lclient!ps;")
	public static Class163 aClass163_13 = null;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V")
	public static void method3988() {
		if (Static77.anIntArray118 != null) {
			return;
		}
		Static77.anIntArray118 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(77) double local77;
				if (local57 < 0.5D) {
					local77 = (local50 + 1.0D) * local57;
				} else {
					local77 = local57 + local50 - local57 * local50;
				}
				@Pc(93) double local93 = local57 * 2.0D - local77;
				@Pc(97) double local97 = local39 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local39 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local59 = local93 + local97 * (local77 - local93) * 6.0D;
				} else if (local97 * 2.0D < 1.0D) {
					local59 = local77;
				} else if (local97 * 3.0D < 2.0D) {
					local59 = local93 + (0.6666666666666666D - local97) * 6.0D * (local77 - local93);
				} else {
					local59 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local93 + (local77 - local93) * 6.0D * local39;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local77;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (local77 - local93) * (0.6666666666666666D - local39) * 6.0D + local93;
				} else {
					local61 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local63 = local93 + local111 * (local77 - local93) * 6.0D;
				} else if (local111 * 2.0D < 1.0D) {
					local63 = local77;
				} else if (local111 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local111) * (-local93 + local77) * 6.0D + local93;
				} else {
					local63 = local93;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(292) int local292 = (int) (local59 * 256.0D);
			@Pc(297) int local297 = (int) (local61 * 256.0D);
			@Pc(302) int local302 = (int) (local63 * 256.0D);
			@Pc(312) int local312 = (local297 << 8) + (local292 << 16) + local302;
			Static77.anIntArray118[local26] = local312;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIIZII)V")
	public static void method3989(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) Class127_Sub1 local25 = Static157.aClass127_Sub1Array1[local19];
		Static157.aClass127_Sub1Array1[local19] = Static157.aClass127_Sub1Array1[arg2];
		Static157.aClass127_Sub1Array1[arg2] = local25;
		for (@Pc(37) int local37 = arg0; local37 < arg2; local37++) {
			if (Static11.method5109(Static157.aClass127_Sub1Array1[local37], local25, arg1, arg3, arg4, arg5) <= 0) {
				@Pc(54) Class127_Sub1 local54 = Static157.aClass127_Sub1Array1[local37];
				Static157.aClass127_Sub1Array1[local37] = Static157.aClass127_Sub1Array1[local21];
				Static157.aClass127_Sub1Array1[local21++] = local54;
			}
		}
		Static157.aClass127_Sub1Array1[arg2] = Static157.aClass127_Sub1Array1[local21];
		Static157.aClass127_Sub1Array1[local21] = local25;
		method3989(arg0, arg1, local21 - 1, arg3, arg4, arg5);
		method3989(local21 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(III)Z")
	public static boolean method3990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(17) Class79 local17 = Static129.method2097(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local17.method1556(arg1);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLclient!lm;)Lclient!on;")
	public static Class1_Sub33 method3991(@OriginalArg(0) int arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(13) byte[] local13 = arg1.method3014(arg0);
		return local13 == null ? null : new Class1_Sub33(local13);
	}
}
