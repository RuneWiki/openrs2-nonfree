import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Lclient!ms;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
	private int anInt3976 = 0;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Lclient!fa;")
	private final Class77 aClass77_30 = new Class77(16);

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	private int anInt3977 = 0;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "Lclient!at;")
	private final Class17 aClass17_40 = new Class17();

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "Lclient!ce;")
	private final Class38 aClass38_3;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	private final int anInt3964;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "Lclient!at;")
	private Class17 aClass17_39;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Lclient!gm;")
	private final Class92 aClass92_2;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	private final int anInt3966;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!ce;")
	private final Class38 aClass38_2;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
	private final boolean aBoolean390;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	private final int anInt3969;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!wo;")
	private final Class250 aClass250_2;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!kp;")
	private Class1_Sub6_Sub10 aClass1_Sub6_Sub10_1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILclient!ce;Lclient!ce;Lclient!gm;Lclient!wo;IIZ)V")
	public Class56_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class92 arg3, @OriginalArg(4) Class250 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass38_3 = arg1;
		this.anInt3964 = arg0;
		if (this.aClass38_3 == null) {
			this.aBoolean388 = false;
		} else {
			this.aBoolean388 = true;
			this.aClass17_39 = new Class17();
		}
		this.aClass92_2 = arg3;
		this.anInt3966 = arg6;
		this.aClass38_2 = arg2;
		this.aBoolean390 = arg7;
		this.anInt3969 = arg5;
		this.aClass250_2 = arg4;
		if (this.aClass38_2 != null) {
			this.aClass1_Sub6_Sub10_1 = this.aClass250_2.method5534(this.anInt3964, this.aClass38_2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	@Override
	public int method3293(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub6_Sub10 local15 = (Class1_Sub6_Sub10) this.aClass77_30.method1368((long) arg0);
		return local15 == null ? 0 : local15.method5581();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V")
	@Override
	public void method3290(@OriginalArg(1) int arg0) {
		if (this.aClass38_3 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass17_40.method202(); local14 != null; local14 = this.aClass17_40.method207()) {
			if ((long) arg0 == local14.aLong207) {
				return;
			}
		}
		@Pc(44) Class1 local44 = new Class1();
		local44.aLong207 = arg0;
		this.aClass17_40.method199(local44);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method3292(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub6_Sub10 local15 = this.method3301(arg0, 0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method5582();
			local15.method5577();
			return local23;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
	public void method3296() {
		if (this.aClass38_3 != null) {
			this.aBoolean389 = true;
			if (this.aClass17_39 == null) {
				this.aClass17_39 = new Class17();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
	public void method3297() {
		if (this.aClass17_39 == null || this.method3294() == null) {
			return;
		}
		for (@Pc(26) Class1 local26 = this.aClass17_40.method202(); local26 != null; local26 = this.aClass17_40.method207()) {
			@Pc(32) int local32 = (int) local26.aLong207;
			if (local32 < 0 || this.aClass160_1.anInt3843 <= local32 || this.aClass160_1.anIntArray489[local32] == 0) {
				local26.method5577();
			} else {
				if (this.aByteArray69[local32] == 0) {
					this.method3301(local32, 1);
				}
				if (this.aByteArray69[local32] == -1) {
					this.method3301(local32, 2);
				}
				if (this.aByteArray69[local32] == 1) {
					local26.method5577();
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I")
	public int method3298() {
		if (this.method3294() == null) {
			return this.aClass1_Sub6_Sub10_1 == null ? 0 : this.aClass1_Sub6_Sub10_1.method5581();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)I")
	public int method3300() {
		return this.anInt3976;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lclient!kp;")
	private Class1_Sub6_Sub10 method3301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub6_Sub10 local18 = (Class1_Sub6_Sub10) this.aClass77_30.method1368((long) arg0);
		if (local18 != null && arg1 == 0 && !local18.aBoolean596 && local18.aBoolean595) {
			local18.method5577();
			local18 = null;
		}
		if (local18 == null) {
			if (arg1 == 0) {
				if (this.aClass38_3 == null || this.aByteArray69[arg0] == -1) {
					if (this.aClass92_2.method1780()) {
						return null;
					}
					local18 = this.aClass92_2.method1785(true, (byte) 2, arg0, this.anInt3964);
				} else {
					local18 = this.aClass250_2.method5534(arg0, this.aClass38_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass38_3 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass250_2.method5532(this.aClass38_3, arg0);
			} else if (arg1 == 2) {
				if (this.aClass38_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray69[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass92_2.method1779()) {
					return null;
				}
				local18 = this.aClass92_2.method1785(false, (byte) 2, arg0, this.anInt3964);
			} else {
				throw new RuntimeException();
			}
			this.aClass77_30.method1370((long) arg0, local18);
		}
		if (local18.aBoolean595) {
			return null;
		}
		@Pc(159) byte[] local159 = local18.method5582();
		@Pc(188) int local188;
		@Pc(238) Class1_Sub6_Sub10_Sub1 local238;
		if (!(local18 instanceof Class1_Sub6_Sub10_Sub2)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static224.aCRC32_1.reset();
				Static224.aCRC32_1.update(local159, 0, local159.length - 2);
				local188 = (int) Static224.aCRC32_1.getValue();
				if (this.aClass160_1.anIntArray487[arg0] != local188) {
					throw new RuntimeException();
				}
				this.aClass92_2.anInt2180 = 0;
				this.aClass92_2.anInt2179 = 0;
			} catch (@Pc(213) RuntimeException local213) {
				this.aClass92_2.method1777();
				local18.method5577();
				if (local18.aBoolean596 && !this.aClass92_2.method1780()) {
					local238 = this.aClass92_2.method1785(true, (byte) 2, arg0, this.anInt3964);
					this.aClass77_30.method1370((long) arg0, local238);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass160_1.anIntArray486[arg0] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass160_1.anIntArray486[arg0];
			if (this.aClass38_3 != null) {
				this.aClass250_2.method5531(local159, this.aClass38_3, arg0);
				if (this.aByteArray69[arg0] != 1) {
					this.anInt3976++;
					this.aByteArray69[arg0] = 1;
				}
			}
			if (!local18.aBoolean596) {
				local18.method5577();
			}
			return local18;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static224.aCRC32_1.reset();
			Static224.aCRC32_1.update(local159, 0, local159.length - 2);
			local188 = (int) Static224.aCRC32_1.getValue();
			if (local188 != this.aClass160_1.anIntArray487[arg0]) {
				throw new RuntimeException();
			}
			@Pc(369) int local369 = (local159[local159.length - 1] & 0xFF) + ((local159[local159.length - 2] & 0xFF) << 8);
			if ((this.aClass160_1.anIntArray486[arg0] & 0xFFFF) != local369) {
				throw new RuntimeException();
			}
			if (this.aByteArray69[arg0] != 1) {
				this.anInt3976++;
				this.aByteArray69[arg0] = 1;
			}
			if (!local18.aBoolean596) {
				local18.method5577();
			}
			return local18;
		} catch (@Pc(414) Exception local414) {
			this.aByteArray69[arg0] = -1;
			local18.method5577();
			if (local18.aBoolean596 && !this.aClass92_2.method1780()) {
				local238 = this.aClass92_2.method1785(true, (byte) 2, arg0, this.anInt3964);
				this.aClass77_30.method1370((long) arg0, local238);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I")
	public int method3302() {
		return this.aClass160_1 == null ? 0 : this.aClass160_1.anInt3842;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)I")
	public int method3303() {
		if (this.aClass160_1 == null) {
			return 0;
		} else if (this.aBoolean388) {
			@Pc(25) Class1 local25 = this.aClass17_39.method202();
			return local25 == null ? 0 : (int) local25.aLong207;
		} else {
			return this.aClass160_1.anInt3842;
		}
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public void method3304() {
		if (this.aClass17_39 != null) {
			if (this.method3294() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class1 local31;
			@Pc(37) int local37;
			@Pc(124) Class1 local124;
			if (this.aBoolean388) {
				local26 = true;
				for (local31 = this.aClass17_39.method202(); local31 != null; local31 = this.aClass17_39.method207()) {
					local37 = (int) local31.aLong207;
					if (this.aByteArray69[local37] == 0) {
						this.method3301(local37, 1);
					}
					if (this.aByteArray69[local37] == 0) {
						local26 = false;
					} else {
						local31.method5577();
					}
				}
				while (this.aClass160_1.anIntArray489.length > this.anInt3977) {
					if (this.aClass160_1.anIntArray489[this.anInt3977] == 0) {
						this.anInt3977++;
					} else {
						if (this.aClass250_2.anInt6372 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray69[this.anInt3977] == 0) {
							this.method3301(this.anInt3977, 1);
						}
						if (this.aByteArray69[this.anInt3977] == 0) {
							local124 = new Class1();
							local124.aLong207 = this.anInt3977;
							this.aClass17_39.method199(local124);
							local26 = false;
						}
						this.anInt3977++;
					}
				}
				if (local26) {
					this.anInt3977 = 0;
					this.aBoolean388 = false;
				}
			} else if (this.aBoolean389) {
				local26 = true;
				for (local31 = this.aClass17_39.method202(); local31 != null; local31 = this.aClass17_39.method207()) {
					local37 = (int) local31.aLong207;
					if (this.aByteArray69[local37] != 1) {
						this.method3301(local37, 2);
					}
					if (this.aByteArray69[local37] == 1) {
						local31.method5577();
					} else {
						local26 = false;
					}
				}
				while (this.anInt3977 < this.aClass160_1.anIntArray489.length) {
					if (this.aClass160_1.anIntArray489[this.anInt3977] == 0) {
						this.anInt3977++;
					} else {
						if (this.aClass92_2.method1779()) {
							local26 = false;
							break;
						}
						if (this.aByteArray69[this.anInt3977] != 1) {
							this.method3301(this.anInt3977, 2);
						}
						if (this.aByteArray69[this.anInt3977] != 1) {
							local124 = new Class1();
							local124.aLong207 = this.anInt3977;
							this.aClass17_39.method199(local124);
							local26 = false;
						}
						this.anInt3977++;
					}
				}
				if (local26) {
					this.anInt3977 = 0;
					this.aBoolean389 = false;
				}
			} else {
				this.aClass17_39 = null;
			}
		}
		if (!this.aBoolean390 || Static378.method5293() < this.aLong132) {
			return;
		}
		for (@Pc(323) Class1_Sub6_Sub10 local323 = (Class1_Sub6_Sub10) this.aClass77_30.method1359(); local323 != null; local323 = (Class1_Sub6_Sub10) this.aClass77_30.method1360()) {
			if (!local323.aBoolean595) {
				if (local323.aBoolean597) {
					if (!local323.aBoolean596) {
						throw new RuntimeException();
					}
					local323.method5577();
				} else {
					local323.aBoolean597 = true;
				}
			}
		}
		this.aLong132 = Static378.method5293() + 1000L;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lclient!ms;")
	@Override
	public Class160 method3294() {
		if (this.aClass160_1 != null) {
			return this.aClass160_1;
		}
		if (this.aClass1_Sub6_Sub10_1 == null) {
			if (this.aClass92_2.method1780()) {
				return null;
			}
			this.aClass1_Sub6_Sub10_1 = this.aClass92_2.method1785(true, (byte) 0, this.anInt3964, 255);
		}
		if (this.aClass1_Sub6_Sub10_1.aBoolean595) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass1_Sub6_Sub10_1.method5582();
		if (this.aClass1_Sub6_Sub10_1 instanceof Class1_Sub6_Sub10_Sub2) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass160_1 = new Class160(local50, this.anInt3969);
				if (this.anInt3966 != this.aClass160_1.anInt3844) {
					throw new RuntimeException();
				}
			} catch (@Pc(83) RuntimeException local83) {
				this.aClass160_1 = null;
				if (this.aClass92_2.method1780()) {
					this.aClass1_Sub6_Sub10_1 = null;
				} else {
					this.aClass1_Sub6_Sub10_1 = this.aClass92_2.method1785(true, (byte) 0, this.anInt3964, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass160_1 = new Class160(local50, this.anInt3969);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass92_2.method1777();
				this.aClass160_1 = null;
				if (this.aClass92_2.method1780()) {
					this.aClass1_Sub6_Sub10_1 = null;
				} else {
					this.aClass1_Sub6_Sub10_1 = this.aClass92_2.method1785(true, (byte) 0, this.anInt3964, 255);
				}
				return null;
			}
			if (this.aClass38_2 != null) {
				this.aClass250_2.method5531(local50, this.aClass38_2, this.anInt3964);
			}
		}
		this.aClass1_Sub6_Sub10_1 = null;
		if (this.aClass38_3 != null) {
			this.anInt3976 = 0;
			this.aByteArray69 = new byte[this.aClass160_1.anInt3843];
		}
		return this.aClass160_1;
	}
}
