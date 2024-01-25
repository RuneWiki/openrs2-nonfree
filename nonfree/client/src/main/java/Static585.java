import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[32];

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(IZ)Lclient!tn;")
	public static Class4_Sub9 method8058(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static555.anInt8749 == Static661.anInt10753) {
			return new Class4_Sub9(arg0, arg1);
		} else {
			@Pc(6) Class4_Sub9 local6 = Static68.aClass4_Sub9Array3[Static661.anInt10753];
			Static661.anInt10753 = Static661.anInt10753 + 1 & Static445.anIntArray379[Static378.anInt6342];
			local6.method8054(arg0, arg1);
			return local6;
		}
	}
}
