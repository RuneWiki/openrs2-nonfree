import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!f", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[8];

	@OriginalMember(owner = "client!f", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[32];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Lclient!f;")
	public static Class11_Sub4 method2640(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static208.anInt4358 == Static308.anInt5657) {
			return new Class11_Sub4(arg0, arg1);
		} else {
			@Pc(6) Class11_Sub4 local6 = Static73.aClass11_Sub4Array1[Static308.anInt5657];
			Static308.anInt5657 = Static308.anInt5657 + 1 & Static304.anIntArray381[Static97.anInt1908];
			local6.method2641(arg0, arg1);
			return local6;
		}
	}
}
