import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class34_Sub3_Sub2_Sub1 extends Class34_Sub3_Sub2 {

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "S")
	private short aShort116;

	@OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
	private int anInt10588;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "Lclient!fg;")
	public Class34_Sub2 aClass34_Sub2_1;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "S")
	private short aShort118;

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "S")
	private short aShort114;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "S")
	private short aShort115;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "S")
	private short aShort113;

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "S")
	private short aShort117;

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
	private int anInt10587;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!fg;IIIIIIIIIIIZZ)V")
	public Class34_Sub3_Sub2_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass34_Sub2_1 = arg0;
		super.anInt10579 = arg1 << 12;
		super.anInt10582 = arg2 << 12;
		super.anInt10583 = arg3 << 12;
		super.anInt10581 = arg9;
		this.aShort114 = this.aShort118 = (short) arg8;
		super.anInt10580 = arg10;
		super.anInt10586 = arg11;
		super.aBoolean732 = arg13;
		this.aShort115 = (short) arg4;
		this.aShort113 = (short) arg5;
		this.aShort117 = (short) arg6;
		this.anInt10587 = arg7;
		super.aByte149 = this.aClass34_Sub2_1.aClass373_1.aByte148;
		this.method8663();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!fg;IIIIIIIIIIIZZ)V")
	public void method8662(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass34_Sub2_1 = arg0;
		super.anInt10579 = arg1 << 12;
		super.anInt10582 = arg2 << 12;
		super.anInt10583 = arg3 << 12;
		super.anInt10581 = arg9;
		this.aShort114 = this.aShort118 = (short) arg8;
		super.anInt10580 = arg10;
		super.anInt10586 = arg11;
		super.aBoolean732 = arg13;
		this.aShort115 = (short) arg4;
		this.aShort113 = (short) arg5;
		this.aShort117 = (short) arg6;
		this.anInt10587 = arg7;
		super.aByte149 = this.aClass34_Sub2_1.aClass373_1.aByte148;
		this.method8663();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	private void method8663() {
		@Pc(4) int local4 = this.aClass34_Sub2_1.aClass34_Sub7_4.anInt6025;
		if (this.aClass34_Sub2_1.aClass34_Sub7_4.aClass34_Sub3_Sub2_Sub1Array2[local4] != null) {
			this.aClass34_Sub2_1.aClass34_Sub7_4.aClass34_Sub3_Sub2_Sub1Array2[local4].method8666();
		}
		this.aClass34_Sub2_1.aClass34_Sub7_4.aClass34_Sub3_Sub2_Sub1Array2[local4] = this;
		this.aShort116 = (short) this.aClass34_Sub2_1.aClass34_Sub7_4.anInt6025;
		this.aClass34_Sub2_1.aClass34_Sub7_4.anInt6025 = local4 + 1 & 0x1FFF;
		this.aClass34_Sub2_1.aClass317_3.method6890(this);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method8664(@OriginalArg(0) Class95 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt10579 >> Static571.anInt9216 + 12;
		@Pc(13) int local13 = super.anInt10583 >> Static571.anInt9216 + 12;
		@Pc(18) int local18 = super.anInt10582 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static133.anInt2551 || local13 < 0 || local13 >= Static155.anInt2874) {
			this.method8666();
			return;
		}
		@Pc(40) Class34_Sub7 local40 = this.aClass34_Sub2_1.aClass34_Sub7_4;
		@Pc(44) Class307 local44 = this.aClass34_Sub2_1.aClass307_1;
		@Pc(46) Class35[] local46 = Static582.aClass35Array3;
		@Pc(49) int local49 = local40.anInt6028;
		@Pc(58) Class368 local58 = Static254.aClass368ArrayArrayArray2[local40.anInt6028][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte143;
		}
		@Pc(71) int local71 = local46[local49].method7461(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static247.anInt4367 - 1) {
			local86 = local46[local49 + 1].method7461(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static571.anInt9216);
		}
		if (local44.aBoolean572) {
			if (local44.anInt8141 == -1 && local18 > local71) {
				this.method8666();
				return;
			}
			if (local44.anInt8141 >= 0 && local18 > local46[local44.anInt8141].method7461(local13, local6)) {
				this.method8666();
				return;
			}
			if (local44.anInt8184 == -1 && local18 < local86) {
				this.method8666();
				return;
			}
			if (local44.anInt8184 >= 0 && local18 < local46[local44.anInt8184 + 1].method7461(local13, local6)) {
				this.method8666();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static247.anInt4367 - 1; local154 > 0 && local18 > local46[local154].method7461(local13, local6); local154--) {
		}
		if (local44.aBoolean569 && local154 == 0 && local18 > local46[0].method7461(local13, local6)) {
			this.method8666();
		} else if (local154 == Static247.anInt4367 - 1 && local46[local154].method7461(local13, local6) - local18 > 0x8 << Static571.anInt9216) {
			this.method8666();
		} else {
			local58 = Static254.aClass368ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static254.aClass368ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static254.aClass368ArrayArrayArray2[0][local6][local13] = new Class368(0);
				}
				@Pc(251) boolean local251 = Static254.aClass368ArrayArrayArray2[0][local6][local13].aClass368_1 != null;
				if (local154 == 3 && local251) {
					this.method8666();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static254.aClass368ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static254.aClass368ArrayArrayArray2[local261][local6][local13] = new Class368(local261);
						if (local251) {
							local58.aByte143++;
						}
					}
				}
			}
			if (local44.aBoolean565) {
				@Pc(304) int local304 = super.anInt10579 >> 12;
				local261 = super.anInt10583 >> 12;
				@Pc(318) Class214 local318;
				if (local58.aClass34_Sub1_Sub5_2 != null) {
					local318 = local58.aClass34_Sub1_Sub5_2.method7846(arg0);
					if (local318 != null && local318.method5031(local304, local18, local261)) {
						this.method8666();
						return;
					}
				}
				if (local58.aClass34_Sub1_Sub5_1 != null) {
					local318 = local58.aClass34_Sub1_Sub5_1.method7846(arg0);
					if (local318 != null && local318.method5031(local304, local18, local261)) {
						this.method8666();
						return;
					}
				}
				if (local58.aClass34_Sub1_Sub2_1 != null) {
					local318 = local58.aClass34_Sub1_Sub2_1.method7846(arg0);
					if (local318 != null && local318.method5031(local304, local18, local261)) {
						this.method8666();
						return;
					}
				}
				for (@Pc(375) Class205 local375 = local58.aClass205_4; local375 != null; local375 = local375.aClass205_3) {
					@Pc(382) Class214 local382 = local375.aClass34_Sub1_Sub1_1.method7846(arg0);
					if (local382 != null && local382.method5031(local304, local18, local261)) {
						this.method8666();
						return;
					}
				}
			}
			local40.aClass347_1.aClass61_1.method1344(this);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(JI)V")
	public void method8665(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort118 = (short) (this.aShort118 - arg1);
		if (this.aShort118 <= 0) {
			this.method8666();
			return;
		}
		@Pc(17) int local17 = super.anInt10579 >> 12;
		@Pc(22) int local22 = super.anInt10582 >> 12;
		@Pc(27) int local27 = super.anInt10583 >> 12;
		@Pc(31) Class34_Sub7 local31 = this.aClass34_Sub2_1.aClass34_Sub7_4;
		@Pc(35) Class307 local35 = this.aClass34_Sub2_1.aClass307_1;
		if (local35.lb != 0) {
			@Pc(65) int local65;
			if (this.aShort114 - this.aShort118 <= local35.anInt8161) {
				local65 = (super.anInt10581 >> 8 & 0xFF00) + (this.anInt10588 >> 16 & 0xFF) + local35.anInt8155 * arg1;
				@Pc(82) int local82 = (super.anInt10581 & 0xFF00) + (this.anInt10588 >> 8 & 0xFF) + local35.anInt8179 * arg1;
				@Pc(99) int local99 = ((super.anInt10581 & 0xFF) << 8) + (this.anInt10588 & 0xFF) + local35.anInt8183 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt10581 &= 0xFF000000;
				super.anInt10581 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt10588 &= 0xFF000000;
				this.anInt10588 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort114 - this.aShort118 <= local35.anInt8167) {
				local65 = (super.anInt10581 >> 16 & 0xFF00) + (this.anInt10588 >> 24 & 0xFF) + local35.anInt8178 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt10581 &= 0xFFFFFF;
				super.anInt10581 |= (local65 & 0xFF00) << 16;
				this.anInt10588 &= 0xFFFFFF;
				this.anInt10588 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8180 != -1 && this.aShort114 - this.aShort118 <= local35.anInt8174) {
			this.anInt10587 += local35.anInt8170 * arg1;
		}
		if (local35.anInt8169 != -1 && this.aShort114 - this.aShort118 <= local35.anInt8152) {
			super.anInt10580 += local35.anInt8182 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort115;
		@Pc(300) double local300 = (double) this.aShort113;
		@Pc(304) double local304 = (double) this.aShort117;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt8160 == 1) {
			local317 = local17 - this.aClass34_Sub2_1.aClass287_1.anInt7571;
			local324 = local22 - this.aClass34_Sub2_1.aClass287_1.anInt7579;
			local331 = local27 - this.aClass34_Sub2_1.aClass287_1.anInt7584;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt8175 * local348 * arg1);
			this.anInt10587 = (int) ((long) this.anInt10587 - ((long) this.anInt10587 * local356 >> 18));
		} else if (local35.anInt8160 == 2) {
			local317 = local17 - this.aClass34_Sub2_1.aClass287_1.anInt7571;
			local324 = local22 - this.aClass34_Sub2_1.aClass287_1.anInt7579;
			local331 = local27 - this.aClass34_Sub2_1.aClass287_1.anInt7584;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt8175 * local348 * arg1);
			this.anInt10587 = (int) ((long) this.anInt10587 - ((long) this.anInt10587 * local356 >> 28));
		}
		if (local35.anIntArray431 != null) {
			@Pc(437) Class3 local437 = local31.aClass302_40.aClass3_241;
			for (@Pc(440) Class3 local440 = local437.aClass3_337; local440 != local437; local440 = local440.aClass3_337) {
				@Pc(444) Class3_Sub5_Sub17 local444 = (Class3_Sub5_Sub17) local440;
				@Pc(447) Class293 local447 = local444.aClass293_1;
				if (local447.anInt7718 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray431.length; local455++) {
						if (local35.anIntArray431[local455] == local447.anInt7715) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt8300);
						@Pc(486) double local486 = (double) (local22 - local444.anInt8302);
						@Pc(492) double local492 = (double) (local27 - local444.anInt8299);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong212)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt8294 + local486 * (double) local447.anInt7712 + local492 * (double) local444.anInt8297) * 65535.0D / ((double) local447.anInt7720 * local513);
							if (!(local545 < (double) local447.anInt7717)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt7713 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt7709;
								} else if (local447.anInt7713 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt7709;
								}
								if (local447.anInt7711 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt7720;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt7720;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt7720;
									if (local447.anInt7710 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt10579 = (int) ((double) super.anInt10579 + local678 * (double) arg1);
										super.anInt10582 = (int) ((double) super.anInt10582 + local686 * (double) arg1);
										super.anInt10583 = (int) ((double) super.anInt10583 + local694 * (double) arg1);
									}
								} else if (local447.anInt7710 == 0) {
									local296 += ((double) local444.anInt8294 - local553) * (double) arg1;
									local300 += ((double) local447.anInt7712 - local553) * (double) arg1;
									local304 += ((double) local444.anInt8297 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt10579 = (int) ((double) super.anInt10579 + ((double) local444.anInt8294 - local553) * (double) arg1);
									super.anInt10582 = (int) ((double) super.anInt10582 + ((double) local447.anInt7712 - local553) * (double) arg1);
									super.anInt10583 = (int) ((double) super.anInt10583 + ((double) local444.anInt8297 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray432 != null) {
			for (local317 = 0; local317 < local35.anIntArray432.length; local317++) {
				@Pc(776) Class3_Sub5_Sub17 local776 = (Class3_Sub5_Sub17) Static287.aClass247_1.method5510((long) local35.anIntArray432[local317]);
				while (local776 != null) {
					@Pc(780) Class293 local780 = local776.aClass293_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt8300);
					@Pc(792) double local792 = (double) (local22 - local776.anInt8302);
					@Pc(798) double local798 = (double) (local27 - local776.anInt8299);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong212) {
						local776 = (Class3_Sub5_Sub17) Static287.aClass247_1.method5508();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt8294 + local792 * (double) local780.anInt7712 + local798 * (double) local776.anInt8297) * 65535.0D / ((double) local780.anInt7720 * local825);
						if (local857 < (double) local780.anInt7717) {
							local776 = (Class3_Sub5_Sub17) Static287.aClass247_1.method5508();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt7713 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt7709;
							} else if (local780.anInt7713 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt7709;
							}
							if (local780.anInt7711 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt7720;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt7720;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt7720;
								if (local780.anInt7710 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt10579 = (int) ((double) super.anInt10579 + local996 * (double) arg1);
									super.anInt10582 = (int) ((double) super.anInt10582 + local1004 * (double) arg1);
									super.anInt10583 = (int) ((double) super.anInt10583 + local1012 * (double) arg1);
								}
							} else if (local780.anInt7710 == 0) {
								local296 += ((double) local776.anInt8294 - local871) * (double) arg1;
								local300 += ((double) local780.anInt7712 - local871) * (double) arg1;
								local304 += ((double) local776.anInt8297 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt10579 = (int) ((double) super.anInt10579 + ((double) local776.anInt8294 - local871) * (double) arg1);
								super.anInt10582 = (int) ((double) super.anInt10582 + ((double) local780.anInt7712 - local871) * (double) arg1);
								super.anInt10583 = (int) ((double) super.anInt10583 + ((double) local776.anInt8297 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub5_Sub17) Static287.aClass247_1.method5508();
						}
					}
				}
			}
		}
		if (local35.anIntArray433 != null) {
			if (local35.anIntArray430 == null) {
				local35.anIntArray430 = new int[local35.anIntArray433.length];
				for (local317 = 0; local317 < local35.anIntArray433.length; local317++) {
					Static674.method8986(local35.anIntArray433[local317]);
					local35.anIntArray430[local317] = ((Class3_Sub24) Static20.aClass333_2.method7489((long) local35.anIntArray433[local317])).anInt3846;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray430.length; local317++) {
				@Pc(1137) Class293 local1137 = Static171.aClass293Array1[local35.anIntArray430[local317]];
				if (local1137.anInt7710 == 0) {
					local296 += (double) (local1137.anInt7714 * arg1);
					local300 += (double) (local1137.anInt7712 * arg1);
					local304 += (double) (local1137.anInt7716 * arg1);
					local306 = true;
				} else {
					super.anInt10579 += local1137.anInt7714 * arg1;
					super.anInt10582 += local1137.anInt7712 * arg1;
					super.anInt10583 += local1137.anInt7716 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort115 = (short) (int) local296;
					this.aShort113 = (short) (int) local300;
					this.aShort117 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt10587 <<= 0x1;
			}
		}
		super.anInt10579 = (int) ((long) super.anInt10579 + ((long) this.aShort115 * (long) (this.anInt10587 << 2) >> 23) * (long) arg1);
		super.anInt10582 = (int) ((long) super.anInt10582 + ((long) this.aShort113 * (long) (this.anInt10587 << 2) >> 23) * (long) arg1);
		super.anInt10583 = (int) ((long) super.anInt10583 + ((long) this.aShort117 * (long) (this.anInt10587 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "()V")
	public void method8666() {
		this.aClass34_Sub2_1.aClass34_Sub7_4.aClass34_Sub3_Sub2_Sub1Array2[this.aShort116] = null;
		Static97.aClass34_Sub3_Sub2_Sub1Array1[Static21.anInt7428] = this;
		Static21.anInt7428 = Static21.anInt7428 + 1 & 0x3FF;
		this.method8764();
		this.method8658();
	}
}
