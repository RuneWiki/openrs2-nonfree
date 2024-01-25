import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[32];

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[8];

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(IZ)Lclient!oi;")
	public static Class19_Sub9 method6772(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static330.anInt5785 == Static343.anInt5896) {
			return new Class19_Sub9(arg0, arg1);
		} else {
			@Pc(6) Class19_Sub9 local6 = Static579.aClass19_Sub9Array2[Static343.anInt5896];
			Static343.anInt5896 = Static343.anInt5896 + 1 & Static31.anIntArray431[Static284.anInt5151];
			local6.method6775(arg0, arg1);
			return local6;
		}
	}
}
