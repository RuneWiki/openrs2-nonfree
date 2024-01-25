import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	public static int anInt3602;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "Lclient!kh;")
	public static Class54 aClass54_10;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString212 = "Loading sprites - ";

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString213 = "Loaded fonts";

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
	public static int anInt3606 = 0;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method3326(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII)V")
	public static void method3327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(4, arg2);
		local8.method4140();
		local8.anInt4724 = arg1;
		local8.anInt4723 = arg3;
		local8.anInt4721 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method3328(@OriginalArg(0) int arg0) {
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
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local26 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(116) int local116;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local116 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(163) int local163;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local163 >= local116) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(205) int local205;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local205 <= local163 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(254) int local254;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local254 = 0; local254 < arg0; local254++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local205 << 1 <= local254) {
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
		@Pc(315) int local315;
		for (local254 = 0; local254 < arg0; local254++) {
			for (local315 = arg0 - 1; local315 >= 0; local315--) {
				if (local315 <= local254 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(361) int local361;
		for (local315 = arg0 - 1; local315 >= 0; local315--) {
			for (local361 = arg0 - 1; local361 >= 0; local361--) {
				if (local361 >= local315 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(405) int local405;
		for (local361 = arg0 - 1; local361 >= 0; local361--) {
			for (local405 = arg0 - 1; local405 >= 0; local405--) {
				if (local361 >> 1 >= local405) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(454) int local454;
		for (local405 = arg0 - 1; local405 >= 0; local405--) {
			for (local454 = 0; local454 < arg0; local454++) {
				if (local454 >= local405 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(499) int local499;
		for (local454 = 0; local454 < arg0; local454++) {
			for (local499 = 0; local499 < arg0; local499++) {
				if (local454 >> 1 >= local499) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(548) int local548;
		for (local499 = 0; local499 < arg0; local499++) {
			for (local548 = arg0 - 1; local548 >= 0; local548--) {
				if (local548 >= local499 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(599) int local599;
		for (local548 = arg0 - 1; local548 >= 0; local548--) {
			for (local599 = 0; local599 < arg0; local599++) {
				if (local599 >= local548 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(641) int local641;
		for (local599 = 0; local599 < arg0; local599++) {
			for (local641 = 0; local641 < arg0; local641++) {
				if (local599 << 1 >= local641) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(690) int local690;
		for (local641 = 0; local641 < arg0; local641++) {
			for (local690 = arg0 - 1; local690 >= 0; local690--) {
				if (local641 >> 1 <= local690) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(736) int local736;
		for (local690 = arg0 - 1; local690 >= 0; local690--) {
			for (local736 = arg0 - 1; local736 >= 0; local736--) {
				if (local690 << 1 >= local736) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(777) int local777;
		for (local736 = arg0 - 1; local736 >= 0; local736--) {
			for (local777 = arg0 - 1; local777 >= 0; local777--) {
				if (local736 >> 1 <= local777) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(816) int local816;
		for (local777 = arg0 - 1; local777 >= 0; local777--) {
			for (local816 = 0; local816 < arg0; local816++) {
				if (local777 << 1 >= local816) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(858) int local858;
		for (local816 = 0; local816 < arg0; local816++) {
			for (local858 = 0; local858 < arg0; local858++) {
				if (local816 >> 1 <= local858) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(899) int local899;
		for (local858 = 0; local858 < arg0; local858++) {
			for (local899 = arg0 - 1; local899 >= 0; local899--) {
				if (local899 <= local858 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(937) int local937;
		for (local899 = 0; local899 < arg0; local899++) {
			for (local937 = 0; local937 < arg0; local937++) {
				if (local937 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(984) int local984;
		for (local937 = 0; local937 < arg0; local937++) {
			for (local984 = 0; local984 < arg0; local984++) {
				if (local937 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1027) int local1027;
		for (local984 = 0; local984 < arg0; local984++) {
			for (local1027 = 0; local1027 < arg0; local1027++) {
				if (arg0 / 2 <= local1027) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1066) int local1066;
		for (local1027 = 0; local1027 < arg0; local1027++) {
			for (local1066 = 0; local1066 < arg0; local1066++) {
				if (local1027 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1109) int local1109;
		for (local1066 = 0; local1066 < arg0; local1066++) {
			for (local1109 = 0; local1109 < arg0; local1109++) {
				if (local1109 <= local1066 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1156) int local1156;
		for (local1109 = arg0 - 1; local1109 >= 0; local1109--) {
			for (local1156 = 0; local1156 < arg0; local1156++) {
				if (local1156 <= local1109 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1205) int local1205;
		for (local1156 = arg0 - 1; local1156 >= 0; local1156--) {
			for (local1205 = arg0 - 1; local1205 >= 0; local1205--) {
				if (local1156 - arg0 / 2 >= local1205) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1256) int local1256;
		for (local1205 = 0; local1205 < arg0; local1205++) {
			for (local1256 = arg0 - 1; local1256 >= 0; local1256--) {
				if (local1205 - arg0 / 2 >= local1256) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1305) int local1305;
		for (local1256 = 0; local1256 < arg0; local1256++) {
			for (local1305 = 0; local1305 < arg0; local1305++) {
				if (local1256 - arg0 / 2 <= local1305) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1357) int local1357;
		for (local1305 = arg0 - 1; local1305 >= 0; local1305--) {
			for (local1357 = 0; local1357 < arg0; local1357++) {
				if (local1357 >= local1305 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1406) int local1406;
		for (local1357 = arg0 - 1; local1357 >= 0; local1357--) {
			for (local1406 = arg0 - 1; local1406 >= 0; local1406--) {
				if (local1357 - arg0 / 2 <= local1406) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1406 = 0; local1406 < arg0; local1406++) {
			for (@Pc(1454) int local1454 = arg0 - 1; local1454 >= 0; local1454--) {
				if (local1406 - arg0 / 2 <= local1454) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method3329(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static191.method5193(local13) : local13;
		} else if (arg0 instanceof Class77) {
			@Pc(32) Class77 local32 = (Class77) arg0;
			return local32.method2181();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
