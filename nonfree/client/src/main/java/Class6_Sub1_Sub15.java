import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class6_Sub1_Sub15 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "[I")
	private final int[] anIntArray499;

	@OriginalMember(owner = "client!qs", name = "B", descriptor = "[I")
	private final int[] anIntArray500;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "Lclient!et;")
	private final Class6_Sub2 aClass6_Sub2_2;

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "Lclient!et;")
	private final Class6_Sub2 aClass6_Sub2_3;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Lclient!et;")
	private final Class6_Sub2 aClass6_Sub2_1;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "[Lclient!et;")
	private final Class6_Sub2[] aClass6_Sub2Array34;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	private Class6_Sub1_Sub15() {
		this.anIntArray499 = new int[0];
		this.anIntArray500 = new int[0];
		this.aClass6_Sub2_2 = new Class6_Sub2_Sub5(0);
		this.aClass6_Sub2_2.anInt7158 = 1;
		this.aClass6_Sub2_3 = new Class6_Sub2_Sub5();
		this.aClass6_Sub2_3.anInt7158 = 1;
		this.aClass6_Sub2_1 = new Class6_Sub2_Sub5();
		this.aClass6_Sub2Array34 = new Class6_Sub2[] { this.aClass6_Sub2_3, this.aClass6_Sub2_1, this.aClass6_Sub2_2 };
		this.aClass6_Sub2_1.anInt7158 = 1;
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ha;)V")
	public Class6_Sub1_Sub15(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3111();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass6_Sub2Array34 = new Class6_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub2 local26 = Static173.method2749(arg0);
			if (local26.method5866() >= 0) {
				local9++;
			}
			if (local26.method5865() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method3111();
			}
			this.aClass6_Sub2Array34[local20] = local26;
		}
		this.anIntArray500 = new int[local9];
		local9 = 0;
		this.anIntArray499 = new int[local11];
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class6_Sub2 local94 = this.aClass6_Sub2Array34[local87];
			local50 = local94.aClass6_Sub2Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass6_Sub2Array42[local100] = this.aClass6_Sub2Array34[local18[local87][local100]];
			}
			@Pc(122) int local122 = local94.method5866();
			@Pc(126) int local126 = local94.method5865();
			if (local122 > 0) {
				this.anIntArray500[local9++] = local122;
			}
			if (local126 > 0) {
				this.anIntArray499[local11++] = local126;
			}
			local18[local87] = null;
		}
		this.aClass6_Sub2_3 = this.aClass6_Sub2Array34[arg0.method3111()];
		this.aClass6_Sub2_1 = this.aClass6_Sub2Array34[arg0.method3111()];
		this.aClass6_Sub2_2 = this.aClass6_Sub2Array34[arg0.method3111()];
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!lt;ZDILclient!vl;II)[I")
	public int[] method4762(@OriginalArg(0) Class158 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface11 arg4, @OriginalArg(6) int arg5) {
		Static140.anInterface11_4 = arg4;
		Static221.aClass158_50 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub2Array34.length; local11++) {
			this.aClass6_Sub2Array34[local11].method5860(arg3, arg5);
		}
		Static172.method2741(arg2);
		Static11.method147(arg5, arg3);
		@Pc(41) int[] local41 = new int[arg3 * 4 * arg5];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg5; local45++) {
			@Pc(59) int[] local59;
			@Pc(61) int[] local61;
			@Pc(63) int[] local63;
			@Pc(57) int[] local57;
			if (this.aClass6_Sub2_3.aBoolean488) {
				local57 = this.aClass6_Sub2_3.method5859(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(71) int[][] local71 = this.aClass6_Sub2_3.method5868(local45);
				local63 = local71[2];
				local61 = local71[1];
				local59 = local71[0];
			}
			if (arg1) {
				local43 = local45;
			}
			if (this.aClass6_Sub2_1.aBoolean488) {
				local57 = this.aClass6_Sub2_1.method5859(local45);
			} else {
				local57 = this.aClass6_Sub2_1.method5868(local45)[0];
			}
			for (@Pc(113) int local113 = arg3 - 1; local113 >= 0; local113--) {
				@Pc(121) int local121 = local59[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(141) int local141 = local61[local113] >> 4;
				if (local141 > 255) {
					local141 = 255;
				}
				if (local141 < 0) {
					local141 = 0;
				}
				@Pc(161) int local161 = local63[local113] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local121 = Static403.anIntArray578[local121];
				local141 = Static403.anIntArray578[local141];
				if (local161 < 0) {
					local161 = 0;
				}
				local161 = Static403.anIntArray578[local161];
				@Pc(204) int local204;
				if (local121 == 0 && local141 == 0 && local161 == 0) {
					local204 = 0;
				} else {
					local204 = local57[local113] >> 4;
					if (local204 > 255) {
						local204 = 255;
					}
					if (local204 < 0) {
						local204 = 0;
					}
				}
				local41[local43++] = (local141 << 8) + (local121 << 16) + (local204 << 24) + local161;
				if (arg1) {
					local43 += arg3 - 1;
				}
			}
		}
		for (@Pc(274) int local274 = 0; local274 < this.aClass6_Sub2Array34.length; local274++) {
			this.aClass6_Sub2Array34[local274].method5864();
		}
		return local41;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZILclient!lt;Lclient!vl;I)[F")
	public float[] method4763(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class158 arg2, @OriginalArg(4) Interface11 arg3, @OriginalArg(5) int arg4) {
		Static221.aClass158_50 = arg2;
		Static140.anInterface11_4 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub2Array34.length; local11++) {
			this.aClass6_Sub2Array34[local11].method5860(arg1, arg4);
		}
		Static11.method147(arg4, arg1);
		@Pc(42) float[] local42 = new float[arg1 * arg4 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(64) int[] local64;
			if (this.aClass6_Sub2_3.aBoolean488) {
				@Pc(60) int[] local60 = this.aClass6_Sub2_3.method5859(local46);
				local62 = local60;
				local64 = local60;
				local66 = local60;
			} else {
				@Pc(74) int[][] local74 = this.aClass6_Sub2_3.method5868(local46);
				local64 = local74[2];
				local62 = local74[0];
				local66 = local74[1];
			}
			@Pc(96) int[] local96;
			if (this.aClass6_Sub2_1.aBoolean488) {
				local96 = this.aClass6_Sub2_1.method5859(local46);
			} else {
				local96 = this.aClass6_Sub2_1.method5868(local46)[0];
			}
			if (arg0) {
				local44 = local46 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass6_Sub2_2.aBoolean488) {
				local122 = this.aClass6_Sub2_2.method5859(local46);
			} else {
				local122 = this.aClass6_Sub2_2.method5868(local46)[0];
			}
			for (@Pc(136) int local136 = arg1 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local96[local136] / 4096.0F;
				@Pc(158) float local158 = ((float) local122[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				local42[local44++] = local158 * (float) local62[local136];
				local42[local44++] = (float) local66[local136] * local158;
				local42[local44++] = local158 * (float) local64[local136];
				local42[local44++] = local145;
				if (arg0) {
					local44 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass6_Sub2Array34.length; local229++) {
			this.aClass6_Sub2Array34[local229].method5864();
		}
		return local42;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!vl;ILclient!lt;)Z")
	public boolean method4765(@OriginalArg(0) Interface11 arg0, @OriginalArg(2) Class158 arg1) {
		@Pc(22) int local22;
		if (Static287.anInt4825 >= 0) {
			for (local22 = 0; local22 < this.anIntArray500.length; local22++) {
				if (!arg1.method3678(Static287.anInt4825, this.anIntArray500[local22])) {
					return false;
				}
			}
		} else {
			for (local22 = 0; local22 < this.anIntArray500.length; local22++) {
				if (!arg1.method3686(this.anIntArray500[local22])) {
					return false;
				}
			}
		}
		for (local22 = 0; local22 < this.anIntArray499.length; local22++) {
			if (!arg0.method2468(this.anIntArray499[local22])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!vl;ZIZBLclient!lt;D)[I")
	public int[] method4767(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class158 arg5, @OriginalArg(7) double arg6) {
		Static221.aClass158_50 = arg5;
		Static140.anInterface11_4 = arg1;
		for (@Pc(17) int local17 = 0; local17 < this.aClass6_Sub2Array34.length; local17++) {
			this.aClass6_Sub2Array34[local17].method5860(arg3, arg0);
		}
		Static172.method2741(arg6);
		Static11.method147(arg0, arg3);
		@Pc(49) int[] local49 = new int[arg0 * arg3];
		@Pc(55) int local55;
		@Pc(57) int local57;
		@Pc(53) byte local53;
		if (arg2) {
			local57 = -1;
			local53 = -1;
			local55 = arg3 - 1;
		} else {
			local53 = 1;
			local55 = 0;
			local57 = arg3;
		}
		@Pc(69) int local69 = 0;
		for (@Pc(71) int local71 = 0; local71 < arg0; local71++) {
			if (arg4) {
				local69 = local71;
			}
			@Pc(91) int[] local91;
			@Pc(95) int[] local95;
			@Pc(99) int[] local99;
			if (this.aClass6_Sub2_3.aBoolean488) {
				@Pc(109) int[] local109 = this.aClass6_Sub2_3.method5859(local71);
				local95 = local109;
				local99 = local109;
				local91 = local109;
			} else {
				@Pc(87) int[][] local87 = this.aClass6_Sub2_3.method5868(local71);
				local91 = local87[0];
				local95 = local87[1];
				local99 = local87[2];
			}
			for (@Pc(117) int local117 = local55; local117 != local57; local117 += local53) {
				@Pc(125) int local125 = local91[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(142) int local142 = local95[local117] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(157) int local157 = local99[local117] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local125 = Static403.anIntArray578[local125];
				if (local157 < 0) {
					local157 = 0;
				}
				local142 = Static403.anIntArray578[local142];
				local157 = Static403.anIntArray578[local157];
				@Pc(190) int local190 = (local142 << 8) + (local125 << 16) + local157;
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local49[local69++] = local190;
				if (arg4) {
					local69 += arg3 - 1;
				}
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.aClass6_Sub2Array34.length; local226++) {
			this.aClass6_Sub2Array34[local226].method5864();
		}
		return local49;
	}
}
