import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!qha", name = "u", descriptor = "I")
	public static int anInt10639;

	@OriginalMember(owner = "client!qha", name = "C", descriptor = "Lclient!wc;")
	public static final Class387 aClass387_11 = new Class387();

	@OriginalMember(owner = "client!qha", name = "A", descriptor = "[I")
	public static final int[] anIntArray606 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(III)Z")
	public static boolean method8978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static113.method3806(arg0, arg1) | (arg0 & 0x70000) != 0 || Static90.method1399(arg1, arg0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!gda;III)Lclient!kc;")
	public static Class197 method8979(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method3086(0, arg1);
		return local16 == null ? null : new Class197(local16);
	}
}
