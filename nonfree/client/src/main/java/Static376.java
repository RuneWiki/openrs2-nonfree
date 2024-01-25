import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "Lclient!nca;")
	public static Class254 aClass254_107;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_118 = new Class225(117, 7);

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString64 = "";

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		@Pc(20) int local20 = arg5 - arg2;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(77) int local77 = local28 - local44 * (local56 - 1);
		@Pc(87) int local87 = (1 - local60) * local32 + local48;
		@Pc(96) int local96 = local36 - (local60 - 1) * local52;
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(115) int local115 = local32 << 2;
		@Pc(119) int local119 = local36 << 2;
		@Pc(123) int local123 = local40 * 3;
		@Pc(129) int local129 = local44 * (local56 - 3);
		@Pc(133) int local133 = local48 * 3;
		@Pc(139) int local139 = (local60 - 3) * local52;
		@Pc(141) int local141 = local104;
		@Pc(147) int local147 = local100 * (arg5 - 1);
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = (local20 - 1) * local115;
		@Pc(159) int[] local159 = Static449.anIntArrayArray48[arg0];
		Static494.method7075(arg4 - arg1, arg6, arg4 - local15, local159, 18601);
		Static494.method7075(arg4 - local15, arg3, local15 + arg4, local159, 18601);
		Static494.method7075(arg4 + local15, arg6, arg1 + arg4, local159, 18601);
		while (local9 > 0) {
			@Pc(208) boolean local208 = local20 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local77 += local141;
					local69 += local123;
					local7++;
					local141 += local104;
					local123 += local104;
				}
			}
			if (local208) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local133;
						local96 += local149;
						local11++;
						local149 += local119;
						local133 += local119;
					}
				}
				if (local96 < 0) {
					local96 += local149;
					local87 += local133;
					local149 += local119;
					local11++;
					local133 += local119;
				}
				local96 += -local139;
				local87 += -local155;
				local155 -= local115;
				local139 -= local115;
			}
			if (local77 < 0) {
				local69 += local123;
				local77 += local141;
				local141 += local104;
				local123 += local104;
				local7++;
			}
			local69 += -local147;
			local77 += -local129;
			local147 -= local100;
			local9--;
			local129 -= local100;
			@Pc(359) int local359 = arg0 - local9;
			@Pc(363) int local363 = arg0 + local9;
			@Pc(367) int local367 = local7 + arg4;
			@Pc(371) int local371 = arg4 - local7;
			if (local208) {
				@Pc(378) int local378 = arg4 + local11;
				@Pc(382) int local382 = arg4 - local11;
				Static494.method7075(local371, arg6, local382, Static449.anIntArrayArray48[local359], 18601);
				Static494.method7075(local382, arg3, local378, Static449.anIntArrayArray48[local359], 18601);
				Static494.method7075(local378, arg6, local367, Static449.anIntArrayArray48[local359], 18601);
				Static494.method7075(local371, arg6, local382, Static449.anIntArrayArray48[local363], 18601);
				Static494.method7075(local382, arg3, local378, Static449.anIntArrayArray48[local363], 18601);
				Static494.method7075(local378, arg6, local367, Static449.anIntArrayArray48[local363], 18601);
			} else {
				Static494.method7075(local371, arg6, local367, Static449.anIntArrayArray48[local359], 18601);
				Static494.method7075(local371, arg6, local367, Static449.anIntArrayArray48[local363], 18601);
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIILclient!qka;)V")
	public static void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub2 arg3) {
		@Pc(4) Class311 local4 = Static582.method8090(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub2_Sub2_1 = arg3;
		@Pc(19) int local19 = Static158.aClass133Array4 == Static685.aClass133Array5 ? 1 : 0;
		if (arg3.method8970()) {
			if (arg3.method8976()) {
				arg3.aClass4_Sub2_25 = Static161.aClass4_Sub2Array1[local19];
				Static161.aClass4_Sub2Array1[local19] = arg3;
				return;
			}
			arg3.aClass4_Sub2_25 = Static594.aClass4_Sub2Array5[local19];
			Static594.aClass4_Sub2Array5[local19] = arg3;
			Static415.aBoolean615 = true;
			return;
		}
		arg3.aClass4_Sub2_25 = Static699.aClass4_Sub2Array6[local19];
		Static699.aClass4_Sub2Array6[local19] = arg3;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;ZIZ)I")
	public static int method5449(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg1);
		}
		@Pc(33) boolean local33 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = arg0.length();
		for (@Pc(48) int local48 = 0; local48 < local46; local48++) {
			@Pc(56) char local56 = arg0.charAt(local48);
			if (local48 == 0) {
				if (local56 == '-') {
					local33 = true;
					continue;
				}
				if (local56 == '+' && true) {
					continue;
				}
			}
			@Pc(122) int local122;
			if (local56 >= '0' && local56 <= '9') {
				local122 = local56 - '0';
			} else if (local56 >= 'A' && local56 <= 'Z') {
				local122 = local56 - '7';
			} else if (local56 >= 'a' && local56 <= 'z') {
				local122 = local56 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local122) {
				throw new NumberFormatException();
			}
			if (local33) {
				local122 = -local122;
			}
			@Pc(156) int local156 = local122 + local43 * arg1;
			if (local156 / arg1 != local43) {
				throw new NumberFormatException();
			}
			local41 = true;
			local43 = local156;
		}
		if (!local41) {
			throw new NumberFormatException();
		}
		return local43;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(JJ)J")
	public static long method5450(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
