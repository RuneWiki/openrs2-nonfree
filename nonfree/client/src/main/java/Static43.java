import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "[Lclient!kk;")
	public static final Class2_Sub16[] aClass2_Sub16Array1 = new Class2_Sub16[2048];

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
	public static int anInt857 = 0;

	@OriginalMember(owner = "client!ck", name = "S", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_21 = new Class205(97, 14);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg7 && arg3 == arg8 && arg6 == arg0 && arg1 == arg5) {
			Static149.method5441(arg7, arg8, arg0, arg4, arg1);
			return;
		}
		@Pc(48) int local48 = arg7;
		@Pc(50) int local50 = arg8;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg2 * 3;
		@Pc(66) int local66 = arg3 * 3;
		@Pc(70) int local70 = arg6 * 3;
		@Pc(74) int local74 = arg5 * 3;
		@Pc(83) int local83 = arg0 + local62 - local70 - arg7;
		@Pc(93) int local93 = local66 + arg1 - arg8 - local74;
		@Pc(103) int local103 = local54 + local70 - local62 - local62;
		@Pc(113) int local113 = local58 + local74 - local66 - local66;
		@Pc(118) int local118 = local62 - local54;
		@Pc(123) int local123 = local66 - local58;
		for (@Pc(125) int local125 = 128; local125 <= 4096; local125 += 128) {
			@Pc(133) int local133 = local125 * local125 >> 12;
			@Pc(139) int local139 = local125 * local133 >> 12;
			@Pc(143) int local143 = local83 * local139;
			@Pc(147) int local147 = local93 * local139;
			@Pc(151) int local151 = local103 * local133;
			@Pc(155) int local155 = local113 * local133;
			@Pc(159) int local159 = local125 * local118;
			@Pc(163) int local163 = local125 * local123;
			@Pc(174) int local174 = (local151 + local143 + local159 >> 12) + arg7;
			@Pc(186) int local186 = arg8 + (local147 + local155 + local163 >> 12);
			Static149.method5441(local48, local50, local174, arg4, local186);
			local50 = local186;
			local48 = local174;
		}
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
	public static void method732() {
		if (Static1.aFloat80 < 1024.0F) {
			Static1.aFloat80 = 1024.0F;
		}
		if (Static1.aFloat80 > 3072.0F) {
			Static1.aFloat80 = 3072.0F;
		}
		while (Static127.aFloat41 >= 16384.0F) {
			Static127.aFloat41 -= 16384.0F;
		}
		while (Static127.aFloat41 < 0.0F) {
			Static127.aFloat41 += 16384.0F;
		}
		@Pc(41) int local41 = Static28.anInt601 >> 7;
		@Pc(45) int local45 = Static289.anInt5022 >> 7;
		@Pc(51) int local51 = Static170.method3006(Static28.anInt601, Static289.anInt5022, Static382.anInt6523);
		@Pc(53) int local53 = 0;
		@Pc(71) int local71;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local71 = local41 - 4; local71 <= local41 + 4; local71++) {
				for (@Pc(77) int local77 = local45 - 4; local77 <= local45 + 4; local77++) {
					@Pc(81) int local81 = Static382.anInt6523;
					if (local81 < 3 && Static210.method3518(local71, local77)) {
						local81++;
					}
					@Pc(94) int local94 = 0;
					if (Static372.aClass56_Sub1_2.aByteArrayArrayArray11 != null && Static372.aClass56_Sub1_2.aByteArrayArrayArray11[local81] != null) {
						local94 = (Static372.aClass56_Sub1_2.aByteArrayArrayArray11[local81][local71][local77] & 0xFF) * 8;
					}
					@Pc(128) int local128 = local94 + local51 - Static350.aClass107Array4[local81].method4685(local71, local77);
					if (local128 > local53) {
						local53 = local128;
					}
				}
			}
		}
		local71 = local53 * 1536;
		if (local71 > 786432) {
			local71 = 786432;
		}
		if (local71 < 262144) {
			local71 = 262144;
		}
		if (local71 > Static50.anInt1038) {
			Static50.anInt1038 += (local71 - Static50.anInt1038) / 24;
		} else if (Static50.anInt1038 > local71) {
			Static50.anInt1038 += (local71 - Static50.anInt1038) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!dh;III[Z)V")
	public static void method733(@OriginalArg(0) Class2_Sub10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static350.aClass107Array4 == Static94.aClass107Array2) {
			return;
		}
		@Pc(9) int local9 = Static90.aClass107Array1[arg1].method4673(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class107 local22 = Static90.aClass107Array1[local11];
				if (local22 != null) {
					local22.method4683(arg0, arg2, local9 - local22.method4673(arg2, arg3), arg3);
				}
			}
		}
	}
}
