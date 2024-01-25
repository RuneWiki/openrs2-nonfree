import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray37 = new boolean[8];

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray38 = new boolean[32];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZ)Lclient!tq;")
	public static Class6_Sub8 method7156(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static568.anInt9291 == Static501.anInt8413) {
			return new Class6_Sub8(arg0, arg1);
		} else {
			@Pc(6) Class6_Sub8 local6 = Static78.aClass6_Sub8Array5[Static501.anInt8413];
			Static501.anInt8413 = Static501.anInt8413 + 1 & Static180.anIntArray214[Static206.anInt3999];
			local6.method7158(arg0, arg1);
			return local6;
		}
	}
}
