import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!lc;")
	public static Class40 aClass40_81;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1102 = Static121.method2047("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1097 = aClass60_1102;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1099 = Static121.method2047("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1098 = aClass60_1099;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
	public static int[] anIntArray300 = new int[128];

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1100 = Static121.method2047("Loaded sprites");

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1101 = aClass60_1100;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_15 = null;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1103 = Static121.method2047("<col=ff0000>");

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1104 = Static121.method2047("Lade Sprites )2 ");

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
	public static int anInt2750 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class4_Sub19 local3 = null;
		for (@Pc(12) Class4_Sub19 local12 = (Class4_Sub19) Static52.aClass70_12.method1939(); local12 != null; local12 = (Class4_Sub19) Static52.aClass70_12.method1936()) {
			if (arg8 == local12.anInt2490 && local12.anInt2496 == arg6 && local12.anInt2499 == arg5 && local12.anInt2494 == arg4) {
				local3 = local12;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class4_Sub19();
			local3.anInt2499 = arg5;
			local3.anInt2490 = arg8;
			local3.anInt2496 = arg6;
			local3.anInt2494 = arg4;
			Static10.method202(local3);
			Static52.aClass70_12.method1931(local3);
		}
		local3.anInt2489 = arg7;
		local3.anInt2486 = arg0;
		local3.anInt2487 = arg1;
		local3.anInt2497 = arg2;
		local3.anInt2495 = arg3;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLclient!da;)V")
	public static void method1934(@OriginalArg(1) Class4_Sub4_Sub3_Sub1 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static38.anIntArray73.length; local9++) {
			Static38.anIntArray73[local9] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			Static38.anIntArray73[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(67) int local67;
		for (local36 = 0; local36 < 20; local36++) {
			for (local55 = 1; local55 < 255; local55++) {
				for (local59 = 1; local59 < 127; local59++) {
					local67 = (local55 << 7) + local59;
					Static95.anIntArray233[local67] = (Static38.anIntArray73[local67 + 128] + Static38.anIntArray73[local67 - 1] + Static38.anIntArray73[local67 + 1] + Static38.anIntArray73[local67 + -128]) / 4;
				}
			}
			@Pc(108) int[] local108 = Static38.anIntArray73;
			Static38.anIntArray73 = Static95.anIntArray233;
			Static95.anIntArray233 = local108;
		}
		if (arg0 == null) {
			return;
		}
		local55 = 0;
		for (local59 = 0; local59 < arg0.anInt633; local59++) {
			for (local67 = 0; local67 < arg0.anInt635; local67++) {
				if (arg0.aByteArray24[local55++] != 0) {
					@Pc(149) int local149 = local67 + arg0.anInt637 + 16;
					@Pc(157) int local157 = local59 + arg0.anInt634 + 16;
					@Pc(163) int local163 = (local157 << 7) + local149;
					Static38.anIntArray73[local163] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public static void method1935() {
		aClass60_1100 = null;
		aClass60_1101 = null;
		anIntArray300 = null;
		aClass60_1098 = null;
		aClass60_1102 = null;
		aClass40_81 = null;
		aClass60_1099 = null;
		aClass4_Sub17_15 = null;
		aClass60_1097 = null;
		aClass60_1103 = null;
		aClass60_1104 = null;
	}
}
