import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class128 {

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "Lclient!gr;")
	private Class112 aClass112_7;

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "Lclient!gr;")
	private Class112 aClass112_8;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "Lclient!gr;")
	private Class112 aClass112_9;

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "Lclient!bo;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "[F")
	private final float[] aFloatArray34 = new float[16];

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!vw;")
	private final Class3_Sub27_Sub2 aClass3_Sub27_Sub2_2 = new Class3_Sub27_Sub2(786336);

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
	private final int anInt4326 = Static192.method3681(1600);

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "[I")
	private final int[] anIntArray402 = new int[1600];

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "[I")
	private final int[] anIntArray404 = new int[8191];

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
	private int anInt4327 = 0;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "[[Lclient!nba;")
	private final Class4_Sub3_Sub1[][] aClass4_Sub3_Sub1ArrayArray1 = new Class4_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "[I")
	private final int[] anIntArray403 = new int[64];

	@OriginalMember(owner = "client!hu", name = "A", descriptor = "[[Lclient!nba;")
	private final Class4_Sub3_Sub1[][] aClass4_Sub3_Sub1ArrayArray2 = new Class4_Sub3_Sub1[1600][64];

	static {
		new Class67("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!ad;I)V")
	private void method3576(@OriginalArg(0) Class5_Sub1 arg0) {
		arg0.method413(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat7 != Static422.aFloat255) {
			arg0.ha(Static422.aFloat255);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLclient!ad;)V")
	private void method3579(@OriginalArg(1) Class5_Sub1 arg0) {
		Static422.aFloat255 = arg0.aFloat7;
		arg0.method381();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method413(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLclient!ad;I)V")
	private void method3580(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray34, 0);
		@Pc(15) float local15 = this.aFloatArray34[0];
		@Pc(20) float local20 = this.aFloatArray34[4];
		@Pc(25) float local25 = this.aFloatArray34[8];
		@Pc(30) float local30 = this.aFloatArray34[1];
		@Pc(35) float local35 = this.aFloatArray34[5];
		@Pc(40) float local40 = this.aFloatArray34[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(59) float local59 = local25 + local40;
		@Pc(63) float local63 = local15 - local30;
		@Pc(68) float local68 = local20 - local35;
		@Pc(73) float local73 = local25 - local40;
		@Pc(78) float local78 = local30 - local15;
		@Pc(83) float local83 = local35 - local20;
		@Pc(88) float local88 = local40 - local25;
		this.aClass3_Sub27_Sub2_2.anInt9191 = 0;
		@Pc(99) int local99;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(134) Class4_Sub3_Sub1 local134;
		@Pc(137) int local137;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(150) byte local150;
		@Pc(155) byte local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(173) float local173;
		@Pc(178) int local178;
		@Pc(497) float local497;
		@Pc(502) int local502;
		@Pc(442) int local442;
		@Pc(458) Class4_Sub3_Sub1 local458;
		@Pc(461) int local461;
		@Pc(474) byte local474;
		@Pc(479) byte local479;
		@Pc(491) float local491;
		if (arg0.aBoolean39) {
			for (local99 = arg1 - 1; local99 >= 0; local99--) {
				local116 = this.anIntArray402[local99] > 64 ? 64 : this.anIntArray402[local99];
				if (local116 > 0) {
					for (local125 = local116 - 1; local125 >= 0; local125--) {
						local134 = this.aClass4_Sub3_Sub1ArrayArray2[local99][local125];
						local137 = local134.anInt5222;
						local142 = (byte) (local137 >> 16);
						local147 = (byte) (local137 >> 8);
						local150 = (byte) local137;
						local155 = (byte) (local137 >>> 24);
						local161 = local134.anInt5229 >> 12;
						local167 = local134.anInt5228 >> 12;
						local173 = local134.anInt5221 >> 12;
						local178 = local134.anInt5219 >> 12;
						this.aClass3_Sub27_Sub2_2.method7616(0.0F);
						this.aClass3_Sub27_Sub2_2.method7616(0.0F);
						this.aClass3_Sub27_Sub2_2.method7616(local161 + local44 * (float) -local178);
						this.aClass3_Sub27_Sub2_2.method7616(local167 + (float) -local178 * local48);
						this.aClass3_Sub27_Sub2_2.method7616(local173 + local59 * (float) -local178);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
						this.aClass3_Sub27_Sub2_2.method7616(1.0F);
						this.aClass3_Sub27_Sub2_2.method7616(0.0F);
						this.aClass3_Sub27_Sub2_2.method7616(local63 * (float) local178 + local161);
						this.aClass3_Sub27_Sub2_2.method7616(local68 * (float) local178 + local167);
						this.aClass3_Sub27_Sub2_2.method7616(local173 + local73 * (float) local178);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
						this.aClass3_Sub27_Sub2_2.method7616(1.0F);
						this.aClass3_Sub27_Sub2_2.method7616(1.0F);
						this.aClass3_Sub27_Sub2_2.method7616((float) local178 * local44 + local161);
						this.aClass3_Sub27_Sub2_2.method7616((float) local178 * local48 + local167);
						this.aClass3_Sub27_Sub2_2.method7616(local173 + local59 * (float) local178);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
						this.aClass3_Sub27_Sub2_2.method7616(0.0F);
						this.aClass3_Sub27_Sub2_2.method7616(1.0F);
						this.aClass3_Sub27_Sub2_2.method7616(local161 + local78 * (float) local178);
						this.aClass3_Sub27_Sub2_2.method7616(local83 * (float) local178 + local167);
						this.aClass3_Sub27_Sub2_2.method7616(local88 * (float) local178 + local173);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
					}
					if (this.anIntArray402[local99] > 64) {
						local442 = this.anIntArray402[local99] - 64 - 1;
						for (local137 = this.anIntArray403[local442] - 1; local137 >= 0; local137--) {
							local458 = this.aClass4_Sub3_Sub1ArrayArray1[local442][local137];
							local461 = local458.anInt5222;
							local150 = (byte) (local461 >> 16);
							local155 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local173 = local458.anInt5229 >> 12;
							local491 = local458.anInt5228 >> 12;
							local497 = local458.anInt5221 >> 12;
							local502 = local458.anInt5219 >> 12;
							this.aClass3_Sub27_Sub2_2.method7616(0.0F);
							this.aClass3_Sub27_Sub2_2.method7616(0.0F);
							this.aClass3_Sub27_Sub2_2.method7616(local173 + (float) -local502 * local44);
							this.aClass3_Sub27_Sub2_2.method7616(local491 + (float) -local502 * local48);
							this.aClass3_Sub27_Sub2_2.method7616((float) -local502 * local59 + local497);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
							this.aClass3_Sub27_Sub2_2.method7616(1.0F);
							this.aClass3_Sub27_Sub2_2.method7616(0.0F);
							this.aClass3_Sub27_Sub2_2.method7616(local173 + (float) local502 * local63);
							this.aClass3_Sub27_Sub2_2.method7616(local491 + (float) local502 * local68);
							this.aClass3_Sub27_Sub2_2.method7616(local73 * (float) local502 + local497);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
							this.aClass3_Sub27_Sub2_2.method7616(1.0F);
							this.aClass3_Sub27_Sub2_2.method7616(1.0F);
							this.aClass3_Sub27_Sub2_2.method7616((float) local502 * local44 + local173);
							this.aClass3_Sub27_Sub2_2.method7616((float) local502 * local48 + local491);
							this.aClass3_Sub27_Sub2_2.method7616((float) local502 * local59 + local497);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
							this.aClass3_Sub27_Sub2_2.method7616(0.0F);
							this.aClass3_Sub27_Sub2_2.method7616(1.0F);
							this.aClass3_Sub27_Sub2_2.method7616(local173 + (float) local502 * local78);
							this.aClass3_Sub27_Sub2_2.method7616((float) local502 * local83 + local491);
							this.aClass3_Sub27_Sub2_2.method7616((float) local502 * local88 + local497);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
						}
					}
				}
			}
		} else {
			for (local99 = arg1 - 1; local99 >= 0; local99--) {
				local116 = this.anIntArray402[local99] <= 64 ? this.anIntArray402[local99] : 64;
				if (local116 > 0) {
					for (local125 = local116 - 1; local125 >= 0; local125--) {
						local134 = this.aClass4_Sub3_Sub1ArrayArray2[local99][local125];
						local137 = local134.anInt5222;
						local142 = (byte) (local137 >> 16);
						local147 = (byte) (local137 >> 8);
						local150 = (byte) local137;
						local155 = (byte) (local137 >>> 24);
						local161 = local134.anInt5229 >> 12;
						local167 = local134.anInt5228 >> 12;
						local173 = local134.anInt5221 >> 12;
						local178 = local134.anInt5219 >> 12;
						this.aClass3_Sub27_Sub2_2.method7615(0.0F);
						this.aClass3_Sub27_Sub2_2.method7615(0.0F);
						this.aClass3_Sub27_Sub2_2.method7615((float) -local178 * local44 + local161);
						this.aClass3_Sub27_Sub2_2.method7615(local167 + (float) -local178 * local48);
						this.aClass3_Sub27_Sub2_2.method7615(local59 * (float) -local178 + local173);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
						this.aClass3_Sub27_Sub2_2.method7615(1.0F);
						this.aClass3_Sub27_Sub2_2.method7615(0.0F);
						this.aClass3_Sub27_Sub2_2.method7615(local63 * (float) local178 + local161);
						this.aClass3_Sub27_Sub2_2.method7615(local68 * (float) local178 + local167);
						this.aClass3_Sub27_Sub2_2.method7615(local173 + (float) local178 * local73);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
						this.aClass3_Sub27_Sub2_2.method7615(1.0F);
						this.aClass3_Sub27_Sub2_2.method7615(1.0F);
						this.aClass3_Sub27_Sub2_2.method7615((float) local178 * local44 + local161);
						this.aClass3_Sub27_Sub2_2.method7615((float) local178 * local48 + local167);
						this.aClass3_Sub27_Sub2_2.method7615((float) local178 * local59 + local173);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
						this.aClass3_Sub27_Sub2_2.method7615(0.0F);
						this.aClass3_Sub27_Sub2_2.method7615(1.0F);
						this.aClass3_Sub27_Sub2_2.method7615(local161 + (float) local178 * local78);
						this.aClass3_Sub27_Sub2_2.method7615(local167 + (float) local178 * local83);
						this.aClass3_Sub27_Sub2_2.method7615(local88 * (float) local178 + local173);
						this.aClass3_Sub27_Sub2_2.method7576(local142);
						this.aClass3_Sub27_Sub2_2.method7576(local147);
						this.aClass3_Sub27_Sub2_2.method7576(local150);
						this.aClass3_Sub27_Sub2_2.method7576(local155);
					}
					if (this.anIntArray402[local99] > 64) {
						local442 = this.anIntArray402[local99] - 64 - 1;
						for (local137 = this.anIntArray403[local442] - 1; local137 >= 0; local137--) {
							local458 = this.aClass4_Sub3_Sub1ArrayArray1[local442][local137];
							local461 = local458.anInt5222;
							local150 = (byte) (local461 >> 16);
							local155 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local173 = local458.anInt5229 >> 12;
							local491 = local458.anInt5228 >> 12;
							local497 = local458.anInt5221 >> 12;
							local502 = local458.anInt5219 >> 12;
							this.aClass3_Sub27_Sub2_2.method7615(0.0F);
							this.aClass3_Sub27_Sub2_2.method7615(0.0F);
							this.aClass3_Sub27_Sub2_2.method7615(local173 + (float) -local502 * local44);
							this.aClass3_Sub27_Sub2_2.method7615(local491 + (float) -local502 * local48);
							this.aClass3_Sub27_Sub2_2.method7615((float) -local502 * local59 + local497);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
							this.aClass3_Sub27_Sub2_2.method7615(1.0F);
							this.aClass3_Sub27_Sub2_2.method7615(0.0F);
							this.aClass3_Sub27_Sub2_2.method7615(local63 * (float) local502 + local173);
							this.aClass3_Sub27_Sub2_2.method7615(local68 * (float) local502 + local491);
							this.aClass3_Sub27_Sub2_2.method7615(local497 + (float) local502 * local73);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
							this.aClass3_Sub27_Sub2_2.method7615(1.0F);
							this.aClass3_Sub27_Sub2_2.method7615(1.0F);
							this.aClass3_Sub27_Sub2_2.method7615(local44 * (float) local502 + local173);
							this.aClass3_Sub27_Sub2_2.method7615(local491 + (float) local502 * local48);
							this.aClass3_Sub27_Sub2_2.method7615(local497 + local59 * (float) local502);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
							this.aClass3_Sub27_Sub2_2.method7615(0.0F);
							this.aClass3_Sub27_Sub2_2.method7615(1.0F);
							this.aClass3_Sub27_Sub2_2.method7615(local173 + (float) local502 * local78);
							this.aClass3_Sub27_Sub2_2.method7615(local491 + (float) local502 * local83);
							this.aClass3_Sub27_Sub2_2.method7615(local497 + (float) local502 * local88);
							this.aClass3_Sub27_Sub2_2.method7576(local150);
							this.aClass3_Sub27_Sub2_2.method7576(local155);
							this.aClass3_Sub27_Sub2_2.method7576(local474);
							this.aClass3_Sub27_Sub2_2.method7576(local479);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub27_Sub2_2.anInt9191 != 0) {
			this.anInterface1_5.method7113(this.aClass3_Sub27_Sub2_2.anInt9191, this.aClass3_Sub27_Sub2_2.aByteArray114, 24);
			arg0.method383(this.aClass112_9, null, this.aClass112_8, this.aClass112_7);
			arg0.method409(this.aClass3_Sub27_Sub2_2.anInt9191 / 24);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!be;ILclient!ad;)V")
	public void method3583(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg1.aClass205_Sub3_4 == null) {
			return;
		}
		this.method3579(arg1);
		@Pc(17) float local17 = arg1.aClass205_Sub3_4.aFloat278;
		@Pc(21) float local21 = arg1.aClass205_Sub3_4.aFloat275;
		@Pc(25) float local25 = arg1.aClass205_Sub3_4.aFloat276;
		@Pc(29) float local29 = arg1.aClass205_Sub3_4.aFloat272;
		try {
			@Pc(42) int local42;
			@Pc(44) int local44;
			@Pc(50) Class4_Sub3 local50;
			@Pc(149) int local149;
			@Pc(160) int local160;
			@Pc(310) int local310;
			@Pc(312) int local312;
			@Pc(300) Class4_Sub3_Sub1[] local300;
			if (arg0.aBoolean66) {
				local42 = arg0.anInt804 - arg0.anInt806;
				if (local42 + 2 > 1600) {
					local44 = Static192.method3681(local42) + 1 - this.anInt4326;
					local42 = (local42 >> local44) + 2;
				} else {
					local44 = 0;
					local42 += 2;
				}
				@Pc(402) Class4_Sub3 local402 = arg0.aClass163_1.aClass4_Sub3_3;
				local50 = local402.aClass4_Sub3_10;
				@Pc(407) int local407 = -2;
				@Pc(409) boolean local409 = true;
				@Pc(411) boolean local411 = true;
				while (local402 != local50) {
					this.anInt4327 = 0;
					for (local149 = 0; local149 < local42; local149++) {
						this.anIntArray402[local149] = 0;
					}
					for (@Pc(431) int local431 = 0; local431 < 64; local431++) {
						this.anIntArray403[local431] = 0;
					}
					while (local402 != local50) {
						@Pc(447) Class4_Sub3_Sub1 local447 = (Class4_Sub3_Sub1) local50;
						if (local411) {
							local407 = local447.anInt5223;
							local409 = local447.aBoolean356;
							local411 = false;
						} else if (local447.anInt5223 != local407 || local447.aBoolean356 != local409) {
							local411 = true;
							break;
						}
						local160 = (int) (local29 + local25 * (float) (local447.anInt5221 >> 12) + local21 * (float) (local447.anInt5228 >> 12) + local17 * (float) (local447.anInt5229 >> 12)) - arg0.anInt806 >> local44;
						if (local160 < 1600) {
							if (this.anIntArray402[local160] >= 64) {
								label137: {
									if (this.anIntArray402[local160] == 64) {
										if (this.anInt4327 == 64) {
											break label137;
										}
										this.anIntArray402[local160] += this.anInt4327++ + 1;
									}
									local300 = this.aClass4_Sub3_Sub1ArrayArray1[this.anIntArray402[local160] - 1 - 64];
									local310 = this.anIntArray402[local160] - 65;
									local312 = this.anIntArray403[this.anIntArray402[local160] - 65];
									this.anIntArray403[local310] = this.anIntArray403[this.anIntArray402[local160] - 65] + 1;
									local300[local312] = local447;
								}
							} else {
								this.aClass4_Sub3_Sub1ArrayArray2[local160][this.anIntArray402[local160]++] = local447;
							}
						}
						local50 = local50.aClass4_Sub3_10;
					}
					if (local407 >= 0) {
						arg1.method414(local407);
					} else {
						arg1.method414(-1);
					}
					if (local409 && arg1.aFloat7 != Static422.aFloat255) {
						arg1.ha(Static422.aFloat255);
					} else if (arg1.aFloat7 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method3580(arg1, local42);
				}
			} else {
				local42 = 0;
				local44 = Integer.MAX_VALUE;
				@Pc(46) int local46 = 0;
				local50 = arg0.aClass163_1.aClass4_Sub3_3;
				@Pc(53) Class4_Sub3 local53;
				@Pc(85) int local85;
				for (local53 = local50.aClass4_Sub3_10; local53 != local50; local53 = local53.aClass4_Sub3_10) {
					@Pc(58) Class4_Sub3_Sub1 local58 = (Class4_Sub3_Sub1) local53;
					local85 = (int) (local29 + (float) (local58.anInt5228 >> 12) * local21 + local17 * (float) (local58.anInt5229 >> 12) + local25 * (float) (local58.anInt5221 >> 12));
					this.anIntArray404[local42++] = local85;
					if (local85 > local46) {
						local46 = local85;
					}
					if (local44 > local85) {
						local44 = local85;
					}
				}
				@Pc(116) int local116 = local46 - local44;
				if (local116 + 2 <= 1600) {
					local85 = 0;
					local116 += 2;
				} else {
					local85 = Static192.method3681(local116) + 1 - this.anInt4326;
					local116 = (local116 >> local85) + 2;
				}
				local42 = 0;
				local53 = local50.aClass4_Sub3_10;
				local149 = -2;
				@Pc(151) boolean local151 = true;
				@Pc(153) boolean local153 = true;
				while (local53 != local50) {
					this.anInt4327 = 0;
					for (local160 = 0; local160 < local116; local160++) {
						this.anIntArray402[local160] = 0;
					}
					for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
						this.anIntArray403[local173] = 0;
					}
					while (local50 != local53) {
						@Pc(191) Class4_Sub3_Sub1 local191 = (Class4_Sub3_Sub1) local53;
						if (local153) {
							local153 = false;
							local151 = local191.aBoolean356;
							local149 = local191.anInt5223;
						}
						if (local42 > 0 && (local149 != local191.anInt5223 || local191.aBoolean356 != local151)) {
							local153 = true;
							break;
						}
						@Pc(233) int local233 = this.anIntArray404[local42++] - local44 >> local85;
						if (local233 < 1600) {
							if (this.anIntArray402[local233] < 64) {
								this.aClass4_Sub3_Sub1ArrayArray2[local233][this.anIntArray402[local233]++] = local191;
							} else {
								label181: {
									if (this.anIntArray402[local233] == 64) {
										if (this.anInt4327 == 64) {
											break label181;
										}
										this.anIntArray402[local233] += this.anInt4327++ + 1;
									}
									local300 = this.aClass4_Sub3_Sub1ArrayArray1[this.anIntArray402[local233] - 1 - 64];
									local310 = this.anIntArray402[local233] - 64 - 1;
									local312 = this.anIntArray403[this.anIntArray402[local233] - 64 - 1];
									this.anIntArray403[local310] = this.anIntArray403[this.anIntArray402[local233] - 64 - 1] + 1;
									local300[local312] = local191;
								}
							}
						}
						local53 = local53.aClass4_Sub3_10;
					}
					if (local149 < 0) {
						arg1.method414(-1);
					} else {
						arg1.method414(local149);
					}
					if (local151 && arg1.aFloat7 != Static422.aFloat255) {
						arg1.ha(Static422.aFloat255);
					} else if (arg1.aFloat7 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method3580(arg1, local116);
				}
			}
		} catch (@Pc(646) Exception local646) {
		}
		this.method3576(arg1);
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(BLclient!ad;)V")
	public void method3584(@OriginalArg(1) Class5_Sub1 arg0) {
		this.anInterface1_5 = arg0.method445(24, true, 196584, null);
		this.aClass112_7 = new Class112(this.anInterface1_5, 5126, 2, 0);
		this.aClass112_9 = new Class112(this.anInterface1_5, 5126, 3, 8);
		this.aClass112_8 = new Class112(this.anInterface1_5, 5121, 4, 20);
	}
}
