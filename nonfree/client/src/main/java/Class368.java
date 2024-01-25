import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class368 {

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!id;")
	private Interface9 anInterface9_7;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Lclient!pw;")
	private Class268 aClass268_14;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!pw;")
	private Class268 aClass268_15;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!pw;")
	private Class268 aClass268_16;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[F")
	private final float[] aFloatArray77 = new float[16];

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!bs;")
	private final Class8_Sub8_Sub1 aClass8_Sub8_Sub1_3 = new Class8_Sub8_Sub1(786336);

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	private final int anInt10411 = Static112.method2537(1600);

	@OriginalMember(owner = "client!we", name = "o", descriptor = "[[Lclient!gi;")
	private final Class15_Sub5_Sub1[][] aClass15_Sub5_Sub1ArrayArray3 = new Class15_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!we", name = "s", descriptor = "I")
	private int anInt10412 = 0;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "[[Lclient!gi;")
	private final Class15_Sub5_Sub1[][] aClass15_Sub5_Sub1ArrayArray4 = new Class15_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!we", name = "r", descriptor = "[I")
	private final int[] anIntArray613 = new int[8191];

	@OriginalMember(owner = "client!we", name = "p", descriptor = "[I")
	private final int[] anIntArray612 = new int[1600];

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
	private final int[] anIntArray614 = new int[64];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!nv;I)V")
	private void method8399(@OriginalArg(0) Class16_Sub3 arg0) {
		arg0.method5955(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static39.aFloat41 != arg0.aFloat169) {
			arg0.xa(Static39.aFloat41);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBLclient!nv;)V")
	private void method8400(@OriginalArg(0) int arg0, @OriginalArg(2) Class16_Sub3 arg1) {
		Static39.aFloat41 = arg1.aFloat169;
		arg1.method5973((float) arg0);
		arg1.method5956();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method5955(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!nv;ILclient!pca;)V")
	public void method8401(@OriginalArg(1) Class16_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class250 arg2) {
		if (arg0.aClass54_Sub2_3 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method8404(arg0);
		} else {
			this.method8400(arg1, arg0);
		}
		@Pc(29) float local29 = arg0.aClass54_Sub2_3.aFloat71;
		@Pc(33) float local33 = arg0.aClass54_Sub2_3.aFloat64;
		@Pc(37) float local37 = arg0.aClass54_Sub2_3.aFloat73;
		@Pc(41) float local41 = arg0.aClass54_Sub2_3.aFloat69;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(53) int local53 = 0;
			@Pc(57) Class15_Sub5 local57 = arg2.aClass131_1.aClass15_Sub5_7;
			@Pc(60) Class15_Sub5 local60;
			@Pc(92) int local92;
			for (local60 = local57.aClass15_Sub5_9; local60 != local57; local60 = local60.aClass15_Sub5_9) {
				@Pc(65) Class15_Sub5_Sub1 local65 = (Class15_Sub5_Sub1) local60;
				local92 = (int) (local41 + local33 * (float) (local65.anInt3830 >> 12) + (float) (local65.anInt3827 >> 12) * local29 + local37 * (float) (local65.anInt3826 >> 12));
				if (local53 < local92) {
					local53 = local92;
				}
				if (local92 < local45) {
					local45 = local92;
				}
				this.anIntArray613[local43++] = local92;
			}
			@Pc(122) int local122 = local53 - local45;
			if (local122 + 2 > 1600) {
				local92 = Static112.method2537(local122) + 1 - this.anInt10411;
				local122 = (local122 >> local92) + 2;
			} else {
				local92 = 0;
				local122 += 2;
			}
			local43 = 0;
			local60 = local57.aClass15_Sub5_9;
			@Pc(157) int local157 = -2;
			@Pc(159) boolean local159 = true;
			@Pc(161) boolean local161 = true;
			while (local57 != local60) {
				this.anInt10412 = 0;
				for (@Pc(168) int local168 = 0; local168 < local122; local168++) {
					this.anIntArray612[local168] = 0;
				}
				for (@Pc(185) int local185 = 0; local185 < 64; local185++) {
					this.anIntArray614[local185] = 0;
				}
				while (local60 != local57) {
					@Pc(201) Class15_Sub5_Sub1 local201 = (Class15_Sub5_Sub1) local60;
					if (local161) {
						local161 = false;
						local157 = local201.anInt3824;
						local159 = local201.aBoolean281;
					}
					if (local43 > 0 && (local157 != local201.anInt3824 || local159 != local201.aBoolean281)) {
						local161 = true;
						break;
					}
					@Pc(251) int local251 = this.anIntArray613[local43++] - local45 >> local92;
					if (local251 < 1600) {
						if (this.anIntArray612[local251] < 64) {
							this.aClass15_Sub5_Sub1ArrayArray4[local251][this.anIntArray612[local251]++] = local201;
						} else {
							label107: {
								if (this.anIntArray612[local251] == 64) {
									if (this.anInt10412 == 64) {
										break label107;
									}
									this.anIntArray612[local251] += this.anInt10412++ + 1;
								}
								@Pc(320) Class15_Sub5_Sub1[] local320 = this.aClass15_Sub5_Sub1ArrayArray3[this.anIntArray612[local251] - 64 - 1];
								@Pc(328) int local328 = this.anIntArray612[local251] - 65;
								@Pc(330) int local330 = this.anIntArray614[this.anIntArray612[local251] - 65];
								this.anIntArray614[local328] = this.anIntArray614[this.anIntArray612[local251] - 65] + 1;
								local320[local330] = local201;
							}
						}
					}
					local60 = local60.aClass15_Sub5_9;
				}
				if (local157 < 0) {
					arg0.method6023(-1);
				} else {
					arg0.method6023(local157);
				}
				if (local159 && arg0.aFloat169 != Static39.aFloat41) {
					arg0.xa(Static39.aFloat41);
				} else if (arg0.aFloat169 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method8402(local122, arg0);
			}
		} catch (@Pc(384) Exception local384) {
		}
		this.method8399(arg0);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IBLclient!nv;)V")
	private void method8402(@OriginalArg(0) int arg0, @OriginalArg(2) Class16_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray77, 0);
		@Pc(15) float local15 = this.aFloatArray77[0];
		@Pc(20) float local20 = this.aFloatArray77[4];
		@Pc(25) float local25 = this.aFloatArray77[8];
		@Pc(30) float local30 = this.aFloatArray77[1];
		@Pc(35) float local35 = this.aFloatArray77[5];
		@Pc(40) float local40 = this.aFloatArray77[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(60) float local60 = local20 - local35;
		@Pc(64) float local64 = local25 - local40;
		@Pc(68) float local68 = local30 - local15;
		@Pc(77) float local77 = local35 - local20;
		this.aClass8_Sub8_Sub1_3.anInt10588 = 0;
		@Pc(86) float local86 = local40 - local25;
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class15_Sub5_Sub1 local128;
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
		@Pc(474) Class15_Sub5_Sub1 local474;
		@Pc(477) int local477;
		@Pc(490) byte local490;
		@Pc(495) byte local495;
		@Pc(507) float local507;
		if (arg1.aBoolean519) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray612[local93] <= 64 ? this.anIntArray612[local93] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass15_Sub5_Sub1ArrayArray4[local93][local119];
						local131 = local128.anInt3828;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt3827 >> 12;
						local161 = local128.anInt3830 >> 12;
						local167 = local128.anInt3826 >> 12;
						local172 = local128.anInt3822 >> 12;
						this.aClass8_Sub8_Sub1_3.method1576(0.0F);
						this.aClass8_Sub8_Sub1_3.method1576(0.0F);
						this.aClass8_Sub8_Sub1_3.method1576(local44 * (float) -local172 + local155);
						this.aClass8_Sub8_Sub1_3.method1576((float) -local172 * local48 + local161);
						this.aClass8_Sub8_Sub1_3.method1576(local167 + local52 * (float) -local172);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
						this.aClass8_Sub8_Sub1_3.method1576(1.0F);
						this.aClass8_Sub8_Sub1_3.method1576(0.0F);
						this.aClass8_Sub8_Sub1_3.method1576((float) local172 * local56 + local155);
						this.aClass8_Sub8_Sub1_3.method1576(local161 + local60 * (float) local172);
						this.aClass8_Sub8_Sub1_3.method1576(local167 + local64 * (float) local172);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
						this.aClass8_Sub8_Sub1_3.method1576(1.0F);
						this.aClass8_Sub8_Sub1_3.method1576(1.0F);
						this.aClass8_Sub8_Sub1_3.method1576(local155 + (float) local172 * local44);
						this.aClass8_Sub8_Sub1_3.method1576(local161 + (float) local172 * local48);
						this.aClass8_Sub8_Sub1_3.method1576(local167 + (float) local172 * local52);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
						this.aClass8_Sub8_Sub1_3.method1576(0.0F);
						this.aClass8_Sub8_Sub1_3.method1576(1.0F);
						this.aClass8_Sub8_Sub1_3.method1576(local155 + (float) local172 * local68);
						this.aClass8_Sub8_Sub1_3.method1576((float) local172 * local77 + local161);
						this.aClass8_Sub8_Sub1_3.method1576((float) local172 * local86 + local167);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
					}
					if (this.anIntArray612[local93] > 64) {
						local458 = this.anIntArray612[local93] - 64 - 1;
						for (local131 = this.anIntArray614[local458] - 1; local131 >= 0; local131--) {
							local474 = this.aClass15_Sub5_Sub1ArrayArray3[local458][local131];
							local477 = local474.anInt3828;
							local144 = (byte) (local477 >> 16);
							local149 = (byte) (local477 >> 8);
							local490 = (byte) local477;
							local495 = (byte) (local477 >>> 24);
							local167 = local474.anInt3827 >> 12;
							local507 = local474.anInt3830 >> 12;
							local513 = local474.anInt3826 >> 12;
							local518 = local474.anInt3822 >> 12;
							this.aClass8_Sub8_Sub1_3.method1576(0.0F);
							this.aClass8_Sub8_Sub1_3.method1576(0.0F);
							this.aClass8_Sub8_Sub1_3.method1576(local167 + (float) -local518 * local44);
							this.aClass8_Sub8_Sub1_3.method1576((float) -local518 * local48 + local507);
							this.aClass8_Sub8_Sub1_3.method1576((float) -local518 * local52 + local513);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
							this.aClass8_Sub8_Sub1_3.method1576(1.0F);
							this.aClass8_Sub8_Sub1_3.method1576(0.0F);
							this.aClass8_Sub8_Sub1_3.method1576(local167 + (float) local518 * local56);
							this.aClass8_Sub8_Sub1_3.method1576(local60 * (float) local518 + local507);
							this.aClass8_Sub8_Sub1_3.method1576(local64 * (float) local518 + local513);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
							this.aClass8_Sub8_Sub1_3.method1576(1.0F);
							this.aClass8_Sub8_Sub1_3.method1576(1.0F);
							this.aClass8_Sub8_Sub1_3.method1576(local44 * (float) local518 + local167);
							this.aClass8_Sub8_Sub1_3.method1576(local507 + (float) local518 * local48);
							this.aClass8_Sub8_Sub1_3.method1576(local513 + local52 * (float) local518);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
							this.aClass8_Sub8_Sub1_3.method1576(0.0F);
							this.aClass8_Sub8_Sub1_3.method1576(1.0F);
							this.aClass8_Sub8_Sub1_3.method1576(local167 + local68 * (float) local518);
							this.aClass8_Sub8_Sub1_3.method1576(local507 + (float) local518 * local77);
							this.aClass8_Sub8_Sub1_3.method1576(local513 + local86 * (float) local518);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray612[local93] <= 64 ? this.anIntArray612[local93] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass15_Sub5_Sub1ArrayArray4[local93][local119];
						local131 = local128.anInt3828;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt3827 >> 12;
						local161 = local128.anInt3830 >> 12;
						local167 = local128.anInt3826 >> 12;
						local172 = local128.anInt3822 >> 12;
						this.aClass8_Sub8_Sub1_3.method1578(0.0F);
						this.aClass8_Sub8_Sub1_3.method1578(0.0F);
						this.aClass8_Sub8_Sub1_3.method1578(local44 * (float) -local172 + local155);
						this.aClass8_Sub8_Sub1_3.method1578(local48 * (float) -local172 + local161);
						this.aClass8_Sub8_Sub1_3.method1578(local167 + local52 * (float) -local172);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
						this.aClass8_Sub8_Sub1_3.method1578(1.0F);
						this.aClass8_Sub8_Sub1_3.method1578(0.0F);
						this.aClass8_Sub8_Sub1_3.method1578(local155 + (float) local172 * local56);
						this.aClass8_Sub8_Sub1_3.method1578(local161 + (float) local172 * local60);
						this.aClass8_Sub8_Sub1_3.method1578(local167 + local64 * (float) local172);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
						this.aClass8_Sub8_Sub1_3.method1578(1.0F);
						this.aClass8_Sub8_Sub1_3.method1578(1.0F);
						this.aClass8_Sub8_Sub1_3.method1578(local155 + (float) local172 * local44);
						this.aClass8_Sub8_Sub1_3.method1578((float) local172 * local48 + local161);
						this.aClass8_Sub8_Sub1_3.method1578(local167 + local52 * (float) local172);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
						this.aClass8_Sub8_Sub1_3.method1578(0.0F);
						this.aClass8_Sub8_Sub1_3.method1578(1.0F);
						this.aClass8_Sub8_Sub1_3.method1578(local155 + local68 * (float) local172);
						this.aClass8_Sub8_Sub1_3.method1578(local161 + local77 * (float) local172);
						this.aClass8_Sub8_Sub1_3.method1578(local167 + local86 * (float) local172);
						this.aClass8_Sub8_Sub1_3.method8562(local136);
						this.aClass8_Sub8_Sub1_3.method8562(local141);
						this.aClass8_Sub8_Sub1_3.method8562(local144);
						this.aClass8_Sub8_Sub1_3.method8562(local149);
					}
					if (this.anIntArray612[local93] > 64) {
						local458 = this.anIntArray612[local93] - 65;
						for (local131 = this.anIntArray614[local458] - 1; local131 >= 0; local131--) {
							local474 = this.aClass15_Sub5_Sub1ArrayArray3[local458][local131];
							local477 = local474.anInt3828;
							local144 = (byte) (local477 >> 16);
							local149 = (byte) (local477 >> 8);
							local490 = (byte) local477;
							local495 = (byte) (local477 >>> 24);
							local167 = local474.anInt3827 >> 12;
							local507 = local474.anInt3830 >> 12;
							local513 = local474.anInt3826 >> 12;
							local518 = local474.anInt3822 >> 12;
							this.aClass8_Sub8_Sub1_3.method1578(0.0F);
							this.aClass8_Sub8_Sub1_3.method1578(0.0F);
							this.aClass8_Sub8_Sub1_3.method1578((float) -local518 * local44 + local167);
							this.aClass8_Sub8_Sub1_3.method1578(local507 + (float) -local518 * local48);
							this.aClass8_Sub8_Sub1_3.method1578(local513 + local52 * (float) -local518);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
							this.aClass8_Sub8_Sub1_3.method1578(1.0F);
							this.aClass8_Sub8_Sub1_3.method1578(0.0F);
							this.aClass8_Sub8_Sub1_3.method1578(local56 * (float) local518 + local167);
							this.aClass8_Sub8_Sub1_3.method1578(local507 + (float) local518 * local60);
							this.aClass8_Sub8_Sub1_3.method1578(local64 * (float) local518 + local513);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
							this.aClass8_Sub8_Sub1_3.method1578(1.0F);
							this.aClass8_Sub8_Sub1_3.method1578(1.0F);
							this.aClass8_Sub8_Sub1_3.method1578(local167 + local44 * (float) local518);
							this.aClass8_Sub8_Sub1_3.method1578(local48 * (float) local518 + local507);
							this.aClass8_Sub8_Sub1_3.method1578(local52 * (float) local518 + local513);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
							this.aClass8_Sub8_Sub1_3.method1578(0.0F);
							this.aClass8_Sub8_Sub1_3.method1578(1.0F);
							this.aClass8_Sub8_Sub1_3.method1578(local68 * (float) local518 + local167);
							this.aClass8_Sub8_Sub1_3.method1578(local507 + (float) local518 * local77);
							this.aClass8_Sub8_Sub1_3.method1578(local86 * (float) local518 + local513);
							this.aClass8_Sub8_Sub1_3.method8562(local144);
							this.aClass8_Sub8_Sub1_3.method8562(local149);
							this.aClass8_Sub8_Sub1_3.method8562(local490);
							this.aClass8_Sub8_Sub1_3.method8562(local495);
						}
					}
				}
			}
		}
		if (this.aClass8_Sub8_Sub1_3.anInt10588 != 0) {
			this.anInterface9_7.method6286(24, this.aClass8_Sub8_Sub1_3.aByteArray107, this.aClass8_Sub8_Sub1_3.anInt10588);
			arg1.method5988(this.aClass268_14, null, this.aClass268_15, this.aClass268_16);
			arg1.method5971(this.aClass8_Sub8_Sub1_3.anInt10588 / 24);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLclient!nv;)V")
	public void method8403(@OriginalArg(1) Class16_Sub3 arg0) {
		this.anInterface9_7 = arg0.method5997(null, true, 196584, 24);
		this.aClass268_15 = new Class268(this.anInterface9_7, 5126, 2, 0);
		this.aClass268_16 = new Class268(this.anInterface9_7, 5126, 3, 8);
		this.aClass268_14 = new Class268(this.anInterface9_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!nv;Z)V")
	private void method8404(@OriginalArg(0) Class16_Sub3 arg0) {
		Static39.aFloat41 = arg0.aFloat169;
		arg0.method5965();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5955(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
