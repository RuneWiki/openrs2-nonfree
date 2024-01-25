import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class60_Sub1_Sub1_Sub1 extends Class60_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
	private int anInt2710;

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "Lclient!lw;")
	public Class60_Sub5 aClass60_Sub5_1;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
	private int anInt2711;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!lw;IIIIIIIIIIIZZ)V")
	public Class60_Sub1_Sub1_Sub1(@OriginalArg(0) Class60_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass60_Sub5_1 = arg0;
		super.anInt2705 = arg1 << 12;
		super.anInt2701 = arg2 << 12;
		super.anInt2709 = arg3 << 12;
		super.anInt2703 = arg9;
		this.aShort47 = this.aShort45 = (short) arg8;
		super.anInt2707 = arg10;
		super.anInt2704 = arg11;
		super.aBoolean209 = arg13;
		this.aShort44 = (short) arg4;
		this.aShort49 = (short) arg5;
		this.aShort46 = (short) arg6;
		this.anInt2711 = arg7;
		super.aByte31 = this.aClass60_Sub5_1.aClass33_2.aByte7;
		this.method2314();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public void method2310() {
		this.aClass60_Sub5_1.aClass60_Sub4_5.aClass60_Sub1_Sub1_Sub1Array1[this.aShort48] = null;
		Static431.aClass60_Sub1_Sub1_Sub1Array2[Static173.anInt3149] = this;
		Static173.anInt3149 = Static173.anInt3149 + 1 & 0x3FF;
		this.method7802();
		this.method3818();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!lw;IIIIIIIIIIIZZ)V")
	public void method2311(@OriginalArg(0) Class60_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass60_Sub5_1 = arg0;
		super.anInt2705 = arg1 << 12;
		super.anInt2701 = arg2 << 12;
		super.anInt2709 = arg3 << 12;
		super.anInt2703 = arg9;
		this.aShort47 = this.aShort45 = (short) arg8;
		super.anInt2707 = arg10;
		super.anInt2704 = arg11;
		super.aBoolean209 = arg13;
		this.aShort44 = (short) arg4;
		this.aShort49 = (short) arg5;
		this.aShort46 = (short) arg6;
		this.anInt2711 = arg7;
		super.aByte31 = this.aClass60_Sub5_1.aClass33_2.aByte7;
		this.method2314();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(JI)V")
	public void method2312(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort45 = (short) (this.aShort45 - arg1);
		if (this.aShort45 <= 0) {
			this.method2310();
			return;
		}
		@Pc(17) int local17 = super.anInt2705 >> 12;
		@Pc(22) int local22 = super.anInt2701 >> 12;
		@Pc(27) int local27 = super.anInt2709 >> 12;
		@Pc(31) Class60_Sub4 local31 = this.aClass60_Sub5_1.aClass60_Sub4_5;
		@Pc(35) Class288 local35 = this.aClass60_Sub5_1.aClass288_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt8235 != 0) {
			if (this.aShort47 - this.aShort45 <= local35.anInt8249) {
				local65 = (super.anInt2703 >> 8 & 0xFF00) + (this.anInt2710 >> 16 & 0xFF) + local35.anInt8250 * arg1;
				local82 = (super.anInt2703 & 0xFF00) + (this.anInt2710 >> 8 & 0xFF) + local35.anInt8247 * arg1;
				local99 = ((super.anInt2703 & 0xFF) << 8) + (this.anInt2710 & 0xFF) + local35.anInt8270 * arg1;
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
				super.anInt2703 &= 0xFF000000;
				super.anInt2703 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2710 &= 0xFF000000;
				this.anInt2710 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort47 - this.aShort45 <= local35.anInt8252) {
				local65 = (super.anInt2703 >> 16 & 0xFF00) + (this.anInt2710 >> 24 & 0xFF) + local35.anInt8275 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2703 &= 0xFFFFFF;
				super.anInt2703 |= (local65 & 0xFF00) << 16;
				this.anInt2710 &= 0xFFFFFF;
				this.anInt2710 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt8238 != -1 && this.aShort47 - this.aShort45 <= local35.anInt8280) {
			this.anInt2711 += local35.anInt8254 * arg1;
		}
		if (local35.anInt8251 != -1 && this.aShort47 - this.aShort45 <= local35.anInt8237) {
			super.anInt2707 += local35.anInt8260 * arg1;
		}
		local65 = this.aShort44;
		local82 = this.aShort49;
		local99 = this.aShort46;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(342) int local342;
		@Pc(350) long local350;
		if (local35.anInt8271 == 1) {
			local313 = local17 - this.aClass60_Sub5_1.anInt5660;
			local319 = local22 - this.aClass60_Sub5_1.anInt5648;
			local325 = local27 - this.aClass60_Sub5_1.anInt5661;
			local342 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325)) >> 2;
			local350 = local35.anInt8269 * local342 * arg1;
			this.anInt2711 = (int) ((long) this.anInt2711 - ((long) this.anInt2711 * local350 >> 18));
		} else if (local35.anInt8271 == 2) {
			local313 = local17 - this.aClass60_Sub5_1.anInt5660;
			local319 = local22 - this.aClass60_Sub5_1.anInt5648;
			local325 = local27 - this.aClass60_Sub5_1.anInt5661;
			local342 = local313 * local313 + local319 * local319 + local325 * local325;
			local350 = local35.anInt8269 * local342 * arg1;
			this.anInt2711 = (int) ((long) this.anInt2711 - ((long) this.anInt2711 * local350 >> 28));
		}
		@Pc(446) int local446;
		@Pc(480) int local480;
		@Pc(493) long local493;
		@Pc(503) int local503;
		@Pc(539) int local539;
		if (local35.anIntArray575 != null) {
			@Pc(428) Class6 local428 = local31.aClass298_90.aClass6_246;
			for (@Pc(431) Class6 local431 = local428.aClass6_284; local431 != local428; local431 = local431.aClass6_284) {
				@Pc(435) Class6_Sub5_Sub9 local435 = (Class6_Sub5_Sub9) local431;
				@Pc(438) Class282 local438 = local435.aClass282_1;
				if (local438.anInt7984 != 1) {
					@Pc(444) boolean local444 = false;
					for (local446 = 0; local446 < local35.anIntArray575.length; local446++) {
						if (local35.anIntArray575[local446] == local438.anInt7987) {
							local444 = true;
							break;
						}
					}
					if (local444) {
						@Pc(470) int local470 = local17 - local435.anInt4947;
						@Pc(475) int local475 = local22 - local435.anInt4952;
						local480 = local27 - local435.anInt4951;
						local493 = local470 * local470 + local475 * local475 + local480 * local480;
						if (local493 <= local438.aLong197) {
							local503 = (int) Math.sqrt((double) local493);
							if (local503 == 0) {
								local503 = 1;
							}
							@Pc(531) long local531 = (long) (local470 * local435.anInt4949 + local475 * local438.anInt7982 + local480 * local435.anInt4948) * 65535L / (long) (local438.anInt7986 * local503);
							if (local531 >= (long) local438.anInt7981) {
								local539 = 0;
								if (local438.anInt7979 == 1) {
									local539 = (local503 >> 4) * local438.anInt7977;
								} else if (local438.anInt7979 == 2) {
									local539 = (local503 >> 4) * (local503 >> 4) * local438.anInt7977;
								}
								if (local438.anInt7978 != 0) {
									@Pc(645) int local645 = (local470 << 15) / local503 * local438.anInt7986;
									@Pc(654) int local654 = (local475 << 15) / local503 * local438.anInt7986;
									@Pc(663) int local663 = (local480 << 15) / local503 * local438.anInt7986;
									if (local438.anInt7975 == 0) {
										local65 += local645 * arg1 >> 15;
										local82 += local654 * arg1 >> 15;
										local99 += local663 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2705 += local645 * arg1 >> 15;
										super.anInt2701 += local654 * arg1 >> 15;
										super.anInt2709 += local663 * arg1 >> 15;
									}
								} else if (local438.anInt7975 == 0) {
									local65 += (local435.anInt4949 - local539) * arg1;
									local82 += (local438.anInt7982 - local539) * arg1;
									local99 += (local435.anInt4948 - local539) * arg1;
									local303 = true;
								} else {
									super.anInt2705 += (local435.anInt4949 - local539) * arg1;
									super.anInt2701 += (local438.anInt7982 - local539) * arg1;
									super.anInt2709 += (local435.anInt4948 - local539) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray573 != null) {
			for (local313 = 0; local313 < local35.anIntArray573.length; local313++) {
				@Pc(745) Class6_Sub5_Sub9 local745 = (Class6_Sub5_Sub9) Static431.aClass119_1.method2705((long) local35.anIntArray573[local313]);
				while (local745 != null) {
					@Pc(749) Class282 local749 = local745.aClass282_1;
					local342 = local17 - local745.anInt4947;
					@Pc(759) int local759 = local22 - local745.anInt4952;
					local446 = local27 - local745.anInt4951;
					@Pc(777) long local777 = (long) (local342 * local342 + local759 * local759 + local446 * local446);
					if (local777 > local749.aLong197) {
						local745 = (Class6_Sub5_Sub9) Static431.aClass119_1.method2708();
					} else {
						local480 = (int) Math.sqrt((double) local777);
						if (local480 == 0) {
							local480 = 1;
						}
						local493 = (long) (local342 * local745.anInt4949 + local759 * local749.anInt7982 + local446 * local745.anInt4948) * 65535L / (long) (local749.anInt7986 * local480);
						if (local493 < (long) local749.anInt7981) {
							local745 = (Class6_Sub5_Sub9) Static431.aClass119_1.method2708();
						} else {
							local503 = 0;
							if (local749.anInt7979 == 1) {
								local503 = (local480 >> 4) * local749.anInt7977;
							} else if (local749.anInt7979 == 2) {
								local503 = (local480 >> 4) * (local480 >> 4) * local749.anInt7977;
							}
							if (local749.anInt7978 != 0) {
								@Pc(941) int local941 = (local342 << 15) / local480 * local749.anInt7986;
								@Pc(950) int local950 = (local759 << 15) / local480 * local749.anInt7986;
								local539 = (local446 << 15) / local480 * local749.anInt7986;
								if (local749.anInt7975 == 0) {
									local65 += local941 * arg1 >> 15;
									local82 += local950 * arg1 >> 15;
									local99 += local539 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2705 += local941 * arg1 >> 15;
									super.anInt2701 += local950 * arg1 >> 15;
									super.anInt2709 += local539 * arg1 >> 15;
								}
							} else if (local749.anInt7975 == 0) {
								local65 += (local745.anInt4949 - local503) * arg1;
								local82 += (local749.anInt7982 - local503) * arg1;
								local99 += (local745.anInt4948 - local503) * arg1;
								local303 = true;
							} else {
								super.anInt2705 += (local745.anInt4949 - local503) * arg1;
								super.anInt2701 += (local749.anInt7982 - local503) * arg1;
								super.anInt2709 += (local745.anInt4948 - local503) * arg1;
							}
							local745 = (Class6_Sub5_Sub9) Static431.aClass119_1.method2708();
						}
					}
				}
			}
		}
		if (local35.anIntArray574 != null) {
			if (local35.anIntArray576 == null) {
				local35.anIntArray576 = new int[local35.anIntArray574.length];
				for (local313 = 0; local313 < local35.anIntArray574.length; local313++) {
					Static259.method3985(local35.anIntArray574[local313]);
					local35.anIntArray576[local313] = ((Class6_Sub14) Static557.aClass234_48.method5464((long) local35.anIntArray574[local313])).anInt2188;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray576.length; local313++) {
				@Pc(1084) Class282 local1084 = Static158.aClass282Array1[local35.anIntArray576[local313]];
				if (local1084.anInt7975 == 0) {
					local65 += local1084.anInt7985 * arg1;
					local82 += local1084.anInt7982 * arg1;
					local99 += local1084.anInt7976 * arg1;
					local303 = true;
				} else {
					super.anInt2705 += local1084.anInt7985 * arg1;
					super.anInt2701 += local1084.anInt7982 * arg1;
					super.anInt2709 += local1084.anInt7976 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort44 = (short) local65;
					this.aShort49 = (short) local82;
					this.aShort46 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2711 <<= 0x1;
			}
		}
		super.anInt2705 = (int) ((long) super.anInt2705 + ((long) this.aShort44 * (long) (this.anInt2711 << 2) >> 23) * (long) arg1);
		super.anInt2701 = (int) ((long) super.anInt2701 + ((long) this.aShort49 * (long) (this.anInt2711 << 2) >> 23) * (long) arg1);
		super.anInt2709 = (int) ((long) super.anInt2709 + ((long) this.aShort46 * (long) (this.anInt2711 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!oa;J)V")
	public void method2313(@OriginalArg(0) Class90 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2705 >> Static23.anInt420 + 12;
		@Pc(13) int local13 = super.anInt2709 >> Static23.anInt420 + 12;
		@Pc(18) int local18 = super.anInt2701 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static547.anInt9363 || local13 < 0 || local13 >= Static20.anInt358) {
			this.method2310();
			return;
		}
		@Pc(40) Class60_Sub4 local40 = this.aClass60_Sub5_1.aClass60_Sub4_5;
		@Pc(44) Class288 local44 = this.aClass60_Sub5_1.aClass288_1;
		@Pc(46) Class46[] local46 = Static205.aClass46Array1;
		@Pc(49) int local49 = local40.anInt4190;
		@Pc(58) Class133 local58 = Static113.aClass133ArrayArrayArray1[local40.anInt4190][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte49;
		}
		@Pc(70) int local70 = local46[local49].JA(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static431.anInt7712 - 1) {
			local84 = local46[local49 + 1].JA(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static23.anInt420);
		}
		if (local44.aBoolean536) {
			if (local44.anInt8284 == -1 && local18 > local70) {
				this.method2310();
				return;
			}
			if (local44.anInt8284 >= 0 && local18 > local46[local44.anInt8284].JA(local6, local13)) {
				this.method2310();
				return;
			}
			if (local44.anInt8253 == -1 && local18 < local84) {
				this.method2310();
				return;
			}
			if (local44.anInt8253 >= 0 && local18 < local46[local44.anInt8253 + 1].JA(local6, local13)) {
				this.method2310();
				return;
			}
		}
		if (local6 >= local40.anInt4192 && local6 <= local40.anInt4189 && local13 >= local40.anInt4193 && local13 <= local40.anInt4191 && local18 <= local70 && local18 >= local84) {
			local40.aClass127_2.aClass145_1.method3530(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static431.anInt7712 - 1; local172 > 0 && local18 > local46[local172].JA(local6, local13); local172--) {
		}
		if (local44.aBoolean533 && local172 == 0 && local18 > local46[0].JA(local6, local13)) {
			this.method2310();
		} else if (local172 == Static431.anInt7712 - 1 && local46[local172].JA(local6, local13) - local18 > 0x8 << Static23.anInt420) {
			this.method2310();
		} else {
			local58 = Static113.aClass133ArrayArrayArray1[local172][local6][local13];
			@Pc(278) int local278;
			if (local58 == null) {
				if (local172 == 0 || Static113.aClass133ArrayArrayArray1[0][local6][local13] == null) {
					local58 = Static113.aClass133ArrayArrayArray1[0][local6][local13] = new Class133(0, local6, local13);
				}
				@Pc(268) boolean local268 = Static113.aClass133ArrayArrayArray1[0][local6][local13].aClass133_1 != null;
				if (local172 == 3 && local268) {
					this.method2310();
					return;
				}
				for (local278 = 1; local278 <= local172; local278++) {
					if (Static113.aClass133ArrayArrayArray1[local278][local6][local13] == null) {
						local58 = Static113.aClass133ArrayArrayArray1[local278][local6][local13] = new Class133(local278, local6, local13);
						if (local268) {
							local58.aByte49++;
						}
					}
				}
			}
			if (local44.aBoolean532) {
				@Pc(323) int local323 = super.anInt2705 >> 12;
				local278 = super.anInt2709 >> 12;
				@Pc(337) Class4 local337;
				if (local58.aClass15_Sub1_2 != null) {
					local337 = local58.aClass15_Sub1_2.method7156(arg0);
					if (local337 != null && local337.method76(local18, local278, local323)) {
						this.method2310();
						return;
					}
				}
				if (local58.aClass15_Sub1_1 != null) {
					local337 = local58.aClass15_Sub1_1.method7156(arg0);
					if (local337 != null && local337.method76(local18, local278, local323)) {
						this.method2310();
						return;
					}
				}
				if (local58.aClass15_Sub3_2 != null) {
					local337 = local58.aClass15_Sub3_2.method7156(arg0);
					if (local337 != null && local337.method76(local18, local278, local323)) {
						this.method2310();
						return;
					}
				}
				for (@Pc(394) Class315 local394 = local58.aClass315_1; local394 != null; local394 = local394.aClass315_3) {
					@Pc(401) Class4 local401 = local394.aClass15_Sub2_2.method7156(arg0);
					if (local401 != null && local401.method76(local18, local278, local323)) {
						this.method2310();
						return;
					}
				}
			}
			if (local58.aClass127_1 == null) {
				local58.aClass127_1 = new Class127();
				local58.aByte44 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte44 != (byte) (arg1 & 0xFFL)) {
				local58.aClass127_1.aClass145_1.method3531();
				local58.aClass127_1.aBoolean299 = false;
				local58.aByte44 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass127_1.aClass145_1.method3530(this);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
	private void method2314() {
		@Pc(4) int local4 = this.aClass60_Sub5_1.aClass60_Sub4_5.anInt4187;
		if (this.aClass60_Sub5_1.aClass60_Sub4_5.aClass60_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass60_Sub5_1.aClass60_Sub4_5.aClass60_Sub1_Sub1_Sub1Array1[local4].method2310();
		}
		this.aClass60_Sub5_1.aClass60_Sub4_5.aClass60_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort48 = (short) this.aClass60_Sub5_1.aClass60_Sub4_5.anInt4187;
		this.aClass60_Sub5_1.aClass60_Sub4_5.anInt4187 = local4 + 1 & 0x1FFF;
		this.aClass60_Sub5_1.aClass349_9.method7893(this);
	}
}
