import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class272 {

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!wfa;")
	private Interface26 anInterface26_6;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!nba;")
	private Class243 aClass243_10;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!nba;")
	private Class243 aClass243_11;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!nba;")
	private Class243 aClass243_12;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[F")
	private final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!iw;")
	private final Class3_Sub17_Sub1 aClass3_Sub17_Sub1_3 = new Class3_Sub17_Sub1(786336);

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
	private final int anInt7695 = Static289.method7950(1600);

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
	private final int[] anIntArray465 = new int[8191];

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "[[Lclient!ln;")
	private final Class23_Sub1_Sub2[][] aClass23_Sub1_Sub2ArrayArray1 = new Class23_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
	private final int[] anIntArray466 = new int[64];

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "[I")
	private final int[] anIntArray467 = new int[1600];

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
	private int anInt7696 = 0;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "[[Lclient!ln;")
	private final Class23_Sub1_Sub2[][] aClass23_Sub1_Sub2ArrayArray2 = new Class23_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!mf;Lclient!hk;I)V")
	public void method6442(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class16_Sub2 arg2) {
		if (arg2.aClass25_Sub1_3 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method6447(arg0, arg2);
		} else {
			this.method6445(arg2);
		}
		@Pc(28) float local28 = arg2.aClass25_Sub1_3.aFloat42;
		@Pc(32) float local32 = arg2.aClass25_Sub1_3.aFloat37;
		@Pc(36) float local36 = arg2.aClass25_Sub1_3.aFloat45;
		@Pc(40) float local40 = arg2.aClass25_Sub1_3.aFloat39;
		try {
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = Integer.MAX_VALUE;
			@Pc(46) int local46 = 0;
			@Pc(50) Class23_Sub1 local50 = arg1.aClass125_1.aClass23_Sub1_5;
			@Pc(53) Class23_Sub1 local53;
			@Pc(87) int local87;
			for (local53 = local50.aClass23_Sub1_9; local53 != local50; local53 = local53.aClass23_Sub1_9) {
				@Pc(60) Class23_Sub1_Sub2 local60 = (Class23_Sub1_Sub2) local53;
				local87 = (int) (local40 + (float) (local60.anInt7855 >> 12) * local28 + local32 * (float) (local60.anInt7853 >> 12) + (float) (local60.anInt7850 >> 12) * local36);
				this.anIntArray465[local42++] = local87;
				if (local87 > local46) {
					local46 = local87;
				}
				if (local44 > local87) {
					local44 = local87;
				}
			}
			@Pc(118) int local118 = local46 - local44;
			if (local118 + 2 > 1600) {
				local87 = Static289.method7950(local118) + 1 - this.anInt7695;
				local118 = (local118 >> local87) + 2;
			} else {
				local87 = 0;
				local118 += 2;
			}
			local42 = 0;
			local53 = local50.aClass23_Sub1_9;
			@Pc(152) int local152 = -2;
			@Pc(154) boolean local154 = true;
			@Pc(156) boolean local156 = true;
			while (local50 != local53) {
				this.anInt7696 = 0;
				for (@Pc(163) int local163 = 0; local163 < local118; local163++) {
					this.anIntArray467[local163] = 0;
				}
				for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
					this.anIntArray466[local176] = 0;
				}
				while (local53 != local50) {
					@Pc(194) Class23_Sub1_Sub2 local194 = (Class23_Sub1_Sub2) local53;
					if (local156) {
						local156 = false;
						local154 = local194.aBoolean594;
						local152 = local194.anInt7852;
					}
					if (local42 > 0 && (local194.anInt7852 != local152 || local194.aBoolean594 != local154)) {
						local156 = true;
						break;
					}
					@Pc(233) int local233 = this.anIntArray465[local42++] - local44 >> local87;
					if (local233 < 1600) {
						if (this.anIntArray467[local233] < 64) {
							this.aClass23_Sub1_Sub2ArrayArray2[local233][this.anIntArray467[local233]++] = local194;
						} else {
							label96: {
								if (this.anIntArray467[local233] == 64) {
									if (this.anInt7696 == 64) {
										break label96;
									}
									this.anIntArray467[local233] += this.anInt7696++ + 1;
								}
								@Pc(301) Class23_Sub1_Sub2[] local301 = this.aClass23_Sub1_Sub2ArrayArray1[this.anIntArray467[local233] - 64 - 1];
								@Pc(309) int local309 = this.anIntArray467[local233] - 65;
								@Pc(311) int local311 = this.anIntArray466[this.anIntArray467[local233] - 65];
								this.anIntArray466[local309] = this.anIntArray466[this.anIntArray467[local233] - 65] + 1;
								local301[local311] = local194;
							}
						}
					}
					local53 = local53.aClass23_Sub1_9;
				}
				if (local152 >= 0) {
					arg2.method3687(local152);
				} else {
					arg2.method3687(-1);
				}
				if (local154 && Static316.aFloat149 != arg2.aFloat86) {
					arg2.xa(Static316.aFloat149);
				} else if (arg2.aFloat86 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method6448(arg2, local118);
			}
		} catch (@Pc(365) Exception local365) {
		}
		this.method6444(arg2);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!hk;)V")
	private void method6444(@OriginalArg(1) Class16_Sub2 arg0) {
		arg0.method3617(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat86 != Static316.aFloat149) {
			arg0.xa(Static316.aFloat149);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!hk;I)V")
	private void method6445(@OriginalArg(0) Class16_Sub2 arg0) {
		Static316.aFloat149 = arg0.aFloat86;
		arg0.method3690();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3617(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lclient!hk;I)V")
	public void method6446(@OriginalArg(0) Class16_Sub2 arg0) {
		this.anInterface26_6 = arg0.method3643(24, true, (byte[]) null, 196584);
		this.aClass243_10 = new Class243(this.anInterface26_6, 5126, 2, 0);
		this.aClass243_12 = new Class243(this.anInterface26_6, 5126, 3, 8);
		this.aClass243_11 = new Class243(this.anInterface26_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!hk;Z)V")
	private void method6447(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub2 arg1) {
		Static316.aFloat149 = arg1.aFloat86;
		arg1.method3695((float) arg0);
		arg1.method3666();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method3617(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!hk;IB)V")
	private void method6448(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray61, 0);
		@Pc(15) float local15 = this.aFloatArray61[0];
		@Pc(20) float local20 = this.aFloatArray61[4];
		@Pc(25) float local25 = this.aFloatArray61[8];
		@Pc(30) float local30 = this.aFloatArray61[1];
		@Pc(35) float local35 = this.aFloatArray61[5];
		@Pc(44) float local44 = this.aFloatArray61[9];
		@Pc(48) float local48 = local30 + local15;
		@Pc(52) float local52 = local20 + local35;
		@Pc(56) float local56 = local44 + local25;
		@Pc(61) float local61 = local15 - local30;
		@Pc(66) float local66 = local20 - local35;
		@Pc(71) float local71 = local25 - local44;
		@Pc(75) float local75 = local30 - local15;
		@Pc(79) float local79 = local35 - local20;
		@Pc(84) float local84 = local44 - local25;
		this.aClass3_Sub17_Sub1_3.lb = 0;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class23_Sub1_Sub2 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(513) float local513;
		@Pc(518) int local518;
		@Pc(458) int local458;
		@Pc(474) Class23_Sub1_Sub2 local474;
		@Pc(477) int local477;
		@Pc(490) byte local490;
		@Pc(495) byte local495;
		@Pc(507) float local507;
		if (arg0.aBoolean322) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray467[local95] <= 64 ? this.anIntArray467[local95] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass23_Sub1_Sub2ArrayArray2[local95][local119];
						local131 = local128.anInt7856;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt7855 >> 12);
						local161 = (float) (local128.anInt7853 >> 12);
						local167 = (float) (local128.anInt7850 >> 12);
						local172 = local128.anInt7857 >> 12;
						this.aClass3_Sub17_Sub1_3.method4226(0.0F);
						this.aClass3_Sub17_Sub1_3.method4226(0.0F);
						this.aClass3_Sub17_Sub1_3.method4226((float) -local172 * local48 + local155);
						this.aClass3_Sub17_Sub1_3.method4226(local161 + local52 * (float) -local172);
						this.aClass3_Sub17_Sub1_3.method4226(local56 * (float) -local172 + local167);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
						this.aClass3_Sub17_Sub1_3.method4226(1.0F);
						this.aClass3_Sub17_Sub1_3.method4226(0.0F);
						this.aClass3_Sub17_Sub1_3.method4226(local155 + (float) local172 * local61);
						this.aClass3_Sub17_Sub1_3.method4226((float) local172 * local66 + local161);
						this.aClass3_Sub17_Sub1_3.method4226(local71 * (float) local172 + local167);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
						this.aClass3_Sub17_Sub1_3.method4226(1.0F);
						this.aClass3_Sub17_Sub1_3.method4226(1.0F);
						this.aClass3_Sub17_Sub1_3.method4226((float) local172 * local48 + local155);
						this.aClass3_Sub17_Sub1_3.method4226(local52 * (float) local172 + local161);
						this.aClass3_Sub17_Sub1_3.method4226(local167 + local56 * (float) local172);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
						this.aClass3_Sub17_Sub1_3.method4226(0.0F);
						this.aClass3_Sub17_Sub1_3.method4226(1.0F);
						this.aClass3_Sub17_Sub1_3.method4226(local75 * (float) local172 + local155);
						this.aClass3_Sub17_Sub1_3.method4226(local161 + (float) local172 * local79);
						this.aClass3_Sub17_Sub1_3.method4226((float) local172 * local84 + local167);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
					}
					if (this.anIntArray467[local95] > 64) {
						local458 = this.anIntArray467[local95] - 64 - 1;
						for (local131 = this.anIntArray466[local458] - 1; local131 >= 0; local131--) {
							local474 = this.aClass23_Sub1_Sub2ArrayArray1[local458][local131];
							local477 = local474.anInt7856;
							local144 = (byte) (local477 >> 16);
							local149 = (byte) (local477 >> 8);
							local490 = (byte) local477;
							local495 = (byte) (local477 >>> 24);
							local167 = (float) (local474.anInt7855 >> 12);
							local507 = (float) (local474.anInt7853 >> 12);
							local513 = (float) (local474.anInt7850 >> 12);
							local518 = local474.anInt7857 >> 12;
							this.aClass3_Sub17_Sub1_3.method4226(0.0F);
							this.aClass3_Sub17_Sub1_3.method4226(0.0F);
							this.aClass3_Sub17_Sub1_3.method4226((float) -local518 * local48 + local167);
							this.aClass3_Sub17_Sub1_3.method4226(local507 + local52 * (float) -local518);
							this.aClass3_Sub17_Sub1_3.method4226(local56 * (float) -local518 + local513);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
							this.aClass3_Sub17_Sub1_3.method4226(1.0F);
							this.aClass3_Sub17_Sub1_3.method4226(0.0F);
							this.aClass3_Sub17_Sub1_3.method4226((float) local518 * local61 + local167);
							this.aClass3_Sub17_Sub1_3.method4226(local66 * (float) local518 + local507);
							this.aClass3_Sub17_Sub1_3.method4226(local513 + local71 * (float) local518);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
							this.aClass3_Sub17_Sub1_3.method4226(1.0F);
							this.aClass3_Sub17_Sub1_3.method4226(1.0F);
							this.aClass3_Sub17_Sub1_3.method4226(local167 + local48 * (float) local518);
							this.aClass3_Sub17_Sub1_3.method4226((float) local518 * local52 + local507);
							this.aClass3_Sub17_Sub1_3.method4226((float) local518 * local56 + local513);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
							this.aClass3_Sub17_Sub1_3.method4226(0.0F);
							this.aClass3_Sub17_Sub1_3.method4226(1.0F);
							this.aClass3_Sub17_Sub1_3.method4226(local167 + local75 * (float) local518);
							this.aClass3_Sub17_Sub1_3.method4226(local79 * (float) local518 + local507);
							this.aClass3_Sub17_Sub1_3.method4226(local513 + local84 * (float) local518);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray467[local95] > 64 ? 64 : this.anIntArray467[local95];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass23_Sub1_Sub2ArrayArray2[local95][local119];
						local131 = local128.anInt7856;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt7855 >> 12);
						local161 = (float) (local128.anInt7853 >> 12);
						local167 = (float) (local128.anInt7850 >> 12);
						local172 = local128.anInt7857 >> 12;
						this.aClass3_Sub17_Sub1_3.method4229(0.0F);
						this.aClass3_Sub17_Sub1_3.method4229(0.0F);
						this.aClass3_Sub17_Sub1_3.method4229((float) -local172 * local48 + local155);
						this.aClass3_Sub17_Sub1_3.method4229(local161 + local52 * (float) -local172);
						this.aClass3_Sub17_Sub1_3.method4229(local56 * (float) -local172 + local167);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
						this.aClass3_Sub17_Sub1_3.method4229(1.0F);
						this.aClass3_Sub17_Sub1_3.method4229(0.0F);
						this.aClass3_Sub17_Sub1_3.method4229(local61 * (float) local172 + local155);
						this.aClass3_Sub17_Sub1_3.method4229(local161 + (float) local172 * local66);
						this.aClass3_Sub17_Sub1_3.method4229(local167 + (float) local172 * local71);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
						this.aClass3_Sub17_Sub1_3.method4229(1.0F);
						this.aClass3_Sub17_Sub1_3.method4229(1.0F);
						this.aClass3_Sub17_Sub1_3.method4229(local155 + local48 * (float) local172);
						this.aClass3_Sub17_Sub1_3.method4229(local52 * (float) local172 + local161);
						this.aClass3_Sub17_Sub1_3.method4229(local56 * (float) local172 + local167);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
						this.aClass3_Sub17_Sub1_3.method4229(0.0F);
						this.aClass3_Sub17_Sub1_3.method4229(1.0F);
						this.aClass3_Sub17_Sub1_3.method4229(local155 + (float) local172 * local75);
						this.aClass3_Sub17_Sub1_3.method4229((float) local172 * local79 + local161);
						this.aClass3_Sub17_Sub1_3.method4229((float) local172 * local84 + local167);
						this.aClass3_Sub17_Sub1_3.method4849(local136);
						this.aClass3_Sub17_Sub1_3.method4849(local141);
						this.aClass3_Sub17_Sub1_3.method4849(local144);
						this.aClass3_Sub17_Sub1_3.method4849(local149);
					}
					if (this.anIntArray467[local95] > 64) {
						local458 = this.anIntArray467[local95] - 1 - 64;
						for (local131 = this.anIntArray466[local458] - 1; local131 >= 0; local131--) {
							local474 = this.aClass23_Sub1_Sub2ArrayArray1[local458][local131];
							local477 = local474.anInt7856;
							local144 = (byte) (local477 >> 16);
							local149 = (byte) (local477 >> 8);
							local490 = (byte) local477;
							local495 = (byte) (local477 >>> 24);
							local167 = (float) (local474.anInt7855 >> 12);
							local507 = (float) (local474.anInt7853 >> 12);
							local513 = (float) (local474.anInt7850 >> 12);
							local518 = local474.anInt7857 >> 12;
							this.aClass3_Sub17_Sub1_3.method4229(0.0F);
							this.aClass3_Sub17_Sub1_3.method4229(0.0F);
							this.aClass3_Sub17_Sub1_3.method4229((float) -local518 * local48 + local167);
							this.aClass3_Sub17_Sub1_3.method4229((float) -local518 * local52 + local507);
							this.aClass3_Sub17_Sub1_3.method4229(local513 + local56 * (float) -local518);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
							this.aClass3_Sub17_Sub1_3.method4229(1.0F);
							this.aClass3_Sub17_Sub1_3.method4229(0.0F);
							this.aClass3_Sub17_Sub1_3.method4229(local167 + local61 * (float) local518);
							this.aClass3_Sub17_Sub1_3.method4229((float) local518 * local66 + local507);
							this.aClass3_Sub17_Sub1_3.method4229((float) local518 * local71 + local513);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
							this.aClass3_Sub17_Sub1_3.method4229(1.0F);
							this.aClass3_Sub17_Sub1_3.method4229(1.0F);
							this.aClass3_Sub17_Sub1_3.method4229(local48 * (float) local518 + local167);
							this.aClass3_Sub17_Sub1_3.method4229(local507 + local52 * (float) local518);
							this.aClass3_Sub17_Sub1_3.method4229(local56 * (float) local518 + local513);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
							this.aClass3_Sub17_Sub1_3.method4229(0.0F);
							this.aClass3_Sub17_Sub1_3.method4229(1.0F);
							this.aClass3_Sub17_Sub1_3.method4229((float) local518 * local75 + local167);
							this.aClass3_Sub17_Sub1_3.method4229(local79 * (float) local518 + local507);
							this.aClass3_Sub17_Sub1_3.method4229(local513 + local84 * (float) local518);
							this.aClass3_Sub17_Sub1_3.method4849(local144);
							this.aClass3_Sub17_Sub1_3.method4849(local149);
							this.aClass3_Sub17_Sub1_3.method4849(local490);
							this.aClass3_Sub17_Sub1_3.method4849(local495);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub17_Sub1_3.lb != 0) {
			this.anInterface26_6.method5257(this.aClass3_Sub17_Sub1_3.aByteArray59, 24, this.aClass3_Sub17_Sub1_3.lb);
			arg0.method3629(this.aClass243_12, (Class243) null, this.aClass243_10, this.aClass243_11);
			arg0.method3623(this.aClass3_Sub17_Sub1_3.lb / 24);
		}
	}
}
