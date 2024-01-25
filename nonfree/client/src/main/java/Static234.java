import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
	public static int anInt4226 = 0;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BIZ)V")
	public static void method3525(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class1_Sub14 local8 = Static48.method871(arg1, arg0);
		if (local8 != null) {
			local8.method6020();
		}
	}
}
