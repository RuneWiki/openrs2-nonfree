import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class6_Sub5_Sub6 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "[I")
	private final int[] anIntArray300;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "[I")
	private final int[] anIntArray299;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "Lclient!eca;")
	private final Class6_Sub3 aClass6_Sub3_1;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "Lclient!eca;")
	private final Class6_Sub3 aClass6_Sub3_2;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "Lclient!eca;")
	private final Class6_Sub3 aClass6_Sub3_3;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "[Lclient!eca;")
	private final Class6_Sub3[] aClass6_Sub3Array19;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	private Class6_Sub5_Sub6() {
		this.anIntArray300 = new int[0];
		this.anIntArray299 = new int[0];
		this.aClass6_Sub3_1 = new Class6_Sub3_Sub22(0);
		this.aClass6_Sub3_1.anInt9975 = 1;
		this.aClass6_Sub3_2 = new Class6_Sub3_Sub22();
		this.aClass6_Sub3_2.anInt9975 = 1;
		this.aClass6_Sub3_3 = new Class6_Sub3_Sub22();
		this.aClass6_Sub3_3.anInt9975 = 1;
		this.aClass6_Sub3Array19 = new Class6_Sub3[] { this.aClass6_Sub3_2, this.aClass6_Sub3_3, this.aClass6_Sub3_1 };
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!jr;)V")
	public Class6_Sub5_Sub6(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method6019();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub3Array19 = new Class6_Sub3[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub3 local26 = Static550.method7687(arg0);
			if (local26.method7951() >= 0) {
				local9++;
			}
			if (local26.method7952() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub3Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method6019();
			}
			this.aClass6_Sub3Array19[local20] = local26;
		}
		this.anIntArray300 = new int[local9];
		this.anIntArray299 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class6_Sub3 local102 = this.aClass6_Sub3Array19[local95];
			local50 = local102.aClass6_Sub3Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass6_Sub3Array42[local108] = this.aClass6_Sub3Array19[local14[local95][local108]];
			}
			@Pc(134) int local134 = local102.method7951();
			@Pc(138) int local138 = local102.method7952();
			if (local134 > 0) {
				this.anIntArray300[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray299[local11++] = local138;
			}
			local14[local95] = null;
		}
		this.aClass6_Sub3_2 = this.aClass6_Sub3Array19[arg0.method6019()];
		this.aClass6_Sub3_3 = this.aClass6_Sub3Array19[arg0.method6019()];
		this.aClass6_Sub3_1 = this.aClass6_Sub3Array19[arg0.method6019()];
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!pj;Lclient!e;B)Z")
	public boolean method2995(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Interface2 arg1) {
		@Pc(12) int local12;
		if (Static10.anInt133 >= 0) {
			for (local12 = 0; local12 < this.anIntArray300.length; local12++) {
				if (!arg0.method5788(this.anIntArray300[local12], Static10.anInt133)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray300.length; local12++) {
				if (!arg0.method5804(this.anIntArray300[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray299.length; local12++) {
			if (!arg1.method3089(this.anIntArray299[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BZDIILclient!pj;ZLclient!e;)[I")
	public int[] method2996(@OriginalArg(1) boolean arg0, @OriginalArg(2) double arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class248 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Interface2 arg6) {
		Static334.aClass248_55 = arg4;
		Static55.anInterface2_1 = arg6;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub3Array19.length; local11++) {
			this.aClass6_Sub3Array19[local11].method7956(arg2, arg3);
		}
		Static540.method7128(arg1);
		Static171.method7158(arg2, arg3);
		@Pc(41) int[] local41 = new int[arg2 * arg3];
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(61) byte local61;
		if (arg0) {
			local63 = -1;
			local61 = -1;
			local59 = arg2 - 1;
		} else {
			local59 = 0;
			local61 = 1;
			local63 = arg2;
		}
		@Pc(75) int local75 = 0;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			@Pc(93) int[] local93;
			@Pc(95) int[] local95;
			@Pc(91) int[] local91;
			if (this.aClass6_Sub3_2.aBoolean674) {
				@Pc(89) int[] local89 = this.aClass6_Sub3_2.method7954(local77);
				local91 = local89;
				local93 = local89;
				local95 = local89;
			} else {
				@Pc(103) int[][] local103 = this.aClass6_Sub3_2.method7959(local77);
				local91 = local103[2];
				local95 = local103[1];
				local93 = local103[0];
			}
			if (arg5) {
				local75 = local77;
			}
			for (@Pc(121) int local121 = local59; local121 != local63; local121 += local61) {
				@Pc(129) int local129 = local93[local121] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				@Pc(144) int local144 = local95[local121] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(164) int local164 = local91[local121] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				local144 = Static248.anIntArray375[local144];
				local129 = Static248.anIntArray375[local129];
				if (local164 < 0) {
					local164 = 0;
				}
				local164 = Static248.anIntArray375[local164];
				@Pc(196) int local196 = (local129 << 16) + (local144 << 8) + local164;
				if (local196 != 0) {
					local196 |= 0xFF000000;
				}
				local41[local75++] = local196;
				if (arg5) {
					local75 += arg2 - 1;
				}
			}
		}
		for (@Pc(239) int local239 = 0; local239 < this.aClass6_Sub3Array19.length; local239++) {
			this.aClass6_Sub3Array19[local239].method7953();
		}
		return local41;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!e;ZILclient!pj;IDI)[I")
	public int[] method2998(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class248 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) double arg5) {
		Static55.anInterface2_1 = arg0;
		Static334.aClass248_55 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub3Array19.length; local11++) {
			this.aClass6_Sub3Array19[local11].method7956(arg2, arg4);
		}
		Static540.method7128(arg5);
		Static171.method7158(arg2, arg4);
		@Pc(45) int[] local45 = new int[arg2 * arg4 * 4];
		@Pc(47) int local47 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg4; local55++) {
			@Pc(73) int[] local73;
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			@Pc(91) int[] local91;
			if (this.aClass6_Sub3_2.aBoolean674) {
				local91 = this.aClass6_Sub3_2.method7954(local55);
				local73 = local91;
				local81 = local91;
				local77 = local91;
			} else {
				@Pc(69) int[][] local69 = this.aClass6_Sub3_2.method7959(local55);
				local73 = local69[0];
				local77 = local69[1];
				local81 = local69[2];
			}
			if (this.aClass6_Sub3_3.aBoolean674) {
				local91 = this.aClass6_Sub3_3.method7954(local55);
			} else {
				local91 = this.aClass6_Sub3_3.method7959(local55)[0];
			}
			if (arg1) {
				local47 = local55;
			}
			for (@Pc(127) int local127 = arg2 - 1; local127 >= 0; local127--) {
				@Pc(135) int local135 = local73[local127] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(153) int local153 = local77[local127] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				if (local153 < 0) {
					local153 = 0;
				}
				@Pc(173) int local173 = local81[local127] >> 4;
				if (local173 > 255) {
					local173 = 255;
				}
				local153 = Static248.anIntArray375[local153];
				local135 = Static248.anIntArray375[local135];
				if (local173 < 0) {
					local173 = 0;
				}
				local173 = Static248.anIntArray375[local173];
				@Pc(217) int local217;
				if (local135 == 0 && local153 == 0 && local173 == 0) {
					local217 = 0;
				} else {
					local217 = local91[local127] >> 4;
					if (local217 > 255) {
						local217 = 255;
					}
					if (local217 < 0) {
						local217 = 0;
					}
				}
				local45[local47++] = local173 + (local217 << 24) + (local135 << 16) + (local153 << 8);
				if (arg1) {
					local47 += arg2 - 1;
				}
			}
		}
		for (@Pc(272) int local272 = 0; local272 < this.aClass6_Sub3Array19.length; local272++) {
			this.aClass6_Sub3Array19[local272].method7953();
		}
		return local45;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZLclient!e;Lclient!pj;I)[F")
	public float[] method3000(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Class248 arg3, @OriginalArg(5) int arg4) {
		Static55.anInterface2_1 = arg2;
		Static334.aClass248_55 = arg3;
		for (@Pc(19) int local19 = 0; local19 < this.aClass6_Sub3Array19.length; local19++) {
			this.aClass6_Sub3Array19[local19].method7956(arg0, arg4);
		}
		Static171.method7158(arg0, arg4);
		@Pc(50) float[] local50 = new float[arg0 * arg4 * 4];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg4; local54++) {
			@Pc(72) int[] local72;
			@Pc(70) int[] local70;
			@Pc(68) int[] local68;
			if (this.aClass6_Sub3_2.aBoolean674) {
				@Pc(66) int[] local66 = this.aClass6_Sub3_2.method7954(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass6_Sub3_2.method7959(local54);
				local72 = local80[0];
				local68 = local80[2];
				local70 = local80[1];
			}
			@Pc(104) int[] local104;
			if (this.aClass6_Sub3_3.aBoolean674) {
				local104 = this.aClass6_Sub3_3.method7954(local54);
			} else {
				local104 = this.aClass6_Sub3_3.method7959(local54)[0];
			}
			@Pc(122) int[] local122;
			if (this.aClass6_Sub3_1.aBoolean674) {
				local122 = this.aClass6_Sub3_1.method7954(local54);
			} else {
				local122 = this.aClass6_Sub3_1.method7959(local54)[0];
			}
			if (arg1) {
				local52 = local54 << 2;
			}
			for (@Pc(142) int local142 = arg0 - 1; local142 >= 0; local142--) {
				@Pc(151) float local151 = (float) local104[local142] / 4096.0F;
				@Pc(164) float local164 = ((float) local122[local142] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local151 < 0.0F) {
					local151 = 0.0F;
				} else if (local151 > 1.0F) {
					local151 = 1.0F;
				}
				local50[local52++] = (float) local72[local142] * local164;
				local50[local52++] = local164 * (float) local70[local142];
				local50[local52++] = (float) local68[local142] * local164;
				local50[local52++] = local151;
				if (arg1) {
					local52 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass6_Sub3Array19.length; local236++) {
			this.aClass6_Sub3Array19[local236].method7953();
		}
		return local50;
	}
}
