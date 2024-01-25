import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class9_Sub3_Sub2_Sub1 extends Class9_Sub3_Sub2 {

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
	private int anInt6761;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Lclient!ig;")
	public Class9_Sub4 aClass9_Sub4_1;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	private int anInt6760;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!ig;IIIIIIIIIIIZZ)V")
	public Class9_Sub3_Sub2_Sub1(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub4_1 = arg0;
		super.anInt6754 = arg1 << 12;
		super.anInt6759 = arg2 << 12;
		super.anInt6757 = arg3 << 12;
		super.anInt6756 = arg9;
		this.aShort79 = this.aShort81 = (short) arg8;
		super.anInt6755 = arg10;
		super.anInt6758 = arg11;
		super.aBoolean490 = arg13;
		this.aShort77 = (short) arg4;
		this.aShort80 = (short) arg5;
		this.aShort78 = (short) arg6;
		this.anInt6760 = arg7;
		super.aByte77 = this.aClass9_Sub4_1.aClass228_1.aByte76;
		this.method5876();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ig;IIIIIIIIIIIZZ)V")
	public void method5873(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass9_Sub4_1 = arg0;
		super.anInt6754 = arg1 << 12;
		super.anInt6759 = arg2 << 12;
		super.anInt6757 = arg3 << 12;
		super.anInt6756 = arg9;
		this.aShort79 = this.aShort81 = (short) arg8;
		super.anInt6755 = arg10;
		super.anInt6758 = arg11;
		super.aBoolean490 = arg13;
		this.aShort77 = (short) arg4;
		this.aShort80 = (short) arg5;
		this.aShort78 = (short) arg6;
		this.anInt6760 = arg7;
		super.aByte77 = this.aClass9_Sub4_1.aClass228_1.aByte76;
		this.method5876();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)V")
	public void method5874(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort81 = (short) (this.aShort81 - arg1);
		if (this.aShort81 <= 0) {
			this.method5877();
			return;
		}
		@Pc(17) int local17 = super.anInt6754 >> 12;
		@Pc(22) int local22 = super.anInt6759 >> 12;
		@Pc(27) int local27 = super.anInt6757 >> 12;
		@Pc(31) Class9_Sub8 local31 = this.aClass9_Sub4_1.aClass9_Sub8_4;
		@Pc(35) Class68 local35 = this.aClass9_Sub4_1.aClass68_1;
		if (local35.anInt1884 != 0) {
			@Pc(65) int local65;
			if (this.aShort79 - this.aShort81 <= local35.anInt1896) {
				local65 = (super.anInt6756 >> 8 & 0xFF00) + (this.anInt6761 >> 16 & 0xFF) + local35.anInt1890 * arg1;
				@Pc(82) int local82 = (super.anInt6756 & 0xFF00) + (this.anInt6761 >> 8 & 0xFF) + local35.anInt1898 * arg1;
				@Pc(99) int local99 = ((super.anInt6756 & 0xFF) << 8) + (this.anInt6761 & 0xFF) + local35.anInt1877 * arg1;
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
				super.anInt6756 &= 0xFF000000;
				super.anInt6756 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6761 &= 0xFF000000;
				this.anInt6761 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort79 - this.aShort81 <= local35.anInt1886) {
				local65 = (super.anInt6756 >> 16 & 0xFF00) + (this.anInt6761 >> 24 & 0xFF) + local35.anInt1908 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6756 &= 0xFFFFFF;
				super.anInt6756 |= (local65 & 0xFF00) << 16;
				this.anInt6761 &= 0xFFFFFF;
				this.anInt6761 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.lb != -1 && this.aShort79 - this.aShort81 <= local35.anInt1904) {
			this.anInt6760 += local35.anInt1906 * arg1;
		}
		if (local35.anInt1882 != -1 && this.aShort79 - this.aShort81 <= local35.anInt1875) {
			super.anInt6755 += local35.anInt1905 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort77;
		@Pc(300) double local300 = (double) this.aShort80;
		@Pc(304) double local304 = (double) this.aShort78;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt1909 == 1) {
			local317 = local17 - this.aClass9_Sub4_1.aClass17_1.anInt264;
			local324 = local22 - this.aClass9_Sub4_1.aClass17_1.anInt271;
			local331 = local27 - this.aClass9_Sub4_1.aClass17_1.anInt263;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt1862 * local348 * arg1);
			this.anInt6760 = (int) ((long) this.anInt6760 - ((long) this.anInt6760 * local356 >> 18));
		} else if (local35.anInt1909 == 2) {
			local317 = local17 - this.aClass9_Sub4_1.aClass17_1.anInt264;
			local324 = local22 - this.aClass9_Sub4_1.aClass17_1.anInt271;
			local331 = local27 - this.aClass9_Sub4_1.aClass17_1.anInt263;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt1862 * local348 * arg1);
			this.anInt6760 = (int) ((long) this.anInt6760 - ((long) this.anInt6760 * local356 >> 28));
		}
		if (local35.anIntArray123 != null) {
			@Pc(437) Class3 local437 = local31.aClass216_49.aClass3_185;
			for (@Pc(440) Class3 local440 = local437.aClass3_300; local440 != local437; local440 = local440.aClass3_300) {
				@Pc(444) Class3_Sub7_Sub7 local444 = (Class3_Sub7_Sub7) local440;
				@Pc(447) Class121 local447 = local444.aClass121_1;
				if (local447.anInt3358 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray123.length; local455++) {
						if (local35.anIntArray123[local455] == local447.anInt3346) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt2647);
						@Pc(486) double local486 = (double) (local22 - local444.anInt2643);
						@Pc(492) double local492 = (double) (local27 - local444.anInt2648);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong94)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt2644 + local486 * (double) local447.anInt3356 + local492 * (double) local444.anInt2645) * 65535.0D / ((double) local447.anInt3345 * local513);
							if (!(local545 < (double) local447.anInt3361)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt3350 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt3349;
								} else if (local447.anInt3350 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt3349;
								}
								if (local447.anInt3359 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt3345;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt3345;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt3345;
									if (local447.anInt3355 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt6754 = (int) ((double) super.anInt6754 + local678 * (double) arg1);
										super.anInt6759 = (int) ((double) super.anInt6759 + local686 * (double) arg1);
										super.anInt6757 = (int) ((double) super.anInt6757 + local694 * (double) arg1);
									}
								} else if (local447.anInt3355 == 0) {
									local296 += ((double) local444.anInt2644 - local553) * (double) arg1;
									local300 += ((double) local447.anInt3356 - local553) * (double) arg1;
									local304 += ((double) local444.anInt2645 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt6754 = (int) ((double) super.anInt6754 + ((double) local444.anInt2644 - local553) * (double) arg1);
									super.anInt6759 = (int) ((double) super.anInt6759 + ((double) local447.anInt3356 - local553) * (double) arg1);
									super.anInt6757 = (int) ((double) super.anInt6757 + ((double) local444.anInt2645 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray126 != null) {
			for (local317 = 0; local317 < local35.anIntArray126.length; local317++) {
				@Pc(776) Class3_Sub7_Sub7 local776 = (Class3_Sub7_Sub7) Static240.aClass353_1.method8294((long) local35.anIntArray126[local317]);
				while (local776 != null) {
					@Pc(780) Class121 local780 = local776.aClass121_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt2647);
					@Pc(792) double local792 = (double) (local22 - local776.anInt2643);
					@Pc(798) double local798 = (double) (local27 - local776.anInt2648);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong94) {
						local776 = (Class3_Sub7_Sub7) Static240.aClass353_1.method8295();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt2644 + local792 * (double) local780.anInt3356 + local798 * (double) local776.anInt2645) * 65535.0D / ((double) local780.anInt3345 * local825);
						if (local857 < (double) local780.anInt3361) {
							local776 = (Class3_Sub7_Sub7) Static240.aClass353_1.method8295();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt3350 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt3349;
							} else if (local780.anInt3350 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt3349;
							}
							if (local780.anInt3359 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt3345;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt3345;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt3345;
								if (local780.anInt3355 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt6754 = (int) ((double) super.anInt6754 + local996 * (double) arg1);
									super.anInt6759 = (int) ((double) super.anInt6759 + local1004 * (double) arg1);
									super.anInt6757 = (int) ((double) super.anInt6757 + local1012 * (double) arg1);
								}
							} else if (local780.anInt3355 == 0) {
								local296 += ((double) local776.anInt2644 - local871) * (double) arg1;
								local300 += ((double) local780.anInt3356 - local871) * (double) arg1;
								local304 += ((double) local776.anInt2645 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt6754 = (int) ((double) super.anInt6754 + ((double) local776.anInt2644 - local871) * (double) arg1);
								super.anInt6759 = (int) ((double) super.anInt6759 + ((double) local780.anInt3356 - local871) * (double) arg1);
								super.anInt6757 = (int) ((double) super.anInt6757 + ((double) local776.anInt2645 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub7_Sub7) Static240.aClass353_1.method8295();
						}
					}
				}
			}
		}
		if (local35.anIntArray124 != null) {
			if (local35.anIntArray125 == null) {
				local35.anIntArray125 = new int[local35.anIntArray124.length];
				for (local317 = 0; local317 < local35.anIntArray124.length; local317++) {
					Static319.method5303(local35.anIntArray124[local317]);
					local35.anIntArray125[local317] = ((Class3_Sub51) Static500.aClass25_36.method426((long) local35.anIntArray124[local317])).anInt9787;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray125.length; local317++) {
				@Pc(1137) Class121 local1137 = Static318.aClass121Array1[local35.anIntArray125[local317]];
				if (local1137.anInt3355 == 0) {
					local296 += (double) (local1137.anInt3353 * arg1);
					local300 += (double) (local1137.anInt3356 * arg1);
					local304 += (double) (local1137.anInt3348 * arg1);
					local306 = true;
				} else {
					super.anInt6754 += local1137.anInt3353 * arg1;
					super.anInt6759 += local1137.anInt3356 * arg1;
					super.anInt6757 += local1137.anInt3348 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort77 = (short) (int) local296;
					this.aShort80 = (short) (int) local300;
					this.aShort78 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt6760 <<= 0x1;
			}
		}
		super.anInt6754 = (int) ((long) super.anInt6754 + ((long) this.aShort77 * (long) (this.anInt6760 << 2) >> 23) * (long) arg1);
		super.anInt6759 = (int) ((long) super.anInt6759 + ((long) this.aShort80 * (long) (this.anInt6760 << 2) >> 23) * (long) arg1);
		super.anInt6757 = (int) ((long) super.anInt6757 + ((long) this.aShort78 * (long) (this.anInt6760 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method5875(@OriginalArg(0) Class82 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt6754 >> Static485.anInt8241 + 12;
		@Pc(13) int local13 = super.anInt6757 >> Static485.anInt8241 + 12;
		@Pc(18) int local18 = super.anInt6759 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static573.anInt6750 || local13 < 0 || local13 >= Static547.anInt9143) {
			this.method5877();
			return;
		}
		@Pc(40) Class9_Sub8 local40 = this.aClass9_Sub4_1.aClass9_Sub8_4;
		@Pc(44) Class68 local44 = this.aClass9_Sub4_1.aClass68_1;
		@Pc(46) Class91[] local46 = Static637.aClass91Array4;
		@Pc(49) int local49 = local40.anInt6827;
		@Pc(58) Class351 local58 = Static567.aClass351ArrayArrayArray4[local40.anInt6827][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte118;
		}
		@Pc(71) int local71 = local46[local49].method7724(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static603.anInt9778 - 1) {
			local86 = local46[local49 + 1].method7724(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static485.anInt8241);
		}
		if (local44.aBoolean144) {
			if (local44.anInt1892 == -1 && local18 > local71) {
				this.method5877();
				return;
			}
			if (local44.anInt1892 >= 0 && local18 > local46[local44.anInt1892].method7724(local13, local6)) {
				this.method5877();
				return;
			}
			if (local44.anInt1873 == -1 && local18 < local86) {
				this.method5877();
				return;
			}
			if (local44.anInt1873 >= 0 && local18 < local46[local44.anInt1873 + 1].method7724(local13, local6)) {
				this.method5877();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static603.anInt9778 - 1; local154 > 0 && local18 > local46[local154].method7724(local13, local6); local154--) {
		}
		if (local44.aBoolean136 && local154 == 0 && local18 > local46[0].method7724(local13, local6)) {
			this.method5877();
		} else if (local154 == Static603.anInt9778 - 1 && local46[local154].method7724(local13, local6) - local18 > 0x8 << Static485.anInt8241) {
			this.method5877();
		} else {
			local58 = Static567.aClass351ArrayArrayArray4[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static567.aClass351ArrayArrayArray4[0][local6][local13] == null) {
					local58 = Static567.aClass351ArrayArrayArray4[0][local6][local13] = new Class351(0);
				}
				@Pc(251) boolean local251 = Static567.aClass351ArrayArrayArray4[0][local6][local13].aClass351_1 != null;
				if (local154 == 3 && local251) {
					this.method5877();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static567.aClass351ArrayArrayArray4[local261][local6][local13] == null) {
						local58 = Static567.aClass351ArrayArrayArray4[local261][local6][local13] = new Class351(local261);
						if (local251) {
							local58.aByte118++;
						}
					}
				}
			}
			if (local44.aBoolean138) {
				@Pc(304) int local304 = super.anInt6754 >> 12;
				local261 = super.anInt6757 >> 12;
				@Pc(318) Class160 local318;
				if (local58.aClass9_Sub2_Sub3_2 != null) {
					local318 = local58.aClass9_Sub2_Sub3_2.method8604(arg0);
					if (local318 != null && local318.method4046(local261, local18, local304)) {
						this.method5877();
						return;
					}
				}
				if (local58.aClass9_Sub2_Sub3_1 != null) {
					local318 = local58.aClass9_Sub2_Sub3_1.method8604(arg0);
					if (local318 != null && local318.method4046(local261, local18, local304)) {
						this.method5877();
						return;
					}
				}
				if (local58.aClass9_Sub2_Sub4_1 != null) {
					local318 = local58.aClass9_Sub2_Sub4_1.method8604(arg0);
					if (local318 != null && local318.method4046(local261, local18, local304)) {
						this.method5877();
						return;
					}
				}
				for (@Pc(375) Class105 local375 = local58.aClass105_3; local375 != null; local375 = local375.aClass105_1) {
					@Pc(382) Class160 local382 = local375.aClass9_Sub2_Sub1_1.method8604(arg0);
					if (local382 != null && local382.method4046(local261, local18, local304)) {
						this.method5877();
						return;
					}
				}
			}
			local40.aClass162_1.aClass347_1.method8207(this);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	private void method5876() {
		@Pc(4) int local4 = this.aClass9_Sub4_1.aClass9_Sub8_4.anInt6824;
		if (this.aClass9_Sub4_1.aClass9_Sub8_4.aClass9_Sub3_Sub2_Sub1Array2[local4] != null) {
			this.aClass9_Sub4_1.aClass9_Sub8_4.aClass9_Sub3_Sub2_Sub1Array2[local4].method5877();
		}
		this.aClass9_Sub4_1.aClass9_Sub8_4.aClass9_Sub3_Sub2_Sub1Array2[local4] = this;
		this.aShort76 = (short) this.aClass9_Sub4_1.aClass9_Sub8_4.anInt6824;
		this.aClass9_Sub4_1.aClass9_Sub8_4.anInt6824 = local4 + 1 & 0x1FFF;
		this.aClass9_Sub4_1.aClass139_5.method3203(this);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()V")
	public void method5877() {
		this.aClass9_Sub4_1.aClass9_Sub8_4.aClass9_Sub3_Sub2_Sub1Array2[this.aShort76] = null;
		Static342.aClass9_Sub3_Sub2_Sub1Array1[Static332.anInt6265] = this;
		Static332.anInt6265 = Static332.anInt6265 + 1 & 0x3FF;
		this.method8593();
		this.method5871();
	}
}
