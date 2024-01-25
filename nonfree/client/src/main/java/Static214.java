import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
	public static final int anInt4151 = 12;

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vj;")
	public static RuntimeException_Sub1 method3371(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString62 = local9.aString62 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
