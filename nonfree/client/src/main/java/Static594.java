import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray20 = new int[2][][];

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "[I")
	public static final int[] anIntArray618 = new int[8];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)Lclient!ps;")
	public static Class273 method7731(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static509.aClass273ArrayArray2[local7] == null || Static509.aClass273ArrayArray2[local7][local18] == null) {
			@Pc(32) boolean local32 = Static453.method5906(local7);
			if (!local32) {
				return null;
			}
		}
		return Static509.aClass273ArrayArray2[local7][local18];
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(FBFF)I")
	public static int method7732(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 < local26 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!fa;Z)Lclient!r;")
	public static Class162 method7733(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1) {
		return new Class162_Sub2(arg0, arg1);
	}
}
