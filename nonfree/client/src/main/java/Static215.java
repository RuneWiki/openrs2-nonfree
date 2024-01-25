import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public static int anInt4291;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_37 = new Class42();

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "Lclient!hj;")
	public static final Class81 aClass81_2 = new Class81("stellardawn", 1);

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_13 = new Class105("", 10);

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public static int anInt4292 = -1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public static void method3976() {
		if (Static9.aClass63_1.method4602()) {
			Static283.method5049();
			Static9.aClass63_1.method4646(Static174.aCanvas3);
			Static113.method2415();
		} else {
			Static186.method3507(Static241.anInt4925);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZ)V")
	public static void method3977(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static180.aClass1_Sub7_Sub2_2.method2164(Static366.anInt7026) >= 15) {
				@Pc(14) int local14 = Static180.aClass1_Sub7_Sub2_2.method2169(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static231.aClass11_Sub2_Sub6_Sub2Array1[local14] == null) {
						Static231.aClass11_Sub2_Sub6_Sub2Array1[local14] = new Class11_Sub2_Sub6_Sub2();
						local21 = true;
						Static231.aClass11_Sub2_Sub6_Sub2Array1[local14].anInt6792 = local14;
					}
					@Pc(42) Class11_Sub2_Sub6_Sub2 local42 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local14];
					Static81.anIntArray143[Static277.anInt5394++] = local14;
					local42.anInt6745 = Static51.anInt1301;
					if (local42.aClass208_1 != null && local42.aClass208_1.method5542()) {
						Static195.method3641(local42);
					}
					@Pc(69) int local69 = Static180.aClass1_Sub7_Sub2_2.method2169(1);
					@Pc(74) int local74 = Static180.aClass1_Sub7_Sub2_2.method2169(1);
					if (local74 == 1) {
						Static42.anIntArray72[Static342.anInt6506++] = local14;
					}
					@Pc(96) int local96 = (Static180.aClass1_Sub7_Sub2_2.method2169(3) + 4 & 0x5000007) << 11;
					@Pc(101) int local101 = Static180.aClass1_Sub7_Sub2_2.method2169(2);
					local42.method5906(Static139.method2817(Static180.aClass1_Sub7_Sub2_2.method2169(14)));
					@Pc(117) int local117;
					if (arg0) {
						local117 = Static180.aClass1_Sub7_Sub2_2.method2169(8);
						if (local117 > 127) {
							local117 -= 256;
						}
					} else {
						local117 = Static180.aClass1_Sub7_Sub2_2.method2169(5);
						if (local117 > 15) {
							local117 -= 32;
						}
					}
					@Pc(141) int local141;
					if (arg0) {
						local141 = Static180.aClass1_Sub7_Sub2_2.method2169(8);
						if (local141 > 127) {
							local141 -= 256;
						}
					} else {
						local141 = Static180.aClass1_Sub7_Sub2_2.method2169(5);
						if (local141 > 15) {
							local141 -= 32;
						}
					}
					local42.method5893(local42.aClass208_1.anInt6162);
					local42.anInt6786 = local42.aClass208_1.anInt6180 << 3;
					if (local42.anInt6786 == 0) {
						local42.method5883(0);
					} else if (local21) {
						local42.method5883(local96);
					}
					local42.method5907(local101, local141 + Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0] - -local117, local69 == 1, local42.method5894());
					if (local42.aClass208_1.method5542()) {
						Static286.method5275(0, null, local42, local42.anIntArray504[0], local42.aByte79, null, local42.anIntArray505[0]);
					}
					continue;
				}
			}
			Static180.aClass1_Sub7_Sub2_2.method2167();
			return;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public static void method3978() {
		Static112.aClass21_72.method857();
		Static104.aClass21_68.method857();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	public static void method3979() {
		if (Static118.anInt2586 == 0) {
			return;
		}
		try {
			if (++Static246.anInt6967 > 1500) {
				if (Static165.aClass76_2 != null) {
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
				}
				if (Static97.anInt2175 >= 1) {
					Static171.anInt3577 = -5;
					Static118.anInt2586 = 0;
					return;
				}
				Static118.anInt2586 = 1;
				Static97.anInt2175++;
				Static246.anInt6967 = 0;
				if (Static345.anInt6538 == Static225.anInt4520) {
					Static225.anInt4520 = Static293.anInt4949;
				} else {
					Static225.anInt4520 = Static345.anInt6538;
				}
			}
			if (Static118.anInt2586 == 1) {
				Static84.aClass121_2 = Static227.aClass75_5.method2359(Static306.aString54, Static225.anInt4520);
				Static118.anInt2586 = 2;
			}
			@Pc(125) int local125;
			if (Static118.anInt2586 == 2) {
				if (Static84.aClass121_2.anInt3693 == 2) {
					throw new IOException();
				}
				if (Static84.aClass121_2.anInt3693 != 1) {
					return;
				}
				Static165.aClass76_2 = new Class76((Socket) Static84.aClass121_2.anObject2, Static227.aClass75_5);
				Static84.aClass121_2 = null;
				Static165.aClass76_2.method2376(Static339.aClass1_Sub7_Sub2_4.anInt2219, Static339.aClass1_Sub7_Sub2_4.aByteArray41);
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				local125 = Static165.aClass76_2.method2379();
				if (Static284.aClass48_12 != null) {
					Static284.aClass48_12.method1834();
				}
				if (Static61.aClass48_4 != null) {
					Static61.aClass48_4.method1834();
				}
				if (local125 != 101) {
					Static118.anInt2586 = 0;
					Static171.anInt3577 = local125;
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
					return;
				}
				Static118.anInt2586 = 3;
			}
			if (Static118.anInt2586 == 3) {
				if (Static165.aClass76_2.method2387() < 2) {
					return;
				}
				local125 = Static165.aClass76_2.method2379() << 8 | Static165.aClass76_2.method2379();
				Static49.method1175(local125);
				if (Static239.anInt4853 == -1) {
					Static171.anInt3577 = 6;
					Static118.anInt2586 = 0;
					Static165.aClass76_2.method2377();
					Static165.aClass76_2 = null;
					return;
				}
				Static118.anInt2586 = 0;
				Static165.aClass76_2.method2377();
				Static165.aClass76_2 = null;
				Static149.method2883();
				return;
			}
		} catch (@Pc(206) IOException local206) {
			if (Static165.aClass76_2 != null) {
				Static165.aClass76_2.method2377();
				Static165.aClass76_2 = null;
			}
			if (Static97.anInt2175 < 1) {
				Static118.anInt2586 = 1;
				if (Static225.anInt4520 == Static345.anInt6538) {
					Static225.anInt4520 = Static293.anInt4949;
				} else {
					Static225.anInt4520 = Static345.anInt6538;
				}
				Static97.anInt2175++;
				Static246.anInt6967 = 0;
			} else {
				Static171.anInt3577 = -4;
				Static118.anInt2586 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
	public static void method3980() {
		if (Static225.method4175() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static365.anInt7010 - 4 & 0xFF);
		@Pc(21) int local21 = Static365.anInt7010 % Static311.anInt5653;
		@Pc(27) int local27;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (local27 = 0; local27 < Static189.anInt3820; local27++) {
				Static341.aByteArrayArrayArray10[local23][local21][local27] = local17;
			}
		}
		if (Static284.anInt6477 == 3) {
			return;
		}
		for (local27 = 0; local27 < 2; local27++) {
			Static198.anIntArray309[local27] = -1000000;
			Static127.anIntArray207[local27] = 1000000;
			Static260.anIntArray406[local27] = 0;
			Static40.anIntArray70[local27] = 1000000;
			Static271.anIntArray43[local27] = 0;
		}
		@Pc(103) int local103;
		if (Static50.anInt1273 != 1) {
			local103 = Static8.method288(Static284.anInt6477, Static14.anInt4971, Static260.anInt5192);
			if (local103 - Static294.anInt5665 < 800 && (Static264.aByteArrayArrayArray7[Static284.anInt6477][Static14.anInt4971 >> 7][Static260.anInt5192 >> 7] & 0x4) != 0) {
				Static170.method3181(Static14.anInt4971 >> 7, Static260.anInt5192 >> 7, 1, false, Static105.aClass155ArrayArrayArray3);
				return;
			}
			return;
		}
		if ((Static264.aByteArrayArrayArray7[Static284.anInt6477][Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7][Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7] & 0x4) != 0) {
			Static170.method3181(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7, Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7, 0, false, Static105.aClass155ArrayArrayArray3);
		}
		if (Static272.anInt5295 >= 2560) {
			return;
		}
		local103 = Static14.anInt4971 >> 7;
		@Pc(180) int local180 = Static260.anInt5192 >> 7;
		@Pc(185) int local185 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7;
		@Pc(190) int local190 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7;
		@Pc(202) int local202;
		if (local103 < local185) {
			local202 = local185 - local103;
		} else {
			local202 = local103 - local185;
		}
		@Pc(220) int local220;
		if (local190 <= local180) {
			local220 = local180 - local190;
		} else {
			local220 = local190 - local180;
		}
		if (local202 == 0 && local220 == 0 || local202 <= -Static311.anInt5653 || Static311.anInt5653 <= local202 || local220 <= -Static189.anInt3820 || local220 >= Static189.anInt3820) {
			Static119.method2541("RC: " + local103 + "," + local180 + " " + local185 + "," + local190 + " " + Static50.anInt1271 + "," + Static299.anInt4036, null);
			return;
		}
		@Pc(301) int local301;
		@Pc(303) int local303;
		if (local202 <= local220) {
			local301 = local202 * 65536 / local220;
			local303 = 32768;
			while (local190 != local180) {
				if (local180 < local190) {
					local180++;
				} else if (local190 < local180) {
					local180--;
				}
				if ((Static264.aByteArrayArrayArray7[Static284.anInt6477][local103][local180] & 0x4) != 0) {
					Static170.method3181(local103, local180, 1, false, Static105.aClass155ArrayArrayArray3);
					return;
				}
				local303 += local301;
				if (local303 >= 65536) {
					if (local185 > local103) {
						local103++;
					} else if (local103 > local185) {
						local103--;
					}
					local303 -= 65536;
					if ((Static264.aByteArrayArrayArray7[Static284.anInt6477][local103][local180] & 0x4) != 0) {
						Static170.method3181(local103, local180, 1, false, Static105.aClass155ArrayArrayArray3);
						return;
					}
				}
			}
			return;
		}
		local301 = local220 * 65536 / local202;
		local303 = 32768;
		while (local103 != local185) {
			if (local103 < local185) {
				local103++;
			} else if (local185 < local103) {
				local103--;
			}
			if ((Static264.aByteArrayArrayArray7[Static284.anInt6477][local103][local180] & 0x4) != 0) {
				Static170.method3181(local103, local180, 1, false, Static105.aClass155ArrayArrayArray3);
				return;
			}
			local303 += local301;
			if (local303 >= 65536) {
				if (local190 > local180) {
					local180++;
				} else if (local180 > local190) {
					local180--;
				}
				local303 -= 65536;
				if ((Static264.aByteArrayArrayArray7[Static284.anInt6477][local103][local180] & 0x4) != 0) {
					Static170.method3181(local103, local180, 1, false, Static105.aClass155ArrayArrayArray3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([BIIIZLclient!fp;[Lclient!th;IIIII)V")
	public static void method3981(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) Class196[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(10) Class1_Sub7 local10 = new Class1_Sub7(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method2152();
			if (local20 == 0) {
				return;
			}
			local12 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method2134();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local10.method2132();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (arg2 == local54 && local50 >= arg7 && arg7 + 8 > local50 && local44 >= arg1 && arg1 + 8 > local44) {
					@Pc(89) Class71 local89 = Static219.method4081(local12);
					@Pc(109) int local109 = arg9 + Static147.method2870(arg10, local66, local50 & 0x7, local89.anInt2411, local89.anInt2376, local44 & 0x7);
					@Pc(127) int local127 = arg6 + Static236.method4379(arg10, local50 & 0x7, local66, local89.anInt2411, local89.anInt2376, local44 & 0x7);
					if (local109 > 0 && local127 > 0 && Static311.anInt5653 - 1 > local109 && local127 < Static189.anInt3820 - 1) {
						@Pc(150) Class196 local150 = null;
						if (!arg3) {
							@Pc(154) int local154 = arg8;
							if ((Static264.aByteArrayArrayArray7[1][local109][local127] & 0x2) == 2) {
								local154 = arg8 - 1;
							}
							if (local154 >= 0) {
								local150 = arg5[local154];
							}
						}
						Static181.method3454(local109, arg8, local12, local127, local150, true, arg8, -1, arg4, arg3, arg10 + local66 & 0x3, local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public static void method3983() {
		for (@Pc(14) Class1_Sub20 local14 = (Class1_Sub20) Static75.aClass42_19.method1543(); local14 != null; local14 = (Class1_Sub20) Static75.aClass42_19.method1551()) {
			if (local14.anInt2713 > 0) {
				local14.anInt2713--;
			}
			if (local14.anInt2713 != 0) {
				if (local14.anInt2706 > 0) {
					local14.anInt2706--;
				}
				if (local14.anInt2706 == 0 && local14.anInt2716 >= 1 && local14.anInt2698 >= 1 && local14.anInt2716 <= Static311.anInt5653 - 2 && Static189.anInt3820 - 2 >= local14.anInt2698 && (local14.anInt2700 < 0 || Static255.method4770(local14.anInt2717, local14.anInt2700))) {
					Static31.method823(local14.anInt2707, local14.anInt2698, local14.anInt2700, local14.anInt2716, local14.anInt2709, -1, local14.anInt2708, local14.anInt2717);
					local14.anInt2706 = -1;
					if (local14.anInt2705 == local14.anInt2700 && local14.anInt2705 == -1) {
						local14.method6045();
					} else if (local14.anInt2705 == local14.anInt2700 && local14.anInt2712 == local14.anInt2708 && local14.anInt2717 == local14.anInt2703) {
						local14.method6045();
					}
				}
			} else if (local14.anInt2705 < 0 || Static255.method4770(local14.anInt2703, local14.anInt2705)) {
				Static31.method823(local14.anInt2707, local14.anInt2698, local14.anInt2705, local14.anInt2716, local14.anInt2709, -1, local14.anInt2712, local14.anInt2703);
				local14.method6045();
			}
		}
	}
}
