import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!qw", name = "C", descriptor = "I")
	private int anInt8888;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "Lclient!ed;")
	private final Class65_Sub2 aClass65_Sub2_3;

	@OriginalMember(owner = "client!qw", name = "N", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_32;

	@OriginalMember(owner = "client!qw", name = "y", descriptor = "Lclient!ab;")
	private final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
	private final int anInt8885;

	@OriginalMember(owner = "client!qw", name = "E", descriptor = "I")
	private final int anInt8890;

	@OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
	private final int anInt8892;

	@OriginalMember(owner = "client!qw", name = "G", descriptor = "I")
	private final int anInt8891;

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!qw", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!qw", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
	private int anInt8884;

	@OriginalMember(owner = "client!qw", name = "x", descriptor = "Lclient!cea;")
	private Class2_Sub11 aClass2_Sub11_6;

	@OriginalMember(owner = "client!qw", name = "P", descriptor = "Lclient!gh;")
	private Class2_Sub11_Sub1 aClass2_Sub11_Sub1_2;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "Lclient!eq;")
	private Class99 aClass99_66;

	@OriginalMember(owner = "client!qw", name = "H", descriptor = "Lclient!ni;")
	private final Interface18 anInterface18_3;

	@OriginalMember(owner = "client!qw", name = "O", descriptor = "Lclient!hca;")
	private final Interface11 anInterface11_6;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Lclient!nh;")
	private final Class223 aClass223_12;

	@OriginalMember(owner = "client!qw", name = "F", descriptor = "Lclient!nh;")
	private final Class223 aClass223_13;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!qo;Lclient!ed;Lclient!ab;[I)V")
	public Class2_Sub41(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class65_Sub2 arg1, @OriginalArg(2) Class2_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass65_Sub2_3 = arg1;
		this.aClass20_Sub3_32 = arg0;
		this.aClass2_Sub1_1 = arg2;
		@Pc(23) int local23 = this.aClass2_Sub1_1.method3968() - (arg1.anInt9620 >> 1);
		this.anInt8885 = this.aClass2_Sub1_1.method3969() - local23 >> arg1.anInt9616;
		this.anInt8890 = this.aClass2_Sub1_1.method3969() + local23 >> arg1.anInt9616;
		this.anInt8892 = this.aClass2_Sub1_1.method3962() - local23 >> arg1.anInt9616;
		this.anInt8891 = this.aClass2_Sub1_1.method3962() + local23 >> arg1.anInt9616;
		@Pc(79) int local79 = this.anInt8890 + 1 - this.anInt8885;
		@Pc(88) int local88 = this.anInt8891 + 1 - this.anInt8892;
		this.aFloatArrayArray13 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray15 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray14 = new float[local79 + 1][local88 + 1];
		@Pc(125) int local125;
		@Pc(139) int local139;
		@Pc(147) int local147;
		@Pc(175) int local175;
		@Pc(191) int local191;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local125 = local117 + this.anInt8892;
			if (local125 > 0 && local125 < this.aClass65_Sub2_3.anInt9618 - 1) {
				for (local139 = 0; local139 <= local79; local139++) {
					local147 = local139 + this.anInt8885;
					if (local147 > 0 && local147 < this.aClass65_Sub2_3.anInt9615 - 1) {
						local175 = arg1.method7995(local125, local147 + 1) - arg1.method7995(local125, local147 - 1);
						local191 = arg1.method7995(local125 + 1, local147) - arg1.method7995(local125 - 1, local147);
						@Pc(207) float local207 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + local191 * local191 + 65536)));
						this.aFloatArrayArray15[local139][local117] = (float) local175 * local207;
						this.aFloatArrayArray14[local139][local117] = -256.0F * local207;
						this.aFloatArrayArray13[local139][local117] = local207 * (float) local191;
					}
				}
			}
		}
		local125 = 0;
		@Pc(317) int local317;
		for (local139 = this.anInt8892; local139 <= this.anInt8891; local139++) {
			if (local139 >= 0 && local139 < arg1.anInt9618) {
				for (local147 = this.anInt8885; local147 <= this.anInt8890; local147++) {
					if (local147 >= 0 && arg1.anInt9615 > local147) {
						local175 = arg3[local125];
						@Pc(300) int[] local300 = arg1.anIntArrayArrayArray5[local147][local139];
						if (local300 != null && local175 != 0) {
							if (local175 == 1) {
								local317 = 0;
								while (local300.length > local317) {
									if (local300[local317++] != -1 && local300[local317++] != -1 && local300[local317++] != -1) {
										this.anInt8884 += 3;
									}
								}
							} else {
								this.anInt8884 += 3;
							}
						}
					}
					local125++;
				}
			} else {
				local125 += this.anInt8890 - this.anInt8885;
			}
		}
		if (this.anInt8884 > 0) {
			this.aClass2_Sub11_6 = new Class2_Sub11(this.anInt8884 * 2);
			this.aClass2_Sub11_Sub1_2 = new Class2_Sub11_Sub1(this.anInt8884 * 16);
			this.aClass99_66 = new Class99(Static231.method4407(this.anInt8884));
			local147 = 0;
			local125 = 0;
			for (local175 = this.anInt8892; local175 <= this.anInt8891; local175++) {
				if (local175 >= 0 && local175 < arg1.anInt9618) {
					local191 = 0;
					for (local317 = this.anInt8885; local317 <= this.anInt8890; local317++) {
						if (local317 >= 0 && arg1.anInt9615 > local317) {
							@Pc(440) int local440 = arg3[local125];
							@Pc(447) int[] local447 = arg1.anIntArrayArrayArray5[local317][local175];
							if (local447 != null && local440 != 0) {
								if (local440 == 1) {
									@Pc(605) int[] local605 = arg1.anIntArrayArrayArray7[local317][local175];
									@Pc(612) int[] local612 = arg1.anIntArrayArrayArray2[local317][local175];
									@Pc(614) int local614 = 0;
									label105: while (true) {
										while (true) {
											if (local614 >= local447.length) {
												break label105;
											}
											if (local447[local614] == -1 || local447[local614 + 1] == -1 || local447[local614 + 2] == -1) {
												local614 += 3;
											} else {
												this.method7455(local612[local614], local191, local147, local317, local605[local614], local175);
												local614++;
												this.method7455(local612[local614], local191, local147, local317, local605[local614], local175);
												local614++;
												this.method7455(local612[local614], local191, local147, local317, local605[local614], local175);
												local614++;
											}
										}
									}
								} else if (local440 == 3) {
									this.method7455(0, local191, local147, local317, 0, local175);
									this.method7455(0, local191, local147, local317, arg1.anInt9620, local175);
									this.method7455(arg1.anInt9620, local191, local147, local317, 0, local175);
								} else if (local440 == 2) {
									this.method7455(0, local191, local147, local317, arg1.anInt9620, local175);
									this.method7455(arg1.anInt9620, local191, local147, local317, arg1.anInt9620, local175);
									this.method7455(0, local191, local147, local317, 0, local175);
								} else if (local440 == 5) {
									this.method7455(arg1.anInt9620, local191, local147, local317, arg1.anInt9620, local175);
									this.method7455(arg1.anInt9620, local191, local147, local317, 0, local175);
									this.method7455(0, local191, local147, local317, arg1.anInt9620, local175);
								} else if (local440 == 4) {
									this.method7455(arg1.anInt9620, local191, local147, local317, 0, local175);
									this.method7455(0, local191, local147, local317, 0, local175);
									this.method7455(arg1.anInt9620, local191, local147, local317, arg1.anInt9620, local175);
								}
							}
						}
						local191++;
						local125++;
					}
				} else {
					local125 += this.anInt8890 - this.anInt8885;
				}
				local147++;
			}
			this.anInterface18_3 = this.aClass20_Sub3_32.method7320(this.aClass2_Sub11_6.anInt10066, this.aClass2_Sub11_6.aByteArray128, false);
			this.anInterface11_6 = this.aClass20_Sub3_32.method7318(false, 16, this.aClass2_Sub11_Sub1_2.aByteArray128, this.aClass2_Sub11_Sub1_2.anInt10066);
			this.aClass223_12 = new Class223(this.anInterface11_6, 5126, 3, 0);
			this.aClass223_13 = new Class223(this.anInterface11_6, 5121, 4, 12);
		} else {
			this.anInterface11_6 = null;
			this.anInterface18_3 = null;
			this.aClass223_12 = null;
			this.aClass223_13 = null;
		}
		this.aClass2_Sub11_Sub1_2 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
		this.aClass2_Sub11_6 = null;
		this.aClass99_66 = null;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIIIBI)V")
	private void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg4 + (arg3 << this.aClass65_Sub2_3.anInt9616);
		@Pc(24) int local24 = arg0 + (arg5 << this.aClass65_Sub2_3.anInt9616);
		@Pc(31) int local31 = this.aClass65_Sub2_3.method7999(local16, local24);
		if ((arg4 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local16 & 0xFFFFL;
			@Pc(62) Class2 local62 = this.aClass99_66.method3056(local7);
			if (local62 != null) {
				this.method7458(((Class2_Sub39) local62).aShort87);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt8888++;
		if (local7 != -1L) {
			this.aClass99_66.method3059(local7, new Class2_Sub39(local80));
		}
		@Pc(138) float local138;
		@Pc(129) float local129;
		@Pc(120) float local120;
		@Pc(165) float local165;
		@Pc(173) float local173;
		@Pc(180) float local180;
		@Pc(187) float local187;
		@Pc(194) float local194;
		@Pc(203) float local203;
		@Pc(212) float local212;
		@Pc(270) float local270;
		if (arg4 == 0 && arg0 == 0) {
			local138 = this.aFloatArrayArray15[arg1][arg2];
			local120 = this.aFloatArrayArray13[arg1][arg2];
			local129 = this.aFloatArrayArray14[arg1][arg2];
		} else if (arg4 == this.aClass65_Sub2_3.anInt9620 && arg0 == 0) {
			local120 = this.aFloatArrayArray13[arg1 + 1][arg2];
			local129 = this.aFloatArrayArray14[arg1 + 1][arg2];
			local138 = this.aFloatArrayArray15[arg1 + 1][arg2];
		} else if (arg4 == this.aClass65_Sub2_3.anInt9620 && this.aClass65_Sub2_3.anInt9620 == arg0) {
			local138 = this.aFloatArrayArray15[arg1 + 1][arg2 + 1];
			local120 = this.aFloatArrayArray13[arg1 + 1][arg2 + 1];
			local129 = this.aFloatArrayArray14[arg1 + 1][arg2 + 1];
		} else if (arg4 == 0 && this.aClass65_Sub2_3.anInt9620 == arg0) {
			local138 = this.aFloatArrayArray15[arg1][arg2 + 1];
			local120 = this.aFloatArrayArray13[arg1][arg2 + 1];
			local129 = this.aFloatArrayArray14[arg1][arg2 + 1];
		} else {
			local165 = (float) arg4 / (float) this.aClass65_Sub2_3.anInt9620;
			local173 = (float) arg0 / (float) this.aClass65_Sub2_3.anInt9620;
			local180 = this.aFloatArrayArray15[arg1][arg2];
			local187 = this.aFloatArrayArray14[arg1][arg2];
			local194 = this.aFloatArrayArray13[arg1][arg2];
			local203 = this.aFloatArrayArray15[arg1 + 1][arg2];
			local212 = this.aFloatArrayArray14[arg1 + 1][arg2];
			@Pc(229) float local229 = local212 + (this.aFloatArrayArray14[arg1 + 1][arg2 + 1] - local212) * local165;
			@Pc(246) float local246 = local203 + local165 * (this.aFloatArrayArray15[arg1 + 1][arg2 + 1] - local203);
			@Pc(261) float local261 = local194 + (this.aFloatArrayArray13[arg1][arg2 + 1] - local194) * local165;
			local270 = this.aFloatArrayArray13[arg1 + 1][arg2];
			@Pc(285) float local285 = local187 + local165 * (this.aFloatArrayArray14[arg1][arg2 + 1] - local187);
			@Pc(301) float local301 = local180 + local165 * (this.aFloatArrayArray15[arg1][arg2 + 1] - local180);
			local138 = local301 + (local246 - local301) * local173;
			local129 = local285 + local173 * (local229 - local285);
			@Pc(336) float local336 = local270 + local165 * (this.aFloatArrayArray13[arg1 + 1][arg2 + 1] - local270);
			local120 = local261 + local173 * (local336 - local261);
		}
		local165 = this.aClass2_Sub1_1.method3969() - local16;
		local173 = this.aClass2_Sub1_1.method3967() - local31;
		local180 = this.aClass2_Sub1_1.method3962() - local24;
		local187 = (float) Math.sqrt((double) (local173 * local173 + local165 * local165 + local180 * local180));
		local194 = 1.0F / local187;
		local180 *= local194;
		local165 *= local194;
		local173 *= local194;
		local203 = local187 / (float) this.aClass2_Sub1_1.method3968();
		local212 = 1.0F - local203 * local203;
		if (local212 < 0.0F) {
			local212 = 0.0F;
		}
		local270 = local180 * local120 + local173 * local129 + local138 * local165;
		if (local270 < 0.0F) {
			local270 = 0.0F;
		}
		@Pc(534) float local534 = local212 * 2.0F * local270;
		if (local534 > 1.0F) {
			local534 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass2_Sub1_1.method3965();
		@Pc(563) int local563 = (int) ((float) (local553 >> 16 & 0xFF) * local534);
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local553 >> 8 & 0xFF) * local534);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) (local534 * (float) (local553 & 0xFF));
		if (this.aClass20_Sub3_32.aBoolean616) {
			this.aClass2_Sub11_Sub1_2.method3862((float) local16);
			this.aClass2_Sub11_Sub1_2.method3862((float) local31);
			this.aClass2_Sub11_Sub1_2.method3862((float) local24);
		} else {
			this.aClass2_Sub11_Sub1_2.method3861((float) local16);
			this.aClass2_Sub11_Sub1_2.method3861((float) local31);
			this.aClass2_Sub11_Sub1_2.method3861((float) local24);
		}
		if (local595 > 255) {
			local595 = 255;
		}
		this.aClass2_Sub11_Sub1_2.method8374(local563);
		this.aClass2_Sub11_Sub1_2.method8374(local580);
		this.aClass2_Sub11_Sub1_2.method8374(local595);
		this.aClass2_Sub11_Sub1_2.method8374(255);
		this.method7458(local80);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BS)V")
	private void method7458(@OriginalArg(1) short arg0) {
		if (this.aClass20_Sub3_32.aBoolean616) {
			this.aClass2_Sub11_6.method8333(arg0);
		} else {
			this.aClass2_Sub11_6.method8393(arg0);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([[ZIIII)V")
	public void method7459(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface18_3 == null || (arg3 + arg1 < this.anInt8885 || (arg1 - arg3 > this.anInt8890 || (arg2 + arg3 < this.anInt8892 || this.anInt8891 < arg2 - arg3)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt8892; local50 <= this.anInt8891; local50++) {
			for (@Pc(55) int local55 = this.anInt8885; local55 <= this.anInt8890; local55++) {
				@Pc(61) int local61 = local55 - arg1;
				@Pc(66) int local66 = local50 - arg2;
				if (local61 > -arg3 && arg3 > local61 && -arg3 < local66 && local66 < arg3 && arg0[local61 + arg3][arg3 + local66]) {
					this.aClass20_Sub3_32.method7395((int) (this.aClass2_Sub1_1.method3966() * 255.0F) << 24);
					this.aClass20_Sub3_32.method7381(this.aClass223_12, this.aClass223_13, null, null);
					this.aClass20_Sub3_32.method7346(this.anInt8884, this.anInterface18_3, 0);
					return;
				}
			}
		}
	}
}
