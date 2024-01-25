import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray140 = new boolean[8];

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray141 = new boolean[8];

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Lclient!uh;")
	public static Class71_Sub6 method5785(@OriginalArg(0) int arg0) {
		if (Static176.anInt3455 == Static461.anInt5493) {
			return new Class71_Sub6(arg0);
		} else {
			@Pc(6) Class71_Sub6 local6 = Static427.aClass71_Sub6Array1[Static461.anInt5493];
			Static461.anInt5493 = Static461.anInt5493 + 1 & Static129.anIntArray232[Static87.anInt1986];
			local6.method5784(arg0);
			return local6;
		}
	}
}
