import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "[I")
	public static final int[] anIntArray147 = new int[16384];

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "[I")
	public static final int[] anIntArray148 = new int[16384];

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
	private int anInt1212;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_7;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "Lclient!sm;")
	private final Class16_Sub3 aClass16_Sub3_1;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Lclient!pv;")
	private final Class4_Sub32 aClass4_Sub32_3;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	private int anInt1207;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	private final int anInt1213;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	private final int anInt1208;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
	private final int anInt1209;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
	private int anInt1215;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "Lclient!eh;")
	private final Class4_Sub9 aClass4_Sub9_2;

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "Lclient!ps;")
	private final Class4_Sub9_Sub2 aClass4_Sub9_Sub2_1;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!jw;")
	private final Class183 aClass183_5;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "Lclient!qn;")
	private final Interface18 anInterface18_1;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "Lclient!gb;")
	private final Interface10 anInterface10_1;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "Lclient!gda;")
	private final Class117 aClass117_1;

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "Lclient!gda;")
	private final Class117 aClass117_2;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray148[local11] = (int) (Math.sin(local9 * (double) local11) * 16384.0D);
			anIntArray147[local11] = (int) (Math.cos((double) local11 * local9) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!no;Lclient!sm;Lclient!pv;[I)V")
	public Class4_Sub11(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class16_Sub3 arg1, @OriginalArg(2) Class4_Sub32 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass66_Sub3_7 = arg0;
		this.aClass16_Sub3_1 = arg1;
		this.aClass4_Sub32_3 = arg2;
		@Pc(22) int local22 = this.aClass4_Sub32_3.method6621() - (arg1.anInt9841 >> 1);
		this.anInt1207 = this.aClass4_Sub32_3.method6614() - local22 >> arg1.anInt9837;
		this.anInt1213 = local22 + this.aClass4_Sub32_3.method6614() >> arg1.anInt9837;
		this.anInt1208 = this.aClass4_Sub32_3.method6617() - local22 >> arg1.anInt9837;
		this.anInt1209 = local22 + this.aClass4_Sub32_3.method6617() >> arg1.anInt9837;
		@Pc(76) int local76 = this.anInt1213 + 1 - this.anInt1207;
		@Pc(85) int local85 = this.anInt1209 + 1 - this.anInt1208;
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray10 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(170) int local170;
		@Pc(185) int local185;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			@Pc(121) int local121 = this.anInt1208 + local114;
			if (local121 > 0 && local121 < this.aClass16_Sub3_1.anInt9839 - 1) {
				for (local135 = 0; local135 <= local76; local135++) {
					local143 = local135 + this.anInt1207;
					if (local143 > 0 && this.aClass16_Sub3_1.anInt9838 - 1 > local143) {
						local170 = arg1.JA(local143 + 1, local121) - arg1.JA(local143 - 1, local121);
						local185 = arg1.JA(local143, local121 + 1) - arg1.JA(local143, local121 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local185 * local185 + 65536)));
						this.aFloatArrayArray9[local135][local114] = (float) local170 * local201;
						this.aFloatArrayArray10[local135][local114] = -256.0F * local201;
						this.aFloatArrayArray8[local135][local114] = local201 * (float) local185;
					}
				}
			}
		}
		local135 = 0;
		for (local143 = this.anInt1208; local143 <= this.anInt1209; local143++) {
			if (local143 >= 0 && local143 < arg1.anInt9839) {
				for (local170 = this.anInt1207; local170 <= this.anInt1213; local170++) {
					if (local170 >= 0 && arg1.anInt9838 > local170) {
						local185 = arg3[local135];
						@Pc(301) int[] local301 = arg1.anIntArrayArrayArray20[local170][local143];
						if (local301 != null && local185 != 0) {
							if (local185 == 1) {
								@Pc(323) int local323 = 0;
								while (local323 < local301.length) {
									if (local301[local323++] != -1 && local301[local323++] != -1 && local301[local323++] != -1) {
										this.anInt1215 += 3;
									}
								}
							} else {
								this.anInt1215 += 3;
							}
						}
					}
					local135++;
				}
			} else {
				local135 += this.anInt1213 - this.anInt1207;
			}
		}
		this.aClass117_1 = null;
		this.anInterface10_1 = null;
		this.aClass117_2 = null;
		this.anInterface18_1 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray10 = this.aFloatArrayArray8 = null;
		this.aClass4_Sub9_2 = null;
		this.aClass4_Sub9_Sub2_1 = null;
		this.aClass183_5 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
	private void method1073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg5 + (arg0 << this.aClass16_Sub3_1.anInt9837);
		@Pc(24) int local24 = arg3 + (arg2 << this.aClass16_Sub3_1.anInt9837);
		@Pc(30) int local30 = this.aClass16_Sub3_1.sa(local16, local24);
		if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(59) Class4 local59 = this.aClass183_5.method4289(local7);
			if (local59 != null) {
				this.method1075(((Class4_Sub52) local59).aShort126, (byte) 59);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt1212++;
		if (local7 != -1L) {
			this.aClass183_5.method4282(local7, new Class4_Sub52(local77));
		}
		if (arg1 != 5183) {
			this.method1073(10, 18, -31, -127, 44, 3, 36);
		}
		@Pc(115) float local115;
		@Pc(129) float local129;
		@Pc(122) float local122;
		@Pc(246) float local246;
		@Pc(254) float local254;
		@Pc(261) float local261;
		@Pc(268) float local268;
		@Pc(275) float local275;
		@Pc(284) float local284;
		@Pc(293) float local293;
		@Pc(335) float local335;
		if (arg5 == 0 && arg3 == 0) {
			local115 = this.aFloatArrayArray9[arg6][arg4];
			local122 = this.aFloatArrayArray8[arg6][arg4];
			local129 = this.aFloatArrayArray10[arg6][arg4];
		} else if (this.aClass16_Sub3_1.anInt9841 == arg5 && arg3 == 0) {
			local122 = this.aFloatArrayArray8[arg6 + 1][arg4];
			local115 = this.aFloatArrayArray9[arg6 + 1][arg4];
			local129 = this.aFloatArrayArray10[arg6 + 1][arg4];
		} else if (arg5 == this.aClass16_Sub3_1.anInt9841 && this.aClass16_Sub3_1.anInt9841 == arg3) {
			local122 = this.aFloatArrayArray8[arg6 + 1][arg4 + 1];
			local129 = this.aFloatArrayArray10[arg6 + 1][arg4 + 1];
			local115 = this.aFloatArrayArray9[arg6 + 1][arg4 + 1];
		} else if (arg5 == 0 && arg3 == this.aClass16_Sub3_1.anInt9841) {
			local129 = this.aFloatArrayArray10[arg6][arg4 + 1];
			local115 = this.aFloatArrayArray9[arg6][arg4 + 1];
			local122 = this.aFloatArrayArray8[arg6][arg4 + 1];
		} else {
			local246 = (float) arg5 / (float) this.aClass16_Sub3_1.anInt9841;
			local254 = (float) arg3 / (float) this.aClass16_Sub3_1.anInt9841;
			local261 = this.aFloatArrayArray9[arg6][arg4];
			local268 = this.aFloatArrayArray10[arg6][arg4];
			local275 = this.aFloatArrayArray8[arg6][arg4];
			local284 = this.aFloatArrayArray9[arg6 + 1][arg4];
			local293 = this.aFloatArrayArray10[arg6 + 1][arg4];
			@Pc(308) float local308 = local268 + (this.aFloatArrayArray10[arg6][arg4 + 1] - local268) * local246;
			@Pc(326) float local326 = local293 + (this.aFloatArrayArray10[arg6 + 1][arg4 + 1] - local293) * local246;
			local335 = this.aFloatArrayArray8[arg6 + 1][arg4];
			@Pc(352) float local352 = local284 + (this.aFloatArrayArray9[arg6 + 1][arg4 + 1] - local284) * local246;
			@Pc(368) float local368 = local261 + local246 * (this.aFloatArrayArray9[arg6][arg4 + 1] - local261);
			@Pc(384) float local384 = local275 + (this.aFloatArrayArray8[arg6][arg4 + 1] - local275) * local246;
			@Pc(402) float local402 = local335 + (this.aFloatArrayArray8[arg6 + 1][arg4 + 1] - local335) * local246;
			local129 = (local326 - local308) * local254 + local308;
			local115 = (local352 - local368) * local254 + local368;
			local122 = local254 * (local402 - local384) + local384;
		}
		local246 = this.aClass4_Sub32_3.method6614() - local16;
		local254 = this.aClass4_Sub32_3.method6615(arg1 - 23919) - local30;
		local261 = this.aClass4_Sub32_3.method6617() - local24;
		local268 = (float) Math.sqrt((double) (local246 * local246 + local254 * local254 + local261 * local261));
		local275 = 1.0F / local268;
		local254 *= local275;
		local261 *= local275;
		local246 *= local275;
		local284 = local268 / (float) this.aClass4_Sub32_3.method6621();
		local293 = 1.0F - local284 * local284;
		if (local293 < 0.0F) {
			local293 = 0.0F;
		}
		local335 = local115 * local246 + local254 * local129 + local261 * local122;
		if (local335 < 0.0F) {
			local335 = 0.0F;
		}
		@Pc(560) float local560 = local293 * 2.0F * local335;
		if (local560 > 1.0F) {
			local560 = 1.0F;
		}
		@Pc(573) int local573 = this.aClass4_Sub32_3.method6613(arg1 ^ 0x1475);
		@Pc(583) int local583 = (int) ((float) (local573 >> 16 & 0xFF) * local560);
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(598) int local598 = (int) ((float) (local573 >> 8 & 0xFF) * local560);
		if (local598 > 255) {
			local598 = 255;
		}
		@Pc(611) int local611 = (int) (local560 * (float) (local573 & 0xFF));
		if (local611 > 255) {
			local611 = 255;
		}
		if (this.aClass66_Sub3_7.aBoolean476) {
			this.aClass4_Sub9_Sub2_1.method6031((float) local16, 87);
			this.aClass4_Sub9_Sub2_1.method6031((float) local30, arg1 - 5056);
			this.aClass4_Sub9_Sub2_1.method6031((float) local24, 90);
		} else {
			this.aClass4_Sub9_Sub2_1.method6030((float) local16);
			this.aClass4_Sub9_Sub2_1.method6030((float) local30);
			this.aClass4_Sub9_Sub2_1.method6030((float) local24);
		}
		this.aClass4_Sub9_Sub2_1.method5961(-345277664, local583);
		this.aClass4_Sub9_Sub2_1.method5961(-345277664, local598);
		this.aClass4_Sub9_Sub2_1.method5961(arg1 ^ 0xEB6B6F1F, local611);
		this.aClass4_Sub9_Sub2_1.method5961(-345277664, 255);
		this.method1075(local77, (byte) 86);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZII[[Z)V")
	public void method1074(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface18_1 == null || (this.anInt1207 > arg1 + arg0 || (this.anInt1213 < arg0 - arg1 || (arg1 + arg2 < this.anInt1208 || this.anInt1209 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(42) int local42 = this.anInt1208; local42 <= this.anInt1209; local42++) {
			for (@Pc(47) int local47 = this.anInt1207; local47 <= this.anInt1213; local47++) {
				@Pc(54) int local54 = local47 - arg0;
				@Pc(59) int local59 = local42 - arg2;
				if (local54 > -arg1 && local54 < arg1 && local59 > -arg1 && local59 < arg1 && arg3[local54 + arg1][arg1 + local59]) {
					this.aClass66_Sub3_7.method5380((int) (this.aClass4_Sub32_3.method6618() * 255.0F) << 24);
					this.aClass66_Sub3_7.method5413(this.aClass117_2, this.aClass117_1, null, null);
					this.aClass66_Sub3_7.method5357(0, this.anInterface18_1, this.anInt1215);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(SB)V")
	private void method1075(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass66_Sub3_7.aBoolean476) {
			this.aClass4_Sub9_2.method6012(arg0);
		} else {
			this.aClass4_Sub9_2.method5989(arg0);
		}
		this.anInt1215++;
		if (arg1 < 48) {
			this.anInt1207 = 117;
		}
	}
}
