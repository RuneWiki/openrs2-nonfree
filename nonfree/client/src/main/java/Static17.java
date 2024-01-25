import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public static int anInt5991;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!jf;")
	public static Class96 aClass96_19;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public static int anInt5992;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	public static int anInt5994 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!ra;IZ)Lclient!oq;")
	public static Class150 method5326(@OriginalArg(0) int arg0, @OriginalArg(1) Class170 arg1) {
		@Pc(9) byte[] local9 = arg1.method4584(arg0, 0);
		return local9 == null ? null : new Class150(local9);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!en;)V")
	public static void method5327(@OriginalArg(0) Class59 arg0) {
		for (@Pc(1) int local1 = Static131.anInt2706; local1 < Static248.anInt4820; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static12.anInt378; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static248.anInt4822; local7++) {
					@Pc(16) Class51 local16 = Static138.aClass51ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class25_Sub2 local21 = local16.aClass25_Sub2_1;
						@Pc(24) Class25_Sub2 local24 = local16.aClass25_Sub2_2;
						if (local21 != null && local21.method5585()) {
							Static257.method4469(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5585()) {
								Static257.method4469(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5584(0, arg0, 0, local21, 0, false);
								local24.method5588();
							}
							local21.method5588();
						}
						for (@Pc(70) Class103 local70 = local16.aClass103_1; local70 != null; local70 = local70.aClass103_2) {
							@Pc(74) Class25_Sub1 local74 = local70.aClass25_Sub1_1;
							if (local74 != null && local74.method5585()) {
								Static257.method4469(arg0, local74, local1, local4, local7, local74.aShort73 + 1 - local74.aShort76, local74.aShort74 - local74.aShort75 + 1);
								local74.method5588();
							}
						}
						@Pc(111) Class25_Sub4 local111 = local16.aClass25_Sub4_1;
						if (local111 != null && local111.method5585()) {
							Static164.method3034(arg0, local111, local1, local4, local7);
							local111.method5588();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BC)B")
	public static byte method5328(@OriginalArg(1) char arg0) {
		@Pc(30) byte local30;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local30 = (byte) arg0;
		} else if (arg0 == '€') {
			local30 = -128;
		} else if (arg0 == '‚') {
			local30 = -126;
		} else if (arg0 == 'ƒ') {
			local30 = -125;
		} else if (arg0 == '„') {
			local30 = -124;
		} else if (arg0 == '…') {
			local30 = -123;
		} else if (arg0 == '†') {
			local30 = -122;
		} else if (arg0 == '‡') {
			local30 = -121;
		} else if (arg0 == 'ˆ') {
			local30 = -120;
		} else if (arg0 == '‰') {
			local30 = -119;
		} else if (arg0 == 'Š') {
			local30 = -118;
		} else if (arg0 == '‹') {
			local30 = -117;
		} else if (arg0 == 'Œ') {
			local30 = -116;
		} else if (arg0 == 'Ž') {
			local30 = -114;
		} else if (arg0 == '‘') {
			local30 = -111;
		} else if (arg0 == '’') {
			local30 = -110;
		} else if (arg0 == '“') {
			local30 = -109;
		} else if (arg0 == '”') {
			local30 = -108;
		} else if (arg0 == '•') {
			local30 = -107;
		} else if (arg0 == '–') {
			local30 = -106;
		} else if (arg0 == '—') {
			local30 = -105;
		} else if (arg0 == '˜') {
			local30 = -104;
		} else if (arg0 == '™') {
			local30 = -103;
		} else if (arg0 == 'š') {
			local30 = -102;
		} else if (arg0 == '›') {
			local30 = -101;
		} else if (arg0 == 'œ') {
			local30 = -100;
		} else if (arg0 == 'ž') {
			local30 = -98;
		} else if (arg0 == 'Ÿ') {
			local30 = -97;
		} else {
			local30 = 63;
		}
		return local30;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLclient!ra;)Lclient!nm;")
	public static Class138 method5330(@OriginalArg(0) int arg0, @OriginalArg(2) Class170 arg1) {
		@Pc(8) byte[] local8 = arg1.method4571(arg0);
		return local8 == null ? null : new Class138(local8);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
	public static int method5331() {
		try {
			if (Static333.anInt4627 == 0) {
				if (Static237.aLong155 > Static284.method4783() - 5000L) {
					return 0;
				}
				Static164.aClass60_6 = Static202.aClass10_3.method310(Static162.anInt3270, Static98.aString131);
				Static264.aLong114 = Static284.method4783();
				Static333.anInt4627 = 1;
			}
			if (Static284.method4783() > Static264.aLong114 + 30000L) {
				return Static269.method4546(1000);
			}
			@Pc(77) int local77;
			@Pc(114) int local114;
			if (Static333.anInt4627 == 1) {
				if (Static164.aClass60_6.anInt1838 == 2) {
					return Static269.method4546(1001);
				}
				if (Static164.aClass60_6.anInt1838 != 1) {
					return -1;
				}
				Static95.aClass68_23 = new Class68((Socket) Static164.aClass60_6.anObject2, Static202.aClass10_3);
				Static164.aClass60_6 = null;
				local77 = 0;
				if (Static101.aBoolean142) {
					local77 = Static104.anInt2255;
				}
				Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
				Static335.aClass5_Sub1_Sub1_3.method1886(23);
				Static335.aClass5_Sub1_Sub1_3.method1851(local77);
				Static95.aClass68_23.method2002(Static335.aClass5_Sub1_Sub1_3.anInt2029, Static335.aClass5_Sub1_Sub1_3.aByteArray18);
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				local114 = Static95.aClass68_23.method2000();
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				if (local114 != 0) {
					return Static269.method4546(local114);
				}
				Static333.anInt4627 = 2;
			}
			if (Static333.anInt4627 == 2) {
				if (Static95.aClass68_23.method1999() < 2) {
					return -1;
				}
				Static252.anInt4898 = Static95.aClass68_23.method2000();
				Static252.anInt4898 <<= 0x8;
				Static252.anInt4898 += Static95.aClass68_23.method2000();
				Static105.anInt2298 = 0;
				Static333.anInt4627 = 3;
				Static166.aByteArray41 = new byte[Static252.anInt4898];
			}
			if (Static333.anInt4627 != 3) {
				return -1;
			}
			local77 = Static95.aClass68_23.method1999();
			if (local77 < 1) {
				return -1;
			}
			if (Static252.anInt4898 - Static105.anInt2298 < local77) {
				local77 = Static252.anInt4898 - Static105.anInt2298;
			}
			Static95.aClass68_23.method1993(Static166.aByteArray41, local77, Static105.anInt2298);
			Static105.anInt2298 += local77;
			if (Static252.anInt4898 > Static105.anInt2298) {
				return -1;
			} else if (Static288.method4913(Static166.aByteArray41)) {
				Static63.aClass47_Sub1Array1 = new Class47_Sub1[Static191.anInt5852];
				local114 = 0;
				for (@Pc(224) int local224 = Static173.anInt4478; local224 <= Static275.anInt5384; local224++) {
					@Pc(230) Class47_Sub1 local230 = Static208.method3703(local224);
					if (local230 != null) {
						Static63.aClass47_Sub1Array1[local114++] = local230;
					}
				}
				Static194.anInt3826 = 0;
				Static217.aClass5_Sub6_1 = null;
				Static95.aClass68_23.method1994();
				Static166.aByteArray41 = null;
				Static333.anInt4627 = 0;
				Static138.anInt2775 = 0;
				Static95.aClass68_23 = null;
				Static237.aLong155 = Static284.method4783();
				return 0;
			} else {
				return Static269.method4546(1002);
			}
		} catch (@Pc(262) IOException local262) {
			return Static269.method4546(1003);
		}
	}
}
