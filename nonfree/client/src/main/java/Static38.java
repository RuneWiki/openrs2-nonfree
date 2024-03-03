import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
	public static int anInt1043;

	@OriginalMember(owner = "client!ch", name = "kb", descriptor = "I")
	public static int anInt1051;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII)I", line = 14)
	public static int method1305(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub41 local13 = Static349.method6276(arg0, arg1);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray489.length > arg2) {
			return local13.anIntArray489[arg2];
		} else {
			return -1;
		}
	}
}
