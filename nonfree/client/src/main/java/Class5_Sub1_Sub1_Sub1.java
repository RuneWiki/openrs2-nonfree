import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class5_Sub1_Sub1_Sub1 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!mea", name = "E", descriptor = "I")
	private int anInt6016;

	@OriginalMember(owner = "client!mea", name = "K", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!mea", name = "G", descriptor = "Lclient!ru;")
	public Class5_Sub7 aClass5_Sub7_1;

	@OriginalMember(owner = "client!mea", name = "H", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!mea", name = "C", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!mea", name = "I", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!mea", name = "J", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!mea", name = "D", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!mea", name = "F", descriptor = "I")
	private int anInt6017;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!ru;IIIIIIIIIIIZZ)V")
	public Class5_Sub1_Sub1_Sub1(@OriginalArg(0) Class5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass5_Sub7_1 = arg0;
		super.anInt6014 = arg1 << 12;
		super.anInt6009 = arg2 << 12;
		super.anInt6011 = arg3 << 12;
		super.anInt6015 = arg9;
		this.aShort57 = this.aShort59 = (short) arg8;
		super.anInt6007 = arg10;
		super.anInt6013 = arg11;
		super.aBoolean448 = arg13;
		this.aShort60 = (short) arg4;
		this.aShort61 = (short) arg5;
		this.aShort58 = (short) arg6;
		this.anInt6017 = arg7;
		super.aByte55 = this.aClass5_Sub7_1.aClass69_2.aByte29;
		this.method5148();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(JI)V")
	public void method5144(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort59 = (short) (this.aShort59 - arg1);
		if (this.aShort59 <= 0) {
			this.method5146();
			return;
		}
		@Pc(17) int local17 = super.anInt6014 >> 12;
		@Pc(22) int local22 = super.anInt6009 >> 12;
		@Pc(27) int local27 = super.anInt6011 >> 12;
		@Pc(31) Class5_Sub2 local31 = this.aClass5_Sub7_1.aClass5_Sub2_8;
		@Pc(35) Class284 local35 = this.aClass5_Sub7_1.aClass284_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt8532 != 0) {
			if (this.aShort57 - this.aShort59 <= local35.anInt8499) {
				local65 = (super.anInt6015 >> 8 & 0xFF00) + (this.anInt6016 >> 16 & 0xFF) + local35.anInt8530 * arg1;
				local82 = (super.anInt6015 & 0xFF00) + (this.anInt6016 >> 8 & 0xFF) + local35.anInt8500 * arg1;
				local99 = ((super.anInt6015 & 0xFF) << 8) + (this.anInt6016 & 0xFF) + local35.anInt8545 * arg1;
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
				super.anInt6015 &= 0xFF000000;
				super.anInt6015 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6016 &= 0xFF000000;
				this.anInt6016 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort57 - this.aShort59 <= local35.anInt8535) {
				local65 = (super.anInt6015 >> 16 & 0xFF00) + (this.anInt6016 >> 24 & 0xFF) + local35.anInt8531 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6015 &= 0xFFFFFF;
				super.anInt6015 |= (local65 & 0xFF00) << 16;
				this.anInt6016 &= 0xFFFFFF;
				this.anInt6016 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8533 != -1 && this.aShort57 - this.aShort59 <= local35.anInt8506) {
			this.anInt6017 += local35.anInt8511 * arg1;
		}
		if (local35.anInt8497 != -1 && this.aShort57 - this.aShort59 <= local35.anInt8495) {
			super.anInt6007 += local35.anInt8528 * arg1;
		}
		local65 = this.aShort60;
		local82 = this.aShort61;
		local99 = this.aShort58;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(342) int local342;
		@Pc(350) long local350;
		if (local35.anInt8510 == 1) {
			local313 = local17 - this.aClass5_Sub7_1.anInt8297;
			local319 = local22 - this.aClass5_Sub7_1.anInt8308;
			local325 = local27 - this.aClass5_Sub7_1.anInt8295;
			local342 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325)) >> 2;
			local350 = local35.anInt8539 * local342 * arg1;
			this.anInt6017 = (int) ((long) this.anInt6017 - ((long) this.anInt6017 * local350 >> 18));
		} else if (local35.anInt8510 == 2) {
			local313 = local17 - this.aClass5_Sub7_1.anInt8297;
			local319 = local22 - this.aClass5_Sub7_1.anInt8308;
			local325 = local27 - this.aClass5_Sub7_1.anInt8295;
			local342 = local313 * local313 + local319 * local319 + local325 * local325;
			local350 = local35.anInt8539 * local342 * arg1;
			this.anInt6017 = (int) ((long) this.anInt6017 - ((long) this.anInt6017 * local350 >> 28));
		}
		@Pc(446) int local446;
		@Pc(480) int local480;
		@Pc(493) long local493;
		@Pc(503) int local503;
		@Pc(539) int local539;
		if (local35.anIntArray714 != null) {
			@Pc(428) Class6 local428 = local31.aClass211_28.aClass6_154;
			for (@Pc(431) Class6 local431 = local428.aClass6_283; local431 != local428; local431 = local431.aClass6_283) {
				@Pc(435) Class6_Sub4_Sub16 local435 = (Class6_Sub4_Sub16) local431;
				@Pc(438) Class330 local438 = local435.aClass330_1;
				if (local438.anInt9306 != 1) {
					@Pc(444) boolean local444 = false;
					for (local446 = 0; local446 < local35.anIntArray714.length; local446++) {
						if (local35.anIntArray714[local446] == local438.anInt9301) {
							local444 = true;
							break;
						}
					}
					if (local444) {
						@Pc(470) int local470 = local17 - local435.anInt8562;
						@Pc(475) int local475 = local22 - local435.anInt8563;
						local480 = local27 - local435.anInt8567;
						local493 = local470 * local470 + local475 * local475 + local480 * local480;
						if (local493 <= local438.aLong236) {
							local503 = (int) Math.sqrt((double) local493);
							if (local503 == 0) {
								local503 = 1;
							}
							@Pc(531) long local531 = (long) (local470 * local435.anInt8561 + local475 * local438.anInt9295 + local480 * local435.anInt8564) * 65535L / (long) (local438.anInt9303 * local503);
							if (local531 >= (long) local438.anInt9308) {
								local539 = 0;
								if (local438.anInt9299 == 1) {
									local539 = (local503 >> 4) * local438.anInt9305;
								} else if (local438.anInt9299 == 2) {
									local539 = (local503 >> 4) * (local503 >> 4) * local438.anInt9305;
								}
								if (local438.anInt9298 != 0) {
									@Pc(645) int local645 = (local470 << 15) / local503 * local438.anInt9303;
									@Pc(654) int local654 = (local475 << 15) / local503 * local438.anInt9303;
									@Pc(663) int local663 = (local480 << 15) / local503 * local438.anInt9303;
									if (local438.anInt9302 == 0) {
										local65 += local645 * arg1 >> 15;
										local82 += local654 * arg1 >> 15;
										local99 += local663 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6014 += local645 * arg1 >> 15;
										super.anInt6009 += local654 * arg1 >> 15;
										super.anInt6011 += local663 * arg1 >> 15;
									}
								} else if (local438.anInt9302 == 0) {
									local65 += (local435.anInt8561 - local539) * arg1;
									local82 += (local438.anInt9295 - local539) * arg1;
									local99 += (local435.anInt8564 - local539) * arg1;
									local303 = true;
								} else {
									super.anInt6014 += (local435.anInt8561 - local539) * arg1;
									super.anInt6009 += (local438.anInt9295 - local539) * arg1;
									super.anInt6011 += (local435.anInt8564 - local539) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray715 != null) {
			for (local313 = 0; local313 < local35.anIntArray715.length; local313++) {
				@Pc(745) Class6_Sub4_Sub16 local745 = (Class6_Sub4_Sub16) Static40.aClass41_1.method1142((long) local35.anIntArray715[local313]);
				while (local745 != null) {
					@Pc(749) Class330 local749 = local745.aClass330_1;
					local342 = local17 - local745.anInt8562;
					@Pc(759) int local759 = local22 - local745.anInt8563;
					local446 = local27 - local745.anInt8567;
					@Pc(777) long local777 = (long) (local342 * local342 + local759 * local759 + local446 * local446);
					if (local777 > local749.aLong236) {
						local745 = (Class6_Sub4_Sub16) Static40.aClass41_1.method1141();
					} else {
						local480 = (int) Math.sqrt((double) local777);
						if (local480 == 0) {
							local480 = 1;
						}
						local493 = (long) (local342 * local745.anInt8561 + local759 * local749.anInt9295 + local446 * local745.anInt8564) * 65535L / (long) (local749.anInt9303 * local480);
						if (local493 < (long) local749.anInt9308) {
							local745 = (Class6_Sub4_Sub16) Static40.aClass41_1.method1141();
						} else {
							local503 = 0;
							if (local749.anInt9299 == 1) {
								local503 = (local480 >> 4) * local749.anInt9305;
							} else if (local749.anInt9299 == 2) {
								local503 = (local480 >> 4) * (local480 >> 4) * local749.anInt9305;
							}
							if (local749.anInt9298 != 0) {
								@Pc(941) int local941 = (local342 << 15) / local480 * local749.anInt9303;
								@Pc(950) int local950 = (local759 << 15) / local480 * local749.anInt9303;
								local539 = (local446 << 15) / local480 * local749.anInt9303;
								if (local749.anInt9302 == 0) {
									local65 += local941 * arg1 >> 15;
									local82 += local950 * arg1 >> 15;
									local99 += local539 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6014 += local941 * arg1 >> 15;
									super.anInt6009 += local950 * arg1 >> 15;
									super.anInt6011 += local539 * arg1 >> 15;
								}
							} else if (local749.anInt9302 == 0) {
								local65 += (local745.anInt8561 - local503) * arg1;
								local82 += (local749.anInt9295 - local503) * arg1;
								local99 += (local745.anInt8564 - local503) * arg1;
								local303 = true;
							} else {
								super.anInt6014 += (local745.anInt8561 - local503) * arg1;
								super.anInt6009 += (local749.anInt9295 - local503) * arg1;
								super.anInt6011 += (local745.anInt8564 - local503) * arg1;
							}
							local745 = (Class6_Sub4_Sub16) Static40.aClass41_1.method1141();
						}
					}
				}
			}
		}
		if (local35.anIntArray713 != null) {
			if (local35.anIntArray716 == null) {
				local35.anIntArray716 = new int[local35.anIntArray713.length];
				for (local313 = 0; local313 < local35.anIntArray713.length; local313++) {
					Static329.method5264(local35.anIntArray713[local313]);
					local35.anIntArray716[local313] = ((Class6_Sub24) Static535.aClass305_38.method7447((long) local35.anIntArray713[local313])).anInt4156;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray716.length; local313++) {
				@Pc(1084) Class330 local1084 = Static536.aClass330Array1[local35.anIntArray716[local313]];
				if (local1084.anInt9302 == 0) {
					local65 += local1084.anInt9293 * arg1;
					local82 += local1084.anInt9295 * arg1;
					local99 += local1084.anInt9309 * arg1;
					local303 = true;
				} else {
					super.anInt6014 += local1084.anInt9293 * arg1;
					super.anInt6009 += local1084.anInt9295 * arg1;
					super.anInt6011 += local1084.anInt9309 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort60 = (short) local65;
					this.aShort61 = (short) local82;
					this.aShort58 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6017 <<= 0x1;
			}
		}
		super.anInt6014 = (int) ((long) super.anInt6014 + ((long) this.aShort60 * (long) (this.anInt6017 << 2) >> 23) * (long) arg1);
		super.anInt6009 = (int) ((long) super.anInt6009 + ((long) this.aShort61 * (long) (this.anInt6017 << 2) >> 23) * (long) arg1);
		super.anInt6011 = (int) ((long) super.anInt6011 + ((long) this.aShort58 * (long) (this.anInt6017 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!oa;J)V")
	public void method5145(@OriginalArg(0) Class9 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt6014 >> Static494.anInt8859 + 12;
		@Pc(13) int local13 = super.anInt6011 >> Static494.anInt8859 + 12;
		@Pc(18) int local18 = super.anInt6009 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static396.anInt7505 || local13 < 0 || local13 >= Static54.anInt1441) {
			this.method5146();
			return;
		}
		@Pc(40) Class5_Sub2 local40 = this.aClass5_Sub7_1.aClass5_Sub2_8;
		@Pc(44) Class284 local44 = this.aClass5_Sub7_1.aClass284_1;
		@Pc(46) Class62[] local46 = Static47.aClass62Array1;
		@Pc(49) int local49 = local40.anInt4347;
		@Pc(58) Class224 local58 = Static256.aClass224ArrayArrayArray1[local40.anInt4347][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte69;
		}
		@Pc(70) int local70 = local46[local49].JA(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static192.anInt4157 - 1) {
			local84 = local46[local49 + 1].JA(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static494.anInt8859);
		}
		if (local44.aBoolean641) {
			if (local44.anInt8540 == -1 && local18 > local70) {
				this.method5146();
				return;
			}
			if (local44.anInt8540 >= 0 && local18 > local46[local44.anInt8540].JA(local6, local13)) {
				this.method5146();
				return;
			}
			if (local44.anInt8514 == -1 && local18 < local84) {
				this.method5146();
				return;
			}
			if (local44.anInt8514 >= 0 && local18 < local46[local44.anInt8514 + 1].JA(local6, local13)) {
				this.method5146();
				return;
			}
		}
		if (local6 >= local40.anInt4346 && local6 <= local40.anInt4350 && local13 >= local40.anInt4348 && local13 <= local40.anInt4349 && local18 <= local70 && local18 >= local84) {
			local40.aClass299_1.aClass272_1.method6601(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static192.anInt4157 - 1; local172 > 0 && local18 > local46[local172].JA(local6, local13); local172--) {
		}
		if (local44.aBoolean640 && local172 == 0 && local18 > local46[0].JA(local6, local13)) {
			this.method5146();
		} else if (local172 == Static192.anInt4157 - 1 && local46[local172].JA(local6, local13) - local18 > 0x8 << Static494.anInt8859) {
			this.method5146();
		} else {
			local58 = Static256.aClass224ArrayArrayArray1[local172][local6][local13];
			@Pc(278) int local278;
			if (local58 == null) {
				if (local172 == 0 || Static256.aClass224ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static256.aClass224ArrayArrayArray1[0][local6][local13] = new Class224(0, local6, local13);
				}
				@Pc(268) boolean local268 = Static256.aClass224ArrayArrayArray1[0][local6][local13].aClass224_1 != null;
				if (local172 == 3 && local268) {
					this.method5146();
					return;
				}
				for (local278 = 1; local278 <= local172; local278++) {
					if (Static256.aClass224ArrayArrayArray1[local278][local6][local13] == null) {
						local58 = Static256.aClass224ArrayArrayArray1[local278][local6][local13] = new Class224(local278, local6, local13);
						if (local268) {
							local58.aByte69++;
						}
					}
				}
			}
			if (local44.aBoolean636) {
				@Pc(323) int local323 = super.anInt6014 >> 12;
				local278 = super.anInt6011 >> 12;
				@Pc(337) Class122 local337;
				if (local58.aClass11_Sub4_3 != null) {
					local337 = local58.aClass11_Sub4_3.method8106(arg0);
					if (local337 != null && local337.method3536(local18, local323, local278)) {
						this.method5146();
						return;
					}
				}
				if (local58.aClass11_Sub4_2 != null) {
					local337 = local58.aClass11_Sub4_2.method8106(arg0);
					if (local337 != null && local337.method3536(local18, local323, local278)) {
						this.method5146();
						return;
					}
				}
				if (local58.aClass11_Sub5_2 != null) {
					local337 = local58.aClass11_Sub5_2.method8106(arg0);
					if (local337 != null && local337.method3536(local18, local323, local278)) {
						this.method5146();
						return;
					}
				}
				for (@Pc(394) Class270 local394 = local58.aClass270_1; local394 != null; local394 = local394.aClass270_2) {
					@Pc(401) Class122 local401 = local394.aClass11_Sub1_2.method8106(arg0);
					if (local401 != null && local401.method3536(local18, local323, local278)) {
						this.method5146();
						return;
					}
				}
			}
			if (local58.aClass299_2 == null) {
				local58.aClass299_2 = new Class299();
				local58.aByte67 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte67 != (byte) (arg1 & 0xFFL)) {
				local58.aClass299_2.aClass272_1.method6600();
				local58.aClass299_2.aBoolean663 = false;
				local58.aByte67 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass299_2.aClass272_1.method6601(this);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "()V")
	public void method5146() {
		this.aClass5_Sub7_1.aClass5_Sub2_8.aClass5_Sub1_Sub1_Sub1Array1[this.aShort62] = null;
		Static432.aClass5_Sub1_Sub1_Sub1Array2[Static186.anInt4087] = this;
		Static186.anInt4087 = Static186.anInt4087 + 1 & 0x3FF;
		this.method7282();
		this.method5138();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!ru;IIIIIIIIIIIZZ)V")
	public void method5147(@OriginalArg(0) Class5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass5_Sub7_1 = arg0;
		super.anInt6014 = arg1 << 12;
		super.anInt6009 = arg2 << 12;
		super.anInt6011 = arg3 << 12;
		super.anInt6015 = arg9;
		this.aShort57 = this.aShort59 = (short) arg8;
		super.anInt6007 = arg10;
		super.anInt6013 = arg11;
		super.aBoolean448 = arg13;
		this.aShort60 = (short) arg4;
		this.aShort61 = (short) arg5;
		this.aShort58 = (short) arg6;
		this.anInt6017 = arg7;
		super.aByte55 = this.aClass5_Sub7_1.aClass69_2.aByte29;
		this.method5148();
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "()V")
	private void method5148() {
		@Pc(4) int local4 = this.aClass5_Sub7_1.aClass5_Sub2_8.anInt4343;
		if (this.aClass5_Sub7_1.aClass5_Sub2_8.aClass5_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass5_Sub7_1.aClass5_Sub2_8.aClass5_Sub1_Sub1_Sub1Array1[local4].method5146();
		}
		this.aClass5_Sub7_1.aClass5_Sub2_8.aClass5_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort62 = (short) this.aClass5_Sub7_1.aClass5_Sub2_8.anInt4343;
		this.aClass5_Sub7_1.aClass5_Sub2_8.anInt4343 = local4 + 1 & 0x1FFF;
		this.aClass5_Sub7_1.aClass267_7.method6538(this);
	}
}
