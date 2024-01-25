import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pu", name = "P", descriptor = "Lclient!dk;")
	public static Class54 aClass54_86;

	@OriginalMember(owner = "client!pu", name = "R", descriptor = "I")
	public static int anInt5459;

	@OriginalMember(owner = "client!pu", name = "L", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_156 = new Class102(21, 8);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZII)Lclient!mc;")
	public static Class2_Sub5_Sub11 method4316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class2_Sub5_Sub11 local20 = (Class2_Sub5_Sub11) Static310.aClass72_34.method1659((long) arg1 | (long) arg0 << 32);
		if (local20 == null) {
			local20 = new Class2_Sub5_Sub11(arg0, arg1);
			Static310.aClass72_34.method1653(local20, local20.aLong225);
		}
		return local20;
	}
}
