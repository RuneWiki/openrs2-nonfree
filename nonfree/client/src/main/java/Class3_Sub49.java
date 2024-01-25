import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	private int anInt9454;

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "Lclient!qq;")
	private final Class35_Sub3 aClass35_Sub3_3;

	@OriginalMember(owner = "client!tl", name = "C", descriptor = "Lclient!uaa;")
	private final Class3_Sub13 aClass3_Sub13_2;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_21;

	@OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
	private final int anInt9459;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
	private final int anInt9458;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
	private final int anInt9461;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	private final int anInt9452;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	private int anInt9456;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "Lclient!km;")
	private final Interface15 anInterface15_13;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!ra;")
	private final Interface22 anInterface22_6;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "Lclient!tca;")
	private Class333 aClass333_40;

	@OriginalMember(owner = "client!tl", name = "I", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!ee;Lclient!qq;Lclient!uaa;[I)V")
	public Class3_Sub49(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class35_Sub3 arg1, @OriginalArg(2) Class3_Sub13 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass35_Sub3_3 = arg1;
		this.aClass3_Sub13_2 = arg2;
		this.aClass95_Sub1_21 = arg0;
		@Pc(22) int local22 = this.aClass3_Sub13_2.method5962() - (arg1.anInt9152 >> 1);
		this.anInt9459 = this.aClass3_Sub13_2.method5958() - local22 >> arg1.anInt9154;
		this.anInt9458 = local22 + this.aClass3_Sub13_2.method5958() >> arg1.anInt9154;
		this.anInt9461 = this.aClass3_Sub13_2.method5960() - local22 >> arg1.anInt9154;
		this.anInt9452 = local22 + this.aClass3_Sub13_2.method5960() >> arg1.anInt9154;
		@Pc(76) int local76 = this.anInt9458 + 1 - this.anInt9459;
		@Pc(85) int local85 = this.anInt9452 + 1 - this.anInt9461;
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray10 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray11 = new float[local76 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(169) int local169;
		@Pc(186) int local186;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt9461;
			if (local122 > 0 && local122 < this.aClass35_Sub3_3.anInt9148 - 1) {
				for (local133 = 0; local133 <= local76; local133++) {
					local140 = this.anInt9459 + local133;
					if (local140 > 0 && this.aClass35_Sub3_3.anInt9149 - 1 > local140) {
						local169 = arg1.method7461(local122, local140 + 1) - arg1.method7461(local122, local140 - 1);
						local186 = arg1.method7461(local122 + 1, local140) - arg1.method7461(local122 - 1, local140);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local169 * local169 + local186 * local186 + 65536)));
						this.aFloatArrayArray10[local133][local114] = local202 * (float) local169;
						this.aFloatArrayArray11[local133][local114] = local202 * -256.0F;
						this.aFloatArrayArray9[local133][local114] = (float) local186 * local202;
					}
				}
			}
		}
		local122 = 0;
		@Pc(286) int local286;
		for (local133 = this.anInt9461; local133 <= this.anInt9452; local133++) {
			if (local133 >= 0 && arg1.anInt9148 > local133) {
				for (local140 = this.anInt9459; local140 <= this.anInt9458; local140++) {
					if (local140 >= 0 && arg1.anInt9149 > local140) {
						local169 = arg3[local122];
						@Pc(274) int[] local274 = arg1.anIntArrayArrayArray11[local140][local133];
						if (local274 != null && local169 != 0) {
							if (local169 == 1) {
								local286 = 0;
								while (local286 < local274.length) {
									if (local274[local286++] != -1 && local274[local286++] != -1 && local274[local286++] != -1) {
										this.anInt9456 += 3;
									}
								}
							} else {
								this.anInt9456 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt9458 - this.anInt9459;
			}
		}
		if (this.anInt9456 <= 0) {
			this.anInterface15_13 = null;
			this.anInterface22_6 = null;
		} else {
			this.aClass333_40 = new Class333(Static585.method7772(this.anInt9456));
			this.anInterface22_6 = this.aClass95_Sub1_21.method8115(false);
			this.anInterface22_6.method7408(this.anInt9456);
			@Pc(402) NativeHeapBuffer local402 = this.aClass95_Sub1_21.method8074(false, this.anInt9456 * 16);
			this.aStream5 = new Stream(local402);
			while (true) {
				@Pc(414) Buffer local414;
				do {
					local414 = this.anInterface22_6.method7405();
				} while (local414 == null);
				this.aStream6 = new Stream(local414);
				local122 = 0;
				local186 = 0;
				for (local286 = this.anInt9461; local286 <= this.anInt9452; local286++) {
					if (local286 >= 0 && local286 < arg1.anInt9148) {
						@Pc(446) int local446 = 0;
						for (@Pc(449) int local449 = this.anInt9459; local449 <= this.anInt9458; local449++) {
							if (local449 >= 0 && local449 < arg1.anInt9149) {
								@Pc(464) int local464 = arg3[local122];
								@Pc(471) int[] local471 = arg1.anIntArrayArrayArray11[local449][local286];
								if (local471 != null && local464 != 0) {
									if (local464 == 1) {
										@Pc(490) int[] local490 = arg1.anIntArrayArrayArray13[local449][local286];
										@Pc(497) int[] local497 = arg1.anIntArrayArrayArray15[local449][local286];
										@Pc(499) int local499 = 0;
										label120: while (true) {
											while (true) {
												if (local499 >= local471.length) {
													break label120;
												}
												if (local471[local499] == -1 || local471[local499 + 1] == -1 || local471[local499 + 2] == -1) {
													local499 += 3;
												} else {
													this.method7719(local449, local446, local286, local186, local497[local499], local490[local499]);
													local499++;
													this.method7719(local449, local446, local286, local186, local497[local499], local490[local499]);
													local499++;
													this.method7719(local449, local446, local286, local186, local497[local499], local490[local499]);
													local499++;
												}
											}
										}
									} else if (local464 == 3) {
										this.method7719(local449, local446, local286, local186, 0, 0);
										this.method7719(local449, local446, local286, local186, 0, arg1.anInt9152);
										this.method7719(local449, local446, local286, local186, arg1.anInt9152, 0);
									} else if (local464 == 2) {
										this.method7719(local449, local446, local286, local186, 0, arg1.anInt9152);
										this.method7719(local449, local446, local286, local186, arg1.anInt9152, arg1.anInt9152);
										this.method7719(local449, local446, local286, local186, 0, 0);
									} else if (local464 == 5) {
										this.method7719(local449, local446, local286, local186, arg1.anInt9152, arg1.anInt9152);
										this.method7719(local449, local446, local286, local186, arg1.anInt9152, 0);
										this.method7719(local449, local446, local286, local186, 0, arg1.anInt9152);
									} else if (local464 == 4) {
										this.method7719(local449, local446, local286, local186, arg1.anInt9152, 0);
										this.method7719(local449, local446, local286, local186, 0, 0);
										this.method7719(local449, local446, local286, local186, arg1.anInt9152, arg1.anInt9152);
									}
								}
							}
							local122++;
							local446++;
						}
					} else {
						local122 += this.anInt9458 - this.anInt9459;
					}
					local186++;
				}
				this.aStream6.a();
				if (this.anInterface22_6.method7407()) {
					this.aStream5.a();
					this.anInterface15_13 = this.aClass95_Sub1_21.method8090(false);
					this.anInterface15_13.method5527(16, local402, this.anInt9454 * 16);
					break;
				}
				this.aStream5.d(0);
				this.aClass333_40.method7485();
			}
		}
		this.aStream6 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray11 = this.aFloatArrayArray9 = null;
		this.aStream5 = null;
		this.aClass333_40 = null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIII)V")
	private void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg0 << this.aClass35_Sub3_3.anInt9154);
		@Pc(23) int local23 = arg4 + (arg2 << this.aClass35_Sub3_3.anInt9154);
		@Pc(30) int local30 = this.aClass35_Sub3_3.method7452(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(58) Class3 local58 = this.aClass333_40.method7489(local7);
			if (local58 != null) {
				this.method7722(((Class3_Sub29) local58).aShort48);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt9454++;
		if (local7 != -1L) {
			this.aClass333_40.method7488(local7, new Class3_Sub29(local76));
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
		@Pc(280) float local280;
		if (arg5 == 0 && arg4 == 0) {
			local164 = this.aFloatArrayArray10[arg1][arg3];
			local146 = this.aFloatArrayArray9[arg1][arg3];
			local155 = this.aFloatArrayArray11[arg1][arg3];
		} else if (this.aClass35_Sub3_3.anInt9152 == arg5 && arg4 == 0) {
			local155 = this.aFloatArrayArray11[arg1 + 1][arg3];
			local146 = this.aFloatArrayArray9[arg1 + 1][arg3];
			local164 = this.aFloatArrayArray10[arg1 + 1][arg3];
		} else if (arg5 == this.aClass35_Sub3_3.anInt9152 && arg4 == this.aClass35_Sub3_3.anInt9152) {
			local155 = this.aFloatArrayArray11[arg1 + 1][arg3 + 1];
			local146 = this.aFloatArrayArray9[arg1 + 1][arg3 + 1];
			local164 = this.aFloatArrayArray10[arg1 + 1][arg3 + 1];
		} else if (arg5 == 0 && arg4 == this.aClass35_Sub3_3.anInt9152) {
			local146 = this.aFloatArrayArray9[arg1][arg3 + 1];
			local155 = this.aFloatArrayArray11[arg1][arg3 + 1];
			local164 = this.aFloatArrayArray10[arg1][arg3 + 1];
		} else {
			local174 = (float) arg5 / (float) this.aClass35_Sub3_3.anInt9152;
			local182 = (float) arg4 / (float) this.aClass35_Sub3_3.anInt9152;
			local189 = this.aFloatArrayArray10[arg1][arg3];
			local196 = this.aFloatArrayArray11[arg1][arg3];
			local203 = this.aFloatArrayArray9[arg1][arg3];
			local212 = this.aFloatArrayArray10[arg1 + 1][arg3];
			local221 = this.aFloatArrayArray11[arg1 + 1][arg3];
			@Pc(238) float local238 = local221 + local174 * (this.aFloatArrayArray11[arg1 + 1][arg3 + 1] - local221);
			@Pc(253) float local253 = local203 + (this.aFloatArrayArray9[arg1][arg3 + 1] - local203) * local174;
			@Pc(271) float local271 = local212 + local174 * (this.aFloatArrayArray10[arg1 + 1][arg3 + 1] - local212);
			local280 = this.aFloatArrayArray9[arg1 + 1][arg3];
			@Pc(295) float local295 = local189 + local174 * (this.aFloatArrayArray10[arg1][arg3 + 1] - local189);
			@Pc(311) float local311 = local196 + (this.aFloatArrayArray11[arg1][arg3 + 1] - local196) * local174;
			local164 = local295 + local182 * (local271 - local295);
			@Pc(338) float local338 = local280 + (this.aFloatArrayArray9[arg1 + 1][arg3 + 1] - local280) * local174;
			local155 = local311 + (local238 - local311) * local182;
			local146 = local253 + local182 * (local338 - local253);
		}
		local174 = (float) (this.aClass3_Sub13_2.method5958() - local15);
		local182 = (float) (this.aClass3_Sub13_2.method5963() - local30);
		local189 = (float) (this.aClass3_Sub13_2.method5960() - local23);
		local196 = (float) Math.sqrt((double) (local189 * local189 + local174 * local174 + local182 * local182));
		local203 = 1.0F / local196;
		local182 *= local203;
		local174 *= local203;
		local189 *= local203;
		local212 = local196 / (float) this.aClass3_Sub13_2.method5962();
		local221 = 1.0F - local212 * local212;
		if (local221 < 0.0F) {
			local221 = 0.0F;
		}
		local280 = local189 * local146 + local174 * local164 + local182 * local155;
		if (local280 < 0.0F) {
			local280 = 0.0F;
		}
		@Pc(543) float local543 = local280 * local221 * 2.0F;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass3_Sub13_2.method5957();
		@Pc(564) int local564 = (int) (local543 * (float) (local554 >> 16 & 0xFF));
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(581) int local581 = (int) ((float) (local554 >> 8 & 0xFF) * local543);
		if (local581 > 255) {
			local581 = 255;
		}
		@Pc(596) int local596 = (int) ((float) (local554 & 0xFF) * local543);
		if (local596 > 255) {
			local596 = 255;
		}
		if (Stream.b()) {
			this.aStream5.a((float) local15);
			this.aStream5.a((float) local30);
			this.aStream5.a((float) local23);
		} else {
			this.aStream5.b((float) local15);
			this.aStream5.b((float) local30);
			this.aStream5.b((float) local23);
		}
		if (this.aClass95_Sub1_21.anInt10057 == 0) {
			this.aStream5.c(local596);
			this.aStream5.c(local581);
			this.aStream5.c(local564);
		} else {
			this.aStream5.c(local564);
			this.aStream5.c(local581);
			this.aStream5.c(local596);
		}
		this.aStream5.c(255);
		this.method7722(local76);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III[[ZI)V")
	public void method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface22_6 == null || (this.anInt9459 > arg2 + arg1 || (arg2 - arg1 > this.anInt9458 || (this.anInt9461 > arg1 + arg0 || arg0 - arg1 > this.anInt9452)))) {
			return;
		}
		for (@Pc(43) int local43 = this.anInt9461; local43 <= this.anInt9452; local43++) {
			for (@Pc(53) int local53 = this.anInt9459; local53 <= this.anInt9458; local53++) {
				@Pc(60) int local60 = local53 - arg2;
				@Pc(65) int local65 = local43 - arg0;
				if (local60 > -arg1 && local60 < arg1 && local65 > -arg1 && arg1 > local65 && arg3[local60 + arg1][local65 + arg1]) {
					this.aClass95_Sub1_21.method8198((byte) (int) (this.aClass3_Sub13_2.method5961() * 255.0F));
					this.aClass95_Sub1_21.method8133(this.anInterface15_13, 0);
					this.aClass95_Sub1_21.method8166(this.aClass95_Sub1_21.aClass94_17);
					this.aClass95_Sub1_21.method8109(this.anInt9456 / 3, 0, this.anInt9454, Static649.aClass115_6, 0, this.anInterface22_6);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(SB)V")
	private void method7722(@OriginalArg(0) short arg0) {
		if (Stream.b()) {
			this.aStream6.a(arg0);
		} else {
			this.aStream6.e(arg0);
		}
	}
}
