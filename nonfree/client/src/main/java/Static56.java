import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIB)Z")
	public static boolean method1040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class129 local13 = Static505.aClass206_4.method5326(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local13.method3274(arg0);
	}
}
