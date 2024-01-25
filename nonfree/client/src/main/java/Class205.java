import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class205 {

	@OriginalMember(owner = "client!lfa", name = "w", descriptor = "I")
	private int anInt5305;

	@OriginalMember(owner = "client!lfa", name = "x", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!lfa", name = "z", descriptor = "Lclient!wo;")
	private Class364 aClass364_2;

	@OriginalMember(owner = "client!lfa", name = "E", descriptor = "Lclient!qb;")
	private Class1_Sub8_Sub1_Sub2 aClass1_Sub8_Sub1_Sub2_2;

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "Lclient!je;")
	private final Class170 aClass170_3 = new Class170();

	@OriginalMember(owner = "client!lfa", name = "t", descriptor = "Lclient!je;")
	private final Class170 aClass170_4 = new Class170();

	@OriginalMember(owner = "client!lfa", name = "u", descriptor = "Lclient!je;")
	private final Class170 aClass170_5 = new Class170();

	@OriginalMember(owner = "client!lfa", name = "v", descriptor = "Lclient!je;")
	private final Class170 aClass170_6 = new Class170();

	@OriginalMember(owner = "client!lfa", name = "y", descriptor = "Lclient!ac;")
	private final Class1_Sub3 aClass1_Sub3_2 = new Class1_Sub3(4);

	@OriginalMember(owner = "client!lfa", name = "C", descriptor = "B")
	private byte aByte82 = 0;

	@OriginalMember(owner = "client!lfa", name = "D", descriptor = "I")
	public volatile int anInt5307 = 0;

	@OriginalMember(owner = "client!lfa", name = "B", descriptor = "I")
	public volatile int anInt5306 = 0;

	@OriginalMember(owner = "client!lfa", name = "A", descriptor = "Lclient!ac;")
	private final Class1_Sub3 aClass1_Sub3_3 = new Class1_Sub3(8);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Z")
	public boolean method4358() {
		@Pc(17) int local17;
		if (this.aClass364_2 != null) {
			@Pc(11) long local11 = Static480.method6650();
			local17 = (int) (local11 - this.aLong132);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong132 = local11;
			this.anInt5305 += local17;
			if (this.anInt5305 > 30000) {
				try {
					this.aClass364_2.method7851();
				} catch (@Pc(41) Exception local41) {
				}
				this.aClass364_2 = null;
			}
		}
		if (this.aClass364_2 == null) {
			return this.method4370() == 0 && this.method4363() == 0;
		}
		try {
			this.aClass364_2.method7847();
			for (@Pc(75) Class1_Sub8_Sub1_Sub2 local75 = (Class1_Sub8_Sub1_Sub2) this.aClass170_3.method3553(); local75 != null; local75 = (Class1_Sub8_Sub1_Sub2) this.aClass170_3.method3544()) {
				this.aClass1_Sub3_2.anInt9802 = 0;
				this.aClass1_Sub3_2.method7917(1);
				this.aClass1_Sub3_2.method7932((int) local75.aLong263);
				this.aClass364_2.method7849(this.aClass1_Sub3_2.aByteArray104, 4);
				this.aClass170_4.method3550(local75);
			}
			for (@Pc(124) Class1_Sub8_Sub1_Sub2 local124 = (Class1_Sub8_Sub1_Sub2) this.aClass170_5.method3553(); local124 != null; local124 = (Class1_Sub8_Sub1_Sub2) this.aClass170_5.method3544()) {
				this.aClass1_Sub3_2.anInt9802 = 0;
				this.aClass1_Sub3_2.method7917(0);
				this.aClass1_Sub3_2.method7932((int) local124.aLong263);
				this.aClass364_2.method7849(this.aClass1_Sub3_2.aByteArray104, 4);
				this.aClass170_6.method3550(local124);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(173) int local173 = this.aClass364_2.method7852();
				if (local173 < 0) {
					throw new IOException();
				}
				if (local173 == 0) {
					break;
				}
				this.anInt5305 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass1_Sub8_Sub1_Sub2_2 == null) {
					local189 = 8;
				} else if (this.aClass1_Sub8_Sub1_Sub2_2.anInt7351 == 0) {
					local189 = 1;
				}
				@Pc(211) int local211;
				@Pc(232) int local232;
				@Pc(297) int local297;
				if (local189 > 0) {
					local211 = local189 - this.aClass1_Sub3_3.anInt9802;
					if (local173 < local211) {
						local211 = local173;
					}
					this.aClass364_2.method7850(this.aClass1_Sub3_3.aByteArray104, local211, this.aClass1_Sub3_3.anInt9802);
					if (this.aByte82 != 0) {
						for (local232 = 0; local232 < local211; local232++) {
							this.aClass1_Sub3_3.aByteArray104[this.aClass1_Sub3_3.anInt9802 + local232] ^= this.aByte82;
						}
					}
					this.aClass1_Sub3_3.anInt9802 += local211;
					if (local189 <= this.aClass1_Sub3_3.anInt9802) {
						if (this.aClass1_Sub8_Sub1_Sub2_2 == null) {
							this.aClass1_Sub3_3.anInt9802 = 0;
							local232 = this.aClass1_Sub3_3.method7974();
							local297 = this.aClass1_Sub3_3.method7945();
							@Pc(302) int local302 = this.aClass1_Sub3_3.method7974();
							@Pc(307) int local307 = this.aClass1_Sub3_3.method7940();
							@Pc(311) int local311 = local302 & 0x7F;
							@Pc(322) boolean local322 = (local302 & 0x80) != 0;
							@Pc(329) long local329 = (long) (local297 + (local232 << 16));
							@Pc(339) Class1_Sub8_Sub1_Sub2 local339;
							if (local322) {
								for (local339 = (Class1_Sub8_Sub1_Sub2) this.aClass170_6.method3553(); local339 != null && local339.aLong263 != local329; local339 = (Class1_Sub8_Sub1_Sub2) this.aClass170_6.method3544()) {
								}
							} else {
								for (local339 = (Class1_Sub8_Sub1_Sub2) this.aClass170_4.method3553(); local339 != null && local339.aLong263 != local329; local339 = (Class1_Sub8_Sub1_Sub2) this.aClass170_4.method3544()) {
								}
							}
							if (local339 == null) {
								throw new IOException();
							}
							@Pc(400) int local400 = local311 == 0 ? 5 : 9;
							this.aClass1_Sub8_Sub1_Sub2_2 = local339;
							this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5 = new Class1_Sub3(local400 + local307 + this.aClass1_Sub8_Sub1_Sub2_2.aByte99);
							this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.method7917(local311);
							this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.method7936(local307);
							this.aClass1_Sub3_3.anInt9802 = 0;
							this.aClass1_Sub8_Sub1_Sub2_2.anInt7351 = 8;
						} else if (this.aClass1_Sub8_Sub1_Sub2_2.anInt7351 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub3_3.aByteArray104[0] == -1) {
							this.aClass1_Sub3_3.anInt9802 = 0;
							this.aClass1_Sub8_Sub1_Sub2_2.anInt7351 = 1;
						} else {
							this.aClass1_Sub8_Sub1_Sub2_2 = null;
						}
					}
				} else {
					local211 = this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.aByteArray104.length - this.aClass1_Sub8_Sub1_Sub2_2.aByte99;
					local232 = 512 - this.aClass1_Sub8_Sub1_Sub2_2.anInt7351;
					if (local211 - this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.anInt9802 < local232) {
						local232 = local211 - this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.anInt9802;
					}
					if (local173 < local232) {
						local232 = local173;
					}
					this.aClass364_2.method7850(this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.aByteArray104, local232, this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.anInt9802);
					if (this.aByte82 != 0) {
						for (local297 = 0; local297 < local232; local297++) {
							this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.aByteArray104[this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.anInt9802 + local297] = (byte) (this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.aByteArray104[this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.anInt9802 + local297] ^ this.aByte82);
						}
					}
					this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.anInt9802 += local232;
					this.aClass1_Sub8_Sub1_Sub2_2.anInt7351 += local232;
					if (this.aClass1_Sub8_Sub1_Sub2_2.aClass1_Sub3_5.anInt9802 == local211) {
						this.aClass1_Sub8_Sub1_Sub2_2.method7712();
						this.aClass1_Sub8_Sub1_Sub2_2.aBoolean563 = false;
						this.aClass1_Sub8_Sub1_Sub2_2 = null;
					} else if (this.aClass1_Sub8_Sub1_Sub2_2.anInt7351 == 512) {
						this.aClass1_Sub8_Sub1_Sub2_2.anInt7351 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(622) IOException local622) {
			try {
				this.aClass364_2.method7851();
			} catch (@Pc(628) Exception local628) {
			}
			this.anInt5306 = -2;
			this.aClass364_2 = null;
			this.anInt5307++;
			return this.method4370() == 0 && this.method4363() == 0;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	private void method4359() {
		if (this.aClass364_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub3_2.anInt9802 = 0;
			this.aClass1_Sub3_2.method7917(6);
			this.aClass1_Sub3_2.method7932(3);
			this.aClass364_2.method7849(this.aClass1_Sub3_2.aByteArray104, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass364_2.method7851();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass364_2 = null;
			this.anInt5307++;
			this.anInt5306 = -2;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)Z")
	public boolean method4360() {
		return this.method4363() >= 20;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)V")
	public void method4361() {
		if (this.aClass364_2 != null) {
			this.aClass364_2.method7851();
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(Z)V")
	public void method4362() {
		if (this.aClass364_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub3_2.anInt9802 = 0;
			this.aClass1_Sub3_2.method7917(7);
			this.aClass1_Sub3_2.method7932(0);
			this.aClass364_2.method7849(this.aClass1_Sub3_2.aByteArray104, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass364_2.method7851();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt5306 = -2;
			this.aClass364_2 = null;
			this.anInt5307++;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)I")
	private int method4363() {
		return this.aClass170_5.method3555() + this.aClass170_6.method3555();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BZ)V")
	public void method4364(@OriginalArg(1) boolean arg0) {
		if (this.aClass364_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub3_2.anInt9802 = 0;
			this.aClass1_Sub3_2.method7917(arg0 ? 2 : 3);
			this.aClass1_Sub3_2.method7932(0);
			this.aClass364_2.method7849(this.aClass1_Sub3_2.aByteArray104, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass364_2.method7851();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt5307++;
			this.anInt5306 = -2;
			this.aClass364_2 = null;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZIBI)Lclient!qb;")
	public Class1_Sub8_Sub1_Sub2 method4366(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(15) long local15 = (long) (arg3 + (arg1 << 16));
		@Pc(19) Class1_Sub8_Sub1_Sub2 local19 = new Class1_Sub8_Sub1_Sub2();
		local19.aLong263 = local15;
		local19.aBoolean564 = arg0;
		local19.aByte99 = arg2;
		if (arg0) {
			if (this.method4370() >= 20) {
				throw new RuntimeException();
			}
			this.aClass170_3.method3550(local19);
		} else if (this.method4363() < 20) {
			this.aClass170_5.method3550(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)Z")
	public boolean method4367() {
		return this.method4370() >= 20;
	}

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "(I)V")
	public void method4369() {
		try {
			this.aClass364_2.method7851();
		} catch (@Pc(10) Exception local10) {
		}
		this.aByte82 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5306 = -1;
		this.anInt5307++;
		this.aClass364_2 = null;
	}

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "(I)I")
	public int method4370() {
		return this.aClass170_3.method3555() + this.aClass170_4.method3555();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZZLclient!wo;)V")
	public void method4371(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class364 arg1) {
		if (this.aClass364_2 != null) {
			try {
				this.aClass364_2.method7851();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass364_2 = null;
		}
		this.aClass364_2 = arg1;
		this.method4359();
		this.method4364(arg0);
		this.aClass1_Sub8_Sub1_Sub2_2 = null;
		this.aClass1_Sub3_3.anInt9802 = 0;
		while (true) {
			@Pc(40) Class1_Sub8_Sub1_Sub2 local40 = (Class1_Sub8_Sub1_Sub2) this.aClass170_4.method3543();
			if (local40 == null) {
				while (true) {
					local40 = (Class1_Sub8_Sub1_Sub2) this.aClass170_6.method3543();
					if (local40 == null) {
						if (this.aByte82 != 0) {
							try {
								this.aClass1_Sub3_2.anInt9802 = 0;
								this.aClass1_Sub3_2.method7917(4);
								this.aClass1_Sub3_2.method7917(this.aByte82);
								this.aClass1_Sub3_2.method7937(0);
								this.aClass364_2.method7849(this.aClass1_Sub3_2.aByteArray104, 4);
							} catch (@Pc(104) IOException local104) {
								try {
									this.aClass364_2.method7851();
								} catch (@Pc(110) Exception local110) {
								}
								this.anInt5306 = -2;
								this.aClass364_2 = null;
								this.anInt5307++;
							}
						}
						this.anInt5305 = 0;
						this.aLong132 = Static480.method6650();
						return;
					}
					this.aClass170_5.method3550(local40);
				}
			}
			this.aClass170_3.method3550(local40);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)V")
	public void method4372() {
		if (this.aClass364_2 != null) {
			this.aClass364_2.method7846();
		}
	}
}
