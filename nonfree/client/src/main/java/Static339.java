import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_114 = new Class151(59, 0);

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)I")
	public static int method4624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}
}
