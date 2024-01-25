import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static244 {

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
	public static int anInt4223;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_81 = new Class156(135, 1);

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!wca;")
	public static final Class388 aClass388_5 = new Class388();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLclient!dn;)I")
	public static int method3872(@OriginalArg(1) Class86 arg0) {
		if (arg0 == Static104.aClass86_5) {
			return 5120;
		} else if (Static104.aClass86_6 == arg0) {
			return 5122;
		} else if (Static104.aClass86_7 == arg0) {
			return 5124;
		} else if (Static104.aClass86_8 == arg0) {
			return 5121;
		} else if (Static104.aClass86_9 == arg0) {
			return 5123;
		} else if (Static104.aClass86_10 == arg0) {
			return 5125;
		} else if (arg0 == Static104.aClass86_11) {
			return 5131;
		} else if (Static104.aClass86_12 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!rda;)V")
	public static void method3875(@OriginalArg(0) Class4_Sub1 arg0) {
		Static44.aClass100_1.H(arg0.anInt9805, arg0.anInt9797 + (arg0.method8347() >> 1), arg0.anInt9803, Static523.anIntArray477);
		arg0.anInt9796 = Static523.anIntArray477[0];
		arg0.anInt9804 = Static523.anIntArray477[1];
		arg0.anInt9798 = Static523.anIntArray477[2];
	}
}
