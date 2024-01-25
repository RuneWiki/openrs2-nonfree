import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public static int anInt1790;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "Lclient!fc;")
	public static Class69 aClass69_3;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "Lclient!cl;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
	public static final int[] anIntArray126 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[Lclient!jm;")
	public static final Class111[] aClass111Array2 = new Class111[14];

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
	public static final int[] anIntArray127 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
	public static void method1493() {
		if (Static204.aBoolean280 && Static278.aClass143_20.method4857(81) && Static13.anInt245 > 2) {
			Static136.method5514((Class11_Sub14) Static119.aClass16_21.aClass11_9.aClass11_252.aClass11_252);
		} else {
			Static136.method5514((Class11_Sub14) Static119.aClass16_21.aClass11_9.aClass11_252);
		}
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
	public static void method1494() {
		for (@Pc(15) Class11_Sub24 local15 = (Class11_Sub24) Static21.aClass16_15.method193(); local15 != null; local15 = (Class11_Sub24) Static21.aClass16_15.method188()) {
			if (local15.anInt2696 == -1) {
				local15.anInt2698 = 0;
				Static175.method2827(local15);
			} else {
				local15.method5701();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
	public static void method1495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = local25 * ((arg1 << 1) - 3);
		@Pc(86) int local86 = local56;
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (arg0 >= Static240.anInt4829 && arg0 <= Static166.anInt3315) {
			local100 = Static61.method917(Static280.anInt212, arg2 + arg4, Static346.anInt6607);
			local109 = Static61.method917(Static280.anInt212, arg4 - arg2, Static346.anInt6607);
			Static224.method5303(Static73.anIntArrayArray6[arg0], local100, arg3, local109);
		}
		@Pc(123) int local123 = local52 * (arg1 - 1);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local86;
					local39 += local64;
					local64 += local56;
					local7++;
					local86 += local56;
				}
			}
			if (local48 < 0) {
				local48 += local86;
				local39 += local64;
				local64 += local56;
				local86 += local56;
				local7++;
			}
			local48 += -local72;
			local39 += -local123;
			local72 -= local52;
			local123 -= local52;
			local9--;
			local100 = arg0 - local9;
			local109 = arg0 + local9;
			if (Static240.anInt4829 <= local109 && local100 <= Static166.anInt3315) {
				@Pc(221) int local221 = Static61.method917(Static280.anInt212, arg4 + local7, Static346.anInt6607);
				@Pc(230) int local230 = Static61.method917(Static280.anInt212, arg4 - local7, Static346.anInt6607);
				if (Static240.anInt4829 <= local100) {
					Static224.method5303(Static73.anIntArrayArray6[local100], local221, arg3, local230);
				}
				if (local109 <= Static166.anInt3315) {
					Static224.method5303(Static73.anIntArrayArray6[local109], local221, arg3, local230);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public static void method1496() {
		Static186.anIntArray286 = null;
		Static55.aClipboard1 = null;
		Static34.aBooleanArray5 = null;
		Static316.anIntArray508 = null;
		Static325.anIntArray88 = null;
		Static238.aBoolean319 = false;
		Static239.method4236();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIII)V")
	public static void method1497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) Class11_Sub4_Sub12 local11 = Static35.method512(10, arg1);
		local11.method3858();
		local11.anInt4388 = arg3;
		local11.anInt4390 = arg0;
		local11.anInt4398 = arg2;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
	public static void method1499() {
		if (Static55.aString9.length() == 0) {
			return;
		}
		Static129.method1991("--> " + Static55.aString9);
		Static346.method5618(false, Static55.aString9);
		Static55.aString9 = "";
		Static328.anInt6296 = 0;
		Static174.anInt3440 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
	public static void method1500() {
		Static274.anInt5509 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static339.anInt6547; local3++) {
			@Pc(8) Class177 local8 = Static135.aClass177Array2[local3];
			@Pc(12) int local12;
			if (Static294.anIntArray453 != null) {
				for (local12 = 0; local12 < Static294.anIntArray453.length; local12++) {
					if (Static294.anIntArray453[local12] != -1000000 && (local8.anInt5485 <= Static294.anIntArray453[local12] || local8.anInt5494 <= Static294.anIntArray453[local12]) && (local8.anInt5493 <= Static40.anIntArray58[local12] || local8.anInt5488 <= Static40.anIntArray58[local12]) && (local8.anInt5493 >= Static306.anIntArray496[local12] || local8.anInt5488 >= Static306.anIntArray496[local12]) && (local8.anInt5495 <= Static237.anIntArray376[local12] || local8.anInt5496 <= Static237.anIntArray376[local12]) && (local8.anInt5495 >= Static284.anIntArray438[local12] || local8.anInt5496 >= Static284.anIntArray438[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt5484 == 1) {
				local12 = local8.anInt5478 + Static209.anInt4263 - Static6.anInt4021;
				if (local12 >= 0 && local12 <= Static209.anInt4263 + Static209.anInt4263) {
					local110 = local8.anInt5479 + Static209.anInt4263 - Static104.anInt1932;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5487 + Static209.anInt4263 - Static104.anInt1932;
					if (local121 > Static209.anInt4263 + Static209.anInt4263) {
						local121 = Static209.anInt4263 + Static209.anInt4263;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static8.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static10.anInt229 - local8.anInt5493;
						if (local153 > 32) {
							local8.anInt5482 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5482 = 2;
							local153 = -local153;
						}
						local8.anInt5476 = (local8.anInt5495 - Static178.anInt3541 << 8) / local153;
						local8.anInt5481 = (local8.anInt5496 - Static178.anInt3541 << 8) / local153;
						local8.anInt5489 = (local8.anInt5485 - Static337.anInt6447 << 8) / local153;
						local8.anInt5497 = (local8.anInt5494 - Static337.anInt6447 << 8) / local153;
						Static23.aClass177Array1[Static274.anInt5509++] = local8;
					}
				}
			} else if (local8.anInt5484 == 2) {
				local12 = local8.anInt5479 + Static209.anInt4263 - Static104.anInt1932;
				if (local12 >= 0 && local12 <= Static209.anInt4263 + Static209.anInt4263) {
					local110 = local8.anInt5478 + Static209.anInt4263 - Static6.anInt4021;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5486 + Static209.anInt4263 - Static6.anInt4021;
					if (local121 > Static209.anInt4263 + Static209.anInt4263) {
						local121 = Static209.anInt4263 + Static209.anInt4263;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static8.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static178.anInt3541 - local8.anInt5495;
						if (local153 > 32) {
							local8.anInt5482 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt5482 = 4;
							local153 = -local153;
						}
						local8.anInt5492 = (local8.anInt5493 - Static10.anInt229 << 8) / local153;
						local8.anInt5483 = (local8.anInt5488 - Static10.anInt229 << 8) / local153;
						local8.anInt5489 = (local8.anInt5485 - Static337.anInt6447 << 8) / local153;
						local8.anInt5497 = (local8.anInt5494 - Static337.anInt6447 << 8) / local153;
						Static23.aClass177Array1[Static274.anInt5509++] = local8;
					}
				}
			} else if (local8.anInt5484 == 4) {
				local12 = local8.anInt5485 - Static337.anInt6447;
				if (local12 > 128) {
					local110 = local8.anInt5479 + Static209.anInt4263 - Static104.anInt1932;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt5487 + Static209.anInt4263 - Static104.anInt1932;
					if (local121 > Static209.anInt4263 + Static209.anInt4263) {
						local121 = Static209.anInt4263 + Static209.anInt4263;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt5478 + Static209.anInt4263 - Static6.anInt4021;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt5486 + Static209.anInt4263 - Static6.anInt4021;
						if (local153 > Static209.anInt4263 + Static209.anInt4263) {
							local153 = Static209.anInt4263 + Static209.anInt4263;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static8.aBooleanArrayArray1[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt5482 = 5;
							local8.anInt5492 = (local8.anInt5493 - Static10.anInt229 << 8) / local12;
							local8.anInt5483 = (local8.anInt5488 - Static10.anInt229 << 8) / local12;
							local8.anInt5476 = (local8.anInt5495 - Static178.anInt3541 << 8) / local12;
							local8.anInt5481 = (local8.anInt5496 - Static178.anInt3541 << 8) / local12;
							Static23.aClass177Array1[Static274.anInt5509++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZZI)I")
	public static int method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class11_Sub6 local18 = Static158.method2534(arg0, false);
		if (local18 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local18.anIntArray48.length; local26++) {
			if (local18.anIntArray48[local26] >= 0 && local18.anIntArray48[local26] < Static207.anInt4248) {
				@Pc(50) Class170 local50 = Static283.method4717(local18.anIntArray48[local26]);
				@Pc(59) int local59 = local50.method4537(arg1, Static286.method4771(arg1).anInt1448);
				if (arg2) {
					local24 += local18.anIntArray46[local26] * local59;
				} else {
					local24 += local59;
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)Z")
	public static boolean method1502() {
		return Static278.anInt6305 != 0 || Static248.anInt4969 >= 2;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg8 && arg0 == arg5 && arg2 == arg7 && arg3 == arg4) {
			Static309.method5231(arg4, arg1, arg0, arg6, arg2);
			return;
		}
		@Pc(44) int local44 = arg6;
		@Pc(46) int local46 = arg0;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg5 * 3;
		@Pc(66) int local66 = arg7 * 3;
		@Pc(70) int local70 = arg3 * 3;
		@Pc(80) int local80 = arg2 + local58 - local66 - arg6;
		@Pc(90) int local90 = local62 + arg4 - local70 - arg0;
		@Pc(101) int local101 = local66 + local50 - local58 - local58;
		@Pc(111) int local111 = local70 + local54 - local62 - local62;
		@Pc(116) int local116 = local58 - local50;
		@Pc(121) int local121 = local62 - local54;
		for (@Pc(123) int local123 = 128; local123 <= 4096; local123 += 128) {
			@Pc(131) int local131 = local123 * local123 >> 12;
			@Pc(137) int local137 = local131 * local123 >> 12;
			@Pc(141) int local141 = local137 * local80;
			@Pc(145) int local145 = local90 * local137;
			@Pc(149) int local149 = local131 * local101;
			@Pc(153) int local153 = local131 * local111;
			@Pc(157) int local157 = local116 * local123;
			@Pc(161) int local161 = local121 * local123;
			@Pc(173) int local173 = arg6 + (local149 + local141 + local157 >> 12);
			@Pc(185) int local185 = arg0 + (local153 + local145 + local161 >> 12);
			Static309.method5231(local185, arg1, local46, local44, local173);
			local46 = local185;
			local44 = local173;
		}
	}
}
