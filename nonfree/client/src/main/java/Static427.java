import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!of", name = "j", descriptor = "I")
	public static int anInt6960;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_71 = new Class240(37, 7);

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_45 = new Class295(8);

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_72 = new Class240(51, 8);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!js;IILclient!su;Lclient!ha;I)Z")
	public static boolean method5891(@OriginalArg(0) Class188 arg0, @OriginalArg(3) Class3_Sub46 arg1, @OriginalArg(4) Class95 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray282 != null) {
			local13 = Static671.anInt9354 - (arg1.anInt9118 + arg0.anInt4950 - Static671.anInt9361) * (Static671.anInt9354 - Static671.anInt9362) / (Static671.anInt9353 - Static671.anInt9361);
			local11 = Static671.anInt9354 - (arg0.anInt4975 + arg1.anInt9118 - Static671.anInt9361) * (Static671.anInt9354 + -Static671.anInt9362) / (Static671.anInt9353 - Static671.anInt9361);
			local7 = (arg1.anInt9116 + arg0.anInt4977 - Static671.anInt9351) * (Static671.anInt9352 - Static671.anInt9355) / (Static671.anInt9359 - Static671.anInt9351) + Static671.anInt9355;
			local9 = Static671.anInt9355 + (Static671.anInt9352 - Static671.anInt9355) * (arg1.anInt9116 + arg0.anInt4972 + -Static671.anInt9351) / (Static671.anInt9359 - Static671.anInt9351);
		}
		@Pc(107) Class6 local107 = null;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		if (arg0.anInt4962 != -1) {
			if (arg1.aBoolean638 && arg0.anInt4947 != -1) {
				local107 = arg0.method4291(true, arg2);
			} else {
				local107 = arg0.method4291(false, arg2);
			}
			if (local107 != null) {
				local109 = arg1.anInt9115 - (local107.method5130() + 1 >> 1);
				local111 = arg1.anInt9115 + (local107.method5130() + 1 >> 1);
				if (local109 < local7) {
					local7 = local109;
				}
				if (local111 > local9) {
					local9 = local111;
				}
				local113 = arg1.anInt9113 - (local107.method5134() + 1 >> 1);
				local115 = arg1.anInt9113 + (local107.method5134() + 1 >> 1);
				if (local11 > local113) {
					local11 = local113;
				}
				if (local13 < local115) {
					local13 = local115;
				}
			}
		}
		@Pc(207) Class97 local207 = null;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(304) int local304;
		if (arg0.aString62 != null) {
			local207 = Static494.method6481(arg0.anInt4967);
			if (local207 != null) {
				local209 = Static285.aClass91_8.method1851((Class6[]) null, (int[]) null, Static307.aStringArray39, arg0.aString62);
				local213 = arg1.anInt9113 - arg0.anInt4976 * (Static671.anInt9354 - Static671.anInt9362) / (Static671.anInt9353 - Static671.anInt9361);
				local211 = arg1.anInt9115 + (Static671.anInt9352 - Static671.anInt9355) * arg0.anInt4954 / (Static671.anInt9359 - Static671.anInt9351);
				if (local107 == null) {
					local213 -= local209 * local207.method2239() / 2;
				} else {
					local213 -= (local107.method5134() >> 1) + (local207.method2241() * local209);
				}
				for (local304 = 0; local304 < local209; local304++) {
					@Pc(310) String local310 = Static307.aStringArray39[local304];
					if (local209 - 1 > local304) {
						local310 = local310.substring(0, local310.length() - 4);
					}
					@Pc(331) int local331 = local207.method2240(local310);
					if (local331 > local215) {
						local215 = local331;
					}
				}
				local217 = local211 - local215 / 2;
				local219 = local215 / 2 + local211;
				if (local217 < local7) {
					local7 = local217;
				}
				if (local9 < local219) {
					local9 = local219;
				}
				local221 = local213;
				local223 = local209 * local207.method2241() + local213;
				if (local11 > local221) {
					local11 = local221;
				}
				if (local13 < local223) {
					local13 = local223;
				}
			}
		}
		if (local9 < Static671.anInt9355 || Static671.anInt9352 < local7 || Static671.anInt9362 > local13 || local11 > Static671.anInt9354) {
			return true;
		}
		Static671.method7633(arg2, arg1, arg0);
		if (local107 != null) {
			if (Static270.anInt4659 > 0 && (Static329.anInt5459 != -1 && arg1.anInt9112 == Static329.anInt5459 || Static28.anInt691 != -1 && arg0.anInt4980 == Static28.anInt691)) {
				if (Static258.anInt4526 <= 50) {
					local304 = Static258.anInt4526 * 2;
				} else {
					local304 = (100 - Static258.anInt4526) * 2;
				}
				@Pc(476) int local476 = local304 << 24 | 0xFFFF00;
				arg2.method8050(local476, local107.method5119() / 2 + 7, arg1.anInt9113, arg1.anInt9115);
				arg2.method8050(local476, local107.method5119() / 2 + 5, arg1.anInt9113, arg1.anInt9115);
				arg2.method8050(local476, local107.method5119() / 2 + 3, arg1.anInt9113, arg1.anInt9115);
				arg2.method8050(local476, local107.method5119() / 2 + 1, arg1.anInt9113, arg1.anInt9115);
				arg2.method8050(local476, local107.method5119() / 2, arg1.anInt9113, arg1.anInt9115);
			}
			local107.method5115(arg1.anInt9115 - (local107.method5130() >> 1), arg1.anInt9113 + -(local107.method5134() >> 1));
		}
		if (arg0.aString62 != null && local207 != null) {
			Static337.method8464(arg2, arg0, local209, local207, local213, local211, local215, arg1);
		}
		if (arg0.anInt4962 != -1 || arg0.aString62 != null) {
			@Pc(594) Class3_Sub3 local594 = new Class3_Sub3(arg1);
			local594.anInt102 = local221;
			local594.anInt98 = local217;
			local594.anInt103 = local111;
			local594.anInt104 = local113;
			local594.anInt97 = local223;
			local594.anInt95 = local115;
			local594.anInt99 = local109;
			local594.anInt107 = local219;
			Static310.aClass302_27.method6613(local594);
		}
		return false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	public static void method5893() {
		for (@Pc(1) int local1 = 0; local1 < Static619.anInt10271; local1++) {
			if (!Static44.aBooleanArray3[local1]) {
				@Pc(10) Class165 local10 = Static192.aClass165Array1[local1];
				@Pc(13) Class3_Sub13 local13 = local10.aClass3_Sub13_1;
				@Pc(16) int local16 = local10.anInt4514;
				@Pc(22) int local22 = local13.method5962() - Static579.anInt9391;
				@Pc(30) int local30 = (local22 * 2 >> Static571.anInt9216) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5958() - local22 >> Static571.anInt9216;
				@Pc(53) int local53 = local13.method5960() - local22 >> Static571.anInt9216;
				@Pc(61) int local61 = local13.method5960() + local22 >> Static571.anInt9216;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static155.anInt2874) {
					local61 = Static155.anInt2874 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray58[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static133.anInt2551) {
						local108 = Static133.anInt2551 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class34_Sub1_Sub1 local141 = Static180.method2823(local16, local125, local78, nga.class);
						if (local141 != null && local141.aByte133 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte133 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray58[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray58[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray58[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray58[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static44.aBooleanArray3[local1] = true;
				Static582.aClass35Array3[local16].method7457(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!af;)V")
	public static void method5895(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		arg0.method334();
		@Pc(10) int local10 = Static291.anInt4955;
		@Pc(20) Class34_Sub1_Sub1_Sub2_Sub1 local20 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local10] = new Class34_Sub1_Sub1_Sub2_Sub1();
		local20.anInt9671 = local10;
		@Pc(28) int local28 = arg0.method333(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray529[0] = local39 - Static534.anInt8358;
		local20.anInt9614 = (local20.anIntArray529[0] << 9) + (local20.method7866() << 8);
		local20.anIntArray528[0] = local43 - Static402.anInt6661;
		local20.anInt9619 = (local20.anIntArray528[0] << 9) + (local20.method7866() << 8);
		Static570.anInt9192 = local20.aByte132 = local20.aByte131 = local33;
		if (Static209.method3118(local20.anIntArray529[0], local20.anIntArray528[0])) {
			local20.aByte131++;
		}
		if (Static273.aClass3_Sub4Array1[local10] != null) {
			local20.method1481(Static273.aClass3_Sub4Array1[local10]);
		}
		Static439.anInt7133 = 0;
		Static294.anIntArray593[Static439.anInt7133++] = local10;
		Static205.aByteArray32[local10] = 0;
		Class3_Sub5_Sub21.anInt10916 = 0;
		for (@Pc(147) int local147 = 1; local147 < 2048; local147++) {
			if (local10 != local147) {
				@Pc(161) int local161 = arg0.method333(18);
				@Pc(165) int local165 = local161 >> 16;
				@Pc(171) int local171 = local161 >> 8 & 0xFF;
				@Pc(175) int local175 = local161 & 0xFF;
				@Pc(183) Class180 local183 = Static334.aClass180Array3[local147] = new Class180();
				local183.anInt4733 = -1;
				local183.aBoolean311 = false;
				local183.anInt4735 = 0;
				local183.aBoolean312 = false;
				local183.anInt4734 = (local171 << 14) + (local165 << 28) + local175;
				Static290.anIntArray279[Class3_Sub5_Sub21.anInt10916++] = local147;
				Static205.aByteArray32[local147] = 0;
			}
		}
		arg0.method329();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public static void method5897() {
		if (Static235.anIntArray250 != null && Static217.anIntArray548 != null) {
			return;
		}
		Static235.anIntArray250 = new int[256];
		Static217.anIntArray548 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static235.anIntArray250[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static217.anIntArray548[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
