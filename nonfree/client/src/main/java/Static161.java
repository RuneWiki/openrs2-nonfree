import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_60 = new Class253(103, 7);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)I")
	public static int method2358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(33) int local33 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(38) int local38 = 255 - local7;
		return (((arg0 & 0xFF00FF) * local38 & 0xFF00FF00 | (arg0 & 0xFF00) * local38 & 0xFF0000) >>> 8) + local33;
	}
}
