import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "Lclient!hka;")
	public static Class3_Sub30 aClass3_Sub30_4;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!aka;")
	public static RuntimeException_Sub1 method3560(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
