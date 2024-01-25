import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class17_Sub7_Sub1_Sub1 extends Class17_Sub7_Sub1 {

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
	private int anInt6619;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Lclient!l;")
	private Class17_Sub5 aClass17_Sub5_1;

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!vd", name = "S", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	private int anInt6618;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!l;IIIIIIIIIIIZ)V")
	public Class17_Sub7_Sub1_Sub1(@OriginalArg(0) Class17_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass17_Sub5_1 = arg0;
		super.anInt6612 = arg1 << Static207.anInt4347;
		super.anInt6611 = arg2 << Static207.anInt4347;
		super.anInt6605 = arg3 << Static207.anInt4347;
		super.anInt6614 = arg9;
		this.aShort88 = this.aShort86 = (short) arg8;
		super.anInt6607 = arg10;
		super.anInt6609 = arg11;
		this.aShort87 = (short) arg4;
		this.aShort90 = (short) arg5;
		this.aShort89 = (short) arg6;
		this.anInt6618 = arg7;
		super.aByte74 = this.aClass17_Sub5_1.aClass125_1.aByte47;
		this.method5488();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
	private void method5484() {
		this.aClass17_Sub5_1.aClass17_Sub3_5.aClass17_Sub7_Sub1_Sub1Array1[this.aShort91] = null;
		Static219.aClass17_Sub7_Sub1_Sub1Array2[Static219.anInt4567] = this;
		Static219.anInt4567 = Static219.anInt4567 + 1 & 0x3FF;
		this.method5473();
		this.method5477();
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(JI)V")
	public void method5485(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort86 = (short) (this.aShort86 - arg1);
		if (this.aShort86 <= 0) {
			this.method5484();
			return;
		}
		@Pc(17) int local17 = super.anInt6612 >> Static207.anInt4347;
		@Pc(22) int local22 = super.anInt6611 >> Static207.anInt4347;
		@Pc(27) int local27 = super.anInt6605 >> Static207.anInt4347;
		@Pc(31) Class17_Sub3 local31 = this.aClass17_Sub5_1.aClass17_Sub3_5;
		@Pc(35) Class91 local35 = this.aClass17_Sub5_1.aClass91_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt2496 != 0) {
			if (this.aShort88 - this.aShort86 <= local35.anInt2527) {
				local65 = (super.anInt6614 >> 8 & 0xFF00) + (this.anInt6619 >> 16 & 0xFF) + local35.anInt2516 * arg1;
				local82 = (super.anInt6614 & 0xFF00) + (this.anInt6619 >> 8 & 0xFF) + local35.anInt2521 * arg1;
				local99 = ((super.anInt6614 & 0xFF) << 8) + (this.anInt6619 & 0xFF) + local35.anInt2495 * arg1;
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
				super.anInt6614 &= 0xFF000000;
				super.anInt6614 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt6619 &= 0xFF000000;
				this.anInt6619 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort88 - this.aShort86 <= local35.anInt2503) {
				local65 = (super.anInt6614 >> 16 & 0xFF00) + (this.anInt6619 >> 24 & 0xFF) + local35.anInt2487 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt6614 &= 0xFFFFFF;
				super.anInt6614 |= (local65 & 0xFF00) << 16;
				this.anInt6619 &= 0xFFFFFF;
				this.anInt6619 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2509 != -1 && this.aShort88 - this.aShort86 <= local35.anInt2510) {
			this.anInt6618 += local35.anInt2508 * arg1;
		}
		if (local35.anInt2514 != -1 && this.aShort88 - this.aShort86 <= local35.anInt2506) {
			super.anInt6607 += local35.anInt2523 * arg1;
		}
		local65 = this.aShort87;
		local82 = this.aShort90;
		local99 = this.aShort89;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt2488 == 1) {
			local313 = local17 - this.aClass17_Sub5_1.anInt3721;
			local319 = local22 - this.aClass17_Sub5_1.anInt3725;
			local325 = local27 - this.aClass17_Sub5_1.anInt3729;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt2524 * local340 * arg1;
			this.anInt6618 = (int) ((long) this.anInt6618 - ((long) this.anInt6618 * local348 >> 18));
		} else if (local35.anInt2488 == 2) {
			local313 = local17 - this.aClass17_Sub5_1.anInt3721;
			local319 = local22 - this.aClass17_Sub5_1.anInt3725;
			local325 = local27 - this.aClass17_Sub5_1.anInt3729;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt2524 * local340 * arg1;
			this.anInt6618 = (int) ((long) this.anInt6618 - ((long) this.anInt6618 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray242 != null) {
			@Pc(426) Class4 local426 = local31.aClass130_21.aClass4_144;
			for (@Pc(429) Class4 local429 = local426.aClass4_247; local429 != local426; local429 = local429.aClass4_247) {
				@Pc(433) Class4_Sub1_Sub4 local433 = (Class4_Sub1_Sub4) local429;
				@Pc(436) Class6 local436 = local433.aClass6_1;
				if (local436.anInt140 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray242.length; local444++) {
						if (local35.anIntArray242[local444] == local436.anInt145) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt767;
						@Pc(473) int local473 = local22 - local433.anInt764;
						local478 = local27 - local433.anInt763;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong15) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt770 + local473 * local436.anInt147 + local478 * local433.anInt766) * 65535L / (long) (local436.anInt150 * local501);
							if (local529 >= (long) local436.anInt135) {
								local537 = 0;
								if (local436.anInt139 == 1) {
									local537 = (local501 >> 4) * local436.anInt134;
								} else if (local436.anInt139 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt134;
								}
								if (local436.anInt144 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt150;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt150;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt150;
									if (local436.anInt143 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt6612 += local643 * arg1 >> 15;
										super.anInt6611 += local652 * arg1 >> 15;
										super.anInt6605 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt143 == 0) {
									local65 += (local433.anInt770 - local537) * arg1;
									local82 += (local436.anInt147 - local537) * arg1;
									local99 += (local433.anInt766 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt6612 += (local433.anInt770 - local537) * arg1;
									super.anInt6611 += (local436.anInt147 - local537) * arg1;
									super.anInt6605 += (local433.anInt766 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray244 != null) {
			for (local313 = 0; local313 < local35.anIntArray244.length; local313++) {
				@Pc(743) Class4_Sub1_Sub4 local743 = (Class4_Sub1_Sub4) Static17.aClass58_1.method1258((long) local35.anIntArray244[local313]);
				while (local743 != null) {
					@Pc(747) Class6 local747 = local743.aClass6_1;
					local340 = local17 - local743.anInt767;
					@Pc(757) int local757 = local22 - local743.anInt764;
					local444 = local27 - local743.anInt763;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong15) {
						local743 = (Class4_Sub1_Sub4) Static17.aClass58_1.method1253();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt770 + local757 * local747.anInt147 + local444 * local743.anInt766) * 65535L / (long) (local747.anInt150 * local478);
						if (local491 < (long) local747.anInt135) {
							local743 = (Class4_Sub1_Sub4) Static17.aClass58_1.method1253();
						} else {
							local501 = 0;
							if (local747.anInt139 == 1) {
								local501 = (local478 >> 4) * local747.anInt134;
							} else if (local747.anInt139 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt134;
							}
							if (local747.anInt144 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt150;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt150;
								local537 = (local444 << 15) / local478 * local747.anInt150;
								if (local747.anInt143 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt6612 += local939 * arg1 >> 15;
									super.anInt6611 += local948 * arg1 >> 15;
									super.anInt6605 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt143 == 0) {
								local65 += (local743.anInt770 - local501) * arg1;
								local82 += (local747.anInt147 - local501) * arg1;
								local99 += (local743.anInt766 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt6612 += (local743.anInt770 - local501) * arg1;
								super.anInt6611 += (local747.anInt147 - local501) * arg1;
								super.anInt6605 += (local743.anInt766 - local501) * arg1;
							}
							local743 = (Class4_Sub1_Sub4) Static17.aClass58_1.method1253();
						}
					}
				}
			}
		}
		if (local35.anIntArray245 != null) {
			if (local35.anIntArray243 == null) {
				local35.anIntArray243 = new int[local35.anIntArray245.length];
				for (local313 = 0; local313 < local35.anIntArray245.length; local313++) {
					Static129.method2606(local35.anIntArray245[local313]);
					local35.anIntArray243[local313] = ((Class4_Sub36) Static249.aClass198_30.method5261((long) local35.anIntArray245[local313])).anInt5967;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray243.length; local313++) {
				@Pc(1082) Class6 local1082 = Static301.aClass6Array1[local35.anIntArray243[local313]];
				if (local1082.anInt143 == 0) {
					local65 += local1082.anInt142 * arg1;
					local82 += local1082.anInt147 * arg1;
					local99 += local1082.anInt146 * arg1;
					local303 = true;
				} else {
					super.anInt6612 += local1082.anInt142 * arg1;
					super.anInt6611 += local1082.anInt147 * arg1;
					super.anInt6605 += local1082.anInt146 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort87 = (short) local65;
					this.aShort90 = (short) local82;
					this.aShort89 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt6618 <<= 0x1;
			}
		}
		super.anInt6612 = (int) ((long) super.anInt6612 + ((long) this.aShort87 * (long) this.anInt6618 >> 23) * (long) arg1);
		super.anInt6611 = (int) ((long) super.anInt6611 + ((long) this.aShort90 * (long) this.anInt6618 >> 23) * (long) arg1);
		super.anInt6605 = (int) ((long) super.anInt6605 + ((long) this.aShort89 * (long) this.anInt6618 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!l;IIIIIIIIIIIZ)V")
	public void method5486(@OriginalArg(0) Class17_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass17_Sub5_1 = arg0;
		super.anInt6612 = arg1 << Static207.anInt4347;
		super.anInt6611 = arg2 << Static207.anInt4347;
		super.anInt6605 = arg3 << Static207.anInt4347;
		super.anInt6614 = arg9;
		this.aShort88 = this.aShort86 = (short) arg8;
		super.anInt6607 = arg10;
		super.anInt6609 = arg11;
		this.aShort87 = (short) arg4;
		this.aShort90 = (short) arg5;
		this.aShort89 = (short) arg6;
		this.anInt6618 = arg7;
		super.aByte74 = this.aClass17_Sub5_1.aClass125_1.aByte47;
		this.method5488();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(J)V")
	public void method5487(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt6612 >> 19;
		@Pc(9) int local9 = super.anInt6605 >> 19;
		@Pc(14) int local14 = super.anInt6611 >> Static207.anInt4347;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static151.anInt3338 || local9 < 0 || local9 >= Static220.anInt4569) {
			this.method5484();
			return;
		}
		@Pc(36) Class17_Sub3 local36 = this.aClass17_Sub5_1.aClass17_Sub3_5;
		@Pc(40) Class91 local40 = this.aClass17_Sub5_1.aClass91_1;
		@Pc(42) Class26[] local42 = Static307.aClass26Array3;
		@Pc(50) int local50 = local42[local36.anInt1294].method4996(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt1294 < 3) {
			local64 = local42[local36.anInt1294 + 1].method4996(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean215) {
			if (local40.anInt2492 == -1 && local14 > local50) {
				this.method5484();
				return;
			}
			if (local40.anInt2492 >= 0 && local14 > local42[local40.anInt2492].method4996(local4, local9)) {
				this.method5484();
				return;
			}
			if (local40.anInt2482 == -1 && local14 < local64) {
				this.method5484();
				return;
			}
			if (local40.anInt2482 >= 0 && local14 < local42[local40.anInt2482 + 1].method4996(local4, local9)) {
				this.method5484();
				return;
			}
		}
		if (local4 >= local36.anInt1298 && local4 <= local36.anInt1295 && local9 >= local36.anInt1296 && local9 <= local36.anInt1295 && local14 <= local50 && local14 >= local64) {
			local36.aClass88_1.aClass114_1.method3156(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method4996(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method4996(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method4996(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method4996(local4, local9) - 1024) {
			this.method5484();
			return;
		}
		@Pc(202) Class57 local202 = Static18.aClass57ArrayArrayArray1[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static18.aClass57ArrayArrayArray1[0][local4][local9].aClass57_1 != null;
			if (local148 == 3 && local217) {
				this.method5484();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static18.aClass57ArrayArrayArray1[local227][local4][local9] == null) {
					local202 = Static18.aClass57ArrayArrayArray1[local227][local4][local9] = new Class57(local227, local4, local9);
					if (local217) {
						local202.aByte31++;
					}
				}
			}
		}
		if (local202.aClass88_2 == null) {
			local202.aClass88_2 = new Class88();
			local202.aByte29 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte29 != (byte) (arg0 & 0xFFL)) {
			local202.aClass88_2 = new Class88();
			local202.aByte29 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass88_2.aClass114_1.method3156(this);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
	private void method5488() {
		@Pc(4) int local4 = this.aClass17_Sub5_1.aClass17_Sub3_5.anInt1292;
		if (this.aClass17_Sub5_1.aClass17_Sub3_5.aClass17_Sub7_Sub1_Sub1Array1[local4] != null) {
			this.aClass17_Sub5_1.aClass17_Sub3_5.aClass17_Sub7_Sub1_Sub1Array1[local4].method5484();
		}
		this.aClass17_Sub5_1.aClass17_Sub3_5.aClass17_Sub7_Sub1_Sub1Array1[local4] = this;
		this.aShort91 = (short) this.aClass17_Sub5_1.aClass17_Sub3_5.anInt1292;
		this.aClass17_Sub5_1.aClass17_Sub3_5.anInt1292 = local4 + 1 & 0x1FFF;
		this.aClass17_Sub5_1.aClass204_8.method5365(this);
	}
}
