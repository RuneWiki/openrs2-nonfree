import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dia", name = "x", descriptor = "I")
	public static int anInt2662;

	@OriginalMember(owner = "client!dia", name = "G", descriptor = "I")
	public static int anInt2668;

	@OriginalMember(owner = "client!dia", name = "Y", descriptor = "I")
	public static int anInt2681;

	@OriginalMember(owner = "client!dia", name = "sb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!dia", name = "db", descriptor = "[I")
	public static final int[] anIntArray129 = new int[8];

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!rr;)V")
	public static void method2279(@OriginalArg(0) Class15_Sub1 arg0) {
		Static269.aClass16_11.H(arg0.anInt10301, arg0.anInt10297 + (arg0.method8326() >> 1), arg0.anInt10298, Static362.anIntArray386);
		arg0.anInt10300 = Static362.anIntArray386[0];
		arg0.anInt10302 = Static362.anIntArray386[1];
		arg0.anInt10304 = Static362.anIntArray386[2];
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(B)V")
	public static void method2295() {
		for (@Pc(11) int local11 = 0; local11 < Static118.aByteArrayArrayArray20.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static118.aByteArrayArrayArray20[0].length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static118.aByteArrayArrayArray20[0][0].length; local19++) {
					Static118.aByteArrayArrayArray20[local11][local15][local19] = 0;
				}
			}
		}
	}
}
