import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class59 {

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!af;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Lclient!lq;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Lclient!af;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "Lclient!af;")
	private Class11 aClass11_3;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "[F")
	private final float[] aFloatArray15 = new float[16];

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!ke;")
	private final Class2_Sub29_Sub1 aClass2_Sub29_Sub1_1 = new Class2_Sub29_Sub1(786336);

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	private final int anInt1795 = Static451.method6881(1600);

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "[[Lclient!gda;")
	private final Class6_Sub1_Sub2[][] aClass6_Sub1_Sub2ArrayArray1 = new Class6_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
	private int anInt1796 = 0;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "[I")
	private final int[] anIntArray135 = new int[64];

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "[[Lclient!gda;")
	private final Class6_Sub1_Sub2[][] aClass6_Sub1_Sub2ArrayArray2 = new Class6_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "[I")
	private final int[] anIntArray136 = new int[8191];

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "[I")
	private final int[] anIntArray137 = new int[1600];

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!os;Z)V")
	private void method1697(@OriginalArg(0) Class39_Sub3 arg0) {
		arg0.method5708(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static265.aFloat183 != arg0.aFloat159) {
			arg0.M(Static265.aFloat183);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZILclient!os;)V")
	private void method1698(@OriginalArg(1) int arg0, @OriginalArg(2) Class39_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray15, 0);
		@Pc(15) float local15 = this.aFloatArray15[0];
		@Pc(20) float local20 = this.aFloatArray15[4];
		@Pc(25) float local25 = this.aFloatArray15[8];
		@Pc(30) float local30 = this.aFloatArray15[1];
		@Pc(35) float local35 = this.aFloatArray15[5];
		@Pc(46) float local46 = this.aFloatArray15[9];
		@Pc(50) float local50 = local15 + local30;
		@Pc(54) float local54 = local20 + local35;
		@Pc(58) float local58 = local25 + local46;
		@Pc(63) float local63 = local15 - local30;
		@Pc(68) float local68 = local20 - local35;
		@Pc(72) float local72 = local25 - local46;
		@Pc(76) float local76 = local30 - local15;
		@Pc(80) float local80 = local35 - local20;
		@Pc(84) float local84 = local46 - local25;
		this.aClass2_Sub29_Sub1_1.anInt6132 = 0;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class6_Sub1_Sub2 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(493) float local493;
		@Pc(498) int local498;
		@Pc(438) int local438;
		@Pc(454) Class6_Sub1_Sub2 local454;
		@Pc(457) int local457;
		@Pc(470) byte local470;
		@Pc(475) byte local475;
		@Pc(487) float local487;
		if (arg1.aBoolean485) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray137[local95] <= 64 ? this.anIntArray137[local95] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass6_Sub1_Sub2ArrayArray1[local95][local119];
						local131 = local128.anInt8125;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt8123 >> 12;
						local161 = local128.anInt8129 >> 12;
						local167 = local128.anInt8124 >> 12;
						local172 = local128.anInt8122 >> 12;
						this.aClass2_Sub29_Sub1_1.method3899(0.0F);
						this.aClass2_Sub29_Sub1_1.method3899(0.0F);
						this.aClass2_Sub29_Sub1_1.method3899(local50 * (float) -local172 + local155);
						this.aClass2_Sub29_Sub1_1.method3899(local161 + local54 * (float) -local172);
						this.aClass2_Sub29_Sub1_1.method3899(local58 * (float) -local172 + local167);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
						this.aClass2_Sub29_Sub1_1.method3899(1.0F);
						this.aClass2_Sub29_Sub1_1.method3899(0.0F);
						this.aClass2_Sub29_Sub1_1.method3899(local63 * (float) local172 + local155);
						this.aClass2_Sub29_Sub1_1.method3899((float) local172 * local68 + local161);
						this.aClass2_Sub29_Sub1_1.method3899(local167 + (float) local172 * local72);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
						this.aClass2_Sub29_Sub1_1.method3899(1.0F);
						this.aClass2_Sub29_Sub1_1.method3899(1.0F);
						this.aClass2_Sub29_Sub1_1.method3899(local50 * (float) local172 + local155);
						this.aClass2_Sub29_Sub1_1.method3899(local161 + (float) local172 * local54);
						this.aClass2_Sub29_Sub1_1.method3899((float) local172 * local58 + local167);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
						this.aClass2_Sub29_Sub1_1.method3899(0.0F);
						this.aClass2_Sub29_Sub1_1.method3899(1.0F);
						this.aClass2_Sub29_Sub1_1.method3899(local76 * (float) local172 + local155);
						this.aClass2_Sub29_Sub1_1.method3899(local80 * (float) local172 + local161);
						this.aClass2_Sub29_Sub1_1.method3899(local84 * (float) local172 + local167);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
					}
					if (this.anIntArray137[local95] > 64) {
						local438 = this.anIntArray137[local95] - 64 - 1;
						for (local131 = this.anIntArray135[local438] - 1; local131 >= 0; local131--) {
							local454 = this.aClass6_Sub1_Sub2ArrayArray2[local438][local131];
							local457 = local454.anInt8125;
							local144 = (byte) (local457 >> 16);
							local149 = (byte) (local457 >> 8);
							local470 = (byte) local457;
							local475 = (byte) (local457 >>> 24);
							local167 = local454.anInt8123 >> 12;
							local487 = local454.anInt8129 >> 12;
							local493 = local454.anInt8124 >> 12;
							local498 = local454.anInt8122 >> 12;
							this.aClass2_Sub29_Sub1_1.method3899(0.0F);
							this.aClass2_Sub29_Sub1_1.method3899(0.0F);
							this.aClass2_Sub29_Sub1_1.method3899(local167 + (float) -local498 * local50);
							this.aClass2_Sub29_Sub1_1.method3899(local487 + local54 * (float) -local498);
							this.aClass2_Sub29_Sub1_1.method3899((float) -local498 * local58 + local493);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
							this.aClass2_Sub29_Sub1_1.method3899(1.0F);
							this.aClass2_Sub29_Sub1_1.method3899(0.0F);
							this.aClass2_Sub29_Sub1_1.method3899((float) local498 * local63 + local167);
							this.aClass2_Sub29_Sub1_1.method3899(local68 * (float) local498 + local487);
							this.aClass2_Sub29_Sub1_1.method3899(local72 * (float) local498 + local493);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
							this.aClass2_Sub29_Sub1_1.method3899(1.0F);
							this.aClass2_Sub29_Sub1_1.method3899(1.0F);
							this.aClass2_Sub29_Sub1_1.method3899(local167 + local50 * (float) local498);
							this.aClass2_Sub29_Sub1_1.method3899(local487 + local54 * (float) local498);
							this.aClass2_Sub29_Sub1_1.method3899(local493 + local58 * (float) local498);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
							this.aClass2_Sub29_Sub1_1.method3899(0.0F);
							this.aClass2_Sub29_Sub1_1.method3899(1.0F);
							this.aClass2_Sub29_Sub1_1.method3899(local167 + local76 * (float) local498);
							this.aClass2_Sub29_Sub1_1.method3899(local487 + (float) local498 * local80);
							this.aClass2_Sub29_Sub1_1.method3899((float) local498 * local84 + local493);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray137[local95] <= 64 ? this.anIntArray137[local95] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass6_Sub1_Sub2ArrayArray1[local95][local119];
						local131 = local128.anInt8125;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt8123 >> 12;
						local161 = local128.anInt8129 >> 12;
						local167 = local128.anInt8124 >> 12;
						local172 = local128.anInt8122 >> 12;
						this.aClass2_Sub29_Sub1_1.method3902(0.0F);
						this.aClass2_Sub29_Sub1_1.method3902(0.0F);
						this.aClass2_Sub29_Sub1_1.method3902((float) -local172 * local50 + local155);
						this.aClass2_Sub29_Sub1_1.method3902((float) -local172 * local54 + local161);
						this.aClass2_Sub29_Sub1_1.method3902(local167 + local58 * (float) -local172);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
						this.aClass2_Sub29_Sub1_1.method3902(1.0F);
						this.aClass2_Sub29_Sub1_1.method3902(0.0F);
						this.aClass2_Sub29_Sub1_1.method3902(local63 * (float) local172 + local155);
						this.aClass2_Sub29_Sub1_1.method3902((float) local172 * local68 + local161);
						this.aClass2_Sub29_Sub1_1.method3902((float) local172 * local72 + local167);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
						this.aClass2_Sub29_Sub1_1.method3902(1.0F);
						this.aClass2_Sub29_Sub1_1.method3902(1.0F);
						this.aClass2_Sub29_Sub1_1.method3902(local50 * (float) local172 + local155);
						this.aClass2_Sub29_Sub1_1.method3902((float) local172 * local54 + local161);
						this.aClass2_Sub29_Sub1_1.method3902(local167 + local58 * (float) local172);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
						this.aClass2_Sub29_Sub1_1.method3902(0.0F);
						this.aClass2_Sub29_Sub1_1.method3902(1.0F);
						this.aClass2_Sub29_Sub1_1.method3902(local76 * (float) local172 + local155);
						this.aClass2_Sub29_Sub1_1.method3902(local161 + local80 * (float) local172);
						this.aClass2_Sub29_Sub1_1.method3902((float) local172 * local84 + local167);
						this.aClass2_Sub29_Sub1_1.method5172(local136);
						this.aClass2_Sub29_Sub1_1.method5172(local141);
						this.aClass2_Sub29_Sub1_1.method5172(local144);
						this.aClass2_Sub29_Sub1_1.method5172(local149);
					}
					if (this.anIntArray137[local95] > 64) {
						local438 = this.anIntArray137[local95] - 64 - 1;
						for (local131 = this.anIntArray135[local438] - 1; local131 >= 0; local131--) {
							local454 = this.aClass6_Sub1_Sub2ArrayArray2[local438][local131];
							local457 = local454.anInt8125;
							local144 = (byte) (local457 >> 16);
							local149 = (byte) (local457 >> 8);
							local470 = (byte) local457;
							local475 = (byte) (local457 >>> 24);
							local167 = local454.anInt8123 >> 12;
							local487 = local454.anInt8129 >> 12;
							local493 = local454.anInt8124 >> 12;
							local498 = local454.anInt8122 >> 12;
							this.aClass2_Sub29_Sub1_1.method3902(0.0F);
							this.aClass2_Sub29_Sub1_1.method3902(0.0F);
							this.aClass2_Sub29_Sub1_1.method3902(local167 + (float) -local498 * local50);
							this.aClass2_Sub29_Sub1_1.method3902(local487 + (float) -local498 * local54);
							this.aClass2_Sub29_Sub1_1.method3902((float) -local498 * local58 + local493);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
							this.aClass2_Sub29_Sub1_1.method3902(1.0F);
							this.aClass2_Sub29_Sub1_1.method3902(0.0F);
							this.aClass2_Sub29_Sub1_1.method3902(local63 * (float) local498 + local167);
							this.aClass2_Sub29_Sub1_1.method3902(local68 * (float) local498 + local487);
							this.aClass2_Sub29_Sub1_1.method3902(local493 + (float) local498 * local72);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
							this.aClass2_Sub29_Sub1_1.method3902(1.0F);
							this.aClass2_Sub29_Sub1_1.method3902(1.0F);
							this.aClass2_Sub29_Sub1_1.method3902(local167 + local50 * (float) local498);
							this.aClass2_Sub29_Sub1_1.method3902(local487 + (float) local498 * local54);
							this.aClass2_Sub29_Sub1_1.method3902(local493 + local58 * (float) local498);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
							this.aClass2_Sub29_Sub1_1.method3902(0.0F);
							this.aClass2_Sub29_Sub1_1.method3902(1.0F);
							this.aClass2_Sub29_Sub1_1.method3902(local167 + (float) local498 * local76);
							this.aClass2_Sub29_Sub1_1.method3902(local487 + (float) local498 * local80);
							this.aClass2_Sub29_Sub1_1.method3902(local493 + (float) local498 * local84);
							this.aClass2_Sub29_Sub1_1.method5172(local144);
							this.aClass2_Sub29_Sub1_1.method5172(local149);
							this.aClass2_Sub29_Sub1_1.method5172(local470);
							this.aClass2_Sub29_Sub1_1.method5172(local475);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub29_Sub1_1.anInt6132 != 0) {
			this.anInterface10_2.method3585(this.aClass2_Sub29_Sub1_1.anInt6132, this.aClass2_Sub29_Sub1_1.aByteArray96, 24);
			arg1.method5754(this.aClass11_3, this.aClass11_1, this.aClass11_2, null);
			arg1.method5742(this.aClass2_Sub29_Sub1_1.anInt6132 / 24);
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lclient!os;Z)V")
	private void method1701(@OriginalArg(0) Class39_Sub3 arg0) {
		Static265.aFloat183 = arg0.aFloat159;
		arg0.method5712();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5708(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!oaa;BLclient!os;)V")
	public void method1704(@OriginalArg(0) Class208 arg0, @OriginalArg(2) Class39_Sub3 arg1) {
		if (arg1.aClass181_Sub3_3 == null) {
			return;
		}
		this.method1701(arg1);
		@Pc(17) float local17 = arg1.aClass181_Sub3_3.aFloat147;
		@Pc(21) float local21 = arg1.aClass181_Sub3_3.aFloat153;
		@Pc(31) float local31 = arg1.aClass181_Sub3_3.aFloat148;
		@Pc(35) float local35 = arg1.aClass181_Sub3_3.aFloat150;
		try {
			@Pc(45) int local45;
			@Pc(53) int local53;
			@Pc(78) Class6_Sub1 local78;
			@Pc(91) int local91;
			@Pc(185) int local185;
			if (arg0.aBoolean470) {
				local45 = arg0.anInt6255 - arg0.anInt6256;
				if (local45 + 2 <= 1600) {
					local45 += 2;
					local53 = 0;
				} else {
					local53 = Static451.method6881(local45) + 1 - this.anInt1795;
					local45 = (local45 >> local53) + 2;
				}
				@Pc(75) Class6_Sub1 local75 = arg0.aClass210_1.aClass6_Sub1_7;
				local78 = local75.aClass6_Sub1_9;
				@Pc(80) int local80 = -2;
				@Pc(82) boolean local82 = true;
				@Pc(84) boolean local84 = true;
				while (local75 != local78) {
					this.anInt1796 = 0;
					for (local91 = 0; local91 < local45; local91++) {
						this.anIntArray137[local91] = 0;
					}
					for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
						this.anIntArray135[local108] = 0;
					}
					while (local75 != local78) {
						@Pc(126) Class6_Sub1_Sub2 local126 = (Class6_Sub1_Sub2) local78;
						if (local84) {
							local84 = false;
							local82 = local126.aBoolean597;
							local80 = local126.anInt8127;
						} else if (local80 != local126.anInt8127 || local126.aBoolean597 != local82) {
							local84 = true;
							break;
						}
						local185 = (int) (local31 * (float) (local126.anInt8124 >> 12) + (float) (local126.anInt8123 >> 12) * local17 + local21 * (float) (local126.anInt8129 >> 12) + local35) - arg0.anInt6256 >> local53;
						if (local185 < 1600) {
							if (this.anIntArray137[local185] < 64) {
								this.aClass6_Sub1_Sub2ArrayArray1[local185][this.anIntArray137[local185]++] = local126;
							} else {
								label192: {
									if (this.anIntArray137[local185] == 64) {
										if (this.anInt1796 == 64) {
											break label192;
										}
										this.anIntArray137[local185] += this.anInt1796++ + 1;
									}
									this.aClass6_Sub1_Sub2ArrayArray2[this.anIntArray137[local185] - 1 - 64][this.anIntArray135[this.anIntArray137[local185] - 64 - 1]++] = local126;
								}
							}
						}
						local78 = local78.aClass6_Sub1_9;
					}
					if (local80 < 0) {
						arg1.method5686(-1);
					} else {
						arg1.method5686(local80);
					}
					if (local82 && arg1.aFloat159 != Static265.aFloat183) {
						arg1.M(Static265.aFloat183);
					} else if (arg1.aFloat159 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method1698(local45, arg1);
				}
			} else {
				local45 = 0;
				local53 = Integer.MAX_VALUE;
				@Pc(330) int local330 = 0;
				local78 = arg0.aClass210_1.aClass6_Sub1_7;
				@Pc(337) Class6_Sub1 local337;
				@Pc(369) int local369;
				for (local337 = local78.aClass6_Sub1_9; local337 != local78; local337 = local337.aClass6_Sub1_9) {
					@Pc(342) Class6_Sub1_Sub2 local342 = (Class6_Sub1_Sub2) local337;
					local369 = (int) ((float) (local342.anInt8123 >> 12) * local17 + (float) (local342.anInt8129 >> 12) * local21 + local31 * (float) (local342.anInt8124 >> 12) + local35);
					if (local369 < local53) {
						local53 = local369;
					}
					if (local369 > local330) {
						local330 = local369;
					}
					this.anIntArray136[local45++] = local369;
				}
				@Pc(396) int local396 = local330 - local53;
				if (local396 + 2 <= 1600) {
					local369 = 0;
					local396 += 2;
				} else {
					local369 = Static451.method6881(local396) + 1 - this.anInt1795;
					local396 = (local396 >> local369) + 2;
				}
				local337 = local78.aClass6_Sub1_9;
				local45 = 0;
				local91 = -2;
				@Pc(431) boolean local431 = true;
				@Pc(433) boolean local433 = true;
				while (local78 != local337) {
					this.anInt1796 = 0;
					for (local185 = 0; local185 < local396; local185++) {
						this.anIntArray137[local185] = 0;
					}
					for (@Pc(453) int local453 = 0; local453 < 64; local453++) {
						this.anIntArray135[local453] = 0;
					}
					while (local337 != local78) {
						@Pc(471) Class6_Sub1_Sub2 local471 = (Class6_Sub1_Sub2) local337;
						if (local433) {
							local431 = local471.aBoolean597;
							local91 = local471.anInt8127;
							local433 = false;
						}
						if (local45 > 0 && (local471.anInt8127 != local91 || local431 != local471.aBoolean597)) {
							local433 = true;
							break;
						}
						@Pc(509) int local509 = this.anIntArray136[local45++] - local53 >> local369;
						if (local509 < 1600) {
							if (this.anIntArray137[local509] < 64) {
								this.aClass6_Sub1_Sub2ArrayArray1[local509][this.anIntArray137[local509]++] = local471;
							} else {
								label142: {
									if (this.anIntArray137[local509] == 64) {
										if (this.anInt1796 == 64) {
											break label142;
										}
										this.anIntArray137[local509] += this.anInt1796++ + 1;
									}
									@Pc(576) Class6_Sub1_Sub2[] local576 = this.aClass6_Sub1_Sub2ArrayArray2[this.anIntArray137[local509] - 64 - 1];
									@Pc(586) int local586 = this.anIntArray137[local509] - 1 - 64;
									@Pc(588) int local588 = this.anIntArray135[this.anIntArray137[local509] - 1 - 64];
									this.anIntArray135[local586] = this.anIntArray135[this.anIntArray137[local509] - 1 - 64] + 1;
									local576[local588] = local471;
								}
							}
						}
						local337 = local337.aClass6_Sub1_9;
					}
					if (local91 >= 0) {
						arg1.method5686(local91);
					} else {
						arg1.method5686(-1);
					}
					if (local431 && Static265.aFloat183 != arg1.aFloat159) {
						arg1.M(Static265.aFloat183);
					} else if (arg1.aFloat159 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method1698(local396, arg1);
				}
			}
		} catch (@Pc(645) Exception local645) {
		}
		this.method1697(arg1);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!os;)V")
	public void method1705(@OriginalArg(1) Class39_Sub3 arg0) {
		this.anInterface10_2 = arg0.method5689(196584, null, 24, true);
		this.aClass11_2 = new Class11(this.anInterface10_2, 5126, 2, 0);
		this.aClass11_3 = new Class11(this.anInterface10_2, 5126, 3, 8);
		this.aClass11_1 = new Class11(this.anInterface10_2, 5121, 4, 20);
	}
}
