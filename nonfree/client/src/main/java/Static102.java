import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!du", name = "g", descriptor = "Lclient!pr;")
	public static final Class265 aClass265_3 = new Class265(0);

	@OriginalMember(owner = "client!du", name = "i", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_34 = new Class272(75, 2);

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Z")
	public static final boolean aBoolean84 = false;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)V")
	public static void method753(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static363.method5457(arg0, 8);
		local15.method845();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII)V")
	public static void method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static110.anInt2597 && arg0 <= Static459.anInt7524) {
			@Pc(15) int local15 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg2);
			@Pc(21) int local21 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg3);
			Static397.method5820(local15, arg1, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIII)V")
	public static void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg2;
		@Pc(21) int local21 = arg4 - arg2;
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
		@Pc(69) int local69 = (1 - local57) * local25 + local41;
		@Pc(78) int local78 = local29 - local45 * (local57 - 1);
		@Pc(87) int local87 = local49 + (1 - local61) * local33;
		@Pc(96) int local96 = local37 - local53 * (local61 - 1);
		@Pc(100) int local100 = local25 << 2;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 * 3;
		@Pc(122) int local122 = (local57 - 3) * local45;
		@Pc(126) int local126 = local49 * 3;
		@Pc(132) int local132 = local53 * (local61 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg4 - 1) * local100;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = (local21 - 1) * local108;
		@Pc(171) int local171;
		@Pc(179) int local179;
		@Pc(187) int local187;
		@Pc(197) int local197;
		if (Static385.anInt6630 <= arg6 && arg6 <= Static69.anInt1918) {
			@Pc(162) int[] local162 = Static176.anIntArrayArray28[arg6];
			local171 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5 - arg0);
			local179 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0 + arg5);
			local187 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5 - local16);
			local197 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5 + local16);
			Static337.method5150(local187, arg3, local171, local162);
			Static337.method5150(local197, arg1, local187, local162);
			Static337.method5150(local179, arg3, local197, local162);
		}
		while (local9 > 0) {
			@Pc(228) boolean local228 = local9 <= local21;
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local116;
					local78 += local134;
					local134 += local104;
					local116 += local104;
					local7++;
				}
			}
			if (local228) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local142;
						local87 += local126;
						local142 += local112;
						local126 += local112;
						local11++;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local142;
					local126 += local112;
					local142 += local112;
					local11++;
				}
				local87 += -local148;
				local96 += -local132;
				local132 -= local108;
				local148 -= local108;
			}
			if (local78 < 0) {
				local69 += local116;
				local78 += local134;
				local7++;
				local116 += local104;
				local134 += local104;
			}
			local78 += -local122;
			local69 += -local140;
			local122 -= local100;
			local9--;
			local140 -= local100;
			local171 = arg6 - local9;
			local179 = arg6 + local9;
			if (Static385.anInt6630 <= local179 && local171 <= Static69.anInt1918) {
				local187 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, local7 + arg5);
				local197 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5 - local7);
				if (local228) {
					@Pc(438) int local438 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5 + local11);
					@Pc(446) int local446 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg5 - local11);
					@Pc(453) int[] local453;
					if (local171 >= Static385.anInt6630) {
						local453 = Static176.anIntArrayArray28[local171];
						Static337.method5150(local446, arg3, local197, local453);
						Static337.method5150(local438, arg1, local446, local453);
						Static337.method5150(local187, arg3, local438, local453);
					}
					if (Static69.anInt1918 >= local179) {
						local453 = Static176.anIntArrayArray28[local179];
						Static337.method5150(local446, arg3, local197, local453);
						Static337.method5150(local438, arg1, local446, local453);
						Static337.method5150(local187, arg3, local438, local453);
					}
				} else {
					if (local171 >= Static385.anInt6630) {
						Static337.method5150(local187, arg3, local197, Static176.anIntArrayArray28[local171]);
					}
					if (Static69.anInt1918 >= local179) {
						Static337.method5150(local187, arg3, local197, Static176.anIntArrayArray28[local179]);
					}
				}
			}
		}
	}
}
