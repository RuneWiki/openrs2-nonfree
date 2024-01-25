import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class104 {

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!or;")
	private Class257 aClass257_1;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "Lclient!ab;")
	private Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!dm;")
	private final Class75 aClass75_4 = new Class75();

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!dm;")
	private final Class75 aClass75_5 = new Class75();

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!dm;")
	private final Class75 aClass75_6 = new Class75();

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Lclient!dm;")
	private final Class75 aClass75_7 = new Class75();

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Lclient!vj;")
	private final Class2_Sub22 aClass2_Sub22_5 = new Class2_Sub22(4);

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "B")
	private byte aByte33 = 0;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
	public volatile int anInt2683 = 0;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	public volatile int anInt2684 = 0;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!vj;")
	private final Class2_Sub22 aClass2_Sub22_6 = new Class2_Sub22(8);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	private int method2227() {
		return this.aClass75_6.method1566() + this.aClass75_7.method1566();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
	public void method2228(@OriginalArg(0) boolean arg0) {
		if (this.aClass257_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub22_5.anInt10247 = 0;
			this.aClass2_Sub22_5.method8537(arg0 ? 2 : 3);
			this.aClass2_Sub22_5.method8529(0);
			this.aClass257_1.method5550(4, this.aClass2_Sub22_5.aByteArray115);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass257_1.method5549();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt2683++;
			this.aClass257_1 = null;
			this.anInt2684 = -2;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Z")
	public boolean method2229() {
		@Pc(17) int local17;
		if (this.aClass257_1 != null) {
			@Pc(11) long local11 = Static476.method6413();
			local17 = (int) (local11 - this.aLong80);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong80 = local11;
			this.anInt2682 += local17;
			if (this.anInt2682 > 30000) {
				try {
					this.aClass257_1.method5549();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass257_1 = null;
			}
		}
		if (this.aClass257_1 == null) {
			return this.method2237() == 0 && this.method2227() == 0;
		}
		try {
			this.aClass257_1.method5548();
			for (@Pc(71) Class2_Sub2_Sub1_Sub1 local71 = (Class2_Sub2_Sub1_Sub1) this.aClass75_4.method1573(); local71 != null; local71 = (Class2_Sub2_Sub1_Sub1) this.aClass75_4.method1568()) {
				this.aClass2_Sub22_5.anInt10247 = 0;
				this.aClass2_Sub22_5.method8537(1);
				this.aClass2_Sub22_5.method8529((int) local71.aLong269);
				this.aClass257_1.method5550(4, this.aClass2_Sub22_5.aByteArray115);
				this.aClass75_5.method1572(local71);
			}
			for (@Pc(117) Class2_Sub2_Sub1_Sub1 local117 = (Class2_Sub2_Sub1_Sub1) this.aClass75_6.method1573(); local117 != null; local117 = (Class2_Sub2_Sub1_Sub1) this.aClass75_6.method1568()) {
				this.aClass2_Sub22_5.anInt10247 = 0;
				this.aClass2_Sub22_5.method8537(0);
				this.aClass2_Sub22_5.method8529((int) local117.aLong269);
				this.aClass257_1.method5550(4, this.aClass2_Sub22_5.aByteArray115);
				this.aClass75_7.method1572(local117);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(170) int local170 = this.aClass257_1.method5551();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt2682 = 0;
				@Pc(183) byte local183 = 0;
				if (this.aClass2_Sub2_Sub1_Sub1_2 == null) {
					local183 = 8;
				} else if (this.aClass2_Sub2_Sub1_Sub1_2.anInt53 == 0) {
					local183 = 1;
				}
				@Pc(207) int local207;
				@Pc(228) int local228;
				@Pc(293) int local293;
				if (local183 > 0) {
					local207 = local183 - this.aClass2_Sub22_6.anInt10247;
					if (local170 < local207) {
						local207 = local170;
					}
					this.aClass257_1.method5543(local207, this.aClass2_Sub22_6.anInt10247, this.aClass2_Sub22_6.aByteArray115);
					if (this.aByte33 != 0) {
						for (local228 = 0; local228 < local207; local228++) {
							this.aClass2_Sub22_6.aByteArray115[local228 + this.aClass2_Sub22_6.anInt10247] ^= this.aByte33;
						}
					}
					this.aClass2_Sub22_6.anInt10247 += local207;
					if (this.aClass2_Sub22_6.anInt10247 >= local183) {
						if (this.aClass2_Sub2_Sub1_Sub1_2 == null) {
							this.aClass2_Sub22_6.anInt10247 = 0;
							local228 = this.aClass2_Sub22_6.method8547();
							local293 = this.aClass2_Sub22_6.method8546();
							@Pc(298) int local298 = this.aClass2_Sub22_6.method8547();
							@Pc(303) int local303 = this.aClass2_Sub22_6.method8542();
							@Pc(307) int local307 = local298 & 0x7F;
							@Pc(315) boolean local315 = (local298 & 0x80) != 0;
							@Pc(322) long local322 = (long) (local293 + (local228 << 16));
							@Pc(332) Class2_Sub2_Sub1_Sub1 local332;
							if (local315) {
								for (local332 = (Class2_Sub2_Sub1_Sub1) this.aClass75_7.method1573(); local332 != null && local332.aLong269 != local322; local332 = (Class2_Sub2_Sub1_Sub1) this.aClass75_7.method1568()) {
								}
							} else {
								for (local332 = (Class2_Sub2_Sub1_Sub1) this.aClass75_5.method1573(); local332 != null && local322 != local332.aLong269; local332 = (Class2_Sub2_Sub1_Sub1) this.aClass75_5.method1568()) {
								}
							}
							if (local332 == null) {
								throw new IOException();
							}
							this.aClass2_Sub2_Sub1_Sub1_2 = local332;
							@Pc(392) int local392 = local307 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1 = new Class2_Sub22(this.aClass2_Sub2_Sub1_Sub1_2.aByte1 + local303 + local392);
							this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.method8537(local307);
							this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.method8552(local303);
							this.aClass2_Sub22_6.anInt10247 = 0;
							this.aClass2_Sub2_Sub1_Sub1_2.anInt53 = 8;
						} else if (this.aClass2_Sub2_Sub1_Sub1_2.anInt53 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub22_6.aByteArray115[0] == -1) {
							this.aClass2_Sub2_Sub1_Sub1_2.anInt53 = 1;
							this.aClass2_Sub22_6.anInt10247 = 0;
						} else {
							this.aClass2_Sub2_Sub1_Sub1_2 = null;
						}
					}
				} else {
					local207 = this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.aByteArray115.length - this.aClass2_Sub2_Sub1_Sub1_2.aByte1;
					local228 = 512 - this.aClass2_Sub2_Sub1_Sub1_2.anInt53;
					if (local228 > local207 - this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.anInt10247) {
						local228 = local207 - this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.anInt10247;
					}
					if (local170 < local228) {
						local228 = local170;
					}
					this.aClass257_1.method5543(local228, this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.anInt10247, this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.aByteArray115);
					if (this.aByte33 != 0) {
						for (local293 = 0; local293 < local228; local293++) {
							this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.aByteArray115[local293 + this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.anInt10247] ^= this.aByte33;
						}
					}
					this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.anInt10247 += local228;
					this.aClass2_Sub2_Sub1_Sub1_2.anInt53 += local228;
					if (this.aClass2_Sub2_Sub1_Sub1_2.aClass2_Sub22_1.anInt10247 == local207) {
						this.aClass2_Sub2_Sub1_Sub1_2.method8271();
						this.aClass2_Sub2_Sub1_Sub1_2.aBoolean283 = false;
						this.aClass2_Sub2_Sub1_Sub1_2 = null;
					} else if (this.aClass2_Sub2_Sub1_Sub1_2.anInt53 == 512) {
						this.aClass2_Sub2_Sub1_Sub1_2.anInt53 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(605) IOException local605) {
			try {
				this.aClass257_1.method5549();
			} catch (@Pc(611) Exception local611) {
			}
			this.aClass257_1 = null;
			this.anInt2683++;
			this.anInt2684 = -2;
			return this.method2237() == 0 && this.method2227() == 0;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public void method2230() {
		try {
			this.aClass257_1.method5549();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte33 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2684 = -1;
		this.aClass257_1 = null;
		this.anInt2683++;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z")
	public boolean method2231() {
		return this.method2237() >= 20;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!or;Z)V")
	public void method2232(@OriginalArg(1) Class257 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass257_1 != null) {
			try {
				this.aClass257_1.method5549();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass257_1 = null;
		}
		this.aClass257_1 = arg0;
		this.method2233();
		this.method2228(arg1);
		this.aClass2_Sub2_Sub1_Sub1_2 = null;
		this.aClass2_Sub22_6.anInt10247 = 0;
		while (true) {
			@Pc(40) Class2_Sub2_Sub1_Sub1 local40 = (Class2_Sub2_Sub1_Sub1) this.aClass75_5.method1571();
			if (local40 == null) {
				while (true) {
					local40 = (Class2_Sub2_Sub1_Sub1) this.aClass75_7.method1571();
					if (local40 == null) {
						if (this.aByte33 != 0) {
							try {
								this.aClass2_Sub22_5.anInt10247 = 0;
								this.aClass2_Sub22_5.method8537(4);
								this.aClass2_Sub22_5.method8537(this.aByte33);
								this.aClass2_Sub22_5.method8500(0);
								this.aClass257_1.method5550(4, this.aClass2_Sub22_5.aByteArray115);
							} catch (@Pc(101) IOException local101) {
								try {
									this.aClass257_1.method5549();
								} catch (@Pc(107) Exception local107) {
								}
								this.anInt2683++;
								this.anInt2684 = -2;
								this.aClass257_1 = null;
							}
						}
						this.anInt2682 = 0;
						this.aLong80 = Static476.method6413();
						return;
					}
					this.aClass75_6.method1572(local40);
				}
			}
			this.aClass75_4.method1572(local40);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	private void method2233() {
		if (this.aClass257_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub22_5.anInt10247 = 0;
			this.aClass2_Sub22_5.method8537(6);
			this.aClass2_Sub22_5.method8529(3);
			this.aClass257_1.method5550(4, this.aClass2_Sub22_5.aByteArray115);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass257_1.method5549();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass257_1 = null;
			this.anInt2684 = -2;
			this.anInt2683++;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public void method2234() {
		if (this.aClass257_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub22_5.anInt10247 = 0;
			this.aClass2_Sub22_5.method8537(7);
			this.aClass2_Sub22_5.method8529(0);
			this.aClass257_1.method5550(4, this.aClass2_Sub22_5.aByteArray115);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass257_1.method5549();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt2683++;
			this.anInt2684 = -2;
			this.aClass257_1 = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public void method2235() {
		if (this.aClass257_1 != null) {
			this.aClass257_1.method5546();
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
	public void method2236() {
		if (this.aClass257_1 != null) {
			this.aClass257_1.method5549();
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
	public int method2237() {
		return this.aClass75_4.method1566() + this.aClass75_5.method1566();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZBI)Lclient!ab;")
	public Class2_Sub2_Sub1_Sub1 method2238(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(11) long local11 = (long) ((arg3 << 16) + arg0);
		@Pc(20) Class2_Sub2_Sub1_Sub1 local20 = new Class2_Sub2_Sub1_Sub1();
		local20.aLong269 = local11;
		local20.aBoolean281 = arg1;
		local20.aByte1 = arg2;
		if (arg1) {
			if (this.method2237() >= 20) {
				throw new RuntimeException();
			}
			this.aClass75_4.method1572(local20);
		} else if (this.method2227() < 20) {
			this.aClass75_6.method1572(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
	public boolean method2239() {
		return this.method2227() >= 20;
	}
}
