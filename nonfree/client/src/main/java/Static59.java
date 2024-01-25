import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
	public static int anInt1169;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "[I")
	public static final int[] anIntArray54 = new int[2048];

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZIZ)I")
	public static int method1037(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class1_Sub43 local13 = Static346.method4702(arg0, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg1 >= 0 && local13.anIntArray506.length > arg1) {
			return local13.anIntArray506[arg1];
		} else {
			return 0;
		}
	}
}
