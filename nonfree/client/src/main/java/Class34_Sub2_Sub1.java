import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class34_Sub2_Sub1 extends Class34_Sub2 {

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
	private int anInt2126;

	@OriginalMember(owner = "client!gm", name = "F", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "Lclient!ub;")
	public Class34_Sub3 aClass34_Sub3_1;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
	public int anInt2120;

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
	public int anInt2122;

	@OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
	public int anInt2124;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
	public int anInt2123;

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!gm", name = "R", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!gm", name = "O", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!gm", name = "T", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
	private int anInt2121;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!ub;IIIIIIIII)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class34_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass34_Sub3_1 = arg0;
		this.anInt2120 = arg1 << Static92.anInt2125;
		this.anInt2122 = arg2 << Static92.anInt2125;
		this.anInt2124 = arg3 << Static92.anInt2125;
		this.anInt2123 = arg9;
		this.aShort36 = this.aShort33 = (short) arg8;
		this.aShort34 = (short) arg4;
		this.aShort37 = (short) arg5;
		this.aShort35 = (short) arg6;
		this.anInt2121 = arg7;
		this.method1573();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(JI)V")
	public void method1572(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass34_Sub3_1 == null) {
			return;
		}
		this.aShort33 = (short) (this.aShort33 - arg1);
		if (this.aShort33 <= 0) {
			this.method1574();
			return;
		}
		@Pc(21) int local21 = this.anInt2120 >> Static92.anInt2125;
		@Pc(26) int local26 = this.anInt2122 >> Static92.anInt2125;
		@Pc(31) int local31 = this.anInt2124 >> Static92.anInt2125;
		@Pc(35) Class34_Sub1 local35 = this.aClass34_Sub3_1.aClass34_Sub1_7;
		@Pc(39) Class18 local39 = this.aClass34_Sub3_1.aClass18_2;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt507 != 0) {
			if (this.aShort36 - this.aShort33 <= local39.anInt478) {
				local69 = (this.anInt2123 >> 8 & 0xFF00) + (this.anInt2126 >> 16 & 0xFF) + local39.anInt525 * arg1;
				local86 = (this.anInt2123 & 0xFF00) + (this.anInt2126 >> 8 & 0xFF) + local39.anInt487 * arg1;
				local103 = ((this.anInt2123 & 0xFF) << 8) + (this.anInt2126 & 0xFF) + local39.anInt496 * arg1;
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
				this.anInt2123 &= 0xFF000000;
				this.anInt2123 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt2126 &= 0xFF000000;
				this.anInt2126 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort36 - this.aShort33 <= local39.anInt509) {
				local69 = (this.anInt2123 >> 16 & 0xFF00) + (this.anInt2126 >> 24 & 0xFF) + local39.anInt504 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt2123 &= 0xFFFFFF;
				this.anInt2123 |= (local69 & 0xFF00) << 16;
				this.anInt2126 &= 0xFFFFFF;
				this.anInt2126 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt528 != -1 && this.aShort36 - this.aShort33 <= local39.anInt523) {
			this.anInt2121 += local39.anInt513 * arg1;
		}
		local69 = this.aShort34;
		local86 = this.aShort37;
		local103 = this.aShort35;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt501 == 1) {
			local296 = local21 - this.aClass34_Sub3_1.anInt5524;
			local302 = local26 - this.aClass34_Sub3_1.anInt5544;
			local308 = local31 - this.aClass34_Sub3_1.anInt5546;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt499 * local323 * arg1;
			this.anInt2121 = (int) ((long) this.anInt2121 - ((long) this.anInt2121 * local331 >> 18));
		} else if (local39.anInt501 == 2) {
			local296 = local21 - this.aClass34_Sub3_1.anInt5524;
			local302 = local26 - this.aClass34_Sub3_1.anInt5544;
			local308 = local31 - this.aClass34_Sub3_1.anInt5546;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt499 * local323 * arg1;
			this.anInt2121 = (int) ((long) this.anInt2121 - ((long) this.anInt2121 * local331 >> 28));
		}
		@Pc(406) Class1 local406 = local35.aClass26_7.aClass1_23;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class1_Sub3_Sub16 local415;
		@Pc(419) Class98 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class1 local409 = local406.aClass1_233; local409 != local406; local409 = local409.aClass1_233) {
			local415 = (Class1_Sub3_Sub16) local409;
			local419 = local415.aClass86_1.aClass98_1;
			if (local419.anInt3506 != 1) {
				local429 = local21 - local415.anInt4256;
				local434 = local26 - local415.anInt4257;
				local439 = local31 - local415.anInt4242;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong111) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt4252 + local434 * local419.anInt3505 + local439 * local415.anInt4246) * 65535L / (long) (local419.anInt3517 * local463);
					if (local491 >= (long) local419.anInt3510) {
						local500 = 0;
						if (local419.anInt3520 == 1) {
							local500 = (local463 >> 4) * local419.anInt3522;
						} else if (local419.anInt3520 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt3522;
						}
						if (local419.anInt3521 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt3517;
							local615 = (local434 << 15) / local463 * local419.anInt3517;
							local624 = (local439 << 15) / local463 * local419.anInt3517;
							if (local419.anInt3516 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt2120 += local606 * arg1 >> 15;
								this.anInt2122 += local615 * arg1 >> 15;
								this.anInt2124 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt3516 == 0) {
							local69 += (local415.anInt4252 - local500) * arg1;
							local86 += (local419.anInt3505 - local500) * arg1;
							local103 += (local415.anInt4246 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt2120 += (local415.anInt4252 - local500) * arg1;
							this.anInt2122 += (local419.anInt3505 - local500) * arg1;
							this.anInt2124 += (local415.anInt4246 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray47 != null) {
			for (local302 = 0; local302 < local39.anIntArray47.length; local302++) {
				local415 = (Class1_Sub3_Sub16) Static42.aClass110_1.method2814((long) local39.anIntArray47[local302]);
				while (local415 != null) {
					local419 = local415.aClass86_1.aClass98_1;
					local429 = local21 - local415.anInt4256;
					local434 = local26 - local415.anInt4257;
					local439 = local31 - local415.anInt4242;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong111) {
						local415 = (Class1_Sub3_Sub16) Static42.aClass110_1.method2822();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt4252 + local434 * local419.anInt3505 + local439 * local415.anInt4246) * 65535L / (long) (local419.anInt3517 * local463);
						if (local491 < (long) local419.anInt3510) {
							local415 = (Class1_Sub3_Sub16) Static42.aClass110_1.method2822();
						} else {
							local500 = 0;
							if (local419.anInt3520 == 1) {
								local500 = (local463 >> 4) * local419.anInt3522;
							} else if (local419.anInt3520 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt3522;
							}
							if (local419.anInt3521 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt3517;
								local615 = (local434 << 15) / local463 * local419.anInt3517;
								local624 = (local439 << 15) / local463 * local419.anInt3517;
								if (local419.anInt3516 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt2120 += local606 * arg1 >> 15;
									this.anInt2122 += local615 * arg1 >> 15;
									this.anInt2124 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt3516 == 0) {
								local69 += (local415.anInt4252 - local500) * arg1;
								local86 += (local419.anInt3505 - local500) * arg1;
								local103 += (local415.anInt4246 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt2120 += (local415.anInt4252 - local500) * arg1;
								this.anInt2122 += (local419.anInt3505 - local500) * arg1;
								this.anInt2124 += (local415.anInt4246 - local500) * arg1;
							}
							local415 = (Class1_Sub3_Sub16) Static42.aClass110_1.method2822();
						}
					}
				}
			}
		}
		if (local39.anIntArray48 != null) {
			if (local39.anIntArray46 == null) {
				local39.anIntArray46 = new int[local39.anIntArray48.length];
				for (local302 = 0; local302 < local39.anIntArray48.length; local302++) {
					Static85.method1464(local39.anIntArray48[local302]);
					local39.anIntArray46[local302] = ((Class1_Sub17) Static6.aClass186_1.method4570((long) local39.anIntArray48[local302])).anInt3669;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray46.length; local302++) {
				@Pc(1048) Class98 local1048 = Static40.aClass98Array1[local39.anIntArray46[local302]];
				if (local1048.anInt3516 == 0) {
					local69 += local1048.anInt3519 * arg1;
					local86 += local1048.anInt3505 * arg1;
					local103 += local1048.anInt3523 * arg1;
					local286 = true;
				} else {
					this.anInt2120 += local1048.anInt3519 * arg1;
					this.anInt2122 += local1048.anInt3505 * arg1;
					this.anInt2124 += local1048.anInt3523 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort34 = (short) local69;
					this.aShort37 = (short) local86;
					this.aShort35 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt2121 <<= 0x1;
			}
		}
		this.anInt2120 = (int) ((long) this.anInt2120 + ((long) this.aShort34 * (long) this.anInt2121 >> 23) * (long) arg1);
		this.anInt2122 = (int) ((long) this.anInt2122 + ((long) this.aShort37 * (long) this.anInt2121 >> 23) * (long) arg1);
		this.anInt2124 = (int) ((long) this.anInt2124 + ((long) this.aShort35 * (long) this.anInt2121 >> 23) * (long) arg1);
		local302 = this.anInt2120 >> 19;
		local308 = this.anInt2124 >> 19;
		local26 = this.anInt2122 >> Static92.anInt2125;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static90.anInt2091 || local308 < 0 || local308 >= Static77.anInt1766) {
			this.method1574();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static46.anIntArrayArrayArray1;
		local429 = local1247[local35.anInt1044][local302][local308];
		if (local35.anInt1044 < 3) {
			local434 = local1247[local35.anInt1044 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt1044][local302][local308] - 1024;
		}
		if (local39.aBoolean28) {
			if (local39.anInt497 == -1 && local26 > local429) {
				this.method1574();
				return;
			}
			if (local39.anInt497 >= 0 && local26 > local1247[local39.anInt497][local302][local308]) {
				this.method1574();
				return;
			}
			if (local39.anInt519 == -1 && local26 < local434) {
				this.method1574();
				return;
			}
			if (local39.anInt519 >= 0 && local26 < local1247[local39.anInt519 + 1][local302][local308]) {
				this.method1574();
				return;
			}
		}
		if (local302 >= local35.anInt1039 && local302 <= local35.anInt1045 && local308 >= local35.anInt1048 && local308 <= local35.anInt1051 && local26 <= local35.anInt1043 && local26 >= local35.anInt1049) {
			this.aBoolean142 = false;
			return;
		}
		this.aBoolean142 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method1574();
			return;
		}
		@Pc(1427) Class1_Sub2 local1427 = Static7.aClass1_Sub2ArrayArrayArray1[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static7.aClass1_Sub2ArrayArrayArray1[local1369][local302][local308] = new Class1_Sub2(local1369, local302, local308);
		}
		if (local1427.aClass179_1 == null) {
			local1427.aClass179_1 = new Class179();
			local1427.aByte1 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte1 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass179_1.method4441();
			local1427.aByte1 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass179_1.method4439(this);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
	private void method1573() {
		@Pc(4) int local4 = this.aClass34_Sub3_1.aClass34_Sub1_7.anInt1033;
		if (this.aClass34_Sub3_1.aClass34_Sub1_7.aClass34_Sub2_Sub1Array1[local4] != null) {
			this.aClass34_Sub3_1.aClass34_Sub1_7.aClass34_Sub2_Sub1Array1[local4].method1574();
		}
		this.aClass34_Sub3_1.aClass34_Sub1_7.aClass34_Sub2_Sub1Array1[local4] = this;
		this.aShort32 = (short) this.aClass34_Sub3_1.aClass34_Sub1_7.anInt1033;
		this.aClass34_Sub3_1.aClass34_Sub1_7.anInt1033 = local4 + 1 & 0x1FFF;
		this.aClass34_Sub3_1.aClass138_3.method3533(this);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()V")
	private void method1574() {
		this.aClass34_Sub3_1.aClass34_Sub1_7.aClass34_Sub2_Sub1Array1[this.aShort32] = null;
		Static42.aClass34_Sub2_Sub1Array2[Static42.anInt1032] = this;
		Static42.anInt1032 = Static42.anInt1032 + 1 & 0x3FF;
		this.aClass34_Sub3_1 = null;
		this.method4182();
		this.method1567();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ub;IIIIIIIII)V")
	public void method1575(@OriginalArg(0) Class34_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass34_Sub3_1 = arg0;
		this.anInt2120 = arg1 << Static92.anInt2125;
		this.anInt2122 = arg2 << Static92.anInt2125;
		this.anInt2124 = arg3 << Static92.anInt2125;
		this.anInt2123 = arg9;
		this.aShort36 = this.aShort33 = (short) arg8;
		this.aShort34 = (short) arg4;
		this.aShort37 = (short) arg5;
		this.aShort35 = (short) arg6;
		this.anInt2121 = arg7;
		this.method1573();
	}
}
