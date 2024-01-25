import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public static int anInt5934;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	public static int anInt5935;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_83 = new Class146(44, 3);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I")
	public static int method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(26) int local26 = (arg1 * (arg0 & 0xFF00) & 0xFF0000 | arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - arg1;
		return ((local30 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * local30 & 0xFF0000) >>> 8) + local26;
	}
}
