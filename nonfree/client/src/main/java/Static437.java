import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "[[Lclient!uq;")
	public static Class251[][] aClass251ArrayArray2;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
	public static final int anInt3907 = 4;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString31 = null;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
	public static final boolean aBoolean278 = false;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public static void method3291() {
		for (@Pc(3) int local3 = 0; local3 < Static259.anInt4646; local3++) {
			@Pc(14) Class74 local14 = Static113.aClass74Array1[local3];
			@Pc(16) boolean local16 = false;
			@Pc(123) int local123;
			if (local14.aClass1_Sub19_Sub1_2 == null) {
				local14.anInt2294--;
				if ((local14.aByte46 == 2 ? -1500 : -10) > local14.anInt2294) {
					local16 = true;
				} else {
					if (local14.aByte46 == 1 && local14.aClass164_1 == null) {
						local14.aClass164_1 = Static466.method3769(Static30.aClass246_24, local14.anInt2297, 0);
						if (local14.aClass164_1 == null) {
							continue;
						}
						local14.anInt2294 += local14.aClass164_1.method3766();
					} else if (local14.aByte46 == 2 && (local14.aClass1_Sub34_1 == null || local14.aClass1_Sub20_Sub1_2 == null)) {
						if (local14.aClass1_Sub34_1 == null) {
							local14.aClass1_Sub34_1 = Static288.method4188(Static261.aClass246_145, local14.anInt2297);
						}
						if (local14.aClass1_Sub34_1 == null) {
							continue;
						}
						if (local14.aClass1_Sub20_Sub1_2 == null) {
							local14.aClass1_Sub20_Sub1_2 = local14.aClass1_Sub34_1.method4180(new int[] { 22050 });
							if (local14.aClass1_Sub20_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local14.anInt2294 < 0) {
						if (local14.anInt2292 == 0) {
							local123 = local14.anInt2298 * Static38.aClass135_Sub1_1.anInt5110 >> 8;
						} else {
							@Pc(132) int local132 = local14.anInt2292 >> 24 & 0x3;
							if (Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 == local132) {
								@Pc(143) int local143 = (local14.anInt2292 & 0xFF) << 7;
								@Pc(150) int local150 = local14.anInt2292 >> 16 & 0xFF;
								@Pc(160) int local160 = (local150 << 7) + 64 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300;
								if (local160 < 0) {
									local160 = -local160;
								}
								@Pc(172) int local172 = local14.anInt2292 >> 8 & 0xFF;
								@Pc(182) int local182 = (local172 << 7) + 64 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298;
								if (local182 < 0) {
									local182 = -local182;
								}
								@Pc(196) int local196 = local160 + local182 - 128;
								if (local143 < local196) {
									local14.anInt2294 = -99999;
									continue;
								}
								if (local196 < 0) {
									local196 = 0;
								}
								local123 = (local143 - local196) * Static38.aClass135_Sub1_1.anInt5092 * local14.anInt2298 / local143 >> 8;
							} else {
								local123 = 0;
							}
						}
						if (local123 > 0) {
							@Pc(231) Class1_Sub20_Sub1 local231 = null;
							if (local14.aByte46 == 1) {
								local231 = local14.aClass164_1.method3767().method2170(Static187.aClass173_1);
							} else if (local14.aByte46 == 2) {
								local231 = local14.aClass1_Sub20_Sub1_2;
							}
							@Pc(257) Class1_Sub19_Sub1 local257 = local14.aClass1_Sub19_Sub1_2 = Static462.method2026(local231, local123);
							local257.method2038(local14.anInt2293 - 1);
							Static59.aClass1_Sub19_Sub2_1.method2188(local257);
						}
					}
				}
			} else if (!local14.aClass1_Sub19_Sub1_2.method6017()) {
				local16 = true;
			}
			if (local16) {
				Static259.anInt4646--;
				for (local123 = local3; local123 < Static259.anInt4646; local123++) {
					Static113.aClass74Array1[local123] = Static113.aClass74Array1[local123 + 1];
				}
				local3--;
			}
		}
		if (Static176.aBoolean196 && !Static107.method1964()) {
			if (Static38.aClass135_Sub1_1.anInt5109 != 0 && Static105.anInt2176 != -1) {
				Static328.method4657(Static312.aClass246_168, Static38.aClass135_Sub1_1.anInt5109, Static105.anInt2176);
			}
			Static176.aBoolean196 = false;
		} else if (Static38.aClass135_Sub1_1.anInt5109 != 0 && Static105.anInt2176 != -1 && !Static107.method1964()) {
			Static193.method2984(Static148.aClass179_34);
			Static92.aClass1_Sub5_Sub1_1.method5417(Static105.anInt2176);
			Static105.anInt2176 = -1;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII[Ljava/lang/String;[S)V")
	public static void method3294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(8) int local8 = (arg0 + arg1) / 2;
		@Pc(10) int local10 = arg0;
		@Pc(14) String local14 = arg2[local8];
		arg2[local8] = arg2[arg1];
		arg2[arg1] = local14;
		@Pc(28) short local28 = arg3[local8];
		arg3[local8] = arg3[arg1];
		arg3[arg1] = local28;
		for (@Pc(40) int local40 = arg0; local40 < arg1; local40++) {
			if (local14 == null || arg2[local40] != null && arg2[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(60) String local60 = arg2[local40];
				arg2[local40] = arg2[local10];
				arg2[local10] = local60;
				@Pc(74) short local74 = arg3[local40];
				arg3[local40] = arg3[local10];
				arg3[local10++] = local74;
			}
		}
		arg2[arg1] = arg2[local10];
		arg2[local10] = local14;
		arg3[arg1] = arg3[local10];
		arg3[local10] = local28;
		method3294(arg0, local10 - 1, arg2, arg3);
		method3294(local10 + 1, arg1, arg2, arg3);
	}
}
