import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class87_Sub1_Sub1 extends Class87_Sub1 {

	@OriginalMember(owner = "client!v", name = "v", descriptor = "S")
	public short aShort48;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	private int anInt5212;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Z")
	public boolean aBoolean356 = false;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Lclient!va;")
	public Class87_Sub3 aClass87_Sub3_1;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	public int anInt5211;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "I")
	public int anInt5210;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public int anInt5214;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	public int anInt5215;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	private int anInt5209;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!va;IIIIIIIII)V")
	public Class87_Sub1_Sub1(@OriginalArg(0) Class87_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass87_Sub3_1 = arg0;
		this.anInt5211 = arg1 << Static291.anInt5213;
		this.anInt5210 = arg2 << Static291.anInt5213;
		this.anInt5214 = arg3 << Static291.anInt5213;
		this.anInt5215 = arg9;
		this.aShort53 = this.aShort49 = (short) arg8;
		this.aShort51 = (short) arg4;
		this.aShort52 = (short) arg5;
		this.aShort50 = (short) arg6;
		this.anInt5209 = arg7;
		this.method4454();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	private void method4451() {
		this.aClass87_Sub3_1.aClass87_Sub2_6.aClass87_Sub1_Sub1Array2[this.aShort48] = null;
		Static158.aClass87_Sub1_Sub1Array1[Static158.anInt3107] = this;
		Static158.anInt3107 = Static158.anInt3107 + 1 & 0x3FF;
		this.aClass87_Sub3_1 = null;
		this.method4455();
		this.method4449();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!va;IIIIIIIII)V")
	public void method4452(@OriginalArg(0) Class87_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass87_Sub3_1 = arg0;
		this.anInt5211 = arg1 << Static291.anInt5213;
		this.anInt5210 = arg2 << Static291.anInt5213;
		this.anInt5214 = arg3 << Static291.anInt5213;
		this.anInt5215 = arg9;
		this.aShort53 = this.aShort49 = (short) arg8;
		this.aShort51 = (short) arg4;
		this.aShort52 = (short) arg5;
		this.aShort50 = (short) arg6;
		this.anInt5209 = arg7;
		this.method4454();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
	public void method4453(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass87_Sub3_1 == null) {
			return;
		}
		this.aShort49 = (short) (this.aShort49 - arg1);
		if (this.aShort49 <= 0) {
			this.method4451();
			return;
		}
		@Pc(21) int local21 = this.anInt5211 >> Static291.anInt5213;
		@Pc(26) int local26 = this.anInt5210 >> Static291.anInt5213;
		@Pc(31) int local31 = this.anInt5214 >> Static291.anInt5213;
		@Pc(35) Class87_Sub2 local35 = this.aClass87_Sub3_1.aClass87_Sub2_6;
		@Pc(39) Class165 local39 = this.aClass87_Sub3_1.aClass165_2;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt4791 != 0) {
			if (this.aShort53 - this.aShort49 <= local39.anInt4814) {
				local69 = (this.anInt5215 >> 8 & 0xFF00) + (this.anInt5212 >> 16 & 0xFF) + local39.anInt4795 * arg1;
				local86 = (this.anInt5215 & 0xFF00) + (this.anInt5212 >> 8 & 0xFF) + local39.anInt4775 * arg1;
				local103 = ((this.anInt5215 & 0xFF) << 8) + (this.anInt5212 & 0xFF) + local39.anInt4807 * arg1;
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
				this.anInt5215 &= 0xFF000000;
				this.anInt5215 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt5212 &= 0xFF000000;
				this.anInt5212 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort53 - this.aShort49 <= local39.anInt4799) {
				local69 = (this.anInt5215 >> 16 & 0xFF00) + (this.anInt5212 >> 24 & 0xFF) + local39.anInt4821 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt5215 &= 0xFFFFFF;
				this.anInt5215 |= (local69 & 0xFF00) << 16;
				this.anInt5212 &= 0xFFFFFF;
				this.anInt5212 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt4796 != -1 && this.aShort53 - this.aShort49 <= local39.anInt4804) {
			this.anInt5209 += local39.anInt4823 * arg1;
		}
		local69 = this.aShort51;
		local86 = this.aShort52;
		local103 = this.aShort50;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt4808 == 1) {
			local296 = local21 - this.aClass87_Sub3_1.anInt5237;
			local302 = local26 - this.aClass87_Sub3_1.anInt5233;
			local308 = local31 - this.aClass87_Sub3_1.anInt5239;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt4783 * local323 * arg1;
			this.anInt5209 = (int) ((long) this.anInt5209 - ((long) this.anInt5209 * local331 >> 18));
		} else if (local39.anInt4808 == 2) {
			local296 = local21 - this.aClass87_Sub3_1.anInt5237;
			local302 = local26 - this.aClass87_Sub3_1.anInt5233;
			local308 = local31 - this.aClass87_Sub3_1.anInt5239;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt4783 * local323 * arg1;
			this.anInt5209 = (int) ((long) this.anInt5209 - ((long) this.anInt5209 * local331 >> 28));
		}
		@Pc(406) Class1 local406 = local35.aClass59_25.aClass1_83;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class1_Sub2_Sub23 local415;
		@Pc(419) Class5 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class1 local409 = local406.aClass1_235; local409 != local406; local409 = local409.aClass1_235) {
			local415 = (Class1_Sub2_Sub23) local409;
			local419 = local415.aClass176_1.aClass5_1;
			if (local419.anInt38 != 1) {
				local429 = local21 - local415.anInt5260;
				local434 = local26 - local415.anInt5271;
				local439 = local31 - local415.anInt5262;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong3) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt5265 + local434 * local419.anInt47 + local439 * local415.anInt5269) * 65535L / (long) (local419.anInt39 * local463);
					if (local491 >= (long) local419.anInt45) {
						local500 = 0;
						if (local419.anInt50 == 1) {
							local500 = (local463 >> 4) * local419.anInt37;
						} else if (local419.anInt50 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt37;
						}
						if (local419.anInt52 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt39;
							local615 = (local434 << 15) / local463 * local419.anInt39;
							local624 = (local439 << 15) / local463 * local419.anInt39;
							if (local419.anInt42 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt5211 += local606 * arg1 >> 15;
								this.anInt5210 += local615 * arg1 >> 15;
								this.anInt5214 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt42 == 0) {
							local69 += (local415.anInt5265 - local500) * arg1;
							local86 += (local419.anInt47 - local500) * arg1;
							local103 += (local415.anInt5269 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt5211 += (local415.anInt5265 - local500) * arg1;
							this.anInt5210 += (local419.anInt47 - local500) * arg1;
							this.anInt5214 += (local415.anInt5269 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray424 != null) {
			for (local302 = 0; local302 < local39.anIntArray424.length; local302++) {
				local415 = (Class1_Sub2_Sub23) Static158.aClass73_1.method2104((long) local39.anIntArray424[local302]);
				while (local415 != null) {
					local419 = local415.aClass176_1.aClass5_1;
					local429 = local21 - local415.anInt5260;
					local434 = local26 - local415.anInt5271;
					local439 = local31 - local415.anInt5262;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong3) {
						local415 = (Class1_Sub2_Sub23) Static158.aClass73_1.method2102();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt5265 + local434 * local419.anInt47 + local439 * local415.anInt5269) * 65535L / (long) (local419.anInt39 * local463);
						if (local491 < (long) local419.anInt45) {
							local415 = (Class1_Sub2_Sub23) Static158.aClass73_1.method2102();
						} else {
							local500 = 0;
							if (local419.anInt50 == 1) {
								local500 = (local463 >> 4) * local419.anInt37;
							} else if (local419.anInt50 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt37;
							}
							if (local419.anInt52 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt39;
								local615 = (local434 << 15) / local463 * local419.anInt39;
								local624 = (local439 << 15) / local463 * local419.anInt39;
								if (local419.anInt42 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt5211 += local606 * arg1 >> 15;
									this.anInt5210 += local615 * arg1 >> 15;
									this.anInt5214 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt42 == 0) {
								local69 += (local415.anInt5265 - local500) * arg1;
								local86 += (local419.anInt47 - local500) * arg1;
								local103 += (local415.anInt5269 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt5211 += (local415.anInt5265 - local500) * arg1;
								this.anInt5210 += (local419.anInt47 - local500) * arg1;
								this.anInt5214 += (local415.anInt5269 - local500) * arg1;
							}
							local415 = (Class1_Sub2_Sub23) Static158.aClass73_1.method2102();
						}
					}
				}
			}
		}
		if (local39.anIntArray422 != null) {
			if (local39.anIntArray423 == null) {
				local39.anIntArray423 = new int[local39.anIntArray422.length];
				for (local302 = 0; local302 < local39.anIntArray422.length; local302++) {
					Static100.method1811(local39.anIntArray422[local302]);
					local39.anIntArray423[local302] = ((Class1_Sub1) Static250.aClass142_23.method3543((long) local39.anIntArray422[local302])).anInt12;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray423.length; local302++) {
				@Pc(1048) Class5 local1048 = Static251.aClass5Array1[local39.anIntArray423[local302]];
				if (local1048.anInt42 == 0) {
					local69 += local1048.anInt46 * arg1;
					local86 += local1048.anInt47 * arg1;
					local103 += local1048.anInt40 * arg1;
					local286 = true;
				} else {
					this.anInt5211 += local1048.anInt46 * arg1;
					this.anInt5210 += local1048.anInt47 * arg1;
					this.anInt5214 += local1048.anInt40 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort51 = (short) local69;
					this.aShort52 = (short) local86;
					this.aShort50 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt5209 <<= 0x1;
			}
		}
		this.anInt5211 = (int) ((long) this.anInt5211 + ((long) this.aShort51 * (long) this.anInt5209 >> 23) * (long) arg1);
		this.anInt5210 = (int) ((long) this.anInt5210 + ((long) this.aShort52 * (long) this.anInt5209 >> 23) * (long) arg1);
		this.anInt5214 = (int) ((long) this.anInt5214 + ((long) this.aShort50 * (long) this.anInt5209 >> 23) * (long) arg1);
		local302 = this.anInt5211 >> 19;
		local308 = this.anInt5214 >> 19;
		local26 = this.anInt5210 >> Static291.anInt5213;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static153.anInt3006 || local308 < 0 || local308 >= Static285.anInt5122) {
			this.method4451();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static24.anIntArrayArrayArray2;
		local429 = local1247[local35.anInt3126][local302][local308];
		if (local35.anInt3126 < 3) {
			local434 = local1247[local35.anInt3126 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt3126][local302][local308] - 1024;
		}
		if (local39.aBoolean330) {
			if (local39.anInt4815 == -1 && local26 > local429) {
				this.method4451();
				return;
			}
			if (local39.anInt4815 >= 0 && local26 > local1247[local39.anInt4815][local302][local308]) {
				this.method4451();
				return;
			}
			if (local39.anInt4782 == -1 && local26 < local434) {
				this.method4451();
				return;
			}
			if (local39.anInt4782 >= 0 && local26 < local1247[local39.anInt4782 + 1][local302][local308]) {
				this.method4451();
				return;
			}
		}
		if (local302 >= local35.anInt3127 && local302 <= local35.anInt3129 && local308 >= local35.anInt3124 && local308 <= local35.anInt3128 && local26 <= local35.anInt3130 && local26 >= local35.anInt3118) {
			this.aBoolean356 = false;
			return;
		}
		this.aBoolean356 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method4451();
			return;
		}
		@Pc(1427) Class1_Sub33 local1427 = Static105.aClass1_Sub33ArrayArrayArray2[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static105.aClass1_Sub33ArrayArrayArray2[local1369][local302][local308] = new Class1_Sub33(local1369, local302, local308);
		}
		if (local1427.aClass166_1 == null) {
			local1427.aClass166_1 = new Class166();
			local1427.aByte28 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte28 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass166_1.method4158();
			local1427.aByte28 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass166_1.method4156(this);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
	private void method4454() {
		@Pc(4) int local4 = this.aClass87_Sub3_1.aClass87_Sub2_6.anInt3108;
		if (this.aClass87_Sub3_1.aClass87_Sub2_6.aClass87_Sub1_Sub1Array2[local4] != null) {
			this.aClass87_Sub3_1.aClass87_Sub2_6.aClass87_Sub1_Sub1Array2[local4].method4451();
		}
		this.aClass87_Sub3_1.aClass87_Sub2_6.aClass87_Sub1_Sub1Array2[local4] = this;
		this.aShort48 = (short) this.aClass87_Sub3_1.aClass87_Sub2_6.anInt3108;
		this.aClass87_Sub3_1.aClass87_Sub2_6.anInt3108 = local4 + 1 & 0x1FFF;
		this.aClass87_Sub3_1.aClass141_3.method3478(this);
	}
}
