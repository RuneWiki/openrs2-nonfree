import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public static int anInt1136;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public static int anInt1139;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt1141;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_520 = Static51.method932("(U3");

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public static int anInt1135 = 0;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!cd;")
	private static Class10 aClass10_525 = Static51.method932("Error loading your profile)3");

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_521 = aClass10_525;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "J")
	public static long aLong37 = 0L;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!cd;")
	private static Class10 aClass10_522 = Static51.method932("Loaded title screen");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_523 = Static51.method932("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_524 = aClass10_522;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	public static int anInt1145 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method872() {
		aClass10_523 = null;
		aClass10_521 = null;
		aClass10_525 = null;
		aClass10_520 = null;
		aClass10_524 = null;
		aClass10_522 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!oe;B)V")
	public static void method875(@OriginalArg(0) Class2_Sub1_Sub4_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static93.anIntArray228.length; local7++) {
			Static93.anIntArray228[local7] = 0;
		}
		@Pc(44) int local44;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local44 = (int) ((double) 256 * Math.random() * 128.0D);
			Static93.anIntArray228[local44] = (int) (Math.random() * 256.0D);
		}
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(73) int local73;
		for (local44 = 0; local44 < 20; local44++) {
			for (local61 = 1; local61 < 255; local61++) {
				for (local65 = 1; local65 < 127; local65++) {
					local73 = (local61 << 7) + local65;
					Static102.anIntArray378[local73] = (Static93.anIntArray228[local73 - 128] + Static93.anIntArray228[local73 - 1] + Static93.anIntArray228[local73 - -1] + Static93.anIntArray228[local73 - -128]) / 4;
				}
			}
			@Pc(116) int[] local116 = Static93.anIntArray228;
			Static93.anIntArray228 = Static102.anIntArray378;
			Static102.anIntArray378 = local116;
		}
		if (arg0 == null) {
			return;
		}
		local61 = 0;
		for (local65 = 0; local65 < arg0.anInt2632; local65++) {
			for (local73 = 0; local73 < arg0.anInt2635; local73++) {
				if (arg0.aByteArray34[local61++] != 0) {
					@Pc(151) int local151 = arg0.anInt2631 + local73 + 16;
					@Pc(159) int local159 = local65 + arg0.anInt2630 + 16;
					@Pc(165) int local165 = (local159 << 7) + local151;
					Static93.anIntArray228[local165] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method877() {
		Static119.aBoolean119 = false;
		Static79.anInt1819 = 0;
		anInt1135 = 0;
		Static75.anInt1785 = -1;
		Static111.anInt2519 = 0;
		Static96.anInt3689 = -1;
		Static174.anInt3743 = 0;
		Static109.anInt2502 = 0;
		Static175.anInt3786 = 0;
		Static160.anInt3398 = -1;
		Static55.anInt1420 = -1;
		Static141.aClass2_Sub11_Sub1_3.anInt2077 = 0;
		Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
		for (@Pc(43) int local43 = 0; local43 < Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1.length; local43++) {
			if (Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local43] != null) {
				Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local43].anInt3457 = -1;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1.length; local65++) {
			if (Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local65] != null) {
				Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local65].anInt3457 = -1;
			}
		}
		Static69.method1163();
		Static45.method870(30);
		for (@Pc(88) int local88 = 0; local88 < 100; local88++) {
			Static152.aBooleanArray14[local88] = true;
		}
	}
}
