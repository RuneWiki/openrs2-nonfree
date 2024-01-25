import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class7_Sub4_Sub1 extends Class7_Sub4 {

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "[I")
	private final int[] anIntArray27;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "[I")
	private final int[] anIntArray26;

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "Lclient!vn;")
	private final Class7_Sub3 aClass7_Sub3_3;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "Lclient!vn;")
	private final Class7_Sub3 aClass7_Sub3_1;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "Lclient!vn;")
	private final Class7_Sub3 aClass7_Sub3_2;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "[Lclient!vn;")
	private final Class7_Sub3[] aClass7_Sub3Array3;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	private Class7_Sub4_Sub1() {
		this.anIntArray27 = new int[0];
		this.anIntArray26 = new int[0];
		this.aClass7_Sub3_3 = new Class7_Sub3_Sub26(0);
		this.aClass7_Sub3_3.anInt7278 = 1;
		this.aClass7_Sub3_1 = new Class7_Sub3_Sub26();
		this.aClass7_Sub3_1.anInt7278 = 1;
		this.aClass7_Sub3_2 = new Class7_Sub3_Sub26();
		this.aClass7_Sub3_2.anInt7278 = 1;
		this.aClass7_Sub3Array3 = new Class7_Sub3[] { this.aClass7_Sub3_1, this.aClass7_Sub3_2, this.aClass7_Sub3_3 };
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class7_Sub4_Sub1(@OriginalArg(0) Class7_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method3981();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass7_Sub3Array3 = new Class7_Sub3[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class7_Sub3 local26 = Static340.method4426(arg0);
			if (local26.method5598() >= 0) {
				local9++;
			}
			if (local26.method5590() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass7_Sub3Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method3981();
			}
			this.aClass7_Sub3Array3[local20] = local26;
		}
		this.anIntArray27 = new int[local9];
		this.anIntArray26 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class7_Sub3 local94 = this.aClass7_Sub3Array3[local87];
			local50 = local94.aClass7_Sub3Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass7_Sub3Array42[local100] = this.aClass7_Sub3Array3[local14[local87][local100]];
			}
			@Pc(122) int local122 = local94.method5598();
			@Pc(126) int local126 = local94.method5590();
			if (local122 > 0) {
				this.anIntArray27[local9++] = local122;
			}
			if (local126 > 0) {
				this.anIntArray26[local11++] = local126;
			}
			local14[local87] = null;
		}
		this.aClass7_Sub3_1 = this.aClass7_Sub3Array3[arg0.method3981()];
		this.aClass7_Sub3_2 = this.aClass7_Sub3Array3[arg0.method3981()];
		this.aClass7_Sub3_3 = this.aClass7_Sub3Array3[arg0.method3981()];
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ga;ILclient!ok;IDIZ)[I")
	public int[] method166(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static411.anInterface4_7 = arg0;
		Static164.aClass178_45 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass7_Sub3Array3.length; local11++) {
			this.aClass7_Sub3Array3[local11].method5601(arg4, arg2);
		}
		Static23.method246(arg3);
		Static27.method304(arg2, arg4);
		@Pc(41) int[] local41 = new int[arg4 * 4 * arg2];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg2; local45++) {
			@Pc(68) int[] local68;
			@Pc(64) int[] local64;
			@Pc(72) int[] local72;
			@Pc(80) int[] local80;
			if (this.aClass7_Sub3_1.aBoolean490) {
				local80 = this.aClass7_Sub3_1.method5594(local45);
				local64 = local80;
				local72 = local80;
				local68 = local80;
			} else {
				@Pc(60) int[][] local60 = this.aClass7_Sub3_1.method5596(local45);
				local64 = local60[1];
				local68 = local60[0];
				local72 = local60[2];
			}
			if (this.aClass7_Sub3_2.aBoolean490) {
				local80 = this.aClass7_Sub3_2.method5594(local45);
			} else {
				local80 = this.aClass7_Sub3_2.method5596(local45)[0];
			}
			if (arg5) {
				local43 = local45;
			}
			for (@Pc(114) int local114 = arg4 - 1; local114 >= 0; local114--) {
				@Pc(122) int local122 = local68[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(137) int local137 = local64[local114] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(157) int local157 = local72[local114] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				local122 = Static106.anIntArray148[local122];
				local137 = Static106.anIntArray148[local137];
				local157 = Static106.anIntArray148[local157];
				@Pc(198) int local198;
				if (local122 == 0 && local137 == 0 && local157 == 0) {
					local198 = 0;
				} else {
					local198 = local80[local114] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local41[local43++] = local157 + (local122 << 16) + (local198 << 24) + (local137 << 8);
				if (arg5) {
					local43 += arg4 - 1;
				}
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.aClass7_Sub3Array3.length; local248++) {
			this.aClass7_Sub3Array3[local248].method5592();
		}
		return local41;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ok;BLclient!ga;)Z")
	public boolean method167(@OriginalArg(0) Class178 arg0, @OriginalArg(2) Interface4 arg1) {
		@Pc(9) int local9;
		if (Static151.anInt2825 >= 0) {
			for (local9 = 0; local9 < this.anIntArray27.length; local9++) {
				if (!arg0.method3835(Static151.anInt2825, this.anIntArray27[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray27.length; local9++) {
				if (!arg0.method3848(this.anIntArray27[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray26.length; local9++) {
			if (!arg1.method3140(this.anIntArray26[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(DIZLclient!ga;Lclient!ok;IIZ)[I")
	public int[] method168(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class178 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		Static164.aClass178_45 = arg4;
		Static411.anInterface4_7 = arg3;
		for (@Pc(18) int local18 = 0; local18 < this.aClass7_Sub3Array3.length; local18++) {
			this.aClass7_Sub3Array3[local18].method5601(arg1, arg5);
		}
		Static23.method246(arg0);
		Static27.method304(arg5, arg1);
		@Pc(50) int[] local50 = new int[arg1 * arg5];
		@Pc(56) int local56;
		@Pc(54) int local54;
		@Pc(58) byte local58;
		if (arg2) {
			local56 = arg1 - 1;
			local58 = -1;
			local54 = -1;
		} else {
			local54 = arg1;
			local56 = 0;
			local58 = 1;
		}
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < arg5; local72++) {
			@Pc(88) int[] local88;
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			if (this.aClass7_Sub3_1.aBoolean490) {
				@Pc(84) int[] local84 = this.aClass7_Sub3_1.method5594(local72);
				local86 = local84;
				local88 = local84;
				local90 = local84;
			} else {
				@Pc(98) int[][] local98 = this.aClass7_Sub3_1.method5596(local72);
				local90 = local98[1];
				local86 = local98[2];
				local88 = local98[0];
			}
			if (arg6) {
				local70 = local72;
			}
			for (@Pc(116) int local116 = local56; local116 != local54; local116 += local58) {
				@Pc(124) int local124 = local88[local116] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				@Pc(144) int local144 = local90[local116] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(159) int local159 = local86[local116] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local144 = Static106.anIntArray148[local144];
				if (local159 < 0) {
					local159 = 0;
				}
				local124 = Static106.anIntArray148[local124];
				local159 = Static106.anIntArray148[local159];
				@Pc(190) int local190 = (local124 << 16) + (local144 << 8) + local159;
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local50[local70++] = local190;
				if (arg6) {
					local70 += arg1 - 1;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass7_Sub3Array3.length; local225++) {
			this.aClass7_Sub3Array3[local225].method5592();
		}
		return local50;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ga;Lclient!ok;ZIZ)[F")
	public float[] method170(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		Static164.aClass178_45 = arg2;
		Static411.anInterface4_7 = arg1;
		for (@Pc(16) int local16 = 0; local16 < this.aClass7_Sub3Array3.length; local16++) {
			this.aClass7_Sub3Array3[local16].method5601(arg4, arg0);
		}
		Static27.method304(arg0, arg4);
		@Pc(47) float[] local47 = new float[arg4 * 4 * arg0];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			@Pc(69) int[] local69;
			@Pc(67) int[] local67;
			@Pc(65) int[] local65;
			if (this.aClass7_Sub3_1.aBoolean490) {
				@Pc(63) int[] local63 = this.aClass7_Sub3_1.method5594(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass7_Sub3_1.method5596(local51);
				local65 = local77[2];
				local67 = local77[1];
				local69 = local77[0];
			}
			@Pc(101) int[] local101;
			if (this.aClass7_Sub3_2.aBoolean490) {
				local101 = this.aClass7_Sub3_2.method5594(local51);
			} else {
				local101 = this.aClass7_Sub3_2.method5596(local51)[0];
			}
			if (arg3) {
				local49 = local51 << 2;
			}
			@Pc(127) int[] local127;
			if (this.aClass7_Sub3_3.aBoolean490) {
				local127 = this.aClass7_Sub3_3.method5594(local51);
			} else {
				local127 = this.aClass7_Sub3_3.method5596(local51)[0];
			}
			for (@Pc(139) int local139 = arg4 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local101[local139] / 4096.0F;
				@Pc(161) float local161 = ((float) local127[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				local47[local49++] = (float) local69[local139] * local161;
				local47[local49++] = local161 * (float) local67[local139];
				local47[local49++] = local161 * (float) local65[local139];
				local47[local49++] = local148;
				if (arg3) {
					local49 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass7_Sub3Array3.length; local232++) {
			this.aClass7_Sub3Array3[local232].method5592();
		}
		return local47;
	}
}
