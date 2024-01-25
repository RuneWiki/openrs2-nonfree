import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!np", name = "B", descriptor = "Lclient!e;")
	public static Class46 aClass46_5;

	@OriginalMember(owner = "client!np", name = "F", descriptor = "I")
	public static int anInt4382;

	@OriginalMember(owner = "client!np", name = "X", descriptor = "I")
	public static int anInt4396;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method3933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg2[local17 + arg0] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(48) char local48 = Static284.aCharArray7[local27 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local27 = local48;
				}
				local8[local15++] = (char) local27;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!tf;BLclient!tf;)V")
	public static void method3934(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class14 arg1) {
		if (arg0.aClass14_247 != null) {
			arg0.method5986();
		}
		arg0.aClass14_248 = arg1;
		arg0.aClass14_247 = arg1.aClass14_247;
		arg0.aClass14_247.aClass14_248 = arg0;
		arg0.aClass14_248.aClass14_247 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZI[Lclient!ne;)V")
	public static void method3935(@OriginalArg(1) int arg0, @OriginalArg(2) Class146[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class146 local9 = arg1[local3];
			if (local9 != null && local9.anInt4146 == arg0 && (!local9.aBoolean260 || !Static42.method1037(local9))) {
				if (local9.anInt4135 == 0) {
					if (!local9.aBoolean260 && Static42.method1037(local9) && local9 != Static86.aClass146_19) {
						continue;
					}
					method3935(local9.anInt4214, arg1);
					if (local9.aClass146Array2 != null) {
						method3935(local9.anInt4214, local9.aClass146Array2);
					}
					@Pc(55) Class14_Sub27 local55 = (Class14_Sub27) Static198.aClass25_20.method691((long) local9.anInt4214);
					if (local55 != null) {
						Static164.method3269(local55.anInt5186);
					}
				}
				if (local9.anInt4135 == 6) {
					@Pc(85) int local85;
					if (local9.anInt4202 != -1 || local9.anInt4191 != -1) {
						@Pc(80) boolean local80 = Static51.method1232(local9);
						if (local80) {
							local85 = local9.anInt4191;
						} else {
							local85 = local9.anInt4202;
						}
						if (local85 != -1) {
							@Pc(97) Class79 local97 = Static233.method4080(local85);
							if (local97 != null) {
								local9.anInt4201 += Static71.anInt5636;
								while (local97.anIntArray215[local9.anInt4155] < local9.anInt4201) {
									local9.anInt4201 -= local97.anIntArray215[local9.anInt4155];
									local9.anInt4155++;
									if (local9.anInt4155 >= local97.anIntArray217.length) {
										local9.anInt4155 -= local97.anInt2353;
										if (local9.anInt4155 < 0 || local97.anIntArray217.length <= local9.anInt4155) {
											local9.anInt4155 = 0;
										}
									}
									local9.anInt4147 = local9.anInt4155 + 1;
									if (local9.anInt4147 >= local97.anIntArray217.length) {
										local9.anInt4147 -= local97.anInt2353;
										if (local9.anInt4147 < 0 || local97.anIntArray217.length <= local9.anInt4147) {
											local9.anInt4147 = -1;
										}
									}
									Static166.method3295(local9);
								}
							}
						}
					}
					if (local9.anInt4143 != 0 && !local9.aBoolean260) {
						@Pc(223) int local223 = local9.anInt4143 >> 16;
						local85 = local9.anInt4143 << 16 >> 16;
						@Pc(234) int local234 = local223 * Static71.anInt5636;
						local9.anInt4165 = local234 + local9.anInt4165 & 0x3FFF;
						local85 *= Static71.anInt5636;
						local9.anInt4190 = local85 + local9.anInt4190 & 0x3FFF;
						Static166.method3295(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[JI[IB)V")
	public static void method3937(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(28) int local28 = (arg2 + arg0) / 2;
		@Pc(30) int local30 = arg2;
		@Pc(34) long local34 = arg1[local28];
		arg1[local28] = arg1[arg0];
		arg1[arg0] = local34;
		@Pc(48) int local48 = arg3[local28];
		arg3[local28] = arg3[arg0];
		arg3[arg0] = local48;
		for (@Pc(60) int local60 = arg2; local60 < arg0; local60++) {
			if ((long) (local60 & 0x1) + local34 > arg1[local60]) {
				@Pc(77) long local77 = arg1[local60];
				arg1[local60] = arg1[local30];
				arg1[local30] = local77;
				@Pc(91) int local91 = arg3[local60];
				arg3[local60] = arg3[local30];
				arg3[local30++] = local91;
			}
		}
		arg1[arg0] = arg1[local30];
		arg1[local30] = local34;
		arg3[arg0] = arg3[local30];
		arg3[local30] = local48;
		method3937(local30 - 1, arg1, arg2, arg3);
		method3937(arg0, arg1, local30 + 1, arg3);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
	public static void method3938(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static53.method1258(0, arg1, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIII)V")
	public static void method3939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class188 local9 = Static162.aClass188ArrayArray1[arg0][arg1];
		Static29.method4219(5000, local9 == null ? Static338.aClass188_2 : local9);
	}
}
