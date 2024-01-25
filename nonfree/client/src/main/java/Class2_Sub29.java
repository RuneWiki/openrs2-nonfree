import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	private int anInt4578;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
	private int anInt4583;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Lclient!hq;")
	private final Class2_Sub8 aClass2_Sub8_1;

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_24;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "Lclient!to;")
	private final Class149_Sub1 aClass149_Sub1_1;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	private final int anInt4579;

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
	private final int anInt4582;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
	private final int anInt4581;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
	private final int anInt4580;

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!vt;")
	private Class2_Sub24 aClass2_Sub24_4;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "Lclient!kc;")
	private Class2_Sub24_Sub1 aClass2_Sub24_Sub1_2;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "Lclient!wb;")
	private Class243 aClass243_16;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "Lclient!hs;")
	private final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "Lclient!eb;")
	private final Interface2 anInterface2_4;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "Lclient!fh;")
	private final Class75 aClass75_5;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "Lclient!fh;")
	private final Class75 aClass75_4;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!ic;Lclient!to;Lclient!hq;[I)V")
	public Class2_Sub29(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class149_Sub1 arg1, @OriginalArg(2) Class2_Sub8 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub8_1 = arg2;
		this.aClass48_Sub2_24 = arg0;
		this.aClass149_Sub1_1 = arg1;
		@Pc(19) int local19 = this.aClass2_Sub8_1.anInt1374 - (arg1.anInt6299 >> 1);
		this.anInt4579 = this.aClass2_Sub8_1.anInt1379 - local19 >> arg1.anInt6297;
		this.anInt4582 = this.aClass2_Sub8_1.anInt1379 + local19 >> arg1.anInt6297;
		this.anInt4581 = this.aClass2_Sub8_1.anInt1377 - local19 >> arg1.anInt6297;
		this.anInt4580 = this.aClass2_Sub8_1.anInt1377 + local19 >> arg1.anInt6297;
		@Pc(69) int local69 = this.anInt4582 + 1 - this.anInt4579;
		@Pc(77) int local77 = this.anInt4580 + 1 - this.anInt4581;
		this.aFloatArrayArray5 = new float[local69 + 1][local77 + 1];
		this.aFloatArrayArray4 = new float[local69 + 1][local77 + 1];
		this.aFloatArrayArray3 = new float[local69 + 1][local77 + 1];
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(164) int local164;
		@Pc(179) int local179;
		for (local106 = 0; local106 <= local77; local106++) {
			local114 = local106 + this.anInt4581;
			if (local114 > 0 && this.aClass149_Sub1_1.anInt6740 - 1 > local114) {
				for (local133 = 0; local133 <= local69; local133++) {
					local141 = local133 + this.anInt4579;
					if (local141 > 0 && this.aClass149_Sub1_1.anInt6741 - 1 > local141) {
						local164 = arg1.method5837(local141 + 1, local114) - arg1.method5837(local141 - 1, local114);
						local179 = arg1.method5837(local141, local114 + 1) - arg1.method5837(local141, local114 - 1);
						@Pc(194) float local194 = (float) (1.0D / Math.sqrt((double) (local164 * local164 + local179 * local179 + 65536)));
						this.aFloatArrayArray4[local133][local106] = (float) local164 * local194;
						this.aFloatArrayArray3[local133][local106] = -256.0F * local194;
						this.aFloatArrayArray5[local133][local106] = local194 * (float) local179;
					}
				}
			}
		}
		local106 = 0;
		local114 = 0;
		for (local133 = this.anInt4581; local133 <= this.anInt4580; local133++) {
			if (local133 >= 0 && arg1.anInt6740 > local133) {
				for (local141 = this.anInt4579; local141 <= this.anInt4582; local141++) {
					if (local141 >= 0 && arg1.anInt6741 > local141) {
						local164 = arg3[local114];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray10[local141][local133];
						if (local286 != null && local164 != 0) {
							if (local164 == 1) {
								local106 += local286.length;
							} else {
								local106 += 3;
							}
						}
					}
					local114++;
				}
			} else {
				local114 += this.anInt4582 - this.anInt4579;
			}
		}
		if (local106 > 0) {
			this.aClass2_Sub24_4 = new Class2_Sub24(local106 * 2);
			this.aClass2_Sub24_Sub1_2 = new Class2_Sub24_Sub1(local106 * 16);
			this.aClass243_16 = new Class243(Static279.method4638(local106));
			local114 = 0;
			local133 = 0;
			for (local141 = this.anInt4581; local141 <= this.anInt4580; local141++) {
				if (local141 >= 0 && arg1.anInt6740 > local141) {
					local164 = 0;
					for (local179 = this.anInt4579; local179 <= this.anInt4582; local179++) {
						if (local179 >= 0 && arg1.anInt6741 > local179) {
							@Pc(401) int local401 = arg3[local114];
							@Pc(408) int[] local408 = arg1.anIntArrayArrayArray10[local179][local141];
							@Pc(415) int[] local415 = arg1.anIntArrayArrayArray15[local179][local141];
							if (local408 != null && local401 != 0) {
								if (local401 == 1) {
									for (@Pc(568) int local568 = 0; local568 < local408.length; local568++) {
										this.method4126(local133, local164, local408[local568], local141, local415[local568], local179);
									}
								} else if (local401 == 3) {
									this.method4126(local133, local164, 0, local141, 0, local179);
									this.method4126(local133, local164, arg1.anInt6299, local141, 0, local179);
									this.method4126(local133, local164, 0, local141, arg1.anInt6299, local179);
								} else if (local401 == 2) {
									this.method4126(local133, local164, arg1.anInt6299, local141, 0, local179);
									this.method4126(local133, local164, arg1.anInt6299, local141, arg1.anInt6299, local179);
									this.method4126(local133, local164, 0, local141, 0, local179);
								} else if (local401 == 5) {
									this.method4126(local133, local164, arg1.anInt6299, local141, arg1.anInt6299, local179);
									this.method4126(local133, local164, 0, local141, arg1.anInt6299, local179);
									this.method4126(local133, local164, arg1.anInt6299, local141, 0, local179);
								} else if (local401 == 4) {
									this.method4126(local133, local164, 0, local141, arg1.anInt6299, local179);
									this.method4126(local133, local164, 0, local141, 0, local179);
									this.method4126(local133, local164, arg1.anInt6299, local141, arg1.anInt6299, local179);
								}
							}
						}
						local114++;
						local164++;
					}
				} else {
					local114 += this.anInt4582 - this.anInt4579;
				}
				local133++;
			}
			this.anInterface6_3 = this.aClass48_Sub2_24.method2598(this.aClass2_Sub24_4.aByteArray100, this.aClass2_Sub24_4.anInt6669, false);
			this.anInterface2_4 = this.aClass48_Sub2_24.method2564(16, this.aClass2_Sub24_Sub1_2.aByteArray100, this.aClass2_Sub24_Sub1_2.anInt6669, false);
			this.aClass75_5 = new Class75(this.aClass48_Sub2_24, this.anInterface2_4, 5126, 3, 0);
			this.aClass75_4 = new Class75(this.aClass48_Sub2_24, this.anInterface2_4, 5121, 4, 12);
		} else {
			this.anInterface2_4 = null;
			this.anInterface6_3 = null;
			this.aClass75_4 = null;
			this.aClass75_5 = null;
		}
		this.aClass2_Sub24_Sub1_2 = null;
		this.aClass243_16 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray5 = null;
		this.aClass2_Sub24_4 = null;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB[[ZII)V")
	public void method4125(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface6_3 == null || (this.anInt4579 > arg3 + arg0 || (this.anInt4582 < arg0 - arg3 || (this.anInt4581 > arg3 + arg2 || arg2 - arg3 > this.anInt4580)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt4581; local54 <= this.anInt4580; local54++) {
			for (@Pc(61) int local61 = this.anInt4579; local61 <= this.anInt4582; local61++) {
				@Pc(70) int local70 = local61 - arg0;
				@Pc(75) int local75 = local54 - arg2;
				if (local70 > -arg3 && arg3 > local70 && -arg3 < local75 && arg3 > local75 && arg1[arg3 + local70][arg3 + local75]) {
					this.aClass48_Sub2_24.method2585((int) (this.aClass2_Sub8_1.aFloat7 * 255.0F) << 24);
					this.aClass48_Sub2_24.method2586(this.aClass75_5, null, this.aClass75_4, null);
					this.aClass48_Sub2_24.method2580(this.anInterface6_3, 0, this.anInt4578);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V")
	private void method4126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg5 << this.aClass149_Sub1_1.anInt6297) + arg2;
		@Pc(17) int local17 = arg4 + (arg3 << this.aClass149_Sub1_1.anInt6297);
		@Pc(23) int local23 = this.aClass149_Sub1_1.method5839(local9, local17);
		if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(56) Class2 local56 = this.aClass243_16.method5967(local1);
			if (local56 != null) {
				this.method4127(((Class2_Sub3) local56).aShort4);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt4583++;
		if (local1 != -1L) {
			this.aClass243_16.method5968(local1, new Class2_Sub3(local76));
		}
		@Pc(289) float local289;
		@Pc(297) float local297;
		@Pc(323) float local323;
		@Pc(143) float local143;
		@Pc(151) float local151;
		@Pc(158) float local158;
		@Pc(165) float local165;
		@Pc(172) float local172;
		@Pc(181) float local181;
		@Pc(190) float local190;
		@Pc(216) float local216;
		if (arg2 == 0 && arg4 == 0) {
			local289 = this.aFloatArrayArray4[arg1][arg0];
			local323 = this.aFloatArrayArray5[arg1][arg0];
			local297 = this.aFloatArrayArray3[arg1][arg0];
		} else if (this.aClass149_Sub1_1.anInt6299 == arg2 && arg4 == 0) {
			local323 = this.aFloatArrayArray5[arg1 + 1][arg0];
			local297 = this.aFloatArrayArray3[arg1 + 1][arg0];
			local289 = this.aFloatArrayArray4[arg1 + 1][arg0];
		} else if (this.aClass149_Sub1_1.anInt6299 == arg2 && this.aClass149_Sub1_1.anInt6299 == arg4) {
			local323 = this.aFloatArrayArray5[arg1 + 1][arg0 + 1];
			local289 = this.aFloatArrayArray4[arg1 + 1][arg0 + 1];
			local297 = this.aFloatArrayArray3[arg1 + 1][arg0 + 1];
		} else if (arg2 == 0 && arg4 == this.aClass149_Sub1_1.anInt6299) {
			local289 = this.aFloatArrayArray4[arg1][arg0 + 1];
			local297 = this.aFloatArrayArray3[arg1][arg0 + 1];
			local323 = this.aFloatArrayArray5[arg1][arg0 + 1];
		} else {
			local143 = (float) arg2 / (float) this.aClass149_Sub1_1.anInt6299;
			local151 = (float) arg4 / (float) this.aClass149_Sub1_1.anInt6299;
			local158 = this.aFloatArrayArray4[arg1][arg0];
			local165 = this.aFloatArrayArray3[arg1][arg0];
			local172 = this.aFloatArrayArray5[arg1][arg0];
			local181 = this.aFloatArrayArray4[arg1 + 1][arg0];
			local190 = this.aFloatArrayArray3[arg1 + 1][arg0];
			@Pc(207) float local207 = local181 + local143 * (this.aFloatArrayArray4[arg1 + 1][arg0 + 1] - local181);
			local216 = this.aFloatArrayArray5[arg1 + 1][arg0];
			@Pc(232) float local232 = local158 + (this.aFloatArrayArray4[arg1][arg0 + 1] - local158) * local143;
			@Pc(250) float local250 = local190 + local143 * (this.aFloatArrayArray3[arg1 + 1][arg0 + 1] - local190);
			@Pc(265) float local265 = local165 + local143 * (this.aFloatArrayArray3[arg1][arg0 + 1] - local165);
			@Pc(281) float local281 = local172 + (this.aFloatArrayArray5[arg1][arg0 + 1] - local172) * local143;
			local289 = local151 * (local207 - local232) + local232;
			local297 = local265 + local151 * (local250 - local265);
			@Pc(314) float local314 = local216 + (this.aFloatArrayArray5[arg1 + 1][arg0 + 1] - local216) * local143;
			local323 = local151 * (local314 - local281) + local281;
		}
		local143 = this.aClass2_Sub8_1.anInt1379 - local9;
		local151 = this.aClass2_Sub8_1.anInt1375 - local23;
		local158 = this.aClass2_Sub8_1.anInt1377 - local17;
		local165 = (float) Math.sqrt((double) (local158 * local158 + local151 * local151 + local143 * local143));
		local172 = 1.0F / local165;
		local158 *= local172;
		local151 *= local172;
		local143 *= local172;
		local181 = local165 / (float) this.aClass2_Sub8_1.anInt1374;
		local190 = 1.0F - local181 * local181;
		if (local190 < 0.0F) {
			local190 = 0.0F;
		}
		local216 = local151 * local297 + local143 * local289 + local158 * local323;
		if (local216 < 0.0F) {
			local216 = 0.0F;
		}
		@Pc(534) float local534 = local216 * 2.0F * local190;
		if (local534 > 1.0F) {
			local534 = 1.0F;
		}
		@Pc(545) int local545 = this.aClass2_Sub8_1.anInt1378;
		@Pc(555) int local555 = (int) (local534 * (float) (local545 >> 16 & 0xFF));
		if (local555 > 255) {
			local555 = 255;
		}
		@Pc(577) int local577 = (int) (local534 * (float) (local545 >> 8 & 0xFF));
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(592) int local592 = (int) (local534 * (float) (local545 & 0xFF));
		if (this.aClass48_Sub2_24.aBoolean218) {
			this.aClass2_Sub24_Sub1_2.method3242((float) local9);
			this.aClass2_Sub24_Sub1_2.method3242((float) local23);
			this.aClass2_Sub24_Sub1_2.method3242((float) local17);
		} else {
			this.aClass2_Sub24_Sub1_2.method3241((float) local9);
			this.aClass2_Sub24_Sub1_2.method3241((float) local23);
			this.aClass2_Sub24_Sub1_2.method3241((float) local17);
		}
		if (local592 > 255) {
			local592 = 255;
		}
		this.aClass2_Sub24_Sub1_2.method5746(local555);
		this.aClass2_Sub24_Sub1_2.method5746(local577);
		this.aClass2_Sub24_Sub1_2.method5746(local592);
		this.aClass2_Sub24_Sub1_2.method5746(255);
		this.method4127(local76);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BS)V")
	private void method4127(@OriginalArg(1) short arg0) {
		if (this.aClass48_Sub2_24.aBoolean218) {
			this.aClass2_Sub24_4.method5721(arg0);
		} else {
			this.aClass2_Sub24_4.method5717(arg0);
		}
		this.anInt4578++;
	}
}
