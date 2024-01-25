import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	public static int anInt4604 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIZ)V")
	public static void method4024(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) Class1_Sub49 local15 = Static393.method5919(arg1, arg0);
		if (local15 != null) {
			local15.method7983();
		}
	}
}
