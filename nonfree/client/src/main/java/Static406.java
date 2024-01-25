import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!vq;")
	public static Class257 aClass257_3;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_100 = new Class242("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg3 - arg2;
		@Pc(18) int local18 = arg6 + arg2;
		for (@Pc(20) int local20 = arg6; local20 < local18; local20++) {
			Static335.method4533(arg0, arg1, arg4, Static162.anIntArrayArray58[local20]);
		}
		@Pc(38) int local38 = arg2 + arg4;
		for (@Pc(40) int local40 = arg3; local40 > local14; local40--) {
			Static335.method4533(arg0, arg1, arg4, Static162.anIntArrayArray58[local40]);
		}
		@Pc(65) int local65 = arg0 - arg2;
		for (@Pc(67) int local67 = local18; local67 <= local14; local67++) {
			@Pc(73) int[] local73 = Static162.anIntArrayArray58[local67];
			Static335.method4533(local38, arg1, arg4, local73);
			Static335.method4533(local65, arg5, local38, local73);
			Static335.method4533(arg0, arg1, local65, local73);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBIIIIII)V")
	public static void method5367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg4;
		@Pc(21) int local21 = arg1 - arg4;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = (1 - local57) * local25 + local41;
		@Pc(80) int local80 = local29 - (local57 - 1) * local45;
		@Pc(89) int local89 = local49 + local33 * (1 - local61);
		@Pc(98) int local98 = local37 - (local61 - 1) * local53;
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(123) int local123 = local41 * 3;
		@Pc(129) int local129 = local45 * (local57 - 3);
		@Pc(133) int local133 = local49 * 3;
		@Pc(139) int local139 = (local61 - 3) * local53;
		@Pc(141) int local141 = local106;
		@Pc(147) int local147 = local102 * (arg1 - 1);
		@Pc(149) int local149 = local114;
		@Pc(155) int local155 = (local21 - 1) * local110;
		@Pc(159) int[] local159 = Static162.anIntArrayArray58[arg0];
		Static335.method4533(arg6 - local16, arg5, arg6 - arg3, local159);
		Static335.method4533(local16 + arg6, arg2, arg6 - local16, local159);
		Static335.method4533(arg6 + arg3, arg5, arg6 + local16, local159);
		while (local9 > 0) {
			@Pc(204) boolean local204 = local21 >= local9;
			if (local71 < 0) {
				while (local71 < 0) {
					local80 += local141;
					local71 += local123;
					local7++;
					local123 += local106;
					local141 += local106;
				}
			}
			if (local204) {
				if (local89 < 0) {
					while (local89 < 0) {
						local98 += local149;
						local89 += local133;
						local133 += local114;
						local11++;
						local149 += local114;
					}
				}
				if (local98 < 0) {
					local98 += local149;
					local89 += local133;
					local149 += local114;
					local11++;
					local133 += local114;
				}
				local89 += -local155;
				local98 += -local139;
				local155 -= local110;
				local139 -= local110;
			}
			if (local80 < 0) {
				local71 += local123;
				local80 += local141;
				local7++;
				local123 += local106;
				local141 += local106;
			}
			local71 += -local147;
			local80 += -local129;
			local147 -= local102;
			local9--;
			local129 -= local102;
			@Pc(341) int local341 = arg0 - local9;
			@Pc(346) int local346 = arg0 + local9;
			@Pc(350) int local350 = arg6 + local7;
			@Pc(355) int local355 = arg6 - local7;
			if (local204) {
				@Pc(361) int local361 = arg6 + local11;
				@Pc(366) int local366 = arg6 - local11;
				Static335.method4533(local366, arg5, local355, Static162.anIntArrayArray58[local341]);
				Static335.method4533(local361, arg2, local366, Static162.anIntArrayArray58[local341]);
				Static335.method4533(local350, arg5, local361, Static162.anIntArrayArray58[local341]);
				Static335.method4533(local366, arg5, local355, Static162.anIntArrayArray58[local346]);
				Static335.method4533(local361, arg2, local366, Static162.anIntArrayArray58[local346]);
				Static335.method4533(local350, arg5, local361, Static162.anIntArrayArray58[local346]);
			} else {
				Static335.method4533(local350, arg5, local355, Static162.anIntArrayArray58[local341]);
				Static335.method4533(local350, arg5, local355, Static162.anIntArrayArray58[local346]);
			}
		}
	}
}
