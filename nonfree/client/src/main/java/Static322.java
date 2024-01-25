import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "Lclient!qj;")
	public static Class165 aClass165_96;

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "Lclient!lf;")
	public static Class90 aClass90_18;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
	public static int anInt6152 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!kq;ILclient!sr;Ljava/awt/Canvas;II)Lclient!aa;")
	public static Class2 method5389(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) Class local6 = Class.forName("Class2_Sub1");
			@Pc(52) Constructor local52 = local6.getConstructor(Canvas.class, sr.class, Integer.TYPE, Integer.TYPE, kq.class);
			return (Class2) local52.newInstance(arg3, arg2, Integer.valueOf(arg1), new Integer(arg4), arg0);
		} catch (@Pc(96) Exception local96) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static335.anIntArrayArrayArray13[arg0][local16][local20] == -Static271.anInt4840) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static7.aClass41Array1[arg0].method5434(arg1, arg3) + arg5;
			if (!Static117.method2113(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static117.method2113(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static117.method2113(local20, local151, local177)) {
				return false;
			} else if (Static117.method2113(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static210.method3848(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static117.method2113(local16 + 1, Static7.aClass41Array1[arg0].method5434(arg1, arg3) + arg5, local20 + 1) && Static117.method2113(local16 + 128 - 1, Static7.aClass41Array1[arg0].method5434(arg1 + 1, arg3) + arg5, local20 + 1) && Static117.method2113(local16 + 128 - 1, Static7.aClass41Array1[arg0].method5434(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static117.method2113(local16 + 1, Static7.aClass41Array1[arg0].method5434(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
