import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ce", name = "gb", descriptor = "[Lclient!id;")
	public static Class1_Sub13[] aClass1_Sub13Array1;

	@OriginalMember(owner = "client!ce", name = "qb", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ce", name = "vb", descriptor = "I")
	public static int anInt775 = 0;

	@OriginalMember(owner = "client!ce", name = "Db", descriptor = "I")
	public static int anInt783 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)I")
	public static int method471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub15 local10 = (Class1_Sub15) Static145.aClass99_11.method3292((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local10.anIntArray270.length; local29++) {
				if (local10.anIntArray269[local29] == arg1) {
					local27 += local10.anIntArray270[local29];
				}
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)V")
	public static void method472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static101.anInt2533 < 2 && Static145.anInt3438 == 0 && !Static138.aBoolean138) {
			return;
		}
		@Pc(42) Class65 local42;
		if (Static145.anInt3438 == 1 && Static101.anInt2533 < 2) {
			local42 = Static109.method2004(new Class65[] { Static14.aClass65_253, Static62.aClass65_972, Static27.aClass65_569, Static130.aClass65_1805 });
		} else if (Static138.aBoolean138 && Static101.anInt2533 < 2) {
			local42 = Static109.method2004(new Class65[] { Static83.aClass65_1223, Static62.aClass65_972, Static19.aClass65_481, Static130.aClass65_1805 });
		} else {
			local42 = Static128.method2421(Static101.anInt2533 - 1);
		}
		if (Static101.anInt2533 > 2) {
			local42 = Static109.method2004(new Class65[] { local42, Static19.aClass65_482, Static118.method2250(Static101.anInt2533 - 2), Static108.aClass65_1552 });
		}
		@Pc(120) int local120 = Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1609(local42, arg0 + 4, arg1 + 15, Static113.aRandom1, Static45.anInt1165);
		Static5.method64(arg1, 15, arg0 + 4, Static18.aClass1_Sub2_Sub5_Sub4_Sub1_1.method1600(local42) - -local120);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method473(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static16.aClass45_1);
		arg0.removeMouseMotionListener(Static16.aClass45_1);
		arg0.removeFocusListener(Static16.aClass45_1);
		Static7.anInt180 = 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	public static void method474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = -arg2;
		@Pc(17) int local17 = arg2;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static100.method1896(Static23.anInt685, arg2 + arg3, Static71.anInt1744);
		@Pc(36) int local36 = Static100.method1896(Static23.anInt685, arg3 - arg2, Static71.anInt1744);
		Static51.method893(arg1, Static40.anIntArrayArray11[arg0], local27, local36);
		while (local7 < local17) {
			local19 += 2;
			local15 += local19;
			@Pc(70) int local70;
			@Pc(66) int local66;
			@Pc(88) int local88;
			@Pc(97) int local97;
			if (local15 > 0) {
				local17--;
				local15 -= local17 << 1;
				local66 = local17 + arg0;
				local70 = arg0 - local17;
				if (Static206.anInt4385 <= local66 && Static133.anInt3309 >= local70) {
					local88 = Static100.method1896(Static23.anInt685, local7 + arg3, Static71.anInt1744);
					local97 = Static100.method1896(Static23.anInt685, arg3 - local7, Static71.anInt1744);
					if (local66 <= Static133.anInt3309) {
						Static51.method893(arg1, Static40.anIntArrayArray11[local66], local88, local97);
					}
					if (Static206.anInt4385 <= local70) {
						Static51.method893(arg1, Static40.anIntArrayArray11[local70], local88, local97);
					}
				}
			}
			local7++;
			local66 = arg0 + local7;
			local70 = arg0 - local7;
			if (Static206.anInt4385 <= local66 && local70 <= Static133.anInt3309) {
				local88 = Static100.method1896(Static23.anInt685, arg3 + local17, Static71.anInt1744);
				local97 = Static100.method1896(Static23.anInt685, arg3 - local17, Static71.anInt1744);
				if (Static133.anInt3309 >= local66) {
					Static51.method893(arg1, Static40.anIntArrayArray11[local66], local88, local97);
				}
				if (Static206.anInt4385 <= local70) {
					Static51.method893(arg1, Static40.anIntArrayArray11[local70], local88, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBI)I")
	public static int method476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class1_Sub2_Sub5_Sub2.anIntArray142[arg0 * 1024 / arg2] >> 1;
		return (arg1 * (65536 - local24) >> 16) + (local24 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V")
	public static void method477() {
		Static20.anInt624 = 0;
		Static95.anInt2376 = 0;
		Static29.method565();
		Static24.method443();
		Static165.method2848();
		Static18.method344();
		@Pc(22) int local22;
		for (@Pc(17) int local17 = 0; local17 < Static20.anInt624; local17++) {
			local22 = Static142.anIntArray392[local17];
			if (Static158.aClass6_Sub4_Sub1Array1[local22].anInt3975 != Static174.anInt3887) {
				Static158.aClass6_Sub4_Sub1Array1[local22] = null;
			}
		}
		if (Static62.anInt1604 != Static1.aClass1_Sub14_Sub1_43.anInt2306) {
			throw new RuntimeException("gpp1 pos:" + Static1.aClass1_Sub14_Sub1_43.anInt2306 + " psize:" + Static62.anInt1604);
		}
		for (local22 = 0; local22 < Static44.anInt1123; local22++) {
			if (Static158.aClass6_Sub4_Sub1Array1[Static138.anIntArray385[local22]] == null) {
				throw new RuntimeException("gpp2 pos:" + local22 + " size:" + Static44.anInt1123);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(III)J")
	public static long method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass33_1 == null ? 0L : local7.aClass33_1.aLong53;
	}
}
