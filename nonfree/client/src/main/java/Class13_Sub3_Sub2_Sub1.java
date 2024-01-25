import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class13_Sub3_Sub2_Sub1 extends Class13_Sub3_Sub2 {

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
	private int anInt5962;

	@OriginalMember(owner = "client!nk", name = "I", descriptor = "Lclient!pt;")
	public Class13_Sub10 aClass13_Sub10_1;

	@OriginalMember(owner = "client!nk", name = "E", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
	private int anInt5961;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!pt;IIIIIIIIIIIZZ)V")
	public Class13_Sub3_Sub2_Sub1(@OriginalArg(0) Class13_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass13_Sub10_1 = arg0;
		super.anInt5953 = arg1 << 12;
		super.anInt5959 = arg2 << 12;
		super.anInt5954 = arg3 << 12;
		super.anInt5957 = arg9;
		this.aShort80 = this.aShort79 = (short) arg8;
		super.anInt5956 = arg10;
		super.anInt5952 = arg11;
		super.aBoolean432 = arg13;
		this.aShort83 = (short) arg4;
		this.aShort82 = (short) arg5;
		this.aShort81 = (short) arg6;
		this.anInt5961 = arg7;
		super.aByte93 = this.aClass13_Sub10_1.aClass143_2.aByte40;
		this.method5099();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!pt;IIIIIIIIIIIZZ)V")
	public void method5095(@OriginalArg(0) Class13_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass13_Sub10_1 = arg0;
		super.anInt5953 = arg1 << 12;
		super.anInt5959 = arg2 << 12;
		super.anInt5954 = arg3 << 12;
		super.anInt5957 = arg9;
		this.aShort80 = this.aShort79 = (short) arg8;
		super.anInt5956 = arg10;
		super.anInt5952 = arg11;
		super.aBoolean432 = arg13;
		this.aShort83 = (short) arg4;
		this.aShort82 = (short) arg5;
		this.aShort81 = (short) arg6;
		this.anInt5961 = arg7;
		super.aByte93 = this.aClass13_Sub10_1.aClass143_2.aByte40;
		this.method5099();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method5096(@OriginalArg(0) Class95 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt5953 >> Static609.anInt9827 + 12;
		@Pc(13) int local13 = super.anInt5954 >> Static609.anInt9827 + 12;
		@Pc(18) int local18 = super.anInt5959 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static322.anInt5120 || local13 < 0 || local13 >= Class13_Sub1_Sub4_Sub1.lb) {
			this.method5098();
			return;
		}
		@Pc(40) Class13_Sub9 local40 = this.aClass13_Sub10_1.aClass13_Sub9_7;
		@Pc(44) Class259 local44 = this.aClass13_Sub10_1.aClass259_1;
		@Pc(46) Class76[] local46 = Static314.aClass76Array2;
		@Pc(49) int local49 = local40.anInt6675;
		@Pc(58) Class53 local58 = Static28.aClass53ArrayArrayArray1[local40.anInt6675][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte28;
		}
		@Pc(71) int local71 = local46[local49].method7396(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static10.anInt139 - 1) {
			local86 = local46[local49 + 1].method7396(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static609.anInt9827);
		}
		if (local44.aBoolean465) {
			if (local44.anInt6521 == -1 && local18 > local71) {
				this.method5098();
				return;
			}
			if (local44.anInt6521 >= 0 && local18 > local46[local44.anInt6521].method7396(local13, local6)) {
				this.method5098();
				return;
			}
			if (local44.anInt6525 == -1 && local18 < local86) {
				this.method5098();
				return;
			}
			if (local44.anInt6525 >= 0 && local18 < local46[local44.anInt6525 + 1].method7396(local13, local6)) {
				this.method5098();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static10.anInt139 - 1; local154 > 0 && local18 > local46[local154].method7396(local13, local6); local154--) {
		}
		if (local44.aBoolean462 && local154 == 0 && local18 > local46[0].method7396(local13, local6)) {
			this.method5098();
		} else if (local154 == Static10.anInt139 - 1 && local46[local154].method7396(local13, local6) - local18 > 0x8 << Static609.anInt9827) {
			this.method5098();
		} else {
			local58 = Static28.aClass53ArrayArrayArray1[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static28.aClass53ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static28.aClass53ArrayArrayArray1[0][local6][local13] = new Class53(0);
				}
				@Pc(251) boolean local251 = Static28.aClass53ArrayArrayArray1[0][local6][local13].aClass53_1 != null;
				if (local154 == 3 && local251) {
					this.method5098();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static28.aClass53ArrayArrayArray1[local261][local6][local13] == null) {
						local58 = Static28.aClass53ArrayArrayArray1[local261][local6][local13] = new Class53(local261);
						if (local251) {
							local58.aByte28++;
						}
					}
				}
			}
			if (local44.aBoolean463) {
				@Pc(304) int local304 = super.anInt5953 >> 12;
				local261 = super.anInt5954 >> 12;
				@Pc(318) Class128 local318;
				if (local58.aClass13_Sub1_Sub4_1 != null) {
					local318 = local58.aClass13_Sub1_Sub4_1.method8412(arg0);
					if (local318 != null && local318.method2771(local304, local18, local261)) {
						this.method5098();
						return;
					}
				}
				if (local58.aClass13_Sub1_Sub4_2 != null) {
					local318 = local58.aClass13_Sub1_Sub4_2.method8412(arg0);
					if (local318 != null && local318.method2771(local304, local18, local261)) {
						this.method5098();
						return;
					}
				}
				if (local58.aClass13_Sub1_Sub2_1 != null) {
					local318 = local58.aClass13_Sub1_Sub2_1.method8412(arg0);
					if (local318 != null && local318.method2771(local304, local18, local261)) {
						this.method5098();
						return;
					}
				}
				for (@Pc(375) Class325 local375 = local58.aClass325_1; local375 != null; local375 = local375.aClass325_3) {
					@Pc(382) Class128 local382 = local375.aClass13_Sub1_Sub1_1.method8412(arg0);
					if (local382 != null && local382.method2771(local304, local18, local261)) {
						this.method5098();
						return;
					}
				}
			}
			local40.aClass98_1.aClass220_1.method4636(this);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
	public void method5097(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort79 = (short) (this.aShort79 - arg1);
		if (this.aShort79 <= 0) {
			this.method5098();
			return;
		}
		@Pc(17) int local17 = super.anInt5953 >> 12;
		@Pc(22) int local22 = super.anInt5959 >> 12;
		@Pc(27) int local27 = super.anInt5954 >> 12;
		@Pc(31) Class13_Sub9 local31 = this.aClass13_Sub10_1.aClass13_Sub9_7;
		@Pc(35) Class259 local35 = this.aClass13_Sub10_1.aClass259_1;
		if (local35.anInt6489 != 0) {
			@Pc(65) int local65;
			if (this.aShort80 - this.aShort79 <= local35.anInt6517) {
				local65 = (super.anInt5957 >> 8 & 0xFF00) + (this.anInt5962 >> 16 & 0xFF) + local35.anInt6509 * arg1;
				@Pc(82) int local82 = (super.anInt5957 & 0xFF00) + (this.anInt5962 >> 8 & 0xFF) + local35.anInt6491 * arg1;
				@Pc(99) int local99 = ((super.anInt5957 & 0xFF) << 8) + (this.anInt5962 & 0xFF) + local35.anInt6484 * arg1;
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
				super.anInt5957 &= 0xFF000000;
				super.anInt5957 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5962 &= 0xFF000000;
				this.anInt5962 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort80 - this.aShort79 <= local35.anInt6498) {
				local65 = (super.anInt5957 >> 16 & 0xFF00) + (this.anInt5962 >> 24 & 0xFF) + local35.anInt6505 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5957 &= 0xFFFFFF;
				super.anInt5957 |= (local65 & 0xFF00) << 16;
				this.anInt5962 &= 0xFFFFFF;
				this.anInt5962 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6499 != -1 && this.aShort80 - this.aShort79 <= local35.anInt6481) {
			this.anInt5961 += local35.anInt6523 * arg1;
		}
		if (local35.anInt6496 != -1 && this.aShort80 - this.aShort79 <= local35.anInt6522) {
			super.anInt5956 += local35.anInt6501 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort83;
		@Pc(300) double local300 = (double) this.aShort82;
		@Pc(304) double local304 = (double) this.aShort81;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt6502 == 1) {
			local317 = local17 - this.aClass13_Sub10_1.aClass280_1.anInt7365;
			local324 = local22 - this.aClass13_Sub10_1.aClass280_1.anInt7366;
			local331 = local27 - this.aClass13_Sub10_1.aClass280_1.anInt7367;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt6513 * local348 * arg1;
			this.anInt5961 = (int) ((long) this.anInt5961 - ((long) this.anInt5961 * local356 >> 18));
		} else if (local35.anInt6502 == 2) {
			local317 = local17 - this.aClass13_Sub10_1.aClass280_1.anInt7365;
			local324 = local22 - this.aClass13_Sub10_1.aClass280_1.anInt7366;
			local331 = local27 - this.aClass13_Sub10_1.aClass280_1.anInt7367;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt6513 * local348 * arg1;
			this.anInt5961 = (int) ((long) this.anInt5961 - ((long) this.anInt5961 * local356 >> 28));
		}
		if (local35.anIntArray475 != null) {
			@Pc(437) Class2 local437 = local31.aClass109_42.aClass2_78;
			for (@Pc(440) Class2 local440 = local437.aClass2_300; local440 != local437; local440 = local440.aClass2_300) {
				@Pc(444) Class2_Sub2_Sub2 local444 = (Class2_Sub2_Sub2) local440;
				@Pc(447) Class312 local447 = local444.aClass312_1;
				if (local447.anInt8526 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray475.length; local455++) {
						if (local35.anIntArray475[local455] == local447.anInt8524) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt226);
						@Pc(486) double local486 = (double) (local22 - local444.anInt228);
						@Pc(492) double local492 = (double) (local27 - local444.anInt223);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong230)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt224 + local486 * (double) local447.anInt8530 + local492 * (double) local444.anInt229) * 65535.0D / ((double) local447.anInt8522 * local513);
							if (!(local545 < (double) local447.anInt8520)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt8529 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt8523;
								} else if (local447.anInt8529 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt8523;
								}
								if (local447.anInt8516 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt8522;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt8522;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt8522;
									if (local447.anInt8517 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt5953 = (int) ((double) super.anInt5953 + local678 * (double) arg1);
										super.anInt5959 = (int) ((double) super.anInt5959 + local686 * (double) arg1);
										super.anInt5954 = (int) ((double) super.anInt5954 + local694 * (double) arg1);
									}
								} else if (local447.anInt8517 == 0) {
									local296 += ((double) local444.anInt224 - local553) * (double) arg1;
									local300 += ((double) local447.anInt8530 - local553) * (double) arg1;
									local304 += ((double) local444.anInt229 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt5953 = (int) ((double) super.anInt5953 + ((double) local444.anInt224 - local553) * (double) arg1);
									super.anInt5959 = (int) ((double) super.anInt5959 + ((double) local447.anInt8530 - local553) * (double) arg1);
									super.anInt5954 = (int) ((double) super.anInt5954 + ((double) local444.anInt229 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray476 != null) {
			for (local317 = 0; local317 < local35.anIntArray476.length; local317++) {
				@Pc(776) Class2_Sub2_Sub2 local776 = (Class2_Sub2_Sub2) Static2.aClass343_1.method7638((long) local35.anIntArray476[local317]);
				while (local776 != null) {
					@Pc(780) Class312 local780 = local776.aClass312_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt226);
					@Pc(792) double local792 = (double) (local22 - local776.anInt228);
					@Pc(798) double local798 = (double) (local27 - local776.anInt223);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong230) {
						local776 = (Class2_Sub2_Sub2) Static2.aClass343_1.method7647();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt224 + local792 * (double) local780.anInt8530 + local798 * (double) local776.anInt229) * 65535.0D / ((double) local780.anInt8522 * local825);
						if (local857 < (double) local780.anInt8520) {
							local776 = (Class2_Sub2_Sub2) Static2.aClass343_1.method7647();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt8529 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt8523;
							} else if (local780.anInt8529 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt8523;
							}
							if (local780.anInt8516 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt8522;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt8522;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt8522;
								if (local780.anInt8517 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt5953 = (int) ((double) super.anInt5953 + local996 * (double) arg1);
									super.anInt5959 = (int) ((double) super.anInt5959 + local1004 * (double) arg1);
									super.anInt5954 = (int) ((double) super.anInt5954 + local1012 * (double) arg1);
								}
							} else if (local780.anInt8517 == 0) {
								local296 += ((double) local776.anInt224 - local871) * (double) arg1;
								local300 += ((double) local780.anInt8530 - local871) * (double) arg1;
								local304 += ((double) local776.anInt229 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt5953 = (int) ((double) super.anInt5953 + ((double) local776.anInt224 - local871) * (double) arg1);
								super.anInt5959 = (int) ((double) super.anInt5959 + ((double) local780.anInt8530 - local871) * (double) arg1);
								super.anInt5954 = (int) ((double) super.anInt5954 + ((double) local776.anInt229 - local871) * (double) arg1);
							}
							local776 = (Class2_Sub2_Sub2) Static2.aClass343_1.method7647();
						}
					}
				}
			}
		}
		if (local35.anIntArray477 != null) {
			if (local35.anIntArray478 == null) {
				local35.anIntArray478 = new int[local35.anIntArray477.length];
				for (local317 = 0; local317 < local35.anIntArray477.length; local317++) {
					Static496.method6878(local35.anIntArray477[local317]);
					local35.anIntArray478[local317] = ((Class2_Sub30) Static4.aClass118_3.method2595((long) local35.anIntArray477[local317])).anInt5508;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray478.length; local317++) {
				@Pc(1137) Class312 local1137 = Static539.aClass312Array1[local35.anIntArray478[local317]];
				if (local1137.anInt8517 == 0) {
					local296 += local1137.anInt8514 * arg1;
					local300 += local1137.anInt8530 * arg1;
					local304 += local1137.anInt8518 * arg1;
					local306 = true;
				} else {
					super.anInt5953 += local1137.anInt8514 * arg1;
					super.anInt5959 += local1137.anInt8530 * arg1;
					super.anInt5954 += local1137.anInt8518 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort83 = (short) local296;
					this.aShort82 = (short) local300;
					this.aShort81 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt5961 <<= 0x1;
			}
		}
		super.anInt5953 = (int) ((long) super.anInt5953 + ((long) this.aShort83 * (long) (this.anInt5961 << 2) >> 23) * (long) arg1);
		super.anInt5959 = (int) ((long) super.anInt5959 + ((long) this.aShort82 * (long) (this.anInt5961 << 2) >> 23) * (long) arg1);
		super.anInt5954 = (int) ((long) super.anInt5954 + ((long) this.aShort81 * (long) (this.anInt5961 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
	public void method5098() {
		this.aClass13_Sub10_1.aClass13_Sub9_7.aClass13_Sub3_Sub2_Sub1Array1[this.aShort84] = null;
		Static429.aClass13_Sub3_Sub2_Sub1Array2[Static92.anInt1711] = this;
		Static92.anInt1711 = Static92.anInt1711 + 1 & 0x3FF;
		this.method8394();
		this.method5088();
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
	private void method5099() {
		@Pc(4) int local4 = this.aClass13_Sub10_1.aClass13_Sub9_7.anInt6673;
		if (this.aClass13_Sub10_1.aClass13_Sub9_7.aClass13_Sub3_Sub2_Sub1Array1[local4] != null) {
			this.aClass13_Sub10_1.aClass13_Sub9_7.aClass13_Sub3_Sub2_Sub1Array1[local4].method5098();
		}
		this.aClass13_Sub10_1.aClass13_Sub9_7.aClass13_Sub3_Sub2_Sub1Array1[local4] = this;
		this.aShort84 = (short) this.aClass13_Sub10_1.aClass13_Sub9_7.anInt6673;
		this.aClass13_Sub10_1.aClass13_Sub9_7.anInt6673 = local4 + 1 & 0x1FFF;
		this.aClass13_Sub10_1.aClass171_7.method3746(this);
	}
}
