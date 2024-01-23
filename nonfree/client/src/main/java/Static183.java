import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!dc;")
	public static Class1_Sub2_Sub7 aClass1_Sub2_Sub7_8;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array8;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
	public static int anInt4432;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString265 = "Drop";

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Ljava/util/Random;")
	public static Random aRandom3 = new Random();

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!qc;")
	public static Class135 aClass135_25 = new Class135(32);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "J")
	public static long aLong160 = 0L;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public static int anInt4433 = -1;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZILclient!fj;)V")
	public static void method3508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub2_Sub1 arg2) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if ((arg1 & 0x100) != 0) {
			local13 = Static187.aClass1_Sub11_Sub1_2.method2664();
			local17 = Static187.aClass1_Sub11_Sub1_2.method2654();
			arg2.method3648(local17, Static237.anInt4710, local13);
		}
		if ((arg1 & 0x200) != 0) {
			local13 = Static187.aClass1_Sub11_Sub1_2.method2654();
			@Pc(41) int[] local41 = new int[local13];
			@Pc(44) int[] local44 = new int[local13];
			@Pc(47) int[] local47 = new int[local13];
			for (@Pc(49) int local49 = 0; local49 < local13; local49++) {
				@Pc(56) int local56 = Static187.aClass1_Sub11_Sub1_2.method2631();
				if (local56 == 65535) {
					local56 = -1;
				}
				local44[local49] = local56;
				local41[local49] = Static187.aClass1_Sub11_Sub1_2.method2690();
				local47[local49] = Static187.aClass1_Sub11_Sub1_2.method2639();
			}
			Static124.method2172(local44, local41, arg2, local47);
		}
		if ((arg1 & 0x20) != 0) {
			arg2.anInt4691 = Static187.aClass1_Sub11_Sub1_2.method2639();
			arg2.anInt4639 = Static187.aClass1_Sub11_Sub1_2.method2661();
		}
		if ((arg1 & 0x10) != 0) {
			local13 = Static187.aClass1_Sub11_Sub1_2.method2654();
			@Pc(118) byte[] local118 = new byte[local13];
			@Pc(123) Class1_Sub11 local123 = new Class1_Sub11(local118);
			Static187.aClass1_Sub11_Sub1_2.method2652(local13, local118);
			Static76.aClass1_Sub11Array1[arg0] = local123;
			arg2.method1348(local123);
		}
		if ((arg1 & 0x1) != 0) {
			local13 = Static187.aClass1_Sub11_Sub1_2.method2664();
			local17 = Static187.aClass1_Sub11_Sub1_2.method2675();
			arg2.method3648(local17, Static237.anInt4710, local13);
			arg2.anInt4650 = Static237.anInt4710 + 300;
			arg2.anInt4613 = Static187.aClass1_Sub11_Sub1_2.method2675();
		}
		@Pc(273) int local273;
		if ((arg1 & 0x400) != 0) {
			local13 = Static187.aClass1_Sub11_Sub1_2.method2691();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = Static187.aClass1_Sub11_Sub1_2.method2686();
			@Pc(194) boolean local194 = true;
			if (local13 != -1 && arg2.anInt4656 != -1 && Static90.method1591(Static242.method3711(local13).anInt4951).anInt3944 < Static90.method1591(Static242.method3711(arg2.anInt4656).anInt4951).anInt3944) {
				local194 = false;
			}
			if (local194) {
				arg2.anInt4655 = 1;
				arg2.anInt4641 = local17 >> 16;
				arg2.anInt4673 = 0;
				arg2.anInt4652 = (local17 & 0xFFFF) + Static237.anInt4710;
				arg2.anInt4657 = 0;
				if (arg2.anInt4652 > Static237.anInt4710) {
					arg2.anInt4673 = -1;
				}
				arg2.anInt4656 = local13;
				if (arg2.anInt4656 != -1 && arg2.anInt4652 == Static237.anInt4710) {
					local273 = Static242.method3711(arg2.anInt4656).anInt4951;
					if (local273 != -1) {
						@Pc(280) Class125 local280 = Static90.method1591(local273);
						if (local280 != null && local280.anIntArray357 != null) {
							Static77.method1354(0, arg2 == Static197.aClass14_Sub2_Sub1_2, arg2.anInt4680, local280, arg2.anInt4630);
						}
					}
				}
			}
		}
		if ((arg1 & 0x2) != 0) {
			arg2.anInt4627 = Static187.aClass1_Sub11_Sub1_2.method2691();
			if (arg2.anInt4627 == 65535) {
				arg2.anInt4627 = -1;
			}
		}
		if ((arg1 & 0x4) != 0) {
			local13 = Static187.aClass1_Sub11_Sub1_2.method2691();
			if (local13 == 65535) {
				local13 = -1;
			}
			local17 = Static187.aClass1_Sub11_Sub1_2.method2690();
			Static111.method2041(arg2, local17, local13);
		}
		if ((arg1 & 0x800) != 0) {
			arg2.anInt4643 = Static187.aClass1_Sub11_Sub1_2.method2690();
			arg2.anInt4634 = Static187.aClass1_Sub11_Sub1_2.method2654();
			arg2.anInt4672 = Static187.aClass1_Sub11_Sub1_2.method2675();
			arg2.anInt4623 = Static187.aClass1_Sub11_Sub1_2.method2654();
			arg2.anInt4692 = Static187.aClass1_Sub11_Sub1_2.method2631() + Static237.anInt4710;
			arg2.anInt4647 = Static187.aClass1_Sub11_Sub1_2.method2631() + Static237.anInt4710;
			arg2.anInt4649 = Static187.aClass1_Sub11_Sub1_2.method2675();
			arg2.anInt4665 = 0;
			arg2.anInt4678 = 1;
		}
		if ((arg1 & 0x8) != 0) {
			arg2.aString272 = Static187.aClass1_Sub11_Sub1_2.method2629();
			if (arg2.aString272.charAt(0) == '~') {
				arg2.aString272 = arg2.aString272.substring(1);
				Static196.method1924(2, arg2.aString272, arg2.method1357());
			} else if (arg2 == Static197.aClass14_Sub2_Sub1_2) {
				Static196.method1924(2, arg2.aString272, arg2.method1357());
			}
			arg2.anInt4696 = 0;
			arg2.anInt4698 = 0;
			arg2.anInt4628 = 150;
		}
		if ((arg1 & 0x80) == 0) {
			return;
		}
		local13 = Static187.aClass1_Sub11_Sub1_2.method2639();
		local17 = Static187.aClass1_Sub11_Sub1_2.method2654();
		@Pc(480) boolean local480 = (local13 & 0x8000) != 0;
		@Pc(484) int local484 = Static187.aClass1_Sub11_Sub1_2.method2690();
		local273 = Static187.aClass1_Sub11_Sub1_2.anInt3264;
		if (arg2.aString99 != null && arg2.aClass93_1 != null) {
			@Pc(496) boolean local496 = false;
			@Pc(501) long local501 = Static93.method1658(arg2.aString99);
			if (local17 <= 1) {
				if (!local480 && (Static127.aBoolean211 && !Static296.aBoolean449 || Static147.aBoolean235)) {
					local496 = true;
				} else {
					for (@Pc(519) int local519 = 0; local519 < Static148.anInt3198; local519++) {
						if (Static255.aLongArray8[local519] == local501) {
							local496 = true;
							break;
						}
					}
				}
			}
			if (!local496 && Static266.anInt3889 == 0) {
				Static72.aClass1_Sub11_3.anInt3264 = 0;
				@Pc(549) int local549 = -1;
				Static187.aClass1_Sub11_Sub1_2.method2652(local484, Static72.aClass1_Sub11_3.aByteArray47);
				Static72.aClass1_Sub11_3.anInt3264 = 0;
				@Pc(578) String local578;
				if (local480) {
					local13 &= 0x7FFF;
					@Pc(569) Class117 local569 = Static152.method2616(Static72.aClass1_Sub11_3);
					local549 = local569.anInt3817;
					local578 = local569.aClass1_Sub2_Sub13_1.method2210(Static72.aClass1_Sub11_3);
				} else {
					local578 = Static231.method450(Static248.method3830(Static186.method3094(Static72.aClass1_Sub11_3)));
				}
				arg2.aString272 = local578.trim();
				arg2.anInt4628 = 150;
				arg2.anInt4696 = local13 >> 8;
				arg2.anInt4698 = local13 & 0xFF;
				if (local17 == 2) {
					Static221.method3478(local578, "<img=1>" + arg2.method1357(), local549, null, local480 ? 17 : 1);
				} else if (local17 == 1) {
					Static221.method3478(local578, "<img=0>" + arg2.method1357(), local549, null, local480 ? 17 : 1);
				} else {
					Static221.method3478(local578, arg2.method1357(), local549, null, local480 ? 17 : 2);
				}
			}
		}
		Static187.aClass1_Sub11_Sub1_2.anInt3264 = local273 + local484;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public static void method3509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class61 local9 = Static229.aClass61ArrayArrayArray1[Static140.anInt3034][arg0][arg1];
		if (local9 == null) {
			Static285.method4284(Static140.anInt3034, arg0, arg1);
			return;
		}
		@Pc(24) int local24 = -99999999;
		@Pc(26) Class1_Sub2_Sub19 local26 = null;
		@Pc(31) Class1_Sub2_Sub19 local31;
		for (local31 = (Class1_Sub2_Sub19) local9.method1835(); local31 != null; local31 = (Class1_Sub2_Sub19) local9.method1836()) {
			@Pc(39) Class42 local39 = Static112.method2060(local31.aClass14_Sub5_1.anInt2755);
			@Pc(42) int local42 = local39.anInt1493;
			if (local39.anInt1502 == 1) {
				local42 *= local31.aClass14_Sub5_1.anInt2754 + 1;
			}
			if (local24 < local42) {
				local26 = local31;
				local24 = local42;
			}
		}
		if (local26 == null) {
			Static285.method4284(Static140.anInt3034, arg0, arg1);
			return;
		}
		@Pc(81) Class14_Sub5 local81 = null;
		@Pc(83) Class14_Sub5 local83 = null;
		local9.method1843(local26);
		for (local31 = (Class1_Sub2_Sub19) local9.method1835(); local31 != null; local31 = (Class1_Sub2_Sub19) local9.method1836()) {
			@Pc(97) Class14_Sub5 local97 = local31.aClass14_Sub5_1;
			if (local97.anInt2755 != local26.aClass14_Sub5_1.anInt2755) {
				if (local81 == null) {
					local81 = local97;
				}
				if (local81.anInt2755 != local97.anInt2755 && local83 == null) {
					local83 = local97;
				}
			}
		}
		@Pc(144) long local144 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static102.method1905(Static140.anInt3034, arg0, arg1, Static20.method383(arg1 * 128 + 64, Static140.anInt3034, arg0 * 128 + 64), local26.aClass14_Sub5_1, local144, local81, local83);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)Lclient!wj;")
	public static Class181 method3511(@OriginalArg(0) int arg0) {
		@Pc(10) Class181 local10 = (Class181) Static265.aClass135_38.method3316((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static127.aClass91_99.method2495(Static114.method2080(arg0), Static198.method43(arg0));
		local10 = new Class181();
		local10.anInt5578 = arg0;
		if (local30 != null) {
			local10.method4426(new Class1_Sub11(local30));
		}
		local10.method4424();
		if (local10.aBoolean446) {
			local10.aBoolean439 = false;
			local10.anInt5568 = 0;
		}
		if (!Static104.aBoolean169 && local10.aBoolean448) {
			local10.aStringArray58 = null;
		}
		Static265.aClass135_38.method3321((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIZIII)V")
	public static void method3512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(11) int arg8) {
		@Pc(10) int local10 = arg2 - arg5;
		@Pc(15) int local15 = arg8 - arg3;
		@Pc(21) int local21 = -1;
		@Pc(25) int local25 = 983040 / arg1;
		@Pc(29) int local29 = 983040 / arg6;
		if (Static240.anInt4766 > 0) {
			if (Static296.anInt5584 <= 10) {
				local21 = Static296.anInt5584 * 5;
			} else {
				local21 = 50 + 50 - Static296.anInt5584 * 5;
			}
		}
		for (@Pc(58) int local58 = -local25; local58 < local10 + local25; local58++) {
			@Pc(75) int local75 = arg1 * local58 >> 16;
			@Pc(85) int local85 = arg1 * (local58 + 1) >> 16;
			@Pc(89) int local89 = local85 - local75;
			if (local89 > 0) {
				local75 += arg0;
				@Pc(109) int local109 = local58 + arg5 >> 6;
				if (local109 >= 0 && Static100.anIntArrayArrayArray5.length - 1 >= local109) {
					@Pc(123) int[][] local123 = Static100.anIntArrayArrayArray5[local109];
					for (@Pc(126) int local126 = -local29; local126 < local29 + local15; local126++) {
						@Pc(141) int local141 = (local126 + 1) * arg6 >> 16;
						@Pc(149) int local149 = arg6 * local126 >> 16;
						@Pc(154) int local154 = local141 - local149;
						if (local154 > 0) {
							@Pc(169) int local169 = local126 + arg3 >> 6;
							local149 += arg4;
							if (local169 >= 0 && local169 <= local123.length - 1 && local123[local169] != null) {
								@Pc(208) int local208 = (local58 + arg5 & 0x3F) + ((arg3 + local126 & 0x3F) << 6);
								@Pc(214) int local214 = local123[local169][local208];
								if (local214 != 0) {
									@Pc(227) Class181 local227 = method3511(local214 - 1);
									if (!Static287.aBooleanArray55[local227.anInt5567]) {
										if (local21 != -1 && Static146.anInt3173 == local227.anInt5567) {
											@Pc(245) Class1_Sub7 local245 = new Class1_Sub7();
											local245.anInt288 = local75;
											local245.anInt287 = local227.anInt5567;
											local245.anInt290 = local149;
											Static219.aClass61_24.method1839(local245);
										} else {
											Static177.aClass1_Sub2_Sub11_Sub2Array2[local227.anInt5567].method3781(local75 - 7, local149 + -7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(283) Class1_Sub7 local283 = (Class1_Sub7) Static219.aClass61_24.method1835(); local283 != null; local283 = (Class1_Sub7) Static219.aClass61_24.method1836()) {
			Static50.method949(local283.anInt288, local283.anInt290, 15, local21);
			Static50.method949(local283.anInt288, local283.anInt290, 13, local21);
			Static50.method949(local283.anInt288, local283.anInt290, 11, local21);
			Static50.method949(local283.anInt288, local283.anInt290, 9, local21);
			Static177.aClass1_Sub2_Sub11_Sub2Array2[local283.anInt287].method3781(local283.anInt288 - 7, local283.anInt290 - 7);
		}
		Static219.aClass61_24.method1845();
	}
}
