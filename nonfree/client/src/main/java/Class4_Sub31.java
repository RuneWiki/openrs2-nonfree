import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	private int anInt4661;

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_27;

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "Lclient!ku;")
	private final Class4_Sub7 aClass4_Sub7_2;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!ul;")
	private final Class41_Sub2 aClass41_Sub2_2;

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
	private final int anInt4664;

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
	private final int anInt4666;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
	private final int anInt4662;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
	private final int anInt4655;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "Lclient!og;")
	private final Class190 aClass190_8;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!it;")
	private final Interface7 anInterface7_4;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "Lclient!lc;")
	private final Interface9 anInterface9_4;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Lclient!og;")
	private final Class190 aClass190_9;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "Lclient!fh;")
	private Class4_Sub9 aClass4_Sub9_7;

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "Lclient!dd;")
	private Class4_Sub9_Sub1 aClass4_Sub9_Sub1_2;

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "Lclient!ek;")
	private Class67 aClass67_25;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ug;Lclient!ul;Lclient!ku;[I)V")
	public Class4_Sub31(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class41_Sub2 arg1, @OriginalArg(2) Class4_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass135_Sub2_27 = arg0;
		this.aClass4_Sub7_2 = arg2;
		this.aClass41_Sub2_2 = arg1;
		@Pc(22) int local22 = this.aClass4_Sub7_2.method4446() - (arg1.anInt6905 >> 1);
		this.anInt4664 = this.aClass4_Sub7_2.method4451() - local22 >> arg1.anInt6907;
		this.anInt4666 = this.aClass4_Sub7_2.method4451() + local22 >> arg1.anInt6907;
		this.anInt4662 = this.aClass4_Sub7_2.method4449() - local22 >> arg1.anInt6907;
		this.anInt4655 = local22 + this.aClass4_Sub7_2.method4449() >> arg1.anInt6907;
		@Pc(77) int local77 = this.anInt4666 + 1 - this.anInt4664;
		@Pc(86) int local86 = this.anInt4655 + 1 - this.anInt4662;
		this.aFloatArrayArray5 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(172) int local172;
		@Pc(187) int local187;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt4662 + local115;
			if (local122 > 0 && local122 < this.aClass41_Sub2_2.anInt6909 - 1) {
				for (local137 = 0; local137 <= local77; local137++) {
					local144 = local137 + this.anInt4664;
					if (local144 > 0 && local144 < this.aClass41_Sub2_2.anInt6908 - 1) {
						local172 = arg1.l(local144 + 1, local122) - arg1.l(local144 - 1, local122);
						local187 = arg1.l(local144, local122 + 1) - arg1.l(local144, local122 - 1);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local187 * local187 + 65536)));
						this.aFloatArrayArray3[local137][local115] = local203 * (float) local172;
						this.aFloatArrayArray5[local137][local115] = local203 * -256.0F;
						this.aFloatArrayArray4[local137][local115] = local203 * (float) local187;
					}
				}
			}
		}
		local122 = 0;
		local137 = 0;
		for (local144 = this.anInt4662; local144 <= this.anInt4655; local144++) {
			if (local144 >= 0 && local144 < arg1.anInt6909) {
				for (local172 = this.anInt4664; local172 <= this.anInt4666; local172++) {
					if (local172 >= 0 && local172 < arg1.anInt6908) {
						local187 = arg3[local137];
						@Pc(294) int[] local294 = arg1.anIntArrayArrayArray9[local172][local144];
						if (local294 != null && local187 != 0) {
							if (local187 == 1) {
								local122 += local294.length;
							} else {
								local122 += 3;
							}
						}
					}
					local137++;
				}
			} else {
				local137 += this.anInt4666 - this.anInt4664;
			}
		}
		if (local122 <= 0) {
			this.aClass190_8 = null;
			this.anInterface7_4 = null;
			this.anInterface9_4 = null;
			this.aClass190_9 = null;
		} else {
			this.aClass4_Sub9_7 = new Class4_Sub9(local122 * 2);
			this.aClass4_Sub9_Sub1_2 = new Class4_Sub9_Sub1(local122 * 16);
			this.aClass67_25 = new Class67(Static171.method2382(local122));
			local172 = 0;
			local137 = 0;
			for (local187 = this.anInt4662; local187 <= this.anInt4655; local187++) {
				if (local187 >= 0 && local187 < arg1.anInt6909) {
					@Pc(408) int local408 = 0;
					for (@Pc(411) int local411 = this.anInt4664; local411 <= this.anInt4666; local411++) {
						if (local411 >= 0 && arg1.anInt6908 > local411) {
							@Pc(426) int local426 = arg3[local137];
							@Pc(433) int[] local433 = arg1.anIntArrayArrayArray9[local411][local187];
							@Pc(440) int[] local440 = arg1.anIntArrayArrayArray12[local411][local187];
							if (local433 != null && local426 != 0) {
								if (local426 == 1) {
									for (@Pc(595) int local595 = 0; local595 < local433.length; local595++) {
										this.method3712(local440[local595], local408, local187, local172, local433[local595], local411);
									}
								} else if (local426 == 3) {
									this.method3712(0, local408, local187, local172, 0, local411);
									this.method3712(0, local408, local187, local172, arg1.anInt6905, local411);
									this.method3712(arg1.anInt6905, local408, local187, local172, 0, local411);
								} else if (local426 == 2) {
									this.method3712(0, local408, local187, local172, arg1.anInt6905, local411);
									this.method3712(arg1.anInt6905, local408, local187, local172, arg1.anInt6905, local411);
									this.method3712(0, local408, local187, local172, 0, local411);
								} else if (local426 == 5) {
									this.method3712(arg1.anInt6905, local408, local187, local172, arg1.anInt6905, local411);
									this.method3712(arg1.anInt6905, local408, local187, local172, 0, local411);
									this.method3712(0, local408, local187, local172, arg1.anInt6905, local411);
								} else if (local426 == 4) {
									this.method3712(arg1.anInt6905, local408, local187, local172, 0, local411);
									this.method3712(0, local408, local187, local172, 0, local411);
									this.method3712(arg1.anInt6905, local408, local187, local172, arg1.anInt6905, local411);
								}
							}
						}
						local408++;
						local137++;
					}
				} else {
					local137 += this.anInt4666 - this.anInt4664;
				}
				local172++;
			}
			this.anInterface7_4 = this.aClass135_Sub2_27.method5423(false, this.aClass4_Sub9_7.aByteArray81, this.aClass4_Sub9_7.anInt6207);
			this.anInterface9_4 = this.aClass135_Sub2_27.method5405(false, this.aClass4_Sub9_Sub1_2.anInt6207, 16, this.aClass4_Sub9_Sub1_2.aByteArray81);
			this.aClass190_9 = new Class190(this.anInterface9_4, 5126, 3, 0);
			this.aClass190_8 = new Class190(this.anInterface9_4, 5121, 4, 12);
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray5 = this.aFloatArrayArray4 = null;
		this.aClass67_25 = null;
		this.aClass4_Sub9_Sub1_2 = null;
		this.aClass4_Sub9_7 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(SI)V")
	private void method3711(@OriginalArg(0) short arg0) {
		if (this.aClass135_Sub2_27.aBoolean474) {
			this.aClass4_Sub9_7.method5029(arg0);
		} else {
			this.aClass4_Sub9_7.method5060(arg0);
		}
		this.anInt4661++;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)V")
	private void method3712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass41_Sub2_2.anInt6907) + arg4;
		@Pc(23) int local23 = arg0 + (arg2 << this.aClass41_Sub2_2.anInt6907);
		@Pc(29) int local29 = this.aClass41_Sub2_2.a(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(61) Class4 local61 = this.aClass67_25.method1429(local7);
			if (local61 != null) {
				this.method3711(((Class4_Sub43) local61).aShort95);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt4658++;
		if (local7 != -1L) {
			this.aClass67_25.method1426(new Class4_Sub43(local79), local7);
		}
		@Pc(162) float local162;
		@Pc(151) float local151;
		@Pc(140) float local140;
		@Pc(215) float local215;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(237) float local237;
		@Pc(244) float local244;
		@Pc(253) float local253;
		@Pc(262) float local262;
		@Pc(320) float local320;
		if (arg4 == 0 && arg0 == 0) {
			local151 = this.aFloatArrayArray5[arg1][arg3];
			local162 = this.aFloatArrayArray3[arg1][arg3];
			local140 = this.aFloatArrayArray4[arg1][arg3];
		} else if (this.aClass41_Sub2_2.anInt6905 == arg4 && arg0 == 0) {
			local151 = this.aFloatArrayArray5[arg1 + 1][arg3];
			local140 = this.aFloatArrayArray4[arg1 + 1][arg3];
			local162 = this.aFloatArrayArray3[arg1 + 1][arg3];
		} else if (arg4 == this.aClass41_Sub2_2.anInt6905 && this.aClass41_Sub2_2.anInt6905 == arg0) {
			local140 = this.aFloatArrayArray4[arg1 + 1][arg3 + 1];
			local151 = this.aFloatArrayArray5[arg1 + 1][arg3 + 1];
			local162 = this.aFloatArrayArray3[arg1 + 1][arg3 + 1];
		} else if (arg4 == 0 && this.aClass41_Sub2_2.anInt6905 == arg0) {
			local151 = this.aFloatArrayArray5[arg1][arg3 + 1];
			local162 = this.aFloatArrayArray3[arg1][arg3 + 1];
			local140 = this.aFloatArrayArray4[arg1][arg3 + 1];
		} else {
			local215 = (float) arg4 / (float) this.aClass41_Sub2_2.anInt6905;
			local223 = (float) arg0 / (float) this.aClass41_Sub2_2.anInt6905;
			local230 = this.aFloatArrayArray3[arg1][arg3];
			local237 = this.aFloatArrayArray5[arg1][arg3];
			local244 = this.aFloatArrayArray4[arg1][arg3];
			local253 = this.aFloatArrayArray3[arg1 + 1][arg3];
			local262 = this.aFloatArrayArray5[arg1 + 1][arg3];
			@Pc(280) float local280 = local262 + (this.aFloatArrayArray5[arg1 + 1][arg3 + 1] - local262) * local215;
			@Pc(295) float local295 = local237 + (this.aFloatArrayArray5[arg1][arg3 + 1] - local237) * local215;
			@Pc(311) float local311 = local230 + (this.aFloatArrayArray3[arg1][arg3 + 1] - local230) * local215;
			local320 = this.aFloatArrayArray4[arg1 + 1][arg3];
			@Pc(338) float local338 = local253 + local215 * (this.aFloatArrayArray3[arg1 + 1][arg3 + 1] - local253);
			@Pc(354) float local354 = local244 + local215 * (this.aFloatArrayArray4[arg1][arg3 + 1] - local244);
			local162 = local311 + (local338 - local311) * local223;
			local151 = local295 + local223 * (local280 - local295);
			@Pc(389) float local389 = local320 + local215 * (this.aFloatArrayArray4[arg1 + 1][arg3 + 1] - local320);
			local140 = local354 + local223 * (local389 - local354);
		}
		local215 = this.aClass4_Sub7_2.method4451() - local15;
		local223 = this.aClass4_Sub7_2.method4448() - local29;
		local230 = this.aClass4_Sub7_2.method4449() - local23;
		local237 = (float) Math.sqrt((double) (local230 * local230 + local223 * local223 + local215 * local215));
		local244 = 1.0F / local237;
		local223 *= local244;
		local230 *= local244;
		local215 *= local244;
		local253 = local237 / (float) this.aClass4_Sub7_2.method4446();
		local262 = 1.0F - local253 * local253;
		if (local262 < 0.0F) {
			local262 = 0.0F;
		}
		local320 = local140 * local230 + local151 * local223 + local215 * local162;
		if (local320 < 0.0F) {
			local320 = 0.0F;
		}
		@Pc(559) float local559 = local320 * 2.0F * local262;
		if (local559 > 1.0F) {
			local559 = 1.0F;
		}
		@Pc(570) int local570 = this.aClass4_Sub7_2.method4445();
		@Pc(580) int local580 = (int) ((float) (local570 >> 16 & 0xFF) * local559);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) ((float) (local570 >> 8 & 0xFF) * local559);
		if (local595 > 255) {
			local595 = 255;
		}
		@Pc(610) int local610 = (int) (local559 * (float) (local570 & 0xFF));
		if (local610 > 255) {
			local610 = 255;
		}
		if (this.aClass135_Sub2_27.aBoolean474) {
			this.aClass4_Sub9_Sub1_2.method1085((float) local15);
			this.aClass4_Sub9_Sub1_2.method1085((float) local29);
			this.aClass4_Sub9_Sub1_2.method1085((float) local23);
		} else {
			this.aClass4_Sub9_Sub1_2.method1084((float) local15);
			this.aClass4_Sub9_Sub1_2.method1084((float) local29);
			this.aClass4_Sub9_Sub1_2.method1084((float) local23);
		}
		this.aClass4_Sub9_Sub1_2.method4999(local580);
		this.aClass4_Sub9_Sub1_2.method4999(local595);
		this.aClass4_Sub9_Sub1_2.method4999(local610);
		this.aClass4_Sub9_Sub1_2.method4999(255);
		this.method3711(local79);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[[ZII)V")
	public void method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface7_4 == null || (this.anInt4664 > arg1 + arg3 || (arg1 - arg3 > this.anInt4666 || (arg3 + arg0 < this.anInt4662 || arg0 - arg3 > this.anInt4655)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt4662; local57 <= this.anInt4655; local57++) {
			for (@Pc(62) int local62 = this.anInt4664; local62 <= this.anInt4666; local62++) {
				@Pc(68) int local68 = local62 - arg1;
				@Pc(72) int local72 = local57 - arg0;
				if (local68 > -arg3 && local68 < arg3 && local72 > -arg3 && local72 < arg3 && arg2[arg3 + local68][local72 + arg3]) {
					this.aClass135_Sub2_27.method5435((int) (this.aClass4_Sub7_2.method4454() * 255.0F) << 24);
					this.aClass135_Sub2_27.method5431(null, this.aClass190_9, this.aClass190_8, null);
					this.aClass135_Sub2_27.method5479(this.anInterface7_4, 0, this.anInt4661);
					return;
				}
			}
		}
	}
}
