import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!v;")
	public static Class244 aClass244_3;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!dn;")
	public static Class56 aClass56_10;

	@OriginalMember(owner = "client!au", name = "m", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	public static void method568() {
		for (@Pc(8) int local8 = 0; local8 < Static325.aByteArrayArrayArray15.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static325.aByteArrayArrayArray15[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static325.aByteArrayArrayArray15[0][0].length; local16++) {
					Static325.aByteArrayArrayArray15[local8][local12][local16] = 0;
				}
			}
		}
	}
}
