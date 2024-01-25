import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
	public static int anInt9480;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "Lclient!aj;")
	public static Class15 aClass15_146;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	public static int anInt9485 = -1;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	public static void method8290() {
		Static628.method8786(Static24.aClass3_Sub22_4.aClass6_Sub8_1.method3663());
		@Pc(19) int local19 = (Static287.anInt4910 >> 3) + (Static509.anInt8222 >> 12);
		@Pc(27) int local27 = (Static652.anInt10382 >> 12) + (Static72.anInt1361 >> 3);
		Static309.anInt5138 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 = 0;
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9113(8, 8);
		Static460.anIntArray648 = new int[18];
		Static597.anIntArrayArray58 = new int[18][4];
		Static585.aByteArrayArray25 = new byte[18][];
		Static654.aByteArrayArray30 = new byte[18][];
		Static77.anIntArray125 = new int[18];
		Static250.anIntArray410 = new int[18];
		Static134.aByteArrayArray10 = new byte[18][];
		Static281.anIntArray439 = new int[18];
		Static73.aByteArrayArray6 = new byte[18][];
		Static635.aByteArrayArray28 = new byte[18][];
		Static647.anIntArray907 = new int[18];
		Static198.anIntArray945 = new int[18];
		@Pc(83) int local83 = 0;
		@Pc(101) int local101;
		for (@Pc(91) int local91 = (local19 - (Static158.anInt927 >> 4)) / 8; local91 <= (local19 + (Static158.anInt927 >> 4)) / 8; local91++) {
			for (local101 = (local27 - (Static515.anInt8292 >> 4)) / 8; local101 <= (local27 + (Static515.anInt8292 >> 4)) / 8; local101++) {
				@Pc(109) int local109 = local101 + (local91 << 8);
				Static77.anIntArray125[local83] = local109;
				Static647.anIntArray907[local83] = aClass15_146.method514("m" + local91 + "_" + local101);
				Static250.anIntArray410[local83] = aClass15_146.method514("l" + local91 + "_" + local101);
				Static460.anIntArray648[local83] = aClass15_146.method514("n" + local91 + "_" + local101);
				Static198.anIntArray945[local83] = aClass15_146.method514("um" + local91 + "_" + local101);
				Static281.anIntArray439[local83] = aClass15_146.method514("ul" + local91 + "_" + local101);
				if (Static460.anIntArray648[local83] == -1) {
					Static647.anIntArray907[local83] = -1;
					Static250.anIntArray410[local83] = -1;
					Static198.anIntArray945[local83] = -1;
					Static281.anIntArray439[local83] = -1;
				}
				local83++;
			}
		}
		for (local101 = local83; local101 < Static460.anIntArray648.length; local101++) {
			Static460.anIntArray648[local101] = -1;
			Static647.anIntArray907[local101] = -1;
			Static250.anIntArray410[local101] = -1;
			Static198.anIntArray945[local101] = -1;
			Static281.anIntArray439[local101] = -1;
		}
		@Pc(277) byte local277;
		if (Static406.anInt6454 == 3) {
			local277 = 4;
		} else {
			local277 = 8;
		}
		Static65.method1331(local19, false, local27, local277);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!ss;)I")
	public static int method8296(@OriginalArg(1) Class326 arg0) {
		if (arg0 == Static523.aClass326_5) {
			return 5890;
		} else if (Static206.aClass326_3 == arg0) {
			return 34167;
		} else if (arg0 == Static348.aClass326_4) {
			return 34168;
		} else if (Static125.aClass326_1 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
