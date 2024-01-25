import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public static int anInt3443 = -1;

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "Lclient!te;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2740(@OriginalArg(1) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static349.aStringArray41.length; local14++) {
			if (Static349.aStringArray41[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}
}
