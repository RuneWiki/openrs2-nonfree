import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public static int anInt10292;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!ffa;")
	public static final Class100 aClass100_35 = new Class100();

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method8311(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static454.aBoolean597) {
			try {
				@Pc(23) Class329 local23 = (Class329) Class.forName("Class329_Sub1").getDeclaredConstructor().newInstance();
				local23.method7728(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static454.aBoolean597 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method8312(@OriginalArg(0) int arg0) {
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
		@Pc(108) int local108;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local108 = 0; local108 < arg0; local108++) {
				if (local108 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(151) int local151;
		for (local108 = arg0 - 1; local108 >= 0; local108--) {
			for (local151 = 0; local151 < arg0; local151++) {
				if (local108 <= local151) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(192) int local192;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local192 = 0; local192 < arg0; local192++) {
				if (local192 <= local151 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(241) int local241;
		for (local192 = 0; local192 < arg0; local192++) {
			for (local241 = 0; local241 < arg0; local241++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local241 >= local192 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(303) int local303;
		for (local241 = 0; local241 < arg0; local241++) {
			for (local303 = arg0 - 1; local303 >= 0; local303--) {
				if (local241 >> 1 >= local303) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(353) int local353;
		for (local303 = arg0 - 1; local303 >= 0; local303--) {
			for (local353 = arg0 - 1; local353 >= 0; local353--) {
				if (local353 >= local303 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(404) int local404;
		for (local353 = arg0 - 1; local353 >= 0; local353--) {
			for (local404 = arg0 - 1; local404 >= 0; local404--) {
				if (local404 <= local353 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(443) int local443;
		for (local404 = arg0 - 1; local404 >= 0; local404--) {
			for (local443 = 0; local443 < arg0; local443++) {
				if (local404 << 1 <= local443) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(485) int local485;
		for (local443 = 0; local443 < arg0; local443++) {
			for (local485 = 0; local485 < arg0; local485++) {
				if (local485 <= local443 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(534) int local534;
		for (local485 = 0; local485 < arg0; local485++) {
			for (local534 = arg0 - 1; local534 >= 0; local534--) {
				if (local485 << 1 <= local534) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(586) int local586;
		for (local534 = arg0 - 1; local534 >= 0; local534--) {
			for (local586 = 0; local586 < arg0; local586++) {
				if (local534 >> 1 <= local586) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(635) int local635;
		for (local586 = 0; local586 < arg0; local586++) {
			for (local635 = 0; local635 < arg0; local635++) {
				if (local635 <= local586 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(684) int local684;
		for (local635 = 0; local635 < arg0; local635++) {
			for (local684 = arg0 - 1; local684 >= 0; local684--) {
				if (local684 >= local635 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(733) int local733;
		for (local684 = arg0 - 1; local684 >= 0; local684--) {
			for (local733 = arg0 - 1; local733 >= 0; local733--) {
				if (local684 << 1 >= local733) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(781) int local781;
		for (local733 = arg0 - 1; local733 >= 0; local733--) {
			for (local781 = arg0 - 1; local781 >= 0; local781--) {
				if (local781 >= local733 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(826) int local826;
		for (local781 = arg0 - 1; local781 >= 0; local781--) {
			for (local826 = 0; local826 < arg0; local826++) {
				if (local781 << 1 >= local826) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(872) int local872;
		for (local826 = 0; local826 < arg0; local826++) {
			for (local872 = 0; local872 < arg0; local872++) {
				if (local872 >= local826 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(921) int local921;
		for (local872 = 0; local872 < arg0; local872++) {
			for (local921 = arg0 - 1; local921 >= 0; local921--) {
				if (local872 << 1 >= local921) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(970) int local970;
		for (local921 = 0; local921 < arg0; local921++) {
			for (local970 = 0; local970 < arg0; local970++) {
				if (arg0 / 2 >= local970) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1017) int local1017;
		for (local970 = 0; local970 < arg0; local970++) {
			for (local1017 = 0; local1017 < arg0; local1017++) {
				if (arg0 / 2 >= local970) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1060) int local1060;
		for (local1017 = 0; local1017 < arg0; local1017++) {
			for (local1060 = 0; local1060 < arg0; local1060++) {
				if (arg0 / 2 <= local1060) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1099) int local1099;
		for (local1060 = 0; local1060 < arg0; local1060++) {
			for (local1099 = 0; local1099 < arg0; local1099++) {
				if (arg0 / 2 <= local1060) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1142) int local1142;
		for (local1099 = 0; local1099 < arg0; local1099++) {
			for (local1142 = 0; local1142 < arg0; local1142++) {
				if (local1142 <= local1099 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1189) int local1189;
		for (local1142 = arg0 - 1; local1142 >= 0; local1142--) {
			for (local1189 = 0; local1189 < arg0; local1189++) {
				if (local1189 <= local1142 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1234) int local1234;
		for (local1189 = arg0 - 1; local1189 >= 0; local1189--) {
			for (local1234 = arg0 - 1; local1234 >= 0; local1234--) {
				if (local1234 <= local1189 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1286) int local1286;
		for (local1234 = 0; local1234 < arg0; local1234++) {
			for (local1286 = arg0 - 1; local1286 >= 0; local1286--) {
				if (local1234 - arg0 / 2 >= local1286) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1334) int local1334;
		for (local1286 = 0; local1286 < arg0; local1286++) {
			for (local1334 = 0; local1334 < arg0; local1334++) {
				if (local1334 >= local1286 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1386) int local1386;
		for (local1334 = arg0 - 1; local1334 >= 0; local1334--) {
			for (local1386 = 0; local1386 < arg0; local1386++) {
				if (local1334 - arg0 / 2 <= local1386) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1438) int local1438;
		for (local1386 = arg0 - 1; local1386 >= 0; local1386--) {
			for (local1438 = arg0 - 1; local1438 >= 0; local1438--) {
				if (local1438 >= local1386 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1438 = 0; local1438 < arg0; local1438++) {
			for (@Pc(1483) int local1483 = arg0 - 1; local1483 >= 0; local1483--) {
				if (local1438 - arg0 / 2 <= local1483) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
	public static int method8313() {
		return Static105.anInt2774 == 1 ? Static384.anInt7465 : 0;
	}
}
