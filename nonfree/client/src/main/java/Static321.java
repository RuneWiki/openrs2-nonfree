import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[32];

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[8];

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(IZ)Lclient!kq;")
	public static Class8_Sub5 method4911(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static544.anInt9264 == Static474.anInt8030) {
			return new Class8_Sub5(arg0, arg1);
		} else {
			@Pc(6) Class8_Sub5 local6 = Static387.aClass8_Sub5Array1[Static474.anInt8030];
			Static474.anInt8030 = Static474.anInt8030 + 1 & Static506.anIntArray617[Static554.anInt9335];
			local6.method4909(arg0, arg1);
			return local6;
		}
	}
}
