import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class179 {

	@OriginalMember(owner = "client!no", name = "w", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!no", name = "x", descriptor = "J")
	private long aLong148;

	@OriginalMember(owner = "client!no", name = "z", descriptor = "Lclient!bn;")
	private Class30 aClass30_2;

	@OriginalMember(owner = "client!no", name = "E", descriptor = "Lclient!ae;")
	private Class6_Sub1_Sub1_Sub1 aClass6_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Lclient!po;")
	private final Class202 aClass202_5 = new Class202();

	@OriginalMember(owner = "client!no", name = "s", descriptor = "Lclient!po;")
	private final Class202 aClass202_6 = new Class202();

	@OriginalMember(owner = "client!no", name = "u", descriptor = "Lclient!po;")
	private final Class202 aClass202_7 = new Class202();

	@OriginalMember(owner = "client!no", name = "v", descriptor = "Lclient!po;")
	private final Class202 aClass202_8 = new Class202();

	@OriginalMember(owner = "client!no", name = "y", descriptor = "Lclient!ha;")
	private final Class6_Sub15 aClass6_Sub15_4 = new Class6_Sub15(4);

	@OriginalMember(owner = "client!no", name = "A", descriptor = "I")
	public volatile int anInt4659 = 0;

	@OriginalMember(owner = "client!no", name = "B", descriptor = "B")
	private byte aByte50 = 0;

	@OriginalMember(owner = "client!no", name = "D", descriptor = "I")
	public volatile int anInt4660 = 0;

	@OriginalMember(owner = "client!no", name = "C", descriptor = "Lclient!ha;")
	private final Class6_Sub15 aClass6_Sub15_5 = new Class6_Sub15(8);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)Z")
	public boolean method4128() {
		@Pc(18) int local18;
		if (this.aClass30_2 != null) {
			@Pc(11) long local11 = Static154.method2527();
			local18 = (int) (local11 - this.aLong148);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong148 = local11;
			this.anInt4658 += local18;
			if (this.anInt4658 > 30000) {
				try {
					this.aClass30_2.method741();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass30_2 = null;
			}
		}
		if (this.aClass30_2 == null) {
			return this.method4129() == 0 && this.method4131() == 0;
		}
		try {
			this.aClass30_2.method740();
			for (@Pc(77) Class6_Sub1_Sub1_Sub1 local77 = (Class6_Sub1_Sub1_Sub1) this.aClass202_5.method4476(); local77 != null; local77 = (Class6_Sub1_Sub1_Sub1) this.aClass202_5.method4474()) {
				this.aClass6_Sub15_4.anInt3487 = 0;
				this.aClass6_Sub15_4.method3075(1);
				this.aClass6_Sub15_4.method3081((int) local77.aLong218);
				this.aClass30_2.method733(this.aClass6_Sub15_4.aByteArray51, 4);
				this.aClass202_6.method4472(local77);
			}
			for (@Pc(125) Class6_Sub1_Sub1_Sub1 local125 = (Class6_Sub1_Sub1_Sub1) this.aClass202_7.method4476(); local125 != null; local125 = (Class6_Sub1_Sub1_Sub1) this.aClass202_7.method4474()) {
				this.aClass6_Sub15_4.anInt3487 = 0;
				this.aClass6_Sub15_4.method3075(0);
				this.aClass6_Sub15_4.method3081((int) local125.aLong218);
				this.aClass30_2.method733(this.aClass6_Sub15_4.aByteArray51, 4);
				this.aClass202_8.method4472(local125);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(178) int local178 = this.aClass30_2.method735();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt4658 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass6_Sub1_Sub1_Sub1_1 == null) {
					local191 = 8;
				} else if (this.aClass6_Sub1_Sub1_Sub1_1.anInt90 == 0) {
					local191 = 1;
				}
				@Pc(223) int local223;
				@Pc(229) int local229;
				@Pc(280) int local280;
				if (local191 <= 0) {
					local223 = this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.aByteArray51.length - this.aClass6_Sub1_Sub1_Sub1_1.aByte1;
					local229 = 512 - this.aClass6_Sub1_Sub1_Sub1_1.anInt90;
					if (local223 - this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.anInt3487 < local229) {
						local229 = local223 - this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.anInt3487;
					}
					if (local178 < local229) {
						local229 = local178;
					}
					this.aClass30_2.method734(this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.anInt3487, this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.aByteArray51, local229);
					if (this.aByte50 != 0) {
						for (local280 = 0; local280 < local229; local280++) {
							this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.aByteArray51[this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.anInt3487 + local280] = (byte) (this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.aByteArray51[this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.anInt3487 + local280] ^ this.aByte50);
						}
					}
					this.aClass6_Sub1_Sub1_Sub1_1.anInt90 += local229;
					this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.anInt3487 += local229;
					if (local223 == this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.anInt3487) {
						this.aClass6_Sub1_Sub1_Sub1_1.method5984();
						this.aClass6_Sub1_Sub1_Sub1_1.aBoolean481 = false;
						this.aClass6_Sub1_Sub1_Sub1_1 = null;
					} else if (this.aClass6_Sub1_Sub1_Sub1_1.anInt90 == 512) {
						this.aClass6_Sub1_Sub1_Sub1_1.anInt90 = 0;
					}
				} else {
					local223 = local191 - this.aClass6_Sub15_5.anInt3487;
					if (local223 > local178) {
						local223 = local178;
					}
					this.aClass30_2.method734(this.aClass6_Sub15_5.anInt3487, this.aClass6_Sub15_5.aByteArray51, local223);
					if (this.aByte50 != 0) {
						for (local229 = 0; local229 < local223; local229++) {
							this.aClass6_Sub15_5.aByteArray51[local229 + this.aClass6_Sub15_5.anInt3487] ^= this.aByte50;
						}
					}
					this.aClass6_Sub15_5.anInt3487 += local223;
					if (this.aClass6_Sub15_5.anInt3487 >= local191) {
						if (this.aClass6_Sub1_Sub1_Sub1_1 == null) {
							this.aClass6_Sub15_5.anInt3487 = 0;
							local229 = this.aClass6_Sub15_5.method3111();
							local280 = this.aClass6_Sub15_5.method3108();
							@Pc(458) int local458 = this.aClass6_Sub15_5.method3111();
							@Pc(463) int local463 = this.aClass6_Sub15_5.method3109();
							@Pc(467) int local467 = local458 & 0x7F;
							@Pc(478) boolean local478 = (local458 & 0x80) != 0;
							@Pc(485) long local485 = (long) (local280 + (local229 << 16));
							@Pc(495) Class6_Sub1_Sub1_Sub1 local495;
							if (local478) {
								for (local495 = (Class6_Sub1_Sub1_Sub1) this.aClass202_8.method4476(); local495 != null && local485 != local495.aLong218; local495 = (Class6_Sub1_Sub1_Sub1) this.aClass202_8.method4474()) {
								}
							} else {
								for (local495 = (Class6_Sub1_Sub1_Sub1) this.aClass202_6.method4476(); local495 != null && local495.aLong218 != local485; local495 = (Class6_Sub1_Sub1_Sub1) this.aClass202_6.method4474()) {
								}
							}
							if (local495 == null) {
								throw new IOException();
							}
							@Pc(559) int local559 = local467 == 0 ? 5 : 9;
							this.aClass6_Sub1_Sub1_Sub1_1 = local495;
							this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1 = new Class6_Sub15(this.aClass6_Sub1_Sub1_Sub1_1.aByte1 + local463 + local559);
							this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.method3075(local467);
							this.aClass6_Sub1_Sub1_Sub1_1.aClass6_Sub15_1.method3107(local463);
							this.aClass6_Sub15_5.anInt3487 = 0;
							this.aClass6_Sub1_Sub1_Sub1_1.anInt90 = 8;
						} else if (this.aClass6_Sub1_Sub1_Sub1_1.anInt90 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub15_5.aByteArray51[0] == -1) {
							this.aClass6_Sub15_5.anInt3487 = 0;
							this.aClass6_Sub1_Sub1_Sub1_1.anInt90 = 1;
						} else {
							this.aClass6_Sub1_Sub1_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(635) IOException local635) {
			try {
				this.aClass30_2.method741();
			} catch (@Pc(641) Exception local641) {
			}
			this.aClass30_2 = null;
			this.anInt4659++;
			this.anInt4660 = -2;
			return this.method4129() == 0 && this.method4131() == 0;
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(B)I")
	public int method4129() {
		return this.aClass202_5.method4471() + this.aClass202_6.method4471();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BZBII)Lclient!ae;")
	public Class6_Sub1_Sub1_Sub1 method4130(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg3 + (arg2 << 16));
		@Pc(14) Class6_Sub1_Sub1_Sub1 local14 = new Class6_Sub1_Sub1_Sub1();
		local14.aBoolean482 = arg0;
		local14.aLong218 = local10;
		local14.aByte1 = arg1;
		if (arg0) {
			if (this.method4129() >= 20) {
				throw new RuntimeException();
			}
			this.aClass202_5.method4472(local14);
		} else if (this.method4131() < 20) {
			this.aClass202_7.method4472(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)I")
	private int method4131() {
		return this.aClass202_7.method4471() + this.aClass202_8.method4471();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	public void method4133() {
		if (this.aClass30_2 != null) {
			this.aClass30_2.method741();
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	private void method4134() {
		if (this.aClass30_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub15_4.anInt3487 = 0;
			this.aClass6_Sub15_4.method3075(6);
			this.aClass6_Sub15_4.method3081(3);
			this.aClass30_2.method733(this.aClass6_Sub15_4.aByteArray51, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass30_2.method741();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt4660 = -2;
			this.anInt4659++;
			this.aClass30_2 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
	public void method4136() {
		if (this.aClass30_2 != null) {
			this.aClass30_2.method736();
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
	public void method4137() {
		if (this.aClass30_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub15_4.anInt3487 = 0;
			this.aClass6_Sub15_4.method3075(7);
			this.aClass6_Sub15_4.method3081(0);
			this.aClass30_2.method733(this.aClass6_Sub15_4.aByteArray51, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass30_2.method741();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt4659++;
			this.anInt4660 = -2;
			this.aClass30_2 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!bn;ZZ)V")
	public void method4138(@OriginalArg(0) Class30 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass30_2 != null) {
			try {
				this.aClass30_2.method741();
			} catch (@Pc(20) Exception local20) {
			}
			this.aClass30_2 = null;
		}
		this.aClass30_2 = arg0;
		this.method4134();
		this.method4140(arg1);
		this.aClass6_Sub1_Sub1_Sub1_1 = null;
		this.aClass6_Sub15_5.anInt3487 = 0;
		while (true) {
			@Pc(46) Class6_Sub1_Sub1_Sub1 local46 = (Class6_Sub1_Sub1_Sub1) this.aClass202_6.method4470();
			if (local46 == null) {
				while (true) {
					local46 = (Class6_Sub1_Sub1_Sub1) this.aClass202_8.method4470();
					if (local46 == null) {
						if (this.aByte50 != 0) {
							try {
								this.aClass6_Sub15_4.anInt3487 = 0;
								this.aClass6_Sub15_4.method3075(4);
								this.aClass6_Sub15_4.method3075(this.aByte50);
								this.aClass6_Sub15_4.method3100(0);
								this.aClass30_2.method733(this.aClass6_Sub15_4.aByteArray51, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass30_2.method741();
								} catch (@Pc(113) Exception local113) {
								}
								this.anInt4660 = -2;
								this.aClass30_2 = null;
								this.anInt4659++;
							}
						}
						this.anInt4658 = 0;
						this.aLong148 = Static154.method2527();
						return;
					}
					this.aClass202_7.method4472(local46);
				}
			}
			this.aClass202_5.method4472(local46);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V")
	public void method4140(@OriginalArg(1) boolean arg0) {
		if (this.aClass30_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub15_4.anInt3487 = 0;
			this.aClass6_Sub15_4.method3075(arg0 ? 2 : 3);
			this.aClass6_Sub15_4.method3081(0);
			this.aClass30_2.method733(this.aClass6_Sub15_4.aByteArray51, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass30_2.method741();
			} catch (@Pc(50) Exception local50) {
			}
			this.anInt4660 = -2;
			this.anInt4659++;
			this.aClass30_2 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(B)Z")
	public boolean method4141() {
		return this.method4129() >= 20;
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(I)Z")
	public boolean method4143() {
		return this.method4131() >= 20;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
	public void method4144() {
		try {
			this.aClass30_2.method741();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt4659++;
		this.aByte50 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt4660 = -1;
		this.aClass30_2 = null;
	}
}
