import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class30_Sub2_Sub1_Sub1 extends Class30_Sub2_Sub1 {

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
	private int anInt2970;

	@OriginalMember(owner = "client!fo", name = "O", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "Lclient!rba;")
	private Class30_Sub8 aClass30_Sub8_1;

	@OriginalMember(owner = "client!fo", name = "N", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
	private int anInt2971;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!rba;IIIIIIIIIIIZZ)V")
	public Class30_Sub2_Sub1_Sub1(@OriginalArg(0) Class30_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass30_Sub8_1 = arg0;
		super.anInt2966 = arg1 << 12;
		super.anInt2967 = arg2 << 12;
		super.anInt2969 = arg3 << 12;
		super.anInt2962 = arg9;
		this.aShort44 = this.aShort48 = (short) arg8;
		super.anInt2963 = arg10;
		super.anInt2968 = arg11;
		super.aBoolean197 = arg13;
		this.aShort45 = (short) arg4;
		this.aShort47 = (short) arg5;
		this.aShort46 = (short) arg6;
		this.anInt2971 = arg7;
		super.aByte38 = this.aClass30_Sub8_1.aClass223_2.aByte69;
		this.method2674();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
	private void method2674() {
		@Pc(4) int local4 = this.aClass30_Sub8_1.aClass30_Sub7_5.anInt7265;
		if (this.aClass30_Sub8_1.aClass30_Sub7_5.aClass30_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass30_Sub8_1.aClass30_Sub7_5.aClass30_Sub2_Sub1_Sub1Array1[local4].method2677();
		}
		this.aClass30_Sub8_1.aClass30_Sub7_5.aClass30_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort49 = (short) this.aClass30_Sub8_1.aClass30_Sub7_5.anInt7265;
		this.aClass30_Sub8_1.aClass30_Sub7_5.anInt7265 = local4 + 1 & 0x1FFF;
		this.aClass30_Sub8_1.aClass77_11.method2165(this);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!qa;J)V")
	public void method2675(@OriginalArg(0) Class62 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2966 >> Static270.anInt5288 + 12;
		@Pc(13) int local13 = super.anInt2969 >> Static270.anInt5288 + 12;
		@Pc(18) int local18 = super.anInt2967 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static374.anInt6925 || local13 < 0 || local13 >= Static430.anInt7565) {
			this.method2677();
			return;
		}
		@Pc(40) Class30_Sub7 local40 = this.aClass30_Sub8_1.aClass30_Sub7_5;
		@Pc(44) Class81 local44 = this.aClass30_Sub8_1.aClass81_1;
		@Pc(46) Class131[] local46 = Static248.aClass131Array4;
		@Pc(49) int local49 = local40.anInt7272;
		@Pc(58) Class37 local58 = Static152.aClass37ArrayArrayArray1[local40.anInt7272][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte26;
		}
		@Pc(70) int local70 = local46[local49].ba(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static460.anInt7893 - 1) {
			local84 = local46[local49 + 1].ba(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static270.anInt5288);
		}
		if (local44.aBoolean159) {
			if (local44.anInt2448 == -1 && local18 > local70) {
				this.method2677();
				return;
			}
			if (local44.anInt2448 >= 0 && local18 > local46[local44.anInt2448].ba(local6, local13)) {
				this.method2677();
				return;
			}
			if (local44.anInt2475 == -1 && local18 < local84) {
				this.method2677();
				return;
			}
			if (local44.anInt2475 >= 0 && local18 < local46[local44.anInt2475 + 1].ba(local6, local13)) {
				this.method2677();
				return;
			}
		}
		if (local6 >= local40.anInt7267 && local6 <= local40.anInt7268 && local13 >= local40.anInt7269 && local13 <= local40.anInt7270 && local18 <= local70 && local18 >= local84) {
			local40.aClass267_2.aClass161_1.method4079(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static460.anInt7893 - 1; local172 > 0 && local18 > local46[local172].ba(local6, local13); local172--) {
		}
		if (local172 == 0 && local18 > local46[0].ba(local6, local13)) {
			this.method2677();
		} else if (local172 == Static460.anInt7893 - 1 && local46[local172].ba(local6, local13) - local18 > 0x8 << Static270.anInt5288) {
			this.method2677();
		} else {
			local58 = Static152.aClass37ArrayArrayArray1[local172][local6][local13];
			@Pc(275) int local275;
			if (local58 == null) {
				if (local172 == 0 || Static152.aClass37ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static152.aClass37ArrayArrayArray1[0][local6][local13] = new Class37(0, local6, local13);
				}
				@Pc(265) boolean local265 = Static152.aClass37ArrayArrayArray1[0][local6][local13].aClass37_1 != null;
				if (local172 == 3 && local265) {
					this.method2677();
					return;
				}
				for (local275 = 1; local275 <= local172; local275++) {
					if (Static152.aClass37ArrayArrayArray1[local275][local6][local13] == null) {
						local58 = Static152.aClass37ArrayArrayArray1[local275][local6][local13] = new Class37(local275, local6, local13);
						if (local265) {
							local58.aByte26++;
						}
					}
				}
			}
			if (local44.aBoolean157) {
				@Pc(320) int local320 = super.anInt2966 >> 12;
				local275 = super.anInt2969 >> 12;
				@Pc(334) Class175 local334;
				if (local58.aClass15_Sub3_3 != null) {
					local334 = local58.aClass15_Sub3_3.method6854(arg0);
					if (local334 != null && local334.method4378(local320, local18, local275)) {
						this.method2677();
						return;
					}
				}
				if (local58.aClass15_Sub3_2 != null) {
					local334 = local58.aClass15_Sub3_2.method6854(arg0);
					if (local334 != null && local334.method4378(local320, local18, local275)) {
						this.method2677();
						return;
					}
				}
				if (local58.aClass15_Sub5_1 != null) {
					local334 = local58.aClass15_Sub5_1.method6854(arg0);
					if (local334 != null && local334.method4378(local320, local18, local275)) {
						this.method2677();
						return;
					}
				}
				for (@Pc(391) Class108 local391 = local58.aClass108_1; local391 != null; local391 = local391.aClass108_3) {
					@Pc(398) Class175 local398 = local391.aClass15_Sub2_1.method6854(arg0);
					if (local398 != null && local398.method4378(local320, local18, local275)) {
						this.method2677();
						return;
					}
				}
			}
			if (local58.aClass267_1 == null) {
				local58.aClass267_1 = new Class267();
				local58.aByte23 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte23 != (byte) (arg1 & 0xFFL)) {
				local58.aClass267_1.aClass161_1.method4081();
				local58.aClass267_1.aBoolean555 = false;
				local58.aByte23 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass267_1.aClass161_1.method4079(this);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!rba;IIIIIIIIIIIZZ)V")
	public void method2676(@OriginalArg(0) Class30_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass30_Sub8_1 = arg0;
		super.anInt2966 = arg1 << 12;
		super.anInt2967 = arg2 << 12;
		super.anInt2969 = arg3 << 12;
		super.anInt2962 = arg9;
		this.aShort44 = this.aShort48 = (short) arg8;
		super.anInt2963 = arg10;
		super.anInt2968 = arg11;
		super.aBoolean197 = arg13;
		this.aShort45 = (short) arg4;
		this.aShort47 = (short) arg5;
		this.aShort46 = (short) arg6;
		this.anInt2971 = arg7;
		super.aByte38 = this.aClass30_Sub8_1.aClass223_2.aByte69;
		this.method2674();
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()V")
	public void method2677() {
		this.aClass30_Sub8_1.aClass30_Sub7_5.aClass30_Sub2_Sub1_Sub1Array1[this.aShort49] = null;
		Static500.aClass30_Sub2_Sub1_Sub1Array2[Static21.anInt7324] = this;
		Static21.anInt7324 = Static21.anInt7324 + 1 & 0x3FF;
		this.method6004();
		this.method4419();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(JI)V")
	public void method2678(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort48 = (short) (this.aShort48 - arg1);
		if (this.aShort48 <= 0) {
			this.method2677();
			return;
		}
		@Pc(17) int local17 = super.anInt2966 >> 12;
		@Pc(22) int local22 = super.anInt2967 >> 12;
		@Pc(27) int local27 = super.anInt2969 >> 12;
		@Pc(31) Class30_Sub7 local31 = this.aClass30_Sub8_1.aClass30_Sub7_5;
		@Pc(35) Class81 local35 = this.aClass30_Sub8_1.aClass81_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt2478 != 0) {
			if (this.aShort44 - this.aShort48 <= local35.anInt2464) {
				local65 = (super.anInt2962 >> 8 & 0xFF00) + (this.anInt2970 >> 16 & 0xFF) + local35.anInt2483 * arg1;
				local82 = (super.anInt2962 & 0xFF00) + (this.anInt2970 >> 8 & 0xFF) + local35.anInt2467 * arg1;
				local99 = ((super.anInt2962 & 0xFF) << 8) + (this.anInt2970 & 0xFF) + local35.anInt2444 * arg1;
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
				super.anInt2962 &= 0xFF000000;
				super.anInt2962 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2970 &= 0xFF000000;
				this.anInt2970 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort44 - this.aShort48 <= local35.anInt2433) {
				local65 = (super.anInt2962 >> 16 & 0xFF00) + (this.anInt2970 >> 24 & 0xFF) + local35.anInt2445 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2962 &= 0xFFFFFF;
				super.anInt2962 |= (local65 & 0xFF00) << 16;
				this.anInt2970 &= 0xFFFFFF;
				this.anInt2970 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2436 != -1 && this.aShort44 - this.aShort48 <= local35.anInt2461) {
			this.anInt2971 += local35.anInt2434 * arg1;
		}
		if (local35.anInt2449 != -1 && this.aShort44 - this.aShort48 <= local35.anInt2446) {
			super.anInt2963 += local35.anInt2473 * arg1;
		}
		local65 = this.aShort45;
		local82 = this.aShort47;
		local99 = this.aShort46;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt2435 == 1) {
			local313 = local17 - this.aClass30_Sub8_1.anInt7376;
			local319 = local22 - this.aClass30_Sub8_1.anInt7399;
			local325 = local27 - this.aClass30_Sub8_1.anInt7384;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt2472 * local340 * arg1;
			this.anInt2971 = (int) ((long) this.anInt2971 - ((long) this.anInt2971 * local348 >> 18));
		} else if (local35.anInt2435 == 2) {
			local313 = local17 - this.aClass30_Sub8_1.anInt7376;
			local319 = local22 - this.aClass30_Sub8_1.anInt7399;
			local325 = local27 - this.aClass30_Sub8_1.anInt7384;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt2472 * local340 * arg1;
			this.anInt2971 = (int) ((long) this.anInt2971 - ((long) this.anInt2971 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray211 != null) {
			@Pc(426) Class5 local426 = local31.aClass99_59.aClass5_102;
			for (@Pc(429) Class5 local429 = local426.aClass5_284; local429 != local426; local429 = local429.aClass5_284) {
				@Pc(433) Class5_Sub2_Sub12 local433 = (Class5_Sub2_Sub12) local429;
				@Pc(436) Class137 local436 = local433.aClass137_1;
				if (local436.anInt3800 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray211.length; local444++) {
						if (local35.anIntArray211[local444] == local436.anInt3801) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2255;
						@Pc(473) int local473 = local22 - local433.anInt2254;
						local478 = local27 - local433.anInt2252;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong120) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2257 + local473 * local436.anInt3811 + local478 * local433.anInt2253) * 65535L / (long) (local436.anInt3804 * local501);
							if (local529 >= (long) local436.anInt3816) {
								local537 = 0;
								if (local436.anInt3814 == 1) {
									local537 = (local501 >> 4) * local436.anInt3802;
								} else if (local436.anInt3814 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt3802;
								}
								if (local436.anInt3807 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt3804;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt3804;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt3804;
									if (local436.anInt3810 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2966 += local643 * arg1 >> 15;
										super.anInt2967 += local652 * arg1 >> 15;
										super.anInt2969 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt3810 == 0) {
									local65 += (local433.anInt2257 - local537) * arg1;
									local82 += (local436.anInt3811 - local537) * arg1;
									local99 += (local433.anInt2253 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2966 += (local433.anInt2257 - local537) * arg1;
									super.anInt2967 += (local436.anInt3811 - local537) * arg1;
									super.anInt2969 += (local433.anInt2253 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray213 != null) {
			for (local313 = 0; local313 < local35.anIntArray213.length; local313++) {
				@Pc(743) Class5_Sub2_Sub12 local743 = (Class5_Sub2_Sub12) Static213.aClass80_1.method2211((long) local35.anIntArray213[local313]);
				while (local743 != null) {
					@Pc(747) Class137 local747 = local743.aClass137_1;
					local340 = local17 - local743.anInt2255;
					@Pc(757) int local757 = local22 - local743.anInt2254;
					local444 = local27 - local743.anInt2252;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong120) {
						local743 = (Class5_Sub2_Sub12) Static213.aClass80_1.method2208();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2257 + local757 * local747.anInt3811 + local444 * local743.anInt2253) * 65535L / (long) (local747.anInt3804 * local478);
						if (local491 < (long) local747.anInt3816) {
							local743 = (Class5_Sub2_Sub12) Static213.aClass80_1.method2208();
						} else {
							local501 = 0;
							if (local747.anInt3814 == 1) {
								local501 = (local478 >> 4) * local747.anInt3802;
							} else if (local747.anInt3814 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt3802;
							}
							if (local747.anInt3807 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt3804;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt3804;
								local537 = (local444 << 15) / local478 * local747.anInt3804;
								if (local747.anInt3810 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2966 += local939 * arg1 >> 15;
									super.anInt2967 += local948 * arg1 >> 15;
									super.anInt2969 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt3810 == 0) {
								local65 += (local743.anInt2257 - local501) * arg1;
								local82 += (local747.anInt3811 - local501) * arg1;
								local99 += (local743.anInt2253 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2966 += (local743.anInt2257 - local501) * arg1;
								super.anInt2967 += (local747.anInt3811 - local501) * arg1;
								super.anInt2969 += (local743.anInt2253 - local501) * arg1;
							}
							local743 = (Class5_Sub2_Sub12) Static213.aClass80_1.method2208();
						}
					}
				}
			}
		}
		if (local35.anIntArray212 != null) {
			if (local35.anIntArray214 == null) {
				local35.anIntArray214 = new int[local35.anIntArray212.length];
				for (local313 = 0; local313 < local35.anIntArray212.length; local313++) {
					Static374.method5621(local35.anIntArray212[local313]);
					local35.anIntArray214[local313] = ((Class5_Sub27) Static152.aClass42_10.method1109((long) local35.anIntArray212[local313])).anInt4812;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray214.length; local313++) {
				@Pc(1082) Class137 local1082 = Static137.aClass137Array2[local35.anIntArray214[local313]];
				if (local1082.anInt3810 == 0) {
					local65 += local1082.anInt3805 * arg1;
					local82 += local1082.anInt3811 * arg1;
					local99 += local1082.anInt3799 * arg1;
					local303 = true;
				} else {
					super.anInt2966 += local1082.anInt3805 * arg1;
					super.anInt2967 += local1082.anInt3811 * arg1;
					super.anInt2969 += local1082.anInt3799 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort45 = (short) local65;
					this.aShort47 = (short) local82;
					this.aShort46 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2971 <<= 0x1;
			}
		}
		super.anInt2966 = (int) ((long) super.anInt2966 + ((long) this.aShort45 * (long) this.anInt2971 >> 23) * (long) arg1);
		super.anInt2967 = (int) ((long) super.anInt2967 + ((long) this.aShort47 * (long) this.anInt2971 >> 23) * (long) arg1);
		super.anInt2969 = (int) ((long) super.anInt2969 + ((long) this.aShort46 * (long) this.anInt2971 >> 23) * (long) arg1);
	}
}
