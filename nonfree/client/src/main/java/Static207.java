import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
	public static int anInt5395 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method4484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static306.method4566(arg1, Static231.anInt4333, Static218.anInt4086);
		@Pc(17) int local17 = Static306.method4566(arg6, Static231.anInt4333, Static218.anInt4086);
		@Pc(23) int local23 = Static306.method4566(arg0, Static188.anInt3598, Static289.anInt5245);
		@Pc(29) int local29 = Static306.method4566(arg5, Static188.anInt3598, Static289.anInt5245);
		@Pc(39) int local39 = Static306.method4566(arg2 + arg1, Static231.anInt4333, Static218.anInt4086);
		@Pc(47) int local47 = Static306.method4566(arg6 - arg2, Static231.anInt4333, Static218.anInt4086);
		@Pc(49) int local49;
		for (local49 = local11; local49 < local39; local49++) {
			Static103.method1978(arg3, local29, local23, Static40.anIntArrayArray6[local49]);
		}
		for (local49 = local17; local49 > local47; local49--) {
			Static103.method1978(arg3, local29, local23, Static40.anIntArrayArray6[local49]);
		}
		@Pc(93) int local93 = Static306.method4566(arg0 + arg2, Static188.anInt3598, Static289.anInt5245);
		@Pc(104) int local104 = Static306.method4566(arg5 - arg2, Static188.anInt3598, Static289.anInt5245);
		for (local49 = local39; local49 <= local47; local49++) {
			@Pc(113) int[] local113 = Static40.anIntArrayArray6[local49];
			Static103.method1978(arg3, local93, local23, local113);
			Static103.method1978(arg4, local104, local93, local113);
			Static103.method1978(arg3, local29, local104, local113);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public static void method4488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static116.aClass1_Sub13_Sub1_48.method1887(94);
		Static116.aClass1_Sub13_Sub1_48.method1835(arg0);
		Static116.aClass1_Sub13_Sub1_48.method1836(arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method4490() {
		if (!Static71.aBoolean165 || Static42.aBoolean86) {
			return;
		}
		@Pc(13) Class1_Sub16[][][] local13 = Static254.aClass1_Sub16ArrayArrayArray3;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(27) Class1_Sub16[][] local27 = local13[local15];
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				for (@Pc(39) int local39 = 0; local39 < local27[local29].length; local39++) {
					@Pc(51) Class1_Sub16 local51 = local27[local29][local39];
					if (local51 != null) {
						@Pc(70) Class11_Sub1_Sub1 local70;
						if (local51.aClass124_1 != null && local51.aClass124_1.aClass11_10 instanceof Class11_Sub1_Sub1) {
							local70 = (Class11_Sub1_Sub1) local51.aClass124_1.aClass11_10;
							if ((local51.aClass124_1.aLong143 & Long.MIN_VALUE) == 0L) {
								local70.method406(false, true, true, false, true, true);
							} else {
								local70.method406(true, true, true, true, true, true);
							}
						}
						if (local51.aClass18_1 != null) {
							if (local51.aClass18_1.aClass11_1 instanceof Class11_Sub1_Sub1) {
								local70 = (Class11_Sub1_Sub1) local51.aClass18_1.aClass11_1;
								if ((Long.MIN_VALUE & local51.aClass18_1.aLong21) == 0L) {
									local70.method406(false, true, true, false, true, true);
								} else {
									local70.method406(true, true, true, true, true, true);
								}
							}
							if (local51.aClass18_1.aClass11_2 instanceof Class11_Sub1_Sub1) {
								local70 = (Class11_Sub1_Sub1) local51.aClass18_1.aClass11_2;
								if ((local51.aClass18_1.aLong21 & Long.MIN_VALUE) == 0L) {
									local70.method406(false, true, true, false, true, true);
								} else {
									local70.method406(true, true, true, true, true, true);
								}
							}
						}
						if (local51.aClass39_1 != null) {
							if (local51.aClass39_1.aClass11_4 instanceof Class11_Sub1_Sub1) {
								local70 = (Class11_Sub1_Sub1) local51.aClass39_1.aClass11_4;
								if ((local51.aClass39_1.aLong48 & Long.MIN_VALUE) == 0L) {
									local70.method406(false, true, true, false, true, true);
								} else {
									local70.method406(true, true, true, true, true, true);
								}
							}
							if (local51.aClass39_1.aClass11_3 instanceof Class11_Sub1_Sub1) {
								local70 = (Class11_Sub1_Sub1) local51.aClass39_1.aClass11_3;
								if ((local51.aClass39_1.aLong48 & Long.MIN_VALUE) == 0L) {
									local70.method406(false, true, true, false, true, true);
								} else {
									local70.method406(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(271) int local271 = 0; local271 < local51.anInt2573; local271++) {
							if (local51.aClass45Array2[local271].aClass11_5 instanceof Class11_Sub1_Sub1) {
								@Pc(290) Class11_Sub1_Sub1 local290 = (Class11_Sub1_Sub1) local51.aClass45Array2[local271].aClass11_5;
								if ((Long.MIN_VALUE & local51.aClass45Array2[local271].aLong56) == 0L) {
									local290.method406(false, true, true, false, true, true);
								} else {
									local290.method406(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static42.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!si;I)Z")
	public static boolean method4491(@OriginalArg(0) Class157 arg0) {
		if (arg0.anIntArray524 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < arg0.anIntArray524.length; local21++) {
			@Pc(31) int local31 = Static202.method3425(arg0, local21);
			@Pc(36) int local36 = arg0.anIntArray532[local21];
			if (arg0.anIntArray524[local21] == 2) {
				if (local31 >= local36) {
					return false;
				}
			} else if (arg0.anIntArray524[local21] == 3) {
				if (local36 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray524[local21] == 4) {
				if (local31 == local36) {
					return false;
				}
			} else if (local31 != local36) {
				return false;
			}
		}
		return true;
	}
}
