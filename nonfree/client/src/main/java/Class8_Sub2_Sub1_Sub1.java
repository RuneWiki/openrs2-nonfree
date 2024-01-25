import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class8_Sub2_Sub1_Sub1 extends Class8_Sub2_Sub1 {

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	private int anInt5214;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "Lclient!or;")
	public Class8_Sub8 aClass8_Sub8_1;

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!lk", name = "H", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
	private int anInt5215;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!or;IIIIIIIIIIIZZ)V")
	public Class8_Sub2_Sub1_Sub1(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass8_Sub8_1 = arg0;
		super.anInt5208 = arg1 << 12;
		super.anInt5211 = arg2 << 12;
		super.anInt5210 = arg3 << 12;
		super.anInt5209 = arg9;
		this.aShort67 = this.aShort65 = (short) arg8;
		super.anInt5212 = arg10;
		super.anInt5213 = arg11;
		super.aBoolean421 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort68 = (short) arg5;
		this.aShort66 = (short) arg6;
		this.anInt5215 = arg7;
		super.aByte80 = this.aClass8_Sub8_1.aClass206_2.aByte77;
		this.method4233();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
	public void method4232() {
		this.aClass8_Sub8_1.aClass8_Sub7_6.aClass8_Sub2_Sub1_Sub1Array1[this.aShort69] = null;
		Static434.aClass8_Sub2_Sub1_Sub1Array2[Static301.anInt5192] = this;
		Static301.anInt5192 = Static301.anInt5192 + 1 & 0x3FF;
		this.method7615();
		this.method7400();
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()V")
	private void method4233() {
		@Pc(4) int local4 = this.aClass8_Sub8_1.aClass8_Sub7_6.anInt5414;
		if (this.aClass8_Sub8_1.aClass8_Sub7_6.aClass8_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass8_Sub8_1.aClass8_Sub7_6.aClass8_Sub2_Sub1_Sub1Array1[local4].method4232();
		}
		this.aClass8_Sub8_1.aClass8_Sub7_6.aClass8_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort69 = (short) this.aClass8_Sub8_1.aClass8_Sub7_6.anInt5414;
		this.aClass8_Sub8_1.aClass8_Sub7_6.anInt5414 = local4 + 1 & 0x1FFF;
		this.aClass8_Sub8_1.aClass209_5.method4190(this);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!or;IIIIIIIIIIIZZ)V")
	public void method4234(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass8_Sub8_1 = arg0;
		super.anInt5208 = arg1 << 12;
		super.anInt5211 = arg2 << 12;
		super.anInt5210 = arg3 << 12;
		super.anInt5209 = arg9;
		this.aShort67 = this.aShort65 = (short) arg8;
		super.anInt5212 = arg10;
		super.anInt5213 = arg11;
		super.aBoolean421 = arg13;
		this.aShort64 = (short) arg4;
		this.aShort68 = (short) arg5;
		this.aShort66 = (short) arg6;
		this.anInt5215 = arg7;
		super.aByte80 = this.aClass8_Sub8_1.aClass206_2.aByte77;
		this.method4233();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!r;J)V")
	public void method4235(@OriginalArg(0) Class134 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt5208 >> Static351.anInt5832 + 12;
		@Pc(13) int local13 = super.anInt5210 >> Static351.anInt5832 + 12;
		@Pc(18) int local18 = super.anInt5211 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static27.anInt373 || local13 < 0 || local13 >= Static507.anInt8645) {
			this.method4232();
			return;
		}
		@Pc(40) Class8_Sub7 local40 = this.aClass8_Sub8_1.aClass8_Sub7_6;
		@Pc(44) Class243 local44 = this.aClass8_Sub8_1.aClass243_1;
		@Pc(46) Class47[] local46 = Static199.aClass47Array1;
		@Pc(49) int local49 = local40.anInt5417;
		@Pc(58) Class39 local58 = Static292.aClass39ArrayArrayArray2[local40.anInt5417][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte21;
		}
		@Pc(71) int local71 = local46[local49].method7545(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static175.anInt9133 - 1) {
			local86 = local46[local49 + 1].method7545(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static351.anInt5832);
		}
		if (local44.aBoolean474) {
			if (local44.anInt6079 == -1 && local18 > local71) {
				this.method4232();
				return;
			}
			if (local44.anInt6079 >= 0 && local18 > local46[local44.anInt6079].method7545(local6, local13)) {
				this.method4232();
				return;
			}
			if (local44.anInt6066 == -1 && local18 < local86) {
				this.method4232();
				return;
			}
			if (local44.anInt6066 >= 0 && local18 < local46[local44.anInt6066 + 1].method7545(local6, local13)) {
				this.method4232();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static175.anInt9133 - 1; local154 > 0 && local18 > local46[local154].method7545(local6, local13); local154--) {
		}
		if (local44.aBoolean480 && local154 == 0 && local18 > local46[0].method7545(local6, local13)) {
			this.method4232();
		} else if (local154 == Static175.anInt9133 - 1 && local46[local154].method7545(local6, local13) - local18 > 0x8 << Static351.anInt5832) {
			this.method4232();
		} else {
			local58 = Static292.aClass39ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static292.aClass39ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static292.aClass39ArrayArrayArray2[0][local6][local13] = new Class39(0);
				}
				@Pc(251) boolean local251 = Static292.aClass39ArrayArrayArray2[0][local6][local13].aClass39_1 != null;
				if (local154 == 3 && local251) {
					this.method4232();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static292.aClass39ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static292.aClass39ArrayArrayArray2[local261][local6][local13] = new Class39(local261);
						if (local251) {
							local58.aByte21++;
						}
					}
				}
			}
			if (local44.aBoolean475) {
				@Pc(304) int local304 = super.anInt5208 >> 12;
				local261 = super.anInt5210 >> 12;
				@Pc(318) Class242 local318;
				if (local58.aClass8_Sub3_Sub4_1 != null) {
					local318 = local58.aClass8_Sub3_Sub4_1.method7627(arg0);
					if (local318 != null && local318.method4920(local304, local18, local261)) {
						this.method4232();
						return;
					}
				}
				if (local58.aClass8_Sub3_Sub4_2 != null) {
					local318 = local58.aClass8_Sub3_Sub4_2.method7627(arg0);
					if (local318 != null && local318.method4920(local304, local18, local261)) {
						this.method4232();
						return;
					}
				}
				if (local58.aClass8_Sub3_Sub1_1 != null) {
					local318 = local58.aClass8_Sub3_Sub1_1.method7627(arg0);
					if (local318 != null && local318.method4920(local304, local18, local261)) {
						this.method4232();
						return;
					}
				}
				for (@Pc(375) Class111 local375 = local58.aClass111_1; local375 != null; local375 = local375.aClass111_2) {
					@Pc(382) Class242 local382 = local375.aClass8_Sub3_Sub3_1.method7627(arg0);
					if (local382 != null && local382.method4920(local304, local18, local261)) {
						this.method4232();
						return;
					}
				}
			}
			local40.aClass343_1.aClass355_1.method7729(this);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(JI)V")
	public void method4236(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort65 = (short) (this.aShort65 - arg1);
		if (this.aShort65 <= 0) {
			this.method4232();
			return;
		}
		@Pc(17) int local17 = super.anInt5208 >> 12;
		@Pc(22) int local22 = super.anInt5211 >> 12;
		@Pc(27) int local27 = super.anInt5210 >> 12;
		@Pc(31) Class8_Sub7 local31 = this.aClass8_Sub8_1.aClass8_Sub7_6;
		@Pc(35) Class243 local35 = this.aClass8_Sub8_1.aClass243_1;
		if (local35.anInt6078 != 0) {
			@Pc(65) int local65;
			if (this.aShort67 - this.aShort65 <= local35.anInt6047) {
				local65 = (super.anInt5209 >> 8 & 0xFF00) + (this.anInt5214 >> 16 & 0xFF) + local35.anInt6040 * arg1;
				@Pc(82) int local82 = (super.anInt5209 & 0xFF00) + (this.anInt5214 >> 8 & 0xFF) + local35.anInt6083 * arg1;
				@Pc(99) int local99 = ((super.anInt5209 & 0xFF) << 8) + (this.anInt5214 & 0xFF) + local35.anInt6070 * arg1;
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
				super.anInt5209 &= 0xFF000000;
				super.anInt5209 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5214 &= 0xFF000000;
				this.anInt5214 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort67 - this.aShort65 <= local35.anInt6075) {
				local65 = (super.anInt5209 >> 16 & 0xFF00) + (this.anInt5214 >> 24 & 0xFF) + local35.anInt6068 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5209 &= 0xFFFFFF;
				super.anInt5209 |= (local65 & 0xFF00) << 16;
				this.anInt5214 &= 0xFFFFFF;
				this.anInt5214 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6080 != -1 && this.aShort67 - this.aShort65 <= local35.anInt6049) {
			this.anInt5215 += local35.anInt6084 * arg1;
		}
		if (local35.anInt6087 != -1 && this.aShort67 - this.aShort65 <= local35.anInt6052) {
			super.anInt5212 += local35.anInt6050 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort64;
		@Pc(300) double local300 = (double) this.aShort68;
		@Pc(304) double local304 = (double) this.aShort66;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt6077 == 1) {
			local317 = local17 - this.aClass8_Sub8_1.aClass175_1.anInt4528;
			local324 = local22 - this.aClass8_Sub8_1.aClass175_1.anInt4521;
			local331 = local27 - this.aClass8_Sub8_1.aClass175_1.anInt4533;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = local35.anInt6074 * local348 * arg1;
			this.anInt5215 = (int) ((long) this.anInt5215 - ((long) this.anInt5215 * local356 >> 18));
		} else if (local35.anInt6077 == 2) {
			local317 = local17 - this.aClass8_Sub8_1.aClass175_1.anInt4528;
			local324 = local22 - this.aClass8_Sub8_1.aClass175_1.anInt4521;
			local331 = local27 - this.aClass8_Sub8_1.aClass175_1.anInt4533;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = local35.anInt6074 * local348 * arg1;
			this.anInt5215 = (int) ((long) this.anInt5215 - ((long) this.anInt5215 * local356 >> 28));
		}
		if (local35.anIntArray492 != null) {
			@Pc(437) Class1 local437 = local31.aClass353_35.aClass1_271;
			for (@Pc(440) Class1 local440 = local437.aClass1_285; local440 != local437; local440 = local440.aClass1_285) {
				@Pc(444) Class1_Sub6_Sub15 local444 = (Class1_Sub6_Sub15) local440;
				@Pc(447) Class50 local447 = local444.aClass50_1;
				if (local447.anInt1078 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray492.length; local455++) {
						if (local35.anIntArray492[local455] == local447.anInt1083) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt8156);
						@Pc(486) double local486 = (double) (local22 - local444.anInt8159);
						@Pc(492) double local492 = (double) (local27 - local444.anInt8161);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong42)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt8158 + local486 * (double) local447.anInt1091 + local492 * (double) local444.anInt8153) * 65535.0D / ((double) local447.anInt1080 * local513);
							if (!(local545 < (double) local447.anInt1090)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt1092 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt1082;
								} else if (local447.anInt1092 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt1082;
								}
								if (local447.anInt1081 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt1080;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt1080;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt1080;
									if (local447.anInt1079 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt5208 = (int) ((double) super.anInt5208 + local678 * (double) arg1);
										super.anInt5211 = (int) ((double) super.anInt5211 + local686 * (double) arg1);
										super.anInt5210 = (int) ((double) super.anInt5210 + local694 * (double) arg1);
									}
								} else if (local447.anInt1079 == 0) {
									local296 += ((double) local444.anInt8158 - local553) * (double) arg1;
									local300 += ((double) local447.anInt1091 - local553) * (double) arg1;
									local304 += ((double) local444.anInt8153 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt5208 = (int) ((double) super.anInt5208 + ((double) local444.anInt8158 - local553) * (double) arg1);
									super.anInt5211 = (int) ((double) super.anInt5211 + ((double) local447.anInt1091 - local553) * (double) arg1);
									super.anInt5210 = (int) ((double) super.anInt5210 + ((double) local444.anInt8153 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray495 != null) {
			for (local317 = 0; local317 < local35.anIntArray495.length; local317++) {
				@Pc(776) Class1_Sub6_Sub15 local776 = (Class1_Sub6_Sub15) Static228.aClass117_1.method2288((long) local35.anIntArray495[local317]);
				while (local776 != null) {
					@Pc(780) Class50 local780 = local776.aClass50_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt8156);
					@Pc(792) double local792 = (double) (local22 - local776.anInt8159);
					@Pc(798) double local798 = (double) (local27 - local776.anInt8161);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong42) {
						local776 = (Class1_Sub6_Sub15) Static228.aClass117_1.method2286();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt8158 + local792 * (double) local780.anInt1091 + local798 * (double) local776.anInt8153) * 65535.0D / ((double) local780.anInt1080 * local825);
						if (local857 < (double) local780.anInt1090) {
							local776 = (Class1_Sub6_Sub15) Static228.aClass117_1.method2286();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt1092 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt1082;
							} else if (local780.anInt1092 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt1082;
							}
							if (local780.anInt1081 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt1080;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt1080;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt1080;
								if (local780.anInt1079 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt5208 = (int) ((double) super.anInt5208 + local996 * (double) arg1);
									super.anInt5211 = (int) ((double) super.anInt5211 + local1004 * (double) arg1);
									super.anInt5210 = (int) ((double) super.anInt5210 + local1012 * (double) arg1);
								}
							} else if (local780.anInt1079 == 0) {
								local296 += ((double) local776.anInt8158 - local871) * (double) arg1;
								local300 += ((double) local780.anInt1091 - local871) * (double) arg1;
								local304 += ((double) local776.anInt8153 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt5208 = (int) ((double) super.anInt5208 + ((double) local776.anInt8158 - local871) * (double) arg1);
								super.anInt5211 = (int) ((double) super.anInt5211 + ((double) local780.anInt1091 - local871) * (double) arg1);
								super.anInt5210 = (int) ((double) super.anInt5210 + ((double) local776.anInt8153 - local871) * (double) arg1);
							}
							local776 = (Class1_Sub6_Sub15) Static228.aClass117_1.method2286();
						}
					}
				}
			}
		}
		if (local35.anIntArray494 != null) {
			if (local35.anIntArray493 == null) {
				local35.anIntArray493 = new int[local35.anIntArray494.length];
				for (local317 = 0; local317 < local35.anIntArray494.length; local317++) {
					Static581.method4965(local35.anIntArray494[local317]);
					local35.anIntArray493[local317] = ((Class1_Sub13) Static288.aClass187_21.method3797((long) local35.anIntArray494[local317])).anInt1812;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray493.length; local317++) {
				@Pc(1137) Class50 local1137 = Static280.aClass50Array1[local35.anIntArray493[local317]];
				if (local1137.anInt1079 == 0) {
					local296 += local1137.anInt1085 * arg1;
					local300 += local1137.anInt1091 * arg1;
					local304 += local1137.anInt1088 * arg1;
					local306 = true;
				} else {
					super.anInt5208 += local1137.anInt1085 * arg1;
					super.anInt5211 += local1137.anInt1091 * arg1;
					super.anInt5210 += local1137.anInt1088 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort64 = (short) local296;
					this.aShort68 = (short) local300;
					this.aShort66 = (short) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt5215 <<= 0x1;
			}
		}
		super.anInt5208 = (int) ((long) super.anInt5208 + ((long) this.aShort64 * (long) (this.anInt5215 << 2) >> 23) * (long) arg1);
		super.anInt5211 = (int) ((long) super.anInt5211 + ((long) this.aShort68 * (long) (this.anInt5215 << 2) >> 23) * (long) arg1);
		super.anInt5210 = (int) ((long) super.anInt5210 + ((long) this.aShort66 * (long) (this.anInt5215 << 2) >> 23) * (long) arg1);
	}
}
