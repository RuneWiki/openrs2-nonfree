import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class5_Sub1_Sub14 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "[I")
	private final int[] anIntArray365;

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "[I")
	private final int[] anIntArray366;

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "Lclient!nt;")
	private final Class5_Sub3 aClass5_Sub3_3;

	@OriginalMember(owner = "client!mr", name = "G", descriptor = "Lclient!nt;")
	private final Class5_Sub3 aClass5_Sub3_2;

	@OriginalMember(owner = "client!mr", name = "F", descriptor = "Lclient!nt;")
	private Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "[Lclient!nt;")
	private final Class5_Sub3[] aClass5_Sub3Array23;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	private Class5_Sub1_Sub14() {
		this.anIntArray365 = new int[0];
		this.anIntArray366 = new int[0];
		this.aClass5_Sub3_3 = new Class5_Sub3_Sub14(0);
		this.aClass5_Sub3_3.anInt10903 = 1;
		this.aClass5_Sub3_2 = new Class5_Sub3_Sub14();
		this.aClass5_Sub3_2.anInt10903 = 1;
		this.aClass5_Sub3_1 = new Class5_Sub3_Sub14();
		this.aClass5_Sub3Array23 = new Class5_Sub3[] { this.aClass5_Sub3_2, this.aClass5_Sub3_1, this.aClass5_Sub3_3 };
		this.aClass5_Sub3_1.anInt10903 = 1;
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class5_Sub1_Sub14(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(7) int local7 = arg0.method7291();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub3Array23 = new Class5_Sub3[local7];
		@Pc(56) int local56;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(28) Class5_Sub3 local28 = Static451.method6392(arg0);
			if (local28.method9212() >= 0) {
				local9++;
			}
			if (local28.method9202() >= 0) {
				local11++;
			}
			@Pc(49) int local49 = local28.aClass5_Sub3Array42.length;
			local14[local20] = new int[local49];
			for (local56 = 0; local56 < local49; local56++) {
				local14[local20][local56] = arg0.method7291();
			}
			this.aClass5_Sub3Array23[local20] = local28;
		}
		this.anIntArray366 = new int[local9];
		local9 = 0;
		this.anIntArray365 = new int[local11];
		local11 = 0;
		for (@Pc(105) int local105 = 0; local105 < local7; local105++) {
			@Pc(114) Class5_Sub3 local114 = this.aClass5_Sub3Array23[local105];
			local56 = local114.aClass5_Sub3Array42.length;
			for (@Pc(120) int local120 = 0; local120 < local56; local120++) {
				local114.aClass5_Sub3Array42[local120] = this.aClass5_Sub3Array23[local14[local105][local120]];
			}
			@Pc(148) int local148 = local114.method9212();
			@Pc(152) int local152 = local114.method9202();
			if (local148 > 0) {
				this.anIntArray366[local9++] = local148;
			}
			if (local152 > 0) {
				this.anIntArray365[local11++] = local152;
			}
			local14[local105] = null;
		}
		this.aClass5_Sub3_2 = this.aClass5_Sub3Array23[arg0.method7291()];
		this.aClass5_Sub3_1 = this.aClass5_Sub3Array23[arg0.method7291()];
		this.aClass5_Sub3_3 = this.aClass5_Sub3Array23[arg0.method7291()];
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!gda;IZLclient!d;ZD)[I")
	public int[] method5570(@OriginalArg(0) int arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface7 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) double arg6) {
		Static300.anInterface7_8 = arg4;
		Static5.aClass126_303 = arg1;
		for (@Pc(20) int local20 = 0; local20 < this.aClass5_Sub3Array23.length; local20++) {
			this.aClass5_Sub3Array23[local20].method9203(arg2, arg0);
		}
		Static324.method4955(arg6);
		Static515.method7064(arg2, arg0);
		@Pc(52) int[] local52 = new int[arg2 * arg0];
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(58) byte local58;
		if (arg3) {
			local58 = -1;
			local62 = arg0 - 1;
			local64 = -1;
		} else {
			local62 = 0;
			local58 = 1;
			local64 = arg0;
		}
		@Pc(74) int local74 = 0;
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			if (arg5) {
				local74 = local76;
			}
			@Pc(100) int[] local100;
			@Pc(96) int[] local96;
			@Pc(98) int[] local98;
			if (this.aClass5_Sub3_2.aBoolean769) {
				@Pc(94) int[] local94 = this.aClass5_Sub3_2.method9208(local76);
				local96 = local94;
				local98 = local94;
				local100 = local94;
			} else {
				@Pc(108) int[][] local108 = this.aClass5_Sub3_2.method9206(local76);
				local98 = local108[2];
				local100 = local108[0];
				local96 = local108[1];
			}
			for (@Pc(122) int local122 = local62; local122 != local64; local122 += local58) {
				@Pc(130) int local130 = local100[local122] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				@Pc(150) int local150 = local96[local122] >> 4;
				if (local150 > 255) {
					local150 = 255;
				}
				if (local150 < 0) {
					local150 = 0;
				}
				@Pc(165) int local165 = local98[local122] >> 4;
				if (local165 > 255) {
					local165 = 255;
				}
				if (local165 < 0) {
					local165 = 0;
				}
				local130 = Static619.anIntArray554[local130];
				local150 = Static619.anIntArray554[local150];
				local165 = Static619.anIntArray554[local165];
				@Pc(201) int local201 = local165 + (local150 << 8) + (local130 << 16);
				if (local201 != 0) {
					local201 |= 0xFF000000;
				}
				local52[local74++] = local201;
				if (arg5) {
					local74 += arg0 - 1;
				}
			}
		}
		for (@Pc(243) int local243 = 0; local243 < this.aClass5_Sub3Array23.length; local243++) {
			this.aClass5_Sub3Array23[local243].method9209();
		}
		return local52;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!d;Lclient!gda;Z)Z")
	public boolean method5572(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class126 arg1) {
		@Pc(12) int local12;
		if (Static681.anInt10916 >= 0) {
			for (local12 = 0; local12 < this.anIntArray366.length; local12++) {
				if (!arg1.method3068(Static681.anInt10916, this.anIntArray366[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray366.length; local12++) {
				if (!arg1.method3077(this.anIntArray366[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray365.length; local12++) {
			if (!arg0.method7421(this.anIntArray365[local12])) {
				return false;
			}
		}
		if (false) {
			this.aClass5_Sub3_1 = null;
		}
		return true;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!d;IZIDLclient!gda;I)[I")
	public int[] method5573(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Class126 arg4, @OriginalArg(6) int arg5) {
		Static300.anInterface7_8 = arg0;
		Static5.aClass126_303 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub3Array23.length; local11++) {
			this.aClass5_Sub3Array23[local11].method9203(arg2, arg5);
		}
		Static324.method4955(arg3);
		Static515.method7064(arg2, arg5);
		@Pc(45) int[] local45 = new int[arg5 * arg2];
		@Pc(47) int local47 = 0;
		for (@Pc(49) int local49 = 0; local49 < arg2; local49++) {
			@Pc(77) int[] local77;
			@Pc(69) int[] local69;
			@Pc(73) int[] local73;
			@Pc(85) int[] local85;
			if (this.aClass5_Sub3_2.aBoolean769) {
				local85 = this.aClass5_Sub3_2.method9208(local49);
				local77 = local85;
				local69 = local85;
				local73 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass5_Sub3_2.method9206(local49);
				local69 = local65[1];
				local73 = local65[2];
				local77 = local65[0];
			}
			if (this.aClass5_Sub3_1.aBoolean769) {
				local85 = this.aClass5_Sub3_1.method9208(local49);
			} else {
				local85 = this.aClass5_Sub3_1.method9206(local49)[0];
			}
			if (arg1) {
				local47 = local49;
			}
			for (@Pc(119) int local119 = arg5 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local77[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(147) int local147 = local69[local119] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				if (local147 < 0) {
					local147 = 0;
				}
				@Pc(167) int local167 = local73[local119] >> 4;
				if (local167 > 255) {
					local167 = 255;
				}
				local127 = Static619.anIntArray554[local127];
				if (local167 < 0) {
					local167 = 0;
				}
				local147 = Static619.anIntArray554[local147];
				local167 = Static619.anIntArray554[local167];
				@Pc(215) int local215;
				if (local127 == 0 && local147 == 0 && local167 == 0) {
					local215 = 0;
				} else {
					local215 = local85[local119] >> 4;
					if (local215 > 255) {
						local215 = 255;
					}
					if (local215 < 0) {
						local215 = 0;
					}
				}
				local45[local47++] = local167 + (local147 << 8) + (local215 << 24) + (local127 << 16);
				if (arg1) {
					local47 += arg5 - 1;
				}
			}
		}
		for (@Pc(265) int local265 = 0; local265 < this.aClass5_Sub3Array23.length; local265++) {
			this.aClass5_Sub3Array23[local265].method9209();
		}
		return local45;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZIILclient!gda;ILclient!d;)[F")
	public float[] method5574(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(5) Interface7 arg4) {
		Static300.anInterface7_8 = arg4;
		Static5.aClass126_303 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub3Array23.length; local11++) {
			this.aClass5_Sub3Array23[local11].method9203(arg1, arg2);
		}
		Static515.method7064(arg1, arg2);
		@Pc(42) float[] local42 = new float[arg1 * arg2 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(66) int[] local66;
			@Pc(64) int[] local64;
			@Pc(68) int[] local68;
			if (this.aClass5_Sub3_2.aBoolean769) {
				@Pc(62) int[] local62 = this.aClass5_Sub3_2.method9208(local46);
				local64 = local62;
				local66 = local62;
				local68 = local62;
			} else {
				@Pc(76) int[][] local76 = this.aClass5_Sub3_2.method9206(local46);
				local64 = local76[1];
				local66 = local76[0];
				local68 = local76[2];
			}
			@Pc(100) int[] local100;
			if (this.aClass5_Sub3_1.aBoolean769) {
				local100 = this.aClass5_Sub3_1.method9208(local46);
			} else {
				local100 = this.aClass5_Sub3_1.method9206(local46)[0];
			}
			@Pc(120) int[] local120;
			if (this.aClass5_Sub3_3.aBoolean769) {
				local120 = this.aClass5_Sub3_3.method9208(local46);
			} else {
				local120 = this.aClass5_Sub3_3.method9206(local46)[0];
			}
			if (arg0) {
				local44 = local46 << 2;
			}
			for (@Pc(138) int local138 = arg2 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local100[local138] / 4096.0F;
				@Pc(160) float local160 = ((float) local120[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				local42[local44++] = (float) local66[local138] * local160;
				local42[local44++] = local160 * (float) local64[local138];
				local42[local44++] = (float) local68[local138] * local160;
				local42[local44++] = local147;
				if (arg0) {
					local44 += (arg2 << 2) - 4;
				}
			}
		}
		if (-23416 == -23416) {
			for (@Pc(245) int local245 = 0; local245 < this.aClass5_Sub3Array23.length; local245++) {
				this.aClass5_Sub3Array23[local245].method9209();
			}
			return local42;
		} else {
			return null;
		}
	}
}
