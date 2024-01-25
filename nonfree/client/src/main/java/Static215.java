import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!nq", name = "T", descriptor = "Lclient!fd;")
	public static Class72 aClass72_15;

	@OriginalMember(owner = "client!nq", name = "ob", descriptor = "I")
	public static int anInt4508;

	@OriginalMember(owner = "client!nq", name = "wb", descriptor = "[B")
	public static final byte[] aByteArray55 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLclient!am;)V")
	public static void method3720(@OriginalArg(1) Class11 arg0) {
		Static132.aClass11_58 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(JZI[I)Ljava/lang/String;")
	public static String method3722(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (Static352.anInterface2_3 != null) {
			@Pc(12) String local12 = Static352.anInterface2_3.method3962(arg0, arg1, arg2);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static244.anIntArrayArrayArray14[arg0][local16][local20] == -Static189.anInt4086) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static307.aClass26Array3[arg0].method4996(arg1, arg3) + arg5;
			if (!Static75.method1392(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static75.method1392(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static75.method1392(local20, local151, local177)) {
				return false;
			} else if (Static75.method1392(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static284.method4849(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static75.method1392(local16 + 1, Static307.aClass26Array3[arg0].method4996(arg1, arg3) + arg5, local20 + 1) && Static75.method1392(local16 + 128 - 1, Static307.aClass26Array3[arg0].method4996(arg1 + 1, arg3) + arg5, local20 + 1) && Static75.method1392(local16 + 128 - 1, Static307.aClass26Array3[arg0].method4996(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static75.method1392(local16 + 1, Static307.aClass26Array3[arg0].method4996(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Lclient!vl;")
	public static Class185 method3731() {
		try {
			return (Class185) Class.forName("Class185_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I")
	public static int method3733(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
