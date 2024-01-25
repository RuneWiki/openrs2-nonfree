import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
	public static int anInt2145;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_94 = new Class67(7, -1);

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)I")
	public static int method1751(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local18 * local33 >> 12;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method1752() {
		Static413.aClass1_Sub19_Sub2_1.method2941();
		@Pc(18) int local18 = Static413.aClass1_Sub19_Sub2_1.method2946(8);
		@Pc(23) int local23;
		if (local18 < Static137.anInt2142) {
			for (local23 = local18; local23 < Static137.anInt2142; local23++) {
				Static398.anIntArray464[Static305.anInt5083++] = Static135.anIntArray183[local23];
			}
		}
		if (Static137.anInt2142 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static137.anInt2142 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(57) int local57 = Static135.anIntArray183[local23];
			@Pc(65) Class11_Sub1_Sub3_Sub1 local65 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) local57)).aClass11_Sub1_Sub3_Sub1_2;
			@Pc(70) int local70 = Static413.aClass1_Sub19_Sub2_1.method2946(1);
			if (local70 == 0) {
				Static135.anIntArray183[Static137.anInt2142++] = local57;
				local65.lb = Static98.anInt1304;
			} else {
				@Pc(90) int local90 = Static413.aClass1_Sub19_Sub2_1.method2946(2);
				if (local90 == 0) {
					Static135.anIntArray183[Static137.anInt2142++] = local57;
					local65.lb = Static98.anInt1304;
					Static111.anIntArray154[Static383.anInt6137++] = local57;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local90 == 1) {
						Static135.anIntArray183[Static137.anInt2142++] = local57;
						local65.lb = Static98.anInt1304;
						local134 = Static413.aClass1_Sub19_Sub2_1.method2946(3);
						local65.method1306(local134, 1);
						local144 = Static413.aClass1_Sub19_Sub2_1.method2946(1);
						if (local144 == 1) {
							Static111.anIntArray154[Static383.anInt6137++] = local57;
						}
					} else if (local90 == 2) {
						Static135.anIntArray183[Static137.anInt2142++] = local57;
						local65.lb = Static98.anInt1304;
						if (Static413.aClass1_Sub19_Sub2_1.method2946(1) == 1) {
							local134 = Static413.aClass1_Sub19_Sub2_1.method2946(3);
							local65.method1306(local134, 2);
							local144 = Static413.aClass1_Sub19_Sub2_1.method2946(3);
							local65.method1306(local144, 2);
						} else {
							local134 = Static413.aClass1_Sub19_Sub2_1.method2946(3);
							local65.method1306(local134, 0);
						}
						local134 = Static413.aClass1_Sub19_Sub2_1.method2946(1);
						if (local134 == 1) {
							Static111.anIntArray154[Static383.anInt6137++] = local57;
						}
					} else if (local90 == 3) {
						Static398.anIntArray464[Static305.anInt5083++] = local57;
					}
				}
			}
		}
	}
}
