import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class206 {

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!ed;")
	private Class87 aClass87_2;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!fu;")
	private Class2_Sub1_Sub6_Sub1 aClass2_Sub1_Sub6_Sub1_1;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!pf;")
	private final Class279 aClass279_8 = new Class279();

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!pf;")
	private final Class279 aClass279_9 = new Class279();

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Lclient!pf;")
	private final Class279 aClass279_10 = new Class279();

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!pf;")
	private final Class279 aClass279_11 = new Class279();

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Lclient!ol;")
	private final Class2_Sub8 aClass2_Sub8_6 = new Class2_Sub8(4);

	@OriginalMember(owner = "client!l", name = "A", descriptor = "I")
	public volatile int anInt6003 = 0;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	public volatile int anInt6002 = 0;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "B")
	private byte aByte89 = 0;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Lclient!ol;")
	private final Class2_Sub8 aClass2_Sub8_7 = new Class2_Sub8(8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	private void method5413() {
		if (this.aClass87_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub8_6.anInt5725 = 0;
			this.aClass2_Sub8_6.method5170(6);
			this.aClass2_Sub8_6.method5181(3);
			this.aClass87_2.method2259(4, this.aClass2_Sub8_6.lb);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass87_2.method2257();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt6003++;
			this.aClass87_2 = null;
			this.anInt6002 = -2;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public void method5414() {
		if (this.aClass87_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub8_6.anInt5725 = 0;
			this.aClass2_Sub8_6.method5170(7);
			this.aClass2_Sub8_6.method5181(0);
			this.aClass87_2.method2259(4, this.aClass2_Sub8_6.lb);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass87_2.method2257();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass87_2 = null;
			this.anInt6002 = -2;
			this.anInt6003++;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	public void method5415() {
		try {
			this.aClass87_2.method2257();
		} catch (@Pc(11) Exception local11) {
		}
		this.aClass87_2 = null;
		this.anInt6002 = -1;
		this.anInt6003++;
		this.aByte89 = (byte) (int) (Math.random() * 255.0D + (double) 1);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)I")
	private int method5416() {
		return this.aClass279_10.method7296() + this.aClass279_11.method7296();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIIZ)Lclient!fu;")
	public Class2_Sub1_Sub6_Sub1 method5417(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) long local10 = (long) ((arg2 << 16) + arg1);
		@Pc(14) Class2_Sub1_Sub6_Sub1 local14 = new Class2_Sub1_Sub6_Sub1();
		local14.aLong296 = local10;
		local14.aByte46 = arg0;
		local14.aBoolean567 = arg3;
		if (arg3) {
			if (this.method5418() >= 20) {
				throw new RuntimeException();
			}
			this.aClass279_8.method7292(local14);
		} else if (this.method5416() < 20) {
			this.aClass279_10.method7292(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)I")
	public int method5418() {
		return this.aClass279_8.method7296() + this.aClass279_9.method7296();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!ed;Z)V")
	public void method5419(@OriginalArg(1) Class87 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass87_2 != null) {
			try {
				this.aClass87_2.method2257();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass87_2 = null;
		}
		this.aClass87_2 = arg0;
		this.method5413();
		this.method5420(arg1);
		this.aClass2_Sub1_Sub6_Sub1_1 = null;
		this.aClass2_Sub8_7.anInt5725 = 0;
		while (true) {
			@Pc(50) Class2_Sub1_Sub6_Sub1 local50 = (Class2_Sub1_Sub6_Sub1) this.aClass279_9.method7291();
			if (local50 == null) {
				while (true) {
					local50 = (Class2_Sub1_Sub6_Sub1) this.aClass279_11.method7291();
					if (local50 == null) {
						if (this.aByte89 != 0) {
							try {
								this.aClass2_Sub8_6.anInt5725 = 0;
								this.aClass2_Sub8_6.method5170(4);
								this.aClass2_Sub8_6.method5170(this.aByte89);
								this.aClass2_Sub8_6.method5192(0);
								this.aClass87_2.method2259(4, this.aClass2_Sub8_6.lb);
							} catch (@Pc(111) IOException local111) {
								try {
									this.aClass87_2.method2257();
								} catch (@Pc(119) Exception local119) {
								}
								this.aClass87_2 = null;
								this.anInt6002 = -2;
								this.anInt6003++;
							}
						}
						this.anInt6001 = 0;
						this.aLong165 = Static99.method1701();
						return;
					}
					this.aClass279_10.method7292(local50);
				}
			}
			this.aClass279_8.method7292(local50);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
	public void method5420(@OriginalArg(1) boolean arg0) {
		if (this.aClass87_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub8_6.anInt5725 = 0;
			this.aClass2_Sub8_6.method5170(arg0 ? 2 : 3);
			this.aClass2_Sub8_6.method5181(0);
			this.aClass87_2.method2259(4, this.aClass2_Sub8_6.lb);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass87_2.method2257();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass87_2 = null;
			this.anInt6002 = -2;
			this.anInt6003++;
		}
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)Z")
	public boolean method5421() {
		return this.method5416() >= 20;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)Z")
	public boolean method5422() {
		@Pc(20) int local20;
		if (this.aClass87_2 != null) {
			@Pc(13) long local13 = Static99.method1701();
			local20 = (int) (local13 - this.aLong165);
			this.aLong165 = local13;
			if (local20 > 200) {
				local20 = 200;
			}
			this.anInt6001 += local20;
			if (this.anInt6001 > 30000) {
				try {
					this.aClass87_2.method2257();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass87_2 = null;
			}
		}
		if (this.aClass87_2 == null) {
			return this.method5418() == 0 && this.method5416() == 0;
		}
		try {
			this.aClass87_2.method2260();
			for (@Pc(86) Class2_Sub1_Sub6_Sub1 local86 = (Class2_Sub1_Sub6_Sub1) this.aClass279_8.method7293(); local86 != null; local86 = (Class2_Sub1_Sub6_Sub1) this.aClass279_8.method7298()) {
				this.aClass2_Sub8_6.anInt5725 = 0;
				this.aClass2_Sub8_6.method5170(1);
				this.aClass2_Sub8_6.method5181((int) local86.aLong296);
				this.aClass87_2.method2259(4, this.aClass2_Sub8_6.lb);
				this.aClass279_9.method7292(local86);
			}
			for (@Pc(134) Class2_Sub1_Sub6_Sub1 local134 = (Class2_Sub1_Sub6_Sub1) this.aClass279_10.method7293(); local134 != null; local134 = (Class2_Sub1_Sub6_Sub1) this.aClass279_10.method7298()) {
				this.aClass2_Sub8_6.anInt5725 = 0;
				this.aClass2_Sub8_6.method5170(0);
				this.aClass2_Sub8_6.method5181((int) local134.aLong296);
				this.aClass87_2.method2259(4, this.aClass2_Sub8_6.lb);
				this.aClass279_11.method7292(local134);
			}
			for (local20 = 0; local20 < 100; local20++) {
				@Pc(183) int local183 = this.aClass87_2.method2262();
				if (local183 < 0) {
					throw new IOException();
				}
				if (local183 == 0) {
					break;
				}
				this.anInt6001 = 0;
				@Pc(202) byte local202 = 0;
				if (this.aClass2_Sub1_Sub6_Sub1_1 == null) {
					local202 = 8;
				} else if (this.aClass2_Sub1_Sub6_Sub1_1.anInt3736 == 0) {
					local202 = 1;
				}
				@Pc(223) int local223;
				@Pc(248) int local248;
				@Pc(309) int local309;
				if (local202 > 0) {
					local223 = local202 - this.aClass2_Sub8_7.anInt5725;
					if (local223 > local183) {
						local223 = local183;
					}
					this.aClass87_2.method2255(local223, this.aClass2_Sub8_7.lb, this.aClass2_Sub8_7.anInt5725);
					if (this.aByte89 != 0) {
						for (local248 = 0; local248 < local223; local248++) {
							this.aClass2_Sub8_7.lb[this.aClass2_Sub8_7.anInt5725 + local248] ^= this.aByte89;
						}
					}
					this.aClass2_Sub8_7.anInt5725 += local223;
					if (this.aClass2_Sub8_7.anInt5725 >= local202) {
						if (this.aClass2_Sub1_Sub6_Sub1_1 == null) {
							this.aClass2_Sub8_7.anInt5725 = 0;
							local248 = this.aClass2_Sub8_7.method5203();
							local309 = this.aClass2_Sub8_7.method5211();
							@Pc(314) int local314 = this.aClass2_Sub8_7.method5203();
							@Pc(321) int local321 = this.aClass2_Sub8_7.method5172();
							@Pc(325) int local325 = local314 & 0x7F;
							@Pc(336) boolean local336 = (local314 & 0x80) != 0;
							@Pc(343) long local343 = (long) ((local248 << 16) + local309);
							@Pc(353) Class2_Sub1_Sub6_Sub1 local353;
							if (local336) {
								for (local353 = (Class2_Sub1_Sub6_Sub1) this.aClass279_11.method7293(); local353 != null && local353.aLong296 != local343; local353 = (Class2_Sub1_Sub6_Sub1) this.aClass279_11.method7298()) {
								}
							} else {
								for (local353 = (Class2_Sub1_Sub6_Sub1) this.aClass279_9.method7293(); local353 != null && local353.aLong296 != local343; local353 = (Class2_Sub1_Sub6_Sub1) this.aClass279_9.method7298()) {
								}
							}
							if (local353 == null) {
								throw new IOException();
							}
							this.aClass2_Sub1_Sub6_Sub1_1 = local353;
							@Pc(420) int local420 = local325 == 0 ? 5 : 9;
							this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4 = new Class2_Sub8(this.aClass2_Sub1_Sub6_Sub1_1.aByte46 + local420 + local321);
							this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.method5170(local325);
							this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.method5194(local321);
							this.aClass2_Sub1_Sub6_Sub1_1.anInt3736 = 8;
							this.aClass2_Sub8_7.anInt5725 = 0;
						} else if (this.aClass2_Sub1_Sub6_Sub1_1.anInt3736 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub8_7.lb[0] == -1) {
							this.aClass2_Sub8_7.anInt5725 = 0;
							this.aClass2_Sub1_Sub6_Sub1_1.anInt3736 = 1;
						} else {
							this.aClass2_Sub1_Sub6_Sub1_1 = null;
						}
					}
				} else {
					local223 = this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.lb.length - this.aClass2_Sub1_Sub6_Sub1_1.aByte46;
					local248 = 512 - this.aClass2_Sub1_Sub6_Sub1_1.anInt3736;
					if (local223 - this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.anInt5725 < local248) {
						local248 = local223 - this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.anInt5725;
					}
					if (local248 > local183) {
						local248 = local183;
					}
					this.aClass87_2.method2255(local248, this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.lb, this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.anInt5725);
					if (this.aByte89 != 0) {
						for (local309 = 0; local309 < local248; local309++) {
							this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.lb[this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.anInt5725 + local309] ^= this.aByte89;
						}
					}
					this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.anInt5725 += local248;
					this.aClass2_Sub1_Sub6_Sub1_1.anInt3736 += local248;
					if (local223 == this.aClass2_Sub1_Sub6_Sub1_1.aClass2_Sub8_4.anInt5725) {
						this.aClass2_Sub1_Sub6_Sub1_1.method9377();
						this.aClass2_Sub1_Sub6_Sub1_1.aBoolean566 = false;
						this.aClass2_Sub1_Sub6_Sub1_1 = null;
					} else if (this.aClass2_Sub1_Sub6_Sub1_1.anInt3736 == 512) {
						this.aClass2_Sub1_Sub6_Sub1_1.anInt3736 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(639) IOException local639) {
			try {
				this.aClass87_2.method2257();
			} catch (@Pc(645) Exception local645) {
			}
			this.anInt6002 = -2;
			this.aClass87_2 = null;
			this.anInt6003++;
			return this.method5418() == 0 && this.method5416() == 0;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
	public void method5424() {
		if (this.aClass87_2 != null) {
			this.aClass87_2.method2257();
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(B)Z")
	public boolean method5425() {
		return this.method5418() >= 20;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
	public void method5426() {
		if (this.aClass87_2 != null) {
			this.aClass87_2.method2263();
		}
	}
}
