import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	public static int anInt2727;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_18;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_814 = Static129.method2060("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_812 = aClass61_814;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!r;")
	private static Class61 aClass61_813 = Static129.method2060("Sorry invited players only)3");

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!r;")
	private static Class61 aClass61_816 = Static129.method2060("Unable to connect)3");

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_815 = aClass61_816;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_817 = Static129.method2060("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!r;")
	public static Class61 aClass61_818 = aClass61_816;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_819 = Static129.method2060("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_820 = Static129.method2060("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!r;")
	public static Class61 aClass61_821 = aClass61_813;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!r;")
	public static Class61 aClass61_822 = Static129.method2060("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!ff;Lclient!ff;Z)Lclient!kc;")
	public static Class5_Sub2_Sub10 method1759(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class26 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1040(arg0);
		for (@Pc(19) int local19 = 0; local19 < local12.length; local19++) {
			@Pc(29) byte[] local29 = arg1.method1046(arg0, local12[local19]);
			if (local29 == null) {
				local7 = false;
			} else {
				@Pc(49) int local49 = (local29[0] & 0xFF) << 8 | local29[1] & 0xFF;
				@Pc(65) byte[] local65 = arg2.method1046(local49, 0);
				if (local65 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class5_Sub2_Sub10(arg1, arg2, arg0, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method1760() {
		for (@Pc(11) int local11 = 0; local11 < Static83.anInt2281; local11++) {
			@Pc(17) int local17 = Static132.anIntArray445[local11];
			@Pc(21) Class5_Sub2_Sub2_Sub3_Sub1 local21 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local17];
			@Pc(25) int local25 = Static47.aClass5_Sub14_Sub1_2.method1471();
			if ((local25 & 0x2) != 0) {
				local21.anInt2890 = Static47.aClass5_Sub14_Sub1_2.method1459();
				if (local21.anInt2890 == 65535) {
					local21.anInt2890 = -1;
				}
			}
			if ((local25 & 0x40) != 0) {
				local21.aClass61_869 = Static47.aClass5_Sub14_Sub1_2.method1450();
				local21.anInt2924 = 100;
			}
			@Pc(70) int local70;
			@Pc(74) int local74;
			if ((local25 & 0x8) != 0) {
				local70 = Static47.aClass5_Sub14_Sub1_2.method1429();
				local74 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local21.method1854(local70, Static58.anInt1422, local74);
				local21.anInt2927 = Static58.anInt1422 + 300;
				local21.anInt2901 = Static47.aClass5_Sub14_Sub1_2.method1443();
				local21.anInt2886 = Static47.aClass5_Sub14_Sub1_2.method1443();
			}
			if ((local25 & 0x1) != 0) {
				local21.anInt2893 = Static47.aClass5_Sub14_Sub1_2.method1478();
				local70 = Static47.aClass5_Sub14_Sub1_2.method1474();
				local21.anInt2932 = 0;
				local21.anInt2902 = (local70 & 0xFFFF) + Static58.anInt1422;
				if (local21.anInt2893 == 65535) {
					local21.anInt2893 = -1;
				}
				local21.anInt2896 = 0;
				if (Static58.anInt1422 < local21.anInt2902) {
					local21.anInt2932 = -1;
				}
				local21.anInt2921 = local70 >> 16;
			}
			if ((local25 & 0x80) != 0) {
				local70 = Static47.aClass5_Sub14_Sub1_2.method1429();
				local74 = Static47.aClass5_Sub14_Sub1_2.method1463();
				local21.method1854(local70, Static58.anInt1422, local74);
				local21.anInt2927 = Static58.anInt1422 + 300;
				local21.anInt2901 = Static47.aClass5_Sub14_Sub1_2.method1443();
				local21.anInt2886 = Static47.aClass5_Sub14_Sub1_2.method1463();
			}
			if ((local25 & 0x4) != 0) {
				local21.aClass5_Sub2_Sub12_1 = Static29.method626(Static47.aClass5_Sub14_Sub1_2.method1437());
				local21.anInt2892 = local21.aClass5_Sub2_Sub12_1.anInt2511;
				local21.anInt2878 = local21.aClass5_Sub2_Sub12_1.anInt2506;
				local21.anInt2888 = local21.aClass5_Sub2_Sub12_1.anInt2510;
				local21.anInt2913 = local21.aClass5_Sub2_Sub12_1.anInt2504;
				local21.anInt2918 = local21.aClass5_Sub2_Sub12_1.anInt2498;
				local21.anInt2914 = local21.aClass5_Sub2_Sub12_1.anInt2493;
				local21.anInt2915 = local21.aClass5_Sub2_Sub12_1.anInt2494;
				local21.anInt2877 = local21.aClass5_Sub2_Sub12_1.anInt2508;
				local21.anInt2917 = local21.aClass5_Sub2_Sub12_1.anInt2492;
			}
			if ((local25 & 0x20) != 0) {
				local70 = Static47.aClass5_Sub14_Sub1_2.method1472();
				local74 = Static47.aClass5_Sub14_Sub1_2.method1443();
				if (local70 == 65535) {
					local70 = -1;
				}
				if (local70 == local21.anInt2903 && local70 != -1) {
					@Pc(312) int local312 = Static106.method1769(local70).anInt3243;
					if (local312 == 1) {
						local21.anInt2926 = 0;
						local21.anInt2904 = local74;
						local21.anInt2880 = 0;
						local21.anInt2897 = 0;
					}
					if (local312 == 2) {
						local21.anInt2897 = 0;
					}
				} else if (local70 == -1 || local21.anInt2903 == -1 || Static106.method1769(local70).anInt3246 >= Static106.method1769(local21.anInt2903).anInt3246) {
					local21.anInt2904 = local74;
					local21.anInt2926 = 0;
					local21.anInt2876 = local21.anInt2885;
					local21.anInt2903 = local70;
					local21.anInt2897 = 0;
					local21.anInt2880 = 0;
				}
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt2930 = Static47.aClass5_Sub14_Sub1_2.method1437();
				local21.anInt2923 = Static47.aClass5_Sub14_Sub1_2.method1478();
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I")
	public static int method1762() {
		@Pc(3) int local3 = 3;
		if (Static78.anInt1985 < 310) {
			@Pc(12) int local12 = Static40.anInt1074 >> 7;
			@Pc(16) int local16 = Static22.anInt683 >> 7;
			if ((Static30.aByteArrayArrayArray2[Static93.anInt2428][local16][local12] & 0x4) != 0) {
				local3 = Static93.anInt2428;
			}
			@Pc(33) int local33 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 >> 7;
			@Pc(38) int local38 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 >> 7;
			@Pc(46) int local46;
			if (local38 > local12) {
				local46 = local38 - local12;
			} else {
				local46 = local12 - local38;
			}
			@Pc(61) int local61;
			if (local33 > local16) {
				local61 = local33 - local16;
			} else {
				local61 = local16 - local33;
			}
			@Pc(80) int local80;
			@Pc(82) int local82;
			if (local46 >= local61) {
				local80 = local61 * 65536 / local46;
				local82 = 32768;
				while (local12 != local38) {
					local82 += local80;
					if (local12 < local38) {
						local12++;
					} else if (local12 > local38) {
						local12--;
					}
					if ((Static30.aByteArrayArrayArray2[Static93.anInt2428][local16][local12] & 0x4) != 0) {
						local3 = Static93.anInt2428;
					}
					if (local82 >= 65536) {
						local82 -= 65536;
						if (local16 < local33) {
							local16++;
						} else if (local33 < local16) {
							local16--;
						}
						if ((Static30.aByteArrayArrayArray2[Static93.anInt2428][local16][local12] & 0x4) != 0) {
							local3 = Static93.anInt2428;
						}
					}
				}
			} else {
				local80 = local46 * 65536 / local61;
				local82 = 32768;
				while (local16 != local33) {
					if (local16 < local33) {
						local16++;
					} else if (local16 > local33) {
						local16--;
					}
					if ((Static30.aByteArrayArrayArray2[Static93.anInt2428][local16][local12] & 0x4) != 0) {
						local3 = Static93.anInt2428;
					}
					local82 += local80;
					if (local82 >= 65536) {
						if (local38 > local12) {
							local12++;
						} else if (local12 > local38) {
							local12--;
						}
						local82 -= 65536;
						if ((Static30.aByteArrayArrayArray2[Static93.anInt2428][local16][local12] & 0x4) != 0) {
							local3 = Static93.anInt2428;
						}
					}
				}
			}
		}
		if ((Static30.aByteArrayArrayArray2[Static93.anInt2428][Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 >> 7][Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 >> 7] & 0x4) != 0) {
			local3 = Static93.anInt2428;
		}
		return local3;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public static void method1764() {
		aClass61_817 = null;
		aClass61_818 = null;
		aClass61_813 = null;
		aClass61_821 = null;
		aClass61_820 = null;
		aClass61_815 = null;
		aClass26_Sub1_18 = null;
		aClass61_814 = null;
		aClass61_816 = null;
		aClass61_819 = null;
		aClass61_812 = null;
		aClass61_822 = null;
	}
}
