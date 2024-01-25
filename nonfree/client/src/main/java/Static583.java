import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!hc;")
	public static Class150 aClass150_2;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
	public static int[] anIntArray646;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bi;")
	public static RuntimeException_Sub1 method7521(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString18 = local9.aString18 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
