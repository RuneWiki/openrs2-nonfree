import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_127 = new Class200(58, 3);

	@OriginalMember(owner = "client!ll", name = "Q", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_101 = new Class145(72, 0);

	@OriginalMember(owner = "client!ll", name = "Y", descriptor = "[I")
	public static final int[] anIntArray373 = new int[32];

	@OriginalMember(owner = "client!ll", name = "ab", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_28 = new Class114();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!rba;Z[[[BIB)Z")
	public static boolean method5015(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static126.aBoolean214) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt8037 >> Static326.anInt5713;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt8034 >> Static326.anInt5713;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class16_Sub1_Sub1) {
			local10 = ((Class16_Sub1_Sub1) arg0).aShort104;
			local17 = ((Class16_Sub1_Sub1) arg0).aShort105;
			local8 = ((Class16_Sub1_Sub1) arg0).aShort103;
			local15 = ((Class16_Sub1_Sub1) arg0).aShort106;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte108 < Static395.anInt6810 && local38 >= Static590.anInt9801 && local38 < Static42.anInt979 && local41 >= Static641.anInt10384 && local41 < Static298.anInt5384) {
					if ((arg2 == null || arg0.aByte109 < arg3 || arg2[arg0.aByte109][local38][local41] != arg4) && arg0.method6982() && !arg0.method6979(Static380.aClass13_86)) {
						return false;
					}
					if (!arg1 && local38 >= Static636.anInt10301 - 16 && local38 <= Static636.anInt10301 + 16 && local41 >= Static66.anInt1803 - 16 && local41 <= Static66.anInt1803 + 16) {
						if (Static573.aBoolean668) {
							Static307.aClass182Array1[Static380.anInt10437++].method4407(arg0);
							Static380.anInt10437 %= Static17.anInt398;
						} else {
							arg0.method6978(Static380.aClass13_86);
						}
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([ILclient!rl;[II[I)V")
	public static void method5018(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class16_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg3.length; local1++) {
			@Pc(6) int local6 = arg3[local1];
			@Pc(10) int local10 = arg2[local1];
			@Pc(14) int local14 = arg0[local1];
			for (@Pc(16) int local16 = 0; local10 != 0 && arg1.aClass148Array3.length > local16; local16++) {
				if ((local10 & 0x1) != 0) {
					if (local6 == -1) {
						arg1.aClass148Array3[local16] = null;
					} else {
						@Pc(30) Class228 local30 = Static479.aClass308_2.method7075(local6);
						@Pc(33) int local33 = local30.anInt6220;
						@Pc(38) Class148 local38 = arg1.aClass148Array3[local16];
						if (local38 != null) {
							if (local6 == local38.anInt4066) {
								if (local33 == 0) {
									local38 = arg1.aClass148Array3[local16] = null;
								} else if (local33 == 1) {
									local38.anInt4065 = 1;
									local38.anInt4067 = 0;
									local38.anInt4069 = local14;
									local38.anInt4062 = 0;
									local38.anInt4072 = 0;
									if (!arg1.aBoolean587) {
										Static145.method2602(0, arg1, local30);
									}
								} else if (local33 == 2) {
									local38.anInt4062 = 0;
								}
							} else if (local30.anInt6227 >= Static479.aClass308_2.method7075(local38.anInt4066).anInt6227) {
								local38 = arg1.aClass148Array3[local16] = null;
							}
						}
						if (local38 == null) {
							local38 = arg1.aClass148Array3[local16] = new Class148();
							local38.anInt4072 = 0;
							local38.anInt4069 = local14;
							local38.anInt4065 = 1;
							local38.anInt4066 = local6;
							local38.anInt4067 = 0;
							local38.anInt4062 = 0;
							if (!arg1.aBoolean587) {
								Static145.method2602(0, arg1, local30);
							}
						}
					}
				}
				local10 >>>= 0x1;
			}
		}
	}
}
