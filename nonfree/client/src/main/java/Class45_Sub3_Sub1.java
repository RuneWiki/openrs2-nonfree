import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class45_Sub3_Sub1 extends Class45_Sub3 {

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	private int anInt3069;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "S")
	public short aShort18;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Z")
	public boolean aBoolean223 = false;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!ii;")
	public Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public int anInt3067;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public int anInt3066;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt3068;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public int anInt3071;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	private int anInt3072;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ii;IIIIIIIII)V")
	public Class45_Sub3_Sub1(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass45_Sub1_1 = arg0;
		this.anInt3067 = arg1 << Static150.anInt3070;
		this.anInt3066 = arg2 << Static150.anInt3070;
		this.anInt3068 = arg3 << Static150.anInt3070;
		this.anInt3071 = arg9;
		this.aShort14 = this.aShort15 = (short) arg8;
		this.aShort17 = (short) arg4;
		this.aShort13 = (short) arg5;
		this.aShort16 = (short) arg6;
		this.anInt3072 = arg7;
		this.method2457();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
	public void method2455(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass45_Sub1_1 == null) {
			return;
		}
		this.aShort15 = (short) (this.aShort15 - arg1);
		if (this.aShort15 <= 0) {
			this.method2458();
			return;
		}
		@Pc(21) int local21 = this.anInt3067 >> Static150.anInt3070;
		@Pc(26) int local26 = this.anInt3066 >> Static150.anInt3070;
		@Pc(31) int local31 = this.anInt3068 >> Static150.anInt3070;
		@Pc(35) Class45_Sub2 local35 = this.aClass45_Sub1_1.aClass45_Sub2_4;
		@Pc(39) Class148 local39 = this.aClass45_Sub1_1.aClass148_2;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt4507 != 0) {
			if (this.aShort14 - this.aShort15 <= local39.anInt4495) {
				local69 = (this.anInt3071 >> 8 & 0xFF00) + (this.anInt3069 >> 16 & 0xFF) + local39.anInt4480 * arg1;
				local86 = (this.anInt3071 & 0xFF00) + (this.anInt3069 >> 8 & 0xFF) + local39.anInt4499 * arg1;
				local103 = ((this.anInt3071 & 0xFF) << 8) + (this.anInt3069 & 0xFF) + local39.anInt4494 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 > 65535) {
					local86 = 65535;
				}
				if (local103 < 0) {
					local103 = 0;
				} else if (local103 > 65535) {
					local103 = 65535;
				}
				this.anInt3071 &= 0xFF000000;
				this.anInt3071 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt3069 &= 0xFF000000;
				this.anInt3069 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort14 - this.aShort15 <= local39.anInt4517) {
				local69 = (this.anInt3071 >> 16 & 0xFF00) + (this.anInt3069 >> 24 & 0xFF) + local39.anInt4482 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt3071 &= 0xFFFFFF;
				this.anInt3071 |= (local69 & 0xFF00) << 16;
				this.anInt3069 &= 0xFFFFFF;
				this.anInt3069 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt4468 != -1 && this.aShort14 - this.aShort15 <= local39.anInt4513) {
			this.anInt3072 += local39.anInt4510 * arg1;
		}
		local69 = this.aShort17;
		local86 = this.aShort13;
		local103 = this.aShort16;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt4493 == 1) {
			local296 = local21 - this.aClass45_Sub1_1.anInt2277;
			local302 = local26 - this.aClass45_Sub1_1.anInt2276;
			local308 = local31 - this.aClass45_Sub1_1.anInt2281;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt4514 * local323 * arg1;
			this.anInt3072 = (int) ((long) this.anInt3072 - ((long) this.anInt3072 * local331 >> 18));
		} else if (local39.anInt4493 == 2) {
			local296 = local21 - this.aClass45_Sub1_1.anInt2277;
			local302 = local26 - this.aClass45_Sub1_1.anInt2276;
			local308 = local31 - this.aClass45_Sub1_1.anInt2281;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt4514 * local323 * arg1;
			this.anInt3072 = (int) ((long) this.anInt3072 - ((long) this.anInt3072 * local331 >> 28));
		}
		@Pc(406) Class1 local406 = local35.aClass24_17.aClass1_27;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class1_Sub1_Sub1 local415;
		@Pc(419) Class23 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class1 local409 = local406.aClass1_233; local409 != local406; local409 = local409.aClass1_233) {
			local415 = (Class1_Sub1_Sub1) local409;
			local419 = local415.aClass15_1.aClass23_1;
			if (local419.anInt466 != 1) {
				local429 = local21 - local415.anInt39;
				local434 = local26 - local415.anInt38;
				local439 = local31 - local415.anInt35;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong23) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt34 + local434 * local419.anInt472 + local439 * local415.anInt32) * 65535L / (long) (local419.anInt467 * local463);
					if (local491 >= (long) local419.anInt457) {
						local500 = 0;
						if (local419.anInt459 == 1) {
							local500 = (local463 >> 4) * local419.anInt462;
						} else if (local419.anInt459 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt462;
						}
						if (local419.anInt471 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt467;
							local615 = (local434 << 15) / local463 * local419.anInt467;
							local624 = (local439 << 15) / local463 * local419.anInt467;
							if (local419.anInt460 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt3067 += local606 * arg1 >> 15;
								this.anInt3066 += local615 * arg1 >> 15;
								this.anInt3068 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt460 == 0) {
							local69 += (local415.anInt34 - local500) * arg1;
							local86 += (local419.anInt472 - local500) * arg1;
							local103 += (local415.anInt32 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt3067 += (local415.anInt34 - local500) * arg1;
							this.anInt3066 += (local419.anInt472 - local500) * arg1;
							this.anInt3068 += (local415.anInt32 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray420 != null) {
			for (local302 = 0; local302 < local39.anIntArray420.length; local302++) {
				local415 = (Class1_Sub1_Sub1) Static149.aClass121_1.method3077((long) local39.anIntArray420[local302]);
				while (local415 != null) {
					local419 = local415.aClass15_1.aClass23_1;
					local429 = local21 - local415.anInt39;
					local434 = local26 - local415.anInt38;
					local439 = local31 - local415.anInt35;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong23) {
						local415 = (Class1_Sub1_Sub1) Static149.aClass121_1.method3082();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt34 + local434 * local419.anInt472 + local439 * local415.anInt32) * 65535L / (long) (local419.anInt467 * local463);
						if (local491 < (long) local419.anInt457) {
							local415 = (Class1_Sub1_Sub1) Static149.aClass121_1.method3082();
						} else {
							local500 = 0;
							if (local419.anInt459 == 1) {
								local500 = (local463 >> 4) * local419.anInt462;
							} else if (local419.anInt459 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt462;
							}
							if (local419.anInt471 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt467;
								local615 = (local434 << 15) / local463 * local419.anInt467;
								local624 = (local439 << 15) / local463 * local419.anInt467;
								if (local419.anInt460 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt3067 += local606 * arg1 >> 15;
									this.anInt3066 += local615 * arg1 >> 15;
									this.anInt3068 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt460 == 0) {
								local69 += (local415.anInt34 - local500) * arg1;
								local86 += (local419.anInt472 - local500) * arg1;
								local103 += (local415.anInt32 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt3067 += (local415.anInt34 - local500) * arg1;
								this.anInt3066 += (local419.anInt472 - local500) * arg1;
								this.anInt3068 += (local415.anInt32 - local500) * arg1;
							}
							local415 = (Class1_Sub1_Sub1) Static149.aClass121_1.method3082();
						}
					}
				}
			}
		}
		if (local39.anIntArray417 != null) {
			if (local39.anIntArray418 == null) {
				local39.anIntArray418 = new int[local39.anIntArray417.length];
				for (local302 = 0; local302 < local39.anIntArray417.length; local302++) {
					Static20.method399(local39.anIntArray417[local302]);
					local39.anIntArray418[local302] = ((Class1_Sub13) Static202.aClass156_18.method3821((long) local39.anIntArray417[local302])).anInt2852;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray418.length; local302++) {
				@Pc(1048) Class23 local1048 = Static168.aClass23Array114[local39.anIntArray418[local302]];
				if (local1048.anInt460 == 0) {
					local69 += local1048.anInt458 * arg1;
					local86 += local1048.anInt472 * arg1;
					local103 += local1048.anInt473 * arg1;
					local286 = true;
				} else {
					this.anInt3067 += local1048.anInt458 * arg1;
					this.anInt3066 += local1048.anInt472 * arg1;
					this.anInt3068 += local1048.anInt473 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort17 = (short) local69;
					this.aShort13 = (short) local86;
					this.aShort16 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt3072 <<= 0x1;
			}
		}
		this.anInt3067 = (int) ((long) this.anInt3067 + ((long) this.aShort17 * (long) this.anInt3072 >> 23) * (long) arg1);
		this.anInt3066 = (int) ((long) this.anInt3066 + ((long) this.aShort13 * (long) this.anInt3072 >> 23) * (long) arg1);
		this.anInt3068 = (int) ((long) this.anInt3068 + ((long) this.aShort16 * (long) this.anInt3072 >> 23) * (long) arg1);
		local302 = this.anInt3067 >> 19;
		local308 = this.anInt3068 >> 19;
		local26 = this.anInt3066 >> Static150.anInt3070;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static6.anInt118 || local308 < 0 || local308 >= Static178.anInt3591) {
			this.method2458();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static208.anIntArrayArrayArray11;
		local429 = local1247[local35.anInt3001][local302][local308];
		if (local35.anInt3001 < 3) {
			local434 = local1247[local35.anInt3001 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt3001][local302][local308] - 1024;
		}
		if (local39.aBoolean323) {
			if (local39.anInt4497 == -1 && local26 > local429) {
				this.method2458();
				return;
			}
			if (local39.anInt4497 >= 0 && local26 > local1247[local39.anInt4497][local302][local308]) {
				this.method2458();
				return;
			}
			if (local39.anInt4502 == -1 && local26 < local434) {
				this.method2458();
				return;
			}
			if (local39.anInt4502 >= 0 && local26 < local1247[local39.anInt4502 + 1][local302][local308]) {
				this.method2458();
				return;
			}
		}
		if (local302 >= local35.anInt3015 && local302 <= local35.anInt3006 && local308 >= local35.anInt3000 && local308 <= local35.anInt3005 && local26 <= local35.anInt2999 && local26 >= local35.anInt3004) {
			this.aBoolean223 = false;
			return;
		}
		this.aBoolean223 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method2458();
			return;
		}
		@Pc(1427) Class1_Sub17 local1427 = Static122.aClass1_Sub17ArrayArrayArray3[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static122.aClass1_Sub17ArrayArrayArray3[local1369][local302][local308] = new Class1_Sub17(local1369, local302, local308);
		}
		if (local1427.aClass39_1 == null) {
			local1427.aClass39_1 = new Class39();
			local1427.aByte10 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte10 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass39_1.method827();
			local1427.aByte10 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass39_1.method828(this);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ii;IIIIIIIII)V")
	public void method2456(@OriginalArg(0) Class45_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass45_Sub1_1 = arg0;
		this.anInt3067 = arg1 << Static150.anInt3070;
		this.anInt3066 = arg2 << Static150.anInt3070;
		this.anInt3068 = arg3 << Static150.anInt3070;
		this.anInt3071 = arg9;
		this.aShort14 = this.aShort15 = (short) arg8;
		this.aShort17 = (short) arg4;
		this.aShort13 = (short) arg5;
		this.aShort16 = (short) arg6;
		this.anInt3072 = arg7;
		this.method2457();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	private void method2457() {
		@Pc(4) int local4 = this.aClass45_Sub1_1.aClass45_Sub2_4.anInt2994;
		if (this.aClass45_Sub1_1.aClass45_Sub2_4.aClass45_Sub3_Sub1Array2[local4] != null) {
			this.aClass45_Sub1_1.aClass45_Sub2_4.aClass45_Sub3_Sub1Array2[local4].method2458();
		}
		this.aClass45_Sub1_1.aClass45_Sub2_4.aClass45_Sub3_Sub1Array2[local4] = this;
		this.aShort18 = (short) this.aClass45_Sub1_1.aClass45_Sub2_4.anInt2994;
		this.aClass45_Sub1_1.aClass45_Sub2_4.anInt2994 = local4 + 1 & 0x1FFF;
		this.aClass45_Sub1_1.aClass168_1.method3984(this);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
	private void method2458() {
		this.aClass45_Sub1_1.aClass45_Sub2_4.aClass45_Sub3_Sub1Array2[this.aShort18] = null;
		Static149.aClass45_Sub3_Sub1Array1[Static149.anInt2997] = this;
		Static149.anInt2997 = Static149.anInt2997 + 1 & 0x3FF;
		this.aClass45_Sub1_1 = null;
		this.method2449();
		this.method2454();
	}
}
