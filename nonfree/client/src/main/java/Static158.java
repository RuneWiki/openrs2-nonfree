import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!jq", name = "hb", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!jq", name = "wb", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!jq", name = "Db", descriptor = "[I")
	public static final int[] anIntArray520 = new int[5];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ef;")
	public static RuntimeException_Sub1 method4814(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString8 = local12.aString8 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
