import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class24 {

	@OriginalMember(owner = "client!as", name = "z", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Lclient!am;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!as", name = "w", descriptor = "Lclient!rr;")
	private Class14_Sub2_Sub7_Sub2 aClass14_Sub2_Sub7_Sub2_1;

	@OriginalMember(owner = "client!as", name = "A", descriptor = "Lclient!oga;")
	private final Class269 aClass269_11 = new Class269();

	@OriginalMember(owner = "client!as", name = "B", descriptor = "Lclient!oga;")
	private final Class269 aClass269_12 = new Class269();

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!oga;")
	private final Class269 aClass269_13 = new Class269();

	@OriginalMember(owner = "client!as", name = "m", descriptor = "Lclient!oga;")
	private final Class269 aClass269_14 = new Class269();

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Lclient!jc;")
	private final Class14_Sub21 aClass14_Sub21_1 = new Class14_Sub21(4);

	@OriginalMember(owner = "client!as", name = "u", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	public volatile int anInt347 = 0;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public volatile int anInt348 = 0;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "Lclient!jc;")
	private final Class14_Sub21 aClass14_Sub21_2 = new Class14_Sub21(8);

	@OriginalMember(owner = "client!as", name = "g", descriptor = "(I)I")
	private int method363() {
		return this.aClass269_13.method6486() + this.aClass269_14.method6486();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!am;Z)V")
	public void method364(@OriginalArg(1) Class20 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass20_1 != null) {
			try {
				this.aClass20_1.method291();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass20_1 = null;
		}
		this.aClass20_1 = arg0;
		this.method371();
		this.method377(arg1);
		this.aClass14_Sub2_Sub7_Sub2_1 = null;
		this.aClass14_Sub21_2.anInt8936 = 0;
		while (true) {
			@Pc(40) Class14_Sub2_Sub7_Sub2 local40 = (Class14_Sub2_Sub7_Sub2) this.aClass269_12.method6490();
			if (local40 == null) {
				while (true) {
					local40 = (Class14_Sub2_Sub7_Sub2) this.aClass269_14.method6490();
					if (local40 == null) {
						if (this.aByte5 != 0) {
							try {
								this.aClass14_Sub21_1.anInt8936 = 0;
								this.aClass14_Sub21_1.method7747(4);
								this.aClass14_Sub21_1.method7747(this.aByte5);
								this.aClass14_Sub21_1.method7751(0);
								this.aClass20_1.method295(4, this.aClass14_Sub21_1.aByteArray99);
							} catch (@Pc(112) IOException local112) {
								try {
									this.aClass20_1.method291();
								} catch (@Pc(118) Exception local118) {
								}
								this.anInt348 = -2;
								this.aClass20_1 = null;
								this.anInt347++;
							}
						}
						this.anInt346 = 0;
						this.aLong19 = Static26.method382();
						return;
					}
					this.aClass269_13.method6493(local40);
				}
			}
			this.aClass269_11.method6493(local40);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	public int method365() {
		return this.aClass269_11.method6486() + this.aClass269_12.method6486();
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	public void method366() {
		if (this.aClass20_1 != null) {
			this.aClass20_1.method291();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)Z")
	public boolean method369() {
		return this.method365() >= 20;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public void method370() {
		if (this.aClass20_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub21_1.anInt8936 = 0;
			this.aClass14_Sub21_1.method7747(7);
			this.aClass14_Sub21_1.method7696(0);
			this.aClass20_1.method295(4, this.aClass14_Sub21_1.aByteArray99);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass20_1.method291();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt347++;
			this.aClass20_1 = null;
			this.anInt348 = -2;
		}
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(I)V")
	private void method371() {
		if (this.aClass20_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub21_1.anInt8936 = 0;
			this.aClass14_Sub21_1.method7747(6);
			this.aClass14_Sub21_1.method7696(3);
			this.aClass20_1.method295(4, this.aClass14_Sub21_1.aByteArray99);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass20_1.method291();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt348 = -2;
			this.aClass20_1 = null;
			this.anInt347++;
		}
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(I)Z")
	public boolean method372() {
		return this.method363() >= 20;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIIBZ)Lclient!rr;")
	public Class14_Sub2_Sub7_Sub2 method373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(11) long local11 = (long) ((arg2 << 16) + arg1);
		@Pc(15) Class14_Sub2_Sub7_Sub2 local15 = new Class14_Sub2_Sub7_Sub2();
		local15.aLong308 = local11;
		local15.aByte113 = arg3;
		local15.aBoolean635 = arg0;
		if (arg0) {
			if (this.method365() >= 20) {
				throw new RuntimeException();
			}
			this.aClass269_11.method6493(local15);
		} else if (this.method363() < 20) {
			this.aClass269_13.method6493(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(I)V")
	public void method375() {
		try {
			this.aClass20_1.method291();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt348 = -1;
		this.aClass20_1 = null;
		this.anInt347++;
		this.aByte5 = (byte) (int) ((double) 255 * Math.random() + 1.0D);
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(Z)Z")
	public boolean method376() {
		@Pc(18) int local18;
		if (this.aClass20_1 != null) {
			@Pc(11) long local11 = Static26.method382();
			local18 = (int) (local11 - this.aLong19);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong19 = local11;
			this.anInt346 += local18;
			if (this.anInt346 > 30000) {
				try {
					this.aClass20_1.method291();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass20_1 = null;
			}
		}
		if (this.aClass20_1 == null) {
			return this.method365() == 0 && this.method363() == 0;
		}
		try {
			this.aClass20_1.method297();
			for (@Pc(83) Class14_Sub2_Sub7_Sub2 local83 = (Class14_Sub2_Sub7_Sub2) this.aClass269_11.method6494(); local83 != null; local83 = (Class14_Sub2_Sub7_Sub2) this.aClass269_11.method6491()) {
				this.aClass14_Sub21_1.anInt8936 = 0;
				this.aClass14_Sub21_1.method7747(1);
				this.aClass14_Sub21_1.method7696((int) local83.aLong308);
				this.aClass20_1.method295(4, this.aClass14_Sub21_1.aByteArray99);
				this.aClass269_12.method6493(local83);
			}
			for (@Pc(131) Class14_Sub2_Sub7_Sub2 local131 = (Class14_Sub2_Sub7_Sub2) this.aClass269_13.method6494(); local131 != null; local131 = (Class14_Sub2_Sub7_Sub2) this.aClass269_13.method6491()) {
				this.aClass14_Sub21_1.anInt8936 = 0;
				this.aClass14_Sub21_1.method7747(0);
				this.aClass14_Sub21_1.method7696((int) local131.aLong308);
				this.aClass20_1.method295(4, this.aClass14_Sub21_1.aByteArray99);
				this.aClass269_14.method6493(local131);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(188) int local188 = this.aClass20_1.method288();
				if (local188 < 0) {
					throw new IOException();
				}
				if (local188 == 0) {
					break;
				}
				this.anInt346 = 0;
				@Pc(207) byte local207 = 0;
				if (this.aClass14_Sub2_Sub7_Sub2_1 == null) {
					local207 = 8;
				} else if (this.aClass14_Sub2_Sub7_Sub2_1.anInt9194 == 0) {
					local207 = 1;
				}
				@Pc(234) int local234;
				@Pc(267) int local267;
				@Pc(339) int local339;
				if (local207 > 0) {
					local234 = local207 - this.aClass14_Sub21_2.anInt8936;
					if (local234 > local188) {
						local234 = local188;
					}
					this.aClass20_1.method289(local234, this.aClass14_Sub21_2.anInt8936, this.aClass14_Sub21_2.aByteArray99);
					if (this.aByte5 != 0) {
						for (local267 = 0; local267 < local234; local267++) {
							this.aClass14_Sub21_2.aByteArray99[this.aClass14_Sub21_2.anInt8936 + local267] = (byte) (this.aClass14_Sub21_2.aByteArray99[this.aClass14_Sub21_2.anInt8936 + local267] ^ this.aByte5);
						}
					}
					this.aClass14_Sub21_2.anInt8936 += local234;
					if (local207 <= this.aClass14_Sub21_2.anInt8936) {
						if (this.aClass14_Sub2_Sub7_Sub2_1 == null) {
							this.aClass14_Sub21_2.anInt8936 = 0;
							local267 = this.aClass14_Sub21_2.method7695(122);
							local339 = this.aClass14_Sub21_2.method7717(-1978450544);
							@Pc(344) int local344 = this.aClass14_Sub21_2.method7695(113);
							@Pc(349) int local349 = this.aClass14_Sub21_2.method7748();
							@Pc(353) int local353 = local344 & 0x7F;
							@Pc(362) boolean local362 = (local344 & 0x80) != 0;
							@Pc(369) long local369 = (long) (local339 + (local267 << 16));
							@Pc(379) Class14_Sub2_Sub7_Sub2 local379;
							if (local362) {
								for (local379 = (Class14_Sub2_Sub7_Sub2) this.aClass269_14.method6494(); local379 != null && local369 != local379.aLong308; local379 = (Class14_Sub2_Sub7_Sub2) this.aClass269_14.method6491()) {
								}
							} else {
								for (local379 = (Class14_Sub2_Sub7_Sub2) this.aClass269_12.method6494(); local379 != null && local379.aLong308 != local369; local379 = (Class14_Sub2_Sub7_Sub2) this.aClass269_12.method6491()) {
								}
							}
							if (local379 == null) {
								throw new IOException();
							}
							@Pc(466) int local466 = local353 == 0 ? 5 : 9;
							this.aClass14_Sub2_Sub7_Sub2_1 = local379;
							this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9 = new Class14_Sub21(this.aClass14_Sub2_Sub7_Sub2_1.aByte113 + local349 + local466);
							this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.method7747(local353);
							this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.method7730(local349);
							this.aClass14_Sub21_2.anInt8936 = 0;
							this.aClass14_Sub2_Sub7_Sub2_1.anInt9194 = 8;
						} else if (this.aClass14_Sub2_Sub7_Sub2_1.anInt9194 != 0) {
							throw new IOException();
						} else if (this.aClass14_Sub21_2.aByteArray99[0] == -1) {
							this.aClass14_Sub2_Sub7_Sub2_1.anInt9194 = 1;
							this.aClass14_Sub21_2.anInt8936 = 0;
						} else {
							this.aClass14_Sub2_Sub7_Sub2_1 = null;
						}
					}
				} else {
					local234 = this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.aByteArray99.length - this.aClass14_Sub2_Sub7_Sub2_1.aByte113;
					local267 = 512 - this.aClass14_Sub2_Sub7_Sub2_1.anInt9194;
					if (local267 > local234 - this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.anInt8936) {
						local267 = local234 - this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.anInt8936;
					}
					if (local267 > local188) {
						local267 = local188;
					}
					this.aClass20_1.method289(local267, this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.anInt8936, this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.aByteArray99);
					if (this.aByte5 != 0) {
						for (local339 = 0; local339 < local267; local339++) {
							this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.aByteArray99[local339 + this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.anInt8936] ^= this.aByte5;
						}
					}
					this.aClass14_Sub2_Sub7_Sub2_1.anInt9194 += local267;
					this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.anInt8936 += local267;
					if (this.aClass14_Sub2_Sub7_Sub2_1.aClass14_Sub21_9.anInt8936 == local234) {
						this.aClass14_Sub2_Sub7_Sub2_1.method9093();
						this.aClass14_Sub2_Sub7_Sub2_1.aBoolean637 = false;
						this.aClass14_Sub2_Sub7_Sub2_1 = null;
					} else if (this.aClass14_Sub2_Sub7_Sub2_1.anInt9194 == 512) {
						this.aClass14_Sub2_Sub7_Sub2_1.anInt9194 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(702) IOException local702) {
			try {
				this.aClass20_1.method291();
			} catch (@Pc(708) Exception local708) {
			}
			this.aClass20_1 = null;
			this.anInt347++;
			this.anInt348 = -2;
			return this.method365() == 0 && this.method363() == 0;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
	public void method377(@OriginalArg(1) boolean arg0) {
		if (this.aClass20_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub21_1.anInt8936 = 0;
			this.aClass14_Sub21_1.method7747(arg0 ? 2 : 3);
			this.aClass14_Sub21_1.method7696(0);
			this.aClass20_1.method295(4, this.aClass14_Sub21_1.aByteArray99);
		} catch (@Pc(46) IOException local46) {
			try {
				this.aClass20_1.method291();
			} catch (@Pc(52) Exception local52) {
			}
			this.anInt347++;
			this.anInt348 = -2;
			this.aClass20_1 = null;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
	public void method378() {
		if (this.aClass20_1 != null) {
			this.aClass20_1.method293();
		}
	}
}
