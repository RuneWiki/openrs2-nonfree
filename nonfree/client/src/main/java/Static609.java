import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!vp", name = "Z", descriptor = "I")
	public static int anInt9953;

	@OriginalMember(owner = "client!vp", name = "ab", descriptor = "I")
	public static int anInt9954;

	@OriginalMember(owner = "client!vp", name = "Q", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_174 = new Class274(105, -1);

	@OriginalMember(owner = "client!vp", name = "W", descriptor = "[J")
	public static final long[] aLongArray15 = new long[100];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method8332(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static407.aBoolean564) {
			try {
				@Pc(25) Class81 local25 = (Class81) Class.forName("Class81_Sub1").getDeclaredConstructor().newInstance();
				local25.method1786(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static407.aBoolean564 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(JIILclient!eq;BZI)V")
	public static void method8334(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class97 arg2, @OriginalArg(6) int arg3) {
		Static282.method4463(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIIIIIIIIIII)V")
	public static void method8335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static164.method3053(arg6)) {
			return;
		}
		if (Static629.aClass78ArrayArray2[arg6] == null) {
			Static69.method1335(Static399.aClass78ArrayArray1[arg6], -1, arg5, arg4, arg10, arg3, arg8, arg1, arg0, arg7, arg2, arg9);
		} else {
			Static69.method1335(Static629.aClass78ArrayArray2[arg6], -1, arg5, arg4, arg10, arg3, arg8, arg1, arg0, arg7, arg2, arg9);
		}
	}
}
