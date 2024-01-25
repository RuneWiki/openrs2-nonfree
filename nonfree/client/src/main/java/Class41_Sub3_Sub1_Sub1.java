import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class41_Sub3_Sub1_Sub1 extends Class41_Sub3_Sub1 {

	@OriginalMember(owner = "client!oi", name = "D", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
	private int anInt6769;

	@OriginalMember(owner = "client!oi", name = "J", descriptor = "Lclient!bt;")
	public Class41_Sub1 aClass41_Sub1_1;

	@OriginalMember(owner = "client!oi", name = "G", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!oi", name = "H", descriptor = "S")
	private short aShort110;

	@OriginalMember(owner = "client!oi", name = "I", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!oi", name = "F", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!oi", name = "L", descriptor = "S")
	private short aShort112;

	@OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
	private int anInt6768;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!bt;IIIIIIIIIIIZZ)V")
	public Class41_Sub3_Sub1_Sub1(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub1_1 = arg0;
		super.anInt6767 = arg1 << 12;
		super.anInt6761 = arg2 << 12;
		super.anInt6766 = arg3 << 12;
		super.anInt6763 = arg9;
		this.aShort110 = this.aShort109 = (short) arg8;
		super.anInt6765 = arg10;
		super.anInt6764 = arg11;
		super.aBoolean504 = arg13;
		this.aShort111 = (short) arg4;
		this.aShort108 = (short) arg5;
		this.aShort112 = (short) arg6;
		this.anInt6768 = arg7;
		super.aByte79 = this.aClass41_Sub1_1.aClass248_1.aByte80;
		this.method5672();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
	private void method5672() {
		@Pc(4) int local4 = this.aClass41_Sub1_1.aClass41_Sub9_1.anInt9309;
		if (this.aClass41_Sub1_1.aClass41_Sub9_1.aClass41_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass41_Sub1_1.aClass41_Sub9_1.aClass41_Sub3_Sub1_Sub1Array2[local4].method5675();
		}
		this.aClass41_Sub1_1.aClass41_Sub9_1.aClass41_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort107 = (short) this.aClass41_Sub1_1.aClass41_Sub9_1.anInt9309;
		this.aClass41_Sub1_1.aClass41_Sub9_1.anInt9309 = local4 + 1 & 0x1FFF;
		this.aClass41_Sub1_1.aClass178_1.method4166(this);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(JI)V")
	public void method5673(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort109 = (short) (this.aShort109 - arg1);
		if (this.aShort109 <= 0) {
			this.method5675();
			return;
		}
		@Pc(17) int local17 = super.anInt6767 >> 12;
		@Pc(22) int local22 = super.anInt6761 >> 12;
		@Pc(27) int local27 = super.anInt6766 >> 12;
		@Pc(31) Class41_Sub9 local31 = this.aClass41_Sub1_1.aClass41_Sub9_1;
		@Pc(35) Class186 local35 = this.aClass41_Sub1_1.aClass186_1;
		if (local35.anInt4997 != 0) {
			@Pc(65) int local65;
			if (this.aShort110 - this.aShort109 <= local35.anInt5003) {
				local65 = (super.anInt6763 >> 8 & 0xFF00) + (this.anInt6769 >> 16 & 0xFF) + local35.anInt5011 * arg1;
				@Pc(82) int local82 = (super.anInt6763 & 0xFF00) + (this.anInt6769 >> 8 & 0xFF) + local35.anInt5036 * arg1;
				@Pc(99) int local99 = ((super.anInt6763 & 0xFF) << 8) + (this.anInt6769 & 0xFF) + local35.anInt4991 * arg1;
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
				super.anInt6763 &= 0xFF000000;
				super.anInt6763 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6769 &= 0xFF000000;
				this.anInt6769 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort110 - this.aShort109 <= local35.anInt4995) {
				local65 = (super.anInt6763 >> 16 & 0xFF00) + (this.anInt6769 >> 24 & 0xFF) + local35.anInt5018 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6763 &= 0xFFFFFF;
				super.anInt6763 |= (local65 & 0xFF00) << 16;
				this.anInt6769 &= 0xFFFFFF;
				this.anInt6769 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5035 != -1 && this.aShort110 - this.aShort109 <= local35.anInt5037) {
			this.anInt6768 += local35.anInt4994 * arg1;
		}
		if (local35.anInt5006 != -1 && this.aShort110 - this.aShort109 <= local35.lb) {
			super.anInt6765 += local35.anInt4990 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort111;
		@Pc(300) double local300 = (double) this.aShort108;
		@Pc(304) double local304 = (double) this.aShort112;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt5020 == 1) {
			local317 = local17 - this.aClass41_Sub1_1.aClass170_1.anInt4650;
			local324 = local22 - this.aClass41_Sub1_1.aClass170_1.anInt4658;
			local331 = local27 - this.aClass41_Sub1_1.aClass170_1.anInt4660;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt5004 * local348 * arg1;
			this.anInt6768 = (int) ((long) this.anInt6768 - ((long) this.anInt6768 * local356 >> 18));
		} else if (local35.anInt5020 == 2) {
			local317 = local17 - this.aClass41_Sub1_1.aClass170_1.anInt4650;
			local324 = local22 - this.aClass41_Sub1_1.aClass170_1.anInt4658;
			local331 = local27 - this.aClass41_Sub1_1.aClass170_1.anInt4660;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt5004 * local348 * arg1;
			this.anInt6768 = (int) ((long) this.anInt6768 - ((long) this.anInt6768 * local356 >> 28));
		}
		if (local35.anIntArray286 != null) {
			@Pc(437) Class3 local437 = local31.aClass112_73.aClass3_111;
			for (@Pc(440) Class3 local440 = local437.aClass3_286; local440 != local437; local440 = local440.aClass3_286) {
				@Pc(444) Class3_Sub7_Sub7 local444 = (Class3_Sub7_Sub7) local440;
				@Pc(447) Class334 local447 = local444.aClass334_1;
				if (local447.anInt8424 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray286.length; local455++) {
						if (local35.anIntArray286[local455] == local447.anInt8431) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt2997);
						@Pc(486) double local486 = (double) (local22 - local444.anInt2999);
						@Pc(492) double local492 = (double) (local27 - local444.anInt2996);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong246)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt2998 + local486 * (double) local447.anInt8437 + local492 * (double) local444.anInt2994) * 65535.0D / ((double) local447.anInt8439 * local513);
							if (!(local545 < (double) local447.anInt8440)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt8429 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt8425;
								} else if (local447.anInt8429 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt8425;
								}
								if (local447.anInt8435 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt8439;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt8439;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt8439;
									if (local447.anInt8426 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt6767 = (int) ((double) super.anInt6767 + local678 * (double) arg1);
										super.anInt6761 = (int) ((double) super.anInt6761 + local686 * (double) arg1);
										super.anInt6766 = (int) ((double) super.anInt6766 + local694 * (double) arg1);
									}
								} else if (local447.anInt8426 == 0) {
									local296 += ((double) local444.anInt2998 - local553) * (double) arg1;
									local300 += ((double) local447.anInt8437 - local553) * (double) arg1;
									local304 += ((double) local444.anInt2994 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt6767 = (int) ((double) super.anInt6767 + ((double) local444.anInt2998 - local553) * (double) arg1);
									super.anInt6761 = (int) ((double) super.anInt6761 + ((double) local447.anInt8437 - local553) * (double) arg1);
									super.anInt6766 = (int) ((double) super.anInt6766 + ((double) local444.anInt2994 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray283 != null) {
			for (local317 = 0; local317 < local35.anIntArray283.length; local317++) {
				@Pc(776) Class3_Sub7_Sub7 local776 = (Class3_Sub7_Sub7) Static437.aClass142_1.method3500((long) local35.anIntArray283[local317]);
				while (local776 != null) {
					@Pc(780) Class334 local780 = local776.aClass334_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt2997);
					@Pc(792) double local792 = (double) (local22 - local776.anInt2999);
					@Pc(798) double local798 = (double) (local27 - local776.anInt2996);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong246) {
						local776 = (Class3_Sub7_Sub7) Static437.aClass142_1.method3498();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt2998 + local792 * (double) local780.anInt8437 + local798 * (double) local776.anInt2994) * 65535.0D / ((double) local780.anInt8439 * local825);
						if (local857 < (double) local780.anInt8440) {
							local776 = (Class3_Sub7_Sub7) Static437.aClass142_1.method3498();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt8429 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt8425;
							} else if (local780.anInt8429 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt8425;
							}
							if (local780.anInt8435 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt8439;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt8439;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt8439;
								if (local780.anInt8426 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt6767 = (int) ((double) super.anInt6767 + local996 * (double) arg1);
									super.anInt6761 = (int) ((double) super.anInt6761 + local1004 * (double) arg1);
									super.anInt6766 = (int) ((double) super.anInt6766 + local1012 * (double) arg1);
								}
							} else if (local780.anInt8426 == 0) {
								local296 += ((double) local776.anInt2998 - local871) * (double) arg1;
								local300 += ((double) local780.anInt8437 - local871) * (double) arg1;
								local304 += ((double) local776.anInt2994 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt6767 = (int) ((double) super.anInt6767 + ((double) local776.anInt2998 - local871) * (double) arg1);
								super.anInt6761 = (int) ((double) super.anInt6761 + ((double) local780.anInt8437 - local871) * (double) arg1);
								super.anInt6766 = (int) ((double) super.anInt6766 + ((double) local776.anInt2994 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub7_Sub7) Static437.aClass142_1.method3498();
						}
					}
				}
			}
		}
		if (local35.anIntArray285 != null) {
			if (local35.anIntArray284 == null) {
				local35.anIntArray284 = new int[local35.anIntArray285.length];
				for (local317 = 0; local317 < local35.anIntArray285.length; local317++) {
					Static66.method1443(local35.anIntArray285[local317]);
					local35.anIntArray284[local317] = ((Class3_Sub17) Static495.aClass354_38.method7689((long) local35.anIntArray285[local317])).anInt3217;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray284.length; local317++) {
				@Pc(1137) Class334 local1137 = Static422.aClass334Array5[local35.anIntArray284[local317]];
				if (local1137.anInt8426 == 0) {
					local296 += local1137.anInt8427 * arg1;
					local300 += local1137.anInt8437 * arg1;
					local304 += local1137.anInt8436 * arg1;
					local306 = true;
				} else {
					super.anInt6767 += local1137.anInt8427 * arg1;
					super.anInt6761 += local1137.anInt8437 * arg1;
					super.anInt6766 += local1137.anInt8436 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort111 = (short) local296;
					this.aShort108 = (short) local300;
					this.aShort112 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt6768 <<= 0x1;
			}
		}
		super.anInt6767 = (int) ((long) super.anInt6767 + ((long) this.aShort111 * (long) (this.anInt6768 << 2) >> 23) * (long) arg1);
		super.anInt6761 = (int) ((long) super.anInt6761 + ((long) this.aShort108 * (long) (this.anInt6768 << 2) >> 23) * (long) arg1);
		super.anInt6766 = (int) ((long) super.anInt6766 + ((long) this.aShort112 * (long) (this.anInt6768 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!r;J)V")
	public void method5674(@OriginalArg(0) Class45 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt6767 >> Static315.anInt5369 + 12;
		@Pc(13) int local13 = super.anInt6766 >> Static315.anInt5369 + 12;
		@Pc(18) int local18 = super.anInt6761 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static155.anInt3254 || local13 < 0 || local13 >= Static39.anInt747) {
			this.method5675();
			return;
		}
		@Pc(40) Class41_Sub9 local40 = this.aClass41_Sub1_1.aClass41_Sub9_1;
		@Pc(44) Class186 local44 = this.aClass41_Sub1_1.aClass186_1;
		@Pc(46) Class34[] local46 = Static68.aClass34Array1;
		@Pc(49) int local49 = local40.anInt9311;
		@Pc(58) Class299 local58 = Static309.aClass299ArrayArrayArray3[local40.anInt9311][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte101;
		}
		@Pc(71) int local71 = local46[local49].method6525(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static459.anInt7698 - 1) {
			local86 = local46[local49 + 1].method6525(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static315.anInt5369);
		}
		if (local44.aBoolean367) {
			if (local44.anInt5029 == -1 && local18 > local71) {
				this.method5675();
				return;
			}
			if (local44.anInt5029 >= 0 && local18 > local46[local44.anInt5029].method6525(local13, local6)) {
				this.method5675();
				return;
			}
			if (local44.anInt5031 == -1 && local18 < local86) {
				this.method5675();
				return;
			}
			if (local44.anInt5031 >= 0 && local18 < local46[local44.anInt5031 + 1].method6525(local13, local6)) {
				this.method5675();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static459.anInt7698 - 1; local154 > 0 && local18 > local46[local154].method6525(local13, local6); local154--) {
		}
		if (local44.aBoolean366 && local154 == 0 && local18 > local46[0].method6525(local13, local6)) {
			this.method5675();
		} else if (local154 == Static459.anInt7698 - 1 && local46[local154].method6525(local13, local6) - local18 > 0x8 << Static315.anInt5369) {
			this.method5675();
		} else {
			local58 = Static309.aClass299ArrayArrayArray3[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static309.aClass299ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static309.aClass299ArrayArrayArray3[0][local6][local13] = new Class299(0);
				}
				@Pc(251) boolean local251 = Static309.aClass299ArrayArrayArray3[0][local6][local13].aClass299_1 != null;
				if (local154 == 3 && local251) {
					this.method5675();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static309.aClass299ArrayArrayArray3[local261][local6][local13] == null) {
						local58 = Static309.aClass299ArrayArrayArray3[local261][local6][local13] = new Class299(local261);
						if (local251) {
							local58.aByte101++;
						}
					}
				}
			}
			if (local44.aBoolean372) {
				@Pc(304) int local304 = super.anInt6767 >> 12;
				local261 = super.anInt6766 >> 12;
				@Pc(318) Class189 local318;
				if (local58.aClass41_Sub2_Sub3_1 != null) {
					local318 = local58.aClass41_Sub2_Sub3_1.method7845(arg0);
					if (local318 != null && local318.method4431(local261, local304, local18)) {
						this.method5675();
						return;
					}
				}
				if (local58.aClass41_Sub2_Sub3_2 != null) {
					local318 = local58.aClass41_Sub2_Sub3_2.method7845(arg0);
					if (local318 != null && local318.method4431(local261, local304, local18)) {
						this.method5675();
						return;
					}
				}
				if (local58.aClass41_Sub2_Sub5_1 != null) {
					local318 = local58.aClass41_Sub2_Sub5_1.method7845(arg0);
					if (local318 != null && local318.method4431(local261, local304, local18)) {
						this.method5675();
						return;
					}
				}
				for (@Pc(375) Class38 local375 = local58.aClass38_2; local375 != null; local375 = local375.aClass38_1) {
					@Pc(382) Class189 local382 = local375.aClass41_Sub2_Sub1_1.method7845(arg0);
					if (local382 != null && local382.method4431(local261, local304, local18)) {
						this.method5675();
						return;
					}
				}
			}
			local40.aClass283_1.aClass206_1.method4712(this);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()V")
	public void method5675() {
		this.aClass41_Sub1_1.aClass41_Sub9_1.aClass41_Sub3_Sub1_Sub1Array2[this.aShort107] = null;
		Static492.aClass41_Sub3_Sub1_Sub1Array1[Static162.anInt987] = this;
		Static162.anInt987 = Static162.anInt987 + 1 & 0x3FF;
		this.method7833();
		this.method5762();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!bt;IIIIIIIIIIIZZ)V")
	public void method5676(@OriginalArg(0) Class41_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass41_Sub1_1 = arg0;
		super.anInt6767 = arg1 << 12;
		super.anInt6761 = arg2 << 12;
		super.anInt6766 = arg3 << 12;
		super.anInt6763 = arg9;
		this.aShort110 = this.aShort109 = (short) arg8;
		super.anInt6765 = arg10;
		super.anInt6764 = arg11;
		super.aBoolean504 = arg13;
		this.aShort111 = (short) arg4;
		this.aShort108 = (short) arg5;
		this.aShort112 = (short) arg6;
		this.anInt6768 = arg7;
		super.aByte79 = this.aClass41_Sub1_1.aClass248_1.aByte80;
		this.method5672();
	}
}
