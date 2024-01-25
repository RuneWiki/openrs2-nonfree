import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class60_Sub2_Sub1_Sub1 extends Class60_Sub2_Sub1 {

	@OriginalMember(owner = "client!ks", name = "H", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
	private int anInt5630;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "Lclient!md;")
	public Class60_Sub7 aClass60_Sub7_1;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	private int anInt5629;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!md;IIIIIIIIIIIZZ)V")
	public Class60_Sub2_Sub1_Sub1(@OriginalArg(0) Class60_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass60_Sub7_1 = arg0;
		super.anInt5624 = arg1 << 12;
		super.anInt5625 = arg2 << 12;
		super.anInt5627 = arg3 << 12;
		super.anInt5621 = arg9;
		this.aShort57 = this.aShort61 = (short) arg8;
		super.anInt5628 = arg10;
		super.anInt5623 = arg11;
		super.aBoolean420 = arg13;
		this.aShort56 = (short) arg4;
		this.aShort60 = (short) arg5;
		this.aShort58 = (short) arg6;
		this.anInt5629 = arg7;
		super.aByte84 = this.aClass60_Sub7_1.aClass216_2.aByte86;
		this.method5110();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method5108(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt5624 >> Static594.anInt9440 + 12;
		@Pc(13) int local13 = super.anInt5627 >> Static594.anInt9440 + 12;
		@Pc(18) int local18 = super.anInt5625 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static230.anInt4470 || local13 < 0 || local13 >= Static63.anInt777) {
			this.method5111();
			return;
		}
		@Pc(40) Class60_Sub4 local40 = this.aClass60_Sub7_1.aClass60_Sub4_5;
		@Pc(44) Class280 local44 = this.aClass60_Sub7_1.aClass280_1;
		@Pc(46) Class96[] local46 = Static555.aClass96Array3;
		@Pc(49) int local49 = local40.anInt5035;
		@Pc(58) Class243 local58 = Static334.aClass243ArrayArrayArray2[local40.anInt5035][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte97;
		}
		@Pc(71) int local71 = local46[local49].method8080(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static66.anInt802 - 1) {
			local86 = local46[local49 + 1].method8080(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static594.anInt9440);
		}
		if (local44.aBoolean598) {
			if (local44.anInt7845 == -1 && local18 > local71) {
				this.method5111();
				return;
			}
			if (local44.anInt7845 >= 0 && local18 > local46[local44.anInt7845].method8080(local6, local13)) {
				this.method5111();
				return;
			}
			if (local44.anInt7849 == -1 && local18 < local86) {
				this.method5111();
				return;
			}
			if (local44.anInt7849 >= 0 && local18 < local46[local44.anInt7849 + 1].method8080(local6, local13)) {
				this.method5111();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static66.anInt802 - 1; local154 > 0 && local18 > local46[local154].method8080(local6, local13); local154--) {
		}
		if (local44.aBoolean596 && local154 == 0 && local18 > local46[0].method8080(local6, local13)) {
			this.method5111();
		} else if (local154 == Static66.anInt802 - 1 && local46[local154].method8080(local6, local13) - local18 > 0x8 << Static594.anInt9440) {
			this.method5111();
		} else {
			local58 = Static334.aClass243ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static334.aClass243ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static334.aClass243ArrayArrayArray2[0][local6][local13] = new Class243(0);
				}
				@Pc(251) boolean local251 = Static334.aClass243ArrayArrayArray2[0][local6][local13].aClass243_1 != null;
				if (local154 == 3 && local251) {
					this.method5111();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static334.aClass243ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static334.aClass243ArrayArrayArray2[local261][local6][local13] = new Class243(local261);
						if (local251) {
							local58.aByte97++;
						}
					}
				}
			}
			if (local44.aBoolean593) {
				@Pc(304) int local304 = super.anInt5624 >> 12;
				local261 = super.anInt5627 >> 12;
				@Pc(318) Class323 local318;
				if (local58.aClass60_Sub1_Sub3_1 != null) {
					local318 = local58.aClass60_Sub1_Sub3_1.method7924(arg0);
					if (local318 != null && local318.method7722(local304, local261, local18)) {
						this.method5111();
						return;
					}
				}
				if (local58.aClass60_Sub1_Sub3_2 != null) {
					local318 = local58.aClass60_Sub1_Sub3_2.method7924(arg0);
					if (local318 != null && local318.method7722(local304, local261, local18)) {
						this.method5111();
						return;
					}
				}
				if (local58.aClass60_Sub1_Sub2_1 != null) {
					local318 = local58.aClass60_Sub1_Sub2_1.method7924(arg0);
					if (local318 != null && local318.method7722(local304, local261, local18)) {
						this.method5111();
						return;
					}
				}
				for (@Pc(375) Class123 local375 = local58.aClass123_5; local375 != null; local375 = local375.aClass123_1) {
					@Pc(382) Class323 local382 = local375.aClass60_Sub1_Sub1_1.method7924(arg0);
					if (local382 != null && local382.method7722(local304, local261, local18)) {
						this.method5111();
						return;
					}
				}
			}
			local40.aClass209_1.aClass46_1.method674(this);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!md;IIIIIIIIIIIZZ)V")
	public void method5109(@OriginalArg(0) Class60_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass60_Sub7_1 = arg0;
		super.anInt5624 = arg1 << 12;
		super.anInt5625 = arg2 << 12;
		super.anInt5627 = arg3 << 12;
		super.anInt5621 = arg9;
		this.aShort57 = this.aShort61 = (short) arg8;
		super.anInt5628 = arg10;
		super.anInt5623 = arg11;
		super.aBoolean420 = arg13;
		this.aShort56 = (short) arg4;
		this.aShort60 = (short) arg5;
		this.aShort58 = (short) arg6;
		this.anInt5629 = arg7;
		super.aByte84 = this.aClass60_Sub7_1.aClass216_2.aByte86;
		this.method5110();
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "()V")
	private void method5110() {
		@Pc(4) int local4 = this.aClass60_Sub7_1.aClass60_Sub4_5.anInt5032;
		if (this.aClass60_Sub7_1.aClass60_Sub4_5.aClass60_Sub2_Sub1_Sub1Array2[local4] != null) {
			this.aClass60_Sub7_1.aClass60_Sub4_5.aClass60_Sub2_Sub1_Sub1Array2[local4].method5111();
		}
		this.aClass60_Sub7_1.aClass60_Sub4_5.aClass60_Sub2_Sub1_Sub1Array2[local4] = this;
		this.aShort59 = (short) this.aClass60_Sub7_1.aClass60_Sub4_5.anInt5032;
		this.aClass60_Sub7_1.aClass60_Sub4_5.anInt5032 = local4 + 1 & 0x1FFF;
		this.aClass60_Sub7_1.aClass385_5.method8779(this);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
	public void method5111() {
		this.aClass60_Sub7_1.aClass60_Sub4_5.aClass60_Sub2_Sub1_Sub1Array2[this.aShort59] = null;
		Static155.aClass60_Sub2_Sub1_Sub1Array1[Static619.anInt9779] = this;
		Static619.anInt9779 = Static619.anInt9779 + 1 & 0x3FF;
		this.method8914();
		this.method7096();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(JI)V")
	public void method5112(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort61 = (short) (this.aShort61 - arg1);
		if (this.aShort61 <= 0) {
			this.method5111();
			return;
		}
		@Pc(17) int local17 = super.anInt5624 >> 12;
		@Pc(22) int local22 = super.anInt5625 >> 12;
		@Pc(27) int local27 = super.anInt5627 >> 12;
		@Pc(31) Class60_Sub4 local31 = this.aClass60_Sub7_1.aClass60_Sub4_5;
		@Pc(35) Class280 local35 = this.aClass60_Sub7_1.aClass280_1;
		if (local35.anInt7833 != 0) {
			@Pc(65) int local65;
			if (this.aShort57 - this.aShort61 <= local35.anInt7823) {
				local65 = (super.anInt5621 >> 8 & 0xFF00) + (this.anInt5630 >> 16 & 0xFF) + local35.anInt7859 * arg1;
				@Pc(82) int local82 = (super.anInt5621 & 0xFF00) + (this.anInt5630 >> 8 & 0xFF) + local35.anInt7838 * arg1;
				@Pc(99) int local99 = ((super.anInt5621 & 0xFF) << 8) + (this.anInt5630 & 0xFF) + local35.anInt7842 * arg1;
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
				super.anInt5621 &= 0xFF000000;
				super.anInt5621 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5630 &= 0xFF000000;
				this.anInt5630 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort57 - this.aShort61 <= local35.anInt7862) {
				local65 = (super.anInt5621 >> 16 & 0xFF00) + (this.anInt5630 >> 24 & 0xFF) + local35.anInt7825 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5621 &= 0xFFFFFF;
				super.anInt5621 |= (local65 & 0xFF00) << 16;
				this.anInt5630 &= 0xFFFFFF;
				this.anInt5630 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt7831 != -1 && this.aShort57 - this.aShort61 <= local35.anInt7865) {
			this.anInt5629 += local35.anInt7829 * arg1;
		}
		if (local35.anInt7836 != -1 && this.aShort57 - this.aShort61 <= local35.anInt7863) {
			super.anInt5628 += local35.anInt7828 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort56;
		@Pc(300) double local300 = (double) this.aShort60;
		@Pc(304) double local304 = (double) this.aShort58;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt7867 == 1) {
			local317 = local17 - this.aClass60_Sub7_1.aClass345_1.anInt9437;
			local324 = local22 - this.aClass60_Sub7_1.aClass345_1.anInt9422;
			local331 = local27 - this.aClass60_Sub7_1.aClass345_1.anInt9423;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt7848 * local348 * arg1);
			this.anInt5629 = (int) ((long) this.anInt5629 - ((long) this.anInt5629 * local356 >> 18));
		} else if (local35.anInt7867 == 2) {
			local317 = local17 - this.aClass60_Sub7_1.aClass345_1.anInt9437;
			local324 = local22 - this.aClass60_Sub7_1.aClass345_1.anInt9422;
			local331 = local27 - this.aClass60_Sub7_1.aClass345_1.anInt9423;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt7848 * local348 * arg1);
			this.anInt5629 = (int) ((long) this.anInt5629 - ((long) this.anInt5629 * local356 >> 28));
		}
		if (local35.anIntArray496 != null) {
			@Pc(437) Class6 local437 = local31.aClass340_34.aClass6_283;
			for (@Pc(440) Class6 local440 = local437.aClass6_339; local440 != local437; local440 = local440.aClass6_339) {
				@Pc(444) Class6_Sub2_Sub14 local444 = (Class6_Sub2_Sub14) local440;
				@Pc(447) Class100 local447 = local444.aClass100_1;
				if (local447.anInt2656 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray496.length; local455++) {
						if (local35.anIntArray496[local455] == local447.anInt2657) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt6592);
						@Pc(486) double local486 = (double) (local22 - local444.anInt6587);
						@Pc(492) double local492 = (double) (local27 - local444.anInt6588);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong80)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt6594 + local486 * (double) local447.anInt2665 + local492 * (double) local444.anInt6593) * 65535.0D / ((double) local447.anInt2660 * local513);
							if (!(local545 < (double) local447.anInt2661)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt2668 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt2662;
								} else if (local447.anInt2668 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt2662;
								}
								if (local447.anInt2655 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt2660;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt2660;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt2660;
									if (local447.anInt2654 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt5624 = (int) ((double) super.anInt5624 + local678 * (double) arg1);
										super.anInt5625 = (int) ((double) super.anInt5625 + local686 * (double) arg1);
										super.anInt5627 = (int) ((double) super.anInt5627 + local694 * (double) arg1);
									}
								} else if (local447.anInt2654 == 0) {
									local296 += ((double) local444.anInt6594 - local553) * (double) arg1;
									local300 += ((double) local447.anInt2665 - local553) * (double) arg1;
									local304 += ((double) local444.anInt6593 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt5624 = (int) ((double) super.anInt5624 + ((double) local444.anInt6594 - local553) * (double) arg1);
									super.anInt5625 = (int) ((double) super.anInt5625 + ((double) local447.anInt2665 - local553) * (double) arg1);
									super.anInt5627 = (int) ((double) super.anInt5627 + ((double) local444.anInt6593 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray493 != null) {
			for (local317 = 0; local317 < local35.anIntArray493.length; local317++) {
				@Pc(776) Class6_Sub2_Sub14 local776 = (Class6_Sub2_Sub14) Static665.aClass88_1.method2181((long) local35.anIntArray493[local317]);
				while (local776 != null) {
					@Pc(780) Class100 local780 = local776.aClass100_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt6592);
					@Pc(792) double local792 = (double) (local22 - local776.anInt6587);
					@Pc(798) double local798 = (double) (local27 - local776.anInt6588);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong80) {
						local776 = (Class6_Sub2_Sub14) Static665.aClass88_1.method2182();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt6594 + local792 * (double) local780.anInt2665 + local798 * (double) local776.anInt6593) * 65535.0D / ((double) local780.anInt2660 * local825);
						if (local857 < (double) local780.anInt2661) {
							local776 = (Class6_Sub2_Sub14) Static665.aClass88_1.method2182();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt2668 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt2662;
							} else if (local780.anInt2668 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt2662;
							}
							if (local780.anInt2655 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt2660;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt2660;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt2660;
								if (local780.anInt2654 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt5624 = (int) ((double) super.anInt5624 + local996 * (double) arg1);
									super.anInt5625 = (int) ((double) super.anInt5625 + local1004 * (double) arg1);
									super.anInt5627 = (int) ((double) super.anInt5627 + local1012 * (double) arg1);
								}
							} else if (local780.anInt2654 == 0) {
								local296 += ((double) local776.anInt6594 - local871) * (double) arg1;
								local300 += ((double) local780.anInt2665 - local871) * (double) arg1;
								local304 += ((double) local776.anInt6593 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt5624 = (int) ((double) super.anInt5624 + ((double) local776.anInt6594 - local871) * (double) arg1);
								super.anInt5625 = (int) ((double) super.anInt5625 + ((double) local780.anInt2665 - local871) * (double) arg1);
								super.anInt5627 = (int) ((double) super.anInt5627 + ((double) local776.anInt6593 - local871) * (double) arg1);
							}
							local776 = (Class6_Sub2_Sub14) Static665.aClass88_1.method2182();
						}
					}
				}
			}
		}
		if (local35.anIntArray495 != null) {
			if (local35.anIntArray494 == null) {
				local35.anIntArray494 = new int[local35.anIntArray495.length];
				for (local317 = 0; local317 < local35.anIntArray495.length; local317++) {
					Static131.method2540(local35.anIntArray495[local317]);
					local35.anIntArray494[local317] = ((Class6_Sub6) Static460.aClass74_52.method1401((long) local35.anIntArray495[local317])).anInt482;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray494.length; local317++) {
				@Pc(1137) Class100 local1137 = Static35.aClass100Array1[local35.anIntArray494[local317]];
				if (local1137.anInt2654 == 0) {
					local296 += (double) (local1137.anInt2666 * arg1);
					local300 += (double) (local1137.anInt2665 * arg1);
					local304 += (double) (local1137.anInt2667 * arg1);
					local306 = true;
				} else {
					super.anInt5624 += local1137.anInt2666 * arg1;
					super.anInt5625 += local1137.anInt2665 * arg1;
					super.anInt5627 += local1137.anInt2667 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort56 = (short) (int) local296;
					this.aShort60 = (short) (int) local300;
					this.aShort58 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt5629 <<= 0x1;
			}
		}
		super.anInt5624 = (int) ((long) super.anInt5624 + ((long) this.aShort56 * (long) (this.anInt5629 << 2) >> 23) * (long) arg1);
		super.anInt5625 = (int) ((long) super.anInt5625 + ((long) this.aShort60 * (long) (this.anInt5629 << 2) >> 23) * (long) arg1);
		super.anInt5627 = (int) ((long) super.anInt5627 + ((long) this.aShort58 * (long) (this.anInt5629 << 2) >> 23) * (long) arg1);
	}
}
