import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class215_Sub1_Sub1 extends Class215_Sub1 {

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!et;IIII[[I[[II)V")
	public Class215_Sub1_Sub1(@OriginalArg(0) Class42_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[ILclient!vba;[II[II)V")
	private void method5665(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class300 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		@Pc(25) Class263 local25 = super.aClass263ArrayArray3[arg5][arg0];
		@Pc(46) int local46;
		@Pc(56) int local56;
		@Pc(229) int local229;
		@Pc(304) int local304;
		@Pc(362) int local362;
		@Pc(420) int local420;
		@Pc(432) int local432;
		@Pc(213) int local213;
		@Pc(275) int local275;
		@Pc(322) int local322;
		@Pc(391) int local391;
		@Pc(246) int local246;
		@Pc(293) int local293;
		@Pc(351) int local351;
		@Pc(409) int local409;
		@Pc(95) int local95;
		@Pc(120) int local120;
		@Pc(143) int local143;
		@Pc(172) int local172;
		@Pc(470) int local470;
		@Pc(257) int local257;
		@Pc(333) int local333;
		@Pc(373) int local373;
		if (local25 == null) {
			@Pc(1121) Class289 local1121 = super.aClass289ArrayArray3[arg5][arg0];
			if (local1121 != null) {
				@Pc(1148) short local1148;
				if (super.anInt9463 == -1) {
					for (local420 = 0; local420 < local1121.aShort107; local420++) {
						local46 = local1121.aShortArray117[local420] + (arg5 << super.anInt9453);
						local1148 = local1121.aShortArray121[local420];
						local56 = local1121.aShortArray120[local420] + (arg0 << super.anInt9453);
						local362 = super.anInt9454 + (local56 * super.anInt9460 + super.anInt9467 * local1148 + super.anInt9462 * local46 >> 15);
						if (local362 <= super.aClass42_Sub2_18.anInt5338) {
							return;
						}
						local229 = super.anInt9461 + (super.anInt9455 * local56 + super.anInt9464 * local46 + local1148 * super.anInt9465 >> 15);
						local304 = (local46 * super.anInt9458 + local1148 * super.anInt9456 + super.anInt9457 * local56 >> 15) + super.anInt9459;
						arg3[local420] = arg2.anInt9120 + local229 * super.aClass42_Sub2_18.anInt5356 / local362;
						arg4[local420] = local304 * super.aClass42_Sub2_18.anInt5350 / local362 + arg2.anInt9117;
					}
				} else {
					for (local420 = 0; local420 < local1121.aShort107; local420++) {
						local46 = local1121.aShortArray117[local420] + (arg5 << super.anInt9453);
						local1148 = local1121.aShortArray121[local420];
						local56 = local1121.aShortArray120[local420] + (arg0 << super.anInt9453);
						local304 = super.anInt9459 + (local46 * super.anInt9458 + local1148 * super.anInt9456 + local56 * super.anInt9457 >> 15);
						local229 = (local46 * super.anInt9464 + super.anInt9465 * local1148 + local56 * super.anInt9455 >> 15) + super.anInt9461;
						arg3[local420] = arg2.anInt9120 + super.aClass42_Sub2_18.anInt5356 * local229 / super.anInt9463;
						arg4[local420] = arg2.anInt9117 + super.aClass42_Sub2_18.anInt5350 * local304 / super.anInt9463;
					}
				}
				if (local1121.aShortArray119 == null) {
					for (local420 = 0; local420 < local1121.aShort106; local420++) {
						@Pc(1822) short local1822 = local1121.aShortArray123[local420];
						@Pc(1827) short local1827 = local1121.aShortArray124[local420];
						@Pc(1832) short local1832 = local1121.aShortArray125[local420];
						local432 = arg3[local1822];
						local213 = arg3[local1827];
						local275 = arg3[local1832];
						local322 = arg4[local1822];
						local391 = arg4[local1827];
						local246 = arg4[local1832];
						if ((local432 - local213) * (-local391 + local246) - (local275 - local213) * (-local391 + local322) > 0) {
							local293 = local1121.anIntArray648[local420];
							if (local293 != -1) {
								arg2.aBoolean648 = local432 < 0 || local213 < 0 || local275 < 0 || local432 > arg2.anInt9119 || arg2.anInt9119 < local213 || local275 > arg2.anInt9119;
								arg2.method7523(local322, local391, local246, local432, local213, local275, Static282.method4653(local293, local1121.aShortArray122[local1822]), Static282.method4653(local293, local1121.aShortArray122[local1827]), Static282.method4653(local293, local1121.aShortArray122[local1832]));
							}
						}
					}
				} else {
					local420 = super.anIntArrayArray86[arg5][arg0];
					local257 = super.anIntArrayArray86[arg5 + 1][arg0];
					local333 = super.anIntArrayArray86[arg5][arg0 + 1];
					local373 = arg5 * super.anInt9451;
					local432 = local373 + super.anInt9451;
					local213 = arg0 * super.anInt9451;
					local275 = local213 + super.anInt9451;
					local322 = super.anInt9461 + (super.anInt9455 * local213 + local373 * super.anInt9464 + super.anInt9465 * local420 >> 15);
					local391 = super.anInt9459 + (local373 * super.anInt9458 + super.anInt9456 * local420 + local213 * super.anInt9457 >> 15);
					local246 = (super.anInt9467 * local420 + local373 * super.anInt9462 + super.anInt9460 * local213 >> 15) + super.anInt9454;
					local293 = super.anInt9461 + (local432 * super.anInt9464 + super.anInt9465 * local257 + local213 * super.anInt9455 >> 15);
					local351 = super.anInt9459 + (super.anInt9456 * local257 + local432 * super.anInt9458 + super.anInt9457 * local213 >> 15);
					local409 = (super.anInt9462 * local432 + local257 * super.anInt9467 + super.anInt9460 * local213 >> 15) + super.anInt9454;
					local95 = super.anInt9461 + (local275 * super.anInt9455 + super.anInt9464 * local373 + super.anInt9465 * local333 >> 15);
					local120 = (local275 * super.anInt9457 + super.anInt9458 * local373 + local333 * super.anInt9456 >> 15) + super.anInt9459;
					local143 = super.anInt9454 + (super.anInt9460 * local275 + local333 * super.anInt9467 + super.anInt9462 * local373 >> 15);
					for (local172 = 0; local172 < local1121.aShort106; local172++) {
						@Pc(1620) short local1620 = local1121.aShortArray123[local172];
						@Pc(1625) short local1625 = local1121.aShortArray124[local172];
						@Pc(1630) short local1630 = local1121.aShortArray125[local172];
						local470 = arg3[local1620];
						@Pc(1638) int local1638 = arg3[local1625];
						@Pc(1642) int local1642 = arg3[local1630];
						@Pc(1646) int local1646 = arg4[local1620];
						@Pc(1650) int local1650 = arg4[local1625];
						@Pc(1654) int local1654 = arg4[local1630];
						if (-((local1646 - local1650) * (-local1638 + local1642)) + (local470 - local1638) * (local1654 - local1650) > 0) {
							arg2.aBoolean648 = local470 < 0 || local1638 < 0 || local1642 < 0 || local470 > arg2.anInt9119 || arg2.anInt9119 < local1638 || arg2.anInt9119 < local1642;
							@Pc(1712) short local1712 = local1121.aShortArray119[local172];
							if (local1712 == -1) {
								@Pc(1720) int local1720 = local1121.anIntArray648[local172];
								if (local1720 != -1) {
									arg2.method7523(local1646, local1650, local1654, local470, local1638, local1642, Static282.method4653(local1720, local1121.aShortArray122[local1620]), Static282.method4653(local1720, local1121.aShortArray122[local1625]), Static282.method4653(local1720, local1121.aShortArray122[local1630]));
								}
							} else {
								if (this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local1712).aByte87)) {
									arg2.anInt9116 = 100;
								}
								arg2.method7519(local1646, local1650, local1654, local470, local1638, local1642, local1121.aShortArray122[local1620], local1121.aShortArray122[local1625], local1121.aShortArray122[local1630], local322, local293, local95, local391, local351, local120, local246, local409, local143, local1712);
								arg2.anInt9116 = 0;
							}
						}
					}
				}
			}
		} else if ((local25.aByte81 & 0x2) == 0) {
			@Pc(41) int local41 = arg5 * super.anInt9451;
			local46 = super.anInt9451 + local41;
			@Pc(51) int local51 = super.anInt9451 * arg0;
			local56 = local51 + super.anInt9451;
			@Pc(68) int local68;
			@Pc(78) int local78;
			@Pc(218) int local218;
			if ((local25.aByte81 & 0x1) == 0) {
				local68 = super.anIntArrayArray86[arg5][arg0];
				local78 = super.anIntArrayArray86[arg5 + 1][arg0];
				local218 = super.anIntArrayArray86[arg5 + 1][arg0 + 1];
				local470 = super.anIntArrayArray86[arg5][arg0 + 1];
				if (super.anInt9463 == -1) {
					local95 = (local41 * super.anInt9462 + local68 * super.anInt9467 + local51 * super.anInt9460 >> 15) + super.anInt9454;
					if (super.aClass42_Sub2_18.anInt5338 >= local95) {
						return;
					}
					local120 = (local51 * super.anInt9460 + super.anInt9462 * local46 + local78 * super.anInt9467 >> 15) + super.anInt9454;
					if (super.aClass42_Sub2_18.anInt5338 >= local120) {
						return;
					}
					local143 = super.anInt9454 + (local56 * super.anInt9460 + local218 * super.anInt9467 + super.anInt9462 * local46 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local143) {
						return;
					}
					local172 = super.anInt9454 + (super.anInt9460 * local56 + local470 * super.anInt9467 + local41 * super.anInt9462 >> 15);
					if (local172 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
				} else {
					local172 = super.anInt9463;
					local143 = super.anInt9463;
					local120 = super.anInt9463;
					local95 = super.anInt9463;
				}
				local213 = (super.anInt9455 * local51 + super.anInt9465 * local68 + super.anInt9464 * local41 >> 15) + super.anInt9461;
				local246 = (super.anInt9457 * local51 + super.anInt9456 * local68 + super.anInt9458 * local41 >> 15) + super.anInt9459;
				local229 = arg2.anInt9120 + super.aClass42_Sub2_18.anInt5356 * local213 / local95;
				local275 = (super.anInt9455 * local51 + super.anInt9465 * local78 + super.anInt9464 * local46 >> 15) + super.anInt9461;
				local257 = arg2.anInt9117 + super.aClass42_Sub2_18.anInt5350 * local246 / local95;
				local293 = super.anInt9459 + (super.anInt9458 * local46 + local78 * super.anInt9456 + local51 * super.anInt9457 >> 15);
				local304 = local275 * super.aClass42_Sub2_18.anInt5356 / local120 + arg2.anInt9120;
				local322 = (local56 * super.anInt9455 + super.anInt9464 * local46 + super.anInt9465 * local218 >> 15) + super.anInt9461;
				local333 = arg2.anInt9117 + local293 * super.aClass42_Sub2_18.anInt5350 / local120;
				local362 = arg2.anInt9120 + local322 * super.aClass42_Sub2_18.anInt5356 / local143;
				local351 = (local56 * super.anInt9457 + local218 * super.anInt9456 + super.anInt9458 * local46 >> 15) + super.anInt9459;
				local373 = arg2.anInt9117 + super.aClass42_Sub2_18.anInt5350 * local351 / local143;
				local391 = (super.anInt9464 * local41 + local470 * super.anInt9465 + super.anInt9455 * local56 >> 15) + super.anInt9461;
				local420 = arg2.anInt9120 + local391 * super.aClass42_Sub2_18.anInt5356 / local172;
				local409 = (super.anInt9457 * local56 + local470 * super.anInt9456 + local41 * super.anInt9458 >> 15) + super.anInt9459;
				local432 = local409 * super.aClass42_Sub2_18.anInt5350 / local172 + arg2.anInt9117;
			} else {
				local68 = super.anIntArrayArray86[arg5][arg0];
				if (super.anInt9463 == -1) {
					local78 = local68 * super.anInt9467;
					local95 = super.anInt9454 + (local51 * super.anInt9460 + local41 * super.anInt9462 + local78 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local95) {
						return;
					}
					local120 = super.anInt9454 + (local78 + super.anInt9462 * local46 + local51 * super.anInt9460 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local120) {
						return;
					}
					local143 = (local78 + super.anInt9462 * local46 + super.anInt9460 * local56 >> 15) + super.anInt9454;
					if (local143 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local172 = super.anInt9454 + (local41 * super.anInt9462 + local78 + super.anInt9460 * local56 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local172) {
						return;
					}
				} else {
					local172 = super.anInt9463;
					local143 = super.anInt9463;
					local120 = super.anInt9463;
					local95 = super.anInt9463;
				}
				local78 = super.anInt9465 * local68;
				local213 = (local51 * super.anInt9455 + local78 + local41 * super.anInt9464 >> 15) + super.anInt9461;
				local218 = super.anInt9456 * local68;
				local229 = super.aClass42_Sub2_18.anInt5356 * local213 / local95 + arg2.anInt9120;
				local246 = (local218 + super.anInt9458 * local41 + super.anInt9457 * local51 >> 15) + super.anInt9459;
				local257 = super.aClass42_Sub2_18.anInt5350 * local246 / local95 + arg2.anInt9117;
				local275 = super.anInt9461 + (local51 * super.anInt9455 + local78 + local46 * super.anInt9464 >> 15);
				local293 = (super.anInt9457 * local51 + super.anInt9458 * local46 + local218 >> 15) + super.anInt9459;
				local304 = arg2.anInt9120 + super.aClass42_Sub2_18.anInt5356 * local275 / local120;
				local322 = (super.anInt9455 * local56 + super.anInt9464 * local46 + local78 >> 15) + super.anInt9461;
				local333 = arg2.anInt9117 + local293 * super.aClass42_Sub2_18.anInt5350 / local120;
				local351 = super.anInt9459 + (local56 * super.anInt9457 + local218 + super.anInt9458 * local46 >> 15);
				local362 = super.aClass42_Sub2_18.anInt5356 * local322 / local143 + arg2.anInt9120;
				local373 = local351 * super.aClass42_Sub2_18.anInt5350 / local143 + arg2.anInt9117;
				local391 = super.anInt9461 + (super.anInt9455 * local56 + local41 * super.anInt9464 + local78 >> 15);
				local409 = super.anInt9459 + (local218 + super.anInt9458 * local41 + local56 * super.anInt9457 >> 15);
				local420 = super.aClass42_Sub2_18.anInt5356 * local391 / local172 + arg2.anInt9120;
				local432 = arg2.anInt9117 + super.aClass42_Sub2_18.anInt5350 * local409 / local172;
			}
			if (-((local304 - local420) * (-local432 + local373)) + (local362 - local420) * (-local432 + local333) > 0) {
				arg2.aBoolean648 = local362 < 0 || local420 < 0 || local304 < 0 || local362 > arg2.anInt9119 || local420 > arg2.anInt9119 || local304 > arg2.anInt9119;
				if (local25.aShort93 < 0) {
					arg2.method7523(local373, local432, local333, local362, local420, local304, local25.aShort95 & 0xFFFF, local25.aShort94 & 0xFFFF, local25.aShort91 & 0xFFFF);
				} else {
					if (this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local25.aShort93).aByte87)) {
						arg2.anInt9116 = 100;
					}
					arg2.method7519(local373, local432, local333, local362, local420, local304, local25.aShort95 & 0xFFFF, local25.aShort94 & 0xFFFF, local25.aShort91 & 0xFFFF, local213, local275, local391, local246, local293, local409, local95, local120, local172, local25.aShort93);
					arg2.anInt9116 = 0;
				}
			}
			if (-((local257 - local333) * (-local304 + local420)) + (local432 - local333) * (local229 - local304) > 0) {
				arg2.aBoolean648 = local229 < 0 || local304 < 0 || local420 < 0 || local229 > arg2.anInt9119 || arg2.anInt9119 < local304 || arg2.anInt9119 < local420;
				if (local25.aShort93 >= 0) {
					if (this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local25.aShort93).aByte87)) {
						arg2.anInt9116 = 100;
					}
					arg2.method7519(local257, local333, local432, local229, local304, local420, local25.aShort92 & 0xFFFF, local25.aShort91 & 0xFFFF, local25.aShort94 & 0xFFFF, local213, local275, local391, local246, local293, local409, local95, local120, local172, local25.aShort93);
					arg2.anInt9116 = 0;
					return;
				}
				arg2.method7523(local257, local333, local432, local229, local304, local420, local25.aShort92 & 0xFFFF, local25.aShort91 & 0xFFFF, local25.aShort94 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([I[IIIIII[[ZLclient!vba;III)V")
	private void method5666(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class300 arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(19) int local19 = (arg6 - arg3) * 1024 / 256;
		arg5.aBoolean646 = false;
		arg5.aBoolean650 = false;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = local19;
		for (@Pc(37) int local37 = arg2; local37 < arg7; local37++) {
			for (@Pc(41) int local41 = arg3; local41 < arg6; local41++) {
				if (arg4[local37 - arg2][local41 - arg3]) {
					@Pc(78) int local78;
					if (super.aClass180ArrayArray3[local37][local41] != null) {
						@Pc(289) Class180 local289 = super.aClass180ArrayArray3[local37][local41];
						if (local289.aShort70 != -1 && (local289.aByte65 & 0x2) == 0 && local289.anInt5398 == 0) {
							local78 = super.aClass42_Sub2_18.method4538(local289.aShort70);
							arg5.method7523(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, Static282.method4653(local78, local289.anInt5397), Static282.method4653(local78, local289.anInt5396), Static282.method4653(local78, local289.anInt5399));
							arg5.method7523(local35, local35, local35 - 4, local31, local31 + 4, local31, Static282.method4653(local78, local289.anInt5395), Static282.method4653(local78, local289.anInt5399), Static282.method4653(local78, local289.anInt5396));
						} else if (local289.anInt5398 == 0) {
							arg5.method7511(local35 - 4, local35 - 4, local35, local31 + 4, local31, local31 + 4, local289.anInt5397, local289.anInt5396, local289.anInt5399);
							arg5.method7511(local35, local35, local35 - 4, local31, local31 + 4, local31, local289.anInt5395, local289.anInt5399, local289.anInt5396);
						} else {
							local78 = local289.anInt5398;
							arg5.method7511(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, Static456.method6870(local289.anInt5397 & 0xFF000000, local78), Static456.method6870(local289.anInt5396 & 0xFF000000, local78), Static456.method6870(local289.anInt5399 & 0xFF000000, local78));
							arg5.method7511(local35, local35, local35 - 4, local31, local31 + 4, local31, Static456.method6870(local289.anInt5395 & 0xFF000000, local78), Static456.method6870(local289.anInt5399 & 0xFF000000, local78), Static456.method6870(local289.anInt5396 & 0xFF000000, local78));
						}
					} else if (super.aClass245ArrayArray3[local37][local41] != null) {
						@Pc(76) Class245 local76 = super.aClass245ArrayArray3[local37][local41];
						for (local78 = 0; local78 < local76.aShort89; local78++) {
							arg1[local78] = local31 + local76.aShortArray102[local78] * 4 / super.anInt9451;
							arg0[local78] = local35 - local76.aShortArray97[local78] * 4 / super.anInt9451;
						}
						for (@Pc(116) int local116 = 0; local116 < local76.aShort90; local116++) {
							@Pc(122) int local122 = local116 * 3;
							@Pc(126) int local126 = local122 + 1;
							@Pc(130) int local130 = local126 + 1;
							@Pc(134) int local134 = arg1[local122];
							@Pc(138) int local138 = arg1[local126];
							@Pc(142) int local142 = arg1[local130];
							@Pc(146) int local146 = arg0[local122];
							@Pc(150) int local150 = arg0[local126];
							@Pc(154) int local154 = arg0[local130];
							@Pc(213) int local213;
							if (local76.anIntArray492 != null && local76.anIntArray492[local116] != 0 && (local76.aShortArray98 == null || local76.aShortArray98 != null && local76.aShortArray98[local116] == -1)) {
								local213 = local76.anIntArray492[local116];
								arg5.method7511(local146, local150, local154, local134, local138, local142, Static456.method6870(-(local76.anIntArray491[local122] & -16777216) - 16777216, local213), Static456.method6870(-(local76.anIntArray491[local126] & 0xFF000000) - 16777216, local213), Static456.method6870(-(local76.anIntArray491[local130] & 0xFF000000) - 16777216, local213));
							} else if (local76.aShortArray98 == null || local76.aShortArray98[local116] == -1) {
								arg5.method7511(local146, local150, local154, local134, local138, local142, local76.anIntArray491[local122], local76.anIntArray491[local126], local76.anIntArray491[local130]);
							} else {
								local213 = super.aClass42_Sub2_18.method4538(local76.aShortArray98[local116]);
								arg5.method7523(local146, local150, local154, local134, local138, local142, local213, local213, local213);
							}
						}
					}
				}
				local35 -= 4;
			}
			local31 += 4;
			local35 = local19;
		}
		arg5.aBoolean650 = true;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7836(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class54_Sub1 local9 = (Class54_Sub1) super.aClass42_Sub2_18.method4545(Thread.currentThread());
		@Pc(12) Class300 local12 = local9.aClass300_2;
		local12.aBoolean648 = false;
		local12.anInt9116 = 0;
		if (super.aClass180ArrayArray3 != null) {
			this.method5666(local9.anIntArray594, local9.anIntArray587, arg0, arg1, arg4, local12, arg3, arg2);
		} else if (super.aClass263ArrayArray3 != null) {
			this.method5671(arg2, arg4, arg3, local9.anIntArray587, local9.anIntArray594, local12, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([IIZ[I[IBILclient!vba;)V")
	private void method5669(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class300 arg6) {
		@Pc(12) Class180 local12 = super.aClass180ArrayArray3[arg5][arg1];
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(41) int local41;
		@Pc(486) int local486;
		@Pc(528) int local528;
		@Pc(612) int local612;
		@Pc(677) int local677;
		@Pc(497) int local497;
		@Pc(580) int local580;
		@Pc(644) int local644;
		@Pc(688) int local688;
		@Pc(455) int local455;
		@Pc(517) int local517;
		@Pc(569) int local569;
		@Pc(633) int local633;
		@Pc(475) int local475;
		@Pc(549) int local549;
		@Pc(601) int local601;
		@Pc(666) int local666;
		@Pc(120) int local120;
		@Pc(148) int local148;
		@Pc(174) int local174;
		@Pc(202) int local202;
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(234) int local234;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(86) int local86;
		@Pc(95) int local95;
		@Pc(324) int local324;
		if (local12 == null) {
			@Pc(1590) Class245 local1590 = super.aClass245ArrayArray3[arg5][arg1];
			if (local1590 != null) {
				if (super.anInt9463 == -1) {
					for (local677 = 0; local677 < local1590.aShort89; local677++) {
						local30 = local1590.aShortArray102[local677] + (arg5 << super.anInt9453);
						local35 = local1590.aShortArray100[local677];
						local41 = local1590.aShortArray97[local677] + (arg1 << super.anInt9453);
						local612 = (super.anInt9460 * local41 + local35 * super.anInt9467 + local30 * super.anInt9462 >> 15) + super.anInt9454;
						if (super.aClass42_Sub2_18.anInt5338 >= local612) {
							return;
						}
						arg4[local677] = 0;
						if (arg2) {
							local497 = local612 - super.aClass42_Sub2_18.anInt5349;
							if (local497 > 255) {
								local497 = 255;
							}
							if (local497 > 0) {
								arg4[local677] = local497;
								local580 = local497 * local1590.aShortArray101[local677] / 255;
								if (local580 > 0) {
									local35 -= local580;
								}
							}
						} else if (super.aClass42_Sub2_18.aBoolean414) {
							local497 = local612 - super.aClass42_Sub2_18.anInt5349;
							if (local497 > 0) {
								arg4[local677] = local497;
								if (arg4[local677] > 255) {
									arg4[local677] = 255;
								}
							}
						}
						local486 = (super.anInt9465 * local35 + local30 * super.anInt9464 + local41 * super.anInt9455 >> 15) + super.anInt9461;
						local528 = (local41 * super.anInt9457 + super.anInt9458 * local30 + super.anInt9456 * local35 >> 15) + super.anInt9459;
						arg0[local677] = arg6.anInt9120 + super.aClass42_Sub2_18.anInt5356 * local486 / local612;
						arg3[local677] = local528 * super.aClass42_Sub2_18.anInt5350 / local612 + arg6.anInt9117;
					}
				} else {
					for (local677 = 0; local677 < local1590.aShort89; local677++) {
						local30 = local1590.aShortArray102[local677] + (arg5 << super.anInt9453);
						local35 = local1590.aShortArray100[local677];
						local41 = local1590.aShortArray97[local677] + (arg1 << super.anInt9453);
						arg4[local677] = 0;
						if (arg2) {
							local497 = -super.aClass42_Sub2_18.anInt5349 + super.anInt9463;
							if (local497 > 255) {
								local497 = 255;
							}
							if (local497 > 0) {
								arg4[local677] = local497;
								local580 = local1590.aShortArray101[local677] * local497 / 255;
								if (local580 > 0) {
									local35 -= local580;
								}
							}
						} else if (super.aClass42_Sub2_18.aBoolean414) {
							local497 = -super.aClass42_Sub2_18.anInt5349 + super.anInt9463;
							if (local497 > 0) {
								arg4[local677] = local497;
								if (arg4[local677] > 255) {
									arg4[local677] = 255;
								}
							}
						}
						local528 = (super.anInt9457 * local41 + local30 * super.anInt9458 + super.anInt9456 * local35 >> 15) + super.anInt9459;
						local486 = (local35 * super.anInt9465 + local30 * super.anInt9464 + local41 * super.anInt9455 >> 15) + super.anInt9461;
						arg0[local677] = arg6.anInt9120 + local486 * super.aClass42_Sub2_18.anInt5356 / super.anInt9463;
						arg3[local677] = local528 * super.aClass42_Sub2_18.anInt5350 / super.anInt9463 + arg6.anInt9117;
					}
				}
				if (local1590.aShortArray98 == null) {
					for (local677 = 0; local677 < local1590.aShort90; local677++) {
						local497 = local677 * 3;
						local580 = local497 + 1;
						local644 = local580 + 1;
						local688 = arg0[local497];
						local455 = arg0[local580];
						local517 = arg0[local644];
						local569 = arg3[local497];
						local633 = arg3[local580];
						local475 = arg3[local644];
						local549 = arg4[local497] + arg4[local580] + arg4[local644];
						if ((local688 - local455) * (-local633 + local475) - (local517 - local455) * (local569 - local633) > 0) {
							arg6.aBoolean648 = local688 < 0 || local455 < 0 || local517 < 0 || local688 > arg6.anInt9119 || arg6.anInt9119 < local455 || arg6.anInt9119 < local517;
							if (local549 >= 765) {
								arg6.method7512(local569, local633, local475, local688, local455, local517, super.aClass42_Sub2_18.anInt5358);
							} else if (local549 > 0) {
								if ((local1590.anIntArray491[local497] & 0xFFFFFF) != 0) {
									arg6.method7511(local569, local633, local475, local688, local455, local517, Static254.method4368(local1590.anIntArray491[local497], super.aClass42_Sub2_18.anInt5358, arg4[local497]), Static254.method4368(local1590.anIntArray491[local580], super.aClass42_Sub2_18.anInt5358, arg4[local580]), Static254.method4368(local1590.anIntArray491[local644], super.aClass42_Sub2_18.anInt5358, arg4[local644]));
								}
							} else if ((local1590.anIntArray491[local497] & 0xFFFFFF) != 0) {
								arg6.method7511(local569, local633, local475, local688, local455, local517, local1590.anIntArray491[local497], local1590.anIntArray491[local580], local1590.anIntArray491[local644]);
							}
						}
					}
				} else {
					local677 = super.anIntArrayArray86[arg5][arg1];
					local497 = super.anIntArrayArray86[arg5 + 1][arg1];
					local580 = super.anIntArrayArray86[arg5][arg1 + 1];
					local644 = arg5 * super.anInt9451;
					local688 = local644 + super.anInt9451;
					local455 = arg1 * super.anInt9451;
					local517 = local455 + super.anInt9451;
					local569 = super.anInt9461 + (local677 * super.anInt9465 + local644 * super.anInt9464 + local455 * super.anInt9455 >> 15);
					local633 = super.anInt9459 + (super.anInt9458 * local644 + local677 * super.anInt9456 + super.anInt9457 * local455 >> 15);
					local475 = (local644 * super.anInt9462 + super.anInt9467 * local677 + super.anInt9460 * local455 >> 15) + super.anInt9454;
					local549 = super.anInt9461 + (local688 * super.anInt9464 + super.anInt9465 * local497 + local455 * super.anInt9455 >> 15);
					local601 = super.anInt9459 + (local455 * super.anInt9457 + super.anInt9458 * local688 + local497 * super.anInt9456 >> 15);
					local666 = super.anInt9454 + (local688 * super.anInt9462 + local497 * super.anInt9467 + local455 * super.anInt9460 >> 15);
					local120 = (local644 * super.anInt9464 + super.anInt9465 * local580 + super.anInt9455 * local517 >> 15) + super.anInt9461;
					local148 = super.anInt9459 + (local644 * super.anInt9458 + local580 * super.anInt9456 + local517 * super.anInt9457 >> 15);
					local174 = super.anInt9454 + (local517 * super.anInt9460 + local644 * super.anInt9462 + local580 * super.anInt9467 >> 15);
					for (local202 = 0; local202 < local1590.aShort90; local202++) {
						local43 = local202 * 3;
						local45 = local43 + 1;
						local47 = local45 + 1;
						local49 = arg0[local43];
						local234 = arg0[local45];
						local66 = arg0[local47];
						local75 = arg3[local43];
						local86 = arg3[local45];
						local95 = arg3[local47];
						local324 = arg4[local43] + arg4[local45] + arg4[local47];
						if ((local49 - local234) * (-local86 + local95) - (local66 - local234) * (-local86 + local75) > 0) {
							arg6.aBoolean648 = local49 < 0 || local234 < 0 || local66 < 0 || arg6.anInt9119 < local49 || arg6.anInt9119 < local234 || local66 > arg6.anInt9119;
							@Pc(2348) short local2348 = local1590.aShortArray98[local202];
							if (local324 < 765) {
								if (local2348 != -1 && this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local2348).aByte87)) {
									arg6.anInt9116 = 100;
								}
								if (local324 > 0) {
									if (local2348 != -1) {
										arg6.method7516(local75, local86, local95, local49, local234, local66, super.aClass42_Sub2_18.anInt5358, arg4[local43], arg4[local45], arg4[local47], local1590.anIntArray491[local43], local1590.anIntArray491[local45], local1590.anIntArray491[local47], local569, local549, local120, local633, local601, local148, local475, local666, local174, local2348);
									} else if ((local1590.anIntArray491[local43] & 0xFFFFFF) != 0) {
										arg6.method7511(local75, local86, local95, local49, local234, local66, Static456.method6870(super.aClass42_Sub2_18.anInt5358 | arg4[local43] << 24, local1590.anIntArray491[local43]), Static456.method6870(arg4[local45] << 24 | super.aClass42_Sub2_18.anInt5358, local1590.anIntArray491[local45]), Static456.method6870(super.aClass42_Sub2_18.anInt5358 | arg4[local47] << 24, local1590.anIntArray491[local47]));
									}
								} else if (local2348 != -1) {
									arg6.method7519(local75, local86, local95, local49, local234, local66, local1590.anIntArray491[local43], local1590.anIntArray491[local45], local1590.anIntArray491[local47], local569, local549, local120, local633, local601, local148, local475, local666, local174, local2348);
								} else if ((local1590.anIntArray491[local43] & 0xFFFFFF) != 0) {
									arg6.method7511(local75, local86, local95, local49, local234, local66, local1590.anIntArray491[local43], local1590.anIntArray491[local45], local1590.anIntArray491[local47]);
								}
								arg6.anInt9116 = 0;
							} else {
								arg6.method7512(local75, local86, local95, local49, local234, local66, super.aClass42_Sub2_18.anInt5358);
							}
						}
					}
				}
			}
		} else if ((local12.aByte65 & 0x2) == 0) {
			@Pc(25) int local25 = super.anInt9451 * arg5;
			local30 = super.anInt9451 + local25;
			local35 = arg1 * super.anInt9451;
			local41 = local35 + super.anInt9451;
			local43 = 0;
			local45 = 0;
			local47 = 0;
			local49 = 0;
			if ((local12.aByte65 & 0x1) == 0 || arg2) {
				local66 = super.anIntArrayArray86[arg5][arg1];
				local75 = super.anIntArrayArray86[arg5 + 1][arg1];
				local86 = super.anIntArrayArray86[arg5 + 1][arg1 + 1];
				local95 = super.anIntArrayArray86[arg5][arg1 + 1];
				if (super.anInt9463 == -1) {
					local120 = super.anInt9454 + (local35 * super.anInt9460 + local25 * super.anInt9462 + super.anInt9467 * local66 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local120) {
						return;
					}
					local148 = (super.anInt9462 * local30 + local75 * super.anInt9467 + local35 * super.anInt9460 >> 15) + super.anInt9454;
					if (local148 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local174 = (local41 * super.anInt9460 + local86 * super.anInt9467 + local30 * super.anInt9462 >> 15) + super.anInt9454;
					if (local174 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local202 = super.anInt9454 + (super.anInt9467 * local95 + local25 * super.anInt9462 + local41 * super.anInt9460 >> 15);
					if (local202 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
				} else {
					local202 = super.anInt9463;
					local174 = super.anInt9463;
					local148 = super.anInt9463;
					local120 = super.anInt9463;
				}
				if (arg2) {
					local234 = local120 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local43 = local234;
						local324 = local12.aShort71 * local234 / 255;
						if (local324 > 0) {
							local66 -= local324;
						}
					}
					local234 = local148 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local45 = local234;
						local324 = local12.aShort73 * local234 / 255;
						if (local324 > 0) {
							local75 -= local324;
						}
					}
					local234 = local174 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local47 = local234;
						local324 = local12.aShort74 * local234 / 255;
						if (local324 > 0) {
							local86 -= local324;
						}
					}
					local234 = local202 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 255) {
						local234 = 255;
					}
					if (local234 > 0) {
						local49 = local234;
						local324 = local234 * local12.aShort72 / 255;
						if (local324 > 0) {
							local95 -= local324;
						}
					}
				} else if (super.aClass42_Sub2_18.aBoolean414) {
					local234 = local120 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local43 = local234;
						if (local234 > 255) {
							local43 = 255;
						}
					}
					local234 = local148 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local45 = local234;
						if (local234 > 255) {
							local45 = 255;
						}
					}
					local234 = local174 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local47 = local234;
						if (local234 > 255) {
							local47 = 255;
						}
					}
					local234 = local202 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local49 = local234;
						if (local234 > 255) {
							local49 = 255;
						}
					}
				}
				local455 = super.anInt9461 + (super.anInt9464 * local25 + super.anInt9465 * local66 + local35 * super.anInt9455 >> 15);
				local475 = (local25 * super.anInt9458 + super.anInt9456 * local66 + super.anInt9457 * local35 >> 15) + super.anInt9459;
				local486 = local455 * super.aClass42_Sub2_18.anInt5356 / local120 + arg6.anInt9120;
				local497 = super.aClass42_Sub2_18.anInt5350 * local475 / local120 + arg6.anInt9117;
				local517 = (super.anInt9455 * local35 + local75 * super.anInt9465 + super.anInt9464 * local30 >> 15) + super.anInt9461;
				local528 = local517 * super.aClass42_Sub2_18.anInt5356 / local148 + arg6.anInt9120;
				local549 = super.anInt9459 + (super.anInt9457 * local35 + super.anInt9458 * local30 + super.anInt9456 * local75 >> 15);
				local569 = super.anInt9461 + (super.anInt9455 * local41 + local86 * super.anInt9465 + super.anInt9464 * local30 >> 15);
				local580 = arg6.anInt9117 + local549 * super.aClass42_Sub2_18.anInt5350 / local148;
				local601 = super.anInt9459 + (local86 * super.anInt9456 + super.anInt9458 * local30 + super.anInt9457 * local41 >> 15);
				local612 = super.aClass42_Sub2_18.anInt5356 * local569 / local174 + arg6.anInt9120;
				local633 = (super.anInt9464 * local25 + super.anInt9465 * local95 + super.anInt9455 * local41 >> 15) + super.anInt9461;
				local644 = local601 * super.aClass42_Sub2_18.anInt5350 / local174 + arg6.anInt9117;
				local666 = super.anInt9459 + (super.anInt9458 * local25 + local95 * super.anInt9456 + local41 * super.anInt9457 >> 15);
				local677 = arg6.anInt9120 + local633 * super.aClass42_Sub2_18.anInt5356 / local202;
				local688 = super.aClass42_Sub2_18.anInt5350 * local666 / local202 + arg6.anInt9117;
			} else {
				local66 = super.anIntArrayArray86[arg5][arg1];
				if (super.anInt9463 == -1) {
					local75 = super.anInt9467 * local66;
					local120 = super.anInt9454 + (super.anInt9462 * local25 + local75 + local35 * super.anInt9460 >> 15);
					if (super.aClass42_Sub2_18.anInt5338 >= local120) {
						return;
					}
					local148 = super.anInt9454 + (local75 + local30 * super.anInt9462 + super.anInt9460 * local35 >> 15);
					if (local148 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
					local174 = (local75 + local30 * super.anInt9462 + super.anInt9460 * local41 >> 15) + super.anInt9454;
					if (super.aClass42_Sub2_18.anInt5338 >= local174) {
						return;
					}
					local202 = super.anInt9454 + (super.anInt9462 * local25 + local75 + super.anInt9460 * local41 >> 15);
					if (local202 <= super.aClass42_Sub2_18.anInt5338) {
						return;
					}
				} else {
					local202 = super.anInt9463;
					local174 = super.anInt9463;
					local148 = super.anInt9463;
					local120 = super.anInt9463;
				}
				if (super.aClass42_Sub2_18.aBoolean414) {
					local234 = local120 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local43 = local234;
						if (local234 > 255) {
							local43 = 255;
						}
					}
					local234 = local148 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local45 = local234;
						if (local234 > 255) {
							local45 = 255;
						}
					}
					local234 = local174 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local47 = local234;
						if (local234 > 255) {
							local47 = 255;
						}
					}
					local234 = local202 - super.aClass42_Sub2_18.anInt5349;
					if (local234 > 0) {
						local49 = local234;
						if (local234 > 255) {
							local49 = 255;
						}
					}
				}
				local75 = local66 * super.anInt9465;
				local455 = super.anInt9461 + (local25 * super.anInt9464 + local75 + local35 * super.anInt9455 >> 15);
				local86 = super.anInt9456 * local66;
				local475 = super.anInt9459 + (local86 + local25 * super.anInt9458 + super.anInt9457 * local35 >> 15);
				local486 = super.aClass42_Sub2_18.anInt5356 * local455 / local120 + arg6.anInt9120;
				local497 = local475 * super.aClass42_Sub2_18.anInt5350 / local120 + arg6.anInt9117;
				local517 = super.anInt9461 + (local75 + local30 * super.anInt9464 + local35 * super.anInt9455 >> 15);
				local528 = arg6.anInt9120 + local517 * super.aClass42_Sub2_18.anInt5356 / local148;
				local549 = super.anInt9459 + (local30 * super.anInt9458 + local86 + super.anInt9457 * local35 >> 15);
				local580 = local549 * super.aClass42_Sub2_18.anInt5350 / local148 + arg6.anInt9117;
				local569 = (super.anInt9455 * local41 + local30 * super.anInt9464 + local75 >> 15) + super.anInt9461;
				local612 = super.aClass42_Sub2_18.anInt5356 * local569 / local174 + arg6.anInt9120;
				local601 = (local86 + local30 * super.anInt9458 + local41 * super.anInt9457 >> 15) + super.anInt9459;
				local644 = arg6.anInt9117 + local601 * super.aClass42_Sub2_18.anInt5350 / local174;
				local633 = (super.anInt9464 * local25 + local75 + super.anInt9455 * local41 >> 15) + super.anInt9461;
				local666 = super.anInt9459 + (local86 + local25 * super.anInt9458 + super.anInt9457 * local41 >> 15);
				local677 = super.aClass42_Sub2_18.anInt5356 * local633 / local202 + arg6.anInt9120;
				local688 = arg6.anInt9117 + super.aClass42_Sub2_18.anInt5350 * local666 / local202;
			}
			@Pc(1162) boolean local1162 = local12.aShort70 != -1 && this.method7844(super.aClass42_Sub2_18.anInterface11_11.method6215(local12.aShort70).aByte87);
			local75 = local49 + local47 + local45;
			if (-((local528 - local677) * (-local688 + local644)) + (local580 - local688) * (-local677 + local612) > 0) {
				arg6.aBoolean648 = local612 < 0 || local677 < 0 || local528 < 0 || arg6.anInt9119 < local612 || local677 > arg6.anInt9119 || local528 > arg6.anInt9119;
				if (local75 < 765) {
					if (local1162) {
						arg6.anInt9116 = 100;
					}
					if (local75 > 0) {
						if (local12.aShort70 < 0) {
							arg6.method7511(local644, local688, local580, local612, local677, local528, Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local47 << 24, local12.anInt5397), Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local49 << 24, local12.anInt5396), Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local45 << 24, local12.anInt5399));
						} else {
							arg6.method7516(local644, local688, local580, local612, local677, local528, super.aClass42_Sub2_18.anInt5358, local47, local49, local45, local12.anInt5397, local12.anInt5396, local12.anInt5399, local569, local633, local517, local601, local666, local549, local174, local202, local148, local12.aShort70);
						}
					} else if (local12.aShort70 >= 0) {
						arg6.method7519(local644, local688, local580, local612, local677, local528, local12.anInt5397, local12.anInt5396, local12.anInt5399, local569, local633, local517, local601, local666, local549, local174, local202, local148, local12.aShort70);
					} else {
						arg6.method7511(local644, local688, local580, local612, local677, local528, local12.anInt5397, local12.anInt5396, local12.anInt5399);
					}
					arg6.anInt9116 = 0;
				} else {
					arg6.method7512(local644, local688, local580, local612, local677, local528, super.aClass42_Sub2_18.anInt5358);
				}
			}
			local75 = local45 + local43 + local49;
			if ((local688 - local580) * (-local528 + local486) - (local497 - local580) * (-local528 + local677) > 0) {
				arg6.aBoolean648 = local486 < 0 || local528 < 0 || local677 < 0 || arg6.anInt9119 < local486 || local528 > arg6.anInt9119 || local677 > arg6.anInt9119;
				if (local75 >= 765) {
					arg6.method7512(local497, local580, local688, local486, local528, local677, super.aClass42_Sub2_18.anInt5358);
					return;
				}
				if (local1162) {
					arg6.anInt9116 = 100;
				}
				if (local75 <= 0) {
					if (local12.aShort70 >= 0) {
						arg6.method7519(local497, local580, local688, local486, local528, local677, local12.anInt5395, local12.anInt5399, local12.anInt5396, local455, local517, local633, local475, local549, local666, local120, local148, local202, local12.aShort70);
					} else {
						arg6.method7511(local497, local580, local688, local486, local528, local677, local12.anInt5395, local12.anInt5399, local12.anInt5396);
					}
				} else if (local12.aShort70 < 0) {
					arg6.method7511(local497, local580, local688, local486, local528, local677, Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local43 << 24, local12.anInt5395), Static456.method6870(local45 << 24 | super.aClass42_Sub2_18.anInt5358, local12.anInt5399), Static456.method6870(super.aClass42_Sub2_18.anInt5358 | local49 << 24, local12.anInt5396));
				} else {
					arg6.method7516(local497, local580, local688, local486, local528, local677, super.aClass42_Sub2_18.anInt5358, local43, local45, local49, local12.anInt5395, local12.anInt5399, local12.anInt5396, local455, local517, local633, local475, local549, local666, local120, local148, local202, local12.aShort70);
				}
				arg6.anInt9116 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V")
	@Override
	public void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class54_Sub1 local9 = (Class54_Sub1) super.aClass42_Sub2_18.method4545(Thread.currentThread());
		local9.aClass300_2.anInt9116 = 0;
		if (super.aClass180ArrayArray3 != null) {
			this.method5669(local9.anIntArray587, arg1, super.aClass42_Sub2_18.aBoolean413, local9.anIntArray594, local9.anIntArray589, arg0, local9.aClass300_2);
		} else if (super.aClass263ArrayArray3 != null) {
			this.method5665(arg1, local9.anIntArray589, local9.aClass300_2, local9.anIntArray587, local9.anIntArray594, arg0);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II[[ZIIZ[I[ILclient!vba;III)V")
	private void method5671(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int[] arg3, @OriginalArg(7) int[] arg4, @OriginalArg(8) Class300 arg5, @OriginalArg(9) int arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg2 - arg6) * 1024 / 256;
		arg5.aBoolean650 = false;
		arg5.aBoolean646 = false;
		@Pc(26) int local26 = 0;
		@Pc(31) int local31 = local14;
		for (@Pc(33) int local33 = arg7; local33 < arg0; local33++) {
			for (@Pc(37) int local37 = arg6; local37 < arg2; local37++) {
				if (arg1[local33 - arg7][local37 - arg6]) {
					@Pc(85) int local85;
					if (super.aClass263ArrayArray3[local33][local37] != null) {
						@Pc(64) Class263 local64 = super.aClass263ArrayArray3[local33][local37];
						if (local64.aShort93 != -1 && (local64.aByte81 & 0x2) == 0 && local64.anInt7960 == -1) {
							local85 = super.aClass42_Sub2_18.method4538(local64.aShort93);
							arg5.method7523(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, Static282.method4653(local85, local64.aShort95 & 0xFFFF), Static282.method4653(local85, local64.aShort94 & 0xFFFF), Static282.method4653(local85, local64.aShort91 & 0xFFFF));
							arg5.method7523(local31, local31, local31 - 4, local26, local26 + 4, local26, Static282.method4653(local85, local64.aShort92 & 0xFFFF), Static282.method4653(local85, local64.aShort91 & 0xFFFF), Static282.method4653(local85, local64.aShort94 & 0xFFFF));
						} else if (local64.anInt7960 == -1) {
							arg5.method7523(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, local64.aShort95 & 0xFFFF, local64.aShort94 & 0xFFFF, local64.aShort91 & 0xFFFF);
							arg5.method7523(local31, local31, local31 - 4, local26, local26 + 4, local26, local64.aShort92 & 0xFFFF, local64.aShort91 & 0xFFFF, local64.aShort94 & 0xFFFF);
						} else {
							local85 = local64.anInt7960;
							arg5.method7523(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, local85, local85, local85);
							arg5.method7523(local31, local31, local31 - 4, local26, local26 + 4, local26, local85, local85, local85);
						}
					} else if (super.aClass289ArrayArray3[local33][local37] != null) {
						@Pc(281) Class289 local281 = super.aClass289ArrayArray3[local33][local37];
						for (local85 = 0; local85 < local281.aShort107; local85++) {
							arg3[local85] = local26 + local281.aShortArray117[local85] * 4 / super.anInt9451;
							arg4[local85] = local31 - local281.aShortArray120[local85] * 4 / super.anInt9451;
						}
						for (@Pc(321) int local321 = 0; local321 < local281.aShort106; local321++) {
							@Pc(328) short local328 = local281.aShortArray123[local321];
							@Pc(333) short local333 = local281.aShortArray124[local321];
							@Pc(338) short local338 = local281.aShortArray125[local321];
							@Pc(342) int local342 = arg3[local328];
							@Pc(346) int local346 = arg3[local333];
							@Pc(350) int local350 = arg3[local338];
							@Pc(354) int local354 = arg4[local328];
							@Pc(358) int local358 = arg4[local333];
							@Pc(362) int local362 = arg4[local338];
							@Pc(385) int local385;
							if (local281.anIntArray647 != null && local281.anIntArray647[local321] != -1) {
								local385 = local281.anIntArray647[local321];
								arg5.method7523(local354, local358, local362, local342, local346, local350, Static282.method4653(local385, local281.aShortArray122[local328]), Static282.method4653(local385, local281.aShortArray122[local333]), Static282.method4653(local385, local281.aShortArray122[local338]));
							} else if (local281.aShortArray119 == null || local281.aShortArray119[local321] == -1) {
								local385 = local281.anIntArray648[local321];
								arg5.method7523(local354, local358, local362, local342, local346, local350, Static282.method4653(local385, local281.aShortArray122[local328]), Static282.method4653(local385, local281.aShortArray122[local333]), Static282.method4653(local385, local281.aShortArray122[local338]));
							} else {
								local385 = super.aClass42_Sub2_18.method4538(local281.aShortArray119[local321]);
								arg5.method7523(local354, local358, local362, local342, local346, local350, Static282.method4653(local385, local281.aShortArray122[local328]), Static282.method4653(local385, local281.aShortArray122[local333]), Static282.method4653(local385, local281.aShortArray122[local338]));
							}
						}
					}
				}
				local31 -= 4;
			}
			local31 = local14;
			local26 += 4;
		}
		arg5.aBoolean650 = true;
	}
}
