import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_3;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_172 = Static193.method3027("No response from server)3");

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!oc;")
	public static Class70 aClass70_170 = aClass70_172;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_171 = Static193.method3027(" loggt sich aus)3");

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_173 = Static193.method3027("wave2:");

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_174 = Static193.method3027("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_175 = aClass70_173;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!oc;")
	public static Class70 aClass70_176 = aClass70_173;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B)V")
	public static void method314(@OriginalArg(1) byte[] arg0) {
		@Pc(7) int local7 = Static132.anInt2576 >> 2 << 10;
		@Pc(22) byte[][] local22 = new byte[Static65.anInt1364][Static50.anInt1046];
		@Pc(26) int local26 = Static183.anInt2960 >> 1;
		@Pc(28) int local28 = 0;
		while (true) {
			@Pc(42) int local42;
			@Pc(54) int local54;
			while (local28 < arg0.length) {
				local42 = (arg0[local28++] & 0xFF) * 64 - Static157.anInt3260;
				local54 = (arg0[local28++] & 0xFF) * 64 - Static115.anInt2318;
				if (local42 > 0 && local54 > 0 && local42 + 64 < Static65.anInt1364 && local54 + 64 < Static50.anInt1046) {
					for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
						@Pc(85) byte[] local85 = local22[local42 + local77];
						@Pc(92) int local92 = Static50.anInt1046 - local54 - 1;
						for (@Pc(94) int local94 = -64; local94 < 0; local94++) {
							local85[local92--] = arg0[local28++];
						}
					}
				} else {
					local28 += 4096;
				}
			}
			local54 = Static50.anInt1046;
			local42 = Static65.anInt1364;
			@Pc(128) int[] local128 = new int[local54];
			@Pc(131) int[] local131 = new int[local54];
			@Pc(134) int[] local134 = new int[local54];
			@Pc(137) int[] local137 = new int[local54];
			@Pc(140) int[] local140 = new int[local54];
			for (@Pc(142) int local142 = -5; local142 < local42; local142++) {
				@Pc(167) int local167;
				@Pc(231) int local231;
				for (@Pc(146) int local146 = 0; local146 < local54; local146++) {
					@Pc(152) int local152 = local142 + 5;
					@Pc(214) int local214;
					if (local42 > local152) {
						local167 = local22[local152][local146] & 0xFF;
						if (local167 > 0) {
							@Pc(178) Class3_Sub3_Sub23 local178 = Static15.method295(local167 - 1);
							local128[local146] += local178.anInt3905;
							local140[local146] += local178.anInt3917;
							local131[local146] += local178.anInt3906;
							local134[local146] += local178.anInt3913;
							local214 = local137[local146]++;
						}
					}
					local167 = local142 - 5;
					if (local167 >= 0) {
						local231 = local22[local167][local146] & 0xFF;
						if (local231 > 0) {
							@Pc(242) Class3_Sub3_Sub23 local242 = Static15.method295(local231 - 1);
							local128[local146] -= local242.anInt3905;
							local140[local146] -= local242.anInt3917;
							local131[local146] -= local242.anInt3906;
							local134[local146] -= local242.anInt3913;
							local214 = local137[local146]--;
						}
					}
				}
				if (local142 >= 0) {
					@Pc(300) int[][] local300 = Static123.anIntArrayArrayArray9[local142 >> 6];
					@Pc(302) int local302 = 0;
					local231 = 0;
					@Pc(306) int local306 = 0;
					local167 = 0;
					@Pc(310) int local310 = 0;
					for (@Pc(312) int local312 = -5; local312 < local54; local312++) {
						@Pc(318) int local318 = local312 + 5;
						if (local318 < local54) {
							local302 += local131[local318];
							local306 += local134[local318];
							local167 += local128[local318];
							local310 += local137[local318];
							local231 += local140[local318];
						}
						@Pc(359) int local359 = local312 - 5;
						if (local359 >= 0) {
							local306 -= local134[local359];
							local231 -= local140[local359];
							local302 -= local131[local359];
							local310 -= local137[local359];
							local167 -= local128[local359];
						}
						if (local312 >= 0 && local310 > 0) {
							@Pc(402) int local402 = local312 >> 6;
							@Pc(423) int local423 = local306 == 0 ? 0 : Static113.method1644(local167 * 256 / local306, local231 / local310, local302 / local310);
							if (local22[local142][local312] != 0) {
								@Pc(456) int local456 = (local423 & 0x7F) + local26;
								if (local456 < 0) {
									local456 = 0;
								} else if (local456 > 127) {
									local456 = 127;
								}
								if (local300[local402] == null) {
									local300[local402] = Static123.anIntArrayArrayArray9[local142 >> 6][local402] = new int[4096];
								}
								@Pc(502) int local502 = (local423 + local7 & 0xFC00) + (local423 & 0x380) + local456;
								local300[local402][(local142 & 0x3F) + ((local312 & 0x3F) << 6)] = Static177.anIntArray299[Static159.method2396(96, local502)];
							} else if (local300[local402] != null) {
								local300[local402][((local312 & 0x3F) << 6) + (local142 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)V")
	public static void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (arg1 != Static190.anInt3865) {
			Static133.anIntArray187 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static133.anIntArray187[local17] = (local17 << 12) / arg1;
			}
			Static28.anInt579 = arg1 == 64 ? 2048 : 4096;
			Static190.anInt3865 = arg1;
			Static134.anInt2681 = arg1 - 1;
		}
		if (arg0 == Static97.anInt2014) {
			return;
		}
		if (Static190.anInt3865 == arg0) {
			Static34.anIntArray37 = Static133.anIntArray187;
		} else {
			Static34.anIntArray37 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static34.anIntArray37[local17] = (local17 << 12) / arg0;
			}
		}
		Static170.anInt1101 = arg0 - 1;
		Static97.anInt2014 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vh;II)V")
	public static void method318(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Object[] local14 = arg0.anObjectArray29;
		@Pc(20) int local20 = (Integer) local14[0];
		@Pc(24) Class3_Sub3_Sub22 local24 = Static6.method104(local20);
		if (local24 == null) {
			return;
		}
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		Static99.anInt2029 = 0;
		@Pc(35) int local35 = -1;
		@Pc(37) byte local37 = -1;
		@Pc(40) int[] local40 = local24.anIntArray328;
		@Pc(43) int[] local43 = local24.anIntArray329;
		@Pc(57) int local57;
		@Pc(93) int local93;
		try {
			Static117.anIntArray142 = new int[local24.anInt3864];
			Static47.aClass70Array19 = new Class70[local24.anInt3868];
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			for (local57 = 1; local57 < local14.length; local57++) {
				if (local14[local57] instanceof Integer) {
					local93 = (Integer) local14[local57];
					if (local93 == -2147483647) {
						local93 = arg0.anInt4146;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt4144;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass6_116 == null ? -1 : arg0.aClass6_116.anInt229;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt4143;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass6_116 == null ? -1 : arg0.aClass6_116.anInt261;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass6_115 == null ? -1 : arg0.aClass6_115.anInt229;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass6_115 == null ? -1 : arg0.aClass6_115.anInt261;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt4151;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt4152;
					}
					Static117.anIntArray142[local55++] = local93;
				} else if (local14[local57] instanceof Class70) {
					@Pc(73) Class70 local73 = (Class70) local14[local57];
					if (local73.method2032(Static82.aClass70_804)) {
						local73 = arg0.aClass70_2060;
					}
					Static47.aClass70Array19[local53++] = local73;
				}
			}
			local93 = 0;
			label2425: while (true) {
				local93++;
				if (arg1 < local93) {
					throw new RuntimeException("slow");
				}
				local35++;
				@Pc(207) int local207 = local40[local35];
				@Pc(743) int local743;
				@Pc(754) int local754;
				@Pc(602) int local602;
				@Pc(621) int local621;
				@Pc(561) Class70 local561;
				if (local207 < 100) {
					if (local207 == 0) {
						Static10.anIntArray23[local29++] = local43[local35];
						continue;
					}
					@Pc(230) int local230;
					if (local207 == 1) {
						local230 = local43[local35];
						Static10.anIntArray23[local29++] = Static16.anIntArray27[local230];
						continue;
					}
					if (local207 == 2) {
						local230 = local43[local35];
						local29--;
						Static16.anIntArray27[local230] = Static10.anIntArray23[local29];
						continue;
					}
					if (local207 == 3) {
						Static188.aClass70Array68[local31++] = local24.aClass70Array70[local35];
						continue;
					}
					if (local207 == 6) {
						local35 += local43[local35];
						continue;
					}
					if (local207 == 7) {
						local29 -= 2;
						if (Static10.anIntArray23[local29 + 1] != Static10.anIntArray23[local29]) {
							local35 += local43[local35];
						}
						continue;
					}
					if (local207 == 8) {
						local29 -= 2;
						if (Static10.anIntArray23[local29 + 1] == Static10.anIntArray23[local29]) {
							local35 += local43[local35];
						}
						continue;
					}
					if (local207 == 9) {
						local29 -= 2;
						if (Static10.anIntArray23[local29] < Static10.anIntArray23[local29 + 1]) {
							local35 += local43[local35];
						}
						continue;
					}
					if (local207 == 10) {
						local29 -= 2;
						if (Static10.anIntArray23[local29 + 1] < Static10.anIntArray23[local29]) {
							local35 += local43[local35];
						}
						continue;
					}
					if (local207 == 21) {
						if (Static99.anInt2029 == 0) {
							return;
						}
						@Pc(385) Class93 local385 = Static202.aClass93Array1[--Static99.anInt2029];
						local35 = local385.anInt4013;
						Static117.anIntArray142 = local385.anIntArray354;
						Static47.aClass70Array19 = local385.aClass70Array74;
						local24 = local385.aClass3_Sub3_Sub22_1;
						local40 = local24.anIntArray328;
						local43 = local24.anIntArray329;
						continue;
					}
					if (local207 == 25) {
						local230 = local43[local35];
						Static10.anIntArray23[local29++] = Static160.method2409(local230);
						continue;
					}
					if (local207 == 27) {
						local230 = local43[local35];
						local29--;
						Static85.method1228(local230, Static10.anIntArray23[local29]);
						continue;
					}
					if (local207 == 31) {
						local29 -= 2;
						if (Static10.anIntArray23[local29] <= Static10.anIntArray23[local29 + 1]) {
							local35 += local43[local35];
						}
						continue;
					}
					if (local207 == 32) {
						local29 -= 2;
						if (Static10.anIntArray23[local29 + 1] <= Static10.anIntArray23[local29]) {
							local35 += local43[local35];
						}
						continue;
					}
					if (local207 == 33) {
						Static10.anIntArray23[local29++] = Static117.anIntArray142[local43[local35]];
						continue;
					}
					@Pc(508) int local508;
					if (local207 == 34) {
						local508 = local43[local35];
						local29--;
						Static117.anIntArray142[local508] = Static10.anIntArray23[local29];
						continue;
					}
					if (local207 == 35) {
						Static188.aClass70Array68[local31++] = Static47.aClass70Array19[local43[local35]];
						continue;
					}
					if (local207 == 36) {
						local508 = local43[local35];
						local31--;
						Static47.aClass70Array19[local508] = Static188.aClass70Array68[local31];
						continue;
					}
					if (local207 == 37) {
						local230 = local43[local35];
						local31 -= local230;
						local561 = Static136.method1941(local31, Static188.aClass70Array68, local230);
						Static188.aClass70Array68[local31++] = local561;
						continue;
					}
					if (local207 == 38) {
						local29--;
						continue;
					}
					if (local207 == 39) {
						local31--;
						continue;
					}
					if (local207 == 40) {
						local230 = local43[local35];
						@Pc(592) Class3_Sub3_Sub22 local592 = Static6.method104(local230);
						@Pc(596) int[] local596 = new int[local592.anInt3864];
						@Pc(600) Class70[] local600 = new Class70[local592.anInt3868];
						for (local602 = 0; local602 < local592.anInt3869; local602++) {
							local596[local602] = Static10.anIntArray23[local29 + local602 - local592.anInt3869];
						}
						for (local621 = 0; local621 < local592.anInt3867; local621++) {
							local600[local621] = Static188.aClass70Array68[local621 + local31 - local592.anInt3867];
						}
						local31 -= local592.anInt3867;
						local29 -= local592.anInt3869;
						@Pc(657) Class93 local657 = new Class93();
						local657.anInt4013 = local35;
						local657.aClass3_Sub3_Sub22_1 = local24;
						local657.aClass70Array74 = Static47.aClass70Array19;
						local657.anIntArray354 = Static117.anIntArray142;
						if (Static99.anInt2029 >= Static202.aClass93Array1.length) {
							throw new RuntimeException();
						}
						Static202.aClass93Array1[Static99.anInt2029++] = local657;
						local24 = local592;
						Static117.anIntArray142 = local596;
						local40 = local592.anIntArray328;
						local43 = local592.anIntArray329;
						Static47.aClass70Array19 = local600;
						local35 = -1;
						continue;
					}
					if (local207 == 42) {
						Static10.anIntArray23[local29++] = Static132.anIntArray179[local43[local35]];
						continue;
					}
					if (local207 == 43) {
						local508 = local43[local35];
						local29--;
						Static132.anIntArray179[local508] = Static10.anIntArray23[local29];
						continue;
					}
					if (local207 == 44) {
						local743 = local43[local35] & 0xFFFF;
						local230 = local43[local35] >> 16;
						local29--;
						local754 = Static10.anIntArray23[local29];
						if (local754 >= 0 && local754 <= 5000) {
							Static186.anIntArray326[local230] = local754;
							@Pc(771) byte local771 = -1;
							if (local743 == 105) {
								local771 = 0;
							}
							local602 = 0;
							while (true) {
								if (local754 <= local602) {
									continue label2425;
								}
								Static3.anIntArrayArray2[local230][local602] = local771;
								local602++;
							}
						}
						throw new RuntimeException();
					}
					if (local207 == 45) {
						local230 = local43[local35];
						local29--;
						local743 = Static10.anIntArray23[local29];
						if (local743 >= 0 && local743 < Static186.anIntArray326[local230]) {
							Static10.anIntArray23[local29++] = Static3.anIntArrayArray2[local230][local743];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 46) {
						local230 = local43[local35];
						local29 -= 2;
						local743 = Static10.anIntArray23[local29];
						if (local743 >= 0 && Static186.anIntArray326[local230] > local743) {
							Static3.anIntArrayArray2[local230][local743] = Static10.anIntArray23[local29 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 47) {
						@Pc(879) Class70 local879 = Static149.aClass70Array54[local43[local35]];
						if (local879 == null) {
							local879 = Static59.aClass70_1103;
						}
						Static188.aClass70Array68[local31++] = local879;
						continue;
					}
					if (local207 == 48) {
						local508 = local43[local35];
						local31--;
						Static149.aClass70Array54[local508] = Static188.aClass70Array68[local31];
						continue;
					}
					if (local207 == 51) {
						@Pc(916) Class40 local916 = local24.aClass40Array1[local43[local35]];
						local29--;
						@Pc(926) Class3_Sub16 local926 = (Class3_Sub16) local916.method1029((long) Static10.anIntArray23[local29]);
						if (local926 != null) {
							local35 += local926.anInt2100;
						}
						continue;
					}
				}
				@Pc(941) boolean local941;
				if (local43[local35] == 1) {
					local941 = true;
				} else {
					local941 = false;
				}
				@Pc(7744) Class6 local7744;
				@Pc(7718) Class6 local7718;
				@Pc(1840) int local1840;
				@Pc(1040) Class6 local1040;
				@Pc(2559) int local2559;
				if (local207 < 300) {
					if (local207 == 100) {
						local29 -= 3;
						local743 = Static10.anIntArray23[local29];
						local754 = Static10.anIntArray23[local29 + 1];
						local2559 = Static10.anIntArray23[local29 + 2];
						if (local754 == 0) {
							throw new RuntimeException();
						}
						local7718 = Static146.method2127(local743);
						if (local7718.aClass6Array1 == null) {
							local7718.aClass6Array1 = new Class6[local2559 + 1];
						}
						if (local7718.aClass6Array1.length <= local2559) {
							@Pc(8349) Class6[] local8349 = new Class6[local2559 + 1];
							for (local1840 = 0; local1840 < local7718.aClass6Array1.length; local1840++) {
								local8349[local1840] = local7718.aClass6Array1[local1840];
							}
							local7718.aClass6Array1 = local8349;
						}
						if (local2559 > 0 && local7718.aClass6Array1[local2559 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local2559 - 1));
						}
						@Pc(8394) Class6 local8394 = new Class6();
						local8394.anInt198 = local8394.anInt229 = local7718.anInt229;
						local8394.anInt261 = local2559;
						local8394.aBoolean21 = true;
						local8394.anInt250 = local754;
						local7718.aClass6Array1[local2559] = local8394;
						if (local941) {
							Static156.aClass6_84 = local8394;
						} else {
							Static115.aClass6_65 = local8394;
						}
						Static9.method237(local7718);
						continue;
					}
					@Pc(8457) Class6 local8457;
					if (local207 == 101) {
						local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
						if (local1040.anInt261 == -1) {
							if (!local941) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local8457 = Static146.method2127(local1040.anInt229);
						local8457.aClass6Array1[local1040.anInt261] = null;
						Static9.method237(local8457);
						continue;
					}
					if (local207 == 102) {
						local29--;
						local1040 = Static146.method2127(Static10.anIntArray23[local29]);
						local1040.aClass6Array1 = null;
						Static9.method237(local1040);
						continue;
					}
					if (local207 == 200) {
						local29 -= 2;
						local743 = Static10.anIntArray23[local29];
						local754 = Static10.anIntArray23[local29 + 1];
						local7744 = Static64.method982(local754, local743);
						if (local7744 != null && local754 != -1) {
							Static10.anIntArray23[local29++] = 1;
							if (local941) {
								Static156.aClass6_84 = local7744;
							} else {
								Static115.aClass6_65 = local7744;
							}
							continue;
						}
						Static10.anIntArray23[local29++] = 0;
						continue;
					}
					if (local207 == 201) {
						local29--;
						local743 = Static10.anIntArray23[local29];
						local8457 = Static146.method2127(local743);
						if (local8457 == null) {
							Static10.anIntArray23[local29++] = 0;
						} else {
							Static10.anIntArray23[local29++] = 1;
							if (local941) {
								Static156.aClass6_84 = local8457;
							} else {
								Static115.aClass6_65 = local8457;
							}
						}
						continue;
					}
				} else if (local207 < 500) {
					if (local207 == 403) {
						local29 -= 2;
						local743 = Static10.anIntArray23[local29];
						if (local743 >= 7) {
							local743 -= 7;
						}
						local754 = Static10.anIntArray23[local29 + 1];
						Static144.aClass26_Sub2_Sub1_1.aClass101_1.method3314(local743, local754);
						continue;
					}
					if (local207 == 404) {
						local29 -= 2;
						local754 = Static10.anIntArray23[local29 + 1];
						local743 = Static10.anIntArray23[local29];
						Static144.aClass26_Sub2_Sub1_1.aClass101_1.method3315(local754, local743);
						continue;
					}
					if (local207 == 410) {
						local29--;
						@Pc(1013) boolean local1013 = Static10.anIntArray23[local29] != 0;
						Static144.aClass26_Sub2_Sub1_1.aClass101_1.method3313(local1013);
						continue;
					}
				} else if ((local207 < 1000 || local207 >= 1100) && (local207 < 2000 || local207 >= 2100)) {
					@Pc(1494) Class70 local1494;
					if (local207 >= 1100 && local207 < 1200 || local207 >= 2100 && local207 < 2200) {
						if (local207 < 2000) {
							local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
						} else {
							local29--;
							local1040 = Static146.method2127(Static10.anIntArray23[local29]);
							local207 -= 1000;
						}
						if (local207 == 1100) {
							local29 -= 2;
							local1040.anInt271 = Static10.anIntArray23[local29];
							if (local1040.anInt209 - local1040.anInt244 < local1040.anInt271) {
								local1040.anInt271 = local1040.anInt209 - local1040.anInt244;
							}
							if (local1040.anInt271 < 0) {
								local1040.anInt271 = 0;
							}
							local1040.anInt270 = Static10.anIntArray23[local29 + 1];
							if (local1040.anInt220 - local1040.anInt217 < local1040.anInt270) {
								local1040.anInt270 = local1040.anInt220 - local1040.anInt217;
							}
							if (local1040.anInt270 < 0) {
								local1040.anInt270 = 0;
							}
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1101) {
							local29--;
							local1040.anInt243 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1102) {
							local29--;
							local1040.aBoolean25 = Static10.anIntArray23[local29] == 1;
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1103) {
							local29--;
							local1040.anInt215 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1104) {
							local29--;
							local1040.anInt241 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1105) {
							local29--;
							local1040.anInt252 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1106) {
							local29--;
							local1040.anInt206 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1107) {
							local29--;
							local1040.aBoolean13 = Static10.anIntArray23[local29] == 1;
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1108) {
							local1040.anInt224 = 1;
							local29--;
							local1040.anInt201 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1109) {
							local29 -= 6;
							local1040.anInt273 = Static10.anIntArray23[local29];
							local1040.anInt276 = Static10.anIntArray23[local29 + 1];
							local1040.anInt263 = Static10.anIntArray23[local29 + 2];
							local1040.anInt200 = Static10.anIntArray23[local29 + 3];
							local1040.anInt204 = Static10.anIntArray23[local29 + 4];
							local1040.anInt245 = Static10.anIntArray23[local29 + 5];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1110) {
							local29--;
							local754 = Static10.anIntArray23[local29];
							if (local754 != local1040.anInt248) {
								local1040.anInt210 = 0;
								local1040.anInt248 = local754;
								local1040.anInt265 = 0;
								Static9.method237(local1040);
							}
							continue;
						}
						if (local207 == 1111) {
							local29--;
							local1040.aBoolean23 = Static10.anIntArray23[local29] == 1;
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1112) {
							local31--;
							local1494 = Static188.aClass70Array68[local31];
							if (!local1494.method2032(local1040.aClass70_122)) {
								local1040.aClass70_122 = local1494;
								Static9.method237(local1040);
							}
							continue;
						}
						if (local207 == 1113) {
							local29--;
							local1040.anInt255 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1114) {
							local29 -= 3;
							local1040.anInt231 = Static10.anIntArray23[local29];
							local1040.anInt239 = Static10.anIntArray23[local29 + 1];
							local1040.anInt221 = Static10.anIntArray23[local29 + 2];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1115) {
							local29--;
							local1040.aBoolean27 = Static10.anIntArray23[local29] == 1;
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1116) {
							local29--;
							local1040.anInt225 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1117) {
							local29--;
							local1040.anInt232 = Static10.anIntArray23[local29];
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1118) {
							local29--;
							local1040.aBoolean16 = Static10.anIntArray23[local29] == 1;
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1119) {
							local29--;
							local1040.aBoolean18 = Static10.anIntArray23[local29] == 1;
							Static9.method237(local1040);
							continue;
						}
						if (local207 == 1120) {
							local29 -= 2;
							local1040.anInt209 = Static10.anIntArray23[local29];
							local1040.anInt220 = Static10.anIntArray23[local29 + 1];
							Static9.method237(local1040);
							if (local1040.anInt250 == 0) {
								Static83.method1194(local1040);
							}
							continue;
						}
					} else if (local207 >= 1200 && local207 < 1300 || local207 >= 2200 && local207 < 2300) {
						if (local207 < 2000) {
							local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
						} else {
							local29--;
							local1040 = Static146.method2127(Static10.anIntArray23[local29]);
							local207 -= 1000;
						}
						Static9.method237(local1040);
						if (local207 == 1200 || local207 == 1205) {
							local29 -= 2;
							local2559 = Static10.anIntArray23[local29 + 1];
							local754 = Static10.anIntArray23[local29];
							if (local754 == -1) {
								local1040.anInt201 = -1;
								local1040.anInt224 = 1;
								local1040.anInt254 = -1;
							} else {
								local1040.anInt238 = local2559;
								local1040.anInt254 = local754;
								@Pc(8176) Class3_Sub3_Sub11 local8176 = Static14.method275(local754);
								local1040.anInt200 = local8176.anInt1218;
								local1040.anInt204 = local8176.anInt1255;
								local1040.anInt245 = local8176.anInt1251;
								local1040.anInt276 = local8176.anInt1254;
								local1040.anInt273 = local8176.anInt1266;
								if (local1040.anInt268 > 0) {
									local1040.anInt245 = local1040.anInt245 * 32 / local1040.anInt268;
								} else if (local1040.anInt247 > 0) {
									local1040.anInt245 = local1040.anInt245 * 32 / local1040.anInt247;
								}
								if (local207 == 1205) {
									local1040.aBoolean15 = false;
								} else {
									local1040.aBoolean15 = true;
								}
								local1040.anInt263 = local8176.anInt1233;
							}
							continue;
						}
						if (local207 == 1201) {
							local1040.anInt224 = 2;
							local29--;
							local1040.anInt201 = Static10.anIntArray23[local29];
							continue;
						}
						if (local207 == 1202) {
							local1040.anInt224 = 3;
							local1040.anInt201 = Static144.aClass26_Sub2_Sub1_1.aClass101_1.method3319();
							continue;
						}
						if (local207 == 1203) {
							local1040.anInt224 = 6;
							local29--;
							local1040.anInt201 = Static10.anIntArray23[local29];
							continue;
						}
						if (local207 == 1204) {
							local1040.anInt224 = 5;
							local29--;
							local1040.anInt201 = Static10.anIntArray23[local29];
							continue;
						}
					} else if (local207 >= 1300 && local207 < 1400 || local207 >= 2300 && local207 < 2400) {
						if (local207 < 2000) {
							local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
						} else {
							local207 -= 1000;
							local29--;
							local1040 = Static146.method2127(Static10.anIntArray23[local29]);
						}
						if (local207 == 1300) {
							local29--;
							local754 = Static10.anIntArray23[local29] - 1;
							if (local754 >= 0 && local754 <= 9) {
								local31--;
								local1040.method229(local754, Static188.aClass70Array68[local31]);
								continue;
							}
							local31--;
							continue;
						}
						if (local207 == 1301) {
							local29 -= 2;
							local754 = Static10.anIntArray23[local29];
							local2559 = Static10.anIntArray23[local29 + 1];
							local1040.aClass6_10 = Static64.method982(local2559, local754);
							continue;
						}
						if (local207 == 1302) {
							local29--;
							local1040.aBoolean26 = Static10.anIntArray23[local29] == 1;
							continue;
						}
						if (local207 == 1303) {
							local29--;
							local1040.anInt218 = Static10.anIntArray23[local29];
							continue;
						}
						if (local207 == 1304) {
							local29--;
							local1040.anInt228 = Static10.anIntArray23[local29];
							continue;
						}
						if (local207 == 1305) {
							local31--;
							local1040.aClass70_125 = Static188.aClass70Array68[local31];
							continue;
						}
						if (local207 == 1306) {
							local31--;
							local1040.aClass70_124 = Static188.aClass70Array68[local31];
							continue;
						}
						if (local207 == 1307) {
							local1040.aClass70Array5 = null;
							continue;
						}
					} else {
						if (local207 >= 1400 && local207 < 1500 || local207 >= 2400 && local207 < 2500) {
							if (local207 < 2000) {
								local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
							} else {
								local29--;
								local1040 = Static146.method2127(Static10.anIntArray23[local29]);
								local207 -= 1000;
							}
							local31--;
							local1494 = Static188.aClass70Array68[local31];
							@Pc(1735) int[] local1735 = null;
							if (local1494.method2045() > 0 && local1494.method2055(local1494.method2045() - 1) == 89) {
								local29--;
								local602 = Static10.anIntArray23[local29];
								if (local602 > 0) {
									local1735 = new int[local602];
									while (local602-- > 0) {
										local29--;
										local1735[local602] = Static10.anIntArray23[local29];
									}
								}
								local1494 = local1494.method2023(local1494.method2045() - 1, 0);
							}
							@Pc(1795) Object[] local1795 = new Object[local1494.method2045() + 1];
							for (local621 = local1795.length - 1; local621 >= 1; local621--) {
								if (local1494.method2055(local621 - 1) == 115) {
									local31--;
									local1795[local621] = Static188.aClass70Array68[local31];
								} else {
									local29--;
									local1795[local621] = Integer.valueOf(Static10.anIntArray23[local29]);
								}
							}
							local29--;
							local1840 = Static10.anIntArray23[local29];
							if (local1840 == -1) {
								local1795 = null;
							} else {
								local1795[0] = Integer.valueOf(local1840);
							}
							if (local207 == 1403) {
								local1040.anObjectArray4 = local1795;
							}
							if (local207 == 1411) {
								local1040.anObjectArray17 = local1795;
							}
							if (local207 == 1422) {
								local1040.anObjectArray9 = local1795;
							}
							if (local207 == 1405) {
								local1040.anObjectArray12 = local1795;
							}
							if (local207 == 1406) {
								local1040.anObjectArray24 = local1795;
							}
							if (local207 == 1415) {
								local1040.anIntArray10 = local1735;
								local1040.anObjectArray8 = local1795;
							}
							if (local207 == 1417) {
								local1040.anObjectArray1 = local1795;
							}
							if (local207 == 1401) {
								local1040.anObjectArray5 = local1795;
							}
							if (local207 == 1421) {
								local1040.anObjectArray7 = local1795;
							}
							if (local207 == 1407) {
								local1040.anIntArray12 = local1735;
								local1040.anObjectArray10 = local1795;
							}
							if (local207 == 1423) {
								local1040.anObjectArray11 = local1795;
							}
							if (local207 == 1419) {
								local1040.anObjectArray2 = local1795;
							}
							if (local207 == 1410) {
								local1040.anObjectArray25 = local1795;
							}
							if (local207 == 1414) {
								local1040.anObjectArray23 = local1795;
								local1040.anIntArray16 = local1735;
							}
							if (local207 == 1425) {
								local1040.anObjectArray22 = local1795;
							}
							if (local207 == 1400) {
								local1040.anObjectArray16 = local1795;
							}
							if (local207 == 1408) {
								local1040.anObjectArray14 = local1795;
							}
							if (local207 == 1420) {
								local1040.anObjectArray18 = local1795;
							}
							if (local207 == 1424) {
								local1040.anObjectArray21 = local1795;
							}
							if (local207 == 1416) {
								local1040.anObjectArray19 = local1795;
							}
							if (local207 == 1418) {
								local1040.anObjectArray13 = local1795;
							}
							local1040.aBoolean20 = true;
							if (local207 == 1404) {
								local1040.anObjectArray20 = local1795;
							}
							if (local207 == 1402) {
								local1040.anObjectArray15 = local1795;
							}
							if (local207 == 1409) {
								local1040.anObjectArray3 = local1795;
							}
							if (local207 == 1412) {
								local1040.anObjectArray6 = local1795;
							}
							continue;
						}
						if (local207 < 1600) {
							local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
							if (local207 == 1500) {
								Static10.anIntArray23[local29++] = local1040.anInt236;
								continue;
							}
							if (local207 == 1501) {
								Static10.anIntArray23[local29++] = local1040.anInt219;
								continue;
							}
							if (local207 == 1502) {
								Static10.anIntArray23[local29++] = local1040.anInt244;
								continue;
							}
							if (local207 == 1503) {
								Static10.anIntArray23[local29++] = local1040.anInt217;
								continue;
							}
							if (local207 == 1504) {
								Static10.anIntArray23[local29++] = local1040.aBoolean19 ? 1 : 0;
								continue;
							}
							if (local207 == 1505) {
								Static10.anIntArray23[local29++] = local1040.anInt198;
								continue;
							}
						} else if (local207 < 1700) {
							local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
							if (local207 == 1600) {
								Static10.anIntArray23[local29++] = local1040.anInt271;
								continue;
							}
							if (local207 == 1601) {
								Static10.anIntArray23[local29++] = local1040.anInt270;
								continue;
							}
							if (local207 == 1602) {
								Static188.aClass70Array68[local31++] = local1040.aClass70_122;
								continue;
							}
							if (local207 == 1603) {
								Static10.anIntArray23[local29++] = local1040.anInt209;
								continue;
							}
							if (local207 == 1604) {
								Static10.anIntArray23[local29++] = local1040.anInt220;
								continue;
							}
							if (local207 == 1605) {
								Static10.anIntArray23[local29++] = local1040.anInt245;
								continue;
							}
							if (local207 == 1606) {
								Static10.anIntArray23[local29++] = local1040.anInt263;
								continue;
							}
							if (local207 == 1607) {
								Static10.anIntArray23[local29++] = local1040.anInt204;
								continue;
							}
							if (local207 == 1608) {
								Static10.anIntArray23[local29++] = local1040.anInt200;
								continue;
							}
							if (local207 == 1609) {
								Static10.anIntArray23[local29++] = local1040.anInt215;
								continue;
							}
						} else if (local207 < 1800) {
							local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
							if (local207 == 1700) {
								Static10.anIntArray23[local29++] = local1040.anInt254;
								continue;
							}
							if (local207 == 1701) {
								if (local1040.anInt254 == -1) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = local1040.anInt238;
								}
								continue;
							}
							if (local207 == 1702) {
								Static10.anIntArray23[local29++] = local1040.anInt261;
								continue;
							}
						} else if (local207 < 1900) {
							local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
							if (local207 == 1800) {
								Static10.anIntArray23[local29++] = Static86.method1231(Static157.method2365(local1040));
								continue;
							}
							if (local207 == 1801) {
								local29--;
								local754 = Static10.anIntArray23[local29];
								local754--;
								if (local1040.aClass70Array5 != null && local754 < local1040.aClass70Array5.length && local1040.aClass70Array5[local754] != null) {
									Static188.aClass70Array68[local31++] = local1040.aClass70Array5[local754];
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 1802) {
								if (local1040.aClass70_125 == null) {
									Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								} else {
									Static188.aClass70Array68[local31++] = local1040.aClass70_125;
								}
								continue;
							}
						} else if (local207 < 2600) {
							local29--;
							local1040 = Static146.method2127(Static10.anIntArray23[local29]);
							if (local207 == 2500) {
								Static10.anIntArray23[local29++] = local1040.anInt236;
								continue;
							}
							if (local207 == 2501) {
								Static10.anIntArray23[local29++] = local1040.anInt219;
								continue;
							}
							if (local207 == 2502) {
								Static10.anIntArray23[local29++] = local1040.anInt244;
								continue;
							}
							if (local207 == 2503) {
								Static10.anIntArray23[local29++] = local1040.anInt217;
								continue;
							}
							if (local207 == 2504) {
								Static10.anIntArray23[local29++] = local1040.aBoolean19 ? 1 : 0;
								continue;
							}
							if (local207 == 2505) {
								Static10.anIntArray23[local29++] = local1040.anInt198;
								continue;
							}
						} else if (local207 < 2700) {
							local29--;
							local1040 = Static146.method2127(Static10.anIntArray23[local29]);
							if (local207 == 2600) {
								Static10.anIntArray23[local29++] = local1040.anInt271;
								continue;
							}
							if (local207 == 2601) {
								Static10.anIntArray23[local29++] = local1040.anInt270;
								continue;
							}
							if (local207 == 2602) {
								Static188.aClass70Array68[local31++] = local1040.aClass70_122;
								continue;
							}
							if (local207 == 2603) {
								Static10.anIntArray23[local29++] = local1040.anInt209;
								continue;
							}
							if (local207 == 2604) {
								Static10.anIntArray23[local29++] = local1040.anInt220;
								continue;
							}
							if (local207 == 2605) {
								Static10.anIntArray23[local29++] = local1040.anInt245;
								continue;
							}
							if (local207 == 2606) {
								Static10.anIntArray23[local29++] = local1040.anInt263;
								continue;
							}
							if (local207 == 2607) {
								Static10.anIntArray23[local29++] = local1040.anInt204;
								continue;
							}
							if (local207 == 2608) {
								Static10.anIntArray23[local29++] = local1040.anInt200;
								continue;
							}
							if (local207 == 2609) {
								Static10.anIntArray23[local29++] = local1040.anInt215;
								continue;
							}
						} else if (local207 < 2800) {
							if (local207 == 2700) {
								local29--;
								local1040 = Static146.method2127(Static10.anIntArray23[local29]);
								Static10.anIntArray23[local29++] = local1040.anInt254;
								continue;
							}
							if (local207 == 2701) {
								local29--;
								local1040 = Static146.method2127(Static10.anIntArray23[local29]);
								if (local1040.anInt254 == -1) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = local1040.anInt238;
								}
								continue;
							}
							if (local207 == 2702) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								@Pc(2518) Class3_Sub10 local2518 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local743);
								if (local2518 == null) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = 1;
								}
								continue;
							}
							if (local207 == 2703) {
								local29--;
								local1040 = Static146.method2127(Static10.anIntArray23[local29]);
								if (local1040.aClass6Array1 == null) {
									Static10.anIntArray23[local29++] = 0;
									continue;
								}
								local754 = local1040.aClass6Array1.length;
								for (local2559 = 0; local2559 < local1040.aClass6Array1.length; local2559++) {
									if (local1040.aClass6Array1[local2559] == null) {
										local754 = local2559;
										break;
									}
								}
								Static10.anIntArray23[local29++] = local754;
								continue;
							}
							if (local207 == 2704 || local207 == 2705) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								@Pc(2610) Class3_Sub10 local2610 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local743);
								if (local2610 != null && local754 == local2610.anInt1427) {
									Static10.anIntArray23[local29++] = 1;
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
						} else if (local207 < 2900) {
							local29--;
							local1040 = Static146.method2127(Static10.anIntArray23[local29]);
							if (local207 == 2800) {
								Static10.anIntArray23[local29++] = Static86.method1231(Static157.method2365(local1040));
								continue;
							}
							if (local207 == 2801) {
								local29--;
								local754 = Static10.anIntArray23[local29];
								local754--;
								if (local1040.aClass70Array5 != null && local1040.aClass70Array5.length > local754 && local1040.aClass70Array5[local754] != null) {
									Static188.aClass70Array68[local31++] = local1040.aClass70Array5[local754];
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 2802) {
								if (local1040.aClass70_125 == null) {
									Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								} else {
									Static188.aClass70Array68[local31++] = local1040.aClass70_125;
								}
								continue;
							}
						} else if (local207 < 3200) {
							if (local207 == 3100) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static135.method1934(local561, 0, Static114.aClass70_1120);
								continue;
							}
							if (local207 == 3101) {
								local29 -= 2;
								Static66.method1003(Static144.aClass26_Sub2_Sub1_1, Static10.anIntArray23[local29], Static10.anIntArray23[local29 + 1]);
								continue;
							}
							if (local207 == 3103) {
								Static26.method468();
								continue;
							}
							if (local207 == 3104) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local754 = 0;
								if (local561.method2061()) {
									local754 = local561.method2025();
								}
								Static93.aClass3_Sub4_Sub1_18.method1298(43);
								Static93.aClass3_Sub4_Sub1_18.method1285(local754);
								continue;
							}
							if (local207 == 3105) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static93.aClass3_Sub4_Sub1_18.method1298(101);
								Static93.aClass3_Sub4_Sub1_18.method1250(local561.method2018());
								continue;
							}
							if (local207 == 3106) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static93.aClass3_Sub4_Sub1_18.method1298(194);
								Static93.aClass3_Sub4_Sub1_18.method1239(local561.method2045() + 1);
								Static93.aClass3_Sub4_Sub1_18.method1274(local561);
								continue;
							}
							if (local207 == 3107) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local31--;
								local1494 = Static188.aClass70Array68[local31];
								Static16.method303(local743, local1494);
								continue;
							}
							if (local207 == 3108) {
								local29 -= 3;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								local2559 = Static10.anIntArray23[local29 + 2];
								local7718 = Static146.method2127(local2559);
								Static107.method2402(local754, local743, local7718);
								continue;
							}
							if (local207 == 3109) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								local7744 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
								Static107.method2402(local754, local743, local7744);
								continue;
							}
							if (local207 == 3110) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static93.aClass3_Sub4_Sub1_18.method1298(114);
								Static93.aClass3_Sub4_Sub1_18.method1252(local743);
								continue;
							}
						} else if (local207 < 3300) {
							if (local207 == 3200) {
								local29 -= 3;
								Static117.method1694(Static10.anIntArray23[local29], Static10.anIntArray23[local29 + 1], Static10.anIntArray23[local29 + 2]);
								continue;
							}
							if (local207 == 3201) {
								local29--;
								Static12.method264(Static10.anIntArray23[local29]);
								continue;
							}
							if (local207 == 3202) {
								local29 -= 2;
								Static76.method1101(Static10.anIntArray23[local29], Static10.anIntArray23[local29 + 1]);
								continue;
							}
						} else if (local207 < 3400) {
							if (local207 == 3300) {
								Static10.anIntArray23[local29++] = Static184.anInt3760;
								continue;
							}
							if (local207 == 3301) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static97.method1407(local754, local743);
								continue;
							}
							if (local207 == 3302) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = Static53.method843(local754, local743);
								continue;
							}
							if (local207 == 3303) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static44.method725(local743, local754);
								continue;
							}
							if (local207 == 3304) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static95.method1377(local743).anInt2398;
								continue;
							}
							if (local207 == 3305) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static111.anIntArray138[local743];
								continue;
							}
							if (local207 == 3306) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static149.anIntArray220[local743];
								continue;
							}
							if (local207 == 3307) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static11.anIntArray24[local743];
								continue;
							}
							if (local207 == 3308) {
								local754 = (Static144.aClass26_Sub2_Sub1_1.anInt2593 >> 7) + Static30.anInt695;
								local743 = Static137.anInt2795;
								local2559 = (Static144.aClass26_Sub2_Sub1_1.anInt2611 >> 7) + Static55.anInt1184;
								Static10.anIntArray23[local29++] = local2559 + (local743 << 28) + (local754 << 14);
								continue;
							}
							if (local207 == 3309) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = local743 >> 14 & 0x3FFF;
								continue;
							}
							if (local207 == 3310) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = local743 >> 28;
								continue;
							}
							if (local207 == 3311) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = local743 & 0x3FFF;
								continue;
							}
							if (local207 == 3312) {
								Static10.anIntArray23[local29++] = Static4.aBoolean5 ? 1 : 0;
								continue;
							}
							if (local207 == 3313) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29] + 32768;
								Static10.anIntArray23[local29++] = Static97.method1407(local754, local743);
								continue;
							}
							if (local207 == 3314) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29] + 32768;
								Static10.anIntArray23[local29++] = Static53.method843(local754, local743);
								continue;
							}
							if (local207 == 3315) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29] + 32768;
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = Static44.method725(local743, local754);
								continue;
							}
							if (local207 == 3316) {
								if (Static89.anInt652 < 2) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = Static89.anInt652;
								}
								continue;
							}
							if (local207 == 3317) {
								Static10.anIntArray23[local29++] = Static139.anInt4131;
								continue;
							}
							if (local207 == 3318) {
								Static10.anIntArray23[local29++] = Static143.anInt2933;
								continue;
							}
							if (local207 == 3321) {
								Static10.anIntArray23[local29++] = Static141.anInt2856;
								continue;
							}
							if (local207 == 3322) {
								Static10.anIntArray23[local29++] = Static116.anInt3345;
								continue;
							}
							if (local207 == 3323) {
								if (Static28.anInt580 >= 5 && Static28.anInt580 <= 9) {
									Static10.anIntArray23[local29++] = 1;
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
							if (local207 == 3324) {
								if (Static28.anInt580 >= 5 && Static28.anInt580 <= 9) {
									Static10.anIntArray23[local29++] = Static28.anInt580;
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
							if (local207 == 3325) {
								if (Static55.anInt1173 > 0) {
									Static10.anIntArray23[local29++] = 1;
								} else {
									Static10.anIntArray23[local29++] = 0;
								}
								continue;
							}
							if (local207 == 3326) {
								Static10.anIntArray23[local29++] = Static144.aClass26_Sub2_Sub1_1.anInt1947;
								continue;
							}
							if (local207 == 3327) {
								Static10.anIntArray23[local29++] = Static144.aClass26_Sub2_Sub1_1.aClass101_1.aBoolean189 ? 1 : 0;
								continue;
							}
						} else if (local207 < 3500) {
							if (local207 == 3400) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								@Pc(2714) Class3_Sub3_Sub12 local2714 = Static153.method2266(local743);
								Static188.aClass70Array68[local31++] = local2714.method1002(local754);
								continue;
							}
							if (local207 == 3408) {
								local29 -= 4;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								local2559 = Static10.anIntArray23[local29 + 2];
								local602 = Static10.anIntArray23[local29 + 3];
								@Pc(2753) Class3_Sub3_Sub12 local2753 = Static153.method2266(local2559);
								if (local743 == local2753.anInt1386 && local754 == local2753.anInt1388) {
									if (local754 == 115) {
										Static188.aClass70Array68[local31++] = local2753.method1002(local602);
									} else {
										Static10.anIntArray23[local29++] = local2753.method1006(local602);
									}
									continue;
								}
								if (local754 == 115) {
									Static188.aClass70Array68[local31++] = Static59.aClass70_1103;
								} else {
									Static10.anIntArray23[local29++] = 0;
								}
								continue;
							}
						} else if (local207 < 3700) {
							if (local207 == 3600) {
								if (Static83.anInt1648 == 0) {
									Static10.anIntArray23[local29++] = -2;
								} else if (Static83.anInt1648 == 1) {
									Static10.anIntArray23[local29++] = -1;
								} else {
									Static10.anIntArray23[local29++] = Static13.anInt318;
								}
								continue;
							}
							if (local207 == 3601) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static83.anInt1648 == 2 && local743 < Static13.anInt318) {
									Static188.aClass70Array68[local31++] = Static52.aClass70Array24[local743];
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 3602) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static83.anInt1648 == 2 && Static13.anInt318 > local743) {
									Static10.anIntArray23[local29++] = Static179.anIntArray74[local743];
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
							if (local207 == 3603) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static83.anInt1648 == 2 && Static13.anInt318 > local743) {
									Static10.anIntArray23[local29++] = Static42.anIntArray46[local743];
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
							if (local207 == 3604) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local29--;
								local754 = Static10.anIntArray23[local29];
								Static25.method466(local561, local754);
								continue;
							}
							if (local207 == 3605) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static97.method1405(local561.method2018());
								continue;
							}
							if (local207 == 3606) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static52.method832(local561.method2018());
								continue;
							}
							if (local207 == 3607) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static185.method2903(local561.method2018());
								continue;
							}
							if (local207 == 3608) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static139.method3217(local561.method2018());
								continue;
							}
							if (local207 == 3609) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								if (local561.method2042(Static167.aClass70_1623) || local561.method2042(Static76.aClass70_737)) {
									local561 = local561.method2019(7);
								}
								Static10.anIntArray23[local29++] = Static146.method2128(local561) ? 1 : 0;
								continue;
							}
							if (local207 == 3610) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static83.anInt1648 == 2 && Static13.anInt318 > local743) {
									Static188.aClass70Array68[local31++] = Static81.aClass70Array32[local743];
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 3611) {
								if (Static34.aClass70_346 == null) {
									Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								} else {
									Static188.aClass70Array68[local31++] = Static34.aClass70_346.method2033();
								}
								continue;
							}
							if (local207 == 3612) {
								if (Static34.aClass70_346 == null) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = Static144.anInt2952;
								}
								continue;
							}
							if (local207 == 3613) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static34.aClass70_346 != null && Static144.anInt2952 > local743) {
									Static188.aClass70Array68[local31++] = Static86.aClass3_Sub13Array1[local743].aClass70_970.method2033();
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 3614) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static34.aClass70_346 != null && Static144.anInt2952 > local743) {
									Static10.anIntArray23[local29++] = Static86.aClass3_Sub13Array1[local743].anInt1978;
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
							if (local207 == 3615) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static34.aClass70_346 != null && Static144.anInt2952 > local743) {
									Static10.anIntArray23[local29++] = Static86.aClass3_Sub13Array1[local743].aByte10;
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
							if (local207 == 3616) {
								Static10.anIntArray23[local29++] = Static12.aByte6;
								continue;
							}
							if (local207 == 3617) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static160.method2410(local561);
								continue;
							}
							if (local207 == 3618) {
								Static10.anIntArray23[local29++] = Static92.aByte9;
								continue;
							}
							if (local207 == 3619) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static195.method3039(local561.method2018());
								continue;
							}
							if (local207 == 3620) {
								Static151.method2219();
								continue;
							}
							if (local207 == 3621) {
								if (Static83.anInt1648 == 0) {
									Static10.anIntArray23[local29++] = -1;
								} else {
									Static10.anIntArray23[local29++] = Static61.anInt1297;
								}
								continue;
							}
							if (local207 == 3622) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static83.anInt1648 != 0 && local743 < Static61.anInt1297) {
									Static188.aClass70Array68[local31++] = Static113.method1641(Static183.aLongArray6[local743]).method2033();
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 3623) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								if (local561.method2042(Static167.aClass70_1623) || local561.method2042(Static76.aClass70_737)) {
									local561 = local561.method2019(7);
								}
								Static10.anIntArray23[local29++] = Static146.method2124(local561) ? 1 : 0;
								continue;
							}
							if (local207 == 3624) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static86.aClass3_Sub13Array1 != null && Static144.anInt2952 > local743 && Static86.aClass3_Sub13Array1[local743].aClass70_970.method2059(Static144.aClass26_Sub2_Sub1_1.aClass70_952)) {
									Static10.anIntArray23[local29++] = 1;
									continue;
								}
								Static10.anIntArray23[local29++] = 0;
								continue;
							}
							if (local207 == 3625) {
								if (Static150.aClass70_1451 == null) {
									Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								} else {
									Static188.aClass70Array68[local31++] = Static150.aClass70_1451.method2033();
								}
								continue;
							}
							if (local207 == 3626) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (Static34.aClass70_346 != null && local743 < Static144.anInt2952) {
									Static188.aClass70Array68[local31++] = Static86.aClass3_Sub13Array1[local743].aClass70_969;
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
						} else if (local207 < 4000) {
							if (local207 == 3903) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static29.aClass27Array1[local743].method741();
								continue;
							}
							if (local207 == 3904) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static29.aClass27Array1[local743].anInt961;
								continue;
							}
							if (local207 == 3905) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static29.aClass27Array1[local743].anInt964;
								continue;
							}
							if (local207 == 3906) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static29.aClass27Array1[local743].anInt962;
								continue;
							}
							if (local207 == 3907) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static29.aClass27Array1[local743].anInt960;
								continue;
							}
							if (local207 == 3908) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static29.aClass27Array1[local743].anInt959;
								continue;
							}
							if (local207 == 3910) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local754 = Static29.aClass27Array1[local743].method743();
								Static10.anIntArray23[local29++] = local754 == 0 ? 1 : 0;
								continue;
							}
							if (local207 == 3911) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local754 = Static29.aClass27Array1[local743].method743();
								Static10.anIntArray23[local29++] = local754 == 2 ? 1 : 0;
								continue;
							}
							if (local207 == 3912) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local754 = Static29.aClass27Array1[local743].method743();
								Static10.anIntArray23[local29++] = local754 == 5 ? 1 : 0;
								continue;
							}
							if (local207 == 3913) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local754 = Static29.aClass27Array1[local743].method743();
								Static10.anIntArray23[local29++] = local754 == 1 ? 1 : 0;
								continue;
							}
						} else if (local207 < 4100) {
							if (local207 == 4000) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = local743 + local754;
								continue;
							}
							if (local207 == 4001) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = local743 - local754;
								continue;
							}
							if (local207 == 4002) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = local754 * local743;
								continue;
							}
							if (local207 == 4003) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = local743 / local754;
								continue;
							}
							if (local207 == 4004) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = (int) (Math.random() * (double) local743);
								continue;
							}
							if (local207 == 4005) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = (int) (Math.random() * (double) (local743 + 1));
								continue;
							}
							if (local207 == 4006) {
								local29 -= 5;
								local743 = Static10.anIntArray23[local29];
								local2559 = Static10.anIntArray23[local29 + 2];
								local754 = Static10.anIntArray23[local29 + 1];
								local602 = Static10.anIntArray23[local29 + 3];
								local621 = Static10.anIntArray23[local29 + 4];
								Static10.anIntArray23[local29++] = (local621 - local2559) * (-local743 + local754) / (local602 - local2559) + local743;
								continue;
							}
							@Pc(6488) long local6488;
							@Pc(6481) long local6481;
							if (local207 == 4007) {
								local29 -= 2;
								local6481 = Static10.anIntArray23[local29];
								local6488 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = (int) (local6481 + local6481 * local6488 / 100L);
								continue;
							}
							if (local207 == 4008) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = 0x1 << local754 | local743;
								continue;
							}
							if (local207 == 4009) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = -(0x1 << local754) - 1 & local743;
								continue;
							}
							if (local207 == 4010) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = (local743 & 0x1 << local754) == 0 ? 0 : 1;
								continue;
							}
							if (local207 == 4011) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = local743 % local754;
								continue;
							}
							if (local207 == 4012) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								if (local743 == 0) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = (int) Math.pow((double) local743, (double) local754);
								}
								continue;
							}
							if (local207 == 4013) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								if (local743 == 0) {
									Static10.anIntArray23[local29++] = 0;
								} else if (local754 == 0) {
									Static10.anIntArray23[local29++] = Integer.MAX_VALUE;
								} else {
									Static10.anIntArray23[local29++] = (int) Math.pow((double) local743, 1.0D / (double) local754);
								}
								continue;
							}
							if (local207 == 4014) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = local754 & local743;
								continue;
							}
							if (local207 == 4015) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = local743 | local754;
								continue;
							}
							if (local207 == 4016) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = local743 >= local754 ? local754 : local743;
								continue;
							}
							if (local207 == 4017) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = local743 > local754 ? local743 : local754;
								continue;
							}
							if (local207 == 4018) {
								local29 -= 3;
								local6481 = Static10.anIntArray23[local29];
								local6488 = Static10.anIntArray23[local29 + 1];
								@Pc(6817) long local6817 = (long) Static10.anIntArray23[local29 + 2];
								Static10.anIntArray23[local29++] = (int) (local6481 * local6817 / local6488);
								continue;
							}
						} else if (local207 < 4200) {
							if (local207 == 4100) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local29--;
								local754 = Static10.anIntArray23[local29];
								Static188.aClass70Array68[local31++] = Static207.method3296(new Class70[] { local561, Static107.method2404(local754) });
								continue;
							}
							if (local207 == 4101) {
								local31 -= 2;
								local561 = Static188.aClass70Array68[local31];
								local1494 = Static188.aClass70Array68[local31 + 1];
								Static188.aClass70Array68[local31++] = Static207.method3296(new Class70[] { local561, local1494 });
								continue;
							}
							if (local207 == 4102) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local29--;
								local754 = Static10.anIntArray23[local29];
								Static188.aClass70Array68[local31++] = Static207.method3296(new Class70[] { local561, Static57.method913(local754) });
								continue;
							}
							if (local207 == 4103) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static188.aClass70Array68[local31++] = local561.method2021();
								continue;
							}
							if (local207 == 4104) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								@Pc(3581) long local3581 = ((long) local743 + 11745L) * 86400000L;
								Static134.aCalendar1.setTime(new Date(local3581));
								local602 = Static134.aCalendar1.get(5);
								local621 = Static134.aCalendar1.get(2);
								local1840 = Static134.aCalendar1.get(1);
								Static188.aClass70Array68[local31++] = Static207.method3296(new Class70[] { Static107.method2404(local602), Static211.aClass70_2098, Static48.aClass70Array78[local621], Static211.aClass70_2098, Static107.method2404(local1840) });
								continue;
							}
							if (local207 == 4105) {
								local31 -= 2;
								local561 = Static188.aClass70Array68[local31];
								local1494 = Static188.aClass70Array68[local31 + 1];
								if (Static144.aClass26_Sub2_Sub1_1.aClass101_1 != null && Static144.aClass26_Sub2_Sub1_1.aClass101_1.aBoolean189) {
									Static188.aClass70Array68[local31++] = local1494;
									continue;
								}
								Static188.aClass70Array68[local31++] = local561;
								continue;
							}
							if (local207 == 4106) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static188.aClass70Array68[local31++] = Static107.method2404(local743);
								continue;
							}
							if (local207 == 4107) {
								local31 -= 2;
								Static10.anIntArray23[local29++] = Static188.aClass70Array68[local31].method2058(Static188.aClass70Array68[local31 + 1]);
								continue;
							}
							@Pc(3729) byte[] local3729;
							@Pc(3734) Class3_Sub3_Sub2_Sub4_Sub1 local3734;
							if (local207 == 4108) {
								local29 -= 2;
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local2559 = Static10.anIntArray23[local29 + 1];
								local754 = Static10.anIntArray23[local29];
								local3729 = Static28.aClass52_Sub1_5.method1581(local2559, 0);
								local3734 = new Class3_Sub3_Sub2_Sub4_Sub1(local3729);
								local3734.method3103(Static93.aClass3_Sub3_Sub2_Sub2Array6, null);
								Static10.anIntArray23[local29++] = local3734.method3110(local561, local754);
								continue;
							}
							if (local207 == 4109) {
								local29 -= 2;
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local2559 = Static10.anIntArray23[local29 + 1];
								local754 = Static10.anIntArray23[local29];
								local3729 = Static28.aClass52_Sub1_5.method1581(local2559, 0);
								local3734 = new Class3_Sub3_Sub2_Sub4_Sub1(local3729);
								local3734.method3103(Static93.aClass3_Sub3_Sub2_Sub2Array6, null);
								Static10.anIntArray23[local29++] = local3734.method3107(local561, local754);
								continue;
							}
							if (local207 == 4110) {
								local31 -= 2;
								local561 = Static188.aClass70Array68[local31];
								local1494 = Static188.aClass70Array68[local31 + 1];
								local29--;
								if (Static10.anIntArray23[local29] == 1) {
									Static188.aClass70Array68[local31++] = local561;
								} else {
									Static188.aClass70Array68[local31++] = local1494;
								}
								continue;
							}
							if (local207 == 4111) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static188.aClass70Array68[local31++] = Static173.method3101(local561);
								continue;
							}
							if (local207 == 4112) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local29--;
								local754 = Static10.anIntArray23[local29];
								if (local754 == -1) {
									throw new RuntimeException("null char");
								}
								Static188.aClass70Array68[local31++] = local561.method2035(local754);
								continue;
							}
							if (local207 == 4113) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static25.method465(local743) ? 1 : 0;
								continue;
							}
							if (local207 == 4114) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static148.method2160(local743) ? 1 : 0;
								continue;
							}
							if (local207 == 4115) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static209.method3303(local743) ? 1 : 0;
								continue;
							}
							if (local207 == 4116) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static30.method556(local743) ? 1 : 0;
								continue;
							}
							if (local207 == 4117) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								if (local561 == null) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = local561.method2045();
								}
								continue;
							}
							if (local207 == 4118) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local29 -= 2;
								local754 = Static10.anIntArray23[local29];
								local2559 = Static10.anIntArray23[local29 + 1];
								Static188.aClass70Array68[local31++] = local561.method2023(local2559, local754);
								continue;
							}
							if (local207 == 4119) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local1494 = Static180.method2794(local561.method2045());
								@Pc(4022) boolean local4022 = false;
								for (local602 = 0; local561.method2045() > local602; local602++) {
									local621 = local561.method2055(local602);
									if (local621 == 60) {
										local4022 = true;
									} else if (local621 == 62) {
										local4022 = false;
									} else if (!local4022) {
										local1494.method2048(local621);
									}
								}
								local1494.method2026();
								Static188.aClass70Array68[local31++] = local1494;
								continue;
							}
							if (local207 == 4120) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local29 -= 2;
								local754 = Static10.anIntArray23[local29];
								local2559 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = local561.method2047(local2559, local754);
								continue;
							}
							if (local207 == 4121) {
								local31 -= 2;
								local1494 = Static188.aClass70Array68[local31 + 1];
								local561 = Static188.aClass70Array68[local31];
								local29--;
								local2559 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = local561.method2038(local1494, local2559);
								continue;
							}
							if (local207 == 4122) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static159.method2395(local743);
								continue;
							}
							if (local207 == 4123) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static204.method3233(local743);
								continue;
							}
						} else if (local207 < 4300) {
							if (local207 == 4200) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static188.aClass70Array68[local31++] = Static14.method275(local743).aClass70_579;
								continue;
							}
							@Pc(4201) Class3_Sub3_Sub11 local4201;
							if (local207 == 4201) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								local4201 = Static14.method275(local743);
								if (local754 >= 1 && local754 <= 5 && local4201.aClass70Array26[local754 - 1] != null) {
									Static188.aClass70Array68[local31++] = local4201.aClass70Array26[local754 - 1];
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 4202) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								local4201 = Static14.method275(local743);
								if (local754 >= 1 && local754 <= 5 && local4201.aClass70Array25[local754 - 1] != null) {
									Static188.aClass70Array68[local31++] = local4201.aClass70Array25[local754 - 1];
									continue;
								}
								Static188.aClass70Array68[local31++] = Static114.aClass70_1120;
								continue;
							}
							if (local207 == 4203) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static14.method275(local743).anInt1260;
								continue;
							}
							if (local207 == 4204) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static14.method275(local743).anInt1232 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4338) Class3_Sub3_Sub11 local4338;
							if (local207 == 4205) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local4338 = Static14.method275(local743);
								if (local4338.anInt1261 == -1 && local4338.anInt1250 >= 0) {
									Static10.anIntArray23[local29++] = local4338.anInt1250;
									continue;
								}
								Static10.anIntArray23[local29++] = local743;
								continue;
							}
							if (local207 == 4206) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local4338 = Static14.method275(local743);
								if (local4338.anInt1261 >= 0 && local4338.anInt1250 >= 0) {
									Static10.anIntArray23[local29++] = local4338.anInt1250;
									continue;
								}
								Static10.anIntArray23[local29++] = local743;
								continue;
							}
							if (local207 == 4207) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static14.method275(local743).aBoolean72 ? 1 : 0;
								continue;
							}
							if (local207 == 4210) {
								local29--;
								local754 = Static10.anIntArray23[local29];
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static102.method1459(local754 == 1, local561);
								Static10.anIntArray23[local29++] = Static5.anInt102;
								continue;
							}
							if (local207 == 4211) {
								if (Static109.aShortArray27 != null && Static5.anInt102 > Static71.anInt1412) {
									Static10.anIntArray23[local29++] = Static109.aShortArray27[Static71.anInt1412++] & 0xFFFF;
									continue;
								}
								Static10.anIntArray23[local29++] = -1;
								continue;
							}
							if (local207 == 4212) {
								Static71.anInt1412 = 0;
								continue;
							}
						} else if (local207 < 5100) {
							if (local207 == 5000) {
								Static10.anIntArray23[local29++] = Static84.anInt1663;
								continue;
							}
							if (local207 == 5001) {
								local29 -= 3;
								Static84.anInt1663 = Static10.anIntArray23[local29];
								Static53.anInt1129 = Static10.anIntArray23[local29 + 1];
								Static207.anInt4220 = Static10.anIntArray23[local29 + 2];
								Static93.aClass3_Sub4_Sub1_18.method1298(112);
								Static93.aClass3_Sub4_Sub1_18.method1239(Static84.anInt1663);
								Static93.aClass3_Sub4_Sub1_18.method1239(Static53.anInt1129);
								Static93.aClass3_Sub4_Sub1_18.method1239(Static207.anInt4220);
								continue;
							}
							if (local207 == 5002) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								local29 -= 2;
								local754 = Static10.anIntArray23[local29];
								local2559 = Static10.anIntArray23[local29 + 1];
								Static93.aClass3_Sub4_Sub1_18.method1298(202);
								Static93.aClass3_Sub4_Sub1_18.method1250(local561.method2018());
								Static93.aClass3_Sub4_Sub1_18.method1239(local754 - 1);
								Static93.aClass3_Sub4_Sub1_18.method1239(local2559);
								continue;
							}
							if (local207 == 5003) {
								local1494 = null;
								local29--;
								local743 = Static10.anIntArray23[local29];
								if (local743 < 100) {
									local1494 = Static25.aClass70Array10[local743];
								}
								if (local1494 == null) {
									local1494 = Static114.aClass70_1120;
								}
								Static188.aClass70Array68[local31++] = local1494;
								continue;
							}
							if (local207 == 5004) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local754 = -1;
								if (local743 < 100 && Static25.aClass70Array10[local743] != null) {
									local754 = Static124.anIntArray330[local743];
								}
								Static10.anIntArray23[local29++] = local754;
								continue;
							}
							if (local207 == 5005) {
								Static10.anIntArray23[local29++] = Static53.anInt1129;
								continue;
							}
							if (local207 == 5008) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								if (local561.method2042(Static145.aClass70_1396)) {
									Static124.method2991(local561);
								} else {
									local1494 = local561.method2021();
									@Pc(4902) byte local4902 = 0;
									if (local1494.method2042(Static157.aClass70_1576)) {
										local4902 = 0;
										local561 = local561.method2019(Static157.aClass70_1576.method2045());
									} else if (local1494.method2042(Static132.aClass70_1225)) {
										local561 = local561.method2019(Static132.aClass70_1225.method2045());
										local4902 = 1;
									} else if (local1494.method2042(Static130.aClass70_1220)) {
										local561 = local561.method2019(Static130.aClass70_1220.method2045());
										local4902 = 2;
									} else if (local1494.method2042(Static186.aClass70_1844)) {
										local4902 = 3;
										local561 = local561.method2019(Static186.aClass70_1844.method2045());
									} else if (local1494.method2042(Static21.aClass70_198)) {
										local4902 = 4;
										local561 = local561.method2019(Static21.aClass70_198.method2045());
									} else if (local1494.method2042(Static185.aClass70_1813)) {
										local561 = local561.method2019(Static185.aClass70_1813.method2045());
										local4902 = 5;
									} else if (local1494.method2042(Static183.aClass70_1372)) {
										local4902 = 6;
										local561 = local561.method2019(Static183.aClass70_1372.method2045());
									} else if (local1494.method2042(Static38.aClass70_407)) {
										local4902 = 7;
										local561 = local561.method2019(Static38.aClass70_407.method2045());
									} else if (local1494.method2042(Static167.aClass70_1627)) {
										local561 = local561.method2019(Static167.aClass70_1627.method2045());
										local4902 = 8;
									} else if (local1494.method2042(Static152.aClass70_1489)) {
										local561 = local561.method2019(Static152.aClass70_1489.method2045());
										local4902 = 9;
									} else if (local1494.method2042(Static37.aClass70_1550)) {
										local561 = local561.method2019(Static37.aClass70_1550.method2045());
										local4902 = 10;
									} else if (local1494.method2042(Static120.aClass70_1149)) {
										local4902 = 11;
										local561 = local561.method2019(Static120.aClass70_1149.method2045());
									} else if (Static203.anInt4141 != 0) {
										if (local1494.method2042(Static157.aClass70_1575)) {
											local4902 = 0;
											local561 = local561.method2019(Static157.aClass70_1575.method2045());
										} else if (local1494.method2042(Static132.aClass70_1231)) {
											local561 = local561.method2019(Static132.aClass70_1231.method2045());
											local4902 = 1;
										} else if (local1494.method2042(Static130.aClass70_1221)) {
											local4902 = 2;
											local561 = local561.method2019(Static130.aClass70_1221.method2045());
										} else if (local1494.method2042(Static186.aClass70_1845)) {
											local4902 = 3;
											local561 = local561.method2019(Static186.aClass70_1845.method2045());
										} else if (local1494.method2042(Static21.aClass70_199)) {
											local4902 = 4;
											local561 = local561.method2019(Static21.aClass70_199.method2045());
										} else if (local1494.method2042(Static185.aClass70_1808)) {
											local561 = local561.method2019(Static185.aClass70_1808.method2045());
											local4902 = 5;
										} else if (local1494.method2042(Static183.aClass70_1370)) {
											local4902 = 6;
											local561 = local561.method2019(Static183.aClass70_1370.method2045());
										} else if (local1494.method2042(Static38.aClass70_408)) {
											local561 = local561.method2019(Static38.aClass70_408.method2045());
											local4902 = 7;
										} else if (local1494.method2042(Static167.aClass70_1625)) {
											local561 = local561.method2019(Static167.aClass70_1625.method2045());
											local4902 = 8;
										} else if (local1494.method2042(Static152.aClass70_1488)) {
											local561 = local561.method2019(Static152.aClass70_1488.method2045());
											local4902 = 9;
										} else if (local1494.method2042(Static37.aClass70_1549)) {
											local4902 = 10;
											local561 = local561.method2019(Static37.aClass70_1549.method2045());
										} else if (local1494.method2042(Static120.aClass70_1147)) {
											local4902 = 11;
											local561 = local561.method2019(Static120.aClass70_1147.method2045());
										}
									}
									@Pc(5268) byte local5268 = 0;
									local1494 = local561.method2021();
									if (local1494.method2042(Static88.aClass70_905)) {
										local561 = local561.method2019(Static88.aClass70_905.method2045());
										local5268 = 1;
									} else if (local1494.method2042(aClass70_175)) {
										local561 = local561.method2019(aClass70_175.method2045());
										local5268 = 2;
									} else if (local1494.method2042(Static114.aClass70_1117)) {
										local561 = local561.method2019(Static114.aClass70_1117.method2045());
										local5268 = 3;
									} else if (local1494.method2042(Static40.aClass70_426)) {
										local5268 = 4;
										local561 = local561.method2019(Static40.aClass70_426.method2045());
									} else if (local1494.method2042(Static16.aClass70_163)) {
										local561 = local561.method2019(Static16.aClass70_163.method2045());
										local5268 = 5;
									} else if (Static203.anInt4141 != 0) {
										if (local1494.method2042(Static88.aClass70_907)) {
											local5268 = 1;
											local561 = local561.method2019(Static88.aClass70_907.method2045());
										} else if (local1494.method2042(aClass70_176)) {
											local5268 = 2;
											local561 = local561.method2019(aClass70_176.method2045());
										} else if (local1494.method2042(Static114.aClass70_1116)) {
											local561 = local561.method2019(Static114.aClass70_1116.method2045());
											local5268 = 3;
										} else if (local1494.method2042(Static40.aClass70_425)) {
											local561 = local561.method2019(Static40.aClass70_425.method2045());
											local5268 = 4;
										} else if (local1494.method2042(Static16.aClass70_166)) {
											local561 = local561.method2019(Static16.aClass70_166.method2045());
											local5268 = 5;
										}
									}
									Static93.aClass3_Sub4_Sub1_18.method1298(246);
									Static93.aClass3_Sub4_Sub1_18.method1239(0);
									local621 = Static93.aClass3_Sub4_Sub1_18.anInt1758;
									Static93.aClass3_Sub4_Sub1_18.method1239(local4902);
									Static93.aClass3_Sub4_Sub1_18.method1239(local5268);
									Static16.method305(Static93.aClass3_Sub4_Sub1_18, local561);
									Static93.aClass3_Sub4_Sub1_18.method1265(Static93.aClass3_Sub4_Sub1_18.anInt1758 - local621);
								}
								continue;
							}
							if (local207 == 5009) {
								local31 -= 2;
								local561 = Static188.aClass70Array68[local31];
								local1494 = Static188.aClass70Array68[local31 + 1];
								Static93.aClass3_Sub4_Sub1_18.method1298(99);
								Static93.aClass3_Sub4_Sub1_18.method1239(0);
								local2559 = Static93.aClass3_Sub4_Sub1_18.anInt1758;
								Static93.aClass3_Sub4_Sub1_18.method1250(local561.method2018());
								Static16.method305(Static93.aClass3_Sub4_Sub1_18, local1494);
								Static93.aClass3_Sub4_Sub1_18.method1265(Static93.aClass3_Sub4_Sub1_18.anInt1758 - local2559);
								continue;
							}
							if (local207 == 5010) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local1494 = null;
								if (local743 < 100) {
									local1494 = Static106.aClass70Array40[local743];
								}
								if (local1494 == null) {
									local1494 = Static114.aClass70_1120;
								}
								Static188.aClass70Array68[local31++] = local1494;
								continue;
							}
							if (local207 == 5011) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local1494 = null;
								if (local743 < 100) {
									local1494 = Static22.aClass70Array8[local743];
								}
								if (local1494 == null) {
									local1494 = Static114.aClass70_1120;
								}
								Static188.aClass70Array68[local31++] = local1494;
								continue;
							}
							if (local207 == 5012) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local754 = -1;
								if (local743 < 100) {
									local754 = Static195.anIntArray343[local743];
								}
								Static10.anIntArray23[local29++] = local754;
								continue;
							}
							if (local207 == 5015) {
								if (Static144.aClass26_Sub2_Sub1_1 == null || Static144.aClass26_Sub2_Sub1_1.aClass70_952 == null) {
									local561 = Static198.aClass70_1992;
								} else {
									local561 = Static144.aClass26_Sub2_Sub1_1.aClass70_952;
								}
								Static188.aClass70Array68[local31++] = local561;
								continue;
							}
							if (local207 == 5016) {
								Static10.anIntArray23[local29++] = Static207.anInt4220;
								continue;
							}
							if (local207 == 5017) {
								Static10.anIntArray23[local29++] = Static26.anInt551;
								continue;
							}
							if (local207 == 5050) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static188.aClass70Array68[local31++] = Static111.method1604(local743).aClass70_1521;
								continue;
							}
							@Pc(5667) Class3_Sub3_Sub21 local5667;
							if (local207 == 5051) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local5667 = Static111.method1604(local743);
								if (local5667.anIntArray228 == null) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = local5667.anIntArray228.length;
								}
								continue;
							}
							if (local207 == 5052) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = Static111.method1604(local743).anIntArray228[local754];
								continue;
							}
							if (local207 == 5053) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								local5667 = Static111.method1604(local743);
								if (local5667.anIntArray230 == null) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = local5667.anIntArray230.length;
								}
								continue;
							}
							if (local207 == 5054) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = Static111.method1604(local743).anIntArray230[local754];
								continue;
							}
							if (local207 == 5055) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static188.aClass70Array68[local31++] = Static118.method1710(local743).method1197();
								continue;
							}
							if (local207 == 5056) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								@Pc(5801) Class3_Sub3_Sub15 local5801 = Static118.method1710(local743);
								if (local5801.anIntArray88 == null) {
									Static10.anIntArray23[local29++] = 0;
								} else {
									Static10.anIntArray23[local29++] = local5801.anIntArray88.length;
								}
								continue;
							}
							if (local207 == 5057) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = Static118.method1710(local743).anIntArray88[local754];
								continue;
							}
							if (local207 == 5058) {
								Static126.aClass8_1 = new Class8();
								local29--;
								Static126.aClass8_1.anInt287 = Static10.anIntArray23[local29];
								Static126.aClass8_1.aClass3_Sub3_Sub15_1 = Static118.method1710(Static126.aClass8_1.anInt287);
								Static126.aClass8_1.anIntArray22 = new int[Static126.aClass8_1.aClass3_Sub3_Sub15_1.method1193()];
								continue;
							}
							if (local207 == 5059) {
								Static93.aClass3_Sub4_Sub1_18.method1298(63);
								Static93.aClass3_Sub4_Sub1_18.method1239(0);
								local743 = Static93.aClass3_Sub4_Sub1_18.anInt1758;
								Static93.aClass3_Sub4_Sub1_18.method1239(0);
								Static93.aClass3_Sub4_Sub1_18.method1252(Static126.aClass8_1.anInt287);
								Static126.aClass8_1.aClass3_Sub3_Sub15_1.method1191(Static126.aClass8_1.anIntArray22, Static93.aClass3_Sub4_Sub1_18);
								Static93.aClass3_Sub4_Sub1_18.method1265(Static93.aClass3_Sub4_Sub1_18.anInt1758 - local743);
								continue;
							}
							if (local207 == 5060) {
								local31--;
								local561 = Static188.aClass70Array68[local31];
								Static93.aClass3_Sub4_Sub1_18.method1298(82);
								Static93.aClass3_Sub4_Sub1_18.method1239(0);
								local754 = Static93.aClass3_Sub4_Sub1_18.anInt1758;
								Static93.aClass3_Sub4_Sub1_18.method1250(local561.method2018());
								Static93.aClass3_Sub4_Sub1_18.method1252(Static126.aClass8_1.anInt287);
								Static126.aClass8_1.aClass3_Sub3_Sub15_1.method1191(Static126.aClass8_1.anIntArray22, Static93.aClass3_Sub4_Sub1_18);
								Static93.aClass3_Sub4_Sub1_18.method1265(Static93.aClass3_Sub4_Sub1_18.anInt1758 - local754);
								continue;
							}
							if (local207 == 5061) {
								Static93.aClass3_Sub4_Sub1_18.method1298(63);
								Static93.aClass3_Sub4_Sub1_18.method1239(0);
								local743 = Static93.aClass3_Sub4_Sub1_18.anInt1758;
								Static93.aClass3_Sub4_Sub1_18.method1239(1);
								Static93.aClass3_Sub4_Sub1_18.method1252(Static126.aClass8_1.anInt287);
								Static126.aClass8_1.aClass3_Sub3_Sub15_1.method1191(Static126.aClass8_1.anIntArray22, Static93.aClass3_Sub4_Sub1_18);
								Static93.aClass3_Sub4_Sub1_18.method1265(Static93.aClass3_Sub4_Sub1_18.anInt1758 - local743);
								continue;
							}
							if (local207 == 5062) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = Static111.method1604(local743).anIntArray231[local754];
								continue;
							}
							if (local207 == 5063) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static10.anIntArray23[local29++] = Static111.method1604(local743).anIntArray229[local754];
								continue;
							}
							if (local207 == 5064) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								if (local754 == -1) {
									Static10.anIntArray23[local29++] = -1;
								} else {
									Static10.anIntArray23[local29++] = Static111.method1604(local743).method2280(local754);
								}
								continue;
							}
							if (local207 == 5065) {
								local29 -= 2;
								local754 = Static10.anIntArray23[local29 + 1];
								local743 = Static10.anIntArray23[local29];
								if (local754 == -1) {
									Static10.anIntArray23[local29++] = -1;
								} else {
									Static10.anIntArray23[local29++] = Static111.method1604(local743).method2284(local754);
								}
								continue;
							}
							if (local207 == 5066) {
								local29--;
								local743 = Static10.anIntArray23[local29];
								Static10.anIntArray23[local29++] = Static118.method1710(local743).method1193();
								continue;
							}
							if (local207 == 5067) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								local2559 = Static118.method1710(local743).method1200(local754);
								System.out.println("chatphrase_getdynamiccommand=" + local2559);
								Static10.anIntArray23[local29++] = local2559;
								continue;
							}
							if (local207 == 5068) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static126.aClass8_1.anIntArray22[local743] = local754;
								continue;
							}
							if (local207 == 5069) {
								local29 -= 2;
								local743 = Static10.anIntArray23[local29];
								local754 = Static10.anIntArray23[local29 + 1];
								Static126.aClass8_1.anIntArray22[local743] = local754;
								continue;
							}
							if (local207 == 5070) {
								local29 -= 3;
								local743 = Static10.anIntArray23[local29];
								local2559 = Static10.anIntArray23[local29 + 2];
								local754 = Static10.anIntArray23[local29 + 1];
								@Pc(6261) Class3_Sub3_Sub15 local6261 = Static118.method1710(local743);
								if (local6261.method1200(local754) != 0) {
									throw new RuntimeException("bad command");
								}
								Static10.anIntArray23[local29++] = local6261.method1192(local754, local2559);
								continue;
							}
						} else if (local207 < 5200) {
							if (local207 == 5100) {
								if (Static81.aBooleanArray4[86]) {
									Static10.anIntArray23[local29++] = 1;
								} else {
									Static10.anIntArray23[local29++] = 0;
								}
								continue;
							}
							if (local207 == 5101) {
								if (Static81.aBooleanArray4[82]) {
									Static10.anIntArray23[local29++] = 1;
								} else {
									Static10.anIntArray23[local29++] = 0;
								}
								continue;
							}
							if (local207 == 5102) {
								if (Static81.aBooleanArray4[81]) {
									Static10.anIntArray23[local29++] = 1;
								} else {
									Static10.anIntArray23[local29++] = 0;
								}
								continue;
							}
						} else if (local207 < 5300) {
							if (local207 == 5200) {
								local29--;
								Static39.method669(Static10.anIntArray23[local29]);
								continue;
							}
							if (local207 == 5201) {
								Static10.anIntArray23[local29++] = Static211.method3318();
								continue;
							}
							if (local207 == 5202) {
								local29--;
								Static11.method255(Static10.anIntArray23[local29]);
								continue;
							}
							if (local207 == 5203) {
								local31--;
								Static174.method2695(Static188.aClass70Array68[local31]);
								continue;
							}
							if (local207 == 5204) {
								Static188.aClass70Array68[local31 - 1] = Static93.method1358(Static188.aClass70Array68[local31 - 1]);
								continue;
							}
							if (local207 == 5205) {
								local31--;
								Static25.method463(Static188.aClass70Array68[local31]);
								continue;
							}
						} else if (local207 >= 5400) {
							if (local207 < 5500) {
								if (local207 == 5400) {
									local31 -= 2;
									local1494 = Static188.aClass70Array68[local31 + 1];
									local561 = Static188.aClass70Array68[local31];
									local29--;
									local2559 = Static10.anIntArray23[local29];
									Static93.aClass3_Sub4_Sub1_18.method1298(95);
									Static93.aClass3_Sub4_Sub1_18.method1239(Static82.method1178(local561) + Static82.method1178(local1494) + 1);
									Static93.aClass3_Sub4_Sub1_18.method1274(local561);
									Static93.aClass3_Sub4_Sub1_18.method1274(local1494);
									Static93.aClass3_Sub4_Sub1_18.method1239(local2559);
									continue;
								}
								if (local207 == 5401) {
									local29 -= 2;
									Static124.aShortArray62[Static10.anIntArray23[local29]] = (short) Static56.method882(Static10.anIntArray23[local29 + 1]);
									continue;
								}
							}
						} else if (local207 == 5304) {
							Static10.anIntArray23[local29++] = 0;
							continue;
						}
					}
				} else {
					if (local207 < 2000) {
						local1040 = local941 ? Static156.aClass6_84 : Static115.aClass6_65;
					} else {
						local29--;
						local1040 = Static146.method2127(Static10.anIntArray23[local29]);
						local207 -= 1000;
					}
					if (local207 == 1000) {
						local29 -= 2;
						local1040.aByte4 = 0;
						local1040.anInt236 = local1040.anInt223 = Static10.anIntArray23[local29];
						local1040.aByte5 = 0;
						local1040.anInt219 = local1040.anInt202 = Static10.anIntArray23[local29 + 1];
						Static9.method237(local1040);
						continue;
					}
					if (local207 == 1001) {
						local29 -= 2;
						local1040.aByte3 = 0;
						local1040.anInt244 = local1040.anInt247 = Static10.anIntArray23[local29];
						local1040.anInt268 = 0;
						local1040.aByte2 = 0;
						local1040.anInt217 = local1040.anInt234 = Static10.anIntArray23[local29 + 1];
						local1040.anInt262 = 0;
						Static9.method237(local1040);
						if (local1040.anInt250 == 0) {
							Static83.method1194(local1040);
						}
						continue;
					}
					if (local207 == 1003) {
						local29--;
						@Pc(1145) boolean local1145 = Static10.anIntArray23[local29] == 1;
						if (local1040.aBoolean19 != local1145) {
							local1040.aBoolean19 = local1145;
							Static9.method237(local1040);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(8569) Exception local8569) {
			if (local24.aClass70_1887 == null) {
				if (Static8.anInt189 != 0) {
					Static135.method1934(Static64.aClass70_633, 0, Static114.aClass70_1120);
				}
				Static208.method1860("CS2 - scr:" + local24.aLong147 + " op:" + local37, local8569);
			} else {
				@Pc(8576) Class70 local8576 = Static180.method2794(30);
				local8576.method2031(Static172.aClass70_1646).method2031(local24.aClass70_1887);
				for (local57 = Static99.anInt2029 - 1; local57 >= 0; local57--) {
					local8576.method2031(Static76.aClass70_733).method2031(Static202.aClass93Array1[local57].aClass3_Sub3_Sub22_1.aClass70_1887);
				}
				if (local37 == 40) {
					local93 = local43[local35];
					local8576.method2031(Static190.aClass70_1889).method2031(Static107.method2404(local93));
				}
				if (Static8.anInt189 != 0) {
					Static135.method1934(Static207.method3296(new Class70[] { Static141.aClass70_1326, local24.aClass70_1887 }), 0, Static114.aClass70_1120);
				}
				Static208.method1860("CS2 - scr:" + local24.aLong147 + " op:" + local37 + new String(local8576.method2022()), local8569);
			}
		}
	}
}
