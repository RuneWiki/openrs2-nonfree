import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "Lclient!dp;")
	public static Class71 aClass71_4;

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_127 = new Class287(22, 7);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg4;
		@Pc(21) int local21 = arg5 - arg4;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg5 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local25 * (1 - local57) + local41;
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local33 * (1 - local61) + local49;
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = local45 * (local57 - 3);
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = local53 * (local61 - 3);
		@Pc(139) int local139 = local104;
		@Pc(145) int local145 = local100 * (arg5 - 1);
		@Pc(147) int local147 = local117;
		@Pc(174) int local174;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(203) int local203;
		if (arg1 >= Static112.anInt2687 && arg1 <= Static333.anInt6022) {
			@Pc(165) int[] local165 = Static570.anIntArrayArray100[arg1];
			local174 = Static4.method56(arg0 - arg3, Static384.anInt6641, Static191.anInt4134);
			local183 = Static4.method56(arg0 + arg3, Static384.anInt6641, Static191.anInt4134);
			local192 = Static4.method56(arg0 - local16, Static384.anInt6641, Static191.anInt4134);
			local203 = Static4.method56(arg0 + local16, Static384.anInt6641, Static191.anInt4134);
			Static504.method6755(arg2, local192, local165, local174);
			Static504.method6755(arg6, local203, local165, local192);
			Static504.method6755(arg2, local183, local165, local203);
		}
		@Pc(227) int local227 = local108 * (local21 - 1);
		while (local9 > 0) {
			@Pc(236) boolean local236 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local78 += local139;
					local70 += local121;
					local121 += local104;
					local139 += local104;
					local7++;
				}
			}
			if (local236) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local147;
						local87 += local131;
						local147 += local117;
						local131 += local117;
						local11++;
					}
				}
				if (local96 < 0) {
					local87 += local131;
					local96 += local147;
					local131 += local117;
					local11++;
					local147 += local117;
				}
				local87 += -local227;
				local96 += -local137;
				local227 -= local108;
				local137 -= local108;
			}
			if (local78 < 0) {
				local70 += local121;
				local78 += local139;
				local139 += local104;
				local7++;
				local121 += local104;
			}
			local78 += -local127;
			local70 += -local145;
			local145 -= local100;
			local9--;
			local127 -= local100;
			local174 = arg1 - local9;
			local183 = local9 + arg1;
			if (Static112.anInt2687 <= local183 && Static333.anInt6022 >= local174) {
				local192 = Static4.method56(local7 + arg0, Static384.anInt6641, Static191.anInt4134);
				local203 = Static4.method56(arg0 - local7, Static384.anInt6641, Static191.anInt4134);
				if (local236) {
					@Pc(447) int local447 = Static4.method56(local11 + arg0, Static384.anInt6641, Static191.anInt4134);
					@Pc(456) int local456 = Static4.method56(arg0 - local11, Static384.anInt6641, Static191.anInt4134);
					@Pc(463) int[] local463;
					if (Static112.anInt2687 <= local174) {
						local463 = Static570.anIntArrayArray100[local174];
						Static504.method6755(arg2, local456, local463, local203);
						Static504.method6755(arg6, local447, local463, local456);
						Static504.method6755(arg2, local192, local463, local447);
					}
					if (local183 <= Static333.anInt6022) {
						local463 = Static570.anIntArrayArray100[local183];
						Static504.method6755(arg2, local456, local463, local203);
						Static504.method6755(arg6, local447, local463, local456);
						Static504.method6755(arg2, local192, local463, local447);
					}
				} else {
					if (local174 >= Static112.anInt2687) {
						Static504.method6755(arg2, local192, Static570.anIntArrayArray100[local174], local203);
					}
					if (Static333.anInt6022 >= local183) {
						Static504.method6755(arg2, local192, Static570.anIntArrayArray100[local183], local203);
					}
				}
			}
		}
	}
}
