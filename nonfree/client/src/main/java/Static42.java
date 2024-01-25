import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
	public static int anInt630;

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "Lclient!o;")
	public static Class85 aClass85_5;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
	public static final int anInt629 = 1339;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZIZ)I")
	public static int method579(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class1_Sub28 local13 = Static133.method1698(arg1, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray292.length) {
			return local13.anIntArray292[arg0];
		} else {
			return 0;
		}
	}
}
