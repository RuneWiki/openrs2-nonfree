import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static int anInt11166 = -1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Lclient!nt;")
	public static Class270 method9504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class270 local13 = Static254.method3544(arg1);
		if (arg0 == -1) {
			return local13;
		} else if (local13 == null || local13.aClass270Array3 == null || local13.aClass270Array3.length <= arg0) {
			return null;
		} else {
			return local13.aClass270Array3[arg0];
		}
	}
}
