import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static397 {

	@OriginalMember(owner = "client!of", name = "K", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_102 = new Class130(31, 16);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)I")
	public static int method6415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static142.anIntArray551[arg0 & 0x3] : Static407.anIntArray453[arg0 & 0x3];
	}
}
