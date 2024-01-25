import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt2822;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_77 = new Class363(71, 8);

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[1000][];

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[Lclient!on;")
	public static final Class246[] aClass246Array1 = new Class246[8];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	public static int method2295(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static285.anInt6371 - 1; local3++) {
			if (arg0 < Static509.anIntArray604[local3] + Static148.anIntArray183[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static285.anInt6371 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!qj;B[I[I)Lclient!hj;")
	public static Class20_Sub2 method2296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100_Sub3 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg1 * arg0];
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg4[local17] + arg0 * local17;
			for (@Pc(29) int local29 = 0; local29 < arg3[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class20_Sub2(arg2, arg0, arg1, local15);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method2297(@OriginalArg(0) int arg0) {
		Static526.anInt8653 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static496.anInt8369; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static357.anInt6390; local6++) {
				if (Static389.aClass346ArrayArrayArray2[arg0][local3][local6] == null) {
					Static389.aClass346ArrayArrayArray2[arg0][local3][local6] = new Class346(arg0);
				}
			}
		}
	}
}
