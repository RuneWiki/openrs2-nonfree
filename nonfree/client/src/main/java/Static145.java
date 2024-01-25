import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "Lclient!eq;")
	public static Class97 aClass97_36;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
	public static void method2795(@OriginalArg(0) byte arg0) {
		if (Static198.aByteArrayArrayArray8 == null) {
			Static198.aByteArrayArrayArray8 = new byte[4][Static3.anInt46][Static270.anInt5194];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(21) int local21 = 0; local21 < Static3.anInt46; local21++) {
				for (@Pc(24) int local24 = 0; local24 < Static270.anInt5194; local24++) {
					Static198.aByteArrayArrayArray8[local18][local21][local24] = arg0;
				}
			}
		}
	}
}
