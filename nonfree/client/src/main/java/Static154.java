import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIIIII)V")
	public static void method2506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg4 < 0 || arg0 >= 103 || arg4 >= 103) {
			return;
		}
		@Pc(32) int local32;
		if (arg2 == 0) {
			@Pc(21) Class136 local21 = Static125.method2045(arg3, arg0, arg4);
			if (local21 != null) {
				local32 = (int) (local21.aLong182 >>> 32) & Integer.MAX_VALUE;
				if (arg5 == 2) {
					local21.aClass2_10 = new Class2_Sub5(local32, 2, arg1 + 4, arg3, arg0, arg4, arg6, false, local21.aClass2_10);
					local21.aClass2_9 = new Class2_Sub5(local32, 2, arg1 + 1 & 0x3, arg3, arg0, arg4, arg6, false, local21.aClass2_9);
				} else {
					local21.aClass2_10 = new Class2_Sub5(local32, arg5, arg1, arg3, arg0, arg4, arg6, false, local21.aClass2_10);
				}
			}
		}
		if (arg2 == 1) {
			@Pc(100) Class106 local100 = Static277.method4190(arg3, arg0, arg4);
			if (local100 != null) {
				local32 = Integer.MAX_VALUE & (int) (local100.aLong131 >>> 32);
				if (arg5 == 4 || arg5 == 5) {
					local100.aClass2_5 = new Class2_Sub5(local32, 4, arg1, arg3, arg0, arg4, arg6, false, local100.aClass2_5);
				} else if (arg5 == 6) {
					local100.aClass2_5 = new Class2_Sub5(local32, 4, arg1 + 4, arg3, arg0, arg4, arg6, false, local100.aClass2_5);
				} else if (arg5 == 7) {
					local100.aClass2_5 = new Class2_Sub5(local32, 4, (arg1 + 2 & 0x3) + 4, arg3, arg0, arg4, arg6, false, local100.aClass2_5);
				} else if (arg5 == 8) {
					local100.aClass2_5 = new Class2_Sub5(local32, 4, arg1 + 4, arg3, arg0, arg4, arg6, false, local100.aClass2_5);
					local100.aClass2_6 = new Class2_Sub5(local32, 4, (arg1 + 2 & 0x3) + 4, arg3, arg0, arg4, arg6, false, local100.aClass2_6);
				}
			}
		}
		if (arg2 == 2) {
			if (arg5 == 11) {
				arg5 = 10;
			}
			@Pc(244) Class7 local244 = Static121.method1968(arg3, arg0, arg4);
			if (local244 != null) {
				local244.aClass2_1 = new Class2_Sub5((int) (local244.aLong7 >>> 32) & Integer.MAX_VALUE, arg5, arg1, arg3, arg0, arg4, arg6, false, local244.aClass2_1);
			}
		}
		if (arg2 == 3) {
			@Pc(275) Class119 local275 = Static215.method3451(arg3, arg0, arg4);
			if (local275 != null) {
				local275.aClass2_7 = new Class2_Sub5((int) (local275.aLong154 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg3, arg0, arg4, arg6, false, local275.aClass2_7);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIIIBLclient!d;)V")
	public static void method2507(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class32 arg4) {
		if (Static168.anInt3772 >= 50 || (arg4 == null || arg4.anIntArrayArray19 == null || arg4.anIntArrayArray19.length <= arg3 || arg4.anIntArrayArray19[arg3] == null)) {
			return;
		}
		@Pc(39) int local39 = arg4.anIntArrayArray19[arg3][0];
		@Pc(43) int local43 = local39 & 0x1F;
		@Pc(47) int local47 = local39 >> 8;
		@Pc(53) int local53 = local39 >> 5 & 0x7;
		@Pc(70) int local70;
		if (arg4.anIntArrayArray19[arg3].length > 1) {
			local70 = (int) ((double) arg4.anIntArrayArray19[arg3].length * Math.random());
			if (local70 > 0) {
				local47 = arg4.anIntArrayArray19[arg3][local70];
			}
		}
		if (local43 == 0) {
			if (arg0) {
				Static81.method1381(local47, 0, 255, local53);
			}
		} else if (Static286.anInt5742 != 0) {
			Static270.anIntArray486[Static168.anInt3772] = local47;
			Static277.anIntArray502[Static168.anInt3772] = local53;
			Static23.anIntArray55[Static168.anInt3772] = 0;
			local70 = (arg1 - 64) / 128;
			Static150.aClass172Array1[Static168.anInt3772] = null;
			Static256.anIntArray476[Static168.anInt3772] = 255;
			@Pc(131) int local131 = (arg2 - 64) / 128;
			Static39.anIntArray122[Static168.anInt3772] = local43 + (local70 << 16) + (local131 << 8);
			Static168.anInt3772++;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB[I[I)V")
	public static void method2508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = arg0;
		@Pc(20) int local20 = (arg1 + arg0) / 2;
		@Pc(24) int local24 = arg3[local20];
		arg3[local20] = arg3[arg1];
		arg3[arg1] = local24;
		@Pc(38) int local38 = arg2[local20];
		arg2[local20] = arg2[arg1];
		arg2[arg1] = local38;
		for (@Pc(50) int local50 = arg0; local50 < arg1; local50++) {
			if (arg3[local50] < (local50 & 0x1) + local24) {
				@Pc(71) int local71 = arg3[local50];
				arg3[local50] = arg3[local14];
				arg3[local14] = local71;
				@Pc(85) int local85 = arg2[local50];
				arg2[local50] = arg2[local14];
				arg2[local14++] = local85;
			}
		}
		arg3[arg1] = arg3[local14];
		arg3[local14] = local24;
		arg2[arg1] = arg2[local14];
		arg2[local14] = local38;
		method2508(arg0, local14 - 1, arg2, arg3);
		method2508(local14 + 1, arg1, arg2, arg3);
	}
}
