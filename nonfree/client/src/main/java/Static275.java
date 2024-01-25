import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!l", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[8];

	@OriginalMember(owner = "client!l", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[32];

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)Lclient!l;")
	public static Class98_Sub3 method4528(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static178.anInt3720 == Static521.anInt8749) {
			return new Class98_Sub3(arg0, arg1);
		} else {
			@Pc(6) Class98_Sub3 local6 = Static181.aClass98_Sub3Array1[Static521.anInt8749];
			Static521.anInt8749 = Static521.anInt8749 + 1 & Static545.anIntArray691[Static92.anInt1780];
			local6.method4542(arg0, arg1);
			return local6;
		}
	}
}
