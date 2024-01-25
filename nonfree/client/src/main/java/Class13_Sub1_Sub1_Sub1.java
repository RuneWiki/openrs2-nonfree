import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class13_Sub1_Sub1_Sub1 extends Class13_Sub1_Sub1 {

	@OriginalMember(owner = "client!jv", name = "I", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
	private int anInt3245;

	@OriginalMember(owner = "client!jv", name = "M", descriptor = "Lclient!ug;")
	private Class13_Sub7 aClass13_Sub7_1;

	@OriginalMember(owner = "client!jv", name = "N", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!jv", name = "J", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!jv", name = "K", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!jv", name = "D", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!jv", name = "P", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
	private int anInt3246;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!ug;IIIIIIIIIIIZZ)V")
	public Class13_Sub1_Sub1_Sub1(@OriginalArg(0) Class13_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass13_Sub7_1 = arg0;
		super.anInt3243 = arg1 << Static35.anInt703;
		super.anInt3236 = arg2 << Static35.anInt703;
		super.anInt3237 = arg3 << Static35.anInt703;
		super.anInt3241 = arg9;
		this.aShort36 = this.aShort38 = (short) arg8;
		super.anInt3238 = arg10;
		super.anInt3239 = arg11;
		super.aBoolean244 = arg13;
		this.aShort37 = (short) arg4;
		this.aShort34 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt3246 = arg7;
		super.aByte33 = this.aClass13_Sub7_1.aClass239_2.aByte86;
		this.method2733();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "()V")
	private void method2733() {
		@Pc(4) int local4 = this.aClass13_Sub7_1.aClass13_Sub2_7.anInt784;
		if (this.aClass13_Sub7_1.aClass13_Sub2_7.aClass13_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass13_Sub7_1.aClass13_Sub2_7.aClass13_Sub1_Sub1_Sub1Array1[local4].method2735();
		}
		this.aClass13_Sub7_1.aClass13_Sub2_7.aClass13_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort35 = (short) this.aClass13_Sub7_1.aClass13_Sub2_7.anInt784;
		this.aClass13_Sub7_1.aClass13_Sub2_7.anInt784 = local4 + 1 & 0x1FFF;
		this.aClass13_Sub7_1.aClass227_7.method4832(this);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!ug;IIIIIIIIIIIZZ)V")
	public void method2734(@OriginalArg(0) Class13_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass13_Sub7_1 = arg0;
		super.anInt3243 = arg1 << Static35.anInt703;
		super.anInt3236 = arg2 << Static35.anInt703;
		super.anInt3237 = arg3 << Static35.anInt703;
		super.anInt3241 = arg9;
		this.aShort36 = this.aShort38 = (short) arg8;
		super.anInt3238 = arg10;
		super.anInt3239 = arg11;
		super.aBoolean244 = arg13;
		this.aShort37 = (short) arg4;
		this.aShort34 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.anInt3246 = arg7;
		super.aByte33 = this.aClass13_Sub7_1.aClass239_2.aByte86;
		this.method2733();
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "()V")
	private void method2735() {
		this.aClass13_Sub7_1.aClass13_Sub2_7.aClass13_Sub1_Sub1_Sub1Array1[this.aShort35] = null;
		Static341.aClass13_Sub1_Sub1_Sub1Array2[Static88.anInt1562] = this;
		Static88.anInt1562 = Static88.anInt1562 + 1 & 0x3FF;
		this.method5413();
		this.method2724();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)V")
	public void method2736(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort38 = (short) (this.aShort38 - arg1);
		if (this.aShort38 <= 0) {
			this.method2735();
			return;
		}
		@Pc(17) int local17 = super.anInt3243 >> Static35.anInt703;
		@Pc(22) int local22 = super.anInt3236 >> Static35.anInt703;
		@Pc(27) int local27 = super.anInt3237 >> Static35.anInt703;
		@Pc(31) Class13_Sub2 local31 = this.aClass13_Sub7_1.aClass13_Sub2_7;
		@Pc(35) Class131 local35 = this.aClass13_Sub7_1.aClass131_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3294 != 0) {
			if (this.aShort36 - this.aShort38 <= local35.anInt3306) {
				local65 = (super.anInt3241 >> 8 & 0xFF00) + (this.anInt3245 >> 16 & 0xFF) + local35.anInt3289 * arg1;
				local82 = (super.anInt3241 & 0xFF00) + (this.anInt3245 >> 8 & 0xFF) + local35.anInt3277 * arg1;
				local99 = ((super.anInt3241 & 0xFF) << 8) + (this.anInt3245 & 0xFF) + local35.anInt3308 * arg1;
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
				super.anInt3241 &= 0xFF000000;
				super.anInt3241 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt3245 &= 0xFF000000;
				this.anInt3245 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort36 - this.aShort38 <= local35.anInt3315) {
				local65 = (super.anInt3241 >> 16 & 0xFF00) + (this.anInt3245 >> 24 & 0xFF) + local35.anInt3272 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt3241 &= 0xFFFFFF;
				super.anInt3241 |= (local65 & 0xFF00) << 16;
				this.anInt3245 &= 0xFFFFFF;
				this.anInt3245 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3288 != -1 && this.aShort36 - this.aShort38 <= local35.anInt3309) {
			this.anInt3246 += local35.lb * arg1;
		}
		if (local35.anInt3298 != -1 && this.aShort36 - this.aShort38 <= local35.anInt3271) {
			super.anInt3238 += local35.anInt3276 * arg1;
		}
		local65 = this.aShort37;
		local82 = this.aShort34;
		local99 = this.aShort39;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3300 == 1) {
			local313 = local17 - this.aClass13_Sub7_1.anInt6561;
			local319 = local22 - this.aClass13_Sub7_1.anInt6582;
			local325 = local27 - this.aClass13_Sub7_1.anInt6579;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3267 * local340 * arg1;
			this.anInt3246 = (int) ((long) this.anInt3246 - ((long) this.anInt3246 * local348 >> 18));
		} else if (local35.anInt3300 == 2) {
			local313 = local17 - this.aClass13_Sub7_1.anInt6561;
			local319 = local22 - this.aClass13_Sub7_1.anInt6582;
			local325 = local27 - this.aClass13_Sub7_1.anInt6579;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3267 * local340 * arg1;
			this.anInt3246 = (int) ((long) this.anInt3246 - ((long) this.anInt3246 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray176 != null) {
			@Pc(426) Class1 local426 = local31.aClass254_7.aClass1_249;
			for (@Pc(429) Class1 local429 = local426.aClass1_262; local429 != local426; local429 = local429.aClass1_262) {
				@Pc(433) Class1_Sub3_Sub5 local433 = (Class1_Sub3_Sub5) local429;
				@Pc(436) Class216 local436 = local433.aClass216_1;
				if (local436.anInt5843 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray176.length; local444++) {
						if (local35.anIntArray176[local444] == local436.anInt5857) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1559;
						@Pc(473) int local473 = local22 - local433.anInt1563;
						local478 = local27 - local433.anInt1564;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong174) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1567 + local473 * local436.anInt5848 + local478 * local433.anInt1568) * 65535L / (long) (local436.anInt5840 * local501);
							if (local529 >= (long) local436.anInt5846) {
								local537 = 0;
								if (local436.anInt5850 == 1) {
									local537 = (local501 >> 4) * local436.anInt5856;
								} else if (local436.anInt5850 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt5856;
								}
								if (local436.anInt5844 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt5840;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt5840;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt5840;
									if (local436.anInt5845 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt3243 += local643 * arg1 >> 15;
										super.anInt3236 += local652 * arg1 >> 15;
										super.anInt3237 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt5845 == 0) {
									local65 += (local433.anInt1567 - local537) * arg1;
									local82 += (local436.anInt5848 - local537) * arg1;
									local99 += (local433.anInt1568 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt3243 += (local433.anInt1567 - local537) * arg1;
									super.anInt3236 += (local436.anInt5848 - local537) * arg1;
									super.anInt3237 += (local433.anInt1568 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray177 != null) {
			for (local313 = 0; local313 < local35.anIntArray177.length; local313++) {
				@Pc(743) Class1_Sub3_Sub5 local743 = (Class1_Sub3_Sub5) Static434.aClass55_2.method1224((long) local35.anIntArray177[local313]);
				while (local743 != null) {
					@Pc(747) Class216 local747 = local743.aClass216_1;
					local340 = local17 - local743.anInt1559;
					@Pc(757) int local757 = local22 - local743.anInt1563;
					local444 = local27 - local743.anInt1564;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong174) {
						local743 = (Class1_Sub3_Sub5) Static434.aClass55_2.method1222();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1567 + local757 * local747.anInt5848 + local444 * local743.anInt1568) * 65535L / (long) (local747.anInt5840 * local478);
						if (local491 < (long) local747.anInt5846) {
							local743 = (Class1_Sub3_Sub5) Static434.aClass55_2.method1222();
						} else {
							local501 = 0;
							if (local747.anInt5850 == 1) {
								local501 = (local478 >> 4) * local747.anInt5856;
							} else if (local747.anInt5850 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt5856;
							}
							if (local747.anInt5844 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt5840;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt5840;
								local537 = (local444 << 15) / local478 * local747.anInt5840;
								if (local747.anInt5845 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt3243 += local939 * arg1 >> 15;
									super.anInt3236 += local948 * arg1 >> 15;
									super.anInt3237 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt5845 == 0) {
								local65 += (local743.anInt1567 - local501) * arg1;
								local82 += (local747.anInt5848 - local501) * arg1;
								local99 += (local743.anInt1568 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt3243 += (local743.anInt1567 - local501) * arg1;
								super.anInt3236 += (local747.anInt5848 - local501) * arg1;
								super.anInt3237 += (local743.anInt1568 - local501) * arg1;
							}
							local743 = (Class1_Sub3_Sub5) Static434.aClass55_2.method1222();
						}
					}
				}
			}
		}
		if (local35.anIntArray175 != null) {
			if (local35.anIntArray174 == null) {
				local35.anIntArray174 = new int[local35.anIntArray175.length];
				for (local313 = 0; local313 < local35.anIntArray175.length; local313++) {
					Static2.method2553(local35.anIntArray175[local313]);
					local35.anIntArray174[local313] = ((Class1_Sub6) Static136.aClass257_10.method5503((long) local35.anIntArray175[local313])).anInt796;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray174.length; local313++) {
				@Pc(1082) Class216 local1082 = Static197.aClass216Array1[local35.anIntArray174[local313]];
				if (local1082.anInt5845 == 0) {
					local65 += local1082.anInt5851 * arg1;
					local82 += local1082.anInt5848 * arg1;
					local99 += local1082.anInt5853 * arg1;
					local303 = true;
				} else {
					super.anInt3243 += local1082.anInt5851 * arg1;
					super.anInt3236 += local1082.anInt5848 * arg1;
					super.anInt3237 += local1082.anInt5853 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort37 = (short) local65;
					this.aShort34 = (short) local82;
					this.aShort39 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt3246 <<= 0x1;
			}
		}
		super.anInt3243 = (int) ((long) super.anInt3243 + ((long) this.aShort37 * (long) this.anInt3246 >> 23) * (long) arg1);
		super.anInt3236 = (int) ((long) super.anInt3236 + ((long) this.aShort34 * (long) this.anInt3246 >> 23) * (long) arg1);
		super.anInt3237 = (int) ((long) super.anInt3237 + ((long) this.aShort39 * (long) this.anInt3246 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(J)V")
	public void method2737(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt3243 >> Static384.anInt6381 + 12;
		@Pc(13) int local13 = super.anInt3237 >> Static384.anInt6381 + 12;
		@Pc(18) int local18 = super.anInt3236 >> Static35.anInt703;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static362.anInt6113 || local13 < 0 || local13 >= Static195.anInt3127) {
			this.method2735();
			return;
		}
		@Pc(40) Class13_Sub2 local40 = this.aClass13_Sub7_1.aClass13_Sub2_7;
		@Pc(44) Class131 local44 = this.aClass13_Sub7_1.aClass131_1;
		@Pc(46) Class163[] local46 = Static202.aClass163Array2;
		@Pc(54) int local54 = local46[local40.anInt789].I(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt789 < Static97.anInt1709 - 1) {
			local70 = local46[local40.anInt789 + 1].I(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static384.anInt6381);
		}
		if (local44.aBoolean247) {
			if (local44.anInt3314 == -1 && local18 > local54) {
				this.method2735();
				return;
			}
			if (local44.anInt3314 >= 0 && local18 > local46[local44.anInt3314].I(local6, local13)) {
				this.method2735();
				return;
			}
			if (local44.anInt3310 == -1 && local18 < local70) {
				this.method2735();
				return;
			}
			if (local44.anInt3310 >= 0 && local18 < local46[local44.anInt3310 + 1].I(local6, local13)) {
				this.method2735();
				return;
			}
		}
		if (local6 >= local40.anInt788 && local6 <= local40.anInt790 && local13 >= local40.anInt787 && local13 <= local40.anInt791 && local18 <= local54 && local18 >= local70) {
			local40.aClass194_1.aClass46_1.method989(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static97.anInt1709 - 1; local158 > 0 && local18 > local46[local158].I(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].I(local6, local13)) {
			this.method2735();
		} else if (local158 == Static97.anInt1709 - 1 && local46[local158].I(local6, local13) - local18 > 0x8 << Static384.anInt6381) {
			this.method2735();
		} else {
			@Pc(211) Class82 local211 = Static159.aClass82ArrayArrayArray2[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static159.aClass82ArrayArrayArray2[0][local6][local13] = new Class82(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static159.aClass82ArrayArrayArray2[0][local6][local13].aClass82_1 != null;
				if (local158 == 3 && local243) {
					this.method2735();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static159.aClass82ArrayArrayArray2[local253][local6][local13] == null) {
						local211 = Static159.aClass82ArrayArrayArray2[local253][local6][local13] = new Class82(local253, local6, local13);
						if (local243) {
							local211.aByte17++;
						}
					}
				}
			}
			if (local211.aClass194_2 == null) {
				local211.aClass194_2 = new Class194();
				local211.aByte20 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte20 != (byte) (arg0 & 0xFFL)) {
				local211.aClass194_2.aClass46_1.method987();
				local211.aClass194_2.aBoolean420 = false;
				local211.aByte20 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass194_2.aClass46_1.method989(this);
		}
	}
}
