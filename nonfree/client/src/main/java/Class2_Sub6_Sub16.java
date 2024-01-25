import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class2_Sub6_Sub16 extends Class2_Sub6 {

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "[I")
	private final int[] anIntArray403;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "[I")
	private final int[] anIntArray404;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "Lclient!tf;")
	private final Class2_Sub3 aClass2_Sub3_3;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "Lclient!tf;")
	private final Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "Lclient!tf;")
	private final Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "[Lclient!tf;")
	private final Class2_Sub3[] aClass2_Sub3Array22;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	private Class2_Sub6_Sub16() {
		this.anIntArray403 = new int[0];
		this.anIntArray404 = new int[0];
		this.aClass2_Sub3_3 = new Class2_Sub3_Sub23(0);
		this.aClass2_Sub3_3.anInt10959 = 1;
		this.aClass2_Sub3_1 = new Class2_Sub3_Sub23();
		this.aClass2_Sub3_1.anInt10959 = 1;
		this.aClass2_Sub3_2 = new Class2_Sub3_Sub23();
		this.aClass2_Sub3Array22 = new Class2_Sub3[] { this.aClass2_Sub3_1, this.aClass2_Sub3_2, this.aClass2_Sub3_3 };
		this.aClass2_Sub3_2.anInt10959 = 1;
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class2_Sub6_Sub16(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method8383();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass2_Sub3Array22 = new Class2_Sub3[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub3 local26 = Static503.method7755(arg0);
			if (local26.method9145() >= 0) {
				local9++;
			}
			if (local26.method9151() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub3Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method8383();
			}
			this.aClass2_Sub3Array22[local20] = local26;
		}
		this.anIntArray404 = new int[local9];
		this.anIntArray403 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class2_Sub3 local98 = this.aClass2_Sub3Array22[local91];
			local50 = local98.aClass2_Sub3Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass2_Sub3Array42[local104] = this.aClass2_Sub3Array22[local14[local91][local104]];
			}
			@Pc(130) int local130 = local98.method9145();
			@Pc(134) int local134 = local98.method9151();
			if (local130 > 0) {
				this.anIntArray404[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray403[local11++] = local134;
			}
			local14[local91] = null;
		}
		this.aClass2_Sub3_1 = this.aClass2_Sub3Array22[arg0.method8383()];
		this.aClass2_Sub3_2 = this.aClass2_Sub3Array22[arg0.method8383()];
		this.aClass2_Sub3_3 = this.aClass2_Sub3Array22[arg0.method8383()];
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!d;IIZDLclient!in;B)[I")
	public int[] method5717(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) double arg4, @OriginalArg(5) Class157 arg5) {
		Static190.anInterface4_8 = arg0;
		Static124.aClass157_311 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub3Array22.length; local11++) {
			this.aClass2_Sub3Array22[local11].method9153(arg1, arg2);
		}
		Static610.method8936(arg4);
		Static30.method730(arg2, arg1);
		@Pc(39) int[] local39 = new int[arg1 * arg2];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
			@Pc(57) int[] local57;
			@Pc(61) int[] local61;
			@Pc(59) int[] local59;
			@Pc(55) int[] local55;
			if (this.aClass2_Sub3_1.aBoolean748) {
				local55 = this.aClass2_Sub3_1.method9150(local43);
				local57 = local55;
				local59 = local55;
				local61 = local55;
			} else {
				@Pc(69) int[][] local69 = this.aClass2_Sub3_1.method9155(local43);
				local59 = local69[2];
				local61 = local69[1];
				local57 = local69[0];
			}
			if (arg3) {
				local41 = local43;
			}
			if (this.aClass2_Sub3_2.aBoolean748) {
				local55 = this.aClass2_Sub3_2.method9150(local43);
			} else {
				local55 = this.aClass2_Sub3_2.method9155(local43)[0];
			}
			for (@Pc(111) int local111 = arg1 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local57[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local61[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(152) int local152 = local59[local111] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local137 = Static286.anIntArray352[local137];
				if (local152 < 0) {
					local152 = 0;
				}
				local119 = Static286.anIntArray352[local119];
				local152 = Static286.anIntArray352[local152];
				@Pc(184) int local184;
				if (local119 == 0 && local137 == 0 && local152 == 0) {
					local184 = 0;
				} else {
					local184 = local55[local111] >> 4;
					if (local184 > 255) {
						local184 = 255;
					}
					if (local184 < 0) {
						local184 = 0;
					}
				}
				local39[local41++] = local152 + (local184 << 24) + (local119 << 16) + (local137 << 8);
				if (arg3) {
					local41 += arg1 - 1;
				}
			}
		}
		for (@Pc(244) int local244 = 0; local244 < this.aClass2_Sub3Array22.length; local244++) {
			this.aClass2_Sub3Array22[local244].method9154();
		}
		return local39;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!d;Lclient!in;I)Z")
	public boolean method5718(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class157 arg1) {
		@Pc(12) int local12;
		if (Static200.anInt4609 < 0) {
			for (local12 = 0; local12 < this.anIntArray404.length; local12++) {
				if (!arg1.method4575(this.anIntArray404[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray404.length; local12++) {
				if (!arg1.method4574(Static200.anInt4609, this.anIntArray404[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray403.length; local12++) {
			if (!arg0.method8049(this.anIntArray403[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!d;IZDZLclient!in;I)[I")
	public int[] method5719(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class157 arg5, @OriginalArg(7) int arg6) {
		Static190.anInterface4_8 = arg1;
		Static124.aClass157_311 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub3Array22.length; local11++) {
			this.aClass2_Sub3Array22[local11].method9153(arg0, arg6);
		}
		Static610.method8936(arg3);
		Static30.method730(arg6, arg0);
		@Pc(41) int[] local41 = new int[arg6 * arg0];
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg4) {
			local45 = arg0 - 1;
			local47 = -1;
			local49 = -1;
		} else {
			local45 = 0;
			local47 = 1;
			local49 = arg0;
		}
		@Pc(61) int local61 = 0;
		for (@Pc(63) int local63 = 0; local63 < arg6; local63++) {
			@Pc(79) int[] local79;
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			if (this.aClass2_Sub3_1.aBoolean748) {
				@Pc(75) int[] local75 = this.aClass2_Sub3_1.method9150(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass2_Sub3_1.method9155(local63);
				local77 = local89[1];
				local79 = local89[0];
				local81 = local89[2];
			}
			if (arg2) {
				local61 = local63;
			}
			for (@Pc(107) int local107 = local45; local107 != local49; local107 += local47) {
				@Pc(115) int local115 = local79[local107] >> 4;
				if (local115 > 255) {
					local115 = 255;
				}
				if (local115 < 0) {
					local115 = 0;
				}
				@Pc(130) int local130 = local77[local107] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				@Pc(145) int local145 = local81[local107] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				local130 = Static286.anIntArray352[local130];
				local115 = Static286.anIntArray352[local115];
				if (local145 < 0) {
					local145 = 0;
				}
				local145 = Static286.anIntArray352[local145];
				@Pc(181) int local181 = (local130 << 8) + (local115 << 16) + local145;
				if (local181 != 0) {
					local181 |= 0xFF000000;
				}
				local41[local61++] = local181;
				if (arg2) {
					local61 += arg0 - 1;
				}
			}
		}
		for (@Pc(216) int local216 = 0; local216 < this.aClass2_Sub3Array22.length; local216++) {
			this.aClass2_Sub3Array22[local216].method9154();
		}
		return local41;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!d;ZILclient!in;I)[F")
	public float[] method5720(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class157 arg4) {
		Static124.aClass157_311 = arg4;
		Static190.anInterface4_8 = arg1;
		for (@Pc(24) int local24 = 0; local24 < this.aClass2_Sub3Array22.length; local24++) {
			this.aClass2_Sub3Array22[local24].method9153(arg0, arg3);
		}
		Static30.method730(arg3, arg0);
		@Pc(51) float[] local51 = new float[arg0 * 4 * arg3];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg3; local55++) {
			@Pc(75) int[] local75;
			@Pc(71) int[] local71;
			@Pc(79) int[] local79;
			if (this.aClass2_Sub3_1.aBoolean748) {
				@Pc(87) int[] local87 = this.aClass2_Sub3_1.method9150(local55);
				local79 = local87;
				local71 = local87;
				local75 = local87;
			} else {
				@Pc(67) int[][] local67 = this.aClass2_Sub3_1.method9155(local55);
				local71 = local67[1];
				local75 = local67[0];
				local79 = local67[2];
			}
			@Pc(103) int[] local103;
			if (this.aClass2_Sub3_2.aBoolean748) {
				local103 = this.aClass2_Sub3_2.method9150(local55);
			} else {
				local103 = this.aClass2_Sub3_2.method9155(local55)[0];
			}
			@Pc(123) int[] local123;
			if (this.aClass2_Sub3_3.aBoolean748) {
				local123 = this.aClass2_Sub3_3.method9150(local55);
			} else {
				local123 = this.aClass2_Sub3_3.method9155(local55)[0];
			}
			if (arg2) {
				local53 = local55 << 2;
			}
			for (@Pc(143) int local143 = arg0 - 1; local143 >= 0; local143--) {
				@Pc(152) float local152 = (float) local103[local143] / 4096.0F;
				@Pc(165) float local165 = ((float) local123[local143] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local152 < 0.0F) {
					local152 = 0.0F;
				} else if (local152 > 1.0F) {
					local152 = 1.0F;
				}
				local51[local53++] = (float) local75[local143] * local165;
				local51[local53++] = local165 * (float) local71[local143];
				local51[local53++] = (float) local79[local143] * local165;
				local51[local53++] = local152;
				if (arg2) {
					local53 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass2_Sub3Array22.length; local236++) {
			this.aClass2_Sub3Array22[local236].method9154();
		}
		return local51;
	}
}
