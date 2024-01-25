import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[32];

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)Lclient!uj;")
	public static Class3_Sub9 method8577(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static551.anInt3120 == Static184.anInt4423) {
			return new Class3_Sub9(arg0, arg1);
		} else {
			@Pc(6) Class3_Sub9 local6 = Static99.aClass3_Sub9Array1[Static184.anInt4423];
			Static184.anInt4423 = Static184.anInt4423 + 1 & Static480.anIntArray442[Static173.anInt4169];
			local6.method8582(arg0, arg1);
			return local6;
		}
	}
}
