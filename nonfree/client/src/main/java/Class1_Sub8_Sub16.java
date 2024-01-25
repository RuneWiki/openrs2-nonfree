import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub8_Sub16 extends Class1_Sub8 {

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
	private final int[] anIntArray526;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "[I")
	private final int[] anIntArray524;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Lclient!rk;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Lclient!rk;")
	private final Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "Lclient!rk;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "[Lclient!rk;")
	private final Class1_Sub1[] aClass1_Sub1Array37;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	private Class1_Sub8_Sub16() {
		this.anIntArray526 = new int[0];
		this.anIntArray524 = new int[0];
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub32(0);
		this.aClass1_Sub1_1.anInt9640 = 1;
		this.aClass1_Sub1_3 = new Class1_Sub1_Sub32();
		this.aClass1_Sub1_3.anInt9640 = 1;
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub32();
		this.aClass1_Sub1Array37 = new Class1_Sub1[] { this.aClass1_Sub1_3, this.aClass1_Sub1_2, this.aClass1_Sub1_1 };
		this.aClass1_Sub1_2.anInt9640 = 1;
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class1_Sub8_Sub16(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method7974();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub1Array37 = new Class1_Sub1[local7];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static353.method5271(arg0);
			if (local26.method7827() >= 0) {
				local9++;
			}
			if (local26.method7828() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub1Array42.length;
			local14[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local14[local20][local47] = arg0.method7974();
			}
			this.aClass1_Sub1Array37[local20] = local26;
		}
		this.anIntArray524 = new int[local9];
		local9 = 0;
		this.anIntArray526 = new int[local11];
		local11 = 0;
		for (@Pc(84) int local84 = 0; local84 < local7; local84++) {
			@Pc(91) Class1_Sub1 local91 = this.aClass1_Sub1Array37[local84];
			local47 = local91.aClass1_Sub1Array42.length;
			for (@Pc(97) int local97 = 0; local97 < local47; local97++) {
				local91.aClass1_Sub1Array42[local97] = this.aClass1_Sub1Array37[local14[local84][local97]];
			}
			@Pc(123) int local123 = local91.method7827();
			@Pc(127) int local127 = local91.method7828();
			if (local123 > 0) {
				this.anIntArray524[local9++] = local123;
			}
			if (local127 > 0) {
				this.anIntArray526[local11++] = local127;
			}
			local14[local84] = null;
		}
		this.aClass1_Sub1_3 = this.aClass1_Sub1Array37[arg0.method7974()];
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array37[arg0.method7974()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array37[arg0.method7974()];
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIZLclient!sea;IILclient!fa;D)[I")
	public int[] method7045(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class308 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Interface9 arg5, @OriginalArg(7) double arg6) {
		Static107.aClass308_42 = arg3;
		Static9.anInterface9_1 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array37.length; local11++) {
			this.aClass1_Sub1Array37[local11].method7834(arg1, arg4);
		}
		Static272.method4003(arg6);
		Static584.method7821(arg4, arg1);
		@Pc(39) int[] local39 = new int[arg4 * arg1];
		@Pc(47) int local47;
		@Pc(43) int local43;
		@Pc(45) byte local45;
		if (arg0) {
			local45 = -1;
			local43 = -1;
			local47 = arg4 - 1;
		} else {
			local43 = arg4;
			local45 = 1;
			local47 = 0;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg1; local61++) {
			@Pc(77) int[] local77;
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			if (this.aClass1_Sub1_3.aBoolean711) {
				@Pc(93) int[] local93 = this.aClass1_Sub1_3.method7826(local61);
				local81 = local93;
				local77 = local93;
				local85 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass1_Sub1_3.method7832(local61);
				local77 = local73[0];
				local81 = local73[2];
				local85 = local73[1];
			}
			if (arg2) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local47; local105 != local43; local105 += local45) {
				@Pc(113) int local113 = local77[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(130) int local130 = local85[local105] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				@Pc(147) int local147 = local81[local105] >> 4;
				if (local147 > 255) {
					local147 = 255;
				}
				local113 = Static49.anIntArray45[local113];
				local130 = Static49.anIntArray45[local130];
				if (local147 < 0) {
					local147 = 0;
				}
				local147 = Static49.anIntArray45[local147];
				@Pc(181) int local181 = (local130 << 8) + ((local113 << 16) + local147);
				if (local181 != 0) {
					local181 |= 0xFF000000;
				}
				local39[local59++] = local181;
				if (arg2) {
					local59 += arg4 - 1;
				}
			}
		}
		for (@Pc(220) int local220 = 0; local220 < this.aClass1_Sub1Array37.length; local220++) {
			this.aClass1_Sub1Array37[local220].method7829();
		}
		return local39;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!sea;Lclient!fa;)Z")
	public boolean method7046(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Interface9 arg1) {
		@Pc(9) int local9;
		if (Static41.anInt8217 < 0) {
			for (local9 = 0; local9 < this.anIntArray524.length; local9++) {
				if (!arg0.method6538(this.anIntArray524[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray524.length; local9++) {
				if (!arg0.method6545(this.anIntArray524[local9], Static41.anInt8217)) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray526.length; local9++) {
			if (!arg1.method949(this.anIntArray526[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!sea;Lclient!fa;IIZI)[F")
	public float[] method7048(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static107.aClass308_42 = arg0;
		Static9.anInterface9_1 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array37.length; local11++) {
			this.aClass1_Sub1Array37[local11].method7834(arg2, arg4);
		}
		Static584.method7821(arg4, arg2);
		@Pc(38) float[] local38 = new float[arg2 * 4 * arg4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
			@Pc(56) int[] local56;
			@Pc(60) int[] local60;
			@Pc(58) int[] local58;
			if (this.aClass1_Sub1_3.aBoolean711) {
				@Pc(54) int[] local54 = this.aClass1_Sub1_3.method7826(local42);
				local56 = local54;
				local58 = local54;
				local60 = local54;
			} else {
				@Pc(68) int[][] local68 = this.aClass1_Sub1_3.method7832(local42);
				local56 = local68[0];
				local60 = local68[1];
				local58 = local68[2];
			}
			@Pc(92) int[] local92;
			if (this.aClass1_Sub1_2.aBoolean711) {
				local92 = this.aClass1_Sub1_2.method7826(local42);
			} else {
				local92 = this.aClass1_Sub1_2.method7832(local42)[0];
			}
			if (arg3) {
				local40 = local42 << 2;
			}
			@Pc(118) int[] local118;
			if (this.aClass1_Sub1_1.aBoolean711) {
				local118 = this.aClass1_Sub1_1.method7826(local42);
			} else {
				local118 = this.aClass1_Sub1_1.method7832(local42)[0];
			}
			for (@Pc(130) int local130 = arg4 - 1; local130 >= 0; local130--) {
				@Pc(139) float local139 = (float) local92[local130] / 4096.0F;
				if (local139 < 0.0F) {
					local139 = 0.0F;
				} else if (local139 > 1.0F) {
					local139 = 1.0F;
				}
				@Pc(166) float local166 = ((float) local118[local130] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local38[local40++] = (float) local56[local130] * local166;
				local38[local40++] = local166 * (float) local60[local130];
				local38[local40++] = (float) local58[local130] * local166;
				local38[local40++] = local139;
				if (arg3) {
					local40 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(232) int local232 = 0; local232 < this.aClass1_Sub1Array37.length; local232++) {
			this.aClass1_Sub1Array37[local232].method7829();
		}
		return local38;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIILclient!sea;IDLclient!fa;)[I")
	public int[] method7050(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class308 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Interface9 arg5) {
		Static107.aClass308_42 = arg2;
		Static9.anInterface9_1 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub1Array37.length; local11++) {
			this.aClass1_Sub1Array37[local11].method7834(arg3, arg1);
		}
		Static272.method4003(arg4);
		Static584.method7821(arg1, arg3);
		@Pc(46) int[] local46 = new int[arg3 * 4 * arg1];
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg3; local50++) {
			@Pc(66) int[] local66;
			@Pc(74) int[] local74;
			@Pc(70) int[] local70;
			@Pc(84) int[] local84;
			if (this.aClass1_Sub1_3.aBoolean711) {
				local84 = this.aClass1_Sub1_3.method7826(local50);
				local74 = local84;
				local70 = local84;
				local66 = local84;
			} else {
				@Pc(62) int[][] local62 = this.aClass1_Sub1_3.method7832(local50);
				local66 = local62[0];
				local70 = local62[2];
				local74 = local62[1];
			}
			if (arg0) {
				local48 = local50;
			}
			if (this.aClass1_Sub1_2.aBoolean711) {
				local84 = this.aClass1_Sub1_2.method7826(local50);
			} else {
				local84 = this.aClass1_Sub1_2.method7832(local50)[0];
			}
			for (@Pc(118) int local118 = arg1 - 1; local118 >= 0; local118--) {
				@Pc(126) int local126 = local66[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(143) int local143 = local74[local118] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(161) int local161 = local70[local118] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local126 = Static49.anIntArray45[local126];
				local143 = Static49.anIntArray45[local143];
				if (local161 < 0) {
					local161 = 0;
				}
				local161 = Static49.anIntArray45[local161];
				@Pc(203) int local203;
				if (local126 == 0 && local143 == 0 && local161 == 0) {
					local203 = 0;
				} else {
					local203 = local84[local118] >> 4;
					if (local203 > 255) {
						local203 = 255;
					}
					if (local203 < 0) {
						local203 = 0;
					}
				}
				local46[local48++] = (local203 << 24) + ((local126 << 16) - (-(local143 << 8) - local161));
				if (arg0) {
					local48 += arg1 - 1;
				}
			}
		}
		for (@Pc(261) int local261 = 0; local261 < this.aClass1_Sub1Array37.length; local261++) {
			this.aClass1_Sub1Array37[local261].method7829();
		}
		return local46;
	}
}
