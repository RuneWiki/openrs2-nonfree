import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static667 {

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!rla;")
	public static Class325 aClass325_8;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
	public static final int[] anIntArray598 = new int[3];

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!iga;")
	public static Class169 aClass169_8 = null;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Z")
	public static boolean method8875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!lb;Lclient!lb;IB)V")
	public static void method8876(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class221 arg1) {
		Static673.aClass221_159 = arg0;
		Static365.aClass221_102 = arg1;
	}
}
