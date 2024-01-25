import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class87 {

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "Lclient!fc;")
	private Class73 aClass73_1;

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "Lclient!si;")
	private Class5_Sub2_Sub3_Sub2 aClass5_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!jh;")
	private final Class123 aClass123_5 = new Class123();

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!jh;")
	private final Class123 aClass123_6 = new Class123();

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "Lclient!jh;")
	private final Class123 aClass123_7 = new Class123();

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Lclient!jh;")
	private final Class123 aClass123_8 = new Class123();

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Lclient!fh;")
	private final Class5_Sub15 aClass5_Sub15_1 = new Class5_Sub15(4);

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "B")
	private byte aByte21 = 0;

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
	public volatile int anInt2328 = 0;

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
	public volatile int anInt2327 = 0;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Lclient!fh;")
	private final Class5_Sub15 aClass5_Sub15_2 = new Class5_Sub15(8);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public int method1861() {
		return this.aClass123_5.method2617() + this.aClass123_6.method2617();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BZ)V")
	public void method1862(@OriginalArg(1) boolean arg0) {
		if (this.aClass73_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub15_1.anInt7013 = 0;
			this.aClass5_Sub15_1.method5583(arg0 ? 2 : 3);
			this.aClass5_Sub15_1.method5595(0);
			this.aClass73_1.method1555(4, this.aClass5_Sub15_1.aByteArray93);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass73_1.method1556();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt2327 = -2;
			this.anInt2328++;
			this.aClass73_1 = null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method1863() {
		try {
			this.aClass73_1.method1556();
		} catch (@Pc(11) Exception local11) {
		}
		this.aClass73_1 = null;
		this.aByte21 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2328++;
		this.anInt2327 = -1;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public void method1864() {
		if (this.aClass73_1 != null) {
			this.aClass73_1.method1556();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZBIIZ)Lclient!si;")
	public Class5_Sub2_Sub3_Sub2 method1865(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg1 << 16));
		@Pc(14) Class5_Sub2_Sub3_Sub2 local14 = new Class5_Sub2_Sub3_Sub2();
		local14.aLong235 = local10;
		local14.aBoolean404 = arg3;
		local14.aByte83 = arg0;
		if (arg3) {
			if (this.method1861() >= 20) {
				throw new RuntimeException();
			}
			this.aClass123_5.method2620(local14);
		} else if (this.method1866() < 20) {
			this.aClass123_7.method2620(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)I")
	private int method1866() {
		return this.aClass123_7.method2617() + this.aClass123_8.method2617();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	private void method1868() {
		if (this.aClass73_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub15_1.anInt7013 = 0;
			this.aClass5_Sub15_1.method5583(6);
			this.aClass5_Sub15_1.method5595(3);
			this.aClass73_1.method1555(4, this.aClass5_Sub15_1.aByteArray93);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass73_1.method1556();
			} catch (@Pc(49) Exception local49) {
			}
			this.aClass73_1 = null;
			this.anInt2327 = -2;
			this.anInt2328++;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!fc;ZB)V")
	public void method1870(@OriginalArg(0) Class73 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass73_1 != null) {
			try {
				this.aClass73_1.method1556();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass73_1 = null;
		}
		this.aClass73_1 = arg0;
		this.method1868();
		this.method1862(arg1);
		this.aClass5_Sub15_2.anInt7013 = 0;
		this.aClass5_Sub2_Sub3_Sub2_1 = null;
		while (true) {
			@Pc(46) Class5_Sub2_Sub3_Sub2 local46 = (Class5_Sub2_Sub3_Sub2) this.aClass123_6.method2619();
			if (local46 == null) {
				while (true) {
					local46 = (Class5_Sub2_Sub3_Sub2) this.aClass123_8.method2619();
					if (local46 == null) {
						if (this.aByte21 != 0) {
							try {
								this.aClass5_Sub15_1.anInt7013 = 0;
								this.aClass5_Sub15_1.method5583(4);
								this.aClass5_Sub15_1.method5583(this.aByte21);
								this.aClass5_Sub15_1.method5566(0);
								this.aClass73_1.method1555(4, this.aClass5_Sub15_1.aByteArray93);
							} catch (@Pc(104) IOException local104) {
								try {
									this.aClass73_1.method1556();
								} catch (@Pc(110) Exception local110) {
								}
								this.anInt2327 = -2;
								this.anInt2328++;
								this.aClass73_1 = null;
							}
						}
						this.anInt2326 = 0;
						this.aLong69 = Static446.method5903();
						return;
					}
					this.aClass123_7.method2620(local46);
				}
			}
			this.aClass123_5.method2620(local46);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)Z")
	public boolean method1871() {
		@Pc(18) int local18;
		if (this.aClass73_1 != null) {
			@Pc(11) long local11 = Static446.method5903();
			local18 = (int) (local11 - this.aLong69);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong69 = local11;
			this.anInt2326 += local18;
			if (this.anInt2326 > 30000) {
				try {
					this.aClass73_1.method1556();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass73_1 = null;
			}
		}
		if (this.aClass73_1 == null) {
			return this.method1861() == 0 && this.method1866() == 0;
		}
		try {
			this.aClass73_1.method1559();
			for (@Pc(77) Class5_Sub2_Sub3_Sub2 local77 = (Class5_Sub2_Sub3_Sub2) this.aClass123_5.method2616(); local77 != null; local77 = (Class5_Sub2_Sub3_Sub2) this.aClass123_5.method2618()) {
				this.aClass5_Sub15_1.anInt7013 = 0;
				this.aClass5_Sub15_1.method5583(1);
				this.aClass5_Sub15_1.method5595((int) local77.aLong235);
				this.aClass73_1.method1555(4, this.aClass5_Sub15_1.aByteArray93);
				this.aClass123_6.method2620(local77);
			}
			for (@Pc(125) Class5_Sub2_Sub3_Sub2 local125 = (Class5_Sub2_Sub3_Sub2) this.aClass123_7.method2616(); local125 != null; local125 = (Class5_Sub2_Sub3_Sub2) this.aClass123_7.method2618()) {
				this.aClass5_Sub15_1.anInt7013 = 0;
				this.aClass5_Sub15_1.method5583(0);
				this.aClass5_Sub15_1.method5595((int) local125.aLong235);
				this.aClass73_1.method1555(4, this.aClass5_Sub15_1.aByteArray93);
				this.aClass123_8.method2620(local125);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(181) int local181 = this.aClass73_1.method1564();
				if (local181 < 0) {
					throw new IOException();
				}
				if (local181 == 0) {
					break;
				}
				this.anInt2326 = 0;
				@Pc(197) byte local197 = 0;
				if (this.aClass5_Sub2_Sub3_Sub2_1 == null) {
					local197 = 8;
				} else if (this.aClass5_Sub2_Sub3_Sub2_1.anInt6103 == 0) {
					local197 = 1;
				}
				@Pc(226) int local226;
				@Pc(233) int local233;
				@Pc(276) int local276;
				if (local197 <= 0) {
					local226 = this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.aByteArray93.length - this.aClass5_Sub2_Sub3_Sub2_1.aByte83;
					local233 = 512 - this.aClass5_Sub2_Sub3_Sub2_1.anInt6103;
					if (local233 > local226 - this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.anInt7013) {
						local233 = local226 - this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.anInt7013;
					}
					if (local233 > local181) {
						local233 = local181;
					}
					this.aClass73_1.method1563(this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.aByteArray93, local233, this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.anInt7013);
					if (this.aByte21 != 0) {
						for (local276 = 0; local276 < local233; local276++) {
							this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.aByteArray93[this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.anInt7013 + local276] = (byte) (this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.aByteArray93[this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.anInt7013 + local276] ^ this.aByte21);
						}
					}
					this.aClass5_Sub2_Sub3_Sub2_1.anInt6103 += local233;
					this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.anInt7013 += local233;
					if (local226 == this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.anInt7013) {
						this.aClass5_Sub2_Sub3_Sub2_1.method6006();
						this.aClass5_Sub2_Sub3_Sub2_1.aBoolean403 = false;
						this.aClass5_Sub2_Sub3_Sub2_1 = null;
					} else if (this.aClass5_Sub2_Sub3_Sub2_1.anInt6103 == 512) {
						this.aClass5_Sub2_Sub3_Sub2_1.anInt6103 = 0;
					}
				} else {
					local226 = local197 - this.aClass5_Sub15_2.anInt7013;
					if (local181 < local226) {
						local226 = local181;
					}
					this.aClass73_1.method1563(this.aClass5_Sub15_2.aByteArray93, local226, this.aClass5_Sub15_2.anInt7013);
					if (this.aByte21 != 0) {
						for (local233 = 0; local233 < local226; local233++) {
							this.aClass5_Sub15_2.aByteArray93[this.aClass5_Sub15_2.anInt7013 + local233] = (byte) (this.aClass5_Sub15_2.aByteArray93[this.aClass5_Sub15_2.anInt7013 + local233] ^ this.aByte21);
						}
					}
					this.aClass5_Sub15_2.anInt7013 += local226;
					if (local197 <= this.aClass5_Sub15_2.anInt7013) {
						if (this.aClass5_Sub2_Sub3_Sub2_1 == null) {
							this.aClass5_Sub15_2.anInt7013 = 0;
							local233 = this.aClass5_Sub15_2.method5539();
							local276 = this.aClass5_Sub15_2.method5598();
							@Pc(466) int local466 = this.aClass5_Sub15_2.method5539();
							@Pc(471) int local471 = this.aClass5_Sub15_2.method5603();
							@Pc(475) int local475 = local466 & 0x7F;
							@Pc(483) boolean local483 = (local466 & 0x80) != 0;
							@Pc(490) long local490 = (long) (local276 + (local233 << 16));
							@Pc(500) Class5_Sub2_Sub3_Sub2 local500;
							if (local483) {
								for (local500 = (Class5_Sub2_Sub3_Sub2) this.aClass123_8.method2616(); local500 != null && local500.aLong235 != local490; local500 = (Class5_Sub2_Sub3_Sub2) this.aClass123_8.method2618()) {
								}
							} else {
								for (local500 = (Class5_Sub2_Sub3_Sub2) this.aClass123_6.method2616(); local500 != null && local490 != local500.aLong235; local500 = (Class5_Sub2_Sub3_Sub2) this.aClass123_6.method2618()) {
								}
							}
							if (local500 == null) {
								throw new IOException();
							}
							@Pc(560) int local560 = local475 == 0 ? 5 : 9;
							this.aClass5_Sub2_Sub3_Sub2_1 = local500;
							this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7 = new Class5_Sub15(local471 + local560 + this.aClass5_Sub2_Sub3_Sub2_1.aByte83);
							this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.method5583(local475);
							this.aClass5_Sub2_Sub3_Sub2_1.aClass5_Sub15_7.method5550(local471);
							this.aClass5_Sub15_2.anInt7013 = 0;
							this.aClass5_Sub2_Sub3_Sub2_1.anInt6103 = 8;
						} else if (this.aClass5_Sub2_Sub3_Sub2_1.anInt6103 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub15_2.aByteArray93[0] == -1) {
							this.aClass5_Sub2_Sub3_Sub2_1.anInt6103 = 1;
							this.aClass5_Sub15_2.anInt7013 = 0;
						} else {
							this.aClass5_Sub2_Sub3_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(636) IOException local636) {
			try {
				this.aClass73_1.method1556();
			} catch (@Pc(642) Exception local642) {
			}
			this.anInt2327 = -2;
			this.aClass73_1 = null;
			this.anInt2328++;
			return this.method1861() == 0 && this.method1866() == 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
	public boolean method1872() {
		return this.method1861() >= 20;
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)Z")
	public boolean method1873() {
		return this.method1866() >= 20;
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
	public void method1874() {
		if (this.aClass73_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub15_1.anInt7013 = 0;
			this.aClass5_Sub15_1.method5583(7);
			this.aClass5_Sub15_1.method5595(0);
			this.aClass73_1.method1555(4, this.aClass5_Sub15_1.aByteArray93);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass73_1.method1556();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass73_1 = null;
			this.anInt2327 = -2;
			this.anInt2328++;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	public void method1876() {
		if (this.aClass73_1 != null) {
			this.aClass73_1.method1557();
		}
	}
}
