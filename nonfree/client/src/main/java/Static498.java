import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_109 = new Class154(11, -1);

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "Lclient!mi;")
	public static final Class6 aClass6_1 = Static482.method6228();

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	public static final int anInt7931 = 4;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	public static void method6447() {
		@Pc(17) Class21 local17 = Static133.aClass21_19;
		synchronized (Static133.aClass21_19) {
			Static133.aClass21_19.method314();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg3;
		@Pc(21) int local21 = arg4 - arg3;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(78) int local78 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
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
		@Pc(148) int local148 = local108 * (local21 - 1);
		@Pc(152) int[] local152 = Static238.anIntArrayArray36[arg2];
		Static437.method5735(arg5 - arg6, local152, arg5 - local16, arg1);
		Static437.method5735(arg5 - local16, local152, local16 + arg5, arg0);
		Static437.method5735(local16 + arg5, local152, arg5 + arg6, arg1);
		while (local9 > 0) {
			@Pc(197) boolean local197 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local78 += local134;
					local70 += local116;
					local134 += local104;
					local116 += local104;
					local7++;
				}
			}
			if (local197) {
				if (local88 < 0) {
					while (local88 < 0) {
						local96 += local142;
						local88 += local126;
						local142 += local112;
						local126 += local112;
						local11++;
					}
				}
				if (local96 < 0) {
					local96 += local142;
					local88 += local126;
					local126 += local112;
					local142 += local112;
					local11++;
				}
				local88 += -local148;
				local96 += -local132;
				local148 -= local108;
				local132 -= local108;
			}
			if (local78 < 0) {
				local78 += local134;
				local70 += local116;
				local134 += local104;
				local7++;
				local116 += local104;
			}
			local78 += -local122;
			local70 += -local140;
			local9--;
			local140 -= local100;
			local122 -= local100;
			@Pc(334) int local334 = arg2 - local9;
			@Pc(338) int local338 = arg2 + local9;
			@Pc(342) int local342 = local7 + arg5;
			@Pc(347) int local347 = arg5 - local7;
			if (local197) {
				@Pc(353) int local353 = arg5 + local11;
				@Pc(357) int local357 = arg5 - local11;
				Static437.method5735(local347, Static238.anIntArrayArray36[local334], local357, arg1);
				Static437.method5735(local357, Static238.anIntArrayArray36[local334], local353, arg0);
				Static437.method5735(local353, Static238.anIntArrayArray36[local334], local342, arg1);
				Static437.method5735(local347, Static238.anIntArrayArray36[local338], local357, arg1);
				Static437.method5735(local357, Static238.anIntArrayArray36[local338], local353, arg0);
				Static437.method5735(local353, Static238.anIntArrayArray36[local338], local342, arg1);
			} else {
				Static437.method5735(local347, Static238.anIntArrayArray36[local334], local342, arg1);
				Static437.method5735(local347, Static238.anIntArrayArray36[local338], local342, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public static void method6450() {
		@Pc(16) int local16 = Static257.aClass2_Sub35_Sub1_1.method6041(Static226.anInt3318);
		if (local16 == 0) {
			Class2_Sub35_Sub1.lb = null;
			Static114.method1672(0);
		} else if (local16 == 1) {
			Static55.method947((byte) 0);
			Static114.method1672(512);
			if (Static433.aByteArrayArrayArray15 != null) {
				Static324.method4716();
			}
		} else {
			Static55.method947((byte) (Static388.anInt6397 - 4 & 0xFF));
			Static114.method1672(2);
		}
		Static241.anInt3998 = Static402.anInt6620;
	}
}
