import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!si", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public static void method5336() {
		Static316.aFont1 = null;
		Static117.anImage3 = null;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!qa;Lclient!ee;III)V")
	public static void method5338(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class162 local12;
		if (arg3 < Static230.anInt4581) {
			local12 = Static294.aClass162ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method6301()) {
				arg1.method6306(0, 0, Static223.anInt4452, arg0, local12.aClass11_Sub1_2, true);
			}
		}
		if (arg4 < Static230.anInt4581) {
			local12 = Static294.aClass162ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method6301()) {
				arg1.method6306(0, Static223.anInt4452, 0, arg0, local12.aClass11_Sub1_2, true);
			}
		}
		if (arg3 < Static230.anInt4581 && arg4 < Static268.anInt5106) {
			local12 = Static294.aClass162ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method6301()) {
				arg1.method6306(0, Static223.anInt4452, Static223.anInt4452, arg0, local12.aClass11_Sub1_2, true);
			}
		}
		if (arg3 < Static230.anInt4581 && arg4 > 0) {
			local12 = Static294.aClass162ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub1_2 != null && local12.aClass11_Sub1_2.method6301()) {
				arg1.method6306(0, -Static223.anInt4452, Static223.anInt4452, arg0, local12.aClass11_Sub1_2, true);
			}
		}
	}
}
