import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class17 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!bg;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!bg;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!nc;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!bg;")
	private Class21 aClass21_3;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "[F")
	private final float[] aFloatArray2 = new float[16];

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!rk;")
	private final Class1_Sub11_Sub2 aClass1_Sub11_Sub2_1 = new Class1_Sub11_Sub2(786336);

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	private final int anInt443 = Static66.method998(1600);

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[[Lclient!ar;")
	private final Class13_Sub1_Sub1[][] aClass13_Sub1_Sub1ArrayArray1 = new Class13_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "[I")
	private final int[] anIntArray20 = new int[64];

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "[I")
	private final int[] anIntArray21 = new int[1600];

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt445 = 0;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "[[Lclient!ar;")
	private final Class13_Sub1_Sub1[][] aClass13_Sub1_Sub1ArrayArray2 = new Class13_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
	private final int[] anIntArray22 = new int[8191];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLclient!od;)V")
	private void method383(@OriginalArg(1) Class128_Sub2 arg0) {
		arg0.method3668(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat59 != Static44.aFloat8) {
			arg0.ua(Static44.aFloat8);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!od;B)V")
	public void method384(@OriginalArg(0) Class128_Sub2 arg0) {
		this.anInterface10_1 = arg0.method3657(24, 196584, true, null);
		this.aClass21_3 = new Class21(this.anInterface10_1, 5126, 2, 0);
		this.aClass21_1 = new Class21(this.anInterface10_1, 5126, 3, 8);
		this.aClass21_2 = new Class21(this.anInterface10_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!po;Lclient!od;)V")
	public void method385(@OriginalArg(1) Class194 arg0, @OriginalArg(2) Class128_Sub2 arg1) {
		if (arg1.aClass40_Sub2_3 == null) {
			return;
		}
		this.method386(arg1);
		@Pc(22) float local22 = arg1.aClass40_Sub2_3.aFloat9;
		@Pc(26) float local26 = arg1.aClass40_Sub2_3.aFloat19;
		@Pc(30) float local30 = arg1.aClass40_Sub2_3.aFloat12;
		@Pc(34) float local34 = arg1.aClass40_Sub2_3.aFloat14;
		try {
			@Pc(44) int local44;
			@Pc(59) int local59;
			@Pc(77) Class13_Sub1 local77;
			@Pc(90) int local90;
			@Pc(236) Class13_Sub1_Sub1[] local236;
			@Pc(186) int local186;
			@Pc(244) int local244;
			@Pc(246) int local246;
			if (arg0.aBoolean420) {
				local44 = arg0.anInt5210 - arg0.anInt5211;
				if (local44 + 2 > 1600) {
					local59 = Static66.method998(local44) + 1 - this.anInt443;
					local44 = (local44 >> local59) + 2;
				} else {
					local44 += 2;
					local59 = 0;
				}
				@Pc(74) Class13_Sub1 local74 = arg0.aClass46_1.aClass13_Sub1_5;
				local77 = local74.aClass13_Sub1_7;
				@Pc(79) int local79 = -2;
				@Pc(81) boolean local81 = true;
				@Pc(83) boolean local83 = true;
				while (local77 != local74) {
					this.anInt445 = 0;
					for (local90 = 0; local90 < local44; local90++) {
						this.anIntArray21[local90] = 0;
					}
					for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
						this.anIntArray20[local107] = 0;
					}
					while (local74 != local77) {
						@Pc(123) Class13_Sub1_Sub1 local123 = (Class13_Sub1_Sub1) local77;
						if (local83) {
							local79 = local123.anInt3239;
							local83 = false;
							local81 = local123.aBoolean244;
						} else if (local123.anInt3239 != local79 || local81 != local123.aBoolean244) {
							local83 = true;
							break;
						}
						local186 = (int) (local22 * (float) (local123.anInt3243 >> Static35.anInt703) + local26 * (float) (local123.anInt3236 >> Static35.anInt703) + (float) (local123.anInt3237 >> Static35.anInt703) * local30 + local34) - arg0.anInt5211 >> local59;
						if (local186 < 1600) {
							if (this.anIntArray21[local186] >= 64) {
								label187: {
									if (this.anIntArray21[local186] == 64) {
										if (this.anInt445 == 64) {
											break label187;
										}
										this.anIntArray21[local186] += this.anInt445++ + 1;
									}
									local236 = this.aClass13_Sub1_Sub1ArrayArray2[this.anIntArray21[local186] - 64 - 1];
									local244 = this.anIntArray21[local186] - 65;
									local246 = this.anIntArray20[this.anIntArray21[local186] - 65];
									this.anIntArray20[local244] = this.anIntArray20[this.anIntArray21[local186] - 65] + 1;
									local236[local246] = local123;
								}
							} else {
								this.aClass13_Sub1_Sub1ArrayArray1[local186][this.anIntArray21[local186]++] = local123;
							}
						}
						local77 = local77.aClass13_Sub1_7;
					}
					if (local79 >= 0) {
						arg1.method3691(arg1.aClass185_1.method3894(local79));
						arg1.method3677(arg1.anInterface8_8.method1375(local79).anInt5367);
					} else {
						arg1.method3691(null);
					}
					if (local81 && arg1.aFloat59 != Static44.aFloat8) {
						arg1.ua(Static44.aFloat8);
					} else if (arg1.aFloat59 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method387(arg1, local44);
				}
			} else {
				local44 = 0;
				local59 = Integer.MAX_VALUE;
				@Pc(336) int local336 = 0;
				local77 = arg0.aClass46_1.aClass13_Sub1_5;
				@Pc(343) Class13_Sub1 local343;
				@Pc(375) int local375;
				for (local343 = local77.aClass13_Sub1_7; local343 != local77; local343 = local343.aClass13_Sub1_7) {
					@Pc(348) Class13_Sub1_Sub1 local348 = (Class13_Sub1_Sub1) local343;
					local375 = (int) (local34 + local22 * (float) (local348.anInt3243 >> Static35.anInt703) + (float) (local348.anInt3236 >> Static35.anInt703) * local26 + local30 * (float) (local348.anInt3237 >> Static35.anInt703));
					if (local375 > local336) {
						local336 = local375;
					}
					this.anIntArray22[local44++] = local375;
					if (local59 > local375) {
						local59 = local375;
					}
				}
				@Pc(406) int local406 = local336 - local59;
				if (local406 + 2 <= 1600) {
					local406 += 2;
					local375 = 0;
				} else {
					local375 = Static66.method998(local406) + 1 - this.anInt443;
					local406 = (local406 >> local375) + 2;
				}
				local343 = local77.aClass13_Sub1_7;
				local44 = 0;
				local90 = -2;
				@Pc(443) boolean local443 = true;
				@Pc(445) boolean local445 = true;
				while (local77 != local343) {
					this.anInt445 = 0;
					for (local186 = 0; local186 < local406; local186++) {
						this.anIntArray21[local186] = 0;
					}
					for (@Pc(469) int local469 = 0; local469 < 64; local469++) {
						this.anIntArray20[local469] = 0;
					}
					while (local343 != local77) {
						@Pc(487) Class13_Sub1_Sub1 local487 = (Class13_Sub1_Sub1) local343;
						if (local445) {
							local90 = local487.anInt3239;
							local445 = false;
							local443 = local487.aBoolean244;
						}
						if (local44 > 0 && (local90 != local487.anInt3239 || local487.aBoolean244 != local443)) {
							local445 = true;
							break;
						}
						@Pc(526) int local526 = this.anIntArray22[local44++] - local59 >> local375;
						if (local526 < 1600) {
							if (this.anIntArray21[local526] >= 64) {
								label137: {
									if (this.anIntArray21[local526] == 64) {
										if (this.anInt445 == 64) {
											break label137;
										}
										this.anIntArray21[local526] += this.anInt445++ + 1;
									}
									local236 = this.aClass13_Sub1_Sub1ArrayArray2[this.anIntArray21[local526] - 65];
									local244 = this.anIntArray21[local526] - 1 - 64;
									local246 = this.anIntArray20[this.anIntArray21[local526] - 1 - 64];
									this.anIntArray20[local244] = this.anIntArray20[this.anIntArray21[local526] - 1 - 64] + 1;
									local236[local246] = local487;
								}
							} else {
								this.aClass13_Sub1_Sub1ArrayArray1[local526][this.anIntArray21[local526]++] = local487;
							}
						}
						local343 = local343.aClass13_Sub1_7;
					}
					if (local90 >= 0) {
						arg1.method3691(arg1.aClass185_1.method3894(local90));
						arg1.method3677(arg1.anInterface8_8.method1375(local90).anInt5367);
					} else {
						arg1.method3691(null);
					}
					if (local443 && Static44.aFloat8 != arg1.aFloat59) {
						arg1.ua(Static44.aFloat8);
					} else if (arg1.aFloat59 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method387(arg1, local406);
				}
			}
		} catch (@Pc(672) Exception local672) {
		}
		this.method383(arg1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!od;I)V")
	private void method386(@OriginalArg(0) Class128_Sub2 arg0) {
		Static44.aFloat8 = arg0.aFloat59;
		arg0.method3633();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3668(false);
		arg0.method3652(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!od;I)V")
	private void method387(@OriginalArg(1) Class128_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray2, 0);
		@Pc(15) float local15 = this.aFloatArray2[0];
		@Pc(20) float local20 = this.aFloatArray2[4];
		@Pc(25) float local25 = this.aFloatArray2[8];
		@Pc(30) float local30 = this.aFloatArray2[1];
		@Pc(35) float local35 = this.aFloatArray2[5];
		@Pc(40) float local40 = this.aFloatArray2[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local25 + local40;
		@Pc(57) float local57 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(65) float local65 = local25 - local40;
		@Pc(69) float local69 = local30 - local15;
		@Pc(74) float local74 = local35 - local20;
		@Pc(79) float local79 = local40 - local25;
		this.aClass1_Sub11_Sub2_1.anInt5766 = 0;
		@Pc(90) int local90;
		@Pc(107) int local107;
		@Pc(116) int local116;
		@Pc(125) Class13_Sub1_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(491) float local491;
		@Pc(496) int local496;
		@Pc(436) int local436;
		@Pc(452) Class13_Sub1_Sub1 local452;
		@Pc(455) int local455;
		@Pc(468) byte local468;
		@Pc(473) byte local473;
		@Pc(485) float local485;
		if (arg0.aBoolean360) {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local107 = this.anIntArray21[local90] > 64 ? 64 : this.anIntArray21[local90];
				if (local107 > 0) {
					for (local116 = local107 - 1; local116 >= 0; local116--) {
						local125 = this.aClass13_Sub1_Sub1ArrayArray1[local90][local116];
						local128 = local125.anInt3241;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt3243 >> Static35.anInt703;
						local158 = local125.anInt3236 >> Static35.anInt703;
						local164 = local125.anInt3237 >> Static35.anInt703;
						local169 = local125.anInt3238 >> Static35.anInt703;
						this.aClass1_Sub11_Sub2_1.method4507(0.0F);
						this.aClass1_Sub11_Sub2_1.method4507(0.0F);
						this.aClass1_Sub11_Sub2_1.method4507(local152 + (float) -local169 * local44);
						this.aClass1_Sub11_Sub2_1.method4507(local158 + local48 * (float) -local169);
						this.aClass1_Sub11_Sub2_1.method4507(local164 + (float) -local169 * local52);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
						this.aClass1_Sub11_Sub2_1.method4507(1.0F);
						this.aClass1_Sub11_Sub2_1.method4507(0.0F);
						this.aClass1_Sub11_Sub2_1.method4507(local152 + local57 * (float) local169);
						this.aClass1_Sub11_Sub2_1.method4507(local158 + (float) local169 * local61);
						this.aClass1_Sub11_Sub2_1.method4507(local65 * (float) local169 + local164);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
						this.aClass1_Sub11_Sub2_1.method4507(1.0F);
						this.aClass1_Sub11_Sub2_1.method4507(1.0F);
						this.aClass1_Sub11_Sub2_1.method4507(local152 + local44 * (float) local169);
						this.aClass1_Sub11_Sub2_1.method4507(local48 * (float) local169 + local158);
						this.aClass1_Sub11_Sub2_1.method4507((float) local169 * local52 + local164);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
						this.aClass1_Sub11_Sub2_1.method4507(0.0F);
						this.aClass1_Sub11_Sub2_1.method4507(1.0F);
						this.aClass1_Sub11_Sub2_1.method4507((float) local169 * local69 + local152);
						this.aClass1_Sub11_Sub2_1.method4507(local158 + (float) local169 * local74);
						this.aClass1_Sub11_Sub2_1.method4507(local79 * (float) local169 + local164);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
					}
					if (this.anIntArray21[local90] > 64) {
						local436 = this.anIntArray21[local90] - 65;
						for (local128 = this.anIntArray20[local436] - 1; local128 >= 0; local128--) {
							local452 = this.aClass13_Sub1_Sub1ArrayArray2[local436][local128];
							local455 = local452.anInt3241;
							local141 = (byte) (local455 >> 16);
							local146 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local164 = local452.anInt3243 >> Static35.anInt703;
							local485 = local452.anInt3236 >> Static35.anInt703;
							local491 = local452.anInt3237 >> Static35.anInt703;
							local496 = local452.anInt3238 >> Static35.anInt703;
							this.aClass1_Sub11_Sub2_1.method4507(0.0F);
							this.aClass1_Sub11_Sub2_1.method4507(0.0F);
							this.aClass1_Sub11_Sub2_1.method4507(local164 + (float) -local496 * local44);
							this.aClass1_Sub11_Sub2_1.method4507(local485 + (float) -local496 * local48);
							this.aClass1_Sub11_Sub2_1.method4507(local52 * (float) -local496 + local491);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
							this.aClass1_Sub11_Sub2_1.method4507(1.0F);
							this.aClass1_Sub11_Sub2_1.method4507(0.0F);
							this.aClass1_Sub11_Sub2_1.method4507(local164 + local57 * (float) local496);
							this.aClass1_Sub11_Sub2_1.method4507(local61 * (float) local496 + local485);
							this.aClass1_Sub11_Sub2_1.method4507((float) local496 * local65 + local491);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
							this.aClass1_Sub11_Sub2_1.method4507(1.0F);
							this.aClass1_Sub11_Sub2_1.method4507(1.0F);
							this.aClass1_Sub11_Sub2_1.method4507(local44 * (float) local496 + local164);
							this.aClass1_Sub11_Sub2_1.method4507(local485 + local48 * (float) local496);
							this.aClass1_Sub11_Sub2_1.method4507(local52 * (float) local496 + local491);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
							this.aClass1_Sub11_Sub2_1.method4507(0.0F);
							this.aClass1_Sub11_Sub2_1.method4507(1.0F);
							this.aClass1_Sub11_Sub2_1.method4507(local164 + local69 * (float) local496);
							this.aClass1_Sub11_Sub2_1.method4507(local485 + (float) local496 * local74);
							this.aClass1_Sub11_Sub2_1.method4507((float) local496 * local79 + local491);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
						}
					}
				}
			}
		} else {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local107 = this.anIntArray21[local90] > 64 ? 64 : this.anIntArray21[local90];
				if (local107 > 0) {
					for (local116 = local107 - 1; local116 >= 0; local116--) {
						local125 = this.aClass13_Sub1_Sub1ArrayArray1[local90][local116];
						local128 = local125.anInt3241;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt3243 >> Static35.anInt703;
						local158 = local125.anInt3236 >> Static35.anInt703;
						local164 = local125.anInt3237 >> Static35.anInt703;
						local169 = local125.anInt3238 >> Static35.anInt703;
						this.aClass1_Sub11_Sub2_1.method4509(0.0F);
						this.aClass1_Sub11_Sub2_1.method4509(0.0F);
						this.aClass1_Sub11_Sub2_1.method4509((float) -local169 * local44 + local152);
						this.aClass1_Sub11_Sub2_1.method4509(local158 + local48 * (float) -local169);
						this.aClass1_Sub11_Sub2_1.method4509(local164 + local52 * (float) -local169);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
						this.aClass1_Sub11_Sub2_1.method4509(1.0F);
						this.aClass1_Sub11_Sub2_1.method4509(0.0F);
						this.aClass1_Sub11_Sub2_1.method4509((float) local169 * local57 + local152);
						this.aClass1_Sub11_Sub2_1.method4509(local158 + local61 * (float) local169);
						this.aClass1_Sub11_Sub2_1.method4509(local164 + local65 * (float) local169);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
						this.aClass1_Sub11_Sub2_1.method4509(1.0F);
						this.aClass1_Sub11_Sub2_1.method4509(1.0F);
						this.aClass1_Sub11_Sub2_1.method4509((float) local169 * local44 + local152);
						this.aClass1_Sub11_Sub2_1.method4509(local48 * (float) local169 + local158);
						this.aClass1_Sub11_Sub2_1.method4509(local164 + local52 * (float) local169);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
						this.aClass1_Sub11_Sub2_1.method4509(0.0F);
						this.aClass1_Sub11_Sub2_1.method4509(1.0F);
						this.aClass1_Sub11_Sub2_1.method4509(local69 * (float) local169 + local152);
						this.aClass1_Sub11_Sub2_1.method4509(local74 * (float) local169 + local158);
						this.aClass1_Sub11_Sub2_1.method4509(local164 + local79 * (float) local169);
						this.aClass1_Sub11_Sub2_1.method4445(local133);
						this.aClass1_Sub11_Sub2_1.method4445(local138);
						this.aClass1_Sub11_Sub2_1.method4445(local141);
						this.aClass1_Sub11_Sub2_1.method4445(local146);
					}
					if (this.anIntArray21[local90] > 64) {
						local436 = this.anIntArray21[local90] - 1 - 64;
						for (local128 = this.anIntArray20[local436] - 1; local128 >= 0; local128--) {
							local452 = this.aClass13_Sub1_Sub1ArrayArray2[local436][local128];
							local455 = local452.anInt3241;
							local141 = (byte) (local455 >> 16);
							local146 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local164 = local452.anInt3243 >> Static35.anInt703;
							local485 = local452.anInt3236 >> Static35.anInt703;
							local491 = local452.anInt3237 >> Static35.anInt703;
							local496 = local452.anInt3238 >> Static35.anInt703;
							this.aClass1_Sub11_Sub2_1.method4509(0.0F);
							this.aClass1_Sub11_Sub2_1.method4509(0.0F);
							this.aClass1_Sub11_Sub2_1.method4509(local164 + local44 * (float) -local496);
							this.aClass1_Sub11_Sub2_1.method4509(local485 + (float) -local496 * local48);
							this.aClass1_Sub11_Sub2_1.method4509((float) -local496 * local52 + local491);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
							this.aClass1_Sub11_Sub2_1.method4509(1.0F);
							this.aClass1_Sub11_Sub2_1.method4509(0.0F);
							this.aClass1_Sub11_Sub2_1.method4509(local164 + (float) local496 * local57);
							this.aClass1_Sub11_Sub2_1.method4509(local485 + local61 * (float) local496);
							this.aClass1_Sub11_Sub2_1.method4509(local65 * (float) local496 + local491);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
							this.aClass1_Sub11_Sub2_1.method4509(1.0F);
							this.aClass1_Sub11_Sub2_1.method4509(1.0F);
							this.aClass1_Sub11_Sub2_1.method4509(local164 + (float) local496 * local44);
							this.aClass1_Sub11_Sub2_1.method4509(local485 + local48 * (float) local496);
							this.aClass1_Sub11_Sub2_1.method4509(local491 + (float) local496 * local52);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
							this.aClass1_Sub11_Sub2_1.method4509(0.0F);
							this.aClass1_Sub11_Sub2_1.method4509(1.0F);
							this.aClass1_Sub11_Sub2_1.method4509(local164 + (float) local496 * local69);
							this.aClass1_Sub11_Sub2_1.method4509(local485 + (float) local496 * local74);
							this.aClass1_Sub11_Sub2_1.method4509(local491 + (float) local496 * local79);
							this.aClass1_Sub11_Sub2_1.method4445(local141);
							this.aClass1_Sub11_Sub2_1.method4445(local146);
							this.aClass1_Sub11_Sub2_1.method4445(local468);
							this.aClass1_Sub11_Sub2_1.method4445(local473);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub11_Sub2_1.anInt5766 != 0) {
			this.anInterface10_1.method4283(this.aClass1_Sub11_Sub2_1.aByteArray64, this.aClass1_Sub11_Sub2_1.anInt5766, 24);
			arg0.method3664(this.aClass21_3, this.aClass21_2, null, this.aClass21_1);
			arg0.method3645(this.aClass1_Sub11_Sub2_1.anInt5766 / 24);
		}
	}
}
