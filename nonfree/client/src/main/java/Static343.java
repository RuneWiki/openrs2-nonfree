import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public static int anInt6225;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public static int anInt6235;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Z")
	public static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
	public static final int[] anIntArray709 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[Lclient!qo;")
	public static final Class44_Sub4_Sub4_Sub1[] aClass44_Sub4_Sub4_Sub1Array1 = new Class44_Sub4_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ip;)V")
	public static void method5634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44_Sub3 arg3) {
		if (Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static101.method2079(arg0, arg1, arg2);
		}
		Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2].aClass44_Sub3_1 = arg3;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
	public static void method5635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(62) int local62 = local17 << 2;
		@Pc(70) int local70 = local21 * 3;
		@Pc(78) int local78 = ((arg0 << 1) - 3) * local25;
		@Pc(84) int local84 = local62;
		@Pc(90) int local90 = (arg0 - 1) * local50;
		@Pc(108) int local108;
		@Pc(117) int local117;
		if (Static327.anInt3039 <= arg3 && Static230.anInt4308 >= arg3) {
			local108 = Static6.method125(arg2 + arg1, Static265.anInt4933, Static311.anInt5837);
			local117 = Static6.method125(arg1 - arg2, Static265.anInt4933, Static311.anInt5837);
			Static14.method247(local108, arg4, Static11.anIntArrayArray11[arg3], local117);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local84;
					local38 += local70;
					local84 += local62;
					local70 += local62;
					local7++;
				}
			}
			if (local46 < 0) {
				local46 += local84;
				local38 += local70;
				local7++;
				local70 += local62;
				local84 += local62;
			}
			local38 += -local90;
			local46 += -local78;
			local9--;
			local78 -= local50;
			local90 -= local50;
			local108 = arg3 - local9;
			local117 = arg3 + local9;
			if (local117 >= Static327.anInt3039 && local108 <= Static230.anInt4308) {
				@Pc(211) int local211 = Static6.method125(arg1 + local7, Static265.anInt4933, Static311.anInt5837);
				@Pc(220) int local220 = Static6.method125(arg1 - local7, Static265.anInt4933, Static311.anInt5837);
				if (Static327.anInt3039 <= local108) {
					Static14.method247(local211, arg4, Static11.anIntArrayArray11[local108], local220);
				}
				if (local117 <= Static230.anInt4308) {
					Static14.method247(local211, arg4, Static11.anIntArrayArray11[local117], local220);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIIIIIBIII)Z")
	public static boolean method5639(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static244.method4296(arg9, arg2, Static253.aClass44_Sub4_Sub4_Sub1_1.method4714(), arg1, Static334.aClass27Array1[anInt6225], arg8, arg3, arg0, arg4, arg5, Static149.anIntArray343, Static126.anIntArray308, arg7, arg6);
		if (local24 < 1) {
			return false;
		}
		Static299.anInt5652 = Static149.anIntArray343[local24 - 1];
		Static24.anInt385 = Static126.anIntArray308[local24 - 1];
		Static125.aBoolean198 = false;
		Static98.method2027();
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method5641() {
		if (Static332.anInt6108 != 3) {
			Static181.anInt3403 = -1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public static void method5642() {
		@Pc(10) Class70 local10 = Static319.aClass70_101;
		synchronized (Static319.aClass70_101) {
			Static319.aClass70_101.method1405();
		}
	}
}
