import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!tj;")
	public static Class193 aClass193_94;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
	public static int anInt5767;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_44 = new Class116();

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "Lclient!se;")
	public static final Class180 aClass180_8 = new Class180();

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!sf;Z)Z")
	public static boolean method4952(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static261.aClass60Array2 == Static77.aClass60Array1;
		@Pc(8) int local8 = 0;
		arg0.method5628();
		if (arg0.aShort98 < 0 || arg0.aShort97 < 0 || arg0.aShort96 >= Static198.anInt4128 || arg0.aShort99 >= Static15.anInt1162) {
			return false;
		}
		@Pc(34) int local34;
		@Pc(37) int local37;
		for (@Pc(30) int local30 = arg0.aShort98; local30 <= arg0.aShort96; local30++) {
			for (local34 = arg0.aShort97; local34 <= arg0.aShort99; local34++) {
				local37 = 0;
				if (local30 > arg0.aShort98) {
					local37++;
				}
				if (local30 < arg0.aShort96) {
					local37 += 4;
				}
				if (local34 > arg0.aShort97) {
					local37 += 8;
				}
				if (local34 < arg0.aShort99) {
					local37 += 2;
				}
				Static269.method4620(arg0.aByte77, local30, local34);
				@Pc(71) Class128 local71 = Static273.aClass128ArrayArrayArray4[arg0.aByte77][local30][local34];
				@Pc(76) Class117 local76 = Static183.method3515(arg0, local37);
				@Pc(79) Class117 local79 = local71.aClass117_2;
				if (local79 == null) {
					local71.aClass117_2 = local76;
				} else {
					while (local79.aClass117_1 != null) {
						local79 = local79.aClass117_1;
					}
					local79.aClass117_1 = local76;
				}
				local71.aByte46 = (byte) (local71.aByte46 | local37);
				if (local6 && Static22.anIntArrayArray12[local30][local34] != 0) {
					local8 = Static22.anIntArrayArray12[local30][local34];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local34 = arg0.aShort98; local34 <= arg0.aShort96; local34++) {
				for (local37 = arg0.aShort97; local37 <= arg0.aShort99; local37++) {
					if (Static22.anIntArrayArray12[local34][local37] == 0) {
						Static22.anIntArrayArray12[local34][local37] = local8;
					}
				}
			}
		}
		if (arg1) {
			Static213.aClass8_Sub1Array1[Static329.anInt3942++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4953(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg4;
		@Pc(21) int local21 = arg2 - arg4;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg2 * arg2;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg2 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = (1 - local57) * local25 + local41;
		@Pc(80) int local80 = local29 - (local57 - 1) * local45;
		@Pc(89) int local89 = local49 + (1 - local61) * local33;
		@Pc(98) int local98 = local37 - (local61 - 1) * local53;
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = (local57 - 3) * local45;
		@Pc(128) int local128 = local49 * 3;
		@Pc(134) int local134 = local53 * (local61 - 3);
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = (arg2 - 1) * local102;
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (local21 - 1) * local110;
		@Pc(154) int[] local154 = Static223.anIntArrayArray124[arg1];
		Static135.method2878(local154, arg0 - local16, arg5, arg0 - arg6);
		Static135.method2878(local154, local16 + arg0, arg3, arg0 - local16);
		Static135.method2878(local154, arg0 + arg6, arg5, arg0 + local16);
		while (local9 > 0) {
			@Pc(195) boolean local195 = local21 >= local9;
			if (local195) {
				if (local89 < 0) {
					while (local89 < 0) {
						local98 += local144;
						local89 += local128;
						local128 += local114;
						local144 += local114;
						local11++;
					}
				}
				if (local98 < 0) {
					local98 += local144;
					local89 += local128;
					local128 += local114;
					local144 += local114;
					local11++;
				}
				local89 += -local150;
				local98 += -local134;
				local150 -= local110;
				local134 -= local110;
			}
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local118;
					local80 += local136;
					local118 += local106;
					local136 += local106;
					local7++;
				}
			}
			if (local80 < 0) {
				local80 += local136;
				local71 += local118;
				local118 += local106;
				local7++;
				local136 += local106;
			}
			local80 += -local124;
			local71 += -local142;
			local142 -= local102;
			local124 -= local102;
			local9--;
			@Pc(329) int local329 = arg1 - local9;
			@Pc(333) int local333 = local9 + arg1;
			@Pc(337) int local337 = local7 + arg0;
			@Pc(342) int local342 = arg0 - local7;
			if (local195) {
				@Pc(366) int local366 = arg0 + local11;
				@Pc(371) int local371 = arg0 - local11;
				Static135.method2878(Static223.anIntArrayArray124[local329], local371, arg5, local342);
				Static135.method2878(Static223.anIntArrayArray124[local329], local366, arg3, local371);
				Static135.method2878(Static223.anIntArrayArray124[local329], local337, arg5, local366);
				Static135.method2878(Static223.anIntArrayArray124[local333], local371, arg5, local342);
				Static135.method2878(Static223.anIntArrayArray124[local333], local366, arg3, local371);
				Static135.method2878(Static223.anIntArrayArray124[local333], local337, arg5, local366);
			} else {
				Static135.method2878(Static223.anIntArrayArray124[local329], local337, arg5, local342);
				Static135.method2878(Static223.anIntArrayArray124[local333], local337, arg5, local342);
			}
		}
	}
}
