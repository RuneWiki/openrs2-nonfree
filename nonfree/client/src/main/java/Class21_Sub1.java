import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!fc;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	private int anInt2802 = 0;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!qb;")
	private Class142 aClass142_11 = new Class142(16);

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
	private int anInt2812 = 0;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lclient!gj;")
	private Class59 aClass59_24 = new Class59();

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "J")
	private long aLong98 = 0L;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "Lclient!pj;")
	private Class138 aClass138_4;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
	private int anInt2807;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "Lclient!gj;")
	private Class59 aClass59_23;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!pj;")
	private Class138 aClass138_3;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
	private int anInt2806;

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	private int anInt2793;

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "Lclient!cd;")
	private Class22 aClass22_3;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Lclient!db;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Lclient!ej;")
	private Class1_Sub2_Sub4 aClass1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(ILclient!pj;Lclient!pj;Lclient!cd;Lclient!db;IIZ)V")
	public Class21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass138_4 = arg1;
		this.anInt2807 = arg0;
		if (this.aClass138_4 == null) {
			this.aBoolean175 = false;
		} else {
			this.aBoolean175 = true;
			this.aClass59_23 = new Class59();
		}
		this.aClass138_3 = arg2;
		this.anInt2806 = arg6;
		this.aBoolean176 = arg7;
		this.anInt2793 = arg5;
		this.aClass22_3 = arg3;
		this.aClass31_1 = arg4;
		if (this.aClass138_3 != null) {
			this.aClass1_Sub2_Sub4_1 = this.aClass31_1.method803(this.aClass138_3, this.anInt2807);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	@Override
	public void method2408(@OriginalArg(1) int arg0) {
		if (this.aClass138_4 == null) {
			return;
		}
		@Pc(21) Class1 local21;
		for (local21 = this.aClass59_24.method1704(); local21 != null; local21 = this.aClass59_24.method1701()) {
			if ((long) arg0 == local21.aLong214) {
				return;
			}
		}
		local21 = new Class1();
		local21.aLong214 = arg0;
		this.aClass59_24.method1706(local21);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)Lclient!ej;")
	private Class1_Sub2_Sub4 method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub4 local9 = (Class1_Sub2_Sub4) this.aClass142_11.method3543((long) arg0);
		if (local9 != null && arg1 == 0 && !local9.aBoolean297 && local9.aBoolean296) {
			local9.method4779();
			local9 = null;
		}
		if (local9 == null) {
			if (arg1 == 0) {
				if (this.aClass138_4 == null || this.aByteArray33[arg0] == -1) {
					if (this.aClass22_3.method527()) {
						return null;
					}
					local9 = this.aClass22_3.method528(true, (byte) 2, arg0, this.anInt2807);
				} else {
					local9 = this.aClass31_1.method803(this.aClass138_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass138_4 == null) {
					throw new RuntimeException();
				}
				local9 = this.aClass31_1.method804(this.aClass138_4, arg0);
			} else if (arg1 == 2) {
				if (this.aClass138_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray33[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass22_3.method522()) {
					return null;
				}
				local9 = this.aClass22_3.method528(false, (byte) 2, arg0, this.anInt2807);
			} else {
				throw new RuntimeException();
			}
			this.aClass142_11.method3537(local9, (long) arg0);
		}
		if (local9.aBoolean296) {
			return null;
		}
		@Pc(175) byte[] local175 = local9.method3668();
		@Pc(205) int local205;
		@Pc(261) Class1_Sub2_Sub4_Sub2 local261;
		if (!(local9 instanceof Class1_Sub2_Sub4_Sub1)) {
			try {
				if (local175 == null || local175.length <= 2) {
					throw new RuntimeException();
				}
				Static160.aCRC32_1.reset();
				Static160.aCRC32_1.update(local175, 0, local175.length - 2);
				local205 = (int) Static160.aCRC32_1.getValue();
				if (local205 != this.aClass47_1.anIntArray127[arg0]) {
					throw new RuntimeException();
				}
				this.aClass22_3.anInt585 = 0;
				this.aClass22_3.anInt584 = 0;
			} catch (@Pc(231) RuntimeException local231) {
				this.aClass22_3.method523();
				local9.method4779();
				if (local9.aBoolean297 && !this.aClass22_3.method527()) {
					local261 = this.aClass22_3.method528(true, (byte) 2, arg0, this.anInt2807);
					this.aClass142_11.method3537(local261, (long) arg0);
				}
				return null;
			}
			local175[local175.length - 2] = (byte) (this.aClass47_1.anIntArray124[arg0] >>> 8);
			local175[local175.length - 1] = (byte) this.aClass47_1.anIntArray124[arg0];
			if (this.aClass138_4 != null) {
				this.aClass31_1.method802(this.aClass138_4, local175, arg0);
				if (this.aByteArray33[arg0] != 1) {
					this.anInt2802++;
					this.aByteArray33[arg0] = 1;
				}
			}
			if (!local9.aBoolean297) {
				local9.method4779();
			}
			return local9;
		}
		try {
			if (local175 == null || local175.length <= 2) {
				throw new RuntimeException();
			}
			Static160.aCRC32_1.reset();
			Static160.aCRC32_1.update(local175, 0, local175.length - 2);
			local205 = (int) Static160.aCRC32_1.getValue();
			if (this.aClass47_1.anIntArray127[arg0] != local205) {
				throw new RuntimeException();
			}
			@Pc(394) int local394 = ((local175[local175.length - 2] & 0xFF) << 8) + (local175[local175.length - 1] & 0xFF);
			if (local394 != (this.aClass47_1.anIntArray124[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray33[arg0] != 1) {
				if (this.aByteArray33[arg0] != 0) {
				}
				this.anInt2802++;
				this.aByteArray33[arg0] = 1;
			}
			if (!local9.aBoolean297) {
				local9.method4779();
			}
			return local9;
		} catch (@Pc(446) Exception local446) {
			this.aByteArray33[arg0] = -1;
			local9.method4779();
			if (local9.aBoolean297 && !this.aClass22_3.method527()) {
				local261 = this.aClass22_3.method528(true, (byte) 2, arg0, this.anInt2807);
				this.aClass142_11.method3537(local261, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
	public int method2412() {
		return this.anInt2802;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)I")
	public int method2413() {
		return this.aClass47_1 == null ? 0 : this.aClass47_1.anInt1561;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public void method2414() {
		if (this.aClass138_4 != null) {
			this.aBoolean174 = true;
			if (this.aClass59_23 == null) {
				this.aClass59_23 = new Class59();
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
	@Override
	public int method2403(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub4 local11 = (Class1_Sub2_Sub4) this.aClass142_11.method3543((long) arg0);
		return local11 == null ? 0 : local11.method3665();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)I")
	public int method2416() {
		if (this.method2406() == null) {
			return this.aClass1_Sub2_Sub4_1 == null ? 0 : this.aClass1_Sub2_Sub4_1.method3665();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	public void method2417() {
		if (this.aClass59_23 != null) {
			if (this.method2406() == null) {
				return;
			}
			@Pc(20) boolean local20;
			@Pc(25) Class1 local25;
			@Pc(32) int local32;
			if (this.aBoolean175) {
				local20 = true;
				for (local25 = this.aClass59_23.method1704(); local25 != null; local25 = this.aClass59_23.method1701()) {
					local32 = (int) local25.aLong214;
					if (this.aByteArray33[local32] == 0) {
						this.method2411(local32, 1);
					}
					if (this.aByteArray33[local32] == 0) {
						local20 = false;
					} else {
						local25.method4779();
					}
				}
				while (this.anInt2812 < this.aClass47_1.anIntArray126.length) {
					if (this.aClass47_1.anIntArray126[this.anInt2812] == 0) {
						this.anInt2812++;
					} else {
						if (this.aClass31_1.anInt913 >= 250) {
							local20 = false;
							break;
						}
						if (this.aByteArray33[this.anInt2812] == 0) {
							this.method2411(this.anInt2812, 1);
						}
						if (this.aByteArray33[this.anInt2812] == 0) {
							local20 = false;
							local25 = new Class1();
							local25.aLong214 = this.anInt2812;
							this.aClass59_23.method1706(local25);
						}
						this.anInt2812++;
					}
				}
				if (local20) {
					this.anInt2812 = 0;
					this.aBoolean175 = false;
				}
			} else if (this.aBoolean174) {
				local20 = true;
				for (local25 = this.aClass59_23.method1704(); local25 != null; local25 = this.aClass59_23.method1701()) {
					local32 = (int) local25.aLong214;
					if (this.aByteArray33[local32] != 1) {
						this.method2411(local32, 2);
					}
					if (this.aByteArray33[local32] == 1) {
						local25.method4779();
					} else {
						local20 = false;
					}
				}
				while (this.aClass47_1.anIntArray126.length > this.anInt2812) {
					if (this.aClass47_1.anIntArray126[this.anInt2812] == 0) {
						this.anInt2812++;
					} else {
						if (this.aClass22_3.method522()) {
							local20 = false;
							break;
						}
						if (this.aByteArray33[this.anInt2812] != 1) {
							this.method2411(this.anInt2812, 2);
						}
						if (this.aByteArray33[this.anInt2812] != 1) {
							local25 = new Class1();
							local20 = false;
							local25.aLong214 = this.anInt2812;
							this.aClass59_23.method1706(local25);
						}
						this.anInt2812++;
					}
				}
				if (local20) {
					this.anInt2812 = 0;
					this.aBoolean174 = false;
				}
			} else {
				this.aClass59_23 = null;
			}
		}
		if (!this.aBoolean176 || Static298.method4535() < this.aLong98) {
			return;
		}
		for (@Pc(335) Class1_Sub2_Sub4 local335 = (Class1_Sub2_Sub4) this.aClass142_11.method3534(); local335 != null; local335 = (Class1_Sub2_Sub4) this.aClass142_11.method3530()) {
			if (!local335.aBoolean296) {
				if (local335.aBoolean298) {
					if (!local335.aBoolean297) {
						throw new RuntimeException();
					}
					local335.method4779();
				} else {
					local335.aBoolean298 = true;
				}
			}
		}
		this.aLong98 = Static298.method4535() + 1000L;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Lclient!fc;")
	@Override
	public Class47 method2406() {
		if (this.aClass47_1 != null) {
			return this.aClass47_1;
		}
		if (this.aClass1_Sub2_Sub4_1 == null) {
			if (this.aClass22_3.method527()) {
				return null;
			}
			this.aClass1_Sub2_Sub4_1 = this.aClass22_3.method528(true, (byte) 0, this.anInt2807, 255);
		}
		if (this.aClass1_Sub2_Sub4_1.aBoolean296) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass1_Sub2_Sub4_1.method3668();
		if (this.aClass1_Sub2_Sub4_1 instanceof Class1_Sub2_Sub4_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass47_1 = new Class47(local50, this.anInt2793);
				if (this.anInt2806 != this.aClass47_1.anInt1559) {
					throw new RuntimeException();
				}
			} catch (@Pc(86) RuntimeException local86) {
				this.aClass47_1 = null;
				if (this.aClass22_3.method527()) {
					this.aClass1_Sub2_Sub4_1 = null;
				} else {
					this.aClass1_Sub2_Sub4_1 = this.aClass22_3.method528(true, (byte) 0, this.anInt2807, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass47_1 = new Class47(local50, this.anInt2793);
			} catch (@Pc(130) RuntimeException local130) {
				this.aClass22_3.method523();
				this.aClass47_1 = null;
				if (this.aClass22_3.method527()) {
					this.aClass1_Sub2_Sub4_1 = null;
				} else {
					this.aClass1_Sub2_Sub4_1 = this.aClass22_3.method528(true, (byte) 0, this.anInt2807, 255);
				}
				return null;
			}
			if (this.aClass138_3 != null) {
				this.aClass31_1.method802(this.aClass138_3, local50, this.anInt2807);
			}
		}
		this.aClass1_Sub2_Sub4_1 = null;
		if (this.aClass138_4 != null) {
			this.aByteArray33 = new byte[this.aClass47_1.anInt1564];
			this.anInt2802 = 0;
		}
		return this.aClass47_1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)[B")
	@Override
	public byte[] method2407(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub2_Sub4 local9 = this.method2411(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local9.method3668();
			local9.method4779();
			return local23;
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public int method2419() {
		if (this.aClass47_1 == null) {
			return 0;
		} else if (this.aBoolean175) {
			@Pc(27) Class1 local27 = this.aClass59_23.method1704();
			return local27 == null ? 0 : (int) local27.aLong214;
		} else {
			return this.aClass47_1.anInt1561;
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
	public void method2420() {
		if (this.aClass59_23 == null || this.method2406() == null) {
			return;
		}
		for (@Pc(28) Class1 local28 = this.aClass59_24.method1704(); local28 != null; local28 = this.aClass59_24.method1701()) {
			@Pc(35) int local35 = (int) local28.aLong214;
			if (local35 < 0 || this.aClass47_1.anInt1564 <= local35 || this.aClass47_1.anIntArray126[local35] == 0) {
				local28.method4779();
			} else {
				if (this.aByteArray33[local35] == 0) {
					this.method2411(local35, 1);
				}
				if (this.aByteArray33[local35] == -1) {
					this.method2411(local35, 2);
				}
				if (this.aByteArray33[local35] == 1) {
					local28.method4779();
				}
			}
		}
	}
}
