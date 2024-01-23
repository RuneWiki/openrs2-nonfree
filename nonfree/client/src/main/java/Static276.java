import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "Lclient!ho;")
	public static Class3_Sub4_Sub12 aClass3_Sub4_Sub12_10;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38 = new String[8];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public static int anInt5570 = -1;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/util/Random;Z)I")
	public static int method4529(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static171.method2841(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(40) int local40 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(43) int local43;
			do {
				local43 = arg1.nextInt();
			} while (local43 >= local40);
			return Static57.method923(arg0, local43);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!sd;II)V")
	public static void method4530(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub5_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt5061 && arg2 != -1) {
			@Pc(24) Class15 local24 = Static253.method4288(arg2);
			@Pc(27) int local27 = local24.anInt412;
			if (local27 == 1) {
				arg1.anInt5081 = 0;
				arg1.anInt5049 = 0;
				arg1.anInt5051 = 0;
				arg1.anInt5027 = arg0;
				arg1.anInt5035 = 1;
				Static158.method2622(arg1.anInt5073, arg1.anInt5049, local24, false, arg1.anInt5016);
			}
			if (local27 == 2) {
				arg1.anInt5051 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt5061 == -1 || Static253.method4288(arg2).anInt420 >= Static253.method4288(arg1.anInt5061).anInt420) {
			arg1.anInt5061 = arg2;
			arg1.anInt5027 = arg0;
			arg1.anInt5035 = 1;
			arg1.anInt5049 = 0;
			arg1.anInt5081 = 0;
			arg1.anInt5051 = 0;
			arg1.anInt5021 = arg1.anInt5044;
			if (arg1.anInt5061 != -1) {
				Static158.method2622(arg1.anInt5073, arg1.anInt5049, Static253.method4288(arg1.anInt5061), false, arg1.anInt5016);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!rn;B)[Lclient!ho;")
	public static Class3_Sub4_Sub12[] method4531(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		return Static115.method1878(0, arg1, arg0) ? Static278.method4200() : null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4532(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static105.anInt1942 : Static156.anInt2937) + local19;
		for (@Pc(41) int local41 = local19; local41 < local27; local41++) {
			@Pc(48) Class3_Sub4_Sub9 local48 = Static213.method3486(local41);
			if (local48.aBoolean151 && local48.method1586().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static255.aShortArray86 = null;
					Static6.anInt133 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(86) short[] local86 = new short[local11.length * 2];
					for (@Pc(88) int local88 = 0; local88 < local13; local88++) {
						local86[local88] = local11[local88];
					}
					local11 = local86;
				}
				local11[local13++] = (short) local41;
			}
		}
		Static49.anInt939 = 0;
		Static6.anInt133 = local13;
		@Pc(122) String[] local122 = new String[Static6.anInt133];
		Static255.aShortArray86 = local11;
		for (@Pc(126) int local126 = 0; local126 < Static6.anInt133; local126++) {
			local122[local126] = Static213.method3486(local11[local126]).method1586();
		}
		Static92.method1371(local122, Static255.aShortArray86);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZIIII)V")
	public static void method4533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = arg0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg3;
		@Pc(21) int local21 = arg0 - arg3;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local37 << 1;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local33 << 1;
		@Pc(53) int local53 = arg0 << 1;
		@Pc(62) int local62 = local45 + local25 * (1 - local53);
		@Pc(66) int local66 = local21 << 1;
		@Pc(70) int local70 = local25 << 1;
		@Pc(80) int local80 = (1 - local66) * local33 + local41;
		@Pc(93) int local93 = local29 - (local53 - 1) * local70;
		@Pc(97) int local97 = local25 << 2;
		@Pc(101) int local101 = local33 << 2;
		@Pc(110) int local110 = local37 - local49 * (local66 - 1);
		@Pc(114) int local114 = local29 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(124) int local124 = (local53 - 3) * local70;
		@Pc(128) int local128 = local45 * 3;
		@Pc(132) int local132 = local41 * 3;
		@Pc(134) int local134 = local114;
		@Pc(140) int local140 = (arg0 - 1) * local97;
		@Pc(142) int local142 = local118;
		@Pc(148) int local148 = (local66 - 3) * local49;
		@Pc(175) int local175;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(200) int local200;
		if (Static245.anInt6027 <= arg6 && arg6 <= Static111.anInt2039) {
			@Pc(166) int[] local166 = Static129.anIntArrayArray40[arg6];
			local175 = Static167.method2786(arg2 - arg4, Static204.anInt4020, Static175.anInt3267);
			local183 = Static167.method2786(arg2 + arg4, Static204.anInt4020, Static175.anInt3267);
			local192 = Static167.method2786(arg2 - local16, Static204.anInt4020, Static175.anInt3267);
			local200 = Static167.method2786(arg2 + local16, Static204.anInt4020, Static175.anInt3267);
			Static235.method3988(arg1, local166, local192, local175);
			Static235.method3988(arg5, local166, local200, local192);
			Static235.method3988(arg1, local166, local183, local200);
		}
		@Pc(224) int local224 = local101 * (local21 - 1);
		while (local3 > 0) {
			if (local62 < 0) {
				while (local62 < 0) {
					local11++;
					local62 += local128;
					local128 += local114;
					local93 += local134;
					local134 += local114;
				}
			}
			if (local93 < 0) {
				local11++;
				local93 += local134;
				local62 += local128;
				local128 += local114;
				local134 += local114;
			}
			local62 += -local140;
			local93 += -local124;
			local124 -= local97;
			local140 -= local97;
			@Pc(300) boolean local300 = local3 <= local21;
			if (local300) {
				if (local80 < 0) {
					while (local80 < 0) {
						local110 += local142;
						local9++;
						local142 += local118;
						local80 += local132;
						local132 += local118;
					}
				}
				if (local110 < 0) {
					local9++;
					local110 += local142;
					local80 += local132;
					local142 += local118;
					local132 += local118;
				}
				local110 += -local148;
				local80 += -local224;
				local148 -= local101;
				local224 -= local101;
			}
			local3--;
			local175 = arg6 - local3;
			local183 = local3 + arg6;
			if (local183 >= Static245.anInt6027 && local175 <= Static111.anInt2039) {
				local192 = Static167.method2786(arg2 + local11, Static204.anInt4020, Static175.anInt3267);
				local200 = Static167.method2786(arg2 - local11, Static204.anInt4020, Static175.anInt3267);
				if (local300) {
					@Pc(417) int local417 = Static167.method2786(arg2 + local9, Static204.anInt4020, Static175.anInt3267);
					@Pc(426) int local426 = Static167.method2786(arg2 - local9, Static204.anInt4020, Static175.anInt3267);
					@Pc(438) int[] local438;
					if (local175 >= Static245.anInt6027) {
						local438 = Static129.anIntArrayArray40[local175];
						Static235.method3988(arg1, local438, local426, local200);
						Static235.method3988(arg5, local438, local417, local426);
						Static235.method3988(arg1, local438, local192, local417);
					}
					if (local183 <= Static111.anInt2039) {
						local438 = Static129.anIntArrayArray40[local183];
						Static235.method3988(arg1, local438, local426, local200);
						Static235.method3988(arg5, local438, local417, local426);
						Static235.method3988(arg1, local438, local192, local417);
					}
				} else {
					if (local175 >= Static245.anInt6027) {
						Static235.method3988(arg1, Static129.anIntArrayArray40[local175], local192, local200);
					}
					if (Static111.anInt2039 >= local183) {
						Static235.method3988(arg1, Static129.anIntArrayArray40[local183], local192, local200);
					}
				}
			}
		}
	}
}
