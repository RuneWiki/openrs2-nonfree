import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "Lclient!lm;")
	public static Class134 aClass134_8;

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
	public static int anInt339 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Lclient!rl;")
	public static Class1_Sub2_Sub15 method307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) Class1_Sub2_Sub15 local22 = (Class1_Sub2_Sub15) Static250.aClass207_31.method5555((long) arg0 << 32 | (long) arg1);
		if (local22 == null) {
			local22 = new Class1_Sub2_Sub15(arg0, arg1);
			Static250.aClass207_31.method5552(local22, local22.aLong214);
		}
		return local22;
	}
}
