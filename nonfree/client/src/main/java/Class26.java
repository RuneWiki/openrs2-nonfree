import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class26 {

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Lclient!ms;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "Lclient!bh;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "Lclient!bh;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "Lclient!bh;")
	private Class23 aClass23_3;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "[F")
	private final float[] aFloatArray2 = new float[16];

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Lclient!wl;")
	private final Class6_Sub1_Sub2 aClass6_Sub1_Sub2_1 = new Class6_Sub1_Sub2(786336);

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
	private final int anInt882 = Static12.method347(1600);

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
	private final int[] anIntArray53 = new int[8191];

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "[[Lclient!mq;")
	private final Class57_Sub1_Sub1[][] aClass57_Sub1_Sub1ArrayArray2 = new Class57_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[I")
	private final int[] anIntArray55 = new int[64];

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
	private final int[] anIntArray54 = new int[1600];

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
	private int anInt883 = 0;

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "[[Lclient!mq;")
	private final Class57_Sub1_Sub1[][] aClass57_Sub1_Sub1ArrayArray1 = new Class57_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!rl;I)V")
	private void method748(@OriginalArg(1) Class66_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray2, 0);
		@Pc(15) float local15 = this.aFloatArray2[0];
		@Pc(20) float local20 = this.aFloatArray2[4];
		@Pc(25) float local25 = this.aFloatArray2[8];
		@Pc(30) float local30 = this.aFloatArray2[1];
		@Pc(35) float local35 = this.aFloatArray2[5];
		@Pc(40) float local40 = this.aFloatArray2[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(58) float local58 = local25 + local40;
		@Pc(62) float local62 = local15 - local30;
		@Pc(67) float local67 = local20 - local35;
		@Pc(71) float local71 = local25 - local40;
		@Pc(76) float local76 = local30 - local15;
		@Pc(81) float local81 = local35 - local20;
		@Pc(85) float local85 = local40 - local25;
		this.aClass6_Sub1_Sub2_1.anInt7898 = 0;
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(126) Class57_Sub1_Sub1 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(501) float local501;
		@Pc(506) int local506;
		@Pc(446) int local446;
		@Pc(462) Class57_Sub1_Sub1 local462;
		@Pc(465) int local465;
		@Pc(478) byte local478;
		@Pc(483) byte local483;
		@Pc(495) float local495;
		if (arg0.aBoolean373) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray54[local96] <= 64 ? this.anIntArray54[local96] : 64;
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass57_Sub1_Sub1ArrayArray2[local96][local117];
						local129 = local126.anInt5149;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt5158 >> Static206.anInt3842;
						local159 = local126.anInt5150 >> Static206.anInt3842;
						local165 = local126.anInt5154 >> Static206.anInt3842;
						local170 = local126.anInt5153 >> Static206.anInt3842;
						this.aClass6_Sub1_Sub2_1.method6493(0.0F);
						this.aClass6_Sub1_Sub2_1.method6493(0.0F);
						this.aClass6_Sub1_Sub2_1.method6493(local153 + local44 * (float) -local170);
						this.aClass6_Sub1_Sub2_1.method6493((float) -local170 * local48 + local159);
						this.aClass6_Sub1_Sub2_1.method6493(local165 + (float) -local170 * local58);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
						this.aClass6_Sub1_Sub2_1.method6493(1.0F);
						this.aClass6_Sub1_Sub2_1.method6493(0.0F);
						this.aClass6_Sub1_Sub2_1.method6493((float) local170 * local62 + local153);
						this.aClass6_Sub1_Sub2_1.method6493((float) local170 * local67 + local159);
						this.aClass6_Sub1_Sub2_1.method6493(local71 * (float) local170 + local165);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
						this.aClass6_Sub1_Sub2_1.method6493(1.0F);
						this.aClass6_Sub1_Sub2_1.method6493(1.0F);
						this.aClass6_Sub1_Sub2_1.method6493((float) local170 * local44 + local153);
						this.aClass6_Sub1_Sub2_1.method6493(local48 * (float) local170 + local159);
						this.aClass6_Sub1_Sub2_1.method6493(local165 + (float) local170 * local58);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
						this.aClass6_Sub1_Sub2_1.method6493(0.0F);
						this.aClass6_Sub1_Sub2_1.method6493(1.0F);
						this.aClass6_Sub1_Sub2_1.method6493(local153 + (float) local170 * local76);
						this.aClass6_Sub1_Sub2_1.method6493((float) local170 * local81 + local159);
						this.aClass6_Sub1_Sub2_1.method6493((float) local170 * local85 + local165);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
					}
					if (this.anIntArray54[local96] > 64) {
						local446 = this.anIntArray54[local96] - 64 - 1;
						for (local129 = this.anIntArray55[local446] - 1; local129 >= 0; local129--) {
							local462 = this.aClass57_Sub1_Sub1ArrayArray1[local446][local129];
							local465 = local462.anInt5149;
							local142 = (byte) (local465 >> 16);
							local147 = (byte) (local465 >> 8);
							local478 = (byte) local465;
							local483 = (byte) (local465 >>> 24);
							local165 = local462.anInt5158 >> Static206.anInt3842;
							local495 = local462.anInt5150 >> Static206.anInt3842;
							local501 = local462.anInt5154 >> Static206.anInt3842;
							local506 = local462.anInt5153 >> Static206.anInt3842;
							this.aClass6_Sub1_Sub2_1.method6493(0.0F);
							this.aClass6_Sub1_Sub2_1.method6493(0.0F);
							this.aClass6_Sub1_Sub2_1.method6493((float) -local506 * local44 + local165);
							this.aClass6_Sub1_Sub2_1.method6493(local495 + (float) -local506 * local48);
							this.aClass6_Sub1_Sub2_1.method6493(local58 * (float) -local506 + local501);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
							this.aClass6_Sub1_Sub2_1.method6493(1.0F);
							this.aClass6_Sub1_Sub2_1.method6493(0.0F);
							this.aClass6_Sub1_Sub2_1.method6493(local165 + (float) local506 * local62);
							this.aClass6_Sub1_Sub2_1.method6493(local67 * (float) local506 + local495);
							this.aClass6_Sub1_Sub2_1.method6493(local71 * (float) local506 + local501);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
							this.aClass6_Sub1_Sub2_1.method6493(1.0F);
							this.aClass6_Sub1_Sub2_1.method6493(1.0F);
							this.aClass6_Sub1_Sub2_1.method6493(local165 + local44 * (float) local506);
							this.aClass6_Sub1_Sub2_1.method6493(local495 + (float) local506 * local48);
							this.aClass6_Sub1_Sub2_1.method6493(local501 + (float) local506 * local58);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
							this.aClass6_Sub1_Sub2_1.method6493(0.0F);
							this.aClass6_Sub1_Sub2_1.method6493(1.0F);
							this.aClass6_Sub1_Sub2_1.method6493((float) local506 * local76 + local165);
							this.aClass6_Sub1_Sub2_1.method6493(local81 * (float) local506 + local495);
							this.aClass6_Sub1_Sub2_1.method6493((float) local506 * local85 + local501);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray54[local96] <= 64 ? this.anIntArray54[local96] : 64;
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass57_Sub1_Sub1ArrayArray2[local96][local117];
						local129 = local126.anInt5149;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt5158 >> Static206.anInt3842;
						local159 = local126.anInt5150 >> Static206.anInt3842;
						local165 = local126.anInt5154 >> Static206.anInt3842;
						local170 = local126.anInt5153 >> Static206.anInt3842;
						this.aClass6_Sub1_Sub2_1.method6494(0.0F);
						this.aClass6_Sub1_Sub2_1.method6494(0.0F);
						this.aClass6_Sub1_Sub2_1.method6494(local153 + (float) -local170 * local44);
						this.aClass6_Sub1_Sub2_1.method6494((float) -local170 * local48 + local159);
						this.aClass6_Sub1_Sub2_1.method6494((float) -local170 * local58 + local165);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
						this.aClass6_Sub1_Sub2_1.method6494(1.0F);
						this.aClass6_Sub1_Sub2_1.method6494(0.0F);
						this.aClass6_Sub1_Sub2_1.method6494(local153 + (float) local170 * local62);
						this.aClass6_Sub1_Sub2_1.method6494(local159 + local67 * (float) local170);
						this.aClass6_Sub1_Sub2_1.method6494((float) local170 * local71 + local165);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
						this.aClass6_Sub1_Sub2_1.method6494(1.0F);
						this.aClass6_Sub1_Sub2_1.method6494(1.0F);
						this.aClass6_Sub1_Sub2_1.method6494(local44 * (float) local170 + local153);
						this.aClass6_Sub1_Sub2_1.method6494(local159 + (float) local170 * local48);
						this.aClass6_Sub1_Sub2_1.method6494((float) local170 * local58 + local165);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
						this.aClass6_Sub1_Sub2_1.method6494(0.0F);
						this.aClass6_Sub1_Sub2_1.method6494(1.0F);
						this.aClass6_Sub1_Sub2_1.method6494(local76 * (float) local170 + local153);
						this.aClass6_Sub1_Sub2_1.method6494(local159 + local81 * (float) local170);
						this.aClass6_Sub1_Sub2_1.method6494(local85 * (float) local170 + local165);
						this.aClass6_Sub1_Sub2_1.method6439(local134);
						this.aClass6_Sub1_Sub2_1.method6439(local139);
						this.aClass6_Sub1_Sub2_1.method6439(local142);
						this.aClass6_Sub1_Sub2_1.method6439(local147);
					}
					if (this.anIntArray54[local96] > 64) {
						local446 = this.anIntArray54[local96] - 64 - 1;
						for (local129 = this.anIntArray55[local446] - 1; local129 >= 0; local129--) {
							local462 = this.aClass57_Sub1_Sub1ArrayArray1[local446][local129];
							local465 = local462.anInt5149;
							local142 = (byte) (local465 >> 16);
							local147 = (byte) (local465 >> 8);
							local478 = (byte) local465;
							local483 = (byte) (local465 >>> 24);
							local165 = local462.anInt5158 >> Static206.anInt3842;
							local495 = local462.anInt5150 >> Static206.anInt3842;
							local501 = local462.anInt5154 >> Static206.anInt3842;
							local506 = local462.anInt5153 >> Static206.anInt3842;
							this.aClass6_Sub1_Sub2_1.method6494(0.0F);
							this.aClass6_Sub1_Sub2_1.method6494(0.0F);
							this.aClass6_Sub1_Sub2_1.method6494((float) -local506 * local44 + local165);
							this.aClass6_Sub1_Sub2_1.method6494(local48 * (float) -local506 + local495);
							this.aClass6_Sub1_Sub2_1.method6494(local58 * (float) -local506 + local501);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
							this.aClass6_Sub1_Sub2_1.method6494(1.0F);
							this.aClass6_Sub1_Sub2_1.method6494(0.0F);
							this.aClass6_Sub1_Sub2_1.method6494(local62 * (float) local506 + local165);
							this.aClass6_Sub1_Sub2_1.method6494((float) local506 * local67 + local495);
							this.aClass6_Sub1_Sub2_1.method6494(local501 + local71 * (float) local506);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
							this.aClass6_Sub1_Sub2_1.method6494(1.0F);
							this.aClass6_Sub1_Sub2_1.method6494(1.0F);
							this.aClass6_Sub1_Sub2_1.method6494(local44 * (float) local506 + local165);
							this.aClass6_Sub1_Sub2_1.method6494((float) local506 * local48 + local495);
							this.aClass6_Sub1_Sub2_1.method6494(local501 + local58 * (float) local506);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
							this.aClass6_Sub1_Sub2_1.method6494(0.0F);
							this.aClass6_Sub1_Sub2_1.method6494(1.0F);
							this.aClass6_Sub1_Sub2_1.method6494(local76 * (float) local506 + local165);
							this.aClass6_Sub1_Sub2_1.method6494(local81 * (float) local506 + local495);
							this.aClass6_Sub1_Sub2_1.method6494(local85 * (float) local506 + local501);
							this.aClass6_Sub1_Sub2_1.method6439(local142);
							this.aClass6_Sub1_Sub2_1.method6439(local147);
							this.aClass6_Sub1_Sub2_1.method6439(local478);
							this.aClass6_Sub1_Sub2_1.method6439(local483);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub1_Sub2_1.anInt7898 != 0) {
			this.anInterface5_2.method6167(this.aClass6_Sub1_Sub2_1.anInt7898, 24, this.aClass6_Sub1_Sub2_1.aByteArray96);
			arg0.method5087(this.aClass23_2, this.aClass23_1, null, this.aClass23_3);
			arg0.method5124(this.aClass6_Sub1_Sub2_1.anInt7898 / 24);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!rl;B)V")
	private void method749(@OriginalArg(0) Class66_Sub2 arg0) {
		Static90.aFloat18 = arg0.aFloat77;
		arg0.method5117();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5134(false);
		arg0.method5093(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!rl;)V")
	private void method753(@OriginalArg(1) Class66_Sub2 arg0) {
		arg0.method5134(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat77 != Static90.aFloat18) {
			arg0.method5025(Static90.aFloat18);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!rl;ILclient!bv;)V")
	public void method754(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(2) Class32 arg1) {
		if (arg0.aClass5_Sub2_3 == null) {
			return;
		}
		this.method749(arg0);
		@Pc(17) float local17 = arg0.aClass5_Sub2_3.aFloat49;
		@Pc(21) float local21 = arg0.aClass5_Sub2_3.aFloat42;
		@Pc(25) float local25 = arg0.aClass5_Sub2_3.aFloat48;
		@Pc(29) float local29 = arg0.aClass5_Sub2_3.aFloat40;
		try {
			@Pc(43) int local43;
			@Pc(51) int local51;
			@Pc(75) Class57_Sub1 local75;
			@Pc(88) int local88;
			@Pc(178) int local178;
			if (arg1.aBoolean94) {
				local43 = arg1.anInt1155 - arg1.anInt1156;
				if (local43 + 2 <= 1600) {
					local43 += 2;
					local51 = 0;
				} else {
					local51 = Static12.method347(local43) + 1 - this.anInt882;
					local43 = (local43 >> local51) + 2;
				}
				@Pc(72) Class57_Sub1 local72 = arg1.aClass177_1.aClass57_Sub1_5;
				local75 = local72.aClass57_Sub1_7;
				@Pc(77) int local77 = -2;
				@Pc(79) boolean local79 = true;
				@Pc(81) boolean local81 = true;
				while (local75 != local72) {
					this.anInt883 = 0;
					for (local88 = 0; local88 < local43; local88++) {
						this.anIntArray54[local88] = 0;
					}
					for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
						this.anIntArray55[local105] = 0;
					}
					while (local75 != local72) {
						@Pc(121) Class57_Sub1_Sub1 local121 = (Class57_Sub1_Sub1) local75;
						if (local81) {
							local77 = local121.anInt5157;
							local81 = false;
							local79 = local121.aBoolean321;
						} else if (local121.anInt5157 != local77 || local121.aBoolean321 != local79) {
							local81 = true;
							break;
						}
						local178 = (int) (local17 * (float) (local121.anInt5158 >> Static206.anInt3842) + (float) (local121.anInt5150 >> Static206.anInt3842) * local21 + (float) (local121.anInt5154 >> Static206.anInt3842) * local25 + local29) - arg1.anInt1156 >> local51;
						if (local178 < 1600) {
							if (this.anIntArray54[local178] >= 64) {
								label191: {
									if (this.anIntArray54[local178] == 64) {
										if (this.anInt883 == 64) {
											break label191;
										}
										this.anIntArray54[local178] += this.anInt883++ + 1;
									}
									this.aClass57_Sub1_Sub1ArrayArray1[this.anIntArray54[local178] - 65][this.anIntArray55[this.anIntArray54[local178] - 64 - 1]++] = local121;
								}
							} else {
								this.aClass57_Sub1_Sub1ArrayArray2[local178][this.anIntArray54[local178]++] = local121;
							}
						}
						local75 = local75.aClass57_Sub1_7;
					}
					if (local77 < 0) {
						arg0.method5109(null);
					} else {
						arg0.method5109(arg0.aClass69_1.method1819(local77));
						arg0.method5140(arg0.anInterface8_5.method5566(local77).anInt5196);
					}
					if (local79 && Static90.aFloat18 != arg0.aFloat77) {
						arg0.method5025(Static90.aFloat18);
					} else if (arg0.aFloat77 != 1.0F) {
						arg0.method5025(1.0F);
					}
					this.method748(arg0, local43);
				}
			} else {
				local43 = 0;
				local51 = Integer.MAX_VALUE;
				@Pc(336) int local336 = 0;
				local75 = arg1.aClass177_1.aClass57_Sub1_5;
				@Pc(343) Class57_Sub1 local343;
				@Pc(375) int local375;
				for (local343 = local75.aClass57_Sub1_7; local343 != local75; local343 = local343.aClass57_Sub1_7) {
					@Pc(348) Class57_Sub1_Sub1 local348 = (Class57_Sub1_Sub1) local343;
					local375 = (int) (local29 + local17 * (float) (local348.anInt5158 >> Static206.anInt3842) + local21 * (float) (local348.anInt5150 >> Static206.anInt3842) + (float) (local348.anInt5154 >> Static206.anInt3842) * local25);
					if (local375 > local336) {
						local336 = local375;
					}
					this.anIntArray53[local43++] = local375;
					if (local51 > local375) {
						local51 = local375;
					}
				}
				@Pc(409) int local409 = local336 - local51;
				if (local409 + 2 <= 1600) {
					local375 = 0;
					local409 += 2;
				} else {
					local375 = Static12.method347(local409) + 1 - this.anInt882;
					local409 = (local409 >> local375) + 2;
				}
				local43 = 0;
				local343 = local75.aClass57_Sub1_7;
				local88 = -2;
				@Pc(445) boolean local445 = true;
				@Pc(447) boolean local447 = true;
				while (local343 != local75) {
					this.anInt883 = 0;
					for (local178 = 0; local178 < local409; local178++) {
						this.anIntArray54[local178] = 0;
					}
					for (@Pc(471) int local471 = 0; local471 < 64; local471++) {
						this.anIntArray55[local471] = 0;
					}
					while (local75 != local343) {
						@Pc(487) Class57_Sub1_Sub1 local487 = (Class57_Sub1_Sub1) local343;
						if (local447) {
							local447 = false;
							local445 = local487.aBoolean321;
							local88 = local487.anInt5157;
						}
						if (local43 > 0 && (local487.anInt5157 != local88 || local445 != local487.aBoolean321)) {
							local447 = true;
							break;
						}
						@Pc(533) int local533 = this.anIntArray53[local43++] - local51 >> local375;
						if (local533 < 1600) {
							if (this.anIntArray54[local533] < 64) {
								this.aClass57_Sub1_Sub1ArrayArray2[local533][this.anIntArray54[local533]++] = local487;
							} else {
								label142: {
									if (this.anIntArray54[local533] == 64) {
										if (this.anInt883 == 64) {
											break label142;
										}
										this.anIntArray54[local533] += this.anInt883++ + 1;
									}
									@Pc(603) Class57_Sub1_Sub1[] local603 = this.aClass57_Sub1_Sub1ArrayArray1[this.anIntArray54[local533] - 1 - 64];
									@Pc(613) int local613 = this.anIntArray54[local533] - 64 - 1;
									@Pc(615) int local615 = this.anIntArray55[this.anIntArray54[local533] - 64 - 1];
									this.anIntArray55[local613] = this.anIntArray55[this.anIntArray54[local533] - 64 - 1] + 1;
									local603[local615] = local487;
								}
							}
						}
						local343 = local343.aClass57_Sub1_7;
					}
					if (local88 < 0) {
						arg0.method5109(null);
					} else {
						arg0.method5109(arg0.aClass69_1.method1819(local88));
						arg0.method5140(arg0.anInterface8_5.method5566(local88).anInt5196);
					}
					if (local445 && arg0.aFloat77 != Static90.aFloat18) {
						arg0.method5025(Static90.aFloat18);
					} else if (arg0.aFloat77 != 1.0F) {
						arg0.method5025(1.0F);
					}
					this.method748(arg0, local409);
				}
			}
		} catch (@Pc(682) Exception local682) {
		}
		this.method753(arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!rl;)V")
	public void method755(@OriginalArg(1) Class66_Sub2 arg0) {
		this.anInterface5_2 = arg0.method5126(24, true, 196584, null);
		this.aClass23_3 = new Class23(arg0, this.anInterface5_2, 5126, 2, 0);
		this.aClass23_1 = new Class23(arg0, this.anInterface5_2, 5126, 3, 8);
		this.aClass23_2 = new Class23(arg0, this.anInterface5_2, 5121, 4, 20);
	}
}
