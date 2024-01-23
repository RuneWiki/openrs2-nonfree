import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class21_Sub2_Sub1 extends Class21_Sub2 {

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "S")
	public short aShort50;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	private int anInt5761;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!tj;")
	public Class21_Sub3 aClass21_Sub3_1;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	public int anInt5757;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	public int anInt5758;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	public int anInt5762;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public int anInt5759;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
	private int anInt5756;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!tj;IIIIIIIII)V")
	public Class21_Sub2_Sub1(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass21_Sub3_1 = arg0;
		this.anInt5757 = arg1 << Static302.anInt5760;
		this.anInt5758 = arg2 << Static302.anInt5760;
		this.anInt5762 = arg3 << Static302.anInt5760;
		this.anInt5759 = arg9;
		this.aShort49 = this.aShort51 = (short) arg8;
		this.aShort52 = (short) arg4;
		this.aShort48 = (short) arg5;
		this.aShort47 = (short) arg6;
		this.anInt5756 = arg7;
		this.method4647();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tj;IIIIIIIII)V")
	public void method4645(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass21_Sub3_1 = arg0;
		this.anInt5757 = arg1 << Static302.anInt5760;
		this.anInt5758 = arg2 << Static302.anInt5760;
		this.anInt5762 = arg3 << Static302.anInt5760;
		this.anInt5759 = arg9;
		this.aShort49 = this.aShort51 = (short) arg8;
		this.aShort52 = (short) arg4;
		this.aShort48 = (short) arg5;
		this.aShort47 = (short) arg6;
		this.anInt5756 = arg7;
		this.method4647();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
	private void method4646() {
		this.aClass21_Sub3_1.aClass21_Sub1_6.aClass21_Sub2_Sub1Array1[this.aShort50] = null;
		Static117.aClass21_Sub2_Sub1Array2[Static117.anInt2416] = this;
		Static117.anInt2416 = Static117.anInt2416 + 1 & 0x3FF;
		this.aClass21_Sub3_1 = null;
		this.method4639();
		this.method4642();
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
	private void method4647() {
		@Pc(4) int local4 = this.aClass21_Sub3_1.aClass21_Sub1_6.anInt2423;
		if (this.aClass21_Sub3_1.aClass21_Sub1_6.aClass21_Sub2_Sub1Array1[local4] != null) {
			this.aClass21_Sub3_1.aClass21_Sub1_6.aClass21_Sub2_Sub1Array1[local4].method4646();
		}
		this.aClass21_Sub3_1.aClass21_Sub1_6.aClass21_Sub2_Sub1Array1[local4] = this;
		this.aShort50 = (short) this.aClass21_Sub3_1.aClass21_Sub1_6.anInt2423;
		this.aClass21_Sub3_1.aClass21_Sub1_6.anInt2423 = local4 + 1 & 0x1FFF;
		this.aClass21_Sub3_1.aClass63_3.method1572(this);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(JI)V")
	public void method4648(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass21_Sub3_1 == null) {
			return;
		}
		this.aShort51 = (short) (this.aShort51 - arg1);
		if (this.aShort51 <= 0) {
			this.method4646();
			return;
		}
		@Pc(21) int local21 = this.anInt5757 >> Static302.anInt5760;
		@Pc(26) int local26 = this.anInt5758 >> Static302.anInt5760;
		@Pc(31) int local31 = this.anInt5762 >> Static302.anInt5760;
		@Pc(35) Class21_Sub1 local35 = this.aClass21_Sub3_1.aClass21_Sub1_6;
		@Pc(39) Class74 local39 = this.aClass21_Sub3_1.aClass74_2;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt2299 != 0) {
			if (this.aShort49 - this.aShort51 <= local39.anInt2327) {
				local69 = (this.anInt5759 >> 8 & 0xFF00) + (this.anInt5761 >> 16 & 0xFF) + local39.anInt2281 * arg1;
				local86 = (this.anInt5759 & 0xFF00) + (this.anInt5761 >> 8 & 0xFF) + local39.anInt2284 * arg1;
				local103 = ((this.anInt5759 & 0xFF) << 8) + (this.anInt5761 & 0xFF) + local39.anInt2298 * arg1;
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
				this.anInt5759 &= 0xFF000000;
				this.anInt5759 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt5761 &= 0xFF000000;
				this.anInt5761 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort49 - this.aShort51 <= local39.anInt2296) {
				local69 = (this.anInt5759 >> 16 & 0xFF00) + (this.anInt5761 >> 24 & 0xFF) + local39.anInt2297 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt5759 &= 0xFFFFFF;
				this.anInt5759 |= (local69 & 0xFF00) << 16;
				this.anInt5761 &= 0xFFFFFF;
				this.anInt5761 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt2282 != -1 && this.aShort49 - this.aShort51 <= local39.anInt2300) {
			this.anInt5756 += local39.anInt2320 * arg1;
		}
		local69 = this.aShort52;
		local86 = this.aShort48;
		local103 = this.aShort47;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt2316 == 1) {
			local296 = local21 - this.aClass21_Sub3_1.anInt5153;
			local302 = local26 - this.aClass21_Sub3_1.anInt5167;
			local308 = local31 - this.aClass21_Sub3_1.anInt5169;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt2285 * local323 * arg1;
			this.anInt5756 = (int) ((long) this.anInt5756 - ((long) this.anInt5756 * local331 >> 18));
		} else if (local39.anInt2316 == 2) {
			local296 = local21 - this.aClass21_Sub3_1.anInt5153;
			local302 = local26 - this.aClass21_Sub3_1.anInt5167;
			local308 = local31 - this.aClass21_Sub3_1.anInt5169;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt2285 * local323 * arg1;
			this.anInt5756 = (int) ((long) this.anInt5756 - ((long) this.anInt5756 * local331 >> 28));
		}
		@Pc(406) Class4 local406 = local35.aClass17_16.aClass4_33;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class4_Sub2_Sub19 local415;
		@Pc(419) Class146 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class4 local409 = local406.aClass4_233; local409 != local406; local409 = local409.aClass4_233) {
			local415 = (Class4_Sub2_Sub19) local409;
			local419 = local415.aClass88_1.aClass146_1;
			if (local419.anInt4703 != 1) {
				local429 = local21 - local415.anInt4642;
				local434 = local26 - local415.anInt4641;
				local439 = local31 - local415.anInt4636;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong162) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt4639 + local434 * local419.anInt4719 + local439 * local415.anInt4635) * 65535L / (long) (local419.anInt4718 * local463);
					if (local491 >= (long) local419.anInt4710) {
						local500 = 0;
						if (local419.anInt4721 == 1) {
							local500 = (local463 >> 4) * local419.anInt4709;
						} else if (local419.anInt4721 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt4709;
						}
						if (local419.anInt4717 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt4718;
							local615 = (local434 << 15) / local463 * local419.anInt4718;
							local624 = (local439 << 15) / local463 * local419.anInt4718;
							if (local419.anInt4722 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt5757 += local606 * arg1 >> 15;
								this.anInt5758 += local615 * arg1 >> 15;
								this.anInt5762 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt4722 == 0) {
							local69 += (local415.anInt4639 - local500) * arg1;
							local86 += (local419.anInt4719 - local500) * arg1;
							local103 += (local415.anInt4635 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt5757 += (local415.anInt4639 - local500) * arg1;
							this.anInt5758 += (local419.anInt4719 - local500) * arg1;
							this.anInt5762 += (local415.anInt4635 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray200 != null) {
			for (local302 = 0; local302 < local39.anIntArray200.length; local302++) {
				local415 = (Class4_Sub2_Sub19) Static117.aClass162_1.method4055((long) local39.anIntArray200[local302]);
				while (local415 != null) {
					local419 = local415.aClass88_1.aClass146_1;
					local429 = local21 - local415.anInt4642;
					local434 = local26 - local415.anInt4641;
					local439 = local31 - local415.anInt4636;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong162) {
						local415 = (Class4_Sub2_Sub19) Static117.aClass162_1.method4058();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt4639 + local434 * local419.anInt4719 + local439 * local415.anInt4635) * 65535L / (long) (local419.anInt4718 * local463);
						if (local491 < (long) local419.anInt4710) {
							local415 = (Class4_Sub2_Sub19) Static117.aClass162_1.method4058();
						} else {
							local500 = 0;
							if (local419.anInt4721 == 1) {
								local500 = (local463 >> 4) * local419.anInt4709;
							} else if (local419.anInt4721 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt4709;
							}
							if (local419.anInt4717 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt4718;
								local615 = (local434 << 15) / local463 * local419.anInt4718;
								local624 = (local439 << 15) / local463 * local419.anInt4718;
								if (local419.anInt4722 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt5757 += local606 * arg1 >> 15;
									this.anInt5758 += local615 * arg1 >> 15;
									this.anInt5762 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt4722 == 0) {
								local69 += (local415.anInt4639 - local500) * arg1;
								local86 += (local419.anInt4719 - local500) * arg1;
								local103 += (local415.anInt4635 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt5757 += (local415.anInt4639 - local500) * arg1;
								this.anInt5758 += (local419.anInt4719 - local500) * arg1;
								this.anInt5762 += (local415.anInt4635 - local500) * arg1;
							}
							local415 = (Class4_Sub2_Sub19) Static117.aClass162_1.method4058();
						}
					}
				}
			}
		}
		if (local39.anIntArray199 != null) {
			if (local39.anIntArray198 == null) {
				local39.anIntArray198 = new int[local39.anIntArray199.length];
				for (local302 = 0; local302 < local39.anIntArray199.length; local302++) {
					Static52.method1017(local39.anIntArray199[local302]);
					local39.anIntArray198[local302] = ((Class4_Sub25) Static111.aClass163_20.method4188((long) local39.anIntArray199[local302])).anInt3892;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray198.length; local302++) {
				@Pc(1048) Class146 local1048 = Static146.aClass146Array1[local39.anIntArray198[local302]];
				if (local1048.anInt4722 == 0) {
					local69 += local1048.anInt4708 * arg1;
					local86 += local1048.anInt4719 * arg1;
					local103 += local1048.anInt4720 * arg1;
					local286 = true;
				} else {
					this.anInt5757 += local1048.anInt4708 * arg1;
					this.anInt5758 += local1048.anInt4719 * arg1;
					this.anInt5762 += local1048.anInt4720 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort52 = (short) local69;
					this.aShort48 = (short) local86;
					this.aShort47 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt5756 <<= 0x1;
			}
		}
		this.anInt5757 = (int) ((long) this.anInt5757 + ((long) this.aShort52 * (long) this.anInt5756 >> 23) * (long) arg1);
		this.anInt5758 = (int) ((long) this.anInt5758 + ((long) this.aShort48 * (long) this.anInt5756 >> 23) * (long) arg1);
		this.anInt5762 = (int) ((long) this.anInt5762 + ((long) this.aShort47 * (long) this.anInt5756 >> 23) * (long) arg1);
		local302 = this.anInt5757 >> 19;
		local308 = this.anInt5762 >> 19;
		local26 = this.anInt5758 >> Static302.anInt5760;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static246.anInt4853 || local308 < 0 || local308 >= Static64.anInt1393) {
			this.method4646();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static154.anIntArrayArrayArray5;
		local429 = local1247[local35.anInt2426][local302][local308];
		if (local35.anInt2426 < 3) {
			local434 = local1247[local35.anInt2426 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt2426][local302][local308] - 1024;
		}
		if (local39.aBoolean142) {
			if (local39.anInt2304 == -1 && local26 > local429) {
				this.method4646();
				return;
			}
			if (local39.anInt2304 >= 0 && local26 > local1247[local39.anInt2304][local302][local308]) {
				this.method4646();
				return;
			}
			if (local39.anInt2323 == -1 && local26 < local434) {
				this.method4646();
				return;
			}
			if (local39.anInt2323 >= 0 && local26 < local1247[local39.anInt2323 + 1][local302][local308]) {
				this.method4646();
				return;
			}
		}
		if (local302 >= local35.anInt2436 && local302 <= local35.anInt2428 && local308 >= local35.anInt2432 && local308 <= local35.anInt2430 && local26 <= local35.anInt2434 && local26 >= local35.anInt2433) {
			this.aBoolean396 = false;
			return;
		}
		this.aBoolean396 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method4646();
			return;
		}
		@Pc(1427) Class4_Sub21 local1427 = Static261.aClass4_Sub21ArrayArrayArray4[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static261.aClass4_Sub21ArrayArrayArray4[local1369][local302][local308] = new Class4_Sub21(local1369, local302, local308);
		}
		if (local1427.aClass158_1 == null) {
			local1427.aClass158_1 = new Class158();
			local1427.aByte6 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte6 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass158_1.method3906();
			local1427.aByte6 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass158_1.method3900(this);
	}
}
