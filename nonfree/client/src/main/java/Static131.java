import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!em", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[32];

	@OriginalMember(owner = "client!em", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[8];

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Lclient!em;")
	public static Class4_Sub4 method1960(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static8.anInt6060 == Static117.anInt2173) {
			return new Class4_Sub4(arg0, arg1);
		} else {
			@Pc(6) Class4_Sub4 local6 = Static318.aClass4_Sub4Array1[Static117.anInt2173];
			Static117.anInt2173 = Static117.anInt2173 + 1 & Static592.anIntArray562[Static359.anInt6012];
			local6.method1963(arg0, arg1);
			return local6;
		}
	}
}
