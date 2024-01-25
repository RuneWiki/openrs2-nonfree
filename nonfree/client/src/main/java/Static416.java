import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "Z")
	public static boolean aBoolean573 = false;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!r;Lclient!is;)V")
	public static void method6243(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(31) boolean local31 = Static338.aClass29_1.method981(arg1.anInt4745, arg1.anInt4742, arg1.anInt4823 | 0xFF000000, arg1.aBoolean335 ? Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aClass206_1 : null, arg0, arg1.anInt4749, arg1.anInt4785) == null;
		if (local31) {
			Static393.aClass22_52.method894(new Class4_Sub19(arg1.anInt4785, arg1.anInt4742, arg1.anInt4749, arg1.anInt4823 | 0xFF000000, arg1.anInt4745, arg1.aBoolean335));
			Static368.method5060(arg1);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)I")
	public static int method6244(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
