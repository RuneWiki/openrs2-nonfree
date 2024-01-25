import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class3_Sub4_Sub11 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fga", name = "F", descriptor = "[I")
	private final int[] anIntArray205;

	@OriginalMember(owner = "client!fga", name = "D", descriptor = "[I")
	private final int[] anIntArray204;

	@OriginalMember(owner = "client!fga", name = "u", descriptor = "Lclient!ku;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!fga", name = "z", descriptor = "Lclient!ku;")
	private final Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!fga", name = "w", descriptor = "Lclient!ku;")
	private final Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!fga", name = "A", descriptor = "[Lclient!ku;")
	private final Class3_Sub1[] aClass3_Sub1Array13;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V")
	private Class3_Sub4_Sub11() {
		this.anIntArray205 = new int[0];
		this.anIntArray204 = new int[0];
		this.aClass3_Sub1_1 = new Class3_Sub1_Sub28(0);
		this.aClass3_Sub1_1.anInt10368 = 1;
		this.aClass3_Sub1_3 = new Class3_Sub1_Sub28();
		this.aClass3_Sub1_3.anInt10368 = 1;
		this.aClass3_Sub1_2 = new Class3_Sub1_Sub28();
		this.aClass3_Sub1_2.anInt10368 = 1;
		this.aClass3_Sub1Array13 = new Class3_Sub1[] { this.aClass3_Sub1_3, this.aClass3_Sub1_2, this.aClass3_Sub1_1 };
	}

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class3_Sub4_Sub11(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method6538();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub1Array13 = new Class3_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub1 local26 = Static555.method8091(arg0);
			if (local26.method8367() >= 0) {
				local9++;
			}
			if (local26.method8369() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass3_Sub1Array42.length;
			local18[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local18[local20][local53] = arg0.method6538();
			}
			this.aClass3_Sub1Array13[local20] = local26;
		}
		this.anIntArray204 = new int[local9];
		local9 = 0;
		this.anIntArray205 = new int[local11];
		local11 = 0;
		for (@Pc(98) int local98 = 0; local98 < local7; local98++) {
			@Pc(105) Class3_Sub1 local105 = this.aClass3_Sub1Array13[local98];
			local53 = local105.aClass3_Sub1Array42.length;
			for (@Pc(111) int local111 = 0; local111 < local53; local111++) {
				local105.aClass3_Sub1Array42[local111] = this.aClass3_Sub1Array13[local18[local98][local111]];
			}
			@Pc(137) int local137 = local105.method8367();
			@Pc(141) int local141 = local105.method8369();
			if (local137 > 0) {
				this.anIntArray204[local9++] = local137;
			}
			if (local141 > 0) {
				this.anIntArray205[local11++] = local141;
			}
			local18[local98] = null;
		}
		this.aClass3_Sub1_3 = this.aClass3_Sub1Array13[arg0.method6538()];
		this.aClass3_Sub1_2 = this.aClass3_Sub1Array13[arg0.method6538()];
		this.aClass3_Sub1_1 = this.aClass3_Sub1Array13[arg0.method6538()];
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!e;IZLclient!pe;BI)[F")
	public float[] method2834(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(5) int arg4) {
		Static430.aClass254_110 = arg3;
		Static350.anInterface4_12 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array13.length; local11++) {
			this.aClass3_Sub1Array13[local11].method8363(arg1, arg4);
		}
		Static334.method5783(arg1, arg4);
		@Pc(38) float[] local38 = new float[arg4 * 4 * arg1];
		@Pc(40) int local40 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg1; local47++) {
			@Pc(61) int[] local61;
			@Pc(63) int[] local63;
			@Pc(65) int[] local65;
			if (this.aClass3_Sub1_3.aBoolean850) {
				@Pc(59) int[] local59 = this.aClass3_Sub1_3.method8359(local47);
				local61 = local59;
				local63 = local59;
				local65 = local59;
			} else {
				@Pc(73) int[][] local73 = this.aClass3_Sub1_3.method8371(local47);
				local63 = local73[1];
				local65 = local73[2];
				local61 = local73[0];
			}
			@Pc(97) int[] local97;
			if (this.aClass3_Sub1_2.aBoolean850) {
				local97 = this.aClass3_Sub1_2.method8359(local47);
			} else {
				local97 = this.aClass3_Sub1_2.method8371(local47)[0];
			}
			if (arg2) {
				local40 = local47 << 2;
			}
			@Pc(121) int[] local121;
			if (this.aClass3_Sub1_1.aBoolean850) {
				local121 = this.aClass3_Sub1_1.method8359(local47);
			} else {
				local121 = this.aClass3_Sub1_1.method8371(local47)[0];
			}
			for (@Pc(135) int local135 = arg4 - 1; local135 >= 0; local135--) {
				@Pc(144) float local144 = (float) local97[local135] / 4096.0F;
				@Pc(157) float local157 = ((float) local121[local135] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local144 < 0.0F) {
					local144 = 0.0F;
				} else if (local144 > 1.0F) {
					local144 = 1.0F;
				}
				local38[local40++] = (float) local61[local135] * local157;
				local38[local40++] = local157 * (float) local63[local135];
				local38[local40++] = local157 * (float) local65[local135];
				local38[local40++] = local144;
				if (arg2) {
					local40 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass3_Sub1Array13.length; local232++) {
			this.aClass3_Sub1Array13[local232].method8364();
		}
		return local38;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILclient!e;Lclient!pe;)Z")
	public boolean method2835(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class254 arg1) {
		@Pc(9) int local9;
		if (Static158.anInt3416 >= 0) {
			for (local9 = 0; local9 < this.anIntArray204.length; local9++) {
				if (!arg1.method6398(Static158.anInt3416, this.anIntArray204[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray204.length; local9++) {
				if (!arg1.method6417(this.anIntArray204[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray205.length; local9++) {
			if (!arg0.method3090(this.anIntArray205[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!e;DILclient!pe;IIZZ)[I")
	public int[] method2837(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		Static350.anInterface4_12 = arg0;
		Static430.aClass254_110 = arg3;
		for (@Pc(16) int local16 = 0; local16 < this.aClass3_Sub1Array13.length; local16++) {
			this.aClass3_Sub1Array13[local16].method8363(arg4, arg2);
		}
		Static511.method7660(arg1);
		Static334.method5783(arg4, arg2);
		@Pc(48) int[] local48 = new int[arg4 * arg2];
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(56) byte local56;
		if (arg5) {
			local54 = arg2 - 1;
			local56 = -1;
			local58 = -1;
		} else {
			local56 = 1;
			local54 = 0;
			local58 = arg2;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg4; local70++) {
			if (arg6) {
				local68 = local70;
			}
			@Pc(90) int[] local90;
			@Pc(92) int[] local92;
			@Pc(88) int[] local88;
			if (this.aClass3_Sub1_3.aBoolean850) {
				@Pc(86) int[] local86 = this.aClass3_Sub1_3.method8359(local70);
				local88 = local86;
				local90 = local86;
				local92 = local86;
			} else {
				@Pc(100) int[][] local100 = this.aClass3_Sub1_3.method8371(local70);
				local88 = local100[2];
				local90 = local100[0];
				local92 = local100[1];
			}
			for (@Pc(114) int local114 = local54; local114 != local58; local114 += local56) {
				@Pc(122) int local122 = local90[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(142) int local142 = local92[local114] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(162) int local162 = local88[local114] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				local142 = Static404.anIntArray490[local142];
				if (local162 < 0) {
					local162 = 0;
				}
				local122 = Static404.anIntArray490[local122];
				local162 = Static404.anIntArray490[local162];
				@Pc(195) int local195 = local162 + (local122 << 16) + (local142 << 8);
				if (local195 != 0) {
					local195 |= 0xFF000000;
				}
				local48[local68++] = local195;
				if (arg6) {
					local68 += arg2 - 1;
				}
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.aClass3_Sub1Array13.length; local238++) {
			this.aClass3_Sub1Array13[local238].method8364();
		}
		return local48;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZLclient!e;IILclient!pe;D)[I")
	public int[] method2838(@OriginalArg(1) boolean arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class254 arg4, @OriginalArg(6) double arg5) {
		Static430.aClass254_110 = arg4;
		Static350.anInterface4_12 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub1Array13.length; local11++) {
			this.aClass3_Sub1Array13[local11].method8363(arg2, arg3);
		}
		Static511.method7660(arg5);
		Static334.method5783(arg2, arg3);
		@Pc(41) int[] local41 = new int[arg3 * 4 * arg2];
		@Pc(43) int local43 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg2; local53++) {
			@Pc(69) int[] local69;
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			@Pc(85) int[] local85;
			if (this.aClass3_Sub1_3.aBoolean850) {
				local85 = this.aClass3_Sub1_3.method8359(local53);
				local73 = local85;
				local77 = local85;
				local69 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass3_Sub1_3.method8371(local53);
				local69 = local65[0];
				local73 = local65[2];
				local77 = local65[1];
			}
			if (arg0) {
				local43 = local53;
			}
			if (this.aClass3_Sub1_2.aBoolean850) {
				local85 = this.aClass3_Sub1_2.method8359(local53);
			} else {
				local85 = this.aClass3_Sub1_2.method8371(local53)[0];
			}
			for (@Pc(119) int local119 = arg3 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local69[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(144) int local144 = local77[local119] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(161) int local161 = local73[local119] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local127 = Static404.anIntArray490[local127];
				if (local161 < 0) {
					local161 = 0;
				}
				local144 = Static404.anIntArray490[local144];
				local161 = Static404.anIntArray490[local161];
				@Pc(195) int local195;
				if (local127 == 0 && local144 == 0 && local161 == 0) {
					local195 = 0;
				} else {
					local195 = local85[local119] >> 4;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 < 0) {
						local195 = 0;
					}
				}
				local41[local43++] = local161 + (local144 << 8) + (local195 << 24) + (local127 << 16);
				if (arg0) {
					local43 += arg3 - 1;
				}
			}
		}
		for (@Pc(255) int local255 = 0; local255 < this.aClass3_Sub1Array13.length; local255++) {
			this.aClass3_Sub1Array13[local255].method8364();
		}
		return local41;
	}
}
