import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_14;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	public static int anInt1679;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Lclient!jd;")
	public static Class36 aClass36_39;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!ke;")
	private static Class39 aClass39_713 = Static2.method66("Enter object name");

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_712 = aClass39_713;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!qd;")
	public static Class54 aClass54_15 = new Class54(30);

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!ke;")
	private static Class39 aClass39_715 = Static2.method66("Error connecting to server)3");

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!ke;")
	public static Class39 aClass39_714 = aClass39_715;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!ke;")
	private static Class39 aClass39_717 = Static2.method66("scroll:");

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_716 = aClass39_717;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!ke;")
	private static Class39 aClass39_718 = Static2.method66("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Lclient!ke;")
	public static Class39 aClass39_719 = Static2.method66("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "Lclient!ke;")
	private static Class39 aClass39_720 = Static2.method66(" million");

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "Lclient!ke;")
	public static Class39 aClass39_721 = aClass39_718;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "Lclient!ke;")
	private static Class39 aClass39_722 = Static2.method66("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "Lclient!ke;")
	public static Class39 aClass39_723 = aClass39_720;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "Lclient!ke;")
	public static Class39 aClass39_724 = Static2.method66("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "Lclient!ke;")
	public static Class39 aClass39_725 = aClass39_722;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1155() {
		Static107.aClass54_27.method1635();
		Static8.aClass54_5.method1635();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BIIII[Lclient!ne;BIILclient!le;)V")
	public static void method1156(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class47[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class43 arg9) {
		@Pc(6) Class2_Sub5 local6 = new Class2_Sub5(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local6.method1258();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local6.method1258();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local6.method1281();
				@Pc(57) int local57 = local27 >> 12;
				@Pc(61) int local61 = local53 >> 2;
				@Pc(65) int local65 = local53 & 0x3;
				if (arg8 == local57 && arg3 <= local49 && local49 < arg3 + 8 && arg0 <= local43 && local43 < arg0 + 8) {
					@Pc(96) Class2_Sub1_Sub5 local96 = Static48.method916(local12);
					@Pc(113) int local113 = arg5 + Static41.method826(local65, local49 & 0x7, local43 & 0x7, arg7, local96.anInt537, local96.anInt528);
					@Pc(130) int local130 = arg2 + Static87.method1643(local65, arg7, local49 & 0x7, local96.anInt537, local43 & 0x7, local96.anInt528);
					if (local113 > 0 && local130 > 0 && local113 < 103 && local130 < 103) {
						@Pc(144) int local144 = arg4;
						if ((Static96.aByteArrayArrayArray8[1][local113][local130] & 0x2) == 2) {
							local144 = arg4 - 1;
						}
						@Pc(160) Class47 local160 = null;
						if (local144 >= 0) {
							local160 = arg6[local144];
						}
						Static51.method1780(local130, arg4, local61, local113, arg9, arg7 + local65 & 0x3, local12, local160);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1158() {
		Static19.aClass54_9.method1635();
		Static50.aClass54_13.method1635();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1160() {
		try {
			@Pc(2) Graphics local2 = Static7.aCanvas1.getGraphics();
			Static60.aClass51_36.method1967(550, 4, local2);
		} catch (@Pc(10) Exception local10) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!tc;I)V")
	public static void method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub2_Sub3_Sub1 arg2) {
		@Pc(7) int local7;
		@Pc(16) int local16;
		@Pc(33) int local33;
		if ((arg1 & 0x4) != 0) {
			local7 = Static51.aClass2_Sub5_Sub1_4.method1247();
			if (local7 == 65535) {
				local7 = -1;
			}
			local16 = Static51.aClass2_Sub5_Sub1_4.method1264();
			if (arg2.anInt2901 == local7 && local7 != -1) {
				local33 = Static69.method1439(local7).anInt80;
				if (local33 == 1) {
					arg2.anInt2937 = local16;
					arg2.anInt2919 = 0;
					arg2.anInt2886 = 0;
					arg2.anInt2928 = 0;
				}
				if (local33 == 2) {
					arg2.anInt2886 = 0;
				}
			} else if (local7 == -1 || arg2.anInt2901 == -1 || Static69.method1439(local7).anInt79 >= Static69.method1439(arg2.anInt2901).anInt79) {
				arg2.anInt2886 = 0;
				arg2.anInt2919 = 0;
				arg2.anInt2937 = local16;
				arg2.anInt2928 = 0;
				arg2.anInt2901 = local7;
				arg2.anInt2932 = arg2.anInt2938;
			}
		}
		if ((arg1 & 0x40) != 0) {
			local7 = Static51.aClass2_Sub5_Sub1_4.method1281();
			local16 = Static51.aClass2_Sub5_Sub1_4.method1289();
			arg2.method2071(local7, local16, Static64.anInt1889);
			arg2.anInt2940 = Static64.anInt1889 + 300;
			arg2.anInt2890 = Static51.aClass2_Sub5_Sub1_4.method1293();
			arg2.anInt2936 = Static51.aClass2_Sub5_Sub1_4.method1281();
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt2904 = Static51.aClass2_Sub5_Sub1_4.method1261();
			local7 = Static51.aClass2_Sub5_Sub1_4.method1276();
			arg2.anInt2924 = 0;
			arg2.anInt2907 = Static64.anInt1889 + (local7 & 0xFFFF);
			arg2.anInt2912 = 0;
			arg2.anInt2934 = local7 >> 16;
			if (arg2.anInt2904 == 65535) {
				arg2.anInt2904 = -1;
			}
			if (Static64.anInt1889 < arg2.anInt2907) {
				arg2.anInt2912 = -1;
			}
		}
		if ((arg1 & 0x10) != 0) {
			local7 = Static51.aClass2_Sub5_Sub1_4.method1281();
			@Pc(195) byte[] local195 = new byte[local7];
			@Pc(200) Class2_Sub5 local200 = new Class2_Sub5(local195);
			Static51.aClass2_Sub5_Sub1_4.method1280(local195, local7);
			Static94.aClass2_Sub5Array1[arg0] = local200;
			arg2.method1847(local200);
		}
		if ((arg1 & 0x20) != 0) {
			arg2.anInt2892 = Static51.aClass2_Sub5_Sub1_4.method1273();
			arg2.anInt2902 = Static51.aClass2_Sub5_Sub1_4.method1261();
		}
		if ((arg1 & 0x80) != 0) {
			arg2.aClass39_1312 = Static51.aClass2_Sub5_Sub1_4.method1250();
			if (arg2.aClass39_1312.method1123(0) == 126) {
				arg2.aClass39_1312 = arg2.aClass39_1312.method1099(1);
				Static87.method1642(arg2.aClass39_1312, 2, arg2.aClass39_1182);
			} else if (arg2 == Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1) {
				Static87.method1642(arg2.aClass39_1312, 2, arg2.aClass39_1182);
			}
			arg2.anInt2913 = 0;
			arg2.anInt2921 = 150;
			arg2.anInt2914 = 0;
		}
		if ((arg1 & 0x2) != 0) {
			arg2.anInt2930 = Static51.aClass2_Sub5_Sub1_4.method1273();
			if (arg2.anInt2930 == 65535) {
				arg2.anInt2930 = -1;
			}
		}
		if ((arg1 & 0x8) != 0) {
			local7 = Static51.aClass2_Sub5_Sub1_4.method1271();
			local16 = Static51.aClass2_Sub5_Sub1_4.method1293();
			local33 = Static51.aClass2_Sub5_Sub1_4.method1281();
			@Pc(333) int local333 = Static51.aClass2_Sub5_Sub1_4.anInt1772;
			if (arg2.aClass39_1182 != null && arg2.aClass35_2 != null) {
				@Pc(344) long local344 = arg2.aClass39_1182.method1090();
				@Pc(346) boolean local346 = false;
				if (local16 <= 1) {
					for (@Pc(353) int local353 = 0; local353 < Static41.anInt1196; local353++) {
						if (Static30.aLongArray3[local353] == local344) {
							local346 = true;
							break;
						}
					}
				}
				if (!local346 && Static49.anInt1373 == 0) {
					Static92.aClass2_Sub5_5.anInt1772 = 0;
					Static51.aClass2_Sub5_Sub1_4.method1277(Static92.aClass2_Sub5_5.aByteArray16, local33);
					Static92.aClass2_Sub5_5.anInt1772 = 0;
					@Pc(401) Class39 local401 = Static20.method429(Static92.aClass2_Sub5_5).method1118();
					arg2.aClass39_1312 = local401.method1103();
					arg2.anInt2914 = local7 >> 8;
					arg2.anInt2921 = 150;
					arg2.anInt2913 = local7 & 0xFF;
					if (local16 == 2 || local16 == 3) {
						Static87.method1642(local401, 1, Static20.method431(new Class39[] { Static18.aClass39_279, arg2.aClass39_1182 }));
					} else if (local16 == 1) {
						Static87.method1642(local401, 1, Static20.method431(new Class39[] { Static46.aClass39_575, arg2.aClass39_1182 }));
					} else {
						Static87.method1642(local401, 2, arg2.aClass39_1182);
					}
				}
			}
			Static51.aClass2_Sub5_Sub1_4.anInt1772 = local333 + local33;
		}
		if ((arg1 & 0x100) != 0) {
			arg2.anInt2917 = Static51.aClass2_Sub5_Sub1_4.method1264();
			arg2.anInt2926 = Static51.aClass2_Sub5_Sub1_4.method1293();
			arg2.anInt2929 = Static51.aClass2_Sub5_Sub1_4.method1289();
			arg2.anInt2918 = Static51.aClass2_Sub5_Sub1_4.method1293();
			arg2.anInt2900 = Static51.aClass2_Sub5_Sub1_4.method1261() + Static64.anInt1889;
			arg2.anInt2941 = Static51.aClass2_Sub5_Sub1_4.method1247() + Static64.anInt1889;
			arg2.anInt2927 = Static51.aClass2_Sub5_Sub1_4.method1281();
			arg2.method2072();
		}
		if ((arg1 & 0x200) == 0) {
			return;
		}
		local7 = Static51.aClass2_Sub5_Sub1_4.method1281();
		local16 = Static51.aClass2_Sub5_Sub1_4.method1281();
		arg2.method2071(local7, local16, Static64.anInt1889);
		arg2.anInt2940 = Static64.anInt1889 + 300;
		arg2.anInt2890 = Static51.aClass2_Sub5_Sub1_4.method1281();
		arg2.anInt2936 = Static51.aClass2_Sub5_Sub1_4.method1289();
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method1162() {
		aClass39_718 = null;
		aBooleanArray11 = null;
		aClass39_712 = null;
		aClass39_717 = null;
		aClass36_39 = null;
		aClass39_715 = null;
		aClass36_Sub1_14 = null;
		aClass39_719 = null;
		aClass39_722 = null;
		aClass39_720 = null;
		aClass39_714 = null;
		aClass39_724 = null;
		aClass39_713 = null;
		aClass39_721 = null;
		aClass39_716 = null;
		aClass39_725 = null;
		aClass54_15 = null;
		aClass39_723 = null;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public static void method1164() {
		Static63.aClass54_19.method1635();
	}
}
