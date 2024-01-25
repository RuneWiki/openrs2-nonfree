import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "Lclient!lb;")
	private Class147 aClass147_2;

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!nr", name = "R", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
	private int anInt4608 = 0;

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "Lclient!cv;")
	private final Class51 aClass51_15 = new Class51(16);

	@OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
	private int anInt4618 = 0;

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "Lclient!ko;")
	private final Class142 aClass142_27 = new Class142();

	@OriginalMember(owner = "client!nr", name = "T", descriptor = "J")
	private long aLong134 = 0L;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "Lclient!kn;")
	private final Class141 aClass141_2;

	@OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
	private final int anInt4615;

	@OriginalMember(owner = "client!nr", name = "P", descriptor = "Z")
	private boolean aBoolean363;

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "Lclient!ko;")
	private Class142 aClass142_28;

	@OriginalMember(owner = "client!nr", name = "L", descriptor = "Lclient!kn;")
	private final Class141 aClass141_3;

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
	private final int anInt4613;

	@OriginalMember(owner = "client!nr", name = "S", descriptor = "Z")
	private final boolean aBoolean365;

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
	private final int anInt4614;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "Lclient!ik;")
	private final Class119 aClass119_2;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "Lclient!ml;")
	private final Class164 aClass164_4;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "Lclient!t;")
	private Class1_Sub1_Sub11 aClass1_Sub1_Sub11_1;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILclient!kn;Lclient!kn;Lclient!ml;Lclient!ik;IIZ)V")
	public Class113_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class141 arg2, @OriginalArg(3) Class164 arg3, @OriginalArg(4) Class119 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass141_2 = arg1;
		this.anInt4615 = arg0;
		if (this.aClass141_2 == null) {
			this.aBoolean363 = false;
		} else {
			this.aBoolean363 = true;
			this.aClass142_28 = new Class142();
		}
		this.aClass141_3 = arg2;
		this.anInt4613 = arg6;
		this.aBoolean365 = arg7;
		this.anInt4614 = arg5;
		this.aClass119_2 = arg4;
		this.aClass164_4 = arg3;
		if (this.aClass141_3 != null) {
			this.aClass1_Sub1_Sub11_1 = this.aClass119_2.method2632(this.anInt4615, this.aClass141_3);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)I")
	public int method3790() {
		return this.anInt4608;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
	public void method3791() {
		if (this.aClass142_28 != null) {
			if (this.method3787() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class1 local23;
			@Pc(29) int local29;
			@Pc(119) Class1 local119;
			if (this.aBoolean363) {
				local18 = true;
				for (local23 = this.aClass142_28.method3199(); local23 != null; local23 = this.aClass142_28.method3198()) {
					local29 = (int) local23.aLong237;
					if (this.aByteArray56[local29] == 0) {
						this.method3793(local29, 1);
					}
					if (this.aByteArray56[local29] == 0) {
						local18 = false;
					} else {
						local23.method5965();
					}
				}
				while (this.aClass147_2.anIntArray304.length > this.anInt4618) {
					if (this.aClass147_2.anIntArray304[this.anInt4618] == 0) {
						this.anInt4618++;
					} else {
						if (this.aClass119_2.anInt3031 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray56[this.anInt4618] == 0) {
							this.method3793(this.anInt4618, 1);
						}
						if (this.aByteArray56[this.anInt4618] == 0) {
							local119 = new Class1();
							local119.aLong237 = this.anInt4618;
							local18 = false;
							this.aClass142_28.method3212(local119);
						}
						this.anInt4618++;
					}
				}
				if (local18) {
					this.anInt4618 = 0;
					this.aBoolean363 = false;
				}
			} else if (this.aBoolean364) {
				local18 = true;
				for (local23 = this.aClass142_28.method3199(); local23 != null; local23 = this.aClass142_28.method3198()) {
					local29 = (int) local23.aLong237;
					if (this.aByteArray56[local29] != 1) {
						this.method3793(local29, 2);
					}
					if (this.aByteArray56[local29] == 1) {
						local23.method5965();
					} else {
						local18 = false;
					}
				}
				while (this.aClass147_2.anIntArray304.length > this.anInt4618) {
					if (this.aClass147_2.anIntArray304[this.anInt4618] == 0) {
						this.anInt4618++;
					} else {
						if (this.aClass164_4.method3581()) {
							local18 = false;
							break;
						}
						if (this.aByteArray56[this.anInt4618] != 1) {
							this.method3793(this.anInt4618, 2);
						}
						if (this.aByteArray56[this.anInt4618] != 1) {
							local119 = new Class1();
							local119.aLong237 = this.anInt4618;
							local18 = false;
							this.aClass142_28.method3212(local119);
						}
						this.anInt4618++;
					}
				}
				if (local18) {
					this.aBoolean364 = false;
					this.anInt4618 = 0;
				}
			} else {
				this.aClass142_28 = null;
			}
		}
		if (!this.aBoolean365 || Static107.method1707() < this.aLong134) {
			return;
		}
		for (@Pc(322) Class1_Sub1_Sub11 local322 = (Class1_Sub1_Sub11) this.aClass51_15.method928(); local322 != null; local322 = (Class1_Sub1_Sub11) this.aClass51_15.method926()) {
			if (!local322.aBoolean649) {
				if (local322.aBoolean648) {
					if (!local322.aBoolean650) {
						throw new RuntimeException();
					}
					local322.method5965();
				} else {
					local322.aBoolean648 = true;
				}
			}
		}
		this.aLong134 = Static107.method1707() + 1000L;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)V")
	@Override
	public void method3784(@OriginalArg(1) int arg0) {
		if (this.aClass141_2 == null) {
			return;
		}
		for (@Pc(21) Class1 local21 = this.aClass142_27.method3199(); local21 != null; local21 = this.aClass142_27.method3198()) {
			if (local21.aLong237 == (long) arg0) {
				return;
			}
		}
		@Pc(41) Class1 local41 = new Class1();
		local41.aLong237 = arg0;
		this.aClass142_27.method3212(local41);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Lclient!t;")
	private Class1_Sub1_Sub11 method3793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class1_Sub1_Sub11 local19 = (Class1_Sub1_Sub11) this.aClass51_15.method930((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.aBoolean650 && local19.aBoolean649) {
			local19.method5965();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aClass141_2 == null || this.aByteArray56[arg0] == -1) {
					if (this.aClass164_4.method3578()) {
						return null;
					}
					local19 = this.aClass164_4.method3588(this.anInt4615, (byte) 2, true, arg0);
				} else {
					local19 = this.aClass119_2.method2632(arg0, this.aClass141_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass141_2 == null) {
					throw new RuntimeException();
				}
				local19 = this.aClass119_2.method2635(arg0, this.aClass141_2);
			} else if (arg1 == 2) {
				if (this.aClass141_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray56[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass164_4.method3581()) {
					return null;
				}
				local19 = this.aClass164_4.method3588(this.anInt4615, (byte) 2, false, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass51_15.method931(local19, (long) arg0);
		}
		if (local19.aBoolean649) {
			return null;
		}
		@Pc(163) byte[] local163 = local19.method5898();
		@Pc(192) int local192;
		@Pc(246) Class1_Sub1_Sub11_Sub2 local246;
		if (!(local19 instanceof Class1_Sub1_Sub11_Sub1)) {
			try {
				if (local163 == null || local163.length <= 2) {
					throw new RuntimeException();
				}
				Static415.aCRC32_1.reset();
				Static415.aCRC32_1.update(local163, 0, local163.length - 2);
				local192 = (int) Static415.aCRC32_1.getValue();
				if (local192 != this.aClass147_2.anIntArray308[arg0]) {
					throw new RuntimeException();
				}
				this.aClass164_4.anInt4318 = 0;
				this.aClass164_4.anInt4319 = 0;
			} catch (@Pc(217) RuntimeException local217) {
				this.aClass164_4.method3580();
				local19.method5965();
				if (local19.aBoolean650 && !this.aClass164_4.method3578()) {
					local246 = this.aClass164_4.method3588(this.anInt4615, (byte) 2, true, arg0);
					this.aClass51_15.method931(local246, (long) arg0);
				}
				return null;
			}
			local163[local163.length - 2] = (byte) (this.aClass147_2.anIntArray305[arg0] >>> 8);
			local163[local163.length - 1] = (byte) this.aClass147_2.anIntArray305[arg0];
			if (this.aClass141_2 != null) {
				this.aClass119_2.method2631(arg0, this.aClass141_2, local163);
				if (this.aByteArray56[arg0] != 1) {
					this.anInt4608++;
					this.aByteArray56[arg0] = 1;
				}
			}
			if (!local19.aBoolean650) {
				local19.method5965();
			}
			return local19;
		}
		try {
			if (local163 == null || local163.length <= 2) {
				throw new RuntimeException();
			}
			Static415.aCRC32_1.reset();
			Static415.aCRC32_1.update(local163, 0, local163.length - 2);
			local192 = (int) Static415.aCRC32_1.getValue();
			if (local192 != this.aClass147_2.anIntArray308[arg0]) {
				throw new RuntimeException();
			}
			@Pc(383) int local383 = (local163[local163.length - 1] & 0xFF) + ((local163[local163.length - 2] & 0xFF) << 8);
			if (local383 != (this.aClass147_2.anIntArray305[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray56[arg0] != 1) {
				this.anInt4608++;
				this.aByteArray56[arg0] = 1;
			}
			if (!local19.aBoolean650) {
				local19.method5965();
			}
			return local19;
		} catch (@Pc(424) Exception local424) {
			this.aByteArray56[arg0] = -1;
			local19.method5965();
			if (local19.aBoolean650 && !this.aClass164_4.method3578()) {
				local246 = this.aClass164_4.method3588(this.anInt4615, (byte) 2, true, arg0);
				this.aClass51_15.method931(local246, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I")
	public int method3794() {
		if (this.aClass147_2 == null) {
			return 0;
		} else if (this.aBoolean363) {
			@Pc(28) Class1 local28 = this.aClass142_28.method3199();
			return local28 == null ? 0 : (int) local28.aLong237;
		} else {
			return this.aClass147_2.anInt3879;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)I")
	@Override
	public int method3786(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub11 local16 = (Class1_Sub1_Sub11) this.aClass51_15.method930((long) arg0);
		return local16 == null ? 0 : local16.method5901();
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V")
	public void method3795() {
		if (this.aClass142_28 == null || this.method3787() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass142_27.method3199(); local19 != null; local19 = this.aClass142_27.method3198()) {
			@Pc(31) int local31 = (int) local19.aLong237;
			if (local31 < 0 || local31 >= this.aClass147_2.anInt3881 || this.aClass147_2.anIntArray304[local31] == 0) {
				local19.method5965();
			} else {
				if (this.aByteArray56[local31] == 0) {
					this.method3793(local31, 1);
				}
				if (this.aByteArray56[local31] == -1) {
					this.method3793(local31, 2);
				}
				if (this.aByteArray56[local31] == 1) {
					local19.method5965();
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(Z)I")
	public int method3796() {
		if (this.method3787() == null) {
			return this.aClass1_Sub1_Sub11_1 == null ? 0 : this.aClass1_Sub1_Sub11_1.method5901();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)Lclient!lb;")
	@Override
	public Class147 method3787() {
		if (this.aClass147_2 != null) {
			return this.aClass147_2;
		}
		if (this.aClass1_Sub1_Sub11_1 == null) {
			if (this.aClass164_4.method3578()) {
				return null;
			}
			this.aClass1_Sub1_Sub11_1 = this.aClass164_4.method3588(255, (byte) 0, true, this.anInt4615);
		}
		if (this.aClass1_Sub1_Sub11_1.aBoolean649) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass1_Sub1_Sub11_1.method5898();
		if (this.aClass1_Sub1_Sub11_1 instanceof Class1_Sub1_Sub11_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass147_2 = new Class147(local48, this.anInt4614);
				if (this.anInt4613 != this.aClass147_2.anInt3883) {
					throw new RuntimeException();
				}
			} catch (@Pc(81) RuntimeException local81) {
				this.aClass147_2 = null;
				if (this.aClass164_4.method3578()) {
					this.aClass1_Sub1_Sub11_1 = null;
				} else {
					this.aClass1_Sub1_Sub11_1 = this.aClass164_4.method3588(255, (byte) 0, true, this.anInt4615);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass147_2 = new Class147(local48, this.anInt4614);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass164_4.method3580();
				this.aClass147_2 = null;
				if (this.aClass164_4.method3578()) {
					this.aClass1_Sub1_Sub11_1 = null;
				} else {
					this.aClass1_Sub1_Sub11_1 = this.aClass164_4.method3588(255, (byte) 0, true, this.anInt4615);
				}
				return null;
			}
			if (this.aClass141_3 != null) {
				this.aClass119_2.method2631(this.anInt4615, this.aClass141_3, local48);
			}
		}
		if (this.aClass141_2 != null) {
			this.aByteArray56 = new byte[this.aClass147_2.anInt3881];
			this.anInt4608 = 0;
		}
		this.aClass1_Sub1_Sub11_1 = null;
		return this.aClass147_2;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)I")
	public int method3797() {
		return this.aClass147_2 == null ? 0 : this.aClass147_2.anInt3879;
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V")
	public void method3798() {
		if (this.aClass141_2 != null) {
			this.aBoolean364 = true;
			if (this.aClass142_28 == null) {
				this.aClass142_28 = new Class142();
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method3788(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub1_Sub11 local14 = this.method3793(arg0, 0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method5898();
			local14.method5965();
			return local22;
		}
	}
}
