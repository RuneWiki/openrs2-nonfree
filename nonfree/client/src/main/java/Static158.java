import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
	public static int anInt2968;

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIZ)I")
	public static int method2725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class3_Sub29 local13 = Static577.method7771(arg2, arg0);
		if (local13 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local13.anIntArray354.length) {
			return local13.anIntArray354[arg1];
		} else {
			return 0;
		}
	}
}
