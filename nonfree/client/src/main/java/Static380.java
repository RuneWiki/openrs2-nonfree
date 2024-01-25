import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public static int anInt6600;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZZLclient!ec;Lclient!ec;IIZ)I")
	public static int method5242(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class65_Sub1 arg1, @OriginalArg(3) Class65_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static317.method4507(arg1, arg2, arg5, arg4);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = Static317.method4507(arg1, arg2, arg0, arg3);
			return arg0 ? -local34 : local34;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	public static void method5243() {
		for (@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) Static361.aClass181_36.method3972(); local10 != null; local10 = (Class2_Sub1_Sub15) Static361.aClass181_36.method3975()) {
			@Pc(17) Class11_Sub5_Sub4 local17 = local10.aClass11_Sub5_Sub4_1;
			if (Static277.anInt5022 > local17.anInt5569) {
				local10.method6260();
				local17.method4436();
			} else if (local17.anInt5554 <= Static277.anInt5022) {
				if (local17.anInt5582 > 0) {
					@Pc(46) Class2_Sub34 local46 = (Class2_Sub34) Static400.aClass220_41.method5099((long) (local17.anInt5582 - 1));
					if (local46 != null) {
						@Pc(51) Class11_Sub5_Sub2_Sub2 local51 = local46.aClass11_Sub5_Sub2_Sub2_2;
						if (local51.anInt7626 >= 0 && Static234.anInt3949 * 128 > local51.anInt7626 && local51.anInt7622 >= 0 && local51.anInt7622 < Static371.anInt6492 * 128) {
							local17.method4434(Static277.anInt5022, Static365.method3535(local17.aByte101, local51.anInt7626, local51.anInt7622) - local17.anInt5558, local51.anInt7626, local51.anInt7622);
						}
					}
				}
				if (local17.anInt5582 < 0) {
					@Pc(110) int local110 = -local17.anInt5582 - 1;
					@Pc(121) Class11_Sub5_Sub2_Sub1 local121;
					if (Static94.anInt5592 == local110) {
						local121 = Static127.aClass11_Sub5_Sub2_Sub1_2;
					} else {
						local121 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local110];
					}
					if (local121 != null && local121.anInt7626 >= 0 && Static234.anInt3949 * 128 > local121.anInt7626 && local121.anInt7622 >= 0 && local121.anInt7622 < Static371.anInt6492 * 128) {
						local17.method4434(Static277.anInt5022, Static365.method3535(local17.aByte101, local121.anInt7626, local121.anInt7622) - local17.anInt5558, local121.anInt7626, local121.anInt7622);
					}
				}
				local17.method4438(Static417.anInt7158);
				Static252.method3490(local17, true);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method5244(@OriginalArg(0) Class75 arg0) {
		@Pc(11) int local11 = Static281.anInt4448;
		@Pc(13) int local13 = Static168.anInt6340;
		@Pc(15) int local15 = Static204.anInt3495;
		@Pc(19) int local19 = Static407.anInt7040 - 3;
		if (Static99.aClass41_4 == null || Static340.aClass41_16 == null) {
			if (Static446.aClass171_101.method3666(Static59.anInt6509) && Static446.aClass171_101.method3666(Static369.anInt6487)) {
				Static99.aClass41_4 = arg0.method5986(Static470.method4242(Static446.aClass171_101, Static59.anInt6509, 0));
				@Pc(48) Class190 local48 = Static470.method4242(Static446.aClass171_101, Static369.anInt6487, 0);
				Static340.aClass41_16 = arg0.method5986(local48);
				local48.method4241();
				Static191.aClass41_7 = arg0.method5986(local48);
			} else {
				arg0.P(local11, local13, local15, 20, Static175.anInt3111 | 255 - Static47.anInt760 << 24, 1);
			}
		}
		@Pc(94) int local94;
		@Pc(92) int local92;
		if (Static99.aClass41_4 != null && Static340.aClass41_16 != null) {
			local92 = (local15 - Static340.aClass41_16.YA() * 2) / Static99.aClass41_4.YA();
			for (local94 = 0; local94 < local92; local94++) {
				Static99.aClass41_4.method6090(local11 + Static340.aClass41_16.YA() + Static99.aClass41_4.YA() * local94, local13);
			}
			Static340.aClass41_16.method6090(local11, local13);
			Static191.aClass41_7.method6090(local15 + local11 - Static191.aClass41_7.YA(), local13);
		}
		Static143.aClass14_2.method4886(Static153.anInt2799 | 0xFF000000, -1, Static14.aClass231_7.method5261(Static80.anInt6195), local11 + 3, local13 - -14);
		arg0.P(local11, local13 + 20, local15, local19 - 20, Static175.anInt3111 | -Static47.anInt760 + 255 << 24, 1);
		local92 = Static196.aClass126_1.method5366();
		local94 = Static196.aClass126_1.method5364();
		@Pc(175) int local175 = 0;
		@Pc(197) int local197;
		for (@Pc(180) Class2_Sub35 local180 = (Class2_Sub35) Static93.aClass181_7.method3972(); local180 != null; local180 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			local197 = local13 + (-local175 + Static377.anInt6585 + -1) * 16 + 13 + 20;
			if (local11 < local92 && local92 < local11 + local15 && local197 - 13 < local94 && local197 + 4 > local94 && local180.aBoolean413) {
				arg0.P(local11, local197 - 12, local15, 16, Static23.anInt7093 | 255 - Static393.anInt6776 << 24, 1);
			}
			local175++;
		}
		if ((Static211.aClass41_9 == null || Static134.aClass41_6 == null || Static436.aClass41_18 == null) && Static446.aClass171_101.method3666(Static89.anInt1086) && Static446.aClass171_101.method3666(Static201.anInt3440) && Static446.aClass171_101.method3666(Static285.anInt5128)) {
			@Pc(278) Class190 local278 = Static470.method4242(Static446.aClass171_101, Static201.anInt3440, 0);
			Static134.aClass41_6 = arg0.method5986(local278);
			local278.method4241();
			Static300.aClass41_15 = arg0.method5986(local278);
			Static211.aClass41_9 = arg0.method5986(Static470.method4242(Static446.aClass171_101, Static89.anInt1086, 0));
			@Pc(303) Class190 local303 = Static470.method4242(Static446.aClass171_101, Static285.anInt5128, 0);
			Static436.aClass41_18 = arg0.method5986(local303);
			local303.method4241();
			Static86.aClass41_3 = arg0.method5986(local303);
		}
		local175 = 0;
		@Pc(373) int local373;
		@Pc(336) int local336;
		if (Static211.aClass41_9 != null && Static134.aClass41_6 != null && Static436.aClass41_18 != null) {
			local197 = (local15 - Static436.aClass41_18.YA() * 2) / Static211.aClass41_9.YA();
			for (local336 = 0; local336 < local197; local336++) {
				Static211.aClass41_9.method6090(local11 + Static436.aClass41_18.YA() + Static211.aClass41_9.YA() * local336, -Static211.aClass41_9.ZA() + local19 + local13);
			}
			local373 = (local19 - Static436.aClass41_18.ZA() - 20) / Static134.aClass41_6.ZA();
			for (@Pc(375) int local375 = 0; local375 < local373; local375++) {
				Static134.aClass41_6.method6090(local11, Static134.aClass41_6.ZA() * local375 + local13 + 20);
				Static300.aClass41_15.method6090(local11 + local15 - Static300.aClass41_15.YA(), local375 * Static134.aClass41_6.ZA() + 20 + local13);
			}
			Static436.aClass41_18.method6090(local11, local19 + local13 - Static436.aClass41_18.ZA());
			Static86.aClass41_3.method6090(local11 + local15 - Static436.aClass41_18.YA(), local19 + (local13 - Static436.aClass41_18.ZA()));
		}
		for (@Pc(444) Class2_Sub35 local444 = (Class2_Sub35) Static93.aClass181_7.method3972(); local444 != null; local444 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
			local336 = local13 + (-local175 + Static377.anInt6585 + -1) * 16 + 13 + 20;
			local373 = Static153.anInt2799 | 0xFF000000;
			if (local11 < local92 && local15 + local11 > local92 && local94 > local336 - 13 && local94 < local336 + 4 && local444.aBoolean413) {
				local373 = Static239.anInt4035 | 0xFF000000;
			}
			@Pc(500) int[] local500 = null;
			if (Static315.method4489(local444.anInt5875)) {
				local500 = Static413.aClass271_2.method6193((int) local444.aLong299).anIntArray521;
			} else if (local444.anInt5878 != -1) {
				local500 = Static413.aClass271_2.method6193(local444.anInt5878).anIntArray521;
			} else if (Static188.method5359(local444.anInt5875)) {
				@Pc(523) Class2_Sub34 local523 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local444.aLong299);
				if (local523 != null) {
					@Pc(528) Class11_Sub5_Sub2_Sub2 local528 = local523.aClass11_Sub5_Sub2_Sub2_2;
					@Pc(531) Class82 local531 = local528.aClass82_1;
					if (local531.anIntArray149 != null) {
						local531 = local531.method1888(Static63.aClass120_2);
					}
					if (local531 != null) {
						local500 = local531.anIntArray151;
					}
				}
			} else if (Static459.method6243(local444.anInt5875)) {
				@Pc(563) Class192 local563;
				if (local444.anInt5875 == 1007) {
					local563 = Static249.aClass39_2.method748((int) local444.aLong299);
				} else {
					local563 = Static249.aClass39_2.method748((int) (local444.aLong299 >>> 32 & 0x7FFFFFFFL));
				}
				if (local563.anIntArray462 != null) {
					local563 = local563.method4323(Static63.aClass120_2);
				}
				if (local563 != null) {
					local500 = local563.anIntArray460;
				}
			}
			@Pc(609) String local609 = Static48.method741(local444);
			if (local500 != null) {
				local609 = local609 + Static148.method2251(local500);
			}
			Static143.aClass14_2.method4894(local336, Static112.anIntArray145, local11 + 3, local373, local609, Static243.aClass41Array8);
			local175++;
			if (local444.aBoolean414) {
				Static446.aClass41_19.method6090(Static9.aClass15_9.method320(local609) + local11 + 5, local336 - 12);
			}
		}
		Static449.method6080(Static204.anInt3495, Static168.anInt6340, Static407.anInt7040, Static281.anInt4448);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "()V")
	public static void method5245() {
		for (@Pc(1) int local1 = 0; local1 < Static439.anInt7384; local1++) {
			if (!Static457.aBooleanArray26[local1]) {
				@Pc(10) Class38 local10 = Static330.aClass38Array1[local1];
				@Pc(13) Class2_Sub4 local13 = local10.aClass2_Sub4_1;
				@Pc(16) int local16 = local10.anInt779;
				@Pc(22) int local22 = local13.method4089() - Static417.anInt7156;
				@Pc(30) int local30 = (local22 * 2 >> Static146.anInt2674) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method4087() - local22 >> Static146.anInt2674;
				@Pc(53) int local53 = local13.method4092() - local22 >> Static146.anInt2674;
				@Pc(61) int local61 = local13.method4092() + local22 >> Static146.anInt2674;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static104.anInt1675) {
					local61 = Static104.anInt1675 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray4[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static212.anInt3636) {
						local108 = Static212.anInt3636 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class11_Sub5 local141 = Static345.method4857(local16, local125, local78, tm.class);
						if (local141 != null && local141.aByte100 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte100 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray4[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray4[local32 - 1];
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
									local182 = local10.aShortArray4[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray4[local32 + 1];
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
				Static457.aBooleanArray26[local1] = true;
				Static241.aClass22Array3[local16].method2321(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5246(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Z")
	public static boolean method5247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V")
	public static void method5248(@OriginalArg(0) int arg0) {
		Static288.anInt5154 = arg0;
		Static170.aClass188_31.method4156();
	}
}
