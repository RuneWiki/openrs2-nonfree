import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class160 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray138;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	private int anInt4959;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Z")
	public boolean aBoolean455;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	public int anInt4954 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIIIIILclient!ae;Lclient!kb;II)Lclient!bk;")
	public Class7 method4565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class4 arg4, @OriginalArg(7) Class107 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local26 = arg5.anIntArray280[arg1];
			local7 = 1056;
			local36 = local26 >>> 16;
			@Pc(40) Class2_Sub11_Sub1 local40 = Static99.method2234(local36);
			@Pc(44) int local44 = local26 & 0xFFFF;
			if (local40 != null) {
				local13 = local40.method1342(local44) | false;
				local11 = local40.method1346(local44) | false;
				local15 = arg5.aBoolean291 | false;
			}
			if ((arg5.aBoolean293 || Static70.aBoolean144) && arg0 != -1 && arg0 < arg5.anIntArray280.length) {
				@Pc(88) int local88 = arg5.anIntArray280[arg0];
				@Pc(92) int local92 = local88 >>> 16;
				@Pc(96) int local96 = local88 & 0xFFFF;
				@Pc(105) Class2_Sub11_Sub1 local105;
				if (local36 == local92) {
					local105 = local40;
				} else {
					local105 = Static99.method2234(local96 >>> 16);
				}
				if (local105 != null) {
					local13 |= local105.method1342(local96);
					local11 |= local105.method1346(local96);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(155) long local155 = (long) arg7 << 32 | (long) (arg2 << 16) | (long) arg6;
		@Pc(157) Class119 local157 = Static217.aClass119_128;
		@Pc(165) Class7 local165;
		synchronized (Static217.aClass119_128) {
			local165 = (Class7) Static217.aClass119_128.method3311(local155);
		}
		if (local165 == null || arg4.method4276(local165.method1435(), local7) != 0) {
			if (local165 != null) {
				local7 = arg4.method4256(local7, local165.method1435());
			}
			@Pc(195) Class192[] local195 = new Class192[3];
			@Pc(197) int local197 = 0;
			if (!Static214.method3803(arg6).method1359() || !Static214.method3803(arg2).method1359() || !Static214.method3803(arg7).method1359()) {
				return null;
			}
			@Pc(223) Class192 local223 = Static214.method3803(arg6).method1355();
			if (local223 != null) {
				local197++;
				local195[0] = local223;
			}
			local223 = Static214.method3803(arg2).method1355();
			if (local223 != null) {
				local195[local197++] = local223;
			}
			local223 = Static214.method3803(arg7).method1355();
			if (local223 != null) {
				local195[local197++] = local223;
			}
			local26 = local7 | 0x2000;
			local223 = new Class192(local195, local197);
			local165 = arg4.method4237(local223, local26, Static313.anInt6327, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray379[local36] < Static282.aShortArrayArray7[local36].length) {
					local165.method1417(Static262.aShortArray78[local36], Static282.aShortArrayArray7[local36][this.anIntArray379[local36]]);
				}
				if (Static276.aShortArrayArray6[local36].length > this.anIntArray379[local36]) {
					local165.method1417(Static96.aShortArray52[local36], Static276.aShortArrayArray6[local36][this.anIntArray379[local36]]);
				}
			}
			local165.method1412(local7);
			@Pc(335) Class119 local335 = Static217.aClass119_128;
			synchronized (Static217.aClass119_128) {
				Static217.aClass119_128.method3308(local165, local155);
			}
		}
		if (arg5 == null) {
			return local165;
		} else {
			local165 = local165.method1436((byte) 1, local7, true);
			return arg5.method3047(arg1, 1024, arg0, local165, arg3);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!kb;Lclient!ae;I[Lclient!jq;Lclient!kb;ZIIIIII)Lclient!bk;")
	public Class7 method4568(@OriginalArg(1) Class107 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class103[] arg3, @OriginalArg(5) Class107 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		if (this.anInt4954 != -1) {
			return Static83.method1900(this.anInt4954).method5209(arg7, arg9, arg2, arg8, arg0, arg1, arg5, arg10, arg4, arg3, arg6);
		}
		@Pc(32) int local32 = arg8;
		@Pc(35) long local35 = this.aLong151;
		@Pc(38) int[] local38 = this.anIntArray378;
		if (arg4 != null && (arg4.anInt3278 >= 0 || arg4.anInt3281 >= 0)) {
			local38 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local38[local54] = this.anIntArray378[local54];
			}
			if (arg4.anInt3278 >= 0) {
				if (arg4.anInt3278 == 65535) {
					local38[5] = 0;
					local35 ^= 0xFFFFFFFF00000000L;
				} else {
					local38[5] = arg4.anInt3278 | 0x40000000;
					local35 ^= (long) local38[5] << 32;
				}
			}
			if (arg4.anInt3281 >= 0) {
				if (arg4.anInt3281 == 65535) {
					local38[3] = 0;
					local35 ^= 0xFFFFFFFFL;
				} else {
					local38[3] = arg4.anInt3281 | 0x40000000;
					local35 ^= local38[3];
				}
			}
		}
		@Pc(133) boolean local133 = false;
		@Pc(135) boolean local135 = false;
		@Pc(143) boolean local143 = arg4 != null || arg0 != null;
		@Pc(150) int local150 = arg3 == null ? 0 : arg3.length;
		@Pc(185) int local185;
		@Pc(190) int local190;
		for (@Pc(152) int local152 = 0; local152 < local150; local152++) {
			Static337.aClass2_Sub11_Sub1Array4[local152] = null;
			if (arg3[local152] != null) {
				@Pc(171) Class107 local171 = Static212.method3773(arg3[local152].anInt3236);
				if (local171.anIntArray280 != null) {
					local143 = true;
					Static238.aClass107Array2[local152] = local171;
					local185 = arg3[local152].anInt3237;
					local190 = arg3[local152].anInt3239;
					@Pc(195) int local195 = local171.anIntArray280[local185];
					Static337.aClass2_Sub11_Sub1Array4[local152] = Static99.method2234(local195 >>> 16);
					@Pc(207) int local207 = local195 & 0xFFFF;
					Static227.anIntArray343[local152] = local207;
					if (Static337.aClass2_Sub11_Sub1Array4[local152] != null) {
						local135 |= Static337.aClass2_Sub11_Sub1Array4[local152].method1342(local207);
						local133 |= Static337.aClass2_Sub11_Sub1Array4[local152].method1346(local207);
					}
					if ((local171.aBoolean293 || Static70.aBoolean144) && local190 != -1 && local190 < local171.anIntArray280.length) {
						Static200.anIntArray470[local152] = local171.anIntArray279[local185];
						Static86.anIntArray196[local152] = arg3[local152].anInt3240;
						@Pc(284) int local284 = local171.anIntArray280[local190];
						Static327.aClass2_Sub11_Sub1Array3[local152] = Static99.method2234(local284 >>> 16);
						@Pc(296) int local296 = local284 & 0xFFFF;
						Static68.anIntArray151[local152] = local296;
						if (Static327.aClass2_Sub11_Sub1Array3[local152] != null) {
							local135 |= Static327.aClass2_Sub11_Sub1Array3[local152].method1342(local296);
							local133 |= Static327.aClass2_Sub11_Sub1Array3[local152].method1346(local296);
						}
					} else {
						Static200.anIntArray470[local152] = 0;
						Static86.anIntArray196[local152] = 0;
						Static327.aClass2_Sub11_Sub1Array3[local152] = null;
						Static68.anIntArray151[local152] = -1;
					}
				}
			}
		}
		@Pc(334) int local334 = -1;
		local185 = -1;
		local190 = 0;
		@Pc(340) Class2_Sub11_Sub1 local340 = null;
		@Pc(342) Class2_Sub11_Sub1 local342 = null;
		@Pc(344) int local344 = -1;
		@Pc(346) int local346 = -1;
		@Pc(348) int local348 = 0;
		@Pc(350) Class2_Sub11_Sub1 local350 = null;
		@Pc(352) Class2_Sub11_Sub1 local352 = null;
		if (local143) {
			local32 = arg8 | 0x20;
			@Pc(369) int local369;
			@Pc(420) int local420;
			if (arg4 != null) {
				local334 = arg4.anIntArray280[arg10];
				local369 = local334 >>> 16;
				local340 = Static99.method2234(local369);
				local334 &= 0xFFFF;
				if (local340 != null) {
					local135 |= local340.method1342(local334);
					local133 |= local340.method1346(local334);
				}
				if ((arg4.aBoolean293 || Static70.aBoolean144) && arg5 != -1 && arg5 < arg4.anIntArray280.length) {
					local190 = arg4.anIntArray279[arg10];
					local185 = arg4.anIntArray280[arg5];
					local420 = local185 >>> 16;
					local342 = local420 == local369 ? local340 : Static99.method2234(local420);
					local185 &= 0xFFFF;
					if (local342 != null) {
						local135 |= local342.method1342(local185);
						local133 |= local342.method1346(local185);
					}
				}
			}
			if (arg0 != null) {
				local344 = arg0.anIntArray280[arg6];
				local369 = local344 >>> 16;
				local350 = Static99.method2234(local369);
				local344 &= 0xFFFF;
				if (local350 != null) {
					local135 |= local350.method1342(local344);
					local133 |= local350.method1346(local344);
				}
				if ((arg0.aBoolean293 || Static70.aBoolean144) && arg9 != -1 && arg0.anIntArray280.length > arg9) {
					local346 = arg0.anIntArray280[arg9];
					local348 = arg0.anIntArray279[arg6];
					local420 = local346 >>> 16;
					local352 = local369 == local420 ? local350 : Static99.method2234(local420);
					local346 &= 0xFFFF;
					if (local352 != null) {
						local135 |= local352.method1342(local346);
						local133 |= local352.method1346(local346);
					}
				}
			}
			if (local135) {
				local32 |= 0x80;
			}
			if (local133) {
				local32 |= 0x100;
			}
		}
		@Pc(569) Class119 local569 = Static162.aClass119_99;
		@Pc(577) Class7 local577;
		synchronized (Static162.aClass119_99) {
			local577 = (Class7) Static162.aClass119_99.method3311(local35);
		}
		@Pc(585) Class180 local585 = null;
		if (this.anInt4959 != -1) {
			local585 = Static283.method5089(this.anInt4959);
		}
		@Pc(628) int local628;
		@Pc(634) int local634;
		if (local577 == null || arg1.method4276(local577.method1435(), local32) != 0 || local585 != null && local585.anIntArrayArray149 != null && this.anIntArrayArray138 == null) {
			if (local577 != null) {
				local32 = arg1.method4256(local32, local577.method1435());
			}
			@Pc(626) boolean local626 = false;
			local628 = 0;
			while (true) {
				if (local628 >= 12) {
					if (local626) {
						if (this.aLong150 != -1L) {
							@Pc(686) Class119 local686 = Static162.aClass119_99;
							synchronized (Static162.aClass119_99) {
								local577 = (Class7) Static162.aClass119_99.method3311(this.aLong150);
							}
						}
						if (local577 == null || arg1.method4276(local577.method1435(), local32) != 0 || local585 != null && local585.anIntArrayArray149 != null && this.anIntArrayArray138 == null) {
							return null;
						}
					} else {
						@Pc(725) Class192[] local725 = new Class192[12];
						@Pc(733) int local733;
						for (@Pc(727) int local727 = 0; local727 < 12; local727++) {
							local733 = local38[local727];
							@Pc(752) Class192 local752;
							if ((local733 & 0x40000000) != 0) {
								local752 = Static282.method5080(local733 & 0x3FFFFFFF).method5866(this.aBoolean455);
								if (local752 != null) {
									local725[local727] = local752;
								}
							} else if ((local733 & Integer.MIN_VALUE) != 0) {
								local752 = Static214.method3803(local733 & 0x3FFFFFFF).method1357();
								if (local752 != null) {
									local725[local727] = local752;
								}
							}
						}
						@Pc(809) int local809;
						if (local585 != null && local585.anIntArrayArray149 != null) {
							for (local733 = 0; local733 < local585.anIntArrayArray149.length; local733++) {
								if (local585.anIntArrayArray149[local733] != null && local725[local733] != null) {
									local809 = local585.anIntArrayArray149[local733][0];
									@Pc(816) int local816 = local585.anIntArrayArray149[local733][1];
									@Pc(823) int local823 = local585.anIntArrayArray149[local733][2];
									@Pc(832) int local832 = local585.anIntArrayArray149[local733][3] << 3;
									@Pc(841) int local841 = local585.anIntArrayArray149[local733][4] << 3;
									@Pc(850) int local850 = local585.anIntArrayArray149[local733][5] << 3;
									if (this.anIntArrayArray138 == null) {
										this.anIntArrayArray138 = new int[local585.anIntArrayArray149.length][];
									}
									if (this.anIntArrayArray138[local733] == null) {
										@Pc(872) int[] local872 = this.anIntArrayArray138[local733] = new int[15];
										if (local832 == 0 && local841 == 0 && local850 == 0) {
											local872[0] = local872[4] = local872[8] = 32768;
											local872[14] = -local823;
											local872[12] = -local809;
											local872[13] = -local816;
										} else {
											@Pc(888) int local888 = Class24.anIntArray36[local832];
											@Pc(892) int local892 = Class24.anIntArray35[local832];
											@Pc(896) int local896 = Class24.anIntArray36[local841];
											@Pc(900) int local900 = Class24.anIntArray35[local841];
											@Pc(904) int local904 = Class24.anIntArray36[local850];
											@Pc(908) int local908 = Class24.anIntArray35[local850];
											@Pc(916) int local916 = local904 * local892 + 16384 >> 15;
											@Pc(924) int local924 = local908 * local892 + 16384 >> 15;
											local872[3] = local888 * local908 + 16384 >> 15;
											local872[2] = local900 * local888 + 16384 >> 15;
											local872[8] = local896 * local888 + 16384 >> 15;
											local872[1] = -local908 * local896 + local916 * local900 + 16384 >> 15;
											local872[7] = local916 * local896 + -local900 * -local908 + 16384 >> 15;
											local872[5] = -local892;
											local872[0] = local900 * local924 + local904 * local896 + 16384 >> 15;
											local872[6] = local924 * local896 + -local900 * local904 + 16384 >> 15;
											local872[4] = local888 * local904 + 16384 >> 15;
											local872[12] = local872[0] * -local809 + -local816 * local872[3] + -local823 * local872[6] + 16384 >> 15;
											local872[14] = -local823 * local872[8] + -local809 * local872[2] + -local816 * local872[5] + 16384 >> 15;
											local872[13] = -local823 * local872[7] + local872[4] * -local816 + local872[1] * -local809 + 16384 >> 15;
										}
										local872[9] = local809;
										local872[11] = local823;
										local872[10] = local816;
									}
									if (local832 != 0 || local841 != 0 || local850 != 0) {
										local725[local733].method5465(local832, local850, local841);
									}
									if (local809 != 0 || local816 != 0 || local823 != 0) {
										local725[local733].method5471(local823, local816, local809);
									}
								}
							}
						}
						@Pc(1198) int local1198 = local32 | 0x2000;
						@Pc(1205) Class192 local1205 = new Class192(local725, local725.length);
						local577 = arg1.method4237(local1205, local1198, Static313.anInt6327, 64, 850);
						for (local809 = 0; local809 < 5; local809++) {
							if (Static282.aShortArrayArray7[local809].length > this.anIntArray379[local809]) {
								local577.method1417(Static262.aShortArray78[local809], Static282.aShortArrayArray7[local809][this.anIntArray379[local809]]);
							}
							if (Static276.aShortArrayArray6[local809].length > this.anIntArray379[local809]) {
								local577.method1417(Static96.aShortArray52[local809], Static276.aShortArrayArray6[local809][this.anIntArray379[local809]]);
							}
						}
						local577.method1412(local32);
						@Pc(1278) Class119 local1278 = Static162.aClass119_99;
						synchronized (Static162.aClass119_99) {
							Static162.aClass119_99.method3308(local577, local35);
						}
						this.aLong150 = local35;
					}
					break;
				}
				local634 = local38[local628];
				if ((local634 & 0x40000000) == 0) {
					if ((local634 & Integer.MIN_VALUE) != 0 && !Static214.method3803(local634 & 0x3FFFFFFF).method1354()) {
						local626 = true;
					}
				} else if (!Static282.method5080(local634 & 0x3FFFFFFF).method5868(this.aBoolean455)) {
					local626 = true;
				}
				local628++;
			}
		}
		@Pc(1300) Class7 local1300 = local577.method1436((byte) 1, local32, true);
		if (!local143) {
			return local1300;
		}
		@Pc(1306) int local1306 = 0;
		local628 = 1;
		while (local1306 < local150) {
			if (Static337.aClass2_Sub11_Sub1Array4[local1306] != null) {
				local1300.method1422(Static86.anIntArray196[local1306] - 1, local628, false, this.anIntArrayArray138 == null ? null : this.anIntArrayArray138[local1306], Static227.anIntArray343[local1306], Static337.aClass2_Sub11_Sub1Array4[local1306], Static327.aClass2_Sub11_Sub1Array3[local1306], Static68.anIntArray151[local1306], Static200.anIntArray470[local1306]);
			}
			local628 <<= 0x1;
			local1306++;
		}
		if (local340 != null && local350 != null) {
			local1300.method1416(local340, arg2 - 1, arg7 - 1, local352, local334, local346, local185, false, local342, arg4.aBooleanArray15, local190, local350, local348, local344);
		} else if (local340 != null) {
			local1300.method1409(local340, false, local342, arg2 - 1, 0, local185, local334, local190);
		} else if (local350 != null) {
			local1300.method1409(local350, false, local352, arg7 - 1, 0, local346, local344, local348);
		}
		for (local634 = 0; local634 < local150; local634++) {
			Static337.aClass2_Sub11_Sub1Array4[local634] = null;
			Static327.aClass2_Sub11_Sub1Array3[local634] = null;
			Static238.aClass107Array2[local634] = null;
		}
		return local1300;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)V")
	public void method4570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray379[arg0] = arg1;
		this.method4577();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([IBII[IZ)V")
	public void method4571(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (arg1 != this.anInt4959) {
			this.anIntArrayArray138 = null;
			this.anInt4959 = arg1;
		}
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static123.anInt2653; local26++) {
					@Pc(32) Class45 local32 = Static214.method3803(local26);
					if (local32 != null && !local32.aBoolean118 && (arg4 ? Static202.anIntArray315[local22] : Static317.anIntArray469[local22]) == local32.anInt1293) {
						arg0[Static112.anIntArray225[local22]] = local26 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt4954 = arg2;
		this.aBoolean455 = arg4;
		this.anIntArray379 = arg3;
		this.anIntArray378 = arg0;
		this.method4577();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)V")
	public void method4572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static112.anIntArray225[arg0];
		if (this.anIntArray378[local7] != 0 && Static214.method3803(arg1) != null) {
			this.anIntArray378[local7] = arg1 | Integer.MIN_VALUE;
			this.method4577();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZ)V")
	public void method4574(@OriginalArg(1) boolean arg0) {
		this.aBoolean455 = arg0;
		this.method4577();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!kb;ILclient!ae;IB)Lclient!bk;")
	public Class7 method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) int arg4) {
		if (this.anInt4954 != -1) {
			return Static83.method1900(this.anInt4954).method5204(arg0, arg2, arg3, arg1, arg4);
		}
		@Pc(25) int local25 = 1024;
		@Pc(33) boolean local33;
		@Pc(44) int local44;
		@Pc(106) int local106;
		@Pc(54) int local54;
		@Pc(110) int local110;
		if (arg2 != null) {
			@Pc(29) boolean local29 = false;
			@Pc(31) boolean local31 = false;
			local33 = false;
			local44 = arg2.anIntArray280[arg4];
			local25 = 1056;
			local54 = local44 >>> 16;
			@Pc(58) Class2_Sub11_Sub1 local58 = Static99.method2234(local54);
			@Pc(62) int local62 = local44 & 0xFFFF;
			if (local58 != null) {
				local31 = local58.method1342(local62) | false;
				local29 = local58.method1346(local62) | false;
				local33 = arg2.aBoolean291 | false;
			}
			if ((arg2.aBoolean293 || Static70.aBoolean144) && arg0 != -1 && arg2.anIntArray280.length > arg0) {
				local106 = arg2.anIntArray280[arg0];
				local110 = local106 >>> 16;
				@Pc(119) Class2_Sub11_Sub1 local119 = local54 == local110 ? local58 : Static99.method2234(local110);
				@Pc(123) int local123 = local106 & 0xFFFF;
				if (local119 != null) {
					local31 |= local119.method1342(local123);
					local29 |= local119.method1346(local123);
				}
			}
			if (local31) {
				local25 = 1184;
			}
			if (local29) {
				local25 |= 0x100;
			}
			if (local33) {
				local25 |= 0x200;
			}
		}
		@Pc(159) Class119 local159 = Static217.aClass119_128;
		@Pc(168) Class7 local168;
		synchronized (Static217.aClass119_128) {
			local168 = (Class7) Static217.aClass119_128.method3311(this.aLong151);
		}
		if (local168 == null || arg3.method4276(local168.method1435(), local25) != 0) {
			if (local168 != null) {
				local25 = arg3.method4256(local25, local168.method1435());
			}
			local33 = false;
			for (local44 = 0; local44 < 12; local44++) {
				local106 = this.anIntArray378[local44];
				if ((local106 & 0x40000000) == 0) {
					if ((local106 & Integer.MIN_VALUE) != 0 && !Static214.method3803(local106 & 0x3FFFFFFF).method1359()) {
						local33 = true;
					}
				} else if (!Static282.method5080(local106 & 0x3FFFFFFF).method5861(this.aBoolean455)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(257) Class192[] local257 = new Class192[12];
			@Pc(259) int local259 = 0;
			for (@Pc(261) int local261 = 0; local261 < 12; local261++) {
				local54 = this.anIntArray378[local261];
				@Pc(284) Class192 local284;
				if ((local54 & 0x40000000) != 0) {
					local284 = Static282.method5080(local54 & 0x3FFFFFFF).method5860(this.aBoolean455);
					if (local284 != null) {
						local257[local259++] = local284;
					}
				} else if ((Integer.MIN_VALUE & local54) != 0) {
					local284 = Static214.method3803(local54 & 0x3FFFFFFF).method1355();
					if (local284 != null) {
						local257[local259++] = local284;
					}
				}
			}
			@Pc(320) Class192 local320 = new Class192(local257, local259);
			@Pc(324) int local324 = local25 | 0x2000;
			local168 = arg3.method4237(local320, local324, Static313.anInt6327, 64, 768);
			for (local110 = 0; local110 < 5; local110++) {
				if (this.anIntArray379[local110] < Static282.aShortArrayArray7[local110].length) {
					local168.method1417(Static262.aShortArray78[local110], Static282.aShortArrayArray7[local110][this.anIntArray379[local110]]);
				}
				if (Static276.aShortArrayArray6[local110].length > this.anIntArray379[local110]) {
					local168.method1417(Static96.aShortArray52[local110], Static276.aShortArrayArray6[local110][this.anIntArray379[local110]]);
				}
			}
			local168.method1412(local25);
			@Pc(393) Class119 local393 = Static217.aClass119_128;
			synchronized (Static217.aClass119_128) {
				Static217.aClass119_128.method3308(local168, this.aLong151);
			}
		}
		if (arg2 == null) {
			return local168;
		} else {
			local168.method1436((byte) 1, local25, true);
			return arg2.method3047(arg4, 1024, arg0, local168, arg1);
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	private void method4577() {
		this.aLong151 = -1L;
		@Pc(23) long[] local23 = Class2_Sub2_Sub34.aLongArray7;
		this.aLong151 = this.aLong151 >>> 8 ^ local23[(int) ((this.aLong151 ^ (long) (this.anInt4959 >> 8)) & 0xFFL)];
		this.aLong151 = local23[(int) ((this.aLong151 ^ (long) this.anInt4959) & 0xFFL)] ^ this.aLong151 >>> 8;
		for (@Pc(63) int local63 = 0; local63 < 12; local63++) {
			this.aLong151 = local23[(int) ((this.aLong151 ^ (long) (this.anIntArray378[local63] >> 24)) & 0xFFL)] ^ this.aLong151 >>> 8;
			this.aLong151 = local23[(int) (((long) (this.anIntArray378[local63] >> 16) ^ this.aLong151) & 0xFFL)] ^ this.aLong151 >>> 8;
			this.aLong151 = local23[(int) (((long) (this.anIntArray378[local63] >> 8) ^ this.aLong151) & 0xFFL)] ^ this.aLong151 >>> 8;
			this.aLong151 = local23[(int) ((this.aLong151 ^ (long) this.anIntArray378[local63]) & 0xFFL)] ^ this.aLong151 >>> 8;
		}
		for (@Pc(159) int local159 = 0; local159 < 5; local159++) {
			this.aLong151 = this.aLong151 >>> 8 ^ local23[(int) (((long) this.anIntArray379[local159] ^ this.aLong151) & 0xFFL)];
		}
		this.aLong151 = local23[(int) ((this.aLong151 ^ (long) (this.aBoolean455 ? 1 : 0)) & 0xFFL)] ^ this.aLong151 >>> 8;
	}
}
