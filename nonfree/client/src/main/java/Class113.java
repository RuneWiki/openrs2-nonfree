import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class113 {

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
	private int anInt3386;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "Lclient!sm;")
	private Class158 aClass158_2;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "Lclient!gf;")
	private Class4_Sub2_Sub4_Sub1 aClass4_Sub2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!vm;")
	private Class177 aClass177_6 = new Class177();

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "Lclient!vm;")
	private Class177 aClass177_7 = new Class177();

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "Lclient!vm;")
	private Class177 aClass177_8 = new Class177();

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!vm;")
	private Class177 aClass177_9 = new Class177();

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Lclient!p;")
	private Class4_Sub17 aClass4_Sub17_5 = new Class4_Sub17(4);

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "B")
	private byte aByte14 = 0;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
	public volatile int anInt3388 = 0;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
	public volatile int anInt3387 = 0;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "Lclient!p;")
	private Class4_Sub17 aClass4_Sub17_6 = new Class4_Sub17(8);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public void method2670() {
		if (this.aClass158_2 != null) {
			this.aClass158_2.method3778();
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	private void method2671() {
		if (this.aClass158_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub17_5.anInt2400 = 0;
			this.aClass4_Sub17_5.method1861(6);
			this.aClass4_Sub17_5.method1880(3);
			this.aClass158_2.method3780(this.aClass4_Sub17_5.aByteArray30, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass158_2.method3779();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt3388++;
			this.anInt3387 = -2;
			this.aClass158_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)Z")
	public boolean method2672() {
		return this.method2681() >= 20;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Z")
	public boolean method2674() {
		if (this.aClass158_2 != null) {
			@Pc(8) long local8 = Static133.method2163();
			@Pc(15) int local15 = (int) (local8 - this.aLong120);
			this.aLong120 = local8;
			if (local15 > 200) {
				local15 = 200;
			}
			this.anInt3386 += local15;
			if (this.anInt3386 > 30000) {
				try {
					this.aClass158_2.method3779();
				} catch (@Pc(41) Exception local41) {
				}
				this.aClass158_2 = null;
			}
		}
		if (this.aClass158_2 == null) {
			return this.method2681() == 0 && this.method2680() == 0;
		}
		try {
			this.aClass158_2.method3781();
			@Pc(81) Class4_Sub2_Sub4_Sub1 local81;
			for (local81 = (Class4_Sub2_Sub4_Sub1) this.aClass177_6.method4278(); local81 != null; local81 = (Class4_Sub2_Sub4_Sub1) this.aClass177_6.method4280()) {
				this.aClass4_Sub17_5.anInt2400 = 0;
				this.aClass4_Sub17_5.method1861(1);
				this.aClass4_Sub17_5.method1880((int) local81.aLong201);
				this.aClass158_2.method3780(this.aClass4_Sub17_5.aByteArray30, 4);
				this.aClass177_7.method4274(local81);
			}
			for (local81 = (Class4_Sub2_Sub4_Sub1) this.aClass177_8.method4278(); local81 != null; local81 = (Class4_Sub2_Sub4_Sub1) this.aClass177_8.method4280()) {
				this.aClass4_Sub17_5.anInt2400 = 0;
				this.aClass4_Sub17_5.method1861(0);
				this.aClass4_Sub17_5.method1880((int) local81.aLong201);
				this.aClass158_2.method3780(this.aClass4_Sub17_5.aByteArray30, 4);
				this.aClass177_9.method4274(local81);
			}
			for (@Pc(171) int local171 = 0; local171 < 100; local171++) {
				@Pc(181) int local181 = this.aClass158_2.method3774();
				if (local181 < 0) {
					throw new IOException();
				}
				if (local181 == 0) {
					break;
				}
				@Pc(196) byte local196 = 0;
				if (this.aClass4_Sub2_Sub4_Sub1_1 == null) {
					local196 = 8;
				} else if (this.aClass4_Sub2_Sub4_Sub1_1.anInt1805 == 0) {
					local196 = 1;
				}
				this.anInt3386 = 0;
				@Pc(236) int local236;
				@Pc(226) int local226;
				@Pc(277) int local277;
				if (local196 <= 0) {
					local226 = 512 - this.aClass4_Sub2_Sub4_Sub1_1.anInt1805;
					local236 = this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.aByteArray30.length - this.aClass4_Sub2_Sub4_Sub1_1.aByte10;
					if (local226 > local236 - this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.anInt2400) {
						local226 = local236 - this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.anInt2400;
					}
					if (local226 > local181) {
						local226 = local181;
					}
					this.aClass158_2.method3775(this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.anInt2400, local226, this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.aByteArray30);
					if (this.aByte14 != 0) {
						for (local277 = 0; local277 < local226; local277++) {
							this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.aByteArray30[this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.anInt2400 + local277] ^= this.aByte14;
						}
					}
					this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.anInt2400 += local226;
					this.aClass4_Sub2_Sub4_Sub1_1.anInt1805 += local226;
					if (this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.anInt2400 == local236) {
						this.aClass4_Sub2_Sub4_Sub1_1.method4396();
						this.aClass4_Sub2_Sub4_Sub1_1.aBoolean157 = false;
						this.aClass4_Sub2_Sub4_Sub1_1 = null;
					} else if (this.aClass4_Sub2_Sub4_Sub1_1.anInt1805 == 512) {
						this.aClass4_Sub2_Sub4_Sub1_1.anInt1805 = 0;
					}
				} else {
					local236 = local196 - this.aClass4_Sub17_6.anInt2400;
					if (local236 > local181) {
						local236 = local181;
					}
					this.aClass158_2.method3775(this.aClass4_Sub17_6.anInt2400, local236, this.aClass4_Sub17_6.aByteArray30);
					if (this.aByte14 != 0) {
						for (local226 = 0; local226 < local236; local226++) {
							this.aClass4_Sub17_6.aByteArray30[this.aClass4_Sub17_6.anInt2400 + local226] ^= this.aByte14;
						}
					}
					this.aClass4_Sub17_6.anInt2400 += local236;
					if (local196 <= this.aClass4_Sub17_6.anInt2400) {
						if (this.aClass4_Sub2_Sub4_Sub1_1 == null) {
							this.aClass4_Sub17_6.anInt2400 = 0;
							local226 = this.aClass4_Sub17_6.method1874();
							local277 = this.aClass4_Sub17_6.method1837();
							@Pc(453) int local453 = this.aClass4_Sub17_6.method1874();
							@Pc(458) int local458 = this.aClass4_Sub17_6.method1889();
							@Pc(462) int local462 = local453 & 0x7F;
							@Pc(473) boolean local473 = (local453 & 0x80) != 0;
							@Pc(480) long local480 = (long) (local277 + (local226 << 16));
							@Pc(490) Class4_Sub2_Sub4_Sub1 local490;
							if (local473) {
								for (local490 = (Class4_Sub2_Sub4_Sub1) this.aClass177_9.method4278(); local490 != null && local480 != local490.aLong201; local490 = (Class4_Sub2_Sub4_Sub1) this.aClass177_9.method4280()) {
								}
							} else {
								for (local490 = (Class4_Sub2_Sub4_Sub1) this.aClass177_7.method4278(); local490 != null && local490.aLong201 != local480; local490 = (Class4_Sub2_Sub4_Sub1) this.aClass177_7.method4280()) {
								}
							}
							if (local490 == null) {
								throw new IOException();
							}
							this.aClass4_Sub2_Sub4_Sub1_1 = local490;
							@Pc(550) int local550 = local462 == 0 ? 5 : 9;
							this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1 = new Class4_Sub17(local550 + local458 + this.aClass4_Sub2_Sub4_Sub1_1.aByte10);
							this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.method1861(local462);
							this.aClass4_Sub2_Sub4_Sub1_1.aClass4_Sub17_1.method1854(local458);
							this.aClass4_Sub2_Sub4_Sub1_1.anInt1805 = 8;
							this.aClass4_Sub17_6.anInt2400 = 0;
						} else if (this.aClass4_Sub2_Sub4_Sub1_1.anInt1805 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub17_6.aByteArray30[0] == -1) {
							this.aClass4_Sub2_Sub4_Sub1_1.anInt1805 = 1;
							this.aClass4_Sub17_6.anInt2400 = 0;
						} else {
							this.aClass4_Sub2_Sub4_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(626) IOException local626) {
			try {
				this.aClass158_2.method3779();
			} catch (@Pc(632) Exception local632) {
			}
			this.aClass158_2 = null;
			this.anInt3388++;
			this.anInt3387 = -2;
			return this.method2681() == 0 && this.method2680() == 0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
	public void method2675(@OriginalArg(0) boolean arg0) {
		if (this.aClass158_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub17_5.anInt2400 = 0;
			this.aClass4_Sub17_5.method1861(arg0 ? 2 : 3);
			this.aClass4_Sub17_5.method1880(0);
			this.aClass158_2.method3780(this.aClass4_Sub17_5.aByteArray30, 4);
		} catch (@Pc(46) IOException local46) {
			try {
				this.aClass158_2.method3779();
			} catch (@Pc(52) Exception local52) {
			}
			this.anInt3387 = -2;
			this.aClass158_2 = null;
			this.anInt3388++;
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V")
	public void method2678() {
		if (this.aClass158_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub17_5.anInt2400 = 0;
			this.aClass4_Sub17_5.method1861(7);
			this.aClass4_Sub17_5.method1880(0);
			this.aClass158_2.method3780(this.aClass4_Sub17_5.aByteArray30, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass158_2.method3779();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt3388++;
			this.anInt3387 = -2;
			this.aClass158_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!sm;ZI)V")
	public void method2679(@OriginalArg(0) Class158 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass158_2 != null) {
			try {
				this.aClass158_2.method3779();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass158_2 = null;
		}
		this.aClass158_2 = arg0;
		this.method2671();
		this.method2675(arg1);
		this.aClass4_Sub2_Sub4_Sub1_1 = null;
		this.aClass4_Sub17_6.anInt2400 = 0;
		while (true) {
			@Pc(40) Class4_Sub2_Sub4_Sub1 local40 = (Class4_Sub2_Sub4_Sub1) this.aClass177_7.method4273();
			if (local40 == null) {
				while (true) {
					local40 = (Class4_Sub2_Sub4_Sub1) this.aClass177_9.method4273();
					if (local40 == null) {
						if (this.aByte14 != 0) {
							try {
								this.aClass4_Sub17_5.anInt2400 = 0;
								this.aClass4_Sub17_5.method1861(4);
								this.aClass4_Sub17_5.method1861(this.aByte14);
								this.aClass4_Sub17_5.method1875(0);
								this.aClass158_2.method3780(this.aClass4_Sub17_5.aByteArray30, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass158_2.method3779();
								} catch (@Pc(113) Exception local113) {
								}
								this.aClass158_2 = null;
								this.anInt3388++;
								this.anInt3387 = -2;
							}
						}
						this.anInt3386 = 0;
						this.aLong120 = Static133.method2163();
						return;
					}
					this.aClass177_8.method4274(local40);
				}
			}
			this.aClass177_6.method4274(local40);
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)I")
	private int method2680() {
		return this.aClass177_8.method4281() + this.aClass177_9.method4281();
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)I")
	public int method2681() {
		return this.aClass177_6.method4281() + this.aClass177_7.method4281();
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	public void method2684() {
		try {
			this.aClass158_2.method3779();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt3387 = -1;
		this.aByte14 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass158_2 = null;
		this.anInt3388++;
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Z")
	public boolean method2685() {
		return this.method2680() >= 20;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBZB)Lclient!gf;")
	public Class4_Sub2_Sub4_Sub1 method2686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(7) Class4_Sub2_Sub4_Sub1 local7 = new Class4_Sub2_Sub4_Sub1();
		local7.aBoolean155 = arg2;
		@Pc(17) long local17 = (long) (arg1 + (arg0 << 16));
		local7.aLong201 = local17;
		local7.aByte10 = arg3;
		if (arg2) {
			if (this.method2681() >= 20) {
				throw new RuntimeException();
			}
			this.aClass177_6.method4274(local7);
		} else if (this.method2680() < 20) {
			this.aClass177_8.method4274(local7);
		} else {
			throw new RuntimeException();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V")
	public void method2687() {
		if (this.aClass158_2 != null) {
			this.aClass158_2.method3779();
		}
	}
}
