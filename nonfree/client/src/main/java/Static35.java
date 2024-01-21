import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!pe;")
	public static Class13 aClass13_23;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_859 = Static158.method3034("cyan:");

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_857 = aClass60_859;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[B")
	public static final byte[] aByteArray36 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_858 = aClass60_859;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public static int anInt3071 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method2410() {
		Static183.anIntArray479 = null;
		Static126.anIntArray397 = null;
		Static5.anIntArray10 = null;
		Static107.aByteArrayArrayArray30 = null;
		Static159.aByteArrayArrayArray41 = null;
		Static54.aByteArrayArrayArray19 = null;
		Static119.aByteArrayArrayArray32 = null;
		Static57.anIntArray170 = null;
		Static172.aByteArrayArrayArray39 = null;
		Static148.anIntArray423 = null;
		Static9.anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ob;)V")
	public static void method2412(@OriginalArg(1) Class60 arg0) {
		if (Static65.aClass81_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class60 local13 = Static64.aClass60_483.method2695(Static65.aClass81_1.anApplet1);
			@Pc(19) Class60 local19 = Static147.aClass60_1038.method2695(Static65.aClass81_1.anApplet1);
			@Pc(44) Class60 local44 = Static193.method3536(new Class60[] { local13, Static6.aClass60_66, arg0, Static9.aClass60_84, local19 });
			if (arg0.method2673() == 0) {
				local44 = Static193.method3536(new Class60[] { local44, Static76.aClass60_626 });
			} else {
				local44 = Static193.method3536(new Class60[] { local44, Static194.aClass60_1313, Static174.method3269(Static1.method2() + 94608000000L), Static24.aClass60_181, Static113.method2492(94608000L) });
			}
			Static193.method3536(new Class60[] { Static2.aClass60_1152, local44, Static8.aClass60_73 }).method2671(Static65.aClass81_1.anApplet1);
		} catch (@Pc(125) Throwable local125) {
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!pe;Ljava/awt/Component;Lclient!pe;)V")
	public static void method2414(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class13 arg2) {
		if (Static172.aBoolean166) {
			return;
		}
		Static133.method2116();
		@Pc(15) byte[] local15 = arg2.method521(0, Static158.anInt4006);
		Static97.aClass2_Sub1_Sub7_Sub4_5 = new Class2_Sub1_Sub7_Sub4(local15, arg1);
		Static131.aClass2_Sub1_Sub7_Sub4_2 = Static97.aClass2_Sub1_Sub7_Sub4_5.method2145();
		Static142.aClass2_Sub1_Sub7_Sub2_2 = Static129.method2729(arg0, Static168.anInt4119);
		Static140.aClass2_Sub1_Sub7_Sub2_1 = Static129.method2729(arg0, Static53.anInt1666);
		Static191.aClass2_Sub1_Sub7_Sub2_4 = Static129.method2729(arg0, Static44.anInt1376);
		Static197.aClass2_Sub1_Sub7_Sub2Array10 = Static198.method3582(arg0, Static152.anInt2811);
		Static181.aClass2_Sub1_Sub7_Sub2Array9 = Static198.method3582(arg0, Static182.anInt4404);
		Static78.anIntArray265 = new int[256];
		for (@Pc(56) int local56 = 0; local56 < 64; local56++) {
			Static78.anIntArray265[local56] = local56 * 262144;
		}
		for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
			Static78.anIntArray265[local72 + 64] = local72 * 1024 + 16711680;
		}
		for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
			Static78.anIntArray265[local92 + 128] = local92 * 4 + 16776960;
		}
		for (@Pc(110) int local110 = 0; local110 < 64; local110++) {
			Static78.anIntArray265[local110 + 192] = 16777215;
		}
		Static174.anIntArray462 = new int[256];
		for (@Pc(127) int local127 = 0; local127 < 64; local127++) {
			Static174.anIntArray462[local127] = local127 * 1024;
		}
		for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
			Static174.anIntArray462[local143 + 64] = local143 * 4 + 65280;
		}
		for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
			Static174.anIntArray462[local163 + 128] = local163 * 262144 + 65535;
		}
		for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
			Static174.anIntArray462[local183 + 192] = 16777215;
		}
		Static118.anIntArray374 = new int[256];
		for (@Pc(202) int local202 = 0; local202 < 64; local202++) {
			Static118.anIntArray374[local202] = local202 * 4;
		}
		for (@Pc(218) int local218 = 0; local218 < 64; local218++) {
			Static118.anIntArray374[local218 + 64] = local218 * 262144 + 255;
		}
		for (@Pc(236) int local236 = 0; local236 < 64; local236++) {
			Static118.anIntArray374[local236 + 128] = local236 * 1024 + 16711935;
		}
		for (@Pc(256) int local256 = 0; local256 < 64; local256++) {
			Static118.anIntArray374[local256 + 192] = 16777215;
		}
		Static128.anIntArray401 = new int[32768];
		Static123.anIntArray392 = new int[256];
		Static101.anIntArray335 = new int[32768];
		Static177.method3323(null);
		if (Static14.anInt485 == 0) {
			Static125.aBoolean126 = true;
		} else {
			Static125.aBoolean126 = false;
		}
		Static58.anInt1813 = 0;
		Static95.aClass60_778 = Static95.aClass60_777;
		Static95.aClass60_784 = Static95.aClass60_777;
		Static9.anIntArray28 = new int[32768];
		Static152.anIntArray320 = new int[32768];
		Static80.aBoolean96 = false;
		if (Static125.aBoolean126) {
			Static137.method2788();
		} else {
			Static175.method3276(Static53.anInt1685, Static142.aClass13_Sub1_20, 255);
		}
		Static143.method2896(false);
		Static172.aBoolean166 = true;
		Static97.aClass2_Sub1_Sub7_Sub4_5.method2149(0, 0);
		Static131.aClass2_Sub1_Sub7_Sub4_2.method2149(382, 0);
		Static142.aClass2_Sub1_Sub7_Sub2_2.method1202(382 - Static142.aClass2_Sub1_Sub7_Sub2_2.anInt1596 / 2, 18);
		Static106.aClass2_Sub1_Sub7_Sub4_7 = new Class2_Sub1_Sub7_Sub4(128, 254);
		Static11.aClass2_Sub1_Sub7_Sub4_4 = new Class2_Sub1_Sub7_Sub4(128, 254);
	}
}
