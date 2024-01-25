import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[32];

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)Lclient!ta;")
	public static Class4_Sub10 method7851(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static563.anInt9404 == Static401.anInt7429) {
			return new Class4_Sub10(arg0, arg1);
		} else {
			@Pc(6) Class4_Sub10 local6 = Static429.aClass4_Sub10Array1[Static401.anInt7429];
			Static401.anInt7429 = Static401.anInt7429 + 1 & Static256.anIntArray247[Static449.anInt7994];
			local6.method7854(arg0, arg1);
			return local6;
		}
	}
}
