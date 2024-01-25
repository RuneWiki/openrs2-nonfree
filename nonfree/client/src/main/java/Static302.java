import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "Lclient!lba;")
	public static final Class172 aClass172_9 = new Class172();

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Lclient!fj;")
	public static final Class91 aClass91_6 = new Class91("", 12);

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
	public static void method4985() {
		Static512.aClass125_64.method3521();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(21) int local21 = arg6 - arg3;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(80) int local80 = local29 - (local57 - 1) * local45;
		@Pc(89) int local89 = local49 + local33 * (1 - local61);
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = (local57 - 3) * local45;
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = local53 * (local61 - 3);
		@Pc(140) int local140 = local105;
		@Pc(146) int local146 = local101 * (arg6 - 1);
		@Pc(148) int local148 = local113;
		@Pc(154) int local154 = (local21 - 1) * local109;
		@Pc(158) int[] local158 = Static68.anIntArrayArray24[arg4];
		Static257.method4540(local158, arg1, arg2 - arg0, -local16 + arg2);
		Static257.method4540(local158, arg5, arg2 - local16, arg2 + local16);
		Static257.method4540(local158, arg1, arg2 + local16, arg0 + arg2);
		while (local9 > 0) {
			@Pc(210) boolean local210 = local21 >= local9;
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local117;
					local80 += local140;
					local7++;
					local140 += local105;
					local117 += local105;
				}
			}
			if (local210) {
				if (local89 < 0) {
					while (local89 < 0) {
						local89 += local127;
						local97 += local148;
						local11++;
						local148 += local113;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local148;
					local89 += local127;
					local148 += local113;
					local11++;
					local127 += local113;
				}
				local89 += -local154;
				local97 += -local133;
				local133 -= local109;
				local154 -= local109;
			}
			if (local80 < 0) {
				local71 += local117;
				local80 += local140;
				local7++;
				local140 += local105;
				local117 += local105;
			}
			local80 += -local123;
			local71 += -local146;
			local146 -= local101;
			local123 -= local101;
			local9--;
			@Pc(347) int local347 = arg4 - local9;
			@Pc(351) int local351 = local9 + arg4;
			@Pc(356) int local356 = arg2 + local7;
			@Pc(361) int local361 = arg2 - local7;
			if (local210) {
				@Pc(367) int local367 = local11 + arg2;
				@Pc(372) int local372 = arg2 - local11;
				Static257.method4540(Static68.anIntArrayArray24[local347], arg1, local361, local372);
				Static257.method4540(Static68.anIntArrayArray24[local347], arg5, local372, local367);
				Static257.method4540(Static68.anIntArrayArray24[local347], arg1, local367, local356);
				Static257.method4540(Static68.anIntArrayArray24[local351], arg1, local361, local372);
				Static257.method4540(Static68.anIntArrayArray24[local351], arg5, local372, local367);
				Static257.method4540(Static68.anIntArrayArray24[local351], arg1, local367, local356);
			} else {
				Static257.method4540(Static68.anIntArrayArray24[local347], arg1, local361, local356);
				Static257.method4540(Static68.anIntArrayArray24[local351], arg1, local361, local356);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	public static void method4988(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static36.anInt940 = arg0;
		Static312.anInt6059 = 2;
		Static434.method6593(false, arg1, arg2);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!kea;II)Lclient!dj;")
	public static Class3_Sub10_Sub5 method4989(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class3_Sub27 local19 = new Class3_Sub27(arg0.method4243(arg1, arg2));
		@Pc(50) Class3_Sub10_Sub5 local50 = new Class3_Sub10_Sub5(arg1, local19.method7589(), local19.method7589(), local19.method7549(), local19.method7549(), local19.method7548() == 1, local19.method7548(), local19.method7548());
		@Pc(54) int local54 = local19.method7548();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass71_18.method2076(new Class3_Sub20(local19.method7548(), local19.method7591(), local19.method7591(), local19.method7591(), local19.method7591(), local19.method7591(), local19.method7591(), local19.method7591(), local19.method7591()));
		}
		local50.method1775();
		return local50;
	}
}
