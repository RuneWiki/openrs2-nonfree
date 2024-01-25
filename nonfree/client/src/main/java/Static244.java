import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray35 = new boolean[8];

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray36 = new boolean[8];

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)Lclient!jw;")
	public static Class7_Sub3 method4191(@OriginalArg(0) int arg0) {
		if (Static72.anInt1748 == Static387.anInt7356) {
			return new Class7_Sub3(arg0);
		} else {
			@Pc(6) Class7_Sub3 local6 = Static193.aClass7_Sub3Array1[Static387.anInt7356];
			Static387.anInt7356 = Static387.anInt7356 + 1 & Static270.anIntArray597[Static324.anInt6094];
			local6.method4197(arg0);
			return local6;
		}
	}
}
