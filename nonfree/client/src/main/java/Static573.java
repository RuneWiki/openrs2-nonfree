import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static573 {

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "[I")
	public static int[] anIntArray708;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "Lclient!tga;")
	public static final Class315 aClass315_9 = new Class315("LOCAL", 4);

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)Z")
	public static boolean method7820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
