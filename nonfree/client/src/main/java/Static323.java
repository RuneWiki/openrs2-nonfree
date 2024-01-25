import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_82 = new Class214(100, 0);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!sn;")
	public static final Class235 aClass235_5 = new Class235("stellardawn", 1);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_83 = new Class214(31, -1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 + arg0 > arg4 && arg4 + arg5 > arg2) {
			return arg3 < arg6 + arg1 && arg3 + arg7 > arg6;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public static void method2077() {
		Static182.aClass30_12.ha(Static229.anInt4569, Static157.aClass185_Sub1_1.aBoolean398 ? Static368.anInt6380 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!l;Lclient!ul;Ljava/awt/Canvas;II)Lclient!qa;")
	public static synchronized Class30 method2082(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static18.aBooleanArray10[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(56) Class30 local56;
		if (arg0 == 0) {
			local56 = Static200.method3530(arg1, arg3, local7);
		} else if (arg0 == 1) {
			local56 = Static258.method3304(arg2, arg4, local7, arg1, arg3);
		} else if (arg0 == 2) {
			local56 = Static228.method3887(arg3, arg2, arg1, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static18.aBooleanArray10[local7] = true;
		return local56;
	}
}
