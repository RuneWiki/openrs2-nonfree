import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!nk;")
	public static Class121 aClass121_122;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public static int anInt4978;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public static int anInt4976 = 0;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "[I")
	public static int[] anIntArray452 = new int[50];

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIB)I")
	public static int method4275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static24.anIntArrayArrayArray2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > 103 || local15 > 103) {
			return 0;
		}
		@Pc(38) int local38 = arg2 & 0x7F;
		@Pc(40) int local40 = arg1;
		@Pc(50) int local50 = arg0 & 0x7F;
		if (arg1 < 3 && (Static104.aByteArrayArrayArray3[1][local11][local15] & 0x2) == 2) {
			local40 = arg1 + 1;
		}
		@Pc(100) int local100 = Static24.anIntArrayArrayArray2[local40][local11 + 1][local15 + 1] * local38 + (128 - local38) * Static24.anIntArrayArrayArray2[local40][local11][local15 + 1] >> 7;
		@Pc(128) int local128 = Static24.anIntArrayArrayArray2[local40][local11][local15] * (128 - local38) + local38 * Static24.anIntArrayArrayArray2[local40][local11 + 1][local15] >> 7;
		return local128 * (128 - local50) + local100 * local50 >> 7;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z")
	public static boolean method4276() {
		return Static190.anInt3615 == 0 ? Static217.aClass1_Sub24_Sub4_3.method4659() : true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ba;Lclient!ba;Z)V")
	public static void method4280(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_234 != null) {
			arg1.method4779();
		}
		arg1.aClass1_235 = arg0;
		arg1.aClass1_234 = arg0.aClass1_234;
		arg1.aClass1_234.aClass1_235 = arg1;
		arg1.aClass1_235.aClass1_234 = arg1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V")
	public static void method4281() {
		Static70.aClass187_45.method4534(5);
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)I")
	public static int method4282() {
		if ((double) Static109.aFloat131 == 3.0D) {
			return 37;
		} else if ((double) Static109.aFloat131 == 4.0D) {
			return 50;
		} else if ((double) Static109.aFloat131 == 6.0D) {
			return 75;
		} else if ((double) Static109.aFloat131 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!nk;II)Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 method4283(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(3) int arg2) {
		return Static313.method2575(arg2, arg0, arg1) ? Static275.method4270() : null;
	}
}
