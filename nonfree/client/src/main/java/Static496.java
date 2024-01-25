import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray40 = new boolean[8];

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray41 = new boolean[32];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)Lclient!tp;")
	public static Class102_Sub6 method6833(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static58.anInt957 == Static303.anInt4926) {
			return new Class102_Sub6(arg0, arg1);
		} else {
			@Pc(6) Class102_Sub6 local6 = Static450.aClass102_Sub6Array1[Static303.anInt4926];
			Static303.anInt4926 = Static303.anInt4926 + 1 & Static25.anIntArray37[Static353.anInt6214];
			local6.method6843(arg0, arg1);
			return local6;
		}
	}
}
