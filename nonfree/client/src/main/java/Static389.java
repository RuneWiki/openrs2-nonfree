import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_100 = new Class252(57, 6);

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
	public static int anInt6904 = 0;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "[I")
	public static final int[] anIntArray672 = new int[32];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIZ)I")
	public static int method6230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub8 local8 = Static271.method4828(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray119.length) {
			return local8.anIntArray119[arg0];
		} else {
			return 0;
		}
	}
}
