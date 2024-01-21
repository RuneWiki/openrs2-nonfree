import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt1554;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!uf;")
	public static Class1_Sub2_Sub5_Sub5 aClass1_Sub2_Sub5_Sub5_5;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public static int anInt1551 = 0;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_1 = new Class67(50);

	@OriginalMember(owner = "client!g", name = "h", descriptor = "I")
	public static int anInt1557 = 0;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_958 = Static118.method2249("Benutzername: ");

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_959 = Static118.method2249("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_960 = Static118.method2249("l");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static100.method1896(Static133.anInt3309, arg0, Static206.anInt4385);
		@Pc(17) int local17 = Static100.method1896(Static133.anInt3309, arg6, Static206.anInt4385);
		@Pc(23) int local23 = Static100.method1896(Static23.anInt685, arg1, Static71.anInt1744);
		@Pc(29) int local29 = Static100.method1896(Static23.anInt685, arg3, Static71.anInt1744);
		@Pc(37) int local37 = Static100.method1896(Static133.anInt3309, arg5 + arg0, Static206.anInt4385);
		@Pc(46) int local46 = Static100.method1896(Static133.anInt3309, arg6 - arg5, Static206.anInt4385);
		for (@Pc(53) int local53 = local11; local53 < local37; local53++) {
			Static51.method893(arg4, Static40.anIntArrayArray11[local53], local29, local23);
		}
		for (@Pc(73) int local73 = local17; local73 > local46; local73--) {
			Static51.method893(arg4, Static40.anIntArrayArray11[local73], local29, local23);
		}
		@Pc(101) int local101 = Static100.method1896(Static23.anInt685, arg1 + arg5, Static71.anInt1744);
		@Pc(111) int local111 = Static100.method1896(Static23.anInt685, arg3 - arg5, Static71.anInt1744);
		for (@Pc(113) int local113 = local37; local113 <= local46; local113++) {
			@Pc(119) int[] local119 = Static40.anIntArrayArray11[local113];
			Static51.method893(arg4, local119, local101, local23);
			Static51.method893(arg2, local119, local111, local101);
			Static51.method893(arg4, local119, local29, local111);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B[B)V")
	public static void method1057(@OriginalArg(1) byte[] arg0) {
		@Pc(9) int local9 = Static156.anInt3580 >> 1;
		@Pc(15) int local15 = Static196.anInt4242 >> 2 << 10;
		@Pc(19) byte[][] local19 = new byte[Static190.anInt4160][Static25.anInt737];
		@Pc(21) int local21 = 0;
		while (true) {
			@Pc(35) int local35;
			@Pc(47) int local47;
			while (arg0.length > local21) {
				local35 = (arg0[local21++] & 0xFF) * 64 - Static57.anInt1532;
				local47 = (arg0[local21++] & 0xFF) * 64 - Static33.anInt974;
				if (local35 > 0 && local47 > 0 && Static190.anInt4160 > local35 + 64 && local47 + 64 < Static25.anInt737) {
					for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
						@Pc(84) byte[] local84 = local19[local35 + local76];
						@Pc(91) int local91 = Static25.anInt737 - local47 - 1;
						for (@Pc(93) int local93 = -64; local93 < 0; local93++) {
							local84[local91--] = arg0[local21++];
						}
					}
				} else {
					local21 += 4096;
				}
			}
			local47 = Static25.anInt737;
			@Pc(131) int[] local131 = new int[local47];
			@Pc(134) int[] local134 = new int[local47];
			local35 = Static190.anInt4160;
			@Pc(139) int[] local139 = new int[local47];
			@Pc(142) int[] local142 = new int[local47];
			@Pc(145) int[] local145 = new int[local47];
			for (@Pc(147) int local147 = -5; local147 < local35; local147++) {
				@Pc(172) int local172;
				@Pc(233) int local233;
				for (@Pc(151) int local151 = 0; local151 < local47; local151++) {
					@Pc(157) int local157 = local147 + 5;
					@Pc(216) int local216;
					if (local35 > local157) {
						local172 = local19[local157][local151] & 0xFF;
						if (local172 > 0) {
							@Pc(180) Class1_Sub2_Sub6 local180 = Static53.method944(local172 - 1);
							local131[local151] += local180.anInt889;
							local134[local151] += local180.anInt885;
							local139[local151] += local180.anInt888;
							local142[local151] += local180.anInt886;
							local216 = local145[local151]++;
						}
					}
					local172 = local147 - 5;
					if (local172 >= 0) {
						local233 = local19[local172][local151] & 0xFF;
						if (local233 > 0) {
							@Pc(246) Class1_Sub2_Sub6 local246 = Static53.method944(local233 - 1);
							local131[local151] -= local246.anInt889;
							local134[local151] -= local246.anInt885;
							local139[local151] -= local246.anInt888;
							local142[local151] -= local246.anInt886;
							local216 = local145[local151]--;
						}
					}
				}
				if (local147 >= 0) {
					@Pc(301) int[][] local301 = Static40.anIntArrayArrayArray1[local147 >> 6];
					local172 = 0;
					local233 = 0;
					@Pc(307) int local307 = 0;
					@Pc(309) int local309 = 0;
					@Pc(311) int local311 = 0;
					for (@Pc(313) int local313 = -5; local313 < local47; local313++) {
						@Pc(319) int local319 = local313 + 5;
						@Pc(323) int local323 = local313 - 5;
						if (local319 < local47) {
							local311 += local145[local319];
							local172 += local131[local319];
							local233 += local134[local319];
							local307 += local139[local319];
							local309 += local142[local319];
						}
						if (local323 >= 0) {
							local172 -= local131[local323];
							local233 -= local134[local323];
							local309 -= local142[local323];
							local307 -= local139[local323];
							local311 -= local145[local323];
						}
						if (local313 >= 0 && local311 > 0) {
							@Pc(420) int local420 = local309 == 0 ? 0 : Static97.method1847(local233 / local311, local172 * 256 / local309, local307 / local311);
							@Pc(424) int local424 = local313 >> 6;
							if (local19[local147][local313] != 0) {
								@Pc(456) int local456 = local9 + (local420 & 0x7F);
								if (local301[local424] == null) {
									local301[local424] = Static40.anIntArrayArrayArray1[local147 >> 6][local424] = new int[4096];
								}
								if (local456 < 0) {
									local456 = 0;
								} else if (local456 > 127) {
									local456 = 127;
								}
								@Pc(498) int local498 = local456 + (local420 + local15 & 0xFC00) + (local420 & 0x380);
								local301[local424][(local147 & 0x3F) + ((local313 & 0x3F) << 6)] = Static56.anIntArray141[Static153.method2678(96, local498)];
							} else if (local301[local424] != null) {
								local301[local424][((local313 & 0x3F) << 6) + (local147 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Lclient!ue;")
	public static Class88 method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass88_1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIILclient!wg;Lclient!wg;IIJ)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class10 local8 = new Class10();
		local8.aLong20 = arg8;
		local8.anInt666 = arg1 * 128 + 64;
		local8.anInt662 = arg2 * 128 + 64;
		local8.anInt658 = arg3;
		local8.aClass6_2 = arg4;
		local8.aClass6_1 = arg5;
		local8.anInt663 = arg6;
		local8.anInt665 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static83.aClass1_Sub7ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static83.aClass1_Sub7ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub7(local42, arg1, arg2);
			}
		}
		Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass10_1 = local8;
	}
}
