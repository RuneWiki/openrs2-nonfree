import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public static int anInt4964;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V")
	public static void method3731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class147 local3 = Static117.method3397(arg1);
		@Pc(10) int local10 = local3.anInt4983;
		@Pc(20) int local20 = local3.anInt4988;
		@Pc(23) int local23 = local3.anInt4982;
		@Pc(30) int local30 = Class2_Sub2.anIntArray50[local20 - local23];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local23;
		Static11.method306(Static296.anIntArray530[local10] & ~local30 | local30 & arg0 << local23, local10);
	}
}
