import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!f;")
	public static Class10 aClass10_28;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!rr;")
	public static Class290 aClass290_5;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "[Lclient!re;")
	public static Class281[] aClass281Array1 = null;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "[I")
	public static final int[] anIntArray440 = new int[5];

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)Z")
	public static boolean method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static495.method6912(arg0, arg1) || Static357.method5214(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ir;Z[[[BIB)Z")
	public static boolean method5412(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static41.aBoolean88) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt8796 >> Static378.anInt6665;
		@Pc(13) int local13 = arg0.anInt8795 >> Static378.anInt6665;
		if (local8 < Static118.anInt2396 || local8 >= Static557.anInt9078 || local13 < Static494.anInt8292 || local13 >= Static84.anInt1946) {
			return true;
		} else if ((arg2 == null || arg0.aByte116 < arg3 || arg2[arg0.aByte116][local8][local13] != arg4) && arg0.method7259() && !arg0.method7252()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static251.anInt4676 - 16 && local8 <= Static251.anInt4676 + 16 && local13 >= Static63.anInt1544 - 16 && local13 <= Static63.anInt1544 + 16) {
				if (Static50.aBoolean95) {
					Static384.aClass294Array3[Static102.anInt2114++].method6723(arg0);
					Static102.anInt2114 %= Static62.anInt1534;
				} else {
					arg0.method7265(Static63.aClass12_5);
				}
			}
			return true;
		}
	}
}
