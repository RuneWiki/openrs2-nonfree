import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
	public static int anInt4421;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
	public static int anInt4423;

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "[I")
	public static int[] anIntArray459 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "Lclient!i;")
	private static Class41 aClass41_1166 = Static184.method2923("Login limit exceeded)3");

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray11 = new byte[1000][];

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
	public static int anInt4422 = 0;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
	public static int anInt4428 = -1;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1167 = aClass41_1166;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/awt/Component;Lclient!qg;BI)Lclient!ej;")
	public static Class31 method3059(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(4) int arg3) {
		if (Static10.anInt374 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(41) Class31 local41 = (Class31) Class.forName("Class31_Sub2").getDeclaredConstructor().newInstance();
			local41.anInt2136 = arg3;
			local41.anIntArray207 = new int[(Static6.aBoolean13 ? 2 : 1) * 256];
			local41.method1511(arg1);
			local41.anInt2132 = (arg3 & 0xFFFFFC00) + 1024;
			if (local41.anInt2132 > 16384) {
				local41.anInt2132 = 16384;
			}
			local41.method1508(local41.anInt2132);
			if (Static196.anInt4429 > 0 && Static131.aClass74_1 == null) {
				Static131.aClass74_1 = new Class74();
				Static131.aClass74_1.aClass83_4 = arg2;
				arg2.method2618(Static131.aClass74_1, Static196.anInt4429);
			}
			if (Static131.aClass74_1 != null) {
				if (Static131.aClass74_1.aClass31Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static131.aClass74_1.aClass31Array1[arg0] = local41;
			}
			return local41;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class31_Sub1 local119 = new Class31_Sub1(arg2, arg0);
				local119.anIntArray207 = new int[(Static6.aBoolean13 ? 2 : 1) * 256];
				local119.anInt2136 = arg3;
				local119.method1511(arg1);
				local119.anInt2132 = 16384;
				local119.method1508(local119.anInt2132);
				if (Static196.anInt4429 > 0 && Static131.aClass74_1 == null) {
					Static131.aClass74_1 = new Class74();
					Static131.aClass74_1.aClass83_4 = arg2;
					arg2.method2618(Static131.aClass74_1, Static196.anInt4429);
				}
				if (Static131.aClass74_1 != null) {
					if (Static131.aClass74_1.aClass31Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static131.aClass74_1.aClass31Array1[arg0] = local119;
				}
				return local119;
			} catch (@Pc(181) Throwable local181) {
				return new Class31();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class2_Sub20 local3 = null;
		for (@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) Static56.aClass108_4.method3322(); local12 != null; local12 = (Class2_Sub20) Static56.aClass108_4.method3331()) {
			if (arg6 == local12.anInt3285 && arg7 == local12.anInt3289 && local12.anInt3282 == arg1 && local12.anInt3293 == arg2) {
				local3 = local12;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class2_Sub20();
			local3.anInt3282 = arg1;
			local3.anInt3293 = arg2;
			local3.anInt3289 = arg7;
			local3.anInt3285 = arg6;
			Static154.method2516(local3);
			Static56.aClass108_4.method3334(local3);
		}
		local3.anInt3292 = arg5;
		local3.anInt3298 = arg3;
		local3.anInt3291 = arg4;
		local3.anInt3281 = arg8;
		local3.anInt3284 = arg0;
	}
}
