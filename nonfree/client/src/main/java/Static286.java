import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "[I")
	public static int[] anIntArray346 = new int[2];

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_72 = new Class218(26, 3);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[BIIB)Z")
	public static boolean method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub15 local12 = new Class3_Sub15(arg2);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(18) int local18 = local12.method8458();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(37) int local37;
				while (!local31) {
					local37 = local12.method8465();
					if (local37 == 0) {
						continue label56;
					}
					local29 += local37 - 1;
					@Pc(64) int local64 = local29 & 0x3F;
					@Pc(70) int local70 = local29 >> 6 & 0x3F;
					@Pc(76) int local76 = local12.method8401() >> 2;
					@Pc(80) int local80 = arg0 + local70;
					@Pc(84) int local84 = arg1 + local64;
					if (local80 > 0 && local84 > 0 && local80 < arg3 - 1 && local84 < arg4 - 1) {
						@Pc(106) Class272 local106 = Static541.aClass349_4.method8123(local14);
						if (local76 != 22 || Static552.aClass3_Sub48_30.aClass23_Sub12_1.method3750() != 0 || local106.anInt8270 != 0 || local106.anInt8293 == 1 || local106.aBoolean701) {
							if (!local106.method6850()) {
								local7 = false;
								Static320.anInt6482++;
							}
							local31 = true;
						}
					}
				}
				local37 = local12.method8465();
				if (local37 == 0) {
					break;
				}
				local12.method8401();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
	public static void method4981(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class3 local10 = Static149.aClass307_22.method7421(); local10 != null; local10 = Static149.aClass307_22.method7428()) {
			if ((long) arg0 == (local10.aLong277 >> 48 & 0xFFFFL)) {
				local10.method8671();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Z")
	public static boolean method4983(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!rq;Z)Z")
	public static boolean method4985(@OriginalArg(0) Class2_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static500.aClass274Array2 == Static524.aClass274Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8581();
		if (arg0.aShort121 < 0 || arg0.aShort124 < 0 || arg0.aShort122 >= Static642.anInt10523 || arg0.aShort123 >= Static158.anInt3845) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort121; local36 <= arg0.aShort122; local36++) {
			for (local40 = arg0.aShort124; local40 <= arg0.aShort123; local40++) {
				@Pc(47) Class106 local47 = Static139.method3134(arg0.aByte128, local36, local40);
				if (local47 != null) {
					@Pc(53) Class243 local53 = Static151.method3296(arg0);
					@Pc(56) Class243 local56 = local47.aClass243_1;
					if (local56 == null) {
						local47.aClass243_1 = local53;
					} else {
						while (local56.aClass243_3 != null) {
							local56 = local56.aClass243_3;
						}
						local56.aClass243_3 = local53;
					}
					if (local6 && (Static226.anIntArrayArray49[local36][local40] & 0xFF000000) != 0) {
						local8 = Static226.anIntArrayArray49[local36][local40];
						local10 = Static453.aShortArrayArray18[local36][local40];
						local12 = Static256.aByteArrayArray10[local36][local40];
					}
					if (!arg1 && local47.aClass2_Sub3_Sub5_1 != null && local47.aClass2_Sub3_Sub5_1.aShort116 > local33) {
						local33 = local47.aClass2_Sub3_Sub5_1.aShort116;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort121; local40 <= arg0.aShort122; local40++) {
				for (@Pc(136) int local136 = arg0.aShort124; local136 <= arg0.aShort123; local136++) {
					if ((Static226.anIntArrayArray49[local40][local136] & 0xFF000000) == 0) {
						Static226.anIntArrayArray49[local40][local136] = local8;
						Static453.aShortArrayArray18[local40][local136] = local10;
						Static256.aByteArrayArray10[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static113.aClass2_Sub3_Sub1Array3[Static185.anInt4396++] = arg0;
		} else {
			local40 = Static500.aClass274Array2 == Static524.aClass274Array3 ? 1 : 0;
			if (!arg0.method8570()) {
				arg0.aClass2_Sub3_23 = Static634.aClass2_Sub3Array7[local40];
				Static634.aClass2_Sub3Array7[local40] = arg0;
			} else if (arg0.method8579()) {
				arg0.aClass2_Sub3_23 = Static464.aClass2_Sub3Array6[local40];
				Static464.aClass2_Sub3Array6[local40] = arg0;
			} else {
				arg0.aClass2_Sub3_23 = Static44.aClass2_Sub3Array3[local40];
				Static44.aClass2_Sub3Array3[local40] = arg0;
				Static160.aBoolean330 = true;
			}
		}
		if (arg1) {
			arg0.anInt10429 -= local33;
		}
		return true;
	}
}
