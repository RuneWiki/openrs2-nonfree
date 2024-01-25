import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt5412;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
	public static void method4541() {
		for (@Pc(1) int local1 = 0; local1 < Static2.anInt11; local1++) {
			@Pc(6) Class6_Sub1_Sub1 local6 = Static497.aClass6_Sub1_Sub1Array1[local1];
			Static340.method5157(local6, true);
			Static497.aClass6_Sub1_Sub1Array1[local1] = null;
		}
		Static2.anInt11 = 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
	public static boolean method4542(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!gl;[[B)V")
	public static void method4543(@OriginalArg(1) Class49_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.anInt3634; local15++) {
			Static352.method5248();
			for (@Pc(21) int local21 = 0; local21 < Static188.anInt3850 >> 3; local21++) {
				for (@Pc(25) int local25 = 0; local25 < Static49.anInt1174 >> 3; local25++) {
					@Pc(35) int local35 = Static66.anIntArrayArrayArray30[local15][local21][local25];
					if (local35 != -1) {
						@Pc(45) int local45 = local35 >> 24 & 0x3;
						if (!arg0.aBoolean301 || local45 == 0) {
							@Pc(59) int local59 = local35 >> 1 & 0x3;
							@Pc(65) int local65 = local35 >> 14 & 0x3FF;
							@Pc(71) int local71 = local35 >> 3 & 0x7FF;
							@Pc(81) int local81 = (local65 / 8 << 8) + local71 / 8;
							for (@Pc(83) int local83 = 0; local83 < Static234.anIntArray280.length; local83++) {
								if (Static234.anIntArray280[local83] == local81 && arg1[local83] != null) {
									arg0.method3010(local15, Static307.aClass100_6, Static495.aClass355Array1, local45, (local65 & 0x7) * 8, arg1[local83], local21 * 8, local25 * 8, local59, (local71 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
