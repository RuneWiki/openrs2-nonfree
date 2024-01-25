import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
	public static int anInt2865 = 0;

	@OriginalMember(owner = "client!dt", name = "T", descriptor = "[Lclient!wc;")
	public static final Class8_Sub5_Sub21[] aClass8_Sub5_Sub21Array6 = new Class8_Sub5_Sub21[14];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIII)Z")
	public static boolean method2472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static307.aBoolean442 || !Static350.aBoolean469) {
			return false;
		} else if (Static359.anInt6889 < 100) {
			return false;
		} else {
			@Pc(29) int local29 = Static275.anIntArrayArrayArray9[arg2][arg0][arg1];
			if (local29 == -Static609.anInt9847) {
				return false;
			} else if (Static609.anInt9847 == local29) {
				return true;
			} else if (Static253.aClass86Array4 == Static34.aClass86Array5) {
				return false;
			} else {
				@Pc(53) int local53 = arg0 << Static172.anInt4156;
				@Pc(57) int local57 = arg1 << Static172.anInt4156;
				if (Static97.method2223(Static34.aClass86Array5[arg2].method8086(arg1 + 1, arg0 - -1), Static572.anInt9827 + local53 - 1, local53 + 1, Static34.aClass86Array5[arg2].method8086(arg1 + 1, arg0), Static572.anInt9827 + local57 - 1, local57 + -1 - -Static572.anInt9827, Static34.aClass86Array5[arg2].method8086(arg1, arg0), local57 + 1, local53 + 1) && Static97.method2223(Static34.aClass86Array5[arg2].method8086(arg1, arg0 + 1), local53 + Static572.anInt9827 - 1, local53 + 1, Static34.aClass86Array5[arg2].method8086(arg1 + 1, arg0 + 1), local57 + Static572.anInt9827 - 1, local57 - -1, Static34.aClass86Array5[arg2].method8086(arg1, arg0), local57 + 1, local53 + -1 + Static572.anInt9827)) {
					Static133.anInt3542++;
					Static275.anIntArrayArrayArray9[arg2][arg0][arg1] = Static609.anInt9847;
					return true;
				} else {
					Static275.anIntArrayArrayArray9[arg2][arg0][arg1] = -Static609.anInt9847;
					return false;
				}
			}
		}
	}
}
