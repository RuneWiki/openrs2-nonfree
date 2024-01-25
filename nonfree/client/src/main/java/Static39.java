import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static39 {

	@OriginalMember(owner = "client!bt", name = "O", descriptor = "[I")
	public static final int[] anIntArray40 = new int[32];

	@OriginalMember(owner = "client!bt", name = "Q", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_3 = new Class183();

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(III)Z")
	public static boolean method688(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
