import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "[I")
	public static final int[] anIntArray170 = new int[16];

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	public static int anInt2041 = 1;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
	public static final int[] anIntArray171 = new int[13];

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!us;")
	public static final Class295 aClass295_2 = new Class295();

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1949(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg0);
		@Pc(17) int local17 = local13.method3043();
		@Pc(21) int local21 = local13.method3037();
		if (local21 < 0 || Static195.anInt4077 != 0 && local21 > Static195.anInt4077) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(98) byte[] local98 = new byte[local21];
			local13.method3071(local98, local21);
			return local98;
		} else {
			@Pc(41) int local41 = local13.method3037();
			if (local41 < 0 || Static195.anInt4077 != 0 && Static195.anInt4077 < local41) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local41];
			if (local17 == 1) {
				Static100.method2258(local65, local41, arg0, local21);
			} else {
				@Pc(80) Class65 local80 = Static310.aClass65_1;
				synchronized (Static310.aClass65_1) {
					Static310.aClass65_1.method2174(local65, local13);
				}
			}
			return local65;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method1950() {
		Static41.anInt1359 = 1;
		Static15.anInt836 = -1;
		if (Static150.aString23 == null) {
			Static110.method2414(35);
		} else {
			@Pc(20) Class1_Sub13 local20 = new Class1_Sub13(Static317.method5199(Static290.method5949(Static150.aString23)));
			@Pc(24) long local24 = local20.method3015();
			Static265.aLong134 = local20.method3015();
			Static54.method3635(Static433.method6988(local24), true, "");
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIB)I")
	public static int method1951(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub49 local8 = Static393.method5919(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray747.length) {
			return local8.anIntArray747[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)V")
	public static void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg1) {
			Static152.method3104(arg2, arg4, arg1, arg0);
		} else if (Static95.anInt2358 <= arg2 - arg1 && Static299.anInt4491 >= arg1 + arg2 && arg0 - arg3 >= Static92.anInt2338 && Static341.anInt6379 >= arg3 + arg0) {
			Static61.method1684(arg0, arg3, arg2, arg1, arg4);
		} else {
			Static324.method5300(arg3, arg4, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIB)I")
	public static int method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static290.aClass10Array7 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local11 < 0 || local20 < 0 || local11 > Static542.anInt9387 - 1 || Static36.anInt1324 - 1 < local20) {
			return 0;
		}
		@Pc(45) int local45 = arg0;
		if (arg0 < 3 && (Static542.aByteArrayArrayArray17[1][local11][local20] & 0x2) != 0) {
			local45 = arg0 + 1;
		}
		return Static290.aClass10Array7[local45].aa(arg2, arg1);
	}
}
