import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
	public static final int[] anIntArray1001 = new int[2048];

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
	public static final int[] anIntArray1002 = new int[2048];

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "[Lclient!js;")
	public static final Class128[] aClass128Array1 = new Class128[29];

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
	public static final int[] anIntArray1004 = new int[14];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)C")
	public static char method4424(@OriginalArg(1) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(45) char local45 = Static187.aCharArray1[local14 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local14 = local45;
		}
		return (char) local14;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!pg;[[B)V")
	public static void method4425(@OriginalArg(1) Class56_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt4586; local21++) {
			Static271.method4164();
			for (@Pc(27) int local27 = 0; local27 < Static246.anInt4374 >> 3; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static185.anInt3485 >> 3; local31++) {
					@Pc(35) boolean local35 = false;
					@Pc(43) int local43 = Static309.anIntArrayArrayArray13[local21][local27][local31];
					if (local43 != -1) {
						@Pc(52) int local52 = local43 >> 24 & 0x3;
						if (!arg0.aBoolean341 || local52 == 0) {
							@Pc(66) int local66 = local43 >> 1 & 0x3;
							@Pc(72) int local72 = local43 >> 14 & 0x3FF;
							@Pc(78) int local78 = local43 >> 3 & 0x7FF;
							@Pc(88) int local88 = (local72 / 8 << 8) + local78 / 8;
							for (@Pc(90) int local90 = 0; local90 < Static68.anIntArray284.length; local90++) {
								if (local88 == Static68.anIntArray284[local90] && arg1[local90] != null) {
									@Pc(108) Class2_Sub16 local108 = new Class2_Sub16(arg1[local90]);
									arg0.method4062(Static58.aClass188Array1, local27 * 8, local66, local31 * 8, local21, local52, local72, local78, local108);
									local35 = true;
									arg0.method4079(local72, local31 * 8, Static111.aClass63_3, local108, local27 * 8, local21, local66, local52, local78, local12[0] == -1 ? local12 : null);
									break;
								}
							}
						}
					}
					if (!local35) {
						arg0.method4059(8, local31 * 8, 8, local27 * 8, local21);
					}
				}
			}
		}
		if (local12[0] == -1) {
			Static103.aClass33_1 = null;
		} else {
			Static103.aClass33_1 = Static341.aClass225_1.method4905(local12[3], local12[1], local12[0], local12[2], Static106.aClass98_1);
			Static16.anInt387 = local12[4];
		}
	}
}
