import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[32];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)Lclient!hm;")
	public static Class5_Sub2 method3777(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static298.anInt5669 == Static249.anInt5084) {
			return new Class5_Sub2(arg0, arg1);
		} else {
			@Pc(6) Class5_Sub2 local6 = Static118.aClass5_Sub2Array1[Static249.anInt5084];
			Static249.anInt5084 = Static249.anInt5084 + 1 & Static429.anIntArray566[Static217.anInt3896];
			local6.method3785(arg0, arg1);
			return local6;
		}
	}
}
