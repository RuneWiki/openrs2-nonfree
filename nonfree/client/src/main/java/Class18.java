import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class18 {

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "Lclient!pl;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "Lclient!re;")
	private Class1_Sub2_Sub5_Sub2 aClass1_Sub2_Sub5_Sub2_1;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "Lclient!oh;")
	private Class99 aClass99_1 = new Class99();

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Lclient!oh;")
	private Class99 aClass99_2 = new Class99();

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Lclient!oh;")
	private Class99 aClass99_3 = new Class99();

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!oh;")
	private Class99 aClass99_4 = new Class99();

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Lclient!ql;")
	private Class1_Sub13 aClass1_Sub13_1 = new Class1_Sub13(4);

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
	public volatile int anInt768 = 0;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
	public volatile int anInt769 = 0;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "Lclient!ql;")
	private Class1_Sub13 aClass1_Sub13_2 = new Class1_Sub13(8);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	private void method430() {
		if (this.aClass109_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_1.anInt2395 = 0;
			this.aClass1_Sub13_1.method1766(6);
			this.aClass1_Sub13_1.method1803(3);
			this.aClass109_1.method3150(this.aClass1_Sub13_1.aByteArray29, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass109_1.method3141();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass109_1 = null;
			this.anInt768++;
			this.anInt769 = -2;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	public void method431() {
		try {
			this.aClass109_1.method3141();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt769 = -1;
		this.anInt768++;
		this.aClass109_1 = null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!pl;ZI)V")
	public void method432(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass109_1 != null) {
			try {
				this.aClass109_1.method3141();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass109_1 = null;
		}
		this.aClass109_1 = arg0;
		this.method430();
		this.method436(arg1);
		this.aClass1_Sub13_2.anInt2395 = 0;
		this.aClass1_Sub2_Sub5_Sub2_1 = null;
		while (true) {
			@Pc(46) Class1_Sub2_Sub5_Sub2 local46 = (Class1_Sub2_Sub5_Sub2) this.aClass99_2.method2963();
			if (local46 == null) {
				while (true) {
					local46 = (Class1_Sub2_Sub5_Sub2) this.aClass99_4.method2963();
					if (local46 == null) {
						if (this.aByte2 != 0) {
							try {
								this.aClass1_Sub13_1.anInt2395 = 0;
								this.aClass1_Sub13_1.method1766(4);
								this.aClass1_Sub13_1.method1766(this.aByte2);
								this.aClass1_Sub13_1.method1789(0);
								this.aClass109_1.method3150(this.aClass1_Sub13_1.aByteArray29, 4);
							} catch (@Pc(104) IOException local104) {
								try {
									this.aClass109_1.method3141();
								} catch (@Pc(110) Exception local110) {
								}
								this.aClass109_1 = null;
								this.anInt769 = -2;
								this.anInt768++;
							}
						}
						this.anInt767 = 0;
						this.aLong22 = Static31.method591();
						return;
					}
					this.aClass99_3.method2973(local46);
				}
			}
			this.aClass99_1.method2973(local46);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public void method433() {
		if (this.aClass109_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_1.anInt2395 = 0;
			this.aClass1_Sub13_1.method1766(7);
			this.aClass1_Sub13_1.method1803(0);
			this.aClass109_1.method3150(this.aClass1_Sub13_1.aByteArray29, 4);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass109_1.method3141();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt768++;
			this.aClass109_1 = null;
			this.anInt769 = -2;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z")
	public boolean method435() {
		@Pc(17) int local17;
		if (this.aClass109_1 != null) {
			@Pc(11) long local11 = Static31.method591();
			local17 = (int) (local11 - this.aLong22);
			if (local17 > 200) {
				local17 = 200;
			}
			this.anInt767 += local17;
			this.aLong22 = local11;
			if (this.anInt767 > 30000) {
				try {
					this.aClass109_1.method3141();
				} catch (@Pc(45) Exception local45) {
				}
				this.aClass109_1 = null;
			}
		}
		if (this.aClass109_1 == null) {
			return this.method441() == 0 && this.method440() == 0;
		}
		try {
			this.aClass109_1.method3145();
			for (@Pc(75) Class1_Sub2_Sub5_Sub2 local75 = (Class1_Sub2_Sub5_Sub2) this.aClass99_1.method2970(); local75 != null; local75 = (Class1_Sub2_Sub5_Sub2) this.aClass99_1.method2969()) {
				this.aClass1_Sub13_1.anInt2395 = 0;
				this.aClass1_Sub13_1.method1766(1);
				this.aClass1_Sub13_1.method1803((int) local75.aLong185);
				this.aClass109_1.method3150(this.aClass1_Sub13_1.aByteArray29, 4);
				this.aClass99_2.method2973(local75);
			}
			for (@Pc(123) Class1_Sub2_Sub5_Sub2 local123 = (Class1_Sub2_Sub5_Sub2) this.aClass99_3.method2970(); local123 != null; local123 = (Class1_Sub2_Sub5_Sub2) this.aClass99_3.method2969()) {
				this.aClass1_Sub13_1.anInt2395 = 0;
				this.aClass1_Sub13_1.method1766(0);
				this.aClass1_Sub13_1.method1803((int) local123.aLong185);
				this.aClass109_1.method3150(this.aClass1_Sub13_1.aByteArray29, 4);
				this.aClass99_4.method2973(local123);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(172) int local172 = this.aClass109_1.method3143();
				if (local172 < 0) {
					throw new IOException();
				}
				if (local172 == 0) {
					break;
				}
				this.anInt767 = 0;
				@Pc(185) byte local185 = 0;
				if (this.aClass1_Sub2_Sub5_Sub2_1 == null) {
					local185 = 8;
				} else if (this.aClass1_Sub2_Sub5_Sub2_1.anInt4496 == 0) {
					local185 = 1;
				}
				@Pc(213) int local213;
				@Pc(234) int local234;
				@Pc(300) int local300;
				if (local185 > 0) {
					local213 = local185 - this.aClass1_Sub13_2.anInt2395;
					if (local172 < local213) {
						local213 = local172;
					}
					this.aClass109_1.method3146(local213, this.aClass1_Sub13_2.aByteArray29, this.aClass1_Sub13_2.anInt2395);
					if (this.aByte2 != 0) {
						for (local234 = 0; local234 < local213; local234++) {
							this.aClass1_Sub13_2.aByteArray29[this.aClass1_Sub13_2.anInt2395 + local234] = (byte) (this.aClass1_Sub13_2.aByteArray29[this.aClass1_Sub13_2.anInt2395 + local234] ^ this.aByte2);
						}
					}
					this.aClass1_Sub13_2.anInt2395 += local213;
					if (this.aClass1_Sub13_2.anInt2395 >= local185) {
						if (this.aClass1_Sub2_Sub5_Sub2_1 == null) {
							this.aClass1_Sub13_2.anInt2395 = 0;
							local234 = this.aClass1_Sub13_2.method1772();
							local300 = this.aClass1_Sub13_2.method1764();
							@Pc(305) int local305 = this.aClass1_Sub13_2.method1772();
							@Pc(309) int local309 = local305 & 0x7F;
							@Pc(317) boolean local317 = (local305 & 0x80) != 0;
							@Pc(326) long local326 = (long) (local300 + (local234 << 16));
							@Pc(331) int local331 = this.aClass1_Sub13_2.method1802();
							@Pc(339) Class1_Sub2_Sub5_Sub2 local339;
							if (local317) {
								for (local339 = (Class1_Sub2_Sub5_Sub2) this.aClass99_4.method2970(); local339 != null && local326 != local339.aLong185; local339 = (Class1_Sub2_Sub5_Sub2) this.aClass99_4.method2969()) {
								}
							} else {
								for (local339 = (Class1_Sub2_Sub5_Sub2) this.aClass99_2.method2970(); local339 != null && local339.aLong185 != local326; local339 = (Class1_Sub2_Sub5_Sub2) this.aClass99_2.method2969()) {
								}
							}
							if (local339 == null) {
								throw new IOException();
							}
							@Pc(401) int local401 = local309 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub5_Sub2_1 = local339;
							this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7 = new Class1_Sub13(local401 + local331 + this.aClass1_Sub2_Sub5_Sub2_1.aByte14);
							this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.method1766(local309);
							this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.method1754(local331);
							this.aClass1_Sub2_Sub5_Sub2_1.anInt4496 = 8;
							this.aClass1_Sub13_2.anInt2395 = 0;
						} else if (this.aClass1_Sub2_Sub5_Sub2_1.anInt4496 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub13_2.aByteArray29[0] == -1) {
							this.aClass1_Sub2_Sub5_Sub2_1.anInt4496 = 1;
							this.aClass1_Sub13_2.anInt2395 = 0;
						} else {
							this.aClass1_Sub2_Sub5_Sub2_1 = null;
						}
					}
				} else {
					local213 = this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.aByteArray29.length - this.aClass1_Sub2_Sub5_Sub2_1.aByte14;
					local234 = 512 - this.aClass1_Sub2_Sub5_Sub2_1.anInt4496;
					if (local234 > local213 - this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.anInt2395) {
						local234 = local213 - this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.anInt2395;
					}
					if (local172 < local234) {
						local234 = local172;
					}
					this.aClass109_1.method3146(local234, this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.aByteArray29, this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.anInt2395);
					if (this.aByte2 != 0) {
						for (local300 = 0; local300 < local234; local300++) {
							this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.aByteArray29[this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.anInt2395 + local300] ^= this.aByte2;
						}
					}
					this.aClass1_Sub2_Sub5_Sub2_1.anInt4496 += local234;
					this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.anInt2395 += local234;
					if (this.aClass1_Sub2_Sub5_Sub2_1.aClass1_Sub13_7.anInt2395 == local213) {
						this.aClass1_Sub2_Sub5_Sub2_1.method4198();
						this.aClass1_Sub2_Sub5_Sub2_1.aBoolean222 = false;
						this.aClass1_Sub2_Sub5_Sub2_1 = null;
					} else if (this.aClass1_Sub2_Sub5_Sub2_1.anInt4496 == 512) {
						this.aClass1_Sub2_Sub5_Sub2_1.anInt4496 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(624) IOException local624) {
			try {
				this.aClass109_1.method3141();
			} catch (@Pc(630) Exception local630) {
			}
			this.anInt769 = -2;
			this.aClass109_1 = null;
			this.anInt768++;
			return this.method441() == 0 && this.method440() == 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)V")
	public void method436(@OriginalArg(0) boolean arg0) {
		if (this.aClass109_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_1.anInt2395 = 0;
			this.aClass1_Sub13_1.method1766(arg0 ? 2 : 3);
			this.aClass1_Sub13_1.method1803(0);
			this.aClass109_1.method3150(this.aClass1_Sub13_1.aByteArray29, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass109_1.method3141();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt768++;
			this.anInt769 = -2;
			this.aClass109_1 = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
	public void method437() {
		if (this.aClass109_1 != null) {
			this.aClass109_1.method3147();
		}
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)Z")
	public boolean method438() {
		return this.method440() >= 20;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
	public void method439() {
		if (this.aClass109_1 != null) {
			this.aClass109_1.method3141();
		}
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)I")
	private int method440() {
		return this.aClass99_3.method2965() + this.aClass99_4.method2965();
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)I")
	public int method441() {
		return this.aClass99_1.method2965() + this.aClass99_2.method2965();
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)Z")
	public boolean method443() {
		return this.method441() >= 20;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZBI)Lclient!re;")
	public Class1_Sub2_Sub5_Sub2 method444(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(17) long local17 = (long) ((arg3 << 16) + arg0);
		@Pc(21) Class1_Sub2_Sub5_Sub2 local21 = new Class1_Sub2_Sub5_Sub2();
		local21.aLong185 = local17;
		local21.aBoolean221 = arg1;
		local21.aByte14 = arg2;
		if (arg1) {
			if (this.method441() >= 20) {
				throw new RuntimeException();
			}
			this.aClass99_1.method2973(local21);
		} else if (this.method440() < 20) {
			this.aClass99_3.method2973(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}
}
