import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!tt", name = "jb", descriptor = "[I")
	public static int[] anIntArray645;

	@OriginalMember(owner = "client!tt", name = "vb", descriptor = "Lclient!nba;")
	public static Class12_Sub37 aClass12_Sub37_2;

	@OriginalMember(owner = "client!tt", name = "xb", descriptor = "[I")
	public static int[] anIntArray646;

	@OriginalMember(owner = "client!tt", name = "Y", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_137 = new Class45(8, 14);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public static void method7191() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static110.aBooleanArray22[local11] = false;
		}
		Static242.anInt4993 = 5;
		Static165.anInt3828 = Static368.anInt6832;
		Static166.anInt3847 = -1;
		Static400.anInt7503 = Static248.anInt5104;
		Static257.anInt5237 = Static6.anInt93;
		Static259.anInt5252 = Static519.anInt9341;
		Static236.anInt4926 = Static409.anInt7683;
		Static376.anInt9581 = -1;
		Static129.anInt9544 = 0;
		Static160.anInt3747 = Static62.anInt1472;
		Static84.anInt2025 = 0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIBIII)V")
	public static void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg2;
		@Pc(21) int local21 = arg1 - arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(69) int local69 = local41 + local25 * (1 - local57);
		@Pc(78) int local78 = local29 - (local57 - 1) * local45;
		@Pc(86) int local86 = local49 + (1 - local61) * local33;
		@Pc(94) int local94 = local37 - (local61 - 1) * local53;
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = (local57 - 3) * local45;
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = (local61 - 3) * local53;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg1 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(177) int local177;
		@Pc(186) int local186;
		@Pc(194) int local194;
		@Pc(202) int local202;
		if (Static507.anInt9124 <= arg5 && arg5 <= Static234.anInt4897) {
			@Pc(168) int[] local168 = Static228.anIntArrayArray46[arg5];
			local177 = Static108.method2267(arg6 - arg3, Static251.anInt5168, Static341.anInt6481);
			local186 = Static108.method2267(arg6 + arg3, Static251.anInt5168, Static341.anInt6481);
			local194 = Static108.method2267(arg6 - local16, Static251.anInt5168, Static341.anInt6481);
			local202 = Static108.method2267(arg6 + local16, Static251.anInt5168, Static341.anInt6481);
			Static118.method2461(local168, local194, arg0, local177);
			Static118.method2461(local168, local202, arg4, local194);
			Static118.method2461(local168, local186, arg0, local202);
		}
		while (local9 > 0) {
			@Pc(229) boolean local229 = local21 >= local9;
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local140;
					local69 += local122;
					local140 += local110;
					local122 += local110;
					local7++;
				}
			}
			if (local229) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local132;
						local94 += local148;
						local132 += local118;
						local11++;
						local148 += local118;
					}
				}
				if (local94 < 0) {
					local86 += local132;
					local94 += local148;
					local148 += local118;
					local132 += local118;
					local11++;
				}
				local94 += -local138;
				local86 += -local154;
				local138 -= local114;
				local154 -= local114;
			}
			if (local78 < 0) {
				local69 += local122;
				local78 += local140;
				local122 += local110;
				local140 += local110;
				local7++;
			}
			local78 += -local128;
			local69 += -local146;
			local9--;
			local128 -= local106;
			local146 -= local106;
			local177 = arg5 - local9;
			local186 = local9 + arg5;
			if (Static507.anInt9124 <= local186 && Static234.anInt4897 >= local177) {
				local194 = Static108.method2267(local7 + arg6, Static251.anInt5168, Static341.anInt6481);
				local202 = Static108.method2267(arg6 - local7, Static251.anInt5168, Static341.anInt6481);
				if (local229) {
					@Pc(435) int local435 = Static108.method2267(arg6 + local11, Static251.anInt5168, Static341.anInt6481);
					@Pc(444) int local444 = Static108.method2267(arg6 - local11, Static251.anInt5168, Static341.anInt6481);
					@Pc(455) int[] local455;
					if (local177 >= Static507.anInt9124) {
						local455 = Static228.anIntArrayArray46[local177];
						Static118.method2461(local455, local444, arg0, local202);
						Static118.method2461(local455, local435, arg4, local444);
						Static118.method2461(local455, local194, arg0, local435);
					}
					if (local186 <= Static234.anInt4897) {
						local455 = Static228.anIntArrayArray46[local186];
						Static118.method2461(local455, local444, arg0, local202);
						Static118.method2461(local455, local435, arg4, local444);
						Static118.method2461(local455, local194, arg0, local435);
					}
				} else {
					if (local177 >= Static507.anInt9124) {
						Static118.method2461(Static228.anIntArrayArray46[local177], local194, arg0, local202);
					}
					if (Static234.anInt4897 >= local186) {
						Static118.method2461(Static228.anIntArrayArray46[local186], local194, arg0, local202);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!nj;I)V")
	public static void method7195(@OriginalArg(1) Class12_Sub8_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) boolean local17 = arg0.method5238(1) == 1;
		if (local17) {
			Static523.anIntArray683[Static77.anInt1793++] = arg1;
		}
		@Pc(32) int local32 = arg0.method5238(2);
		@Pc(36) Class30_Sub1_Sub1_Sub1 local36 = Static90.aClass30_Sub1_Sub1_Sub1Array1[arg1];
		if (local32 != 0) {
			@Pc(153) int local153;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local32 == 1) {
				local153 = arg0.method5238(3);
				local158 = local36.anIntArray316[0];
				local163 = local36.anIntArray317[0];
				if (local153 == 0) {
					local158--;
					local163--;
				} else if (local153 == 1) {
					local163--;
				} else if (local153 == 2) {
					local163--;
					local158++;
				} else if (local153 == 3) {
					local158--;
				} else if (local153 == 4) {
					local158++;
				} else if (local153 == 5) {
					local163++;
					local158--;
				} else if (local153 == 6) {
					local163++;
				} else if (local153 == 7) {
					local163++;
					local158++;
				}
				if (local17) {
					local36.anInt738 = local163;
					local36.aBoolean41 = true;
					local36.anInt758 = local158;
				} else {
					local36.method779(Static219.aByteArray58[arg1], local158, local163);
				}
			} else if (local32 == 2) {
				local153 = arg0.method5238(4);
				local158 = local36.anIntArray316[0];
				local163 = local36.anIntArray317[0];
				if (local153 == 0) {
					local163 -= 2;
					local158 -= 2;
				} else if (local153 == 1) {
					local158--;
					local163 -= 2;
				} else if (local153 == 2) {
					local163 -= 2;
				} else if (local153 == 3) {
					local163 -= 2;
					local158++;
				} else if (local153 == 4) {
					local163 -= 2;
					local158 += 2;
				} else if (local153 == 5) {
					local163--;
					local158 -= 2;
				} else if (local153 == 6) {
					local163--;
					local158 += 2;
				} else if (local153 == 7) {
					local158 -= 2;
				} else if (local153 == 8) {
					local158 += 2;
				} else if (local153 == 9) {
					local158 -= 2;
					local163++;
				} else if (local153 == 10) {
					local163++;
					local158 += 2;
				} else if (local153 == 11) {
					local158 -= 2;
					local163 += 2;
				} else if (local153 == 12) {
					local163 += 2;
					local158--;
				} else if (local153 == 13) {
					local163 += 2;
				} else if (local153 == 14) {
					local158++;
					local163 += 2;
				} else if (local153 == 15) {
					local158 += 2;
					local163 += 2;
				}
				if (local17) {
					local36.anInt738 = local163;
					local36.aBoolean41 = true;
					local36.anInt758 = local158;
				} else {
					local36.method779(Static219.aByteArray58[arg1], local158, local163);
				}
			} else {
				local153 = arg0.method5238(1);
				@Pc(422) int local422;
				@Pc(432) int local432;
				@Pc(444) int local444;
				@Pc(451) int local451;
				if (local153 == 0) {
					local158 = arg0.method5238(12);
					local163 = local158 >> 10;
					local422 = local158 >> 5 & 0x1F;
					if (local422 > 15) {
						local422 -= 32;
					}
					local432 = local158 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local444 = local36.anIntArray316[0] + local422;
					local451 = local432 + local36.anIntArray317[0];
					if (local17) {
						local36.aBoolean41 = true;
						local36.anInt738 = local451;
						local36.anInt758 = local444;
					} else {
						local36.method779(Static219.aByteArray58[arg1], local444, local451);
					}
					local36.aByte99 = (byte) (local163 + local36.aByte99 & 0x3);
					if (Static396.anInt7452 == arg1) {
						Static56.anInt1418 = local36.aByte99;
					}
				} else {
					local158 = arg0.method5238(30);
					local163 = local158 >> 28;
					local422 = local158 >> 14 & 0x3FFF;
					local432 = local158 & 0x3FFF;
					local444 = (Static61.anInt1459 + local36.anIntArray316[0] + local422 & 0x3FFF) - Static61.anInt1459;
					local451 = (Static203.anInt4534 + local36.anIntArray317[0] + local432 & 0x3FFF) - Static203.anInt4534;
					if (local17) {
						local36.aBoolean41 = true;
						local36.anInt758 = local444;
						local36.anInt738 = local451;
					} else {
						local36.method779(Static219.aByteArray58[arg1], local444, local451);
					}
					local36.aByte99 = (byte) (local36.aByte99 + local163 & 0x3);
					if (arg1 == Static396.anInt7452) {
						Static56.anInt1418 = local36.aByte99;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean41 = false;
		} else if (arg1 == Static396.anInt7452) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(64) Class211 local64 = Static111.aClass211Array1[arg1] = new Class211();
			local64.anInt6041 = (local36.aByte99 << 28) + (Static61.anInt1459 + local36.anIntArray316[0] >> 6 << 14) + (Static203.anInt4534 - -local36.anIntArray317[0] >> 6);
			if (local36.anInt746 == -1) {
				local64.anInt6042 = local36.aClass221_7.method5389();
			} else {
				local64.anInt6042 = local36.anInt746;
			}
			local64.aBoolean459 = local36.aBoolean43;
			local64.anInt6044 = local36.anInt4135;
			if (local36.anInt754 > 0) {
				Static342.method2040(local36);
			}
			Static90.aClass30_Sub1_Sub1_Sub1Array1[arg1] = null;
			if (arg0.method5238(1) != 0) {
				Static46.method865(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7197(@OriginalArg(1) String arg0) {
		if (Static255.aStringArray29 == null) {
			Static406.method6372();
		}
		@Pc(16) String[] local16 = Static434.method6610(arg0, '\n');
		for (@Pc(23) int local23 = 0; local23 < local16.length; local23++) {
			for (@Pc(27) int local27 = Static118.anInt2734; local27 > 0; local27--) {
				Static255.aStringArray29[local27] = Static255.aStringArray29[local27 - 1];
			}
			Static255.aStringArray29[0] = local16[local23];
			if (Static118.anInt2734 < Static255.aStringArray29.length - 1) {
				if (Static380.anInt7651 > 0) {
					Static380.anInt7651++;
				}
				Static118.anInt2734++;
			}
		}
	}
}
