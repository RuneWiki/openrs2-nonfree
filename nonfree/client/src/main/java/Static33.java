import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "[I")
	public static final int[] anIntArray649 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bea", name = "z", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
	public static void method5998() {
		for (@Pc(11) int local11 = 0; local11 < Static379.aByteArrayArrayArray13.length; local11++) {
			for (@Pc(15) int local15 = 0; local15 < Static379.aByteArrayArrayArray13[0].length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static379.aByteArrayArrayArray13[0][0].length; local19++) {
					Static379.aByteArrayArrayArray13[local11][local15][local19] = 0;
				}
			}
		}
	}
}
