import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_44 = new Class177(69, 7);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method2314(@OriginalArg(0) int arg0) {
		@Pc(7) byte[][][] local7 = new byte[8][4][];
		@Pc(16) byte[] local16 = new byte[arg0 * arg0];
		@Pc(18) int local18 = 0;
		@Pc(23) int local23;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			for (local23 = 0; local23 < arg0; local23++) {
				if (local23 <= local20) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(68) int local68;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local68 = 0; local68 < arg0; local68++) {
				if (local23 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(106) int local106;
		for (local68 = 0; local68 < arg0; local68++) {
			for (local106 = 0; local106 < arg0; local106++) {
				if (local106 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(147) int local147;
		for (local106 = arg0 - 1; local106 >= 0; local106--) {
			for (local147 = 0; local147 < arg0; local147++) {
				if (local147 >= local106) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(187) int local187;
		for (local147 = arg0 - 1; local147 >= 0; local147--) {
			for (local187 = 0; local187 < arg0; local187++) {
				if (local147 >> 1 >= local187) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(234) int local234;
		for (local187 = 0; local187 < arg0; local187++) {
			for (local234 = 0; local234 < arg0; local234++) {
				if (local18 >= 0 && local16.length > local18) {
					if (local234 >= local187 << 1) {
						local16[local18] = -1;
					}
					local18++;
				} else {
					local18++;
				}
			}
		}
		local7[1][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(293) int local293;
		for (local234 = 0; local234 < arg0; local234++) {
			for (local293 = arg0 - 1; local293 >= 0; local293--) {
				if (local234 >> 1 >= local293) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(336) int local336;
		for (local293 = arg0 - 1; local293 >= 0; local293--) {
			for (local336 = arg0 - 1; local336 >= 0; local336--) {
				if (local336 >= local293 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(382) int local382;
		for (local336 = arg0 - 1; local336 >= 0; local336--) {
			for (local382 = arg0 - 1; local382 >= 0; local382--) {
				if (local382 <= local336 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(426) int local426;
		for (local382 = arg0 - 1; local382 >= 0; local382--) {
			for (local426 = 0; local426 < arg0; local426++) {
				if (local382 << 1 <= local426) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(469) int local469;
		for (local426 = 0; local426 < arg0; local426++) {
			for (local469 = 0; local469 < arg0; local469++) {
				if (local469 <= local426 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(512) int local512;
		for (local469 = 0; local469 < arg0; local469++) {
			for (local512 = arg0 - 1; local512 >= 0; local512--) {
				if (local469 << 1 <= local512) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(554) int local554;
		for (local512 = arg0 - 1; local512 >= 0; local512--) {
			for (local554 = 0; local554 < arg0; local554++) {
				if (local554 >= local512 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(601) int local601;
		for (local554 = 0; local554 < arg0; local554++) {
			for (local601 = 0; local601 < arg0; local601++) {
				if (local601 <= local554 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(652) int local652;
		for (local601 = 0; local601 < arg0; local601++) {
			for (local652 = arg0 - 1; local652 >= 0; local652--) {
				if (local601 >> 1 <= local652) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(695) int local695;
		for (local652 = arg0 - 1; local652 >= 0; local652--) {
			for (local695 = arg0 - 1; local695 >= 0; local695--) {
				if (local695 <= local652 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(741) int local741;
		for (local695 = arg0 - 1; local695 >= 0; local695--) {
			for (local741 = arg0 - 1; local741 >= 0; local741--) {
				if (local695 >> 1 <= local741) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(785) int local785;
		for (local741 = arg0 - 1; local741 >= 0; local741--) {
			for (local785 = 0; local785 < arg0; local785++) {
				if (local785 <= local741 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(824) int local824;
		for (local785 = 0; local785 < arg0; local785++) {
			for (local824 = 0; local824 < arg0; local824++) {
				if (local824 >= local785 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(867) int local867;
		for (local824 = 0; local824 < arg0; local824++) {
			for (local867 = arg0 - 1; local867 >= 0; local867--) {
				if (local824 << 1 >= local867) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(907) int local907;
		for (local867 = 0; local867 < arg0; local867++) {
			for (local907 = 0; local907 < arg0; local907++) {
				if (local907 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(952) int local952;
		for (local907 = 0; local907 < arg0; local907++) {
			for (local952 = 0; local952 < arg0; local952++) {
				if (local907 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(997) int local997;
		for (local952 = 0; local952 < arg0; local952++) {
			for (local997 = 0; local997 < arg0; local997++) {
				if (local997 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1046) int local1046;
		for (local997 = 0; local997 < arg0; local997++) {
			for (local1046 = 0; local1046 < arg0; local1046++) {
				if (local997 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1091) int local1091;
		for (local1046 = 0; local1046 < arg0; local1046++) {
			for (local1091 = 0; local1091 < arg0; local1091++) {
				if (local1091 <= local1046 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1141) int local1141;
		for (local1091 = arg0 - 1; local1091 >= 0; local1091--) {
			for (local1141 = 0; local1141 < arg0; local1141++) {
				if (local1141 <= local1091 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1188) int local1188;
		for (local1141 = arg0 - 1; local1141 >= 0; local1141--) {
			for (local1188 = arg0 - 1; local1188 >= 0; local1188--) {
				if (local1188 <= local1141 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1245) int local1245;
		for (local1188 = 0; local1188 < arg0; local1188++) {
			for (local1245 = arg0 - 1; local1245 >= 0; local1245--) {
				if (local1245 <= local1188 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1294) int local1294;
		for (local1245 = 0; local1245 < arg0; local1245++) {
			for (local1294 = 0; local1294 < arg0; local1294++) {
				if (local1294 >= local1245 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1335) int local1335;
		for (local1294 = arg0 - 1; local1294 >= 0; local1294--) {
			for (local1335 = 0; local1335 < arg0; local1335++) {
				if (local1335 >= local1294 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1384) int local1384;
		for (local1335 = arg0 - 1; local1335 >= 0; local1335--) {
			for (local1384 = arg0 - 1; local1384 >= 0; local1384--) {
				if (local1384 >= local1335 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		for (local1384 = 0; local1384 < arg0; local1384++) {
			for (@Pc(1427) int local1427 = arg0 - 1; local1427 >= 0; local1427--) {
				if (local1384 - arg0 / 2 <= local1427) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(IB)V")
	public static void method2315(@OriginalArg(0) int arg0) {
		if (Static133.anInt2954 == 0) {
			Static26.aClass1_Sub19_Sub3_1.method5304(arg0);
		} else {
			Static269.anInt5203 = arg0;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[S)[S")
	public static short[] method2316(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static469.method6017(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
