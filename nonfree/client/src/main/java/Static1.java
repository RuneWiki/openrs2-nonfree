import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!am;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt3 = 0;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public static int anInt4 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!fd;)I")
	public static int method1(@OriginalArg(1) int arg0, @OriginalArg(2) Class72 arg1) {
		if (arg1.anIntArrayArray22 == null || arg1.anIntArrayArray22.length <= arg0) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg1.anIntArrayArray22[arg0];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local29[local33++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local31;
				}
				if (local40 == 1) {
					local42 = Static284.anIntArray464[local29[local33++]];
				}
				if (local40 == 2) {
					local42 = Static248.anIntArray425[local29[local33++]];
				}
				if (local40 == 3) {
					local42 = Static16.anIntArray50[local29[local33++]];
				}
				@Pc(97) int local97;
				@Pc(108) Class72 local108;
				@Pc(113) int local113;
				@Pc(126) int local126;
				if (local40 == 4) {
					local97 = local29[local33++] << 16;
					@Pc(104) int local104 = local97 + local29[local33++];
					local108 = Static66.method1243(local104);
					local113 = local29[local33++];
					if (local113 != -1 && (!Static247.method4270(local113).aBoolean380 || Static197.aBoolean352)) {
						for (local126 = 0; local126 < local108.anIntArray179.length; local126++) {
							if (local113 + 1 == local108.anIntArray179[local126]) {
								local42 += local108.anIntArray181[local126];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static103.anIntArray295[local29[local33++]];
				}
				if (local40 == 6) {
					local42 = Class63_Sub1_Sub1.anIntArray160[Static248.anIntArray425[local29[local33++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static103.anIntArray295[local29[local33++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727;
				}
				if (local40 == 9) {
					for (local97 = 0; local97 < 25; local97++) {
						if (Static258.aBooleanArray25[local97]) {
							local42 += Static248.anIntArray425[local97];
						}
					}
				}
				if (local40 == 10) {
					local97 = local29[local33++] << 16;
					local97 += local29[local33++];
					local108 = Static66.method1243(local97);
					local113 = local29[local33++];
					if (local113 != -1 && (!Static247.method4270(local113).aBoolean380 || Static197.aBoolean352)) {
						for (local126 = 0; local126 < local108.anIntArray179.length; local126++) {
							if (local108.anIntArray179[local126] == local113 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static107.anInt6870;
				}
				if (local40 == 12) {
					local42 = Static85.anInt1869;
				}
				if (local40 == 13) {
					local97 = Static103.anIntArray295[local29[local33++]];
					@Pc(314) int local314 = local29[local33++];
					local42 = (0x1 << local314 & local97) == 0 ? 0 : 1;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 14) {
					local97 = local29[local33++];
					local42 = Static44.method807(local97);
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 18) {
					local42 = (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7) + Static10.anInt231;
				}
				if (local40 == 19) {
					local42 = (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7) + Static81.anInt1732;
				}
				if (local40 == 20) {
					local42 = local29[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local31 += local42;
					}
					if (local35 == 1) {
						local31 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local31 /= local42;
					}
					if (local35 == 3) {
						local31 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(434) Exception local434) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static void method2() {
		Static189.aClass154_65.method4220(5);
	}
}
