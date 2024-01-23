import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class153_Sub1 extends Class153 {

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Lclient!bd;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "Z")
	private boolean aBoolean318;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	private int anInt4936 = 0;

	@OriginalMember(owner = "client!ti", name = "M", descriptor = "Lclient!lb;")
	private Class97 aClass97_20 = new Class97(16);

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	private int anInt4941 = 0;

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "Lclient!an;")
	private Class10 aClass10_55 = new Class10();

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "J")
	private long aLong175 = 0L;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!jg;")
	private Class79 aClass79_5;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	private int anInt4937;

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "Z")
	private boolean aBoolean317;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "Lclient!an;")
	private Class10 aClass10_56;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
	private int anInt4932;

	@OriginalMember(owner = "client!ti", name = "U", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	private int anInt4927;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Lclient!ml;")
	private Class113 aClass113_3;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "Lclient!a;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "Lclient!jg;")
	private Class79 aClass79_6;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "Lclient!ba;")
	private Class4_Sub2_Sub4 aClass4_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(ILclient!jg;Lclient!jg;Lclient!ml;Lclient!a;IIZ)V")
	public Class153_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass79_5 = arg1;
		this.anInt4937 = arg0;
		if (this.aClass79_5 == null) {
			this.aBoolean317 = false;
		} else {
			this.aBoolean317 = true;
			this.aClass10_56 = new Class10();
		}
		this.anInt4932 = arg5;
		this.aBoolean319 = arg7;
		this.anInt4927 = arg6;
		this.aClass113_3 = arg3;
		this.aClass1_6 = arg4;
		this.aClass79_6 = arg2;
		if (this.aClass79_6 != null) {
			this.aClass4_Sub2_Sub4_1 = this.aClass1_6.method4(this.anInt4937, this.aClass79_6);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lclient!bd;")
	@Override
	public Class13 method3910() {
		if (this.aClass13_2 != null) {
			return this.aClass13_2;
		}
		if (this.aClass4_Sub2_Sub4_1 == null) {
			if (this.aClass113_3.method2672()) {
				return null;
			}
			this.aClass4_Sub2_Sub4_1 = this.aClass113_3.method2686(255, this.anInt4937, true, (byte) 0);
		}
		if (this.aClass4_Sub2_Sub4_1.aBoolean157) {
			return null;
		}
		@Pc(45) byte[] local45 = this.aClass4_Sub2_Sub4_1.method1606();
		if (this.aClass4_Sub2_Sub4_1 instanceof Class4_Sub2_Sub4_Sub2) {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass13_2 = new Class13(local45, this.anInt4932);
				if (this.anInt4927 != this.aClass13_2.anInt316) {
					throw new RuntimeException();
				}
			} catch (@Pc(141) RuntimeException local141) {
				this.aClass13_2 = null;
				if (this.aClass113_3.method2672()) {
					this.aClass4_Sub2_Sub4_1 = null;
				} else {
					this.aClass4_Sub2_Sub4_1 = this.aClass113_3.method2686(255, this.anInt4937, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass13_2 = new Class13(local45, this.anInt4932);
			} catch (@Pc(65) RuntimeException local65) {
				this.aClass113_3.method2684();
				this.aClass13_2 = null;
				if (this.aClass113_3.method2672()) {
					this.aClass4_Sub2_Sub4_1 = null;
				} else {
					this.aClass4_Sub2_Sub4_1 = this.aClass113_3.method2686(255, this.anInt4937, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass79_6 != null) {
				this.aClass1_6.method7(this.anInt4937, local45, this.aClass79_6);
			}
		}
		this.aClass4_Sub2_Sub4_1 = null;
		if (this.aClass79_5 != null) {
			this.anInt4936 = 0;
			this.aByteArray68 = new byte[this.aClass13_2.anInt310];
		}
		return this.aClass13_2;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I")
	public int method3914() {
		return this.aClass13_2 == null ? 0 : this.aClass13_2.anInt309;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
	@Override
	public int method3904(@OriginalArg(0) int arg0) {
		@Pc(7) Class4_Sub2_Sub4 local7 = (Class4_Sub2_Sub4) this.aClass97_20.method2360((long) arg0);
		return local7 == null ? 0 : local7.method1601();
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
	public int method3918() {
		if (this.aClass13_2 == null) {
			return 0;
		} else if (this.aBoolean317) {
			@Pc(27) Class4 local27 = this.aClass10_56.method190();
			return local27 == null ? 0 : (int) local27.aLong200;
		} else {
			return this.aClass13_2.anInt309;
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)V")
	@Override
	public void method3907(@OriginalArg(1) int arg0) {
		if (this.aClass79_5 == null) {
			return;
		}
		@Pc(23) Class4 local23;
		for (local23 = this.aClass10_55.method190(); local23 != null; local23 = this.aClass10_55.method191()) {
			if ((long) arg0 == local23.aLong200) {
				return;
			}
		}
		local23 = new Class4();
		local23.aLong200 = arg0;
		this.aClass10_55.method184(local23);
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	public void method3919() {
		if (this.aClass10_56 != null) {
			if (this.method3910() == null) {
				return;
			}
			@Pc(31) boolean local31;
			@Pc(36) Class4 local36;
			@Pc(42) int local42;
			if (this.aBoolean317) {
				local31 = true;
				for (local36 = this.aClass10_56.method190(); local36 != null; local36 = this.aClass10_56.method191()) {
					local42 = (int) local36.aLong200;
					if (this.aByteArray68[local42] == 0) {
						this.method3925(local42, 1);
					}
					if (this.aByteArray68[local42] == 0) {
						local31 = false;
					} else {
						local36.method4391();
					}
				}
				while (this.aClass13_2.anIntArray35.length > this.anInt4941) {
					if (this.aClass13_2.anIntArray35[this.anInt4941] == 0) {
						this.anInt4941++;
					} else {
						if (this.aClass1_6.anInt9 >= 250) {
							local31 = false;
							break;
						}
						if (this.aByteArray68[this.anInt4941] == 0) {
							this.method3925(this.anInt4941, 1);
						}
						if (this.aByteArray68[this.anInt4941] == 0) {
							local31 = false;
							local36 = new Class4();
							local36.aLong200 = this.anInt4941;
							this.aClass10_56.method184(local36);
						}
						this.anInt4941++;
					}
				}
				if (local31) {
					this.aBoolean317 = false;
					this.anInt4941 = 0;
				}
			} else if (this.aBoolean318) {
				local31 = true;
				for (local36 = this.aClass10_56.method190(); local36 != null; local36 = this.aClass10_56.method191()) {
					local42 = (int) local36.aLong200;
					if (this.aByteArray68[local42] != 1) {
						this.method3925(local42, 2);
					}
					if (this.aByteArray68[local42] == 1) {
						local36.method4391();
					} else {
						local31 = false;
					}
				}
				while (this.anInt4941 < this.aClass13_2.anIntArray35.length) {
					if (this.aClass13_2.anIntArray35[this.anInt4941] == 0) {
						this.anInt4941++;
					} else {
						if (this.aClass113_3.method2685()) {
							local31 = false;
							break;
						}
						if (this.aByteArray68[this.anInt4941] != 1) {
							this.method3925(this.anInt4941, 2);
						}
						if (this.aByteArray68[this.anInt4941] != 1) {
							local36 = new Class4();
							local36.aLong200 = this.anInt4941;
							this.aClass10_56.method184(local36);
							local31 = false;
						}
						this.anInt4941++;
					}
				}
				if (local31) {
					this.anInt4941 = 0;
					this.aBoolean318 = false;
				}
			} else {
				this.aClass10_56 = null;
			}
		}
		if (!this.aBoolean319 || this.aLong175 > Static133.method2163()) {
			return;
		}
		for (@Pc(328) Class4_Sub2_Sub4 local328 = (Class4_Sub2_Sub4) this.aClass97_20.method2363(); local328 != null; local328 = (Class4_Sub2_Sub4) this.aClass97_20.method2367()) {
			if (!local328.aBoolean157) {
				if (local328.aBoolean156) {
					if (!local328.aBoolean155) {
						throw new RuntimeException();
					}
					local328.method4391();
				} else {
					local328.aBoolean156 = true;
				}
			}
		}
		this.aLong175 = Static133.method2163() + 1000L;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)I")
	public int method3920() {
		if (this.method3910() == null) {
			return this.aClass4_Sub2_Sub4_1 == null ? 0 : this.aClass4_Sub2_Sub4_1.method1601();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)I")
	public int method3922() {
		return this.anInt4936;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method3905(@OriginalArg(0) int arg0) {
		@Pc(9) Class4_Sub2_Sub4 local9 = this.method3925(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method1606();
			local9.method4391();
			return local17;
		}
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V")
	public void method3923() {
		if (this.aClass79_5 != null) {
			this.aBoolean318 = true;
			if (this.aClass10_56 == null) {
				this.aClass10_56 = new Class10();
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V")
	public void method3924() {
		if (this.aClass10_56 == null || this.method3910() == null) {
			return;
		}
		for (@Pc(26) Class4 local26 = this.aClass10_55.method190(); local26 != null; local26 = this.aClass10_55.method191()) {
			@Pc(32) int local32 = (int) local26.aLong200;
			if (local32 < 0 || this.aClass13_2.anInt310 <= local32 || this.aClass13_2.anIntArray35[local32] == 0) {
				local26.method4391();
			} else {
				if (this.aByteArray68[local32] == 0) {
					this.method3925(local32, 1);
				}
				if (this.aByteArray68[local32] == -1) {
					this.method3925(local32, 2);
				}
				if (this.aByteArray68[local32] == 1) {
					local26.method4391();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Lclient!ba;")
	private Class4_Sub2_Sub4 method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) Class4_Sub2_Sub4 local21 = (Class4_Sub2_Sub4) this.aClass97_20.method2360((long) arg0);
		if (local21 != null && arg1 == 0 && !local21.aBoolean155 && local21.aBoolean157) {
			local21.method4391();
			local21 = null;
		}
		if (local21 == null) {
			if (arg1 == 0) {
				if (this.aClass79_5 == null || this.aByteArray68[arg0] == -1) {
					if (this.aClass113_3.method2672()) {
						return null;
					}
					local21 = this.aClass113_3.method2686(this.anInt4937, arg0, true, (byte) 2);
				} else {
					local21 = this.aClass1_6.method4(arg0, this.aClass79_5);
				}
			} else if (arg1 == 1) {
				if (this.aClass79_5 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass1_6.method3(arg0, this.aClass79_5);
			} else if (arg1 == 2) {
				if (this.aClass79_5 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray68[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass113_3.method2685()) {
					return null;
				}
				local21 = this.aClass113_3.method2686(this.anInt4937, arg0, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass97_20.method2364(local21, (long) arg0);
		}
		if (local21.aBoolean157) {
			return null;
		}
		@Pc(170) byte[] local170 = local21.method1606();
		@Pc(201) int local201;
		@Pc(248) Class4_Sub2_Sub4_Sub1 local248;
		if (!(local21 instanceof Class4_Sub2_Sub4_Sub2)) {
			try {
				if (local170 == null || local170.length <= 2) {
					throw new RuntimeException();
				}
				Static55.aCRC32_1.reset();
				Static55.aCRC32_1.update(local170, 0, local170.length - 2);
				local201 = (int) Static55.aCRC32_1.getValue();
				if (this.aClass13_2.anIntArray34[arg0] != local201) {
					throw new RuntimeException();
				}
				this.aClass113_3.anInt3388 = 0;
				this.aClass113_3.anInt3387 = 0;
			} catch (@Pc(222) RuntimeException local222) {
				this.aClass113_3.method2684();
				local21.method4391();
				if (local21.aBoolean155 && !this.aClass113_3.method2672()) {
					local248 = this.aClass113_3.method2686(this.anInt4937, arg0, true, (byte) 2);
					this.aClass97_20.method2364(local248, (long) arg0);
				}
				return null;
			}
			local170[local170.length - 2] = (byte) (this.aClass13_2.anIntArray32[arg0] >>> 8);
			local170[local170.length - 1] = (byte) this.aClass13_2.anIntArray32[arg0];
			if (this.aClass79_5 != null) {
				this.aClass1_6.method7(arg0, local170, this.aClass79_5);
				if (this.aByteArray68[arg0] != 1) {
					this.anInt4936++;
					this.aByteArray68[arg0] = 1;
				}
			}
			if (!local21.aBoolean155) {
				local21.method4391();
			}
			return local21;
		}
		try {
			if (local170 == null || local170.length <= 2) {
				throw new RuntimeException();
			}
			Static55.aCRC32_1.reset();
			Static55.aCRC32_1.update(local170, 0, local170.length - 2);
			local201 = (int) Static55.aCRC32_1.getValue();
			if (local201 != this.aClass13_2.anIntArray34[arg0]) {
				throw new RuntimeException();
			}
			@Pc(381) int local381 = ((local170[local170.length - 2] & 0xFF) << 8) + (local170[local170.length - 1] & 0xFF);
			if ((this.aClass13_2.anIntArray32[arg0] & 0xFFFF) != local381) {
				throw new RuntimeException();
			}
			if (this.aByteArray68[arg0] != 1) {
				if (this.aByteArray68[arg0] != 0) {
				}
				this.anInt4936++;
				this.aByteArray68[arg0] = 1;
			}
			if (!local21.aBoolean155) {
				local21.method4391();
			}
			return local21;
		} catch (@Pc(432) Exception local432) {
			this.aByteArray68[arg0] = -1;
			local21.method4391();
			if (local21.aBoolean155 && !this.aClass113_3.method2672()) {
				local248 = this.aClass113_3.method2686(this.anInt4937, arg0, true, (byte) 2);
				this.aClass97_20.method2364(local248, (long) arg0);
			}
			return null;
		}
	}
}
