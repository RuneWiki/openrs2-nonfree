import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static int anInt3541;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIB)I", line = 5)
	public static int method3507(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub41 local10 = Static349.method6276(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray488.length; local32++) {
				if (arg2 == local10.anIntArray489[local32]) {
					local22 += local10.anIntArray488[local32];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 52)
	public static void method3509() {
		Class11_Sub5_Sub2_Sub1.aClass98_37.method2616();
	}
}
