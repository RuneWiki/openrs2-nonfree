import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public static int anInt5653;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "C")
	public static char aChar6;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Lclient!on;")
	public static Class131 aClass131_3;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Lclient!g;")
	public static Class58 aClass58_14 = new Class58(128);

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	public static int anInt5650 = -1;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray18 = new byte[1000][];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[Lclient!qf;B)V")
	public static void method4465(@OriginalArg(0) int arg0, @OriginalArg(1) Class146[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(19) Class146 local19 = arg1[local3];
			if (local19 != null && local19.anInt4416 == arg0 && (!local19.aBoolean299 || !Static36.method654(local19))) {
				if (local19.anInt4370 == 0) {
					if (!local19.aBoolean299 && Static36.method654(local19) && local19 != Static56.aClass146_4) {
						continue;
					}
					method4465(local19.anInt4355, arg1);
					if (local19.aClass146Array2 != null) {
						method4465(local19.anInt4355, local19.aClass146Array2);
					}
					@Pc(78) Class1_Sub32 local78 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local19.anInt4355);
					if (local78 != null) {
						Static20.method398(local78.anInt5722);
					}
				}
				if (local19.anInt4370 == 6) {
					@Pc(110) int local110;
					if (local19.anInt4367 != -1 || local19.anInt4433 != -1) {
						@Pc(105) boolean local105 = Static130.method2054(local19);
						if (local105) {
							local110 = local19.anInt4433;
						} else {
							local110 = local19.anInt4367;
						}
						if (local110 != -1) {
							@Pc(122) Class167 local122 = Static313.method4648(local110);
							if (local122 != null) {
								local19.anInt4353 += Static147.anInt2946;
								while (local19.anInt4353 > local122.anIntArray463[local19.anInt4388]) {
									local19.anInt4353 -= local122.anIntArray463[local19.anInt4388];
									local19.anInt4388++;
									if (local19.anInt4388 >= local122.anIntArray461.length) {
										local19.anInt4388 -= local122.anInt5122;
										if (local19.anInt4388 < 0 || local19.anInt4388 >= local122.anIntArray461.length) {
											local19.anInt4388 = 0;
										}
									}
									local19.anInt4408 = local19.anInt4388 + 1;
									if (local122.anIntArray461.length <= local19.anInt4408) {
										local19.anInt4408 -= local122.anInt5122;
										if (local19.anInt4408 < 0 || local19.anInt4408 >= local122.anIntArray461.length) {
											local19.anInt4408 = -1;
										}
									}
									Static237.method2927(local19);
								}
							}
						}
					}
					if (local19.anInt4338 != 0 && !local19.aBoolean299) {
						@Pc(243) int local243 = local19.anInt4338 >> 16;
						local110 = local19.anInt4338 << 16 >> 16;
						local110 *= Static147.anInt2946;
						@Pc(258) int local258 = local243 * Static147.anInt2946;
						local19.anInt4351 = local19.anInt4351 + local258 & 0x7FF;
						local19.anInt4400 = local19.anInt4400 + local110 & 0x7FF;
						Static237.method2927(local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZII)I")
	public static int method4467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static94.aByteArrayArrayArray9[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static94.aByteArrayArrayArray9[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
