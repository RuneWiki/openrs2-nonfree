import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_76 = new Class38();

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_114 = new Class186(14, 8);

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	public static int anInt8958 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIBII)V")
	public static void method7525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static302.anInt5846 == 1) {
			Static204.aClass12Array13[Static222.anInt4503 / 100].method7191(Static336.anInt6301 - 8, Static237.anInt4614 - 8);
		}
		if (Static302.anInt5846 == 2) {
			Static204.aClass12Array13[Static222.anInt4503 / 100 + 4].method7191(Static336.anInt6301 - 8, Static237.anInt4614 + -8);
		}
		Static472.method6879();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lclient!lca;")
	public static Class47_Sub1 method7528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class47_Sub1 local14 = local7.aClass47_Sub1_1;
			local7.aClass47_Sub1_1 = null;
			return local14;
		}
	}
}
