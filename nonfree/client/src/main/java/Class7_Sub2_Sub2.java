import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class7_Sub2_Sub2 extends Class7_Sub2 {

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!hr;IIII[[I[[II)V")
	public Class7_Sub2_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([I[I[IILclient!ee;II)V")
	private void method8255(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class80 arg4, @OriginalArg(5) int arg5) {
		@Pc(12) Class122 local12 = super.aClass122ArrayArray3[arg5][arg3];
		@Pc(47) int local47;
		@Pc(57) int local57;
		@Pc(267) int local267;
		@Pc(331) int local331;
		@Pc(414) int local414;
		@Pc(479) int local479;
		@Pc(490) int local490;
		@Pc(255) int local255;
		@Pc(320) int local320;
		@Pc(372) int local372;
		@Pc(436) int local436;
		@Pc(287) int local287;
		@Pc(351) int local351;
		@Pc(403) int local403;
		@Pc(468) int local468;
		@Pc(122) int local122;
		@Pc(154) int local154;
		@Pc(184) int local184;
		@Pc(216) int local216;
		@Pc(98) int local98;
		@Pc(298) int local298;
		@Pc(383) int local383;
		@Pc(447) int local447;
		if (local12 == null) {
			@Pc(1121) Class50 local1121 = super.aClass50ArrayArray3[arg5][arg3];
			if (local1121 != null) {
				@Pc(1147) short local1147;
				if (super.anInt9579 == -1) {
					for (local479 = 0; local479 < local1121.aShort19; local479++) {
						local47 = local1121.aShortArray9[local479] + (arg5 << super.anInt9573);
						local1147 = local1121.aShortArray12[local479];
						local57 = local1121.aShortArray11[local479] + (arg3 << super.anInt9573);
						local414 = (local57 * super.anInt9583 + local47 * super.anInt9582 + local1147 * super.anInt9581 >> 15) + super.anInt9584;
						if (super.aClass4_Sub1_18.anInt2868 >= local414) {
							return;
						}
						local267 = super.anInt9588 + (local57 * super.anInt9590 + local47 * super.anInt9589 + local1147 * super.anInt9585 >> 15);
						local331 = (local1147 * super.anInt9587 + local47 * super.anInt9578 + local57 * super.anInt9586 >> 15) + super.anInt9591;
						arg1[local479] = super.aClass4_Sub1_18.anInt2890 * local267 / local414 + arg4.anInt2213;
						arg2[local479] = arg4.anInt2210 + super.aClass4_Sub1_18.anInt2897 * local331 / local414;
					}
				} else {
					for (local479 = 0; local479 < local1121.aShort19; local479++) {
						local47 = local1121.aShortArray9[local479] + (arg5 << super.anInt9573);
						local1147 = local1121.aShortArray12[local479];
						local57 = local1121.aShortArray11[local479] + (arg3 << super.anInt9573);
						local331 = super.anInt9591 + (super.anInt9578 * local47 + local1147 * super.anInt9587 + super.anInt9586 * local57 >> 15);
						local267 = super.anInt9588 + (local47 * super.anInt9589 + super.anInt9585 * local1147 + local57 * super.anInt9590 >> 15);
						arg1[local479] = local267 * super.aClass4_Sub1_18.anInt2890 / super.anInt9579 + arg4.anInt2213;
						arg2[local479] = arg4.anInt2210 + local331 * super.aClass4_Sub1_18.anInt2897 / super.anInt9579;
					}
				}
				if (local1121.aShortArray10 == null) {
					for (local479 = 0; local479 < local1121.aShort18; local479++) {
						@Pc(1822) short local1822 = local1121.aShortArray13[local479];
						@Pc(1827) short local1827 = local1121.aShortArray8[local479];
						@Pc(1832) short local1832 = local1121.aShortArray14[local479];
						local490 = arg1[local1822];
						local255 = arg1[local1827];
						local320 = arg1[local1832];
						local372 = arg2[local1822];
						local436 = arg2[local1827];
						local287 = arg2[local1832];
						if ((local287 - local436) * (-local255 + local490) - (local372 - local436) * (-local255 + local320) > 0) {
							local351 = local1121.anIntArray102[local479];
							if (local351 != -1) {
								arg4.aBoolean186 = local490 < 0 || local255 < 0 || local320 < 0 || local490 > arg4.anInt2211 || arg4.anInt2211 < local255 || arg4.anInt2211 < local320;
								arg4.method2127(local372, local436, local287, local490, local255, local320, Static171.method3198(local1121.aShortArray7[local1822], local351), Static171.method3198(local1121.aShortArray7[local1827], local351), Static171.method3198(local1121.aShortArray7[local1832], local351));
							}
						}
					}
				} else {
					local479 = super.anIntArrayArray126[arg5][arg3];
					local298 = super.anIntArrayArray126[arg5 + 1][arg3];
					local383 = super.anIntArrayArray126[arg5][arg3 + 1];
					local447 = arg5 * super.anInt9576;
					local490 = local447 + super.anInt9576;
					local255 = super.anInt9576 * arg3;
					local320 = local255 + super.anInt9576;
					local372 = super.anInt9588 + (local255 * super.anInt9590 + super.anInt9585 * local479 + super.anInt9589 * local447 >> 15);
					local436 = super.anInt9591 + (super.anInt9586 * local255 + local447 * super.anInt9578 + local479 * super.anInt9587 >> 15);
					local287 = super.anInt9584 + (local479 * super.anInt9581 + super.anInt9582 * local447 + super.anInt9583 * local255 >> 15);
					local351 = super.anInt9588 + (local255 * super.anInt9590 + local298 * super.anInt9585 + super.anInt9589 * local490 >> 15);
					local403 = super.anInt9591 + (local255 * super.anInt9586 + local490 * super.anInt9578 + local298 * super.anInt9587 >> 15);
					local468 = (super.anInt9583 * local255 + local490 * super.anInt9582 + super.anInt9581 * local298 >> 15) + super.anInt9584;
					local122 = (super.anInt9590 * local320 + local447 * super.anInt9589 + super.anInt9585 * local383 >> 15) + super.anInt9588;
					local154 = super.anInt9591 + (super.anInt9578 * local447 + local383 * super.anInt9587 + local320 * super.anInt9586 >> 15);
					local184 = super.anInt9584 + (super.anInt9581 * local383 + local447 * super.anInt9582 + super.anInt9583 * local320 >> 15);
					for (local216 = 0; local216 < local1121.aShort18; local216++) {
						@Pc(1621) short local1621 = local1121.aShortArray13[local216];
						@Pc(1626) short local1626 = local1121.aShortArray8[local216];
						@Pc(1631) short local1631 = local1121.aShortArray14[local216];
						local98 = arg1[local1621];
						@Pc(1639) int local1639 = arg1[local1626];
						@Pc(1643) int local1643 = arg1[local1631];
						@Pc(1647) int local1647 = arg2[local1621];
						@Pc(1651) int local1651 = arg2[local1626];
						@Pc(1655) int local1655 = arg2[local1631];
						if ((local98 - local1639) * (local1655 - local1651) - (local1643 - local1639) * (local1647 + -local1651) > 0) {
							arg4.aBoolean186 = local98 < 0 || local1639 < 0 || local1643 < 0 || arg4.anInt2211 < local98 || local1639 > arg4.anInt2211 || arg4.anInt2211 < local1643;
							@Pc(1714) short local1714 = local1121.aShortArray10[local216];
							if (local1714 == -1) {
								@Pc(1722) int local1722 = local1121.anIntArray102[local216];
								if (local1722 != -1) {
									arg4.method2127(local1647, local1651, local1655, local98, local1639, local1643, Static171.method3198(local1121.aShortArray7[local1621], local1722), Static171.method3198(local1121.aShortArray7[local1626], local1722), Static171.method3198(local1121.aShortArray7[local1631], local1722));
								}
							} else {
								if (this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local1714).aByte104)) {
									arg4.anInt2209 = 100;
								}
								arg4.method2123(local1647, local1651, local1655, local98, local1639, local1643, local1121.aShortArray7[local1621], local1121.aShortArray7[local1626], local1121.aShortArray7[local1631], local372, local351, local122, local436, local403, local154, local287, local468, local184, local1714);
								arg4.anInt2209 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte51 & 0x2) == 0) {
			@Pc(42) int local42 = super.anInt9576 * arg5;
			local47 = super.anInt9576 + local42;
			@Pc(52) int local52 = arg3 * super.anInt9576;
			local57 = local52 + super.anInt9576;
			@Pc(69) int local69;
			@Pc(78) int local78;
			@Pc(89) int local89;
			if ((local12.aByte51 & 0x1) == 0) {
				local69 = super.anIntArrayArray126[arg5][arg3];
				local78 = super.anIntArrayArray126[arg5 + 1][arg3];
				local89 = super.anIntArrayArray126[arg5 + 1][arg3 + 1];
				local98 = super.anIntArrayArray126[arg5][arg3 + 1];
				if (super.anInt9579 == -1) {
					local122 = (super.anInt9583 * local52 + super.anInt9581 * local69 + local42 * super.anInt9582 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local122) {
						return;
					}
					local154 = (local47 * super.anInt9582 + super.anInt9581 * local78 + super.anInt9583 * local52 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local154) {
						return;
					}
					local184 = (super.anInt9583 * local57 + local89 * super.anInt9581 + local47 * super.anInt9582 >> 15) + super.anInt9584;
					if (local184 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local216 = super.anInt9584 + (super.anInt9582 * local42 + super.anInt9581 * local98 + super.anInt9583 * local57 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local216) {
						return;
					}
				} else {
					local216 = super.anInt9579;
					local184 = super.anInt9579;
					local154 = super.anInt9579;
					local122 = super.anInt9579;
				}
				local255 = (super.anInt9590 * local52 + super.anInt9589 * local42 + super.anInt9585 * local69 >> 15) + super.anInt9588;
				local267 = arg4.anInt2213 + super.aClass4_Sub1_18.anInt2890 * local255 / local122;
				local287 = super.anInt9591 + (local52 * super.anInt9586 + local69 * super.anInt9587 + super.anInt9578 * local42 >> 15);
				local298 = local287 * super.aClass4_Sub1_18.anInt2897 / local122 + arg4.anInt2210;
				local320 = super.anInt9588 + (local52 * super.anInt9590 + local47 * super.anInt9589 + super.anInt9585 * local78 >> 15);
				local331 = super.aClass4_Sub1_18.anInt2890 * local320 / local154 + arg4.anInt2213;
				local351 = (super.anInt9586 * local52 + super.anInt9587 * local78 + super.anInt9578 * local47 >> 15) + super.anInt9591;
				local372 = (super.anInt9589 * local47 + local89 * super.anInt9585 + super.anInt9590 * local57 >> 15) + super.anInt9588;
				local383 = arg4.anInt2210 + super.aClass4_Sub1_18.anInt2897 * local351 / local154;
				local403 = (local47 * super.anInt9578 + super.anInt9587 * local89 + super.anInt9586 * local57 >> 15) + super.anInt9591;
				local414 = super.aClass4_Sub1_18.anInt2890 * local372 / local184 + arg4.anInt2213;
				local436 = super.anInt9588 + (super.anInt9589 * local42 + local98 * super.anInt9585 + super.anInt9590 * local57 >> 15);
				local447 = arg4.anInt2210 + local403 * super.aClass4_Sub1_18.anInt2897 / local184;
				local468 = super.anInt9591 + (super.anInt9587 * local98 + super.anInt9578 * local42 + super.anInt9586 * local57 >> 15);
				local479 = local436 * super.aClass4_Sub1_18.anInt2890 / local216 + arg4.anInt2213;
				local490 = local468 * super.aClass4_Sub1_18.anInt2897 / local216 + arg4.anInt2210;
			} else {
				local69 = super.anIntArrayArray126[arg5][arg3];
				if (super.anInt9579 == -1) {
					local78 = super.anInt9581 * local69;
					local122 = super.anInt9584 + (local78 + local42 * super.anInt9582 + super.anInt9583 * local52 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local122) {
						return;
					}
					local154 = (local78 + super.anInt9582 * local47 + local52 * super.anInt9583 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local154) {
						return;
					}
					local184 = (local57 * super.anInt9583 + local78 + super.anInt9582 * local47 >> 15) + super.anInt9584;
					if (local184 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local216 = (local57 * super.anInt9583 + super.anInt9582 * local42 + local78 >> 15) + super.anInt9584;
					if (local216 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
				} else {
					local216 = super.anInt9579;
					local184 = super.anInt9579;
					local154 = super.anInt9579;
					local122 = super.anInt9579;
				}
				local78 = super.anInt9585 * local69;
				local255 = (super.anInt9590 * local52 + local78 + local42 * super.anInt9589 >> 15) + super.anInt9588;
				local89 = local69 * super.anInt9587;
				local267 = arg4.anInt2213 + super.aClass4_Sub1_18.anInt2890 * local255 / local122;
				local287 = (local89 + super.anInt9578 * local42 + local52 * super.anInt9586 >> 15) + super.anInt9591;
				local298 = arg4.anInt2210 + local287 * super.aClass4_Sub1_18.anInt2897 / local122;
				local320 = super.anInt9588 + (super.anInt9590 * local52 + local78 + local47 * super.anInt9589 >> 15);
				local331 = arg4.anInt2213 + local320 * super.aClass4_Sub1_18.anInt2890 / local154;
				local351 = super.anInt9591 + (super.anInt9586 * local52 + local89 + super.anInt9578 * local47 >> 15);
				local372 = super.anInt9588 + (local57 * super.anInt9590 + super.anInt9589 * local47 + local78 >> 15);
				local383 = arg4.anInt2210 + super.aClass4_Sub1_18.anInt2897 * local351 / local154;
				local403 = (local89 + super.anInt9578 * local47 + super.anInt9586 * local57 >> 15) + super.anInt9591;
				local414 = super.aClass4_Sub1_18.anInt2890 * local372 / local184 + arg4.anInt2213;
				local447 = arg4.anInt2210 + local403 * super.aClass4_Sub1_18.anInt2897 / local184;
				local436 = (local78 + super.anInt9589 * local42 + local57 * super.anInt9590 >> 15) + super.anInt9588;
				local479 = local436 * super.aClass4_Sub1_18.anInt2890 / local216 + arg4.anInt2213;
				local468 = super.anInt9591 + (local42 * super.anInt9578 + local89 + local57 * super.anInt9586 >> 15);
				local490 = super.aClass4_Sub1_18.anInt2897 * local468 / local216 + arg4.anInt2210;
			}
			if ((local383 - local490) * (-local479 + local414) - (local331 - local479) * (-local490 + local447) > 0) {
				arg4.aBoolean186 = local414 < 0 || local479 < 0 || local331 < 0 || arg4.anInt2211 < local414 || arg4.anInt2211 < local479 || arg4.anInt2211 < local331;
				if (local12.aShort36 < 0) {
					arg4.method2127(local447, local490, local383, local414, local479, local331, local12.aShort34 & 0xFFFF, local12.aShort35 & 0xFFFF, local12.aShort38 & 0xFFFF);
				} else {
					if (this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local12.aShort36).aByte104)) {
						arg4.anInt2209 = 100;
					}
					arg4.method2123(local447, local490, local383, local414, local479, local331, local12.aShort34 & 0xFFFF, local12.aShort35 & 0xFFFF, local12.aShort38 & 0xFFFF, local255, local320, local436, local287, local351, local468, local122, local154, local216, local12.aShort36);
					arg4.anInt2209 = 0;
				}
			}
			if (-((local298 - local383) * (-local331 + local479)) + (local267 - local331) * (-local383 + local490) > 0) {
				arg4.aBoolean186 = local267 < 0 || local331 < 0 || local479 < 0 || arg4.anInt2211 < local267 || local331 > arg4.anInt2211 || local479 > arg4.anInt2211;
				if (local12.aShort36 >= 0) {
					if (this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local12.aShort36).aByte104)) {
						arg4.anInt2209 = 100;
					}
					arg4.method2123(local298, local383, local490, local267, local331, local479, local12.aShort37 & 0xFFFF, local12.aShort38 & 0xFFFF, local12.aShort35 & 0xFFFF, local255, local320, local436, local287, local351, local468, local122, local154, local216, local12.aShort36);
					arg4.anInt2209 = 0;
					return;
				}
				arg4.method2127(local298, local383, local490, local267, local331, local479, local12.aShort37 & 0xFFFF, local12.aShort38 & 0xFFFF, local12.aShort35 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[IIIII[[ZILclient!ee;[II)V")
	private void method8258(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) boolean[][] arg3, @OriginalArg(8) int arg4, @OriginalArg(9) Class80 arg5, @OriginalArg(10) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg2 - arg7) * 1024 / 256;
		arg5.aBoolean185 = false;
		arg5.aBoolean184 = false;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = local14;
		for (@Pc(37) int local37 = arg4; local37 < arg1; local37++) {
			for (@Pc(41) int local41 = arg7; local41 < arg2; local41++) {
				if (arg3[local37 - arg4][local41 - arg7]) {
					@Pc(77) int local77;
					if (super.aClass300ArrayArray3[local37][local41] != null) {
						@Pc(297) Class300 local297 = super.aClass300ArrayArray3[local37][local41];
						if (local297.aShort120 != -1 && (local297.aByte106 & 0x2) == 0 && local297.anInt8858 == 0) {
							local77 = super.aClass4_Sub1_18.method2742(local297.aShort120);
							arg5.method2127(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, Static171.method3198(local297.anInt8860, local77), Static171.method3198(local297.anInt8861, local77), Static171.method3198(local297.anInt8859, local77));
							arg5.method2127(local35, local35, local35 - 4, local31, local31 + 4, local31, Static171.method3198(local297.anInt8857, local77), Static171.method3198(local297.anInt8859, local77), Static171.method3198(local297.anInt8861, local77));
						} else if (local297.anInt8858 == 0) {
							arg5.method2124(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, local297.anInt8860, local297.anInt8861, local297.anInt8859);
							arg5.method2124(local35, local35, local35 - 4, local31, local31 + 4, local31, local297.anInt8857, local297.anInt8859, local297.anInt8861);
						} else {
							local77 = local297.anInt8858;
							arg5.method2124(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, Static342.method5736(local297.anInt8860 & 0xFF000000, local77), Static342.method5736(local297.anInt8861 & 0xFF000000, local77), Static342.method5736(local297.anInt8859 & 0xFF000000, local77));
							arg5.method2124(local35, local35, local35 - 4, local31, local31 + 4, local31, Static342.method5736(local297.anInt8857 & 0xFF000000, local77), Static342.method5736(local297.anInt8859 & 0xFF000000, local77), Static342.method5736(local297.anInt8861 & 0xFF000000, local77));
						}
					} else if (super.aClass52ArrayArray3[local37][local41] != null) {
						@Pc(75) Class52 local75 = super.aClass52ArrayArray3[local37][local41];
						for (local77 = 0; local77 < local75.aShort21; local77++) {
							arg6[local77] = local31 + local75.aShortArray24[local77] * 4 / super.anInt9576;
							arg0[local77] = local35 - local75.aShortArray23[local77] * 4 / super.anInt9576;
						}
						for (@Pc(116) int local116 = 0; local116 < local75.aShort20; local116++) {
							@Pc(122) int local122 = local116 * 3;
							@Pc(126) int local126 = local122 + 1;
							@Pc(130) int local130 = local126 + 1;
							@Pc(134) int local134 = arg6[local122];
							@Pc(138) int local138 = arg6[local126];
							@Pc(142) int local142 = arg6[local130];
							@Pc(146) int local146 = arg0[local122];
							@Pc(150) int local150 = arg0[local126];
							@Pc(154) int local154 = arg0[local130];
							@Pc(195) int local195;
							if (local75.anIntArray110 != null && local75.anIntArray110[local116] != 0 && (local75.aShortArray22 == null || local75.aShortArray22 != null && local75.aShortArray22[local116] == -1)) {
								local195 = local75.anIntArray110[local116];
								arg5.method2124(local146, local150, local154, local134, local138, local142, Static342.method5736(-(local75.anIntArray109[local122] & -16777216) - 16777216, local195), Static342.method5736(-(-16777216 & local75.anIntArray109[local126]) - 16777216, local195), Static342.method5736(-(local75.anIntArray109[local130] & -16777216) - 16777216, local195));
							} else if (local75.aShortArray22 == null || local75.aShortArray22[local116] == -1) {
								arg5.method2124(local146, local150, local154, local134, local138, local142, local75.anIntArray109[local122], local75.anIntArray109[local126], local75.anIntArray109[local130]);
							} else {
								local195 = super.aClass4_Sub1_18.method2742(local75.aShortArray22[local116]);
								arg5.method2127(local146, local150, local154, local134, local138, local142, local195, local195, local195);
							}
						}
					}
				}
				local35 -= 4;
			}
			local31 += 4;
			local35 = local14;
		}
		arg5.aBoolean184 = true;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8245(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class200_Sub2 local9 = (Class200_Sub2) super.aClass4_Sub1_18.method2741(Thread.currentThread());
		@Pc(12) Class80 local12 = local9.aClass80_2;
		local12.aBoolean186 = false;
		local12.anInt2209 = 0;
		if (super.aClass300ArrayArray3 != null) {
			this.method8258(local9.anIntArray594, arg2, arg3, arg4, arg0, local12, local9.anIntArray585, arg1);
		} else if (super.aClass122ArrayArray3 != null) {
			this.method8260(arg1, local9.anIntArray585, arg3, local12, arg2, arg0, arg4, local9.anIntArray594);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!ee;[IIIZI[I[I)V")
	private void method8259(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class300 local12 = super.aClass300ArrayArray3[arg3][arg2];
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(319) int local319;
		@Pc(377) int local377;
		@Pc(434) int local434;
		@Pc(475) int local475;
		@Pc(330) int local330;
		@Pc(406) int local406;
		@Pc(445) int local445;
		@Pc(504) int local504;
		@Pc(286) int local286;
		@Pc(349) int local349;
		@Pc(395) int local395;
		@Pc(464) int local464;
		@Pc(308) int local308;
		@Pc(366) int local366;
		@Pc(423) int local423;
		@Pc(493) int local493;
		@Pc(80) int local80;
		@Pc(79) int local79;
		@Pc(77) int local77;
		@Pc(75) int local75;
		@Pc(44) int local44;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(201) int local201;
		@Pc(67) int local67;
		@Pc(87) int local87;
		@Pc(291) int local291;
		@Pc(542) int local542;
		@Pc(781) int local781;
		if (local12 == null) {
			@Pc(1624) Class52 local1624 = super.aClass52ArrayArray3[arg3][arg2];
			if (local1624 != null) {
				if (super.anInt9579 == -1) {
					for (local475 = 0; local475 < local1624.aShort21; local475++) {
						local31 = local1624.aShortArray24[local475] + (arg3 << super.anInt9573);
						local36 = local1624.aShortArray20[local475];
						local42 = local1624.aShortArray23[local475] + (arg2 << super.anInt9573);
						local434 = super.anInt9584 + (local42 * super.anInt9583 + super.anInt9582 * local31 + super.anInt9581 * local36 >> 15);
						if (super.aClass4_Sub1_18.anInt2868 >= local434) {
							return;
						}
						arg6[local475] = 0;
						if (arg4) {
							local330 = local434 - super.aClass4_Sub1_18.anInt2880;
							if (local330 > 255) {
								local330 = 255;
							}
							if (local330 > 0) {
								arg6[local475] = local330;
								local406 = local330 * local1624.aShortArray21[local475] / 255;
								if (local406 > 0) {
									local36 -= local406;
								}
							}
						} else if (super.aClass4_Sub1_18.aBoolean247) {
							local330 = local434 - super.aClass4_Sub1_18.anInt2880;
							if (local330 > 0) {
								arg6[local475] = local330;
								if (arg6[local475] > 255) {
									arg6[local475] = 255;
								}
							}
						}
						local377 = (local36 * super.anInt9587 + local31 * super.anInt9578 + super.anInt9586 * local42 >> 15) + super.anInt9591;
						local319 = super.anInt9588 + (super.anInt9590 * local42 + local36 * super.anInt9585 + local31 * super.anInt9589 >> 15);
						arg5[local475] = arg0.anInt2213 + super.aClass4_Sub1_18.anInt2890 * local319 / local434;
						arg1[local475] = local377 * super.aClass4_Sub1_18.anInt2897 / local434 + arg0.anInt2210;
					}
				} else {
					for (local475 = 0; local475 < local1624.aShort21; local475++) {
						local31 = local1624.aShortArray24[local475] + (arg3 << super.anInt9573);
						local36 = local1624.aShortArray20[local475];
						local42 = local1624.aShortArray23[local475] + (arg2 << super.anInt9573);
						arg6[local475] = 0;
						if (arg4) {
							local330 = super.anInt9579 - super.aClass4_Sub1_18.anInt2880;
							if (local330 > 255) {
								local330 = 255;
							}
							if (local330 > 0) {
								arg6[local475] = local330;
								local406 = local1624.aShortArray21[local475] * local330 / 255;
								if (local406 > 0) {
									local36 -= local406;
								}
							}
						} else if (super.aClass4_Sub1_18.aBoolean247) {
							local330 = -super.aClass4_Sub1_18.anInt2880 + super.anInt9579;
							if (local330 > 0) {
								arg6[local475] = local330;
								if (arg6[local475] > 255) {
									arg6[local475] = 255;
								}
							}
						}
						local319 = (local36 * super.anInt9585 + local31 * super.anInt9589 + super.anInt9590 * local42 >> 15) + super.anInt9588;
						local377 = super.anInt9591 + (super.anInt9587 * local36 + super.anInt9578 * local31 + super.anInt9586 * local42 >> 15);
						arg5[local475] = super.aClass4_Sub1_18.anInt2890 * local319 / super.anInt9579 + arg0.anInt2213;
						arg1[local475] = super.aClass4_Sub1_18.anInt2897 * local377 / super.anInt9579 + arg0.anInt2210;
					}
				}
				if (local1624.aShortArray22 == null) {
					for (local475 = 0; local475 < local1624.aShort20; local475++) {
						local330 = local475 * 3;
						local406 = local330 + 1;
						local445 = local406 + 1;
						local504 = arg5[local330];
						local286 = arg5[local406];
						local349 = arg5[local445];
						local395 = arg1[local330];
						local464 = arg1[local406];
						local308 = arg1[local445];
						local366 = arg6[local445] + arg6[local406] + arg6[local330];
						if ((local504 - local286) * (-local464 + local308) - (local395 - local464) * (local349 - local286) > 0) {
							arg0.aBoolean186 = local504 < 0 || local286 < 0 || local349 < 0 || local504 > arg0.anInt2211 || local286 > arg0.anInt2211 || arg0.anInt2211 < local349;
							if (local366 >= 765) {
								arg0.method2119(local395, local464, local308, local504, local286, local349, super.aClass4_Sub1_18.anInt2889);
							} else if (local366 <= 0) {
								if ((local1624.anIntArray109[local330] & 0xFFFFFF) != 0) {
									arg0.method2124(local395, local464, local308, local504, local286, local349, local1624.anIntArray109[local330], local1624.anIntArray109[local406], local1624.anIntArray109[local445]);
								}
							} else if ((local1624.anIntArray109[local330] & 0xFFFFFF) != 0) {
								arg0.method2124(local395, local464, local308, local504, local286, local349, Static292.method5120(local1624.anIntArray109[local330], arg6[local330], super.aClass4_Sub1_18.anInt2889), Static292.method5120(local1624.anIntArray109[local406], arg6[local406], super.aClass4_Sub1_18.anInt2889), Static292.method5120(local1624.anIntArray109[local445], arg6[local445], super.aClass4_Sub1_18.anInt2889));
							}
						}
					}
				} else {
					local475 = super.anIntArrayArray126[arg3][arg2];
					local330 = super.anIntArrayArray126[arg3 + 1][arg2];
					local406 = super.anIntArrayArray126[arg3][arg2 + 1];
					local445 = arg3 * super.anInt9576;
					local504 = local445 + super.anInt9576;
					local286 = arg2 * super.anInt9576;
					local349 = super.anInt9576 + local286;
					local395 = super.anInt9588 + (super.anInt9590 * local286 + super.anInt9589 * local445 + local475 * super.anInt9585 >> 15);
					local464 = super.anInt9591 + (local445 * super.anInt9578 + super.anInt9587 * local475 + super.anInt9586 * local286 >> 15);
					local308 = super.anInt9584 + (super.anInt9583 * local286 + super.anInt9582 * local445 + local475 * super.anInt9581 >> 15);
					local366 = (local286 * super.anInt9590 + super.anInt9589 * local504 + local330 * super.anInt9585 >> 15) + super.anInt9588;
					local423 = super.anInt9591 + (super.anInt9578 * local504 + super.anInt9587 * local330 + super.anInt9586 * local286 >> 15);
					local493 = (local286 * super.anInt9583 + local504 * super.anInt9582 + local330 * super.anInt9581 >> 15) + super.anInt9584;
					local80 = super.anInt9588 + (local406 * super.anInt9585 + local445 * super.anInt9589 + local349 * super.anInt9590 >> 15);
					local79 = (local445 * super.anInt9578 + super.anInt9587 * local406 + super.anInt9586 * local349 >> 15) + super.anInt9591;
					local77 = super.anInt9584 + (local406 * super.anInt9581 + local445 * super.anInt9582 + local349 * super.anInt9583 >> 15);
					for (local75 = 0; local75 < local1624.aShort20; local75++) {
						local44 = local75 * 3;
						local46 = local44 + 1;
						local48 = local46 + 1;
						local50 = arg5[local44];
						local201 = arg5[local46];
						local67 = arg5[local48];
						local87 = arg1[local44];
						local291 = arg1[local46];
						local542 = arg1[local48];
						local781 = arg6[local46] + arg6[local44] + arg6[local48];
						if (-((local67 - local201) * (-local291 + local87)) + (local542 - local291) * (-local201 + local50) > 0) {
							arg0.aBoolean186 = local50 < 0 || local201 < 0 || local67 < 0 || arg0.anInt2211 < local50 || local201 > arg0.anInt2211 || arg0.anInt2211 < local67;
							@Pc(2598) short local2598 = local1624.aShortArray22[local75];
							if (local781 < 765) {
								if (local2598 != -1 && this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local2598).aByte104)) {
									arg0.anInt2209 = 100;
								}
								if (local781 > 0) {
									if (local2598 != -1) {
										arg0.method2120(local87, local291, local542, local50, local201, local67, super.aClass4_Sub1_18.anInt2889, arg6[local44], arg6[local46], arg6[local48], local1624.anIntArray109[local44], local1624.anIntArray109[local46], local1624.anIntArray109[local48], local395, local366, local80, local464, local423, local79, local308, local493, local77, local2598);
									} else if ((local1624.anIntArray109[local44] & 0xFFFFFF) != 0) {
										arg0.method2124(local87, local291, local542, local50, local201, local67, Static342.method5736(arg6[local44] << 24 | super.aClass4_Sub1_18.anInt2889, local1624.anIntArray109[local44]), Static342.method5736(super.aClass4_Sub1_18.anInt2889 | arg6[local46] << 24, local1624.anIntArray109[local46]), Static342.method5736(arg6[local48] << 24 | super.aClass4_Sub1_18.anInt2889, local1624.anIntArray109[local48]));
									}
								} else if (local2598 != -1) {
									arg0.method2123(local87, local291, local542, local50, local201, local67, local1624.anIntArray109[local44], local1624.anIntArray109[local46], local1624.anIntArray109[local48], local395, local366, local80, local464, local423, local79, local308, local493, local77, local2598);
								} else if ((local1624.anIntArray109[local44] & 0xFFFFFF) != 0) {
									arg0.method2124(local87, local291, local542, local50, local201, local67, local1624.anIntArray109[local44], local1624.anIntArray109[local46], local1624.anIntArray109[local48]);
								}
								arg0.anInt2209 = 0;
							} else {
								arg0.method2119(local87, local291, local542, local50, local201, local67, super.aClass4_Sub1_18.anInt2889);
							}
						}
					}
				}
			}
		} else if ((local12.aByte106 & 0x2) == 0) {
			@Pc(25) int local25 = super.anInt9576 * arg3;
			local31 = local25 + super.anInt9576;
			local36 = arg2 * super.anInt9576;
			local42 = local36 + super.anInt9576;
			local44 = 0;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			if ((local12.aByte106 & 0x1) == 0 || arg4) {
				local67 = super.anIntArrayArray126[arg3][arg2];
				local87 = super.anIntArrayArray126[arg3 + 1][arg2];
				local291 = super.anIntArrayArray126[arg3 + 1][arg2 + 1];
				local542 = super.anIntArrayArray126[arg3][arg2 + 1];
				if (super.anInt9579 == -1) {
					local80 = super.anInt9584 + (local67 * super.anInt9581 + super.anInt9582 * local25 + local36 * super.anInt9583 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local80) {
						return;
					}
					local79 = (local31 * super.anInt9582 + local87 * super.anInt9581 + super.anInt9583 * local36 >> 15) + super.anInt9584;
					if (local79 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local77 = (local291 * super.anInt9581 + super.anInt9582 * local31 + local42 * super.anInt9583 >> 15) + super.anInt9584;
					if (local77 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local75 = super.anInt9584 + (super.anInt9582 * local25 + local542 * super.anInt9581 + local42 * super.anInt9583 >> 15);
					if (local75 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
				} else {
					local75 = super.anInt9579;
					local77 = super.anInt9579;
					local79 = super.anInt9579;
					local80 = super.anInt9579;
				}
				if (arg4) {
					local201 = local80 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local44 = local201;
						local781 = local201 * local12.aShort118 / 255;
						if (local781 > 0) {
							local67 -= local781;
						}
					}
					local201 = local79 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local46 = local201;
						local781 = local12.aShort121 * local201 / 255;
						if (local781 > 0) {
							local87 -= local781;
						}
					}
					local201 = local77 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local48 = local201;
						local781 = local201 * local12.aShort119 / 255;
						if (local781 > 0) {
							local291 -= local781;
						}
					}
					local201 = local75 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local50 = local201;
						local781 = local201 * local12.aShort122 / 255;
						if (local781 > 0) {
							local542 -= local781;
						}
					}
				} else if (super.aClass4_Sub1_18.aBoolean247) {
					local201 = local80 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local44 = local201;
						if (local201 > 255) {
							local44 = 255;
						}
					}
					local201 = local79 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local46 = local201;
						if (local201 > 255) {
							local46 = 255;
						}
					}
					local201 = local77 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local48 = local201;
						if (local201 > 255) {
							local48 = 255;
						}
					}
					local201 = local75 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local50 = local201;
						if (local201 > 255) {
							local50 = 255;
						}
					}
				}
				local286 = (local36 * super.anInt9590 + local25 * super.anInt9589 + super.anInt9585 * local67 >> 15) + super.anInt9588;
				local319 = local286 * super.aClass4_Sub1_18.anInt2890 / local80 + arg0.anInt2213;
				local308 = super.anInt9591 + (local25 * super.anInt9578 + super.anInt9587 * local67 + super.anInt9586 * local36 >> 15);
				local330 = super.aClass4_Sub1_18.anInt2897 * local308 / local80 + arg0.anInt2210;
				local349 = super.anInt9588 + (super.anInt9589 * local31 + local87 * super.anInt9585 + local36 * super.anInt9590 >> 15);
				local377 = arg0.anInt2213 + super.aClass4_Sub1_18.anInt2890 * local349 / local79;
				local366 = super.anInt9591 + (local36 * super.anInt9586 + local31 * super.anInt9578 + super.anInt9587 * local87 >> 15);
				local395 = super.anInt9588 + (local31 * super.anInt9589 + local291 * super.anInt9585 + local42 * super.anInt9590 >> 15);
				local406 = arg0.anInt2210 + local366 * super.aClass4_Sub1_18.anInt2897 / local79;
				local434 = arg0.anInt2213 + super.aClass4_Sub1_18.anInt2890 * local395 / local77;
				local423 = super.anInt9591 + (super.anInt9587 * local291 + super.anInt9578 * local31 + super.anInt9586 * local42 >> 15);
				local445 = arg0.anInt2210 + super.aClass4_Sub1_18.anInt2897 * local423 / local77;
				local464 = (local42 * super.anInt9590 + local542 * super.anInt9585 + local25 * super.anInt9589 >> 15) + super.anInt9588;
				local475 = super.aClass4_Sub1_18.anInt2890 * local464 / local75 + arg0.anInt2213;
				local493 = (local25 * super.anInt9578 + super.anInt9587 * local542 + local42 * super.anInt9586 >> 15) + super.anInt9591;
				local504 = arg0.anInt2210 + local493 * super.aClass4_Sub1_18.anInt2897 / local75;
			} else {
				local67 = super.anIntArrayArray126[arg3][arg2];
				if (super.anInt9579 == -1) {
					local87 = local67 * super.anInt9581;
					local80 = (super.anInt9582 * local25 + local87 + local36 * super.anInt9583 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local80) {
						return;
					}
					local79 = super.anInt9584 + (local31 * super.anInt9582 + local87 + local36 * super.anInt9583 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local79) {
						return;
					}
					local77 = (local42 * super.anInt9583 + local87 + local31 * super.anInt9582 >> 15) + super.anInt9584;
					if (local77 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local75 = super.anInt9584 + (local87 + local25 * super.anInt9582 + local42 * super.anInt9583 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local75) {
						return;
					}
				} else {
					local75 = super.anInt9579;
					local77 = super.anInt9579;
					local79 = super.anInt9579;
					local80 = super.anInt9579;
				}
				if (super.aClass4_Sub1_18.aBoolean247) {
					local201 = local80 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local44 = local201;
						if (local201 > 255) {
							local44 = 255;
						}
					}
					local201 = local79 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local46 = local201;
						if (local201 > 255) {
							local46 = 255;
						}
					}
					local201 = local77 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local48 = local201;
						if (local201 > 255) {
							local48 = 255;
						}
					}
					local201 = local75 - super.aClass4_Sub1_18.anInt2880;
					if (local201 > 0) {
						local50 = local201;
						if (local201 > 255) {
							local50 = 255;
						}
					}
				}
				local87 = local67 * super.anInt9585;
				local286 = super.anInt9588 + (local25 * super.anInt9589 + local87 + super.anInt9590 * local36 >> 15);
				local291 = super.anInt9587 * local67;
				local308 = super.anInt9591 + (local291 + local25 * super.anInt9578 + local36 * super.anInt9586 >> 15);
				local319 = arg0.anInt2213 + local286 * super.aClass4_Sub1_18.anInt2890 / local80;
				local330 = arg0.anInt2210 + local308 * super.aClass4_Sub1_18.anInt2897 / local80;
				local349 = super.anInt9588 + (local87 + super.anInt9589 * local31 + super.anInt9590 * local36 >> 15);
				local366 = super.anInt9591 + (local36 * super.anInt9586 + local291 + local31 * super.anInt9578 >> 15);
				local377 = super.aClass4_Sub1_18.anInt2890 * local349 / local79 + arg0.anInt2213;
				local395 = super.anInt9588 + (super.anInt9589 * local31 + local87 + super.anInt9590 * local42 >> 15);
				local406 = local366 * super.aClass4_Sub1_18.anInt2897 / local79 + arg0.anInt2210;
				local423 = super.anInt9591 + (local42 * super.anInt9586 + local291 + local31 * super.anInt9578 >> 15);
				local434 = local395 * super.aClass4_Sub1_18.anInt2890 / local77 + arg0.anInt2213;
				local445 = arg0.anInt2210 + local423 * super.aClass4_Sub1_18.anInt2897 / local77;
				local464 = (super.anInt9589 * local25 + local87 + local42 * super.anInt9590 >> 15) + super.anInt9588;
				local475 = local464 * super.aClass4_Sub1_18.anInt2890 / local75 + arg0.anInt2213;
				local493 = super.anInt9591 + (local25 * super.anInt9578 + local291 + super.anInt9586 * local42 >> 15);
				local504 = arg0.anInt2210 + local493 * super.aClass4_Sub1_18.anInt2897 / local75;
			}
			@Pc(1168) boolean local1168 = local12.aShort120 != -1 && this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local12.aShort120).aByte104);
			local87 = local50 + local46 + local48;
			if (-((local377 - local475) * (-local504 + local445)) + (local434 - local475) * (-local504 + local406) > 0) {
				arg0.aBoolean186 = local434 < 0 || local475 < 0 || local377 < 0 || arg0.anInt2211 < local434 || local475 > arg0.anInt2211 || arg0.anInt2211 < local377;
				if (local87 >= 765) {
					arg0.method2119(local445, local504, local406, local434, local475, local377, super.aClass4_Sub1_18.anInt2889);
				} else {
					if (local1168) {
						arg0.anInt2209 = 100;
					}
					if (local87 > 0) {
						if (local12.aShort120 < 0) {
							arg0.method2124(local445, local504, local406, local434, local475, local377, Static342.method5736(super.aClass4_Sub1_18.anInt2889 | local48 << 24, local12.anInt8860), Static342.method5736(super.aClass4_Sub1_18.anInt2889 | local50 << 24, local12.anInt8861), Static342.method5736(local46 << 24 | super.aClass4_Sub1_18.anInt2889, local12.anInt8859));
						} else {
							arg0.method2120(local445, local504, local406, local434, local475, local377, super.aClass4_Sub1_18.anInt2889, local48, local50, local46, local12.anInt8860, local12.anInt8861, local12.anInt8859, local395, local464, local349, local423, local493, local366, local77, local75, local79, local12.aShort120);
						}
					} else if (local12.aShort120 >= 0) {
						arg0.method2123(local445, local504, local406, local434, local475, local377, local12.anInt8860, local12.anInt8861, local12.anInt8859, local395, local464, local349, local423, local493, local366, local77, local75, local79, local12.aShort120);
					} else {
						arg0.method2124(local445, local504, local406, local434, local475, local377, local12.anInt8860, local12.anInt8861, local12.anInt8859);
					}
					arg0.anInt2209 = 0;
				}
			}
			local87 = local46 + local44 + local50;
			if ((local504 - local406) * (-local377 + local319) - (local475 - local377) * (-local406 + local330) > 0) {
				arg0.aBoolean186 = local319 < 0 || local377 < 0 || local475 < 0 || local319 > arg0.anInt2211 || arg0.anInt2211 < local377 || arg0.anInt2211 < local475;
				if (local87 < 765) {
					if (local1168) {
						arg0.anInt2209 = 100;
					}
					if (local87 <= 0) {
						if (local12.aShort120 < 0) {
							arg0.method2124(local330, local406, local504, local319, local377, local475, local12.anInt8857, local12.anInt8859, local12.anInt8861);
						} else {
							arg0.method2123(local330, local406, local504, local319, local377, local475, local12.anInt8857, local12.anInt8859, local12.anInt8861, local286, local349, local464, local308, local366, local493, local80, local79, local75, local12.aShort120);
						}
					} else if (local12.aShort120 >= 0) {
						arg0.method2120(local330, local406, local504, local319, local377, local475, super.aClass4_Sub1_18.anInt2889, local44, local46, local50, local12.anInt8857, local12.anInt8859, local12.anInt8861, local286, local349, local464, local308, local366, local493, local80, local79, local75, local12.aShort120);
					} else {
						arg0.method2124(local330, local406, local504, local319, local377, local475, Static342.method5736(local44 << 24 | super.aClass4_Sub1_18.anInt2889, local12.anInt8857), Static342.method5736(super.aClass4_Sub1_18.anInt2889 | local46 << 24, local12.anInt8859), Static342.method5736(local50 << 24 | super.aClass4_Sub1_18.anInt2889, local12.anInt8861));
					}
					arg0.anInt2209 = 0;
					return;
				}
				arg0.method2119(local330, local406, local504, local319, local377, local475, super.aClass4_Sub1_18.anInt2889);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	@Override
	public void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class200_Sub2 local9 = (Class200_Sub2) super.aClass4_Sub1_18.method2741(Thread.currentThread());
		local9.aClass80_2.anInt2209 = 0;
		if (super.aClass300ArrayArray3 != null) {
			this.method8259(local9.aClass80_2, local9.anIntArray594, arg1, arg0, super.aClass4_Sub1_18.aBoolean245, local9.anIntArray585, local9.anIntArray606);
		} else if (super.aClass122ArrayArray3 != null) {
			this.method8255(local9.anIntArray606, local9.anIntArray585, local9.anIntArray594, arg1, local9.aClass80_2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[IIIILclient!ee;II[[ZII[I)V")
	private void method8260(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class80 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) boolean[][] arg6, @OriginalArg(11) int[] arg7) {
		@Pc(13) int local13 = (arg2 - arg0) * 1024 / 256;
		arg3.aBoolean184 = false;
		arg3.aBoolean185 = false;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = local13;
		for (@Pc(36) int local36 = arg5; local36 < arg4; local36++) {
			for (@Pc(40) int local40 = arg0; local40 < arg2; local40++) {
				if (arg6[local36 - arg5][local40 - arg0]) {
					@Pc(89) int local89;
					if (super.aClass122ArrayArray3[local36][local40] != null) {
						@Pc(68) Class122 local68 = super.aClass122ArrayArray3[local36][local40];
						if (local68.aShort36 != -1 && (local68.aByte51 & 0x2) == 0 && local68.anInt3424 == -1) {
							local89 = super.aClass4_Sub1_18.method2742(local68.aShort36);
							arg3.method2127(local29 - 4, local29 + -4, local29, local25 + 4, local25, local25 + 4, Static171.method3198(local68.aShort34 & 0xFFFF, local89), Static171.method3198(local68.aShort35 & 0xFFFF, local89), Static171.method3198(local68.aShort38 & 0xFFFF, local89));
							arg3.method2127(local29, local29, local29 - 4, local25, local25 + 4, local25, Static171.method3198(local68.aShort37 & 0xFFFF, local89), Static171.method3198(local68.aShort38 & 0xFFFF, local89), Static171.method3198(local68.aShort35 & 0xFFFF, local89));
						} else if (local68.anInt3424 == -1) {
							arg3.method2127(local29 - 4, local29 + -4, local29, local25 + 4, local25, local25 + 4, local68.aShort34 & 0xFFFF, local68.aShort35 & 0xFFFF, local68.aShort38 & 0xFFFF);
							arg3.method2127(local29, local29, local29 - 4, local25, local25 + 4, local25, local68.aShort37 & 0xFFFF, local68.aShort38 & 0xFFFF, local68.aShort35 & 0xFFFF);
						} else {
							local89 = local68.anInt3424;
							arg3.method2127(local29 - 4, local29 + -4, local29, local25 + 4, local25, local25 + 4, local89, local89, local89);
							arg3.method2127(local29, local29, local29 - 4, local25, local25 + 4, local25, local89, local89, local89);
						}
					} else if (super.aClass50ArrayArray3[local36][local40] != null) {
						@Pc(286) Class50 local286 = super.aClass50ArrayArray3[local36][local40];
						for (local89 = 0; local89 < local286.aShort19; local89++) {
							arg1[local89] = local286.aShortArray9[local89] * 4 / super.anInt9576 + local25;
							arg7[local89] = local29 - local286.aShortArray11[local89] * 4 / super.anInt9576;
						}
						for (@Pc(325) int local325 = 0; local325 < local286.aShort18; local325++) {
							@Pc(332) short local332 = local286.aShortArray13[local325];
							@Pc(337) short local337 = local286.aShortArray8[local325];
							@Pc(342) short local342 = local286.aShortArray14[local325];
							@Pc(346) int local346 = arg1[local332];
							@Pc(350) int local350 = arg1[local337];
							@Pc(354) int local354 = arg1[local342];
							@Pc(358) int local358 = arg7[local332];
							@Pc(362) int local362 = arg7[local337];
							@Pc(366) int local366 = arg7[local342];
							@Pc(389) int local389;
							if (local286.anIntArray101 != null && local286.anIntArray101[local325] != -1) {
								local389 = local286.anIntArray101[local325];
								arg3.method2127(local358, local362, local366, local346, local350, local354, Static171.method3198(local286.aShortArray7[local332], local389), Static171.method3198(local286.aShortArray7[local337], local389), Static171.method3198(local286.aShortArray7[local342], local389));
							} else if (local286.aShortArray10 == null || local286.aShortArray10[local325] == -1) {
								local389 = local286.anIntArray102[local325];
								arg3.method2127(local358, local362, local366, local346, local350, local354, Static171.method3198(local286.aShortArray7[local332], local389), Static171.method3198(local286.aShortArray7[local337], local389), Static171.method3198(local286.aShortArray7[local342], local389));
							} else {
								local389 = super.aClass4_Sub1_18.method2742(local286.aShortArray10[local325]);
								arg3.method2127(local358, local362, local366, local346, local350, local354, Static171.method3198(local286.aShortArray7[local332], local389), Static171.method3198(local286.aShortArray7[local337], local389), Static171.method3198(local286.aShortArray7[local342], local389));
							}
						}
					}
				}
				local29 -= 4;
			}
			local29 = local13;
			local25 += 4;
		}
		arg3.aBoolean184 = true;
	}
}
