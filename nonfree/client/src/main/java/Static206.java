import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!th;")
	public static Class168 aClass168_150;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "B")
	public static byte aByte17;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!wc;")
	public static Class1_Sub3_Sub24 aClass1_Sub3_Sub24_7;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
	public static int anInt4454;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt4449 = 0;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
	public static int anInt4450 = 0;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public static int anInt4452 = 0;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt4453 = 0;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
	public static int[] anIntArray397 = new int[32];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZ)V")
	public static void method3269(@OriginalArg(1) boolean arg0) {
		Static199.aBoolean418 = arg0;
		@Pc(25) boolean local25;
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(49) int local49;
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(174) int local174;
		@Pc(191) int local191;
		if (!Static199.aBoolean418) {
			local19 = Static140.aClass1_Sub14_Sub1_2.method2238();
			local25 = Static251.method4175(Static140.aClass1_Sub14_Sub1_2.method2229());
			local29 = Static140.aClass1_Sub14_Sub1_2.method2238();
			local33 = Static140.aClass1_Sub14_Sub1_2.method2199();
			local37 = Static140.aClass1_Sub14_Sub1_2.method2238();
			local41 = Static140.aClass1_Sub14_Sub1_2.method2244();
			local49 = (Static188.anInt4164 - Static140.aClass1_Sub14_Sub1_2.anInt3000) / 16;
			Static262.anIntArrayArray66 = new int[local49][4];
			for (local55 = 0; local55 < local49; local55++) {
				for (local64 = 0; local64 < 4; local64++) {
					Static262.anIntArrayArray66[local55][local64] = Static140.aClass1_Sub14_Sub1_2.method2245();
				}
			}
			Static234.anIntArray456 = new int[local49];
			Static1.anIntArray564 = new int[local49];
			Static175.aByteArrayArray2 = null;
			Static230.aByteArrayArray13 = new byte[local49][];
			Static153.anIntArray315 = null;
			Static271.anIntArray488 = new int[local49];
			Static68.anIntArray170 = new int[local49];
			Static72.aByteArrayArray10 = new byte[local49][];
			Static129.aByteArrayArray11 = new byte[local49][];
			@Pc(111) boolean local111 = false;
			Static124.anIntArray275 = new int[local49];
			if ((local29 / 8 == 48 || local29 / 8 == 49) && local41 / 8 == 48) {
				local111 = true;
			}
			Static24.aByteArrayArray4 = new byte[local49][];
			if (local29 / 8 == 48 && local41 / 8 == 148) {
				local111 = true;
			}
			local49 = 0;
			for (local64 = (local29 - 6) / 8; local64 <= (local29 + 6) / 8; local64++) {
				for (local174 = (local41 - 6) / 8; local174 <= (local41 + 6) / 8; local174++) {
					local191 = (local64 << 8) + local174;
					if (local111 && (local174 == 49 || local174 == 149 || local174 == 147 || local64 == 50 || local64 == 49 && local174 == 47)) {
						Static234.anIntArray456[local49] = local191;
						Static271.anIntArray488[local49] = -1;
						Static1.anIntArray564[local49] = -1;
						Static124.anIntArray275[local49] = -1;
						Static68.anIntArray170[local49] = -1;
					} else {
						Static234.anIntArray456[local49] = local191;
						Static271.anIntArray488[local49] = Static124.aClass168_93.method4069("m" + local64 + "_" + local174);
						Static1.anIntArray564[local49] = Static124.aClass168_93.method4069("l" + local64 + "_" + local174);
						Static124.anIntArray275[local49] = Static124.aClass168_93.method4069("um" + local64 + "_" + local174);
						Static68.anIntArray170[local49] = Static124.aClass168_93.method4069("ul" + local64 + "_" + local174);
					}
					local49++;
				}
			}
			Static229.method3621(local33, local19, local25, local29, local41, local37, false);
			return;
		}
		local25 = Static251.method4175(Static140.aClass1_Sub14_Sub1_2.method2227());
		local19 = Static140.aClass1_Sub14_Sub1_2.method2242();
		local29 = Static140.aClass1_Sub14_Sub1_2.method2241();
		local33 = Static140.aClass1_Sub14_Sub1_2.method2244();
		local37 = Static140.aClass1_Sub14_Sub1_2.method2242();
		Static140.aClass1_Sub14_Sub1_2.method2255();
		for (local41 = 0; local41 < 4; local41++) {
			for (local49 = 0; local49 < 13; local49++) {
				for (local55 = 0; local55 < 13; local55++) {
					local64 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
					if (local64 == 1) {
						Static309.anIntArrayArrayArray15[local41][local49][local55] = Static140.aClass1_Sub14_Sub1_2.method2251(26);
					} else {
						Static309.anIntArrayArrayArray15[local41][local49][local55] = -1;
					}
				}
			}
		}
		Static140.aClass1_Sub14_Sub1_2.method2256();
		local41 = (Static188.anInt4164 - Static140.aClass1_Sub14_Sub1_2.anInt3000) / 16;
		Static262.anIntArrayArray66 = new int[local41][4];
		for (local49 = 0; local49 < local41; local49++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static262.anIntArrayArray66[local49][local55] = Static140.aClass1_Sub14_Sub1_2.method2203();
			}
		}
		local49 = Static140.aClass1_Sub14_Sub1_2.method2244();
		Static271.anIntArray488 = new int[local41];
		Static72.aByteArrayArray10 = new byte[local41][];
		Static234.anIntArray456 = new int[local41];
		Static230.aByteArrayArray13 = new byte[local41][];
		Static24.aByteArrayArray4 = new byte[local41][];
		Static175.aByteArrayArray2 = null;
		Static129.aByteArrayArray11 = new byte[local41][];
		Static124.anIntArray275 = new int[local41];
		Static153.anIntArray315 = null;
		Static1.anIntArray564 = new int[local41];
		Static68.anIntArray170 = new int[local41];
		local41 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (local64 = 0; local64 < 13; local64++) {
				for (local174 = 0; local174 < 13; local174++) {
					local191 = Static309.anIntArrayArrayArray15[local55][local64][local174];
					if (local191 != -1) {
						@Pc(543) int local543 = local191 >> 14 & 0x3FF;
						@Pc(549) int local549 = local191 >> 3 & 0x7FF;
						@Pc(560) int local560 = (local543 / 8 << 8) + (local549 / 8);
						@Pc(562) int local562;
						for (local562 = 0; local562 < local41; local562++) {
							if (local560 == Static234.anIntArray456[local562]) {
								local560 = -1;
								break;
							}
						}
						if (local560 != -1) {
							Static234.anIntArray456[local41] = local560;
							local562 = local560 >> 8 & 0xFF;
							@Pc(598) int local598 = local560 & 0xFF;
							Static271.anIntArray488[local41] = Static124.aClass168_93.method4069("m" + local562 + "_" + local598);
							Static1.anIntArray564[local41] = Static124.aClass168_93.method4069("l" + local562 + "_" + local598);
							Static124.anIntArray275[local41] = Static124.aClass168_93.method4069("um" + local562 + "_" + local598);
							Static68.anIntArray170[local41] = Static124.aClass168_93.method4069("ul" + local562 + "_" + local598);
							local41++;
						}
					}
				}
			}
		}
		Static229.method3621(local29, local33, local25, local19, local37, local49, false);
	}
}
