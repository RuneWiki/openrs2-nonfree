import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static623 {

	@OriginalMember(owner = "client!we", name = "o", descriptor = "[I")
	public static final int[] anIntArray683 = new int[8];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
	public static boolean method8331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static297.method4098(arg1, arg0) || Static293.method4047(arg1, arg0);
	}
}
