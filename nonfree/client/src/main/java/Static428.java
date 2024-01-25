import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
	public static int anInt7334;

	@OriginalMember(owner = "client!qda", name = "z", descriptor = "I")
	public static int anInt7331 = 0;

	@OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
	public static int anInt7337 = -1;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BII)Z")
	public static boolean method6153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(20) Class32 local20 = Static541.aClass97_4.method1794(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local20.method561(arg0);
	}
}
