import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static695 {

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "Lclient!nca;")
	public static Class254 aClass254_165;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "D")
	public static double aDouble60 = -1.0D;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public static void method9350(@OriginalArg(0) int arg0) {
		Static726.anInt11286 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static372.anInt5930; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static545.anInt8590; local6++) {
				if (Static632.aClass311ArrayArrayArray3[arg0][local3][local6] == null) {
					Static632.aClass311ArrayArrayArray3[arg0][local3][local6] = new Class311(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(BI)V")
	public static void method9351(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub44 local10 = (Class2_Sub44) Static426.aClass218_29.method5095((long) arg0, 0);
		if (local10 != null) {
			local10.aBoolean620 = !local10.aBoolean620;
			local10.aClass156_Sub1_1.method3420(local10.aBoolean620);
		}
	}
}
