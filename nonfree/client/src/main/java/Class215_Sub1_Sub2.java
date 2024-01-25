import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class215_Sub1_Sub2 extends Class215_Sub1 {

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!et;IIII[[I[[II)V")
	public Class215_Sub1_Sub2(@OriginalArg(0) Class42_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ft;[I[III[I[I)V")
	private void method7845(@OriginalArg(1) Class107 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class263 local12 = super.aClass263ArrayArray3[arg3][arg4];
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(268) int local268;
		@Pc(334) int local334;
		@Pc(376) int local376;
		@Pc(460) int local460;
		@Pc(471) int local471;
		@Pc(237) int local237;
		@Pc(290) int local290;
		@Pc(354) int local354;
		@Pc(418) int local418;
		@Pc(257) int local257;
		@Pc(323) int local323;
		@Pc(397) int local397;
		@Pc(449) int local449;
		@Pc(98) int local98;
		@Pc(97) int local97;
		@Pc(95) int local95;
		@Pc(93) int local93;
		@Pc(84) int local84;
		@Pc(301) int local301;
		@Pc(365) int local365;
		@Pc(429) int local429;
		if (local12 == null) {
			@Pc(1109) Class289 local1109 = super.aClass289ArrayArray3[arg3][arg4];
			if (local1109 != null) {
				@Pc(1135) short local1135;
				if (super.anInt9463 == -1) {
					for (local460 = 0; local460 < local1109.aShort107; local460++) {
						local33 = local1109.aShortArray117[local460] + (arg3 << super.anInt9453);
						local1135 = local1109.aShortArray121[local460];
						local43 = local1109.aShortArray120[local460] + (arg4 << super.anInt9453);
						local376 = (super.anInt9460 * local43 + super.anInt9462 * local33 + super.anInt9467 * local1135 >> 15) + super.anInt9454;
						if (super.aClass42_Sub2_18.anInt5338 >= local376) {
							return;
						}
						local268 = (local33 * super.anInt9464 + local1135 * super.anInt9465 + super.anInt9455 * local43 >> 15) + super.anInt9461;
						local334 = super.anInt9459 + (super.anInt9457 * local43 + super.anInt9458 * local33 + super.anInt9456 * local1135 >> 15);
						arg6[local460] = arg0.anInt3203 + local268 * super.aClass42_Sub2_18.anInt5356 / local376;
						arg1[local460] = arg0.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local334 / local376;
						arg2[local460] = local376;
					}
				} else {
					for (local460 = 0; local460 < local1109.aShort107; local460++) {
						local33 = local1109.aShortArray117[local460] + (arg3 << super.anInt9453);
						local1135 = local1109.aShortArray121[local460];
						local43 = local1109.aShortArray120[local460] + (arg4 << super.anInt9453);
						local268 = super.anInt9461 + (super.anInt9464 * local33 + local1135 * super.anInt9465 + super.anInt9455 * local43 >> 15);
						local334 = super.anInt9459 + (local43 * super.anInt9457 + local1135 * super.anInt9456 + super.anInt9458 * local33 >> 15);
						arg6[local460] = super.aClass42_Sub2_18.anInt5356 * local268 / super.anInt9463 + arg0.anInt3203;
						arg1[local460] = arg0.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local334 / super.anInt9463;
						arg2[local460] = super.anInt9463;
					}
				}
				if (local1109.aShortArray119 == null) {
					for (local460 = 0; local460 < local1109.aShort106; local460++) {
						@Pc(1383) short local1383 = local1109.aShortArray123[local460];
						@Pc(1388) short local1388 = local1109.aShortArray124[local460];
						@Pc(1393) short local1393 = local1109.aShortArray125[local460];
						local471 = arg6[local1383];
						local237 = arg6[local1388];
						local290 = arg6[local1393];
						local354 = arg1[local1383];
						local418 = arg1[local1388];
						local257 = arg1[local1393];
						if (-((local354 - local418) * (-local237 + local290)) + (local257 - local418) * (local471 - local237) > 0) {
							local323 = local1109.anIntArray648[local460];
							if (local323 != -1) {
								arg0.aBoolean258 = local471 < 0 || local237 < 0 || local290 < 0 || local471 > arg0.anInt3205 || local237 > arg0.anInt3205 || local290 > arg0.anInt3205;
								arg0.method2888(local354, local418, local257, local471, local237, local290, arg2[1], arg2[2], arg2[3], Static282.method4653(local323, local1109.aShortArray122[local1383]), Static282.method4653(local323, local1109.aShortArray122[local1388]), Static282.method4653(local323, local1109.aShortArray122[local1393]));
							}
						}
					}
				} else {
					local460 = super.anIntArrayArray86[arg3][arg4];
					local301 = super.anIntArrayArray86[arg3 + 1][arg4];
					local365 = super.anIntArrayArray86[arg3][arg4 + 1];
					local429 = arg3 * super.anInt9451;
					local471 = super.anInt9451 + local429;
					local237 = super.anInt9451 * arg4;
					local290 = super.anInt9451 + local237;
					local354 = (super.anInt9465 * local460 + super.anInt9464 * local429 + super.anInt9455 * local237 >> 15) + super.anInt9461;
					local418 = super.anInt9459 + (super.anInt9458 * local429 + local460 * super.anInt9456 + super.anInt9457 * local237 >> 15);
					local257 = (super.anInt9460 * local237 + local429 * super.anInt9462 + super.anInt9467 * local460 >> 15) + super.anInt9454;
					local323 = (local471 * super.anInt9464 + local301 * super.anInt9465 + local237 * super.anInt9455 >> 15) + super.anInt9461;
					local397 = super.anInt9459 + (local301 * super.anInt9456 + super.anInt9458 * local471 + local237 * super.anInt9457 >> 15);
					local449 = (super.anInt9460 * local237 + local301 * super.anInt9467 + local471 * super.anInt9462 >> 15) + super.anInt9454;
					local98 = (super.anInt9464 * local429 + super.anInt9465 * local365 + local290 * super.anInt9455 >> 15) + super.anInt9461;
					local97 = (local290 * super.anInt9457 + local429 * super.anInt9458 + super.anInt9456 * local365 >> 15) + super.anInt9459;
					local95 = (super.anInt9460 * local290 + super.anInt9467 * local365 + super.anInt9462 * local429 >> 15) + super.anInt9454;
					for (local93 = 0; local93 < local1109.aShort106; local93++) {
						@Pc(1767) short local1767 = local1109.aShortArray123[local93];
						@Pc(1772) short local1772 = local1109.aShortArray124[local93];
						@Pc(1777) short local1777 = local1109.aShortArray125[local93];
						local84 = arg6[local1767];
						@Pc(1785) int local1785 = arg6[local1772];
						@Pc(1789) int local1789 = arg6[local1777];
						@Pc(1793) int local1793 = arg1[local1767];
						@Pc(1797) int local1797 = arg1[local1772];
						@Pc(1801) int local1801 = arg1[local1777];
						if ((local84 - local1785) * (local1801 + -local1797) - (local1789 - local1785) * (local1793 + -local1797) > 0) {
							arg0.aBoolean258 = local84 < 0 || local1785 < 0 || local1789 < 0 || arg0.anInt3205 < local84 || local1785 > arg0.anInt3205 || local1789 > arg0.anInt3205;
							@Pc(1870) short local1870 = local1109.aShortArray119[local93];
							if (local1870 == -1) {
								@Pc(1926) int local1926 = local1109.anIntArray648[local93];
								if (local1926 != -1) {
									arg0.method2888(local1793, local1797, local1801, local84, local1785, local1789, arg2[1], arg2[2], arg2[3], Static282.method4653(local1926, local1109.aShortArray122[local1767]), Static282.method4653(local1926, local1109.aShortArray122[local1772]), Static282.method4653(local1926, local1109.aShortArray122[local1777]));
								}
							} else {
								if (this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local1870).aByte87)) {
									arg0.anInt3206 = 100;
								}
								arg0.method2885(local1793, local1797, local1801, local84, local1785, local1789, local1109.aShortArray122[local1767], local1109.aShortArray122[local1772], local1109.aShortArray122[local1777], local354, local323, local98, local418, local397, local97, local257, local449, local95, local1870);
								arg0.anInt3206 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte81 & 0x2) == 0) {
			@Pc(28) int local28 = arg3 * super.anInt9451;
			local33 = super.anInt9451 + local28;
			@Pc(38) int local38 = arg4 * super.anInt9451;
			local43 = super.anInt9451 + local38;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(75) int local75;
			if ((local12.aByte81 & 0x1) == 0) {
				local55 = super.anIntArrayArray86[arg3][arg4];
				local64 = super.anIntArrayArray86[arg3 + 1][arg4];
				local75 = super.anIntArrayArray86[arg3 + 1][arg4 + 1];
				local84 = super.anIntArrayArray86[arg3][arg4 + 1];
				if (super.anInt9463 == -1) {
					local98 = super.anInt9454 + (super.anInt9460 * local38 + super.anInt9467 * local55 + super.anInt9462 * local28 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local98) {
						return;
					}
					local97 = super.anInt9454 + (local33 * super.anInt9462 + local64 * super.anInt9467 + local38 * super.anInt9460 >> 15);
					if (local97 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local95 = super.anInt9454 + (super.anInt9467 * local75 + super.anInt9462 * local33 + super.anInt9460 * local43 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local95) {
						return;
					}
					local93 = super.anInt9454 + (local43 * super.anInt9460 + super.anInt9462 * local28 + super.anInt9467 * local84 >> 15);
					if (local93 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
				} else {
					local93 = super.anInt9463;
					local95 = super.anInt9463;
					local97 = super.anInt9463;
					local98 = super.anInt9463;
				}
				local237 = super.anInt9461 + (super.anInt9455 * local38 + super.anInt9465 * local55 + local28 * super.anInt9464 >> 15);
				local257 = super.anInt9459 + (super.anInt9457 * local38 + super.anInt9458 * local28 + super.anInt9456 * local55 >> 15);
				local268 = arg0.anInt3203 + super.aClass42_Sub2_18.anInt5356 * local237 / local98;
				local290 = super.anInt9461 + (super.anInt9455 * local38 + local33 * super.anInt9464 + super.anInt9465 * local64 >> 15);
				local301 = super.aClass42_Sub2_18.anInt5350 * local257 / local98 + arg0.anInt3204;
				local323 = (super.anInt9458 * local33 + local64 * super.anInt9456 + super.anInt9457 * local38 >> 15) + super.anInt9459;
				local334 = super.aClass42_Sub2_18.anInt5356 * local290 / local97 + arg0.anInt3203;
				local354 = (super.anInt9455 * local43 + super.anInt9464 * local33 + super.anInt9465 * local75 >> 15) + super.anInt9461;
				local365 = local323 * super.aClass42_Sub2_18.anInt5350 / local97 + arg0.anInt3204;
				local376 = super.aClass42_Sub2_18.anInt5356 * local354 / local95 + arg0.anInt3203;
				local397 = (super.anInt9458 * local33 + local75 * super.anInt9456 + super.anInt9457 * local43 >> 15) + super.anInt9459;
				local418 = super.anInt9461 + (super.anInt9455 * local43 + local28 * super.anInt9464 + super.anInt9465 * local84 >> 15);
				local429 = arg0.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local397 / local95;
				local449 = (super.anInt9457 * local43 + super.anInt9458 * local28 + super.anInt9456 * local84 >> 15) + super.anInt9459;
				local460 = local418 * super.aClass42_Sub2_18.anInt5356 / local93 + arg0.anInt3203;
				local471 = super.aClass42_Sub2_18.anInt5350 * local449 / local93 + arg0.anInt3204;
			} else {
				local55 = super.anIntArrayArray86[arg3][arg4];
				if (super.anInt9463 == -1) {
					local64 = super.anInt9467 * local55;
					local98 = (super.anInt9460 * local38 + local64 + local28 * super.anInt9462 >> 15) + super.anInt9454;
					if (super.aClass42_Sub2_18.anInt5338 >= local98) {
						return;
					}
					local97 = super.anInt9454 + (super.anInt9460 * local38 + local33 * super.anInt9462 + local64 >> 15);
					if (local97 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local95 = super.anInt9454 + (local64 + local33 * super.anInt9462 + local43 * super.anInt9460 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local95) {
						return;
					}
					local93 = super.anInt9454 + (super.anInt9460 * local43 + local64 + super.anInt9462 * local28 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local93) {
						return;
					}
				} else {
					local93 = super.anInt9463;
					local95 = super.anInt9463;
					local97 = super.anInt9463;
					local98 = super.anInt9463;
				}
				local64 = local55 * super.anInt9465;
				local75 = super.anInt9456 * local55;
				local237 = (local28 * super.anInt9464 + local64 + super.anInt9455 * local38 >> 15) + super.anInt9461;
				local268 = super.aClass42_Sub2_18.anInt5356 * local237 / local98 + arg0.anInt3203;
				local257 = super.anInt9459 + (local75 + super.anInt9458 * local28 + local38 * super.anInt9457 >> 15);
				local301 = arg0.anInt3204 + local257 * super.aClass42_Sub2_18.anInt5350 / local98;
				local290 = super.anInt9461 + (super.anInt9455 * local38 + local33 * super.anInt9464 + local64 >> 15);
				local334 = super.aClass42_Sub2_18.anInt5356 * local290 / local97 + arg0.anInt3203;
				local323 = (local75 + local33 * super.anInt9458 + local38 * super.anInt9457 >> 15) + super.anInt9459;
				local365 = arg0.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local323 / local97;
				local354 = (local43 * super.anInt9455 + local64 + local33 * super.anInt9464 >> 15) + super.anInt9461;
				local397 = (super.anInt9458 * local33 + local75 + local43 * super.anInt9457 >> 15) + super.anInt9459;
				local376 = local354 * super.aClass42_Sub2_18.anInt5356 / local95 + arg0.anInt3203;
				local418 = (super.anInt9455 * local43 + local64 + super.anInt9464 * local28 >> 15) + super.anInt9461;
				local429 = arg0.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local397 / local95;
				local449 = super.anInt9459 + (local28 * super.anInt9458 + local75 + local43 * super.anInt9457 >> 15);
				local460 = local418 * super.aClass42_Sub2_18.anInt5356 / local93 + arg0.anInt3203;
				local471 = arg0.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local449 / local93;
			}
			if ((local376 - local460) * (-local471 + local365) - (local334 - local460) * (-local471 + local429) > 0) {
				arg0.aBoolean258 = local376 < 0 || local460 < 0 || local334 < 0 || local376 > arg0.anInt3205 || arg0.anInt3205 < local460 || arg0.anInt3205 < local334;
				if (local12.aShort93 >= 0) {
					if (this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local12.aShort93).aByte87)) {
						arg0.anInt3206 = 100;
					}
					arg0.method2885(local429, local471, local365, local376, local460, local334, local12.aShort95 & 0xFFFF, local12.aShort94 & 0xFFFF, local12.aShort91 & 0xFFFF, local237, local290, local418, local257, local323, local449, local98, local97, local93, local12.aShort93);
					arg0.anInt3206 = 0;
				} else {
					arg0.method2888(local429, local471, local365, local376, local460, local334, local95, local93, local97, local12.aShort95 & 0xFFFF, local12.aShort94 & 0xFFFF, local12.aShort91 & 0xFFFF);
				}
			}
			if (-((local460 - local334) * (local301 - local365)) + (local471 - local365) * (local268 + -local334) > 0) {
				arg0.aBoolean258 = local268 < 0 || local334 < 0 || local460 < 0 || local268 > arg0.anInt3205 || local334 > arg0.anInt3205 || arg0.anInt3205 < local460;
				if (local12.aShort93 >= 0) {
					if (this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local12.aShort93).aByte87)) {
						arg0.anInt3206 = 100;
					}
					arg0.method2885(local301, local365, local471, local268, local334, local460, local12.aShort92 & 0xFFFF, local12.aShort91 & 0xFFFF, local12.aShort94 & 0xFFFF, local237, local290, local418, local257, local323, local449, local98, local97, local93, local12.aShort93);
					arg0.anInt3206 = 0;
					return;
				}
				arg0.method2888(local301, local365, local471, local268, local334, local460, local98, local97, local93, local12.aShort92 & 0xFFFF, local12.aShort91 & 0xFFFF, local12.aShort94 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([I[IB[IILclient!ft;[IIZ)V")
	private void method7846(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class107 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(12) Class180 local12 = super.aClass180ArrayArray3[arg6][arg3];
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(303) int local303;
		@Pc(378) int local378;
		@Pc(419) int local419;
		@Pc(493) int local493;
		@Pc(349) int local349;
		@Pc(389) int local389;
		@Pc(447) int local447;
		@Pc(504) int local504;
		@Pc(291) int local291;
		@Pc(338) int local338;
		@Pc(408) int local408;
		@Pc(465) int local465;
		@Pc(320) int local320;
		@Pc(366) int local366;
		@Pc(436) int local436;
		@Pc(482) int local482;
		@Pc(79) int local79;
		@Pc(78) int local78;
		@Pc(76) int local76;
		@Pc(74) int local74;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(195) int local195;
		@Pc(66) int local66;
		@Pc(86) int local86;
		@Pc(273) int local273;
		@Pc(542) int local542;
		@Pc(691) int local691;
		if (local12 == null) {
			@Pc(1624) Class245 local1624 = super.aClass245ArrayArray3[arg6][arg3];
			if (local1624 != null) {
				if (super.anInt9463 == -1) {
					for (local493 = 0; local493 < local1624.aShort89; local493++) {
						local33 = local1624.aShortArray102[local493] + (arg6 << super.anInt9453);
						local38 = local1624.aShortArray100[local493];
						local44 = local1624.aShortArray97[local493] + (arg3 << super.anInt9453);
						local419 = super.anInt9454 + (local44 * super.anInt9460 + local33 * super.anInt9462 + local38 * super.anInt9467 >> 15);
						if (local419 <= super.aClass42_Sub2_18.anInt5338) {
							return;
						}
						arg1[local493] = 0;
						if (arg7) {
							local349 = local419 - super.aClass42_Sub2_18.anInt5349;
							if (local349 > 255) {
								local349 = 255;
							}
							if (local349 > 0) {
								arg1[local493] = local349;
								local389 = local349 * local1624.aShortArray101[local493] / 255;
								if (local389 > 0) {
									local38 -= local389;
								}
							}
						} else if (super.aClass42_Sub2_18.aBoolean414) {
							local349 = local419 - super.aClass42_Sub2_18.anInt5349;
							if (local349 > 0) {
								arg1[local493] = local349;
								if (arg1[local493] > 255) {
									arg1[local493] = 255;
								}
							}
						}
						local303 = (local33 * super.anInt9464 + super.anInt9465 * local38 + local44 * super.anInt9455 >> 15) + super.anInt9461;
						local378 = (super.anInt9458 * local33 + super.anInt9456 * local38 + local44 * super.anInt9457 >> 15) + super.anInt9459;
						arg0[local493] = super.aClass42_Sub2_18.anInt5356 * local303 / local419 + arg4.anInt3203;
						arg5[local493] = arg4.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local378 / local419;
						arg2[local493] = local419;
					}
				} else {
					for (local493 = 0; local493 < local1624.aShort89; local493++) {
						local33 = local1624.aShortArray102[local493] + (arg6 << super.anInt9453);
						local38 = local1624.aShortArray100[local493];
						local44 = local1624.aShortArray97[local493] + (arg3 << super.anInt9453);
						arg1[local493] = 0;
						if (arg7) {
							local349 = -super.aClass42_Sub2_18.anInt5349 + super.anInt9463;
							if (local349 > 255) {
								local349 = 255;
							}
							if (local349 > 0) {
								arg1[local493] = local349;
								local389 = local1624.aShortArray101[local493] * local349 / 255;
								if (local389 > 0) {
									local38 -= local389;
								}
							}
						} else if (super.aClass42_Sub2_18.aBoolean414) {
							local349 = -super.aClass42_Sub2_18.anInt5349 + super.anInt9463;
							if (local349 > 0) {
								arg1[local493] = local349;
								if (arg1[local493] > 255) {
									arg1[local493] = 255;
								}
							}
						}
						local378 = (local44 * super.anInt9457 + super.anInt9458 * local33 + super.anInt9456 * local38 >> 15) + super.anInt9459;
						local303 = super.anInt9461 + (super.anInt9455 * local44 + local33 * super.anInt9464 + super.anInt9465 * local38 >> 15);
						arg0[local493] = arg4.anInt3203 + local303 * super.aClass42_Sub2_18.anInt5356 / super.anInt9463;
						arg5[local493] = super.aClass42_Sub2_18.anInt5350 * local378 / super.anInt9463 + arg4.anInt3204;
						arg2[local493] = super.anInt9463;
					}
				}
				if (local1624.aShortArray98 == null) {
					for (local493 = 0; local493 < local1624.aShort90; local493++) {
						local349 = local493 * 3;
						local389 = local349 + 1;
						local447 = local389 + 1;
						local504 = arg0[local349];
						local291 = arg0[local389];
						local338 = arg0[local447];
						local408 = arg5[local349];
						local465 = arg5[local389];
						local320 = arg5[local447];
						local366 = arg1[local389] + arg1[local349] + arg1[local447];
						if (-((local408 - local465) * (local338 + -local291)) + (local320 - local465) * (local504 + -local291) > 0) {
							arg4.aBoolean258 = local504 < 0 || local291 < 0 || local338 < 0 || local504 > arg4.anInt3205 || arg4.anInt3205 < local291 || arg4.anInt3205 < local338;
							if (local366 >= 765) {
								arg4.method2887(local408, local465, local320, local504, local291, local338, arg2[local349], arg2[local389], arg2[local447], super.aClass42_Sub2_18.anInt5358);
							} else if (local366 <= 0) {
								if ((local1624.anIntArray491[local349] & 0xFFFFFF) != 0) {
									arg4.method2889(local408, local465, local320, local504, local291, local338, arg2[local349], arg2[local389], arg2[local447], local1624.anIntArray491[local349], local1624.anIntArray491[local389], local1624.anIntArray491[local447]);
								}
							} else if ((local1624.anIntArray491[local349] & 0xFFFFFF) != 0) {
								arg4.method2889(local408, local465, local320, local504, local291, local338, arg2[local349], arg2[local389], arg2[local447], Static254.method4368(local1624.anIntArray491[local349], super.aClass42_Sub2_18.anInt5358, arg1[local349]), Static254.method4368(local1624.anIntArray491[local389], super.aClass42_Sub2_18.anInt5358, arg1[local389]), Static254.method4368(local1624.anIntArray491[local447], super.aClass42_Sub2_18.anInt5358, arg1[local447]));
							}
						}
					}
				} else {
					local493 = super.anIntArrayArray86[arg6][arg3];
					local349 = super.anIntArrayArray86[arg6 + 1][arg3];
					local389 = super.anIntArrayArray86[arg6][arg3 + 1];
					local447 = arg6 * super.anInt9451;
					local504 = local447 + super.anInt9451;
					local291 = super.anInt9451 * arg3;
					local338 = local291 + super.anInt9451;
					local408 = (local291 * super.anInt9455 + local493 * super.anInt9465 + local447 * super.anInt9464 >> 15) + super.anInt9461;
					local465 = super.anInt9459 + (super.anInt9458 * local447 + super.anInt9456 * local493 + local291 * super.anInt9457 >> 15);
					local320 = (super.anInt9462 * local447 + super.anInt9467 * local493 + local291 * super.anInt9460 >> 15) + super.anInt9454;
					local366 = super.anInt9461 + (local291 * super.anInt9455 + local349 * super.anInt9465 + local504 * super.anInt9464 >> 15);
					local436 = (local504 * super.anInt9458 + local349 * super.anInt9456 + super.anInt9457 * local291 >> 15) + super.anInt9459;
					local482 = (super.anInt9460 * local291 + super.anInt9467 * local349 + local504 * super.anInt9462 >> 15) + super.anInt9454;
					local79 = super.anInt9461 + (super.anInt9464 * local447 + local389 * super.anInt9465 + super.anInt9455 * local338 >> 15);
					local78 = (local338 * super.anInt9457 + super.anInt9456 * local389 + local447 * super.anInt9458 >> 15) + super.anInt9459;
					local76 = super.anInt9454 + (super.anInt9467 * local389 + local447 * super.anInt9462 + super.anInt9460 * local338 >> 15);
					for (local74 = 0; local74 < local1624.aShort90; local74++) {
						local46 = local74 * 3;
						local48 = local46 + 1;
						local50 = local48 + 1;
						local52 = arg0[local46];
						local195 = arg0[local48];
						local66 = arg0[local50];
						local86 = arg5[local46];
						local273 = arg5[local48];
						local542 = arg5[local50];
						local691 = arg1[local50] + arg1[local46] + arg1[local48];
						if ((local52 - local195) * (local542 + -local273) - (local66 - local195) * (-local273 + local86) > 0) {
							arg4.aBoolean258 = local52 < 0 || local195 < 0 || local66 < 0 || arg4.anInt3205 < local52 || arg4.anInt3205 < local195 || local66 > arg4.anInt3205;
							@Pc(2393) short local2393 = local1624.aShortArray98[local74];
							if (local691 >= 765) {
								arg4.method2887(local86, local273, local542, local52, local195, local66, arg2[local46], arg2[local48], arg2[local50], super.aClass42_Sub2_18.anInt5358);
							} else {
								if (local2393 != -1 && this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local2393).aByte87)) {
									arg4.anInt3206 = 100;
								}
								if (local691 > 0) {
									if (local2393 != -1) {
										arg4.method2883(local86, local273, local542, local52, local195, local66, arg2[local46], arg2[local48], arg2[local50], super.aClass42_Sub2_18.anInt5358, arg1[local46], arg1[local48], arg1[local50], local1624.anIntArray491[local46], local1624.anIntArray491[local48], local1624.anIntArray491[local50], local408, local366, local79, local465, local436, local78, local320, local482, local76, local2393);
									} else if ((local1624.anIntArray491[local46] & 0xFFFFFF) != 0) {
										arg4.method2889(local86, local273, local542, local52, local195, local66, arg2[local46], arg2[local48], arg2[local50], Static456.method6870(arg1[local46] << 24 | super.aClass42_Sub2_18.anInt5358, local1624.anIntArray491[local46]), Static456.method6870(arg1[local48] << 24 | super.aClass42_Sub2_18.anInt5358, local1624.anIntArray491[local48]), Static456.method6870(arg1[local50] << 24 | super.aClass42_Sub2_18.anInt5358, local1624.anIntArray491[local50]));
									}
								} else if (local2393 != -1) {
									arg4.method2885(local86, local273, local542, local52, local195, local66, local1624.anIntArray491[local46], local1624.anIntArray491[local48], local1624.anIntArray491[local50], local408, local366, local79, local465, local436, local78, local320, local482, local76, local2393);
								} else if ((local1624.anIntArray491[local46] & 0xFFFFFF) != 0) {
									arg4.method2889(local86, local273, local542, local52, local195, local66, arg2[local46], arg2[local48], arg2[local50], local1624.anIntArray491[local46], local1624.anIntArray491[local48], local1624.anIntArray491[local50]);
								}
								arg4.anInt3206 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte65 & 0x2) == 0) {
			@Pc(28) int local28 = arg6 * super.anInt9451;
			local33 = super.anInt9451 + local28;
			local38 = super.anInt9451 * arg3;
			local44 = local38 + super.anInt9451;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			local52 = 0;
			if ((local12.aByte65 & 0x1) == 0 || arg7) {
				local66 = super.anIntArrayArray86[arg6][arg3];
				local86 = super.anIntArrayArray86[arg6 + 1][arg3];
				local273 = super.anIntArrayArray86[arg6 + 1][arg3 + 1];
				local542 = super.anIntArrayArray86[arg6][arg3 + 1];
				if (super.anInt9463 == -1) {
					local79 = super.anInt9454 + (local38 * super.anInt9460 + local28 * super.anInt9462 + local66 * super.anInt9467 >> 15);
					if (local79 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local78 = (local38 * super.anInt9460 + super.anInt9467 * local86 + super.anInt9462 * local33 >> 15) + super.anInt9454;
					if (local78 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local76 = (super.anInt9460 * local44 + local33 * super.anInt9462 + super.anInt9467 * local273 >> 15) + super.anInt9454;
					if (super.aClass42_Sub2_18.anInt5338 >= local76) {
						return;
					}
					local74 = (local44 * super.anInt9460 + super.anInt9462 * local28 + super.anInt9467 * local542 >> 15) + super.anInt9454;
					if (super.aClass42_Sub2_18.anInt5338 >= local74) {
						return;
					}
				} else {
					local74 = super.anInt9463;
					local76 = super.anInt9463;
					local78 = super.anInt9463;
					local79 = super.anInt9463;
				}
				if (arg7) {
					local195 = local79 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local46 = local195;
						local691 = local195 * local12.aShort71 / 255;
						if (local691 > 0) {
							local66 -= local691;
						}
					}
					local195 = local78 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local48 = local195;
						local691 = local12.aShort73 * local195 / 255;
						if (local691 > 0) {
							local86 -= local691;
						}
					}
					local195 = local76 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local50 = local195;
						local691 = local12.aShort74 * local195 / 255;
						if (local691 > 0) {
							local273 -= local691;
						}
					}
					local195 = local74 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local52 = local195;
						local691 = local12.aShort72 * local195 / 255;
						if (local691 > 0) {
							local542 -= local691;
						}
					}
				} else if (super.aClass42_Sub2_18.aBoolean414) {
					local195 = local79 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local46 = local195;
						if (local195 > 255) {
							local46 = 255;
						}
					}
					local195 = local78 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local48 = local195;
						if (local195 > 255) {
							local48 = 255;
						}
					}
					local195 = local76 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local50 = local195;
						if (local195 > 255) {
							local50 = 255;
						}
					}
					local195 = local74 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local52 = local195;
						if (local195 > 255) {
							local52 = 255;
						}
					}
				}
				local291 = (super.anInt9455 * local38 + super.anInt9464 * local28 + super.anInt9465 * local66 >> 15) + super.anInt9461;
				local320 = super.anInt9459 + (local38 * super.anInt9457 + local28 * super.anInt9458 + super.anInt9456 * local66 >> 15);
				local303 = arg4.anInt3203 + local291 * super.aClass42_Sub2_18.anInt5356 / local79;
				local338 = (super.anInt9464 * local33 + super.anInt9465 * local86 + super.anInt9455 * local38 >> 15) + super.anInt9461;
				local349 = arg4.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local320 / local79;
				local378 = arg4.anInt3203 + local338 * super.aClass42_Sub2_18.anInt5356 / local78;
				local366 = (local86 * super.anInt9456 + local33 * super.anInt9458 + local38 * super.anInt9457 >> 15) + super.anInt9459;
				local389 = arg4.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local366 / local78;
				local408 = super.anInt9461 + (local44 * super.anInt9455 + super.anInt9464 * local33 + local273 * super.anInt9465 >> 15);
				local419 = local408 * super.aClass42_Sub2_18.anInt5356 / local76 + arg4.anInt3203;
				local436 = (super.anInt9457 * local44 + local33 * super.anInt9458 + local273 * super.anInt9456 >> 15) + super.anInt9459;
				local447 = arg4.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local436 / local76;
				local465 = (super.anInt9465 * local542 + local28 * super.anInt9464 + local44 * super.anInt9455 >> 15) + super.anInt9461;
				local493 = arg4.anInt3203 + super.aClass42_Sub2_18.anInt5356 * local465 / local74;
				local482 = super.anInt9459 + (local44 * super.anInt9457 + super.anInt9458 * local28 + super.anInt9456 * local542 >> 15);
				local504 = arg4.anInt3204 + super.aClass42_Sub2_18.anInt5350 * local482 / local74;
			} else {
				local66 = super.anIntArrayArray86[arg6][arg3];
				if (super.anInt9463 == -1) {
					local86 = super.anInt9467 * local66;
					local79 = super.anInt9454 + (local86 + super.anInt9462 * local28 + super.anInt9460 * local38 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local79) {
						return;
					}
					local78 = super.anInt9454 + (local38 * super.anInt9460 + local33 * super.anInt9462 + local86 >> 15);
					if (local78 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local76 = super.anInt9454 + (local86 + super.anInt9462 * local33 + super.anInt9460 * local44 >> 15);
					if (local76 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local74 = (super.anInt9460 * local44 + local86 + local28 * super.anInt9462 >> 15) + super.anInt9454;
					if (local74 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
				} else {
					local74 = super.anInt9463;
					local76 = super.anInt9463;
					local78 = super.anInt9463;
					local79 = super.anInt9463;
				}
				if (super.aClass42_Sub2_18.aBoolean414) {
					local195 = local79 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local46 = local195;
						if (local195 > 255) {
							local46 = 255;
						}
					}
					local195 = local78 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local48 = local195;
						if (local195 > 255) {
							local48 = 255;
						}
					}
					local195 = local76 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local50 = local195;
						if (local195 > 255) {
							local50 = 255;
						}
					}
					local195 = local74 - super.aClass42_Sub2_18.anInt5349;
					if (local195 > 0) {
						local52 = local195;
						if (local195 > 255) {
							local52 = 255;
						}
					}
				}
				local86 = local66 * super.anInt9465;
				local273 = local66 * super.anInt9456;
				local291 = super.anInt9461 + (super.anInt9455 * local38 + local28 * super.anInt9464 + local86 >> 15);
				local303 = arg4.anInt3203 + super.aClass42_Sub2_18.anInt5356 * local291 / local79;
				local320 = (local273 + super.anInt9458 * local28 + super.anInt9457 * local38 >> 15) + super.anInt9459;
				local338 = super.anInt9461 + (local38 * super.anInt9455 + local33 * super.anInt9464 + local86 >> 15);
				local349 = local320 * super.aClass42_Sub2_18.anInt5350 / local79 + arg4.anInt3204;
				local366 = (super.anInt9457 * local38 + local273 + super.anInt9458 * local33 >> 15) + super.anInt9459;
				local378 = arg4.anInt3203 + local338 * super.aClass42_Sub2_18.anInt5356 / local78;
				local389 = local366 * super.aClass42_Sub2_18.anInt5350 / local78 + arg4.anInt3204;
				local408 = super.anInt9461 + (local86 + local33 * super.anInt9464 + super.anInt9455 * local44 >> 15);
				local419 = super.aClass42_Sub2_18.anInt5356 * local408 / local76 + arg4.anInt3203;
				local436 = super.anInt9459 + (local44 * super.anInt9457 + local273 + local33 * super.anInt9458 >> 15);
				local447 = local436 * super.aClass42_Sub2_18.anInt5350 / local76 + arg4.anInt3204;
				local465 = (super.anInt9455 * local44 + super.anInt9464 * local28 + local86 >> 15) + super.anInt9461;
				local482 = super.anInt9459 + (local273 + local28 * super.anInt9458 + local44 * super.anInt9457 >> 15);
				local493 = arg4.anInt3203 + local465 * super.aClass42_Sub2_18.anInt5356 / local74;
				local504 = local482 * super.aClass42_Sub2_18.anInt5350 / local74 + arg4.anInt3204;
			}
			@Pc(1153) boolean local1153 = local12.aShort70 != -1 && this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local12.aShort70).aByte87);
			local86 = local52 + local48 + local50;
			if (-((local378 - local493) * (-local504 + local447)) + (local389 - local504) * (local419 + -local493) > 0) {
				arg4.aBoolean258 = local419 < 0 || local493 < 0 || local378 < 0 || local419 > arg4.anInt3205 || arg4.anInt3205 < local493 || local378 > arg4.anInt3205;
				if (local86 >= 765) {
					arg4.method2887(local447, local504, local389, local419, local493, local378, local76, local74, local78, super.aClass42_Sub2_18.anInt5358);
				} else {
					if (local1153) {
						arg4.anInt3206 = 100;
					}
					if (local86 <= 0) {
						if (local12.aShort70 < 0) {
							arg4.method2889(local447, local504, local389, local419, local493, local378, local76, local74, local78, local12.anInt5397, local12.anInt5396, local12.anInt5399);
						} else {
							arg4.method2885(local447, local504, local389, local419, local493, local378, local12.anInt5397, local12.anInt5396, local12.anInt5399, local408, local465, local338, local436, local482, local366, local76, local74, local78, local12.aShort70);
						}
					} else if (local12.aShort70 >= 0) {
						arg4.method2883(local447, local504, local389, local419, local493, local378, local76, local74, local78, super.aClass42_Sub2_18.anInt5358, local50, local52, local48, local12.anInt5397, local12.anInt5396, local12.anInt5399, local408, local465, local338, local436, local482, local366, local76, local74, local78, local12.aShort70);
					} else {
						arg4.method2889(local447, local504, local389, local419, local493, local378, local76, local74, local78, Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local50 << 24, local12.anInt5397), Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local52 << 24, local12.anInt5396), Static456.method6870(local48 << 24 | super.aClass42_Sub2_18.anInt5358, local12.anInt5399));
					}
					arg4.anInt3206 = 0;
				}
			}
			local86 = local52 + local48 + local46;
			if (-((local493 - local378) * (-local389 + local349)) + (local504 - local389) * (local303 + -local378) > 0) {
				arg4.aBoolean258 = local303 < 0 || local378 < 0 || local493 < 0 || local303 > arg4.anInt3205 || local378 > arg4.anInt3205 || arg4.anInt3205 < local493;
				if (local86 >= 765) {
					arg4.method2887(local349, local389, local504, local303, local378, local493, local79, local78, local74, super.aClass42_Sub2_18.anInt5358);
					return;
				}
				if (local1153) {
					arg4.anInt3206 = 100;
				}
				if (local86 > 0) {
					if (local12.aShort70 >= 0) {
						arg4.method2883(local349, local389, local504, local303, local378, local493, local79, local78, local74, super.aClass42_Sub2_18.anInt5358, local46, local48, local52, local12.anInt5395, local12.anInt5399, local12.anInt5396, local291, local338, local465, local320, local366, local482, local79, local78, local74, local12.aShort70);
					} else {
						arg4.method2889(local349, local389, local504, local303, local378, local493, local79, local78, local74, Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local46 << 24, local12.anInt5395), Static456.method6870(local48 << 24 | super.aClass42_Sub2_18.anInt5358, local12.anInt5399), Static456.method6870(local52 << 24 | super.aClass42_Sub2_18.anInt5358, local12.anInt5396));
					}
				} else if (local12.aShort70 < 0) {
					arg4.method2889(local349, local389, local504, local303, local378, local493, local79, local78, local74, local12.anInt5395, local12.anInt5399, local12.anInt5396);
				} else {
					arg4.method2885(local349, local389, local504, local303, local378, local493, local12.anInt5395, local12.anInt5399, local12.anInt5396, local291, local338, local465, local320, local366, local482, local79, local78, local74, local12.aShort70);
				}
				arg4.anInt3206 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	@Override
	public void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class54_Sub2 local9 = (Class54_Sub2) super.aClass42_Sub2_18.method4545(Thread.currentThread());
		local9.aClass107_2.anInt3206 = 0;
		if (super.aClass180ArrayArray3 != null) {
			this.method7846(local9.anIntArray587, local9.anIntArray589, local9.anIntArray592, arg1, local9.aClass107_2, local9.anIntArray594, arg0, super.aClass42_Sub2_18.aBoolean413);
		} else if (super.aClass263ArrayArray3 != null) {
			this.method7845(local9.aClass107_2, local9.anIntArray594, local9.anIntArray592, arg0, arg1, local9.anIntArray589, local9.anIntArray587);
			return;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7836(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class54_Sub2 local9 = (Class54_Sub2) super.aClass42_Sub2_18.method4545(Thread.currentThread());
		@Pc(12) Class107 local12 = local9.aClass107_2;
		local12.aBoolean258 = false;
		local12.anInt3206 = 0;
		if (super.aClass180ArrayArray3 != null) {
			this.method7848(arg4, arg1, local9.anIntArray594, local9.anIntArray587, arg2, local12, arg3, arg0);
		} else if (super.aClass263ArrayArray3 != null) {
			this.method7849(arg0, arg2, local9.anIntArray594, arg1, local9.anIntArray587, arg4, arg3, local12);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([[ZII[I[IIBLclient!ft;IIII)V")
	private void method7848(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class107 arg5, @OriginalArg(9) int arg6, @OriginalArg(11) int arg7) {
		@Pc(18) int local18 = (arg6 - arg1) * 1024 / 256;
		arg5.aBoolean257 = false;
		arg5.aBoolean256 = false;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = local18;
		for (@Pc(36) int local36 = arg7; local36 < arg4; local36++) {
			for (@Pc(40) int local40 = arg1; local40 < arg6; local40++) {
				if (arg0[local36 - arg7][local40 - arg1]) {
					@Pc(76) int local76;
					if (super.aClass180ArrayArray3[local36][local40] != null) {
						@Pc(300) Class180 local300 = super.aClass180ArrayArray3[local36][local40];
						if (local300.aShort70 != -1 && (local300.aByte65 & 0x2) == 0 && local300.anInt5398 == 0) {
							local76 = super.aClass42_Sub2_18.method4538(local300.aShort70);
							arg5.method2888(local34 - 4, local34 - 4, local34, local30 + 4, local30, local30 + 4, 0, 0, 0, Static282.method4653(local76, local300.anInt5397), Static282.method4653(local76, local300.anInt5396), Static282.method4653(local76, local300.anInt5399));
							arg5.method2888(local34, local34, local34 - 4, local30, local30 + 4, local30, 0, 0, 0, Static282.method4653(local76, local300.anInt5395), Static282.method4653(local76, local300.anInt5399), Static282.method4653(local76, local300.anInt5396));
						} else if (local300.anInt5398 == 0) {
							arg5.method2889(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, 0, 0, 0, local300.anInt5397, local300.anInt5396, local300.anInt5399);
							arg5.method2889(local34, local34, local34 - 4, local30, local30 + 4, local30, 0, 0, 0, local300.anInt5395, local300.anInt5399, local300.anInt5396);
						} else {
							local76 = local300.anInt5398;
							arg5.method2889(local34 - 4, local34 + -4, local34, local30 + 4, local30, local30 + 4, 0, 0, 0, Static456.method6870(local300.anInt5397 & 0xFF000000, local76), Static456.method6870(local300.anInt5396 & 0xFF000000, local76), Static456.method6870(local300.anInt5399 & 0xFF000000, local76));
							arg5.method2889(local34, local34, local34 - 4, local30, local30 + 4, local30, 0, 0, 0, Static456.method6870(local300.anInt5395 & 0xFF000000, local76), Static456.method6870(local300.anInt5399 & 0xFF000000, local76), Static456.method6870(local300.anInt5396 & 0xFF000000, local76));
						}
					} else if (super.aClass245ArrayArray3[local36][local40] != null) {
						@Pc(74) Class245 local74 = super.aClass245ArrayArray3[local36][local40];
						for (local76 = 0; local76 < local74.aShort89; local76++) {
							arg3[local76] = local30 + local74.aShortArray102[local76] * 4 / super.anInt9451;
							arg2[local76] = local34 - local74.aShortArray97[local76] * 4 / super.anInt9451;
						}
						for (@Pc(118) int local118 = 0; local118 < local74.aShort90; local118++) {
							@Pc(124) int local124 = local118 * 3;
							@Pc(128) int local128 = local124 + 1;
							@Pc(132) int local132 = local128 + 1;
							@Pc(136) int local136 = arg3[local124];
							@Pc(140) int local140 = arg3[local128];
							@Pc(144) int local144 = arg3[local132];
							@Pc(148) int local148 = arg2[local124];
							@Pc(152) int local152 = arg2[local128];
							@Pc(156) int local156 = arg2[local132];
							@Pc(194) int local194;
							if (local74.anIntArray492 != null && local74.anIntArray492[local118] != 0 && (local74.aShortArray98 == null || local74.aShortArray98 != null && local74.aShortArray98[local118] == -1)) {
								local194 = local74.anIntArray492[local118];
								arg5.method2889(local148, local152, local156, local136, local140, local144, 0, 0, 0, Static456.method6870(-(-16777216 & local74.anIntArray491[local124]) - 16777216, local194), Static456.method6870(-(-16777216 & local74.anIntArray491[local128]) - 16777216, local194), Static456.method6870(-(local74.anIntArray491[local132] & 0xFF000000) - 16777216, local194));
							} else if (local74.aShortArray98 == null || local74.aShortArray98[local118] == -1) {
								arg5.method2889(local148, local152, local156, local136, local140, local144, 0, 0, 0, local74.anIntArray491[local124], local74.anIntArray491[local128], local74.anIntArray491[local132]);
							} else {
								local194 = super.aClass42_Sub2_18.method4538(local74.aShortArray98[local118]);
								arg5.method2888(local148, local152, local156, local136, local140, local144, 0, 0, 0, local194, local194, local194);
							}
						}
					}
				}
				local34 -= 4;
			}
			local34 = local18;
			local30 += 4;
		}
		arg5.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[III[I[[ZBIILclient!ft;I)V")
	private void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) boolean[][] arg5, @OriginalArg(8) int arg6, @OriginalArg(10) Class107 arg7) {
		@Pc(14) int local14 = (arg6 - arg3) * 1024 / 256;
		arg7.aBoolean257 = false;
		arg7.aBoolean256 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg0; local32 < arg1; local32++) {
			for (@Pc(36) int local36 = arg3; local36 < arg6; local36++) {
				if (arg5[local32 - arg0][local36 - arg3]) {
					@Pc(73) int local73;
					if (super.aClass263ArrayArray3[local32][local36] != null) {
						@Pc(307) Class263 local307 = super.aClass263ArrayArray3[local32][local36];
						if (local307.aShort93 != -1 && (local307.aByte81 & 0x2) == 0 && local307.anInt7960 == -1) {
							local73 = super.aClass42_Sub2_18.method4538(local307.aShort93);
							arg7.method2888(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, Static282.method4653(local73, local307.aShort95 & 0xFFFF), Static282.method4653(local73, local307.aShort94 & 0xFFFF), Static282.method4653(local73, local307.aShort91 & 0xFFFF));
							arg7.method2888(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, Static282.method4653(local73, local307.aShort92 & 0xFFFF), Static282.method4653(local73, local307.aShort91 & 0xFFFF), Static282.method4653(local73, local307.aShort94 & 0xFFFF));
						} else if (local307.anInt7960 == -1) {
							arg7.method2888(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, local307.aShort95 & 0xFFFF, local307.aShort94 & 0xFFFF, local307.aShort91 & 0xFFFF);
							arg7.method2888(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, local307.aShort92 & 0xFFFF, local307.aShort91 & 0xFFFF, local307.aShort94 & 0xFFFF);
						} else {
							local73 = local307.anInt7960;
							arg7.method2888(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, local73, local73, local73);
							arg7.method2888(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, local73, local73, local73);
						}
					} else if (super.aClass289ArrayArray3[local32][local36] != null) {
						@Pc(71) Class289 local71 = super.aClass289ArrayArray3[local32][local36];
						for (local73 = 0; local73 < local71.aShort107; local73++) {
							arg4[local73] = local71.aShortArray117[local73] * 4 / super.anInt9451 + local26;
							arg2[local73] = local30 - local71.aShortArray120[local73] * 4 / super.anInt9451;
						}
						for (@Pc(111) int local111 = 0; local111 < local71.aShort106; local111++) {
							@Pc(118) short local118 = local71.aShortArray123[local111];
							@Pc(123) short local123 = local71.aShortArray124[local111];
							@Pc(128) short local128 = local71.aShortArray125[local111];
							@Pc(132) int local132 = arg4[local118];
							@Pc(136) int local136 = arg4[local123];
							@Pc(140) int local140 = arg4[local128];
							@Pc(144) int local144 = arg2[local118];
							@Pc(148) int local148 = arg2[local123];
							@Pc(152) int local152 = arg2[local128];
							@Pc(176) int local176;
							if (local71.anIntArray647 != null && local71.anIntArray647[local111] != -1) {
								local176 = local71.anIntArray647[local111];
								arg7.method2888(local144, local148, local152, local132, local136, local140, 0, 0, 0, Static282.method4653(local176, local71.aShortArray122[local118]), Static282.method4653(local176, local71.aShortArray122[local123]), Static282.method4653(local176, local71.aShortArray122[local128]));
							} else if (local71.aShortArray119 == null || local71.aShortArray119[local111] == -1) {
								local176 = local71.anIntArray648[local111];
								arg7.method2888(local144, local148, local152, local132, local136, local140, 0, 0, 0, Static282.method4653(local176, local71.aShortArray122[local118]), Static282.method4653(local176, local71.aShortArray122[local123]), Static282.method4653(local176, local71.aShortArray122[local128]));
							} else {
								local176 = super.aClass42_Sub2_18.method4538(local71.aShortArray119[local111]);
								arg7.method2888(local144, local148, local152, local132, local136, local140, 0, 0, 0, Static282.method4653(local176, local71.aShortArray122[local118]), Static282.method4653(local176, local71.aShortArray122[local123]), Static282.method4653(local176, local71.aShortArray122[local128]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local26 += 4;
			local30 = local14;
		}
		arg7.aBoolean257 = true;
	}
}
