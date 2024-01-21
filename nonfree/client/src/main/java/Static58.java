import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_638 = Static134.method2017("jlv");

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
	public static int[] anIntArray193 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_639 = Static134.method2017("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_640 = Static134.method2017("VOLL");

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	public static int anInt1530 = 0;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
	public static int[] anIntArray194 = new int[256];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I")
	public static int method1010() {
		@Pc(14) int local14 = Static67.method1133(Static124.anInt2712, Static106.anInt2354, Static120.anInt2582);
		return local14 - Static96.anInt2222 >= 800 || (Static62.aByteArrayArrayArray4[Static124.anInt2712][Static106.anInt2354 >> 7][Static120.anInt2582 >> 7] & 0x4) == 0 ? 3 : Static124.anInt2712;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	public static void method1011() {
		aClass76_638 = null;
		aClass76_640 = null;
		anIntArray193 = null;
		anIntArray194 = null;
		aClass76_639 = null;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method1012() {
		if (!Static32.aBoolean56) {
			Static10.anInt206 = 1;
			Static95.anIntArray311[0] = 1002;
			Static114.aClass76Array26[0] = Static117.aClass76_1204;
			Static62.aClass76Array14[0] = Static133.aClass76_1322;
		}
		if (Static6.anInt132 != -1) {
			Static85.method1436(Static6.anInt132);
		}
		for (@Pc(32) int local32 = 0; local32 < Static77.anInt1960; local32++) {
			if (Static70.aBooleanArray9[local32]) {
				Static132.aBooleanArray18[local32] = true;
			}
			Static21.aBooleanArray4[local32] = Static70.aBooleanArray9[local32];
			Static70.aBooleanArray9[local32] = false;
		}
		Static34.anInt962 = Static78.anInt1981;
		Static132.aClass4_Sub8_16 = null;
		Static32.anInt813 = -1;
		Static3.anInt2202 = -1;
		if (Static6.anInt132 != -1) {
			Static77.anInt1960 = 0;
			Static45.method818(0, 0, Static6.anInt132, 0, -1, 503, 765, 0);
		}
		Static46.method1817();
		Static79.method567();
		if (Static32.aBoolean56) {
			Static82.method1421();
		} else if (Static32.anInt813 != -1) {
			Static47.method837(Static32.anInt813, Static3.anInt2202);
		}
		if (Static13.anInt223 == 3) {
			for (@Pc(110) int local110 = 0; local110 < Static77.anInt1960; local110++) {
				if (Static21.aBooleanArray4[local110]) {
					Static46.method1825(Static41.anIntArray131[local110], Static126.anIntArray396[local110], Static134.anIntArray409[local110], Static30.anIntArray185[local110], 16711935, 128);
				} else if (Static132.aBooleanArray18[local110]) {
					Static46.method1825(Static41.anIntArray131[local110], Static126.anIntArray396[local110], Static134.anIntArray409[local110], Static30.anIntArray185[local110], 16711680, 128);
				}
			}
		}
		Static41.method785(Static124.anInt2712, Static1.anInt5, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416);
		Static1.anInt5 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
	public static void method1013() {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = -1; local7 < Static106.anInt2357; local7++) {
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static113.anIntArray348[local7];
			}
			@Pc(25) Class4_Sub4_Sub3_Sub1_Sub2 local25 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local15];
			if (local25 != null && local25.anInt1381 > 0) {
				local25.anInt1381--;
				if (local25.anInt1381 == 0) {
					local25.aClass76_607 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static76.anInt1935; local15++) {
			@Pc(54) int local54 = Static47.anIntArray153[local15];
			@Pc(58) Class4_Sub4_Sub3_Sub1_Sub1 local58 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local54];
			if (local58 != null && local58.anInt1381 > 0) {
				local58.anInt1381--;
				if (local58.anInt1381 == 0) {
					local58.aClass76_607 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)I")
	public static int method1014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return arg1 / 2 + (arg0 / 32 << 7) + (arg2 / 4 << 10);
	}
}
