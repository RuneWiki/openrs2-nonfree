import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!io", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[32];

	@OriginalMember(owner = "client!io", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)Lclient!io;")
	public static Class60_Sub4 method3576(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static23.anInt421 == Static77.anInt1326) {
			return new Class60_Sub4(arg0, arg1);
		} else {
			@Pc(6) Class60_Sub4 local6 = Static56.aClass60_Sub4Array1[Static77.anInt1326];
			Static77.anInt1326 = Static77.anInt1326 + 1 & Static45.anIntArray34[Static345.anInt6520];
			local6.method3585(arg0, arg1);
			return local6;
		}
	}
}
