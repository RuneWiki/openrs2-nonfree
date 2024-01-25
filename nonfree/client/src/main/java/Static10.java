import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
	public static int anInt296 = 0;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(BLclient!rr;)V")
	public static void method236(@OriginalArg(1) Class292 arg0) {
		@Pc(11) Class292 local11 = Static264.method4416(arg0);
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (local11 == null) {
			local15 = Static240.anInt4852;
			local17 = Static196.anInt4059;
		} else {
			local17 = local11.anInt7912;
			local15 = local11.anInt7963;
		}
		Static438.method6241(local15, false, local17, arg0);
		Static422.method6089(arg0, local17, local15);
	}
}
