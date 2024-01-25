import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!ke;")
	public static final Class137 aClass137_28 = new Class137(16);

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_42 = new Class220(8);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZI)I")
	public static int method4251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class6_Sub1_Sub18.anIntArray643[arg0 * 8192 / arg1] >> 1;
		return (arg2 * local20 >> 16) + (arg3 * (65536 - local20) >> 16);
	}
}
