import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pba", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray122 = new boolean[32];

	@OriginalMember(owner = "client!pba", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray123 = new boolean[8];

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZ)Lclient!pba;")
	public static Class13_Sub9 method5656(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static7.anInt93 == Static116.anInt2105) {
			return new Class13_Sub9(arg0, arg1);
		} else {
			@Pc(6) Class13_Sub9 local6 = Static382.aClass13_Sub9Array1[Static116.anInt2105];
			Static116.anInt2105 = Static116.anInt2105 + 1 & Static215.anIntArray237[Static504.anInt8146];
			local6.method5658(arg0, arg1);
			return local6;
		}
	}
}
