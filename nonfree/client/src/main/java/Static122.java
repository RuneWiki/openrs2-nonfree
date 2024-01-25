import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!et", name = "gb", descriptor = "Lclient!nea;")
	public static Class235 aClass235_80;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_79 = new Class235(39, 4);

	@OriginalMember(owner = "client!et", name = "I", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!et", name = "P", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IBI)V")
	public static void method1913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (Static279.anInt4906 != arg0) {
			Static557.anIntArray708 = new int[arg0];
			for (local14 = 0; local14 < arg0; local14++) {
				Static557.anIntArray708[local14] = (local14 << 12) / arg0;
			}
			Static533.anInt8941 = arg0 * 32;
			Static216.anInt4134 = arg0 - 1;
			Static279.anInt4906 = arg0;
		}
		if (arg1 == Static52.anInt1010) {
			return;
		}
		if (Static279.anInt4906 == arg1) {
			Static445.anIntArray590 = Static557.anIntArray708;
		} else {
			Static445.anIntArray590 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static445.anIntArray590[local14] = (local14 << 12) / arg1;
			}
		}
		Static52.anInt1010 = arg1;
		Static171.anInt3020 = arg1 - 1;
	}
}
