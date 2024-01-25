import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!tk", name = "G", descriptor = "Lclient!pk;")
	public static Class262 aClass262_4;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_12 = new Class266(11, -1);

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)Z")
	public static boolean method7645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static37.method811(arg0, arg1) || Static439.method6540(arg1, arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)V")
	public static void method7647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static158.anInt3597 != 0) {
			if (arg0 < 0) {
				for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
					Static236.anIntArray320[local17] = arg1;
				}
			} else {
				Static236.anIntArray320[arg0] = arg1;
			}
		}
		Static489.aClass2_Sub2_Sub1_4.method158(arg1, arg0);
	}
}
