import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class14_Sub2_Sub2_Sub1 extends Class14_Sub2_Sub2 {

	@OriginalMember(owner = "client!iu", name = "D", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
	private int anInt4160;

	@OriginalMember(owner = "client!iu", name = "G", descriptor = "Lclient!ij;")
	public Class14_Sub7 aClass14_Sub7_1;

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!iu", name = "L", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!iu", name = "E", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!iu", name = "F", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!iu", name = "I", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
	private int anInt4159;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!ij;IIIIIIIIIIIZZ)V")
	public Class14_Sub2_Sub2_Sub1(@OriginalArg(0) Class14_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass14_Sub7_1 = arg0;
		super.anInt4154 = arg1 << 12;
		super.anInt4151 = arg2 << 12;
		super.anInt4155 = arg3 << 12;
		super.anInt4157 = arg9;
		this.aShort70 = this.aShort69 = (short) arg8;
		super.anInt4156 = arg10;
		super.anInt4158 = arg11;
		super.aBoolean341 = arg13;
		this.aShort66 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort68 = (short) arg6;
		this.anInt4159 = arg7;
		super.aByte81 = this.aClass14_Sub7_1.aClass57_2.aByte18;
		this.method3784();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "()V")
	public void method3780() {
		this.aClass14_Sub7_1.aClass14_Sub8_6.aClass14_Sub2_Sub2_Sub1Array7[this.aShort65] = null;
		Static580.aClass14_Sub2_Sub2_Sub1Array13[Static225.anInt3890] = this;
		Static225.anInt3890 = Static225.anInt3890 + 1 & 0x3FF;
		this.method8904();
		this.method3776();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method3781(@OriginalArg(0) Class126 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt4154 >> Static162.anInt2830 + 12;
		@Pc(13) int local13 = super.anInt4155 >> Static162.anInt2830 + 12;
		@Pc(18) int local18 = super.anInt4151 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static129.anInt6336 || local13 < 0 || local13 >= Static150.anInt2400) {
			this.method3780();
			return;
		}
		@Pc(40) Class14_Sub8 local40 = this.aClass14_Sub7_1.aClass14_Sub8_6;
		@Pc(44) Class107 local44 = this.aClass14_Sub7_1.aClass107_1;
		@Pc(46) Class40[] local46 = Static299.aClass40Array1;
		@Pc(49) int local49 = local40.anInt4868;
		@Pc(58) Class156 local58 = Static535.aClass156ArrayArrayArray2[local40.anInt4868][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte78;
		}
		@Pc(71) int local71 = local46[local49].method8442(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static36.anInt662 - 1) {
			local86 = local46[local49 + 1].method8442(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static162.anInt2830);
		}
		if (local44.aBoolean203) {
			if (local44.anInt2483 == -1 && local18 > local71) {
				this.method3780();
				return;
			}
			if (local44.anInt2483 >= 0 && local18 > local46[local44.anInt2483].method8442(local6, local13)) {
				this.method3780();
				return;
			}
			if (local44.anInt2478 == -1 && local18 < local86) {
				this.method3780();
				return;
			}
			if (local44.anInt2478 >= 0 && local18 < local46[local44.anInt2478 + 1].method8442(local6, local13)) {
				this.method3780();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static36.anInt662 - 1; local154 > 0 && local18 > local46[local154].method8442(local6, local13); local154--) {
		}
		if (local44.aBoolean208 && local154 == 0 && local18 > local46[0].method8442(local6, local13)) {
			this.method3780();
		} else if (local154 == Static36.anInt662 - 1 && local46[local154].method8442(local6, local13) - local18 > 0x8 << Static162.anInt2830) {
			this.method3780();
		} else {
			local58 = Static535.aClass156ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static535.aClass156ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static535.aClass156ArrayArrayArray2[0][local6][local13] = new Class156(0);
				}
				@Pc(251) boolean local251 = Static535.aClass156ArrayArrayArray2[0][local6][local13].aClass156_1 != null;
				if (local154 == 3 && local251) {
					this.method3780();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static535.aClass156ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static535.aClass156ArrayArrayArray2[local261][local6][local13] = new Class156(local261);
						if (local251) {
							local58.aByte78++;
						}
					}
				}
			}
			if (local44.aBoolean204) {
				@Pc(304) int local304 = super.anInt4154 >> 12;
				local261 = super.anInt4155 >> 12;
				@Pc(318) Class55 local318;
				if (local58.aClass14_Sub1_Sub3_1 != null) {
					local318 = local58.aClass14_Sub1_Sub3_1.method7999(arg0);
					if (local318 != null && local318.method1166(local18, local261, local304)) {
						this.method3780();
						return;
					}
				}
				if (local58.aClass14_Sub1_Sub3_2 != null) {
					local318 = local58.aClass14_Sub1_Sub3_2.method7999(arg0);
					if (local318 != null && local318.method1166(local18, local261, local304)) {
						this.method3780();
						return;
					}
				}
				if (local58.aClass14_Sub1_Sub5_1 != null) {
					local318 = local58.aClass14_Sub1_Sub5_1.method7999(arg0);
					if (local318 != null && local318.method1166(local18, local261, local304)) {
						this.method3780();
						return;
					}
				}
				for (@Pc(375) Class66 local375 = local58.aClass66_2; local375 != null; local375 = local375.aClass66_1) {
					@Pc(382) Class55 local382 = local375.aClass14_Sub1_Sub1_1.method7999(arg0);
					if (local382 != null && local382.method1166(local18, local261, local304)) {
						this.method3780();
						return;
					}
				}
			}
			local40.aClass345_1.aClass42_1.method856(this);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(JI)V")
	public void method3782(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort69 = (short) (this.aShort69 - arg1);
		if (this.aShort69 <= 0) {
			this.method3780();
			return;
		}
		@Pc(17) int local17 = super.anInt4154 >> 12;
		@Pc(22) int local22 = super.anInt4151 >> 12;
		@Pc(27) int local27 = super.anInt4155 >> 12;
		@Pc(31) Class14_Sub8 local31 = this.aClass14_Sub7_1.aClass14_Sub8_6;
		@Pc(35) Class107 local35 = this.aClass14_Sub7_1.aClass107_1;
		if (local35.anInt2446 != 0) {
			@Pc(65) int local65;
			if (this.aShort70 - this.aShort69 <= local35.anInt2454) {
				local65 = (super.anInt4157 >> 8 & 0xFF00) + (this.anInt4160 >> 16 & 0xFF) + local35.anInt2500 * arg1;
				@Pc(82) int local82 = (super.anInt4157 & 0xFF00) + (this.anInt4160 >> 8 & 0xFF) + local35.anInt2468 * arg1;
				@Pc(99) int local99 = ((super.anInt4157 & 0xFF) << 8) + (this.anInt4160 & 0xFF) + local35.anInt2497 * arg1;
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
				super.anInt4157 &= 0xFF000000;
				super.anInt4157 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4160 &= 0xFF000000;
				this.anInt4160 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort70 - this.aShort69 <= local35.anInt2488) {
				local65 = (super.anInt4157 >> 16 & 0xFF00) + (this.anInt4160 >> 24 & 0xFF) + local35.anInt2480 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4157 &= 0xFFFFFF;
				super.anInt4157 |= (local65 & 0xFF00) << 16;
				this.anInt4160 &= 0xFFFFFF;
				this.anInt4160 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2492 != -1 && this.aShort70 - this.aShort69 <= local35.anInt2463) {
			this.anInt4159 += local35.anInt2495 * arg1;
		}
		if (local35.anInt2477 != -1 && this.aShort70 - this.aShort69 <= local35.anInt2467) {
			super.anInt4156 += local35.anInt2462 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort66;
		@Pc(300) double local300 = (double) this.aShort67;
		@Pc(304) double local304 = (double) this.aShort68;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt2456 == 1) {
			local317 = local17 - this.aClass14_Sub7_1.aClass118_1.anInt3097;
			local324 = local22 - this.aClass14_Sub7_1.aClass118_1.anInt3092;
			local331 = local27 - this.aClass14_Sub7_1.aClass118_1.anInt3100;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt2466 * local348 * arg1);
			this.anInt4159 = (int) ((long) this.anInt4159 - ((long) this.anInt4159 * local356 >> 18));
		} else if (local35.anInt2456 == 2) {
			local317 = local17 - this.aClass14_Sub7_1.aClass118_1.anInt3097;
			local324 = local22 - this.aClass14_Sub7_1.aClass118_1.anInt3092;
			local331 = local27 - this.aClass14_Sub7_1.aClass118_1.anInt3100;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt2466 * local348 * arg1);
			this.anInt4159 = (int) ((long) this.anInt4159 - ((long) this.anInt4159 * local356 >> 28));
		}
		if (local35.anIntArray200 != null) {
			@Pc(437) Class5 local437 = local31.aClass306_19.aClass5_235;
			for (@Pc(440) Class5 local440 = local437.aClass5_299; local440 != local437; local440 = local440.aClass5_299) {
				@Pc(444) Class5_Sub4_Sub18 local444 = (Class5_Sub4_Sub18) local440;
				@Pc(447) Class313 local447 = local444.aClass313_1;
				if (local447.anInt8618 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray200.length; local455++) {
						if (local35.anIntArray200[local455] == local447.anInt8623) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt8979);
						@Pc(486) double local486 = (double) (local22 - local444.anInt8980);
						@Pc(492) double local492 = (double) (local27 - local444.anInt8975);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong229)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt8976 + local486 * (double) local447.anInt8612 + local492 * (double) local444.anInt8973) * 65535.0D / ((double) local447.anInt8613 * local513);
							if (!(local545 < (double) local447.anInt8619)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt8608 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt8624;
								} else if (local447.anInt8608 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt8624;
								}
								if (local447.anInt8611 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt8613;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt8613;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt8613;
									if (local447.anInt8622 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt4154 = (int) ((double) super.anInt4154 + local678 * (double) arg1);
										super.anInt4151 = (int) ((double) super.anInt4151 + local686 * (double) arg1);
										super.anInt4155 = (int) ((double) super.anInt4155 + local694 * (double) arg1);
									}
								} else if (local447.anInt8622 == 0) {
									local296 += ((double) local444.anInt8976 - local553) * (double) arg1;
									local300 += ((double) local447.anInt8612 - local553) * (double) arg1;
									local304 += ((double) local444.anInt8973 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt4154 = (int) ((double) super.anInt4154 + ((double) local444.anInt8976 - local553) * (double) arg1);
									super.anInt4151 = (int) ((double) super.anInt4151 + ((double) local447.anInt8612 - local553) * (double) arg1);
									super.anInt4155 = (int) ((double) super.anInt4155 + ((double) local444.anInt8973 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray198 != null) {
			for (local317 = 0; local317 < local35.anIntArray198.length; local317++) {
				@Pc(776) Class5_Sub4_Sub18 local776 = (Class5_Sub4_Sub18) Static89.aClass197_1.method4404((long) local35.anIntArray198[local317]);
				while (local776 != null) {
					@Pc(780) Class313 local780 = local776.aClass313_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt8979);
					@Pc(792) double local792 = (double) (local22 - local776.anInt8980);
					@Pc(798) double local798 = (double) (local27 - local776.anInt8975);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong229) {
						local776 = (Class5_Sub4_Sub18) Static89.aClass197_1.method4401();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt8976 + local792 * (double) local780.anInt8612 + local798 * (double) local776.anInt8973) * 65535.0D / ((double) local780.anInt8613 * local825);
						if (local857 < (double) local780.anInt8619) {
							local776 = (Class5_Sub4_Sub18) Static89.aClass197_1.method4401();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt8608 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt8624;
							} else if (local780.anInt8608 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt8624;
							}
							if (local780.anInt8611 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt8613;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt8613;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt8613;
								if (local780.anInt8622 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt4154 = (int) ((double) super.anInt4154 + local996 * (double) arg1);
									super.anInt4151 = (int) ((double) super.anInt4151 + local1004 * (double) arg1);
									super.anInt4155 = (int) ((double) super.anInt4155 + local1012 * (double) arg1);
								}
							} else if (local780.anInt8622 == 0) {
								local296 += ((double) local776.anInt8976 - local871) * (double) arg1;
								local300 += ((double) local780.anInt8612 - local871) * (double) arg1;
								local304 += ((double) local776.anInt8973 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt4154 = (int) ((double) super.anInt4154 + ((double) local776.anInt8976 - local871) * (double) arg1);
								super.anInt4151 = (int) ((double) super.anInt4151 + ((double) local780.anInt8612 - local871) * (double) arg1);
								super.anInt4155 = (int) ((double) super.anInt4155 + ((double) local776.anInt8973 - local871) * (double) arg1);
							}
							local776 = (Class5_Sub4_Sub18) Static89.aClass197_1.method4401();
						}
					}
				}
			}
		}
		if (local35.anIntArray199 != null) {
			if (local35.anIntArray197 == null) {
				local35.anIntArray197 = new int[local35.anIntArray199.length];
				for (local317 = 0; local317 < local35.anIntArray199.length; local317++) {
					Static584.method8185(local35.anIntArray199[local317]);
					local35.anIntArray197[local317] = ((Class5_Sub41) Static242.aClass81_37.method1599((long) local35.anIntArray199[local317])).anInt7411;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray197.length; local317++) {
				@Pc(1137) Class313 local1137 = Static36.aClass313Array1[local35.anIntArray197[local317]];
				if (local1137.anInt8622 == 0) {
					local296 += (double) (local1137.anInt8617 * arg1);
					local300 += (double) (local1137.anInt8612 * arg1);
					local304 += (double) (local1137.anInt8620 * arg1);
					local306 = true;
				} else {
					super.anInt4154 += local1137.anInt8617 * arg1;
					super.anInt4151 += local1137.anInt8612 * arg1;
					super.anInt4155 += local1137.anInt8620 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort66 = (short) (int) local296;
					this.aShort67 = (short) (int) local300;
					this.aShort68 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt4159 <<= 0x1;
			}
		}
		super.anInt4154 = (int) ((long) super.anInt4154 + ((long) this.aShort66 * (long) (this.anInt4159 << 2) >> 23) * (long) arg1);
		super.anInt4151 = (int) ((long) super.anInt4151 + ((long) this.aShort67 * (long) (this.anInt4159 << 2) >> 23) * (long) arg1);
		super.anInt4155 = (int) ((long) super.anInt4155 + ((long) this.aShort68 * (long) (this.anInt4159 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!ij;IIIIIIIIIIIZZ)V")
	public void method3783(@OriginalArg(0) Class14_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass14_Sub7_1 = arg0;
		super.anInt4154 = arg1 << 12;
		super.anInt4151 = arg2 << 12;
		super.anInt4155 = arg3 << 12;
		super.anInt4157 = arg9;
		this.aShort70 = this.aShort69 = (short) arg8;
		super.anInt4156 = arg10;
		super.anInt4158 = arg11;
		super.aBoolean341 = arg13;
		this.aShort66 = (short) arg4;
		this.aShort67 = (short) arg5;
		this.aShort68 = (short) arg6;
		this.anInt4159 = arg7;
		super.aByte81 = this.aClass14_Sub7_1.aClass57_2.aByte18;
		this.method3784();
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "()V")
	private void method3784() {
		@Pc(4) int local4 = this.aClass14_Sub7_1.aClass14_Sub8_6.anInt4865;
		if (this.aClass14_Sub7_1.aClass14_Sub8_6.aClass14_Sub2_Sub2_Sub1Array7[local4] != null) {
			this.aClass14_Sub7_1.aClass14_Sub8_6.aClass14_Sub2_Sub2_Sub1Array7[local4].method3780();
		}
		this.aClass14_Sub7_1.aClass14_Sub8_6.aClass14_Sub2_Sub2_Sub1Array7[local4] = this;
		this.aShort65 = (short) this.aClass14_Sub7_1.aClass14_Sub8_6.anInt4865;
		this.aClass14_Sub7_1.aClass14_Sub8_6.anInt4865 = local4 + 1 & 0x1FFF;
		this.aClass14_Sub7_1.aClass363_5.method8480(this);
	}
}
