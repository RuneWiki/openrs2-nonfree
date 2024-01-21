import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 aClass3_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	public static int anInt91 = 0;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "Lclient!fc;")
	public static Class21 aClass21_2 = new Class21(260);

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "Lclient!hb;")
	public static Class27 aClass27_33 = Static87.method1648("Side panel redrawn");

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "Lclient!hb;")
	public static Class27 aClass27_34 = Static87.method1648("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lclient!hb;")
	private static Class27 aClass27_42 = Static87.method1648("Loading textures )2 ");

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "Lclient!hb;")
	public static Class27 aClass27_35 = aClass27_42;

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "Lclient!hb;")
	private static Class27 aClass27_40 = Static87.method1648("World");

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!hb;")
	public static Class27 aClass27_36 = aClass27_40;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "Lclient!hb;")
	private static Class27 aClass27_38 = Static87.method1648("Enter your username (V password)3");

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_37 = aClass27_38;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "Lclient!hb;")
	private static Class27 aClass27_41 = Static87.method1648("Off");

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "Lclient!hb;")
	public static Class27 aClass27_39 = aClass27_41;

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
	public static int anInt95 = 0;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
	public static volatile int anInt96 = -1;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public static void method68() {
		aClass3_Sub3_Sub2_Sub2_1 = null;
		aClass27_33 = null;
		aClass27_34 = null;
		aClass27_40 = null;
		aClass27_42 = null;
		aClass27_36 = null;
		aClass27_38 = null;
		aClass27_41 = null;
		aClass27_35 = null;
		anImage1 = null;
		aClass27_37 = null;
		aClass21_2 = null;
		aClass27_39 = null;
		anIntArray13 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class27 method69(@OriginalArg(1) int arg0) {
		return Static98.method1779(new Class27[] { Static97.method1616(arg0 >> 24 & 0xFF), Static4.aClass27_1329, Static97.method1616(arg0 >> 16 & 0xFF), Static4.aClass27_1329, Static97.method1616(arg0 >> 8 & 0xFF), Static4.aClass27_1329, Static97.method1616(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!td;Lclient!td;ILjava/awt/Component;)V")
	public static void method70(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(3) Component arg2) {
		if (Static99.aBoolean127) {
			return;
		}
		Static8.aClass12_8 = Static8.method182(arg2, 128, 265);
		Static95.method1320();
		Static41.aClass12_32 = Static8.method182(arg2, 128, 265);
		Static95.method1320();
		Static109.aClass12_61 = Static8.method182(arg2, 509, 171);
		Static95.method1320();
		Static73.aClass12_56 = Static8.method182(arg2, 360, 132);
		Static95.method1320();
		Static61.aClass12_47 = Static8.method182(arg2, 360, 200);
		Static95.method1320();
		Static36.aClass12_23 = Static8.method182(arg2, 202, 238);
		Static95.method1320();
		Static39.aClass12_26 = Static8.method182(arg2, 203, 238);
		Static95.method1320();
		Static41.aClass12_33 = Static8.method182(arg2, 74, 94);
		Static95.method1320();
		Static47.aClass12_35 = Static8.method182(arg2, 75, 94);
		Static95.method1320();
		@Pc(77) byte[] local77 = arg1.method1599(Static76.aClass27_1011, Static81.aClass27_1042);
		@Pc(83) Class3_Sub3_Sub2_Sub2 local83 = new Class3_Sub3_Sub2_Sub2(local77, arg2);
		Static8.aClass12_8.method674();
		local83.method796(0, 0);
		Static41.aClass12_32.method674();
		local83.method796(-637, 0);
		Static109.aClass12_61.method674();
		local83.method796(-128, 0);
		Static73.aClass12_56.method674();
		local83.method796(-202, -371);
		Static61.aClass12_47.method674();
		local83.method796(-202, -171);
		Static36.aClass12_23.method674();
		local83.method796(0, -265);
		Static39.aClass12_26.method674();
		local83.method796(-562, -265);
		Static41.aClass12_33.method674();
		local83.method796(-128, -171);
		Static47.aClass12_35.method674();
		local83.method796(-562, -171);
		@Pc(155) int[] local155 = new int[local83.anInt1015];
		@Pc(161) int local161;
		@Pc(188) int local188;
		for (@Pc(157) int local157 = 0; local157 < local83.anInt1014; local157++) {
			for (local161 = 0; local161 < local83.anInt1015; local161++) {
				local155[local161] = local83.anIntArray172[local157 * local83.anInt1015 + local83.anInt1015 - local161 - 1];
			}
			for (local188 = 0; local188 < local83.anInt1015; local188++) {
				local83.anIntArray172[local188 + local83.anInt1015 * local157] = local155[local188];
			}
		}
		Static8.aClass12_8.method674();
		local83.method796(382, 0);
		Static41.aClass12_32.method674();
		local83.method796(-255, 0);
		Static109.aClass12_61.method674();
		local83.method796(254, 0);
		Static73.aClass12_56.method674();
		local83.method796(180, -371);
		Static61.aClass12_47.method674();
		local83.method796(180, -171);
		Static36.aClass12_23.method674();
		local83.method796(382, -265);
		Static39.aClass12_26.method674();
		local83.method796(-180, -265);
		Static41.aClass12_33.method674();
		local83.method796(254, -171);
		Static47.aClass12_35.method674();
		local83.method796(-180, -171);
		local83 = Static28.method623(Static97.aClass27_1082, arg0, Static76.aClass27_1011);
		Static109.aClass12_61.method674();
		local83.method804(382 - local83.anInt1015 / 2 - 128, 18);
		Static13.aClass3_Sub3_Sub2_Sub4_35 = Static98.method1775(Static56.aClass27_712, arg0, Static76.aClass27_1011);
		Static72.aClass3_Sub3_Sub2_Sub4_80 = Static98.method1775(Static12.aClass27_148, arg0, Static76.aClass27_1011);
		Static87.aClass3_Sub3_Sub2_Sub4Array7 = Static85.method1628(Static104.aClass27_1312, arg0, Static76.aClass27_1011);
		Static66.aClass3_Sub3_Sub2_Sub2_5 = new Class3_Sub3_Sub2_Sub2(128, 265);
		Static31.aClass3_Sub3_Sub2_Sub2_2 = new Class3_Sub3_Sub2_Sub2(128, 265);
		for (local161 = 0; local161 < 33920; local161++) {
			Static66.aClass3_Sub3_Sub2_Sub2_5.anIntArray172[local161] = Static8.aClass12_8.anIntArray152[local161];
		}
		for (local188 = 0; local188 < 33920; local188++) {
			Static31.aClass3_Sub3_Sub2_Sub2_2.anIntArray172[local188] = Static41.aClass12_32.anIntArray152[local188];
		}
		Static38.anIntArray164 = new int[256];
		for (@Pc(372) int local372 = 0; local372 < 64; local372++) {
			Static38.anIntArray164[local372] = local372 * 262144;
		}
		for (@Pc(388) int local388 = 0; local388 < 64; local388++) {
			Static38.anIntArray164[local388 + 64] = local388 * 1024 + 16711680;
		}
		for (@Pc(406) int local406 = 0; local406 < 64; local406++) {
			Static38.anIntArray164[local406 + 128] = local406 * 4 + 16776960;
		}
		for (@Pc(427) int local427 = 0; local427 < 64; local427++) {
			Static38.anIntArray164[local427 + 192] = 16777215;
		}
		Static55.anIntArray241 = new int[256];
		for (@Pc(446) int local446 = 0; local446 < 64; local446++) {
			Static55.anIntArray241[local446] = local446 * 1024;
		}
		for (@Pc(460) int local460 = 0; local460 < 64; local460++) {
			Static55.anIntArray241[local460 + 64] = local460 * 4 + 65280;
		}
		for (@Pc(480) int local480 = 0; local480 < 64; local480++) {
			Static55.anIntArray241[local480 + 128] = local480 * 262144 + 65535;
		}
		for (@Pc(498) int local498 = 0; local498 < 64; local498++) {
			Static55.anIntArray241[local498 + 192] = 16777215;
		}
		Static70.anIntArray307 = new int[256];
		for (@Pc(515) int local515 = 0; local515 < 64; local515++) {
			Static70.anIntArray307[local515] = local515 * 4;
		}
		for (@Pc(529) int local529 = 0; local529 < 64; local529++) {
			Static70.anIntArray307[local529 + 64] = local529 * 262144 + 255;
		}
		for (@Pc(549) int local549 = 0; local549 < 64; local549++) {
			Static70.anIntArray307[local549 + 128] = local549 * 1024 + 16711935;
		}
		for (@Pc(569) int local569 = 0; local569 < 64; local569++) {
			Static70.anIntArray307[local569 + 192] = 16777215;
		}
		Static99.anIntArray386 = new int[256];
		Static34.anIntArray154 = new int[32768];
		Static59.anIntArray254 = new int[32768];
		Static37.method695(null);
		Static7.anIntArray39 = new int[32768];
		Static76.aClass27_1010 = Static76.aClass27_1011;
		Static84.anIntArray338 = new int[32768];
		Static65.anInt1672 = 0;
		Static76.aClass27_1008 = Static76.aClass27_1011;
		if (Static71.anInt1874 == 0 || Static70.aBoolean94) {
			Static1.method6();
		} else {
			Static1.method2(Static71.anInt1874, Static89.aClass27_1156, Static80.aClass54_Sub1_38, Static76.aClass27_1011);
		}
		Static42.method896(false);
		Static99.aBoolean127 = true;
		Static89.aBoolean121 = true;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	public static void method71(@OriginalArg(0) int arg0) {
		if (!Static105.method1885()) {
			return;
		}
		if (Static98.aBoolean124) {
			Static78.anInt2171 = arg0;
		} else {
			Static74.method1474(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLclient!td;I)Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 method72(@OriginalArg(0) int arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) int arg2) {
		return Static64.method1189(arg0, arg1, arg2) ? Static108.method1905() : null;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
	public static void method73() {
		Static16.aClass21_13.method663();
		Static28.aClass21_14.method663();
	}
}
