import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class75_Sub2_Sub2 extends Class75_Sub2 {

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!fg;IIII[[I[[II)V")
	public Class75_Sub2_Sub2(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([II[I[II[ILclient!kc;I)V")
	private void method6711(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Class156 arg6) {
		@Pc(12) Class121 local12 = super.aClass121ArrayArray3[arg1][arg4];
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(247) int local247;
		@Pc(332) int local332;
		@Pc(376) int local376;
		@Pc(460) int local460;
		@Pc(299) int local299;
		@Pc(343) int local343;
		@Pc(428) int local428;
		@Pc(471) int local471;
		@Pc(235) int local235;
		@Pc(288) int local288;
		@Pc(365) int local365;
		@Pc(417) int local417;
		@Pc(268) int local268;
		@Pc(320) int local320;
		@Pc(396) int local396;
		@Pc(448) int local448;
		@Pc(110) int local110;
		@Pc(137) int local137;
		@Pc(164) int local164;
		@Pc(196) int local196;
		@Pc(84) int local84;
		if (local12 == null) {
			@Pc(1134) Class312 local1134 = super.aClass312ArrayArray3[arg1][arg4];
			if (local1134 != null) {
				@Pc(1160) short local1160;
				if (super.anInt8004 == -1) {
					for (local460 = 0; local460 < local1134.aShort163; local460++) {
						local30 = local1134.aShortArray149[local460] + (arg1 << super.anInt7996);
						local1160 = local1134.aShortArray151[local460];
						local40 = local1134.aShortArray148[local460] + (arg4 << super.anInt7996);
						local376 = super.anInt8010 + (local1160 * super.anInt8009 + local30 * super.anInt8001 + super.anInt8006 * local40 >> 15);
						if (local376 <= super.aClass39_Sub1_16.anInt2059) {
							return;
						}
						local247 = super.anInt7999 + (local30 * super.anInt8005 + super.anInt8007 * local1160 + local40 * super.anInt8008 >> 15);
						local332 = (super.anInt8002 * local1160 + local30 * super.anInt8003 + local40 * super.anInt8012 >> 15) + super.anInt8000;
						arg0[local460] = super.aClass39_Sub1_16.anInt2078 * local247 / local376 + arg6.anInt4323;
						arg3[local460] = arg6.anInt4319 + local332 * super.aClass39_Sub1_16.anInt2064 / local376;
						arg5[local460] = local376;
					}
				} else {
					for (local460 = 0; local460 < local1134.aShort163; local460++) {
						local30 = local1134.aShortArray149[local460] + (arg1 << super.anInt7996);
						local1160 = local1134.aShortArray151[local460];
						local40 = local1134.aShortArray148[local460] + (arg4 << super.anInt7996);
						local247 = super.anInt7999 + (local30 * super.anInt8005 + super.anInt8007 * local1160 + local40 * super.anInt8008 >> 15);
						local332 = (super.anInt8003 * local30 + local1160 * super.anInt8002 + super.anInt8012 * local40 >> 15) + super.anInt8000;
						arg0[local460] = super.aClass39_Sub1_16.anInt2078 * local247 / super.anInt8004 + arg6.anInt4323;
						arg3[local460] = super.aClass39_Sub1_16.anInt2064 * local332 / super.anInt8004 + arg6.anInt4319;
						arg5[local460] = super.anInt8004;
					}
				}
				if (local1134.aShortArray144 == null) {
					for (local460 = 0; local460 < local1134.aShort162; local460++) {
						@Pc(1847) short local1847 = local1134.aShortArray150[local460];
						@Pc(1852) short local1852 = local1134.aShortArray145[local460];
						@Pc(1857) short local1857 = local1134.aShortArray147[local460];
						local471 = arg0[local1847];
						local235 = arg0[local1852];
						local288 = arg0[local1857];
						local365 = arg3[local1847];
						local417 = arg3[local1852];
						local268 = arg3[local1857];
						if ((local471 - local235) * (local268 + -local417) - (local288 - local235) * (local365 - local417) > 0) {
							local320 = local1134.anIntArray753[local460];
							if (local320 != -1) {
								arg6.aBoolean329 = local471 < 0 || local235 < 0 || local288 < 0 || arg6.anInt4318 < local471 || arg6.anInt4318 < local235 || local288 > arg6.anInt4318;
								arg6.method3737(local365, local417, local268, local471, local235, local288, arg5[1], arg5[2], arg5[3], Static35.method704(local1134.aShortArray146[local1847], local320), Static35.method704(local1134.aShortArray146[local1852], local320), Static35.method704(local1134.aShortArray146[local1857], local320));
							}
						}
					}
				} else {
					local460 = super.anIntArrayArray70[arg1][arg4];
					local299 = super.anIntArrayArray70[arg1 + 1][arg4];
					local343 = super.anIntArrayArray70[arg1][arg4 + 1];
					local428 = arg1 * super.anInt7994;
					local471 = local428 + super.anInt7994;
					local235 = arg4 * super.anInt7994;
					local288 = super.anInt7994 + local235;
					local365 = (local235 * super.anInt8008 + local428 * super.anInt8005 + super.anInt8007 * local460 >> 15) + super.anInt7999;
					local417 = super.anInt8000 + (super.anInt8012 * local235 + local460 * super.anInt8002 + local428 * super.anInt8003 >> 15);
					local268 = (local460 * super.anInt8009 + local428 * super.anInt8001 + super.anInt8006 * local235 >> 15) + super.anInt8010;
					local320 = super.anInt7999 + (super.anInt8008 * local235 + local299 * super.anInt8007 + local471 * super.anInt8005 >> 15);
					local396 = super.anInt8000 + (local471 * super.anInt8003 + local299 * super.anInt8002 + super.anInt8012 * local235 >> 15);
					local448 = super.anInt8010 + (local471 * super.anInt8001 + super.anInt8009 * local299 + super.anInt8006 * local235 >> 15);
					local110 = (super.anInt8008 * local288 + super.anInt8007 * local343 + super.anInt8005 * local428 >> 15) + super.anInt7999;
					local137 = (super.anInt8012 * local288 + local343 * super.anInt8002 + local428 * super.anInt8003 >> 15) + super.anInt8000;
					local164 = (local343 * super.anInt8009 + super.anInt8001 * local428 + super.anInt8006 * local288 >> 15) + super.anInt8010;
					for (local196 = 0; local196 < local1134.aShort162; local196++) {
						@Pc(1641) short local1641 = local1134.aShortArray150[local196];
						@Pc(1646) short local1646 = local1134.aShortArray145[local196];
						@Pc(1651) short local1651 = local1134.aShortArray147[local196];
						local84 = arg0[local1641];
						@Pc(1659) int local1659 = arg0[local1646];
						@Pc(1663) int local1663 = arg0[local1651];
						@Pc(1667) int local1667 = arg3[local1641];
						@Pc(1671) int local1671 = arg3[local1646];
						@Pc(1675) int local1675 = arg3[local1651];
						if ((local1675 - local1671) * (-local1659 + local84) - (local1667 - local1671) * (-local1659 + local1663) > 0) {
							arg6.aBoolean329 = local84 < 0 || local1659 < 0 || local1663 < 0 || arg6.anInt4318 < local84 || arg6.anInt4318 < local1659 || local1663 > arg6.anInt4318;
							@Pc(1733) short local1733 = local1134.aShortArray144[local196];
							if (local1733 == -1) {
								@Pc(1790) int local1790 = local1134.anIntArray753[local196];
								if (local1790 != -1) {
									arg6.method3737(local1667, local1671, local1675, local84, local1659, local1663, arg5[1], arg5[2], arg5[3], Static35.method704(local1134.aShortArray146[local1641], local1790), Static35.method704(local1134.aShortArray146[local1646], local1790), Static35.method704(local1134.aShortArray146[local1651], local1790));
								}
							} else {
								if (this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local1733).aByte85)) {
									arg6.anInt4320 = 100;
								}
								arg6.method3743(local1667, local1671, local1675, local84, local1659, local1663, local1134.aShortArray146[local1641], local1134.aShortArray146[local1646], local1134.aShortArray146[local1651], local365, local320, local110, local417, local396, local137, local268, local448, local164, local1733);
								arg6.anInt4320 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte51 & 0x2) == 0) {
			@Pc(25) int local25 = super.anInt7994 * arg1;
			local30 = local25 + super.anInt7994;
			@Pc(35) int local35 = arg4 * super.anInt7994;
			local40 = super.anInt7994 + local35;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(75) int local75;
			if ((local12.aByte51 & 0x1) == 0) {
				local55 = super.anIntArrayArray70[arg1][arg4];
				local64 = super.anIntArrayArray70[arg1 + 1][arg4];
				local75 = super.anIntArrayArray70[arg1 + 1][arg4 + 1];
				local84 = super.anIntArrayArray70[arg1][arg4 + 1];
				if (super.anInt8004 == -1) {
					local110 = (local55 * super.anInt8009 + local25 * super.anInt8001 + super.anInt8006 * local35 >> 15) + super.anInt8010;
					if (local110 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local137 = super.anInt8010 + (super.anInt8006 * local35 + super.anInt8001 * local30 + super.anInt8009 * local64 >> 15);
					if (super.aClass39_Sub1_16.anInt2059 >= local137) {
						return;
					}
					local164 = (local30 * super.anInt8001 + super.anInt8009 * local75 + super.anInt8006 * local40 >> 15) + super.anInt8010;
					if (super.aClass39_Sub1_16.anInt2059 >= local164) {
						return;
					}
					local196 = super.anInt8010 + (super.anInt8009 * local84 + local25 * super.anInt8001 + super.anInt8006 * local40 >> 15);
					if (super.aClass39_Sub1_16.anInt2059 >= local196) {
						return;
					}
				} else {
					local196 = super.anInt8004;
					local164 = super.anInt8004;
					local137 = super.anInt8004;
					local110 = super.anInt8004;
				}
				local235 = super.anInt7999 + (local35 * super.anInt8008 + super.anInt8007 * local55 + super.anInt8005 * local25 >> 15);
				local247 = arg6.anInt4323 + super.aClass39_Sub1_16.anInt2078 * local235 / local110;
				local268 = (local35 * super.anInt8012 + super.anInt8003 * local25 + local55 * super.anInt8002 >> 15) + super.anInt8000;
				local288 = (super.anInt8008 * local35 + super.anInt8005 * local30 + super.anInt8007 * local64 >> 15) + super.anInt7999;
				local299 = super.aClass39_Sub1_16.anInt2064 * local268 / local110 + arg6.anInt4319;
				local320 = (super.anInt8012 * local35 + local30 * super.anInt8003 + super.anInt8002 * local64 >> 15) + super.anInt8000;
				local332 = arg6.anInt4323 + super.aClass39_Sub1_16.anInt2078 * local288 / local137;
				local343 = super.aClass39_Sub1_16.anInt2064 * local320 / local137 + arg6.anInt4319;
				local365 = super.anInt7999 + (super.anInt8008 * local40 + local30 * super.anInt8005 + local75 * super.anInt8007 >> 15);
				local376 = super.aClass39_Sub1_16.anInt2078 * local365 / local164 + arg6.anInt4323;
				local396 = (local40 * super.anInt8012 + local30 * super.anInt8003 + local75 * super.anInt8002 >> 15) + super.anInt8000;
				local417 = (local84 * super.anInt8007 + super.anInt8005 * local25 + local40 * super.anInt8008 >> 15) + super.anInt7999;
				local428 = arg6.anInt4319 + super.aClass39_Sub1_16.anInt2064 * local396 / local164;
				local448 = (super.anInt8012 * local40 + local25 * super.anInt8003 + super.anInt8002 * local84 >> 15) + super.anInt8000;
				local460 = arg6.anInt4323 + super.aClass39_Sub1_16.anInt2078 * local417 / local196;
				local471 = local448 * super.aClass39_Sub1_16.anInt2064 / local196 + arg6.anInt4319;
			} else {
				local55 = super.anIntArrayArray70[arg1][arg4];
				if (super.anInt8004 == -1) {
					local64 = local55 * super.anInt8009;
					local110 = (super.anInt8006 * local35 + super.anInt8001 * local25 + local64 >> 15) + super.anInt8010;
					if (local110 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local137 = (local64 + local30 * super.anInt8001 + local35 * super.anInt8006 >> 15) + super.anInt8010;
					if (local137 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local164 = (super.anInt8001 * local30 + local64 + local40 * super.anInt8006 >> 15) + super.anInt8010;
					if (local164 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local196 = (super.anInt8001 * local25 + local64 + local40 * super.anInt8006 >> 15) + super.anInt8010;
					if (super.aClass39_Sub1_16.anInt2059 >= local196) {
						return;
					}
				} else {
					local196 = super.anInt8004;
					local164 = super.anInt8004;
					local137 = super.anInt8004;
					local110 = super.anInt8004;
				}
				local64 = local55 * super.anInt8007;
				local235 = (local64 + local25 * super.anInt8005 + local35 * super.anInt8008 >> 15) + super.anInt7999;
				local75 = super.anInt8002 * local55;
				local247 = local235 * super.aClass39_Sub1_16.anInt2078 / local110 + arg6.anInt4323;
				local268 = (super.anInt8012 * local35 + super.anInt8003 * local25 + local75 >> 15) + super.anInt8000;
				local299 = super.aClass39_Sub1_16.anInt2064 * local268 / local110 + arg6.anInt4319;
				local288 = (local64 + local30 * super.anInt8005 + local35 * super.anInt8008 >> 15) + super.anInt7999;
				local320 = (local75 + local30 * super.anInt8003 + super.anInt8012 * local35 >> 15) + super.anInt8000;
				local332 = local288 * super.aClass39_Sub1_16.anInt2078 / local137 + arg6.anInt4323;
				local365 = (local64 + local30 * super.anInt8005 + local40 * super.anInt8008 >> 15) + super.anInt7999;
				local343 = super.aClass39_Sub1_16.anInt2064 * local320 / local137 + arg6.anInt4319;
				local396 = (local30 * super.anInt8003 + local75 + super.anInt8012 * local40 >> 15) + super.anInt8000;
				local376 = local365 * super.aClass39_Sub1_16.anInt2078 / local164 + arg6.anInt4323;
				local417 = super.anInt7999 + (super.anInt8005 * local25 + local64 + super.anInt8008 * local40 >> 15);
				local428 = arg6.anInt4319 + super.aClass39_Sub1_16.anInt2064 * local396 / local164;
				local448 = super.anInt8000 + (local25 * super.anInt8003 + local75 + super.anInt8012 * local40 >> 15);
				local460 = super.aClass39_Sub1_16.anInt2078 * local417 / local196 + arg6.anInt4323;
				local471 = arg6.anInt4319 + super.aClass39_Sub1_16.anInt2064 * local448 / local196;
			}
			if ((local343 - local471) * (local376 + -local460) - (local428 - local471) * (-local460 + local332) > 0) {
				arg6.aBoolean329 = local376 < 0 || local460 < 0 || local332 < 0 || local376 > arg6.anInt4318 || local460 > arg6.anInt4318 || arg6.anInt4318 < local332;
				if (local12.aShort63 < 0) {
					arg6.method3737(local428, local471, local343, local376, local460, local332, local164, local196, local137, local12.aShort61 & 0xFFFF, local12.aShort65 & 0xFFFF, local12.aShort62 & 0xFFFF);
				} else {
					if (this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local12.aShort63).aByte85)) {
						arg6.anInt4320 = 100;
					}
					arg6.method3743(local428, local471, local343, local376, local460, local332, local12.aShort61 & 0xFFFF, local12.aShort65 & 0xFFFF, local12.aShort62 & 0xFFFF, local235, local288, local417, local268, local320, local448, local110, local137, local196, local12.aShort63);
					arg6.anInt4320 = 0;
				}
			}
			if (-((local460 - local332) * (local299 - local343)) + (local247 - local332) * (-local343 + local471) > 0) {
				arg6.aBoolean329 = local247 < 0 || local332 < 0 || local460 < 0 || arg6.anInt4318 < local247 || arg6.anInt4318 < local332 || arg6.anInt4318 < local460;
				if (local12.aShort63 >= 0) {
					if (this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local12.aShort63).aByte85)) {
						arg6.anInt4320 = 100;
					}
					arg6.method3743(local299, local343, local471, local247, local332, local460, local12.aShort64 & 0xFFFF, local12.aShort62 & 0xFFFF, local12.aShort65 & 0xFFFF, local235, local288, local417, local268, local320, local448, local110, local137, local196, local12.aShort63);
					arg6.anInt4320 = 0;
					return;
				}
				arg6.method3737(local299, local343, local471, local247, local332, local460, local110, local137, local196, local12.aShort64 & 0xFFFF, local12.aShort62 & 0xFFFF, local12.aShort65 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
	@Override
	public void method6699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class76_Sub1 local9 = (Class76_Sub1) super.aClass39_Sub1_16.method2050(Thread.currentThread());
		local9.aClass156_1.anInt4320 = 0;
		if (super.aClass152ArrayArray3 != null) {
			this.method6714(local9.anIntArray539, local9.aClass156_1, local9.anIntArray537, arg1, super.aClass39_Sub1_16.aBoolean155, local9.anIntArray546, local9.anIntArray544, arg0);
		} else if (super.aClass121ArrayArray3 != null) {
			this.method6711(local9.anIntArray546, arg0, local9.anIntArray539, local9.anIntArray544, arg1, local9.anIntArray537, local9.aClass156_1);
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIILclient!kc;I[I[I[[ZI)V")
	private void method6713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class156 arg4, @OriginalArg(8) int[] arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) boolean[][] arg7) {
		@Pc(19) int local19 = (arg0 - arg1) * 1024 / 256;
		arg4.aBoolean327 = false;
		arg4.aBoolean328 = false;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = local19;
		for (@Pc(37) int local37 = arg2; local37 < arg3; local37++) {
			for (@Pc(41) int local41 = arg1; local41 < arg0; local41++) {
				if (arg7[local37 - arg2][local41 - arg1]) {
					@Pc(86) int local86;
					if (super.aClass152ArrayArray3[local37][local41] != null) {
						@Pc(68) Class152 local68 = super.aClass152ArrayArray3[local37][local41];
						if (local68.aShort90 != -1 && (local68.aByte63 & 0x2) == 0 && local68.anInt4285 == 0) {
							local86 = super.aClass39_Sub1_16.method2049(local68.aShort90);
							arg4.method3737(local35 - 4, local35 - 4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, Static35.method704(local68.anInt4288, local86), Static35.method704(local68.anInt4287, local86), Static35.method704(local68.anInt4284, local86));
							arg4.method3737(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, Static35.method704(local68.anInt4286, local86), Static35.method704(local68.anInt4284, local86), Static35.method704(local68.anInt4287, local86));
						} else if (local68.anInt4285 == 0) {
							arg4.method3744(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, local68.anInt4288, local68.anInt4287, local68.anInt4284);
							arg4.method3744(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, local68.anInt4286, local68.anInt4284, local68.anInt4287);
						} else {
							local86 = local68.anInt4285;
							arg4.method3744(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, Static114.method2231(local68.anInt4288 & 0xFF000000, local86), Static114.method2231(local68.anInt4287 & 0xFF000000, local86), Static114.method2231(local68.anInt4284 & 0xFF000000, local86));
							arg4.method3744(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, Static114.method2231(local68.anInt4286 & 0xFF000000, local86), Static114.method2231(local68.anInt4284 & 0xFF000000, local86), Static114.method2231(local68.anInt4287 & 0xFF000000, local86));
						}
					} else if (super.aClass294ArrayArray3[local37][local41] != null) {
						@Pc(307) Class294 local307 = super.aClass294ArrayArray3[local37][local41];
						for (local86 = 0; local86 < local307.aShort151; local86++) {
							arg5[local86] = local307.aShortArray127[local86] * 4 / super.anInt7994 + local31;
							arg6[local86] = local35 - local307.aShortArray128[local86] * 4 / super.anInt7994;
						}
						for (@Pc(346) int local346 = 0; local346 < local307.aShort150; local346++) {
							@Pc(352) int local352 = local346 * 3;
							@Pc(356) int local356 = local352 + 1;
							@Pc(360) int local360 = local356 + 1;
							@Pc(364) int local364 = arg5[local352];
							@Pc(368) int local368 = arg5[local356];
							@Pc(372) int local372 = arg5[local360];
							@Pc(376) int local376 = arg6[local352];
							@Pc(380) int local380 = arg6[local356];
							@Pc(384) int local384 = arg6[local360];
							@Pc(450) int local450;
							if (local307.anIntArray676 != null && local307.anIntArray676[local346] != 0 && (local307.aShortArray126 == null || local307.aShortArray126 != null && local307.aShortArray126[local346] == -1)) {
								local450 = local307.anIntArray676[local346];
								arg4.method3744(local376, local380, local384, local364, local368, local372, 0, 0, 0, Static114.method2231(-(-16777216 & local307.anIntArray677[local352]) - 16777216, local450), Static114.method2231(-(local307.anIntArray677[local356] & 0xFF000000) - 16777216, local450), Static114.method2231(-(-16777216 & local307.anIntArray677[local360]) - 16777216, local450));
							} else if (local307.aShortArray126 == null || local307.aShortArray126[local346] == -1) {
								arg4.method3744(local376, local380, local384, local364, local368, local372, 0, 0, 0, local307.anIntArray677[local352], local307.anIntArray677[local356], local307.anIntArray677[local360]);
							} else {
								local450 = super.aClass39_Sub1_16.method2049(local307.aShortArray126[local346]);
								arg4.method3737(local376, local380, local384, local364, local368, local372, 0, 0, 0, local450, local450, local450);
							}
						}
					}
				}
				local35 -= 4;
			}
			local31 += 4;
			local35 = local19;
		}
		arg4.aBoolean328 = true;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([ILclient!kc;[IIZI[I[II)V")
	private void method6714(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		@Pc(17) Class152 local17 = super.aClass152ArrayArray3[arg7][arg3];
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(47) int local47;
		@Pc(305) int local305;
		@Pc(364) int local364;
		@Pc(439) int local439;
		@Pc(497) int local497;
		@Pc(352) int local352;
		@Pc(410) int local410;
		@Pc(467) int local467;
		@Pc(508) int local508;
		@Pc(289) int local289;
		@Pc(341) int local341;
		@Pc(399) int local399;
		@Pc(456) int local456;
		@Pc(323) int local323;
		@Pc(382) int local382;
		@Pc(427) int local427;
		@Pc(486) int local486;
		@Pc(97) int local97;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(171) int local171;
		@Pc(49) int local49;
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(201) int local201;
		@Pc(69) int local69;
		@Pc(79) int local79;
		@Pc(294) int local294;
		@Pc(546) int local546;
		@Pc(698) int local698;
		if (local17 == null) {
			@Pc(1625) Class294 local1625 = super.aClass294ArrayArray3[arg7][arg3];
			if (local1625 != null) {
				if (super.anInt8004 == -1) {
					for (local497 = 0; local497 < local1625.aShort151; local497++) {
						local36 = local1625.aShortArray127[local497] + (arg7 << super.anInt7996);
						local41 = local1625.aShortArray125[local497];
						local47 = local1625.aShortArray128[local497] + (arg3 << super.anInt7996);
						local439 = super.anInt8010 + (local41 * super.anInt8009 + super.anInt8001 * local36 + super.anInt8006 * local47 >> 15);
						if (super.aClass39_Sub1_16.anInt2059 >= local439) {
							return;
						}
						arg0[local497] = 0;
						if (arg4) {
							local352 = local439 - super.aClass39_Sub1_16.anInt2076;
							if (local352 > 255) {
								local352 = 255;
							}
							if (local352 > 0) {
								arg0[local497] = local352;
								local410 = local1625.aShortArray129[local497] * local352 / 255;
								if (local410 > 0) {
									local41 -= local410;
								}
							}
						} else if (super.aClass39_Sub1_16.aBoolean156) {
							local352 = local439 - super.aClass39_Sub1_16.anInt2076;
							if (local352 > 0) {
								arg0[local497] = local352;
								if (arg0[local497] > 255) {
									arg0[local497] = 255;
								}
							}
						}
						local305 = (local41 * super.anInt8007 + local36 * super.anInt8005 + super.anInt8008 * local47 >> 15) + super.anInt7999;
						local364 = (local36 * super.anInt8003 + local41 * super.anInt8002 + local47 * super.anInt8012 >> 15) + super.anInt8000;
						arg5[local497] = super.aClass39_Sub1_16.anInt2078 * local305 / local439 + arg1.anInt4323;
						arg6[local497] = super.aClass39_Sub1_16.anInt2064 * local364 / local439 + arg1.anInt4319;
						arg2[local497] = local439;
					}
				} else {
					for (local497 = 0; local497 < local1625.aShort151; local497++) {
						local36 = local1625.aShortArray127[local497] + (arg7 << super.anInt7996);
						local41 = local1625.aShortArray125[local497];
						local47 = local1625.aShortArray128[local497] + (arg3 << super.anInt7996);
						arg0[local497] = 0;
						if (arg4) {
							local352 = super.anInt8004 - super.aClass39_Sub1_16.anInt2076;
							if (local352 > 255) {
								local352 = 255;
							}
							if (local352 > 0) {
								arg0[local497] = local352;
								local410 = local352 * local1625.aShortArray129[local497] / 255;
								if (local410 > 0) {
									local41 -= local410;
								}
							}
						} else if (super.aClass39_Sub1_16.aBoolean156) {
							local352 = -super.aClass39_Sub1_16.anInt2076 + super.anInt8004;
							if (local352 > 0) {
								arg0[local497] = local352;
								if (arg0[local497] > 255) {
									arg0[local497] = 255;
								}
							}
						}
						local364 = super.anInt8000 + (super.anInt8002 * local41 + local36 * super.anInt8003 + local47 * super.anInt8012 >> 15);
						local305 = (local47 * super.anInt8008 + super.anInt8005 * local36 + local41 * super.anInt8007 >> 15) + super.anInt7999;
						arg5[local497] = arg1.anInt4323 + super.aClass39_Sub1_16.anInt2078 * local305 / super.anInt8004;
						arg6[local497] = super.aClass39_Sub1_16.anInt2064 * local364 / super.anInt8004 + arg1.anInt4319;
						arg2[local497] = super.anInt8004;
					}
				}
				if (local1625.aShortArray126 == null) {
					for (local497 = 0; local497 < local1625.aShort150; local497++) {
						local352 = local497 * 3;
						local410 = local352 + 1;
						local467 = local410 + 1;
						local508 = arg5[local352];
						local289 = arg5[local410];
						local341 = arg5[local467];
						local399 = arg6[local352];
						local456 = arg6[local410];
						local323 = arg6[local467];
						local382 = arg0[local410] + arg0[local352] + arg0[local467];
						if (-((local341 - local289) * (local399 - local456)) + (local508 - local289) * (local323 - local456) > 0) {
							arg1.aBoolean329 = local508 < 0 || local289 < 0 || local341 < 0 || local508 > arg1.anInt4318 || arg1.anInt4318 < local289 || local341 > arg1.anInt4318;
							if (local382 >= 765) {
								arg1.method3741(local399, local456, local323, local508, local289, local341, arg2[local352], arg2[local410], arg2[local467], super.aClass39_Sub1_16.anInt2085);
							} else if (local382 > 0) {
								if ((local1625.anIntArray677[local352] & 0xFFFFFF) != 0) {
									arg1.method3744(local399, local456, local323, local508, local289, local341, arg2[local352], arg2[local410], arg2[local467], Static21.method552(super.aClass39_Sub1_16.anInt2085, local1625.anIntArray677[local352], arg0[local352]), Static21.method552(super.aClass39_Sub1_16.anInt2085, local1625.anIntArray677[local410], arg0[local410]), Static21.method552(super.aClass39_Sub1_16.anInt2085, local1625.anIntArray677[local467], arg0[local467]));
								}
							} else if ((local1625.anIntArray677[local352] & 0xFFFFFF) != 0) {
								arg1.method3744(local399, local456, local323, local508, local289, local341, arg2[local352], arg2[local410], arg2[local467], local1625.anIntArray677[local352], local1625.anIntArray677[local410], local1625.anIntArray677[local467]);
							}
						}
					}
				} else {
					local497 = super.anIntArrayArray70[arg7][arg3];
					local352 = super.anIntArrayArray70[arg7 + 1][arg3];
					local410 = super.anIntArrayArray70[arg7][arg3 + 1];
					local467 = arg7 * super.anInt7994;
					local508 = local467 + super.anInt7994;
					local289 = super.anInt7994 * arg3;
					local341 = super.anInt7994 + local289;
					local399 = super.anInt7999 + (local467 * super.anInt8005 + super.anInt8007 * local497 + super.anInt8008 * local289 >> 15);
					local456 = (super.anInt8012 * local289 + local467 * super.anInt8003 + local497 * super.anInt8002 >> 15) + super.anInt8000;
					local323 = super.anInt8010 + (local497 * super.anInt8009 + local467 * super.anInt8001 + super.anInt8006 * local289 >> 15);
					local382 = (super.anInt8005 * local508 + local352 * super.anInt8007 + super.anInt8008 * local289 >> 15) + super.anInt7999;
					local427 = (local352 * super.anInt8002 + super.anInt8003 * local508 + super.anInt8012 * local289 >> 15) + super.anInt8000;
					local486 = (super.anInt8006 * local289 + super.anInt8009 * local352 + local508 * super.anInt8001 >> 15) + super.anInt8010;
					local97 = super.anInt7999 + (super.anInt8007 * local410 + local467 * super.anInt8005 + super.anInt8008 * local341 >> 15);
					local124 = (super.anInt8002 * local410 + super.anInt8003 * local467 + local341 * super.anInt8012 >> 15) + super.anInt8000;
					local147 = super.anInt8010 + (super.anInt8006 * local341 + local410 * super.anInt8009 + local467 * super.anInt8001 >> 15);
					for (local171 = 0; local171 < local1625.aShort150; local171++) {
						local49 = local171 * 3;
						local51 = local49 + 1;
						local53 = local51 + 1;
						local55 = arg5[local49];
						local201 = arg5[local51];
						local69 = arg5[local53];
						local79 = arg6[local49];
						local294 = arg6[local51];
						local546 = arg6[local53];
						local698 = arg0[local49] + arg0[local51] + arg0[local53];
						if (-((local79 - local294) * (local69 - local201)) + (local55 - local201) * (local546 - local294) > 0) {
							arg1.aBoolean329 = local55 < 0 || local201 < 0 || local69 < 0 || arg1.anInt4318 < local55 || arg1.anInt4318 < local201 || local69 > arg1.anInt4318;
							@Pc(2627) short local2627 = local1625.aShortArray126[local171];
							if (local698 >= 765) {
								arg1.method3741(local79, local294, local546, local55, local201, local69, arg2[local49], arg2[local51], arg2[local53], super.aClass39_Sub1_16.anInt2085);
							} else {
								if (local2627 != -1 && this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local2627).aByte85)) {
									arg1.anInt4320 = 100;
								}
								if (local698 <= 0) {
									if (local2627 != -1) {
										arg1.method3743(local79, local294, local546, local55, local201, local69, local1625.anIntArray677[local49], local1625.anIntArray677[local51], local1625.anIntArray677[local53], local399, local382, local97, local456, local427, local124, local323, local486, local147, local2627);
									} else if ((local1625.anIntArray677[local49] & 0xFFFFFF) != 0) {
										arg1.method3744(local79, local294, local546, local55, local201, local69, arg2[local49], arg2[local51], arg2[local53], local1625.anIntArray677[local49], local1625.anIntArray677[local51], local1625.anIntArray677[local53]);
									}
								} else if (local2627 != -1) {
									arg1.method3740(local79, local294, local546, local55, local201, local69, arg2[local49], arg2[local51], arg2[local53], super.aClass39_Sub1_16.anInt2085, arg0[local49], arg0[local51], arg0[local53], local1625.anIntArray677[local49], local1625.anIntArray677[local51], local1625.anIntArray677[local53], local399, local382, local97, local456, local427, local124, local323, local486, local147, local2627);
								} else if ((local1625.anIntArray677[local49] & 0xFFFFFF) != 0) {
									arg1.method3744(local79, local294, local546, local55, local201, local69, arg2[local49], arg2[local51], arg2[local53], Static114.method2231(arg0[local49] << 24 | super.aClass39_Sub1_16.anInt2085, local1625.anIntArray677[local49]), Static114.method2231(arg0[local51] << 24 | super.aClass39_Sub1_16.anInt2085, local1625.anIntArray677[local51]), Static114.method2231(arg0[local53] << 24 | super.aClass39_Sub1_16.anInt2085, local1625.anIntArray677[local53]));
								}
								arg1.anInt4320 = 0;
							}
						}
					}
				}
			}
		} else if ((local17.aByte63 & 0x2) == 0) {
			@Pc(30) int local30 = arg7 * super.anInt7994;
			local36 = local30 + super.anInt7994;
			local41 = arg3 * super.anInt7994;
			local47 = local41 + super.anInt7994;
			local49 = 0;
			local51 = 0;
			local53 = 0;
			local55 = 0;
			if ((local17.aByte63 & 0x1) == 0 || arg4) {
				local69 = super.anIntArrayArray70[arg7][arg3];
				local79 = super.anIntArrayArray70[arg7 + 1][arg3];
				local294 = super.anIntArrayArray70[arg7 + 1][arg3 + 1];
				local546 = super.anIntArrayArray70[arg7][arg3 + 1];
				if (super.anInt8004 == -1) {
					local97 = (super.anInt8001 * local30 + local69 * super.anInt8009 + super.anInt8006 * local41 >> 15) + super.anInt8010;
					if (super.aClass39_Sub1_16.anInt2059 >= local97) {
						return;
					}
					local124 = super.anInt8010 + (local36 * super.anInt8001 + local79 * super.anInt8009 + local41 * super.anInt8006 >> 15);
					if (local124 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local147 = (super.anInt8006 * local47 + local36 * super.anInt8001 + super.anInt8009 * local294 >> 15) + super.anInt8010;
					if (local147 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local171 = (super.anInt8009 * local546 + super.anInt8001 * local30 + local47 * super.anInt8006 >> 15) + super.anInt8010;
					if (local171 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
				} else {
					local171 = super.anInt8004;
					local147 = super.anInt8004;
					local124 = super.anInt8004;
					local97 = super.anInt8004;
				}
				if (arg4) {
					local201 = local97 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local49 = local201;
						local698 = local17.aShort93 * local201 / 255;
						if (local698 > 0) {
							local69 -= local698;
						}
					}
					local201 = local124 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local51 = local201;
						local698 = local17.aShort91 * local201 / 255;
						if (local698 > 0) {
							local79 -= local698;
						}
					}
					local201 = local147 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local53 = local201;
						local698 = local17.aShort92 * local201 / 255;
						if (local698 > 0) {
							local294 -= local698;
						}
					}
					local201 = local171 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local55 = local201;
						local698 = local201 * local17.aShort94 / 255;
						if (local698 > 0) {
							local546 -= local698;
						}
					}
				} else if (super.aClass39_Sub1_16.aBoolean156) {
					local201 = local97 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local49 = local201;
						if (local201 > 255) {
							local49 = 255;
						}
					}
					local201 = local124 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local51 = local201;
						if (local201 > 255) {
							local51 = 255;
						}
					}
					local201 = local147 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local53 = local201;
						if (local201 > 255) {
							local53 = 255;
						}
					}
					local201 = local171 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local55 = local201;
						if (local201 > 255) {
							local55 = 255;
						}
					}
				}
				local289 = (local41 * super.anInt8008 + super.anInt8007 * local69 + local30 * super.anInt8005 >> 15) + super.anInt7999;
				local305 = arg1.anInt4323 + local289 * super.aClass39_Sub1_16.anInt2078 / local97;
				local323 = super.anInt8000 + (super.anInt8012 * local41 + local30 * super.anInt8003 + super.anInt8002 * local69 >> 15);
				local352 = arg1.anInt4319 + local323 * super.aClass39_Sub1_16.anInt2064 / local97;
				local341 = super.anInt7999 + (local41 * super.anInt8008 + super.anInt8007 * local79 + super.anInt8005 * local36 >> 15);
				local364 = local341 * super.aClass39_Sub1_16.anInt2078 / local124 + arg1.anInt4323;
				local382 = super.anInt8000 + (local41 * super.anInt8012 + super.anInt8002 * local79 + super.anInt8003 * local36 >> 15);
				local410 = super.aClass39_Sub1_16.anInt2064 * local382 / local124 + arg1.anInt4319;
				local399 = (local47 * super.anInt8008 + local36 * super.anInt8005 + local294 * super.anInt8007 >> 15) + super.anInt7999;
				local427 = (local47 * super.anInt8012 + local36 * super.anInt8003 + local294 * super.anInt8002 >> 15) + super.anInt8000;
				local439 = super.aClass39_Sub1_16.anInt2078 * local399 / local147 + arg1.anInt4323;
				local467 = arg1.anInt4319 + local427 * super.aClass39_Sub1_16.anInt2064 / local147;
				local456 = super.anInt7999 + (super.anInt8008 * local47 + super.anInt8005 * local30 + super.anInt8007 * local546 >> 15);
				local486 = (local47 * super.anInt8012 + super.anInt8003 * local30 + local546 * super.anInt8002 >> 15) + super.anInt8000;
				local497 = super.aClass39_Sub1_16.anInt2078 * local456 / local171 + arg1.anInt4323;
				local508 = arg1.anInt4319 + super.aClass39_Sub1_16.anInt2064 * local486 / local171;
			} else {
				local69 = super.anIntArrayArray70[arg7][arg3];
				if (super.anInt8004 == -1) {
					local79 = local69 * super.anInt8009;
					local97 = super.anInt8010 + (local79 + super.anInt8001 * local30 + super.anInt8006 * local41 >> 15);
					if (local97 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local124 = (super.anInt8006 * local41 + local79 + super.anInt8001 * local36 >> 15) + super.anInt8010;
					if (local124 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
					local147 = (super.anInt8006 * local47 + local79 + super.anInt8001 * local36 >> 15) + super.anInt8010;
					if (super.aClass39_Sub1_16.anInt2059 >= local147) {
						return;
					}
					local171 = (local47 * super.anInt8006 + super.anInt8001 * local30 + local79 >> 15) + super.anInt8010;
					if (local171 <= super.aClass39_Sub1_16.anInt2059) {
						return;
					}
				} else {
					local171 = super.anInt8004;
					local147 = super.anInt8004;
					local124 = super.anInt8004;
					local97 = super.anInt8004;
				}
				if (super.aClass39_Sub1_16.aBoolean156) {
					local201 = local97 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local49 = local201;
						if (local201 > 255) {
							local49 = 255;
						}
					}
					local201 = local124 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local51 = local201;
						if (local201 > 255) {
							local51 = 255;
						}
					}
					local201 = local147 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local53 = local201;
						if (local201 > 255) {
							local53 = 255;
						}
					}
					local201 = local171 - super.aClass39_Sub1_16.anInt2076;
					if (local201 > 0) {
						local55 = local201;
						if (local201 > 255) {
							local55 = 255;
						}
					}
				}
				local79 = local69 * super.anInt8007;
				local289 = super.anInt7999 + (super.anInt8008 * local41 + super.anInt8005 * local30 + local79 >> 15);
				local294 = local69 * super.anInt8002;
				local305 = arg1.anInt4323 + super.aClass39_Sub1_16.anInt2078 * local289 / local97;
				local323 = (local41 * super.anInt8012 + local30 * super.anInt8003 + local294 >> 15) + super.anInt8000;
				local341 = super.anInt7999 + (super.anInt8008 * local41 + local79 + super.anInt8005 * local36 >> 15);
				local352 = super.aClass39_Sub1_16.anInt2064 * local323 / local97 + arg1.anInt4319;
				local364 = arg1.anInt4323 + local341 * super.aClass39_Sub1_16.anInt2078 / local124;
				local382 = super.anInt8000 + (super.anInt8003 * local36 + local294 + local41 * super.anInt8012 >> 15);
				local399 = (local47 * super.anInt8008 + local79 + local36 * super.anInt8005 >> 15) + super.anInt7999;
				local410 = arg1.anInt4319 + super.aClass39_Sub1_16.anInt2064 * local382 / local124;
				local427 = (super.anInt8012 * local47 + local294 + super.anInt8003 * local36 >> 15) + super.anInt8000;
				local439 = arg1.anInt4323 + local399 * super.aClass39_Sub1_16.anInt2078 / local147;
				local456 = (local47 * super.anInt8008 + super.anInt8005 * local30 + local79 >> 15) + super.anInt7999;
				local467 = local427 * super.aClass39_Sub1_16.anInt2064 / local147 + arg1.anInt4319;
				local486 = super.anInt8000 + (local47 * super.anInt8012 + local30 * super.anInt8003 + local294 >> 15);
				local497 = super.aClass39_Sub1_16.anInt2078 * local456 / local171 + arg1.anInt4323;
				local508 = local486 * super.aClass39_Sub1_16.anInt2064 / local171 + arg1.anInt4319;
			}
			@Pc(1162) boolean local1162 = local17.aShort90 != -1 && this.method6707(super.aClass39_Sub1_16.anInterface12_15.method2573(local17.aShort90).aByte85);
			local79 = local53 + local51 + local55;
			if (-((local467 - local508) * (local364 - local497)) + (local439 - local497) * (local410 - local508) > 0) {
				arg1.aBoolean329 = local439 < 0 || local497 < 0 || local364 < 0 || local439 > arg1.anInt4318 || local497 > arg1.anInt4318 || arg1.anInt4318 < local364;
				if (local79 < 765) {
					if (local1162) {
						arg1.anInt4320 = 100;
					}
					if (local79 <= 0) {
						if (local17.aShort90 >= 0) {
							arg1.method3743(local467, local508, local410, local439, local497, local364, local17.anInt4288, local17.anInt4287, local17.anInt4284, local399, local456, local341, local427, local486, local382, local147, local171, local124, local17.aShort90);
						} else {
							arg1.method3744(local467, local508, local410, local439, local497, local364, local147, local171, local124, local17.anInt4288, local17.anInt4287, local17.anInt4284);
						}
					} else if (local17.aShort90 < 0) {
						arg1.method3744(local467, local508, local410, local439, local497, local364, local147, local171, local124, Static114.method2231(local53 << 24 | super.aClass39_Sub1_16.anInt2085, local17.anInt4288), Static114.method2231(super.aClass39_Sub1_16.anInt2085 | local55 << 24, local17.anInt4287), Static114.method2231(super.aClass39_Sub1_16.anInt2085 | local51 << 24, local17.anInt4284));
					} else {
						arg1.method3740(local467, local508, local410, local439, local497, local364, local147, local171, local124, super.aClass39_Sub1_16.anInt2085, local53, local55, local51, local17.anInt4288, local17.anInt4287, local17.anInt4284, local399, local456, local341, local427, local486, local382, local147, local171, local124, local17.aShort90);
					}
					arg1.anInt4320 = 0;
				} else {
					arg1.method3741(local467, local508, local410, local439, local497, local364, local147, local171, local124, super.aClass39_Sub1_16.anInt2085);
				}
			}
			local79 = local49 + local51 + local55;
			if (-((local497 - local364) * (local352 + -local410)) + (local305 - local364) * (local508 + -local410) > 0) {
				arg1.aBoolean329 = local305 < 0 || local364 < 0 || local497 < 0 || local305 > arg1.anInt4318 || arg1.anInt4318 < local364 || arg1.anInt4318 < local497;
				if (local79 < 765) {
					if (local1162) {
						arg1.anInt4320 = 100;
					}
					if (local79 <= 0) {
						if (local17.aShort90 < 0) {
							arg1.method3744(local352, local410, local508, local305, local364, local497, local97, local124, local171, local17.anInt4286, local17.anInt4284, local17.anInt4287);
						} else {
							arg1.method3743(local352, local410, local508, local305, local364, local497, local17.anInt4286, local17.anInt4284, local17.anInt4287, local289, local341, local456, local323, local382, local486, local97, local124, local171, local17.aShort90);
						}
					} else if (local17.aShort90 < 0) {
						arg1.method3744(local352, local410, local508, local305, local364, local497, local97, local124, local171, Static114.method2231(local49 << 24 | super.aClass39_Sub1_16.anInt2085, local17.anInt4286), Static114.method2231(local51 << 24 | super.aClass39_Sub1_16.anInt2085, local17.anInt4284), Static114.method2231(super.aClass39_Sub1_16.anInt2085 | local55 << 24, local17.anInt4287));
					} else {
						arg1.method3740(local352, local410, local508, local305, local364, local497, local97, local124, local171, super.aClass39_Sub1_16.anInt2085, local49, local51, local55, local17.anInt4286, local17.anInt4284, local17.anInt4287, local289, local341, local456, local323, local382, local486, local97, local124, local171, local17.aShort90);
					}
					arg1.anInt4320 = 0;
					return;
				}
				arg1.method3741(local352, local410, local508, local305, local364, local497, local97, local124, local171, super.aClass39_Sub1_16.anInt2085);
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([[ZI[ILclient!kc;IIIIIII[I)V")
	private void method6715(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class156 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(11) int[] arg7) {
		@Pc(14) int local14 = (arg1 - arg5) * 1024 / 256;
		arg3.aBoolean327 = false;
		arg3.aBoolean328 = false;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = local14;
		for (@Pc(37) int local37 = arg6; local37 < arg4; local37++) {
			for (@Pc(41) int local41 = arg5; local41 < arg1; local41++) {
				if (arg0[local37 - arg6][local41 - arg5]) {
					@Pc(90) int local90;
					if (super.aClass121ArrayArray3[local37][local41] != null) {
						@Pc(69) Class121 local69 = super.aClass121ArrayArray3[local37][local41];
						if (local69.aShort63 != -1 && (local69.aByte51 & 0x2) == 0 && local69.anInt3408 == -1) {
							local90 = super.aClass39_Sub1_16.method2049(local69.aShort63);
							arg3.method3737(local35 - 4, local35 - 4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, Static35.method704(local69.aShort61 & 0xFFFF, local90), Static35.method704(local69.aShort65 & 0xFFFF, local90), Static35.method704(local69.aShort62 & 0xFFFF, local90));
							arg3.method3737(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, Static35.method704(local69.aShort64 & 0xFFFF, local90), Static35.method704(local69.aShort62 & 0xFFFF, local90), Static35.method704(local69.aShort65 & 0xFFFF, local90));
						} else if (local69.anInt3408 == -1) {
							arg3.method3737(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, local69.aShort61 & 0xFFFF, local69.aShort65 & 0xFFFF, local69.aShort62 & 0xFFFF);
							arg3.method3737(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, local69.aShort64 & 0xFFFF, local69.aShort62 & 0xFFFF, local69.aShort65 & 0xFFFF);
						} else {
							local90 = local69.anInt3408;
							arg3.method3737(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, 0, 0, 0, local90, local90, local90);
							arg3.method3737(local35, local35, local35 - 4, local31, local31 + 4, local31, 0, 0, 0, local90, local90, local90);
						}
					} else if (super.aClass312ArrayArray3[local37][local41] != null) {
						@Pc(298) Class312 local298 = super.aClass312ArrayArray3[local37][local41];
						for (local90 = 0; local90 < local298.aShort163; local90++) {
							arg2[local90] = local31 + local298.aShortArray149[local90] * 4 / super.anInt7994;
							arg7[local90] = local35 - local298.aShortArray148[local90] * 4 / super.anInt7994;
						}
						for (@Pc(342) int local342 = 0; local342 < local298.aShort162; local342++) {
							@Pc(349) short local349 = local298.aShortArray150[local342];
							@Pc(354) short local354 = local298.aShortArray145[local342];
							@Pc(359) short local359 = local298.aShortArray147[local342];
							@Pc(363) int local363 = arg2[local349];
							@Pc(367) int local367 = arg2[local354];
							@Pc(371) int local371 = arg2[local359];
							@Pc(375) int local375 = arg7[local349];
							@Pc(379) int local379 = arg7[local354];
							@Pc(383) int local383 = arg7[local359];
							@Pc(410) int local410;
							if (local298.anIntArray754 != null && local298.anIntArray754[local342] != -1) {
								local410 = local298.anIntArray754[local342];
								arg3.method3737(local375, local379, local383, local363, local367, local371, 0, 0, 0, Static35.method704(local298.aShortArray146[local349], local410), Static35.method704(local298.aShortArray146[local354], local410), Static35.method704(local298.aShortArray146[local359], local410));
							} else if (local298.aShortArray144 == null || local298.aShortArray144[local342] == -1) {
								local410 = local298.anIntArray753[local342];
								arg3.method3737(local375, local379, local383, local363, local367, local371, 0, 0, 0, Static35.method704(local298.aShortArray146[local349], local410), Static35.method704(local298.aShortArray146[local354], local410), Static35.method704(local298.aShortArray146[local359], local410));
							} else {
								local410 = super.aClass39_Sub1_16.method2049(local298.aShortArray144[local342]);
								arg3.method3737(local375, local379, local383, local363, local367, local371, 0, 0, 0, Static35.method704(local298.aShortArray146[local349], local410), Static35.method704(local298.aShortArray146[local354], local410), Static35.method704(local298.aShortArray146[local359], local410));
							}
						}
					}
				}
				local35 -= 4;
			}
			local31 += 4;
			local35 = local14;
		}
		arg3.aBoolean328 = true;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6698(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class76_Sub1 local9 = (Class76_Sub1) super.aClass39_Sub1_16.method2050(Thread.currentThread());
		@Pc(12) Class156 local12 = local9.aClass156_1;
		local12.anInt4320 = 0;
		local12.aBoolean329 = false;
		if (super.aClass152ArrayArray3 != null) {
			this.method6713(arg3, arg1, arg0, arg2, local12, local9.anIntArray546, local9.anIntArray544, arg4);
		} else if (super.aClass121ArrayArray3 != null) {
			this.method6715(arg4, arg3, local9.anIntArray546, local12, arg2, arg1, arg0, local9.anIntArray544);
			return;
		}
	}
}
