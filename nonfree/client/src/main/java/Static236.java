import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[32];

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(IZ)Lclient!iu;")
	public static Class25_Sub7 method3776(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static520.anInt9166 == Static447.anInt7896) {
			return new Class25_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class25_Sub7 local6 = Static541.aClass25_Sub7Array1[Static447.anInt7896];
			Static447.anInt7896 = Static447.anInt7896 + 1 & Static357.anIntArray353[Static80.anInt2134];
			local6.method3779(arg0, arg1);
			return local6;
		}
	}
}
