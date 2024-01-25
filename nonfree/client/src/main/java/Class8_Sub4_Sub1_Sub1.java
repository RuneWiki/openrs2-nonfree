import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class8_Sub4_Sub1_Sub1 extends Class8_Sub4_Sub1 {

	@OriginalMember(owner = "client!hm", name = "H", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
	private int anInt2566;

	@OriginalMember(owner = "client!hm", name = "K", descriptor = "Lclient!ah;")
	private Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!hm", name = "J", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!hm", name = "N", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
	private int anInt2565;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!ah;IIIIIIIIIIIZ)V")
	public Class8_Sub4_Sub1_Sub1(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass8_Sub1_1 = arg0;
		super.anInt2564 = arg1 << Static180.anInt3862;
		super.anInt2558 = arg2 << Static180.anInt3862;
		super.anInt2562 = arg3 << Static180.anInt3862;
		super.anInt2563 = arg9;
		this.aShort31 = this.aShort29 = (short) arg8;
		super.anInt2559 = arg10;
		super.anInt2557 = arg11;
		this.aShort30 = (short) arg4;
		this.aShort27 = (short) arg5;
		this.aShort26 = (short) arg6;
		this.anInt2565 = arg7;
		super.aByte22 = this.aClass8_Sub1_1.aClass112_1.aByte26;
		this.method2088();
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(JI)V")
	public void method2086(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort29 = (short) (this.aShort29 - arg1);
		if (this.aShort29 <= 0) {
			this.method2090();
			return;
		}
		@Pc(17) int local17 = super.anInt2564 >> Static180.anInt3862;
		@Pc(22) int local22 = super.anInt2558 >> Static180.anInt3862;
		@Pc(27) int local27 = super.anInt2562 >> Static180.anInt3862;
		@Pc(31) Class8_Sub5 local31 = this.aClass8_Sub1_1.aClass8_Sub5_1;
		@Pc(35) Class145 local35 = this.aClass8_Sub1_1.aClass145_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt4366 != 0) {
			if (this.aShort31 - this.aShort29 <= local35.anInt4391) {
				local65 = (super.anInt2563 >> 8 & 0xFF00) + (this.anInt2566 >> 16 & 0xFF) + local35.anInt4362 * arg1;
				local82 = (super.anInt2563 & 0xFF00) + (this.anInt2566 >> 8 & 0xFF) + local35.anInt4354 * arg1;
				local99 = ((super.anInt2563 & 0xFF) << 8) + (this.anInt2566 & 0xFF) + local35.anInt4395 * arg1;
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
				super.anInt2563 &= 0xFF000000;
				super.anInt2563 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2566 &= 0xFF000000;
				this.anInt2566 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort31 - this.aShort29 <= local35.anInt4370) {
				local65 = (super.anInt2563 >> 16 & 0xFF00) + (this.anInt2566 >> 24 & 0xFF) + local35.anInt4386 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2563 &= 0xFFFFFF;
				super.anInt2563 |= (local65 & 0xFF00) << 16;
				this.anInt2566 &= 0xFFFFFF;
				this.anInt2566 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4368 != -1 && this.aShort31 - this.aShort29 <= local35.anInt4377) {
			this.anInt2565 += local35.anInt4376 * arg1;
		}
		if (local35.anInt4350 != -1 && this.aShort31 - this.aShort29 <= local35.anInt4380) {
			super.anInt2559 += local35.anInt4392 * arg1;
		}
		local65 = this.aShort30;
		local82 = this.aShort27;
		local99 = this.aShort26;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt4387 == 1) {
			local313 = local17 - this.aClass8_Sub1_1.anInt233;
			local319 = local22 - this.aClass8_Sub1_1.anInt244;
			local325 = local27 - this.aClass8_Sub1_1.anInt221;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt4394 * local340 * arg1;
			this.anInt2565 = (int) ((long) this.anInt2565 - ((long) this.anInt2565 * local348 >> 18));
		} else if (local35.anInt4387 == 2) {
			local313 = local17 - this.aClass8_Sub1_1.anInt233;
			local319 = local22 - this.aClass8_Sub1_1.anInt244;
			local325 = local27 - this.aClass8_Sub1_1.anInt221;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt4394 * local340 * arg1;
			this.anInt2565 = (int) ((long) this.anInt2565 - ((long) this.anInt2565 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray353 != null) {
			@Pc(426) Class3 local426 = local31.aClass127_21.aClass3_156;
			for (@Pc(429) Class3 local429 = local426.aClass3_248; local429 != local426; local429 = local429.aClass3_248) {
				@Pc(433) Class3_Sub7_Sub5 local433 = (Class3_Sub7_Sub5) local429;
				@Pc(436) Class196 local436 = local433.aClass196_1;
				if (local436.anInt6167 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray353.length; local444++) {
						if (local35.anIntArray353[local444] == local436.anInt6162) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1389;
						@Pc(473) int local473 = local22 - local433.anInt1392;
						local478 = local27 - local433.anInt1395;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong191) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1390 + local473 * local436.anInt6158 + local478 * local433.anInt1394) * 65535L / (long) (local436.anInt6168 * local501);
							if (local529 >= (long) local436.anInt6157) {
								local537 = 0;
								if (local436.anInt6159 == 1) {
									local537 = (local501 >> 4) * local436.anInt6150;
								} else if (local436.anInt6159 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6150;
								}
								if (local436.anInt6169 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6168;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6168;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6168;
									if (local436.anInt6151 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2564 += local643 * arg1 >> 15;
										super.anInt2558 += local652 * arg1 >> 15;
										super.anInt2562 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6151 == 0) {
									local65 += (local433.anInt1390 - local537) * arg1;
									local82 += (local436.anInt6158 - local537) * arg1;
									local99 += (local433.anInt1394 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2564 += (local433.anInt1390 - local537) * arg1;
									super.anInt2558 += (local436.anInt6158 - local537) * arg1;
									super.anInt2562 += (local433.anInt1394 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray354 != null) {
			for (local313 = 0; local313 < local35.anIntArray354.length; local313++) {
				@Pc(743) Class3_Sub7_Sub5 local743 = (Class3_Sub7_Sub5) Static177.aClass162_1.method4151((long) local35.anIntArray354[local313]);
				while (local743 != null) {
					@Pc(747) Class196 local747 = local743.aClass196_1;
					local340 = local17 - local743.anInt1389;
					@Pc(757) int local757 = local22 - local743.anInt1392;
					local444 = local27 - local743.anInt1395;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong191) {
						local743 = (Class3_Sub7_Sub5) Static177.aClass162_1.method4156();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1390 + local757 * local747.anInt6158 + local444 * local743.anInt1394) * 65535L / (long) (local747.anInt6168 * local478);
						if (local491 < (long) local747.anInt6157) {
							local743 = (Class3_Sub7_Sub5) Static177.aClass162_1.method4156();
						} else {
							local501 = 0;
							if (local747.anInt6159 == 1) {
								local501 = (local478 >> 4) * local747.anInt6150;
							} else if (local747.anInt6159 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6150;
							}
							if (local747.anInt6169 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6168;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6168;
								local537 = (local444 << 15) / local478 * local747.anInt6168;
								if (local747.anInt6151 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2564 += local939 * arg1 >> 15;
									super.anInt2558 += local948 * arg1 >> 15;
									super.anInt2562 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6151 == 0) {
								local65 += (local743.anInt1390 - local501) * arg1;
								local82 += (local747.anInt6158 - local501) * arg1;
								local99 += (local743.anInt1394 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2564 += (local743.anInt1390 - local501) * arg1;
								super.anInt2558 += (local747.anInt6158 - local501) * arg1;
								super.anInt2562 += (local743.anInt1394 - local501) * arg1;
							}
							local743 = (Class3_Sub7_Sub5) Static177.aClass162_1.method4156();
						}
					}
				}
			}
		}
		if (local35.anIntArray355 != null) {
			if (local35.anIntArray352 == null) {
				local35.anIntArray352 = new int[local35.anIntArray355.length];
				for (local313 = 0; local313 < local35.anIntArray355.length; local313++) {
					Static152.method2446(local35.anIntArray355[local313]);
					local35.anIntArray352[local313] = ((Class3_Sub22) Static331.aClass24_32.method609((long) local35.anIntArray355[local313])).anInt2181;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray352.length; local313++) {
				@Pc(1082) Class196 local1082 = Static317.aClass196Array3[local35.anIntArray352[local313]];
				if (local1082.anInt6151 == 0) {
					local65 += local1082.anInt6160 * arg1;
					local82 += local1082.anInt6158 * arg1;
					local99 += local1082.anInt6155 * arg1;
					local303 = true;
				} else {
					super.anInt2564 += local1082.anInt6160 * arg1;
					super.anInt2558 += local1082.anInt6158 * arg1;
					super.anInt2562 += local1082.anInt6155 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort30 = (short) local65;
					this.aShort27 = (short) local82;
					this.aShort26 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2565 <<= 0x1;
			}
		}
		super.anInt2564 = (int) ((long) super.anInt2564 + ((long) this.aShort30 * (long) this.anInt2565 >> 23) * (long) arg1);
		super.anInt2558 = (int) ((long) super.anInt2558 + ((long) this.aShort27 * (long) this.anInt2565 >> 23) * (long) arg1);
		super.anInt2562 = (int) ((long) super.anInt2562 + ((long) this.aShort26 * (long) this.anInt2565 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(J)V")
	public void method2087(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt2564 >> 19;
		@Pc(9) int local9 = super.anInt2562 >> 19;
		@Pc(14) int local14 = super.anInt2558 >> Static180.anInt3862;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static103.anInt2156 || local9 < 0 || local9 >= Static116.anInt2499) {
			this.method2090();
			return;
		}
		@Pc(36) Class8_Sub5 local36 = this.aClass8_Sub1_1.aClass8_Sub5_1;
		@Pc(40) Class145 local40 = this.aClass8_Sub1_1.aClass145_1;
		@Pc(42) Class22[] local42 = Static69.aClass22Array1;
		@Pc(50) int local50 = local42[local36.anInt4195].method4672(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt4195 < 3) {
			local64 = local42[local36.anInt4195 + 1].method4672(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean248) {
			if (local40.anInt4367 == -1 && local14 > local50) {
				this.method2090();
				return;
			}
			if (local40.anInt4367 >= 0 && local14 > local42[local40.anInt4367].method4672(local4, local9)) {
				this.method2090();
				return;
			}
			if (local40.anInt4399 == -1 && local14 < local64) {
				this.method2090();
				return;
			}
			if (local40.anInt4399 >= 0 && local14 < local42[local40.anInt4399 + 1].method4672(local4, local9)) {
				this.method2090();
				return;
			}
		}
		if (local4 >= local36.anInt4194 && local4 <= local36.anInt4196 && local9 >= local36.anInt4197 && local9 <= local36.anInt4196 && local14 <= local50 && local14 >= local64) {
			local36.aClass9_2.aClass76_1.method1880(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method4672(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method4672(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method4672(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method4672(local4, local9) - 1024) {
			this.method2090();
			return;
		}
		@Pc(202) Class45 local202 = Static256.aClass45ArrayArrayArray2[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static256.aClass45ArrayArrayArray2[0][local4][local9].aClass45_1 != null;
			if (local148 == 3 && local217) {
				this.method2090();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static256.aClass45ArrayArrayArray2[local227][local4][local9] == null) {
					local202 = Static256.aClass45ArrayArrayArray2[local227][local4][local9] = new Class45(local227, local4, local9);
					if (local217) {
						local202.aByte7++;
					}
				}
			}
		}
		if (local202.aClass9_1 == null) {
			local202.aClass9_1 = new Class9();
			local202.aByte11 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte11 != (byte) (arg0 & 0xFFL)) {
			local202.aClass9_1 = new Class9();
			local202.aByte11 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass9_1.aClass76_1.method1880(this);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
	private void method2088() {
		@Pc(4) int local4 = this.aClass8_Sub1_1.aClass8_Sub5_1.anInt4192;
		if (this.aClass8_Sub1_1.aClass8_Sub5_1.aClass8_Sub4_Sub1_Sub1Array1[local4] != null) {
			this.aClass8_Sub1_1.aClass8_Sub5_1.aClass8_Sub4_Sub1_Sub1Array1[local4].method2090();
		}
		this.aClass8_Sub1_1.aClass8_Sub5_1.aClass8_Sub4_Sub1_Sub1Array1[local4] = this;
		this.aShort28 = (short) this.aClass8_Sub1_1.aClass8_Sub5_1.anInt4192;
		this.aClass8_Sub1_1.aClass8_Sub5_1.anInt4192 = local4 + 1 & 0x1FFF;
		this.aClass8_Sub1_1.aClass65_1.method1458(this);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ah;IIIIIIIIIIIZ)V")
	public void method2089(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass8_Sub1_1 = arg0;
		super.anInt2564 = arg1 << Static180.anInt3862;
		super.anInt2558 = arg2 << Static180.anInt3862;
		super.anInt2562 = arg3 << Static180.anInt3862;
		super.anInt2563 = arg9;
		this.aShort31 = this.aShort29 = (short) arg8;
		super.anInt2559 = arg10;
		super.anInt2557 = arg11;
		this.aShort30 = (short) arg4;
		this.aShort27 = (short) arg5;
		this.aShort26 = (short) arg6;
		this.anInt2565 = arg7;
		super.aByte22 = this.aClass8_Sub1_1.aClass112_1.aByte26;
		this.method2088();
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
	private void method2090() {
		this.aClass8_Sub1_1.aClass8_Sub5_1.aClass8_Sub4_Sub1_Sub1Array1[this.aShort28] = null;
		Static333.aClass8_Sub4_Sub1_Sub1Array2[Static197.anInt4053] = this;
		Static197.anInt4053 = Static197.anInt4053 + 1 & 0x3FF;
		this.method4645();
		this.method2081();
	}
}
