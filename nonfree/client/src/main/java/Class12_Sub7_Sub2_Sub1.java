import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class12_Sub7_Sub2_Sub1 extends Class12_Sub7_Sub2 {

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
	private int anInt10256;

	@OriginalMember(owner = "client!uk", name = "I", descriptor = "Lclient!pga;")
	public Class12_Sub10 aClass12_Sub10_1;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!uk", name = "K", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
	private int anInt10255;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!pga;IIIIIIIIIIIZZ)V")
	public Class12_Sub7_Sub2_Sub1(@OriginalArg(0) Class12_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub10_1 = arg0;
		super.anInt10249 = arg1 << 12;
		super.anInt10247 = arg2 << 12;
		super.anInt10252 = arg3 << 12;
		super.anInt10254 = arg9;
		this.aShort101 = this.aShort106 = (short) arg8;
		super.anInt10251 = arg10;
		super.anInt10253 = arg11;
		super.aBoolean716 = arg13;
		this.aShort104 = (short) arg4;
		this.aShort105 = (short) arg5;
		this.aShort103 = (short) arg6;
		this.anInt10255 = arg7;
		super.aByte138 = this.aClass12_Sub10_1.aClass136_2.aByte75;
		this.method8536();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
	private void method8536() {
		@Pc(4) int local4 = this.aClass12_Sub10_1.aClass12_Sub4_7.anInt1876;
		if (this.aClass12_Sub10_1.aClass12_Sub4_7.aClass12_Sub7_Sub2_Sub1Array1[local4] != null) {
			this.aClass12_Sub10_1.aClass12_Sub4_7.aClass12_Sub7_Sub2_Sub1Array1[local4].method8540();
		}
		this.aClass12_Sub10_1.aClass12_Sub4_7.aClass12_Sub7_Sub2_Sub1Array1[local4] = this;
		this.aShort102 = (short) this.aClass12_Sub10_1.aClass12_Sub4_7.anInt1876;
		this.aClass12_Sub10_1.aClass12_Sub4_7.anInt1876 = local4 + 1 & 0x1FFF;
		this.aClass12_Sub10_1.aClass376_7.method9011(this);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!pga;IIIIIIIIIIIZZ)V")
	public void method8537(@OriginalArg(0) Class12_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass12_Sub10_1 = arg0;
		super.anInt10249 = arg1 << 12;
		super.anInt10247 = arg2 << 12;
		super.anInt10252 = arg3 << 12;
		super.anInt10254 = arg9;
		this.aShort101 = this.aShort106 = (short) arg8;
		super.anInt10251 = arg10;
		super.anInt10253 = arg11;
		super.aBoolean716 = arg13;
		this.aShort104 = (short) arg4;
		this.aShort105 = (short) arg5;
		this.aShort103 = (short) arg6;
		this.anInt10255 = arg7;
		super.aByte138 = this.aClass12_Sub10_1.aClass136_2.aByte75;
		this.method8536();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method8538(@OriginalArg(0) Class137 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt10249 >> Static579.anInt9935 + 12;
		@Pc(13) int local13 = super.anInt10252 >> Static579.anInt9935 + 12;
		@Pc(18) int local18 = super.anInt10247 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static28.anInt704 || local13 < 0 || local13 >= Static55.anInt1384) {
			this.method8540();
			return;
		}
		@Pc(40) Class12_Sub4 local40 = this.aClass12_Sub10_1.aClass12_Sub4_7;
		@Pc(44) Class223 local44 = this.aClass12_Sub10_1.aClass223_1;
		@Pc(46) Class51[] local46 = Static576.aClass51Array3;
		@Pc(49) int local49 = local40.anInt1878;
		@Pc(58) Class58 local58 = Static486.aClass58ArrayArrayArray2[local40.anInt1878][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte39;
		}
		@Pc(71) int local71 = local46[local49].method7857(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static613.anInt10338 - 1) {
			local86 = local46[local49 + 1].method7857(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static579.anInt9935);
		}
		if (local44.aBoolean449) {
			if (local44.anInt6451 == -1 && local18 > local71) {
				this.method8540();
				return;
			}
			if (local44.anInt6451 >= 0 && local18 > local46[local44.anInt6451].method7857(local13, local6)) {
				this.method8540();
				return;
			}
			if (local44.anInt6442 == -1 && local18 < local86) {
				this.method8540();
				return;
			}
			if (local44.anInt6442 >= 0 && local18 < local46[local44.anInt6442 + 1].method7857(local13, local6)) {
				this.method8540();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static613.anInt10338 - 1; local154 > 0 && local18 > local46[local154].method7857(local13, local6); local154--) {
		}
		if (local44.aBoolean443 && local154 == 0 && local18 > local46[0].method7857(local13, local6)) {
			this.method8540();
		} else if (local154 == Static613.anInt10338 - 1 && local46[local154].method7857(local13, local6) - local18 > 0x8 << Static579.anInt9935) {
			this.method8540();
		} else {
			local58 = Static486.aClass58ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static486.aClass58ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static486.aClass58ArrayArrayArray2[0][local6][local13] = new Class58(0);
				}
				@Pc(251) boolean local251 = Static486.aClass58ArrayArrayArray2[0][local6][local13].aClass58_1 != null;
				if (local154 == 3 && local251) {
					this.method8540();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static486.aClass58ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static486.aClass58ArrayArrayArray2[local261][local6][local13] = new Class58(local261);
						if (local251) {
							local58.aByte39++;
						}
					}
				}
			}
			if (local44.aBoolean442) {
				@Pc(304) int local304 = super.anInt10249 >> 12;
				local261 = super.anInt10252 >> 12;
				@Pc(318) Class305 local318;
				if (local58.aClass12_Sub2_Sub1_1 != null) {
					local318 = local58.aClass12_Sub2_Sub1_1.method9156(arg0);
					if (local318 != null && local318.method7487(local18, local261, local304)) {
						this.method8540();
						return;
					}
				}
				if (local58.aClass12_Sub2_Sub1_2 != null) {
					local318 = local58.aClass12_Sub2_Sub1_2.method9156(arg0);
					if (local318 != null && local318.method7487(local18, local261, local304)) {
						this.method8540();
						return;
					}
				}
				if (local58.aClass12_Sub2_Sub4_1 != null) {
					local318 = local58.aClass12_Sub2_Sub4_1.method9156(arg0);
					if (local318 != null && local318.method7487(local18, local261, local304)) {
						this.method8540();
						return;
					}
				}
				for (@Pc(375) Class43 local375 = local58.aClass43_4; local375 != null; local375 = local375.aClass43_3) {
					@Pc(382) Class305 local382 = local375.aClass12_Sub2_Sub2_1.method9156(arg0);
					if (local382 != null && local382.method7487(local18, local261, local304)) {
						this.method8540();
						return;
					}
				}
			}
			local40.aClass196_1.aClass243_1.method5914(this);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(JI)V")
	public void method8539(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort106 = (short) (this.aShort106 - arg1);
		if (this.aShort106 <= 0) {
			this.method8540();
			return;
		}
		@Pc(17) int local17 = super.anInt10249 >> 12;
		@Pc(22) int local22 = super.anInt10247 >> 12;
		@Pc(27) int local27 = super.anInt10252 >> 12;
		@Pc(31) Class12_Sub4 local31 = this.aClass12_Sub10_1.aClass12_Sub4_7;
		@Pc(35) Class223 local35 = this.aClass12_Sub10_1.aClass223_1;
		if (local35.anInt6468 != 0) {
			@Pc(65) int local65;
			if (this.aShort101 - this.aShort106 <= local35.anInt6473) {
				local65 = (super.anInt10254 >> 8 & 0xFF00) + (this.anInt10256 >> 16 & 0xFF) + local35.anInt6450 * arg1;
				@Pc(82) int local82 = (super.anInt10254 & 0xFF00) + (this.anInt10256 >> 8 & 0xFF) + local35.anInt6467 * arg1;
				@Pc(99) int local99 = ((super.anInt10254 & 0xFF) << 8) + (this.anInt10256 & 0xFF) + local35.anInt6472 * arg1;
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
				super.anInt10254 &= 0xFF000000;
				super.anInt10254 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt10256 &= 0xFF000000;
				this.anInt10256 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort101 - this.aShort106 <= local35.anInt6461) {
				local65 = (super.anInt10254 >> 16 & 0xFF00) + (this.anInt10256 >> 24 & 0xFF) + local35.anInt6471 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt10254 &= 0xFFFFFF;
				super.anInt10254 |= (local65 & 0xFF00) << 16;
				this.anInt10256 &= 0xFFFFFF;
				this.anInt10256 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6469 != -1 && this.aShort101 - this.aShort106 <= local35.anInt6470) {
			this.anInt10255 += local35.anInt6466 * arg1;
		}
		if (local35.anInt6444 != -1 && this.aShort101 - this.aShort106 <= local35.anInt6476) {
			super.anInt10251 += local35.anInt6474 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort104;
		@Pc(300) double local300 = (double) this.aShort105;
		@Pc(304) double local304 = (double) this.aShort103;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt6465 == 1) {
			local317 = local17 - this.aClass12_Sub10_1.aClass149_1.anInt4200;
			local324 = local22 - this.aClass12_Sub10_1.aClass149_1.anInt4198;
			local331 = local27 - this.aClass12_Sub10_1.aClass149_1.anInt4204;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt6437 * local348 * arg1);
			this.anInt10255 = (int) ((long) this.anInt10255 - ((long) this.anInt10255 * local356 >> 18));
		} else if (local35.anInt6465 == 2) {
			local317 = local17 - this.aClass12_Sub10_1.aClass149_1.anInt4200;
			local324 = local22 - this.aClass12_Sub10_1.aClass149_1.anInt4198;
			local331 = local27 - this.aClass12_Sub10_1.aClass149_1.anInt4204;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt6437 * local348 * arg1);
			this.anInt10255 = (int) ((long) this.anInt10255 - ((long) this.anInt10255 * local356 >> 28));
		}
		if (local35.anIntArray465 != null) {
			@Pc(437) Class14 local437 = local31.aClass262_10.aClass14_230;
			for (@Pc(440) Class14 local440 = local437.aClass14_338; local440 != local437; local440 = local440.aClass14_338) {
				@Pc(444) Class14_Sub3_Sub17 local444 = (Class14_Sub3_Sub17) local440;
				@Pc(447) Class93 local447 = local444.aClass93_1;
				if (local447.anInt2590 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray465.length; local455++) {
						if (local35.anIntArray465[local455] == local447.anInt2593) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt9953);
						@Pc(486) double local486 = (double) (local22 - local444.anInt9950);
						@Pc(492) double local492 = (double) (local27 - local444.anInt9951);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong68)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt9957 + local486 * (double) local447.anInt2583 + local492 * (double) local444.anInt9952) * 65535.0D / ((double) local447.anInt2589 * local513);
							if (!(local545 < (double) local447.anInt2585)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt2580 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt2582;
								} else if (local447.anInt2580 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt2582;
								}
								if (local447.anInt2588 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt2589;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt2589;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt2589;
									if (local447.anInt2579 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt10249 = (int) ((double) super.anInt10249 + local678 * (double) arg1);
										super.anInt10247 = (int) ((double) super.anInt10247 + local686 * (double) arg1);
										super.anInt10252 = (int) ((double) super.anInt10252 + local694 * (double) arg1);
									}
								} else if (local447.anInt2579 == 0) {
									local296 += ((double) local444.anInt9957 - local553) * (double) arg1;
									local300 += ((double) local447.anInt2583 - local553) * (double) arg1;
									local304 += ((double) local444.anInt9952 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt10249 = (int) ((double) super.anInt10249 + ((double) local444.anInt9957 - local553) * (double) arg1);
									super.anInt10247 = (int) ((double) super.anInt10247 + ((double) local447.anInt2583 - local553) * (double) arg1);
									super.anInt10252 = (int) ((double) super.anInt10252 + ((double) local444.anInt9952 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray468 != null) {
			for (local317 = 0; local317 < local35.anIntArray468.length; local317++) {
				@Pc(776) Class14_Sub3_Sub17 local776 = (Class14_Sub3_Sub17) Static530.aClass206_1.method5086((long) local35.anIntArray468[local317]);
				while (local776 != null) {
					@Pc(780) Class93 local780 = local776.aClass93_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt9953);
					@Pc(792) double local792 = (double) (local22 - local776.anInt9950);
					@Pc(798) double local798 = (double) (local27 - local776.anInt9951);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong68) {
						local776 = (Class14_Sub3_Sub17) Static530.aClass206_1.method5085();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt9957 + local792 * (double) local780.anInt2583 + local798 * (double) local776.anInt9952) * 65535.0D / ((double) local780.anInt2589 * local825);
						if (local857 < (double) local780.anInt2585) {
							local776 = (Class14_Sub3_Sub17) Static530.aClass206_1.method5085();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt2580 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt2582;
							} else if (local780.anInt2580 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt2582;
							}
							if (local780.anInt2588 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt2589;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt2589;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt2589;
								if (local780.anInt2579 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt10249 = (int) ((double) super.anInt10249 + local996 * (double) arg1);
									super.anInt10247 = (int) ((double) super.anInt10247 + local1004 * (double) arg1);
									super.anInt10252 = (int) ((double) super.anInt10252 + local1012 * (double) arg1);
								}
							} else if (local780.anInt2579 == 0) {
								local296 += ((double) local776.anInt9957 - local871) * (double) arg1;
								local300 += ((double) local780.anInt2583 - local871) * (double) arg1;
								local304 += ((double) local776.anInt9952 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt10249 = (int) ((double) super.anInt10249 + ((double) local776.anInt9957 - local871) * (double) arg1);
								super.anInt10247 = (int) ((double) super.anInt10247 + ((double) local780.anInt2583 - local871) * (double) arg1);
								super.anInt10252 = (int) ((double) super.anInt10252 + ((double) local776.anInt9952 - local871) * (double) arg1);
							}
							local776 = (Class14_Sub3_Sub17) Static530.aClass206_1.method5085();
						}
					}
				}
			}
		}
		if (local35.anIntArray467 != null) {
			if (local35.anIntArray466 == null) {
				local35.anIntArray466 = new int[local35.anIntArray467.length];
				for (local317 = 0; local317 < local35.anIntArray467.length; local317++) {
					Static310.method4523(local35.anIntArray467[local317]);
					local35.anIntArray466[local317] = ((Class14_Sub18) Static609.aClass187_79.method4078((long) local35.anIntArray467[local317])).anInt2644;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray466.length; local317++) {
				@Pc(1137) Class93 local1137 = Static397.aClass93Array1[local35.anIntArray466[local317]];
				if (local1137.anInt2579 == 0) {
					local296 += (double) (local1137.anInt2586 * arg1);
					local300 += (double) (local1137.anInt2583 * arg1);
					local304 += (double) (local1137.anInt2577 * arg1);
					local306 = true;
				} else {
					super.anInt10249 += local1137.anInt2586 * arg1;
					super.anInt10247 += local1137.anInt2583 * arg1;
					super.anInt10252 += local1137.anInt2577 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort104 = (short) (int) local296;
					this.aShort105 = (short) (int) local300;
					this.aShort103 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt10255 <<= 0x1;
			}
		}
		super.anInt10249 = (int) ((long) super.anInt10249 + ((long) this.aShort104 * (long) (this.anInt10255 << 2) >> 23) * (long) arg1);
		super.anInt10247 = (int) ((long) super.anInt10247 + ((long) this.aShort105 * (long) (this.anInt10255 << 2) >> 23) * (long) arg1);
		super.anInt10252 = (int) ((long) super.anInt10252 + ((long) this.aShort103 * (long) (this.anInt10255 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "()V")
	public void method8540() {
		this.aClass12_Sub10_1.aClass12_Sub4_7.aClass12_Sub7_Sub2_Sub1Array1[this.aShort102] = null;
		Static602.aClass12_Sub7_Sub2_Sub1Array2[Static620.anInt10428] = this;
		Static620.anInt10428 = Static620.anInt10428 + 1 & 0x3FF;
		this.method9143();
		this.method8526();
	}
}
