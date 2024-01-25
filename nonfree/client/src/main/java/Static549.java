import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sia", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[32];

	@OriginalMember(owner = "client!sia", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(IZ)Lclient!sia;")
	public static Class3_Sub7 method7310(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static101.anInt2072 == Static470.anInt7470) {
			return new Class3_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class3_Sub7 local6 = Static649.aClass3_Sub7Array1[Static470.anInt7470];
			Static470.anInt7470 = Static470.anInt7470 + 1 & Static619.anIntArray668[Static290.anInt4596];
			local6.method7305(arg0, arg1);
			return local6;
		}
	}
}
