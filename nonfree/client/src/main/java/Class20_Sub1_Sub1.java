import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class20_Sub1_Sub1 extends Class20_Sub1 {

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
	private int anInt4569;

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "S")
	public short aShort68;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!wm;")
	public Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
	public int anInt4570;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
	public int anInt4571;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
	public int anInt4566;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
	public int anInt4572;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
	private int anInt4567;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!wm;IIIIIIIII)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass20_Sub3_1 = arg0;
		this.anInt4570 = arg1 << Static224.anInt4568;
		this.anInt4571 = arg2 << Static224.anInt4568;
		this.anInt4566 = arg3 << Static224.anInt4568;
		this.anInt4572 = arg9;
		this.aShort69 = this.aShort65 = (short) arg8;
		this.aShort66 = (short) arg4;
		this.aShort64 = (short) arg5;
		this.aShort67 = (short) arg6;
		this.anInt4567 = arg7;
		this.method3697();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	private void method3697() {
		@Pc(4) int local4 = this.aClass20_Sub3_1.aClass20_Sub2_7.anInt2315;
		if (this.aClass20_Sub3_1.aClass20_Sub2_7.aClass20_Sub1_Sub1Array2[local4] != null) {
			this.aClass20_Sub3_1.aClass20_Sub2_7.aClass20_Sub1_Sub1Array2[local4].method3699();
		}
		this.aClass20_Sub3_1.aClass20_Sub2_7.aClass20_Sub1_Sub1Array2[local4] = this;
		this.aShort68 = (short) this.aClass20_Sub3_1.aClass20_Sub2_7.anInt2315;
		this.aClass20_Sub3_1.aClass20_Sub2_7.anInt2315 = local4 + 1 & 0x1FFF;
		this.aClass20_Sub3_1.aClass33_3.method981(this);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!wm;IIIIIIIII)V")
	public void method3698(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass20_Sub3_1 = arg0;
		this.anInt4570 = arg1 << Static224.anInt4568;
		this.anInt4571 = arg2 << Static224.anInt4568;
		this.anInt4566 = arg3 << Static224.anInt4568;
		this.anInt4572 = arg9;
		this.aShort69 = this.aShort65 = (short) arg8;
		this.aShort66 = (short) arg4;
		this.aShort64 = (short) arg5;
		this.aShort67 = (short) arg6;
		this.anInt4567 = arg7;
		this.method3697();
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	private void method3699() {
		this.aClass20_Sub3_1.aClass20_Sub2_7.aClass20_Sub1_Sub1Array2[this.aShort68] = null;
		Static97.aClass20_Sub1_Sub1Array1[Static97.anInt2317] = this;
		Static97.anInt2317 = Static97.anInt2317 + 1 & 0x3FF;
		this.aClass20_Sub3_1 = null;
		this.method4753();
		this.method3693();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)V")
	public void method3700(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_Sub3_1 == null) {
			return;
		}
		this.aShort65 = (short) (this.aShort65 - arg1);
		if (this.aShort65 <= 0) {
			this.method3699();
			return;
		}
		@Pc(21) int local21 = this.anInt4570 >> Static224.anInt4568;
		@Pc(26) int local26 = this.anInt4571 >> Static224.anInt4568;
		@Pc(31) int local31 = this.anInt4566 >> Static224.anInt4568;
		@Pc(35) Class20_Sub2 local35 = this.aClass20_Sub3_1.aClass20_Sub2_7;
		@Pc(39) Class75 local39 = this.aClass20_Sub3_1.aClass75_2;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt2554 != 0) {
			if (this.aShort69 - this.aShort65 <= local39.anInt2553) {
				local69 = (this.anInt4572 >> 8 & 0xFF00) + (this.anInt4569 >> 16 & 0xFF) + local39.anInt2538 * arg1;
				local86 = (this.anInt4572 & 0xFF00) + (this.anInt4569 >> 8 & 0xFF) + local39.anInt2559 * arg1;
				local103 = ((this.anInt4572 & 0xFF) << 8) + (this.anInt4569 & 0xFF) + local39.anInt2572 * arg1;
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
				this.anInt4572 &= 0xFF000000;
				this.anInt4572 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt4569 &= 0xFF000000;
				this.anInt4569 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort69 - this.aShort65 <= local39.anInt2557) {
				local69 = (this.anInt4572 >> 16 & 0xFF00) + (this.anInt4569 >> 24 & 0xFF) + local39.anInt2565 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt4572 &= 0xFFFFFF;
				this.anInt4572 |= (local69 & 0xFF00) << 16;
				this.anInt4569 &= 0xFFFFFF;
				this.anInt4569 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt2545 != -1 && this.aShort69 - this.aShort65 <= local39.anInt2564) {
			this.anInt4567 += local39.anInt2556 * arg1;
		}
		local69 = this.aShort66;
		local86 = this.aShort64;
		local103 = this.aShort67;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt2558 == 1) {
			local296 = local21 - this.aClass20_Sub3_1.anInt6084;
			local302 = local26 - this.aClass20_Sub3_1.anInt6085;
			local308 = local31 - this.aClass20_Sub3_1.anInt6088;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt2542 * local323 * arg1;
			this.anInt4567 = (int) ((long) this.anInt4567 - ((long) this.anInt4567 * local331 >> 18));
		} else if (local39.anInt2558 == 2) {
			local296 = local21 - this.aClass20_Sub3_1.anInt6084;
			local302 = local26 - this.aClass20_Sub3_1.anInt6085;
			local308 = local31 - this.aClass20_Sub3_1.anInt6088;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt2542 * local323 * arg1;
			this.anInt4567 = (int) ((long) this.anInt4567 - ((long) this.anInt4567 * local331 >> 28));
		}
		@Pc(406) Class2 local406 = local35.aClass44_10.aClass2_77;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class2_Sub8_Sub15 local415;
		@Pc(419) Class121 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class2 local409 = local406.aClass2_232; local409 != local406; local409 = local409.aClass2_232) {
			local415 = (Class2_Sub8_Sub15) local409;
			local419 = local415.aClass176_1.aClass121_1;
			if (local419.anInt4001 != 1) {
				local429 = local21 - local415.anInt4041;
				local434 = local26 - local415.anInt4043;
				local439 = local31 - local415.anInt4050;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong141) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt4051 + local434 * local419.anInt4000 + local439 * local415.anInt4052) * 65535L / (long) (local419.anInt3999 * local463);
					if (local491 >= (long) local419.anInt3998) {
						local500 = 0;
						if (local419.anInt4015 == 1) {
							local500 = (local463 >> 4) * local419.anInt4010;
						} else if (local419.anInt4015 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt4010;
						}
						if (local419.anInt4006 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt3999;
							local615 = (local434 << 15) / local463 * local419.anInt3999;
							local624 = (local439 << 15) / local463 * local419.anInt3999;
							if (local419.anInt4012 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt4570 += local606 * arg1 >> 15;
								this.anInt4571 += local615 * arg1 >> 15;
								this.anInt4566 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt4012 == 0) {
							local69 += (local415.anInt4051 - local500) * arg1;
							local86 += (local419.anInt4000 - local500) * arg1;
							local103 += (local415.anInt4052 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt4570 += (local415.anInt4051 - local500) * arg1;
							this.anInt4571 += (local419.anInt4000 - local500) * arg1;
							this.anInt4566 += (local415.anInt4052 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray223 != null) {
			for (local302 = 0; local302 < local39.anIntArray223.length; local302++) {
				local415 = (Class2_Sub8_Sub15) Static97.aClass169_1.method4310((long) local39.anIntArray223[local302]);
				while (local415 != null) {
					local419 = local415.aClass176_1.aClass121_1;
					local429 = local21 - local415.anInt4041;
					local434 = local26 - local415.anInt4043;
					local439 = local31 - local415.anInt4050;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong141) {
						local415 = (Class2_Sub8_Sub15) Static97.aClass169_1.method4316();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt4051 + local434 * local419.anInt4000 + local439 * local415.anInt4052) * 65535L / (long) (local419.anInt3999 * local463);
						if (local491 < (long) local419.anInt3998) {
							local415 = (Class2_Sub8_Sub15) Static97.aClass169_1.method4316();
						} else {
							local500 = 0;
							if (local419.anInt4015 == 1) {
								local500 = (local463 >> 4) * local419.anInt4010;
							} else if (local419.anInt4015 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt4010;
							}
							if (local419.anInt4006 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt3999;
								local615 = (local434 << 15) / local463 * local419.anInt3999;
								local624 = (local439 << 15) / local463 * local419.anInt3999;
								if (local419.anInt4012 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt4570 += local606 * arg1 >> 15;
									this.anInt4571 += local615 * arg1 >> 15;
									this.anInt4566 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt4012 == 0) {
								local69 += (local415.anInt4051 - local500) * arg1;
								local86 += (local419.anInt4000 - local500) * arg1;
								local103 += (local415.anInt4052 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt4570 += (local415.anInt4051 - local500) * arg1;
								this.anInt4571 += (local419.anInt4000 - local500) * arg1;
								this.anInt4566 += (local415.anInt4052 - local500) * arg1;
							}
							local415 = (Class2_Sub8_Sub15) Static97.aClass169_1.method4316();
						}
					}
				}
			}
		}
		if (local39.anIntArray224 != null) {
			if (local39.anIntArray226 == null) {
				local39.anIntArray226 = new int[local39.anIntArray224.length];
				for (local302 = 0; local302 < local39.anIntArray224.length; local302++) {
					Static89.method1576(local39.anIntArray224[local302]);
					local39.anIntArray226[local302] = ((Class2_Sub25) Static270.aClass101_17.method2867((long) local39.anIntArray224[local302])).anInt4838;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray226.length; local302++) {
				@Pc(1048) Class121 local1048 = Static146.aClass121Array1[local39.anIntArray226[local302]];
				if (local1048.anInt4012 == 0) {
					local69 += local1048.anInt4009 * arg1;
					local86 += local1048.anInt4000 * arg1;
					local103 += local1048.anInt4014 * arg1;
					local286 = true;
				} else {
					this.anInt4570 += local1048.anInt4009 * arg1;
					this.anInt4571 += local1048.anInt4000 * arg1;
					this.anInt4566 += local1048.anInt4014 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort66 = (short) local69;
					this.aShort64 = (short) local86;
					this.aShort67 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt4567 <<= 0x1;
			}
		}
		this.anInt4570 = (int) ((long) this.anInt4570 + ((long) this.aShort66 * (long) this.anInt4567 >> 23) * (long) arg1);
		this.anInt4571 = (int) ((long) this.anInt4571 + ((long) this.aShort64 * (long) this.anInt4567 >> 23) * (long) arg1);
		this.anInt4566 = (int) ((long) this.anInt4566 + ((long) this.aShort67 * (long) this.anInt4567 >> 23) * (long) arg1);
		local302 = this.anInt4570 >> 19;
		local308 = this.anInt4566 >> 19;
		local26 = this.anInt4571 >> Static224.anInt4568;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static38.anInt954 || local308 < 0 || local308 >= Static232.anInt4680) {
			this.method3699();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static9.anIntArrayArrayArray7;
		local429 = local1247[local35.anInt2330][local302][local308];
		if (local35.anInt2330 < 3) {
			local434 = local1247[local35.anInt2330 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt2330][local302][local308] - 1024;
		}
		if (local39.aBoolean169) {
			if (local39.anInt2563 == -1 && local26 > local429) {
				this.method3699();
				return;
			}
			if (local39.anInt2563 >= 0 && local26 > local1247[local39.anInt2563][local302][local308]) {
				this.method3699();
				return;
			}
			if (local39.anInt2561 == -1 && local26 < local434) {
				this.method3699();
				return;
			}
			if (local39.anInt2561 >= 0 && local26 < local1247[local39.anInt2561 + 1][local302][local308]) {
				this.method3699();
				return;
			}
		}
		if (local302 >= local35.anInt2321 && local302 <= local35.anInt2325 && local308 >= local35.anInt2324 && local308 <= local35.anInt2333 && local26 <= local35.anInt2323 && local26 >= local35.anInt2335) {
			this.aBoolean304 = false;
			return;
		}
		this.aBoolean304 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method3699();
			return;
		}
		@Pc(1427) Class2_Sub13 local1427 = Static52.aClass2_Sub13ArrayArrayArray1[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static52.aClass2_Sub13ArrayArrayArray1[local1369][local302][local308] = new Class2_Sub13(local1369, local302, local308);
		}
		if (local1427.aClass66_1 == null) {
			local1427.aClass66_1 = new Class66();
			local1427.aByte3 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte3 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass66_1.method1709();
			local1427.aByte3 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass66_1.method1712(this);
	}
}
