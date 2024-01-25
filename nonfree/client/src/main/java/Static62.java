import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cca", name = "kd", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_20 = new Class337(101, 7);

	@OriginalMember(owner = "client!cca", name = "yd", descriptor = "I")
	public static int anInt1300 = 100;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method1038(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = local8 + ": ";
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = local6[local8] + arg0[local8];
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(III)Z")
	public static boolean method1043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static586.method8462(arg1, arg0) | Static206.method3569(arg0, arg1) | Static390.method5791(arg0, arg1)) & Static549.method8015(arg1, arg0);
	}
}
