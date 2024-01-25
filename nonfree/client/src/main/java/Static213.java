import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!in", name = "I", descriptor = "[[I")
	public static int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "Lclient!eea;")
	public static Class80 aClass80_1 = new Class80(8);

	@OriginalMember(owner = "client!in", name = "J", descriptor = "I")
	public static int anInt4055 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IJ)V")
	public static void method3465(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static124.method2346(arg0 - 1L);
			Static124.method2346(1L);
		} else {
			Static124.method2346(arg0);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method3466(@OriginalArg(0) Class62 arg0) {
		if (Static218.aBoolean250) {
			Static466.method6500(arg0);
		} else {
			Static37.method832(arg0);
		}
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
	public static void method3467() {
		@Pc(16) boolean local16 = Static131.aClass5_Sub3_Sub1_1.method4226() == 1;
		@Pc(20) int local20 = Static131.aClass5_Sub3_Sub1_1.method4205();
		Static56.anInt1176 = Static131.aClass5_Sub3_Sub1_1.method4171();
		@Pc(28) int local28 = Static131.aClass5_Sub3_Sub1_1.method4183();
		@Pc(34) int local34 = Static131.aClass5_Sub3_Sub1_1.method4227();
		Static505.method6631();
		Static289.method4853(local28);
		Static131.aClass5_Sub3_Sub1_1.method519();
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Static460.anInt7894 >> 3; local48++) {
				for (local52 = 0; local52 < Static235.anInt4493 >> 3; local52++) {
					local59 = Static131.aClass5_Sub3_Sub1_1.method524(1);
					if (local59 == 1) {
						Static157.anIntArrayArrayArray1[local44][local48][local52] = Static131.aClass5_Sub3_Sub1_1.method524(26);
					} else {
						Static157.anIntArrayArrayArray1[local44][local48][local52] = -1;
					}
				}
			}
		}
		Static131.aClass5_Sub3_Sub1_1.method532();
		local48 = (Static319.anInt6170 - Static131.aClass5_Sub3_Sub1_1.anInt4960) / 16;
		anIntArrayArray28 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				anIntArrayArray28[local52][local59] = Static131.aClass5_Sub3_Sub1_1.method4230();
			}
		}
		Static339.anIntArray475 = new int[local48];
		Static201.anIntArray274 = null;
		Static103.anIntArray76 = new int[local48];
		Static124.aByteArrayArray13 = new byte[local48][];
		Static178.aByteArrayArray17 = new byte[local48][];
		Static141.anIntArray237 = new int[local48];
		Static339.anIntArray474 = new int[local48];
		Static254.anIntArray688 = new int[local48];
		Static85.aByteArrayArray11 = new byte[local48][];
		Static226.aByteArrayArray31 = new byte[local48][];
		Static348.aByteArrayArray36 = null;
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(192) int local192 = 0; local192 < Static460.anInt7894 >> 3; local192++) {
				for (@Pc(196) int local196 = 0; local196 < Static235.anInt4493 >> 3; local196++) {
					@Pc(206) int local206 = Static157.anIntArrayArrayArray1[local59][local192][local196];
					if (local206 != -1) {
						@Pc(215) int local215 = local206 >> 14 & 0x3FF;
						@Pc(221) int local221 = local206 >> 3 & 0x7FF;
						@Pc(231) int local231 = local221 / 8 + (local215 / 8 << 8);
						for (@Pc(233) int local233 = 0; local233 < local48; local233++) {
							if (Static103.anIntArray76[local233] == local231) {
								local231 = -1;
								break;
							}
						}
						if (local231 != -1) {
							Static103.anIntArray76[local48] = local231;
							@Pc(266) int local266 = local231 >> 8 & 0xFF;
							@Pc(270) int local270 = local231 & 0xFF;
							Static141.anIntArray237[local48] = Static338.aClass117_151.method2982("m" + local266 + "_" + local270);
							Static339.anIntArray474[local48] = Static338.aClass117_151.method2982("l" + local266 + "_" + local270);
							Static339.anIntArray475[local48] = Static338.aClass117_151.method2982("um" + local266 + "_" + local270);
							Static254.anIntArray688[local48] = Static338.aClass117_151.method2982("ul" + local266 + "_" + local270);
							local48++;
						}
					}
				}
			}
		}
		Static110.method2215(10, local16, local34, local20);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z")
	public static boolean method3469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
