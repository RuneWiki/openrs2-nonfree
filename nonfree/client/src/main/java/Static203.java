import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hha", name = "H", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_11 = new Class316(14, 0, 4, 1);

	@OriginalMember(owner = "client!hha", name = "I", descriptor = "I")
	public static int anInt4658 = 2;

	@OriginalMember(owner = "client!hha", name = "P", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!hha", name = "S", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_28 = new Class43();

	@OriginalMember(owner = "client!hha", name = "T", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[16];

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(BI)V")
	public static void method3755(@OriginalArg(1) int arg0) {
		Static298.anInt10341 = arg0;
		Static527.aClass236_86.method6253();
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!wp;I)V")
	public static void method3756(@OriginalArg(0) Class8_Sub8_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method8592();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static315.anInt9128; local12++) {
			local18 = Static533.anIntArray506[local12];
			if ((Static67.aByteArray9[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static67.aByteArray9[local18] = (byte) (Static67.aByteArray9[local18] | 0x2);
				} else {
					local46 = arg0.method8586(1);
					if (local46 == 0) {
						local7 = Static144.method3001(arg0);
						Static67.aByteArray9[local18] = (byte) (Static67.aByteArray9[local18] | 0x2);
					} else {
						Static600.method8251(arg0, local18);
					}
				}
			}
		}
		arg0.method8590();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method8592();
		@Pc(123) int local123;
		for (local18 = 0; local18 < Static315.anInt9128; local18++) {
			local46 = Static533.anIntArray506[local18];
			if ((Static67.aByteArray9[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static67.aByteArray9[local46] = (byte) (Static67.aByteArray9[local46] | 0x2);
					local7--;
				} else {
					local123 = arg0.method8586(1);
					if (local123 == 0) {
						local7 = Static144.method3001(arg0);
						Static67.aByteArray9[local46] = (byte) (Static67.aByteArray9[local46] | 0x2);
					} else {
						Static600.method8251(arg0, local46);
					}
				}
			}
		}
		arg0.method8590();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method8592();
		@Pc(204) int local204;
		for (local46 = 0; local46 < Static314.anInt6379; local46++) {
			local123 = Static566.anIntArray540[local46];
			if ((Static67.aByteArray9[local123] & 0x1) != 0) {
				if (local7 > 0) {
					Static67.aByteArray9[local123] = (byte) (Static67.aByteArray9[local123] | 0x2);
					local7--;
				} else {
					local204 = arg0.method8586(1);
					if (local204 == 0) {
						local7 = Static144.method3001(arg0);
						Static67.aByteArray9[local123] = (byte) (Static67.aByteArray9[local123] | 0x2);
					} else if (Static434.method6725(arg0, local123)) {
						Static67.aByteArray9[local123] = (byte) (Static67.aByteArray9[local123] | 0x2);
					}
				}
			}
		}
		arg0.method8590();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method8592();
		for (local123 = 0; local123 < Static314.anInt6379; local123++) {
			local204 = Static566.anIntArray540[local123];
			if ((Static67.aByteArray9[local204] & 0x1) == 0) {
				if (local7 > 0) {
					Static67.aByteArray9[local204] = (byte) (Static67.aByteArray9[local204] | 0x2);
					local7--;
				} else {
					@Pc(288) int local288 = arg0.method8586(1);
					if (local288 == 0) {
						local7 = Static144.method3001(arg0);
						Static67.aByteArray9[local204] = (byte) (Static67.aByteArray9[local204] | 0x2);
					} else if (Static434.method6725(arg0, local204)) {
						Static67.aByteArray9[local204] = (byte) (Static67.aByteArray9[local204] | 0x2);
					}
				}
			}
		}
		arg0.method8590();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static314.anInt6379 = 0;
		Static315.anInt9128 = 0;
		for (local204 = 1; local204 < 2048; local204++) {
			Static67.aByteArray9[local204] = (byte) (Static67.aByteArray9[local204] >> 1);
			@Pc(356) Class15_Sub1_Sub2_Sub2_Sub1 local356 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local204];
			if (local356 == null) {
				Static566.anIntArray540[Static314.anInt6379++] = local204;
			} else {
				Static533.anIntArray506[Static315.anInt9128++] = local204;
			}
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "([I[II)V")
	public static void method3758(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static554.anIntArray530 = null;
			Static70.anIntArray82 = null;
			Static644.aByteArrayArrayArray23 = null;
			return;
		}
		Static70.anIntArray82 = arg0;
		Static554.anIntArray530 = new int[arg0.length];
		Static644.aByteArrayArrayArray23 = new byte[arg0.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static70.anIntArray82.length; local28++) {
			Static644.aByteArrayArrayArray23[local28] = new byte[arg1[local28]][];
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!efa;I)V")
	public static void method3759(@OriginalArg(0) Class15_Sub1_Sub2_Sub2_Sub1 arg0) {
		@Pc(15) Class8_Sub4 local15 = (Class8_Sub4) Static413.aClass253_30.method6594((long) arg0.anInt8075);
		if (local15 == null) {
			return;
		}
		if (local15.aClass8_Sub16_Sub3_2 != null) {
			Static15.aClass8_Sub16_Sub5_1.method7443(local15.aClass8_Sub16_Sub3_2);
			local15.aClass8_Sub16_Sub3_2 = null;
		}
		local15.method8640();
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BIIIIIFZI)[[I")
	public static int[][] method3760(@OriginalArg(6) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class8_Sub2_Sub20 local13 = new Class8_Sub2_Sub20();
		local13.anInt5427 = (int) (arg0 * 4096.0F);
		local13.aBoolean400 = false;
		local13.anInt5426 = 4;
		local13.anInt5432 = 3;
		local13.anInt5421 = 4;
		local13.method8508();
		Static364.method5678(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method4463(local45, local9[local45]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static251.anInt9634 <= arg0 && arg1 <= Static366.anInt6946 && Static444.anInt8258 <= arg5 && Static188.anInt4410 >= arg3) {
			Static258.method4556(arg0, arg5, arg2, arg1, arg4, arg6, arg3);
		} else {
			Static99.method2238(arg2, arg5, arg4, arg1, arg0, arg3, arg6);
		}
	}
}
