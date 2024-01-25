import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "[Lclient!lfa;")
	public static Interface15[] anInterface15Array1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBI)I")
	public static int method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg2;
		@Pc(31) int local31 = (arg2 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		return ((local13 * (arg0 & 0xFF00) & 0xFF0000 | local13 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local31;
	}
}
