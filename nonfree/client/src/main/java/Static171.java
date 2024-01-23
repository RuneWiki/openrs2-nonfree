import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "Lclient!th;")
	public static Class168 aClass168_126;

	@OriginalMember(owner = "client!mi", name = "T", descriptor = "[J")
	public static long[] aLongArray6 = new long[500];

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
	public static int anInt3850 = 0;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(B)V")
	public static void method2785() {
		Static105.aClass89_13.method2265();
		Static62.aClass89_11.method2265();
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(II)V")
	public static void method2787(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub3_Sub22 local16 = Static271.method4108(12, arg0);
		local16.method4464();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[IB[I)V")
	public static void method2788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg0) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) int local17 = arg2[local11];
		arg2[local11] = arg2[arg0];
		arg2[arg0] = local17;
		@Pc(31) int local31 = arg3[local11];
		arg3[local11] = arg3[arg0];
		arg3[arg0] = local31;
		for (@Pc(43) int local43 = arg1; local43 < arg0; local43++) {
			if (local17 + (local43 & 0x1) < arg2[local43]) {
				@Pc(60) int local60 = arg2[local43];
				arg2[local43] = arg2[local13];
				arg2[local13] = local60;
				@Pc(74) int local74 = arg3[local43];
				arg3[local43] = arg3[local13];
				arg3[local13++] = local74;
			}
		}
		arg2[arg0] = arg2[local13];
		arg2[local13] = local17;
		arg3[arg0] = arg3[local13];
		arg3[local13] = local31;
		method2788(local13 - 1, arg1, arg2, arg3);
		method2788(arg0, local13 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(II)Lclient!wf;")
	public static Class191 method2789(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xFFFF;
		@Pc(17) int local17 = arg0 >> 16;
		if (Static34.aClass191ArrayArray1[local17] == null || Static34.aClass191ArrayArray1[local17][local13] == null) {
			@Pc(33) boolean local33 = Static99.method1656(local17);
			if (!local33) {
				return null;
			}
		}
		return Static34.aClass191ArrayArray1[local17][local13];
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lclient!wf;IB)V")
	public static void method2790(@OriginalArg(0) Class191[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(21) Class191 local21 = arg0[local13];
			if (local21 != null && arg1 == local21.anInt6093 && (!local21.aBoolean408 || !Static35.method759(local21))) {
				if (local21.anInt6086 == 0) {
					if (!local21.aBoolean408 && Static35.method759(local21) && local21 != Static2.aClass191_2) {
						continue;
					}
					method2790(arg0, local21.anInt6134);
					if (local21.aClass191Array2 != null) {
						method2790(local21.aClass191Array2, local21.anInt6134);
					}
					@Pc(76) Class1_Sub12 local76 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local21.anInt6134);
					if (local76 != null) {
						Static114.method1844(local76.anInt2208);
					}
				}
				if (local21.anInt6086 == 6) {
					@Pc(109) int local109;
					if (local21.anInt6080 != -1 || local21.anInt6098 != -1) {
						@Pc(104) boolean local104 = Static125.method2042(local21);
						if (local104) {
							local109 = local21.anInt6098;
						} else {
							local109 = local21.anInt6080;
						}
						if (local109 != -1) {
							@Pc(123) Class32 local123 = Static202.method3231(local109);
							if (local123 != null) {
								local21.anInt6103 += Static286.anInt5740;
								while (local123.anIntArray121[local21.anInt6104] < local21.anInt6103) {
									local21.anInt6103 -= local123.anIntArray121[local21.anInt6104];
									local21.anInt6104++;
									if (local21.anInt6104 >= local123.anIntArray123.length) {
										local21.anInt6104 -= local123.anInt968;
										if (local21.anInt6104 < 0 || local21.anInt6104 >= local123.anIntArray123.length) {
											local21.anInt6104 = 0;
										}
									}
									local21.anInt6116 = local21.anInt6104 + 1;
									if (local123.anIntArray123.length <= local21.anInt6116) {
										local21.anInt6116 -= local123.anInt968;
										if (local21.anInt6116 < 0 || local21.anInt6116 >= local123.anIntArray123.length) {
											local21.anInt6116 = -1;
										}
									}
									Static40.method817(local21);
								}
							}
						}
					}
					if (local21.anInt6144 != 0 && !local21.aBoolean408) {
						local109 = local21.anInt6144 << 16 >> 16;
						local109 *= Static286.anInt5740;
						@Pc(253) int local253 = local21.anInt6144 >> 16;
						@Pc(257) int local257 = local253 * Static286.anInt5740;
						local21.anInt6118 = local109 + local21.anInt6118 & 0x7FF;
						local21.anInt6091 = local21.anInt6091 + local257 & 0x7FF;
						Static40.method817(local21);
					}
				}
			}
		}
	}
}
