import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!td", name = "D", descriptor = "Lclient!ff;")
	public static Class26 aClass26_30;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "Lclient!ke;")
	public static Class5_Sub11 aClass5_Sub11_13;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	public static int anInt2988;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "Lclient!bc;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array9;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!r;")
	public static Class61 aClass61_904 = Static129.method2060("swe");

	@OriginalMember(owner = "client!td", name = "C", descriptor = "Lclient!r;")
	private static Class61 aClass61_905 = Static129.method2060("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Lclient!r;")
	private static Class61 aClass61_906 = Static129.method2060("No response from server)3");

	@OriginalMember(owner = "client!td", name = "L", descriptor = "Lclient!r;")
	public static Class61 aClass61_907 = aClass61_905;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "[B")
	public static byte[] aByteArray39 = new byte[520];

	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	public static int anInt2985 = 1;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "Lclient!ge;")
	public static Class29 aClass29_25 = new Class29(128);

	@OriginalMember(owner = "client!td", name = "T", descriptor = "Lclient!r;")
	public static Class61 aClass61_909 = aClass61_906;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Lclient!r;")
	public static Class61 aClass61_910 = Static129.method2060("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!td", name = "X", descriptor = "[I")
	public static int[] anIntArray353 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_911 = Static129.method2060(" loggt sich aus)3");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!t;II)V")
	public static void method1880(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub2_Sub3_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		if ((arg2 & 0x40) != 0) {
			local9 = Static47.aClass5_Sub14_Sub1_2.method1443();
			local13 = Static47.aClass5_Sub14_Sub1_2.method1429();
			arg1.method1854(local9, Static58.anInt1422, local13);
			arg1.anInt2927 = Static58.anInt1422 + 300;
			arg1.anInt2901 = Static47.aClass5_Sub14_Sub1_2.method1443();
			arg1.anInt2886 = Static47.aClass5_Sub14_Sub1_2.method1429();
		}
		if ((arg2 & 0x20) != 0) {
			local9 = Static47.aClass5_Sub14_Sub1_2.method1437();
			local13 = Static47.aClass5_Sub14_Sub1_2.method1443();
			@Pc(55) int local55 = Static47.aClass5_Sub14_Sub1_2.method1471();
			@Pc(58) int local58 = Static47.aClass5_Sub14_Sub1_2.anInt2199;
			if (arg1.aClass61_877 != null && arg1.aClass37_2 != null) {
				@Pc(66) boolean local66 = false;
				@Pc(71) long local71 = arg1.aClass61_877.method1723();
				if (local13 <= 1) {
					for (@Pc(76) int local76 = 0; local76 < Static114.anInt2962; local76++) {
						if (local71 == Static68.aLongArray3[local76]) {
							local66 = true;
							break;
						}
					}
				}
				if (!local66 && Static8.anInt187 == 0) {
					Static90.aClass5_Sub14_5.anInt2199 = 0;
					Static47.aClass5_Sub14_Sub1_2.method1467(local55, Static90.aClass5_Sub14_5.aByteArray33);
					Static90.aClass5_Sub14_5.anInt2199 = 0;
					@Pc(118) Class61 local118 = Static7.method570(Static43.method760(Static90.aClass5_Sub14_5).method1737());
					arg1.aClass61_869 = local118.method1716();
					arg1.anInt2924 = 150;
					arg1.anInt2898 = local9 >> 8;
					arg1.anInt2922 = local9 & 0xFF;
					if (local13 == 2 || local13 == 3) {
						Static91.method1596(Static123.method1929(new Class61[] { Static73.aClass61_538, arg1.aClass61_877 }), local118, 1);
					} else if (local13 == 1) {
						Static91.method1596(Static123.method1929(new Class61[] { Static120.aClass61_949, arg1.aClass61_877 }), local118, 1);
					} else {
						Static91.method1596(arg1.aClass61_877, local118, 2);
					}
				}
			}
			Static47.aClass5_Sub14_Sub1_2.anInt2199 = local58 + local55;
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt2893 = Static47.aClass5_Sub14_Sub1_2.method1437();
			local9 = Static47.aClass5_Sub14_Sub1_2.method1474();
			arg1.anInt2902 = (local9 & 0xFFFF) + Static58.anInt1422;
			if (arg1.anInt2893 == 65535) {
				arg1.anInt2893 = -1;
			}
			arg1.anInt2921 = local9 >> 16;
			arg1.anInt2896 = 0;
			arg1.anInt2932 = 0;
			if (arg1.anInt2902 > Static58.anInt1422) {
				arg1.anInt2932 = -1;
			}
		}
		if ((arg2 & 0x400) != 0) {
			local9 = Static47.aClass5_Sub14_Sub1_2.method1463();
			local13 = Static47.aClass5_Sub14_Sub1_2.method1443();
			arg1.method1854(local9, Static58.anInt1422, local13);
			arg1.anInt2927 = Static58.anInt1422 + 300;
			arg1.anInt2901 = Static47.aClass5_Sub14_Sub1_2.method1429();
			arg1.anInt2886 = Static47.aClass5_Sub14_Sub1_2.method1463();
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt2890 = Static47.aClass5_Sub14_Sub1_2.method1437();
			if (arg1.anInt2890 == 65535) {
				arg1.anInt2890 = -1;
			}
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt2887 = Static47.aClass5_Sub14_Sub1_2.method1429();
			arg1.anInt2891 = Static47.aClass5_Sub14_Sub1_2.method1471();
			arg1.anInt2881 = Static47.aClass5_Sub14_Sub1_2.method1429();
			arg1.anInt2883 = Static47.aClass5_Sub14_Sub1_2.method1429();
			arg1.anInt2911 = Static47.aClass5_Sub14_Sub1_2.method1478() + Static58.anInt1422;
			arg1.anInt2905 = Static47.aClass5_Sub14_Sub1_2.method1472() + Static58.anInt1422;
			arg1.anInt2925 = Static47.aClass5_Sub14_Sub1_2.method1471();
			arg1.anInt2876 = 0;
			arg1.anInt2885 = 1;
		}
		if ((arg2 & 0x1) != 0) {
			arg1.aClass61_869 = Static47.aClass5_Sub14_Sub1_2.method1450();
			if (arg1.aClass61_869.method1714(0) == 126) {
				arg1.aClass61_869 = arg1.aClass61_869.method1724(1);
				Static91.method1596(arg1.aClass61_877, arg1.aClass61_869, 2);
			} else if (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10 == arg1) {
				Static91.method1596(arg1.aClass61_877, arg1.aClass61_869, 2);
			}
			arg1.anInt2922 = 0;
			arg1.anInt2924 = 150;
			arg1.anInt2898 = 0;
		}
		if ((arg2 & 0x80) != 0) {
			local9 = Static47.aClass5_Sub14_Sub1_2.method1472();
			if (local9 == 65535) {
				local9 = -1;
			}
			local13 = Static47.aClass5_Sub14_Sub1_2.method1443();
			Static29.method623(local9, arg1, local13);
		}
		if ((arg2 & 0x10) != 0) {
			local9 = Static47.aClass5_Sub14_Sub1_2.method1471();
			@Pc(459) byte[] local459 = new byte[local9];
			@Pc(464) Class5_Sub14 local464 = new Class5_Sub14(local459);
			Static47.aClass5_Sub14_Sub1_2.method1436(local459, local9);
			Static40.aClass5_Sub14Array1[arg0] = local464;
			arg1.method1866(local464);
		}
		if ((arg2 & 0x8) != 0) {
			arg1.anInt2930 = Static47.aClass5_Sub14_Sub1_2.method1459();
			arg1.anInt2923 = Static47.aClass5_Sub14_Sub1_2.method1478();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ff;I)V")
	public static void method1881(@OriginalArg(0) Class26 arg0) {
		Static109.aClass26_29 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!jf;IILclient!jc;)V")
	public static void method1882(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(3) Class5_Sub9 local3 = new Class5_Sub9();
		local3.anInt946 = 1;
		local3.aLong100 = arg1;
		local3.aClass40_1 = arg2;
		local3.aClass26_Sub1_5 = arg0;
		@Pc(22) Class58 local22 = Static55.aClass58_30;
		synchronized (Static55.aClass58_30) {
			Static55.aClass58_30.method1663(local3);
		}
		Static86.method1534();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1883() {
		aClass5_Sub2_Sub1_Sub4Array9 = null;
		aClass29_25 = null;
		aClass61_909 = null;
		aClass61_907 = null;
		aByteArray39 = null;
		aClass61_905 = null;
		aClass61_906 = null;
		aClass61_910 = null;
		aClass61_911 = null;
		anIntArray353 = null;
		aClass5_Sub11_13 = null;
		aClass9_1 = null;
		aClass61_904 = null;
		aClass26_30 = null;
	}
}
