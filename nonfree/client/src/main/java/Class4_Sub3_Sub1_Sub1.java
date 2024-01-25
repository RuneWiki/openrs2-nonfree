import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class4_Sub3_Sub1_Sub1 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
	private int anInt5231;

	@OriginalMember(owner = "client!kq", name = "O", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!kq", name = "L", descriptor = "Lclient!ra;")
	public Class4_Sub6 aClass4_Sub6_1;

	@OriginalMember(owner = "client!kq", name = "K", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!kq", name = "R", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!kq", name = "Q", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!kq", name = "S", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
	private int anInt5232;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ra;IIIIIIIIIIIZZ)V")
	public Class4_Sub3_Sub1_Sub1(@OriginalArg(0) Class4_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub6_1 = arg0;
		super.anInt5229 = arg1 << 12;
		super.anInt5228 = arg2 << 12;
		super.anInt5221 = arg3 << 12;
		super.anInt5222 = arg9;
		this.aShort84 = this.aShort80 = (short) arg8;
		super.anInt5219 = arg10;
		super.anInt5223 = arg11;
		super.aBoolean356 = arg13;
		this.aShort83 = (short) arg4;
		this.aShort85 = (short) arg5;
		this.aShort82 = (short) arg6;
		this.anInt5232 = arg7;
		super.aByte46 = this.aClass4_Sub6_1.aClass83_2.aByte27;
		this.method4383();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
	public void method4382() {
		this.aClass4_Sub6_1.aClass4_Sub4_6.aClass4_Sub3_Sub1_Sub1Array1[this.aShort81] = null;
		Static294.aClass4_Sub3_Sub1_Sub1Array2[Static330.anInt6305] = this;
		Static330.anInt6305 = Static330.anInt6305 + 1 & 0x3FF;
		this.method7407();
		this.method5698();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
	private void method4383() {
		@Pc(4) int local4 = this.aClass4_Sub6_1.aClass4_Sub4_6.anInt5455;
		if (this.aClass4_Sub6_1.aClass4_Sub4_6.aClass4_Sub3_Sub1_Sub1Array1[local4] != null) {
			this.aClass4_Sub6_1.aClass4_Sub4_6.aClass4_Sub3_Sub1_Sub1Array1[local4].method4382();
		}
		this.aClass4_Sub6_1.aClass4_Sub4_6.aClass4_Sub3_Sub1_Sub1Array1[local4] = this;
		this.aShort81 = (short) this.aClass4_Sub6_1.aClass4_Sub4_6.anInt5455;
		this.aClass4_Sub6_1.aClass4_Sub4_6.anInt5455 = local4 + 1 & 0x1FFF;
		this.aClass4_Sub6_1.aClass90_14.method2322(this);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!ra;IIIIIIIIIIIZZ)V")
	public void method4384(@OriginalArg(0) Class4_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass4_Sub6_1 = arg0;
		super.anInt5229 = arg1 << 12;
		super.anInt5228 = arg2 << 12;
		super.anInt5221 = arg3 << 12;
		super.anInt5222 = arg9;
		this.aShort84 = this.aShort80 = (short) arg8;
		super.anInt5219 = arg10;
		super.anInt5223 = arg11;
		super.aBoolean356 = arg13;
		this.aShort83 = (short) arg4;
		this.aShort85 = (short) arg5;
		this.aShort82 = (short) arg6;
		this.anInt5232 = arg7;
		super.aByte46 = this.aClass4_Sub6_1.aClass83_2.aByte27;
		this.method4383();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!oa;J)V")
	public void method4385(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt5229 >> Static33.anInt880 + 12;
		@Pc(13) int local13 = super.anInt5221 >> Static33.anInt880 + 12;
		@Pc(18) int local18 = super.anInt5228 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static126.anInt2626 || local13 < 0 || local13 >= Static108.anInt2385) {
			this.method4382();
			return;
		}
		@Pc(40) Class4_Sub4 local40 = this.aClass4_Sub6_1.aClass4_Sub4_6;
		@Pc(44) Class108 local44 = this.aClass4_Sub6_1.aClass108_1;
		@Pc(46) Class52[] local46 = Static511.aClass52Array3;
		@Pc(49) int local49 = local40.anInt5458;
		@Pc(58) Class290 local58 = Static279.aClass290ArrayArrayArray7[local40.anInt5458][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte95;
		}
		@Pc(70) int local70 = local46[local49].JA(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static399.anInt7385 - 1) {
			local84 = local46[local49 + 1].JA(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static33.anInt880);
		}
		if (local44.aBoolean276) {
			if (local44.anInt3740 == -1 && local18 > local70) {
				this.method4382();
				return;
			}
			if (local44.anInt3740 >= 0 && local18 > local46[local44.anInt3740].JA(local6, local13)) {
				this.method4382();
				return;
			}
			if (local44.anInt3760 == -1 && local18 < local84) {
				this.method4382();
				return;
			}
			if (local44.anInt3760 >= 0 && local18 < local46[local44.anInt3760 + 1].JA(local6, local13)) {
				this.method4382();
				return;
			}
		}
		if (local6 >= local40.anInt5462 && local6 <= local40.anInt5461 && local13 >= local40.anInt5460 && local13 <= local40.anInt5457 && local18 <= local70 && local18 >= local84) {
			local40.aClass26_1.aClass163_1.method4281(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static399.anInt7385 - 1; local172 > 0 && local18 > local46[local172].JA(local6, local13); local172--) {
		}
		if (local44.aBoolean282 && local172 == 0 && local18 > local46[0].JA(local6, local13)) {
			this.method4382();
		} else if (local172 == Static399.anInt7385 - 1 && local46[local172].JA(local6, local13) - local18 > 0x8 << Static33.anInt880) {
			this.method4382();
		} else {
			local58 = Static279.aClass290ArrayArrayArray7[local172][local6][local13];
			@Pc(278) int local278;
			if (local58 == null) {
				if (local172 == 0 || Static279.aClass290ArrayArrayArray7[0][local6][local13] == null) {
					local58 = Static279.aClass290ArrayArrayArray7[0][local6][local13] = new Class290(0, local6, local13);
				}
				@Pc(268) boolean local268 = Static279.aClass290ArrayArrayArray7[0][local6][local13].aClass290_1 != null;
				if (local172 == 3 && local268) {
					this.method4382();
					return;
				}
				for (local278 = 1; local278 <= local172; local278++) {
					if (Static279.aClass290ArrayArrayArray7[local278][local6][local13] == null) {
						local58 = Static279.aClass290ArrayArrayArray7[local278][local6][local13] = new Class290(local278, local6, local13);
						if (local268) {
							local58.aByte95++;
						}
					}
				}
			}
			if (local44.aBoolean277) {
				@Pc(323) int local323 = super.anInt5229 >> 12;
				local278 = super.anInt5221 >> 12;
				@Pc(337) Class81 local337;
				if (local58.aClass6_Sub2_2 != null) {
					local337 = local58.aClass6_Sub2_2.method7751(arg0);
					if (local337 != null && local337.method2218(local323, local278, local18)) {
						this.method4382();
						return;
					}
				}
				if (local58.aClass6_Sub2_3 != null) {
					local337 = local58.aClass6_Sub2_3.method7751(arg0);
					if (local337 != null && local337.method2218(local323, local278, local18)) {
						this.method4382();
						return;
					}
				}
				if (local58.aClass6_Sub3_2 != null) {
					local337 = local58.aClass6_Sub3_2.method7751(arg0);
					if (local337 != null && local337.method2218(local323, local278, local18)) {
						this.method4382();
						return;
					}
				}
				for (@Pc(394) Class98 local394 = local58.aClass98_3; local394 != null; local394 = local394.aClass98_1) {
					@Pc(401) Class81 local401 = local394.aClass6_Sub1_1.method7751(arg0);
					if (local401 != null && local401.method2218(local323, local278, local18)) {
						this.method4382();
						return;
					}
				}
			}
			if (local58.aClass26_2 == null) {
				local58.aClass26_2 = new Class26();
				local58.aByte96 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte96 != (byte) (arg1 & 0xFFL)) {
				local58.aClass26_2.aClass163_1.method4280();
				local58.aClass26_2.aBoolean66 = false;
				local58.aByte96 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass26_2.aClass163_1.method4281(this);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(JI)V")
	public void method4386(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort80 = (short) (this.aShort80 - arg1);
		if (this.aShort80 <= 0) {
			this.method4382();
			return;
		}
		@Pc(17) int local17 = super.anInt5229 >> 12;
		@Pc(22) int local22 = super.anInt5228 >> 12;
		@Pc(27) int local27 = super.anInt5221 >> 12;
		@Pc(31) Class4_Sub4 local31 = this.aClass4_Sub6_1.aClass4_Sub4_6;
		@Pc(35) Class108 local35 = this.aClass4_Sub6_1.aClass108_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3771 != 0) {
			if (this.aShort84 - this.aShort80 <= local35.anInt3769) {
				local65 = (super.anInt5222 >> 8 & 0xFF00) + (this.anInt5231 >> 16 & 0xFF) + local35.anInt3773 * arg1;
				local82 = (super.anInt5222 & 0xFF00) + (this.anInt5231 >> 8 & 0xFF) + local35.anInt3752 * arg1;
				local99 = ((super.anInt5222 & 0xFF) << 8) + (this.anInt5231 & 0xFF) + local35.anInt3731 * arg1;
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
				super.anInt5222 &= 0xFF000000;
				super.anInt5222 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5231 &= 0xFF000000;
				this.anInt5231 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort84 - this.aShort80 <= local35.anInt3737) {
				local65 = (super.anInt5222 >> 16 & 0xFF00) + (this.anInt5231 >> 24 & 0xFF) + local35.anInt3733 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5222 &= 0xFFFFFF;
				super.anInt5222 |= (local65 & 0xFF00) << 16;
				this.anInt5231 &= 0xFFFFFF;
				this.anInt5231 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3748 != -1 && this.aShort84 - this.aShort80 <= local35.anInt3746) {
			this.anInt5232 += local35.anInt3751 * arg1;
		}
		if (local35.anInt3727 != -1 && this.aShort84 - this.aShort80 <= local35.anInt3730) {
			super.anInt5219 += local35.lb * arg1;
		}
		local65 = this.aShort83;
		local82 = this.aShort85;
		local99 = this.aShort82;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(342) int local342;
		@Pc(350) long local350;
		if (local35.anInt3772 == 1) {
			local313 = local17 - this.aClass4_Sub6_1.anInt7531;
			local319 = local22 - this.aClass4_Sub6_1.anInt7519;
			local325 = local27 - this.aClass4_Sub6_1.anInt7540;
			local342 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325)) >> 2;
			local350 = local35.anInt3728 * local342 * arg1;
			this.anInt5232 = (int) ((long) this.anInt5232 - ((long) this.anInt5232 * local350 >> 18));
		} else if (local35.anInt3772 == 2) {
			local313 = local17 - this.aClass4_Sub6_1.anInt7531;
			local319 = local22 - this.aClass4_Sub6_1.anInt7519;
			local325 = local27 - this.aClass4_Sub6_1.anInt7540;
			local342 = local313 * local313 + local319 * local319 + local325 * local325;
			local350 = local35.anInt3728 * local342 * arg1;
			this.anInt5232 = (int) ((long) this.anInt5232 - ((long) this.anInt5232 * local350 >> 28));
		}
		@Pc(446) int local446;
		@Pc(480) int local480;
		@Pc(493) long local493;
		@Pc(503) int local503;
		@Pc(539) int local539;
		if (local35.anIntArray369 != null) {
			@Pc(428) Class3 local428 = local31.aClass71_44.aClass3_73;
			for (@Pc(431) Class3 local431 = local428.aClass3_284; local431 != local428; local431 = local431.aClass3_284) {
				@Pc(435) Class3_Sub10_Sub13 local435 = (Class3_Sub10_Sub13) local431;
				@Pc(438) Class75 local438 = local435.aClass75_1;
				if (local438.anInt2483 != 1) {
					@Pc(444) boolean local444 = false;
					for (local446 = 0; local446 < local35.anIntArray369.length; local446++) {
						if (local35.anIntArray369[local446] == local438.anInt2489) {
							local444 = true;
							break;
						}
					}
					if (local444) {
						@Pc(470) int local470 = local17 - local435.anInt6880;
						@Pc(475) int local475 = local22 - local435.anInt6877;
						local480 = local27 - local435.anInt6876;
						local493 = local470 * local470 + local475 * local475 + local480 * local480;
						if (local493 <= local438.aLong75) {
							local503 = (int) Math.sqrt((double) local493);
							if (local503 == 0) {
								local503 = 1;
							}
							@Pc(531) long local531 = (long) (local470 * local435.anInt6878 + local475 * local438.anInt2479 + local480 * local435.anInt6879) * 65535L / (long) (local438.anInt2475 * local503);
							if (local531 >= (long) local438.anInt2482) {
								local539 = 0;
								if (local438.anInt2491 == 1) {
									local539 = (local503 >> 4) * local438.anInt2477;
								} else if (local438.anInt2491 == 2) {
									local539 = (local503 >> 4) * (local503 >> 4) * local438.anInt2477;
								}
								if (local438.anInt2488 != 0) {
									@Pc(645) int local645 = (local470 << 15) / local503 * local438.anInt2475;
									@Pc(654) int local654 = (local475 << 15) / local503 * local438.anInt2475;
									@Pc(663) int local663 = (local480 << 15) / local503 * local438.anInt2475;
									if (local438.anInt2484 == 0) {
										local65 += local645 * arg1 >> 15;
										local82 += local654 * arg1 >> 15;
										local99 += local663 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5229 += local645 * arg1 >> 15;
										super.anInt5228 += local654 * arg1 >> 15;
										super.anInt5221 += local663 * arg1 >> 15;
									}
								} else if (local438.anInt2484 == 0) {
									local65 += (local435.anInt6878 - local539) * arg1;
									local82 += (local438.anInt2479 - local539) * arg1;
									local99 += (local435.anInt6879 - local539) * arg1;
									local303 = true;
								} else {
									super.anInt5229 += (local435.anInt6878 - local539) * arg1;
									super.anInt5228 += (local438.anInt2479 - local539) * arg1;
									super.anInt5221 += (local435.anInt6879 - local539) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray368 != null) {
			for (local313 = 0; local313 < local35.anIntArray368.length; local313++) {
				@Pc(745) Class3_Sub10_Sub13 local745 = (Class3_Sub10_Sub13) Static98.aClass265_1.method6628((long) local35.anIntArray368[local313]);
				while (local745 != null) {
					@Pc(749) Class75 local749 = local745.aClass75_1;
					local342 = local17 - local745.anInt6880;
					@Pc(759) int local759 = local22 - local745.anInt6877;
					local446 = local27 - local745.anInt6876;
					@Pc(777) long local777 = (long) (local342 * local342 + local759 * local759 + local446 * local446);
					if (local777 > local749.aLong75) {
						local745 = (Class3_Sub10_Sub13) Static98.aClass265_1.method6630();
					} else {
						local480 = (int) Math.sqrt((double) local777);
						if (local480 == 0) {
							local480 = 1;
						}
						local493 = (long) (local342 * local745.anInt6878 + local759 * local749.anInt2479 + local446 * local745.anInt6879) * 65535L / (long) (local749.anInt2475 * local480);
						if (local493 < (long) local749.anInt2482) {
							local745 = (Class3_Sub10_Sub13) Static98.aClass265_1.method6630();
						} else {
							local503 = 0;
							if (local749.anInt2491 == 1) {
								local503 = (local480 >> 4) * local749.anInt2477;
							} else if (local749.anInt2491 == 2) {
								local503 = (local480 >> 4) * (local480 >> 4) * local749.anInt2477;
							}
							if (local749.anInt2488 != 0) {
								@Pc(941) int local941 = (local342 << 15) / local480 * local749.anInt2475;
								@Pc(950) int local950 = (local759 << 15) / local480 * local749.anInt2475;
								local539 = (local446 << 15) / local480 * local749.anInt2475;
								if (local749.anInt2484 == 0) {
									local65 += local941 * arg1 >> 15;
									local82 += local950 * arg1 >> 15;
									local99 += local539 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5229 += local941 * arg1 >> 15;
									super.anInt5228 += local950 * arg1 >> 15;
									super.anInt5221 += local539 * arg1 >> 15;
								}
							} else if (local749.anInt2484 == 0) {
								local65 += (local745.anInt6878 - local503) * arg1;
								local82 += (local749.anInt2479 - local503) * arg1;
								local99 += (local745.anInt6879 - local503) * arg1;
								local303 = true;
							} else {
								super.anInt5229 += (local745.anInt6878 - local503) * arg1;
								super.anInt5228 += (local749.anInt2479 - local503) * arg1;
								super.anInt5221 += (local745.anInt6879 - local503) * arg1;
							}
							local745 = (Class3_Sub10_Sub13) Static98.aClass265_1.method6630();
						}
					}
				}
			}
		}
		if (local35.anIntArray370 != null) {
			if (local35.anIntArray371 == null) {
				local35.anIntArray371 = new int[local35.anIntArray370.length];
				for (local313 = 0; local313 < local35.anIntArray370.length; local313++) {
					Static352.method5552(local35.anIntArray370[local313]);
					local35.anIntArray371[local313] = ((Class3_Sub47) Static44.aClass267_4.method6644((long) local35.anIntArray370[local313])).anInt8701;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray371.length; local313++) {
				@Pc(1084) Class75 local1084 = Static73.aClass75Array7[local35.anIntArray371[local313]];
				if (local1084.anInt2484 == 0) {
					local65 += local1084.anInt2487 * arg1;
					local82 += local1084.anInt2479 * arg1;
					local99 += local1084.anInt2480 * arg1;
					local303 = true;
				} else {
					super.anInt5229 += local1084.anInt2487 * arg1;
					super.anInt5228 += local1084.anInt2479 * arg1;
					super.anInt5221 += local1084.anInt2480 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort83 = (short) local65;
					this.aShort85 = (short) local82;
					this.aShort82 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5232 <<= 0x1;
			}
		}
		super.anInt5229 = (int) ((long) super.anInt5229 + ((long) this.aShort83 * (long) (this.anInt5232 << 2) >> 23) * (long) arg1);
		super.anInt5228 = (int) ((long) super.anInt5228 + ((long) this.aShort85 * (long) (this.anInt5232 << 2) >> 23) * (long) arg1);
		super.anInt5221 = (int) ((long) super.anInt5221 + ((long) this.aShort82 * (long) (this.anInt5232 << 2) >> 23) * (long) arg1);
	}
}
