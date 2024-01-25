import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIZ)V")
	public static void method1939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static213.anInt3813 == arg2 && Static323.anInt5346 == arg1 && (Static268.anInt4539 == Static179.anInt7446 || Static130.aClass153_Sub1_1.method4229(Static377.anInt6113))) {
			return;
		}
		Static179.anInt7446 = Static268.anInt4539;
		Static323.anInt5346 = arg1;
		Static213.anInt3813 = arg2;
		if (Static130.aClass153_Sub1_1.method4229(Static377.anInt6113)) {
			Static179.anInt7446 = 0;
		}
		Static138.method2151(arg0);
		Static374.method4823(Static259.aClass63_7, Static10.aClass55_6.method1205(Static5.anInt20), true);
		@Pc(57) int local57 = Static359.anInt5713;
		@Pc(59) int local59 = Static314.anInt5181;
		Static359.anInt5713 = (Static213.anInt3813 - (Static333.anInt3375 >> 4)) * 8;
		Static314.anInt5181 = (Static323.anInt5346 - (Static102.anInt2086 >> 4)) * 8;
		Static35.aClass7_Sub4_Sub9_4 = Static93.method3404(Static213.anInt3813 * 8, Static323.anInt5346 * 8);
		Static52.aClass109_1 = null;
		@Pc(91) int local91 = Static359.anInt5713 - local57;
		@Pc(96) int local96 = Static314.anInt5181 - local59;
		@Pc(107) int local107;
		@Pc(115) int local115;
		if (arg0 == 10) {
			for (local107 = 0; local107 < 32768; local107++) {
				@Pc(276) Class26_Sub2_Sub4_Sub1 local276 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local107];
				if (local276 != null) {
					for (local115 = 0; local115 < 10; local115++) {
						local276.anIntArray603[local115] -= local91;
						local276.anIntArray604[local115] -= local96;
					}
					local276.anInt7388 -= local91 * 128;
					local276.anInt7383 -= local96 * 128;
				}
			}
		} else {
			Static56.anInt943 = 0;
			local107 = (Static333.anInt3375 - 1) * 128;
			@Pc(113) int local113 = (Static102.anInt2086 - 1) * 128;
			for (local115 = 0; local115 < 32768; local115++) {
				@Pc(121) Class26_Sub2_Sub4_Sub1 local121 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local115];
				if (local121 != null) {
					local121.anInt7383 -= local96 * 128;
					local121.anInt7388 -= local91 * 128;
					if (local121.anInt7388 >= 0 && local107 >= local121.anInt7388 && local121.anInt7383 >= 0 && local113 >= local121.anInt7383) {
						@Pc(166) boolean local166 = true;
						for (@Pc(168) int local168 = 0; local168 < 10; local168++) {
							local121.anIntArray603[local168] -= local91;
							local121.anIntArray604[local168] -= local96;
							if (local121.anIntArray603[local168] < 0 || local121.anIntArray603[local168] >= Static333.anInt3375 || local121.anIntArray604[local168] < 0 || Static102.anInt2086 <= local121.anIntArray604[local168]) {
								local166 = false;
							}
						}
						if (local166) {
							Static228.anIntArray347[Static56.anInt943++] = local115;
						} else {
							Static171.aClass26_Sub2_Sub4_Sub1Array1[local115].method4827(null);
							Static171.aClass26_Sub2_Sub4_Sub1Array1[local115] = null;
						}
					} else {
						Static171.aClass26_Sub2_Sub4_Sub1Array1[local115].method4827(null);
						Static171.aClass26_Sub2_Sub4_Sub1Array1[local115] = null;
					}
				}
			}
		}
		for (local107 = 0; local107 < 2048; local107++) {
			@Pc(332) Class26_Sub2_Sub4_Sub2 local332 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local107];
			if (local332 != null) {
				for (local115 = 0; local115 < 10; local115++) {
					local332.anIntArray603[local115] -= local91;
					local332.anIntArray604[local115] -= local96;
				}
				local332.anInt7383 -= local96 * 128;
				local332.anInt7388 -= local91 * 128;
			}
		}
		@Pc(382) Class150[] local382 = Static325.aClass150Array1;
		for (local115 = 0; local115 < local382.length; local115++) {
			@Pc(390) Class150 local390 = local382[local115];
			if (local390 != null) {
				local390.anInt4134 -= local96 * 128;
				local390.anInt4144 -= local91 * 128;
			}
		}
		Static110.method1901(local91, local96);
		for (@Pc(422) Class7_Sub37 local422 = (Class7_Sub37) Static276.aClass85_30.method2010(); local422 != null; local422 = (Class7_Sub37) Static276.aClass85_30.method2000()) {
			local422.anInt5481 -= local91;
			local422.anInt5477 -= local96;
			if (Static97.anInt1979 != 3 && (local422.anInt5481 < 0 || local422.anInt5477 < 0 || Static333.anInt3375 <= local422.anInt5481 || local422.anInt5477 >= Static102.anInt2086)) {
				local422.method5802();
			}
		}
		if (Static153.anInt5631 != 0) {
			Static153.anInt5631 -= local91;
			Static89.anInt1837 -= local96;
		}
		Static312.method4087();
		if (arg0 != 10) {
			Static404.anInt7485 -= local91;
			Static46.anInt737 -= local91 * 128;
			Static181.anInt3254 -= local96 * 128;
			Static448.anInt7378 -= local91;
			Static63.anInt1215 -= local96;
			Static453.anInt7459 -= local96;
			if (Math.abs(local91) > Static333.anInt3375 || Math.abs(local96) > Static102.anInt2086) {
				Static379.method4655();
			}
		} else if (Static9.anInt60 == 4) {
			Static17.anInt264 -= local96 * 128;
			Static87.anInt1714 -= local96 * 128;
			Static197.anInt3481 -= local91 * 128;
			Static335.anInt5453 -= local91 * 128;
		} else {
			Static9.anInt60 = 1;
		}
		Static300.method4011();
		Static140.method793();
		Static203.aClass85_20.method2008();
		Static235.aClass85_25.method2008();
		Static335.aClass169_7.method3594();
		Static325.method4301();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([I[ILclient!sr;[IB)V")
	public static void method1940(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class26_Sub2_Sub4_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg2.aClass69Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass69Array3[local23] = null;
					} else {
						@Pc(47) Class139 local47 = Static364.aClass151_2.method3293(local13);
						@Pc(50) int local50 = local47.anInt3937;
						@Pc(55) Class69 local55 = arg2.aClass69Array3[local23];
						if (local55 != null) {
							if (local13 == local55.anInt1933) {
								if (local50 == 0) {
									local55 = arg2.aClass69Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt1932 = 0;
									local55.anInt1927 = 0;
									local55.anInt1928 = 0;
									local55.anInt1929 = 1;
									local55.anInt1931 = local21;
									Static454.method5772(local47, false, arg2.anInt7383, arg2.aByte102, arg2.anInt7388, 0);
								} else if (local50 == 2) {
									local55.anInt1932 = 0;
								}
							} else if (local47.anInt3953 >= Static364.aClass151_2.method3293(local55.anInt1933).anInt3953) {
								local55 = arg2.aClass69Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg2.aClass69Array3[local23] = new Class69();
							local55.anInt1932 = 0;
							local55.anInt1931 = local21;
							local55.anInt1929 = 1;
							local55.anInt1927 = 0;
							local55.anInt1928 = 0;
							local55.anInt1933 = local13;
							Static454.method5772(local47, false, arg2.anInt7383, arg2.aByte102, arg2.anInt7388, 0);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V")
	public static void method1941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static167.method2414(local35, true, false);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIBILclient!dn;)V")
	public static void method1942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class7_Sub13 arg4) {
		if (arg4.anInt1404 == -1 && arg4.anIntArray104 == null) {
			return;
		}
		@Pc(24) int local24 = 0;
		if (arg4.anInt1398 < arg2) {
			local24 = arg2 - arg4.anInt1398;
		} else if (arg4.anInt1402 > arg2) {
			local24 = arg4.anInt1402 - arg2;
		}
		@Pc(58) int local58 = Static130.aClass153_Sub1_1.anInt5246 * arg4.anInt1394 >> 8;
		if (arg0 > arg4.anInt1391) {
			local24 += arg0 - arg4.anInt1391;
		} else if (arg4.anInt1395 > arg0) {
			local24 += arg4.anInt1395 - arg0;
		}
		if (arg4.anInt1401 == 0 || local24 - 64 > arg4.anInt1401 || Static130.aClass153_Sub1_1.anInt5246 == 0 || arg1 != arg4.anInt1393) {
			if (arg4.aClass7_Sub8_Sub4_3 != null) {
				Static452.aClass7_Sub8_Sub1_2.method2428(arg4.aClass7_Sub8_Sub4_3);
				arg4.aClass7_Sub8_Sub4_3 = null;
			}
			if (arg4.aClass7_Sub8_Sub4_2 != null) {
				Static452.aClass7_Sub8_Sub1_2.method2428(arg4.aClass7_Sub8_Sub4_2);
				arg4.aClass7_Sub8_Sub4_2 = null;
			}
			return;
		}
		local24 -= 64;
		if (local24 < 0) {
			local24 = 0;
		}
		@Pc(149) int local149 = (arg4.anInt1401 - local24) * local58 / arg4.anInt1401;
		if (arg4.aClass7_Sub8_Sub4_3 != null) {
			arg4.aClass7_Sub8_Sub4_3.method4880(local149);
		} else if (arg4.anInt1404 >= 0) {
			@Pc(167) Class23 local167 = Static461.method295(Static32.aClass178_12, arg4.anInt1404, 0);
			if (local167 != null) {
				@Pc(174) Class7_Sub31_Sub1 local174 = local167.method297().method3286(Static97.aClass257_1);
				@Pc(179) Class7_Sub8_Sub4 local179 = Static467.method4875(local174, local149);
				local179.method4883(-1);
				Static452.aClass7_Sub8_Sub1_2.method2432(local179);
				arg4.aClass7_Sub8_Sub4_3 = local179;
			}
		}
		if (arg4.aClass7_Sub8_Sub4_2 != null) {
			arg4.aClass7_Sub8_Sub4_2.method4880(local149);
			if (!arg4.aClass7_Sub8_Sub4_2.method5801()) {
				arg4.aClass7_Sub8_Sub4_2 = null;
			}
		} else if (arg4.anIntArray104 != null && (arg4.anInt1397 -= arg3) <= 0) {
			@Pc(226) int local226 = (int) ((double) arg4.anIntArray104.length * Math.random());
			@Pc(234) Class23 local234 = Static461.method295(Static32.aClass178_12, arg4.anIntArray104[local226], 0);
			if (local234 != null) {
				@Pc(241) Class7_Sub31_Sub1 local241 = local234.method297().method3286(Static97.aClass257_1);
				@Pc(246) Class7_Sub8_Sub4 local246 = Static467.method4875(local241, local149);
				local246.method4883(0);
				Static452.aClass7_Sub8_Sub1_2.method2432(local246);
				arg4.anInt1397 = (int) (Math.random() * (double) (arg4.anInt1392 - arg4.anInt1400)) + arg4.anInt1400;
				arg4.aClass7_Sub8_Sub4_2 = local246;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
	public static int method1943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static373.aShortArrayArray6 == null ? 0 : Static373.aShortArrayArray6[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
	public static void method1944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg1, 12);
		local8.method4716();
		local8.anInt5868 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method1945(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString56 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(60) String local60 = local53.readLine();
		while (true) {
			@Pc(63) String local63 = local53.readLine();
			if (local63 == null) {
				return local24 + "| " + local60;
			}
			@Pc(69) int local69 = local63.indexOf(40);
			@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
			@Pc(85) String local85;
			if (local69 == -1) {
				local85 = local63;
			} else {
				local85 = local63.substring(0, local69);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local24 = local24 + local85;
			if (local69 != -1 && local76 != -1) {
				@Pc(128) int local128 = local63.indexOf(".java:", local69);
				if (local128 >= 0) {
					local24 = local24 + local63.substring(local128 + 5, local76);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
