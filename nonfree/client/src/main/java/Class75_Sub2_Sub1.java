import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class75_Sub2_Sub1 extends Class75_Sub2 {

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!fg;IIII[[I[[II)V")
	public Class75_Sub2_Sub1(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[ILclient!ida;B[IIIIII[[ZI)V")
	private void method2282(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class128 arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) boolean[][] arg7) {
		@Pc(14) int local14 = (arg5 - arg4) * 1024 / 256;
		arg1.aBoolean276 = false;
		arg1.aBoolean278 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(36) int local36 = arg6; local36 < arg3; local36++) {
			for (@Pc(40) int local40 = arg4; local40 < arg5; local40++) {
				if (arg7[local36 - arg6][local40 - arg4]) {
					@Pc(77) int local77;
					if (super.aClass152ArrayArray3[local36][local40] != null) {
						@Pc(290) Class152 local290 = super.aClass152ArrayArray3[local36][local40];
						if (local290.aShort90 != -1 && (local290.aByte63 & 0x2) == 0 && local290.anInt4285 == 0) {
							local77 = super.aClass39_Sub1_16.method2049(local290.aShort90);
							arg1.method3241(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, Static35.method704(local290.anInt4288, local77), Static35.method704(local290.anInt4287, local77), Static35.method704(local290.anInt4284, local77));
							arg1.method3241(local30, local30, local30 - 4, local26, local26 + 4, local26, Static35.method704(local290.anInt4286, local77), Static35.method704(local290.anInt4284, local77), Static35.method704(local290.anInt4287, local77));
						} else if (local290.anInt4285 == 0) {
							arg1.method3237(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, local290.anInt4288, local290.anInt4287, local290.anInt4284);
							arg1.method3237(local30, local30, local30 - 4, local26, local26 + 4, local26, local290.anInt4286, local290.anInt4284, local290.anInt4287);
						} else {
							local77 = local290.anInt4285;
							arg1.method3237(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, Static114.method2231(local290.anInt4288 & 0xFF000000, local77), Static114.method2231(local290.anInt4287 & 0xFF000000, local77), Static114.method2231(local290.anInt4284 & 0xFF000000, local77));
							arg1.method3237(local30, local30, local30 - 4, local26, local26 + 4, local26, Static114.method2231(local290.anInt4286 & 0xFF000000, local77), Static114.method2231(local290.anInt4284 & 0xFF000000, local77), Static114.method2231(local290.anInt4287 & 0xFF000000, local77));
						}
					} else if (super.aClass294ArrayArray3[local36][local40] != null) {
						@Pc(75) Class294 local75 = super.aClass294ArrayArray3[local36][local40];
						for (local77 = 0; local77 < local75.aShort151; local77++) {
							arg2[local77] = local26 + local75.aShortArray127[local77] * 4 / super.anInt7994;
							arg0[local77] = local30 - local75.aShortArray128[local77] * 4 / super.anInt7994;
						}
						for (@Pc(116) int local116 = 0; local116 < local75.aShort150; local116++) {
							@Pc(122) int local122 = local116 * 3;
							@Pc(126) int local126 = local122 + 1;
							@Pc(130) int local130 = local126 + 1;
							@Pc(134) int local134 = arg2[local122];
							@Pc(138) int local138 = arg2[local126];
							@Pc(142) int local142 = arg2[local130];
							@Pc(146) int local146 = arg0[local122];
							@Pc(150) int local150 = arg0[local126];
							@Pc(154) int local154 = arg0[local130];
							@Pc(215) int local215;
							if (local75.anIntArray676 != null && local75.anIntArray676[local116] != 0 && (local75.aShortArray126 == null || local75.aShortArray126 != null && local75.aShortArray126[local116] == -1)) {
								local215 = local75.anIntArray676[local116];
								arg1.method3237(local146, local150, local154, local134, local138, local142, Static114.method2231(-(local75.anIntArray677[local122] & 0xFF000000) - 16777216, local215), Static114.method2231(-(local75.anIntArray677[local126] & 0xFF000000) - 16777216, local215), Static114.method2231(-(-16777216 & local75.anIntArray677[local130]) - 16777216, local215));
							} else if (local75.aShortArray126 == null || local75.aShortArray126[local116] == -1) {
								arg1.method3237(local146, local150, local154, local134, local138, local142, local75.anIntArray677[local122], local75.anIntArray677[local126], local75.anIntArray677[local130]);
							} else {
								local215 = super.aClass39_Sub1_16.method2049(local75.aShortArray126[local116]);
								arg1.method3241(local146, local150, local154, local134, local138, local142, local215, local215, local215);
							}
						}
					}
				}
				local30 -= 4;
			}
			local26 += 4;
			local30 = local14;
		}
		arg1.aBoolean278 = true;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "([II[IIII[[ZLclient!ida;IIII)V")
	private void method2283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean[][] arg4, @OriginalArg(7) Class128 arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(14) int local14 = (arg1 - arg7) * 1024 / 256;
		arg5.aBoolean278 = false;
		arg5.aBoolean276 = false;
		@Pc(26) int local26 = 0;
		@Pc(31) int local31 = local14;
		for (@Pc(33) int local33 = arg6; local33 < arg3; local33++) {
			for (@Pc(37) int local37 = arg7; local37 < arg1; local37++) {
				if (arg4[local33 - arg6][local37 - arg7]) {
					@Pc(148) int local148;
					if (super.aClass121ArrayArray3[local33][local37] != null) {
						@Pc(65) Class121 local65 = super.aClass121ArrayArray3[local33][local37];
						if (local65.aShort63 != -1 && (local65.aByte51 & 0x2) == 0 && local65.anInt3408 == -1) {
							local148 = super.aClass39_Sub1_16.method2049(local65.aShort63);
							arg5.method3241(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, Static35.method704(local65.aShort61 & 0xFFFF, local148), Static35.method704(local65.aShort65 & 0xFFFF, local148), Static35.method704(local65.aShort62 & 0xFFFF, local148));
							arg5.method3241(local31, local31, local31 - 4, local26, local26 + 4, local26, Static35.method704(local65.aShort64 & 0xFFFF, local148), Static35.method704(local65.aShort62 & 0xFFFF, local148), Static35.method704(local65.aShort65 & 0xFFFF, local148));
						} else if (local65.anInt3408 == -1) {
							arg5.method3241(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, local65.aShort61 & 0xFFFF, local65.aShort65 & 0xFFFF, local65.aShort62 & 0xFFFF);
							arg5.method3241(local31, local31, local31 - 4, local26, local26 + 4, local26, local65.aShort64 & 0xFFFF, local65.aShort62 & 0xFFFF, local65.aShort65 & 0xFFFF);
						} else {
							local148 = local65.anInt3408;
							arg5.method3241(local31 - 4, local31 + -4, local31, local26 + 4, local26, local26 + 4, local148, local148, local148);
							arg5.method3241(local31, local31, local31 - 4, local26, local26 + 4, local26, local148, local148, local148);
						}
					} else if (super.aClass312ArrayArray3[local33][local37] != null) {
						@Pc(282) Class312 local282 = super.aClass312ArrayArray3[local33][local37];
						for (local148 = 0; local148 < local282.aShort163; local148++) {
							arg2[local148] = local282.aShortArray149[local148] * 4 / super.anInt7994 + local26;
							arg0[local148] = local31 - local282.aShortArray148[local148] * 4 / super.anInt7994;
						}
						for (@Pc(326) int local326 = 0; local326 < local282.aShort162; local326++) {
							@Pc(333) short local333 = local282.aShortArray150[local326];
							@Pc(338) short local338 = local282.aShortArray145[local326];
							@Pc(343) short local343 = local282.aShortArray147[local326];
							@Pc(347) int local347 = arg2[local333];
							@Pc(351) int local351 = arg2[local338];
							@Pc(355) int local355 = arg2[local343];
							@Pc(359) int local359 = arg0[local333];
							@Pc(363) int local363 = arg0[local338];
							@Pc(367) int local367 = arg0[local343];
							@Pc(392) int local392;
							if (local282.anIntArray754 != null && local282.anIntArray754[local326] != -1) {
								local392 = local282.anIntArray754[local326];
								arg5.method3241(local359, local363, local367, local347, local351, local355, Static35.method704(local282.aShortArray146[local333], local392), Static35.method704(local282.aShortArray146[local338], local392), Static35.method704(local282.aShortArray146[local343], local392));
							} else if (local282.aShortArray144 == null || local282.aShortArray144[local326] == -1) {
								local392 = local282.anIntArray753[local326];
								arg5.method3241(local359, local363, local367, local347, local351, local355, Static35.method704(local282.aShortArray146[local333], local392), Static35.method704(local282.aShortArray146[local338], local392), Static35.method704(local282.aShortArray146[local343], local392));
							} else {
								local392 = super.aClass39_Sub1_16.method2049(local282.aShortArray144[local326]);
								arg5.method3241(local359, local363, local367, local347, local351, local355, Static35.method704(local282.aShortArray146[local333], local392), Static35.method704(local282.aShortArray146[local338], local392), Static35.method704(local282.aShortArray146[local343], local392));
							}
						}
					}
				}
				local31 -= 4;
			}
			local31 = local14;
			local26 += 4;
		}
		arg5.aBoolean278 = true;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[I[IILclient!ida;Z[I)V")
	private void method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(6) int[] arg5) {
		@Pc(12) Class121 local12 = super.aClass121ArrayArray3[arg0][arg3];
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(243) int local243;
		@Pc(327) int local327;
		@Pc(371) int local371;
		@Pc(436) int local436;
		@Pc(469) int local469;
		@Pc(232) int local232;
		@Pc(294) int local294;
		@Pc(360) int local360;
		@Pc(424) int local424;
		@Pc(263) int local263;
		@Pc(315) int local315;
		@Pc(392) int local392;
		@Pc(458) int local458;
		@Pc(109) int local109;
		@Pc(135) int local135;
		@Pc(166) int local166;
		@Pc(196) int local196;
		@Pc(84) int local84;
		@Pc(274) int local274;
		@Pc(339) int local339;
		@Pc(404) int local404;
		if (local12 == null) {
			@Pc(1102) Class312 local1102 = super.aClass312ArrayArray3[arg0][arg3];
			if (local1102 != null) {
				@Pc(1128) short local1128;
				if (super.anInt8004 == -1) {
					for (local436 = 0; local436 < local1102.aShort163; local436++) {
						local30 = local1102.aShortArray149[local436] + (arg0 << super.anInt7996);
						local1128 = local1102.aShortArray151[local436];
						local40 = local1102.aShortArray148[local436] + (arg3 << super.anInt7996);
						local371 = super.anInt8010 + (super.anInt8006 * local40 + super.anInt8009 * local1128 + super.anInt8001 * local30 >> 15);
						if (super.aClass39_Sub1_16.anInt2059 >= local371) {
							return;
						}
						local327 = super.anInt8000 + (super.anInt8012 * local40 + super.anInt8002 * local1128 + local30 * super.anInt8003 >> 15);
						local243 = (local1128 * super.anInt8007 + super.anInt8005 * local30 + super.anInt8008 * local40 >> 15) + super.anInt7999;
						arg5[local436] = arg4.anInt3635 + local243 * super.aClass39_Sub1_16.anInt2078 / local371;
						arg2[local436] = arg4.anInt3634 + local327 * super.aClass39_Sub1_16.anInt2064 / local371;
					}
				} else {
					for (local436 = 0; local436 < local1102.aShort163; local436++) {
						local30 = local1102.aShortArray149[local436] + (arg0 << super.anInt7996);
						local1128 = local1102.aShortArray151[local436];
						local40 = local1102.aShortArray148[local436] + (arg3 << super.anInt7996);
						local243 = (super.anInt8005 * local30 + local1128 * super.anInt8007 + super.anInt8008 * local40 >> 15) + super.anInt7999;
						local327 = super.anInt8000 + (local40 * super.anInt8012 + local1128 * super.anInt8002 + super.anInt8003 * local30 >> 15);
						arg5[local436] = local243 * super.aClass39_Sub1_16.anInt2078 / super.anInt8004 + arg4.anInt3635;
						arg2[local436] = arg4.anInt3634 + super.aClass39_Sub1_16.anInt2064 * local327 / super.anInt8004;
					}
				}
				if (local1102.aShortArray144 == null) {
					for (local436 = 0; local436 < local1102.aShort162; local436++) {
						@Pc(1799) short local1799 = local1102.aShortArray150[local436];
						@Pc(1804) short local1804 = local1102.aShortArray145[local436];
						@Pc(1809) short local1809 = local1102.aShortArray147[local436];
						local469 = arg5[local1799];
						local232 = arg5[local1804];
						local294 = arg5[local1809];
						local360 = arg2[local1799];
						local424 = arg2[local1804];
						local263 = arg2[local1809];
						if (-((local294 - local232) * (-local424 + local360)) + (local263 - local424) * (local469 + -local232) > 0) {
							local315 = local1102.anIntArray753[local436];
							if (local315 != -1) {
								arg4.aBoolean280 = local469 < 0 || local232 < 0 || local294 < 0 || arg4.anInt3632 < local469 || arg4.anInt3632 < local232 || local294 > arg4.anInt3632;
								arg4.method3241(local360, local424, local263, local469, local232, local294, Static35.method704(local1102.aShortArray146[local1799], local315), Static35.method704(local1102.aShortArray146[local1804], local315), Static35.method704(local1102.aShortArray146[local1809], local315));
							}
						}
					}
				} else {
					local436 = super.anIntArrayArray70[arg0][arg3];
					local274 = super.anIntArrayArray70[arg0 + 1][arg3];
					local339 = super.anIntArrayArray70[arg0][arg3 + 1];
					local404 = super.anInt7994 * arg0;
					local469 = local404 + super.anInt7994;
					local232 = super.anInt7994 * arg3;
					local294 = local232 + super.anInt7994;
					local360 = super.anInt7999 + (super.anInt8008 * local232 + super.anInt8005 * local404 + super.anInt8007 * local436 >> 15);
					local424 = (local232 * super.anInt8012 + local404 * super.anInt8003 + local436 * super.anInt8002 >> 15) + super.anInt8000;
					local263 = super.anInt8010 + (local232 * super.anInt8006 + super.anInt8001 * local404 + super.anInt8009 * local436 >> 15);
					local315 = super.anInt7999 + (local232 * super.anInt8008 + local469 * super.anInt8005 + local274 * super.anInt8007 >> 15);
					local392 = super.anInt8000 + (local232 * super.anInt8012 + local274 * super.anInt8002 + local469 * super.anInt8003 >> 15);
					local458 = super.anInt8010 + (local232 * super.anInt8006 + super.anInt8001 * local469 + local274 * super.anInt8009 >> 15);
					local109 = super.anInt7999 + (local404 * super.anInt8005 + local339 * super.anInt8007 + local294 * super.anInt8008 >> 15);
					local135 = super.anInt8000 + (local339 * super.anInt8002 + local404 * super.anInt8003 + local294 * super.anInt8012 >> 15);
					local166 = super.anInt8010 + (local404 * super.anInt8001 + local339 * super.anInt8009 + local294 * super.anInt8006 >> 15);
					for (local196 = 0; local196 < local1102.aShort162; local196++) {
						@Pc(1600) short local1600 = local1102.aShortArray150[local196];
						@Pc(1605) short local1605 = local1102.aShortArray145[local196];
						@Pc(1610) short local1610 = local1102.aShortArray147[local196];
						local84 = arg5[local1600];
						@Pc(1618) int local1618 = arg5[local1605];
						@Pc(1622) int local1622 = arg5[local1610];
						@Pc(1626) int local1626 = arg2[local1600];
						@Pc(1630) int local1630 = arg2[local1605];
						@Pc(1634) int local1634 = arg2[local1610];
						if (-((local1626 - local1630) * (local1622 + -local1618)) + (local84 - local1618) * (-local1630 + local1634) > 0) {
							arg4.aBoolean280 = local84 < 0 || local1618 < 0 || local1622 < 0 || arg4.anInt3632 < local84 || arg4.anInt3632 < local1618 || local1622 > arg4.anInt3632;
							@Pc(1696) short local1696 = local1102.aShortArray144[local196];
							if (local1696 == -1) {
								@Pc(1704) int local1704 = local1102.anIntArray753[local196];
								if (local1704 != -1) {
									arg4.method3241(local1626, local1630, local1634, local84, local1618, local1622, Static35.method704(local1102.aShortArray146[local1600], local1704), Static35.method704(local1102.aShortArray146[local1605], local1704), Static35.method704(local1102.aShortArray146[local1610], local1704));
								}
							} else {
								if (this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local1696).aByte85)) {
									arg4.anInt3633 = 100;
								}
								arg4.method3248(local1626, local1630, local1634, local84, local1618, local1622, local1102.aShortArray146[local1600], local1102.aShortArray146[local1605], local1102.aShortArray146[local1610], local360, local315, local109, local424, local392, local135, local263, local458, local166, local1696);
								arg4.anInt3633 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte51 & 0x2) == 0) {
			@Pc(25) int local25 = arg0 * super.anInt7994;
			local30 = super.anInt7994 + local25;
			@Pc(35) int local35 = arg3 * super.anInt7994;
			local40 = local35 + super.anInt7994;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(75) int local75;
			if ((local12.aByte51 & 0x1) == 0) {
				local55 = super.anIntArrayArray70[arg0][arg3];
				local64 = super.anIntArrayArray70[arg0 + 1][arg3];
				local75 = super.anIntArrayArray70[arg0 + 1][arg3 + 1];
				local84 = super.anIntArrayArray70[arg0][arg3 + 1];
				if (super.anInt8004 == -1) {
					local109 = super.anInt8010 + (local55 * super.anInt8009 + local25 * super.anInt8001 + local35 * super.anInt8006 >> 15);
					if (local109 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local135 = (super.anInt8006 * local35 + super.anInt8001 * local30 + super.anInt8009 * local64 >> 15) + super.anInt8010;
					if (local135 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local166 = (super.anInt8001 * local30 + super.anInt8009 * local75 + super.anInt8006 * local40 >> 15) + super.anInt8010;
					if (local166 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local196 = super.anInt8010 + (local40 * super.anInt8006 + super.anInt8009 * local84 + super.anInt8001 * local25 >> 15);
					if (super.aClass39_Sub1_16.anInt2059 >= local196) {
						return;
					}
				} else {
					local196 = super.anInt8004;
					local166 = super.anInt8004;
					local135 = super.anInt8004;
					local109 = super.anInt8004;
				}
				local232 = (super.anInt8005 * local25 + local55 * super.anInt8007 + super.anInt8008 * local35 >> 15) + super.anInt7999;
				local243 = arg4.anInt3635 + local232 * super.aClass39_Sub1_16.anInt2078 / local109;
				local263 = super.anInt8000 + (local25 * super.anInt8003 + local55 * super.anInt8002 + local35 * super.anInt8012 >> 15);
				local274 = arg4.anInt3634 + local263 * super.aClass39_Sub1_16.anInt2064 / local109;
				local294 = super.anInt7999 + (super.anInt8008 * local35 + local30 * super.anInt8005 + super.anInt8007 * local64 >> 15);
				local315 = super.anInt8000 + (super.anInt8002 * local64 + local30 * super.anInt8003 + local35 * super.anInt8012 >> 15);
				local327 = arg4.anInt3635 + super.aClass39_Sub1_16.anInt2078 * local294 / local135;
				local339 = arg4.anInt3634 + local315 * super.aClass39_Sub1_16.anInt2064 / local135;
				local360 = super.anInt7999 + (local75 * super.anInt8007 + local30 * super.anInt8005 + super.anInt8008 * local40 >> 15);
				local371 = arg4.anInt3635 + local360 * super.aClass39_Sub1_16.anInt2078 / local166;
				local392 = super.anInt8000 + (super.anInt8003 * local30 + local75 * super.anInt8002 + local40 * super.anInt8012 >> 15);
				local404 = arg4.anInt3634 + local392 * super.aClass39_Sub1_16.anInt2064 / local166;
				local424 = (local25 * super.anInt8005 + super.anInt8007 * local84 + super.anInt8008 * local40 >> 15) + super.anInt7999;
				local436 = arg4.anInt3635 + super.aClass39_Sub1_16.anInt2078 * local424 / local196;
				local458 = (local25 * super.anInt8003 + local84 * super.anInt8002 + super.anInt8012 * local40 >> 15) + super.anInt8000;
				local469 = local458 * super.aClass39_Sub1_16.anInt2064 / local196 + arg4.anInt3634;
			} else {
				local55 = super.anIntArrayArray70[arg0][arg3];
				if (super.anInt8004 == -1) {
					local64 = super.anInt8009 * local55;
					local109 = (local64 + local25 * super.anInt8001 + super.anInt8006 * local35 >> 15) + super.anInt8010;
					if (super.aClass39_Sub1_16.anInt2059 >= local109) {
						return;
					}
					local135 = (local35 * super.anInt8006 + local64 + super.anInt8001 * local30 >> 15) + super.anInt8010;
					if (super.aClass39_Sub1_16.anInt2059 >= local135) {
						return;
					}
					local166 = super.anInt8010 + (local64 + super.anInt8001 * local30 + super.anInt8006 * local40 >> 15);
					if (super.aClass39_Sub1_16.anInt2059 >= local166) {
						return;
					}
					local196 = (local40 * super.anInt8006 + super.anInt8001 * local25 + local64 >> 15) + super.anInt8010;
					if (local196 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
				} else {
					local196 = super.anInt8004;
					local166 = super.anInt8004;
					local135 = super.anInt8004;
					local109 = super.anInt8004;
				}
				local64 = local55 * super.anInt8007;
				local75 = super.anInt8002 * local55;
				local232 = (super.anInt8008 * local35 + local64 + super.anInt8005 * local25 >> 15) + super.anInt7999;
				local243 = arg4.anInt3635 + local232 * super.aClass39_Sub1_16.anInt2078 / local109;
				local263 = super.anInt8000 + (local25 * super.anInt8003 + local75 + local35 * super.anInt8012 >> 15);
				local274 = arg4.anInt3634 + super.aClass39_Sub1_16.anInt2064 * local263 / local109;
				local294 = super.anInt7999 + (local30 * super.anInt8005 + local64 + super.anInt8008 * local35 >> 15);
				local327 = local294 * super.aClass39_Sub1_16.anInt2078 / local135 + arg4.anInt3635;
				local315 = (local75 + local30 * super.anInt8003 + local35 * super.anInt8012 >> 15) + super.anInt8000;
				local360 = super.anInt7999 + (super.anInt8008 * local40 + local64 + super.anInt8005 * local30 >> 15);
				local339 = super.aClass39_Sub1_16.anInt2064 * local315 / local135 + arg4.anInt3634;
				local392 = super.anInt8000 + (local75 + super.anInt8003 * local30 + super.anInt8012 * local40 >> 15);
				local371 = arg4.anInt3635 + super.aClass39_Sub1_16.anInt2078 * local360 / local166;
				local404 = local392 * super.aClass39_Sub1_16.anInt2064 / local166 + arg4.anInt3634;
				local424 = super.anInt7999 + (local64 + local25 * super.anInt8005 + super.anInt8008 * local40 >> 15);
				local458 = super.anInt8000 + (super.anInt8012 * local40 + local25 * super.anInt8003 + local75 >> 15);
				local436 = arg4.anInt3635 + local424 * super.aClass39_Sub1_16.anInt2078 / local196;
				local469 = arg4.anInt3634 + local458 * super.aClass39_Sub1_16.anInt2064 / local196;
			}
			if (-((local404 - local469) * (-local436 + local327)) + (local339 - local469) * (-local436 + local371) > 0) {
				arg4.aBoolean280 = local371 < 0 || local436 < 0 || local327 < 0 || arg4.anInt3632 < local371 || local436 > arg4.anInt3632 || arg4.anInt3632 < local327;
				if (local12.aShort63 >= 0) {
					if (this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local12.aShort63).aByte85)) {
						arg4.anInt3633 = 100;
					}
					arg4.method3248(local404, local469, local339, local371, local436, local327, local12.aShort61 & 0xFFFF, local12.aShort65 & 0xFFFF, local12.aShort62 & 0xFFFF, local232, local294, local424, local263, local315, local458, local109, local135, local196, local12.aShort63);
					arg4.anInt3633 = 0;
				} else {
					arg4.method3241(local404, local469, local339, local371, local436, local327, local12.aShort61 & 0xFFFF, local12.aShort65 & 0xFFFF, local12.aShort62 & 0xFFFF);
				}
			}
			if (-((local274 - local339) * (local436 + -local327)) + (local469 - local339) * (local243 - local327) > 0) {
				arg4.aBoolean280 = local243 < 0 || local327 < 0 || local436 < 0 || local243 > arg4.anInt3632 || local327 > arg4.anInt3632 || arg4.anInt3632 < local436;
				if (local12.aShort63 < 0) {
					arg4.method3241(local274, local339, local469, local243, local327, local436, local12.aShort64 & 0xFFFF, local12.aShort62 & 0xFFFF, local12.aShort65 & 0xFFFF);
					return;
				}
				if (this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local12.aShort63).aByte85)) {
					arg4.anInt3633 = 100;
				}
				arg4.method3248(local274, local339, local469, local243, local327, local436, local12.aShort64 & 0xFFFF, local12.aShort62 & 0xFFFF, local12.aShort65 & 0xFFFF, local232, local294, local424, local263, local315, local458, local109, local135, local196, local12.aShort63);
				arg4.anInt3633 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6698(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class76_Sub2 local9 = (Class76_Sub2) super.aClass39_Sub1_16.method2050(Thread.currentThread());
		@Pc(12) Class128 local12 = local9.aClass128_2;
		local12.anInt3633 = 0;
		local12.aBoolean280 = false;
		if (super.aClass152ArrayArray3 != null) {
			this.method2282(local9.anIntArray544, local12, local9.anIntArray546, arg2, arg1, arg3, arg0, arg4);
		} else if (super.aClass121ArrayArray3 != null) {
			this.method2283(local9.anIntArray544, arg3, local9.anIntArray546, arg2, arg4, local12, arg0, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
	@Override
	public void method6699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class76_Sub2 local9 = (Class76_Sub2) super.aClass39_Sub1_16.method2050(Thread.currentThread());
		local9.aClass128_2.anInt3633 = 0;
		if (super.aClass152ArrayArray3 != null) {
			this.method2287(arg1, arg0, local9.anIntArray544, local9.aClass128_2, super.aClass39_Sub1_16.aBoolean155, local9.anIntArray539, local9.anIntArray546);
		} else if (super.aClass121ArrayArray3 != null) {
			this.method2285(arg0, local9.anIntArray539, local9.anIntArray544, arg1, local9.aClass128_2, local9.anIntArray546);
			return;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III[ILclient!ida;Z[I[I)V")
	private void method2287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class152 local12 = super.aClass152ArrayArray3[arg1][arg0];
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(41) int local41;
		@Pc(466) int local466;
		@Pc(530) int local530;
		@Pc(595) int local595;
		@Pc(658) int local658;
		@Pc(498) int local498;
		@Pc(583) int local583;
		@Pc(647) int local647;
		@Pc(691) int local691;
		@Pc(455) int local455;
		@Pc(519) int local519;
		@Pc(572) int local572;
		@Pc(635) int local635;
		@Pc(487) int local487;
		@Pc(551) int local551;
		@Pc(615) int local615;
		@Pc(679) int local679;
		@Pc(108) int local108;
		@Pc(107) int local107;
		@Pc(105) int local105;
		@Pc(103) int local103;
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(236) int local236;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(86) int local86;
		@Pc(95) int local95;
		@Pc(254) int local254;
		if (local12 == null) {
			@Pc(1595) Class294 local1595 = super.aClass294ArrayArray3[arg1][arg0];
			if (local1595 != null) {
				if (super.anInt8004 == -1) {
					for (local658 = 0; local658 < local1595.aShort151; local658++) {
						local30 = local1595.aShortArray127[local658] + (arg1 << super.anInt7996);
						local35 = local1595.aShortArray125[local658];
						local41 = local1595.aShortArray128[local658] + (arg0 << super.anInt7996);
						local595 = super.anInt8010 + (super.anInt8001 * local30 + local35 * super.anInt8009 + local41 * super.anInt8006 >> 15);
						if (local595 <= super.aClass39_Sub1_16.anInt2059) {
							return;
						}
						arg5[local658] = 0;
						if (arg4) {
							local498 = local595 - super.aClass39_Sub1_16.anInt2076;
							if (local498 > 255) {
								local498 = 255;
							}
							if (local498 > 0) {
								arg5[local658] = local498;
								local583 = local498 * local1595.aShortArray129[local658] / 255;
								if (local583 > 0) {
									local35 -= local583;
								}
							}
						} else if (super.aClass39_Sub1_16.aBoolean156) {
							local498 = local595 - super.aClass39_Sub1_16.anInt2076;
							if (local498 > 0) {
								arg5[local658] = local498;
								if (arg5[local658] > 255) {
									arg5[local658] = 255;
								}
							}
						}
						local466 = (super.anInt8007 * local35 + super.anInt8005 * local30 + local41 * super.anInt8008 >> 15) + super.anInt7999;
						local530 = (super.anInt8012 * local41 + local30 * super.anInt8003 + super.anInt8002 * local35 >> 15) + super.anInt8000;
						arg6[local658] = local466 * super.aClass39_Sub1_16.anInt2078 / local595 + arg3.anInt3635;
						arg2[local658] = arg3.anInt3634 + super.aClass39_Sub1_16.anInt2064 * local530 / local595;
					}
				} else {
					for (local658 = 0; local658 < local1595.aShort151; local658++) {
						local30 = local1595.aShortArray127[local658] + (arg1 << super.anInt7996);
						local35 = local1595.aShortArray125[local658];
						local41 = local1595.aShortArray128[local658] + (arg0 << super.anInt7996);
						arg5[local658] = 0;
						if (arg4) {
							local498 = super.anInt8004 - super.aClass39_Sub1_16.anInt2076;
							if (local498 > 255) {
								local498 = 255;
							}
							if (local498 > 0) {
								arg5[local658] = local498;
								local583 = local498 * local1595.aShortArray129[local658] / 255;
								if (local583 > 0) {
									local35 -= local583;
								}
							}
						} else if (super.aClass39_Sub1_16.aBoolean156) {
							local498 = super.anInt8004 - super.aClass39_Sub1_16.anInt2076;
							if (local498 > 0) {
								arg5[local658] = local498;
								if (arg5[local658] > 255) {
									arg5[local658] = 255;
								}
							}
						}
						local530 = (super.anInt8003 * local30 + local35 * super.anInt8002 + super.anInt8012 * local41 >> 15) + super.anInt8000;
						local466 = (local35 * super.anInt8007 + local30 * super.anInt8005 + super.anInt8008 * local41 >> 15) + super.anInt7999;
						arg6[local658] = arg3.anInt3635 + super.aClass39_Sub1_16.anInt2078 * local466 / super.anInt8004;
						arg2[local658] = arg3.anInt3634 + local530 * super.aClass39_Sub1_16.anInt2064 / super.anInt8004;
					}
				}
				if (local1595.aShortArray126 == null) {
					for (local658 = 0; local658 < local1595.aShort150; local658++) {
						local498 = local658 * 3;
						local583 = local498 + 1;
						local647 = local583 + 1;
						local691 = arg6[local498];
						local455 = arg6[local583];
						local519 = arg6[local647];
						local572 = arg2[local498];
						local635 = arg2[local583];
						local487 = arg2[local647];
						local551 = arg5[local583] + arg5[local498] + arg5[local647];
						if ((local691 - local455) * (local487 - local635) - (local519 - local455) * (-local635 + local572) > 0) {
							arg3.aBoolean280 = local691 < 0 || local455 < 0 || local519 < 0 || local691 > arg3.anInt3632 || arg3.anInt3632 < local455 || local519 > arg3.anInt3632;
							if (local551 >= 765) {
								arg3.method3246(local572, local635, local487, local691, local455, local519, super.aClass39_Sub1_16.anInt2085);
							} else if (local551 > 0) {
								if ((local1595.anIntArray677[local498] & 0xFFFFFF) != 0) {
									arg3.method3237(local572, local635, local487, local691, local455, local519, Static21.method552(super.aClass39_Sub1_16.anInt2085, local1595.anIntArray677[local498], arg5[local498]), Static21.method552(super.aClass39_Sub1_16.anInt2085, local1595.anIntArray677[local583], arg5[local583]), Static21.method552(super.aClass39_Sub1_16.anInt2085, local1595.anIntArray677[local647], arg5[local647]));
								}
							} else if ((local1595.anIntArray677[local498] & 0xFFFFFF) != 0) {
								arg3.method3237(local572, local635, local487, local691, local455, local519, local1595.anIntArray677[local498], local1595.anIntArray677[local583], local1595.anIntArray677[local647]);
							}
						}
					}
				} else {
					local658 = super.anIntArrayArray70[arg1][arg0];
					local498 = super.anIntArrayArray70[arg1 + 1][arg0];
					local583 = super.anIntArrayArray70[arg1][arg0 + 1];
					local647 = arg1 * super.anInt7994;
					local691 = super.anInt7994 + local647;
					local455 = super.anInt7994 * arg0;
					local519 = super.anInt7994 + local455;
					local572 = (local647 * super.anInt8005 + local658 * super.anInt8007 + local455 * super.anInt8008 >> 15) + super.anInt7999;
					local635 = super.anInt8000 + (local455 * super.anInt8012 + super.anInt8003 * local647 + super.anInt8002 * local658 >> 15);
					local487 = super.anInt8010 + (local647 * super.anInt8001 + super.anInt8009 * local658 + super.anInt8006 * local455 >> 15);
					local551 = super.anInt7999 + (local455 * super.anInt8008 + local691 * super.anInt8005 + local498 * super.anInt8007 >> 15);
					local615 = super.anInt8000 + (super.anInt8002 * local498 + local691 * super.anInt8003 + local455 * super.anInt8012 >> 15);
					local679 = super.anInt8010 + (super.anInt8009 * local498 + super.anInt8001 * local691 + local455 * super.anInt8006 >> 15);
					local108 = (super.anInt8008 * local519 + local647 * super.anInt8005 + super.anInt8007 * local583 >> 15) + super.anInt7999;
					local107 = (local519 * super.anInt8012 + super.anInt8002 * local583 + local647 * super.anInt8003 >> 15) + super.anInt8000;
					local105 = (local519 * super.anInt8006 + super.anInt8001 * local647 + local583 * super.anInt8009 >> 15) + super.anInt8010;
					for (local103 = 0; local103 < local1595.aShort150; local103++) {
						local43 = local103 * 3;
						local45 = local43 + 1;
						local47 = local45 + 1;
						local49 = arg6[local43];
						local236 = arg6[local45];
						local66 = arg6[local47];
						local75 = arg2[local43];
						local86 = arg2[local45];
						local95 = arg2[local47];
						local254 = arg5[local47] + arg5[local45] + arg5[local43];
						if (-((local75 - local86) * (-local236 + local66)) + (local95 - local86) * (local49 - local236) > 0) {
							arg3.aBoolean280 = local49 < 0 || local236 < 0 || local66 < 0 || arg3.anInt3632 < local49 || local236 > arg3.anInt3632 || local66 > arg3.anInt3632;
							@Pc(2560) short local2560 = local1595.aShortArray126[local103];
							if (local254 < 765) {
								if (local2560 != -1 && this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local2560).aByte85)) {
									arg3.anInt3633 = 100;
								}
								if (local254 <= 0) {
									if (local2560 != -1) {
										arg3.method3248(local75, local86, local95, local49, local236, local66, local1595.anIntArray677[local43], local1595.anIntArray677[local45], local1595.anIntArray677[local47], local572, local551, local108, local635, local615, local107, local487, local679, local105, local2560);
									} else if ((local1595.anIntArray677[local43] & 0xFFFFFF) != 0) {
										arg3.method3237(local75, local86, local95, local49, local236, local66, local1595.anIntArray677[local43], local1595.anIntArray677[local45], local1595.anIntArray677[local47]);
									}
								} else if (local2560 != -1) {
									arg3.method3245(local75, local86, local95, local49, local236, local66, super.aClass39_Sub1_16.anInt2085, arg5[local43], arg5[local45], arg5[local47], local1595.anIntArray677[local43], local1595.anIntArray677[local45], local1595.anIntArray677[local47], local572, local551, local108, local635, local615, local107, local487, local679, local105, local2560);
								} else if ((local1595.anIntArray677[local43] & 0xFFFFFF) != 0) {
									arg3.method3237(local75, local86, local95, local49, local236, local66, Static114.method2231(super.aClass39_Sub1_16.anInt2085 | arg5[local43] << 24, local1595.anIntArray677[local43]), Static114.method2231(arg5[local45] << 24 | super.aClass39_Sub1_16.anInt2085, local1595.anIntArray677[local45]), Static114.method2231(super.aClass39_Sub1_16.anInt2085 | arg5[local47] << 24, local1595.anIntArray677[local47]));
								}
								arg3.anInt3633 = 0;
							} else {
								arg3.method3246(local75, local86, local95, local49, local236, local66, super.aClass39_Sub1_16.anInt2085);
							}
						}
					}
				}
			}
		} else if ((local12.aByte63 & 0x2) == 0) {
			@Pc(25) int local25 = super.anInt7994 * arg1;
			local30 = super.anInt7994 + local25;
			local35 = super.anInt7994 * arg0;
			local41 = local35 + super.anInt7994;
			local43 = 0;
			local45 = 0;
			local47 = 0;
			local49 = 0;
			if ((local12.aByte63 & 0x1) == 0 || arg4) {
				local66 = super.anIntArrayArray70[arg1][arg0];
				local75 = super.anIntArrayArray70[arg1 + 1][arg0];
				local86 = super.anIntArrayArray70[arg1 + 1][arg0 + 1];
				local95 = super.anIntArrayArray70[arg1][arg0 + 1];
				if (super.anInt8004 == -1) {
					local108 = super.anInt8010 + (super.anInt8009 * local66 + local25 * super.anInt8001 + super.anInt8006 * local35 >> 15);
					if (super.aClass39_Sub1_16.anInt2059 >= local108) {
						return;
					}
					local107 = super.anInt8010 + (super.anInt8006 * local35 + local75 * super.anInt8009 + local30 * super.anInt8001 >> 15);
					if (local107 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local105 = super.anInt8010 + (local41 * super.anInt8006 + local30 * super.anInt8001 + super.anInt8009 * local86 >> 15);
					if (local105 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local103 = (local41 * super.anInt8006 + super.anInt8009 * local95 + local25 * super.anInt8001 >> 15) + super.anInt8010;
					if (local103 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
				} else {
					local103 = super.anInt8004;
					local105 = super.anInt8004;
					local107 = super.anInt8004;
					local108 = super.anInt8004;
				}
				if (arg4) {
					local236 = local108 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local43 = local236;
						local254 = local12.aShort93 * local236 / 255;
						if (local254 > 0) {
							local66 -= local254;
						}
					}
					local236 = local107 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local45 = local236;
						local254 = local12.aShort91 * local236 / 255;
						if (local254 > 0) {
							local75 -= local254;
						}
					}
					local236 = local105 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local47 = local236;
						local254 = local12.aShort92 * local236 / 255;
						if (local254 > 0) {
							local86 -= local254;
						}
					}
					local236 = local103 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 255) {
						local236 = 255;
					}
					if (local236 > 0) {
						local49 = local236;
						local254 = local236 * local12.aShort94 / 255;
						if (local254 > 0) {
							local95 -= local254;
						}
					}
				} else if (super.aClass39_Sub1_16.aBoolean156) {
					local236 = local108 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local43 = local236;
						if (local236 > 255) {
							local43 = 255;
						}
					}
					local236 = local107 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local45 = local236;
						if (local236 > 255) {
							local45 = 255;
						}
					}
					local236 = local105 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local47 = local236;
						if (local236 > 255) {
							local47 = 255;
						}
					}
					local236 = local103 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local49 = local236;
						if (local236 > 255) {
							local49 = 255;
						}
					}
				}
				local455 = (super.anInt8008 * local35 + local25 * super.anInt8005 + local66 * super.anInt8007 >> 15) + super.anInt7999;
				local466 = local455 * super.aClass39_Sub1_16.anInt2078 / local108 + arg3.anInt3635;
				local487 = (local66 * super.anInt8002 + super.anInt8003 * local25 + super.anInt8012 * local35 >> 15) + super.anInt8000;
				local498 = arg3.anInt3634 + local487 * super.aClass39_Sub1_16.anInt2064 / local108;
				local519 = super.anInt7999 + (super.anInt8007 * local75 + super.anInt8005 * local30 + super.anInt8008 * local35 >> 15);
				local530 = arg3.anInt3635 + local519 * super.aClass39_Sub1_16.anInt2078 / local107;
				local551 = (super.anInt8012 * local35 + local30 * super.anInt8003 + local75 * super.anInt8002 >> 15) + super.anInt8000;
				local572 = super.anInt7999 + (local41 * super.anInt8008 + super.anInt8005 * local30 + local86 * super.anInt8007 >> 15);
				local583 = super.aClass39_Sub1_16.anInt2064 * local551 / local107 + arg3.anInt3634;
				local595 = arg3.anInt3635 + local572 * super.aClass39_Sub1_16.anInt2078 / local105;
				local615 = super.anInt8000 + (local41 * super.anInt8012 + local86 * super.anInt8002 + local30 * super.anInt8003 >> 15);
				local635 = super.anInt7999 + (local41 * super.anInt8008 + super.anInt8005 * local25 + super.anInt8007 * local95 >> 15);
				local647 = arg3.anInt3634 + super.aClass39_Sub1_16.anInt2064 * local615 / local105;
				local658 = arg3.anInt3635 + local635 * super.aClass39_Sub1_16.anInt2078 / local103;
				local679 = super.anInt8000 + (super.anInt8012 * local41 + local95 * super.anInt8002 + local25 * super.anInt8003 >> 15);
				local691 = arg3.anInt3634 + super.aClass39_Sub1_16.anInt2064 * local679 / local103;
			} else {
				local66 = super.anIntArrayArray70[arg1][arg0];
				if (super.anInt8004 == -1) {
					local75 = super.anInt8009 * local66;
					local108 = (local25 * super.anInt8001 + local75 + super.anInt8006 * local35 >> 15) + super.anInt8010;
					if (local108 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local107 = (local75 + local30 * super.anInt8001 + super.anInt8006 * local35 >> 15) + super.anInt8010;
					if (local107 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local105 = (local75 + super.anInt8001 * local30 + local41 * super.anInt8006 >> 15) + super.anInt8010;
					if (local105 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local103 = (local41 * super.anInt8006 + super.anInt8001 * local25 + local75 >> 15) + super.anInt8010;
					if (local103 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
				} else {
					local103 = super.anInt8004;
					local105 = super.anInt8004;
					local107 = super.anInt8004;
					local108 = super.anInt8004;
				}
				if (super.aClass39_Sub1_16.aBoolean156) {
					local236 = local108 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local43 = local236;
						if (local236 > 255) {
							local43 = 255;
						}
					}
					local236 = local107 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local45 = local236;
						if (local236 > 255) {
							local45 = 255;
						}
					}
					local236 = local105 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local47 = local236;
						if (local236 > 255) {
							local47 = 255;
						}
					}
					local236 = local103 - super.aClass39_Sub1_16.anInt2076;
					if (local236 > 0) {
						local49 = local236;
						if (local236 > 255) {
							local49 = 255;
						}
					}
				}
				local75 = local66 * super.anInt8007;
				local86 = super.anInt8002 * local66;
				local455 = (super.anInt8008 * local35 + local75 + local25 * super.anInt8005 >> 15) + super.anInt7999;
				local466 = super.aClass39_Sub1_16.anInt2078 * local455 / local108 + arg3.anInt3635;
				local487 = super.anInt8000 + (super.anInt8003 * local25 + local86 + local35 * super.anInt8012 >> 15);
				local498 = super.aClass39_Sub1_16.anInt2064 * local487 / local108 + arg3.anInt3634;
				local519 = super.anInt7999 + (super.anInt8008 * local35 + local75 + local30 * super.anInt8005 >> 15);
				local551 = (super.anInt8003 * local30 + local86 + local35 * super.anInt8012 >> 15) + super.anInt8000;
				local530 = super.aClass39_Sub1_16.anInt2078 * local519 / local107 + arg3.anInt3635;
				local572 = (super.anInt8005 * local30 + local75 + local41 * super.anInt8008 >> 15) + super.anInt7999;
				local583 = super.aClass39_Sub1_16.anInt2064 * local551 / local107 + arg3.anInt3634;
				local615 = super.anInt8000 + (local86 + super.anInt8003 * local30 + super.anInt8012 * local41 >> 15);
				local595 = local572 * super.aClass39_Sub1_16.anInt2078 / local105 + arg3.anInt3635;
				local635 = super.anInt7999 + (super.anInt8008 * local41 + local25 * super.anInt8005 + local75 >> 15);
				local647 = super.aClass39_Sub1_16.anInt2064 * local615 / local105 + arg3.anInt3634;
				local679 = (super.anInt8003 * local25 + local86 + local41 * super.anInt8012 >> 15) + super.anInt8000;
				local658 = super.aClass39_Sub1_16.anInt2078 * local635 / local103 + arg3.anInt3635;
				local691 = arg3.anInt3634 + super.aClass39_Sub1_16.anInt2064 * local679 / local103;
			}
			@Pc(1158) boolean local1158 = local12.aShort90 != -1 && this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local12.aShort90).aByte85);
			local75 = local49 + local45 + local47;
			if ((local595 - local658) * (local583 + -local691) - (local647 - local691) * (-local658 + local530) > 0) {
				arg3.aBoolean280 = local595 < 0 || local658 < 0 || local530 < 0 || local595 > arg3.anInt3632 || local658 > arg3.anInt3632 || arg3.anInt3632 < local530;
				if (local75 >= 765) {
					arg3.method3246(local647, local691, local583, local595, local658, local530, super.aClass39_Sub1_16.anInt2085);
				} else {
					if (local1158) {
						arg3.anInt3633 = 100;
					}
					if (local75 <= 0) {
						if (local12.aShort90 < 0) {
							arg3.method3237(local647, local691, local583, local595, local658, local530, local12.anInt4288, local12.anInt4287, local12.anInt4284);
						} else {
							arg3.method3248(local647, local691, local583, local595, local658, local530, local12.anInt4288, local12.anInt4287, local12.anInt4284, local572, local635, local519, local615, local679, local551, local105, local103, local107, local12.aShort90);
						}
					} else if (local12.aShort90 < 0) {
						arg3.method3237(local647, local691, local583, local595, local658, local530, Static114.method2231(super.aClass39_Sub1_16.anInt2085 | local47 << 24, local12.anInt4288), Static114.method2231(local49 << 24 | super.aClass39_Sub1_16.anInt2085, local12.anInt4287), Static114.method2231(local45 << 24 | super.aClass39_Sub1_16.anInt2085, local12.anInt4284));
					} else {
						arg3.method3245(local647, local691, local583, local595, local658, local530, super.aClass39_Sub1_16.anInt2085, local47, local49, local45, local12.anInt4288, local12.anInt4287, local12.anInt4284, local572, local635, local519, local615, local679, local551, local105, local103, local107, local12.aShort90);
					}
					arg3.anInt3633 = 0;
				}
			}
			local75 = local43 + local45 + local49;
			if ((local691 - local583) * (-local530 + local466) - (local498 - local583) * (-local530 + local658) > 0) {
				arg3.aBoolean280 = local466 < 0 || local530 < 0 || local658 < 0 || arg3.anInt3632 < local466 || arg3.anInt3632 < local530 || local658 > arg3.anInt3632;
				if (local75 < 765) {
					if (local1158) {
						arg3.anInt3633 = 100;
					}
					if (local75 <= 0) {
						if (local12.aShort90 >= 0) {
							arg3.method3248(local498, local583, local691, local466, local530, local658, local12.anInt4286, local12.anInt4284, local12.anInt4287, local455, local519, local635, local487, local551, local679, local108, local107, local103, local12.aShort90);
						} else {
							arg3.method3237(local498, local583, local691, local466, local530, local658, local12.anInt4286, local12.anInt4284, local12.anInt4287);
						}
					} else if (local12.aShort90 < 0) {
						arg3.method3237(local498, local583, local691, local466, local530, local658, Static114.method2231(local43 << 24 | super.aClass39_Sub1_16.anInt2085, local12.anInt4286), Static114.method2231(super.aClass39_Sub1_16.anInt2085 | local45 << 24, local12.anInt4284), Static114.method2231(super.aClass39_Sub1_16.anInt2085 | local49 << 24, local12.anInt4287));
					} else {
						arg3.method3245(local498, local583, local691, local466, local530, local658, super.aClass39_Sub1_16.anInt2085, local43, local45, local49, local12.anInt4286, local12.anInt4284, local12.anInt4287, local455, local519, local635, local487, local551, local679, local108, local107, local103, local12.aShort90);
					}
					arg3.anInt3633 = 0;
					return;
				}
				arg3.method3246(local498, local583, local691, local466, local530, local658, super.aClass39_Sub1_16.anInt2085);
			}
		}
	}
}
