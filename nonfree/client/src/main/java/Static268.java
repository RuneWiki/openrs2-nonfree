import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!h;")
	public static final Class125 aClass125_41 = new Class125(5);

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public static int anInt5393 = 0;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
	public static final int[] anIntArray378 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
	public static boolean method4555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class279 local8 = Static49.aClass155_2.method4063(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local8.method6877(arg1);
	}
}
