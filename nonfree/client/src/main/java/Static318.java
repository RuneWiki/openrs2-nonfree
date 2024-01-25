import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[32];

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZ)Lclient!mca;")
	public static Class8_Sub7 method4392(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static29.anInt423 == Static269.anInt4736) {
			return new Class8_Sub7(arg0, arg1);
		} else {
			@Pc(6) Class8_Sub7 local6 = Static341.aClass8_Sub7Array2[Static269.anInt4736];
			Static269.anInt4736 = Static269.anInt4736 + 1 & Static571.anIntArray714[Static390.anInt6750];
			local6.method4395(arg0, arg1);
			return local6;
		}
	}
}
