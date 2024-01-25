import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class16_Sub6_Sub1_Sub1 extends Class16_Sub6_Sub1 {

	@OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
	private int anInt10133;

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "S")
	private short aShort125;

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "Lclient!eu;")
	public Class16_Sub2 aClass16_Sub2_1;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "S")
	private short aShort122;

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
	private int anInt10132;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!eu;IIIIIIIIIIIZZ)V")
	public Class16_Sub6_Sub1_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass16_Sub2_1 = arg0;
		super.anInt10126 = arg1 << 12;
		super.anInt10131 = arg2 << 12;
		super.anInt10130 = arg3 << 12;
		super.anInt10129 = arg9;
		this.aShort122 = this.aShort124 = (short) arg8;
		super.anInt10125 = arg10;
		super.anInt10127 = arg11;
		super.aBoolean730 = arg13;
		this.aShort123 = (short) arg4;
		this.aShort120 = (short) arg5;
		this.aShort121 = (short) arg6;
		this.anInt10132 = arg7;
		super.aByte133 = this.aClass16_Sub2_1.aClass287_1.aByte98;
		this.method8607();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()V")
	private void method8607() {
		@Pc(4) int local4 = this.aClass16_Sub2_1.aClass16_Sub7_4.anInt6872;
		if (this.aClass16_Sub2_1.aClass16_Sub7_4.aClass16_Sub6_Sub1_Sub1Array2[local4] != null) {
			this.aClass16_Sub2_1.aClass16_Sub7_4.aClass16_Sub6_Sub1_Sub1Array2[local4].method8610();
		}
		this.aClass16_Sub2_1.aClass16_Sub7_4.aClass16_Sub6_Sub1_Sub1Array2[local4] = this;
		this.aShort125 = (short) this.aClass16_Sub2_1.aClass16_Sub7_4.anInt6872;
		this.aClass16_Sub2_1.aClass16_Sub7_4.anInt6872 = local4 + 1 & 0x1FFF;
		this.aClass16_Sub2_1.aClass19_3.method566(this);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method8608(@OriginalArg(0) Class13 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt10126 >> Static326.anInt5713 + 12;
		@Pc(13) int local13 = super.anInt10130 >> Static326.anInt5713 + 12;
		@Pc(18) int local18 = super.anInt10131 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static595.anInt9881 || local13 < 0 || local13 >= Static389.anInt6693) {
			this.method8610();
			return;
		}
		@Pc(40) Class16_Sub7 local40 = this.aClass16_Sub2_1.aClass16_Sub7_4;
		@Pc(44) Class40 local44 = this.aClass16_Sub2_1.aClass40_1;
		@Pc(46) Class91[] local46 = Static511.aClass91Array3;
		@Pc(49) int local49 = local40.anInt6874;
		@Pc(58) Class84 local58 = Static348.aClass84ArrayArrayArray5[local40.anInt6874][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte42;
		}
		@Pc(71) int local71 = local46[local49].method7447(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static395.anInt6810 - 1) {
			local86 = local46[local49 + 1].method7447(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static326.anInt5713);
		}
		if (local44.aBoolean115) {
			if (local44.anInt1250 == -1 && local18 > local71) {
				this.method8610();
				return;
			}
			if (local44.anInt1250 >= 0 && local18 > local46[local44.anInt1250].method7447(local13, local6)) {
				this.method8610();
				return;
			}
			if (local44.anInt1259 == -1 && local18 < local86) {
				this.method8610();
				return;
			}
			if (local44.anInt1259 >= 0 && local18 < local46[local44.anInt1259 + 1].method7447(local13, local6)) {
				this.method8610();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static395.anInt6810 - 1; local154 > 0 && local18 > local46[local154].method7447(local13, local6); local154--) {
		}
		if (local44.aBoolean114 && local154 == 0 && local18 > local46[0].method7447(local13, local6)) {
			this.method8610();
		} else if (local154 == Static395.anInt6810 - 1 && local46[local154].method7447(local13, local6) - local18 > 0x8 << Static326.anInt5713) {
			this.method8610();
		} else {
			local58 = Static348.aClass84ArrayArrayArray5[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static348.aClass84ArrayArrayArray5[0][local6][local13] == null) {
					local58 = Static348.aClass84ArrayArrayArray5[0][local6][local13] = new Class84(0);
				}
				@Pc(251) boolean local251 = Static348.aClass84ArrayArrayArray5[0][local6][local13].aClass84_1 != null;
				if (local154 == 3 && local251) {
					this.method8610();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static348.aClass84ArrayArrayArray5[local261][local6][local13] == null) {
						local58 = Static348.aClass84ArrayArrayArray5[local261][local6][local13] = new Class84(local261);
						if (local251) {
							local58.aByte42++;
						}
					}
				}
			}
			if (local44.aBoolean117) {
				@Pc(304) int local304 = super.anInt10126 >> 12;
				local261 = super.anInt10130 >> 12;
				@Pc(318) Class379 local318;
				if (local58.aClass16_Sub1_Sub2_1 != null) {
					local318 = local58.aClass16_Sub1_Sub2_1.method6983(arg0);
					if (local318 != null && local318.method8751(local261, local304, local18)) {
						this.method8610();
						return;
					}
				}
				if (local58.aClass16_Sub1_Sub2_2 != null) {
					local318 = local58.aClass16_Sub1_Sub2_2.method6983(arg0);
					if (local318 != null && local318.method8751(local261, local304, local18)) {
						this.method8610();
						return;
					}
				}
				if (local58.aClass16_Sub1_Sub3_1 != null) {
					local318 = local58.aClass16_Sub1_Sub3_1.method6983(arg0);
					if (local318 != null && local318.method8751(local261, local304, local18)) {
						this.method8610();
						return;
					}
				}
				for (@Pc(375) Class333 local375 = local58.aClass333_1; local375 != null; local375 = local375.aClass333_3) {
					@Pc(382) Class379 local382 = local375.aClass16_Sub1_Sub1_1.method6983(arg0);
					if (local382 != null && local382.method8751(local261, local304, local18)) {
						this.method8610();
						return;
					}
				}
			}
			local40.aClass119_1.aClass202_1.method4752(this);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!eu;IIIIIIIIIIIZZ)V")
	public void method8609(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass16_Sub2_1 = arg0;
		super.anInt10126 = arg1 << 12;
		super.anInt10131 = arg2 << 12;
		super.anInt10130 = arg3 << 12;
		super.anInt10129 = arg9;
		this.aShort122 = this.aShort124 = (short) arg8;
		super.anInt10125 = arg10;
		super.anInt10127 = arg11;
		super.aBoolean730 = arg13;
		this.aShort123 = (short) arg4;
		this.aShort120 = (short) arg5;
		this.aShort121 = (short) arg6;
		this.anInt10132 = arg7;
		super.aByte133 = this.aClass16_Sub2_1.aClass287_1.aByte98;
		this.method8607();
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "()V")
	public void method8610() {
		this.aClass16_Sub2_1.aClass16_Sub7_4.aClass16_Sub6_Sub1_Sub1Array2[this.aShort125] = null;
		Static148.aClass16_Sub6_Sub1_Sub1Array1[Static265.anInt4974] = this;
		Static265.anInt4974 = Static265.anInt4974 + 1 & 0x3FF;
		this.method8874();
		this.method8603();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(JI)V")
	public void method8611(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort124 = (short) (this.aShort124 - arg1);
		if (this.aShort124 <= 0) {
			this.method8610();
			return;
		}
		@Pc(17) int local17 = super.anInt10126 >> 12;
		@Pc(22) int local22 = super.anInt10131 >> 12;
		@Pc(27) int local27 = super.anInt10130 >> 12;
		@Pc(31) Class16_Sub7 local31 = this.aClass16_Sub2_1.aClass16_Sub7_4;
		@Pc(35) Class40 local35 = this.aClass16_Sub2_1.aClass40_1;
		if (local35.anInt1256 != 0) {
			@Pc(65) int local65;
			if (this.aShort122 - this.aShort124 <= local35.anInt1283) {
				local65 = (super.anInt10129 >> 8 & 0xFF00) + (this.anInt10133 >> 16 & 0xFF) + local35.anInt1269 * arg1;
				@Pc(82) int local82 = (super.anInt10129 & 0xFF00) + (this.anInt10133 >> 8 & 0xFF) + local35.anInt1232 * arg1;
				@Pc(99) int local99 = ((super.anInt10129 & 0xFF) << 8) + (this.anInt10133 & 0xFF) + local35.anInt1270 * arg1;
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
				super.anInt10129 &= 0xFF000000;
				super.anInt10129 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt10133 &= 0xFF000000;
				this.anInt10133 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort122 - this.aShort124 <= local35.anInt1246) {
				local65 = (super.anInt10129 >> 16 & 0xFF00) + (this.anInt10133 >> 24 & 0xFF) + local35.anInt1273 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt10129 &= 0xFFFFFF;
				super.anInt10129 |= (local65 & 0xFF00) << 16;
				this.anInt10133 &= 0xFFFFFF;
				this.anInt10133 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1234 != -1 && this.aShort122 - this.aShort124 <= local35.anInt1263) {
			this.anInt10132 += local35.anInt1260 * arg1;
		}
		if (local35.anInt1257 != -1 && this.aShort122 - this.aShort124 <= local35.anInt1238) {
			super.anInt10125 += local35.anInt1249 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort123;
		@Pc(300) double local300 = (double) this.aShort120;
		@Pc(304) double local304 = (double) this.aShort121;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt1275 == 1) {
			local317 = local17 - this.aClass16_Sub2_1.aClass74_1.anInt2319;
			local324 = local22 - this.aClass16_Sub2_1.aClass74_1.anInt2326;
			local331 = local27 - this.aClass16_Sub2_1.aClass74_1.anInt2325;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt1240 * local348 * arg1);
			this.anInt10132 = (int) ((long) this.anInt10132 - ((long) this.anInt10132 * local356 >> 18));
		} else if (local35.anInt1275 == 2) {
			local317 = local17 - this.aClass16_Sub2_1.aClass74_1.anInt2319;
			local324 = local22 - this.aClass16_Sub2_1.aClass74_1.anInt2326;
			local331 = local27 - this.aClass16_Sub2_1.aClass74_1.anInt2325;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt1240 * local348 * arg1);
			this.anInt10132 = (int) ((long) this.anInt10132 - ((long) this.anInt10132 * local356 >> 28));
		}
		if (local35.anIntArray78 != null) {
			@Pc(437) Class2 local437 = local31.aClass114_35.aClass2_90;
			for (@Pc(440) Class2 local440 = local437.aClass2_300; local440 != local437; local440 = local440.aClass2_300) {
				@Pc(444) Class2_Sub7_Sub8 local444 = (Class2_Sub7_Sub8) local440;
				@Pc(447) Class206 local447 = local444.aClass206_1;
				if (local447.anInt5480 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray78.length; local455++) {
						if (local35.anIntArray78[local455] == local447.anInt5481) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt6020);
						@Pc(486) double local486 = (double) (local22 - local444.anInt6024);
						@Pc(492) double local492 = (double) (local27 - local444.anInt6022);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong139)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt6026 + local486 * (double) local447.anInt5470 + local492 * (double) local444.anInt6019) * 65535.0D / ((double) local447.anInt5473 * local513);
							if (!(local545 < (double) local447.anInt5484)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt5479 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt5483;
								} else if (local447.anInt5479 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt5483;
								}
								if (local447.anInt5477 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt5473;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt5473;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt5473;
									if (local447.anInt5472 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt10126 = (int) ((double) super.anInt10126 + local678 * (double) arg1);
										super.anInt10131 = (int) ((double) super.anInt10131 + local686 * (double) arg1);
										super.anInt10130 = (int) ((double) super.anInt10130 + local694 * (double) arg1);
									}
								} else if (local447.anInt5472 == 0) {
									local296 += ((double) local444.anInt6026 - local553) * (double) arg1;
									local300 += ((double) local447.anInt5470 - local553) * (double) arg1;
									local304 += ((double) local444.anInt6019 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt10126 = (int) ((double) super.anInt10126 + ((double) local444.anInt6026 - local553) * (double) arg1);
									super.anInt10131 = (int) ((double) super.anInt10131 + ((double) local447.anInt5470 - local553) * (double) arg1);
									super.anInt10130 = (int) ((double) super.anInt10130 + ((double) local444.anInt6019 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray77 != null) {
			for (local317 = 0; local317 < local35.anIntArray77.length; local317++) {
				@Pc(776) Class2_Sub7_Sub8 local776 = (Class2_Sub7_Sub8) Static355.aClass261_1.method6098((long) local35.anIntArray77[local317]);
				while (local776 != null) {
					@Pc(780) Class206 local780 = local776.aClass206_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt6020);
					@Pc(792) double local792 = (double) (local22 - local776.anInt6024);
					@Pc(798) double local798 = (double) (local27 - local776.anInt6022);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong139) {
						local776 = (Class2_Sub7_Sub8) Static355.aClass261_1.method6097();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt6026 + local792 * (double) local780.anInt5470 + local798 * (double) local776.anInt6019) * 65535.0D / ((double) local780.anInt5473 * local825);
						if (local857 < (double) local780.anInt5484) {
							local776 = (Class2_Sub7_Sub8) Static355.aClass261_1.method6097();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt5479 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt5483;
							} else if (local780.anInt5479 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt5483;
							}
							if (local780.anInt5477 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt5473;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt5473;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt5473;
								if (local780.anInt5472 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt10126 = (int) ((double) super.anInt10126 + local996 * (double) arg1);
									super.anInt10131 = (int) ((double) super.anInt10131 + local1004 * (double) arg1);
									super.anInt10130 = (int) ((double) super.anInt10130 + local1012 * (double) arg1);
								}
							} else if (local780.anInt5472 == 0) {
								local296 += ((double) local776.anInt6026 - local871) * (double) arg1;
								local300 += ((double) local780.anInt5470 - local871) * (double) arg1;
								local304 += ((double) local776.anInt6019 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt10126 = (int) ((double) super.anInt10126 + ((double) local776.anInt6026 - local871) * (double) arg1);
								super.anInt10131 = (int) ((double) super.anInt10131 + ((double) local780.anInt5470 - local871) * (double) arg1);
								super.anInt10130 = (int) ((double) super.anInt10130 + ((double) local776.anInt6019 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub7_Sub8) Static355.aClass261_1.method6097();
						}
					}
				}
			}
		}
		if (local35.anIntArray76 != null) {
			if (local35.anIntArray79 == null) {
				local35.anIntArray79 = new int[local35.anIntArray76.length];
				for (local317 = 0; local317 < local35.anIntArray76.length; local317++) {
					Static456.method6482(local35.anIntArray76[local317]);
					local35.anIntArray79[local317] = ((Class2_Sub41) Static404.aClass323_25.method7484((long) local35.anIntArray76[local317])).anInt9197;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray79.length; local317++) {
				@Pc(1137) Class206 local1137 = Static566.aClass206Array1[local35.anIntArray79[local317]];
				if (local1137.anInt5472 == 0) {
					local296 += (double) (local1137.anInt5476 * arg1);
					local300 += (double) (local1137.anInt5470 * arg1);
					local304 += (double) (local1137.anInt5474 * arg1);
					local306 = true;
				} else {
					super.anInt10126 += local1137.anInt5476 * arg1;
					super.anInt10131 += local1137.anInt5470 * arg1;
					super.anInt10130 += local1137.anInt5474 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort123 = (short) (int) local296;
					this.aShort120 = (short) (int) local300;
					this.aShort121 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt10132 <<= 0x1;
			}
		}
		super.anInt10126 = (int) ((long) super.anInt10126 + ((long) this.aShort123 * (long) (this.anInt10132 << 2) >> 23) * (long) arg1);
		super.anInt10131 = (int) ((long) super.anInt10131 + ((long) this.aShort120 * (long) (this.anInt10132 << 2) >> 23) * (long) arg1);
		super.anInt10130 = (int) ((long) super.anInt10130 + ((long) this.aShort121 * (long) (this.anInt10132 << 2) >> 23) * (long) arg1);
	}
}
