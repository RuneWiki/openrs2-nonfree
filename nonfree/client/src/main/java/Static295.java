import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray6;

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
	public static int anInt5539;

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	public static void method4627() {
		Static167.aClass87_3.method7896(Static316.aClass6_24);
		Static167.aClass87_3.DA(Static194.anInt4181, Static566.anInt2120, Static220.anInt4574, Static205.anInt4328);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)I")
	public static int method4630(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static244.anInt4841;
		if (local5 == 0) {
			return arg0 ? 0 : Static134.anInt3047;
		} else if (local5 == 1) {
			return Static134.anInt3047;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!wq;[[BI)V")
	public static void method4633(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0.anInt10205; local13++) {
			Static77.method1461();
			for (@Pc(18) int local18 = 0; local18 < Static3.anInt46 >> 3; local18++) {
				for (@Pc(21) int local21 = 0; local21 < Static270.anInt5194 >> 3; local21++) {
					@Pc(30) int local30 = Static447.anIntArrayArrayArray10[local13][local18][local21];
					if (local30 != -1) {
						@Pc(39) int local39 = local30 >> 24 & 0x3;
						if (!arg0.aBoolean755 || local39 == 0) {
							@Pc(53) int local53 = local30 >> 1 & 0x3;
							@Pc(59) int local59 = local30 >> 14 & 0x3FF;
							@Pc(65) int local65 = local30 >> 3 & 0x7FF;
							@Pc(76) int local76 = (local59 / 8 << 8) + (local65 / 8);
							for (@Pc(78) int local78 = 0; local78 < Static349.anIntArray395.length; local78++) {
								if (local76 == Static349.anIntArray395[local78] && arg1[local78] != null) {
									arg0.method8538((local59 & 0x7) * 8, (local65 & 0x7) * 8, arg1[local78], local18 * 8, local53, local13, Static600.aClass87_15, Static19.aClass179Array2, local39, local21 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)I")
	public static int method4634(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
