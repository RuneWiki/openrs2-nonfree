import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cf", name = "ab", descriptor = "J")
	public static long aLong29;

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "F")
	public static float aFloat20 = 0.0F;

	@OriginalMember(owner = "client!cf", name = "W", descriptor = "Lclient!wf;")
	public static Class189 aClass189_1 = null;

	@OriginalMember(owner = "client!cf", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIZI)V")
	public static void method553(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static287.method4402(arg0, arg3, arg1, Static133.aClass63_Sub1Array2.length - 1, arg2, 0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([ILclient!p;[II[I)V")
	public static void method555(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class53_Sub1_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) int local19 = arg0[local7];
			@Pc(23) int local23 = arg2[local7];
			@Pc(27) int local27 = arg3[local7];
			@Pc(29) int local29 = 0;
			while (local23 != 0 && local29 < arg1.aClass153Array3.length) {
				if ((local23 & 0x1) != 0) {
					if (local19 == -1) {
						arg1.aClass153Array3[local29] = null;
					} else {
						@Pc(53) Class46 local53 = Static156.method2501(local19);
						@Pc(56) int local56 = local53.anInt1238;
						@Pc(61) Class153 local61 = arg1.aClass153Array3[local29];
						if (local61 != null) {
							if (local61.anInt4457 == local19) {
								if (local56 == 0) {
									local61 = arg1.aClass153Array3[local29] = null;
								} else if (local56 == 1) {
									local61.anInt4466 = 0;
									local61.anInt4465 = 1;
									local61.anInt4461 = 0;
									local61.anInt4462 = local27;
									local61.anInt4463 = 0;
									Static213.method3474(local53, arg1.anInt4002, arg1.anInt3974, 0, false);
								} else if (local56 == 2) {
									local61.anInt4466 = 0;
								}
							} else if (local53.anInt1243 >= Static156.method2501(local61.anInt4457).anInt1243) {
								local61 = arg1.aClass153Array3[local29] = null;
							}
						}
						if (local61 == null) {
							local61 = arg1.aClass153Array3[local29] = new Class153();
							local61.anInt4457 = local19;
							local61.anInt4463 = 0;
							local61.anInt4461 = 0;
							local61.anInt4465 = 1;
							local61.anInt4466 = 0;
							local61.anInt4462 = local27;
							Static213.method3474(local53, arg1.anInt4002, arg1.anInt3974, 0, false);
						}
					}
				}
				local29++;
				local23 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V")
	public static void method556() {
		Static189.aClass26_35.method515();
		Static51.aClass26_7.method515();
		Static193.aClass26_37.method515();
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)I")
	public static int method557() {
		if (Static122.aFrame1 != null) {
			return 3;
		} else if (Static94.aBoolean138 && Static140.aBoolean184) {
			return 2;
		} else if (Static94.aBoolean138 && !Static140.aBoolean184) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!fh;I)I")
	public static int method558(@OriginalArg(0) Class58 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1359(Static99.anInt2120)) {
			local5++;
		}
		if (arg0.method1359(Static227.anInt4364)) {
			local5++;
		}
		if (arg0.method1359(Static221.anInt4282)) {
			local5++;
		}
		if (arg0.method1359(Static85.anInt1975)) {
			local5++;
		}
		if (arg0.method1359(Static214.anInt4207)) {
			local5++;
		}
		if (arg0.method1359(Static281.anInt5333)) {
			local5++;
		}
		if (arg0.method1359(Static275.anInt5231)) {
			local5++;
		}
		if (arg0.method1359(Static245.anInt3786)) {
			local5++;
		}
		if (arg0.method1359(Static113.anInt2296)) {
			local5++;
		}
		if (arg0.method1359(Static212.anInt4163)) {
			local5++;
		}
		if (arg0.method1359(Static124.anInt2449)) {
			local5++;
		}
		if (arg0.method1359(Static73.anInt1632)) {
			local5++;
		}
		if (arg0.method1359(Static9.anInt130)) {
			local5++;
		}
		if (arg0.method1359(Static228.anInt4372)) {
			local5++;
		}
		return local5;
	}
}
