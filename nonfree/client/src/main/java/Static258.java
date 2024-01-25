import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	public static int anInt7178;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
	public static int anInt7179 = 0;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZ)Lclient!ae;")
	public static Class1_Sub2_Sub1 method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class1_Sub2_Sub1 local20 = (Class1_Sub2_Sub1) Static215.aClass27_26.method553((long) arg1 << 32 | (long) arg0);
		if (local20 == null) {
			local20 = new Class1_Sub2_Sub1(arg1, arg0);
			Static215.aClass27_26.method564(local20.aLong227, local20);
		}
		return local20;
	}
}
