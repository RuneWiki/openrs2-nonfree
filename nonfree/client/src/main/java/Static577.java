import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
	public static int anInt9916;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
	public static int anInt9918;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "Lclient!kea;")
	public static Class170 aClass170_3;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_154 = new Class98(13, 0);

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_155 = new Class98(103, 2);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public static void method7886() {
		Static459.aClass298_171.method6808();
		Static415.aClass298_156.method6808();
		@Pc(26) int local26;
		for (@Pc(21) Class6_Sub26 local21 = (Class6_Sub26) Static408.aClass298_154.method6809(); local21 != null; local21 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			local26 = local21.anInt5472;
			if (local26 < 1000) {
				local21.method7948();
				if (local26 == 58 || local26 == 18 || local26 == 44 || local26 == 3 || local26 == 10 || local26 == 51 || local26 == 5) {
					Static415.aClass298_156.method6812(local21);
				} else {
					Static459.aClass298_171.method6812(local21);
				}
			}
		}
		Static459.aClass298_171.method6817(Static408.aClass298_154);
		Static415.aClass298_156.method6817(Static408.aClass298_154);
		if (Static384.anInt7048 <= 1) {
			Static222.aClass6_Sub26_1 = null;
		} else if (Static9.aBoolean9 && Static184.aClass262_1.method6381(81) && Static384.anInt7048 > 2) {
			Static222.aClass6_Sub26_1 = (Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283.aClass6_283;
		} else {
			Static222.aClass6_Sub26_1 = (Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283;
		}
		local26 = -1;
		@Pc(127) Class6_Sub41 local127 = (Class6_Sub41) Static43.aClass298_22.method6809();
		if (local127 != null) {
			local26 = local127.method6484();
		}
		if (!Static266.aBoolean351) {
			if (local26 == 0 && (Static451.anInt7957 == 1 && Static384.anInt7048 > 2 || Static76.method1089())) {
				local26 = 2;
			}
			if (local26 == 2 && Static384.anInt7048 > 0 && local127 != null) {
				if (Static165.aClass97_8 == null && Static437.anInt7773 == 0) {
					Static375.method7249(local127.method6487(), local127.method6480());
				} else {
					Static475.anInt8361 = 2;
				}
			}
			if (local26 == 0 && Static384.anInt7048 > 0) {
				Static324.method4989();
			}
			if (Static165.aClass97_8 == null && Static437.anInt7773 == 0) {
				Static475.anInt8361 = 0;
				Static364.aClass6_Sub26_2 = null;
				return;
			}
			return;
		}
		@Pc(212) int local212;
		@Pc(216) int local216;
		if (local26 == -1) {
			local212 = Static9.aClass29_1.method2946();
			local216 = Static9.aClass29_1.method2942();
			if (Static420.anInt8173 - 10 > local212 || Static237.anInt4304 + Static420.anInt8173 + 10 < local212 || local216 < Static308.anInt5670 - 10 || local216 > Static415.anInt7406 + Static308.anInt5670 + 10) {
				Static286.method4360();
			}
		}
		if (local26 != 0) {
			return;
		}
		local212 = Static420.anInt8173;
		local216 = Static308.anInt5670;
		@Pc(261) int local261 = Static237.anInt4304;
		@Pc(265) int local265 = local127.method6487();
		@Pc(269) int local269 = local127.method6480();
		@Pc(271) int local271 = -1;
		@Pc(290) int local290;
		for (@Pc(273) int local273 = 0; local273 < Static384.anInt7048; local273++) {
			if (Static544.aBoolean506) {
				local290 = local216 + (Static384.anInt7048 - (1 - -local273)) * 16 + 33;
				if (local212 < local265 && local261 + local212 > local265 && local290 - 13 < local269 && local269 < local290 + 4) {
					local271 = local273;
				}
			} else {
				local290 = local216 + (-local273 + (Static384.anInt7048 - 1)) * 16 + 31;
				if (local265 > local212 && local212 + local261 > local265 && local290 - 13 < local269 && local290 + 3 > local269) {
					local271 = local273;
				}
			}
		}
		if (local271 != -1) {
			local290 = 0;
			@Pc(384) Class95 local384 = new Class95(Static408.aClass298_154);
			for (@Pc(389) Class6_Sub26 local389 = (Class6_Sub26) local384.method2270(); local389 != null; local389 = (Class6_Sub26) local384.method2272()) {
				if (local290 == local271) {
					Static428.method6091(local269, local265, local389);
				}
				local290++;
			}
		}
		Static286.method4360();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIZIII)V")
	public static void method7887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(25) int local25 = arg4 - 334;
		if (local25 < 0) {
			local25 = 0;
		} else if (local25 > 100) {
			local25 = 100;
		}
		@Pc(47) int local47 = (Static44.aShort12 - Static567.aShort127) * local25 / 100 + Static567.aShort127;
		if (local47 < Static439.aShort98) {
			local47 = Static439.aShort98;
		} else if (local47 > Static354.aShort86) {
			local47 = Static354.aShort86;
		}
		@Pc(77) int local77 = local47 * 512 * arg4 / (arg0 * 334);
		@Pc(118) int local118;
		@Pc(125) int local125;
		@Pc(93) short local93;
		if (Static106.aShort61 > local77) {
			local93 = Static106.aShort61;
			local47 = arg0 * 334 * local93 / (arg4 * 512);
			if (local47 > Static354.aShort86) {
				local47 = Static354.aShort86;
				local118 = local47 * 512 * arg4 / (local93 * 334);
				local125 = (arg0 - local118) / 2;
				if (arg2) {
					Static554.aClass90_12.F();
					Static554.aClass90_12.method7482(arg1, -16777216, local125, arg4, arg3);
					Static554.aClass90_12.method7482(arg1, -16777216, local125, arg4, arg0 + arg3 - local125);
				}
				arg3 += local125;
				arg0 -= local125 * 2;
			}
		} else if (local77 > Static482.aShort105) {
			local93 = Static482.aShort105;
			local47 = arg0 * 334 * local93 / (arg4 * 512);
			if (Static439.aShort98 > local47) {
				local47 = Static439.aShort98;
				local118 = local93 * 334 * arg0 / (local47 * 512);
				local125 = (arg4 - local118) / 2;
				if (arg2) {
					Static554.aClass90_12.F();
					Static554.aClass90_12.method7482(arg1, -16777216, arg0, local125, arg3);
					Static554.aClass90_12.method7482(arg1 + arg4 - local125, -16777216, arg0, local125, arg3);
				}
				arg1 += local125;
				arg4 -= local125 * 2;
			}
		}
		Static201.anInt3845 = arg1;
		Static337.anInt6450 = (short) arg0;
		Static76.anInt1290 = arg4 * local47 / 334;
		Static250.anInt4584 = arg3;
		Static135.anInt2588 = (short) arg4;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(CI)C")
	public static char method7888(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
