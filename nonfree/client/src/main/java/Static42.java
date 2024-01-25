import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[Lclient!sl;")
	public static Class331[] aClass331Array1;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
	public static final int[] anIntArray40 = new int[13];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method533(@OriginalArg(1) int arg0) {
		if (Static488.aClass6_Sub29_3 == null || (arg0 < 0 || Static488.aClass6_Sub29_3.anInt5466 <= arg0)) {
			return;
		}
		@Pc(30) Class200 local30 = Static488.aClass6_Sub29_3.aClass200Array1[arg0];
		if (local30.aByte80 != -1) {
			return;
		}
		@Pc(40) Class260 local40 = Static629.method8573();
		@Pc(46) Class6_Sub13 local46 = Static30.method353(Static93.aClass241_25, local40.aClass270_2);
		local46.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(local30.aString58) + 2);
		local46.aClass6_Sub15_Sub1_1.method3040(arg0);
		local46.aClass6_Sub15_Sub1_1.method2991(local30.aString58);
		local40.method6404(local46);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!lt;ILclient!ha;I)V")
	public static void method534(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2) {
		@Pc(15) int local15;
		if (Static275.anIntArray278 != null && arg1 <= arg0.aByte90) {
			for (local15 = 0; local15 < Static275.anIntArray278.length; local15++) {
				if (Static275.anIntArray278[local15] != -1000000 && (arg0.anIntArray354[0] <= Static275.anIntArray278[local15] || arg0.anIntArray354[1] <= Static275.anIntArray278[local15] || arg0.anIntArray354[2] <= Static275.anIntArray278[local15] || Static275.anIntArray278[local15] >= arg0.anIntArray354[3]) && (Static150.anIntArray170[local15] >= arg0.anIntArray356[0] || Static150.anIntArray170[local15] >= arg0.anIntArray356[1] || arg0.anIntArray356[2] <= Static150.anIntArray170[local15] || arg0.anIntArray356[3] <= Static150.anIntArray170[local15]) && (Static2.anIntArray2[local15] <= arg0.anIntArray356[0] || Static2.anIntArray2[local15] <= arg0.anIntArray356[1] || Static2.anIntArray2[local15] <= arg0.anIntArray356[2] || arg0.anIntArray356[3] >= Static2.anIntArray2[local15]) && (Static191.anIntArray207[local15] >= arg0.anIntArray355[0] || Static191.anIntArray207[local15] >= arg0.anIntArray355[1] || Static191.anIntArray207[local15] >= arg0.anIntArray355[2] || arg0.anIntArray355[3] <= Static191.anIntArray207[local15]) && (Static37.anIntArray36[local15] <= arg0.anIntArray355[0] || arg0.anIntArray355[1] >= Static37.anIntArray36[local15] || arg0.anIntArray355[2] >= Static37.anIntArray36[local15] || arg0.anIntArray355[3] >= Static37.anIntArray36[local15])) {
					return;
				}
			}
		}
		@Pc(317) int local317;
		@Pc(339) int local339;
		@Pc(359) boolean local359;
		@Pc(398) float local398;
		if (arg0.aByte89 == 1) {
			local15 = Static382.anInt6636 + arg0.aShort65 - Static506.anInt8446;
			if (local15 >= 0 && Static382.anInt6636 + Static382.anInt6636 >= local15) {
				local317 = Static382.anInt6636 + arg0.aShort66 - Static676.anInt10368;
				if (local317 < 0) {
					local317 = 0;
				} else if (Static382.anInt6636 + Static382.anInt6636 < local317) {
					return;
				}
				local339 = Static382.anInt6636 + arg0.aShort67 - Static676.anInt10368;
				if (Static382.anInt6636 + Static382.anInt6636 < local339) {
					local339 = Static382.anInt6636 + Static382.anInt6636;
				} else if (local339 < 0) {
					return;
				}
				local359 = false;
				while (local339 >= local317) {
					if (Static488.aBooleanArrayArray4[local15][local317++]) {
						local359 = true;
						break;
					}
				}
				if (local359) {
					local398 = (float) (Static67.anInt814 - arg0.anIntArray356[0]);
					if (local398 < 0.0F) {
						local398 *= -1.0F;
					}
					if (!local398 < (float) Static567.anInt9140 && (Static22.method4613(0, arg0) && (Static22.method4613(1, arg0) && (Static22.method4613(2, arg0) && Static22.method4613(3, arg0))))) {
						Static322.aClass230Array3[Static141.anInt8738++] = arg0;
					}
				}
			}
		} else if (arg0.aByte89 == 2) {
			local15 = Static382.anInt6636 + arg0.aShort66 - Static676.anInt10368;
			if (local15 >= 0 && Static382.anInt6636 + Static382.anInt6636 >= local15) {
				local317 = Static382.anInt6636 + arg0.aShort65 - Static506.anInt8446;
				if (local317 < 0) {
					local317 = 0;
				} else if (Static382.anInt6636 + Static382.anInt6636 < local317) {
					return;
				}
				local339 = arg0.aShort64 + Static382.anInt6636 - Static506.anInt8446;
				if (local339 > Static382.anInt6636 + Static382.anInt6636) {
					local339 = Static382.anInt6636 + Static382.anInt6636;
				} else if (local339 < 0) {
					return;
				}
				local359 = false;
				while (local339 >= local317) {
					if (Static488.aBooleanArrayArray4[local317++][local15]) {
						local359 = true;
						break;
					}
				}
				if (local359) {
					local398 = (float) (Static139.anInt2877 - arg0.anIntArray355[0]);
					if (local398 < 0.0F) {
						local398 *= -1.0F;
					}
					if (!(local398 < (float) Static567.anInt9140) && (Static22.method4613(0, arg0) && (Static22.method4613(1, arg0) && (Static22.method4613(2, arg0) && Static22.method4613(3, arg0))))) {
						Static322.aClass230Array3[Static141.anInt8738++] = arg0;
					}
				}
			}
		} else if (arg0.aByte89 == 16 || arg0.aByte89 == 8) {
			local15 = Static382.anInt6636 + arg0.aShort65 - Static506.anInt8446;
			if (local15 >= 0 && local15 <= Static382.anInt6636 + Static382.anInt6636) {
				local317 = Static382.anInt6636 + arg0.aShort66 - Static676.anInt10368;
				if (local317 >= 0 && local317 <= Static382.anInt6636 + Static382.anInt6636 && Static488.aBooleanArrayArray4[local15][local317]) {
					@Pc(697) float local697 = (float) (Static67.anInt814 - arg0.anIntArray356[0]);
					if (local697 < 0.0F) {
						local697 *= -1.0F;
					}
					@Pc(714) float local714 = (float) (Static139.anInt2877 - arg0.anIntArray355[0]);
					if (local714 < 0.0F) {
						local714 *= -1.0F;
					}
					if ((!(local697 < (float) Static567.anInt9140) || !(local714 < (float) Static567.anInt9140)) && (Static22.method4613(0, arg0) && (Static22.method4613(1, arg0) && (Static22.method4613(2, arg0) && Static22.method4613(3, arg0))))) {
						Static322.aClass230Array3[Static141.anInt8738++] = arg0;
					}
				}
			}
		} else if (arg0.aByte89 == 4) {
			@Pc(788) float local788 = (float) (arg0.anIntArray354[0] - Static495.anInt8362);
			if (!(local788 <= (float) Static581.anInt9272)) {
				local317 = arg0.aShort66 + Static382.anInt6636 - Static676.anInt10368;
				if (local317 < 0) {
					local317 = 0;
				} else if (Static382.anInt6636 + Static382.anInt6636 < local317) {
					return;
				}
				local339 = Static382.anInt6636 + arg0.aShort67 - Static676.anInt10368;
				if (local339 > Static382.anInt6636 + Static382.anInt6636) {
					local339 = Static382.anInt6636 + Static382.anInt6636;
				} else if (local339 < 0) {
					return;
				}
				@Pc(852) int local852 = Static382.anInt6636 + arg0.aShort65 - Static506.anInt8446;
				if (local852 < 0) {
					local852 = 0;
				} else if (Static382.anInt6636 + Static382.anInt6636 < local852) {
					return;
				}
				@Pc(881) int local881 = arg0.aShort64 + Static382.anInt6636 - Static506.anInt8446;
				if (local881 > Static382.anInt6636 + Static382.anInt6636) {
					local881 = Static382.anInt6636 + Static382.anInt6636;
				} else if (local881 < 0) {
					return;
				}
				@Pc(903) boolean local903 = false;
				label283: for (@Pc(905) int local905 = local852; local905 <= local881; local905++) {
					for (@Pc(911) int local911 = local317; local911 <= local339; local911++) {
						if (Static488.aBooleanArrayArray4[local905][local911]) {
							local903 = true;
							break label283;
						}
					}
				}
				if (local903 && (Static22.method4613(0, arg0) && (Static22.method4613(1, arg0) && (Static22.method4613(2, arg0) && Static22.method4613(3, arg0))))) {
					Static322.aClass230Array3[Static141.anInt8738++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!em;IIB)V")
	public static void method535(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static695.method5644(local6, 0, local6.length, arg2);
		Static365.method5544(local6, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)Z")
	public static boolean method537() {
		Static620.anInt9784++;
		Static362.aBoolean452 = true;
		return true;
	}
}
