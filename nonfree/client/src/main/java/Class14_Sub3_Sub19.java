import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class14_Sub3_Sub19 extends Class14_Sub3 {

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "[I")
	private final int[] anIntArray768;

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "[I")
	private final int[] anIntArray769;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "Lclient!tv;")
	private final Class14_Sub1 aClass14_Sub1_3;

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Lclient!tv;")
	private final Class14_Sub1 aClass14_Sub1_2;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Lclient!tv;")
	private final Class14_Sub1 aClass14_Sub1_1;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "[Lclient!tv;")
	private final Class14_Sub1[] aClass14_Sub1Array39;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	private Class14_Sub3_Sub19() {
		this.anIntArray768 = new int[0];
		this.anIntArray769 = new int[0];
		this.aClass14_Sub1_3 = new Class14_Sub1_Sub16(0);
		this.aClass14_Sub1_3.anInt10667 = 1;
		this.aClass14_Sub1_2 = new Class14_Sub1_Sub16();
		this.aClass14_Sub1_2.anInt10667 = 1;
		this.aClass14_Sub1_1 = new Class14_Sub1_Sub16();
		this.aClass14_Sub1Array39 = new Class14_Sub1[] { this.aClass14_Sub1_2, this.aClass14_Sub1_1, this.aClass14_Sub1_3 };
		this.aClass14_Sub1_1.anInt10667 = 1;
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class14_Sub3_Sub19(@OriginalArg(0) Class14_Sub29 arg0) {
		@Pc(7) int local7 = arg0.method5866();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass14_Sub1Array39 = new Class14_Sub1[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class14_Sub1 local26 = Static631.method8824(arg0);
			if (local26.method8900() >= 0) {
				local9++;
			}
			if (local26.method8902() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass14_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method5866();
			}
			this.aClass14_Sub1Array39[local20] = local26;
		}
		this.anIntArray769 = new int[local9];
		local9 = 0;
		this.anIntArray768 = new int[local11];
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class14_Sub1 local98 = this.aClass14_Sub1Array39[local91];
			local50 = local98.aClass14_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass14_Sub1Array42[local104] = this.aClass14_Sub1Array39[local18[local91][local104]];
			}
			@Pc(126) int local126 = local98.method8900();
			@Pc(130) int local130 = local98.method8902();
			if (local126 > 0) {
				this.anIntArray769[local9++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray768[local11++] = local130;
			}
			local18[local91] = null;
		}
		this.aClass14_Sub1_2 = this.aClass14_Sub1Array39[arg0.method5866()];
		this.aClass14_Sub1_1 = this.aClass14_Sub1Array39[arg0.method5866()];
		this.aClass14_Sub1_3 = this.aClass14_Sub1Array39[arg0.method5866()];
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!d;ILclient!wia;)Z")
	public boolean method8733(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class386 arg1) {
		@Pc(9) int local9;
		if (Static161.anInt3180 >= 0) {
			for (local9 = 0; local9 < this.anIntArray769.length; local9++) {
				if (!arg1.method9216(Static161.anInt3180, this.anIntArray769[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray769.length; local9++) {
				if (!arg1.method9206(this.anIntArray769[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray768.length; local9++) {
			if (!arg0.method6181(this.anIntArray768[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!wia;DZILclient!d;IZB)[I")
	public int[] method8735(@OriginalArg(0) Class386 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		Static189.anInterface3_2 = arg4;
		Static436.aClass386_97 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub1Array39.length; local11++) {
			this.aClass14_Sub1Array39[local11].method8896(arg3, arg5);
		}
		Static238.method3567(arg1);
		Static558.method7838(arg5, arg3);
		@Pc(43) int[] local43 = new int[arg3 * arg5];
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(47) byte local47;
		if (arg6) {
			local47 = -1;
			local51 = arg3 - 1;
			local53 = -1;
		} else {
			local47 = 1;
			local51 = 0;
			local53 = arg3;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg5; local65++) {
			if (arg2) {
				local63 = local65;
			}
			@Pc(89) int[] local89;
			@Pc(93) int[] local93;
			@Pc(85) int[] local85;
			if (this.aClass14_Sub1_2.aBoolean734) {
				@Pc(101) int[] local101 = this.aClass14_Sub1_2.method8898(local65);
				local89 = local101;
				local85 = local101;
				local93 = local101;
			} else {
				@Pc(81) int[][] local81 = this.aClass14_Sub1_2.method8905(local65);
				local85 = local81[2];
				local89 = local81[0];
				local93 = local81[1];
			}
			for (@Pc(109) int local109 = local51; local109 != local53; local109 += local47) {
				@Pc(117) int local117 = local89[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(134) int local134 = local93[local109] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(154) int local154 = local85[local109] >> 4;
				if (local154 > 255) {
					local154 = 255;
				}
				local117 = Static569.anIntArray709[local117];
				local134 = Static569.anIntArray709[local134];
				if (local154 < 0) {
					local154 = 0;
				}
				local154 = Static569.anIntArray709[local154];
				@Pc(190) int local190 = (local117 << 16) + (local134 << 8) + local154;
				if (local190 != 0) {
					local190 |= 0xFF000000;
				}
				local43[local63++] = local190;
				if (arg2) {
					local63 += arg3 - 1;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass14_Sub1Array39.length; local235++) {
			this.aClass14_Sub1Array39[local235].method8895();
		}
		return local43;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZIDILclient!d;ZLclient!wia;)[I")
	public int[] method8736(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface3 arg4, @OriginalArg(6) Class386 arg5) {
		Static436.aClass386_97 = arg5;
		Static189.anInterface3_2 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub1Array39.length; local11++) {
			this.aClass14_Sub1Array39[local11].method8896(arg3, arg1);
		}
		Static238.method3567(arg2);
		Static558.method7838(arg1, arg3);
		@Pc(48) int[] local48 = new int[arg1 * arg3];
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < arg1; local52++) {
			@Pc(68) int[] local68;
			@Pc(66) int[] local66;
			@Pc(70) int[] local70;
			@Pc(64) int[] local64;
			if (this.aClass14_Sub1_2.aBoolean734) {
				local64 = this.aClass14_Sub1_2.method8898(local52);
				local66 = local64;
				local68 = local64;
				local70 = local64;
			} else {
				@Pc(78) int[][] local78 = this.aClass14_Sub1_2.method8905(local52);
				local68 = local78[0];
				local70 = local78[2];
				local66 = local78[1];
			}
			if (this.aClass14_Sub1_1.aBoolean734) {
				local64 = this.aClass14_Sub1_1.method8898(local52);
			} else {
				local64 = this.aClass14_Sub1_1.method8905(local52)[0];
			}
			if (arg0) {
				local50 = local52;
			}
			for (@Pc(118) int local118 = arg3 - 1; local118 >= 0; local118--) {
				@Pc(126) int local126 = local68[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(144) int local144 = local66[local118] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(161) int local161 = local70[local118] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				local126 = Static569.anIntArray709[local126];
				if (local161 < 0) {
					local161 = 0;
				}
				local144 = Static569.anIntArray709[local144];
				local161 = Static569.anIntArray709[local161];
				@Pc(198) int local198;
				if (local126 == 0 && local144 == 0 && local161 == 0) {
					local198 = 0;
				} else {
					local198 = local64[local118] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local48[local50++] = (local198 << 24) + (local126 << 16) + (local144 << 8) + local161;
				if (arg0) {
					local50 += arg3 - 1;
				}
			}
		}
		for (@Pc(257) int local257 = 0; local257 < this.aClass14_Sub1Array39.length; local257++) {
			this.aClass14_Sub1Array39[local257].method8895();
		}
		return local48;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!wia;Lclient!d;ZII)[F")
	public float[] method8737(@OriginalArg(0) int arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		Static189.anInterface3_2 = arg2;
		Static436.aClass386_97 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub1Array39.length; local11++) {
			this.aClass14_Sub1Array39[local11].method8896(arg4, arg0);
		}
		Static558.method7838(arg0, arg4);
		@Pc(42) float[] local42 = new float[arg4 * 4 * arg0];
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
			@Pc(62) int[] local62;
			@Pc(64) int[] local64;
			@Pc(60) int[] local60;
			if (this.aClass14_Sub1_2.aBoolean734) {
				@Pc(58) int[] local58 = this.aClass14_Sub1_2.method8898(local46);
				local60 = local58;
				local62 = local58;
				local64 = local58;
			} else {
				@Pc(72) int[][] local72 = this.aClass14_Sub1_2.method8905(local46);
				local64 = local72[1];
				local62 = local72[0];
				local60 = local72[2];
			}
			@Pc(94) int[] local94;
			if (this.aClass14_Sub1_1.aBoolean734) {
				local94 = this.aClass14_Sub1_1.method8898(local46);
			} else {
				local94 = this.aClass14_Sub1_1.method8905(local46)[0];
			}
			if (arg3) {
				local44 = local46 << 2;
			}
			@Pc(122) int[] local122;
			if (this.aClass14_Sub1_3.aBoolean734) {
				local122 = this.aClass14_Sub1_3.method8898(local46);
			} else {
				local122 = this.aClass14_Sub1_3.method8905(local46)[0];
			}
			for (@Pc(134) int local134 = arg4 - 1; local134 >= 0; local134--) {
				@Pc(143) float local143 = (float) local94[local134] / 4096.0F;
				@Pc(156) float local156 = ((float) local122[local134] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local143 < 0.0F) {
					local143 = 0.0F;
				} else if (local143 > 1.0F) {
					local143 = 1.0F;
				}
				local42[local44++] = (float) local62[local134] * local156;
				local42[local44++] = local156 * (float) local64[local134];
				local42[local44++] = local156 * (float) local60[local134];
				local42[local44++] = local143;
				if (arg3) {
					local44 += (arg4 << 2) - 4;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass14_Sub1Array39.length; local224++) {
			this.aClass14_Sub1Array39[local224].method8895();
		}
		return local42;
	}
}
