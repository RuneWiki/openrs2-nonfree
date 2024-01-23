import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class20_Sub2_Sub1 extends Class20_Sub2 {

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	private int anInt3232;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "S")
	public short aShort21;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "Lclient!bi;")
	public Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	public int anInt3228;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt3229;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public int anInt3230;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public int anInt3231;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	private int anInt3233;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!bi;IIIIIIIII)V")
	public Class20_Sub2_Sub1(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass20_Sub1_1 = arg0;
		this.anInt3228 = arg1 << Static163.anInt3227;
		this.anInt3229 = arg2 << Static163.anInt3227;
		this.anInt3230 = arg3 << Static163.anInt3227;
		this.anInt3231 = arg9;
		this.aShort22 = this.aShort20 = (short) arg8;
		this.aShort19 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort24 = (short) arg6;
		this.anInt3233 = arg7;
		this.method2644();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(JI)V")
	public void method2642(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass20_Sub1_1 == null) {
			return;
		}
		this.aShort20 = (short) (this.aShort20 - arg1);
		if (this.aShort20 <= 0) {
			this.method2643();
			return;
		}
		@Pc(21) int local21 = this.anInt3228 >> Static163.anInt3227;
		@Pc(26) int local26 = this.anInt3229 >> Static163.anInt3227;
		@Pc(31) int local31 = this.anInt3230 >> Static163.anInt3227;
		@Pc(35) Class20_Sub3 local35 = this.aClass20_Sub1_1.aClass20_Sub3_1;
		@Pc(39) Class90 local39 = this.aClass20_Sub1_1.aClass90_1;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt2408 != 0) {
			if (this.aShort22 - this.aShort20 <= local39.anInt2414) {
				local69 = (this.anInt3231 >> 8 & 0xFF00) + (this.anInt3232 >> 16 & 0xFF) + local39.anInt2407 * arg1;
				local86 = (this.anInt3231 & 0xFF00) + (this.anInt3232 >> 8 & 0xFF) + local39.anInt2409 * arg1;
				local103 = ((this.anInt3231 & 0xFF) << 8) + (this.anInt3232 & 0xFF) + local39.anInt2421 * arg1;
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
				this.anInt3231 &= 0xFF000000;
				this.anInt3231 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt3232 &= 0xFF000000;
				this.anInt3232 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort22 - this.aShort20 <= local39.anInt2410) {
				local69 = (this.anInt3231 >> 16 & 0xFF00) + (this.anInt3232 >> 24 & 0xFF) + local39.anInt2398 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt3231 &= 0xFFFFFF;
				this.anInt3231 |= (local69 & 0xFF00) << 16;
				this.anInt3232 &= 0xFFFFFF;
				this.anInt3232 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt2412 != -1 && this.aShort22 - this.aShort20 <= local39.anInt2427) {
			this.anInt3233 += local39.anInt2444 * arg1;
		}
		local69 = this.aShort19;
		local86 = this.aShort23;
		local103 = this.aShort24;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt2395 == 1) {
			local296 = local21 - this.aClass20_Sub1_1.anInt309;
			local302 = local26 - this.aClass20_Sub1_1.anInt312;
			local308 = local31 - this.aClass20_Sub1_1.anInt316;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt2419 * local323 * arg1;
			this.anInt3233 = (int) ((long) this.anInt3233 - ((long) this.anInt3233 * local331 >> 18));
		} else if (local39.anInt2395 == 2) {
			local296 = local21 - this.aClass20_Sub1_1.anInt309;
			local302 = local26 - this.aClass20_Sub1_1.anInt312;
			local308 = local31 - this.aClass20_Sub1_1.anInt316;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt2419 * local323 * arg1;
			this.anInt3233 = (int) ((long) this.anInt3233 - ((long) this.anInt3233 * local331 >> 28));
		}
		@Pc(406) Class4 local406 = local35.aClass114_24.aClass4_117;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class4_Sub3_Sub24 local415;
		@Pc(419) Class37 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class4 local409 = local406.aClass4_235; local409 != local406; local409 = local409.aClass4_235) {
			local415 = (Class4_Sub3_Sub24) local409;
			local419 = local415.aClass170_1.aClass37_1;
			if (local419.anInt907 != 1) {
				local429 = local21 - local415.anInt6099;
				local434 = local26 - local415.anInt6093;
				local439 = local31 - local415.anInt6091;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong39) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt6095 + local434 * local419.anInt903 + local439 * local415.anInt6092) * 65535L / (long) (local419.anInt904 * local463);
					if (local491 >= (long) local419.anInt906) {
						local500 = 0;
						if (local419.anInt895 == 1) {
							local500 = (local463 >> 4) * local419.anInt911;
						} else if (local419.anInt895 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt911;
						}
						if (local419.anInt905 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt904;
							local615 = (local434 << 15) / local463 * local419.anInt904;
							local624 = (local439 << 15) / local463 * local419.anInt904;
							if (local419.anInt908 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt3228 += local606 * arg1 >> 15;
								this.anInt3229 += local615 * arg1 >> 15;
								this.anInt3230 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt908 == 0) {
							local69 += (local415.anInt6095 - local500) * arg1;
							local86 += (local419.anInt903 - local500) * arg1;
							local103 += (local415.anInt6092 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt3228 += (local415.anInt6095 - local500) * arg1;
							this.anInt3229 += (local419.anInt903 - local500) * arg1;
							this.anInt3230 += (local415.anInt6092 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray216 != null) {
			for (local302 = 0; local302 < local39.anIntArray216.length; local302++) {
				local415 = (Class4_Sub3_Sub24) Static184.aClass10_1.method118((long) local39.anIntArray216[local302]);
				while (local415 != null) {
					local419 = local415.aClass170_1.aClass37_1;
					local429 = local21 - local415.anInt6099;
					local434 = local26 - local415.anInt6093;
					local439 = local31 - local415.anInt6091;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong39) {
						local415 = (Class4_Sub3_Sub24) Static184.aClass10_1.method117();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt6095 + local434 * local419.anInt903 + local439 * local415.anInt6092) * 65535L / (long) (local419.anInt904 * local463);
						if (local491 < (long) local419.anInt906) {
							local415 = (Class4_Sub3_Sub24) Static184.aClass10_1.method117();
						} else {
							local500 = 0;
							if (local419.anInt895 == 1) {
								local500 = (local463 >> 4) * local419.anInt911;
							} else if (local419.anInt895 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt911;
							}
							if (local419.anInt905 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt904;
								local615 = (local434 << 15) / local463 * local419.anInt904;
								local624 = (local439 << 15) / local463 * local419.anInt904;
								if (local419.anInt908 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt3228 += local606 * arg1 >> 15;
									this.anInt3229 += local615 * arg1 >> 15;
									this.anInt3230 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt908 == 0) {
								local69 += (local415.anInt6095 - local500) * arg1;
								local86 += (local419.anInt903 - local500) * arg1;
								local103 += (local415.anInt6092 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt3228 += (local415.anInt6095 - local500) * arg1;
								this.anInt3229 += (local419.anInt903 - local500) * arg1;
								this.anInt3230 += (local415.anInt6092 - local500) * arg1;
							}
							local415 = (Class4_Sub3_Sub24) Static184.aClass10_1.method117();
						}
					}
				}
			}
		}
		if (local39.anIntArray213 != null) {
			if (local39.anIntArray214 == null) {
				local39.anIntArray214 = new int[local39.anIntArray213.length];
				for (local302 = 0; local302 < local39.anIntArray213.length; local302++) {
					Static268.method4238(local39.anIntArray213[local302]);
					local39.anIntArray214[local302] = ((Class4_Sub32) Static187.aClass85_16.method1845((long) local39.anIntArray213[local302])).anInt5435;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray214.length; local302++) {
				@Pc(1048) Class37 local1048 = Static250.aClass37Array1[local39.anIntArray214[local302]];
				if (local1048.anInt908 == 0) {
					local69 += local1048.anInt898 * arg1;
					local86 += local1048.anInt903 * arg1;
					local103 += local1048.anInt892 * arg1;
					local286 = true;
				} else {
					this.anInt3228 += local1048.anInt898 * arg1;
					this.anInt3229 += local1048.anInt903 * arg1;
					this.anInt3230 += local1048.anInt892 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort19 = (short) local69;
					this.aShort23 = (short) local86;
					this.aShort24 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt3233 <<= 0x1;
			}
		}
		this.anInt3228 = (int) ((long) this.anInt3228 + ((long) this.aShort19 * (long) this.anInt3233 >> 23) * (long) arg1);
		this.anInt3229 = (int) ((long) this.anInt3229 + ((long) this.aShort23 * (long) this.anInt3233 >> 23) * (long) arg1);
		this.anInt3230 = (int) ((long) this.anInt3230 + ((long) this.aShort24 * (long) this.anInt3233 >> 23) * (long) arg1);
		local302 = this.anInt3228 >> 19;
		local308 = this.anInt3230 >> 19;
		local26 = this.anInt3229 >> Static163.anInt3227;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static300.anInt5636 || local308 < 0 || local308 >= Static299.anInt5591) {
			this.method2643();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static243.anIntArrayArrayArray13;
		local429 = local1247[local35.anInt3514][local302][local308];
		if (local35.anInt3514 < 3) {
			local434 = local1247[local35.anInt3514 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt3514][local302][local308] - 1024;
		}
		if (local39.aBoolean168) {
			if (local39.anInt2405 == -1 && local26 > local429) {
				this.method2643();
				return;
			}
			if (local39.anInt2405 >= 0 && local26 > local1247[local39.anInt2405][local302][local308]) {
				this.method2643();
				return;
			}
			if (local39.anInt2438 == -1 && local26 < local434) {
				this.method2643();
				return;
			}
			if (local39.anInt2438 >= 0 && local26 < local1247[local39.anInt2438 + 1][local302][local308]) {
				this.method2643();
				return;
			}
		}
		if (local302 >= local35.anInt3513 && local302 <= local35.anInt3521 && local308 >= local35.anInt3508 && local308 <= local35.anInt3515 && local26 <= local35.anInt3510 && local26 >= local35.anInt3520) {
			this.aBoolean228 = false;
			return;
		}
		this.aBoolean228 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method2643();
			return;
		}
		@Pc(1427) Class4_Sub19 local1427 = Static6.aClass4_Sub19ArrayArrayArray1[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static6.aClass4_Sub19ArrayArrayArray1[local1369][local302][local308] = new Class4_Sub19(local1369, local302, local308);
		}
		if (local1427.aClass110_1 == null) {
			local1427.aClass110_1 = new Class110();
			local1427.aByte14 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte14 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass110_1.method2464();
			local1427.aByte14 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass110_1.method2467(this);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	private void method2643() {
		this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[this.aShort21] = null;
		Static184.aClass20_Sub2_Sub1Array1[Static184.anInt3502] = this;
		Static184.anInt3502 = Static184.anInt3502 + 1 & 0x3FF;
		this.aClass20_Sub1_1 = null;
		this.method2957();
		this.method2641();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "()V")
	private void method2644() {
		@Pc(4) int local4 = this.aClass20_Sub1_1.aClass20_Sub3_1.anInt3499;
		if (this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[local4] != null) {
			this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[local4].method2643();
		}
		this.aClass20_Sub1_1.aClass20_Sub3_1.aClass20_Sub2_Sub1Array2[local4] = this;
		this.aShort21 = (short) this.aClass20_Sub1_1.aClass20_Sub3_1.anInt3499;
		this.aClass20_Sub1_1.aClass20_Sub3_1.anInt3499 = local4 + 1 & 0x1FFF;
		this.aClass20_Sub1_1.aClass175_1.method4359(this);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!bi;IIIIIIIII)V")
	public void method2645(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass20_Sub1_1 = arg0;
		this.anInt3228 = arg1 << Static163.anInt3227;
		this.anInt3229 = arg2 << Static163.anInt3227;
		this.anInt3230 = arg3 << Static163.anInt3227;
		this.anInt3231 = arg9;
		this.aShort22 = this.aShort20 = (short) arg8;
		this.aShort19 = (short) arg4;
		this.aShort23 = (short) arg5;
		this.aShort24 = (short) arg6;
		this.anInt3233 = arg7;
		this.method2644();
	}
}
