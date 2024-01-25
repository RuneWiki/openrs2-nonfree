import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BIZ)V")
	public static void method1174(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) Class4_Sub30 local12 = Static289.method4604(arg0, arg1);
		if (local12 != null) {
			local12.method8193();
		}
	}
}
