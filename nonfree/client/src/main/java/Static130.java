import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public static int anInt4850;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public static int anInt4852;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString185 = "Loading textures - ";

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!fh;Lclient!wd;II)Lclient!ii;")
	public static synchronized Class105 method4247(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) Class215 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static236.aBooleanArray20[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(42) Class105 local42;
		if (arg4 == 0) {
			local42 = Static28.method486(arg1, arg0, local7);
		} else if (arg4 == 1) {
			local42 = Static57.method1111(arg3, local7, arg0, arg1, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static236.aBooleanArray20[local7] = true;
		return local42;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)Lclient!a;")
	public static Class1_Sub1 method4250(@OriginalArg(0) int arg0) {
		return (Class1_Sub1) Static158.aClass207_24.method5555((long) arg0);
	}
}
