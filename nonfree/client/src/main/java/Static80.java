import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cka", name = "e", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_211 = new Class126(55, 4);

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "[S")
	private static final short[] aShortArray186 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cka", name = "i", descriptor = "[S")
	private static final short[] aShortArray187 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!cka", name = "k", descriptor = "[S")
	private static final short[] aShortArray188 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cka", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray28 = new short[][] { aShortArray187, aShortArray188, aShortArray186 };

	@OriginalMember(owner = "client!cka", name = "j", descriptor = "[I")
	public static final int[] anIntArray666 = new int[500];

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V")
	public static void method8694() {
		Static535.aClass16_10.method8135(Static273.aClass25_3);
		Static535.aClass16_10.DA(Static147.anInt2779, Static67.anInt9116, Static87.anInt1928, Static320.anInt5959);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(BI)V")
	public static void method8699(@OriginalArg(1) int arg0) {
		Static76.anInt1724 = arg0;
		Static81.aClass279_9.method6638();
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(Z)V")
	public static void method8701() {
		Static139.method2419(Static227.aClass3_Sub15_11.aClass17_Sub14_1.method4653());
		@Pc(19) int local19 = (Static417.anInt7047 >> 3) + (Static97.anInt2082 >> 12);
		@Pc(27) int local27 = (Static347.anInt7851 >> 3) + (Static663.anInt10236 >> 12);
		Static576.anInt9136 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142 = 0;
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method2905(8, 8);
		Static442.anIntArray464 = new int[18];
		Static143.aByteArrayArray4 = new byte[18][];
		Static384.anIntArray27 = new int[18];
		Static316.aByteArrayArray16 = new byte[18][];
		Static489.anIntArray535 = new int[18];
		Static192.anIntArrayArray39 = new int[18][4];
		Static663.anIntArray662 = new int[18];
		Static169.aByteArrayArray6 = new byte[18][];
		Static287.aByteArrayArray11 = new byte[18][];
		Static618.aByteArrayArray24 = new byte[18][];
		Static63.anIntArray539 = new int[18];
		Static284.anIntArray343 = new int[18];
		@Pc(83) int local83 = 0;
		@Pc(103) int local103;
		for (@Pc(92) int local92 = (local19 - (Static251.anInt4680 >> 4)) / 8; local92 <= ((Static251.anInt4680 >> 4) + local19) / 8; local92++) {
			for (local103 = (local27 - (Static406.anInt6924 >> 4)) / 8; local103 <= (local27 + (Static406.anInt6924 >> 4)) / 8; local103++) {
				@Pc(112) int local112 = (local92 << 8) + local103;
				Static442.anIntArray464[local83] = local112;
				Static384.anIntArray27[local83] = Static673.aClass143_110.method3131("m" + local92 + "_" + local103);
				Static63.anIntArray539[local83] = Static673.aClass143_110.method3131("l" + local92 + "_" + local103);
				Static284.anIntArray343[local83] = Static673.aClass143_110.method3131("n" + local92 + "_" + local103);
				Static663.anIntArray662[local83] = Static673.aClass143_110.method3131("um" + local92 + "_" + local103);
				Static489.anIntArray535[local83] = Static673.aClass143_110.method3131("ul" + local92 + "_" + local103);
				if (Static284.anIntArray343[local83] == -1) {
					Static384.anIntArray27[local83] = -1;
					Static63.anIntArray539[local83] = -1;
					Static663.anIntArray662[local83] = -1;
					Static489.anIntArray535[local83] = -1;
				}
				local83++;
			}
		}
		for (local103 = local83; local103 < Static284.anIntArray343.length; local103++) {
			Static284.anIntArray343[local103] = -1;
			Static384.anIntArray27[local103] = -1;
			Static63.anIntArray539[local103] = -1;
			Static663.anIntArray662[local103] = -1;
			Static489.anIntArray535[local103] = -1;
		}
		@Pc(284) byte local284;
		if (Static520.anInt6836 == 3) {
			local284 = 4;
		} else {
			local284 = 8;
		}
		Static271.method4330(local284, local19, false, local27);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method8702(@OriginalArg(0) long arg0) {
		Static79.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static79.aCalendar1.get(7);
		@Pc(22) int local22 = Static79.aCalendar1.get(5);
		@Pc(26) int local26 = Static79.aCalendar1.get(2);
		@Pc(30) int local30 = Static79.aCalendar1.get(1);
		@Pc(34) int local34 = Static79.aCalendar1.get(11);
		@Pc(38) int local38 = Static79.aCalendar1.get(12);
		@Pc(42) int local42 = Static79.aCalendar1.get(13);
		return Static92.aStringArray16[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static22.aStringArray7[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
