import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
	public static int anInt3453;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
	public static int anInt3460 = 0;

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)V")
	public static void method2860(@OriginalArg(1) byte arg0) {
		if (Static12.aByteArrayArrayArray1 == null) {
			Static12.aByteArrayArrayArray1 = new byte[4][Static326.anInt5666][Static283.anInt5187];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < Static326.anInt5666; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static283.anInt5187; local26++) {
					Static12.aByteArrayArrayArray1[local18][local22][local26] = arg0;
				}
			}
		}
	}
}
