import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString134;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public static int anInt10348;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_64 = new Class183();

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_153 = new Class276(86, 4);

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_154 = new Class276(3, 2);

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "[I")
	public static int[] anIntArray676 = new int[1];

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_155 = new Class276(113, 2);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Lclient!mv;")
	public static Class219 method8340(@OriginalArg(0) int arg0) {
		@Pc(6) Class219[] local6 = Static186.method3278();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (local6[local8].anInt6953 == arg0) {
				return local6[local8];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBIIIII)V")
	public static void method8341(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static347.method5856(arg4);
		@Pc(8) int local8 = 0;
		@Pc(13) int local13 = arg4 - arg2;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg4;
		@Pc(25) int local25 = -arg4;
		@Pc(27) int local27 = local13;
		@Pc(30) int local30 = -local13;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(43) int[] local43 = Static333.anIntArrayArray56[arg3];
		@Pc(48) int local48 = arg0 - local13;
		Static426.method6794(local48, local43, arg0 - arg4, arg1);
		@Pc(61) int local61 = local13 + arg0;
		Static426.method6794(local61, local43, local48, arg5);
		Static426.method6794(arg4 + arg0, local43, local61, arg1);
		while (local8 < local22) {
			local32 += 2;
			local34 += 2;
			local30 += local34;
			local25 += local32;
			if (local30 >= 0 && local27 >= 1) {
				Static370.anIntArray467[local27] = local8;
				local27--;
				local30 -= local27 << 1;
			}
			local8++;
			@Pc(126) int[] local126;
			@Pc(132) int[] local132;
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (local25 >= 0) {
				local22--;
				local25 -= local22 << 1;
				if (local13 <= local22) {
					local126 = Static333.anIntArrayArray56[arg3 + local22];
					local132 = Static333.anIntArrayArray56[arg3 - local22];
					local136 = arg0 + local8;
					local141 = arg0 - local8;
					Static426.method6794(local136, local126, local141, arg1);
					Static426.method6794(local136, local132, local141, arg1);
				} else {
					local126 = Static333.anIntArrayArray56[arg3 + local22];
					local132 = Static333.anIntArrayArray56[arg3 - local22];
					local136 = Static370.anIntArray467[local22];
					local141 = local8 + arg0;
					local180 = arg0 - local8;
					local185 = arg0 + local136;
					local190 = arg0 - local136;
					Static426.method6794(local190, local126, local180, arg1);
					Static426.method6794(local185, local126, local190, arg5);
					Static426.method6794(local141, local126, local185, arg1);
					Static426.method6794(local190, local132, local180, arg1);
					Static426.method6794(local185, local132, local190, arg5);
					Static426.method6794(local141, local132, local185, arg1);
				}
			}
			local126 = Static333.anIntArrayArray56[local8 + arg3];
			local132 = Static333.anIntArrayArray56[arg3 - local8];
			local136 = arg0 + local22;
			local141 = arg0 - local22;
			if (local13 <= local8) {
				Static426.method6794(local136, local126, local141, arg1);
				Static426.method6794(local136, local132, local141, arg1);
			} else {
				local180 = local8 > local27 ? Static370.anIntArray467[local8] : local27;
				local185 = arg0 + local180;
				local190 = arg0 - local180;
				Static426.method6794(local190, local126, local141, arg1);
				Static426.method6794(local185, local126, local190, arg5);
				Static426.method6794(local136, local126, local185, arg1);
				Static426.method6794(local190, local132, local141, arg1);
				Static426.method6794(local185, local132, local190, arg5);
				Static426.method6794(local136, local132, local185, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!oa;Lclient!pe;)V")
	public static void method8342(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class254 arg1) {
		@Pc(8) Class20[] local8 = Static599.method813(arg1, Static370.anInt7270);
		Static582.aClass37Array16 = new Class37[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static582.aClass37Array16[local14] = arg0.method5275(local8[local14], true);
		}
		local8 = Static599.method813(arg1, Static260.anInt5555);
		Static554.aClass37Array13 = new Class37[local8.length];
		for (@Pc(40) int local40 = 0; local40 < local8.length; local40++) {
			Static554.aClass37Array13[local40] = arg0.method5275(local8[local40], true);
		}
		local8 = Static599.method813(arg1, Static312.anInt6270);
		Static61.aClass37Array1 = new Class37[local8.length];
		for (@Pc(66) int local66 = 0; local66 < local8.length; local66++) {
			Static61.aClass37Array1[local66] = arg0.method5275(local8[local66], true);
		}
		local8 = Static599.method813(arg1, Static506.anInt9835);
		Static561.aClass37Array14 = new Class37[local8.length];
		for (@Pc(92) int local92 = 0; local92 < local8.length; local92++) {
			Static561.aClass37Array14[local92] = arg0.method5275(local8[local92], true);
		}
		local8 = Static599.method813(arg1, Static545.anInt9831);
		Static326.aClass37Array6 = new Class37[local8.length];
		for (@Pc(122) int local122 = 0; local122 < local8.length; local122++) {
			Static326.aClass37Array6[local122] = arg0.method5275(local8[local122], true);
		}
		local8 = Static599.method813(arg1, Static459.anInt8633);
		Static78.aClass37Array3 = new Class37[local8.length];
		for (@Pc(152) int local152 = 0; local152 < local8.length; local152++) {
			Static78.aClass37Array3[local152] = arg0.method5275(local8[local152], true);
		}
		local8 = Static599.method813(arg1, Static560.anInt9971);
		Static460.aClass37Array9 = new Class37[local8.length];
		for (@Pc(182) int local182 = 0; local182 < local8.length; local182++) {
			Static460.aClass37Array9[local182] = arg0.method5275(local8[local182], true);
		}
		local8 = Static599.method813(arg1, Static486.anInt9076);
		Static118.aClass37Array10 = new Class37[local8.length];
		for (@Pc(208) int local208 = 0; local208 < local8.length; local208++) {
			Static118.aClass37Array10[local208] = arg0.method5275(local8[local208], true);
		}
		local8 = Static599.method813(arg1, Static525.anInt9590);
		Static569.aClass37Array15 = new Class37[local8.length];
		for (@Pc(238) int local238 = 0; local238 < local8.length; local238++) {
			Static569.aClass37Array15[local238] = arg0.method5275(local8[local238], true);
		}
		local8 = Static599.method813(arg1, Static374.anInt7300);
		Static394.aClass37Array8 = new Class37[local8.length];
		for (@Pc(264) int local264 = 0; local264 < local8.length; local264++) {
			Static394.aClass37Array8[local264] = arg0.method5275(local8[local264], true);
		}
		local8 = Static599.method813(arg1, Static186.anInt3735);
		Static78.aClass37Array2 = new Class37[local8.length];
		for (@Pc(290) int local290 = 0; local290 < local8.length; local290++) {
			Static78.aClass37Array2[local290] = arg0.method5275(local8[local290], true);
		}
		local8 = Static599.method813(arg1, Static337.anInt6959);
		Static541.aClass37Array12 = new Class37[local8.length];
		for (@Pc(320) int local320 = 0; local320 < local8.length; local320++) {
			Static541.aClass37Array12[local320] = arg0.method5275(local8[local320], true);
		}
		Static280.aClass37_41 = arg0.method5275(Static599.method814(arg1, Static287.anInt5958, 0), true);
		Static284.aClass37_32 = arg0.method5275(Static599.method814(arg1, Static150.anInt3338, 0), true);
		local8 = Static599.method813(arg1, Static125.anInt2898);
		Static594.aClass37Array17 = new Class37[local8.length];
		for (@Pc(366) int local366 = 0; local366 < local8.length; local366++) {
			Static594.aClass37Array17[local366] = arg0.method5275(local8[local366], true);
		}
	}
}
