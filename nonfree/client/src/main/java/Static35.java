import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!c;")
	public static Class10 aClass10_13;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "Lclient!ga;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "[J")
	public static long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_352 = Static41.method597("me");

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array5 = new Class60[100];

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[B")
	public static byte[] aByteArray3 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
	public static int[] anIntArray97 = new int[2048];

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
	public static int anInt988 = -1;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_354 = Static41.method597("Stufe)2");

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!od;")
	public static Class60 aClass60_355 = Static41.method597("blinken3:");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public static void method542() {
		aClass10_13 = null;
		aClass25_1 = null;
		aByteArray3 = null;
		aClass60_352 = null;
		aClass60_355 = null;
		aClass60Array5 = null;
		aClass60_354 = null;
		aLongArray4 = null;
		anIntArray97 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLclient!od;)V")
	public static void method543(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(11) Class60 local11 = arg1.method1317().method1322();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static125.anInt2830; local15++) {
			@Pc(23) Class4_Sub3_Sub1_Sub2_Sub1 local23 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static118.anIntArray336[local15]];
			if (local23 != null && local23.aClass60_139 != null && local23.aClass60_139.method1318(local11)) {
				local13 = true;
				Static36.method564(local23.anIntArray135[0], 1, 0, 1, false, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local23.anIntArray137[0], 2);
				if (arg0 == 1) {
					Static14.aClass4_Sub9_Sub1_1.method826(135);
					Static14.aClass4_Sub9_Sub1_1.method786(Static118.anIntArray336[local15]);
				} else if (arg0 == 4) {
					Static14.aClass4_Sub9_Sub1_1.method826(226);
					Static14.aClass4_Sub9_Sub1_1.method786(Static118.anIntArray336[local15]);
				} else if (arg0 == 6) {
					Static14.aClass4_Sub9_Sub1_1.method826(28);
					Static14.aClass4_Sub9_Sub1_1.method796(Static118.anIntArray336[local15]);
				} else if (arg0 == 7) {
					Static14.aClass4_Sub9_Sub1_1.method826(53);
					Static14.aClass4_Sub9_Sub1_1.method803(Static118.anIntArray336[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static90.method1469(0, Static23.aClass60_253, Static12.method1761(new Class60[] { Static42.aClass60_412, local11 }));
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	public static void method544() {
		Static38.aClass12_8.method284();
	}
}
