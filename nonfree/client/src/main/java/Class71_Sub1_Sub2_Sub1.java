import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class71_Sub1_Sub2_Sub1 extends Class71_Sub1_Sub2 {

	@OriginalMember(owner = "client!io", name = "x", descriptor = "I")
	private int anInt3406;

	@OriginalMember(owner = "client!io", name = "E", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "Lclient!pu;")
	private Class71_Sub5 aClass71_Sub5_1;

	@OriginalMember(owner = "client!io", name = "C", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!io", name = "B", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!io", name = "A", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "I")
	private int anInt3407;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!pu;IIIIIIIIIIIZZ)V")
	public Class71_Sub1_Sub2_Sub1(@OriginalArg(0) Class71_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass71_Sub5_1 = arg0;
		super.anInt3398 = arg1 << 12;
		super.anInt3404 = arg2 << 12;
		super.anInt3400 = arg3 << 12;
		super.anInt3399 = arg9;
		this.aShort34 = this.aShort38 = (short) arg8;
		super.anInt3401 = arg10;
		super.anInt3402 = arg11;
		super.aBoolean228 = arg13;
		this.aShort35 = (short) arg4;
		this.aShort37 = (short) arg5;
		this.aShort36 = (short) arg6;
		this.anInt3407 = arg7;
		super.aByte22 = this.aClass71_Sub5_1.aClass61_2.aByte12;
		this.method3043();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!pu;IIIIIIIIIIIZZ)V")
	public void method3042(@OriginalArg(0) Class71_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass71_Sub5_1 = arg0;
		super.anInt3398 = arg1 << 12;
		super.anInt3404 = arg2 << 12;
		super.anInt3400 = arg3 << 12;
		super.anInt3399 = arg9;
		this.aShort34 = this.aShort38 = (short) arg8;
		super.anInt3401 = arg10;
		super.anInt3402 = arg11;
		super.aBoolean228 = arg13;
		this.aShort35 = (short) arg4;
		this.aShort37 = (short) arg5;
		this.aShort36 = (short) arg6;
		this.anInt3407 = arg7;
		super.aByte22 = this.aClass71_Sub5_1.aClass61_2.aByte12;
		this.method3043();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()V")
	private void method3043() {
		@Pc(4) int local4 = this.aClass71_Sub5_1.aClass71_Sub6_5.anInt7235;
		if (this.aClass71_Sub5_1.aClass71_Sub6_5.aClass71_Sub1_Sub2_Sub1Array2[local4] != null) {
			this.aClass71_Sub5_1.aClass71_Sub6_5.aClass71_Sub1_Sub2_Sub1Array2[local4].method3044();
		}
		this.aClass71_Sub5_1.aClass71_Sub6_5.aClass71_Sub1_Sub2_Sub1Array2[local4] = this;
		this.aShort39 = (short) this.aClass71_Sub5_1.aClass71_Sub6_5.anInt7235;
		this.aClass71_Sub5_1.aClass71_Sub6_5.anInt7235 = local4 + 1 & 0x1FFF;
		this.aClass71_Sub5_1.aClass273_3.method6247(this);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()V")
	public void method3044() {
		this.aClass71_Sub5_1.aClass71_Sub6_5.aClass71_Sub1_Sub2_Sub1Array2[this.aShort39] = null;
		Static119.aClass71_Sub1_Sub2_Sub1Array1[Static229.anInt4568] = this;
		Static229.anInt4568 = Static229.anInt4568 + 1 & 0x3FF;
		this.method6187();
		this.method3038();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(JI)V")
	public void method3045(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort38 = (short) (this.aShort38 - arg1);
		if (this.aShort38 <= 0) {
			this.method3044();
			return;
		}
		@Pc(17) int local17 = super.anInt3398 >> 12;
		@Pc(22) int local22 = super.anInt3404 >> 12;
		@Pc(27) int local27 = super.anInt3400 >> 12;
		@Pc(31) Class71_Sub6 local31 = this.aClass71_Sub5_1.aClass71_Sub6_5;
		@Pc(35) Class179 local35 = this.aClass71_Sub5_1.aClass179_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5224 != 0) {
			if (this.aShort34 - this.aShort38 <= local35.anInt5211) {
				local65 = (super.anInt3399 >> 8 & 0xFF00) + (this.anInt3406 >> 16 & 0xFF) + local35.anInt5213 * arg1;
				local82 = (super.anInt3399 & 0xFF00) + (this.anInt3406 >> 8 & 0xFF) + local35.anInt5235 * arg1;
				local99 = ((super.anInt3399 & 0xFF) << 8) + (this.anInt3406 & 0xFF) + local35.anInt5236 * arg1;
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
				super.anInt3399 &= 0xFF000000;
				super.anInt3399 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt3406 &= 0xFF000000;
				this.anInt3406 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort34 - this.aShort38 <= local35.anInt5227) {
				local65 = (super.anInt3399 >> 16 & 0xFF00) + (this.anInt3406 >> 24 & 0xFF) + local35.anInt5233 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt3399 &= 0xFFFFFF;
				super.anInt3399 |= (local65 & 0xFF00) << 16;
				this.anInt3406 &= 0xFFFFFF;
				this.anInt3406 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5256 != -1 && this.aShort34 - this.aShort38 <= local35.anInt5214) {
			this.anInt3407 += local35.anInt5207 * arg1;
		}
		if (local35.anInt5221 != -1 && this.aShort34 - this.aShort38 <= local35.anInt5258) {
			super.anInt3401 += local35.anInt5252 * arg1;
		}
		local65 = this.aShort35;
		local82 = this.aShort37;
		local99 = this.aShort36;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5243 == 1) {
			local313 = local17 - this.aClass71_Sub5_1.anInt5755;
			local319 = local22 - this.aClass71_Sub5_1.anInt5760;
			local325 = local27 - this.aClass71_Sub5_1.anInt5756;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5250 * local340 * arg1;
			this.anInt3407 = (int) ((long) this.anInt3407 - ((long) this.anInt3407 * local348 >> 18));
		} else if (local35.anInt5243 == 2) {
			local313 = local17 - this.aClass71_Sub5_1.anInt5755;
			local319 = local22 - this.aClass71_Sub5_1.anInt5760;
			local325 = local27 - this.aClass71_Sub5_1.anInt5756;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5250 * local340 * arg1;
			this.anInt3407 = (int) ((long) this.anInt3407 - ((long) this.anInt3407 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray404 != null) {
			@Pc(426) Class4 local426 = local31.aClass91_51.aClass4_103;
			for (@Pc(429) Class4 local429 = local426.aClass4_269; local429 != local426; local429 = local429.aClass4_269) {
				@Pc(433) Class4_Sub1_Sub10 local433 = (Class4_Sub1_Sub10) local429;
				@Pc(436) Class150 local436 = local433.aClass150_1;
				if (local436.anInt4592 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray404.length; local444++) {
						if (local35.anIntArray404[local444] == local436.anInt4605) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3103;
						@Pc(473) int local473 = local22 - local433.anInt3102;
						local478 = local27 - local433.anInt3101;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong143) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3105 + local473 * local436.anInt4594 + local478 * local433.anInt3100) * 65535L / (long) (local436.anInt4590 * local501);
							if (local529 >= (long) local436.anInt4596) {
								local537 = 0;
								if (local436.anInt4591 == 1) {
									local537 = (local501 >> 4) * local436.anInt4600;
								} else if (local436.anInt4591 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt4600;
								}
								if (local436.anInt4602 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt4590;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt4590;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt4590;
									if (local436.anInt4595 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt3398 += local643 * arg1 >> 15;
										super.anInt3404 += local652 * arg1 >> 15;
										super.anInt3400 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt4595 == 0) {
									local65 += (local433.anInt3105 - local537) * arg1;
									local82 += (local436.anInt4594 - local537) * arg1;
									local99 += (local433.anInt3100 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt3398 += (local433.anInt3105 - local537) * arg1;
									super.anInt3404 += (local436.anInt4594 - local537) * arg1;
									super.anInt3400 += (local433.anInt3100 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray405 != null) {
			for (local313 = 0; local313 < local35.anIntArray405.length; local313++) {
				@Pc(743) Class4_Sub1_Sub10 local743 = (Class4_Sub1_Sub10) Static11.aClass114_1.method3075((long) local35.anIntArray405[local313]);
				while (local743 != null) {
					@Pc(747) Class150 local747 = local743.aClass150_1;
					local340 = local17 - local743.anInt3103;
					@Pc(757) int local757 = local22 - local743.anInt3102;
					local444 = local27 - local743.anInt3101;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong143) {
						local743 = (Class4_Sub1_Sub10) Static11.aClass114_1.method3074();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3105 + local757 * local747.anInt4594 + local444 * local743.anInt3100) * 65535L / (long) (local747.anInt4590 * local478);
						if (local491 < (long) local747.anInt4596) {
							local743 = (Class4_Sub1_Sub10) Static11.aClass114_1.method3074();
						} else {
							local501 = 0;
							if (local747.anInt4591 == 1) {
								local501 = (local478 >> 4) * local747.anInt4600;
							} else if (local747.anInt4591 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt4600;
							}
							if (local747.anInt4602 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt4590;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt4590;
								local537 = (local444 << 15) / local478 * local747.anInt4590;
								if (local747.anInt4595 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt3398 += local939 * arg1 >> 15;
									super.anInt3404 += local948 * arg1 >> 15;
									super.anInt3400 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt4595 == 0) {
								local65 += (local743.anInt3105 - local501) * arg1;
								local82 += (local747.anInt4594 - local501) * arg1;
								local99 += (local743.anInt3100 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt3398 += (local743.anInt3105 - local501) * arg1;
								super.anInt3404 += (local747.anInt4594 - local501) * arg1;
								super.anInt3400 += (local743.anInt3100 - local501) * arg1;
							}
							local743 = (Class4_Sub1_Sub10) Static11.aClass114_1.method3074();
						}
					}
				}
			}
		}
		if (local35.anIntArray406 != null) {
			if (local35.anIntArray403 == null) {
				local35.anIntArray403 = new int[local35.anIntArray406.length];
				for (local313 = 0; local313 < local35.anIntArray406.length; local313++) {
					Static25.method395(local35.anIntArray406[local313]);
					local35.anIntArray403[local313] = ((Class4_Sub16) Static50.aClass96_4.method2797((long) local35.anIntArray406[local313])).anInt2197;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray403.length; local313++) {
				@Pc(1082) Class150 local1082 = Static153.aClass150Array1[local35.anIntArray403[local313]];
				if (local1082.anInt4595 == 0) {
					local65 += local1082.anInt4593 * arg1;
					local82 += local1082.anInt4594 * arg1;
					local99 += local1082.anInt4601 * arg1;
					local303 = true;
				} else {
					super.anInt3398 += local1082.anInt4593 * arg1;
					super.anInt3404 += local1082.anInt4594 * arg1;
					super.anInt3400 += local1082.anInt4601 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort35 = (short) local65;
					this.aShort37 = (short) local82;
					this.aShort36 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt3407 <<= 0x1;
			}
		}
		super.anInt3398 = (int) ((long) super.anInt3398 + ((long) this.aShort35 * (long) this.anInt3407 >> 23) * (long) arg1);
		super.anInt3404 = (int) ((long) super.anInt3404 + ((long) this.aShort37 * (long) this.anInt3407 >> 23) * (long) arg1);
		super.anInt3400 = (int) ((long) super.anInt3400 + ((long) this.aShort36 * (long) this.anInt3407 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!qa;J)V")
	public void method3046(@OriginalArg(0) Class30 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt3398 >> Static391.anInt6797 + 12;
		@Pc(13) int local13 = super.anInt3400 >> Static391.anInt6797 + 12;
		@Pc(18) int local18 = super.anInt3404 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static230.anInt4581 || local13 < 0 || local13 >= Static268.anInt5106) {
			this.method3044();
			return;
		}
		@Pc(40) Class71_Sub6 local40 = this.aClass71_Sub5_1.aClass71_Sub6_5;
		@Pc(44) Class179 local44 = this.aClass71_Sub5_1.aClass179_1;
		@Pc(46) Class14[] local46 = Static389.aClass14Array3;
		@Pc(49) int local49 = local40.anInt7241;
		@Pc(58) Class162 local58 = Static294.aClass162ArrayArrayArray2[local40.anInt7241][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte59;
		}
		@Pc(70) int local70 = local46[local49].oa(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static227.anInt4511 - 1) {
			local84 = local46[local49 + 1].oa(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static391.anInt6797);
		}
		if (local44.aBoolean357) {
			if (local44.lb == -1 && local18 > local70) {
				this.method3044();
				return;
			}
			if (local44.lb >= 0 && local18 > local46[local44.lb].oa(local6, local13)) {
				this.method3044();
				return;
			}
			if (local44.anInt5245 == -1 && local18 < local84) {
				this.method3044();
				return;
			}
			if (local44.anInt5245 >= 0 && local18 < local46[local44.anInt5245 + 1].oa(local6, local13)) {
				this.method3044();
				return;
			}
		}
		if (local6 >= local40.anInt7239 && local6 <= local40.anInt7240 && local13 >= local40.anInt7238 && local13 <= local40.anInt7237 && local18 <= local70 && local18 >= local84) {
			local40.aClass270_2.aClass108_1.method3010(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static227.anInt4511 - 1; local172 > 0 && local18 > local46[local172].oa(local6, local13); local172--) {
		}
		if (local172 == 0 && local18 > local46[0].oa(local6, local13)) {
			this.method3044();
		} else if (local172 == Static227.anInt4511 - 1 && local46[local172].oa(local6, local13) - local18 > 0x8 << Static391.anInt6797) {
			this.method3044();
		} else {
			local58 = Static294.aClass162ArrayArrayArray2[local172][local6][local13];
			@Pc(275) int local275;
			if (local58 == null) {
				if (local172 == 0 || Static294.aClass162ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static294.aClass162ArrayArrayArray2[0][local6][local13] = new Class162(0, local6, local13);
				}
				@Pc(265) boolean local265 = Static294.aClass162ArrayArrayArray2[0][local6][local13].aClass162_1 != null;
				if (local172 == 3 && local265) {
					this.method3044();
					return;
				}
				for (local275 = 1; local275 <= local172; local275++) {
					if (Static294.aClass162ArrayArrayArray2[local275][local6][local13] == null) {
						local58 = Static294.aClass162ArrayArrayArray2[local275][local6][local13] = new Class162(local275, local6, local13);
						if (local265) {
							local58.aByte59++;
						}
					}
				}
			}
			if (local44.aBoolean362) {
				@Pc(320) int local320 = super.anInt3398 >> 12;
				local275 = super.anInt3400 >> 12;
				@Pc(334) Class64 local334;
				if (local58.aClass11_Sub2_2 != null) {
					local334 = local58.aClass11_Sub2_2.method6305(arg0);
					if (local334 != null && local334.method1818(local18, local320, local275)) {
						this.method3044();
						return;
					}
				}
				if (local58.aClass11_Sub2_1 != null) {
					local334 = local58.aClass11_Sub2_1.method6305(arg0);
					if (local334 != null && local334.method1818(local18, local320, local275)) {
						this.method3044();
						return;
					}
				}
				if (local58.aClass11_Sub1_2 != null) {
					local334 = local58.aClass11_Sub1_2.method6305(arg0);
					if (local334 != null && local334.method1818(local18, local320, local275)) {
						this.method3044();
						return;
					}
				}
				for (@Pc(391) Class199 local391 = local58.aClass199_1; local391 != null; local391 = local391.aClass199_2) {
					@Pc(398) Class64 local398 = local391.aClass11_Sub5_1.method6305(arg0);
					if (local398 != null && local398.method1818(local18, local320, local275)) {
						this.method3044();
						return;
					}
				}
			}
			if (local58.aClass270_1 == null) {
				local58.aClass270_1 = new Class270();
				local58.aByte57 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte57 != (byte) (arg1 & 0xFFL)) {
				local58.aClass270_1.aClass108_1.method3012();
				local58.aClass270_1.aBoolean567 = false;
				local58.aByte57 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass270_1.aClass108_1.method3010(this);
		}
	}
}
