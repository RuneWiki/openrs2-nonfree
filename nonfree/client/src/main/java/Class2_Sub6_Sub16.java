import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qja")
public final class Class2_Sub6_Sub16 extends Class2_Sub6 {

	@OriginalMember(owner = "client!qja", name = "y", descriptor = "[I")
	private final int[] anIntArray593;

	@OriginalMember(owner = "client!qja", name = "A", descriptor = "[I")
	private final int[] anIntArray592;

	@OriginalMember(owner = "client!qja", name = "G", descriptor = "Lclient!bw;")
	private final Class2_Sub11 aClass2_Sub11_3;

	@OriginalMember(owner = "client!qja", name = "x", descriptor = "Lclient!bw;")
	private Class2_Sub11 aClass2_Sub11_1;

	@OriginalMember(owner = "client!qja", name = "D", descriptor = "Lclient!bw;")
	private final Class2_Sub11 aClass2_Sub11_2;

	@OriginalMember(owner = "client!qja", name = "B", descriptor = "[Lclient!bw;")
	private final Class2_Sub11[] aClass2_Sub11Array24;

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "()V")
	private Class2_Sub6_Sub16() {
		this.anIntArray593 = new int[0];
		this.anIntArray592 = new int[0];
		this.aClass2_Sub11_3 = new Class2_Sub11_Sub3(0);
		this.aClass2_Sub11_3.anInt10918 = 1;
		this.aClass2_Sub11_1 = new Class2_Sub11_Sub3();
		this.aClass2_Sub11_1.anInt10918 = 1;
		this.aClass2_Sub11_2 = new Class2_Sub11_Sub3();
		this.aClass2_Sub11_2.anInt10918 = 1;
		this.aClass2_Sub11Array24 = new Class2_Sub11[] { this.aClass2_Sub11_1, this.aClass2_Sub11_2, this.aClass2_Sub11_3 };
	}

	@OriginalMember(owner = "client!qja", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class2_Sub6_Sub16(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method8581(-17416);
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass2_Sub11Array24 = new Class2_Sub11[local7];
		@Pc(57) int local57;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub11 local26 = Static239.method3390(arg0);
			if (local26.method9537() >= 0) {
				local9++;
			}
			if (local26.method9529() >= 0) {
				local11++;
			}
			@Pc(50) int local50 = local26.aClass2_Sub11Array42.length;
			local14[local20] = new int[local50];
			for (local57 = 0; local57 < local50; local57++) {
				local14[local20][local57] = arg0.method8581(-17416);
			}
			this.aClass2_Sub11Array24[local20] = local26;
		}
		this.anIntArray593 = new int[local9];
		local9 = 0;
		this.anIntArray592 = new int[local11];
		local11 = 0;
		for (@Pc(100) int local100 = 0; local100 < local7; local100++) {
			@Pc(109) Class2_Sub11 local109 = this.aClass2_Sub11Array24[local100];
			local57 = local109.aClass2_Sub11Array42.length;
			for (@Pc(115) int local115 = 0; local115 < local57; local115++) {
				local109.aClass2_Sub11Array42[local115] = this.aClass2_Sub11Array24[local14[local100][local115]];
			}
			@Pc(139) int local139 = local109.method9537();
			@Pc(143) int local143 = local109.method9529();
			if (local139 > 0) {
				this.anIntArray593[local9++] = local139;
			}
			if (local143 > 0) {
				this.anIntArray592[local11++] = local143;
			}
			local14[local100] = null;
		}
		this.aClass2_Sub11_1 = this.aClass2_Sub11Array24[arg0.method8581(-17416)];
		this.aClass2_Sub11_2 = this.aClass2_Sub11Array24[arg0.method8581(-17416)];
		this.aClass2_Sub11_3 = this.aClass2_Sub11Array24[arg0.method8581(-17416)];
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIZILclient!d;ZDLclient!nca;)[I")
	public int[] method7369(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) double arg5, @OriginalArg(7) Class254 arg6) {
		Static230.aClass254_80 = arg6;
		Static654.anInterface3_11 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub11Array24.length; local11++) {
			this.aClass2_Sub11Array24[local11].method9539(arg2, arg0);
		}
		Static63.method949(arg5);
		Static7.method98(arg2, arg0);
		@Pc(45) int[] local45 = new int[arg0 * arg2];
		@Pc(53) int local53;
		@Pc(51) int local51;
		@Pc(55) byte local55;
		if (arg4) {
			local53 = arg0 - 1;
			local51 = -1;
			local55 = -1;
		} else {
			local51 = arg0;
			local53 = 0;
			local55 = 1;
		}
		@Pc(67) int local67 = 0;
		for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
			if (arg1) {
				local67 = local69;
			}
			@Pc(99) int[] local99;
			@Pc(95) int[] local95;
			@Pc(91) int[] local91;
			if (this.aClass2_Sub11_1.aBoolean936) {
				@Pc(107) int[] local107 = this.aClass2_Sub11_1.method9531(local69);
				local91 = local107;
				local99 = local107;
				local95 = local107;
			} else {
				@Pc(87) int[][] local87 = this.aClass2_Sub11_1.method9533(local69);
				local91 = local87[2];
				local95 = local87[1];
				local99 = local87[0];
			}
			for (@Pc(115) int local115 = local53; local115 != local51; local115 += local55) {
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
				@Pc(153) int local153 = local91[local115] >> 4;
				if (local153 > 255) {
					local153 = 255;
				}
				local123 = Static481.anIntArray549[local123];
				if (local153 < 0) {
					local153 = 0;
				}
				local138 = Static481.anIntArray549[local138];
				local153 = Static481.anIntArray549[local153];
				@Pc(186) int local186 = (local138 << 8) + (local123 << 16) + local153;
				if (local186 != 0) {
					local186 |= 0xFF000000;
				}
				local45[local67++] = local186;
				if (arg1) {
					local67 += arg0 - 1;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass2_Sub11Array24.length; local223++) {
			this.aClass2_Sub11Array24[local223].method9536();
		}
		return local45;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(IZLclient!nca;ZILclient!d;)[F")
	public float[] method7370(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4) {
		Static654.anInterface3_11 = arg4;
		Static230.aClass254_80 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub11Array24.length; local11++) {
			this.aClass2_Sub11Array24[local11].method9539(arg0, arg3);
		}
		Static7.method98(arg0, arg3);
		@Pc(56) float[] local56 = new float[arg0 * arg3 * 4];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < arg0; local60++) {
			@Pc(80) int[] local80;
			@Pc(78) int[] local78;
			@Pc(82) int[] local82;
			if (this.aClass2_Sub11_1.aBoolean936) {
				@Pc(76) int[] local76 = this.aClass2_Sub11_1.method9531(local60);
				local78 = local76;
				local80 = local76;
				local82 = local76;
			} else {
				@Pc(90) int[][] local90 = this.aClass2_Sub11_1.method9533(local60);
				local82 = local90[2];
				local80 = local90[0];
				local78 = local90[1];
			}
			@Pc(114) int[] local114;
			if (this.aClass2_Sub11_2.aBoolean936) {
				local114 = this.aClass2_Sub11_2.method9531(local60);
			} else {
				local114 = this.aClass2_Sub11_2.method9533(local60)[0];
			}
			@Pc(134) int[] local134;
			if (this.aClass2_Sub11_3.aBoolean936) {
				local134 = this.aClass2_Sub11_3.method9531(local60);
			} else {
				local134 = this.aClass2_Sub11_3.method9533(local60)[0];
			}
			if (arg1) {
				local58 = local60 << 2;
			}
			for (@Pc(152) int local152 = arg3 - 1; local152 >= 0; local152--) {
				@Pc(161) float local161 = (float) local114[local152] / 4096.0F;
				if (local161 < 0.0F) {
					local161 = 0.0F;
				} else if (local161 > 1.0F) {
					local161 = 1.0F;
				}
				@Pc(190) float local190 = ((float) local134[local152] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local56[local58++] = (float) local80[local152] * local190;
				local56[local58++] = (float) local78[local152] * local190;
				local56[local58++] = local190 * (float) local82[local152];
				local56[local58++] = local161;
				if (arg1) {
					local58 += (arg3 << 2) - 4;
				}
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.aClass2_Sub11Array24.length; local249++) {
			this.aClass2_Sub11Array24[local249].method9536();
		}
		return local56;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lclient!nca;Lclient!d;I)Z")
	public boolean method7371(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Interface3 arg1) {
		@Pc(9) int local9;
		if (Static446.anInt7236 < 0) {
			for (local9 = 0; local9 < this.anIntArray593.length; local9++) {
				if (!arg0.method6072(this.anIntArray593[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray593.length; local9++) {
				if (!arg0.method6071(Static446.anInt7236, this.anIntArray593[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray592.length; local9++) {
			if (!arg1.method2852(this.anIntArray592[local9])) {
				return false;
			}
		}
		if (7376 != 7376) {
			this.aClass2_Sub11_1 = null;
		}
		return true;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILclient!nca;ZDLclient!d;II)[I")
	public int[] method7372(@OriginalArg(1) Class254 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) double arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static654.anInterface3_11 = arg3;
		Static230.aClass254_80 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub11Array24.length; local11++) {
			this.aClass2_Sub11Array24[local11].method9539(arg5, arg4);
		}
		Static63.method949(arg2);
		if (-4 <= -71) {
			return null;
		}
		Static7.method98(arg5, arg4);
		@Pc(55) int[] local55 = new int[arg5 * arg4];
		@Pc(57) int local57 = 0;
		for (@Pc(59) int local59 = 0; local59 < arg5; local59++) {
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			@Pc(77) int[] local77;
			@Pc(93) int[] local93;
			if (this.aClass2_Sub11_1.aBoolean936) {
				local93 = this.aClass2_Sub11_1.method9531(local59);
				local85 = local93;
				local77 = local93;
				local81 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass2_Sub11_1.method9533(local59);
				local77 = local73[2];
				local81 = local73[1];
				local85 = local73[0];
			}
			if (arg1) {
				local57 = local59;
			}
			if (this.aClass2_Sub11_2.aBoolean936) {
				local93 = this.aClass2_Sub11_2.method9531(local59);
			} else {
				local93 = this.aClass2_Sub11_2.method9533(local59)[0];
			}
			for (@Pc(127) int local127 = arg4 - 1; local127 >= 0; local127--) {
				@Pc(135) int local135 = local85[local127] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(155) int local155 = local81[local127] >> 4;
				if (local155 > 255) {
					local155 = 255;
				}
				if (local155 < 0) {
					local155 = 0;
				}
				@Pc(170) int local170 = local77[local127] >> 4;
				if (local170 > 255) {
					local170 = 255;
				}
				if (local170 < 0) {
					local170 = 0;
				}
				local135 = Static481.anIntArray549[local135];
				local155 = Static481.anIntArray549[local155];
				local170 = Static481.anIntArray549[local170];
				@Pc(219) int local219;
				if (local135 == 0 && local155 == 0 && local170 == 0) {
					local219 = 0;
				} else {
					local219 = local93[local127] >> 4;
					if (local219 > 255) {
						local219 = 255;
					}
					if (local219 < 0) {
						local219 = 0;
					}
				}
				local55[local57++] = local170 + (local155 << 8) + (local219 << 24) + (local135 << 16);
				if (arg1) {
					local57 += arg4 - 1;
				}
			}
		}
		for (@Pc(276) int local276 = 0; local276 < this.aClass2_Sub11Array24.length; local276++) {
			this.aClass2_Sub11Array24[local276].method9536();
		}
		return local55;
	}
}
