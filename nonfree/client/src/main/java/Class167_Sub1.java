import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class167_Sub1 extends Class167 {

	@OriginalMember(owner = "client!im", name = "o", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!im", name = "D", descriptor = "Lclient!el;")
	private Class95 aClass95_1;

	@OriginalMember(owner = "client!im", name = "J", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!im", name = "t", descriptor = "I")
	private int anInt4474 = 0;

	@OriginalMember(owner = "client!im", name = "x", descriptor = "Lclient!jo;")
	private final Class187 aClass187_33 = new Class187(16);

	@OriginalMember(owner = "client!im", name = "K", descriptor = "I")
	private int anInt4482 = 0;

	@OriginalMember(owner = "client!im", name = "N", descriptor = "Lclient!ok;")
	private final Class262 aClass262_23 = new Class262();

	@OriginalMember(owner = "client!im", name = "O", descriptor = "J")
	private long aLong129 = 0L;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "I")
	private final int anInt4468;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "Lclient!uaa;")
	private final Class345 aClass345_2;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "Lclient!ok;")
	private Class262 aClass262_22;

	@OriginalMember(owner = "client!im", name = "P", descriptor = "Z")
	private final boolean aBoolean310;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "I")
	private final int anInt4472;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	private final int anInt4469;

	@OriginalMember(owner = "client!im", name = "H", descriptor = "Lclient!gu;")
	private final Class135 aClass135_2;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "Lclient!uaa;")
	private final Class345 aClass345_1;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "Lclient!rf;")
	private final Class298 aClass298_1;

	@OriginalMember(owner = "client!im", name = "I", descriptor = "Lclient!aka;")
	private Class14_Sub3_Sub2 aClass14_Sub3_Sub2_1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(ILclient!uaa;Lclient!uaa;Lclient!gu;Lclient!rf;I[BIZ)V")
	public Class167_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class345 arg2, @OriginalArg(3) Class135 arg3, @OriginalArg(4) Class298 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt4468 = arg0;
		this.aClass345_2 = arg1;
		if (this.aClass345_2 == null) {
			this.aBoolean309 = false;
		} else {
			this.aBoolean309 = true;
			this.aClass262_22 = new Class262();
		}
		this.aBoolean310 = arg8;
		this.aByteArray59 = arg6;
		this.anInt4472 = arg5;
		this.anInt4469 = arg7;
		this.aClass135_2 = arg3;
		this.aClass345_1 = arg2;
		this.aClass298_1 = arg4;
		if (this.aClass345_1 != null) {
			this.aClass14_Sub3_Sub2_1 = this.aClass298_1.method7424(this.aClass345_1, this.anInt4468);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I")
	public int method3705() {
		if (this.method3701() == null) {
			return this.aClass14_Sub3_Sub2_1 == null ? 0 : this.aClass14_Sub3_Sub2_1.method5608();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
	public void method3706() {
		if (this.aClass262_22 == null || this.method3701() == null) {
			return;
		}
		for (@Pc(27) Class14 local27 = this.aClass262_23.method6318(); local27 != null; local27 = this.aClass262_23.method6311()) {
			@Pc(33) int local33 = (int) local27.aLong305;
			if (local33 < 0 || this.aClass95_1.anInt2650 <= local33 || this.aClass95_1.anIntArray218[local33] == 0) {
				local27.method9315();
			} else {
				if (this.aByteArray58[local33] == 0) {
					this.method3708(local33, 1);
				}
				if (this.aByteArray58[local33] == -1) {
					this.method3708(local33, 2);
				}
				if (this.aByteArray58[local33] == 1) {
					local27.method9315();
				}
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
	public void method3707() {
		if (this.aClass345_2 != null) {
			this.aBoolean308 = true;
			if (this.aClass262_22 == null) {
				this.aClass262_22 = new Class262();
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)V")
	@Override
	public void method3704(@OriginalArg(0) int arg0) {
		if (this.aClass345_2 == null) {
			return;
		}
		for (@Pc(22) Class14 local22 = this.aClass262_23.method6318(); local22 != null; local22 = this.aClass262_23.method6311()) {
			if ((long) arg0 == local22.aLong305) {
				return;
			}
		}
		@Pc(46) Class14 local46 = new Class14();
		local46.aLong305 = (long) arg0;
		this.aClass262_23.method6314(local46);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Lclient!aka;")
	private Class14_Sub3_Sub2 method3708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class14_Sub3_Sub2 local13 = (Class14_Sub3_Sub2) this.aClass187_33.method4078((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean492 && local13.aBoolean494) {
			local13.method9315();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass345_2 == null || this.aByteArray58[arg0] == -1) {
					if (this.aClass135_2.method3071()) {
						return null;
					}
					local13 = this.aClass135_2.method3060(this.anInt4468, arg0, (byte) 2, true);
				} else {
					local13 = this.aClass298_1.method7424(this.aClass345_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass345_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass298_1.method7421(arg0, this.aClass345_2);
			} else if (arg1 == 2) {
				if (this.aClass345_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray58[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass135_2.method3069()) {
					return null;
				}
				local13 = this.aClass135_2.method3060(this.anInt4468, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass187_33.method4077((long) arg0, local13);
		}
		if (local13.aBoolean494) {
			return null;
		}
		@Pc(160) byte[] local160 = local13.method5605();
		@Pc(187) int local187;
		@Pc(214) byte[] local214;
		@Pc(223) byte[] local223;
		@Pc(225) int local225;
		@Pc(337) Class14_Sub3_Sub2_Sub1 local337;
		if (!(local13 instanceof Class14_Sub3_Sub2_Sub2)) {
			try {
				label157: {
					if (local160 != null && local160.length > 2) {
						Static328.aCRC32_1.reset();
						Static328.aCRC32_1.update(local160, 0, local160.length - 2);
						local187 = (int) Static328.aCRC32_1.getValue();
						if (this.aClass95_1.anIntArray220[arg0] != local187) {
							throw new RuntimeException();
						}
						if (this.aClass95_1.aByteArrayArray21 == null || this.aClass95_1.aByteArrayArray21[arg0] == null) {
							break label157;
						}
						local214 = this.aClass95_1.aByteArrayArray21[arg0];
						local223 = Static53.method1112(0, local160, local160.length - 2);
						local225 = 0;
						while (true) {
							if (local225 >= 64) {
								break label157;
							}
							if (local223[local225] != local214[local225]) {
								throw new RuntimeException();
							}
							local225++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass135_2.anInt3735 = 0;
				this.aClass135_2.anInt3734 = 0;
			} catch (@Pc(435) RuntimeException local435) {
				this.aClass135_2.method3072();
				local13.method9315();
				if (local13.aBoolean492 && !this.aClass135_2.method3071()) {
					local337 = this.aClass135_2.method3060(this.anInt4468, arg0, (byte) 2, true);
					this.aClass187_33.method4077((long) arg0, local337);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass95_1.anIntArray221[arg0] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass95_1.anIntArray221[arg0];
			if (this.aClass345_2 != null) {
				this.aClass298_1.method7423(local160, this.aClass345_2, arg0);
				if (this.aByteArray58[arg0] != 1) {
					this.anInt4474++;
					this.aByteArray58[arg0] = 1;
				}
			}
			if (!local13.aBoolean492) {
				local13.method9315();
			}
			return local13;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static328.aCRC32_1.reset();
			Static328.aCRC32_1.update(local160, 0, local160.length - 2);
			local187 = (int) Static328.aCRC32_1.getValue();
			if (local187 != this.aClass95_1.anIntArray220[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass95_1.aByteArrayArray21 != null && this.aClass95_1.aByteArrayArray21[arg0] != null) {
				local214 = this.aClass95_1.aByteArrayArray21[arg0];
				local223 = Static53.method1112(0, local160, local160.length - 2);
				for (local225 = 0; local225 < 64; local225++) {
					if (local223[local225] != local214[local225]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(268) int local268 = (local160[local160.length - 1] & 0xFF) + ((local160[local160.length - 2] & 0xFF) << 8);
			if ((this.aClass95_1.anIntArray221[arg0] & 0xFFFF) != local268) {
				throw new RuntimeException();
			}
			if (this.aByteArray58[arg0] != 1) {
				this.anInt4474++;
				this.aByteArray58[arg0] = 1;
			}
			if (!local13.aBoolean492) {
				local13.method9315();
			}
			return local13;
		} catch (@Pc(311) Exception local311) {
			this.aByteArray58[arg0] = -1;
			local13.method9315();
			if (local13.aBoolean492 && !this.aClass135_2.method3071()) {
				local337 = this.aClass135_2.method3060(this.anInt4468, arg0, (byte) 2, true);
				this.aClass187_33.method4077((long) arg0, local337);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Lclient!el;")
	@Override
	public Class95 method3701() {
		if (this.aClass95_1 != null) {
			return this.aClass95_1;
		}
		if (this.aClass14_Sub3_Sub2_1 == null) {
			if (this.aClass135_2.method3071()) {
				return null;
			}
			this.aClass14_Sub3_Sub2_1 = this.aClass135_2.method3060(255, this.anInt4468, (byte) 0, true);
		}
		if (this.aClass14_Sub3_Sub2_1.aBoolean494) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass14_Sub3_Sub2_1.method5605();
		if (this.aClass14_Sub3_Sub2_1 instanceof Class14_Sub3_Sub2_Sub2) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass95_1 = new Class95(local51, this.anInt4472, this.aByteArray59);
				if (this.aClass95_1.anInt2652 != this.anInt4469) {
					throw new RuntimeException();
				}
			} catch (@Pc(82) RuntimeException local82) {
				this.aClass95_1 = null;
				if (this.aClass135_2.method3071()) {
					this.aClass14_Sub3_Sub2_1 = null;
				} else {
					this.aClass14_Sub3_Sub2_1 = this.aClass135_2.method3060(255, this.anInt4468, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass95_1 = new Class95(local51, this.anInt4472, this.aByteArray59);
			} catch (@Pc(126) RuntimeException local126) {
				this.aClass135_2.method3072();
				this.aClass95_1 = null;
				if (this.aClass135_2.method3071()) {
					this.aClass14_Sub3_Sub2_1 = null;
				} else {
					this.aClass14_Sub3_Sub2_1 = this.aClass135_2.method3060(255, this.anInt4468, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass345_1 != null) {
				this.aClass298_1.method7423(local51, this.aClass345_1, this.anInt4468);
			}
		}
		if (this.aClass345_2 != null) {
			this.anInt4474 = 0;
			this.aByteArray58 = new byte[this.aClass95_1.anInt2650];
		}
		this.aClass14_Sub3_Sub2_1 = null;
		return this.aClass95_1;
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(I)I")
	public int method3710() {
		return this.anInt4474;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
	public void method3711() {
		if (this.aClass262_22 != null) {
			if (this.method3701() == null) {
				return;
			}
			@Pc(22) boolean local22;
			@Pc(27) Class14 local27;
			@Pc(33) int local33;
			@Pc(124) Class14 local124;
			if (this.aBoolean309) {
				local22 = true;
				for (local27 = this.aClass262_22.method6318(); local27 != null; local27 = this.aClass262_22.method6311()) {
					local33 = (int) local27.aLong305;
					if (this.aByteArray58[local33] == 0) {
						this.method3708(local33, 1);
					}
					if (this.aByteArray58[local33] == 0) {
						local22 = false;
					} else {
						local27.method9315();
					}
				}
				while (this.aClass95_1.anIntArray218.length > this.anInt4482) {
					if (this.aClass95_1.anIntArray218[this.anInt4482] == 0) {
						this.anInt4482++;
					} else {
						if (this.aClass298_1.anInt8967 >= 250) {
							local22 = false;
							break;
						}
						if (this.aByteArray58[this.anInt4482] == 0) {
							this.method3708(this.anInt4482, 1);
						}
						if (this.aByteArray58[this.anInt4482] == 0) {
							local124 = new Class14();
							local124.aLong305 = (long) this.anInt4482;
							this.aClass262_22.method6314(local124);
							local22 = false;
						}
						this.anInt4482++;
					}
				}
				if (local22) {
					this.aBoolean309 = false;
					this.anInt4482 = 0;
				}
			} else if (this.aBoolean308) {
				local22 = true;
				for (local27 = this.aClass262_22.method6318(); local27 != null; local27 = this.aClass262_22.method6311()) {
					local33 = (int) local27.aLong305;
					if (this.aByteArray58[local33] != 1) {
						this.method3708(local33, 2);
					}
					if (this.aByteArray58[local33] == 1) {
						local27.method9315();
					} else {
						local22 = false;
					}
				}
				while (this.anInt4482 < this.aClass95_1.anIntArray218.length) {
					if (this.aClass95_1.anIntArray218[this.anInt4482] == 0) {
						this.anInt4482++;
					} else {
						if (this.aClass135_2.method3069()) {
							local22 = false;
							break;
						}
						if (this.aByteArray58[this.anInt4482] != 1) {
							this.method3708(this.anInt4482, 2);
						}
						if (this.aByteArray58[this.anInt4482] != 1) {
							local124 = new Class14();
							local124.aLong305 = (long) this.anInt4482;
							local22 = false;
							this.aClass262_22.method6314(local124);
						}
						this.anInt4482++;
					}
				}
				if (local22) {
					this.aBoolean308 = false;
					this.anInt4482 = 0;
				}
			} else {
				this.aClass262_22 = null;
			}
		}
		if (!this.aBoolean310 || Static521.method7499() < this.aLong129) {
			return;
		}
		for (@Pc(330) Class14_Sub3_Sub2 local330 = (Class14_Sub3_Sub2) this.aClass187_33.method4079(); local330 != null; local330 = (Class14_Sub3_Sub2) this.aClass187_33.method4084()) {
			if (!local330.aBoolean494) {
				if (local330.aBoolean493) {
					if (!local330.aBoolean492) {
						throw new RuntimeException();
					}
					local330.method9315();
				} else {
					local330.aBoolean493 = true;
				}
			}
		}
		this.aLong129 = Static521.method7499() + 1000L;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)I")
	@Override
	public int method3699(@OriginalArg(0) int arg0) {
		@Pc(16) Class14_Sub3_Sub2 local16 = (Class14_Sub3_Sub2) this.aClass187_33.method4078((long) arg0);
		return local16 == null ? 0 : local16.method5608();
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(I)I")
	public int method3713() {
		return this.aClass95_1 == null ? 0 : this.aClass95_1.anInt2653;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method3702(@OriginalArg(0) int arg0) {
		@Pc(17) Class14_Sub3_Sub2 local17 = this.method3708(arg0, 0);
		if (local17 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local17.method5605();
			local17.method9315();
			return local25;
		}
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(B)I")
	public int method3714() {
		if (this.aClass95_1 == null) {
			return 0;
		} else if (this.aBoolean309) {
			@Pc(26) Class14 local26 = this.aClass262_22.method6318();
			return local26 == null ? 0 : (int) local26.aLong305;
		} else {
			return this.aClass95_1.anInt2653;
		}
	}
}
