import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class131_Sub1 extends Class131 {

	@OriginalMember(owner = "client!vba", name = "x", descriptor = "Lclient!tb;")
	private Class277 aClass277_2;

	@OriginalMember(owner = "client!vba", name = "I", descriptor = "[B")
	private byte[] aByteArray119;

	@OriginalMember(owner = "client!vba", name = "J", descriptor = "Z")
	private boolean aBoolean607;

	@OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
	private int anInt8557 = 0;

	@OriginalMember(owner = "client!vba", name = "r", descriptor = "Lclient!ba;")
	private final Class17 aClass17_38 = new Class17(16);

	@OriginalMember(owner = "client!vba", name = "O", descriptor = "I")
	private int anInt8572 = 0;

	@OriginalMember(owner = "client!vba", name = "M", descriptor = "Lclient!bv;")
	private final Class37 aClass37_99 = new Class37();

	@OriginalMember(owner = "client!vba", name = "P", descriptor = "J")
	private long aLong360 = 0L;

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "Lclient!km;")
	private final Class167 aClass167_2;

	@OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
	private final int anInt8561;

	@OriginalMember(owner = "client!vba", name = "K", descriptor = "Z")
	private boolean aBoolean608;

	@OriginalMember(owner = "client!vba", name = "N", descriptor = "Lclient!bv;")
	private Class37 aClass37_100;

	@OriginalMember(owner = "client!vba", name = "D", descriptor = "Lclient!gw;")
	private final Class114 aClass114_3;

	@OriginalMember(owner = "client!vba", name = "o", descriptor = "Lclient!km;")
	private final Class167 aClass167_3;

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "[B")
	private final byte[] aByteArray118;

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
	private final int anInt8564;

	@OriginalMember(owner = "client!vba", name = "Q", descriptor = "Z")
	private final boolean aBoolean609;

	@OriginalMember(owner = "client!vba", name = "C", descriptor = "Lclient!bw;")
	private final Class38 aClass38_3;

	@OriginalMember(owner = "client!vba", name = "A", descriptor = "I")
	private final int anInt8566;

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "Lclient!oa;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILclient!km;Lclient!km;Lclient!gw;Lclient!bw;I[BIZ)V")
	public Class131_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) Class114 arg3, @OriginalArg(4) Class38 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass167_2 = arg1;
		this.anInt8561 = arg0;
		if (this.aClass167_2 == null) {
			this.aBoolean608 = false;
		} else {
			this.aBoolean608 = true;
			this.aClass37_100 = new Class37();
		}
		this.aClass114_3 = arg3;
		this.aClass167_3 = arg2;
		this.aByteArray118 = arg6;
		this.anInt8564 = arg7;
		this.aBoolean609 = arg8;
		this.aClass38_3 = arg4;
		this.anInt8566 = arg5;
		if (this.aClass167_3 != null) {
			this.aClass1_Sub1_Sub4_1 = this.aClass38_3.method982(this.anInt8561, this.aClass167_3);
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
	public int method7011() {
		return this.anInt8557;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Lclient!tb;")
	@Override
	public Class277 method7010() {
		if (this.aClass277_2 != null) {
			return this.aClass277_2;
		}
		if (this.aClass1_Sub1_Sub4_1 == null) {
			if (this.aClass114_3.method2594()) {
				return null;
			}
			this.aClass1_Sub1_Sub4_1 = this.aClass114_3.method2603((byte) 0, 255, this.anInt8561, true);
		}
		if (this.aClass1_Sub1_Sub4_1.aBoolean639) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass1_Sub1_Sub4_1.method7512();
		if (this.aClass1_Sub1_Sub4_1 instanceof Class1_Sub1_Sub4_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass277_2 = new Class277(local43, this.anInt8566, this.aByteArray118);
				if (this.anInt8564 != this.aClass277_2.anInt7780) {
					throw new RuntimeException();
				}
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass277_2 = null;
				if (this.aClass114_3.method2594()) {
					this.aClass1_Sub1_Sub4_1 = null;
				} else {
					this.aClass1_Sub1_Sub4_1 = this.aClass114_3.method2603((byte) 0, 255, this.anInt8561, true);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass277_2 = new Class277(local43, this.anInt8566, this.aByteArray118);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass114_3.method2596();
				this.aClass277_2 = null;
				if (this.aClass114_3.method2594()) {
					this.aClass1_Sub1_Sub4_1 = null;
				} else {
					this.aClass1_Sub1_Sub4_1 = this.aClass114_3.method2603((byte) 0, 255, this.anInt8561, true);
				}
				return null;
			}
			if (this.aClass167_3 != null) {
				this.aClass38_3.method981(this.anInt8561, this.aClass167_3, local43);
			}
		}
		this.aClass1_Sub1_Sub4_1 = null;
		if (this.aClass167_2 != null) {
			this.aByteArray119 = new byte[this.aClass277_2.anInt7782];
			this.anInt8557 = 0;
		}
		return this.aClass277_2;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)Lclient!oa;")
	private Class1_Sub1_Sub4 method7012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class1_Sub1_Sub4 local19 = (Class1_Sub1_Sub4) this.aClass17_38.method738((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.aBoolean636 && local19.aBoolean639) {
			local19.method7525();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aClass167_2 == null || this.aByteArray119[arg0] == -1) {
					if (this.aClass114_3.method2594()) {
						return null;
					}
					local19 = this.aClass114_3.method2603((byte) 2, this.anInt8561, arg0, true);
				} else {
					local19 = this.aClass38_3.method982(arg0, this.aClass167_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass167_2 == null) {
					throw new RuntimeException();
				}
				local19 = this.aClass38_3.method980(arg0, this.aClass167_2);
			} else if (arg1 == 2) {
				if (this.aClass167_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray119[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass114_3.method2600()) {
					return null;
				}
				local19 = this.aClass114_3.method2603((byte) 2, this.anInt8561, arg0, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass17_38.method737(local19, (long) arg0);
		}
		if (local19.aBoolean639) {
			return null;
		}
		@Pc(158) byte[] local158 = local19.method7512();
		@Pc(185) int local185;
		@Pc(212) byte[] local212;
		@Pc(223) byte[] local223;
		@Pc(225) int local225;
		@Pc(277) Class1_Sub1_Sub4_Sub1 local277;
		if (!(local19 instanceof Class1_Sub1_Sub4_Sub2)) {
			try {
				if (local158 == null || local158.length <= 2) {
					throw new RuntimeException();
				}
				Static88.aCRC32_1.reset();
				Static88.aCRC32_1.update(local158, 0, local158.length - 2);
				local185 = (int) Static88.aCRC32_1.getValue();
				if (local185 != this.aClass277_2.anIntArray728[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass277_2.aByteArrayArray28 != null && this.aClass277_2.aByteArrayArray28[arg0] != null) {
					local212 = this.aClass277_2.aByteArrayArray28[arg0];
					local223 = Static464.method4175(local158.length - 2, 0, local158);
					for (local225 = 0; local225 < 64; local225++) {
						if (local223[local225] != local212[local225]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass114_3.anInt3073 = 0;
				this.aClass114_3.anInt3072 = 0;
			} catch (@Pc(252) RuntimeException local252) {
				this.aClass114_3.method2596();
				local19.method7525();
				if (local19.aBoolean636 && !this.aClass114_3.method2594()) {
					local277 = this.aClass114_3.method2603((byte) 2, this.anInt8561, arg0, true);
					this.aClass17_38.method737(local277, (long) arg0);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass277_2.anIntArray729[arg0] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass277_2.anIntArray729[arg0];
			if (this.aClass167_2 != null) {
				this.aClass38_3.method981(arg0, this.aClass167_2, local158);
				if (this.aByteArray119[arg0] != 1) {
					this.anInt8557++;
					this.aByteArray119[arg0] = 1;
				}
			}
			if (!local19.aBoolean636) {
				local19.method7525();
			}
			return local19;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static88.aCRC32_1.reset();
			Static88.aCRC32_1.update(local158, 0, local158.length - 2);
			local185 = (int) Static88.aCRC32_1.getValue();
			if (this.aClass277_2.anIntArray728[arg0] != local185) {
				throw new RuntimeException();
			}
			if (this.aClass277_2.aByteArrayArray28 != null && this.aClass277_2.aByteArrayArray28[arg0] != null) {
				local212 = this.aClass277_2.aByteArrayArray28[arg0];
				local223 = Static464.method4175(local158.length - 2, 0, local158);
				for (local225 = 0; local225 < 64; local225++) {
					if (local212[local225] != local223[local225]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(458) int local458 = ((local158[local158.length - 2] & 0xFF) << 8) + (local158[local158.length - 1] & 0xFF);
			if (local458 != (this.aClass277_2.anIntArray729[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray119[arg0] != 1) {
				this.anInt8557++;
				this.aByteArray119[arg0] = 1;
			}
			if (!local19.aBoolean636) {
				local19.method7525();
			}
			return local19;
		} catch (@Pc(501) Exception local501) {
			this.aByteArray119[arg0] = -1;
			local19.method7525();
			if (local19.aBoolean636 && !this.aClass114_3.method2594()) {
				local277 = this.aClass114_3.method2603((byte) 2, this.anInt8561, arg0, true);
				this.aClass17_38.method737(local277, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(BI)[B")
	@Override
	public byte[] method7008(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub4 local15 = this.method7012(arg0, 0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method7512();
			local15.method7525();
			return local23;
		}
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V")
	public void method7013() {
		if (this.aClass37_100 != null) {
			if (this.method7010() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class1 local23;
			@Pc(29) int local29;
			@Pc(119) Class1 local119;
			if (this.aBoolean608) {
				local18 = true;
				for (local23 = this.aClass37_100.method977(); local23 != null; local23 = this.aClass37_100.method971()) {
					local29 = (int) local23.aLong392;
					if (this.aByteArray119[local29] == 0) {
						this.method7012(local29, 1);
					}
					if (this.aByteArray119[local29] == 0) {
						local18 = false;
					} else {
						local23.method7525();
					}
				}
				while (this.aClass277_2.anIntArray732.length > this.anInt8572) {
					if (this.aClass277_2.anIntArray732[this.anInt8572] == 0) {
						this.anInt8572++;
					} else {
						if (this.aClass38_3.anInt1024 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray119[this.anInt8572] == 0) {
							this.method7012(this.anInt8572, 1);
						}
						if (this.aByteArray119[this.anInt8572] == 0) {
							local119 = new Class1();
							local119.aLong392 = this.anInt8572;
							local18 = false;
							this.aClass37_100.method970(local119);
						}
						this.anInt8572++;
					}
				}
				if (local18) {
					this.aBoolean608 = false;
					this.anInt8572 = 0;
				}
			} else if (this.aBoolean607) {
				local18 = true;
				for (local23 = this.aClass37_100.method977(); local23 != null; local23 = this.aClass37_100.method971()) {
					local29 = (int) local23.aLong392;
					if (this.aByteArray119[local29] != 1) {
						this.method7012(local29, 2);
					}
					if (this.aByteArray119[local29] == 1) {
						local23.method7525();
					} else {
						local18 = false;
					}
				}
				while (this.aClass277_2.anIntArray732.length > this.anInt8572) {
					if (this.aClass277_2.anIntArray732[this.anInt8572] == 0) {
						this.anInt8572++;
					} else {
						if (this.aClass114_3.method2600()) {
							local18 = false;
							break;
						}
						if (this.aByteArray119[this.anInt8572] != 1) {
							this.method7012(this.anInt8572, 2);
						}
						if (this.aByteArray119[this.anInt8572] != 1) {
							local119 = new Class1();
							local119.aLong392 = this.anInt8572;
							local18 = false;
							this.aClass37_100.method970(local119);
						}
						this.anInt8572++;
					}
				}
				if (local18) {
					this.aBoolean607 = false;
					this.anInt8572 = 0;
				}
			} else {
				this.aClass37_100 = null;
			}
		}
		if (!this.aBoolean609 || this.aLong360 > Static60.method1119()) {
			return;
		}
		for (@Pc(317) Class1_Sub1_Sub4 local317 = (Class1_Sub1_Sub4) this.aClass17_38.method735(); local317 != null; local317 = (Class1_Sub1_Sub4) this.aClass17_38.method740()) {
			if (!local317.aBoolean639) {
				if (local317.aBoolean638) {
					if (!local317.aBoolean636) {
						throw new RuntimeException();
					}
					local317.method7525();
				} else {
					local317.aBoolean638 = true;
				}
			}
		}
		this.aLong360 = Static60.method1119() + 1000L;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I")
	public int method7014() {
		if (this.method7010() == null) {
			return this.aClass1_Sub1_Sub4_1 == null ? 0 : this.aClass1_Sub1_Sub4_1.method7513();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)I")
	public int method7015() {
		return this.aClass277_2 == null ? 0 : this.aClass277_2.anInt7777;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)V")
	@Override
	public void method7006(@OriginalArg(1) int arg0) {
		if (this.aClass167_2 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass37_99.method977(); local14 != null; local14 = this.aClass37_99.method971()) {
			if (local14.aLong392 == (long) arg0) {
				return;
			}
		}
		@Pc(42) Class1 local42 = new Class1();
		local42.aLong392 = arg0;
		this.aClass37_99.method970(local42);
	}

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "(B)V")
	public void method7016() {
		if (this.aClass167_2 != null) {
			this.aBoolean607 = true;
			if (this.aClass37_100 == null) {
				this.aClass37_100 = new Class37();
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)V")
	public void method7017() {
		if (this.aClass37_100 == null || this.method7010() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass37_99.method977(); local19 != null; local19 = this.aClass37_99.method971()) {
			@Pc(25) int local25 = (int) local19.aLong392;
			if (local25 < 0 || local25 >= this.aClass277_2.anInt7782 || this.aClass277_2.anIntArray732[local25] == 0) {
				local19.method7525();
			} else {
				if (this.aByteArray119[local25] == 0) {
					this.method7012(local25, 1);
				}
				if (this.aByteArray119[local25] == -1) {
					this.method7012(local25, 2);
				}
				if (this.aByteArray119[local25] == 1) {
					local19.method7525();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
	public int method7018() {
		if (this.aClass277_2 == null) {
			return 0;
		} else if (this.aBoolean608) {
			@Pc(20) Class1 local20 = this.aClass37_100.method977();
			return local20 == null ? 0 : (int) local20.aLong392;
		} else {
			return this.aClass277_2.anInt7777;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
	@Override
	public int method7004(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub4 local11 = (Class1_Sub1_Sub4) this.aClass17_38.method738((long) arg0);
		return local11 == null ? 0 : local11.method7513();
	}
}
