import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Lclient!td;")
	public static Class333 aClass333_6;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "[[[Lclient!cja;")
	public static Class58[][][] aClass58ArrayArrayArray2;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
	public static int anInt8727 = 0;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "[Lclient!fb;")
	public static final Class12_Sub2_Sub2_Sub1_Sub2[] aClass12_Sub2_Sub2_Sub1_Sub2Array1 = new Class12_Sub2_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	public static void method7230() {
		Static184.method2922(Static677.aClass137_47, (long) Static87.anInt1951);
		if (Static563.anInt9769 != -1) {
			Static568.method8170(Static563.anInt9769);
		}
		for (@Pc(26) int local26 = 0; local26 < Static599.anInt6161; local26++) {
			if (Static446.aBooleanArray18[local26]) {
				Static337.aBooleanArray16[local26] = true;
			}
			Static50.aBooleanArray4[local26] = Static446.aBooleanArray18[local26];
			Static446.aBooleanArray18[local26] = false;
		}
		Static624.anInt10508 = Static87.anInt1951;
		if (Static563.anInt9769 != -1) {
			Static599.anInt6161 = 0;
			Static577.method8246();
		}
		Static677.aClass137_47.la();
		Static485.method6448(Static677.aClass137_47);
		@Pc(67) int local67 = Static251.method3687();
		if (local67 == -1) {
			local67 = Static416.anInt7542;
		}
		if (local67 == -1) {
			local67 = Static139.anInt2651;
		}
		Static543.method7677(local67);
		Static475.anInt8259 = 0;
	}
}
