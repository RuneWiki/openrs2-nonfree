import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!bfa", name = "E", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!bfa", name = "C", descriptor = "Lclient!cea;")
	private final Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_1;

	@OriginalMember(owner = "client!bfa", name = "x", descriptor = "Lclient!kp;")
	private final Class4_Sub29 aClass4_Sub29_1;

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
	private final int anInt813;

	@OriginalMember(owner = "client!bfa", name = "F", descriptor = "I")
	private final int anInt817;

	@OriginalMember(owner = "client!bfa", name = "k", descriptor = "I")
	private final int anInt812;

	@OriginalMember(owner = "client!bfa", name = "w", descriptor = "I")
	private final int anInt814;

	@OriginalMember(owner = "client!bfa", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!bfa", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!bfa", name = "L", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!bfa", name = "A", descriptor = "Lclient!en;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!bfa", name = "t", descriptor = "Lclient!bia;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!bfa", name = "u", descriptor = "Lclient!sf;")
	private final Class327 aClass327_1;

	@OriginalMember(owner = "client!bfa", name = "v", descriptor = "Lclient!sf;")
	private final Class327 aClass327_2;

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lclient!es;")
	private Class4_Sub11 aClass4_Sub11_1;

	@OriginalMember(owner = "client!bfa", name = "s", descriptor = "Lclient!wja;")
	private Class4_Sub11_Sub2 aClass4_Sub11_Sub2_1;

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "Lclient!dj;")
	private Class66 aClass66_6;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!pc;Lclient!cea;Lclient!kp;[I)V")
	public Class4_Sub8(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class42_Sub1 arg1, @OriginalArg(2) Class4_Sub29 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass42_Sub1_1 = arg1;
		this.aClass33_Sub3_1 = arg0;
		this.aClass4_Sub29_1 = arg2;
		@Pc(23) int local23 = this.aClass4_Sub29_1.method7632() - (arg1.anInt8631 >> 1);
		this.anInt813 = this.aClass4_Sub29_1.method7627() - local23 >> arg1.anInt8635;
		this.anInt817 = this.aClass4_Sub29_1.method7627() + local23 >> arg1.anInt8635;
		this.anInt812 = this.aClass4_Sub29_1.method7628() - local23 >> arg1.anInt8635;
		this.anInt814 = this.aClass4_Sub29_1.method7628() + local23 >> arg1.anInt8635;
		@Pc(80) int local80 = this.anInt817 + 1 - this.anInt813;
		@Pc(88) int local88 = this.anInt814 + 1 - this.anInt812;
		this.aFloatArrayArray4 = new float[local80 + 1][local88 + 1];
		this.aFloatArrayArray3 = new float[local80 + 1][local88 + 1];
		this.aFloatArrayArray2 = new float[local80 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(139) int local139;
		@Pc(146) int local146;
		@Pc(178) int local178;
		@Pc(195) int local195;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = this.anInt812 + local117;
			if (local124 > 0 && local124 < this.aClass42_Sub1_1.anInt8630 - 1) {
				for (local139 = 0; local139 <= local80; local139++) {
					local146 = this.anInt813 + local139;
					if (local146 > 0 && local146 < this.aClass42_Sub1_1.anInt8638 - 1) {
						local178 = arg1.method7450(local124, local146 + 1) - arg1.method7450(local124, local146 - 1);
						local195 = arg1.method7450(local124 + 1, local146) - arg1.method7450(local124 - 1, local146);
						@Pc(210) float local210 = (float) (1.0D / Math.sqrt((double) (local195 * local195 + local178 * local178 + 65536)));
						this.aFloatArrayArray2[local139][local117] = (float) local178 * local210;
						this.aFloatArrayArray3[local139][local117] = local210 * -256.0F;
						this.aFloatArrayArray4[local139][local117] = (float) local195 * local210;
					}
				}
			}
		}
		local124 = 0;
		@Pc(316) int local316;
		for (local139 = this.anInt812; local139 <= this.anInt814; local139++) {
			if (local139 >= 0 && arg1.anInt8630 > local139) {
				for (local146 = this.anInt813; local146 <= this.anInt817; local146++) {
					if (local146 >= 0 && arg1.anInt8638 > local146) {
						local178 = arg3[local124];
						@Pc(305) int[] local305 = arg1.anIntArrayArrayArray2[local146][local139];
						if (local305 != null && local178 != 0) {
							if (local178 == 1) {
								local316 = 0;
								while (local305.length > local316) {
									if (local305[local316++] != -1 && local305[local316++] != -1 && local305[local316++] != -1) {
										this.anInt821 += 3;
									}
								}
							} else {
								this.anInt821 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt817 - this.anInt813;
			}
		}
		if (this.anInt821 <= 0) {
			this.anInterface11_1 = null;
			this.anInterface5_1 = null;
			this.aClass327_1 = null;
			this.aClass327_2 = null;
		} else {
			this.aClass4_Sub11_1 = new Class4_Sub11(this.anInt821 * 2);
			this.aClass4_Sub11_Sub2_1 = new Class4_Sub11_Sub2(this.anInt821 * 16);
			this.aClass66_6 = new Class66(Static162.method2593(this.anInt821));
			local124 = 0;
			local146 = 0;
			for (local178 = this.anInt812; local178 <= this.anInt814; local178++) {
				if (local178 >= 0 && arg1.anInt8630 > local178) {
					local195 = 0;
					for (local316 = this.anInt813; local316 <= this.anInt817; local316++) {
						if (local316 >= 0 && local316 < arg1.anInt8638) {
							@Pc(468) int local468 = arg3[local124];
							@Pc(475) int[] local475 = arg1.anIntArrayArrayArray2[local316][local178];
							if (local475 != null && local468 != 0) {
								if (local468 == 1) {
									@Pc(489) int[] local489 = arg1.anIntArrayArrayArray3[local316][local178];
									@Pc(496) int[] local496 = arg1.anIntArrayArrayArray5[local316][local178];
									@Pc(498) int local498 = 0;
									label106: while (true) {
										while (true) {
											if (local475.length <= local498) {
												break label106;
											}
											if (local475[local498] == -1 || local475[local498 + 1] == -1 || local475[local498 + 2] == -1) {
												local498 += 3;
											} else {
												this.method745(local496[local498], local146, local178, local195, local316, local489[local498]);
												local498++;
												this.method745(local496[local498], local146, local178, local195, local316, local489[local498]);
												local498++;
												this.method745(local496[local498], local146, local178, local195, local316, local489[local498]);
												local498++;
											}
										}
									}
								} else if (local468 == 3) {
									this.method745(0, local146, local178, local195, local316, 0);
									this.method745(0, local146, local178, local195, local316, arg1.anInt8631);
									this.method745(arg1.anInt8631, local146, local178, local195, local316, 0);
								} else if (local468 == 2) {
									this.method745(0, local146, local178, local195, local316, arg1.anInt8631);
									this.method745(arg1.anInt8631, local146, local178, local195, local316, arg1.anInt8631);
									this.method745(0, local146, local178, local195, local316, 0);
								} else if (local468 == 5) {
									this.method745(arg1.anInt8631, local146, local178, local195, local316, arg1.anInt8631);
									this.method745(arg1.anInt8631, local146, local178, local195, local316, 0);
									this.method745(0, local146, local178, local195, local316, arg1.anInt8631);
								} else if (local468 == 4) {
									this.method745(arg1.anInt8631, local146, local178, local195, local316, 0);
									this.method745(0, local146, local178, local195, local316, 0);
									this.method745(arg1.anInt8631, local146, local178, local195, local316, arg1.anInt8631);
								}
							}
						}
						local195++;
						local124++;
					}
				} else {
					local124 += this.anInt817 - this.anInt813;
				}
				local146++;
			}
			this.anInterface5_1 = this.aClass33_Sub3_1.method6352(this.aClass4_Sub11_1.anInt10466, this.aClass4_Sub11_1.aByteArray107, false);
			this.anInterface11_1 = this.aClass33_Sub3_1.method6308(this.aClass4_Sub11_Sub2_1.anInt10466, false, this.aClass4_Sub11_Sub2_1.aByteArray107, 16);
			this.aClass327_1 = new Class327(this.anInterface11_1, 5126, 3, 0);
			this.aClass327_2 = new Class327(this.anInterface11_1, 5121, 4, 12);
		}
		this.aClass4_Sub11_Sub2_1 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray4 = null;
		this.aClass66_6 = null;
		this.aClass4_Sub11_1 = null;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(SI)V")
	private void method742(@OriginalArg(0) short arg0) {
		if (this.aClass33_Sub3_1.aBoolean555) {
			this.aClass4_Sub11_1.method8838(arg0);
		} else {
			this.aClass4_Sub11_1.method8848(arg0);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIIII)V")
	private void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass42_Sub1_1.anInt8635) + arg5;
		@Pc(23) int local23 = arg0 + (arg2 << this.aClass42_Sub1_1.anInt8635);
		@Pc(32) int local32 = this.aClass42_Sub1_1.method7453(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local23 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(66) Class4 local66 = this.aClass66_6.method1994(local7);
			if (local66 != null) {
				this.method742(((Class4_Sub36) local66).aShort90);
				return;
			}
		}
		@Pc(84) short local84 = (short) this.anInt816++;
		if (local7 != -1L) {
			this.aClass66_6.method1985(new Class4_Sub36(local84), local7);
		}
		@Pc(164) float local164;
		@Pc(155) float local155;
		@Pc(146) float local146;
		@Pc(174) float local174;
		@Pc(182) float local182;
		@Pc(189) float local189;
		@Pc(196) float local196;
		@Pc(203) float local203;
		@Pc(212) float local212;
		@Pc(221) float local221;
		@Pc(297) float local297;
		if (arg5 == 0 && arg0 == 0) {
			local155 = this.aFloatArrayArray3[arg3][arg1];
			local164 = this.aFloatArrayArray2[arg3][arg1];
			local146 = this.aFloatArrayArray4[arg3][arg1];
		} else if (this.aClass42_Sub1_1.anInt8631 == arg5 && arg0 == 0) {
			local155 = this.aFloatArrayArray3[arg3 + 1][arg1];
			local164 = this.aFloatArrayArray2[arg3 + 1][arg1];
			local146 = this.aFloatArrayArray4[arg3 + 1][arg1];
		} else if (arg5 == this.aClass42_Sub1_1.anInt8631 && arg0 == this.aClass42_Sub1_1.anInt8631) {
			local164 = this.aFloatArrayArray2[arg3 + 1][arg1 + 1];
			local155 = this.aFloatArrayArray3[arg3 + 1][arg1 + 1];
			local146 = this.aFloatArrayArray4[arg3 + 1][arg1 + 1];
		} else if (arg5 == 0 && arg0 == this.aClass42_Sub1_1.anInt8631) {
			local146 = this.aFloatArrayArray4[arg3][arg1 + 1];
			local155 = this.aFloatArrayArray3[arg3][arg1 + 1];
			local164 = this.aFloatArrayArray2[arg3][arg1 + 1];
		} else {
			local174 = (float) arg5 / (float) this.aClass42_Sub1_1.anInt8631;
			local182 = (float) arg0 / (float) this.aClass42_Sub1_1.anInt8631;
			local189 = this.aFloatArrayArray2[arg3][arg1];
			local196 = this.aFloatArrayArray3[arg3][arg1];
			local203 = this.aFloatArrayArray4[arg3][arg1];
			local212 = this.aFloatArrayArray2[arg3 + 1][arg1];
			local221 = this.aFloatArrayArray3[arg3 + 1][arg1];
			@Pc(239) float local239 = local212 + local174 * (this.aFloatArrayArray2[arg3 + 1][arg1 + 1] - local212);
			@Pc(255) float local255 = local203 + (this.aFloatArrayArray4[arg3][arg1 + 1] - local203) * local174;
			@Pc(272) float local272 = local221 + local174 * (this.aFloatArrayArray3[arg3 + 1][arg1 + 1] - local221);
			@Pc(288) float local288 = local196 + (this.aFloatArrayArray3[arg3][arg1 + 1] - local196) * local174;
			local297 = this.aFloatArrayArray4[arg3 + 1][arg1];
			@Pc(312) float local312 = local189 + (this.aFloatArrayArray2[arg3][arg1 + 1] - local189) * local174;
			@Pc(329) float local329 = local297 + (this.aFloatArrayArray4[arg3 + 1][arg1 + 1] - local297) * local174;
			local164 = local312 + local182 * (local239 - local312);
			local155 = local288 + (local272 - local288) * local182;
			local146 = local255 + (local329 - local255) * local182;
		}
		local174 = (float) (this.aClass4_Sub29_1.method7627() - local15);
		local182 = (float) (this.aClass4_Sub29_1.method7630() - local32);
		local189 = (float) (this.aClass4_Sub29_1.method7628() - local23);
		local196 = (float) Math.sqrt((double) (local174 * local174 + local182 * local182 + local189 * local189));
		local203 = 1.0F / local196;
		local189 *= local203;
		local182 *= local203;
		local174 *= local203;
		local212 = local196 / (float) this.aClass4_Sub29_1.method7632();
		local221 = (float) 1 - local212 * local212;
		if (local221 < 0.0F) {
			local221 = 0.0F;
		}
		local297 = local146 * local189 + local182 * local155 + local164 * local174;
		if (local297 < 0.0F) {
			local297 = 0.0F;
		}
		@Pc(548) float local548 = local221 * local297 * 2.0F;
		if (local548 > 1.0F) {
			local548 = 1.0F;
		}
		@Pc(559) int local559 = this.aClass4_Sub29_1.method7633();
		@Pc(569) int local569 = (int) (local548 * (float) (local559 >> 16 & 0xFF));
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(586) int local586 = (int) (local548 * (float) (local559 >> 8 & 0xFF));
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(601) int local601 = (int) (local548 * (float) (local559 & 0xFF));
		if (this.aClass33_Sub3_1.aBoolean555) {
			this.aClass4_Sub11_Sub2_1.method8897((float) local15);
			this.aClass4_Sub11_Sub2_1.method8897((float) local32);
			this.aClass4_Sub11_Sub2_1.method8897((float) local23);
		} else {
			this.aClass4_Sub11_Sub2_1.method8895((float) local15);
			this.aClass4_Sub11_Sub2_1.method8895((float) local32);
			this.aClass4_Sub11_Sub2_1.method8895((float) local23);
		}
		if (local601 > 255) {
			local601 = 255;
		}
		this.aClass4_Sub11_Sub2_1.method8822(local569);
		this.aClass4_Sub11_Sub2_1.method8822(local586);
		this.aClass4_Sub11_Sub2_1.method8822(local601);
		this.aClass4_Sub11_Sub2_1.method8822(255);
		this.method742(local84);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([[ZBIII)V")
	public void method746(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface5_1 == null || (arg2 + arg3 < this.anInt813 || (arg3 - arg2 > this.anInt817 || (arg2 + arg1 < this.anInt812 || arg1 - arg2 > this.anInt814)))) {
			return;
		}
		for (@Pc(65) int local65 = this.anInt812; local65 <= this.anInt814; local65++) {
			for (@Pc(70) int local70 = this.anInt813; local70 <= this.anInt817; local70++) {
				@Pc(77) int local77 = local70 - arg3;
				@Pc(82) int local82 = local65 - arg1;
				if (local77 > -arg2 && local77 < arg2 && -arg2 < local82 && arg2 > local82 && arg0[arg2 + local77][local82 + arg2]) {
					this.aClass33_Sub3_1.method6357((int) (this.aClass4_Sub29_1.method7626() * 255.0F) << 24);
					this.aClass33_Sub3_1.method6339((Class327) null, this.aClass327_1, this.aClass327_2, (Class327) null);
					this.aClass33_Sub3_1.method6348(0, this.anInt821, this.anInterface5_1);
					return;
				}
			}
		}
	}
}
