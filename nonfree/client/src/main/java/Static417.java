import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
	public static boolean aBoolean537 = false;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Z")
	public static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!jq;)V")
	public static void method6529(@OriginalArg(0) Class177 arg0) {
		if (Static523.anInt9351 >= 65535) {
			return;
		}
		@Pc(6) Class4_Sub24 local6 = arg0.aClass4_Sub24_1;
		Static485.aClass177Array1[Static523.anInt9351] = arg0;
		Static54.aBooleanArray3[Static523.anInt9351] = false;
		Static523.anInt9351++;
		@Pc(21) int local21 = arg0.anInt4590;
		if (arg0.aBoolean327) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4590;
		if (arg0.aBoolean328) {
			local29 = Static345.anInt6662 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method7142() + Static96.anInt8036 - local6.method7151() >> Static145.anInt3093;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method7142() + local6.method7151() - Static96.anInt8036 >> Static145.anInt3093;
			if (local73 >= Static253.anInt4651) {
				local73 = Static253.anInt4651 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray57[local41++];
				@Pc(105) int local105 = (local6.method7145() + Static96.anInt8036 - local6.method7151() >> Static145.anInt3093) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static182.anInt3633) {
					local113 = Static182.anInt3633 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static461.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static461.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9351;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static461.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9351 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static461.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9351 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static461.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9351 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method6534(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(25) int local25 = 0;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
			for (local31 = 0; local31 < arg0; local31++) {
				if (local31 <= local27) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[0][0] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(74) int local74;
		for (local31 = arg0 - 1; local31 >= 0; local31--) {
			for (local74 = 0; local74 < arg0; local74++) {
				if (local31 >= local74) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(118) int local118;
		for (local74 = 0; local74 < arg0; local74++) {
			for (local118 = 0; local118 < arg0; local118++) {
				if (local74 <= local118) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[0][2] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(169) int local169;
		for (local118 = arg0 - 1; local118 >= 0; local118--) {
			for (local169 = 0; local169 < arg0; local169++) {
				if (local169 >= local118) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[0][3] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(214) int local214;
		for (local169 = arg0 - 1; local169 >= 0; local169--) {
			for (local214 = 0; local214 < arg0; local214++) {
				if (local214 <= local169 >> 1) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[1][0] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(259) int local259;
		for (local214 = 0; local214 < arg0; local214++) {
			for (local259 = 0; local259 < arg0; local259++) {
				if (local25 >= 0 && local25 < local18.length) {
					if (local259 >= local214 << 1) {
						local18[local25] = -1;
					}
					local25++;
				} else {
					local25++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(321) int local321;
		for (local259 = 0; local259 < arg0; local259++) {
			for (local321 = arg0 - 1; local321 >= 0; local321--) {
				if (local321 <= local259 >> 1) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(370) int local370;
		for (local321 = arg0 - 1; local321 >= 0; local321--) {
			for (local370 = arg0 - 1; local370 >= 0; local370--) {
				if (local370 >= local321 << 1) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[1][3] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(411) int local411;
		for (local370 = arg0 - 1; local370 >= 0; local370--) {
			for (local411 = arg0 - 1; local411 >= 0; local411--) {
				if (local370 >> 1 >= local411) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(457) int local457;
		for (local411 = arg0 - 1; local411 >= 0; local411--) {
			for (local457 = 0; local457 < arg0; local457++) {
				if (local457 >= local411 << 1) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[2][1] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(495) int local495;
		for (local457 = 0; local457 < arg0; local457++) {
			for (local495 = 0; local495 < arg0; local495++) {
				if (local457 >> 1 >= local495) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[2][2] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(544) int local544;
		for (local495 = 0; local495 < arg0; local495++) {
			for (local544 = arg0 - 1; local544 >= 0; local544--) {
				if (local495 << 1 <= local544) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[2][3] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(588) int local588;
		for (local544 = arg0 - 1; local544 >= 0; local544--) {
			for (local588 = 0; local588 < arg0; local588++) {
				if (local588 >= local544 >> 1) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(626) int local626;
		for (local588 = 0; local588 < arg0; local588++) {
			for (local626 = 0; local626 < arg0; local626++) {
				if (local588 << 1 >= local626) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(671) int local671;
		for (local626 = 0; local626 < arg0; local626++) {
			for (local671 = arg0 - 1; local671 >= 0; local671--) {
				if (local671 >= local626 >> 1) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(720) int local720;
		for (local671 = arg0 - 1; local671 >= 0; local671--) {
			for (local720 = arg0 - 1; local720 >= 0; local720--) {
				if (local671 << 1 >= local720) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(768) int local768;
		for (local720 = arg0 - 1; local720 >= 0; local720--) {
			for (local768 = arg0 - 1; local768 >= 0; local768--) {
				if (local768 >= local720 >> 1) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(810) int local810;
		for (local768 = arg0 - 1; local768 >= 0; local768--) {
			for (local810 = 0; local810 < arg0; local810++) {
				if (local768 << 1 >= local810) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[4][1] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(856) int local856;
		for (local810 = 0; local810 < arg0; local810++) {
			for (local856 = 0; local856 < arg0; local856++) {
				if (local810 >> 1 <= local856) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(901) int local901;
		for (local856 = 0; local856 < arg0; local856++) {
			for (local901 = arg0 - 1; local901 >= 0; local901--) {
				if (local856 << 1 >= local901) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[4][3] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(947) int local947;
		for (local901 = 0; local901 < arg0; local901++) {
			for (local947 = 0; local947 < arg0; local947++) {
				if (arg0 / 2 >= local947) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[5][0] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(990) int local990;
		for (local947 = 0; local947 < arg0; local947++) {
			for (local990 = 0; local990 < arg0; local990++) {
				if (local947 <= arg0 / 2) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1029) int local1029;
		for (local990 = 0; local990 < arg0; local990++) {
			for (local1029 = 0; local1029 < arg0; local1029++) {
				if (local1029 >= arg0 / 2) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1076) int local1076;
		for (local1029 = 0; local1029 < arg0; local1029++) {
			for (local1076 = 0; local1076 < arg0; local1076++) {
				if (local1029 >= arg0 / 2) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[5][3] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1119) int local1119;
		for (local1076 = 0; local1076 < arg0; local1076++) {
			for (local1119 = 0; local1119 < arg0; local1119++) {
				if (local1076 - arg0 / 2 >= local1119) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1167) int local1167;
		for (local1119 = arg0 - 1; local1119 >= 0; local1119--) {
			for (local1167 = 0; local1167 < arg0; local1167++) {
				if (local1167 <= local1119 - arg0 / 2) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1212) int local1212;
		for (local1167 = arg0 - 1; local1167 >= 0; local1167--) {
			for (local1212 = arg0 - 1; local1212 >= 0; local1212--) {
				if (local1167 - arg0 / 2 >= local1212) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[6][2] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1254) int local1254;
		for (local1212 = 0; local1212 < arg0; local1212++) {
			for (local1254 = arg0 - 1; local1254 >= 0; local1254--) {
				if (local1254 <= local1212 - arg0 / 2) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[6][3] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1298) int local1298;
		for (local1254 = 0; local1254 < arg0; local1254++) {
			for (local1298 = 0; local1298 < arg0; local1298++) {
				if (local1254 - arg0 / 2 <= local1298) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[7][0] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1342) int local1342;
		for (local1298 = arg0 - 1; local1298 >= 0; local1298--) {
			for (local1342 = 0; local1342 < arg0; local1342++) {
				if (local1342 >= local1298 - arg0 / 2) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local25 = 0;
		@Pc(1390) int local1390;
		for (local1342 = arg0 - 1; local1342 >= 0; local1342--) {
			for (local1390 = arg0 - 1; local1390 >= 0; local1390--) {
				if (local1342 - arg0 / 2 <= local1390) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[7][2] = local18;
		local25 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1390 = 0; local1390 < arg0; local1390++) {
			for (@Pc(1435) int local1435 = arg0 - 1; local1435 >= 0; local1435--) {
				if (local1390 - arg0 / 2 <= local1435) {
					local18[local25] = -1;
				}
				local25++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
