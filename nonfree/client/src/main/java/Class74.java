import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class74 {

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "Lclient!qe;")
	private Class270 aClass270_1;

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "Lclient!qe;")
	private Class270 aClass270_2;

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "Lclient!ur;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "Lclient!qe;")
	private Class270 aClass270_3;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "[F")
	private final float[] aFloatArray38 = new float[16];

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "Lclient!wb;")
	private final Class3_Sub15_Sub2 aClass3_Sub15_Sub2_1 = new Class3_Sub15_Sub2(786336);

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
	private final int anInt2941 = Static539.method7665(1600);

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "[[Lclient!ej;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray1 = new Class2_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
	private int anInt2942 = 0;

	@OriginalMember(owner = "client!eba", name = "u", descriptor = "[I")
	private final int[] anIntArray143 = new int[64];

	@OriginalMember(owner = "client!eba", name = "v", descriptor = "[I")
	private final int[] anIntArray144 = new int[1600];

	@OriginalMember(owner = "client!eba", name = "t", descriptor = "[I")
	private final int[] anIntArray142 = new int[8191];

	@OriginalMember(owner = "client!eba", name = "x", descriptor = "[[Lclient!ej;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray2 = new Class2_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!eq;IILclient!cd;)V")
	public void method2715(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40 arg2) {
		if (arg0.aClass47_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method2721(arg0, arg1);
		} else {
			this.method2719(arg0);
		}
		@Pc(28) float local28 = arg0.aClass47_Sub2_3.aFloat141;
		@Pc(32) float local32 = arg0.aClass47_Sub2_3.aFloat136;
		@Pc(36) float local36 = arg0.aClass47_Sub2_3.aFloat133;
		@Pc(40) float local40 = arg0.aClass47_Sub2_3.aFloat139;
		try {
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = Integer.MAX_VALUE;
			@Pc(46) int local46 = 0;
			@Pc(50) Class2_Sub4 local50 = arg2.aClass177_1.aClass2_Sub4_7;
			@Pc(61) Class2_Sub4 local61;
			@Pc(93) int local93;
			for (local61 = local50.aClass2_Sub4_10; local61 != local50; local61 = local61.aClass2_Sub4_10) {
				@Pc(66) Class2_Sub4_Sub1 local66 = (Class2_Sub4_Sub1) local61;
				local93 = (int) (local32 * (float) (local66.anInt5118 >> 12) + (float) (local66.anInt5115 >> 12) * local28 + (float) (local66.anInt5117 >> 12) * local36 + local40);
				this.anIntArray142[local42++] = local93;
				if (local46 < local93) {
					local46 = local93;
				}
				if (local44 > local93) {
					local44 = local93;
				}
			}
			@Pc(123) int local123 = local46 - local44;
			if (local123 + 2 > 1600) {
				local93 = Static539.method7665(local123) + 1 - this.anInt2941;
				local123 = (local123 >> local93) + 2;
			} else {
				local123 += 2;
				local93 = 0;
			}
			local61 = local50.aClass2_Sub4_10;
			local42 = 0;
			@Pc(156) int local156 = -2;
			@Pc(158) boolean local158 = true;
			@Pc(160) boolean local160 = true;
			while (local50 != local61) {
				this.anInt2942 = 0;
				for (@Pc(167) int local167 = 0; local167 < local123; local167++) {
					this.anIntArray144[local167] = 0;
				}
				for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
					this.anIntArray143[local184] = 0;
				}
				while (local61 != local50) {
					@Pc(200) Class2_Sub4_Sub1 local200 = (Class2_Sub4_Sub1) local61;
					if (local160) {
						local160 = false;
						local158 = local200.aBoolean448;
						local156 = local200.anInt5116;
					}
					if (local42 > 0 && (local156 != local200.anInt5116 || local158 != local200.aBoolean448)) {
						local160 = true;
						break;
					}
					@Pc(238) int local238 = this.anIntArray142[local42++] - local44 >> local93;
					if (local238 < 1600) {
						if (this.anIntArray144[local238] < 64) {
							this.aClass2_Sub4_Sub1ArrayArray2[local238][this.anIntArray144[local238]++] = local200;
						} else {
							label97: {
								if (this.anIntArray144[local238] == 64) {
									if (this.anInt2942 == 64) {
										break label97;
									}
									this.anIntArray144[local238] += this.anInt2942++ + 1;
								}
								this.aClass2_Sub4_Sub1ArrayArray1[this.anIntArray144[local238] - 64 - 1][this.anIntArray143[this.anIntArray144[local238] - 1 - 64]++] = local200;
							}
						}
					}
					local61 = local61.aClass2_Sub4_10;
				}
				if (local156 >= 0) {
					arg0.method3032(local156);
				} else {
					arg0.method3032(-1);
				}
				if (local158 && arg0.aFloat114 != Static411.aFloat208) {
					arg0.xa(Static411.aFloat208);
				} else if (arg0.aFloat114 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method2716(arg0, local123);
			}
		} catch (@Pc(375) Exception local375) {
		}
		this.method2717(arg0);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!eq;IB)V")
	private void method2716(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray38, 0);
		@Pc(23) float local23 = this.aFloatArray38[0];
		@Pc(28) float local28 = this.aFloatArray38[4];
		@Pc(33) float local33 = this.aFloatArray38[8];
		@Pc(38) float local38 = this.aFloatArray38[1];
		@Pc(43) float local43 = this.aFloatArray38[5];
		@Pc(48) float local48 = this.aFloatArray38[9];
		@Pc(52) float local52 = local23 + local38;
		@Pc(56) float local56 = local43 + local28;
		@Pc(60) float local60 = local48 + local33;
		@Pc(64) float local64 = local23 - local38;
		@Pc(69) float local69 = local28 - local43;
		@Pc(73) float local73 = local33 - local48;
		@Pc(78) float local78 = local38 - local23;
		@Pc(82) float local82 = local43 - local28;
		this.aClass3_Sub15_Sub2_1.anInt10282 = 0;
		@Pc(91) float local91 = local48 - local33;
		@Pc(98) int local98;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class2_Sub4_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(488) float local488;
		@Pc(493) int local493;
		@Pc(433) int local433;
		@Pc(449) Class2_Sub4_Sub1 local449;
		@Pc(452) int local452;
		@Pc(465) byte local465;
		@Pc(470) byte local470;
		@Pc(482) float local482;
		if (arg0.aBoolean264) {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local113 = this.anIntArray144[local98] > 64 ? 64 : this.anIntArray144[local98];
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass2_Sub4_Sub1ArrayArray2[local98][local119];
						local131 = local128.anInt5114;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt5115 >> 12;
						local161 = local128.anInt5118 >> 12;
						local167 = local128.anInt5117 >> 12;
						local172 = local128.anInt5113 >> 12;
						this.aClass3_Sub15_Sub2_1.method8469(0.0F);
						this.aClass3_Sub15_Sub2_1.method8469(0.0F);
						this.aClass3_Sub15_Sub2_1.method8469(local52 * (float) -local172 + local155);
						this.aClass3_Sub15_Sub2_1.method8469((float) -local172 * local56 + local161);
						this.aClass3_Sub15_Sub2_1.method8469(local167 + (float) -local172 * local60);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
						this.aClass3_Sub15_Sub2_1.method8469(1.0F);
						this.aClass3_Sub15_Sub2_1.method8469(0.0F);
						this.aClass3_Sub15_Sub2_1.method8469((float) local172 * local64 + local155);
						this.aClass3_Sub15_Sub2_1.method8469(local69 * (float) local172 + local161);
						this.aClass3_Sub15_Sub2_1.method8469((float) local172 * local73 + local167);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
						this.aClass3_Sub15_Sub2_1.method8469(1.0F);
						this.aClass3_Sub15_Sub2_1.method8469(1.0F);
						this.aClass3_Sub15_Sub2_1.method8469(local155 + (float) local172 * local52);
						this.aClass3_Sub15_Sub2_1.method8469(local56 * (float) local172 + local161);
						this.aClass3_Sub15_Sub2_1.method8469(local167 + local60 * (float) local172);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
						this.aClass3_Sub15_Sub2_1.method8469(0.0F);
						this.aClass3_Sub15_Sub2_1.method8469(1.0F);
						this.aClass3_Sub15_Sub2_1.method8469((float) local172 * local78 + local155);
						this.aClass3_Sub15_Sub2_1.method8469(local82 * (float) local172 + local161);
						this.aClass3_Sub15_Sub2_1.method8469(local91 * (float) local172 + local167);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
					}
					if (this.anIntArray144[local98] > 64) {
						local433 = this.anIntArray144[local98] - 64 - 1;
						for (local131 = this.anIntArray143[local433] - 1; local131 >= 0; local131--) {
							local449 = this.aClass2_Sub4_Sub1ArrayArray1[local433][local131];
							local452 = local449.anInt5114;
							local144 = (byte) (local452 >> 16);
							local149 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local167 = local449.anInt5115 >> 12;
							local482 = local449.anInt5118 >> 12;
							local488 = local449.anInt5117 >> 12;
							local493 = local449.anInt5113 >> 12;
							this.aClass3_Sub15_Sub2_1.method8469(0.0F);
							this.aClass3_Sub15_Sub2_1.method8469(0.0F);
							this.aClass3_Sub15_Sub2_1.method8469((float) -local493 * local52 + local167);
							this.aClass3_Sub15_Sub2_1.method8469((float) -local493 * local56 + local482);
							this.aClass3_Sub15_Sub2_1.method8469(local488 + local60 * (float) -local493);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
							this.aClass3_Sub15_Sub2_1.method8469(1.0F);
							this.aClass3_Sub15_Sub2_1.method8469(0.0F);
							this.aClass3_Sub15_Sub2_1.method8469(local167 + (float) local493 * local64);
							this.aClass3_Sub15_Sub2_1.method8469(local69 * (float) local493 + local482);
							this.aClass3_Sub15_Sub2_1.method8469(local73 * (float) local493 + local488);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
							this.aClass3_Sub15_Sub2_1.method8469(1.0F);
							this.aClass3_Sub15_Sub2_1.method8469(1.0F);
							this.aClass3_Sub15_Sub2_1.method8469((float) local493 * local52 + local167);
							this.aClass3_Sub15_Sub2_1.method8469((float) local493 * local56 + local482);
							this.aClass3_Sub15_Sub2_1.method8469(local488 + local60 * (float) local493);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
							this.aClass3_Sub15_Sub2_1.method8469(0.0F);
							this.aClass3_Sub15_Sub2_1.method8469(1.0F);
							this.aClass3_Sub15_Sub2_1.method8469(local167 + (float) local493 * local78);
							this.aClass3_Sub15_Sub2_1.method8469(local82 * (float) local493 + local482);
							this.aClass3_Sub15_Sub2_1.method8469((float) local493 * local91 + local488);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
						}
					}
				}
			}
		} else {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local113 = this.anIntArray144[local98] <= 64 ? this.anIntArray144[local98] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass2_Sub4_Sub1ArrayArray2[local98][local119];
						local131 = local128.anInt5114;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt5115 >> 12;
						local161 = local128.anInt5118 >> 12;
						local167 = local128.anInt5117 >> 12;
						local172 = local128.anInt5113 >> 12;
						this.aClass3_Sub15_Sub2_1.method8470(0.0F);
						this.aClass3_Sub15_Sub2_1.method8470(0.0F);
						this.aClass3_Sub15_Sub2_1.method8470(local52 * (float) -local172 + local155);
						this.aClass3_Sub15_Sub2_1.method8470(local161 + (float) -local172 * local56);
						this.aClass3_Sub15_Sub2_1.method8470(local60 * (float) -local172 + local167);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
						this.aClass3_Sub15_Sub2_1.method8470(1.0F);
						this.aClass3_Sub15_Sub2_1.method8470(0.0F);
						this.aClass3_Sub15_Sub2_1.method8470(local155 + local64 * (float) local172);
						this.aClass3_Sub15_Sub2_1.method8470(local161 + (float) local172 * local69);
						this.aClass3_Sub15_Sub2_1.method8470(local167 + (float) local172 * local73);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
						this.aClass3_Sub15_Sub2_1.method8470(1.0F);
						this.aClass3_Sub15_Sub2_1.method8470(1.0F);
						this.aClass3_Sub15_Sub2_1.method8470(local155 + (float) local172 * local52);
						this.aClass3_Sub15_Sub2_1.method8470(local56 * (float) local172 + local161);
						this.aClass3_Sub15_Sub2_1.method8470(local167 + local60 * (float) local172);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
						this.aClass3_Sub15_Sub2_1.method8470(0.0F);
						this.aClass3_Sub15_Sub2_1.method8470(1.0F);
						this.aClass3_Sub15_Sub2_1.method8470(local155 + local78 * (float) local172);
						this.aClass3_Sub15_Sub2_1.method8470(local161 + local82 * (float) local172);
						this.aClass3_Sub15_Sub2_1.method8470(local167 + (float) local172 * local91);
						this.aClass3_Sub15_Sub2_1.method8448(local136);
						this.aClass3_Sub15_Sub2_1.method8448(local141);
						this.aClass3_Sub15_Sub2_1.method8448(local144);
						this.aClass3_Sub15_Sub2_1.method8448(local149);
					}
					if (this.anIntArray144[local98] > 64) {
						local433 = this.anIntArray144[local98] - 64 - 1;
						for (local131 = this.anIntArray143[local433] - 1; local131 >= 0; local131--) {
							local449 = this.aClass2_Sub4_Sub1ArrayArray1[local433][local131];
							local452 = local449.anInt5114;
							local144 = (byte) (local452 >> 16);
							local149 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local167 = local449.anInt5115 >> 12;
							local482 = local449.anInt5118 >> 12;
							local488 = local449.anInt5117 >> 12;
							local493 = local449.anInt5113 >> 12;
							this.aClass3_Sub15_Sub2_1.method8470(0.0F);
							this.aClass3_Sub15_Sub2_1.method8470(0.0F);
							this.aClass3_Sub15_Sub2_1.method8470(local167 + (float) -local493 * local52);
							this.aClass3_Sub15_Sub2_1.method8470(local56 * (float) -local493 + local482);
							this.aClass3_Sub15_Sub2_1.method8470(local488 + local60 * (float) -local493);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
							this.aClass3_Sub15_Sub2_1.method8470(1.0F);
							this.aClass3_Sub15_Sub2_1.method8470(0.0F);
							this.aClass3_Sub15_Sub2_1.method8470(local167 + (float) local493 * local64);
							this.aClass3_Sub15_Sub2_1.method8470((float) local493 * local69 + local482);
							this.aClass3_Sub15_Sub2_1.method8470(local73 * (float) local493 + local488);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
							this.aClass3_Sub15_Sub2_1.method8470(1.0F);
							this.aClass3_Sub15_Sub2_1.method8470(1.0F);
							this.aClass3_Sub15_Sub2_1.method8470(local167 + local52 * (float) local493);
							this.aClass3_Sub15_Sub2_1.method8470(local482 + local56 * (float) local493);
							this.aClass3_Sub15_Sub2_1.method8470(local60 * (float) local493 + local488);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
							this.aClass3_Sub15_Sub2_1.method8470(0.0F);
							this.aClass3_Sub15_Sub2_1.method8470(1.0F);
							this.aClass3_Sub15_Sub2_1.method8470(local167 + (float) local493 * local78);
							this.aClass3_Sub15_Sub2_1.method8470((float) local493 * local82 + local482);
							this.aClass3_Sub15_Sub2_1.method8470(local488 + local91 * (float) local493);
							this.aClass3_Sub15_Sub2_1.method8448(local144);
							this.aClass3_Sub15_Sub2_1.method8448(local149);
							this.aClass3_Sub15_Sub2_1.method8448(local465);
							this.aClass3_Sub15_Sub2_1.method8448(local470);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub15_Sub2_1.anInt10282 != 0) {
			this.anInterface27_1.method8092(this.aClass3_Sub15_Sub2_1.aByteArray106, this.aClass3_Sub15_Sub2_1.anInt10282, 24);
			arg0.method3073(null, this.aClass270_1, this.aClass270_3, this.aClass270_2);
			arg0.method3025(this.aClass3_Sub15_Sub2_1.anInt10282 / 24);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!eq;)V")
	private void method2717(@OriginalArg(1) Class33_Sub3 arg0) {
		arg0.method3017(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static411.aFloat208 != arg0.aFloat114) {
			arg0.xa(Static411.aFloat208);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!eq;I)V")
	private void method2719(@OriginalArg(0) Class33_Sub3 arg0) {
		Static411.aFloat208 = arg0.aFloat114;
		arg0.method3018();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3017(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!eq;II)V")
	private void method2721(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static411.aFloat208 = arg0.aFloat114;
		arg0.method3039((float) arg1);
		arg0.method3056();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3017(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(Lclient!eq;I)V")
	public void method2722(@OriginalArg(0) Class33_Sub3 arg0) {
		this.anInterface27_1 = arg0.method3072(24, 196584, null, true);
		this.aClass270_2 = new Class270(this.anInterface27_1, 5126, 2, 0);
		this.aClass270_1 = new Class270(this.anInterface27_1, 5126, 3, 8);
		this.aClass270_3 = new Class270(this.anInterface27_1, 5121, 4, 20);
	}
}
