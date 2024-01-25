import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "[J")
	public static final long[] aLongArray12 = new long[32];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZILclient!pfa;I)V")
	public static void method5735(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class251 arg2) {
		Static430.anInt7500 = arg1;
		Static377.aClass251_90 = arg2;
		Static300.anInt5541 = arg0;
		Static171.anInt3648 = 1;
		Static259.aBoolean354 = false;
		Static213.anInt8692 = 10000;
		Static394.anInt6906 = 0;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public static void method5736() {
		for (@Pc(14) Class6_Sub2_Sub15 local14 = (Class6_Sub2_Sub15) Static83.aClass361_10.method7838(); local14 != null; local14 = (Class6_Sub2_Sub15) Static83.aClass361_10.method7845()) {
			@Pc(19) Class4_Sub1_Sub5 local19 = local14.aClass4_Sub1_Sub5_1;
			if (local19.anInt6173 < Static312.anInt5688) {
				local14.method7804();
				local19.method5284();
			} else if (Static312.anInt5688 >= local19.anInt6154) {
				if (local19.anInt6160 > 0) {
					@Pc(57) Class6_Sub34 local57 = (Class6_Sub34) Static593.aClass128_43.method3263((long) (local19.anInt6160 - 1));
					if (local57 != null) {
						@Pc(62) Class4_Sub1_Sub1_Sub1 local62 = local57.aClass4_Sub1_Sub1_Sub1_2;
						if (local62.anInt9542 >= 0 && local62.anInt9542 < Static473.anInt8075 * 512 && local62.anInt9540 >= 0 && Static165.anInt6749 * 512 > local62.anInt9540) {
							local19.method5285(local62.anInt9540, Static312.anInt5688, Static160.method2951(local62.anInt9540, local62.anInt9542, local19.aByte108) - local19.anInt6152, local62.anInt9542);
						}
					}
				}
				if (local19.anInt6160 < 0) {
					@Pc(119) int local119 = -local19.anInt6160 - 1;
					@Pc(130) Class4_Sub1_Sub1_Sub2 local130;
					if (Static272.anInt5214 == local119) {
						local130 = Static328.aClass4_Sub1_Sub1_Sub2_2;
					} else {
						local130 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local119];
					}
					if (local130 != null && local130.anInt9542 >= 0 && Static473.anInt8075 * 512 > local130.anInt9542 && local130.anInt9540 >= 0 && local130.anInt9540 < Static165.anInt6749 * 512) {
						local19.method5285(local130.anInt9540, Static312.anInt5688, Static160.method2951(local130.anInt9540, local130.anInt9542, local19.aByte108) - local19.anInt6152, local130.anInt9542);
					}
				}
				local19.method5288(Static54.anInt1208);
				Static254.method7016(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	public static void method5740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static140.aClass6_Sub48_Sub1_1.anInt8993 * arg2 >> 8;
		if (arg0 == -1 && !Static422.aBoolean507) {
			Static225.method4017();
		} else if (arg0 != -1 && (arg0 != Static9.anInt281 || !Static189.method3422()) && local6 != 0 && !Static422.aBoolean507) {
			Static291.method4686(Static370.aClass251_89, local6, arg0, arg1);
		}
		Static9.anInt281 = arg0;
	}
}
