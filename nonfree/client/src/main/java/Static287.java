import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
	public static int anInt4978;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V")
	public static void method4351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static17.anInt396 = arg3;
		Static373.anInt6291 = arg0;
		Static323.anInt5538 = arg1;
		Static236.anInt2044 = arg2;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IILclient!gf;[I[I)V")
	public static void method4352(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class1_Sub5_Sub1_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg0[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg1.aClass12Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass12Array3[local19] = null;
					} else {
						@Pc(39) Class202 local39 = Static36.aClass236_1.method5396(local9);
						@Pc(42) int local42 = local39.anInt4932;
						@Pc(47) Class12 local47 = arg1.aClass12Array3[local19];
						if (local47 != null) {
							if (local9 == local47.anInt319) {
								if (local42 == 0) {
									local47 = arg1.aClass12Array3[local19] = null;
								} else if (local42 == 1) {
									local47.anInt321 = 0;
									local47.anInt317 = 0;
									local47.anInt318 = 0;
									local47.anInt316 = local17;
									local47.anInt320 = 1;
									Static169.method2965(0, Static206.aClass1_Sub5_Sub1_Sub1_1 == arg1, arg1.aByte69, arg1.anInt6390, local39, arg1.anInt6386);
								} else if (local42 == 2) {
									local47.anInt317 = 0;
								}
							} else if (local39.anInt4945 >= Static36.aClass236_1.method5396(local47.anInt319).anInt4945) {
								local47 = arg1.aClass12Array3[local19] = null;
							}
						}
						if (local47 == null) {
							local47 = arg1.aClass12Array3[local19] = new Class12();
							local47.anInt320 = 1;
							local47.anInt316 = local17;
							local47.anInt321 = 0;
							local47.anInt318 = 0;
							local47.anInt317 = 0;
							local47.anInt319 = local9;
							Static169.method2965(0, arg1 == Static206.aClass1_Sub5_Sub1_Sub1_1, arg1.aByte69, arg1.anInt6390, local39, arg1.anInt6386);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
	public static void method4353(@OriginalArg(0) int arg0) {
		Static65.anInt4692 = arg0;
		@Pc(7) Class160 local7 = Static28.aClass160_3;
		synchronized (Static28.aClass160_3) {
			Static28.aClass160_3.method3595();
		}
	}
}
