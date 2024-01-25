import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public final class Class2_Sub6_Sub1_Sub1 extends Class2_Sub6_Sub1 {

	@OriginalMember(owner = "client!fja", name = "J", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!fja", name = "K", descriptor = "I")
	private int anInt2700;

	@OriginalMember(owner = "client!fja", name = "I", descriptor = "Lclient!bia;")
	public Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!fja", name = "M", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!fja", name = "N", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!fja", name = "L", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!fja", name = "Q", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!fja", name = "P", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!fja", name = "O", descriptor = "I")
	private int anInt2701;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lclient!bia;IIIIIIIIIIIZZ)V")
	public Class2_Sub6_Sub1_Sub1(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass2_Sub3_1 = arg0;
		super.anInt2695 = arg1 << 12;
		super.anInt2698 = arg2 << 12;
		super.anInt2694 = arg3 << 12;
		super.anInt2699 = arg9;
		this.aShort39 = this.aShort38 = (short) arg8;
		super.anInt2692 = arg10;
		super.anInt2693 = arg11;
		super.aBoolean168 = arg13;
		this.aShort37 = (short) arg4;
		this.aShort41 = (short) arg5;
		this.aShort40 = (short) arg6;
		this.anInt2701 = arg7;
		super.aByte47 = this.aClass2_Sub3_1.aClass100_1.aByte44;
		this.method2279();
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method2276(@OriginalArg(0) Class132 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2695 >> Static185.anInt3178 + 12;
		@Pc(13) int local13 = super.anInt2694 >> Static185.anInt3178 + 12;
		@Pc(18) int local18 = super.anInt2698 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static209.anInt3602 || local13 < 0 || local13 >= Static245.anInt4308) {
			this.method2278();
			return;
		}
		@Pc(40) Class2_Sub8 local40 = this.aClass2_Sub3_1.aClass2_Sub8_1;
		@Pc(44) Class117 local44 = this.aClass2_Sub3_1.aClass117_1;
		@Pc(46) Class12[] local46 = Static289.aClass12Array3;
		@Pc(49) int local49 = local40.anInt4904;
		@Pc(58) Class351 local58 = Static441.aClass351ArrayArrayArray1[local40.anInt4904][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte139;
		}
		@Pc(71) int local71 = local46[local49].method7846(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static633.anInt10310 - 1) {
			local86 = local46[local49 + 1].method7846(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static185.anInt3178);
		}
		if (local44.aBoolean181) {
			if (local44.anInt2911 == -1 && local18 > local71) {
				this.method2278();
				return;
			}
			if (local44.anInt2911 >= 0 && local18 > local46[local44.anInt2911].method7846(local6, local13)) {
				this.method2278();
				return;
			}
			if (local44.anInt2950 == -1 && local18 < local86) {
				this.method2278();
				return;
			}
			if (local44.anInt2950 >= 0 && local18 < local46[local44.anInt2950 + 1].method7846(local6, local13)) {
				this.method2278();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static633.anInt10310 - 1; local154 > 0 && local18 > local46[local154].method7846(local6, local13); local154--) {
		}
		if (local44.aBoolean183 && local154 == 0 && local18 > local46[0].method7846(local6, local13)) {
			this.method2278();
		} else if (local154 == Static633.anInt10310 - 1 && local46[local154].method7846(local6, local13) - local18 > 0x8 << Static185.anInt3178) {
			this.method2278();
		} else {
			local58 = Static441.aClass351ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static441.aClass351ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static441.aClass351ArrayArrayArray1[0][local6][local13] = new Class351(0);
				}
				@Pc(251) boolean local251 = Static441.aClass351ArrayArrayArray1[0][local6][local13].aClass351_1 != null;
				if (local154 == 3 && local251) {
					this.method2278();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static441.aClass351ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static441.aClass351ArrayArrayArray1[local261][local6][local13] = new Class351(local261);
						if (local251) {
							local58.aByte139++;
						}
					}
				}
			}
			if (local44.aBoolean179) {
				@Pc(304) int local304 = super.anInt2695 >> 12;
				local261 = super.anInt2694 >> 12;
				@Pc(318) Class338 local318;
				if (local58.aClass2_Sub1_Sub2_2 != null) {
					local318 = local58.aClass2_Sub1_Sub2_2.method8459(arg0);
					if (local318 != null && local318.method7982(local304, local261, local18)) {
						this.method2278();
						return;
					}
				}
				if (local58.aClass2_Sub1_Sub2_1 != null) {
					local318 = local58.aClass2_Sub1_Sub2_1.method8459(arg0);
					if (local318 != null && local318.method7982(local304, local261, local18)) {
						this.method2278();
						return;
					}
				}
				if (local58.aClass2_Sub1_Sub3_1 != null) {
					local318 = local58.aClass2_Sub1_Sub3_1.method8459(arg0);
					if (local318 != null && local318.method7982(local304, local261, local18)) {
						this.method2278();
						return;
					}
				}
				for (@Pc(375) Class67 local375 = local58.aClass67_3; local375 != null; local375 = local375.aClass67_1) {
					@Pc(382) Class338 local382 = local375.aClass2_Sub1_Sub1_1.method8459(arg0);
					if (local382 != null && local382.method7982(local304, local261, local18)) {
						this.method2278();
						return;
					}
				}
			}
			local40.aClass137_1.aClass333_1.method7904(this);
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(JI)V")
	public void method2277(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort38 = (short) (this.aShort38 - arg1);
		if (this.aShort38 <= 0) {
			this.method2278();
			return;
		}
		@Pc(17) int local17 = super.anInt2695 >> 12;
		@Pc(22) int local22 = super.anInt2698 >> 12;
		@Pc(27) int local27 = super.anInt2694 >> 12;
		@Pc(31) Class2_Sub8 local31 = this.aClass2_Sub3_1.aClass2_Sub8_1;
		@Pc(35) Class117 local35 = this.aClass2_Sub3_1.aClass117_1;
		if (local35.anInt2918 != 0) {
			@Pc(65) int local65;
			if (this.aShort39 - this.aShort38 <= local35.anInt2926) {
				local65 = (super.anInt2699 >> 8 & 0xFF00) + (this.anInt2700 >> 16 & 0xFF) + local35.anInt2916 * arg1;
				@Pc(82) int local82 = (super.anInt2699 & 0xFF00) + (this.anInt2700 >> 8 & 0xFF) + local35.anInt2940 * arg1;
				@Pc(99) int local99 = ((super.anInt2699 & 0xFF) << 8) + (this.anInt2700 & 0xFF) + local35.anInt2951 * arg1;
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
				super.anInt2699 &= 0xFF000000;
				super.anInt2699 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2700 &= 0xFF000000;
				this.anInt2700 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort39 - this.aShort38 <= local35.anInt2931) {
				local65 = (super.anInt2699 >> 16 & 0xFF00) + (this.anInt2700 >> 24 & 0xFF) + local35.anInt2944 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2699 &= 0xFFFFFF;
				super.anInt2699 |= (local65 & 0xFF00) << 16;
				this.anInt2700 &= 0xFFFFFF;
				this.anInt2700 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2961 != -1 && this.aShort39 - this.aShort38 <= local35.anInt2935) {
			this.anInt2701 += local35.anInt2921 * arg1;
		}
		if (local35.anInt2922 != -1 && this.aShort39 - this.aShort38 <= local35.anInt2962) {
			super.anInt2692 += local35.anInt2919 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort37;
		@Pc(300) double local300 = (double) this.aShort41;
		@Pc(304) double local304 = (double) this.aShort40;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt2938 == 1) {
			local317 = local17 - this.aClass2_Sub3_1.aClass334_1.anInt9375;
			local324 = local22 - this.aClass2_Sub3_1.aClass334_1.anInt9381;
			local331 = local27 - this.aClass2_Sub3_1.aClass334_1.anInt9377;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt2948 * local348 * arg1);
			this.anInt2701 = (int) ((long) this.anInt2701 - ((long) this.anInt2701 * local356 >> 18));
		} else if (local35.anInt2938 == 2) {
			local317 = local17 - this.aClass2_Sub3_1.aClass334_1.anInt9375;
			local324 = local22 - this.aClass2_Sub3_1.aClass334_1.anInt9381;
			local331 = local27 - this.aClass2_Sub3_1.aClass334_1.anInt9377;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt2948 * local348 * arg1);
			this.anInt2701 = (int) ((long) this.anInt2701 - ((long) this.anInt2701 * local356 >> 28));
		}
		if (local35.anIntArray158 != null) {
			@Pc(437) Class6 local437 = local31.aClass362_21.aClass6_312;
			for (@Pc(440) Class6 local440 = local437.aClass6_338; local440 != local437; local440 = local440.aClass6_338) {
				@Pc(444) Class6_Sub4_Sub3 local444 = (Class6_Sub4_Sub3) local440;
				@Pc(447) Class99 local447 = local444.aClass99_1;
				if (local447.anInt2468 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray158.length; local455++) {
						if (local35.anIntArray158[local455] == local447.anInt2463) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt1352);
						@Pc(486) double local486 = (double) (local22 - local444.anInt1353);
						@Pc(492) double local492 = (double) (local27 - local444.anInt1357);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong80)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt1356 + local486 * (double) local447.anInt2474 + local492 * (double) local444.anInt1354) * 65535.0D / ((double) local447.anInt2475 * local513);
							if (!(local545 < (double) local447.anInt2461)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt2464 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt2471;
								} else if (local447.anInt2464 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt2471;
								}
								if (local447.anInt2465 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt2475;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt2475;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt2475;
									if (local447.anInt2466 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt2695 = (int) ((double) super.anInt2695 + local678 * (double) arg1);
										super.anInt2698 = (int) ((double) super.anInt2698 + local686 * (double) arg1);
										super.anInt2694 = (int) ((double) super.anInt2694 + local694 * (double) arg1);
									}
								} else if (local447.anInt2466 == 0) {
									local296 += ((double) local444.anInt1356 - local553) * (double) arg1;
									local300 += ((double) local447.anInt2474 - local553) * (double) arg1;
									local304 += ((double) local444.anInt1354 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt2695 = (int) ((double) super.anInt2695 + ((double) local444.anInt1356 - local553) * (double) arg1);
									super.anInt2698 = (int) ((double) super.anInt2698 + ((double) local447.anInt2474 - local553) * (double) arg1);
									super.anInt2694 = (int) ((double) super.anInt2694 + ((double) local444.anInt1354 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray160 != null) {
			for (local317 = 0; local317 < local35.anIntArray160.length; local317++) {
				@Pc(776) Class6_Sub4_Sub3 local776 = (Class6_Sub4_Sub3) Static263.aClass263_1.method6428((long) local35.anIntArray160[local317]);
				while (local776 != null) {
					@Pc(780) Class99 local780 = local776.aClass99_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt1352);
					@Pc(792) double local792 = (double) (local22 - local776.anInt1353);
					@Pc(798) double local798 = (double) (local27 - local776.anInt1357);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong80) {
						local776 = (Class6_Sub4_Sub3) Static263.aClass263_1.method6426();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt1356 + local792 * (double) local780.anInt2474 + local798 * (double) local776.anInt1354) * 65535.0D / ((double) local780.anInt2475 * local825);
						if (local857 < (double) local780.anInt2461) {
							local776 = (Class6_Sub4_Sub3) Static263.aClass263_1.method6426();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt2464 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt2471;
							} else if (local780.anInt2464 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt2471;
							}
							if (local780.anInt2465 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt2475;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt2475;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt2475;
								if (local780.anInt2466 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt2695 = (int) ((double) super.anInt2695 + local996 * (double) arg1);
									super.anInt2698 = (int) ((double) super.anInt2698 + local1004 * (double) arg1);
									super.anInt2694 = (int) ((double) super.anInt2694 + local1012 * (double) arg1);
								}
							} else if (local780.anInt2466 == 0) {
								local296 += ((double) local776.anInt1356 - local871) * (double) arg1;
								local300 += ((double) local780.anInt2474 - local871) * (double) arg1;
								local304 += ((double) local776.anInt1354 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt2695 = (int) ((double) super.anInt2695 + ((double) local776.anInt1356 - local871) * (double) arg1);
								super.anInt2698 = (int) ((double) super.anInt2698 + ((double) local780.anInt2474 - local871) * (double) arg1);
								super.anInt2694 = (int) ((double) super.anInt2694 + ((double) local776.anInt1354 - local871) * (double) arg1);
							}
							local776 = (Class6_Sub4_Sub3) Static263.aClass263_1.method6426();
						}
					}
				}
			}
		}
		if (local35.anIntArray161 != null) {
			if (local35.anIntArray159 == null) {
				local35.anIntArray159 = new int[local35.anIntArray161.length];
				for (local317 = 0; local317 < local35.anIntArray161.length; local317++) {
					Static199.method2914(local35.anIntArray161[local317]);
					local35.anIntArray159[local317] = ((Class6_Sub36) Static402.aClass209_39.method5038((long) local35.anIntArray161[local317])).anInt5996;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray159.length; local317++) {
				@Pc(1137) Class99 local1137 = Static656.aClass99Array1[local35.anIntArray159[local317]];
				if (local1137.anInt2466 == 0) {
					local296 += (double) (local1137.anInt2470 * arg1);
					local300 += (double) (local1137.anInt2474 * arg1);
					local304 += (double) (local1137.anInt2459 * arg1);
					local306 = true;
				} else {
					super.anInt2695 += local1137.anInt2470 * arg1;
					super.anInt2698 += local1137.anInt2474 * arg1;
					super.anInt2694 += local1137.anInt2459 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort37 = (short) (int) local296;
					this.aShort41 = (short) (int) local300;
					this.aShort40 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt2701 <<= 0x1;
			}
		}
		super.anInt2695 = (int) ((long) super.anInt2695 + ((long) this.aShort37 * (long) (this.anInt2701 << 2) >> 23) * (long) arg1);
		super.anInt2698 = (int) ((long) super.anInt2698 + ((long) this.aShort41 * (long) (this.anInt2701 << 2) >> 23) * (long) arg1);
		super.anInt2694 = (int) ((long) super.anInt2694 + ((long) this.aShort40 * (long) (this.anInt2701 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "()V")
	public void method2278() {
		this.aClass2_Sub3_1.aClass2_Sub8_1.aClass2_Sub6_Sub1_Sub1Array2[this.aShort36] = null;
		Static143.aClass2_Sub6_Sub1_Sub1Array1[Static69.anInt1273] = this;
		Static69.anInt1273 = Static69.anInt1273 + 1 & 0x3FF;
		this.method8436();
		this.method5184();
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "()V")
	private void method2279() {
		@Pc(4) int local4 = this.aClass2_Sub3_1.aClass2_Sub8_1.anInt4902;
		if (this.aClass2_Sub3_1.aClass2_Sub8_1.aClass2_Sub6_Sub1_Sub1Array2[local4] != null) {
			this.aClass2_Sub3_1.aClass2_Sub8_1.aClass2_Sub6_Sub1_Sub1Array2[local4].method2278();
		}
		this.aClass2_Sub3_1.aClass2_Sub8_1.aClass2_Sub6_Sub1_Sub1Array2[local4] = this;
		this.aShort36 = (short) this.aClass2_Sub3_1.aClass2_Sub8_1.anInt4902;
		this.aClass2_Sub3_1.aClass2_Sub8_1.anInt4902 = local4 + 1 & 0x1FFF;
		this.aClass2_Sub3_1.aClass43_1.method1084(this);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!bia;IIIIIIIIIIIZZ)V")
	public void method2280(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass2_Sub3_1 = arg0;
		super.anInt2695 = arg1 << 12;
		super.anInt2698 = arg2 << 12;
		super.anInt2694 = arg3 << 12;
		super.anInt2699 = arg9;
		this.aShort39 = this.aShort38 = (short) arg8;
		super.anInt2692 = arg10;
		super.anInt2693 = arg11;
		super.aBoolean168 = arg13;
		this.aShort37 = (short) arg4;
		this.aShort41 = (short) arg5;
		this.aShort40 = (short) arg6;
		this.anInt2701 = arg7;
		super.aByte47 = this.aClass2_Sub3_1.aClass100_1.aByte44;
		this.method2279();
	}
}
