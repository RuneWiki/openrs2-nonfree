import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "ub", descriptor = "J")
	public static long aLong5;

	@OriginalMember(owner = "client!aa", name = "wb", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array1;

	@OriginalMember(owner = "client!aa", name = "Vb", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_2;

	@OriginalMember(owner = "client!aa", name = "zb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_64 = Static24.method441("Please reload this page)3");

	@OriginalMember(owner = "client!aa", name = "tb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_63 = aClass65_64;

	@OriginalMember(owner = "client!aa", name = "Rb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_66 = Static24.method441("Your profile will be transferred in:");

	@OriginalMember(owner = "client!aa", name = "Eb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_65 = aClass65_66;

	@OriginalMember(owner = "client!aa", name = "Gb", descriptor = "I")
	public static int anInt109 = 0;

	@OriginalMember(owner = "client!aa", name = "Xb", descriptor = "I")
	public static int anInt120 = 0;

	@OriginalMember(owner = "client!aa", name = "Zb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_67 = Static24.method441("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!aa", name = "ec", descriptor = "I")
	public static int anInt123 = 0;

	@OriginalMember(owner = "client!aa", name = "fc", descriptor = "[I")
	public static int[] anIntArray15 = new int[100];

	@OriginalMember(owner = "client!aa", name = "gc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_68 = Static24.method441("Mitteilung");

	@OriginalMember(owner = "client!aa", name = "ic", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!aa", name = "oc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_69 = Static24.method441("blinken3:");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)I")
	public static int method60(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
	public static void method61() {
		Static104.aClass21_36.method743();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
	public static void method62(@OriginalArg(0) int arg0) {
		Static35.anInt1184 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "(B)V")
	public static void method63() {
		anIntArrayArray1 = null;
		aClass65_69 = null;
		aClass65_65 = null;
		aClass65_64 = null;
		aClass65_63 = null;
		aClass65_68 = null;
		aClass2_Sub1_Sub4_Sub3_2 = null;
		aClass65_66 = null;
		aClass65_67 = null;
		anIntArray15 = null;
		aClass2_Sub1_Sub4_Sub2Array1 = null;
	}

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
	public static void method64() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static37.anIntArray160[local9 + 32512] = 255;
			}
		}
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(59) int local59;
		for (local16 = 0; local16 < 100; local16++) {
			local46 = (int) (Math.random() * 124.0D) + 2;
			local53 = (int) (Math.random() * 128.0D) + 128;
			local59 = (local53 << 7) + local46;
			Static37.anIntArray160[local59] = 192;
		}
		for (local46 = 1; local46 < 255; local46++) {
			for (local53 = 1; local53 < 127; local53++) {
				local59 = (local46 << 7) + local53;
				Static83.anIntArray309[local59] = (Static37.anIntArray160[local59 - 128] + Static37.anIntArray160[local59 + 1] + Static37.anIntArray160[local59 + -1] + Static37.anIntArray160[local59 - -128]) / 4;
			}
		}
		Static52.anInt1574 += 128;
		if (Static77.anIntArray303.length < Static52.anInt1574) {
			Static52.anInt1574 -= Static77.anIntArray303.length;
			local53 = (int) (Math.random() * 12.0D);
			Static96.method1651(Static29.aClass2_Sub1_Sub4_Sub3Array1[local53]);
		}
		@Pc(161) int local161;
		for (local53 = 1; local53 < 255; local53++) {
			for (local59 = 1; local59 < 127; local59++) {
				local161 = local59 + (local53 << 7);
				@Pc(181) int local181 = Static83.anIntArray309[local161 + 128] - Static77.anIntArray303[Static52.anInt1574 + local161 & Static77.anIntArray303.length - 1] / 5;
				if (local181 < 0) {
					local181 = 0;
				}
				Static37.anIntArray160[local161] = local181;
			}
		}
		for (local59 = 0; local59 < 255; local59++) {
			Static25.anIntArray100[local59] = Static25.anIntArray100[local59 + 1];
		}
		Static25.anIntArray100[255] = (int) (Math.sin((double) Static108.anInt2902 / 14.0D) * 16.0D + Math.sin((double) Static108.anInt2902 / 15.0D) * 14.0D + Math.sin((double) Static108.anInt2902 / 16.0D) * 12.0D);
		if (Static29.anInt818 > 0) {
			Static29.anInt818 -= 4;
		}
		if (Static89.anInt2551 > 0) {
			Static89.anInt2551 -= 4;
		}
		if (Static29.anInt818 != 0 || Static89.anInt2551 != 0) {
			return;
		}
		local161 = (int) (Math.random() * 2000.0D);
		if (local161 == 0) {
			Static29.anInt818 = 1024;
		}
		if (local161 == 1) {
			Static89.anInt2551 = 1024;
		}
	}

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V")
	public static void method65() {
		if (Static38.aBoolean74) {
			Static38.aBoolean74 = false;
			Static4.method95();
			Static81.aBoolean158 = true;
			Static22.aBoolean46 = true;
			Static19.aBoolean99 = true;
			Static107.aBoolean156 = true;
		}
		Static12.method262();
		if (Static51.aBoolean83 && Static99.anInt2540 == 1) {
			Static19.aBoolean99 = true;
		}
		@Pc(35) boolean local35;
		if (Static89.anInt2549 != -1) {
			local35 = Static61.method1080(Static89.anInt2549);
			if (local35) {
				Static19.aBoolean99 = true;
			}
		}
		if (Static1.anInt3 == 2) {
			Static19.aBoolean99 = true;
		}
		if (Static40.anInt1296 == 2) {
			Static19.aBoolean99 = true;
		}
		if (Static19.aBoolean99) {
			Static19.aBoolean99 = false;
			Static7.method150();
		}
		@Pc(102) int local102;
		if (Static21.anInt2494 == -1) {
			Static26.aClass2_Sub1_Sub2_29.anInt192 = Static27.anInt776 - Static95.anInt1974 - 77;
			if (Static16.anInt480 > 448 && Static16.anInt480 < 560 && Static85.anInt2459 > 332) {
				Static23.method422(Static16.anInt480 - 17, 0, Static85.anInt2459 - 357, Static27.anInt776, 77, 463, -1, Static26.aClass2_Sub1_Sub2_29);
			}
			local102 = Static27.anInt776 - Static26.aClass2_Sub1_Sub2_29.anInt192 - 77;
			if (local102 < 0) {
				local102 = 0;
			}
			if (local102 > Static27.anInt776 - 77) {
				local102 = Static27.anInt776 - 77;
			}
			if (Static95.anInt1974 != local102) {
				Static95.anInt1974 = local102;
				Static107.aBoolean156 = true;
			}
		}
		if (Static21.anInt2494 == -1 && Static55.anInt1673 == 3) {
			Static26.aClass2_Sub1_Sub2_29.anInt192 = Static15.anInt477;
			local102 = Static82.anInt2368 * 14 + 7;
			if (Static16.anInt480 > 448 && Static16.anInt480 < 560 && Static85.anInt2459 > 332) {
				Static23.method422(Static16.anInt480 - 17, 0, Static85.anInt2459 - 357, local102, 77, 463, -1, Static26.aClass2_Sub1_Sub2_29);
			}
			@Pc(178) int local178 = Static26.aClass2_Sub1_Sub2_29.anInt192;
			if (local178 < 0) {
				local178 = 0;
			}
			if (local102 - 77 < local178) {
				local178 = local102 - 77;
			}
			if (local178 != Static15.anInt477) {
				Static15.anInt477 = local178;
				Static107.aBoolean156 = true;
			}
		}
		if (Static21.anInt2494 != -1) {
			local35 = Static61.method1080(Static21.anInt2494);
			if (local35) {
				Static107.aBoolean156 = true;
			}
		}
		if (Static1.anInt3 == 3) {
			Static107.aBoolean156 = true;
		}
		if (Static40.anInt1296 == 3) {
			Static107.aBoolean156 = true;
		}
		if (Static93.aClass65_1182 != null) {
			Static107.aBoolean156 = true;
		}
		if (Static51.aBoolean83 && Static99.anInt2540 == 2) {
			Static107.aBoolean156 = true;
		}
		if (Static107.aBoolean156) {
			Static107.aBoolean156 = false;
			Static101.method1716();
		}
		Static24.method446();
		if (Static95.anInt1977 != -1) {
			Static22.aBoolean46 = true;
		}
		if (Static22.aBoolean46) {
			if (Static95.anInt1977 != -1 && Static95.anInt1977 == Static37.anInt1223) {
				Static95.anInt1977 = -1;
				Static12.aClass2_Sub8_Sub1_8.method1425(208);
				Static12.aClass2_Sub8_Sub1_8.method1375(Static37.anInt1223);
			}
			Static24.aBoolean49 = true;
			Static22.aBoolean46 = false;
			Static108.method1773(Static108.anInt2902 % 20 < 10 ? -1 : Static95.anInt1977, Static62.anIntArray253, Static89.anInt2549 == -1, Static37.anInt1223);
		}
		if (Static81.aBoolean158) {
			Static81.aBoolean158 = false;
			Static24.aBoolean49 = true;
			Static28.method506(Static103.anInt2811, Static85.anInt2454, Static110.aClass2_Sub1_Sub4_Sub4_3, Static42.anInt1350);
		}
		Static97.method1657(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518, Static28.anInt794, Static62.anInt1879, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562);
		Static28.anInt794 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(JI)V")
	public static void method66(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static93.anInt2629 >= 100) {
			Static36.method742(Static8.aClass65_145, Static35.aClass65_507, 0);
			return;
		}
		@Pc(27) Class65 local27 = Static24.method442(arg0).method1787();
		for (@Pc(29) int local29 = 0; local29 < Static93.anInt2629; local29++) {
			if (arg0 == Static52.aLongArray6[local29]) {
				Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { local27, Static102.aClass65_1259 }), 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static32.anInt1047; local66++) {
			if (arg0 == Static4.aLongArray2[local66]) {
				Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { Static9.aClass65_164, local27, Static56.aClass65_766 }), 0);
				return;
			}
		}
		if (!local27.method1781(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass65_726)) {
			Static52.aLongArray6[Static93.anInt2629++] = arg0;
			Static19.aBoolean99 = true;
			Static12.aClass2_Sub8_Sub1_8.method1425(171);
			Static12.aClass2_Sub8_Sub1_8.method1389(arg0);
		}
	}
}
