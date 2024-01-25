import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!nw", name = "G", descriptor = "[I")
	private final int[] anIntArray395;

	@OriginalMember(owner = "client!nw", name = "A", descriptor = "[I")
	private final int[] anIntArray394;

	@OriginalMember(owner = "client!nw", name = "B", descriptor = "Lclient!rl;")
	private final Class5_Sub6 aClass5_Sub6_3;

	@OriginalMember(owner = "client!nw", name = "z", descriptor = "Lclient!rl;")
	private final Class5_Sub6 aClass5_Sub6_2;

	@OriginalMember(owner = "client!nw", name = "y", descriptor = "Lclient!rl;")
	private final Class5_Sub6 aClass5_Sub6_1;

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "[Lclient!rl;")
	private final Class5_Sub6[] aClass5_Sub6Array30;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V")
	private Class5_Sub2_Sub15() {
		this.anIntArray395 = new int[0];
		this.anIntArray394 = new int[0];
		this.aClass5_Sub6_3 = new Class5_Sub6_Sub12(0);
		this.aClass5_Sub6_3.anInt9758 = 1;
		this.aClass5_Sub6_2 = new Class5_Sub6_Sub12();
		this.aClass5_Sub6_2.anInt9758 = 1;
		this.aClass5_Sub6_1 = new Class5_Sub6_Sub12();
		this.aClass5_Sub6Array30 = new Class5_Sub6[] { this.aClass5_Sub6_2, this.aClass5_Sub6_1, this.aClass5_Sub6_3 };
		this.aClass5_Sub6_1.anInt9758 = 1;
	}

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class5_Sub2_Sub15(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3642();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass5_Sub6Array30 = new Class5_Sub6[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub6 local26 = Static189.method2740(arg0);
			if (local26.method8126() >= 0) {
				local9++;
			}
			if (local26.method8119() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass5_Sub6Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method3642();
			}
			this.aClass5_Sub6Array30[local20] = local26;
		}
		this.anIntArray395 = new int[local9];
		local9 = 0;
		this.anIntArray394 = new int[local11];
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class5_Sub6 local95 = this.aClass5_Sub6Array30[local88];
			local47 = local95.aClass5_Sub6Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass5_Sub6Array42[local101] = this.aClass5_Sub6Array30[local14[local88][local101]];
			}
			@Pc(127) int local127 = local95.method8126();
			@Pc(131) int local131 = local95.method8119();
			if (local127 > 0) {
				this.anIntArray395[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray394[local11++] = local131;
			}
			local14[local88] = null;
		}
		this.aClass5_Sub6_2 = this.aClass5_Sub6Array30[arg0.method3642()];
		this.aClass5_Sub6_1 = this.aClass5_Sub6Array30[arg0.method3642()];
		this.aClass5_Sub6_3 = this.aClass5_Sub6Array30[arg0.method3642()];
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!d;Lclient!cb;ZDIZI)[I")
	public int[] method5965(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) double arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static90.anInterface3_1 = arg1;
		Static314.aClass50_89 = arg2;
		for (@Pc(16) int local16 = 0; local16 < this.aClass5_Sub6Array30.length; local16++) {
			this.aClass5_Sub6Array30[local16].method8125(arg0, arg6);
		}
		Static165.method2436(arg4);
		Static289.method3978(arg6, arg0);
		@Pc(44) int[] local44 = new int[arg0 * arg6];
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(50) byte local50;
		if (arg3) {
			local48 = -1;
			local50 = -1;
			local52 = arg0 - 1;
		} else {
			local48 = arg0;
			local50 = 1;
			local52 = 0;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg6; local66++) {
			@Pc(86) int[] local86;
			@Pc(82) int[] local82;
			@Pc(90) int[] local90;
			if (this.aClass5_Sub6_2.aBoolean718) {
				@Pc(98) int[] local98 = this.aClass5_Sub6_2.method8123(local66);
				local90 = local98;
				local82 = local98;
				local86 = local98;
			} else {
				@Pc(78) int[][] local78 = this.aClass5_Sub6_2.method8122(local66);
				local82 = local78[1];
				local86 = local78[0];
				local90 = local78[2];
			}
			if (arg5) {
				local64 = local66;
			}
			for (@Pc(110) int local110 = local52; local110 != local48; local110 += local50) {
				@Pc(118) int local118 = local86[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				@Pc(136) int local136 = local82[local110] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(153) int local153 = local90[local110] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				if (local153 < 0) {
					local153 = 0;
				}
				local136 = Class41_Sub1_Sub3_Sub1.lb[local136];
				local118 = Class41_Sub1_Sub3_Sub1.lb[local118];
				local153 = Class41_Sub1_Sub3_Sub1.lb[local153];
				@Pc(184) int local184 = local153 + (local136 << 8) + (local118 << 16);
				if (local184 != 0) {
					local184 |= 0xFF000000;
				}
				local44[local64++] = local184;
				if (arg5) {
					local64 += arg0 - 1;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass5_Sub6Array30.length; local223++) {
			this.aClass5_Sub6Array30[local223].method8121();
		}
		return local44;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!d;ZIILclient!cb;)[F")
	public float[] method5966(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class50 arg4) {
		Static314.aClass50_89 = arg4;
		Static90.anInterface3_1 = arg1;
		for (@Pc(17) int local17 = 0; local17 < this.aClass5_Sub6Array30.length; local17++) {
			this.aClass5_Sub6Array30[local17].method8125(arg0, arg3);
		}
		Static289.method3978(arg3, arg0);
		@Pc(44) float[] local44 = new float[arg3 * arg0 * 4];
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < arg3; local48++) {
			@Pc(62) int[] local62;
			@Pc(66) int[] local66;
			@Pc(64) int[] local64;
			if (this.aClass5_Sub6_2.aBoolean718) {
				@Pc(60) int[] local60 = this.aClass5_Sub6_2.method8123(local48);
				local62 = local60;
				local64 = local60;
				local66 = local60;
			} else {
				@Pc(74) int[][] local74 = this.aClass5_Sub6_2.method8122(local48);
				local66 = local74[1];
				local64 = local74[2];
				local62 = local74[0];
			}
			@Pc(98) int[] local98;
			if (this.aClass5_Sub6_1.aBoolean718) {
				local98 = this.aClass5_Sub6_1.method8123(local48);
			} else {
				local98 = this.aClass5_Sub6_1.method8122(local48)[0];
			}
			@Pc(118) int[] local118;
			if (this.aClass5_Sub6_3.aBoolean718) {
				local118 = this.aClass5_Sub6_3.method8123(local48);
			} else {
				local118 = this.aClass5_Sub6_3.method8122(local48)[0];
			}
			if (arg2) {
				local46 = local48 << 2;
			}
			for (@Pc(138) int local138 = arg0 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local98[local138] / 4096.0F;
				@Pc(160) float local160 = ((float) local118[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				local44[local46++] = (float) local62[local138] * local160;
				local44[local46++] = local160 * (float) local66[local138];
				local44[local46++] = local160 * (float) local64[local138];
				local44[local46++] = local147;
				if (arg2) {
					local46 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass5_Sub6Array30.length; local228++) {
			this.aClass5_Sub6Array30[local228].method8121();
		}
		return local44;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIDLclient!d;ZLclient!cb;)[I")
	public int[] method5968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) double arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class50 arg5) {
		Static314.aClass50_89 = arg5;
		Static90.anInterface3_1 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass5_Sub6Array30.length; local11++) {
			this.aClass5_Sub6Array30[local11].method8125(arg0, arg1);
		}
		Static165.method2436(arg2);
		Static289.method3978(arg1, arg0);
		@Pc(48) int[] local48 = new int[arg0 * arg1];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < arg1; local52++) {
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			@Pc(68) int[] local68;
			@Pc(64) int[] local64;
			if (this.aClass5_Sub6_2.aBoolean718) {
				local64 = this.aClass5_Sub6_2.method8123(local52);
				local66 = local64;
				local68 = local64;
				local70 = local64;
			} else {
				@Pc(78) int[][] local78 = this.aClass5_Sub6_2.method8122(local52);
				local70 = local78[1];
				local66 = local78[0];
				local68 = local78[2];
			}
			if (this.aClass5_Sub6_1.aBoolean718) {
				local64 = this.aClass5_Sub6_1.method8123(local52);
			} else {
				local64 = this.aClass5_Sub6_1.method8122(local52)[0];
			}
			if (arg4) {
				local50 = local52;
			}
			for (@Pc(118) int local118 = arg0 - 1; local118 >= 0; local118--) {
				@Pc(126) int local126 = local66[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(144) int local144 = local70[local118] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(159) int local159 = local68[local118] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local144 = Class41_Sub1_Sub3_Sub1.lb[local144];
				local126 = Class41_Sub1_Sub3_Sub1.lb[local126];
				if (local159 < 0) {
					local159 = 0;
				}
				local159 = Class41_Sub1_Sub3_Sub1.lb[local159];
				@Pc(200) int local200;
				if (local126 == 0 && local144 == 0 && local159 == 0) {
					local200 = 0;
				} else {
					local200 = local64[local118] >> 4;
					if (local200 > 255) {
						local200 = 255;
					}
					if (local200 < 0) {
						local200 = 0;
					}
				}
				local48[local50++] = (local144 << 8) + (local126 << 16) + (local200 << 24) + local159;
				if (arg4) {
					local50 += arg0 - 1;
				}
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.aClass5_Sub6Array30.length; local260++) {
			this.aClass5_Sub6Array30[local260].method8121();
		}
		return local48;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!cb;Lclient!d;I)Z")
	public boolean method5969(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Interface3 arg1) {
		@Pc(9) int local9;
		if (Static141.anInt2341 >= 0) {
			for (local9 = 0; local9 < this.anIntArray395.length; local9++) {
				if (!arg0.method901(this.anIntArray395[local9], Static141.anInt2341)) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray395.length; local9++) {
				if (!arg0.method897(this.anIntArray395[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray394.length; local9++) {
			if (!arg1.method8500(this.anIntArray394[local9])) {
				return false;
			}
		}
		return true;
	}
}
