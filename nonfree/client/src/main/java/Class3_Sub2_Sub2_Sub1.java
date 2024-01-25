import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class3_Sub2_Sub2_Sub1 extends Class3_Sub2_Sub2 {

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
	private int anInt8149;

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "Lclient!rba;")
	public Class3_Sub7 aClass3_Sub7_1;

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!ps", name = "C", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!ps", name = "B", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!ps", name = "A", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
	private int anInt8150;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!rba;IIIIIIIIIIIZZ)V")
	public Class3_Sub2_Sub2_Sub1(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass3_Sub7_1 = arg0;
		super.anInt8145 = arg1 << 12;
		super.anInt8148 = arg2 << 12;
		super.anInt8143 = arg3 << 12;
		super.anInt8144 = arg9;
		this.aShort102 = this.aShort103 = (short) arg8;
		super.anInt8147 = arg10;
		super.anInt8146 = arg11;
		super.aBoolean576 = arg13;
		this.aShort106 = (short) arg4;
		this.aShort105 = (short) arg5;
		this.aShort104 = (short) arg6;
		this.anInt8150 = arg7;
		super.aByte115 = this.aClass3_Sub7_1.aClass227_2.aByte112;
		this.method6952();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "()V")
	public void method6951() {
		this.aClass3_Sub7_1.aClass3_Sub9_7.aClass3_Sub2_Sub2_Sub1Array2[this.aShort101] = null;
		Static120.aClass3_Sub2_Sub2_Sub1Array1[Static76.anInt2398] = this;
		Static76.anInt2398 = Static76.anInt2398 + 1 & 0x3FF;
		this.method8909();
		this.method6948();
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "()V")
	private void method6952() {
		@Pc(4) int local4 = this.aClass3_Sub7_1.aClass3_Sub9_7.anInt10286;
		if (this.aClass3_Sub7_1.aClass3_Sub9_7.aClass3_Sub2_Sub2_Sub1Array2[local4] != null) {
			this.aClass3_Sub7_1.aClass3_Sub9_7.aClass3_Sub2_Sub2_Sub1Array2[local4].method6951();
		}
		this.aClass3_Sub7_1.aClass3_Sub9_7.aClass3_Sub2_Sub2_Sub1Array2[local4] = this;
		this.aShort101 = (short) this.aClass3_Sub7_1.aClass3_Sub9_7.anInt10286;
		this.aClass3_Sub7_1.aClass3_Sub9_7.anInt10286 = local4 + 1 & 0x1FFF;
		this.aClass3_Sub7_1.aClass325_6.method8013(this);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method6953(@OriginalArg(0) Class20 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt8145 >> Static151.anInt3896 + 12;
		@Pc(13) int local13 = super.anInt8143 >> Static151.anInt3896 + 12;
		@Pc(18) int local18 = super.anInt8148 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static477.anInt8929 || local13 < 0 || local13 >= Static562.anInt10128) {
			this.method6951();
			return;
		}
		@Pc(40) Class3_Sub9 local40 = this.aClass3_Sub7_1.aClass3_Sub9_7;
		@Pc(44) Class273 local44 = this.aClass3_Sub7_1.aClass273_1;
		@Pc(46) Class65[] local46 = Static9.aClass65Array1;
		@Pc(49) int local49 = local40.anInt10288;
		@Pc(58) Class100 local58 = Static395.aClass100ArrayArrayArray3[local40.anInt10288][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte41;
		}
		@Pc(71) int local71 = local46[local49].method7995(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static462.anInt8470 - 1) {
			local86 = local46[local49 + 1].method7995(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static151.anInt3896);
		}
		if (local44.aBoolean586) {
			if (local44.anInt8249 == -1 && local18 > local71) {
				this.method6951();
				return;
			}
			if (local44.anInt8249 >= 0 && local18 > local46[local44.anInt8249].method7995(local13, local6)) {
				this.method6951();
				return;
			}
			if (local44.anInt8280 == -1 && local18 < local86) {
				this.method6951();
				return;
			}
			if (local44.anInt8280 >= 0 && local18 < local46[local44.anInt8280 + 1].method7995(local13, local6)) {
				this.method6951();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static462.anInt8470 - 1; local154 > 0 && local18 > local46[local154].method7995(local13, local6); local154--) {
		}
		if (local44.aBoolean584 && local154 == 0 && local18 > local46[0].method7995(local13, local6)) {
			this.method6951();
		} else if (local154 == Static462.anInt8470 - 1 && local46[local154].method7995(local13, local6) - local18 > 0x8 << Static151.anInt3896) {
			this.method6951();
		} else {
			local58 = Static395.aClass100ArrayArrayArray3[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static395.aClass100ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static395.aClass100ArrayArrayArray3[0][local6][local13] = new Class100(0);
				}
				@Pc(251) boolean local251 = Static395.aClass100ArrayArrayArray3[0][local6][local13].aClass100_1 != null;
				if (local154 == 3 && local251) {
					this.method6951();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static395.aClass100ArrayArrayArray3[local261][local6][local13] == null) {
						local58 = Static395.aClass100ArrayArrayArray3[local261][local6][local13] = new Class100(local261);
						if (local251) {
							local58.aByte41++;
						}
					}
				}
			}
			if (local44.aBoolean589) {
				@Pc(304) int local304 = super.anInt8145 >> 12;
				local261 = super.anInt8143 >> 12;
				@Pc(318) Class142 local318;
				if (local58.aClass3_Sub1_Sub5_2 != null) {
					local318 = local58.aClass3_Sub1_Sub5_2.method8605(arg0);
					if (local318 != null && local318.method4301(local261, local18, local304)) {
						this.method6951();
						return;
					}
				}
				if (local58.aClass3_Sub1_Sub5_1 != null) {
					local318 = local58.aClass3_Sub1_Sub5_1.method8605(arg0);
					if (local318 != null && local318.method4301(local261, local18, local304)) {
						this.method6951();
						return;
					}
				}
				if (local58.aClass3_Sub1_Sub1_1 != null) {
					local318 = local58.aClass3_Sub1_Sub1_1.method8605(arg0);
					if (local318 != null && local318.method4301(local261, local18, local304)) {
						this.method6951();
						return;
					}
				}
				for (@Pc(375) Class243 local375 = local58.aClass243_1; local375 != null; local375 = local375.aClass243_3) {
					@Pc(382) Class142 local382 = local375.aClass3_Sub1_Sub3_1.method8605(arg0);
					if (local382 != null && local382.method4301(local261, local18, local304)) {
						this.method6951();
						return;
					}
				}
			}
			local40.aClass203_1.aClass194_1.method5596(this);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!rba;IIIIIIIIIIIZZ)V")
	public void method6954(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass3_Sub7_1 = arg0;
		super.anInt8145 = arg1 << 12;
		super.anInt8148 = arg2 << 12;
		super.anInt8143 = arg3 << 12;
		super.anInt8144 = arg9;
		this.aShort102 = this.aShort103 = (short) arg8;
		super.anInt8147 = arg10;
		super.anInt8146 = arg11;
		super.aBoolean576 = arg13;
		this.aShort106 = (short) arg4;
		this.aShort105 = (short) arg5;
		this.aShort104 = (short) arg6;
		this.anInt8150 = arg7;
		super.aByte115 = this.aClass3_Sub7_1.aClass227_2.aByte112;
		this.method6952();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(JI)V")
	public void method6955(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort103 = (short) (this.aShort103 - arg1);
		if (this.aShort103 <= 0) {
			this.method6951();
			return;
		}
		@Pc(17) int local17 = super.anInt8145 >> 12;
		@Pc(22) int local22 = super.anInt8148 >> 12;
		@Pc(27) int local27 = super.anInt8143 >> 12;
		@Pc(31) Class3_Sub9 local31 = this.aClass3_Sub7_1.aClass3_Sub9_7;
		@Pc(35) Class273 local35 = this.aClass3_Sub7_1.aClass273_1;
		if (local35.anInt8250 != 0) {
			@Pc(65) int local65;
			if (this.aShort102 - this.aShort103 <= local35.anInt8242) {
				local65 = (super.anInt8144 >> 8 & 0xFF00) + (this.anInt8149 >> 16 & 0xFF) + local35.anInt8282 * arg1;
				@Pc(82) int local82 = (super.anInt8144 & 0xFF00) + (this.anInt8149 >> 8 & 0xFF) + local35.anInt8278 * arg1;
				@Pc(99) int local99 = ((super.anInt8144 & 0xFF) << 8) + (this.anInt8149 & 0xFF) + local35.anInt8266 * arg1;
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
				super.anInt8144 &= 0xFF000000;
				super.anInt8144 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt8149 &= 0xFF000000;
				this.anInt8149 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort102 - this.aShort103 <= local35.anInt8247) {
				local65 = (super.anInt8144 >> 16 & 0xFF00) + (this.anInt8149 >> 24 & 0xFF) + local35.anInt8274 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt8144 &= 0xFFFFFF;
				super.anInt8144 |= (local65 & 0xFF00) << 16;
				this.anInt8149 &= 0xFFFFFF;
				this.anInt8149 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8265 != -1 && this.aShort102 - this.aShort103 <= local35.anInt8248) {
			this.anInt8150 += local35.anInt8244 * arg1;
		}
		if (local35.anInt8283 != -1 && this.aShort102 - this.aShort103 <= local35.anInt8252) {
			super.anInt8147 += local35.anInt8292 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort106;
		@Pc(300) double local300 = (double) this.aShort105;
		@Pc(304) double local304 = (double) this.aShort104;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt8289 == 1) {
			local317 = local17 - this.aClass3_Sub7_1.aClass360_1.anInt10568;
			local324 = local22 - this.aClass3_Sub7_1.aClass360_1.anInt10562;
			local331 = local27 - this.aClass3_Sub7_1.aClass360_1.anInt10566;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt8290 * local348 * arg1;
			this.anInt8150 = (int) ((long) this.anInt8150 - ((long) this.anInt8150 * local356 >> 18));
		} else if (local35.anInt8289 == 2) {
			local317 = local17 - this.aClass3_Sub7_1.aClass360_1.anInt10568;
			local324 = local22 - this.aClass3_Sub7_1.aClass360_1.anInt10562;
			local331 = local27 - this.aClass3_Sub7_1.aClass360_1.anInt10566;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt8290 * local348 * arg1;
			this.anInt8150 = (int) ((long) this.anInt8150 - ((long) this.anInt8150 * local356 >> 28));
		}
		if (local35.anIntArray545 != null) {
			@Pc(437) Class2 local437 = local31.aClass341_66.aClass2_271;
			for (@Pc(440) Class2 local440 = local437.aClass2_299; local440 != local437; local440 = local440.aClass2_299) {
				@Pc(444) Class2_Sub6_Sub12 local444 = (Class2_Sub6_Sub12) local440;
				@Pc(447) Class267 local447 = local444.aClass267_1;
				if (local447.anInt8084 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray545.length; local455++) {
						if (local35.anIntArray545[local455] == local447.anInt8090) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt5746);
						@Pc(486) double local486 = (double) (local22 - local444.anInt5741);
						@Pc(492) double local492 = (double) (local27 - local444.anInt5745);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong200)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt5740 + local486 * (double) local447.anInt8078 + local492 * (double) local444.anInt5742) * 65535.0D / ((double) local447.anInt8087 * local513);
							if (!(local545 < (double) local447.anInt8086)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt8077 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt8091;
								} else if (local447.anInt8077 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt8091;
								}
								if (local447.anInt8080 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt8087;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt8087;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt8087;
									if (local447.anInt8085 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt8145 = (int) ((double) super.anInt8145 + local678 * (double) arg1);
										super.anInt8148 = (int) ((double) super.anInt8148 + local686 * (double) arg1);
										super.anInt8143 = (int) ((double) super.anInt8143 + local694 * (double) arg1);
									}
								} else if (local447.anInt8085 == 0) {
									local296 += ((double) local444.anInt5740 - local553) * (double) arg1;
									local300 += ((double) local447.anInt8078 - local553) * (double) arg1;
									local304 += ((double) local444.anInt5742 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt8145 = (int) ((double) super.anInt8145 + ((double) local444.anInt5740 - local553) * (double) arg1);
									super.anInt8148 = (int) ((double) super.anInt8148 + ((double) local447.anInt8078 - local553) * (double) arg1);
									super.anInt8143 = (int) ((double) super.anInt8143 + ((double) local444.anInt5742 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray542 != null) {
			for (local317 = 0; local317 < local35.anIntArray542.length; local317++) {
				@Pc(776) Class2_Sub6_Sub12 local776 = (Class2_Sub6_Sub12) Static407.aClass144_1.method4401((long) local35.anIntArray542[local317]);
				while (local776 != null) {
					@Pc(780) Class267 local780 = local776.aClass267_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt5746);
					@Pc(792) double local792 = (double) (local22 - local776.anInt5741);
					@Pc(798) double local798 = (double) (local27 - local776.anInt5745);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong200) {
						local776 = (Class2_Sub6_Sub12) Static407.aClass144_1.method4403();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt5740 + local792 * (double) local780.anInt8078 + local798 * (double) local776.anInt5742) * 65535.0D / ((double) local780.anInt8087 * local825);
						if (local857 < (double) local780.anInt8086) {
							local776 = (Class2_Sub6_Sub12) Static407.aClass144_1.method4403();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt8077 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt8091;
							} else if (local780.anInt8077 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt8091;
							}
							if (local780.anInt8080 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt8087;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt8087;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt8087;
								if (local780.anInt8085 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt8145 = (int) ((double) super.anInt8145 + local996 * (double) arg1);
									super.anInt8148 = (int) ((double) super.anInt8148 + local1004 * (double) arg1);
									super.anInt8143 = (int) ((double) super.anInt8143 + local1012 * (double) arg1);
								}
							} else if (local780.anInt8085 == 0) {
								local296 += ((double) local776.anInt5740 - local871) * (double) arg1;
								local300 += ((double) local780.anInt8078 - local871) * (double) arg1;
								local304 += ((double) local776.anInt5742 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt8145 = (int) ((double) super.anInt8145 + ((double) local776.anInt5740 - local871) * (double) arg1);
								super.anInt8148 = (int) ((double) super.anInt8148 + ((double) local780.anInt8078 - local871) * (double) arg1);
								super.anInt8143 = (int) ((double) super.anInt8143 + ((double) local776.anInt5742 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub6_Sub12) Static407.aClass144_1.method4403();
						}
					}
				}
			}
		}
		if (local35.anIntArray544 != null) {
			if (local35.anIntArray543 == null) {
				local35.anIntArray543 = new int[local35.anIntArray544.length];
				for (local317 = 0; local317 < local35.anIntArray544.length; local317++) {
					Static564.method8459(local35.anIntArray544[local317]);
					local35.anIntArray543[local317] = ((Class2_Sub43) Static621.aClass99_82.method3056((long) local35.anIntArray544[local317])).anInt9046;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray543.length; local317++) {
				@Pc(1137) Class267 local1137 = Static212.aClass267Array1[local35.anIntArray543[local317]];
				if (local1137.anInt8085 == 0) {
					local296 += local1137.anInt8079 * arg1;
					local300 += local1137.anInt8078 * arg1;
					local304 += local1137.anInt8082 * arg1;
					local306 = true;
				} else {
					super.anInt8145 += local1137.anInt8079 * arg1;
					super.anInt8148 += local1137.anInt8078 * arg1;
					super.anInt8143 += local1137.anInt8082 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort106 = (short) local296;
					this.aShort105 = (short) local300;
					this.aShort104 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt8150 <<= 0x1;
			}
		}
		super.anInt8145 = (int) ((long) super.anInt8145 + ((long) this.aShort106 * (long) (this.anInt8150 << 2) >> 23) * (long) arg1);
		super.anInt8148 = (int) ((long) super.anInt8148 + ((long) this.aShort105 * (long) (this.anInt8150 << 2) >> 23) * (long) arg1);
		super.anInt8143 = (int) ((long) super.anInt8143 + ((long) this.aShort104 * (long) (this.anInt8150 << 2) >> 23) * (long) arg1);
	}
}
