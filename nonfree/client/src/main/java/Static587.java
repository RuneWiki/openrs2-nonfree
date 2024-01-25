import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
	public static int anInt10281;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "Lclient!en;")
	public static final Class87 aClass87_7 = new Class87(0);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!caa;BLclient!nj;)Lclient!cg;")
	public static Class3_Sub9 method8316(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class230 arg1) {
		@Pc(6) Class3_Sub9 local6 = Static228.method3902();
		local6.aClass230_14 = arg1;
		local6.anInt1624 = arg1.anInt7045;
		if (local6.anInt1624 == -1) {
			local6.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(260);
		} else if (local6.anInt1624 == -2) {
			local6.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(10000);
		} else if (local6.anInt1624 <= 18) {
			local6.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(20);
		} else if (local6.anInt1624 > 98) {
			local6.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(260);
		} else {
			local6.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(100);
		}
		local6.aClass3_Sub7_Sub1_1.method1497(arg0);
		local6.aClass3_Sub7_Sub1_1.method1489(local6.aClass230_14.method5858());
		local6.anInt1629 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public static void method8318() {
		Static505.method7608(Static455.aClass3_Sub27_Sub1_1.anInt4802);
		@Pc(17) int local17 = (Static594.anInt10391 >> 12) + (Static230.anInt4667 >> 3);
		@Pc(26) int local26 = (Static496.anInt9269 >> 12) + (Static563.anInt10006 >> 3);
		Static212.anInt4380 = Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 = 0;
		Static443.aClass2_Sub2_Sub1_Sub1_2.method2033(8, 8);
		Static577.anIntArray661 = new int[18];
		Static511.anIntArray616 = new int[18];
		Static256.aByteArrayArray19 = new byte[18][];
		Static177.aByteArrayArray16 = new byte[18][];
		Static349.aByteArrayArray17 = new byte[18][];
		Static558.aByteArrayArray26 = new byte[18][];
		Static261.anIntArrayArray34 = new int[18][4];
		Static422.anIntArray504 = new int[18];
		Static523.aByteArrayArray30 = new byte[18][];
		Static478.anIntArray584 = new int[18];
		Static215.anIntArray376 = new int[18];
		Static537.anIntArray654 = new int[18];
		@Pc(81) int local81 = 0;
		@Pc(101) int local101;
		for (@Pc(90) int local90 = (local17 - (Static460.anInt8640 >> 4)) / 8; local90 <= ((Static460.anInt8640 >> 4) + local17) / 8; local90++) {
			for (local101 = (local26 - (Static292.anInt7682 >> 4)) / 8; local101 <= ((Static292.anInt7682 >> 4) + local26) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local90 << 8);
				Static478.anIntArray584[local81] = local109;
				Static537.anIntArray654[local81] = Static136.aClass254_43.method6414("m" + local90 + "_" + local101);
				Static422.anIntArray504[local81] = Static136.aClass254_43.method6414("l" + local90 + "_" + local101);
				Static511.anIntArray616[local81] = Static136.aClass254_43.method6414("n" + local90 + "_" + local101);
				Static215.anIntArray376[local81] = Static136.aClass254_43.method6414("um" + local90 + "_" + local101);
				Static577.anIntArray661[local81] = Static136.aClass254_43.method6414("ul" + local90 + "_" + local101);
				if (Static511.anIntArray616[local81] == -1) {
					Static537.anIntArray654[local81] = -1;
					Static422.anIntArray504[local81] = -1;
					Static215.anIntArray376[local81] = -1;
					Static577.anIntArray661[local81] = -1;
				}
				local81++;
			}
		}
		for (local101 = local81; local101 < Static511.anIntArray616.length; local101++) {
			Static511.anIntArray616[local101] = -1;
			Static537.anIntArray654[local101] = -1;
			Static422.anIntArray504[local101] = -1;
			Static215.anIntArray376[local101] = -1;
			Static577.anIntArray661[local101] = -1;
		}
		@Pc(284) byte local284;
		if (Static75.anInt1880 == 3) {
			local284 = 4;
		} else {
			local284 = 8;
		}
		Static430.method6817(local284, local17, local26, false);
	}
}
