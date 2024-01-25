import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jk", name = "A", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "[Lclient!ph;")
	public static final Class11_Sub4_Sub14[] aClass11_Sub4_Sub14Array3 = new Class11_Sub4_Sub14[14];

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_49 = new Class117("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_50 = new Class117("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
	public static void method2258() {
		@Pc(5) Class26 local5 = Static342.aClass26_60;
		synchronized (Static342.aClass26_60) {
			Static342.aClass26_60.method328();
		}
		local5 = Static262.aClass26_48;
		synchronized (Static262.aClass26_48) {
			Static262.aClass26_48.method328();
		}
		@Pc(35) Class54 local35 = Static72.aClass54_1;
		synchronized (Static72.aClass54_1) {
			Static72.aClass54_1.method934();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg6;
		@Pc(20) int local20 = arg0 - arg6;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(32) int local32 = local16 * local16;
		@Pc(44) int local44 = local20 * local20;
		@Pc(48) int local48 = local28 << 1;
		@Pc(52) int local52 = local24 << 1;
		@Pc(56) int local56 = local44 << 1;
		@Pc(60) int local60 = local32 << 1;
		@Pc(64) int local64 = arg0 << 1;
		@Pc(68) int local68 = local20 << 1;
		@Pc(77) int local77 = local48 + local24 * (1 - local64);
		@Pc(86) int local86 = local28 - (local64 - 1) * local52;
		@Pc(95) int local95 = (1 - local68) * local32 + local56;
		@Pc(104) int local104 = local44 - local60 * (local68 - 1);
		@Pc(108) int local108 = local24 << 2;
		@Pc(112) int local112 = local28 << 2;
		@Pc(116) int local116 = local32 << 2;
		@Pc(120) int local120 = local44 << 2;
		@Pc(124) int local124 = local48 * 3;
		@Pc(130) int local130 = local52 * (local64 - 3);
		@Pc(134) int local134 = local56 * 3;
		@Pc(140) int local140 = local60 * (local68 - 3);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = (arg0 - 1) * local108;
		@Pc(150) int local150 = local120;
		@Pc(156) int local156 = local116 * (local20 - 1);
		@Pc(174) int local174;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(200) int local200;
		if (arg2 >= Static240.anInt4829 && arg2 <= Static166.anInt3315) {
			@Pc(166) int[] local166 = Static73.anIntArrayArray6[arg2];
			local174 = Static61.method917(Static280.anInt212, arg4 - arg1, Static346.anInt6607);
			local183 = Static61.method917(Static280.anInt212, arg4 + arg1, Static346.anInt6607);
			local192 = Static61.method917(Static280.anInt212, arg4 - local16, Static346.anInt6607);
			local200 = Static61.method917(Static280.anInt212, local16 + arg4, Static346.anInt6607);
			Static224.method5303(local166, local192, arg3, local174);
			Static224.method5303(local166, local200, arg5, local192);
			Static224.method5303(local166, local183, arg3, local200);
		}
		while (local9 > 0) {
			@Pc(227) boolean local227 = local20 >= local9;
			if (local77 < 0) {
				while (local77 < 0) {
					local86 += local142;
					local77 += local124;
					local142 += local112;
					local124 += local112;
					local7++;
				}
			}
			if (local227) {
				if (local95 < 0) {
					while (local95 < 0) {
						local104 += local150;
						local95 += local134;
						local150 += local120;
						local134 += local120;
						local11++;
					}
				}
				if (local104 < 0) {
					local104 += local150;
					local95 += local134;
					local150 += local120;
					local11++;
					local134 += local120;
				}
				local95 += -local156;
				local104 += -local140;
				local140 -= local116;
				local156 -= local116;
			}
			if (local86 < 0) {
				local77 += local124;
				local86 += local142;
				local124 += local112;
				local142 += local112;
				local7++;
			}
			local86 += -local130;
			local77 += -local148;
			local9--;
			local148 -= local108;
			local130 -= local108;
			local174 = arg2 - local9;
			local183 = arg2 + local9;
			if (local183 >= Static240.anInt4829 && local174 <= Static166.anInt3315) {
				local192 = Static61.method917(Static280.anInt212, local7 + arg4, Static346.anInt6607);
				local200 = Static61.method917(Static280.anInt212, arg4 - local7, Static346.anInt6607);
				if (local227) {
					@Pc(434) int local434 = Static61.method917(Static280.anInt212, local11 + arg4, Static346.anInt6607);
					@Pc(442) int local442 = Static61.method917(Static280.anInt212, arg4 - local11, Static346.anInt6607);
					@Pc(449) int[] local449;
					if (Static240.anInt4829 <= local174) {
						local449 = Static73.anIntArrayArray6[local174];
						Static224.method5303(local449, local442, arg3, local200);
						Static224.method5303(local449, local434, arg5, local442);
						Static224.method5303(local449, local192, arg3, local434);
					}
					if (local183 <= Static166.anInt3315) {
						local449 = Static73.anIntArrayArray6[local183];
						Static224.method5303(local449, local442, arg3, local200);
						Static224.method5303(local449, local434, arg5, local442);
						Static224.method5303(local449, local192, arg3, local434);
					}
				} else {
					if (Static240.anInt4829 <= local174) {
						Static224.method5303(Static73.anIntArrayArray6[local174], local192, arg3, local200);
					}
					if (Static166.anInt3315 >= local183) {
						Static224.method5303(Static73.anIntArrayArray6[local183], local192, arg3, local200);
					}
				}
			}
		}
	}
}
