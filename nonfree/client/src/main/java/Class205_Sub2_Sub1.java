import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class205_Sub2_Sub1 extends Class205_Sub2 {

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!jba;IIII[[I[[II)V")
	public Class205_Sub2_Sub1(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I[[Z[IILclient!eda;I[IIIIII)V")
	private void method5872(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) Class77 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6, @OriginalArg(11) int arg7) {
		@Pc(14) int local14 = (arg6 - arg7) * 1024 / 256;
		arg2.aBoolean132 = false;
		arg2.aBoolean130 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg5; local32 < arg3; local32++) {
			for (@Pc(36) int local36 = arg7; local36 < arg6; local36++) {
				if (arg0[local32 - arg5][local36 - arg7]) {
					@Pc(72) int local72;
					if (super.aClass112ArrayArray3[local32][local36] != null) {
						@Pc(313) Class112 local313 = super.aClass112ArrayArray3[local32][local36];
						if (local313.aShort46 != -1 && (local313.aByte47 & 0x2) == 0 && local313.anInt3029 == -1) {
							local72 = super.aClass122_Sub1_16.method7287(local313.aShort46);
							arg2.method1805(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, Static244.method4186(local72, local313.aShort50 & 0xFFFF), Static244.method4186(local72, local313.aShort48 & 0xFFFF), Static244.method4186(local72, local313.aShort49 & 0xFFFF));
							arg2.method1805(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, Static244.method4186(local72, local313.aShort47 & 0xFFFF), Static244.method4186(local72, local313.aShort49 & 0xFFFF), Static244.method4186(local72, local313.aShort48 & 0xFFFF));
						} else if (local313.anInt3029 == -1) {
							arg2.method1805(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, local313.aShort50 & 0xFFFF, local313.aShort48 & 0xFFFF, local313.aShort49 & 0xFFFF);
							arg2.method1805(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, local313.aShort47 & 0xFFFF, local313.aShort49 & 0xFFFF, local313.aShort48 & 0xFFFF);
						} else {
							local72 = local313.anInt3029;
							arg2.method1805(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, local72, local72, local72);
							arg2.method1805(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, local72, local72, local72);
						}
					} else if (super.aClass298ArrayArray3[local32][local36] != null) {
						@Pc(70) Class298 local70 = super.aClass298ArrayArray3[local32][local36];
						for (local72 = 0; local72 < local70.aShort133; local72++) {
							arg4[local72] = local70.aShortArray149[local72] * 4 / super.anInt8175 + local26;
							arg1[local72] = local30 - local70.aShortArray151[local72] * 4 / super.anInt8175;
						}
						for (@Pc(113) int local113 = 0; local113 < local70.aShort132; local113++) {
							@Pc(120) short local120 = local70.aShortArray152[local113];
							@Pc(125) short local125 = local70.aShortArray153[local113];
							@Pc(130) short local130 = local70.aShortArray147[local113];
							@Pc(134) int local134 = arg4[local120];
							@Pc(138) int local138 = arg4[local125];
							@Pc(142) int local142 = arg4[local130];
							@Pc(146) int local146 = arg1[local120];
							@Pc(150) int local150 = arg1[local125];
							@Pc(154) int local154 = arg1[local130];
							@Pc(178) int local178;
							if (local70.anIntArray773 != null && local70.anIntArray773[local113] != -1) {
								local178 = local70.anIntArray773[local113];
								arg2.method1805(local146, local150, local154, local134, local138, local142, 0, 0, 0, Static244.method4186(local178, local70.aShortArray148[local120]), Static244.method4186(local178, local70.aShortArray148[local125]), Static244.method4186(local178, local70.aShortArray148[local130]));
							} else if (local70.aShortArray150 == null || local70.aShortArray150[local113] == -1) {
								local178 = local70.anIntArray774[local113];
								arg2.method1805(local146, local150, local154, local134, local138, local142, 0, 0, 0, Static244.method4186(local178, local70.aShortArray148[local120]), Static244.method4186(local178, local70.aShortArray148[local125]), Static244.method4186(local178, local70.aShortArray148[local130]));
							} else {
								local178 = super.aClass122_Sub1_16.method7287(local70.aShortArray150[local113]);
								arg2.method1805(local146, local150, local154, local134, local138, local142, 0, 0, 0, Static244.method4186(local178, local70.aShortArray148[local120]), Static244.method4186(local178, local70.aShortArray148[local125]), Static244.method4186(local178, local70.aShortArray148[local130]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local14;
			local26 += 4;
		}
		arg2.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([II[I[ILclient!eda;[III)V")
	private void method5873(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class77 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(18) Class112 local18 = super.aClass112ArrayArray3[arg6][arg1];
		@Pc(37) int local37;
		@Pc(47) int local47;
		@Pc(228) int local228;
		@Pc(306) int local306;
		@Pc(363) int local363;
		@Pc(420) int local420;
		@Pc(432) int local432;
		@Pc(217) int local217;
		@Pc(276) int local276;
		@Pc(334) int local334;
		@Pc(380) int local380;
		@Pc(247) int local247;
		@Pc(295) int local295;
		@Pc(352) int local352;
		@Pc(409) int local409;
		@Pc(75) int local75;
		@Pc(74) int local74;
		@Pc(72) int local72;
		@Pc(70) int local70;
		@Pc(470) int local470;
		@Pc(258) int local258;
		@Pc(317) int local317;
		@Pc(392) int local392;
		if (local18 == null) {
			@Pc(1124) Class298 local1124 = super.aClass298ArrayArray3[arg6][arg1];
			if (local1124 != null) {
				@Pc(1150) short local1150;
				if (super.anInt7543 == -1) {
					for (local420 = 0; local420 < local1124.aShort133; local420++) {
						local37 = local1124.aShortArray149[local420] + (arg6 << super.anInt8176);
						local1150 = local1124.aShortArray146[local420];
						local47 = local1124.aShortArray151[local420] + (arg1 << super.anInt8176);
						local363 = super.anInt7546 + (super.anInt7554 * local47 + super.anInt7545 * local37 + super.anInt7547 * local1150 >> 14);
						if (local363 <= super.aClass122_Sub1_16.anInt8841) {
							return;
						}
						local306 = (super.anInt7553 * local1150 + local37 * super.anInt7556 + local47 * super.anInt7544 >> 14) + super.anInt7555;
						local228 = super.anInt7549 + (super.anInt7550 * local47 + local37 * super.anInt7552 + super.anInt7551 * local1150 >> 14);
						arg0[local420] = arg4.anInt2139 + local228 * super.aClass122_Sub1_16.anInt8837 / local363;
						arg2[local420] = arg4.anInt2143 + super.aClass122_Sub1_16.anInt8855 * local306 / local363;
						arg3[local420] = local363;
					}
				} else {
					for (local420 = 0; local420 < local1124.aShort133; local420++) {
						local37 = local1124.aShortArray149[local420] + (arg6 << super.anInt8176);
						local1150 = local1124.aShortArray146[local420];
						local47 = local1124.aShortArray151[local420] + (arg1 << super.anInt8176);
						local228 = super.anInt7549 + (super.anInt7550 * local47 + super.anInt7552 * local37 + local1150 * super.anInt7551 >> 14);
						local306 = super.anInt7555 + (super.anInt7544 * local47 + super.anInt7556 * local37 + super.anInt7553 * local1150 >> 14);
						arg0[local420] = arg4.anInt2139 + local228 * super.aClass122_Sub1_16.anInt8837 / super.anInt7543;
						arg2[local420] = arg4.anInt2143 + local306 * super.aClass122_Sub1_16.anInt8855 / super.anInt7543;
						arg3[local420] = super.anInt7543;
					}
				}
				if (local1124.aShortArray150 == null) {
					for (local420 = 0; local420 < local1124.aShort132; local420++) {
						@Pc(1837) short local1837 = local1124.aShortArray152[local420];
						@Pc(1842) short local1842 = local1124.aShortArray153[local420];
						@Pc(1847) short local1847 = local1124.aShortArray147[local420];
						local432 = arg0[local1837];
						local217 = arg0[local1842];
						local276 = arg0[local1847];
						local334 = arg2[local1837];
						local380 = arg2[local1842];
						local247 = arg2[local1847];
						if (-((local276 - local217) * (local334 - local380)) + (local247 - local380) * (local432 + -local217) > 0) {
							local295 = local1124.anIntArray774[local420];
							if (local295 != -1) {
								arg4.aBoolean133 = local432 < 0 || local217 < 0 || local276 < 0 || local432 > arg4.anInt2144 || arg4.anInt2144 < local217 || local276 > arg4.anInt2144;
								arg4.method1805(local334, local380, local247, local432, local217, local276, arg3[1], arg3[2], arg3[3], Static244.method4186(local295, local1124.aShortArray148[local1837]), Static244.method4186(local295, local1124.aShortArray148[local1842]), Static244.method4186(local295, local1124.aShortArray148[local1847]));
							}
						}
					}
				} else {
					local420 = super.anIntArrayArray98[arg6][arg1];
					local258 = super.anIntArrayArray98[arg6 + 1][arg1];
					local317 = super.anIntArrayArray98[arg6][arg1 + 1];
					local392 = arg6 * super.anInt8175;
					local432 = super.anInt8175 + local392;
					local217 = arg1 * super.anInt8175;
					local276 = super.anInt8175 + local217;
					local334 = super.anInt7549 + (super.anInt7550 * local217 + super.anInt7552 * local392 + local420 * super.anInt7551 >> 14);
					local380 = super.anInt7555 + (super.anInt7544 * local217 + super.anInt7556 * local392 + super.anInt7553 * local420 >> 14);
					local247 = super.anInt7546 + (local392 * super.anInt7545 + local420 * super.anInt7547 + super.anInt7554 * local217 >> 14);
					local295 = super.anInt7549 + (local217 * super.anInt7550 + local432 * super.anInt7552 + local258 * super.anInt7551 >> 14);
					local352 = (super.anInt7553 * local258 + super.anInt7556 * local432 + super.anInt7544 * local217 >> 14) + super.anInt7555;
					local409 = (super.anInt7547 * local258 + local432 * super.anInt7545 + local217 * super.anInt7554 >> 14) + super.anInt7546;
					local75 = (super.anInt7552 * local392 + local317 * super.anInt7551 + super.anInt7550 * local276 >> 14) + super.anInt7549;
					local74 = (super.anInt7544 * local276 + local317 * super.anInt7553 + local392 * super.anInt7556 >> 14) + super.anInt7555;
					local72 = (super.anInt7547 * local317 + local392 * super.anInt7545 + local276 * super.anInt7554 >> 14) + super.anInt7546;
					for (local70 = 0; local70 < local1124.aShort132; local70++) {
						@Pc(1628) short local1628 = local1124.aShortArray152[local70];
						@Pc(1633) short local1633 = local1124.aShortArray153[local70];
						@Pc(1638) short local1638 = local1124.aShortArray147[local70];
						local470 = arg0[local1628];
						@Pc(1646) int local1646 = arg0[local1633];
						@Pc(1650) int local1650 = arg0[local1638];
						@Pc(1654) int local1654 = arg2[local1628];
						@Pc(1658) int local1658 = arg2[local1633];
						@Pc(1662) int local1662 = arg2[local1638];
						if (-((local1650 - local1646) * (local1654 + -local1658)) + (local470 - local1646) * (local1662 + -local1658) > 0) {
							arg4.aBoolean133 = local470 < 0 || local1646 < 0 || local1650 < 0 || arg4.anInt2144 < local470 || arg4.anInt2144 < local1646 || local1650 > arg4.anInt2144;
							@Pc(1724) short local1724 = local1124.aShortArray150[local70];
							if (local1724 == -1) {
								@Pc(1733) int local1733 = local1124.anIntArray774[local70];
								if (local1733 != -1) {
									arg4.method1805(local1654, local1658, local1662, local470, local1646, local1650, arg3[1], arg3[2], arg3[3], Static244.method4186(local1733, local1124.aShortArray148[local1628]), Static244.method4186(local1733, local1124.aShortArray148[local1633]), Static244.method4186(local1733, local1124.aShortArray148[local1638]));
								}
							} else {
								if (this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local1724).aByte87)) {
									arg4.anInt2141 = 100;
								}
								arg4.method1803(local1654, local1658, local1662, local470, local1646, local1650, local1124.aShortArray148[local1628], local1124.aShortArray148[local1633], local1124.aShortArray148[local1638], local334, local295, local75, local380, local352, local74, local247, local409, local72, local1724);
								arg4.anInt2141 = 0;
							}
						}
					}
				}
			}
		} else if ((local18.aByte47 & 0x2) == 0) {
			@Pc(31) int local31 = super.anInt8175 * arg6;
			local37 = local31 + super.anInt8175;
			@Pc(42) int local42 = arg1 * super.anInt8175;
			local47 = super.anInt8175 + local42;
			@Pc(62) int local62;
			@Pc(82) int local82;
			@Pc(199) int local199;
			if ((local18.aByte47 & 0x1) == 0) {
				local62 = super.anIntArrayArray98[arg6][arg1];
				local82 = super.anIntArrayArray98[arg6 + 1][arg1];
				local199 = super.anIntArrayArray98[arg6 + 1][arg1 + 1];
				local470 = super.anIntArrayArray98[arg6][arg1 + 1];
				if (super.anInt7543 == -1) {
					local75 = super.anInt7546 + (local42 * super.anInt7554 + local31 * super.anInt7545 + local62 * super.anInt7547 >> 14);
					if (super.aClass122_Sub1_16.anInt8841 >= local75) {
						return;
					}
					local74 = super.anInt7546 + (local42 * super.anInt7554 + local37 * super.anInt7545 + super.anInt7547 * local82 >> 14);
					if (super.aClass122_Sub1_16.anInt8841 >= local74) {
						return;
					}
					local72 = (local37 * super.anInt7545 + super.anInt7547 * local199 + local47 * super.anInt7554 >> 14) + super.anInt7546;
					if (local72 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local70 = (super.anInt7545 * local31 + local470 * super.anInt7547 + local47 * super.anInt7554 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local70) {
						return;
					}
				} else {
					local70 = super.anInt7543;
					local72 = super.anInt7543;
					local74 = super.anInt7543;
					local75 = super.anInt7543;
				}
				local217 = super.anInt7549 + (local42 * super.anInt7550 + super.anInt7551 * local62 + super.anInt7552 * local31 >> 14);
				local228 = local217 * super.aClass122_Sub1_16.anInt8837 / local75 + arg4.anInt2139;
				local247 = (local42 * super.anInt7544 + super.anInt7556 * local31 + local62 * super.anInt7553 >> 14) + super.anInt7555;
				local258 = arg4.anInt2143 + super.aClass122_Sub1_16.anInt8855 * local247 / local75;
				local276 = (super.anInt7552 * local37 + super.anInt7551 * local82 + super.anInt7550 * local42 >> 14) + super.anInt7549;
				local306 = arg4.anInt2139 + local276 * super.aClass122_Sub1_16.anInt8837 / local74;
				local295 = super.anInt7555 + (local42 * super.anInt7544 + local82 * super.anInt7553 + local37 * super.anInt7556 >> 14);
				local317 = super.aClass122_Sub1_16.anInt8855 * local295 / local74 + arg4.anInt2143;
				local334 = super.anInt7549 + (local47 * super.anInt7550 + local37 * super.anInt7552 + super.anInt7551 * local199 >> 14);
				local352 = (local199 * super.anInt7553 + super.anInt7556 * local37 + super.anInt7544 * local47 >> 14) + super.anInt7555;
				local363 = arg4.anInt2139 + local334 * super.aClass122_Sub1_16.anInt8837 / local72;
				local380 = (super.anInt7550 * local47 + super.anInt7551 * local470 + super.anInt7552 * local31 >> 14) + super.anInt7549;
				local392 = super.aClass122_Sub1_16.anInt8855 * local352 / local72 + arg4.anInt2143;
				local420 = arg4.anInt2139 + super.aClass122_Sub1_16.anInt8837 * local380 / local70;
				local409 = super.anInt7555 + (local47 * super.anInt7544 + super.anInt7556 * local31 + super.anInt7553 * local470 >> 14);
				local432 = arg4.anInt2143 + local409 * super.aClass122_Sub1_16.anInt8855 / local70;
			} else {
				local62 = super.anIntArrayArray98[arg6][arg1];
				if (super.anInt7543 == -1) {
					local82 = super.anInt7547 * local62;
					local75 = (super.anInt7545 * local31 + local82 + local42 * super.anInt7554 >> 14) + super.anInt7546;
					if (local75 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local74 = super.anInt7546 + (super.anInt7554 * local42 + local37 * super.anInt7545 + local82 >> 14);
					if (local74 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local72 = super.anInt7546 + (local47 * super.anInt7554 + local82 + local37 * super.anInt7545 >> 14);
					if (local72 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local70 = (local82 + super.anInt7545 * local31 + local47 * super.anInt7554 >> 14) + super.anInt7546;
					if (local70 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
				} else {
					local70 = super.anInt7543;
					local72 = super.anInt7543;
					local74 = super.anInt7543;
					local75 = super.anInt7543;
				}
				local82 = local62 * super.anInt7551;
				local199 = local62 * super.anInt7553;
				local217 = super.anInt7549 + (local42 * super.anInt7550 + local31 * super.anInt7552 + local82 >> 14);
				local228 = local217 * super.aClass122_Sub1_16.anInt8837 / local75 + arg4.anInt2139;
				local247 = super.anInt7555 + (super.anInt7544 * local42 + super.anInt7556 * local31 + local199 >> 14);
				local258 = super.aClass122_Sub1_16.anInt8855 * local247 / local75 + arg4.anInt2143;
				local276 = (super.anInt7552 * local37 + local82 + super.anInt7550 * local42 >> 14) + super.anInt7549;
				local295 = super.anInt7555 + (local199 + super.anInt7556 * local37 + local42 * super.anInt7544 >> 14);
				local306 = super.aClass122_Sub1_16.anInt8837 * local276 / local74 + arg4.anInt2139;
				local317 = arg4.anInt2143 + super.aClass122_Sub1_16.anInt8855 * local295 / local74;
				local334 = (super.anInt7550 * local47 + local82 + super.anInt7552 * local37 >> 14) + super.anInt7549;
				local352 = (local199 + super.anInt7556 * local37 + super.anInt7544 * local47 >> 14) + super.anInt7555;
				local363 = arg4.anInt2139 + local334 * super.aClass122_Sub1_16.anInt8837 / local72;
				local380 = super.anInt7549 + (local82 + super.anInt7552 * local31 + super.anInt7550 * local47 >> 14);
				local392 = arg4.anInt2143 + local352 * super.aClass122_Sub1_16.anInt8855 / local72;
				local409 = (local47 * super.anInt7544 + local199 + super.anInt7556 * local31 >> 14) + super.anInt7555;
				local420 = arg4.anInt2139 + super.aClass122_Sub1_16.anInt8837 * local380 / local70;
				local432 = arg4.anInt2143 + super.aClass122_Sub1_16.anInt8855 * local409 / local70;
			}
			if ((local363 - local420) * (-local432 + local317) - (local306 - local420) * (local392 - local432) > 0) {
				arg4.aBoolean133 = local363 < 0 || local420 < 0 || local306 < 0 || local363 > arg4.anInt2144 || local420 > arg4.anInt2144 || arg4.anInt2144 < local306;
				if (local18.aShort46 >= 0) {
					if (this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local18.aShort46).aByte87)) {
						arg4.anInt2141 = 100;
					}
					arg4.method1803(local392, local432, local317, local363, local420, local306, local18.aShort50 & 0xFFFF, local18.aShort48 & 0xFFFF, local18.aShort49 & 0xFFFF, local217, local276, local380, local247, local295, local409, local75, local74, local70, local18.aShort46);
					arg4.anInt2141 = 0;
				} else {
					arg4.method1805(local392, local432, local317, local363, local420, local306, local72, local70, local74, local18.aShort50 & 0xFFFF, local18.aShort48 & 0xFFFF, local18.aShort49 & 0xFFFF);
				}
			}
			if (-((local258 - local317) * (-local306 + local420)) + (local432 - local317) * (local228 - local306) > 0) {
				arg4.aBoolean133 = local228 < 0 || local306 < 0 || local420 < 0 || arg4.anInt2144 < local228 || arg4.anInt2144 < local306 || arg4.anInt2144 < local420;
				if (local18.aShort46 >= 0) {
					if (this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local18.aShort46).aByte87)) {
						arg4.anInt2141 = 100;
					}
					arg4.method1803(local258, local317, local432, local228, local306, local420, local18.aShort47 & 0xFFFF, local18.aShort49 & 0xFFFF, local18.aShort48 & 0xFFFF, local217, local276, local380, local247, local295, local409, local75, local74, local70, local18.aShort46);
					arg4.anInt2141 = 0;
					return;
				}
				arg4.method1805(local258, local317, local432, local228, local306, local420, local75, local74, local70, local18.aShort47 & 0xFFFF, local18.aShort49 & 0xFFFF, local18.aShort48 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
	@Override
	public void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class16_Sub1 local9 = (Class16_Sub1) super.aClass122_Sub1_16.method7289(Thread.currentThread());
		local9.aClass77_1.anInt2141 = 0;
		if (super.aClass121ArrayArray3 != null) {
			this.method5876(local9.anIntArray805, super.aClass122_Sub1_16.aBoolean620, local9.anIntArray811, local9.aClass77_1, arg0, local9.anIntArray818, local9.anIntArray794, arg1);
		} else if (super.aClass112ArrayArray3 != null) {
			this.method5873(local9.anIntArray805, arg1, local9.anIntArray818, local9.anIntArray794, local9.aClass77_1, local9.anIntArray811, arg0);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIB[II[I[[ZIILclient!eda;)V")
	private void method5875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) boolean[][] arg6, @OriginalArg(11) Class77 arg7) {
		@Pc(14) int local14 = (arg1 - arg4) * 1024 / 256;
		arg7.aBoolean132 = false;
		arg7.aBoolean130 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(40) int local40 = arg0; local40 < arg2; local40++) {
			for (@Pc(44) int local44 = arg4; local44 < arg1; local44++) {
				if (arg6[local40 - arg0][local44 - arg4]) {
					@Pc(89) int local89;
					if (super.aClass121ArrayArray3[local40][local44] != null) {
						@Pc(71) Class121 local71 = super.aClass121ArrayArray3[local40][local44];
						if (local71.aShort52 != -1 && (local71.aByte49 & 0x2) == 0 && local71.anInt3184 == 0) {
							local89 = super.aClass122_Sub1_16.method7287(local71.aShort52);
							arg7.method1805(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, Static244.method4186(local89, local71.anInt3188), Static244.method4186(local89, local71.anInt3186), Static244.method4186(local89, local71.anInt3185));
							arg7.method1805(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, Static244.method4186(local89, local71.anInt3187), Static244.method4186(local89, local71.anInt3185), Static244.method4186(local89, local71.anInt3186));
						} else if (local71.anInt3184 == 0) {
							arg7.method1814(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, local71.anInt3188, local71.anInt3186, local71.anInt3185);
							arg7.method1814(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, local71.anInt3187, local71.anInt3185, local71.anInt3186);
						} else {
							local89 = local71.anInt3184;
							arg7.method1814(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, 0, 0, 0, Static162.method2505(local71.anInt3188 & 0xFF000000, local89), Static162.method2505(local71.anInt3186 & 0xFF000000, local89), Static162.method2505(local71.anInt3185 & 0xFF000000, local89));
							arg7.method1814(local30, local30, local30 - 4, local26, local26 + 4, local26, 0, 0, 0, Static162.method2505(local71.anInt3187 & 0xFF000000, local89), Static162.method2505(local71.anInt3185 & 0xFF000000, local89), Static162.method2505(local71.anInt3186 & 0xFF000000, local89));
						}
					} else if (super.aClass57ArrayArray3[local40][local44] != null) {
						@Pc(311) Class57 local311 = super.aClass57ArrayArray3[local40][local44];
						for (local89 = 0; local89 < local311.aShort6; local89++) {
							arg3[local89] = local26 + local311.aShortArray30[local89] * 4 / super.anInt8175;
							arg5[local89] = local30 - local311.aShortArray27[local89] * 4 / super.anInt8175;
						}
						for (@Pc(351) int local351 = 0; local351 < local311.aShort5; local351++) {
							@Pc(357) int local357 = local351 * 3;
							@Pc(361) int local361 = local357 + 1;
							@Pc(365) int local365 = local361 + 1;
							@Pc(369) int local369 = arg3[local357];
							@Pc(373) int local373 = arg3[local361];
							@Pc(377) int local377 = arg3[local365];
							@Pc(381) int local381 = arg5[local357];
							@Pc(385) int local385 = arg5[local361];
							@Pc(389) int local389 = arg5[local365];
							@Pc(418) int local418;
							if (local311.anIntArray159 != null && local311.anIntArray159[local351] != 0 && (local311.aShortArray29 == null || local311.aShortArray29 != null && local311.aShortArray29[local351] == -1)) {
								local418 = local311.anIntArray159[local351];
								arg7.method1814(local381, local385, local389, local369, local373, local377, 0, 0, 0, Static162.method2505(-(-16777216 & local311.anIntArray160[local357]) - 16777216, local418), Static162.method2505(-(local311.anIntArray160[local361] & 0xFF000000) - 16777216, local418), Static162.method2505(-(local311.anIntArray160[local365] & -16777216) - 16777216, local418));
							} else if (local311.aShortArray29 == null || local311.aShortArray29[local351] == -1) {
								arg7.method1814(local381, local385, local389, local369, local373, local377, 0, 0, 0, local311.anIntArray160[local357], local311.anIntArray160[local361], local311.anIntArray160[local365]);
							} else {
								local418 = super.aClass122_Sub1_16.method7287(local311.aShortArray29[local351]);
								arg7.method1805(local381, local385, local389, local369, local373, local377, 0, 0, 0, local418, local418, local418);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local14;
			local26 += 4;
		}
		arg7.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6751(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class16_Sub1 local9 = (Class16_Sub1) super.aClass122_Sub1_16.method7289(Thread.currentThread());
		@Pc(12) Class77 local12 = local9.aClass77_1;
		local12.anInt2141 = 0;
		local12.aBoolean133 = false;
		if (super.aClass121ArrayArray3 != null) {
			this.method5875(arg0, arg3, arg2, local9.anIntArray805, arg1, local9.anIntArray818, arg4, local12);
		} else if (super.aClass112ArrayArray3 != null) {
			this.method5872(arg4, local9.anIntArray818, local12, arg2, local9.anIntArray805, arg0, arg3, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([IZ[ILclient!eda;I[I[III)V")
	private void method5876(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class77 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Class121 local16 = super.aClass121ArrayArray3[arg4][arg7];
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(45) int local45;
		@Pc(491) int local491;
		@Pc(535) int local535;
		@Pc(620) int local620;
		@Pc(663) int local663;
		@Pc(502) int local502;
		@Pc(567) int local567;
		@Pc(652) int local652;
		@Pc(694) int local694;
		@Pc(459) int local459;
		@Pc(524) int local524;
		@Pc(587) int local587;
		@Pc(641) int local641;
		@Pc(479) int local479;
		@Pc(555) int local555;
		@Pc(609) int local609;
		@Pc(683) int local683;
		@Pc(123) int local123;
		@Pc(153) int local153;
		@Pc(183) int local183;
		@Pc(209) int local209;
		@Pc(47) int local47;
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(241) int local241;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(90) int local90;
		@Pc(99) int local99;
		@Pc(333) int local333;
		if (local16 == null) {
			@Pc(1626) Class57 local1626 = super.aClass57ArrayArray3[arg4][arg7];
			if (local1626 != null) {
				if (super.anInt7543 == -1) {
					for (local663 = 0; local663 < local1626.aShort6; local663++) {
						local35 = local1626.aShortArray30[local663] + (arg4 << super.anInt8176);
						local40 = local1626.aShortArray26[local663];
						local45 = local1626.aShortArray27[local663] + (arg7 << super.anInt8176);
						local620 = super.anInt7546 + (super.anInt7547 * local40 + local35 * super.anInt7545 + super.anInt7554 * local45 >> 14);
						if (super.aClass122_Sub1_16.anInt8841 >= local620) {
							return;
						}
						arg2[local663] = 0;
						if (arg1) {
							local502 = local620 - super.aClass122_Sub1_16.lb;
							if (local502 > 255) {
								local502 = 255;
							}
							if (local502 > 0) {
								arg2[local663] = local502;
								local567 = local502 * local1626.aShortArray28[local663] / 255;
								if (local567 > 0) {
									local40 -= local567;
								}
							}
						} else if (super.aClass122_Sub1_16.aBoolean622) {
							local502 = local620 - super.aClass122_Sub1_16.lb;
							if (local502 > 0) {
								arg2[local663] = local502;
								if (arg2[local663] > 255) {
									arg2[local663] = 255;
								}
							}
						}
						local491 = (super.anInt7551 * local40 + local35 * super.anInt7552 + local45 * super.anInt7550 >> 14) + super.anInt7549;
						local535 = super.anInt7555 + (local45 * super.anInt7544 + local35 * super.anInt7556 + super.anInt7553 * local40 >> 14);
						arg0[local663] = super.aClass122_Sub1_16.anInt8837 * local491 / local620 + arg3.anInt2139;
						arg5[local663] = super.aClass122_Sub1_16.anInt8855 * local535 / local620 + arg3.anInt2143;
						arg6[local663] = local620;
					}
				} else {
					for (local663 = 0; local663 < local1626.aShort6; local663++) {
						local35 = local1626.aShortArray30[local663] + (arg4 << super.anInt8176);
						local40 = local1626.aShortArray26[local663];
						local45 = local1626.aShortArray27[local663] + (arg7 << super.anInt8176);
						arg2[local663] = 0;
						if (arg1) {
							local502 = super.anInt7543 - super.aClass122_Sub1_16.lb;
							if (local502 > 255) {
								local502 = 255;
							}
							if (local502 > 0) {
								arg2[local663] = local502;
								local567 = local1626.aShortArray28[local663] * local502 / 255;
								if (local567 > 0) {
									local40 -= local567;
								}
							}
						} else if (super.aClass122_Sub1_16.aBoolean622) {
							local502 = -super.aClass122_Sub1_16.lb + super.anInt7543;
							if (local502 > 0) {
								arg2[local663] = local502;
								if (arg2[local663] > 255) {
									arg2[local663] = 255;
								}
							}
						}
						local535 = super.anInt7555 + (super.anInt7544 * local45 + local40 * super.anInt7553 + local35 * super.anInt7556 >> 14);
						local491 = super.anInt7549 + (local35 * super.anInt7552 + super.anInt7551 * local40 + local45 * super.anInt7550 >> 14);
						arg0[local663] = local491 * super.aClass122_Sub1_16.anInt8837 / super.anInt7543 + arg3.anInt2139;
						arg5[local663] = arg3.anInt2143 + local535 * super.aClass122_Sub1_16.anInt8855 / super.anInt7543;
						arg6[local663] = super.anInt7543;
					}
				}
				if (local1626.aShortArray29 == null) {
					for (local663 = 0; local663 < local1626.aShort5; local663++) {
						local502 = local663 * 3;
						local567 = local502 + 1;
						local652 = local567 + 1;
						local694 = arg0[local502];
						local459 = arg0[local567];
						local524 = arg0[local652];
						local587 = arg5[local502];
						local641 = arg5[local567];
						local479 = arg5[local652];
						local555 = arg2[local502] + arg2[local567] + arg2[local652];
						if (-((local524 - local459) * (-local641 + local587)) + (local479 - local641) * (-local459 + local694) > 0) {
							arg3.aBoolean133 = local694 < 0 || local459 < 0 || local524 < 0 || arg3.anInt2144 < local694 || arg3.anInt2144 < local459 || arg3.anInt2144 < local524;
							if (local555 >= 765) {
								arg3.method1808(local587, local641, local479, local694, local459, local524, arg6[local502], arg6[local567], arg6[local652], super.aClass122_Sub1_16.anInt8846);
							} else if (local555 <= 0) {
								if ((local1626.anIntArray160[local502] & 0xFFFFFF) != 0) {
									arg3.method1814(local587, local641, local479, local694, local459, local524, arg6[local502], arg6[local567], arg6[local652], local1626.anIntArray160[local502], local1626.anIntArray160[local567], local1626.anIntArray160[local652]);
								}
							} else if ((local1626.anIntArray160[local502] & 0xFFFFFF) != 0) {
								arg3.method1814(local587, local641, local479, local694, local459, local524, arg6[local502], arg6[local567], arg6[local652], Static133.method2241(arg2[local502], local1626.anIntArray160[local502], super.aClass122_Sub1_16.anInt8846), Static133.method2241(arg2[local567], local1626.anIntArray160[local567], super.aClass122_Sub1_16.anInt8846), Static133.method2241(arg2[local652], local1626.anIntArray160[local652], super.aClass122_Sub1_16.anInt8846));
							}
						}
					}
				} else {
					local663 = super.anIntArrayArray98[arg4][arg7];
					local502 = super.anIntArrayArray98[arg4 + 1][arg7];
					local567 = super.anIntArrayArray98[arg4][arg7 + 1];
					local652 = super.anInt8175 * arg4;
					local694 = super.anInt8175 + local652;
					local459 = super.anInt8175 * arg7;
					local524 = local459 + super.anInt8175;
					local587 = (local459 * super.anInt7550 + local663 * super.anInt7551 + local652 * super.anInt7552 >> 14) + super.anInt7549;
					local641 = (super.anInt7544 * local459 + local663 * super.anInt7553 + local652 * super.anInt7556 >> 14) + super.anInt7555;
					local479 = super.anInt7546 + (local459 * super.anInt7554 + local663 * super.anInt7547 + local652 * super.anInt7545 >> 14);
					local555 = (super.anInt7550 * local459 + super.anInt7552 * local694 + local502 * super.anInt7551 >> 14) + super.anInt7549;
					local609 = (local459 * super.anInt7544 + super.anInt7553 * local502 + local694 * super.anInt7556 >> 14) + super.anInt7555;
					local683 = super.anInt7546 + (local459 * super.anInt7554 + local694 * super.anInt7545 + super.anInt7547 * local502 >> 14);
					local123 = (super.anInt7552 * local652 + super.anInt7551 * local567 + local524 * super.anInt7550 >> 14) + super.anInt7549;
					local153 = super.anInt7555 + (local652 * super.anInt7556 + super.anInt7553 * local567 + local524 * super.anInt7544 >> 14);
					local183 = (local652 * super.anInt7545 + super.anInt7547 * local567 + local524 * super.anInt7554 >> 14) + super.anInt7546;
					for (local209 = 0; local209 < local1626.aShort5; local209++) {
						local47 = local209 * 3;
						local49 = local47 + 1;
						local51 = local49 + 1;
						local53 = arg0[local47];
						local241 = arg0[local49];
						local70 = arg0[local51];
						local79 = arg5[local47];
						local90 = arg5[local49];
						local99 = arg5[local51];
						local333 = arg2[local47] + arg2[local49] + arg2[local51];
						if ((local53 - local241) * (local99 - local90) - (local79 - local90) * (local70 + -local241) > 0) {
							arg3.aBoolean133 = local53 < 0 || local241 < 0 || local70 < 0 || local53 > arg3.anInt2144 || local241 > arg3.anInt2144 || local70 > arg3.anInt2144;
							@Pc(2637) short local2637 = local1626.aShortArray29[local209];
							if (local333 >= 765) {
								arg3.method1808(local79, local90, local99, local53, local241, local70, arg6[local47], arg6[local49], arg6[local51], super.aClass122_Sub1_16.anInt8846);
							} else {
								if (local2637 != -1 && this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local2637).aByte87)) {
									arg3.anInt2141 = 100;
								}
								if (local333 <= 0) {
									if (local2637 != -1) {
										arg3.method1803(local79, local90, local99, local53, local241, local70, local1626.anIntArray160[local47], local1626.anIntArray160[local49], local1626.anIntArray160[local51], local587, local555, local123, local641, local609, local153, local479, local683, local183, local2637);
									} else if ((local1626.anIntArray160[local47] & 0xFFFFFF) != 0) {
										arg3.method1814(local79, local90, local99, local53, local241, local70, arg6[local47], arg6[local49], arg6[local51], local1626.anIntArray160[local47], local1626.anIntArray160[local49], local1626.anIntArray160[local51]);
									}
								} else if (local2637 != -1) {
									arg3.method1800(local79, local90, local99, local53, local241, local70, arg6[local47], arg6[local49], arg6[local51], super.aClass122_Sub1_16.anInt8846, arg2[local47], arg2[local49], arg2[local51], local1626.anIntArray160[local47], local1626.anIntArray160[local49], local1626.anIntArray160[local51], local587, local555, local123, local641, local609, local153, local479, local683, local183, local2637);
								} else if ((local1626.anIntArray160[local47] & 0xFFFFFF) != 0) {
									arg3.method1814(local79, local90, local99, local53, local241, local70, arg6[local47], arg6[local49], arg6[local51], Static162.method2505(super.aClass122_Sub1_16.anInt8846 | arg2[local47] << 24, local1626.anIntArray160[local47]), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | arg2[local49] << 24, local1626.anIntArray160[local49]), Static162.method2505(arg2[local51] << 24 | super.aClass122_Sub1_16.anInt8846, local1626.anIntArray160[local51]));
								}
								arg3.anInt2141 = 0;
							}
						}
					}
				}
			}
		} else if ((local16.aByte49 & 0x2) == 0) {
			@Pc(29) int local29 = arg4 * super.anInt8175;
			local35 = local29 + super.anInt8175;
			local40 = super.anInt8175 * arg7;
			local45 = super.anInt8175 + local40;
			local47 = 0;
			local49 = 0;
			local51 = 0;
			local53 = 0;
			if ((local16.aByte49 & 0x1) == 0 || arg1) {
				local70 = super.anIntArrayArray98[arg4][arg7];
				local79 = super.anIntArrayArray98[arg4 + 1][arg7];
				local90 = super.anIntArrayArray98[arg4 + 1][arg7 + 1];
				local99 = super.anIntArrayArray98[arg4][arg7 + 1];
				if (super.anInt7543 == -1) {
					local123 = (super.anInt7554 * local40 + local29 * super.anInt7545 + local70 * super.anInt7547 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local123) {
						return;
					}
					local153 = super.anInt7546 + (local40 * super.anInt7554 + super.anInt7545 * local35 + super.anInt7547 * local79 >> 14);
					if (local153 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local183 = (super.anInt7554 * local45 + local90 * super.anInt7547 + local35 * super.anInt7545 >> 14) + super.anInt7546;
					if (local183 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local209 = (super.anInt7554 * local45 + super.anInt7547 * local99 + local29 * super.anInt7545 >> 14) + super.anInt7546;
					if (local209 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
				} else {
					local209 = super.anInt7543;
					local183 = super.anInt7543;
					local153 = super.anInt7543;
					local123 = super.anInt7543;
				}
				if (arg1) {
					local241 = local123 - super.aClass122_Sub1_16.lb;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local47 = local241;
						local333 = local241 * local16.aShort53 / 255;
						if (local333 > 0) {
							local70 -= local333;
						}
					}
					local241 = local153 - super.aClass122_Sub1_16.lb;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local49 = local241;
						local333 = local16.aShort51 * local241 / 255;
						if (local333 > 0) {
							local79 -= local333;
						}
					}
					local241 = local183 - super.aClass122_Sub1_16.lb;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local51 = local241;
						local333 = local16.aShort55 * local241 / 255;
						if (local333 > 0) {
							local90 -= local333;
						}
					}
					local241 = local209 - super.aClass122_Sub1_16.lb;
					if (local241 > 255) {
						local241 = 255;
					}
					if (local241 > 0) {
						local53 = local241;
						local333 = local16.aShort54 * local241 / 255;
						if (local333 > 0) {
							local99 -= local333;
						}
					}
				} else if (super.aClass122_Sub1_16.aBoolean622) {
					local241 = local123 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local47 = local241;
						if (local241 > 255) {
							local47 = 255;
						}
					}
					local241 = local153 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local49 = local241;
						if (local241 > 255) {
							local49 = 255;
						}
					}
					local241 = local183 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local51 = local241;
						if (local241 > 255) {
							local51 = 255;
						}
					}
					local241 = local209 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local53 = local241;
						if (local241 > 255) {
							local53 = 255;
						}
					}
				}
				local459 = super.anInt7549 + (local40 * super.anInt7550 + super.anInt7551 * local70 + local29 * super.anInt7552 >> 14);
				local479 = (local29 * super.anInt7556 + super.anInt7553 * local70 + super.anInt7544 * local40 >> 14) + super.anInt7555;
				local491 = arg3.anInt2139 + local459 * super.aClass122_Sub1_16.anInt8837 / local123;
				local502 = local479 * super.aClass122_Sub1_16.anInt8855 / local123 + arg3.anInt2143;
				local524 = (super.anInt7552 * local35 + local79 * super.anInt7551 + super.anInt7550 * local40 >> 14) + super.anInt7549;
				local535 = super.aClass122_Sub1_16.anInt8837 * local524 / local153 + arg3.anInt2139;
				local555 = (super.anInt7544 * local40 + super.anInt7553 * local79 + super.anInt7556 * local35 >> 14) + super.anInt7555;
				local567 = arg3.anInt2143 + local555 * super.aClass122_Sub1_16.anInt8855 / local153;
				local587 = (super.anInt7550 * local45 + local90 * super.anInt7551 + local35 * super.anInt7552 >> 14) + super.anInt7549;
				local609 = super.anInt7555 + (local90 * super.anInt7553 + local35 * super.anInt7556 + local45 * super.anInt7544 >> 14);
				local620 = arg3.anInt2139 + super.aClass122_Sub1_16.anInt8837 * local587 / local183;
				local641 = super.anInt7549 + (local45 * super.anInt7550 + local99 * super.anInt7551 + local29 * super.anInt7552 >> 14);
				local652 = super.aClass122_Sub1_16.anInt8855 * local609 / local183 + arg3.anInt2143;
				local663 = local641 * super.aClass122_Sub1_16.anInt8837 / local209 + arg3.anInt2139;
				local683 = super.anInt7555 + (super.anInt7544 * local45 + local29 * super.anInt7556 + local99 * super.anInt7553 >> 14);
				local694 = local683 * super.aClass122_Sub1_16.anInt8855 / local209 + arg3.anInt2143;
			} else {
				local70 = super.anIntArrayArray98[arg4][arg7];
				if (super.anInt7543 == -1) {
					local79 = super.anInt7547 * local70;
					local123 = super.anInt7546 + (local79 + local29 * super.anInt7545 + local40 * super.anInt7554 >> 14);
					if (local123 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local153 = super.anInt7546 + (local35 * super.anInt7545 + local79 + local40 * super.anInt7554 >> 14);
					if (local153 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local183 = (local45 * super.anInt7554 + super.anInt7545 * local35 + local79 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local183) {
						return;
					}
					local209 = super.anInt7546 + (local45 * super.anInt7554 + local29 * super.anInt7545 + local79 >> 14);
					if (super.aClass122_Sub1_16.anInt8841 >= local209) {
						return;
					}
				} else {
					local209 = super.anInt7543;
					local183 = super.anInt7543;
					local153 = super.anInt7543;
					local123 = super.anInt7543;
				}
				if (super.aClass122_Sub1_16.aBoolean622) {
					local241 = local123 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local47 = local241;
						if (local241 > 255) {
							local47 = 255;
						}
					}
					local241 = local153 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local49 = local241;
						if (local241 > 255) {
							local49 = 255;
						}
					}
					local241 = local183 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local51 = local241;
						if (local241 > 255) {
							local51 = 255;
						}
					}
					local241 = local209 - super.aClass122_Sub1_16.lb;
					if (local241 > 0) {
						local53 = local241;
						if (local241 > 255) {
							local53 = 255;
						}
					}
				}
				local79 = local70 * super.anInt7551;
				local459 = (super.anInt7550 * local40 + local29 * super.anInt7552 + local79 >> 14) + super.anInt7549;
				local90 = super.anInt7553 * local70;
				local479 = (super.anInt7544 * local40 + local90 + local29 * super.anInt7556 >> 14) + super.anInt7555;
				local491 = arg3.anInt2139 + super.aClass122_Sub1_16.anInt8837 * local459 / local123;
				local524 = (local79 + local35 * super.anInt7552 + local40 * super.anInt7550 >> 14) + super.anInt7549;
				local502 = super.aClass122_Sub1_16.anInt8855 * local479 / local123 + arg3.anInt2143;
				local535 = arg3.anInt2139 + super.aClass122_Sub1_16.anInt8837 * local524 / local153;
				local555 = super.anInt7555 + (local35 * super.anInt7556 + local90 + local40 * super.anInt7544 >> 14);
				local567 = local555 * super.aClass122_Sub1_16.anInt8855 / local153 + arg3.anInt2143;
				local587 = (local35 * super.anInt7552 + local79 + local45 * super.anInt7550 >> 14) + super.anInt7549;
				local620 = arg3.anInt2139 + super.aClass122_Sub1_16.anInt8837 * local587 / local183;
				local609 = super.anInt7555 + (super.anInt7556 * local35 + local90 + local45 * super.anInt7544 >> 14);
				local652 = arg3.anInt2143 + local609 * super.aClass122_Sub1_16.anInt8855 / local183;
				local641 = (super.anInt7552 * local29 + local79 + local45 * super.anInt7550 >> 14) + super.anInt7549;
				local683 = super.anInt7555 + (super.anInt7556 * local29 + local90 + local45 * super.anInt7544 >> 14);
				local663 = arg3.anInt2139 + local641 * super.aClass122_Sub1_16.anInt8837 / local209;
				local694 = arg3.anInt2143 + super.aClass122_Sub1_16.anInt8855 * local683 / local209;
			}
			@Pc(1168) boolean local1168 = local16.aShort52 != -1 && this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local16.aShort52).aByte87);
			local79 = local49 + local51 + local53;
			if (-((local535 - local663) * (-local694 + local652)) + (local620 - local663) * (local567 - local694) > 0) {
				arg3.aBoolean133 = local620 < 0 || local663 < 0 || local535 < 0 || local620 > arg3.anInt2144 || arg3.anInt2144 < local663 || local535 > arg3.anInt2144;
				if (local79 >= 765) {
					arg3.method1808(local652, local694, local567, local620, local663, local535, local183, local209, local153, super.aClass122_Sub1_16.anInt8846);
				} else {
					if (local1168) {
						arg3.anInt2141 = 100;
					}
					if (local79 <= 0) {
						if (local16.aShort52 >= 0) {
							arg3.method1803(local652, local694, local567, local620, local663, local535, local16.anInt3188, local16.anInt3186, local16.anInt3185, local587, local641, local524, local609, local683, local555, local183, local209, local153, local16.aShort52);
						} else {
							arg3.method1814(local652, local694, local567, local620, local663, local535, local183, local209, local153, local16.anInt3188, local16.anInt3186, local16.anInt3185);
						}
					} else if (local16.aShort52 < 0) {
						arg3.method1814(local652, local694, local567, local620, local663, local535, local183, local209, local153, Static162.method2505(local51 << 24 | super.aClass122_Sub1_16.anInt8846, local16.anInt3188), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local53 << 24, local16.anInt3186), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local49 << 24, local16.anInt3185));
					} else {
						arg3.method1800(local652, local694, local567, local620, local663, local535, local183, local209, local153, super.aClass122_Sub1_16.anInt8846, local51, local53, local49, local16.anInt3188, local16.anInt3186, local16.anInt3185, local587, local641, local524, local609, local683, local555, local183, local209, local153, local16.aShort52);
					}
					arg3.anInt2141 = 0;
				}
			}
			local79 = local49 + local47 + local53;
			if (-((local502 - local567) * (-local535 + local663)) + (local491 - local535) * (local694 + -local567) > 0) {
				arg3.aBoolean133 = local491 < 0 || local535 < 0 || local663 < 0 || local491 > arg3.anInt2144 || local535 > arg3.anInt2144 || local663 > arg3.anInt2144;
				if (local79 < 765) {
					if (local1168) {
						arg3.anInt2141 = 100;
					}
					if (local79 <= 0) {
						if (local16.aShort52 < 0) {
							arg3.method1814(local502, local567, local694, local491, local535, local663, local123, local153, local209, local16.anInt3187, local16.anInt3185, local16.anInt3186);
						} else {
							arg3.method1803(local502, local567, local694, local491, local535, local663, local16.anInt3187, local16.anInt3185, local16.anInt3186, local459, local524, local641, local479, local555, local683, local123, local153, local209, local16.aShort52);
						}
					} else if (local16.aShort52 < 0) {
						arg3.method1814(local502, local567, local694, local491, local535, local663, local123, local153, local209, Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local47 << 24, local16.anInt3187), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local49 << 24, local16.anInt3185), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local53 << 24, local16.anInt3186));
					} else {
						arg3.method1800(local502, local567, local694, local491, local535, local663, local123, local153, local209, super.aClass122_Sub1_16.anInt8846, local47, local49, local53, local16.anInt3187, local16.anInt3185, local16.anInt3186, local459, local524, local641, local479, local555, local683, local123, local153, local209, local16.aShort52);
					}
					arg3.anInt2141 = 0;
					return;
				}
				arg3.method1808(local502, local567, local694, local491, local535, local663, local123, local153, local209, super.aClass122_Sub1_16.anInt8846);
			}
		}
	}
}
