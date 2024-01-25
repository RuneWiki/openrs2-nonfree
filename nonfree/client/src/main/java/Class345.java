import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class345 {

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Lclient!kca;")
	private Class166 aClass166_14;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "Lclient!kca;")
	private Class166 aClass166_15;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!pn;")
	private Interface14 anInterface14_7;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!kca;")
	private Class166 aClass166_16;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "[F")
	private final float[] aFloatArray91 = new float[16];

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Lclient!dl;")
	private final Class6_Sub12_Sub1 aClass6_Sub12_Sub1_3 = new Class6_Sub12_Sub1(786336);

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	private final int anInt9878 = Static1.method54(1600);

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "[[Lclient!cq;")
	private final Class60_Sub1_Sub1[][] aClass60_Sub1_Sub1ArrayArray3 = new Class60_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
	private final int[] anIntArray722 = new int[1600];

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	private int anInt9879 = 0;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "[I")
	private final int[] anIntArray723 = new int[64];

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "[[Lclient!cq;")
	private final Class60_Sub1_Sub1[][] aClass60_Sub1_Sub1ArrayArray4 = new Class60_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
	private final int[] anIntArray724 = new int[8191];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!hfa;Lclient!en;)V")
	public void method7852(@OriginalArg(1) Class127 arg0, @OriginalArg(2) Class90_Sub1 arg1) {
		if (arg1.aClass93_Sub2_4 == null) {
			return;
		}
		this.method7858(arg1);
		@Pc(24) float local24 = arg1.aClass93_Sub2_4.aFloat94;
		@Pc(28) float local28 = arg1.aClass93_Sub2_4.aFloat103;
		@Pc(32) float local32 = arg1.aClass93_Sub2_4.aFloat105;
		@Pc(36) float local36 = arg1.aClass93_Sub2_4.aFloat100;
		try {
			@Pc(41) int local41;
			@Pc(43) int local43;
			@Pc(49) Class60_Sub1 local49;
			@Pc(149) int local149;
			@Pc(160) int local160;
			if (arg0.aBoolean299) {
				local41 = arg0.anInt3800 - arg0.anInt3801;
				if (local41 + 2 <= 1600) {
					local41 += 2;
					local43 = 0;
				} else {
					local43 = Static1.method54(local41) + 1 - this.anInt9878;
					local41 = (local41 >> local43) + 2;
				}
				@Pc(405) Class60_Sub1 local405 = arg0.aClass145_1.aClass60_Sub1_7;
				local49 = local405.aClass60_Sub1_10;
				@Pc(410) int local410 = -2;
				@Pc(412) boolean local412 = true;
				@Pc(414) boolean local414 = true;
				while (local49 != local405) {
					this.anInt9879 = 0;
					for (local149 = 0; local149 < local41; local149++) {
						this.anIntArray722[local149] = 0;
					}
					for (@Pc(434) int local434 = 0; local434 < 64; local434++) {
						this.anIntArray723[local434] = 0;
					}
					while (local405 != local49) {
						@Pc(452) Class60_Sub1_Sub1 local452 = (Class60_Sub1_Sub1) local49;
						if (local414) {
							local414 = false;
							local412 = local452.aBoolean209;
							local410 = local452.anInt2704;
						} else if (local452.anInt2704 != local410 || local412 != local452.aBoolean209) {
							local414 = true;
							break;
						}
						local160 = (int) (local36 + local24 * (float) (local452.anInt2705 >> 12) + (float) (local452.anInt2701 >> 12) * local28 + local32 * (float) (local452.anInt2709 >> 12)) - arg0.anInt3801 >> local43;
						if (local160 < 1600) {
							if (this.anIntArray722[local160] >= 64) {
								label146: {
									if (this.anIntArray722[local160] == 64) {
										if (this.anInt9879 == 64) {
											break label146;
										}
										this.anIntArray722[local160] += this.anInt9879++ + 1;
									}
									this.aClass60_Sub1_Sub1ArrayArray3[this.anIntArray722[local160] - 1 - 64][this.anIntArray723[this.anIntArray722[local160] - 1 - 64]++] = local452;
								}
							} else {
								this.aClass60_Sub1_Sub1ArrayArray4[local160][this.anIntArray722[local160]++] = local452;
							}
						}
						local49 = local49.aClass60_Sub1_10;
					}
					if (local410 >= 0) {
						arg1.method2111(local410);
					} else {
						arg1.method2111(-1);
					}
					if (local412 && arg1.aFloat49 != Static22.aFloat17) {
						arg1.ha(Static22.aFloat17);
					} else if (arg1.aFloat49 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method7853(local41, arg1);
				}
			} else {
				local41 = 0;
				local43 = Integer.MAX_VALUE;
				@Pc(45) int local45 = 0;
				local49 = arg0.aClass145_1.aClass60_Sub1_7;
				@Pc(52) Class60_Sub1 local52;
				@Pc(84) int local84;
				for (local52 = local49.aClass60_Sub1_10; local52 != local49; local52 = local52.aClass60_Sub1_10) {
					@Pc(57) Class60_Sub1_Sub1 local57 = (Class60_Sub1_Sub1) local52;
					local84 = (int) (local36 + local24 * (float) (local57.anInt2705 >> 12) + local28 * (float) (local57.anInt2701 >> 12) + local32 * (float) (local57.anInt2709 >> 12));
					this.anIntArray724[local41++] = local84;
					if (local45 < local84) {
						local45 = local84;
					}
					if (local84 < local43) {
						local43 = local84;
					}
				}
				@Pc(115) int local115 = local45 - local43;
				if (local115 + 2 <= 1600) {
					local84 = 0;
					local115 += 2;
				} else {
					local84 = Static1.method54(local115) + 1 - this.anInt9878;
					local115 = (local115 >> local84) + 2;
				}
				local52 = local49.aClass60_Sub1_10;
				local41 = 0;
				local149 = -2;
				@Pc(151) boolean local151 = true;
				@Pc(153) boolean local153 = true;
				while (local52 != local49) {
					this.anInt9879 = 0;
					for (local160 = 0; local160 < local115; local160++) {
						this.anIntArray722[local160] = 0;
					}
					for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
						this.anIntArray723[local177] = 0;
					}
					while (local49 != local52) {
						@Pc(193) Class60_Sub1_Sub1 local193 = (Class60_Sub1_Sub1) local52;
						if (local153) {
							local153 = false;
							local151 = local193.aBoolean209;
							local149 = local193.anInt2704;
						}
						if (local41 > 0 && (local193.anInt2704 != local149 || local151 != local193.aBoolean209)) {
							local153 = true;
							break;
						}
						@Pc(235) int local235 = this.anIntArray724[local41++] - local43 >> local84;
						if (local235 < 1600) {
							if (this.anIntArray722[local235] >= 64) {
								label191: {
									if (this.anIntArray722[local235] == 64) {
										if (this.anInt9879 == 64) {
											break label191;
										}
										this.anIntArray722[local235] += this.anInt9879++ + 1;
									}
									@Pc(286) Class60_Sub1_Sub1[] local286 = this.aClass60_Sub1_Sub1ArrayArray3[this.anIntArray722[local235] - 65];
									@Pc(296) int local296 = this.anIntArray722[local235] - 64 - 1;
									@Pc(298) int local298 = this.anIntArray723[this.anIntArray722[local235] - 64 - 1];
									this.anIntArray723[local296] = this.anIntArray723[this.anIntArray722[local235] - 64 - 1] + 1;
									local286[local298] = local193;
								}
							} else {
								this.aClass60_Sub1_Sub1ArrayArray4[local235][this.anIntArray722[local235]++] = local193;
							}
						}
						local52 = local52.aClass60_Sub1_10;
					}
					if (local149 < 0) {
						arg1.method2111(-1);
					} else {
						arg1.method2111(local149);
					}
					if (local151 && Static22.aFloat17 != arg1.aFloat49) {
						arg1.ha(Static22.aFloat17);
					} else if (arg1.aFloat49 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method7853(local115, arg1);
				}
			}
		} catch (@Pc(656) Exception local656) {
		}
		this.method7857(arg1);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!en;I)V")
	private void method7853(@OriginalArg(0) int arg0, @OriginalArg(1) Class90_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray91, 0);
		@Pc(15) float local15 = this.aFloatArray91[0];
		@Pc(20) float local20 = this.aFloatArray91[4];
		@Pc(25) float local25 = this.aFloatArray91[8];
		@Pc(30) float local30 = this.aFloatArray91[1];
		@Pc(35) float local35 = this.aFloatArray91[5];
		@Pc(44) float local44 = this.aFloatArray91[9];
		@Pc(48) float local48 = local15 + local30;
		@Pc(52) float local52 = local20 + local35;
		@Pc(56) float local56 = local25 + local44;
		@Pc(61) float local61 = local15 - local30;
		@Pc(65) float local65 = local20 - local35;
		@Pc(70) float local70 = local25 - local44;
		@Pc(75) float local75 = local30 - local15;
		@Pc(80) float local80 = local35 - local20;
		@Pc(85) float local85 = local44 - local25;
		this.aClass6_Sub12_Sub1_3.anInt7556 = 0;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class60_Sub1_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(500) float local500;
		@Pc(505) int local505;
		@Pc(445) int local445;
		@Pc(461) Class60_Sub1_Sub1 local461;
		@Pc(464) int local464;
		@Pc(477) byte local477;
		@Pc(482) byte local482;
		@Pc(494) float local494;
		if (arg1.aBoolean176) {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray722[local96] <= 64 ? this.anIntArray722[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass60_Sub1_Sub1ArrayArray4[local96][local119];
						local131 = local128.anInt2703;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt2705 >> 12;
						local161 = local128.anInt2701 >> 12;
						local167 = local128.anInt2709 >> 12;
						local172 = local128.anInt2707 >> 12;
						this.aClass6_Sub12_Sub1_3.method1604(0.0F);
						this.aClass6_Sub12_Sub1_3.method1604(0.0F);
						this.aClass6_Sub12_Sub1_3.method1604(local155 + local48 * (float) -local172);
						this.aClass6_Sub12_Sub1_3.method1604((float) -local172 * local52 + local161);
						this.aClass6_Sub12_Sub1_3.method1604(local167 + local56 * (float) -local172);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
						this.aClass6_Sub12_Sub1_3.method1604(1.0F);
						this.aClass6_Sub12_Sub1_3.method1604(0.0F);
						this.aClass6_Sub12_Sub1_3.method1604((float) local172 * local61 + local155);
						this.aClass6_Sub12_Sub1_3.method1604(local161 + (float) local172 * local65);
						this.aClass6_Sub12_Sub1_3.method1604(local167 + local70 * (float) local172);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
						this.aClass6_Sub12_Sub1_3.method1604(1.0F);
						this.aClass6_Sub12_Sub1_3.method1604(1.0F);
						this.aClass6_Sub12_Sub1_3.method1604(local155 + local48 * (float) local172);
						this.aClass6_Sub12_Sub1_3.method1604(local161 + (float) local172 * local52);
						this.aClass6_Sub12_Sub1_3.method1604(local56 * (float) local172 + local167);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
						this.aClass6_Sub12_Sub1_3.method1604(0.0F);
						this.aClass6_Sub12_Sub1_3.method1604(1.0F);
						this.aClass6_Sub12_Sub1_3.method1604(local155 + (float) local172 * local75);
						this.aClass6_Sub12_Sub1_3.method1604((float) local172 * local80 + local161);
						this.aClass6_Sub12_Sub1_3.method1604(local167 + local85 * (float) local172);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
					}
					if (this.anIntArray722[local96] > 64) {
						local445 = this.anIntArray722[local96] - 64 - 1;
						for (local131 = this.anIntArray723[local445] - 1; local131 >= 0; local131--) {
							local461 = this.aClass60_Sub1_Sub1ArrayArray3[local445][local131];
							local464 = local461.anInt2703;
							local144 = (byte) (local464 >> 16);
							local149 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local167 = local461.anInt2705 >> 12;
							local494 = local461.anInt2701 >> 12;
							local500 = local461.anInt2709 >> 12;
							local505 = local461.anInt2707 >> 12;
							this.aClass6_Sub12_Sub1_3.method1604(0.0F);
							this.aClass6_Sub12_Sub1_3.method1604(0.0F);
							this.aClass6_Sub12_Sub1_3.method1604((float) -local505 * local48 + local167);
							this.aClass6_Sub12_Sub1_3.method1604(local494 + local52 * (float) -local505);
							this.aClass6_Sub12_Sub1_3.method1604(local500 + (float) -local505 * local56);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
							this.aClass6_Sub12_Sub1_3.method1604(1.0F);
							this.aClass6_Sub12_Sub1_3.method1604(0.0F);
							this.aClass6_Sub12_Sub1_3.method1604((float) local505 * local61 + local167);
							this.aClass6_Sub12_Sub1_3.method1604(local65 * (float) local505 + local494);
							this.aClass6_Sub12_Sub1_3.method1604(local500 + local70 * (float) local505);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
							this.aClass6_Sub12_Sub1_3.method1604(1.0F);
							this.aClass6_Sub12_Sub1_3.method1604(1.0F);
							this.aClass6_Sub12_Sub1_3.method1604(local167 + (float) local505 * local48);
							this.aClass6_Sub12_Sub1_3.method1604(local52 * (float) local505 + local494);
							this.aClass6_Sub12_Sub1_3.method1604((float) local505 * local56 + local500);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
							this.aClass6_Sub12_Sub1_3.method1604(0.0F);
							this.aClass6_Sub12_Sub1_3.method1604(1.0F);
							this.aClass6_Sub12_Sub1_3.method1604(local167 + (float) local505 * local75);
							this.aClass6_Sub12_Sub1_3.method1604((float) local505 * local80 + local494);
							this.aClass6_Sub12_Sub1_3.method1604(local85 * (float) local505 + local500);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
						}
					}
				}
			}
		} else {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray722[local96] > 64 ? 64 : this.anIntArray722[local96];
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass60_Sub1_Sub1ArrayArray4[local96][local119];
						local131 = local128.anInt2703;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt2705 >> 12;
						local161 = local128.anInt2701 >> 12;
						local167 = local128.anInt2709 >> 12;
						local172 = local128.anInt2707 >> 12;
						this.aClass6_Sub12_Sub1_3.method1602(0.0F);
						this.aClass6_Sub12_Sub1_3.method1602(0.0F);
						this.aClass6_Sub12_Sub1_3.method1602(local155 + local48 * (float) -local172);
						this.aClass6_Sub12_Sub1_3.method1602(local161 + local52 * (float) -local172);
						this.aClass6_Sub12_Sub1_3.method1602(local56 * (float) -local172 + local167);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
						this.aClass6_Sub12_Sub1_3.method1602(1.0F);
						this.aClass6_Sub12_Sub1_3.method1602(0.0F);
						this.aClass6_Sub12_Sub1_3.method1602(local61 * (float) local172 + local155);
						this.aClass6_Sub12_Sub1_3.method1602((float) local172 * local65 + local161);
						this.aClass6_Sub12_Sub1_3.method1602((float) local172 * local70 + local167);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
						this.aClass6_Sub12_Sub1_3.method1602(1.0F);
						this.aClass6_Sub12_Sub1_3.method1602(1.0F);
						this.aClass6_Sub12_Sub1_3.method1602(local155 + (float) local172 * local48);
						this.aClass6_Sub12_Sub1_3.method1602((float) local172 * local52 + local161);
						this.aClass6_Sub12_Sub1_3.method1602(local167 + local56 * (float) local172);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
						this.aClass6_Sub12_Sub1_3.method1602(0.0F);
						this.aClass6_Sub12_Sub1_3.method1602(1.0F);
						this.aClass6_Sub12_Sub1_3.method1602(local75 * (float) local172 + local155);
						this.aClass6_Sub12_Sub1_3.method1602(local161 + (float) local172 * local80);
						this.aClass6_Sub12_Sub1_3.method1602(local167 + (float) local172 * local85);
						this.aClass6_Sub12_Sub1_3.method6047(local136);
						this.aClass6_Sub12_Sub1_3.method6047(local141);
						this.aClass6_Sub12_Sub1_3.method6047(local144);
						this.aClass6_Sub12_Sub1_3.method6047(local149);
					}
					if (this.anIntArray722[local96] > 64) {
						local445 = this.anIntArray722[local96] - 64 - 1;
						for (local131 = this.anIntArray723[local445] - 1; local131 >= 0; local131--) {
							local461 = this.aClass60_Sub1_Sub1ArrayArray3[local445][local131];
							local464 = local461.anInt2703;
							local144 = (byte) (local464 >> 16);
							local149 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local167 = local461.anInt2705 >> 12;
							local494 = local461.anInt2701 >> 12;
							local500 = local461.anInt2709 >> 12;
							local505 = local461.anInt2707 >> 12;
							this.aClass6_Sub12_Sub1_3.method1602(0.0F);
							this.aClass6_Sub12_Sub1_3.method1602(0.0F);
							this.aClass6_Sub12_Sub1_3.method1602(local167 + local48 * (float) -local505);
							this.aClass6_Sub12_Sub1_3.method1602(local52 * (float) -local505 + local494);
							this.aClass6_Sub12_Sub1_3.method1602(local56 * (float) -local505 + local500);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
							this.aClass6_Sub12_Sub1_3.method1602(1.0F);
							this.aClass6_Sub12_Sub1_3.method1602(0.0F);
							this.aClass6_Sub12_Sub1_3.method1602((float) local505 * local61 + local167);
							this.aClass6_Sub12_Sub1_3.method1602((float) local505 * local65 + local494);
							this.aClass6_Sub12_Sub1_3.method1602(local70 * (float) local505 + local500);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
							this.aClass6_Sub12_Sub1_3.method1602(1.0F);
							this.aClass6_Sub12_Sub1_3.method1602(1.0F);
							this.aClass6_Sub12_Sub1_3.method1602(local167 + local48 * (float) local505);
							this.aClass6_Sub12_Sub1_3.method1602(local494 + local52 * (float) local505);
							this.aClass6_Sub12_Sub1_3.method1602((float) local505 * local56 + local500);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
							this.aClass6_Sub12_Sub1_3.method1602(0.0F);
							this.aClass6_Sub12_Sub1_3.method1602(1.0F);
							this.aClass6_Sub12_Sub1_3.method1602(local167 + local75 * (float) local505);
							this.aClass6_Sub12_Sub1_3.method1602(local494 + (float) local505 * local80);
							this.aClass6_Sub12_Sub1_3.method1602(local500 + local85 * (float) local505);
							this.aClass6_Sub12_Sub1_3.method6047(local144);
							this.aClass6_Sub12_Sub1_3.method6047(local149);
							this.aClass6_Sub12_Sub1_3.method6047(local477);
							this.aClass6_Sub12_Sub1_3.method6047(local482);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub12_Sub1_3.anInt7556 != 0) {
			this.anInterface14_7.method7306(24, this.aClass6_Sub12_Sub1_3.aByteArray97, this.aClass6_Sub12_Sub1_3.anInt7556);
			arg1.method2066(this.aClass166_16, this.aClass166_15, this.aClass166_14, null);
			arg1.method2081(this.aClass6_Sub12_Sub1_3.anInt7556 / 24);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!en;I)V")
	public void method7856(@OriginalArg(0) Class90_Sub1 arg0) {
		this.anInterface14_7 = arg0.method2108(null, true, 24, 196584);
		this.aClass166_15 = new Class166(this.anInterface14_7, 5126, 2, 0);
		this.aClass166_16 = new Class166(this.anInterface14_7, 5126, 3, 8);
		this.aClass166_14 = new Class166(this.anInterface14_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!en;)V")
	private void method7857(@OriginalArg(1) Class90_Sub1 arg0) {
		arg0.method2127(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat49 != Static22.aFloat17) {
			arg0.ha(Static22.aFloat17);
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lclient!en;I)V")
	private void method7858(@OriginalArg(0) Class90_Sub1 arg0) {
		Static22.aFloat17 = arg0.aFloat49;
		arg0.method2122();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2127(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
