import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class165 {

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "Lclient!rr;")
	private Class173 aClass173_5;

	@OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
	private int anInt5430;

	@OriginalMember(owner = "client!qs", name = "G", descriptor = "Lclient!qb;")
	private Class2_Sub11_Sub4_Sub2 aClass2_Sub11_Sub4_Sub2_2;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Lclient!ek;")
	private final Class54 aClass54_5 = new Class54();

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Lclient!ek;")
	private final Class54 aClass54_6 = new Class54();

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "Lclient!ek;")
	private final Class54 aClass54_7 = new Class54();

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "Lclient!ek;")
	private final Class54 aClass54_8 = new Class54();

	@OriginalMember(owner = "client!qs", name = "z", descriptor = "Lclient!dg;")
	private final Class2_Sub10 aClass2_Sub10_6 = new Class2_Sub10(4);

	@OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
	public volatile int anInt5431 = 0;

	@OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
	public volatile int anInt5432 = 0;

	@OriginalMember(owner = "client!qs", name = "F", descriptor = "B")
	private byte aByte60 = 0;

	@OriginalMember(owner = "client!qs", name = "D", descriptor = "Lclient!dg;")
	private final Class2_Sub10 aClass2_Sub10_7 = new Class2_Sub10(8);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
	public void method4795() {
		if (this.aClass173_5 != null) {
			this.aClass173_5.method5025();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
	public boolean method4797() {
		@Pc(14) int local14;
		if (this.aClass173_5 != null) {
			@Pc(7) long local7 = Static51.method1197();
			local14 = (int) (local7 - this.aLong158);
			this.aLong158 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt5430 += local14;
			if (this.anInt5430 > 30000) {
				try {
					this.aClass173_5.method5027();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass173_5 = null;
			}
		}
		if (this.aClass173_5 == null) {
			return this.method4807() == 0 && this.method4801() == 0;
		}
		try {
			this.aClass173_5.method5022();
			for (@Pc(74) Class2_Sub11_Sub4_Sub2 local74 = (Class2_Sub11_Sub4_Sub2) this.aClass54_5.method1661(); local74 != null; local74 = (Class2_Sub11_Sub4_Sub2) this.aClass54_5.method1657()) {
				this.aClass2_Sub10_6.anInt4807 = 0;
				this.aClass2_Sub10_6.method4430(1);
				this.aClass2_Sub10_6.method4445((int) local74.aLong212);
				this.aClass173_5.method5021(4, this.aClass2_Sub10_6.aByteArray57);
				this.aClass54_6.method1662(local74);
			}
			for (@Pc(129) Class2_Sub11_Sub4_Sub2 local129 = (Class2_Sub11_Sub4_Sub2) this.aClass54_7.method1661(); local129 != null; local129 = (Class2_Sub11_Sub4_Sub2) this.aClass54_7.method1657()) {
				this.aClass2_Sub10_6.anInt4807 = 0;
				this.aClass2_Sub10_6.method4430(0);
				this.aClass2_Sub10_6.method4445((int) local129.aLong212);
				this.aClass173_5.method5021(4, this.aClass2_Sub10_6.aByteArray57);
				this.aClass54_8.method1662(local129);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(178) int local178 = this.aClass173_5.method5024();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt5430 = 0;
				@Pc(194) byte local194 = 0;
				if (this.aClass2_Sub11_Sub4_Sub2_2 == null) {
					local194 = 8;
				} else if (this.aClass2_Sub11_Sub4_Sub2_2.anInt4902 == 0) {
					local194 = 1;
				}
				@Pc(226) int local226;
				@Pc(233) int local233;
				@Pc(272) int local272;
				if (local194 <= 0) {
					local226 = this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.aByteArray57.length - this.aClass2_Sub11_Sub4_Sub2_2.aByte41;
					local233 = 512 - this.aClass2_Sub11_Sub4_Sub2_2.anInt4902;
					if (local226 - this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.anInt4807 < local233) {
						local233 = local226 - this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.anInt4807;
					}
					if (local178 < local233) {
						local233 = local178;
					}
					this.aClass173_5.method5020(this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.aByteArray57, this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.anInt4807, local233);
					if (this.aByte60 != 0) {
						for (local272 = 0; local272 < local233; local272++) {
							this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.aByteArray57[this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.anInt4807 + local272] ^= this.aByte60;
						}
					}
					this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.anInt4807 += local233;
					this.aClass2_Sub11_Sub4_Sub2_2.anInt4902 += local233;
					if (local226 == this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.anInt4807) {
						this.aClass2_Sub11_Sub4_Sub2_2.method5914();
						this.aClass2_Sub11_Sub4_Sub2_2.aBoolean446 = false;
						this.aClass2_Sub11_Sub4_Sub2_2 = null;
					} else if (this.aClass2_Sub11_Sub4_Sub2_2.anInt4902 == 512) {
						this.aClass2_Sub11_Sub4_Sub2_2.anInt4902 = 0;
					}
				} else {
					local226 = local194 - this.aClass2_Sub10_7.anInt4807;
					if (local226 > local178) {
						local226 = local178;
					}
					this.aClass173_5.method5020(this.aClass2_Sub10_7.aByteArray57, this.aClass2_Sub10_7.anInt4807, local226);
					if (this.aByte60 != 0) {
						for (local233 = 0; local233 < local226; local233++) {
							this.aClass2_Sub10_7.aByteArray57[local233 + this.aClass2_Sub10_7.anInt4807] ^= this.aByte60;
						}
					}
					this.aClass2_Sub10_7.anInt4807 += local226;
					if (local194 <= this.aClass2_Sub10_7.anInt4807) {
						if (this.aClass2_Sub11_Sub4_Sub2_2 == null) {
							this.aClass2_Sub10_7.anInt4807 = 0;
							local233 = this.aClass2_Sub10_7.method4421();
							local272 = this.aClass2_Sub10_7.method4464();
							@Pc(449) int local449 = this.aClass2_Sub10_7.method4421();
							@Pc(454) int local454 = this.aClass2_Sub10_7.method4444();
							@Pc(458) int local458 = local449 & 0x7F;
							@Pc(469) boolean local469 = (local449 & 0x80) != 0;
							@Pc(476) long local476 = (long) (local272 + (local233 << 16));
							@Pc(486) Class2_Sub11_Sub4_Sub2 local486;
							if (local469) {
								for (local486 = (Class2_Sub11_Sub4_Sub2) this.aClass54_8.method1661(); local486 != null && local476 != local486.aLong212; local486 = (Class2_Sub11_Sub4_Sub2) this.aClass54_8.method1657()) {
								}
							} else {
								for (local486 = (Class2_Sub11_Sub4_Sub2) this.aClass54_6.method1661(); local486 != null && local476 != local486.aLong212; local486 = (Class2_Sub11_Sub4_Sub2) this.aClass54_6.method1657()) {
								}
							}
							if (local486 == null) {
								throw new IOException();
							}
							@Pc(550) int local550 = local458 == 0 ? 5 : 9;
							this.aClass2_Sub11_Sub4_Sub2_2 = local486;
							this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5 = new Class2_Sub10(this.aClass2_Sub11_Sub4_Sub2_2.aByte41 + local454 + local550);
							this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.method4430(local458);
							this.aClass2_Sub11_Sub4_Sub2_2.aClass2_Sub10_5.method4450(local454);
							this.aClass2_Sub11_Sub4_Sub2_2.anInt4902 = 8;
							this.aClass2_Sub10_7.anInt4807 = 0;
						} else if (this.aClass2_Sub11_Sub4_Sub2_2.anInt4902 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub10_7.aByteArray57[0] == -1) {
							this.aClass2_Sub10_7.anInt4807 = 0;
							this.aClass2_Sub11_Sub4_Sub2_2.anInt4902 = 1;
						} else {
							this.aClass2_Sub11_Sub4_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(630) IOException local630) {
			try {
				this.aClass173_5.method5027();
			} catch (@Pc(636) Exception local636) {
			}
			this.anInt5431++;
			this.anInt5432 = -2;
			this.aClass173_5 = null;
			return this.method4807() == 0 && this.method4801() == 0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z")
	public boolean method4798() {
		return this.method4801() >= 20;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!rr;Z)V")
	public void method4799(@OriginalArg(1) Class173 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass173_5 != null) {
			try {
				this.aClass173_5.method5027();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass173_5 = null;
		}
		this.aClass173_5 = arg0;
		this.method4802();
		this.method4805(arg1);
		this.aClass2_Sub11_Sub4_Sub2_2 = null;
		this.aClass2_Sub10_7.anInt4807 = 0;
		while (true) {
			@Pc(46) Class2_Sub11_Sub4_Sub2 local46 = (Class2_Sub11_Sub4_Sub2) this.aClass54_6.method1658();
			if (local46 == null) {
				while (true) {
					local46 = (Class2_Sub11_Sub4_Sub2) this.aClass54_8.method1658();
					if (local46 == null) {
						if (this.aByte60 != 0) {
							try {
								this.aClass2_Sub10_6.anInt4807 = 0;
								this.aClass2_Sub10_6.method4430(4);
								this.aClass2_Sub10_6.method4430(this.aByte60);
								this.aClass2_Sub10_6.method4452(0);
								this.aClass173_5.method5021(4, this.aClass2_Sub10_6.aByteArray57);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass173_5.method5027();
								} catch (@Pc(112) Exception local112) {
								}
								this.anInt5431++;
								this.anInt5432 = -2;
								this.aClass173_5 = null;
							}
						}
						this.anInt5430 = 0;
						this.aLong158 = Static51.method1197();
						return;
					}
					this.aClass54_7.method1662(local46);
				}
			}
			this.aClass54_5.method1662(local46);
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)I")
	private int method4801() {
		return this.aClass54_7.method1659() + this.aClass54_8.method1659();
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)V")
	private void method4802() {
		if (this.aClass173_5 == null) {
			return;
		}
		try {
			this.aClass2_Sub10_6.anInt4807 = 0;
			this.aClass2_Sub10_6.method4430(6);
			this.aClass2_Sub10_6.method4445(3);
			this.aClass173_5.method5021(4, this.aClass2_Sub10_6.aByteArray57);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass173_5.method5027();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt5431++;
			this.aClass173_5 = null;
			this.anInt5432 = -2;
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	public void method4803() {
		if (this.aClass173_5 != null) {
			this.aClass173_5.method5027();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V")
	public void method4805(@OriginalArg(0) boolean arg0) {
		if (this.aClass173_5 == null) {
			return;
		}
		try {
			this.aClass2_Sub10_6.anInt4807 = 0;
			this.aClass2_Sub10_6.method4430(arg0 ? 2 : 3);
			this.aClass2_Sub10_6.method4445(0);
			this.aClass173_5.method5021(4, this.aClass2_Sub10_6.aByteArray57);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass173_5.method5027();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt5432 = -2;
			this.aClass173_5 = null;
			this.anInt5431++;
		}
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
	public void method4806() {
		if (this.aClass173_5 == null) {
			return;
		}
		try {
			this.aClass2_Sub10_6.anInt4807 = 0;
			this.aClass2_Sub10_6.method4430(7);
			this.aClass2_Sub10_6.method4445(0);
			this.aClass173_5.method5021(4, this.aClass2_Sub10_6.aByteArray57);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass173_5.method5027();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt5431++;
			this.aClass173_5 = null;
			this.anInt5432 = -2;
		}
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)I")
	public int method4807() {
		return this.aClass54_5.method1659() + this.aClass54_6.method1659();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBZZI)Lclient!qb;")
	public Class2_Sub11_Sub4_Sub2 method4809(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) ((arg0 << 16) + arg3);
		@Pc(20) Class2_Sub11_Sub4_Sub2 local20 = new Class2_Sub11_Sub4_Sub2();
		local20.aByte41 = arg1;
		local20.aLong212 = local16;
		local20.aBoolean448 = arg2;
		if (arg2) {
			if (this.method4807() >= 20) {
				throw new RuntimeException();
			}
			this.aClass54_5.method1662(local20);
		} else if (this.method4801() < 20) {
			this.aClass54_7.method1662(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(Z)Z")
	public boolean method4810() {
		return this.method4807() >= 20;
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(I)V")
	public void method4811() {
		try {
			this.aClass173_5.method5027();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt5431++;
		this.aByte60 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5432 = -1;
		this.aClass173_5 = null;
	}
}
