import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Lclient!rw;")
	public static Class296 aClass296_6;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public static int anInt8243 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([ILclient!og;[I[IB)V")
	public static void method6927(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg2[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg1.aClass52Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass52Array3[local23] = null;
					} else {
						@Pc(37) Class17 local37 = Static330.aClass279_2.method6216(local13);
						@Pc(40) int local40 = local37.anInt555;
						@Pc(45) Class52 local45 = arg1.aClass52Array3[local23];
						if (local45 != null) {
							if (local13 == local45.anInt1940) {
								if (local40 == 0) {
									local45 = arg1.aClass52Array3[local23] = null;
								} else if (local40 == 1) {
									local45.anInt1943 = local21;
									local45.anInt1941 = 0;
									local45.anInt1944 = 0;
									local45.anInt1942 = 1;
									local45.anInt1945 = 0;
									Static351.method5300(0, local37, arg1.anInt8980, arg1.anInt8975, arg1.aByte126, arg1 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
								} else if (local40 == 2) {
									local45.anInt1941 = 0;
								}
							} else if (local37.anInt559 >= Static330.aClass279_2.method6216(local45.anInt1940).anInt559) {
								local45 = arg1.aClass52Array3[local23] = null;
							}
						}
						if (local45 == null) {
							local45 = arg1.aClass52Array3[local23] = new Class52();
							local45.anInt1940 = local13;
							local45.anInt1941 = 0;
							local45.anInt1943 = local21;
							local45.anInt1942 = 1;
							local45.anInt1944 = 0;
							local45.anInt1945 = 0;
							Static351.method5300(0, local37, arg1.anInt8980, arg1.anInt8975, arg1.aByte126, arg1 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z[BI)V")
	public static void method6929(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static327.aClass3_Sub11_2 == null) {
			Static327.aClass3_Sub11_2 = new Class3_Sub11(20000);
		}
		Static327.aClass3_Sub11_2.method3084(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static268.method4379(Static327.aClass3_Sub11_2.aByteArray36);
		Static338.aClass133_Sub1Array2 = new Class133_Sub1[Static588.anInt2860];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static532.anInt8384; local35 <= Static278.anInt5102; local35++) {
			@Pc(41) Class133_Sub1 local41 = Static48.method798(local35);
			if (local41 != null) {
				Static338.aClass133_Sub1Array2[local33++] = local41;
			}
		}
		Static176.aBoolean273 = false;
		Static255.aLong136 = Static587.method7753();
		Static327.aClass3_Sub11_2 = null;
	}
}
