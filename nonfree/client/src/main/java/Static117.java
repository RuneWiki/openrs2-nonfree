import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	public static int anInt2629;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3 aClass8_Sub1_Sub3_Sub3_6;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1230 = Static56.method816("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1231 = Static56.method816("p11_full");

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "[I")
	public static int[] anIntArray362 = new int[25];

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "[I")
	public static int[] anIntArray363 = new int[500];

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static int anInt2632 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!dd;BLclient!dd;Ljava/awt/Component;)V")
	public static void method1643(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) Component arg2) {
		if (Static76.aBoolean69) {
			return;
		}
		Static110.method1723();
		@Pc(13) byte[] local13 = arg1.method1166(Static112.aClass34_1184, Static83.aClass34_940);
		Static123.aClass8_Sub1_Sub3_Sub3_7 = new Class8_Sub1_Sub3_Sub3(local13, arg2);
		Static112.aClass8_Sub1_Sub3_Sub3_4 = Static123.aClass8_Sub1_Sub3_Sub3_7.method1581();
		Static77.aClass8_Sub1_Sub3_Sub2_6 = Static87.method1306(Static15.aClass34_209, arg0, Static83.aClass34_940);
		Static61.aClass8_Sub1_Sub3_Sub2_4 = Static87.method1306(Static36.aClass34_495, arg0, Static83.aClass34_940);
		Static75.aClass8_Sub1_Sub3_Sub2_5 = Static87.method1306(Static133.aClass34_1427, arg0, Static83.aClass34_940);
		Static115.aClass8_Sub1_Sub3_Sub2Array8 = Static72.method1070(Static83.aClass34_940, arg0, Static74.aClass34_833);
		Static50.aClass8_Sub1_Sub3_Sub2Array5 = Static72.method1070(Static83.aClass34_940, arg0, Static28.aClass34_386);
		Static24.anIntArray247 = new int[256];
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			Static24.anIntArray247[local61] = local61 * 262144;
		}
		for (@Pc(74) int local74 = 0; local74 < 64; local74++) {
			Static24.anIntArray247[local74 + 64] = local74 * 1024 + 16711680;
		}
		for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
			Static24.anIntArray247[local93 + 128] = local93 * 4 + 16776960;
		}
		for (@Pc(110) int local110 = 0; local110 < 64; local110++) {
			Static24.anIntArray247[local110 + 192] = 16777215;
		}
		Static111.anIntArray400 = new int[256];
		for (@Pc(128) int local128 = 0; local128 < 64; local128++) {
			Static111.anIntArray400[local128] = local128 * 1024;
		}
		for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
			Static111.anIntArray400[local141 + 64] = local141 * 4 + 65280;
		}
		for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
			Static111.anIntArray400[local158 + 128] = local158 * 262144 + 65535;
		}
		for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
			Static111.anIntArray400[local175 + 192] = 16777215;
		}
		Static28.anIntArray104 = new int[256];
		for (@Pc(196) int local196 = 0; local196 < 64; local196++) {
			Static28.anIntArray104[local196] = local196 * 4;
		}
		for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
			Static28.anIntArray104[local209 + 64] = local209 * 262144 + 255;
		}
		for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
			Static28.anIntArray104[local228 + 128] = local228 * 1024 + 16711935;
		}
		for (@Pc(245) int local245 = 0; local245 < 64; local245++) {
			Static28.anIntArray104[local245 + 192] = 16777215;
		}
		Static68.anIntArray209 = new int[32768];
		Static82.anIntArray255 = new int[32768];
		Static130.anIntArray407 = new int[256];
		Static68.method1037(null);
		Static14.anInt359 = 0;
		Static103.anIntArray327 = new int[32768];
		Static83.aClass34_936 = Static83.aClass34_940;
		if (Static47.anInt1277 == 0) {
			Static83.aBoolean79 = true;
		} else {
			Static83.aBoolean79 = false;
		}
		Static83.aClass34_941 = Static83.aClass34_940;
		Static92.anIntArray305 = new int[32768];
		Static115.aBoolean104 = false;
		if (Static83.aBoolean79) {
			Static53.method779();
		} else {
			Static1.method7(Static67.aClass14_Sub1_9, Static83.aClass34_929, Static83.aClass34_940);
		}
		Static47.method734(false);
		Static76.aBoolean69 = true;
		Static123.aClass8_Sub1_Sub3_Sub3_7.method1584(0, 0);
		Static112.aClass8_Sub1_Sub3_Sub3_4.method1584(382, 0);
		Static77.aClass8_Sub1_Sub3_Sub2_6.method300(382 - Static77.aClass8_Sub1_Sub3_Sub2_6.anInt484 / 2, 18);
		Static81.aClass8_Sub1_Sub3_Sub3_3 = new Class8_Sub1_Sub3_Sub3(128, 254);
		aClass8_Sub1_Sub3_Sub3_6 = new Class8_Sub1_Sub3_Sub3(128, 254);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method1644() {
		aClass34_1231 = null;
		aClass8_Sub1_Sub3_Sub3_6 = null;
		anIntArray362 = null;
		aClass34_1230 = null;
		anIntArray363 = null;
	}
}
