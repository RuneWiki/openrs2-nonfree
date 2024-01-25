import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[8];

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[32];

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(IZ)Lclient!gp;")
	public static Class9_Sub6 method3058(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static537.anInt4383 == Static516.anInt8174) {
			return new Class9_Sub6(arg0, arg1);
		} else {
			@Pc(6) Class9_Sub6 local6 = Static397.aClass9_Sub6Array1[Static516.anInt8174];
			Static516.anInt8174 = Static516.anInt8174 + 1 & Static26.anIntArray657[Static190.anInt3685];
			local6.method3050(arg0, arg1);
			return local6;
		}
	}
}
