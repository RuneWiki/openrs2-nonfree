import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "Lclient!hga;")
	public static Class138 aClass138_3;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_109 = new Class130(22, 7);

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_45 = new Class223();

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
	public static void method6906() {
		Static402.anInt7435 = 0;
		@Pc(11) int local11 = Static30.aClass3_Sub3_Sub2_1.method4243();
		@Pc(21) int local21 = Static30.aClass3_Sub3_Sub2_1.method4236();
		@Pc(27) int local27 = Static30.aClass3_Sub3_Sub2_1.method4236();
		@Pc(36) boolean local36 = Static30.aClass3_Sub3_Sub2_1.method4263() == 1;
		Static315.method5161();
		Static327.method5315(local11);
		@Pc(49) int local49 = (Static272.anInt4948 - Static30.aClass3_Sub3_Sub2_1.anInt4736) / 16;
		Static559.anIntArrayArray59 = new int[local49][4];
		@Pc(59) int local59;
		for (@Pc(55) int local55 = 0; local55 < local49; local55++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static559.anIntArrayArray59[local55][local59] = Static30.aClass3_Sub3_Sub2_1.method4207();
			}
		}
		Static593.anIntArray631 = new int[local49];
		Static238.anIntArray235 = new int[local49];
		Static145.aByteArrayArray5 = new byte[local49][];
		Static363.anIntArray57 = new int[local49];
		Static276.anIntArray264 = null;
		Static438.anIntArray481 = new int[local49];
		Static349.aByteArrayArray19 = null;
		Static29.aByteArrayArray1 = new byte[local49][];
		Static156.aByteArrayArray17 = new byte[local49][];
		Static351.anIntArray405 = new int[local49];
		Static419.aByteArrayArray26 = new byte[local49][];
		local49 = 0;
		for (local59 = (local27 - (Static634.anInt10129 >> 4)) / 8; local59 <= (local27 + (Static634.anInt10129 >> 4)) / 8; local59++) {
			for (@Pc(132) int local132 = (local21 - (Static638.anInt10172 >> 4)) / 8; local132 <= ((Static638.anInt10172 >> 4) + local21) / 8; local132++) {
				Static351.anIntArray405[local49] = (local59 << 8) + local132;
				Static593.anIntArray631[local49] = Static395.aClass196_80.method5104("m" + local59 + "_" + local132);
				Static363.anIntArray57[local49] = Static395.aClass196_80.method5104("l" + local59 + "_" + local132);
				Static438.anIntArray481[local49] = Static395.aClass196_80.method5104("um" + local59 + "_" + local132);
				Static238.anIntArray235[local49] = Static395.aClass196_80.method5104("ul" + local59 + "_" + local132);
				local49++;
			}
		}
		Static607.method8701(local21, 11, local27, local36);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIBII)V")
	public static void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static149.anInt2949 < arg2 || arg3 < Static11.anInt9803) {
			return;
		}
		@Pc(29) boolean local29;
		if (arg0 < Static630.anInt10099) {
			local29 = false;
			arg0 = Static630.anInt10099;
		} else if (Static16.anInt4339 < arg0) {
			local29 = false;
			arg0 = Static16.anInt4339;
		} else {
			local29 = true;
		}
		@Pc(56) boolean local56;
		if (arg4 < Static630.anInt10099) {
			local56 = false;
			arg4 = Static630.anInt10099;
		} else if (Static16.anInt4339 >= arg4) {
			local56 = true;
		} else {
			arg4 = Static16.anInt4339;
			local56 = false;
		}
		if (arg2 < Static11.anInt9803) {
			arg2 = Static11.anInt9803;
		} else {
			Static611.method8472(arg4, arg0, Static460.anIntArrayArray53[arg2++], arg1);
		}
		if (arg3 > Static149.anInt2949) {
			arg3 = Static149.anInt2949;
		} else {
			Static611.method8472(arg4, arg0, Static460.anIntArrayArray53[arg3--], arg1);
		}
		@Pc(110) int local110;
		if (local29 && local56) {
			for (local110 = arg2; local110 <= arg3; local110++) {
				@Pc(116) int[] local116 = Static460.anIntArrayArray53[local110];
				local116[arg0] = local116[arg4] = arg1;
			}
			return;
		}
		if (local29) {
			for (local110 = arg2; local110 <= arg3; local110++) {
				Static460.anIntArrayArray53[local110][arg0] = arg1;
			}
			return;
		}
		if (local56) {
			for (local110 = arg2; local110 <= arg3; local110++) {
				Static460.anIntArrayArray53[local110][arg4] = arg1;
			}
			return;
		}
	}
}
