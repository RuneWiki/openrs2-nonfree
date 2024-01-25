import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!je;")
	public static Class117 aClass117_18;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!er;")
	public static Class72 aClass72_3;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray83;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	public static int anInt6113;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "[I")
	public static final int[] anIntArray724 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "[I")
	public static final int[] anIntArray725 = new int[4096];

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
	public static final int anInt6112 = 1;

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "[I")
	public static final int[] anIntArray726 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Lclient!ea;")
	public static Class62 method5261() {
		try {
			return (Class62) Class.forName("Class62_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBIIIIII)V")
	public static void method5264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0 - arg2;
		@Pc(19) int local19 = arg6 - arg2;
		@Pc(23) int local23 = arg0 * arg0;
		@Pc(27) int local27 = arg6 * arg6;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = local23 << 1;
		@Pc(47) int local47 = local35 << 1;
		@Pc(51) int local51 = local31 << 1;
		@Pc(55) int local55 = arg6 << 1;
		@Pc(59) int local59 = local19 << 1;
		@Pc(68) int local68 = local39 + (1 - local55) * local23;
		@Pc(76) int local76 = local27 - (local55 - 1) * local43;
		@Pc(85) int local85 = local31 * (1 - local59) + local47;
		@Pc(94) int local94 = local35 - local51 * (local59 - 1);
		@Pc(98) int local98 = local23 << 2;
		@Pc(102) int local102 = local27 << 2;
		@Pc(106) int local106 = local31 << 2;
		@Pc(110) int local110 = local35 << 2;
		@Pc(114) int local114 = local39 * 3;
		@Pc(120) int local120 = local43 * (local55 - 3);
		@Pc(124) int local124 = local47 * 3;
		@Pc(130) int local130 = local51 * (local59 - 3);
		@Pc(132) int local132 = local102;
		@Pc(138) int local138 = local98 * (arg6 - 1);
		@Pc(150) int local150 = local110;
		@Pc(156) int local156 = local106 * (local19 - 1);
		@Pc(183) int local183;
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(208) int local208;
		if (arg4 >= Static194.anInt3448 && Static264.anInt4589 >= arg4) {
			@Pc(174) int[] local174 = Static369.anIntArrayArray35[arg4];
			local183 = Static140.method5231(arg1 - arg0, Static98.anInt1774, Static372.anInt1561);
			local191 = Static140.method5231(arg0 + arg1, Static98.anInt1774, Static372.anInt1561);
			local200 = Static140.method5231(arg1 - local15, Static98.anInt1774, Static372.anInt1561);
			local208 = Static140.method5231(arg1 + local15, Static98.anInt1774, Static372.anInt1561);
			Static382.method5419(local174, local183, local200, arg3);
			Static382.method5419(local174, local200, local208, arg5);
			Static382.method5419(local174, local208, local191, arg3);
		}
		while (local9 > 0) {
			@Pc(239) boolean local239 = local9 <= local19;
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local114;
					local76 += local132;
					local114 += local102;
					local7++;
					local132 += local102;
				}
			}
			if (local239) {
				if (local85 < 0) {
					while (local85 < 0) {
						local85 += local124;
						local94 += local150;
						local150 += local110;
						local124 += local110;
						local11++;
					}
				}
				if (local94 < 0) {
					local85 += local124;
					local94 += local150;
					local124 += local110;
					local150 += local110;
					local11++;
				}
				local85 += -local156;
				local94 += -local130;
				local156 -= local106;
				local130 -= local106;
			}
			if (local76 < 0) {
				local68 += local114;
				local76 += local132;
				local132 += local102;
				local7++;
				local114 += local102;
			}
			local68 += -local138;
			local76 += -local120;
			local138 -= local98;
			local120 -= local98;
			local9--;
			local183 = arg4 - local9;
			local191 = arg4 + local9;
			if (Static194.anInt3448 <= local191 && local183 <= Static264.anInt4589) {
				local200 = Static140.method5231(arg1 + local7, Static98.anInt1774, Static372.anInt1561);
				local208 = Static140.method5231(arg1 - local7, Static98.anInt1774, Static372.anInt1561);
				if (local239) {
					@Pc(414) int local414 = Static140.method5231(arg1 + local11, Static98.anInt1774, Static372.anInt1561);
					@Pc(422) int local422 = Static140.method5231(arg1 - local11, Static98.anInt1774, Static372.anInt1561);
					@Pc(433) int[] local433;
					if (local183 >= Static194.anInt3448) {
						local433 = Static369.anIntArrayArray35[local183];
						Static382.method5419(local433, local208, local422, arg3);
						Static382.method5419(local433, local422, local414, arg5);
						Static382.method5419(local433, local414, local200, arg3);
					}
					if (Static264.anInt4589 >= local191) {
						local433 = Static369.anIntArrayArray35[local191];
						Static382.method5419(local433, local208, local422, arg3);
						Static382.method5419(local433, local422, local414, arg5);
						Static382.method5419(local433, local414, local200, arg3);
					}
				} else {
					if (local183 >= Static194.anInt3448) {
						Static382.method5419(Static369.anIntArrayArray35[local183], local208, local200, arg3);
					}
					if (Static264.anInt4589 >= local191) {
						Static382.method5419(Static369.anIntArrayArray35[local191], local208, local200, arg3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZIIZ)V")
	public static void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(19) int local19 = arg2 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(53) int local53 = Static373.aShort86 + local19 * (Static76.aShort83 - Static373.aShort86) / 100;
		if (local53 < Static14.aShort1) {
			local53 = Static14.aShort1;
		} else if (Static98.aShort29 < local53) {
			local53 = Static98.aShort29;
		}
		@Pc(83) int local83 = local53 * 512 * arg2 / (arg3 * 334);
		@Pc(124) int local124;
		@Pc(131) int local131;
		@Pc(95) short local95;
		if (Static390.aShort99 > local83) {
			local95 = Static390.aShort99;
			local53 = local95 * arg3 * 334 / (arg2 * 512);
			if (local53 > Static98.aShort29) {
				local53 = Static98.aShort29;
				local124 = arg2 * 512 * local53 / (local95 * 334);
				local131 = (arg3 - local124) / 2;
				if (arg4) {
					Static66.aClass164_2.method5306();
					Static66.aClass164_2.method5343(arg2, -16777216, arg1, arg0, local131);
					Static66.aClass164_2.method5343(arg2, -16777216, arg1, arg0 + arg3 - local131, local131);
				}
				arg3 -= local131 * 2;
				arg0 += local131;
			}
		} else if (Static281.aShort73 < local83) {
			local95 = Static281.aShort73;
			local53 = local95 * arg3 * 334 / (arg2 * 512);
			if (local53 < Static14.aShort1) {
				local53 = Static14.aShort1;
				local124 = arg3 * 334 * local95 / (local53 * 512);
				local131 = (arg2 - local124) / 2;
				if (arg4) {
					Static66.aClass164_2.method5306();
					Static66.aClass164_2.method5343(local131, -16777216, arg1, arg0, arg3);
					Static66.aClass164_2.method5343(local131, -16777216, arg2 + arg1 - local131, arg0, arg3);
				}
				arg2 -= local131 * 2;
				arg1 += local131;
			}
		}
		Static14.anInt204 = arg1;
		Static299.anInt5993 = (short) arg2;
		Static312.anInt5337 = arg0;
		Static5.anInt65 = (short) arg3;
		Static84.anInt1552 = local53 * arg2 / 334;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIZ[Lclient!je;)V")
	public static void method5275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class117[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(13) Class117 local13 = arg4[local7];
			if (local13 != null && local13.anInt3066 == arg1) {
				Static212.method2972(arg3, arg2, local13, arg0);
				Static48.method743(arg2, local13, arg0);
				if (local13.anInt3056 - local13.anInt3074 < local13.anInt3040) {
					local13.anInt3040 = local13.anInt3056 - local13.anInt3074;
				}
				if (local13.anInt3089 > local13.anInt3078 - local13.anInt3071) {
					local13.anInt3089 = local13.anInt3078 - local13.anInt3071;
				}
				if (local13.anInt3040 < 0) {
					local13.anInt3040 = 0;
				}
				if (local13.anInt3089 < 0) {
					local13.anInt3089 = 0;
				}
				if (local13.anInt3108 == 0) {
					Static365.method5064(arg3, local13);
				}
			}
		}
	}
}
