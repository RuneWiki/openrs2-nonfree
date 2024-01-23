import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!da", name = "E", descriptor = "Lclient!th;")
	public static Class171 aClass171_5;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Z")
	public static boolean aBoolean424 = true;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!da", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!da", name = "C", descriptor = "Lclient!l;")
	public static Class98 aClass98_45 = new Class98(64);

	@OriginalMember(owner = "client!da", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString226 = "Loading defaults - ";

	@OriginalMember(owner = "client!da", name = "G", descriptor = "I")
	public static int anInt5990 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZII)V")
	public static void method4892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg1, 12);
		local8.method971();
		local8.anInt1132 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z")
	public static boolean method4895() {
		try {
			return Static147.method2492();
		} catch (@Pc(15) IOException local15) {
			Static280.method3547();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(61) String local61 = "T2 - " + Static255.anInt5252 + "," + Static252.anInt5210 + "," + Static108.anInt2014 + " - " + Static287.anInt5742 + "," + (Static136.aClass10_Sub5_Sub1_1.anIntArray537[0] + Static101.anInt1844) + "," + (Static136.aClass10_Sub5_Sub1_1.anIntArray535[0] + Static43.anInt798) + " - ";
			for (@Pc(63) int local63 = 0; local63 < Static287.anInt5742 && local63 < 50; local63++) {
				local61 = local61 + Static249.aClass3_Sub26_Sub1_3.aByteArray64[local63] + ",";
			}
			Static42.method613(local61, local20);
			Static5.method101();
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)I")
	public static int method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static293.method4799(arg1 + 91923, 4, arg0 + 45365) + (Static293.method4799(arg1 + 37821, 2, arg0 + 10294) + -128 >> 1) + (Static293.method4799(arg1, 1, arg0) + -128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([[F[[I[[B[[[I[[I[[B[[F[[F[[II[[[B[[B[[I[[B[[II)[Lclient!mi;")
	public static Class3_Sub21[] method4904(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) int[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[][][] arg10, @OriginalArg(11) byte[][] arg11, @OriginalArg(12) int[][] arg12, @OriginalArg(13) byte[][] arg13, @OriginalArg(14) int[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(16) int local16;
		@Pc(21) int local21;
		@Pc(56) byte local56;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				local21 = 0;
				if (arg3 != null) {
					@Pc(37) int local37 = arg3[arg9][local11 >> 3][local16 >> 3];
					local21 = local37 >> 1 & 0x3;
				}
				if (local21 == 0) {
					local56 = arg13[local11][local16];
					if (local56 == 0) {
						local56 = arg13[local11 - 1][local16];
					}
					if (local56 == 0) {
						local56 = arg13[local11][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg13[local11 - 1][local16 - 1];
					}
				} else if (local21 == 1) {
					local56 = arg13[local11][local16 - 1];
					if (local56 == 0) {
						local56 = arg13[local11][local16];
					}
					if (local56 == 0) {
						local56 = arg13[local11 - 1][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg13[local11 - 1][local16];
					}
				} else if (local21 == 2) {
					local56 = arg13[local11 - 1][local16 - 1];
					if (local56 == 0) {
						local56 = arg13[local11][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg13[local11 - 1][local16];
					}
					if (local56 == 0) {
						local56 = arg13[local11][local16];
					}
				} else {
					local56 = arg13[local11 - 1][local16];
					if (local56 == 0) {
						local56 = arg13[local11 - 1][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg13[local11][local16];
					}
					if (local56 == 0) {
						local56 = arg13[local11][local16 - 1];
					}
				}
				if (local56 != 0) {
					@Pc(264) Class72 local264 = Static257.method4338((local56 & 0xFF) - 1);
					local9[local11][local16] = local264.anInt2008 + (local264.anInt2004 + 1 << 16);
				}
			}
		}
		@Pc(289) Class30 local289 = new Class30(128);
		@Pc(364) int local364;
		@Pc(358) int local358;
		@Pc(338) int local338;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				if (arg13[local16][local21] != 0) {
					@Pc(320) int[] local320;
					if (arg2[local16][local21] == 0) {
						local320 = Static29.anIntArrayArray5[0];
					} else {
						local320 = Static282.anIntArrayArray75[arg11[local16][local21]];
						if (local320.length == 0) {
							continue;
						}
					}
					local338 = 0;
					if (arg1 != null) {
						local338 = arg1[local16][local21] & 0xFFFFFF;
					}
					local358 = local9[local16 + 1][local21];
					local364 = local9[local16][local21];
					@Pc(374) int local374 = local9[local16 + 1][local21 + 1];
					@Pc(382) long local382 = (long) local358 << 32 | (long) local338;
					@Pc(390) int local390 = local9[local16][local21 + 1];
					@Pc(398) long local398 = (long) local338 | (long) local364 << 32;
					@Pc(406) long local406 = (long) local374 << 32 | (long) local338;
					@Pc(414) long local414 = (long) local338 | (long) local390 << 32;
					@Pc(419) int local419 = local320.length / 2;
					@Pc(425) Class3_Sub21 local425 = (Class3_Sub21) local289.method663(local398);
					if (local425 == null) {
						local425 = new Class3_Sub21((local364 >> 16) - 1, (float) (local364 & 0xFFFF), false, arg12 != null, local338);
						local289.method668(local425, local398);
					}
					local425.anInt3243++;
					local425.anInt3241 += local419;
					if (local398 != local382) {
						local425 = (Class3_Sub21) local289.method663(local382);
						if (local425 == null) {
							local425 = new Class3_Sub21((local358 >> 16) - 1, (float) (local358 & 0xFFFF), false, arg12 != null, local338);
							local289.method668(local425, local382);
						}
						local425.anInt3241 += local419;
						local425.anInt3243++;
					}
					if (local398 != local406 && local382 != local406) {
						local425 = (Class3_Sub21) local289.method663(local406);
						if (local425 == null) {
							local425 = new Class3_Sub21((local374 >> 16) - 1, (float) (local374 & 0xFFFF), false, arg12 != null, local338);
							local289.method668(local425, local406);
						}
						local425.anInt3241 += local419;
						local425.anInt3243++;
					}
					if (local398 != local414 && local382 != local414 && local406 != local414) {
						local425 = (Class3_Sub21) local289.method663(local414);
						if (local425 == null) {
							local425 = new Class3_Sub21((local390 >> 16) - 1, (float) (local390 & 0xFFFF), false, arg12 != null, local338);
							local289.method668(local425, local414);
						}
						local425.anInt3243++;
						local425.anInt3241 += local419;
					}
				}
			}
		}
		@Pc(660) Class3_Sub21 local660;
		for (local660 = (Class3_Sub21) local289.method664(); local660 != null; local660 = (Class3_Sub21) local289.method671()) {
			local660.method2857();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				local56 = arg13[local16][local21];
				if (local56 != 0) {
					if ((arg10[arg9][local16][local21] & 0x8) != 0) {
						local338 = 0;
					} else if ((arg10[1][local16][local21] & 0x2) == 2 && arg9 > 0) {
						local338 = arg9 - 1;
					} else {
						local338 = arg9;
					}
					local358 = 128;
					local364 = 0;
					if (arg1 != null) {
						local358 = arg1[local16][local21] >>> 24 << 3;
						local364 = arg1[local16][local21] & 0xFFFFFF;
					}
					@Pc(755) boolean[] local755 = null;
					@Pc(841) int local841;
					@Pc(906) int local906;
					@Pc(776) int[] local776;
					@Pc(768) byte local768;
					@Pc(818) int local818;
					@Pc(883) int local883;
					if (arg2[local16][local21] == 0) {
						local776 = Static29.anIntArrayArray5[0];
						local818 = local56 == arg13[local16 + 1][local21 - 1] ? 1 : -1;
						local841 = local56 == arg13[local16 - 1][local21 - 1] ? 1 : -1;
						if (local56 == arg13[local16][local21 - 1]) {
							local841++;
							local818++;
						} else {
							local818--;
							local841--;
						}
						local883 = local56 == arg13[local16 - 1][local21 + 1] ? 1 : -1;
						local906 = local56 == arg13[local16 + 1][local21 + 1] ? 1 : -1;
						if (arg13[local16 + 1][local21] == local56) {
							local818++;
							local906++;
						} else {
							local818--;
							local906--;
						}
						if (local56 == arg13[local16][local21 + 1]) {
							local883++;
							local906++;
						} else {
							local883--;
							local906--;
						}
						if (arg13[local16 - 1][local21] == local56) {
							local841++;
							local883++;
						} else {
							local883--;
							local841--;
						}
						@Pc(960) int local960 = local818 - local883;
						@Pc(965) int local965 = local841 - local906;
						if (local960 < 0) {
							local960 = -local960;
						}
						if (local965 < 0) {
							local965 = -local965;
						}
						local768 = (byte) (local965 >= local960 ? 0 : 1);
						arg5[local16][local21] = local768;
					} else {
						local768 = arg5[local16][local21];
						local776 = Static282.anIntArrayArray75[arg11[local16][local21]];
						local755 = Static191.aBooleanArrayArray5[arg11[local16][local21]];
						if (local776.length == 0) {
							continue;
						}
					}
					local841 = local9[local16][local21];
					local906 = local9[local16 + 1][local21 + 1];
					local883 = local9[local16][local21 + 1];
					local818 = local9[local16 + 1][local21];
					@Pc(1037) long local1037 = (long) local818 << 32 | (long) local364;
					@Pc(1045) long local1045 = (long) local364 | (long) local841 << 32;
					@Pc(1053) long local1053 = (long) local364 | (long) local906 << 32;
					@Pc(1061) long local1061 = (long) local883 << 32 | (long) local364;
					@Pc(1067) int local1067 = arg4[local16][local21];
					@Pc(1077) int local1077 = arg4[local16 + 1][local21 + 1];
					@Pc(1085) int local1085 = arg4[local16 + 1][local21];
					@Pc(1093) int local1093 = arg4[local16][local21 + 1];
					@Pc(1099) int local1099 = arg14[local16][local21];
					@Pc(1107) int local1107 = arg14[local16 + 1][local21];
					@Pc(1117) int local1117 = arg14[local16 + 1][local21 + 1];
					@Pc(1125) int local1125 = arg14[local16][local21 + 1];
					@Pc(1131) int local1131 = (local841 >> 16) - 1;
					@Pc(1137) int local1137 = (local818 >> 16) - 1;
					@Pc(1143) int local1143 = (local906 >> 16) - 1;
					@Pc(1149) int local1149 = (local883 >> 16) - 1;
					@Pc(1155) Class3_Sub21 local1155 = (Class3_Sub21) local289.method663(local1045);
					Static237.method4008(Static94.method1388(local1125, local1131, local1093), arg8, local768, local358, Static94.method1388(local1117, local1131, local1077), arg6, local818 >= local841, local906 >= local841, local755, local1155, local21, arg7, local841 <= local883, Static94.method1388(local1099, local1131, local1067), local841 <= local841, arg12, local16, local338, local776, Static94.method1388(local1107, local1131, local1085), arg0);
					if (local1045 != local1037) {
						local1155 = (Class3_Sub21) local289.method663(local1037);
						Static237.method4008(Static94.method1388(local1125, local1137, local1093), arg8, local768, local358, Static94.method1388(local1117, local1137, local1077), arg6, local818 <= local818, local818 <= local906, local755, local1155, local21, arg7, local883 >= local818, Static94.method1388(local1099, local1137, local1067), local841 >= local818, arg12, local16, local338, local776, Static94.method1388(local1107, local1137, local1085), arg0);
					}
					if (local1045 != local1053 && local1053 != local1037) {
						local1155 = (Class3_Sub21) local289.method663(local1053);
						Static237.method4008(Static94.method1388(local1125, local1143, local1093), arg8, local768, local358, Static94.method1388(local1117, local1143, local1077), arg6, local906 <= local818, local906 >= local906, local755, local1155, local21, arg7, local906 <= local883, Static94.method1388(local1099, local1143, local1067), local906 <= local841, arg12, local16, local338, local776, Static94.method1388(local1107, local1143, local1085), arg0);
					}
					if (local1045 != local1061 && local1061 != local1037 && local1053 != local1061) {
						local1155 = (Class3_Sub21) local289.method663(local1061);
						Static237.method4008(Static94.method1388(local1125, local1149, local1093), arg8, local768, local358, Static94.method1388(local1117, local1149, local1077), arg6, local883 <= local818, local906 >= local883, local755, local1155, local21, arg7, local883 <= local883, Static94.method1388(local1099, local1149, local1067), local841 >= local883, arg12, local16, local338, local776, Static94.method1388(local1107, local1149, local1085), arg0);
					}
				}
			}
		}
		for (local660 = (Class3_Sub21) local289.method664(); local660 != null; local660 = (Class3_Sub21) local289.method671()) {
			if (local660.anInt3239 == 0) {
				local660.method5013();
			} else {
				local660.method2858();
			}
		}
		local16 = local289.method673();
		@Pc(1544) Class3_Sub21[] local1544 = new Class3_Sub21[local16];
		@Pc(1547) long[] local1547 = new long[local16];
		local289.method672(local1544);
		for (local338 = 0; local338 < local16; local338++) {
			local1547[local338] = local1544[local338].aLong243;
		}
		Static62.method985(local1544, local1547);
		return local1544;
	}

	@OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V")
	public static void method4906() {
		Static166.aClass98_25.method2572();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!rn;I)V")
	public static void method4908(@OriginalArg(0) Class155 arg0) {
		Static138.aClass155_57 = arg0;
	}
}
