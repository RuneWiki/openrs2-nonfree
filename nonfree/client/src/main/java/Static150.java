import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!f", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[32];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Lclient!f;")
	public static Class23_Sub5 method2583(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static673.anInt7817 == Static247.anInt4594) {
			return new Class23_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class23_Sub5 local6 = Static124.aClass23_Sub5Array1[Static247.anInt4594];
			Static247.anInt4594 = Static247.anInt4594 + 1 & Static241.anIntArray294[Static200.anInt3634];
			local6.method2584(arg0, arg1);
			return local6;
		}
	}
}
