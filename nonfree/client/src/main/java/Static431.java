import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
	public static final int[] anIntArray599 = new int[4096];

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
	public static int anInt7385 = 0;

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "[I")
	public static final int[] anIntArray601 = new int[13];

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
	public static final int anInt7389 = 1337;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)Lclient!br;")
	public static Class4_Sub1_Sub5 method5935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class4_Sub1_Sub5 local20 = (Class4_Sub1_Sub5) Static149.aClass96_19.method2797((long) arg0 << 32 | (long) arg1);
		if (local20 == null) {
			local20 = new Class4_Sub1_Sub5(arg0, arg1);
			Static149.aClass96_19.method2805(local20.aLong228, local20);
		}
		return local20;
	}
}
