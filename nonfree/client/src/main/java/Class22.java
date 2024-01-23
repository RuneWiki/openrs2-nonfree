import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class22 {

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
	private int anInt583;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!kn;")
	private Class97 aClass97_2;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "Lclient!qo;")
	private Class1_Sub2_Sub4_Sub2 aClass1_Sub2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!tg;")
	private Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!tg;")
	private Class170 aClass170_2 = new Class170();

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!tg;")
	private Class170 aClass170_3 = new Class170();

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Lclient!tg;")
	private Class170 aClass170_4 = new Class170();

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Lclient!lf;")
	private Class1_Sub14 aClass1_Sub14_1 = new Class1_Sub14(4);

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
	public volatile int anInt585 = 0;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
	public volatile int anInt584 = 0;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!lf;")
	private Class1_Sub14 aClass1_Sub14_2 = new Class1_Sub14(8);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	private int method516() {
		return this.aClass170_3.method4214() + this.aClass170_4.method4214();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public void method518() {
		if (this.aClass97_2 != null) {
			this.aClass97_2.method2546();
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Z")
	public boolean method519() {
		if (this.aClass97_2 != null) {
			@Pc(8) long local8 = Static298.method4535();
			@Pc(15) int local15 = (int) (local8 - this.aLong26);
			if (local15 > 200) {
				local15 = 200;
			}
			this.aLong26 = local8;
			this.anInt583 += local15;
			if (this.anInt583 > 30000) {
				try {
					this.aClass97_2.method2547();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass97_2 = null;
			}
		}
		if (this.aClass97_2 == null) {
			return this.method530() == 0 && this.method516() == 0;
		}
		try {
			this.aClass97_2.method2557();
			@Pc(79) Class1_Sub2_Sub4_Sub2 local79;
			for (local79 = (Class1_Sub2_Sub4_Sub2) this.aClass170_1.method4212(); local79 != null; local79 = (Class1_Sub2_Sub4_Sub2) this.aClass170_1.method4207()) {
				this.aClass1_Sub14_1.anInt1480 = 0;
				this.aClass1_Sub14_1.method1390(1);
				this.aClass1_Sub14_1.method1353((int) local79.aLong196);
				this.aClass97_2.method2552(4, this.aClass1_Sub14_1.aByteArray17);
				this.aClass170_2.method4210(local79);
			}
			for (local79 = (Class1_Sub2_Sub4_Sub2) this.aClass170_3.method4212(); local79 != null; local79 = (Class1_Sub2_Sub4_Sub2) this.aClass170_3.method4207()) {
				this.aClass1_Sub14_1.anInt1480 = 0;
				this.aClass1_Sub14_1.method1390(0);
				this.aClass1_Sub14_1.method1353((int) local79.aLong196);
				this.aClass97_2.method2552(4, this.aClass1_Sub14_1.aByteArray17);
				this.aClass170_4.method4210(local79);
			}
			for (@Pc(176) int local176 = 0; local176 < 100; local176++) {
				@Pc(184) int local184 = this.aClass97_2.method2551();
				if (local184 < 0) {
					throw new IOException();
				}
				if (local184 == 0) {
					break;
				}
				@Pc(201) byte local201 = 0;
				this.anInt583 = 0;
				if (this.aClass1_Sub2_Sub4_Sub2_1 == null) {
					local201 = 8;
				} else if (this.aClass1_Sub2_Sub4_Sub2_1.anInt4312 == 0) {
					local201 = 1;
				}
				@Pc(235) int local235;
				@Pc(242) int local242;
				@Pc(295) int local295;
				if (local201 <= 0) {
					local235 = this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.aByteArray17.length - this.aClass1_Sub2_Sub4_Sub2_1.aByte24;
					local242 = 512 - this.aClass1_Sub2_Sub4_Sub2_1.anInt4312;
					if (local235 - this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.anInt1480 < local242) {
						local242 = local235 - this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.anInt1480;
					}
					if (local184 < local242) {
						local242 = local184;
					}
					this.aClass97_2.method2556(this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.anInt1480, local242, this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.aByteArray17);
					if (this.aByte2 != 0) {
						for (local295 = 0; local295 < local242; local295++) {
							this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.aByteArray17[local295 + this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.anInt1480] ^= this.aByte2;
						}
					}
					this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.anInt1480 += local242;
					this.aClass1_Sub2_Sub4_Sub2_1.anInt4312 += local242;
					if (local235 == this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.anInt1480) {
						this.aClass1_Sub2_Sub4_Sub2_1.method4493();
						this.aClass1_Sub2_Sub4_Sub2_1.aBoolean296 = false;
						this.aClass1_Sub2_Sub4_Sub2_1 = null;
					} else if (this.aClass1_Sub2_Sub4_Sub2_1.anInt4312 == 512) {
						this.aClass1_Sub2_Sub4_Sub2_1.anInt4312 = 0;
					}
				} else {
					local235 = local201 - this.aClass1_Sub14_2.anInt1480;
					if (local184 < local235) {
						local235 = local184;
					}
					this.aClass97_2.method2556(this.aClass1_Sub14_2.anInt1480, local235, this.aClass1_Sub14_2.aByteArray17);
					if (this.aByte2 != 0) {
						for (local242 = 0; local242 < local235; local242++) {
							this.aClass1_Sub14_2.aByteArray17[local242 + this.aClass1_Sub14_2.anInt1480] ^= this.aByte2;
						}
					}
					this.aClass1_Sub14_2.anInt1480 += local235;
					if (this.aClass1_Sub14_2.anInt1480 >= local201) {
						if (this.aClass1_Sub2_Sub4_Sub2_1 == null) {
							this.aClass1_Sub14_2.anInt1480 = 0;
							local242 = this.aClass1_Sub14_2.method1378();
							local295 = this.aClass1_Sub14_2.method1386();
							@Pc(485) int local485 = this.aClass1_Sub14_2.method1378();
							@Pc(496) boolean local496 = (local485 & 0x80) != 0;
							@Pc(505) long local505 = (long) (local295 + (local242 << 16));
							@Pc(509) int local509 = local485 & 0x7F;
							@Pc(514) int local514 = this.aClass1_Sub14_2.method1392();
							@Pc(522) Class1_Sub2_Sub4_Sub2 local522;
							if (local496) {
								for (local522 = (Class1_Sub2_Sub4_Sub2) this.aClass170_4.method4212(); local522 != null && local505 != local522.aLong196; local522 = (Class1_Sub2_Sub4_Sub2) this.aClass170_4.method4207()) {
								}
							} else {
								for (local522 = (Class1_Sub2_Sub4_Sub2) this.aClass170_2.method4212(); local522 != null && local522.aLong196 != local505; local522 = (Class1_Sub2_Sub4_Sub2) this.aClass170_2.method4207()) {
								}
							}
							if (local522 == null) {
								throw new IOException();
							}
							this.aClass1_Sub2_Sub4_Sub2_1 = local522;
							@Pc(589) int local589 = local509 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8 = new Class1_Sub14(this.aClass1_Sub2_Sub4_Sub2_1.aByte24 + local589 + local514);
							this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.method1390(local509);
							this.aClass1_Sub2_Sub4_Sub2_1.aClass1_Sub14_8.method1387(local514);
							this.aClass1_Sub2_Sub4_Sub2_1.anInt4312 = 8;
							this.aClass1_Sub14_2.anInt1480 = 0;
						} else if (this.aClass1_Sub2_Sub4_Sub2_1.anInt4312 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub14_2.aByteArray17[0] == -1) {
							this.aClass1_Sub14_2.anInt1480 = 0;
							this.aClass1_Sub2_Sub4_Sub2_1.anInt4312 = 1;
						} else {
							this.aClass1_Sub2_Sub4_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(666) IOException local666) {
			try {
				this.aClass97_2.method2547();
			} catch (@Pc(672) Exception local672) {
			}
			this.anInt584 = -2;
			this.aClass97_2 = null;
			this.anInt585++;
			return this.method530() == 0 && this.method516() == 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!kn;Z)V")
	public void method521(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class97 arg1) {
		if (this.aClass97_2 != null) {
			try {
				this.aClass97_2.method2547();
			} catch (@Pc(12) Exception local12) {
			}
			this.aClass97_2 = null;
		}
		this.aClass97_2 = arg1;
		this.method529();
		this.method524(arg0);
		this.aClass1_Sub2_Sub4_Sub2_1 = null;
		this.aClass1_Sub14_2.anInt1480 = 0;
		while (true) {
			@Pc(48) Class1_Sub2_Sub4_Sub2 local48 = (Class1_Sub2_Sub4_Sub2) this.aClass170_2.method4211();
			if (local48 == null) {
				while (true) {
					local48 = (Class1_Sub2_Sub4_Sub2) this.aClass170_4.method4211();
					if (local48 == null) {
						if (this.aByte2 != 0) {
							try {
								this.aClass1_Sub14_1.anInt1480 = 0;
								this.aClass1_Sub14_1.method1390(4);
								this.aClass1_Sub14_1.method1390(this.aByte2);
								this.aClass1_Sub14_1.method1338(0);
								this.aClass97_2.method2552(4, this.aClass1_Sub14_1.aByteArray17);
							} catch (@Pc(113) IOException local113) {
								try {
									this.aClass97_2.method2547();
								} catch (@Pc(119) Exception local119) {
								}
								this.anInt585++;
								this.aClass97_2 = null;
								this.anInt584 = -2;
							}
						}
						this.anInt583 = 0;
						this.aLong26 = Static298.method4535();
						return;
					}
					this.aClass170_3.method4210(local48);
				}
			}
			this.aClass170_1.method4210(local48);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z")
	public boolean method522() {
		return this.method516() >= 20;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public void method523() {
		try {
			this.aClass97_2.method2547();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt585++;
		this.aClass97_2 = null;
		this.anInt584 = -1;
		this.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BZ)V")
	public void method524(@OriginalArg(1) boolean arg0) {
		if (this.aClass97_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_1.anInt1480 = 0;
			this.aClass1_Sub14_1.method1390(arg0 ? 2 : 3);
			this.aClass1_Sub14_1.method1353(0);
			this.aClass97_2.method2552(4, this.aClass1_Sub14_1.aByteArray17);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass97_2.method2547();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt585++;
			this.anInt584 = -2;
			this.aClass97_2 = null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
	public void method525() {
		if (this.aClass97_2 != null) {
			this.aClass97_2.method2547();
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V")
	public void method526() {
		if (this.aClass97_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_1.anInt1480 = 0;
			this.aClass1_Sub14_1.method1390(7);
			this.aClass1_Sub14_1.method1353(0);
			this.aClass97_2.method2552(4, this.aClass1_Sub14_1.aByteArray17);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass97_2.method2547();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt584 = -2;
			this.anInt585++;
			this.aClass97_2 = null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Z")
	public boolean method527() {
		return this.method530() >= 20;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZIBII)Lclient!qo;")
	public Class1_Sub2_Sub4_Sub2 method528(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg3 << 16));
		@Pc(14) Class1_Sub2_Sub4_Sub2 local14 = new Class1_Sub2_Sub4_Sub2();
		local14.aBoolean297 = arg0;
		local14.aByte24 = arg1;
		local14.aLong196 = local10;
		if (arg0) {
			if (this.method530() >= 20) {
				throw new RuntimeException();
			}
			this.aClass170_1.method4210(local14);
		} else if (this.method516() < 20) {
			this.aClass170_3.method4210(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	private void method529() {
		if (this.aClass97_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_1.anInt1480 = 0;
			this.aClass1_Sub14_1.method1390(6);
			this.aClass1_Sub14_1.method1353(3);
			this.aClass97_2.method2552(4, this.aClass1_Sub14_1.aByteArray17);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass97_2.method2547();
			} catch (@Pc(39) Exception local39) {
			}
			this.anInt584 = -2;
			this.aClass97_2 = null;
			this.anInt585++;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Z)I")
	public int method530() {
		return this.aClass170_1.method4214() + this.aClass170_2.method4214();
	}
}
