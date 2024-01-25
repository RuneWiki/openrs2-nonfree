import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class46_Sub3_Sub1_Sub1 extends Class46_Sub3_Sub1 {

	@OriginalMember(owner = "client!jv", name = "E", descriptor = "I")
	private int anInt4606;

	@OriginalMember(owner = "client!jv", name = "F", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!jv", name = "I", descriptor = "Lclient!we;")
	private Class46_Sub8 aClass46_Sub8_1;

	@OriginalMember(owner = "client!jv", name = "L", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!jv", name = "J", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!jv", name = "M", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!jv", name = "G", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!jv", name = "K", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!jv", name = "H", descriptor = "I")
	private int anInt4607;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!we;IIIIIIIIIIIZZ)V")
	public Class46_Sub3_Sub1_Sub1(@OriginalArg(0) Class46_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass46_Sub8_1 = arg0;
		super.anInt4593 = arg1 << 12;
		super.anInt4601 = arg2 << 12;
		super.anInt4597 = arg3 << 12;
		super.anInt4605 = arg9;
		this.aShort43 = this.aShort45 = (short) arg8;
		super.anInt4604 = arg10;
		super.anInt4600 = arg11;
		super.aBoolean349 = arg13;
		this.aShort46 = (short) arg4;
		this.aShort42 = (short) arg5;
		this.aShort44 = (short) arg6;
		this.anInt4607 = arg7;
		super.aByte58 = this.aClass46_Sub8_1.aClass68_2.aByte34;
		this.method4258();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!we;IIIIIIIIIIIZZ)V")
	public void method4254(@OriginalArg(0) Class46_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass46_Sub8_1 = arg0;
		super.anInt4593 = arg1 << 12;
		super.anInt4601 = arg2 << 12;
		super.anInt4597 = arg3 << 12;
		super.anInt4605 = arg9;
		this.aShort43 = this.aShort45 = (short) arg8;
		super.anInt4604 = arg10;
		super.anInt4600 = arg11;
		super.aBoolean349 = arg13;
		this.aShort46 = (short) arg4;
		this.aShort42 = (short) arg5;
		this.aShort44 = (short) arg6;
		this.anInt4607 = arg7;
		super.aByte58 = this.aClass46_Sub8_1.aClass68_2.aByte34;
		this.method4258();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!qa;J)V")
	public void method4255(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt4593 >> Static275.anInt5260 + 12;
		@Pc(13) int local13 = super.anInt4597 >> Static275.anInt5260 + 12;
		@Pc(18) int local18 = super.anInt4601 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static501.anInt9458 || local13 < 0 || local13 >= Static420.anInt7323) {
			this.method4256();
			return;
		}
		@Pc(40) Class46_Sub7 local40 = this.aClass46_Sub8_1.aClass46_Sub7_7;
		@Pc(44) Class216 local44 = this.aClass46_Sub8_1.aClass216_1;
		@Pc(46) Class7[] local46 = Static296.aClass7Array11;
		@Pc(49) int local49 = local40.anInt8481;
		@Pc(58) Class64 local58 = Static263.aClass64ArrayArrayArray3[local40.anInt8481][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte27;
		}
		@Pc(70) int local70 = local46[local49].ba(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static63.anInt1587 - 1) {
			local84 = local46[local49 + 1].ba(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static275.anInt5260);
		}
		if (local44.aBoolean473) {
			if (local44.anInt6379 == -1 && local18 > local70) {
				this.method4256();
				return;
			}
			if (local44.anInt6379 >= 0 && local18 > local46[local44.anInt6379].ba(local6, local13)) {
				this.method4256();
				return;
			}
			if (local44.anInt6406 == -1 && local18 < local84) {
				this.method4256();
				return;
			}
			if (local44.anInt6406 >= 0 && local18 < local46[local44.anInt6406 + 1].ba(local6, local13)) {
				this.method4256();
				return;
			}
		}
		if (local6 >= local40.anInt8484 && local6 <= local40.anInt8482 && local13 >= local40.anInt8479 && local13 <= local40.anInt8483 && local18 <= local70 && local18 >= local84) {
			local40.aClass158_2.aClass185_1.method5311(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static63.anInt1587 - 1; local172 > 0 && local18 > local46[local172].ba(local6, local13); local172--) {
		}
		if (local172 == 0 && local18 > local46[0].ba(local6, local13)) {
			this.method4256();
		} else if (local172 == Static63.anInt1587 - 1 && local46[local172].ba(local6, local13) - local18 > 0x8 << Static275.anInt5260) {
			this.method4256();
		} else {
			local58 = Static263.aClass64ArrayArrayArray3[local172][local6][local13];
			@Pc(275) int local275;
			if (local58 == null) {
				if (local172 == 0 || Static263.aClass64ArrayArrayArray3[0][local6][local13] == null) {
					local58 = Static263.aClass64ArrayArrayArray3[0][local6][local13] = new Class64(0, local6, local13);
				}
				@Pc(265) boolean local265 = Static263.aClass64ArrayArrayArray3[0][local6][local13].aClass64_1 != null;
				if (local172 == 3 && local265) {
					this.method4256();
					return;
				}
				for (local275 = 1; local275 <= local172; local275++) {
					if (Static263.aClass64ArrayArrayArray3[local275][local6][local13] == null) {
						local58 = Static263.aClass64ArrayArrayArray3[local275][local6][local13] = new Class64(local275, local6, local13);
						if (local265) {
							local58.aByte27++;
						}
					}
				}
			}
			if (local44.aBoolean476) {
				@Pc(320) int local320 = super.anInt4593 >> 12;
				local275 = super.anInt4597 >> 12;
				@Pc(334) Class271 local334;
				if (local58.aClass20_Sub2_1 != null) {
					local334 = local58.aClass20_Sub2_1.method8031(arg0);
					if (local334 != null && local334.method6976(local275, local18, local320)) {
						this.method4256();
						return;
					}
				}
				if (local58.aClass20_Sub2_2 != null) {
					local334 = local58.aClass20_Sub2_2.method8031(arg0);
					if (local334 != null && local334.method6976(local275, local18, local320)) {
						this.method4256();
						return;
					}
				}
				if (local58.aClass20_Sub5_1 != null) {
					local334 = local58.aClass20_Sub5_1.method8031(arg0);
					if (local334 != null && local334.method6976(local275, local18, local320)) {
						this.method4256();
						return;
					}
				}
				for (@Pc(391) Class232 local391 = local58.aClass232_2; local391 != null; local391 = local391.aClass232_3) {
					@Pc(398) Class271 local398 = local391.aClass20_Sub1_2.method8031(arg0);
					if (local398 != null && local398.method6976(local275, local18, local320)) {
						this.method4256();
						return;
					}
				}
			}
			if (local58.aClass158_1 == null) {
				local58.aClass158_1 = new Class158();
				local58.aByte31 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte31 != (byte) (arg1 & 0xFFL)) {
				local58.aClass158_1.aClass185_1.method5308();
				local58.aClass158_1.aBoolean355 = false;
				local58.aByte31 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass158_1.aClass185_1.method5311(this);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "()V")
	public void method4256() {
		this.aClass46_Sub8_1.aClass46_Sub7_7.aClass46_Sub3_Sub1_Sub1Array2[this.aShort41] = null;
		Static413.aClass46_Sub3_Sub1_Sub1Array1[Static218.anInt4312] = this;
		Static218.anInt4312 = Static218.anInt4312 + 1 & 0x3FF;
		this.method8227();
		this.method8232();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)V")
	public void method4257(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort45 = (short) (this.aShort45 - arg1);
		if (this.aShort45 <= 0) {
			this.method4256();
			return;
		}
		@Pc(17) int local17 = super.anInt4593 >> 12;
		@Pc(22) int local22 = super.anInt4601 >> 12;
		@Pc(27) int local27 = super.anInt4597 >> 12;
		@Pc(31) Class46_Sub7 local31 = this.aClass46_Sub8_1.aClass46_Sub7_7;
		@Pc(35) Class216 local35 = this.aClass46_Sub8_1.aClass216_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6367 != 0) {
			if (this.aShort43 - this.aShort45 <= local35.anInt6410) {
				local65 = (super.anInt4605 >> 8 & 0xFF00) + (this.anInt4606 >> 16 & 0xFF) + local35.anInt6405 * arg1;
				local82 = (super.anInt4605 & 0xFF00) + (this.anInt4606 >> 8 & 0xFF) + local35.anInt6373 * arg1;
				local99 = ((super.anInt4605 & 0xFF) << 8) + (this.anInt4606 & 0xFF) + local35.anInt6382 * arg1;
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
				super.anInt4605 &= 0xFF000000;
				super.anInt4605 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4606 &= 0xFF000000;
				this.anInt4606 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort43 - this.aShort45 <= local35.anInt6418) {
				local65 = (super.anInt4605 >> 16 & 0xFF00) + (this.anInt4606 >> 24 & 0xFF) + local35.anInt6364 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4605 &= 0xFFFFFF;
				super.anInt4605 |= (local65 & 0xFF00) << 16;
				this.anInt4606 &= 0xFFFFFF;
				this.anInt4606 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6385 != -1 && this.aShort43 - this.aShort45 <= local35.anInt6371) {
			this.anInt4607 += local35.anInt6419 * arg1;
		}
		if (local35.anInt6389 != -1 && this.aShort43 - this.aShort45 <= local35.anInt6417) {
			super.anInt4604 += local35.anInt6392 * arg1;
		}
		local65 = this.aShort46;
		local82 = this.aShort42;
		local99 = this.aShort44;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6381 == 1) {
			local313 = local17 - this.aClass46_Sub8_1.anInt9378;
			local319 = local22 - this.aClass46_Sub8_1.anInt9386;
			local325 = local27 - this.aClass46_Sub8_1.anInt9366;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6388 * local340 * arg1;
			this.anInt4607 = (int) ((long) this.anInt4607 - ((long) this.anInt4607 * local348 >> 18));
		} else if (local35.anInt6381 == 2) {
			local313 = local17 - this.aClass46_Sub8_1.anInt9378;
			local319 = local22 - this.aClass46_Sub8_1.anInt9386;
			local325 = local27 - this.aClass46_Sub8_1.anInt9366;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6388 * local340 * arg1;
			this.anInt4607 = (int) ((long) this.anInt4607 - ((long) this.anInt4607 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray625 != null) {
			@Pc(426) Class1 local426 = local31.aClass295_58.aClass1_260;
			for (@Pc(429) Class1 local429 = local426.aClass1_283; local429 != local426; local429 = local429.aClass1_283) {
				@Pc(433) Class1_Sub2_Sub18 local433 = (Class1_Sub2_Sub18) local429;
				@Pc(436) Class226 local436 = local433.aClass226_1;
				if (local436.anInt6662 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray625.length; local444++) {
						if (local35.anIntArray625[local444] == local436.anInt6670) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt8095;
						@Pc(473) int local473 = local22 - local433.anInt8097;
						local478 = local27 - local433.anInt8093;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong182) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt8099 + local473 * local436.anInt6660 + local478 * local433.anInt8098) * 65535L / (long) (local436.anInt6656 * local501);
							if (local529 >= (long) local436.anInt6667) {
								local537 = 0;
								if (local436.anInt6661 == 1) {
									local537 = (local501 >> 4) * local436.anInt6664;
								} else if (local436.anInt6661 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6664;
								}
								if (local436.anInt6663 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6656;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6656;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6656;
									if (local436.anInt6666 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4593 += local643 * arg1 >> 15;
										super.anInt4601 += local652 * arg1 >> 15;
										super.anInt4597 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6666 == 0) {
									local65 += (local433.anInt8099 - local537) * arg1;
									local82 += (local436.anInt6660 - local537) * arg1;
									local99 += (local433.anInt8098 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4593 += (local433.anInt8099 - local537) * arg1;
									super.anInt4601 += (local436.anInt6660 - local537) * arg1;
									super.anInt4597 += (local433.anInt8098 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray624 != null) {
			for (local313 = 0; local313 < local35.anIntArray624.length; local313++) {
				@Pc(743) Class1_Sub2_Sub18 local743 = (Class1_Sub2_Sub18) Static74.aClass37_1.method1281((long) local35.anIntArray624[local313]);
				while (local743 != null) {
					@Pc(747) Class226 local747 = local743.aClass226_1;
					local340 = local17 - local743.anInt8095;
					@Pc(757) int local757 = local22 - local743.anInt8097;
					local444 = local27 - local743.anInt8093;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong182) {
						local743 = (Class1_Sub2_Sub18) Static74.aClass37_1.method1282();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt8099 + local757 * local747.anInt6660 + local444 * local743.anInt8098) * 65535L / (long) (local747.anInt6656 * local478);
						if (local491 < (long) local747.anInt6667) {
							local743 = (Class1_Sub2_Sub18) Static74.aClass37_1.method1282();
						} else {
							local501 = 0;
							if (local747.anInt6661 == 1) {
								local501 = (local478 >> 4) * local747.anInt6664;
							} else if (local747.anInt6661 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6664;
							}
							if (local747.anInt6663 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6656;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6656;
								local537 = (local444 << 15) / local478 * local747.anInt6656;
								if (local747.anInt6666 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4593 += local939 * arg1 >> 15;
									super.anInt4601 += local948 * arg1 >> 15;
									super.anInt4597 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6666 == 0) {
								local65 += (local743.anInt8099 - local501) * arg1;
								local82 += (local747.anInt6660 - local501) * arg1;
								local99 += (local743.anInt8098 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4593 += (local743.anInt8099 - local501) * arg1;
								super.anInt4601 += (local747.anInt6660 - local501) * arg1;
								super.anInt4597 += (local743.anInt8098 - local501) * arg1;
							}
							local743 = (Class1_Sub2_Sub18) Static74.aClass37_1.method1282();
						}
					}
				}
			}
		}
		if (local35.anIntArray626 != null) {
			if (local35.anIntArray627 == null) {
				local35.anIntArray627 = new int[local35.anIntArray626.length];
				for (local313 = 0; local313 < local35.anIntArray626.length; local313++) {
					Static111.method2227(local35.anIntArray626[local313]);
					local35.anIntArray627[local313] = ((Class1_Sub14) Static171.aClass230_22.method6144((long) local35.anIntArray626[local313])).anInt2795;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray627.length; local313++) {
				@Pc(1082) Class226 local1082 = Static10.aClass226Array1[local35.anIntArray627[local313]];
				if (local1082.anInt6666 == 0) {
					local65 += local1082.anInt6671 * arg1;
					local82 += local1082.anInt6660 * arg1;
					local99 += local1082.anInt6668 * arg1;
					local303 = true;
				} else {
					super.anInt4593 += local1082.anInt6671 * arg1;
					super.anInt4601 += local1082.anInt6660 * arg1;
					super.anInt4597 += local1082.anInt6668 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort46 = (short) local65;
					this.aShort42 = (short) local82;
					this.aShort44 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4607 <<= 0x1;
			}
		}
		super.anInt4593 = (int) ((long) super.anInt4593 + ((long) this.aShort46 * (long) this.anInt4607 >> 23) * (long) arg1);
		super.anInt4601 = (int) ((long) super.anInt4601 + ((long) this.aShort42 * (long) this.anInt4607 >> 23) * (long) arg1);
		super.anInt4597 = (int) ((long) super.anInt4597 + ((long) this.aShort44 * (long) this.anInt4607 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "()V")
	private void method4258() {
		@Pc(4) int local4 = this.aClass46_Sub8_1.aClass46_Sub7_7.anInt8477;
		if (this.aClass46_Sub8_1.aClass46_Sub7_7.aClass46_Sub3_Sub1_Sub1Array2[local4] != null) {
			this.aClass46_Sub8_1.aClass46_Sub7_7.aClass46_Sub3_Sub1_Sub1Array2[local4].method4256();
		}
		this.aClass46_Sub8_1.aClass46_Sub7_7.aClass46_Sub3_Sub1_Sub1Array2[local4] = this;
		this.aShort41 = (short) this.aClass46_Sub8_1.aClass46_Sub7_7.anInt8477;
		this.aClass46_Sub8_1.aClass46_Sub7_7.anInt8477 = local4 + 1 & 0x1FFF;
		this.aClass46_Sub8_1.aClass184_48.method5142(this);
	}
}
