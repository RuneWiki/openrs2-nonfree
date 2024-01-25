import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class6_Sub1_Sub13 extends Class6_Sub1 {

	@OriginalMember(owner = "client!of", name = "I", descriptor = "[I")
	private final int[] anIntArray538;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "[I")
	private final int[] anIntArray537;

	@OriginalMember(owner = "client!of", name = "E", descriptor = "Lclient!vm;")
	private final Class6_Sub3 aClass6_Sub3_2;

	@OriginalMember(owner = "client!of", name = "B", descriptor = "Lclient!vm;")
	private final Class6_Sub3 aClass6_Sub3_1;

	@OriginalMember(owner = "client!of", name = "H", descriptor = "Lclient!vm;")
	private final Class6_Sub3 aClass6_Sub3_3;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "[Lclient!vm;")
	private final Class6_Sub3[] aClass6_Sub3Array28;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	private Class6_Sub1_Sub13() {
		this.anIntArray538 = new int[0];
		this.anIntArray537 = new int[0];
		this.aClass6_Sub3_2 = new Class6_Sub3_Sub31(0);
		this.aClass6_Sub3_2.anInt9586 = 1;
		this.aClass6_Sub3_1 = new Class6_Sub3_Sub31();
		this.aClass6_Sub3_1.anInt9586 = 1;
		this.aClass6_Sub3_3 = new Class6_Sub3_Sub31();
		this.aClass6_Sub3Array28 = new Class6_Sub3[] { this.aClass6_Sub3_1, this.aClass6_Sub3_3, this.aClass6_Sub3_2 };
		this.aClass6_Sub3_3.anInt9586 = 1;
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!dga;)V")
	public Class6_Sub1_Sub13(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method6041();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass6_Sub3Array28 = new Class6_Sub3[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class6_Sub3 local26 = Static74.method972(arg0);
			if (local26.method7829() >= 0) {
				local9++;
			}
			if (local26.method7825() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass6_Sub3Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method6041();
			}
			this.aClass6_Sub3Array28[local20] = local26;
		}
		this.anIntArray537 = new int[local9];
		local9 = 0;
		this.anIntArray538 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class6_Sub3 local102 = this.aClass6_Sub3Array28[local95];
			local50 = local102.aClass6_Sub3Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass6_Sub3Array42[local108] = this.aClass6_Sub3Array28[local14[local95][local108]];
			}
			@Pc(134) int local134 = local102.method7829();
			@Pc(138) int local138 = local102.method7825();
			if (local134 > 0) {
				this.anIntArray537[local9++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray538[local11++] = local138;
			}
			local14[local95] = null;
		}
		this.aClass6_Sub3_1 = this.aClass6_Sub3Array28[arg0.method6041()];
		this.aClass6_Sub3_3 = this.aClass6_Sub3Array28[arg0.method6041()];
		this.aClass6_Sub3_2 = this.aClass6_Sub3Array28[arg0.method6041()];
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!e;ILclient!pq;ZII)[F")
	public float[] method5315(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		Static88.aClass251_27 = arg2;
		Static236.anInterface7_7 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub3Array28.length; local11++) {
			this.aClass6_Sub3Array28[local11].method7827(arg1, arg4);
		}
		Static261.method3651(arg4, arg1);
		@Pc(42) float[] local42 = new float[arg4 * arg1 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(59) int local59 = 0; local59 < arg1; local59++) {
			@Pc(79) int[] local79;
			@Pc(83) int[] local83;
			@Pc(75) int[] local75;
			if (this.aClass6_Sub3_1.aBoolean668) {
				@Pc(91) int[] local91 = this.aClass6_Sub3_1.method7828(local59);
				local79 = local91;
				local83 = local91;
				local75 = local91;
			} else {
				@Pc(71) int[][] local71 = this.aClass6_Sub3_1.method7822(local59);
				local75 = local71[2];
				local79 = local71[0];
				local83 = local71[1];
			}
			@Pc(109) int[] local109;
			if (this.aClass6_Sub3_3.aBoolean668) {
				local109 = this.aClass6_Sub3_3.method7828(local59);
			} else {
				local109 = this.aClass6_Sub3_3.method7822(local59)[0];
			}
			@Pc(127) int[] local127;
			if (this.aClass6_Sub3_2.aBoolean668) {
				local127 = this.aClass6_Sub3_2.method7828(local59);
			} else {
				local127 = this.aClass6_Sub3_2.method7822(local59)[0];
			}
			if (arg3) {
				local44 = local59 << 2;
			}
			for (@Pc(147) int local147 = arg4 - 1; local147 >= 0; local147--) {
				@Pc(156) float local156 = (float) local109[local147] / 4096.0F;
				@Pc(169) float local169 = ((float) local127[local147] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local156 < 0.0F) {
					local156 = 0.0F;
				} else if (local156 > 1.0F) {
					local156 = 1.0F;
				}
				local42[local44++] = (float) local79[local147] * local169;
				local42[local44++] = (float) local83[local147] * local169;
				local42[local44++] = local169 * (float) local75[local147];
				local42[local44++] = local156;
				if (arg3) {
					local44 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass6_Sub3Array28.length; local237++) {
			this.aClass6_Sub3Array28[local237].method7830();
		}
		return local42;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!pq;Lclient!e;)Z")
	public boolean method5317(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Interface7 arg1) {
		@Pc(12) int local12;
		if (Static62.anInt1000 >= 0) {
			for (local12 = 0; local12 < this.anIntArray537.length; local12++) {
				if (!arg0.method5854(Static62.anInt1000, this.anIntArray537[local12])) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray537.length; local12++) {
				if (!arg0.method5859(this.anIntArray537[local12])) {
					return false;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anIntArray538.length; local71++) {
			if (!arg1.method5207(this.anIntArray538[local71])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZDLclient!e;ILclient!pq;I)[I")
	public int[] method5320(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) double arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(5) Class251 arg4, @OriginalArg(6) int arg5) {
		Static88.aClass251_27 = arg4;
		Static236.anInterface7_7 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub3Array28.length; local11++) {
			this.aClass6_Sub3Array28[local11].method7827(arg5, arg0);
		}
		Static483.method6707(arg2);
		Static261.method3651(arg0, arg5);
		@Pc(50) int[] local50 = new int[arg0 * 4 * arg5];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg5; local54++) {
			@Pc(70) int[] local70;
			@Pc(68) int[] local68;
			@Pc(72) int[] local72;
			@Pc(66) int[] local66;
			if (this.aClass6_Sub3_1.aBoolean668) {
				local66 = this.aClass6_Sub3_1.method7828(local54);
				local68 = local66;
				local70 = local66;
				local72 = local66;
			} else {
				@Pc(80) int[][] local80 = this.aClass6_Sub3_1.method7822(local54);
				local68 = local80[1];
				local70 = local80[0];
				local72 = local80[2];
			}
			if (this.aClass6_Sub3_3.aBoolean668) {
				local66 = this.aClass6_Sub3_3.method7828(local54);
			} else {
				local66 = this.aClass6_Sub3_3.method7822(local54)[0];
			}
			if (arg1) {
				local52 = local54;
			}
			for (@Pc(120) int local120 = arg0 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local70[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(143) int local143 = local68[local120] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(163) int local163 = local72[local120] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				local143 = Static299.anIntArray459[local143];
				local128 = Static299.anIntArray459[local128];
				if (local163 < 0) {
					local163 = 0;
				}
				local163 = Static299.anIntArray459[local163];
				@Pc(202) int local202;
				if (local128 == 0 && local143 == 0 && local163 == 0) {
					local202 = 0;
				} else {
					local202 = local66[local120] >> 4;
					if (local202 > 255) {
						local202 = 255;
					}
					if (local202 < 0) {
						local202 = 0;
					}
				}
				local50[local52++] = (local128 << 16) + (local202 << 24) + (local143 << 8) + local163;
				if (arg1) {
					local52 += arg0 - 1;
				}
			}
		}
		for (@Pc(255) int local255 = 0; local255 < this.aClass6_Sub3Array28.length; local255++) {
			this.aClass6_Sub3Array28[local255].method7830();
		}
		return local50;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILclient!e;IDILclient!pq;Z)[I")
	public int[] method5321(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class251 arg5, @OriginalArg(7) boolean arg6) {
		Static236.anInterface7_7 = arg2;
		Static88.aClass251_27 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass6_Sub3Array28.length; local11++) {
			this.aClass6_Sub3Array28[local11].method7827(arg1, arg4);
		}
		Static483.method6707(arg3);
		Static261.method3651(arg4, arg1);
		@Pc(45) int[] local45 = new int[arg4 * arg1];
		@Pc(53) int local53;
		@Pc(49) int local49;
		@Pc(55) byte local55;
		if (arg0) {
			local49 = -1;
			local53 = arg4 - 1;
			local55 = -1;
		} else {
			local49 = arg4;
			local53 = 0;
			local55 = 1;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg1; local67++) {
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			@Pc(83) int[] local83;
			if (this.aClass6_Sub3_1.aBoolean668) {
				@Pc(79) int[] local79 = this.aClass6_Sub3_1.method7828(local67);
				local81 = local79;
				local83 = local79;
				local85 = local79;
			} else {
				@Pc(93) int[][] local93 = this.aClass6_Sub3_1.method7822(local67);
				local83 = local93[2];
				local81 = local93[0];
				local85 = local93[1];
			}
			if (arg6) {
				local65 = local67;
			}
			for (@Pc(111) int local111 = local53; local111 != local49; local111 += local55) {
				@Pc(119) int local119 = local81[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(137) int local137 = local85[local111] >> 4;
				if (local137 > 255) {
					local137 = 255;
				}
				if (local137 < 0) {
					local137 = 0;
				}
				@Pc(154) int local154 = local83[local111] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				local119 = Static299.anIntArray459[local119];
				local137 = Static299.anIntArray459[local137];
				if (local154 < 0) {
					local154 = 0;
				}
				local154 = Static299.anIntArray459[local154];
				@Pc(186) int local186 = local154 + (local119 << 16) + (local137 << 8);
				if (local186 != 0) {
					local186 |= 0xFF000000;
				}
				local45[local65++] = local186;
				if (arg6) {
					local65 += arg4 - 1;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass6_Sub3Array28.length; local229++) {
			this.aClass6_Sub3Array28[local229].method7830();
		}
		return local45;
	}
}
