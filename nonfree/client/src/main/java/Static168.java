import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!io", name = "g", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_48 = new Class186(79, 12);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ta;II)V")
	public static void method2732(@OriginalArg(0) Class3_Sub3_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = 0;
		if (Static125.anInt2225 < arg0.anInt6686) {
			Static148.method2456(arg0);
		} else if (arg0.anInt6700 < Static125.anInt2225) {
			Static119.method1908(false, arg0);
			local13 = Static180.anInt3128;
			local7 = Static20.anInt331;
		} else {
			Static328.method4702(arg0);
		}
		if (arg0.anInt6675 < 128 || arg0.anInt6677 < 128 || Static84.anInt1632 * 128 - 128 <= arg0.anInt6675 || Static261.anInt4480 * 128 - 128 <= arg0.anInt6677) {
			arg0.anInt6700 = 0;
			local13 = 0;
			arg0.anInt6712 = -1;
			local7 = -1;
			arg0.anInt6686 = 0;
			arg0.anInt6710 = -1;
			arg0.anInt6713 = -1;
			arg0.anInt6675 = arg0.anIntArray582[0] * 128 + arg0.method5512() * 64;
			arg0.anInt6677 = arg0.anIntArray583[0] * 128 + arg0.method5512() * 64;
			arg0.method5507();
		}
		if (arg0 == Static134.aClass3_Sub3_Sub6_Sub1_1 && (arg0.anInt6675 < 1536 || arg0.anInt6677 < 1536 || arg0.anInt6675 >= (Static84.anInt1632 - 12) * 128 || Static261.anInt4480 * 128 - 1536 <= arg0.anInt6677)) {
			arg0.anInt6700 = 0;
			arg0.anInt6713 = -1;
			arg0.anInt6686 = 0;
			local13 = 0;
			arg0.anInt6710 = -1;
			arg0.anInt6712 = -1;
			local7 = -1;
			arg0.anInt6675 = arg0.anIntArray582[0] * 128 + arg0.method5512() * 64;
			arg0.anInt6677 = arg0.anIntArray583[0] * 128 + arg0.method5512() * 64;
			arg0.method5507();
		}
		@Pc(207) int local207 = Static216.method3338(arg0);
		Static80.method1467(local207, local7, arg0, local13);
		Static365.method3025(arg0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIB)I")
	public static int method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg2;
		@Pc(28) int local28 = Static4.method27(local7, local17);
		@Pc(35) int local35 = Static4.method27(local7 + 1, local17);
		@Pc(42) int local42 = Static4.method27(local7, local17 + 1);
		@Pc(51) int local51 = Static4.method27(local7 + 1, local17 + 1);
		@Pc(65) int local65 = Static282.method4251(local13, arg0, local35, local28);
		@Pc(72) int local72 = Static282.method4251(local13, arg0, local51, local42);
		return Static282.method4251(local23, arg0, local72, local65);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V")
	public static void method2734(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub1_Sub12 local15 = Static449.method5975(arg0, 12);
		local15.method3048();
	}
}
