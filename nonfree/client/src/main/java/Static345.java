import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[Lclient!dl;")
	public static final Class47[] aClass47Array1 = new Class47[6];

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[I")
	public static final int[] anIntArray668 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
	public static boolean aBoolean548 = false;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method5770() {
		@Pc(5) Class37 local5 = Static265.aClass37_86;
		synchronized (Static265.aClass37_86) {
			Static265.aClass37_86.method914();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!mp;III)V")
	public static void method5771(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static87.anIntArrayArrayArray4[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt6107 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass1_Sub19_Sub1Array5[arg0.anInt6107++] = Static174.aClass1_Sub19_Sub1Array4[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt6107; local19 < 4; local19++) {
			arg0.aClass1_Sub19_Sub1Array5[local19] = null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!ur;")
	public static Class127_Sub1 method5772(@OriginalArg(0) int arg0) {
		return Static220.aBoolean372 && Static287.anInt5763 <= arg0 && Static222.anInt4708 >= arg0 ? Static168.aClass127_Sub1Array2[arg0 - Static287.anInt5763] : null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg3 && arg2 == arg7 && arg1 == arg8 && arg0 == arg4) {
			Static8.method111(arg7, arg8, arg0, arg5, arg6);
			return;
		}
		@Pc(39) int local39 = arg5;
		@Pc(41) int local41 = arg7;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg7 * 3;
		@Pc(53) int local53 = arg3 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(61) int local61 = arg1 * 3;
		@Pc(65) int local65 = arg4 * 3;
		@Pc(75) int local75 = local53 + arg8 - local61 - arg5;
		@Pc(85) int local85 = arg0 + local57 - arg7 - local65;
		@Pc(93) int local93 = local45 + local61 - local53 - local53;
		@Pc(103) int local103 = local49 + local65 - local57 - local57;
		@Pc(107) int local107 = local53 - local45;
		@Pc(112) int local112 = local57 - local49;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local122 * local114 >> 12;
			@Pc(132) int local132 = local128 * local75;
			@Pc(136) int local136 = local85 * local128;
			@Pc(140) int local140 = local93 * local122;
			@Pc(144) int local144 = local122 * local103;
			@Pc(148) int local148 = local107 * local114;
			@Pc(152) int local152 = local114 * local112;
			@Pc(163) int local163 = (local132 + local140 + local148 >> 12) + arg5;
			@Pc(174) int local174 = (local144 + local136 + local152 >> 12) + arg7;
			Static8.method111(local41, local163, local174, local39, arg6);
			local39 = local163;
			local41 = local174;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)I")
	public static int method5774(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
