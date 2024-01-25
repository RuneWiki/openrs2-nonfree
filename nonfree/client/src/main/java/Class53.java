import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class53 {

	@OriginalMember(owner = "client!cga", name = "l", descriptor = "Lclient!mba;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!cga", name = "m", descriptor = "Lclient!mba;")
	private Class209 aClass209_2;

	@OriginalMember(owner = "client!cga", name = "n", descriptor = "Lclient!mba;")
	private Class209 aClass209_3;

	@OriginalMember(owner = "client!cga", name = "o", descriptor = "Lclient!nu;")
	private Interface16 anInterface16_1;

	@OriginalMember(owner = "client!cga", name = "k", descriptor = "[F")
	private final float[] aFloatArray25 = new float[16];

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "Lclient!ij;")
	private final Class4_Sub13_Sub1 aClass4_Sub13_Sub1_1 = new Class4_Sub13_Sub1(786336);

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
	private final int anInt1732 = Static507.method7317(1600);

	@OriginalMember(owner = "client!cga", name = "s", descriptor = "I")
	private int anInt1733 = 0;

	@OriginalMember(owner = "client!cga", name = "q", descriptor = "[I")
	private final int[] anIntArray68 = new int[8191];

	@OriginalMember(owner = "client!cga", name = "r", descriptor = "[I")
	private final int[] anIntArray69 = new int[64];

	@OriginalMember(owner = "client!cga", name = "t", descriptor = "[[Lclient!dg;")
	private final Class21_Sub3_Sub1[][] aClass21_Sub3_Sub1ArrayArray3 = new Class21_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!cga", name = "u", descriptor = "[[Lclient!dg;")
	private final Class21_Sub3_Sub1[][] aClass21_Sub3_Sub1ArrayArray4 = new Class21_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!cga", name = "v", descriptor = "[I")
	private final int[] anIntArray70 = new int[1600];

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IILclient!kfa;Lclient!qg;)V")
	public void method1451(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub2 arg1, @OriginalArg(3) Class276 arg2) {
		if (arg1.aClass81_Sub2_3 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method1459(arg1, arg0);
		} else {
			this.method1457(arg1);
		}
		@Pc(34) float local34 = arg1.aClass81_Sub2_3.aFloat84;
		@Pc(38) float local38 = arg1.aClass81_Sub2_3.aFloat85;
		@Pc(42) float local42 = arg1.aClass81_Sub2_3.aFloat86;
		@Pc(46) float local46 = arg1.aClass81_Sub2_3.aFloat93;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class21_Sub3 local56 = arg2.aClass39_1.aClass21_Sub3_1;
			@Pc(59) Class21_Sub3 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass21_Sub3_9; local59 != local56; local59 = local59.aClass21_Sub3_9) {
				@Pc(64) Class21_Sub3_Sub1 local64 = (Class21_Sub3_Sub1) local59;
				local91 = (int) (local46 + (float) (local64.anInt8632 >> 12) * local34 + (float) (local64.anInt8629 >> 12) * local38 + (float) (local64.anInt8627 >> 12) * local42);
				if (local91 < local50) {
					local50 = local91;
				}
				if (local91 > local52) {
					local52 = local91;
				}
				this.anIntArray68[local48++] = local91;
			}
			@Pc(122) int local122 = local52 - local50;
			if (local122 + 2 <= 1600) {
				local91 = 0;
				local122 += 2;
			} else {
				local91 = Static507.method7317(local122) + 1 - this.anInt1732;
				local122 = (local122 >> local91) + 2;
			}
			local48 = 0;
			local59 = local56.aClass21_Sub3_9;
			@Pc(155) int local155 = -2;
			@Pc(157) boolean local157 = true;
			@Pc(159) boolean local159 = true;
			while (local56 != local59) {
				this.anInt1733 = 0;
				for (@Pc(166) int local166 = 0; local166 < local122; local166++) {
					this.anIntArray70[local166] = 0;
				}
				for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
					this.anIntArray69[local183] = 0;
				}
				while (local59 != local56) {
					@Pc(201) Class21_Sub3_Sub1 local201 = (Class21_Sub3_Sub1) local59;
					if (local159) {
						local157 = local201.aBoolean610;
						local159 = false;
						local155 = local201.anInt8630;
					}
					if (local48 > 0 && (local155 != local201.anInt8630 || local201.aBoolean610 != local157)) {
						local159 = true;
						break;
					}
					@Pc(240) int local240 = this.anIntArray68[local48++] - local50 >> local91;
					if (local240 < 1600) {
						if (this.anIntArray70[local240] < 64) {
							this.aClass21_Sub3_Sub1ArrayArray4[local240][this.anIntArray70[local240]++] = local201;
						} else {
							label101: {
								if (this.anIntArray70[local240] == 64) {
									if (this.anInt1733 == 64) {
										break label101;
									}
									this.anIntArray70[local240] += this.anInt1733++ + 1;
								}
								@Pc(311) Class21_Sub3_Sub1[] local311 = this.aClass21_Sub3_Sub1ArrayArray3[this.anIntArray70[local240] - 1 - 64];
								@Pc(321) int local321 = this.anIntArray70[local240] - 64 - 1;
								@Pc(323) int local323 = this.anIntArray69[this.anIntArray70[local240] - 64 - 1];
								this.anIntArray69[local321] = this.anIntArray69[this.anIntArray70[local240] - 64 - 1] + 1;
								local311[local323] = local201;
							}
						}
					}
					local59 = local59.aClass21_Sub3_9;
				}
				if (local155 >= 0) {
					arg1.method4339(local155);
				} else {
					arg1.method4339(-1);
				}
				if (local157 && Static581.aFloat218 != arg1.aFloat127) {
					arg1.ra(Static581.aFloat218);
				} else if (arg1.aFloat127 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method1453(local122, arg1);
			}
		} catch (@Pc(381) Exception local381) {
		}
		this.method1456(arg1);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IILclient!kfa;)V")
	private void method1453(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray25, 0);
		@Pc(15) float local15 = this.aFloatArray25[0];
		@Pc(20) float local20 = this.aFloatArray25[4];
		@Pc(25) float local25 = this.aFloatArray25[8];
		@Pc(36) float local36 = this.aFloatArray25[1];
		@Pc(41) float local41 = this.aFloatArray25[5];
		@Pc(46) float local46 = this.aFloatArray25[9];
		@Pc(50) float local50 = local15 + local36;
		@Pc(54) float local54 = local41 + local20;
		@Pc(58) float local58 = local25 + local46;
		@Pc(63) float local63 = local15 - local36;
		@Pc(68) float local68 = local20 - local41;
		@Pc(72) float local72 = local25 - local46;
		@Pc(76) float local76 = local36 - local15;
		@Pc(80) float local80 = local41 - local20;
		this.aClass4_Sub13_Sub1_1.anInt9170 = 0;
		@Pc(89) float local89 = local46 - local25;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class21_Sub3_Sub1 local128;
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
		@Pc(449) Class21_Sub3_Sub1 local449;
		@Pc(452) int local452;
		@Pc(465) byte local465;
		@Pc(470) byte local470;
		@Pc(482) float local482;
		if (arg1.aBoolean388) {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray70[local96] > 64 ? 64 : this.anIntArray70[local96];
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass21_Sub3_Sub1ArrayArray4[local96][local119];
						local131 = local128.anInt8631;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt8632 >> 12;
						local161 = local128.anInt8629 >> 12;
						local167 = local128.anInt8627 >> 12;
						local172 = local128.anInt8623 >> 12;
						this.aClass4_Sub13_Sub1_1.method3608(0.0F);
						this.aClass4_Sub13_Sub1_1.method3608(0.0F);
						this.aClass4_Sub13_Sub1_1.method3608(local50 * (float) -local172 + local155);
						this.aClass4_Sub13_Sub1_1.method3608(local161 + local54 * (float) -local172);
						this.aClass4_Sub13_Sub1_1.method3608(local58 * (float) -local172 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
						this.aClass4_Sub13_Sub1_1.method3608(1.0F);
						this.aClass4_Sub13_Sub1_1.method3608(0.0F);
						this.aClass4_Sub13_Sub1_1.method3608(local155 + local63 * (float) local172);
						this.aClass4_Sub13_Sub1_1.method3608((float) local172 * local68 + local161);
						this.aClass4_Sub13_Sub1_1.method3608((float) local172 * local72 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
						this.aClass4_Sub13_Sub1_1.method3608(1.0F);
						this.aClass4_Sub13_Sub1_1.method3608(1.0F);
						this.aClass4_Sub13_Sub1_1.method3608(local155 + (float) local172 * local50);
						this.aClass4_Sub13_Sub1_1.method3608((float) local172 * local54 + local161);
						this.aClass4_Sub13_Sub1_1.method3608((float) local172 * local58 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
						this.aClass4_Sub13_Sub1_1.method3608(0.0F);
						this.aClass4_Sub13_Sub1_1.method3608(1.0F);
						this.aClass4_Sub13_Sub1_1.method3608((float) local172 * local76 + local155);
						this.aClass4_Sub13_Sub1_1.method3608(local161 + (float) local172 * local80);
						this.aClass4_Sub13_Sub1_1.method3608((float) local172 * local89 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
					}
					if (this.anIntArray70[local96] > 64) {
						local433 = this.anIntArray70[local96] - 65;
						for (local131 = this.anIntArray69[local433] - 1; local131 >= 0; local131--) {
							local449 = this.aClass21_Sub3_Sub1ArrayArray3[local433][local131];
							local452 = local449.anInt8631;
							local144 = (byte) (local452 >> 16);
							local149 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local167 = local449.anInt8632 >> 12;
							local482 = local449.anInt8629 >> 12;
							local488 = local449.anInt8627 >> 12;
							local493 = local449.anInt8623 >> 12;
							this.aClass4_Sub13_Sub1_1.method3608(0.0F);
							this.aClass4_Sub13_Sub1_1.method3608(0.0F);
							this.aClass4_Sub13_Sub1_1.method3608((float) -local493 * local50 + local167);
							this.aClass4_Sub13_Sub1_1.method3608(local54 * (float) -local493 + local482);
							this.aClass4_Sub13_Sub1_1.method3608(local488 + (float) -local493 * local58);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
							this.aClass4_Sub13_Sub1_1.method3608(1.0F);
							this.aClass4_Sub13_Sub1_1.method3608(0.0F);
							this.aClass4_Sub13_Sub1_1.method3608(local63 * (float) local493 + local167);
							this.aClass4_Sub13_Sub1_1.method3608(local68 * (float) local493 + local482);
							this.aClass4_Sub13_Sub1_1.method3608(local488 + local72 * (float) local493);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
							this.aClass4_Sub13_Sub1_1.method3608(1.0F);
							this.aClass4_Sub13_Sub1_1.method3608(1.0F);
							this.aClass4_Sub13_Sub1_1.method3608(local167 + (float) local493 * local50);
							this.aClass4_Sub13_Sub1_1.method3608(local482 + (float) local493 * local54);
							this.aClass4_Sub13_Sub1_1.method3608((float) local493 * local58 + local488);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
							this.aClass4_Sub13_Sub1_1.method3608(0.0F);
							this.aClass4_Sub13_Sub1_1.method3608(1.0F);
							this.aClass4_Sub13_Sub1_1.method3608(local167 + local76 * (float) local493);
							this.aClass4_Sub13_Sub1_1.method3608((float) local493 * local80 + local482);
							this.aClass4_Sub13_Sub1_1.method3608(local488 + (float) local493 * local89);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
						}
					}
				}
			}
		} else {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray70[local96] > 64 ? 64 : this.anIntArray70[local96];
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass21_Sub3_Sub1ArrayArray4[local96][local119];
						local131 = local128.anInt8631;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt8632 >> 12;
						local161 = local128.anInt8629 >> 12;
						local167 = local128.anInt8627 >> 12;
						local172 = local128.anInt8623 >> 12;
						this.aClass4_Sub13_Sub1_1.method3607(0.0F);
						this.aClass4_Sub13_Sub1_1.method3607(0.0F);
						this.aClass4_Sub13_Sub1_1.method3607(local155 + (float) -local172 * local50);
						this.aClass4_Sub13_Sub1_1.method3607(local54 * (float) -local172 + local161);
						this.aClass4_Sub13_Sub1_1.method3607((float) -local172 * local58 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
						this.aClass4_Sub13_Sub1_1.method3607(1.0F);
						this.aClass4_Sub13_Sub1_1.method3607(0.0F);
						this.aClass4_Sub13_Sub1_1.method3607(local155 + (float) local172 * local63);
						this.aClass4_Sub13_Sub1_1.method3607(local161 + local68 * (float) local172);
						this.aClass4_Sub13_Sub1_1.method3607((float) local172 * local72 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
						this.aClass4_Sub13_Sub1_1.method3607(1.0F);
						this.aClass4_Sub13_Sub1_1.method3607(1.0F);
						this.aClass4_Sub13_Sub1_1.method3607(local50 * (float) local172 + local155);
						this.aClass4_Sub13_Sub1_1.method3607(local54 * (float) local172 + local161);
						this.aClass4_Sub13_Sub1_1.method3607((float) local172 * local58 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
						this.aClass4_Sub13_Sub1_1.method3607(0.0F);
						this.aClass4_Sub13_Sub1_1.method3607(1.0F);
						this.aClass4_Sub13_Sub1_1.method3607(local76 * (float) local172 + local155);
						this.aClass4_Sub13_Sub1_1.method3607(local161 + (float) local172 * local80);
						this.aClass4_Sub13_Sub1_1.method3607(local89 * (float) local172 + local167);
						this.aClass4_Sub13_Sub1_1.method7052(local136);
						this.aClass4_Sub13_Sub1_1.method7052(local141);
						this.aClass4_Sub13_Sub1_1.method7052(local144);
						this.aClass4_Sub13_Sub1_1.method7052(local149);
					}
					if (this.anIntArray70[local96] > 64) {
						local433 = this.anIntArray70[local96] - 65;
						for (local131 = this.anIntArray69[local433] - 1; local131 >= 0; local131--) {
							local449 = this.aClass21_Sub3_Sub1ArrayArray3[local433][local131];
							local452 = local449.anInt8631;
							local144 = (byte) (local452 >> 16);
							local149 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local167 = local449.anInt8632 >> 12;
							local482 = local449.anInt8629 >> 12;
							local488 = local449.anInt8627 >> 12;
							local493 = local449.anInt8623 >> 12;
							this.aClass4_Sub13_Sub1_1.method3607(0.0F);
							this.aClass4_Sub13_Sub1_1.method3607(0.0F);
							this.aClass4_Sub13_Sub1_1.method3607((float) -local493 * local50 + local167);
							this.aClass4_Sub13_Sub1_1.method3607(local482 + local54 * (float) -local493);
							this.aClass4_Sub13_Sub1_1.method3607(local488 + local58 * (float) -local493);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
							this.aClass4_Sub13_Sub1_1.method3607(1.0F);
							this.aClass4_Sub13_Sub1_1.method3607(0.0F);
							this.aClass4_Sub13_Sub1_1.method3607((float) local493 * local63 + local167);
							this.aClass4_Sub13_Sub1_1.method3607(local482 + (float) local493 * local68);
							this.aClass4_Sub13_Sub1_1.method3607((float) local493 * local72 + local488);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
							this.aClass4_Sub13_Sub1_1.method3607(1.0F);
							this.aClass4_Sub13_Sub1_1.method3607(1.0F);
							this.aClass4_Sub13_Sub1_1.method3607(local167 + local50 * (float) local493);
							this.aClass4_Sub13_Sub1_1.method3607(local482 + (float) local493 * local54);
							this.aClass4_Sub13_Sub1_1.method3607(local58 * (float) local493 + local488);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
							this.aClass4_Sub13_Sub1_1.method3607(0.0F);
							this.aClass4_Sub13_Sub1_1.method3607(1.0F);
							this.aClass4_Sub13_Sub1_1.method3607(local76 * (float) local493 + local167);
							this.aClass4_Sub13_Sub1_1.method3607(local482 + (float) local493 * local80);
							this.aClass4_Sub13_Sub1_1.method3607(local488 + local89 * (float) local493);
							this.aClass4_Sub13_Sub1_1.method7052(local144);
							this.aClass4_Sub13_Sub1_1.method7052(local149);
							this.aClass4_Sub13_Sub1_1.method7052(local465);
							this.aClass4_Sub13_Sub1_1.method7052(local470);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub13_Sub1_1.anInt9170 != 0) {
			this.anInterface16_1.method6365(this.aClass4_Sub13_Sub1_1.aByteArray88, 24, this.aClass4_Sub13_Sub1_1.anInt9170);
			arg1.method4354(null, this.aClass209_1, this.aClass209_3, this.aClass209_2);
			arg1.method4304(this.aClass4_Sub13_Sub1_1.anInt9170 / 24);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!kfa;)V")
	private void method1456(@OriginalArg(1) Class7_Sub2 arg0) {
		arg0.method4293(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static581.aFloat218 != arg0.aFloat127) {
			arg0.ra(Static581.aFloat218);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BLclient!kfa;)V")
	private void method1457(@OriginalArg(1) Class7_Sub2 arg0) {
		Static581.aFloat218 = arg0.aFloat127;
		arg0.method4329();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4293(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(BLclient!kfa;)V")
	public void method1458(@OriginalArg(1) Class7_Sub2 arg0) {
		this.anInterface16_1 = arg0.method4301(null, 24, true, 196584);
		this.aClass209_2 = new Class209(this.anInterface16_1, 5126, 2, 0);
		this.aClass209_1 = new Class209(this.anInterface16_1, 5126, 3, 8);
		this.aClass209_3 = new Class209(this.anInterface16_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!kfa;IB)V")
	private void method1459(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static581.aFloat218 = arg0.aFloat127;
		arg0.method4277((float) arg1);
		arg0.method4287();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4293(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
