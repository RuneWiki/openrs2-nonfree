import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "Lclient!ba;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!ss", name = "I", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
	private int anInt5430 = 0;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "Lclient!wk;")
	private final Class246 aClass246_28 = new Class246(16);

	@OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
	private int anInt5442 = 0;

	@OriginalMember(owner = "client!ss", name = "K", descriptor = "Lclient!cf;")
	private final Class30 aClass30_41 = new Class30();

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	private final int anInt5428;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!q;")
	private final Class197 aClass197_3;

	@OriginalMember(owner = "client!ss", name = "D", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!ss", name = "E", descriptor = "Lclient!cf;")
	private Class30 aClass30_40;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
	private final int anInt5432;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!q;")
	private final Class197 aClass197_4;

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "Z")
	private final boolean aBoolean400;

	@OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
	private final int anInt5437;

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "Lclient!ii;")
	private final Class106 aClass106_1;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "Lclient!ls;")
	private final Class151 aClass151_3;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "Lclient!od;")
	private Class2_Sub10_Sub9 aClass2_Sub10_Sub9_1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILclient!q;Lclient!q;Lclient!ii;Lclient!ls;IIZ)V")
	public Class16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) Class151 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5428 = arg0;
		this.aClass197_3 = arg1;
		if (this.aClass197_3 == null) {
			this.aBoolean398 = false;
		} else {
			this.aBoolean398 = true;
			this.aClass30_40 = new Class30();
		}
		this.anInt5432 = arg5;
		this.aClass197_4 = arg2;
		this.aBoolean400 = arg7;
		this.anInt5437 = arg6;
		this.aClass106_1 = arg3;
		this.aClass151_3 = arg4;
		if (this.aClass197_4 != null) {
			this.aClass2_Sub10_Sub9_1 = this.aClass151_3.method3431(this.aClass197_4, this.anInt5428);
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
	public void method4718() {
		if (this.aClass30_40 != null) {
			if (this.method4714() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class2 local23;
			@Pc(29) int local29;
			@Pc(111) Class2 local111;
			if (this.aBoolean398) {
				local18 = true;
				for (local23 = this.aClass30_40.method694(); local23 != null; local23 = this.aClass30_40.method682()) {
					local29 = (int) local23.aLong209;
					if (this.aByteArray102[local29] == 0) {
						this.method4727(local29, 1);
					}
					if (this.aByteArray102[local29] == 0) {
						local18 = false;
					} else {
						local23.method5617();
					}
				}
				while (this.aClass15_2.anIntArray95.length > this.anInt5442) {
					if (this.aClass15_2.anIntArray95[this.anInt5442] == 0) {
						this.anInt5442++;
					} else {
						if (this.aClass151_3.anInt3729 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray102[this.anInt5442] == 0) {
							this.method4727(this.anInt5442, 1);
						}
						if (this.aByteArray102[this.anInt5442] == 0) {
							local111 = new Class2();
							local111.aLong209 = this.anInt5442;
							this.aClass30_40.method685(local111);
							local18 = false;
						}
						this.anInt5442++;
					}
				}
				if (local18) {
					this.aBoolean398 = false;
					this.anInt5442 = 0;
				}
			} else if (this.aBoolean399) {
				local18 = true;
				for (local23 = this.aClass30_40.method694(); local23 != null; local23 = this.aClass30_40.method682()) {
					local29 = (int) local23.aLong209;
					if (this.aByteArray102[local29] != 1) {
						this.method4727(local29, 2);
					}
					if (this.aByteArray102[local29] == 1) {
						local23.method5617();
					} else {
						local18 = false;
					}
				}
				while (this.aClass15_2.anIntArray95.length > this.anInt5442) {
					if (this.aClass15_2.anIntArray95[this.anInt5442] == 0) {
						this.anInt5442++;
					} else {
						if (this.aClass106_1.method2701()) {
							local18 = false;
							break;
						}
						if (this.aByteArray102[this.anInt5442] != 1) {
							this.method4727(this.anInt5442, 2);
						}
						if (this.aByteArray102[this.anInt5442] != 1) {
							local111 = new Class2();
							local111.aLong209 = this.anInt5442;
							local18 = false;
							this.aClass30_40.method685(local111);
						}
						this.anInt5442++;
					}
				}
				if (local18) {
					this.anInt5442 = 0;
					this.aBoolean399 = false;
				}
			} else {
				this.aClass30_40 = null;
			}
		}
		if (!this.aBoolean400 || this.aLong181 > Static39.method699()) {
			return;
		}
		for (@Pc(305) Class2_Sub10_Sub9 local305 = (Class2_Sub10_Sub9) this.aClass246_28.method5606(); local305 != null; local305 = (Class2_Sub10_Sub9) this.aClass246_28.method5614()) {
			if (!local305.aBoolean362) {
				if (local305.aBoolean364) {
					if (!local305.aBoolean365) {
						throw new RuntimeException();
					}
					local305.method5617();
				} else {
					local305.aBoolean364 = true;
				}
			}
		}
		this.aLong181 = Static39.method699() + 1000L;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)I")
	public int method4720() {
		return this.aClass15_2 == null ? 0 : this.aClass15_2.anInt432;
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V")
	public void method4721() {
		if (this.aClass30_40 == null || this.method4714() == null) {
			return;
		}
		for (@Pc(25) Class2 local25 = this.aClass30_41.method694(); local25 != null; local25 = this.aClass30_41.method682()) {
			@Pc(31) int local31 = (int) local25.aLong209;
			if (local31 < 0 || this.aClass15_2.anInt430 <= local31 || this.aClass15_2.anIntArray95[local31] == 0) {
				local25.method5617();
			} else {
				if (this.aByteArray102[local31] == 0) {
					this.method4727(local31, 1);
				}
				if (this.aByteArray102[local31] == -1) {
					this.method4727(local31, 2);
				}
				if (this.aByteArray102[local31] == 1) {
					local25.method5617();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(II)I")
	@Override
	public int method4715(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub10_Sub9 local15 = (Class2_Sub10_Sub9) this.aClass246_28.method5613((long) arg0);
		return local15 == null ? 0 : local15.method4241();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method4713(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub10_Sub9 local11 = this.method4727(arg0, 0);
		if (local11 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local11.method4243();
			local11.method5617();
			return local19;
		}
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)I")
	public int method4722() {
		if (this.method4714() == null) {
			return this.aClass2_Sub10_Sub9_1 == null ? 0 : this.aClass2_Sub10_Sub9_1.method4241();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(B)I")
	public int method4723() {
		if (this.aClass15_2 == null) {
			return 0;
		} else if (this.aBoolean398) {
			@Pc(20) Class2 local20 = this.aClass30_40.method694();
			return local20 == null ? 0 : (int) local20.aLong209;
		} else {
			return this.aClass15_2.anInt432;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
	@Override
	public void method4711(@OriginalArg(1) int arg0) {
		if (this.aClass197_3 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass30_41.method694(); local14 != null; local14 = this.aClass30_41.method682()) {
			if (local14.aLong209 == (long) arg0) {
				return;
			}
		}
		@Pc(34) Class2 local34 = new Class2();
		local34.aLong209 = arg0;
		this.aClass30_41.method685(local34);
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(B)I")
	public int method4724() {
		return this.anInt5430;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(Z)V")
	public void method4725() {
		if (this.aClass197_3 != null) {
			this.aBoolean399 = true;
			if (this.aClass30_40 == null) {
				this.aClass30_40 = new Class30();
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Lclient!od;")
	private Class2_Sub10_Sub9 method4727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class2_Sub10_Sub9 local18 = (Class2_Sub10_Sub9) this.aClass246_28.method5613((long) arg0);
		if (local18 != null && arg1 == 0 && !local18.aBoolean365 && local18.aBoolean362) {
			local18.method5617();
			local18 = null;
		}
		if (local18 == null) {
			if (arg1 == 0) {
				if (this.aClass197_3 == null || this.aByteArray102[arg0] == -1) {
					if (this.aClass106_1.method2690()) {
						return null;
					}
					local18 = this.aClass106_1.method2691(true, this.anInt5428, arg0, (byte) 2);
				} else {
					local18 = this.aClass151_3.method3431(this.aClass197_3, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass197_3 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass151_3.method3432(arg0, this.aClass197_3);
			} else if (arg1 == 2) {
				if (this.aClass197_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray102[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass106_1.method2701()) {
					return null;
				}
				local18 = this.aClass106_1.method2691(false, this.anInt5428, arg0, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass246_28.method5609(local18, (long) arg0);
		}
		if (local18.aBoolean362) {
			return null;
		}
		@Pc(156) byte[] local156 = local18.method4243();
		@Pc(185) int local185;
		@Pc(285) Class2_Sub10_Sub9_Sub1 local285;
		if (!(local18 instanceof Class2_Sub10_Sub9_Sub2)) {
			try {
				if (local156 == null || local156.length <= 2) {
					throw new RuntimeException();
				}
				Static56.aCRC32_1.reset();
				Static56.aCRC32_1.update(local156, 0, local156.length - 2);
				local185 = (int) Static56.aCRC32_1.getValue();
				if (local185 != this.aClass15_2.anIntArray97[arg0]) {
					throw new RuntimeException();
				}
				this.aClass106_1.anInt2889 = 0;
				this.aClass106_1.anInt2888 = 0;
			} catch (@Pc(343) RuntimeException local343) {
				this.aClass106_1.method2687();
				local18.method5617();
				if (local18.aBoolean365 && !this.aClass106_1.method2690()) {
					local285 = this.aClass106_1.method2691(true, this.anInt5428, arg0, (byte) 2);
					this.aClass246_28.method5609(local285, (long) arg0);
				}
				return null;
			}
			local156[local156.length - 2] = (byte) (this.aClass15_2.anIntArray93[arg0] >>> 8);
			local156[local156.length - 1] = (byte) this.aClass15_2.anIntArray93[arg0];
			if (this.aClass197_3 != null) {
				this.aClass151_3.method3437(local156, arg0, this.aClass197_3);
				if (this.aByteArray102[arg0] != 1) {
					this.anInt5430++;
					this.aByteArray102[arg0] = 1;
				}
			}
			if (!local18.aBoolean365) {
				local18.method5617();
			}
			return local18;
		}
		try {
			if (local156 == null || local156.length <= 2) {
				throw new RuntimeException();
			}
			Static56.aCRC32_1.reset();
			Static56.aCRC32_1.update(local156, 0, local156.length - 2);
			local185 = (int) Static56.aCRC32_1.getValue();
			if (local185 != this.aClass15_2.anIntArray97[arg0]) {
				throw new RuntimeException();
			}
			@Pc(220) int local220 = (local156[local156.length - 1] & 0xFF) + ((local156[local156.length - 2] & 0xFF) << 8);
			if (local220 != (this.aClass15_2.anIntArray93[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray102[arg0] != 1) {
				this.anInt5430++;
				this.aByteArray102[arg0] = 1;
			}
			if (!local18.aBoolean365) {
				local18.method5617();
			}
			return local18;
		} catch (@Pc(259) Exception local259) {
			this.aByteArray102[arg0] = -1;
			local18.method5617();
			if (local18.aBoolean365 && !this.aClass106_1.method2690()) {
				local285 = this.aClass106_1.method2691(true, this.anInt5428, arg0, (byte) 2);
				this.aClass246_28.method5609(local285, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)Lclient!ba;")
	@Override
	public Class15 method4714() {
		if (this.aClass15_2 != null) {
			return this.aClass15_2;
		}
		if (this.aClass2_Sub10_Sub9_1 == null) {
			if (this.aClass106_1.method2690()) {
				return null;
			}
			this.aClass2_Sub10_Sub9_1 = this.aClass106_1.method2691(true, 255, this.anInt5428, (byte) 0);
		}
		if (this.aClass2_Sub10_Sub9_1.aBoolean362) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass2_Sub10_Sub9_1.method4243();
		if (this.aClass2_Sub10_Sub9_1 instanceof Class2_Sub10_Sub9_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass15_2 = new Class15(local43, this.anInt5432);
				if (this.aClass15_2.anInt434 != this.anInt5437) {
					throw new RuntimeException();
				}
			} catch (@Pc(137) RuntimeException local137) {
				this.aClass15_2 = null;
				if (this.aClass106_1.method2690()) {
					this.aClass2_Sub10_Sub9_1 = null;
				} else {
					this.aClass2_Sub10_Sub9_1 = this.aClass106_1.method2691(true, 255, this.anInt5428, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass15_2 = new Class15(local43, this.anInt5432);
			} catch (@Pc(63) RuntimeException local63) {
				this.aClass106_1.method2687();
				this.aClass15_2 = null;
				if (this.aClass106_1.method2690()) {
					this.aClass2_Sub10_Sub9_1 = null;
				} else {
					this.aClass2_Sub10_Sub9_1 = this.aClass106_1.method2691(true, 255, this.anInt5428, (byte) 0);
				}
				return null;
			}
			if (this.aClass197_4 != null) {
				this.aClass151_3.method3437(local43, this.anInt5428, this.aClass197_4);
			}
		}
		this.aClass2_Sub10_Sub9_1 = null;
		if (this.aClass197_3 != null) {
			this.aByteArray102 = new byte[this.aClass15_2.anInt430];
			this.anInt5430 = 0;
		}
		return this.aClass15_2;
	}
}
