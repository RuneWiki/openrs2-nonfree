import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[32];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)Lclient!ii;")
	public static Class20_Sub5 method3658(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static469.anInt7951 == Static134.anInt9523) {
			return new Class20_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class20_Sub5 local6 = Static400.aClass20_Sub5Array2[Static134.anInt9523];
			Static134.anInt9523 = Static134.anInt9523 + 1 & Static504.anIntArray578[Static341.anInt6056];
			local6.method3669(arg0, arg1);
			return local6;
		}
	}
}
