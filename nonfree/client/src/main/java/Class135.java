import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class135 {

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
	private int anInt3733;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "Lclient!sv;")
	private Class329 aClass329_1;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "Lclient!kka;")
	private Class14_Sub3_Sub2_Sub1 aClass14_Sub3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!dha;")
	private final Class73 aClass73_4 = new Class73();

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "Lclient!dha;")
	private final Class73 aClass73_5 = new Class73();

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "Lclient!dha;")
	private final Class73 aClass73_6 = new Class73();

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "Lclient!dha;")
	private final Class73 aClass73_7 = new Class73();

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "Lclient!so;")
	private final Class14_Sub29 aClass14_Sub29_3 = new Class14_Sub29(4);

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "B")
	private byte aByte74 = 0;

	@OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
	public volatile int anInt3735 = 0;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
	public volatile int anInt3734 = 0;

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "Lclient!so;")
	private final Class14_Sub29 aClass14_Sub29_4 = new Class14_Sub29(8);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public void method3059() {
		if (this.aClass329_1 != null) {
			this.aClass329_1.method7842();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIBZ)Lclient!kka;")
	public Class14_Sub3_Sub2_Sub1 method3060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		@Pc(21) Class14_Sub3_Sub2_Sub1 local21 = new Class14_Sub3_Sub2_Sub1();
		local21.aByte87 = arg2;
		local21.aLong302 = local11;
		local21.aBoolean492 = arg3;
		if (arg3) {
			if (this.method3065() >= 20) {
				throw new RuntimeException();
			}
			this.aClass73_4.method1816(local21);
		} else if (this.method3062() < 20) {
			this.aClass73_6.method1816(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
	private int method3062() {
		return this.aClass73_6.method1822() + this.aClass73_7.method1822();
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
	public void method3063() {
		if (this.aClass329_1 != null) {
			this.aClass329_1.method7837();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
	public void method3064() {
		if (this.aClass329_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub29_3.anInt7264 = 0;
			this.aClass14_Sub29_3.method5854(7);
			this.aClass14_Sub29_3.method5897(0);
			this.aClass329_1.method7846(this.aClass14_Sub29_3.aByteArray84, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass329_1.method7842();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass329_1 = null;
			this.anInt3734 = -2;
			this.anInt3735++;
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	public int method3065() {
		return this.aClass73_4.method1822() + this.aClass73_5.method1822();
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	private void method3066() {
		if (this.aClass329_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub29_3.anInt7264 = 0;
			this.aClass14_Sub29_3.method5854(6);
			this.aClass14_Sub29_3.method5897(3);
			this.aClass329_1.method7846(this.aClass14_Sub29_3.aByteArray84, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass329_1.method7842();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass329_1 = null;
			this.anInt3734 = -2;
			this.anInt3735++;
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)Z")
	public boolean method3067() {
		@Pc(13) int local13;
		if (this.aClass329_1 != null) {
			@Pc(7) long local7 = Static521.method7499();
			local13 = (int) (local7 - this.aLong113);
			this.aLong113 = local7;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt3733 += local13;
			if (this.anInt3733 > 30000) {
				try {
					this.aClass329_1.method7842();
				} catch (@Pc(39) Exception local39) {
				}
				this.aClass329_1 = null;
			}
		}
		if (this.aClass329_1 == null) {
			return this.method3065() == 0 && this.method3062() == 0;
		}
		try {
			this.aClass329_1.method7836();
			for (@Pc(71) Class14_Sub3_Sub2_Sub1 local71 = (Class14_Sub3_Sub2_Sub1) this.aClass73_4.method1826(); local71 != null; local71 = (Class14_Sub3_Sub2_Sub1) this.aClass73_4.method1827()) {
				this.aClass14_Sub29_3.anInt7264 = 0;
				this.aClass14_Sub29_3.method5854(1);
				this.aClass14_Sub29_3.method5897((int) local71.aLong302);
				this.aClass329_1.method7846(this.aClass14_Sub29_3.aByteArray84, 4);
				this.aClass73_5.method1816(local71);
			}
			for (@Pc(123) Class14_Sub3_Sub2_Sub1 local123 = (Class14_Sub3_Sub2_Sub1) this.aClass73_6.method1826(); local123 != null; local123 = (Class14_Sub3_Sub2_Sub1) this.aClass73_6.method1827()) {
				this.aClass14_Sub29_3.anInt7264 = 0;
				this.aClass14_Sub29_3.method5854(0);
				this.aClass14_Sub29_3.method5897((int) local123.aLong302);
				this.aClass329_1.method7846(this.aClass14_Sub29_3.aByteArray84, 4);
				this.aClass73_7.method1816(local123);
			}
			for (local13 = 0; local13 < 100; local13++) {
				@Pc(172) int local172 = this.aClass329_1.method7839();
				if (local172 < 0) {
					throw new IOException();
				}
				if (local172 == 0) {
					break;
				}
				this.anInt3733 = 0;
				@Pc(188) byte local188 = 0;
				if (this.aClass14_Sub3_Sub2_Sub1_1 == null) {
					local188 = 8;
				} else if (this.aClass14_Sub3_Sub2_Sub1_1.anInt5370 == 0) {
					local188 = 1;
				}
				@Pc(216) int local216;
				@Pc(241) int local241;
				@Pc(298) int local298;
				if (local188 > 0) {
					local216 = local188 - this.aClass14_Sub29_4.anInt7264;
					if (local216 > local172) {
						local216 = local172;
					}
					this.aClass329_1.method7843(this.aClass14_Sub29_4.anInt7264, local216, this.aClass14_Sub29_4.aByteArray84);
					if (this.aByte74 != 0) {
						for (local241 = 0; local241 < local216; local241++) {
							this.aClass14_Sub29_4.aByteArray84[this.aClass14_Sub29_4.anInt7264 + local241] ^= this.aByte74;
						}
					}
					this.aClass14_Sub29_4.anInt7264 += local216;
					if (this.aClass14_Sub29_4.anInt7264 >= local188) {
						if (this.aClass14_Sub3_Sub2_Sub1_1 == null) {
							this.aClass14_Sub29_4.anInt7264 = 0;
							local241 = this.aClass14_Sub29_4.method5866();
							local298 = this.aClass14_Sub29_4.method5900();
							@Pc(303) int local303 = this.aClass14_Sub29_4.method5866();
							@Pc(308) int local308 = this.aClass14_Sub29_4.method5878();
							@Pc(312) int local312 = local303 & 0x7F;
							@Pc(323) boolean local323 = (local303 & 0x80) != 0;
							@Pc(330) long local330 = (long) ((local241 << 16) + local298);
							@Pc(340) Class14_Sub3_Sub2_Sub1 local340;
							if (local323) {
								for (local340 = (Class14_Sub3_Sub2_Sub1) this.aClass73_7.method1826(); local340 != null && local340.aLong302 != local330; local340 = (Class14_Sub3_Sub2_Sub1) this.aClass73_7.method1827()) {
								}
							} else {
								for (local340 = (Class14_Sub3_Sub2_Sub1) this.aClass73_5.method1826(); local340 != null && local330 != local340.aLong302; local340 = (Class14_Sub3_Sub2_Sub1) this.aClass73_5.method1827()) {
								}
							}
							if (local340 == null) {
								throw new IOException();
							}
							@Pc(396) int local396 = local312 == 0 ? 5 : 9;
							this.aClass14_Sub3_Sub2_Sub1_1 = local340;
							this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6 = new Class14_Sub29(local396 + local308 + this.aClass14_Sub3_Sub2_Sub1_1.aByte87);
							this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.method5854(local312);
							this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.method5861(local308);
							this.aClass14_Sub3_Sub2_Sub1_1.anInt5370 = 8;
							this.aClass14_Sub29_4.anInt7264 = 0;
						} else if (this.aClass14_Sub3_Sub2_Sub1_1.anInt5370 != 0) {
							throw new IOException();
						} else if (this.aClass14_Sub29_4.aByteArray84[0] == -1) {
							this.aClass14_Sub29_4.anInt7264 = 0;
							this.aClass14_Sub3_Sub2_Sub1_1.anInt5370 = 1;
						} else {
							this.aClass14_Sub3_Sub2_Sub1_1 = null;
						}
					}
				} else {
					local216 = this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.aByteArray84.length - this.aClass14_Sub3_Sub2_Sub1_1.aByte87;
					local241 = 512 - this.aClass14_Sub3_Sub2_Sub1_1.anInt5370;
					if (local216 - this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.anInt7264 < local241) {
						local241 = local216 - this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.anInt7264;
					}
					if (local172 < local241) {
						local241 = local172;
					}
					this.aClass329_1.method7843(this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.anInt7264, local241, this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.aByteArray84);
					if (this.aByte74 != 0) {
						for (local298 = 0; local298 < local241; local298++) {
							this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.aByteArray84[this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.anInt7264 + local298] ^= this.aByte74;
						}
					}
					this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.anInt7264 += local241;
					this.aClass14_Sub3_Sub2_Sub1_1.anInt5370 += local241;
					if (local216 == this.aClass14_Sub3_Sub2_Sub1_1.aClass14_Sub29_6.anInt7264) {
						this.aClass14_Sub3_Sub2_Sub1_1.method9253();
						this.aClass14_Sub3_Sub2_Sub1_1.aBoolean494 = false;
						this.aClass14_Sub3_Sub2_Sub1_1 = null;
					} else if (this.aClass14_Sub3_Sub2_Sub1_1.anInt5370 == 512) {
						this.aClass14_Sub3_Sub2_Sub1_1.anInt5370 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.aClass329_1.method7842();
			} catch (@Pc(625) Exception local625) {
			}
			this.aClass329_1 = null;
			this.anInt3734 = -2;
			this.anInt3735++;
			return this.method3065() == 0 && this.method3062() == 0;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZLclient!sv;)V")
	public void method3068(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class329 arg1) {
		if (this.aClass329_1 != null) {
			try {
				this.aClass329_1.method7842();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass329_1 = null;
		}
		this.aClass329_1 = arg1;
		this.method3066();
		this.method3070(arg0);
		this.aClass14_Sub3_Sub2_Sub1_1 = null;
		this.aClass14_Sub29_4.anInt7264 = 0;
		while (true) {
			@Pc(46) Class14_Sub3_Sub2_Sub1 local46 = (Class14_Sub3_Sub2_Sub1) this.aClass73_5.method1823();
			if (local46 == null) {
				while (true) {
					local46 = (Class14_Sub3_Sub2_Sub1) this.aClass73_7.method1823();
					if (local46 == null) {
						if (this.aByte74 != 0) {
							try {
								this.aClass14_Sub29_3.anInt7264 = 0;
								this.aClass14_Sub29_3.method5854(4);
								this.aClass14_Sub29_3.method5854(this.aByte74);
								this.aClass14_Sub29_3.method5859(0);
								this.aClass329_1.method7846(this.aClass14_Sub29_3.aByteArray84, 4);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass329_1.method7842();
								} catch (@Pc(114) Exception local114) {
								}
								this.anInt3734 = -2;
								this.anInt3735++;
								this.aClass329_1 = null;
							}
						}
						this.anInt3733 = 0;
						this.aLong113 = Static521.method7499();
						return;
					}
					this.aClass73_6.method1816(local46);
				}
			}
			this.aClass73_4.method1816(local46);
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)Z")
	public boolean method3069() {
		return this.method3062() >= 20;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
	public void method3070(@OriginalArg(0) boolean arg0) {
		if (this.aClass329_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub29_3.anInt7264 = 0;
			this.aClass14_Sub29_3.method5854(arg0 ? 2 : 3);
			this.aClass14_Sub29_3.method5897(0);
			this.aClass329_1.method7846(this.aClass14_Sub29_3.aByteArray84, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass329_1.method7842();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt3735++;
			this.anInt3734 = -2;
			this.aClass329_1 = null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)Z")
	public boolean method3071() {
		return this.method3065() >= 20;
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
	public void method3072() {
		try {
			this.aClass329_1.method7842();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte74 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt3734 = -1;
		this.aClass329_1 = null;
		this.anInt3735++;
	}
}
