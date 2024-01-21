import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ib", name = "Pc", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!ib", name = "Xc", descriptor = "Lclient!he;")
	public static Class11 aClass11_30;

	@OriginalMember(owner = "client!ib", name = "yc", descriptor = "Lclient!i;")
	public static Class29 aClass29_31 = new Class29(30);

	@OriginalMember(owner = "client!ib", name = "Bc", descriptor = "Lclient!va;")
	private static Class61 aClass61_480 = Static88.method1421("slide:");

	@OriginalMember(owner = "client!ib", name = "Lc", descriptor = "Lclient!va;")
	public static Class61 aClass61_481 = aClass61_480;

	@OriginalMember(owner = "client!ib", name = "Mc", descriptor = "Lclient!va;")
	public static Class61 aClass61_482 = Static88.method1421("sideicons");

	@OriginalMember(owner = "client!ib", name = "Nc", descriptor = "I")
	public static int anInt1194 = 78;

	@OriginalMember(owner = "client!ib", name = "Oc", descriptor = "Lclient!va;")
	private static Class61 aClass61_483 = Static88.method1421("red:");

	@OriginalMember(owner = "client!ib", name = "Rc", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!ib", name = "Sc", descriptor = "Lclient!va;")
	private static Class61 aClass61_484 = Static88.method1421("wave:");

	@OriginalMember(owner = "client!ib", name = "Tc", descriptor = "Lclient!va;")
	public static Class61 aClass61_485 = aClass61_483;

	@OriginalMember(owner = "client!ib", name = "Uc", descriptor = "Lclient!bb;")
	public static Class9 aClass9_5 = new Class9();

	@OriginalMember(owner = "client!ib", name = "Vc", descriptor = "Lclient!va;")
	public static Class61 aClass61_486 = aClass61_484;

	@OriginalMember(owner = "client!ib", name = "Zc", descriptor = "Lclient!va;")
	private static Class61 aClass61_489 = Static88.method1421("Password: ");

	@OriginalMember(owner = "client!ib", name = "Wc", descriptor = "Lclient!va;")
	public static Class61 aClass61_487 = aClass61_489;

	@OriginalMember(owner = "client!ib", name = "Yc", descriptor = "Lclient!va;")
	public static Class61 aClass61_488 = Static88.method1421("mapfunction");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Z")
	public static boolean method680(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(B)V")
	public static void method681() {
		Static85.aBoolean100 = false;
		Static31.aBoolean43 = false;
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(B)V")
	public static void method682() {
		Static15.anInt449 = 0;
		Static76.anInt2030 = 0;
		Static106.method1672();
		Static71.method1019();
		Static37.method617();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static15.anInt449; local19++) {
			local25 = Static93.anIntArray232[local19];
			if (Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local25].anInt1631 != Static95.anInt2442) {
				Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local25].aClass10_Sub1_Sub3_1 = null;
				Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local25] = null;
			}
		}
		if (Static5.anInt34 != Static55.aClass10_Sub10_Sub1_4.anInt1957) {
			throw new RuntimeException("gnp1 pos:" + Static55.aClass10_Sub10_Sub1_4.anInt1957 + " psize:" + Static5.anInt34);
		}
		for (local25 = 0; local25 < Static34.anInt1005; local25++) {
			if (Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[Static1.anIntArray3[local25]] == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static34.anInt1005);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(B)V")
	public static void method683() {
		aClass61_483 = null;
		aClass61_487 = null;
		aClass61_485 = null;
		anIntArray129 = null;
		aClass11_30 = null;
		aClass61_488 = null;
		aClass61_484 = null;
		aClass61_480 = null;
		aClass9_5 = null;
		aClass29_31 = null;
		aClass61_489 = null;
		aClass61_481 = null;
		aClass61_482 = null;
		aClass61_486 = null;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(IIII)I")
	public static int method684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg1;
		return (arg1 * (arg2 & 0xFF00FF) + (arg0 & 0xFF00FF) * local13 & 0xFF00FF00) + ((arg0 & 0xFF00) * local13 + arg1 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!tc;Lclient!s;)V")
	public static void method685(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub10 arg1, @OriginalArg(3) Class55 arg2) {
		if (Static38.aBoolean50) {
			return;
		}
		@Pc(20) Class10_Sub7 local20 = new Class10_Sub7();
		local20.anInt1207 = arg1.method1111();
		local20.anInt1209 = arg1.method1112();
		local20.anIntArray131 = new int[local20.anInt1207];
		local20.anIntArray132 = new int[local20.anInt1207];
		local20.aClass19Array2 = new Class19[local20.anInt1207];
		local20.aByteArrayArrayArray8 = new byte[local20.anInt1207][][];
		local20.aClass19Array1 = new Class19[local20.anInt1207];
		local20.anIntArray133 = new int[local20.anInt1207];
		for (@Pc(62) int local62 = 0; local62 < local20.anInt1207; local62++) {
			try {
				@Pc(68) int local68 = arg1.method1111();
				@Pc(96) String local96;
				@Pc(105) String local105;
				@Pc(109) int local109;
				if (local68 == 0 || local68 == 1 || local68 == 2) {
					local96 = new String(arg1.method1151().method1614());
					local105 = new String(arg1.method1151().method1614());
					local109 = 0;
					if (local68 == 1) {
						local109 = arg1.method1112();
					}
					local20.anIntArray131[local62] = local68;
					local20.anIntArray133[local62] = local109;
					local20.aClass19Array2[local62] = arg2.method1397(local105, Static6.method68(local96));
				} else if (local68 == 3 || local68 == 4) {
					local96 = new String(arg1.method1151().method1614());
					local105 = new String(arg1.method1151().method1614());
					local109 = arg1.method1111();
					@Pc(112) String[] local112 = new String[local109];
					for (@Pc(114) int local114 = 0; local114 < local109; local114++) {
						local112[local114] = new String(arg1.method1151().method1614());
					}
					@Pc(138) byte[][] local138 = new byte[local109][];
					@Pc(151) int local151;
					if (local68 == 3) {
						for (@Pc(145) int local145 = 0; local145 < local109; local145++) {
							local151 = arg1.method1112();
							local138[local145] = new byte[local151];
							arg1.method1118(local151, local138[local145]);
						}
					}
					local20.anIntArray131[local62] = local68;
					@Pc(180) Class[] local180 = new Class[local109];
					for (local151 = 0; local151 < local109; local151++) {
						local180[local151] = Static6.method68(local112[local151]);
					}
					local20.aClass19Array1[local62] = arg2.method1399(local180, local105, Static6.method68(local96));
					local20.aByteArrayArrayArray8[local62] = local138;
				}
			} catch (@Pc(271) ClassNotFoundException local271) {
				local20.anIntArray132[local62] = -1;
			} catch (@Pc(278) SecurityException local278) {
				local20.anIntArray132[local62] = -2;
			} catch (@Pc(285) NullPointerException local285) {
				local20.anIntArray132[local62] = -3;
			} catch (@Pc(292) Exception local292) {
				local20.anIntArray132[local62] = -4;
			} catch (@Pc(299) Throwable local299) {
				local20.anIntArray132[local62] = -5;
			}
		}
		Static75.aClass9_7.method79(local20);
	}

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
	public static void method686() {
		if (Static1.anInt2 != 0 || Static19.anInt630 != 1) {
			return;
		}
		@Pc(20) int local20 = Static67.anInt1776 - 5 - 4;
		@Pc(26) int local26 = Static12.anInt333 - 25 - 550;
		if (local26 < 0 || local20 < 0 || local26 >= 146 || local20 >= 151) {
			return;
		}
		local20 -= 75;
		local26 -= 73;
		@Pc(49) int local49 = Static79.anInt2144 + Static57.anInt1509 & 0x7FF;
		@Pc(53) int local53 = Class10_Sub1_Sub1_Sub3.anIntArray201[local49];
		@Pc(61) int local61 = local53 * (Static25.anInt776 + 256) >> 8;
		@Pc(65) int local65 = Class10_Sub1_Sub1_Sub3.anIntArray203[local49];
		@Pc(73) int local73 = (Static25.anInt776 + 256) * local65 >> 8;
		@Pc(83) int local83 = local73 * local20 - local61 * local26 >> 11;
		@Pc(93) int local93 = local61 * local20 + local26 * local73 >> 11;
		@Pc(100) int local100 = local93 + Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 >> 7;
		@Pc(108) int local108 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 - local83 >> 7;
		@Pc(128) boolean local128 = Static95.method1509(true, local108, 0, 0, 1, 0, 0, local100, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
		if (!local128) {
			return;
		}
		Static50.aClass10_Sub10_Sub1_3.method1126(local26);
		Static50.aClass10_Sub10_Sub1_3.method1126(local20);
		Static50.aClass10_Sub10_Sub1_3.method1152(Static79.anInt2144);
		Static50.aClass10_Sub10_Sub1_3.method1126(57);
		Static50.aClass10_Sub10_Sub1_3.method1126(Static57.anInt1509);
		Static50.aClass10_Sub10_Sub1_3.method1126(Static25.anInt776);
		Static50.aClass10_Sub10_Sub1_3.method1126(89);
		Static50.aClass10_Sub10_Sub1_3.method1152(Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654);
		Static50.aClass10_Sub10_Sub1_3.method1152(Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649);
		Static50.aClass10_Sub10_Sub1_3.method1126(Static18.anInt613);
		Static50.aClass10_Sub10_Sub1_3.method1126(63);
		return;
	}
}
