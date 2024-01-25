import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class114 {

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
	private int anInt3071;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "Lclient!vi;")
	private Class301 aClass301_2;

	@OriginalMember(owner = "client!gw", name = "I", descriptor = "Lclient!fca;")
	private Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "Lclient!gba;")
	private final Class104 aClass104_2 = new Class104();

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "Lclient!gba;")
	private final Class104 aClass104_3 = new Class104();

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "Lclient!gba;")
	private final Class104 aClass104_4 = new Class104();

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "Lclient!gba;")
	private final Class104 aClass104_5 = new Class104();

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "Lclient!ge;")
	private final Class1_Sub6 aClass1_Sub6_4 = new Class1_Sub6(4);

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
	public volatile int anInt3073 = 0;

	@OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
	public volatile int anInt3072 = 0;

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "B")
	private byte aByte48 = 0;

	@OriginalMember(owner = "client!gw", name = "E", descriptor = "Lclient!ge;")
	private final Class1_Sub6 aClass1_Sub6_5 = new Class1_Sub6(8);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)V")
	public void method2592(@OriginalArg(0) boolean arg0) {
		if (this.aClass301_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub6_4.anInt4555 = 0;
			this.aClass1_Sub6_4.method3937(arg0 ? 2 : 3);
			this.aClass1_Sub6_4.method3924(0);
			this.aClass301_2.method7065(4, this.aClass1_Sub6_4.aByteArray66);
		} catch (@Pc(46) IOException local46) {
			try {
				this.aClass301_2.method7069();
			} catch (@Pc(52) Exception local52) {
			}
			this.anInt3073++;
			this.aClass301_2 = null;
			this.anInt3072 = -2;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z")
	public boolean method2594() {
		return this.method2604() >= 20;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public void method2596() {
		try {
			this.aClass301_2.method7069();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt3073++;
		this.aClass301_2 = null;
		this.anInt3072 = -1;
		this.aByte48 = (byte) (Math.random() * 255.0D + (double) 1);
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)I")
	private int method2597() {
		return this.aClass104_4.method2412() + this.aClass104_5.method2412();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V")
	public void method2598() {
		if (this.aClass301_2 != null) {
			this.aClass301_2.method7069();
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)V")
	public void method2599() {
		if (this.aClass301_2 != null) {
			this.aClass301_2.method7063();
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)Z")
	public boolean method2600() {
		return this.method2597() >= 20;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(Z)V")
	private void method2601() {
		if (this.aClass301_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub6_4.anInt4555 = 0;
			this.aClass1_Sub6_4.method3937(6);
			this.aClass1_Sub6_4.method3924(3);
			this.aClass301_2.method7065(4, this.aClass1_Sub6_4.aByteArray66);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass301_2.method7069();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt3073++;
			this.aClass301_2 = null;
			this.anInt3072 = -2;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BIIZI)Lclient!fca;")
	public Class1_Sub1_Sub4_Sub1 method2603(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg2);
		@Pc(14) Class1_Sub1_Sub4_Sub1 local14 = new Class1_Sub1_Sub4_Sub1();
		local14.aBoolean636 = arg3;
		local14.aByte43 = arg0;
		local14.aLong394 = local10;
		if (arg3) {
			if (this.method2604() >= 20) {
				throw new RuntimeException();
			}
			this.aClass104_2.method2420(local14);
		} else if (this.method2597() < 20) {
			this.aClass104_4.method2420(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(B)I")
	public int method2604() {
		return this.aClass104_2.method2412() + this.aClass104_3.method2412();
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(I)V")
	public void method2605() {
		if (this.aClass301_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub6_4.anInt4555 = 0;
			this.aClass1_Sub6_4.method3937(7);
			this.aClass1_Sub6_4.method3924(0);
			this.aClass301_2.method7065(4, this.aClass1_Sub6_4.aByteArray66);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass301_2.method7069();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass301_2 = null;
			this.anInt3073++;
			this.anInt3072 = -2;
		}
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(B)Z")
	public boolean method2607() {
		@Pc(17) int local17;
		if (this.aClass301_2 != null) {
			@Pc(11) long local11 = Static60.method1119();
			local17 = (int) (local11 - this.aLong143);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong143 = local11;
			this.anInt3071 += local17;
			if (this.anInt3071 > 30000) {
				try {
					this.aClass301_2.method7069();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass301_2 = null;
			}
		}
		if (this.aClass301_2 == null) {
			return this.method2604() == 0 && this.method2597() == 0;
		}
		try {
			this.aClass301_2.method7070();
			for (@Pc(77) Class1_Sub1_Sub4_Sub1 local77 = (Class1_Sub1_Sub4_Sub1) this.aClass104_2.method2414(); local77 != null; local77 = (Class1_Sub1_Sub4_Sub1) this.aClass104_2.method2417()) {
				this.aClass1_Sub6_4.anInt4555 = 0;
				this.aClass1_Sub6_4.method3937(1);
				this.aClass1_Sub6_4.method3924((int) local77.aLong394);
				this.aClass301_2.method7065(4, this.aClass1_Sub6_4.aByteArray66);
				this.aClass104_3.method2420(local77);
			}
			for (@Pc(129) Class1_Sub1_Sub4_Sub1 local129 = (Class1_Sub1_Sub4_Sub1) this.aClass104_4.method2414(); local129 != null; local129 = (Class1_Sub1_Sub4_Sub1) this.aClass104_4.method2417()) {
				this.aClass1_Sub6_4.anInt4555 = 0;
				this.aClass1_Sub6_4.method3937(0);
				this.aClass1_Sub6_4.method3924((int) local129.aLong394);
				this.aClass301_2.method7065(4, this.aClass1_Sub6_4.aByteArray66);
				this.aClass104_5.method2420(local129);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(178) int local178 = this.aClass301_2.method7067();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt3071 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass1_Sub1_Sub4_Sub1_1 == null) {
					local191 = 8;
				} else if (this.aClass1_Sub1_Sub4_Sub1_1.anInt2568 == 0) {
					local191 = 1;
				}
				@Pc(223) int local223;
				@Pc(229) int local229;
				@Pc(272) int local272;
				if (local191 <= 0) {
					local223 = this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.aByteArray66.length - this.aClass1_Sub1_Sub4_Sub1_1.aByte43;
					local229 = 512 - this.aClass1_Sub1_Sub4_Sub1_1.anInt2568;
					if (local223 - this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.anInt4555 < local229) {
						local229 = local223 - this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.anInt4555;
					}
					if (local229 > local178) {
						local229 = local178;
					}
					this.aClass301_2.method7062(this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.anInt4555, this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.aByteArray66, local229);
					if (this.aByte48 != 0) {
						for (local272 = 0; local272 < local229; local272++) {
							this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.aByteArray66[this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.anInt4555 + local272] = (byte) (this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.aByteArray66[this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.anInt4555 + local272] ^ this.aByte48);
						}
					}
					this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.anInt4555 += local229;
					this.aClass1_Sub1_Sub4_Sub1_1.anInt2568 += local229;
					if (this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.anInt4555 == local223) {
						this.aClass1_Sub1_Sub4_Sub1_1.method7528();
						this.aClass1_Sub1_Sub4_Sub1_1.aBoolean639 = false;
						this.aClass1_Sub1_Sub4_Sub1_1 = null;
					} else if (this.aClass1_Sub1_Sub4_Sub1_1.anInt2568 == 512) {
						this.aClass1_Sub1_Sub4_Sub1_1.anInt2568 = 0;
					}
				} else {
					local223 = local191 - this.aClass1_Sub6_5.anInt4555;
					if (local223 > local178) {
						local223 = local178;
					}
					this.aClass301_2.method7062(this.aClass1_Sub6_5.anInt4555, this.aClass1_Sub6_5.aByteArray66, local223);
					if (this.aByte48 != 0) {
						for (local229 = 0; local229 < local223; local229++) {
							this.aClass1_Sub6_5.aByteArray66[local229 + this.aClass1_Sub6_5.anInt4555] ^= this.aByte48;
						}
					}
					this.aClass1_Sub6_5.anInt4555 += local223;
					if (local191 <= this.aClass1_Sub6_5.anInt4555) {
						if (this.aClass1_Sub1_Sub4_Sub1_1 == null) {
							this.aClass1_Sub6_5.anInt4555 = 0;
							local229 = this.aClass1_Sub6_5.method3922();
							local272 = this.aClass1_Sub6_5.method3967();
							@Pc(453) int local453 = this.aClass1_Sub6_5.method3922();
							@Pc(458) int local458 = this.aClass1_Sub6_5.method3925();
							@Pc(462) int local462 = local453 & 0x7F;
							@Pc(470) boolean local470 = (local453 & 0x80) != 0;
							@Pc(477) long local477 = (long) (local272 + (local229 << 16));
							@Pc(487) Class1_Sub1_Sub4_Sub1 local487;
							if (local470) {
								for (local487 = (Class1_Sub1_Sub4_Sub1) this.aClass104_5.method2414(); local487 != null && local487.aLong394 != local477; local487 = (Class1_Sub1_Sub4_Sub1) this.aClass104_5.method2417()) {
								}
							} else {
								for (local487 = (Class1_Sub1_Sub4_Sub1) this.aClass104_3.method2414(); local487 != null && local477 != local487.aLong394; local487 = (Class1_Sub1_Sub4_Sub1) this.aClass104_3.method2417()) {
								}
							}
							if (local487 == null) {
								throw new IOException();
							}
							this.aClass1_Sub1_Sub4_Sub1_1 = local487;
							@Pc(547) int local547 = local462 == 0 ? 5 : 9;
							this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3 = new Class1_Sub6(this.aClass1_Sub1_Sub4_Sub1_1.aByte43 + local458 + local547);
							this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.method3937(local462);
							this.aClass1_Sub1_Sub4_Sub1_1.aClass1_Sub6_3.method3948(local458);
							this.aClass1_Sub6_5.anInt4555 = 0;
							this.aClass1_Sub1_Sub4_Sub1_1.anInt2568 = 8;
						} else if (this.aClass1_Sub1_Sub4_Sub1_1.anInt2568 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub6_5.aByteArray66[0] == -1) {
							this.aClass1_Sub1_Sub4_Sub1_1.anInt2568 = 1;
							this.aClass1_Sub6_5.anInt4555 = 0;
						} else {
							this.aClass1_Sub1_Sub4_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(624) IOException local624) {
			try {
				this.aClass301_2.method7069();
			} catch (@Pc(630) Exception local630) {
			}
			this.anInt3072 = -2;
			this.aClass301_2 = null;
			this.anInt3073++;
			return this.method2604() == 0 && this.method2597() == 0;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BZLclient!vi;)V")
	public void method2608(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class301 arg1) {
		if (this.aClass301_2 != null) {
			try {
				this.aClass301_2.method7069();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass301_2 = null;
		}
		this.aClass301_2 = arg1;
		this.method2601();
		this.method2592(arg0);
		this.aClass1_Sub6_5.anInt4555 = 0;
		this.aClass1_Sub1_Sub4_Sub1_1 = null;
		while (true) {
			@Pc(47) Class1_Sub1_Sub4_Sub1 local47 = (Class1_Sub1_Sub4_Sub1) this.aClass104_3.method2418();
			if (local47 == null) {
				while (true) {
					local47 = (Class1_Sub1_Sub4_Sub1) this.aClass104_5.method2418();
					if (local47 == null) {
						if (this.aByte48 != 0) {
							try {
								this.aClass1_Sub6_4.anInt4555 = 0;
								this.aClass1_Sub6_4.method3937(4);
								this.aClass1_Sub6_4.method3937(this.aByte48);
								this.aClass1_Sub6_4.method3919(0);
								this.aClass301_2.method7065(4, this.aClass1_Sub6_4.aByteArray66);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass301_2.method7069();
								} catch (@Pc(114) Exception local114) {
								}
								this.anInt3073++;
								this.anInt3072 = -2;
								this.aClass301_2 = null;
							}
						}
						this.anInt3071 = 0;
						this.aLong143 = Static60.method1119();
						return;
					}
					this.aClass104_4.method2420(local47);
				}
			}
			this.aClass104_2.method2420(local47);
		}
	}
}
