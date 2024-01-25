import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class6_Sub41 extends Class6 {

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
	private int anInt6837;

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
	private int anInt6843;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_38;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "Lclient!dq;")
	private final Class6_Sub11 aClass6_Sub11_2;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "Lclient!gb;")
	private final Class86_Sub1 aClass86_Sub1_3;

	@OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
	private final int anInt6842;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
	private final int anInt6839;

	@OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
	private final int anInt6846;

	@OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
	private final int anInt6844;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "Lclient!ms;")
	private final Interface5 anInterface5_6;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "Lclient!lp;")
	private final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "Lclient!bh;")
	private final Class23 aClass23_11;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "Lclient!bh;")
	private final Class23 aClass23_12;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "Lclient!ae;")
	private Class6_Sub1 aClass6_Sub1_8;

	@OriginalMember(owner = "client!tk", name = "N", descriptor = "Lclient!wl;")
	private Class6_Sub1_Sub2 aClass6_Sub1_Sub2_3;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "Lclient!fe;")
	private Class74 aClass74_26;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!rl;Lclient!gb;Lclient!dq;[I)V")
	public Class6_Sub41(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class86_Sub1 arg1, @OriginalArg(2) Class6_Sub11 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass66_Sub2_38 = arg0;
		this.aClass6_Sub11_2 = arg2;
		this.aClass86_Sub1_3 = arg1;
		@Pc(22) int local22 = this.aClass6_Sub11_2.method6395() - (arg1.anInt8050 >> 1);
		this.anInt6842 = this.aClass6_Sub11_2.method6390() - local22 >> arg1.anInt8051;
		this.anInt6839 = local22 + this.aClass6_Sub11_2.method6390() >> arg1.anInt8051;
		this.anInt6846 = this.aClass6_Sub11_2.method6392() - local22 >> arg1.anInt8051;
		this.anInt6844 = this.aClass6_Sub11_2.method6392() + local22 >> arg1.anInt8051;
		@Pc(76) int local76 = this.anInt6839 + 1 - this.anInt6842;
		@Pc(85) int local85 = this.anInt6844 + 1 - this.anInt6846;
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray7 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(170) int local170;
		@Pc(184) int local184;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt6846 + local114;
			if (local121 > 0 && this.aClass86_Sub1_3.anInt8049 - 1 > local121) {
				for (local132 = 0; local132 <= local76; local132++) {
					local140 = local132 + this.anInt6842;
					if (local140 > 0 && this.aClass86_Sub1_3.anInt8047 - 1 > local140) {
						local170 = arg1.method6594(local140 + 1, local121) - arg1.method6594(local140 - 1, local121);
						local184 = arg1.method6594(local140, local121 + 1) - arg1.method6594(local140, local121 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local184 * local184 + 65536)));
						this.aFloatArrayArray8[local132][local114] = (float) local170 * local200;
						this.aFloatArrayArray9[local132][local114] = -256.0F * local200;
						this.aFloatArrayArray7[local132][local114] = (float) local184 * local200;
					}
				}
			}
		}
		local121 = 0;
		local132 = 0;
		for (local140 = this.anInt6846; local140 <= this.anInt6844; local140++) {
			if (local140 >= 0 && arg1.anInt8049 > local140) {
				for (local170 = this.anInt6842; local170 <= this.anInt6839; local170++) {
					if (local170 >= 0 && local170 < arg1.anInt8047) {
						local184 = arg3[local132];
						@Pc(289) int[] local289 = arg1.anIntArrayArrayArray1[local170][local140];
						if (local289 != null && local184 != 0) {
							if (local184 == 1) {
								local121 += local289.length;
							} else {
								local121 += 3;
							}
						}
					}
					local132++;
				}
			} else {
				local132 += this.anInt6839 - this.anInt6842;
			}
		}
		if (local121 <= 0) {
			this.anInterface5_6 = null;
			this.anInterface4_4 = null;
			this.aClass23_11 = null;
			this.aClass23_12 = null;
		} else {
			this.aClass6_Sub1_8 = new Class6_Sub1(local121 * 2);
			this.aClass6_Sub1_Sub2_3 = new Class6_Sub1_Sub2(local121 * 16);
			this.aClass74_26 = new Class74(Static52.method1203(local121));
			local132 = 0;
			local170 = 0;
			for (local184 = this.anInt6846; local184 <= this.anInt6844; local184++) {
				if (local184 >= 0 && arg1.anInt8049 > local184) {
					@Pc(401) int local401 = 0;
					for (@Pc(404) int local404 = this.anInt6842; local404 <= this.anInt6839; local404++) {
						if (local404 >= 0 && local404 < arg1.anInt8047) {
							@Pc(423) int local423 = arg3[local132];
							@Pc(430) int[] local430 = arg1.anIntArrayArrayArray1[local404][local184];
							@Pc(437) int[] local437 = arg1.anIntArrayArrayArray2[local404][local184];
							if (local430 != null && local423 != 0) {
								if (local423 == 1) {
									for (@Pc(446) int local446 = 0; local446 < local430.length; local446++) {
										this.method5689(local437[local446], local170, local184, local404, local401, local430[local446]);
									}
								} else if (local423 == 3) {
									this.method5689(0, local170, local184, local404, local401, 0);
									this.method5689(0, local170, local184, local404, local401, arg1.anInt8050);
									this.method5689(arg1.anInt8050, local170, local184, local404, local401, 0);
								} else if (local423 == 2) {
									this.method5689(0, local170, local184, local404, local401, arg1.anInt8050);
									this.method5689(arg1.anInt8050, local170, local184, local404, local401, arg1.anInt8050);
									this.method5689(0, local170, local184, local404, local401, 0);
								} else if (local423 == 5) {
									this.method5689(arg1.anInt8050, local170, local184, local404, local401, arg1.anInt8050);
									this.method5689(arg1.anInt8050, local170, local184, local404, local401, 0);
									this.method5689(0, local170, local184, local404, local401, arg1.anInt8050);
								} else if (local423 == 4) {
									this.method5689(arg1.anInt8050, local170, local184, local404, local401, 0);
									this.method5689(0, local170, local184, local404, local401, 0);
									this.method5689(arg1.anInt8050, local170, local184, local404, local401, arg1.anInt8050);
								}
							}
						}
						local401++;
						local132++;
					}
				} else {
					local132 += this.anInt6839 - this.anInt6842;
				}
				local170++;
			}
			this.anInterface4_4 = this.aClass66_Sub2_38.method5136(false, this.aClass6_Sub1_8.aByteArray96, this.aClass6_Sub1_8.anInt7898);
			this.anInterface5_6 = this.aClass66_Sub2_38.method5126(16, false, this.aClass6_Sub1_Sub2_3.anInt7898, this.aClass6_Sub1_Sub2_3.aByteArray96);
			this.aClass23_11 = new Class23(this.aClass66_Sub2_38, this.anInterface5_6, 5126, 3, 0);
			this.aClass23_12 = new Class23(this.aClass66_Sub2_38, this.anInterface5_6, 5121, 4, 12);
		}
		this.aClass6_Sub1_8 = null;
		this.aClass74_26 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray9 = this.aFloatArrayArray7 = null;
		this.aClass6_Sub1_Sub2_3 = null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIII)V")
	private void method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass86_Sub1_3.anInt8051) + arg5;
		@Pc(23) int local23 = arg0 + (arg2 << this.aClass86_Sub1_3.anInt8051);
		@Pc(29) int local29 = this.aClass86_Sub1_3.method6590(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(61) Class6 local61 = this.aClass74_26.method1883(local7);
			if (local61 != null) {
				this.method5693(((Class6_Sub44) local61).aShort103);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt6837++;
		if (local7 != -1L) {
			this.aClass74_26.method1890(local7, new Class6_Sub44(local79));
		}
		@Pc(142) float local142;
		@Pc(124) float local124;
		@Pc(133) float local133;
		@Pc(236) float local236;
		@Pc(244) float local244;
		@Pc(251) float local251;
		@Pc(258) float local258;
		@Pc(265) float local265;
		@Pc(274) float local274;
		@Pc(283) float local283;
		@Pc(342) float local342;
		if (arg5 == 0 && arg0 == 0) {
			local124 = this.aFloatArrayArray9[arg4][arg1];
			local142 = this.aFloatArrayArray8[arg4][arg1];
			local133 = this.aFloatArrayArray7[arg4][arg1];
		} else if (arg5 == this.aClass86_Sub1_3.anInt8050 && arg0 == 0) {
			local124 = this.aFloatArrayArray9[arg4 + 1][arg1];
			local133 = this.aFloatArrayArray7[arg4 + 1][arg1];
			local142 = this.aFloatArrayArray8[arg4 + 1][arg1];
		} else if (this.aClass86_Sub1_3.anInt8050 == arg5 && arg0 == this.aClass86_Sub1_3.anInt8050) {
			local124 = this.aFloatArrayArray9[arg4 + 1][arg1 + 1];
			local142 = this.aFloatArrayArray8[arg4 + 1][arg1 + 1];
			local133 = this.aFloatArrayArray7[arg4 + 1][arg1 + 1];
		} else if (arg5 == 0 && arg0 == this.aClass86_Sub1_3.anInt8050) {
			local142 = this.aFloatArrayArray8[arg4][arg1 + 1];
			local124 = this.aFloatArrayArray9[arg4][arg1 + 1];
			local133 = this.aFloatArrayArray7[arg4][arg1 + 1];
		} else {
			local236 = (float) arg5 / (float) this.aClass86_Sub1_3.anInt8050;
			local244 = (float) arg0 / (float) this.aClass86_Sub1_3.anInt8050;
			local251 = this.aFloatArrayArray8[arg4][arg1];
			local258 = this.aFloatArrayArray9[arg4][arg1];
			local265 = this.aFloatArrayArray7[arg4][arg1];
			local274 = this.aFloatArrayArray8[arg4 + 1][arg1];
			local283 = this.aFloatArrayArray9[arg4 + 1][arg1];
			@Pc(300) float local300 = local283 + local236 * (this.aFloatArrayArray9[arg4 + 1][arg1 + 1] - local283);
			@Pc(315) float local315 = local265 + local236 * (this.aFloatArrayArray7[arg4][arg1 + 1] - local265);
			@Pc(333) float local333 = local274 + local236 * (this.aFloatArrayArray8[arg4 + 1][arg1 + 1] - local274);
			local342 = this.aFloatArrayArray7[arg4 + 1][arg1];
			@Pc(358) float local358 = local251 + (this.aFloatArrayArray8[arg4][arg1 + 1] - local251) * local236;
			@Pc(373) float local373 = local258 + local236 * (this.aFloatArrayArray9[arg4][arg1 + 1] - local258);
			local124 = local244 * (local300 - local373) + local373;
			@Pc(399) float local399 = local342 + (this.aFloatArrayArray7[arg4 + 1][arg1 + 1] - local342) * local236;
			local142 = (local333 - local358) * local244 + local358;
			local133 = local315 + local244 * (local399 - local315);
		}
		local236 = this.aClass6_Sub11_2.method6390() - local15;
		local244 = this.aClass6_Sub11_2.method6391() - local29;
		local251 = this.aClass6_Sub11_2.method6392() - local23;
		local258 = (float) Math.sqrt((double) (local251 * local251 + local236 * local236 + local244 * local244));
		local265 = 1.0F / local258;
		local236 *= local265;
		local244 *= local265;
		local251 *= local265;
		local274 = local258 / (float) this.aClass6_Sub11_2.method6395();
		local283 = 1.0F - local274 * local274;
		if (local283 < 0.0F) {
			local283 = 0.0F;
		}
		local342 = local124 * local244 + local142 * local236 + local133 * local251;
		if (local342 < 0.0F) {
			local342 = 0.0F;
		}
		@Pc(540) float local540 = local342 * local283 * 2.0F;
		if (local540 > 1.0F) {
			local540 = 1.0F;
		}
		@Pc(551) int local551 = this.aClass6_Sub11_2.method6396();
		@Pc(561) int local561 = (int) (local540 * (float) (local551 >> 16 & 0xFF));
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(578) int local578 = (int) (local540 * (float) (local551 >> 8 & 0xFF));
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(591) int local591 = (int) ((float) (local551 & 0xFF) * local540);
		if (local591 > 255) {
			local591 = 255;
		}
		if (this.aClass66_Sub2_38.aBoolean373) {
			this.aClass6_Sub1_Sub2_3.method6493((float) local15);
			this.aClass6_Sub1_Sub2_3.method6493((float) local29);
			this.aClass6_Sub1_Sub2_3.method6493((float) local23);
		} else {
			this.aClass6_Sub1_Sub2_3.method6494((float) local15);
			this.aClass6_Sub1_Sub2_3.method6494((float) local29);
			this.aClass6_Sub1_Sub2_3.method6494((float) local23);
		}
		this.aClass6_Sub1_Sub2_3.method6439(local561);
		this.aClass6_Sub1_Sub2_3.method6439(local578);
		this.aClass6_Sub1_Sub2_3.method6439(local591);
		this.aClass6_Sub1_Sub2_3.method6439(255);
		this.method5693(local79);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII[[Z)V")
	public void method5692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface4_4 == null || (arg0 + arg2 < this.anInt6842 || (this.anInt6839 < arg2 - arg0 || (arg0 + arg1 < this.anInt6846 || arg1 - arg0 > this.anInt6844)))) {
			return;
		}
		for (@Pc(46) int local46 = this.anInt6846; local46 <= this.anInt6844; local46++) {
			for (@Pc(51) int local51 = this.anInt6842; local51 <= this.anInt6839; local51++) {
				@Pc(58) int local58 = local51 - arg2;
				@Pc(62) int local62 = local46 - arg1;
				if (-arg0 < local58 && local58 < arg0 && -arg0 < local62 && arg0 > local62 && arg3[arg0 + local58][local62 + arg0]) {
					this.aClass66_Sub2_38.method5091((int) (this.aClass6_Sub11_2.method6389() * 255.0F) << 24);
					this.aClass66_Sub2_38.method5087(this.aClass23_12, this.aClass23_11, null, null);
					this.aClass66_Sub2_38.method5155(this.anInt6843, 0, this.anInterface4_4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BS)V")
	private void method5693(@OriginalArg(1) short arg0) {
		if (this.aClass66_Sub2_38.aBoolean373) {
			this.aClass6_Sub1_8.method6453(arg0);
		} else {
			this.aClass6_Sub1_8.method6480(arg0);
		}
		this.anInt6843++;
	}
}
