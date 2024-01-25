import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class62_Sub1_Sub1 extends Class62_Sub1 {

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!uq;IIII[[I[[II)V")
	public Class62_Sub1_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V")
	@Override
	public void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class179_Sub1 local9 = (Class179_Sub1) super.aClass9_Sub1_6.method1653(Thread.currentThread());
		local9.aClass303_1.anInt8842 = 0;
		if (super.aClass53ArrayArray3 != null) {
			this.method3569(local9.anIntArray739, local9.anIntArray744, local9.anIntArray738, arg0, local9.aClass303_1, arg1, super.aClass9_Sub1_6.aBoolean183, local9.anIntArray733);
		} else if (super.aClass279ArrayArray3 != null) {
			this.method3565(arg0, local9.anIntArray739, arg1, local9.anIntArray738, local9.aClass303_1, local9.anIntArray744, local9.anIntArray733);
			return;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		super.anInt4255 = -1;
		@Pc(12) Class8_Sub1 local12 = super.aClass9_Sub1_6.aClass8_Sub1_3;
		super.anInt4258 = local12.anInt170;
		super.anInt4251 = local12.anInt166;
		super.anInt4249 = local12.anInt165;
		super.anInt4252 = local12.anInt168;
		super.anInt4254 = local12.anInt167;
		super.anInt4257 = local12.anInt164;
		super.anInt4247 = local12.anInt160;
		super.anInt4250 = local12.anInt169;
		super.anInt4253 = local12.anInt161;
		super.anInt4248 = local12.anInt163;
		super.anInt4246 = local12.anInt162;
		super.anInt4256 = local12.anInt171;
		for (@Pc(62) int local62 = 0; local62 < arg2 + arg2; local62++) {
			for (@Pc(66) int local66 = 0; local66 < arg2 + arg2; local66++) {
				if (arg3[local62][local66]) {
					@Pc(81) int local81 = arg0 + local62 - arg2;
					@Pc(88) int local88 = arg1 + local66 - arg2;
					if (local81 >= 0 && super.anInt9881 > local81 && local88 >= 0 && local88 < super.anInt9885) {
						this.method8204(local81, local88);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[II[IILclient!tn;[I[I)V")
	private void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Class303 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(16) Class279 local16 = super.aClass279ArrayArray3[arg0][arg2];
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(223) int local223;
		@Pc(301) int local301;
		@Pc(340) int local340;
		@Pc(415) int local415;
		@Pc(426) int local426;
		@Pc(212) int local212;
		@Pc(272) int local272;
		@Pc(318) int local318;
		@Pc(387) int local387;
		@Pc(243) int local243;
		@Pc(290) int local290;
		@Pc(358) int local358;
		@Pc(404) int local404;
		@Pc(73) int local73;
		@Pc(72) int local72;
		@Pc(70) int local70;
		@Pc(68) int local68;
		@Pc(464) int local464;
		@Pc(254) int local254;
		@Pc(329) int local329;
		@Pc(370) int local370;
		if (local16 == null) {
			@Pc(1132) Class282 local1132 = super.aClass282ArrayArray3[arg0][arg2];
			if (local1132 != null) {
				@Pc(1157) short local1157;
				if (super.anInt4255 == -1) {
					for (local415 = 0; local415 < local1132.aShort120; local415++) {
						local34 = local1132.aShortArray145[local415] + (arg0 << super.anInt9883);
						local1157 = local1132.aShortArray141[local415];
						local44 = local1132.aShortArray148[local415] + (arg2 << super.anInt9883);
						local340 = super.anInt4246 + (super.anInt4256 * local1157 + local34 * super.anInt4254 + local44 * super.anInt4251 >> 14);
						if (local340 <= super.aClass9_Sub1_6.anInt1811) {
							return;
						}
						local301 = super.anInt4258 + (local34 * super.anInt4247 + super.anInt4257 * local1157 + local44 * super.anInt4249 >> 14);
						local223 = (local1157 * super.anInt4248 + super.anInt4250 * local34 + local44 * super.anInt4252 >> 14) + super.anInt4253;
						arg6[local415] = arg4.anInt8841 + super.aClass9_Sub1_6.anInt1817 * local223 / local340;
						arg3[local415] = super.aClass9_Sub1_6.anInt1827 * local301 / local340 + arg4.anInt8843;
						arg5[local415] = local340;
					}
				} else {
					for (local415 = 0; local415 < local1132.aShort120; local415++) {
						local34 = local1132.aShortArray145[local415] + (arg0 << super.anInt9883);
						local1157 = local1132.aShortArray141[local415];
						local44 = local1132.aShortArray148[local415] + (arg2 << super.anInt9883);
						local301 = super.anInt4258 + (super.anInt4247 * local34 + super.anInt4257 * local1157 + local44 * super.anInt4249 >> 14);
						local223 = (super.anInt4248 * local1157 + super.anInt4250 * local34 + super.anInt4252 * local44 >> 14) + super.anInt4253;
						arg6[local415] = local223 * super.aClass9_Sub1_6.anInt1817 / super.anInt4255 + arg4.anInt8841;
						arg3[local415] = arg4.anInt8843 + local301 * super.aClass9_Sub1_6.anInt1827 / super.anInt4255;
						arg5[local415] = super.anInt4255;
					}
				}
				if (local1132.aShortArray147 == null) {
					for (local415 = 0; local415 < local1132.aShort121; local415++) {
						@Pc(1854) short local1854 = local1132.aShortArray140[local415];
						@Pc(1859) short local1859 = local1132.aShortArray143[local415];
						@Pc(1864) short local1864 = local1132.aShortArray144[local415];
						local426 = arg6[local1854];
						local212 = arg6[local1859];
						local272 = arg6[local1864];
						local318 = arg3[local1854];
						local387 = arg3[local1859];
						local243 = arg3[local1864];
						if (-((local272 - local212) * (local318 + -local387)) + (local243 - local387) * (local426 + -local212) > 0) {
							local290 = local1132.anIntArray703[local415];
							if (local290 != -1) {
								arg4.aBoolean666 = local426 < 0 || local212 < 0 || local272 < 0 || arg4.anInt8846 < local426 || arg4.anInt8846 < local212 || arg4.anInt8846 < local272;
								arg4.method7419(local318, local387, local243, local426, local212, local272, arg5[local1854], arg5[local1859], arg5[local1864], Static499.method7465(local290, local1132.aShortArray142[local1854]), Static499.method7465(local290, local1132.aShortArray142[local1859]), Static499.method7465(local290, local1132.aShortArray142[local1864]));
							}
						}
					}
				} else {
					local415 = super.anIntArrayArray30[arg0][arg2];
					local254 = super.anIntArrayArray30[arg0 + 1][arg2];
					local329 = super.anIntArrayArray30[arg0][arg2 + 1];
					local370 = super.anInt9884 * arg0;
					local426 = super.anInt9884 + local370;
					local212 = arg2 * super.anInt9884;
					local272 = super.anInt9884 + local212;
					local318 = (local212 * super.anInt4252 + local415 * super.anInt4248 + local370 * super.anInt4250 >> 14) + super.anInt4253;
					local387 = (super.anInt4249 * local212 + local415 * super.anInt4257 + super.anInt4247 * local370 >> 14) + super.anInt4258;
					local243 = (super.anInt4256 * local415 + super.anInt4254 * local370 + local212 * super.anInt4251 >> 14) + super.anInt4246;
					local290 = (local426 * super.anInt4250 + super.anInt4248 * local254 + local212 * super.anInt4252 >> 14) + super.anInt4253;
					local358 = super.anInt4258 + (super.anInt4249 * local212 + super.anInt4257 * local254 + super.anInt4247 * local426 >> 14);
					local404 = (super.anInt4251 * local212 + local426 * super.anInt4254 + local254 * super.anInt4256 >> 14) + super.anInt4246;
					local73 = (local370 * super.anInt4250 + super.anInt4248 * local329 + local272 * super.anInt4252 >> 14) + super.anInt4253;
					local72 = super.anInt4258 + (local272 * super.anInt4249 + local329 * super.anInt4257 + super.anInt4247 * local370 >> 14);
					local70 = (super.anInt4254 * local370 + super.anInt4256 * local329 + super.anInt4251 * local272 >> 14) + super.anInt4246;
					for (local68 = 0; local68 < local1132.aShort121; local68++) {
						@Pc(1636) short local1636 = local1132.aShortArray140[local68];
						@Pc(1641) short local1641 = local1132.aShortArray143[local68];
						@Pc(1646) short local1646 = local1132.aShortArray144[local68];
						local464 = arg6[local1636];
						@Pc(1654) int local1654 = arg6[local1641];
						@Pc(1658) int local1658 = arg6[local1646];
						@Pc(1662) int local1662 = arg3[local1636];
						@Pc(1666) int local1666 = arg3[local1641];
						@Pc(1670) int local1670 = arg3[local1646];
						if ((local1670 - local1666) * (local464 + -local1654) - (local1658 - local1654) * (-local1666 + local1662) > 0) {
							arg4.aBoolean666 = local464 < 0 || local1654 < 0 || local1658 < 0 || local464 > arg4.anInt8846 || arg4.anInt8846 < local1654 || arg4.anInt8846 < local1658;
							@Pc(1729) short local1729 = local1132.aShortArray147[local68];
							if (local1729 == -1) {
								@Pc(1794) int local1794 = local1132.anIntArray703[local68];
								if (local1794 != -1) {
									arg4.method7419(local1662, local1666, local1670, local464, local1654, local1658, arg5[local1636], arg5[local1641], arg5[local1646], Static499.method7465(local1794, local1132.aShortArray142[local1636]), Static499.method7465(local1794, local1132.aShortArray142[local1641]), Static499.method7465(local1794, local1132.aShortArray142[local1646]));
								}
							} else {
								if (this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local1729).aByte104)) {
									arg4.anInt8842 = 100;
								}
								arg4.method7422(local1662, local1666, local1670, local464, local1654, local1658, arg5[local1636], arg5[local1641], arg5[local1646], local1132.aShortArray142[local1636], local1132.aShortArray142[local1641], local1132.aShortArray142[local1646], local318, local290, local73, local387, local358, local72, local243, local404, local70, local1729);
								arg4.anInt8842 = 0;
							}
						}
					}
				}
			}
		} else if ((local16.aByte99 & 0x2) == 0) {
			@Pc(29) int local29 = arg0 * super.anInt9884;
			local34 = super.anInt9884 + local29;
			@Pc(39) int local39 = arg2 * super.anInt9884;
			local44 = super.anInt9884 + local39;
			@Pc(59) int local59;
			@Pc(80) int local80;
			@Pc(194) int local194;
			if ((local16.aByte99 & 0x1) == 0) {
				local59 = super.anIntArrayArray30[arg0][arg2];
				local80 = super.anIntArrayArray30[arg0 + 1][arg2];
				local194 = super.anIntArrayArray30[arg0 + 1][arg2 + 1];
				local464 = super.anIntArrayArray30[arg0][arg2 + 1];
				if (super.anInt4255 == -1) {
					local73 = super.anInt4246 + (local29 * super.anInt4254 + local59 * super.anInt4256 + super.anInt4251 * local39 >> 14);
					if (local73 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local72 = super.anInt4246 + (local80 * super.anInt4256 + local34 * super.anInt4254 + super.anInt4251 * local39 >> 14);
					if (local72 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local70 = super.anInt4246 + (super.anInt4254 * local34 + local194 * super.anInt4256 + super.anInt4251 * local44 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local70) {
						return;
					}
					local68 = (super.anInt4251 * local44 + local464 * super.anInt4256 + super.anInt4254 * local29 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local68) {
						return;
					}
				} else {
					local68 = super.anInt4255;
					local70 = super.anInt4255;
					local72 = super.anInt4255;
					local73 = super.anInt4255;
				}
				local212 = super.anInt4253 + (super.anInt4250 * local29 + local59 * super.anInt4248 + local39 * super.anInt4252 >> 14);
				local243 = super.anInt4258 + (local59 * super.anInt4257 + local29 * super.anInt4247 + super.anInt4249 * local39 >> 14);
				local223 = local212 * super.aClass9_Sub1_6.anInt1817 / local73 + arg4.anInt8841;
				local254 = local243 * super.aClass9_Sub1_6.anInt1827 / local73 + arg4.anInt8843;
				local272 = super.anInt4253 + (super.anInt4250 * local34 + super.anInt4248 * local80 + local39 * super.anInt4252 >> 14);
				local301 = arg4.anInt8841 + super.aClass9_Sub1_6.anInt1817 * local272 / local72;
				local290 = super.anInt4258 + (local80 * super.anInt4257 + local34 * super.anInt4247 + super.anInt4249 * local39 >> 14);
				local318 = (super.anInt4248 * local194 + super.anInt4250 * local34 + local44 * super.anInt4252 >> 14) + super.anInt4253;
				local329 = super.aClass9_Sub1_6.anInt1827 * local290 / local72 + arg4.anInt8843;
				local340 = local318 * super.aClass9_Sub1_6.anInt1817 / local70 + arg4.anInt8841;
				local358 = super.anInt4258 + (super.anInt4247 * local34 + super.anInt4257 * local194 + super.anInt4249 * local44 >> 14);
				local387 = (local29 * super.anInt4250 + super.anInt4248 * local464 + local44 * super.anInt4252 >> 14) + super.anInt4253;
				local370 = local358 * super.aClass9_Sub1_6.anInt1827 / local70 + arg4.anInt8843;
				local415 = local387 * super.aClass9_Sub1_6.anInt1817 / local68 + arg4.anInt8841;
				local404 = (local464 * super.anInt4257 + super.anInt4247 * local29 + super.anInt4249 * local44 >> 14) + super.anInt4258;
				local426 = super.aClass9_Sub1_6.anInt1827 * local404 / local68 + arg4.anInt8843;
			} else {
				local59 = super.anIntArrayArray30[arg0][arg2];
				if (super.anInt4255 == -1) {
					local80 = local59 * super.anInt4256;
					local73 = (super.anInt4251 * local39 + super.anInt4254 * local29 + local80 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local73) {
						return;
					}
					local72 = super.anInt4246 + (super.anInt4254 * local34 + local80 + local39 * super.anInt4251 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local72) {
						return;
					}
					local70 = (local80 + local34 * super.anInt4254 + super.anInt4251 * local44 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local70) {
						return;
					}
					local68 = (local44 * super.anInt4251 + super.anInt4254 * local29 + local80 >> 14) + super.anInt4246;
					if (local68 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
				} else {
					local68 = super.anInt4255;
					local70 = super.anInt4255;
					local72 = super.anInt4255;
					local73 = super.anInt4255;
				}
				local80 = local59 * super.anInt4248;
				local194 = local59 * super.anInt4257;
				local212 = (local80 + super.anInt4250 * local29 + super.anInt4252 * local39 >> 14) + super.anInt4253;
				local223 = arg4.anInt8841 + super.aClass9_Sub1_6.anInt1817 * local212 / local73;
				local243 = super.anInt4258 + (local29 * super.anInt4247 + local194 + super.anInt4249 * local39 >> 14);
				local254 = super.aClass9_Sub1_6.anInt1827 * local243 / local73 + arg4.anInt8843;
				local272 = super.anInt4253 + (local34 * super.anInt4250 + local80 + super.anInt4252 * local39 >> 14);
				local290 = super.anInt4258 + (local194 + local34 * super.anInt4247 + super.anInt4249 * local39 >> 14);
				local301 = super.aClass9_Sub1_6.anInt1817 * local272 / local72 + arg4.anInt8841;
				local318 = (super.anInt4250 * local34 + local80 + super.anInt4252 * local44 >> 14) + super.anInt4253;
				local329 = local290 * super.aClass9_Sub1_6.anInt1827 / local72 + arg4.anInt8843;
				local340 = super.aClass9_Sub1_6.anInt1817 * local318 / local70 + arg4.anInt8841;
				local358 = super.anInt4258 + (super.anInt4249 * local44 + local34 * super.anInt4247 + local194 >> 14);
				local370 = arg4.anInt8843 + super.aClass9_Sub1_6.anInt1827 * local358 / local70;
				local387 = (super.anInt4250 * local29 + local80 + local44 * super.anInt4252 >> 14) + super.anInt4253;
				local404 = (local44 * super.anInt4249 + local194 + local29 * super.anInt4247 >> 14) + super.anInt4258;
				local415 = super.aClass9_Sub1_6.anInt1817 * local387 / local68 + arg4.anInt8841;
				local426 = arg4.anInt8843 + local404 * super.aClass9_Sub1_6.anInt1827 / local68;
			}
			if (-((local370 - local426) * (-local415 + local301)) + (local340 - local415) * (-local426 + local329) > 0) {
				arg4.aBoolean666 = local340 < 0 || local415 < 0 || local301 < 0 || arg4.anInt8846 < local340 || local415 > arg4.anInt8846 || arg4.anInt8846 < local301;
				if (local16.aShort110 >= 0) {
					if (this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local16.aShort110).aByte104)) {
						arg4.anInt8842 = 100;
					}
					arg4.method7422(local370, local426, local329, local340, local415, local301, local70, local68, local72, local16.aShort109 & 0xFFFF, local16.aShort111 & 0xFFFF, local16.aShort108 & 0xFFFF, local212, local272, local387, local243, local290, local404, local73, local72, local68, local16.aShort110);
					arg4.anInt8842 = 0;
				} else {
					arg4.method7419(local370, local426, local329, local340, local415, local301, local70, local68, local72, local16.aShort109 & 0xFFFF, local16.aShort111 & 0xFFFF, local16.aShort108 & 0xFFFF);
				}
			}
			if ((local426 - local329) * (-local301 + local223) - (local254 - local329) * (local415 + -local301) > 0) {
				arg4.aBoolean666 = local223 < 0 || local301 < 0 || local415 < 0 || local223 > arg4.anInt8846 || arg4.anInt8846 < local301 || arg4.anInt8846 < local415;
				if (local16.aShort110 >= 0) {
					if (this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local16.aShort110).aByte104)) {
						arg4.anInt8842 = 100;
					}
					arg4.method7422(local254, local329, local426, local223, local301, local415, local73, local72, local68, local16.aShort112 & 0xFFFF, local16.aShort108 & 0xFFFF, local16.aShort111 & 0xFFFF, local212, local272, local387, local243, local290, local404, local73, local72, local68, local16.aShort110);
					arg4.anInt8842 = 0;
					return;
				}
				arg4.method7419(local254, local329, local426, local223, local301, local415, local73, local72, local68, local16.aShort112 & 0xFFFF, local16.aShort108 & 0xFFFF, local16.aShort111 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!tn;I[IIIZII[[ZI[II)V")
	private void method3566(@OriginalArg(0) Class303 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) boolean[][] arg5, @OriginalArg(10) int[] arg6, @OriginalArg(11) int arg7) {
		@Pc(13) int local13 = (arg7 - arg2) * 1024 / 256;
		@Pc(22) boolean local22 = ((Class9_Sub1_Sub1) super.aClass9_Sub1_6).aBoolean16;
		super.aClass9_Sub1_6.method5455(false);
		arg0.aBoolean668 = false;
		arg0.aBoolean670 = false;
		@Pc(34) int local34 = 0;
		@Pc(38) int local38 = local13;
		for (@Pc(40) int local40 = arg4; local40 < arg3; local40++) {
			for (@Pc(44) int local44 = arg2; local44 < arg7; local44++) {
				if (arg5[local40 - arg4][local44 - arg2]) {
					@Pc(157) int local157;
					if (super.aClass279ArrayArray3[local40][local44] != null) {
						@Pc(72) Class279 local72 = super.aClass279ArrayArray3[local40][local44];
						if (local72.aShort110 != -1 && (local72.aByte99 & 0x2) == 0 && local72.anInt8433 == -1) {
							local157 = super.aClass9_Sub1_6.method1644(local72.aShort110);
							arg0.method7419(local38 - 4, local38 + -4, local38, local34 + 4, local34, local34 + 4, 100, 100, 100, Static499.method7465(local157, local72.aShort109 & 0xFFFF), Static499.method7465(local157, local72.aShort111 & 0xFFFF), Static499.method7465(local157, local72.aShort108 & 0xFFFF));
							arg0.method7419(local38, local38, local38 - 4, local34, local34 + 4, local34, 100, 100, 100, Static499.method7465(local157, local72.aShort112 & 0xFFFF), Static499.method7465(local157, local72.aShort108 & 0xFFFF), Static499.method7465(local157, local72.aShort111 & 0xFFFF));
						} else if (local72.anInt8433 == -1) {
							arg0.method7419(local38 - 4, local38 + -4, local38, local34 + 4, local34, local34 + 4, 100, 100, 100, local72.aShort109 & 0xFFFF, local72.aShort111 & 0xFFFF, local72.aShort108 & 0xFFFF);
							arg0.method7419(local38, local38, local38 - 4, local34, local34 + 4, local34, 100, 100, 100, local72.aShort112 & 0xFFFF, local72.aShort108 & 0xFFFF, local72.aShort111 & 0xFFFF);
						} else {
							local157 = local72.anInt8433;
							arg0.method7419(local38 - 4, local38 + -4, local38, local34 + 4, local34, local34 + 4, 100, 100, 100, local157, local157, local157);
							arg0.method7419(local38, local38, local38 - 4, local34, local34 + 4, local34, 100, 100, 100, local157, local157, local157);
						}
					} else if (super.aClass282ArrayArray3[local40][local44] != null) {
						@Pc(305) Class282 local305 = super.aClass282ArrayArray3[local40][local44];
						for (local157 = 0; local157 < local305.aShort120; local157++) {
							arg1[local157] = local34 + local305.aShortArray145[local157] * 4 / super.anInt9884;
							arg6[local157] = local38 - local305.aShortArray148[local157] * 4 / super.anInt9884;
						}
						for (@Pc(346) int local346 = 0; local346 < local305.aShort121; local346++) {
							@Pc(353) short local353 = local305.aShortArray140[local346];
							@Pc(358) short local358 = local305.aShortArray143[local346];
							@Pc(363) short local363 = local305.aShortArray144[local346];
							@Pc(367) int local367 = arg1[local353];
							@Pc(371) int local371 = arg1[local358];
							@Pc(375) int local375 = arg1[local363];
							@Pc(379) int local379 = arg6[local353];
							@Pc(383) int local383 = arg6[local358];
							@Pc(387) int local387 = arg6[local363];
							@Pc(401) int local401;
							if (local305.anIntArray702 != null && local305.anIntArray702[local346] != -1) {
								local401 = local305.anIntArray702[local346];
								arg0.method7419(local379, local383, local387, local367, local371, local375, 100, 100, 100, Static499.method7465(local401, local305.aShortArray142[local353]), Static499.method7465(local401, local305.aShortArray142[local358]), Static499.method7465(local401, local305.aShortArray142[local363]));
							} else if (local305.aShortArray147 == null || local305.aShortArray147[local346] == -1) {
								local401 = local305.anIntArray703[local346];
								arg0.method7419(local379, local383, local387, local367, local371, local375, 100, 100, 100, Static499.method7465(local401, local305.aShortArray142[local353]), Static499.method7465(local401, local305.aShortArray142[local358]), Static499.method7465(local401, local305.aShortArray142[local363]));
							} else {
								local401 = super.aClass9_Sub1_6.method1644(local305.aShortArray147[local346]);
								arg0.method7419(local379, local383, local387, local367, local371, local375, 100, 100, 100, Static499.method7465(local401, local305.aShortArray142[local353]), Static499.method7465(local401, local305.aShortArray142[local358]), Static499.method7465(local401, local305.aShortArray142[local363]));
							}
						}
					}
				}
				local38 -= 4;
			}
			local38 = local13;
			local34 += 4;
		}
		arg0.aBoolean670 = true;
		super.aClass9_Sub1_6.method5455(local22);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([IIZLclient!tn;IIIII[II[[Z)V")
	private void method3568(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class303 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int[] arg5, @OriginalArg(10) int arg6, @OriginalArg(11) boolean[][] arg7) {
		@Pc(14) int local14 = (arg1 - arg6) * 1024 / 256;
		@Pc(23) boolean local23 = ((Class9_Sub1_Sub1) super.aClass9_Sub1_6).aBoolean16;
		super.aClass9_Sub1_6.method5455(false);
		arg2.aBoolean670 = false;
		arg2.aBoolean668 = false;
		@Pc(35) int local35 = 0;
		@Pc(39) int local39 = local14;
		for (@Pc(41) int local41 = arg4; local41 < arg3; local41++) {
			for (@Pc(45) int local45 = arg6; local45 < arg1; local45++) {
				if (arg7[local41 - arg4][local45 - arg6]) {
					@Pc(147) int local147;
					if (super.aClass53ArrayArray3[local41][local45] != null) {
						@Pc(73) Class53 local73 = super.aClass53ArrayArray3[local41][local45];
						if (local73.aShort15 != -1 && (local73.aByte23 & 0x2) == 0 && local73.anInt1511 == 0) {
							local147 = super.aClass9_Sub1_6.method1644(local73.aShort15);
							arg2.method7419(local39 - 4, local39 + -4, local39, local35 + 4, local35, local35 + 4, 100, 100, 100, Static499.method7465(local147, local73.anInt1509), Static499.method7465(local147, local73.anInt1508), Static499.method7465(local147, local73.anInt1507));
							arg2.method7419(local39, local39, local39 - 4, local35, local35 + 4, local35, 100, 100, 100, Static499.method7465(local147, local73.anInt1510), Static499.method7465(local147, local73.anInt1507), Static499.method7465(local147, local73.anInt1508));
						} else if (local73.anInt1511 == 0) {
							arg2.method7404(local39 - 4, local39 + -4, local39, local35 + 4, local35, local35 + 4, 100, 100, 100, local73.anInt1509, local73.anInt1508, local73.anInt1507);
							arg2.method7404(local39, local39, local39 - 4, local35, local35 + 4, local35, 100, 100, 100, local73.anInt1510, local73.anInt1507, local73.anInt1508);
						} else {
							local147 = local73.anInt1511;
							arg2.method7404(local39 - 4, local39 + -4, local39, local35 + 4, local35, local35 + 4, 100, 100, 100, Static571.method8046(local147, local73.anInt1509 & 0xFF000000), Static571.method8046(local147, local73.anInt1508 & 0xFF000000), Static571.method8046(local147, local73.anInt1507 & 0xFF000000));
							arg2.method7404(local39, local39, local39 - 4, local35, local35 + 4, local35, 100, 100, 100, Static571.method8046(local147, local73.anInt1510 & 0xFF000000), Static571.method8046(local147, local73.anInt1507 & 0xFF000000), Static571.method8046(local147, local73.anInt1508 & 0xFF000000));
						}
					} else if (super.aClass239ArrayArray3[local41][local45] != null) {
						@Pc(319) Class239 local319 = super.aClass239ArrayArray3[local41][local45];
						for (local147 = 0; local147 < local319.aShort70; local147++) {
							arg0[local147] = local35 + local319.aShortArray82[local147] * 4 / super.anInt9884;
							arg5[local147] = local39 - local319.aShortArray81[local147] * 4 / super.anInt9884;
						}
						for (@Pc(363) int local363 = 0; local363 < local319.aShort69; local363++) {
							@Pc(369) int local369 = local363 * 3;
							@Pc(373) int local373 = local369 + 1;
							@Pc(377) int local377 = local373 + 1;
							@Pc(381) int local381 = arg0[local369];
							@Pc(385) int local385 = arg0[local373];
							@Pc(389) int local389 = arg0[local377];
							@Pc(393) int local393 = arg5[local369];
							@Pc(397) int local397 = arg5[local373];
							@Pc(401) int local401 = arg5[local377];
							@Pc(430) int local430;
							if (local319.anIntArray499 != null && local319.anIntArray499[local363] != 0 && (local319.aShortArray79 == null || local319.aShortArray79 != null && local319.aShortArray79[local363] == -1)) {
								local430 = local319.anIntArray499[local363];
								arg2.method7404(local393, local397, local401, local381, local385, local389, 100, 100, 100, Static571.method8046(local430, -(local319.anIntArray500[local369] & 0xFF000000) - 16777216), Static571.method8046(local430, -(local319.anIntArray500[local373] & 0xFF000000) - 16777216), Static571.method8046(local430, -(local319.anIntArray500[local377] & 0xFF000000) - 16777216));
							} else if (local319.aShortArray79 == null || local319.aShortArray79[local363] == -1) {
								arg2.method7404(local393, local397, local401, local381, local385, local389, 100, 100, 100, local319.anIntArray500[local369], local319.anIntArray500[local373], local319.anIntArray500[local377]);
							} else {
								local430 = super.aClass9_Sub1_6.method1644(local319.aShortArray79[local363]);
								arg2.method7419(local393, local397, local401, local381, local385, local389, 100, 100, 100, local430, local430, local430);
							}
						}
					}
				}
				local39 -= 4;
			}
			local39 = local14;
			local35 += 4;
		}
		arg2.aBoolean670 = true;
		super.aClass9_Sub1_6.method5455(local23);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "([I[I[IILclient!tn;IZ[II)V")
	private void method3569(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class303 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int[] arg7) {
		@Pc(12) Class53 local12 = super.aClass53ArrayArray3[arg3][arg5];
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(329) int local329;
		@Pc(369) int local369;
		@Pc(449) int local449;
		@Pc(490) int local490;
		@Pc(358) int local358;
		@Pc(418) int local418;
		@Pc(479) int local479;
		@Pc(520) int local520;
		@Pc(299) int local299;
		@Pc(347) int local347;
		@Pc(406) int local406;
		@Pc(467) int local467;
		@Pc(317) int local317;
		@Pc(387) int local387;
		@Pc(437) int local437;
		@Pc(509) int local509;
		@Pc(93) int local93;
		@Pc(123) int local123;
		@Pc(146) int local146;
		@Pc(174) int local174;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(199) int local199;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(280) int local280;
		@Pc(558) int local558;
		@Pc(715) int local715;
		if (local12 == null) {
			@Pc(1627) Class239 local1627 = super.aClass239ArrayArray3[arg3][arg5];
			if (local1627 != null) {
				if (super.anInt4255 == -1) {
					for (local490 = 0; local490 < local1627.aShort70; local490++) {
						local33 = local1627.aShortArray82[local490] + (arg3 << super.anInt9883);
						local38 = local1627.aShortArray77[local490];
						local44 = local1627.aShortArray81[local490] + (arg5 << super.anInt9883);
						local449 = (local44 * super.anInt4251 + local38 * super.anInt4256 + local33 * super.anInt4254 >> 14) + super.anInt4246;
						if (local449 <= super.aClass9_Sub1_6.anInt1811) {
							return;
						}
						arg0[local490] = 0;
						if (arg6) {
							local358 = local449 - super.aClass9_Sub1_6.anInt1807;
							if (local358 > 255) {
								local358 = 255;
							}
							if (local358 > 0) {
								arg0[local490] = local358;
								local418 = local358 * local1627.aShortArray80[local490] / 255;
								if (local418 > 0) {
									local38 -= local418;
								}
							}
						} else if (super.aClass9_Sub1_6.aBoolean185) {
							local358 = local449 - super.aClass9_Sub1_6.anInt1807;
							if (local358 > 0) {
								arg0[local490] = local358;
								if (arg0[local490] > 255) {
									arg0[local490] = 255;
								}
							}
						}
						local329 = (super.anInt4252 * local44 + super.anInt4250 * local33 + local38 * super.anInt4248 >> 14) + super.anInt4253;
						local369 = super.anInt4258 + (super.anInt4249 * local44 + local33 * super.anInt4247 + super.anInt4257 * local38 >> 14);
						arg7[local490] = arg4.anInt8841 + super.aClass9_Sub1_6.anInt1817 * local329 / local449;
						arg2[local490] = arg4.anInt8843 + local369 * super.aClass9_Sub1_6.anInt1827 / local449;
						arg1[local490] = local449;
					}
				} else {
					for (local490 = 0; local490 < local1627.aShort70; local490++) {
						local33 = local1627.aShortArray82[local490] + (arg3 << super.anInt9883);
						local38 = local1627.aShortArray77[local490];
						local44 = local1627.aShortArray81[local490] + (arg5 << super.anInt9883);
						arg0[local490] = 0;
						if (arg6) {
							local358 = -super.aClass9_Sub1_6.anInt1807 + super.anInt4255;
							if (local358 > 255) {
								local358 = 255;
							}
							if (local358 > 0) {
								arg0[local490] = local358;
								local418 = local1627.aShortArray80[local490] * local358 / 255;
								if (local418 > 0) {
									local38 -= local418;
								}
							}
						} else if (super.aClass9_Sub1_6.aBoolean185) {
							local358 = super.anInt4255 - super.aClass9_Sub1_6.anInt1807;
							if (local358 > 0) {
								arg0[local490] = local358;
								if (arg0[local490] > 255) {
									arg0[local490] = 255;
								}
							}
						}
						local369 = (super.anInt4249 * local44 + local38 * super.anInt4257 + local33 * super.anInt4247 >> 14) + super.anInt4258;
						local329 = super.anInt4253 + (local44 * super.anInt4252 + super.anInt4248 * local38 + super.anInt4250 * local33 >> 14);
						arg7[local490] = super.aClass9_Sub1_6.anInt1817 * local329 / super.anInt4255 + arg4.anInt8841;
						arg2[local490] = arg4.anInt8843 + local369 * super.aClass9_Sub1_6.anInt1827 / super.anInt4255;
						arg1[local490] = super.anInt4255;
					}
				}
				if (local1627.aShortArray79 == null) {
					for (local490 = 0; local490 < local1627.aShort69; local490++) {
						local358 = local490 * 3;
						local418 = local358 + 1;
						local479 = local418 + 1;
						local520 = arg7[local358];
						local299 = arg7[local418];
						local347 = arg7[local479];
						local406 = arg2[local358];
						local467 = arg2[local418];
						local317 = arg2[local479];
						local387 = arg0[local418] + arg0[local358] + arg0[local479];
						if (-((local347 - local299) * (local406 + -local467)) + (local520 - local299) * (-local467 + local317) > 0) {
							arg4.aBoolean666 = local520 < 0 || local299 < 0 || local347 < 0 || local520 > arg4.anInt8846 || arg4.anInt8846 < local299 || arg4.anInt8846 < local347;
							if (local387 >= 765) {
								arg4.method7423(local406, local467, local317, local520, local299, local347, arg1[local358], arg1[local418], arg1[local479], super.aClass9_Sub1_6.anInt1822);
							} else if (local387 > 0) {
								if ((local1627.anIntArray500[local358] & 0xFFFFFF) != 0) {
									arg4.method7404(local406, local467, local317, local520, local299, local347, arg1[local358], arg1[local418], arg1[local479], Static167.method3388(arg0[local358], local1627.anIntArray500[local358], super.aClass9_Sub1_6.anInt1822), Static167.method3388(arg0[local418], local1627.anIntArray500[local418], super.aClass9_Sub1_6.anInt1822), Static167.method3388(arg0[local479], local1627.anIntArray500[local479], super.aClass9_Sub1_6.anInt1822));
								}
							} else if ((local1627.anIntArray500[local358] & 0xFFFFFF) != 0) {
								arg4.method7404(local406, local467, local317, local520, local299, local347, arg1[local358], arg1[local418], arg1[local479], local1627.anIntArray500[local358], local1627.anIntArray500[local418], local1627.anIntArray500[local479]);
							}
						}
					}
				} else {
					local490 = super.anIntArrayArray30[arg3][arg5];
					local358 = super.anIntArrayArray30[arg3 + 1][arg5];
					local418 = super.anIntArrayArray30[arg3][arg5 + 1];
					local479 = super.anInt9884 * arg3;
					local520 = super.anInt9884 + local479;
					local299 = super.anInt9884 * arg5;
					local347 = super.anInt9884 + local299;
					local406 = (super.anInt4252 * local299 + local490 * super.anInt4248 + super.anInt4250 * local479 >> 14) + super.anInt4253;
					local467 = super.anInt4258 + (local299 * super.anInt4249 + local479 * super.anInt4247 + super.anInt4257 * local490 >> 14);
					local317 = (super.anInt4251 * local299 + super.anInt4256 * local490 + super.anInt4254 * local479 >> 14) + super.anInt4246;
					local387 = (super.anInt4252 * local299 + super.anInt4250 * local520 + local358 * super.anInt4248 >> 14) + super.anInt4253;
					local437 = (super.anInt4257 * local358 + local520 * super.anInt4247 + local299 * super.anInt4249 >> 14) + super.anInt4258;
					local509 = (local299 * super.anInt4251 + local358 * super.anInt4256 + local520 * super.anInt4254 >> 14) + super.anInt4246;
					local93 = super.anInt4253 + (super.anInt4252 * local347 + local418 * super.anInt4248 + super.anInt4250 * local479 >> 14);
					local123 = (super.anInt4249 * local347 + local479 * super.anInt4247 + super.anInt4257 * local418 >> 14) + super.anInt4258;
					local146 = super.anInt4246 + (local347 * super.anInt4251 + super.anInt4254 * local479 + local418 * super.anInt4256 >> 14);
					for (local174 = 0; local174 < local1627.aShort69; local174++) {
						local46 = local174 * 3;
						local48 = local46 + 1;
						local50 = local48 + 1;
						local52 = arg7[local46];
						local199 = arg7[local48];
						local66 = arg7[local50];
						local75 = arg2[local46];
						local280 = arg2[local48];
						local558 = arg2[local50];
						local715 = arg0[local46] + arg0[local48] + arg0[local50];
						if ((local52 - local199) * (local558 + -local280) - (local66 - local199) * (-local280 + local75) > 0) {
							arg4.aBoolean666 = local52 < 0 || local199 < 0 || local66 < 0 || local52 > arg4.anInt8846 || local199 > arg4.anInt8846 || arg4.anInt8846 < local66;
							@Pc(2396) short local2396 = local1627.aShortArray79[local174];
							if (local715 < 765) {
								if (local2396 != -1 && this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local2396).aByte104)) {
									arg4.anInt8842 = 100;
								}
								if (local715 > 0) {
									if (local2396 != -1) {
										arg4.method7416(local75, local280, local558, local52, local199, local66, arg1[local46], arg1[local48], arg1[local50], super.aClass9_Sub1_6.anInt1822, arg0[local46], arg0[local48], arg0[local50], local1627.anIntArray500[local46], local1627.anIntArray500[local48], local1627.anIntArray500[local50], local406, local387, local93, local467, local437, local123, local317, local509, local146, local2396);
									} else if ((local1627.anIntArray500[local46] & 0xFFFFFF) != 0) {
										arg4.method7404(local75, local280, local558, local52, local199, local66, arg1[local46], arg1[local48], arg1[local50], Static571.method8046(local1627.anIntArray500[local46], arg0[local46] << 24 | super.aClass9_Sub1_6.anInt1822), Static571.method8046(local1627.anIntArray500[local48], super.aClass9_Sub1_6.anInt1822 | arg0[local48] << 24), Static571.method8046(local1627.anIntArray500[local50], super.aClass9_Sub1_6.anInt1822 | arg0[local50] << 24));
									}
								} else if (local2396 != -1) {
									arg4.method7422(local75, local280, local558, local52, local199, local66, arg1[local46], arg1[local48], arg1[local50], local1627.anIntArray500[local46], local1627.anIntArray500[local48], local1627.anIntArray500[local50], local406, local387, local93, local467, local437, local123, local317, local509, local146, local2396);
								} else if ((local1627.anIntArray500[local46] & 0xFFFFFF) != 0) {
									arg4.method7404(local75, local280, local558, local52, local199, local66, arg1[local46], arg1[local48], arg1[local50], local1627.anIntArray500[local46], local1627.anIntArray500[local48], local1627.anIntArray500[local50]);
								}
								arg4.anInt8842 = 0;
							} else {
								arg4.method7423(local75, local280, local558, local52, local199, local66, arg1[local46], arg1[local48], arg1[local50], super.aClass9_Sub1_6.anInt1822);
							}
						}
					}
				}
			}
		} else if ((local12.aByte23 & 0x2) == 0) {
			@Pc(28) int local28 = arg3 * super.anInt9884;
			local33 = super.anInt9884 + local28;
			local38 = super.anInt9884 * arg5;
			local44 = local38 + super.anInt9884;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			local52 = 0;
			if ((local12.aByte23 & 0x1) == 0 || arg6) {
				local66 = super.anIntArrayArray30[arg3][arg5];
				local75 = super.anIntArrayArray30[arg3 + 1][arg5];
				local280 = super.anIntArrayArray30[arg3 + 1][arg5 + 1];
				local558 = super.anIntArrayArray30[arg3][arg5 + 1];
				if (super.anInt4255 == -1) {
					local93 = super.anInt4246 + (local38 * super.anInt4251 + super.anInt4254 * local28 + local66 * super.anInt4256 >> 14);
					if (local93 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local123 = (super.anInt4256 * local75 + super.anInt4254 * local33 + local38 * super.anInt4251 >> 14) + super.anInt4246;
					if (super.aClass9_Sub1_6.anInt1811 >= local123) {
						return;
					}
					local146 = super.anInt4246 + (super.anInt4254 * local33 + super.anInt4256 * local280 + local44 * super.anInt4251 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local146) {
						return;
					}
					local174 = (super.anInt4256 * local558 + local28 * super.anInt4254 + local44 * super.anInt4251 >> 14) + super.anInt4246;
					if (local174 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
				} else {
					local174 = super.anInt4255;
					local146 = super.anInt4255;
					local123 = super.anInt4255;
					local93 = super.anInt4255;
				}
				if (arg6) {
					local199 = local93 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 > 0) {
						local46 = local199;
						local715 = local12.aShort14 * local199 / 255;
						if (local715 > 0) {
							local66 -= local715;
						}
					}
					local199 = local123 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 > 0) {
						local48 = local199;
						local715 = local12.aShort13 * local199 / 255;
						if (local715 > 0) {
							local75 -= local715;
						}
					}
					local199 = local146 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 > 0) {
						local50 = local199;
						local715 = local199 * local12.aShort17 / 255;
						if (local715 > 0) {
							local280 -= local715;
						}
					}
					local199 = local174 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 > 0) {
						local52 = local199;
						local715 = local199 * local12.aShort16 / 255;
						if (local715 > 0) {
							local558 -= local715;
						}
					}
				} else if (super.aClass9_Sub1_6.aBoolean185) {
					local199 = local93 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local46 = local199;
						if (local199 > 255) {
							local46 = 255;
						}
					}
					local199 = local123 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local48 = local199;
						if (local199 > 255) {
							local48 = 255;
						}
					}
					local199 = local146 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local50 = local199;
						if (local199 > 255) {
							local50 = 255;
						}
					}
					local199 = local174 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local52 = local199;
						if (local199 > 255) {
							local52 = 255;
						}
					}
				}
				local299 = (super.anInt4252 * local38 + super.anInt4248 * local66 + super.anInt4250 * local28 >> 14) + super.anInt4253;
				local329 = local299 * super.aClass9_Sub1_6.anInt1817 / local93 + arg4.anInt8841;
				local317 = (local28 * super.anInt4247 + local66 * super.anInt4257 + super.anInt4249 * local38 >> 14) + super.anInt4258;
				local358 = arg4.anInt8843 + local317 * super.aClass9_Sub1_6.anInt1827 / local93;
				local347 = super.anInt4253 + (super.anInt4252 * local38 + super.anInt4248 * local75 + local33 * super.anInt4250 >> 14);
				local387 = super.anInt4258 + (local38 * super.anInt4249 + local33 * super.anInt4247 + super.anInt4257 * local75 >> 14);
				local369 = local347 * super.aClass9_Sub1_6.anInt1817 / local123 + arg4.anInt8841;
				local406 = (super.anInt4252 * local44 + local33 * super.anInt4250 + local280 * super.anInt4248 >> 14) + super.anInt4253;
				local418 = arg4.anInt8843 + super.aClass9_Sub1_6.anInt1827 * local387 / local123;
				local437 = super.anInt4258 + (super.anInt4257 * local280 + super.anInt4247 * local33 + local44 * super.anInt4249 >> 14);
				local449 = arg4.anInt8841 + super.aClass9_Sub1_6.anInt1817 * local406 / local146;
				local467 = (super.anInt4248 * local558 + local28 * super.anInt4250 + local44 * super.anInt4252 >> 14) + super.anInt4253;
				local479 = super.aClass9_Sub1_6.anInt1827 * local437 / local146 + arg4.anInt8843;
				local490 = local467 * super.aClass9_Sub1_6.anInt1817 / local174 + arg4.anInt8841;
				local509 = (super.anInt4249 * local44 + local558 * super.anInt4257 + super.anInt4247 * local28 >> 14) + super.anInt4258;
				local520 = super.aClass9_Sub1_6.anInt1827 * local509 / local174 + arg4.anInt8843;
			} else {
				local66 = super.anIntArrayArray30[arg3][arg5];
				if (super.anInt4255 == -1) {
					local75 = local66 * super.anInt4256;
					local93 = super.anInt4246 + (super.anInt4251 * local38 + super.anInt4254 * local28 + local75 >> 14);
					if (local93 <= super.aClass9_Sub1_6.anInt1811) {
						return;
					}
					local123 = super.anInt4246 + (local33 * super.anInt4254 + local75 + local38 * super.anInt4251 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local123) {
						return;
					}
					local146 = super.anInt4246 + (local75 + local33 * super.anInt4254 + super.anInt4251 * local44 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local146) {
						return;
					}
					local174 = super.anInt4246 + (local44 * super.anInt4251 + super.anInt4254 * local28 + local75 >> 14);
					if (super.aClass9_Sub1_6.anInt1811 >= local174) {
						return;
					}
				} else {
					local174 = super.anInt4255;
					local146 = super.anInt4255;
					local123 = super.anInt4255;
					local93 = super.anInt4255;
				}
				if (super.aClass9_Sub1_6.aBoolean185) {
					local199 = local93 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local46 = local199;
						if (local199 > 255) {
							local46 = 255;
						}
					}
					local199 = local123 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local48 = local199;
						if (local199 > 255) {
							local48 = 255;
						}
					}
					local199 = local146 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local50 = local199;
						if (local199 > 255) {
							local50 = 255;
						}
					}
					local199 = local174 - super.aClass9_Sub1_6.anInt1807;
					if (local199 > 0) {
						local52 = local199;
						if (local199 > 255) {
							local52 = 255;
						}
					}
				}
				local75 = super.anInt4248 * local66;
				local280 = local66 * super.anInt4257;
				local299 = super.anInt4253 + (super.anInt4250 * local28 + local75 + super.anInt4252 * local38 >> 14);
				local317 = super.anInt4258 + (super.anInt4247 * local28 + local280 + local38 * super.anInt4249 >> 14);
				local329 = arg4.anInt8841 + local299 * super.aClass9_Sub1_6.anInt1817 / local93;
				local347 = (super.anInt4250 * local33 + local75 + local38 * super.anInt4252 >> 14) + super.anInt4253;
				local358 = arg4.anInt8843 + super.aClass9_Sub1_6.anInt1827 * local317 / local93;
				local369 = local347 * super.aClass9_Sub1_6.anInt1817 / local123 + arg4.anInt8841;
				local387 = super.anInt4258 + (local33 * super.anInt4247 + local280 + local38 * super.anInt4249 >> 14);
				local406 = super.anInt4253 + (super.anInt4250 * local33 + local75 + local44 * super.anInt4252 >> 14);
				local418 = arg4.anInt8843 + super.aClass9_Sub1_6.anInt1827 * local387 / local123;
				local437 = (super.anInt4247 * local33 + local280 + super.anInt4249 * local44 >> 14) + super.anInt4258;
				local449 = arg4.anInt8841 + super.aClass9_Sub1_6.anInt1817 * local406 / local146;
				local467 = (super.anInt4252 * local44 + super.anInt4250 * local28 + local75 >> 14) + super.anInt4253;
				local479 = arg4.anInt8843 + local437 * super.aClass9_Sub1_6.anInt1827 / local146;
				local490 = arg4.anInt8841 + super.aClass9_Sub1_6.anInt1817 * local467 / local174;
				local509 = (local28 * super.anInt4247 + local280 + local44 * super.anInt4249 >> 14) + super.anInt4258;
				local520 = arg4.anInt8843 + local509 * super.aClass9_Sub1_6.anInt1827 / local174;
			}
			@Pc(1173) boolean local1173 = local12.aShort15 != -1 && this.method3720(super.aClass9_Sub1_6.anInterface2_11.method3585(local12.aShort15).aByte104);
			local75 = local50 + local48 + local52;
			if ((local449 - local490) * (-local520 + local418) - (local479 - local520) * (-local490 + local369) > 0) {
				arg4.aBoolean666 = local449 < 0 || local490 < 0 || local369 < 0 || local449 > arg4.anInt8846 || local490 > arg4.anInt8846 || local369 > arg4.anInt8846;
				if (local75 < 765) {
					if (local1173) {
						arg4.anInt8842 = 100;
					}
					if (local75 <= 0) {
						if (local12.aShort15 < 0) {
							arg4.method7404(local479, local520, local418, local449, local490, local369, local146, local174, local123, local12.anInt1509, local12.anInt1508, local12.anInt1507);
						} else {
							arg4.method7422(local479, local520, local418, local449, local490, local369, local146, local174, local123, local12.anInt1509, local12.anInt1508, local12.anInt1507, local406, local467, local347, local437, local509, local387, local146, local174, local123, local12.aShort15);
						}
					} else if (local12.aShort15 >= 0) {
						arg4.method7416(local479, local520, local418, local449, local490, local369, local146, local174, local123, super.aClass9_Sub1_6.anInt1822, local50, local52, local48, local12.anInt1509, local12.anInt1508, local12.anInt1507, local406, local467, local347, local437, local509, local387, local146, local174, local123, local12.aShort15);
					} else {
						arg4.method7404(local479, local520, local418, local449, local490, local369, local146, local174, local123, Static571.method8046(local12.anInt1509, local50 << 24 | super.aClass9_Sub1_6.anInt1822), Static571.method8046(local12.anInt1508, local52 << 24 | super.aClass9_Sub1_6.anInt1822), Static571.method8046(local12.anInt1507, local48 << 24 | super.aClass9_Sub1_6.anInt1822));
					}
					arg4.anInt8842 = 0;
				} else {
					arg4.method7423(local479, local520, local418, local449, local490, local369, local146, local174, local123, super.aClass9_Sub1_6.anInt1822);
				}
			}
			local75 = local52 + local46 + local48;
			if (-((local490 - local369) * (local358 + -local418)) + (local520 - local418) * (local329 - local369) > 0) {
				arg4.aBoolean666 = local329 < 0 || local369 < 0 || local490 < 0 || local329 > arg4.anInt8846 || local369 > arg4.anInt8846 || local490 > arg4.anInt8846;
				if (local75 < 765) {
					if (local1173) {
						arg4.anInt8842 = 100;
					}
					if (local75 <= 0) {
						if (local12.aShort15 >= 0) {
							arg4.method7422(local358, local418, local520, local329, local369, local490, local93, local123, local174, local12.anInt1510, local12.anInt1507, local12.anInt1508, local299, local347, local467, local317, local387, local509, local93, local123, local174, local12.aShort15);
						} else {
							arg4.method7404(local358, local418, local520, local329, local369, local490, local93, local123, local174, local12.anInt1510, local12.anInt1507, local12.anInt1508);
						}
					} else if (local12.aShort15 < 0) {
						arg4.method7404(local358, local418, local520, local329, local369, local490, local93, local123, local174, Static571.method8046(local12.anInt1510, local46 << 24 | super.aClass9_Sub1_6.anInt1822), Static571.method8046(local12.anInt1507, super.aClass9_Sub1_6.anInt1822 | local48 << 24), Static571.method8046(local12.anInt1508, local52 << 24 | super.aClass9_Sub1_6.anInt1822));
					} else {
						arg4.method7416(local358, local418, local520, local329, local369, local490, local93, local123, local174, super.aClass9_Sub1_6.anInt1822, local46, local48, local52, local12.anInt1510, local12.anInt1507, local12.anInt1508, local299, local347, local467, local317, local387, local509, local93, local123, local174, local12.aShort15);
					}
					arg4.anInt8842 = 0;
					return;
				}
				arg4.method7423(local358, local418, local520, local329, local369, local490, local93, local123, local174, super.aClass9_Sub1_6.anInt1822);
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class179_Sub1 local9 = (Class179_Sub1) super.aClass9_Sub1_6.method1653(Thread.currentThread());
		@Pc(12) Class303 local12 = local9.aClass303_1;
		local12.aBoolean666 = false;
		local12.anInt8842 = 0;
		super.aClass9_Sub1_6.method5430();
		if (super.aClass53ArrayArray3 != null) {
			this.method3568(local9.anIntArray733, arg3, local12, arg2, arg0, local9.anIntArray738, arg1, arg4);
		} else if (super.aClass279ArrayArray3 != null) {
			this.method3566(local12, local9.anIntArray733, arg1, arg2, arg0, arg4, local9.anIntArray738, arg3);
			return;
		}
	}
}
