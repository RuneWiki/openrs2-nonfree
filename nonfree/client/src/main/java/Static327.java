import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qm", name = "R", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_194 = new Class175("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!qa;Lclient!cc;ILclient!tn;)Z")
	public static boolean method4766(@OriginalArg(2) Class75 arg0, @OriginalArg(3) Class3_Sub8 arg1, @OriginalArg(5) Class223 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray484 != null) {
			local11 = Static210.anInt7500 - (arg2.anInt6737 + arg1.anInt1154 - Static210.anInt7504) * (Static210.anInt7500 + -Static210.anInt7503) / (Static210.anInt7497 - Static210.anInt7504);
			local9 = Static210.anInt7498 + (Static210.anInt7494 - Static210.anInt7498) * (arg2.anInt6726 + arg1.anInt1153 - Static210.anInt7499) / (Static210.anInt7502 - Static210.anInt7499);
			local7 = (arg2.anInt6716 + arg1.anInt1153 - Static210.anInt7499) * (Static210.anInt7494 - Static210.anInt7498) / (Static210.anInt7502 - Static210.anInt7499) + Static210.anInt7498;
			local13 = Static210.anInt7500 - (arg1.anInt1154 + arg2.anInt6733 - Static210.anInt7504) * (Static210.anInt7500 + -Static210.anInt7503) / (Static210.anInt7497 - Static210.anInt7504);
		}
		@Pc(102) Class22 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg2.anInt6703 != -1) {
			if (arg1.aBoolean94 && arg2.anInt6712 != -1) {
				local102 = arg2.method5279(true, arg0);
			} else {
				local102 = arg2.method5279(false, arg0);
			}
			if (local102 != null) {
				local104 = arg1.anInt1151 - (local102.ja() + 1 >> 1);
				local106 = arg1.anInt1151 + (local102.ja() + 1 >> 1);
				if (local7 > local104) {
					local7 = local104;
				}
				if (local106 > local9) {
					local9 = local106;
				}
				local108 = arg1.anInt1155 - (local102.JA() + 1 >> 1);
				local110 = arg1.anInt1155 + (local102.JA() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				if (local110 > local13) {
					local13 = local110;
				}
			}
		}
		@Pc(205) Class244 local205 = null;
		@Pc(207) int local207 = 0;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(269) int local269;
		@Pc(292) int local292;
		if (arg2.aString61 != null) {
			local205 = Static306.method4514(arg2.anInt6719);
			if (local205 != null) {
				local207 = Static87.aClass179_7.method4391(null, null, arg2.aString61, Static328.aStringArray143);
				local209 = arg1.anInt1155;
				if (local102 == null) {
					local209 -= local205.method5572() * local207 / 2;
				} else {
					local209 -= (local102.JA() >> 1) + (local207 * local205.method5574());
				}
				for (local269 = 0; local269 < local207; local269++) {
					@Pc(275) String local275 = Static328.aStringArray143[local269];
					if (local207 - 1 > local269) {
						local275 = local275.substring(0, local275.length() - 4);
					}
					local292 = local205.method5568(local275);
					if (local211 < local292) {
						local211 = local292;
					}
				}
				local213 = arg1.anInt1151 - local211 / 2;
				if (local7 > local213) {
					local7 = local213;
				}
				local215 = arg1.anInt1151 + local211 / 2;
				local217 = local209;
				if (local215 > local9) {
					local9 = local215;
				}
				local219 = local209 + local207 * local205.method5574();
				if (local11 > local217) {
					local11 = local217;
				}
				if (local13 < local219) {
					local13 = local219;
				}
			}
		}
		if (local9 < Static210.anInt7498 || local7 > Static210.anInt7494 || local13 < Static210.anInt7503 || local11 > Static210.anInt7500) {
			return true;
		}
		@Pc(394) int local394;
		if (arg2.anIntArray484 != null) {
			@Pc(392) int[] local392 = new int[arg2.anIntArray484.length];
			for (local394 = 0; local394 < local392.length / 2; local394++) {
				local292 = arg2.anIntArray484[local394 * 2] + arg1.anInt1153;
				@Pc(419) int local419 = arg2.anIntArray484[local394 * 2 + 1] + arg1.anInt1154;
				local392[local394 * 2] = (Static210.anInt7494 - Static210.anInt7498) * (-Static210.anInt7499 + local292) / (Static210.anInt7502 - Static210.anInt7499) + Static210.anInt7498;
				local392[local394 * 2 + 1] = Static210.anInt7500 - (Static210.anInt7500 - Static210.anInt7503) * (local419 - Static210.anInt7504) / (Static210.anInt7497 - Static210.anInt7504);
			}
			Static387.method5270(arg0, local392, arg2.anInt6734);
			for (local292 = 0; local292 < local392.length / 2 - 1; local292++) {
				arg0.method2632(arg2.anInt6727, local392[local292 * 2], local392[local292 * 2 + 2], local392[local292 * 2 + 1], local392[(local292 + 1) * 2 + 1]);
			}
			arg0.method2632(arg2.anInt6727, local392[local392.length - 2], local392[0], local392[local392.length - 1], local392[1]);
		}
		if (local102 != null) {
			if (Static284.anInt5213 > 0 && (Static166.anInt3528 != -1 && Static166.anInt3528 == arg1.anInt1157 || Static411.anInt7104 != -1 && arg2.anInt6730 == Static411.anInt7104)) {
				if (Static27.anInt771 <= 50) {
					local269 = Static27.anInt771 * 2;
				} else {
					local269 = (100 - Static27.anInt771) * 2;
				}
				local394 = local269 << 24 | 0xFFFF00;
				arg0.method2611(local102.UA() / 2 + 7, arg1.anInt1151, arg1.anInt1155, local394);
				arg0.method2611(local102.UA() / 2 + 5, arg1.anInt1151, arg1.anInt1155, local394);
				arg0.method2611(local102.UA() / 2 + 3, arg1.anInt1151, arg1.anInt1155, local394);
				arg0.method2611(local102.UA() / 2 + 1, arg1.anInt1151, arg1.anInt1155, local394);
				arg0.method2611(local102.UA() / 2, arg1.anInt1151, arg1.anInt1155, local394);
			}
			local102.method6074(arg1.anInt1151 - (local102.ja() >> 1), arg1.anInt1155 - (local102.JA() >> 1));
		}
		if (arg2.aString61 != null && local205 != null) {
			Static278.method5345(local205, arg0, arg2, local209, local211, local207, arg1);
		}
		if (arg2.anInt6703 != -1 || arg2.aString61 != null) {
			@Pc(712) Class3_Sub41 local712 = new Class3_Sub41(arg1);
			local712.anInt6773 = local215;
			local712.anInt6768 = local104;
			local712.anInt6762 = local106;
			local712.anInt6763 = local108;
			local712.anInt6770 = local110;
			local712.anInt6771 = local217;
			local712.anInt6775 = local219;
			local712.anInt6774 = local213;
			Static316.aClass229_35.method5321(local712);
		}
		return false;
	}
}
