import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public static int anInt3049 = -1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
	public static int method2811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(35) int local35 = ((arg1 & 0xFF00FF) * local7 & 0xFF00FF00 | local7 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local12 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8) + local35;
	}
}
