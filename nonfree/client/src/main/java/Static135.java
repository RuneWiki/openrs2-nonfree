import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_140 = new Class252(80, -1);

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
	public static final int[] anIntArray834 = new int[8];

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "F")
	public static float aFloat193 = 0.0F;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)Z")
	public static boolean method8180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
