import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class376 {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	private int anInt10592;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "Z")
	public boolean aBoolean733;

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "[Lclient!eg;")
	private Class99[] aClass99Array1;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "[I")
	private int[] anIntArray572;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "J")
	private long aLong292;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "J")
	private long aLong293;

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	public int anInt10600 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILclient!ffa;)V")
	public void method8675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class114 arg2) {
		@Pc(7) int local7 = Static67.anIntArray75[arg0];
		if (arg2.method2607(arg1) != null) {
			this.anIntArray572[local7] = Integer.MIN_VALUE | arg1;
			this.method8677();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	private void method8677() {
		this.aLong292 = -1L;
		@Pc(10) long[] local10 = Class3_Sub5_Sub21.aLongArray23;
		this.aLong292 = local10[(int) ((this.aLong292 ^ (long) (this.anInt10592 >> 8)) & 0xFFL)] ^ this.aLong292 >>> 8;
		this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) ((this.aLong292 ^ (long) this.anInt10592) & 0xFFL)];
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray572.length; local58++) {
			this.aLong292 = local10[(int) ((this.aLong292 ^ (long) (this.anIntArray572[local58] >> 24)) & 0xFFL)] ^ this.aLong292 >>> 8;
			this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) ((this.aLong292 ^ (long) (this.anIntArray572[local58] >> 16)) & 0xFFL)];
			this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) (((long) (this.anIntArray572[local58] >> 8) ^ this.aLong292) & 0xFFL)];
			this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) ((this.aLong292 ^ (long) this.anIntArray572[local58]) & 0xFFL)];
		}
		@Pc(161) int local161;
		if (this.aClass99Array1 != null) {
			for (local161 = 0; local161 < this.aClass99Array1.length; local161++) {
				if (this.aClass99Array1[local161] != null) {
					@Pc(177) int[] local177;
					@Pc(183) int[] local183;
					if (this.aBoolean733) {
						local177 = this.aClass99Array1[local161].anIntArray142;
						local183 = this.aClass99Array1[local161].anIntArray140;
					} else {
						local177 = this.aClass99Array1[local161].anIntArray139;
						local183 = this.aClass99Array1[local161].anIntArray141;
					}
					@Pc(201) int local201;
					if (local177 != null) {
						for (local201 = 0; local201 < local177.length; local201++) {
							this.aLong292 = local10[(int) ((this.aLong292 ^ (long) (local177[local201] >> 8)) & 0xFFL)] ^ this.aLong292 >>> 8;
							this.aLong292 = local10[(int) (((long) local177[local201] ^ this.aLong292) & 0xFFL)] ^ this.aLong292 >>> 8;
						}
					}
					if (local183 != null) {
						for (local201 = 0; local201 < local183.length; local201++) {
							this.aLong292 = local10[(int) ((this.aLong292 ^ (long) (local183[local201] >> 8)) & 0xFFL)] ^ this.aLong292 >>> 8;
							this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) ((this.aLong292 ^ (long) local183[local201]) & 0xFFL)];
						}
					}
					if (this.aClass99Array1[local161].aShortArray29 != null) {
						for (local201 = 0; local201 < this.aClass99Array1[local161].aShortArray29.length; local201++) {
							this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) ((this.aLong292 ^ (long) (this.aClass99Array1[local161].aShortArray29[local201] >> 8)) & 0xFFL)];
							this.aLong292 = local10[(int) ((this.aLong292 ^ (long) this.aClass99Array1[local161].aShortArray29[local201]) & 0xFFL)] ^ this.aLong292 >>> 8;
						}
					}
					if (this.aClass99Array1[local161].aShortArray30 != null) {
						for (local201 = 0; local201 < this.aClass99Array1[local161].aShortArray30.length; local201++) {
							this.aLong292 = local10[(int) ((this.aLong292 ^ (long) (this.aClass99Array1[local161].aShortArray30[local201] >> 8)) & 0xFFL)] ^ this.aLong292 >>> 8;
							this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) (((long) this.aClass99Array1[local161].aShortArray30[local201] ^ this.aLong292) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local161 = 0; local161 < 5; local161++) {
			this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) ((this.aLong292 ^ (long) this.anIntArray573[local161]) & 0xFFL)];
		}
		this.aLong292 = this.aLong292 >>> 8 ^ local10[(int) ((this.aLong292 ^ (long) (this.aBoolean733 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!mba;Lclient!mu;Lclient!mu;IIILclient!kka;Lclient!kia;IIILclient!es;Lclient!ll;[Lclient!id;[ILclient!ffa;IZLclient!ha;I)Lclient!ka;")
	public Class149 method8678(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class197 arg7, @OriginalArg(8) Class196 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Interface6 arg12, @OriginalArg(13) Class213 arg13, @OriginalArg(14) Class158[] arg14, @OriginalArg(15) int[] arg15, @OriginalArg(16) Class114 arg16, @OriginalArg(17) int arg17, @OriginalArg(19) Class95 arg18) {
		if (this.anInt10600 != -1) {
			return arg8.method4478(this.anInt10600).method5775(arg1, arg11, arg10, arg6, arg9, arg18, arg3, arg17, (Class269) null, arg15, arg0, arg12, arg14, arg5, arg4, arg13, arg2);
		}
		@Pc(38) int local38 = arg17;
		@Pc(41) long local41 = this.aLong292;
		@Pc(44) int[] local44 = this.anIntArray572;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		if (arg2 != null && (arg2.anInt6405 >= 0 || arg2.anInt6419 >= 0)) {
			local44 = new int[this.anIntArray572.length];
			for (@Pc(66) int local66 = 0; local66 < local44.length; local66++) {
				local44[local66] = this.anIntArray572[local66];
			}
			if (arg2.anInt6405 >= 0) {
				if (arg2.anInt6405 == 65535) {
					local44[5] = 0;
					local46 = true;
					local41 ^= 0xFFFFFFFF00000000L;
				} else {
					local44[5] = arg2.anInt6405 | 0x40000000;
					local41 ^= (long) local44[5] << 32;
				}
			}
			if (arg2.anInt6419 >= 0) {
				if (arg2.anInt6419 == 65535) {
					local41 ^= 0xFFFFFFFFL;
					local44[3] = 0;
				} else {
					local44[3] = arg2.anInt6419 | 0x40000000;
					local41 ^= (long) local44[3];
				}
				local48 = true;
			}
		}
		@Pc(161) boolean local161 = false;
		@Pc(163) boolean local163 = false;
		@Pc(165) boolean local165 = false;
		@Pc(173) boolean local173 = arg2 != null || arg3 != null;
		@Pc(180) int local180 = arg14 == null ? 0 : arg14.length;
		@Pc(214) int local214;
		@Pc(219) int local219;
		for (@Pc(182) int local182 = 0; local182 < local180; local182++) {
			Static339.aClass3_Sub5_Sub3Array8[local182] = null;
			if (arg14[local182] != null) {
				@Pc(200) Class239 local200 = arg13.method5008(arg14[local182].anInt4334);
				if (local200.anIntArray339 != null) {
					Class216.lb[local182] = local200;
					local173 = true;
					local214 = arg14[local182].anInt4332;
					local219 = arg14[local182].anInt4331;
					@Pc(224) int local224 = local200.anIntArray339[local214];
					Static339.aClass3_Sub5_Sub3Array8[local182] = arg13.method5001(local224 >>> 16);
					@Pc(237) int local237 = local224 & 0xFFFF;
					Static203.anIntArray187[local182] = local237;
					if (Static339.aClass3_Sub5_Sub3Array8[local182] != null) {
						local163 |= Static339.aClass3_Sub5_Sub3Array8[local182].method769(local237);
						local161 |= Static339.aClass3_Sub5_Sub3Array8[local182].method773(local237);
						local165 |= Static339.aClass3_Sub5_Sub3Array8[local182].method770(local237);
					}
					if ((local200.aBoolean446 || Static378.aBoolean643) && local219 != -1 && local219 < local200.anIntArray339.length) {
						Static421.anIntArray370[local182] = local200.anIntArray337[local214];
						Static203.anIntArray188[local182] = arg14[local182].anInt4335;
						@Pc(323) int local323 = local200.anIntArray339[local219];
						Static214.aClass3_Sub5_Sub3Array12[local182] = arg13.method5001(local323 >>> 16);
						@Pc(336) int local336 = local323 & 0xFFFF;
						Static619.anIntArray543[local182] = local336;
						if (Static214.aClass3_Sub5_Sub3Array12[local182] != null) {
							local163 |= Static214.aClass3_Sub5_Sub3Array12[local182].method769(local336);
							local161 |= Static214.aClass3_Sub5_Sub3Array12[local182].method773(local336);
							local165 |= Static214.aClass3_Sub5_Sub3Array12[local182].method770(local336);
						}
					} else {
						Static421.anIntArray370[local182] = 0;
						Static203.anIntArray188[local182] = 0;
						Static214.aClass3_Sub5_Sub3Array12[local182] = null;
						Static619.anIntArray543[local182] = -1;
					}
				}
			}
		}
		@Pc(381) int local381 = -1;
		local214 = -1;
		local219 = 0;
		@Pc(387) Class3_Sub5_Sub3 local387 = null;
		@Pc(389) Class3_Sub5_Sub3 local389 = null;
		@Pc(391) int local391 = -1;
		@Pc(393) int local393 = -1;
		@Pc(395) int local395 = 0;
		@Pc(397) Class3_Sub5_Sub3 local397 = null;
		@Pc(399) Class3_Sub5_Sub3 local399 = null;
		if (local173) {
			@Pc(412) int local412;
			@Pc(478) int local478;
			if (arg2 != null) {
				local381 = arg2.anIntArray339[arg11];
				local412 = local381 >>> 16;
				local387 = arg13.method5001(local412);
				local381 &= 0xFFFF;
				if (local387 != null) {
					local163 |= local387.method769(local381);
					local161 |= local387.method773(local381);
					local165 |= local387.method770(local381);
				}
				if ((arg2.aBoolean446 || Static378.aBoolean643) && arg5 != -1 && arg5 < arg2.anIntArray339.length) {
					local214 = arg2.anIntArray339[arg5];
					local219 = arg2.anIntArray337[arg11];
					local478 = local214 >>> 16;
					local389 = local412 == local478 ? local387 : arg13.method5001(local478);
					local214 &= 0xFFFF;
					if (local389 != null) {
						local163 |= local389.method769(local214);
						local161 |= local389.method773(local214);
						local165 |= local389.method770(local214);
					}
				}
			}
			local38 = arg17 | 0x20;
			if (arg3 != null) {
				local391 = arg3.anIntArray339[arg6];
				local412 = local391 >>> 16;
				local391 &= 0xFFFF;
				local397 = arg13.method5001(local412);
				if (local397 != null) {
					local163 |= local397.method769(local391);
					local161 |= local397.method773(local391);
					local165 |= local397.method770(local391);
				}
				if ((arg3.aBoolean446 || Static378.aBoolean643) && arg0 != -1 && arg0 < arg3.anIntArray339.length) {
					local395 = arg3.anIntArray337[arg6];
					local393 = arg3.anIntArray339[arg0];
					local478 = local393 >>> 16;
					local393 &= 0xFFFF;
					local399 = local412 == local478 ? local397 : arg13.method5001(local478);
					if (local399 != null) {
						local163 |= local399.method769(local393);
						local161 |= local399.method773(local393);
						local165 |= local399.method770(local393);
					}
				}
			}
			if (local163) {
				local38 |= 0x80;
			}
			if (local161) {
				local38 |= 0x100;
			}
			if (local165) {
				local38 |= 0x400;
			}
		}
		@Pc(654) Class295 local654 = Static324.aClass295_30;
		@Pc(662) Class149 local662;
		synchronized (Static324.aClass295_30) {
			local662 = (Class149) Static324.aClass295_30.method6470(local41);
		}
		@Pc(670) Class286 local670 = null;
		if (this.anInt10592 != -1) {
			local670 = arg1.method5169(this.anInt10592);
		}
		@Pc(704) boolean local704;
		@Pc(706) int local706;
		@Pc(712) int local712;
		@Pc(835) int local835;
		@Pc(841) int local841;
		@Pc(943) int local943;
		if (local662 == null || arg18.method8047(local662.ua(), local38) != 0) {
			if (local662 != null) {
				local38 = arg18.method8012(local38, local662.ua());
			}
			local704 = false;
			local706 = 0;
			while (true) {
				if (local706 >= local44.length) {
					if (local704) {
						if (this.aLong293 != -1L) {
							@Pc(801) Class295 local801 = Static324.aClass295_30;
							synchronized (Static324.aClass295_30) {
								local662 = (Class149) Static324.aClass295_30.method6470(this.aLong293);
							}
						}
						if (local662 == null || arg18.method8047(local662.ua(), local38) != 0) {
							return null;
						}
					} else {
						@Pc(833) Class134[] local833 = new Class134[local44.length];
						for (local835 = 0; local835 < local44.length; local835++) {
							local841 = local44[local835];
							@Pc(843) Class99 local843 = null;
							@Pc(859) boolean local859 = local835 == 5 && local46 || local835 == 3 && local48;
							@Pc(882) Class134 local882;
							if ((local841 & 0x40000000) != 0) {
								if (!local859 && this.aClass99Array1 != null && this.aClass99Array1[local835] != null) {
									local843 = this.aClass99Array1[local835];
								}
								local882 = arg7.method4518(local841 & 0x3FFFFFFF).method459(this.aBoolean733, local843);
								if (local882 != null) {
									local833[local835] = local882;
								}
							} else if ((local841 & Integer.MIN_VALUE) != 0) {
								local882 = arg16.method2607(local841 & 0x3FFFFFFF).method1154();
								if (local882 != null) {
									local833[local835] = local882;
								}
							}
						}
						@Pc(945) int local945;
						if (local670 != null && local670.anIntArrayArray43 != null) {
							for (local841 = 0; local841 < local670.anIntArrayArray43.length; local841++) {
								if (local833[local841] != null) {
									local943 = 0;
									local945 = 0;
									@Pc(947) int local947 = 0;
									@Pc(949) int local949 = 0;
									@Pc(951) int local951 = 0;
									@Pc(953) int local953 = 0;
									if (local670.anIntArrayArray43[local841] != null) {
										local951 = local670.anIntArrayArray43[local841][4] << 3;
										local943 = local670.anIntArrayArray43[local841][0];
										local949 = local670.anIntArrayArray43[local841][3] << 3;
										local945 = local670.anIntArrayArray43[local841][1];
										local953 = local670.anIntArrayArray43[local841][5] << 3;
										local947 = local670.anIntArrayArray43[local841][2];
									}
									if (local949 != 0 || local951 != 0 || local953 != 0) {
										local833[local841].method3055(local953, local951, local949);
									}
									if (local943 != 0 || local945 != 0 || local947 != 0) {
										local833[local841].method3058(local947, local945, local943);
									}
								}
							}
						}
						@Pc(1066) Class134 local1066 = new Class134(local833, local833.length);
						@Pc(1070) int local1070 = local38 | 0x4000;
						local662 = arg18.method8021(local1066, local1070, Static222.anInt3839, 64, 850);
						for (local943 = 0; local943 < 5; local943++) {
							for (local945 = 0; local945 < Static332.aShortArrayArrayArray2.length; local945++) {
								if (this.anIntArray573[local943] < Static332.aShortArrayArrayArray2[local945][local943].length) {
									local662.ia(Static661.aShortArrayArray18[local945][local943], Static332.aShortArrayArrayArray2[local945][local943][this.anIntArray573[local943]]);
								}
							}
						}
						local662.s(local38);
						@Pc(1134) Class295 local1134 = Static324.aClass295_30;
						synchronized (Static324.aClass295_30) {
							Static324.aClass295_30.method6469(local41, local662);
						}
						this.aLong293 = local41;
					}
					break;
				}
				local712 = local44[local706];
				@Pc(714) Class99 local714 = null;
				@Pc(732) boolean local732 = local706 == 5 && local46 || local706 == 3 && local48;
				if ((local712 & 0x40000000) != 0) {
					if (!local732 && this.aClass99Array1 != null && this.aClass99Array1[local706] != null) {
						local714 = this.aClass99Array1[local706];
					}
					if (!arg7.method4518(local712 & 0x3FFFFFFF).method464(this.aBoolean733, local714)) {
						local704 = true;
					}
				} else if ((local712 & Integer.MIN_VALUE) != 0 && !arg16.method2607(local712 & 0x3FFFFFFF).method1157()) {
					local704 = true;
				}
				local706++;
			}
		}
		@Pc(1156) Class149 local1156 = local662.method8858((byte) 4, local38, true);
		local704 = false;
		if (arg15 != null) {
			for (local706 = 0; local706 < arg15.length; local706++) {
				if (arg15[local706] != -1) {
					local704 = true;
				}
			}
		}
		if (!local173 && !local704) {
			return local1156;
		}
		@Pc(1185) Class17[] local1185 = null;
		if (local670 != null) {
			local1185 = local670.method6293(arg18);
		}
		if (local704 && local1185 != null) {
			for (local712 = 0; local712 < arg15.length; local712++) {
				if (local1185[local712] != null) {
					local1156.method8852(local1185[local712], 0x1 << local712, true);
				}
			}
		}
		local712 = 0;
		local835 = 1;
		while (local180 > local712) {
			if (Static339.aClass3_Sub5_Sub3Array8[local712] != null) {
				local1156.method8865(Static203.anIntArray188[local712] - 1, Static203.anIntArray187[local712], local835, Static421.anIntArray370[local712], Static339.aClass3_Sub5_Sub3Array8[local712], (int[]) null, Static214.aClass3_Sub5_Sub3Array12[local712], false, Static619.anIntArray543[local712]);
			}
			local712++;
			local835 <<= 0x1;
		}
		if (local704) {
			for (local841 = 0; local841 < arg15.length; local841++) {
				if (arg15[local841] != -1) {
					local943 = arg15[local841] - arg4;
					local943 &= 0x3FFF;
					@Pc(1295) Class17 local1295 = arg18.method8063();
					local1295.method6227(local943);
					local1156.method8852(local1295, 0x1 << local841, false);
				}
			}
		}
		if (local704 && local1185 != null) {
			for (local841 = 0; local841 < arg15.length; local841++) {
				if (local1185[local841] != null) {
					local1156.method8852(local1185[local841], 0x1 << local841, false);
				}
			}
		}
		if (local387 != null && local397 != null) {
			local1156.method8860(local391, local393, local395, local214, local387, arg10 - 1, local389, arg2.aBooleanArray23, local219, local381, local397, local399, false, arg9 - 1);
		} else if (local387 != null) {
			local1156.method8856(0, local381, local219, local214, local389, false, arg10 - 1, local387);
		} else if (local397 != null) {
			local1156.method8856(0, local391, local395, local393, local399, false, arg9 - 1, local397);
		}
		for (local841 = 0; local841 < local180; local841++) {
			Static339.aClass3_Sub5_Sub3Array8[local841] = null;
			Static214.aClass3_Sub5_Sub3Array12[local841] = null;
			Class216.lb[local841] = null;
		}
		return local1156;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIB[I[I[Lclient!eg;I)V")
	public void method8680(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class99[] arg4, @OriginalArg(6) int arg5) {
		this.anIntArray573 = arg3;
		this.anIntArray572 = arg2;
		this.anInt10600 = arg1;
		this.aBoolean733 = arg0;
		if (arg5 != this.anInt10592) {
			this.anInt10592 = arg5;
		}
		this.aClass99Array1 = arg4;
		this.method8677();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILclient!ha;Lclient!ll;Lclient!mu;IILclient!ffa;ZII)Lclient!ka;")
	public Class149 method8681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class213 arg4, @OriginalArg(5) Class239 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class114 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(98) int local98;
		@Pc(38) int local38;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg5.anIntArray339[arg2];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class3_Sub5_Sub3 local47 = arg4.method5001(local38);
			if (local47 != null) {
				local13 = local47.method769(local42) | false;
				local11 = local47.method773(local42) | false;
				local17 = local47.method770(local42) | false;
				local15 = arg5.aBoolean447 | false;
			}
			if ((arg5.aBoolean446 || Static378.aBoolean643) && arg6 != -1 && arg6 < arg5.anIntArray339.length) {
				local98 = arg5.anIntArray339[arg6];
				@Pc(102) int local102 = local98 >>> 16;
				@Pc(106) int local106 = local98 & 0xFFFF;
				@Pc(120) Class3_Sub5_Sub3 local120;
				if (local102 == local38) {
					local120 = local47;
				} else {
					local120 = arg4.method5001(local106 >>> 16);
				}
				if (local120 != null) {
					local13 |= local120.method769(local106);
					local11 |= local120.method773(local106);
					local17 |= local120.method770(local106);
				}
			}
			if (local13) {
				local7 = 2208;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
			if (local17) {
				local7 |= 0x400;
			}
		}
		@Pc(188) long local188 = (long) arg9 << 32 | (long) (arg1 << 16) | (long) arg7;
		@Pc(190) Class295 local190 = Static641.aClass295_68;
		@Pc(198) Class149 local198;
		synchronized (Static641.aClass295_68) {
			local198 = (Class149) Static641.aClass295_68.method6470(local188);
		}
		if (local198 == null || arg3.method8047(local198.ua(), local7) != 0) {
			if (local198 != null) {
				local7 = arg3.method8012(local7, local198.ua());
			}
			@Pc(225) Class134[] local225 = new Class134[3];
			local98 = 0;
			if (!arg8.method2607(arg7).method1160() || !arg8.method2607(arg1).method1160() || !arg8.method2607(arg9).method1160()) {
				return null;
			}
			@Pc(255) Class134 local255 = arg8.method2607(arg7).method1155();
			if (local255 != null) {
				local98++;
				local225[0] = local255;
			}
			local255 = arg8.method2607(arg1).method1155();
			if (local255 != null) {
				local225[local98++] = local255;
			}
			local255 = arg8.method2607(arg9).method1155();
			if (local255 != null) {
				local225[local98++] = local255;
			}
			local255 = new Class134(local225, local98);
			@Pc(300) int local300 = local7 | 0x4000;
			local198 = arg3.method8021(local255, local300, Static222.anInt3839, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				for (local38 = 0; local38 < Static332.aShortArrayArrayArray2.length; local38++) {
					if (this.anIntArray573[local310] < Static332.aShortArrayArrayArray2[local38][local310].length) {
						local198.ia(Static661.aShortArrayArray18[local38][local310], Static332.aShortArrayArrayArray2[local38][local310][this.anIntArray573[local310]]);
					}
				}
			}
			local198.s(local7);
			@Pc(364) Class295 local364 = Static641.aClass295_68;
			synchronized (Static641.aClass295_68) {
				Static641.aClass295_68.method6469(local188, local198);
			}
		}
		if (arg5 == null) {
			return local198;
		} else {
			local198 = local198.method8858((byte) 4, local7, true);
			return arg5.method5382(2048, arg0, arg2, arg6, local198);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V")
	public void method8682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray573[arg1] = arg0;
		this.method8677();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V")
	public void method8683(@OriginalArg(0) boolean arg0) {
		this.aBoolean733 = arg0;
		this.method8677();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!kka;I)V")
	public void method8684(@OriginalArg(1) int arg0, @OriginalArg(2) Class197 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == -1) {
			this.anIntArray572[arg2] = 0;
		} else if (arg1.method4518(arg0) != null) {
			this.anIntArray572[arg2] = arg0 | 0x40000000;
			this.method8677();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!kia;ILclient!es;Lclient!ffa;ILclient!kka;Lclient!ha;Lclient!mu;ILclient!ll;I)Lclient!ka;")
	public Class149 method8685(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(3) Interface6 arg2, @OriginalArg(4) Class114 arg3, @OriginalArg(6) Class197 arg4, @OriginalArg(7) Class95 arg5, @OriginalArg(8) Class239 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class213 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt10600 != -1) {
			return arg1.method4478(this.anInt10600).method5766((Class269) null, arg8, arg6, arg0, arg2, arg9, arg5, arg7);
		}
		@Pc(35) int local35 = 2048;
		@Pc(43) boolean local43;
		@Pc(62) int local62;
		@Pc(121) int local121;
		@Pc(66) int local66;
		@Pc(125) int local125;
		if (arg6 != null) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			local43 = false;
			@Pc(45) boolean local45 = false;
			local35 = 2080;
			local62 = arg6.anIntArray339[arg7];
			local66 = local62 >>> 16;
			@Pc(70) int local70 = local62 & 0xFFFF;
			@Pc(75) Class3_Sub5_Sub3 local75 = arg8.method5001(local66);
			if (local75 != null) {
				local41 = local75.method769(local70) | false;
				local39 = local75.method773(local70) | false;
				local45 = local75.method770(local70) | false;
				local43 = arg6.aBoolean447 | false;
			}
			if ((arg6.aBoolean446 || Static378.aBoolean643) && arg9 != -1 && arg6.anIntArray339.length > arg9) {
				local121 = arg6.anIntArray339[arg9];
				local125 = local121 >>> 16;
				@Pc(129) int local129 = local121 & 0xFFFF;
				@Pc(139) Class3_Sub5_Sub3 local139 = local125 == local66 ? local75 : arg8.method5001(local125);
				if (local139 != null) {
					local41 |= local139.method769(local129);
					local39 |= local139.method773(local129);
					local45 |= local139.method770(local129);
				}
			}
			if (local41) {
				local35 = 2208;
			}
			if (local39) {
				local35 |= 0x100;
			}
			if (local43) {
				local35 |= 0x200;
			}
			if (local45) {
				local35 |= 0x400;
			}
		}
		@Pc(190) Class295 local190 = Static641.aClass295_68;
		@Pc(199) Class149 local199;
		synchronized (Static641.aClass295_68) {
			local199 = (Class149) Static641.aClass295_68.method6470(this.aLong292);
		}
		if (local199 == null || arg5.method8047(local199.ua(), local35) != 0) {
			if (local199 != null) {
				local35 = arg5.method8012(local35, local199.ua());
			}
			local43 = false;
			for (@Pc(227) int local227 = 0; local227 < this.anIntArray572.length; local227++) {
				local62 = this.anIntArray572[local227];
				@Pc(236) Class99 local236 = null;
				if ((local62 & 0x40000000) != 0) {
					if (this.aClass99Array1 != null && this.aClass99Array1[local227] != null) {
						local236 = this.aClass99Array1[local227];
					}
					if (!arg4.method4518(local62 & 0x3FFFFFFF).method468(this.aBoolean733, local236)) {
						local43 = true;
					}
				} else if ((Integer.MIN_VALUE & local62) != 0 && !arg3.method2607(local62 & 0x3FFFFFFF).method1160()) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(303) Class134[] local303 = new Class134[this.anIntArray572.length];
			local121 = 0;
			for (@Pc(307) int local307 = 0; local307 < this.anIntArray572.length; local307++) {
				@Pc(314) int local314 = this.anIntArray572[local307];
				@Pc(316) Class99 local316 = null;
				@Pc(350) Class134 local350;
				if ((local314 & 0x40000000) != 0) {
					if (this.aClass99Array1 != null && this.aClass99Array1[local307] != null) {
						local316 = this.aClass99Array1[local307];
					}
					local350 = arg4.method4518(local314 & 0x3FFFFFFF).method465(this.aBoolean733, local316);
					if (local350 != null) {
						local303[local121++] = local350;
					}
				} else if ((Integer.MIN_VALUE & local314) != 0) {
					local350 = arg3.method2607(local314 & 0x3FFFFFFF).method1155();
					if (local350 != null) {
						local303[local121++] = local350;
					}
				}
			}
			@Pc(394) Class134 local394 = new Class134(local303, local121);
			@Pc(398) int local398 = local35 | 0x4000;
			local199 = arg5.method8021(local394, local398, Static222.anInt3839, 64, 768);
			for (local66 = 0; local66 < 5; local66++) {
				for (local125 = 0; local125 < Static332.aShortArrayArrayArray2.length; local125++) {
					if (this.anIntArray573[local66] < Static332.aShortArrayArrayArray2[local125][local66].length) {
						local199.ia(Static661.aShortArrayArray18[local125][local66], Static332.aShortArrayArrayArray2[local125][local66][this.anIntArray573[local66]]);
					}
				}
			}
			local199.s(local35);
			@Pc(462) Class295 local462 = Static641.aClass295_68;
			synchronized (Static641.aClass295_68) {
				Static641.aClass295_68.method6469(this.aLong292, local199);
			}
		}
		if (arg6 == null) {
			return local199;
		} else {
			local199.method8858((byte) 4, local35, true);
			return arg6.method5382(2048, arg0, arg7, arg9, local199);
		}
	}
}
