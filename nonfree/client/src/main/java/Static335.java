import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public static int anInt3038;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	public static int anInt3041;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static int anInt3040 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)I")
	public static int method2593(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = local15 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}
}
