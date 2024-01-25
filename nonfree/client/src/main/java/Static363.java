import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[32];

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)Lclient!oa;")
	public static Class11_Sub9 method5341(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static234.anInt4321 == Static349.anInt6424) {
			return new Class11_Sub9(arg0, arg1);
		} else {
			@Pc(6) Class11_Sub9 local6 = Static135.aClass11_Sub9Array1[Static349.anInt6424];
			Static349.anInt6424 = Static349.anInt6424 + 1 & Static188.anIntArray182[Static129.anInt2578];
			local6.method5351(arg0, arg1);
			return local6;
		}
	}
}
