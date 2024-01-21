import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "Lclient!r;")
	public static Class1_Sub1_Sub15 aClass1_Sub1_Sub15_2;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "Lclient!wc;")
	public static Class1_Sub1_Sub12_Sub3_Sub1 aClass1_Sub1_Sub12_Sub3_Sub1_3;

	@OriginalMember(owner = "client!jg", name = "yb", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!jg", name = "sb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_512 = Static169.method2903("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "Lclient!ed;")
	public static Class23 aClass23_509 = aClass23_512;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "Lclient!ed;")
	public static Class23 aClass23_510 = Static169.method2903("null");

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "Lclient!ed;")
	public static Class23 aClass23_511 = Static169.method2903("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!jg", name = "xb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_513 = Static169.method2903("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!jg", name = "Bb", descriptor = "I")
	public static int anInt1405 = -1;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(II)I")
	public static int method881(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ga;Lclient!ga;ZLclient!wc;)V")
	public static void method890(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class1_Sub1_Sub12_Sub3_Sub1 arg3) {
		Static174.aBoolean208 = arg2;
		Static62.aClass30_25 = arg0;
		Static105.aClass30_36 = arg1;
		Static79.anInt2155 = Static105.aClass30_36.method1278(10);
		Static52.aClass1_Sub1_Sub12_Sub3_Sub1_5 = arg3;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)V")
	public static void method892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == Static46.anInt4332 && arg1 == Static29.anInt888 && (Static100.anInt2570 == arg4 || !Static8.aBoolean17)) {
			return;
		}
		Static29.anInt888 = arg1;
		Static46.anInt4332 = arg3;
		Static100.anInt2570 = arg4;
		if (!Static8.aBoolean17) {
			Static100.anInt2570 = 0;
		}
		Static32.method567(25);
		Static5.method3152(true, Static177.aClass23_1604);
		@Pc(40) int local40 = Static152.anInt3545;
		@Pc(42) int local42 = Static75.anInt2039;
		Static152.anInt3545 = (arg3 - 6) * 8;
		Static75.anInt2039 = arg1 * 8 - 48;
		@Pc(59) int local59 = Static152.anInt3545 - local40;
		@Pc(63) int local63 = Static75.anInt2039 - local42;
		for (@Pc(69) int local69 = 0; local69 < 32768; local69++) {
			@Pc(75) Class1_Sub1_Sub1_Sub1_Sub2 local75 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local69];
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < 10; local79++) {
					local75.anIntArray250[local79] -= local59;
					local75.anIntArray248[local79] -= local63;
				}
				local75.anInt1825 -= local63 * 128;
				local75.anInt1838 -= local59 * 128;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < 2048; local125++) {
			@Pc(131) Class1_Sub1_Sub1_Sub1_Sub1 local131 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local125];
			if (local131 != null) {
				for (@Pc(135) int local135 = 0; local135 < 10; local135++) {
					local131.anIntArray250[local135] -= local59;
					local131.anIntArray248[local135] -= local63;
				}
				local131.anInt1825 -= local63 * 128;
				local131.anInt1838 -= local59 * 128;
			}
		}
		Static85.anInt2267 = arg4;
		@Pc(183) byte local183 = 0;
		@Pc(185) byte local185 = 0;
		@Pc(187) byte local187 = 1;
		@Pc(189) byte local189 = 104;
		Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.method1217(arg0, arg2, false);
		@Pc(197) byte local197 = 1;
		if (local63 < 0) {
			local197 = -1;
			local185 = 103;
			local189 = -1;
		}
		@Pc(210) byte local210 = 104;
		if (local59 < 0) {
			local187 = -1;
			local183 = 103;
			local210 = -1;
		}
		for (@Pc(220) int local220 = local183; local220 != local210; local220 += local187) {
			for (@Pc(224) int local224 = local185; local224 != local189; local224 += local197) {
				@Pc(230) int local230 = local59 + local220;
				@Pc(234) int local234 = local224 + local63;
				for (@Pc(236) int local236 = 0; local236 < 4; local236++) {
					if (local230 >= 0 && local234 >= 0 && local230 < 104 && local234 < 104) {
						Static41.aClass56ArrayArrayArray1[local236][local220][local224] = Static41.aClass56ArrayArrayArray1[local236][local230][local234];
					} else {
						Static41.aClass56ArrayArrayArray1[local236][local220][local224] = null;
					}
				}
			}
		}
		for (@Pc(310) Class1_Sub17 local310 = (Class1_Sub17) Static158.aClass56_15.method1853(); local310 != null; local310 = (Class1_Sub17) Static158.aClass56_15.method1855()) {
			local310.anInt3231 -= local59;
			local310.anInt3228 -= local63;
			if (local310.anInt3231 < 0 || local310.anInt3228 < 0 || local310.anInt3231 >= 104 || local310.anInt3228 >= 104) {
				local310.method3141();
			}
		}
		Static106.aBoolean133 = false;
		Static87.anInt959 = -1;
		Static33.anInt948 = 0;
		if (Static111.anInt2840 != 0) {
			Static111.anInt2840 -= local59;
			Static32.anInt934 -= local63;
		}
		Static49.aClass56_5.method1851();
		Static91.aClass56_7.method1851();
	}

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "(B)V")
	public static void method893() {
		aClass23_509 = null;
		aClass1_Sub1_Sub15_2 = null;
		aClass23_513 = null;
		aClass23_512 = null;
		aClass23_511 = null;
		aClass23_510 = null;
		aClass1_Sub1_Sub12_Sub3_Sub1_3 = null;
	}
}
