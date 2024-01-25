import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Lclient!kr;")
	public static Class171 aClass171_47;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!ha;")
	public static Class2 aClass2_16;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBII)I")
	public static int method2241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = 255 - arg0;
		@Pc(33) int local33 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg1 & 0xFF00) * local15 & 0xFF0000 | local15 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local33;
	}
}
