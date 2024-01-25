import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_18 = new Class198("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean92 = Boolean.FALSE;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public static int anInt1107 = -2;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "[Lclient!fe;")
	public static final Class74[] aClass74Array1 = new Class74[4];

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public static void method949() {
		@Pc(7) Class139 local7 = null;
		try {
			@Pc(13) Class268 local13 = Static7.aClass93_1.method2100("3", false);
			while (local13.anInt7420 == 0) {
				Static140.method2004(1L);
			}
			if (local13.anInt7420 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class139) local13.anObject10;
			@Pc(42) byte[] local42 = new byte[(int) local7.method2900()];
			if (local42.length == 0) {
				Static256.aString45 = "";
				Static294.aString53 = "";
			} else {
				@Pc(59) int local59;
				for (@Pc(47) int local47 = 0; local47 < local42.length; local47 += local59) {
					local59 = local7.method2898(local42.length - local47, local47, local42);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(81) Class5_Sub15 local81 = new Class5_Sub15(local42);
				@Pc(85) int local85 = local81.method5539();
				if (local85 > 50) {
					throw new RuntimeException("Bad length");
				}
				local81.anInt7013 = local85 + 1;
				if (!local81.method5554()) {
					throw new RuntimeException("Invalid CRC");
				}
				local81.anInt7013 = 1;
				@Pc(116) int local116 = local81.method5539();
				if (local116 != 0) {
					throw new RuntimeException("Invalid version " + local116);
				}
				Static294.aString53 = local81.method5599();
				Static256.aString45 = local81.method5599();
			}
		} catch (@Pc(148) Exception local148) {
			Static256.aString45 = "";
			Static294.aString53 = "";
		}
		try {
			if (local7 != null) {
				local7.method2897();
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method950(@OriginalArg(1) int arg0) {
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
		@Pc(65) int local65;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local65 = 0; local65 < arg0; local65++) {
				if (local65 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(105) int local105;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local105 = 0; local105 < arg0; local105++) {
				if (local65 <= local105) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(148) int local148;
		for (local105 = arg0 - 1; local105 >= 0; local105--) {
			for (local148 = 0; local148 < arg0; local148++) {
				if (local105 <= local148) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(194) int local194;
		for (local148 = arg0 - 1; local148 >= 0; local148--) {
			for (local194 = 0; local194 < arg0; local194++) {
				if (local148 >> 1 >= local194) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(236) int local236;
		for (local194 = 0; local194 < arg0; local194++) {
			for (local236 = 0; local236 < arg0; local236++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local194 << 1 <= local236) {
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
		@Pc(294) int local294;
		for (local236 = 0; local236 < arg0; local236++) {
			for (local294 = arg0 - 1; local294 >= 0; local294--) {
				if (local236 >> 1 >= local294) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(340) int local340;
		for (local294 = arg0 - 1; local294 >= 0; local294--) {
			for (local340 = arg0 - 1; local340 >= 0; local340--) {
				if (local340 >= local294 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(384) int local384;
		for (local340 = arg0 - 1; local340 >= 0; local340--) {
			for (local384 = arg0 - 1; local384 >= 0; local384--) {
				if (local340 >> 1 >= local384) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(426) int local426;
		for (local384 = arg0 - 1; local384 >= 0; local384--) {
			for (local426 = 0; local426 < arg0; local426++) {
				if (local384 << 1 <= local426) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(471) int local471;
		for (local426 = 0; local426 < arg0; local426++) {
			for (local471 = 0; local471 < arg0; local471++) {
				if (local426 >> 1 >= local471) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(516) int local516;
		for (local471 = 0; local471 < arg0; local471++) {
			for (local516 = arg0 - 1; local516 >= 0; local516--) {
				if (local516 >= local471 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(563) int local563;
		for (local516 = arg0 - 1; local516 >= 0; local516--) {
			for (local563 = 0; local563 < arg0; local563++) {
				if (local516 >> 1 <= local563) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(612) int local612;
		for (local563 = 0; local563 < arg0; local563++) {
			for (local612 = 0; local612 < arg0; local612++) {
				if (local563 << 1 >= local612) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(661) int local661;
		for (local612 = 0; local612 < arg0; local612++) {
			for (local661 = arg0 - 1; local661 >= 0; local661--) {
				if (local661 >= local612 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(707) int local707;
		for (local661 = arg0 - 1; local661 >= 0; local661--) {
			for (local707 = arg0 - 1; local707 >= 0; local707--) {
				if (local707 <= local661 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(755) int local755;
		for (local707 = arg0 - 1; local707 >= 0; local707--) {
			for (local755 = arg0 - 1; local755 >= 0; local755--) {
				if (local755 >= local707 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(800) int local800;
		for (local755 = arg0 - 1; local755 >= 0; local755--) {
			for (local800 = 0; local800 < arg0; local800++) {
				if (local800 <= local755 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(849) int local849;
		for (local800 = 0; local800 < arg0; local800++) {
			for (local849 = 0; local849 < arg0; local849++) {
				if (local800 >> 1 <= local849) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(894) int local894;
		for (local849 = 0; local849 < arg0; local849++) {
			for (local894 = arg0 - 1; local894 >= 0; local894--) {
				if (local849 << 1 >= local894) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(943) int local943;
		for (local894 = 0; local894 < arg0; local894++) {
			for (local943 = 0; local943 < arg0; local943++) {
				if (local943 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(986) int local986;
		for (local943 = 0; local943 < arg0; local943++) {
			for (local986 = 0; local986 < arg0; local986++) {
				if (local943 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1029) int local1029;
		for (local986 = 0; local986 < arg0; local986++) {
			for (local1029 = 0; local1029 < arg0; local1029++) {
				if (arg0 / 2 <= local1029) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1072) int local1072;
		for (local1029 = 0; local1029 < arg0; local1029++) {
			for (local1072 = 0; local1072 < arg0; local1072++) {
				if (local1029 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1115) int local1115;
		for (local1072 = 0; local1072 < arg0; local1072++) {
			for (local1115 = 0; local1115 < arg0; local1115++) {
				if (local1072 - arg0 / 2 >= local1115) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1163) int local1163;
		for (local1115 = arg0 - 1; local1115 >= 0; local1115--) {
			for (local1163 = 0; local1163 < arg0; local1163++) {
				if (local1115 - arg0 / 2 >= local1163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1212) int local1212;
		for (local1163 = arg0 - 1; local1163 >= 0; local1163--) {
			for (local1212 = arg0 - 1; local1212 >= 0; local1212--) {
				if (local1212 <= local1163 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1260) int local1260;
		for (local1212 = 0; local1212 < arg0; local1212++) {
			for (local1260 = arg0 - 1; local1260 >= 0; local1260--) {
				if (local1212 - arg0 / 2 >= local1260) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1308) int local1308;
		for (local1260 = 0; local1260 < arg0; local1260++) {
			for (local1308 = 0; local1308 < arg0; local1308++) {
				if (local1260 - arg0 / 2 <= local1308) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1352) int local1352;
		for (local1308 = arg0 - 1; local1308 >= 0; local1308--) {
			for (local1352 = 0; local1352 < arg0; local1352++) {
				if (local1308 - arg0 / 2 <= local1352) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1406) int local1406;
		for (local1352 = arg0 - 1; local1352 >= 0; local1352--) {
			for (local1406 = arg0 - 1; local1406 >= 0; local1406--) {
				if (local1352 - arg0 / 2 <= local1406) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1406 = 0; local1406 < arg0; local1406++) {
			for (@Pc(1452) int local1452 = arg0 - 1; local1452 >= 0; local1452--) {
				if (local1452 >= local1406 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
