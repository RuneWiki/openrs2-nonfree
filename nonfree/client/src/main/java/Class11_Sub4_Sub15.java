import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class11_Sub4_Sub15 extends Class11_Sub4 {

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "[I")
	private final int[] anIntArray387;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "[I")
	private final int[] anIntArray386;

	@OriginalMember(owner = "client!pp", name = "P", descriptor = "Lclient!n;")
	private final Class11_Sub2 aClass11_Sub2_3;

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "Lclient!n;")
	private final Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "Lclient!n;")
	private final Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "[Lclient!n;")
	private final Class11_Sub2[] aClass11_Sub2Array32;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	private Class11_Sub4_Sub15() {
		this.anIntArray387 = new int[0];
		this.anIntArray386 = new int[0];
		this.aClass11_Sub2_3 = new Class11_Sub2_Sub3(0);
		this.aClass11_Sub2_3.anInt6765 = 1;
		this.aClass11_Sub2_1 = new Class11_Sub2_Sub3();
		this.aClass11_Sub2_1.anInt6765 = 1;
		this.aClass11_Sub2_2 = new Class11_Sub2_Sub3();
		this.aClass11_Sub2_2.anInt6765 = 1;
		this.aClass11_Sub2Array32 = new Class11_Sub2[] { this.aClass11_Sub2_1, this.aClass11_Sub2_2, this.aClass11_Sub2_3 };
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class11_Sub4_Sub15(@OriginalArg(0) Class11_Sub25 arg0) {
		@Pc(7) int local7 = arg0.method5185();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass11_Sub2Array32 = new Class11_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class11_Sub2 local26 = Static108.method1652(arg0);
			if (local26.method5706() >= 0) {
				local9++;
			}
			if (local26.method5714() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass11_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method5185();
			}
			this.aClass11_Sub2Array32[local20] = local26;
		}
		this.anIntArray386 = new int[local9];
		local9 = 0;
		this.anIntArray387 = new int[local11];
		local11 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class11_Sub2 local94 = this.aClass11_Sub2Array32[local87];
			local50 = local94.aClass11_Sub2Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass11_Sub2Array42[local100] = this.aClass11_Sub2Array32[local18[local87][local100]];
			}
			@Pc(126) int local126 = local94.method5706();
			@Pc(130) int local130 = local94.method5714();
			if (local126 > 0) {
				this.anIntArray386[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray387[local11++] = local130;
			}
			local18[local87] = null;
		}
		this.aClass11_Sub2_1 = this.aClass11_Sub2Array32[arg0.method5185()];
		this.aClass11_Sub2_2 = this.aClass11_Sub2Array32[arg0.method5185()];
		this.aClass11_Sub2_3 = this.aClass11_Sub2Array32[arg0.method5185()];
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!nq;Lclient!ja;ZII)[F")
	public float[] method4328(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		Static202.anInterface2_5 = arg2;
		Static252.aClass144_96 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass11_Sub2Array32.length; local11++) {
			this.aClass11_Sub2Array32[local11].method5712(arg4, arg0);
		}
		Static243.method5702(arg0, arg4);
		@Pc(42) float[] local42 = new float[arg4 * arg0 * 4];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg4; local46++) {
			@Pc(64) int[] local64;
			@Pc(62) int[] local62;
			@Pc(60) int[] local60;
			if (this.aClass11_Sub2_1.aBoolean427) {
				@Pc(58) int[] local58 = this.aClass11_Sub2_1.method5716(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass11_Sub2_1.method5709(local46);
				local60 = local72[2];
				local64 = local72[0];
				local62 = local72[1];
			}
			@Pc(94) int[] local94;
			if (this.aClass11_Sub2_2.aBoolean427) {
				local94 = this.aClass11_Sub2_2.method5716(local46);
			} else {
				local94 = this.aClass11_Sub2_2.method5709(local46)[0];
			}
			if (arg3) {
				local44 = local46 << 2;
			}
			@Pc(124) int[] local124;
			if (this.aClass11_Sub2_3.aBoolean427) {
				local124 = this.aClass11_Sub2_3.method5716(local46);
			} else {
				local124 = this.aClass11_Sub2_3.method5709(local46)[0];
			}
			for (@Pc(136) int local136 = arg0 - 1; local136 >= 0; local136--) {
				@Pc(145) float local145 = (float) local94[local136] / 4096.0F;
				@Pc(158) float local158 = ((float) local124[local136] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local145 < 0.0F) {
					local145 = 0.0F;
				} else if (local145 > 1.0F) {
					local145 = 1.0F;
				}
				local42[local44++] = (float) local64[local136] * local158;
				local42[local44++] = local158 * (float) local62[local136];
				local42[local44++] = local158 * (float) local60[local136];
				local42[local44++] = local145;
				if (arg3) {
					local44 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.aClass11_Sub2Array32.length; local229++) {
			this.aClass11_Sub2Array32[local229].method5707();
		}
		return local42;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!nq;IZIDLclient!ja;)[I")
	public int[] method4330(@OriginalArg(1) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) double arg4, @OriginalArg(6) Interface2 arg5) {
		Static252.aClass144_96 = arg0;
		Static202.anInterface2_5 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass11_Sub2Array32.length; local11++) {
			this.aClass11_Sub2Array32[local11].method5712(arg3, arg1);
		}
		Static313.method5270(arg4);
		Static243.method5702(arg1, arg3);
		@Pc(41) int[] local41 = new int[arg3 * arg1 * 4];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
			@Pc(61) int[] local61;
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			@Pc(81) int[] local81;
			if (this.aClass11_Sub2_1.aBoolean427) {
				local81 = this.aClass11_Sub2_1.method5716(local45);
				local65 = local81;
				local69 = local81;
				local61 = local81;
			} else {
				@Pc(57) int[][] local57 = this.aClass11_Sub2_1.method5709(local45);
				local61 = local57[0];
				local65 = local57[1];
				local69 = local57[2];
			}
			if (this.aClass11_Sub2_2.aBoolean427) {
				local81 = this.aClass11_Sub2_2.method5716(local45);
			} else {
				local81 = this.aClass11_Sub2_2.method5709(local45)[0];
			}
			if (arg2) {
				local43 = local45;
			}
			for (@Pc(115) int local115 = arg1 - 1; local115 >= 0; local115--) {
				@Pc(123) int local123 = local61[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local123 < 0) {
					local123 = 0;
				}
				@Pc(143) int local143 = local65[local115] >> 4;
				if (local143 > 255) {
					local143 = 255;
				}
				if (local143 < 0) {
					local143 = 0;
				}
				@Pc(160) int local160 = local69[local115] >> 4;
				if (local160 > 255) {
					local160 = 255;
				}
				local123 = Static212.anIntArray336[local123];
				local143 = Static212.anIntArray336[local143];
				if (local160 < 0) {
					local160 = 0;
				}
				local160 = Static212.anIntArray336[local160];
				@Pc(197) int local197;
				if (local123 == 0 && local143 == 0 && local160 == 0) {
					local197 = 0;
				} else {
					local197 = local81[local115] >> 4;
					if (local197 > 255) {
						local197 = 255;
					}
					if (local197 < 0) {
						local197 = 0;
					}
				}
				local41[local43++] = (local123 << 16) + (local197 << 24) + (local143 << 8) + local160;
				if (arg2) {
					local43 += arg1 - 1;
				}
			}
		}
		for (@Pc(258) int local258 = 0; local258 < this.aClass11_Sub2Array32.length; local258++) {
			this.aClass11_Sub2Array32[local258].method5707();
		}
		return local41;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZILclient!nq;DLclient!ja;BIZ)[I")
	public int[] method4332(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class144 arg2, @OriginalArg(3) double arg3, @OriginalArg(4) Interface2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static252.aClass144_96 = arg2;
		Static202.anInterface2_5 = arg4;
		for (@Pc(16) int local16 = 0; local16 < this.aClass11_Sub2Array32.length; local16++) {
			this.aClass11_Sub2Array32[local16].method5712(arg5, arg1);
		}
		Static313.method5270(arg3);
		Static243.method5702(arg1, arg5);
		@Pc(50) int[] local50 = new int[arg1 * arg5];
		@Pc(60) int local60;
		@Pc(56) int local56;
		@Pc(54) byte local54;
		if (arg0) {
			local54 = -1;
			local56 = -1;
			local60 = arg1 - 1;
		} else {
			local56 = arg1;
			local54 = 1;
			local60 = 0;
		}
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < arg5; local72++) {
			@Pc(88) int[] local88;
			@Pc(96) int[] local96;
			@Pc(92) int[] local92;
			if (this.aClass11_Sub2_1.aBoolean427) {
				@Pc(104) int[] local104 = this.aClass11_Sub2_1.method5716(local72);
				local96 = local104;
				local92 = local104;
				local88 = local104;
			} else {
				@Pc(84) int[][] local84 = this.aClass11_Sub2_1.method5709(local72);
				local88 = local84[0];
				local92 = local84[2];
				local96 = local84[1];
			}
			if (arg6) {
				local70 = local72;
			}
			for (@Pc(116) int local116 = local60; local116 != local56; local116 += local54) {
				@Pc(124) int local124 = local88[local116] >> 4;
				if (local124 > 255) {
					local124 = 255;
				}
				if (local124 < 0) {
					local124 = 0;
				}
				@Pc(144) int local144 = local96[local116] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(161) int local161 = local92[local116] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local144 = Static212.anIntArray336[local144];
				if (local161 < 0) {
					local161 = 0;
				}
				local124 = Static212.anIntArray336[local124];
				local161 = Static212.anIntArray336[local161];
				@Pc(198) int local198 = (local124 << 16) + (local144 << 8) + local161;
				if (local198 != 0) {
					local198 |= 0xFF000000;
				}
				local50[local70++] = local198;
				if (arg6) {
					local70 += arg1 - 1;
				}
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.aClass11_Sub2Array32.length; local237++) {
			this.aClass11_Sub2Array32[local237].method5707();
		}
		return local50;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!ja;Lclient!nq;I)Z")
	public boolean method4333(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class144 arg1) {
		@Pc(9) int local9;
		if (Static99.anInt822 > 0) {
			for (local9 = 0; local9 < this.anIntArray386.length; local9++) {
				if (!arg1.method3916(Static99.anInt822, this.anIntArray386[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray386.length; local9++) {
				if (!arg1.method3910(this.anIntArray386[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray387.length; local9++) {
			if (!arg0.method2246(this.anIntArray387[local9])) {
				return false;
			}
		}
		return true;
	}
}
