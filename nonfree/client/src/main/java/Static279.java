import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray33 = new boolean[8];

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray34 = new boolean[32];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Lclient!lm;")
	public static Class72_Sub4 method4523(@OriginalArg(0) int arg0) {
		if (Static115.anInt2354 == Static371.anInt6837) {
			return new Class72_Sub4(arg0);
		} else {
			@Pc(6) Class72_Sub4 local6 = Static487.aClass72_Sub4Array1[Static371.anInt6837];
			Static371.anInt6837 = Static371.anInt6837 + 1 & Static74.anIntArray157[Static69.anInt1331];
			local6.method4525(arg0);
			return local6;
		}
	}
}
