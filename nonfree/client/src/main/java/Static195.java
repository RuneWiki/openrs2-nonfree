import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	public static int anInt6509 = 0;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!em;")
	public static final Class83 aClass83_138 = new Class83(112, -2);

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[S")
	private static final short[] aShortArray62 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "[S")
	private static final short[] aShortArray63 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "[S")
	public static final short[] aShortArray64 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { aShortArray63, aShortArray62, aShortArray64 };

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Lclient!ar;")
	public static final Class16 aClass16_4 = new Class16(16);

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
	public static final int[] anIntArray388 = new int[4];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIIII)V")
	public static void method5286(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static76.anInt6367 = arg2;
		Static123.anInt2518 = arg5;
		Static345.anInt9512 = arg4;
		Static269.anInt4922 = arg3;
		Static375.anInt6733 = arg0;
		if (arg1 && Static76.anInt6367 >= 100) {
			Static393.anInt6978 = Static375.anInt6733 * 512 + 256;
			Static78.anInt1534 = Static123.anInt2518 * 512 + 256;
			Static20.anInt542 = Static538.method6114(Static240.anInt4414, Static78.anInt1534, Static393.anInt6978) - Static345.anInt9512;
		}
		Static358.anInt9363 = 2;
		Static434.anInt7761 = -1;
		Static469.anInt8080 = -1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIBIII)V")
	public static void method5287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static330.anInt6025 && Static194.anInt3788 >= arg3 && Static120.anInt2491 <= arg4 && Static71.anInt1350 >= arg1) {
			Static269.method3926(arg0, arg1, arg3, arg2, arg4);
		} else {
			Static280.method4168(arg4, arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Z")
	public static boolean method5288(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static309.aCharArray7[local7 - 128] != '\u0000';
		}
	}
}
