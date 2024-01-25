import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
	private int anInt7039;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Lclient!bj;")
	private final Class6_Sub7 aClass6_Sub7_3;

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "Lclient!rk;")
	private final Class59_Sub3 aClass59_Sub3_2;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_34;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
	private final int anInt7036;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
	private final int anInt7032;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
	private final int anInt7026;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private final int anInt7028;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	private int anInt7031;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Lclient!ji;")
	private final Class6_Sub21 aClass6_Sub21_6;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Lclient!gm;")
	private final Class6_Sub21_Sub1 aClass6_Sub21_Sub1_2;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "Lclient!hd;")
	private final Class128 aClass128_33;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "Lclient!wb;")
	private final Interface24 anInterface24_5;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "Lclient!ad;")
	private final Interface1 anInterface1_5;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Lclient!ce;")
	private final Class45 aClass45_6;

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "Lclient!ce;")
	private final Class45 aClass45_7;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!jaa;Lclient!rk;Lclient!bj;[I)V")
	public Class6_Sub39(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class59_Sub3 arg1, @OriginalArg(2) Class6_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass6_Sub7_3 = arg2;
		this.aClass59_Sub3_2 = arg1;
		this.aClass14_Sub3_34 = arg0;
		@Pc(23) int local23 = this.aClass6_Sub7_3.method4283() - (arg1.anInt9641 >> 1);
		this.anInt7036 = this.aClass6_Sub7_3.method4292() - local23 >> arg1.anInt9638;
		this.anInt7032 = this.aClass6_Sub7_3.method4292() + local23 >> arg1.anInt9638;
		this.anInt7026 = this.aClass6_Sub7_3.method4286() - local23 >> arg1.anInt9638;
		this.anInt7028 = local23 + this.aClass6_Sub7_3.method4286() >> arg1.anInt9638;
		@Pc(78) int local78 = this.anInt7032 + 1 - this.anInt7036;
		@Pc(87) int local87 = this.anInt7028 + 1 - this.anInt7026;
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray9 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray10 = new float[local78 + 1][local87 + 1];
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(177) int local177;
		@Pc(191) int local191;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			@Pc(123) int local123 = this.anInt7026 + local116;
			if (local123 > 0 && this.aClass59_Sub3_2.anInt9639 - 1 > local123) {
				for (local138 = 0; local138 <= local78; local138++) {
					local146 = local138 + this.anInt7036;
					if (local146 > 0 && local146 < this.aClass59_Sub3_2.anInt9640 - 1) {
						local177 = arg1.JA(local146 + 1, local123) - arg1.JA(local146 - 1, local123);
						local191 = arg1.JA(local146, local123 + 1) - arg1.JA(local146, local123 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local191 * local191 + 65536)));
						this.aFloatArrayArray10[local138][local116] = (float) local177 * local206;
						this.aFloatArrayArray8[local138][local116] = -256.0F * local206;
						this.aFloatArrayArray9[local138][local116] = local206 * (float) local191;
					}
				}
			}
		}
		local138 = 0;
		for (local146 = this.anInt7026; local146 <= this.anInt7028; local146++) {
			if (local146 >= 0 && local146 < arg1.anInt9639) {
				for (local177 = this.anInt7036; local177 <= this.anInt7032; local177++) {
					if (local177 >= 0 && local177 < arg1.anInt9640) {
						local191 = arg3[local138];
						@Pc(301) int[] local301 = arg1.anIntArrayArrayArray12[local177][local146];
						if (local301 != null && local191 != 0) {
							if (local191 == 1) {
								@Pc(310) int local310 = 0;
								while (local310 < local301.length) {
									if (local301[local310++] != -1 && local301[local310++] != -1 && local301[local310++] != -1) {
										this.anInt7031 += 3;
									}
								}
							} else {
								this.anInt7031 += 3;
							}
						}
					}
					local138++;
				}
			} else {
				local138 += this.anInt7032 - this.anInt7036;
			}
		}
		this.aClass45_7 = null;
		this.anInterface1_5 = null;
		this.anInterface24_5 = null;
		this.aClass45_6 = null;
		this.aClass128_33 = null;
		this.aClass6_Sub21_Sub1_2 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray8 = this.aFloatArrayArray9 = null;
		this.aClass6_Sub21_6 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(SI)V")
	private void method5871(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -12296) {
			this.aFloatArrayArray10 = null;
		}
		if (this.aClass14_Sub3_34.aBoolean298) {
			this.aClass6_Sub21_6.method6052(arg0);
		} else {
			this.aClass6_Sub21_6.method6032(arg0);
		}
		this.anInt7031++;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[[ZIBI)V")
	public void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface24_5 == null || (this.anInt7036 > arg3 + arg2 || (arg2 - arg3 > this.anInt7032 || (arg3 + arg0 < this.anInt7026 || this.anInt7028 < arg0 - arg3)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt7026; local54 <= this.anInt7028; local54++) {
			for (@Pc(59) int local59 = this.anInt7036; local59 <= this.anInt7032; local59++) {
				@Pc(66) int local66 = local59 - arg2;
				@Pc(71) int local71 = local54 - arg0;
				if (-arg3 < local66 && arg3 > local66 && -arg3 < local71 && arg3 > local71 && arg1[arg3 + local66][arg3 + local71]) {
					this.aClass14_Sub3_34.method3902((int) (this.aClass6_Sub7_3.method4284() * 255.0F) << 24);
					this.aClass14_Sub3_34.method3981(null, this.aClass45_7, this.aClass45_6, null);
					this.aClass14_Sub3_34.method3920(this.anInterface24_5, 0, this.anInt7031);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIBII)V")
	private void method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg6 << this.aClass59_Sub3_2.anInt9638) + arg3;
		@Pc(23) int local23 = (arg0 << this.aClass59_Sub3_2.anInt9638) + arg2;
		@Pc(29) int local29 = this.aClass59_Sub3_2.sa(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(60) Class6 local60 = this.aClass128_33.method3263(local7);
			if (local60 != null) {
				this.method5871(((Class6_Sub36) local60).aShort82, -12296);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt7039++;
		if (local7 != -1L) {
			this.aClass128_33.method3267(new Class6_Sub36(local78), local7);
		}
		@Pc(155) float local155;
		@Pc(144) float local144;
		@Pc(133) float local133;
		@Pc(208) float local208;
		@Pc(216) float local216;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(237) float local237;
		@Pc(246) float local246;
		@Pc(255) float local255;
		@Pc(279) float local279;
		if (arg3 == 0 && arg2 == 0) {
			local155 = this.aFloatArrayArray10[arg5][arg1];
			local144 = this.aFloatArrayArray8[arg5][arg1];
			local133 = this.aFloatArrayArray9[arg5][arg1];
		} else if (this.aClass59_Sub3_2.anInt9641 == arg3 && arg2 == 0) {
			local144 = this.aFloatArrayArray8[arg5 + 1][arg1];
			local133 = this.aFloatArrayArray9[arg5 + 1][arg1];
			local155 = this.aFloatArrayArray10[arg5 + 1][arg1];
		} else if (this.aClass59_Sub3_2.anInt9641 == arg3 && arg2 == this.aClass59_Sub3_2.anInt9641) {
			local133 = this.aFloatArrayArray9[arg5 + 1][arg1 + 1];
			local144 = this.aFloatArrayArray8[arg5 + 1][arg1 + 1];
			local155 = this.aFloatArrayArray10[arg5 + 1][arg1 + 1];
		} else if (arg3 == 0 && this.aClass59_Sub3_2.anInt9641 == arg2) {
			local144 = this.aFloatArrayArray8[arg5][arg1 + 1];
			local133 = this.aFloatArrayArray9[arg5][arg1 + 1];
			local155 = this.aFloatArrayArray10[arg5][arg1 + 1];
		} else {
			local208 = (float) arg3 / (float) this.aClass59_Sub3_2.anInt9641;
			local216 = (float) arg2 / (float) this.aClass59_Sub3_2.anInt9641;
			local223 = this.aFloatArrayArray10[arg5][arg1];
			local230 = this.aFloatArrayArray8[arg5][arg1];
			local237 = this.aFloatArrayArray9[arg5][arg1];
			local246 = this.aFloatArrayArray10[arg5 + 1][arg1];
			local255 = this.aFloatArrayArray8[arg5 + 1][arg1];
			@Pc(270) float local270 = local223 + (this.aFloatArrayArray10[arg5][arg1 + 1] - local223) * local208;
			local279 = this.aFloatArrayArray9[arg5 + 1][arg1];
			@Pc(294) float local294 = local230 + (this.aFloatArrayArray8[arg5][arg1 + 1] - local230) * local208;
			@Pc(309) float local309 = local237 + (this.aFloatArrayArray9[arg5][arg1 + 1] - local237) * local208;
			@Pc(326) float local326 = local255 + local208 * (this.aFloatArrayArray8[arg5 + 1][arg1 + 1] - local255);
			@Pc(344) float local344 = local246 + local208 * (this.aFloatArrayArray10[arg5 + 1][arg1 + 1] - local246);
			local155 = local270 + (local344 - local270) * local216;
			local144 = local216 * (local326 - local294) + local294;
			@Pc(378) float local378 = local279 + local208 * (this.aFloatArrayArray9[arg5 + 1][arg1 + 1] - local279);
			local133 = local216 * (local378 - local309) + local309;
		}
		local208 = this.aClass6_Sub7_3.method4292() - local15;
		local216 = this.aClass6_Sub7_3.method4291() - local29;
		if (arg4 < 92) {
			return;
		}
		local223 = this.aClass6_Sub7_3.method4286() - local23;
		local230 = (float) Math.sqrt((double) (local223 * local223 + local208 * local208 + local216 * local216));
		local237 = 1.0F / local230;
		local223 *= local237;
		local208 *= local237;
		local216 *= local237;
		local246 = local230 / (float) this.aClass6_Sub7_3.method4283();
		local255 = 1.0F - local246 * local246;
		if (local255 < 0.0F) {
			local255 = 0.0F;
		}
		local279 = local223 * local133 + local144 * local216 + local155 * local208;
		if (local279 < 0.0F) {
			local279 = 0.0F;
		}
		@Pc(545) float local545 = local279 * 2.0F * local255;
		if (local545 > 1.0F) {
			local545 = 1.0F;
		}
		@Pc(556) int local556 = this.aClass6_Sub7_3.method4288();
		@Pc(566) int local566 = (int) ((float) (local556 >> 16 & 0xFF) * local545);
		if (local566 > 255) {
			local566 = 255;
		}
		@Pc(581) int local581 = (int) ((float) (local556 >> 8 & 0xFF) * local545);
		if (local581 > 255) {
			local581 = 255;
		}
		@Pc(594) int local594 = (int) ((float) (local556 & 0xFF) * local545);
		if (local594 > 255) {
			local594 = 255;
		}
		if (this.aClass14_Sub3_34.aBoolean298) {
			this.aClass6_Sub21_Sub1_2.method3128((float) local15);
			this.aClass6_Sub21_Sub1_2.method3128((float) local29);
			this.aClass6_Sub21_Sub1_2.method3128((float) local23);
		} else {
			this.aClass6_Sub21_Sub1_2.method3126((float) local15);
			this.aClass6_Sub21_Sub1_2.method3126((float) local29);
			this.aClass6_Sub21_Sub1_2.method3126((float) local23);
		}
		this.aClass6_Sub21_Sub1_2.method6062(local566);
		this.aClass6_Sub21_Sub1_2.method6062(local581);
		this.aClass6_Sub21_Sub1_2.method6062(local594);
		this.aClass6_Sub21_Sub1_2.method6062(255);
		this.method5871(local78, -12296);
	}
}
