import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[32];

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IZ)Lclient!pd;")
	public static Class15_Sub8 method6545(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static593.anInt10150 == Static158.anInt3981) {
			return new Class15_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class15_Sub8 local6 = Static507.aClass15_Sub8Array1[Static158.anInt3981];
			Static158.anInt3981 = Static158.anInt3981 + 1 & Static562.anIntArray534[Static203.anInt4658];
			local6.method6533(arg0, arg1);
			return local6;
		}
	}
}
