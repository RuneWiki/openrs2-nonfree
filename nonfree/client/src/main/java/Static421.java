import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[32];

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)Lclient!ms;")
	public static Class9_Sub5 method5577(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static647.anInt9986 == Static102.anInt2169) {
			return new Class9_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class9_Sub5 local6 = Static374.aClass9_Sub5Array1[Static102.anInt2169];
			Static102.anInt2169 = Static102.anInt2169 + 1 & Static280.anIntArray333[Static233.anInt3759];
			local6.method5582(arg0, arg1);
			return local6;
		}
	}
}
