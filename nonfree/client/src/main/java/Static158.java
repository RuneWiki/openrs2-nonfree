import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "Lclient!am;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
	public static int anInt3163;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!dh;")
	public static Class33 aClass33_27 = new Class33(64);

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString105 = "Loaded textures";

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString106 = "Loading world list data";

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBII)Lclient!dj;")
	public static Class4_Sub10 method2490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class4_Sub10 local9 = new Class4_Sub10();
		local9.anInt1029 = arg1;
		local9.anInt1032 = arg2;
		Static227.aClass97_16.method2364(local9, (long) arg0);
		Static245.method3745(arg2);
		@Pc(28) Class22 local28 = Static21.method3453(arg0);
		if (local28 != null) {
			Static81.method3274(local28);
		}
		if (Static32.aClass22_4 != null) {
			Static81.method3274(Static32.aClass22_4);
			Static32.aClass22_4 = null;
		}
		@Pc(45) int local45 = Static60.anInt1152;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local45; local47++) {
			if (Static175.method2721(Static299.aShortArray93[local47])) {
				Static71.method1075(local47);
			}
		}
		if (Static60.anInt1152 == 1) {
			Static142.aBoolean192 = false;
			Static115.method1995(Static205.anInt4000, Static139.anInt2867, Static261.anInt4963, Static206.anInt4044);
		} else {
			Static115.method1995(Static205.anInt4000, Static139.anInt2867, Static261.anInt4963, Static206.anInt4044);
			local47 = Static289.aClass4_Sub2_Sub12_3.method4195(Static288.aString71);
			for (@Pc(92) int local92 = 0; local92 < Static60.anInt1152; local92++) {
				@Pc(105) int local105 = Static289.aClass4_Sub2_Sub12_3.method4195(Static249.method3767(local92));
				if (local105 > local47) {
					local47 = local105;
				}
			}
			Static139.anInt2867 = Static60.anInt1152 * 15 + (Static32.aBoolean50 ? 26 : 22);
			Static206.anInt4044 = local47 + 8;
		}
		if (local28 != null) {
			Static161.method2514(local28, false);
		}
		Static170.method2676(arg2);
		if (Static25.anInt448 != -1) {
			Static114.method1938(Static25.anInt448, 1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method2491(@OriginalArg(0) Class98 arg0) {
		Static87.aClass98_55 = arg0;
		Static88.anInt1823 = Static87.aClass98_55.method2394(4);
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V")
	public static void method2492() {
		aString106 = null;
		aString105 = null;
		aClass33_27 = null;
		aClass9_1 = null;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!tb;)V")
	public static void method2493(@OriginalArg(1) Class59_Sub2 arg0) {
		@Pc(9) int local9;
		for (local9 = 0; local9 < Static94.anIntArray210.length; local9++) {
			Static94.anIntArray210[local9] = 0;
		}
		@Pc(41) int local41;
		for (local9 = 0; local9 < 5000; local9++) {
			local41 = (int) ((double) 256 * 128.0D * Math.random());
			Static94.anIntArray210[local41] = (int) (Math.random() * 284.0D);
		}
		@Pc(69) int local69;
		@Pc(78) int local78;
		for (local9 = 0; local9 < 20; local9++) {
			for (local41 = 1; local41 < 255; local41++) {
				for (local69 = 1; local69 < 127; local69++) {
					local78 = local69 + (local41 << 7);
					Static274.anIntArray453[local78] = (Static94.anIntArray210[local78 - 1] + Static94.anIntArray210[local78 + 1] + Static94.anIntArray210[local78 - 128] + Static94.anIntArray210[local78 + 128]) / 4;
				}
			}
			@Pc(116) int[] local116 = Static94.anIntArray210;
			Static94.anIntArray210 = Static274.anIntArray453;
			Static274.anIntArray453 = local116;
		}
		if (arg0 == null) {
			return;
		}
		local9 = 0;
		for (local41 = 0; local41 < arg0.anInt4753; local41++) {
			for (local69 = 0; local69 < arg0.anInt4748; local69++) {
				if (arg0.aByteArray65[local9++] != 0) {
					local78 = local69 + arg0.anInt4752 + 16;
					@Pc(167) int local167 = arg0.anInt4755 + local41 + 16;
					@Pc(173) int local173 = (local167 << 7) + local78;
					Static94.anIntArray210[local173] = 0;
				}
			}
		}
	}
}
