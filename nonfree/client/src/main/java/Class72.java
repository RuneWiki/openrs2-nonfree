import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class72 {

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!dga", name = "w", descriptor = "Lclient!faa;")
	private Class99 aClass99_2;

	@OriginalMember(owner = "client!dga", name = "x", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "Lclient!ew;")
	private Class4_Sub6_Sub6_Sub1 aClass4_Sub6_Sub6_Sub1_1;

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "Lclient!gd;")
	private final Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "Lclient!gd;")
	private final Class120 aClass120_2 = new Class120();

	@OriginalMember(owner = "client!dga", name = "s", descriptor = "Lclient!gd;")
	private final Class120 aClass120_3 = new Class120();

	@OriginalMember(owner = "client!dga", name = "t", descriptor = "Lclient!gd;")
	private final Class120 aClass120_4 = new Class120();

	@OriginalMember(owner = "client!dga", name = "u", descriptor = "Lclient!ek;")
	private final Class4_Sub13 aClass4_Sub13_1 = new Class4_Sub13(4);

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "B")
	private byte aByte48 = 0;

	@OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
	public volatile int anInt2351 = 0;

	@OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
	public volatile int anInt2352 = 0;

	@OriginalMember(owner = "client!dga", name = "B", descriptor = "Lclient!ek;")
	private final Class4_Sub13 aClass4_Sub13_2 = new Class4_Sub13(8);

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
	public void method1850() {
		if (this.aClass99_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub13_1.anInt9170 = 0;
			this.aClass4_Sub13_1.method7052(7);
			this.aClass4_Sub13_1.method6997(0);
			this.aClass99_2.method2395(this.aClass4_Sub13_1.aByteArray88, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass99_2.method2391();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt2352 = -2;
			this.anInt2351++;
			this.aClass99_2 = null;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBIZI)Lclient!ew;")
	public Class4_Sub6_Sub6_Sub1 method1851(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg2 << 16));
		@Pc(14) Class4_Sub6_Sub6_Sub1 local14 = new Class4_Sub6_Sub6_Sub1();
		local14.aBoolean617 = arg3;
		local14.aLong286 = local10;
		local14.aByte50 = arg1;
		if (arg3) {
			if (this.method1861() >= 20) {
				throw new RuntimeException();
			}
			this.aClass120_1.method2669(local14);
		} else if (this.method1860() < 20) {
			this.aClass120_3.method2669(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V")
	public void method1852() {
		if (this.aClass99_2 != null) {
			this.aClass99_2.method2390();
		}
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)V")
	private void method1853() {
		if (this.aClass99_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub13_1.anInt9170 = 0;
			this.aClass4_Sub13_1.method7052(6);
			this.aClass4_Sub13_1.method6997(3);
			this.aClass99_2.method2395(this.aClass4_Sub13_1.aByteArray88, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass99_2.method2391();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass99_2 = null;
			this.anInt2352 = -2;
			this.anInt2351++;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!faa;Z)V")
	public void method1855(@OriginalArg(1) Class99 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass99_2 != null) {
			try {
				this.aClass99_2.method2391();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass99_2 = null;
		}
		this.aClass99_2 = arg0;
		this.method1853();
		this.method1859(arg1);
		this.aClass4_Sub6_Sub6_Sub1_1 = null;
		this.aClass4_Sub13_2.anInt9170 = 0;
		while (true) {
			@Pc(42) Class4_Sub6_Sub6_Sub1 local42 = (Class4_Sub6_Sub6_Sub1) this.aClass120_2.method2667();
			if (local42 == null) {
				while (true) {
					local42 = (Class4_Sub6_Sub6_Sub1) this.aClass120_4.method2667();
					if (local42 == null) {
						if (this.aByte48 != 0) {
							try {
								this.aClass4_Sub13_1.anInt9170 = 0;
								this.aClass4_Sub13_1.method7052(4);
								this.aClass4_Sub13_1.method7052(this.aByte48);
								this.aClass4_Sub13_1.method7038(0);
								this.aClass99_2.method2395(this.aClass4_Sub13_1.aByteArray88, 4);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass99_2.method2391();
								} catch (@Pc(109) Exception local109) {
								}
								this.anInt2352 = -2;
								this.aClass99_2 = null;
								this.anInt2351++;
							}
						}
						this.anInt2349 = 0;
						this.aLong49 = Static112.method2047();
						return;
					}
					this.aClass120_3.method2669(local42);
				}
			}
			this.aClass120_1.method2669(local42);
		}
	}

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)V")
	public void method1856() {
		try {
			this.aClass99_2.method2391();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt2351++;
		this.aClass99_2 = null;
		this.aByte48 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2352 = -1;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)Z")
	public boolean method1857() {
		return this.method1860() >= 20;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZB)V")
	public void method1859(@OriginalArg(0) boolean arg0) {
		if (this.aClass99_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub13_1.anInt9170 = 0;
			this.aClass4_Sub13_1.method7052(arg0 ? 2 : 3);
			this.aClass4_Sub13_1.method6997(0);
			this.aClass99_2.method2395(this.aClass4_Sub13_1.aByteArray88, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass99_2.method2391();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass99_2 = null;
			this.anInt2351++;
			this.anInt2352 = -2;
		}
	}

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)I")
	private int method1860() {
		return this.aClass120_3.method2673() + this.aClass120_4.method2673();
	}

	@OriginalMember(owner = "client!dga", name = "e", descriptor = "(B)I")
	public int method1861() {
		return this.aClass120_1.method2673() + this.aClass120_2.method2673();
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(Z)Z")
	public boolean method1862() {
		@Pc(18) int local18;
		if (this.aClass99_2 != null) {
			@Pc(11) long local11 = Static112.method2047();
			local18 = (int) (local11 - this.aLong49);
			this.aLong49 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt2349 += local18;
			if (this.anInt2349 > 30000) {
				try {
					this.aClass99_2.method2391();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass99_2 = null;
			}
		}
		if (this.aClass99_2 == null) {
			return this.method1861() == 0 && this.method1860() == 0;
		}
		try {
			this.aClass99_2.method2394();
			for (@Pc(83) Class4_Sub6_Sub6_Sub1 local83 = (Class4_Sub6_Sub6_Sub1) this.aClass120_1.method2674(); local83 != null; local83 = (Class4_Sub6_Sub6_Sub1) this.aClass120_1.method2671()) {
				this.aClass4_Sub13_1.anInt9170 = 0;
				this.aClass4_Sub13_1.method7052(1);
				this.aClass4_Sub13_1.method6997((int) local83.aLong286);
				this.aClass99_2.method2395(this.aClass4_Sub13_1.aByteArray88, 4);
				this.aClass120_2.method2669(local83);
			}
			for (@Pc(129) Class4_Sub6_Sub6_Sub1 local129 = (Class4_Sub6_Sub6_Sub1) this.aClass120_3.method2674(); local129 != null; local129 = (Class4_Sub6_Sub6_Sub1) this.aClass120_3.method2671()) {
				this.aClass4_Sub13_1.anInt9170 = 0;
				this.aClass4_Sub13_1.method7052(0);
				this.aClass4_Sub13_1.method6997((int) local129.aLong286);
				this.aClass99_2.method2395(this.aClass4_Sub13_1.aByteArray88, 4);
				this.aClass120_4.method2669(local129);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(178) int local178 = this.aClass99_2.method2396();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt2349 = 0;
				@Pc(194) byte local194 = 0;
				if (this.aClass4_Sub6_Sub6_Sub1_1 == null) {
					local194 = 8;
				} else if (this.aClass4_Sub6_Sub6_Sub1_1.anInt2956 == 0) {
					local194 = 1;
				}
				@Pc(219) int local219;
				@Pc(244) int local244;
				@Pc(301) int local301;
				if (local194 > 0) {
					local219 = local194 - this.aClass4_Sub13_2.anInt9170;
					if (local178 < local219) {
						local219 = local178;
					}
					this.aClass99_2.method2392(local219, this.aClass4_Sub13_2.anInt9170, this.aClass4_Sub13_2.aByteArray88);
					if (this.aByte48 != 0) {
						for (local244 = 0; local244 < local219; local244++) {
							this.aClass4_Sub13_2.aByteArray88[local244 + this.aClass4_Sub13_2.anInt9170] ^= this.aByte48;
						}
					}
					this.aClass4_Sub13_2.anInt9170 += local219;
					if (local194 <= this.aClass4_Sub13_2.anInt9170) {
						if (this.aClass4_Sub6_Sub6_Sub1_1 == null) {
							this.aClass4_Sub13_2.anInt9170 = 0;
							local244 = this.aClass4_Sub13_2.method7004();
							local301 = this.aClass4_Sub13_2.method7054();
							@Pc(306) int local306 = this.aClass4_Sub13_2.method7004();
							@Pc(311) int local311 = this.aClass4_Sub13_2.method6990();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(323) boolean local323 = (local306 & 0x80) != 0;
							@Pc(331) long local331 = (long) ((local244 << 16) + local301);
							@Pc(341) Class4_Sub6_Sub6_Sub1 local341;
							if (local323) {
								for (local341 = (Class4_Sub6_Sub6_Sub1) this.aClass120_4.method2674(); local341 != null && local331 != local341.aLong286; local341 = (Class4_Sub6_Sub6_Sub1) this.aClass120_4.method2671()) {
								}
							} else {
								for (local341 = (Class4_Sub6_Sub6_Sub1) this.aClass120_2.method2674(); local341 != null && local331 != local341.aLong286; local341 = (Class4_Sub6_Sub6_Sub1) this.aClass120_2.method2671()) {
								}
							}
							if (local341 == null) {
								throw new IOException();
							}
							this.aClass4_Sub6_Sub6_Sub1_1 = local341;
							@Pc(404) int local404 = local315 == 0 ? 5 : 9;
							this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3 = new Class4_Sub13(local404 + local311 + this.aClass4_Sub6_Sub6_Sub1_1.aByte50);
							this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.method7052(local315);
							this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.method7032(local311);
							this.aClass4_Sub6_Sub6_Sub1_1.anInt2956 = 8;
							this.aClass4_Sub13_2.anInt9170 = 0;
						} else if (this.aClass4_Sub6_Sub6_Sub1_1.anInt2956 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub13_2.aByteArray88[0] == -1) {
							this.aClass4_Sub6_Sub6_Sub1_1.anInt2956 = 1;
							this.aClass4_Sub13_2.anInt9170 = 0;
						} else {
							this.aClass4_Sub6_Sub6_Sub1_1 = null;
						}
					}
				} else {
					local219 = this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.aByteArray88.length - this.aClass4_Sub6_Sub6_Sub1_1.aByte50;
					local244 = 512 - this.aClass4_Sub6_Sub6_Sub1_1.anInt2956;
					if (local219 - this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.anInt9170 < local244) {
						local244 = local219 - this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.anInt9170;
					}
					if (local178 < local244) {
						local244 = local178;
					}
					this.aClass99_2.method2392(local244, this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.anInt9170, this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.aByteArray88);
					if (this.aByte48 != 0) {
						for (local301 = 0; local301 < local244; local301++) {
							this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.aByteArray88[local301 + this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.anInt9170] ^= this.aByte48;
						}
					}
					this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.anInt9170 += local244;
					this.aClass4_Sub6_Sub6_Sub1_1.anInt2956 += local244;
					if (this.aClass4_Sub6_Sub6_Sub1_1.aClass4_Sub13_3.anInt9170 == local219) {
						this.aClass4_Sub6_Sub6_Sub1_1.method7880();
						this.aClass4_Sub6_Sub6_Sub1_1.aBoolean619 = false;
						this.aClass4_Sub6_Sub6_Sub1_1 = null;
					} else if (this.aClass4_Sub6_Sub6_Sub1_1.anInt2956 == 512) {
						this.aClass4_Sub6_Sub6_Sub1_1.anInt2956 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(618) IOException local618) {
			try {
				this.aClass99_2.method2391();
			} catch (@Pc(624) Exception local624) {
			}
			this.anInt2351++;
			this.aClass99_2 = null;
			this.anInt2352 = -2;
			return this.method1861() == 0 && this.method1860() == 0;
		}
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V")
	public void method1864() {
		if (this.aClass99_2 != null) {
			this.aClass99_2.method2391();
		}
	}

	@OriginalMember(owner = "client!dga", name = "f", descriptor = "(B)Z")
	public boolean method1865() {
		return this.method1861() >= 20;
	}
}
