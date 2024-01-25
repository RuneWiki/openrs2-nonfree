import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class200 {

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!kb;")
	private Class194 aClass194_4;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!ic;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!kb;")
	private Class194 aClass194_5;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!kb;")
	private Class194 aClass194_6;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "[F")
	private final float[] aFloatArray18 = new float[16];

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!dca;")
	private final Class5_Sub15_Sub1 aClass5_Sub15_Sub1_2 = new Class5_Sub15_Sub1(786336);

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	private final int anInt4658 = Static187.method2726(1600);

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "[[Lclient!qja;")
	private final Class41_Sub4_Sub1[][] aClass41_Sub4_Sub1ArrayArray4 = new Class41_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	private int anInt4660 = 0;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[[Lclient!qja;")
	private final Class41_Sub4_Sub1[][] aClass41_Sub4_Sub1ArrayArray3 = new Class41_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "[I")
	private final int[] anIntArray273 = new int[64];

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
	private final int[] anIntArray272 = new int[8191];

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "[I")
	private final int[] anIntArray274 = new int[1600];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!kv;I)V")
	private void method4090(@OriginalArg(1) Class143_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static26.aFloat5 = arg0.aFloat105;
		arg0.method5000((float) arg1);
		arg0.method5005();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4931(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!kv;Lclient!hea;IB)V")
	public void method4091(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass56_Sub3_3 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method4090(arg0, arg2);
		} else {
			this.method4093(arg0);
		}
		@Pc(26) float local26 = arg0.aClass56_Sub3_3.aFloat180;
		@Pc(30) float local30 = arg0.aClass56_Sub3_3.aFloat182;
		@Pc(34) float local34 = arg0.aClass56_Sub3_3.aFloat188;
		@Pc(38) float local38 = arg0.aClass56_Sub3_3.aFloat183;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class41_Sub4 local48 = arg1.aClass382_1.aClass41_Sub4_9;
			@Pc(51) Class41_Sub4 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass41_Sub4_7; local51 != local48; local51 = local51.aClass41_Sub4_7) {
				@Pc(56) Class41_Sub4_Sub1 local56 = (Class41_Sub4_Sub1) local51;
				local83 = (int) (local38 + local34 * (float) (local56.anInt4484 >> 12) + local26 * (float) (local56.anInt4483 >> 12) + local30 * (float) (local56.anInt4485 >> 12));
				if (local42 > local83) {
					local42 = local83;
				}
				if (local44 < local83) {
					local44 = local83;
				}
				this.anIntArray272[local40++] = local83;
			}
			@Pc(110) int local110 = local44 - local42;
			if (local110 + 2 <= 1600) {
				local110 += 2;
				local83 = 0;
			} else {
				local83 = Static187.method2726(local110) + 1 - this.anInt4658;
				local110 = (local110 >> local83) + 2;
			}
			local40 = 0;
			local51 = local48.aClass41_Sub4_7;
			@Pc(150) int local150 = -2;
			@Pc(152) boolean local152 = true;
			@Pc(154) boolean local154 = true;
			while (local51 != local48) {
				this.anInt4660 = 0;
				for (@Pc(161) int local161 = 0; local161 < local110; local161++) {
					this.anIntArray274[local161] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray273[local178] = 0;
				}
				while (local51 != local48) {
					@Pc(196) Class41_Sub4_Sub1 local196 = (Class41_Sub4_Sub1) local51;
					if (local154) {
						local152 = local196.aBoolean298;
						local154 = false;
						local150 = local196.anInt4482;
					}
					if (local40 > 0 && (local196.anInt4482 != local150 || local152 != local196.aBoolean298)) {
						local154 = true;
						break;
					}
					@Pc(238) int local238 = this.anIntArray272[local40++] - local42 >> local83;
					if (local238 < 1600) {
						if (this.anIntArray274[local238] < 64) {
							this.aClass41_Sub4_Sub1ArrayArray3[local238][this.anIntArray274[local238]++] = local196;
						} else {
							label102: {
								if (this.anIntArray274[local238] == 64) {
									if (this.anInt4660 == 64) {
										break label102;
									}
									this.anIntArray274[local238] += this.anInt4660++ + 1;
								}
								this.aClass41_Sub4_Sub1ArrayArray4[this.anIntArray274[local238] - 64 - 1][this.anIntArray273[this.anIntArray274[local238] - 64 - 1]++] = local196;
							}
						}
					}
					local51 = local51.aClass41_Sub4_7;
				}
				if (local150 >= 0) {
					arg0.method4978(local150);
				} else {
					arg0.method4978(-1);
				}
				if (local152 && Static26.aFloat5 != arg0.aFloat105) {
					arg0.xa(Static26.aFloat5);
				} else if (arg0.aFloat105 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method4095(arg0, local110);
			}
		} catch (@Pc(376) Exception local376) {
		}
		this.method4092(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!kv;I)V")
	private void method4092(@OriginalArg(0) Class143_Sub2 arg0) {
		arg0.method4931(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static26.aFloat5 != arg0.aFloat105) {
			arg0.xa(Static26.aFloat5);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!kv;)V")
	private void method4093(@OriginalArg(1) Class143_Sub2 arg0) {
		Static26.aFloat5 = arg0.aFloat105;
		arg0.method4932();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4931(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!kv;BI)V")
	private void method4095(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray18, 0);
		@Pc(15) float local15 = this.aFloatArray18[0];
		@Pc(20) float local20 = this.aFloatArray18[4];
		@Pc(25) float local25 = this.aFloatArray18[8];
		@Pc(30) float local30 = this.aFloatArray18[1];
		@Pc(35) float local35 = this.aFloatArray18[5];
		@Pc(40) float local40 = this.aFloatArray18[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local25 + local40;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(71) float local71 = local30 - local15;
		@Pc(81) float local81 = local35 - local20;
		this.aClass5_Sub15_Sub1_2.anInt4144 = 0;
		@Pc(89) float local89 = local40 - local25;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class41_Sub4_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(502) float local502;
		@Pc(507) int local507;
		@Pc(447) int local447;
		@Pc(463) Class41_Sub4_Sub1 local463;
		@Pc(466) int local466;
		@Pc(479) byte local479;
		@Pc(484) byte local484;
		@Pc(496) float local496;
		if (arg0.aBoolean408) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray274[local96] <= 64 ? this.anIntArray274[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass41_Sub4_Sub1ArrayArray3[local96][local119];
						local131 = local128.anInt4489;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt4483 >> 12);
						local161 = (float) (local128.anInt4485 >> 12);
						local167 = (float) (local128.anInt4484 >> 12);
						local172 = local128.anInt4488 >> 12;
						this.aClass5_Sub15_Sub1_2.method1614(0.0F);
						this.aClass5_Sub15_Sub1_2.method1614(0.0F);
						this.aClass5_Sub15_Sub1_2.method1614(local155 + local44 * (float) -local172);
						this.aClass5_Sub15_Sub1_2.method1614((float) -local172 * local48 + local161);
						this.aClass5_Sub15_Sub1_2.method1614((float) -local172 * local52 + local167);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
						this.aClass5_Sub15_Sub1_2.method1614(1.0F);
						this.aClass5_Sub15_Sub1_2.method1614(0.0F);
						this.aClass5_Sub15_Sub1_2.method1614(local155 + local56 * (float) local172);
						this.aClass5_Sub15_Sub1_2.method1614((float) local172 * local61 + local161);
						this.aClass5_Sub15_Sub1_2.method1614(local66 * (float) local172 + local167);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
						this.aClass5_Sub15_Sub1_2.method1614(1.0F);
						this.aClass5_Sub15_Sub1_2.method1614(1.0F);
						this.aClass5_Sub15_Sub1_2.method1614(local44 * (float) local172 + local155);
						this.aClass5_Sub15_Sub1_2.method1614(local161 + (float) local172 * local48);
						this.aClass5_Sub15_Sub1_2.method1614(local167 + (float) local172 * local52);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
						this.aClass5_Sub15_Sub1_2.method1614(0.0F);
						this.aClass5_Sub15_Sub1_2.method1614(1.0F);
						this.aClass5_Sub15_Sub1_2.method1614((float) local172 * local71 + local155);
						this.aClass5_Sub15_Sub1_2.method1614(local161 + local81 * (float) local172);
						this.aClass5_Sub15_Sub1_2.method1614(local167 + local89 * (float) local172);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
					}
					if (this.anIntArray274[local96] > 64) {
						local447 = this.anIntArray274[local96] - 1 - 64;
						for (local131 = this.anIntArray273[local447] - 1; local131 >= 0; local131--) {
							local463 = this.aClass41_Sub4_Sub1ArrayArray4[local447][local131];
							local466 = local463.anInt4489;
							local144 = (byte) (local466 >> 16);
							local149 = (byte) (local466 >> 8);
							local479 = (byte) local466;
							local484 = (byte) (local466 >>> 24);
							local167 = (float) (local463.anInt4483 >> 12);
							local496 = (float) (local463.anInt4485 >> 12);
							local502 = (float) (local463.anInt4484 >> 12);
							local507 = local463.anInt4488 >> 12;
							this.aClass5_Sub15_Sub1_2.method1614(0.0F);
							this.aClass5_Sub15_Sub1_2.method1614(0.0F);
							this.aClass5_Sub15_Sub1_2.method1614((float) -local507 * local44 + local167);
							this.aClass5_Sub15_Sub1_2.method1614((float) -local507 * local48 + local496);
							this.aClass5_Sub15_Sub1_2.method1614(local52 * (float) -local507 + local502);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
							this.aClass5_Sub15_Sub1_2.method1614(1.0F);
							this.aClass5_Sub15_Sub1_2.method1614(0.0F);
							this.aClass5_Sub15_Sub1_2.method1614((float) local507 * local56 + local167);
							this.aClass5_Sub15_Sub1_2.method1614(local61 * (float) local507 + local496);
							this.aClass5_Sub15_Sub1_2.method1614(local502 + local66 * (float) local507);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
							this.aClass5_Sub15_Sub1_2.method1614(1.0F);
							this.aClass5_Sub15_Sub1_2.method1614(1.0F);
							this.aClass5_Sub15_Sub1_2.method1614(local167 + local44 * (float) local507);
							this.aClass5_Sub15_Sub1_2.method1614((float) local507 * local48 + local496);
							this.aClass5_Sub15_Sub1_2.method1614((float) local507 * local52 + local502);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
							this.aClass5_Sub15_Sub1_2.method1614(0.0F);
							this.aClass5_Sub15_Sub1_2.method1614(1.0F);
							this.aClass5_Sub15_Sub1_2.method1614(local167 + local71 * (float) local507);
							this.aClass5_Sub15_Sub1_2.method1614(local496 + local81 * (float) local507);
							this.aClass5_Sub15_Sub1_2.method1614((float) local507 * local89 + local502);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray274[local96] > 64 ? 64 : this.anIntArray274[local96];
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass41_Sub4_Sub1ArrayArray3[local96][local119];
						local131 = local128.anInt4489;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt4483 >> 12);
						local161 = (float) (local128.anInt4485 >> 12);
						local167 = (float) (local128.anInt4484 >> 12);
						local172 = local128.anInt4488 >> 12;
						this.aClass5_Sub15_Sub1_2.method1612(0.0F);
						this.aClass5_Sub15_Sub1_2.method1612(0.0F);
						this.aClass5_Sub15_Sub1_2.method1612((float) -local172 * local44 + local155);
						this.aClass5_Sub15_Sub1_2.method1612(local48 * (float) -local172 + local161);
						this.aClass5_Sub15_Sub1_2.method1612(local167 + local52 * (float) -local172);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
						this.aClass5_Sub15_Sub1_2.method1612(1.0F);
						this.aClass5_Sub15_Sub1_2.method1612(0.0F);
						this.aClass5_Sub15_Sub1_2.method1612(local56 * (float) local172 + local155);
						this.aClass5_Sub15_Sub1_2.method1612(local61 * (float) local172 + local161);
						this.aClass5_Sub15_Sub1_2.method1612(local66 * (float) local172 + local167);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
						this.aClass5_Sub15_Sub1_2.method1612(1.0F);
						this.aClass5_Sub15_Sub1_2.method1612(1.0F);
						this.aClass5_Sub15_Sub1_2.method1612(local44 * (float) local172 + local155);
						this.aClass5_Sub15_Sub1_2.method1612(local161 + local48 * (float) local172);
						this.aClass5_Sub15_Sub1_2.method1612(local167 + local52 * (float) local172);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
						this.aClass5_Sub15_Sub1_2.method1612(0.0F);
						this.aClass5_Sub15_Sub1_2.method1612(1.0F);
						this.aClass5_Sub15_Sub1_2.method1612(local155 + local71 * (float) local172);
						this.aClass5_Sub15_Sub1_2.method1612(local161 + (float) local172 * local81);
						this.aClass5_Sub15_Sub1_2.method1612((float) local172 * local89 + local167);
						this.aClass5_Sub15_Sub1_2.method3651(local136);
						this.aClass5_Sub15_Sub1_2.method3651(local141);
						this.aClass5_Sub15_Sub1_2.method3651(local144);
						this.aClass5_Sub15_Sub1_2.method3651(local149);
					}
					if (this.anIntArray274[local96] > 64) {
						local447 = this.anIntArray274[local96] - 1 - 64;
						for (local131 = this.anIntArray273[local447] - 1; local131 >= 0; local131--) {
							local463 = this.aClass41_Sub4_Sub1ArrayArray4[local447][local131];
							local466 = local463.anInt4489;
							local144 = (byte) (local466 >> 16);
							local149 = (byte) (local466 >> 8);
							local479 = (byte) local466;
							local484 = (byte) (local466 >>> 24);
							local167 = (float) (local463.anInt4483 >> 12);
							local496 = (float) (local463.anInt4485 >> 12);
							local502 = (float) (local463.anInt4484 >> 12);
							local507 = local463.anInt4488 >> 12;
							this.aClass5_Sub15_Sub1_2.method1612(0.0F);
							this.aClass5_Sub15_Sub1_2.method1612(0.0F);
							this.aClass5_Sub15_Sub1_2.method1612(local167 + (float) -local507 * local44);
							this.aClass5_Sub15_Sub1_2.method1612((float) -local507 * local48 + local496);
							this.aClass5_Sub15_Sub1_2.method1612(local502 + (float) -local507 * local52);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
							this.aClass5_Sub15_Sub1_2.method1612(1.0F);
							this.aClass5_Sub15_Sub1_2.method1612(0.0F);
							this.aClass5_Sub15_Sub1_2.method1612(local167 + (float) local507 * local56);
							this.aClass5_Sub15_Sub1_2.method1612(local496 + local61 * (float) local507);
							this.aClass5_Sub15_Sub1_2.method1612(local502 + local66 * (float) local507);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
							this.aClass5_Sub15_Sub1_2.method1612(1.0F);
							this.aClass5_Sub15_Sub1_2.method1612(1.0F);
							this.aClass5_Sub15_Sub1_2.method1612((float) local507 * local44 + local167);
							this.aClass5_Sub15_Sub1_2.method1612(local48 * (float) local507 + local496);
							this.aClass5_Sub15_Sub1_2.method1612(local502 + (float) local507 * local52);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
							this.aClass5_Sub15_Sub1_2.method1612(0.0F);
							this.aClass5_Sub15_Sub1_2.method1612(1.0F);
							this.aClass5_Sub15_Sub1_2.method1612(local167 + (float) local507 * local71);
							this.aClass5_Sub15_Sub1_2.method1612((float) local507 * local81 + local496);
							this.aClass5_Sub15_Sub1_2.method1612(local502 + (float) local507 * local89);
							this.aClass5_Sub15_Sub1_2.method3651(local144);
							this.aClass5_Sub15_Sub1_2.method3651(local149);
							this.aClass5_Sub15_Sub1_2.method3651(local479);
							this.aClass5_Sub15_Sub1_2.method3651(local484);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub15_Sub1_2.anInt4144 != 0) {
			this.anInterface8_3.method8688(this.aClass5_Sub15_Sub1_2.aByteArray45, this.aClass5_Sub15_Sub1_2.anInt4144, 24);
			arg0.method4970(this.aClass194_6, this.aClass194_4, this.aClass194_5, (Class194) null);
			arg0.method4961(this.aClass5_Sub15_Sub1_2.anInt4144 / 24);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!kv;)V")
	public void method4096(@OriginalArg(1) Class143_Sub2 arg0) {
		this.anInterface8_3 = arg0.method4986(196584, (byte[]) null, 24, true);
		this.aClass194_4 = new Class194(this.anInterface8_3, 5126, 2, 0);
		this.aClass194_6 = new Class194(this.anInterface8_3, 5126, 3, 8);
		this.aClass194_5 = new Class194(this.anInterface8_3, 5121, 4, 20);
	}
}
