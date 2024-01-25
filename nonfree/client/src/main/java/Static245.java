import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_93 = new Class109(72, 1);

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	public static final int anInt4244 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	public static void method3621(@OriginalArg(0) byte arg0) {
		if (Static240.aByteArrayArrayArray15 == null) {
			Static240.aByteArrayArrayArray15 = new byte[4][Static544.anInt9261][Static282.anInt4887];
		}
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			for (@Pc(28) int local28 = 0; local28 < Static544.anInt9261; local28++) {
				for (@Pc(32) int local32 = 0; local32 < Static282.anInt4887; local32++) {
					Static240.aByteArrayArrayArray15[local24][local28][local32] = arg0;
				}
			}
		}
	}
}
