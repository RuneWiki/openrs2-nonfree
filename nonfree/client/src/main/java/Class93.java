import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class93 {

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
	private int anInt2726;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "Lclient!qp;")
	private Class171 aClass171_2;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "Lclient!r;")
	private Class4_Sub1_Sub18_Sub2 aClass4_Sub1_Sub18_Sub2_1;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Lclient!rh;")
	private final Class178 aClass178_4 = new Class178();

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "Lclient!rh;")
	private final Class178 aClass178_5 = new Class178();

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "Lclient!rh;")
	private final Class178 aClass178_6 = new Class178();

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "Lclient!rh;")
	private final Class178 aClass178_7 = new Class178();

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "Lclient!tq;")
	private final Class4_Sub7 aClass4_Sub7_2 = new Class4_Sub7(4);

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "B")
	private byte aByte37 = 0;

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
	public volatile int anInt2727 = 0;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
	public volatile int anInt2728 = 0;

	@OriginalMember(owner = "client!ho", name = "I", descriptor = "Lclient!tq;")
	private final Class4_Sub7 aClass4_Sub7_3 = new Class4_Sub7(8);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Z")
	public boolean method2424() {
		return this.method2437() >= 20;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIZBZ)Lclient!r;")
	public Class4_Sub1_Sub18_Sub2 method2425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(20) Class4_Sub1_Sub18_Sub2 local20 = new Class4_Sub1_Sub18_Sub2();
		local20.aLong254 = local10;
		local20.aBoolean487 = arg2;
		local20.aByte67 = arg3;
		if (arg2) {
			if (this.method2433() >= 20) {
				throw new RuntimeException();
			}
			this.aClass178_4.method4767(local20);
		} else if (this.method2437() < 20) {
			this.aClass178_6.method4767(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!qp;BZ)V")
	public void method2426(@OriginalArg(0) Class171 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass171_2 != null) {
			try {
				this.aClass171_2.method4637();
			} catch (@Pc(18) Exception local18) {
			}
			this.aClass171_2 = null;
		}
		this.aClass171_2 = arg0;
		this.method2427();
		this.method2439(arg1);
		this.aClass4_Sub7_3.anInt2667 = 0;
		this.aClass4_Sub1_Sub18_Sub2_1 = null;
		while (true) {
			@Pc(48) Class4_Sub1_Sub18_Sub2 local48 = (Class4_Sub1_Sub18_Sub2) this.aClass178_5.method4772();
			if (local48 == null) {
				while (true) {
					local48 = (Class4_Sub1_Sub18_Sub2) this.aClass178_7.method4772();
					if (local48 == null) {
						if (this.aByte37 != 0) {
							try {
								this.aClass4_Sub7_2.anInt2667 = 0;
								this.aClass4_Sub7_2.method2416(4);
								this.aClass4_Sub7_2.method2416(this.aByte37);
								this.aClass4_Sub7_2.method2376(0);
								this.aClass171_2.method4636(this.aClass4_Sub7_2.aByteArray42, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass171_2.method4637();
								} catch (@Pc(112) Exception local112) {
								}
								this.aClass171_2 = null;
								this.anInt2727++;
								this.anInt2728 = -2;
							}
						}
						this.anInt2726 = 0;
						this.aLong90 = Static274.method4763();
						return;
					}
					this.aClass178_6.method4767(local48);
				}
			}
			this.aClass178_4.method4767(local48);
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V")
	private void method2427() {
		if (this.aClass171_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub7_2.anInt2667 = 0;
			this.aClass4_Sub7_2.method2416(6);
			this.aClass4_Sub7_2.method2412(3);
			this.aClass171_2.method4636(this.aClass4_Sub7_2.aByteArray42, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass171_2.method4637();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt2728 = -2;
			this.aClass171_2 = null;
			this.anInt2727++;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	public void method2428() {
		if (this.aClass171_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub7_2.anInt2667 = 0;
			this.aClass4_Sub7_2.method2416(7);
			this.aClass4_Sub7_2.method2412(0);
			this.aClass171_2.method4636(this.aClass4_Sub7_2.aByteArray42, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass171_2.method4637();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass171_2 = null;
			this.anInt2727++;
			this.anInt2728 = -2;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	public void method2429() {
		if (this.aClass171_2 != null) {
			this.aClass171_2.method4637();
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)Z")
	public boolean method2431() {
		return this.method2433() >= 20;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)Z")
	public boolean method2432() {
		@Pc(14) int local14;
		if (this.aClass171_2 != null) {
			@Pc(7) long local7 = Static274.method4763();
			local14 = (int) (local7 - this.aLong90);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong90 = local7;
			this.anInt2726 += local14;
			if (this.anInt2726 > 30000) {
				try {
					this.aClass171_2.method4637();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass171_2 = null;
			}
		}
		if (this.aClass171_2 == null) {
			return this.method2433() == 0 && this.method2437() == 0;
		}
		try {
			this.aClass171_2.method4634();
			for (@Pc(74) Class4_Sub1_Sub18_Sub2 local74 = (Class4_Sub1_Sub18_Sub2) this.aClass178_4.method4773(); local74 != null; local74 = (Class4_Sub1_Sub18_Sub2) this.aClass178_4.method4771()) {
				this.aClass4_Sub7_2.anInt2667 = 0;
				this.aClass4_Sub7_2.method2416(1);
				this.aClass4_Sub7_2.method2412((int) local74.aLong254);
				this.aClass171_2.method4636(this.aClass4_Sub7_2.aByteArray42, 4);
				this.aClass178_5.method4767(local74);
			}
			for (@Pc(126) Class4_Sub1_Sub18_Sub2 local126 = (Class4_Sub1_Sub18_Sub2) this.aClass178_6.method4773(); local126 != null; local126 = (Class4_Sub1_Sub18_Sub2) this.aClass178_6.method4771()) {
				this.aClass4_Sub7_2.anInt2667 = 0;
				this.aClass4_Sub7_2.method2416(0);
				this.aClass4_Sub7_2.method2412((int) local126.aLong254);
				this.aClass171_2.method4636(this.aClass4_Sub7_2.aByteArray42, 4);
				this.aClass178_7.method4767(local126);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(175) int local175 = this.aClass171_2.method4638();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt2726 = 0;
				@Pc(188) byte local188 = 0;
				if (this.aClass4_Sub1_Sub18_Sub2_1 == null) {
					local188 = 8;
				} else if (this.aClass4_Sub1_Sub18_Sub2_1.anInt5511 == 0) {
					local188 = 1;
				}
				@Pc(213) int local213;
				@Pc(241) int local241;
				@Pc(302) int local302;
				if (local188 > 0) {
					local213 = local188 - this.aClass4_Sub7_3.anInt2667;
					if (local213 > local175) {
						local213 = local175;
					}
					this.aClass171_2.method4628(this.aClass4_Sub7_3.aByteArray42, local213, this.aClass4_Sub7_3.anInt2667);
					if (this.aByte37 != 0) {
						for (local241 = 0; local241 < local213; local241++) {
							this.aClass4_Sub7_3.aByteArray42[local241 + this.aClass4_Sub7_3.anInt2667] ^= this.aByte37;
						}
					}
					this.aClass4_Sub7_3.anInt2667 += local213;
					if (this.aClass4_Sub7_3.anInt2667 >= local188) {
						if (this.aClass4_Sub1_Sub18_Sub2_1 == null) {
							this.aClass4_Sub7_3.anInt2667 = 0;
							local241 = this.aClass4_Sub7_3.method2380();
							local302 = this.aClass4_Sub7_3.method2404();
							@Pc(307) int local307 = this.aClass4_Sub7_3.method2380();
							@Pc(312) int local312 = this.aClass4_Sub7_3.method2389();
							@Pc(316) int local316 = local307 & 0x7F;
							@Pc(327) boolean local327 = (local307 & 0x80) != 0;
							@Pc(335) long local335 = (long) ((local241 << 16) + local302);
							@Pc(345) Class4_Sub1_Sub18_Sub2 local345;
							if (local327) {
								for (local345 = (Class4_Sub1_Sub18_Sub2) this.aClass178_7.method4773(); local345 != null && local335 != local345.aLong254; local345 = (Class4_Sub1_Sub18_Sub2) this.aClass178_7.method4771()) {
								}
							} else {
								for (local345 = (Class4_Sub1_Sub18_Sub2) this.aClass178_5.method4773(); local345 != null && local335 != local345.aLong254; local345 = (Class4_Sub1_Sub18_Sub2) this.aClass178_5.method4771()) {
								}
							}
							if (local345 == null) {
								throw new IOException();
							}
							@Pc(405) int local405 = local316 == 0 ? 5 : 9;
							this.aClass4_Sub1_Sub18_Sub2_1 = local345;
							this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7 = new Class4_Sub7(this.aClass4_Sub1_Sub18_Sub2_1.aByte67 + local405 + local312);
							this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.method2416(local316);
							this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.method2387(local312);
							this.aClass4_Sub7_3.anInt2667 = 0;
							this.aClass4_Sub1_Sub18_Sub2_1.anInt5511 = 8;
						} else if (this.aClass4_Sub1_Sub18_Sub2_1.anInt5511 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub7_3.aByteArray42[0] == -1) {
							this.aClass4_Sub1_Sub18_Sub2_1.anInt5511 = 1;
							this.aClass4_Sub7_3.anInt2667 = 0;
						} else {
							this.aClass4_Sub1_Sub18_Sub2_1 = null;
						}
					}
				} else {
					local213 = this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.aByteArray42.length - this.aClass4_Sub1_Sub18_Sub2_1.aByte67;
					local241 = 512 - this.aClass4_Sub1_Sub18_Sub2_1.anInt5511;
					if (local213 - this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.anInt2667 < local241) {
						local241 = local213 - this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.anInt2667;
					}
					if (local241 > local175) {
						local241 = local175;
					}
					this.aClass171_2.method4628(this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.aByteArray42, local241, this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.anInt2667);
					if (this.aByte37 != 0) {
						for (local302 = 0; local302 < local241; local302++) {
							this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.aByteArray42[local302 + this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.anInt2667] ^= this.aByte37;
						}
					}
					this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.anInt2667 += local241;
					this.aClass4_Sub1_Sub18_Sub2_1.anInt5511 += local241;
					if (this.aClass4_Sub1_Sub18_Sub2_1.aClass4_Sub7_7.anInt2667 == local213) {
						this.aClass4_Sub1_Sub18_Sub2_1.method5555();
						this.aClass4_Sub1_Sub18_Sub2_1.aBoolean489 = false;
						this.aClass4_Sub1_Sub18_Sub2_1 = null;
					} else if (this.aClass4_Sub1_Sub18_Sub2_1.anInt5511 == 512) {
						this.aClass4_Sub1_Sub18_Sub2_1.anInt5511 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(622) IOException local622) {
			try {
				this.aClass171_2.method4637();
			} catch (@Pc(628) Exception local628) {
			}
			this.anInt2727++;
			this.aClass171_2 = null;
			this.anInt2728 = -2;
			return this.method2433() == 0 && this.method2437() == 0;
		}
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)I")
	public int method2433() {
		return this.aClass178_4.method4766() + this.aClass178_5.method4766();
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
	public void method2434() {
		if (this.aClass171_2 != null) {
			this.aClass171_2.method4629();
		}
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)I")
	private int method2437() {
		return this.aClass178_6.method4766() + this.aClass178_7.method4766();
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V")
	public void method2438() {
		try {
			this.aClass171_2.method4637();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt2728 = -1;
		this.aByte37 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass171_2 = null;
		this.anInt2727++;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
	public void method2439(@OriginalArg(1) boolean arg0) {
		if (this.aClass171_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub7_2.anInt2667 = 0;
			this.aClass4_Sub7_2.method2416(arg0 ? 2 : 3);
			this.aClass4_Sub7_2.method2412(0);
			this.aClass171_2.method4636(this.aClass4_Sub7_2.aByteArray42, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass171_2.method4637();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt2727++;
			this.anInt2728 = -2;
			this.aClass171_2 = null;
		}
	}
}
