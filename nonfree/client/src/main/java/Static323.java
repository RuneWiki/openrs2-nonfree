import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "Lclient!fc;")
	public static Class71 aClass71_74;

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "Lclient!fc;")
	public static Class71 aClass71_75;

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
	public static int anInt5674;

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "[I")
	public static int[] anIntArray696 = new int[2];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Lclient!ba;")
	public static Class2_Sub1_Sub2 method4982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class2_Sub1_Sub2 local20 = (Class2_Sub1_Sub2) Static269.aClass214_27.method5059((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class2_Sub1_Sub2(arg1, arg0);
			Static269.aClass214_27.method5065(local20.aLong208, local20);
		}
		return local20;
	}
}
