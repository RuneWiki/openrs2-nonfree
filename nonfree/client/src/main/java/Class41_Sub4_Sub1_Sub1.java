import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class41_Sub4_Sub1_Sub1 extends Class41_Sub4_Sub1 {

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	private int anInt4491;

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "Lclient!oea;")
	public Class41_Sub6 aClass41_Sub6_1;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!jr", name = "J", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!jr", name = "M", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
	private int anInt4492;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!oea;IIIIIIIIIIIZZ)V")
	public Class41_Sub4_Sub1_Sub1(@OriginalArg(0) Class41_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub6_1 = arg0;
		super.anInt4483 = arg1 << 12;
		super.anInt4485 = arg2 << 12;
		super.anInt4484 = arg3 << 12;
		super.anInt4489 = arg9;
		this.aShort56 = this.aShort59 = (short) arg8;
		super.anInt4488 = arg10;
		super.anInt4482 = arg11;
		super.aBoolean298 = arg13;
		this.aShort58 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort60 = (short) arg6;
		this.anInt4492 = arg7;
		super.aByte51 = this.aClass41_Sub6_1.aClass244_2.aByte87;
		this.method3957();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!oea;IIIIIIIIIIIZZ)V")
	public void method3956(@OriginalArg(0) Class41_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub6_1 = arg0;
		super.anInt4483 = arg1 << 12;
		super.anInt4485 = arg2 << 12;
		super.anInt4484 = arg3 << 12;
		super.anInt4489 = arg9;
		this.aShort56 = this.aShort59 = (short) arg8;
		super.anInt4488 = arg10;
		super.anInt4482 = arg11;
		super.aBoolean298 = arg13;
		this.aShort58 = (short) arg4;
		this.aShort57 = (short) arg5;
		this.aShort60 = (short) arg6;
		this.anInt4492 = arg7;
		super.aByte51 = this.aClass41_Sub6_1.aClass244_2.aByte87;
		this.method3957();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()V")
	private void method3957() {
		@Pc(4) int local4 = this.aClass41_Sub6_1.aClass41_Sub7_5.anInt8330;
		if (this.aClass41_Sub6_1.aClass41_Sub7_5.aClass41_Sub4_Sub1_Sub1Array1[local4] != null) {
			this.aClass41_Sub6_1.aClass41_Sub7_5.aClass41_Sub4_Sub1_Sub1Array1[local4].method3959();
		}
		this.aClass41_Sub6_1.aClass41_Sub7_5.aClass41_Sub4_Sub1_Sub1Array1[local4] = this;
		this.aShort61 = (short) this.aClass41_Sub6_1.aClass41_Sub7_5.anInt8330;
		this.aClass41_Sub6_1.aClass41_Sub7_5.anInt8330 = local4 + 1 & 0x1FFF;
		this.aClass41_Sub6_1.aClass102_4.method2055(this);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(JI)V")
	public void method3958(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort59 = (short) (this.aShort59 - arg1);
		if (this.aShort59 <= 0) {
			this.method3959();
			return;
		}
		@Pc(17) int local17 = super.anInt4483 >> 12;
		@Pc(22) int local22 = super.anInt4485 >> 12;
		@Pc(27) int local27 = super.anInt4484 >> 12;
		@Pc(31) Class41_Sub7 local31 = this.aClass41_Sub6_1.aClass41_Sub7_5;
		@Pc(35) Class217 local35 = this.aClass41_Sub6_1.aClass217_1;
		if (local35.anInt6083 != 0) {
			@Pc(65) int local65;
			if (this.aShort56 - this.aShort59 <= local35.anInt6066) {
				local65 = (super.anInt4489 >> 8 & 0xFF00) + (this.anInt4491 >> 16 & 0xFF) + local35.anInt6088 * arg1;
				@Pc(82) int local82 = (super.anInt4489 & 0xFF00) + (this.anInt4491 >> 8 & 0xFF) + local35.anInt6073 * arg1;
				@Pc(99) int local99 = ((super.anInt4489 & 0xFF) << 8) + (this.anInt4491 & 0xFF) + local35.anInt6060 * arg1;
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
				super.anInt4489 &= 0xFF000000;
				super.anInt4489 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4491 &= 0xFF000000;
				this.anInt4491 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort56 - this.aShort59 <= local35.anInt6052) {
				local65 = (super.anInt4489 >> 16 & 0xFF00) + (this.anInt4491 >> 24 & 0xFF) + local35.anInt6071 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4489 &= 0xFFFFFF;
				super.anInt4489 |= (local65 & 0xFF00) << 16;
				this.anInt4491 &= 0xFFFFFF;
				this.anInt4491 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6075 != -1 && this.aShort56 - this.aShort59 <= local35.anInt6055) {
			this.anInt4492 += local35.anInt6067 * arg1;
		}
		if (local35.anInt6087 != -1 && this.aShort56 - this.aShort59 <= local35.anInt6094) {
			super.anInt4488 += local35.anInt6048 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort58;
		@Pc(300) double local300 = (double) this.aShort57;
		@Pc(304) double local304 = (double) this.aShort60;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt6069 == 1) {
			local317 = local17 - this.aClass41_Sub6_1.aClass105_1.anInt2348;
			local324 = local22 - this.aClass41_Sub6_1.aClass105_1.anInt2351;
			local331 = local27 - this.aClass41_Sub6_1.aClass105_1.anInt2350;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt6079 * local348 * arg1);
			this.anInt4492 = (int) ((long) this.anInt4492 - ((long) this.anInt4492 * local356 >> 18));
		} else if (local35.anInt6069 == 2) {
			local317 = local17 - this.aClass41_Sub6_1.aClass105_1.anInt2348;
			local324 = local22 - this.aClass41_Sub6_1.aClass105_1.anInt2351;
			local331 = local27 - this.aClass41_Sub6_1.aClass105_1.anInt2350;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt6079 * local348 * arg1);
			this.anInt4492 = (int) ((long) this.anInt4492 - ((long) this.anInt4492 * local356 >> 28));
		}
		if (local35.anIntArray348 != null) {
			@Pc(437) Class5 local437 = local31.aClass124_86.aClass5_123;
			for (@Pc(440) Class5 local440 = local437.aClass5_337; local440 != local437; local440 = local440.aClass5_337) {
				@Pc(444) Class5_Sub2_Sub19 local444 = (Class5_Sub2_Sub19) local440;
				@Pc(447) Class257 local447 = local444.aClass257_1;
				if (local447.anInt7538 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray348.length; local455++) {
						if (local35.anIntArray348[local455] == local447.anInt7536) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt9334);
						@Pc(486) double local486 = (double) (local22 - local444.anInt9333);
						@Pc(492) double local492 = (double) (local27 - local444.anInt9336);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong225)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt9331 + local486 * (double) local447.anInt7533 + local492 * (double) local444.anInt9335) * 65535.0D / ((double) local447.anInt7535 * local513);
							if (!(local545 < (double) local447.anInt7540)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt7541 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt7544;
								} else if (local447.anInt7541 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt7544;
								}
								if (local447.anInt7546 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt7535;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt7535;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt7535;
									if (local447.anInt7543 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt4483 = (int) ((double) super.anInt4483 + local678 * (double) arg1);
										super.anInt4485 = (int) ((double) super.anInt4485 + local686 * (double) arg1);
										super.anInt4484 = (int) ((double) super.anInt4484 + local694 * (double) arg1);
									}
								} else if (local447.anInt7543 == 0) {
									local296 += ((double) local444.anInt9331 - local553) * (double) arg1;
									local300 += ((double) local447.anInt7533 - local553) * (double) arg1;
									local304 += ((double) local444.anInt9335 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt4483 = (int) ((double) super.anInt4483 + ((double) local444.anInt9331 - local553) * (double) arg1);
									super.anInt4485 = (int) ((double) super.anInt4485 + ((double) local447.anInt7533 - local553) * (double) arg1);
									super.anInt4484 = (int) ((double) super.anInt4484 + ((double) local444.anInt9335 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray346 != null) {
			for (local317 = 0; local317 < local35.anIntArray346.length; local317++) {
				@Pc(776) Class5_Sub2_Sub19 local776 = (Class5_Sub2_Sub19) Static435.aClass99_1.method2043((long) local35.anIntArray346[local317]);
				while (local776 != null) {
					@Pc(780) Class257 local780 = local776.aClass257_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt9334);
					@Pc(792) double local792 = (double) (local22 - local776.anInt9333);
					@Pc(798) double local798 = (double) (local27 - local776.anInt9336);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong225) {
						local776 = (Class5_Sub2_Sub19) Static435.aClass99_1.method2046();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt9331 + local792 * (double) local780.anInt7533 + local798 * (double) local776.anInt9335) * 65535.0D / ((double) local780.anInt7535 * local825);
						if (local857 < (double) local780.anInt7540) {
							local776 = (Class5_Sub2_Sub19) Static435.aClass99_1.method2046();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt7541 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt7544;
							} else if (local780.anInt7541 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt7544;
							}
							if (local780.anInt7546 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt7535;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt7535;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt7535;
								if (local780.anInt7543 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt4483 = (int) ((double) super.anInt4483 + local996 * (double) arg1);
									super.anInt4485 = (int) ((double) super.anInt4485 + local1004 * (double) arg1);
									super.anInt4484 = (int) ((double) super.anInt4484 + local1012 * (double) arg1);
								}
							} else if (local780.anInt7543 == 0) {
								local296 += ((double) local776.anInt9331 - local871) * (double) arg1;
								local300 += ((double) local780.anInt7533 - local871) * (double) arg1;
								local304 += ((double) local776.anInt9335 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt4483 = (int) ((double) super.anInt4483 + ((double) local776.anInt9331 - local871) * (double) arg1);
								super.anInt4485 = (int) ((double) super.anInt4485 + ((double) local780.anInt7533 - local871) * (double) arg1);
								super.anInt4484 = (int) ((double) super.anInt4484 + ((double) local776.anInt9335 - local871) * (double) arg1);
							}
							local776 = (Class5_Sub2_Sub19) Static435.aClass99_1.method2046();
						}
					}
				}
			}
		}
		if (local35.anIntArray347 != null) {
			if (local35.anIntArray345 == null) {
				local35.anIntArray345 = new int[local35.anIntArray347.length];
				for (local317 = 0; local317 < local35.anIntArray347.length; local317++) {
					Static520.method7348(local35.anIntArray347[local317]);
					local35.anIntArray345[local317] = ((Class5_Sub43) Static310.aClass335_24.method7766((long) local35.anIntArray347[local317])).anInt7821;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray345.length; local317++) {
				@Pc(1137) Class257 local1137 = Static626.aClass257Array1[local35.anIntArray345[local317]];
				if (local1137.anInt7543 == 0) {
					local296 += (double) (local1137.anInt7537 * arg1);
					local300 += (double) (local1137.anInt7533 * arg1);
					local304 += (double) (local1137.anInt7547 * arg1);
					local306 = true;
				} else {
					super.anInt4483 += local1137.anInt7537 * arg1;
					super.anInt4485 += local1137.anInt7533 * arg1;
					super.anInt4484 += local1137.anInt7547 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort58 = (short) (int) local296;
					this.aShort57 = (short) (int) local300;
					this.aShort60 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt4492 <<= 0x1;
			}
		}
		super.anInt4483 = (int) ((long) super.anInt4483 + ((long) this.aShort58 * (long) (this.anInt4492 << 2) >> 23) * (long) arg1);
		super.anInt4485 = (int) ((long) super.anInt4485 + ((long) this.aShort57 * (long) (this.anInt4492 << 2) >> 23) * (long) arg1);
		super.anInt4484 = (int) ((long) super.anInt4484 + ((long) this.aShort60 * (long) (this.anInt4492 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "()V")
	public void method3959() {
		this.aClass41_Sub6_1.aClass41_Sub7_5.aClass41_Sub4_Sub1_Sub1Array1[this.aShort61] = null;
		Static578.aClass41_Sub4_Sub1_Sub1Array2[Static57.anInt925] = this;
		Static57.anInt925 = Static57.anInt925 + 1 & 0x3FF;
		this.method8644();
		this.method6500();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method3960(@OriginalArg(0) Class143 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt4483 >> Static138.anInt2287 + 12;
		@Pc(13) int local13 = super.anInt4484 >> Static138.anInt2287 + 12;
		@Pc(18) int local18 = super.anInt4485 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static665.anInt7330 || local13 < 0 || local13 >= Static92.anInt1526) {
			this.method3959();
			return;
		}
		@Pc(40) Class41_Sub7 local40 = this.aClass41_Sub6_1.aClass41_Sub7_5;
		@Pc(44) Class217 local44 = this.aClass41_Sub6_1.aClass217_1;
		@Pc(46) Class88[] local46 = Static298.aClass88Array3;
		@Pc(49) int local49 = local40.anInt8332;
		@Pc(58) Class313 local58 = Static129.aClass313ArrayArrayArray7[local40.anInt8332][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte112;
		}
		@Pc(71) int local71 = local46[local49].method8749(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static202.anInt3256 - 1) {
			local86 = local46[local49 + 1].method8749(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static138.anInt2287);
		}
		if (local44.aBoolean449) {
			if (local44.anInt6078 == -1 && local18 > local71) {
				this.method3959();
				return;
			}
			if (local44.anInt6078 >= 0 && local18 > local46[local44.anInt6078].method8749(local6, local13)) {
				this.method3959();
				return;
			}
			if (local44.anInt6042 == -1 && local18 < local86) {
				this.method3959();
				return;
			}
			if (local44.anInt6042 >= 0 && local18 < local46[local44.anInt6042 + 1].method8749(local6, local13)) {
				this.method3959();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static202.anInt3256 - 1; local154 > 0 && local18 > local46[local154].method8749(local6, local13); local154--) {
		}
		if (local44.aBoolean445 && local154 == 0 && local18 > local46[0].method8749(local6, local13)) {
			this.method3959();
		} else if (local154 == Static202.anInt3256 - 1 && local46[local154].method8749(local6, local13) - local18 > 0x8 << Static138.anInt2287) {
			this.method3959();
		} else {
			local58 = Static129.aClass313ArrayArrayArray7[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static129.aClass313ArrayArrayArray7[0][local6][local13] == null) {
					local58 = Static129.aClass313ArrayArrayArray7[0][local6][local13] = new Class313(0);
				}
				@Pc(251) boolean local251 = Static129.aClass313ArrayArrayArray7[0][local6][local13].aClass313_1 != null;
				if (local154 == 3 && local251) {
					this.method3959();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static129.aClass313ArrayArrayArray7[local261][local6][local13] == null) {
						local58 = Static129.aClass313ArrayArrayArray7[local261][local6][local13] = new Class313(local261);
						if (local251) {
							local58.aByte112++;
						}
					}
				}
			}
			if (local44.aBoolean444) {
				@Pc(304) int local304 = super.anInt4483 >> 12;
				local261 = super.anInt4484 >> 12;
				@Pc(318) Class280 local318;
				if (local58.aClass41_Sub1_Sub3_2 != null) {
					local318 = local58.aClass41_Sub1_Sub3_2.method8656(arg0);
					if (local318 != null && local318.method6873(local304, local261, local18)) {
						this.method3959();
						return;
					}
				}
				if (local58.aClass41_Sub1_Sub3_1 != null) {
					local318 = local58.aClass41_Sub1_Sub3_1.method8656(arg0);
					if (local318 != null && local318.method6873(local304, local261, local18)) {
						this.method3959();
						return;
					}
				}
				if (local58.aClass41_Sub1_Sub4_1 != null) {
					local318 = local58.aClass41_Sub1_Sub4_1.method8656(arg0);
					if (local318 != null && local318.method6873(local304, local261, local18)) {
						this.method3959();
						return;
					}
				}
				for (@Pc(375) Class40 local375 = local58.aClass40_3; local375 != null; local375 = local375.aClass40_1) {
					@Pc(382) Class280 local382 = local375.aClass41_Sub1_Sub1_1.method8656(arg0);
					if (local382 != null && local382.method6873(local304, local261, local18)) {
						this.method3959();
						return;
					}
				}
			}
			local40.aClass149_1.aClass382_1.method8468(this);
		}
	}
}
