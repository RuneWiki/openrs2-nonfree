import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class72_Sub1_Sub1_Sub1 extends Class72_Sub1_Sub1 {

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	private int anInt2192;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Lclient!nh;")
	private Class72_Sub5 aClass72_Sub5_1;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
	private int anInt2193;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!nh;IIIIIIIIIIIZZ)V")
	public Class72_Sub1_Sub1_Sub1(@OriginalArg(0) Class72_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass72_Sub5_1 = arg0;
		super.anInt2189 = arg1 << 12;
		super.anInt2190 = arg2 << 12;
		super.anInt2187 = arg3 << 12;
		super.anInt2182 = arg9;
		this.aShort31 = this.aShort36 = (short) arg8;
		super.anInt2184 = arg10;
		super.anInt2188 = arg11;
		super.aBoolean136 = arg13;
		this.aShort35 = (short) arg4;
		this.aShort34 = (short) arg5;
		this.aShort33 = (short) arg6;
		this.anInt2193 = arg7;
		super.aByte37 = this.aClass72_Sub5_1.aClass161_2.aByte63;
		this.method1856();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!qa;J)V")
	public void method1855(@OriginalArg(0) Class122 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt2189 >> Static451.anInt7905 + 12;
		@Pc(13) int local13 = super.anInt2187 >> Static451.anInt7905 + 12;
		@Pc(18) int local18 = super.anInt2190 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static93.anInt1898 || local13 < 0 || local13 >= Static382.anInt6965) {
			this.method1857();
			return;
		}
		@Pc(40) Class72_Sub4 local40 = this.aClass72_Sub5_1.aClass72_Sub4_6;
		@Pc(44) Class69 local44 = this.aClass72_Sub5_1.aClass69_1;
		@Pc(46) Class205[] local46 = Static544.aClass205Array3;
		@Pc(49) int local49 = local40.anInt5240;
		@Pc(58) Class255 local58 = Static242.aClass255ArrayArrayArray2[local40.anInt5240][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte101;
		}
		@Pc(70) int local70 = local46[local49].ba(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static388.anInt7032 - 1) {
			local84 = local46[local49 + 1].ba(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static451.anInt7905);
		}
		if (local44.aBoolean118) {
			if (local44.anInt1933 == -1 && local18 > local70) {
				this.method1857();
				return;
			}
			if (local44.anInt1933 >= 0 && local18 > local46[local44.anInt1933].ba(local6, local13)) {
				this.method1857();
				return;
			}
			if (local44.anInt1940 == -1 && local18 < local84) {
				this.method1857();
				return;
			}
			if (local44.anInt1940 >= 0 && local18 < local46[local44.anInt1940 + 1].ba(local6, local13)) {
				this.method1857();
				return;
			}
		}
		if (local6 >= local40.anInt5238 && local6 <= local40.anInt5237 && local13 >= local40.anInt5235 && local13 <= local40.anInt5239 && local18 <= local70 && local18 >= local84) {
			local40.aClass175_1.aClass193_1.method4758(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static388.anInt7032 - 1; local172 > 0 && local18 > local46[local172].ba(local6, local13); local172--) {
		}
		if (local172 == 0 && local18 > local46[0].ba(local6, local13)) {
			this.method1857();
		} else if (local172 == Static388.anInt7032 - 1 && local46[local172].ba(local6, local13) - local18 > 0x8 << Static451.anInt7905) {
			this.method1857();
		} else {
			local58 = Static242.aClass255ArrayArrayArray2[local172][local6][local13];
			@Pc(275) int local275;
			if (local58 == null) {
				if (local172 == 0 || Static242.aClass255ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static242.aClass255ArrayArrayArray2[0][local6][local13] = new Class255(0, local6, local13);
				}
				@Pc(265) boolean local265 = Static242.aClass255ArrayArrayArray2[0][local6][local13].aClass255_1 != null;
				if (local172 == 3 && local265) {
					this.method1857();
					return;
				}
				for (local275 = 1; local275 <= local172; local275++) {
					if (Static242.aClass255ArrayArrayArray2[local275][local6][local13] == null) {
						local58 = Static242.aClass255ArrayArrayArray2[local275][local6][local13] = new Class255(local275, local6, local13);
						if (local265) {
							local58.aByte101++;
						}
					}
				}
			}
			if (local44.aBoolean122) {
				@Pc(320) int local320 = super.anInt2189 >> 12;
				local275 = super.anInt2187 >> 12;
				@Pc(334) Class291 local334;
				if (local58.aClass49_Sub1_3 != null) {
					local334 = local58.aClass49_Sub1_3.method7460(arg0);
					if (local334 != null && local334.method6638(local18, local320, local275)) {
						this.method1857();
						return;
					}
				}
				if (local58.aClass49_Sub1_2 != null) {
					local334 = local58.aClass49_Sub1_2.method7460(arg0);
					if (local334 != null && local334.method6638(local18, local320, local275)) {
						this.method1857();
						return;
					}
				}
				if (local58.aClass49_Sub5_2 != null) {
					local334 = local58.aClass49_Sub5_2.method7460(arg0);
					if (local334 != null && local334.method6638(local18, local320, local275)) {
						this.method1857();
						return;
					}
				}
				for (@Pc(391) Class63 local391 = local58.aClass63_3; local391 != null; local391 = local391.aClass63_1) {
					@Pc(398) Class291 local398 = local391.aClass49_Sub2_1.method7460(arg0);
					if (local398 != null && local398.method6638(local18, local320, local275)) {
						this.method1857();
						return;
					}
				}
			}
			if (local58.aClass175_2 == null) {
				local58.aClass175_2 = new Class175();
				local58.aByte106 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte106 != (byte) (arg1 & 0xFFL)) {
				local58.aClass175_2.aClass193_1.method4760();
				local58.aClass175_2.aBoolean357 = false;
				local58.aByte106 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass175_2.aClass193_1.method4758(this);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
	private void method1856() {
		@Pc(4) int local4 = this.aClass72_Sub5_1.aClass72_Sub4_6.anInt5233;
		if (this.aClass72_Sub5_1.aClass72_Sub4_6.aClass72_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass72_Sub5_1.aClass72_Sub4_6.aClass72_Sub1_Sub1_Sub1Array1[local4].method1857();
		}
		this.aClass72_Sub5_1.aClass72_Sub4_6.aClass72_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort32 = (short) this.aClass72_Sub5_1.aClass72_Sub4_6.anInt5233;
		this.aClass72_Sub5_1.aClass72_Sub4_6.anInt5233 = local4 + 1 & 0x1FFF;
		this.aClass72_Sub5_1.aClass299_7.method7027(this);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
	public void method1857() {
		this.aClass72_Sub5_1.aClass72_Sub4_6.aClass72_Sub1_Sub1_Sub1Array1[this.aShort32] = null;
		Static413.aClass72_Sub1_Sub1_Sub1Array2[Static175.anInt3116] = this;
		Static175.anInt3116 = Static175.anInt3116 + 1 & 0x3FF;
		this.method6719();
		this.method6723();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(JI)V")
	public void method1858(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort36 = (short) (this.aShort36 - arg1);
		if (this.aShort36 <= 0) {
			this.method1857();
			return;
		}
		@Pc(17) int local17 = super.anInt2189 >> 12;
		@Pc(22) int local22 = super.anInt2190 >> 12;
		@Pc(27) int local27 = super.anInt2187 >> 12;
		@Pc(31) Class72_Sub4 local31 = this.aClass72_Sub5_1.aClass72_Sub4_6;
		@Pc(35) Class69 local35 = this.aClass72_Sub5_1.aClass69_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt1907 != 0) {
			if (this.aShort31 - this.aShort36 <= local35.anInt1935) {
				local65 = (super.anInt2182 >> 8 & 0xFF00) + (this.anInt2192 >> 16 & 0xFF) + local35.anInt1917 * arg1;
				local82 = (super.anInt2182 & 0xFF00) + (this.anInt2192 >> 8 & 0xFF) + local35.anInt1934 * arg1;
				local99 = ((super.anInt2182 & 0xFF) << 8) + (this.anInt2192 & 0xFF) + local35.anInt1932 * arg1;
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
				super.anInt2182 &= 0xFF000000;
				super.anInt2182 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2192 &= 0xFF000000;
				this.anInt2192 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort31 - this.aShort36 <= local35.anInt1942) {
				local65 = (super.anInt2182 >> 16 & 0xFF00) + (this.anInt2192 >> 24 & 0xFF) + local35.anInt1928 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2182 &= 0xFFFFFF;
				super.anInt2182 |= (local65 & 0xFF00) << 16;
				this.anInt2192 &= 0xFFFFFF;
				this.anInt2192 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1946 != -1 && this.aShort31 - this.aShort36 <= local35.anInt1902) {
			this.anInt2193 += local35.anInt1941 * arg1;
		}
		if (local35.anInt1922 != -1 && this.aShort31 - this.aShort36 <= local35.anInt1948) {
			super.anInt2184 += local35.anInt1912 * arg1;
		}
		local65 = this.aShort35;
		local82 = this.aShort34;
		local99 = this.aShort33;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(342) int local342;
		@Pc(350) long local350;
		if (local35.anInt1937 == 1) {
			local313 = local17 - this.aClass72_Sub5_1.anInt5877;
			local319 = local22 - this.aClass72_Sub5_1.anInt5865;
			local325 = local27 - this.aClass72_Sub5_1.anInt5883;
			local342 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325)) >> 2;
			local350 = local35.anInt1914 * local342 * arg1;
			this.anInt2193 = (int) ((long) this.anInt2193 - ((long) this.anInt2193 * local350 >> 18));
		} else if (local35.anInt1937 == 2) {
			local313 = local17 - this.aClass72_Sub5_1.anInt5877;
			local319 = local22 - this.aClass72_Sub5_1.anInt5865;
			local325 = local27 - this.aClass72_Sub5_1.anInt5883;
			local342 = local313 * local313 + local319 * local319 + local325 * local325;
			local350 = local35.anInt1914 * local342 * arg1;
			this.anInt2193 = (int) ((long) this.anInt2193 - ((long) this.anInt2193 * local350 >> 28));
		}
		@Pc(446) int local446;
		@Pc(480) int local480;
		@Pc(493) long local493;
		@Pc(503) int local503;
		@Pc(539) int local539;
		if (local35.anIntArray193 != null) {
			@Pc(428) Class1 local428 = local31.aClass37_54.aClass1_47;
			for (@Pc(431) Class1 local431 = local428.aClass1_284; local431 != local428; local431 = local431.aClass1_284) {
				@Pc(435) Class1_Sub1_Sub17 local435 = (Class1_Sub1_Sub17) local431;
				@Pc(438) Class19 local438 = local435.aClass19_1;
				if (local438.anInt733 != 1) {
					@Pc(444) boolean local444 = false;
					for (local446 = 0; local446 < local35.anIntArray193.length; local446++) {
						if (local35.anIntArray193[local446] == local438.anInt732) {
							local444 = true;
							break;
						}
					}
					if (local444) {
						@Pc(470) int local470 = local17 - local435.anInt7297;
						@Pc(475) int local475 = local22 - local435.anInt7298;
						local480 = local27 - local435.anInt7296;
						local493 = local470 * local470 + local475 * local475 + local480 * local480;
						if (local493 <= local438.aLong49) {
							local503 = (int) Math.sqrt((double) local493);
							if (local503 == 0) {
								local503 = 1;
							}
							@Pc(531) long local531 = (long) (local470 * local435.anInt7295 + local475 * local438.anInt729 + local480 * local435.anInt7300) * 65535L / (long) (local438.anInt727 * local503);
							if (local531 >= (long) local438.anInt722) {
								local539 = 0;
								if (local438.anInt730 == 1) {
									local539 = (local503 >> 4) * local438.anInt721;
								} else if (local438.anInt730 == 2) {
									local539 = (local503 >> 4) * (local503 >> 4) * local438.anInt721;
								}
								if (local438.anInt724 != 0) {
									@Pc(645) int local645 = (local470 << 15) / local503 * local438.anInt727;
									@Pc(654) int local654 = (local475 << 15) / local503 * local438.anInt727;
									@Pc(663) int local663 = (local480 << 15) / local503 * local438.anInt727;
									if (local438.anInt734 == 0) {
										local65 += local645 * arg1 >> 15;
										local82 += local654 * arg1 >> 15;
										local99 += local663 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2189 += local645 * arg1 >> 15;
										super.anInt2190 += local654 * arg1 >> 15;
										super.anInt2187 += local663 * arg1 >> 15;
									}
								} else if (local438.anInt734 == 0) {
									local65 += (local435.anInt7295 - local539) * arg1;
									local82 += (local438.anInt729 - local539) * arg1;
									local99 += (local435.anInt7300 - local539) * arg1;
									local303 = true;
								} else {
									super.anInt2189 += (local435.anInt7295 - local539) * arg1;
									super.anInt2190 += (local438.anInt729 - local539) * arg1;
									super.anInt2187 += (local435.anInt7300 - local539) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray192 != null) {
			for (local313 = 0; local313 < local35.anIntArray192.length; local313++) {
				@Pc(745) Class1_Sub1_Sub17 local745 = (Class1_Sub1_Sub17) Static396.aClass87_1.method2021((long) local35.anIntArray192[local313]);
				while (local745 != null) {
					@Pc(749) Class19 local749 = local745.aClass19_1;
					local342 = local17 - local745.anInt7297;
					@Pc(759) int local759 = local22 - local745.anInt7298;
					local446 = local27 - local745.anInt7296;
					@Pc(777) long local777 = (long) (local342 * local342 + local759 * local759 + local446 * local446);
					if (local777 > local749.aLong49) {
						local745 = (Class1_Sub1_Sub17) Static396.aClass87_1.method2018();
					} else {
						local480 = (int) Math.sqrt((double) local777);
						if (local480 == 0) {
							local480 = 1;
						}
						local493 = (long) (local342 * local745.anInt7295 + local759 * local749.anInt729 + local446 * local745.anInt7300) * 65535L / (long) (local749.anInt727 * local480);
						if (local493 < (long) local749.anInt722) {
							local745 = (Class1_Sub1_Sub17) Static396.aClass87_1.method2018();
						} else {
							local503 = 0;
							if (local749.anInt730 == 1) {
								local503 = (local480 >> 4) * local749.anInt721;
							} else if (local749.anInt730 == 2) {
								local503 = (local480 >> 4) * (local480 >> 4) * local749.anInt721;
							}
							if (local749.anInt724 != 0) {
								@Pc(941) int local941 = (local342 << 15) / local480 * local749.anInt727;
								@Pc(950) int local950 = (local759 << 15) / local480 * local749.anInt727;
								local539 = (local446 << 15) / local480 * local749.anInt727;
								if (local749.anInt734 == 0) {
									local65 += local941 * arg1 >> 15;
									local82 += local950 * arg1 >> 15;
									local99 += local539 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2189 += local941 * arg1 >> 15;
									super.anInt2190 += local950 * arg1 >> 15;
									super.anInt2187 += local539 * arg1 >> 15;
								}
							} else if (local749.anInt734 == 0) {
								local65 += (local745.anInt7295 - local503) * arg1;
								local82 += (local749.anInt729 - local503) * arg1;
								local99 += (local745.anInt7300 - local503) * arg1;
								local303 = true;
							} else {
								super.anInt2189 += (local745.anInt7295 - local503) * arg1;
								super.anInt2190 += (local749.anInt729 - local503) * arg1;
								super.anInt2187 += (local745.anInt7300 - local503) * arg1;
							}
							local745 = (Class1_Sub1_Sub17) Static396.aClass87_1.method2018();
						}
					}
				}
			}
		}
		if (local35.anIntArray191 != null) {
			if (local35.anIntArray194 == null) {
				local35.anIntArray194 = new int[local35.anIntArray191.length];
				for (local313 = 0; local313 < local35.anIntArray191.length; local313++) {
					Static171.method2593(local35.anIntArray191[local313]);
					local35.anIntArray194[local313] = ((Class1_Sub9) Static134.aClass17_11.method738((long) local35.anIntArray191[local313])).anInt1173;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray194.length; local313++) {
				@Pc(1084) Class19 local1084 = Static96.aClass19Array1[local35.anIntArray194[local313]];
				if (local1084.anInt734 == 0) {
					local65 += local1084.anInt735 * arg1;
					local82 += local1084.anInt729 * arg1;
					local99 += local1084.anInt723 * arg1;
					local303 = true;
				} else {
					super.anInt2189 += local1084.anInt735 * arg1;
					super.anInt2190 += local1084.anInt729 * arg1;
					super.anInt2187 += local1084.anInt723 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort35 = (short) local65;
					this.aShort34 = (short) local82;
					this.aShort33 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2193 <<= 0x1;
			}
		}
		super.anInt2189 = (int) ((long) super.anInt2189 + ((long) this.aShort35 * (long) (this.anInt2193 << 2) >> 23) * (long) arg1);
		super.anInt2190 = (int) ((long) super.anInt2190 + ((long) this.aShort34 * (long) (this.anInt2193 << 2) >> 23) * (long) arg1);
		super.anInt2187 = (int) ((long) super.anInt2187 + ((long) this.aShort33 * (long) (this.anInt2193 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!nh;IIIIIIIIIIIZZ)V")
	public void method1859(@OriginalArg(0) Class72_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass72_Sub5_1 = arg0;
		super.anInt2189 = arg1 << 12;
		super.anInt2190 = arg2 << 12;
		super.anInt2187 = arg3 << 12;
		super.anInt2182 = arg9;
		this.aShort31 = this.aShort36 = (short) arg8;
		super.anInt2184 = arg10;
		super.anInt2188 = arg11;
		super.aBoolean136 = arg13;
		this.aShort35 = (short) arg4;
		this.aShort34 = (short) arg5;
		this.aShort33 = (short) arg6;
		this.anInt2193 = arg7;
		super.aByte37 = this.aClass72_Sub5_1.aClass161_2.aByte63;
		this.method1856();
	}
}
