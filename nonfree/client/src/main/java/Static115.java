import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	public static int anInt2124 = -1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1775(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(16) int local16 = arg2.length();
		@Pc(19) int local19 = arg1.length();
		@Pc(22) int local22 = arg0.length();
		if (local19 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(35) int local35 = local16;
		@Pc(40) int local40 = local22 - local19;
		if (local40 != 0) {
			@Pc(45) int local45 = 0;
			while (true) {
				local45 = arg2.indexOf(arg1, local45);
				if (local45 < 0) {
					break;
				}
				local45 += local19;
				local35 += local40;
			}
		}
		@Pc(72) StringBuffer local72 = new StringBuffer(local35);
		@Pc(74) int local74 = 0;
		while (true) {
			@Pc(79) int local79 = arg2.indexOf(arg1, local74);
			if (local79 < 0) {
				local72.append(arg2.substring(local74));
				return local72.toString();
			}
			local72.append(arg2.substring(local74, local79));
			local72.append(arg0);
			local74 = local19 + local79;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZB)V")
	public static void method1777(@OriginalArg(0) boolean arg0) {
		Static46.aByteArrayArrayArray7 = null;
		Static260.aClass127_12 = null;
		Static175.aByteArrayArrayArray15 = null;
		if (arg0 && Static188.aClass1_Sub2_Sub13_2 != null) {
			Static122.anInt2363 = Static188.aClass1_Sub2_Sub13_2.anInt3485;
		} else {
			Static122.anInt2363 = -1;
		}
		Static163.anIntArray529 = null;
		Static18.anIntArrayArrayArray3 = null;
		Static188.aClass1_Sub2_Sub13_2 = null;
		Static212.aByteArrayArrayArray25 = null;
		Static84.anIntArrayArrayArray9 = null;
		Static276.aByteArrayArrayArray26 = null;
		Static38.anIntArrayArrayArray6 = null;
		Static91.anInt1713 = 0;
		Static242.aByteArrayArrayArray22 = null;
		Static152.aClass69_12.method1629();
		Static60.aClass62_2 = null;
		Static274.anInt5464 = -1;
		Static269.anInt5391 = -1;
		Static49.aClass62_1 = null;
		Static40.aClass1_Sub2_Sub2_4 = null;
		Static145.aClass62_5 = null;
		Static84.aClass1_Sub2_Sub2_Sub1_3 = null;
		Static190.aClass62_8 = null;
		Static103.aClass62_4 = null;
		Static65.aClass62_3 = null;
		Static168.aClass62_7 = null;
		Static149.aClass62_6 = null;
		Static166.aClass50_2 = null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method1778() {
		for (@Pc(3) int local3 = 0; local3 < Static101.anInt1926; local3++) {
			@Pc(10) int local10 = Static294.anIntArray687[local3];
			@Pc(14) Class6_Sub6_Sub2 local14 = Static77.aClass6_Sub6_Sub2Array1[local10];
			@Pc(18) int local18 = Static63.aClass1_Sub18_Sub1_1.method3122();
			if ((local18 & 0x4) != 0) {
				local18 += Static63.aClass1_Sub18_Sub1_1.method3122() << 8;
			}
			Static131.method2059(local10, local18, local14);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public static void method1779() {
		Static80.method1362();
		Static245.method1014();
		Static209.method3320();
		Static234.method3736();
		Static140.method2200();
		Static77.method1327();
		Static283.method4324();
		Static267.method4106();
		Static159.method2477();
		Static29.method482();
		Static163.method3581();
		Static182.method2761();
		Static97.method1594();
		Static299.method4552();
		Static242.method3844();
		Static139.method2194();
		Static64.method1055();
		Static289.method4435();
		if (Static286.anInt5076 != 0) {
			for (@Pc(49) int local49 = 0; local49 < Static94.aByteArrayArray6.length; local49++) {
				Static94.aByteArrayArray6[local49] = null;
			}
			Static139.anInt2618 = 0;
		}
		Static273.method4185();
		Static214.method3390();
		Static250.aClass31_37.method855();
		if (!Static240.aBoolean369) {
			((Class40_Sub1) Static208.anInterface4_1).method996();
		}
		Static245.aClass64_11.method1463();
		Static253.aClass7_205.method248();
		Static79.aClass7_132.method248();
		Static41.aClass7_41.method248();
		Static60.aClass7_60.method248();
		Static216.aClass7_178.method248();
		Static67.aClass7_68.method248();
		Static27.aClass7_29.method248();
		Static58.aClass7_58.method248();
		Static169.aClass7_138.method248();
		Static52.aClass7_47.method248();
		Static82.aClass7_82.method248();
		Static198.aClass31_29.method855();
	}
}
