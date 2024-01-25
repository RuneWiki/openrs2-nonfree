import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "[I")
	public static final int[] anIntArray351 = new int[5];

	@OriginalMember(owner = "client!nk", name = "Hb", descriptor = "Lclient!fca;")
	public static final Class97 aClass97_38 = new Class97(3);

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
	public static void method5698() {
		for (@Pc(7) int local7 = 0; local7 < Static262.aByteArrayArrayArray16.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static262.aByteArrayArrayArray16[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static262.aByteArrayArrayArray16[0][0].length; local15++) {
					Static262.aByteArrayArrayArray16[local7][local11][local15] = 0;
				}
			}
		}
	}
}
