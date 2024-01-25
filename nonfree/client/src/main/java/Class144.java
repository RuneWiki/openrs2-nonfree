import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class144 {

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "Lclient!cl;")
	private Class55 aClass55_8;

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "Lclient!cl;")
	private Class55 aClass55_9;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lclient!wia;")
	private Interface27 anInterface27_4;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lclient!cl;")
	private Class55 aClass55_10;

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "[F")
	private final float[] aFloatArray41 = new float[16];

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "Lclient!sea;")
	private final Class6_Sub40_Sub1 aClass6_Sub40_Sub1_2 = new Class6_Sub40_Sub1(786336);

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
	private final int anInt4414 = Static88.method1511(1600);

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "[I")
	private final int[] anIntArray250 = new int[1600];

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "[I")
	private final int[] anIntArray251 = new int[64];

	@OriginalMember(owner = "client!iaa", name = "r", descriptor = "[I")
	private final int[] anIntArray252 = new int[8191];

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
	private int anInt4415 = 0;

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "[[Lclient!kga;")
	private final Class20_Sub6_Sub1[][] aClass20_Sub6_Sub1ArrayArray3 = new Class20_Sub6_Sub1[1600][64];

	@OriginalMember(owner = "client!iaa", name = "t", descriptor = "[[Lclient!kga;")
	private final Class20_Sub6_Sub1[][] aClass20_Sub6_Sub1ArrayArray4 = new Class20_Sub6_Sub1[64][768];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!wh;I)V")
	public void method3867(@OriginalArg(0) Class100_Sub3 arg0) {
		this.anInterface27_4 = arg0.method8883(true, (byte[]) null, 196584, 24);
		this.aClass55_8 = new Class55(this.anInterface27_4, 5126, 2, 0);
		this.aClass55_10 = new Class55(this.anInterface27_4, 5126, 3, 8);
		this.aClass55_9 = new Class55(this.anInterface27_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!wh;B)V")
	private void method3868(@OriginalArg(0) Class100_Sub3 arg0) {
		arg0.method8864(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat219 != Static10.aFloat6) {
			arg0.xa(Static10.aFloat6);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBLclient!wh;)V")
	private void method3869(@OriginalArg(0) int arg0, @OriginalArg(2) Class100_Sub3 arg1) {
		Static10.aFloat6 = arg1.aFloat219;
		arg1.method8877((float) arg0);
		arg1.method8920();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method8864(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLclient!wh;)V")
	private void method3870(@OriginalArg(1) Class100_Sub3 arg0) {
		Static10.aFloat6 = arg0.aFloat219;
		arg0.method8886();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method8864(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lclient!of;IILclient!wh;)V")
	public void method3871(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100_Sub3 arg2) {
		if (arg2.aClass154_Sub3_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method3869(arg1, arg2);
		} else {
			this.method3870(arg2);
		}
		@Pc(29) float local29 = arg2.aClass154_Sub3_3.aFloat159;
		@Pc(33) float local33 = arg2.aClass154_Sub3_3.aFloat154;
		@Pc(37) float local37 = arg2.aClass154_Sub3_3.aFloat158;
		@Pc(41) float local41 = arg2.aClass154_Sub3_3.aFloat152;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class20_Sub6 local51 = arg0.aClass157_1.aClass20_Sub6_1;
			@Pc(54) Class20_Sub6 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass20_Sub6_9; local54 != local51; local54 = local54.aClass20_Sub6_9) {
				@Pc(59) Class20_Sub6_Sub1 local59 = (Class20_Sub6_Sub1) local54;
				local86 = (int) (local41 + local33 * (float) (local59.anInt8662 >> 12) + (float) (local59.anInt8658 >> 12) * local29 + (float) (local59.anInt8661 >> 12) * local37);
				if (local47 < local86) {
					local47 = local86;
				}
				if (local86 < local45) {
					local45 = local86;
				}
				this.anIntArray252[local43++] = local86;
			}
			@Pc(113) int local113 = local47 - local45;
			if (local113 + 2 > 1600) {
				local86 = Static88.method1511(local113) + 1 - this.anInt4414;
				local113 = (local113 >> local86) + 2;
			} else {
				local113 += 2;
				local86 = 0;
			}
			local54 = local51.aClass20_Sub6_9;
			local43 = 0;
			@Pc(148) int local148 = -2;
			@Pc(150) boolean local150 = true;
			@Pc(152) boolean local152 = true;
			while (local54 != local51) {
				this.anInt4415 = 0;
				for (@Pc(159) int local159 = 0; local159 < local113; local159++) {
					this.anIntArray250[local159] = 0;
				}
				for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
					this.anIntArray251[local176] = 0;
				}
				while (local51 != local54) {
					@Pc(192) Class20_Sub6_Sub1 local192 = (Class20_Sub6_Sub1) local54;
					if (local152) {
						local152 = false;
						local148 = local192.anInt8663;
						local150 = local192.aBoolean579;
					}
					if (local43 > 0 && (local192.anInt8663 != local148 || local150 != local192.aBoolean579)) {
						local152 = true;
						break;
					}
					@Pc(242) int local242 = this.anIntArray252[local43++] - local45 >> local86;
					if (local242 < 1600) {
						if (this.anIntArray250[local242] >= 64) {
							label107: {
								if (this.anIntArray250[local242] == 64) {
									if (this.anInt4415 == 64) {
										break label107;
									}
									this.anIntArray250[local242] += this.anInt4415++ + 1;
								}
								@Pc(294) Class20_Sub6_Sub1[] local294 = this.aClass20_Sub6_Sub1ArrayArray4[this.anIntArray250[local242] - 64 - 1];
								@Pc(304) int local304 = this.anIntArray250[local242] - 1 - 64;
								@Pc(306) int local306 = this.anIntArray251[this.anIntArray250[local242] - 1 - 64];
								this.anIntArray251[local304] = this.anIntArray251[this.anIntArray250[local242] - 1 - 64] + 1;
								local294[local306] = local192;
							}
						} else {
							this.aClass20_Sub6_Sub1ArrayArray3[local242][this.anIntArray250[local242]++] = local192;
						}
					}
					local54 = local54.aClass20_Sub6_9;
				}
				if (local148 >= 0) {
					arg2.method8895(local148);
				} else {
					arg2.method8895(-1);
				}
				if (local150 && Static10.aFloat6 != arg2.aFloat219) {
					arg2.xa(Static10.aFloat6);
				} else if (arg2.aFloat219 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method3872(arg2, local113);
			}
		} catch (@Pc(377) Exception local377) {
		}
		this.method3868(arg2);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!wh;I)V")
	private void method3872(@OriginalArg(1) Class100_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray41, 0);
		@Pc(15) float local15 = this.aFloatArray41[0];
		@Pc(20) float local20 = this.aFloatArray41[4];
		@Pc(25) float local25 = this.aFloatArray41[8];
		@Pc(30) float local30 = this.aFloatArray41[1];
		@Pc(35) float local35 = this.aFloatArray41[5];
		@Pc(40) float local40 = this.aFloatArray41[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(60) float local60 = local20 - local35;
		@Pc(64) float local64 = local25 - local40;
		@Pc(74) float local74 = local30 - local15;
		@Pc(78) float local78 = local35 - local20;
		this.aClass6_Sub40_Sub1_2.anInt10169 = 0;
		@Pc(86) float local86 = local40 - local25;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(117) int local117;
		@Pc(126) Class20_Sub6_Sub1 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(486) float local486;
		@Pc(491) int local491;
		@Pc(431) int local431;
		@Pc(447) Class20_Sub6_Sub1 local447;
		@Pc(450) int local450;
		@Pc(463) byte local463;
		@Pc(468) byte local468;
		@Pc(480) float local480;
		if (arg0.aBoolean700) {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray250[local93] <= 64 ? this.anIntArray250[local93] : 64;
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass20_Sub6_Sub1ArrayArray3[local93][local117];
						local129 = local126.anInt8660;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt8658 >> 12);
						local159 = (float) (local126.anInt8662 >> 12);
						local165 = (float) (local126.anInt8661 >> 12);
						local170 = local126.anInt8657 >> 12;
						this.aClass6_Sub40_Sub1_2.method7692(0.0F);
						this.aClass6_Sub40_Sub1_2.method7692(0.0F);
						this.aClass6_Sub40_Sub1_2.method7692(local44 * (float) -local170 + local153);
						this.aClass6_Sub40_Sub1_2.method7692(local48 * (float) -local170 + local159);
						this.aClass6_Sub40_Sub1_2.method7692((float) -local170 * local52 + local165);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
						this.aClass6_Sub40_Sub1_2.method7692(1.0F);
						this.aClass6_Sub40_Sub1_2.method7692(0.0F);
						this.aClass6_Sub40_Sub1_2.method7692((float) local170 * local56 + local153);
						this.aClass6_Sub40_Sub1_2.method7692(local60 * (float) local170 + local159);
						this.aClass6_Sub40_Sub1_2.method7692(local165 + (float) local170 * local64);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
						this.aClass6_Sub40_Sub1_2.method7692(1.0F);
						this.aClass6_Sub40_Sub1_2.method7692(1.0F);
						this.aClass6_Sub40_Sub1_2.method7692(local153 + local44 * (float) local170);
						this.aClass6_Sub40_Sub1_2.method7692(local159 + local48 * (float) local170);
						this.aClass6_Sub40_Sub1_2.method7692(local165 + local52 * (float) local170);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
						this.aClass6_Sub40_Sub1_2.method7692(0.0F);
						this.aClass6_Sub40_Sub1_2.method7692(1.0F);
						this.aClass6_Sub40_Sub1_2.method7692(local74 * (float) local170 + local153);
						this.aClass6_Sub40_Sub1_2.method7692(local159 + local78 * (float) local170);
						this.aClass6_Sub40_Sub1_2.method7692((float) local170 * local86 + local165);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
					}
					if (this.anIntArray250[local93] > 64) {
						local431 = this.anIntArray250[local93] - 64 - 1;
						for (local129 = this.anIntArray251[local431] - 1; local129 >= 0; local129--) {
							local447 = this.aClass20_Sub6_Sub1ArrayArray4[local431][local129];
							local450 = local447.anInt8660;
							local142 = (byte) (local450 >> 16);
							local147 = (byte) (local450 >> 8);
							local463 = (byte) local450;
							local468 = (byte) (local450 >>> 24);
							local165 = (float) (local447.anInt8658 >> 12);
							local480 = (float) (local447.anInt8662 >> 12);
							local486 = (float) (local447.anInt8661 >> 12);
							local491 = local447.anInt8657 >> 12;
							this.aClass6_Sub40_Sub1_2.method7692(0.0F);
							this.aClass6_Sub40_Sub1_2.method7692(0.0F);
							this.aClass6_Sub40_Sub1_2.method7692(local165 + local44 * (float) -local491);
							this.aClass6_Sub40_Sub1_2.method7692(local48 * (float) -local491 + local480);
							this.aClass6_Sub40_Sub1_2.method7692(local52 * (float) -local491 + local486);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
							this.aClass6_Sub40_Sub1_2.method7692(1.0F);
							this.aClass6_Sub40_Sub1_2.method7692(0.0F);
							this.aClass6_Sub40_Sub1_2.method7692(local165 + local56 * (float) local491);
							this.aClass6_Sub40_Sub1_2.method7692(local480 + (float) local491 * local60);
							this.aClass6_Sub40_Sub1_2.method7692(local64 * (float) local491 + local486);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
							this.aClass6_Sub40_Sub1_2.method7692(1.0F);
							this.aClass6_Sub40_Sub1_2.method7692(1.0F);
							this.aClass6_Sub40_Sub1_2.method7692(local165 + local44 * (float) local491);
							this.aClass6_Sub40_Sub1_2.method7692(local48 * (float) local491 + local480);
							this.aClass6_Sub40_Sub1_2.method7692((float) local491 * local52 + local486);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
							this.aClass6_Sub40_Sub1_2.method7692(0.0F);
							this.aClass6_Sub40_Sub1_2.method7692(1.0F);
							this.aClass6_Sub40_Sub1_2.method7692(local74 * (float) local491 + local165);
							this.aClass6_Sub40_Sub1_2.method7692(local480 + (float) local491 * local78);
							this.aClass6_Sub40_Sub1_2.method7692((float) local491 * local86 + local486);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
						}
					}
				}
			}
		} else {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray250[local93] > 64 ? 64 : this.anIntArray250[local93];
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass20_Sub6_Sub1ArrayArray3[local93][local117];
						local129 = local126.anInt8660;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt8658 >> 12);
						local159 = (float) (local126.anInt8662 >> 12);
						local165 = (float) (local126.anInt8661 >> 12);
						local170 = local126.anInt8657 >> 12;
						this.aClass6_Sub40_Sub1_2.method7691(0.0F);
						this.aClass6_Sub40_Sub1_2.method7691(0.0F);
						this.aClass6_Sub40_Sub1_2.method7691((float) -local170 * local44 + local153);
						this.aClass6_Sub40_Sub1_2.method7691(local159 + (float) -local170 * local48);
						this.aClass6_Sub40_Sub1_2.method7691(local165 + (float) -local170 * local52);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
						this.aClass6_Sub40_Sub1_2.method7691(1.0F);
						this.aClass6_Sub40_Sub1_2.method7691(0.0F);
						this.aClass6_Sub40_Sub1_2.method7691(local56 * (float) local170 + local153);
						this.aClass6_Sub40_Sub1_2.method7691(local159 + (float) local170 * local60);
						this.aClass6_Sub40_Sub1_2.method7691((float) local170 * local64 + local165);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
						this.aClass6_Sub40_Sub1_2.method7691(1.0F);
						this.aClass6_Sub40_Sub1_2.method7691(1.0F);
						this.aClass6_Sub40_Sub1_2.method7691(local153 + (float) local170 * local44);
						this.aClass6_Sub40_Sub1_2.method7691(local48 * (float) local170 + local159);
						this.aClass6_Sub40_Sub1_2.method7691(local52 * (float) local170 + local165);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
						this.aClass6_Sub40_Sub1_2.method7691(0.0F);
						this.aClass6_Sub40_Sub1_2.method7691(1.0F);
						this.aClass6_Sub40_Sub1_2.method7691((float) local170 * local74 + local153);
						this.aClass6_Sub40_Sub1_2.method7691((float) local170 * local78 + local159);
						this.aClass6_Sub40_Sub1_2.method7691(local86 * (float) local170 + local165);
						this.aClass6_Sub40_Sub1_2.method8589(local134);
						this.aClass6_Sub40_Sub1_2.method8589(local139);
						this.aClass6_Sub40_Sub1_2.method8589(local142);
						this.aClass6_Sub40_Sub1_2.method8589(local147);
					}
					if (this.anIntArray250[local93] > 64) {
						local431 = this.anIntArray250[local93] - 65;
						for (local129 = this.anIntArray251[local431] - 1; local129 >= 0; local129--) {
							local447 = this.aClass20_Sub6_Sub1ArrayArray4[local431][local129];
							local450 = local447.anInt8660;
							local142 = (byte) (local450 >> 16);
							local147 = (byte) (local450 >> 8);
							local463 = (byte) local450;
							local468 = (byte) (local450 >>> 24);
							local165 = (float) (local447.anInt8658 >> 12);
							local480 = (float) (local447.anInt8662 >> 12);
							local486 = (float) (local447.anInt8661 >> 12);
							local491 = local447.anInt8657 >> 12;
							this.aClass6_Sub40_Sub1_2.method7691(0.0F);
							this.aClass6_Sub40_Sub1_2.method7691(0.0F);
							this.aClass6_Sub40_Sub1_2.method7691(local44 * (float) -local491 + local165);
							this.aClass6_Sub40_Sub1_2.method7691((float) -local491 * local48 + local480);
							this.aClass6_Sub40_Sub1_2.method7691(local486 + local52 * (float) -local491);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
							this.aClass6_Sub40_Sub1_2.method7691(1.0F);
							this.aClass6_Sub40_Sub1_2.method7691(0.0F);
							this.aClass6_Sub40_Sub1_2.method7691(local165 + local56 * (float) local491);
							this.aClass6_Sub40_Sub1_2.method7691(local60 * (float) local491 + local480);
							this.aClass6_Sub40_Sub1_2.method7691(local64 * (float) local491 + local486);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
							this.aClass6_Sub40_Sub1_2.method7691(1.0F);
							this.aClass6_Sub40_Sub1_2.method7691(1.0F);
							this.aClass6_Sub40_Sub1_2.method7691(local44 * (float) local491 + local165);
							this.aClass6_Sub40_Sub1_2.method7691(local480 + (float) local491 * local48);
							this.aClass6_Sub40_Sub1_2.method7691(local486 + local52 * (float) local491);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
							this.aClass6_Sub40_Sub1_2.method7691(0.0F);
							this.aClass6_Sub40_Sub1_2.method7691(1.0F);
							this.aClass6_Sub40_Sub1_2.method7691(local165 + local74 * (float) local491);
							this.aClass6_Sub40_Sub1_2.method7691((float) local491 * local78 + local480);
							this.aClass6_Sub40_Sub1_2.method7691((float) local491 * local86 + local486);
							this.aClass6_Sub40_Sub1_2.method8589(local142);
							this.aClass6_Sub40_Sub1_2.method8589(local147);
							this.aClass6_Sub40_Sub1_2.method8589(local463);
							this.aClass6_Sub40_Sub1_2.method8589(local468);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub40_Sub1_2.anInt10169 != 0) {
			this.anInterface27_4.method4867(24, this.aClass6_Sub40_Sub1_2.anInt10169, this.aClass6_Sub40_Sub1_2.aByteArray113);
			arg0.method8885(this.aClass55_10, this.aClass55_9, this.aClass55_8, (Class55) null);
			arg0.method8912(this.aClass6_Sub40_Sub1_2.anInt10169 / 24);
		}
	}
}
