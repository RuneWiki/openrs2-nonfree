import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
	public static int anInt8502;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array14;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "Lclient!kha;")
	public static Class181 aClass181_98;

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_112 = new Class218(85, -1);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIBIIZI)V")
	public static void method7012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if ((arg4 ? Static552.aClass3_Sub48_30.aClass23_Sub8_5.method3378() : Static552.aClass3_Sub48_30.aClass23_Sub8_2.method3378()) != 0 && arg5 != 0 && Static224.anInt5125 < 50 && arg2 != -1) {
			Static620.aClass208Array1[Static224.anInt5125++] = new Class208((byte) (arg4 ? 3 : 2), arg2, arg5, arg0, arg1, 0, arg3, null);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLclient!ida;)[I")
	public static int[] method7013(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(10) Class3_Sub15 local10 = new Class3_Sub15(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8448(10);
		local10.method8419(local13[0]);
		local10.method8419(local13[1]);
		local10.method8419(local13[2]);
		local10.method8419(local13[3]);
		for (@Pc(66) int local66 = 0; local66 < 10; local66++) {
			local10.method8419((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8464((int) (Math.random() * 9.9999999E7D));
		local10.method8453(Static530.aBigInteger7, Static501.aBigInteger10);
		arg0.aClass3_Sub15_Sub1_3.method8430(local10.anInt10282, 0, local10.aByteArray106);
		return local13;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BI)Z")
	public static boolean method7016(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIII)V")
	public static void method7018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(24) int local24 = Static429.method6586(arg2 + arg1, Static202.anInt4720, Static472.anInt6105);
		@Pc(33) int local33 = Static429.method6586(arg1 - arg2, Static202.anInt4720, Static472.anInt6105);
		Static580.method8027(Static104.anIntArrayArray24[arg0], local24, local33, arg3);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(62) int local62;
			@Pc(66) int local66;
			@Pc(88) int local88;
			@Pc(99) int local99;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local62 = arg0 - local9;
				local66 = arg0 + local9;
				if (Static246.anInt5506 <= local66 && local62 <= Static583.anInt9761) {
					local88 = Static429.method6586(local7 + arg1, Static202.anInt4720, Static472.anInt6105);
					local99 = Static429.method6586(arg1 - local7, Static202.anInt4720, Static472.anInt6105);
					if (local66 <= Static583.anInt9761) {
						Static580.method8027(Static104.anIntArrayArray24[local66], local88, local99, arg3);
					}
					if (local62 >= Static246.anInt5506) {
						Static580.method8027(Static104.anIntArrayArray24[local62], local88, local99, arg3);
					}
				}
			}
			local7++;
			local62 = arg0 - local7;
			local66 = local7 + arg0;
			if (local66 >= Static246.anInt5506 && Static583.anInt9761 >= local62) {
				local88 = Static429.method6586(arg1 + local9, Static202.anInt4720, Static472.anInt6105);
				local99 = Static429.method6586(arg1 - local9, Static202.anInt4720, Static472.anInt6105);
				if (Static583.anInt9761 >= local66) {
					Static580.method8027(Static104.anIntArrayArray24[local66], local88, local99, arg3);
				}
				if (local62 >= Static246.anInt5506) {
					Static580.method8027(Static104.anIntArrayArray24[local62], local88, local99, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
	public static boolean method7020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static161.method3406(arg1, arg0) || Static289.method4998(arg0, arg1);
	}
}
