import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!ir;")
	public static Class110 aClass110_2;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Lclient!v;")
	public static Class233 aClass233_1;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	public static int anInt1124;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public static int anInt1119 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIBIII)Lclient!rp;")
	public static Class21 method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg2 * 76724863L ^ (long) arg5 * 986053L ^ (long) arg1 * 475427L ^ (long) arg0 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 32147369L;
		@Pc(44) Class21 local44 = (Class21) Static390.aClass160_64.method3599(local38);
		if (local44 == null) {
			local44 = Static140.aClass63_4.method2033(arg3, arg0, arg1, arg5, arg4, arg2);
			Static390.aClass160_64.method3602(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}
}
