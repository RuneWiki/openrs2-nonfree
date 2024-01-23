import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
	public static boolean aBoolean196;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "[I")
	public static int[] anIntArray300;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean195 = true;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString266 = "Loaded input handler";

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)Lclient!bd;")
	public static Class14 method2975(@OriginalArg(0) int arg0) {
		@Pc(10) Class14 local10 = (Class14) Static266.aClass79_41.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static45.aClass51_17.method1874(Static258.method4152(arg0), Static217.method3553(arg0));
		local10 = new Class14();
		local10.anInt635 = arg0;
		if (local29 != null) {
			local10.method331(new Class1_Sub13(local29));
		}
		Static266.aClass79_41.method2486(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIII)I")
	public static int method2976(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static145.aByteArrayArrayArray13[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static145.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
