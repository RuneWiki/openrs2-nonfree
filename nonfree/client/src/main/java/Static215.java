import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public static int anInt4404 = -1;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!no", name = "p", descriptor = "Lclient!no;")
	public static final Class142 aClass142_10 = new Class142(64);

	@OriginalMember(owner = "client!no", name = "q", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = (Static219.aShort66 - Static72.aShort6) * local7 / 100 + Static72.aShort6;
		@Pc(35) int local35 = local29 * arg3 >> 8;
		@Pc(42) int local42 = 16384 - arg2 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg4 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = local35;
		if (local42 != 0) {
			local53 = -local35 * Class140.anIntArray330[local42] >> 15;
			local55 = Class140.anIntArray329[local42] * local35 >> 15;
		}
		if (local49 != 0) {
			local51 = Class140.anIntArray330[local49] * local55 >> 15;
			local55 = Class140.anIntArray329[local49] * local55 >> 15;
		}
		Static190.anInt3870 = arg0 - local51;
		Static316.anInt6169 = arg5 - local55;
		Static184.anInt3721 = arg2;
		Static86.anInt1541 = arg1 - local53;
		Static157.anInt3004 = 0;
		Static308.anInt6050 = arg4;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!om;Lclient!nq;Lclient!nq;ILclient!nq;)Z")
	public static boolean method3869(@OriginalArg(0) Class11_Sub10_Sub4 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class144 arg2, @OriginalArg(4) Class144 arg3) {
		Static326.aClass144_95 = arg3;
		Static76.aClass144_90 = arg2;
		Static219.aClass144_68 = arg1;
		Static309.aClass11_Sub10_Sub4_3 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public static void method3872() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static311.aBooleanArray4[local3] = false;
		}
		Static284.anInt5609 = Static316.anInt6169;
		Static344.anInt6594 = Static308.anInt6050;
		Static319.anInt6196 = 0;
		Static67.anInt1251 = Static293.anInt5807;
		Static24.anInt455 = 0;
		Static22.anInt416 = -1;
		Static201.anInt6774 = Static86.anInt1541;
		Static204.anInt4169 = -1;
		Static81.anInt1498 = 5;
		Static214.anInt4400 = Static190.anInt3870;
		Static209.anInt4260 = Static184.anInt3721;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!nq;BLclient!nq;)V")
	public static void method3875(@OriginalArg(0) Class144 arg0, @OriginalArg(2) Class144 arg1) {
		Static309.aClass144_99 = arg0;
		Static286.aClass144_92 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z[II[IIIIIIIIIIILclient!hh;)I")
	public static int method3876(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class92 arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static135.anIntArrayArray26[local7][local11] = 0;
				Static329.anIntArrayArray75[local7][local11] = 99999999;
			}
		}
		@Pc(62) boolean local62;
		if (arg2 == 1) {
			local62 = Static36.method535(arg4, arg11, arg13, arg5, arg8, arg9, arg10, arg6, arg7, arg12);
		} else if (arg2 == 2) {
			local62 = Static133.method2068(arg9, arg5, arg12, arg11, arg8, arg10, arg13, arg4, arg6, arg7);
		} else {
			local62 = Static132.method2060(arg11, arg9, arg12, arg4, arg13, arg10, arg5, arg6, arg7, arg8, arg2);
		}
		@Pc(96) int local96 = arg5 - 64;
		@Pc(100) int local100 = arg8 - 64;
		@Pc(102) int local102 = Static165.anInt3290;
		@Pc(104) int local104 = Static236.anInt4751;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(118) int local118;
		if (!local62) {
			if (!arg0) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local118 = arg12 - 10; local118 <= arg12 + 10; local118++) {
				for (@Pc(125) int local125 = arg9 - 10; local125 <= arg9 + 10; local125++) {
					@Pc(132) int local132 = local118 - local96;
					@Pc(137) int local137 = local125 - local100;
					if (local132 >= 0 && local137 >= 0 && local132 < 128 && local137 < 128 && Static329.anIntArrayArray75[local132][local137] < 100) {
						@Pc(163) int local163 = 0;
						if (local118 < arg12) {
							local163 = arg12 - local118;
						} else if (local118 > arg12 + arg10 - 1) {
							local163 = local118 + 1 - arg10 - arg12;
						}
						@Pc(193) int local193 = 0;
						if (local125 < arg9) {
							local193 = arg9 - local125;
						} else if (local125 > arg9 + arg7 - 1) {
							local193 = local125 + 1 - arg9 - arg7;
						}
						@Pc(231) int local231 = local193 * local193 + local163 * local163;
						if (local110 > local231 || local231 == local110 && local112 > Static329.anIntArrayArray75[local132][local137]) {
							local102 = local118;
							local104 = local125;
							local110 = local231;
							local112 = Static329.anIntArrayArray75[local132][local137];
						}
					}
				}
			}
			if (~local110 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local102 == arg5 && arg8 == local104) {
			return 0;
		}
		@Pc(295) byte local295 = 0;
		Static182.anIntArray268[0] = local102;
		local110 = local295 + 1;
		Static185.anIntArray283[0] = local104;
		@Pc(317) int local317;
		local112 = local317 = Static135.anIntArrayArray26[local102 - local96][local104 - local100];
		while (arg5 != local102 || local104 != arg8) {
			if (local112 != local317) {
				Static182.anIntArray268[local110] = local102;
				local317 = local112;
				Static185.anIntArray283[local110++] = local104;
			}
			if ((local112 & 0x2) != 0) {
				local102++;
			} else if ((local112 & 0x8) != 0) {
				local102--;
			}
			if ((local112 & 0x1) != 0) {
				local104++;
			} else if ((local112 & 0x4) != 0) {
				local104--;
			}
			local112 = Static135.anIntArrayArray26[local102 - local96][local104 - local100];
		}
		local118 = 0;
		while (local110-- > 0) {
			arg3[local118] = Static182.anIntArray268[local110];
			arg1[local118++] = Static185.anIntArray283[local110];
			if (arg3.length <= local118) {
				break;
			}
		}
		return local118;
	}
}
