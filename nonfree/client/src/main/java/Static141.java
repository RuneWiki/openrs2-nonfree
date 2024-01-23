import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!of", name = "E", descriptor = "I")
	public static int anInt3154;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "Lclient!ai;")
	public static Class7 aClass7_30;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!ge;")
	public static Class39 aClass39_15 = new Class39(100);

	@OriginalMember(owner = "client!of", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1110 = Static200.method3116("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!of", name = "G", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1111 = Static200.method3116("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!of", name = "O", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "I")
	public static int anInt3163 = 0;

	@OriginalMember(owner = "client!of", name = "R", descriptor = "[Lclient!fa;")
	public static Class29[] aClass29Array2 = new Class29[5000];

	@OriginalMember(owner = "client!of", name = "S", descriptor = "I")
	public static int anInt3165 = 0;

	@OriginalMember(owner = "client!of", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1112 = Static200.method3116("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!of", name = "V", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1113 = Static200.method3116(":chalreq:");

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg3 && arg2 == arg0 && arg6 == arg5 && arg8 == arg7) {
			Static148.method3516(arg2, arg6, arg7, arg3, arg1);
			return;
		}
		@Pc(23) int local23 = arg3;
		@Pc(27) int local27 = arg3 * 3;
		@Pc(31) int local31 = arg4 * 3;
		@Pc(35) int local35 = arg5 * 3;
		@Pc(39) int local39 = arg0 * 3;
		@Pc(41) int local41 = arg2;
		@Pc(51) int local51 = local31 + arg6 - arg3 - local35;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(63) int local63 = local39 + arg7 - local55 - arg2;
		@Pc(67) int local67 = arg2 * 3;
		@Pc(77) int local77 = local55 + local67 - local39 - local39;
		@Pc(86) int local86 = local35 + local27 - local31 - local31;
		@Pc(91) int local91 = local39 - local67;
		@Pc(96) int local96 = local31 - local27;
		for (@Pc(98) int local98 = 128; local98 <= 4096; local98 += 128) {
			@Pc(106) int local106 = local98 * local98 >> 12;
			@Pc(112) int local112 = local106 * local98 >> 12;
			@Pc(116) int local116 = local112 * local51;
			@Pc(120) int local120 = local63 * local112;
			@Pc(124) int local124 = local106 * local86;
			@Pc(128) int local128 = local106 * local77;
			@Pc(132) int local132 = local98 * local96;
			@Pc(136) int local136 = local91 * local98;
			@Pc(147) int local147 = arg2 + (local136 + local128 + local120 >> 12);
			@Pc(158) int local158 = (local116 + local124 + local132 >> 12) + arg3;
			Static148.method3516(local41, local158, local147, local23, arg1);
			local41 = local147;
			local23 = local158;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!kh;Lclient!kh;ILclient!kh;)V")
	public static void method2417(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		Static12.aClass60_104 = arg0;
		Static12.aClass60_98 = arg2;
		Static12.aClass60_96 = arg1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)I")
	public static int method2418(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!f;II)V")
	public static void method2419(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub4_Sub1 arg1, @OriginalArg(2) int arg2) {
		if ((arg0 & 0x4) != 0) {
			arg1.aClass60_1328 = Static16.aClass1_Sub9_Sub1_1.method935();
			if (arg1.aClass60_1328.method1793(0) == 126) {
				arg1.aClass60_1328 = arg1.aClass60_1328.method1818(1);
				Static13.method239(arg1.aClass60_414, arg1.aClass60_1328, 2);
			} else if (arg1 == Static84.aClass9_Sub4_Sub1_2) {
				Static13.method239(arg1.aClass60_414, arg1.aClass60_1328, 2);
			}
			arg1.anInt3900 = 150;
			arg1.anInt3917 = 0;
			arg1.anInt3895 = 0;
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt3920 = Static16.aClass1_Sub9_Sub1_1.method930();
			arg1.anInt3908 = Static16.aClass1_Sub9_Sub1_1.method939();
			arg1.anInt3945 = Static16.aClass1_Sub9_Sub1_1.method939();
			arg1.anInt3935 = Static16.aClass1_Sub9_Sub1_1.method942();
			arg1.anInt3951 = Static16.aClass1_Sub9_Sub1_1.method916() + Static42.anInt910;
			arg1.anInt3933 = Static16.aClass1_Sub9_Sub1_1.method916() + Static42.anInt910;
			arg1.anInt3941 = Static16.aClass1_Sub9_Sub1_1.method942();
			arg1.anInt3943 = 0;
			arg1.anInt3946 = 1;
		}
		if ((arg0 & 0x10) != 0) {
			arg1.anInt3926 = Static16.aClass1_Sub9_Sub1_1.method901();
			arg1.anInt3918 = Static16.aClass1_Sub9_Sub1_1.method885();
		}
		@Pc(144) int local144;
		if ((arg0 & 0x200) != 0) {
			arg1.anInt3914 = Static16.aClass1_Sub9_Sub1_1.method946();
			local144 = Static16.aClass1_Sub9_Sub1_1.method923();
			if (arg1.anInt3914 == 65535) {
				arg1.anInt3914 = -1;
			}
			arg1.anInt3929 = 0;
			arg1.anInt3934 = local144 >> 16;
			arg1.anInt3893 = 0;
			arg1.anInt3904 = Static42.anInt910 + (local144 & 0xFFFF);
			if (Static42.anInt910 < arg1.anInt3904) {
				arg1.anInt3893 = -1;
			}
		}
		@Pc(195) int local195;
		if ((arg0 & 0x8) != 0) {
			local144 = Static16.aClass1_Sub9_Sub1_1.method946();
			local195 = Static16.aClass1_Sub9_Sub1_1.method895();
			if (local144 == 65535) {
				local144 = -1;
			}
			Static218.method3518(local195, local144, arg1);
		}
		if ((arg0 & 0x40) != 0) {
			local144 = Static16.aClass1_Sub9_Sub1_1.method895();
			@Pc(216) byte[] local216 = new byte[local144];
			@Pc(221) Class1_Sub9 local221 = new Class1_Sub9(local216);
			Static16.aClass1_Sub9_Sub1_1.method919(local144, local216);
			Static104.aClass1_Sub9Array1[arg2] = local221;
			arg1.method1015(local221);
		}
		if ((arg0 & 0x80) != 0) {
			local144 = Static16.aClass1_Sub9_Sub1_1.method930();
			local195 = Static16.aClass1_Sub9_Sub1_1.method895();
			arg1.method2910(local144, local195, Static42.anInt910);
			arg1.anInt3916 = Static42.anInt910 + 300;
			arg1.anInt3898 = Static16.aClass1_Sub9_Sub1_1.method939();
		}
		if ((arg0 & 0x100) != 0) {
			local144 = Static16.aClass1_Sub9_Sub1_1.method930();
			local195 = Static16.aClass1_Sub9_Sub1_1.method930();
			arg1.method2910(local144, local195, Static42.anInt910);
		}
		if ((arg0 & 0x1) != 0) {
			local144 = Static16.aClass1_Sub9_Sub1_1.method901();
			local195 = Static16.aClass1_Sub9_Sub1_1.method930();
			@Pc(304) int local304 = Static16.aClass1_Sub9_Sub1_1.method895();
			@Pc(307) int local307 = Static16.aClass1_Sub9_Sub1_1.anInt1192;
			@Pc(315) boolean local315 = (local144 & 0x8000) != 0;
			if (arg1.aClass60_414 != null && arg1.aClass50_2 != null) {
				@Pc(326) long local326 = arg1.aClass60_414.method1829();
				@Pc(328) boolean local328 = false;
				if (local195 <= 1) {
					if (!local315 && (Static175.anInt3770 == 1 || Static60.anInt1524 == 1)) {
						local328 = true;
					} else {
						for (@Pc(349) int local349 = 0; local349 < Static78.anInt1884; local349++) {
							if (Static140.aLongArray7[local349] == local326) {
								local328 = true;
								break;
							}
						}
					}
				}
				if (!local328 && Static142.anInt3197 == 0) {
					@Pc(375) int local375 = -1;
					Static52.aClass1_Sub9_4.anInt1192 = 0;
					Static16.aClass1_Sub9_Sub1_1.method894(Static52.aClass1_Sub9_4.aByteArray20, local304);
					Static52.aClass1_Sub9_4.anInt1192 = 0;
					@Pc(397) Class60 local397;
					if (local315) {
						local144 &= 0x7FFF;
						@Pc(407) Class49 local407 = Static61.method1103(Static52.aClass1_Sub9_4);
						local375 = local407.anInt1999;
						local397 = local407.aClass1_Sub1_Sub19_1.method2397(Static52.aClass1_Sub9_4);
					} else {
						local397 = Static123.method3304(Static7.method144(Static52.aClass1_Sub9_4).method1827());
					}
					arg1.aClass60_1328 = local397.method1814();
					arg1.anInt3900 = 150;
					arg1.anInt3917 = local144 >> 8;
					arg1.anInt3895 = local144 & 0xFF;
					if (local195 == 2) {
						Static135.method2255(local375, local315 ? 17 : 1, Static34.method611(new Class60[] { Static12.aClass60_101, arg1.aClass60_414 }), null, local397);
					} else if (local195 == 1) {
						Static135.method2255(local375, local315 ? 17 : 1, Static34.method611(new Class60[] { Static94.aClass60_709, arg1.aClass60_414 }), null, local397);
					} else {
						Static135.method2255(local375, local315 ? 17 : 2, arg1.aClass60_414, null, local397);
					}
				}
			}
			Static16.aClass1_Sub9_Sub1_1.anInt1192 = local307 + local304;
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		arg1.anInt3953 = Static16.aClass1_Sub9_Sub1_1.method946();
		if (arg1.anInt3953 == 65535) {
			arg1.anInt3953 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!sf;Lclient!vb;IZ)V")
	public static void method2420(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class7_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub24 local7 = new Class1_Sub24();
		local7.aLong150 = arg2;
		local7.aClass90_2 = arg0;
		local7.aClass7_Sub1_26 = arg1;
		local7.anInt3600 = 1;
		@Pc(30) Class19 local30 = Static51.aClass19_8;
		synchronized (Static51.aClass19_8) {
			Static51.aClass19_8.method620(local7);
		}
		Static219.method3520();
	}
}
