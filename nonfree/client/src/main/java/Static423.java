import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray39 = new boolean[32];

	@OriginalMember(owner = "client!paa", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray40 = new boolean[8];

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)Lclient!paa;")
	public static Class20_Sub8 method6632(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static323.anInt6179 == Static514.anInt9008) {
			return new Class20_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class20_Sub8 local6 = Static385.aClass20_Sub8Array1[Static514.anInt9008];
			Static514.anInt9008 = Static514.anInt9008 + 1 & Static296.anIntArray354[Static544.anInt9351];
			local6.method6640(arg0, arg1);
			return local6;
		}
	}
}
