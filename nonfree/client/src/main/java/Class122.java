import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class122 {

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Lclient!kd;")
	private Class127 aClass127_3;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "Lclient!kd;")
	private Class127 aClass127_4;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Lclient!kd;")
	private Class127 aClass127_5;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "Lclient!nh;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "[F")
	private final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!ht;")
	private final Class3_Sub7_Sub2 aClass3_Sub7_Sub2_2 = new Class3_Sub7_Sub2(786336);

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
	private final int anInt3850 = Static63.method1284(1600);

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "[I")
	private final int[] anIntArray240 = new int[64];

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "[[Lclient!ha;")
	private final Class6_Sub3_Sub1[][] aClass6_Sub3_Sub1ArrayArray1 = new Class6_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "[[Lclient!ha;")
	private final Class6_Sub3_Sub1[][] aClass6_Sub3_Sub1ArrayArray2 = new Class6_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "[I")
	private final int[] anIntArray241 = new int[1600];

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
	private int anInt3851 = 0;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "[I")
	private final int[] anIntArray242 = new int[8191];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!vj;I)V")
	private void method3071(@OriginalArg(0) Class172_Sub2 arg0) {
		Static220.aFloat70 = arg0.aFloat77;
		arg0.method5627();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5624(false);
		arg0.method5610(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!vj;Lclient!sh;)V")
	public void method3074(@OriginalArg(1) Class172_Sub2 arg0, @OriginalArg(2) Class227 arg1) {
		if (arg0.aClass107_Sub1_4 == null) {
			return;
		}
		this.method3071(arg0);
		@Pc(17) float local17 = arg0.aClass107_Sub1_4.aFloat45;
		@Pc(26) float local26 = arg0.aClass107_Sub1_4.aFloat46;
		@Pc(30) float local30 = arg0.aClass107_Sub1_4.aFloat39;
		@Pc(34) float local34 = arg0.aClass107_Sub1_4.aFloat35;
		try {
			@Pc(39) int local39;
			@Pc(41) int local41;
			@Pc(47) Class6_Sub3 local47;
			@Pc(140) int local140;
			@Pc(151) int local151;
			@Pc(303) int local303;
			@Pc(305) int local305;
			@Pc(295) Class6_Sub3_Sub1[] local295;
			if (arg1.aBoolean537) {
				local39 = arg1.anInt6186 - arg1.anInt6185;
				if (local39 + 2 > 1600) {
					local41 = Static63.method1284(local39) + 1 - this.anInt3850;
					local39 = (local39 >> local41) + 2;
				} else {
					local41 = 0;
					local39 += 2;
				}
				@Pc(410) Class6_Sub3 local410 = arg1.aClass235_1.aClass6_Sub3_7;
				local47 = local410.aClass6_Sub3_5;
				@Pc(415) int local415 = -2;
				@Pc(417) boolean local417 = true;
				@Pc(419) boolean local419 = true;
				while (local47 != local410) {
					this.anInt3851 = 0;
					for (local140 = 0; local140 < local39; local140++) {
						this.anIntArray241[local140] = 0;
					}
					for (@Pc(443) int local443 = 0; local443 < 64; local443++) {
						this.anIntArray240[local443] = 0;
					}
					while (local47 != local410) {
						@Pc(459) Class6_Sub3_Sub1 local459 = (Class6_Sub3_Sub1) local47;
						if (local419) {
							local415 = local459.anInt1879;
							local417 = local459.aBoolean156;
							local419 = false;
						} else if (local415 != local459.anInt1879 || local417 != local459.aBoolean156) {
							local419 = true;
							break;
						}
						local151 = (int) (local34 + (float) (local459.anInt1878 >> Static310.anInt5496) * local17 + (float) (local459.anInt1881 >> Static310.anInt5496) * local26 + local30 * (float) (local459.anInt1883 >> Static310.anInt5496)) - arg1.anInt6185 >> local41;
						if (local151 < 1600) {
							if (this.anIntArray241[local151] < 64) {
								this.aClass6_Sub3_Sub1ArrayArray1[local151][this.anIntArray241[local151]++] = local459;
							} else {
								label146: {
									if (this.anIntArray241[local151] == 64) {
										if (this.anInt3851 == 64) {
											break label146;
										}
										this.anIntArray241[local151] += this.anInt3851++ + 1;
									}
									local295 = this.aClass6_Sub3_Sub1ArrayArray2[this.anIntArray241[local151] - 65];
									local303 = this.anIntArray241[local151] - 64 - 1;
									local305 = this.anIntArray240[this.anIntArray241[local151] - 64 - 1];
									this.anIntArray240[local303] = this.anIntArray240[this.anIntArray241[local151] - 64 - 1] + 1;
									local295[local305] = local459;
								}
							}
						}
						local47 = local47.aClass6_Sub3_5;
					}
					if (local415 < 0) {
						arg0.method5630(null);
					} else {
						arg0.method5630(arg0.aClass221_1.method4759(local415));
						arg0.method5629(arg0.anInterface5_8.method3918(local415).anInt2415);
					}
					if (local417 && Static220.aFloat70 != arg0.aFloat77) {
						arg0.ua(Static220.aFloat70);
					} else if (arg0.aFloat77 != 1.0F) {
						arg0.ua(1.0F);
					}
					this.method3075(arg0, local39);
				}
			} else {
				local39 = 0;
				local41 = Integer.MAX_VALUE;
				@Pc(43) int local43 = 0;
				local47 = arg1.aClass235_1.aClass6_Sub3_7;
				@Pc(50) Class6_Sub3 local50;
				@Pc(82) int local82;
				for (local50 = local47.aClass6_Sub3_5; local50 != local47; local50 = local50.aClass6_Sub3_5) {
					@Pc(55) Class6_Sub3_Sub1 local55 = (Class6_Sub3_Sub1) local50;
					local82 = (int) (local34 + (float) (local55.anInt1878 >> Static310.anInt5496) * local17 + local26 * (float) (local55.anInt1881 >> Static310.anInt5496) + (float) (local55.anInt1883 >> Static310.anInt5496) * local30);
					this.anIntArray242[local39++] = local82;
					if (local43 < local82) {
						local43 = local82;
					}
					if (local82 < local41) {
						local41 = local82;
					}
				}
				@Pc(108) int local108 = local43 - local41;
				if (local108 + 2 <= 1600) {
					local82 = 0;
					local108 += 2;
				} else {
					local82 = Static63.method1284(local108) + 1 - this.anInt3850;
					local108 = (local108 >> local82) + 2;
				}
				local50 = local47.aClass6_Sub3_5;
				local39 = 0;
				local140 = -2;
				@Pc(142) boolean local142 = true;
				@Pc(144) boolean local144 = true;
				while (local47 != local50) {
					this.anInt3851 = 0;
					for (local151 = 0; local151 < local108; local151++) {
						this.anIntArray241[local151] = 0;
					}
					for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
						this.anIntArray240[local164] = 0;
					}
					while (local47 != local50) {
						@Pc(182) Class6_Sub3_Sub1 local182 = (Class6_Sub3_Sub1) local50;
						if (local144) {
							local142 = local182.aBoolean156;
							local144 = false;
							local140 = local182.anInt1879;
						}
						if (local39 > 0 && (local182.anInt1879 != local140 || local142 != local182.aBoolean156)) {
							local144 = true;
							break;
						}
						@Pc(228) int local228 = this.anIntArray242[local39++] - local41 >> local82;
						if (local228 < 1600) {
							if (this.anIntArray241[local228] < 64) {
								this.aClass6_Sub3_Sub1ArrayArray1[local228][this.anIntArray241[local228]++] = local182;
							} else {
								label191: {
									if (this.anIntArray241[local228] == 64) {
										if (this.anInt3851 == 64) {
											break label191;
										}
										this.anIntArray241[local228] += this.anInt3851++ + 1;
									}
									local295 = this.aClass6_Sub3_Sub1ArrayArray2[this.anIntArray241[local228] - 65];
									local303 = this.anIntArray241[local228] - 65;
									local305 = this.anIntArray240[this.anIntArray241[local228] - 65];
									this.anIntArray240[local303] = this.anIntArray240[this.anIntArray241[local228] - 65] + 1;
									local295[local305] = local182;
								}
							}
						}
						local50 = local50.aClass6_Sub3_5;
					}
					if (local140 < 0) {
						arg0.method5630(null);
					} else {
						arg0.method5630(arg0.aClass221_1.method4759(local140));
						arg0.method5629(arg0.anInterface5_8.method3918(local140).anInt2415);
					}
					if (local142 && arg0.aFloat77 != Static220.aFloat70) {
						arg0.ua(Static220.aFloat70);
					} else if (arg0.aFloat77 != 1.0F) {
						arg0.ua(1.0F);
					}
					this.method3075(arg0, local108);
				}
			}
		} catch (@Pc(674) Exception local674) {
		}
		this.method3077(arg0);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!vj;IB)V")
	private void method3075(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray11, 0);
		@Pc(15) float local15 = this.aFloatArray11[0];
		@Pc(20) float local20 = this.aFloatArray11[4];
		@Pc(25) float local25 = this.aFloatArray11[8];
		@Pc(30) float local30 = this.aFloatArray11[1];
		@Pc(35) float local35 = this.aFloatArray11[5];
		@Pc(40) float local40 = this.aFloatArray11[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(58) float local58 = local40 + local25;
		@Pc(63) float local63 = local15 - local30;
		@Pc(68) float local68 = local20 - local35;
		@Pc(72) float local72 = local25 - local40;
		@Pc(76) float local76 = local30 - local15;
		@Pc(80) float local80 = local35 - local20;
		this.aClass3_Sub7_Sub2_2.anInt3235 = 0;
		@Pc(89) float local89 = local40 - local25;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class6_Sub3_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(491) float local491;
		@Pc(496) int local496;
		@Pc(436) int local436;
		@Pc(452) Class6_Sub3_Sub1 local452;
		@Pc(455) int local455;
		@Pc(468) byte local468;
		@Pc(473) byte local473;
		@Pc(485) float local485;
		if (arg0.aBoolean621) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray241[local96] <= 64 ? this.anIntArray241[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass6_Sub3_Sub1ArrayArray1[local96][local119];
						local131 = local128.anInt1876;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt1878 >> Static310.anInt5496;
						local161 = local128.anInt1881 >> Static310.anInt5496;
						local167 = local128.anInt1883 >> Static310.anInt5496;
						local172 = local128.anInt1882 >> Static310.anInt5496;
						this.aClass3_Sub7_Sub2_2.method2645(0.0F);
						this.aClass3_Sub7_Sub2_2.method2645(0.0F);
						this.aClass3_Sub7_Sub2_2.method2645(local44 * (float) -local172 + local155);
						this.aClass3_Sub7_Sub2_2.method2645(local161 + (float) -local172 * local48);
						this.aClass3_Sub7_Sub2_2.method2645(local167 + local58 * (float) -local172);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
						this.aClass3_Sub7_Sub2_2.method2645(1.0F);
						this.aClass3_Sub7_Sub2_2.method2645(0.0F);
						this.aClass3_Sub7_Sub2_2.method2645(local63 * (float) local172 + local155);
						this.aClass3_Sub7_Sub2_2.method2645(local161 + local68 * (float) local172);
						this.aClass3_Sub7_Sub2_2.method2645(local72 * (float) local172 + local167);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
						this.aClass3_Sub7_Sub2_2.method2645(1.0F);
						this.aClass3_Sub7_Sub2_2.method2645(1.0F);
						this.aClass3_Sub7_Sub2_2.method2645(local155 + local44 * (float) local172);
						this.aClass3_Sub7_Sub2_2.method2645(local161 + (float) local172 * local48);
						this.aClass3_Sub7_Sub2_2.method2645(local58 * (float) local172 + local167);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
						this.aClass3_Sub7_Sub2_2.method2645(0.0F);
						this.aClass3_Sub7_Sub2_2.method2645(1.0F);
						this.aClass3_Sub7_Sub2_2.method2645((float) local172 * local76 + local155);
						this.aClass3_Sub7_Sub2_2.method2645(local161 + (float) local172 * local80);
						this.aClass3_Sub7_Sub2_2.method2645(local89 * (float) local172 + local167);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
					}
					if (this.anIntArray241[local96] > 64) {
						local436 = this.anIntArray241[local96] - 1 - 64;
						for (local131 = this.anIntArray240[local436] - 1; local131 >= 0; local131--) {
							local452 = this.aClass6_Sub3_Sub1ArrayArray2[local436][local131];
							local455 = local452.anInt1876;
							local144 = (byte) (local455 >> 16);
							local149 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local167 = local452.anInt1878 >> Static310.anInt5496;
							local485 = local452.anInt1881 >> Static310.anInt5496;
							local491 = local452.anInt1883 >> Static310.anInt5496;
							local496 = local452.anInt1882 >> Static310.anInt5496;
							this.aClass3_Sub7_Sub2_2.method2645(0.0F);
							this.aClass3_Sub7_Sub2_2.method2645(0.0F);
							this.aClass3_Sub7_Sub2_2.method2645((float) -local496 * local44 + local167);
							this.aClass3_Sub7_Sub2_2.method2645((float) -local496 * local48 + local485);
							this.aClass3_Sub7_Sub2_2.method2645(local58 * (float) -local496 + local491);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
							this.aClass3_Sub7_Sub2_2.method2645(1.0F);
							this.aClass3_Sub7_Sub2_2.method2645(0.0F);
							this.aClass3_Sub7_Sub2_2.method2645((float) local496 * local63 + local167);
							this.aClass3_Sub7_Sub2_2.method2645((float) local496 * local68 + local485);
							this.aClass3_Sub7_Sub2_2.method2645(local72 * (float) local496 + local491);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
							this.aClass3_Sub7_Sub2_2.method2645(1.0F);
							this.aClass3_Sub7_Sub2_2.method2645(1.0F);
							this.aClass3_Sub7_Sub2_2.method2645(local167 + (float) local496 * local44);
							this.aClass3_Sub7_Sub2_2.method2645(local485 + (float) local496 * local48);
							this.aClass3_Sub7_Sub2_2.method2645(local491 + (float) local496 * local58);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
							this.aClass3_Sub7_Sub2_2.method2645(0.0F);
							this.aClass3_Sub7_Sub2_2.method2645(1.0F);
							this.aClass3_Sub7_Sub2_2.method2645(local76 * (float) local496 + local167);
							this.aClass3_Sub7_Sub2_2.method2645(local485 + (float) local496 * local80);
							this.aClass3_Sub7_Sub2_2.method2645(local89 * (float) local496 + local491);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray241[local96] <= 64 ? this.anIntArray241[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass6_Sub3_Sub1ArrayArray1[local96][local119];
						local131 = local128.anInt1876;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt1878 >> Static310.anInt5496;
						local161 = local128.anInt1881 >> Static310.anInt5496;
						local167 = local128.anInt1883 >> Static310.anInt5496;
						local172 = local128.anInt1882 >> Static310.anInt5496;
						this.aClass3_Sub7_Sub2_2.method2643(0.0F);
						this.aClass3_Sub7_Sub2_2.method2643(0.0F);
						this.aClass3_Sub7_Sub2_2.method2643(local44 * (float) -local172 + local155);
						this.aClass3_Sub7_Sub2_2.method2643((float) -local172 * local48 + local161);
						this.aClass3_Sub7_Sub2_2.method2643(local58 * (float) -local172 + local167);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
						this.aClass3_Sub7_Sub2_2.method2643(1.0F);
						this.aClass3_Sub7_Sub2_2.method2643(0.0F);
						this.aClass3_Sub7_Sub2_2.method2643(local155 + (float) local172 * local63);
						this.aClass3_Sub7_Sub2_2.method2643(local161 + (float) local172 * local68);
						this.aClass3_Sub7_Sub2_2.method2643(local167 + (float) local172 * local72);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
						this.aClass3_Sub7_Sub2_2.method2643(1.0F);
						this.aClass3_Sub7_Sub2_2.method2643(1.0F);
						this.aClass3_Sub7_Sub2_2.method2643(local44 * (float) local172 + local155);
						this.aClass3_Sub7_Sub2_2.method2643(local48 * (float) local172 + local161);
						this.aClass3_Sub7_Sub2_2.method2643(local167 + (float) local172 * local58);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
						this.aClass3_Sub7_Sub2_2.method2643(0.0F);
						this.aClass3_Sub7_Sub2_2.method2643(1.0F);
						this.aClass3_Sub7_Sub2_2.method2643(local155 + local76 * (float) local172);
						this.aClass3_Sub7_Sub2_2.method2643(local161 + local80 * (float) local172);
						this.aClass3_Sub7_Sub2_2.method2643(local167 + (float) local172 * local89);
						this.aClass3_Sub7_Sub2_2.method2628(local136);
						this.aClass3_Sub7_Sub2_2.method2628(local141);
						this.aClass3_Sub7_Sub2_2.method2628(local144);
						this.aClass3_Sub7_Sub2_2.method2628(local149);
					}
					if (this.anIntArray241[local96] > 64) {
						local436 = this.anIntArray241[local96] - 1 - 64;
						for (local131 = this.anIntArray240[local436] - 1; local131 >= 0; local131--) {
							local452 = this.aClass6_Sub3_Sub1ArrayArray2[local436][local131];
							local455 = local452.anInt1876;
							local144 = (byte) (local455 >> 16);
							local149 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local167 = local452.anInt1878 >> Static310.anInt5496;
							local485 = local452.anInt1881 >> Static310.anInt5496;
							local491 = local452.anInt1883 >> Static310.anInt5496;
							local496 = local452.anInt1882 >> Static310.anInt5496;
							this.aClass3_Sub7_Sub2_2.method2643(0.0F);
							this.aClass3_Sub7_Sub2_2.method2643(0.0F);
							this.aClass3_Sub7_Sub2_2.method2643((float) -local496 * local44 + local167);
							this.aClass3_Sub7_Sub2_2.method2643(local48 * (float) -local496 + local485);
							this.aClass3_Sub7_Sub2_2.method2643(local58 * (float) -local496 + local491);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
							this.aClass3_Sub7_Sub2_2.method2643(1.0F);
							this.aClass3_Sub7_Sub2_2.method2643(0.0F);
							this.aClass3_Sub7_Sub2_2.method2643(local167 + local63 * (float) local496);
							this.aClass3_Sub7_Sub2_2.method2643(local68 * (float) local496 + local485);
							this.aClass3_Sub7_Sub2_2.method2643(local491 + (float) local496 * local72);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
							this.aClass3_Sub7_Sub2_2.method2643(1.0F);
							this.aClass3_Sub7_Sub2_2.method2643(1.0F);
							this.aClass3_Sub7_Sub2_2.method2643((float) local496 * local44 + local167);
							this.aClass3_Sub7_Sub2_2.method2643(local485 + (float) local496 * local48);
							this.aClass3_Sub7_Sub2_2.method2643(local491 + local58 * (float) local496);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
							this.aClass3_Sub7_Sub2_2.method2643(0.0F);
							this.aClass3_Sub7_Sub2_2.method2643(1.0F);
							this.aClass3_Sub7_Sub2_2.method2643(local167 + local76 * (float) local496);
							this.aClass3_Sub7_Sub2_2.method2643(local80 * (float) local496 + local485);
							this.aClass3_Sub7_Sub2_2.method2643(local491 + (float) local496 * local89);
							this.aClass3_Sub7_Sub2_2.method2628(local144);
							this.aClass3_Sub7_Sub2_2.method2628(local149);
							this.aClass3_Sub7_Sub2_2.method2628(local468);
							this.aClass3_Sub7_Sub2_2.method2628(local473);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub7_Sub2_2.anInt3235 != 0) {
			this.anInterface6_2.method4768(this.aClass3_Sub7_Sub2_2.aByteArray46, this.aClass3_Sub7_Sub2_2.anInt3235, 24);
			arg0.method5622(this.aClass127_5, this.aClass127_3, this.aClass127_4, null);
			arg0.method5616(this.aClass3_Sub7_Sub2_2.anInt3235 / 24);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!vj;B)V")
	public void method3076(@OriginalArg(0) Class172_Sub2 arg0) {
		this.anInterface6_2 = arg0.method5586(true, 196584, null, 24);
		this.aClass127_3 = new Class127(this.anInterface6_2, 5126, 2, 0);
		this.aClass127_4 = new Class127(this.anInterface6_2, 5126, 3, 8);
		this.aClass127_5 = new Class127(this.anInterface6_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lclient!vj;I)V")
	private void method3077(@OriginalArg(0) Class172_Sub2 arg0) {
		arg0.method5624(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static220.aFloat70 != arg0.aFloat77) {
			arg0.ua(Static220.aFloat70);
		}
	}
}
