import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "Lclient!of;")
	private Class125 aClass125_2;

	@OriginalMember(owner = "client!rg", name = "S", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	private int anInt4719 = 0;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "Lclient!ii;")
	private Class79 aClass79_18 = new Class79(16);

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
	private int anInt4735 = 0;

	@OriginalMember(owner = "client!rg", name = "U", descriptor = "Lclient!a;")
	private Class1 aClass1_22 = new Class1();

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "J")
	private long aLong251 = 0L;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "Lclient!co;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	private int anInt4730;

	@OriginalMember(owner = "client!rg", name = "Q", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!rg", name = "R", descriptor = "Lclient!a;")
	private Class1 aClass1_21;

	@OriginalMember(owner = "client!rg", name = "W", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Lclient!ig;")
	private Class78 aClass78_3;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "Lclient!b;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "Lclient!co;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	private int anInt4728;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
	private int anInt4722;

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Lclient!sl;")
	private Class2_Sub3_Sub14 aClass2_Sub3_Sub14_1;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILclient!co;Lclient!co;Lclient!ig;Lclient!b;IIZ)V")
	public Class63_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class78 arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass35_4 = arg1;
		this.anInt4730 = arg0;
		if (this.aClass35_4 == null) {
			this.aBoolean396 = false;
		} else {
			this.aBoolean396 = true;
			this.aClass1_21 = new Class1();
		}
		this.aBoolean398 = arg7;
		this.aClass78_3 = arg3;
		this.aClass12_2 = arg4;
		this.aClass35_3 = arg2;
		this.anInt4728 = arg6;
		this.anInt4722 = arg5;
		if (this.aClass35_3 != null) {
			this.aClass2_Sub3_Sub14_1 = this.aClass12_2.method314(this.anInt4730, this.aClass35_3);
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)I")
	public int method3800() {
		if (this.aClass125_2 == null) {
			return 0;
		} else if (this.aBoolean396) {
			@Pc(31) Class2 local31 = this.aClass1_21.method13();
			return local31 == null ? 0 : (int) local31.aLong315;
		} else {
			return this.aClass125_2.anInt3954;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
	@Override
	public void method3794(@OriginalArg(1) int arg0) {
		if (this.aClass35_4 == null) {
			return;
		}
		@Pc(18) Class2 local18;
		for (local18 = this.aClass1_22.method13(); local18 != null; local18 = this.aClass1_22.method9()) {
			if (local18.aLong315 == (long) arg0) {
				return;
			}
		}
		local18 = new Class2();
		local18.aLong315 = arg0;
		this.aClass1_22.method11(local18);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I")
	public int method3802() {
		if (this.method3792() == null) {
			return this.aClass2_Sub3_Sub14_1 == null ? 0 : this.aClass2_Sub3_Sub14_1.method3057();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I")
	public int method3804() {
		return this.aClass125_2 == null ? 0 : this.aClass125_2.anInt3954;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)Lclient!of;")
	@Override
	public Class125 method3792() {
		if (this.aClass125_2 != null) {
			return this.aClass125_2;
		}
		if (this.aClass2_Sub3_Sub14_1 == null) {
			if (this.aClass78_3.method1957()) {
				return null;
			}
			this.aClass2_Sub3_Sub14_1 = this.aClass78_3.method1952((byte) 0, true, this.anInt4730, 255);
		}
		if (this.aClass2_Sub3_Sub14_1.aBoolean320) {
			return null;
		}
		@Pc(52) byte[] local52 = this.aClass2_Sub3_Sub14_1.method3053();
		if (this.aClass2_Sub3_Sub14_1 instanceof Class2_Sub3_Sub14_Sub2) {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass125_2 = new Class125(local52, this.anInt4722);
				if (this.aClass125_2.anInt3953 != this.anInt4728) {
					throw new RuntimeException();
				}
			} catch (@Pc(88) RuntimeException local88) {
				this.aClass125_2 = null;
				if (this.aClass78_3.method1957()) {
					this.aClass2_Sub3_Sub14_1 = null;
				} else {
					this.aClass2_Sub3_Sub14_1 = this.aClass78_3.method1952((byte) 0, true, this.anInt4730, 255);
				}
				return null;
			}
		} else {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass125_2 = new Class125(local52, this.anInt4722);
			} catch (@Pc(132) RuntimeException local132) {
				this.aClass78_3.method1954();
				this.aClass125_2 = null;
				if (this.aClass78_3.method1957()) {
					this.aClass2_Sub3_Sub14_1 = null;
				} else {
					this.aClass2_Sub3_Sub14_1 = this.aClass78_3.method1952((byte) 0, true, this.anInt4730, 255);
				}
				return null;
			}
			if (this.aClass35_3 != null) {
				this.aClass12_2.method307(this.anInt4730, this.aClass35_3, local52);
			}
		}
		if (this.aClass35_4 != null) {
			this.aByteArray51 = new byte[this.aClass125_2.anInt3945];
			this.anInt4719 = 0;
		}
		this.aClass2_Sub3_Sub14_1 = null;
		return this.aClass125_2;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
	public void method3805() {
		if (this.aClass1_21 != null) {
			if (this.method3792() == null) {
				return;
			}
			@Pc(19) boolean local19;
			@Pc(24) Class2 local24;
			@Pc(30) int local30;
			if (this.aBoolean396) {
				local19 = true;
				for (local24 = this.aClass1_21.method13(); local24 != null; local24 = this.aClass1_21.method9()) {
					local30 = (int) local24.aLong315;
					if (this.aByteArray51[local30] == 0) {
						this.method3807(1, local30);
					}
					if (this.aByteArray51[local30] == 0) {
						local19 = false;
					} else {
						local24.method4926();
					}
				}
				while (this.aClass125_2.anIntArray316.length > this.anInt4735) {
					if (this.aClass125_2.anIntArray316[this.anInt4735] == 0) {
						this.anInt4735++;
					} else {
						if (this.aClass12_2.anInt350 >= 250) {
							local19 = false;
							break;
						}
						if (this.aByteArray51[this.anInt4735] == 0) {
							this.method3807(1, this.anInt4735);
						}
						if (this.aByteArray51[this.anInt4735] == 0) {
							local19 = false;
							local24 = new Class2();
							local24.aLong315 = this.anInt4735;
							this.aClass1_21.method11(local24);
						}
						this.anInt4735++;
					}
				}
				if (local19) {
					this.anInt4735 = 0;
					this.aBoolean396 = false;
				}
			} else if (this.aBoolean397) {
				local19 = true;
				for (local24 = this.aClass1_21.method13(); local24 != null; local24 = this.aClass1_21.method9()) {
					local30 = (int) local24.aLong315;
					if (this.aByteArray51[local30] != 1) {
						this.method3807(2, local30);
					}
					if (this.aByteArray51[local30] == 1) {
						local24.method4926();
					} else {
						local19 = false;
					}
				}
				while (this.aClass125_2.anIntArray316.length > this.anInt4735) {
					if (this.aClass125_2.anIntArray316[this.anInt4735] == 0) {
						this.anInt4735++;
					} else {
						if (this.aClass78_3.method1955()) {
							local19 = false;
							break;
						}
						if (this.aByteArray51[this.anInt4735] != 1) {
							this.method3807(2, this.anInt4735);
						}
						if (this.aByteArray51[this.anInt4735] != 1) {
							local19 = false;
							local24 = new Class2();
							local24.aLong315 = this.anInt4735;
							this.aClass1_21.method11(local24);
						}
						this.anInt4735++;
					}
				}
				if (local19) {
					this.anInt4735 = 0;
					this.aBoolean397 = false;
				}
			} else {
				this.aClass1_21 = null;
			}
		}
		if (!this.aBoolean398 || this.aLong251 > Static6.method126()) {
			return;
		}
		for (@Pc(330) Class2_Sub3_Sub14 local330 = (Class2_Sub3_Sub14) this.aClass79_18.method1992(); local330 != null; local330 = (Class2_Sub3_Sub14) this.aClass79_18.method1991()) {
			if (!local330.aBoolean320) {
				if (local330.aBoolean321) {
					if (!local330.aBoolean322) {
						throw new RuntimeException();
					}
					local330.method4926();
				} else {
					local330.aBoolean321 = true;
				}
			}
		}
		this.aLong251 = Static6.method126() + 1000L;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method3797(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub3_Sub14 local9 = this.method3807(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method3053();
			local9.method4926();
			return local18;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Lclient!sl;")
	private Class2_Sub3_Sub14 method3807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub3_Sub14 local9 = (Class2_Sub3_Sub14) this.aClass79_18.method2002((long) arg1);
		if (local9 != null && arg0 == 0 && !local9.aBoolean322 && local9.aBoolean320) {
			local9.method4926();
			local9 = null;
		}
		if (local9 == null) {
			if (arg0 == 0) {
				if (this.aClass35_4 == null || this.aByteArray51[arg1] == -1) {
					if (this.aClass78_3.method1957()) {
						return null;
					}
					local9 = this.aClass78_3.method1952((byte) 2, true, arg1, this.anInt4730);
				} else {
					local9 = this.aClass12_2.method314(arg1, this.aClass35_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass35_4 == null) {
					throw new RuntimeException();
				}
				local9 = this.aClass12_2.method306(arg1, this.aClass35_4);
			} else if (arg0 == 2) {
				if (this.aClass35_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray51[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass78_3.method1955()) {
					return null;
				}
				local9 = this.aClass78_3.method1952((byte) 2, false, arg1, this.anInt4730);
			} else {
				throw new RuntimeException();
			}
			this.aClass79_18.method1994((long) arg1, local9);
		}
		if (local9.aBoolean320) {
			return null;
		}
		@Pc(165) byte[] local165 = local9.method3053();
		@Pc(199) int local199;
		@Pc(308) Class2_Sub3_Sub14_Sub1 local308;
		if (!(local9 instanceof Class2_Sub3_Sub14_Sub2)) {
			try {
				if (local165 == null || local165.length <= 2) {
					throw new RuntimeException();
				}
				Static14.aCRC32_1.reset();
				Static14.aCRC32_1.update(local165, 0, local165.length - 2);
				local199 = (int) Static14.aCRC32_1.getValue();
				if (local199 != this.aClass125_2.anIntArray322[arg1]) {
					throw new RuntimeException();
				}
				this.aClass78_3.anInt2282 = 0;
				this.aClass78_3.anInt2283 = 0;
			} catch (@Pc(368) RuntimeException local368) {
				this.aClass78_3.method1954();
				local9.method4926();
				if (local9.aBoolean322 && !this.aClass78_3.method1957()) {
					local308 = this.aClass78_3.method1952((byte) 2, true, arg1, this.anInt4730);
					this.aClass79_18.method1994((long) arg1, local308);
				}
				return null;
			}
			local165[local165.length - 2] = (byte) (this.aClass125_2.anIntArray319[arg1] >>> 8);
			local165[local165.length - 1] = (byte) this.aClass125_2.anIntArray319[arg1];
			if (this.aClass35_4 != null) {
				this.aClass12_2.method307(arg1, this.aClass35_4, local165);
				if (this.aByteArray51[arg1] != 1) {
					this.anInt4719++;
					this.aByteArray51[arg1] = 1;
				}
			}
			if (!local9.aBoolean322) {
				local9.method4926();
			}
			return local9;
		}
		try {
			if (local165 == null || local165.length <= 2) {
				throw new RuntimeException();
			}
			Static14.aCRC32_1.reset();
			Static14.aCRC32_1.update(local165, 0, local165.length - 2);
			local199 = (int) Static14.aCRC32_1.getValue();
			if (local199 != this.aClass125_2.anIntArray322[arg1]) {
				throw new RuntimeException();
			}
			@Pc(230) int local230 = ((local165[local165.length - 2] & 0xFF) << 8) + (local165[local165.length - 1] & 0xFF);
			if (local230 != (this.aClass125_2.anIntArray319[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray51[arg1] != 1) {
				if (this.aByteArray51[arg1] != 0) {
				}
				this.anInt4719++;
				this.aByteArray51[arg1] = 1;
			}
			if (!local9.aBoolean322) {
				local9.method4926();
			}
			return local9;
		} catch (@Pc(281) Exception local281) {
			this.aByteArray51[arg1] = -1;
			local9.method4926();
			if (local9.aBoolean322 && !this.aClass78_3.method1957()) {
				local308 = this.aClass78_3.method1952((byte) 2, true, arg1, this.anInt4730);
				this.aClass79_18.method1994((long) arg1, local308);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)I")
	public int method3809() {
		return this.anInt4719;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(BI)I")
	@Override
	public int method3796(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub3_Sub14 local16 = (Class2_Sub3_Sub14) this.aClass79_18.method2002((long) arg0);
		return local16 == null ? 0 : local16.method3057();
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(Z)V")
	public void method3810() {
		if (this.aClass35_4 != null) {
			this.aBoolean397 = true;
			if (this.aClass1_21 == null) {
				this.aClass1_21 = new Class1();
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)V")
	public void method3811() {
		if (this.aClass1_21 == null || this.method3792() == null) {
			return;
		}
		for (@Pc(24) Class2 local24 = this.aClass1_22.method13(); local24 != null; local24 = this.aClass1_22.method9()) {
			@Pc(31) int local31 = (int) local24.aLong315;
			if (local31 < 0 || local31 >= this.aClass125_2.anInt3945 || this.aClass125_2.anIntArray316[local31] == 0) {
				local24.method4926();
			} else {
				if (this.aByteArray51[local31] == 0) {
					this.method3807(1, local31);
				}
				if (this.aByteArray51[local31] == -1) {
					this.method3807(2, local31);
				}
				if (this.aByteArray51[local31] == 1) {
					local24.method4926();
				}
			}
		}
	}
}
