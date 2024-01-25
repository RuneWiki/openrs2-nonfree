import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class6_Sub3_Sub1_Sub1 extends Class6_Sub3_Sub1 {

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
	private int anInt2925;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "Lclient!fp;")
	public Class6_Sub4 aClass6_Sub4_1;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
	private int anInt2926;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!fp;IIIIIIIIIIIZZ)V")
	public Class6_Sub3_Sub1_Sub1(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass6_Sub4_1 = arg0;
		super.anInt2921 = arg1 << 12;
		super.anInt2919 = arg2 << 12;
		super.anInt2917 = arg3 << 12;
		super.anInt2915 = arg9;
		this.aShort30 = this.aShort31 = (short) arg8;
		super.anInt2914 = arg10;
		super.anInt2924 = arg11;
		super.aBoolean238 = arg13;
		this.aShort33 = (short) arg4;
		this.aShort34 = (short) arg5;
		this.aShort29 = (short) arg6;
		this.anInt2926 = arg7;
		super.aByte45 = this.aClass6_Sub4_1.aClass139_1.aByte48;
		this.method2377();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!r;J)V")
	public void method2374(@OriginalArg(0) Class100 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2921 >> Static134.anInt2822 + 12;
		@Pc(13) int local13 = super.anInt2917 >> Static134.anInt2822 + 12;
		@Pc(18) int local18 = super.anInt2919 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static496.anInt8369 || local13 < 0 || local13 >= Static357.anInt6390) {
			this.method2376();
			return;
		}
		@Pc(40) Class6_Sub8 local40 = this.aClass6_Sub4_1.aClass6_Sub8_4;
		@Pc(44) Class51 local44 = this.aClass6_Sub4_1.aClass51_1;
		@Pc(46) Class67[] local46 = Static421.aClass67Array7;
		@Pc(49) int local49 = local40.anInt8589;
		@Pc(58) Class346 local58 = Static389.aClass346ArrayArrayArray2[local40.anInt8589][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte121;
		}
		@Pc(71) int local71 = local46[local49].method6707(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static89.anInt8689 - 1) {
			local86 = local46[local49 + 1].method6707(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static134.anInt2822);
		}
		if (local44.aBoolean93) {
			if (local44.anInt1329 == -1 && local18 > local71) {
				this.method2376();
				return;
			}
			if (local44.anInt1329 >= 0 && local18 > local46[local44.anInt1329].method6707(local13, local6)) {
				this.method2376();
				return;
			}
			if (local44.lb == -1 && local18 < local86) {
				this.method2376();
				return;
			}
			if (local44.lb >= 0 && local18 < local46[local44.lb + 1].method6707(local13, local6)) {
				this.method2376();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static89.anInt8689 - 1; local154 > 0 && local18 > local46[local154].method6707(local13, local6); local154--) {
		}
		if (local44.aBoolean98 && local154 == 0 && local18 > local46[0].method6707(local13, local6)) {
			this.method2376();
		} else if (local154 == Static89.anInt8689 - 1 && local46[local154].method6707(local13, local6) - local18 > 0x8 << Static134.anInt2822) {
			this.method2376();
		} else {
			local58 = Static389.aClass346ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static389.aClass346ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static389.aClass346ArrayArrayArray2[0][local6][local13] = new Class346(0);
				}
				@Pc(251) boolean local251 = Static389.aClass346ArrayArrayArray2[0][local6][local13].aClass346_1 != null;
				if (local154 == 3 && local251) {
					this.method2376();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static389.aClass346ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static389.aClass346ArrayArrayArray2[local261][local6][local13] = new Class346(local261);
						if (local251) {
							local58.aByte121++;
						}
					}
				}
			}
			if (local44.aBoolean95) {
				@Pc(304) int local304 = super.anInt2921 >> 12;
				local261 = super.anInt2917 >> 12;
				@Pc(318) Class297 local318;
				if (local58.aClass6_Sub1_Sub3_2 != null) {
					local318 = local58.aClass6_Sub1_Sub3_2.method7326(arg0);
					if (local318 != null && local318.method6779(local304, local261, local18)) {
						this.method2376();
						return;
					}
				}
				if (local58.aClass6_Sub1_Sub3_1 != null) {
					local318 = local58.aClass6_Sub1_Sub3_1.method7326(arg0);
					if (local318 != null && local318.method6779(local304, local261, local18)) {
						this.method2376();
						return;
					}
				}
				if (local58.aClass6_Sub1_Sub2_1 != null) {
					local318 = local58.aClass6_Sub1_Sub2_1.method7326(arg0);
					if (local318 != null && local318.method6779(local304, local261, local18)) {
						this.method2376();
						return;
					}
				}
				for (@Pc(375) Class153 local375 = local58.aClass153_3; local375 != null; local375 = local375.aClass153_1) {
					@Pc(382) Class297 local382 = local375.aClass6_Sub1_Sub1_1.method7326(arg0);
					if (local382 != null && local382.method6779(local304, local261, local18)) {
						this.method2376();
						return;
					}
				}
			}
			local40.aClass164_1.aClass234_1.method5481(this);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(JI)V")
	public void method2375(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort31 = (short) (this.aShort31 - arg1);
		if (this.aShort31 <= 0) {
			this.method2376();
			return;
		}
		@Pc(17) int local17 = super.anInt2921 >> 12;
		@Pc(22) int local22 = super.anInt2919 >> 12;
		@Pc(27) int local27 = super.anInt2917 >> 12;
		@Pc(31) Class6_Sub8 local31 = this.aClass6_Sub4_1.aClass6_Sub8_4;
		@Pc(35) Class51 local35 = this.aClass6_Sub4_1.aClass51_1;
		if (local35.anInt1345 != 0) {
			@Pc(65) int local65;
			if (this.aShort30 - this.aShort31 <= local35.anInt1318) {
				local65 = (super.anInt2915 >> 8 & 0xFF00) + (this.anInt2925 >> 16 & 0xFF) + local35.anInt1347 * arg1;
				@Pc(82) int local82 = (super.anInt2915 & 0xFF00) + (this.anInt2925 >> 8 & 0xFF) + local35.anInt1323 * arg1;
				@Pc(99) int local99 = ((super.anInt2915 & 0xFF) << 8) + (this.anInt2925 & 0xFF) + local35.anInt1305 * arg1;
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
				super.anInt2915 &= 0xFF000000;
				super.anInt2915 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2925 &= 0xFF000000;
				this.anInt2925 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort30 - this.aShort31 <= local35.anInt1349) {
				local65 = (super.anInt2915 >> 16 & 0xFF00) + (this.anInt2925 >> 24 & 0xFF) + local35.anInt1340 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2915 &= 0xFFFFFF;
				super.anInt2915 |= (local65 & 0xFF00) << 16;
				this.anInt2925 &= 0xFFFFFF;
				this.anInt2925 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1308 != -1 && this.aShort30 - this.aShort31 <= local35.anInt1346) {
			this.anInt2926 += local35.anInt1341 * arg1;
		}
		if (local35.anInt1331 != -1 && this.aShort30 - this.aShort31 <= local35.anInt1334) {
			super.anInt2914 += local35.anInt1303 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort33;
		@Pc(300) double local300 = (double) this.aShort34;
		@Pc(304) double local304 = (double) this.aShort29;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt1322 == 1) {
			local317 = local17 - this.aClass6_Sub4_1.aClass146_1.anInt4004;
			local324 = local22 - this.aClass6_Sub4_1.aClass146_1.anInt4018;
			local331 = local27 - this.aClass6_Sub4_1.aClass146_1.anInt4011;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt1353 * local348 * arg1;
			this.anInt2926 = (int) ((long) this.anInt2926 - ((long) this.anInt2926 * local356 >> 18));
		} else if (local35.anInt1322 == 2) {
			local317 = local17 - this.aClass6_Sub4_1.aClass146_1.anInt4004;
			local324 = local22 - this.aClass6_Sub4_1.aClass146_1.anInt4018;
			local331 = local27 - this.aClass6_Sub4_1.aClass146_1.anInt4011;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt1353 * local348 * arg1;
			this.anInt2926 = (int) ((long) this.anInt2926 - ((long) this.anInt2926 * local356 >> 28));
		}
		if (local35.anIntArray69 != null) {
			@Pc(437) Class2 local437 = local31.aClass8_61.aClass2_9;
			for (@Pc(440) Class2 local440 = local437.aClass2_286; local440 != local437; local440 = local440.aClass2_286) {
				@Pc(444) Class2_Sub3_Sub10 local444 = (Class2_Sub3_Sub10) local440;
				@Pc(447) Class349 local447 = local444.aClass349_1;
				if (local447.anInt9198 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray69.length; local455++) {
						if (local35.anIntArray69[local455] == local447.anInt9205) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt6242);
						@Pc(486) double local486 = (double) (local22 - local444.anInt6247);
						@Pc(492) double local492 = (double) (local27 - local444.anInt6244);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong252)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt6246 + local486 * (double) local447.anInt9210 + local492 * (double) local444.anInt6243) * 65535.0D / ((double) local447.anInt9211 * local513);
							if (!(local545 < (double) local447.anInt9204)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt9207 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt9203;
								} else if (local447.anInt9207 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt9203;
								}
								if (local447.anInt9206 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt9211;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt9211;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt9211;
									if (local447.anInt9202 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt2921 = (int) ((double) super.anInt2921 + local678 * (double) arg1);
										super.anInt2919 = (int) ((double) super.anInt2919 + local686 * (double) arg1);
										super.anInt2917 = (int) ((double) super.anInt2917 + local694 * (double) arg1);
									}
								} else if (local447.anInt9202 == 0) {
									local296 += ((double) local444.anInt6246 - local553) * (double) arg1;
									local300 += ((double) local447.anInt9210 - local553) * (double) arg1;
									local304 += ((double) local444.anInt6243 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt2921 = (int) ((double) super.anInt2921 + ((double) local444.anInt6246 - local553) * (double) arg1);
									super.anInt2919 = (int) ((double) super.anInt2919 + ((double) local447.anInt9210 - local553) * (double) arg1);
									super.anInt2917 = (int) ((double) super.anInt2917 + ((double) local444.anInt6243 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray68 != null) {
			for (local317 = 0; local317 < local35.anIntArray68.length; local317++) {
				@Pc(776) Class2_Sub3_Sub10 local776 = (Class2_Sub3_Sub10) Static228.aClass296_1.method6774((long) local35.anIntArray68[local317]);
				while (local776 != null) {
					@Pc(780) Class349 local780 = local776.aClass349_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt6242);
					@Pc(792) double local792 = (double) (local22 - local776.anInt6247);
					@Pc(798) double local798 = (double) (local27 - local776.anInt6244);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong252) {
						local776 = (Class2_Sub3_Sub10) Static228.aClass296_1.method6778();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt6246 + local792 * (double) local780.anInt9210 + local798 * (double) local776.anInt6243) * 65535.0D / ((double) local780.anInt9211 * local825);
						if (local857 < (double) local780.anInt9204) {
							local776 = (Class2_Sub3_Sub10) Static228.aClass296_1.method6778();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt9207 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt9203;
							} else if (local780.anInt9207 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt9203;
							}
							if (local780.anInt9206 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt9211;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt9211;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt9211;
								if (local780.anInt9202 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt2921 = (int) ((double) super.anInt2921 + local996 * (double) arg1);
									super.anInt2919 = (int) ((double) super.anInt2919 + local1004 * (double) arg1);
									super.anInt2917 = (int) ((double) super.anInt2917 + local1012 * (double) arg1);
								}
							} else if (local780.anInt9202 == 0) {
								local296 += ((double) local776.anInt6246 - local871) * (double) arg1;
								local300 += ((double) local780.anInt9210 - local871) * (double) arg1;
								local304 += ((double) local776.anInt6243 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt2921 = (int) ((double) super.anInt2921 + ((double) local776.anInt6246 - local871) * (double) arg1);
								super.anInt2919 = (int) ((double) super.anInt2919 + ((double) local780.anInt9210 - local871) * (double) arg1);
								super.anInt2917 = (int) ((double) super.anInt2917 + ((double) local776.anInt6243 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub3_Sub10) Static228.aClass296_1.method6778();
						}
					}
				}
			}
		}
		if (local35.anIntArray71 != null) {
			if (local35.anIntArray70 == null) {
				local35.anIntArray70 = new int[local35.anIntArray71.length];
				for (local317 = 0; local317 < local35.anIntArray71.length; local317++) {
					Static185.method7626(local35.anIntArray71[local317]);
					local35.anIntArray70[local317] = ((Class2_Sub22) Static172.aClass162_18.method3519((long) local35.anIntArray71[local317])).anInt3866;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray70.length; local317++) {
				@Pc(1137) Class349 local1137 = Static347.aClass349Array1[local35.anIntArray70[local317]];
				if (local1137.anInt9202 == 0) {
					local296 += local1137.anInt9209 * arg1;
					local300 += local1137.anInt9210 * arg1;
					local304 += local1137.anInt9200 * arg1;
					local306 = true;
				} else {
					super.anInt2921 += local1137.anInt9209 * arg1;
					super.anInt2919 += local1137.anInt9210 * arg1;
					super.anInt2917 += local1137.anInt9200 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort33 = (short) local296;
					this.aShort34 = (short) local300;
					this.aShort29 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt2926 <<= 0x1;
			}
		}
		super.anInt2921 = (int) ((long) super.anInt2921 + ((long) this.aShort33 * (long) (this.anInt2926 << 2) >> 23) * (long) arg1);
		super.anInt2919 = (int) ((long) super.anInt2919 + ((long) this.aShort34 * (long) (this.anInt2926 << 2) >> 23) * (long) arg1);
		super.anInt2917 = (int) ((long) super.anInt2917 + ((long) this.aShort29 * (long) (this.anInt2926 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	public void method2376() {
		this.aClass6_Sub4_1.aClass6_Sub8_4.aClass6_Sub3_Sub1_Sub1Array26[this.aShort32] = null;
		Static414.aClass6_Sub3_Sub1_Sub1Array30[Static497.anInt8371] = this;
		Static497.anInt8371 = Static497.anInt8371 + 1 & 0x3FF;
		this.method7989();
		this.method6553();
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	private void method2377() {
		@Pc(4) int local4 = this.aClass6_Sub4_1.aClass6_Sub8_4.anInt8586;
		if (this.aClass6_Sub4_1.aClass6_Sub8_4.aClass6_Sub3_Sub1_Sub1Array26[local4] != null) {
			this.aClass6_Sub4_1.aClass6_Sub8_4.aClass6_Sub3_Sub1_Sub1Array26[local4].method2376();
		}
		this.aClass6_Sub4_1.aClass6_Sub8_4.aClass6_Sub3_Sub1_Sub1Array26[local4] = this;
		this.aShort32 = (short) this.aClass6_Sub4_1.aClass6_Sub8_4.anInt8586;
		this.aClass6_Sub4_1.aClass6_Sub8_4.anInt8586 = local4 + 1 & 0x1FFF;
		this.aClass6_Sub4_1.aClass109_4.method2313(this);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!fp;IIIIIIIIIIIZZ)V")
	public void method2378(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass6_Sub4_1 = arg0;
		super.anInt2921 = arg1 << 12;
		super.anInt2919 = arg2 << 12;
		super.anInt2917 = arg3 << 12;
		super.anInt2915 = arg9;
		this.aShort30 = this.aShort31 = (short) arg8;
		super.anInt2914 = arg10;
		super.anInt2924 = arg11;
		super.aBoolean238 = arg13;
		this.aShort33 = (short) arg4;
		this.aShort34 = (short) arg5;
		this.aShort29 = (short) arg6;
		this.anInt2926 = arg7;
		super.aByte45 = this.aClass6_Sub4_1.aClass139_1.aByte48;
		this.method2377();
	}
}
