import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	public static int anInt3091;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "[I")
	public static final int[] anIntArray213 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public static void method2888() {
		Static354.aClass66_109.method1942();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!fg;)V")
	public static void method2890(@OriginalArg(0) Class5_Sub13_Sub1 arg0) {
		if (Static132.anInt2864 >= 255) {
			return;
		}
		Static233.aClass5_Sub13_Sub1Array3[Static132.anInt2864] = arg0;
		Static105.aBooleanArray7[Static132.anInt2864] = false;
		Static132.anInt2864++;
		@Pc(18) int local18 = arg0.anInt2094;
		if (arg0.aBoolean132) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt2094;
		if (arg0.aBoolean131) {
			local26 = Static248.anInt4820 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt2082 + 64 - arg0.anInt2079 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt2082 + arg0.anInt2079 - 64 >> 7;
			if (local66 >= Static248.anInt4822) {
				local66 = Static248.anInt4822 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray17[local38++];
				@Pc(96) int local96 = (arg0.anInt2080 + 64 - arg0.anInt2079 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static12.anInt378) {
					local104 = Static12.anInt378 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static318.anIntArrayArrayArray19[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static318.anIntArrayArrayArray19[local35][local117][local75] = local126 | Static132.anInt2864;
					} else if ((local126 & 0xFF00) == 0) {
						Static318.anIntArrayArrayArray19[local35][local117][local75] = local126 | Static132.anInt2864 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static318.anIntArrayArrayArray19[local35][local117][local75] = local126 | Static132.anInt2864 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static318.anIntArrayArrayArray19[local35][local117][local75] = local126 | Static132.anInt2864 << 24;
					}
				}
			}
		}
	}
}
