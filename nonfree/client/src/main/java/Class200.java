import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class200 {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "Lclient!ds;")
	private Class58 aClass58_13;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Lclient!ds;")
	private Class58 aClass58_14;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "Lclient!ds;")
	private Class58 aClass58_15;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Lclient!bm;")
	private Interface1 anInterface1_7;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "[F")
	private final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient!om;")
	private final Class1_Sub1_Sub2 aClass1_Sub1_Sub2_2 = new Class1_Sub1_Sub2(786336);

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	private final int anInt5948 = Static159.method2403(1600);

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "[[Lclient!ui;")
	private final Class39_Sub2_Sub1[][] aClass39_Sub2_Sub1ArrayArray1 = new Class39_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
	private final int[] anIntArray471 = new int[64];

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
	private int anInt5949 = 0;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "[[Lclient!ui;")
	private final Class39_Sub2_Sub1[][] aClass39_Sub2_Sub1ArrayArray2 = new Class39_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "[I")
	private final int[] anIntArray473 = new int[8191];

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "[I")
	private final int[] anIntArray472 = new int[1600];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!qb;Lclient!ht;)V")
	public void method4809(@OriginalArg(1) Class185 arg0, @OriginalArg(2) Class109_Sub1 arg1) {
		if (arg1.aClass18_Sub1_3 == null) {
			return;
		}
		this.method4814(arg1);
		@Pc(21) float local21 = arg1.aClass18_Sub1_3.aFloat9;
		@Pc(25) float local25 = arg1.aClass18_Sub1_3.aFloat7;
		@Pc(29) float local29 = arg1.aClass18_Sub1_3.aFloat11;
		@Pc(33) float local33 = arg1.aClass18_Sub1_3.aFloat8;
		try {
			@Pc(38) int local38;
			@Pc(40) int local40;
			@Pc(46) Class39_Sub2 local46;
			@Pc(142) int local142;
			@Pc(153) int local153;
			@Pc(285) int local285;
			@Pc(287) int local287;
			@Pc(277) Class39_Sub2_Sub1[] local277;
			if (arg0.aBoolean365) {
				local38 = arg0.anInt5595 - arg0.anInt5596;
				if (local38 + 2 <= 1600) {
					local38 += 2;
					local40 = 0;
				} else {
					local40 = Static159.method2403(local38) + 1 - this.anInt5948;
					local38 = (local38 >> local40) + 2;
				}
				@Pc(414) Class39_Sub2 local414 = arg0.aClass212_1.aClass39_Sub2_3;
				local46 = local414.aClass39_Sub2_8;
				@Pc(419) int local419 = -2;
				@Pc(421) boolean local421 = true;
				@Pc(423) boolean local423 = true;
				while (local414 != local46) {
					this.anInt5949 = 0;
					for (local142 = 0; local142 < local38; local142++) {
						this.anIntArray472[local142] = 0;
					}
					for (@Pc(447) int local447 = 0; local447 < 64; local447++) {
						this.anIntArray471[local447] = 0;
					}
					while (local414 != local46) {
						@Pc(463) Class39_Sub2_Sub1 local463 = (Class39_Sub2_Sub1) local46;
						if (local423) {
							local421 = local463.aBoolean463;
							local423 = false;
							local419 = local463.anInt7208;
						} else if (local419 != local463.anInt7208 || local421 != local463.aBoolean463) {
							local423 = true;
							break;
						}
						local153 = (int) ((float) (local463.anInt7204 >> Static327.anInt5727) * local21 + (float) (local463.anInt7206 >> Static327.anInt5727) * local25 + (float) (local463.anInt7210 >> Static327.anInt5727) * local29 + local33) - arg0.anInt5596 >> local40;
						if (local153 < 1600) {
							if (this.anIntArray472[local153] < 64) {
								this.aClass39_Sub2_Sub1ArrayArray1[local153][this.anIntArray472[local153]++] = local463;
							} else {
								label145: {
									if (this.anIntArray472[local153] == 64) {
										if (this.anInt5949 == 64) {
											break label145;
										}
										this.anIntArray472[local153] += this.anInt5949++ + 1;
									}
									local277 = this.aClass39_Sub2_Sub1ArrayArray2[this.anIntArray472[local153] - 1 - 64];
									local285 = this.anIntArray472[local153] - 64 - 1;
									local287 = this.anIntArray471[this.anIntArray472[local153] - 64 - 1];
									this.anIntArray471[local285] = this.anIntArray471[this.anIntArray472[local153] - 64 - 1] + 1;
									local277[local287] = local463;
								}
							}
						}
						local46 = local46.aClass39_Sub2_8;
					}
					if (local419 >= 0) {
						arg1.method2578(arg1.aClass67_1.method1466(local419));
						arg1.method2531(arg1.anInterface7_9.method4836(local419).anInt4297);
					} else {
						arg1.method2578(null);
					}
					if (local421 && arg1.aFloat56 != Static111.aFloat35) {
						arg1.ua(Static111.aFloat35);
					} else if (arg1.aFloat56 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method4812(local38, arg1);
				}
			} else {
				local38 = 0;
				local40 = Integer.MAX_VALUE;
				@Pc(42) int local42 = 0;
				local46 = arg0.aClass212_1.aClass39_Sub2_3;
				@Pc(49) Class39_Sub2 local49;
				@Pc(81) int local81;
				for (local49 = local46.aClass39_Sub2_8; local49 != local46; local49 = local49.aClass39_Sub2_8) {
					@Pc(54) Class39_Sub2_Sub1 local54 = (Class39_Sub2_Sub1) local49;
					local81 = (int) (local21 * (float) (local54.anInt7204 >> Static327.anInt5727) + local25 * (float) (local54.anInt7206 >> Static327.anInt5727) + (float) (local54.anInt7210 >> Static327.anInt5727) * local29 + local33);
					if (local40 > local81) {
						local40 = local81;
					}
					if (local81 > local42) {
						local42 = local81;
					}
					this.anIntArray473[local38++] = local81;
				}
				@Pc(108) int local108 = local42 - local40;
				if (local108 + 2 > 1600) {
					local81 = Static159.method2403(local108) + 1 - this.anInt5948;
					local108 = (local108 >> local81) + 2;
				} else {
					local108 += 2;
					local81 = 0;
				}
				local38 = 0;
				local49 = local46.aClass39_Sub2_8;
				local142 = -2;
				@Pc(144) boolean local144 = true;
				@Pc(146) boolean local146 = true;
				while (local46 != local49) {
					this.anInt5949 = 0;
					for (local153 = 0; local153 < local108; local153++) {
						this.anIntArray472[local153] = 0;
					}
					for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
						this.anIntArray471[local166] = 0;
					}
					while (local46 != local49) {
						@Pc(182) Class39_Sub2_Sub1 local182 = (Class39_Sub2_Sub1) local49;
						if (local146) {
							local142 = local182.anInt7208;
							local146 = false;
							local144 = local182.aBoolean463;
						}
						if (local38 > 0 && (local142 != local182.anInt7208 || local144 != local182.aBoolean463)) {
							local146 = true;
							break;
						}
						@Pc(228) int local228 = this.anIntArray473[local38++] - local40 >> local81;
						if (local228 < 1600) {
							if (this.anIntArray472[local228] >= 64) {
								label190: {
									if (this.anIntArray472[local228] == 64) {
										if (this.anInt5949 == 64) {
											break label190;
										}
										this.anIntArray472[local228] += this.anInt5949++ + 1;
									}
									local277 = this.aClass39_Sub2_Sub1ArrayArray2[this.anIntArray472[local228] - 65];
									local285 = this.anIntArray472[local228] - 65;
									local287 = this.anIntArray471[this.anIntArray472[local228] - 65];
									this.anIntArray471[local285] = this.anIntArray471[this.anIntArray472[local228] - 65] + 1;
									local277[local287] = local182;
								}
							} else {
								this.aClass39_Sub2_Sub1ArrayArray1[local228][this.anIntArray472[local228]++] = local182;
							}
						}
						local49 = local49.aClass39_Sub2_8;
					}
					if (local142 >= 0) {
						arg1.method2578(arg1.aClass67_1.method1466(local142));
						arg1.method2531(arg1.anInterface7_9.method4836(local142).anInt4297);
					} else {
						arg1.method2578(null);
					}
					if (local144 && Static111.aFloat35 != arg1.aFloat56) {
						arg1.ua(Static111.aFloat35);
					} else if (arg1.aFloat56 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method4812(local108, arg1);
				}
			}
		} catch (@Pc(669) Exception local669) {
		}
		this.method4813(arg1);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!ht;I)V")
	private void method4812(@OriginalArg(0) int arg0, @OriginalArg(1) Class109_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray32, 0);
		@Pc(15) float local15 = this.aFloatArray32[0];
		@Pc(20) float local20 = this.aFloatArray32[4];
		@Pc(25) float local25 = this.aFloatArray32[8];
		@Pc(30) float local30 = this.aFloatArray32[1];
		@Pc(35) float local35 = this.aFloatArray32[5];
		@Pc(40) float local40 = this.aFloatArray32[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(76) float local76 = local30 - local15;
		@Pc(80) float local80 = local35 - local20;
		@Pc(85) float local85 = local40 - local25;
		this.aClass1_Sub1_Sub2_2.anInt5056 = 0;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class39_Sub2_Sub1 local128;
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
		@Pc(452) Class39_Sub2_Sub1 local452;
		@Pc(455) int local455;
		@Pc(468) byte local468;
		@Pc(473) byte local473;
		@Pc(485) float local485;
		if (arg1.aBoolean163) {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray472[local96] <= 64 ? this.anIntArray472[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass39_Sub2_Sub1ArrayArray1[local96][local119];
						local131 = local128.anInt7207;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt7204 >> Static327.anInt5727;
						local161 = local128.anInt7206 >> Static327.anInt5727;
						local167 = local128.anInt7210 >> Static327.anInt5727;
						local172 = local128.anInt7212 >> Static327.anInt5727;
						this.aClass1_Sub1_Sub2_2.method4149(0.0F);
						this.aClass1_Sub1_Sub2_2.method4149(0.0F);
						this.aClass1_Sub1_Sub2_2.method4149(local155 + (float) -local172 * local44);
						this.aClass1_Sub1_Sub2_2.method4149((float) -local172 * local48 + local161);
						this.aClass1_Sub1_Sub2_2.method4149(local167 + (float) -local172 * local52);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
						this.aClass1_Sub1_Sub2_2.method4149(1.0F);
						this.aClass1_Sub1_Sub2_2.method4149(0.0F);
						this.aClass1_Sub1_Sub2_2.method4149(local155 + local56 * (float) local172);
						this.aClass1_Sub1_Sub2_2.method4149(local61 * (float) local172 + local161);
						this.aClass1_Sub1_Sub2_2.method4149(local167 + (float) local172 * local66);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
						this.aClass1_Sub1_Sub2_2.method4149(1.0F);
						this.aClass1_Sub1_Sub2_2.method4149(1.0F);
						this.aClass1_Sub1_Sub2_2.method4149(local44 * (float) local172 + local155);
						this.aClass1_Sub1_Sub2_2.method4149(local161 + local48 * (float) local172);
						this.aClass1_Sub1_Sub2_2.method4149(local52 * (float) local172 + local167);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
						this.aClass1_Sub1_Sub2_2.method4149(0.0F);
						this.aClass1_Sub1_Sub2_2.method4149(1.0F);
						this.aClass1_Sub1_Sub2_2.method4149(local76 * (float) local172 + local155);
						this.aClass1_Sub1_Sub2_2.method4149(local80 * (float) local172 + local161);
						this.aClass1_Sub1_Sub2_2.method4149(local85 * (float) local172 + local167);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
					}
					if (this.anIntArray472[local96] > 64) {
						local436 = this.anIntArray472[local96] - 64 - 1;
						for (local131 = this.anIntArray471[local436] - 1; local131 >= 0; local131--) {
							local452 = this.aClass39_Sub2_Sub1ArrayArray2[local436][local131];
							local455 = local452.anInt7207;
							local144 = (byte) (local455 >> 16);
							local149 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local167 = local452.anInt7204 >> Static327.anInt5727;
							local485 = local452.anInt7206 >> Static327.anInt5727;
							local491 = local452.anInt7210 >> Static327.anInt5727;
							local496 = local452.anInt7212 >> Static327.anInt5727;
							this.aClass1_Sub1_Sub2_2.method4149(0.0F);
							this.aClass1_Sub1_Sub2_2.method4149(0.0F);
							this.aClass1_Sub1_Sub2_2.method4149(local44 * (float) -local496 + local167);
							this.aClass1_Sub1_Sub2_2.method4149(local485 + (float) -local496 * local48);
							this.aClass1_Sub1_Sub2_2.method4149(local491 + local52 * (float) -local496);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
							this.aClass1_Sub1_Sub2_2.method4149(1.0F);
							this.aClass1_Sub1_Sub2_2.method4149(0.0F);
							this.aClass1_Sub1_Sub2_2.method4149(local167 + (float) local496 * local56);
							this.aClass1_Sub1_Sub2_2.method4149(local61 * (float) local496 + local485);
							this.aClass1_Sub1_Sub2_2.method4149(local491 + (float) local496 * local66);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
							this.aClass1_Sub1_Sub2_2.method4149(1.0F);
							this.aClass1_Sub1_Sub2_2.method4149(1.0F);
							this.aClass1_Sub1_Sub2_2.method4149((float) local496 * local44 + local167);
							this.aClass1_Sub1_Sub2_2.method4149(local485 + local48 * (float) local496);
							this.aClass1_Sub1_Sub2_2.method4149(local491 + (float) local496 * local52);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
							this.aClass1_Sub1_Sub2_2.method4149(0.0F);
							this.aClass1_Sub1_Sub2_2.method4149(1.0F);
							this.aClass1_Sub1_Sub2_2.method4149(local167 + (float) local496 * local76);
							this.aClass1_Sub1_Sub2_2.method4149(local485 + local80 * (float) local496);
							this.aClass1_Sub1_Sub2_2.method4149(local491 + (float) local496 * local85);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
						}
					}
				}
			}
		} else {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray472[local96] <= 64 ? this.anIntArray472[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass39_Sub2_Sub1ArrayArray1[local96][local119];
						local131 = local128.anInt7207;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt7204 >> Static327.anInt5727;
						local161 = local128.anInt7206 >> Static327.anInt5727;
						local167 = local128.anInt7210 >> Static327.anInt5727;
						local172 = local128.anInt7212 >> Static327.anInt5727;
						this.aClass1_Sub1_Sub2_2.method4148(0.0F);
						this.aClass1_Sub1_Sub2_2.method4148(0.0F);
						this.aClass1_Sub1_Sub2_2.method4148((float) -local172 * local44 + local155);
						this.aClass1_Sub1_Sub2_2.method4148(local48 * (float) -local172 + local161);
						this.aClass1_Sub1_Sub2_2.method4148(local52 * (float) -local172 + local167);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
						this.aClass1_Sub1_Sub2_2.method4148(1.0F);
						this.aClass1_Sub1_Sub2_2.method4148(0.0F);
						this.aClass1_Sub1_Sub2_2.method4148(local155 + local56 * (float) local172);
						this.aClass1_Sub1_Sub2_2.method4148(local61 * (float) local172 + local161);
						this.aClass1_Sub1_Sub2_2.method4148(local167 + local66 * (float) local172);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
						this.aClass1_Sub1_Sub2_2.method4148(1.0F);
						this.aClass1_Sub1_Sub2_2.method4148(1.0F);
						this.aClass1_Sub1_Sub2_2.method4148(local155 + (float) local172 * local44);
						this.aClass1_Sub1_Sub2_2.method4148((float) local172 * local48 + local161);
						this.aClass1_Sub1_Sub2_2.method4148((float) local172 * local52 + local167);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
						this.aClass1_Sub1_Sub2_2.method4148(0.0F);
						this.aClass1_Sub1_Sub2_2.method4148(1.0F);
						this.aClass1_Sub1_Sub2_2.method4148(local155 + local76 * (float) local172);
						this.aClass1_Sub1_Sub2_2.method4148(local161 + (float) local172 * local80);
						this.aClass1_Sub1_Sub2_2.method4148((float) local172 * local85 + local167);
						this.aClass1_Sub1_Sub2_2.method4115(local136);
						this.aClass1_Sub1_Sub2_2.method4115(local141);
						this.aClass1_Sub1_Sub2_2.method4115(local144);
						this.aClass1_Sub1_Sub2_2.method4115(local149);
					}
					if (this.anIntArray472[local96] > 64) {
						local436 = this.anIntArray472[local96] - 1 - 64;
						for (local131 = this.anIntArray471[local436] - 1; local131 >= 0; local131--) {
							local452 = this.aClass39_Sub2_Sub1ArrayArray2[local436][local131];
							local455 = local452.anInt7207;
							local144 = (byte) (local455 >> 16);
							local149 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local167 = local452.anInt7204 >> Static327.anInt5727;
							local485 = local452.anInt7206 >> Static327.anInt5727;
							local491 = local452.anInt7210 >> Static327.anInt5727;
							local496 = local452.anInt7212 >> Static327.anInt5727;
							this.aClass1_Sub1_Sub2_2.method4148(0.0F);
							this.aClass1_Sub1_Sub2_2.method4148(0.0F);
							this.aClass1_Sub1_Sub2_2.method4148(local167 + local44 * (float) -local496);
							this.aClass1_Sub1_Sub2_2.method4148(local485 + (float) -local496 * local48);
							this.aClass1_Sub1_Sub2_2.method4148(local52 * (float) -local496 + local491);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
							this.aClass1_Sub1_Sub2_2.method4148(1.0F);
							this.aClass1_Sub1_Sub2_2.method4148(0.0F);
							this.aClass1_Sub1_Sub2_2.method4148(local56 * (float) local496 + local167);
							this.aClass1_Sub1_Sub2_2.method4148(local485 + local61 * (float) local496);
							this.aClass1_Sub1_Sub2_2.method4148((float) local496 * local66 + local491);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
							this.aClass1_Sub1_Sub2_2.method4148(1.0F);
							this.aClass1_Sub1_Sub2_2.method4148(1.0F);
							this.aClass1_Sub1_Sub2_2.method4148(local167 + local44 * (float) local496);
							this.aClass1_Sub1_Sub2_2.method4148(local485 + (float) local496 * local48);
							this.aClass1_Sub1_Sub2_2.method4148(local491 + local52 * (float) local496);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
							this.aClass1_Sub1_Sub2_2.method4148(0.0F);
							this.aClass1_Sub1_Sub2_2.method4148(1.0F);
							this.aClass1_Sub1_Sub2_2.method4148(local76 * (float) local496 + local167);
							this.aClass1_Sub1_Sub2_2.method4148(local485 + local80 * (float) local496);
							this.aClass1_Sub1_Sub2_2.method4148((float) local496 * local85 + local491);
							this.aClass1_Sub1_Sub2_2.method4115(local144);
							this.aClass1_Sub1_Sub2_2.method4115(local149);
							this.aClass1_Sub1_Sub2_2.method4115(local468);
							this.aClass1_Sub1_Sub2_2.method4115(local473);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub1_Sub2_2.anInt5056 != 0) {
			this.anInterface1_7.method3256(this.aClass1_Sub1_Sub2_2.aByteArray66, 24, this.aClass1_Sub1_Sub2_2.anInt5056);
			arg1.method2605(this.aClass58_14, this.aClass58_15, this.aClass58_13, null);
			arg1.method2567(this.aClass1_Sub1_Sub2_2.anInt5056 / 24);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!ht;)V")
	private void method4813(@OriginalArg(1) Class109_Sub1 arg0) {
		arg0.method2597(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static111.aFloat35 != arg0.aFloat56) {
			arg0.ua(Static111.aFloat35);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ht;I)V")
	private void method4814(@OriginalArg(0) Class109_Sub1 arg0) {
		Static111.aFloat35 = arg0.aFloat56;
		arg0.method2554();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2597(false);
		arg0.method2532(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lclient!ht;I)V")
	public void method4815(@OriginalArg(0) Class109_Sub1 arg0) {
		this.anInterface1_7 = arg0.method2555(true, 24, null, 196584);
		this.aClass58_14 = new Class58(arg0, this.anInterface1_7, 5126, 2, 0);
		this.aClass58_15 = new Class58(arg0, this.anInterface1_7, 5126, 3, 8);
		this.aClass58_13 = new Class58(arg0, this.anInterface1_7, 5121, 4, 20);
	}
}
