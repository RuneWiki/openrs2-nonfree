import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!io", name = "i", descriptor = "Lclient!hh;")
	public static Class109 aClass109_40;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_46 = new Class96("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!ti;)V")
	public static void method2738(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static272.aClass124_4 != null) {
			@Pc(20) int local20;
			try {
				Static272.aClass124_4.method2949(0L);
				Static272.aClass124_4.method2943(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4506(local8, 24);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method2743(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local69 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(152) int local152;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local113 <= local152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(201) int local201;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local201 = 0; local201 < arg0; local201++) {
				if (local201 <= local152 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(250) int local250;
		for (local201 = 0; local201 < arg0; local201++) {
			for (local250 = 0; local250 < arg0; local250++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local250 >= local201 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(315) int local315;
		for (local250 = 0; local250 < arg0; local250++) {
			for (local315 = arg0 - 1; local315 >= 0; local315--) {
				if (local250 >> 1 >= local315) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(369) int local369;
		for (local315 = arg0 - 1; local315 >= 0; local315--) {
			for (local369 = arg0 - 1; local369 >= 0; local369--) {
				if (local369 >= local315 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(420) int local420;
		for (local369 = arg0 - 1; local369 >= 0; local369--) {
			for (local420 = arg0 - 1; local420 >= 0; local420--) {
				if (local369 >> 1 >= local420) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(459) int local459;
		for (local420 = arg0 - 1; local420 >= 0; local420--) {
			for (local459 = 0; local459 < arg0; local459++) {
				if (local459 >= local420 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(501) int local501;
		for (local459 = 0; local459 < arg0; local459++) {
			for (local501 = 0; local501 < arg0; local501++) {
				if (local501 <= local459 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(546) int local546;
		for (local501 = 0; local501 < arg0; local501++) {
			for (local546 = arg0 - 1; local546 >= 0; local546--) {
				if (local501 << 1 <= local546) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(597) int local597;
		for (local546 = arg0 - 1; local546 >= 0; local546--) {
			for (local597 = 0; local597 < arg0; local597++) {
				if (local546 >> 1 <= local597) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(643) int local643;
		for (local597 = 0; local597 < arg0; local597++) {
			for (local643 = 0; local643 < arg0; local643++) {
				if (local643 <= local597 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(692) int local692;
		for (local643 = 0; local643 < arg0; local643++) {
			for (local692 = arg0 - 1; local692 >= 0; local692--) {
				if (local692 >= local643 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(738) int local738;
		for (local692 = arg0 - 1; local692 >= 0; local692--) {
			for (local738 = arg0 - 1; local738 >= 0; local738--) {
				if (local692 << 1 >= local738) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(783) int local783;
		for (local738 = arg0 - 1; local738 >= 0; local738--) {
			for (local783 = arg0 - 1; local783 >= 0; local783--) {
				if (local738 >> 1 <= local783) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(832) int local832;
		for (local783 = arg0 - 1; local783 >= 0; local783--) {
			for (local832 = 0; local832 < arg0; local832++) {
				if (local832 <= local783 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(873) int local873;
		for (local832 = 0; local832 < arg0; local832++) {
			for (local873 = 0; local873 < arg0; local873++) {
				if (local832 >> 1 <= local873) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(918) int local918;
		for (local873 = 0; local873 < arg0; local873++) {
			for (local918 = arg0 - 1; local918 >= 0; local918--) {
				if (local873 << 1 >= local918) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(960) int local960;
		for (local918 = 0; local918 < arg0; local918++) {
			for (local960 = 0; local960 < arg0; local960++) {
				if (local960 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(999) int local999;
		for (local960 = 0; local960 < arg0; local960++) {
			for (local999 = 0; local999 < arg0; local999++) {
				if (arg0 / 2 >= local960) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1042) int local1042;
		for (local999 = 0; local999 < arg0; local999++) {
			for (local1042 = 0; local1042 < arg0; local1042++) {
				if (arg0 / 2 <= local1042) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1085) int local1085;
		for (local1042 = 0; local1042 < arg0; local1042++) {
			for (local1085 = 0; local1085 < arg0; local1085++) {
				if (local1042 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1132) int local1132;
		for (local1085 = 0; local1085 < arg0; local1085++) {
			for (local1132 = 0; local1132 < arg0; local1132++) {
				if (local1085 - arg0 / 2 >= local1132) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1179) int local1179;
		for (local1132 = arg0 - 1; local1132 >= 0; local1132--) {
			for (local1179 = 0; local1179 < arg0; local1179++) {
				if (local1179 <= local1132 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1228) int local1228;
		for (local1179 = arg0 - 1; local1179 >= 0; local1179--) {
			for (local1228 = arg0 - 1; local1228 >= 0; local1228--) {
				if (local1179 - arg0 / 2 >= local1228) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1276) int local1276;
		for (local1228 = 0; local1228 < arg0; local1228++) {
			for (local1276 = arg0 - 1; local1276 >= 0; local1276--) {
				if (local1276 <= local1228 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1325) int local1325;
		for (local1276 = 0; local1276 < arg0; local1276++) {
			for (local1325 = 0; local1325 < arg0; local1325++) {
				if (local1325 >= local1276 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1373) int local1373;
		for (local1325 = arg0 - 1; local1325 >= 0; local1325--) {
			for (local1373 = 0; local1373 < arg0; local1373++) {
				if (local1325 - arg0 / 2 <= local1373) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1426) int local1426;
		for (local1373 = arg0 - 1; local1373 >= 0; local1373--) {
			for (local1426 = arg0 - 1; local1426 >= 0; local1426--) {
				if (local1426 >= local1373 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1426 = 0; local1426 < arg0; local1426++) {
			for (@Pc(1475) int local1475 = arg0 - 1; local1475 >= 0; local1475--) {
				if (local1475 >= local1426 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
