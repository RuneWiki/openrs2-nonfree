import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class12_Sub4_Sub14 extends Class12_Sub4 {

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "[I")
	private final int[] anIntArray473;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "[I")
	private final int[] anIntArray472;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "Lclient!nd;")
	private final Class12_Sub1 aClass12_Sub1_1;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "Lclient!nd;")
	private final Class12_Sub1 aClass12_Sub1_2;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Lclient!nd;")
	private final Class12_Sub1 aClass12_Sub1_3;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "[Lclient!nd;")
	private final Class12_Sub1[] aClass12_Sub1Array23;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	private Class12_Sub4_Sub14() {
		this.anIntArray473 = new int[0];
		this.anIntArray472 = new int[0];
		this.aClass12_Sub1_1 = new Class12_Sub1_Sub16(0);
		this.aClass12_Sub1_1.anInt9406 = 1;
		this.aClass12_Sub1_2 = new Class12_Sub1_Sub16();
		this.aClass12_Sub1_2.anInt9406 = 1;
		this.aClass12_Sub1_3 = new Class12_Sub1_Sub16();
		this.aClass12_Sub1Array23 = new Class12_Sub1[] { this.aClass12_Sub1_2, this.aClass12_Sub1_3, this.aClass12_Sub1_1 };
		this.aClass12_Sub1_3.anInt9406 = 1;
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!daa;)V")
	public Class12_Sub4_Sub14(@OriginalArg(0) Class12_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method5216();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass12_Sub1Array23 = new Class12_Sub1[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class12_Sub1 local26 = Static174.method3479(arg0);
			if (local26.method7796() >= 0) {
				local9++;
			}
			if (local26.method7791() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass12_Sub1Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method5216();
			}
			this.aClass12_Sub1Array23[local20] = local26;
		}
		this.anIntArray472 = new int[local9];
		local9 = 0;
		this.anIntArray473 = new int[local11];
		local11 = 0;
		for (@Pc(90) int local90 = 0; local90 < local7; local90++) {
			@Pc(97) Class12_Sub1 local97 = this.aClass12_Sub1Array23[local90];
			local53 = local97.aClass12_Sub1Array42.length;
			for (@Pc(103) int local103 = 0; local103 < local53; local103++) {
				local97.aClass12_Sub1Array42[local103] = this.aClass12_Sub1Array23[local14[local90][local103]];
			}
			@Pc(129) int local129 = local97.method7796();
			@Pc(133) int local133 = local97.method7791();
			if (local129 > 0) {
				this.anIntArray472[local9++] = local129;
			}
			if (local133 > 0) {
				this.anIntArray473[local11++] = local133;
			}
			local14[local90] = null;
		}
		this.aClass12_Sub1_2 = this.aClass12_Sub1Array23[arg0.method5216()];
		this.aClass12_Sub1_3 = this.aClass12_Sub1Array23[arg0.method5216()];
		this.aClass12_Sub1_1 = this.aClass12_Sub1Array23[arg0.method5216()];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!an;ILclient!n;ZI)[F")
	public float[] method5719(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface11 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static516.anInterface11_13 = arg2;
		Static10.aClass16_3 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass12_Sub1Array23.length; local11++) {
			this.aClass12_Sub1Array23[local11].method7799(arg4, arg1);
		}
		Static33.method3595(arg1, arg4);
		@Pc(42) float[] local42 = new float[arg1 * 4 * arg4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(62) int[] local62;
			@Pc(70) int[] local70;
			@Pc(66) int[] local66;
			if (this.aClass12_Sub1_2.aBoolean663) {
				@Pc(80) int[] local80 = this.aClass12_Sub1_2.method7798(local46);
				local66 = local80;
				local62 = local80;
				local70 = local80;
			} else {
				@Pc(58) int[][] local58 = this.aClass12_Sub1_2.method7793(local46);
				local62 = local58[0];
				local66 = local58[2];
				local70 = local58[1];
			}
			@Pc(98) int[] local98;
			if (this.aClass12_Sub1_3.aBoolean663) {
				local98 = this.aClass12_Sub1_3.method7798(local46);
			} else {
				local98 = this.aClass12_Sub1_3.method7793(local46)[0];
			}
			@Pc(120) int[] local120;
			if (this.aClass12_Sub1_1.aBoolean663) {
				local120 = this.aClass12_Sub1_1.method7798(local46);
			} else {
				local120 = this.aClass12_Sub1_1.method7793(local46)[0];
			}
			if (arg3) {
				local44 = local46 << 2;
			}
			for (@Pc(140) int local140 = arg4 - 1; local140 >= 0; local140--) {
				@Pc(149) float local149 = (float) local98[local140] / 4096.0F;
				if (local149 < 0.0F) {
					local149 = 0.0F;
				} else if (local149 > 1.0F) {
					local149 = 1.0F;
				}
				@Pc(176) float local176 = ((float) local120[local140] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local44++] = (float) local62[local140] * local176;
				local42[local44++] = local176 * (float) local70[local140];
				local42[local44++] = local176 * (float) local66[local140];
				local42[local44++] = local149;
				if (arg3) {
					local44 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass12_Sub1Array23.length; local233++) {
			this.aClass12_Sub1Array23[local233].method7789();
		}
		return local42;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!n;ZIIDLclient!an;B)[I")
	public int[] method5720(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4, @OriginalArg(5) Class16 arg5) {
		Static10.aClass16_3 = arg5;
		Static516.anInterface11_13 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass12_Sub1Array23.length; local11++) {
			this.aClass12_Sub1Array23[local11].method7799(arg2, arg3);
		}
		Static459.method6908(arg4);
		Static33.method3595(arg3, arg2);
		@Pc(43) int[] local43 = new int[arg2 * arg3 * 4];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
			@Pc(63) int[] local63;
			@Pc(61) int[] local61;
			@Pc(65) int[] local65;
			@Pc(59) int[] local59;
			if (this.aClass12_Sub1_2.aBoolean663) {
				local59 = this.aClass12_Sub1_2.method7798(local47);
				local61 = local59;
				local63 = local59;
				local65 = local59;
			} else {
				@Pc(73) int[][] local73 = this.aClass12_Sub1_2.method7793(local47);
				local63 = local73[0];
				local61 = local73[1];
				local65 = local73[2];
			}
			if (this.aClass12_Sub1_3.aBoolean663) {
				local59 = this.aClass12_Sub1_3.method7798(local47);
			} else {
				local59 = this.aClass12_Sub1_3.method7793(local47)[0];
			}
			if (arg1) {
				local45 = local47;
			}
			for (@Pc(113) int local113 = arg2 - 1; local113 >= 0; local113--) {
				@Pc(121) int local121 = local63[local113] >> 4;
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				@Pc(136) int local136 = local61[local113] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(154) int local154 = local65[local113] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				local121 = Static473.anIntArray642[local121];
				if (local154 < 0) {
					local154 = 0;
				}
				local136 = Static473.anIntArray642[local136];
				local154 = Static473.anIntArray642[local154];
				@Pc(193) int local193;
				if (local121 == 0 && local136 == 0 && local154 == 0) {
					local193 = 0;
				} else {
					local193 = local59[local113] >> 4;
					if (local193 > 255) {
						local193 = 255;
					}
					if (local193 < 0) {
						local193 = 0;
					}
				}
				local43[local45++] = local154 + (local121 << 16) + (local193 << 24) + (local136 << 8);
				if (arg1) {
					local45 += arg2 - 1;
				}
			}
		}
		for (@Pc(254) int local254 = 0; local254 < this.aClass12_Sub1Array23.length; local254++) {
			this.aClass12_Sub1Array23[local254].method7789();
		}
		return local43;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!an;Lclient!n;I)Z")
	public boolean method5721(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Interface11 arg1) {
		@Pc(12) int local12;
		if (Static336.anInt6442 >= 0) {
			for (local12 = 0; local12 < this.anIntArray472.length; local12++) {
				if (!arg0.method397(Static336.anInt6442, this.anIntArray472[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray472.length; local12++) {
				if (!arg0.method389(this.anIntArray472[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray473.length; local12++) {
			if (!arg1.method6213(this.anIntArray473[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!n;IZLclient!an;IDZI)[I")
	public int[] method5724(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5, @OriginalArg(6) boolean arg6) {
		Static10.aClass16_3 = arg3;
		Static516.anInterface11_13 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass12_Sub1Array23.length; local11++) {
			this.aClass12_Sub1Array23[local11].method7799(arg1, arg4);
		}
		Static459.method6908(arg5);
		Static33.method3595(arg4, arg1);
		@Pc(45) int[] local45 = new int[arg1 * arg4];
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(51) byte local51;
		if (arg2) {
			local51 = -1;
			local53 = -1;
			local49 = arg1 - 1;
		} else {
			local49 = 0;
			local51 = 1;
			local53 = arg1;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg4; local67++) {
			@Pc(91) int[] local91;
			@Pc(83) int[] local83;
			@Pc(87) int[] local87;
			if (this.aClass12_Sub1_2.aBoolean663) {
				@Pc(99) int[] local99 = this.aClass12_Sub1_2.method7798(local67);
				local91 = local99;
				local83 = local99;
				local87 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass12_Sub1_2.method7793(local67);
				local83 = local79[1];
				local87 = local79[2];
				local91 = local79[0];
			}
			if (arg6) {
				local65 = local67;
			}
			for (@Pc(111) int local111 = local49; local111 != local53; local111 += local51) {
				@Pc(119) int local119 = local91[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local83[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(157) int local157 = local87[local111] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local119 = Static473.anIntArray642[local119];
				if (local157 < 0) {
					local157 = 0;
				}
				local137 = Static473.anIntArray642[local137];
				local157 = Static473.anIntArray642[local157];
				@Pc(188) int local188 = local157 + (local137 << 8) + (local119 << 16);
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local45[local65++] = local188;
				if (arg6) {
					local65 += arg1 - 1;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass12_Sub1Array23.length; local224++) {
			this.aClass12_Sub1Array23[local224].method7789();
		}
		return local45;
	}
}
