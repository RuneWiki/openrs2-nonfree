import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public static int anInt2911;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array6;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public static int anInt2910 = -1;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2601(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub27 local10 = (Class5_Sub27) Static298.aClass335_23.method7766((long) arg0);
		if (local10 != null) {
			@Pc(17) Class5_Sub1_Sub4 local17 = local10.aClass104_Sub1_1.method2093();
			if (local17 != null) {
				@Pc(24) double local24 = local10.aClass104_Sub1_1.method2086();
				if (local24 >= (double) local17.method8229() && local24 <= (double) local17.method8228()) {
					return local17.method8230();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBII)V")
	public static void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static283.anInt4411; local1++) {
			@Pc(6) Rectangle local6 = Class305.aRectangleArray1[local1];
			if (arg1 < local6.x + local6.width && local6.x < arg0 + arg1 && local6.y + local6.height > arg3 && arg3 + arg2 > local6.y) {
				Static425.aBooleanArray18[local1] = true;
			}
		}
		Static430.method7439(arg3, arg2 + arg3, arg1, arg0 + arg1);
	}
}
