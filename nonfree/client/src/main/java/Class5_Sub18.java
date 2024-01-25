import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class5_Sub18 extends Class5 {

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
	private int anInt2663;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	private int anInt2670;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!rd;")
	private final Class5_Sub19 aClass5_Sub19_1;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!jk;")
	private final Class125_Sub1 aClass125_Sub1_2;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_21;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	private final int anInt2671;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	private final int anInt2659;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	private final int anInt2662;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	private final int anInt2661;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!fh;")
	private Class5_Sub15 aClass5_Sub15_3;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!sd;")
	private Class5_Sub15_Sub1 aClass5_Sub15_Sub1_1;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!vg;")
	private Class252 aClass252_17;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "Lclient!fp;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Lclient!ql;")
	private final Interface12 anInterface12_1;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Lclient!pp;")
	private final Class195 aClass195_2;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!pp;")
	private final Class195 aClass195_3;

	static {
		new Class198("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!tt;Lclient!jk;Lclient!rd;[I)V")
	public Class5_Sub18(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class125_Sub1 arg1, @OriginalArg(2) Class5_Sub19 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub19_1 = arg2;
		this.aClass125_Sub1_2 = arg1;
		this.aClass200_Sub2_21 = arg0;
		@Pc(22) int local22 = this.aClass5_Sub19_1.method4982() - (arg1.anInt6303 >> 1);
		this.anInt2671 = this.aClass5_Sub19_1.method4977() - local22 >> arg1.anInt6300;
		this.anInt2659 = this.aClass5_Sub19_1.method4977() + local22 >> arg1.anInt6300;
		this.anInt2662 = this.aClass5_Sub19_1.method4979() - local22 >> arg1.anInt6300;
		this.anInt2661 = local22 + this.aClass5_Sub19_1.method4979() >> arg1.anInt6300;
		@Pc(78) int local78 = this.anInt2659 + 1 - this.anInt2671;
		@Pc(86) int local86 = this.anInt2661 + 1 - this.anInt2662;
		this.aFloatArrayArray2 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray4 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(172) int local172;
		@Pc(186) int local186;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt2662 + local115;
			if (local122 > 0 && local122 < this.aClass125_Sub1_2.anInt6299 - 1) {
				for (local140 = 0; local140 <= local78; local140++) {
					local148 = local140 + this.anInt2671;
					if (local148 > 0 && this.aClass125_Sub1_2.anInt6301 - 1 > local148) {
						local172 = arg1.ua(local148 + 1, local122) - arg1.ua(local148 - 1, local122);
						local186 = arg1.ua(local148, local122 + 1) - arg1.ua(local148, local122 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local186 * local186 + 65536)));
						this.aFloatArrayArray4[local140][local115] = local201 * (float) local172;
						this.aFloatArrayArray2[local140][local115] = local201 * -256.0F;
						this.aFloatArrayArray3[local140][local115] = local201 * (float) local186;
					}
				}
			}
		}
		local122 = 0;
		local140 = 0;
		for (local148 = this.anInt2662; local148 <= this.anInt2661; local148++) {
			if (local148 >= 0 && local148 < arg1.anInt6299) {
				for (local172 = this.anInt2671; local172 <= this.anInt2659; local172++) {
					if (local172 >= 0 && arg1.anInt6301 > local172) {
						local186 = arg3[local140];
						@Pc(305) int[] local305 = arg1.anIntArrayArrayArray6[local172][local148];
						if (local305 != null && local186 != 0) {
							if (local186 == 1) {
								local122 += local305.length;
							} else {
								local122 += 3;
							}
						}
					}
					local140++;
				}
			} else {
				local140 += this.anInt2659 - this.anInt2671;
			}
		}
		if (local122 > 0) {
			this.aClass5_Sub15_3 = new Class5_Sub15(local122 * 2);
			this.aClass5_Sub15_Sub1_1 = new Class5_Sub15_Sub1(local122 * 16);
			this.aClass252_17 = new Class252(Static331.method4084(local122));
			local140 = 0;
			local172 = 0;
			for (local186 = this.anInt2662; local186 <= this.anInt2661; local186++) {
				if (local186 >= 0 && arg1.anInt6299 > local186) {
					@Pc(384) int local384 = 0;
					for (@Pc(387) int local387 = this.anInt2671; local387 <= this.anInt2659; local387++) {
						if (local387 >= 0 && local387 < arg1.anInt6301) {
							@Pc(402) int local402 = arg3[local140];
							@Pc(409) int[] local409 = arg1.anIntArrayArrayArray6[local387][local186];
							@Pc(416) int[] local416 = arg1.anIntArrayArrayArray4[local387][local186];
							if (local409 != null && local402 != 0) {
								if (local402 == 1) {
									for (@Pc(425) int local425 = 0; local425 < local409.length; local425++) {
										this.method2144(local186, local172, local384, local387, local409[local425], local416[local425]);
									}
								} else if (local402 == 3) {
									this.method2144(local186, local172, local384, local387, 0, 0);
									this.method2144(local186, local172, local384, local387, arg1.anInt6303, 0);
									this.method2144(local186, local172, local384, local387, 0, arg1.anInt6303);
								} else if (local402 == 2) {
									this.method2144(local186, local172, local384, local387, arg1.anInt6303, 0);
									this.method2144(local186, local172, local384, local387, arg1.anInt6303, arg1.anInt6303);
									this.method2144(local186, local172, local384, local387, 0, 0);
								} else if (local402 == 5) {
									this.method2144(local186, local172, local384, local387, arg1.anInt6303, arg1.anInt6303);
									this.method2144(local186, local172, local384, local387, 0, arg1.anInt6303);
									this.method2144(local186, local172, local384, local387, arg1.anInt6303, 0);
								} else if (local402 == 4) {
									this.method2144(local186, local172, local384, local387, 0, arg1.anInt6303);
									this.method2144(local186, local172, local384, local387, 0, 0);
									this.method2144(local186, local172, local384, local387, arg1.anInt6303, arg1.anInt6303);
								}
							}
						}
						local384++;
						local140++;
					}
				} else {
					local140 += this.anInt2659 - this.anInt2671;
				}
				local172++;
			}
			this.anInterface5_1 = this.aClass200_Sub2_21.method5324(this.aClass5_Sub15_3.anInt7013, false, this.aClass5_Sub15_3.aByteArray93);
			this.anInterface12_1 = this.aClass200_Sub2_21.method5298(this.aClass5_Sub15_Sub1_1.aByteArray93, false, 16, this.aClass5_Sub15_Sub1_1.anInt7013);
			this.aClass195_2 = new Class195(this.anInterface12_1, 5126, 3, 0);
			this.aClass195_3 = new Class195(this.anInterface12_1, 5121, 4, 12);
		} else {
			this.aClass195_2 = null;
			this.anInterface5_1 = null;
			this.anInterface12_1 = null;
			this.aClass195_3 = null;
		}
		this.aClass5_Sub15_3 = null;
		this.aClass5_Sub15_Sub1_1 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aClass252_17 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBII[[Z)V")
	public void method2142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface5_1 == null || (this.anInt2671 > arg0 + arg1 || (this.anInt2659 < arg1 - arg0 || (arg0 + arg2 < this.anInt2662 || this.anInt2661 < arg2 - arg0)))) {
			return;
		}
		for (@Pc(46) int local46 = this.anInt2662; local46 <= this.anInt2661; local46++) {
			for (@Pc(51) int local51 = this.anInt2671; local51 <= this.anInt2659; local51++) {
				@Pc(58) int local58 = local51 - arg1;
				@Pc(63) int local63 = local46 - arg2;
				if (-arg0 < local58 && arg0 > local58 && -arg0 < local63 && local63 < arg0 && arg3[local58 + arg0][local63 + arg0]) {
					this.aClass200_Sub2_21.method5308((int) (this.aClass5_Sub19_1.method4974() * 255.0F) << 24);
					this.aClass200_Sub2_21.method5311(this.aClass195_3, null, null, this.aClass195_2);
					this.aClass200_Sub2_21.method5325(0, this.anInterface5_1, this.anInt2670);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBII)V")
	private void method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass125_Sub1_2.anInt6300) + arg4;
		@Pc(24) int local24 = arg5 + (arg0 << this.aClass125_Sub1_2.anInt6300);
		@Pc(30) int local30 = this.aClass125_Sub1_2.ca(local15, local24);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local24 & 0xFFFFL) << 16;
			@Pc(59) Class5 local59 = this.aClass252_17.method5659(local7);
			if (local59 != null) {
				this.method2146(((Class5_Sub46) local59).aShort103);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt2663++;
		if (local7 != -1L) {
			this.aClass252_17.method5658(new Class5_Sub46(local77), local7);
		}
		@Pc(145) float local145;
		@Pc(156) float local156;
		@Pc(134) float local134;
		@Pc(202) float local202;
		@Pc(210) float local210;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(249) float local249;
		@Pc(289) float local289;
		if (arg4 == 0 && arg5 == 0) {
			local134 = this.aFloatArrayArray3[arg2][arg1];
			local145 = this.aFloatArrayArray4[arg2][arg1];
			local156 = this.aFloatArrayArray2[arg2][arg1];
		} else if (this.aClass125_Sub1_2.anInt6303 == arg4 && arg5 == 0) {
			local134 = this.aFloatArrayArray3[arg2 + 1][arg1];
			local145 = this.aFloatArrayArray4[arg2 + 1][arg1];
			local156 = this.aFloatArrayArray2[arg2 + 1][arg1];
		} else if (arg4 == this.aClass125_Sub1_2.anInt6303 && this.aClass125_Sub1_2.anInt6303 == arg5) {
			local134 = this.aFloatArrayArray3[arg2 + 1][arg1 + 1];
			local145 = this.aFloatArrayArray4[arg2 + 1][arg1 + 1];
			local156 = this.aFloatArrayArray2[arg2 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass125_Sub1_2.anInt6303) {
			local145 = this.aFloatArrayArray4[arg2][arg1 + 1];
			local156 = this.aFloatArrayArray2[arg2][arg1 + 1];
			local134 = this.aFloatArrayArray3[arg2][arg1 + 1];
		} else {
			local202 = (float) arg4 / (float) this.aClass125_Sub1_2.anInt6303;
			local210 = (float) arg5 / (float) this.aClass125_Sub1_2.anInt6303;
			local217 = this.aFloatArrayArray4[arg2][arg1];
			local224 = this.aFloatArrayArray2[arg2][arg1];
			local231 = this.aFloatArrayArray3[arg2][arg1];
			local240 = this.aFloatArrayArray4[arg2 + 1][arg1];
			local249 = this.aFloatArrayArray2[arg2 + 1][arg1];
			@Pc(265) float local265 = local217 + (this.aFloatArrayArray4[arg2][arg1 + 1] - local217) * local202;
			@Pc(280) float local280 = local224 + local202 * (this.aFloatArrayArray2[arg2][arg1 + 1] - local224);
			local289 = this.aFloatArrayArray3[arg2 + 1][arg1];
			@Pc(304) float local304 = local231 + local202 * (this.aFloatArrayArray3[arg2][arg1 + 1] - local231);
			@Pc(321) float local321 = local249 + local202 * (this.aFloatArrayArray2[arg2 + 1][arg1 + 1] - local249);
			@Pc(338) float local338 = local240 + local202 * (this.aFloatArrayArray4[arg2 + 1][arg1 + 1] - local240);
			@Pc(355) float local355 = local289 + (this.aFloatArrayArray3[arg2 + 1][arg1 + 1] - local289) * local202;
			local145 = local265 + local210 * (local338 - local265);
			local156 = local210 * (local321 - local280) + local280;
			local134 = local210 * (local355 - local304) + local304;
		}
		local202 = this.aClass5_Sub19_1.method4977() - local15;
		local210 = this.aClass5_Sub19_1.method4981() - local30;
		local217 = this.aClass5_Sub19_1.method4979() - local24;
		local224 = (float) Math.sqrt((double) (local217 * local217 + local210 * local210 + local202 * local202));
		local231 = 1.0F / local224;
		local217 *= local231;
		local202 *= local231;
		local210 *= local231;
		local240 = local224 / (float) this.aClass5_Sub19_1.method4982();
		local249 = 1.0F - local240 * local240;
		if (local249 < 0.0F) {
			local249 = 0.0F;
		}
		local289 = local217 * local134 + local210 * local156 + local145 * local202;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		@Pc(544) float local544 = local249 * local289 * 2.0F;
		if (local544 > 1.0F) {
			local544 = 1.0F;
		}
		@Pc(555) int local555 = this.aClass5_Sub19_1.method4975();
		@Pc(565) int local565 = (int) ((float) (local555 >> 16 & 0xFF) * local544);
		if (local565 > 255) {
			local565 = 255;
		}
		@Pc(582) int local582 = (int) ((float) (local555 >> 8 & 0xFF) * local544);
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(595) int local595 = (int) ((float) (local555 & 0xFF) * local544);
		if (local595 > 255) {
			local595 = 255;
		}
		if (this.aClass200_Sub2_21.aBoolean433) {
			this.aClass5_Sub15_Sub1_1.method4831((float) local15);
			this.aClass5_Sub15_Sub1_1.method4831((float) local30);
			this.aClass5_Sub15_Sub1_1.method4831((float) local24);
		} else {
			this.aClass5_Sub15_Sub1_1.method4833((float) local15);
			this.aClass5_Sub15_Sub1_1.method4833((float) local30);
			this.aClass5_Sub15_Sub1_1.method4833((float) local24);
		}
		this.aClass5_Sub15_Sub1_1.method5583(local565);
		this.aClass5_Sub15_Sub1_1.method5583(local582);
		this.aClass5_Sub15_Sub1_1.method5583(local595);
		this.aClass5_Sub15_Sub1_1.method5583(255);
		this.method2146(local77);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(SI)V")
	private void method2146(@OriginalArg(0) short arg0) {
		if (this.aClass200_Sub2_21.aBoolean433) {
			this.aClass5_Sub15_3.method5566(arg0);
		} else {
			this.aClass5_Sub15_3.method5568(arg0);
		}
		this.anInt2670++;
	}
}
