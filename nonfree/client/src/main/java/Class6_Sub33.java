import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	private int anInt4940;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
	private int anInt4941;

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "Lclient!uc;")
	private final Class6_Sub17 aClass6_Sub17_1;

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_30;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "Lclient!wh;")
	private final Class106_Sub2 aClass106_Sub2_3;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
	private final int anInt4943;

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
	private final int anInt4944;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
	private final int anInt4942;

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
	private final int anInt4945;

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "Lclient!ec;")
	private Class6_Sub10 aClass6_Sub10_5;

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "Lclient!oi;")
	private Class6_Sub10_Sub2 aClass6_Sub10_Sub2_2;

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "Lclient!jj;")
	private Class108 aClass108_29;

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "Lclient!gp;")
	private final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "Lclient!uq;")
	private final Interface8 anInterface8_4;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "Lclient!jm;")
	private final Class110 aClass110_8;

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "Lclient!jm;")
	private final Class110 aClass110_9;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!ge;Lclient!wh;Lclient!uc;[I)V")
	public Class6_Sub33(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class106_Sub2 arg1, @OriginalArg(2) Class6_Sub17 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass6_Sub17_1 = arg2;
		this.aClass81_Sub1_30 = arg0;
		this.aClass106_Sub2_3 = arg1;
		@Pc(20) int local20 = this.aClass6_Sub17_1.anInt2315 - (arg1.anInt6281 >> 1);
		this.anInt4943 = this.aClass6_Sub17_1.anInt2314 - local20 >> arg1.anInt6282;
		this.anInt4944 = this.aClass6_Sub17_1.anInt2314 + local20 >> arg1.anInt6282;
		this.anInt4942 = this.aClass6_Sub17_1.anInt2317 - local20 >> arg1.anInt6282;
		this.anInt4945 = local20 + this.aClass6_Sub17_1.anInt2317 >> arg1.anInt6282;
		@Pc(69) int local69 = this.anInt4944 + 1 - this.anInt4943;
		@Pc(78) int local78 = this.anInt4945 + 1 - this.anInt4942;
		this.aFloatArrayArray3 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray4 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray2 = new float[local69 + 1][local78 + 1];
		@Pc(107) int local107;
		@Pc(115) int local115;
		@Pc(130) int local130;
		@Pc(142) int local142;
		@Pc(167) int local167;
		@Pc(182) int local182;
		for (local107 = 0; local107 <= local78; local107++) {
			local115 = this.anInt4942 + local107;
			if (local115 > 0 && this.aClass106_Sub2_3.anInt6277 - 1 > local115) {
				for (local130 = 0; local130 <= local69; local130++) {
					local142 = local130 + this.anInt4943;
					if (local142 > 0 && this.aClass106_Sub2_3.anInt6271 - 1 > local142) {
						local167 = arg1.method5720(local142 + 1, local115) - arg1.method5720(local142 - 1, local115);
						local182 = arg1.method5720(local142, local115 + 1) - arg1.method5720(local142, local115 - 1);
						@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local182 * local182 + local167 * local167 + 65536)));
						this.aFloatArrayArray3[local130][local107] = (float) local167 * local197;
						this.aFloatArrayArray4[local130][local107] = local197 * -256.0F;
						this.aFloatArrayArray2[local130][local107] = local197 * (float) local182;
					}
				}
			}
		}
		local107 = 0;
		local115 = 0;
		for (local130 = this.anInt4942; local130 <= this.anInt4945; local130++) {
			if (local130 >= 0 && arg1.anInt6277 > local130) {
				for (local142 = this.anInt4943; local142 <= this.anInt4944; local142++) {
					if (local142 >= 0 && local142 < arg1.anInt6271) {
						local167 = arg3[local115];
						@Pc(289) int[] local289 = arg1.anIntArrayArrayArray11[local142][local130];
						if (local289 != null && local167 != 0) {
							if (local167 == 1) {
								local107 += local289.length;
							} else {
								local107 += 3;
							}
						}
					}
					local115++;
				}
			} else {
				local115 += this.anInt4944 - this.anInt4943;
			}
		}
		if (local107 > 0) {
			this.aClass6_Sub10_5 = new Class6_Sub10(local107 * 2);
			this.aClass6_Sub10_Sub2_2 = new Class6_Sub10_Sub2(local107 * 16);
			this.aClass108_29 = new Class108(Static247.method4066(local107));
			local115 = 0;
			local130 = 0;
			for (local142 = this.anInt4942; local142 <= this.anInt4945; local142++) {
				if (local142 >= 0 && local142 < arg1.anInt6277) {
					local167 = 0;
					for (local182 = this.anInt4943; local182 <= this.anInt4944; local182++) {
						if (local182 >= 0 && local182 < arg1.anInt6271) {
							@Pc(392) int local392 = arg3[local115];
							@Pc(399) int[] local399 = arg1.anIntArrayArrayArray11[local182][local142];
							@Pc(406) int[] local406 = arg1.anIntArrayArrayArray8[local182][local142];
							if (local399 != null && local392 != 0) {
								if (local392 == 1) {
									for (@Pc(560) int local560 = 0; local560 < local399.length; local560++) {
										this.method4501(local167, local399[local560], local406[local560], local130, local142, local182);
									}
								} else if (local392 == 3) {
									this.method4501(local167, 0, 0, local130, local142, local182);
									this.method4501(local167, arg1.anInt6281, 0, local130, local142, local182);
									this.method4501(local167, 0, arg1.anInt6281, local130, local142, local182);
								} else if (local392 == 2) {
									this.method4501(local167, arg1.anInt6281, 0, local130, local142, local182);
									this.method4501(local167, arg1.anInt6281, arg1.anInt6281, local130, local142, local182);
									this.method4501(local167, 0, 0, local130, local142, local182);
								} else if (local392 == 5) {
									this.method4501(local167, arg1.anInt6281, arg1.anInt6281, local130, local142, local182);
									this.method4501(local167, 0, arg1.anInt6281, local130, local142, local182);
									this.method4501(local167, arg1.anInt6281, 0, local130, local142, local182);
								} else if (local392 == 4) {
									this.method4501(local167, 0, arg1.anInt6281, local130, local142, local182);
									this.method4501(local167, 0, 0, local130, local142, local182);
									this.method4501(local167, arg1.anInt6281, arg1.anInt6281, local130, local142, local182);
								}
							}
						}
						local167++;
						local115++;
					}
				} else {
					local115 += this.anInt4944 - this.anInt4943;
				}
				local130++;
			}
			this.anInterface4_3 = this.aClass81_Sub1_30.method1970(this.aClass6_Sub10_5.aByteArray67, this.aClass6_Sub10_5.anInt4188, false);
			this.anInterface8_4 = this.aClass81_Sub1_30.method1990(16, this.aClass6_Sub10_Sub2_2.aByteArray67, this.aClass6_Sub10_Sub2_2.anInt4188, false);
			this.aClass110_8 = new Class110(this.aClass81_Sub1_30, this.anInterface8_4, 5126, 3, 0);
			this.aClass110_9 = new Class110(this.aClass81_Sub1_30, this.anInterface8_4, 5121, 4, 12);
		} else {
			this.anInterface8_4 = null;
			this.aClass110_9 = null;
			this.aClass110_8 = null;
			this.anInterface4_3 = null;
		}
		this.aClass6_Sub10_Sub2_2 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray4 = this.aFloatArrayArray2 = null;
		this.aClass6_Sub10_5 = null;
		this.aClass108_29 = null;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(SZ)V")
	private void method4499(@OriginalArg(0) short arg0) {
		if (this.aClass81_Sub1_30.aBoolean156) {
			this.aClass6_Sub10_5.method4025(arg0);
		} else {
			this.aClass6_Sub10_5.method4002(arg0);
		}
		this.anInt4941++;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZ)V")
	public void method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface4_3 == null || (this.anInt4943 > arg0 + arg2 || (this.anInt4944 < arg2 - arg0 || (arg1 + arg0 < this.anInt4942 || arg1 - arg0 > this.anInt4945)))) {
			return;
		}
		for (@Pc(53) int local53 = this.anInt4942; local53 <= this.anInt4945; local53++) {
			for (@Pc(60) int local60 = this.anInt4943; local60 <= this.anInt4944; local60++) {
				@Pc(73) int local73 = local60 - arg2;
				@Pc(78) int local78 = local53 - arg1;
				if (-arg0 < local73 && local73 < arg0 && local78 > -arg0 && local78 < arg0 && arg3[local73 + arg0][local78 + arg0]) {
					this.aClass81_Sub1_30.method1958((int) (this.aClass6_Sub17_1.aFloat61 * 255.0F) << 24);
					this.aClass81_Sub1_30.method1996(this.aClass110_8);
					this.aClass81_Sub1_30.method1950(this.aClass110_9);
					this.aClass81_Sub1_30.method1971();
					this.aClass81_Sub1_30.method1973(this.anInterface4_3, 0, this.anInt4941);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII)V")
	private void method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(10) int local10 = arg1 + (arg5 << this.aClass106_Sub2_3.anInt6282);
		@Pc(19) int local19 = arg2 + (arg4 << this.aClass106_Sub2_3.anInt6282);
		@Pc(25) int local25 = this.aClass106_Sub2_3.method5717(local10, local19);
		if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = ((long) local19 & 0xFFFFL) << 16 | (long) local10 & 0xFFFFL;
			@Pc(57) Class6 local57 = this.aClass108_29.method2900(local1);
			if (local57 != null) {
				this.method4499(((Class6_Sub18) local57).aShort30);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt4940++;
		if (local1 != -1L) {
			this.aClass108_29.method2898(local1, new Class6_Sub18(local75));
		}
		@Pc(122) float local122;
		@Pc(115) float local115;
		@Pc(108) float local108;
		@Pc(193) float local193;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(299) float local299;
		if (arg1 == 0 && arg2 == 0) {
			local108 = this.aFloatArrayArray2[arg0][arg3];
			local115 = this.aFloatArrayArray4[arg0][arg3];
			local122 = this.aFloatArrayArray3[arg0][arg3];
		} else if (arg1 == this.aClass106_Sub2_3.anInt6281 && arg2 == 0) {
			local115 = this.aFloatArrayArray4[arg0 + 1][arg3];
			local108 = this.aFloatArrayArray2[arg0 + 1][arg3];
			local122 = this.aFloatArrayArray3[arg0 + 1][arg3];
		} else if (arg1 == this.aClass106_Sub2_3.anInt6281 && arg2 == this.aClass106_Sub2_3.anInt6281) {
			local108 = this.aFloatArrayArray2[arg0 + 1][arg3 + 1];
			local122 = this.aFloatArrayArray3[arg0 + 1][arg3 + 1];
			local115 = this.aFloatArrayArray4[arg0 + 1][arg3 + 1];
		} else if (arg1 == 0 && arg2 == this.aClass106_Sub2_3.anInt6281) {
			local115 = this.aFloatArrayArray4[arg0][arg3 + 1];
			local122 = this.aFloatArrayArray3[arg0][arg3 + 1];
			local108 = this.aFloatArrayArray2[arg0][arg3 + 1];
		} else {
			local193 = (float) arg1 / (float) this.aClass106_Sub2_3.anInt6281;
			local201 = (float) arg2 / (float) this.aClass106_Sub2_3.anInt6281;
			local208 = this.aFloatArrayArray3[arg0][arg3];
			local215 = this.aFloatArrayArray4[arg0][arg3];
			local222 = this.aFloatArrayArray2[arg0][arg3];
			local231 = this.aFloatArrayArray3[arg0 + 1][arg3];
			local240 = this.aFloatArrayArray4[arg0 + 1][arg3];
			@Pc(257) float local257 = local231 + local193 * (this.aFloatArrayArray3[arg0 + 1][arg3 + 1] - local231);
			@Pc(274) float local274 = local240 + local193 * (this.aFloatArrayArray4[arg0 + 1][arg3 + 1] - local240);
			@Pc(290) float local290 = local208 + (this.aFloatArrayArray3[arg0][arg3 + 1] - local208) * local193;
			local299 = this.aFloatArrayArray2[arg0 + 1][arg3];
			@Pc(315) float local315 = local222 + (this.aFloatArrayArray2[arg0][arg3 + 1] - local222) * local193;
			@Pc(331) float local331 = local215 + (this.aFloatArrayArray4[arg0][arg3 + 1] - local215) * local193;
			local115 = (local274 - local331) * local201 + local331;
			@Pc(357) float local357 = local299 + (this.aFloatArrayArray2[arg0 + 1][arg3 + 1] - local299) * local193;
			local122 = local290 + local201 * (local257 - local290);
			local108 = local315 + (local357 - local315) * local201;
		}
		local193 = this.aClass6_Sub17_1.anInt2314 - local10;
		local201 = this.aClass6_Sub17_1.anInt2316 - local25;
		local208 = this.aClass6_Sub17_1.anInt2317 - local19;
		local215 = (float) Math.sqrt((double) (local208 * local208 + local193 * local193 + local201 * local201));
		local222 = 1.0F / local215;
		local201 *= local222;
		local208 *= local222;
		local193 *= local222;
		local231 = local215 / (float) this.aClass6_Sub17_1.anInt2315;
		local240 = 1.0F - local231 * local231;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		local299 = local201 * local115 + local122 * local193 + local208 * local108;
		if (local299 < 0.0F) {
			local299 = 0.0F;
		}
		@Pc(536) float local536 = local240 * 2.0F * local299;
		if (local536 > 1.0F) {
			local536 = 1.0F;
		}
		@Pc(547) int local547 = this.aClass6_Sub17_1.anInt2319;
		@Pc(557) int local557 = (int) (local536 * (float) (local547 >> 16 & 0xFF));
		if (local557 > 255) {
			local557 = 255;
		}
		@Pc(572) int local572 = (int) ((float) (local547 >> 8 & 0xFF) * local536);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(587) int local587 = (int) (local536 * (float) (local547 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		if (this.aClass81_Sub1_30.aBoolean156) {
			this.aClass6_Sub10_Sub2_2.method4026((float) local10);
			this.aClass6_Sub10_Sub2_2.method4026((float) local25);
			this.aClass6_Sub10_Sub2_2.method4026((float) local19);
		} else {
			this.aClass6_Sub10_Sub2_2.method4027((float) local10);
			this.aClass6_Sub10_Sub2_2.method4027((float) local25);
			this.aClass6_Sub10_Sub2_2.method4027((float) local19);
		}
		this.aClass6_Sub10_Sub2_2.method3968(local557);
		this.aClass6_Sub10_Sub2_2.method3968(local572);
		this.aClass6_Sub10_Sub2_2.method3968(local587);
		this.aClass6_Sub10_Sub2_2.method3968(255);
		this.method4499(local75);
	}
}
