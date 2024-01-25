import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[32];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)Lclient!ls;")
	public static Class34_Sub7 method5095(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static158.anInt2931 == Static170.anInt3111) {
			return new Class34_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class34_Sub7 local6 = Static660.aClass34_Sub7Array1[Static170.anInt3111];
			Static170.anInt3111 = Static170.anInt3111 + 1 & Static196.anIntArray184[Static87.anInt1807];
			local6.method5097(arg0, arg1);
			return local6;
		}
	}
}
