import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray35 = new boolean[8];

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray36 = new boolean[8];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Lclient!ts;")
	public static Class46_Sub7 method7410(@OriginalArg(0) int arg0) {
		if (Static153.anInt3001 == Static256.anInt5004) {
			return new Class46_Sub7(arg0);
		} else {
			@Pc(6) Class46_Sub7 local6 = Static355.aClass46_Sub7Array1[Static256.anInt5004];
			Static256.anInt5004 = Static256.anInt5004 + 1 & Static154.anIntArray263[Static431.anInt7490];
			local6.method7419(arg0);
			return local6;
		}
	}
}
