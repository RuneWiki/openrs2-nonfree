import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class47_Sub2_Sub1 extends Class47_Sub2 {

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "S")
	public short aShort45;

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
	private int anInt5548;

	@OriginalMember(owner = "client!tm", name = "L", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "Lclient!vi;")
	public Class47_Sub3 aClass47_Sub3_1;

	@OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
	public int anInt5552;

	@OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
	public int anInt5550;

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
	public int anInt5547;

	@OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
	public int anInt5553;

	@OriginalMember(owner = "client!tm", name = "H", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!tm", name = "D", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!tm", name = "B", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!tm", name = "F", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!tm", name = "O", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
	private int anInt5551;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!vi;IIIIIIIII)V")
	public Class47_Sub2_Sub1(@OriginalArg(0) Class47_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass47_Sub3_1 = arg0;
		this.anInt5552 = arg1 << Static271.anInt5549;
		this.anInt5550 = arg2 << Static271.anInt5549;
		this.anInt5547 = arg3 << Static271.anInt5549;
		this.anInt5553 = arg9;
		this.aShort46 = this.aShort48 = (short) arg8;
		this.aShort44 = (short) arg4;
		this.aShort47 = (short) arg5;
		this.aShort49 = (short) arg6;
		this.anInt5551 = arg7;
		this.method4490();
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "()V")
	private void method4490() {
		@Pc(4) int local4 = this.aClass47_Sub3_1.aClass47_Sub1_6.anInt1298;
		if (this.aClass47_Sub3_1.aClass47_Sub1_6.aClass47_Sub2_Sub1Array1[local4] != null) {
			this.aClass47_Sub3_1.aClass47_Sub1_6.aClass47_Sub2_Sub1Array1[local4].method4492();
		}
		this.aClass47_Sub3_1.aClass47_Sub1_6.aClass47_Sub2_Sub1Array1[local4] = this;
		this.aShort45 = (short) this.aClass47_Sub3_1.aClass47_Sub1_6.anInt1298;
		this.aClass47_Sub3_1.aClass47_Sub1_6.anInt1298 = local4 + 1 & 0x1FFF;
		this.aClass47_Sub3_1.aClass62_3.method1368(this);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!vi;IIIIIIIII)V")
	public void method4491(@OriginalArg(0) Class47_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass47_Sub3_1 = arg0;
		this.anInt5552 = arg1 << Static271.anInt5549;
		this.anInt5550 = arg2 << Static271.anInt5549;
		this.anInt5547 = arg3 << Static271.anInt5549;
		this.anInt5553 = arg9;
		this.aShort46 = this.aShort48 = (short) arg8;
		this.aShort44 = (short) arg4;
		this.aShort47 = (short) arg5;
		this.aShort49 = (short) arg6;
		this.anInt5551 = arg7;
		this.method4490();
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "()V")
	private void method4492() {
		this.aClass47_Sub3_1.aClass47_Sub1_6.aClass47_Sub2_Sub1Array1[this.aShort45] = null;
		Static71.aClass47_Sub2_Sub1Array2[Static71.anInt1294] = this;
		Static71.anInt1294 = Static71.anInt1294 + 1 & 0x3FF;
		this.aClass47_Sub3_1 = null;
		this.method4804();
		this.method4483();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(JI)V")
	public void method4493(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aClass47_Sub3_1 == null) {
			return;
		}
		this.aShort48 = (short) (this.aShort48 - arg1);
		if (this.aShort48 <= 0) {
			this.method4492();
			return;
		}
		@Pc(21) int local21 = this.anInt5552 >> Static271.anInt5549;
		@Pc(26) int local26 = this.anInt5550 >> Static271.anInt5549;
		@Pc(31) int local31 = this.anInt5547 >> Static271.anInt5549;
		@Pc(35) Class47_Sub1 local35 = this.aClass47_Sub3_1.aClass47_Sub1_6;
		@Pc(39) Class164 local39 = this.aClass47_Sub3_1.aClass164_1;
		@Pc(69) int local69;
		@Pc(86) int local86;
		@Pc(103) int local103;
		if (local39.anInt5336 != 0) {
			if (this.aShort46 - this.aShort48 <= local39.anInt5305) {
				local69 = (this.anInt5553 >> 8 & 0xFF00) + (this.anInt5548 >> 16 & 0xFF) + local39.anInt5315 * arg1;
				local86 = (this.anInt5553 & 0xFF00) + (this.anInt5548 >> 8 & 0xFF) + local39.anInt5316 * arg1;
				local103 = ((this.anInt5553 & 0xFF) << 8) + (this.anInt5548 & 0xFF) + local39.anInt5317 * arg1;
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
				this.anInt5553 &= 0xFF000000;
				this.anInt5553 |= ((local69 & 0xFF00) << 8) + (local86 & 0xFF00) + (local103 >> 8 & 0xFF);
				this.anInt5548 &= 0xFF000000;
				this.anInt5548 |= ((local69 & 0xFF) << 16) + ((local86 & 0xFF) << 8) + (local103 & 0xFF);
			}
			if (this.aShort46 - this.aShort48 <= local39.anInt5319) {
				local69 = (this.anInt5553 >> 16 & 0xFF00) + (this.anInt5548 >> 24 & 0xFF) + local39.anInt5308 * arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 65535) {
					local69 = 65535;
				}
				this.anInt5553 &= 0xFFFFFF;
				this.anInt5553 |= (local69 & 0xFF00) << 16;
				this.anInt5548 &= 0xFFFFFF;
				this.anInt5548 |= (local69 & 0xFF) << 24;
			}
		}
		if (local39.anInt5310 != -1 && this.aShort46 - this.aShort48 <= local39.anInt5318) {
			this.anInt5551 += local39.anInt5326 * arg1;
		}
		local69 = this.aShort44;
		local86 = this.aShort47;
		local103 = this.aShort49;
		@Pc(286) boolean local286 = false;
		@Pc(296) int local296;
		@Pc(302) int local302;
		@Pc(308) int local308;
		@Pc(323) int local323;
		@Pc(331) long local331;
		if (local39.anInt5301 == 1) {
			local296 = local21 - this.aClass47_Sub3_1.anInt5876;
			local302 = local26 - this.aClass47_Sub3_1.anInt5885;
			local308 = local31 - this.aClass47_Sub3_1.anInt5870;
			local323 = (int) Math.sqrt((double) (local296 * local296 + local302 * local302 + local308 * local308));
			local331 = local39.anInt5331 * local323 * arg1;
			this.anInt5551 = (int) ((long) this.anInt5551 - ((long) this.anInt5551 * local331 >> 18));
		} else if (local39.anInt5301 == 2) {
			local296 = local21 - this.aClass47_Sub3_1.anInt5876;
			local302 = local26 - this.aClass47_Sub3_1.anInt5885;
			local308 = local31 - this.aClass47_Sub3_1.anInt5870;
			local323 = local296 * local296 + local302 * local302 + local308 * local308;
			local331 = local39.anInt5331 * local323 * arg1;
			this.anInt5551 = (int) ((long) this.anInt5551 - ((long) this.anInt5551 * local331 >> 28));
		}
		@Pc(406) Class3 local406 = local35.aClass56_5.aClass3_66;
		@Pc(434) int local434;
		@Pc(439) int local439;
		@Pc(452) long local452;
		@Pc(463) int local463;
		@Pc(491) long local491;
		@Pc(500) int local500;
		@Pc(606) int local606;
		@Pc(615) int local615;
		@Pc(624) int local624;
		@Pc(415) Class3_Sub4_Sub10 local415;
		@Pc(419) Class181 local419;
		@Pc(429) int local429;
		for (@Pc(409) Class3 local409 = local406.aClass3_232; local409 != local406; local409 = local409.aClass3_232) {
			local415 = (Class3_Sub4_Sub10) local409;
			local419 = local415.aClass67_1.aClass181_1;
			if (local419.anInt5756 != 1) {
				local429 = local21 - local415.anInt1872;
				local434 = local26 - local415.anInt1863;
				local439 = local31 - local415.anInt1871;
				local452 = local429 * local429 + local434 * local434 + local439 * local439;
				if (local452 <= local419.aLong226) {
					local463 = (int) Math.sqrt((double) local452);
					if (local463 == 0) {
						local463 = 1;
					}
					local491 = (long) (local429 * local415.anInt1866 + local434 * local419.anInt5749 + local439 * local415.anInt1861) * 65535L / (long) (local419.anInt5741 * local463);
					if (local491 >= (long) local419.anInt5744) {
						local500 = 0;
						if (local419.anInt5757 == 1) {
							local500 = (local463 >> 4) * local419.anInt5758;
						} else if (local419.anInt5757 == 2) {
							local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt5758;
						}
						if (local419.anInt5753 != 0) {
							local606 = (local429 << 15) / local463 * local419.anInt5741;
							local615 = (local434 << 15) / local463 * local419.anInt5741;
							local624 = (local439 << 15) / local463 * local419.anInt5741;
							if (local419.anInt5750 == 0) {
								local69 += local606 * arg1 >> 15;
								local86 += local615 * arg1 >> 15;
								local103 += local624 * arg1 >> 15;
								local286 = true;
							} else {
								this.anInt5552 += local606 * arg1 >> 15;
								this.anInt5550 += local615 * arg1 >> 15;
								this.anInt5547 += local624 * arg1 >> 15;
							}
						} else if (local419.anInt5750 == 0) {
							local69 += (local415.anInt1866 - local500) * arg1;
							local86 += (local419.anInt5749 - local500) * arg1;
							local103 += (local415.anInt1861 - local500) * arg1;
							local286 = true;
						} else {
							this.anInt5552 += (local415.anInt1866 - local500) * arg1;
							this.anInt5550 += (local419.anInt5749 - local500) * arg1;
							this.anInt5547 += (local415.anInt1861 - local500) * arg1;
						}
					}
				}
			}
		}
		if (local39.anIntArray558 != null) {
			for (local302 = 0; local302 < local39.anIntArray558.length; local302++) {
				local415 = (Class3_Sub4_Sub10) Static71.aClass107_1.method2732((long) local39.anIntArray558[local302]);
				while (local415 != null) {
					local419 = local415.aClass67_1.aClass181_1;
					local429 = local21 - local415.anInt1872;
					local434 = local26 - local415.anInt1863;
					local439 = local31 - local415.anInt1871;
					local452 = local429 * local429 + local434 * local434 + local439 * local439;
					if (local452 > local419.aLong226) {
						local415 = (Class3_Sub4_Sub10) Static71.aClass107_1.method2733();
					} else {
						local463 = (int) Math.sqrt((double) local452);
						if (local463 == 0) {
							local463 = 1;
						}
						local491 = (long) (local429 * local415.anInt1866 + local434 * local419.anInt5749 + local439 * local415.anInt1861) * 65535L / (long) (local419.anInt5741 * local463);
						if (local491 < (long) local419.anInt5744) {
							local415 = (Class3_Sub4_Sub10) Static71.aClass107_1.method2733();
						} else {
							local500 = 0;
							if (local419.anInt5757 == 1) {
								local500 = (local463 >> 4) * local419.anInt5758;
							} else if (local419.anInt5757 == 2) {
								local500 = (local463 >> 4) * (local463 >> 4) * local419.anInt5758;
							}
							if (local419.anInt5753 != 0) {
								local606 = (local429 << 15) / local463 * local419.anInt5741;
								local615 = (local434 << 15) / local463 * local419.anInt5741;
								local624 = (local439 << 15) / local463 * local419.anInt5741;
								if (local419.anInt5750 == 0) {
									local69 += local606 * arg1 >> 15;
									local86 += local615 * arg1 >> 15;
									local103 += local624 * arg1 >> 15;
									local286 = true;
								} else {
									this.anInt5552 += local606 * arg1 >> 15;
									this.anInt5550 += local615 * arg1 >> 15;
									this.anInt5547 += local624 * arg1 >> 15;
								}
							} else if (local419.anInt5750 == 0) {
								local69 += (local415.anInt1866 - local500) * arg1;
								local86 += (local419.anInt5749 - local500) * arg1;
								local103 += (local415.anInt1861 - local500) * arg1;
								local286 = true;
							} else {
								this.anInt5552 += (local415.anInt1866 - local500) * arg1;
								this.anInt5550 += (local419.anInt5749 - local500) * arg1;
								this.anInt5547 += (local415.anInt1861 - local500) * arg1;
							}
							local415 = (Class3_Sub4_Sub10) Static71.aClass107_1.method2733();
						}
					}
				}
			}
		}
		if (local39.anIntArray555 != null) {
			if (local39.anIntArray554 == null) {
				local39.anIntArray554 = new int[local39.anIntArray555.length];
				for (local302 = 0; local302 < local39.anIntArray555.length; local302++) {
					Static183.method3088(local39.anIntArray555[local302]);
					local39.anIntArray554[local302] = ((Class3_Sub8) Static196.aClass30_22.method663((long) local39.anIntArray555[local302])).anInt1237;
				}
			}
			for (local302 = 0; local302 < local39.anIntArray554.length; local302++) {
				@Pc(1048) Class181 local1048 = Static184.aClass181Array1[local39.anIntArray554[local302]];
				if (local1048.anInt5750 == 0) {
					local69 += local1048.anInt5748 * arg1;
					local86 += local1048.anInt5749 * arg1;
					local103 += local1048.anInt5747 * arg1;
					local286 = true;
				} else {
					this.anInt5552 += local1048.anInt5748 * arg1;
					this.anInt5550 += local1048.anInt5749 * arg1;
					this.anInt5547 += local1048.anInt5747 * arg1;
				}
			}
		}
		if (local286) {
			while (true) {
				if (local69 <= 32767 && local86 <= 32767 && local103 <= 32767 && local69 >= -32767 && local86 >= -32767 && local103 >= -32767) {
					this.aShort44 = (short) local69;
					this.aShort47 = (short) local86;
					this.aShort49 = (short) local103;
					break;
				}
				local69 >>= 0x1;
				local86 >>= 0x1;
				local103 >>= 0x1;
				this.anInt5551 <<= 0x1;
			}
		}
		this.anInt5552 = (int) ((long) this.anInt5552 + ((long) this.aShort44 * (long) this.anInt5551 >> 23) * (long) arg1);
		this.anInt5550 = (int) ((long) this.anInt5550 + ((long) this.aShort47 * (long) this.anInt5551 >> 23) * (long) arg1);
		this.anInt5547 = (int) ((long) this.anInt5547 + ((long) this.aShort49 * (long) this.anInt5551 >> 23) * (long) arg1);
		local302 = this.anInt5552 >> 19;
		local308 = this.anInt5547 >> 19;
		local26 = this.anInt5550 >> Static271.anInt5549;
		if (local26 > 0 || local26 < -65535 || local302 < 0 || local302 >= Static295.anInt4973 || local308 < 0 || local308 >= Static307.anInt6023) {
			this.method4492();
			return;
		}
		@Pc(1247) int[][][] local1247 = Static256.anIntArrayArrayArray14;
		local429 = local1247[local35.anInt1308][local302][local308];
		if (local35.anInt1308 < 3) {
			local434 = local1247[local35.anInt1308 + 1][local302][local308];
		} else {
			local434 = local1247[local35.anInt1308][local302][local308] - 1024;
		}
		if (local39.aBoolean371) {
			if (local39.anInt5344 == -1 && local26 > local429) {
				this.method4492();
				return;
			}
			if (local39.anInt5344 >= 0 && local26 > local1247[local39.anInt5344][local302][local308]) {
				this.method4492();
				return;
			}
			if (local39.anInt5327 == -1 && local26 < local434) {
				this.method4492();
				return;
			}
			if (local39.anInt5327 >= 0 && local26 < local1247[local39.anInt5327 + 1][local302][local308]) {
				this.method4492();
				return;
			}
		}
		if (local302 >= local35.anInt1305 && local302 <= local35.anInt1313 && local308 >= local35.anInt1315 && local308 <= local35.anInt1310 && local26 <= local35.anInt1311 && local26 >= local35.anInt1312) {
			this.aBoolean384 = false;
			return;
		}
		this.aBoolean384 = true;
		@Pc(1369) byte local1369 = 3;
		if (local26 > local1247[1][local302][local308]) {
			local1369 = 0;
		} else if (local26 > local1247[2][local302][local308]) {
			local1369 = 1;
		} else if (local26 > local1247[3][local302][local308]) {
			local1369 = 2;
		} else if (local26 < local1247[3][local302][local308] - 1024) {
			this.method4492();
			return;
		}
		@Pc(1427) Class3_Sub25 local1427 = Static146.aClass3_Sub25ArrayArrayArray7[local1369][local302][local308];
		if (local1427 == null) {
			local1427 = Static146.aClass3_Sub25ArrayArrayArray7[local1369][local302][local308] = new Class3_Sub25(local1369, local302, local308);
		}
		if (local1427.aClass12_1 == null) {
			local1427.aClass12_1 = new Class12();
			local1427.aByte24 = (byte) (arg0 & 0xFFL);
		} else if (local1427.aByte24 != (byte) (arg0 & 0xFFL)) {
			local1427.aClass12_1.method299();
			local1427.aByte24 = (byte) (arg0 & 0xFFL);
		}
		local1427.aClass12_1.method296(this);
	}
}
