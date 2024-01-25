import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(II)Lclient!afa;")
	public static Class12 method8442(@OriginalArg(0) int arg0) {
		@Pc(15) Class12[] local15 = Static115.method2521();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class12 local23 = local15[local17];
			if (local23.anInt526 == arg0) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[F)[F")
	public static float[] method8443(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static653.method6540(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
