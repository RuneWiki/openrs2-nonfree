import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class249 {

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!uo;")
	private Class352 aClass352_12;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!uo;")
	private Class352 aClass352_13;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!uo;")
	private Class352 aClass352_14;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!ju;")
	private Interface14 anInterface14_5;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[F")
	private final float[] aFloatArray58 = new float[16];

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!fm;")
	private final Class2_Sub17_Sub2 aClass2_Sub17_Sub2_2 = new Class2_Sub17_Sub2(786336);

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	private final int anInt6845 = Static138.method2523(1600);

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "[[Lclient!l;")
	private final Class16_Sub6_Sub1[][] aClass16_Sub6_Sub1ArrayArray3 = new Class16_Sub6_Sub1[64][768];

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	private int anInt6846 = 0;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
	private final int[] anIntArray457 = new int[8191];

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
	private final int[] anIntArray456 = new int[1600];

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "[I")
	private final int[] anIntArray458 = new int[64];

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "[[Lclient!l;")
	private final Class16_Sub6_Sub1[][] aClass16_Sub6_Sub1ArrayArray4 = new Class16_Sub6_Sub1[1600][64];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!bi;IILclient!fl;)V")
	public void method5950(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class119 arg2) {
		if (arg0.aClass51_Sub3_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method5954(arg1, arg0);
		} else {
			this.method5953(arg0);
		}
		@Pc(26) float local26 = arg0.aClass51_Sub3_3.aFloat132;
		@Pc(30) float local30 = arg0.aClass51_Sub3_3.aFloat141;
		@Pc(38) float local38 = arg0.aClass51_Sub3_3.aFloat134;
		@Pc(42) float local42 = arg0.aClass51_Sub3_3.aFloat140;
		try {
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = Integer.MAX_VALUE;
			@Pc(48) int local48 = 0;
			@Pc(52) Class16_Sub6 local52 = arg2.aClass202_1.aClass16_Sub6_1;
			@Pc(55) Class16_Sub6 local55;
			@Pc(87) int local87;
			for (local55 = local52.aClass16_Sub6_10; local55 != local52; local55 = local55.aClass16_Sub6_10) {
				@Pc(60) Class16_Sub6_Sub1 local60 = (Class16_Sub6_Sub1) local55;
				local87 = (int) ((float) (local60.anInt10130 >> 12) * local38 + (float) (local60.anInt10131 >> 12) * local30 + (float) (local60.anInt10126 >> 12) * local26 + local42);
				if (local46 > local87) {
					local46 = local87;
				}
				if (local87 > local48) {
					local48 = local87;
				}
				this.anIntArray457[local44++] = local87;
			}
			@Pc(117) int local117 = local48 - local46;
			if (local117 + 2 > 1600) {
				local87 = Static138.method2523(local117) + 1 - this.anInt6845;
				local117 = (local117 >> local87) + 2;
			} else {
				local117 += 2;
				local87 = 0;
			}
			local44 = 0;
			local55 = local52.aClass16_Sub6_10;
			@Pc(149) int local149 = -2;
			@Pc(151) boolean local151 = true;
			@Pc(153) boolean local153 = true;
			while (local52 != local55) {
				this.anInt6846 = 0;
				for (@Pc(160) int local160 = 0; local160 < local117; local160++) {
					this.anIntArray456[local160] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray458[local177] = 0;
				}
				while (local52 != local55) {
					@Pc(195) Class16_Sub6_Sub1 local195 = (Class16_Sub6_Sub1) local55;
					if (local153) {
						local149 = local195.anInt10127;
						local151 = local195.aBoolean730;
						local153 = false;
					}
					if (local44 > 0 && (local195.anInt10127 != local149 || local151 != local195.aBoolean730)) {
						local153 = true;
						break;
					}
					@Pc(242) int local242 = this.anIntArray457[local44++] - local46 >> local87;
					if (local242 < 1600) {
						if (this.anIntArray456[local242] >= 64) {
							label107: {
								if (this.anIntArray456[local242] == 64) {
									if (this.anInt6846 == 64) {
										break label107;
									}
									this.anIntArray456[local242] += this.anInt6846++ + 1;
								}
								this.aClass16_Sub6_Sub1ArrayArray3[this.anIntArray456[local242] - 65][this.anIntArray458[this.anIntArray456[local242] - 64 - 1]++] = local195;
							}
						} else {
							this.aClass16_Sub6_Sub1ArrayArray4[local242][this.anIntArray456[local242]++] = local195;
						}
					}
					local55 = local55.aClass16_Sub6_10;
				}
				if (local149 < 0) {
					arg0.method1023(-1);
				} else {
					arg0.method1023(local149);
				}
				if (local151 && Static163.aFloat64 != arg0.aFloat13) {
					arg0.xa(Static163.aFloat64);
				} else if (arg0.aFloat13 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method5951(arg0, local117);
			}
		} catch (@Pc(377) Exception local377) {
		}
		this.method5955(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!bi;II)V")
	private void method5951(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray58, 0);
		@Pc(15) float local15 = this.aFloatArray58[0];
		@Pc(20) float local20 = this.aFloatArray58[4];
		@Pc(29) float local29 = this.aFloatArray58[8];
		@Pc(34) float local34 = this.aFloatArray58[1];
		@Pc(39) float local39 = this.aFloatArray58[5];
		@Pc(44) float local44 = this.aFloatArray58[9];
		@Pc(48) float local48 = local34 + local15;
		@Pc(52) float local52 = local39 + local20;
		@Pc(56) float local56 = local29 + local44;
		@Pc(61) float local61 = local15 - local34;
		@Pc(66) float local66 = local20 - local39;
		@Pc(71) float local71 = local29 - local44;
		@Pc(75) float local75 = local34 - local15;
		@Pc(80) float local80 = local39 - local20;
		@Pc(85) float local85 = local44 - local29;
		this.aClass2_Sub17_Sub2_2.anInt3378 = 0;
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(126) Class16_Sub6_Sub1 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(500) float local500;
		@Pc(505) int local505;
		@Pc(445) int local445;
		@Pc(461) Class16_Sub6_Sub1 local461;
		@Pc(464) int local464;
		@Pc(477) byte local477;
		@Pc(482) byte local482;
		@Pc(494) float local494;
		if (arg0.aBoolean102) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray456[local96] > 64 ? 64 : this.anIntArray456[local96];
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass16_Sub6_Sub1ArrayArray4[local96][local117];
						local129 = local126.anInt10129;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt10126 >> 12);
						local159 = (float) (local126.anInt10131 >> 12);
						local165 = (float) (local126.anInt10130 >> 12);
						local170 = local126.anInt10125 >> 12;
						this.aClass2_Sub17_Sub2_2.method2890(0.0F);
						this.aClass2_Sub17_Sub2_2.method2890(0.0F);
						this.aClass2_Sub17_Sub2_2.method2890((float) -local170 * local48 + local153);
						this.aClass2_Sub17_Sub2_2.method2890((float) -local170 * local52 + local159);
						this.aClass2_Sub17_Sub2_2.method2890((float) -local170 * local56 + local165);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
						this.aClass2_Sub17_Sub2_2.method2890(1.0F);
						this.aClass2_Sub17_Sub2_2.method2890(0.0F);
						this.aClass2_Sub17_Sub2_2.method2890((float) local170 * local61 + local153);
						this.aClass2_Sub17_Sub2_2.method2890(local159 + (float) local170 * local66);
						this.aClass2_Sub17_Sub2_2.method2890(local165 + (float) local170 * local71);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
						this.aClass2_Sub17_Sub2_2.method2890(1.0F);
						this.aClass2_Sub17_Sub2_2.method2890(1.0F);
						this.aClass2_Sub17_Sub2_2.method2890((float) local170 * local48 + local153);
						this.aClass2_Sub17_Sub2_2.method2890((float) local170 * local52 + local159);
						this.aClass2_Sub17_Sub2_2.method2890(local165 + (float) local170 * local56);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
						this.aClass2_Sub17_Sub2_2.method2890(0.0F);
						this.aClass2_Sub17_Sub2_2.method2890(1.0F);
						this.aClass2_Sub17_Sub2_2.method2890(local153 + local75 * (float) local170);
						this.aClass2_Sub17_Sub2_2.method2890(local80 * (float) local170 + local159);
						this.aClass2_Sub17_Sub2_2.method2890((float) local170 * local85 + local165);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
					}
					if (this.anIntArray456[local96] > 64) {
						local445 = this.anIntArray456[local96] - 64 - 1;
						for (local129 = this.anIntArray458[local445] - 1; local129 >= 0; local129--) {
							local461 = this.aClass16_Sub6_Sub1ArrayArray3[local445][local129];
							local464 = local461.anInt10129;
							local142 = (byte) (local464 >> 16);
							local147 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local165 = (float) (local461.anInt10126 >> 12);
							local494 = (float) (local461.anInt10131 >> 12);
							local500 = (float) (local461.anInt10130 >> 12);
							local505 = local461.anInt10125 >> 12;
							this.aClass2_Sub17_Sub2_2.method2890(0.0F);
							this.aClass2_Sub17_Sub2_2.method2890(0.0F);
							this.aClass2_Sub17_Sub2_2.method2890(local48 * (float) -local505 + local165);
							this.aClass2_Sub17_Sub2_2.method2890(local494 + (float) -local505 * local52);
							this.aClass2_Sub17_Sub2_2.method2890(local56 * (float) -local505 + local500);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
							this.aClass2_Sub17_Sub2_2.method2890(1.0F);
							this.aClass2_Sub17_Sub2_2.method2890(0.0F);
							this.aClass2_Sub17_Sub2_2.method2890(local165 + local61 * (float) local505);
							this.aClass2_Sub17_Sub2_2.method2890(local66 * (float) local505 + local494);
							this.aClass2_Sub17_Sub2_2.method2890(local71 * (float) local505 + local500);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
							this.aClass2_Sub17_Sub2_2.method2890(1.0F);
							this.aClass2_Sub17_Sub2_2.method2890(1.0F);
							this.aClass2_Sub17_Sub2_2.method2890(local165 + local48 * (float) local505);
							this.aClass2_Sub17_Sub2_2.method2890(local52 * (float) local505 + local494);
							this.aClass2_Sub17_Sub2_2.method2890(local500 + (float) local505 * local56);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
							this.aClass2_Sub17_Sub2_2.method2890(0.0F);
							this.aClass2_Sub17_Sub2_2.method2890(1.0F);
							this.aClass2_Sub17_Sub2_2.method2890(local165 + local75 * (float) local505);
							this.aClass2_Sub17_Sub2_2.method2890(local80 * (float) local505 + local494);
							this.aClass2_Sub17_Sub2_2.method2890(local500 + (float) local505 * local85);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray456[local96] > 64 ? 64 : this.anIntArray456[local96];
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass16_Sub6_Sub1ArrayArray4[local96][local117];
						local129 = local126.anInt10129;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt10126 >> 12);
						local159 = (float) (local126.anInt10131 >> 12);
						local165 = (float) (local126.anInt10130 >> 12);
						local170 = local126.anInt10125 >> 12;
						this.aClass2_Sub17_Sub2_2.method2892(0.0F);
						this.aClass2_Sub17_Sub2_2.method2892(0.0F);
						this.aClass2_Sub17_Sub2_2.method2892((float) -local170 * local48 + local153);
						this.aClass2_Sub17_Sub2_2.method2892(local159 + (float) -local170 * local52);
						this.aClass2_Sub17_Sub2_2.method2892((float) -local170 * local56 + local165);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
						this.aClass2_Sub17_Sub2_2.method2892(1.0F);
						this.aClass2_Sub17_Sub2_2.method2892(0.0F);
						this.aClass2_Sub17_Sub2_2.method2892((float) local170 * local61 + local153);
						this.aClass2_Sub17_Sub2_2.method2892((float) local170 * local66 + local159);
						this.aClass2_Sub17_Sub2_2.method2892(local71 * (float) local170 + local165);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
						this.aClass2_Sub17_Sub2_2.method2892(1.0F);
						this.aClass2_Sub17_Sub2_2.method2892(1.0F);
						this.aClass2_Sub17_Sub2_2.method2892((float) local170 * local48 + local153);
						this.aClass2_Sub17_Sub2_2.method2892((float) local170 * local52 + local159);
						this.aClass2_Sub17_Sub2_2.method2892((float) local170 * local56 + local165);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
						this.aClass2_Sub17_Sub2_2.method2892(0.0F);
						this.aClass2_Sub17_Sub2_2.method2892(1.0F);
						this.aClass2_Sub17_Sub2_2.method2892(local153 + (float) local170 * local75);
						this.aClass2_Sub17_Sub2_2.method2892(local159 + (float) local170 * local80);
						this.aClass2_Sub17_Sub2_2.method2892(local165 + local85 * (float) local170);
						this.aClass2_Sub17_Sub2_2.method2837(local134);
						this.aClass2_Sub17_Sub2_2.method2837(local139);
						this.aClass2_Sub17_Sub2_2.method2837(local142);
						this.aClass2_Sub17_Sub2_2.method2837(local147);
					}
					if (this.anIntArray456[local96] > 64) {
						local445 = this.anIntArray456[local96] - 64 - 1;
						for (local129 = this.anIntArray458[local445] - 1; local129 >= 0; local129--) {
							local461 = this.aClass16_Sub6_Sub1ArrayArray3[local445][local129];
							local464 = local461.anInt10129;
							local142 = (byte) (local464 >> 16);
							local147 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local165 = (float) (local461.anInt10126 >> 12);
							local494 = (float) (local461.anInt10131 >> 12);
							local500 = (float) (local461.anInt10130 >> 12);
							local505 = local461.anInt10125 >> 12;
							this.aClass2_Sub17_Sub2_2.method2892(0.0F);
							this.aClass2_Sub17_Sub2_2.method2892(0.0F);
							this.aClass2_Sub17_Sub2_2.method2892(local165 + (float) -local505 * local48);
							this.aClass2_Sub17_Sub2_2.method2892(local494 + local52 * (float) -local505);
							this.aClass2_Sub17_Sub2_2.method2892(local500 + local56 * (float) -local505);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
							this.aClass2_Sub17_Sub2_2.method2892(1.0F);
							this.aClass2_Sub17_Sub2_2.method2892(0.0F);
							this.aClass2_Sub17_Sub2_2.method2892((float) local505 * local61 + local165);
							this.aClass2_Sub17_Sub2_2.method2892((float) local505 * local66 + local494);
							this.aClass2_Sub17_Sub2_2.method2892((float) local505 * local71 + local500);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
							this.aClass2_Sub17_Sub2_2.method2892(1.0F);
							this.aClass2_Sub17_Sub2_2.method2892(1.0F);
							this.aClass2_Sub17_Sub2_2.method2892((float) local505 * local48 + local165);
							this.aClass2_Sub17_Sub2_2.method2892(local52 * (float) local505 + local494);
							this.aClass2_Sub17_Sub2_2.method2892(local500 + local56 * (float) local505);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
							this.aClass2_Sub17_Sub2_2.method2892(0.0F);
							this.aClass2_Sub17_Sub2_2.method2892(1.0F);
							this.aClass2_Sub17_Sub2_2.method2892(local165 + local75 * (float) local505);
							this.aClass2_Sub17_Sub2_2.method2892(local494 + local80 * (float) local505);
							this.aClass2_Sub17_Sub2_2.method2892((float) local505 * local85 + local500);
							this.aClass2_Sub17_Sub2_2.method2837(local142);
							this.aClass2_Sub17_Sub2_2.method2837(local147);
							this.aClass2_Sub17_Sub2_2.method2837(local477);
							this.aClass2_Sub17_Sub2_2.method2837(local482);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub17_Sub2_2.anInt3378 != 0) {
			this.anInterface14_5.method4793(24, this.aClass2_Sub17_Sub2_2.anInt3378, this.aClass2_Sub17_Sub2_2.aByteArray26);
			arg0.method1067((Class352) null, this.aClass352_14, this.aClass352_12, this.aClass352_13);
			arg0.method1089(this.aClass2_Sub17_Sub2_2.anInt3378 / 24);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!bi;I)V")
	public void method5952(@OriginalArg(0) Class13_Sub2 arg0) {
		this.anInterface14_5 = arg0.method1060((byte[]) null, true, 196584, 24);
		this.aClass352_13 = new Class352(this.anInterface14_5, 5126, 2, 0);
		this.aClass352_14 = new Class352(this.anInterface14_5, 5126, 3, 8);
		this.aClass352_12 = new Class352(this.anInterface14_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!bi;)V")
	private void method5953(@OriginalArg(1) Class13_Sub2 arg0) {
		Static163.aFloat64 = arg0.aFloat13;
		arg0.method1030();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1062(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBLclient!bi;)V")
	private void method5954(@OriginalArg(0) int arg0, @OriginalArg(2) Class13_Sub2 arg1) {
		Static163.aFloat64 = arg1.aFloat13;
		arg1.method1054((float) arg0);
		arg1.method1043();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method1062(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!bi;)V")
	private void method5955(@OriginalArg(1) Class13_Sub2 arg0) {
		arg0.method1062(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static163.aFloat64 != arg0.aFloat13) {
			arg0.xa(Static163.aFloat64);
		}
	}
}
