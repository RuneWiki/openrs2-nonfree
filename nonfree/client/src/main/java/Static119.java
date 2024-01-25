import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray3;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!ni;")
	public static Class223 aClass223_40;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt3026 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method2557() {
		Static290.method4993(Static87.aClass6_Sub33_6.aClass14_Sub17_1.method5999());
		@Pc(19) int local19 = (Static477.anInt8412 >> 3) + (Static184.anInt4048 >> 12);
		@Pc(27) int local27 = (Static259.anInt6990 >> 12) + (Static227.anInt5049 >> 3);
		Static86.anInt10575 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 = 0;
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3639(8, 8);
		Static191.aByteArrayArray7 = new byte[18][];
		Static448.aByteArrayArray24 = new byte[18][];
		Static75.aByteArrayArray1 = new byte[18][];
		Static307.anIntArrayArray24 = new int[18][4];
		Static228.anIntArray215 = new int[18];
		Static199.aByteArrayArray8 = new byte[18][];
		Static440.anIntArray418 = new int[18];
		Static502.anIntArray342 = new int[18];
		Static642.aByteArrayArray37 = new byte[18][];
		Static642.anIntArray572 = new int[18];
		Static296.anIntArray272 = new int[18];
		Static525.anIntArray474 = new int[18];
		@Pc(83) int local83 = 0;
		@Pc(102) int local102;
		for (@Pc(91) int local91 = (local19 - (Static306.anInt6176 >> 4)) / 8; local91 <= ((Static306.anInt6176 >> 4) + local19) / 8; local91++) {
			for (local102 = (local27 - (Static108.anInt2930 >> 4)) / 8; local102 <= ((Static108.anInt2930 >> 4) + local27) / 8; local102++) {
				@Pc(110) int local110 = local102 + (local91 << 8);
				Static228.anIntArray215[local83] = local110;
				Static502.anIntArray342[local83] = Static415.aClass223_90.method5959("m" + local91 + "_" + local102);
				Static440.anIntArray418[local83] = Static415.aClass223_90.method5959("l" + local91 + "_" + local102);
				Static296.anIntArray272[local83] = Static415.aClass223_90.method5959("n" + local91 + "_" + local102);
				Static525.anIntArray474[local83] = Static415.aClass223_90.method5959("um" + local91 + "_" + local102);
				Static642.anIntArray572[local83] = Static415.aClass223_90.method5959("ul" + local91 + "_" + local102);
				if (Static296.anIntArray272[local83] == -1) {
					Static502.anIntArray342[local83] = -1;
					Static440.anIntArray418[local83] = -1;
					Static525.anIntArray474[local83] = -1;
					Static642.anIntArray572[local83] = -1;
				}
				local83++;
			}
		}
		for (local102 = local83; local102 < Static296.anIntArray272.length; local102++) {
			Static296.anIntArray272[local102] = -1;
			Static502.anIntArray342[local102] = -1;
			Static440.anIntArray418[local102] = -1;
			Static525.anIntArray474[local102] = -1;
			Static642.anIntArray572[local102] = -1;
		}
		@Pc(280) byte local280;
		if (Static333.anInt6626 == 3) {
			local280 = 4;
		} else {
			local280 = 8;
		}
		Static441.method6730(local27, false, local19, local280);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
	public static void method2558(@OriginalArg(0) int arg0) {
		if (arg0 == Static333.anInt6626) {
			return;
		}
		if (arg0 == 13) {
			if (Static143.aString27 == null) {
				Static441.method6731(Static613.aString108, Static60.aString69, Static326.anInt6465);
			} else {
				Static209.method3767(Static326.anInt6465);
			}
		}
		if (arg0 != 13 && Static550.aClass41_2 != null) {
			Static550.aClass41_2.method1733();
			Static550.aClass41_2 = null;
		}
		if (arg0 == 3) {
			Static473.method7028(Static30.anInt830 != Static518.anInt9088);
		}
		if (arg0 == 7) {
			Static171.method3226(Static30.anInt830 != Static41.anInt1433);
		}
		if (arg0 == 5) {
			if (Static143.aString27 == null) {
				Static487.method7137(Static613.aString108, Static60.aString69);
			} else {
				Static57.method1715();
			}
		} else if (arg0 == 6) {
			if (Static143.aString27 == null) {
				Static441.method6731(Static613.aString108, Static60.aString69, Static326.anInt6465);
			} else {
				Static209.method3767(Static326.anInt6465);
			}
		} else if (arg0 == 9) {
			if (Static143.aString27 == null) {
				Static441.method6731(Static613.aString108, Static60.aString69, Static326.anInt6465);
			} else {
				Static209.method3767(Static326.anInt6465);
			}
		} else if (arg0 == 12) {
			if (Static143.aString27 == null) {
				Static487.method7137(Static613.aString108, Static60.aString69);
			} else {
				Static57.method1715();
			}
		}
		if (Static365.method5880(Static333.anInt6626)) {
			Static75.aClass223_32.anInt7135 = 2;
			Static395.aClass223_85.anInt7135 = 2;
			Static640.aClass223_144.anInt7135 = 2;
			Static415.aClass223_91.anInt7135 = 2;
			Static376.aClass223_79.anInt7135 = 2;
			Static183.aClass223_139.anInt7135 = 2;
			Static131.aClass223_41.anInt7135 = 2;
		}
		if (Static365.method5880(arg0)) {
			Static493.anInt8604 = 1;
			Static319.anInt6355 = 1;
			Static249.anInt5410 = 0;
			Static276.anInt9806 = 0;
			Static254.anInt5479 = 0;
			Static218.method3848(true);
			Static75.aClass223_32.anInt7135 = 1;
			Static395.aClass223_85.anInt7135 = 1;
			Static640.aClass223_144.anInt7135 = 1;
			Static415.aClass223_91.anInt7135 = 1;
			Static376.aClass223_79.anInt7135 = 1;
			Static183.aClass223_139.anInt7135 = 1;
			Static131.aClass223_41.anInt7135 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static8.method486();
		}
		@Pc(222) boolean local222 = arg0 == 2 || Static268.method4834(arg0) || Static275.method8428(arg0);
		@Pc(239) boolean local239 = Static333.anInt6626 == 2 || Static268.method4834(Static333.anInt6626) || Static275.method8428(Static333.anInt6626);
		if (local222 != local239) {
			if (local222) {
				Static281.anInt5925 = Static167.anInt3749;
				if (Static87.aClass6_Sub33_6.aClass14_Sub22_5.method7288() == 0) {
					Static171.method3227();
				} else {
					Static402.method6324(Static87.aClass6_Sub33_6.aClass14_Sub22_5.method7288(), Static5.aClass223_2, Static167.anInt3749);
					Static414.method6491();
				}
				Static633.aClass152_3.method4604(false);
			} else {
				Static171.method3227();
				Static633.aClass152_3.method4604(true);
			}
		}
		if (Static365.method5880(arg0) || arg0 == 13) {
			Static467.aClass5_13.method6180();
		}
		Static333.anInt6626 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public static void method2560() {
		Static434.method8405();
		Static238.aBoolean425 = false;
	}
}
