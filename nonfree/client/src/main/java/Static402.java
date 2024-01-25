import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
	public static int anInt6690;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	public static int anInt6692 = 0;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_150 = new Class209("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_23 = new Class214(11, 18);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!cu;Lclient!ya;ILclient!hq;)Z")
	public static boolean method5290(@OriginalArg(2) Class48 arg0, @OriginalArg(3) Class49 arg1, @OriginalArg(5) Class2_Sub18 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg0.anIntArray86 != null) {
			local7 = (Static88.anInt4516 - Static88.anInt4524) * (arg2.anInt3147 + arg0.anInt1218 - Static88.anInt4514) / (Static88.anInt4525 - Static88.anInt4514) + Static88.anInt4524;
			local16 = Static88.anInt4523 - (Static88.anInt4523 - Static88.anInt4518) * (arg0.anInt1217 - (-arg2.anInt3146 - -Static88.anInt4521)) / (Static88.anInt4517 - Static88.anInt4521);
			local9 = Static88.anInt4524 + (Static88.anInt4516 - Static88.anInt4524) * (-Static88.anInt4514 + arg2.anInt3147 + arg0.anInt1222) / (Static88.anInt4525 - Static88.anInt4514);
			local18 = Static88.anInt4523 - (Static88.anInt4523 - Static88.anInt4518) * (arg0.anInt1216 + arg2.anInt3146 + -Static88.anInt4521) / (Static88.anInt4517 - Static88.anInt4521);
		}
		@Pc(110) Class17 local110 = null;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		if (arg0.anInt1227 != -1) {
			if (arg2.aBoolean243 && arg0.anInt1202 != -1) {
				local110 = arg0.method923(arg1, true);
			} else {
				local110 = arg0.method923(arg1, false);
			}
			if (local110 != null) {
				local112 = arg2.anInt3145 - (local110.j() + 1 >> 1);
				local114 = arg2.anInt3145 + (local110.j() + 1 >> 1);
				if (local112 < local7) {
					local7 = local112;
				}
				if (local9 < local114) {
					local9 = local114;
				}
				local116 = arg2.anInt3144 - (local110.T() + 1 >> 1);
				if (local116 < local16) {
					local16 = local116;
				}
				local118 = arg2.anInt3144 + (local110.T() + 1 >> 1);
				if (local18 < local118) {
					local18 = local118;
				}
			}
		}
		@Pc(217) Class28 local217 = null;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(281) int local281;
		@Pc(308) int local308;
		if (arg0.aString7 != null) {
			local217 = Static219.method3436(arg0.anInt1209);
			if (local217 != null) {
				local219 = Static86.aClass58_10.method1348(Static300.aStringArray38, null, arg0.aString7, null);
				local221 = arg2.anInt3144;
				if (local110 == null) {
					local221 -= local217.method530() * local219 / 2;
				} else {
					local221 -= (local110.T() >> 1) + (local217.method528() * local219);
				}
				for (local281 = 0; local281 < local219; local281++) {
					@Pc(287) String local287 = Static300.aStringArray38[local281];
					if (local281 < local219 - 1) {
						local287 = local287.substring(0, local287.length() - 4);
					}
					local308 = local217.method531(local287);
					if (local223 < local308) {
						local223 = local308;
					}
				}
				local225 = arg2.anInt3145 - local223 / 2;
				if (local225 < local7) {
					local7 = local225;
				}
				local227 = arg2.anInt3145 + local223 / 2;
				if (local227 > local9) {
					local9 = local227;
				}
				local229 = local221;
				local231 = local221 + local219 * local217.method528();
				if (local229 < local16) {
					local16 = local229;
				}
				if (local18 < local231) {
					local18 = local231;
				}
			}
		}
		if (local9 < Static88.anInt4524 || local7 > Static88.anInt4516 || local18 < Static88.anInt4518 || local16 > Static88.anInt4523) {
			return true;
		}
		@Pc(407) int local407;
		if (arg0.anIntArray86 != null) {
			@Pc(405) int[] local405 = new int[arg0.anIntArray86.length];
			for (local407 = 0; local407 < local405.length / 2; local407++) {
				local308 = arg0.anIntArray86[local407 * 2] + arg2.anInt3147;
				@Pc(433) int local433 = arg0.anIntArray86[local407 * 2 + 1] + arg2.anInt3146;
				local405[local407 * 2] = Static88.anInt4524 + (local308 - Static88.anInt4514) * (Static88.anInt4516 + -Static88.anInt4524) / (Static88.anInt4525 - Static88.anInt4514);
				local405[local407 * 2 + 1] = Static88.anInt4523 - (Static88.anInt4523 - Static88.anInt4518) * (-Static88.anInt4521 + local433) / (Static88.anInt4517 - Static88.anInt4521);
			}
			Static433.method5665(arg1, local405, arg0.anInt1199);
			for (local308 = 0; local308 < local405.length / 2 - 1; local308++) {
				arg1.method4452(local405[local308 * 2 + 2], local405[(local308 + 1) * 2 + 1], local405[local308 * 2], local405[local308 * 2 + 1], arg0.anInt1223);
			}
			arg1.method4452(local405[0], local405[1], local405[local405.length - 2], local405[local405.length - 1], arg0.anInt1223);
		}
		if (local110 != null) {
			if (Static338.anInt6358 > 0 && (Static441.anInt300 != -1 && arg2.anInt3142 == Static441.anInt300 || Static170.anInt3362 != -1 && arg0.anInt1195 == Static170.anInt3362)) {
				if (Static377.anInt6398 > 50) {
					local281 = (100 - Static377.anInt6398) * 2;
				} else {
					local281 = Static377.anInt6398 * 2;
				}
				local407 = local281 << 24 | 0xFFFF00;
				arg1.method4418(local110.la() / 2 + 7, arg2.anInt3144, local407, arg2.anInt3145);
				arg1.method4418(local110.la() / 2 + 5, arg2.anInt3144, local407, arg2.anInt3145);
				arg1.method4418(local110.la() / 2 + 3, arg2.anInt3144, local407, arg2.anInt3145);
				arg1.method4418(local110.la() / 2 + 1, arg2.anInt3144, local407, arg2.anInt3145);
				arg1.method4418(local110.la() / 2, arg2.anInt3144, local407, arg2.anInt3145);
			}
			local110.method5767(arg2.anInt3145 - (local110.j() >> 1), arg2.anInt3144 - (local110.T() >> 1));
		}
		if (arg0.aString7 != null && local217 != null) {
			Static188.method2976(local221, arg1, arg0, local217, local223, local219, arg2);
		}
		if (arg0.anInt1227 != -1 || arg0.aString7 != null) {
			@Pc(724) Class2_Sub33 local724 = new Class2_Sub33(arg2);
			local724.anInt5393 = local118;
			local724.anInt5396 = local231;
			local724.anInt5399 = local114;
			local724.anInt5394 = local227;
			local724.anInt5401 = local116;
			local724.anInt5400 = local225;
			local724.anInt5390 = local229;
			local724.anInt5398 = local112;
			Static113.aClass14_20.method300(local724);
		}
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ef;I[I[IBI)Lclient!sj;")
	public static Class73_Sub2 method5293(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(21) byte[] local21 = new byte[arg1 * arg4];
		for (@Pc(23) int local23 = 0; local23 < arg1; local23++) {
			@Pc(33) int local33 = arg3[local23] + arg4 * local23;
			for (@Pc(35) int local35 = 0; local35 < arg2[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class73_Sub2(arg0, arg4, arg1, local21);
	}
}
