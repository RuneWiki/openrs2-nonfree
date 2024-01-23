import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class22_Sub1_Sub1 extends Class22_Sub1 {

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "S")
	public short aShort12;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "Lclient!ci;")
	public Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!ci;IIIIIIIII)V")
	public Class22_Sub1_Sub1(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass22_Sub2_1 = arg0;
		this.anInt647 = arg1 << Static33.anInt643;
		this.anInt645 = arg2 << Static33.anInt643;
		this.anInt649 = arg3 << Static33.anInt643;
		this.anInt646 = arg9;
		this.aShort10 = this.aShort9 = (short) arg8;
		this.aShort13 = (short) arg4;
		this.aShort11 = (short) arg5;
		this.aShort8 = (short) arg6;
		this.anInt644 = arg7;
		this.method600();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	private void method600() {
		@Pc(4) int local4 = this.aClass22_Sub2_1.aClass22_Sub3_1.anInt1133;
		if (this.aClass22_Sub2_1.aClass22_Sub3_1.aClass22_Sub1_Sub1Array2[local4] != null) {
			this.aClass22_Sub2_1.aClass22_Sub3_1.aClass22_Sub1_Sub1Array2[local4].method601();
		}
		this.aClass22_Sub2_1.aClass22_Sub3_1.aClass22_Sub1_Sub1Array2[local4] = this;
		this.aShort12 = (short) this.aClass22_Sub2_1.aClass22_Sub3_1.anInt1133;
		this.aClass22_Sub2_1.aClass22_Sub3_1.anInt1133 = local4 + 1 & 0x1FFF;
		this.aClass22_Sub2_1.aClass174_1.method4277(this);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
	private void method601() {
		this.aClass22_Sub2_1.aClass22_Sub3_1.aClass22_Sub1_Sub1Array2[this.aShort12] = null;
		Static52.aClass22_Sub1_Sub1Array1[Static52.anInt1129] = this;
		Static52.anInt1129 = Static52.anInt1129 + 1 & 0x3FF;
		this.aClass22_Sub2_1 = null;
		this.method946();
		this.method599();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ci;IIIIIIIII)V")
	public void method602(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass22_Sub2_1 = arg0;
		this.anInt647 = arg1 << Static33.anInt643;
		this.anInt645 = arg2 << Static33.anInt643;
		this.anInt649 = arg3 << Static33.anInt643;
		this.anInt646 = arg9;
		this.aShort10 = this.aShort9 = (short) arg8;
		this.aShort13 = (short) arg4;
		this.aShort11 = (short) arg5;
		this.aShort8 = (short) arg6;
		this.anInt644 = arg7;
		this.method600();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V")
	public void method603(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass22_Sub2_1 == null) {
			return;
		}
		this.aShort9 = (short) (this.aShort9 - arg1);
		if (this.aShort9 <= 0) {
			this.method601();
			return;
		}
		@Pc(21) int local21 = this.anInt647 >> Static33.anInt643;
		@Pc(26) int local26 = this.anInt645 >> Static33.anInt643;
		@Pc(31) int local31 = this.anInt649 >> Static33.anInt643;
		@Pc(35) Class22_Sub3 local35 = this.aClass22_Sub2_1.aClass22_Sub3_1;
		@Pc(39) Class2 local39 = this.aClass22_Sub2_1.aClass2_1;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt99 != 0) {
			if (this.aShort10 - this.aShort9 <= local39.anInt89) {
				local69 = (this.anInt646 >> 8 & 0xFF00) + (this.anInt648 >> 16 & 0xFF) + local39.anInt73 * arg1;
				local86 = (this.anInt646 & 0xFF00) + (this.anInt648 >> 8 & 0xFF) + local39.anInt85 * arg1;
				local103 = ((this.anInt646 & 0xFF) << 8) + (this.anInt648 & 0xFF) + local39.anInt68 * arg1;
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
				this.anInt646 &= 0xFF000000;
				this.anInt646 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt648 &= 0xFF000000;
				this.anInt648 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort10 - this.aShort9 <= local39.anInt62) {
				local69 = (this.anInt646 >> 16 & 0xFF00) + (this.anInt648 >> 24 & 0xFF) + local39.anInt69 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt646 &= 0xFFFFFF;
				this.anInt646 |= (local69 & 0xFF00) << 16;
				this.anInt648 &= 0xFFFFFF;
				this.anInt648 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt81 != -1 && this.aShort10 - this.aShort9 <= local39.anInt75) {
			this.anInt644 += local39.anInt74 * arg1;
		}
		local69 = this.aShort13;
		local86 = this.aShort11;
		local103 = this.aShort8;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt76 == 1) {
			local296 = local21 - this.aClass22_Sub2_1.anInt756;
			local302 = local26 - this.aClass22_Sub2_1.anInt758;
			local308 = local31 - this.aClass22_Sub2_1.anInt762;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt57 * local323 * arg1;
			this.anInt644 = (int) ((long) this.anInt644 - ((long) this.anInt644 * local331 >> 18));
		} else if (local39.anInt76 == 2) {
			local296 = local21 - this.aClass22_Sub2_1.anInt756;
			local302 = local26 - this.aClass22_Sub2_1.anInt758;
			local308 = local31 - this.aClass22_Sub2_1.anInt762;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt57 * local323 * arg1;
			this.anInt644 = (int) ((long) this.anInt644 - ((long) this.anInt644 * local331 >> 28));
		}
		@Pc(406) Class1 local406 = local35.aClass96_4.aClass1_109;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class1_Sub5_Sub22 local415;
		@Pc(419) Class143 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class1 local409 = local406.aClass1_235; local409 != local406; local409 = local409.aClass1_235) {
			local415 = (Class1_Sub5_Sub22) local409;
			local419 = local415.aClass76_1.aClass143_1;
			if (local419.anInt4280 != 1) {
				local429 = local21 - local415.anInt5203;
				local434 = local26 - local415.anInt5200;
				local439 = local31 - local415.anInt5195;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong164) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt5192 + local434 * local419.anInt4286 + local439 * local415.anInt5202) * 65535L / (long) (local419.anInt4287 * local463);
					if (local491 >= (long) local419.anInt4268) {
						local500 = 0;
						if (local419.anInt4285 == 1) {
							local500 = (local463 >> 4) * local419.anInt4278;
						} else if (local419.anInt4285 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt4278;
						}
						if (local419.anInt4284 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt4287;
							local615 = (local434 << 15) / local463 * local419.anInt4287;
							local624 = (local439 << 15) / local463 * local419.anInt4287;
							if (local419.anInt4269 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt647 += local606 * arg1 >> 15;
								this.anInt645 += local615 * arg1 >> 15;
								this.anInt649 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt4269 == 0) {
							local69 += (local415.anInt5192 - local500) * arg1;
							local86 += (local419.anInt4286 - local500) * arg1;
							local103 += (local415.anInt5202 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt647 += (local415.anInt5192 - local500) * arg1;
							this.anInt645 += (local419.anInt4286 - local500) * arg1;
							this.anInt649 += (local415.anInt5202 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray7 != null) {
			for (local302 = 0; local302 < local39.anIntArray7.length; local302++) {
				local415 = (Class1_Sub5_Sub22) Static52.aClass139_1.method3588((long) local39.anIntArray7[local302]);
				while (local415 != null) {
					local419 = local415.aClass76_1.aClass143_1;
					local429 = local21 - local415.anInt5203;
					local434 = local26 - local415.anInt5200;
					local439 = local31 - local415.anInt5195;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong164) {
						local415 = (Class1_Sub5_Sub22) Static52.aClass139_1.method3595();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt5192 + local434 * local419.anInt4286 + local439 * local415.anInt5202) * 65535L / (long) (local419.anInt4287 * local463);
						if (local491 < (long) local419.anInt4268) {
							local415 = (Class1_Sub5_Sub22) Static52.aClass139_1.method3595();
						} else {
							local500 = 0;
							if (local419.anInt4285 == 1) {
								local500 = (local463 >> 4) * local419.anInt4278;
							} else if (local419.anInt4285 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt4278;
							}
							if (local419.anInt4284 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt4287;
								local615 = (local434 << 15) / local463 * local419.anInt4287;
								local624 = (local439 << 15) / local463 * local419.anInt4287;
								if (local419.anInt4269 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt647 += local606 * arg1 >> 15;
									this.anInt645 += local615 * arg1 >> 15;
									this.anInt649 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt4269 == 0) {
								local69 += (local415.anInt5192 - local500) * arg1;
								local86 += (local419.anInt4286 - local500) * arg1;
								local103 += (local415.anInt5202 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt647 += (local415.anInt5192 - local500) * arg1;
								this.anInt645 += (local419.anInt4286 - local500) * arg1;
								this.anInt649 += (local415.anInt5202 - local500) * arg1;
							}
							local415 = (Class1_Sub5_Sub22) Static52.aClass139_1.method3595();
						}
					}
				}
			}
		}
		if (local39.anIntArray6 != null) {
			if (local39.anIntArray5 == null) {
				local39.anIntArray5 = new int[local39.anIntArray6.length];
				for (local302 = 0; local302 < local39.anIntArray6.length; local302++) {
					Static179.method3044(local39.anIntArray6[local302]);
					local39.anIntArray5[local302] = ((Class1_Sub22) Static25.aClass86_33.method2136((long) local39.anIntArray6[local302])).anInt3973;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray5.length; local302++) {
				@Pc(1048) Class143 local1048 = Static183.aClass143Array1[local39.anIntArray5[local302]];
				if (local1048.anInt4269 == 0) {
					local69 += local1048.anInt4267 * arg1;
					local86 += local1048.anInt4286 * arg1;
					local103 += local1048.anInt4283 * arg1;
					local286 = true;
				} else {
					this.anInt647 += local1048.anInt4267 * arg1;
					this.anInt645 += local1048.anInt4286 * arg1;
					this.anInt649 += local1048.anInt4283 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort13 = (short) local69;
					this.aShort11 = (short) local86;
					this.aShort8 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt644 <<= 0x1;
			}
		}
		this.anInt647 = (int) ((long) this.anInt647 + ((long) this.aShort13 * (long) this.anInt644 >> 23) * (long) arg1);
		this.anInt645 = (int) ((long) this.anInt645 + ((long) this.aShort11 * (long) this.anInt644 >> 23) * (long) arg1);
		this.anInt649 = (int) ((long) this.anInt649 + ((long) this.aShort8 * (long) this.anInt644 >> 23) * (long) arg1);
		local302 = this.anInt647 >> 19;
		local308 = this.anInt649 >> 19;
		local26 = this.anInt645 >> Static33.anInt643;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static220.anInt4129 || local308 < 0 || local308 >= Static298.anInt5372) {
			this.method601();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static280.anIntArrayArrayArray13;
		local429 = local1247[local35.anInt1148][local302][local308];
		if (local35.anInt1148 < 3) {
			local434 = local1247[local35.anInt1148 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt1148][local302][local308] - 1024;
		}
		if (local39.aBoolean10) {
			if (local39.anInt77 == -1 && local26 > local429) {
				this.method601();
				return;
			}
			if (local39.anInt77 >= 0 && local26 > local1247[local39.anInt77][local302][local308]) {
				this.method601();
				return;
			}
			if (local39.anInt98 == -1 && local26 < local434) {
				this.method601();
				return;
			}
			if (local39.anInt98 >= 0 && local26 < local1247[local39.anInt98 + 1][local302][local308]) {
				this.method601();
				return;
			}
		}
		if (local302 >= local35.anInt1141 && local302 <= local35.anInt1150 && local308 >= local35.anInt1145 && local308 <= local35.anInt1142 && local26 <= local35.anInt1151 && local26 >= local35.anInt1140) {
			this.aBoolean69 = false;
			return;
		}
		this.aBoolean69 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method601();
			return;
		}
		@Pc(1427) Class1_Sub16 local1427 = Static254.aClass1_Sub16ArrayArrayArray3[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static254.aClass1_Sub16ArrayArrayArray3[local1369][local302][local308] = new Class1_Sub16(local1369, local302, local308);
		}
		if (local1427.aClass191_1 == null) {
			local1427.aClass191_1 = new Class191();
			local1427.aByte7 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte7 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass191_1.method4665();
			local1427.aByte7 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass191_1.method4659(this);
	}
}
