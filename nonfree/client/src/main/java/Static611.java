import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "[Lclient!wc;")
	public static final Class28_Sub1_Sub1_Sub1_Sub1[] aClass28_Sub1_Sub1_Sub1_Sub1Array1 = new Class28_Sub1_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public static int anInt9850 = 0;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public static int anInt9854 = -60;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg6;
		@Pc(20) int local20 = arg5 - arg6;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = local40 + (1 - local56) * local24;
		@Pc(77) int local77 = local28 - local44 * (local56 - 1);
		@Pc(87) int local87 = local32 * (1 - local60) + local48;
		@Pc(96) int local96 = local36 - (local60 - 1) * local52;
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = (local56 - 3) * local44;
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = local52 * (local60 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = local100 * (arg5 - 1);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (local20 - 1);
		@Pc(167) int local167;
		@Pc(176) int local176;
		@Pc(184) int local184;
		@Pc(194) int local194;
		if (Static374.anInt5986 <= arg4 && arg4 <= Static84.anInt1667) {
			@Pc(158) int[] local158 = Static392.anIntArrayArray39[arg4];
			local167 = Static120.method2296(arg3 - arg0, Static7.anInt93, Static115.anInt2377);
			local176 = Static120.method2296(arg3 + arg0, Static7.anInt93, Static115.anInt2377);
			local184 = Static120.method2296(arg3 - local16, Static7.anInt93, Static115.anInt2377);
			local194 = Static120.method2296(local16 + arg3, Static7.anInt93, Static115.anInt2377);
			Static483.method7014(local158, local167, local184, arg2);
			Static483.method7014(local158, local184, local194, arg1);
			Static483.method7014(local158, local194, local176, arg2);
		}
		while (local9 > 0) {
			@Pc(221) boolean local221 = local20 >= local9;
			if (local221) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local142;
						local87 += local126;
						local142 += local112;
						local11++;
						local126 += local112;
					}
				}
				if (local96 < 0) {
					local96 += local142;
					local87 += local126;
					local142 += local112;
					local126 += local112;
					local11++;
				}
				local87 += -local148;
				local96 += -local132;
				local148 -= local108;
				local132 -= local108;
			}
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local116;
					local77 += local134;
					local134 += local104;
					local116 += local104;
					local7++;
				}
			}
			if (local77 < 0) {
				local77 += local134;
				local68 += local116;
				local134 += local104;
				local7++;
				local116 += local104;
			}
			local68 += -local140;
			local77 += -local122;
			local9--;
			local122 -= local100;
			local140 -= local100;
			local167 = arg4 - local9;
			local176 = arg4 + local9;
			if (Static374.anInt5986 <= local176 && Static84.anInt1667 >= local167) {
				local184 = Static120.method2296(local7 + arg3, Static7.anInt93, Static115.anInt2377);
				local194 = Static120.method2296(arg3 - local7, Static7.anInt93, Static115.anInt2377);
				if (local221) {
					@Pc(402) int local402 = Static120.method2296(local11 + arg3, Static7.anInt93, Static115.anInt2377);
					@Pc(411) int local411 = Static120.method2296(arg3 - local11, Static7.anInt93, Static115.anInt2377);
					@Pc(422) int[] local422;
					if (local167 >= Static374.anInt5986) {
						local422 = Static392.anIntArrayArray39[local167];
						Static483.method7014(local422, local194, local411, arg2);
						Static483.method7014(local422, local411, local402, arg1);
						Static483.method7014(local422, local402, local184, arg2);
					}
					if (Static84.anInt1667 >= local176) {
						local422 = Static392.anIntArrayArray39[local176];
						Static483.method7014(local422, local194, local411, arg2);
						Static483.method7014(local422, local411, local402, arg1);
						Static483.method7014(local422, local402, local184, arg2);
					}
				} else {
					if (local167 >= Static374.anInt5986) {
						Static483.method7014(Static392.anIntArrayArray39[local167], local194, local184, arg2);
					}
					if (Static84.anInt1667 >= local176) {
						Static483.method7014(Static392.anIntArrayArray39[local176], local194, local184, arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public static void method8671() {
		for (@Pc(15) Class3_Sub11_Sub14 local15 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local15 != null; local15 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
			if (Static18.method569(local15.anInt6738)) {
				Static291.method4559(local15);
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg8 && arg4 == arg1 && arg6 == arg0 && arg3 == arg5) {
			Static174.method3152(arg3, arg0, arg4, arg8, arg7);
			return;
		}
		@Pc(28) int local28 = arg8;
		@Pc(30) int local30 = arg4;
		@Pc(34) int local34 = arg8 * 3;
		@Pc(38) int local38 = arg4 * 3;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(64) int local64 = local42 + arg0 - arg8 - local50;
		@Pc(73) int local73 = arg3 + local46 - local54 - arg4;
		@Pc(83) int local83 = local34 + local50 - local42 - local42;
		@Pc(92) int local92 = local38 + local54 - local46 - local46;
		@Pc(97) int local97 = local42 - local34;
		@Pc(102) int local102 = local46 - local38;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local104 * local112 >> 12;
			@Pc(122) int local122 = local64 * local118;
			@Pc(126) int local126 = local73 * local118;
			@Pc(130) int local130 = local83 * local112;
			@Pc(134) int local134 = local112 * local92;
			@Pc(138) int local138 = local104 * local97;
			@Pc(142) int local142 = local104 * local102;
			@Pc(154) int local154 = arg8 + (local138 + local122 + local130 >> 12);
			@Pc(165) int local165 = arg4 + (local134 + local126 + local142 >> 12);
			Static174.method3152(local165, local154, local30, local28, arg7);
			local28 = local154;
			local30 = local165;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!da;")
	public static Class69 method8673(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class368 local9 = Static43.method1103(arg0, arg1, arg2);
		return local9 == null ? null : local9.aClass69_14;
	}
}
