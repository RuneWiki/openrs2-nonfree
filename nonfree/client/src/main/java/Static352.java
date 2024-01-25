import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public static int anInt6508;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "[[S")
	private static final short[][] aShortArrayArray12 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "[[S")
	private static final short[][] aShortArrayArray13 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "[[S")
	private static final short[][] aShortArrayArray14 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray3 = new short[][][] { aShortArrayArray13, aShortArrayArray12, aShortArrayArray14 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!afa;FIIIIIFI[BFFFI)V")
	public static void method5344(@OriginalArg(0) Class11 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) float arg4, @OriginalArg(9) byte[] arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(47) int local47;
		@Pc(61) int local61;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			arg0.method437(arg8 / (float) 128, arg6 / (float) 16, arg4 * 127.0F, arg1 / (float) 128, arg2, 0, local12);
			local47 = arg3;
			arg8 *= 2.0F;
			arg1 *= 2.0F;
			arg4 *= arg7;
			for (local61 = 0; local61 < 16384; local61++) {
				arg5[local47] = (byte) (int) ((float) arg5[local47] + local12[local61]);
				local47++;
			}
			arg6 *= 2.0F;
		}
		local47 = arg3;
		for (local61 = 0; local61 < 16384; local61++) {
			arg5[local47] -= -127;
			local47++;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method5345() {
		if (Static436.aByteArray90 != null) {
			Static309.method1672(Static652.anInt10896);
		} else if (Static242.anInt4374 == -1) {
			Static441.method6474(Static238.aString49, Static652.anInt10896, Static12.aString1);
		} else {
			Static45.method953(Static652.anInt10896);
		}
	}
}
