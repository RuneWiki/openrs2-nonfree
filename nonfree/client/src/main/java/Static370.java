import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt7927 = 0;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_70 = new Class99();

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static int anInt7928 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method6433(@OriginalArg(1) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(77) int local77;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local77 = 0; local77 < arg0; local77++) {
				if (local26 >= local77) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(124) int local124;
		for (local77 = 0; local77 < arg0; local77++) {
			for (local124 = 0; local124 < arg0; local124++) {
				if (local124 >= local77) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(171) int local171;
		for (local124 = arg0 - 1; local124 >= 0; local124--) {
			for (local171 = 0; local171 < arg0; local171++) {
				if (local171 >= local124) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(220) int local220;
		for (local171 = arg0 - 1; local171 >= 0; local171--) {
			for (local220 = 0; local220 < arg0; local220++) {
				if (local220 <= local171 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(262) int local262;
		for (local220 = 0; local220 < arg0; local220++) {
			for (local262 = 0; local262 < arg0; local262++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local262 >= local220 << 1) {
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
		@Pc(312) int local312;
		for (local262 = 0; local262 < arg0; local262++) {
			for (local312 = arg0 - 1; local312 >= 0; local312--) {
				if (local312 <= local262 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(358) int local358;
		for (local312 = arg0 - 1; local312 >= 0; local312--) {
			for (local358 = arg0 - 1; local358 >= 0; local358--) {
				if (local358 >= local312 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(406) int local406;
		for (local358 = arg0 - 1; local358 >= 0; local358--) {
			for (local406 = arg0 - 1; local406 >= 0; local406--) {
				if (local406 <= local358 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(445) int local445;
		for (local406 = arg0 - 1; local406 >= 0; local406--) {
			for (local445 = 0; local445 < arg0; local445++) {
				if (local406 << 1 <= local445) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(487) int local487;
		for (local445 = 0; local445 < arg0; local445++) {
			for (local487 = 0; local487 < arg0; local487++) {
				if (local487 <= local445 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(528) int local528;
		for (local487 = 0; local487 < arg0; local487++) {
			for (local528 = arg0 - 1; local528 >= 0; local528--) {
				if (local487 << 1 <= local528) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(572) int local572;
		for (local528 = arg0 - 1; local528 >= 0; local528--) {
			for (local572 = 0; local572 < arg0; local572++) {
				if (local572 >= local528 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(618) int local618;
		for (local572 = 0; local572 < arg0; local572++) {
			for (local618 = 0; local618 < arg0; local618++) {
				if (local618 <= local572 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(671) int local671;
		for (local618 = 0; local618 < arg0; local618++) {
			for (local671 = arg0 - 1; local671 >= 0; local671--) {
				if (local618 >> 1 <= local671) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(717) int local717;
		for (local671 = arg0 - 1; local671 >= 0; local671--) {
			for (local717 = arg0 - 1; local717 >= 0; local717--) {
				if (local671 << 1 >= local717) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(765) int local765;
		for (local717 = arg0 - 1; local717 >= 0; local717--) {
			for (local765 = arg0 - 1; local765 >= 0; local765--) {
				if (local717 >> 1 <= local765) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(808) int local808;
		for (local765 = arg0 - 1; local765 >= 0; local765--) {
			for (local808 = 0; local808 < arg0; local808++) {
				if (local765 << 1 >= local808) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(850) int local850;
		for (local808 = 0; local808 < arg0; local808++) {
			for (local850 = 0; local850 < arg0; local850++) {
				if (local850 >= local808 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(900) int local900;
		for (local850 = 0; local850 < arg0; local850++) {
			for (local900 = arg0 - 1; local900 >= 0; local900--) {
				if (local850 << 1 >= local900) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(942) int local942;
		for (local900 = 0; local900 < arg0; local900++) {
			for (local942 = 0; local942 < arg0; local942++) {
				if (local942 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(985) int local985;
		for (local942 = 0; local942 < arg0; local942++) {
			for (local985 = 0; local985 < arg0; local985++) {
				if (local942 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1032) int local1032;
		for (local985 = 0; local985 < arg0; local985++) {
			for (local1032 = 0; local1032 < arg0; local1032++) {
				if (arg0 / 2 <= local1032) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1079) int local1079;
		for (local1032 = 0; local1032 < arg0; local1032++) {
			for (local1079 = 0; local1079 < arg0; local1079++) {
				if (arg0 / 2 <= local1032) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1122) int local1122;
		for (local1079 = 0; local1079 < arg0; local1079++) {
			for (local1122 = 0; local1122 < arg0; local1122++) {
				if (local1079 - arg0 / 2 >= local1122) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1170) int local1170;
		for (local1122 = arg0 - 1; local1122 >= 0; local1122--) {
			for (local1170 = 0; local1170 < arg0; local1170++) {
				if (local1122 - arg0 / 2 >= local1170) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1218) int local1218;
		for (local1170 = arg0 - 1; local1170 >= 0; local1170--) {
			for (local1218 = arg0 - 1; local1218 >= 0; local1218--) {
				if (local1170 - arg0 / 2 >= local1218) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1263) int local1263;
		for (local1218 = 0; local1218 < arg0; local1218++) {
			for (local1263 = arg0 - 1; local1263 >= 0; local1263--) {
				if (local1263 <= local1218 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1315) int local1315;
		for (local1263 = 0; local1263 < arg0; local1263++) {
			for (local1315 = 0; local1315 < arg0; local1315++) {
				if (local1263 - arg0 / 2 <= local1315) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1363) int local1363;
		for (local1315 = arg0 - 1; local1315 >= 0; local1315--) {
			for (local1363 = 0; local1363 < arg0; local1363++) {
				if (local1315 - arg0 / 2 <= local1363) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1412) int local1412;
		for (local1363 = arg0 - 1; local1363 >= 0; local1363--) {
			for (local1412 = arg0 - 1; local1412 >= 0; local1412--) {
				if (local1363 - arg0 / 2 <= local1412) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1412 = 0; local1412 < arg0; local1412++) {
			for (@Pc(1460) int local1460 = arg0 - 1; local1460 >= 0; local1460--) {
				if (local1412 - arg0 / 2 <= local1460) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method6434(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static188.method3176(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static96.method2015(local7);
			local7 = Static16.method592(local7, ":", "%3a");
			local7 = Static16.method592(local7, "@", "%40");
			local7 = Static16.method592(local7, "&", "%26");
			local7 = Static16.method592(local7, "#", "%23");
			if (Static390.aClass9_20.anApplet1 != null) {
				@Pc(105) Class83 local105 = Static390.aClass9_20.method277(new URL(Static390.aClass9_20.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static301.anInt5982 + "&u=" + Static510.aLong242 + "&v1=" + Static9.aString5 + "&v2=" + Static9.aString7 + "&e=" + local7));
				while (local105.anInt2495 == 0) {
					Static213.method3465(1L);
				}
				if (local105.anInt2495 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local105.anObject8;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}
}
