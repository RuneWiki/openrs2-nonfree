import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class3_Sub3_Sub14 extends Class3_Sub3 {

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "[I")
	private final int[] anIntArray219;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "[I")
	private final int[] anIntArray218;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "Lclient!ko;")
	private final Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "Lclient!ko;")
	private final Class3_Sub4 aClass3_Sub4_3;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "Lclient!ko;")
	private final Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "[Lclient!ko;")
	private final Class3_Sub4[] aClass3_Sub4Array21;

	static {
		new Class174("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	private Class3_Sub3_Sub14() {
		this.anIntArray219 = new int[0];
		this.anIntArray218 = new int[0];
		this.aClass3_Sub4_1 = new Class3_Sub4_Sub6(0);
		this.aClass3_Sub4_1.anInt7510 = 1;
		this.aClass3_Sub4_3 = new Class3_Sub4_Sub6();
		this.aClass3_Sub4_3.anInt7510 = 1;
		this.aClass3_Sub4_2 = new Class3_Sub4_Sub6();
		this.aClass3_Sub4_2.anInt7510 = 1;
		this.aClass3_Sub4Array21 = new Class3_Sub4[] { this.aClass3_Sub4_3, this.aClass3_Sub4_2, this.aClass3_Sub4_1 };
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class3_Sub3_Sub14(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(7) int local7 = arg0.method4096();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass3_Sub4Array21 = new Class3_Sub4[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class3_Sub4 local26 = Static279.method3855(arg0);
			if (local26.method6136() >= 0) {
				local9++;
			}
			if (local26.method6145() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass3_Sub4Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method4096();
			}
			this.aClass3_Sub4Array21[local20] = local26;
		}
		this.anIntArray219 = new int[local9];
		this.anIntArray218 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class3_Sub4 local102 = this.aClass3_Sub4Array21[local95];
			local50 = local102.aClass3_Sub4Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass3_Sub4Array42[local108] = this.aClass3_Sub4Array21[local18[local95][local108]];
			}
			@Pc(134) int local134 = local102.method6136();
			@Pc(138) int local138 = local102.method6145();
			if (local134 > 0) {
				this.anIntArray219[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray218[local11++] = local138;
			}
			local18[local95] = null;
		}
		this.aClass3_Sub4_3 = this.aClass3_Sub4Array21[arg0.method4096()];
		this.aClass3_Sub4_2 = this.aClass3_Sub4Array21[arg0.method4096()];
		this.aClass3_Sub4_1 = this.aClass3_Sub4Array21[arg0.method4096()];
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!uu;ZBILclient!l;I)[F")
	public float[] method3031(@OriginalArg(0) Class250 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface7 arg3, @OriginalArg(5) int arg4) {
		Static213.aClass250_60 = arg0;
		Static188.anInterface7_3 = arg3;
		for (@Pc(16) int local16 = 0; local16 < this.aClass3_Sub4Array21.length; local16++) {
			this.aClass3_Sub4Array21[local16].method6140(arg2, arg4);
		}
		Static110.method1806(arg4, arg2);
		@Pc(43) float[] local43 = new float[arg2 * 4 * arg4];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg2; local47++) {
			@Pc(67) int[] local67;
			@Pc(63) int[] local63;
			@Pc(71) int[] local71;
			if (this.aClass3_Sub4_3.aBoolean504) {
				@Pc(79) int[] local79 = this.aClass3_Sub4_3.method6134(local47);
				local71 = local79;
				local67 = local79;
				local63 = local79;
			} else {
				@Pc(59) int[][] local59 = this.aClass3_Sub4_3.method6144(local47);
				local63 = local59[1];
				local67 = local59[0];
				local71 = local59[2];
			}
			@Pc(97) int[] local97;
			if (this.aClass3_Sub4_2.aBoolean504) {
				local97 = this.aClass3_Sub4_2.method6134(local47);
			} else {
				local97 = this.aClass3_Sub4_2.method6144(local47)[0];
			}
			@Pc(115) int[] local115;
			if (this.aClass3_Sub4_1.aBoolean504) {
				local115 = this.aClass3_Sub4_1.method6134(local47);
			} else {
				local115 = this.aClass3_Sub4_1.method6144(local47)[0];
			}
			if (arg1) {
				local45 = local47 << 2;
			}
			for (@Pc(135) int local135 = arg4 - 1; local135 >= 0; local135--) {
				@Pc(144) float local144 = (float) local97[local135] / 4096.0F;
				@Pc(157) float local157 = ((float) local115[local135] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local144 < 0.0F) {
					local144 = 0.0F;
				} else if (local144 > 1.0F) {
					local144 = 1.0F;
				}
				local43[local45++] = (float) local67[local135] * local157;
				local43[local45++] = (float) local63[local135] * local157;
				local43[local45++] = (float) local71[local135] * local157;
				local43[local45++] = local144;
				if (arg1) {
					local45 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(228) int local228 = 0; local228 < this.aClass3_Sub4Array21.length; local228++) {
			this.aClass3_Sub4Array21[local228].method6137();
		}
		return local43;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!uu;ILclient!l;)Z")
	public boolean method3033(@OriginalArg(0) Class250 arg0, @OriginalArg(2) Interface7 arg1) {
		@Pc(10) int local10;
		if (Static54.anInt1060 >= 0) {
			for (local10 = 0; local10 < this.anIntArray219.length; local10++) {
				if (!arg0.method5796(this.anIntArray219[local10], Static54.anInt1060)) {
					return false;
				}
			}
		} else {
			for (local10 = 0; local10 < this.anIntArray219.length; local10++) {
				if (!arg0.method5813(this.anIntArray219[local10])) {
					return false;
				}
			}
		}
		for (local10 = 0; local10 < this.anIntArray218.length; local10++) {
			if (!arg1.method4420(this.anIntArray218[local10])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!l;ZLclient!uu;BIIDZ)[I")
	public int[] method3034(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) double arg5, @OriginalArg(7) boolean arg6) {
		Static188.anInterface7_3 = arg0;
		Static213.aClass250_60 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub4Array21.length; local11++) {
			this.aClass3_Sub4Array21[local11].method6140(arg4, arg3);
		}
		Static201.method3088(arg5);
		Static110.method1806(arg3, arg4);
		@Pc(49) int[] local49 = new int[arg3 * arg4];
		@Pc(59) int local59;
		@Pc(53) int local53;
		@Pc(55) byte local55;
		if (arg1) {
			local53 = -1;
			local55 = -1;
			local59 = arg3 - 1;
		} else {
			local59 = 0;
			local55 = 1;
			local53 = arg3;
		}
		@Pc(69) int local69 = 0;
		for (@Pc(71) int local71 = 0; local71 < arg4; local71++) {
			if (arg6) {
				local69 = local71;
			}
			@Pc(99) int[] local99;
			@Pc(95) int[] local95;
			@Pc(91) int[] local91;
			if (this.aClass3_Sub4_3.aBoolean504) {
				@Pc(107) int[] local107 = this.aClass3_Sub4_3.method6134(local71);
				local99 = local107;
				local91 = local107;
				local95 = local107;
			} else {
				@Pc(87) int[][] local87 = this.aClass3_Sub4_3.method6144(local71);
				local91 = local87[2];
				local95 = local87[1];
				local99 = local87[0];
			}
			for (@Pc(115) int local115 = local59; local115 != local53; local115 += local55) {
				@Pc(123) int local123 = local99[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(138) int local138 = local95[local115] >> 4;
				if (local138 > 255) {
					local138 = 255;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				@Pc(156) int local156 = local91[local115] >> 4;
				if (local156 > 255) {
					local156 = 255;
				}
				if (local156 < 0) {
					local156 = 0;
				}
				local138 = Static366.anIntArray381[local138];
				local123 = Static366.anIntArray381[local123];
				local156 = Static366.anIntArray381[local156];
				@Pc(187) int local187 = local156 + (local138 << 8) + (local123 << 16);
				if (local187 != 0) {
					local187 |= 0xFF000000;
				}
				local49[local69++] = local187;
				if (arg6) {
					local69 += arg3 - 1;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass3_Sub4Array21.length; local223++) {
			this.aClass3_Sub4Array21[local223].method6137();
		}
		return local49;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!l;BLclient!uu;IZD)[I")
	public int[] method3035(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(3) Class250 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) double arg5) {
		Static188.anInterface7_3 = arg1;
		Static213.aClass250_60 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass3_Sub4Array21.length; local11++) {
			this.aClass3_Sub4Array21[local11].method6140(arg3, arg0);
		}
		Static201.method3088(arg5);
		Static110.method1806(arg0, arg3);
		@Pc(41) int[] local41 = new int[arg3 * 4 * arg0];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
			@Pc(63) int[] local63;
			@Pc(61) int[] local61;
			@Pc(59) int[] local59;
			@Pc(57) int[] local57;
			if (this.aClass3_Sub4_3.aBoolean504) {
				local57 = this.aClass3_Sub4_3.method6134(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(71) int[][] local71 = this.aClass3_Sub4_3.method6144(local45);
				local59 = local71[2];
				local61 = local71[1];
				local63 = local71[0];
			}
			if (arg4) {
				local43 = local45;
			}
			if (this.aClass3_Sub4_2.aBoolean504) {
				local57 = this.aClass3_Sub4_2.method6134(local45);
			} else {
				local57 = this.aClass3_Sub4_2.method6144(local45)[0];
			}
			for (@Pc(111) int local111 = arg0 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local63[local111] >> 4;
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
				if (local152 < 0) {
					local152 = 0;
				}
				local137 = Static366.anIntArray381[local137];
				local119 = Static366.anIntArray381[local119];
				local152 = Static366.anIntArray381[local152];
				@Pc(190) int local190;
				if (local119 == 0 && local137 == 0 && local152 == 0) {
					local190 = 0;
				} else {
					local190 = local57[local111] >> 4;
					if (local190 > 255) {
						local190 = 255;
					}
					if (local190 < 0) {
						local190 = 0;
					}
				}
				local41[local43++] = (local119 << 16) + ((local190 << 24) + (local137 << 8) + local152);
				if (arg4) {
					local43 += arg0 - 1;
				}
			}
		}
		for (@Pc(264) int local264 = 0; local264 < this.aClass3_Sub4Array21.length; local264++) {
			this.aClass3_Sub4Array21[local264].method6137();
		}
		return local41;
	}
}
