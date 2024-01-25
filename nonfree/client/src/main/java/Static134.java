import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public static int anInt2480;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	public static int anInt2482;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_95 = new Class221("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "S")
	public static short aShort20 = 256;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_75 = new Class77(88, 8);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2333(@OriginalArg(1) String arg0) {
		Static209.aString33 = arg0;
		if (Static92.aClass53_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static92.aClass53_2.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static92.aClass53_2.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static300.method4715(Static51.method979() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static400.method4006("document.cookie=\"" + local34 + "\"", Static92.aClass53_2.anApplet1);
		} catch (@Pc(86) Throwable local86) {
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
	public static void method2336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static107.anInt2129 == 0 || arg3 == 0 || Static98.anInt1946 >= 50 || arg2 == -1) {
			return;
		}
		Static133.anIntArray281[Static98.anInt1946] = arg2;
		Static17.anIntArray80[Static98.anInt1946] = arg3;
		Static299.anIntArray651[Static98.anInt1946] = arg0;
		Static146.aClass236Array1[Static98.anInt1946] = null;
		Static21.anIntArray96[Static98.anInt1946] = 0;
		Static198.anIntArray440[Static98.anInt1946] = arg1;
		Static98.anInt1946++;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public static void method2337() {
		for (@Pc(7) int local7 = 0; local7 < Static56.anInt1149; local7++) {
			@Pc(13) int local13 = Static330.anIntArray704[local7];
			@Pc(17) Class12_Sub1_Sub2_Sub1 local17 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local13];
			@Pc(25) int local25 = Static85.aClass2_Sub13_Sub2_11.method4240();
			if ((local25 & 0x4) != 0) {
				local25 += Static85.aClass2_Sub13_Sub2_11.method4240() << 8;
			}
			@Pc(52) int local52;
			@Pc(69) int local69;
			if ((local25 & 0x100) != 0) {
				local52 = Static85.aClass2_Sub13_Sub2_11.method4240();
				@Pc(55) int[] local55 = new int[local52];
				@Pc(58) int[] local58 = new int[local52];
				@Pc(61) int[] local61 = new int[local52];
				for (@Pc(63) int local63 = 0; local63 < local52; local63++) {
					local69 = Static85.aClass2_Sub13_Sub2_11.method4220();
					if (local69 == 65535) {
						local69 = -1;
					}
					local55[local63] = local69;
					local58[local63] = Static85.aClass2_Sub13_Sub2_11.method4196();
					local61[local63] = Static85.aClass2_Sub13_Sub2_11.method4229();
				}
				Static215.method3635(local17, local58, local55, local61);
			}
			@Pc(119) int local119;
			if ((local25 & 0x8) != 0) {
				local52 = Static85.aClass2_Sub13_Sub2_11.method4229();
				if (local52 == 65535) {
					local52 = -1;
				}
				local119 = Static85.aClass2_Sub13_Sub2_11.method4249();
				Static231.method3807(local17, local119, local52);
			}
			if ((local25 & 0x2) != 0) {
				if (local17.aClass240_1.method5576()) {
					Static327.method5051(local17);
				}
				local17.method3260(Static274.aClass151_4.method3705(Static85.aClass2_Sub13_Sub2_11.method4229()));
				local17.method4698(local17.aClass240_1.anInt6483);
				local17.anInt5317 = local17.aClass240_1.anInt6497 << 3;
				if (local17.aClass240_1.method5576()) {
					Static52.method3357(null, local17, local17.aByte74, local17.anIntArray659[0], 0, null, local17.anIntArray658[0]);
				}
			}
			if ((local25 & 0x40) != 0) {
				local52 = Static85.aClass2_Sub13_Sub2_11.method4211();
				local119 = Static85.aClass2_Sub13_Sub2_11.method4196();
				local17.method4708(Static295.anInt5281, local52, local119);
				local17.anInt5322 = Static295.anInt5281 + 300;
				local17.anInt5360 = Static85.aClass2_Sub13_Sub2_11.method4249();
			}
			if ((local25 & 0x10) != 0) {
				local17.anInt5345 = Static85.aClass2_Sub13_Sub2_11.method4220();
				if (local17.anInt5345 == 65535) {
					local17.anInt5345 = -1;
				}
			}
			if ((local25 & 0x20) != 0) {
				local52 = Static85.aClass2_Sub13_Sub2_11.method4211();
				local119 = Static85.aClass2_Sub13_Sub2_11.method4196();
				local17.method4708(Static295.anInt5281, local52, local119);
			}
			if ((local25 & 0x200) != 0) {
				local17.anInt3550 = Static85.aClass2_Sub13_Sub2_11.method4237();
				local17.anInt3545 = Static85.aClass2_Sub13_Sub2_11.method4237();
			}
			if ((local25 & 0x80) != 0) {
				local52 = Static85.aClass2_Sub13_Sub2_11.method4237();
				if (local52 == 65535) {
					local52 = -1;
				}
				local119 = Static85.aClass2_Sub13_Sub2_11.method4221();
				@Pc(282) boolean local282 = true;
				@Pc(357) Class189 local357;
				if (local52 != -1 && local17.anInt5330 != -1) {
					@Pc(303) Class220 local303;
					if (local52 == local17.anInt5330) {
						local303 = Static168.aClass74_1.method1772(local52);
						if (local303.aBoolean455 && local303.anInt6020 != -1) {
							local357 = Static351.aClass175_3.method4107(local303.anInt6020);
							local69 = local357.anInt5165;
							if (local69 == 0) {
								local282 = false;
							} else if (local69 == 1) {
								local282 = true;
							} else if (local69 == 2) {
								local282 = false;
								local17.anInt5324 = 0;
							}
						}
					} else {
						local303 = Static168.aClass74_1.method1772(local52);
						@Pc(309) Class220 local309 = Static168.aClass74_1.method1772(local17.anInt5330);
						if (local303.anInt6020 != -1 && local309.anInt6020 != -1) {
							@Pc(324) Class189 local324 = Static351.aClass175_3.method4107(local303.anInt6020);
							@Pc(330) Class189 local330 = Static351.aClass175_3.method4107(local309.anInt6020);
							if (local324.anInt5157 < local330.anInt5157) {
								local282 = false;
							}
						}
					}
				}
				if (local282) {
					local17.anInt5375 = local119 >> 16;
					local17.anInt5367 = (local119 & 0xFFFF) + Static295.anInt5281;
					local17.anInt5369 = 0;
					local17.anInt5327 = 1;
					local17.anInt5330 = local52;
					local17.anInt5341 = 0;
					if (Static295.anInt5281 < local17.anInt5367) {
						local17.anInt5341 = -1;
					}
					if (local17.anInt5330 != -1 && local17.anInt5367 == Static295.anInt5281) {
						@Pc(440) int local440 = Static168.aClass74_1.method1772(local17.anInt5330).anInt6020;
						if (local440 != -1) {
							local357 = Static351.aClass175_3.method4107(local440);
							if (local357 != null && local357.anIntArray639 != null) {
								Static369.method5563(local17.aByte74, local357, false, local17.anInt6328, local17.anInt6317, 0);
							}
						}
					}
				}
			}
			if ((local25 & 0x1) != 0) {
				local17.aString50 = Static85.aClass2_Sub13_Sub2_11.method4201();
				local17.anInt5335 = 100;
			}
			if ((local25 & 0x400) != 0) {
				local52 = Static85.aClass2_Sub13_Sub2_11.method4220();
				local17.anInt5320 = Static85.aClass2_Sub13_Sub2_11.method4240();
				local17.anInt5373 = Static85.aClass2_Sub13_Sub2_11.method4249();
				local17.anInt5359 = local52 & 0x7FFF;
				local17.aBoolean420 = (local52 & 0x8000) != 0;
				local17.anInt5319 = local17.anInt5320 + local17.anInt5359 + Static295.anInt5281;
			}
		}
	}
}
