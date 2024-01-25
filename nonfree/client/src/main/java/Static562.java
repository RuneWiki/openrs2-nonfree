import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "[I")
	public static int[] anIntArray628;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_310 = new Class288(83, -1);

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
	public static int anInt9175 = 500;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IILclient!d;ILjava/awt/Canvas;Lclient!wu;)Lclient!ha;")
	public static Class95 method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface6 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class380 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg3 != null) {
			@Pc(23) Dimension local23 = arg3.getSize();
			local5 = local23.width;
			local7 = local23.height;
		}
		return Static198.method6999(arg0, local7, arg3, arg2, arg1, local5, arg4);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method7704(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(109) int local109;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local65 <= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(148) int local148;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local148 = 0; local148 < arg0; local148++) {
				if (local148 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(197) int local197;
		for (local148 = arg0 - 1; local148 >= 0; local148--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local148 >> 1 >= local197) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(238) int local238;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local238 = 0; local238 < arg0; local238++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local238 >= local197 << 1) {
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
		@Pc(299) int local299;
		for (local238 = 0; local238 < arg0; local238++) {
			for (local299 = arg0 - 1; local299 >= 0; local299--) {
				if (local299 <= local238 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(345) int local345;
		for (local299 = arg0 - 1; local299 >= 0; local299--) {
			for (local345 = arg0 - 1; local345 >= 0; local345--) {
				if (local299 << 1 <= local345) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(393) int local393;
		for (local345 = arg0 - 1; local345 >= 0; local345--) {
			for (local393 = arg0 - 1; local393 >= 0; local393--) {
				if (local393 <= local345 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(432) int local432;
		for (local393 = arg0 - 1; local393 >= 0; local393--) {
			for (local432 = 0; local432 < arg0; local432++) {
				if (local432 >= local393 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(477) int local477;
		for (local432 = 0; local432 < arg0; local432++) {
			for (local477 = 0; local477 < arg0; local477++) {
				if (local477 <= local432 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(522) int local522;
		for (local477 = 0; local477 < arg0; local477++) {
			for (local522 = arg0 - 1; local522 >= 0; local522--) {
				if (local522 >= local477 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(569) int local569;
		for (local522 = arg0 - 1; local522 >= 0; local522--) {
			for (local569 = 0; local569 < arg0; local569++) {
				if (local522 >> 1 <= local569) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(610) int local610;
		for (local569 = 0; local569 < arg0; local569++) {
			for (local610 = 0; local610 < arg0; local610++) {
				if (local610 <= local569 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(663) int local663;
		for (local610 = 0; local610 < arg0; local610++) {
			for (local663 = arg0 - 1; local663 >= 0; local663--) {
				if (local663 >= local610 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(708) int local708;
		for (local663 = arg0 - 1; local663 >= 0; local663--) {
			for (local708 = arg0 - 1; local708 >= 0; local708--) {
				if (local663 << 1 >= local708) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(756) int local756;
		for (local708 = arg0 - 1; local708 >= 0; local708--) {
			for (local756 = arg0 - 1; local756 >= 0; local756--) {
				if (local756 >= local708 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(798) int local798;
		for (local756 = arg0 - 1; local756 >= 0; local756--) {
			for (local798 = 0; local798 < arg0; local798++) {
				if (local756 << 1 >= local798) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(847) int local847;
		for (local798 = 0; local798 < arg0; local798++) {
			for (local847 = 0; local847 < arg0; local847++) {
				if (local798 >> 1 <= local847) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(896) int local896;
		for (local847 = 0; local847 < arg0; local847++) {
			for (local896 = arg0 - 1; local896 >= 0; local896--) {
				if (local847 << 1 >= local896) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(938) int local938;
		for (local896 = 0; local896 < arg0; local896++) {
			for (local938 = 0; local938 < arg0; local938++) {
				if (local938 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(981) int local981;
		for (local938 = 0; local938 < arg0; local938++) {
			for (local981 = 0; local981 < arg0; local981++) {
				if (local938 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1020) int local1020;
		for (local981 = 0; local981 < arg0; local981++) {
			for (local1020 = 0; local1020 < arg0; local1020++) {
				if (arg0 / 2 <= local1020) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1063) int local1063;
		for (local1020 = 0; local1020 < arg0; local1020++) {
			for (local1063 = 0; local1063 < arg0; local1063++) {
				if (local1020 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1106) int local1106;
		for (local1063 = 0; local1063 < arg0; local1063++) {
			for (local1106 = 0; local1106 < arg0; local1106++) {
				if (local1063 - arg0 / 2 >= local1106) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1157) int local1157;
		for (local1106 = arg0 - 1; local1106 >= 0; local1106--) {
			for (local1157 = 0; local1157 < arg0; local1157++) {
				if (local1157 <= local1106 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1205) int local1205;
		for (local1157 = arg0 - 1; local1157 >= 0; local1157--) {
			for (local1205 = arg0 - 1; local1205 >= 0; local1205--) {
				if (local1157 - arg0 / 2 >= local1205) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1249) int local1249;
		for (local1205 = 0; local1205 < arg0; local1205++) {
			for (local1249 = arg0 - 1; local1249 >= 0; local1249--) {
				if (local1205 - arg0 / 2 >= local1249) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1293) int local1293;
		for (local1249 = 0; local1249 < arg0; local1249++) {
			for (local1293 = 0; local1293 < arg0; local1293++) {
				if (local1293 >= local1249 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1341) int local1341;
		for (local1293 = arg0 - 1; local1293 >= 0; local1293--) {
			for (local1341 = 0; local1341 < arg0; local1341++) {
				if (local1293 - arg0 / 2 <= local1341) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1393) int local1393;
		for (local1341 = arg0 - 1; local1341 >= 0; local1341--) {
			for (local1393 = arg0 - 1; local1393 >= 0; local1393--) {
				if (local1341 - arg0 / 2 <= local1393) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1393 = 0; local1393 < arg0; local1393++) {
			for (@Pc(1438) int local1438 = arg0 - 1; local1438 >= 0; local1438--) {
				if (local1393 - arg0 / 2 <= local1438) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
