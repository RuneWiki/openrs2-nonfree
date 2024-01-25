import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
	private final int[] anIntArray572;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "[I")
	private final int[] anIntArray571;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "Lclient!fa;")
	private final Class1_Sub5 aClass1_Sub5_3;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!fa;")
	private final Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!fa;")
	private final Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "[Lclient!fa;")
	private final Class1_Sub5[] aClass1_Sub5Array36;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	private Class1_Sub2_Sub18() {
		this.anIntArray572 = new int[0];
		this.anIntArray571 = new int[0];
		this.aClass1_Sub5_3 = new Class1_Sub5_Sub21(0);
		this.aClass1_Sub5_3.anInt6691 = 1;
		this.aClass1_Sub5_1 = new Class1_Sub5_Sub21();
		this.aClass1_Sub5_1.anInt6691 = 1;
		this.aClass1_Sub5_2 = new Class1_Sub5_Sub21();
		this.aClass1_Sub5_2.anInt6691 = 1;
		this.aClass1_Sub5Array36 = new Class1_Sub5[] { this.aClass1_Sub5_1, this.aClass1_Sub5_2, this.aClass1_Sub5_3 };
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) Class1_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method5720();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub5Array36 = new Class1_Sub5[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub5 local26 = Static223.method1248(arg0);
			if (local26.method5806() >= 0) {
				local9++;
			}
			if (local26.method5809() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass1_Sub5Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method5720();
			}
			this.aClass1_Sub5Array36[local20] = local26;
		}
		this.anIntArray571 = new int[local9];
		local9 = 0;
		this.anIntArray572 = new int[local11];
		local11 = 0;
		for (@Pc(94) int local94 = 0; local94 < local7; local94++) {
			@Pc(101) Class1_Sub5 local101 = this.aClass1_Sub5Array36[local94];
			local53 = local101.aClass1_Sub5Array42.length;
			for (@Pc(107) int local107 = 0; local107 < local53; local107++) {
				local101.aClass1_Sub5Array42[local107] = this.aClass1_Sub5Array36[local14[local94][local107]];
			}
			@Pc(133) int local133 = local101.method5806();
			@Pc(137) int local137 = local101.method5809();
			if (local133 > 0) {
				this.anIntArray571[local9++] = local133;
			}
			if (local137 > 0) {
				this.anIntArray572[local11++] = local137;
			}
			local14[local94] = null;
		}
		this.aClass1_Sub5_1 = this.aClass1_Sub5Array36[arg0.method5720()];
		this.aClass1_Sub5_2 = this.aClass1_Sub5Array36[arg0.method5720()];
		this.aClass1_Sub5_3 = this.aClass1_Sub5Array36[arg0.method5720()];
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!lm;ZIDLclient!fh;Z)[I")
	public int[] method5153(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Interface2 arg5, @OriginalArg(7) boolean arg6) {
		Static153.aClass134_72 = arg1;
		Static271.anInterface2_5 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub5Array36.length; local11++) {
			this.aClass1_Sub5Array36[local11].method5810(arg0, arg3);
		}
		Static259.method4658(arg4);
		Static91.method1439(arg0, arg3);
		@Pc(39) int[] local39 = new int[arg3 * arg0];
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(47) byte local47;
		if (arg2) {
			local43 = arg0 - 1;
			local45 = -1;
			local47 = -1;
		} else {
			local43 = 0;
			local45 = arg0;
			local47 = 1;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg3; local61++) {
			@Pc(79) int[] local79;
			@Pc(77) int[] local77;
			@Pc(75) int[] local75;
			if (this.aClass1_Sub5_1.aBoolean552) {
				@Pc(73) int[] local73 = this.aClass1_Sub5_1.method5805(local61);
				local75 = local73;
				local77 = local73;
				local79 = local73;
			} else {
				@Pc(87) int[][] local87 = this.aClass1_Sub5_1.method5811(local61);
				local75 = local87[2];
				local77 = local87[1];
				local79 = local87[0];
			}
			if (arg6) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local43; local105 != local45; local105 += local47) {
				@Pc(113) int local113 = local79[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(131) int local131 = local77[local105] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				@Pc(146) int local146 = local75[local105] >> 4;
				if (local146 > 255) {
					local146 = 255;
				}
				if (local146 < 0) {
					local146 = 0;
				}
				local131 = Static259.anIntArray507[local131];
				local113 = Static259.anIntArray507[local113];
				local146 = Static259.anIntArray507[local146];
				@Pc(179) int local179 = (local113 << 16) - (-(local131 << 8) - local146);
				if (local179 != 0) {
					local179 |= 0xFF000000;
				}
				local39[local59++] = local179;
				if (arg6) {
					local59 += arg0 - 1;
				}
			}
		}
		for (@Pc(222) int local222 = 0; local222 < this.aClass1_Sub5Array36.length; local222++) {
			this.aClass1_Sub5Array36[local222].method5812();
		}
		return local39;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!lm;IZLclient!fh;B)[F")
	public float[] method5155(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Interface2 arg4) {
		Static153.aClass134_72 = arg1;
		Static271.anInterface2_5 = arg4;
		for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub5Array36.length; local16++) {
			this.aClass1_Sub5Array36[local16].method5810(arg2, arg0);
		}
		Static91.method1439(arg2, arg0);
		@Pc(43) float[] local43 = new float[arg2 * 4 * arg0];
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < arg0; local47++) {
			@Pc(63) int[] local63;
			@Pc(71) int[] local71;
			@Pc(67) int[] local67;
			if (this.aClass1_Sub5_1.aBoolean552) {
				@Pc(79) int[] local79 = this.aClass1_Sub5_1.method5805(local47);
				local63 = local79;
				local71 = local79;
				local67 = local79;
			} else {
				@Pc(59) int[][] local59 = this.aClass1_Sub5_1.method5811(local47);
				local63 = local59[0];
				local67 = local59[2];
				local71 = local59[1];
			}
			@Pc(97) int[] local97;
			if (this.aClass1_Sub5_2.aBoolean552) {
				local97 = this.aClass1_Sub5_2.method5805(local47);
			} else {
				local97 = this.aClass1_Sub5_2.method5811(local47)[0];
			}
			@Pc(115) int[] local115;
			if (this.aClass1_Sub5_3.aBoolean552) {
				local115 = this.aClass1_Sub5_3.method5805(local47);
			} else {
				local115 = this.aClass1_Sub5_3.method5811(local47)[0];
			}
			if (arg3) {
				local45 = local47 << 2;
			}
			for (@Pc(137) int local137 = arg2 - 1; local137 >= 0; local137--) {
				@Pc(146) float local146 = (float) local97[local137] / 4096.0F;
				@Pc(159) float local159 = ((float) local115[local137] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local146 < 0.0F) {
					local146 = 0.0F;
				} else if (local146 > 1.0F) {
					local146 = 1.0F;
				}
				local43[local45++] = local159 * (float) local63[local137];
				local43[local45++] = (float) local71[local137] * local159;
				local43[local45++] = (float) local67[local137] * local159;
				local43[local45++] = local146;
				if (arg3) {
					local45 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass1_Sub5Array36.length; local231++) {
			this.aClass1_Sub5Array36[local231].method5812();
		}
		return local43;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!fh;Lclient!lm;I)Z")
	public boolean method5156(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class134 arg1) {
		@Pc(9) int local9;
		if (Static191.anInt3978 <= 0) {
			for (local9 = 0; local9 < this.anIntArray571.length; local9++) {
				if (!arg1.method3005(this.anIntArray571[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray571.length; local9++) {
				if (!arg1.method3011(Static191.anInt3978, this.anIntArray571[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray572.length; local9++) {
			if (!arg0.method952(this.anIntArray572[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!fh;DIZILclient!lm;Z)[I")
	public int[] method5158(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class134 arg4, @OriginalArg(6) boolean arg5) {
		Static153.aClass134_72 = arg4;
		Static271.anInterface2_5 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub5Array36.length; local11++) {
			this.aClass1_Sub5Array36[local11].method5810(arg2, arg3);
		}
		Static259.method4658(arg1);
		Static91.method1439(arg2, arg3);
		@Pc(41) int[] local41 = new int[arg2 * 4 * arg3];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
			@Pc(59) int[] local59;
			@Pc(61) int[] local61;
			@Pc(63) int[] local63;
			@Pc(57) int[] local57;
			if (this.aClass1_Sub5_1.aBoolean552) {
				local57 = this.aClass1_Sub5_1.method5805(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(71) int[][] local71 = this.aClass1_Sub5_1.method5811(local45);
				local61 = local71[1];
				local59 = local71[0];
				local63 = local71[2];
			}
			if (arg5) {
				local43 = local45;
			}
			if (this.aClass1_Sub5_2.aBoolean552) {
				local57 = this.aClass1_Sub5_2.method5805(local45);
			} else {
				local57 = this.aClass1_Sub5_2.method5811(local45)[0];
			}
			for (@Pc(111) int local111 = arg2 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local59[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(136) int local136 = local61[local111] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				@Pc(154) int local154 = local63[local111] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				local119 = Static259.anIntArray507[local119];
				local136 = Static259.anIntArray507[local136];
				if (local154 < 0) {
					local154 = 0;
				}
				local154 = Static259.anIntArray507[local154];
				@Pc(196) int local196;
				if (local119 == 0 && local136 == 0 && local154 == 0) {
					local196 = 0;
				} else {
					local196 = local57[local111] >> 4;
					if (local196 > 255) {
						local196 = 255;
					}
					if (local196 < 0) {
						local196 = 0;
					}
				}
				local41[local43++] = local154 + (local196 << 24) + (local119 << 16) + (local136 << 8);
				if (arg5) {
					local43 += arg2 - 1;
				}
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.aClass1_Sub5Array36.length; local249++) {
			this.aClass1_Sub5Array36[local249].method5812();
		}
		return local41;
	}
}
