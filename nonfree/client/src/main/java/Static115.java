import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!tc", name = "Ab", descriptor = "Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!tc", name = "Gb", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_27;

	@OriginalMember(owner = "client!tc", name = "Ib", descriptor = "I")
	public static int anInt2779;

	@OriginalMember(owner = "client!tc", name = "wb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1404 = Static9.method266("blaugr-Un:");

	@OriginalMember(owner = "client!tc", name = "xb", descriptor = "Lclient!of;")
	public static Class1_Sub19 aClass1_Sub19_5 = new Class1_Sub19(new byte[5000]);

	@OriginalMember(owner = "client!tc", name = "Bb", descriptor = "[I")
	public static int[] anIntArray347 = new int[128];

	@OriginalMember(owner = "client!tc", name = "Cb", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!tc", name = "Db", descriptor = "Lclient!id;")
	private static Class34 aClass34_1405 = Static9.method266("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!tc", name = "Eb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1406 = aClass34_1405;

	@OriginalMember(owner = "client!tc", name = "Fb", descriptor = "Lclient!id;")
	public static Class34 aClass34_1407 = Static9.method266("::clientdrop");

	@OriginalMember(owner = "client!tc", name = "Hb", descriptor = "[I")
	public static int[] anIntArray348 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method1847(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		if (Static73.anInt1947 == arg0.anInt1419 || arg0.anInt1388 == -1 || arg0.anInt1416 != 0 || arg0.anInt1393 + 1 > Static40.method687(arg0.anInt1388).anIntArray120[arg0.anInt1431]) {
			@Pc(37) int local37 = arg0.anInt1419 - arg0.anInt1425;
			@Pc(43) int local43 = Static73.anInt1947 - arg0.anInt1425;
			@Pc(53) int local53 = arg0.anInt1399 * 128 + arg0.anInt1443 * 64;
			@Pc(64) int local64 = arg0.anInt1452 * 128 + arg0.anInt1443 * 64;
			arg0.anInt1428 = (local64 * local43 + local53 * (local37 - local43)) / local37;
			@Pc(89) int local89 = arg0.anInt1411 * 128 + arg0.anInt1443 * 64;
			@Pc(100) int local100 = arg0.anInt1400 * 128 + arg0.anInt1443 * 64;
			arg0.anInt1405 = ((local37 - local43) * local89 + local100 * local43) / local37;
		}
		arg0.anInt1412 = 0;
		if (arg0.anInt1434 == 0) {
			arg0.anInt1402 = 1024;
		}
		if (arg0.anInt1434 == 1) {
			arg0.anInt1402 = 1536;
		}
		if (arg0.anInt1434 == 2) {
			arg0.anInt1402 = 0;
		}
		if (arg0.anInt1434 == 3) {
			arg0.anInt1402 = 512;
		}
		arg0.anInt1436 = arg0.anInt1402;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIILclient!of;I)V")
	public static void method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1_Sub19 arg5, @OriginalArg(7) int arg6) {
		@Pc(34) int local34;
		if (arg4 < 0 || arg4 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local34 = arg5.method2072();
				if (local34 == 0) {
					return;
				}
				if (local34 == 1) {
					arg5.method2072();
					return;
				}
				if (local34 <= 49) {
					arg5.method2072();
				}
			}
			return;
		}
		Static105.aByteArrayArrayArray9[arg6][arg4][arg2] = 0;
		while (true) {
			local34 = arg5.method2072();
			if (local34 == 0) {
				if (arg6 == 0) {
					Static98.anIntArrayArrayArray4[0][arg4][arg2] = -Static62.method1059(arg2 + arg3 + 556238, arg1 + (932731 - -arg4)) * 8;
					return;
				} else {
					Static98.anIntArrayArrayArray4[arg6][arg4][arg2] = Static98.anIntArrayArrayArray4[arg6 - 1][arg4][arg2] - 240;
					return;
				}
			}
			if (local34 == 1) {
				@Pc(96) int local96 = arg5.method2072();
				if (local96 == 1) {
					local96 = 0;
				}
				if (arg6 != 0) {
					Static98.anIntArrayArrayArray4[arg6][arg4][arg2] = Static98.anIntArrayArrayArray4[arg6 - 1][arg4][arg2] - local96 * 8;
					return;
				}
				Static98.anIntArrayArrayArray4[0][arg4][arg2] = -local96 * 8;
				return;
			}
			if (local34 <= 49) {
				Static21.aByteArrayArrayArray6[arg6][arg4][arg2] = arg5.method2086();
				Static6.aByteArrayArrayArray1[arg6][arg4][arg2] = (byte) ((local34 - 2) / 4);
				Static16.aByteArrayArrayArray5[arg6][arg4][arg2] = (byte) (arg0 + local34 - 2 & 0x3);
			} else if (local34 <= 81) {
				Static105.aByteArrayArrayArray9[arg6][arg4][arg2] = (byte) (local34 - 49);
			} else {
				Static127.aByteArrayArrayArray8[arg6][arg4][arg2] = (byte) (local34 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	public static void method1849() {
		anIntArray347 = null;
		aClass34_1404 = null;
		aClass1_Sub19_5 = null;
		aClass34_1406 = null;
		aClass1_Sub1_Sub2_Sub1_5 = null;
		aClass34_1405 = null;
		anIntArray348 = null;
		aClass35_Sub1_27 = null;
		aClass34_1407 = null;
	}
}
