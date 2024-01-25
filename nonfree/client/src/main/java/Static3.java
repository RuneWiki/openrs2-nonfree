import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!gl;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt108 = 1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static int anInt111 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ne;I)Z")
	public static boolean method107(@OriginalArg(0) Class146 arg0) {
		if (arg0.anInt4198 == 205) {
			Static336.anInt6486 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!og;")
	public static RuntimeException_Sub1 method108(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString166 = local9.aString166 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
