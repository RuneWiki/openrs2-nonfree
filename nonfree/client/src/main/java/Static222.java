import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt4504 = 0;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public static int anInt4506 = 1;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[S")
	public static final short[] aShortArray94 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
	public static final int[] anIntArray552 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	public static int anInt4508 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3993(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(27) String local27 = Static125.method1826(arg0);
		if (local27 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static248.anInt4157; local32++) {
			@Pc(38) String local38 = Static175.aStringArray45[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static125.method1826(local38);
			if (local38 != null && local38.equals(local27)) {
				Static248.anInt4157--;
				for (@Pc(64) int local64 = local32; local64 < Static248.anInt4157; local64++) {
					Static175.aStringArray45[local64] = Static175.aStringArray45[local64 + 1];
					Static334.aStringArray78[local64] = Static334.aStringArray78[local64 + 1];
					Static234.anIntArray495[local64] = Static234.anIntArray495[local64 + 1];
					Static121.aStringArray33[local64] = Static121.aStringArray33[local64 + 1];
					Static197.anIntArray408[local64] = Static197.anIntArray408[local64 + 1];
					Static194.aBooleanArray17[local64] = Static194.aBooleanArray17[local64 + 1];
				}
				Static329.anInt3952 = Static105.anInt1853;
				Static177.method1119(Static306.aClass48_187);
				Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(arg0));
				Static209.aClass1_Sub33_Sub2_2.method5143(arg0);
				return;
			}
		}
	}
}
