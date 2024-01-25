import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
	public static boolean aBoolean524;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public static int anInt7368;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!su;")
	public static RuntimeException_Sub1 method6000(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString71 = local12.aString71 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
