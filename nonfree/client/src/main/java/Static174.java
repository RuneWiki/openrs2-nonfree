import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "Z")
	public static final boolean aBoolean187 = false;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!caa;Z[[[BIB)Z")
	public static boolean method2277(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static571.aBoolean773) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9374 >> Static562.anInt9207;
		@Pc(13) int local13 = arg0.anInt9375 >> Static562.anInt9207;
		if (local8 < Static149.anInt2384 || local8 >= Static493.anInt7808 || local13 < Static284.anInt4831 || local13 >= Static482.anInt7702) {
			return true;
		} else if ((arg2 == null || arg0.aByte128 < arg3 || arg2[arg0.aByte128][local8][local13] != arg4) && arg0.method7499() && !arg0.method7506()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static258.anInt4281 - 16 && local8 <= Static258.anInt4281 + 16 && local13 >= Static505.anInt8016 - 16 && local13 <= Static505.anInt8016 + 16) {
				if (Static492.aBoolean660) {
					Static228.aClass318Array1[Static135.anInt8202++].method6437(arg0);
					Static135.anInt8202 %= Static259.anInt4285;
				} else {
					arg0.method7498(Static337.aClass162_13);
				}
			}
			return true;
		}
	}
}
