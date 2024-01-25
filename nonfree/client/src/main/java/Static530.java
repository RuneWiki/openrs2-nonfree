import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public static int anInt9010;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public static int anInt9013;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!qb;")
	public static RuntimeException_Sub1 method7398(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString85 = local9.aString85 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
