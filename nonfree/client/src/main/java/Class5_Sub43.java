import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class5_Sub43 extends Class5 {

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
	private int anInt6524;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
	private int anInt6526;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_40;

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "Lclient!vg;")
	private final Class5_Sub13 aClass5_Sub13_1;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "Lclient!wa;")
	private final Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	private final int anInt6525;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
	private final int anInt6522;

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
	private final int anInt6527;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
	private final int anInt6523;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!eo;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Lclient!ti;")
	private final Interface9 anInterface9_6;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "Lclient!pe;")
	private final Class156 aClass156_17;

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "Lclient!pe;")
	private final Class156 aClass156_18;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "Lclient!bk;")
	private Class5_Sub1 aClass5_Sub1_10;

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "Lclient!fe;")
	private Class5_Sub1_Sub2 aClass5_Sub1_Sub2_3;

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "Lclient!cs;")
	private Class42 aClass42_59;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!po;Lclient!wa;Lclient!vg;[I)V")
	public Class5_Sub43(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class3_Sub2 arg1, @OriginalArg(2) Class5_Sub13 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass59_Sub1_40 = arg0;
		this.aClass5_Sub13_1 = arg2;
		this.aClass3_Sub2_3 = arg1;
		@Pc(20) int local20 = this.aClass5_Sub13_1.anInt2079 - (arg1.anInt6364 >> 1);
		this.anInt6525 = this.aClass5_Sub13_1.anInt2080 - local20 >> arg1.anInt6363;
		this.anInt6522 = this.aClass5_Sub13_1.anInt2080 + local20 >> arg1.anInt6363;
		this.anInt6527 = this.aClass5_Sub13_1.anInt2082 - local20 >> arg1.anInt6363;
		this.anInt6523 = this.aClass5_Sub13_1.anInt2082 + local20 >> arg1.anInt6363;
		@Pc(70) int local70 = this.anInt6522 + 1 - this.anInt6525;
		@Pc(79) int local79 = this.anInt6523 + 1 - this.anInt6527;
		this.aFloatArrayArray7 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray8 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray6 = new float[local70 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(172) int local172;
		@Pc(186) int local186;
		for (local108 = 0; local108 <= local79; local108++) {
			local120 = this.anInt6527 + local108;
			if (local120 > 0 && local120 < this.aClass3_Sub2_3.anInt6361 - 1) {
				for (local134 = 0; local134 <= local70; local134++) {
					local142 = this.anInt6525 + local134;
					if (local142 > 0 && local142 < this.aClass3_Sub2_3.anInt6360 - 1) {
						local172 = arg1.method5638(local142 + 1, local120) - arg1.method5638(local142 - 1, local120);
						local186 = arg1.method5638(local142, local120 + 1) - arg1.method5638(local142, local120 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + local172 * local172 + 65536)));
						this.aFloatArrayArray6[local134][local108] = (float) local172 * local201;
						this.aFloatArrayArray7[local134][local108] = local201 * -256.0F;
						this.aFloatArrayArray8[local134][local108] = (float) local186 * local201;
					}
				}
			}
		}
		local108 = 0;
		local120 = 0;
		for (local134 = this.anInt6527; local134 <= this.anInt6523; local134++) {
			if (local134 >= 0 && local134 < arg1.anInt6361) {
				for (local142 = this.anInt6525; local142 <= this.anInt6522; local142++) {
					if (local142 >= 0 && local142 < arg1.anInt6360) {
						local172 = arg3[local120];
						@Pc(300) int[] local300 = arg1.anIntArrayArrayArray21[local142][local134];
						if (local300 != null && local172 != 0) {
							if (local172 == 1) {
								local108 += local300.length;
							} else {
								local108 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt6522 - this.anInt6525;
			}
		}
		if (local108 <= 0) {
			this.anInterface2_6 = null;
			this.anInterface9_6 = null;
			this.aClass156_17 = null;
			this.aClass156_18 = null;
		} else {
			this.aClass5_Sub1_10 = new Class5_Sub1(local108 * 2);
			this.aClass5_Sub1_Sub2_3 = new Class5_Sub1_Sub2(local108 * 16);
			this.aClass42_59 = new Class42(Static266.method4535(local108));
			local120 = 0;
			local134 = 0;
			for (local142 = this.anInt6527; local142 <= this.anInt6523; local142++) {
				if (local142 >= 0 && arg1.anInt6361 > local142) {
					local172 = 0;
					for (local186 = this.anInt6525; local186 <= this.anInt6522; local186++) {
						if (local186 >= 0 && local186 < arg1.anInt6360) {
							@Pc(406) int local406 = arg3[local120];
							@Pc(413) int[] local413 = arg1.anIntArrayArrayArray21[local186][local142];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray20[local186][local142];
							if (local413 != null && local406 != 0) {
								if (local406 == 1) {
									for (@Pc(571) int local571 = 0; local571 < local413.length; local571++) {
										this.method5761(local172, local134, local420[local571], local413[local571], local186, local142);
									}
								} else if (local406 == 3) {
									this.method5761(local172, local134, 0, 0, local186, local142);
									this.method5761(local172, local134, 0, arg1.anInt6364, local186, local142);
									this.method5761(local172, local134, arg1.anInt6364, 0, local186, local142);
								} else if (local406 == 2) {
									this.method5761(local172, local134, 0, arg1.anInt6364, local186, local142);
									this.method5761(local172, local134, arg1.anInt6364, arg1.anInt6364, local186, local142);
									this.method5761(local172, local134, 0, 0, local186, local142);
								} else if (local406 == 5) {
									this.method5761(local172, local134, arg1.anInt6364, arg1.anInt6364, local186, local142);
									this.method5761(local172, local134, arg1.anInt6364, 0, local186, local142);
									this.method5761(local172, local134, 0, arg1.anInt6364, local186, local142);
								} else if (local406 == 4) {
									this.method5761(local172, local134, arg1.anInt6364, 0, local186, local142);
									this.method5761(local172, local134, 0, 0, local186, local142);
									this.method5761(local172, local134, arg1.anInt6364, arg1.anInt6364, local186, local142);
								}
							}
						}
						local120++;
						local172++;
					}
				} else {
					local120 += this.anInt6522 - this.anInt6525;
				}
				local134++;
			}
			this.anInterface2_6 = this.aClass59_Sub1_40.method4312(this.aClass5_Sub1_10.aByteArray18, this.aClass5_Sub1_10.anInt2029, false);
			this.anInterface9_6 = this.aClass59_Sub1_40.method4317(16, this.aClass5_Sub1_Sub2_3.aByteArray18, this.aClass5_Sub1_Sub2_3.anInt2029, false);
			this.aClass156_18 = new Class156(this.aClass59_Sub1_40, this.anInterface9_6, 5126, 3, 0);
			this.aClass156_17 = new Class156(this.aClass59_Sub1_40, this.anInterface9_6, 5121, 4, 12);
		}
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
		this.aClass5_Sub1_Sub2_3 = null;
		this.aClass42_59 = null;
		this.aClass5_Sub1_10 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[[ZIII)V")
	public void method5759(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface2_6 == null || (arg2 + arg1 < this.anInt6525 || (this.anInt6522 < arg1 - arg2 || (arg2 + arg3 < this.anInt6527 || arg3 - arg2 > this.anInt6523)))) {
			return;
		}
		for (@Pc(48) int local48 = this.anInt6527; local48 <= this.anInt6523; local48++) {
			for (@Pc(55) int local55 = this.anInt6525; local55 <= this.anInt6522; local55++) {
				@Pc(68) int local68 = local55 - arg1;
				@Pc(73) int local73 = local48 - arg3;
				if (local68 > -arg2 && local68 < arg2 && local73 > -arg2 && local73 < arg2 && arg0[local68 + arg2][local73 + arg2]) {
					this.aClass59_Sub1_40.method4301((int) (this.aClass5_Sub13_1.aFloat29 * 255.0F) << 24);
					this.aClass59_Sub1_40.method4288(this.aClass156_18);
					this.aClass59_Sub1_40.method4322(this.aClass156_17);
					this.aClass59_Sub1_40.method4325();
					this.aClass59_Sub1_40.method4318(this.anInterface2_6, 0, this.anInt6526);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BS)V")
	private void method5760(@OriginalArg(1) short arg0) {
		if (this.aClass59_Sub1_40.aBoolean350) {
			this.aClass5_Sub1_10.method1870(arg0);
		} else {
			this.aClass5_Sub1_10.method1829(arg0);
		}
		this.anInt6526++;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)V")
	private void method5761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = arg3 + (arg4 << this.aClass3_Sub2_3.anInt6363);
		@Pc(17) int local17 = (arg5 << this.aClass3_Sub2_3.anInt6363) + arg2;
		@Pc(23) int local23 = this.aClass3_Sub2_3.method5639(local9, local17);
		if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(51) Class5 local51 = this.aClass42_59.method1052(local1);
			if (local51 != null) {
				this.method5760(((Class5_Sub23) local51).aShort32);
				return;
			}
		}
		@Pc(69) short local69 = (short) this.anInt6524++;
		if (local1 != -1L) {
			this.aClass42_59.method1050(local1, new Class5_Sub23(local69));
		}
		@Pc(133) float local133;
		@Pc(115) float local115;
		@Pc(124) float local124;
		@Pc(205) float local205;
		@Pc(213) float local213;
		@Pc(220) float local220;
		@Pc(227) float local227;
		@Pc(234) float local234;
		@Pc(243) float local243;
		@Pc(252) float local252;
		@Pc(276) float local276;
		if (arg3 == 0 && arg2 == 0) {
			local124 = this.aFloatArrayArray8[arg0][arg1];
			local115 = this.aFloatArrayArray7[arg0][arg1];
			local133 = this.aFloatArrayArray6[arg0][arg1];
		} else if (arg3 == this.aClass3_Sub2_3.anInt6364 && arg2 == 0) {
			local115 = this.aFloatArrayArray7[arg0 + 1][arg1];
			local124 = this.aFloatArrayArray8[arg0 + 1][arg1];
			local133 = this.aFloatArrayArray6[arg0 + 1][arg1];
		} else if (this.aClass3_Sub2_3.anInt6364 == arg3 && this.aClass3_Sub2_3.anInt6364 == arg2) {
			local133 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
			local124 = this.aFloatArrayArray8[arg0 + 1][arg1 + 1];
			local115 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		} else if (arg3 == 0 && arg2 == this.aClass3_Sub2_3.anInt6364) {
			local124 = this.aFloatArrayArray8[arg0][arg1 + 1];
			local133 = this.aFloatArrayArray6[arg0][arg1 + 1];
			local115 = this.aFloatArrayArray7[arg0][arg1 + 1];
		} else {
			local205 = (float) arg3 / (float) this.aClass3_Sub2_3.anInt6364;
			local213 = (float) arg2 / (float) this.aClass3_Sub2_3.anInt6364;
			local220 = this.aFloatArrayArray6[arg0][arg1];
			local227 = this.aFloatArrayArray7[arg0][arg1];
			local234 = this.aFloatArrayArray8[arg0][arg1];
			local243 = this.aFloatArrayArray6[arg0 + 1][arg1];
			local252 = this.aFloatArrayArray7[arg0 + 1][arg1];
			@Pc(267) float local267 = local234 + local205 * (this.aFloatArrayArray8[arg0][arg1 + 1] - local234);
			local276 = this.aFloatArrayArray8[arg0 + 1][arg1];
			@Pc(291) float local291 = local220 + (this.aFloatArrayArray6[arg0][arg1 + 1] - local220) * local205;
			@Pc(308) float local308 = local252 + (this.aFloatArrayArray7[arg0 + 1][arg1 + 1] - local252) * local205;
			@Pc(324) float local324 = local227 + local205 * (this.aFloatArrayArray7[arg0][arg1 + 1] - local227);
			@Pc(341) float local341 = local243 + local205 * (this.aFloatArrayArray6[arg0 + 1][arg1 + 1] - local243);
			@Pc(358) float local358 = local276 + local205 * (this.aFloatArrayArray8[arg0 + 1][arg1 + 1] - local276);
			local133 = local291 + local213 * (local341 - local291);
			local115 = local324 + (local308 - local324) * local213;
			local124 = local267 + local213 * (local358 - local267);
		}
		local205 = this.aClass5_Sub13_1.anInt2080 - local9;
		local213 = this.aClass5_Sub13_1.anInt2076 - local23;
		local220 = this.aClass5_Sub13_1.anInt2082 - local17;
		local227 = (float) Math.sqrt((double) (local220 * local220 + local205 * local205 + local213 * local213));
		local234 = 1.0F / local227;
		local220 *= local234;
		local213 *= local234;
		local205 *= local234;
		local243 = local227 / (float) this.aClass5_Sub13_1.anInt2079;
		local252 = (float) 1 - local243 * local243;
		if (local252 < 0.0F) {
			local252 = 0.0F;
		}
		local276 = local115 * local213 + local133 * local205 + local124 * local220;
		if (local276 < 0.0F) {
			local276 = 0.0F;
		}
		@Pc(535) float local535 = local252 * local276 * 2.0F;
		if (local535 > 1.0F) {
			local535 = 1.0F;
		}
		@Pc(546) int local546 = this.aClass5_Sub13_1.anInt2077;
		@Pc(556) int local556 = (int) ((float) (local546 >> 16 & 0xFF) * local535);
		if (local556 > 255) {
			local556 = 255;
		}
		@Pc(574) int local574 = (int) ((float) (local546 >> 8 & 0xFF) * local535);
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(590) int local590 = (int) (local535 * (float) (local546 & 0xFF));
		if (this.aClass59_Sub1_40.aBoolean350) {
			this.aClass5_Sub1_Sub2_3.method1887((float) local9);
			this.aClass5_Sub1_Sub2_3.method1887((float) local23);
			this.aClass5_Sub1_Sub2_3.method1887((float) local17);
		} else {
			this.aClass5_Sub1_Sub2_3.method1888((float) local9);
			this.aClass5_Sub1_Sub2_3.method1888((float) local23);
			this.aClass5_Sub1_Sub2_3.method1888((float) local17);
		}
		if (local590 > 255) {
			local590 = 255;
		}
		this.aClass5_Sub1_Sub2_3.method1886(local556);
		this.aClass5_Sub1_Sub2_3.method1886(local574);
		this.aClass5_Sub1_Sub2_3.method1886(local590);
		this.aClass5_Sub1_Sub2_3.method1886(255);
		this.method5760(local69);
	}
}
