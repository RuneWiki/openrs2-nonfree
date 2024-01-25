import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray44 = new boolean[8];

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray45 = new boolean[32];

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(IZ)Lclient!sp;")
	public static Class28_Sub7 method7916(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static449.anInt7433 == Static198.anInt10720) {
			return new Class28_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class28_Sub7 local6 = Static208.aClass28_Sub7Array1[Static198.anInt10720];
			Static198.anInt10720 = Static198.anInt10720 + 1 & Static292.anIntArray444[Static351.anInt5714];
			local6.method7920(arg0, arg1);
			return local6;
		}
	}
}
