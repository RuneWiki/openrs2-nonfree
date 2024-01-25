import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	public static int anInt2113 = 0;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public static void method1708() {
		Static225.aClass103_44.method2684();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)I")
	public static int method1709(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static335.method5308();
		for (@Pc(25) Class7_Sub12 local25 = arg0 ? (Class7_Sub12) Static118.aClass10_52.method157() : (Class7_Sub12) Static118.aClass10_52.method155(); local25 != null; local25 = (Class7_Sub12) Static118.aClass10_52.method155()) {
			if ((local25.aLong93 & 0x3FFFFFFFFFFFFFFFL) < local13) {
				if ((local25.aLong93 & 0x4000000000000000L) != 0L) {
					@Pc(56) int local56 = (int) local25.aLong232;
					Static212.anIntArray579[local56] = Static183.anIntArray506[local56];
					local25.method5648();
					return local56;
				}
				local25.method5648();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg6;
		@Pc(21) int local21 = arg4 - arg6;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local33 * (1 - local61) + local49;
		@Pc(95) int local95 = local37 - local53 * (local61 - 1);
		@Pc(99) int local99 = local25 << 2;
		@Pc(103) int local103 = local29 << 2;
		@Pc(107) int local107 = local33 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 * 3;
		@Pc(121) int local121 = (local57 - 3) * local45;
		@Pc(125) int local125 = local49 * 3;
		@Pc(131) int local131 = local53 * (local61 - 3);
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg4 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local21 - 1);
		@Pc(151) int[] local151 = Static323.anIntArrayArray55[arg5];
		Static282.method4681(arg2, arg1 - arg0, local151, arg1 - local16);
		Static282.method4681(arg3, arg1 - local16, local151, arg1 + local16);
		Static282.method4681(arg2, local16 + arg1, local151, arg1 + arg0);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local21 >= local9;
			if (local201) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local125;
						local95 += local141;
						local125 += local111;
						local141 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local87 += local125;
					local95 += local141;
					local141 += local111;
					local11++;
					local125 += local111;
				}
				local95 += -local131;
				local87 += -local147;
				local131 -= local107;
				local147 -= local107;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local133;
					local70 += local115;
					local7++;
					local115 += local103;
					local133 += local103;
				}
			}
			if (local79 < 0) {
				local70 += local115;
				local79 += local133;
				local7++;
				local133 += local103;
				local115 += local103;
			}
			local79 += -local121;
			local70 += -local139;
			local9--;
			local121 -= local99;
			local139 -= local99;
			@Pc(338) int local338 = arg5 - local9;
			@Pc(342) int local342 = local9 + arg5;
			@Pc(346) int local346 = arg1 + local7;
			@Pc(351) int local351 = arg1 - local7;
			if (local201) {
				@Pc(357) int local357 = local11 + arg1;
				@Pc(362) int local362 = arg1 - local11;
				Static282.method4681(arg2, local351, Static323.anIntArrayArray55[local338], local362);
				Static282.method4681(arg3, local362, Static323.anIntArrayArray55[local338], local357);
				Static282.method4681(arg2, local357, Static323.anIntArrayArray55[local338], local346);
				Static282.method4681(arg2, local351, Static323.anIntArrayArray55[local342], local362);
				Static282.method4681(arg3, local362, Static323.anIntArrayArray55[local342], local357);
				Static282.method4681(arg2, local357, Static323.anIntArrayArray55[local342], local346);
			} else {
				Static282.method4681(arg2, local351, Static323.anIntArrayArray55[local338], local346);
				Static282.method4681(arg2, local351, Static323.anIntArrayArray55[local342], local346);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIBI)V")
	public static void method1712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(29) int local29 = local17 << 1;
		@Pc(33) int local33 = local13 << 1;
		@Pc(37) int local37 = arg4 << 1;
		@Pc(45) int local45 = local29 + (1 - local37) * local13;
		@Pc(54) int local54 = local17 - local33 * (local37 - 1);
		@Pc(58) int local58 = local13 << 2;
		@Pc(62) int local62 = local17 << 2;
		@Pc(70) int local70 = local29 * 3;
		@Pc(78) int local78 = local33 * ((arg4 << 1) - 3);
		@Pc(84) int local84 = local62;
		Static282.method4681(arg2, arg3 - arg1, Static323.anIntArrayArray55[arg0], arg3 + arg1);
		@Pc(104) int local104 = local58 * (arg4 - 1);
		while (local9 > 0) {
			if (local45 < 0) {
				while (local45 < 0) {
					local54 += local84;
					local45 += local70;
					local84 += local62;
					local7++;
					local70 += local62;
				}
			}
			if (local54 < 0) {
				local45 += local70;
				local54 += local84;
				local7++;
				local70 += local62;
				local84 += local62;
			}
			local54 += -local78;
			local45 += -local104;
			local9--;
			local104 -= local58;
			local78 -= local58;
			@Pc(175) int local175 = arg0 - local9;
			@Pc(179) int local179 = local9 + arg0;
			@Pc(184) int local184 = arg3 + local7;
			@Pc(189) int local189 = arg3 - local7;
			Static282.method4681(arg2, local189, Static323.anIntArrayArray55[local175], local184);
			Static282.method4681(arg2, local189, Static323.anIntArrayArray55[local179], local184);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;IZB)Z")
	public static boolean method1713(@OriginalArg(0) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(43) char local43 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local43 == '-') {
					local24 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local43 >= '0' && local43 <= '9') {
				local71 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local71 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local71 = local43 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local24) {
				local71 = -local71;
			}
			@Pc(115) int local115 = local28 * 10 + local71;
			if (local115 / 10 != local28) {
				return false;
			}
			local28 = local115;
			local26 = true;
		}
		return local26;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	public static void method1714() {
		Static182.aClass103_31.method2678();
		Static138.aClass103_27.method2678();
	}
}
